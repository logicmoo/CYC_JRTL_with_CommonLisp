package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import java.util.ArrayList;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class system_benchmarks
    extends
      SubLTranslatedFile
{
  public static final SubLFile me;
  public static final String myName = "com.cyc.cycjava.cycl.system_benchmarks";
  public static final String myFingerPrint = "cfa3c1b702cd92e784c22445da651aea17600497095eed9fdf972cd525951bce";
  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 1178L)
  private static SubLSymbol $cyclops_family_fix_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 1288L)
  private static SubLSymbol $cyclops_anect_fix_enabledP$;
  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 1617L)
  private static SubLSymbol $benchmark_cyclops_power$;
  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 1853L)
  private static SubLSymbol $benchmark_cyclops_ontology_root$;
  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 1998L)
  private static SubLSymbol $cyclops_throwaway_default$;
  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 15378L)
  public static SubLSymbol $cyclops_lockedP$;
  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 15496L)
  private static SubLSymbol $cyclops_lock$;
  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 22365L)
  private static SubLSymbol $cyclops_rule_expensiveness_threshold$;
  private static final SubLObject $const0$Individual;
  private static final SubLInteger $int1$33;
  private static final SubLSymbol $sym2$BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING;
  private static final SubLSymbol $sym3$NON_NEGATIVE_INTEGER_P;
  private static final SubLSymbol $kw4$LENIENT;
  private static final SubLSymbol $kw5$NONE;
  private static final SubLSymbol $sym6$QUEUE_P;
  private static final SubLString $str7$Mt_1;
  private static final SubLString $str8$Mt_2;
  private static final SubLObject $const9$isa;
  private static final SubLList $list10;
  private static final SubLObject $const11$BaseKB;
  private static final SubLList $list12;
  private static final SubLObject $const13$genlMt;
  private static final SubLString $str14$Creating_collection_ontology;
  private static final SubLInteger $int15$25;
  private static final SubLString $str16$Col_;
  private static final SubLList $list17;
  private static final SubLObject $const18$genls;
  private static final SubLString $str19$parent;
  private static final SubLList $list20;
  private static final SubLList $list21;
  private static final SubLObject $const22$arg1Isa;
  private static final SubLObject $const23$arg2Isa;
  private static final SubLString $str24$ancestor;
  private static final SubLList $list25;
  private static final SubLList $list26;
  private static final SubLList $list27;
  private static final SubLString $str28$sibling;
  private static final SubLList $list29;
  private static final SubLString $str30$family;
  private static final SubLList $list31;
  private static final SubLList $list32;
  private static final SubLObject $const33$genlPreds;
  private static final SubLSymbol $kw34$BACKWARD;
  private static final SubLSymbol $kw35$STRENGTH;
  private static final SubLSymbol $kw36$MONOTONIC;
  private static final SubLSymbol $kw37$DIRECTION;
  private static final SubLObject $const38$implies;
  private static final SubLObject $const39$and;
  private static final SubLList $list40;
  private static final SubLSymbol $sym41$_PARENT;
  private static final SubLList $list42;
  private static final SubLList $list43;
  private static final SubLList $list44;
  private static final SubLObject $const45$different;
  private static final SubLSymbol $sym46$_CHILD_1;
  private static final SubLSymbol $sym47$_CHILD_2;
  private static final SubLSymbol $sym48$_CYCLOPS_LOCKED__;
  private static final SubLSymbol $sym49$_CYCLOPS_LOCK_;
  private static final SubLString $str50$CycLOPs_lock;
  private static final SubLSymbol $sym51$PIF;
  private static final SubLSymbol $sym52$WITH_LOCK_HELD;
  private static final SubLList $list53;
  private static final SubLSymbol $sym54$PROGN;
  private static final SubLString $str55$Creating_terms;
  private static final SubLList $list56;
  private static final SubLSymbol $sym57$VECTOR;
  private static final SubLString $str58$Term_;
  private static final SubLString $str59$_;
  private static final SubLString $str60$Asserting_family_links;
  private static final SubLString $str61$Asserting_parent_links;
  private static final SubLSymbol $sym62$WARN;
  private static final SubLSymbol $sym63$ERROR;
  private static final SubLString $str64$Asking_parent_links;
  private static final SubLList $list65;
  private static final SubLString $str66$CycLOPs_error_asking_parent__S;
  private static final SubLString $str67$Asking_ancestor_links;
  private static final SubLList $list68;
  private static final SubLString $str69$CycLOPs_error__asking_ancestor__S;
  private static final SubLString $str70$Asking_sibling_links;
  private static final SubLList $list71;
  private static final SubLList $list72;
  private static final SubLString $str73$CycLOPs_error__asking_sibling__S_;
  private static final SubLSymbol $kw74$FORWARD;
  private static final SubLString $str75$CycLOPs_error__asking_sibling__S;
  private static final SubLString $str76$Killing_terms;
  private static final SubLString $str77$Killing_collections;
  private static final SubLString $str78$cdolist;
  private static final SubLSymbol $sym79$DOUBLE_FLOAT;
  private static final SubLString $str80$__CycLOPs_Benchmark_Results;
  private static final SubLString $str81$_________________________________;
  private static final SubLString $str82$__System__S__S_KB__S;
  private static final SubLString $str83$__Bogomips______S;
  private static final SubLString $str84$__Scaling_factor______S;
  private static final SubLString $str85$__Elapsed_time__seconds_______S;
  private static final SubLString $str86$__Efficiency__seconds_op_______S;
  private static final SubLString $str87$__CycLOPs______S;
  private static final SubLString $str88$__Bogomips_CycLOPs_______S;
  private static final SubLString $str89$__CycLOPs_Benchmark_Statistical_S;
  private static final SubLString $str90$__Raw_Data______S;
  private static final SubLSymbol $sym91$FOUR_SIGNIFICANT_DIGITS;
  private static final SubLString $str92$__Sorted_Data______S;
  private static final SubLSymbol $sym93$_;
  private static final SubLString $str94$__N______S;
  private static final SubLString $str95$__Min______S;
  private static final SubLString $str96$__Max______S;
  private static final SubLString $str97$__Median______S;
  private static final SubLString $str98$__Mean______S;
  private static final SubLString $str99$__Standard_Deviation______S;
  private static final SubLSymbol $kw100$AVERAGE_TIME_PER_RULE;
  private static final SubLSymbol $kw101$STDEV_TIME_PER_RULE;
  private static final SubLSymbol $kw102$RULE;
  private static final SubLSymbol $kw103$TIME;
  private static final SubLSymbol $kw104$INFERENCE_COUNT;
  private static final SubLSymbol $sym105$BENCHMARK_PARALLEL_CYCLOPS_COMPENSATING_FOR_PAGING;
  private static final SubLString $str106$___S____S;
  private static final SubLString $str107$__eff____S;
  private static final SubLSymbol $sym108$POSITIVE_INTEGER_P;
  private static final SubLString $str109$Parallel_CycLOPs;
  private static final SubLString $str110$Parallel_CycLOPs_thread_;
  private static final SubLSymbol $sym111$BENCHMARK_PARALLEL_CYCLOPS_GUTS_THREAD;
  private static final SubLString $str112$__Parallel_CycLOPs_Benchmark_Resu;
  private static final SubLString $str113$__Parallelism_________S;
  private static final SubLString $str114$__Parallel_CycLOPs_Benchmark_Stat;
  private static final SubLString $str115$Not_enough_terms_provided;
  private static final SubLString $str116$Asserting_;
  private static final SubLString $str117$_GAFs;
  private static final SubLString $str118$mAB_P_;
  private static final SubLObject $const119$UniversalVocabularyMt;
  private static final SubLString $str120$MAB_T_;
  private static final SubLString $str121$MAB_M_;
  private static final SubLSymbol $kw122$ASSUME_WFF_;
  private static final SubLSymbol $kw123$DISABLE_FORWARD_;
  private static final SubLSymbol $sym124$BENCHMARK_CYCLOPS_SAMPLE;
  private static final SubLList $list125;

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 2073L)
  public static SubLObject benchmark_cyclops_compensating_for_paging(SubLObject throwaway_n, SubLObject sample_n, SubLObject power, SubLObject stream)
  {
    if( throwaway_n == UNPROVIDED )
    {
      throwaway_n = $cyclops_throwaway_default$.getGlobalValue();
    }
    if( sample_n == UNPROVIDED )
    {
      sample_n = SEVEN_INTEGER;
    }
    if( power == UNPROVIDED )
    {
      power = $benchmark_cyclops_power$.getDynamicValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLObject total_n = Numbers.add( throwaway_n, sample_n );
    return median_cyclops( total_n, power, stream, throwaway_n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 2631L)
  public static SubLObject benchmark_cyclops_n_times(final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n)
  {
    if( power == UNPROVIDED )
    {
      power = $benchmark_cyclops_power$.getDynamicValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( throw_away_first_n == UNPROVIDED )
    {
      throw_away_first_n = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    assert NIL != subl_promotions.non_negative_integer_p( power ) : power;
    SubLObject values = NIL;
    final SubLObject _prev_bind_0 = wff_vars.$wff_mode$.currentBinding( thread );
    try
    {
      wff_vars.$wff_mode$.bind( $kw4$LENIENT, thread );
      thread.resetMultipleValues();
      final SubLObject mt_1 = benchmark_cyclops_setup();
      final SubLObject mt_2 = thread.secondMultipleValue();
      final SubLObject collections = thread.thirdMultipleValue();
      final SubLObject bottom_collection = thread.fourthMultipleValue();
      final SubLObject parent = thread.fifthMultipleValue();
      final SubLObject ancestor = thread.sixthMultipleValue();
      final SubLObject sibling = thread.seventhMultipleValue();
      final SubLObject family = thread.eighthMultipleValue();
      thread.resetMultipleValues();
      try
      {
        SubLObject i;
        SubLObject guts_time;
        SubLObject cyclops;
        for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          guts_time = benchmark_cyclops_guts( power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family );
          cyclops = benchmark_cyclops_compute_and_print_statistics( stream, power, guts_time );
          if( i.numGE( throw_away_first_n ) )
          {
            values = ConsesLow.cons( cyclops, values );
          }
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          benchmark_cyclops_teardown( mt_1, mt_2, collections, parent, ancestor, sibling, family );
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$1, thread );
        }
      }
    }
    finally
    {
      wff_vars.$wff_mode$.rebind( _prev_bind_0, thread );
    }
    values = Sequences.nreverse( values );
    if( n.numG( ONE_INTEGER ) )
    {
      benchmark_cyclops_print_statistical_summary( stream, values );
    }
    return values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 3869L)
  public static SubLObject benchmark_cyclops(SubLObject power, SubLObject stream)
  {
    if( power == UNPROVIDED )
    {
      power = $benchmark_cyclops_power$.getDynamicValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    assert NIL != subl_promotions.non_negative_integer_p( power ) : power;
    final SubLObject cyclops = benchmark_cyclops_n_times( ONE_INTEGER, power, stream, ZERO_INTEGER ).first();
    final SubLObject bogomips = misc_utilities.machine_bogomips();
    if( NIL != bogomips )
    {
      return Values.values( cyclops, Numbers.divide( bogomips, cyclops ) );
    }
    return cyclops;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 4279L)
  public static SubLObject median_cyclops(final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n)
  {
    if( power == UNPROVIDED )
    {
      power = $benchmark_cyclops_power$.getDynamicValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( throw_away_first_n == UNPROVIDED )
    {
      throw_away_first_n = ZERO_INTEGER;
    }
    final SubLObject cyclops = number_utilities.median( benchmark_cyclops_n_times( n, power, stream, throw_away_first_n ), UNPROVIDED, UNPROVIDED );
    final SubLObject bogomips = misc_utilities.machine_bogomips();
    if( NIL != bogomips )
    {
      return Values.values( cyclops, Numbers.divide( bogomips, cyclops ) );
    }
    return cyclops;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 4692L)
  public static SubLObject max_cyclops(final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n)
  {
    if( power == UNPROVIDED )
    {
      power = $benchmark_cyclops_power$.getDynamicValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( throw_away_first_n == UNPROVIDED )
    {
      throw_away_first_n = ZERO_INTEGER;
    }
    final SubLObject cyclops = number_utilities.maximum( benchmark_cyclops_n_times( n, power, stream, throw_away_first_n ), UNPROVIDED );
    final SubLObject bogomips = misc_utilities.machine_bogomips();
    if( NIL != bogomips )
    {
      return Values.values( cyclops, Numbers.divide( bogomips, cyclops ) );
    }
    return cyclops;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 5102L)
  public static SubLObject benchmark_cyclops_setup_and_teardown()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mt_1 = NIL;
    SubLObject mt_2 = NIL;
    SubLObject collections = NIL;
    SubLObject bottom_collection = NIL;
    SubLObject parent = NIL;
    SubLObject ancestor = NIL;
    SubLObject sibling = NIL;
    SubLObject family = NIL;
    try
    {
      thread.resetMultipleValues();
      final SubLObject mt_1_$2 = benchmark_cyclops_setup();
      final SubLObject mt_2_$3 = thread.secondMultipleValue();
      final SubLObject collections_$4 = thread.thirdMultipleValue();
      final SubLObject bottom_collection_$5 = thread.fourthMultipleValue();
      final SubLObject parent_$6 = thread.fifthMultipleValue();
      final SubLObject ancestor_$7 = thread.sixthMultipleValue();
      final SubLObject sibling_$8 = thread.seventhMultipleValue();
      final SubLObject family_$9 = thread.eighthMultipleValue();
      thread.resetMultipleValues();
      mt_1 = mt_1_$2;
      mt_2 = mt_2_$3;
      collections = collections_$4;
      bottom_collection = bottom_collection_$5;
      parent = parent_$6;
      ancestor = ancestor_$7;
      sibling = sibling_$8;
      family = family_$9;
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        benchmark_cyclops_teardown( mt_1, mt_2, collections, parent, ancestor, sibling, family );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 5673L)
  public static SubLObject benchmark_cyclops_setup()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject mt_1 = NIL;
    SubLObject mt_2 = NIL;
    SubLObject collections = NIL;
    SubLObject top_collection = NIL;
    SubLObject bottom_collection = NIL;
    SubLObject parent = NIL;
    SubLObject ancestor = NIL;
    SubLObject sibling = NIL;
    SubLObject family = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( T, thread );
      StreamsLow.$standard_output$.bind( StreamsLow.$null_output$.getDynamicValue( thread ), thread );
      thread.resetMultipleValues();
      final SubLObject mt_1_$10 = benchmark_cyclops_create_mts();
      final SubLObject mt_2_$11 = thread.secondMultipleValue();
      thread.resetMultipleValues();
      mt_1 = mt_1_$10;
      mt_2 = mt_2_$11;
      thread.resetMultipleValues();
      final SubLObject collections_$12 = benchmark_cyclops_create_ontology();
      final SubLObject top_collection_$13 = thread.secondMultipleValue();
      final SubLObject bottom_collection_$14 = thread.thirdMultipleValue();
      thread.resetMultipleValues();
      collections = collections_$12;
      top_collection = top_collection_$13;
      bottom_collection = bottom_collection_$14;
      parent = benchmark_cyclops_create_parent( top_collection );
      ancestor = benchmark_cyclops_create_ancestor( top_collection );
      sibling = benchmark_cyclops_create_sibling( top_collection );
      family = benchmark_cyclops_create_family( top_collection );
      benchmark_cyclops_define_predicates( parent, ancestor, sibling, family );
    }
    finally
    {
      StreamsLow.$standard_output$.rebind( _prev_bind_2, thread );
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return Values.values( mt_1, mt_2, collections, bottom_collection, parent, ancestor, sibling, family );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 6976L)
  public static SubLObject benchmark_cyclops_guts(final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor,
      final SubLObject sibling, final SubLObject family)
  {
    Storage.gc_ephemeral();
    SubLObject time = NIL;
    final SubLObject time_var = Time.get_internal_real_time();
    benchmark_cyclops_guts_int( ZERO_INTEGER, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family );
    time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    return time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 7365L)
  public static SubLObject benchmark_cyclops_guts_int(final SubLObject uniquifier, final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent,
      final SubLObject ancestor, final SubLObject sibling, final SubLObject family)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding( thread );
    final SubLObject _prev_bind_3 = backward_results.$inference_intermediate_step_validation_level$.currentBinding( thread );
    final SubLObject _prev_bind_4 = Types.$suspend_type_checkingP$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( T, thread );
      StreamsLow.$standard_output$.bind( StreamsLow.$null_output$.getDynamicValue( thread ), thread );
      backward_results.$inference_intermediate_step_validation_level$.bind( $kw5$NONE, thread );
      Types.$suspend_type_checkingP$.bind( T, thread );
      final SubLObject cprogv_var = utilities_macros.$fi_state_variables$.getGlobalValue();
      final ArrayList old_values = Dynamic.extract_dynamic_values( cprogv_var );
      try
      {
        Dynamic.bind_dynamic_vars( cprogv_var, ConsesLow.make_list( Sequences.length( utilities_macros.$fi_state_variables$.getGlobalValue() ), NIL ) );
        final SubLObject _prev_bind_0_$15 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding( thread );
        final SubLObject _prev_bind_1_$16 = control_vars.$prefer_forward_skolemization$.currentBinding( thread );
        try
        {
          kb_control_vars.$within_assertion_forward_propagationP$.bind( NIL, thread );
          control_vars.$prefer_forward_skolemization$.bind( NIL, thread );
          final SubLObject environment = forward.get_forward_inference_environment();
          assert NIL != queues.queue_p( environment ) : environment;
          final SubLObject _prev_bind_0_$16 = kb_control_vars.$forward_inference_environment$.currentBinding( thread );
          final SubLObject _prev_bind_1_$17 = utilities_macros.$current_forward_problem_store$.currentBinding( thread );
          try
          {
            kb_control_vars.$forward_inference_environment$.bind( environment, thread );
            utilities_macros.$current_forward_problem_store$.bind( NIL, thread );
            try
            {
              SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource( TEN_INTEGER );
              final SubLObject _prev_bind_0_$17 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding( thread );
              final SubLObject _prev_bind_1_$18 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding( thread );
              final SubLObject _prev_bind_2_$21 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding( thread );
              try
              {
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind( sbhl_ms_resource, thread );
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind( T, thread );
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind( sbhl_marking_vars.determine_marking_space_limit( sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread ) ), thread );
                try
                {
                  final SubLObject k = Numbers.subtract( Numbers.expt( TWO_INTEGER, power ), ONE_INTEGER );
                  SubLObject terms = NIL;
                  try
                  {
                    terms = benchmark_cyclops_create_terms( uniquifier, k, bottom_collection, mt_1 );
                    benchmark_cyclops_assert_family_links( uniquifier, k, terms, family, mt_1 );
                    benchmark_cyclops_assert_parent_links( k, terms, parent, mt_1 );
                    benchmark_cyclops_query_parent_links( k, terms, parent, mt_2 );
                    benchmark_cyclops_query_ancestor_links( k, terms, ancestor, mt_1 );
                    benchmark_cyclops_query_sibling_links_via_rule( k, terms, sibling, mt_2 );
                    benchmark_cyclops_forward_propagate_sibling_rule( uniquifier, parent, sibling, family );
                    benchmark_cyclops_turn_sibling_rule_backward( uniquifier, parent, sibling, family );
                    benchmark_cyclops_query_sibling_links_via_lookup( k, terms, sibling, mt_2 );
                  }
                  finally
                  {
                    final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                    try
                    {
                      Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                      final SubLObject _values = Values.getValuesAsVector();
                      benchmark_cyclops_kill_terms( k, terms );
                      Values.restoreValuesFromVector( _values );
                    }
                    finally
                    {
                      Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$18, thread );
                    }
                  }
                }
                finally
                {
                  final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
                  try
                  {
                    Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                    final SubLObject _values2 = Values.getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue( thread );
                    Values.restoreValuesFromVector( _values2 );
                  }
                  finally
                  {
                    Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$19, thread );
                  }
                }
              }
              finally
              {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind( _prev_bind_2_$21, thread );
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind( _prev_bind_1_$18, thread );
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind( _prev_bind_0_$17, thread );
              }
            }
            finally
            {
              final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
              try
              {
                Threads.$is_thread_performing_cleanupP$.bind( T, thread );
                final SubLObject _values3 = Values.getValuesAsVector();
                forward.clear_current_forward_problem_store();
                Values.restoreValuesFromVector( _values3 );
              }
              finally
              {
                Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$20, thread );
              }
            }
          }
          finally
          {
            utilities_macros.$current_forward_problem_store$.rebind( _prev_bind_1_$17, thread );
            kb_control_vars.$forward_inference_environment$.rebind( _prev_bind_0_$16, thread );
          }
        }
        finally
        {
          control_vars.$prefer_forward_skolemization$.rebind( _prev_bind_1_$16, thread );
          kb_control_vars.$within_assertion_forward_propagationP$.rebind( _prev_bind_0_$15, thread );
        }
      }
      finally
      {
        Dynamic.rebind_dynamic_vars( cprogv_var, old_values );
      }
    }
    finally
    {
      Types.$suspend_type_checkingP$.rebind( _prev_bind_4, thread );
      backward_results.$inference_intermediate_step_validation_level$.rebind( _prev_bind_3, thread );
      StreamsLow.$standard_output$.rebind( _prev_bind_2, thread );
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 9846L)
  public static SubLObject benchmark_cyclops_teardown(final SubLObject mt_1, final SubLObject mt_2, final SubLObject collections, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling,
      final SubLObject family)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding( thread );
    try
    {
      utilities_macros.$silent_progressP$.bind( T, thread );
      StreamsLow.$standard_output$.bind( StreamsLow.$null_output$.getDynamicValue( thread ), thread );
      benchmark_cyclops_kill_vocabulary( mt_1, mt_2, collections, parent, ancestor, sibling, family );
    }
    finally
    {
      StreamsLow.$standard_output$.rebind( _prev_bind_2, thread );
      utilities_macros.$silent_progressP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 10134L)
  public static SubLObject benchmark_cyclops_compute_and_print_statistics(final SubLObject stream, final SubLObject power, final SubLObject guts_time)
  {
    final SubLObject k = Numbers.subtract( Numbers.expt( TWO_INTEGER, power ), ONE_INTEGER );
    final SubLObject efficiency = Numbers.divide( guts_time, k );
    final SubLObject cyclops = Numbers.invert( efficiency );
    final SubLObject bogomips = misc_utilities.machine_bogomips();
    benchmark_cyclops_print_statistics( stream, bogomips, k, guts_time, efficiency, cyclops );
    return cyclops;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 10461L)
  public static SubLObject benchmark_cyclops_create_mts()
  {
    SubLObject mt_1 = NIL;
    SubLObject mt_2 = NIL;
    mt_1 = cyc_kernel.cyc_create_new_ephemeral( $str7$Mt_1 );
    mt_2 = cyc_kernel.cyc_create_new_ephemeral( $str8$Mt_2 );
    cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, mt_1, $list10 ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, mt_2, $list10 ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const13$genlMt, mt_2, mt_1 ), $const11$BaseKB, $list12 );
    return Values.values( mt_1, mt_2 );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 10998L)
  public static SubLObject benchmark_cyclops_create_ontology()
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject collections = NIL;
    SubLObject top_collection = NIL;
    SubLObject bottom_collection = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str14$Creating_collection_ontology, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( $int15$25, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject collection;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          collection = cyc_kernel.cyc_create_new_ephemeral( Sequences.cconcatenate( $str16$Col_, format_nil.format_nil_a_no_copy( i ) ) );
          collections = ConsesLow.cons( collection, collections );
          cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, collection, $list17 ), $const11$BaseKB, $list12 );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$25, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    SubLObject previous = $benchmark_cyclops_ontology_root$.getDynamicValue( thread );
    SubLObject cdolist_list_var = collections;
    SubLObject collection2 = NIL;
    collection2 = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      cyc_kernel.cyc_assert_wff( ConsesLow.list( $const18$genls, collection2, previous ), $const11$BaseKB, $list12 );
      previous = collection2;
      cdolist_list_var = cdolist_list_var.rest();
      collection2 = cdolist_list_var.first();
    }
    top_collection = collections.first();
    bottom_collection = conses_high.last( collections, UNPROVIDED ).first();
    return Values.values( collections, top_collection, bottom_collection );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 11798L)
  public static SubLObject benchmark_cyclops_create_parent(final SubLObject top_collection)
  {
    final SubLObject parent = cyc_kernel.cyc_create_new_ephemeral( $str19$parent );
    cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, parent, $list20 ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, parent, $list21 ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const22$arg1Isa, parent, top_collection ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const23$arg2Isa, parent, top_collection ), $const11$BaseKB, $list12 );
    return parent;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 12400L)
  public static SubLObject benchmark_cyclops_create_ancestor(final SubLObject top_collection)
  {
    final SubLObject ancestor = cyc_kernel.cyc_create_new_ephemeral( $str24$ancestor );
    cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, ancestor, $list25 ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, ancestor, $list26 ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, ancestor, $list27 ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const22$arg1Isa, ancestor, top_collection ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const23$arg2Isa, ancestor, top_collection ), $const11$BaseKB, $list12 );
    return ancestor;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 13146L)
  public static SubLObject benchmark_cyclops_create_sibling(final SubLObject top_collection)
  {
    final SubLObject sibling = cyc_kernel.cyc_create_new_ephemeral( $str28$sibling );
    cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, sibling, $list20 ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, sibling, $list29 ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const22$arg1Isa, sibling, top_collection ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const23$arg2Isa, sibling, top_collection ), $const11$BaseKB, $list12 );
    return sibling;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 13756L)
  public static SubLObject benchmark_cyclops_create_family(final SubLObject top_collection)
  {
    final SubLObject family = cyc_kernel.cyc_create_new_ephemeral( $str30$family );
    cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, family, $list31 ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const22$arg1Isa, family, top_collection ), $const11$BaseKB, $list12 );
    cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const23$arg2Isa, family, $list32 ), $const11$BaseKB, $list12 );
    return family;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 14227L)
  public static SubLObject benchmark_cyclops_define_predicates(final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family)
  {
    cyc_kernel.cyc_assert_wff( ConsesLow.list( $const33$genlPreds, parent, ancestor ), $const11$BaseKB, $list12 );
    benchmark_cyclops_assert_sibling_rule( MINUS_ONE_INTEGER, parent, sibling, family, $kw34$BACKWARD );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 14611L)
  public static SubLObject benchmark_cyclops_assert_sibling_rule(final SubLObject uniquifier, final SubLObject parent, final SubLObject sibling, final SubLObject family, final SubLObject direction)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject v_properties = ConsesLow.list( $kw35$STRENGTH, $kw36$MONOTONIC, $kw37$DIRECTION, direction );
    SubLObject sentence = NIL;
    if( NIL != $cyclops_family_fix_enabledP$.getDynamicValue( thread ) && !uniquifier.isNegative() )
    {
      sentence = ConsesLow.list( $const38$implies, ConsesLow.list( $const39$and, $list40, ConsesLow.list( family, $sym41$_PARENT, uniquifier ), reader.bq_cons( parent, $list42 ), reader.bq_cons( parent, $list43 ) ),
          reader.bq_cons( sibling, $list44 ) );
    }
    else
    {
      sentence = ConsesLow.list( $const38$implies, ConsesLow.list( $const39$and, ConsesLow.list( $const45$different, $sym46$_CHILD_1, $sym47$_CHILD_2, uniquifier ), reader.bq_cons( parent, $list42 ), reader.bq_cons(
          parent, $list43 ) ), reader.bq_cons( sibling, $list44 ) );
    }
    return cyc_kernel.cyc_assert_wff( sentence, $const11$BaseKB, v_properties );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 15656L)
  public static SubLObject with_cyclops_lock(final SubLObject macroform, final SubLObject environment)
  {
    final SubLObject datum = macroform.rest();
    final SubLObject body;
    final SubLObject current = body = datum;
    return ConsesLow.list( $sym51$PIF, $sym48$_CYCLOPS_LOCKED__, ConsesLow.listS( $sym52$WITH_LOCK_HELD, $list53, ConsesLow.append( body, NIL ) ), reader.bq_cons( $sym54$PROGN, ConsesLow.append( body, NIL ) ) );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 15824L)
  public static SubLObject benchmark_cyclops_create_terms(final SubLObject uniquifier, final SubLObject k, final SubLObject bottom_collection, SubLObject mt_1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == $cyclops_anect_fix_enabledP$.getDynamicValue( thread ) )
    {
      mt_1 = $const11$BaseKB;
    }
    SubLObject terms = NIL;
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str55$Creating_terms, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( k, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject v_term;
        SubLObject release;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          v_term = benchmark_cyclops_create_term( uniquifier, i );
          terms = ConsesLow.cons( v_term, terms );
          if( NIL != $cyclops_anect_fix_enabledP$.getDynamicValue( thread ) )
          {
            if( NIL != $cyclops_lockedP$.getDynamicValue( thread ) )
            {
              release = NIL;
              try
              {
                release = Locks.seize_lock( $cyclops_lock$.getGlobalValue() );
                cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, v_term, $list56 ), $const11$BaseKB, $list12 );
              }
              finally
              {
                if( NIL != release )
                {
                  Locks.release_lock( $cyclops_lock$.getGlobalValue() );
                }
              }
            }
            else
            {
              cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, v_term, $list56 ), $const11$BaseKB, $list12 );
            }
          }
          if( NIL != $cyclops_lockedP$.getDynamicValue( thread ) )
          {
            release = NIL;
            try
            {
              release = Locks.seize_lock( $cyclops_lock$.getGlobalValue() );
              cyc_kernel.cyc_assert_wff( ConsesLow.list( $const9$isa, v_term, bottom_collection ), mt_1, $list12 );
            }
            finally
            {
              if( NIL != release )
              {
                Locks.release_lock( $cyclops_lock$.getGlobalValue() );
              }
            }
          }
          else
          {
            cyc_kernel.cyc_assert_wff( ConsesLow.list( $const9$isa, v_term, bottom_collection ), mt_1, $list12 );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$26, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    terms = Functions.apply( Symbols.symbol_function( $sym57$VECTOR ), Sequences.nreverse( terms ) );
    return terms;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 16567L)
  public static SubLObject benchmark_cyclops_create_term(final SubLObject uniquifier, final SubLObject index)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject v_term = NIL;
    if( NIL != $cyclops_lockedP$.getDynamicValue( thread ) )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $cyclops_lock$.getGlobalValue() );
        v_term = cyc_kernel.cyc_create_new_ephemeral( Sequences.cconcatenate( $str58$Term_, new SubLObject[] { format_nil.format_nil_a_no_copy( uniquifier ), $str59$_, format_nil.format_nil_a_no_copy( index )
        } ) );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $cyclops_lock$.getGlobalValue() );
        }
      }
    }
    else
    {
      v_term = cyc_kernel.cyc_create_new_ephemeral( Sequences.cconcatenate( $str58$Term_, new SubLObject[] { format_nil.format_nil_a_no_copy( uniquifier ), $str59$_, format_nil.format_nil_a_no_copy( index )
      } ) );
    }
    return v_term;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 16778L)
  public static SubLObject benchmark_cyclops_assert_family_links(final SubLObject uniquifier, final SubLObject k, final SubLObject terms, final SubLObject family, final SubLObject mt_1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str60$Asserting_family_links, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( k, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject release;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          if( NIL != $cyclops_lockedP$.getDynamicValue( thread ) )
          {
            release = NIL;
            try
            {
              release = Locks.seize_lock( $cyclops_lock$.getGlobalValue() );
              cyc_kernel.cyc_assert_wff( ConsesLow.list( family, Vectors.aref( terms, i ), uniquifier ), mt_1, $list12 );
            }
            finally
            {
              if( NIL != release )
              {
                Locks.release_lock( $cyclops_lock$.getGlobalValue() );
              }
            }
          }
          else
          {
            cyc_kernel.cyc_assert_wff( ConsesLow.list( family, Vectors.aref( terms, i ), uniquifier ), mt_1, $list12 );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$27, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 17081L)
  public static SubLObject benchmark_cyclops_assert_parent_links(final SubLObject k, final SubLObject terms, final SubLObject parent, final SubLObject mt_1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str61$Asserting_parent_links, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( k, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject release;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          if( !i.numE( ZERO_INTEGER ) )
          {
            if( NIL != $cyclops_lockedP$.getDynamicValue( thread ) )
            {
              release = NIL;
              try
              {
                release = Locks.seize_lock( $cyclops_lock$.getGlobalValue() );
                cyc_kernel.cyc_assert_wff( ConsesLow.list( parent, Vectors.aref( terms, i ), Vectors.aref( terms, Numbers.integerDivide( Numbers.subtract( i, ONE_INTEGER ), TWO_INTEGER ) ) ), mt_1, $list12 );
              }
              finally
              {
                if( NIL != release )
                {
                  Locks.release_lock( $cyclops_lock$.getGlobalValue() );
                }
              }
            }
            else
            {
              cyc_kernel.cyc_assert_wff( ConsesLow.list( parent, Vectors.aref( terms, i ), Vectors.aref( terms, Numbers.integerDivide( Numbers.subtract( i, ONE_INTEGER ), TWO_INTEGER ) ) ), mt_1, $list12 );
            }
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$28, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 17405L)
  public static SubLObject benchmark_cyclops_query(final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject error_spec)
  {
    SubLObject result = inference_kernel.new_cyc_query( sentence, mt, v_properties );
    if( NIL != result )
    {
      return result;
    }
    Functions.apply( Symbols.symbol_function( $sym62$WARN ), error_spec );
    result = inference_kernel.new_cyc_query( sentence, mt, v_properties );
    if( NIL != result )
    {
      return result;
    }
    Functions.apply( Symbols.symbol_function( $sym63$ERROR ), error_spec );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 17738L)
  public static SubLObject benchmark_cyclops_query_parent_links(final SubLObject k, final SubLObject terms, final SubLObject parent, final SubLObject mt_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str64$Asking_parent_links, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( k, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject sentence;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          if( !i.numE( ZERO_INTEGER ) )
          {
            sentence = ConsesLow.listS( parent, Vectors.aref( terms, i ), $list65 );
            benchmark_cyclops_query( sentence, mt_2, NIL, ConsesLow.list( $str66$CycLOPs_error_asking_parent__S, i ) );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$29, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 18055L)
  public static SubLObject benchmark_cyclops_query_ancestor_links(final SubLObject k, final SubLObject terms, final SubLObject ancestor, final SubLObject mt_1)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str67$Asking_ancestor_links, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( k, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject sentence;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          if( !i.numE( ZERO_INTEGER ) )
          {
            sentence = ConsesLow.list( $const39$and, ConsesLow.listS( ancestor, Vectors.aref( terms, i ), $list68 ), ConsesLow.listS( $const45$different, Vectors.aref( terms, i ), $list68 ) );
            benchmark_cyclops_query( sentence, mt_1, NIL, ConsesLow.list( $str69$CycLOPs_error__asking_ancestor__S, i ) );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$30, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 18438L)
  public static SubLObject benchmark_cyclops_query_sibling_links_via_rule(final SubLObject k, final SubLObject terms, final SubLObject sibling, final SubLObject mt_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str70$Asking_sibling_links, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( k, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject sentence;
        SubLObject v_properties;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          if( !i.numE( ZERO_INTEGER ) )
          {
            sentence = ConsesLow.listS( sibling, Vectors.aref( terms, i ), $list71 );
            v_properties = $list72;
            benchmark_cyclops_query( sentence, mt_2, v_properties, ConsesLow.list( $str73$CycLOPs_error__asking_sibling__S_, i ) );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$31, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 18843L)
  public static SubLObject benchmark_cyclops_forward_propagate_sibling_rule(final SubLObject uniquifier, final SubLObject parent, final SubLObject sibling, final SubLObject family)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $cyclops_lockedP$.getDynamicValue( thread ) )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $cyclops_lock$.getGlobalValue() );
        benchmark_cyclops_assert_sibling_rule( uniquifier, parent, sibling, family, $kw74$FORWARD );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $cyclops_lock$.getGlobalValue() );
        }
      }
    }
    else
    {
      benchmark_cyclops_assert_sibling_rule( uniquifier, parent, sibling, family, $kw74$FORWARD );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 19124L)
  public static SubLObject benchmark_cyclops_turn_sibling_rule_backward(final SubLObject uniquifier, final SubLObject parent, final SubLObject sibling, final SubLObject family)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL != $cyclops_lockedP$.getDynamicValue( thread ) )
    {
      SubLObject release = NIL;
      try
      {
        release = Locks.seize_lock( $cyclops_lock$.getGlobalValue() );
        benchmark_cyclops_assert_sibling_rule( uniquifier, parent, sibling, family, $kw34$BACKWARD );
      }
      finally
      {
        if( NIL != release )
        {
          Locks.release_lock( $cyclops_lock$.getGlobalValue() );
        }
      }
    }
    else
    {
      benchmark_cyclops_assert_sibling_rule( uniquifier, parent, sibling, family, $kw34$BACKWARD );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 19399L)
  public static SubLObject benchmark_cyclops_query_sibling_links_via_lookup(final SubLObject k, final SubLObject terms, final SubLObject sibling, final SubLObject mt_2)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str70$Asking_sibling_links, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( k, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject sentence;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          if( !i.numE( ZERO_INTEGER ) )
          {
            sentence = ConsesLow.listS( sibling, Vectors.aref( terms, i ), $list71 );
            benchmark_cyclops_query( sentence, mt_2, NIL, ConsesLow.list( $str75$CycLOPs_error__asking_sibling__S, i ) );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$32, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 19735L)
  public static SubLObject benchmark_cyclops_kill_terms(final SubLObject k, final SubLObject terms)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str76$Killing_terms, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( k, thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject i;
        SubLObject release;
        for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
        {
          if( NIL != $cyclops_lockedP$.getDynamicValue( thread ) )
          {
            release = NIL;
            try
            {
              release = Locks.seize_lock( $cyclops_lock$.getGlobalValue() );
              cyc_kernel.cyc_kill( Vectors.aref( terms, i ) );
            }
            finally
            {
              if( NIL != release )
              {
                Locks.release_lock( $cyclops_lock$.getGlobalValue() );
              }
            }
          }
          else
          {
            cyc_kernel.cyc_kill( Vectors.aref( terms, i ) );
          }
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$33, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 19939L)
  public static SubLObject benchmark_cyclops_kill_vocabulary(final SubLObject mt_1, final SubLObject mt_2, final SubLObject collections, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling,
      final SubLObject family)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
    final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
    final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
    try
    {
      utilities_macros.$progress_note$.bind( $str77$Killing_collections, thread );
      utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
      utilities_macros.$progress_total$.bind( Sequences.length( collections ), thread );
      utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
      utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
      utilities_macros.$within_noting_percent_progress$.bind( T, thread );
      utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
      try
      {
        utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
        SubLObject csome_list_var = collections;
        SubLObject col = NIL;
        col = csome_list_var.first();
        while ( NIL != csome_list_var)
        {
          cyc_kernel.cyc_kill( col );
          utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
          utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          csome_list_var = csome_list_var.rest();
          col = csome_list_var.first();
        }
      }
      finally
      {
        final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
        try
        {
          Threads.$is_thread_performing_cleanupP$.bind( T, thread );
          final SubLObject _values = Values.getValuesAsVector();
          utilities_macros.noting_percent_progress_postamble();
          Values.restoreValuesFromVector( _values );
        }
        finally
        {
          Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$34, thread );
        }
      }
    }
    finally
    {
      utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
      utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
      utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
      utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
      utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
      utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
      utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
      utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
    }
    cyc_kernel.cyc_kill( family );
    cyc_kernel.cyc_kill( sibling );
    cyc_kernel.cyc_kill( ancestor );
    cyc_kernel.cyc_kill( parent );
    cyc_kernel.cyc_kill( mt_2 );
    cyc_kernel.cyc_kill( mt_1 );
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 20292L)
  public static SubLObject benchmark_cyclops_print_statistics(final SubLObject stream, final SubLObject bogomips, final SubLObject k, final SubLObject guts_time, final SubLObject efficiency, final SubLObject cyclops)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
    try
    {
      reader.$read_default_float_format$.bind( $sym79$DOUBLE_FLOAT, thread );
      PrintLow.format( stream, $str80$__CycLOPs_Benchmark_Results );
      PrintLow.format( stream, $str81$_________________________________ );
      PrintLow.format( stream, $str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), control_vars.kb_loaded()
      } );
      if( NIL != bogomips )
      {
        PrintLow.format( stream, $str83$__Bogomips______S, bogomips );
      }
      PrintLow.format( stream, $str84$__Scaling_factor______S, k );
      PrintLow.format( stream, $str85$__Elapsed_time__seconds_______S, number_utilities.significant_digits( guts_time, FOUR_INTEGER ) );
      PrintLow.format( stream, $str86$__Efficiency__seconds_op_______S, number_utilities.significant_digits( efficiency, FOUR_INTEGER ) );
      PrintLow.format( stream, $str87$__CycLOPs______S, number_utilities.significant_digits( cyclops, FOUR_INTEGER ) );
      if( NIL != bogomips )
      {
        PrintLow.format( stream, $str88$__Bogomips_CycLOPs_______S, number_utilities.significant_digits( Numbers.divide( bogomips, cyclops ), FOUR_INTEGER ) );
      }
      streams_high.terpri( stream );
      streams_high.force_output( stream );
    }
    finally
    {
      reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 21240L)
  public static SubLObject benchmark_cyclops_print_statistical_summary(final SubLObject stream, final SubLObject values)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
    try
    {
      reader.$read_default_float_format$.bind( $sym79$DOUBLE_FLOAT, thread );
      PrintLow.format( stream, $str89$__CycLOPs_Benchmark_Statistical_S );
      PrintLow.format( stream, $str81$_________________________________ );
      PrintLow.format( stream, $str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), control_vars.kb_loaded()
      } );
      PrintLow.format( stream, $str90$__Raw_Data______S, Mapping.mapcar( $sym91$FOUR_SIGNIFICANT_DIGITS, values ) );
      PrintLow.format( stream, $str92$__Sorted_Data______S, Mapping.mapcar( $sym91$FOUR_SIGNIFICANT_DIGITS, Sort.sort( conses_high.copy_list( values ), Symbols.symbol_function( $sym93$_ ), UNPROVIDED ) ) );
      PrintLow.format( stream, $str94$__N______S, Sequences.length( values ) );
      PrintLow.format( stream, $str95$__Min______S, number_utilities.four_significant_digits( number_utilities.minimum( values, UNPROVIDED ) ) );
      PrintLow.format( stream, $str96$__Max______S, number_utilities.four_significant_digits( number_utilities.maximum( values, UNPROVIDED ) ) );
      PrintLow.format( stream, $str97$__Median______S, number_utilities.four_significant_digits( number_utilities.median( values, UNPROVIDED, UNPROVIDED ) ) );
      PrintLow.format( stream, $str98$__Mean______S, number_utilities.four_significant_digits( number_utilities.mean( values ) ) );
      PrintLow.format( stream, $str99$__Standard_Deviation______S, number_utilities.four_significant_digits( number_utilities.standard_deviation( values ) ) );
      streams_high.terpri( stream );
      streams_high.force_output( stream );
    }
    finally
    {
      reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 22521L)
  public static SubLObject expensive_cyclops_rules(SubLObject threshold)
  {
    if( threshold == UNPROVIDED )
    {
      threshold = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    benchmark_cyclops_compensating_for_paging( THREE_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED );
    final SubLObject rules_one = expensive_cyclops_rules_int( threshold, $cyclops_rule_expensiveness_threshold$.getDynamicValue( thread ) );
    final SubLObject rules_two = expensive_cyclops_rules_int( threshold, $cyclops_rule_expensiveness_threshold$.getDynamicValue( thread ) );
    return keyhash_utilities.fast_intersection( rules_one, rules_two, UNPROVIDED, UNPROVIDED, UNPROVIDED );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 22970L)
  public static SubLObject expensive_cyclops_rules_int(final SubLObject threshold, final SubLObject stdev_threshold)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject result = NIL;
    inference_metrics.clear_forward_inference_metrics();
    final SubLObject _prev_bind_0 = inference_metrics.$gathering_forward_inference_metricsP$.currentBinding( thread );
    final SubLObject _prev_bind_2 = control_vars.$browse_forward_inferencesP$.currentBinding( thread );
    try
    {
      inference_metrics.$gathering_forward_inference_metricsP$.bind( T, thread );
      control_vars.$browse_forward_inferencesP$.bind( NIL, thread );
      benchmark_cyclops_compensating_for_paging( ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED );
      inference_metrics.finalize_forward_inference_metrics_inference_index();
    }
    finally
    {
      control_vars.$browse_forward_inferencesP$.rebind( _prev_bind_2, thread );
      inference_metrics.$gathering_forward_inference_metricsP$.rebind( _prev_bind_0, thread );
    }
    final SubLObject info = inference_metrics.forward_inference_metrics_info( threshold );
    final SubLObject global_statistics = inference_metrics.global_statistics_from_forward_inference_metrics_info( info );
    final SubLObject current;
    final SubLObject datum = current = global_statistics;
    final SubLObject average_time_per_rule_tail = cdestructuring_bind.property_list_member( $kw100$AVERAGE_TIME_PER_RULE, current );
    final SubLObject average_time_per_rule = ( NIL != average_time_per_rule_tail ) ? conses_high.cadr( average_time_per_rule_tail ) : NIL;
    final SubLObject stdev_time_per_rule_tail = cdestructuring_bind.property_list_member( $kw101$STDEV_TIME_PER_RULE, current );
    final SubLObject stdev_time_per_rule = ( NIL != stdev_time_per_rule_tail ) ? conses_high.cadr( stdev_time_per_rule_tail ) : NIL;
    SubLObject cdolist_list_var = info;
    SubLObject rule_info = NIL;
    rule_info = cdolist_list_var.first();
    while ( NIL != cdolist_list_var)
    {
      final SubLObject current_$36;
      final SubLObject datum_$35 = current_$36 = rule_info;
      final SubLObject rule_tail = cdestructuring_bind.property_list_member( $kw102$RULE, current_$36 );
      final SubLObject rule = ( NIL != rule_tail ) ? conses_high.cadr( rule_tail ) : NIL;
      final SubLObject time_tail = cdestructuring_bind.property_list_member( $kw103$TIME, current_$36 );
      final SubLObject time = ( NIL != time_tail ) ? conses_high.cadr( time_tail ) : NIL;
      final SubLObject inference_count_tail = cdestructuring_bind.property_list_member( $kw104$INFERENCE_COUNT, current_$36 );
      final SubLObject inference_count = ( NIL != inference_count_tail ) ? conses_high.cadr( inference_count_tail ) : NIL;
      if( inference_count.isPositive() )
      {
        final SubLObject stdevs = number_utilities.standard_deviations_above_mean( time, average_time_per_rule, stdev_time_per_rule );
        if( stdevs.numG( stdev_threshold ) )
        {
          result = ConsesLow.cons( rule, result );
        }
      }
      cdolist_list_var = cdolist_list_var.rest();
      rule_info = cdolist_list_var.first();
    }
    return Sequences.nreverse( result );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 23873L)
  public static SubLObject benchmark_parallel_cyclops_compensating_for_paging(SubLObject parallel_n, SubLObject throwaway_n, SubLObject sample_n, SubLObject power, SubLObject stream)
  {
    if( parallel_n == UNPROVIDED )
    {
      parallel_n = TWO_INTEGER;
    }
    if( throwaway_n == UNPROVIDED )
    {
      throwaway_n = $cyclops_throwaway_default$.getGlobalValue();
    }
    if( sample_n == UNPROVIDED )
    {
      sample_n = SEVEN_INTEGER;
    }
    if( power == UNPROVIDED )
    {
      power = $benchmark_cyclops_power$.getDynamicValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLObject total_n = Numbers.add( throwaway_n, sample_n );
    return median_parallel_cyclops( parallel_n, total_n, power, stream, throwaway_n );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 24763L)
  public static SubLObject benchmark_parallel_cyclops_efficiency(final SubLObject max_parallel_n, SubLObject throwaway_n, SubLObject sample_n, SubLObject stream)
  {
    if( throwaway_n == UNPROVIDED )
    {
      throwaway_n = $cyclops_throwaway_default$.getGlobalValue();
    }
    if( sample_n == UNPROVIDED )
    {
      sample_n = SEVEN_INTEGER;
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    SubLObject raw_results = NIL;
    SubLObject end_var;
    SubLObject parallel_n;
    SubLObject raw_result;
    SubLObject efficiency;
    for( end_var = number_utilities.f_1X( max_parallel_n ), parallel_n = NIL, parallel_n = ONE_INTEGER; !parallel_n.numGE( end_var ); parallel_n = number_utilities.f_1X( parallel_n ) )
    {
      raw_result = benchmark_parallel_cyclops_compensating_for_paging( parallel_n, throwaway_n, sample_n, $benchmark_cyclops_power$.getDynamicValue( thread ), StreamsLow.$null_output$.getDynamicValue( thread ) );
      PrintLow.format( stream, $str106$___S____S, parallel_n, number_utilities.four_significant_digits( raw_result ) );
      raw_results = ConsesLow.cons( raw_result, raw_results );
      efficiency = Numbers.divide( raw_result, Numbers.divide( conses_high.last( raw_results, UNPROVIDED ).first(), parallel_n ) );
      PrintLow.format( stream, $str107$__eff____S, number_utilities.four_significant_digits( efficiency ) );
      streams_high.force_output( stream );
    }
    streams_high.terpri( stream );
    return Sequences.nreverse( raw_results );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 25535L)
  public static SubLObject median_parallel_cyclops(final SubLObject parallel, final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n)
  {
    if( power == UNPROVIDED )
    {
      power = $benchmark_cyclops_power$.getDynamicValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( throw_away_first_n == UNPROVIDED )
    {
      throw_away_first_n = ZERO_INTEGER;
    }
    final SubLObject cyclops = number_utilities.median( benchmark_parallel_cyclops_n_times( parallel, n, power, stream, throw_away_first_n ), UNPROVIDED, UNPROVIDED );
    final SubLObject bogomips = misc_utilities.machine_bogomips();
    if( NIL != bogomips )
    {
      return Values.values( cyclops, Numbers.divide( bogomips, cyclops ) );
    }
    return cyclops;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 26074L)
  public static SubLObject benchmark_parallel_cyclops_n_times(final SubLObject parallel, final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n)
  {
    if( power == UNPROVIDED )
    {
      power = $benchmark_cyclops_power$.getDynamicValue();
    }
    if( stream == UNPROVIDED )
    {
      stream = StreamsLow.$standard_output$.getDynamicValue();
    }
    if( throw_away_first_n == UNPROVIDED )
    {
      throw_away_first_n = ZERO_INTEGER;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    assert NIL != subl_promotions.positive_integer_p( parallel ) : parallel;
    assert NIL != subl_promotions.non_negative_integer_p( n ) : n;
    assert NIL != subl_promotions.non_negative_integer_p( power ) : power;
    SubLObject values = NIL;
    thread.resetMultipleValues();
    final SubLObject mt_1 = benchmark_cyclops_setup();
    final SubLObject mt_2 = thread.secondMultipleValue();
    final SubLObject collections = thread.thirdMultipleValue();
    final SubLObject bottom_collection = thread.fourthMultipleValue();
    final SubLObject parent = thread.fifthMultipleValue();
    final SubLObject ancestor = thread.sixthMultipleValue();
    final SubLObject sibling = thread.seventhMultipleValue();
    final SubLObject family = thread.eighthMultipleValue();
    thread.resetMultipleValues();
    try
    {
      SubLObject i;
      SubLObject guts_time;
      SubLObject cyclops;
      for( i = NIL, i = ZERO_INTEGER; i.numL( n ); i = Numbers.add( i, ONE_INTEGER ) )
      {
        guts_time = benchmark_parallel_cyclops_guts( parallel, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family );
        cyclops = benchmark_parallel_cyclops_compute_and_print_statistics( stream, parallel, power, guts_time );
        if( i.numGE( throw_away_first_n ) )
        {
          values = ConsesLow.cons( cyclops, values );
        }
      }
    }
    finally
    {
      final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values = Values.getValuesAsVector();
        benchmark_cyclops_teardown( mt_1, mt_2, collections, parent, ancestor, sibling, family );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0, thread );
      }
    }
    values = Sequences.nreverse( values );
    if( n.numG( ONE_INTEGER ) )
    {
      benchmark_parallel_cyclops_print_statistical_summary( stream, parallel, values );
    }
    return values;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 27315L)
  public static SubLObject benchmark_parallel_cyclops_guts(final SubLObject parallel, final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent,
      final SubLObject ancestor, final SubLObject sibling, final SubLObject family)
  {
    Storage.gc_ephemeral();
    SubLObject time = NIL;
    final SubLObject time_var = Time.get_internal_real_time();
    final SubLObject semaphore = Semaphores.new_semaphore( $str109$Parallel_CycLOPs, ZERO_INTEGER );
    SubLObject i;
    SubLObject thread_name;
    for( i = NIL, i = ZERO_INTEGER; i.numL( parallel ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      thread_name = Sequences.cconcatenate( $str110$Parallel_CycLOPs_thread_, format_nil.format_nil_a_no_copy( i ) );
      subl_promotions.make_process_with_args( thread_name, $sym111$BENCHMARK_PARALLEL_CYCLOPS_GUTS_THREAD, ConsesLow.list( new SubLObject[] { i, semaphore, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling,
        family
      } ) );
    }
    for( i = NIL, i = ZERO_INTEGER; i.numL( parallel ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      Semaphores.semaphore_wait( semaphore );
    }
    time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    return time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 28078L)
  public static SubLObject benchmark_parallel_cyclops_guts_thread(final SubLObject thread_number, final SubLObject semaphore, final SubLObject power, final SubLObject mt_1, final SubLObject mt_2,
      final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family)
  {
    try
    {
      benchmark_cyclops_guts_int( thread_number, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family );
    }
    finally
    {
      final SubLObject _prev_bind_0 = Dynamic.currentBinding( Threads.$is_thread_performing_cleanupP$ );
      try
      {
        Dynamic.bind( Threads.$is_thread_performing_cleanupP$, T );
        final SubLObject _values = Values.getValuesAsVector();
        Semaphores.semaphore_signal( semaphore );
        Values.restoreValuesFromVector( _values );
      }
      finally
      {
        Dynamic.rebind( Threads.$is_thread_performing_cleanupP$, _prev_bind_0 );
      }
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 28405L)
  public static SubLObject benchmark_parallel_cyclops_compute_and_print_statistics(final SubLObject stream, final SubLObject parallel, final SubLObject power, final SubLObject guts_time)
  {
    final SubLObject k = Numbers.subtract( Numbers.expt( TWO_INTEGER, power ), ONE_INTEGER );
    final SubLObject efficiency = Numbers.divide( guts_time, k );
    final SubLObject cyclops = Numbers.invert( efficiency );
    final SubLObject bogomips = misc_utilities.machine_bogomips();
    benchmark_parallel_cyclops_print_statistics( stream, parallel, bogomips, k, guts_time, efficiency, cyclops );
    return cyclops;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 28799L)
  public static SubLObject benchmark_parallel_cyclops_print_statistics(final SubLObject stream, final SubLObject parallel, final SubLObject bogomips, final SubLObject k, final SubLObject guts_time,
      final SubLObject efficiency, final SubLObject cyclops)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
    try
    {
      reader.$read_default_float_format$.bind( $sym79$DOUBLE_FLOAT, thread );
      PrintLow.format( stream, $str112$__Parallel_CycLOPs_Benchmark_Resu );
      PrintLow.format( stream, $str81$_________________________________ );
      PrintLow.format( stream, $str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), control_vars.kb_loaded()
      } );
      PrintLow.format( stream, $str113$__Parallelism_________S, parallel );
      if( NIL != bogomips )
      {
        PrintLow.format( stream, $str83$__Bogomips______S, bogomips );
      }
      PrintLow.format( stream, $str84$__Scaling_factor______S, k );
      PrintLow.format( stream, $str85$__Elapsed_time__seconds_______S, number_utilities.significant_digits( guts_time, FOUR_INTEGER ) );
      PrintLow.format( stream, $str86$__Efficiency__seconds_op_______S, number_utilities.significant_digits( efficiency, FOUR_INTEGER ) );
      PrintLow.format( stream, $str87$__CycLOPs______S, number_utilities.significant_digits( cyclops, FOUR_INTEGER ) );
      if( NIL != bogomips )
      {
        PrintLow.format( stream, $str88$__Bogomips_CycLOPs_______S, number_utilities.significant_digits( Numbers.divide( bogomips, cyclops ), FOUR_INTEGER ) );
      }
      streams_high.terpri( stream );
      streams_high.force_output( stream );
    }
    finally
    {
      reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 29886L)
  public static SubLObject benchmark_parallel_cyclops_print_statistical_summary(final SubLObject stream, final SubLObject parallel, final SubLObject values)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding( thread );
    try
    {
      reader.$read_default_float_format$.bind( $sym79$DOUBLE_FLOAT, thread );
      PrintLow.format( stream, $str114$__Parallel_CycLOPs_Benchmark_Stat );
      PrintLow.format( stream, $str81$_________________________________ );
      PrintLow.format( stream, $str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), control_vars.kb_loaded()
      } );
      PrintLow.format( stream, $str113$__Parallelism_________S, parallel );
      PrintLow.format( stream, $str90$__Raw_Data______S, Mapping.mapcar( $sym91$FOUR_SIGNIFICANT_DIGITS, values ) );
      PrintLow.format( stream, $str92$__Sorted_Data______S, Mapping.mapcar( $sym91$FOUR_SIGNIFICANT_DIGITS, Sort.sort( conses_high.copy_list( values ), Symbols.symbol_function( $sym93$_ ), UNPROVIDED ) ) );
      PrintLow.format( stream, $str94$__N______S, Sequences.length( values ) );
      PrintLow.format( stream, $str95$__Min______S, number_utilities.four_significant_digits( number_utilities.minimum( values, UNPROVIDED ) ) );
      PrintLow.format( stream, $str96$__Max______S, number_utilities.four_significant_digits( number_utilities.maximum( values, UNPROVIDED ) ) );
      PrintLow.format( stream, $str97$__Median______S, number_utilities.four_significant_digits( number_utilities.median( values, UNPROVIDED, UNPROVIDED ) ) );
      PrintLow.format( stream, $str98$__Mean______S, number_utilities.four_significant_digits( number_utilities.mean( values ) ) );
      PrintLow.format( stream, $str99$__Standard_Deviation______S, number_utilities.four_significant_digits( number_utilities.standard_deviation( values ) ) );
      streams_high.terpri( stream );
      streams_high.force_output( stream );
    }
    finally
    {
      reader.$read_default_float_format$.rebind( _prev_bind_0, thread );
    }
    return stream;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 31159L)
  public static SubLObject massive_assert_benchmark(final SubLObject gaf_count, final SubLObject term_count, final SubLObject predicate_count, final SubLObject mt_count, SubLObject v_properties)
  {
    if( v_properties == UNPROVIDED )
    {
      v_properties = NIL;
    }
    final SubLThread thread = SubLProcess.currentSubLThread();
    if( NIL == Errors.$ignore_mustsP$.getDynamicValue( thread ) && !Numbers.multiply( term_count, term_count ).numGE( gaf_count ) )
    {
      Errors.error( $str115$Not_enough_terms_provided );
    }
    SubLObject time = NIL;
    thread.resetMultipleValues();
    final SubLObject preds = massive_assert_benchmark_setup( predicate_count, term_count, mt_count );
    final SubLObject terms = thread.secondMultipleValue();
    final SubLObject mts = thread.thirdMultipleValue();
    thread.resetMultipleValues();
    try
    {
      final SubLObject message = Sequences.cconcatenate( $str116$Asserting_, new SubLObject[] { format_nil.format_nil_s_no_copy( gaf_count ), $str117$_GAFs
      } );
      final SubLObject time_var = Time.get_internal_real_time();
      final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding( thread );
      final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding( thread );
      final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding( thread );
      final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding( thread );
      final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding( thread );
      final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding( thread );
      final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding( thread );
      final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding( thread );
      try
      {
        utilities_macros.$progress_note$.bind( message, thread );
        utilities_macros.$progress_start_time$.bind( Time.get_universal_time(), thread );
        utilities_macros.$progress_total$.bind( gaf_count, thread );
        utilities_macros.$progress_sofar$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_index$.bind( ZERO_INTEGER, thread );
        utilities_macros.$last_percent_progress_prediction$.bind( NIL, thread );
        utilities_macros.$within_noting_percent_progress$.bind( T, thread );
        utilities_macros.$percent_progress_start_time$.bind( Time.get_universal_time(), thread );
        try
        {
          utilities_macros.noting_percent_progress_preamble( utilities_macros.$progress_note$.getDynamicValue( thread ) );
          SubLObject i;
          SubLObject pred_index;
          SubLObject term_a_index;
          SubLObject term_b_index;
          SubLObject mt_index;
          SubLObject pred;
          SubLObject term_a;
          SubLObject term_b;
          SubLObject mt;
          for( i = NIL, i = ZERO_INTEGER; i.numL( utilities_macros.$progress_total$.getDynamicValue( thread ) ); i = Numbers.add( i, ONE_INTEGER ) )
          {
            pred_index = Numbers.mod( i, predicate_count );
            term_a_index = Numbers.integerDivide( i, term_count );
            term_b_index = Numbers.mod( i, term_count );
            mt_index = Numbers.mod( i, mt_count );
            pred = Vectors.aref( preds, pred_index );
            term_a = Vectors.aref( terms, term_a_index );
            term_b = Vectors.aref( terms, term_b_index );
            mt = Vectors.aref( mts, mt_index );
            massive_assert_benchmark_add( pred, term_a, term_b, mt, v_properties );
            utilities_macros.$progress_sofar$.setDynamicValue( Numbers.add( utilities_macros.$progress_sofar$.getDynamicValue( thread ), ONE_INTEGER ), thread );
            utilities_macros.note_percent_progress( utilities_macros.$progress_sofar$.getDynamicValue( thread ), utilities_macros.$progress_total$.getDynamicValue( thread ) );
          }
        }
        finally
        {
          final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
          try
          {
            Threads.$is_thread_performing_cleanupP$.bind( T, thread );
            final SubLObject _values = Values.getValuesAsVector();
            utilities_macros.noting_percent_progress_postamble();
            Values.restoreValuesFromVector( _values );
          }
          finally
          {
            Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_0_$37, thread );
          }
        }
      }
      finally
      {
        utilities_macros.$percent_progress_start_time$.rebind( _prev_bind_8, thread );
        utilities_macros.$within_noting_percent_progress$.rebind( _prev_bind_7, thread );
        utilities_macros.$last_percent_progress_prediction$.rebind( _prev_bind_6, thread );
        utilities_macros.$last_percent_progress_index$.rebind( _prev_bind_5, thread );
        utilities_macros.$progress_sofar$.rebind( _prev_bind_4, thread );
        utilities_macros.$progress_total$.rebind( _prev_bind_3, thread );
        utilities_macros.$progress_start_time$.rebind( _prev_bind_2, thread );
        utilities_macros.$progress_note$.rebind( _prev_bind_0, thread );
      }
      time = Numbers.divide( Numbers.subtract( Time.get_internal_real_time(), time_var ), time_high.$internal_time_units_per_second$.getGlobalValue() );
    }
    finally
    {
      final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding( thread );
      try
      {
        Threads.$is_thread_performing_cleanupP$.bind( T, thread );
        final SubLObject _values2 = Values.getValuesAsVector();
        massive_assert_benchmark_teardown( preds, terms, mts );
        Values.restoreValuesFromVector( _values2 );
      }
      finally
      {
        Threads.$is_thread_performing_cleanupP$.rebind( _prev_bind_9, thread );
      }
    }
    return time;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 32479L)
  public static SubLObject massive_assert_benchmark_setup(final SubLObject predicate_count, final SubLObject term_count, final SubLObject mt_count)
  {
    final SubLObject preds = Vectors.make_vector( predicate_count, UNPROVIDED );
    final SubLObject terms = Vectors.make_vector( term_count, UNPROVIDED );
    final SubLObject mts = Vectors.make_vector( mt_count, UNPROVIDED );
    SubLObject i;
    SubLObject name;
    SubLObject pred;
    for( i = NIL, i = ZERO_INTEGER; i.numL( predicate_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      name = Sequences.cconcatenate( $str118$mAB_P_, format_nil.format_nil_a_no_copy( i ) );
      pred = cyc_kernel.cyc_create_new_ephemeral( name );
      cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, pred, $list31 ), $const119$UniversalVocabularyMt, UNPROVIDED );
      Vectors.set_aref( preds, i, pred );
    }
    SubLObject v_term;
    for( i = NIL, i = ZERO_INTEGER; i.numL( term_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      name = Sequences.cconcatenate( $str120$MAB_T_, format_nil.format_nil_a_no_copy( i ) );
      v_term = cyc_kernel.cyc_create_new_ephemeral( name );
      cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, v_term, $list56 ), $const119$UniversalVocabularyMt, UNPROVIDED );
      Vectors.set_aref( terms, i, v_term );
    }
    SubLObject mt;
    for( i = NIL, i = ZERO_INTEGER; i.numL( mt_count ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      name = Sequences.cconcatenate( $str121$MAB_M_, format_nil.format_nil_a_no_copy( i ) );
      mt = cyc_kernel.cyc_create_new_ephemeral( name );
      cyc_kernel.cyc_assert_wff( ConsesLow.listS( $const9$isa, mt, $list10 ), $const119$UniversalVocabularyMt, UNPROVIDED );
      Vectors.set_aref( mts, i, mt );
    }
    return Values.values( preds, terms, mts );
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 33399L)
  public static SubLObject massive_assert_benchmark_teardown(final SubLObject preds, final SubLObject terms, final SubLObject mts)
  {
    SubLObject backwardP_var = NIL;
    SubLObject length;
    SubLObject v_iteration;
    SubLObject element_num;
    SubLObject v_term;
    for( length = Sequences.length( terms ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      v_term = Vectors.aref( terms, element_num );
      cyc_kernel.cyc_kill( v_term );
    }
    backwardP_var = NIL;
    SubLObject pred;
    for( length = Sequences.length( preds ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      pred = Vectors.aref( preds, element_num );
      cyc_kernel.cyc_kill( pred );
    }
    backwardP_var = NIL;
    SubLObject mt;
    for( length = Sequences.length( mts ), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL( length ); v_iteration = Numbers.add( v_iteration, ONE_INTEGER ) )
    {
      element_num = ( ( NIL != backwardP_var ) ? Numbers.subtract( length, v_iteration, ONE_INTEGER ) : v_iteration );
      mt = Vectors.aref( mts, element_num );
      cyc_kernel.cyc_kill( mt );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 33609L)
  public static SubLObject massive_assert_benchmark_add(final SubLObject pred, final SubLObject term_a, final SubLObject term_b, final SubLObject mt, final SubLObject v_properties)
  {
    final SubLThread thread = SubLProcess.currentSubLThread();
    final SubLObject assume_wffP_tail = cdestructuring_bind.property_list_member( $kw122$ASSUME_WFF_, v_properties );
    final SubLObject assume_wffP = ( NIL != assume_wffP_tail ) ? conses_high.cadr( assume_wffP_tail ) : NIL;
    final SubLObject disable_forwardP_tail = cdestructuring_bind.property_list_member( $kw123$DISABLE_FORWARD_, v_properties );
    final SubLObject disable_forwardP = ( NIL != disable_forwardP_tail ) ? conses_high.cadr( disable_forwardP_tail ) : NIL;
    final SubLObject sentence = ConsesLow.list( pred, term_a, term_b );
    final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding( thread );
    try
    {
      kb_control_vars.$forward_inference_enabledP$.bind( makeBoolean( NIL == disable_forwardP ), thread );
      if( NIL != assume_wffP )
      {
        cyc_kernel.cyc_assert_wff( sentence, mt, UNPROVIDED );
      }
      else
      {
        cyc_kernel.cyc_assert( sentence, mt, UNPROVIDED );
      }
    }
    finally
    {
      kb_control_vars.$forward_inference_enabledP$.rebind( _prev_bind_0, thread );
    }
    return NIL;
  }

  @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 34010L)
  public static SubLObject benchmark_cyclops_sample(final SubLObject power, SubLObject trials)
  {
    if( trials == UNPROVIDED )
    {
      trials = FIVE_INTEGER;
    }
    SubLObject times = NIL;
    SubLObject i;
    for( i = NIL, i = ZERO_INTEGER; i.numL( trials ); i = Numbers.add( i, ONE_INTEGER ) )
    {
      times = ConsesLow.cons( benchmark_cyclops( power, UNPROVIDED ), times );
    }
    times = Sort.sort( times, Symbols.symbol_function( $sym93$_ ), UNPROVIDED );
    times = conses_high.ldiff( times.rest(), conses_high.last( times, UNPROVIDED ) );
    return number_utilities.mean( times );
  }

  public static SubLObject declare_system_benchmarks_file()
  {
    SubLFiles.declareFunction( me, "benchmark_cyclops_compensating_for_paging", "BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 4, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_n_times", "BENCHMARK-CYCLOPS-N-TIMES", 1, 3, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops", "BENCHMARK-CYCLOPS", 0, 2, false );
    SubLFiles.declareFunction( me, "median_cyclops", "MEDIAN-CYCLOPS", 1, 3, false );
    SubLFiles.declareFunction( me, "max_cyclops", "MAX-CYCLOPS", 1, 3, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_setup_and_teardown", "BENCHMARK-CYCLOPS-SETUP-AND-TEARDOWN", 0, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_setup", "BENCHMARK-CYCLOPS-SETUP", 0, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_guts", "BENCHMARK-CYCLOPS-GUTS", 8, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_guts_int", "BENCHMARK-CYCLOPS-GUTS-INT", 9, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_teardown", "BENCHMARK-CYCLOPS-TEARDOWN", 7, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_compute_and_print_statistics", "BENCHMARK-CYCLOPS-COMPUTE-AND-PRINT-STATISTICS", 3, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_create_mts", "BENCHMARK-CYCLOPS-CREATE-MTS", 0, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_create_ontology", "BENCHMARK-CYCLOPS-CREATE-ONTOLOGY", 0, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_create_parent", "BENCHMARK-CYCLOPS-CREATE-PARENT", 1, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_create_ancestor", "BENCHMARK-CYCLOPS-CREATE-ANCESTOR", 1, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_create_sibling", "BENCHMARK-CYCLOPS-CREATE-SIBLING", 1, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_create_family", "BENCHMARK-CYCLOPS-CREATE-FAMILY", 1, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_define_predicates", "BENCHMARK-CYCLOPS-DEFINE-PREDICATES", 4, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_assert_sibling_rule", "BENCHMARK-CYCLOPS-ASSERT-SIBLING-RULE", 5, 0, false );
    SubLFiles.declareMacro( me, "with_cyclops_lock", "WITH-CYCLOPS-LOCK" );
    SubLFiles.declareFunction( me, "benchmark_cyclops_create_terms", "BENCHMARK-CYCLOPS-CREATE-TERMS", 4, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_create_term", "BENCHMARK-CYCLOPS-CREATE-TERM", 2, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_assert_family_links", "BENCHMARK-CYCLOPS-ASSERT-FAMILY-LINKS", 5, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_assert_parent_links", "BENCHMARK-CYCLOPS-ASSERT-PARENT-LINKS", 4, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_query", "BENCHMARK-CYCLOPS-QUERY", 4, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_query_parent_links", "BENCHMARK-CYCLOPS-QUERY-PARENT-LINKS", 4, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_query_ancestor_links", "BENCHMARK-CYCLOPS-QUERY-ANCESTOR-LINKS", 4, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_query_sibling_links_via_rule", "BENCHMARK-CYCLOPS-QUERY-SIBLING-LINKS-VIA-RULE", 4, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_forward_propagate_sibling_rule", "BENCHMARK-CYCLOPS-FORWARD-PROPAGATE-SIBLING-RULE", 4, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_turn_sibling_rule_backward", "BENCHMARK-CYCLOPS-TURN-SIBLING-RULE-BACKWARD", 4, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_query_sibling_links_via_lookup", "BENCHMARK-CYCLOPS-QUERY-SIBLING-LINKS-VIA-LOOKUP", 4, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_kill_terms", "BENCHMARK-CYCLOPS-KILL-TERMS", 2, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_kill_vocabulary", "BENCHMARK-CYCLOPS-KILL-VOCABULARY", 7, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_print_statistics", "BENCHMARK-CYCLOPS-PRINT-STATISTICS", 6, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_print_statistical_summary", "BENCHMARK-CYCLOPS-PRINT-STATISTICAL-SUMMARY", 2, 0, false );
    SubLFiles.declareFunction( me, "expensive_cyclops_rules", "EXPENSIVE-CYCLOPS-RULES", 0, 1, false );
    SubLFiles.declareFunction( me, "expensive_cyclops_rules_int", "EXPENSIVE-CYCLOPS-RULES-INT", 2, 0, false );
    SubLFiles.declareFunction( me, "benchmark_parallel_cyclops_compensating_for_paging", "BENCHMARK-PARALLEL-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 5, false );
    SubLFiles.declareFunction( me, "benchmark_parallel_cyclops_efficiency", "BENCHMARK-PARALLEL-CYCLOPS-EFFICIENCY", 1, 3, false );
    SubLFiles.declareFunction( me, "median_parallel_cyclops", "MEDIAN-PARALLEL-CYCLOPS", 2, 3, false );
    SubLFiles.declareFunction( me, "benchmark_parallel_cyclops_n_times", "BENCHMARK-PARALLEL-CYCLOPS-N-TIMES", 2, 3, false );
    SubLFiles.declareFunction( me, "benchmark_parallel_cyclops_guts", "BENCHMARK-PARALLEL-CYCLOPS-GUTS", 9, 0, false );
    SubLFiles.declareFunction( me, "benchmark_parallel_cyclops_guts_thread", "BENCHMARK-PARALLEL-CYCLOPS-GUTS-THREAD", 10, 0, false );
    SubLFiles.declareFunction( me, "benchmark_parallel_cyclops_compute_and_print_statistics", "BENCHMARK-PARALLEL-CYCLOPS-COMPUTE-AND-PRINT-STATISTICS", 4, 0, false );
    SubLFiles.declareFunction( me, "benchmark_parallel_cyclops_print_statistics", "BENCHMARK-PARALLEL-CYCLOPS-PRINT-STATISTICS", 7, 0, false );
    SubLFiles.declareFunction( me, "benchmark_parallel_cyclops_print_statistical_summary", "BENCHMARK-PARALLEL-CYCLOPS-PRINT-STATISTICAL-SUMMARY", 3, 0, false );
    SubLFiles.declareFunction( me, "massive_assert_benchmark", "MASSIVE-ASSERT-BENCHMARK", 4, 1, false );
    SubLFiles.declareFunction( me, "massive_assert_benchmark_setup", "MASSIVE-ASSERT-BENCHMARK-SETUP", 3, 0, false );
    SubLFiles.declareFunction( me, "massive_assert_benchmark_teardown", "MASSIVE-ASSERT-BENCHMARK-TEARDOWN", 3, 0, false );
    SubLFiles.declareFunction( me, "massive_assert_benchmark_add", "MASSIVE-ASSERT-BENCHMARK-ADD", 5, 0, false );
    SubLFiles.declareFunction( me, "benchmark_cyclops_sample", "BENCHMARK-CYCLOPS-SAMPLE", 1, 1, false );
    return NIL;
  }

  public static SubLObject init_system_benchmarks_file()
  {
    $cyclops_family_fix_enabledP$ = SubLFiles.defvar( "*CYCLOPS-FAMILY-FIX-ENABLED?*", NIL );
    $cyclops_anect_fix_enabledP$ = SubLFiles.defparameter( "*CYCLOPS-ANECT-FIX-ENABLED?*", T );
    $benchmark_cyclops_power$ = SubLFiles.defvar( "*BENCHMARK-CYCLOPS-POWER*", SIX_INTEGER );
    $benchmark_cyclops_ontology_root$ = SubLFiles.defvar( "*BENCHMARK-CYCLOPS-ONTOLOGY-ROOT*", $const0$Individual );
    $cyclops_throwaway_default$ = SubLFiles.deflexical( "*CYCLOPS-THROWAWAY-DEFAULT*", $int1$33 );
    $cyclops_lockedP$ = SubLFiles.defparameter( "*CYCLOPS-LOCKED?*", NIL );
    $cyclops_lock$ = SubLFiles.deflexical( "*CYCLOPS-LOCK*", maybeDefault( $sym49$_CYCLOPS_LOCK_, $cyclops_lock$, () -> ( Locks.make_lock( $str50$CycLOPs_lock ) ) ) );
    $cyclops_rule_expensiveness_threshold$ = SubLFiles.defparameter( "*CYCLOPS-RULE-EXPENSIVENESS-THRESHOLD*", TWO_INTEGER );
    return NIL;
  }

  public static SubLObject setup_system_benchmarks_file()
  {
    access_macros.register_external_symbol( $sym2$BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING );
    access_macros.register_external_symbol( $sym48$_CYCLOPS_LOCKED__ );
    subl_macro_promotions.declare_defglobal( $sym49$_CYCLOPS_LOCK_ );
    access_macros.register_external_symbol( $sym105$BENCHMARK_PARALLEL_CYCLOPS_COMPENSATING_FOR_PAGING );
    access_macros.define_obsolete_register( $sym124$BENCHMARK_CYCLOPS_SAMPLE, $list125 );
    return NIL;
  }

  @Override
  public void declareFunctions()
  {
    declare_system_benchmarks_file();
  }

  @Override
  public void initializeVariables()
  {
    init_system_benchmarks_file();
  }

  @Override
  public void runTopLevelForms()
  {
    setup_system_benchmarks_file();
  }
  static
  {
    me = new system_benchmarks();
    $cyclops_family_fix_enabledP$ = null;
    $cyclops_anect_fix_enabledP$ = null;
    $benchmark_cyclops_power$ = null;
    $benchmark_cyclops_ontology_root$ = null;
    $cyclops_throwaway_default$ = null;
    $cyclops_lockedP$ = null;
    $cyclops_lock$ = null;
    $cyclops_rule_expensiveness_threshold$ = null;
    $const0$Individual = constant_handles.reader_make_constant_shell( makeString( "Individual" ) );
    $int1$33 = makeInteger( 33 );
    $sym2$BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING = makeSymbol( "BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING" );
    $sym3$NON_NEGATIVE_INTEGER_P = makeSymbol( "NON-NEGATIVE-INTEGER-P" );
    $kw4$LENIENT = makeKeyword( "LENIENT" );
    $kw5$NONE = makeKeyword( "NONE" );
    $sym6$QUEUE_P = makeSymbol( "QUEUE-P" );
    $str7$Mt_1 = makeString( "Mt-1" );
    $str8$Mt_2 = makeString( "Mt-2" );
    $const9$isa = constant_handles.reader_make_constant_shell( makeString( "isa" ) );
    $list10 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Microtheory" ) ) );
    $const11$BaseKB = constant_handles.reader_make_constant_shell( makeString( "BaseKB" ) );
    $list12 = ConsesLow.list( makeKeyword( "STRENGTH" ), makeKeyword( "MONOTONIC" ), makeKeyword( "DIRECTION" ), makeKeyword( "FORWARD" ) );
    $const13$genlMt = constant_handles.reader_make_constant_shell( makeString( "genlMt" ) );
    $str14$Creating_collection_ontology = makeString( "Creating collection ontology" );
    $int15$25 = makeInteger( 25 );
    $str16$Col_ = makeString( "Col-" );
    $list17 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Collection" ) ) );
    $const18$genls = constant_handles.reader_make_constant_shell( makeString( "genls" ) );
    $str19$parent = makeString( "parent" );
    $list20 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "IrreflexiveBinaryPredicate" ) ) );
    $list21 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AsymmetricBinaryPredicate" ) ) );
    $const22$arg1Isa = constant_handles.reader_make_constant_shell( makeString( "arg1Isa" ) );
    $const23$arg2Isa = constant_handles.reader_make_constant_shell( makeString( "arg2Isa" ) );
    $str24$ancestor = makeString( "ancestor" );
    $list25 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "ReflexiveBinaryPredicate" ) ) );
    $list26 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "AntiSymmetricBinaryPredicate" ) ) );
    $list27 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "TransitiveBinaryPredicate" ) ) );
    $str28$sibling = makeString( "sibling" );
    $list29 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "SymmetricBinaryPredicate" ) ) );
    $str30$family = makeString( "family" );
    $list31 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "BinaryPredicate" ) ) );
    $list32 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Integer" ) ) );
    $const33$genlPreds = constant_handles.reader_make_constant_shell( makeString( "genlPreds" ) );
    $kw34$BACKWARD = makeKeyword( "BACKWARD" );
    $kw35$STRENGTH = makeKeyword( "STRENGTH" );
    $kw36$MONOTONIC = makeKeyword( "MONOTONIC" );
    $kw37$DIRECTION = makeKeyword( "DIRECTION" );
    $const38$implies = constant_handles.reader_make_constant_shell( makeString( "implies" ) );
    $const39$and = constant_handles.reader_make_constant_shell( makeString( "and" ) );
    $list40 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "different" ) ), makeSymbol( "?CHILD-1" ), makeSymbol( "?CHILD-2" ) );
    $sym41$_PARENT = makeSymbol( "?PARENT" );
    $list42 = ConsesLow.list( makeSymbol( "?CHILD-1" ), makeSymbol( "?PARENT" ) );
    $list43 = ConsesLow.list( makeSymbol( "?CHILD-2" ), makeSymbol( "?PARENT" ) );
    $list44 = ConsesLow.list( makeSymbol( "?CHILD-1" ), makeSymbol( "?CHILD-2" ) );
    $const45$different = constant_handles.reader_make_constant_shell( makeString( "different" ) );
    $sym46$_CHILD_1 = makeSymbol( "?CHILD-1" );
    $sym47$_CHILD_2 = makeSymbol( "?CHILD-2" );
    $sym48$_CYCLOPS_LOCKED__ = makeSymbol( "*CYCLOPS-LOCKED?*" );
    $sym49$_CYCLOPS_LOCK_ = makeSymbol( "*CYCLOPS-LOCK*" );
    $str50$CycLOPs_lock = makeString( "CycLOPs lock" );
    $sym51$PIF = makeSymbol( "PIF" );
    $sym52$WITH_LOCK_HELD = makeSymbol( "WITH-LOCK-HELD" );
    $list53 = ConsesLow.list( makeSymbol( "*CYCLOPS-LOCK*" ) );
    $sym54$PROGN = makeSymbol( "PROGN" );
    $str55$Creating_terms = makeString( "Creating terms" );
    $list56 = ConsesLow.list( constant_handles.reader_make_constant_shell( makeString( "Individual" ) ) );
    $sym57$VECTOR = makeSymbol( "VECTOR" );
    $str58$Term_ = makeString( "Term-" );
    $str59$_ = makeString( "-" );
    $str60$Asserting_family_links = makeString( "Asserting family links" );
    $str61$Asserting_parent_links = makeString( "Asserting parent links" );
    $sym62$WARN = makeSymbol( "WARN" );
    $sym63$ERROR = makeSymbol( "ERROR" );
    $str64$Asking_parent_links = makeString( "Asking parent links" );
    $list65 = ConsesLow.list( makeSymbol( "?PARENT" ) );
    $str66$CycLOPs_error_asking_parent__S = makeString( "CycLOPs error asking parent ~S" );
    $str67$Asking_ancestor_links = makeString( "Asking ancestor links" );
    $list68 = ConsesLow.list( makeSymbol( "?ANCEST" ) );
    $str69$CycLOPs_error__asking_ancestor__S = makeString( "CycLOPs error: asking ancestor ~S" );
    $str70$Asking_sibling_links = makeString( "Asking sibling links" );
    $list71 = ConsesLow.list( makeSymbol( "?SIBLING" ) );
    $list72 = ConsesLow.list( makeKeyword( "MAX-TRANSFORMATION-DEPTH" ), ONE_INTEGER );
    $str73$CycLOPs_error__asking_sibling__S_ = makeString( "CycLOPs error: asking sibling ~S via rule" );
    $kw74$FORWARD = makeKeyword( "FORWARD" );
    $str75$CycLOPs_error__asking_sibling__S = makeString( "CycLOPs error: asking sibling ~S" );
    $str76$Killing_terms = makeString( "Killing terms" );
    $str77$Killing_collections = makeString( "Killing collections" );
    $str78$cdolist = makeString( "cdolist" );
    $sym79$DOUBLE_FLOAT = makeSymbol( "DOUBLE-FLOAT" );
    $str80$__CycLOPs_Benchmark_Results = makeString( "~%CycLOPs Benchmark Results" );
    $str81$_________________________________ = makeString( "~%========================================" );
    $str82$__System__S__S_KB__S = makeString( "~%System ~S.~S KB ~S" );
    $str83$__Bogomips______S = makeString( "~%Bogomips :~% ~S" );
    $str84$__Scaling_factor______S = makeString( "~%Scaling factor :~% ~S" );
    $str85$__Elapsed_time__seconds_______S = makeString( "~%Elapsed time (seconds) :~% ~S" );
    $str86$__Efficiency__seconds_op_______S = makeString( "~%Efficiency (seconds/op) :~% ~S" );
    $str87$__CycLOPs______S = makeString( "~%CycLOPs :~% ~S" );
    $str88$__Bogomips_CycLOPs_______S = makeString( "~%Bogomips/CycLOPs : ~% ~S" );
    $str89$__CycLOPs_Benchmark_Statistical_S = makeString( "~%CycLOPs Benchmark Statistical Summary" );
    $str90$__Raw_Data______S = makeString( "~%Raw Data :~% ~S" );
    $sym91$FOUR_SIGNIFICANT_DIGITS = makeSymbol( "FOUR-SIGNIFICANT-DIGITS" );
    $str92$__Sorted_Data______S = makeString( "~%Sorted Data :~% ~S" );
    $sym93$_ = makeSymbol( "<" );
    $str94$__N______S = makeString( "~%N :~% ~S" );
    $str95$__Min______S = makeString( "~%Min :~% ~S" );
    $str96$__Max______S = makeString( "~%Max :~% ~S" );
    $str97$__Median______S = makeString( "~%Median :~% ~S" );
    $str98$__Mean______S = makeString( "~%Mean :~% ~S" );
    $str99$__Standard_Deviation______S = makeString( "~%Standard Deviation :~% ~S" );
    $kw100$AVERAGE_TIME_PER_RULE = makeKeyword( "AVERAGE-TIME-PER-RULE" );
    $kw101$STDEV_TIME_PER_RULE = makeKeyword( "STDEV-TIME-PER-RULE" );
    $kw102$RULE = makeKeyword( "RULE" );
    $kw103$TIME = makeKeyword( "TIME" );
    $kw104$INFERENCE_COUNT = makeKeyword( "INFERENCE-COUNT" );
    $sym105$BENCHMARK_PARALLEL_CYCLOPS_COMPENSATING_FOR_PAGING = makeSymbol( "BENCHMARK-PARALLEL-CYCLOPS-COMPENSATING-FOR-PAGING" );
    $str106$___S____S = makeString( "~%~S = ~S" );
    $str107$__eff____S = makeString( "  eff = ~S" );
    $sym108$POSITIVE_INTEGER_P = makeSymbol( "POSITIVE-INTEGER-P" );
    $str109$Parallel_CycLOPs = makeString( "Parallel CycLOPs" );
    $str110$Parallel_CycLOPs_thread_ = makeString( "Parallel CycLOPs thread " );
    $sym111$BENCHMARK_PARALLEL_CYCLOPS_GUTS_THREAD = makeSymbol( "BENCHMARK-PARALLEL-CYCLOPS-GUTS-THREAD" );
    $str112$__Parallel_CycLOPs_Benchmark_Resu = makeString( "~%Parallel CycLOPs Benchmark Results" );
    $str113$__Parallelism_________S = makeString( "~%Parallelism    :~% ~S" );
    $str114$__Parallel_CycLOPs_Benchmark_Stat = makeString( "~%Parallel CycLOPs Benchmark Statistical Summary" );
    $str115$Not_enough_terms_provided = makeString( "Not enough terms provided" );
    $str116$Asserting_ = makeString( "Asserting " );
    $str117$_GAFs = makeString( " GAFs" );
    $str118$mAB_P_ = makeString( "mAB-P-" );
    $const119$UniversalVocabularyMt = constant_handles.reader_make_constant_shell( makeString( "UniversalVocabularyMt" ) );
    $str120$MAB_T_ = makeString( "MAB-T-" );
    $str121$MAB_M_ = makeString( "MAB-M-" );
    $kw122$ASSUME_WFF_ = makeKeyword( "ASSUME-WFF?" );
    $kw123$DISABLE_FORWARD_ = makeKeyword( "DISABLE-FORWARD?" );
    $sym124$BENCHMARK_CYCLOPS_SAMPLE = makeSymbol( "BENCHMARK-CYCLOPS-SAMPLE" );
    $list125 = ConsesLow.list( makeSymbol( "BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING" ) );
  }
}
/*
 * 
 * Total time: 637 ms
 * 
 */