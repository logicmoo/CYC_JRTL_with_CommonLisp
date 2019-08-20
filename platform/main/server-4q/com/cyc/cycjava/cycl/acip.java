/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_stream_extensions_enabled$;
import static com.cyc.cycjava.cycl.cfasl.$cfasl_unread_byte$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_opcode_peek;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.run_test_case_tables;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_non_empty_list_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityE;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_list;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.cos;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.expt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.sin;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.sqrt;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.truncate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      ACIP
 * source file: /cyc/top/cycl/acip.lisp
 * created:     2019/07/03 17:39:05
 */
public final class acip extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt160$ = makeString("");

    public static final SubLFile me = new acip();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $quad_3d_tolerance_accel$ = makeSymbol("*QUAD-3D-TOLERANCE-ACCEL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $quad_3d_tolerance_veloc$ = makeSymbol("*QUAD-3D-TOLERANCE-VELOC*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $quad_3d_tolerance_locat$ = makeSymbol("*QUAD-3D-TOLERANCE-LOCAT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $acip_partition$ = makeSymbol("*ACIP-PARTITION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $acip_background_partition$ = makeSymbol("*ACIP-BACKGROUND-PARTITION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $acip_subkernels$ = makeSymbol("*ACIP-SUBKERNELS*");

    // defparameter
    /**
     * The number of times each list-hashing subkernel step is iterated so as to
     * reduce the impact of variations in subkernel harness time.
     */
    @LispMethod(comment = "The number of times each list-hashing subkernel step is iterated so as to\r\nreduce the impact of variations in subkernel harness time.\ndefparameter\nThe number of times each list-hashing subkernel step is iterated so as to\nreduce the impact of variations in subkernel harness time.")
    public static final SubLSymbol $acip_subkernel_list_hashing_iteration_count$ = makeSymbol("*ACIP-SUBKERNEL-LIST-HASHING-ITERATION-COUNT*");

    // defparameter
    /**
     * The number of times each unification subkernel step is iterated so as to
     * reduce the impact of variations in subkernel harness time.
     */
    @LispMethod(comment = "The number of times each unification subkernel step is iterated so as to\r\nreduce the impact of variations in subkernel harness time.\ndefparameter\nThe number of times each unification subkernel step is iterated so as to\nreduce the impact of variations in subkernel harness time.")
    public static final SubLSymbol $acip_subkernel_unification_iteration_count$ = makeSymbol("*ACIP-SUBKERNEL-UNIFICATION-ITERATION-COUNT*");

    // defparameter
    /**
     * The number of times each pattern-match subkernel step is iterated so as to
     * reduce the impact of variations in subkernel harness time.
     */
    @LispMethod(comment = "The number of times each pattern-match subkernel step is iterated so as to\r\nreduce the impact of variations in subkernel harness time.\ndefparameter\nThe number of times each pattern-match subkernel step is iterated so as to\nreduce the impact of variations in subkernel harness time.")
    public static final SubLSymbol $acip_subkernel_pattern_match_iteration_count$ = makeSymbol("*ACIP-SUBKERNEL-PATTERN-MATCH-ITERATION-COUNT*");

    // defparameter
    /**
     * The number of times each tactic-generation subkernel step is iterated so as
     * to reduce the impact of variations in subkernel harness time.
     */
    @LispMethod(comment = "The number of times each tactic-generation subkernel step is iterated so as\r\nto reduce the impact of variations in subkernel harness time.\ndefparameter\nThe number of times each tactic-generation subkernel step is iterated so as\nto reduce the impact of variations in subkernel harness time.")
    public static final SubLSymbol $acip_subkernel_tactic_generation_iteration_count$ = makeSymbol("*ACIP-SUBKERNEL-TACTIC-GENERATION-ITERATION-COUNT*");

    private static final SubLSymbol CYC_LIST_OF_2_REAL_NUMBERS = makeSymbol("CYC-LIST-OF-2-REAL-NUMBERS");

    private static final SubLSymbol CYC_LIST_OF_3_REAL_NUMBERS = makeSymbol("CYC-LIST-OF-3-REAL-NUMBERS");



    private static final SubLSymbol CYC_POINT_4_TIME = makeSymbol("CYC-POINT-4-TIME");

    private static final SubLSymbol CYC_QUAD_COEFF = makeSymbol("CYC-QUAD-COEFF");

    static private final SubLList $list7 = list(list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("X1")), list($BIND, makeSymbol("Y1"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("X2")), list($BIND, makeSymbol("Y2"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("X3")), list($BIND, makeSymbol("Y3"))));

    private static final SubLSymbol Y3 = makeSymbol("Y3");

    private static final SubLSymbol X3 = makeSymbol("X3");

    private static final SubLSymbol Y2 = makeSymbol("Y2");

    private static final SubLSymbol X2 = makeSymbol("X2");

    private static final SubLSymbol Y1 = makeSymbol("Y1");

    private static final SubLSymbol X1 = makeSymbol("X1");

    private static final SubLList $list20 = list(list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(1000)), list(reader_make_constant_shell("TheList"), ONE_INTEGER, makeInteger(900)), list(reader_make_constant_shell("TheList"), TWO_INTEGER, makeInteger(800))), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(-100), makeInteger(1000))), list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), ONE_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), TWO_INTEGER, ZERO_INTEGER)), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER)), list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(1000)), list(reader_make_constant_shell("TheList"), ONE_INTEGER, makeInteger(1100)), list(reader_make_constant_shell("TheList"), TWO_INTEGER, makeInteger(1190))), list(reader_make_constant_shell("TheList"), makeInteger(-5), makeInteger(105), makeInteger(1000))), list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(10000)), list(reader_make_constant_shell("TheList"), ONE_INTEGER, makeInteger(9520)), list(reader_make_constant_shell("TheList"), TWO_INTEGER, makeInteger(9040))), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(-480), makeInteger(10000))), list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), ONE_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), TWO_INTEGER, ZERO_INTEGER)), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER)), list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), ONE_INTEGER, makeDouble(630.2)), list(reader_make_constant_shell("TheList"), TWO_INTEGER, makeDouble(1240.8))), list(reader_make_constant_shell("TheList"), makeDouble(-9.8), makeInteger(640), ZERO_INTEGER)));

    static private final SubLList $list21 = listS(reader_make_constant_shell("Path4Fn"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    private static final SubLSymbol CYC_ARBITRARY_PATH_4D_ORDERING = makeSymbol("CYC-ARBITRARY-PATH-4D-ORDERING");

    private static final SubLList $list23 = cons(makeSymbol("PATH1-POINT"), makeSymbol("PATH1-REST-POINTS"));

    static private final SubLList $list24 = cons(makeSymbol("PATH2-POINT"), makeSymbol("PATH2-REST-POINTS"));

    static private final SubLList $list25 = list(reader_make_constant_shell("Point4Fn"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    static private final SubLList $list27 = list(list(list(list(reader_make_constant_shell("Path4Fn"), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(1000)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(1000)), list(reader_make_constant_shell("SecondsDuration"), ZERO_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(900)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(1100)), list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER))), list(reader_make_constant_shell("Path4Fn"), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(1000)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(1000)), list(reader_make_constant_shell("SecondsDuration"), ZERO_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(900)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(1100)), list(reader_make_constant_shell("SecondsDuration"), TWO_INTEGER)))), T));

    static private final SubLList $list28 = list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP"))), list(reader_make_constant_shell("TheList"), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP"))), list(reader_make_constant_shell("TheList"), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP"))));

    private static final SubLSymbol CYC_EQUALS_QUAD_3D = makeSymbol("CYC-EQUALS-QUAD-3D");

    private static final SubLFloat $float$0_1 = makeDouble(0.1);

    static private final SubLList $list31 = list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C1-LONG-2")), list($BIND, makeSymbol("C1-LONG-1")), list($BIND, makeSymbol("C1-LONG-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C1-LAT-2")), list($BIND, makeSymbol("C1-LAT-1")), list($BIND, makeSymbol("C1-LAT-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C1-ALT-2")), list($BIND, makeSymbol("C1-ALT-1")), list($BIND, makeSymbol("C1-ALT-0"))));

    private static final SubLSymbol C1_ALT_0 = makeSymbol("C1-ALT-0");

    private static final SubLSymbol C1_ALT_1 = makeSymbol("C1-ALT-1");

    private static final SubLSymbol C1_ALT_2 = makeSymbol("C1-ALT-2");

    private static final SubLSymbol C1_LAT_0 = makeSymbol("C1-LAT-0");

    private static final SubLSymbol C1_LAT_1 = makeSymbol("C1-LAT-1");

    private static final SubLSymbol C1_LAT_2 = makeSymbol("C1-LAT-2");

    private static final SubLSymbol C1_LONG_0 = makeSymbol("C1-LONG-0");

    private static final SubLSymbol C1_LONG_1 = makeSymbol("C1-LONG-1");

    private static final SubLSymbol C1_LONG_2 = makeSymbol("C1-LONG-2");

    static private final SubLList $list41 = list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C2-LONG-2")), list($BIND, makeSymbol("C2-LONG-1")), list($BIND, makeSymbol("C2-LONG-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C2-LAT-2")), list($BIND, makeSymbol("C2-LAT-1")), list($BIND, makeSymbol("C2-LAT-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C2-ALT-2")), list($BIND, makeSymbol("C2-ALT-1")), list($BIND, makeSymbol("C2-ALT-0"))));

    private static final SubLSymbol C2_ALT_0 = makeSymbol("C2-ALT-0");

    private static final SubLSymbol C2_ALT_1 = makeSymbol("C2-ALT-1");

    private static final SubLSymbol C2_ALT_2 = makeSymbol("C2-ALT-2");

    private static final SubLSymbol C2_LAT_0 = makeSymbol("C2-LAT-0");

    private static final SubLSymbol C2_LAT_1 = makeSymbol("C2-LAT-1");

    private static final SubLSymbol C2_LAT_2 = makeSymbol("C2-LAT-2");

    private static final SubLSymbol C2_LONG_0 = makeSymbol("C2-LONG-0");

    private static final SubLSymbol C2_LONG_1 = makeSymbol("C2-LONG-1");

    private static final SubLSymbol C2_LONG_2 = makeSymbol("C2-LONG-2");

    static private final SubLList $list51 = list(list(list(list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(-100), makeInteger(1000)), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), makeInteger(-5), makeInteger(105), makeInteger(1000))), list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), makeDouble(0.1), makeInteger(-101), makeInteger(1010)), list(reader_make_constant_shell("TheList"), makeDouble(0.1), ONE_INTEGER, TEN_INTEGER), list(reader_make_constant_shell("TheList"), makeDouble(-5.1), makeInteger(106), makeInteger(1010)))), T));

    private static final SubLSymbol CYC_POINT_MATCHES_QUAD_3D = makeSymbol("CYC-POINT-MATCHES-QUAD-3D");

    static private final SubLList $list53 = list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("CURVE-LONG-2")), list($BIND, makeSymbol("CURVE-LONG-1")), list($BIND, makeSymbol("CURVE-LONG-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("CURVE-LAT-2")), list($BIND, makeSymbol("CURVE-LAT-1")), list($BIND, makeSymbol("CURVE-LAT-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("CURVE-ALT-2")), list($BIND, makeSymbol("CURVE-ALT-1")), list($BIND, makeSymbol("CURVE-ALT-0"))));

    private static final SubLSymbol CURVE_ALT_0 = makeSymbol("CURVE-ALT-0");

    private static final SubLSymbol CURVE_ALT_1 = makeSymbol("CURVE-ALT-1");

    private static final SubLSymbol CURVE_ALT_2 = makeSymbol("CURVE-ALT-2");

    private static final SubLSymbol CURVE_LAT_0 = makeSymbol("CURVE-LAT-0");

    private static final SubLSymbol CURVE_LAT_1 = makeSymbol("CURVE-LAT-1");

    private static final SubLSymbol CURVE_LAT_2 = makeSymbol("CURVE-LAT-2");

    private static final SubLSymbol CURVE_LONG_0 = makeSymbol("CURVE-LONG-0");

    private static final SubLSymbol CURVE_LONG_1 = makeSymbol("CURVE-LONG-1");

    private static final SubLSymbol CURVE_LONG_2 = makeSymbol("CURVE-LONG-2");

    static private final SubLList $list63 = list(reader_make_constant_shell("Point4Fn"), list($BIND, makeSymbol("POINT-LONG")), list($BIND, makeSymbol("POINT-LAT")), list($BIND, makeSymbol("POINT-ALT")), list($BIND, makeSymbol("POINT-TIME")));

    private static final SubLSymbol POINT_TIME = makeSymbol("POINT-TIME");

    private static final SubLSymbol POINT_ALT = makeSymbol("POINT-ALT");

    private static final SubLSymbol POINT_LAT = makeSymbol("POINT-LAT");

    private static final SubLSymbol POINT_LONG = makeSymbol("POINT-LONG");

    static private final SubLList $list68 = list(reader_make_constant_shell("Meter"), ONE_INTEGER);

    static private final SubLList $list69 = list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER);

    static private final SubLList $list70 = list(list(list(list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(910)), list(reader_make_constant_shell("Meter"), TEN_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(1110)), list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER)), list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(-100), makeInteger(1000)), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), makeInteger(-5), makeInteger(105), makeInteger(1000)))), T));

    static private final SubLList $list71 = list(makeSymbol("START-LONG"), makeSymbol("START-LAT"), makeSymbol("&OPTIONAL"), list(makeSymbol("START-ALT"), ZERO_INTEGER));

    static private final SubLList $list72 = list(makeSymbol("AIM-LONG"), makeSymbol("AIM-LAT"), makeSymbol("ALT-ANGLE"));

    static private final SubLList $list73 = list(makeSymbol("MUZZLE-VEL"), makeSymbol("&OPTIONAL"), list(makeSymbol("START-TIME"), ZERO_INTEGER), list(makeSymbol("GRAVITY"), makeDouble(-9.8)));

    private static final SubLFloat $float$_9_8 = makeDouble(-9.8);

    static private final SubLList $list75 = list(makeSymbol("TRACE-COUNT"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRACE-START"), makeSymbol("START-TIME")), list(makeSymbol("TRACE-FREQ"), ONE_INTEGER));





    private static final SubLSymbol GENERATE_PROJECTILE_TRACE = makeSymbol("GENERATE-PROJECTILE-TRACE");

    static private final SubLList $list79 = list(list(list(list(makeInteger(1000), ZERO_INTEGER, ZERO_INTEGER), list(ZERO_INTEGER, ZERO_INTEGER, makeDouble(0.8097835725701669)), list(makeInteger(145), ZERO_INTEGER, makeInteger(-5)), list(THREE_INTEGER, ZERO_INTEGER, ONE_INTEGER)), list(list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(1000)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("SecondsDuration"), ZERO_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(900)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(100)), list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(800)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(190)), list(reader_make_constant_shell("SecondsDuration"), TWO_INTEGER)))), list(list(list(makeInteger(10000), ZERO_INTEGER, ZERO_INTEGER), list(ZERO_INTEGER, ZERO_INTEGER, makeDouble(0.9272952180016123)), list(makeInteger(800), ZERO_INTEGER, makeDouble(-9.8)), list(THREE_INTEGER, ZERO_INTEGER, ONE_INTEGER)), list(list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(10000)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("SecondsDuration"), ZERO_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(9520)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeDouble(630.2)), list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(9040)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeDouble(1240.8)), list(reader_make_constant_shell("SecondsDuration"), TWO_INTEGER)))));

    private static final SubLSymbol ACIP_GENERATE_TEST_SUITE_1_SIMULATION_FILE = makeSymbol("ACIP-GENERATE-TEST-SUITE-1-SIMULATION-FILE");

    static private final SubLString $str83$observations__3__0D = makeString("observations-~3,'0D");

    static private final SubLString $$$txt = makeString("txt");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLInteger $int$800 = makeInteger(800);

    private static final SubLFloat $float$0_9272952180016123 = makeDouble(0.9272952180016123);

    private static final SubLObject $$ACIP_Radar_001 = reader_make_constant_shell("ACIP-Radar-001");

    static private final SubLString $str90$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str92$___ACIP_Defender_Observation_Simu = makeString(";; ACIP Defender Observation Simulation File");

    static private final SubLString $str93$_____Test_Suite_1__ = makeString("~%;; Test Suite 1 :");

    static private final SubLString $str94$_______observations__________D_to = makeString("~%;;   observations       : ~D total");

    static private final SubLString $str95$_______first_observation_____D_se = makeString("~%;;   first observation  : ~D second~:P");

    static private final SubLString $str96$_______observation_freq______D_se = makeString("~%;;   observation freq.  : ~D second~:P");

    private static final SubLSymbol ACIP_GENERATE_TEST_SUITE_2_SIMULATION_FILE = makeSymbol("ACIP-GENERATE-TEST-SUITE-2-SIMULATION-FILE");

    private static final SubLFloat $float$65_3 = makeDouble(65.3);

    static private final SubLString $str99$_____Test_Suite_2__ = makeString("~%;; Test Suite 2 :");

    static private final SubLString $str100$_______observation_freq______S_se = makeString("~%;;   observation freq.  : ~S second~:P");

    private static final SubLSymbol ACIP_GENERATE_TEST_SUITE_3_SIMULATION_FILE = makeSymbol("ACIP-GENERATE-TEST-SUITE-3-SIMULATION-FILE");

    static private final SubLString $str102$observations__2__0D__3__0D = makeString("observations-~2,'0D-~3,'0D");

    static private final SubLSymbol $sym105$ACIP_SUITE_3_OBSERVATION__ = makeSymbol("ACIP-SUITE-3-OBSERVATION-<");

    static private final SubLString $str106$_____Test_Suite_3__ = makeString("~%;; Test Suite 3 :");

    static private final SubLString $str107$_______traces________________D_to = makeString("~%;;   traces             : ~D total");

    static private final SubLString $str108$_______observations__________D_pe = makeString("~%;;   observations       : ~D per trace, ~D total");

    static private final SubLList $list109 = list(reader_make_constant_shell("sensorObservation"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("Point4Fn"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("Meter"), list($BIND, makeSymbol("LAT-1"))), makeKeyword("ANYTHING"), list(reader_make_constant_shell("SecondsDuration"), list($BIND, makeSymbol("TIME-1")))));

    private static final SubLSymbol TIME_1 = makeSymbol("TIME-1");

    private static final SubLSymbol LAT_1 = makeSymbol("LAT-1");

    static private final SubLList $list112 = list(reader_make_constant_shell("sensorObservation"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("Point4Fn"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("Meter"), list($BIND, makeSymbol("LAT-2"))), makeKeyword("ANYTHING"), list(reader_make_constant_shell("SecondsDuration"), list($BIND, makeSymbol("TIME-2")))));

    private static final SubLSymbol TIME_2 = makeSymbol("TIME-2");

    private static final SubLSymbol LAT_2 = makeSymbol("LAT-2");

    public static final SubLSymbol $acip_defender_observation_mt$ = makeSymbol("*ACIP-DEFENDER-OBSERVATION-MT*");



    private static final SubLSymbol ACIP_RUN_DEFENDER_SIMULATION_FILE = makeSymbol("ACIP-RUN-DEFENDER-SIMULATION-FILE");

    static private final SubLString $$$cdolist = makeString("cdolist");

    static private final SubLList $list120 = list(reader_make_constant_shell("ballisticPathSensorCorroborationCount"), makeSymbol("?PATH"), makeSymbol("?NUM"));



    static private final SubLList $list122 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list($PATH, makeSymbol("?PATH"), makeKeyword("OBSERVATIONS"), makeSymbol("?NUM"))));

    static private final SubLString $str123$__Total_time_____________________ = makeString("~%Total time                         : ~6,' D seconds");

    private static final SubLSymbol ACIP_LOAD_DEFENDER_OBSERVATIONS = makeSymbol("ACIP-LOAD-DEFENDER-OBSERVATIONS");

    public static final SubLSymbol $acip_load_defender_observations_caching_state$ = makeSymbol("*ACIP-LOAD-DEFENDER-OBSERVATIONS-CACHING-STATE*");



    private static final SubLList $list130 = list(new SubLObject[]{ list($TERM, reader_make_constant_shell("ACIPWorldBackgroundMt")), list($TERM, reader_make_constant_shell("ACIPGameBackgroundMt")), list($TERM, reader_make_constant_shell("ACIPGameDataMt")), list($TERM, reader_make_constant_shell("ACIPDefenderTheoryMt")), list($TERM, reader_make_constant_shell("ACIPDefenderWorldStateMt")), list($TERM, reader_make_constant_shell("ACIPDefenderObservationMt")), list($TERM, reader_make_constant_shell("ACIPDefenderModelMt")), list($TERM, reader_make_constant_shell("ListOf2RealNumbers")), list($TERM, reader_make_constant_shell("ListOf3RealNumbers")), list($TERM, reader_make_constant_shell("Path-4D")), list($TERM, reader_make_constant_shell("Place-4D")), list($TERM, reader_make_constant_shell("QuadraticCurve-3D")), list($TERM, reader_make_constant_shell("RailroadGun")), list($TERM, reader_make_constant_shell("Dora-RailroadGun")), list($TERM, reader_make_constant_shell("Darla-RailroadGun")), list($TERM, reader_make_constant_shell("ANSPS-49-Radar")), list($TERM, reader_make_constant_shell("QuantityNumberFn")), list($TERM, reader_make_constant_shell("Point4Fn")), list($TERM, reader_make_constant_shell("Path4Fn")), list($TERM, reader_make_constant_shell("Quad3DFn")), list($TERM, reader_make_constant_shell("Point4TimeFn")), list($TERM, reader_make_constant_shell("QuadCoeffFn")), list($TERM, reader_make_constant_shell("arbitraryPath4DOrdering")), list($TERM, reader_make_constant_shell("ballisticPathSensorCorroborationCount")), list($TERM, reader_make_constant_shell("candidatePath")), list($TERM, reader_make_constant_shell("candidatePathTriple")), list($TERM, reader_make_constant_shell("equals-Quad3D")), list($TERM, reader_make_constant_shell("implausibleBallisticPathCoefficients")), list($TERM, reader_make_constant_shell("onBallisticPath")), list($TERM, reader_make_constant_shell("place4Altitude")), list($TERM, reader_make_constant_shell("place4Latitude")), list($TERM, reader_make_constant_shell("place4Longitude")), list($TERM, reader_make_constant_shell("place4Time")), list($TERM, reader_make_constant_shell("plausibleBallisticPath")), list($TERM, reader_make_constant_shell("point4LaterThan")), list($TERM, reader_make_constant_shell("pointMatchesQuad3D")), list($TERM, reader_make_constant_shell("representativeBallisticPath")), list($TERM, reader_make_constant_shell("sensorObservation")), list($TERM, reader_make_constant_shell("ACIP-Radar-001")) });

    private static final SubLSymbol SAVE_ACIP_PARTITION = makeSymbol("SAVE-ACIP-PARTITION");

    private static final SubLList $list132 = list(list($TERM, reader_make_constant_shell("Meter")), list($TERM, reader_make_constant_shell("SecondsDuration")));

    static private final SubLList $list133 = list(makeKeyword("LIST-HASHING"), makeKeyword("UNIFICATION"), makeKeyword("PATTERN-MATCH"), makeKeyword("TACTIC-GENERATION"));

    static private final SubLList $list134 = list(list(makeSymbol("&KEY"), makeSymbol("SUBKERNEL"), makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list135 = list(makeKeyword("SUBKERNEL"), makeKeyword("FILENAME"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym139$SUBKERNEL_VAR = makeUninternedSymbol("SUBKERNEL-VAR");

    private static final SubLSymbol $sym140$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    private static final SubLSymbol $sym141$STREAM = makeUninternedSymbol("STREAM");

    private static final SubLList $list144 = list(makeSymbol("ACIP-SUBKERNEL-P"));

    static private final SubLList $list145 = list(makeSymbol("STRINGP"));

    private static final SubLList $list148 = list(makeKeyword("OUTPUT"));

    private static final SubLSymbol $acip_subkernel_output_stream$ = makeSymbol("*ACIP-SUBKERNEL-OUTPUT-STREAM*");

    private static final SubLSymbol $acip_subkernel_extraction$ = makeSymbol("*ACIP-SUBKERNEL-EXTRACTION*");

    private static final SubLList $list153 = list(list(makeSymbol("CSETQ"), makeSymbol("*ACIP-SUBKERNEL-OUTPUT-STREAM*"), NIL), list(makeSymbol("CSETQ"), makeSymbol("*ACIP-SUBKERNEL-EXTRACTION*"), NIL));

    private static final SubLString $str155$File__S_not_found_ = makeString("File ~S not found.");

    private static final SubLString $$$Performing_ = makeString("Performing ");

    private static final SubLString $$$_trial = makeString(" trial");

    private static final SubLString $$$s = makeString("s");

    private static final SubLString $str159$ = makeString("");

    private static final SubLString $$$_of_subkernel = makeString(" of subkernel");

    private static final SubLString $str165$Time_to_support__S_subkernel_ = makeString("Time to support ~S subkernel.");

    private static final SubLInteger $int$2000 = makeInteger(2000);

    private static final SubLString $str167$Actual_hash_code__S_differs_from_ = makeString("Actual hash code ~S differs from expected hash code ~S");

    private static final SubLInteger $int$200 = makeInteger(200);

    private static final SubLString $str169$Actual_bindings__S_differs_from_e = makeString("Actual bindings ~S differs from expected bindings ~S");

    private static final SubLString $str170$Actual_result__S_differs_from_exp = makeString("Actual result ~S differs from expected result ~S");

    private static final SubLList $list171 = list(makeSymbol("HL-MODULE1"), makeSymbol("PRODUCTIVITY1"), makeSymbol("COMPLETENESS1"));

    static private final SubLList $list172 = list(makeSymbol("HL-MODULE2"), makeSymbol("PRODUCTIVITY2"), makeSymbol("COMPLETENESS2"));

    static private final SubLList $list173 = list(makeKeyword("REMOVAL-LOOKUP-POS"));

    private static final SubLSymbol HL_MODULE_NAME = makeSymbol("HL-MODULE-NAME");

    private static final SubLSymbol FIND_HL_MODULE_BY_NAME = makeSymbol("FIND-HL-MODULE-BY-NAME");

    private static final SubLList $list176 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"), makeSymbol("COMPLETENESS"));

    static private final SubLList $list177 = list(makeSymbol("CYC-QUAD-COEFF"), makeSymbol("CYC-ARBITRARY-PATH-4D-ORDERING"), makeSymbol("CYC-EQUALS-QUAD-3D"), makeSymbol("CYC-POINT-MATCHES-QUAD-3D"), makeSymbol("GENERATE-PROJECTILE-TRACE"));

    static {
    }

    // Definitions
    /**
     * #$defnIff for #$ListOf2RealNumbers
     */
    @LispMethod(comment = "#$defnIff for #$ListOf2RealNumbers")
    public static final SubLObject cyc_list_of_2_real_numbers_alt(SubLObject v_object) {
        return makeBoolean(((NIL != el_non_empty_list_p(v_object)) && (NIL != formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(symbol_function(NUMBERP), cycl_utilities.formula_args(v_object, UNPROVIDED), UNPROVIDED)));
    }

    // Definitions
    /**
     * #$defnIff for #$ListOf2RealNumbers
     */
    @LispMethod(comment = "#$defnIff for #$ListOf2RealNumbers")
    public static SubLObject cyc_list_of_2_real_numbers(final SubLObject v_object) {
        return makeBoolean(((NIL != el_non_empty_list_p(v_object)) && (NIL != formula_arityE(v_object, TWO_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(symbol_function(NUMBERP), cycl_utilities.formula_args(v_object, UNPROVIDED), UNPROVIDED)));
    }

    /**
     * #$defnIff for #$ListOf3RealNumbers
     */
    @LispMethod(comment = "#$defnIff for #$ListOf3RealNumbers")
    public static final SubLObject cyc_list_of_3_real_numbers_alt(SubLObject v_object) {
        return makeBoolean(((NIL != el_non_empty_list_p(v_object)) && (NIL != formula_arityE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(symbol_function(NUMBERP), cycl_utilities.formula_args(v_object, UNPROVIDED), UNPROVIDED)));
    }

    /**
     * #$defnIff for #$ListOf3RealNumbers
     */
    @LispMethod(comment = "#$defnIff for #$ListOf3RealNumbers")
    public static SubLObject cyc_list_of_3_real_numbers(final SubLObject v_object) {
        return makeBoolean(((NIL != el_non_empty_list_p(v_object)) && (NIL != formula_arityE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != list_utilities.every_in_list(symbol_function(NUMBERP), cycl_utilities.formula_args(v_object, UNPROVIDED), UNPROVIDED)));
    }

    /**
     * #$evaluationDefn for #$Point4TimeFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$Point4TimeFn")
    public static final SubLObject cyc_point_4_time_alt(SubLObject v_object) {
        if (!((NIL != el_formula_with_operator_p(v_object, $$Point4Fn)) && (NIL != formula_arityE(v_object, FOUR_INTEGER, UNPROVIDED)))) {
            relation_evaluation.throw_unevaluatable();
        }
        {
            SubLObject result = cycl_utilities.formula_arg(v_object, FOUR_INTEGER, UNPROVIDED);
            if (!result.isNumber()) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * #$evaluationDefn for #$Point4TimeFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$Point4TimeFn")
    public static SubLObject cyc_point_4_time(final SubLObject v_object) {
        if ((NIL == el_formula_with_operator_p(v_object, $$Point4Fn)) || (NIL == formula_arityE(v_object, FOUR_INTEGER, UNPROVIDED))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = cycl_utilities.formula_arg(v_object, FOUR_INTEGER, UNPROVIDED);
        if (!result.isNumber()) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    /**
     * #$evaluationDefn for #$QuadCoeffFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$QuadCoeffFn")
    public static final SubLObject cyc_quad_coeff_alt(SubLObject tuple1, SubLObject tuple2, SubLObject tuple3) {
        {
            SubLObject result = NIL;
            SubLObject error = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            result = com.cyc.cycjava.cycl.acip.quad_coeff(tuple1, tuple2, tuple3);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error) {
                relation_evaluation.throw_unevaluatable();
            }
            return result;
        }
    }

    /**
     * #$evaluationDefn for #$QuadCoeffFn
     */
    @LispMethod(comment = "#$evaluationDefn for #$QuadCoeffFn")
    public static SubLObject cyc_quad_coeff(final SubLObject tuple1, final SubLObject tuple2, final SubLObject tuple3) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = quad_coeff(tuple1, tuple2, tuple3);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static final SubLObject quad_coeff_alt(SubLObject tuple1, SubLObject tuple2, SubLObject tuple3) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject success = formula_pattern_match.formula_matches_pattern(list(tuple1, tuple2, tuple3), $list_alt7);
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    {
                        SubLObject y3 = list_utilities.alist_lookup_without_values(v_bindings, Y3, UNPROVIDED, UNPROVIDED);
                        SubLObject x3 = list_utilities.alist_lookup_without_values(v_bindings, X3, UNPROVIDED, UNPROVIDED);
                        SubLObject y2 = list_utilities.alist_lookup_without_values(v_bindings, Y2, UNPROVIDED, UNPROVIDED);
                        SubLObject x2 = list_utilities.alist_lookup_without_values(v_bindings, X2, UNPROVIDED, UNPROVIDED);
                        SubLObject y1 = list_utilities.alist_lookup_without_values(v_bindings, Y1, UNPROVIDED, UNPROVIDED);
                        SubLObject x1 = list_utilities.alist_lookup_without_values(v_bindings, X1, UNPROVIDED, UNPROVIDED);
                        SubLObject a = divide(subtract(divide(subtract(y1, y3), subtract(x1, x3)), divide(subtract(y1, y2), subtract(x1, x2))), subtract(divide(subtract(number_utilities.square(x2), number_utilities.square(x1)), subtract(x1, x2)), divide(subtract(number_utilities.square(x3), number_utilities.square(x1)), subtract(x1, x3))));
                        SubLObject b = add(divide(multiply(a, subtract(number_utilities.square(x2), number_utilities.square(x1))), subtract(x1, x2)), divide(subtract(y1, y2), subtract(x1, x2)));
                        SubLObject c = subtract(y1, multiply(a, number_utilities.square(x1)), multiply(b, x1));
                        a = number_utilities.four_significant_digits(a);
                        b = number_utilities.four_significant_digits(b);
                        c = number_utilities.four_significant_digits(c);
                        return make_el_list(list(a, b, c), UNPROVIDED);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject quad_coeff(final SubLObject tuple1, final SubLObject tuple2, final SubLObject tuple3) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(list(tuple1, tuple2, tuple3), $list7);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject y3 = list_utilities.alist_lookup_without_values(v_bindings, Y3, UNPROVIDED, UNPROVIDED);
            final SubLObject x3 = list_utilities.alist_lookup_without_values(v_bindings, X3, UNPROVIDED, UNPROVIDED);
            final SubLObject y4 = list_utilities.alist_lookup_without_values(v_bindings, Y2, UNPROVIDED, UNPROVIDED);
            final SubLObject x4 = list_utilities.alist_lookup_without_values(v_bindings, X2, UNPROVIDED, UNPROVIDED);
            final SubLObject y5 = list_utilities.alist_lookup_without_values(v_bindings, Y1, UNPROVIDED, UNPROVIDED);
            final SubLObject x5 = list_utilities.alist_lookup_without_values(v_bindings, X1, UNPROVIDED, UNPROVIDED);
            SubLObject a = divide(subtract(divide(subtract(y5, y3), subtract(x5, x3)), divide(subtract(y5, y4), subtract(x5, x4))), subtract(divide(subtract(number_utilities.square(x4), number_utilities.square(x5)), subtract(x5, x4)), divide(subtract(number_utilities.square(x3), number_utilities.square(x5)), subtract(x5, x3))));
            SubLObject b = add(divide(multiply(a, subtract(number_utilities.square(x4), number_utilities.square(x5))), subtract(x5, x4)), divide(subtract(y5, y4), subtract(x5, x4)));
            SubLObject c = subtract(y5, multiply(a, number_utilities.square(x5)), multiply(b, x5));
            a = number_utilities.four_significant_digits(a);
            b = number_utilities.four_significant_digits(b);
            c = number_utilities.four_significant_digits(c);
            return make_el_list(list(a, b, c), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$arbitraryPath4DOrdering
     */
    @LispMethod(comment = "#$evaluationDefn for #$arbitraryPath4DOrdering")
    public static final SubLObject cyc_arbitrary_path_4d_ordering_alt(SubLObject path1, SubLObject path2) {
        {
            SubLObject pattern = $list_alt22;
            if (!((NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, path1)) && (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, path2)))) {
                relation_evaluation.throw_unevaluatable();
            }
        }
        {
            SubLObject path1_points = cycl_utilities.formula_args(path1, UNPROVIDED);
            SubLObject path2_points = cycl_utilities.formula_args(path2, UNPROVIDED);
            return com.cyc.cycjava.cycl.acip.cyc_arbitrary_path_4d_ordering_int(path1_points, path2_points);
        }
    }

    /**
     * #$evaluationDefn for #$arbitraryPath4DOrdering
     */
    @LispMethod(comment = "#$evaluationDefn for #$arbitraryPath4DOrdering")
    public static SubLObject cyc_arbitrary_path_4d_ordering(final SubLObject path1, final SubLObject path2) {
        final SubLObject pattern = $list21;
        if ((NIL == formula_pattern_match.pattern_matches_formula_without_bindings(pattern, path1)) || (NIL == formula_pattern_match.pattern_matches_formula_without_bindings(pattern, path2))) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject path1_points = cycl_utilities.formula_args(path1, UNPROVIDED);
        final SubLObject path2_points = cycl_utilities.formula_args(path2, UNPROVIDED);
        return cyc_arbitrary_path_4d_ordering_int(path1_points, path2_points);
    }

    public static final SubLObject cyc_arbitrary_path_4d_ordering_int_alt(SubLObject path1_points, SubLObject path2_points) {
        if (NIL == path1_points) {
            return makeBoolean(NIL != path2_points);
        } else {
            if (NIL == path2_points) {
                return NIL;
            } else {
                {
                    SubLObject datum = path1_points;
                    SubLObject current = datum;
                    SubLObject path1_point = NIL;
                    SubLObject path1_rest_points = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt24);
                    path1_point = current.first();
                    current = current.rest();
                    path1_rest_points = current;
                    {
                        SubLObject datum_1 = path2_points;
                        SubLObject current_2 = datum_1;
                        SubLObject path2_point = NIL;
                        SubLObject path2_rest_points = NIL;
                        destructuring_bind_must_consp(current_2, datum_1, $list_alt25);
                        path2_point = current_2.first();
                        current_2 = current_2.rest();
                        path2_rest_points = current_2;
                        if (NIL != com.cyc.cycjava.cycl.acip.cyc_arbitrary_path_point_4d_ordering(path1_point, path2_point)) {
                            return T;
                        } else {
                            if (NIL != com.cyc.cycjava.cycl.acip.cyc_arbitrary_path_point_4d_ordering(path2_point, path1_point)) {
                                return NIL;
                            } else {
                                return com.cyc.cycjava.cycl.acip.cyc_arbitrary_path_4d_ordering_int(path1_rest_points, path2_rest_points);
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject cyc_arbitrary_path_4d_ordering_int(final SubLObject path1_points, final SubLObject path2_points) {
        if (NIL == path1_points) {
            return makeBoolean(NIL != path2_points);
        }
        if (NIL == path2_points) {
            return NIL;
        }
        SubLObject path1_point = NIL;
        SubLObject path1_rest_points = NIL;
        destructuring_bind_must_consp(path1_points, path1_points, $list23);
        path1_point = path1_points.first();
        final SubLObject current = path1_rest_points = path1_points.rest();
        SubLObject path2_point = NIL;
        SubLObject path2_rest_points = NIL;
        destructuring_bind_must_consp(path2_points, path2_points, $list24);
        path2_point = path2_points.first();
        final SubLObject current_$2 = path2_rest_points = path2_points.rest();
        if (NIL != cyc_arbitrary_path_point_4d_ordering(path1_point, path2_point)) {
            return T;
        }
        if (NIL != cyc_arbitrary_path_point_4d_ordering(path2_point, path1_point)) {
            return NIL;
        }
        return cyc_arbitrary_path_4d_ordering_int(path1_rest_points, path2_rest_points);
    }

    public static final SubLObject cyc_arbitrary_path_point_4d_ordering_alt(SubLObject point1, SubLObject point2) {
        {
            SubLObject pattern = $list_alt26;
            if ((NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, point1)) && (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, point2))) {
                {
                    SubLObject time_1 = cycl_utilities.formula_arg(point1, FOUR_INTEGER, UNPROVIDED);
                    SubLObject time_2 = cycl_utilities.formula_arg(point2, FOUR_INTEGER, UNPROVIDED);
                    if (NIL != arithmetic.cyc_less_than(time_1, time_2)) {
                        return T;
                    } else {
                        if (NIL != arithmetic.cyc_less_than(time_2, time_1)) {
                            return NIL;
                        }
                    }
                }
                {
                    SubLObject long_1 = cycl_utilities.formula_arg(point1, ONE_INTEGER, UNPROVIDED);
                    SubLObject long_2 = cycl_utilities.formula_arg(point2, ONE_INTEGER, UNPROVIDED);
                    if (NIL != arithmetic.cyc_less_than(long_1, long_2)) {
                        return T;
                    } else {
                        if (NIL != arithmetic.cyc_less_than(long_2, long_1)) {
                            return NIL;
                        }
                    }
                }
                {
                    SubLObject lat_1 = cycl_utilities.formula_arg(point1, TWO_INTEGER, UNPROVIDED);
                    SubLObject lat_2 = cycl_utilities.formula_arg(point2, TWO_INTEGER, UNPROVIDED);
                    if (NIL != arithmetic.cyc_less_than(lat_1, lat_2)) {
                        return T;
                    } else {
                        if (NIL != arithmetic.cyc_less_than(lat_2, lat_1)) {
                            return NIL;
                        }
                    }
                }
                {
                    SubLObject alt_1 = cycl_utilities.formula_arg(point1, THREE_INTEGER, UNPROVIDED);
                    SubLObject alt_2 = cycl_utilities.formula_arg(point2, THREE_INTEGER, UNPROVIDED);
                    if (NIL != arithmetic.cyc_less_than(alt_1, alt_2)) {
                        return T;
                    } else {
                        if (NIL != arithmetic.cyc_less_than(alt_2, alt_1)) {
                            return NIL;
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject cyc_arbitrary_path_point_4d_ordering(final SubLObject point1, final SubLObject point2) {
        final SubLObject pattern = $list25;
        if ((NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, point1)) && (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, point2))) {
            final SubLObject time_1 = cycl_utilities.formula_arg(point1, FOUR_INTEGER, UNPROVIDED);
            final SubLObject time_2 = cycl_utilities.formula_arg(point2, FOUR_INTEGER, UNPROVIDED);
            if (NIL != arithmetic.cyc_less_than(time_1, time_2)) {
                return T;
            }
            if (NIL != arithmetic.cyc_less_than(time_2, time_1)) {
                return NIL;
            }
            final SubLObject long_1 = cycl_utilities.formula_arg(point1, ONE_INTEGER, UNPROVIDED);
            final SubLObject long_2 = cycl_utilities.formula_arg(point2, ONE_INTEGER, UNPROVIDED);
            if (NIL != arithmetic.cyc_less_than(long_1, long_2)) {
                return T;
            }
            if (NIL != arithmetic.cyc_less_than(long_2, long_1)) {
                return NIL;
            }
            final SubLObject lat_1 = cycl_utilities.formula_arg(point1, TWO_INTEGER, UNPROVIDED);
            final SubLObject lat_2 = cycl_utilities.formula_arg(point2, TWO_INTEGER, UNPROVIDED);
            if (NIL != arithmetic.cyc_less_than(lat_1, lat_2)) {
                return T;
            }
            if (NIL != arithmetic.cyc_less_than(lat_2, lat_1)) {
                return NIL;
            }
            final SubLObject alt_1 = cycl_utilities.formula_arg(point1, THREE_INTEGER, UNPROVIDED);
            final SubLObject alt_2 = cycl_utilities.formula_arg(point2, THREE_INTEGER, UNPROVIDED);
            if (NIL != arithmetic.cyc_less_than(alt_1, alt_2)) {
                return T;
            }
            if (NIL != arithmetic.cyc_less_than(alt_2, alt_1)) {
                return NIL;
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$equals-Quad3D
     */
    @LispMethod(comment = "#$evaluationDefn for #$equals-Quad3D")
    public static final SubLObject cyc_equals_quad_3d_alt(SubLObject curve_1, SubLObject curve_2) {
        {
            SubLObject syntactic_pattern = $list_alt28;
            if (!((NIL != formula_pattern_match.pattern_matches_formula_without_bindings(syntactic_pattern, curve_1)) && (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(syntactic_pattern, curve_2)))) {
                relation_evaluation.throw_unevaluatable();
            }
            return com.cyc.cycjava.cycl.acip.cyc_equals_quad_3d_int(curve_1, curve_2);
        }
    }

    /**
     * #$evaluationDefn for #$equals-Quad3D
     */
    @LispMethod(comment = "#$evaluationDefn for #$equals-Quad3D")
    public static SubLObject cyc_equals_quad_3d(final SubLObject curve_1, final SubLObject curve_2) {
        final SubLObject syntactic_pattern = $list28;
        if ((NIL == formula_pattern_match.pattern_matches_formula_without_bindings(syntactic_pattern, curve_1)) || (NIL == formula_pattern_match.pattern_matches_formula_without_bindings(syntactic_pattern, curve_2))) {
            relation_evaluation.throw_unevaluatable();
        }
        return cyc_equals_quad_3d_int(curve_1, curve_2);
    }

    public static final SubLObject cyc_equals_quad_3d_int_alt(SubLObject curve_1, SubLObject curve_2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject success = formula_pattern_match.formula_matches_pattern(curve_1, $list_alt31);
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    {
                        SubLObject c1_alt_0 = list_utilities.alist_lookup_without_values(v_bindings, C1_ALT_0, UNPROVIDED, UNPROVIDED);
                        SubLObject c1_alt_1 = list_utilities.alist_lookup_without_values(v_bindings, C1_ALT_1, UNPROVIDED, UNPROVIDED);
                        SubLObject c1_alt_2 = list_utilities.alist_lookup_without_values(v_bindings, C1_ALT_2, UNPROVIDED, UNPROVIDED);
                        SubLObject c1_lat_0 = list_utilities.alist_lookup_without_values(v_bindings, C1_LAT_0, UNPROVIDED, UNPROVIDED);
                        SubLObject c1_lat_1 = list_utilities.alist_lookup_without_values(v_bindings, C1_LAT_1, UNPROVIDED, UNPROVIDED);
                        SubLObject c1_lat_2 = list_utilities.alist_lookup_without_values(v_bindings, C1_LAT_2, UNPROVIDED, UNPROVIDED);
                        SubLObject c1_long_0 = list_utilities.alist_lookup_without_values(v_bindings, C1_LONG_0, UNPROVIDED, UNPROVIDED);
                        SubLObject c1_long_1 = list_utilities.alist_lookup_without_values(v_bindings, C1_LONG_1, UNPROVIDED, UNPROVIDED);
                        SubLObject c1_long_2 = list_utilities.alist_lookup_without_values(v_bindings, C1_LONG_2, UNPROVIDED, UNPROVIDED);
                        thread.resetMultipleValues();
                        {
                            SubLObject success_3 = formula_pattern_match.formula_matches_pattern(curve_2, $list_alt41);
                            SubLObject v_bindings_4 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != success_3) {
                                {
                                    SubLObject c2_alt_0 = list_utilities.alist_lookup_without_values(v_bindings_4, C2_ALT_0, UNPROVIDED, UNPROVIDED);
                                    SubLObject c2_alt_1 = list_utilities.alist_lookup_without_values(v_bindings_4, C2_ALT_1, UNPROVIDED, UNPROVIDED);
                                    SubLObject c2_alt_2 = list_utilities.alist_lookup_without_values(v_bindings_4, C2_ALT_2, UNPROVIDED, UNPROVIDED);
                                    SubLObject c2_lat_0 = list_utilities.alist_lookup_without_values(v_bindings_4, C2_LAT_0, UNPROVIDED, UNPROVIDED);
                                    SubLObject c2_lat_1 = list_utilities.alist_lookup_without_values(v_bindings_4, C2_LAT_1, UNPROVIDED, UNPROVIDED);
                                    SubLObject c2_lat_2 = list_utilities.alist_lookup_without_values(v_bindings_4, C2_LAT_2, UNPROVIDED, UNPROVIDED);
                                    SubLObject c2_long_0 = list_utilities.alist_lookup_without_values(v_bindings_4, C2_LONG_0, UNPROVIDED, UNPROVIDED);
                                    SubLObject c2_long_1 = list_utilities.alist_lookup_without_values(v_bindings_4, C2_LONG_1, UNPROVIDED, UNPROVIDED);
                                    SubLObject c2_long_2 = list_utilities.alist_lookup_without_values(v_bindings_4, C2_LONG_2, UNPROVIDED, UNPROVIDED);
                                    return makeBoolean(((((((((NIL != number_utilities.tolerance_E(c1_long_2, c2_long_2, $quad_3d_tolerance_accel$.getGlobalValue())) && (NIL != number_utilities.tolerance_E(c1_long_1, c2_long_1, $quad_3d_tolerance_veloc$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_long_0, c2_long_0, $quad_3d_tolerance_locat$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_lat_2, c2_lat_2, $quad_3d_tolerance_accel$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_lat_1, c2_lat_1, $quad_3d_tolerance_veloc$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_lat_0, c2_lat_0, $quad_3d_tolerance_locat$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_alt_2, c2_alt_2, $quad_3d_tolerance_accel$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_alt_1, c2_alt_1, $quad_3d_tolerance_veloc$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_alt_0, c2_alt_0, $quad_3d_tolerance_locat$.getGlobalValue())));
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cyc_equals_quad_3d_int(final SubLObject curve_1, final SubLObject curve_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(curve_1, $list31);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject c1_alt_0 = list_utilities.alist_lookup_without_values(v_bindings, C1_ALT_0, UNPROVIDED, UNPROVIDED);
            final SubLObject c1_alt_2 = list_utilities.alist_lookup_without_values(v_bindings, C1_ALT_1, UNPROVIDED, UNPROVIDED);
            final SubLObject c1_alt_3 = list_utilities.alist_lookup_without_values(v_bindings, C1_ALT_2, UNPROVIDED, UNPROVIDED);
            final SubLObject c1_lat_0 = list_utilities.alist_lookup_without_values(v_bindings, C1_LAT_0, UNPROVIDED, UNPROVIDED);
            final SubLObject c1_lat_2 = list_utilities.alist_lookup_without_values(v_bindings, C1_LAT_1, UNPROVIDED, UNPROVIDED);
            final SubLObject c1_lat_3 = list_utilities.alist_lookup_without_values(v_bindings, C1_LAT_2, UNPROVIDED, UNPROVIDED);
            final SubLObject c1_long_0 = list_utilities.alist_lookup_without_values(v_bindings, C1_LONG_0, UNPROVIDED, UNPROVIDED);
            final SubLObject c1_long_2 = list_utilities.alist_lookup_without_values(v_bindings, C1_LONG_1, UNPROVIDED, UNPROVIDED);
            final SubLObject c1_long_3 = list_utilities.alist_lookup_without_values(v_bindings, C1_LONG_2, UNPROVIDED, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject success_$3 = formula_pattern_match.formula_matches_pattern(curve_2, $list41);
            final SubLObject v_bindings_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success_$3) {
                final SubLObject c2_alt_0 = list_utilities.alist_lookup_without_values(v_bindings_$4, C2_ALT_0, UNPROVIDED, UNPROVIDED);
                final SubLObject c2_alt_2 = list_utilities.alist_lookup_without_values(v_bindings_$4, C2_ALT_1, UNPROVIDED, UNPROVIDED);
                final SubLObject c2_alt_3 = list_utilities.alist_lookup_without_values(v_bindings_$4, C2_ALT_2, UNPROVIDED, UNPROVIDED);
                final SubLObject c2_lat_0 = list_utilities.alist_lookup_without_values(v_bindings_$4, C2_LAT_0, UNPROVIDED, UNPROVIDED);
                final SubLObject c2_lat_2 = list_utilities.alist_lookup_without_values(v_bindings_$4, C2_LAT_1, UNPROVIDED, UNPROVIDED);
                final SubLObject c2_lat_3 = list_utilities.alist_lookup_without_values(v_bindings_$4, C2_LAT_2, UNPROVIDED, UNPROVIDED);
                final SubLObject c2_long_0 = list_utilities.alist_lookup_without_values(v_bindings_$4, C2_LONG_0, UNPROVIDED, UNPROVIDED);
                final SubLObject c2_long_2 = list_utilities.alist_lookup_without_values(v_bindings_$4, C2_LONG_1, UNPROVIDED, UNPROVIDED);
                final SubLObject c2_long_3 = list_utilities.alist_lookup_without_values(v_bindings_$4, C2_LONG_2, UNPROVIDED, UNPROVIDED);
                return makeBoolean(((((((((NIL != number_utilities.tolerance_E(c1_long_3, c2_long_3, $quad_3d_tolerance_accel$.getGlobalValue())) && (NIL != number_utilities.tolerance_E(c1_long_2, c2_long_2, $quad_3d_tolerance_veloc$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_long_0, c2_long_0, $quad_3d_tolerance_locat$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_lat_3, c2_lat_3, $quad_3d_tolerance_accel$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_lat_2, c2_lat_2, $quad_3d_tolerance_veloc$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_lat_0, c2_lat_0, $quad_3d_tolerance_locat$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_alt_3, c2_alt_3, $quad_3d_tolerance_accel$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_alt_2, c2_alt_2, $quad_3d_tolerance_veloc$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(c1_alt_0, c2_alt_0, $quad_3d_tolerance_locat$.getGlobalValue())));
            }
        }
        return NIL;
    }

    /**
     * #$evaluationDefn for #$pointMatchesQuad3D
     */
    @LispMethod(comment = "#$evaluationDefn for #$pointMatchesQuad3D")
    public static final SubLObject cyc_point_matches_quad_3d_alt(SubLObject point, SubLObject curve) {
        {
            SubLObject point_pattern = $list_alt26;
            SubLObject curve_pattern = $list_alt28;
            if (!((NIL != formula_pattern_match.pattern_matches_formula_without_bindings(point_pattern, point)) && (NIL != formula_pattern_match.pattern_matches_formula_without_bindings(curve_pattern, curve)))) {
                relation_evaluation.throw_unevaluatable();
            }
            {
                SubLObject result = NIL;
                SubLObject error = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                result = com.cyc.cycjava.cycl.acip.cyc_point_matches_quad_3d_int(point, curve);
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error) {
                    relation_evaluation.throw_unevaluatable();
                }
                return result;
            }
        }
    }

    /**
     * #$evaluationDefn for #$pointMatchesQuad3D
     */
    @LispMethod(comment = "#$evaluationDefn for #$pointMatchesQuad3D")
    public static SubLObject cyc_point_matches_quad_3d(final SubLObject point, final SubLObject curve) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject point_pattern = $list25;
        final SubLObject curve_pattern = $list28;
        if ((NIL == formula_pattern_match.pattern_matches_formula_without_bindings(point_pattern, point)) || (NIL == formula_pattern_match.pattern_matches_formula_without_bindings(curve_pattern, curve))) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject result = NIL;
        SubLObject error = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = cyc_point_matches_quad_3d_int(point, curve);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    public static final SubLObject cyc_point_matches_quad_3d_int_alt(SubLObject point, SubLObject curve) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject success = formula_pattern_match.formula_matches_pattern(curve, $list_alt53);
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    {
                        SubLObject curve_alt_0 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_ALT_0, UNPROVIDED, UNPROVIDED);
                        SubLObject curve_alt_1 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_ALT_1, UNPROVIDED, UNPROVIDED);
                        SubLObject curve_alt_2 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_ALT_2, UNPROVIDED, UNPROVIDED);
                        SubLObject curve_lat_0 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LAT_0, UNPROVIDED, UNPROVIDED);
                        SubLObject curve_lat_1 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LAT_1, UNPROVIDED, UNPROVIDED);
                        SubLObject curve_lat_2 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LAT_2, UNPROVIDED, UNPROVIDED);
                        SubLObject curve_long_0 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LONG_0, UNPROVIDED, UNPROVIDED);
                        SubLObject curve_long_1 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LONG_1, UNPROVIDED, UNPROVIDED);
                        SubLObject curve_long_2 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LONG_2, UNPROVIDED, UNPROVIDED);
                        thread.resetMultipleValues();
                        {
                            SubLObject success_5 = formula_pattern_match.formula_matches_pattern(point, $list_alt63);
                            SubLObject v_bindings_6 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != success_5) {
                                {
                                    SubLObject point_time = list_utilities.alist_lookup_without_values(v_bindings_6, POINT_TIME, UNPROVIDED, UNPROVIDED);
                                    SubLObject point_alt = list_utilities.alist_lookup_without_values(v_bindings_6, POINT_ALT, UNPROVIDED, UNPROVIDED);
                                    SubLObject point_lat = list_utilities.alist_lookup_without_values(v_bindings_6, POINT_LAT, UNPROVIDED, UNPROVIDED);
                                    SubLObject point_long = list_utilities.alist_lookup_without_values(v_bindings_6, POINT_LONG, UNPROVIDED, UNPROVIDED);
                                    SubLObject num_point_long = quantities.cyc_quotient(point_long, $list_alt68);
                                    SubLObject num_point_lat = quantities.cyc_quotient(point_lat, $list_alt68);
                                    SubLObject num_point_alt = quantities.cyc_quotient(point_alt, $list_alt68);
                                    SubLObject num_point_time = quantities.cyc_quotient(point_time, $list_alt69);
                                    SubLObject num_curve_long = add(multiply(curve_long_2, expt(num_point_time, TWO_INTEGER)), multiply(curve_long_1, num_point_time), curve_long_0);
                                    SubLObject num_curve_lat = add(multiply(curve_lat_2, expt(num_point_time, TWO_INTEGER)), multiply(curve_lat_1, num_point_time), curve_lat_0);
                                    SubLObject num_curve_alt = add(multiply(curve_alt_2, expt(num_point_time, TWO_INTEGER)), multiply(curve_alt_1, num_point_time), curve_alt_0);
                                    return makeBoolean(((NIL != number_utilities.tolerance_E(num_point_long, num_curve_long, $quad_3d_tolerance_locat$.getGlobalValue())) && (NIL != number_utilities.tolerance_E(num_point_lat, num_curve_lat, $quad_3d_tolerance_locat$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(num_point_alt, num_curve_alt, $quad_3d_tolerance_locat$.getGlobalValue())));
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject cyc_point_matches_quad_3d_int(final SubLObject point, final SubLObject curve) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(curve, $list53);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject curve_alt_0 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_ALT_0, UNPROVIDED, UNPROVIDED);
            final SubLObject curve_alt_2 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_ALT_1, UNPROVIDED, UNPROVIDED);
            final SubLObject curve_alt_3 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_ALT_2, UNPROVIDED, UNPROVIDED);
            final SubLObject curve_lat_0 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LAT_0, UNPROVIDED, UNPROVIDED);
            final SubLObject curve_lat_2 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LAT_1, UNPROVIDED, UNPROVIDED);
            final SubLObject curve_lat_3 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LAT_2, UNPROVIDED, UNPROVIDED);
            final SubLObject curve_long_0 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LONG_0, UNPROVIDED, UNPROVIDED);
            final SubLObject curve_long_2 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LONG_1, UNPROVIDED, UNPROVIDED);
            final SubLObject curve_long_3 = list_utilities.alist_lookup_without_values(v_bindings, CURVE_LONG_2, UNPROVIDED, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject success_$5 = formula_pattern_match.formula_matches_pattern(point, $list63);
            final SubLObject v_bindings_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success_$5) {
                final SubLObject point_time = list_utilities.alist_lookup_without_values(v_bindings_$6, POINT_TIME, UNPROVIDED, UNPROVIDED);
                final SubLObject point_alt = list_utilities.alist_lookup_without_values(v_bindings_$6, POINT_ALT, UNPROVIDED, UNPROVIDED);
                final SubLObject point_lat = list_utilities.alist_lookup_without_values(v_bindings_$6, POINT_LAT, UNPROVIDED, UNPROVIDED);
                final SubLObject point_long = list_utilities.alist_lookup_without_values(v_bindings_$6, POINT_LONG, UNPROVIDED, UNPROVIDED);
                final SubLObject num_point_long = quantities.cyc_quotient(point_long, $list68);
                final SubLObject num_point_lat = quantities.cyc_quotient(point_lat, $list68);
                final SubLObject num_point_alt = quantities.cyc_quotient(point_alt, $list68);
                final SubLObject num_point_time = quantities.cyc_quotient(point_time, $list69);
                final SubLObject num_curve_long = add(multiply(curve_long_3, expt(num_point_time, TWO_INTEGER)), multiply(curve_long_2, num_point_time), curve_long_0);
                final SubLObject num_curve_lat = add(multiply(curve_lat_3, expt(num_point_time, TWO_INTEGER)), multiply(curve_lat_2, num_point_time), curve_lat_0);
                final SubLObject num_curve_alt = add(multiply(curve_alt_3, expt(num_point_time, TWO_INTEGER)), multiply(curve_alt_2, num_point_time), curve_alt_0);
                return makeBoolean(((NIL != number_utilities.tolerance_E(num_point_long, num_curve_long, $quad_3d_tolerance_locat$.getGlobalValue())) && (NIL != number_utilities.tolerance_E(num_point_lat, num_curve_lat, $quad_3d_tolerance_locat$.getGlobalValue()))) && (NIL != number_utilities.tolerance_E(num_point_alt, num_curve_alt, $quad_3d_tolerance_locat$.getGlobalValue())));
            }
        }
        return NIL;
    }

    public static final SubLObject generate_projectile_trace_alt(SubLObject start_spec, SubLObject aim_spec, SubLObject shoot_spec, SubLObject trace_spec) {
        {
            SubLObject datum = start_spec;
            SubLObject current = datum;
            SubLObject start_long = NIL;
            SubLObject start_lat = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt71);
            start_long = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt71);
            start_lat = current.first();
            current = current.rest();
            {
                SubLObject start_alt = (current.isCons()) ? ((SubLObject) (current.first())) : ZERO_INTEGER;
                destructuring_bind_must_listp(current, datum, $list_alt71);
                current = current.rest();
                if (NIL == current) {
                    {
                        SubLObject datum_7 = aim_spec;
                        SubLObject current_8 = datum_7;
                        SubLObject aim_long = NIL;
                        SubLObject aim_lat = NIL;
                        SubLObject alt_angle = NIL;
                        destructuring_bind_must_consp(current_8, datum_7, $list_alt72);
                        aim_long = current_8.first();
                        current_8 = current_8.rest();
                        destructuring_bind_must_consp(current_8, datum_7, $list_alt72);
                        aim_lat = current_8.first();
                        current_8 = current_8.rest();
                        destructuring_bind_must_consp(current_8, datum_7, $list_alt72);
                        alt_angle = current_8.first();
                        current_8 = current_8.rest();
                        if (NIL == current_8) {
                            {
                                SubLObject datum_9 = shoot_spec;
                                SubLObject current_10 = datum_9;
                                SubLObject muzzle_vel = NIL;
                                destructuring_bind_must_consp(current_10, datum_9, $list_alt73);
                                muzzle_vel = current_10.first();
                                current_10 = current_10.rest();
                                {
                                    SubLObject start_time = (current_10.isCons()) ? ((SubLObject) (current_10.first())) : ZERO_INTEGER;
                                    destructuring_bind_must_listp(current_10, datum_9, $list_alt73);
                                    current_10 = current_10.rest();
                                    {
                                        SubLObject gravity = (current_10.isCons()) ? ((SubLObject) (current_10.first())) : $float$_9_8;
                                        destructuring_bind_must_listp(current_10, datum_9, $list_alt73);
                                        current_10 = current_10.rest();
                                        if (NIL == current_10) {
                                            {
                                                SubLObject datum_11 = trace_spec;
                                                SubLObject current_12 = datum_11;
                                                SubLObject trace_count = NIL;
                                                destructuring_bind_must_consp(current_12, datum_11, $list_alt75);
                                                trace_count = current_12.first();
                                                current_12 = current_12.rest();
                                                {
                                                    SubLObject trace_start = (current_12.isCons()) ? ((SubLObject) (current_12.first())) : start_time;
                                                    destructuring_bind_must_listp(current_12, datum_11, $list_alt75);
                                                    current_12 = current_12.rest();
                                                    {
                                                        SubLObject trace_freq = (current_12.isCons()) ? ((SubLObject) (current_12.first())) : ONE_INTEGER;
                                                        destructuring_bind_must_listp(current_12, datum_11, $list_alt75);
                                                        current_12 = current_12.rest();
                                                        if (NIL == current_12) {
                                                            {
                                                                SubLObject delta_long = subtract(aim_long, start_long);
                                                                SubLObject delta_lat = subtract(aim_lat, start_lat);
                                                                SubLObject delta_planar = sqrt(add(number_utilities.square(delta_long), number_utilities.square(delta_lat)));
                                                                SubLObject vel_alt = multiply(sin(alt_angle), muzzle_vel);
                                                                SubLObject vel_planar = multiply(cos(alt_angle), muzzle_vel);
                                                                SubLObject vel_long = multiply(vel_planar, divide(delta_long, delta_planar));
                                                                SubLObject vel_lat = multiply(vel_planar, divide(delta_lat, delta_planar));
                                                                SubLObject trace = NIL;
                                                                SubLObject trace_time = trace_start;
                                                                SubLObject i = NIL;
                                                                for (i = ZERO_INTEGER; i.numL(trace_count); i = add(i, ONE_INTEGER)) {
                                                                    {
                                                                        SubLObject shoot_time = subtract(trace_time, start_time);
                                                                        SubLObject trace_long = add(start_long, multiply(shoot_time, vel_long));
                                                                        SubLObject trace_lat = add(start_lat, multiply(shoot_time, vel_lat));
                                                                        SubLObject trace_alt = add(start_alt, multiply(shoot_time, vel_alt), multiply(number_utilities.square(shoot_time), gravity));
                                                                        trace = cons(list($$Point4Fn, list($$Meter, number_utilities.significant_digits(trace_long, FIVE_INTEGER)), list($$Meter, number_utilities.significant_digits(trace_lat, FIVE_INTEGER)), list($$Meter, number_utilities.significant_digits(trace_alt, FIVE_INTEGER)), list($$SecondsDuration, number_utilities.significant_digits(trace_time, FIVE_INTEGER))), trace);
                                                                    }
                                                                    trace_time = add(trace_time, trace_freq);
                                                                }
                                                                return nreverse(trace);
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum_11, $list_alt75);
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_9, $list_alt73);
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum_7, $list_alt72);
                        }
                    }
                } else {
                    cdestructuring_bind_error(datum, $list_alt71);
                }
            }
        }
        return NIL;
    }

    public static SubLObject generate_projectile_trace(final SubLObject start_spec, final SubLObject aim_spec, final SubLObject shoot_spec, final SubLObject trace_spec) {
        SubLObject start_long = NIL;
        SubLObject start_lat = NIL;
        destructuring_bind_must_consp(start_spec, start_spec, $list71);
        start_long = start_spec.first();
        SubLObject current = start_spec.rest();
        destructuring_bind_must_consp(current, start_spec, $list71);
        start_lat = current.first();
        current = current.rest();
        final SubLObject start_alt = (current.isCons()) ? current.first() : ZERO_INTEGER;
        destructuring_bind_must_listp(current, start_spec, $list71);
        current = current.rest();
        if (NIL == current) {
            SubLObject aim_long = NIL;
            SubLObject aim_lat = NIL;
            SubLObject alt_angle = NIL;
            destructuring_bind_must_consp(aim_spec, aim_spec, $list72);
            aim_long = aim_spec.first();
            SubLObject current_$8 = aim_spec.rest();
            destructuring_bind_must_consp(current_$8, aim_spec, $list72);
            aim_lat = current_$8.first();
            current_$8 = current_$8.rest();
            destructuring_bind_must_consp(current_$8, aim_spec, $list72);
            alt_angle = current_$8.first();
            current_$8 = current_$8.rest();
            if (NIL == current_$8) {
                SubLObject muzzle_vel = NIL;
                destructuring_bind_must_consp(shoot_spec, shoot_spec, $list73);
                muzzle_vel = shoot_spec.first();
                SubLObject current_$9 = shoot_spec.rest();
                final SubLObject start_time = (current_$9.isCons()) ? current_$9.first() : ZERO_INTEGER;
                destructuring_bind_must_listp(current_$9, shoot_spec, $list73);
                current_$9 = current_$9.rest();
                final SubLObject gravity = (current_$9.isCons()) ? current_$9.first() : $float$_9_8;
                destructuring_bind_must_listp(current_$9, shoot_spec, $list73);
                current_$9 = current_$9.rest();
                if (NIL == current_$9) {
                    SubLObject trace_count = NIL;
                    destructuring_bind_must_consp(trace_spec, trace_spec, $list75);
                    trace_count = trace_spec.first();
                    SubLObject current_$10 = trace_spec.rest();
                    final SubLObject trace_start = (current_$10.isCons()) ? current_$10.first() : start_time;
                    destructuring_bind_must_listp(current_$10, trace_spec, $list75);
                    current_$10 = current_$10.rest();
                    final SubLObject trace_freq = (current_$10.isCons()) ? current_$10.first() : ONE_INTEGER;
                    destructuring_bind_must_listp(current_$10, trace_spec, $list75);
                    current_$10 = current_$10.rest();
                    if (NIL == current_$10) {
                        final SubLObject delta_long = subtract(aim_long, start_long);
                        final SubLObject delta_lat = subtract(aim_lat, start_lat);
                        final SubLObject delta_planar = sqrt(add(number_utilities.square(delta_long), number_utilities.square(delta_lat)));
                        final SubLObject vel_alt = multiply(sin(alt_angle), muzzle_vel);
                        final SubLObject vel_planar = multiply(cos(alt_angle), muzzle_vel);
                        final SubLObject vel_long = multiply(vel_planar, divide(delta_long, delta_planar));
                        final SubLObject vel_lat = multiply(vel_planar, divide(delta_lat, delta_planar));
                        SubLObject trace = NIL;
                        SubLObject trace_time = trace_start;
                        SubLObject i;
                        SubLObject shoot_time;
                        SubLObject trace_long;
                        SubLObject trace_lat;
                        SubLObject trace_alt;
                        for (i = NIL, i = ZERO_INTEGER; i.numL(trace_count); i = add(i, ONE_INTEGER)) {
                            shoot_time = subtract(trace_time, start_time);
                            trace_long = add(start_long, multiply(shoot_time, vel_long));
                            trace_lat = add(start_lat, multiply(shoot_time, vel_lat));
                            trace_alt = add(start_alt, multiply(shoot_time, vel_alt), multiply(number_utilities.square(shoot_time), gravity));
                            trace = cons(list($$Point4Fn, list($$Meter, number_utilities.significant_digits(trace_long, FIVE_INTEGER)), list($$Meter, number_utilities.significant_digits(trace_lat, FIVE_INTEGER)), list($$Meter, number_utilities.significant_digits(trace_alt, FIVE_INTEGER)), list($$SecondsDuration, number_utilities.significant_digits(trace_time, FIVE_INTEGER))), trace);
                            trace_time = add(trace_time, trace_freq);
                        }
                        return nreverse(trace);
                    }
                    cdestructuring_bind_error(trace_spec, $list75);
                } else {
                    cdestructuring_bind_error(shoot_spec, $list73);
                }
            } else {
                cdestructuring_bind_error(aim_spec, $list72);
            }
        } else {
            cdestructuring_bind_error(start_spec, $list71);
        }
        return NIL;
    }

    public static final SubLObject acip_generate_test_suite_1_simulation_file_alt(SubLObject directory, SubLObject trace_count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(directory, DIRECTORY_P);
            SubLTrampolineFile.checkType(trace_count, NON_NEGATIVE_INTEGER_P);
            {
                SubLObject filename = format(NIL, $str_alt83$observations__3__0D, trace_count);
                SubLObject full_filename = file_utilities.relative_filename(directory, filename, $$$txt);
                SubLObject gravity = $float$_9_8;
                SubLObject start_time = ZERO_INTEGER;
                SubLObject start_long = $int$10000;
                SubLObject start_lat = ZERO_INTEGER;
                SubLObject start_alt = ZERO_INTEGER;
                SubLObject muzzle_vel = $int$800;
                SubLObject aim_long = ZERO_INTEGER;
                SubLObject aim_lat = ZERO_INTEGER;
                SubLObject alt_angle = $float$0_9272952180016123;
                SubLObject trace_start = ZERO_INTEGER;
                SubLObject trace_freq = ONE_INTEGER;
                SubLObject points = com.cyc.cycjava.cycl.acip.generate_projectile_trace(list(start_long, start_lat, start_alt), list(aim_long, aim_lat, alt_angle), list(muzzle_vel, start_time, gravity), list(trace_count, trace_start, trace_freq));
                SubLObject observations = com.cyc.cycjava.cycl.acip.acip_construct_single_sensor_observations($$ACIP_Radar_001, points);
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(full_filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt90$Unable_to_open__S, full_filename);
                    }
                    {
                        SubLObject stream_13 = stream;
                        {
                            SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                            try {
                                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                format(stream_13, $str_alt92$___ACIP_Defender_Observation_Simu);
                                format(stream_13, $str_alt93$_____Test_Suite_1__);
                                format(stream_13, $str_alt94$_______observations__________D_to, trace_count);
                                format(stream_13, $str_alt95$_______first_observation_____D_se, trace_start);
                                format(stream_13, $str_alt96$_______observation_freq______D_se, trace_freq);
                                {
                                    SubLObject cdolist_list_var = observations;
                                    SubLObject observation = NIL;
                                    for (observation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , observation = cdolist_list_var.first()) {
                                        terpri(stream_13);
                                        format_cycl_expression.format_cycl_expression(observation, stream_13, UNPROVIDED);
                                    }
                                }
                            } finally {
                                $read_default_float_format$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return full_filename;
            }
        }
    }

    public static SubLObject acip_generate_test_suite_1_simulation_file(final SubLObject directory, final SubLObject trace_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(directory) : "! Filesys.directory_p(directory) " + ("Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) ") + directory;
        assert NIL != subl_promotions.non_negative_integer_p(trace_count) : "! subl_promotions.non_negative_integer_p(trace_count) " + ("subl_promotions.non_negative_integer_p(trace_count) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(trace_count) ") + trace_count;
        final SubLObject filename = format(NIL, $str83$observations__3__0D, trace_count);
        final SubLObject full_filename = file_utilities.relative_filename(directory, filename, $$$txt);
        final SubLObject gravity = $float$_9_8;
        final SubLObject start_time = ZERO_INTEGER;
        final SubLObject start_long = $int$10000;
        final SubLObject start_lat = ZERO_INTEGER;
        final SubLObject start_alt = ZERO_INTEGER;
        final SubLObject muzzle_vel = $int$800;
        final SubLObject aim_long = ZERO_INTEGER;
        final SubLObject aim_lat = ZERO_INTEGER;
        final SubLObject alt_angle = $float$0_9272952180016123;
        final SubLObject trace_start = ZERO_INTEGER;
        final SubLObject trace_freq = ONE_INTEGER;
        final SubLObject points = generate_projectile_trace(list(start_long, start_lat, start_alt), list(aim_long, aim_lat, alt_angle), list(muzzle_vel, start_time, gravity), list(trace_count, trace_start, trace_freq));
        final SubLObject observations = acip_construct_single_sensor_observations($$ACIP_Radar_001, points);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(full_filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str90$Unable_to_open__S, full_filename);
            }
            final SubLObject stream_$13 = stream;
            final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
            try {
                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                format(stream_$13, $str92$___ACIP_Defender_Observation_Simu);
                format(stream_$13, $str93$_____Test_Suite_1__);
                format(stream_$13, $str94$_______observations__________D_to, trace_count);
                format(stream_$13, $str95$_______first_observation_____D_se, trace_start);
                format(stream_$13, $str96$_______observation_freq______D_se, trace_freq);
                SubLObject cdolist_list_var = observations;
                SubLObject observation = NIL;
                observation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    terpri(stream_$13);
                    format_cycl_expression.format_cycl_expression(observation, stream_$13, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    observation = cdolist_list_var.first();
                } 
            } finally {
                $read_default_float_format$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return full_filename;
    }

    public static final SubLObject acip_generate_test_suite_2_simulation_file_alt(SubLObject directory, SubLObject observation_count) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(directory, DIRECTORY_P);
            SubLTrampolineFile.checkType(observation_count, NON_NEGATIVE_INTEGER_P);
            {
                SubLObject filename = format(NIL, $str_alt83$observations__3__0D, observation_count);
                SubLObject full_filename = file_utilities.relative_filename(directory, filename, $$$txt);
                SubLObject gravity = $float$_9_8;
                SubLObject start_time = ZERO_INTEGER;
                SubLObject start_long = $int$10000;
                SubLObject start_lat = ZERO_INTEGER;
                SubLObject start_alt = ZERO_INTEGER;
                SubLObject muzzle_vel = $int$800;
                SubLObject aim_long = ZERO_INTEGER;
                SubLObject aim_lat = ZERO_INTEGER;
                SubLObject alt_angle = $float$0_9272952180016123;
                SubLObject impact_time = $float$65_3;
                SubLObject trace_count = observation_count;
                SubLObject trace_start = ZERO_INTEGER;
                SubLObject trace_freq = divide(impact_time, number_utilities.f_1_(trace_count));
                SubLObject trace_freq_to_use = (trace_freq.numG(ONE_INTEGER)) ? ((SubLObject) (truncate(trace_freq, UNPROVIDED))) : trace_freq;
                SubLObject points = com.cyc.cycjava.cycl.acip.generate_projectile_trace(list(start_long, start_lat, start_alt), list(aim_long, aim_lat, alt_angle), list(muzzle_vel, start_time, gravity), list(trace_count, trace_start, trace_freq_to_use));
                SubLObject observations = com.cyc.cycjava.cycl.acip.acip_construct_single_sensor_observations($$ACIP_Radar_001, points);
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(full_filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt90$Unable_to_open__S, full_filename);
                    }
                    {
                        SubLObject stream_14 = stream;
                        {
                            SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                            try {
                                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                format(stream_14, $str_alt92$___ACIP_Defender_Observation_Simu);
                                format(stream_14, $str_alt99$_____Test_Suite_2__);
                                format(stream_14, $str_alt94$_______observations__________D_to, trace_count);
                                format(stream_14, $str_alt95$_______first_observation_____D_se, trace_start);
                                format(stream_14, $str_alt100$_______observation_freq______S_se, number_utilities.four_significant_digits(trace_freq_to_use));
                                {
                                    SubLObject cdolist_list_var = observations;
                                    SubLObject observation = NIL;
                                    for (observation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , observation = cdolist_list_var.first()) {
                                        terpri(stream_14);
                                        format_cycl_expression.format_cycl_expression(observation, stream_14, UNPROVIDED);
                                    }
                                }
                            } finally {
                                $read_default_float_format$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return full_filename;
            }
        }
    }

    public static SubLObject acip_generate_test_suite_2_simulation_file(final SubLObject directory, final SubLObject observation_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(directory) : "! Filesys.directory_p(directory) " + ("Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) ") + directory;
        assert NIL != subl_promotions.non_negative_integer_p(observation_count) : "! subl_promotions.non_negative_integer_p(observation_count) " + ("subl_promotions.non_negative_integer_p(observation_count) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(observation_count) ") + observation_count;
        final SubLObject filename = format(NIL, $str83$observations__3__0D, observation_count);
        final SubLObject full_filename = file_utilities.relative_filename(directory, filename, $$$txt);
        final SubLObject gravity = $float$_9_8;
        final SubLObject start_time = ZERO_INTEGER;
        final SubLObject start_long = $int$10000;
        final SubLObject start_lat = ZERO_INTEGER;
        final SubLObject start_alt = ZERO_INTEGER;
        final SubLObject muzzle_vel = $int$800;
        final SubLObject aim_long = ZERO_INTEGER;
        final SubLObject aim_lat = ZERO_INTEGER;
        final SubLObject alt_angle = $float$0_9272952180016123;
        final SubLObject impact_time = $float$65_3;
        final SubLObject trace_start = ZERO_INTEGER;
        final SubLObject trace_freq = divide(impact_time, number_utilities.f_1_(observation_count));
        final SubLObject trace_freq_to_use = (trace_freq.numG(ONE_INTEGER)) ? truncate(trace_freq, UNPROVIDED) : trace_freq;
        final SubLObject points = generate_projectile_trace(list(start_long, start_lat, start_alt), list(aim_long, aim_lat, alt_angle), list(muzzle_vel, start_time, gravity), list(observation_count, trace_start, trace_freq_to_use));
        final SubLObject observations = acip_construct_single_sensor_observations($$ACIP_Radar_001, points);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(full_filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str90$Unable_to_open__S, full_filename);
            }
            final SubLObject stream_$14 = stream;
            final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
            try {
                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                format(stream_$14, $str92$___ACIP_Defender_Observation_Simu);
                format(stream_$14, $str99$_____Test_Suite_2__);
                format(stream_$14, $str94$_______observations__________D_to, observation_count);
                format(stream_$14, $str95$_______first_observation_____D_se, trace_start);
                format(stream_$14, $str100$_______observation_freq______S_se, number_utilities.four_significant_digits(trace_freq_to_use));
                SubLObject cdolist_list_var = observations;
                SubLObject observation = NIL;
                observation = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    terpri(stream_$14);
                    format_cycl_expression.format_cycl_expression(observation, stream_$14, UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    observation = cdolist_list_var.first();
                } 
            } finally {
                $read_default_float_format$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return full_filename;
    }

    public static final SubLObject acip_generate_test_suite_3_simulation_file_alt(SubLObject directory, SubLObject traces, SubLObject observations_per_trace) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(directory, DIRECTORY_P);
            SubLTrampolineFile.checkType(traces, NON_NEGATIVE_INTEGER_P);
            SubLTrampolineFile.checkType(observations_per_trace, NON_NEGATIVE_INTEGER_P);
            {
                SubLObject filename = format(NIL, $str_alt102$observations__2__0D__3__0D, traces, observations_per_trace);
                SubLObject full_filename = file_utilities.relative_filename(directory, filename, $$$txt);
                SubLObject gravity = $float$_9_8;
                SubLObject start_time = ZERO_INTEGER;
                SubLObject muzzle_vel = $int$800;
                SubLObject trace_count = observations_per_trace;
                SubLObject total_observations = multiply(traces, trace_count);
                SubLObject impact_time = $float$65_3;
                SubLObject trace_start = ZERO_INTEGER;
                SubLObject trace_freq = divide(impact_time, number_utilities.f_1_(trace_count));
                SubLObject trace_freq_to_use = (trace_freq.numG(ONE_INTEGER)) ? ((SubLObject) (truncate(trace_freq, UNPROVIDED))) : trace_freq;
                SubLObject observations = NIL;
                SubLObject trace_number = NIL;
                for (trace_number = ZERO_INTEGER; trace_number.numL(traces); trace_number = add(trace_number, ONE_INTEGER)) {
                    {
                        SubLObject trace_lat = add(multiply($int$100, expt(trace_number, TWO_INTEGER)), multiply($int$1000, trace_number));
                        SubLObject start_long = $int$10000;
                        SubLObject start_lat = trace_lat;
                        SubLObject start_alt = ZERO_INTEGER;
                        SubLObject aim_long = ZERO_INTEGER;
                        SubLObject aim_lat = trace_lat;
                        SubLObject alt_angle = $float$0_9272952180016123;
                        SubLObject points = com.cyc.cycjava.cycl.acip.generate_projectile_trace(list(start_long, start_lat, start_alt), list(aim_long, aim_lat, alt_angle), list(muzzle_vel, start_time, gravity), list(trace_count, trace_start, trace_freq_to_use));
                        SubLObject trace_observations = com.cyc.cycjava.cycl.acip.acip_construct_single_sensor_observations($$ACIP_Radar_001, points);
                        SubLObject cdolist_list_var = trace_observations;
                        SubLObject trace_observation = NIL;
                        for (trace_observation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , trace_observation = cdolist_list_var.first()) {
                            observations = cons(trace_observation, observations);
                        }
                    }
                }
                observations = Sort.sort(observations, symbol_function($sym105$ACIP_SUITE_3_OBSERVATION__), UNPROVIDED);
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_text(full_filename, $OUTPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt90$Unable_to_open__S, full_filename);
                        }
                        {
                            SubLObject stream_15 = stream;
                            {
                                SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                                try {
                                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                    format(stream_15, $str_alt92$___ACIP_Defender_Observation_Simu);
                                    format(stream_15, $str_alt106$_____Test_Suite_3__);
                                    format(stream_15, $str_alt107$_______traces________________D_to, traces);
                                    format(stream_15, $str_alt108$_______observations__________D_pe, observations_per_trace, total_observations);
                                    format(stream_15, $str_alt95$_______first_observation_____D_se, trace_start);
                                    format(stream_15, $str_alt100$_______observation_freq______S_se, number_utilities.four_significant_digits(trace_freq_to_use));
                                    {
                                        SubLObject cdolist_list_var = observations;
                                        SubLObject observation = NIL;
                                        for (observation = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , observation = cdolist_list_var.first()) {
                                            terpri(stream_15);
                                            format_cycl_expression.format_cycl_expression(observation, stream_15, UNPROVIDED);
                                        }
                                    }
                                } finally {
                                    $read_default_float_format$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return full_filename;
            }
        }
    }

    public static SubLObject acip_generate_test_suite_3_simulation_file(final SubLObject directory, final SubLObject traces, final SubLObject observations_per_trace) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != Filesys.directory_p(directory) : "! Filesys.directory_p(directory) " + ("Filesys.directory_p(directory) " + "CommonSymbols.NIL != Filesys.directory_p(directory) ") + directory;
        assert NIL != subl_promotions.non_negative_integer_p(traces) : "! subl_promotions.non_negative_integer_p(traces) " + ("subl_promotions.non_negative_integer_p(traces) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(traces) ") + traces;
        assert NIL != subl_promotions.non_negative_integer_p(observations_per_trace) : "! subl_promotions.non_negative_integer_p(observations_per_trace) " + ("subl_promotions.non_negative_integer_p(observations_per_trace) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(observations_per_trace) ") + observations_per_trace;
        final SubLObject filename = format(NIL, $str102$observations__2__0D__3__0D, traces, observations_per_trace);
        final SubLObject full_filename = file_utilities.relative_filename(directory, filename, $$$txt);
        final SubLObject gravity = $float$_9_8;
        final SubLObject start_time = ZERO_INTEGER;
        final SubLObject muzzle_vel = $int$800;
        final SubLObject total_observations = multiply(traces, observations_per_trace);
        final SubLObject impact_time = $float$65_3;
        final SubLObject trace_start = ZERO_INTEGER;
        final SubLObject trace_freq = divide(impact_time, number_utilities.f_1_(observations_per_trace));
        final SubLObject trace_freq_to_use = (trace_freq.numG(ONE_INTEGER)) ? truncate(trace_freq, UNPROVIDED) : trace_freq;
        SubLObject observations = NIL;
        SubLObject trace_number;
        SubLObject trace_lat;
        SubLObject start_long;
        SubLObject start_lat;
        SubLObject start_alt;
        SubLObject aim_long;
        SubLObject aim_lat;
        SubLObject alt_angle;
        SubLObject points;
        SubLObject cdolist_list_var;
        SubLObject trace_observations;
        SubLObject trace_observation;
        for (trace_number = NIL, trace_number = ZERO_INTEGER; trace_number.numL(traces); trace_number = add(trace_number, ONE_INTEGER)) {
            trace_lat = add(multiply($int$100, expt(trace_number, TWO_INTEGER)), multiply($int$1000, trace_number));
            start_long = $int$10000;
            start_lat = trace_lat;
            start_alt = ZERO_INTEGER;
            aim_long = ZERO_INTEGER;
            aim_lat = trace_lat;
            alt_angle = $float$0_9272952180016123;
            points = generate_projectile_trace(list(start_long, start_lat, start_alt), list(aim_long, aim_lat, alt_angle), list(muzzle_vel, start_time, gravity), list(observations_per_trace, trace_start, trace_freq_to_use));
            trace_observations = cdolist_list_var = acip_construct_single_sensor_observations($$ACIP_Radar_001, points);
            trace_observation = NIL;
            trace_observation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                observations = cons(trace_observation, observations);
                cdolist_list_var = cdolist_list_var.rest();
                trace_observation = cdolist_list_var.first();
            } 
        }
        observations = Sort.sort(observations, symbol_function($sym105$ACIP_SUITE_3_OBSERVATION__), UNPROVIDED);
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(full_filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str90$Unable_to_open__S, full_filename);
            }
            final SubLObject stream_$15 = stream;
            final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
            try {
                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                format(stream_$15, $str92$___ACIP_Defender_Observation_Simu);
                format(stream_$15, $str106$_____Test_Suite_3__);
                format(stream_$15, $str107$_______traces________________D_to, traces);
                format(stream_$15, $str108$_______observations__________D_pe, observations_per_trace, total_observations);
                format(stream_$15, $str95$_______first_observation_____D_se, trace_start);
                format(stream_$15, $str100$_______observation_freq______S_se, number_utilities.four_significant_digits(trace_freq_to_use));
                SubLObject cdolist_list_var2 = observations;
                SubLObject observation = NIL;
                observation = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    terpri(stream_$15);
                    format_cycl_expression.format_cycl_expression(observation, stream_$15, UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    observation = cdolist_list_var2.first();
                } 
            } finally {
                $read_default_float_format$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return full_filename;
    }

    public static final SubLObject acip_suite_3_observation_L_alt(SubLObject observation1, SubLObject observation2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject success = formula_pattern_match.formula_matches_pattern(observation1, $list_alt109);
                SubLObject v_bindings = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != success) {
                    {
                        SubLObject time_1 = list_utilities.alist_lookup_without_values(v_bindings, TIME_1, UNPROVIDED, UNPROVIDED);
                        SubLObject lat_1 = list_utilities.alist_lookup_without_values(v_bindings, LAT_1, UNPROVIDED, UNPROVIDED);
                        thread.resetMultipleValues();
                        {
                            SubLObject success_16 = formula_pattern_match.formula_matches_pattern(observation2, $list_alt112);
                            SubLObject v_bindings_17 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != success_16) {
                                {
                                    SubLObject time_2 = list_utilities.alist_lookup_without_values(v_bindings_17, TIME_2, UNPROVIDED, UNPROVIDED);
                                    SubLObject lat_2 = list_utilities.alist_lookup_without_values(v_bindings_17, LAT_2, UNPROVIDED, UNPROVIDED);
                                    if (time_1.numL(time_2)) {
                                        return T;
                                    } else {
                                        if (time_2.numL(time_1)) {
                                            return NIL;
                                        } else {
                                            if (lat_1.numL(lat_2)) {
                                                return T;
                                            } else {
                                                if (lat_2.numL(lat_1)) {
                                                    return NIL;
                                                } else {
                                                    return NIL;
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
            return NIL;
        }
    }

    public static SubLObject acip_suite_3_observation_L(final SubLObject observation1, final SubLObject observation2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(observation1, $list109);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject time_1 = list_utilities.alist_lookup_without_values(v_bindings, TIME_1, UNPROVIDED, UNPROVIDED);
            final SubLObject lat_1 = list_utilities.alist_lookup_without_values(v_bindings, LAT_1, UNPROVIDED, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject success_$16 = formula_pattern_match.formula_matches_pattern(observation2, $list112);
            final SubLObject v_bindings_$17 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != success_$16) {
                final SubLObject time_2 = list_utilities.alist_lookup_without_values(v_bindings_$17, TIME_2, UNPROVIDED, UNPROVIDED);
                final SubLObject lat_2 = list_utilities.alist_lookup_without_values(v_bindings_$17, LAT_2, UNPROVIDED, UNPROVIDED);
                if (time_1.numL(time_2)) {
                    return T;
                }
                if (time_2.numL(time_1)) {
                    return NIL;
                }
                if (lat_1.numL(lat_2)) {
                    return T;
                }
                if (lat_2.numL(lat_1)) {
                    return NIL;
                }
                return NIL;
            }
        }
        return NIL;
    }

    public static final SubLObject clear_defender_observation_mt_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $acip_defender_observation_mt$.getGlobalValue();
        }
        {
            SubLObject gafs = kb_mapping.gather_mt_index(mt);
            SubLObject total = ZERO_INTEGER;
            SubLObject cdolist_list_var = gafs;
            SubLObject gaf = NIL;
            for (gaf = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , gaf = cdolist_list_var.first()) {
                if ((NIL != assertions_high.asserted_assertionP(gaf)) && (NIL != assertion_handles.valid_assertionP(gaf, UNPROVIDED))) {
                    tms.tms_remove_assertion(gaf);
                    total = add(total, ONE_INTEGER);
                }
            }
            return total;
        }
    }

    public static SubLObject clear_defender_observation_mt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $acip_defender_observation_mt$.getGlobalValue();
        }
        final SubLObject gafs = kb_mapping.gather_mt_index(mt);
        SubLObject total = ZERO_INTEGER;
        SubLObject cdolist_list_var = gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != assertions_high.asserted_assertionP(gaf)) && (NIL != assertion_handles.valid_assertionP(gaf, UNPROVIDED))) {
                tms.tms_remove_assertion(gaf);
                total = add(total, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        return total;
    }

    /**
     * Run the ACIP Defender simulation based on the observations in SIMULATION-FILE.
     * TRACE-STREAM is a stream to which inference metrics are written by side-effect.
     * If TRACE-STREAM is nil, no metrics are written.
     * Return a list of tuples of the form (:PATH <path> :OBSERVATIONS <num>)
     * where <path> is a representative ballistic path that explains <num> observations.
     */
    @LispMethod(comment = "Run the ACIP Defender simulation based on the observations in SIMULATION-FILE.\r\nTRACE-STREAM is a stream to which inference metrics are written by side-effect.\r\nIf TRACE-STREAM is nil, no metrics are written.\r\nReturn a list of tuples of the form (:PATH <path> :OBSERVATIONS <num>)\r\nwhere <path> is a representative ballistic path that explains <num> observations.\nRun the ACIP Defender simulation based on the observations in SIMULATION-FILE.\nTRACE-STREAM is a stream to which inference metrics are written by side-effect.\nIf TRACE-STREAM is nil, no metrics are written.\nReturn a list of tuples of the form (:PATH <path> :OBSERVATIONS <num>)\nwhere <path> is a representative ballistic path that explains <num> observations.")
    public static final SubLObject acip_run_defender_simulation_file_alt(SubLObject simulation_file, SubLObject trace_stream) {
        if (trace_stream == UNPROVIDED) {
            trace_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject observations = com.cyc.cycjava.cycl.acip.acip_load_defender_observations(simulation_file);
            return com.cyc.cycjava.cycl.acip.acip_run_defender_simulation(observations, trace_stream);
        }
    }

    /**
     * Run the ACIP Defender simulation based on the observations in SIMULATION-FILE.
     * TRACE-STREAM is a stream to which inference metrics are written by side-effect.
     * If TRACE-STREAM is nil, no metrics are written.
     * Return a list of tuples of the form (:PATH <path> :OBSERVATIONS <num>)
     * where <path> is a representative ballistic path that explains <num> observations.
     */
    @LispMethod(comment = "Run the ACIP Defender simulation based on the observations in SIMULATION-FILE.\r\nTRACE-STREAM is a stream to which inference metrics are written by side-effect.\r\nIf TRACE-STREAM is nil, no metrics are written.\r\nReturn a list of tuples of the form (:PATH <path> :OBSERVATIONS <num>)\r\nwhere <path> is a representative ballistic path that explains <num> observations.\nRun the ACIP Defender simulation based on the observations in SIMULATION-FILE.\nTRACE-STREAM is a stream to which inference metrics are written by side-effect.\nIf TRACE-STREAM is nil, no metrics are written.\nReturn a list of tuples of the form (:PATH <path> :OBSERVATIONS <num>)\nwhere <path> is a representative ballistic path that explains <num> observations.")
    public static SubLObject acip_run_defender_simulation_file(final SubLObject simulation_file, SubLObject trace_stream) {
        if (trace_stream == UNPROVIDED) {
            trace_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject observations = acip_load_defender_observations(simulation_file);
        return acip_run_defender_simulation(observations, trace_stream);
    }

    public static final SubLObject acip_run_defender_simulation_alt(SubLObject observations, SubLObject trace_stream) {
        if (trace_stream == UNPROVIDED) {
            trace_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != trace_stream) {
                SubLTrampolineFile.checkType(trace_stream, STREAMP);
            }
            {
                SubLObject observation_mt = $acip_defender_observation_mt$.getGlobalValue();
                SubLObject running_result = NIL;
                SubLObject total_time = NIL;
                com.cyc.cycjava.cycl.acip.clear_defender_observation_mt(observation_mt);
                if (NIL != trace_stream) {
                    inference_metrics.reset_inference_metrics();
                }
                Storage.gc_ephemeral();
                {
                    SubLObject time_var = get_internal_real_time();
                    {
                        SubLObject list_var = observations;
                        $progress_note$.setDynamicValue($$$cdolist, thread);
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
                                    SubLObject observation = NIL;
                                    for (observation = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , observation = csome_list_var.first()) {
                                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                        {
                                            SubLObject _prev_bind_0_18 = forward.$assume_forward_deduction_is_wfP$.currentBinding(thread);
                                            SubLObject _prev_bind_1_19 = abnormal.$abnormality_transformation_depth$.currentBinding(thread);
                                            try {
                                                forward.$assume_forward_deduction_is_wfP$.bind(T, thread);
                                                abnormal.$abnormality_transformation_depth$.bind(TWO_INTEGER, thread);
                                                cyc_kernel.cyc_assert_wff(observation, observation_mt, UNPROVIDED);
                                            } finally {
                                                abnormal.$abnormality_transformation_depth$.rebind(_prev_bind_1_19, thread);
                                                forward.$assume_forward_deduction_is_wfP$.rebind(_prev_bind_0_18, thread);
                                            }
                                        }
                                        running_result = inference_kernel.new_cyc_query($list_alt120, $$ACIPDefenderModelMt, $list_alt122);
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
                    total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                if (NIL != trace_stream) {
                    terpri(trace_stream);
                    format(trace_stream, $str_alt123$__Total_time_____________________, number_utilities.significant_digits(total_time, FOUR_INTEGER));
                    inference_metrics.show_inference_metrics(trace_stream);
                    terpri(trace_stream);
                }
                return running_result;
            }
        }
    }

    public static SubLObject acip_run_defender_simulation(final SubLObject observations, SubLObject trace_stream) {
        if (trace_stream == UNPROVIDED) {
            trace_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != trace_stream) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == streamp(trace_stream))) {
            throw new AssertionError(trace_stream);
        }
        final SubLObject observation_mt = $acip_defender_observation_mt$.getGlobalValue();
        SubLObject running_result = NIL;
        SubLObject total_time = NIL;
        clear_defender_observation_mt(observation_mt);
        if (NIL != trace_stream) {
            inference_metrics.reset_inference_metrics();
        }
        Storage.gc_ephemeral();
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
            $progress_note$.bind($$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(observations), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = observations;
                SubLObject observation = NIL;
                observation = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject _prev_bind_0_$18 = forward.$assume_forward_deduction_is_wfP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = abnormal.$abnormality_transformation_depth$.currentBinding(thread);
                    try {
                        forward.$assume_forward_deduction_is_wfP$.bind(T, thread);
                        abnormal.$abnormality_transformation_depth$.bind(TWO_INTEGER, thread);
                        cyc_kernel.cyc_assert_wff(observation, observation_mt, UNPROVIDED);
                    } finally {
                        abnormal.$abnormality_transformation_depth$.rebind(_prev_bind_1_$19, thread);
                        forward.$assume_forward_deduction_is_wfP$.rebind(_prev_bind_0_$18, thread);
                    }
                    running_result = inference_kernel.new_cyc_query($list120, $$ACIPDefenderModelMt, $list122);
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    observation = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
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
        total_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (NIL != trace_stream) {
            terpri(trace_stream);
            format(trace_stream, $str123$__Total_time_____________________, number_utilities.significant_digits(total_time, FOUR_INTEGER));
            inference_metrics.show_inference_metrics(trace_stream);
            terpri(trace_stream);
        }
        return running_result;
    }

    public static final SubLObject acip_run_single_sensor_defender_simulation_alt(SubLObject sensor, SubLObject points, SubLObject trace_stream) {
        if (trace_stream == UNPROVIDED) {
            trace_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject observations = com.cyc.cycjava.cycl.acip.acip_construct_single_sensor_observations(sensor, points);
            return com.cyc.cycjava.cycl.acip.acip_run_defender_simulation(observations, trace_stream);
        }
    }

    public static SubLObject acip_run_single_sensor_defender_simulation(final SubLObject sensor, final SubLObject points, SubLObject trace_stream) {
        if (trace_stream == UNPROVIDED) {
            trace_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject observations = acip_construct_single_sensor_observations(sensor, points);
        return acip_run_defender_simulation(observations, trace_stream);
    }

    public static final SubLObject clear_acip_load_defender_observations_alt() {
        {
            SubLObject cs = $acip_load_defender_observations_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_acip_load_defender_observations() {
        final SubLObject cs = $acip_load_defender_observations_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_acip_load_defender_observations_alt(SubLObject simulation_file) {
        return memoization_state.caching_state_remove_function_results_with_args($acip_load_defender_observations_caching_state$.getGlobalValue(), list(simulation_file), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_acip_load_defender_observations(final SubLObject simulation_file) {
        return memoization_state.caching_state_remove_function_results_with_args($acip_load_defender_observations_caching_state$.getGlobalValue(), list(simulation_file), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject acip_load_defender_observations_internal_alt(SubLObject simulation_file) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(simulation_file, STRINGP);
            {
                SubLObject observations = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(simulation_file, $INPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt90$Unable_to_open__S, simulation_file);
                    }
                    {
                        SubLObject stream_20 = stream;
                        {
                            SubLObject _prev_bind_0 = $read_default_float_format$.currentBinding(thread);
                            try {
                                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                                {
                                    SubLObject observation = NIL;
                                    for (observation = read(stream_20, NIL, $EOF, UNPROVIDED); observation != $EOF; observation = read(stream_20, NIL, $EOF, UNPROVIDED)) {
                                        observations = cons(observation, observations);
                                    }
                                }
                            } finally {
                                $read_default_float_format$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(observations);
            }
        }
    }

    public static SubLObject acip_load_defender_observations_internal(final SubLObject simulation_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(simulation_file) : "! stringp(simulation_file) " + ("Types.stringp(simulation_file) " + "CommonSymbols.NIL != Types.stringp(simulation_file) ") + simulation_file;
        SubLObject observations = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(simulation_file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str90$Unable_to_open__S, simulation_file);
            }
            final SubLObject stream_$21 = stream;
            final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
            try {
                $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                SubLObject observation;
                for (observation = NIL, observation = read(stream_$21, NIL, $EOF, UNPROVIDED); observation != $EOF; observation = read(stream_$21, NIL, $EOF, UNPROVIDED)) {
                    observations = cons(observation, observations);
                }
            } finally {
                $read_default_float_format$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return nreverse(observations);
    }

    public static final SubLObject acip_load_defender_observations_alt(SubLObject simulation_file) {
        {
            SubLObject caching_state = $acip_load_defender_observations_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(ACIP_LOAD_DEFENDER_OBSERVATIONS, $acip_load_defender_observations_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, simulation_file, $kw129$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw129$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.acip.acip_load_defender_observations_internal(simulation_file)));
                    memoization_state.caching_state_put(caching_state, simulation_file, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject acip_load_defender_observations(final SubLObject simulation_file) {
        SubLObject caching_state = $acip_load_defender_observations_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ACIP_LOAD_DEFENDER_OBSERVATIONS, $acip_load_defender_observations_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, simulation_file, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(acip_load_defender_observations_internal(simulation_file)));
            memoization_state.caching_state_put(caching_state, simulation_file, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject acip_construct_single_sensor_observations_alt(SubLObject sensor, SubLObject points) {
        {
            SubLObject observations = NIL;
            SubLObject cdolist_list_var = points;
            SubLObject point = NIL;
            for (point = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , point = cdolist_list_var.first()) {
                {
                    SubLObject observation = make_binary_formula($$sensorObservation, sensor, point);
                    observations = cons(observation, observations);
                }
            }
            return nreverse(observations);
        }
    }

    public static SubLObject acip_construct_single_sensor_observations(final SubLObject sensor, final SubLObject points) {
        SubLObject observations = NIL;
        SubLObject cdolist_list_var = points;
        SubLObject point = NIL;
        point = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject observation = make_binary_formula($$sensorObservation, sensor, point);
            observations = cons(observation, observations);
            cdolist_list_var = cdolist_list_var.rest();
            point = cdolist_list_var.first();
        } 
        return nreverse(observations);
    }

    public static final SubLObject save_acip_partition_alt(SubLObject filename) {
        return partitions.save_partition(filename, $acip_partition$.getGlobalValue());
    }

    public static SubLObject save_acip_partition(final SubLObject filename) {
        return partitions.save_partition(filename, $acip_partition$.getGlobalValue());
    }

    /**
     * Return T off OBJECT is a supported ACIP subkernel.
     */
    @LispMethod(comment = "Return T off OBJECT is a supported ACIP subkernel.")
    public static final SubLObject acip_subkernel_p_alt(SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $acip_subkernels$.getGlobalValue());
    }

    /**
     * Return T off OBJECT is a supported ACIP subkernel.
     */
    @LispMethod(comment = "Return T off OBJECT is a supported ACIP subkernel.")
    public static SubLObject acip_subkernel_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, $acip_subkernels$.getGlobalValue());
    }

    /**
     * While evaluating BODY, save out by side-effect the ACIP subkernel
     * specified by SUBKERNEL into the filename specified by FILENAME.
     * The resulting file is suitable for input to ACIP-RUN-SUBKERNEL-SIMULATION.
     */
    @LispMethod(comment = "While evaluating BODY, save out by side-effect the ACIP subkernel\r\nspecified by SUBKERNEL into the filename specified by FILENAME.\r\nThe resulting file is suitable for input to ACIP-RUN-SUBKERNEL-SIMULATION.\nWhile evaluating BODY, save out by side-effect the ACIP subkernel\nspecified by SUBKERNEL into the filename specified by FILENAME.\nThe resulting file is suitable for input to ACIP-RUN-SUBKERNEL-SIMULATION.")
    public static final SubLObject with_acip_subkernel_extraction_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt135);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject allow_other_keys_p = NIL;
                    SubLObject rest = current;
                    SubLObject bad = NIL;
                    SubLObject current_21 = NIL;
                    for (; NIL != rest;) {
                        destructuring_bind_must_consp(rest, datum, $list_alt135);
                        current_21 = rest.first();
                        rest = rest.rest();
                        destructuring_bind_must_consp(rest, datum, $list_alt135);
                        if (NIL == member(current_21, $list_alt136, UNPROVIDED, UNPROVIDED)) {
                            bad = T;
                        }
                        if (current_21 == $ALLOW_OTHER_KEYS) {
                            allow_other_keys_p = rest.first();
                        }
                        rest = rest.rest();
                    }
                    if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                        cdestructuring_bind_error(datum, $list_alt135);
                    }
                    {
                        SubLObject subkernel_tail = property_list_member($SUBKERNEL, current);
                        SubLObject subkernel = (NIL != subkernel_tail) ? ((SubLObject) (cadr(subkernel_tail))) : NIL;
                        SubLObject filename_tail = property_list_member($FILENAME, current);
                        SubLObject filename = (NIL != filename_tail) ? ((SubLObject) (cadr(filename_tail))) : NIL;
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject subkernel_var = $sym140$SUBKERNEL_VAR;
                            SubLObject filename_var = $sym141$FILENAME_VAR;
                            SubLObject stream = $sym142$STREAM;
                            return list(CLET, list(list(subkernel_var, subkernel), list(filename_var, filename)), listS(CHECK_TYPE, subkernel_var, $list_alt145), listS(CHECK_TYPE, filename_var, $list_alt146), listS(CUNWIND_PROTECT, listS(WITH_PRIVATE_BINARY_FILE, listS(stream, filename_var, $list_alt149), list(CSETQ, $acip_subkernel_output_stream$, stream), list(CSETQ, $acip_subkernel_extraction$, subkernel_var), list(CFASL_OUTPUT, subkernel_var, stream), append(body, NIL)), $list_alt154));
                        }
                    }
                }
            }
        }
    }

    /**
     * While evaluating BODY, save out by side-effect the ACIP subkernel
     * specified by SUBKERNEL into the filename specified by FILENAME.
     * The resulting file is suitable for input to ACIP-RUN-SUBKERNEL-SIMULATION.
     */
    @LispMethod(comment = "While evaluating BODY, save out by side-effect the ACIP subkernel\r\nspecified by SUBKERNEL into the filename specified by FILENAME.\r\nThe resulting file is suitable for input to ACIP-RUN-SUBKERNEL-SIMULATION.\nWhile evaluating BODY, save out by side-effect the ACIP subkernel\nspecified by SUBKERNEL into the filename specified by FILENAME.\nThe resulting file is suitable for input to ACIP-RUN-SUBKERNEL-SIMULATION.")
    public static SubLObject with_acip_subkernel_extraction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list134);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$22 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list134);
            current_$22 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list134);
            if (NIL == member(current_$22, $list135, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$22 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list134);
        }
        final SubLObject subkernel_tail = property_list_member($SUBKERNEL, current);
        final SubLObject subkernel = (NIL != subkernel_tail) ? cadr(subkernel_tail) : NIL;
        final SubLObject filename_tail = property_list_member($FILENAME, current);
        final SubLObject filename = (NIL != filename_tail) ? cadr(filename_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject subkernel_var = $sym139$SUBKERNEL_VAR;
        final SubLObject filename_var = $sym140$FILENAME_VAR;
        final SubLObject stream = $sym141$STREAM;
        return list(CLET, list(list(subkernel_var, subkernel), list(filename_var, filename)), listS(CHECK_TYPE, subkernel_var, $list144), listS(CHECK_TYPE, filename_var, $list145), listS(CUNWIND_PROTECT, listS(WITH_PRIVATE_BINARY_FILE, listS(stream, filename_var, $list148), list(CSETQ, $acip_subkernel_output_stream$, stream), list(CSETQ, $acip_subkernel_extraction$, subkernel_var), list(CFASL_OUTPUT, subkernel_var, stream), append(body, NIL)), $list153));
    }

    /**
     * Run the ACIP subkernel simulation stored in FILENAME.
     *
     * @param SAMPLE-TRIALS
     * 		; the number of simulations to run and statistically sample
     * @param THROWAWAY-TRIALS
     * 		; the number of extra initial simulations to run but ignore
     * 		This is sometimes useful to eliminate the effects of paging.
     * @return 0 ; the median total time taken by the subkernel
     * @return 1 ; the mean total time taken by the subkernel
     * @return 2 ; the standard deviation in the total time taken by the subkernel.
     */
    @LispMethod(comment = "Run the ACIP subkernel simulation stored in FILENAME.\r\n\r\n@param SAMPLE-TRIALS\r\n\t\t; the number of simulations to run and statistically sample\r\n@param THROWAWAY-TRIALS\r\n\t\t; the number of extra initial simulations to run but ignore\r\n\t\tThis is sometimes useful to eliminate the effects of paging.\r\n@return 0 ; the median total time taken by the subkernel\r\n@return 1 ; the mean total time taken by the subkernel\r\n@return 2 ; the standard deviation in the total time taken by the subkernel.")
    public static final SubLObject acip_run_subkernel_simulation_alt(SubLObject filename, SubLObject sample_trials, SubLObject throwaway_trials) {
        if (sample_trials == UNPROVIDED) {
            sample_trials = ONE_INTEGER;
        }
        if (throwaway_trials == UNPROVIDED) {
            throwaway_trials = ZERO_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(filename, STRINGP);
            SubLTrampolineFile.checkType(sample_trials, POSITIVE_INTEGER_P);
            SubLTrampolineFile.checkType(throwaway_trials, NON_NEGATIVE_INTEGER_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == Filesys.probe_file(filename)) {
                    Errors.error($str_alt156$File__S_not_found_, filename);
                }
            }
            {
                SubLObject total_trials = add(throwaway_trials, sample_trials);
                SubLObject message = cconcatenate($str_alt157$Performing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(total_trials), $str_alt158$_trial, format_nil.format_nil_a_no_copy(total_trials.numG(ONE_INTEGER) ? ((SubLObject) ($$$s)) : $str_alt160$), $str_alt161$_of_subkernel });
                SubLObject trial_times = NIL;
                $progress_note$.setDynamicValue(message, thread);
                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                $progress_total$.setDynamicValue(total_trials, thread);
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
                            SubLObject trial = NIL;
                            for (trial = ZERO_INTEGER; trial.numL($progress_total$.getDynamicValue(thread)); trial = add(trial, ONE_INTEGER)) {
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                {
                                    SubLObject harness_time = com.cyc.cycjava.cycl.acip.acip_run_subkernel_simulation_int(filename, T);
                                    SubLObject simulation_time = com.cyc.cycjava.cycl.acip.acip_run_subkernel_simulation_int(filename, NIL);
                                    SubLObject trial_time = subtract(simulation_time, harness_time);
                                    if (!trial.numL(throwaway_trials)) {
                                        trial_times = cons(trial_time, trial_times);
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
                trial_times = nreverse(trial_times);
                {
                    SubLObject median = number_utilities.median(trial_times, UNPROVIDED);
                    thread.resetMultipleValues();
                    {
                        SubLObject stdev = number_utilities.standard_deviation(trial_times);
                        SubLObject mean = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        return values(median, mean, stdev);
                    }
                }
            }
        }
    }

    /**
     * Run the ACIP subkernel simulation stored in FILENAME.
     *
     * @param SAMPLE-TRIALS
     * 		; the number of simulations to run and statistically sample
     * @param THROWAWAY-TRIALS
     * 		; the number of extra initial simulations to run but ignore
     * 		This is sometimes useful to eliminate the effects of paging.
     * @return 0 ; the median total time taken by the subkernel
     * @return 1 ; the mean total time taken by the subkernel
     * @return 2 ; the standard deviation in the total time taken by the subkernel.
     */
    @LispMethod(comment = "Run the ACIP subkernel simulation stored in FILENAME.\r\n\r\n@param SAMPLE-TRIALS\r\n\t\t; the number of simulations to run and statistically sample\r\n@param THROWAWAY-TRIALS\r\n\t\t; the number of extra initial simulations to run but ignore\r\n\t\tThis is sometimes useful to eliminate the effects of paging.\r\n@return 0 ; the median total time taken by the subkernel\r\n@return 1 ; the mean total time taken by the subkernel\r\n@return 2 ; the standard deviation in the total time taken by the subkernel.")
    public static SubLObject acip_run_subkernel_simulation(final SubLObject filename, SubLObject sample_trials, SubLObject throwaway_trials) {
        if (sample_trials == UNPROVIDED) {
            sample_trials = ONE_INTEGER;
        }
        if (throwaway_trials == UNPROVIDED) {
            throwaway_trials = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        assert NIL != subl_promotions.positive_integer_p(sample_trials) : "! subl_promotions.positive_integer_p(sample_trials) " + ("subl_promotions.positive_integer_p(sample_trials) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(sample_trials) ") + sample_trials;
        assert NIL != subl_promotions.non_negative_integer_p(throwaway_trials) : "! subl_promotions.non_negative_integer_p(throwaway_trials) " + ("subl_promotions.non_negative_integer_p(throwaway_trials) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(throwaway_trials) ") + throwaway_trials;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == Filesys.probe_file(filename))) {
            Errors.error($str155$File__S_not_found_, filename);
        }
        final SubLObject total_trials = add(throwaway_trials, sample_trials);
        final SubLObject message = cconcatenate($$$Performing_, new SubLObject[]{ format_nil.format_nil_a_no_copy(total_trials), $$$_trial, format_nil.format_nil_a_no_copy(total_trials.numG(ONE_INTEGER) ? $$$s : $str159$), $$$_of_subkernel });
        SubLObject trial_times = NIL;
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
            $progress_total$.bind(total_trials, thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject trial;
                SubLObject harness_time;
                SubLObject simulation_time;
                SubLObject trial_time;
                for (trial = NIL, trial = ZERO_INTEGER; trial.numL($progress_total$.getDynamicValue(thread)); trial = add(trial, ONE_INTEGER)) {
                    harness_time = acip_run_subkernel_simulation_int(filename, T);
                    simulation_time = acip_run_subkernel_simulation_int(filename, NIL);
                    trial_time = subtract(simulation_time, harness_time);
                    if (!trial.numL(throwaway_trials)) {
                        trial_times = cons(trial_time, trial_times);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                }
            } finally {
                final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
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
        trial_times = nreverse(trial_times);
        final SubLObject median = number_utilities.median(trial_times, UNPROVIDED, UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject stdev = number_utilities.standard_deviation(trial_times);
        final SubLObject mean = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(median, mean, stdev);
    }

    public static final SubLObject acip_run_subkernel_simulation_int_alt(SubLObject filename, SubLObject harness_onlyP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject time = NIL;
                Storage.gc_ephemeral();
                {
                    SubLObject stream = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                            try {
                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                stream = compatibility.open_binary(filename, $INPUT, NIL);
                            } finally {
                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                            }
                        }
                        if (!stream.isStream()) {
                            Errors.error($str_alt90$Unable_to_open__S, filename);
                        }
                        {
                            SubLObject stream_22 = stream;
                            {
                                SubLObject _prev_bind_0 = $cfasl_stream_extensions_enabled$.currentBinding(thread);
                                SubLObject _prev_bind_1 = $cfasl_unread_byte$.currentBinding(thread);
                                try {
                                    $cfasl_stream_extensions_enabled$.bind(T, thread);
                                    $cfasl_unread_byte$.bind(NIL, thread);
                                    {
                                        SubLObject subkernel = cfasl_input(stream_22, UNPROVIDED, UNPROVIDED);
                                        SubLObject pcase_var = subkernel;
                                        if (pcase_var.eql($LIST_HASHING)) {
                                            {
                                                SubLObject time_var = get_internal_real_time();
                                                com.cyc.cycjava.cycl.acip.acip_run_subkernel_list_hashing(stream_22, harness_onlyP);
                                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                            }
                                        } else {
                                            if (pcase_var.eql($UNIFICATION)) {
                                                {
                                                    SubLObject time_var = get_internal_real_time();
                                                    com.cyc.cycjava.cycl.acip.acip_run_subkernel_unification(stream_22, harness_onlyP);
                                                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                }
                                            } else {
                                                if (pcase_var.eql($PATTERN_MATCH)) {
                                                    {
                                                        SubLObject time_var = get_internal_real_time();
                                                        com.cyc.cycjava.cycl.acip.acip_run_subkernel_pattern_match(stream_22, harness_onlyP);
                                                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                    }
                                                } else {
                                                    if (pcase_var.eql($TACTIC_GENERATION)) {
                                                        {
                                                            SubLObject time_var = get_internal_real_time();
                                                            com.cyc.cycjava.cycl.acip.acip_run_subkernel_tactic_generation(stream_22, harness_onlyP);
                                                            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                                                        }
                                                    } else {
                                                        Errors.error($str_alt166$Time_to_support__S_subkernel_, subkernel);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } finally {
                                    $cfasl_unread_byte$.rebind(_prev_bind_1, thread);
                                    $cfasl_stream_extensions_enabled$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream.isStream()) {
                                    close(stream, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return time;
            }
        }
    }

    public static SubLObject acip_run_subkernel_simulation_int(final SubLObject filename, final SubLObject harness_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject time = NIL;
        Storage.gc_ephemeral();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_binary(filename, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str90$Unable_to_open__S, filename);
            }
            final SubLObject stream_$24 = stream;
            final SubLObject _prev_bind_2 = $cfasl_stream_extensions_enabled$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $cfasl_unread_byte$.currentBinding(thread);
            try {
                $cfasl_stream_extensions_enabled$.bind(T, thread);
                $cfasl_unread_byte$.bind(NIL, thread);
                final SubLObject pcase_var;
                final SubLObject subkernel = pcase_var = cfasl_input(stream_$24, UNPROVIDED, UNPROVIDED);
                if (pcase_var.eql($LIST_HASHING)) {
                    final SubLObject time_var = get_internal_real_time();
                    acip_run_subkernel_list_hashing(stream_$24, harness_onlyP);
                    time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                } else
                    if (pcase_var.eql($UNIFICATION)) {
                        final SubLObject time_var = get_internal_real_time();
                        acip_run_subkernel_unification(stream_$24, harness_onlyP);
                        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    } else
                        if (pcase_var.eql($PATTERN_MATCH)) {
                            final SubLObject time_var = get_internal_real_time();
                            acip_run_subkernel_pattern_match(stream_$24, harness_onlyP);
                            time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                        } else
                            if (pcase_var.eql($TACTIC_GENERATION)) {
                                final SubLObject time_var = get_internal_real_time();
                                acip_run_subkernel_tactic_generation(stream_$24, harness_onlyP);
                                time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                            } else {
                                Errors.error($str165$Time_to_support__S_subkernel_, subkernel);
                            }



            } finally {
                $cfasl_unread_byte$.rebind(_prev_bind_3, thread);
                $cfasl_stream_extensions_enabled$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return time;
    }

    public static final SubLObject acip_note_subkernel_list_hashing_item_alt(SubLObject query, SubLObject store) {
        if (NIL != $acip_subkernel_output_stream$.getGlobalValue()) {
            {
                SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                SubLObject expected_sxhash = Sxhash.sxhash(query);
                cfasl_output(store_id, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(query, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(expected_sxhash, $acip_subkernel_output_stream$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject acip_note_subkernel_list_hashing_item(final SubLObject query, final SubLObject store) {
        if (NIL != $acip_subkernel_output_stream$.getGlobalValue()) {
            final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
            final SubLObject expected_sxhash = Sxhash.sxhash(query);
            cfasl_output(store_id, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(query, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(expected_sxhash, $acip_subkernel_output_stream$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject acip_run_subkernel_list_hashing_alt(SubLObject stream, SubLObject harness_onlyP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            while ($EOF != cfasl_opcode_peek(stream, NIL, $EOF)) {
                {
                    SubLObject store_id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject query = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject expected_sxhash = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject actual_sxhash = expected_sxhash;
                    if (NIL == harness_onlyP) {
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL($acip_subkernel_list_hashing_iteration_count$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                actual_sxhash = Sxhash.sxhash(query);
                            }
                        }
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!expected_sxhash.numE(actual_sxhash)) {
                            Errors.error($str_alt168$Actual_hash_code__S_differs_from_, actual_sxhash, expected_sxhash);
                        }
                    }
                }
            } 
            return NIL;
        }
    }

    public static SubLObject acip_run_subkernel_list_hashing(final SubLObject stream, final SubLObject harness_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while ($EOF != cfasl_opcode_peek(stream, NIL, $EOF)) {
            final SubLObject store_id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject query = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject actual_sxhash;
            final SubLObject expected_sxhash = actual_sxhash = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            if (NIL == harness_onlyP) {
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL($acip_subkernel_list_hashing_iteration_count$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    actual_sxhash = Sxhash.sxhash(query);
                }
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected_sxhash.numE(actual_sxhash))) {
                Errors.error($str167$Actual_hash_code__S_differs_from_, actual_sxhash, expected_sxhash);
            }
        } 
        return NIL;
    }

    public static final SubLObject acip_note_subkernel_unification_item_alt(SubLObject obj_trans, SubLObject obj, SubLObject share_varsP, SubLObject expected_bindings) {
        if (NIL != $acip_subkernel_output_stream$.getGlobalValue()) {
            {
                SubLObject current_problem = inference_worker.currently_active_problem();
                if (NIL != inference_datastructures_problem.problem_p(current_problem)) {
                    {
                        SubLObject store = inference_datastructures_problem.problem_store(current_problem);
                        SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                        SubLObject problem_id = inference_datastructures_problem.problem_suid(current_problem);
                        cfasl_output(store_id, $acip_subkernel_output_stream$.getGlobalValue());
                        cfasl_output(problem_id, $acip_subkernel_output_stream$.getGlobalValue());
                        cfasl_output(obj_trans, $acip_subkernel_output_stream$.getGlobalValue());
                        cfasl_output(obj, $acip_subkernel_output_stream$.getGlobalValue());
                        cfasl_output(share_varsP, $acip_subkernel_output_stream$.getGlobalValue());
                        cfasl_output(expected_bindings, $acip_subkernel_output_stream$.getGlobalValue());
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject acip_note_subkernel_unification_item(final SubLObject obj_trans, final SubLObject obj, final SubLObject share_varsP, final SubLObject expected_bindings) {
        if (NIL != $acip_subkernel_output_stream$.getGlobalValue()) {
            final SubLObject current_problem = inference_worker.currently_active_problem();
            if (NIL != inference_datastructures_problem.problem_p(current_problem)) {
                final SubLObject store = inference_datastructures_problem.problem_store(current_problem);
                final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                final SubLObject problem_id = inference_datastructures_problem.problem_suid(current_problem);
                cfasl_output(store_id, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(problem_id, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(obj_trans, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(obj, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(share_varsP, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(expected_bindings, $acip_subkernel_output_stream$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject acip_run_subkernel_unification_alt(SubLObject stream, SubLObject harness_onlyP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            while ($EOF != cfasl_opcode_peek(stream, NIL, $EOF)) {
                {
                    SubLObject store_id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject problem_id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject obj_trans = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject obj = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject share_varsP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject expected_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject actual_bindings = expected_bindings;
                    if (NIL == harness_onlyP) {
                        {
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL($acip_subkernel_unification_iteration_count$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                actual_bindings = unification.unify_assuming_bindings(obj_trans, obj, share_varsP, NIL, UNPROVIDED);
                            }
                        }
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!expected_bindings.equal(actual_bindings)) {
                            Errors.error($str_alt170$Actual_bindings__S_differs_from_e, actual_bindings, expected_bindings);
                        }
                    }
                }
            } 
            return NIL;
        }
    }

    public static SubLObject acip_run_subkernel_unification(final SubLObject stream, final SubLObject harness_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while ($EOF != cfasl_opcode_peek(stream, NIL, $EOF)) {
            final SubLObject store_id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject problem_id = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject obj_trans = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject obj = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject share_varsP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject actual_bindings;
            final SubLObject expected_bindings = actual_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            if (NIL == harness_onlyP) {
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL($acip_subkernel_unification_iteration_count$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                    actual_bindings = unification.unify_assuming_bindings(obj_trans, obj, share_varsP, NIL, UNPROVIDED);
                }
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected_bindings.equal(actual_bindings))) {
                Errors.error($str169$Actual_bindings__S_differs_from_e, actual_bindings, expected_bindings);
            }
        } 
        return NIL;
    }

    public static final SubLObject acip_note_subkernel_pattern_match_item_alt(SubLObject pattern, SubLObject formula, SubLObject with_bindingsP, SubLObject result, SubLObject v_bindings) {
        if (NIL != $acip_subkernel_output_stream$.getGlobalValue()) {
            cfasl_output(pattern, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(formula, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(with_bindingsP, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(result, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(v_bindings, $acip_subkernel_output_stream$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject acip_note_subkernel_pattern_match_item(final SubLObject pattern, final SubLObject formula, final SubLObject with_bindingsP, final SubLObject result, final SubLObject v_bindings) {
        if (NIL != $acip_subkernel_output_stream$.getGlobalValue()) {
            cfasl_output(pattern, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(formula, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(with_bindingsP, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(result, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(v_bindings, $acip_subkernel_output_stream$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject acip_run_subkernel_pattern_match_alt(SubLObject stream, SubLObject harness_onlyP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            while ($EOF != cfasl_opcode_peek(stream, NIL, $EOF)) {
                {
                    SubLObject pattern = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject formula = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject with_bindingsP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject expected_result = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject expected_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject actual_result = expected_result;
                    SubLObject actual_bindings = expected_bindings;
                    if (NIL == harness_onlyP) {
                        if (NIL != with_bindingsP) {
                            {
                                SubLObject i = NIL;
                                for (i = ZERO_INTEGER; i.numL($acip_subkernel_pattern_match_iteration_count$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject actual_result_23 = formula_pattern_match.pattern_matches_formula(pattern, formula);
                                        SubLObject actual_bindings_24 = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        actual_result = actual_result_23;
                                        actual_bindings = actual_bindings_24;
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject i = NIL;
                                for (i = ZERO_INTEGER; i.numL($acip_subkernel_pattern_match_iteration_count$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                    actual_result = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, formula);
                                }
                            }
                        }
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (expected_result != actual_result) {
                            Errors.error($str_alt171$Actual_result__S_differs_from_exp, actual_result, expected_result);
                        }
                    }
                    if (NIL != with_bindingsP) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!expected_bindings.equal(actual_bindings)) {
                                Errors.error($str_alt170$Actual_bindings__S_differs_from_e, actual_bindings, expected_bindings);
                            }
                        }
                    }
                }
            } 
            return NIL;
        }
    }

    public static SubLObject acip_run_subkernel_pattern_match(final SubLObject stream, final SubLObject harness_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while ($EOF != cfasl_opcode_peek(stream, NIL, $EOF)) {
            final SubLObject pattern = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject formula = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject with_bindingsP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject expected_result = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject expected_bindings = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject actual_result = expected_result;
            SubLObject actual_bindings = expected_bindings;
            if (NIL == harness_onlyP) {
                if (NIL != with_bindingsP) {
                    SubLObject i;
                    SubLObject actual_result_$25;
                    SubLObject actual_bindings_$26;
                    for (i = NIL, i = ZERO_INTEGER; i.numL($acip_subkernel_pattern_match_iteration_count$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                        thread.resetMultipleValues();
                        actual_result_$25 = formula_pattern_match.pattern_matches_formula(pattern, formula);
                        actual_bindings_$26 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        actual_result = actual_result_$25;
                        actual_bindings = actual_bindings_$26;
                    }
                } else {
                    SubLObject i;
                    for (i = NIL, i = ZERO_INTEGER; i.numL($acip_subkernel_pattern_match_iteration_count$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                        actual_result = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, formula);
                    }
                }
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected_result.eql(actual_result))) {
                Errors.error($str170$Actual_result__S_differs_from_exp, actual_result, expected_result);
            }
            if (((NIL != with_bindingsP) && (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))) && (!expected_bindings.equal(actual_bindings))) {
                Errors.error($str169$Actual_bindings__S_differs_from_e, actual_bindings, expected_bindings);
            }
        } 
        return NIL;
    }

    public static final SubLObject acip_note_subkernel_tactic_generation_item_alt(SubLObject hl_modules, SubLObject mt, SubLObject asent, SubLObject sense, SubLObject tactic_specs) {
        if (NIL != $acip_subkernel_output_stream$.getGlobalValue()) {
            {
                SubLObject encoded_hl_modules = com.cyc.cycjava.cycl.acip.acip_encode_hl_modules(hl_modules);
                SubLObject encoded_tactic_specs = com.cyc.cycjava.cycl.acip.acip_encode_tactic_specs(tactic_specs);
                cfasl_output(encoded_hl_modules, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(mt, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(asent, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(sense, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(NIL, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(T, $acip_subkernel_output_stream$.getGlobalValue());
                cfasl_output(encoded_tactic_specs, $acip_subkernel_output_stream$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject acip_note_subkernel_tactic_generation_item(final SubLObject hl_modules, final SubLObject mt, final SubLObject asent, final SubLObject sense, final SubLObject tactic_specs) {
        if (NIL != $acip_subkernel_output_stream$.getGlobalValue()) {
            final SubLObject encoded_hl_modules = acip_encode_hl_modules(hl_modules);
            final SubLObject encoded_tactic_specs = acip_encode_tactic_specs(tactic_specs);
            cfasl_output(encoded_hl_modules, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(mt, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(asent, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(sense, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(NIL, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(T, $acip_subkernel_output_stream$.getGlobalValue());
            cfasl_output(encoded_tactic_specs, $acip_subkernel_output_stream$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject acip_run_subkernel_tactic_generation_alt(SubLObject stream, SubLObject harness_onlyP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            while ($EOF != cfasl_opcode_peek(stream, NIL, $EOF)) {
                {
                    SubLObject encoded_hl_modules = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject mt = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject asent = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject sense = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject allow_last_resortP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject completeness_handlingP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject encoded_tactic_specs = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
                    SubLObject hl_modules = com.cyc.cycjava.cycl.acip.acip_ndecode_hl_modules(encoded_hl_modules);
                    SubLObject tactic_specs = com.cyc.cycjava.cycl.acip.acip_ndecode_tactic_specs(encoded_tactic_specs);
                    SubLObject expected_result = tactic_specs;
                    SubLObject actual_result = expected_result;
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            if (NIL == harness_onlyP) {
                                {
                                    SubLObject i = NIL;
                                    for (i = ZERO_INTEGER; i.numL($acip_subkernel_tactic_generation_iteration_count$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                                        actual_result = inference_worker_removal.determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (NIL == com.cyc.cycjava.cycl.acip.acip_equal_tactic_specs(expected_result, actual_result)) {
                            Errors.error($str_alt171$Actual_result__S_differs_from_exp, actual_result, expected_result);
                        }
                    }
                }
            } 
            return NIL;
        }
    }

    public static SubLObject acip_run_subkernel_tactic_generation(final SubLObject stream, final SubLObject harness_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while ($EOF != cfasl_opcode_peek(stream, NIL, $EOF)) {
            final SubLObject encoded_hl_modules = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject mt = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject asent = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject sense = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject allow_last_resortP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject completeness_handlingP = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject encoded_tactic_specs = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            final SubLObject hl_modules = acip_ndecode_hl_modules(encoded_hl_modules);
            final SubLObject tactic_specs = acip_ndecode_tactic_specs(encoded_tactic_specs);
            SubLObject actual_result;
            final SubLObject expected_result = actual_result = tactic_specs;
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                if (NIL == harness_onlyP) {
                    SubLObject i;
                    for (i = NIL, i = ZERO_INTEGER; i.numL($acip_subkernel_tactic_generation_iteration_count$.getDynamicValue(thread)); i = add(i, ONE_INTEGER)) {
                        actual_result = inference_worker_removal.determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
                    }
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == acip_equal_tactic_specs(expected_result, actual_result))) {
                Errors.error($str170$Actual_result__S_differs_from_exp, actual_result, expected_result);
            }
        } 
        return NIL;
    }

    public static final SubLObject acip_equal_tactic_specs_alt(SubLObject tactic_specs1, SubLObject tactic_specs2) {
        if (NIL == list_utilities.same_length_p(tactic_specs1, tactic_specs2)) {
            return NIL;
        }
        {
            SubLObject tactic_spec1 = NIL;
            SubLObject tactic_spec1_25 = NIL;
            SubLObject tactic_spec2 = NIL;
            SubLObject tactic_spec2_26 = NIL;
            for (tactic_spec1 = tactic_specs1, tactic_spec1_25 = tactic_spec1.first(), tactic_spec2 = tactic_specs2, tactic_spec2_26 = tactic_spec2.first(); !((NIL == tactic_spec2) && (NIL == tactic_spec1)); tactic_spec1 = tactic_spec1.rest() , tactic_spec1_25 = tactic_spec1.first() , tactic_spec2 = tactic_spec2.rest() , tactic_spec2_26 = tactic_spec2.first()) {
                if (NIL == com.cyc.cycjava.cycl.acip.acip_equal_tactic_spec(tactic_spec1_25, tactic_spec2_26)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    public static SubLObject acip_equal_tactic_specs(final SubLObject tactic_specs1, final SubLObject tactic_specs2) {
        if (NIL == list_utilities.same_length_p(tactic_specs1, tactic_specs2)) {
            return NIL;
        }
        SubLObject tactic_spec1 = NIL;
        SubLObject tactic_spec1_$27 = NIL;
        SubLObject tactic_spec2 = NIL;
        SubLObject tactic_spec2_$28 = NIL;
        tactic_spec1 = tactic_specs1;
        tactic_spec1_$27 = tactic_spec1.first();
        tactic_spec2 = tactic_specs2;
        tactic_spec2_$28 = tactic_spec2.first();
        while ((NIL != tactic_spec2) || (NIL != tactic_spec1)) {
            if (NIL == acip_equal_tactic_spec(tactic_spec1_$27, tactic_spec2_$28)) {
                return NIL;
            }
            tactic_spec1 = tactic_spec1.rest();
            tactic_spec1_$27 = tactic_spec1.first();
            tactic_spec2 = tactic_spec2.rest();
            tactic_spec2_$28 = tactic_spec2.first();
        } 
        return T;
    }

    public static final SubLObject acip_equal_tactic_spec_alt(SubLObject tactic_spec1, SubLObject tactic_spec2) {
        {
            SubLObject datum = tactic_spec1;
            SubLObject current = datum;
            SubLObject hl_module1 = NIL;
            SubLObject productivity1 = NIL;
            SubLObject completeness1 = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt172);
            hl_module1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt172);
            productivity1 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt172);
            completeness1 = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject datum_27 = tactic_spec2;
                    SubLObject current_28 = datum_27;
                    SubLObject hl_module2 = NIL;
                    SubLObject productivity2 = NIL;
                    SubLObject completeness2 = NIL;
                    destructuring_bind_must_consp(current_28, datum_27, $list_alt173);
                    hl_module2 = current_28.first();
                    current_28 = current_28.rest();
                    destructuring_bind_must_consp(current_28, datum_27, $list_alt173);
                    productivity2 = current_28.first();
                    current_28 = current_28.rest();
                    destructuring_bind_must_consp(current_28, datum_27, $list_alt173);
                    completeness2 = current_28.first();
                    current_28 = current_28.rest();
                    if (NIL == current_28) {
                        if (!(hl_module1.equal(hl_module2) && completeness1.equal(completeness2))) {
                            return NIL;
                        }
                        return makeBoolean(productivity1.equal(productivity2) || (NIL != list_utilities.member_eqP(inference_modules.hl_module_name(hl_module1), $list_alt174)));
                    } else {
                        cdestructuring_bind_error(datum_27, $list_alt173);
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt172);
            }
        }
        return NIL;
    }

    public static SubLObject acip_equal_tactic_spec(final SubLObject tactic_spec1, final SubLObject tactic_spec2) {
        SubLObject hl_module1 = NIL;
        SubLObject productivity1 = NIL;
        SubLObject completeness1 = NIL;
        destructuring_bind_must_consp(tactic_spec1, tactic_spec1, $list171);
        hl_module1 = tactic_spec1.first();
        SubLObject current = tactic_spec1.rest();
        destructuring_bind_must_consp(current, tactic_spec1, $list171);
        productivity1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, tactic_spec1, $list171);
        completeness1 = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject hl_module2 = NIL;
            SubLObject productivity2 = NIL;
            SubLObject completeness2 = NIL;
            destructuring_bind_must_consp(tactic_spec2, tactic_spec2, $list172);
            hl_module2 = tactic_spec2.first();
            SubLObject current_$30 = tactic_spec2.rest();
            destructuring_bind_must_consp(current_$30, tactic_spec2, $list172);
            productivity2 = current_$30.first();
            current_$30 = current_$30.rest();
            destructuring_bind_must_consp(current_$30, tactic_spec2, $list172);
            completeness2 = current_$30.first();
            current_$30 = current_$30.rest();
            if (NIL == current_$30) {
                if ((!hl_module1.equal(hl_module2)) || (!completeness1.equal(completeness2))) {
                    return NIL;
                }
                return makeBoolean(productivity1.equal(productivity2) || (NIL != list_utilities.member_eqP(inference_modules.hl_module_name(hl_module1), $list173)));
            } else {
                cdestructuring_bind_error(tactic_spec2, $list172);
            }
        } else {
            cdestructuring_bind_error(tactic_spec1, $list171);
        }
        return NIL;
    }

    static private final SubLList $list_alt7 = list(list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("X1")), list($BIND, makeSymbol("Y1"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("X2")), list($BIND, makeSymbol("Y2"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("X3")), list($BIND, makeSymbol("Y3"))));

    static private final SubLString $$$goolsbey = makeString("goolsbey");

    static private final SubLList $list_alt21 = list(list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(1000)), list(reader_make_constant_shell("TheList"), ONE_INTEGER, makeInteger(900)), list(reader_make_constant_shell("TheList"), TWO_INTEGER, makeInteger(800))), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(-100), makeInteger(1000))), list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), ONE_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), TWO_INTEGER, ZERO_INTEGER)), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER)), list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(1000)), list(reader_make_constant_shell("TheList"), ONE_INTEGER, makeInteger(1100)), list(reader_make_constant_shell("TheList"), TWO_INTEGER, makeInteger(1190))), list(reader_make_constant_shell("TheList"), makeInteger(-5), makeInteger(105), makeInteger(1000))), list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(10000)), list(reader_make_constant_shell("TheList"), ONE_INTEGER, makeInteger(9520)), list(reader_make_constant_shell("TheList"), TWO_INTEGER, makeInteger(9040))), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(-480), makeInteger(10000))), list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), ONE_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), TWO_INTEGER, ZERO_INTEGER)), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER)), list(list(list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), ONE_INTEGER, makeDouble(630.2)), list(reader_make_constant_shell("TheList"), TWO_INTEGER, makeDouble(1240.8))), list(reader_make_constant_shell("TheList"), makeDouble(-9.8), makeInteger(640), ZERO_INTEGER)));

    public static final SubLObject acip_encode_hl_modules_alt(SubLObject hl_modules) {
        return Mapping.mapcar(symbol_function(HL_MODULE_NAME), hl_modules);
    }

    public static SubLObject acip_encode_hl_modules(final SubLObject hl_modules) {
        return Mapping.mapcar(symbol_function(HL_MODULE_NAME), hl_modules);
    }

    public static final SubLObject acip_ndecode_hl_modules_alt(SubLObject encoded_hl_modules) {
        return list_utilities.nmapcar(symbol_function(FIND_HL_MODULE_BY_NAME), encoded_hl_modules);
    }

    public static SubLObject acip_ndecode_hl_modules(final SubLObject encoded_hl_modules) {
        return list_utilities.nmapcar(symbol_function(FIND_HL_MODULE_BY_NAME), encoded_hl_modules);
    }

    public static final SubLObject acip_encode_tactic_specs_alt(SubLObject tactic_specs) {
        {
            SubLObject encoded = NIL;
            SubLObject cdolist_list_var = tactic_specs;
            SubLObject tactic_spec = NIL;
            for (tactic_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tactic_spec = cdolist_list_var.first()) {
                {
                    SubLObject datum = tactic_spec;
                    SubLObject current = datum;
                    SubLObject hl_module = NIL;
                    SubLObject productivity = NIL;
                    SubLObject completeness = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt177);
                    hl_module = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt177);
                    productivity = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt177);
                    completeness = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        encoded = cons(list(inference_modules.hl_module_name(hl_module), productivity, completeness), encoded);
                    } else {
                        cdestructuring_bind_error(datum, $list_alt177);
                    }
                }
            }
            return nreverse(encoded);
        }
    }

    public static SubLObject acip_encode_tactic_specs(final SubLObject tactic_specs) {
        SubLObject encoded = NIL;
        SubLObject cdolist_list_var = tactic_specs;
        SubLObject tactic_spec = NIL;
        tactic_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tactic_spec;
            SubLObject hl_module = NIL;
            SubLObject productivity = NIL;
            SubLObject completeness = NIL;
            destructuring_bind_must_consp(current, datum, $list176);
            hl_module = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list176);
            productivity = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list176);
            completeness = current.first();
            current = current.rest();
            if (NIL == current) {
                encoded = cons(list(inference_modules.hl_module_name(hl_module), productivity, completeness), encoded);
            } else {
                cdestructuring_bind_error(datum, $list176);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic_spec = cdolist_list_var.first();
        } 
        return nreverse(encoded);
    }

    static private final SubLList $list_alt22 = listS(reader_make_constant_shell("Path4Fn"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    public static final SubLObject acip_ndecode_tactic_specs_alt(SubLObject encoded_tactic_specs) {
        {
            SubLObject cdolist_list_var = encoded_tactic_specs;
            SubLObject encoded_tactic_spec = NIL;
            for (encoded_tactic_spec = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , encoded_tactic_spec = cdolist_list_var.first()) {
                rplaca(encoded_tactic_spec, inference_modules.find_hl_module_by_name(encoded_tactic_spec.first()));
            }
        }
        return encoded_tactic_specs;
    }

    public static SubLObject acip_ndecode_tactic_specs(final SubLObject encoded_tactic_specs) {
        SubLObject cdolist_list_var = encoded_tactic_specs;
        SubLObject encoded_tactic_spec = NIL;
        encoded_tactic_spec = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rplaca(encoded_tactic_spec, inference_modules.find_hl_module_by_name(encoded_tactic_spec.first()));
            cdolist_list_var = cdolist_list_var.rest();
            encoded_tactic_spec = cdolist_list_var.first();
        } 
        return encoded_tactic_specs;
    }

    static private final SubLList $list_alt24 = cons(makeSymbol("PATH1-POINT"), makeSymbol("PATH1-REST-POINTS"));

    static private final SubLList $list_alt25 = cons(makeSymbol("PATH2-POINT"), makeSymbol("PATH2-REST-POINTS"));

    static private final SubLList $list_alt26 = list(reader_make_constant_shell("Point4Fn"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"), makeKeyword("ANYTHING"));

    public static final SubLObject run_acip_tests_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_test_case_tables($list_alt178, stream, $TERSE, UNPROVIDED);
    }

    public static SubLObject run_acip_tests(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return run_test_case_tables($list177, stream, $TERSE, UNPROVIDED);
    }

    static private final SubLList $list_alt27 = list(list(list(list(reader_make_constant_shell("Path4Fn"), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(1000)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(1000)), list(reader_make_constant_shell("SecondsDuration"), ZERO_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(900)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(1100)), list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER))), list(reader_make_constant_shell("Path4Fn"), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(1000)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(1000)), list(reader_make_constant_shell("SecondsDuration"), ZERO_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(900)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(1100)), list(reader_make_constant_shell("SecondsDuration"), TWO_INTEGER)))), T));

    public static SubLObject declare_acip_file() {
        declareFunction("cyc_list_of_2_real_numbers", "CYC-LIST-OF-2-REAL-NUMBERS", 1, 0, false);
        declareFunction("cyc_list_of_3_real_numbers", "CYC-LIST-OF-3-REAL-NUMBERS", 1, 0, false);
        declareFunction("cyc_point_4_time", "CYC-POINT-4-TIME", 1, 0, false);
        declareFunction("cyc_quad_coeff", "CYC-QUAD-COEFF", 3, 0, false);
        declareFunction("quad_coeff", "QUAD-COEFF", 3, 0, false);
        declareFunction("cyc_arbitrary_path_4d_ordering", "CYC-ARBITRARY-PATH-4D-ORDERING", 2, 0, false);
        declareFunction("cyc_arbitrary_path_4d_ordering_int", "CYC-ARBITRARY-PATH-4D-ORDERING-INT", 2, 0, false);
        declareFunction("cyc_arbitrary_path_point_4d_ordering", "CYC-ARBITRARY-PATH-POINT-4D-ORDERING", 2, 0, false);
        declareFunction("cyc_equals_quad_3d", "CYC-EQUALS-QUAD-3D", 2, 0, false);
        declareFunction("cyc_equals_quad_3d_int", "CYC-EQUALS-QUAD-3D-INT", 2, 0, false);
        declareFunction("cyc_point_matches_quad_3d", "CYC-POINT-MATCHES-QUAD-3D", 2, 0, false);
        declareFunction("cyc_point_matches_quad_3d_int", "CYC-POINT-MATCHES-QUAD-3D-INT", 2, 0, false);
        declareFunction("generate_projectile_trace", "GENERATE-PROJECTILE-TRACE", 4, 0, false);
        declareFunction("acip_generate_test_suite_1_simulation_file", "ACIP-GENERATE-TEST-SUITE-1-SIMULATION-FILE", 2, 0, false);
        declareFunction("acip_generate_test_suite_2_simulation_file", "ACIP-GENERATE-TEST-SUITE-2-SIMULATION-FILE", 2, 0, false);
        declareFunction("acip_generate_test_suite_3_simulation_file", "ACIP-GENERATE-TEST-SUITE-3-SIMULATION-FILE", 3, 0, false);
        declareFunction("acip_suite_3_observation_L", "ACIP-SUITE-3-OBSERVATION-<", 2, 0, false);
        declareFunction("clear_defender_observation_mt", "CLEAR-DEFENDER-OBSERVATION-MT", 0, 1, false);
        declareFunction("acip_run_defender_simulation_file", "ACIP-RUN-DEFENDER-SIMULATION-FILE", 1, 1, false);
        declareFunction("acip_run_defender_simulation", "ACIP-RUN-DEFENDER-SIMULATION", 1, 1, false);
        declareFunction("acip_run_single_sensor_defender_simulation", "ACIP-RUN-SINGLE-SENSOR-DEFENDER-SIMULATION", 2, 1, false);
        declareFunction("clear_acip_load_defender_observations", "CLEAR-ACIP-LOAD-DEFENDER-OBSERVATIONS", 0, 0, false);
        declareFunction("remove_acip_load_defender_observations", "REMOVE-ACIP-LOAD-DEFENDER-OBSERVATIONS", 1, 0, false);
        declareFunction("acip_load_defender_observations_internal", "ACIP-LOAD-DEFENDER-OBSERVATIONS-INTERNAL", 1, 0, false);
        declareFunction("acip_load_defender_observations", "ACIP-LOAD-DEFENDER-OBSERVATIONS", 1, 0, false);
        declareFunction("acip_construct_single_sensor_observations", "ACIP-CONSTRUCT-SINGLE-SENSOR-OBSERVATIONS", 2, 0, false);
        declareFunction("save_acip_partition", "SAVE-ACIP-PARTITION", 1, 0, false);
        declareFunction("acip_subkernel_p", "ACIP-SUBKERNEL-P", 1, 0, false);
        declareMacro("with_acip_subkernel_extraction", "WITH-ACIP-SUBKERNEL-EXTRACTION");
        declareFunction("acip_run_subkernel_simulation", "ACIP-RUN-SUBKERNEL-SIMULATION", 1, 2, false);
        declareFunction("acip_run_subkernel_simulation_int", "ACIP-RUN-SUBKERNEL-SIMULATION-INT", 2, 0, false);
        declareFunction("acip_note_subkernel_list_hashing_item", "ACIP-NOTE-SUBKERNEL-LIST-HASHING-ITEM", 2, 0, false);
        declareFunction("acip_run_subkernel_list_hashing", "ACIP-RUN-SUBKERNEL-LIST-HASHING", 2, 0, false);
        declareFunction("acip_note_subkernel_unification_item", "ACIP-NOTE-SUBKERNEL-UNIFICATION-ITEM", 4, 0, false);
        declareFunction("acip_run_subkernel_unification", "ACIP-RUN-SUBKERNEL-UNIFICATION", 2, 0, false);
        declareFunction("acip_note_subkernel_pattern_match_item", "ACIP-NOTE-SUBKERNEL-PATTERN-MATCH-ITEM", 5, 0, false);
        declareFunction("acip_run_subkernel_pattern_match", "ACIP-RUN-SUBKERNEL-PATTERN-MATCH", 2, 0, false);
        declareFunction("acip_note_subkernel_tactic_generation_item", "ACIP-NOTE-SUBKERNEL-TACTIC-GENERATION-ITEM", 5, 0, false);
        declareFunction("acip_run_subkernel_tactic_generation", "ACIP-RUN-SUBKERNEL-TACTIC-GENERATION", 2, 0, false);
        declareFunction("acip_equal_tactic_specs", "ACIP-EQUAL-TACTIC-SPECS", 2, 0, false);
        declareFunction("acip_equal_tactic_spec", "ACIP-EQUAL-TACTIC-SPEC", 2, 0, false);
        declareFunction("acip_encode_hl_modules", "ACIP-ENCODE-HL-MODULES", 1, 0, false);
        declareFunction("acip_ndecode_hl_modules", "ACIP-NDECODE-HL-MODULES", 1, 0, false);
        declareFunction("acip_encode_tactic_specs", "ACIP-ENCODE-TACTIC-SPECS", 1, 0, false);
        declareFunction("acip_ndecode_tactic_specs", "ACIP-NDECODE-TACTIC-SPECS", 1, 0, false);
        declareFunction("run_acip_tests", "RUN-ACIP-TESTS", 0, 1, false);
        return NIL;
    }

    static private final SubLList $list_alt28 = list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP"))), list(reader_make_constant_shell("TheList"), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP"))), list(reader_make_constant_shell("TheList"), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP")), list($TEST, makeSymbol("NUMBERP"))));

    static private final SubLList $list_alt31 = list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C1-LONG-2")), list($BIND, makeSymbol("C1-LONG-1")), list($BIND, makeSymbol("C1-LONG-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C1-LAT-2")), list($BIND, makeSymbol("C1-LAT-1")), list($BIND, makeSymbol("C1-LAT-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C1-ALT-2")), list($BIND, makeSymbol("C1-ALT-1")), list($BIND, makeSymbol("C1-ALT-0"))));

    static private final SubLList $list_alt41 = list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C2-LONG-2")), list($BIND, makeSymbol("C2-LONG-1")), list($BIND, makeSymbol("C2-LONG-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C2-LAT-2")), list($BIND, makeSymbol("C2-LAT-1")), list($BIND, makeSymbol("C2-LAT-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("C2-ALT-2")), list($BIND, makeSymbol("C2-ALT-1")), list($BIND, makeSymbol("C2-ALT-0"))));

    public static final SubLObject init_acip_file_alt() {
        deflexical("*QUAD-3D-TOLERANCE-ACCEL*", $float$0_1);
        deflexical("*QUAD-3D-TOLERANCE-VELOC*", ONE_INTEGER);
        deflexical("*QUAD-3D-TOLERANCE-LOCAT*", TEN_INTEGER);
        deflexical("*ACIP-DEFENDER-OBSERVATION-MT*", NIL != boundp($acip_defender_observation_mt$) ? ((SubLObject) ($acip_defender_observation_mt$.getGlobalValue())) : $$ACIPDefenderObservationMt);
        deflexical("*ACIP-LOAD-DEFENDER-OBSERVATIONS-CACHING-STATE*", NIL);
        deflexical("*ACIP-PARTITION*", $list_alt131);
        deflexical("*ACIP-BACKGROUND-PARTITION*", $list_alt133);
        deflexical("*ACIP-SUBKERNELS*", $list_alt134);
        defparameter("*ACIP-SUBKERNEL-LIST-HASHING-ITERATION-COUNT*", $int$2000);
        defparameter("*ACIP-SUBKERNEL-UNIFICATION-ITERATION-COUNT*", $int$200);
        defparameter("*ACIP-SUBKERNEL-PATTERN-MATCH-ITERATION-COUNT*", $int$200);
        defparameter("*ACIP-SUBKERNEL-TACTIC-GENERATION-ITERATION-COUNT*", $int$100);
        return NIL;
    }

    public static SubLObject init_acip_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*QUAD-3D-TOLERANCE-ACCEL*", $float$0_1);
            deflexical("*QUAD-3D-TOLERANCE-VELOC*", ONE_INTEGER);
            deflexical("*QUAD-3D-TOLERANCE-LOCAT*", TEN_INTEGER);
            deflexical("*ACIP-DEFENDER-OBSERVATION-MT*", SubLTrampolineFile.maybeDefault($acip_defender_observation_mt$, $acip_defender_observation_mt$, $$ACIPDefenderObservationMt));
            deflexical("*ACIP-LOAD-DEFENDER-OBSERVATIONS-CACHING-STATE*", NIL);
            deflexical("*ACIP-PARTITION*", $list130);
            deflexical("*ACIP-BACKGROUND-PARTITION*", $list132);
            deflexical("*ACIP-SUBKERNELS*", $list133);
            defparameter("*ACIP-SUBKERNEL-LIST-HASHING-ITERATION-COUNT*", $int$2000);
            defparameter("*ACIP-SUBKERNEL-UNIFICATION-ITERATION-COUNT*", $int$200);
            defparameter("*ACIP-SUBKERNEL-PATTERN-MATCH-ITERATION-COUNT*", $int$200);
            defparameter("*ACIP-SUBKERNEL-TACTIC-GENERATION-ITERATION-COUNT*", $int$100);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ACIP-DEFENDER-OBSERVATION-MT*", NIL != boundp($acip_defender_observation_mt$) ? ((SubLObject) ($acip_defender_observation_mt$.getGlobalValue())) : $$ACIPDefenderObservationMt);
            deflexical("*ACIP-PARTITION*", $list_alt131);
            deflexical("*ACIP-BACKGROUND-PARTITION*", $list_alt133);
            deflexical("*ACIP-SUBKERNELS*", $list_alt134);
        }
        return NIL;
    }

    public static SubLObject init_acip_file_Previous() {
        deflexical("*QUAD-3D-TOLERANCE-ACCEL*", $float$0_1);
        deflexical("*QUAD-3D-TOLERANCE-VELOC*", ONE_INTEGER);
        deflexical("*QUAD-3D-TOLERANCE-LOCAT*", TEN_INTEGER);
        deflexical("*ACIP-DEFENDER-OBSERVATION-MT*", SubLTrampolineFile.maybeDefault($acip_defender_observation_mt$, $acip_defender_observation_mt$, $$ACIPDefenderObservationMt));
        deflexical("*ACIP-LOAD-DEFENDER-OBSERVATIONS-CACHING-STATE*", NIL);
        deflexical("*ACIP-PARTITION*", $list130);
        deflexical("*ACIP-BACKGROUND-PARTITION*", $list132);
        deflexical("*ACIP-SUBKERNELS*", $list133);
        defparameter("*ACIP-SUBKERNEL-LIST-HASHING-ITERATION-COUNT*", $int$2000);
        defparameter("*ACIP-SUBKERNEL-UNIFICATION-ITERATION-COUNT*", $int$200);
        defparameter("*ACIP-SUBKERNEL-PATTERN-MATCH-ITERATION-COUNT*", $int$200);
        defparameter("*ACIP-SUBKERNEL-TACTIC-GENERATION-ITERATION-COUNT*", $int$100);
        return NIL;
    }

    static private final SubLList $list_alt51 = list(list(list(list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(-100), makeInteger(1000)), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), makeInteger(-5), makeInteger(105), makeInteger(1000))), list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), makeDouble(0.1), makeInteger(-101), makeInteger(1010)), list(reader_make_constant_shell("TheList"), makeDouble(0.1), ONE_INTEGER, TEN_INTEGER), list(reader_make_constant_shell("TheList"), makeDouble(-5.1), makeInteger(106), makeInteger(1010)))), T));

    public static final SubLObject setup_acip_file_alt() {
        register_kb_function(CYC_LIST_OF_2_REAL_NUMBERS);
        register_kb_function(CYC_LIST_OF_3_REAL_NUMBERS);
        register_kb_function(CYC_POINT_4_TIME);
        register_kb_function(CYC_QUAD_COEFF);
        define_test_case_table_int(CYC_QUAD_COEFF, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt21);
        register_kb_function(CYC_ARBITRARY_PATH_4D_ORDERING);
        define_test_case_table_int(CYC_ARBITRARY_PATH_4D_ORDERING, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt27);
        register_kb_function(CYC_EQUALS_QUAD_3D);
        define_test_case_table_int(CYC_EQUALS_QUAD_3D, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt51);
        register_kb_function(CYC_POINT_MATCHES_QUAD_3D);
        define_test_case_table_int(CYC_POINT_MATCHES_QUAD_3D, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt70);
        define_test_case_table_int(GENERATE_PROJECTILE_TRACE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt79);
        register_external_symbol(ACIP_GENERATE_TEST_SUITE_1_SIMULATION_FILE);
        register_external_symbol(ACIP_GENERATE_TEST_SUITE_2_SIMULATION_FILE);
        register_external_symbol(ACIP_GENERATE_TEST_SUITE_3_SIMULATION_FILE);
        note_funcall_helper_function($sym105$ACIP_SUITE_3_OBSERVATION__);
        declare_defglobal($acip_defender_observation_mt$);
        register_external_symbol(ACIP_RUN_DEFENDER_SIMULATION_FILE);
        memoization_state.note_globally_cached_function(ACIP_LOAD_DEFENDER_OBSERVATIONS);
        register_external_symbol(SAVE_ACIP_PARTITION);
        return NIL;
    }

    public static SubLObject setup_acip_file() {
        if (SubLFiles.USE_V1) {
            register_kb_function(CYC_LIST_OF_2_REAL_NUMBERS);
            register_kb_function(CYC_LIST_OF_3_REAL_NUMBERS);
            register_kb_function(CYC_POINT_4_TIME);
            register_kb_function(CYC_QUAD_COEFF);
            define_test_case_table_int(CYC_QUAD_COEFF, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list20);
            register_kb_function(CYC_ARBITRARY_PATH_4D_ORDERING);
            define_test_case_table_int(CYC_ARBITRARY_PATH_4D_ORDERING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list27);
            register_kb_function(CYC_EQUALS_QUAD_3D);
            define_test_case_table_int(CYC_EQUALS_QUAD_3D, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list51);
            register_kb_function(CYC_POINT_MATCHES_QUAD_3D);
            define_test_case_table_int(CYC_POINT_MATCHES_QUAD_3D, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list70);
            define_test_case_table_int(GENERATE_PROJECTILE_TRACE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list79);
            register_external_symbol(ACIP_GENERATE_TEST_SUITE_1_SIMULATION_FILE);
            register_external_symbol(ACIP_GENERATE_TEST_SUITE_2_SIMULATION_FILE);
            register_external_symbol(ACIP_GENERATE_TEST_SUITE_3_SIMULATION_FILE);
            note_funcall_helper_function($sym105$ACIP_SUITE_3_OBSERVATION__);
            declare_defglobal($acip_defender_observation_mt$);
            register_external_symbol(ACIP_RUN_DEFENDER_SIMULATION_FILE);
            memoization_state.note_globally_cached_function(ACIP_LOAD_DEFENDER_OBSERVATIONS);
            register_external_symbol(SAVE_ACIP_PARTITION);
        }
        if (SubLFiles.USE_V2) {
            define_test_case_table_int(CYC_QUAD_COEFF, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt21);
            define_test_case_table_int(CYC_ARBITRARY_PATH_4D_ORDERING, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt27);
            define_test_case_table_int(CYC_EQUALS_QUAD_3D, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt51);
            define_test_case_table_int(CYC_POINT_MATCHES_QUAD_3D, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt70);
            define_test_case_table_int(GENERATE_PROJECTILE_TRACE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt79);
        }
        return NIL;
    }

    public static SubLObject setup_acip_file_Previous() {
        register_kb_function(CYC_LIST_OF_2_REAL_NUMBERS);
        register_kb_function(CYC_LIST_OF_3_REAL_NUMBERS);
        register_kb_function(CYC_POINT_4_TIME);
        register_kb_function(CYC_QUAD_COEFF);
        define_test_case_table_int(CYC_QUAD_COEFF, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list20);
        register_kb_function(CYC_ARBITRARY_PATH_4D_ORDERING);
        define_test_case_table_int(CYC_ARBITRARY_PATH_4D_ORDERING, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list27);
        register_kb_function(CYC_EQUALS_QUAD_3D);
        define_test_case_table_int(CYC_EQUALS_QUAD_3D, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list51);
        register_kb_function(CYC_POINT_MATCHES_QUAD_3D);
        define_test_case_table_int(CYC_POINT_MATCHES_QUAD_3D, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list70);
        define_test_case_table_int(GENERATE_PROJECTILE_TRACE, list(new SubLObject[]{ $TEST, symbol_function(EQUAL), $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list79);
        register_external_symbol(ACIP_GENERATE_TEST_SUITE_1_SIMULATION_FILE);
        register_external_symbol(ACIP_GENERATE_TEST_SUITE_2_SIMULATION_FILE);
        register_external_symbol(ACIP_GENERATE_TEST_SUITE_3_SIMULATION_FILE);
        note_funcall_helper_function($sym105$ACIP_SUITE_3_OBSERVATION__);
        declare_defglobal($acip_defender_observation_mt$);
        register_external_symbol(ACIP_RUN_DEFENDER_SIMULATION_FILE);
        memoization_state.note_globally_cached_function(ACIP_LOAD_DEFENDER_OBSERVATIONS);
        register_external_symbol(SAVE_ACIP_PARTITION);
        return NIL;
    }

    static private final SubLList $list_alt53 = list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("CURVE-LONG-2")), list($BIND, makeSymbol("CURVE-LONG-1")), list($BIND, makeSymbol("CURVE-LONG-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("CURVE-LAT-2")), list($BIND, makeSymbol("CURVE-LAT-1")), list($BIND, makeSymbol("CURVE-LAT-0"))), list(reader_make_constant_shell("TheList"), list($BIND, makeSymbol("CURVE-ALT-2")), list($BIND, makeSymbol("CURVE-ALT-1")), list($BIND, makeSymbol("CURVE-ALT-0"))));

    @Override
    public void declareFunctions() {
        declare_acip_file();
    }

    static private final SubLList $list_alt63 = list(reader_make_constant_shell("Point4Fn"), list($BIND, makeSymbol("POINT-LONG")), list($BIND, makeSymbol("POINT-LAT")), list($BIND, makeSymbol("POINT-ALT")), list($BIND, makeSymbol("POINT-TIME")));

    @Override
    public void initializeVariables() {
        init_acip_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_acip_file();
    }

    static private final SubLList $list_alt68 = list(reader_make_constant_shell("Meter"), ONE_INTEGER);

    static private final SubLList $list_alt69 = list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER);

    static private final SubLList $list_alt70 = list(list(list(list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(910)), list(reader_make_constant_shell("Meter"), TEN_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(1110)), list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER)), list(reader_make_constant_shell("Quad3DFn"), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, makeInteger(-100), makeInteger(1000)), list(reader_make_constant_shell("TheList"), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER), list(reader_make_constant_shell("TheList"), makeInteger(-5), makeInteger(105), makeInteger(1000)))), T));

    static private final SubLList $list_alt71 = list(makeSymbol("START-LONG"), makeSymbol("START-LAT"), makeSymbol("&OPTIONAL"), list(makeSymbol("START-ALT"), ZERO_INTEGER));

    static private final SubLList $list_alt72 = list(makeSymbol("AIM-LONG"), makeSymbol("AIM-LAT"), makeSymbol("ALT-ANGLE"));

    static private final SubLList $list_alt73 = list(makeSymbol("MUZZLE-VEL"), makeSymbol("&OPTIONAL"), list(makeSymbol("START-TIME"), ZERO_INTEGER), list(makeSymbol("GRAVITY"), makeDouble(-9.8)));

    static private final SubLList $list_alt75 = list(makeSymbol("TRACE-COUNT"), makeSymbol("&OPTIONAL"), list(makeSymbol("TRACE-START"), makeSymbol("START-TIME")), list(makeSymbol("TRACE-FREQ"), ONE_INTEGER));

    static private final SubLList $list_alt79 = list(list(list(list(makeInteger(1000), ZERO_INTEGER, ZERO_INTEGER), list(ZERO_INTEGER, ZERO_INTEGER, makeDouble(0.8097835725701669)), list(makeInteger(145), ZERO_INTEGER, makeInteger(-5)), list(THREE_INTEGER, ZERO_INTEGER, ONE_INTEGER)), list(list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(1000)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("SecondsDuration"), ZERO_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(900)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(100)), list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(800)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeInteger(190)), list(reader_make_constant_shell("SecondsDuration"), TWO_INTEGER)))), list(list(list(makeInteger(10000), ZERO_INTEGER, ZERO_INTEGER), list(ZERO_INTEGER, ZERO_INTEGER, makeDouble(0.9272952180016123)), list(makeInteger(800), ZERO_INTEGER, makeDouble(-9.8)), list(THREE_INTEGER, ZERO_INTEGER, ONE_INTEGER)), list(list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(10000)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("SecondsDuration"), ZERO_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(9520)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeDouble(630.2)), list(reader_make_constant_shell("SecondsDuration"), ONE_INTEGER)), list(reader_make_constant_shell("Point4Fn"), list(reader_make_constant_shell("Meter"), makeInteger(9040)), list(reader_make_constant_shell("Meter"), ZERO_INTEGER), list(reader_make_constant_shell("Meter"), makeDouble(1240.8)), list(reader_make_constant_shell("SecondsDuration"), TWO_INTEGER)))));

    static private final SubLString $str_alt83$observations__3__0D = makeString("observations-~3,'0D");

    static private final SubLString $str_alt90$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt92$___ACIP_Defender_Observation_Simu = makeString(";; ACIP Defender Observation Simulation File");

    static private final SubLString $str_alt93$_____Test_Suite_1__ = makeString("~%;; Test Suite 1 :");

    static private final SubLString $str_alt94$_______observations__________D_to = makeString("~%;;   observations       : ~D total");

    static private final SubLString $str_alt95$_______first_observation_____D_se = makeString("~%;;   first observation  : ~D second~:P");

    static private final SubLString $str_alt96$_______observation_freq______D_se = makeString("~%;;   observation freq.  : ~D second~:P");

    static private final SubLString $str_alt99$_____Test_Suite_2__ = makeString("~%;; Test Suite 2 :");

    static private final SubLString $str_alt100$_______observation_freq______S_se = makeString("~%;;   observation freq.  : ~S second~:P");

    static private final SubLString $str_alt102$observations__2__0D__3__0D = makeString("observations-~2,'0D-~3,'0D");

    static private final SubLString $str_alt106$_____Test_Suite_3__ = makeString("~%;; Test Suite 3 :");

    static private final SubLString $str_alt107$_______traces________________D_to = makeString("~%;;   traces             : ~D total");

    static private final SubLString $str_alt108$_______observations__________D_pe = makeString("~%;;   observations       : ~D per trace, ~D total");

    static private final SubLList $list_alt109 = list(reader_make_constant_shell("sensorObservation"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("Point4Fn"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("Meter"), list($BIND, makeSymbol("LAT-1"))), makeKeyword("ANYTHING"), list(reader_make_constant_shell("SecondsDuration"), list($BIND, makeSymbol("TIME-1")))));

    static private final SubLList $list_alt112 = list(reader_make_constant_shell("sensorObservation"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("Point4Fn"), makeKeyword("ANYTHING"), list(reader_make_constant_shell("Meter"), list($BIND, makeSymbol("LAT-2"))), makeKeyword("ANYTHING"), list(reader_make_constant_shell("SecondsDuration"), list($BIND, makeSymbol("TIME-2")))));

    static private final SubLList $list_alt120 = list(reader_make_constant_shell("ballisticPathSensorCorroborationCount"), makeSymbol("?PATH"), makeSymbol("?NUM"));

    static private final SubLList $list_alt122 = list(makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, makeKeyword("PROBABLY-APPROXIMATELY-DONE"), makeDouble(1.0), makeKeyword("RETURN"), list(makeKeyword("TEMPLATE"), list($PATH, makeSymbol("?PATH"), makeKeyword("OBSERVATIONS"), makeSymbol("?NUM"))));

    static private final SubLString $str_alt123$__Total_time_____________________ = makeString("~%Total time                         : ~6,' D seconds");

    public static final SubLSymbol $kw129$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt131 = list(new SubLObject[]{ list($TERM, reader_make_constant_shell("ACIPWorldBackgroundMt")), list($TERM, reader_make_constant_shell("ACIPGameBackgroundMt")), list($TERM, reader_make_constant_shell("ACIPGameDataMt")), list($TERM, reader_make_constant_shell("ACIPDefenderTheoryMt")), list($TERM, reader_make_constant_shell("ACIPDefenderWorldStateMt")), list($TERM, reader_make_constant_shell("ACIPDefenderObservationMt")), list($TERM, reader_make_constant_shell("ACIPDefenderModelMt")), list($TERM, reader_make_constant_shell("ListOf2RealNumbers")), list($TERM, reader_make_constant_shell("ListOf3RealNumbers")), list($TERM, reader_make_constant_shell("Path-4D")), list($TERM, reader_make_constant_shell("Place-4D")), list($TERM, reader_make_constant_shell("QuadraticCurve-3D")), list($TERM, reader_make_constant_shell("RailroadGun")), list($TERM, reader_make_constant_shell("Dora-RailroadGun")), list($TERM, reader_make_constant_shell("Darla-RailroadGun")), list($TERM, reader_make_constant_shell("ANSPS-49-Radar")), list($TERM, reader_make_constant_shell("QuantityNumberFn")), list($TERM, reader_make_constant_shell("Point4Fn")), list($TERM, reader_make_constant_shell("Path4Fn")), list($TERM, reader_make_constant_shell("Quad3DFn")), list($TERM, reader_make_constant_shell("Point4TimeFn")), list($TERM, reader_make_constant_shell("QuadCoeffFn")), list($TERM, reader_make_constant_shell("arbitraryPath4DOrdering")), list($TERM, reader_make_constant_shell("ballisticPathSensorCorroborationCount")), list($TERM, reader_make_constant_shell("candidatePath")), list($TERM, reader_make_constant_shell("candidatePathTriple")), list($TERM, reader_make_constant_shell("equals-Quad3D")), list($TERM, reader_make_constant_shell("implausibleBallisticPathCoefficients")), list($TERM, reader_make_constant_shell("onBallisticPath")), list($TERM, reader_make_constant_shell("place4Altitude")), list($TERM, reader_make_constant_shell("place4Latitude")), list($TERM, reader_make_constant_shell("place4Longitude")), list($TERM, reader_make_constant_shell("place4Time")), list($TERM, reader_make_constant_shell("plausibleBallisticPath")), list($TERM, reader_make_constant_shell("point4LaterThan")), list($TERM, reader_make_constant_shell("pointMatchesQuad3D")), list($TERM, reader_make_constant_shell("representativeBallisticPath")), list($TERM, reader_make_constant_shell("sensorObservation")), list($TERM, reader_make_constant_shell("ACIP-Radar-001")) });

    static private final SubLList $list_alt133 = list(list($TERM, reader_make_constant_shell("Meter")), list($TERM, reader_make_constant_shell("SecondsDuration")));

    static private final SubLList $list_alt134 = list(makeKeyword("LIST-HASHING"), makeKeyword("UNIFICATION"), makeKeyword("PATTERN-MATCH"), makeKeyword("TACTIC-GENERATION"));

    static private final SubLList $list_alt135 = list(list(makeSymbol("&KEY"), makeSymbol("SUBKERNEL"), makeSymbol("FILENAME")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt136 = list(makeKeyword("SUBKERNEL"), makeKeyword("FILENAME"));

    static private final SubLSymbol $sym140$SUBKERNEL_VAR = makeUninternedSymbol("SUBKERNEL-VAR");

    static private final SubLSymbol $sym141$FILENAME_VAR = makeUninternedSymbol("FILENAME-VAR");

    static private final SubLSymbol $sym142$STREAM = makeUninternedSymbol("STREAM");

    static private final SubLList $list_alt145 = list(makeSymbol("ACIP-SUBKERNEL-P"));

    static private final SubLList $list_alt146 = list(makeSymbol("STRINGP"));

    static private final SubLList $list_alt149 = list(makeKeyword("OUTPUT"));

    static private final SubLList $list_alt154 = list(list(makeSymbol("CSETQ"), makeSymbol("*ACIP-SUBKERNEL-OUTPUT-STREAM*"), NIL), list(makeSymbol("CSETQ"), makeSymbol("*ACIP-SUBKERNEL-EXTRACTION*"), NIL));

    static private final SubLString $str_alt156$File__S_not_found_ = makeString("File ~S not found.");

    static private final SubLString $str_alt157$Performing_ = makeString("Performing ");

    static private final SubLString $str_alt158$_trial = makeString(" trial");

    static private final SubLString $str_alt161$_of_subkernel = makeString(" of subkernel");

    static private final SubLString $str_alt166$Time_to_support__S_subkernel_ = makeString("Time to support ~S subkernel.");

    static private final SubLString $str_alt168$Actual_hash_code__S_differs_from_ = makeString("Actual hash code ~S differs from expected hash code ~S");

    static private final SubLString $str_alt170$Actual_bindings__S_differs_from_e = makeString("Actual bindings ~S differs from expected bindings ~S");

    static private final SubLString $str_alt171$Actual_result__S_differs_from_exp = makeString("Actual result ~S differs from expected result ~S");

    static private final SubLList $list_alt172 = list(makeSymbol("HL-MODULE1"), makeSymbol("PRODUCTIVITY1"), makeSymbol("COMPLETENESS1"));

    static private final SubLList $list_alt173 = list(makeSymbol("HL-MODULE2"), makeSymbol("PRODUCTIVITY2"), makeSymbol("COMPLETENESS2"));

    static private final SubLList $list_alt174 = list(makeKeyword("REMOVAL-LOOKUP-POS"));

    static private final SubLList $list_alt177 = list(makeSymbol("HL-MODULE"), makeSymbol("PRODUCTIVITY"), makeSymbol("COMPLETENESS"));

    static private final SubLList $list_alt178 = list(makeSymbol("CYC-QUAD-COEFF"), makeSymbol("CYC-ARBITRARY-PATH-4D-ORDERING"), makeSymbol("CYC-EQUALS-QUAD-3D"), makeSymbol("CYC-POINT-MATCHES-QUAD-3D"), makeSymbol("GENERATE-PROJECTILE-TRACE"));
}

/**
 * Total time: 573 ms synthetic
 */
