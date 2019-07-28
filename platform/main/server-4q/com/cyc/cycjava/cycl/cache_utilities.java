package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cache_utilities;
import com.cyc.cycjava.cycl.cfasl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.cache_utilities.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWENTY_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class cache_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new cache_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.cache_utilities";

    public static final String myFingerPrint = "71368893c14ebf91e8533b075b52502796e747590c06662ba6c45e36d155ff5e";

    // deflexical
    public static final SubLSymbol $cache_strategy_object_p_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-P-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_reset_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-RESET-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_cache_capacity_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_cache_size_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-CACHE-SIZE-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_track_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-TRACK-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_trackedP_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-TRACKED?-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_untrack_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-UNTRACK-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_supports_parameter_p_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_get_parameter_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-GET-PARAMETER-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_set_parameter_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-SET-PARAMETER-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_note_reference_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_note_references_in_order_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_get_metrics_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-GET-METRICS-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_reset_metrics_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-RESET-METRICS-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_gather_metrics_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-GATHER-METRICS-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_dont_gather_metrics_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_keeps_metrics_p_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $new_cache_strategy_object_tracked_content_iterator_method_table$ = makeSymbol("*NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $map_cache_strategy_object_tracked_content_method_table$ = makeSymbol("*MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METHOD-TABLE*");

    // deflexical
    public static final SubLSymbol $cache_strategy_object_untrack_all_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METHOD-TABLE*");

    // defconstant
    public static final SubLSymbol $dtp_cache_metrics$ = makeSymbol("*DTP-CACHE-METRICS*");

    // defconstant
    private static final SubLSymbol $cfasl_wide_opcode_cache_metrics$ = makeSymbol("*CFASL-WIDE-OPCODE-CACHE-METRICS*");

    // defconstant
    public static final SubLSymbol $dtp_metered_cache$ = makeSymbol("*DTP-METERED-CACHE*");

    // defconstant
    public static final SubLSymbol $dtp_recording_cache_strategy_facade$ = makeSymbol("*DTP-RECORDING-CACHE-STRATEGY-FACADE*");

    // Internal Constants
    public static final SubLSymbol CACHE_STRATEGY_P = makeSymbol("CACHE-STRATEGY-P");







    public static final SubLString $str4$Not_implemented_for__A_ = makeString("Not implemented for ~A.");



    public static final SubLSymbol CACHE_METRICS = makeSymbol("CACHE-METRICS");

    public static final SubLSymbol CACHE_METRICS_P = makeSymbol("CACHE-METRICS-P");

    public static final SubLList $list8 = list(makeSymbol("HIT-COUNT"), makeSymbol("MISS-COUNT"));

    public static final SubLList $list9 = list(makeKeyword("HIT-COUNT"), makeKeyword("MISS-COUNT"));

    public static final SubLList $list10 = list(makeSymbol("CACHEMTR-HIT-COUNT"), makeSymbol("CACHEMTR-MISS-COUNT"));

    public static final SubLList $list11 = list(makeSymbol("_CSETF-CACHEMTR-HIT-COUNT"), makeSymbol("_CSETF-CACHEMTR-MISS-COUNT"));

    public static final SubLSymbol PRINT_CACHE_METRICS = makeSymbol("PRINT-CACHE-METRICS");

    public static final SubLSymbol CACHE_METRICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CACHE-METRICS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list14 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CACHE-METRICS-P"));

    private static final SubLSymbol CACHEMTR_HIT_COUNT = makeSymbol("CACHEMTR-HIT-COUNT");

    private static final SubLSymbol _CSETF_CACHEMTR_HIT_COUNT = makeSymbol("_CSETF-CACHEMTR-HIT-COUNT");

    private static final SubLSymbol CACHEMTR_MISS_COUNT = makeSymbol("CACHEMTR-MISS-COUNT");

    private static final SubLSymbol _CSETF_CACHEMTR_MISS_COUNT = makeSymbol("_CSETF-CACHEMTR-MISS-COUNT");





    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CACHE_METRICS = makeSymbol("MAKE-CACHE-METRICS");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CACHE_METRICS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CACHE-METRICS-METHOD");

    private static final SubLString $str27$Hits__ = makeString("Hits: ");

    private static final SubLString $str28$_Misses__ = makeString(" Misses: ");



    private static final SubLInteger $int$129 = makeInteger(129);

    private static final SubLSymbol CFASL_INPUT_CACHE_METRICS = makeSymbol("CFASL-INPUT-CACHE-METRICS");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_CACHE_METRICS_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CACHE-METRICS-METHOD");

    private static final SubLSymbol METERED_CACHE = makeSymbol("METERED-CACHE");

    private static final SubLSymbol METERED_CACHE_P = makeSymbol("METERED-CACHE-P");

    public static final SubLList $list35 = list(makeSymbol("CACHE"), makeSymbol("METRICS"));

    private static final SubLList $list36 = list(makeKeyword("CACHE"), makeKeyword("METRICS"));

    private static final SubLList $list37 = list(makeSymbol("MCACHE-CACHE"), makeSymbol("MCACHE-METRICS"));

    private static final SubLList $list38 = list(makeSymbol("_CSETF-MCACHE-CACHE"), makeSymbol("_CSETF-MCACHE-METRICS"));

    private static final SubLSymbol PRINT_METERED_CACHE = makeSymbol("PRINT-METERED-CACHE");

    private static final SubLSymbol METERED_CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("METERED-CACHE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list41 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("METERED-CACHE-P"));

    private static final SubLSymbol MCACHE_CACHE = makeSymbol("MCACHE-CACHE");

    private static final SubLSymbol _CSETF_MCACHE_CACHE = makeSymbol("_CSETF-MCACHE-CACHE");

    private static final SubLSymbol MCACHE_METRICS = makeSymbol("MCACHE-METRICS");

    private static final SubLSymbol _CSETF_MCACHE_METRICS = makeSymbol("_CSETF-MCACHE-METRICS");





    private static final SubLSymbol MAKE_METERED_CACHE = makeSymbol("MAKE-METERED-CACHE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_METERED_CACHE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-METERED-CACHE-METHOD");

    private static final SubLString $str50$Cache__ = makeString("Cache: ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str52$_no_metrics_ = makeString("(no metrics)");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_P_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-P-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_RESET_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_CACHE_SIZE_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-SIZE-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_TRACK_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-TRACK-METERED-CACHE-METHOD");

    private static final SubLSymbol $sym58$CACHE_STRATEGY_OBJECT_TRACKED__METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-TRACKED?-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_UNTRACK_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_GET_PARAMETER_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-GET-PARAMETER-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_SET_PARAMETER_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-SET-PARAMETER-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METERED-CACHE-METHOD");

    private static final SubLSymbol $sym64$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_METERED_CACHE_METH = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_GET_METRICS_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-GET-METRICS-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_RESET_METRICS_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-METRICS-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_GATHER_METRICS_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-GATHER-METRICS-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METERED-CACHE-METHOD");

    private static final SubLSymbol $sym70$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_METERED_CACHE_ = makeSymbol("NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METERED-CACHE-METHOD");

    private static final SubLSymbol MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_METERED_CACHE_METHOD = makeSymbol("MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METERED-CACHE-METHOD");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_UNTRACK_ALL_METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METERED-CACHE-METHOD");

    private static final SubLSymbol RECORDING_CACHE_STRATEGY_FACADE = makeSymbol("RECORDING-CACHE-STRATEGY-FACADE");

    private static final SubLSymbol RECORDING_CACHE_STRATEGY_FACADE_P = makeSymbol("RECORDING-CACHE-STRATEGY-FACADE-P");

    private static final SubLList $list75 = list(makeSymbol("CACHE-STRATEGY"), makeSymbol("RECORDS"), makeSymbol("TIMESTAMPER"));

    private static final SubLList $list76 = list(makeKeyword("CACHE-STRATEGY"), makeKeyword("RECORDS"), makeKeyword("TIMESTAMPER"));

    private static final SubLList $list77 = list(makeSymbol("REC-CACHSTRAT-FACADE-CACHE-STRATEGY"), makeSymbol("REC-CACHSTRAT-FACADE-RECORDS"), makeSymbol("REC-CACHSTRAT-FACADE-TIMESTAMPER"));

    private static final SubLList $list78 = list(makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-CACHE-STRATEGY"), makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-RECORDS"), makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-TIMESTAMPER"));

    private static final SubLSymbol PRINT_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol("PRINT-RECORDING-CACHE-STRATEGY-FACADE");

    private static final SubLSymbol RECORDING_CACHE_STRATEGY_FACADE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RECORDING-CACHE-STRATEGY-FACADE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list81 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RECORDING-CACHE-STRATEGY-FACADE-P"));

    private static final SubLSymbol REC_CACHSTRAT_FACADE_CACHE_STRATEGY = makeSymbol("REC-CACHSTRAT-FACADE-CACHE-STRATEGY");

    private static final SubLSymbol _CSETF_REC_CACHSTRAT_FACADE_CACHE_STRATEGY = makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-CACHE-STRATEGY");

    private static final SubLSymbol REC_CACHSTRAT_FACADE_RECORDS = makeSymbol("REC-CACHSTRAT-FACADE-RECORDS");

    private static final SubLSymbol _CSETF_REC_CACHSTRAT_FACADE_RECORDS = makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-RECORDS");

    private static final SubLSymbol REC_CACHSTRAT_FACADE_TIMESTAMPER = makeSymbol("REC-CACHSTRAT-FACADE-TIMESTAMPER");

    private static final SubLSymbol _CSETF_REC_CACHSTRAT_FACADE_TIMESTAMPER = makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-TIMESTAMPER");







    private static final SubLSymbol MAKE_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol("MAKE-RECORDING-CACHE-STRATEGY-FACADE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RECORDING_CACHE_STRATEGY_FACADE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol INTEGER_SEQUENCE_GENERATOR_P = makeSymbol("INTEGER-SEQUENCE-GENERATOR-P");

    private static final SubLString $str94$_wrapped__ = makeString(" wrapped: ");

    private static final SubLSymbol CACHE_STRATEGY_OBJECT_P_RECORDING_CACHE_STRATEGY_FACADE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym96$CACHE_STRATEGY_OBJECT_RESET_RECORDING_CACHE_STRATEGY_FACADE_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym97$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_RECORDING_CACHE_STRATEGY_FAC = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym98$CACHE_STRATEGY_OBJECT_CACHE_SIZE_RECORDING_CACHE_STRATEGY_FACADE_ = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-SIZE-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym99$CACHE_STRATEGY_OBJECT_TRACK_RECORDING_CACHE_STRATEGY_FACADE_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-TRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym100$CACHE_STRATEGY_OBJECT_TRACKED__RECORDING_CACHE_STRATEGY_FACADE_ME = makeSymbol("CACHE-STRATEGY-OBJECT-TRACKED?-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym101$CACHE_STRATEGY_OBJECT_UNTRACK_RECORDING_CACHE_STRATEGY_FACADE_MET = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym102$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_RECORDING_CACHE_STRATE = makeSymbol("CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym103$CACHE_STRATEGY_OBJECT_GET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA = makeSymbol("CACHE-STRATEGY-OBJECT-GET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym104$CACHE_STRATEGY_OBJECT_SET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA = makeSymbol("CACHE-STRATEGY-OBJECT-SET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym105$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_RECORDING_CACHE_STRATEGY_FAC = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym106$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_RECORDING_CACHE_ST = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym107$CACHE_STRATEGY_OBJECT_GET_METRICS_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol("CACHE-STRATEGY-OBJECT-GET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym108$CACHE_STRATEGY_OBJECT_RESET_METRICS_RECORDING_CACHE_STRATEGY_FACA = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym109$CACHE_STRATEGY_OBJECT_GATHER_METRICS_RECORDING_CACHE_STRATEGY_FAC = makeSymbol("CACHE-STRATEGY-OBJECT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym110$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_RECORDING_CACHE_STRATEG = makeSymbol("CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym111$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_RECORDING_CACHE_STRATEGY_FA = makeSymbol("CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym112$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_RECORDING_CACH = makeSymbol("NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym113$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_RECORDING_CACHE_STRATEG = makeSymbol("MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    private static final SubLSymbol $sym114$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-ALL-RECORDING-CACHE-STRATEGY-FACADE-METHOD");







    private static final SubLSymbol TEST_MCACHE_STRATEGY_IMPLEMENTATION_CONFORMANCE = makeSymbol("TEST-MCACHE-STRATEGY-IMPLEMENTATION-CONFORMANCE");













    private static final SubLList $list125 = list(list(list(TEN_INTEGER), makeKeyword("SUCCESS")), list(list(TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(50)), makeKeyword("SUCCESS")));

    private static final SubLString $str126$Cannot_properly_validate_dirty_ca = makeString("Cannot properly validate dirty cache strategy ~A.");

    private static final SubLString $str127$Strategy__A_is_tracking_item__A_b = makeString("Strategy ~A is tracking item ~A before it is added.");

    private static final SubLString $str128$Strategy__A_is_suggesting_to_remo = makeString("Strategy ~A is suggesting to remove item ~A before the cache is full.");

    private static final SubLString $str129$Strategy__A_is_not_tracking_item_ = makeString("Strategy ~A is not tracking item ~A that was just added.");

    private static final SubLString $str130$After_adding__A_items_to_an_empty = makeString("After adding ~A items to an empty cache, the cache contains ~A items.");

    private static final SubLString $str131$The_strategy__A_does_not_implemen = makeString("The strategy ~A does not implement FULL-P correctly.");

    private static final SubLString $str132$Strategy__A_is_tracking_item__A_t = makeString("Strategy ~A is tracking item ~A though it is no longer present.");

    private static final SubLString $str133$After_removing__A_items_from_a_fu = makeString("After removing ~A items from a full cache, the cache still contains ~A items.");

    private static final SubLString $str134$The_strategy__A_is_not_implementi = makeString("The strategy ~A is not implementing EMPTY-P correctly.");



    private static final SubLString $str136$The_two_strategies_disagree_on_th = makeString("The two strategies disagree on the result of adding item #~A (~A).~%~A gives ~A, ~A gives ~A.");

    private static final SubLSymbol CACHE_P = makeSymbol("CACHE-P");



    public static SubLObject cache_strategy_p(final SubLObject v_object) {
        return cache_strategy_object_p(v_object);
    }

    public static SubLObject cache_strategy_or_symbol_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() || (NIL != cache_strategy_p(v_object)));
    }

    public static SubLObject cache_strategy_reset(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        cache_strategy_object_reset(strategy);
        return strategy;
    }

    public static SubLObject cache_strategy_cache_capacity(final SubLObject strategy) {
        return cache_strategy_object_cache_capacity(strategy);
    }

    public static SubLObject cache_strategy_cache_size(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        return cache_strategy_object_cache_size(strategy);
    }

    public static SubLObject cache_strategy_cache_load(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        return divide(cache_strategy_cache_size(strategy), cache_strategy_cache_capacity(strategy));
    }

    public static SubLObject cache_strategy_cache_full_p(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        return numE(cache_strategy_cache_size(strategy), cache_strategy_cache_capacity(strategy));
    }

    public static SubLObject cache_strategy_cache_empty_p(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        return zerop(cache_strategy_cache_size(strategy));
    }

    public static SubLObject cache_strategy_track(final SubLObject strategy, final SubLObject v_object) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        return cache_strategy_object_track(strategy, v_object);
    }

    public static SubLObject cache_strategy_trackedP(final SubLObject strategy, final SubLObject v_object) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        return cache_strategy_object_trackedP(strategy, v_object);
    }

    public static SubLObject cache_strategy_untrack(final SubLObject strategy, final SubLObject v_object) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        cache_strategy_object_untrack(strategy, v_object);
        return v_object;
    }

    public static SubLObject cache_strategy_note_cache_hit(final SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            cache_metrics_note_hit(cache_strategy_get_metrics(strategy));
        }
        return strategy;
    }

    public static SubLObject cache_strategy_note_cache_hits(final SubLObject strategy, final SubLObject several) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            final SubLObject metrics = cache_strategy_get_metrics(strategy);
            SubLObject i;
            for (i = NIL, i = ZERO_INTEGER; i.numL(several); i = add(i, ONE_INTEGER)) {
                cache_metrics_note_hit(metrics);
            }
        }
        return strategy;
    }

    public static SubLObject cache_strategy_note_cache_miss(final SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            cache_metrics_note_miss(cache_strategy_get_metrics(strategy));
        }
        return strategy;
    }

    public static SubLObject cache_strategy_supports_parameter_p(final SubLObject strategy, final SubLObject parameter) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        assert NIL != keywordp(parameter) : "Types.keywordp(parameter) " + "CommonSymbols.NIL != Types.keywordp(parameter) " + parameter;
        return cache_strategy_object_supports_parameter_p(strategy, parameter);
    }

    public static SubLObject cache_strategy_get_parameter(final SubLObject strategy, final SubLObject parameter, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        assert NIL != keywordp(parameter) : "Types.keywordp(parameter) " + "CommonSymbols.NIL != Types.keywordp(parameter) " + parameter;
        if (NIL != cache_strategy_supports_parameter_p(strategy, parameter)) {
            return cache_strategy_object_get_parameter(strategy, parameter, v_default);
        }
        return $UNSUPPORTED;
    }

    public static SubLObject cache_strategy_set_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject value) {
        final SubLObject old_value = cache_strategy_get_parameter(strategy, parameter, UNPROVIDED);
        if (old_value != $UNSUPPORTED) {
            cache_strategy_object_set_parameter(strategy, parameter, value);
        }
        return old_value;
    }

    public static SubLObject cache_strategy_note_reference(final SubLObject strategy, final SubLObject v_object) {
        if (NIL != cache_strategy_trackedP(strategy, v_object)) {
            cache_strategy_object_note_reference(strategy, v_object);
        }
        return strategy;
    }

    public static SubLObject cache_strategy_note_references_in_order(final SubLObject strategy, final SubLObject objects) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        cache_strategy_object_note_references_in_order(strategy, objects);
        return strategy;
    }

    public static SubLObject cache_strategy_get_metrics(final SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            return cache_strategy_object_get_metrics(strategy);
        }
        return NIL;
    }

    public static SubLObject cache_strategy_reset_metrics(final SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            cache_strategy_object_reset_metrics(strategy);
            return T;
        }
        return NIL;
    }

    public static SubLObject cache_strategy_gather_metrics(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        final SubLObject metrics = new_cache_metrics();
        return cache_strategy_object_gather_metrics(strategy, metrics);
    }

    public static SubLObject cache_strategy_dont_gather_metrics(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        return cache_strategy_object_dont_gather_metrics(strategy);
    }

    public static SubLObject cache_strategy_keeps_metrics_p(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        return cache_strategy_object_keeps_metrics_p(strategy);
    }

    public static SubLObject new_cache_strategy_tracked_content_iterator(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        return new_cache_strategy_object_tracked_content_iterator(strategy);
    }

    public static SubLObject map_cache_strategy_tracked_content(final SubLObject strategy, final SubLObject functor) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        assert NIL != function_spec_p(functor) : "Types.function_spec_p(functor) " + "CommonSymbols.NIL != Types.function_spec_p(functor) " + functor;
        map_cache_strategy_object_tracked_content(strategy, functor);
        return strategy;
    }

    public static SubLObject cache_strategy_untrack_all(final SubLObject strategy, final SubLObject functor) {
        assert NIL != cache_strategy_p(strategy) : "cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) " + strategy;
        assert NIL != function_spec_p(functor) : "Types.function_spec_p(functor) " + "CommonSymbols.NIL != Types.function_spec_p(functor) " + functor;
        cache_strategy_object_untrack_all(strategy, functor);
        return strategy;
    }

    public static SubLObject cache_strategy_method_not_implemented_for(final SubLObject v_object) {
        return Errors.error($str4$Not_implemented_for__A_, v_object);
    }

    public static SubLObject cache_strategy_object_p(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $cache_strategy_object_p_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return NIL;
    }

    public static SubLObject cache_strategy_object_reset(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_reset_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_cache_capacity(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_cache_capacity_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_cache_size(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_cache_size_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_track(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_track_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, v_object);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_trackedP(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_trackedP_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, v_object);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_untrack(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_untrack_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, v_object);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_supports_parameter_p(final SubLObject strategy, final SubLObject parameter) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, parameter);
        }
        return NIL;
    }

    public static SubLObject cache_strategy_object_get_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_get_parameter_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, parameter, v_default);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_set_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_set_parameter_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, parameter, v_default);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_note_reference(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_note_reference_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, v_object);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_note_references_in_order(final SubLObject strategy, final SubLObject objects) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_note_references_in_order_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, objects);
        }
        return default_cache_strategy_object_note_references_in_order(strategy, objects);
    }

    public static SubLObject default_cache_strategy_object_note_references_in_order(final SubLObject strategy, final SubLObject objects) {
        SubLObject cdolist_list_var = objects;
        SubLObject v_object = NIL;
        v_object = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cache_strategy_trackedP(strategy, v_object)) {
                cache_strategy_note_reference(strategy, v_object);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_object = cdolist_list_var.first();
        } 
        return strategy;
    }

    public static SubLObject cache_strategy_object_get_metrics(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_get_metrics_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_reset_metrics(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_reset_metrics_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_gather_metrics(final SubLObject strategy, final SubLObject metrics) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_gather_metrics_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, metrics);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_dont_gather_metrics(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject cache_strategy_object_keeps_metrics_p(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject new_cache_strategy_object_tracked_content_iterator(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    public static SubLObject map_cache_strategy_object_tracked_content(final SubLObject strategy, final SubLObject functor) {
        final SubLObject method_function = method_func(strategy, $map_cache_strategy_object_tracked_content_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, functor);
        }
        default_map_cache_strategy_object_tracked_content(strategy, functor);
        return strategy;
    }

    public static SubLObject default_map_cache_strategy_object_tracked_content(final SubLObject strategy, final SubLObject functor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = new_cache_strategy_tracked_content_iterator(strategy);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject v_object = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                funcall(functor, v_object);
            }
        }
        return strategy;
    }

    public static SubLObject cache_strategy_object_untrack_all(final SubLObject strategy, final SubLObject functor) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_untrack_all_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, functor);
        }
        default_cache_strategy_object_untrack_all(strategy, functor);
        return strategy;
    }

    public static SubLObject default_cache_strategy_object_untrack_all(final SubLObject strategy, final SubLObject functor) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = new_cache_strategy_tracked_content_iterator(strategy);
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject v_object = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                cache_strategy_untrack(strategy, v_object);
                funcall(functor, v_object);
            }
        }
        return strategy;
    }

    public static SubLObject cache_metrics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cache_metrics(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cache_metrics_p(final SubLObject v_object) {
        return v_object.getClass() == cache_utilities.$cache_metrics_native.class ? T : NIL;
    }

    public static SubLObject cachemtr_hit_count(final SubLObject v_object) {
        assert NIL != cache_metrics_p(v_object) : "cache_utilities.cache_metrics_p(v_object) " + "CommonSymbols.NIL != cache_utilities.cache_metrics_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject cachemtr_miss_count(final SubLObject v_object) {
        assert NIL != cache_metrics_p(v_object) : "cache_utilities.cache_metrics_p(v_object) " + "CommonSymbols.NIL != cache_utilities.cache_metrics_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_cachemtr_hit_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_metrics_p(v_object) : "cache_utilities.cache_metrics_p(v_object) " + "CommonSymbols.NIL != cache_utilities.cache_metrics_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cachemtr_miss_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_metrics_p(v_object) : "cache_utilities.cache_metrics_p(v_object) " + "CommonSymbols.NIL != cache_utilities.cache_metrics_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_cache_metrics(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new cache_utilities.$cache_metrics_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HIT_COUNT)) {
                _csetf_cachemtr_hit_count(v_new, current_value);
            } else
                if (pcase_var.eql($MISS_COUNT)) {
                    _csetf_cachemtr_miss_count(v_new, current_value);
                } else {
                    Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_cache_metrics(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CACHE_METRICS, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HIT_COUNT, cachemtr_hit_count(obj));
        funcall(visitor_fn, obj, $SLOT, $MISS_COUNT, cachemtr_miss_count(obj));
        funcall(visitor_fn, obj, $END, MAKE_CACHE_METRICS, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_cache_metrics_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_cache_metrics(obj, visitor_fn);
    }

    public static SubLObject print_cache_metrics(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($str27$Hits__, stream, UNPROVIDED, UNPROVIDED);
            princ(cachemtr_hit_count(v_object), stream);
            write_string($str28$_Misses__, stream, UNPROVIDED, UNPROVIDED);
            princ(cachemtr_miss_count(v_object), stream);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject new_cache_metrics() {
        final SubLObject metrics = make_cache_metrics(UNPROVIDED);
        reset_cache_metrics_counts(metrics, UNPROVIDED, UNPROVIDED);
        return metrics;
    }

    public static SubLObject reset_cache_metrics_counts(final SubLObject metrics, SubLObject hits, SubLObject misses) {
        if (hits == UNPROVIDED) {
            hits = ZERO_INTEGER;
        }
        if (misses == UNPROVIDED) {
            misses = ZERO_INTEGER;
        }
        _csetf_cachemtr_hit_count(metrics, hits);
        _csetf_cachemtr_miss_count(metrics, misses);
        return metrics;
    }

    public static SubLObject new_cache_metrics_with_counts(final SubLObject hits, final SubLObject misses) {
        SubLTrampolineFile.enforceType(hits, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.enforceType(misses, NON_NEGATIVE_INTEGER_P);
        return reset_cache_metrics_counts(new_cache_metrics(), hits, misses);
    }

    public static SubLObject cache_metrics_reset(final SubLObject metrics) {
        reset_cache_metrics_counts(metrics, UNPROVIDED, UNPROVIDED);
        return metrics;
    }

    public static SubLObject cache_metrics_note_hit(final SubLObject metrics) {
        assert NIL != cache_metrics_p(metrics) : "cache_utilities.cache_metrics_p(metrics) " + "CommonSymbols.NIL != cache_utilities.cache_metrics_p(metrics) " + metrics;
        _csetf_cachemtr_hit_count(metrics, add(cachemtr_hit_count(metrics), ONE_INTEGER));
        return metrics;
    }

    public static SubLObject cache_metrics_note_miss(final SubLObject metrics) {
        assert NIL != cache_metrics_p(metrics) : "cache_utilities.cache_metrics_p(metrics) " + "CommonSymbols.NIL != cache_utilities.cache_metrics_p(metrics) " + metrics;
        _csetf_cachemtr_miss_count(metrics, add(cachemtr_miss_count(metrics), ONE_INTEGER));
        return metrics;
    }

    public static SubLObject cache_metrics_hit_count(final SubLObject metrics) {
        return cachemtr_hit_count(metrics);
    }

    public static SubLObject cache_metrics_miss_count(final SubLObject metrics) {
        return cachemtr_miss_count(metrics);
    }

    public static SubLObject cache_metrics_hit_rate(final SubLObject metrics) {
        final SubLObject hits = cache_metrics_hit_count(metrics);
        final SubLObject total = cache_metrics_cache_uses(metrics);
        return divide(hits, total);
    }

    public static SubLObject cache_metrics_miss_rate(final SubLObject metrics) {
        final SubLObject misses = cache_metrics_miss_count(metrics);
        final SubLObject total = cache_metrics_cache_uses(metrics);
        return divide(misses, total);
    }

    public static SubLObject cache_metrics_cache_uses(final SubLObject metrics) {
        return add(cachemtr_hit_count(metrics), cachemtr_miss_count(metrics));
    }

    public static SubLObject gather_cache_strategy_information(final SubLObject cache_strategy) {
        assert NIL != cache_strategy_p(cache_strategy) : "cache_utilities.cache_strategy_p(cache_strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(cache_strategy) " + cache_strategy;
        final SubLObject cache_capacity = cache_strategy_cache_capacity(cache_strategy);
        final SubLObject metrics = cache_strategy_get_metrics(cache_strategy);
        SubLObject hits = NIL;
        SubLObject misses = NIL;
        SubLObject cache_too_small_p = NIL;
        if (NIL != cache_metrics_p(metrics)) {
            hits = cache_metrics_hit_count(metrics);
            misses = cache_metrics_miss_count(metrics);
            cache_too_small_p = numG(misses, hits);
        }
        return values(cache_capacity, hits, misses, cache_too_small_p);
    }

    public static SubLObject cfasl_output_object_cache_metrics_method(final SubLObject v_object, final SubLObject stream) {
        cfasl_wide_output_cache_metrics(v_object, stream);
        return v_object;
    }

    public static SubLObject cfasl_wide_output_cache_metrics(final SubLObject cache_metrics, final SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_cache_metrics$.getGlobalValue(), stream);
        cfasl_output_cache_metrics_internal(cache_metrics, stream);
        return cache_metrics;
    }

    public static SubLObject cfasl_output_cache_metrics_internal(final SubLObject cache_metrics, final SubLObject stream) {
        cfasl_output(cache_metrics_hit_count(cache_metrics), stream);
        cfasl_output(cache_metrics_miss_count(cache_metrics), stream);
        return cache_metrics;
    }

    public static SubLObject cfasl_input_cache_metrics(final SubLObject stream) {
        final SubLObject hits = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject misses = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return new_cache_metrics_with_counts(hits, misses);
    }

    public static SubLObject metered_cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_metered_cache(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject metered_cache_p(final SubLObject v_object) {
        return v_object.getClass() == cache_utilities.$metered_cache_native.class ? T : NIL;
    }

    public static SubLObject mcache_cache(final SubLObject v_object) {
        assert NIL != metered_cache_p(v_object) : "cache_utilities.metered_cache_p(v_object) " + "CommonSymbols.NIL != cache_utilities.metered_cache_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject mcache_metrics(final SubLObject v_object) {
        assert NIL != metered_cache_p(v_object) : "cache_utilities.metered_cache_p(v_object) " + "CommonSymbols.NIL != cache_utilities.metered_cache_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_mcache_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != metered_cache_p(v_object) : "cache_utilities.metered_cache_p(v_object) " + "CommonSymbols.NIL != cache_utilities.metered_cache_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_mcache_metrics(final SubLObject v_object, final SubLObject value) {
        assert NIL != metered_cache_p(v_object) : "cache_utilities.metered_cache_p(v_object) " + "CommonSymbols.NIL != cache_utilities.metered_cache_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_metered_cache(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new cache_utilities.$metered_cache_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CACHE)) {
                _csetf_mcache_cache(v_new, current_value);
            } else
                if (pcase_var.eql($METRICS)) {
                    _csetf_mcache_metrics(v_new, current_value);
                } else {
                    Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_metered_cache(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_METERED_CACHE, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CACHE, mcache_cache(obj));
        funcall(visitor_fn, obj, $SLOT, $METRICS, mcache_metrics(obj));
        funcall(visitor_fn, obj, $END, MAKE_METERED_CACHE, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_metered_cache_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_metered_cache(obj, visitor_fn);
    }

    public static SubLObject new_metered_cache(final SubLObject v_cache) {
        final SubLObject mcache = make_metered_cache(UNPROVIDED);
        _csetf_mcache_cache(mcache, v_cache);
        return mcache;
    }

    public static SubLObject new_metered_preallocated_cache(final SubLObject capacity, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return new_metered_cache(cache.new_preallocated_cache(capacity, test));
    }

    public static SubLObject print_metered_cache(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($str50$Cache__, stream, UNPROVIDED, UNPROVIDED);
            princ(mcache_cache(v_object), stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            final SubLObject metrics = mcache_metrics(v_object);
            if (NIL != cache_metrics_p(metrics)) {
                princ(metrics, stream);
            } else {
                write_string($str52$_no_metrics_, stream, UNPROVIDED, UNPROVIDED);
            }
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject cache_strategy_object_p_metered_cache_method(final SubLObject v_object) {
        return T;
    }

    public static SubLObject cache_strategy_object_reset_metered_cache_method(final SubLObject v_object) {
        return cache_strategy_mcache_object_reset(v_object);
    }

    public static SubLObject cache_strategy_object_cache_capacity_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_cache_capacity(strategy);
    }

    public static SubLObject cache_strategy_object_cache_size_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_cache_size(strategy);
    }

    public static SubLObject cache_strategy_object_track_metered_cache_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_mcache_object_track(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_trackedP_metered_cache_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_mcache_object_trackedP(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_untrack_metered_cache_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_mcache_object_untrack(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_supports_parameter_p_metered_cache_method(final SubLObject strategy, final SubLObject parameter) {
        return cache_strategy_mcache_object_supports_parameter_p(strategy, parameter);
    }

    public static SubLObject cache_strategy_object_get_parameter_metered_cache_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return cache_strategy_mcache_object_get_parameter(strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_object_set_parameter_metered_cache_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return cache_strategy_mcache_object_set_parameter(strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_object_note_reference_metered_cache_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_mcache_object_note_reference(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_note_references_in_order_metered_cache_method(final SubLObject strategy, final SubLObject objects) {
        return cache_strategy_mcache_object_note_references_in_order(strategy, objects);
    }

    public static SubLObject cache_strategy_object_get_metrics_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_get_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_reset_metrics_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_reset_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_gather_metrics_metered_cache_method(final SubLObject strategy, final SubLObject metrics) {
        return cache_strategy_mcache_object_gather_metrics(strategy, metrics);
    }

    public static SubLObject cache_strategy_object_dont_gather_metrics_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_dont_gather_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_keeps_metrics_p_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_keeps_metrics_p(strategy);
    }

    public static SubLObject new_cache_strategy_object_tracked_content_iterator_metered_cache_method(final SubLObject strategy) {
        return new_cache_strategy_mcache_object_tracked_content_iterator(strategy);
    }

    public static SubLObject map_cache_strategy_object_tracked_content_metered_cache_method(final SubLObject strategy, final SubLObject functor) {
        return map_cache_strategy_mcache_object_tracked_content(strategy, functor);
    }

    public static SubLObject cache_strategy_object_untrack_all_metered_cache_method(final SubLObject strategy, final SubLObject functor) {
        return cache_strategy_mcache_object_untrack_all(strategy, functor);
    }

    public static SubLObject cache_strategy_mcache_object_reset(final SubLObject mcache) {
        cache.cache_clear(mcache_cache(mcache));
        return mcache;
    }

    public static SubLObject cache_strategy_mcache_object_cache_capacity(final SubLObject mcache) {
        return cache.cache_capacity(mcache_cache(mcache));
    }

    public static SubLObject cache_strategy_mcache_object_track(final SubLObject mcache, final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject key = cache.cache_set_return_dropped(mcache_cache(mcache), v_object, v_object);
        final SubLObject value = thread.secondMultipleValue();
        final SubLObject dropped_p = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return NIL != dropped_p ? key : v_object;
    }

    public static SubLObject cache_strategy_mcache_object_cache_size(final SubLObject mcache) {
        return cache.cache_size(mcache_cache(mcache));
    }

    public static SubLObject cache_strategy_mcache_object_trackedP(final SubLObject mcache, final SubLObject v_object) {
        return cache.cache_contains_key_p(mcache_cache(mcache), v_object);
    }

    public static SubLObject cache_strategy_mcache_object_untrack(final SubLObject mcache, final SubLObject v_object) {
        return cache.cache_remove(mcache_cache(mcache), v_object);
    }

    public static SubLObject cache_strategy_mcache_object_supports_parameter_p(final SubLObject mcache, final SubLObject parameter) {
        return NIL;
    }

    public static SubLObject cache_strategy_mcache_object_get_parameter(final SubLObject mcache, final SubLObject parameter, final SubLObject v_default) {
        return v_default;
    }

    public static SubLObject cache_strategy_mcache_object_set_parameter(final SubLObject mcache, final SubLObject parameter, final SubLObject v_default) {
        return v_default;
    }

    public static SubLObject cache_strategy_mcache_object_note_reference(final SubLObject mcache, final SubLObject v_object) {
        return cache.cache_set_without_values(mcache_cache(mcache), v_object, v_object);
    }

    public static SubLObject cache_strategy_mcache_object_note_references_in_order(final SubLObject mcache, final SubLObject objects) {
        return default_cache_strategy_object_note_references_in_order(mcache, objects);
    }

    public static SubLObject cache_strategy_mcache_object_get_metrics(final SubLObject mcache) {
        return mcache_metrics(mcache);
    }

    public static SubLObject cache_strategy_mcache_object_reset_metrics(final SubLObject mcache) {
        return cache_metrics_reset(mcache_metrics(mcache));
    }

    public static SubLObject cache_strategy_mcache_object_gather_metrics(final SubLObject mcache, final SubLObject metrics) {
        _csetf_mcache_metrics(mcache, metrics);
        return mcache;
    }

    public static SubLObject cache_strategy_mcache_object_dont_gather_metrics(final SubLObject mcache) {
        final SubLObject metrics = mcache_metrics(mcache);
        _csetf_mcache_metrics(mcache, NIL);
        return metrics;
    }

    public static SubLObject cache_strategy_mcache_object_keeps_metrics_p(final SubLObject mcache) {
        return cache_metrics_p(mcache_metrics(mcache));
    }

    public static SubLObject new_cache_strategy_mcache_object_tracked_content_iterator(final SubLObject mcache) {
        return cache.new_cache_content_iterator(mcache_cache(mcache));
    }

    public static SubLObject map_cache_strategy_mcache_object_tracked_content(final SubLObject mcache, final SubLObject functor) {
        return default_map_cache_strategy_object_tracked_content(mcache, functor);
    }

    public static SubLObject cache_strategy_mcache_object_untrack_all(final SubLObject mcache, final SubLObject functor) {
        return default_cache_strategy_object_untrack_all(mcache, functor);
    }

    public static SubLObject recording_cache_strategy_facade_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_recording_cache_strategy_facade(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject recording_cache_strategy_facade_p(final SubLObject v_object) {
        return v_object.getClass() == cache_utilities.$recording_cache_strategy_facade_native.class ? T : NIL;
    }

    public static SubLObject rec_cachstrat_facade_cache_strategy(final SubLObject v_object) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "cache_utilities.recording_cache_strategy_facade_p(v_object) " + "CommonSymbols.NIL != cache_utilities.recording_cache_strategy_facade_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject rec_cachstrat_facade_records(final SubLObject v_object) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "cache_utilities.recording_cache_strategy_facade_p(v_object) " + "CommonSymbols.NIL != cache_utilities.recording_cache_strategy_facade_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject rec_cachstrat_facade_timestamper(final SubLObject v_object) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "cache_utilities.recording_cache_strategy_facade_p(v_object) " + "CommonSymbols.NIL != cache_utilities.recording_cache_strategy_facade_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject _csetf_rec_cachstrat_facade_cache_strategy(final SubLObject v_object, final SubLObject value) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "cache_utilities.recording_cache_strategy_facade_p(v_object) " + "CommonSymbols.NIL != cache_utilities.recording_cache_strategy_facade_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rec_cachstrat_facade_records(final SubLObject v_object, final SubLObject value) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "cache_utilities.recording_cache_strategy_facade_p(v_object) " + "CommonSymbols.NIL != cache_utilities.recording_cache_strategy_facade_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rec_cachstrat_facade_timestamper(final SubLObject v_object, final SubLObject value) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "cache_utilities.recording_cache_strategy_facade_p(v_object) " + "CommonSymbols.NIL != cache_utilities.recording_cache_strategy_facade_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject make_recording_cache_strategy_facade(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new cache_utilities.$recording_cache_strategy_facade_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CACHE_STRATEGY)) {
                _csetf_rec_cachstrat_facade_cache_strategy(v_new, current_value);
            } else
                if (pcase_var.eql($RECORDS)) {
                    _csetf_rec_cachstrat_facade_records(v_new, current_value);
                } else
                    if (pcase_var.eql($TIMESTAMPER)) {
                        _csetf_rec_cachstrat_facade_timestamper(v_new, current_value);
                    } else {
                        Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_recording_cache_strategy_facade(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RECORDING_CACHE_STRATEGY_FACADE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CACHE_STRATEGY, rec_cachstrat_facade_cache_strategy(obj));
        funcall(visitor_fn, obj, $SLOT, $RECORDS, rec_cachstrat_facade_records(obj));
        funcall(visitor_fn, obj, $SLOT, $TIMESTAMPER, rec_cachstrat_facade_timestamper(obj));
        funcall(visitor_fn, obj, $END, MAKE_RECORDING_CACHE_STRATEGY_FACADE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_recording_cache_strategy_facade_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_recording_cache_strategy_facade(obj, visitor_fn);
    }

    public static SubLObject new_recording_cache_strategy_facade(final SubLObject cache_strategy, final SubLObject time_stamper) {
        assert NIL != cache_strategy_p(cache_strategy) : "cache_utilities.cache_strategy_p(cache_strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(cache_strategy) " + cache_strategy;
        assert NIL != integer_sequence_generator.integer_sequence_generator_p(time_stamper) : "integer_sequence_generator.integer_sequence_generator_p(time_stamper) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(time_stamper) " + time_stamper;
        final SubLObject rec_cache = make_recording_cache_strategy_facade(UNPROVIDED);
        _csetf_rec_cachstrat_facade_cache_strategy(rec_cache, cache_strategy);
        _csetf_rec_cachstrat_facade_records(rec_cache, NIL);
        _csetf_rec_cachstrat_facade_timestamper(rec_cache, time_stamper);
        return rec_cache;
    }

    public static SubLObject recording_cache_strategy_facade_get_records(final SubLObject rec_cache) {
        assert NIL != cache_strategy_p(rec_cache) : "cache_utilities.cache_strategy_p(rec_cache) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(rec_cache) " + rec_cache;
        final SubLObject records = rec_cachstrat_facade_records(rec_cache);
        _csetf_rec_cachstrat_facade_records(rec_cache, NIL);
        return nreverse(records);
    }

    public static SubLObject recording_cache_strategy_facade_get_facaded_cache_strategy(final SubLObject rec_cache) {
        assert NIL != cache_strategy_p(rec_cache) : "cache_utilities.cache_strategy_p(rec_cache) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(rec_cache) " + rec_cache;
        return rec_cachstrat_facade_cache_strategy(rec_cache);
    }

    public static SubLObject recording_cache_strategy_facade_record_action(final SubLObject rec_cache, final SubLObject action, final SubLObject item) {
        final SubLObject isg = rec_cachstrat_facade_timestamper(rec_cache);
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(isg);
        _csetf_rec_cachstrat_facade_records(rec_cache, cons(list(id, action, item), rec_cachstrat_facade_records(rec_cache)));
        return rec_cache;
    }

    public static SubLObject print_recording_cache_strategy_facade(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_object, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_object, T, T);
            write_string($str94$_wrapped__, stream, UNPROVIDED, UNPROVIDED);
            princ(rec_cachstrat_facade_cache_strategy(v_object), stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
            print_macros.print_unreadable_object_postamble(stream, v_object, T, T);
        }
        return v_object;
    }

    public static SubLObject cache_strategy_object_p_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return T;
    }

    public static SubLObject cache_strategy_object_reset_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_reset(strategy);
    }

    public static SubLObject cache_strategy_object_cache_capacity_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_cache_capacity(strategy);
    }

    public static SubLObject cache_strategy_object_cache_size_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_cache_size(strategy);
    }

    public static SubLObject cache_strategy_object_track_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_rec_cache_object_track(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_trackedP_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_rec_cache_object_trackedP(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_untrack_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_rec_cache_object_untrack(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_supports_parameter_p_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject parameter) {
        return cache_strategy_rec_cache_object_supports_parameter_p(strategy, parameter);
    }

    public static SubLObject cache_strategy_object_get_parameter_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return cache_strategy_rec_cache_object_get_parameter(strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_object_set_parameter_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return cache_strategy_rec_cache_object_set_parameter(strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_object_note_reference_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_rec_cache_object_note_reference(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_note_references_in_order_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject objects) {
        return cache_strategy_rec_cache_object_note_references_in_order(strategy, objects);
    }

    public static SubLObject cache_strategy_object_get_metrics_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_get_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_reset_metrics_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_reset_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_gather_metrics_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject metrics) {
        return cache_strategy_rec_cache_object_gather_metrics(strategy, metrics);
    }

    public static SubLObject cache_strategy_object_dont_gather_metrics_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_dont_gather_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_keeps_metrics_p_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_keeps_metrics_p(strategy);
    }

    public static SubLObject new_cache_strategy_object_tracked_content_iterator_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return new_cache_strategy_rec_cache_object_tracked_content_iterator(strategy);
    }

    public static SubLObject map_cache_strategy_object_tracked_content_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject functor) {
        return map_cache_strategy_rec_cache_object_tracked_content(strategy, functor);
    }

    public static SubLObject cache_strategy_object_untrack_all_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject functor) {
        return cache_strategy_rec_cache_object_untrack_all(strategy, functor);
    }

    public static SubLObject cache_strategy_rec_cache_object_cache_capacity(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_cache_capacity(interior_strategy);
    }

    public static SubLObject cache_strategy_rec_cache_object_cache_size(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_cache_size(interior_strategy);
    }

    public static SubLObject cache_strategy_rec_cache_object_dont_gather_metrics(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_dont_gather_metrics(interior_strategy);
    }

    public static SubLObject cache_strategy_rec_cache_object_gather_metrics(final SubLObject strategy, final SubLObject metrics) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_object_gather_metrics(interior_strategy, metrics);
    }

    public static SubLObject cache_strategy_rec_cache_object_get_metrics(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_get_metrics(interior_strategy);
    }

    public static SubLObject cache_strategy_rec_cache_object_get_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_get_parameter(interior_strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_rec_cache_object_keeps_metrics_p(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_keeps_metrics_p(interior_strategy);
    }

    public static SubLObject cache_strategy_rec_cache_object_note_reference(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        recording_cache_strategy_facade_record_action(strategy, $NOTE_REF, v_object);
        return cache_strategy_note_reference(interior_strategy, v_object);
    }

    public static SubLObject cache_strategy_rec_cache_object_note_references_in_order(final SubLObject strategy, final SubLObject objects) {
        return default_cache_strategy_object_note_references_in_order(strategy, objects);
    }

    public static SubLObject cache_strategy_rec_cache_object_reset(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_reset(interior_strategy);
    }

    public static SubLObject cache_strategy_rec_cache_object_reset_metrics(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_reset_metrics(interior_strategy);
    }

    public static SubLObject cache_strategy_rec_cache_object_set_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_set_parameter(interior_strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_rec_cache_object_supports_parameter_p(final SubLObject strategy, final SubLObject parameter) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_supports_parameter_p(interior_strategy, parameter);
    }

    public static SubLObject cache_strategy_rec_cache_object_track(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        recording_cache_strategy_facade_record_action(strategy, $TRACK, v_object);
        return cache_strategy_track(interior_strategy, v_object);
    }

    public static SubLObject cache_strategy_rec_cache_object_trackedP(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_trackedP(interior_strategy, v_object);
    }

    public static SubLObject cache_strategy_rec_cache_object_untrack(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        recording_cache_strategy_facade_record_action(strategy, $UNTRACK, v_object);
        return cache_strategy_untrack(interior_strategy, v_object);
    }

    public static SubLObject cache_strategy_rec_cache_object_untrack_all(final SubLObject strategy, final SubLObject functor) {
        return default_cache_strategy_object_untrack_all(strategy, functor);
    }

    public static SubLObject map_cache_strategy_rec_cache_object_tracked_content(final SubLObject strategy, final SubLObject functor) {
        return default_map_cache_strategy_object_tracked_content(strategy, functor);
    }

    public static SubLObject new_cache_strategy_rec_cache_object_tracked_content_iterator(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return new_cache_strategy_tracked_content_iterator(interior_strategy);
    }

    public static SubLObject test_mcache_strategy_implementation_conformance(final SubLObject capacity) {
        return test_cache_strategy_implementation_conformance(new_metered_preallocated_cache(capacity, UNPROVIDED));
    }

    public static SubLObject test_cache_strategy_implementation_conformance(final SubLObject strategy) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!cache_strategy_cache_size(strategy).isZero())) {
            Errors.error($str126$Cannot_properly_validate_dirty_ca, strategy);
        }
        SubLObject capacity;
        SubLObject i;
        for (capacity = cache_strategy_cache_capacity(strategy), i = NIL, i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != cache_strategy_trackedP(strategy, i))) {
                Errors.error($str127$Strategy__A_is_tracking_item__A_b, strategy, i);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!i.numE(cache_strategy_track(strategy, i)))) {
                Errors.error($str128$Strategy__A_is_suggesting_to_remo, strategy, i);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == cache_strategy_trackedP(strategy, i))) {
                Errors.error($str129$Strategy__A_is_not_tracking_item_, strategy, i);
            }
        }
        SubLObject curr_size = cache_strategy_cache_size(strategy);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!capacity.numE(curr_size))) {
            Errors.error($str130$After_adding__A_items_to_an_empty, capacity, curr_size);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == cache_strategy_cache_full_p(strategy))) {
            Errors.error($str131$The_strategy__A_does_not_implemen, strategy);
        }
        for (i = NIL, i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == cache_strategy_trackedP(strategy, i))) {
                Errors.error($str129$Strategy__A_is_not_tracking_item_, strategy, i);
            }
            cache_strategy_untrack(strategy, i);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != cache_strategy_trackedP(strategy, i))) {
                Errors.error($str132$Strategy__A_is_tracking_item__A_t, strategy, i);
            }
        }
        curr_size = cache_strategy_cache_size(strategy);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!curr_size.isZero())) {
            Errors.error($str133$After_removing__A_items_from_a_fu, capacity, curr_size);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == cache_strategy_cache_empty_p(strategy))) {
            Errors.error($str134$The_strategy__A_is_not_implementi, strategy);
        }
        return $SUCCESS;
    }

    public static SubLObject test_two_cache_strategy_implementations(final SubLObject strategy_a, final SubLObject strategy_b, final SubLObject items_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject list_var = NIL;
        SubLObject item = NIL;
        SubLObject counter = NIL;
        list_var = items_list;
        item = list_var.first();
        for (counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , counter = add(ONE_INTEGER, counter)) {
            final SubLObject result_a = cache_strategy_track(strategy_a, item);
            final SubLObject result_b = cache_strategy_track(strategy_b, item);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!result_a.eql(result_b))) {
                Errors.error($str136$The_two_strategies_disagree_on_th, new SubLObject[]{ counter, item, strategy_a, result_a, strategy_b, result_b });
            }
        }
        return $SUCCESS;
    }

    public static SubLObject faster_cache_strategy_implementation(final SubLObject strategy_a, final SubLObject strategy_b, final SubLObject items_list, SubLObject runs) {
        if (runs == UNPROVIDED) {
            runs = ONE_INTEGER;
        }
        test_two_cache_strategy_implementations(strategy_a, strategy_b, items_list);
        SubLObject total_time_a = ZERO_INTEGER;
        SubLObject total_time_b = ZERO_INTEGER;
        SubLObject run;
        SubLObject curr_time_a;
        SubLObject curr_time_b;
        SubLObject time_var;
        SubLObject cdolist_list_var;
        SubLObject item;
        for (run = NIL, run = ZERO_INTEGER; run.numL(runs); run = add(run, ONE_INTEGER)) {
            curr_time_a = NIL;
            curr_time_b = NIL;
            cache_strategy_reset(strategy_a);
            cache_strategy_reset(strategy_b);
            Storage.gc(UNPROVIDED);
            time_var = get_internal_real_time();
            cdolist_list_var = items_list;
            item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cache_strategy_track(strategy_b, item);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            curr_time_b = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            total_time_b = add(total_time_b, curr_time_b);
            Storage.gc(UNPROVIDED);
            time_var = get_internal_real_time();
            cdolist_list_var = items_list;
            item = NIL;
            item = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                cache_strategy_track(strategy_a, item);
                cdolist_list_var = cdolist_list_var.rest();
                item = cdolist_list_var.first();
            } 
            curr_time_a = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            total_time_a = add(total_time_a, curr_time_a);
        }
        return values(total_time_b.numL(total_time_a) ? strategy_b : strategy_a, total_time_a, total_time_b);
    }

    public static SubLObject determine_faster_cache_strategy_implementation(final SubLObject strategy_a, final SubLObject strategy_b, final SubLObject capacity, final SubLObject factor, SubLObject runs) {
        if (runs == UNPROVIDED) {
            runs = ONE_INTEGER;
        }
        final SubLObject items_list = random_integers_for_testing_caches(capacity, factor);
        return faster_cache_strategy_implementation(strategy_a, strategy_b, items_list, runs);
    }

    public static SubLObject random_integers_for_testing_caches(final SubLObject capacity, final SubLObject factor) {
        SubLObject range = capacity;
        SubLObject cursor;
        final SubLObject numbers = cursor = make_list(multiply(capacity, factor), UNPROVIDED);
        SubLObject i;
        SubLObject j;
        for (i = NIL, i = ZERO_INTEGER; i.numL(factor); i = add(i, ONE_INTEGER)) {
            for (j = NIL, j = ZERO_INTEGER; j.numL(capacity); j = add(j, ONE_INTEGER)) {
                rplaca(cursor, random.random(range));
                cursor = cursor.rest();
            }
            range = add(range, capacity);
        }
        return numbers;
    }

    public static SubLObject cache_to_dictionary(final SubLObject v_cache) {
        assert NIL != cache.cache_p(v_cache) : "cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) " + v_cache;
        final SubLObject result = dictionary.new_dictionary(cache.cache_test(v_cache), cache.cache_size(v_cache));
        final SubLObject order_var = $NEWEST;
        SubLObject entry = cache.do_cache_first(v_cache, order_var);
        SubLObject key = NIL;
        SubLObject value = NIL;
        while (NIL == cache.do_cache_doneP(v_cache, entry)) {
            key = cache.do_cache_key(entry);
            value = cache.do_cache_value(entry);
            entry = cache.do_cache_next(entry, order_var);
            dictionary.dictionary_enter(result, key, value);
        } 
        return result;
    }

    public static SubLObject declare_cache_utilities_file() {
        declareFunction(me, "cache_strategy_p", "CACHE-STRATEGY-P", 1, 0, false);
        declareFunction(me, "cache_strategy_or_symbol_p", "CACHE-STRATEGY-OR-SYMBOL-P", 1, 0, false);
        declareFunction(me, "cache_strategy_reset", "CACHE-STRATEGY-RESET", 1, 0, false);
        declareFunction(me, "cache_strategy_cache_capacity", "CACHE-STRATEGY-CACHE-CAPACITY", 1, 0, false);
        declareFunction(me, "cache_strategy_cache_size", "CACHE-STRATEGY-CACHE-SIZE", 1, 0, false);
        declareFunction(me, "cache_strategy_cache_load", "CACHE-STRATEGY-CACHE-LOAD", 1, 0, false);
        declareFunction(me, "cache_strategy_cache_full_p", "CACHE-STRATEGY-CACHE-FULL-P", 1, 0, false);
        declareFunction(me, "cache_strategy_cache_empty_p", "CACHE-STRATEGY-CACHE-EMPTY-P", 1, 0, false);
        declareFunction(me, "cache_strategy_track", "CACHE-STRATEGY-TRACK", 2, 0, false);
        declareFunction(me, "cache_strategy_trackedP", "CACHE-STRATEGY-TRACKED?", 2, 0, false);
        declareFunction(me, "cache_strategy_untrack", "CACHE-STRATEGY-UNTRACK", 2, 0, false);
        declareFunction(me, "cache_strategy_note_cache_hit", "CACHE-STRATEGY-NOTE-CACHE-HIT", 1, 0, false);
        declareFunction(me, "cache_strategy_note_cache_hits", "CACHE-STRATEGY-NOTE-CACHE-HITS", 2, 0, false);
        declareFunction(me, "cache_strategy_note_cache_miss", "CACHE-STRATEGY-NOTE-CACHE-MISS", 1, 0, false);
        declareFunction(me, "cache_strategy_supports_parameter_p", "CACHE-STRATEGY-SUPPORTS-PARAMETER-P", 2, 0, false);
        declareFunction(me, "cache_strategy_get_parameter", "CACHE-STRATEGY-GET-PARAMETER", 2, 1, false);
        declareFunction(me, "cache_strategy_set_parameter", "CACHE-STRATEGY-SET-PARAMETER", 3, 0, false);
        declareFunction(me, "cache_strategy_note_reference", "CACHE-STRATEGY-NOTE-REFERENCE", 2, 0, false);
        declareFunction(me, "cache_strategy_note_references_in_order", "CACHE-STRATEGY-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
        declareFunction(me, "cache_strategy_get_metrics", "CACHE-STRATEGY-GET-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_reset_metrics", "CACHE-STRATEGY-RESET-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_gather_metrics", "CACHE-STRATEGY-GATHER-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_dont_gather_metrics", "CACHE-STRATEGY-DONT-GATHER-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_keeps_metrics_p", "CACHE-STRATEGY-KEEPS-METRICS-P", 1, 0, false);
        declareFunction(me, "new_cache_strategy_tracked_content_iterator", "NEW-CACHE-STRATEGY-TRACKED-CONTENT-ITERATOR", 1, 0, false);
        declareFunction(me, "map_cache_strategy_tracked_content", "MAP-CACHE-STRATEGY-TRACKED-CONTENT", 2, 0, false);
        declareFunction(me, "cache_strategy_untrack_all", "CACHE-STRATEGY-UNTRACK-ALL", 2, 0, false);
        declareFunction(me, "cache_strategy_method_not_implemented_for", "CACHE-STRATEGY-METHOD-NOT-IMPLEMENTED-FOR", 1, 0, false);
        declareFunction(me, "cache_strategy_object_p", "CACHE-STRATEGY-OBJECT-P", 1, 0, false);
        declareFunction(me, "cache_strategy_object_reset", "CACHE-STRATEGY-OBJECT-RESET", 1, 0, false);
        declareFunction(me, "cache_strategy_object_cache_capacity", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY", 1, 0, false);
        declareFunction(me, "cache_strategy_object_cache_size", "CACHE-STRATEGY-OBJECT-CACHE-SIZE", 1, 0, false);
        declareFunction(me, "cache_strategy_object_track", "CACHE-STRATEGY-OBJECT-TRACK", 2, 0, false);
        declareFunction(me, "cache_strategy_object_trackedP", "CACHE-STRATEGY-OBJECT-TRACKED?", 2, 0, false);
        declareFunction(me, "cache_strategy_object_untrack", "CACHE-STRATEGY-OBJECT-UNTRACK", 2, 0, false);
        declareFunction(me, "cache_strategy_object_supports_parameter_p", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false);
        declareFunction(me, "cache_strategy_object_get_parameter", "CACHE-STRATEGY-OBJECT-GET-PARAMETER", 3, 0, false);
        declareFunction(me, "cache_strategy_object_set_parameter", "CACHE-STRATEGY-OBJECT-SET-PARAMETER", 3, 0, false);
        declareFunction(me, "cache_strategy_object_note_reference", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE", 2, 0, false);
        declareFunction(me, "cache_strategy_object_note_references_in_order", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
        declareFunction(me, "default_cache_strategy_object_note_references_in_order", "DEFAULT-CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
        declareFunction(me, "cache_strategy_object_get_metrics", "CACHE-STRATEGY-OBJECT-GET-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_object_reset_metrics", "CACHE-STRATEGY-OBJECT-RESET-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_object_gather_metrics", "CACHE-STRATEGY-OBJECT-GATHER-METRICS", 2, 0, false);
        declareFunction(me, "cache_strategy_object_dont_gather_metrics", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_object_keeps_metrics_p", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P", 1, 0, false);
        declareFunction(me, "new_cache_strategy_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false);
        declareFunction(me, "map_cache_strategy_object_tracked_content", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT", 2, 0, false);
        declareFunction(me, "default_map_cache_strategy_object_tracked_content", "DEFAULT-MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT", 2, 0, false);
        declareFunction(me, "cache_strategy_object_untrack_all", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL", 2, 0, false);
        declareFunction(me, "default_cache_strategy_object_untrack_all", "DEFAULT-CACHE-STRATEGY-OBJECT-UNTRACK-ALL", 2, 0, false);
        declareFunction(me, "cache_metrics_print_function_trampoline", "CACHE-METRICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "cache_metrics_p", "CACHE-METRICS-P", 1, 0, false);
        new cache_utilities.$cache_metrics_p$UnaryFunction();
        declareFunction(me, "cachemtr_hit_count", "CACHEMTR-HIT-COUNT", 1, 0, false);
        declareFunction(me, "cachemtr_miss_count", "CACHEMTR-MISS-COUNT", 1, 0, false);
        declareFunction(me, "_csetf_cachemtr_hit_count", "_CSETF-CACHEMTR-HIT-COUNT", 2, 0, false);
        declareFunction(me, "_csetf_cachemtr_miss_count", "_CSETF-CACHEMTR-MISS-COUNT", 2, 0, false);
        declareFunction(me, "make_cache_metrics", "MAKE-CACHE-METRICS", 0, 1, false);
        declareFunction(me, "visit_defstruct_cache_metrics", "VISIT-DEFSTRUCT-CACHE-METRICS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_cache_metrics_method", "VISIT-DEFSTRUCT-OBJECT-CACHE-METRICS-METHOD", 2, 0, false);
        declareFunction(me, "print_cache_metrics", "PRINT-CACHE-METRICS", 3, 0, false);
        declareFunction(me, "new_cache_metrics", "NEW-CACHE-METRICS", 0, 0, false);
        declareFunction(me, "reset_cache_metrics_counts", "RESET-CACHE-METRICS-COUNTS", 1, 2, false);
        declareFunction(me, "new_cache_metrics_with_counts", "NEW-CACHE-METRICS-WITH-COUNTS", 2, 0, false);
        declareFunction(me, "cache_metrics_reset", "CACHE-METRICS-RESET", 1, 0, false);
        declareFunction(me, "cache_metrics_note_hit", "CACHE-METRICS-NOTE-HIT", 1, 0, false);
        declareFunction(me, "cache_metrics_note_miss", "CACHE-METRICS-NOTE-MISS", 1, 0, false);
        declareFunction(me, "cache_metrics_hit_count", "CACHE-METRICS-HIT-COUNT", 1, 0, false);
        declareFunction(me, "cache_metrics_miss_count", "CACHE-METRICS-MISS-COUNT", 1, 0, false);
        declareFunction(me, "cache_metrics_hit_rate", "CACHE-METRICS-HIT-RATE", 1, 0, false);
        declareFunction(me, "cache_metrics_miss_rate", "CACHE-METRICS-MISS-RATE", 1, 0, false);
        declareFunction(me, "cache_metrics_cache_uses", "CACHE-METRICS-CACHE-USES", 1, 0, false);
        declareFunction(me, "gather_cache_strategy_information", "GATHER-CACHE-STRATEGY-INFORMATION", 1, 0, false);
        declareFunction(me, "cfasl_output_object_cache_metrics_method", "CFASL-OUTPUT-OBJECT-CACHE-METRICS-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_wide_output_cache_metrics", "CFASL-WIDE-OUTPUT-CACHE-METRICS", 2, 0, false);
        declareFunction(me, "cfasl_output_cache_metrics_internal", "CFASL-OUTPUT-CACHE-METRICS-INTERNAL", 2, 0, false);
        declareFunction(me, "cfasl_input_cache_metrics", "CFASL-INPUT-CACHE-METRICS", 1, 0, false);
        declareFunction(me, "metered_cache_print_function_trampoline", "METERED-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "metered_cache_p", "METERED-CACHE-P", 1, 0, false);
        new cache_utilities.$metered_cache_p$UnaryFunction();
        declareFunction(me, "mcache_cache", "MCACHE-CACHE", 1, 0, false);
        declareFunction(me, "mcache_metrics", "MCACHE-METRICS", 1, 0, false);
        declareFunction(me, "_csetf_mcache_cache", "_CSETF-MCACHE-CACHE", 2, 0, false);
        declareFunction(me, "_csetf_mcache_metrics", "_CSETF-MCACHE-METRICS", 2, 0, false);
        declareFunction(me, "make_metered_cache", "MAKE-METERED-CACHE", 0, 1, false);
        declareFunction(me, "visit_defstruct_metered_cache", "VISIT-DEFSTRUCT-METERED-CACHE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_metered_cache_method", "VISIT-DEFSTRUCT-OBJECT-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "new_metered_cache", "NEW-METERED-CACHE", 1, 0, false);
        declareFunction(me, "new_metered_preallocated_cache", "NEW-METERED-PREALLOCATED-CACHE", 1, 1, false);
        declareFunction(me, "print_metered_cache", "PRINT-METERED-CACHE", 3, 0, false);
        declareFunction(me, "cache_strategy_object_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-P-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_reset_metered_cache_method", "CACHE-STRATEGY-OBJECT-RESET-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_cache_capacity_metered_cache_method", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_cache_size_metered_cache_method", "CACHE-STRATEGY-OBJECT-CACHE-SIZE-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_track_metered_cache_method", "CACHE-STRATEGY-OBJECT-TRACK-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_trackedP_metered_cache_method", "CACHE-STRATEGY-OBJECT-TRACKED?-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_untrack_metered_cache_method", "CACHE-STRATEGY-OBJECT-UNTRACK-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_supports_parameter_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_get_parameter_metered_cache_method", "CACHE-STRATEGY-OBJECT-GET-PARAMETER-METERED-CACHE-METHOD", 3, 0, false);
        declareFunction(me, "cache_strategy_object_set_parameter_metered_cache_method", "CACHE-STRATEGY-OBJECT-SET-PARAMETER-METERED-CACHE-METHOD", 3, 0, false);
        declareFunction(me, "cache_strategy_object_note_reference_metered_cache_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_note_references_in_order_metered_cache_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_get_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-GET-METRICS-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_reset_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-RESET-METRICS-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_gather_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-GATHER-METRICS-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_dont_gather_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_keeps_metrics_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction(me, "new_cache_strategy_object_tracked_content_iterator_metered_cache_method", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction(me, "map_cache_strategy_object_tracked_content_metered_cache_method", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_untrack_all_metered_cache_method", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_reset", "CACHE-STRATEGY-MCACHE-OBJECT-RESET", 1, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_cache_capacity", "CACHE-STRATEGY-MCACHE-OBJECT-CACHE-CAPACITY", 1, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_track", "CACHE-STRATEGY-MCACHE-OBJECT-TRACK", 2, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_cache_size", "CACHE-STRATEGY-MCACHE-OBJECT-CACHE-SIZE", 1, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_trackedP", "CACHE-STRATEGY-MCACHE-OBJECT-TRACKED?", 2, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_untrack", "CACHE-STRATEGY-MCACHE-OBJECT-UNTRACK", 2, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_supports_parameter_p", "CACHE-STRATEGY-MCACHE-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_get_parameter", "CACHE-STRATEGY-MCACHE-OBJECT-GET-PARAMETER", 3, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_set_parameter", "CACHE-STRATEGY-MCACHE-OBJECT-SET-PARAMETER", 3, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_note_reference", "CACHE-STRATEGY-MCACHE-OBJECT-NOTE-REFERENCE", 2, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_note_references_in_order", "CACHE-STRATEGY-MCACHE-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_get_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-GET-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_reset_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-RESET-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_gather_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-GATHER-METRICS", 2, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_dont_gather_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-DONT-GATHER-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_keeps_metrics_p", "CACHE-STRATEGY-MCACHE-OBJECT-KEEPS-METRICS-P", 1, 0, false);
        declareFunction(me, "new_cache_strategy_mcache_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-MCACHE-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false);
        declareFunction(me, "map_cache_strategy_mcache_object_tracked_content", "MAP-CACHE-STRATEGY-MCACHE-OBJECT-TRACKED-CONTENT", 2, 0, false);
        declareFunction(me, "cache_strategy_mcache_object_untrack_all", "CACHE-STRATEGY-MCACHE-OBJECT-UNTRACK-ALL", 2, 0, false);
        declareFunction(me, "recording_cache_strategy_facade_print_function_trampoline", "RECORDING-CACHE-STRATEGY-FACADE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "recording_cache_strategy_facade_p", "RECORDING-CACHE-STRATEGY-FACADE-P", 1, 0, false);
        new cache_utilities.$recording_cache_strategy_facade_p$UnaryFunction();
        declareFunction(me, "rec_cachstrat_facade_cache_strategy", "REC-CACHSTRAT-FACADE-CACHE-STRATEGY", 1, 0, false);
        declareFunction(me, "rec_cachstrat_facade_records", "REC-CACHSTRAT-FACADE-RECORDS", 1, 0, false);
        declareFunction(me, "rec_cachstrat_facade_timestamper", "REC-CACHSTRAT-FACADE-TIMESTAMPER", 1, 0, false);
        declareFunction(me, "_csetf_rec_cachstrat_facade_cache_strategy", "_CSETF-REC-CACHSTRAT-FACADE-CACHE-STRATEGY", 2, 0, false);
        declareFunction(me, "_csetf_rec_cachstrat_facade_records", "_CSETF-REC-CACHSTRAT-FACADE-RECORDS", 2, 0, false);
        declareFunction(me, "_csetf_rec_cachstrat_facade_timestamper", "_CSETF-REC-CACHSTRAT-FACADE-TIMESTAMPER", 2, 0, false);
        declareFunction(me, "make_recording_cache_strategy_facade", "MAKE-RECORDING-CACHE-STRATEGY-FACADE", 0, 1, false);
        declareFunction(me, "visit_defstruct_recording_cache_strategy_facade", "VISIT-DEFSTRUCT-RECORDING-CACHE-STRATEGY-FACADE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_recording_cache_strategy_facade_method", "VISIT-DEFSTRUCT-OBJECT-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction(me, "new_recording_cache_strategy_facade", "NEW-RECORDING-CACHE-STRATEGY-FACADE", 2, 0, false);
        declareFunction(me, "recording_cache_strategy_facade_get_records", "RECORDING-CACHE-STRATEGY-FACADE-GET-RECORDS", 1, 0, false);
        declareFunction(me, "recording_cache_strategy_facade_get_facaded_cache_strategy", "RECORDING-CACHE-STRATEGY-FACADE-GET-FACADED-CACHE-STRATEGY", 1, 0, false);
        declareFunction(me, "recording_cache_strategy_facade_record_action", "RECORDING-CACHE-STRATEGY-FACADE-RECORD-ACTION", 3, 0, false);
        declareFunction(me, "print_recording_cache_strategy_facade", "PRINT-RECORDING-CACHE-STRATEGY-FACADE", 3, 0, false);
        declareFunction(me, "cache_strategy_object_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_reset_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-RESET-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_cache_capacity_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_cache_size_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-CACHE-SIZE-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_track_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-TRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_trackedP_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-TRACKED?-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_untrack_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-UNTRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_supports_parameter_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_get_parameter_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 3, 0, false);
        declareFunction(me, "cache_strategy_object_set_parameter_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-SET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 3, 0, false);
        declareFunction(me, "cache_strategy_object_note_reference_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_note_references_in_order_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_get_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_reset_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-RESET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_gather_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_dont_gather_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction(me, "cache_strategy_object_keeps_metrics_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction(me, "new_cache_strategy_object_tracked_content_iterator_recording_cache_strategy_facade_method", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction(me, "map_cache_strategy_object_tracked_content_recording_cache_strategy_facade_method", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_object_untrack_all_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_cache_capacity", "CACHE-STRATEGY-REC-CACHE-OBJECT-CACHE-CAPACITY", 1, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_cache_size", "CACHE-STRATEGY-REC-CACHE-OBJECT-CACHE-SIZE", 1, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_dont_gather_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-DONT-GATHER-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_gather_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-GATHER-METRICS", 2, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_get_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-GET-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_get_parameter", "CACHE-STRATEGY-REC-CACHE-OBJECT-GET-PARAMETER", 3, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_keeps_metrics_p", "CACHE-STRATEGY-REC-CACHE-OBJECT-KEEPS-METRICS-P", 1, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_note_reference", "CACHE-STRATEGY-REC-CACHE-OBJECT-NOTE-REFERENCE", 2, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_note_references_in_order", "CACHE-STRATEGY-REC-CACHE-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_reset", "CACHE-STRATEGY-REC-CACHE-OBJECT-RESET", 1, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_reset_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-RESET-METRICS", 1, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_set_parameter", "CACHE-STRATEGY-REC-CACHE-OBJECT-SET-PARAMETER", 3, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_supports_parameter_p", "CACHE-STRATEGY-REC-CACHE-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_track", "CACHE-STRATEGY-REC-CACHE-OBJECT-TRACK", 2, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_trackedP", "CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED?", 2, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_untrack", "CACHE-STRATEGY-REC-CACHE-OBJECT-UNTRACK", 2, 0, false);
        declareFunction(me, "cache_strategy_rec_cache_object_untrack_all", "CACHE-STRATEGY-REC-CACHE-OBJECT-UNTRACK-ALL", 2, 0, false);
        declareFunction(me, "map_cache_strategy_rec_cache_object_tracked_content", "MAP-CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED-CONTENT", 2, 0, false);
        declareFunction(me, "new_cache_strategy_rec_cache_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false);
        declareFunction(me, "test_mcache_strategy_implementation_conformance", "TEST-MCACHE-STRATEGY-IMPLEMENTATION-CONFORMANCE", 1, 0, false);
        declareFunction(me, "test_cache_strategy_implementation_conformance", "TEST-CACHE-STRATEGY-IMPLEMENTATION-CONFORMANCE", 1, 0, false);
        declareFunction(me, "test_two_cache_strategy_implementations", "TEST-TWO-CACHE-STRATEGY-IMPLEMENTATIONS", 3, 0, false);
        declareFunction(me, "faster_cache_strategy_implementation", "FASTER-CACHE-STRATEGY-IMPLEMENTATION", 3, 1, false);
        declareFunction(me, "determine_faster_cache_strategy_implementation", "DETERMINE-FASTER-CACHE-STRATEGY-IMPLEMENTATION", 4, 1, false);
        declareFunction(me, "random_integers_for_testing_caches", "RANDOM-INTEGERS-FOR-TESTING-CACHES", 2, 0, false);
        declareFunction(me, "cache_to_dictionary", "CACHE-TO-DICTIONARY", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_cache_utilities_file() {
        deflexical("*CACHE-STRATEGY-OBJECT-P-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-RESET-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-CACHE-SIZE-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-TRACK-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-TRACKED?-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-UNTRACK-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-GET-PARAMETER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-SET-PARAMETER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-GET-METRICS-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-RESET-METRICS-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-GATHER-METRICS-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METHOD-TABLE*", make_vector($int$256, NIL));
        deflexical("*CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METHOD-TABLE*", make_vector($int$256, NIL));
        defconstant("*DTP-CACHE-METRICS*", CACHE_METRICS);
        defconstant("*CFASL-WIDE-OPCODE-CACHE-METRICS*", $int$129);
        defconstant("*DTP-METERED-CACHE*", METERED_CACHE);
        defconstant("*DTP-RECORDING-CACHE-STRATEGY-FACADE*", RECORDING_CACHE_STRATEGY_FACADE);
        return NIL;
    }

    public static SubLObject setup_cache_utilities_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cache_metrics$.getGlobalValue(), symbol_function(CACHE_METRICS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list14);
        def_csetf(CACHEMTR_HIT_COUNT, _CSETF_CACHEMTR_HIT_COUNT);
        def_csetf(CACHEMTR_MISS_COUNT, _CSETF_CACHEMTR_MISS_COUNT);
        identity(CACHE_METRICS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_cache_metrics$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CACHE_METRICS_METHOD));
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_cache_metrics$.getGlobalValue(), CFASL_INPUT_CACHE_METRICS);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cache_metrics$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CACHE_METRICS_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(METERED_CACHE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list41);
        def_csetf(MCACHE_CACHE, _CSETF_MCACHE_CACHE);
        def_csetf(MCACHE_METRICS, _CSETF_MCACHE_METRICS);
        identity(METERED_CACHE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_P_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_RESET_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_CACHE_SIZE_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_TRACK_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function($sym58$CACHE_STRATEGY_OBJECT_TRACKED__METERED_CACHE_METHOD));
        register_method($cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_UNTRACK_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_GET_PARAMETER_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_SET_PARAMETER_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function($sym64$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_METERED_CACHE_METH));
        register_method($cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_GET_METRICS_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_RESET_METRICS_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_GATHER_METRICS_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_METERED_CACHE_METHOD));
        register_method($new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function($sym70$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_METERED_CACHE_));
        register_method($map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_UNTRACK_ALL_METERED_CACHE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function(RECORDING_CACHE_STRATEGY_FACADE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list81);
        def_csetf(REC_CACHSTRAT_FACADE_CACHE_STRATEGY, _CSETF_REC_CACHSTRAT_FACADE_CACHE_STRATEGY);
        def_csetf(REC_CACHSTRAT_FACADE_RECORDS, _CSETF_REC_CACHSTRAT_FACADE_RECORDS);
        def_csetf(REC_CACHSTRAT_FACADE_TIMESTAMPER, _CSETF_REC_CACHSTRAT_FACADE_TIMESTAMPER);
        identity(RECORDING_CACHE_STRATEGY_FACADE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RECORDING_CACHE_STRATEGY_FACADE_METHOD));
        register_method($cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_P_RECORDING_CACHE_STRATEGY_FACADE_METHOD));
        register_method($cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym96$CACHE_STRATEGY_OBJECT_RESET_RECORDING_CACHE_STRATEGY_FACADE_METHO));
        register_method($cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym97$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_RECORDING_CACHE_STRATEGY_FAC));
        register_method($cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym98$CACHE_STRATEGY_OBJECT_CACHE_SIZE_RECORDING_CACHE_STRATEGY_FACADE_));
        register_method($cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym99$CACHE_STRATEGY_OBJECT_TRACK_RECORDING_CACHE_STRATEGY_FACADE_METHO));
        register_method($cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym100$CACHE_STRATEGY_OBJECT_TRACKED__RECORDING_CACHE_STRATEGY_FACADE_ME));
        register_method($cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym101$CACHE_STRATEGY_OBJECT_UNTRACK_RECORDING_CACHE_STRATEGY_FACADE_MET));
        register_method($cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym102$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_RECORDING_CACHE_STRATE));
        register_method($cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym103$CACHE_STRATEGY_OBJECT_GET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA));
        register_method($cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym104$CACHE_STRATEGY_OBJECT_SET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA));
        register_method($cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym105$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_RECORDING_CACHE_STRATEGY_FAC));
        register_method($cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym106$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_RECORDING_CACHE_ST));
        register_method($cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym107$CACHE_STRATEGY_OBJECT_GET_METRICS_RECORDING_CACHE_STRATEGY_FACADE));
        register_method($cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym108$CACHE_STRATEGY_OBJECT_RESET_METRICS_RECORDING_CACHE_STRATEGY_FACA));
        register_method($cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym109$CACHE_STRATEGY_OBJECT_GATHER_METRICS_RECORDING_CACHE_STRATEGY_FAC));
        register_method($cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym110$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_RECORDING_CACHE_STRATEG));
        register_method($cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym111$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_RECORDING_CACHE_STRATEGY_FA));
        register_method($new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym112$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_RECORDING_CACH));
        register_method($map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym113$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_RECORDING_CACHE_STRATEG));
        register_method($cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym114$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_RECORDING_CACHE_STRATEGY_FACADE));
        define_test_case_table_int(TEST_MCACHE_STRATEGY_IMPLEMENTATION_CONFORMANCE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list125);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_cache_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_cache_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_cache_utilities_file();
    }

    static {




































































































































































    }

    public static final class $cache_metrics_native extends SubLStructNative {
        public SubLObject $hit_count;

        public SubLObject $miss_count;

        private static final SubLStructDeclNative structDecl;

        public $cache_metrics_native() {
            this.$hit_count = Lisp.NIL;
            this.$miss_count = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$hit_count;
        }

        @Override
        public SubLObject getField3() {
            return this.$miss_count;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$hit_count = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$miss_count = value;
        }

        static {
            structDecl = makeStructDeclNative(cache_utilities.$cache_metrics_native.class, CACHE_METRICS, CACHE_METRICS_P, $list8, $list9, new String[]{ "$hit_count", "$miss_count" }, $list10, $list11, PRINT_CACHE_METRICS);
        }
    }

    public static final class $cache_metrics_p$UnaryFunction extends UnaryFunction {
        public $cache_metrics_p$UnaryFunction() {
            super(extractFunctionNamed("CACHE-METRICS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cache_metrics_p(arg1);
        }
    }

    public static final class $metered_cache_native extends SubLStructNative {
        public SubLObject $cache;

        public SubLObject $metrics;

        private static final SubLStructDeclNative structDecl;

        public $metered_cache_native() {
            this.$cache = Lisp.NIL;
            this.$metrics = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$cache;
        }

        @Override
        public SubLObject getField3() {
            return this.$metrics;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$cache = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$metrics = value;
        }

        static {
            structDecl = makeStructDeclNative(cache_utilities.$metered_cache_native.class, METERED_CACHE, METERED_CACHE_P, $list35, $list36, new String[]{ "$cache", "$metrics" }, $list37, $list38, PRINT_METERED_CACHE);
        }
    }

    public static final class $metered_cache_p$UnaryFunction extends UnaryFunction {
        public $metered_cache_p$UnaryFunction() {
            super(extractFunctionNamed("METERED-CACHE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return metered_cache_p(arg1);
        }
    }

    public static final class $recording_cache_strategy_facade_native extends SubLStructNative {
        public SubLObject $cache_strategy;

        public SubLObject $records;

        public SubLObject $timestamper;

        private static final SubLStructDeclNative structDecl;

        public $recording_cache_strategy_facade_native() {
            this.$cache_strategy = Lisp.NIL;
            this.$records = Lisp.NIL;
            this.$timestamper = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$cache_strategy;
        }

        @Override
        public SubLObject getField3() {
            return this.$records;
        }

        @Override
        public SubLObject getField4() {
            return this.$timestamper;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$cache_strategy = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$records = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$timestamper = value;
        }

        static {
            structDecl = makeStructDeclNative(cache_utilities.$recording_cache_strategy_facade_native.class, RECORDING_CACHE_STRATEGY_FACADE, RECORDING_CACHE_STRATEGY_FACADE_P, $list75, $list76, new String[]{ "$cache_strategy", "$records", "$timestamper" }, $list77, $list78, PRINT_RECORDING_CACHE_STRATEGY_FACADE);
        }
    }

    public static final class $recording_cache_strategy_facade_p$UnaryFunction extends UnaryFunction {
        public $recording_cache_strategy_facade_p$UnaryFunction() {
            super(extractFunctionNamed("RECORDING-CACHE-STRATEGY-FACADE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return recording_cache_strategy_facade_p(arg1);
        }
    }
}

/**
 * Total time: 477 ms
 */
