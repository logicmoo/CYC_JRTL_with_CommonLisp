package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$browse_forward_inferencesP$;
import static com.cyc.cycjava.cycl.control_vars.$prefer_forward_skolemization$;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$current_forward_problem_store$;
import static com.cyc.cycjava.cycl.utilities_macros.$fi_state_variables$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.extract_dynamic_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.integerDivide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.invert;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$suspend_type_checkingP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.last;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.ldiff;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.ArrayList;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class system_benchmarks extends SubLTranslatedFile {
    public static final SubLFile me = new system_benchmarks();

    public static final String myName = "com.cyc.cycjava.cycl.system_benchmarks";

    public static final String myFingerPrint = "cfa3c1b702cd92e784c22445da651aea17600497095eed9fdf972cd525951bce";

    // defvar
    private static final SubLSymbol $cyclops_family_fix_enabledP$ = makeSymbol("*CYCLOPS-FAMILY-FIX-ENABLED?*");

    // defparameter
    private static final SubLSymbol $cyclops_anect_fix_enabledP$ = makeSymbol("*CYCLOPS-ANECT-FIX-ENABLED?*");

    // defvar
    private static final SubLSymbol $benchmark_cyclops_power$ = makeSymbol("*BENCHMARK-CYCLOPS-POWER*");

    // defvar
    private static final SubLSymbol $benchmark_cyclops_ontology_root$ = makeSymbol("*BENCHMARK-CYCLOPS-ONTOLOGY-ROOT*");

    // deflexical
    private static final SubLSymbol $cyclops_throwaway_default$ = makeSymbol("*CYCLOPS-THROWAWAY-DEFAULT*");

    // defparameter
    public static final SubLSymbol $cyclops_lockedP$ = makeSymbol("*CYCLOPS-LOCKED?*");



    // defparameter
    private static final SubLSymbol $cyclops_rule_expensiveness_threshold$ = makeSymbol("*CYCLOPS-RULE-EXPENSIVENESS-THRESHOLD*");

    private static final SubLObject $$Individual = reader_make_constant_shell(makeString("Individual"));

    private static final SubLInteger $int$33 = makeInteger(33);

    public static final SubLSymbol BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING = makeSymbol("BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING");









    private static final SubLString $str7$Mt_1 = makeString("Mt-1");

    private static final SubLString $str8$Mt_2 = makeString("Mt-2");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list10 = list(reader_make_constant_shell(makeString("Microtheory")));

    private static final SubLObject $$BaseKB = reader_make_constant_shell(makeString("BaseKB"));

    private static final SubLList $list12 = list(makeKeyword("STRENGTH"), makeKeyword("MONOTONIC"), makeKeyword("DIRECTION"), makeKeyword("FORWARD"));

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    private static final SubLString $$$Creating_collection_ontology = makeString("Creating collection ontology");

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLString $str16$Col_ = makeString("Col-");

    private static final SubLList $list17 = list(reader_make_constant_shell(makeString("Collection")));

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLString $$$parent = makeString("parent");

    public static final SubLList $list20 = list(reader_make_constant_shell(makeString("IrreflexiveBinaryPredicate")));

    private static final SubLList $list21 = list(reader_make_constant_shell(makeString("AsymmetricBinaryPredicate")));

    private static final SubLObject $$arg1Isa = reader_make_constant_shell(makeString("arg1Isa"));

    private static final SubLObject $$arg2Isa = reader_make_constant_shell(makeString("arg2Isa"));

    private static final SubLString $$$ancestor = makeString("ancestor");

    public static final SubLList $list25 = list(reader_make_constant_shell(makeString("ReflexiveBinaryPredicate")));

    public static final SubLList $list26 = list(reader_make_constant_shell(makeString("AntiSymmetricBinaryPredicate")));

    private static final SubLList $list27 = list(reader_make_constant_shell(makeString("TransitiveBinaryPredicate")));

    private static final SubLString $$$sibling = makeString("sibling");

    private static final SubLList $list29 = list(reader_make_constant_shell(makeString("SymmetricBinaryPredicate")));

    private static final SubLString $$$family = makeString("family");

    public static final SubLList $list31 = list(reader_make_constant_shell(makeString("BinaryPredicate")));

    private static final SubLList $list32 = list(reader_make_constant_shell(makeString("Integer")));

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));









    private static final SubLObject $$implies = reader_make_constant_shell(makeString("implies"));

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list40 = list(reader_make_constant_shell(makeString("different")), makeSymbol("?CHILD-1"), makeSymbol("?CHILD-2"));

    private static final SubLSymbol $sym41$_PARENT = makeSymbol("?PARENT");

    public static final SubLList $list42 = list(makeSymbol("?CHILD-1"), makeSymbol("?PARENT"));

    public static final SubLList $list43 = list(makeSymbol("?CHILD-2"), makeSymbol("?PARENT"));

    private static final SubLList $list44 = list(makeSymbol("?CHILD-1"), makeSymbol("?CHILD-2"));

    private static final SubLObject $$different = reader_make_constant_shell(makeString("different"));

    private static final SubLSymbol $sym46$_CHILD_1 = makeSymbol("?CHILD-1");

    private static final SubLSymbol $sym47$_CHILD_2 = makeSymbol("?CHILD-2");

    private static final SubLSymbol $sym48$_CYCLOPS_LOCKED__ = makeSymbol("*CYCLOPS-LOCKED?*");

    private static final SubLSymbol $cyclops_lock$ = makeSymbol("*CYCLOPS-LOCK*");

    private static final SubLString $$$CycLOPs_lock = makeString("CycLOPs lock");





    private static final SubLList $list53 = list(makeSymbol("*CYCLOPS-LOCK*"));



    private static final SubLString $$$Creating_terms = makeString("Creating terms");

    private static final SubLList $list56 = list(reader_make_constant_shell(makeString("Individual")));



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

    public static final SubLList $list71 = list(makeSymbol("?SIBLING"));

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

    private static final SubLObject $$UniversalVocabularyMt = reader_make_constant_shell(makeString("UniversalVocabularyMt"));

    private static final SubLString $str120$MAB_T_ = makeString("MAB-T-");

    private static final SubLString $str121$MAB_M_ = makeString("MAB-M-");

    private static final SubLSymbol $kw122$ASSUME_WFF_ = makeKeyword("ASSUME-WFF?");

    private static final SubLSymbol $kw123$DISABLE_FORWARD_ = makeKeyword("DISABLE-FORWARD?");

    private static final SubLSymbol BENCHMARK_CYCLOPS_SAMPLE = makeSymbol("BENCHMARK-CYCLOPS-SAMPLE");

    private static final SubLList $list125 = list(makeSymbol("BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING"));

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
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
        assert NIL != subl_promotions.non_negative_integer_p(power) : "subl_promotions.non_negative_integer_p(power) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(power) " + power;
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

    public static SubLObject benchmark_cyclops(SubLObject power, SubLObject stream) {
        if (power == UNPROVIDED) {
            power = $benchmark_cyclops_power$.getDynamicValue();
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != subl_promotions.non_negative_integer_p(power) : "subl_promotions.non_negative_integer_p(power) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(power) " + power;
        final SubLObject cyclops = benchmark_cyclops_n_times(ONE_INTEGER, power, stream, ZERO_INTEGER).first();
        final SubLObject bogomips = misc_utilities.machine_bogomips();
        if (NIL != bogomips) {
            return values(cyclops, divide(bogomips, cyclops));
        }
        return cyclops;
    }

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

    public static SubLObject benchmark_cyclops_guts(final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
        Storage.gc_ephemeral();
        SubLObject time = NIL;
        final SubLObject time_var = get_internal_real_time();
        benchmark_cyclops_guts_int(ZERO_INTEGER, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family);
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return time;
    }

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
                    assert NIL != queues.queue_p(environment) : "queues.queue_p(environment) " + "CommonSymbols.NIL != queues.queue_p(environment) " + environment;
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

    public static SubLObject benchmark_cyclops_compute_and_print_statistics(final SubLObject stream, final SubLObject power, final SubLObject guts_time) {
        final SubLObject k = subtract(expt(TWO_INTEGER, power), ONE_INTEGER);
        final SubLObject efficiency = divide(guts_time, k);
        final SubLObject cyclops = invert(efficiency);
        final SubLObject bogomips = misc_utilities.machine_bogomips();
        benchmark_cyclops_print_statistics(stream, bogomips, k, guts_time, efficiency, cyclops);
        return cyclops;
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

    public static SubLObject benchmark_cyclops_create_parent(final SubLObject top_collection) {
        final SubLObject parent = cyc_kernel.cyc_create_new_ephemeral($$$parent);
        cyc_kernel.cyc_assert_wff(listS($$isa, parent, $list20), $$BaseKB, $list12);
        cyc_kernel.cyc_assert_wff(listS($$isa, parent, $list21), $$BaseKB, $list12);
        cyc_kernel.cyc_assert_wff(list($$arg1Isa, parent, top_collection), $$BaseKB, $list12);
        cyc_kernel.cyc_assert_wff(list($$arg2Isa, parent, top_collection), $$BaseKB, $list12);
        return parent;
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

    public static SubLObject benchmark_cyclops_create_sibling(final SubLObject top_collection) {
        final SubLObject sibling = cyc_kernel.cyc_create_new_ephemeral($$$sibling);
        cyc_kernel.cyc_assert_wff(listS($$isa, sibling, $list20), $$BaseKB, $list12);
        cyc_kernel.cyc_assert_wff(listS($$isa, sibling, $list29), $$BaseKB, $list12);
        cyc_kernel.cyc_assert_wff(list($$arg1Isa, sibling, top_collection), $$BaseKB, $list12);
        cyc_kernel.cyc_assert_wff(list($$arg2Isa, sibling, top_collection), $$BaseKB, $list12);
        return sibling;
    }

    public static SubLObject benchmark_cyclops_create_family(final SubLObject top_collection) {
        final SubLObject family = cyc_kernel.cyc_create_new_ephemeral($$$family);
        cyc_kernel.cyc_assert_wff(listS($$isa, family, $list31), $$BaseKB, $list12);
        cyc_kernel.cyc_assert_wff(list($$arg1Isa, family, top_collection), $$BaseKB, $list12);
        cyc_kernel.cyc_assert_wff(listS($$arg2Isa, family, $list32), $$BaseKB, $list12);
        return family;
    }

    public static SubLObject benchmark_cyclops_define_predicates(final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
        cyc_kernel.cyc_assert_wff(list($$genlPreds, parent, ancestor), $$BaseKB, $list12);
        benchmark_cyclops_assert_sibling_rule(MINUS_ONE_INTEGER, parent, sibling, family, $BACKWARD);
        return NIL;
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

    public static SubLObject with_cyclops_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(PIF, $sym48$_CYCLOPS_LOCKED__, listS(WITH_LOCK_HELD, $list53, append(body, NIL)), bq_cons(PROGN, append(body, NIL)));
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

    public static SubLObject benchmark_cyclops_create_term(final SubLObject uniquifier, final SubLObject index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_term = NIL;
        if (NIL != $cyclops_lockedP$.getDynamicValue(thread)) {
            SubLObject release = NIL;
            try {
                release = seize_lock($cyclops_lock$.getGlobalValue());
                v_term = cyc_kernel.cyc_create_new_ephemeral(cconcatenate($str58$Term_, new SubLObject[]{ format_nil.format_nil_a_no_copy(uniquifier), $str59$_, format_nil.format_nil_a_no_copy(index) }));
            } finally {
                if (NIL != release) {
                    release_lock($cyclops_lock$.getGlobalValue());
                }
            }
        } else {
            v_term = cyc_kernel.cyc_create_new_ephemeral(cconcatenate($str58$Term_, new SubLObject[]{ format_nil.format_nil_a_no_copy(uniquifier), $str59$_, format_nil.format_nil_a_no_copy(index) }));
        }
        return v_term;
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

    public static SubLObject benchmark_cyclops_print_statistics(final SubLObject stream, final SubLObject bogomips, final SubLObject k, final SubLObject guts_time, final SubLObject efficiency, final SubLObject cyclops) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
        try {
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            format(stream, $str80$__CycLOPs_Benchmark_Results);
            format(stream, $str81$_________________________________);
            format(stream, $str82$__System__S__S_KB__S, new SubLObject[]{ obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
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

    public static SubLObject benchmark_cyclops_print_statistical_summary(final SubLObject stream, final SubLObject values) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
        try {
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            format(stream, $str89$__CycLOPs_Benchmark_Statistical_S);
            format(stream, $str81$_________________________________);
            format(stream, $str82$__System__S__S_KB__S, new SubLObject[]{ obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
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
        assert NIL != subl_promotions.positive_integer_p(parallel) : "subl_promotions.positive_integer_p(parallel) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(parallel) " + parallel;
        assert NIL != subl_promotions.non_negative_integer_p(n) : "subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) " + n;
        assert NIL != subl_promotions.non_negative_integer_p(power) : "subl_promotions.non_negative_integer_p(power) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(power) " + power;
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

    public static SubLObject benchmark_parallel_cyclops_guts(final SubLObject parallel, final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
        Storage.gc_ephemeral();
        SubLObject time = NIL;
        final SubLObject time_var = get_internal_real_time();
        final SubLObject semaphore = Semaphores.new_semaphore($$$Parallel_CycLOPs, ZERO_INTEGER);
        SubLObject i;
        SubLObject thread_name;
        for (i = NIL, i = ZERO_INTEGER; i.numL(parallel); i = add(i, ONE_INTEGER)) {
            thread_name = cconcatenate($$$Parallel_CycLOPs_thread_, format_nil.format_nil_a_no_copy(i));
            subl_promotions.make_process_with_args(thread_name, BENCHMARK_PARALLEL_CYCLOPS_GUTS_THREAD, list(new SubLObject[]{ i, semaphore, power, mt_1, mt_2, bottom_collection, parent, ancestor, sibling, family }));
        }
        for (i = NIL, i = ZERO_INTEGER; i.numL(parallel); i = add(i, ONE_INTEGER)) {
            Semaphores.semaphore_wait(semaphore);
        }
        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        return time;
    }

    public static SubLObject benchmark_parallel_cyclops_guts_thread(final SubLObject thread_number, final SubLObject semaphore, final SubLObject power, final SubLObject mt_1, final SubLObject mt_2, final SubLObject bottom_collection, final SubLObject parent, final SubLObject ancestor, final SubLObject sibling, final SubLObject family) {
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

    public static SubLObject benchmark_parallel_cyclops_compute_and_print_statistics(final SubLObject stream, final SubLObject parallel, final SubLObject power, final SubLObject guts_time) {
        final SubLObject k = subtract(expt(TWO_INTEGER, power), ONE_INTEGER);
        final SubLObject efficiency = divide(guts_time, k);
        final SubLObject cyclops = invert(efficiency);
        final SubLObject bogomips = misc_utilities.machine_bogomips();
        benchmark_parallel_cyclops_print_statistics(stream, parallel, bogomips, k, guts_time, efficiency, cyclops);
        return cyclops;
    }

    public static SubLObject benchmark_parallel_cyclops_print_statistics(final SubLObject stream, final SubLObject parallel, final SubLObject bogomips, final SubLObject k, final SubLObject guts_time, final SubLObject efficiency, final SubLObject cyclops) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
        try {
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            format(stream, $str112$__Parallel_CycLOPs_Benchmark_Resu);
            format(stream, $str81$_________________________________);
            format(stream, $str82$__System__S__S_KB__S, new SubLObject[]{ obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
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

    public static SubLObject benchmark_parallel_cyclops_print_statistical_summary(final SubLObject stream, final SubLObject parallel, final SubLObject values) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
        try {
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            format(stream, $str114$__Parallel_CycLOPs_Benchmark_Stat);
            format(stream, $str81$_________________________________);
            format(stream, $str82$__System__S__S_KB__S, new SubLObject[]{ obsolete.cycl_system_number(), obsolete.cycl_patch_number(), kb_loaded() });
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
            final SubLObject message = cconcatenate($$$Asserting_, new SubLObject[]{ format_nil.format_nil_s_no_copy(gaf_count), $$$_GAFs });
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
        declareFunction(me, "benchmark_cyclops_compensating_for_paging", "BENCHMARK-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 4, false);
        declareFunction(me, "benchmark_cyclops_n_times", "BENCHMARK-CYCLOPS-N-TIMES", 1, 3, false);
        declareFunction(me, "benchmark_cyclops", "BENCHMARK-CYCLOPS", 0, 2, false);
        declareFunction(me, "median_cyclops", "MEDIAN-CYCLOPS", 1, 3, false);
        declareFunction(me, "max_cyclops", "MAX-CYCLOPS", 1, 3, false);
        declareFunction(me, "benchmark_cyclops_setup_and_teardown", "BENCHMARK-CYCLOPS-SETUP-AND-TEARDOWN", 0, 0, false);
        declareFunction(me, "benchmark_cyclops_setup", "BENCHMARK-CYCLOPS-SETUP", 0, 0, false);
        declareFunction(me, "benchmark_cyclops_guts", "BENCHMARK-CYCLOPS-GUTS", 8, 0, false);
        declareFunction(me, "benchmark_cyclops_guts_int", "BENCHMARK-CYCLOPS-GUTS-INT", 9, 0, false);
        declareFunction(me, "benchmark_cyclops_teardown", "BENCHMARK-CYCLOPS-TEARDOWN", 7, 0, false);
        declareFunction(me, "benchmark_cyclops_compute_and_print_statistics", "BENCHMARK-CYCLOPS-COMPUTE-AND-PRINT-STATISTICS", 3, 0, false);
        declareFunction(me, "benchmark_cyclops_create_mts", "BENCHMARK-CYCLOPS-CREATE-MTS", 0, 0, false);
        declareFunction(me, "benchmark_cyclops_create_ontology", "BENCHMARK-CYCLOPS-CREATE-ONTOLOGY", 0, 0, false);
        declareFunction(me, "benchmark_cyclops_create_parent", "BENCHMARK-CYCLOPS-CREATE-PARENT", 1, 0, false);
        declareFunction(me, "benchmark_cyclops_create_ancestor", "BENCHMARK-CYCLOPS-CREATE-ANCESTOR", 1, 0, false);
        declareFunction(me, "benchmark_cyclops_create_sibling", "BENCHMARK-CYCLOPS-CREATE-SIBLING", 1, 0, false);
        declareFunction(me, "benchmark_cyclops_create_family", "BENCHMARK-CYCLOPS-CREATE-FAMILY", 1, 0, false);
        declareFunction(me, "benchmark_cyclops_define_predicates", "BENCHMARK-CYCLOPS-DEFINE-PREDICATES", 4, 0, false);
        declareFunction(me, "benchmark_cyclops_assert_sibling_rule", "BENCHMARK-CYCLOPS-ASSERT-SIBLING-RULE", 5, 0, false);
        declareMacro(me, "with_cyclops_lock", "WITH-CYCLOPS-LOCK");
        declareFunction(me, "benchmark_cyclops_create_terms", "BENCHMARK-CYCLOPS-CREATE-TERMS", 4, 0, false);
        declareFunction(me, "benchmark_cyclops_create_term", "BENCHMARK-CYCLOPS-CREATE-TERM", 2, 0, false);
        declareFunction(me, "benchmark_cyclops_assert_family_links", "BENCHMARK-CYCLOPS-ASSERT-FAMILY-LINKS", 5, 0, false);
        declareFunction(me, "benchmark_cyclops_assert_parent_links", "BENCHMARK-CYCLOPS-ASSERT-PARENT-LINKS", 4, 0, false);
        declareFunction(me, "benchmark_cyclops_query", "BENCHMARK-CYCLOPS-QUERY", 4, 0, false);
        declareFunction(me, "benchmark_cyclops_query_parent_links", "BENCHMARK-CYCLOPS-QUERY-PARENT-LINKS", 4, 0, false);
        declareFunction(me, "benchmark_cyclops_query_ancestor_links", "BENCHMARK-CYCLOPS-QUERY-ANCESTOR-LINKS", 4, 0, false);
        declareFunction(me, "benchmark_cyclops_query_sibling_links_via_rule", "BENCHMARK-CYCLOPS-QUERY-SIBLING-LINKS-VIA-RULE", 4, 0, false);
        declareFunction(me, "benchmark_cyclops_forward_propagate_sibling_rule", "BENCHMARK-CYCLOPS-FORWARD-PROPAGATE-SIBLING-RULE", 4, 0, false);
        declareFunction(me, "benchmark_cyclops_turn_sibling_rule_backward", "BENCHMARK-CYCLOPS-TURN-SIBLING-RULE-BACKWARD", 4, 0, false);
        declareFunction(me, "benchmark_cyclops_query_sibling_links_via_lookup", "BENCHMARK-CYCLOPS-QUERY-SIBLING-LINKS-VIA-LOOKUP", 4, 0, false);
        declareFunction(me, "benchmark_cyclops_kill_terms", "BENCHMARK-CYCLOPS-KILL-TERMS", 2, 0, false);
        declareFunction(me, "benchmark_cyclops_kill_vocabulary", "BENCHMARK-CYCLOPS-KILL-VOCABULARY", 7, 0, false);
        declareFunction(me, "benchmark_cyclops_print_statistics", "BENCHMARK-CYCLOPS-PRINT-STATISTICS", 6, 0, false);
        declareFunction(me, "benchmark_cyclops_print_statistical_summary", "BENCHMARK-CYCLOPS-PRINT-STATISTICAL-SUMMARY", 2, 0, false);
        declareFunction(me, "expensive_cyclops_rules", "EXPENSIVE-CYCLOPS-RULES", 0, 1, false);
        declareFunction(me, "expensive_cyclops_rules_int", "EXPENSIVE-CYCLOPS-RULES-INT", 2, 0, false);
        declareFunction(me, "benchmark_parallel_cyclops_compensating_for_paging", "BENCHMARK-PARALLEL-CYCLOPS-COMPENSATING-FOR-PAGING", 0, 5, false);
        declareFunction(me, "benchmark_parallel_cyclops_efficiency", "BENCHMARK-PARALLEL-CYCLOPS-EFFICIENCY", 1, 3, false);
        declareFunction(me, "median_parallel_cyclops", "MEDIAN-PARALLEL-CYCLOPS", 2, 3, false);
        declareFunction(me, "benchmark_parallel_cyclops_n_times", "BENCHMARK-PARALLEL-CYCLOPS-N-TIMES", 2, 3, false);
        declareFunction(me, "benchmark_parallel_cyclops_guts", "BENCHMARK-PARALLEL-CYCLOPS-GUTS", 9, 0, false);
        declareFunction(me, "benchmark_parallel_cyclops_guts_thread", "BENCHMARK-PARALLEL-CYCLOPS-GUTS-THREAD", 10, 0, false);
        declareFunction(me, "benchmark_parallel_cyclops_compute_and_print_statistics", "BENCHMARK-PARALLEL-CYCLOPS-COMPUTE-AND-PRINT-STATISTICS", 4, 0, false);
        declareFunction(me, "benchmark_parallel_cyclops_print_statistics", "BENCHMARK-PARALLEL-CYCLOPS-PRINT-STATISTICS", 7, 0, false);
        declareFunction(me, "benchmark_parallel_cyclops_print_statistical_summary", "BENCHMARK-PARALLEL-CYCLOPS-PRINT-STATISTICAL-SUMMARY", 3, 0, false);
        declareFunction(me, "massive_assert_benchmark", "MASSIVE-ASSERT-BENCHMARK", 4, 1, false);
        declareFunction(me, "massive_assert_benchmark_setup", "MASSIVE-ASSERT-BENCHMARK-SETUP", 3, 0, false);
        declareFunction(me, "massive_assert_benchmark_teardown", "MASSIVE-ASSERT-BENCHMARK-TEARDOWN", 3, 0, false);
        declareFunction(me, "massive_assert_benchmark_add", "MASSIVE-ASSERT-BENCHMARK-ADD", 5, 0, false);
        declareFunction(me, "benchmark_cyclops_sample", "BENCHMARK-CYCLOPS-SAMPLE", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_system_benchmarks_file() {
        defvar("*CYCLOPS-FAMILY-FIX-ENABLED?*", NIL);
        defparameter("*CYCLOPS-ANECT-FIX-ENABLED?*", T);
        defvar("*BENCHMARK-CYCLOPS-POWER*", SIX_INTEGER);
        defvar("*BENCHMARK-CYCLOPS-ONTOLOGY-ROOT*", $$Individual);
        deflexical("*CYCLOPS-THROWAWAY-DEFAULT*", $int$33);
        defparameter("*CYCLOPS-LOCKED?*", NIL);
        deflexical("*CYCLOPS-LOCK*", SubLSystemTrampolineFile.maybeDefault($cyclops_lock$, $cyclops_lock$, () -> make_lock($$$CycLOPs_lock)));
        defparameter("*CYCLOPS-RULE-EXPENSIVENESS-THRESHOLD*", TWO_INTEGER);
        return NIL;
    }

    public static SubLObject setup_system_benchmarks_file() {
        register_external_symbol(BENCHMARK_CYCLOPS_COMPENSATING_FOR_PAGING);
        register_external_symbol($sym48$_CYCLOPS_LOCKED__);
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

    
}

/**
 * Total time: 637 ms
 */
