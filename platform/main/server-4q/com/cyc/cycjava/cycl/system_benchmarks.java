/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.subl_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.ArrayList;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SYSTEM-BENCHMARKS
 * source file: /cyc/top/cycl/system-benchmarks.lisp
 * created:     2019/07/03 17:37:49
 */
public final class system_benchmarks extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new system_benchmarks();

 public static final String myName = "com.cyc.cycjava.cycl.system_benchmarks";


    // defvar
    // Definitions
    /**
     * When non-NIL, a uniquifying FAMILY predicate is added
     */
    @LispMethod(comment = "When non-NIL, a uniquifying FAMILY predicate is added\ndefvar")
    private static final SubLSymbol $cyclops_family_fix_enabledP$ = makeSymbol("*CYCLOPS-FAMILY-FIX-ENABLED?*");

    // defparameter
    @LispMethod(comment = "Temporary control variable;\r\nWhen non-nil\r\n(1) we assert the ANECT of the created term in BaseKB\r\n(2) we assert the the non-ANECTs of the term in a lower Mt\r\nWhen nil\r\n(1) we only assert the non-ANECTs of the term in BaseKB.\ndefparameter\nTemporary control variable;\nWhen non-nil\n(1) we assert the ANECT of the created term in BaseKB\n(2) we assert the the non-ANECTs of the term in a lower Mt\nWhen nil\n(1) we only assert the non-ANECTs of the term in BaseKB.")
    private static final SubLSymbol $cyclops_anect_fix_enabledP$ = makeSymbol("*CYCLOPS-ANECT-FIX-ENABLED?*");

    // defvar
    @LispMethod(comment = "defvar")
    private static final SubLSymbol $benchmark_cyclops_power$ = makeSymbol("*BENCHMARK-CYCLOPS-POWER*");

    // defvar
    @LispMethod(comment = "The top of the ontology created by CycLOPs.\ndefvar")
    private static final SubLSymbol $benchmark_cyclops_ontology_root$ = makeSymbol("*BENCHMARK-CYCLOPS-ONTOLOGY-ROOT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cyclops_throwaway_default$ = makeSymbol("*CYCLOPS-THROWAWAY-DEFAULT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $cyclops_rule_expensiveness_threshold$ = makeSymbol("*CYCLOPS-RULE-EXPENSIVENESS-THRESHOLD*");

    private static final SubLSymbol BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING = makeSymbol("BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING");

    private static final SubLString $str7$Mt_1 = makeString("Mt-1");

    private static final SubLString $str8$Mt_2 = makeString("Mt-2");

    private static final SubLList $list10 = list(reader_make_constant_shell("Microtheory"));

    private static final SubLList $list12 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DIRECTION"), makeKeyword("FORWARD"));

    private static final SubLString $$$Creating_collection_ontology = makeString("Creating collection ontology");

    private static final SubLString $str16$Col_ = makeString("Col-");

    private static final SubLList $list17 = list(reader_make_constant_shell("Collection"));

    private static final SubLString $$$parent = makeString("parent");

    static private final SubLList $list20 = list(reader_make_constant_shell("IrreflexiveBinaryPredicate"));

    private static final SubLList $list21 = list(reader_make_constant_shell("AsymmetricBinaryPredicate"));

    private static final SubLString $$$ancestor = makeString("ancestor");

    static private final SubLList $list25 = list(reader_make_constant_shell("ReflexiveBinaryPredicate"));

    static private final SubLList $list26 = list(reader_make_constant_shell("AntiSymmetricBinaryPredicate"));

    private static final SubLList $list27 = list(reader_make_constant_shell("TransitiveBinaryPredicate"));

    private static final SubLString $$$sibling = makeString("sibling");

    private static final SubLList $list29 = list(reader_make_constant_shell("SymmetricBinaryPredicate"));

    private static final SubLString $$$family = makeString("family");

    static private final SubLList $list31 = list(reader_make_constant_shell("BinaryPredicate"));

    private static final SubLList $list32 = list(reader_make_constant_shell("Integer"));

    private static final SubLList $list40 = list(reader_make_constant_shell("different"), makeSymbol("?CHILD-1"), makeSymbol("?CHILD-2"));

    private static final SubLSymbol $sym41$_PARENT = makeSymbol("?PARENT");

    static private final SubLList $list42 = list(makeSymbol("?CHILD-1"), makeSymbol("?PARENT"));

    static private final SubLList $list43 = list(makeSymbol("?CHILD-2"), makeSymbol("?PARENT"));

    private static final SubLList $list44 = list(makeSymbol("?CHILD-1"), makeSymbol("?CHILD-2"));

    private static final SubLSymbol $sym46$_CHILD_1 = makeSymbol("?CHILD-1");

    private static final SubLSymbol $sym47$_CHILD_2 = makeSymbol("?CHILD-2");

    public static final SubLSymbol $cyclops_lockedP$ = makeSymbol("*CYCLOPS-LOCKED?*");

    private static final SubLSymbol $cyclops_lock$ = makeSymbol("*CYCLOPS-LOCK*");

    private static final SubLString $$$CycLOPs_lock = makeString("CycLOPs lock");

    private static final SubLList $list53 = list(makeSymbol("*CYCLOPS-LOCK*"));

    private static final SubLString $$$Creating_terms = makeString("Creating terms");

    private static final SubLList $list56 = list(reader_make_constant_shell("Individual"));

    private static final SubLString $str58$Term_ = makeString("Term-");

    private static final SubLString $str59$_ = makeString("-");

    private static final SubLString $$$Asserting_family_links = makeString("Asserting family links");

    private static final SubLString $$$Asserting_parent_links = makeString("Asserting parent links");

    private static final SubLString $$$Asking_parent_links = makeString("Asking parent links");

    private static final SubLList $list65 = list(makeSymbol("?PARENT"));

    private static final SubLString $str66$CycLOPs_error_asking_parent__S = makeString("CycLOPs error asking parent ~S");

    private static final SubLString $$$Asking_ancestor_links = makeString("Asking ancestor links");

    private static final SubLList $list68 = list(makeSymbol("?ANCEST"));

    private static final SubLString $str69$CycLOPs_error__asking_ancestor__S = makeString("CycLOPs error: asking ancestor ~S");

    private static final SubLString $$$Asking_sibling_links = makeString("Asking sibling links");

    static private final SubLList $list71 = list(makeSymbol("?SIBLING"));

    private static final SubLList $list72 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);

    private static final SubLString $str73$CycLOPs_error__asking_sibling__S_ = makeString("CycLOPs error: asking sibling ~S via rule");

    private static final SubLString $str75$CycLOPs_error__asking_sibling__S = makeString("CycLOPs error: asking sibling ~S");

    private static final SubLString $$$Killing_terms = makeString("Killing terms");

    private static final SubLString $$$Killing_collections = makeString("Killing collections");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str80$__CycLOPs_Benchmark_Results = makeString("~%CycLOPs Benchmark Results");

    private static final SubLString $str81$_________________________________ = makeString("~%========================================");

    private static final SubLString $str82$__System__S__S_KB__S = makeString("~%System ~S.~S KB ~S");

    private static final SubLString $str83$__Bogomips______S = makeString("~%Bogomips :~% ~S");

    private static final SubLString $str84$__Scaling_factor______S = makeString("~%Scaling factor :~% ~S");

    private static final SubLString $str85$__Elapsed_time__seconds_______S = makeString("~%Elapsed time (seconds) :~% ~S");

    private static final SubLString $str86$__Efficiency__seconds_op_______S = makeString("~%Efficiency (seconds/op) :~% ~S");

    private static final SubLString $str87$__CycLOPs______S = makeString("~%CycLOPs :~% ~S");

    private static final SubLString $str88$__Bogomips_CycLOPs_______S = makeString("~%Bogomips/CycLOPs : ~% ~S");

    private static final SubLString $str89$__CycLOPs_Benchmark_Statistical_S = makeString("~%CycLOPs Benchmark Statistical Summary");

    private static final SubLString $str90$__Raw_Data______S = makeString("~%Raw Data :~% ~S");

    private static final SubLSymbol FOUR_SIGNIFICANT_DIGITS = makeSymbol("FOUR-SIGNIFICANT-DIGITS");

    private static final SubLString $str92$__Sorted_Data______S = makeString("~%Sorted Data :~% ~S");

    private static final SubLSymbol $sym93$_ = makeSymbol("<");

    private static final SubLString $str94$__N______S = makeString("~%N :~% ~S");

    private static final SubLString $str95$__Min______S = makeString("~%Min :~% ~S");

    private static final SubLString $str96$__Max______S = makeString("~%Max :~% ~S");

    private static final SubLString $str97$__Median______S = makeString("~%Median :~% ~S");

    private static final SubLString $str98$__Mean______S = makeString("~%Mean :~% ~S");

    private static final SubLString $str99$__Standard_Deviation______S = makeString("~%Standard Deviation :~% ~S");

    private static final SubLSymbol $AVERAGE_TIME_PER_RULE = makeKeyword("AVERAGE-TIME-PER-RULE");

    private static final SubLSymbol $STDEV_TIME_PER_RULE = makeKeyword("STDEV-TIME-PER-RULE");

    private static final SubLSymbol BENCHMARK_PARALLEL_CYCLOPS_COMPENSATING_FOR_PAGING = makeSymbol("BENCHMARK-PARALLEL-CYCLOPS-COMPENSATING-FOR-PAGING");

    private static final SubLString $str106$___S____S = makeString("~%~S = ~S");

    private static final SubLString $str107$__eff____S = makeString("  eff = ~S");

    private static final SubLString $$$Parallel_CycLOPs = makeString("Parallel CycLOPs");

    private static final SubLString $$$Parallel_CycLOPs_thread_ = makeString("Parallel CycLOPs thread ");

    private static final SubLSymbol BENCHMARK_PARALLEL_CYCLOPS_GUTS_THREAD = makeSymbol("BENCHMARK-PARALLEL-CYCLOPS-GUTS-THREAD");

    private static final SubLString $str112$__Parallel_CycLOPs_Benchmark_Resu = makeString("~%Parallel CycLOPs Benchmark Results");

    private static final SubLString $str113$__Parallelism_________S = makeString("~%Parallelism    :~% ~S");

    private static final SubLString $str114$__Parallel_CycLOPs_Benchmark_Stat = makeString("~%Parallel CycLOPs Benchmark Statistical Summary");

    private static final SubLString $$$Not_enough_terms_provided = makeString("Not enough terms provided");

    private static final SubLString $$$Asserting_ = makeString("Asserting ");

    private static final SubLString $$$_GAFs = makeString(" GAFs");

    private static final SubLString $str118$mAB_P_ = makeString("mAB-P-");

    private static final SubLString $str120$MAB_T_ = makeString("MAB-T-");

    private static final SubLString $str121$MAB_M_ = makeString("MAB-M-");

    private static final SubLSymbol $kw122$ASSUME_WFF_ = makeKeyword("ASSUME-WFF?");

    private static final SubLSymbol $kw123$DISABLE_FORWARD_ = makeKeyword("DISABLE-FORWARD?");

    private static final SubLSymbol BENCHMARK_CYCLOPS_SAMPLE = makeSymbol("BENCHMARK-CYCLOPS-SAMPLE");

    private static final SubLList $list125 = list(makeSymbol("BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING"));

    /**
     * The standard interface function for CycLOPs benchmarking.
     * Runs the CycLOPs benchmark THROWAWAY-N times and ignores those results.
     * Then runs it SAMPLE-N more times and returns the median of those sampled results.
     */
    @LispMethod(comment = "The standard interface function for CycLOPs benchmarking.\r\nRuns the CycLOPs benchmark THROWAWAY-N times and ignores those results.\r\nThen runs it SAMPLE-N more times and returns the median of those sampled results.\nThe standard interface function for CycLOPs benchmarking.\nRuns the CycLOPs benchmark THROWAWAY-N times and ignores those results.\nThen runs it SAMPLE-N more times and returns the median of those sampled results.")
    public static final SubLObject benchmark_cyclops_compensating_for_paging_alt(SubLObject throwaway_n, SubLObject sample_n, SubLObject power, SubLObject stream) {
	if (throwaway_n == UNPROVIDED) {
	    throwaway_n = $cyclops_throwaway_default$.getGlobalValue();
	}
	if (sample_n == UNPROVIDED) {
	    sample_n = SEVEN_INTEGER;
	}
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	{
	    SubLObject total_n = add(throwaway_n, sample_n);
	    return com.cyc.cycjava.cycl.system_benchmarks.median_cyclops(total_n, power, stream, throwaway_n);
	}
    }

    /**
     * The standard interface function for CycLOPs benchmarking.
     * Runs the CycLOPs benchmark THROWAWAY-N times and ignores those results.
     * Then runs it SAMPLE-N more times and returns the median of those sampled results.
     */
    @LispMethod(comment = "The standard interface function for CycLOPs benchmarking.\r\nRuns the CycLOPs benchmark THROWAWAY-N times and ignores those results.\r\nThen runs it SAMPLE-N more times and returns the median of those sampled results.\nThe standard interface function for CycLOPs benchmarking.\nRuns the CycLOPs benchmark THROWAWAY-N times and ignores those results.\nThen runs it SAMPLE-N more times and returns the median of those sampled results.")
    public static SubLObject benchmark_cyclops_compensating_for_paging(SubLObject throwaway_n, SubLObject sample_n, SubLObject power, SubLObject stream) {
	if (throwaway_n == UNPROVIDED) {
	    throwaway_n = $cyclops_throwaway_default$.getGlobalValue();
	}
	if (sample_n == UNPROVIDED) {
	    sample_n = SEVEN_INTEGER;
	}
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	final SubLObject total_n = add(throwaway_n, sample_n);
	return median_cyclops(total_n, power, stream, throwaway_n);
    }

    /**
     *
     *
     * @param THROW-AWAY-FIRST-N
     * 		integerp; if zero, has no effect.
     * 		if greater than zero, it will toss out (i.e. not return) the first THROW-AWAY-FIRST-N results.
     * 		This can be used to compensate for paging.
     */
    @LispMethod(comment = "@param THROW-AWAY-FIRST-N\r\n\t\tintegerp; if zero, has no effect.\r\n\t\tif greater than zero, it will toss out (i.e. not return) the first THROW-AWAY-FIRST-N results.\r\n\t\tThis can be used to compensate for paging.")
    public static final SubLObject benchmark_cyclops_n_times_alt(SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (throw_away_first_n == UNPROVIDED) {
	    throw_away_first_n = ZERO_INTEGER;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
	    SubLTrampolineFile.checkType(power, NON_NEGATIVE_INTEGER_P);
	    {
		SubLObject values = NIL;
		thread.resetMultipleValues();
		{
		    SubLObject mt_1 = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_setup();
		    SubLObject mt_2 = thread.secondMultipleValue();
		    SubLObject collections = thread.thirdMultipleValue();
		    SubLObject bottom_collection = thread.fourthMultipleValue();
		    SubLObject parent = thread.fifthMultipleValue();
		    SubLObject ancestor = thread.sixthMultipleValue();
		    SubLObject sibling = thread.seventhMultipleValue();
		    SubLObject family = thread.eighthMultipleValue();
		    thread.resetMultipleValues();
		    try {
			{
			    SubLObject i = NIL;
			    for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
				{
				    SubLObject guts_time = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_guts(power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
				    SubLObject cyclops = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_compute_and_print_statistics(stream, power, guts_time);
				    if (i.numGE(throw_away_first_n)) {
					values = cons(cyclops, values);
				    }
				}
			    }
			}
		    } finally {
			{
			    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_teardown(mt_1, mt_2, collections, parent, ancestor, sibling, family);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		}
		values = nreverse(values);
		if (n.numG(ONE_INTEGER)) {
		    com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_print_statistical_summary(stream, values);
		}
		return values;
	    }
	}
    }

    /**
     *
     *
     * @param THROW-AWAY-FIRST-N
     * 		integerp; if zero, has no effect.
     * 		if greater than zero, it will toss out (i.e. not return) the first THROW-AWAY-FIRST-N results.
     * 		This can be used to compensate for paging.
     */
    @LispMethod(comment = "@param THROW-AWAY-FIRST-N\r\n\t\tintegerp; if zero, has no effect.\r\n\t\tif greater than zero, it will toss out (i.e. not return) the first THROW-AWAY-FIRST-N results.\r\n\t\tThis can be used to compensate for paging.")
    public static SubLObject benchmark_cyclops_n_times(final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (throw_away_first_n == UNPROVIDED) {
	    throw_away_first_n = ZERO_INTEGER;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
	assert NIL != subl_promotions.non_negative_integer_p(power) : "! subl_promotions.non_negative_integer_p(power) " + ("subl_promotions.non_negative_integer_p(power) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(power) ") + power;
	SubLObject values = NIL;
	final SubLObject _prev_bind_0 = wff_vars.$wff_mode$.currentBinding(thread);
	try {
	    wff_vars.$wff_mode$.bind($LENIENT, thread);
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
		for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
		    guts_time = benchmark_cyclops_guts(power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
		    cyclops = benchmark_cyclops_compute_and_print_statistics(stream, power, guts_time);
		    if (i.numGE(throw_away_first_n)) {
			values = cons(cyclops, values);
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    benchmark_cyclops_teardown(mt_1, mt_2, collections, parent, ancestor, sibling, family);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
		}
	    }
	} finally {
	    wff_vars.$wff_mode$.rebind(_prev_bind_0, thread);
	}
	values = nreverse(values);
	if (n.numG(ONE_INTEGER)) {
	    benchmark_cyclops_print_statistical_summary(stream, values);
	}
	return values;
    }

    /**
     * Run the CycLOPs benchmark, with 2^POWER as the scaling factor.
     */
    @LispMethod(comment = "Run the CycLOPs benchmark, with 2^POWER as the scaling factor.")
    public static final SubLObject benchmark_cyclops_alt(SubLObject power, SubLObject stream) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	SubLTrampolineFile.checkType(power, NON_NEGATIVE_INTEGER_P);
	{
	    SubLObject cyclops = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_n_times(ONE_INTEGER, power, stream, ZERO_INTEGER).first();
	    SubLObject bogomips = misc_utilities.machine_bogomips();
	    if (NIL != bogomips) {
		return values(cyclops, divide(bogomips, cyclops));
	    } else {
		return cyclops;
	    }
	}
    }

    /**
     * Run the CycLOPs benchmark, with 2^POWER as the scaling factor.
     */
    @LispMethod(comment = "Run the CycLOPs benchmark, with 2^POWER as the scaling factor.")
    public static SubLObject benchmark_cyclops(SubLObject power, SubLObject stream) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	assert NIL != subl_promotions.non_negative_integer_p(power) : "! subl_promotions.non_negative_integer_p(power) " + ("subl_promotions.non_negative_integer_p(power) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(power) ") + power;
	final SubLObject cyclops = benchmark_cyclops_n_times(ONE_INTEGER, power, stream, ZERO_INTEGER).first();
	final SubLObject bogomips = misc_utilities.machine_bogomips();
	if (NIL != bogomips) {
	    return values(cyclops, divide(bogomips, cyclops));
	}
	return cyclops;
    }

    /**
     * Runs benchmark-cyclops N times and returns the median recorded value.
     */
    @LispMethod(comment = "Runs benchmark-cyclops N times and returns the median recorded value.")
    public static final SubLObject median_cyclops_alt(SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (throw_away_first_n == UNPROVIDED) {
	    throw_away_first_n = ZERO_INTEGER;
	}
	{
	    SubLObject cyclops = number_utilities.median(com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_n_times(n, power, stream, throw_away_first_n), UNPROVIDED);
	    SubLObject bogomips = misc_utilities.machine_bogomips();
	    if (NIL != bogomips) {
		return values(cyclops, divide(bogomips, cyclops));
	    } else {
		return cyclops;
	    }
	}
    }

    /**
     * Runs benchmark-cyclops N times and returns the median recorded value.
     */
    @LispMethod(comment = "Runs benchmark-cyclops N times and returns the median recorded value.")
    public static SubLObject median_cyclops(final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (throw_away_first_n == UNPROVIDED) {
	    throw_away_first_n = ZERO_INTEGER;
	}
	final SubLObject cyclops = number_utilities.median(benchmark_cyclops_n_times(n, power, stream, throw_away_first_n), UNPROVIDED, UNPROVIDED);
	final SubLObject bogomips = misc_utilities.machine_bogomips();
	if (NIL != bogomips) {
	    return values(cyclops, divide(bogomips, cyclops));
	}
	return cyclops;
    }

    /**
     * Runs benchmark-cyclops N times and returns the highest recorded value
     */
    @LispMethod(comment = "Runs benchmark-cyclops N times and returns the highest recorded value")
    public static final SubLObject max_cyclops_alt(SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (throw_away_first_n == UNPROVIDED) {
	    throw_away_first_n = ZERO_INTEGER;
	}
	{
	    SubLObject cyclops = number_utilities.maximum(com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_n_times(n, power, stream, throw_away_first_n), UNPROVIDED);
	    SubLObject bogomips = misc_utilities.machine_bogomips();
	    if (NIL != bogomips) {
		return values(cyclops, divide(bogomips, cyclops));
	    } else {
		return cyclops;
	    }
	}
    }

    /**
     * Runs benchmark-cyclops N times and returns the highest recorded value
     */
    @LispMethod(comment = "Runs benchmark-cyclops N times and returns the highest recorded value")
    public static SubLObject max_cyclops(final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (throw_away_first_n == UNPROVIDED) {
	    throw_away_first_n = ZERO_INTEGER;
	}
	final SubLObject cyclops = number_utilities.maximum(benchmark_cyclops_n_times(n, power, stream, throw_away_first_n), UNPROVIDED);
	final SubLObject bogomips = misc_utilities.machine_bogomips();
	if (NIL != bogomips) {
	    return values(cyclops, divide(bogomips, cyclops));
	}
	return cyclops;
    }

    /**
     * Perform the untimed setup and teardown parts of the CycLOPs test.
     * This is itself useful as a weak forward inference benchmark.
     */
    @LispMethod(comment = "Perform the untimed setup and teardown parts of the CycLOPs test.\r\nThis is itself useful as a weak forward inference benchmark.\nPerform the untimed setup and teardown parts of the CycLOPs test.\nThis is itself useful as a weak forward inference benchmark.")
    public static final SubLObject benchmark_cyclops_setup_and_teardown_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject mt_1 = NIL;
		SubLObject mt_2 = NIL;
		SubLObject collections = NIL;
		SubLObject bottom_collection = NIL;
		SubLObject parent = NIL;
		SubLObject ancestor = NIL;
		SubLObject sibling = NIL;
		SubLObject family = NIL;
		try {
		    thread.resetMultipleValues();
		    {
			SubLObject mt_1_1 = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_setup();
			SubLObject mt_2_2 = thread.secondMultipleValue();
			SubLObject collections_3 = thread.thirdMultipleValue();
			SubLObject bottom_collection_4 = thread.fourthMultipleValue();
			SubLObject parent_5 = thread.fifthMultipleValue();
			SubLObject ancestor_6 = thread.sixthMultipleValue();
			SubLObject sibling_7 = thread.seventhMultipleValue();
			SubLObject family_8 = thread.eighthMultipleValue();
			thread.resetMultipleValues();
			mt_1 = mt_1_1;
			mt_2 = mt_2_2;
			collections = collections_3;
			bottom_collection = bottom_collection_4;
			parent = parent_5;
			ancestor = ancestor_6;
			sibling = sibling_7;
			family = family_8;
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
			try {
			    $is_thread_performing_cleanupP$.bind(T, thread);
			    com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_teardown(mt_1, mt_2, collections, parent, ancestor, sibling, family);
			} finally {
			    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
			}
		    }
		}
	    }
	    return NIL;
	}
    }

    /**
     * Perform the untimed setup and teardown parts of the CycLOPs test.
     * This is itself useful as a weak forward inference benchmark.
     */
    @LispMethod(comment = "Perform the untimed setup and teardown parts of the CycLOPs test.\r\nThis is itself useful as a weak forward inference benchmark.\nPerform the untimed setup and teardown parts of the CycLOPs test.\nThis is itself useful as a weak forward inference benchmark.")
    public static SubLObject benchmark_cyclops_setup_and_teardown() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject mt_1 = NIL;
	SubLObject mt_2 = NIL;
	SubLObject collections = NIL;
	SubLObject bottom_collection = NIL;
	SubLObject parent = NIL;
	SubLObject ancestor = NIL;
	SubLObject sibling = NIL;
	SubLObject family = NIL;
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
	} finally {
	    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		benchmark_cyclops_teardown(mt_1, mt_2, collections, parent, ancestor, sibling, family);
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
	    }
	}
	return NIL;
    }

    /**
     * initialization
     */
    @LispMethod(comment = "initialization")
    public static final SubLObject benchmark_cyclops_setup_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject mt_1 = NIL;
		SubLObject mt_2 = NIL;
		SubLObject collections = NIL;
		SubLObject top_collection = NIL;
		SubLObject bottom_collection = NIL;
		SubLObject parent = NIL;
		SubLObject ancestor = NIL;
		SubLObject sibling = NIL;
		SubLObject family = NIL;
		{
		    SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
		    SubLObject _prev_bind_1 = StreamsLow.$standard_output$.currentBinding(thread);
		    try {
			$silent_progressP$.bind(T, thread);
			StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
			thread.resetMultipleValues();
			{
			    SubLObject mt_1_9 = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_create_mts();
			    SubLObject mt_2_10 = thread.secondMultipleValue();
			    thread.resetMultipleValues();
			    mt_1 = mt_1_9;
			    mt_2 = mt_2_10;
			}
			thread.resetMultipleValues();
			{
			    SubLObject collections_11 = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_create_ontology();
			    SubLObject top_collection_12 = thread.secondMultipleValue();
			    SubLObject bottom_collection_13 = thread.thirdMultipleValue();
			    thread.resetMultipleValues();
			    collections = collections_11;
			    top_collection = top_collection_12;
			    bottom_collection = bottom_collection_13;
			}
			parent = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_create_parent(top_collection);
			ancestor = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_create_ancestor(top_collection);
			sibling = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_create_sibling(top_collection);
			family = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_create_family(top_collection);
			com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_define_predicates(parent, ancestor, sibling, family);
		    } finally {
			StreamsLow.$standard_output$.rebind(_prev_bind_1, thread);
			$silent_progressP$.rebind(_prev_bind_0, thread);
		    }
		}
		return values(mt_1, mt_2, collections, bottom_collection, parent, ancestor, sibling, family);
	    }
	}
    }

    /**
     * initialization
     */
    @LispMethod(comment = "initialization")
    public static SubLObject benchmark_cyclops_setup() {
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
	final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
	final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding(thread);
	try {
	    $silent_progressP$.bind(T, thread);
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
	} finally {
	    StreamsLow.$standard_output$.rebind(_prev_bind_2, thread);
	    $silent_progressP$.rebind(_prev_bind_0, thread);
	}
	return values(mt_1, mt_2, collections, bottom_collection, parent, ancestor, sibling, family);
    }

    public static final SubLObject benchmark_cyclops_guts_alt(SubLObject power, SubLObject mt_1, SubLObject mt_2, SubLObject bottom_collection, SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
	Storage.gc_ephemeral();
	{
	    SubLObject time = NIL;
	    SubLObject time_var = get_internal_real_time();
	    com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_guts_int(ZERO_INTEGER, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
	    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
	    return time;
	}
    }

    public static SubLObject benchmark_cyclops_guts(final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
	Storage.gc_ephemeral();
	SubLObject time = NIL;
	final SubLObject time_var = get_internal_real_time();
	benchmark_cyclops_guts_int(ZERO_INTEGER, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
	time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
	return time;
    }

    /**
     * the scalable portion
     */
    @LispMethod(comment = "the scalable portion")
    public static final SubLObject benchmark_cyclops_guts_int_alt(SubLObject uniquifier, SubLObject power, SubLObject mt_1, SubLObject mt_2, SubLObject bottom_collection, SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
		SubLObject _prev_bind_1 = StreamsLow.$standard_output$.currentBinding(thread);
		SubLObject _prev_bind_2 = backward_results.$inference_intermediate_step_validation_level$.currentBinding(thread);
		SubLObject _prev_bind_3 = $suspend_type_checkingP$.currentBinding(thread);
		try {
		    $silent_progressP$.bind(T, thread);
		    StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
		    backward_results.$inference_intermediate_step_validation_level$.bind($NONE, thread);
		    $suspend_type_checkingP$.bind(T, thread);
		    {
			SubLObject cprogv_var = $fi_state_variables$.getGlobalValue();
			final ArrayList old_values = extract_dynamic_values(cprogv_var);
			try {
			    bind_dynamic_vars(cprogv_var, make_list(length($fi_state_variables$.getGlobalValue()), NIL));
			    {
				SubLObject _prev_bind_0_14 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
				SubLObject _prev_bind_1_15 = $prefer_forward_skolemization$.currentBinding(thread);
				try {
				    kb_control_vars.$within_assertion_forward_propagationP$.bind(NIL, thread);
				    $prefer_forward_skolemization$.bind(NIL, thread);
				    {
					SubLObject environment = forward.get_forward_inference_environment();
					SubLTrampolineFile.checkType(environment, QUEUE_P);
					{
					    SubLObject _prev_bind_0_16 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
					    SubLObject _prev_bind_1_17 = $current_forward_problem_store$.currentBinding(thread);
					    try {
						kb_control_vars.$forward_inference_environment$.bind(environment, thread);
						$current_forward_problem_store$.bind(NIL, thread);
						try {
						    {
							SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
							{
							    SubLObject _prev_bind_0_18 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
							    SubLObject _prev_bind_1_19 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
							    SubLObject _prev_bind_2_20 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
							    try {
								sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
								sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
								sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
								{
								    SubLObject k = subtract(expt(TWO_INTEGER, power), ONE_INTEGER);
								    SubLObject terms = NIL;
								    try {
									terms = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_create_terms(uniquifier, k, bottom_collection, mt_1);
									com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_assert_family_links(uniquifier, k, terms, family, mt_1);
									com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_assert_parent_links(k, terms, parent, mt_1);
									com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_query_parent_links(k, terms, parent, mt_2);
									com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_query_ancestor_links(k, terms, ancestor, mt_1);
									com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_query_sibling_links_via_rule(k, terms, sibling, mt_2);
									com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_forward_propagate_sibling_rule(uniquifier, parent, sibling, family);
									com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_turn_sibling_rule_backward(uniquifier, parent, sibling, family);
									com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_query_sibling_links_via_lookup(k, terms, sibling, mt_2);
								    } finally {
									{
									    SubLObject _prev_bind_0_21 = $is_thread_performing_cleanupP$.currentBinding(thread);
									    try {
										$is_thread_performing_cleanupP$.bind(T, thread);
										com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_kill_terms(k, terms);
									    } finally {
										$is_thread_performing_cleanupP$.rebind(_prev_bind_0_21, thread);
									    }
									}
								    }
								    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
								}
							    } finally {
								sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2_20, thread);
								sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_19, thread);
								sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_18, thread);
							    }
							}
						    }
						} finally {
						    {
							SubLObject _prev_bind_0_22 = $is_thread_performing_cleanupP$.currentBinding(thread);
							try {
							    $is_thread_performing_cleanupP$.bind(T, thread);
							    forward.clear_current_forward_problem_store();
							} finally {
							    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_22, thread);
							}
						    }
						}
					    } finally {
						$current_forward_problem_store$.rebind(_prev_bind_1_17, thread);
						kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_16, thread);
					    }
					}
				    }
				} finally {
				    $prefer_forward_skolemization$.rebind(_prev_bind_1_15, thread);
				    kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0_14, thread);
				}
			    }
			} finally {
			    rebind_dynamic_vars(cprogv_var, old_values);
			}
		    }
		} finally {
		    $suspend_type_checkingP$.rebind(_prev_bind_3, thread);
		    backward_results.$inference_intermediate_step_validation_level$.rebind(_prev_bind_2, thread);
		    StreamsLow.$standard_output$.rebind(_prev_bind_1, thread);
		    $silent_progressP$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    /**
     * the scalable portion
     */
    @LispMethod(comment = "the scalable portion")
    public static SubLObject benchmark_cyclops_guts_int(final SubLObject uniquifier, final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
	final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding(thread);
	final SubLObject _prev_bind_3 = backward_results.$inference_intermediate_step_validation_level$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $suspend_type_checkingP$.currentBinding(thread);
	try {
	    $silent_progressP$.bind(T, thread);
	    StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
	    backward_results.$inference_intermediate_step_validation_level$.bind($NONE, thread);
	    $suspend_type_checkingP$.bind(T, thread);
	    final SubLObject cprogv_var = $fi_state_variables$.getGlobalValue();
	    final ArrayList old_values = extract_dynamic_values(cprogv_var);
	    try {
		bind_dynamic_vars(cprogv_var, make_list(length($fi_state_variables$.getGlobalValue()), NIL));
		final SubLObject _prev_bind_0_$15 = kb_control_vars.$within_assertion_forward_propagationP$.currentBinding(thread);
		final SubLObject _prev_bind_1_$16 = $prefer_forward_skolemization$.currentBinding(thread);
		try {
		    kb_control_vars.$within_assertion_forward_propagationP$.bind(NIL, thread);
		    $prefer_forward_skolemization$.bind(NIL, thread);
		    final SubLObject environment = forward.get_forward_inference_environment();
		    assert NIL != queues.queue_p(environment) : "! queues.queue_p(environment) " + ("queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) ") + environment;
		    final SubLObject _prev_bind_0_$16 = kb_control_vars.$forward_inference_environment$.currentBinding(thread);
		    final SubLObject _prev_bind_1_$17 = $current_forward_problem_store$.currentBinding(thread);
		    try {
			kb_control_vars.$forward_inference_environment$.bind(environment, thread);
			$current_forward_problem_store$.bind(NIL, thread);
			try {
			    SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
			    final SubLObject _prev_bind_0_$17 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
			    final SubLObject _prev_bind_1_$18 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
			    final SubLObject _prev_bind_2_$21 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
			    try {
				sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
				sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
				sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
				try {
				    final SubLObject k = subtract(expt(TWO_INTEGER, power), ONE_INTEGER);
				    SubLObject terms = NIL;
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
				    } finally {
					final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
					try {
					    $is_thread_performing_cleanupP$.bind(T, thread);
					    final SubLObject _values = getValuesAsVector();
					    benchmark_cyclops_kill_terms(k, terms);
					    restoreValuesFromVector(_values);
					} finally {
					    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
					}
				    }
				} finally {
				    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
				    try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					final SubLObject _values2 = getValuesAsVector();
					sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
					restoreValuesFromVector(_values2);
				    } finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
				    }
				}
			    } finally {
				sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2_$21, thread);
				sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$18, thread);
				sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$17, thread);
			    }
			} finally {
			    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				final SubLObject _values3 = getValuesAsVector();
				forward.clear_current_forward_problem_store();
				restoreValuesFromVector(_values3);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
			    }
			}
		    } finally {
			$current_forward_problem_store$.rebind(_prev_bind_1_$17, thread);
			kb_control_vars.$forward_inference_environment$.rebind(_prev_bind_0_$16, thread);
		    }
		} finally {
		    $prefer_forward_skolemization$.rebind(_prev_bind_1_$16, thread);
		    kb_control_vars.$within_assertion_forward_propagationP$.rebind(_prev_bind_0_$15, thread);
		}
	    } finally {
		rebind_dynamic_vars(cprogv_var, old_values);
	    }
	} finally {
	    $suspend_type_checkingP$.rebind(_prev_bind_4, thread);
	    backward_results.$inference_intermediate_step_validation_level$.rebind(_prev_bind_3, thread);
	    StreamsLow.$standard_output$.rebind(_prev_bind_2, thread);
	    $silent_progressP$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    /**
     * cleanup
     */
    @LispMethod(comment = "cleanup")
    public static final SubLObject benchmark_cyclops_teardown_alt(SubLObject mt_1, SubLObject mt_2, SubLObject collections, SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
		SubLObject _prev_bind_1 = StreamsLow.$standard_output$.currentBinding(thread);
		try {
		    $silent_progressP$.bind(T, thread);
		    StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
		    com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_kill_vocabulary(mt_1, mt_2, collections, parent, ancestor, sibling, family);
		} finally {
		    StreamsLow.$standard_output$.rebind(_prev_bind_1, thread);
		    $silent_progressP$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    /**
     * cleanup
     */
    @LispMethod(comment = "cleanup")
    public static SubLObject benchmark_cyclops_teardown(final SubLObject mt_1, final SubLObject mt_2, final SubLObject collections, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
	final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding(thread);
	try {
	    $silent_progressP$.bind(T, thread);
	    StreamsLow.$standard_output$.bind(StreamsLow.$null_output$.getDynamicValue(thread), thread);
	    benchmark_cyclops_kill_vocabulary(mt_1, mt_2, collections, parent, ancestor, sibling, family);
	} finally {
	    StreamsLow.$standard_output$.rebind(_prev_bind_2, thread);
	    $silent_progressP$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_compute_and_print_statistics_alt(SubLObject stream, SubLObject power, SubLObject guts_time) {
	{
	    SubLObject k = subtract(expt(TWO_INTEGER, power), ONE_INTEGER);
	    SubLObject efficiency = divide(guts_time, k);
	    SubLObject cyclops = invert(efficiency);
	    SubLObject bogomips = misc_utilities.machine_bogomips();
	    com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_print_statistics(stream, bogomips, k, guts_time, efficiency, cyclops);
	    return cyclops;
	}
    }

    public static SubLObject benchmark_cyclops_compute_and_print_statistics(final SubLObject stream, final SubLObject power, final SubLObject guts_time) {
	final SubLObject k = subtract(expt(TWO_INTEGER, power), ONE_INTEGER);
	final SubLObject efficiency = divide(guts_time, k);
	final SubLObject cyclops = invert(efficiency);
	final SubLObject bogomips = misc_utilities.machine_bogomips();
	benchmark_cyclops_print_statistics(stream, bogomips, k, guts_time, efficiency, cyclops);
	return cyclops;
    }

    public static final SubLObject benchmark_cyclops_create_mts_alt() {
	{
	    SubLObject mt_1 = NIL;
	    SubLObject mt_2 = NIL;
	    mt_1 = cyc_kernel.cyc_create_new_ephemeral($str_alt6$Mt_1);
	    mt_2 = cyc_kernel.cyc_create_new_ephemeral($str_alt7$Mt_2);
	    cyc_kernel.cyc_assert_wff(listS($$isa, mt_1, $list_alt9), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(listS($$isa, mt_2, $list_alt9), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(list($$genlMt, mt_2, mt_1), $$BaseKB, $list_alt11);
	    return values(mt_1, mt_2);
	}
    }

    public static SubLObject benchmark_cyclops_create_mts() {
	SubLObject mt_1 = NIL;
	SubLObject mt_2 = NIL;
	mt_1 = cyc_kernel.cyc_create_new_ephemeral($str7$Mt_1);
	mt_2 = cyc_kernel.cyc_create_new_ephemeral($str8$Mt_2);
	cyc_kernel.cyc_assert_wff(listS($$isa, mt_1, $list10), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(listS($$isa, mt_2, $list10), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(list($$genlMt, mt_2, mt_1), $$BaseKB, $list12);
	return values(mt_1, mt_2);
    }

    public static final SubLObject benchmark_cyclops_create_ontology_alt() {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject collections = NIL;
		SubLObject top_collection = NIL;
		SubLObject bottom_collection = NIL;
		$progress_note$.setDynamicValue($$$Creating_collection_ontology, thread);
		$progress_start_time$.setDynamicValue(get_universal_time(), thread);
		$progress_total$.setDynamicValue($int$25, thread);
		$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
		{
		    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		    try {
			$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_prediction$.bind(NIL, thread);
			$within_noting_percent_progress$.bind(T, thread);
			$percent_progress_start_time$.bind(get_universal_time(), thread);
			noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
			{
			    SubLObject i = NIL;
			    for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
				note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
				$progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
				{
				    SubLObject collection = cyc_kernel.cyc_create_new_ephemeral(cconcatenate($str_alt15$Col_, format_nil.format_nil_a_no_copy(i)));
				    collections = cons(collection, collections);
				    cyc_kernel.cyc_assert_wff(listS($$isa, collection, $list_alt16), $$BaseKB, $list_alt11);
				}
			    }
			}
			noting_percent_progress_postamble();
		    } finally {
			$percent_progress_start_time$.rebind(_prev_bind_3, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
			$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		    }
		}
		{
		    SubLObject previous = $benchmark_cyclops_ontology_root$.getDynamicValue(thread);
		    SubLObject cdolist_list_var = collections;
		    SubLObject collection = NIL;
		    for (collection = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), collection = cdolist_list_var.first()) {
			cyc_kernel.cyc_assert_wff(list($$genls, collection, previous), $$BaseKB, $list_alt11);
			previous = collection;
		    }
		}
		top_collection = collections.first();
		bottom_collection = last(collections, UNPROVIDED).first();
		return values(collections, top_collection, bottom_collection);
	    }
	}
    }

    public static SubLObject benchmark_cyclops_create_ontology() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject collections = NIL;
	SubLObject top_collection = NIL;
	SubLObject bottom_collection = NIL;
	final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $progress_note$.bind($$$Creating_collection_ontology, thread);
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_total$.bind($int$25, thread);
	    $progress_sofar$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		SubLObject i;
		SubLObject collection;
		for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
		    collection = cyc_kernel.cyc_create_new_ephemeral(cconcatenate($str16$Col_, format_nil.format_nil_a_no_copy(i)));
		    collections = cons(collection, collections);
		    cyc_kernel.cyc_assert_wff(listS($$isa, collection, $list17), $$BaseKB, $list12);
		    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
		    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
		}
	    } finally {
		final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
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
	SubLObject previous = $benchmark_cyclops_ontology_root$.getDynamicValue(thread);
	SubLObject cdolist_list_var = collections;
	SubLObject collection2 = NIL;
	collection2 = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    cyc_kernel.cyc_assert_wff(list($$genls, collection2, previous), $$BaseKB, $list12);
	    previous = collection2;
	    cdolist_list_var = cdolist_list_var.rest();
	    collection2 = cdolist_list_var.first();
	}
	top_collection = collections.first();
	bottom_collection = last(collections, UNPROVIDED).first();
	return values(collections, top_collection, bottom_collection);
    }

    public static final SubLObject benchmark_cyclops_create_parent_alt(SubLObject top_collection) {
	{
	    SubLObject parent = cyc_kernel.cyc_create_new_ephemeral($$$parent);
	    cyc_kernel.cyc_assert_wff(listS($$isa, parent, $list_alt19), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(listS($$isa, parent, $list_alt20), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(list($$arg1Isa, parent, top_collection), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(list($$arg2Isa, parent, top_collection), $$BaseKB, $list_alt11);
	    return parent;
	}
    }

    public static SubLObject benchmark_cyclops_create_parent(final SubLObject top_collection) {
	final SubLObject parent = cyc_kernel.cyc_create_new_ephemeral($$$parent);
	cyc_kernel.cyc_assert_wff(listS($$isa, parent, $list20), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(listS($$isa, parent, $list21), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(list($$arg1Isa, parent, top_collection), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(list($$arg2Isa, parent, top_collection), $$BaseKB, $list12);
	return parent;
    }

    public static final SubLObject benchmark_cyclops_create_ancestor_alt(SubLObject top_collection) {
	{
	    SubLObject ancestor = cyc_kernel.cyc_create_new_ephemeral($$$ancestor);
	    cyc_kernel.cyc_assert_wff(listS($$isa, ancestor, $list_alt24), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(listS($$isa, ancestor, $list_alt25), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(listS($$isa, ancestor, $list_alt26), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(list($$arg1Isa, ancestor, top_collection), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(list($$arg2Isa, ancestor, top_collection), $$BaseKB, $list_alt11);
	    return ancestor;
	}
    }

    public static SubLObject benchmark_cyclops_create_ancestor(final SubLObject top_collection) {
	final SubLObject ancestor = cyc_kernel.cyc_create_new_ephemeral($$$ancestor);
	cyc_kernel.cyc_assert_wff(listS($$isa, ancestor, $list25), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(listS($$isa, ancestor, $list26), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(listS($$isa, ancestor, $list27), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(list($$arg1Isa, ancestor, top_collection), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(list($$arg2Isa, ancestor, top_collection), $$BaseKB, $list12);
	return ancestor;
    }

    public static final SubLObject benchmark_cyclops_create_sibling_alt(SubLObject top_collection) {
	{
	    SubLObject sibling = cyc_kernel.cyc_create_new_ephemeral($$$sibling);
	    cyc_kernel.cyc_assert_wff(listS($$isa, sibling, $list_alt19), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(listS($$isa, sibling, $list_alt28), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(list($$arg1Isa, sibling, top_collection), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(list($$arg2Isa, sibling, top_collection), $$BaseKB, $list_alt11);
	    return sibling;
	}
    }

    public static SubLObject benchmark_cyclops_create_sibling(final SubLObject top_collection) {
	final SubLObject sibling = cyc_kernel.cyc_create_new_ephemeral($$$sibling);
	cyc_kernel.cyc_assert_wff(listS($$isa, sibling, $list20), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(listS($$isa, sibling, $list29), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(list($$arg1Isa, sibling, top_collection), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(list($$arg2Isa, sibling, top_collection), $$BaseKB, $list12);
	return sibling;
    }

    public static final SubLObject benchmark_cyclops_create_family_alt(SubLObject top_collection) {
	{
	    SubLObject family = cyc_kernel.cyc_create_new_ephemeral($$$family);
	    cyc_kernel.cyc_assert_wff(listS($$isa, family, $list_alt30), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(list($$arg1Isa, family, top_collection), $$BaseKB, $list_alt11);
	    cyc_kernel.cyc_assert_wff(listS($$arg2Isa, family, $list_alt31), $$BaseKB, $list_alt11);
	    return family;
	}
    }

    public static SubLObject benchmark_cyclops_create_family(final SubLObject top_collection) {
	final SubLObject family = cyc_kernel.cyc_create_new_ephemeral($$$family);
	cyc_kernel.cyc_assert_wff(listS($$isa, family, $list31), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(list($$arg1Isa, family, top_collection), $$BaseKB, $list12);
	cyc_kernel.cyc_assert_wff(listS($$arg2Isa, family, $list32), $$BaseKB, $list12);
	return family;
    }

    public static final SubLObject benchmark_cyclops_define_predicates_alt(SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
	cyc_kernel.cyc_assert_wff(list($$genlPreds, parent, ancestor), $$BaseKB, $list_alt11);
	com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_assert_sibling_rule(MINUS_ONE_INTEGER, parent, sibling, family, $BACKWARD);
	return NIL;
    }

    public static SubLObject benchmark_cyclops_define_predicates(final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
	cyc_kernel.cyc_assert_wff(list($$genlPreds, parent, ancestor), $$BaseKB, $list12);
	benchmark_cyclops_assert_sibling_rule(MINUS_ONE_INTEGER, parent, sibling, family, $BACKWARD);
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_assert_sibling_rule_alt(SubLObject uniquifier, SubLObject parent, SubLObject sibling, SubLObject family, SubLObject direction) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_properties = list($STRENGTH, $MONOTONIC, $DIRECTION, direction);
		SubLObject sentence = NIL;
		if ((NIL != $cyclops_family_fix_enabledP$.getDynamicValue(thread)) && (!uniquifier.isNegative())) {
		    sentence = list($$implies, list($$and, $list_alt39, list(family, $sym40$_PARENT, uniquifier), bq_cons(parent, $list_alt41), bq_cons(parent, $list_alt42)), bq_cons(sibling, $list_alt43));
		} else {
		    sentence = list($$implies, list($$and, list($$different, $sym45$_CHILD_1, $sym46$_CHILD_2, uniquifier), bq_cons(parent, $list_alt41), bq_cons(parent, $list_alt42)), bq_cons(sibling, $list_alt43));
		}
		return cyc_kernel.cyc_assert_wff(sentence, $$BaseKB, v_properties);
	    }
	}
    }

    public static SubLObject benchmark_cyclops_assert_sibling_rule(final SubLObject uniquifier, final SubLObject parent, final SubLObject sibling, final SubLObject family, final SubLObject direction) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_properties = list($STRENGTH, $MONOTONIC, $DIRECTION, direction);
	SubLObject sentence = NIL;
	if ((NIL != $cyclops_family_fix_enabledP$.getDynamicValue(thread)) && (!uniquifier.isNegative())) {
	    sentence = list($$implies, list($$and, $list40, list(family, $sym41$_PARENT, uniquifier), bq_cons(parent, $list42), bq_cons(parent, $list43)), bq_cons(sibling, $list44));
	} else {
	    sentence = list($$implies, list($$and, list($$different, $sym46$_CHILD_1, $sym47$_CHILD_2, uniquifier), bq_cons(parent, $list42), bq_cons(parent, $list43)), bq_cons(sibling, $list44));
	}
	return cyc_kernel.cyc_assert_wff(sentence, $$BaseKB, v_properties);
    }

    public static final SubLObject with_cyclops_lock_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject body = current;
	    return list(PIF, $cyclops_lockedP$, listS(WITH_LOCK_HELD, $list_alt52, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
	}
    }

    public static SubLObject with_cyclops_lock(final SubLObject macroform, final SubLObject environment) {
	final SubLObject datum = macroform.rest();
	final SubLObject body;
	final SubLObject current = body = datum;
	return list(PIF, $cyclops_lockedP$, listS(WITH_LOCK_HELD, $list53, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
    }

    public static final SubLObject benchmark_cyclops_create_terms_alt(SubLObject uniquifier, SubLObject k, SubLObject bottom_collection, SubLObject mt_1) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == $cyclops_anect_fix_enabledP$.getDynamicValue(thread)) {
		mt_1 = $$BaseKB;
	    }
	    {
		SubLObject terms = NIL;
		$progress_note$.setDynamicValue($$$Creating_terms, thread);
		$progress_start_time$.setDynamicValue(get_universal_time(), thread);
		$progress_total$.setDynamicValue(k, thread);
		$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
		{
		    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		    try {
			$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_prediction$.bind(NIL, thread);
			$within_noting_percent_progress$.bind(T, thread);
			$percent_progress_start_time$.bind(get_universal_time(), thread);
			noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
			{
			    SubLObject i = NIL;
			    for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
				note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
				$progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
				{
				    SubLObject v_term = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_create_term(uniquifier, i);
				    terms = cons(v_term, terms);
				    if (NIL != $cyclops_anect_fix_enabledP$.getDynamicValue(thread)) {
					if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
					    {
						SubLObject lock = $cyclops_lock$.getGlobalValue();
						SubLObject release = NIL;
						try {
						    release = seize_lock(lock);
						    cyc_kernel.cyc_assert_wff(listS($$isa, v_term, $list_alt55), $$BaseKB, $list_alt11);
						} finally {
						    if (NIL != release) {
							release_lock(lock);
						    }
						}
					    }
					} else {
					    cyc_kernel.cyc_assert_wff(listS($$isa, v_term, $list_alt55), $$BaseKB, $list_alt11);
					}
				    }
				    if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
					{
					    SubLObject lock = $cyclops_lock$.getGlobalValue();
					    SubLObject release = NIL;
					    try {
						release = seize_lock(lock);
						cyc_kernel.cyc_assert_wff(list($$isa, v_term, bottom_collection), mt_1, $list_alt11);
					    } finally {
						if (NIL != release) {
						    release_lock(lock);
						}
					    }
					}
				    } else {
					cyc_kernel.cyc_assert_wff(list($$isa, v_term, bottom_collection), mt_1, $list_alt11);
				    }
				}
			    }
			}
			noting_percent_progress_postamble();
		    } finally {
			$percent_progress_start_time$.rebind(_prev_bind_3, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
			$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		    }
		}
		terms = apply(symbol_function(VECTOR), nreverse(terms));
		return terms;
	    }
	}
    }

    public static SubLObject benchmark_cyclops_create_terms(final SubLObject uniquifier, final SubLObject k, final SubLObject bottom_collection, SubLObject mt_1) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL == $cyclops_anect_fix_enabledP$.getDynamicValue(thread)) {
	    mt_1 = $$BaseKB;
	}
	SubLObject terms = NIL;
	final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $progress_note$.bind($$$Creating_terms, thread);
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_total$.bind(k, thread);
	    $progress_sofar$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		SubLObject i;
		SubLObject v_term;
		SubLObject release;
		for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
		    v_term = benchmark_cyclops_create_term(uniquifier, i);
		    terms = cons(v_term, terms);
		    if (NIL != $cyclops_anect_fix_enabledP$.getDynamicValue(thread)) {
			if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
			    release = NIL;
			    try {
				release = seize_lock($cyclops_lock$.getGlobalValue());
				cyc_kernel.cyc_assert_wff(listS($$isa, v_term, $list56), $$BaseKB, $list12);
			    } finally {
				if (NIL != release) {
				    release_lock($cyclops_lock$.getGlobalValue());
				}
			    }
			} else {
			    cyc_kernel.cyc_assert_wff(listS($$isa, v_term, $list56), $$BaseKB, $list12);
			}
		    }
		    if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
			release = NIL;
			try {
			    release = seize_lock($cyclops_lock$.getGlobalValue());
			    cyc_kernel.cyc_assert_wff(list($$isa, v_term, bottom_collection), mt_1, $list12);
			} finally {
			    if (NIL != release) {
				release_lock($cyclops_lock$.getGlobalValue());
			    }
			}
		    } else {
			cyc_kernel.cyc_assert_wff(list($$isa, v_term, bottom_collection), mt_1, $list12);
		    }
		    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
		    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
		}
	    } finally {
		final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
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
	terms = apply(symbol_function(VECTOR), nreverse(terms));
	return terms;
    }

    public static final SubLObject benchmark_cyclops_create_term_alt(SubLObject uniquifier, SubLObject index) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_term = NIL;
		if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
		    {
			SubLObject lock = $cyclops_lock$.getGlobalValue();
			SubLObject release = NIL;
			try {
			    release = seize_lock(lock);
			    v_term = cyc_kernel.cyc_create_new_ephemeral(cconcatenate($str_alt57$Term_, new SubLObject[] { format_nil.format_nil_a_no_copy(uniquifier), $str_alt58$_, format_nil.format_nil_a_no_copy(index) }));
			} finally {
			    if (NIL != release) {
				release_lock(lock);
			    }
			}
		    }
		} else {
		    v_term = cyc_kernel.cyc_create_new_ephemeral(cconcatenate($str_alt57$Term_, new SubLObject[] { format_nil.format_nil_a_no_copy(uniquifier), $str_alt58$_, format_nil.format_nil_a_no_copy(index) }));
		}
		return v_term;
	    }
	}
    }

    public static SubLObject benchmark_cyclops_create_term(final SubLObject uniquifier, final SubLObject index) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject v_term = NIL;
	if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
	    SubLObject release = NIL;
	    try {
		release = seize_lock($cyclops_lock$.getGlobalValue());
		v_term = cyc_kernel.cyc_create_new_ephemeral(cconcatenate($str58$Term_, new SubLObject[] { format_nil.format_nil_a_no_copy(uniquifier), $str59$_, format_nil.format_nil_a_no_copy(index) }));
	    } finally {
		if (NIL != release) {
		    release_lock($cyclops_lock$.getGlobalValue());
		}
	    }
	} else {
	    v_term = cyc_kernel.cyc_create_new_ephemeral(cconcatenate($str58$Term_, new SubLObject[] { format_nil.format_nil_a_no_copy(uniquifier), $str59$_, format_nil.format_nil_a_no_copy(index) }));
	}
	return v_term;
    }

    public static final SubLObject benchmark_cyclops_assert_family_links_alt(SubLObject uniquifier, SubLObject k, SubLObject terms, SubLObject family, SubLObject mt_1) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $progress_note$.setDynamicValue($$$Asserting_family_links, thread);
	    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
	    $progress_total$.setDynamicValue(k, thread);
	    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
	    {
		SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		try {
		    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
		    $last_percent_progress_prediction$.bind(NIL, thread);
		    $within_noting_percent_progress$.bind(T, thread);
		    $percent_progress_start_time$.bind(get_universal_time(), thread);
		    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		    {
			SubLObject i = NIL;
			for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
			    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
			    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
			    if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
				{
				    SubLObject lock = $cyclops_lock$.getGlobalValue();
				    SubLObject release = NIL;
				    try {
					release = seize_lock(lock);
					cyc_kernel.cyc_assert_wff(list(family, aref(terms, i), uniquifier), mt_1, $list_alt11);
				    } finally {
					if (NIL != release) {
					    release_lock(lock);
					}
				    }
				}
			    } else {
				cyc_kernel.cyc_assert_wff(list(family, aref(terms, i), uniquifier), mt_1, $list_alt11);
			    }
			}
		    }
		    noting_percent_progress_postamble();
		} finally {
		    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
		    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
		    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
		    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject benchmark_cyclops_assert_family_links(final SubLObject uniquifier, final SubLObject k, final SubLObject terms, final SubLObject family, final SubLObject mt_1) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $progress_note$.bind($$$Asserting_family_links, thread);
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_total$.bind(k, thread);
	    $progress_sofar$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		SubLObject i;
		SubLObject release;
		for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
		    if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
			release = NIL;
			try {
			    release = seize_lock($cyclops_lock$.getGlobalValue());
			    cyc_kernel.cyc_assert_wff(list(family, aref(terms, i), uniquifier), mt_1, $list12);
			} finally {
			    if (NIL != release) {
				release_lock($cyclops_lock$.getGlobalValue());
			    }
			}
		    } else {
			cyc_kernel.cyc_assert_wff(list(family, aref(terms, i), uniquifier), mt_1, $list12);
		    }
		    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
		    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
		}
	    } finally {
		final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
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
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_assert_parent_links_alt(SubLObject k, SubLObject terms, SubLObject parent, SubLObject mt_1) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $progress_note$.setDynamicValue($$$Asserting_parent_links, thread);
	    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
	    $progress_total$.setDynamicValue(k, thread);
	    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
	    {
		SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		try {
		    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
		    $last_percent_progress_prediction$.bind(NIL, thread);
		    $within_noting_percent_progress$.bind(T, thread);
		    $percent_progress_start_time$.bind(get_universal_time(), thread);
		    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		    {
			SubLObject i = NIL;
			for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
			    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
			    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
			    if (!i.numE(ZERO_INTEGER)) {
				if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
				    {
					SubLObject lock = $cyclops_lock$.getGlobalValue();
					SubLObject release = NIL;
					try {
					    release = seize_lock(lock);
					    cyc_kernel.cyc_assert_wff(list(parent, aref(terms, i), aref(terms, integerDivide(subtract(i, ONE_INTEGER), TWO_INTEGER))), mt_1, $list_alt11);
					} finally {
					    if (NIL != release) {
						release_lock(lock);
					    }
					}
				    }
				} else {
				    cyc_kernel.cyc_assert_wff(list(parent, aref(terms, i), aref(terms, integerDivide(subtract(i, ONE_INTEGER), TWO_INTEGER))), mt_1, $list_alt11);
				}
			    }
			}
		    }
		    noting_percent_progress_postamble();
		} finally {
		    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
		    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
		    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
		    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject benchmark_cyclops_assert_parent_links(final SubLObject k, final SubLObject terms, final SubLObject parent, final SubLObject mt_1) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $progress_note$.bind($$$Asserting_parent_links, thread);
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_total$.bind(k, thread);
	    $progress_sofar$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		SubLObject i;
		SubLObject release;
		for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
		    if (!i.numE(ZERO_INTEGER)) {
			if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
			    release = NIL;
			    try {
				release = seize_lock($cyclops_lock$.getGlobalValue());
				cyc_kernel.cyc_assert_wff(list(parent, aref(terms, i), aref(terms, integerDivide(subtract(i, ONE_INTEGER), TWO_INTEGER))), mt_1, $list12);
			    } finally {
				if (NIL != release) {
				    release_lock($cyclops_lock$.getGlobalValue());
				}
			    }
			} else {
			    cyc_kernel.cyc_assert_wff(list(parent, aref(terms, i), aref(terms, integerDivide(subtract(i, ONE_INTEGER), TWO_INTEGER))), mt_1, $list12);
			}
		    }
		    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
		    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
		}
	    } finally {
		final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
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
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_query_alt(SubLObject sentence, SubLObject mt, SubLObject v_properties, SubLObject error_spec) {
	{
	    SubLObject result = inference_kernel.new_cyc_query(sentence, mt, v_properties);
	    if (NIL != result) {
		return result;
	    }
	    apply(symbol_function(WARN), error_spec);
	}
	{
	    SubLObject result = inference_kernel.new_cyc_query(sentence, mt, v_properties);
	    if (NIL != result) {
		return result;
	    }
	    apply(symbol_function(ERROR), error_spec);
	}
	return NIL;
    }

    public static SubLObject benchmark_cyclops_query(final SubLObject sentence, final SubLObject mt, final SubLObject v_properties, final SubLObject error_spec) {
	SubLObject result = inference_kernel.new_cyc_query(sentence, mt, v_properties);
	if (NIL != result) {
	    return result;
	}
	apply(symbol_function(WARN), error_spec);
	result = inference_kernel.new_cyc_query(sentence, mt, v_properties);
	if (NIL != result) {
	    return result;
	}
	apply(symbol_function(ERROR), error_spec);
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_query_parent_links_alt(SubLObject k, SubLObject terms, SubLObject parent, SubLObject mt_2) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $progress_note$.setDynamicValue($$$Asking_parent_links, thread);
	    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
	    $progress_total$.setDynamicValue(k, thread);
	    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
	    {
		SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		try {
		    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
		    $last_percent_progress_prediction$.bind(NIL, thread);
		    $within_noting_percent_progress$.bind(T, thread);
		    $percent_progress_start_time$.bind(get_universal_time(), thread);
		    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		    {
			SubLObject i = NIL;
			for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
			    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
			    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
			    if (!i.numE(ZERO_INTEGER)) {
				{
				    SubLObject sentence = listS(parent, aref(terms, i), $list_alt64);
				    com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_query(sentence, mt_2, NIL, list($str_alt65$CycLOPs_error_asking_parent__S, i));
				}
			    }
			}
		    }
		    noting_percent_progress_postamble();
		} finally {
		    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
		    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
		    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
		    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject benchmark_cyclops_query_parent_links(final SubLObject k, final SubLObject terms, final SubLObject parent, final SubLObject mt_2) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $progress_note$.bind($$$Asking_parent_links, thread);
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_total$.bind(k, thread);
	    $progress_sofar$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		SubLObject i;
		SubLObject sentence;
		for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
		    if (!i.numE(ZERO_INTEGER)) {
			sentence = listS(parent, aref(terms, i), $list65);
			benchmark_cyclops_query(sentence, mt_2, NIL, list($str66$CycLOPs_error_asking_parent__S, i));
		    }
		    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
		    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
		}
	    } finally {
		final SubLObject _prev_bind_0_$29 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$29, thread);
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
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_query_ancestor_links_alt(SubLObject k, SubLObject terms, SubLObject ancestor, SubLObject mt_1) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $progress_note$.setDynamicValue($$$Asking_ancestor_links, thread);
	    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
	    $progress_total$.setDynamicValue(k, thread);
	    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
	    {
		SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		try {
		    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
		    $last_percent_progress_prediction$.bind(NIL, thread);
		    $within_noting_percent_progress$.bind(T, thread);
		    $percent_progress_start_time$.bind(get_universal_time(), thread);
		    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		    {
			SubLObject i = NIL;
			for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
			    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
			    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
			    if (!i.numE(ZERO_INTEGER)) {
				{
				    SubLObject sentence = list($$and, listS(ancestor, aref(terms, i), $list_alt67), listS($$different, aref(terms, i), $list_alt67));
				    com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_query(sentence, mt_1, NIL, list($str_alt68$CycLOPs_error__asking_ancestor__S, i));
				}
			    }
			}
		    }
		    noting_percent_progress_postamble();
		} finally {
		    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
		    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
		    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
		    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject benchmark_cyclops_query_ancestor_links(final SubLObject k, final SubLObject terms, final SubLObject ancestor, final SubLObject mt_1) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $progress_note$.bind($$$Asking_ancestor_links, thread);
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_total$.bind(k, thread);
	    $progress_sofar$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		SubLObject i;
		SubLObject sentence;
		for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
		    if (!i.numE(ZERO_INTEGER)) {
			sentence = list($$and, listS(ancestor, aref(terms, i), $list68), listS($$different, aref(terms, i), $list68));
			benchmark_cyclops_query(sentence, mt_1, NIL, list($str69$CycLOPs_error__asking_ancestor__S, i));
		    }
		    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
		    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
		}
	    } finally {
		final SubLObject _prev_bind_0_$30 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$30, thread);
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
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_query_sibling_links_via_rule_alt(SubLObject k, SubLObject terms, SubLObject sibling, SubLObject mt_2) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $progress_note$.setDynamicValue($$$Asking_sibling_links, thread);
	    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
	    $progress_total$.setDynamicValue(k, thread);
	    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
	    {
		SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		try {
		    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
		    $last_percent_progress_prediction$.bind(NIL, thread);
		    $within_noting_percent_progress$.bind(T, thread);
		    $percent_progress_start_time$.bind(get_universal_time(), thread);
		    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		    {
			SubLObject i = NIL;
			for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
			    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
			    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
			    if (!i.numE(ZERO_INTEGER)) {
				{
				    SubLObject sentence = listS(sibling, aref(terms, i), $list_alt70);
				    SubLObject v_properties = $list_alt71;
				    com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_query(sentence, mt_2, v_properties, list($str_alt72$CycLOPs_error__asking_sibling__S_, i));
				}
			    }
			}
		    }
		    noting_percent_progress_postamble();
		} finally {
		    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
		    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
		    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
		    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject benchmark_cyclops_query_sibling_links_via_rule(final SubLObject k, final SubLObject terms, final SubLObject sibling, final SubLObject mt_2) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $progress_note$.bind($$$Asking_sibling_links, thread);
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_total$.bind(k, thread);
	    $progress_sofar$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		SubLObject i;
		SubLObject sentence;
		SubLObject v_properties;
		for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
		    if (!i.numE(ZERO_INTEGER)) {
			sentence = listS(sibling, aref(terms, i), $list71);
			v_properties = $list72;
			benchmark_cyclops_query(sentence, mt_2, v_properties, list($str73$CycLOPs_error__asking_sibling__S_, i));
		    }
		    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
		    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
		}
	    } finally {
		final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
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
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_forward_propagate_sibling_rule_alt(SubLObject uniquifier, SubLObject parent, SubLObject sibling, SubLObject family) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
		{
		    SubLObject lock = $cyclops_lock$.getGlobalValue();
		    SubLObject release = NIL;
		    try {
			release = seize_lock(lock);
			com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $FORWARD);
		    } finally {
			if (NIL != release) {
			    release_lock(lock);
			}
		    }
		}
	    } else {
		com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $FORWARD);
	    }
	    return NIL;
	}
    }

    public static SubLObject benchmark_cyclops_forward_propagate_sibling_rule(final SubLObject uniquifier, final SubLObject parent, final SubLObject sibling, final SubLObject family) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
	    SubLObject release = NIL;
	    try {
		release = seize_lock($cyclops_lock$.getGlobalValue());
		benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $FORWARD);
	    } finally {
		if (NIL != release) {
		    release_lock($cyclops_lock$.getGlobalValue());
		}
	    }
	} else {
	    benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $FORWARD);
	}
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_turn_sibling_rule_backward_alt(SubLObject uniquifier, SubLObject parent, SubLObject sibling, SubLObject family) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
		{
		    SubLObject lock = $cyclops_lock$.getGlobalValue();
		    SubLObject release = NIL;
		    try {
			release = seize_lock(lock);
			com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $BACKWARD);
		    } finally {
			if (NIL != release) {
			    release_lock(lock);
			}
		    }
		}
	    } else {
		com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $BACKWARD);
	    }
	    return NIL;
	}
    }

    public static SubLObject benchmark_cyclops_turn_sibling_rule_backward(final SubLObject uniquifier, final SubLObject parent, final SubLObject sibling, final SubLObject family) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
	    SubLObject release = NIL;
	    try {
		release = seize_lock($cyclops_lock$.getGlobalValue());
		benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $BACKWARD);
	    } finally {
		if (NIL != release) {
		    release_lock($cyclops_lock$.getGlobalValue());
		}
	    }
	} else {
	    benchmark_cyclops_assert_sibling_rule(uniquifier, parent, sibling, family, $BACKWARD);
	}
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_query_sibling_links_via_lookup_alt(SubLObject k, SubLObject terms, SubLObject sibling, SubLObject mt_2) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $progress_note$.setDynamicValue($$$Asking_sibling_links, thread);
	    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
	    $progress_total$.setDynamicValue(k, thread);
	    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
	    {
		SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		try {
		    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
		    $last_percent_progress_prediction$.bind(NIL, thread);
		    $within_noting_percent_progress$.bind(T, thread);
		    $percent_progress_start_time$.bind(get_universal_time(), thread);
		    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		    {
			SubLObject i = NIL;
			for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
			    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
			    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
			    if (!i.numE(ZERO_INTEGER)) {
				{
				    SubLObject sentence = listS(sibling, aref(terms, i), $list_alt70);
				    com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_query(sentence, mt_2, NIL, list($str_alt74$CycLOPs_error__asking_sibling__S, i));
				}
			    }
			}
		    }
		    noting_percent_progress_postamble();
		} finally {
		    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
		    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
		    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
		    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject benchmark_cyclops_query_sibling_links_via_lookup(final SubLObject k, final SubLObject terms, final SubLObject sibling, final SubLObject mt_2) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $progress_note$.bind($$$Asking_sibling_links, thread);
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_total$.bind(k, thread);
	    $progress_sofar$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		SubLObject i;
		SubLObject sentence;
		for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
		    if (!i.numE(ZERO_INTEGER)) {
			sentence = listS(sibling, aref(terms, i), $list71);
			benchmark_cyclops_query(sentence, mt_2, NIL, list($str75$CycLOPs_error__asking_sibling__S, i));
		    }
		    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
		    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
		}
	    } finally {
		final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
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
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_kill_terms_alt(SubLObject k, SubLObject terms) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    $progress_note$.setDynamicValue($$$Killing_terms, thread);
	    $progress_start_time$.setDynamicValue(get_universal_time(), thread);
	    $progress_total$.setDynamicValue(k, thread);
	    $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
	    {
		SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		try {
		    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
		    $last_percent_progress_prediction$.bind(NIL, thread);
		    $within_noting_percent_progress$.bind(T, thread);
		    $percent_progress_start_time$.bind(get_universal_time(), thread);
		    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		    {
			SubLObject i = NIL;
			for (i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
			    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
			    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
			    if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
				{
				    SubLObject lock = $cyclops_lock$.getGlobalValue();
				    SubLObject release = NIL;
				    try {
					release = seize_lock(lock);
					cyc_kernel.cyc_kill(aref(terms, i));
				    } finally {
					if (NIL != release) {
					    release_lock(lock);
					}
				    }
				}
			    } else {
				cyc_kernel.cyc_kill(aref(terms, i));
			    }
			}
		    }
		    noting_percent_progress_postamble();
		} finally {
		    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
		    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
		    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
		    $last_percent_progress_index$.rebind(_prev_bind_0, thread);
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject benchmark_cyclops_kill_terms(final SubLObject k, final SubLObject terms) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $progress_note$.bind($$$Killing_terms, thread);
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_total$.bind(k, thread);
	    $progress_sofar$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		SubLObject i;
		SubLObject release;
		for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
		    if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
			release = NIL;
			try {
			    release = seize_lock($cyclops_lock$.getGlobalValue());
			    cyc_kernel.cyc_kill(aref(terms, i));
			} finally {
			    if (NIL != release) {
				release_lock($cyclops_lock$.getGlobalValue());
			    }
			}
		    } else {
			cyc_kernel.cyc_kill(aref(terms, i));
		    }
		    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
		    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
		}
	    } finally {
		final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
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
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_kill_vocabulary_alt(SubLObject mt_1, SubLObject mt_2, SubLObject collections, SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject list_var = collections;
		$progress_note$.setDynamicValue($$$Killing_collections, thread);
		$progress_start_time$.setDynamicValue(get_universal_time(), thread);
		$progress_total$.setDynamicValue(length(list_var), thread);
		$progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
		{
		    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
		    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
		    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
		    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
		    try {
			$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
			$last_percent_progress_prediction$.bind(NIL, thread);
			$within_noting_percent_progress$.bind(T, thread);
			$percent_progress_start_time$.bind(get_universal_time(), thread);
			noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
			{
			    SubLObject csome_list_var = list_var;
			    SubLObject col = NIL;
			    for (col = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest(), col = csome_list_var.first()) {
				note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
				$progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
				cyc_kernel.cyc_kill(col);
			    }
			}
			noting_percent_progress_postamble();
		    } finally {
			$percent_progress_start_time$.rebind(_prev_bind_3, thread);
			$within_noting_percent_progress$.rebind(_prev_bind_2, thread);
			$last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
			$last_percent_progress_index$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    cyc_kernel.cyc_kill(family);
	    cyc_kernel.cyc_kill(sibling);
	    cyc_kernel.cyc_kill(ancestor);
	    cyc_kernel.cyc_kill(parent);
	    cyc_kernel.cyc_kill(mt_2);
	    cyc_kernel.cyc_kill(mt_1);
	    return NIL;
	}
    }

    public static SubLObject benchmark_cyclops_kill_vocabulary(final SubLObject mt_1, final SubLObject mt_2, final SubLObject collections, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	try {
	    $progress_note$.bind($$$Killing_collections, thread);
	    $progress_start_time$.bind(get_universal_time(), thread);
	    $progress_total$.bind(length(collections), thread);
	    $progress_sofar$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
	    $last_percent_progress_prediction$.bind(NIL, thread);
	    $within_noting_percent_progress$.bind(T, thread);
	    $percent_progress_start_time$.bind(get_universal_time(), thread);
	    try {
		noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		SubLObject csome_list_var = collections;
		SubLObject col = NIL;
		col = csome_list_var.first();
		while (NIL != csome_list_var) {
		    cyc_kernel.cyc_kill(col);
		    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
		    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
		    csome_list_var = csome_list_var.rest();
		    col = csome_list_var.first();
		}
	    } finally {
		final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    noting_percent_progress_postamble();
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
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
	cyc_kernel.cyc_kill(family);
	cyc_kernel.cyc_kill(sibling);
	cyc_kernel.cyc_kill(ancestor);
	cyc_kernel.cyc_kill(parent);
	cyc_kernel.cyc_kill(mt_2);
	cyc_kernel.cyc_kill(mt_1);
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_print_statistics_alt(SubLObject stream, SubLObject bogomips, SubLObject k, SubLObject guts_time, SubLObject efficiency, SubLObject cyclops) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
		try {
		    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
		    format(stream, $str_alt78$__CycLOPs_Benchmark_Results);
		    format(stream, $str_alt79$_________________________________);
		    format(stream, $str_alt80$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
		    if (NIL != bogomips) {
			format(stream, $str_alt81$__Bogomips______S, bogomips);
		    }
		    format(stream, $str_alt82$__Scaling_factor______S, k);
		    format(stream, $str_alt83$__Elapsed_time__seconds_______S, number_utilities.significant_digits(guts_time, FOUR_INTEGER));
		    format(stream, $str_alt84$__Efficiency__seconds_op_______S, number_utilities.significant_digits(efficiency, FOUR_INTEGER));
		    format(stream, $str_alt85$__CycLOPs______S, number_utilities.significant_digits(cyclops, FOUR_INTEGER));
		    if (NIL != bogomips) {
			format(stream, $str_alt86$__Bogomips_CycLOPs_______S, number_utilities.significant_digits(divide(bogomips, cyclops), FOUR_INTEGER));
		    }
		    terpri(stream);
		    force_output(stream);
		} finally {
		    $read_default_float_format$.rebind(_prev_bind_0, thread);
		}
	    }
	    return stream;
	}
    }

    public static SubLObject benchmark_cyclops_print_statistics(final SubLObject stream, final SubLObject bogomips, final SubLObject k, final SubLObject guts_time, final SubLObject efficiency, final SubLObject cyclops) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
	try {
	    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
	    format(stream, $str80$__CycLOPs_Benchmark_Results);
	    format(stream, $str81$_________________________________);
	    format(stream, $str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
	    if (NIL != bogomips) {
		format(stream, $str83$__Bogomips______S, bogomips);
	    }
	    format(stream, $str84$__Scaling_factor______S, k);
	    format(stream, $str85$__Elapsed_time__seconds_______S, number_utilities.significant_digits(guts_time, FOUR_INTEGER));
	    format(stream, $str86$__Efficiency__seconds_op_______S, number_utilities.significant_digits(efficiency, FOUR_INTEGER));
	    format(stream, $str87$__CycLOPs______S, number_utilities.significant_digits(cyclops, FOUR_INTEGER));
	    if (NIL != bogomips) {
		format(stream, $str88$__Bogomips_CycLOPs_______S, number_utilities.significant_digits(divide(bogomips, cyclops), FOUR_INTEGER));
	    }
	    terpri(stream);
	    force_output(stream);
	} finally {
	    $read_default_float_format$.rebind(_prev_bind_0, thread);
	}
	return stream;
    }

    public static final SubLObject benchmark_cyclops_print_statistical_summary_alt(SubLObject stream, SubLObject values) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
		try {
		    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
		    format(stream, $str_alt87$__CycLOPs_Benchmark_Statistical_S);
		    format(stream, $str_alt79$_________________________________);
		    format(stream, $str_alt80$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
		    format(stream, $str_alt88$__Raw_Data______S, Mapping.mapcar(FOUR_SIGNIFICANT_DIGITS, values));
		    format(stream, $str_alt90$__Sorted_Data______S, Mapping.mapcar(FOUR_SIGNIFICANT_DIGITS, Sort.sort(copy_list(values), symbol_function($sym91$_), UNPROVIDED)));
		    format(stream, $str_alt92$__N______S, length(values));
		    format(stream, $str_alt93$__Min______S, number_utilities.four_significant_digits(number_utilities.minimum(values, UNPROVIDED)));
		    format(stream, $str_alt94$__Max______S, number_utilities.four_significant_digits(number_utilities.maximum(values, UNPROVIDED)));
		    format(stream, $str_alt95$__Median______S, number_utilities.four_significant_digits(number_utilities.median(values, UNPROVIDED)));
		    format(stream, $str_alt96$__Mean______S, number_utilities.four_significant_digits(number_utilities.mean(values)));
		    format(stream, $str_alt97$__Standard_Deviation______S, number_utilities.four_significant_digits(number_utilities.standard_deviation(values)));
		    terpri(stream);
		    force_output(stream);
		} finally {
		    $read_default_float_format$.rebind(_prev_bind_0, thread);
		}
	    }
	    return stream;
	}
    }

    public static SubLObject benchmark_cyclops_print_statistical_summary(final SubLObject stream, final SubLObject values) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
	try {
	    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
	    format(stream, $str89$__CycLOPs_Benchmark_Statistical_S);
	    format(stream, $str81$_________________________________);
	    format(stream, $str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
	    format(stream, $str90$__Raw_Data______S, Mapping.mapcar(FOUR_SIGNIFICANT_DIGITS, values));
	    format(stream, $str92$__Sorted_Data______S, Mapping.mapcar(FOUR_SIGNIFICANT_DIGITS, Sort.sort(copy_list(values), symbol_function($sym93$_), UNPROVIDED)));
	    format(stream, $str94$__N______S, length(values));
	    format(stream, $str95$__Min______S, number_utilities.four_significant_digits(number_utilities.minimum(values, UNPROVIDED)));
	    format(stream, $str96$__Max______S, number_utilities.four_significant_digits(number_utilities.maximum(values, UNPROVIDED)));
	    format(stream, $str97$__Median______S, number_utilities.four_significant_digits(number_utilities.median(values, UNPROVIDED, UNPROVIDED)));
	    format(stream, $str98$__Mean______S, number_utilities.four_significant_digits(number_utilities.mean(values)));
	    format(stream, $str99$__Standard_Deviation______S, number_utilities.four_significant_digits(number_utilities.standard_deviation(values)));
	    terpri(stream);
	    force_output(stream);
	} finally {
	    $read_default_float_format$.rebind(_prev_bind_0, thread);
	}
	return stream;
    }

    public static SubLObject expensive_cyclops_rules(SubLObject threshold) {
	if (threshold == UNPROVIDED) {
	    threshold = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	benchmark_cyclops_compensating_for_paging(THREE_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
	final SubLObject rules_one = expensive_cyclops_rules_int(threshold, $cyclops_rule_expensiveness_threshold$.getDynamicValue(thread));
	final SubLObject rules_two = expensive_cyclops_rules_int(threshold, $cyclops_rule_expensiveness_threshold$.getDynamicValue(thread));
	return keyhash_utilities.fast_intersection(rules_one, rules_two, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject expensive_cyclops_rules_int(final SubLObject threshold, final SubLObject stdev_threshold) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject result = NIL;
	inference_metrics.clear_forward_inference_metrics();
	final SubLObject _prev_bind_0 = inference_metrics.$gathering_forward_inference_metricsP$.currentBinding(thread);
	final SubLObject _prev_bind_2 = $browse_forward_inferencesP$.currentBinding(thread);
	try {
	    inference_metrics.$gathering_forward_inference_metricsP$.bind(T, thread);
	    $browse_forward_inferencesP$.bind(NIL, thread);
	    benchmark_cyclops_compensating_for_paging(ZERO_INTEGER, ONE_INTEGER, UNPROVIDED, UNPROVIDED);
	    inference_metrics.finalize_forward_inference_metrics_inference_index();
	} finally {
	    $browse_forward_inferencesP$.rebind(_prev_bind_2, thread);
	    inference_metrics.$gathering_forward_inference_metricsP$.rebind(_prev_bind_0, thread);
	}
	final SubLObject info = inference_metrics.forward_inference_metrics_info(threshold);
	final SubLObject global_statistics = inference_metrics.global_statistics_from_forward_inference_metrics_info(info);
	final SubLObject current;
	final SubLObject datum = current = global_statistics;
	final SubLObject average_time_per_rule_tail = property_list_member($AVERAGE_TIME_PER_RULE, current);
	final SubLObject average_time_per_rule = (NIL != average_time_per_rule_tail) ? cadr(average_time_per_rule_tail) : NIL;
	final SubLObject stdev_time_per_rule_tail = property_list_member($STDEV_TIME_PER_RULE, current);
	final SubLObject stdev_time_per_rule = (NIL != stdev_time_per_rule_tail) ? cadr(stdev_time_per_rule_tail) : NIL;
	SubLObject cdolist_list_var = info;
	SubLObject rule_info = NIL;
	rule_info = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject current_$36;
	    final SubLObject datum_$35 = current_$36 = rule_info;
	    final SubLObject rule_tail = property_list_member($RULE, current_$36);
	    final SubLObject rule = (NIL != rule_tail) ? cadr(rule_tail) : NIL;
	    final SubLObject time_tail = property_list_member($TIME, current_$36);
	    final SubLObject time = (NIL != time_tail) ? cadr(time_tail) : NIL;
	    final SubLObject inference_count_tail = property_list_member($INFERENCE_COUNT, current_$36);
	    final SubLObject inference_count = (NIL != inference_count_tail) ? cadr(inference_count_tail) : NIL;
	    if (inference_count.isPositive()) {
		final SubLObject stdevs = number_utilities.standard_deviations_above_mean(time, average_time_per_rule, stdev_time_per_rule);
		if (stdevs.numG(stdev_threshold)) {
		    result = cons(rule, result);
		}
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    rule_info = cdolist_list_var.first();
	}
	return nreverse(result);
    }

    /**
     * The standard interface function for parallel CycLOPs benchmarking.
     * Simultenously run PARALLEL-N number of CycLOPs benchmarks in parallel threads.
     * Each thread runs the CycLOPs benchmark THROWAWAY-N times and ignores those results.
     * Each thread then runs it SAMPLE-N more times and returns the median of those sampled results.
     */
    @LispMethod(comment = "The standard interface function for parallel CycLOPs benchmarking.\r\nSimultenously run PARALLEL-N number of CycLOPs benchmarks in parallel threads.\r\nEach thread runs the CycLOPs benchmark THROWAWAY-N times and ignores those results.\r\nEach thread then runs it SAMPLE-N more times and returns the median of those sampled results.\nThe standard interface function for parallel CycLOPs benchmarking.\nSimultenously run PARALLEL-N number of CycLOPs benchmarks in parallel threads.\nEach thread runs the CycLOPs benchmark THROWAWAY-N times and ignores those results.\nEach thread then runs it SAMPLE-N more times and returns the median of those sampled results.")
    public static final SubLObject benchmark_parallel_cyclops_compensating_for_paging_alt(SubLObject parallel_n, SubLObject throwaway_n, SubLObject sample_n, SubLObject power, SubLObject stream) {
	if (parallel_n == UNPROVIDED) {
	    parallel_n = TWO_INTEGER;
	}
	if (throwaway_n == UNPROVIDED) {
	    throwaway_n = $cyclops_throwaway_default$.getGlobalValue();
	}
	if (sample_n == UNPROVIDED) {
	    sample_n = SEVEN_INTEGER;
	}
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	{
	    SubLObject total_n = add(throwaway_n, sample_n);
	    return com.cyc.cycjava.cycl.system_benchmarks.median_parallel_cyclops(parallel_n, total_n, power, stream, throwaway_n);
	}
    }

    /**
     * The standard interface function for parallel CycLOPs benchmarking.
     * Simultenously run PARALLEL-N number of CycLOPs benchmarks in parallel threads.
     * Each thread runs the CycLOPs benchmark THROWAWAY-N times and ignores those results.
     * Each thread then runs it SAMPLE-N more times and returns the median of those sampled results.
     */
    @LispMethod(comment = "The standard interface function for parallel CycLOPs benchmarking.\r\nSimultenously run PARALLEL-N number of CycLOPs benchmarks in parallel threads.\r\nEach thread runs the CycLOPs benchmark THROWAWAY-N times and ignores those results.\r\nEach thread then runs it SAMPLE-N more times and returns the median of those sampled results.\nThe standard interface function for parallel CycLOPs benchmarking.\nSimultenously run PARALLEL-N number of CycLOPs benchmarks in parallel threads.\nEach thread runs the CycLOPs benchmark THROWAWAY-N times and ignores those results.\nEach thread then runs it SAMPLE-N more times and returns the median of those sampled results.")
    public static SubLObject benchmark_parallel_cyclops_compensating_for_paging(SubLObject parallel_n, SubLObject throwaway_n, SubLObject sample_n, SubLObject power, SubLObject stream) {
	if (parallel_n == UNPROVIDED) {
	    parallel_n = TWO_INTEGER;
	}
	if (throwaway_n == UNPROVIDED) {
	    throwaway_n = $cyclops_throwaway_default$.getGlobalValue();
	}
	if (sample_n == UNPROVIDED) {
	    sample_n = SEVEN_INTEGER;
	}
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	final SubLObject total_n = add(throwaway_n, sample_n);
	return median_parallel_cyclops(parallel_n, total_n, power, stream, throwaway_n);
    }

    public static final SubLObject benchmark_parallel_cyclops_efficiency_alt(SubLObject max_parallel_n, SubLObject throwaway_n, SubLObject sample_n, SubLObject stream) {
	if (throwaway_n == UNPROVIDED) {
	    throwaway_n = $cyclops_throwaway_default$.getGlobalValue();
	}
	if (sample_n == UNPROVIDED) {
	    sample_n = SEVEN_INTEGER;
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject raw_results = NIL;
		SubLObject end_var = number_utilities.f_1X(max_parallel_n);
		SubLObject parallel_n = NIL;
		for (parallel_n = ONE_INTEGER; !parallel_n.numGE(end_var); parallel_n = number_utilities.f_1X(parallel_n)) {
		    {
			SubLObject raw_result = com.cyc.cycjava.cycl.system_benchmarks.benchmark_parallel_cyclops_compensating_for_paging(parallel_n, throwaway_n, sample_n, $benchmark_cyclops_power$.getDynamicValue(thread), StreamsLow.$null_output$.getDynamicValue(thread));
			format(stream, $str_alt99$___S____S, parallel_n, number_utilities.four_significant_digits(raw_result));
			raw_results = cons(raw_result, raw_results);
			{
			    SubLObject efficiency = divide(raw_result, divide(last(raw_results, UNPROVIDED).first(), parallel_n));
			    format(stream, $str_alt100$__eff____S, number_utilities.four_significant_digits(efficiency));
			    force_output(stream);
			}
		    }
		}
		terpri(stream);
		return nreverse(raw_results);
	    }
	}
    }

    public static SubLObject benchmark_parallel_cyclops_efficiency(final SubLObject max_parallel_n, SubLObject throwaway_n, SubLObject sample_n, SubLObject stream) {
	if (throwaway_n == UNPROVIDED) {
	    throwaway_n = $cyclops_throwaway_default$.getGlobalValue();
	}
	if (sample_n == UNPROVIDED) {
	    sample_n = SEVEN_INTEGER;
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject raw_results = NIL;
	SubLObject end_var;
	SubLObject parallel_n;
	SubLObject raw_result;
	SubLObject efficiency;
	for (end_var = number_utilities.f_1X(max_parallel_n), parallel_n = NIL, parallel_n = ONE_INTEGER; !parallel_n.numGE(end_var); parallel_n = number_utilities.f_1X(parallel_n)) {
	    raw_result = benchmark_parallel_cyclops_compensating_for_paging(parallel_n, throwaway_n, sample_n, $benchmark_cyclops_power$.getDynamicValue(thread), StreamsLow.$null_output$.getDynamicValue(thread));
	    format(stream, $str106$___S____S, parallel_n, number_utilities.four_significant_digits(raw_result));
	    raw_results = cons(raw_result, raw_results);
	    efficiency = divide(raw_result, divide(last(raw_results, UNPROVIDED).first(), parallel_n));
	    format(stream, $str107$__eff____S, number_utilities.four_significant_digits(efficiency));
	    force_output(stream);
	}
	terpri(stream);
	return nreverse(raw_results);
    }

    /**
     * Runs benchmark-parallel-cyclops N times and returns the median recorded value.
     * PARALLEL is the number of parallel threads to run simultaneously.
     */
    @LispMethod(comment = "Runs benchmark-parallel-cyclops N times and returns the median recorded value.\r\nPARALLEL is the number of parallel threads to run simultaneously.\nRuns benchmark-parallel-cyclops N times and returns the median recorded value.\nPARALLEL is the number of parallel threads to run simultaneously.")
    public static final SubLObject median_parallel_cyclops_alt(SubLObject parallel, SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (throw_away_first_n == UNPROVIDED) {
	    throw_away_first_n = ZERO_INTEGER;
	}
	{
	    SubLObject cyclops = number_utilities.median(com.cyc.cycjava.cycl.system_benchmarks.benchmark_parallel_cyclops_n_times(parallel, n, power, stream, throw_away_first_n), UNPROVIDED);
	    SubLObject bogomips = misc_utilities.machine_bogomips();
	    if (NIL != bogomips) {
		return values(cyclops, divide(bogomips, cyclops));
	    } else {
		return cyclops;
	    }
	}
    }

    /**
     * Runs benchmark-parallel-cyclops N times and returns the median recorded value.
     * PARALLEL is the number of parallel threads to run simultaneously.
     */
    @LispMethod(comment = "Runs benchmark-parallel-cyclops N times and returns the median recorded value.\r\nPARALLEL is the number of parallel threads to run simultaneously.\nRuns benchmark-parallel-cyclops N times and returns the median recorded value.\nPARALLEL is the number of parallel threads to run simultaneously.")
    public static SubLObject median_parallel_cyclops(final SubLObject parallel, final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (throw_away_first_n == UNPROVIDED) {
	    throw_away_first_n = ZERO_INTEGER;
	}
	final SubLObject cyclops = number_utilities.median(benchmark_parallel_cyclops_n_times(parallel, n, power, stream, throw_away_first_n), UNPROVIDED, UNPROVIDED);
	final SubLObject bogomips = misc_utilities.machine_bogomips();
	if (NIL != bogomips) {
	    return values(cyclops, divide(bogomips, cyclops));
	}
	return cyclops;
    }

    /**
     *
     *
     * @param THROW-AWAY-FIRST-N
     * 		integerp; if zero, has no effect.
     * 		if greater than zero, it will toss out (i.e. not return) the first THROW-AWAY-FIRST-N results.
     * 		This can be used to compensate for paging.
     */
    @LispMethod(comment = "@param THROW-AWAY-FIRST-N\r\n\t\tintegerp; if zero, has no effect.\r\n\t\tif greater than zero, it will toss out (i.e. not return) the first THROW-AWAY-FIRST-N results.\r\n\t\tThis can be used to compensate for paging.")
    public static final SubLObject benchmark_parallel_cyclops_n_times_alt(SubLObject parallel, SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (throw_away_first_n == UNPROVIDED) {
	    throw_away_first_n = ZERO_INTEGER;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(parallel, POSITIVE_INTEGER_P);
	    SubLTrampolineFile.checkType(n, NON_NEGATIVE_INTEGER_P);
	    SubLTrampolineFile.checkType(power, NON_NEGATIVE_INTEGER_P);
	    {
		SubLObject values = NIL;
		thread.resetMultipleValues();
		{
		    SubLObject mt_1 = com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_setup();
		    SubLObject mt_2 = thread.secondMultipleValue();
		    SubLObject collections = thread.thirdMultipleValue();
		    SubLObject bottom_collection = thread.fourthMultipleValue();
		    SubLObject parent = thread.fifthMultipleValue();
		    SubLObject ancestor = thread.sixthMultipleValue();
		    SubLObject sibling = thread.seventhMultipleValue();
		    SubLObject family = thread.eighthMultipleValue();
		    thread.resetMultipleValues();
		    try {
			{
			    SubLObject i = NIL;
			    for (i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
				{
				    SubLObject guts_time = com.cyc.cycjava.cycl.system_benchmarks.benchmark_parallel_cyclops_guts(parallel, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
				    SubLObject cyclops = com.cyc.cycjava.cycl.system_benchmarks.benchmark_parallel_cyclops_compute_and_print_statistics(stream, parallel, power, guts_time);
				    if (i.numGE(throw_away_first_n)) {
					values = cons(cyclops, values);
				    }
				}
			    }
			}
		    } finally {
			{
			    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
			    try {
				$is_thread_performing_cleanupP$.bind(T, thread);
				com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_teardown(mt_1, mt_2, collections, parent, ancestor, sibling, family);
			    } finally {
				$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
			    }
			}
		    }
		}
		values = nreverse(values);
		if (n.numG(ONE_INTEGER)) {
		    com.cyc.cycjava.cycl.system_benchmarks.benchmark_parallel_cyclops_print_statistical_summary(stream, parallel, values);
		}
		return values;
	    }
	}
    }

    /**
     *
     *
     * @param THROW-AWAY-FIRST-N
     * 		integerp; if zero, has no effect.
     * 		if greater than zero, it will toss out (i.e. not return) the first THROW-AWAY-FIRST-N results.
     * 		This can be used to compensate for paging.
     */
    @LispMethod(comment = "@param THROW-AWAY-FIRST-N\r\n\t\tintegerp; if zero, has no effect.\r\n\t\tif greater than zero, it will toss out (i.e. not return) the first THROW-AWAY-FIRST-N results.\r\n\t\tThis can be used to compensate for paging.")
    public static SubLObject benchmark_parallel_cyclops_n_times(final SubLObject parallel, final SubLObject n, SubLObject power, SubLObject stream, SubLObject throw_away_first_n) {
	if (power == UNPROVIDED) {
	    power = $benchmark_cyclops_power$.getDynamicValue();
	}
	if (stream == UNPROVIDED) {
	    stream = StreamsLow.$standard_output$.getDynamicValue();
	}
	if (throw_away_first_n == UNPROVIDED) {
	    throw_away_first_n = ZERO_INTEGER;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != subl_promotions.positive_integer_p(parallel) : "! subl_promotions.positive_integer_p(parallel) " + ("subl_promotions.positive_integer_p(parallel) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(parallel) ") + parallel;
	assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
	assert NIL != subl_promotions.non_negative_integer_p(power) : "! subl_promotions.non_negative_integer_p(power) " + ("subl_promotions.non_negative_integer_p(power) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(power) ") + power;
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
	try {
	    SubLObject i;
	    SubLObject guts_time;
	    SubLObject cyclops;
	    for (i = NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
		guts_time = benchmark_parallel_cyclops_guts(parallel, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
		cyclops = benchmark_parallel_cyclops_compute_and_print_statistics(stream, parallel, power, guts_time);
		if (i.numGE(throw_away_first_n)) {
		    values = cons(cyclops, values);
		}
	    }
	} finally {
	    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		benchmark_cyclops_teardown(mt_1, mt_2, collections, parent, ancestor, sibling, family);
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
	    }
	}
	values = nreverse(values);
	if (n.numG(ONE_INTEGER)) {
	    benchmark_parallel_cyclops_print_statistical_summary(stream, parallel, values);
	}
	return values;
    }

    public static final SubLObject benchmark_parallel_cyclops_guts_alt(SubLObject parallel, SubLObject power, SubLObject mt_1, SubLObject mt_2, SubLObject bottom_collection, SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
	Storage.gc_ephemeral();
	{
	    SubLObject time = NIL;
	    SubLObject time_var = get_internal_real_time();
	    {
		SubLObject semaphore = Semaphores.new_semaphore($$$Parallel_CycLOPs, ZERO_INTEGER);
		{
		    SubLObject i = NIL;
		    for (i = ZERO_INTEGER; i.numL(parallel); i = add(i, ONE_INTEGER)) {
			{
			    SubLObject thread_name = cconcatenate($str_alt103$Parallel_CycLOPs_thread_, format_nil.format_nil_a_no_copy(i));
			    make_process_with_args(thread_name, BENCHMARK_PARALLEL_CYCLOPS_GUTS_THREAD, list(new SubLObject[] { i, semaphore, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family }));
			}
		    }
		}
		{
		    SubLObject i = NIL;
		    for (i = ZERO_INTEGER; i.numL(parallel); i = add(i, ONE_INTEGER)) {
			Semaphores.semaphore_wait(semaphore);
		    }
		}
	    }
	    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
	    return time;
	}
    }

    public static SubLObject benchmark_parallel_cyclops_guts(final SubLObject parallel, final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
	Storage.gc_ephemeral();
	SubLObject time = NIL;
	final SubLObject time_var = get_internal_real_time();
	final SubLObject semaphore = Semaphores.new_semaphore($$$Parallel_CycLOPs, ZERO_INTEGER);
	SubLObject i;
	SubLObject thread_name;
	for (i = NIL, i = ZERO_INTEGER; i.numL(parallel); i = add(i, ONE_INTEGER)) {
	    thread_name = cconcatenate($$$Parallel_CycLOPs_thread_, format_nil.format_nil_a_no_copy(i));
	    subl_promotions.make_process_with_args(thread_name, BENCHMARK_PARALLEL_CYCLOPS_GUTS_THREAD, list(new SubLObject[] { i, semaphore, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family }));
	}
	for (i = NIL, i = ZERO_INTEGER; i.numL(parallel); i = add(i, ONE_INTEGER)) {
	    Semaphores.semaphore_wait(semaphore);
	}
	time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
	return time;
    }

    public static final SubLObject benchmark_parallel_cyclops_guts_thread_alt(SubLObject thread_number, SubLObject semaphore, SubLObject power, SubLObject mt_1, SubLObject mt_2, SubLObject bottom_collection, SubLObject parent, SubLObject ancestor, SubLObject sibling, SubLObject family) {
	try {
	    com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops_guts_int(thread_number, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
	} finally {
	    {
		SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
		try {
		    bind($is_thread_performing_cleanupP$, T);
		    Semaphores.semaphore_signal(semaphore);
		} finally {
		    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
		}
	    }
	}
	return NIL;
    }

    public static SubLObject benchmark_parallel_cyclops_guts_thread(final SubLObject thread_number, final SubLObject semaphore, final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor,
	    final SubLObject sibling, final SubLObject family) {
	try {
	    benchmark_cyclops_guts_int(thread_number, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
	} finally {
	    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
	    try {
		bind($is_thread_performing_cleanupP$, T);
		final SubLObject _values = getValuesAsVector();
		Semaphores.semaphore_signal(semaphore);
		restoreValuesFromVector(_values);
	    } finally {
		rebind($is_thread_performing_cleanupP$, _prev_bind_0);
	    }
	}
	return NIL;
    }

    public static final SubLObject benchmark_parallel_cyclops_compute_and_print_statistics_alt(SubLObject stream, SubLObject parallel, SubLObject power, SubLObject guts_time) {
	{
	    SubLObject k = subtract(expt(TWO_INTEGER, power), ONE_INTEGER);
	    SubLObject efficiency = divide(guts_time, k);
	    SubLObject cyclops = invert(efficiency);
	    SubLObject bogomips = misc_utilities.machine_bogomips();
	    com.cyc.cycjava.cycl.system_benchmarks.benchmark_parallel_cyclops_print_statistics(stream, parallel, bogomips, k, guts_time, efficiency, cyclops);
	    return cyclops;
	}
    }

    public static SubLObject benchmark_parallel_cyclops_compute_and_print_statistics(final SubLObject stream, final SubLObject parallel, final SubLObject power, final SubLObject guts_time) {
	final SubLObject k = subtract(expt(TWO_INTEGER, power), ONE_INTEGER);
	final SubLObject efficiency = divide(guts_time, k);
	final SubLObject cyclops = invert(efficiency);
	final SubLObject bogomips = misc_utilities.machine_bogomips();
	benchmark_parallel_cyclops_print_statistics(stream, parallel, bogomips, k, guts_time, efficiency, cyclops);
	return cyclops;
    }

    public static final SubLObject benchmark_parallel_cyclops_print_statistics_alt(SubLObject stream, SubLObject parallel, SubLObject bogomips, SubLObject k, SubLObject guts_time, SubLObject efficiency, SubLObject cyclops) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
		try {
		    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
		    format(stream, $str_alt105$__Parallel_CycLOPs_Benchmark_Resu);
		    format(stream, $str_alt79$_________________________________);
		    format(stream, $str_alt80$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
		    format(stream, $str_alt106$__Parallelism_________S, parallel);
		    if (NIL != bogomips) {
			format(stream, $str_alt81$__Bogomips______S, bogomips);
		    }
		    format(stream, $str_alt82$__Scaling_factor______S, k);
		    format(stream, $str_alt83$__Elapsed_time__seconds_______S, number_utilities.significant_digits(guts_time, FOUR_INTEGER));
		    format(stream, $str_alt84$__Efficiency__seconds_op_______S, number_utilities.significant_digits(efficiency, FOUR_INTEGER));
		    format(stream, $str_alt85$__CycLOPs______S, number_utilities.significant_digits(cyclops, FOUR_INTEGER));
		    if (NIL != bogomips) {
			format(stream, $str_alt86$__Bogomips_CycLOPs_______S, number_utilities.significant_digits(divide(bogomips, cyclops), FOUR_INTEGER));
		    }
		    terpri(stream);
		    force_output(stream);
		} finally {
		    $read_default_float_format$.rebind(_prev_bind_0, thread);
		}
	    }
	    return stream;
	}
    }

    public static SubLObject benchmark_parallel_cyclops_print_statistics(final SubLObject stream, final SubLObject parallel, final SubLObject bogomips, final SubLObject k, final SubLObject guts_time, final SubLObject efficiency, final SubLObject cyclops) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
	try {
	    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
	    format(stream, $str112$__Parallel_CycLOPs_Benchmark_Resu);
	    format(stream, $str81$_________________________________);
	    format(stream, $str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
	    format(stream, $str113$__Parallelism_________S, parallel);
	    if (NIL != bogomips) {
		format(stream, $str83$__Bogomips______S, bogomips);
	    }
	    format(stream, $str84$__Scaling_factor______S, k);
	    format(stream, $str85$__Elapsed_time__seconds_______S, number_utilities.significant_digits(guts_time, FOUR_INTEGER));
	    format(stream, $str86$__Efficiency__seconds_op_______S, number_utilities.significant_digits(efficiency, FOUR_INTEGER));
	    format(stream, $str87$__CycLOPs______S, number_utilities.significant_digits(cyclops, FOUR_INTEGER));
	    if (NIL != bogomips) {
		format(stream, $str88$__Bogomips_CycLOPs_______S, number_utilities.significant_digits(divide(bogomips, cyclops), FOUR_INTEGER));
	    }
	    terpri(stream);
	    force_output(stream);
	} finally {
	    $read_default_float_format$.rebind(_prev_bind_0, thread);
	}
	return stream;
    }

    public static final SubLObject benchmark_parallel_cyclops_print_statistical_summary_alt(SubLObject stream, SubLObject parallel, SubLObject values) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
		try {
		    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
		    format(stream, $str_alt107$__Parallel_CycLOPs_Benchmark_Stat);
		    format(stream, $str_alt79$_________________________________);
		    format(stream, $str_alt80$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
		    format(stream, $str_alt106$__Parallelism_________S, parallel);
		    format(stream, $str_alt88$__Raw_Data______S, Mapping.mapcar(FOUR_SIGNIFICANT_DIGITS, values));
		    format(stream, $str_alt90$__Sorted_Data______S, Mapping.mapcar(FOUR_SIGNIFICANT_DIGITS, Sort.sort(copy_list(values), symbol_function($sym91$_), UNPROVIDED)));
		    format(stream, $str_alt92$__N______S, length(values));
		    format(stream, $str_alt93$__Min______S, number_utilities.four_significant_digits(number_utilities.minimum(values, UNPROVIDED)));
		    format(stream, $str_alt94$__Max______S, number_utilities.four_significant_digits(number_utilities.maximum(values, UNPROVIDED)));
		    format(stream, $str_alt95$__Median______S, number_utilities.four_significant_digits(number_utilities.median(values, UNPROVIDED)));
		    format(stream, $str_alt96$__Mean______S, number_utilities.four_significant_digits(number_utilities.mean(values)));
		    format(stream, $str_alt97$__Standard_Deviation______S, number_utilities.four_significant_digits(number_utilities.standard_deviation(values)));
		    terpri(stream);
		    force_output(stream);
		} finally {
		    $read_default_float_format$.rebind(_prev_bind_0, thread);
		}
	    }
	    return stream;
	}
    }

    public static SubLObject benchmark_parallel_cyclops_print_statistical_summary(final SubLObject stream, final SubLObject parallel, final SubLObject values) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
	try {
	    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
	    format(stream, $str114$__Parallel_CycLOPs_Benchmark_Stat);
	    format(stream, $str81$_________________________________);
	    format(stream, $str82$__System__S__S_KB__S, new SubLObject[] { obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
	    format(stream, $str113$__Parallelism_________S, parallel);
	    format(stream, $str90$__Raw_Data______S, Mapping.mapcar(FOUR_SIGNIFICANT_DIGITS, values));
	    format(stream, $str92$__Sorted_Data______S, Mapping.mapcar(FOUR_SIGNIFICANT_DIGITS, Sort.sort(copy_list(values), symbol_function($sym93$_), UNPROVIDED)));
	    format(stream, $str94$__N______S, length(values));
	    format(stream, $str95$__Min______S, number_utilities.four_significant_digits(number_utilities.minimum(values, UNPROVIDED)));
	    format(stream, $str96$__Max______S, number_utilities.four_significant_digits(number_utilities.maximum(values, UNPROVIDED)));
	    format(stream, $str97$__Median______S, number_utilities.four_significant_digits(number_utilities.median(values, UNPROVIDED, UNPROVIDED)));
	    format(stream, $str98$__Mean______S, number_utilities.four_significant_digits(number_utilities.mean(values)));
	    format(stream, $str99$__Standard_Deviation______S, number_utilities.four_significant_digits(number_utilities.standard_deviation(values)));
	    terpri(stream);
	    force_output(stream);
	} finally {
	    $read_default_float_format$.rebind(_prev_bind_0, thread);
	}
	return stream;
    }

    static private final SubLString $str_alt6$Mt_1 = makeString("Mt-1");

    static private final SubLString $str_alt7$Mt_2 = makeString("Mt-2");

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("Microtheory"));

    static private final SubLList $list_alt11 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DIRECTION"), makeKeyword("FORWARD"));

    static private final SubLString $str_alt15$Col_ = makeString("Col-");

    static private final SubLList $list_alt16 = list(reader_make_constant_shell("Collection"));

    public static SubLObject massive_assert_benchmark(final SubLObject gaf_count, final SubLObject term_count, final SubLObject predicate_count, final SubLObject mt_count, SubLObject v_properties) {
	if (v_properties == UNPROVIDED) {
	    v_properties = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!multiply(term_count, term_count).numGE(gaf_count))) {
	    Errors.error($$$Not_enough_terms_provided);
	}
	SubLObject time = NIL;
	thread.resetMultipleValues();
	final SubLObject preds = massive_assert_benchmark_setup(predicate_count, term_count, mt_count);
	final SubLObject terms = thread.secondMultipleValue();
	final SubLObject mts = thread.thirdMultipleValue();
	thread.resetMultipleValues();
	try {
	    final SubLObject message = cconcatenate($$$Asserting_, new SubLObject[] { format_nil.format_nil_s_no_copy(gaf_count), $$$_GAFs });
	    final SubLObject time_var = get_internal_real_time();
	    final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	    try {
		$progress_note$.bind(message, thread);
		$progress_start_time$.bind(get_universal_time(), thread);
		$progress_total$.bind(gaf_count, thread);
		$progress_sofar$.bind(ZERO_INTEGER, thread);
		$last_percent_progress_index$.bind(ZERO_INTEGER, thread);
		$last_percent_progress_prediction$.bind(NIL, thread);
		$within_noting_percent_progress$.bind(T, thread);
		$percent_progress_start_time$.bind(get_universal_time(), thread);
		try {
		    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
		    SubLObject i;
		    SubLObject pred_index;
		    SubLObject term_a_index;
		    SubLObject term_b_index;
		    SubLObject mt_index;
		    SubLObject pred;
		    SubLObject term_a;
		    SubLObject term_b;
		    SubLObject mt;
		    for (i = NIL, i = ZERO_INTEGER; i.numL($progress_total$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
			pred_index = mod(i, predicate_count);
			term_a_index = integerDivide(i, term_count);
			term_b_index = mod(i, term_count);
			mt_index = mod(i, mt_count);
			pred = aref(preds, pred_index);
			term_a = aref(terms, term_a_index);
			term_b = aref(terms, term_b_index);
			mt = aref(mts, mt_index);
			massive_assert_benchmark_add(pred, term_a, term_b, mt, v_properties);
			$progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
			note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
		    }
		} finally {
		    final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values = getValuesAsVector();
			noting_percent_progress_postamble();
			restoreValuesFromVector(_values);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
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
	    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
	} finally {
	    final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values2 = getValuesAsVector();
		massive_assert_benchmark_teardown(preds, terms, mts);
		restoreValuesFromVector(_values2);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
	    }
	}
	return time;
    }

    static private final SubLList $list_alt19 = list(reader_make_constant_shell("IrreflexiveBinaryPredicate"));

    static private final SubLList $list_alt20 = list(reader_make_constant_shell("AsymmetricBinaryPredicate"));

    static private final SubLList $list_alt24 = list(reader_make_constant_shell("ReflexiveBinaryPredicate"));

    static private final SubLList $list_alt25 = list(reader_make_constant_shell("AntiSymmetricBinaryPredicate"));

    static private final SubLList $list_alt26 = list(reader_make_constant_shell("TransitiveBinaryPredicate"));

    static private final SubLList $list_alt28 = list(reader_make_constant_shell("SymmetricBinaryPredicate"));

    static private final SubLList $list_alt30 = list(reader_make_constant_shell("BinaryPredicate"));

    static private final SubLList $list_alt31 = list(reader_make_constant_shell("Integer"));

    static private final SubLList $list_alt39 = list(reader_make_constant_shell("different"), makeSymbol("?CHILD-1"), makeSymbol("?CHILD-2"));

    static private final SubLSymbol $sym40$_PARENT = makeSymbol("?PARENT");

    static private final SubLList $list_alt41 = list(makeSymbol("?CHILD-1"), makeSymbol("?PARENT"));

    static private final SubLList $list_alt42 = list(makeSymbol("?CHILD-2"), makeSymbol("?PARENT"));

    static private final SubLList $list_alt43 = list(makeSymbol("?CHILD-1"), makeSymbol("?CHILD-2"));

    static private final SubLSymbol $sym45$_CHILD_1 = makeSymbol("?CHILD-1");

    static private final SubLSymbol $sym46$_CHILD_2 = makeSymbol("?CHILD-2");

    static private final SubLList $list_alt52 = list(makeSymbol("*CYCLOPS-LOCK*"));

    static private final SubLList $list_alt55 = list(reader_make_constant_shell("Individual"));

    static private final SubLString $str_alt57$Term_ = makeString("Term-");

    static private final SubLString $str_alt58$_ = makeString("-");

    static private final SubLList $list_alt64 = list(makeSymbol("?PARENT"));

    static private final SubLString $str_alt65$CycLOPs_error_asking_parent__S = makeString("CycLOPs error asking parent ~S");

    static private final SubLList $list_alt67 = list(makeSymbol("?ANCEST"));

    static private final SubLString $str_alt68$CycLOPs_error__asking_ancestor__S = makeString("CycLOPs error: asking ancestor ~S");

    static private final SubLList $list_alt70 = list(makeSymbol("?SIBLING"));

    static private final SubLList $list_alt71 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER);

    static private final SubLString $str_alt72$CycLOPs_error__asking_sibling__S_ = makeString("CycLOPs error: asking sibling ~S via rule");

    static private final SubLString $str_alt74$CycLOPs_error__asking_sibling__S = makeString("CycLOPs error: asking sibling ~S");

    static private final SubLString $str_alt78$__CycLOPs_Benchmark_Results = makeString("~%CycLOPs Benchmark Results");

    static private final SubLString $str_alt79$_________________________________ = makeString("~%========================================");

    static private final SubLString $str_alt80$__System__S__S_KB__S = makeString("~%System ~S.~S KB ~S");

    static private final SubLString $str_alt81$__Bogomips______S = makeString("~%Bogomips :~% ~S");

    static private final SubLString $str_alt82$__Scaling_factor______S = makeString("~%Scaling factor :~% ~S");

    static private final SubLString $str_alt83$__Elapsed_time__seconds_______S = makeString("~%Elapsed time (seconds) :~% ~S");

    public static SubLObject massive_assert_benchmark_setup(final SubLObject predicate_count, final SubLObject term_count, final SubLObject mt_count) {
	final SubLObject preds = make_vector(predicate_count, UNPROVIDED);
	final SubLObject terms = make_vector(term_count, UNPROVIDED);
	final SubLObject mts = make_vector(mt_count, UNPROVIDED);
	SubLObject i;
	SubLObject name;
	SubLObject pred;
	for (i = NIL, i = ZERO_INTEGER; i.numL(predicate_count); i = add(i, ONE_INTEGER)) {
	    name = cconcatenate($str118$mAB_P_, format_nil.format_nil_a_no_copy(i));
	    pred = cyc_kernel.cyc_create_new_ephemeral(name);
	    cyc_kernel.cyc_assert_wff(listS($$isa, pred, $list31), $$UniversalVocabularyMt, UNPROVIDED);
	    set_aref(preds, i, pred);
	}
	SubLObject v_term;
	for (i = NIL, i = ZERO_INTEGER; i.numL(term_count); i = add(i, ONE_INTEGER)) {
	    name = cconcatenate($str120$MAB_T_, format_nil.format_nil_a_no_copy(i));
	    v_term = cyc_kernel.cyc_create_new_ephemeral(name);
	    cyc_kernel.cyc_assert_wff(listS($$isa, v_term, $list56), $$UniversalVocabularyMt, UNPROVIDED);
	    set_aref(terms, i, v_term);
	}
	SubLObject mt;
	for (i = NIL, i = ZERO_INTEGER; i.numL(mt_count); i = add(i, ONE_INTEGER)) {
	    name = cconcatenate($str121$MAB_M_, format_nil.format_nil_a_no_copy(i));
	    mt = cyc_kernel.cyc_create_new_ephemeral(name);
	    cyc_kernel.cyc_assert_wff(listS($$isa, mt, $list10), $$UniversalVocabularyMt, UNPROVIDED);
	    set_aref(mts, i, mt);
	}
	return values(preds, terms, mts);
    }

    static private final SubLString $str_alt84$__Efficiency__seconds_op_______S = makeString("~%Efficiency (seconds/op) :~% ~S");

    static private final SubLString $str_alt85$__CycLOPs______S = makeString("~%CycLOPs :~% ~S");

    static private final SubLString $str_alt86$__Bogomips_CycLOPs_______S = makeString("~%Bogomips/CycLOPs : ~% ~S");

    static private final SubLString $str_alt87$__CycLOPs_Benchmark_Statistical_S = makeString("~%CycLOPs Benchmark Statistical Summary");

    static private final SubLString $str_alt88$__Raw_Data______S = makeString("~%Raw Data :~% ~S");

    static private final SubLString $str_alt90$__Sorted_Data______S = makeString("~%Sorted Data :~% ~S");

    static private final SubLSymbol $sym91$_ = makeSymbol("<");

    static private final SubLString $str_alt92$__N______S = makeString("~%N :~% ~S");

    static private final SubLString $str_alt93$__Min______S = makeString("~%Min :~% ~S");

    static private final SubLString $str_alt94$__Max______S = makeString("~%Max :~% ~S");

    static private final SubLString $str_alt95$__Median______S = makeString("~%Median :~% ~S");

    static private final SubLString $str_alt96$__Mean______S = makeString("~%Mean :~% ~S");

    static private final SubLString $str_alt97$__Standard_Deviation______S = makeString("~%Standard Deviation :~% ~S");

    static private final SubLString $str_alt99$___S____S = makeString("~%~S = ~S");

    static private final SubLString $str_alt100$__eff____S = makeString("  eff = ~S");

    public static SubLObject massive_assert_benchmark_teardown(final SubLObject preds, final SubLObject terms, final SubLObject mts) {
	SubLObject backwardP_var = NIL;
	SubLObject length;
	SubLObject v_iteration;
	SubLObject element_num;
	SubLObject v_term;
	for (length = length(terms), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
	    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
	    v_term = aref(terms, element_num);
	    cyc_kernel.cyc_kill(v_term);
	}
	backwardP_var = NIL;
	SubLObject pred;
	for (length = length(preds), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
	    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
	    pred = aref(preds, element_num);
	    cyc_kernel.cyc_kill(pred);
	}
	backwardP_var = NIL;
	SubLObject mt;
	for (length = length(mts), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
	    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
	    mt = aref(mts, element_num);
	    cyc_kernel.cyc_kill(mt);
	}
	return NIL;
    }

    static private final SubLString $str_alt103$Parallel_CycLOPs_thread_ = makeString("Parallel CycLOPs thread ");

    static private final SubLString $str_alt105$__Parallel_CycLOPs_Benchmark_Resu = makeString("~%Parallel CycLOPs Benchmark Results");

    static private final SubLString $str_alt106$__Parallelism_________S = makeString("~%Parallelism    :~% ~S");

    static private final SubLString $str_alt107$__Parallel_CycLOPs_Benchmark_Stat = makeString("~%Parallel CycLOPs Benchmark Statistical Summary");

    static private final SubLList $list_alt109 = list(makeSymbol("BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING"));

    public static SubLObject massive_assert_benchmark_add(final SubLObject pred, final SubLObject term_a, final SubLObject term_b, final SubLObject mt, final SubLObject v_properties) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject assume_wffP_tail = property_list_member($kw122$ASSUME_WFF_, v_properties);
	final SubLObject assume_wffP = (NIL != assume_wffP_tail) ? cadr(assume_wffP_tail) : NIL;
	final SubLObject disable_forwardP_tail = property_list_member($kw123$DISABLE_FORWARD_, v_properties);
	final SubLObject disable_forwardP = (NIL != disable_forwardP_tail) ? cadr(disable_forwardP_tail) : NIL;
	final SubLObject sentence = list(pred, term_a, term_b);
	final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
	try {
	    kb_control_vars.$forward_inference_enabledP$.bind(makeBoolean(NIL == disable_forwardP), thread);
	    if (NIL != assume_wffP) {
		cyc_kernel.cyc_assert_wff(sentence, mt, UNPROVIDED);
	    } else {
		cyc_kernel.cyc_assert(sentence, mt, UNPROVIDED);
	    }
	} finally {
	    kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static final SubLObject benchmark_cyclops_sample_alt(SubLObject power, SubLObject trials) {
	if (trials == UNPROVIDED) {
	    trials = FIVE_INTEGER;
	}
	{
	    SubLObject times = NIL;
	    SubLObject i = NIL;
	    for (i = ZERO_INTEGER; i.numL(trials); i = add(i, ONE_INTEGER)) {
		times = cons(com.cyc.cycjava.cycl.system_benchmarks.benchmark_cyclops(power, UNPROVIDED), times);
	    }
	    times = Sort.sort(times, symbol_function($sym91$_), UNPROVIDED);
	    times = ldiff(times.rest(), last(times, UNPROVIDED));
	    return number_utilities.mean(times);
	}
    }

    public static SubLObject benchmark_cyclops_sample(final SubLObject power, SubLObject trials) {
	if (trials == UNPROVIDED) {
	    trials = FIVE_INTEGER;
	}
	SubLObject times = NIL;
	SubLObject i;
	for (i = NIL, i = ZERO_INTEGER; i.numL(trials); i = add(i, ONE_INTEGER)) {
	    times = cons(benchmark_cyclops(power, UNPROVIDED), times);
	}
	times = Sort.sort(times, symbol_function($sym93$_), UNPROVIDED);
	times = ldiff(times.rest(), last(times, UNPROVIDED));
	return number_utilities.mean(times);
    }

    public static SubLObject declare_system_benchmarks_file() {
	declareFunction("benchmark_cyclops_compensating_for_paging", "BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 4, false);
	declareFunction("benchmark_cyclops_n_times", "BENCHMARK-CYCLOPS-N-TIMES", 1, 3, false);
	declareFunction("benchmark_cyclops", "BENCHMARK-CYCLOPS", 0, 2, false);
	declareFunction("median_cyclops", "MEDIAN-CYCLOPS", 1, 3, false);
	declareFunction("max_cyclops", "MAX-CYCLOPS", 1, 3, false);
	declareFunction("benchmark_cyclops_setup_and_teardown", "BENCHMARK-CYCLOPS-SETUP-AND-TEARDOWN", 0, 0, false);
	declareFunction("benchmark_cyclops_setup", "BENCHMARK-CYCLOPS-SETUP", 0, 0, false);
	declareFunction("benchmark_cyclops_guts", "BENCHMARK-CYCLOPS-GUTS", 8, 0, false);
	declareFunction("benchmark_cyclops_guts_int", "BENCHMARK-CYCLOPS-GUTS-INT", 9, 0, false);
	declareFunction("benchmark_cyclops_teardown", "BENCHMARK-CYCLOPS-TEARDOWN", 7, 0, false);
	declareFunction("benchmark_cyclops_compute_and_print_statistics", "BENCHMARK-CYCLOPS-COMPUTE-AND-PRINT-STATISTICS", 3, 0, false);
	declareFunction("benchmark_cyclops_create_mts", "BENCHMARK-CYCLOPS-CREATE-MTS", 0, 0, false);
	declareFunction("benchmark_cyclops_create_ontology", "BENCHMARK-CYCLOPS-CREATE-ONTOLOGY", 0, 0, false);
	declareFunction("benchmark_cyclops_create_parent", "BENCHMARK-CYCLOPS-CREATE-PARENT", 1, 0, false);
	declareFunction("benchmark_cyclops_create_ancestor", "BENCHMARK-CYCLOPS-CREATE-ANCESTOR", 1, 0, false);
	declareFunction("benchmark_cyclops_create_sibling", "BENCHMARK-CYCLOPS-CREATE-SIBLING", 1, 0, false);
	declareFunction("benchmark_cyclops_create_family", "BENCHMARK-CYCLOPS-CREATE-FAMILY", 1, 0, false);
	declareFunction("benchmark_cyclops_define_predicates", "BENCHMARK-CYCLOPS-DEFINE-PREDICATES", 4, 0, false);
	declareFunction("benchmark_cyclops_assert_sibling_rule", "BENCHMARK-CYCLOPS-ASSERT-SIBLING-RULE", 5, 0, false);
	declareMacro("with_cyclops_lock", "WITH-CYCLOPS-LOCK");
	declareFunction("benchmark_cyclops_create_terms", "BENCHMARK-CYCLOPS-CREATE-TERMS", 4, 0, false);
	declareFunction("benchmark_cyclops_create_term", "BENCHMARK-CYCLOPS-CREATE-TERM", 2, 0, false);
	declareFunction("benchmark_cyclops_assert_family_links", "BENCHMARK-CYCLOPS-ASSERT-FAMILY-LINKS", 5, 0, false);
	declareFunction("benchmark_cyclops_assert_parent_links", "BENCHMARK-CYCLOPS-ASSERT-PARENT-LINKS", 4, 0, false);
	declareFunction("benchmark_cyclops_query", "BENCHMARK-CYCLOPS-QUERY", 4, 0, false);
	declareFunction("benchmark_cyclops_query_parent_links", "BENCHMARK-CYCLOPS-QUERY-PARENT-LINKS", 4, 0, false);
	declareFunction("benchmark_cyclops_query_ancestor_links", "BENCHMARK-CYCLOPS-QUERY-ANCESTOR-LINKS", 4, 0, false);
	declareFunction("benchmark_cyclops_query_sibling_links_via_rule", "BENCHMARK-CYCLOPS-QUERY-SIBLING-LINKS-VIA-RULE", 4, 0, false);
	declareFunction("benchmark_cyclops_forward_propagate_sibling_rule", "BENCHMARK-CYCLOPS-FORWARD-PROPAGATE-SIBLING-RULE", 4, 0, false);
	declareFunction("benchmark_cyclops_turn_sibling_rule_backward", "BENCHMARK-CYCLOPS-TURN-SIBLING-RULE-BACKWARD", 4, 0, false);
	declareFunction("benchmark_cyclops_query_sibling_links_via_lookup", "BENCHMARK-CYCLOPS-QUERY-SIBLING-LINKS-VIA-LOOKUP", 4, 0, false);
	declareFunction("benchmark_cyclops_kill_terms", "BENCHMARK-CYCLOPS-KILL-TERMS", 2, 0, false);
	declareFunction("benchmark_cyclops_kill_vocabulary", "BENCHMARK-CYCLOPS-KILL-VOCABULARY", 7, 0, false);
	declareFunction("benchmark_cyclops_print_statistics", "BENCHMARK-CYCLOPS-PRINT-STATISTICS", 6, 0, false);
	declareFunction("benchmark_cyclops_print_statistical_summary", "BENCHMARK-CYCLOPS-PRINT-STATISTICAL-SUMMARY", 2, 0, false);
	declareFunction("expensive_cyclops_rules", "EXPENSIVE-CYCLOPS-RULES", 0, 1, false);
	declareFunction("expensive_cyclops_rules_int", "EXPENSIVE-CYCLOPS-RULES-INT", 2, 0, false);
	declareFunction("benchmark_parallel_cyclops_compensating_for_paging", "BENCHMARK-PARALLEL-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 5, false);
	declareFunction("benchmark_parallel_cyclops_efficiency", "BENCHMARK-PARALLEL-CYCLOPS-EFFICIENCY", 1, 3, false);
	declareFunction("median_parallel_cyclops", "MEDIAN-PARALLEL-CYCLOPS", 2, 3, false);
	declareFunction("benchmark_parallel_cyclops_n_times", "BENCHMARK-PARALLEL-CYCLOPS-N-TIMES", 2, 3, false);
	declareFunction("benchmark_parallel_cyclops_guts", "BENCHMARK-PARALLEL-CYCLOPS-GUTS", 9, 0, false);
	declareFunction("benchmark_parallel_cyclops_guts_thread", "BENCHMARK-PARALLEL-CYCLOPS-GUTS-THREAD", 10, 0, false);
	declareFunction("benchmark_parallel_cyclops_compute_and_print_statistics", "BENCHMARK-PARALLEL-CYCLOPS-COMPUTE-AND-PRINT-STATISTICS", 4, 0, false);
	declareFunction("benchmark_parallel_cyclops_print_statistics", "BENCHMARK-PARALLEL-CYCLOPS-PRINT-STATISTICS", 7, 0, false);
	declareFunction("benchmark_parallel_cyclops_print_statistical_summary", "BENCHMARK-PARALLEL-CYCLOPS-PRINT-STATISTICAL-SUMMARY", 3, 0, false);
	declareFunction("massive_assert_benchmark", "MASSIVE-ASSERT-BENCHMARK", 4, 1, false);
	declareFunction("massive_assert_benchmark_setup", "MASSIVE-ASSERT-BENCHMARK-SETUP", 3, 0, false);
	declareFunction("massive_assert_benchmark_teardown", "MASSIVE-ASSERT-BENCHMARK-TEARDOWN", 3, 0, false);
	declareFunction("massive_assert_benchmark_add", "MASSIVE-ASSERT-BENCHMARK-ADD", 5, 0, false);
	declareFunction("benchmark_cyclops_sample", "BENCHMARK-CYCLOPS-SAMPLE", 1, 1, false);
	return NIL;
    }

    public static final SubLObject init_system_benchmarks_file_alt() {
	defvar("*CYCLOPS-FAMILY-FIX-ENABLED?*", NIL);
	defparameter("*CYCLOPS-ANECT-FIX-ENABLED?*", T);
	defvar("*BENCHMARK-CYCLOPS-POWER*", SIX_INTEGER);
	defvar("*BENCHMARK-CYCLOPS-ONTOLOGY-ROOT*", $$Individual);
	deflexical("*CYCLOPS-THROWAWAY-DEFAULT*", $int$33);
	defparameter("*CYCLOPS-LOCKED?*", NIL);
	deflexical("*CYCLOPS-LOCK*", NIL != boundp($cyclops_lock$) ? ((SubLObject) ($cyclops_lock$.getGlobalValue())) : make_lock($$$CycLOPs_lock));
	return NIL;
    }

    public static SubLObject init_system_benchmarks_file() {
	if (SubLFiles.USE_V1) {
	    defvar("*CYCLOPS-FAMILY-FIX-ENABLED?*", NIL);
	    defparameter("*CYCLOPS-ANECT-FIX-ENABLED?*", T);
	    defvar("*BENCHMARK-CYCLOPS-POWER*", SIX_INTEGER);
	    defvar("*BENCHMARK-CYCLOPS-ONTOLOGY-ROOT*", $$Individual);
	    deflexical("*CYCLOPS-THROWAWAY-DEFAULT*", $int$33);
	    defparameter("*CYCLOPS-LOCKED?*", NIL);
	    deflexical("*CYCLOPS-LOCK*", SubLTrampolineFile.maybeDefault($cyclops_lock$, $cyclops_lock$, () -> make_lock($$$CycLOPs_lock)));
	    defparameter("*CYCLOPS-RULE-EXPENSIVENESS-THRESHOLD*", TWO_INTEGER);
	}
	if (SubLFiles.USE_V2) {
	    deflexical("*CYCLOPS-LOCK*", NIL != boundp($cyclops_lock$) ? ((SubLObject) ($cyclops_lock$.getGlobalValue())) : make_lock($$$CycLOPs_lock));
	}
	return NIL;
    }

    public static SubLObject init_system_benchmarks_file_Previous() {
	defvar("*CYCLOPS-FAMILY-FIX-ENABLED?*", NIL);
	defparameter("*CYCLOPS-ANECT-FIX-ENABLED?*", T);
	defvar("*BENCHMARK-CYCLOPS-POWER*", SIX_INTEGER);
	defvar("*BENCHMARK-CYCLOPS-ONTOLOGY-ROOT*", $$Individual);
	deflexical("*CYCLOPS-THROWAWAY-DEFAULT*", $int$33);
	defparameter("*CYCLOPS-LOCKED?*", NIL);
	deflexical("*CYCLOPS-LOCK*", SubLTrampolineFile.maybeDefault($cyclops_lock$, $cyclops_lock$, () -> make_lock($$$CycLOPs_lock)));
	defparameter("*CYCLOPS-RULE-EXPENSIVENESS-THRESHOLD*", TWO_INTEGER);
	return NIL;
    }

    public static final SubLObject setup_system_benchmarks_file_alt() {
	register_external_symbol(BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING);
	declare_defglobal($cyclops_lock$);
	register_external_symbol(BENCHMARK_PARALLEL_CYCLOPS_COMPENSATING_FOR_PAGING);
	define_obsolete_register(BENCHMARK_CYCLOPS_SAMPLE, $list_alt109);
	return NIL;
    }

    public static SubLObject setup_system_benchmarks_file() {
	if (SubLFiles.USE_V1) {
	    register_external_symbol(BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING);
	    register_external_symbol($cyclops_lockedP$);
	    declare_defglobal($cyclops_lock$);
	    register_external_symbol(BENCHMARK_PARALLEL_CYCLOPS_COMPENSATING_FOR_PAGING);
	    define_obsolete_register(BENCHMARK_CYCLOPS_SAMPLE, $list125);
	}
	if (SubLFiles.USE_V2) {
	    define_obsolete_register(BENCHMARK_CYCLOPS_SAMPLE, $list_alt109);
	}
	return NIL;
    }

    public static SubLObject setup_system_benchmarks_file_Previous() {
	register_external_symbol(BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING);
	register_external_symbol($cyclops_lockedP$);
	declare_defglobal($cyclops_lock$);
	register_external_symbol(BENCHMARK_PARALLEL_CYCLOPS_COMPENSATING_FOR_PAGING);
	define_obsolete_register(BENCHMARK_CYCLOPS_SAMPLE, $list125);
	return NIL;
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
    }
}

/**
 * Total time: 637 ms
 */
