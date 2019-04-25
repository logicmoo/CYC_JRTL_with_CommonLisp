package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cyc_testing.generic_testing;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.inference_worker_removal;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem;
import com.cyc.cycjava.cycl.inference.harness.inference_worker;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.cycjava.cycl.inference.harness.inference_kernel;
import com.cyc.cycjava.cycl.inference.harness.abnormal;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.cycjava.cycl.inference.harness.inference_metrics;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class acip extends SubLTranslatedFile
{
    public static final SubLFile me = new acip();
    public static final String myName = "com.cyc.cycjava.cycl.acip";
    public static final String myFingerPrint = "e2534fad98c1109e686035d0743e4ae0f155d482c511bb9310af394e84a1f8db";
    private static SubLSymbol $quad_3d_tolerance_accel$ = null;
    private static SubLSymbol $quad_3d_tolerance_veloc$ = null;
    private static SubLSymbol $quad_3d_tolerance_locat$ = null;
    public static SubLSymbol $acip_defender_observation_mt$ = null;
    private static SubLSymbol $acip_load_defender_observations_caching_state$ = null;
    private static SubLSymbol $acip_partition$ = null;
    private static SubLSymbol $acip_background_partition$ = null;
    private static SubLSymbol $acip_subkernels$ = null;
    public static SubLSymbol $acip_subkernel_list_hashing_iteration_count$ = null;
    public static SubLSymbol $acip_subkernel_unification_iteration_count$ = null;
    public static SubLSymbol $acip_subkernel_pattern_match_iteration_count$ = null;
    public static SubLSymbol $acip_subkernel_tactic_generation_iteration_count$ = null;
    private static final SubLSymbol $sym0$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
    private static final SubLSymbol $sym1$CYC_LIST_OF_2_REAL_NUMBERS = SubLObjectFactory.makeSymbol("CYC-LIST-OF-2-REAL-NUMBERS");
    private static final SubLSymbol $sym2$CYC_LIST_OF_3_REAL_NUMBERS = SubLObjectFactory.makeSymbol("CYC-LIST-OF-3-REAL-NUMBERS");
    private static final SubLObject $const3$Point4Fn = constant_handles.reader_make_constant_shell(("Point4Fn"));
    private static final SubLSymbol $sym4$CYC_POINT_4_TIME = SubLObjectFactory.makeSymbol("CYC-POINT-4-TIME");
    private static final SubLSymbol $sym5$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
    private static final SubLSymbol $sym6$CYC_QUAD_COEFF = SubLObjectFactory.makeSymbol("CYC-QUAD-COEFF");
    private static final SubLList $list7 = ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("X1")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("Y1"))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("X2")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("Y2"))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("X3")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("Y3"))));
    private static final SubLSymbol $sym8$Y3 = SubLObjectFactory.makeSymbol("Y3");
    private static final SubLSymbol $sym9$X3 = SubLObjectFactory.makeSymbol("X3");
    private static final SubLSymbol $sym10$Y2 = SubLObjectFactory.makeSymbol("Y2");
    private static final SubLSymbol $sym11$X2 = SubLObjectFactory.makeSymbol("X2");
    private static final SubLSymbol $sym12$Y1 = SubLObjectFactory.makeSymbol("Y1");
    private static final SubLSymbol $sym13$X1 = SubLObjectFactory.makeSymbol("X1");
    private static final SubLSymbol $kw14$TEST = SubLObjectFactory.makeKeyword("TEST");
    private static final SubLSymbol $kw15$OWNER = SubLObjectFactory.makeKeyword("OWNER");
    private static final SubLSymbol $kw16$CLASSES = SubLObjectFactory.makeKeyword("CLASSES");
    private static final SubLSymbol $kw17$KB = SubLObjectFactory.makeKeyword("KB");
    private static final SubLSymbol $kw18$TINY = SubLObjectFactory.makeKeyword("TINY");
    private static final SubLSymbol $kw19$WORKING_ = SubLObjectFactory.makeKeyword("WORKING?");
    private static final SubLList $list20;
    private static final SubLList $list21 = ConsesLow.listS(constant_handles.reader_make_constant_shell(("Path4Fn")), SubLObjectFactory.makeKeyword("ANYTHING"), SubLObjectFactory.makeKeyword("ANYTHING"), SubLObjectFactory.makeKeyword("ANYTHING"));
    private static final SubLSymbol $sym22$CYC_ARBITRARY_PATH_4D_ORDERING = SubLObjectFactory.makeSymbol("CYC-ARBITRARY-PATH-4D-ORDERING");
    private static final SubLList $list23 = ConsesLow.cons(SubLObjectFactory.makeSymbol("PATH1-POINT"), SubLObjectFactory.makeSymbol("PATH1-REST-POINTS"));
    private static final SubLList $list24 = ConsesLow.cons(SubLObjectFactory.makeSymbol("PATH2-POINT"), SubLObjectFactory.makeSymbol("PATH2-REST-POINTS"));
    private static final SubLList $list25 = ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), SubLObjectFactory.makeKeyword("ANYTHING"), SubLObjectFactory.makeKeyword("ANYTHING"), SubLObjectFactory.makeKeyword("ANYTHING"), SubLObjectFactory.makeKeyword("ANYTHING"));
    private static final SubLSymbol $kw26$FULL = SubLObjectFactory.makeKeyword("FULL");
    private static final SubLList $list27;
    private static final SubLList $list28 = ConsesLow.list(constant_handles.reader_make_constant_shell(("Quad3DFn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("TEST"), SubLObjectFactory.makeSymbol("NUMBERP")), ConsesLow.list(SubLObjectFactory.makeKeyword("TEST"), SubLObjectFactory.makeSymbol("NUMBERP")), ConsesLow.list(SubLObjectFactory.makeKeyword("TEST"), SubLObjectFactory.makeSymbol("NUMBERP"))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("TEST"), SubLObjectFactory.makeSymbol("NUMBERP")), ConsesLow.list(SubLObjectFactory.makeKeyword("TEST"), SubLObjectFactory.makeSymbol("NUMBERP")), ConsesLow.list(SubLObjectFactory.makeKeyword("TEST"), SubLObjectFactory.makeSymbol("NUMBERP"))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("TEST"), SubLObjectFactory.makeSymbol("NUMBERP")), ConsesLow.list(SubLObjectFactory.makeKeyword("TEST"), SubLObjectFactory.makeSymbol("NUMBERP")), ConsesLow.list(SubLObjectFactory.makeKeyword("TEST"), SubLObjectFactory.makeSymbol("NUMBERP"))));
    private static final SubLSymbol $sym29$CYC_EQUALS_QUAD_3D = SubLObjectFactory.makeSymbol("CYC-EQUALS-QUAD-3D");
    private static final SubLFloat $float30$0_1 = SubLObjectFactory.makeDouble(0.10000000000000001D);
    private static final SubLList $list31 = ConsesLow.list(constant_handles.reader_make_constant_shell(("Quad3DFn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C1-LONG-2")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C1-LONG-1")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C1-LONG-0"))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C1-LAT-2")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C1-LAT-1")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C1-LAT-0"))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C1-ALT-2")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C1-ALT-1")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C1-ALT-0"))));
    private static final SubLSymbol $sym32$C1_ALT_0 = SubLObjectFactory.makeSymbol("C1-ALT-0");
    private static final SubLSymbol $sym33$C1_ALT_1 = SubLObjectFactory.makeSymbol("C1-ALT-1");
    private static final SubLSymbol $sym34$C1_ALT_2 = SubLObjectFactory.makeSymbol("C1-ALT-2");
    private static final SubLSymbol $sym35$C1_LAT_0 = SubLObjectFactory.makeSymbol("C1-LAT-0");
    private static final SubLSymbol $sym36$C1_LAT_1 = SubLObjectFactory.makeSymbol("C1-LAT-1");
    private static final SubLSymbol $sym37$C1_LAT_2 = SubLObjectFactory.makeSymbol("C1-LAT-2");
    private static final SubLSymbol $sym38$C1_LONG_0 = SubLObjectFactory.makeSymbol("C1-LONG-0");
    private static final SubLSymbol $sym39$C1_LONG_1 = SubLObjectFactory.makeSymbol("C1-LONG-1");
    private static final SubLSymbol $sym40$C1_LONG_2 = SubLObjectFactory.makeSymbol("C1-LONG-2");
    private static final SubLList $list41 = ConsesLow.list(constant_handles.reader_make_constant_shell(("Quad3DFn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C2-LONG-2")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C2-LONG-1")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C2-LONG-0"))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C2-LAT-2")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C2-LAT-1")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C2-LAT-0"))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C2-ALT-2")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C2-ALT-1")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("C2-ALT-0"))));
    private static final SubLSymbol $sym42$C2_ALT_0 = SubLObjectFactory.makeSymbol("C2-ALT-0");
    private static final SubLSymbol $sym43$C2_ALT_1 = SubLObjectFactory.makeSymbol("C2-ALT-1");
    private static final SubLSymbol $sym44$C2_ALT_2 = SubLObjectFactory.makeSymbol("C2-ALT-2");
    private static final SubLSymbol $sym45$C2_LAT_0 = SubLObjectFactory.makeSymbol("C2-LAT-0");
    private static final SubLSymbol $sym46$C2_LAT_1 = SubLObjectFactory.makeSymbol("C2-LAT-1");
    private static final SubLSymbol $sym47$C2_LAT_2 = SubLObjectFactory.makeSymbol("C2-LAT-2");
    private static final SubLSymbol $sym48$C2_LONG_0 = SubLObjectFactory.makeSymbol("C2-LONG-0");
    private static final SubLSymbol $sym49$C2_LONG_1 = SubLObjectFactory.makeSymbol("C2-LONG-1");
    private static final SubLSymbol $sym50$C2_LONG_2 = SubLObjectFactory.makeSymbol("C2-LONG-2");
    private static final SubLList $list51;
    private static final SubLSymbol $sym52$CYC_POINT_MATCHES_QUAD_3D = SubLObjectFactory.makeSymbol("CYC-POINT-MATCHES-QUAD-3D");
    private static final SubLList $list53 = ConsesLow.list(constant_handles.reader_make_constant_shell(("Quad3DFn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("CURVE-LONG-2")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("CURVE-LONG-1")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("CURVE-LONG-0"))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("CURVE-LAT-2")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("CURVE-LAT-1")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("CURVE-LAT-0"))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("CURVE-ALT-2")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("CURVE-ALT-1")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("CURVE-ALT-0"))));
    private static final SubLSymbol $sym54$CURVE_ALT_0 = SubLObjectFactory.makeSymbol("CURVE-ALT-0");
    private static final SubLSymbol $sym55$CURVE_ALT_1 = SubLObjectFactory.makeSymbol("CURVE-ALT-1");
    private static final SubLSymbol $sym56$CURVE_ALT_2 = SubLObjectFactory.makeSymbol("CURVE-ALT-2");
    private static final SubLSymbol $sym57$CURVE_LAT_0 = SubLObjectFactory.makeSymbol("CURVE-LAT-0");
    private static final SubLSymbol $sym58$CURVE_LAT_1 = SubLObjectFactory.makeSymbol("CURVE-LAT-1");
    private static final SubLSymbol $sym59$CURVE_LAT_2 = SubLObjectFactory.makeSymbol("CURVE-LAT-2");
    private static final SubLSymbol $sym60$CURVE_LONG_0 = SubLObjectFactory.makeSymbol("CURVE-LONG-0");
    private static final SubLSymbol $sym61$CURVE_LONG_1 = SubLObjectFactory.makeSymbol("CURVE-LONG-1");
    private static final SubLSymbol $sym62$CURVE_LONG_2 = SubLObjectFactory.makeSymbol("CURVE-LONG-2");
    private static final SubLList $list63 = ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("POINT-LONG")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("POINT-LAT")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("POINT-ALT")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("POINT-TIME")));
    private static final SubLSymbol $sym64$POINT_TIME = SubLObjectFactory.makeSymbol("POINT-TIME");
    private static final SubLSymbol $sym65$POINT_ALT = SubLObjectFactory.makeSymbol("POINT-ALT");
    private static final SubLSymbol $sym66$POINT_LAT = SubLObjectFactory.makeSymbol("POINT-LAT");
    private static final SubLSymbol $sym67$POINT_LONG = SubLObjectFactory.makeSymbol("POINT-LONG");
    private static final SubLList $list68;
    private static final SubLList $list69;
    private static final SubLList $list70;
    private static final SubLList $list71;
    private static final SubLList $list72 = ConsesLow.list(SubLObjectFactory.makeSymbol("AIM-LONG"), SubLObjectFactory.makeSymbol("AIM-LAT"), SubLObjectFactory.makeSymbol("ALT-ANGLE"));
    private static final SubLList $list73;
    private static final SubLFloat $float74$_9_8 = SubLObjectFactory.makeDouble(-9.8000000000000007D);
    private static final SubLList $list75;
    private static final SubLObject $const76$Meter = constant_handles.reader_make_constant_shell(("Meter"));
    private static final SubLObject $const77$SecondsDuration = constant_handles.reader_make_constant_shell(("SecondsDuration"));
    private static final SubLSymbol $sym78$GENERATE_PROJECTILE_TRACE = SubLObjectFactory.makeSymbol("GENERATE-PROJECTILE-TRACE");
    private static final SubLList $list79;
    private static final SubLSymbol $sym80$ACIP_GENERATE_TEST_SUITE_1_SIMULATION_FILE = SubLObjectFactory.makeSymbol("ACIP-GENERATE-TEST-SUITE-1-SIMULATION-FILE");
    private static final SubLSymbol $sym81$DIRECTORY_P = SubLObjectFactory.makeSymbol("DIRECTORY-P");
    private static final SubLSymbol $sym82$NON_NEGATIVE_INTEGER_P = SubLObjectFactory.makeSymbol("NON-NEGATIVE-INTEGER-P");
    private static final SubLString $str83$observations__3__0D = SubLObjectFactory.makeString("observations-~3,'0D");
    private static final SubLString $str84$txt = SubLObjectFactory.makeString("txt");
    private static final SubLInteger $int85$10000 = SubLObjectFactory.makeInteger(10000);
    private static final SubLInteger $int86$800 = SubLObjectFactory.makeInteger(800);
    private static final SubLFloat $float87$0_9272952180016123 = SubLObjectFactory.makeDouble(0.9272952180016123D);
    private static final SubLObject $const88$ACIP_Radar_001 = constant_handles.reader_make_constant_shell(("ACIP-Radar-001"));
    private static final SubLSymbol $kw89$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
    private static final SubLString $str90$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
    private static final SubLSymbol $sym91$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
    private static final SubLString $str92$___ACIP_Defender_Observation_Simu = SubLObjectFactory.makeString(";; ACIP Defender Observation Simulation File");
    private static final SubLString $str93$_____Test_Suite_1__ = SubLObjectFactory.makeString("~%;; Test Suite 1 :");
    private static final SubLString $str94$_______observations__________D_to = SubLObjectFactory.makeString("~%;;   observations       : ~D total");
    private static final SubLString $str95$_______first_observation_____D_se = SubLObjectFactory.makeString("~%;;   first observation  : ~D second~:P");
    private static final SubLString $str96$_______observation_freq______D_se = SubLObjectFactory.makeString("~%;;   observation freq.  : ~D second~:P");
    private static final SubLSymbol $sym97$ACIP_GENERATE_TEST_SUITE_2_SIMULATION_FILE = SubLObjectFactory.makeSymbol("ACIP-GENERATE-TEST-SUITE-2-SIMULATION-FILE");
    private static final SubLFloat $float98$65_3 = SubLObjectFactory.makeDouble(65.299999999999997D);
    private static final SubLString $str99$_____Test_Suite_2__ = SubLObjectFactory.makeString("~%;; Test Suite 2 :");
    private static final SubLString $str100$_______observation_freq______S_se = SubLObjectFactory.makeString("~%;;   observation freq.  : ~S second~:P");
    private static final SubLSymbol $sym101$ACIP_GENERATE_TEST_SUITE_3_SIMULATION_FILE = SubLObjectFactory.makeSymbol("ACIP-GENERATE-TEST-SUITE-3-SIMULATION-FILE");
    private static final SubLString $str102$observations__2__0D__3__0D = SubLObjectFactory.makeString("observations-~2,'0D-~3,'0D");
    private static final SubLInteger $int103$100 = SubLObjectFactory.makeInteger(100);
    private static final SubLInteger $int104$1000 = SubLObjectFactory.makeInteger(1000);
    private static final SubLSymbol $sym105$ACIP_SUITE_3_OBSERVATION__ = SubLObjectFactory.makeSymbol("ACIP-SUITE-3-OBSERVATION-<");
    private static final SubLString $str106$_____Test_Suite_3__ = SubLObjectFactory.makeString("~%;; Test Suite 3 :");
    private static final SubLString $str107$_______traces________________D_to = SubLObjectFactory.makeString("~%;;   traces             : ~D total");
    private static final SubLString $str108$_______observations__________D_pe = SubLObjectFactory.makeString("~%;;   observations       : ~D per trace, ~D total");
    private static final SubLList $list109 = ConsesLow.list(constant_handles.reader_make_constant_shell(("sensorObservation")), SubLObjectFactory.makeKeyword("ANYTHING"), ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), SubLObjectFactory.makeKeyword("ANYTHING"), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("LAT-1"))), SubLObjectFactory.makeKeyword("ANYTHING"), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("TIME-1")))));
    private static final SubLSymbol $sym110$TIME_1 = SubLObjectFactory.makeSymbol("TIME-1");
    private static final SubLSymbol $sym111$LAT_1 = SubLObjectFactory.makeSymbol("LAT-1");
    private static final SubLList $list112 = ConsesLow.list(constant_handles.reader_make_constant_shell(("sensorObservation")), SubLObjectFactory.makeKeyword("ANYTHING"), ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), SubLObjectFactory.makeKeyword("ANYTHING"), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("LAT-2"))), SubLObjectFactory.makeKeyword("ANYTHING"), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), ConsesLow.list(SubLObjectFactory.makeKeyword("BIND"), SubLObjectFactory.makeSymbol("TIME-2")))));
    private static final SubLSymbol $sym113$TIME_2 = SubLObjectFactory.makeSymbol("TIME-2");
    private static final SubLSymbol $sym114$LAT_2 = SubLObjectFactory.makeSymbol("LAT-2");
    private static final SubLSymbol $sym115$_ACIP_DEFENDER_OBSERVATION_MT_ = SubLObjectFactory.makeSymbol("*ACIP-DEFENDER-OBSERVATION-MT*");
    private static final SubLObject $const116$ACIPDefenderObservationMt = constant_handles.reader_make_constant_shell(("ACIPDefenderObservationMt"));
    private static final SubLSymbol $sym117$ACIP_RUN_DEFENDER_SIMULATION_FILE = SubLObjectFactory.makeSymbol("ACIP-RUN-DEFENDER-SIMULATION-FILE");
    private static final SubLSymbol $sym118$STREAMP = SubLObjectFactory.makeSymbol("STREAMP");
    private static final SubLString $str119$cdolist = SubLObjectFactory.makeString("cdolist");
    private static final SubLList $list120 = ConsesLow.list(constant_handles.reader_make_constant_shell(("ballisticPathSensorCorroborationCount")), SubLObjectFactory.makeSymbol("?PATH"), SubLObjectFactory.makeSymbol("?NUM"));
    private static final SubLObject $const121$ACIPDefenderModelMt = constant_handles.reader_make_constant_shell(("ACIPDefenderModelMt"));
    private static final SubLList $list122;
    private static final SubLString $str123$__Total_time_____________________ = SubLObjectFactory.makeString("~%Total time                         : ~6,' D seconds");
    private static final SubLSymbol $sym124$ACIP_LOAD_DEFENDER_OBSERVATIONS = SubLObjectFactory.makeSymbol("ACIP-LOAD-DEFENDER-OBSERVATIONS");
    private static final SubLSymbol $sym125$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
    private static final SubLSymbol $kw126$INPUT = SubLObjectFactory.makeKeyword("INPUT");
    private static final SubLSymbol $kw127$EOF = SubLObjectFactory.makeKeyword("EOF");
    private static final SubLSymbol $sym128$_ACIP_LOAD_DEFENDER_OBSERVATIONS_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*ACIP-LOAD-DEFENDER-OBSERVATIONS-CACHING-STATE*");
    private static final SubLObject $const129$sensorObservation = constant_handles.reader_make_constant_shell(("sensorObservation"));
    private static final SubLList $list130 = ConsesLow.list(new SubLObject[] {
        ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ACIPWorldBackgroundMt"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ACIPGameBackgroundMt"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ACIPGameDataMt"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ACIPDefenderTheoryMt"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ACIPDefenderWorldStateMt"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ACIPDefenderObservationMt"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ACIPDefenderModelMt"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ListOf2RealNumbers"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ListOf3RealNumbers"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("Path-4D"))),
        ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("Place-4D"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("QuadraticCurve-3D"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("RailroadGun"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("Dora-RailroadGun"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("Darla-RailroadGun"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ANSPS-49-Radar"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("QuantityNumberFn"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("Point4Fn"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("Path4Fn"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("Quad3DFn"))),
        ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("Point4TimeFn"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("QuadCoeffFn"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("arbitraryPath4DOrdering"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ballisticPathSensorCorroborationCount"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("candidatePath"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("candidatePathTriple"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("equals-Quad3D"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("implausibleBallisticPathCoefficients"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("onBallisticPath"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("place4Altitude"))),
        ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("place4Latitude"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("place4Longitude"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("place4Time"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("plausibleBallisticPath"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("point4LaterThan"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("pointMatchesQuad3D"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("representativeBallisticPath"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("sensorObservation"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("ACIP-Radar-001")))
    });
    private static final SubLSymbol $sym131$SAVE_ACIP_PARTITION = SubLObjectFactory.makeSymbol("SAVE-ACIP-PARTITION");
    private static final SubLList $list132 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("Meter"))), ConsesLow.list(SubLObjectFactory.makeKeyword("TERM"), constant_handles.reader_make_constant_shell(("SecondsDuration"))));
    private static final SubLList $list133 = ConsesLow.list(SubLObjectFactory.makeKeyword("LIST-HASHING"), SubLObjectFactory.makeKeyword("UNIFICATION"), SubLObjectFactory.makeKeyword("PATTERN-MATCH"), SubLObjectFactory.makeKeyword("TACTIC-GENERATION"));
    private static final SubLList $list134 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("&KEY"), SubLObjectFactory.makeSymbol("SUBKERNEL"), SubLObjectFactory.makeSymbol("FILENAME")), SubLObjectFactory.makeSymbol("&BODY"), SubLObjectFactory.makeSymbol("BODY"));
    private static final SubLList $list135 = ConsesLow.list(SubLObjectFactory.makeKeyword("SUBKERNEL"), SubLObjectFactory.makeKeyword("FILENAME"));
    private static final SubLSymbol $kw136$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
    private static final SubLSymbol $kw137$SUBKERNEL = SubLObjectFactory.makeKeyword("SUBKERNEL");
    private static final SubLSymbol $kw138$FILENAME = SubLObjectFactory.makeKeyword("FILENAME");
    private static final SubLSymbol $sym139$SUBKERNEL_VAR = SubLObjectFactory.makeUninternedSymbol("SUBKERNEL-VAR");
    private static final SubLSymbol $sym140$FILENAME_VAR = SubLObjectFactory.makeUninternedSymbol("FILENAME-VAR");
    private static final SubLSymbol $sym141$STREAM = SubLObjectFactory.makeUninternedSymbol("STREAM");
    private static final SubLSymbol $sym142$CLET = SubLObjectFactory.makeSymbol("CLET");
    private static final SubLSymbol $sym143$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
    private static final SubLList $list144 = ConsesLow.list(SubLObjectFactory.makeSymbol("ACIP-SUBKERNEL-P"));
    private static final SubLList $list145 = ConsesLow.list(SubLObjectFactory.makeSymbol("STRINGP"));
    private static final SubLSymbol $sym146$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
    private static final SubLSymbol $sym147$WITH_PRIVATE_BINARY_FILE = SubLObjectFactory.makeSymbol("WITH-PRIVATE-BINARY-FILE");
    private static final SubLList $list148 = ConsesLow.list(SubLObjectFactory.makeKeyword("OUTPUT"));
    private static final SubLSymbol $sym149$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
    private static final SubLSymbol $sym150$_ACIP_SUBKERNEL_OUTPUT_STREAM_ = SubLObjectFactory.makeSymbol("*ACIP-SUBKERNEL-OUTPUT-STREAM*");
    private static final SubLSymbol $sym151$_ACIP_SUBKERNEL_EXTRACTION_ = SubLObjectFactory.makeSymbol("*ACIP-SUBKERNEL-EXTRACTION*");
    private static final SubLSymbol $sym152$CFASL_OUTPUT = SubLObjectFactory.makeSymbol("CFASL-OUTPUT");
    private static final SubLList $list153;
    private static final SubLSymbol $sym154$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
    private static final SubLString $str155$File__S_not_found_ = SubLObjectFactory.makeString("File ~S not found.");
    private static final SubLString $str156$Performing_ = SubLObjectFactory.makeString("Performing ");
    private static final SubLString $str157$_trial = SubLObjectFactory.makeString(" trial");
    private static final SubLString $str158$s = SubLObjectFactory.makeString("s");
    private static final SubLString $str159$ = SubLObjectFactory.makeString("");
    private static final SubLString $str160$_of_subkernel = SubLObjectFactory.makeString(" of subkernel");
    private static final SubLSymbol $kw161$LIST_HASHING = SubLObjectFactory.makeKeyword("LIST-HASHING");
    private static final SubLSymbol $kw162$UNIFICATION = SubLObjectFactory.makeKeyword("UNIFICATION");
    private static final SubLSymbol $kw163$PATTERN_MATCH = SubLObjectFactory.makeKeyword("PATTERN-MATCH");
    private static final SubLSymbol $kw164$TACTIC_GENERATION = SubLObjectFactory.makeKeyword("TACTIC-GENERATION");
    private static final SubLString $str165$Time_to_support__S_subkernel_ = SubLObjectFactory.makeString("Time to support ~S subkernel.");
    private static final SubLInteger $int166$2000 = SubLObjectFactory.makeInteger(2000);
    private static final SubLString $str167$Actual_hash_code__S_differs_from_ = SubLObjectFactory.makeString("Actual hash code ~S differs from expected hash code ~S");
    private static final SubLInteger $int168$200 = SubLObjectFactory.makeInteger(200);
    private static final SubLString $str169$Actual_bindings__S_differs_from_e = SubLObjectFactory.makeString("Actual bindings ~S differs from expected bindings ~S");
    private static final SubLString $str170$Actual_result__S_differs_from_exp = SubLObjectFactory.makeString("Actual result ~S differs from expected result ~S");
    private static final SubLList $list171 = ConsesLow.list(SubLObjectFactory.makeSymbol("HL-MODULE1"), SubLObjectFactory.makeSymbol("PRODUCTIVITY1"), SubLObjectFactory.makeSymbol("COMPLETENESS1"));
    private static final SubLList $list172 = ConsesLow.list(SubLObjectFactory.makeSymbol("HL-MODULE2"), SubLObjectFactory.makeSymbol("PRODUCTIVITY2"), SubLObjectFactory.makeSymbol("COMPLETENESS2"));
    private static final SubLList $list173 = ConsesLow.list(SubLObjectFactory.makeKeyword("REMOVAL-LOOKUP-POS"));
    private static final SubLSymbol $sym174$HL_MODULE_NAME = SubLObjectFactory.makeSymbol("HL-MODULE-NAME");
    private static final SubLSymbol $sym175$FIND_HL_MODULE_BY_NAME = SubLObjectFactory.makeSymbol("FIND-HL-MODULE-BY-NAME");
    private static final SubLList $list176 = ConsesLow.list(SubLObjectFactory.makeSymbol("HL-MODULE"), SubLObjectFactory.makeSymbol("PRODUCTIVITY"), SubLObjectFactory.makeSymbol("COMPLETENESS"));
    private static final SubLList $list177 = ConsesLow.list(SubLObjectFactory.makeSymbol("CYC-QUAD-COEFF"), SubLObjectFactory.makeSymbol("CYC-ARBITRARY-PATH-4D-ORDERING"), SubLObjectFactory.makeSymbol("CYC-EQUALS-QUAD-3D"), SubLObjectFactory.makeSymbol("CYC-POINT-MATCHES-QUAD-3D"), SubLObjectFactory.makeSymbol("GENERATE-PROJECTILE-TRACE"));
    private static final SubLSymbol $kw178$TERSE = SubLObjectFactory.makeKeyword("TERSE");

    static
    {
        $list20 = ConsesLow.list(ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, SubLObjectFactory.makeInteger(1000)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ONE_INTEGER, SubLObjectFactory.makeInteger(900)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), TWO_INTEGER, SubLObjectFactory.makeInteger(800))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, SubLObjectFactory.makeInteger(-100), SubLObjectFactory.makeInteger(1000))), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ONE_INTEGER, ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), TWO_INTEGER, ZERO_INTEGER)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER)), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, SubLObjectFactory.makeInteger(1000)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ONE_INTEGER, SubLObjectFactory.makeInteger(1100)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), TWO_INTEGER, SubLObjectFactory.makeInteger(1190))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), SubLObjectFactory.makeInteger(-5), SubLObjectFactory.makeInteger(105), SubLObjectFactory.makeInteger(1000))), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, SubLObjectFactory.makeInteger(10000)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ONE_INTEGER, SubLObjectFactory.makeInteger(9520)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), TWO_INTEGER, SubLObjectFactory.makeInteger(9040))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, SubLObjectFactory.makeInteger(-480), SubLObjectFactory.makeInteger(10000))), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ONE_INTEGER, ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), TWO_INTEGER, ZERO_INTEGER)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER)), ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ONE_INTEGER, SubLObjectFactory.makeDouble(630.20000000000005D)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), TWO_INTEGER, SubLObjectFactory.makeDouble(1240.8D))), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), SubLObjectFactory.makeDouble(-9.8000000000000007D), SubLObjectFactory.makeInteger(640), ZERO_INTEGER)));
        $list27 = ConsesLow.list(ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("Path4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(1000)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(1000)), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), ZERO_INTEGER)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(900)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(1100)), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), ONE_INTEGER))), ConsesLow.list(constant_handles.reader_make_constant_shell(("Path4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(1000)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(1000)), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), ZERO_INTEGER)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(900)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(1100)), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), TWO_INTEGER)))), T));
        $list51 = ConsesLow.list(ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("Quad3DFn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, SubLObjectFactory.makeInteger(-100), SubLObjectFactory.makeInteger(1000)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), SubLObjectFactory.makeInteger(-5), SubLObjectFactory.makeInteger(105), SubLObjectFactory.makeInteger(1000))), ConsesLow.list(constant_handles.reader_make_constant_shell(("Quad3DFn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), SubLObjectFactory.makeDouble(0.10000000000000001D), SubLObjectFactory.makeInteger(-101), SubLObjectFactory.makeInteger(1010)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), SubLObjectFactory.makeDouble(0.10000000000000001D), ONE_INTEGER, TEN_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), SubLObjectFactory.makeDouble(-5.0999999999999996D), SubLObjectFactory.makeInteger(106), SubLObjectFactory.makeInteger(1010)))), T));
        $list68 = ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ONE_INTEGER);
        $list69 = ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), ONE_INTEGER);
        $list70 = ConsesLow.list(ConsesLow.list(ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(910)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), TEN_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(1110)), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), ONE_INTEGER)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Quad3DFn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, SubLObjectFactory.makeInteger(-100), SubLObjectFactory.makeInteger(1000)), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("TheList")), SubLObjectFactory.makeInteger(-5), SubLObjectFactory.makeInteger(105), SubLObjectFactory.makeInteger(1000)))), T));
        $list71 = ConsesLow.list(SubLObjectFactory.makeSymbol("START-LONG"), SubLObjectFactory.makeSymbol("START-LAT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list(SubLObjectFactory.makeSymbol("START-ALT"), ZERO_INTEGER));
        $list73 = ConsesLow.list(SubLObjectFactory.makeSymbol("MUZZLE-VEL"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list(SubLObjectFactory.makeSymbol("START-TIME"), ZERO_INTEGER), ConsesLow.list(SubLObjectFactory.makeSymbol("GRAVITY"), SubLObjectFactory.makeDouble(-9.8000000000000007D)));
        $list75 = ConsesLow.list(SubLObjectFactory.makeSymbol("TRACE-COUNT"), SubLObjectFactory.makeSymbol("&OPTIONAL"), ConsesLow.list(SubLObjectFactory.makeSymbol("TRACE-START"), SubLObjectFactory.makeSymbol("START-TIME")), ConsesLow.list(SubLObjectFactory.makeSymbol("TRACE-FREQ"), ONE_INTEGER));
        $list79 = ConsesLow.list(ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(1000), ZERO_INTEGER, ZERO_INTEGER), ConsesLow.list(ZERO_INTEGER, ZERO_INTEGER, SubLObjectFactory.makeDouble(0.80978357257016687D)), ConsesLow.list(SubLObjectFactory.makeInteger(145), ZERO_INTEGER, SubLObjectFactory.makeInteger(-5)), ConsesLow.list(THREE_INTEGER, ZERO_INTEGER, ONE_INTEGER)), ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(1000)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), ZERO_INTEGER)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(900)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(100)), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), ONE_INTEGER)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(800)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(190)), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), TWO_INTEGER)))), ConsesLow.list(ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeInteger(10000), ZERO_INTEGER, ZERO_INTEGER), ConsesLow.list(ZERO_INTEGER, ZERO_INTEGER, SubLObjectFactory.makeDouble(0.9272952180016123D)), ConsesLow.list(SubLObjectFactory.makeInteger(800), ZERO_INTEGER, SubLObjectFactory.makeDouble(-9.8000000000000007D)), ConsesLow.list(THREE_INTEGER, ZERO_INTEGER, ONE_INTEGER)), ConsesLow.list(ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(10000)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), ZERO_INTEGER)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(9520)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeDouble(630.20000000000005D)), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), ONE_INTEGER)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Point4Fn")), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeInteger(9040)), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), ZERO_INTEGER), ConsesLow.list(constant_handles.reader_make_constant_shell(("Meter")), SubLObjectFactory.makeDouble(1240.8D)), ConsesLow.list(constant_handles.reader_make_constant_shell(("SecondsDuration")), TWO_INTEGER)))));
        $list122 = ConsesLow.list(SubLObjectFactory.makeKeyword("MAX-TRANSFORMATION-DEPTH"), ONE_INTEGER, SubLObjectFactory.makeKeyword("PROBABLY-APPROXIMATELY-DONE"), SubLObjectFactory.makeDouble(1.0D), SubLObjectFactory.makeKeyword("RETURN"), ConsesLow.list(SubLObjectFactory.makeKeyword("TEMPLATE"), ConsesLow.list(SubLObjectFactory.makeKeyword("PATH"), SubLObjectFactory.makeSymbol("?PATH"), SubLObjectFactory.makeKeyword("OBSERVATIONS"), SubLObjectFactory.makeSymbol("?NUM"))));
        $list153 = ConsesLow.list(ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("*ACIP-SUBKERNEL-OUTPUT-STREAM*"), NIL), ConsesLow.list(SubLObjectFactory.makeSymbol("CSETQ"), SubLObjectFactory.makeSymbol("*ACIP-SUBKERNEL-EXTRACTION*"), NIL));
    }


    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 1702L)
    public static SubLObject cyc_list_of_2_real_numbers(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(acip.NIL != el_utilities.el_non_empty_list_p(v_object) && acip.NIL != el_utilities.formula_arityE(v_object, (SubLObject)acip.TWO_INTEGER, (SubLObject)acip.UNPROVIDED) && acip.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)acip.$sym0$NUMBERP), cycl_utilities.formula_args(v_object, (SubLObject)acip.UNPROVIDED), (SubLObject)acip.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 2183L)
    public static SubLObject cyc_list_of_3_real_numbers(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(acip.NIL != el_utilities.el_non_empty_list_p(v_object) && acip.NIL != el_utilities.formula_arityE(v_object, (SubLObject)acip.THREE_INTEGER, (SubLObject)acip.UNPROVIDED) && acip.NIL != list_utilities.every_in_list(Symbols.symbol_function((SubLObject)acip.$sym0$NUMBERP), cycl_utilities.formula_args(v_object, (SubLObject)acip.UNPROVIDED), (SubLObject)acip.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 2487L)
    public static SubLObject cyc_point_4_time(final SubLObject v_object) {
        if (acip.NIL == el_utilities.el_formula_with_operator_p(v_object, acip.$const3$Point4Fn) || acip.NIL == el_utilities.formula_arityE(v_object, (SubLObject)acip.FOUR_INTEGER, (SubLObject)acip.UNPROVIDED)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject result = cycl_utilities.formula_arg(v_object, (SubLObject)acip.FOUR_INTEGER, (SubLObject)acip.UNPROVIDED);
        if (!result.isNumber()) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 2874L)
    public static SubLObject cyc_quad_coeff(final SubLObject tuple1, final SubLObject tuple2, final SubLObject tuple3) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)acip.NIL;
        SubLObject error = (SubLObject)acip.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)acip.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = quad_coeff(tuple1, tuple2, tuple3);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)acip.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (acip.NIL != error) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 3154L)
    public static SubLObject quad_coeff(final SubLObject tuple1, final SubLObject tuple2, final SubLObject tuple3) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern((SubLObject)ConsesLow.list(tuple1, tuple2, tuple3), (SubLObject)acip.$list7);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (acip.NIL != success) {
            final SubLObject y3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym8$Y3, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject x3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym9$X3, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject y4 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym10$Y2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject x4 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym11$X2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject y5 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym12$Y1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject x5 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym13$X1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            SubLObject a = Numbers.divide(Numbers.subtract(Numbers.divide(Numbers.subtract(y5, y3), Numbers.subtract(x5, x3)), Numbers.divide(Numbers.subtract(y5, y4), Numbers.subtract(x5, x4))), Numbers.subtract(Numbers.divide(Numbers.subtract(number_utilities.square(x4), number_utilities.square(x5)), Numbers.subtract(x5, x4)), Numbers.divide(Numbers.subtract(number_utilities.square(x3), number_utilities.square(x5)), Numbers.subtract(x5, x3))));
            SubLObject b = Numbers.add(Numbers.divide(Numbers.multiply(a, Numbers.subtract(number_utilities.square(x4), number_utilities.square(x5))), Numbers.subtract(x5, x4)), Numbers.divide(Numbers.subtract(y5, y4), Numbers.subtract(x5, x4)));
            SubLObject c = Numbers.subtract(y5, Numbers.multiply(a, number_utilities.square(x5)), Numbers.multiply(b, x5));
            a = number_utilities.four_significant_digits(a);
            b = number_utilities.four_significant_digits(b);
            c = number_utilities.four_significant_digits(c);
            return el_utilities.make_el_list((SubLObject)ConsesLow.list(a, b, c), (SubLObject)acip.UNPROVIDED);
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 4731L)
    public static SubLObject cyc_arbitrary_path_4d_ordering(final SubLObject path1, final SubLObject path2) {
        final SubLObject pattern = (SubLObject)acip.$list21;
        if (acip.NIL == formula_pattern_match.pattern_matches_formula_without_bindings(pattern, path1) || acip.NIL == formula_pattern_match.pattern_matches_formula_without_bindings(pattern, path2)) {
            relation_evaluation.throw_unevaluatable();
        }
        final SubLObject path1_points = cycl_utilities.formula_args(path1, (SubLObject)acip.UNPROVIDED);
        final SubLObject path2_points = cycl_utilities.formula_args(path2, (SubLObject)acip.UNPROVIDED);
        return cyc_arbitrary_path_4d_ordering_int(path1_points, path2_points);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 5333L)
    public static SubLObject cyc_arbitrary_path_4d_ordering_int(final SubLObject path1_points, final SubLObject path2_points) {
        if (acip.NIL == path1_points) {
            return (SubLObject)SubLObjectFactory.makeBoolean(acip.NIL != path2_points);
        }
        if (acip.NIL == path2_points) {
            return (SubLObject)acip.NIL;
        }
        SubLObject path1_point = (SubLObject)acip.NIL;
        SubLObject path1_rest_points = (SubLObject)acip.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(path1_points, path1_points, (SubLObject)acip.$list23);
        path1_point = path1_points.first();
        final SubLObject current = path1_rest_points = path1_points.rest();
        SubLObject path2_point = (SubLObject)acip.NIL;
        SubLObject path2_rest_points = (SubLObject)acip.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(path2_points, path2_points, (SubLObject)acip.$list24);
        path2_point = path2_points.first();
        final SubLObject current_$2 = path2_rest_points = path2_points.rest();
        if (acip.NIL != cyc_arbitrary_path_point_4d_ordering(path1_point, path2_point)) {
            return (SubLObject)acip.T;
        }
        if (acip.NIL != cyc_arbitrary_path_point_4d_ordering(path2_point, path1_point)) {
            return (SubLObject)acip.NIL;
        }
        return cyc_arbitrary_path_4d_ordering_int(path1_rest_points, path2_rest_points);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 5949L)
    public static SubLObject cyc_arbitrary_path_point_4d_ordering(final SubLObject point1, final SubLObject point2) {
        final SubLObject pattern = (SubLObject)acip.$list25;
        if (acip.NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, point1) && acip.NIL != formula_pattern_match.pattern_matches_formula_without_bindings(pattern, point2)) {
            final SubLObject time_1 = cycl_utilities.formula_arg(point1, (SubLObject)acip.FOUR_INTEGER, (SubLObject)acip.UNPROVIDED);
            final SubLObject time_2 = cycl_utilities.formula_arg(point2, (SubLObject)acip.FOUR_INTEGER, (SubLObject)acip.UNPROVIDED);
            if (acip.NIL != arithmetic.cyc_less_than(time_1, time_2)) {
                return (SubLObject)acip.T;
            }
            if (acip.NIL != arithmetic.cyc_less_than(time_2, time_1)) {
                return (SubLObject)acip.NIL;
            }
            final SubLObject long_1 = cycl_utilities.formula_arg(point1, (SubLObject)acip.ONE_INTEGER, (SubLObject)acip.UNPROVIDED);
            final SubLObject long_2 = cycl_utilities.formula_arg(point2, (SubLObject)acip.ONE_INTEGER, (SubLObject)acip.UNPROVIDED);
            if (acip.NIL != arithmetic.cyc_less_than(long_1, long_2)) {
                return (SubLObject)acip.T;
            }
            if (acip.NIL != arithmetic.cyc_less_than(long_2, long_1)) {
                return (SubLObject)acip.NIL;
            }
            final SubLObject lat_1 = cycl_utilities.formula_arg(point1, (SubLObject)acip.TWO_INTEGER, (SubLObject)acip.UNPROVIDED);
            final SubLObject lat_2 = cycl_utilities.formula_arg(point2, (SubLObject)acip.TWO_INTEGER, (SubLObject)acip.UNPROVIDED);
            if (acip.NIL != arithmetic.cyc_less_than(lat_1, lat_2)) {
                return (SubLObject)acip.T;
            }
            if (acip.NIL != arithmetic.cyc_less_than(lat_2, lat_1)) {
                return (SubLObject)acip.NIL;
            }
            final SubLObject alt_1 = cycl_utilities.formula_arg(point1, (SubLObject)acip.THREE_INTEGER, (SubLObject)acip.UNPROVIDED);
            final SubLObject alt_2 = cycl_utilities.formula_arg(point2, (SubLObject)acip.THREE_INTEGER, (SubLObject)acip.UNPROVIDED);
            if (acip.NIL != arithmetic.cyc_less_than(alt_1, alt_2)) {
                return (SubLObject)acip.T;
            }
            if (acip.NIL != arithmetic.cyc_less_than(alt_2, alt_1)) {
                return (SubLObject)acip.NIL;
            }
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 7569L)
    public static SubLObject cyc_equals_quad_3d(final SubLObject curve_1, final SubLObject curve_2) {
        final SubLObject syntactic_pattern = (SubLObject)acip.$list28;
        if (acip.NIL == formula_pattern_match.pattern_matches_formula_without_bindings(syntactic_pattern, curve_1) || acip.NIL == formula_pattern_match.pattern_matches_formula_without_bindings(syntactic_pattern, curve_2)) {
            relation_evaluation.throw_unevaluatable();
        }
        return cyc_equals_quad_3d_int(curve_1, curve_2);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 8465L)
    public static SubLObject cyc_equals_quad_3d_int(final SubLObject curve_1, final SubLObject curve_2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(curve_1, (SubLObject)acip.$list31);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (acip.NIL != success) {
            final SubLObject c1_alt_0 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym32$C1_ALT_0, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject c1_alt_2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym33$C1_ALT_1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject c1_alt_3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym34$C1_ALT_2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject c1_lat_0 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym35$C1_LAT_0, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject c1_lat_2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym36$C1_LAT_1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject c1_lat_3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym37$C1_LAT_2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject c1_long_0 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym38$C1_LONG_0, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject c1_long_2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym39$C1_LONG_1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject c1_long_3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym40$C1_LONG_2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject success_$3 = formula_pattern_match.formula_matches_pattern(curve_2, (SubLObject)acip.$list41);
            final SubLObject v_bindings_$4 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (acip.NIL != success_$3) {
                final SubLObject c2_alt_0 = list_utilities.alist_lookup_without_values(v_bindings_$4, (SubLObject)acip.$sym42$C2_ALT_0, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject c2_alt_2 = list_utilities.alist_lookup_without_values(v_bindings_$4, (SubLObject)acip.$sym43$C2_ALT_1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject c2_alt_3 = list_utilities.alist_lookup_without_values(v_bindings_$4, (SubLObject)acip.$sym44$C2_ALT_2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject c2_lat_0 = list_utilities.alist_lookup_without_values(v_bindings_$4, (SubLObject)acip.$sym45$C2_LAT_0, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject c2_lat_2 = list_utilities.alist_lookup_without_values(v_bindings_$4, (SubLObject)acip.$sym46$C2_LAT_1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject c2_lat_3 = list_utilities.alist_lookup_without_values(v_bindings_$4, (SubLObject)acip.$sym47$C2_LAT_2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject c2_long_0 = list_utilities.alist_lookup_without_values(v_bindings_$4, (SubLObject)acip.$sym48$C2_LONG_0, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject c2_long_2 = list_utilities.alist_lookup_without_values(v_bindings_$4, (SubLObject)acip.$sym49$C2_LONG_1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject c2_long_3 = list_utilities.alist_lookup_without_values(v_bindings_$4, (SubLObject)acip.$sym50$C2_LONG_2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                return (SubLObject)SubLObjectFactory.makeBoolean(acip.NIL != number_utilities.tolerance_E(c1_long_3, c2_long_3, acip.$quad_3d_tolerance_accel$.getGlobalValue()) && acip.NIL != number_utilities.tolerance_E(c1_long_2, c2_long_2, acip.$quad_3d_tolerance_veloc$.getGlobalValue()) && acip.NIL != number_utilities.tolerance_E(c1_long_0, c2_long_0, acip.$quad_3d_tolerance_locat$.getGlobalValue()) && acip.NIL != number_utilities.tolerance_E(c1_lat_3, c2_lat_3, acip.$quad_3d_tolerance_accel$.getGlobalValue()) && acip.NIL != number_utilities.tolerance_E(c1_lat_2, c2_lat_2, acip.$quad_3d_tolerance_veloc$.getGlobalValue()) && acip.NIL != number_utilities.tolerance_E(c1_lat_0, c2_lat_0, acip.$quad_3d_tolerance_locat$.getGlobalValue()) && acip.NIL != number_utilities.tolerance_E(c1_alt_3, c2_alt_3, acip.$quad_3d_tolerance_accel$.getGlobalValue()) && acip.NIL != number_utilities.tolerance_E(c1_alt_2, c2_alt_2, acip.$quad_3d_tolerance_veloc$.getGlobalValue()) && acip.NIL != number_utilities.tolerance_E(c1_alt_0, c2_alt_0, acip.$quad_3d_tolerance_locat$.getGlobalValue()));
            }
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 10222L)
    public static SubLObject cyc_point_matches_quad_3d(final SubLObject point, final SubLObject curve) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject point_pattern = (SubLObject)acip.$list25;
        final SubLObject curve_pattern = (SubLObject)acip.$list28;
        if (acip.NIL == formula_pattern_match.pattern_matches_formula_without_bindings(point_pattern, point) || acip.NIL == formula_pattern_match.pattern_matches_formula_without_bindings(curve_pattern, curve)) {
            relation_evaluation.throw_unevaluatable();
        }
        SubLObject result = (SubLObject)acip.NIL;
        SubLObject error = (SubLObject)acip.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)acip.$sym5$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = cyc_point_matches_quad_3d_int(point, curve);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)acip.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (acip.NIL != error) {
            relation_evaluation.throw_unevaluatable();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 11037L)
    public static SubLObject cyc_point_matches_quad_3d_int(final SubLObject point, final SubLObject curve) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(curve, (SubLObject)acip.$list53);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (acip.NIL != success) {
            final SubLObject curve_alt_0 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym54$CURVE_ALT_0, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject curve_alt_2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym55$CURVE_ALT_1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject curve_alt_3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym56$CURVE_ALT_2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject curve_lat_0 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym57$CURVE_LAT_0, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject curve_lat_2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym58$CURVE_LAT_1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject curve_lat_3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym59$CURVE_LAT_2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject curve_long_0 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym60$CURVE_LONG_0, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject curve_long_2 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym61$CURVE_LONG_1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject curve_long_3 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym62$CURVE_LONG_2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject success_$5 = formula_pattern_match.formula_matches_pattern(point, (SubLObject)acip.$list63);
            final SubLObject v_bindings_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (acip.NIL != success_$5) {
                final SubLObject point_time = list_utilities.alist_lookup_without_values(v_bindings_$6, (SubLObject)acip.$sym64$POINT_TIME, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject point_alt = list_utilities.alist_lookup_without_values(v_bindings_$6, (SubLObject)acip.$sym65$POINT_ALT, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject point_lat = list_utilities.alist_lookup_without_values(v_bindings_$6, (SubLObject)acip.$sym66$POINT_LAT, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject point_long = list_utilities.alist_lookup_without_values(v_bindings_$6, (SubLObject)acip.$sym67$POINT_LONG, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject num_point_long = quantities.cyc_quotient(point_long, (SubLObject)acip.$list68);
                final SubLObject num_point_lat = quantities.cyc_quotient(point_lat, (SubLObject)acip.$list68);
                final SubLObject num_point_alt = quantities.cyc_quotient(point_alt, (SubLObject)acip.$list68);
                final SubLObject num_point_time = quantities.cyc_quotient(point_time, (SubLObject)acip.$list69);
                final SubLObject num_curve_long = Numbers.add(Numbers.multiply(curve_long_3, Numbers.expt(num_point_time, (SubLObject)acip.TWO_INTEGER)), Numbers.multiply(curve_long_2, num_point_time), curve_long_0);
                final SubLObject num_curve_lat = Numbers.add(Numbers.multiply(curve_lat_3, Numbers.expt(num_point_time, (SubLObject)acip.TWO_INTEGER)), Numbers.multiply(curve_lat_2, num_point_time), curve_lat_0);
                final SubLObject num_curve_alt = Numbers.add(Numbers.multiply(curve_alt_3, Numbers.expt(num_point_time, (SubLObject)acip.TWO_INTEGER)), Numbers.multiply(curve_alt_2, num_point_time), curve_alt_0);
                return (SubLObject)SubLObjectFactory.makeBoolean(acip.NIL != number_utilities.tolerance_E(num_point_long, num_curve_long, acip.$quad_3d_tolerance_locat$.getGlobalValue()) && acip.NIL != number_utilities.tolerance_E(num_point_lat, num_curve_lat, acip.$quad_3d_tolerance_locat$.getGlobalValue()) && acip.NIL != number_utilities.tolerance_E(num_point_alt, num_curve_alt, acip.$quad_3d_tolerance_locat$.getGlobalValue()));
            }
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 12917L)
    public static SubLObject generate_projectile_trace(final SubLObject start_spec, final SubLObject aim_spec, final SubLObject shoot_spec, final SubLObject trace_spec) {
        SubLObject start_long = (SubLObject)acip.NIL;
        SubLObject start_lat = (SubLObject)acip.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(start_spec, start_spec, (SubLObject)acip.$list71);
        start_long = start_spec.first();
        SubLObject current = start_spec.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, start_spec, (SubLObject)acip.$list71);
        start_lat = current.first();
        current = current.rest();
        final SubLObject start_alt = (SubLObject)(current.isCons() ? current.first() : acip.ZERO_INTEGER);
        cdestructuring_bind.destructuring_bind_must_listp(current, start_spec, (SubLObject)acip.$list71);
        current = current.rest();
        if (acip.NIL == current) {
            SubLObject aim_long = (SubLObject)acip.NIL;
            SubLObject aim_lat = (SubLObject)acip.NIL;
            SubLObject alt_angle = (SubLObject)acip.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(aim_spec, aim_spec, (SubLObject)acip.$list72);
            aim_long = aim_spec.first();
            SubLObject current_$8 = aim_spec.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$8, aim_spec, (SubLObject)acip.$list72);
            aim_lat = current_$8.first();
            current_$8 = current_$8.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$8, aim_spec, (SubLObject)acip.$list72);
            alt_angle = current_$8.first();
            current_$8 = current_$8.rest();
            if (acip.NIL == current_$8) {
                SubLObject muzzle_vel = (SubLObject)acip.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(shoot_spec, shoot_spec, (SubLObject)acip.$list73);
                muzzle_vel = shoot_spec.first();
                SubLObject current_$9 = shoot_spec.rest();
                final SubLObject start_time = (SubLObject)(current_$9.isCons() ? current_$9.first() : acip.ZERO_INTEGER);
                cdestructuring_bind.destructuring_bind_must_listp(current_$9, shoot_spec, (SubLObject)acip.$list73);
                current_$9 = current_$9.rest();
                final SubLObject gravity = (SubLObject)(current_$9.isCons() ? current_$9.first() : acip.$float74$_9_8);
                cdestructuring_bind.destructuring_bind_must_listp(current_$9, shoot_spec, (SubLObject)acip.$list73);
                current_$9 = current_$9.rest();
                if (acip.NIL == current_$9) {
                    SubLObject trace_count = (SubLObject)acip.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(trace_spec, trace_spec, (SubLObject)acip.$list75);
                    trace_count = trace_spec.first();
                    SubLObject current_$10 = trace_spec.rest();
                    final SubLObject trace_start = current_$10.isCons() ? current_$10.first() : start_time;
                    cdestructuring_bind.destructuring_bind_must_listp(current_$10, trace_spec, (SubLObject)acip.$list75);
                    current_$10 = current_$10.rest();
                    final SubLObject trace_freq = (SubLObject)(current_$10.isCons() ? current_$10.first() : acip.ONE_INTEGER);
                    cdestructuring_bind.destructuring_bind_must_listp(current_$10, trace_spec, (SubLObject)acip.$list75);
                    current_$10 = current_$10.rest();
                    if (acip.NIL == current_$10) {
                        final SubLObject delta_long = Numbers.subtract(aim_long, start_long);
                        final SubLObject delta_lat = Numbers.subtract(aim_lat, start_lat);
                        final SubLObject delta_planar = Numbers.sqrt(Numbers.add(number_utilities.square(delta_long), number_utilities.square(delta_lat)));
                        final SubLObject vel_alt = Numbers.multiply(Numbers.sin(alt_angle), muzzle_vel);
                        final SubLObject vel_planar = Numbers.multiply(Numbers.cos(alt_angle), muzzle_vel);
                        final SubLObject vel_long = Numbers.multiply(vel_planar, Numbers.divide(delta_long, delta_planar));
                        final SubLObject vel_lat = Numbers.multiply(vel_planar, Numbers.divide(delta_lat, delta_planar));
                        SubLObject trace = (SubLObject)acip.NIL;
                        SubLObject trace_time = trace_start;
                        SubLObject i;
                        SubLObject shoot_time;
                        SubLObject trace_long;
                        SubLObject trace_lat;
                        SubLObject trace_alt;
                        for (i = (SubLObject)acip.NIL, i = (SubLObject)acip.ZERO_INTEGER; i.numL(trace_count); i = Numbers.add(i, (SubLObject)acip.ONE_INTEGER)) {
                            shoot_time = Numbers.subtract(trace_time, start_time);
                            trace_long = Numbers.add(start_long, Numbers.multiply(shoot_time, vel_long));
                            trace_lat = Numbers.add(start_lat, Numbers.multiply(shoot_time, vel_lat));
                            trace_alt = Numbers.add(start_alt, Numbers.multiply(shoot_time, vel_alt), Numbers.multiply(number_utilities.square(shoot_time), gravity));
                            trace = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(acip.$const3$Point4Fn, (SubLObject)ConsesLow.list(acip.$const76$Meter, number_utilities.significant_digits(trace_long, (SubLObject)acip.FIVE_INTEGER)), (SubLObject)ConsesLow.list(acip.$const76$Meter, number_utilities.significant_digits(trace_lat, (SubLObject)acip.FIVE_INTEGER)), (SubLObject)ConsesLow.list(acip.$const76$Meter, number_utilities.significant_digits(trace_alt, (SubLObject)acip.FIVE_INTEGER)), (SubLObject)ConsesLow.list(acip.$const77$SecondsDuration, number_utilities.significant_digits(trace_time, (SubLObject)acip.FIVE_INTEGER))), trace);
                            trace_time = Numbers.add(trace_time, trace_freq);
                        }
                        return Sequences.nreverse(trace);
                    }
                    cdestructuring_bind.cdestructuring_bind_error(trace_spec, (SubLObject)acip.$list75);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(shoot_spec, (SubLObject)acip.$list73);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(aim_spec, (SubLObject)acip.$list72);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(start_spec, (SubLObject)acip.$list71);
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 15791L)
    public static SubLObject acip_generate_test_suite_1_simulation_file(final SubLObject directory, final SubLObject trace_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert acip.NIL != Filesys.directory_p(directory) : directory;
        assert acip.NIL != subl_promotions.non_negative_integer_p(trace_count) : trace_count;
        final SubLObject filename = PrintLow.format((SubLObject)acip.NIL, (SubLObject)acip.$str83$observations__3__0D, trace_count);
        final SubLObject full_filename = file_utilities.relative_filename(directory, filename, (SubLObject)acip.$str84$txt);
        final SubLObject gravity = (SubLObject)acip.$float74$_9_8;
        final SubLObject start_time = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject start_long = (SubLObject)acip.$int85$10000;
        final SubLObject start_lat = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject start_alt = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject muzzle_vel = (SubLObject)acip.$int86$800;
        final SubLObject aim_long = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject aim_lat = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject alt_angle = (SubLObject)acip.$float87$0_9272952180016123;
        final SubLObject trace_start = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject trace_freq = (SubLObject)acip.ONE_INTEGER;
        final SubLObject points = generate_projectile_trace((SubLObject)ConsesLow.list(start_long, start_lat, start_alt), (SubLObject)ConsesLow.list(aim_long, aim_lat, alt_angle), (SubLObject)ConsesLow.list(muzzle_vel, start_time, gravity), (SubLObject)ConsesLow.list(trace_count, trace_start, trace_freq));
        final SubLObject observations = acip_construct_single_sensor_observations(acip.$const88$ACIP_Radar_001, points);
        SubLObject stream = (SubLObject)acip.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)acip.NIL, thread);
                stream = compatibility.open_text(full_filename, (SubLObject)acip.$kw89$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)acip.$str90$Unable_to_open__S, full_filename);
            }
            final SubLObject stream_$13 = stream;
            final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding(thread);
            try {
                reader.$read_default_float_format$.bind((SubLObject)acip.$sym91$DOUBLE_FLOAT, thread);
                PrintLow.format(stream_$13, (SubLObject)acip.$str92$___ACIP_Defender_Observation_Simu);
                PrintLow.format(stream_$13, (SubLObject)acip.$str93$_____Test_Suite_1__);
                PrintLow.format(stream_$13, (SubLObject)acip.$str94$_______observations__________D_to, trace_count);
                PrintLow.format(stream_$13, (SubLObject)acip.$str95$_______first_observation_____D_se, trace_start);
                PrintLow.format(stream_$13, (SubLObject)acip.$str96$_______observation_freq______D_se, trace_freq);
                SubLObject cdolist_list_var = observations;
                SubLObject observation = (SubLObject)acip.NIL;
                observation = cdolist_list_var.first();
                while (acip.NIL != cdolist_list_var) {
                    streams_high.terpri(stream_$13);
                    format_cycl_expression.format_cycl_expression(observation, stream_$13, (SubLObject)acip.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    observation = cdolist_list_var.first();
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)acip.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)acip.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return full_filename;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 17593L)
    public static SubLObject acip_generate_test_suite_2_simulation_file(final SubLObject directory, final SubLObject observation_count) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert acip.NIL != Filesys.directory_p(directory) : directory;
        assert acip.NIL != subl_promotions.non_negative_integer_p(observation_count) : observation_count;
        final SubLObject filename = PrintLow.format((SubLObject)acip.NIL, (SubLObject)acip.$str83$observations__3__0D, observation_count);
        final SubLObject full_filename = file_utilities.relative_filename(directory, filename, (SubLObject)acip.$str84$txt);
        final SubLObject gravity = (SubLObject)acip.$float74$_9_8;
        final SubLObject start_time = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject start_long = (SubLObject)acip.$int85$10000;
        final SubLObject start_lat = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject start_alt = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject muzzle_vel = (SubLObject)acip.$int86$800;
        final SubLObject aim_long = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject aim_lat = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject alt_angle = (SubLObject)acip.$float87$0_9272952180016123;
        final SubLObject impact_time = (SubLObject)acip.$float98$65_3;
        final SubLObject trace_start = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject trace_freq = Numbers.divide(impact_time, number_utilities.f_1_(observation_count));
        final SubLObject trace_freq_to_use = trace_freq.numG((SubLObject)acip.ONE_INTEGER) ? Numbers.truncate(trace_freq, (SubLObject)acip.UNPROVIDED) : trace_freq;
        final SubLObject points = generate_projectile_trace((SubLObject)ConsesLow.list(start_long, start_lat, start_alt), (SubLObject)ConsesLow.list(aim_long, aim_lat, alt_angle), (SubLObject)ConsesLow.list(muzzle_vel, start_time, gravity), (SubLObject)ConsesLow.list(observation_count, trace_start, trace_freq_to_use));
        final SubLObject observations = acip_construct_single_sensor_observations(acip.$const88$ACIP_Radar_001, points);
        SubLObject stream = (SubLObject)acip.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)acip.NIL, thread);
                stream = compatibility.open_text(full_filename, (SubLObject)acip.$kw89$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)acip.$str90$Unable_to_open__S, full_filename);
            }
            final SubLObject stream_$14 = stream;
            final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding(thread);
            try {
                reader.$read_default_float_format$.bind((SubLObject)acip.$sym91$DOUBLE_FLOAT, thread);
                PrintLow.format(stream_$14, (SubLObject)acip.$str92$___ACIP_Defender_Observation_Simu);
                PrintLow.format(stream_$14, (SubLObject)acip.$str99$_____Test_Suite_2__);
                PrintLow.format(stream_$14, (SubLObject)acip.$str94$_______observations__________D_to, observation_count);
                PrintLow.format(stream_$14, (SubLObject)acip.$str95$_______first_observation_____D_se, trace_start);
                PrintLow.format(stream_$14, (SubLObject)acip.$str100$_______observation_freq______S_se, number_utilities.four_significant_digits(trace_freq_to_use));
                SubLObject cdolist_list_var = observations;
                SubLObject observation = (SubLObject)acip.NIL;
                observation = cdolist_list_var.first();
                while (acip.NIL != cdolist_list_var) {
                    streams_high.terpri(stream_$14);
                    format_cycl_expression.format_cycl_expression(observation, stream_$14, (SubLObject)acip.UNPROVIDED);
                    cdolist_list_var = cdolist_list_var.rest();
                    observation = cdolist_list_var.first();
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)acip.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)acip.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return full_filename;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 19660L)
    public static SubLObject acip_generate_test_suite_3_simulation_file(final SubLObject directory, final SubLObject traces, final SubLObject observations_per_trace) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert acip.NIL != Filesys.directory_p(directory) : directory;
        assert acip.NIL != subl_promotions.non_negative_integer_p(traces) : traces;
        assert acip.NIL != subl_promotions.non_negative_integer_p(observations_per_trace) : observations_per_trace;
        final SubLObject filename = PrintLow.format((SubLObject)acip.NIL, (SubLObject)acip.$str102$observations__2__0D__3__0D, traces, observations_per_trace);
        final SubLObject full_filename = file_utilities.relative_filename(directory, filename, (SubLObject)acip.$str84$txt);
        final SubLObject gravity = (SubLObject)acip.$float74$_9_8;
        final SubLObject start_time = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject muzzle_vel = (SubLObject)acip.$int86$800;
        final SubLObject total_observations = Numbers.multiply(traces, observations_per_trace);
        final SubLObject impact_time = (SubLObject)acip.$float98$65_3;
        final SubLObject trace_start = (SubLObject)acip.ZERO_INTEGER;
        final SubLObject trace_freq = Numbers.divide(impact_time, number_utilities.f_1_(observations_per_trace));
        final SubLObject trace_freq_to_use = trace_freq.numG((SubLObject)acip.ONE_INTEGER) ? Numbers.truncate(trace_freq, (SubLObject)acip.UNPROVIDED) : trace_freq;
        SubLObject observations = (SubLObject)acip.NIL;
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
        for (trace_number = (SubLObject)acip.NIL, trace_number = (SubLObject)acip.ZERO_INTEGER; trace_number.numL(traces); trace_number = Numbers.add(trace_number, (SubLObject)acip.ONE_INTEGER)) {
            trace_lat = Numbers.add(Numbers.multiply((SubLObject)acip.$int103$100, Numbers.expt(trace_number, (SubLObject)acip.TWO_INTEGER)), Numbers.multiply((SubLObject)acip.$int104$1000, trace_number));
            start_long = (SubLObject)acip.$int85$10000;
            start_lat = trace_lat;
            start_alt = (SubLObject)acip.ZERO_INTEGER;
            aim_long = (SubLObject)acip.ZERO_INTEGER;
            aim_lat = trace_lat;
            alt_angle = (SubLObject)acip.$float87$0_9272952180016123;
            points = generate_projectile_trace((SubLObject)ConsesLow.list(start_long, start_lat, start_alt), (SubLObject)ConsesLow.list(aim_long, aim_lat, alt_angle), (SubLObject)ConsesLow.list(muzzle_vel, start_time, gravity), (SubLObject)ConsesLow.list(observations_per_trace, trace_start, trace_freq_to_use));
            trace_observations = (cdolist_list_var = acip_construct_single_sensor_observations(acip.$const88$ACIP_Radar_001, points));
            trace_observation = (SubLObject)acip.NIL;
            trace_observation = cdolist_list_var.first();
            while (acip.NIL != cdolist_list_var) {
                observations = (SubLObject)ConsesLow.cons(trace_observation, observations);
                cdolist_list_var = cdolist_list_var.rest();
                trace_observation = cdolist_list_var.first();
            }
        }
        observations = Sort.sort(observations, Symbols.symbol_function((SubLObject)acip.$sym105$ACIP_SUITE_3_OBSERVATION__), (SubLObject)acip.UNPROVIDED);
        SubLObject stream = (SubLObject)acip.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)acip.NIL, thread);
                stream = compatibility.open_text(full_filename, (SubLObject)acip.$kw89$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)acip.$str90$Unable_to_open__S, full_filename);
            }
            final SubLObject stream_$15 = stream;
            final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding(thread);
            try {
                reader.$read_default_float_format$.bind((SubLObject)acip.$sym91$DOUBLE_FLOAT, thread);
                PrintLow.format(stream_$15, (SubLObject)acip.$str92$___ACIP_Defender_Observation_Simu);
                PrintLow.format(stream_$15, (SubLObject)acip.$str106$_____Test_Suite_3__);
                PrintLow.format(stream_$15, (SubLObject)acip.$str107$_______traces________________D_to, traces);
                PrintLow.format(stream_$15, (SubLObject)acip.$str108$_______observations__________D_pe, observations_per_trace, total_observations);
                PrintLow.format(stream_$15, (SubLObject)acip.$str95$_______first_observation_____D_se, trace_start);
                PrintLow.format(stream_$15, (SubLObject)acip.$str100$_______observation_freq______S_se, number_utilities.four_significant_digits(trace_freq_to_use));
                SubLObject cdolist_list_var2 = observations;
                SubLObject observation = (SubLObject)acip.NIL;
                observation = cdolist_list_var2.first();
                while (acip.NIL != cdolist_list_var2) {
                    streams_high.terpri(stream_$15);
                    format_cycl_expression.format_cycl_expression(observation, stream_$15, (SubLObject)acip.UNPROVIDED);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    observation = cdolist_list_var2.first();
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)acip.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)acip.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return full_filename;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 22371L)
    public static SubLObject acip_suite_3_observation_L(final SubLObject observation1, final SubLObject observation2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(observation1, (SubLObject)acip.$list109);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (acip.NIL != success) {
            final SubLObject time_1 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym110$TIME_1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject lat_1 = list_utilities.alist_lookup_without_values(v_bindings, (SubLObject)acip.$sym111$LAT_1, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject success_$16 = formula_pattern_match.formula_matches_pattern(observation2, (SubLObject)acip.$list112);
            final SubLObject v_bindings_$17 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (acip.NIL != success_$16) {
                final SubLObject time_2 = list_utilities.alist_lookup_without_values(v_bindings_$17, (SubLObject)acip.$sym113$TIME_2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                final SubLObject lat_2 = list_utilities.alist_lookup_without_values(v_bindings_$17, (SubLObject)acip.$sym114$LAT_2, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                if (time_1.numL(time_2)) {
                    return (SubLObject)acip.T;
                }
                if (time_2.numL(time_1)) {
                    return (SubLObject)acip.NIL;
                }
                if (lat_1.numL(lat_2)) {
                    return (SubLObject)acip.T;
                }
                if (lat_2.numL(lat_1)) {
                    return (SubLObject)acip.NIL;
                }
                return (SubLObject)acip.NIL;
            }
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 23446L)
    public static SubLObject clear_defender_observation_mt(SubLObject mt) {
        if (mt == acip.UNPROVIDED) {
            mt = acip.$acip_defender_observation_mt$.getGlobalValue();
        }
        final SubLObject gafs = kb_mapping.gather_mt_index(mt);
        SubLObject total = (SubLObject)acip.ZERO_INTEGER;
        SubLObject cdolist_list_var = gafs;
        SubLObject gaf = (SubLObject)acip.NIL;
        gaf = cdolist_list_var.first();
        while (acip.NIL != cdolist_list_var) {
            if (acip.NIL != assertions_high.asserted_assertionP(gaf) && acip.NIL != assertion_handles.valid_assertionP(gaf, (SubLObject)acip.UNPROVIDED)) {
                tms.tms_remove_assertion(gaf);
                total = Numbers.add(total, (SubLObject)acip.ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        }
        return total;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 23750L)
    public static SubLObject acip_run_defender_simulation_file(final SubLObject simulation_file, SubLObject trace_stream) {
        if (trace_stream == acip.UNPROVIDED) {
            trace_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject observations = acip_load_defender_observations(simulation_file);
        return acip_run_defender_simulation(observations, trace_stream);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 24469L)
    public static SubLObject acip_run_defender_simulation(final SubLObject observations, SubLObject trace_stream) {
        if (trace_stream == acip.UNPROVIDED) {
            trace_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (acip.NIL != trace_stream && !assertionsDisabledInClass && acip.NIL == Types.streamp(trace_stream)) {
            throw new AssertionError(trace_stream);
        }
        final SubLObject observation_mt = acip.$acip_defender_observation_mt$.getGlobalValue();
        SubLObject running_result = (SubLObject)acip.NIL;
        SubLObject total_time = (SubLObject)acip.NIL;
        clear_defender_observation_mt(observation_mt);
        if (acip.NIL != trace_stream) {
            inference_metrics.reset_inference_metrics();
        }
        Storage.gc_ephemeral();
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
            utilities_macros.$progress_note$.bind((SubLObject)acip.$str119$cdolist, thread);
            utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
            utilities_macros.$progress_total$.bind(Sequences.length(observations), thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)acip.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)acip.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)acip.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)acip.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = observations;
                SubLObject observation = (SubLObject)acip.NIL;
                observation = csome_list_var.first();
                while (acip.NIL != csome_list_var) {
                    final SubLObject _prev_bind_0_$18 = forward.$assume_forward_deduction_is_wfP$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$19 = abnormal.$abnormality_transformation_depth$.currentBinding(thread);
                    try {
                        forward.$assume_forward_deduction_is_wfP$.bind((SubLObject)acip.T, thread);
                        abnormal.$abnormality_transformation_depth$.bind((SubLObject)acip.TWO_INTEGER, thread);
                        cyc_kernel.cyc_assert_wff(observation, observation_mt, (SubLObject)acip.UNPROVIDED);
                    }
                    finally {
                        abnormal.$abnormality_transformation_depth$.rebind(_prev_bind_1_$19, thread);
                        forward.$assume_forward_deduction_is_wfP$.rebind(_prev_bind_0_$18, thread);
                    }
                    running_result = inference_kernel.new_cyc_query((SubLObject)acip.$list120, acip.$const121$ACIPDefenderModelMt, (SubLObject)acip.$list122);
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)acip.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    observation = csome_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$19 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)acip.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
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
        total_time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        if (acip.NIL != trace_stream) {
            streams_high.terpri(trace_stream);
            PrintLow.format(trace_stream, (SubLObject)acip.$str123$__Total_time_____________________, number_utilities.significant_digits(total_time, (SubLObject)acip.FOUR_INTEGER));
            inference_metrics.show_inference_metrics(trace_stream);
            streams_high.terpri(trace_stream);
        }
        return running_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 25600L)
    public static SubLObject acip_run_single_sensor_defender_simulation(final SubLObject sensor, final SubLObject points, SubLObject trace_stream) {
        if (trace_stream == acip.UNPROVIDED) {
            trace_stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject observations = acip_construct_single_sensor_observations(sensor, points);
        return acip_run_defender_simulation(observations, trace_stream);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 25874L)
    public static SubLObject clear_acip_load_defender_observations() {
        final SubLObject cs = acip.$acip_load_defender_observations_caching_state$.getGlobalValue();
        if (acip.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 25874L)
    public static SubLObject remove_acip_load_defender_observations(final SubLObject simulation_file) {
        return memoization_state.caching_state_remove_function_results_with_args(acip.$acip_load_defender_observations_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(simulation_file), (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 25874L)
    public static SubLObject acip_load_defender_observations_internal(final SubLObject simulation_file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert acip.NIL != Types.stringp(simulation_file) : simulation_file;
        SubLObject observations = (SubLObject)acip.NIL;
        SubLObject stream = (SubLObject)acip.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)acip.NIL, thread);
                stream = compatibility.open_text(simulation_file, (SubLObject)acip.$kw126$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)acip.$str90$Unable_to_open__S, simulation_file);
            }
            final SubLObject stream_$21 = stream;
            final SubLObject _prev_bind_2 = reader.$read_default_float_format$.currentBinding(thread);
            try {
                reader.$read_default_float_format$.bind((SubLObject)acip.$sym91$DOUBLE_FLOAT, thread);
                SubLObject observation;
                for (observation = (SubLObject)acip.NIL, observation = reader.read(stream_$21, (SubLObject)acip.NIL, (SubLObject)acip.$kw127$EOF, (SubLObject)acip.UNPROVIDED); observation != acip.$kw127$EOF; observation = reader.read(stream_$21, (SubLObject)acip.NIL, (SubLObject)acip.$kw127$EOF, (SubLObject)acip.UNPROVIDED)) {
                    observations = (SubLObject)ConsesLow.cons(observation, observations);
                }
            }
            finally {
                reader.$read_default_float_format$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)acip.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)acip.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return Sequences.nreverse(observations);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 25874L)
    public static SubLObject acip_load_defender_observations(final SubLObject simulation_file) {
        SubLObject caching_state = acip.$acip_load_defender_observations_caching_state$.getGlobalValue();
        if (acip.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)acip.$sym124$ACIP_LOAD_DEFENDER_OBSERVATIONS, (SubLObject)acip.$sym128$_ACIP_LOAD_DEFENDER_OBSERVATIONS_CACHING_STATE_, (SubLObject)acip.NIL, (SubLObject)acip.EQUAL, (SubLObject)acip.ONE_INTEGER, (SubLObject)acip.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, simulation_file, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(acip_load_defender_observations_internal(simulation_file)));
            memoization_state.caching_state_put(caching_state, simulation_file, results, (SubLObject)acip.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 26366L)
    public static SubLObject acip_construct_single_sensor_observations(final SubLObject sensor, final SubLObject points) {
        SubLObject observations = (SubLObject)acip.NIL;
        SubLObject cdolist_list_var = points;
        SubLObject point = (SubLObject)acip.NIL;
        point = cdolist_list_var.first();
        while (acip.NIL != cdolist_list_var) {
            final SubLObject observation = el_utilities.make_binary_formula(acip.$const129$sensorObservation, sensor, point);
            observations = (SubLObject)ConsesLow.cons(observation, observations);
            cdolist_list_var = cdolist_list_var.rest();
            point = cdolist_list_var.first();
        }
        return Sequences.nreverse(observations);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 28315L)
    public static SubLObject save_acip_partition(final SubLObject filename) {
        return partitions.save_partition(filename, acip.$acip_partition$.getGlobalValue());
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 29315L)
    public static SubLObject acip_subkernel_p(final SubLObject v_object) {
        return list_utilities.member_eqP(v_object, acip.$acip_subkernels$.getGlobalValue());
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 29462L)
    public static SubLObject with_acip_subkernel_extraction(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)acip.$list134);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject allow_other_keys_p = (SubLObject)acip.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)acip.NIL;
        SubLObject current_$22 = (SubLObject)acip.NIL;
        while (acip.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)acip.$list134);
            current_$22 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)acip.$list134);
            if (acip.NIL == conses_high.member(current_$22, (SubLObject)acip.$list135, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED)) {
                bad = (SubLObject)acip.T;
            }
            if (current_$22 == acip.$kw136$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (acip.NIL != bad && acip.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)acip.$list134);
        }
        final SubLObject subkernel_tail = cdestructuring_bind.property_list_member((SubLObject)acip.$kw137$SUBKERNEL, current);
        final SubLObject subkernel = (SubLObject)((acip.NIL != subkernel_tail) ? conses_high.cadr(subkernel_tail) : acip.NIL);
        final SubLObject filename_tail = cdestructuring_bind.property_list_member((SubLObject)acip.$kw138$FILENAME, current);
        final SubLObject filename = (SubLObject)((acip.NIL != filename_tail) ? conses_high.cadr(filename_tail) : acip.NIL);
        final SubLObject body;
        current = (body = temp);
        final SubLObject subkernel_var = (SubLObject)acip.$sym139$SUBKERNEL_VAR;
        final SubLObject filename_var = (SubLObject)acip.$sym140$FILENAME_VAR;
        final SubLObject stream = (SubLObject)acip.$sym141$STREAM;
        return (SubLObject)ConsesLow.list((SubLObject)acip.$sym142$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(subkernel_var, subkernel), (SubLObject)ConsesLow.list(filename_var, filename)), (SubLObject)ConsesLow.listS((SubLObject)acip.$sym143$CHECK_TYPE, subkernel_var, (SubLObject)acip.$list144), (SubLObject)ConsesLow.listS((SubLObject)acip.$sym143$CHECK_TYPE, filename_var, (SubLObject)acip.$list145), (SubLObject)ConsesLow.listS((SubLObject)acip.$sym146$CUNWIND_PROTECT, (SubLObject)ConsesLow.listS((SubLObject)acip.$sym147$WITH_PRIVATE_BINARY_FILE, (SubLObject)ConsesLow.listS(stream, filename_var, (SubLObject)acip.$list148), (SubLObject)ConsesLow.list((SubLObject)acip.$sym149$CSETQ, (SubLObject)acip.$sym150$_ACIP_SUBKERNEL_OUTPUT_STREAM_, stream), (SubLObject)ConsesLow.list((SubLObject)acip.$sym149$CSETQ, (SubLObject)acip.$sym151$_ACIP_SUBKERNEL_EXTRACTION_, subkernel_var), (SubLObject)ConsesLow.list((SubLObject)acip.$sym152$CFASL_OUTPUT, subkernel_var, stream), ConsesLow.append(body, (SubLObject)acip.NIL)), (SubLObject)acip.$list153));
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 30360L)
    public static SubLObject acip_run_subkernel_simulation(final SubLObject filename, SubLObject sample_trials, SubLObject throwaway_trials) {
        if (sample_trials == acip.UNPROVIDED) {
            sample_trials = (SubLObject)acip.ONE_INTEGER;
        }
        if (throwaway_trials == acip.UNPROVIDED) {
            throwaway_trials = (SubLObject)acip.ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert acip.NIL != Types.stringp(filename) : filename;
        assert acip.NIL != subl_promotions.positive_integer_p(sample_trials) : sample_trials;
        assert acip.NIL != subl_promotions.non_negative_integer_p(throwaway_trials) : throwaway_trials;
        if (acip.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && acip.NIL == Filesys.probe_file(filename)) {
            Errors.error((SubLObject)acip.$str155$File__S_not_found_, filename);
        }
        final SubLObject total_trials = Numbers.add(throwaway_trials, sample_trials);
        final SubLObject message = Sequences.cconcatenate((SubLObject)acip.$str156$Performing_, new SubLObject[] { format_nil.format_nil_a_no_copy(total_trials), acip.$str157$_trial, format_nil.format_nil_a_no_copy((SubLObject)(total_trials.numG((SubLObject)acip.ONE_INTEGER) ? acip.$str158$s : acip.$str159$)), acip.$str160$_of_subkernel });
        SubLObject trial_times = (SubLObject)acip.NIL;
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
            utilities_macros.$progress_total$.bind(total_trials, thread);
            utilities_macros.$progress_sofar$.bind((SubLObject)acip.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)acip.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)acip.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)acip.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                SubLObject trial;
                SubLObject harness_time;
                SubLObject simulation_time;
                SubLObject trial_time;
                for (trial = (SubLObject)acip.NIL, trial = (SubLObject)acip.ZERO_INTEGER; trial.numL(utilities_macros.$progress_total$.getDynamicValue(thread)); trial = Numbers.add(trial, (SubLObject)acip.ONE_INTEGER)) {
                    harness_time = acip_run_subkernel_simulation_int(filename, (SubLObject)acip.T);
                    simulation_time = acip_run_subkernel_simulation_int(filename, (SubLObject)acip.NIL);
                    trial_time = Numbers.subtract(simulation_time, harness_time);
                    if (!trial.numL(throwaway_trials)) {
                        trial_times = (SubLObject)ConsesLow.cons(trial_time, trial_times);
                    }
                    utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)acip.ONE_INTEGER), thread);
                    utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                }
            }
            finally {
                final SubLObject _prev_bind_0_$23 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)acip.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
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
        trial_times = Sequences.nreverse(trial_times);
        final SubLObject median = number_utilities.median(trial_times, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
        thread.resetMultipleValues();
        final SubLObject stdev = number_utilities.standard_deviation(trial_times);
        final SubLObject mean = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return Values.values(median, mean, stdev);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 31898L)
    public static SubLObject acip_run_subkernel_simulation_int(final SubLObject filename, final SubLObject harness_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject time = (SubLObject)acip.NIL;
        Storage.gc_ephemeral();
        SubLObject stream = (SubLObject)acip.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)acip.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)acip.$kw126$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)acip.$str90$Unable_to_open__S, filename);
            }
            final SubLObject stream_$24 = stream;
            final SubLObject _prev_bind_2 = cfasl.$cfasl_stream_extensions_enabled$.currentBinding(thread);
            final SubLObject _prev_bind_3 = cfasl.$cfasl_unread_byte$.currentBinding(thread);
            try {
                cfasl.$cfasl_stream_extensions_enabled$.bind((SubLObject)acip.T, thread);
                cfasl.$cfasl_unread_byte$.bind((SubLObject)acip.NIL, thread);
                final SubLObject pcase_var;
                final SubLObject subkernel = pcase_var = cfasl.cfasl_input(stream_$24, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
                if (pcase_var.eql((SubLObject)acip.$kw161$LIST_HASHING)) {
                    final SubLObject time_var = Time.get_internal_real_time();
                    acip_run_subkernel_list_hashing(stream_$24, harness_onlyP);
                    time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else if (pcase_var.eql((SubLObject)acip.$kw162$UNIFICATION)) {
                    final SubLObject time_var = Time.get_internal_real_time();
                    acip_run_subkernel_unification(stream_$24, harness_onlyP);
                    time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else if (pcase_var.eql((SubLObject)acip.$kw163$PATTERN_MATCH)) {
                    final SubLObject time_var = Time.get_internal_real_time();
                    acip_run_subkernel_pattern_match(stream_$24, harness_onlyP);
                    time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else if (pcase_var.eql((SubLObject)acip.$kw164$TACTIC_GENERATION)) {
                    final SubLObject time_var = Time.get_internal_real_time();
                    acip_run_subkernel_tactic_generation(stream_$24, harness_onlyP);
                    time = Numbers.divide(Numbers.subtract(Time.get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                }
                else {
                    Errors.error((SubLObject)acip.$str165$Time_to_support__S_subkernel_, subkernel);
                }
            }
            finally {
                cfasl.$cfasl_unread_byte$.rebind(_prev_bind_3, thread);
                cfasl.$cfasl_stream_extensions_enabled$.rebind(_prev_bind_2, thread);
            }
        }
        finally {
            final SubLObject _prev_bind_4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)acip.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)acip.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_4, thread);
            }
        }
        return time;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 32674L)
    public static SubLObject acip_note_subkernel_list_hashing_item(final SubLObject query, final SubLObject store) {
        if (acip.NIL != control_vars.$acip_subkernel_output_stream$.getGlobalValue()) {
            final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
            final SubLObject expected_sxhash = Sxhash.sxhash(query);
            cfasl.cfasl_output(store_id, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output(query, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output(expected_sxhash, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 33595L)
    public static SubLObject acip_run_subkernel_list_hashing(final SubLObject stream, final SubLObject harness_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (acip.$kw127$EOF != cfasl.cfasl_opcode_peek(stream, (SubLObject)acip.NIL, (SubLObject)acip.$kw127$EOF)) {
            final SubLObject store_id = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject query = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            SubLObject actual_sxhash;
            final SubLObject expected_sxhash = actual_sxhash = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            if (acip.NIL == harness_onlyP) {
                SubLObject i;
                for (i = (SubLObject)acip.NIL, i = (SubLObject)acip.ZERO_INTEGER; i.numL(acip.$acip_subkernel_list_hashing_iteration_count$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)acip.ONE_INTEGER)) {
                    actual_sxhash = Sxhash.sxhash(query);
                }
            }
            if (acip.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected_sxhash.numE(actual_sxhash)) {
                Errors.error((SubLObject)acip.$str167$Actual_hash_code__S_differs_from_, actual_sxhash, expected_sxhash);
            }
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 34219L)
    public static SubLObject acip_note_subkernel_unification_item(final SubLObject obj_trans, final SubLObject obj, final SubLObject share_varsP, final SubLObject expected_bindings) {
        if (acip.NIL != control_vars.$acip_subkernel_output_stream$.getGlobalValue()) {
            final SubLObject current_problem = inference_worker.currently_active_problem();
            if (acip.NIL != inference_datastructures_problem.problem_p(current_problem)) {
                final SubLObject store = inference_datastructures_problem.problem_store(current_problem);
                final SubLObject store_id = inference_datastructures_problem_store.problem_store_suid(store);
                final SubLObject problem_id = inference_datastructures_problem.problem_suid(current_problem);
                cfasl.cfasl_output(store_id, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
                cfasl.cfasl_output(problem_id, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
                cfasl.cfasl_output(obj_trans, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
                cfasl.cfasl_output(obj, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
                cfasl.cfasl_output(share_varsP, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
                cfasl.cfasl_output(expected_bindings, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            }
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 35383L)
    public static SubLObject acip_run_subkernel_unification(final SubLObject stream, final SubLObject harness_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (acip.$kw127$EOF != cfasl.cfasl_opcode_peek(stream, (SubLObject)acip.NIL, (SubLObject)acip.$kw127$EOF)) {
            final SubLObject store_id = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject problem_id = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject obj_trans = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject obj = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject share_varsP = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            SubLObject actual_bindings;
            final SubLObject expected_bindings = actual_bindings = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            if (acip.NIL == harness_onlyP) {
                SubLObject i;
                for (i = (SubLObject)acip.NIL, i = (SubLObject)acip.ZERO_INTEGER; i.numL(acip.$acip_subkernel_unification_iteration_count$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)acip.ONE_INTEGER)) {
                    actual_bindings = unification.unify_assuming_bindings(obj_trans, obj, share_varsP, (SubLObject)acip.NIL, (SubLObject)acip.UNPROVIDED);
                }
            }
            if (acip.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected_bindings.equal(actual_bindings)) {
                Errors.error((SubLObject)acip.$str169$Actual_bindings__S_differs_from_e, actual_bindings, expected_bindings);
            }
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 36206L)
    public static SubLObject acip_note_subkernel_pattern_match_item(final SubLObject pattern, final SubLObject formula, final SubLObject with_bindingsP, final SubLObject result, final SubLObject v_bindings) {
        if (acip.NIL != control_vars.$acip_subkernel_output_stream$.getGlobalValue()) {
            cfasl.cfasl_output(pattern, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output(formula, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output(with_bindingsP, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output(result, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output(v_bindings, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 37014L)
    public static SubLObject acip_run_subkernel_pattern_match(final SubLObject stream, final SubLObject harness_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (acip.$kw127$EOF != cfasl.cfasl_opcode_peek(stream, (SubLObject)acip.NIL, (SubLObject)acip.$kw127$EOF)) {
            final SubLObject pattern = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject formula = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject with_bindingsP = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject expected_result = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject expected_bindings = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            SubLObject actual_result = expected_result;
            SubLObject actual_bindings = expected_bindings;
            if (acip.NIL == harness_onlyP) {
                if (acip.NIL != with_bindingsP) {
                    SubLObject i;
                    SubLObject actual_result_$25;
                    SubLObject actual_bindings_$26;
                    for (i = (SubLObject)acip.NIL, i = (SubLObject)acip.ZERO_INTEGER; i.numL(acip.$acip_subkernel_pattern_match_iteration_count$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)acip.ONE_INTEGER)) {
                        thread.resetMultipleValues();
                        actual_result_$25 = formula_pattern_match.pattern_matches_formula(pattern, formula);
                        actual_bindings_$26 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        actual_result = actual_result_$25;
                        actual_bindings = actual_bindings_$26;
                    }
                }
                else {
                    SubLObject i;
                    for (i = (SubLObject)acip.NIL, i = (SubLObject)acip.ZERO_INTEGER; i.numL(acip.$acip_subkernel_pattern_match_iteration_count$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)acip.ONE_INTEGER)) {
                        actual_result = formula_pattern_match.pattern_matches_formula_without_bindings(pattern, formula);
                    }
                }
            }
            if (acip.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected_result.eql(actual_result)) {
                Errors.error((SubLObject)acip.$str170$Actual_result__S_differs_from_exp, actual_result, expected_result);
            }
            if (acip.NIL != with_bindingsP && acip.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected_bindings.equal(actual_bindings)) {
                Errors.error((SubLObject)acip.$str169$Actual_bindings__S_differs_from_e, actual_bindings, expected_bindings);
            }
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 38176L)
    public static SubLObject acip_note_subkernel_tactic_generation_item(final SubLObject hl_modules, final SubLObject mt, final SubLObject asent, final SubLObject sense, final SubLObject tactic_specs) {
        if (acip.NIL != control_vars.$acip_subkernel_output_stream$.getGlobalValue()) {
            final SubLObject encoded_hl_modules = acip_encode_hl_modules(hl_modules);
            final SubLObject encoded_tactic_specs = acip_encode_tactic_specs(tactic_specs);
            cfasl.cfasl_output(encoded_hl_modules, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output(mt, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output(asent, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output(sense, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output((SubLObject)acip.NIL, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output((SubLObject)acip.T, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
            cfasl.cfasl_output(encoded_tactic_specs, control_vars.$acip_subkernel_output_stream$.getGlobalValue());
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 39426L)
    public static SubLObject acip_run_subkernel_tactic_generation(final SubLObject stream, final SubLObject harness_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (acip.$kw127$EOF != cfasl.cfasl_opcode_peek(stream, (SubLObject)acip.NIL, (SubLObject)acip.$kw127$EOF)) {
            final SubLObject encoded_hl_modules = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject mt = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject asent = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject sense = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject allow_last_resortP = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject completeness_handlingP = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
            final SubLObject encoded_tactic_specs = cfasl.cfasl_input(stream, (SubLObject)acip.UNPROVIDED, (SubLObject)acip.UNPROVIDED);
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
                if (acip.NIL == harness_onlyP) {
                    SubLObject i;
                    for (i = (SubLObject)acip.NIL, i = (SubLObject)acip.ZERO_INTEGER; i.numL(acip.$acip_subkernel_tactic_generation_iteration_count$.getDynamicValue(thread)); i = Numbers.add(i, (SubLObject)acip.ONE_INTEGER)) {
                        actual_result = inference_worker_removal.determine_new_removal_tactic_specs_from_hl_modules(hl_modules, asent, sense);
                    }
                }
            }
            finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            if (acip.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && acip.NIL == acip_equal_tactic_specs(expected_result, actual_result)) {
                Errors.error((SubLObject)acip.$str170$Actual_result__S_differs_from_exp, actual_result, expected_result);
            }
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 40601L)
    public static SubLObject acip_equal_tactic_specs(final SubLObject tactic_specs1, final SubLObject tactic_specs2) {
        if (acip.NIL == list_utilities.same_length_p(tactic_specs1, tactic_specs2)) {
            return (SubLObject)acip.NIL;
        }
        SubLObject tactic_spec1 = (SubLObject)acip.NIL;
        SubLObject tactic_spec1_$27 = (SubLObject)acip.NIL;
        SubLObject tactic_spec2 = (SubLObject)acip.NIL;
        SubLObject tactic_spec2_$28 = (SubLObject)acip.NIL;
        tactic_spec1 = tactic_specs1;
        tactic_spec1_$27 = tactic_spec1.first();
        tactic_spec2 = tactic_specs2;
        tactic_spec2_$28 = tactic_spec2.first();
        while (acip.NIL != tactic_spec2 || acip.NIL != tactic_spec1) {
            if (acip.NIL == acip_equal_tactic_spec(tactic_spec1_$27, tactic_spec2_$28)) {
                return (SubLObject)acip.NIL;
            }
            tactic_spec1 = tactic_spec1.rest();
            tactic_spec1_$27 = tactic_spec1.first();
            tactic_spec2 = tactic_spec2.rest();
            tactic_spec2_$28 = tactic_spec2.first();
        }
        return (SubLObject)acip.T;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 40914L)
    public static SubLObject acip_equal_tactic_spec(final SubLObject tactic_spec1, final SubLObject tactic_spec2) {
        SubLObject hl_module1 = (SubLObject)acip.NIL;
        SubLObject productivity1 = (SubLObject)acip.NIL;
        SubLObject completeness1 = (SubLObject)acip.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(tactic_spec1, tactic_spec1, (SubLObject)acip.$list171);
        hl_module1 = tactic_spec1.first();
        SubLObject current = tactic_spec1.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tactic_spec1, (SubLObject)acip.$list171);
        productivity1 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, tactic_spec1, (SubLObject)acip.$list171);
        completeness1 = current.first();
        current = current.rest();
        if (acip.NIL == current) {
            SubLObject hl_module2 = (SubLObject)acip.NIL;
            SubLObject productivity2 = (SubLObject)acip.NIL;
            SubLObject completeness2 = (SubLObject)acip.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(tactic_spec2, tactic_spec2, (SubLObject)acip.$list172);
            hl_module2 = tactic_spec2.first();
            SubLObject current_$30 = tactic_spec2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$30, tactic_spec2, (SubLObject)acip.$list172);
            productivity2 = current_$30.first();
            current_$30 = current_$30.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$30, tactic_spec2, (SubLObject)acip.$list172);
            completeness2 = current_$30.first();
            current_$30 = current_$30.rest();
            if (acip.NIL == current_$30) {
                if (!hl_module1.equal(hl_module2) || !completeness1.equal(completeness2)) {
                    return (SubLObject)acip.NIL;
                }
                return (SubLObject)SubLObjectFactory.makeBoolean(productivity1.equal(productivity2) || acip.NIL != list_utilities.member_eqP(inference_modules.hl_module_name(hl_module1), (SubLObject)acip.$list173));
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(tactic_spec2, (SubLObject)acip.$list172);
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(tactic_spec1, (SubLObject)acip.$list171);
        }
        return (SubLObject)acip.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 41425L)
    public static SubLObject acip_encode_hl_modules(final SubLObject hl_modules) {
        return Mapping.mapcar(Symbols.symbol_function((SubLObject)acip.$sym174$HL_MODULE_NAME), hl_modules);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 41558L)
    public static SubLObject acip_ndecode_hl_modules(final SubLObject encoded_hl_modules) {
        return list_utilities.nmapcar(Symbols.symbol_function((SubLObject)acip.$sym175$FIND_HL_MODULE_BY_NAME), encoded_hl_modules);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 41683L)
    public static SubLObject acip_encode_tactic_specs(final SubLObject tactic_specs) {
        SubLObject encoded = (SubLObject)acip.NIL;
        SubLObject cdolist_list_var = tactic_specs;
        SubLObject tactic_spec = (SubLObject)acip.NIL;
        tactic_spec = cdolist_list_var.first();
        while (acip.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tactic_spec;
            SubLObject hl_module = (SubLObject)acip.NIL;
            SubLObject productivity = (SubLObject)acip.NIL;
            SubLObject completeness = (SubLObject)acip.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)acip.$list176);
            hl_module = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)acip.$list176);
            productivity = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)acip.$list176);
            completeness = current.first();
            current = current.rest();
            if (acip.NIL == current) {
                encoded = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(inference_modules.hl_module_name(hl_module), productivity, completeness), encoded);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)acip.$list176);
            }
            cdolist_list_var = cdolist_list_var.rest();
            tactic_spec = cdolist_list_var.first();
        }
        return Sequences.nreverse(encoded);
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 41990L)
    public static SubLObject acip_ndecode_tactic_specs(final SubLObject encoded_tactic_specs) {
        SubLObject cdolist_list_var = encoded_tactic_specs;
        SubLObject encoded_tactic_spec = (SubLObject)acip.NIL;
        encoded_tactic_spec = cdolist_list_var.first();
        while (acip.NIL != cdolist_list_var) {
            ConsesLow.rplaca(encoded_tactic_spec, inference_modules.find_hl_module_by_name(encoded_tactic_spec.first()));
            cdolist_list_var = cdolist_list_var.rest();
            encoded_tactic_spec = cdolist_list_var.first();
        }
        return encoded_tactic_specs;
    }

    @SubLTranslatedFile.SubL(source = "cycl/acip.lisp", position = 42225L)
    public static SubLObject run_acip_tests(SubLObject stream) {
        if (stream == acip.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        return generic_testing.run_test_case_tables((SubLObject)acip.$list177, stream, (SubLObject)acip.$kw178$TERSE, (SubLObject)acip.UNPROVIDED);
    }

    public static SubLObject declare_acip_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "cyc_list_of_2_real_numbers", "CYC-LIST-OF-2-REAL-NUMBERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "cyc_list_of_3_real_numbers", "CYC-LIST-OF-3-REAL-NUMBERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "cyc_point_4_time", "CYC-POINT-4-TIME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "cyc_quad_coeff", "CYC-QUAD-COEFF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "quad_coeff", "QUAD-COEFF", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "cyc_arbitrary_path_4d_ordering", "CYC-ARBITRARY-PATH-4D-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "cyc_arbitrary_path_4d_ordering_int", "CYC-ARBITRARY-PATH-4D-ORDERING-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "cyc_arbitrary_path_point_4d_ordering", "CYC-ARBITRARY-PATH-POINT-4D-ORDERING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "cyc_equals_quad_3d", "CYC-EQUALS-QUAD-3D", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "cyc_equals_quad_3d_int", "CYC-EQUALS-QUAD-3D-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "cyc_point_matches_quad_3d", "CYC-POINT-MATCHES-QUAD-3D", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "cyc_point_matches_quad_3d_int", "CYC-POINT-MATCHES-QUAD-3D-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "generate_projectile_trace", "GENERATE-PROJECTILE-TRACE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_generate_test_suite_1_simulation_file", "ACIP-GENERATE-TEST-SUITE-1-SIMULATION-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_generate_test_suite_2_simulation_file", "ACIP-GENERATE-TEST-SUITE-2-SIMULATION-FILE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_generate_test_suite_3_simulation_file", "ACIP-GENERATE-TEST-SUITE-3-SIMULATION-FILE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_suite_3_observation_L", "ACIP-SUITE-3-OBSERVATION-<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "clear_defender_observation_mt", "CLEAR-DEFENDER-OBSERVATION-MT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_run_defender_simulation_file", "ACIP-RUN-DEFENDER-SIMULATION-FILE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_run_defender_simulation", "ACIP-RUN-DEFENDER-SIMULATION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_run_single_sensor_defender_simulation", "ACIP-RUN-SINGLE-SENSOR-DEFENDER-SIMULATION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "clear_acip_load_defender_observations", "CLEAR-ACIP-LOAD-DEFENDER-OBSERVATIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "remove_acip_load_defender_observations", "REMOVE-ACIP-LOAD-DEFENDER-OBSERVATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_load_defender_observations_internal", "ACIP-LOAD-DEFENDER-OBSERVATIONS-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_load_defender_observations", "ACIP-LOAD-DEFENDER-OBSERVATIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_construct_single_sensor_observations", "ACIP-CONSTRUCT-SINGLE-SENSOR-OBSERVATIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "save_acip_partition", "SAVE-ACIP-PARTITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_subkernel_p", "ACIP-SUBKERNEL-P", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.acip", "with_acip_subkernel_extraction", "WITH-ACIP-SUBKERNEL-EXTRACTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_run_subkernel_simulation", "ACIP-RUN-SUBKERNEL-SIMULATION", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_run_subkernel_simulation_int", "ACIP-RUN-SUBKERNEL-SIMULATION-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_note_subkernel_list_hashing_item", "ACIP-NOTE-SUBKERNEL-LIST-HASHING-ITEM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_run_subkernel_list_hashing", "ACIP-RUN-SUBKERNEL-LIST-HASHING", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_note_subkernel_unification_item", "ACIP-NOTE-SUBKERNEL-UNIFICATION-ITEM", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_run_subkernel_unification", "ACIP-RUN-SUBKERNEL-UNIFICATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_note_subkernel_pattern_match_item", "ACIP-NOTE-SUBKERNEL-PATTERN-MATCH-ITEM", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_run_subkernel_pattern_match", "ACIP-RUN-SUBKERNEL-PATTERN-MATCH", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_note_subkernel_tactic_generation_item", "ACIP-NOTE-SUBKERNEL-TACTIC-GENERATION-ITEM", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_run_subkernel_tactic_generation", "ACIP-RUN-SUBKERNEL-TACTIC-GENERATION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_equal_tactic_specs", "ACIP-EQUAL-TACTIC-SPECS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_equal_tactic_spec", "ACIP-EQUAL-TACTIC-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_encode_hl_modules", "ACIP-ENCODE-HL-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_ndecode_hl_modules", "ACIP-NDECODE-HL-MODULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_encode_tactic_specs", "ACIP-ENCODE-TACTIC-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "acip_ndecode_tactic_specs", "ACIP-NDECODE-TACTIC-SPECS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.acip", "run_acip_tests", "RUN-ACIP-TESTS", 0, 1, false);
        return (SubLObject)acip.NIL;
    }

    public static SubLObject init_acip_file() {
        acip.$quad_3d_tolerance_accel$ = SubLFiles.deflexical("*QUAD-3D-TOLERANCE-ACCEL*", (SubLObject)acip.$float30$0_1);
        acip.$quad_3d_tolerance_veloc$ = SubLFiles.deflexical("*QUAD-3D-TOLERANCE-VELOC*", (SubLObject)acip.ONE_INTEGER);
        acip.$quad_3d_tolerance_locat$ = SubLFiles.deflexical("*QUAD-3D-TOLERANCE-LOCAT*", (SubLObject)acip.TEN_INTEGER);
        acip.$acip_defender_observation_mt$ = SubLFiles.deflexical("*ACIP-DEFENDER-OBSERVATION-MT*", maybeDefault((SubLObject)acip.$sym115$_ACIP_DEFENDER_OBSERVATION_MT_, acip.$acip_defender_observation_mt$, acip.$const116$ACIPDefenderObservationMt));
        acip.$acip_load_defender_observations_caching_state$ = SubLFiles.deflexical("*ACIP-LOAD-DEFENDER-OBSERVATIONS-CACHING-STATE*", (SubLObject)acip.NIL);
        acip.$acip_partition$ = SubLFiles.deflexical("*ACIP-PARTITION*", (SubLObject)acip.$list130);
        acip.$acip_background_partition$ = SubLFiles.deflexical("*ACIP-BACKGROUND-PARTITION*", (SubLObject)acip.$list132);
        acip.$acip_subkernels$ = SubLFiles.deflexical("*ACIP-SUBKERNELS*", (SubLObject)acip.$list133);
        acip.$acip_subkernel_list_hashing_iteration_count$ = SubLFiles.defparameter("*ACIP-SUBKERNEL-LIST-HASHING-ITERATION-COUNT*", (SubLObject)acip.$int166$2000);
        acip.$acip_subkernel_unification_iteration_count$ = SubLFiles.defparameter("*ACIP-SUBKERNEL-UNIFICATION-ITERATION-COUNT*", (SubLObject)acip.$int168$200);
        acip.$acip_subkernel_pattern_match_iteration_count$ = SubLFiles.defparameter("*ACIP-SUBKERNEL-PATTERN-MATCH-ITERATION-COUNT*", (SubLObject)acip.$int168$200);
        acip.$acip_subkernel_tactic_generation_iteration_count$ = SubLFiles.defparameter("*ACIP-SUBKERNEL-TACTIC-GENERATION-ITERATION-COUNT*", (SubLObject)acip.$int103$100);
        return (SubLObject)acip.NIL;
    }

    public static SubLObject setup_acip_file() {
        utilities_macros.register_kb_function((SubLObject)acip.$sym1$CYC_LIST_OF_2_REAL_NUMBERS);
        utilities_macros.register_kb_function((SubLObject)acip.$sym2$CYC_LIST_OF_3_REAL_NUMBERS);
        utilities_macros.register_kb_function((SubLObject)acip.$sym4$CYC_POINT_4_TIME);
        utilities_macros.register_kb_function((SubLObject)acip.$sym6$CYC_QUAD_COEFF);
        generic_testing.define_test_case_table_int((SubLObject)acip.$sym6$CYC_QUAD_COEFF, (SubLObject)ConsesLow.list(new SubLObject[] { acip.$kw14$TEST, Symbols.symbol_function((SubLObject)acip.EQUAL), acip.$kw15$OWNER, acip.NIL, acip.$kw16$CLASSES, acip.NIL, acip.$kw17$KB, acip.$kw18$TINY, acip.$kw19$WORKING_, acip.T }), (SubLObject)acip.$list20);
        utilities_macros.register_kb_function((SubLObject)acip.$sym22$CYC_ARBITRARY_PATH_4D_ORDERING);
        generic_testing.define_test_case_table_int((SubLObject)acip.$sym22$CYC_ARBITRARY_PATH_4D_ORDERING, (SubLObject)ConsesLow.list(new SubLObject[] { acip.$kw14$TEST, acip.NIL, acip.$kw15$OWNER, acip.NIL, acip.$kw16$CLASSES, acip.NIL, acip.$kw17$KB, acip.$kw26$FULL, acip.$kw19$WORKING_, acip.T }), (SubLObject)acip.$list27);
        utilities_macros.register_kb_function((SubLObject)acip.$sym29$CYC_EQUALS_QUAD_3D);
        generic_testing.define_test_case_table_int((SubLObject)acip.$sym29$CYC_EQUALS_QUAD_3D, (SubLObject)ConsesLow.list(new SubLObject[] { acip.$kw14$TEST, acip.NIL, acip.$kw15$OWNER, acip.NIL, acip.$kw16$CLASSES, acip.NIL, acip.$kw17$KB, acip.$kw26$FULL, acip.$kw19$WORKING_, acip.T }), (SubLObject)acip.$list51);
        utilities_macros.register_kb_function((SubLObject)acip.$sym52$CYC_POINT_MATCHES_QUAD_3D);
        generic_testing.define_test_case_table_int((SubLObject)acip.$sym52$CYC_POINT_MATCHES_QUAD_3D, (SubLObject)ConsesLow.list(new SubLObject[] { acip.$kw14$TEST, acip.NIL, acip.$kw15$OWNER, acip.NIL, acip.$kw16$CLASSES, acip.NIL, acip.$kw17$KB, acip.$kw26$FULL, acip.$kw19$WORKING_, acip.T }), (SubLObject)acip.$list70);
        generic_testing.define_test_case_table_int((SubLObject)acip.$sym78$GENERATE_PROJECTILE_TRACE, (SubLObject)ConsesLow.list(new SubLObject[] { acip.$kw14$TEST, Symbols.symbol_function((SubLObject)acip.EQUAL), acip.$kw15$OWNER, acip.NIL, acip.$kw16$CLASSES, acip.NIL, acip.$kw17$KB, acip.$kw26$FULL, acip.$kw19$WORKING_, acip.T }), (SubLObject)acip.$list79);
        access_macros.register_external_symbol((SubLObject)acip.$sym80$ACIP_GENERATE_TEST_SUITE_1_SIMULATION_FILE);
        access_macros.register_external_symbol((SubLObject)acip.$sym97$ACIP_GENERATE_TEST_SUITE_2_SIMULATION_FILE);
        access_macros.register_external_symbol((SubLObject)acip.$sym101$ACIP_GENERATE_TEST_SUITE_3_SIMULATION_FILE);
        utilities_macros.note_funcall_helper_function((SubLObject)acip.$sym105$ACIP_SUITE_3_OBSERVATION__);
        subl_macro_promotions.declare_defglobal((SubLObject)acip.$sym115$_ACIP_DEFENDER_OBSERVATION_MT_);
        access_macros.register_external_symbol((SubLObject)acip.$sym117$ACIP_RUN_DEFENDER_SIMULATION_FILE);
        memoization_state.note_globally_cached_function((SubLObject)acip.$sym124$ACIP_LOAD_DEFENDER_OBSERVATIONS);
        access_macros.register_external_symbol((SubLObject)acip.$sym131$SAVE_ACIP_PARTITION);
        return (SubLObject)acip.NIL;
    }

    @Override
	public void declareFunctions() {
        declare_acip_file();
    }

    @Override
	public void initializeVariables() {
        init_acip_file();
    }

    @Override
	public void runTopLevelForms() {
        setup_acip_file();
    }

}

/*

	Total time: 573 ms
	 synthetic
*/