package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
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

public final class system_benchmarks extends SubLTranslatedFile
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
    public static SubLObject benchmark_cyclops_compensating_for_paging(SubLObject throwaway_n, SubLObject sample_n, SubLObject power, SubLObject stream) {
        if (throwaway_n == system_benchmarks.UNPROVIDED) {
            throwaway_n = system_benchmarks.$cyclops_throwaway_default$.getGlobalValue();
        }
        if (sample_n == system_benchmarks.UNPROVIDED) {
            sample_n = (SubLObject)system_benchmarks.SEVEN_INTEGER;
        }
        if (power == system_benchmarks.UNPROVIDED) {
            power = system_benchmarks.$benchmark_cyclops_power$.getDynamicValue();
        }
        if (stream == system_benchmarks.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject total_n = Numbers.add(throwaway_n, sample_n);
        return median_cyclops(total_n, power, stream, throwaway_n);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 2631L)
    public static SubLObject benchmark_cyclops_n_times(final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
        if (power == system_benchmarks.UNPROVIDED) {
            power = system_benchmarks.$benchmark_cyclops_power$.getDynamicValue();
        }
        if (stream == system_benchmarks.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (throw_away_first_n == system_benchmarks.UNPROVIDED) {
            throw_away_first_n = (SubLObject)system_benchmarks.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert system_benchmarks.NIL != subl_promotions.non_negative_integer_p(n) : n;
        assert system_benchmarks.NIL != subl_promotions.non_negative_integer_p(power) : power;
        SubLObject values = (SubLObject)system_benchmarks.NIL;
        final SubLObject _prev_bind_0 = wff_vars.$wff_mode$.currentBinding(thread);
        try {
            wff_vars.$wff_mode$.bind((SubLObject)system_benchmarks.$kw4$LENIENT, thread);
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
            try {
                SubLObject i;
                SubLObject guts_time;
                SubLObject cyclops;
                for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                    guts_time = benchmark_cyclops_guts(power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
                    cyclops = benchmark_cyclops_compute_and_print_statistics(stream, power, guts_time);
                    if (i.numGE(throw_away_first_n)) {
                        values = (SubLObject)ConsesLow.cons(cyclops, values);
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    benchmark_cyclops_teardown(mt_1, mt_2, collections, parent, ancestor, sibling, family);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            wff_vars.$wff_mode$.rebind(_prev_bind_0, thread);
        }
        values = Sequences.nreverse(values);
        if (n.numG((SubLObject)system_benchmarks.ONE_INTEGER)) {
            benchmark_cyclops_print_statistical_summary(stream, values);
        }
        return values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 3869L)
    public static SubLObject benchmark_cyclops(SubLObject power, SubLObject stream) {
        if (power == system_benchmarks.UNPROVIDED) {
            power = system_benchmarks.$benchmark_cyclops_power$.getDynamicValue();
        }
        if (stream == system_benchmarks.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert system_benchmarks.NIL != subl_promotions.non_negative_integer_p(power) : power;
        final SubLObject cyclops = benchmark_cyclops_n_times((SubLObject)system_benchmarks.ONE_INTEGER, power, stream, (SubLObject)system_benchmarks.ZERO_INTEGER).first();
        final SubLObject bogomips = misc_utilities.machine_bogomips();
        if (system_benchmarks.NIL != bogomips) {
            return Values.values(cyclops, Numbers.divide(bogomips, cyclops));
        }
        return cyclops;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 4279L)
    public static SubLObject median_cyclops(final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
        if (power == system_benchmarks.UNPROVIDED) {
            power = system_benchmarks.$benchmark_cyclops_power$.getDynamicValue();
        }
        if (stream == system_benchmarks.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (throw_away_first_n == system_benchmarks.UNPROVIDED) {
            throw_away_first_n = (SubLObject)system_benchmarks.ZERO_INTEGER;
        }
        final SubLObject cyclops = number_utilities.median(benchmark_cyclops_n_times(n, power, stream, throw_away_first_n), (SubLObject)system_benchmarks.UNPROVIDED, (SubLObject)system_benchmarks.UNPROVIDED);
        final SubLObject bogomips = misc_utilities.machine_bogomips();
        if (system_benchmarks.NIL != bogomips) {
            return Values.values(cyclops, Numbers.divide(bogomips, cyclops));
        }
        return cyclops;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 4692L)
    public static SubLObject max_cyclops(final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
        if (power == system_benchmarks.UNPROVIDED) {
            power = system_benchmarks.$benchmark_cyclops_power$.getDynamicValue();
        }
        if (stream == system_benchmarks.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (throw_away_first_n == system_benchmarks.UNPROVIDED) {
            throw_away_first_n = (SubLObject)system_benchmarks.ZERO_INTEGER;
        }
        final SubLObject cyclops = number_utilities.maximum(benchmark_cyclops_n_times(n, power, stream, throw_away_first_n), (SubLObject)system_benchmarks.UNPROVIDED);
        final SubLObject bogomips = misc_utilities.machine_bogomips();
        if (system_benchmarks.NIL != bogomips) {
            return Values.values(cyclops, Numbers.divide(bogomips, cyclops));
        }
        return cyclops;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 5102L)
    public static SubLObject benchmark_cyclops_setup_and_teardown() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_1 = (SubLObject)system_benchmarks.NIL;
        SubLObject mt_2 = (SubLObject)system_benchmarks.NIL;
        SubLObject collections = (SubLObject)system_benchmarks.NIL;
        SubLObject bottom_collection = (SubLObject)system_benchmarks.NIL;
        SubLObject parent = (SubLObject)system_benchmarks.NIL;
        SubLObject ancestor = (SubLObject)system_benchmarks.NIL;
        SubLObject sibling = (SubLObject)system_benchmarks.NIL;
        SubLObject family = (SubLObject)system_benchmarks.NIL;
        try {
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
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                benchmark_cyclops_teardown(mt_1, mt_2, collections, parent, ancestor, sibling, family);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 5673L)
    public static SubLObject benchmark_cyclops_setup() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_1 = (SubLObject)system_benchmarks.NIL;
        SubLObject mt_2 = (SubLObject)system_benchmarks.NIL;
        SubLObject collections = (SubLObject)system_benchmarks.NIL;
        SubLObject top_collection = (SubLObject)system_benchmarks.NIL;
        SubLObject bottom_collection = (SubLObject)system_benchmarks.NIL;
        SubLObject parent = (SubLObject)system_benchmarks.NIL;
        SubLObject ancestor = (SubLObject)system_benchmarks.NIL;
        SubLObject sibling = (SubLObject)system_benchmarks.NIL;
        SubLObject family = (SubLObject)system_benchmarks.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)system_benchmarks.T, thread);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
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
            parent = benchmark_cyclops_create_parent(top_collection);
            ancestor = benchmark_cyclops_create_ancestor(top_collection);
            sibling = benchmark_cyclops_create_sibling(top_collection);
            family = benchmark_cyclops_create_family(top_collection);
            benchmark_cyclops_define_predicates(parent, ancestor, sibling, family);
        }
        finally {
            StreamsLow.$standard_output$.rebind(_prev_bind_2, thread);
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return Values.values(mt_1, mt_2, collections, bottom_collection, parent, ancestor, sibling, family);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 6976L)
    public static SubLObject benchmark_cyclops_guts(final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
        Storage.gc_ephemeral();
        SubLObject time = (SubLObject)system_benchmarks.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        benchmark_cyclops_guts_int((SubLObject)system_benchmarks.ZERO_INTEGER, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 7365L)
    public static SubLObject benchmark_cyclops_guts_int(final SubLObject uniquifier, final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding(thread);
        final SubLObject _prev_bind_3 = backward_results.$inference_intermediate_step_validation_level$.currentBinding(thread);
        final SubLObject _prev_bind_4 = Types.$suspend_type_checkingP$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)system_benchmarks.T, thread);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            backward_results.$inference_intermediate_step_validation_level$.bind((SubLObject)system_benchmarks.$kw5$NONE, thread);
            Types.$suspend_type_checkingP$.bind((SubLObject)system_benchmarks.T, thread);
            final SubLObject cprogv_var = utilities_macros.$fi_state_variables$.getGlobalValue();
            final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
            try {
                Dynamic.bind_dynamic_vars(cprogv_var, (SubLObject)ConsesLow.make_list(Sequences.length(utilities_macros.$fi_state_variables$.getGlobalValue()), (SubLObject)system_benchmarks.NIL));
                final SubLObject _prev_bind_0_$15 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
                final SubLObject _prev_bind_1_$16 = control_vars.$prefer_forward_skolemization$.currentBinding(thread);
                try {
                    kb_control_vars.$within_assertion_forward_propagationP$.bind((SubLObject)system_benchmarks.NIL, thread);
                    control_vars.$prefer_forward_skolemization$.bind((SubLObject)system_benchmarks.NIL, thread);
                    final SubLObject environment = forward.get_forward_inference_environment();
                    assert system_benchmarks.NIL != queues.queue_p(environment) : environment;
                    final SubLObject _prev_bind_0_$16 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$17 = utilities_macros.$current_forward_problem_store$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_environment$.bind(environment, thread);
                        utilities_macros.$current_forward_problem_store$.bind((SubLObject)system_benchmarks.NIL, thread);
                        try {
                            SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource((SubLObject)system_benchmarks.TEN_INTEGER);
                            final SubLObject _prev_bind_0_$17 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$18 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$21 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)system_benchmarks.T, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                try {
                                    final SubLObject k = Numbers.subtract(Numbers.expt((SubLObject)system_benchmarks.TWO_INTEGER, power), (SubLObject)system_benchmarks.ONE_INTEGER);
                                    SubLObject terms = (SubLObject)system_benchmarks.NIL;
                                    try {
                                        terms = benchmark_cyclops_create_terms(uniquifier, k, bottom_collection, mt_1);
                                        benchmark_cyclops_assert_family_links(uniquifier, k, terms, family, mt_1);
                                        benchmark_cyclops_assert_parent_links(k, terms, parent, mt_1);
                                        benchmark_cyclops_query_parent_links(k, terms, parent, mt_2);
                                        benchmark_cyclops_query_ancestor_links(k, terms, ancestor, mt_1);
                                        benchmark_cyclops_query_sibling_links_via_rule(k, terms, sibling, mt_2);
                                        benchmark_cyclops_forward_propagate_sibling_rule(uniquifier, parent, sibling, family);
                                        benchmark_cyclops_turn_sibling_rule_backward(uniquifier, parent, sibling, family);
                                        benchmark_cyclops_query_sibling_links_via_lookup(k, terms, sibling, mt_2);
                                    }
                                    finally {
                                        final SubLObject _prev_bind_0_$18 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                                            final SubLObject _values = Values.getValuesAsVector();
                                            benchmark_cyclops_kill_terms(k, terms);
                                            Values.restoreValuesFromVector(_values);
                                        }
                                        finally {
                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                        }
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                                        final SubLObject _values2 = Values.getValuesAsVector();
                                        sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                        Values.restoreValuesFromVector(_values2);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                    }
                                }
                            }
                            finally {
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2_$21, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$18, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$17, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$20 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                forward.clear_current_forward_problem_store();
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$current_forward_problem_store$.rebind(_prev_bind_1_$17, thread);
                        kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$16, thread);
                    }
                }
                finally {
                    control_vars.$prefer_forward_skolemization$.rebind(_prev_bind_1_$16, thread);
                    kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0_$15, thread);
                }
            }
            finally {
                Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
            }
        }
        finally {
            Types.$suspend_type_checkingP$.rebind(_prev_bind_4, thread);
            backward_results.$inference_intermediate_step_validation_level$.rebind(_prev_bind_3, thread);
            StreamsLow.$standard_output$.rebind(_prev_bind_2, thread);
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 9846L)
    public static SubLObject benchmark_cyclops_teardown(final SubLObject mt_1, final SubLObject mt_2, final SubLObject collections, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$silent_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding(thread);
        try {
            utilities_macros.$silent_progressP$.bind((SubLObject)system_benchmarks.T, thread);
            StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
            benchmark_cyclops_kill_vocabulary(mt_1, mt_2, collections, parent, ancestor, sibling, family);
        }
        finally {
            StreamsLow.$standard_output$.rebind(_prev_bind_2, thread);
            utilities_macros.$silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 10134L)
    public static SubLObject benchmark_cyclops_compute_and_print_statistics(final SubLObject stream, final SubLObject power, final SubLObject guts_time) {
        final SubLObject k = Numbers.subtract(Numbers.expt((SubLObject)system_benchmarks.TWO_INTEGER, power), (SubLObject)system_benchmarks.ONE_INTEGER);
        final SubLObject efficiency = Numbers.divide(guts_time, k);
        final SubLObject cyclops = Numbers.invert(efficiency);
        final SubLObject bogomips = misc_utilities.machine_bogomips();
        benchmark_cyclops_print_statistics(stream, bogomips, k, guts_time, efficiency, cyclops);
        return cyclops;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 10461L)
    public static SubLObject benchmark_cyclops_create_mts() {
        SubLObject mt_1 = (SubLObject)system_benchmarks.NIL;
        SubLObject mt_2 = (SubLObject)system_benchmarks.NIL;
        mt_1 = cyc_kernel.cyc_create_new_ephemeral((SubLObject)system_benchmarks.$str7$Mt_1);
        mt_2 = cyc_kernel.cyc_create_new_ephemeral((SubLObject)system_benchmarks.$str8$Mt_2);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, mt_1, (SubLObject)system_benchmarks.$list10), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, mt_2, (SubLObject)system_benchmarks.$list10), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const13$genlMt, mt_2, mt_1), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        return Values.values(mt_1, mt_2);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 10998L)
    public static SubLObject benchmark_cyclops_create_ontology() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject collections = (SubLObject)system_benchmarks.NIL;
        SubLObject top_collection = (SubLObject)system_benchmarks.NIL;
        SubLObject bottom_collection = (SubLObject)system_benchmarks.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)system_benchmarks.$str14$Creating_collection_ontology, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind((SubLObject)system_benchmarks.$int15$25, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_benchmarks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_benchmarks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject collection;
                for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                    collection = cyc_kernel.cyc_create_new_ephemeral(Sequences.cconcatenate((SubLObject)system_benchmarks.$str16$Col_, format_nil.format_nil_a_no_copy(i)));
                    collections = (SubLObject)ConsesLow.cons(collection, collections);
                    cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, collection, (SubLObject)system_benchmarks.$list17), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_benchmarks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$25 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
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
        SubLObject previous = system_benchmarks.$benchmark_cyclops_ontology_root$.getDynamicValue(thread);
        SubLObject cdolist_list_var = collections;
        SubLObject collection2 = (SubLObject)system_benchmarks.NIL;
        collection2 = cdolist_list_var.first();
        while (system_benchmarks.NIL != cdolist_list_var) {
            cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const18$genls, collection2, previous), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
            previous = collection2;
            cdolist_list_var = cdolist_list_var.rest();
            collection2 = cdolist_list_var.first();
        }
        top_collection = collections.first();
        bottom_collection = conses_high.last(collections, (SubLObject)system_benchmarks.UNPROVIDED).first();
        return Values.values(collections, top_collection, bottom_collection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 11798L)
    public static SubLObject benchmark_cyclops_create_parent(final SubLObject top_collection) {
        final SubLObject parent = cyc_kernel.cyc_create_new_ephemeral((SubLObject)system_benchmarks.$str19$parent);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, parent, (SubLObject)system_benchmarks.$list20), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, parent, (SubLObject)system_benchmarks.$list21), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const22$arg1Isa, parent, top_collection), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const23$arg2Isa, parent, top_collection), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        return parent;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 12400L)
    public static SubLObject benchmark_cyclops_create_ancestor(final SubLObject top_collection) {
        final SubLObject ancestor = cyc_kernel.cyc_create_new_ephemeral((SubLObject)system_benchmarks.$str24$ancestor);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, ancestor, (SubLObject)system_benchmarks.$list25), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, ancestor, (SubLObject)system_benchmarks.$list26), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, ancestor, (SubLObject)system_benchmarks.$list27), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const22$arg1Isa, ancestor, top_collection), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const23$arg2Isa, ancestor, top_collection), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        return ancestor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 13146L)
    public static SubLObject benchmark_cyclops_create_sibling(final SubLObject top_collection) {
        final SubLObject sibling = cyc_kernel.cyc_create_new_ephemeral((SubLObject)system_benchmarks.$str28$sibling);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, sibling, (SubLObject)system_benchmarks.$list20), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, sibling, (SubLObject)system_benchmarks.$list29), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const22$arg1Isa, sibling, top_collection), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const23$arg2Isa, sibling, top_collection), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        return sibling;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 13756L)
    public static SubLObject benchmark_cyclops_create_family(final SubLObject top_collection) {
        final SubLObject family = cyc_kernel.cyc_create_new_ephemeral((SubLObject)system_benchmarks.$str30$family);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, family, (SubLObject)system_benchmarks.$list31), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const22$arg1Isa, family, top_collection), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const23$arg2Isa, family, (SubLObject)system_benchmarks.$list32), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        return family;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 14227L)
    public static SubLObject benchmark_cyclops_define_predicates(final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const33$genlPreds, parent, ancestor), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
        benchmark_cyclops_assert_sibling_rule((SubLObject)system_benchmarks.MINUS_ONE_INTEGER, parent, sibling, family, (SubLObject)system_benchmarks.$kw34$BACKWARD);
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 14611L)
    public static SubLObject benchmark_cyclops_assert_sibling_rule(final SubLObject uniquifier, final SubLObject parent, final SubLObject sibling, final SubLObject family, final SubLObject direction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_properties = (SubLObject)ConsesLow.list((SubLObject)system_benchmarks.$kw35$STRENGTH, (SubLObject)system_benchmarks.$kw36$MONOTONIC, (SubLObject)system_benchmarks.$kw37$DIRECTION, direction);
        SubLObject sentence = (SubLObject)system_benchmarks.NIL;
        if (system_benchmarks.NIL != system_benchmarks.$cyclops_family_fix_enabledP$.getDynamicValue(thread) && !uniquifier.isNegative()) {
            sentence = (SubLObject)ConsesLow.list(system_benchmarks.$const38$implies, (SubLObject)ConsesLow.list(system_benchmarks.$const39$and, (SubLObject)system_benchmarks.$list40, (SubLObject)ConsesLow.list(family, (SubLObject)system_benchmarks.$sym41$_PARENT, uniquifier), reader.bq_cons(parent, (SubLObject)system_benchmarks.$list42), reader.bq_cons(parent, (SubLObject)system_benchmarks.$list43)), reader.bq_cons(sibling, (SubLObject)system_benchmarks.$list44));
        }
        else {
            sentence = (SubLObject)ConsesLow.list(system_benchmarks.$const38$implies, (SubLObject)ConsesLow.list(system_benchmarks.$const39$and, (SubLObject)ConsesLow.list(system_benchmarks.$const45$different, (SubLObject)system_benchmarks.$sym46$_CHILD_1, (SubLObject)system_benchmarks.$sym47$_CHILD_2, uniquifier), reader.bq_cons(parent, (SubLObject)system_benchmarks.$list42), reader.bq_cons(parent, (SubLObject)system_benchmarks.$list43)), reader.bq_cons(sibling, (SubLObject)system_benchmarks.$list44));
        }
        return cyc_kernel.cyc_assert_wff(sentence, system_benchmarks.$const11$BaseKB, v_properties);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 15656L)
    public static SubLObject with_cyclops_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)system_benchmarks.$sym51$PIF, (SubLObject)system_benchmarks.$sym48$_CYCLOPS_LOCKED__, (SubLObject)ConsesLow.listS((SubLObject)system_benchmarks.$sym52$WITH_LOCK_HELD, (SubLObject)system_benchmarks.$list53, ConsesLow.append(body, (SubLObject)system_benchmarks.NIL)), reader.bq_cons((SubLObject)system_benchmarks.$sym54$PROGN, ConsesLow.append(body, (SubLObject)system_benchmarks.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 15824L)
    public static SubLObject benchmark_cyclops_create_terms(final SubLObject uniquifier, final SubLObject k, final SubLObject bottom_collection, SubLObject mt_1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (system_benchmarks.NIL == system_benchmarks.$cyclops_anect_fix_enabledP$.getDynamicValue(thread)) {
            mt_1 = system_benchmarks.$const11$BaseKB;
        }
        SubLObject terms = (SubLObject)system_benchmarks.NIL;
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)system_benchmarks.$str55$Creating_terms, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(k, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_benchmarks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_benchmarks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject v_term;
                SubLObject release;
                for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                    v_term = benchmark_cyclops_create_term(uniquifier, i);
                    terms = (SubLObject)ConsesLow.cons(v_term, terms);
                    if (system_benchmarks.NIL != system_benchmarks.$cyclops_anect_fix_enabledP$.getDynamicValue(thread)) {
                        if (system_benchmarks.NIL != system_benchmarks.$cyclops_lockedP$.getDynamicValue(thread)) {
                            release = (SubLObject)system_benchmarks.NIL;
                            try {
                                release = Locks.seize_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                                cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, v_term, (SubLObject)system_benchmarks.$list56), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
                            }
                            finally {
                                if (system_benchmarks.NIL != release) {
                                    Locks.release_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                                }
                            }
                        }
                        else {
                            cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, v_term, (SubLObject)system_benchmarks.$list56), system_benchmarks.$const11$BaseKB, (SubLObject)system_benchmarks.$list12);
                        }
                    }
                    if (system_benchmarks.NIL != system_benchmarks.$cyclops_lockedP$.getDynamicValue(thread)) {
                        release = (SubLObject)system_benchmarks.NIL;
                        try {
                            release = Locks.seize_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                            cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const9$isa, v_term, bottom_collection), mt_1, (SubLObject)system_benchmarks.$list12);
                        }
                        finally {
                            if (system_benchmarks.NIL != release) {
                                Locks.release_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                            }
                        }
                    }
                    else {
                        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(system_benchmarks.$const9$isa, v_term, bottom_collection), mt_1, (SubLObject)system_benchmarks.$list12);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_benchmarks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$26 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
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
        terms = Functions.apply(Symbols.symbol_function((SubLObject)system_benchmarks.$sym57$VECTOR), Sequences.nreverse(terms));
        return terms;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 16567L)
    public static SubLObject benchmark_cyclops_create_term(final SubLObject uniquifier, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = (SubLObject)system_benchmarks.NIL;
        if (system_benchmarks.NIL != system_benchmarks.$cyclops_lockedP$.getDynamicValue(thread)) {
            SubLObject release = (SubLObject)system_benchmarks.NIL;
            try {
                release = Locks.seize_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                v_term = cyc_kernel.cyc_create_new_ephemeral(Sequences.cconcatenate((SubLObject)system_benchmarks.$str58$Term_, new SubLObject[] { format_nil.format_nil_a_no_copy(uniquifier), system_benchmarks.$str59$_, format_nil.format_nil_a_no_copy(index) }));
            }
            finally {
                if (system_benchmarks.NIL != release) {
                    Locks.release_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                }
            }
        }
        else {
            v_term = cyc_kernel.cyc_create_new_ephemeral(Sequences.cconcatenate((SubLObject)system_benchmarks.$str58$Term_, new SubLObject[] { format_nil.format_nil_a_no_copy(uniquifier), system_benchmarks.$str59$_, format_nil.format_nil_a_no_copy(index) }));
        }
        return v_term;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 16778L)
    public static SubLObject benchmark_cyclops_assert_family_links(final SubLObject uniquifier, final SubLObject k, final SubLObject terms, final SubLObject family, final SubLObject mt_1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)system_benchmarks.$str60$Asserting_family_links, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(k, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_benchmarks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_benchmarks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject release;
                for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                    if (system_benchmarks.NIL != system_benchmarks.$cyclops_lockedP$.getDynamicValue(thread)) {
                        release = (SubLObject)system_benchmarks.NIL;
                        try {
                            release = Locks.seize_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                            cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(family, Vectors.aref(terms, i), uniquifier), mt_1, (SubLObject)system_benchmarks.$list12);
                        }
                        finally {
                            if (system_benchmarks.NIL != release) {
                                Locks.release_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                            }
                        }
                    }
                    else {
                        cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(family, Vectors.aref(terms, i), uniquifier), mt_1, (SubLObject)system_benchmarks.$list12);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_benchmarks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$27 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
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
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 17081L)
    public static SubLObject benchmark_cyclops_assert_parent_links(final SubLObject k, final SubLObject terms, final SubLObject parent, final SubLObject mt_1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)system_benchmarks.$str61$Asserting_parent_links, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(k, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_benchmarks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_benchmarks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject release;
                for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                    if (!i.numE((SubLObject)system_benchmarks.ZERO_INTEGER)) {
                        if (system_benchmarks.NIL != system_benchmarks.$cyclops_lockedP$.getDynamicValue(thread)) {
                            release = (SubLObject)system_benchmarks.NIL;
                            try {
                                release = Locks.seize_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                                cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(parent, Vectors.aref(terms, i), Vectors.aref(terms, Numbers.integerDivide(Numbers.subtract(i, (SubLObject)system_benchmarks.ONE_INTEGER), (SubLObject)system_benchmarks.TWO_INTEGER))), mt_1, (SubLObject)system_benchmarks.$list12);
                            }
                            finally {
                                if (system_benchmarks.NIL != release) {
                                    Locks.release_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                                }
                            }
                        }
                        else {
                            cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.list(parent, Vectors.aref(terms, i), Vectors.aref(terms, Numbers.integerDivide(Numbers.subtract(i, (SubLObject)system_benchmarks.ONE_INTEGER), (SubLObject)system_benchmarks.TWO_INTEGER))), mt_1, (SubLObject)system_benchmarks.$list12);
                        }
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_benchmarks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$28 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
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
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 17405L)
    public static SubLObject benchmark_cyclops_query(final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject error_spec) {
        SubLObject result = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        if (system_benchmarks.NIL != result) {
            return result;
        }
        Functions.apply(Symbols.symbol_function((SubLObject)system_benchmarks.$sym62$WARN), error_spec);
        result = inference_kernel.new_cyc_query(sentence, mt, v_properties);
        if (system_benchmarks.NIL != result) {
            return result;
        }
        Functions.apply(Symbols.symbol_function((SubLObject)system_benchmarks.$sym63$ERROR), error_spec);
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 17738L)
    public static SubLObject benchmark_cyclops_query_parent_links(final SubLObject k, final SubLObject terms, final SubLObject parent, final SubLObject mt_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)system_benchmarks.$str64$Asking_parent_links, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(k, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_benchmarks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_benchmarks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject sentence;
                for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                    if (!i.numE((SubLObject)system_benchmarks.ZERO_INTEGER)) {
                        sentence = (SubLObject)ConsesLow.listS(parent, Vectors.aref(terms, i), (SubLObject)system_benchmarks.$list65);
                        benchmark_cyclops_query(sentence, mt_2, (SubLObject)system_benchmarks.NIL, (SubLObject)ConsesLow.list((SubLObject)system_benchmarks.$str66$CycLOPs_error_asking_parent__S, i));
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_benchmarks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$29 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
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
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 18055L)
    public static SubLObject benchmark_cyclops_query_ancestor_links(final SubLObject k, final SubLObject terms, final SubLObject ancestor, final SubLObject mt_1) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)system_benchmarks.$str67$Asking_ancestor_links, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(k, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_benchmarks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_benchmarks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject sentence;
                for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                    if (!i.numE((SubLObject)system_benchmarks.ZERO_INTEGER)) {
                        sentence = (SubLObject)ConsesLow.list(system_benchmarks.$const39$and, (SubLObject)ConsesLow.listS(ancestor, Vectors.aref(terms, i), (SubLObject)system_benchmarks.$list68), (SubLObject)ConsesLow.listS(system_benchmarks.$const45$different, Vectors.aref(terms, i), (SubLObject)system_benchmarks.$list68));
                        benchmark_cyclops_query(sentence, mt_1, (SubLObject)system_benchmarks.NIL, (SubLObject)ConsesLow.list((SubLObject)system_benchmarks.$str69$CycLOPs_error__asking_ancestor__S, i));
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_benchmarks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$30 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
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
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 18438L)
    public static SubLObject benchmark_cyclops_query_sibling_links_via_rule(final SubLObject k, final SubLObject terms, final SubLObject sibling, final SubLObject mt_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)system_benchmarks.$str70$Asking_sibling_links, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(k, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_benchmarks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_benchmarks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject sentence;
                SubLObject v_properties;
                for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                    if (!i.numE((SubLObject)system_benchmarks.ZERO_INTEGER)) {
                        sentence = (SubLObject)ConsesLow.listS(sibling, Vectors.aref(terms, i), (SubLObject)system_benchmarks.$list71);
                        v_properties = (SubLObject)system_benchmarks.$list72;
                        benchmark_cyclops_query(sentence, mt_2, v_properties, (SubLObject)ConsesLow.list((SubLObject)system_benchmarks.$str73$CycLOPs_error__asking_sibling__S_, i));
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_benchmarks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$31 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
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
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 18843L)
    public static SubLObject benchmark_cyclops_forward_propagate_sibling_rule(final SubLObject uniquifier, final SubLObject parent, final SubLObject sibling, final SubLObject family) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (system_benchmarks.NIL != system_benchmarks.$cyclops_lockedP$.getDynamicValue(thread)) {
            SubLObject release = (SubLObject)system_benchmarks.NIL;
            try {
                release = Locks.seize_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, (SubLObject)system_benchmarks.$kw74$FORWARD);
            }
            finally {
                if (system_benchmarks.NIL != release) {
                    Locks.release_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                }
            }
        }
        else {
            benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, (SubLObject)system_benchmarks.$kw74$FORWARD);
        }
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 19124L)
    public static SubLObject benchmark_cyclops_turn_sibling_rule_backward(final SubLObject uniquifier, final SubLObject parent, final SubLObject sibling, final SubLObject family) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (system_benchmarks.NIL != system_benchmarks.$cyclops_lockedP$.getDynamicValue(thread)) {
            SubLObject release = (SubLObject)system_benchmarks.NIL;
            try {
                release = Locks.seize_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, (SubLObject)system_benchmarks.$kw34$BACKWARD);
            }
            finally {
                if (system_benchmarks.NIL != release) {
                    Locks.release_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                }
            }
        }
        else {
            benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, (SubLObject)system_benchmarks.$kw34$BACKWARD);
        }
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 19399L)
    public static SubLObject benchmark_cyclops_query_sibling_links_via_lookup(final SubLObject k, final SubLObject terms, final SubLObject sibling, final SubLObject mt_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)system_benchmarks.$str70$Asking_sibling_links, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(k, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_benchmarks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_benchmarks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject sentence;
                for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                    if (!i.numE((SubLObject)system_benchmarks.ZERO_INTEGER)) {
                        sentence = (SubLObject)ConsesLow.listS(sibling, Vectors.aref(terms, i), (SubLObject)system_benchmarks.$list71);
                        benchmark_cyclops_query(sentence, mt_2, (SubLObject)system_benchmarks.NIL, (SubLObject)ConsesLow.list((SubLObject)system_benchmarks.$str75$CycLOPs_error__asking_sibling__S, i));
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_benchmarks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$32 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
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
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 19735L)
    public static SubLObject benchmark_cyclops_kill_terms(final SubLObject k, final SubLObject terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)system_benchmarks.$str76$Killing_terms, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(k, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_benchmarks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_benchmarks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject i;
                SubLObject release;
                for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                    if (system_benchmarks.NIL != system_benchmarks.$cyclops_lockedP$.getDynamicValue(thread)) {
                        release = (SubLObject)system_benchmarks.NIL;
                        try {
                            release = Locks.seize_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                            cyc_kernel.cyc_kill(Vectors.aref(terms, i));
                        }
                        finally {
                            if (system_benchmarks.NIL != release) {
                                Locks.release_lock(system_benchmarks.$cyclops_lock$.getGlobalValue());
                            }
                        }
                    }
                    else {
                        cyc_kernel.cyc_kill(Vectors.aref(terms, i));
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_benchmarks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$33 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
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
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 19939L)
    public static SubLObject benchmark_cyclops_kill_vocabulary(final SubLObject mt_1, final SubLObject mt_2, final SubLObject collections, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$progress_note$.bind((SubLObject)system_benchmarks.$str77$Killing_collections, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(collections), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_benchmarks.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_benchmarks.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = collections;
                SubLObject col = (SubLObject)system_benchmarks.NIL;
                col = csome_list_var.first();
                while (system_benchmarks.NIL != csome_list_var) {
                    cyc_kernel.cyc_kill(col);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_benchmarks.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    col = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
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
        cyc_kernel.cyc_kill(family);
        cyc_kernel.cyc_kill(sibling);
        cyc_kernel.cyc_kill(ancestor);
        cyc_kernel.cyc_kill(parent);
        cyc_kernel.cyc_kill(mt_2);
        cyc_kernel.cyc_kill(mt_1);
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 20292L)
    public static SubLObject benchmark_cyclops_print_statistics(final SubLObject stream, final SubLObject bogomips, final SubLObject k, final SubLObject guts_time, final SubLObject efficiency, final SubLObject cyclops) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
            reader.$read_default_float_format$.bind((SubLObject)system_benchmarks.$sym79$DOUBLE_FLOAT, thread);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str80$__CycLOPs_Benchmark_Results);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str81$_________________________________);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), control_vars.kb_loaded() });
            if (system_benchmarks.NIL != bogomips) {
                PrintLow.format(stream, (SubLObject)system_benchmarks.$str83$__Bogomips______S, bogomips);
            }
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str84$__Scaling_factor______S, k);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str85$__Elapsed_time__seconds_______S, number_utilities.significant_digits(guts_time, (SubLObject)system_benchmarks.FOUR_INTEGER));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str86$__Efficiency__seconds_op_______S, number_utilities.significant_digits(efficiency, (SubLObject)system_benchmarks.FOUR_INTEGER));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str87$__CycLOPs______S, number_utilities.significant_digits(cyclops, (SubLObject)system_benchmarks.FOUR_INTEGER));
            if (system_benchmarks.NIL != bogomips) {
                PrintLow.format(stream, (SubLObject)system_benchmarks.$str88$__Bogomips_CycLOPs_______S, number_utilities.significant_digits(Numbers.divide(bogomips, cyclops), (SubLObject)system_benchmarks.FOUR_INTEGER));
            }
            streams_high.terpri(stream);
            streams_high.force_output(stream);
        }
        finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 21240L)
    public static SubLObject benchmark_cyclops_print_statistical_summary(final SubLObject stream, final SubLObject values) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
            reader.$read_default_float_format$.bind((SubLObject)system_benchmarks.$sym79$DOUBLE_FLOAT, thread);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str89$__CycLOPs_Benchmark_Statistical_S);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str81$_________________________________);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), control_vars.kb_loaded() });
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str90$__Raw_Data______S, Mapping.mapcar((SubLObject)system_benchmarks.$sym91$FOUR_SIGNIFICANT_DIGITS, values));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str92$__Sorted_Data______S, Mapping.mapcar((SubLObject)system_benchmarks.$sym91$FOUR_SIGNIFICANT_DIGITS, Sort.sort(conses_high.copy_list(values), Symbols.symbol_function((SubLObject)system_benchmarks.$sym93$_), (SubLObject)system_benchmarks.UNPROVIDED)));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str94$__N______S, Sequences.length(values));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str95$__Min______S, number_utilities.four_significant_digits(number_utilities.minimum(values, (SubLObject)system_benchmarks.UNPROVIDED)));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str96$__Max______S, number_utilities.four_significant_digits(number_utilities.maximum(values, (SubLObject)system_benchmarks.UNPROVIDED)));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str97$__Median______S, number_utilities.four_significant_digits(number_utilities.median(values, (SubLObject)system_benchmarks.UNPROVIDED, (SubLObject)system_benchmarks.UNPROVIDED)));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str98$__Mean______S, number_utilities.four_significant_digits(number_utilities.mean(values)));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str99$__Standard_Deviation______S, number_utilities.four_significant_digits(number_utilities.standard_deviation(values)));
            streams_high.terpri(stream);
            streams_high.force_output(stream);
        }
        finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 22521L)
    public static SubLObject expensive_cyclops_rules(SubLObject threshold) {
        if (threshold == system_benchmarks.UNPROVIDED) {
            threshold = (SubLObject)system_benchmarks.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        benchmark_cyclops_compensating_for_paging((SubLObject)system_benchmarks.THREE_INTEGER, (SubLObject)system_benchmarks.ONE_INTEGER, (SubLObject)system_benchmarks.UNPROVIDED, (SubLObject)system_benchmarks.UNPROVIDED);
        final SubLObject rules_one = expensive_cyclops_rules_int(threshold, system_benchmarks.$cyclops_rule_expensiveness_threshold$.getDynamicValue(thread));
        final SubLObject rules_two = expensive_cyclops_rules_int(threshold, system_benchmarks.$cyclops_rule_expensiveness_threshold$.getDynamicValue(thread));
        return keyhash_utilities.fast_intersection(rules_one, rules_two, (SubLObject)system_benchmarks.UNPROVIDED, (SubLObject)system_benchmarks.UNPROVIDED, (SubLObject)system_benchmarks.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 22970L)
    public static SubLObject expensive_cyclops_rules_int(final SubLObject threshold, final SubLObject stdev_threshold) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)system_benchmarks.NIL;
        inference_metrics.clear_forward_inference_metrics();
        final SubLObject _prev_bind_0 = inference_metrics.$gathering_forward_inference_metricsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$browse_forward_inferencesP$.currentBinding(thread);
        try {
            inference_metrics.$gathering_forward_inference_metricsP$.bind((SubLObject)system_benchmarks.T, thread);
            control_vars.$browse_forward_inferencesP$.bind((SubLObject)system_benchmarks.NIL, thread);
            benchmark_cyclops_compensating_for_paging((SubLObject)system_benchmarks.ZERO_INTEGER, (SubLObject)system_benchmarks.ONE_INTEGER, (SubLObject)system_benchmarks.UNPROVIDED, (SubLObject)system_benchmarks.UNPROVIDED);
            inference_metrics.finalize_forward_inference_metrics_inference_index();
        }
        finally {
            control_vars.$browse_forward_inferencesP$.rebind(_prev_bind_2, thread);
            inference_metrics.$gathering_forward_inference_metricsP$.rebind(_prev_bind_0, thread);
        }
        final SubLObject info = inference_metrics.forward_inference_metrics_info(threshold);
        final SubLObject global_statistics = inference_metrics.global_statistics_from_forward_inference_metrics_info(info);
        final SubLObject current;
        final SubLObject datum = current = global_statistics;
        final SubLObject average_time_per_rule_tail = cdestructuring_bind.property_list_member((SubLObject)system_benchmarks.$kw100$AVERAGE_TIME_PER_RULE, current);
        final SubLObject average_time_per_rule = (SubLObject)((system_benchmarks.NIL != average_time_per_rule_tail) ? conses_high.cadr(average_time_per_rule_tail) : system_benchmarks.NIL);
        final SubLObject stdev_time_per_rule_tail = cdestructuring_bind.property_list_member((SubLObject)system_benchmarks.$kw101$STDEV_TIME_PER_RULE, current);
        final SubLObject stdev_time_per_rule = (SubLObject)((system_benchmarks.NIL != stdev_time_per_rule_tail) ? conses_high.cadr(stdev_time_per_rule_tail) : system_benchmarks.NIL);
        SubLObject cdolist_list_var = info;
        SubLObject rule_info = (SubLObject)system_benchmarks.NIL;
        rule_info = cdolist_list_var.first();
        while (system_benchmarks.NIL != cdolist_list_var) {
            final SubLObject current_$36;
            final SubLObject datum_$35 = current_$36 = rule_info;
            final SubLObject rule_tail = cdestructuring_bind.property_list_member((SubLObject)system_benchmarks.$kw102$RULE, current_$36);
            final SubLObject rule = (SubLObject)((system_benchmarks.NIL != rule_tail) ? conses_high.cadr(rule_tail) : system_benchmarks.NIL);
            final SubLObject time_tail = cdestructuring_bind.property_list_member((SubLObject)system_benchmarks.$kw103$TIME, current_$36);
            final SubLObject time = (SubLObject)((system_benchmarks.NIL != time_tail) ? conses_high.cadr(time_tail) : system_benchmarks.NIL);
            final SubLObject inference_count_tail = cdestructuring_bind.property_list_member((SubLObject)system_benchmarks.$kw104$INFERENCE_COUNT, current_$36);
            final SubLObject inference_count = (SubLObject)((system_benchmarks.NIL != inference_count_tail) ? conses_high.cadr(inference_count_tail) : system_benchmarks.NIL);
            if (inference_count.isPositive()) {
                final SubLObject stdevs = number_utilities.standard_deviations_above_mean(time, average_time_per_rule, stdev_time_per_rule);
                if (stdevs.numG(stdev_threshold)) {
                    result = (SubLObject)ConsesLow.cons(rule, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            rule_info = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 23873L)
    public static SubLObject benchmark_parallel_cyclops_compensating_for_paging(SubLObject parallel_n, SubLObject throwaway_n, SubLObject sample_n, SubLObject power, SubLObject stream) {
        if (parallel_n == system_benchmarks.UNPROVIDED) {
            parallel_n = (SubLObject)system_benchmarks.TWO_INTEGER;
        }
        if (throwaway_n == system_benchmarks.UNPROVIDED) {
            throwaway_n = system_benchmarks.$cyclops_throwaway_default$.getGlobalValue();
        }
        if (sample_n == system_benchmarks.UNPROVIDED) {
            sample_n = (SubLObject)system_benchmarks.SEVEN_INTEGER;
        }
        if (power == system_benchmarks.UNPROVIDED) {
            power = system_benchmarks.$benchmark_cyclops_power$.getDynamicValue();
        }
        if (stream == system_benchmarks.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject total_n = Numbers.add(throwaway_n, sample_n);
        return median_parallel_cyclops(parallel_n, total_n, power, stream, throwaway_n);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 24763L)
    public static SubLObject benchmark_parallel_cyclops_efficiency(final SubLObject max_parallel_n, SubLObject throwaway_n, SubLObject sample_n, SubLObject stream) {
        if (throwaway_n == system_benchmarks.UNPROVIDED) {
            throwaway_n = system_benchmarks.$cyclops_throwaway_default$.getGlobalValue();
        }
        if (sample_n == system_benchmarks.UNPROVIDED) {
            sample_n = (SubLObject)system_benchmarks.SEVEN_INTEGER;
        }
        if (stream == system_benchmarks.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject raw_results = (SubLObject)system_benchmarks.NIL;
        SubLObject end_var;
        SubLObject parallel_n;
        SubLObject raw_result;
        SubLObject efficiency;
        for (end_var = number_utilities.f_1X(max_parallel_n), parallel_n = (SubLObject)system_benchmarks.NIL, parallel_n = (SubLObject)system_benchmarks.ONE_INTEGER; !parallel_n.numGE(end_var); parallel_n = number_utilities.f_1X(parallel_n)) {
            raw_result = benchmark_parallel_cyclops_compensating_for_paging(parallel_n, throwaway_n, sample_n, system_benchmarks.$benchmark_cyclops_power$.getDynamicValue(thread), StreamsLow.$null_output$.getDynamicValue(thread));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str106$___S____S, parallel_n, number_utilities.four_significant_digits(raw_result));
            raw_results = (SubLObject)ConsesLow.cons(raw_result, raw_results);
            efficiency = Numbers.divide(raw_result, Numbers.divide(conses_high.last(raw_results, (SubLObject)system_benchmarks.UNPROVIDED).first(), parallel_n));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str107$__eff____S, number_utilities.four_significant_digits(efficiency));
            streams_high.force_output(stream);
        }
        streams_high.terpri(stream);
        return Sequences.nreverse(raw_results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 25535L)
    public static SubLObject median_parallel_cyclops(final SubLObject parallel, final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
        if (power == system_benchmarks.UNPROVIDED) {
            power = system_benchmarks.$benchmark_cyclops_power$.getDynamicValue();
        }
        if (stream == system_benchmarks.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (throw_away_first_n == system_benchmarks.UNPROVIDED) {
            throw_away_first_n = (SubLObject)system_benchmarks.ZERO_INTEGER;
        }
        final SubLObject cyclops = number_utilities.median(benchmark_parallel_cyclops_n_times(parallel, n, power, stream, throw_away_first_n), (SubLObject)system_benchmarks.UNPROVIDED, (SubLObject)system_benchmarks.UNPROVIDED);
        final SubLObject bogomips = misc_utilities.machine_bogomips();
        if (system_benchmarks.NIL != bogomips) {
            return Values.values(cyclops, Numbers.divide(bogomips, cyclops));
        }
        return cyclops;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 26074L)
    public static SubLObject benchmark_parallel_cyclops_n_times(final SubLObject parallel, final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
        if (power == system_benchmarks.UNPROVIDED) {
            power = system_benchmarks.$benchmark_cyclops_power$.getDynamicValue();
        }
        if (stream == system_benchmarks.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (throw_away_first_n == system_benchmarks.UNPROVIDED) {
            throw_away_first_n = (SubLObject)system_benchmarks.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert system_benchmarks.NIL != subl_promotions.positive_integer_p(parallel) : parallel;
        assert system_benchmarks.NIL != subl_promotions.non_negative_integer_p(n) : n;
        assert system_benchmarks.NIL != subl_promotions.non_negative_integer_p(power) : power;
        SubLObject values = (SubLObject)system_benchmarks.NIL;
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
        try {
            SubLObject i;
            SubLObject guts_time;
            SubLObject cyclops;
            for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                guts_time = benchmark_parallel_cyclops_guts(parallel, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
                cyclops = benchmark_parallel_cyclops_compute_and_print_statistics(stream, parallel, power, guts_time);
                if (i.numGE(throw_away_first_n)) {
                    values = (SubLObject)ConsesLow.cons(cyclops, values);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                benchmark_cyclops_teardown(mt_1, mt_2, collections, parent, ancestor, sibling, family);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
            }
        }
        values = Sequences.nreverse(values);
        if (n.numG((SubLObject)system_benchmarks.ONE_INTEGER)) {
            benchmark_parallel_cyclops_print_statistical_summary(stream, parallel, values);
        }
        return values;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 27315L)
    public static SubLObject benchmark_parallel_cyclops_guts(final SubLObject parallel, final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
        Storage.gc_ephemeral();
        SubLObject time = (SubLObject)system_benchmarks.NIL;
        final SubLObject time_var = Time.get_internal_real_time();
        final SubLObject semaphore = Semaphores.new_semaphore((SubLObject)system_benchmarks.$str109$Parallel_CycLOPs, (SubLObject)system_benchmarks.ZERO_INTEGER);
        SubLObject i;
        SubLObject thread_name;
        for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(parallel); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
            thread_name = Sequences.cconcatenate((SubLObject)system_benchmarks.$str110$Parallel_CycLOPs_thread_, format_nil.format_nil_a_no_copy(i));
            subl_promotions.make_process_with_args(thread_name, (SubLObject)system_benchmarks.$sym111$BENCHMARK_PARALLEL_CYCLOPS_GUTS_THREAD, (SubLObject)ConsesLow.list(new SubLObject[] { i, semaphore, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family }));
        }
        for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(parallel); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
            Semaphores.semaphore_wait(semaphore);
        }
        time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 28078L)
    public static SubLObject benchmark_parallel_cyclops_guts_thread(final SubLObject thread_number, final SubLObject semaphore, final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
        try {
            benchmark_cyclops_guts_int(thread_number, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)system_benchmarks.T);
                final SubLObject _values = Values.getValuesAsVector();
                Semaphores.semaphore_signal(semaphore);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 28405L)
    public static SubLObject benchmark_parallel_cyclops_compute_and_print_statistics(final SubLObject stream, final SubLObject parallel, final SubLObject power, final SubLObject guts_time) {
        final SubLObject k = Numbers.subtract(Numbers.expt((SubLObject)system_benchmarks.TWO_INTEGER, power), (SubLObject)system_benchmarks.ONE_INTEGER);
        final SubLObject efficiency = Numbers.divide(guts_time, k);
        final SubLObject cyclops = Numbers.invert(efficiency);
        final SubLObject bogomips = misc_utilities.machine_bogomips();
        benchmark_parallel_cyclops_print_statistics(stream, parallel, bogomips, k, guts_time, efficiency, cyclops);
        return cyclops;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 28799L)
    public static SubLObject benchmark_parallel_cyclops_print_statistics(final SubLObject stream, final SubLObject parallel, final SubLObject bogomips, final SubLObject k, final SubLObject guts_time, final SubLObject efficiency, final SubLObject cyclops) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
            reader.$read_default_float_format$.bind((SubLObject)system_benchmarks.$sym79$DOUBLE_FLOAT, thread);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str112$__Parallel_CycLOPs_Benchmark_Resu);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str81$_________________________________);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), control_vars.kb_loaded() });
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str113$__Parallelism_________S, parallel);
            if (system_benchmarks.NIL != bogomips) {
                PrintLow.format(stream, (SubLObject)system_benchmarks.$str83$__Bogomips______S, bogomips);
            }
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str84$__Scaling_factor______S, k);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str85$__Elapsed_time__seconds_______S, number_utilities.significant_digits(guts_time, (SubLObject)system_benchmarks.FOUR_INTEGER));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str86$__Efficiency__seconds_op_______S, number_utilities.significant_digits(efficiency, (SubLObject)system_benchmarks.FOUR_INTEGER));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str87$__CycLOPs______S, number_utilities.significant_digits(cyclops, (SubLObject)system_benchmarks.FOUR_INTEGER));
            if (system_benchmarks.NIL != bogomips) {
                PrintLow.format(stream, (SubLObject)system_benchmarks.$str88$__Bogomips_CycLOPs_______S, number_utilities.significant_digits(Numbers.divide(bogomips, cyclops), (SubLObject)system_benchmarks.FOUR_INTEGER));
            }
            streams_high.terpri(stream);
            streams_high.force_output(stream);
        }
        finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 29886L)
    public static SubLObject benchmark_parallel_cyclops_print_statistical_summary(final SubLObject stream, final SubLObject parallel, final SubLObject values) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
            reader.$read_default_float_format$.bind((SubLObject)system_benchmarks.$sym79$DOUBLE_FLOAT, thread);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str114$__Parallel_CycLOPs_Benchmark_Stat);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str81$_________________________________);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), control_vars.kb_loaded() });
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str113$__Parallelism_________S, parallel);
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str90$__Raw_Data______S, Mapping.mapcar((SubLObject)system_benchmarks.$sym91$FOUR_SIGNIFICANT_DIGITS, values));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str92$__Sorted_Data______S, Mapping.mapcar((SubLObject)system_benchmarks.$sym91$FOUR_SIGNIFICANT_DIGITS, Sort.sort(conses_high.copy_list(values), Symbols.symbol_function((SubLObject)system_benchmarks.$sym93$_), (SubLObject)system_benchmarks.UNPROVIDED)));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str94$__N______S, Sequences.length(values));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str95$__Min______S, number_utilities.four_significant_digits(number_utilities.minimum(values, (SubLObject)system_benchmarks.UNPROVIDED)));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str96$__Max______S, number_utilities.four_significant_digits(number_utilities.maximum(values, (SubLObject)system_benchmarks.UNPROVIDED)));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str97$__Median______S, number_utilities.four_significant_digits(number_utilities.median(values, (SubLObject)system_benchmarks.UNPROVIDED, (SubLObject)system_benchmarks.UNPROVIDED)));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str98$__Mean______S, number_utilities.four_significant_digits(number_utilities.mean(values)));
            PrintLow.format(stream, (SubLObject)system_benchmarks.$str99$__Standard_Deviation______S, number_utilities.four_significant_digits(number_utilities.standard_deviation(values)));
            streams_high.terpri(stream);
            streams_high.force_output(stream);
        }
        finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 31159L)
    public static SubLObject massive_assert_benchmark(final SubLObject gaf_count, final SubLObject term_count, final SubLObject predicate_count, final SubLObject mt_count, SubLObject v_properties) {
        if (v_properties == system_benchmarks.UNPROVIDED) {
            v_properties = (SubLObject)system_benchmarks.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (system_benchmarks.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !Numbers.multiply(term_count, term_count).numGE(gaf_count)) {
            Errors.error((SubLObject)system_benchmarks.$str115$Not_enough_terms_provided);
        }
        SubLObject time = (SubLObject)system_benchmarks.NIL;
        thread.resetMultipleValues();
        final SubLObject preds = massive_assert_benchmark_setup(predicate_count, term_count, mt_count);
        final SubLObject terms = thread.secondMultipleValue();
        final SubLObject mts = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        try {
            final SubLObject message = Sequences.cconcatenate((SubLObject)system_benchmarks.$str116$Asserting_, new SubLObject[] { format_nil.format_nil_s_no_copy(gaf_count), system_benchmarks.$str117$_GAFs });
            final SubLObject time_var = Time.get_internal_real_time();
            final SubLObject _prev_bind_0 = utilities_macros.$progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = utilities_macros.$progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$progress_note$.bind(message, thread);
                utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                utilities_macros.$progress_total$.bind(gaf_count, thread);
                utilities_macros.$progress_sofar$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)system_benchmarks.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)system_benchmarks.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)system_benchmarks.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                    SubLObject i;
                    SubLObject pred_index;
                    SubLObject term_a_index;
                    SubLObject term_b_index;
                    SubLObject mt_index;
                    SubLObject pred;
                    SubLObject term_a;
                    SubLObject term_b;
                    SubLObject mt;
                    for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
                        pred_index = Numbers.mod(i, predicate_count);
                        term_a_index = Numbers.integerDivide(i, term_count);
                        term_b_index = Numbers.mod(i, term_count);
                        mt_index = Numbers.mod(i, mt_count);
                        pred = Vectors.aref(preds, pred_index);
                        term_a = Vectors.aref(terms, term_a_index);
                        term_b = Vectors.aref(terms, term_b_index);
                        mt = Vectors.aref(mts, mt_index);
                        massive_assert_benchmark_add(pred, term_a, term_b, mt, v_properties);
                        utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)system_benchmarks.ONE_INTEGER), thread);
                        utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$37 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
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
            time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        }
        finally {
            final SubLObject _prev_bind_9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)system_benchmarks.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                massive_assert_benchmark_teardown(preds, terms, mts);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return time;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 32479L)
    public static SubLObject massive_assert_benchmark_setup(final SubLObject predicate_count, final SubLObject term_count, final SubLObject mt_count) {
        final SubLObject preds = Vectors.make_vector(predicate_count, (SubLObject)system_benchmarks.UNPROVIDED);
        final SubLObject terms = Vectors.make_vector(term_count, (SubLObject)system_benchmarks.UNPROVIDED);
        final SubLObject mts = Vectors.make_vector(mt_count, (SubLObject)system_benchmarks.UNPROVIDED);
        SubLObject i;
        SubLObject name;
        SubLObject pred;
        for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(predicate_count); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
            name = Sequences.cconcatenate((SubLObject)system_benchmarks.$str118$mAB_P_, format_nil.format_nil_a_no_copy(i));
            pred = cyc_kernel.cyc_create_new_ephemeral(name);
            cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, pred, (SubLObject)system_benchmarks.$list31), system_benchmarks.$const119$UniversalVocabularyMt, (SubLObject)system_benchmarks.UNPROVIDED);
            Vectors.set_aref(preds, i, pred);
        }
        SubLObject v_term;
        for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(term_count); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
            name = Sequences.cconcatenate((SubLObject)system_benchmarks.$str120$MAB_T_, format_nil.format_nil_a_no_copy(i));
            v_term = cyc_kernel.cyc_create_new_ephemeral(name);
            cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, v_term, (SubLObject)system_benchmarks.$list56), system_benchmarks.$const119$UniversalVocabularyMt, (SubLObject)system_benchmarks.UNPROVIDED);
            Vectors.set_aref(terms, i, v_term);
        }
        SubLObject mt;
        for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(mt_count); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
            name = Sequences.cconcatenate((SubLObject)system_benchmarks.$str121$MAB_M_, format_nil.format_nil_a_no_copy(i));
            mt = cyc_kernel.cyc_create_new_ephemeral(name);
            cyc_kernel.cyc_assert_wff((SubLObject)ConsesLow.listS(system_benchmarks.$const9$isa, mt, (SubLObject)system_benchmarks.$list10), system_benchmarks.$const119$UniversalVocabularyMt, (SubLObject)system_benchmarks.UNPROVIDED);
            Vectors.set_aref(mts, i, mt);
        }
        return Values.values(preds, terms, mts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 33399L)
    public static SubLObject massive_assert_benchmark_teardown(final SubLObject preds, final SubLObject terms, final SubLObject mts) {
        SubLObject backwardP_var = (SubLObject)system_benchmarks.NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject v_term;
        for (length = Sequences.length(terms), v_iteration = (SubLObject)system_benchmarks.NIL, v_iteration = (SubLObject)system_benchmarks.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)system_benchmarks.ONE_INTEGER)) {
            element_num = ((system_benchmarks.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)system_benchmarks.ONE_INTEGER) : v_iteration);
            v_term = Vectors.aref(terms, element_num);
            cyc_kernel.cyc_kill(v_term);
        }
        backwardP_var = (SubLObject)system_benchmarks.NIL;
        SubLObject pred;
        for (length = Sequences.length(preds), v_iteration = (SubLObject)system_benchmarks.NIL, v_iteration = (SubLObject)system_benchmarks.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)system_benchmarks.ONE_INTEGER)) {
            element_num = ((system_benchmarks.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)system_benchmarks.ONE_INTEGER) : v_iteration);
            pred = Vectors.aref(preds, element_num);
            cyc_kernel.cyc_kill(pred);
        }
        backwardP_var = (SubLObject)system_benchmarks.NIL;
        SubLObject mt;
        for (length = Sequences.length(mts), v_iteration = (SubLObject)system_benchmarks.NIL, v_iteration = (SubLObject)system_benchmarks.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)system_benchmarks.ONE_INTEGER)) {
            element_num = ((system_benchmarks.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)system_benchmarks.ONE_INTEGER) : v_iteration);
            mt = Vectors.aref(mts, element_num);
            cyc_kernel.cyc_kill(mt);
        }
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 33609L)
    public static SubLObject massive_assert_benchmark_add(final SubLObject pred, final SubLObject term_a, final SubLObject term_b, final SubLObject mt, final SubLObject v_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject assume_wffP_tail = cdestructuring_bind.property_list_member((SubLObject)system_benchmarks.$kw122$ASSUME_WFF_, v_properties);
        final SubLObject assume_wffP = (SubLObject)((system_benchmarks.NIL != assume_wffP_tail) ? conses_high.cadr(assume_wffP_tail) : system_benchmarks.NIL);
        final SubLObject disable_forwardP_tail = cdestructuring_bind.property_list_member((SubLObject)system_benchmarks.$kw123$DISABLE_FORWARD_, v_properties);
        final SubLObject disable_forwardP = (SubLObject)((system_benchmarks.NIL != disable_forwardP_tail) ? conses_high.cadr(disable_forwardP_tail) : system_benchmarks.NIL);
        final SubLObject sentence = (SubLObject)ConsesLow.list(pred, term_a, term_b);
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind((SubLObject)SubLObjectFactory.makeBoolean(system_benchmarks.NIL == disable_forwardP), thread);
            if (system_benchmarks.NIL != assume_wffP) {
                cyc_kernel.cyc_assert_wff(sentence, mt, (SubLObject)system_benchmarks.UNPROVIDED);
            }
            else {
                cyc_kernel.cyc_assert(sentence, mt, (SubLObject)system_benchmarks.UNPROVIDED);
            }
        }
        finally {
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/system-benchmarks.lisp", position = 34010L)
    public static SubLObject benchmark_cyclops_sample(final SubLObject power, SubLObject trials) {
        if (trials == system_benchmarks.UNPROVIDED) {
            trials = (SubLObject)system_benchmarks.FIVE_INTEGER;
        }
        SubLObject times = (SubLObject)system_benchmarks.NIL;
        SubLObject i;
        for (i = (SubLObject)system_benchmarks.NIL, i = (SubLObject)system_benchmarks.ZERO_INTEGER; i.numL(trials); i = Numbers.add(i, (SubLObject)system_benchmarks.ONE_INTEGER)) {
            times = (SubLObject)ConsesLow.cons(benchmark_cyclops(power, (SubLObject)system_benchmarks.UNPROVIDED), times);
        }
        times = Sort.sort(times, Symbols.symbol_function((SubLObject)system_benchmarks.$sym93$_), (SubLObject)system_benchmarks.UNPROVIDED);
        times = conses_high.ldiff(times.rest(), conses_high.last(times, (SubLObject)system_benchmarks.UNPROVIDED));
        return number_utilities.mean(times);
    }
    
    public static SubLObject declare_system_benchmarks_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_compensating_for_paging", "BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_n_times", "BENCHMARK-CYCLOPS-N-TIMES", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops", "BENCHMARK-CYCLOPS", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "median_cyclops", "MEDIAN-CYCLOPS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "max_cyclops", "MAX-CYCLOPS", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_setup_and_teardown", "BENCHMARK-CYCLOPS-SETUP-AND-TEARDOWN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_setup", "BENCHMARK-CYCLOPS-SETUP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_guts", "BENCHMARK-CYCLOPS-GUTS", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_guts_int", "BENCHMARK-CYCLOPS-GUTS-INT", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_teardown", "BENCHMARK-CYCLOPS-TEARDOWN", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_compute_and_print_statistics", "BENCHMARK-CYCLOPS-COMPUTE-AND-PRINT-STATISTICS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_create_mts", "BENCHMARK-CYCLOPS-CREATE-MTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_create_ontology", "BENCHMARK-CYCLOPS-CREATE-ONTOLOGY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_create_parent", "BENCHMARK-CYCLOPS-CREATE-PARENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_create_ancestor", "BENCHMARK-CYCLOPS-CREATE-ANCESTOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_create_sibling", "BENCHMARK-CYCLOPS-CREATE-SIBLING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_create_family", "BENCHMARK-CYCLOPS-CREATE-FAMILY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_define_predicates", "BENCHMARK-CYCLOPS-DEFINE-PREDICATES", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_assert_sibling_rule", "BENCHMARK-CYCLOPS-ASSERT-SIBLING-RULE", 5, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.system_benchmarks", "with_cyclops_lock", "WITH-CYCLOPS-LOCK");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_create_terms", "BENCHMARK-CYCLOPS-CREATE-TERMS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_create_term", "BENCHMARK-CYCLOPS-CREATE-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_assert_family_links", "BENCHMARK-CYCLOPS-ASSERT-FAMILY-LINKS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_assert_parent_links", "BENCHMARK-CYCLOPS-ASSERT-PARENT-LINKS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_query", "BENCHMARK-CYCLOPS-QUERY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_query_parent_links", "BENCHMARK-CYCLOPS-QUERY-PARENT-LINKS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_query_ancestor_links", "BENCHMARK-CYCLOPS-QUERY-ANCESTOR-LINKS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_query_sibling_links_via_rule", "BENCHMARK-CYCLOPS-QUERY-SIBLING-LINKS-VIA-RULE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_forward_propagate_sibling_rule", "BENCHMARK-CYCLOPS-FORWARD-PROPAGATE-SIBLING-RULE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_turn_sibling_rule_backward", "BENCHMARK-CYCLOPS-TURN-SIBLING-RULE-BACKWARD", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_query_sibling_links_via_lookup", "BENCHMARK-CYCLOPS-QUERY-SIBLING-LINKS-VIA-LOOKUP", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_kill_terms", "BENCHMARK-CYCLOPS-KILL-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_kill_vocabulary", "BENCHMARK-CYCLOPS-KILL-VOCABULARY", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_print_statistics", "BENCHMARK-CYCLOPS-PRINT-STATISTICS", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_print_statistical_summary", "BENCHMARK-CYCLOPS-PRINT-STATISTICAL-SUMMARY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "expensive_cyclops_rules", "EXPENSIVE-CYCLOPS-RULES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "expensive_cyclops_rules_int", "EXPENSIVE-CYCLOPS-RULES-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_parallel_cyclops_compensating_for_paging", "BENCHMARK-PARALLEL-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 5, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_parallel_cyclops_efficiency", "BENCHMARK-PARALLEL-CYCLOPS-EFFICIENCY", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "median_parallel_cyclops", "MEDIAN-PARALLEL-CYCLOPS", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_parallel_cyclops_n_times", "BENCHMARK-PARALLEL-CYCLOPS-N-TIMES", 2, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_parallel_cyclops_guts", "BENCHMARK-PARALLEL-CYCLOPS-GUTS", 9, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_parallel_cyclops_guts_thread", "BENCHMARK-PARALLEL-CYCLOPS-GUTS-THREAD", 10, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_parallel_cyclops_compute_and_print_statistics", "BENCHMARK-PARALLEL-CYCLOPS-COMPUTE-AND-PRINT-STATISTICS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_parallel_cyclops_print_statistics", "BENCHMARK-PARALLEL-CYCLOPS-PRINT-STATISTICS", 7, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_parallel_cyclops_print_statistical_summary", "BENCHMARK-PARALLEL-CYCLOPS-PRINT-STATISTICAL-SUMMARY", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "massive_assert_benchmark", "MASSIVE-ASSERT-BENCHMARK", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "massive_assert_benchmark_setup", "MASSIVE-ASSERT-BENCHMARK-SETUP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "massive_assert_benchmark_teardown", "MASSIVE-ASSERT-BENCHMARK-TEARDOWN", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "massive_assert_benchmark_add", "MASSIVE-ASSERT-BENCHMARK-ADD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.system_benchmarks", "benchmark_cyclops_sample", "BENCHMARK-CYCLOPS-SAMPLE", 1, 1, false);
        return (SubLObject)system_benchmarks.NIL;
    }
    
    public static SubLObject init_system_benchmarks_file() {
        system_benchmarks.$cyclops_family_fix_enabledP$ = SubLFiles.defvar("*CYCLOPS-FAMILY-FIX-ENABLED?*", (SubLObject)system_benchmarks.NIL);
        system_benchmarks.$cyclops_anect_fix_enabledP$ = SubLFiles.defparameter("*CYCLOPS-ANECT-FIX-ENABLED?*", (SubLObject)system_benchmarks.T);
        system_benchmarks.$benchmark_cyclops_power$ = SubLFiles.defvar("*BENCHMARK-CYCLOPS-POWER*", (SubLObject)system_benchmarks.SIX_INTEGER);
        system_benchmarks.$benchmark_cyclops_ontology_root$ = SubLFiles.defvar("*BENCHMARK-CYCLOPS-ONTOLOGY-ROOT*", system_benchmarks.$const0$Individual);
        system_benchmarks.$cyclops_throwaway_default$ = SubLFiles.deflexical("*CYCLOPS-THROWAWAY-DEFAULT*", (SubLObject)system_benchmarks.$int1$33);
        system_benchmarks.$cyclops_lockedP$ = SubLFiles.defparameter("*CYCLOPS-LOCKED?*", (SubLObject)system_benchmarks.NIL);
        system_benchmarks.$cyclops_lock$ = SubLFiles.deflexical("*CYCLOPS-LOCK*", maybeDefault((SubLObject)system_benchmarks.$sym49$_CYCLOPS_LOCK_, system_benchmarks.$cyclops_lock$, ()->(Locks.make_lock((SubLObject)system_benchmarks.$str50$CycLOPs_lock))));
        system_benchmarks.$cyclops_rule_expensiveness_threshold$ = SubLFiles.defparameter("*CYCLOPS-RULE-EXPENSIVENESS-THRESHOLD*", (SubLObject)system_benchmarks.TWO_INTEGER);
        return (SubLObject)system_benchmarks.NIL;
    }
    
    public static SubLObject setup_system_benchmarks_file() {
        access_macros.register_external_symbol((SubLObject)system_benchmarks.$sym2$BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING);
        access_macros.register_external_symbol((SubLObject)system_benchmarks.$sym48$_CYCLOPS_LOCKED__);
        subl_macro_promotions.declare_defglobal((SubLObject)system_benchmarks.$sym49$_CYCLOPS_LOCK_);
        access_macros.register_external_symbol((SubLObject)system_benchmarks.$sym105$BENCHMARK_PARALLEL_CYCLOPS_COMPENSATING_FOR_PAGING);
        access_macros.define_obsolete_register((SubLObject)system_benchmarks.$sym124$BENCHMARK_CYCLOPS_SAMPLE, (SubLObject)system_benchmarks.$list125);
        return (SubLObject)system_benchmarks.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_system_benchmarks_file();
    }
    
    @Override
	public void initializeVariables() {
        init_system_benchmarks_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_system_benchmarks_file();
    }
    
    static {
        me = (SubLFile)new system_benchmarks();
        system_benchmarks.$cyclops_family_fix_enabledP$ = null;
        system_benchmarks.$cyclops_anect_fix_enabledP$ = null;
        system_benchmarks.$benchmark_cyclops_power$ = null;
        system_benchmarks.$benchmark_cyclops_ontology_root$ = null;
        system_benchmarks.$cyclops_throwaway_default$ = null;
        system_benchmarks.$cyclops_lockedP$ = null;
        system_benchmarks.$cyclops_lock$ = null;
        system_benchmarks.$cyclops_rule_expensiveness_threshold$ = null;
        $const0$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $int1$33 = SubLObjectFactory.makeInteger(33);
        $sym2$BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING = SubLObjectFactory.makeSymbol("BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING");
        $sym3$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
        $kw4$LENIENT = SubLObjectFactory.makeKeyword("LENIENT");
        $kw5$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym6$QUEUE_P = SubLObjectFactory.makeSymbol("QUEUE-P");
        $str7$Mt_1 = SubLObjectFactory.makeString("Mt-1");
        $str8$Mt_2 = SubLObjectFactory.makeString("Mt-2");
        $const9$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $list10 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Microtheory")));
        $const11$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("STRENGTH"), (SubLObject)SubLObjectFactory.makeKeyword("MONOTONIC"), (SubLObject)SubLObjectFactory.makeKeyword("DIRECTION"), (SubLObject)SubLObjectFactory.makeKeyword("FORWARD"));
        $const13$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $str14$Creating_collection_ontology = SubLObjectFactory.makeString("Creating collection ontology");
        $int15$25 = SubLObjectFactory.makeInteger(25);
        $str16$Col_ = SubLObjectFactory.makeString("Col-");
        $list17 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Collection")));
        $const18$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $str19$parent = SubLObjectFactory.makeString("parent");
        $list20 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IrreflexiveBinaryPredicate")));
        $list21 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AsymmetricBinaryPredicate")));
        $const22$arg1Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Isa"));
        $const23$arg2Isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Isa"));
        $str24$ancestor = SubLObjectFactory.makeString("ancestor");
        $list25 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ReflexiveBinaryPredicate")));
        $list26 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AntiSymmetricBinaryPredicate")));
        $list27 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TransitiveBinaryPredicate")));
        $str28$sibling = SubLObjectFactory.makeString("sibling");
        $list29 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SymmetricBinaryPredicate")));
        $str30$family = SubLObjectFactory.makeString("family");
        $list31 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BinaryPredicate")));
        $list32 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Integer")));
        $const33$genlPreds = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds"));
        $kw34$BACKWARD = SubLObjectFactory.makeKeyword("BACKWARD");
        $kw35$STRENGTH = SubLObjectFactory.makeKeyword("STRENGTH");
        $kw36$MONOTONIC = SubLObjectFactory.makeKeyword("MONOTONIC");
        $kw37$DIRECTION = SubLObjectFactory.makeKeyword("DIRECTION");
        $const38$implies = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies"));
        $const39$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list40 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different")), (SubLObject)SubLObjectFactory.makeSymbol("?CHILD-1"), (SubLObject)SubLObjectFactory.makeSymbol("?CHILD-2"));
        $sym41$_PARENT = SubLObjectFactory.makeSymbol("?PARENT");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CHILD-1"), (SubLObject)SubLObjectFactory.makeSymbol("?PARENT"));
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CHILD-2"), (SubLObject)SubLObjectFactory.makeSymbol("?PARENT"));
        $list44 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?CHILD-1"), (SubLObject)SubLObjectFactory.makeSymbol("?CHILD-2"));
        $const45$different = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("different"));
        $sym46$_CHILD_1 = SubLObjectFactory.makeSymbol("?CHILD-1");
        $sym47$_CHILD_2 = SubLObjectFactory.makeSymbol("?CHILD-2");
        $sym48$_CYCLOPS_LOCKED__ = SubLObjectFactory.makeSymbol("*CYCLOPS-LOCKED?*");
        $sym49$_CYCLOPS_LOCK_ = SubLObjectFactory.makeSymbol("*CYCLOPS-LOCK*");
        $str50$CycLOPs_lock = SubLObjectFactory.makeString("CycLOPs lock");
        $sym51$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym52$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list53 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*CYCLOPS-LOCK*"));
        $sym54$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $str55$Creating_terms = SubLObjectFactory.makeString("Creating terms");
        $list56 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual")));
        $sym57$VECTOR = SubLObjectFactory.makeSymbol("VECTOR");
        $str58$Term_ = SubLObjectFactory.makeString("Term-");
        $str59$_ = SubLObjectFactory.makeString("-");
        $str60$Asserting_family_links = SubLObjectFactory.makeString("Asserting family links");
        $str61$Asserting_parent_links = SubLObjectFactory.makeString("Asserting parent links");
        $sym62$WARN = SubLObjectFactory.makeSymbol("WARN");
        $sym63$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str64$Asking_parent_links = SubLObjectFactory.makeString("Asking parent links");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?PARENT"));
        $str66$CycLOPs_error_asking_parent__S = SubLObjectFactory.makeString("CycLOPs error asking parent ~S");
        $str67$Asking_ancestor_links = SubLObjectFactory.makeString("Asking ancestor links");
        $list68 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?ANCEST"));
        $str69$CycLOPs_error__asking_ancestor__S = SubLObjectFactory.makeString("CycLOPs error: asking ancestor ~S");
        $str70$Asking_sibling_links = SubLObjectFactory.makeString("Asking sibling links");
        $list71 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?SIBLING"));
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), (SubLObject)system_benchmarks.ONE_INTEGER);
        $str73$CycLOPs_error__asking_sibling__S_ = SubLObjectFactory.makeString("CycLOPs error: asking sibling ~S via rule");
        $kw74$FORWARD = SubLObjectFactory.makeKeyword("FORWARD");
        $str75$CycLOPs_error__asking_sibling__S = SubLObjectFactory.makeString("CycLOPs error: asking sibling ~S");
        $str76$Killing_terms = SubLObjectFactory.makeString("Killing terms");
        $str77$Killing_collections = SubLObjectFactory.makeString("Killing collections");
        $str78$cdolist = SubLObjectFactory.makeString("cdolist");
        $sym79$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $str80$__CycLOPs_Benchmark_Results = SubLObjectFactory.makeString("~%CycLOPs Benchmark Results");
        $str81$_________________________________ = SubLObjectFactory.makeString("~%========================================");
        $str82$__System__S__S_KB__S = SubLObjectFactory.makeString("~%System ~S.~S KB ~S");
        $str83$__Bogomips______S = SubLObjectFactory.makeString("~%Bogomips :~% ~S");
        $str84$__Scaling_factor______S = SubLObjectFactory.makeString("~%Scaling factor :~% ~S");
        $str85$__Elapsed_time__seconds_______S = SubLObjectFactory.makeString("~%Elapsed time (seconds) :~% ~S");
        $str86$__Efficiency__seconds_op_______S = SubLObjectFactory.makeString("~%Efficiency (seconds/op) :~% ~S");
        $str87$__CycLOPs______S = SubLObjectFactory.makeString("~%CycLOPs :~% ~S");
        $str88$__Bogomips_CycLOPs_______S = SubLObjectFactory.makeString("~%Bogomips/CycLOPs : ~% ~S");
        $str89$__CycLOPs_Benchmark_Statistical_S = SubLObjectFactory.makeString("~%CycLOPs Benchmark Statistical Summary");
        $str90$__Raw_Data______S = SubLObjectFactory.makeString("~%Raw Data :~% ~S");
        $sym91$FOUR_SIGNIFICANT_DIGITS = SubLObjectFactory.makeSymbol("FOUR-SIGNIFICANT-DIGITS");
        $str92$__Sorted_Data______S = SubLObjectFactory.makeString("~%Sorted Data :~% ~S");
        $sym93$_ = SubLObjectFactory.makeSymbol("<");
        $str94$__N______S = SubLObjectFactory.makeString("~%N :~% ~S");
        $str95$__Min______S = SubLObjectFactory.makeString("~%Min :~% ~S");
        $str96$__Max______S = SubLObjectFactory.makeString("~%Max :~% ~S");
        $str97$__Median______S = SubLObjectFactory.makeString("~%Median :~% ~S");
        $str98$__Mean______S = SubLObjectFactory.makeString("~%Mean :~% ~S");
        $str99$__Standard_Deviation______S = SubLObjectFactory.makeString("~%Standard Deviation :~% ~S");
        $kw100$AVERAGE_TIME_PER_RULE = SubLObjectFactory.makeKeyword("AVERAGE-TIME-PER-RULE");
        $kw101$STDEV_TIME_PER_RULE = SubLObjectFactory.makeKeyword("STDEV-TIME-PER-RULE");
        $kw102$RULE = SubLObjectFactory.makeKeyword("RULE");
        $kw103$TIME = SubLObjectFactory.makeKeyword("TIME");
        $kw104$INFERENCE_COUNT = SubLObjectFactory.makeKeyword("INFERENCE-COUNT");
        $sym105$BENCHMARK_PARALLEL_CYCLOPS_COMPENSATING_FOR_PAGING = SubLObjectFactory.makeSymbol("BENCHMARK-PARALLEL-CYCLOPS-COMPENSATING-FOR-PAGING");
        $str106$___S____S = SubLObjectFactory.makeString("~%~S = ~S");
        $str107$__eff____S = SubLObjectFactory.makeString("  eff = ~S");
        $sym108$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $str109$Parallel_CycLOPs = SubLObjectFactory.makeString("Parallel CycLOPs");
        $str110$Parallel_CycLOPs_thread_ = SubLObjectFactory.makeString("Parallel CycLOPs thread ");
        $sym111$BENCHMARK_PARALLEL_CYCLOPS_GUTS_THREAD = SubLObjectFactory.makeSymbol("BENCHMARK-PARALLEL-CYCLOPS-GUTS-THREAD");
        $str112$__Parallel_CycLOPs_Benchmark_Resu = SubLObjectFactory.makeString("~%Parallel CycLOPs Benchmark Results");
        $str113$__Parallelism_________S = SubLObjectFactory.makeString("~%Parallelism    :~% ~S");
        $str114$__Parallel_CycLOPs_Benchmark_Stat = SubLObjectFactory.makeString("~%Parallel CycLOPs Benchmark Statistical Summary");
        $str115$Not_enough_terms_provided = SubLObjectFactory.makeString("Not enough terms provided");
        $str116$Asserting_ = SubLObjectFactory.makeString("Asserting ");
        $str117$_GAFs = SubLObjectFactory.makeString(" GAFs");
        $str118$mAB_P_ = SubLObjectFactory.makeString("mAB-P-");
        $const119$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $str120$MAB_T_ = SubLObjectFactory.makeString("MAB-T-");
        $str121$MAB_M_ = SubLObjectFactory.makeString("MAB-M-");
        $kw122$ASSUME_WFF_ = SubLObjectFactory.makeKeyword("ASSUME-WFF?");
        $kw123$DISABLE_FORWARD_ = SubLObjectFactory.makeKeyword("DISABLE-FORWARD?");
        $sym124$BENCHMARK_CYCLOPS_SAMPLE = SubLObjectFactory.makeSymbol("BENCHMARK-CYCLOPS-SAMPLE");
        $list125 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING"));
    }
}

/*

	Total time: 637 ms
	
*/