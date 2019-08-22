/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.$cfasl_output_object_method_table$;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output_wide_opcode;
import static com.cyc.cycjava.cycl.cfasl.register_wide_cfasl_opcode_input_function;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.integer_sequence_generator.integer_sequence_generator_next;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numG;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.zerop;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      CACHE-UTILITIES
 * source file: /cyc/top/cycl/cache-utilities.lisp
 * created:     2019/07/03 17:37:15
 */
public final class cache_utilities extends SubLTranslatedFile implements V12 {
    public static final class $recording_cache_strategy_facade_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.cache_utilities.$recording_cache_strategy_facade_native.this.$cache_strategy;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.cache_utilities.$recording_cache_strategy_facade_native.this.$records;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.cache_utilities.$recording_cache_strategy_facade_native.this.$timestamper;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.cache_utilities.$recording_cache_strategy_facade_native.this.$cache_strategy = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.cache_utilities.$recording_cache_strategy_facade_native.this.$records = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.cache_utilities.$recording_cache_strategy_facade_native.this.$timestamper = value;
        }

        public SubLObject $cache_strategy = Lisp.NIL;

        public SubLObject $records = Lisp.NIL;

        public SubLObject $timestamper = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cache_utilities.$recording_cache_strategy_facade_native.class, RECORDING_CACHE_STRATEGY_FACADE, RECORDING_CACHE_STRATEGY_FACADE_P, $list_alt69, $list_alt70, new String[]{ "$cache_strategy", "$records", "$timestamper" }, $list_alt71, $list_alt72, PRINT_RECORDING_CACHE_STRATEGY_FACADE);
    }

    public static final SubLFile me = new cache_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.cache_utilities";


    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_p_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-P-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_reset_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-RESET-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_cache_capacity_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_cache_size_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-CACHE-SIZE-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_track_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-TRACK-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_trackedP_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-TRACKED?-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_untrack_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-UNTRACK-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_supports_parameter_p_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_get_parameter_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-GET-PARAMETER-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_set_parameter_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-SET-PARAMETER-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_note_reference_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_note_references_in_order_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_get_metrics_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-GET-METRICS-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_reset_metrics_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-RESET-METRICS-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_gather_metrics_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-GATHER-METRICS-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_dont_gather_metrics_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_keeps_metrics_p_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $new_cache_strategy_object_tracked_content_iterator_method_table$ = makeSymbol("*NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $map_cache_strategy_object_tracked_content_method_table$ = makeSymbol("*MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METHOD-TABLE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $cache_strategy_object_untrack_all_method_table$ = makeSymbol("*CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METHOD-TABLE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_cache_metrics$ = makeSymbol("*DTP-CACHE-METRICS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $cfasl_wide_opcode_cache_metrics$ = makeSymbol("*CFASL-WIDE-OPCODE-CACHE-METRICS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_metered_cache$ = makeSymbol("*DTP-METERED-CACHE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_recording_cache_strategy_facade$ = makeSymbol("*DTP-RECORDING-CACHE-STRATEGY-FACADE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol CACHE_STRATEGY_P = makeSymbol("CACHE-STRATEGY-P");

    static private final SubLString $str4$Not_implemented_for__A_ = makeString("Not implemented for ~A.");

    private static final SubLSymbol CACHE_METRICS = makeSymbol("CACHE-METRICS");

    private static final SubLSymbol CACHE_METRICS_P = makeSymbol("CACHE-METRICS-P");

    static private final SubLList $list8 = list(makeSymbol("HIT-COUNT"), makeSymbol("MISS-COUNT"));

    static private final SubLList $list9 = list(makeKeyword("HIT-COUNT"), makeKeyword("MISS-COUNT"));

    static private final SubLList $list10 = list(makeSymbol("CACHEMTR-HIT-COUNT"), makeSymbol("CACHEMTR-MISS-COUNT"));

    static private final SubLList $list11 = list(makeSymbol("_CSETF-CACHEMTR-HIT-COUNT"), makeSymbol("_CSETF-CACHEMTR-MISS-COUNT"));

    private static final SubLSymbol PRINT_CACHE_METRICS = makeSymbol("PRINT-CACHE-METRICS");

    private static final SubLSymbol CACHE_METRICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CACHE-METRICS-PRINT-FUNCTION-TRAMPOLINE");

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

    static private final SubLList $list35 = list(makeSymbol("CACHE"), makeSymbol("METRICS"));

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

    // Definitions
    /**
     * Determine whether the object is a cache strategy or not.
     *
     * @return BOOLEANP
     */
    @LispMethod(comment = "Determine whether the object is a cache strategy or not.\r\n\r\n@return BOOLEANP")
    public static final SubLObject cache_strategy_p_alt(SubLObject v_object) {
        return cache_strategy_object_p(v_object);
    }

    // Definitions
    /**
     * Determine whether the object is a cache strategy or not.
     *
     * @return BOOLEANP
     */
    @LispMethod(comment = "Determine whether the object is a cache strategy or not.\r\n\r\n@return BOOLEANP")
    public static SubLObject cache_strategy_p(final SubLObject v_object) {
        return cache_strategy_object_p(v_object);
    }

    /**
     * Determine whether the object is a cache strategy or a symbol
     * (which is interpreted as NO caching).
     * Useful for optional argument passing.
     *
     * @return BOOLEAN
     */
    @LispMethod(comment = "Determine whether the object is a cache strategy or a symbol\r\n(which is interpreted as NO caching).\r\nUseful for optional argument passing.\r\n\r\n@return BOOLEAN\nDetermine whether the object is a cache strategy or a symbol\n(which is interpreted as NO caching).\nUseful for optional argument passing.")
    public static final SubLObject cache_strategy_or_symbol_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() || (NIL != cache_strategy_p(v_object)));
    }

    /**
     * Determine whether the object is a cache strategy or a symbol
     * (which is interpreted as NO caching).
     * Useful for optional argument passing.
     *
     * @return BOOLEAN
     */
    @LispMethod(comment = "Determine whether the object is a cache strategy or a symbol\r\n(which is interpreted as NO caching).\r\nUseful for optional argument passing.\r\n\r\n@return BOOLEAN\nDetermine whether the object is a cache strategy or a symbol\n(which is interpreted as NO caching).\nUseful for optional argument passing.")
    public static SubLObject cache_strategy_or_symbol_p(final SubLObject v_object) {
        return makeBoolean(v_object.isSymbol() || (NIL != cache_strategy_p(v_object)));
    }

    /**
     * Reset the cache strategy, losing all information in the process.
     * Notice that this is different from UNTRACK-ALL.
     *
     * @return CACHE-STRATEGY-P
     */
    @LispMethod(comment = "Reset the cache strategy, losing all information in the process.\r\nNotice that this is different from UNTRACK-ALL.\r\n\r\n@return CACHE-STRATEGY-P\nReset the cache strategy, losing all information in the process.\nNotice that this is different from UNTRACK-ALL.")
    public static final SubLObject cache_strategy_reset_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        cache_strategy_object_reset(strategy);
        return strategy;
    }

    /**
     * Reset the cache strategy, losing all information in the process.
     * Notice that this is different from UNTRACK-ALL.
     *
     * @return CACHE-STRATEGY-P
     */
    @LispMethod(comment = "Reset the cache strategy, losing all information in the process.\r\nNotice that this is different from UNTRACK-ALL.\r\n\r\n@return CACHE-STRATEGY-P\nReset the cache strategy, losing all information in the process.\nNotice that this is different from UNTRACK-ALL.")
    public static SubLObject cache_strategy_reset(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        cache_strategy_object_reset(strategy);
        return strategy;
    }

    /**
     * Get the maximal number of entries before the strategy will recommend
     * uncaching an item.
     *
     * @return POSITIVE-INTEGER-P
     */
    @LispMethod(comment = "Get the maximal number of entries before the strategy will recommend\r\nuncaching an item.\r\n\r\n@return POSITIVE-INTEGER-P\nGet the maximal number of entries before the strategy will recommend\nuncaching an item.")
    public static final SubLObject cache_strategy_cache_capacity_alt(SubLObject strategy) {
        return cache_strategy_object_cache_capacity(strategy);
    }

    /**
     * Get the maximal number of entries before the strategy will recommend
     * uncaching an item.
     *
     * @return POSITIVE-INTEGER-P
     */
    @LispMethod(comment = "Get the maximal number of entries before the strategy will recommend\r\nuncaching an item.\r\n\r\n@return POSITIVE-INTEGER-P\nGet the maximal number of entries before the strategy will recommend\nuncaching an item.")
    public static SubLObject cache_strategy_cache_capacity(final SubLObject strategy) {
        return cache_strategy_object_cache_capacity(strategy);
    }

    /**
     * Get the current number of entries in the cache that the
     * strategy is tracking.
     *
     * @return NON-NEGATIVE-INTEGER-P
     */
    @LispMethod(comment = "Get the current number of entries in the cache that the\r\nstrategy is tracking.\r\n\r\n@return NON-NEGATIVE-INTEGER-P\nGet the current number of entries in the cache that the\nstrategy is tracking.")
    public static final SubLObject cache_strategy_cache_size_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        return cache_strategy_object_cache_size(strategy);
    }

    /**
     * Get the current number of entries in the cache that the
     * strategy is tracking.
     *
     * @return NON-NEGATIVE-INTEGER-P
     */
    @LispMethod(comment = "Get the current number of entries in the cache that the\r\nstrategy is tracking.\r\n\r\n@return NON-NEGATIVE-INTEGER-P\nGet the current number of entries in the cache that the\nstrategy is tracking.")
    public static SubLObject cache_strategy_cache_size(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        return cache_strategy_object_cache_size(strategy);
    }

    /**
     * Give the ratio of the size with respect to the capacity of
     * the cache as a floating point number between 0 and 1.
     *
     * @return FLOATP
     */
    @LispMethod(comment = "Give the ratio of the size with respect to the capacity of\r\nthe cache as a floating point number between 0 and 1.\r\n\r\n@return FLOATP\nGive the ratio of the size with respect to the capacity of\nthe cache as a floating point number between 0 and 1.")
    public static final SubLObject cache_strategy_cache_load_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        return divide(cache_strategy_cache_size(strategy), cache_strategy_cache_capacity(strategy));
    }

    /**
     * Give the ratio of the size with respect to the capacity of
     * the cache as a floating point number between 0 and 1.
     *
     * @return FLOATP
     */
    @LispMethod(comment = "Give the ratio of the size with respect to the capacity of\r\nthe cache as a floating point number between 0 and 1.\r\n\r\n@return FLOATP\nGive the ratio of the size with respect to the capacity of\nthe cache as a floating point number between 0 and 1.")
    public static SubLObject cache_strategy_cache_load(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        return divide(cache_strategy_cache_size(strategy), cache_strategy_cache_capacity(strategy));
    }

    /**
     * Determine whether the cache strategy is currently at capacity.
     *
     * @return BOOLEANP true if the next tracking request will require
    ejecting an object, false if current size is lower than the capacity
     */
    @LispMethod(comment = "Determine whether the cache strategy is currently at capacity.\r\n\r\n@return BOOLEANP true if the next tracking request will require\r\nejecting an object, false if current size is lower than the capacity")
    public static final SubLObject cache_strategy_cache_full_p_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        return numE(cache_strategy_cache_size(strategy), cache_strategy_cache_capacity(strategy));
    }

    /**
     * Determine whether the cache strategy is currently at capacity.
     *
     * @return BOOLEANP true if the next tracking request will require
    ejecting an object, false if current size is lower than the capacity
     */
    @LispMethod(comment = "Determine whether the cache strategy is currently at capacity.\r\n\r\n@return BOOLEANP true if the next tracking request will require\r\nejecting an object, false if current size is lower than the capacity")
    public static SubLObject cache_strategy_cache_full_p(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        return numE(cache_strategy_cache_size(strategy), cache_strategy_cache_capacity(strategy));
    }

    /**
     * Determine whether the cache is currently tracking any elements.
     *
     * @return BOOLEANP true if the cache size is currently 0,
    false otherwise.
     */
    @LispMethod(comment = "Determine whether the cache is currently tracking any elements.\r\n\r\n@return BOOLEANP true if the cache size is currently 0,\r\nfalse otherwise.")
    public static final SubLObject cache_strategy_cache_empty_p_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        return zerop(cache_strategy_cache_size(strategy));
    }

    /**
     * Determine whether the cache is currently tracking any elements.
     *
     * @return BOOLEANP true if the cache size is currently 0,
    false otherwise.
     */
    @LispMethod(comment = "Determine whether the cache is currently tracking any elements.\r\n\r\n@return BOOLEANP true if the cache size is currently 0,\r\nfalse otherwise.")
    public static SubLObject cache_strategy_cache_empty_p(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        return zerop(cache_strategy_cache_size(strategy));
    }

    /**
     * Track this object in the cache. If CACHE-STRATEGY-CACHE-FULL-P
     * is TRUE, then select an object to untrack and return that
     * no longer tracked object; otherwise return the newly tracked
     * object.
     *
     * @return either the newly tracked object or, if the cache was
    at capacity, the ejected OBJECT
     */
    @LispMethod(comment = "Track this object in the cache. If CACHE-STRATEGY-CACHE-FULL-P\r\nis TRUE, then select an object to untrack and return that\r\nno longer tracked object; otherwise return the newly tracked\r\nobject.\r\n\r\n@return either the newly tracked object or, if the cache was\r\nat capacity, the ejected OBJECT\nTrack this object in the cache. If CACHE-STRATEGY-CACHE-FULL-P\nis TRUE, then select an object to untrack and return that\nno longer tracked object; otherwise return the newly tracked\nobject.")
    public static final SubLObject cache_strategy_track_alt(SubLObject strategy, SubLObject v_object) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        return cache_strategy_object_track(strategy, v_object);
    }

    /**
     * Track this object in the cache. If CACHE-STRATEGY-CACHE-FULL-P
     * is TRUE, then select an object to untrack and return that
     * no longer tracked object; otherwise return the newly tracked
     * object.
     *
     * @return either the newly tracked object or, if the cache was
    at capacity, the ejected OBJECT
     */
    @LispMethod(comment = "Track this object in the cache. If CACHE-STRATEGY-CACHE-FULL-P\r\nis TRUE, then select an object to untrack and return that\r\nno longer tracked object; otherwise return the newly tracked\r\nobject.\r\n\r\n@return either the newly tracked object or, if the cache was\r\nat capacity, the ejected OBJECT\nTrack this object in the cache. If CACHE-STRATEGY-CACHE-FULL-P\nis TRUE, then select an object to untrack and return that\nno longer tracked object; otherwise return the newly tracked\nobject.")
    public static SubLObject cache_strategy_track(final SubLObject strategy, final SubLObject v_object) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        return cache_strategy_object_track(strategy, v_object);
    }

    /**
     * Determine whether this object is currently being tracked
     *
     * @return BOOLEANP true if the object is already tracked in the
    cache, FALSE if not
     */
    @LispMethod(comment = "Determine whether this object is currently being tracked\r\n\r\n@return BOOLEANP true if the object is already tracked in the\r\ncache, FALSE if not")
    public static final SubLObject cache_strategy_trackedP_alt(SubLObject strategy, SubLObject v_object) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        return cache_strategy_object_trackedP(strategy, v_object);
    }

    /**
     * Determine whether this object is currently being tracked
     *
     * @return BOOLEANP true if the object is already tracked in the
    cache, FALSE if not
     */
    @LispMethod(comment = "Determine whether this object is currently being tracked\r\n\r\n@return BOOLEANP true if the object is already tracked in the\r\ncache, FALSE if not")
    public static SubLObject cache_strategy_trackedP(final SubLObject strategy, final SubLObject v_object) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        return cache_strategy_object_trackedP(strategy, v_object);
    }

    /**
     * Tell the strategy to stop tracking the object. This call
     * succeeds even if the object was never tracked.
     *
     * @return OBJECT the object argument
     */
    @LispMethod(comment = "Tell the strategy to stop tracking the object. This call\r\nsucceeds even if the object was never tracked.\r\n\r\n@return OBJECT the object argument\nTell the strategy to stop tracking the object. This call\nsucceeds even if the object was never tracked.")
    public static final SubLObject cache_strategy_untrack_alt(SubLObject strategy, SubLObject v_object) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        cache_strategy_object_untrack(strategy, v_object);
        return v_object;
    }

    /**
     * Tell the strategy to stop tracking the object. This call
     * succeeds even if the object was never tracked.
     *
     * @return OBJECT the object argument
     */
    @LispMethod(comment = "Tell the strategy to stop tracking the object. This call\r\nsucceeds even if the object was never tracked.\r\n\r\n@return OBJECT the object argument\nTell the strategy to stop tracking the object. This call\nsucceeds even if the object was never tracked.")
    public static SubLObject cache_strategy_untrack(final SubLObject strategy, final SubLObject v_object) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        cache_strategy_object_untrack(strategy, v_object);
        return v_object;
    }

    /**
     * If metrics are being kept, then note the cache hit.
     * Otherwise the operation is a NO-OP.
     *
     * @return STRATEGY
     */
    @LispMethod(comment = "If metrics are being kept, then note the cache hit.\r\nOtherwise the operation is a NO-OP.\r\n\r\n@return STRATEGY\nIf metrics are being kept, then note the cache hit.\nOtherwise the operation is a NO-OP.")
    public static final SubLObject cache_strategy_note_cache_hit_alt(SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            cache_metrics_note_hit(cache_strategy_get_metrics(strategy));
        }
        return strategy;
    }

    /**
     * If metrics are being kept, then note the cache hit.
     * Otherwise the operation is a NO-OP.
     *
     * @return STRATEGY
     */
    @LispMethod(comment = "If metrics are being kept, then note the cache hit.\r\nOtherwise the operation is a NO-OP.\r\n\r\n@return STRATEGY\nIf metrics are being kept, then note the cache hit.\nOtherwise the operation is a NO-OP.")
    public static SubLObject cache_strategy_note_cache_hit(final SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            cache_metrics_note_hit(cache_strategy_get_metrics(strategy));
        }
        return strategy;
    }

    /**
     * If metrics are being kept, then note the cache hit.
     * Otherwise the operation is a NO-OP.
     *
     * @return STRATEGY
     */
    @LispMethod(comment = "If metrics are being kept, then note the cache hit.\r\nOtherwise the operation is a NO-OP.\r\n\r\n@return STRATEGY\nIf metrics are being kept, then note the cache hit.\nOtherwise the operation is a NO-OP.")
    public static final SubLObject cache_strategy_note_cache_hits_alt(SubLObject strategy, SubLObject several) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            {
                SubLObject metrics = cache_strategy_get_metrics(strategy);
                SubLObject i = NIL;
                for (i = ZERO_INTEGER; i.numL(several); i = add(i, ONE_INTEGER)) {
                    cache_metrics_note_hit(metrics);
                }
            }
        }
        return strategy;
    }

    /**
     * If metrics are being kept, then note the cache hit.
     * Otherwise the operation is a NO-OP.
     *
     * @return STRATEGY
     */
    @LispMethod(comment = "If metrics are being kept, then note the cache hit.\r\nOtherwise the operation is a NO-OP.\r\n\r\n@return STRATEGY\nIf metrics are being kept, then note the cache hit.\nOtherwise the operation is a NO-OP.")
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

    /**
     * If metrics are being kept, then note the cache miss.
     * Otherwise, the operation is a NO-OP
     *
     * @return STRATEGY
     */
    @LispMethod(comment = "If metrics are being kept, then note the cache miss.\r\nOtherwise, the operation is a NO-OP\r\n\r\n@return STRATEGY\nIf metrics are being kept, then note the cache miss.\nOtherwise, the operation is a NO-OP")
    public static final SubLObject cache_strategy_note_cache_miss_alt(SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            cache_metrics_note_miss(cache_strategy_get_metrics(strategy));
        }
        return strategy;
    }

    /**
     * If metrics are being kept, then note the cache miss.
     * Otherwise, the operation is a NO-OP
     *
     * @return STRATEGY
     */
    @LispMethod(comment = "If metrics are being kept, then note the cache miss.\r\nOtherwise, the operation is a NO-OP\r\n\r\n@return STRATEGY\nIf metrics are being kept, then note the cache miss.\nOtherwise, the operation is a NO-OP")
    public static SubLObject cache_strategy_note_cache_miss(final SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            cache_metrics_note_miss(cache_strategy_get_metrics(strategy));
        }
        return strategy;
    }

    /**
     * Determine whether the cache strategy will support the parameter PARAMETER
     *
     * @param PARAMETER
    keywordp
     * 		
     * @return BOOLEANP
     */
    @LispMethod(comment = "Determine whether the cache strategy will support the parameter PARAMETER\r\n\r\n@param PARAMETER\nkeywordp\r\n\t\t\r\n@return BOOLEANP")
    public static final SubLObject cache_strategy_supports_parameter_p_alt(SubLObject strategy, SubLObject parameter) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        SubLTrampolineFile.checkType(parameter, KEYWORDP);
        return cache_strategy_object_supports_parameter_p(strategy, parameter);
    }

    /**
     * Determine whether the cache strategy will support the parameter PARAMETER
     *
     * @param PARAMETER
    		keywordp
     * 		
     * @return BOOLEANP
     */
    @LispMethod(comment = "Determine whether the cache strategy will support the parameter PARAMETER\r\n\r\n@param PARAMETER\n\t\tkeywordp\r\n\t\t\r\n@return BOOLEANP")
    public static SubLObject cache_strategy_supports_parameter_p(final SubLObject strategy, final SubLObject parameter) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        assert NIL != keywordp(parameter) : "! keywordp(parameter) " + ("Types.keywordp(parameter) " + "CommonSymbols.NIL != Types.keywordp(parameter) ") + parameter;
        return cache_strategy_object_supports_parameter_p(strategy, parameter);
    }

    /**
     * Get the value of a tuning parameter from the strategy.
     *
     * @return OBJECT the value or default, if parameter is not set; :UNSUPPORTED
    if the value is not supported
     */
    @LispMethod(comment = "Get the value of a tuning parameter from the strategy.\r\n\r\n@return OBJECT the value or default, if parameter is not set; :UNSUPPORTED\r\nif the value is not supported")
    public static final SubLObject cache_strategy_get_parameter_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        SubLTrampolineFile.checkType(parameter, KEYWORDP);
        if (NIL != cache_strategy_supports_parameter_p(strategy, parameter)) {
            return cache_strategy_object_get_parameter(strategy, parameter, v_default);
        } else {
            return $UNSUPPORTED;
        }
    }

    /**
     * Get the value of a tuning parameter from the strategy.
     *
     * @return OBJECT the value or default, if parameter is not set; :UNSUPPORTED
    if the value is not supported
     */
    @LispMethod(comment = "Get the value of a tuning parameter from the strategy.\r\n\r\n@return OBJECT the value or default, if parameter is not set; :UNSUPPORTED\r\nif the value is not supported")
    public static SubLObject cache_strategy_get_parameter(final SubLObject strategy, final SubLObject parameter, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        assert NIL != keywordp(parameter) : "! keywordp(parameter) " + ("Types.keywordp(parameter) " + "CommonSymbols.NIL != Types.keywordp(parameter) ") + parameter;
        if (NIL != cache_strategy_supports_parameter_p(strategy, parameter)) {
            return cache_strategy_object_get_parameter(strategy, parameter, v_default);
        }
        return $UNSUPPORTED;
    }

    /**
     * Set the value of a tuning parameter for a cache strategy. If the parameter
     * is not supported, the operation is a no-op.
     *
     * @return OBJECT the previous value of the parameter, :UNSUPPORTED if the
    tuning parameter is not defined
     */
    @LispMethod(comment = "Set the value of a tuning parameter for a cache strategy. If the parameter\r\nis not supported, the operation is a no-op.\r\n\r\n@return OBJECT the previous value of the parameter, :UNSUPPORTED if the\r\ntuning parameter is not defined\nSet the value of a tuning parameter for a cache strategy. If the parameter\nis not supported, the operation is a no-op.")
    public static final SubLObject cache_strategy_set_parameter_alt(SubLObject strategy, SubLObject parameter, SubLObject value) {
        {
            SubLObject old_value = cache_strategy_get_parameter(strategy, parameter, UNPROVIDED);
            if (old_value != $UNSUPPORTED) {
                cache_strategy_object_set_parameter(strategy, parameter, value);
            }
            return old_value;
        }
    }

    /**
     * Set the value of a tuning parameter for a cache strategy. If the parameter
     * is not supported, the operation is a no-op.
     *
     * @return OBJECT the previous value of the parameter, :UNSUPPORTED if the
    tuning parameter is not defined
     */
    @LispMethod(comment = "Set the value of a tuning parameter for a cache strategy. If the parameter\r\nis not supported, the operation is a no-op.\r\n\r\n@return OBJECT the previous value of the parameter, :UNSUPPORTED if the\r\ntuning parameter is not defined\nSet the value of a tuning parameter for a cache strategy. If the parameter\nis not supported, the operation is a no-op.")
    public static SubLObject cache_strategy_set_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject value) {
        final SubLObject old_value = cache_strategy_get_parameter(strategy, parameter, UNPROVIDED);
        if (old_value != $UNSUPPORTED) {
            cache_strategy_object_set_parameter(strategy, parameter, value);
        }
        return old_value;
    }

    /**
     * Inform the cache strategy'tracking system that the object mentioned was
     * referenced. Objects that are not currently being tracked will be ignored.
     *
     * @return CACHE-STRATEGY-P
     */
    @LispMethod(comment = "Inform the cache strategy\'tracking system that the object mentioned was\r\nreferenced. Objects that are not currently being tracked will be ignored.\r\n\r\n@return CACHE-STRATEGY-P\nInform the cache strategy\'tracking system that the object mentioned was\nreferenced. Objects that are not currently being tracked will be ignored.")
    public static final SubLObject cache_strategy_note_reference_alt(SubLObject strategy, SubLObject v_object) {
        if (NIL != cache_strategy_trackedP(strategy, v_object)) {
            cache_strategy_object_note_reference(strategy, v_object);
        }
        return strategy;
    }

    /**
     * Inform the cache strategy'tracking system that the object mentioned was
     * referenced. Objects that are not currently being tracked will be ignored.
     *
     * @return CACHE-STRATEGY-P
     */
    @LispMethod(comment = "Inform the cache strategy\'tracking system that the object mentioned was\r\nreferenced. Objects that are not currently being tracked will be ignored.\r\n\r\n@return CACHE-STRATEGY-P\nInform the cache strategy\'tracking system that the object mentioned was\nreferenced. Objects that are not currently being tracked will be ignored.")
    public static SubLObject cache_strategy_note_reference(final SubLObject strategy, final SubLObject v_object) {
        if (NIL != cache_strategy_trackedP(strategy, v_object)) {
            cache_strategy_object_note_reference(strategy, v_object);
        }
        return strategy;
    }

    /**
     * Inform the cache strategy tracking system that a set of tracked objects
     * was referenced in the order given. This call is provided for hierarchical
     * caches such as tries, where the inferior nodes should expire before the
     * superior nodes. Objects that are not currently tracked will be ignored.
     * (The default implementation iterates over the objects and calls
     * cache-strategy-note-reference on each item.)
     *
     * @return CACHE-STRATEGY-P
     */
    @LispMethod(comment = "Inform the cache strategy tracking system that a set of tracked objects\r\nwas referenced in the order given. This call is provided for hierarchical\r\ncaches such as tries, where the inferior nodes should expire before the\r\nsuperior nodes. Objects that are not currently tracked will be ignored.\r\n(The default implementation iterates over the objects and calls\r\ncache-strategy-note-reference on each item.)\r\n\r\n@return CACHE-STRATEGY-P\nInform the cache strategy tracking system that a set of tracked objects\nwas referenced in the order given. This call is provided for hierarchical\ncaches such as tries, where the inferior nodes should expire before the\nsuperior nodes. Objects that are not currently tracked will be ignored.\n(The default implementation iterates over the objects and calls\ncache-strategy-note-reference on each item.)")
    public static final SubLObject cache_strategy_note_references_in_order_alt(SubLObject strategy, SubLObject objects) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        cache_strategy_object_note_references_in_order(strategy, objects);
        return strategy;
    }

    /**
     * Inform the cache strategy tracking system that a set of tracked objects
     * was referenced in the order given. This call is provided for hierarchical
     * caches such as tries, where the inferior nodes should expire before the
     * superior nodes. Objects that are not currently tracked will be ignored.
     * (The default implementation iterates over the objects and calls
     * cache-strategy-note-reference on each item.)
     *
     * @return CACHE-STRATEGY-P
     */
    @LispMethod(comment = "Inform the cache strategy tracking system that a set of tracked objects\r\nwas referenced in the order given. This call is provided for hierarchical\r\ncaches such as tries, where the inferior nodes should expire before the\r\nsuperior nodes. Objects that are not currently tracked will be ignored.\r\n(The default implementation iterates over the objects and calls\r\ncache-strategy-note-reference on each item.)\r\n\r\n@return CACHE-STRATEGY-P\nInform the cache strategy tracking system that a set of tracked objects\nwas referenced in the order given. This call is provided for hierarchical\ncaches such as tries, where the inferior nodes should expire before the\nsuperior nodes. Objects that are not currently tracked will be ignored.\n(The default implementation iterates over the objects and calls\ncache-strategy-note-reference on each item.)")
    public static SubLObject cache_strategy_note_references_in_order(final SubLObject strategy, final SubLObject objects) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        cache_strategy_object_note_references_in_order(strategy, objects);
        return strategy;
    }

    /**
     *
     *
     * @return CACHE-METRICS-P or NIL if no metrics are being gathered
     */
    @LispMethod(comment = "@return CACHE-METRICS-P or NIL if no metrics are being gathered")
    public static final SubLObject cache_strategy_get_metrics_alt(SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            return cache_strategy_object_get_metrics(strategy);
        }
        return NIL;
    }

    /**
     *
     *
     * @return CACHE-METRICS-P or NIL if no metrics are being gathered
     */
    @LispMethod(comment = "@return CACHE-METRICS-P or NIL if no metrics are being gathered")
    public static SubLObject cache_strategy_get_metrics(final SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            return cache_strategy_object_get_metrics(strategy);
        }
        return NIL;
    }

    /**
     * Resets the cache metrics of the strategy, if such are being gathered.
     *
     * @return BOOLEANP returns T if metrics are being gathered, NIL if not
     */
    @LispMethod(comment = "Resets the cache metrics of the strategy, if such are being gathered.\r\n\r\n@return BOOLEANP returns T if metrics are being gathered, NIL if not")
    public static final SubLObject cache_strategy_reset_metrics_alt(SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            cache_strategy_object_reset_metrics(strategy);
            return T;
        }
        return NIL;
    }

    /**
     * Resets the cache metrics of the strategy, if such are being gathered.
     *
     * @return BOOLEANP returns T if metrics are being gathered, NIL if not
     */
    @LispMethod(comment = "Resets the cache metrics of the strategy, if such are being gathered.\r\n\r\n@return BOOLEANP returns T if metrics are being gathered, NIL if not")
    public static SubLObject cache_strategy_reset_metrics(final SubLObject strategy) {
        if (NIL != cache_strategy_keeps_metrics_p(strategy)) {
            cache_strategy_object_reset_metrics(strategy);
            return T;
        }
        return NIL;
    }

    /**
     * Allocate a metrics object and then begin using it to gather metrics.
     *
     * @return BOOLEANP
     */
    @LispMethod(comment = "Allocate a metrics object and then begin using it to gather metrics.\r\n\r\n@return BOOLEANP")
    public static final SubLObject cache_strategy_gather_metrics_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        {
            SubLObject metrics = new_cache_metrics();
            return cache_strategy_object_gather_metrics(strategy, metrics);
        }
    }

    /**
     * Allocate a metrics object and then begin using it to gather metrics.
     *
     * @return BOOLEANP
     */
    @LispMethod(comment = "Allocate a metrics object and then begin using it to gather metrics.\r\n\r\n@return BOOLEANP")
    public static SubLObject cache_strategy_gather_metrics(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        final SubLObject metrics = new_cache_metrics();
        return cache_strategy_object_gather_metrics(strategy, metrics);
    }

    /**
     * Stop gathering metrics and return the current metrics object, if such one
     * exists; NIL otherwise
     *
     * @return CACHE-METRICS-P
     */
    @LispMethod(comment = "Stop gathering metrics and return the current metrics object, if such one\r\nexists; NIL otherwise\r\n\r\n@return CACHE-METRICS-P\nStop gathering metrics and return the current metrics object, if such one\nexists; NIL otherwise")
    public static final SubLObject cache_strategy_dont_gather_metrics_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        return cache_strategy_object_dont_gather_metrics(strategy);
    }

    /**
     * Stop gathering metrics and return the current metrics object, if such one
     * exists; NIL otherwise
     *
     * @return CACHE-METRICS-P
     */
    @LispMethod(comment = "Stop gathering metrics and return the current metrics object, if such one\r\nexists; NIL otherwise\r\n\r\n@return CACHE-METRICS-P\nStop gathering metrics and return the current metrics object, if such one\nexists; NIL otherwise")
    public static SubLObject cache_strategy_dont_gather_metrics(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        return cache_strategy_object_dont_gather_metrics(strategy);
    }

    /**
     * Determine if the cache strategy is currently gathering metrics or not.
     *
     * @return BOOLEANP
     */
    @LispMethod(comment = "Determine if the cache strategy is currently gathering metrics or not.\r\n\r\n@return BOOLEANP")
    public static final SubLObject cache_strategy_keeps_metrics_p_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        return cache_strategy_object_keeps_metrics_p(strategy);
    }

    /**
     * Determine if the cache strategy is currently gathering metrics or not.
     *
     * @return BOOLEANP
     */
    @LispMethod(comment = "Determine if the cache strategy is currently gathering metrics or not.\r\n\r\n@return BOOLEANP")
    public static SubLObject cache_strategy_keeps_metrics_p(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        return cache_strategy_object_keeps_metrics_p(strategy);
    }

    /**
     * Provide an iterator to the content that is currently being tracked by the cache
     * strategy. The iterator has to be implemented such that it is possible to
     * call UNTRACK on the iterator for the current object only without making the
     * iterator invalid.
     *
     * @return ITERATOR-P
     */
    @LispMethod(comment = "Provide an iterator to the content that is currently being tracked by the cache\r\nstrategy. The iterator has to be implemented such that it is possible to\r\ncall UNTRACK on the iterator for the current object only without making the\r\niterator invalid.\r\n\r\n@return ITERATOR-P\nProvide an iterator to the content that is currently being tracked by the cache\nstrategy. The iterator has to be implemented such that it is possible to\ncall UNTRACK on the iterator for the current object only without making the\niterator invalid.")
    public static final SubLObject new_cache_strategy_tracked_content_iterator_alt(SubLObject strategy) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        return new_cache_strategy_object_tracked_content_iterator(strategy);
    }

    /**
     * Provide an iterator to the content that is currently being tracked by the cache
     * strategy. The iterator has to be implemented such that it is possible to
     * call UNTRACK on the iterator for the current object only without making the
     * iterator invalid.
     *
     * @return ITERATOR-P
     */
    @LispMethod(comment = "Provide an iterator to the content that is currently being tracked by the cache\r\nstrategy. The iterator has to be implemented such that it is possible to\r\ncall UNTRACK on the iterator for the current object only without making the\r\niterator invalid.\r\n\r\n@return ITERATOR-P\nProvide an iterator to the content that is currently being tracked by the cache\nstrategy. The iterator has to be implemented such that it is possible to\ncall UNTRACK on the iterator for the current object only without making the\niterator invalid.")
    public static SubLObject new_cache_strategy_tracked_content_iterator(final SubLObject strategy) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        return new_cache_strategy_object_tracked_content_iterator(strategy);
    }

    /**
     * Map over the tracked content of the cache strategy, invoking functor
     * on every item. Notice that the implementation of MAP has to be such
     * that it is possible to call UNTRACK on each item without the mapping
     * failing.
     * The default implementation uses DO-ITERATOR over the
     * result of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR.
     *
     * @return CACHE-STRATEGY-P
     */
    @LispMethod(comment = "Map over the tracked content of the cache strategy, invoking functor\r\non every item. Notice that the implementation of MAP has to be such\r\nthat it is possible to call UNTRACK on each item without the mapping\r\nfailing.\r\nThe default implementation uses DO-ITERATOR over the\r\nresult of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR.\r\n\r\n@return CACHE-STRATEGY-P\nMap over the tracked content of the cache strategy, invoking functor\non every item. Notice that the implementation of MAP has to be such\nthat it is possible to call UNTRACK on each item without the mapping\nfailing.\nThe default implementation uses DO-ITERATOR over the\nresult of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR.")
    public static final SubLObject map_cache_strategy_tracked_content_alt(SubLObject strategy, SubLObject functor) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        SubLTrampolineFile.checkType(functor, FUNCTION_SPEC_P);
        map_cache_strategy_object_tracked_content(strategy, functor);
        return strategy;
    }

    /**
     * Map over the tracked content of the cache strategy, invoking functor
     * on every item. Notice that the implementation of MAP has to be such
     * that it is possible to call UNTRACK on each item without the mapping
     * failing.
     * The default implementation uses DO-ITERATOR over the
     * result of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR.
     *
     * @return CACHE-STRATEGY-P
     */
    @LispMethod(comment = "Map over the tracked content of the cache strategy, invoking functor\r\non every item. Notice that the implementation of MAP has to be such\r\nthat it is possible to call UNTRACK on each item without the mapping\r\nfailing.\r\nThe default implementation uses DO-ITERATOR over the\r\nresult of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR.\r\n\r\n@return CACHE-STRATEGY-P\nMap over the tracked content of the cache strategy, invoking functor\non every item. Notice that the implementation of MAP has to be such\nthat it is possible to call UNTRACK on each item without the mapping\nfailing.\nThe default implementation uses DO-ITERATOR over the\nresult of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR.")
    public static SubLObject map_cache_strategy_tracked_content(final SubLObject strategy, final SubLObject functor) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        assert NIL != function_spec_p(functor) : "! function_spec_p(functor) " + ("Types.function_spec_p(functor) " + "CommonSymbols.NIL != Types.function_spec_p(functor) ") + functor;
        map_cache_strategy_object_tracked_content(strategy, functor);
        return strategy;
    }

    /**
     * Untrack all of the items currently in the cache, passing each one of
     * them to the provided functor AFTER their untracking.
     * The default implementation uses DO-ITERATOR over the
     * result of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR,
     * does an UNTRACK and then invokes the functor.
     *
     * @return CACHE-STRATEGY-P
     */
    @LispMethod(comment = "Untrack all of the items currently in the cache, passing each one of\r\nthem to the provided functor AFTER their untracking.\r\nThe default implementation uses DO-ITERATOR over the\r\nresult of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR,\r\ndoes an UNTRACK and then invokes the functor.\r\n\r\n@return CACHE-STRATEGY-P\nUntrack all of the items currently in the cache, passing each one of\nthem to the provided functor AFTER their untracking.\nThe default implementation uses DO-ITERATOR over the\nresult of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR,\ndoes an UNTRACK and then invokes the functor.")
    public static final SubLObject cache_strategy_untrack_all_alt(SubLObject strategy, SubLObject functor) {
        SubLTrampolineFile.checkType(strategy, CACHE_STRATEGY_P);
        SubLTrampolineFile.checkType(functor, FUNCTION_SPEC_P);
        cache_strategy_object_untrack_all(strategy, functor);
        return strategy;
    }

    /**
     * Untrack all of the items currently in the cache, passing each one of
     * them to the provided functor AFTER their untracking.
     * The default implementation uses DO-ITERATOR over the
     * result of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR,
     * does an UNTRACK and then invokes the functor.
     *
     * @return CACHE-STRATEGY-P
     */
    @LispMethod(comment = "Untrack all of the items currently in the cache, passing each one of\r\nthem to the provided functor AFTER their untracking.\r\nThe default implementation uses DO-ITERATOR over the\r\nresult of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR,\r\ndoes an UNTRACK and then invokes the functor.\r\n\r\n@return CACHE-STRATEGY-P\nUntrack all of the items currently in the cache, passing each one of\nthem to the provided functor AFTER their untracking.\nThe default implementation uses DO-ITERATOR over the\nresult of the NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR,\ndoes an UNTRACK and then invokes the functor.")
    public static SubLObject cache_strategy_untrack_all(final SubLObject strategy, final SubLObject functor) {
        assert NIL != cache_strategy_p(strategy) : "! cache_utilities.cache_strategy_p(strategy) " + ("cache_utilities.cache_strategy_p(strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(strategy) ") + strategy;
        assert NIL != function_spec_p(functor) : "! function_spec_p(functor) " + ("Types.function_spec_p(functor) " + "CommonSymbols.NIL != Types.function_spec_p(functor) ") + functor;
        cache_strategy_object_untrack_all(strategy, functor);
        return strategy;
    }

    public static final SubLObject cache_strategy_method_not_implemented_for_alt(SubLObject v_object) {
        return Errors.error($str_alt4$Not_implemented_for__A_, v_object);
    }

    public static SubLObject cache_strategy_method_not_implemented_for(final SubLObject v_object) {
        return Errors.error($str4$Not_implemented_for__A_, v_object);
    }

    /**
     * By default, nothing is a cache strategy object.
     */
    @LispMethod(comment = "By default, nothing is a cache strategy object.")
    public static final SubLObject cache_strategy_object_p_alt(SubLObject v_object) {
        {
            SubLObject method_function = method_func(v_object, $cache_strategy_object_p_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, v_object);
            }
            return NIL;
        }
    }

    /**
     * By default, nothing is a cache strategy object.
     */
    @LispMethod(comment = "By default, nothing is a cache strategy object.")
    public static SubLObject cache_strategy_object_p(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $cache_strategy_object_p_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        return NIL;
    }

    /**
     * By default, we do not know how to do a reset.
     */
    @LispMethod(comment = "By default, we do not know how to do a reset.")
    public static final SubLObject cache_strategy_object_reset_alt(SubLObject strategy) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_reset_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know how to do a reset.
     */
    @LispMethod(comment = "By default, we do not know how to do a reset.")
    public static SubLObject cache_strategy_object_reset(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_reset_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, we do not know what the cache capacity is.
     */
    @LispMethod(comment = "By default, we do not know what the cache capacity is.")
    public static final SubLObject cache_strategy_object_cache_capacity_alt(SubLObject strategy) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_cache_capacity_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know what the cache capacity is.
     */
    @LispMethod(comment = "By default, we do not know what the cache capacity is.")
    public static SubLObject cache_strategy_object_cache_capacity(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_cache_capacity_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, we do not know what the cache size is.
     */
    @LispMethod(comment = "By default, we do not know what the cache size is.")
    public static final SubLObject cache_strategy_object_cache_size_alt(SubLObject strategy) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_cache_size_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know what the cache size is.
     */
    @LispMethod(comment = "By default, we do not know what the cache size is.")
    public static SubLObject cache_strategy_object_cache_size(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_cache_size_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, we do not know how to track an object
     */
    @LispMethod(comment = "By default, we do not know how to track an object")
    public static final SubLObject cache_strategy_object_track_alt(SubLObject strategy, SubLObject v_object) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_track_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy, v_object);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know how to track an object
     */
    @LispMethod(comment = "By default, we do not know how to track an object")
    public static SubLObject cache_strategy_object_track(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_track_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, v_object);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, we do not know whether the object is tracked.
     */
    @LispMethod(comment = "By default, we do not know whether the object is tracked.")
    public static final SubLObject cache_strategy_object_trackedP_alt(SubLObject strategy, SubLObject v_object) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_trackedP_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy, v_object);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know whether the object is tracked.
     */
    @LispMethod(comment = "By default, we do not know whether the object is tracked.")
    public static SubLObject cache_strategy_object_trackedP(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_trackedP_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, v_object);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, we do not know how to untrack an object.
     */
    @LispMethod(comment = "By default, we do not know how to untrack an object.")
    public static final SubLObject cache_strategy_object_untrack_alt(SubLObject strategy, SubLObject v_object) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_untrack_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy, v_object);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know how to untrack an object.
     */
    @LispMethod(comment = "By default, we do not know how to untrack an object.")
    public static SubLObject cache_strategy_object_untrack(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_untrack_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, v_object);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, a strategy supports no paraameter.
     */
    @LispMethod(comment = "By default, a strategy supports no paraameter.")
    public static final SubLObject cache_strategy_object_supports_parameter_p_alt(SubLObject strategy, SubLObject parameter) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy, parameter);
            }
            return NIL;
        }
    }

    /**
     * By default, a strategy supports no paraameter.
     */
    @LispMethod(comment = "By default, a strategy supports no paraameter.")
    public static SubLObject cache_strategy_object_supports_parameter_p(final SubLObject strategy, final SubLObject parameter) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, parameter);
        }
        return NIL;
    }

    /**
     * By default, we do not know how to get a parameter.
     */
    @LispMethod(comment = "By default, we do not know how to get a parameter.")
    public static final SubLObject cache_strategy_object_get_parameter_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_get_parameter_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy, parameter, v_default);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know how to get a parameter.
     */
    @LispMethod(comment = "By default, we do not know how to get a parameter.")
    public static SubLObject cache_strategy_object_get_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_get_parameter_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, parameter, v_default);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, we do not know how to set a parameter.
     */
    @LispMethod(comment = "By default, we do not know how to set a parameter.")
    public static final SubLObject cache_strategy_object_set_parameter_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_set_parameter_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy, parameter, v_default);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know how to set a parameter.
     */
    @LispMethod(comment = "By default, we do not know how to set a parameter.")
    public static SubLObject cache_strategy_object_set_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_set_parameter_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, parameter, v_default);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, we do not know how to note a reference.
     */
    @LispMethod(comment = "By default, we do not know how to note a reference.")
    public static final SubLObject cache_strategy_object_note_reference_alt(SubLObject strategy, SubLObject v_object) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_note_reference_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy, v_object);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know how to note a reference.
     */
    @LispMethod(comment = "By default, we do not know how to note a reference.")
    public static SubLObject cache_strategy_object_note_reference(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_note_reference_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, v_object);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * Invoke the default implementation.
     */
    @LispMethod(comment = "Invoke the default implementation.")
    public static final SubLObject cache_strategy_object_note_references_in_order_alt(SubLObject strategy, SubLObject objects) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_note_references_in_order_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy, objects);
            }
            return default_cache_strategy_object_note_references_in_order(strategy, objects);
        }
    }

    /**
     * Invoke the default implementation.
     */
    @LispMethod(comment = "Invoke the default implementation.")
    public static SubLObject cache_strategy_object_note_references_in_order(final SubLObject strategy, final SubLObject objects) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_note_references_in_order_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, objects);
        }
        return default_cache_strategy_object_note_references_in_order(strategy, objects);
    }

    /**
     * The default implementation iterates over the objects, skipping non-tracked
     * cases, and invokes the standard NOTE-REFERENCE method on them.
     *
     * @return STRATEGY
     */
    @LispMethod(comment = "The default implementation iterates over the objects, skipping non-tracked\r\ncases, and invokes the standard NOTE-REFERENCE method on them.\r\n\r\n@return STRATEGY\nThe default implementation iterates over the objects, skipping non-tracked\ncases, and invokes the standard NOTE-REFERENCE method on them.")
    public static final SubLObject default_cache_strategy_object_note_references_in_order_alt(SubLObject strategy, SubLObject objects) {
        {
            SubLObject cdolist_list_var = objects;
            SubLObject v_object = NIL;
            for (v_object = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_object = cdolist_list_var.first()) {
                if (NIL != cache_strategy_trackedP(strategy, v_object)) {
                    cache_strategy_note_reference(strategy, v_object);
                }
            }
        }
        return strategy;
    }

    /**
     * The default implementation iterates over the objects, skipping non-tracked
     * cases, and invokes the standard NOTE-REFERENCE method on them.
     *
     * @return STRATEGY
     */
    @LispMethod(comment = "The default implementation iterates over the objects, skipping non-tracked\r\ncases, and invokes the standard NOTE-REFERENCE method on them.\r\n\r\n@return STRATEGY\nThe default implementation iterates over the objects, skipping non-tracked\ncases, and invokes the standard NOTE-REFERENCE method on them.")
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

    /**
     * By default we do not know how to get the metrics.
     */
    @LispMethod(comment = "By default we do not know how to get the metrics.")
    public static final SubLObject cache_strategy_object_get_metrics_alt(SubLObject strategy) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_get_metrics_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default we do not know how to get the metrics.
     */
    @LispMethod(comment = "By default we do not know how to get the metrics.")
    public static SubLObject cache_strategy_object_get_metrics(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_get_metrics_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default we do not know how to reset the metrics.
     */
    @LispMethod(comment = "By default we do not know how to reset the metrics.")
    public static final SubLObject cache_strategy_object_reset_metrics_alt(SubLObject strategy) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_reset_metrics_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default we do not know how to reset the metrics.
     */
    @LispMethod(comment = "By default we do not know how to reset the metrics.")
    public static SubLObject cache_strategy_object_reset_metrics(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_reset_metrics_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, we do not know how to gather metrics.
     */
    @LispMethod(comment = "By default, we do not know how to gather metrics.")
    public static final SubLObject cache_strategy_object_gather_metrics_alt(SubLObject strategy, SubLObject metrics) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_gather_metrics_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy, metrics);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know how to gather metrics.
     */
    @LispMethod(comment = "By default, we do not know how to gather metrics.")
    public static SubLObject cache_strategy_object_gather_metrics(final SubLObject strategy, final SubLObject metrics) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_gather_metrics_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, metrics);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, we do not know how to stop gathering metrics.
     */
    @LispMethod(comment = "By default, we do not know how to stop gathering metrics.")
    public static final SubLObject cache_strategy_object_dont_gather_metrics_alt(SubLObject strategy) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know how to stop gathering metrics.
     */
    @LispMethod(comment = "By default, we do not know how to stop gathering metrics.")
    public static SubLObject cache_strategy_object_dont_gather_metrics(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, we do not know whether the strategy is keeping metrics or not.
     */
    @LispMethod(comment = "By default, we do not know whether the strategy is keeping metrics or not.")
    public static final SubLObject cache_strategy_object_keeps_metrics_p_alt(SubLObject strategy) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know whether the strategy is keeping metrics or not.
     */
    @LispMethod(comment = "By default, we do not know whether the strategy is keeping metrics or not.")
    public static SubLObject cache_strategy_object_keeps_metrics_p(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * By default, we do not know how to construct an iterator.
     */
    @LispMethod(comment = "By default, we do not know how to construct an iterator.")
    public static final SubLObject new_cache_strategy_object_tracked_content_iterator_alt(SubLObject strategy) {
        {
            SubLObject method_function = method_func(strategy, $new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy);
            }
            return cache_strategy_method_not_implemented_for(strategy);
        }
    }

    /**
     * By default, we do not know how to construct an iterator.
     */
    @LispMethod(comment = "By default, we do not know how to construct an iterator.")
    public static SubLObject new_cache_strategy_object_tracked_content_iterator(final SubLObject strategy) {
        final SubLObject method_function = method_func(strategy, $new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy);
        }
        return cache_strategy_method_not_implemented_for(strategy);
    }

    /**
     * Invoke the default method
     */
    @LispMethod(comment = "Invoke the default method")
    public static final SubLObject map_cache_strategy_object_tracked_content_alt(SubLObject strategy, SubLObject functor) {
        {
            SubLObject method_function = method_func(strategy, $map_cache_strategy_object_tracked_content_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy, functor);
            }
            default_map_cache_strategy_object_tracked_content(strategy, functor);
            return strategy;
        }
    }

    /**
     * Invoke the default method
     */
    @LispMethod(comment = "Invoke the default method")
    public static SubLObject map_cache_strategy_object_tracked_content(final SubLObject strategy, final SubLObject functor) {
        final SubLObject method_function = method_func(strategy, $map_cache_strategy_object_tracked_content_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, functor);
        }
        default_map_cache_strategy_object_tracked_content(strategy, functor);
        return strategy;
    }

    /**
     * The default implementation simply calls the functor on each value returned
     * by the iterator for the strategy.
     */
    @LispMethod(comment = "The default implementation simply calls the functor on each value returned\r\nby the iterator for the strategy.\nThe default implementation simply calls the functor on each value returned\nby the iterator for the strategy.")
    public static final SubLObject default_map_cache_strategy_object_tracked_content_alt(SubLObject strategy, SubLObject functor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iterator = new_cache_strategy_tracked_content_iterator(strategy);
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_object = iteration.iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            funcall(functor, v_object);
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
            }
            return strategy;
        }
    }

    @LispMethod(comment = "The default implementation simply calls the functor on each value returned\r\nby the iterator for the strategy.\nThe default implementation simply calls the functor on each value returned\nby the iterator for the strategy.")
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

    /**
     * Invoke the default method
     */
    @LispMethod(comment = "Invoke the default method")
    public static final SubLObject cache_strategy_object_untrack_all_alt(SubLObject strategy, SubLObject functor) {
        {
            SubLObject method_function = method_func(strategy, $cache_strategy_object_untrack_all_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, strategy, functor);
            }
            default_cache_strategy_object_untrack_all(strategy, functor);
            return strategy;
        }
    }

    @LispMethod(comment = "Invoke the default method")
    public static SubLObject cache_strategy_object_untrack_all(final SubLObject strategy, final SubLObject functor) {
        final SubLObject method_function = method_func(strategy, $cache_strategy_object_untrack_all_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, strategy, functor);
        }
        default_cache_strategy_object_untrack_all(strategy, functor);
        return strategy;
    }

    /**
     * The default implementation simply iterates over the results of the
     * iterator of the strategy, first untracking the object and then invoking
     * the functor on it.
     */
    @LispMethod(comment = "The default implementation simply iterates over the results of the\r\niterator of the strategy, first untracking the object and then invoking\r\nthe functor on it.\nThe default implementation simply iterates over the results of the\niterator of the strategy, first untracking the object and then invoking\nthe functor on it.")
    public static final SubLObject default_cache_strategy_object_untrack_all_alt(SubLObject strategy, SubLObject functor) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iterator = new_cache_strategy_tracked_content_iterator(strategy);
                SubLObject done_var = NIL;
                while (NIL == done_var) {
                    thread.resetMultipleValues();
                    {
                        SubLObject v_object = iteration.iteration_next(iterator);
                        SubLObject valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            cache_strategy_untrack(strategy, v_object);
                            funcall(functor, v_object);
                        }
                        done_var = makeBoolean(NIL == valid);
                    }
                } 
            }
            return strategy;
        }
    }

    @LispMethod(comment = "The default implementation simply iterates over the results of the\r\niterator of the strategy, first untracking the object and then invoking\r\nthe functor on it.\nThe default implementation simply iterates over the results of the\niterator of the strategy, first untracking the object and then invoking\nthe functor on it.")
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

    public static final SubLObject cache_metrics_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_cache_metrics(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject cache_metrics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_cache_metrics(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cache_metrics_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cache_utilities.$cache_metrics_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject cache_metrics_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cache_utilities.$cache_metrics_native.class ? T : NIL;
    }

    public static final SubLObject cachemtr_hit_count_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHE_METRICS_P);
        return v_object.getField2();
    }

    public static SubLObject cachemtr_hit_count(final SubLObject v_object) {
        assert NIL != cache_metrics_p(v_object) : "! cache_utilities.cache_metrics_p(v_object) " + "cache_utilities.cache_metrics_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject cachemtr_miss_count_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CACHE_METRICS_P);
        return v_object.getField3();
    }

    public static SubLObject cachemtr_miss_count(final SubLObject v_object) {
        assert NIL != cache_metrics_p(v_object) : "! cache_utilities.cache_metrics_p(v_object) " + "cache_utilities.cache_metrics_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_cachemtr_hit_count_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHE_METRICS_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_cachemtr_hit_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_metrics_p(v_object) : "! cache_utilities.cache_metrics_p(v_object) " + "cache_utilities.cache_metrics_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_cachemtr_miss_count_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CACHE_METRICS_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_cachemtr_miss_count(final SubLObject v_object, final SubLObject value) {
        assert NIL != cache_metrics_p(v_object) : "! cache_utilities.cache_metrics_p(v_object) " + "cache_utilities.cache_metrics_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_cache_metrics_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cache_utilities.$cache_metrics_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($HIT_COUNT)) {
                        _csetf_cachemtr_hit_count(v_new, current_value);
                    } else {
                        if (pcase_var.eql($MISS_COUNT)) {
                            _csetf_cachemtr_miss_count(v_new, current_value);
                        } else {
                            Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_cache_metrics(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cache_utilities.$cache_metrics_native();
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

    public static final SubLObject print_cache_metrics_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_1 = v_object;
                    SubLObject stream_2 = stream;
                    write_string($str_alt21$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_1), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    write_string($str_alt23$Hits__, stream, UNPROVIDED, UNPROVIDED);
                    princ(cachemtr_hit_count(v_object), stream);
                    write_string($str_alt24$_Misses__, stream, UNPROVIDED, UNPROVIDED);
                    princ(cachemtr_miss_count(v_object), stream);
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object_1), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_object;
        }
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

    /**
     * Create a new empty cache metrics infrastructure.
     */
    @LispMethod(comment = "Create a new empty cache metrics infrastructure.")
    public static final SubLObject new_cache_metrics_alt() {
        {
            SubLObject metrics = make_cache_metrics(UNPROVIDED);
            reset_cache_metrics_counts(metrics, UNPROVIDED, UNPROVIDED);
            return metrics;
        }
    }

    @LispMethod(comment = "Create a new empty cache metrics infrastructure.")
    public static SubLObject new_cache_metrics() {
        final SubLObject metrics = make_cache_metrics(UNPROVIDED);
        reset_cache_metrics_counts(metrics, UNPROVIDED, UNPROVIDED);
        return metrics;
    }

    /**
     * Reset the counts in the cache metrics.
     */
    @LispMethod(comment = "Reset the counts in the cache metrics.")
    public static final SubLObject reset_cache_metrics_counts_alt(SubLObject metrics, SubLObject hits, SubLObject misses) {
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

    @LispMethod(comment = "Reset the counts in the cache metrics.")
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

    /**
     * Utility method for recreating a cache.
     *
     * @return CACHE-METRICS-P
     */
    @LispMethod(comment = "Utility method for recreating a cache.\r\n\r\n@return CACHE-METRICS-P")
    public static final SubLObject new_cache_metrics_with_counts_alt(SubLObject hits, SubLObject misses) {
        SubLTrampolineFile.enforceType(hits, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.enforceType(misses, NON_NEGATIVE_INTEGER_P);
        return reset_cache_metrics_counts(new_cache_metrics(), hits, misses);
    }

    @LispMethod(comment = "Utility method for recreating a cache.\r\n\r\n@return CACHE-METRICS-P")
    public static SubLObject new_cache_metrics_with_counts(final SubLObject hits, final SubLObject misses) {
        SubLTrampolineFile.enforceType(hits, NON_NEGATIVE_INTEGER_P);
        SubLTrampolineFile.enforceType(misses, NON_NEGATIVE_INTEGER_P);
        return reset_cache_metrics_counts(new_cache_metrics(), hits, misses);
    }

    /**
     * Reset the cache metrics that have been kept.
     */
    @LispMethod(comment = "Reset the cache metrics that have been kept.")
    public static final SubLObject cache_metrics_reset_alt(SubLObject metrics) {
        reset_cache_metrics_counts(metrics, UNPROVIDED, UNPROVIDED);
        return metrics;
    }

    @LispMethod(comment = "Reset the cache metrics that have been kept.")
    public static SubLObject cache_metrics_reset(final SubLObject metrics) {
        reset_cache_metrics_counts(metrics, UNPROVIDED, UNPROVIDED);
        return metrics;
    }

    /**
     * Update the metrics to reflect that the cache lookup resulted in a hit.
     *
     * @return CACHE-METRICS-P
     */
    @LispMethod(comment = "Update the metrics to reflect that the cache lookup resulted in a hit.\r\n\r\n@return CACHE-METRICS-P")
    public static final SubLObject cache_metrics_note_hit_alt(SubLObject metrics) {
        SubLTrampolineFile.checkType(metrics, CACHE_METRICS_P);
        _csetf_cachemtr_hit_count(metrics, add(cachemtr_hit_count(metrics), ONE_INTEGER));
        return metrics;
    }

    @LispMethod(comment = "Update the metrics to reflect that the cache lookup resulted in a hit.\r\n\r\n@return CACHE-METRICS-P")
    public static SubLObject cache_metrics_note_hit(final SubLObject metrics) {
        assert NIL != cache_metrics_p(metrics) : "! cache_utilities.cache_metrics_p(metrics) " + ("cache_utilities.cache_metrics_p(metrics) " + "CommonSymbols.NIL != cache_utilities.cache_metrics_p(metrics) ") + metrics;
        _csetf_cachemtr_hit_count(metrics, add(cachemtr_hit_count(metrics), ONE_INTEGER));
        return metrics;
    }

    /**
     * Update the metrics to reflect that the cache lookup resulted in a miss.
     *
     * @return CACHE-METRICS-P
     */
    @LispMethod(comment = "Update the metrics to reflect that the cache lookup resulted in a miss.\r\n\r\n@return CACHE-METRICS-P")
    public static final SubLObject cache_metrics_note_miss_alt(SubLObject metrics) {
        SubLTrampolineFile.checkType(metrics, CACHE_METRICS_P);
        _csetf_cachemtr_miss_count(metrics, add(cachemtr_miss_count(metrics), ONE_INTEGER));
        return metrics;
    }

    @LispMethod(comment = "Update the metrics to reflect that the cache lookup resulted in a miss.\r\n\r\n@return CACHE-METRICS-P")
    public static SubLObject cache_metrics_note_miss(final SubLObject metrics) {
        assert NIL != cache_metrics_p(metrics) : "! cache_utilities.cache_metrics_p(metrics) " + ("cache_utilities.cache_metrics_p(metrics) " + "CommonSymbols.NIL != cache_utilities.cache_metrics_p(metrics) ") + metrics;
        _csetf_cachemtr_miss_count(metrics, add(cachemtr_miss_count(metrics), ONE_INTEGER));
        return metrics;
    }

    /**
     * Return the number of hits that this cache has had.
     *
     * @return NON-NEGATIVE-INTEGER-P
     */
    @LispMethod(comment = "Return the number of hits that this cache has had.\r\n\r\n@return NON-NEGATIVE-INTEGER-P")
    public static final SubLObject cache_metrics_hit_count_alt(SubLObject metrics) {
        return cachemtr_hit_count(metrics);
    }

    @LispMethod(comment = "Return the number of hits that this cache has had.\r\n\r\n@return NON-NEGATIVE-INTEGER-P")
    public static SubLObject cache_metrics_hit_count(final SubLObject metrics) {
        return cachemtr_hit_count(metrics);
    }

    /**
     * Return the number of misses that this cache has had.
     *
     * @return NON-NEGATIVE-INTEGER-P
     */
    @LispMethod(comment = "Return the number of misses that this cache has had.\r\n\r\n@return NON-NEGATIVE-INTEGER-P")
    public static final SubLObject cache_metrics_miss_count_alt(SubLObject metrics) {
        return cachemtr_miss_count(metrics);
    }

    @LispMethod(comment = "Return the number of misses that this cache has had.\r\n\r\n@return NON-NEGATIVE-INTEGER-P")
    public static SubLObject cache_metrics_miss_count(final SubLObject metrics) {
        return cachemtr_miss_count(metrics);
    }

    /**
     * Compute the ratio of hits to hits and misses and return
     * the result as a FLOATP in the range [0,1]
     */
    @LispMethod(comment = "Compute the ratio of hits to hits and misses and return\r\nthe result as a FLOATP in the range [0,1]\nCompute the ratio of hits to hits and misses and return\nthe result as a FLOATP in the range [0,1]")
    public static final SubLObject cache_metrics_hit_rate_alt(SubLObject metrics) {
        {
            SubLObject hits = cache_metrics_hit_count(metrics);
            SubLObject total = cache_metrics_cache_uses(metrics);
            return divide(hits, total);
        }
    }

    @LispMethod(comment = "Compute the ratio of hits to hits and misses and return\r\nthe result as a FLOATP in the range [0,1]\nCompute the ratio of hits to hits and misses and return\nthe result as a FLOATP in the range [0,1]")
    public static SubLObject cache_metrics_hit_rate(final SubLObject metrics) {
        final SubLObject hits = cache_metrics_hit_count(metrics);
        final SubLObject total = cache_metrics_cache_uses(metrics);
        return divide(hits, total);
    }

    /**
     * Compute the ratio of misses to hits and misses and return
     * the result as a FLOATP in the range [0,1]
     */
    @LispMethod(comment = "Compute the ratio of misses to hits and misses and return\r\nthe result as a FLOATP in the range [0,1]\nCompute the ratio of misses to hits and misses and return\nthe result as a FLOATP in the range [0,1]")
    public static final SubLObject cache_metrics_miss_rate_alt(SubLObject metrics) {
        {
            SubLObject misses = cache_metrics_miss_count(metrics);
            SubLObject total = cache_metrics_cache_uses(metrics);
            return divide(misses, total);
        }
    }

    @LispMethod(comment = "Compute the ratio of misses to hits and misses and return\r\nthe result as a FLOATP in the range [0,1]\nCompute the ratio of misses to hits and misses and return\nthe result as a FLOATP in the range [0,1]")
    public static SubLObject cache_metrics_miss_rate(final SubLObject metrics) {
        final SubLObject misses = cache_metrics_miss_count(metrics);
        final SubLObject total = cache_metrics_cache_uses(metrics);
        return divide(misses, total);
    }

    /**
     * Compute the number of times the cache has been consulted.
     */
    @LispMethod(comment = "Compute the number of times the cache has been consulted.")
    public static final SubLObject cache_metrics_cache_uses_alt(SubLObject metrics) {
        return add(cachemtr_hit_count(metrics), cachemtr_miss_count(metrics));
    }

    @LispMethod(comment = "Compute the number of times the cache has been consulted.")
    public static SubLObject cache_metrics_cache_uses(final SubLObject metrics) {
        return add(cachemtr_hit_count(metrics), cachemtr_miss_count(metrics));
    }

    /**
     * An administrative function that gives information about the
     * cache strategy. In the absence of metrics, the method
     * degenerates to CACHE-STRATEGY-CACHE-CAPACITY.
     *
     * @return 0 NON-NEGATIVE-INTEGER-P the cache capacity
     * @return 1 NON-NEGATIVE-INTEGER-P or NIL cache hits
     * @return 2 NON-NEGATIVE-INTEGER-P or NIL cache misses
     * @return 3 BOOLEANP whether the number of misses exceeds the hits
     */
    @LispMethod(comment = "An administrative function that gives information about the\r\ncache strategy. In the absence of metrics, the method\r\ndegenerates to CACHE-STRATEGY-CACHE-CAPACITY.\r\n\r\n@return 0 NON-NEGATIVE-INTEGER-P the cache capacity\r\n@return 1 NON-NEGATIVE-INTEGER-P or NIL cache hits\r\n@return 2 NON-NEGATIVE-INTEGER-P or NIL cache misses\r\n@return 3 BOOLEANP whether the number of misses exceeds the hits\nAn administrative function that gives information about the\ncache strategy. In the absence of metrics, the method\ndegenerates to CACHE-STRATEGY-CACHE-CAPACITY.")
    public static final SubLObject gather_cache_strategy_information_alt(SubLObject cache_strategy) {
        SubLTrampolineFile.checkType(cache_strategy, CACHE_STRATEGY_P);
        {
            SubLObject cache_capacity = cache_strategy_cache_capacity(cache_strategy);
            SubLObject metrics = cache_strategy_get_metrics(cache_strategy);
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
    }

    @LispMethod(comment = "An administrative function that gives information about the\r\ncache strategy. In the absence of metrics, the method\r\ndegenerates to CACHE-STRATEGY-CACHE-CAPACITY.\r\n\r\n@return 0 NON-NEGATIVE-INTEGER-P the cache capacity\r\n@return 1 NON-NEGATIVE-INTEGER-P or NIL cache hits\r\n@return 2 NON-NEGATIVE-INTEGER-P or NIL cache misses\r\n@return 3 BOOLEANP whether the number of misses exceeds the hits\nAn administrative function that gives information about the\ncache strategy. In the absence of metrics, the method\ndegenerates to CACHE-STRATEGY-CACHE-CAPACITY.")
    public static SubLObject gather_cache_strategy_information(final SubLObject cache_strategy) {
        assert NIL != cache_strategy_p(cache_strategy) : "! cache_utilities.cache_strategy_p(cache_strategy) " + ("cache_utilities.cache_strategy_p(cache_strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(cache_strategy) ") + cache_strategy;
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

    public static final SubLObject cfasl_output_object_cache_metrics_method_alt(SubLObject v_object, SubLObject stream) {
        cfasl_wide_output_cache_metrics(v_object, stream);
        return v_object;
    }

    public static SubLObject cfasl_output_object_cache_metrics_method(final SubLObject v_object, final SubLObject stream) {
        cfasl_wide_output_cache_metrics(v_object, stream);
        return v_object;
    }

    public static final SubLObject cfasl_wide_output_cache_metrics_alt(SubLObject cache_metrics, SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_cache_metrics$.getGlobalValue(), stream);
        cfasl_output_cache_metrics_internal(cache_metrics, stream);
        return cache_metrics;
    }

    public static SubLObject cfasl_wide_output_cache_metrics(final SubLObject cache_metrics, final SubLObject stream) {
        cfasl_output_wide_opcode($cfasl_wide_opcode_cache_metrics$.getGlobalValue(), stream);
        cfasl_output_cache_metrics_internal(cache_metrics, stream);
        return cache_metrics;
    }

    public static final SubLObject cfasl_output_cache_metrics_internal_alt(SubLObject cache_metrics, SubLObject stream) {
        cfasl_output(cache_metrics_hit_count(cache_metrics), stream);
        cfasl_output(cache_metrics_miss_count(cache_metrics), stream);
        return cache_metrics;
    }

    public static SubLObject cfasl_output_cache_metrics_internal(final SubLObject cache_metrics, final SubLObject stream) {
        cfasl_output(cache_metrics_hit_count(cache_metrics), stream);
        cfasl_output(cache_metrics_miss_count(cache_metrics), stream);
        return cache_metrics;
    }

    public static final SubLObject cfasl_input_cache_metrics_alt(SubLObject stream) {
        {
            SubLObject hits = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            SubLObject misses = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            return new_cache_metrics_with_counts(hits, misses);
        }
    }

    public static SubLObject cfasl_input_cache_metrics(final SubLObject stream) {
        final SubLObject hits = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        final SubLObject misses = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return new_cache_metrics_with_counts(hits, misses);
    }

    public static final SubLObject metered_cache_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_metered_cache(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject metered_cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_metered_cache(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject metered_cache_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cache_utilities.$metered_cache_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject metered_cache_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cache_utilities.$metered_cache_native.class ? T : NIL;
    }

    public static final SubLObject mcache_cache_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, METERED_CACHE_P);
        return v_object.getField2();
    }

    public static SubLObject mcache_cache(final SubLObject v_object) {
        assert NIL != metered_cache_p(v_object) : "! cache_utilities.metered_cache_p(v_object) " + "cache_utilities.metered_cache_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject mcache_metrics_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, METERED_CACHE_P);
        return v_object.getField3();
    }

    public static SubLObject mcache_metrics(final SubLObject v_object) {
        assert NIL != metered_cache_p(v_object) : "! cache_utilities.metered_cache_p(v_object) " + "cache_utilities.metered_cache_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_mcache_cache_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, METERED_CACHE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_mcache_cache(final SubLObject v_object, final SubLObject value) {
        assert NIL != metered_cache_p(v_object) : "! cache_utilities.metered_cache_p(v_object) " + "cache_utilities.metered_cache_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_mcache_metrics_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, METERED_CACHE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_mcache_metrics(final SubLObject v_object, final SubLObject value) {
        assert NIL != metered_cache_p(v_object) : "! cache_utilities.metered_cache_p(v_object) " + "cache_utilities.metered_cache_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_metered_cache_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cache_utilities.$metered_cache_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CACHE)) {
                        _csetf_mcache_cache(v_new, current_value);
                    } else {
                        if (pcase_var.eql($METRICS)) {
                            _csetf_mcache_metrics(v_new, current_value);
                        } else {
                            Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_metered_cache(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cache_utilities.$metered_cache_native();
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

    /**
     * Allocate the new metered cache, leaving the metrics slot empty for now.
     *
     * @return the new metered cache
     */
    @LispMethod(comment = "Allocate the new metered cache, leaving the metrics slot empty for now.\r\n\r\n@return the new metered cache")
    public static final SubLObject new_metered_cache_alt(SubLObject v_cache) {
        {
            SubLObject mcache = make_metered_cache(UNPROVIDED);
            _csetf_mcache_cache(mcache, v_cache);
            return mcache;
        }
    }

    @LispMethod(comment = "Allocate the new metered cache, leaving the metrics slot empty for now.\r\n\r\n@return the new metered cache")
    public static SubLObject new_metered_cache(final SubLObject v_cache) {
        final SubLObject mcache = make_metered_cache(UNPROVIDED);
        _csetf_mcache_cache(mcache, v_cache);
        return mcache;
    }

    /**
     * Allocate a new metered cache for a pre-allocated cache of the specified
     * capacity and test-type
     *
     * @return the new metered cache
     */
    @LispMethod(comment = "Allocate a new metered cache for a pre-allocated cache of the specified\r\ncapacity and test-type\r\n\r\n@return the new metered cache\nAllocate a new metered cache for a pre-allocated cache of the specified\ncapacity and test-type")
    public static final SubLObject new_metered_preallocated_cache_alt(SubLObject capacity, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return new_metered_cache(cache.new_preallocated_cache(capacity, test));
    }

    @LispMethod(comment = "Allocate a new metered cache for a pre-allocated cache of the specified\r\ncapacity and test-type\r\n\r\n@return the new metered cache\nAllocate a new metered cache for a pre-allocated cache of the specified\ncapacity and test-type")
    public static SubLObject new_metered_preallocated_cache(final SubLObject capacity, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return new_metered_cache(cache.new_preallocated_cache(capacity, test));
    }

    public static final SubLObject print_metered_cache_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_3 = v_object;
                    SubLObject stream_4 = stream;
                    write_string($str_alt21$__, stream_4, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_3), new SubLObject[]{ $STREAM, stream_4 });
                    write_char(CHAR_space, stream_4);
                    write_string($str_alt44$Cache__, stream, UNPROVIDED, UNPROVIDED);
                    princ(mcache_cache(v_object), stream);
                    write_string($str_alt45$_, stream, UNPROVIDED, UNPROVIDED);
                    {
                        SubLObject metrics = mcache_metrics(v_object);
                        if (NIL != cache_metrics_p(metrics)) {
                            princ(metrics, stream);
                        } else {
                            write_string($str_alt46$_no_metrics_, stream, UNPROVIDED, UNPROVIDED);
                        }
                    }
                    write_char(CHAR_space, stream_4);
                    write(pointer(v_object_3), new SubLObject[]{ $STREAM, stream_4, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_4);
                }
            }
            return v_object;
        }
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

    /**
     * METERED-CACHE-P has a cache strategy implementation.
     */
    @LispMethod(comment = "METERED-CACHE-P has a cache strategy implementation.")
    public static final SubLObject cache_strategy_object_p_metered_cache_method_alt(SubLObject v_object) {
        return T;
    }

    @LispMethod(comment = "METERED-CACHE-P has a cache strategy implementation.")
    public static SubLObject cache_strategy_object_p_metered_cache_method(final SubLObject v_object) {
        return T;
    }

    public static final SubLObject cache_strategy_object_reset_metered_cache_method_alt(SubLObject v_object) {
        return cache_strategy_mcache_object_reset(v_object);
    }

    public static SubLObject cache_strategy_object_reset_metered_cache_method(final SubLObject v_object) {
        return cache_strategy_mcache_object_reset(v_object);
    }

    public static final SubLObject cache_strategy_object_cache_capacity_metered_cache_method_alt(SubLObject strategy) {
        return cache_strategy_mcache_object_cache_capacity(strategy);
    }

    public static SubLObject cache_strategy_object_cache_capacity_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_cache_capacity(strategy);
    }

    public static final SubLObject cache_strategy_object_cache_size_metered_cache_method_alt(SubLObject strategy) {
        return cache_strategy_mcache_object_cache_size(strategy);
    }

    public static SubLObject cache_strategy_object_cache_size_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_cache_size(strategy);
    }

    public static final SubLObject cache_strategy_object_track_metered_cache_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_mcache_object_track(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_track_metered_cache_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_mcache_object_track(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_trackedP_metered_cache_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_mcache_object_trackedP(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_trackedP_metered_cache_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_mcache_object_trackedP(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_untrack_metered_cache_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_mcache_object_untrack(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_untrack_metered_cache_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_mcache_object_untrack(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_supports_parameter_p_metered_cache_method_alt(SubLObject strategy, SubLObject parameter) {
        return cache_strategy_mcache_object_supports_parameter_p(strategy, parameter);
    }

    public static SubLObject cache_strategy_object_supports_parameter_p_metered_cache_method(final SubLObject strategy, final SubLObject parameter) {
        return cache_strategy_mcache_object_supports_parameter_p(strategy, parameter);
    }

    public static final SubLObject cache_strategy_object_get_parameter_metered_cache_method_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        return cache_strategy_mcache_object_get_parameter(strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_object_get_parameter_metered_cache_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return cache_strategy_mcache_object_get_parameter(strategy, parameter, v_default);
    }

    public static final SubLObject cache_strategy_object_set_parameter_metered_cache_method_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        return cache_strategy_mcache_object_set_parameter(strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_object_set_parameter_metered_cache_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return cache_strategy_mcache_object_set_parameter(strategy, parameter, v_default);
    }

    public static final SubLObject cache_strategy_object_note_reference_metered_cache_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_mcache_object_note_reference(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_note_reference_metered_cache_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_mcache_object_note_reference(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_note_references_in_order_metered_cache_method_alt(SubLObject strategy, SubLObject objects) {
        return cache_strategy_mcache_object_note_references_in_order(strategy, objects);
    }

    public static SubLObject cache_strategy_object_note_references_in_order_metered_cache_method(final SubLObject strategy, final SubLObject objects) {
        return cache_strategy_mcache_object_note_references_in_order(strategy, objects);
    }

    public static final SubLObject cache_strategy_object_get_metrics_metered_cache_method_alt(SubLObject strategy) {
        return cache_strategy_mcache_object_get_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_get_metrics_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_get_metrics(strategy);
    }

    public static final SubLObject cache_strategy_object_reset_metrics_metered_cache_method_alt(SubLObject strategy) {
        return cache_strategy_mcache_object_reset_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_reset_metrics_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_reset_metrics(strategy);
    }

    public static final SubLObject cache_strategy_object_gather_metrics_metered_cache_method_alt(SubLObject strategy, SubLObject metrics) {
        return cache_strategy_mcache_object_gather_metrics(strategy, metrics);
    }

    public static SubLObject cache_strategy_object_gather_metrics_metered_cache_method(final SubLObject strategy, final SubLObject metrics) {
        return cache_strategy_mcache_object_gather_metrics(strategy, metrics);
    }

    public static final SubLObject cache_strategy_object_dont_gather_metrics_metered_cache_method_alt(SubLObject strategy) {
        return cache_strategy_mcache_object_dont_gather_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_dont_gather_metrics_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_dont_gather_metrics(strategy);
    }

    public static final SubLObject cache_strategy_object_keeps_metrics_p_metered_cache_method_alt(SubLObject strategy) {
        return cache_strategy_mcache_object_keeps_metrics_p(strategy);
    }

    public static SubLObject cache_strategy_object_keeps_metrics_p_metered_cache_method(final SubLObject strategy) {
        return cache_strategy_mcache_object_keeps_metrics_p(strategy);
    }

    public static final SubLObject new_cache_strategy_object_tracked_content_iterator_metered_cache_method_alt(SubLObject strategy) {
        return new_cache_strategy_mcache_object_tracked_content_iterator(strategy);
    }

    public static SubLObject new_cache_strategy_object_tracked_content_iterator_metered_cache_method(final SubLObject strategy) {
        return new_cache_strategy_mcache_object_tracked_content_iterator(strategy);
    }

    public static final SubLObject map_cache_strategy_object_tracked_content_metered_cache_method_alt(SubLObject strategy, SubLObject functor) {
        return map_cache_strategy_mcache_object_tracked_content(strategy, functor);
    }

    public static SubLObject map_cache_strategy_object_tracked_content_metered_cache_method(final SubLObject strategy, final SubLObject functor) {
        return map_cache_strategy_mcache_object_tracked_content(strategy, functor);
    }

    public static final SubLObject cache_strategy_object_untrack_all_metered_cache_method_alt(SubLObject strategy, SubLObject functor) {
        return cache_strategy_mcache_object_untrack_all(strategy, functor);
    }

    public static SubLObject cache_strategy_object_untrack_all_metered_cache_method(final SubLObject strategy, final SubLObject functor) {
        return cache_strategy_mcache_object_untrack_all(strategy, functor);
    }

    public static final SubLObject cache_strategy_mcache_object_reset_alt(SubLObject mcache) {
        cache.cache_clear(mcache_cache(mcache));
        return mcache;
    }

    public static SubLObject cache_strategy_mcache_object_reset(final SubLObject mcache) {
        cache.cache_clear(mcache_cache(mcache));
        return mcache;
    }

    public static final SubLObject cache_strategy_mcache_object_cache_capacity_alt(SubLObject mcache) {
        return cache.cache_capacity(mcache_cache(mcache));
    }

    public static SubLObject cache_strategy_mcache_object_cache_capacity(final SubLObject mcache) {
        return cache.cache_capacity(mcache_cache(mcache));
    }

    public static final SubLObject cache_strategy_mcache_object_track_alt(SubLObject mcache, SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject key = cache.cache_set_return_dropped(mcache_cache(mcache), v_object, v_object);
                SubLObject value = thread.secondMultipleValue();
                SubLObject dropped_p = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return NIL != dropped_p ? ((SubLObject) (key)) : v_object;
            }
        }
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

    public static final SubLObject cache_strategy_mcache_object_cache_size_alt(SubLObject mcache) {
        return cache.cache_size(mcache_cache(mcache));
    }

    public static SubLObject cache_strategy_mcache_object_cache_size(final SubLObject mcache) {
        return cache.cache_size(mcache_cache(mcache));
    }

    public static final SubLObject cache_strategy_mcache_object_trackedP_alt(SubLObject mcache, SubLObject v_object) {
        return cache.cache_contains_key_p(mcache_cache(mcache), v_object);
    }

    public static SubLObject cache_strategy_mcache_object_trackedP(final SubLObject mcache, final SubLObject v_object) {
        return cache.cache_contains_key_p(mcache_cache(mcache), v_object);
    }

    public static final SubLObject cache_strategy_mcache_object_untrack_alt(SubLObject mcache, SubLObject v_object) {
        return cache.cache_remove(mcache_cache(mcache), v_object);
    }

    public static SubLObject cache_strategy_mcache_object_untrack(final SubLObject mcache, final SubLObject v_object) {
        return cache.cache_remove(mcache_cache(mcache), v_object);
    }

    public static final SubLObject cache_strategy_mcache_object_supports_parameter_p_alt(SubLObject mcache, SubLObject parameter) {
        return NIL;
    }

    public static SubLObject cache_strategy_mcache_object_supports_parameter_p(final SubLObject mcache, final SubLObject parameter) {
        return NIL;
    }

    public static final SubLObject cache_strategy_mcache_object_get_parameter_alt(SubLObject mcache, SubLObject parameter, SubLObject v_default) {
        return v_default;
    }

    public static SubLObject cache_strategy_mcache_object_get_parameter(final SubLObject mcache, final SubLObject parameter, final SubLObject v_default) {
        return v_default;
    }

    public static final SubLObject cache_strategy_mcache_object_set_parameter_alt(SubLObject mcache, SubLObject parameter, SubLObject v_default) {
        return v_default;
    }

    public static SubLObject cache_strategy_mcache_object_set_parameter(final SubLObject mcache, final SubLObject parameter, final SubLObject v_default) {
        return v_default;
    }

    public static final SubLObject cache_strategy_mcache_object_note_reference_alt(SubLObject mcache, SubLObject v_object) {
        return cache.cache_set_without_values(mcache_cache(mcache), v_object, v_object);
    }

    public static SubLObject cache_strategy_mcache_object_note_reference(final SubLObject mcache, final SubLObject v_object) {
        return cache.cache_set_without_values(mcache_cache(mcache), v_object, v_object);
    }

    public static final SubLObject cache_strategy_mcache_object_note_references_in_order_alt(SubLObject mcache, SubLObject objects) {
        return default_cache_strategy_object_note_references_in_order(mcache, objects);
    }

    public static SubLObject cache_strategy_mcache_object_note_references_in_order(final SubLObject mcache, final SubLObject objects) {
        return default_cache_strategy_object_note_references_in_order(mcache, objects);
    }

    public static final SubLObject cache_strategy_mcache_object_get_metrics_alt(SubLObject mcache) {
        return mcache_metrics(mcache);
    }

    public static SubLObject cache_strategy_mcache_object_get_metrics(final SubLObject mcache) {
        return mcache_metrics(mcache);
    }

    public static final SubLObject cache_strategy_mcache_object_reset_metrics_alt(SubLObject mcache) {
        return cache_metrics_reset(mcache_metrics(mcache));
    }

    public static SubLObject cache_strategy_mcache_object_reset_metrics(final SubLObject mcache) {
        return cache_metrics_reset(mcache_metrics(mcache));
    }

    public static final SubLObject cache_strategy_mcache_object_gather_metrics_alt(SubLObject mcache, SubLObject metrics) {
        _csetf_mcache_metrics(mcache, metrics);
        return mcache;
    }

    public static SubLObject cache_strategy_mcache_object_gather_metrics(final SubLObject mcache, final SubLObject metrics) {
        _csetf_mcache_metrics(mcache, metrics);
        return mcache;
    }

    public static final SubLObject cache_strategy_mcache_object_dont_gather_metrics_alt(SubLObject mcache) {
        {
            SubLObject metrics = mcache_metrics(mcache);
            _csetf_mcache_metrics(mcache, NIL);
            return metrics;
        }
    }

    public static SubLObject cache_strategy_mcache_object_dont_gather_metrics(final SubLObject mcache) {
        final SubLObject metrics = mcache_metrics(mcache);
        _csetf_mcache_metrics(mcache, NIL);
        return metrics;
    }

    public static final SubLObject cache_strategy_mcache_object_keeps_metrics_p_alt(SubLObject mcache) {
        return cache_metrics_p(mcache_metrics(mcache));
    }

    public static SubLObject cache_strategy_mcache_object_keeps_metrics_p(final SubLObject mcache) {
        return cache_metrics_p(mcache_metrics(mcache));
    }

    public static final SubLObject new_cache_strategy_mcache_object_tracked_content_iterator_alt(SubLObject mcache) {
        return cache.new_cache_content_iterator(mcache_cache(mcache));
    }

    public static SubLObject new_cache_strategy_mcache_object_tracked_content_iterator(final SubLObject mcache) {
        return cache.new_cache_content_iterator(mcache_cache(mcache));
    }

    public static final SubLObject map_cache_strategy_mcache_object_tracked_content_alt(SubLObject mcache, SubLObject functor) {
        return default_map_cache_strategy_object_tracked_content(mcache, functor);
    }

    public static SubLObject map_cache_strategy_mcache_object_tracked_content(final SubLObject mcache, final SubLObject functor) {
        return default_map_cache_strategy_object_tracked_content(mcache, functor);
    }

    public static final SubLObject cache_strategy_mcache_object_untrack_all_alt(SubLObject mcache, SubLObject functor) {
        return default_cache_strategy_object_untrack_all(mcache, functor);
    }

    public static SubLObject cache_strategy_mcache_object_untrack_all(final SubLObject mcache, final SubLObject functor) {
        return default_cache_strategy_object_untrack_all(mcache, functor);
    }

    public static final SubLObject recording_cache_strategy_facade_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_recording_cache_strategy_facade(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject recording_cache_strategy_facade_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_recording_cache_strategy_facade(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject recording_cache_strategy_facade_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cache_utilities.$recording_cache_strategy_facade_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject recording_cache_strategy_facade_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.cache_utilities.$recording_cache_strategy_facade_native.class ? T : NIL;
    }

    public static final SubLObject rec_cachstrat_facade_cache_strategy_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RECORDING_CACHE_STRATEGY_FACADE_P);
        return v_object.getField2();
    }

    public static SubLObject rec_cachstrat_facade_cache_strategy(final SubLObject v_object) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "! cache_utilities.recording_cache_strategy_facade_p(v_object) " + "cache_utilities.recording_cache_strategy_facade_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rec_cachstrat_facade_records_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RECORDING_CACHE_STRATEGY_FACADE_P);
        return v_object.getField3();
    }

    public static SubLObject rec_cachstrat_facade_records(final SubLObject v_object) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "! cache_utilities.recording_cache_strategy_facade_p(v_object) " + "cache_utilities.recording_cache_strategy_facade_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rec_cachstrat_facade_timestamper_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RECORDING_CACHE_STRATEGY_FACADE_P);
        return v_object.getField4();
    }

    public static SubLObject rec_cachstrat_facade_timestamper(final SubLObject v_object) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "! cache_utilities.recording_cache_strategy_facade_p(v_object) " + "cache_utilities.recording_cache_strategy_facade_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_rec_cachstrat_facade_cache_strategy_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RECORDING_CACHE_STRATEGY_FACADE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rec_cachstrat_facade_cache_strategy(final SubLObject v_object, final SubLObject value) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "! cache_utilities.recording_cache_strategy_facade_p(v_object) " + "cache_utilities.recording_cache_strategy_facade_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rec_cachstrat_facade_records_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RECORDING_CACHE_STRATEGY_FACADE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rec_cachstrat_facade_records(final SubLObject v_object, final SubLObject value) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "! cache_utilities.recording_cache_strategy_facade_p(v_object) " + "cache_utilities.recording_cache_strategy_facade_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rec_cachstrat_facade_timestamper_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RECORDING_CACHE_STRATEGY_FACADE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rec_cachstrat_facade_timestamper(final SubLObject v_object, final SubLObject value) {
        assert NIL != recording_cache_strategy_facade_p(v_object) : "! cache_utilities.recording_cache_strategy_facade_p(v_object) " + "cache_utilities.recording_cache_strategy_facade_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_recording_cache_strategy_facade_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.cache_utilities.$recording_cache_strategy_facade_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CACHE_STRATEGY)) {
                        _csetf_rec_cachstrat_facade_cache_strategy(v_new, current_value);
                    } else {
                        if (pcase_var.eql($RECORDS)) {
                            _csetf_rec_cachstrat_facade_records(v_new, current_value);
                        } else {
                            if (pcase_var.eql($TIMESTAMPER)) {
                                _csetf_rec_cachstrat_facade_timestamper(v_new, current_value);
                            } else {
                                Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_recording_cache_strategy_facade(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.cache_utilities.$recording_cache_strategy_facade_native();
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

    /**
     * Wrap a cache-strategy with a recording slot.
     *
     * @param TIME-STAMPER
     * 		an integer sequence generator; passing the same one to multiple
     * 		caches ensures that the time-series can be reconstructed
     * @return new recording cache strategy facade
     */
    @LispMethod(comment = "Wrap a cache-strategy with a recording slot.\r\n\r\n@param TIME-STAMPER\r\n\t\tan integer sequence generator; passing the same one to multiple\r\n\t\tcaches ensures that the time-series can be reconstructed\r\n@return new recording cache strategy facade")
    public static final SubLObject new_recording_cache_strategy_facade_alt(SubLObject cache_strategy, SubLObject time_stamper) {
        SubLTrampolineFile.checkType(cache_strategy, CACHE_STRATEGY_P);
        SubLTrampolineFile.checkType(time_stamper, INTEGER_SEQUENCE_GENERATOR_P);
        {
            SubLObject rec_cache = make_recording_cache_strategy_facade(UNPROVIDED);
            _csetf_rec_cachstrat_facade_cache_strategy(rec_cache, cache_strategy);
            _csetf_rec_cachstrat_facade_records(rec_cache, NIL);
            _csetf_rec_cachstrat_facade_timestamper(rec_cache, time_stamper);
            return rec_cache;
        }
    }

    @LispMethod(comment = "Wrap a cache-strategy with a recording slot.\r\n\r\n@param TIME-STAMPER\r\n\t\tan integer sequence generator; passing the same one to multiple\r\n\t\tcaches ensures that the time-series can be reconstructed\r\n@return new recording cache strategy facade")
    public static SubLObject new_recording_cache_strategy_facade(final SubLObject cache_strategy, final SubLObject time_stamper) {
        assert NIL != cache_strategy_p(cache_strategy) : "! cache_utilities.cache_strategy_p(cache_strategy) " + ("cache_utilities.cache_strategy_p(cache_strategy) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(cache_strategy) ") + cache_strategy;
        assert NIL != integer_sequence_generator.integer_sequence_generator_p(time_stamper) : "! integer_sequence_generator.integer_sequence_generator_p(time_stamper) " + ("integer_sequence_generator.integer_sequence_generator_p(time_stamper) " + "CommonSymbols.NIL != integer_sequence_generator.integer_sequence_generator_p(time_stamper) ") + time_stamper;
        final SubLObject rec_cache = make_recording_cache_strategy_facade(UNPROVIDED);
        _csetf_rec_cachstrat_facade_cache_strategy(rec_cache, cache_strategy);
        _csetf_rec_cachstrat_facade_records(rec_cache, NIL);
        _csetf_rec_cachstrat_facade_timestamper(rec_cache, time_stamper);
        return rec_cache;
    }

    /**
     * Get the accumulated records out and store a new recording infrastructure.
     *
     * @return the records accumulated so far
     */
    @LispMethod(comment = "Get the accumulated records out and store a new recording infrastructure.\r\n\r\n@return the records accumulated so far")
    public static final SubLObject recording_cache_strategy_facade_get_records_alt(SubLObject rec_cache) {
        SubLTrampolineFile.checkType(rec_cache, CACHE_STRATEGY_P);
        {
            SubLObject records = rec_cachstrat_facade_records(rec_cache);
            _csetf_rec_cachstrat_facade_records(rec_cache, NIL);
            return nreverse(records);
        }
    }

    @LispMethod(comment = "Get the accumulated records out and store a new recording infrastructure.\r\n\r\n@return the records accumulated so far")
    public static SubLObject recording_cache_strategy_facade_get_records(final SubLObject rec_cache) {
        assert NIL != cache_strategy_p(rec_cache) : "! cache_utilities.cache_strategy_p(rec_cache) " + ("cache_utilities.cache_strategy_p(rec_cache) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(rec_cache) ") + rec_cache;
        final SubLObject records = rec_cachstrat_facade_records(rec_cache);
        _csetf_rec_cachstrat_facade_records(rec_cache, NIL);
        return nreverse(records);
    }

    /**
     *
     *
     * @return the facaded cache strategy
     */
    @LispMethod(comment = "@return the facaded cache strategy")
    public static final SubLObject recording_cache_strategy_facade_get_facaded_cache_strategy_alt(SubLObject rec_cache) {
        SubLTrampolineFile.checkType(rec_cache, CACHE_STRATEGY_P);
        return rec_cachstrat_facade_cache_strategy(rec_cache);
    }

    /**
     *
     *
     * @return the facaded cache strategy
     */
    @LispMethod(comment = "@return the facaded cache strategy")
    public static SubLObject recording_cache_strategy_facade_get_facaded_cache_strategy(final SubLObject rec_cache) {
        assert NIL != cache_strategy_p(rec_cache) : "! cache_utilities.cache_strategy_p(rec_cache) " + ("cache_utilities.cache_strategy_p(rec_cache) " + "CommonSymbols.NIL != cache_utilities.cache_strategy_p(rec_cache) ") + rec_cache;
        return rec_cachstrat_facade_cache_strategy(rec_cache);
    }

    /**
     * Record one cache strategy action.
     */
    @LispMethod(comment = "Record one cache strategy action.")
    public static final SubLObject recording_cache_strategy_facade_record_action_alt(SubLObject rec_cache, SubLObject action, SubLObject item) {
        {
            SubLObject isg = rec_cachstrat_facade_timestamper(rec_cache);
            SubLObject id = integer_sequence_generator_next(isg);
            _csetf_rec_cachstrat_facade_records(rec_cache, cons(list(id, action, item), rec_cachstrat_facade_records(rec_cache)));
            return rec_cache;
        }
    }

    @LispMethod(comment = "Record one cache strategy action.")
    public static SubLObject recording_cache_strategy_facade_record_action(final SubLObject rec_cache, final SubLObject action, final SubLObject item) {
        final SubLObject isg = rec_cachstrat_facade_timestamper(rec_cache);
        final SubLObject id = integer_sequence_generator.integer_sequence_generator_next(isg);
        _csetf_rec_cachstrat_facade_records(rec_cache, cons(list(id, action, item), rec_cachstrat_facade_records(rec_cache)));
        return rec_cache;
    }

    public static final SubLObject print_recording_cache_strategy_facade_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_object, stream);
            } else {
                {
                    SubLObject v_object_5 = v_object;
                    SubLObject stream_6 = stream;
                    write_string($str_alt21$__, stream_6, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object_5), new SubLObject[]{ $STREAM, stream_6 });
                    write_char(CHAR_space, stream_6);
                    write_string($str_alt85$_wrapped__, stream, UNPROVIDED, UNPROVIDED);
                    princ(rec_cachstrat_facade_cache_strategy(v_object), stream);
                    write_string($str_alt45$_, stream, UNPROVIDED, UNPROVIDED);
                    write_char(CHAR_space, stream_6);
                    write(pointer(v_object_5), new SubLObject[]{ $STREAM, stream_6, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_6);
                }
            }
            return v_object;
        }
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

    public static final SubLObject cache_strategy_object_p_recording_cache_strategy_facade_method_alt(SubLObject strategy) {
        return T;
    }

    public static SubLObject cache_strategy_object_p_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return T;
    }

    public static final SubLObject cache_strategy_object_reset_recording_cache_strategy_facade_method_alt(SubLObject strategy) {
        return cache_strategy_rec_cache_object_reset(strategy);
    }

    public static SubLObject cache_strategy_object_reset_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_reset(strategy);
    }

    public static final SubLObject cache_strategy_object_cache_capacity_recording_cache_strategy_facade_method_alt(SubLObject strategy) {
        return cache_strategy_rec_cache_object_cache_capacity(strategy);
    }

    public static SubLObject cache_strategy_object_cache_capacity_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_cache_capacity(strategy);
    }

    public static final SubLObject cache_strategy_object_cache_size_recording_cache_strategy_facade_method_alt(SubLObject strategy) {
        return cache_strategy_rec_cache_object_cache_size(strategy);
    }

    public static SubLObject cache_strategy_object_cache_size_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_cache_size(strategy);
    }

    public static final SubLObject cache_strategy_object_track_recording_cache_strategy_facade_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_rec_cache_object_track(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_track_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_rec_cache_object_track(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_trackedP_recording_cache_strategy_facade_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_rec_cache_object_trackedP(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_trackedP_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_rec_cache_object_trackedP(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_untrack_recording_cache_strategy_facade_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_rec_cache_object_untrack(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_untrack_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_rec_cache_object_untrack(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_supports_parameter_p_recording_cache_strategy_facade_method_alt(SubLObject strategy, SubLObject parameter) {
        return cache_strategy_rec_cache_object_supports_parameter_p(strategy, parameter);
    }

    public static SubLObject cache_strategy_object_supports_parameter_p_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject parameter) {
        return cache_strategy_rec_cache_object_supports_parameter_p(strategy, parameter);
    }

    public static final SubLObject cache_strategy_object_get_parameter_recording_cache_strategy_facade_method_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        return cache_strategy_rec_cache_object_get_parameter(strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_object_get_parameter_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return cache_strategy_rec_cache_object_get_parameter(strategy, parameter, v_default);
    }

    public static final SubLObject cache_strategy_object_set_parameter_recording_cache_strategy_facade_method_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        return cache_strategy_rec_cache_object_set_parameter(strategy, parameter, v_default);
    }

    public static SubLObject cache_strategy_object_set_parameter_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        return cache_strategy_rec_cache_object_set_parameter(strategy, parameter, v_default);
    }

    public static final SubLObject cache_strategy_object_note_reference_recording_cache_strategy_facade_method_alt(SubLObject strategy, SubLObject v_object) {
        return cache_strategy_rec_cache_object_note_reference(strategy, v_object);
    }

    public static SubLObject cache_strategy_object_note_reference_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject v_object) {
        return cache_strategy_rec_cache_object_note_reference(strategy, v_object);
    }

    public static final SubLObject cache_strategy_object_note_references_in_order_recording_cache_strategy_facade_method_alt(SubLObject strategy, SubLObject objects) {
        return cache_strategy_rec_cache_object_note_references_in_order(strategy, objects);
    }

    public static SubLObject cache_strategy_object_note_references_in_order_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject objects) {
        return cache_strategy_rec_cache_object_note_references_in_order(strategy, objects);
    }

    public static final SubLObject cache_strategy_object_get_metrics_recording_cache_strategy_facade_method_alt(SubLObject strategy) {
        return cache_strategy_rec_cache_object_get_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_get_metrics_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_get_metrics(strategy);
    }

    public static final SubLObject cache_strategy_object_reset_metrics_recording_cache_strategy_facade_method_alt(SubLObject strategy) {
        return cache_strategy_rec_cache_object_reset_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_reset_metrics_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_reset_metrics(strategy);
    }

    public static final SubLObject cache_strategy_object_gather_metrics_recording_cache_strategy_facade_method_alt(SubLObject strategy, SubLObject metrics) {
        return cache_strategy_rec_cache_object_gather_metrics(strategy, metrics);
    }

    public static SubLObject cache_strategy_object_gather_metrics_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject metrics) {
        return cache_strategy_rec_cache_object_gather_metrics(strategy, metrics);
    }

    public static final SubLObject cache_strategy_object_dont_gather_metrics_recording_cache_strategy_facade_method_alt(SubLObject strategy) {
        return cache_strategy_rec_cache_object_dont_gather_metrics(strategy);
    }

    public static SubLObject cache_strategy_object_dont_gather_metrics_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_dont_gather_metrics(strategy);
    }

    public static final SubLObject cache_strategy_object_keeps_metrics_p_recording_cache_strategy_facade_method_alt(SubLObject strategy) {
        return cache_strategy_rec_cache_object_keeps_metrics_p(strategy);
    }

    public static SubLObject cache_strategy_object_keeps_metrics_p_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return cache_strategy_rec_cache_object_keeps_metrics_p(strategy);
    }

    public static final SubLObject new_cache_strategy_object_tracked_content_iterator_recording_cache_strategy_facade_method_alt(SubLObject strategy) {
        return new_cache_strategy_rec_cache_object_tracked_content_iterator(strategy);
    }

    public static SubLObject new_cache_strategy_object_tracked_content_iterator_recording_cache_strategy_facade_method(final SubLObject strategy) {
        return new_cache_strategy_rec_cache_object_tracked_content_iterator(strategy);
    }

    public static final SubLObject map_cache_strategy_object_tracked_content_recording_cache_strategy_facade_method_alt(SubLObject strategy, SubLObject functor) {
        return map_cache_strategy_rec_cache_object_tracked_content(strategy, functor);
    }

    public static SubLObject map_cache_strategy_object_tracked_content_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject functor) {
        return map_cache_strategy_rec_cache_object_tracked_content(strategy, functor);
    }

    public static final SubLObject cache_strategy_object_untrack_all_recording_cache_strategy_facade_method_alt(SubLObject strategy, SubLObject functor) {
        return cache_strategy_rec_cache_object_untrack_all(strategy, functor);
    }

    public static SubLObject cache_strategy_object_untrack_all_recording_cache_strategy_facade_method(final SubLObject strategy, final SubLObject functor) {
        return cache_strategy_rec_cache_object_untrack_all(strategy, functor);
    }

    public static final SubLObject cache_strategy_rec_cache_object_cache_capacity_alt(SubLObject strategy) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_cache_capacity(interior_strategy);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_cache_capacity(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_cache_capacity(interior_strategy);
    }

    public static final SubLObject cache_strategy_rec_cache_object_cache_size_alt(SubLObject strategy) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_cache_size(interior_strategy);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_cache_size(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_cache_size(interior_strategy);
    }

    public static final SubLObject cache_strategy_rec_cache_object_dont_gather_metrics_alt(SubLObject strategy) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_dont_gather_metrics(interior_strategy);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_dont_gather_metrics(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_dont_gather_metrics(interior_strategy);
    }

    public static final SubLObject cache_strategy_rec_cache_object_gather_metrics_alt(SubLObject strategy, SubLObject metrics) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_object_gather_metrics(interior_strategy, metrics);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_gather_metrics(final SubLObject strategy, final SubLObject metrics) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_object_gather_metrics(interior_strategy, metrics);
    }

    public static final SubLObject cache_strategy_rec_cache_object_get_metrics_alt(SubLObject strategy) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_get_metrics(interior_strategy);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_get_metrics(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_get_metrics(interior_strategy);
    }

    public static final SubLObject cache_strategy_rec_cache_object_get_parameter_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_get_parameter(interior_strategy, parameter, v_default);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_get_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_get_parameter(interior_strategy, parameter, v_default);
    }

    public static final SubLObject cache_strategy_rec_cache_object_keeps_metrics_p_alt(SubLObject strategy) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_keeps_metrics_p(interior_strategy);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_keeps_metrics_p(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_keeps_metrics_p(interior_strategy);
    }

    public static final SubLObject cache_strategy_rec_cache_object_note_reference_alt(SubLObject strategy, SubLObject v_object) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            recording_cache_strategy_facade_record_action(strategy, $NOTE_REF, v_object);
            return cache_strategy_note_reference(interior_strategy, v_object);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_note_reference(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        recording_cache_strategy_facade_record_action(strategy, $NOTE_REF, v_object);
        return cache_strategy_note_reference(interior_strategy, v_object);
    }

    public static final SubLObject cache_strategy_rec_cache_object_note_references_in_order_alt(SubLObject strategy, SubLObject objects) {
        return default_cache_strategy_object_note_references_in_order(strategy, objects);
    }

    public static SubLObject cache_strategy_rec_cache_object_note_references_in_order(final SubLObject strategy, final SubLObject objects) {
        return default_cache_strategy_object_note_references_in_order(strategy, objects);
    }

    public static final SubLObject cache_strategy_rec_cache_object_reset_alt(SubLObject strategy) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_reset(interior_strategy);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_reset(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_reset(interior_strategy);
    }

    public static final SubLObject cache_strategy_rec_cache_object_reset_metrics_alt(SubLObject strategy) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_reset_metrics(interior_strategy);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_reset_metrics(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_reset_metrics(interior_strategy);
    }

    public static final SubLObject cache_strategy_rec_cache_object_set_parameter_alt(SubLObject strategy, SubLObject parameter, SubLObject v_default) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_set_parameter(interior_strategy, parameter, v_default);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_set_parameter(final SubLObject strategy, final SubLObject parameter, final SubLObject v_default) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_set_parameter(interior_strategy, parameter, v_default);
    }

    public static final SubLObject cache_strategy_rec_cache_object_supports_parameter_p_alt(SubLObject strategy, SubLObject parameter) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_supports_parameter_p(interior_strategy, parameter);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_supports_parameter_p(final SubLObject strategy, final SubLObject parameter) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_supports_parameter_p(interior_strategy, parameter);
    }

    public static final SubLObject cache_strategy_rec_cache_object_track_alt(SubLObject strategy, SubLObject v_object) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            recording_cache_strategy_facade_record_action(strategy, $TRACK, v_object);
            return cache_strategy_track(interior_strategy, v_object);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_track(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        recording_cache_strategy_facade_record_action(strategy, $TRACK, v_object);
        return cache_strategy_track(interior_strategy, v_object);
    }

    public static final SubLObject cache_strategy_rec_cache_object_trackedP_alt(SubLObject strategy, SubLObject v_object) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return cache_strategy_trackedP(interior_strategy, v_object);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_trackedP(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return cache_strategy_trackedP(interior_strategy, v_object);
    }

    public static final SubLObject cache_strategy_rec_cache_object_untrack_alt(SubLObject strategy, SubLObject v_object) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            recording_cache_strategy_facade_record_action(strategy, $UNTRACK, v_object);
            return cache_strategy_untrack(interior_strategy, v_object);
        }
    }

    public static SubLObject cache_strategy_rec_cache_object_untrack(final SubLObject strategy, final SubLObject v_object) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        recording_cache_strategy_facade_record_action(strategy, $UNTRACK, v_object);
        return cache_strategy_untrack(interior_strategy, v_object);
    }

    public static final SubLObject cache_strategy_rec_cache_object_untrack_all_alt(SubLObject strategy, SubLObject functor) {
        return default_cache_strategy_object_untrack_all(strategy, functor);
    }

    public static SubLObject cache_strategy_rec_cache_object_untrack_all(final SubLObject strategy, final SubLObject functor) {
        return default_cache_strategy_object_untrack_all(strategy, functor);
    }

    public static final SubLObject map_cache_strategy_rec_cache_object_tracked_content_alt(SubLObject strategy, SubLObject functor) {
        return default_map_cache_strategy_object_tracked_content(strategy, functor);
    }

    public static SubLObject map_cache_strategy_rec_cache_object_tracked_content(final SubLObject strategy, final SubLObject functor) {
        return default_map_cache_strategy_object_tracked_content(strategy, functor);
    }

    public static final SubLObject new_cache_strategy_rec_cache_object_tracked_content_iterator_alt(SubLObject strategy) {
        {
            SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
            return new_cache_strategy_tracked_content_iterator(interior_strategy);
        }
    }

    public static SubLObject new_cache_strategy_rec_cache_object_tracked_content_iterator(final SubLObject strategy) {
        final SubLObject interior_strategy = rec_cachstrat_facade_cache_strategy(strategy);
        return new_cache_strategy_tracked_content_iterator(interior_strategy);
    }

    /**
     * Trampoline for testing the cache strategy based on CACHE-P.
     */
    @LispMethod(comment = "Trampoline for testing the cache strategy based on CACHE-P.")
    public static final SubLObject test_mcache_strategy_implementation_conformance_alt(SubLObject capacity) {
        return test_cache_strategy_implementation_conformance(new_metered_preallocated_cache(capacity, UNPROVIDED));
    }

    @LispMethod(comment = "Trampoline for testing the cache strategy based on CACHE-P.")
    public static SubLObject test_mcache_strategy_implementation_conformance(final SubLObject capacity) {
        return test_cache_strategy_implementation_conformance(new_metered_preallocated_cache(capacity, UNPROVIDED));
    }

    /**
     * This is the basic conformance test for a cache strategy.
     */
    @LispMethod(comment = "This is the basic conformance test for a cache strategy.")
    public static final SubLObject test_cache_strategy_implementation_conformance_alt(SubLObject strategy) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!cache_strategy_cache_size(strategy).isZero()) {
                    Errors.error($str_alt118$Cannot_properly_validate_dirty_ca, strategy);
                }
            }
            {
                SubLObject capacity = cache_strategy_cache_capacity(strategy);
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL != cache_strategy_trackedP(strategy, i)) {
                                Errors.error($str_alt119$Strategy__A_is_tracking_item__A_b, strategy, i);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!i.numE(cache_strategy_track(strategy, i))) {
                                Errors.error($str_alt120$Strategy__A_is_suggesting_to_remo, strategy, i);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cache_strategy_trackedP(strategy, i)) {
                                Errors.error($str_alt121$Strategy__A_is_not_tracking_item_, strategy, i);
                            }
                        }
                    }
                }
                {
                    SubLObject curr_size = cache_strategy_cache_size(strategy);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!capacity.numE(curr_size)) {
                            Errors.error($str_alt122$After_adding__A_items_to_an_empty, capacity, curr_size);
                        }
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == cache_strategy_cache_full_p(strategy)) {
                        Errors.error($str_alt123$The_strategy__A_does_not_implemen, strategy);
                    }
                }
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(capacity); i = add(i, ONE_INTEGER)) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == cache_strategy_trackedP(strategy, i)) {
                                Errors.error($str_alt121$Strategy__A_is_not_tracking_item_, strategy, i);
                            }
                        }
                        cache_strategy_untrack(strategy, i);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL != cache_strategy_trackedP(strategy, i)) {
                                Errors.error($str_alt124$Strategy__A_is_tracking_item__A_t, strategy, i);
                            }
                        }
                    }
                }
                {
                    SubLObject curr_size = cache_strategy_cache_size(strategy);
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!curr_size.isZero()) {
                            Errors.error($str_alt125$After_removing__A_items_from_a_fu, capacity, curr_size);
                        }
                    }
                }
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == cache_strategy_cache_empty_p(strategy)) {
                        Errors.error($str_alt126$The_strategy__A_is_not_implementi, strategy);
                    }
                }
            }
            return $SUCCESS;
        }
    }

    @LispMethod(comment = "This is the basic conformance test for a cache strategy.")
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

    /**
     * Test two cache strategy implementations for producing equivalent results.
     * Will error if this is not so.
     *
     * @see also RANDOM-INTEGERS-FOR-TESTING-CACHES
     */
    @LispMethod(comment = "Test two cache strategy implementations for producing equivalent results.\r\nWill error if this is not so.\r\n\r\n@see also RANDOM-INTEGERS-FOR-TESTING-CACHES\nTest two cache strategy implementations for producing equivalent results.\nWill error if this is not so.")
    public static final SubLObject test_two_cache_strategy_implementations_alt(SubLObject strategy_a, SubLObject strategy_b, SubLObject items_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject list_var = NIL;
                SubLObject item = NIL;
                SubLObject counter = NIL;
                for (list_var = items_list, item = list_var.first(), counter = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , item = list_var.first() , counter = add(ONE_INTEGER, counter)) {
                    {
                        SubLObject result_a = cache_strategy_track(strategy_a, item);
                        SubLObject result_b = cache_strategy_track(strategy_b, item);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (result_a != result_b) {
                                Errors.error($str_alt128$The_two_strategies_disagree_on_th, new SubLObject[]{ counter, item, strategy_a, result_a, strategy_b, result_b });
                            }
                        }
                    }
                }
            }
            return $SUCCESS;
        }
    }

    @LispMethod(comment = "Test two cache strategy implementations for producing equivalent results.\r\nWill error if this is not so.\r\n\r\n@see also RANDOM-INTEGERS-FOR-TESTING-CACHES\nTest two cache strategy implementations for producing equivalent results.\nWill error if this is not so.")
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

    /**
     * Take two strategies, ensure that they both behave the same way on the item list, then
     * rerun them for timing comparison and return B if it beats A
     *
     * @param STRATEGY-A
     * 		the first candidate
     * @param STRATEGY-B
     * 		the second candidate
     * @param ITEMS-LIST
     * 		a LISTP of items to add; must be comparable with the TESTFN
     * 		(see also RANDOM-INTEGERS-FOR-TESTING-CACHES)
     * @return 0 STRATEGY-B if faster than A, else Strategy-A
     * @return 1 time for STRATEGY-A
     * @return 2 time for STRATEGY-B
     */
    @LispMethod(comment = "Take two strategies, ensure that they both behave the same way on the item list, then\r\nrerun them for timing comparison and return B if it beats A\r\n\r\n@param STRATEGY-A\r\n\t\tthe first candidate\r\n@param STRATEGY-B\r\n\t\tthe second candidate\r\n@param ITEMS-LIST\r\n\t\ta LISTP of items to add; must be comparable with the TESTFN\r\n\t\t(see also RANDOM-INTEGERS-FOR-TESTING-CACHES)\r\n@return 0 STRATEGY-B if faster than A, else Strategy-A\r\n@return 1 time for STRATEGY-A\r\n@return 2 time for STRATEGY-B\nTake two strategies, ensure that they both behave the same way on the item list, then\nrerun them for timing comparison and return B if it beats A")
    public static final SubLObject faster_cache_strategy_implementation_alt(SubLObject strategy_a, SubLObject strategy_b, SubLObject items_list, SubLObject runs) {
        if (runs == UNPROVIDED) {
            runs = ONE_INTEGER;
        }
        test_two_cache_strategy_implementations(strategy_a, strategy_b, items_list);
        {
            SubLObject total_time_a = ZERO_INTEGER;
            SubLObject total_time_b = ZERO_INTEGER;
            SubLObject run = NIL;
            for (run = ZERO_INTEGER; run.numL(runs); run = add(run, ONE_INTEGER)) {
                {
                    SubLObject curr_time_a = NIL;
                    SubLObject curr_time_b = NIL;
                    cache_strategy_reset(strategy_a);
                    cache_strategy_reset(strategy_b);
                    Storage.gc(UNPROVIDED);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject cdolist_list_var = items_list;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                cache_strategy_track(strategy_b, item);
                            }
                        }
                        curr_time_b = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    total_time_b = add(total_time_b, curr_time_b);
                    Storage.gc(UNPROVIDED);
                    {
                        SubLObject time_var = get_internal_real_time();
                        {
                            SubLObject cdolist_list_var = items_list;
                            SubLObject item = NIL;
                            for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                                cache_strategy_track(strategy_a, item);
                            }
                        }
                        curr_time_a = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
                    }
                    total_time_a = add(total_time_a, curr_time_a);
                }
            }
            return values(total_time_b.numL(total_time_a) ? ((SubLObject) (strategy_b)) : strategy_a, total_time_a, total_time_b);
        }
    }

    @LispMethod(comment = "Take two strategies, ensure that they both behave the same way on the item list, then\r\nrerun them for timing comparison and return B if it beats A\r\n\r\n@param STRATEGY-A\r\n\t\tthe first candidate\r\n@param STRATEGY-B\r\n\t\tthe second candidate\r\n@param ITEMS-LIST\r\n\t\ta LISTP of items to add; must be comparable with the TESTFN\r\n\t\t(see also RANDOM-INTEGERS-FOR-TESTING-CACHES)\r\n@return 0 STRATEGY-B if faster than A, else Strategy-A\r\n@return 1 time for STRATEGY-A\r\n@return 2 time for STRATEGY-B\nTake two strategies, ensure that they both behave the same way on the item list, then\nrerun them for timing comparison and return B if it beats A")
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

    /**
     * Determine whether strategy B is faster than A, returning B if this is so and A otherwise.
     * The test uses a list of items that are generated by RANDOM-INTEGERS-FOR-TESTING-CACHES
     * from the capacity and factor values.
     *
     * @return 0 STRATEGY-B if faster than A, else Strategy-A
     * @return 1 time for STRATEGY-A
     * @return 2 time for STRATEGY-B
     */
    @LispMethod(comment = "Determine whether strategy B is faster than A, returning B if this is so and A otherwise.\r\nThe test uses a list of items that are generated by RANDOM-INTEGERS-FOR-TESTING-CACHES\r\nfrom the capacity and factor values.\r\n\r\n@return 0 STRATEGY-B if faster than A, else Strategy-A\r\n@return 1 time for STRATEGY-A\r\n@return 2 time for STRATEGY-B\nDetermine whether strategy B is faster than A, returning B if this is so and A otherwise.\nThe test uses a list of items that are generated by RANDOM-INTEGERS-FOR-TESTING-CACHES\nfrom the capacity and factor values.")
    public static final SubLObject determine_faster_cache_strategy_implementation_alt(SubLObject strategy_a, SubLObject strategy_b, SubLObject capacity, SubLObject factor, SubLObject runs) {
        if (runs == UNPROVIDED) {
            runs = ONE_INTEGER;
        }
        {
            SubLObject items_list = random_integers_for_testing_caches(capacity, factor);
            return faster_cache_strategy_implementation(strategy_a, strategy_b, items_list, runs);
        }
    }

    @LispMethod(comment = "Determine whether strategy B is faster than A, returning B if this is so and A otherwise.\r\nThe test uses a list of items that are generated by RANDOM-INTEGERS-FOR-TESTING-CACHES\r\nfrom the capacity and factor values.\r\n\r\n@return 0 STRATEGY-B if faster than A, else Strategy-A\r\n@return 1 time for STRATEGY-A\r\n@return 2 time for STRATEGY-B\nDetermine whether strategy B is faster than A, returning B if this is so and A otherwise.\nThe test uses a list of items that are generated by RANDOM-INTEGERS-FOR-TESTING-CACHES\nfrom the capacity and factor values.")
    public static SubLObject determine_faster_cache_strategy_implementation(final SubLObject strategy_a, final SubLObject strategy_b, final SubLObject capacity, final SubLObject factor, SubLObject runs) {
        if (runs == UNPROVIDED) {
            runs = ONE_INTEGER;
        }
        final SubLObject items_list = random_integers_for_testing_caches(capacity, factor);
        return faster_cache_strategy_implementation(strategy_a, strategy_b, items_list, runs);
    }

    /**
     * Generate a set of cache hits to evaluate cache performance.
     * We dont actually care about repeats, that's fine with us, so we dont
     * need to do the duplicate elimination of N-RANDOM-INTEGERS or the like.
     */
    @LispMethod(comment = "Generate a set of cache hits to evaluate cache performance.\r\nWe dont actually care about repeats, that\'s fine with us, so we dont\r\nneed to do the duplicate elimination of N-RANDOM-INTEGERS or the like.\nGenerate a set of cache hits to evaluate cache performance.\nWe dont actually care about repeats, that\'s fine with us, so we dont\nneed to do the duplicate elimination of N-RANDOM-INTEGERS or the like.")
    public static final SubLObject random_integers_for_testing_caches_alt(SubLObject capacity, SubLObject factor) {
        {
            SubLObject range = capacity;
            SubLObject numbers = make_list(multiply(capacity, factor), UNPROVIDED);
            SubLObject cursor = numbers;
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(factor); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject j = NIL;
                    for (j = ZERO_INTEGER; j.numL(capacity); j = add(j, ONE_INTEGER)) {
                        rplaca(cursor, random.random(range));
                        cursor = cursor.rest();
                    }
                }
                range = add(range, capacity);
            }
            return numbers;
        }
    }

    @LispMethod(comment = "Generate a set of cache hits to evaluate cache performance.\r\nWe dont actually care about repeats, that\'s fine with us, so we dont\r\nneed to do the duplicate elimination of N-RANDOM-INTEGERS or the like.\nGenerate a set of cache hits to evaluate cache performance.\nWe dont actually care about repeats, that\'s fine with us, so we dont\nneed to do the duplicate elimination of N-RANDOM-INTEGERS or the like.")
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

    public static final SubLObject cache_to_dictionary_alt(SubLObject v_cache) {
        SubLTrampolineFile.checkType(v_cache, CACHE_P);
        {
            SubLObject result = dictionary.new_dictionary(cache.cache_test(v_cache), cache.cache_size(v_cache));
            SubLObject cache_var = v_cache;
            SubLObject order_var = $NEWEST;
            SubLObject entry = cache.do_cache_first(cache_var, order_var);
            SubLObject key = NIL;
            SubLObject value = NIL;
            while (NIL == cache.do_cache_doneP(cache_var, entry)) {
                key = cache.do_cache_key(entry);
                value = cache.do_cache_value(entry);
                entry = cache.do_cache_next(entry, order_var);
                dictionary.dictionary_enter(result, key, value);
            } 
            return result;
        }
    }

    public static SubLObject cache_to_dictionary(final SubLObject v_cache) {
        assert NIL != cache.cache_p(v_cache) : "! cache.cache_p(v_cache) " + ("cache.cache_p(v_cache) " + "CommonSymbols.NIL != cache.cache_p(v_cache) ") + v_cache;
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
        declareFunction("cache_strategy_p", "CACHE-STRATEGY-P", 1, 0, false);
        declareFunction("cache_strategy_or_symbol_p", "CACHE-STRATEGY-OR-SYMBOL-P", 1, 0, false);
        declareFunction("cache_strategy_reset", "CACHE-STRATEGY-RESET", 1, 0, false);
        declareFunction("cache_strategy_cache_capacity", "CACHE-STRATEGY-CACHE-CAPACITY", 1, 0, false);
        declareFunction("cache_strategy_cache_size", "CACHE-STRATEGY-CACHE-SIZE", 1, 0, false);
        declareFunction("cache_strategy_cache_load", "CACHE-STRATEGY-CACHE-LOAD", 1, 0, false);
        declareFunction("cache_strategy_cache_full_p", "CACHE-STRATEGY-CACHE-FULL-P", 1, 0, false);
        declareFunction("cache_strategy_cache_empty_p", "CACHE-STRATEGY-CACHE-EMPTY-P", 1, 0, false);
        declareFunction("cache_strategy_track", "CACHE-STRATEGY-TRACK", 2, 0, false);
        declareFunction("cache_strategy_trackedP", "CACHE-STRATEGY-TRACKED?", 2, 0, false);
        declareFunction("cache_strategy_untrack", "CACHE-STRATEGY-UNTRACK", 2, 0, false);
        declareFunction("cache_strategy_note_cache_hit", "CACHE-STRATEGY-NOTE-CACHE-HIT", 1, 0, false);
        declareFunction("cache_strategy_note_cache_hits", "CACHE-STRATEGY-NOTE-CACHE-HITS", 2, 0, false);
        declareFunction("cache_strategy_note_cache_miss", "CACHE-STRATEGY-NOTE-CACHE-MISS", 1, 0, false);
        declareFunction("cache_strategy_supports_parameter_p", "CACHE-STRATEGY-SUPPORTS-PARAMETER-P", 2, 0, false);
        declareFunction("cache_strategy_get_parameter", "CACHE-STRATEGY-GET-PARAMETER", 2, 1, false);
        declareFunction("cache_strategy_set_parameter", "CACHE-STRATEGY-SET-PARAMETER", 3, 0, false);
        declareFunction("cache_strategy_note_reference", "CACHE-STRATEGY-NOTE-REFERENCE", 2, 0, false);
        declareFunction("cache_strategy_note_references_in_order", "CACHE-STRATEGY-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
        declareFunction("cache_strategy_get_metrics", "CACHE-STRATEGY-GET-METRICS", 1, 0, false);
        declareFunction("cache_strategy_reset_metrics", "CACHE-STRATEGY-RESET-METRICS", 1, 0, false);
        declareFunction("cache_strategy_gather_metrics", "CACHE-STRATEGY-GATHER-METRICS", 1, 0, false);
        declareFunction("cache_strategy_dont_gather_metrics", "CACHE-STRATEGY-DONT-GATHER-METRICS", 1, 0, false);
        declareFunction("cache_strategy_keeps_metrics_p", "CACHE-STRATEGY-KEEPS-METRICS-P", 1, 0, false);
        declareFunction("new_cache_strategy_tracked_content_iterator", "NEW-CACHE-STRATEGY-TRACKED-CONTENT-ITERATOR", 1, 0, false);
        declareFunction("map_cache_strategy_tracked_content", "MAP-CACHE-STRATEGY-TRACKED-CONTENT", 2, 0, false);
        declareFunction("cache_strategy_untrack_all", "CACHE-STRATEGY-UNTRACK-ALL", 2, 0, false);
        declareFunction("cache_strategy_method_not_implemented_for", "CACHE-STRATEGY-METHOD-NOT-IMPLEMENTED-FOR", 1, 0, false);
        declareFunction("cache_strategy_object_p", "CACHE-STRATEGY-OBJECT-P", 1, 0, false);
        declareFunction("cache_strategy_object_reset", "CACHE-STRATEGY-OBJECT-RESET", 1, 0, false);
        declareFunction("cache_strategy_object_cache_capacity", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY", 1, 0, false);
        declareFunction("cache_strategy_object_cache_size", "CACHE-STRATEGY-OBJECT-CACHE-SIZE", 1, 0, false);
        declareFunction("cache_strategy_object_track", "CACHE-STRATEGY-OBJECT-TRACK", 2, 0, false);
        declareFunction("cache_strategy_object_trackedP", "CACHE-STRATEGY-OBJECT-TRACKED?", 2, 0, false);
        declareFunction("cache_strategy_object_untrack", "CACHE-STRATEGY-OBJECT-UNTRACK", 2, 0, false);
        declareFunction("cache_strategy_object_supports_parameter_p", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false);
        declareFunction("cache_strategy_object_get_parameter", "CACHE-STRATEGY-OBJECT-GET-PARAMETER", 3, 0, false);
        declareFunction("cache_strategy_object_set_parameter", "CACHE-STRATEGY-OBJECT-SET-PARAMETER", 3, 0, false);
        declareFunction("cache_strategy_object_note_reference", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE", 2, 0, false);
        declareFunction("cache_strategy_object_note_references_in_order", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
        declareFunction("default_cache_strategy_object_note_references_in_order", "DEFAULT-CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
        declareFunction("cache_strategy_object_get_metrics", "CACHE-STRATEGY-OBJECT-GET-METRICS", 1, 0, false);
        declareFunction("cache_strategy_object_reset_metrics", "CACHE-STRATEGY-OBJECT-RESET-METRICS", 1, 0, false);
        declareFunction("cache_strategy_object_gather_metrics", "CACHE-STRATEGY-OBJECT-GATHER-METRICS", 2, 0, false);
        declareFunction("cache_strategy_object_dont_gather_metrics", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS", 1, 0, false);
        declareFunction("cache_strategy_object_keeps_metrics_p", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P", 1, 0, false);
        declareFunction("new_cache_strategy_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false);
        declareFunction("map_cache_strategy_object_tracked_content", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT", 2, 0, false);
        declareFunction("default_map_cache_strategy_object_tracked_content", "DEFAULT-MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT", 2, 0, false);
        declareFunction("cache_strategy_object_untrack_all", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL", 2, 0, false);
        declareFunction("default_cache_strategy_object_untrack_all", "DEFAULT-CACHE-STRATEGY-OBJECT-UNTRACK-ALL", 2, 0, false);
        declareFunction("cache_metrics_print_function_trampoline", "CACHE-METRICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cache_metrics_p", "CACHE-METRICS-P", 1, 0, false);
        new cache_utilities.$cache_metrics_p$UnaryFunction();
        declareFunction("cachemtr_hit_count", "CACHEMTR-HIT-COUNT", 1, 0, false);
        declareFunction("cachemtr_miss_count", "CACHEMTR-MISS-COUNT", 1, 0, false);
        declareFunction("_csetf_cachemtr_hit_count", "_CSETF-CACHEMTR-HIT-COUNT", 2, 0, false);
        declareFunction("_csetf_cachemtr_miss_count", "_CSETF-CACHEMTR-MISS-COUNT", 2, 0, false);
        declareFunction("make_cache_metrics", "MAKE-CACHE-METRICS", 0, 1, false);
        declareFunction("visit_defstruct_cache_metrics", "VISIT-DEFSTRUCT-CACHE-METRICS", 2, 0, false);
        declareFunction("visit_defstruct_object_cache_metrics_method", "VISIT-DEFSTRUCT-OBJECT-CACHE-METRICS-METHOD", 2, 0, false);
        declareFunction("print_cache_metrics", "PRINT-CACHE-METRICS", 3, 0, false);
        declareFunction("new_cache_metrics", "NEW-CACHE-METRICS", 0, 0, false);
        declareFunction("reset_cache_metrics_counts", "RESET-CACHE-METRICS-COUNTS", 1, 2, false);
        declareFunction("new_cache_metrics_with_counts", "NEW-CACHE-METRICS-WITH-COUNTS", 2, 0, false);
        declareFunction("cache_metrics_reset", "CACHE-METRICS-RESET", 1, 0, false);
        declareFunction("cache_metrics_note_hit", "CACHE-METRICS-NOTE-HIT", 1, 0, false);
        declareFunction("cache_metrics_note_miss", "CACHE-METRICS-NOTE-MISS", 1, 0, false);
        declareFunction("cache_metrics_hit_count", "CACHE-METRICS-HIT-COUNT", 1, 0, false);
        declareFunction("cache_metrics_miss_count", "CACHE-METRICS-MISS-COUNT", 1, 0, false);
        declareFunction("cache_metrics_hit_rate", "CACHE-METRICS-HIT-RATE", 1, 0, false);
        declareFunction("cache_metrics_miss_rate", "CACHE-METRICS-MISS-RATE", 1, 0, false);
        declareFunction("cache_metrics_cache_uses", "CACHE-METRICS-CACHE-USES", 1, 0, false);
        declareFunction("gather_cache_strategy_information", "GATHER-CACHE-STRATEGY-INFORMATION", 1, 0, false);
        declareFunction("cfasl_output_object_cache_metrics_method", "CFASL-OUTPUT-OBJECT-CACHE-METRICS-METHOD", 2, 0, false);
        declareFunction("cfasl_wide_output_cache_metrics", "CFASL-WIDE-OUTPUT-CACHE-METRICS", 2, 0, false);
        declareFunction("cfasl_output_cache_metrics_internal", "CFASL-OUTPUT-CACHE-METRICS-INTERNAL", 2, 0, false);
        declareFunction("cfasl_input_cache_metrics", "CFASL-INPUT-CACHE-METRICS", 1, 0, false);
        declareFunction("metered_cache_print_function_trampoline", "METERED-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("metered_cache_p", "METERED-CACHE-P", 1, 0, false);
        new cache_utilities.$metered_cache_p$UnaryFunction();
        declareFunction("mcache_cache", "MCACHE-CACHE", 1, 0, false);
        declareFunction("mcache_metrics", "MCACHE-METRICS", 1, 0, false);
        declareFunction("_csetf_mcache_cache", "_CSETF-MCACHE-CACHE", 2, 0, false);
        declareFunction("_csetf_mcache_metrics", "_CSETF-MCACHE-METRICS", 2, 0, false);
        declareFunction("make_metered_cache", "MAKE-METERED-CACHE", 0, 1, false);
        declareFunction("visit_defstruct_metered_cache", "VISIT-DEFSTRUCT-METERED-CACHE", 2, 0, false);
        declareFunction("visit_defstruct_object_metered_cache_method", "VISIT-DEFSTRUCT-OBJECT-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction("new_metered_cache", "NEW-METERED-CACHE", 1, 0, false);
        declareFunction("new_metered_preallocated_cache", "NEW-METERED-PREALLOCATED-CACHE", 1, 1, false);
        declareFunction("print_metered_cache", "PRINT-METERED-CACHE", 3, 0, false);
        declareFunction("cache_strategy_object_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-P-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_reset_metered_cache_method", "CACHE-STRATEGY-OBJECT-RESET-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_cache_capacity_metered_cache_method", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_cache_size_metered_cache_method", "CACHE-STRATEGY-OBJECT-CACHE-SIZE-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_track_metered_cache_method", "CACHE-STRATEGY-OBJECT-TRACK-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_trackedP_metered_cache_method", "CACHE-STRATEGY-OBJECT-TRACKED?-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_untrack_metered_cache_method", "CACHE-STRATEGY-OBJECT-UNTRACK-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_supports_parameter_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_get_parameter_metered_cache_method", "CACHE-STRATEGY-OBJECT-GET-PARAMETER-METERED-CACHE-METHOD", 3, 0, false);
        declareFunction("cache_strategy_object_set_parameter_metered_cache_method", "CACHE-STRATEGY-OBJECT-SET-PARAMETER-METERED-CACHE-METHOD", 3, 0, false);
        declareFunction("cache_strategy_object_note_reference_metered_cache_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_note_references_in_order_metered_cache_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_get_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-GET-METRICS-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_reset_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-RESET-METRICS-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_gather_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-GATHER-METRICS-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_dont_gather_metrics_metered_cache_method", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_keeps_metrics_p_metered_cache_method", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction("new_cache_strategy_object_tracked_content_iterator_metered_cache_method", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METERED-CACHE-METHOD", 1, 0, false);
        declareFunction("map_cache_strategy_object_tracked_content_metered_cache_method", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_untrack_all_metered_cache_method", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-METERED-CACHE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_mcache_object_reset", "CACHE-STRATEGY-MCACHE-OBJECT-RESET", 1, 0, false);
        declareFunction("cache_strategy_mcache_object_cache_capacity", "CACHE-STRATEGY-MCACHE-OBJECT-CACHE-CAPACITY", 1, 0, false);
        declareFunction("cache_strategy_mcache_object_track", "CACHE-STRATEGY-MCACHE-OBJECT-TRACK", 2, 0, false);
        declareFunction("cache_strategy_mcache_object_cache_size", "CACHE-STRATEGY-MCACHE-OBJECT-CACHE-SIZE", 1, 0, false);
        declareFunction("cache_strategy_mcache_object_trackedP", "CACHE-STRATEGY-MCACHE-OBJECT-TRACKED?", 2, 0, false);
        declareFunction("cache_strategy_mcache_object_untrack", "CACHE-STRATEGY-MCACHE-OBJECT-UNTRACK", 2, 0, false);
        declareFunction("cache_strategy_mcache_object_supports_parameter_p", "CACHE-STRATEGY-MCACHE-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false);
        declareFunction("cache_strategy_mcache_object_get_parameter", "CACHE-STRATEGY-MCACHE-OBJECT-GET-PARAMETER", 3, 0, false);
        declareFunction("cache_strategy_mcache_object_set_parameter", "CACHE-STRATEGY-MCACHE-OBJECT-SET-PARAMETER", 3, 0, false);
        declareFunction("cache_strategy_mcache_object_note_reference", "CACHE-STRATEGY-MCACHE-OBJECT-NOTE-REFERENCE", 2, 0, false);
        declareFunction("cache_strategy_mcache_object_note_references_in_order", "CACHE-STRATEGY-MCACHE-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
        declareFunction("cache_strategy_mcache_object_get_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-GET-METRICS", 1, 0, false);
        declareFunction("cache_strategy_mcache_object_reset_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-RESET-METRICS", 1, 0, false);
        declareFunction("cache_strategy_mcache_object_gather_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-GATHER-METRICS", 2, 0, false);
        declareFunction("cache_strategy_mcache_object_dont_gather_metrics", "CACHE-STRATEGY-MCACHE-OBJECT-DONT-GATHER-METRICS", 1, 0, false);
        declareFunction("cache_strategy_mcache_object_keeps_metrics_p", "CACHE-STRATEGY-MCACHE-OBJECT-KEEPS-METRICS-P", 1, 0, false);
        declareFunction("new_cache_strategy_mcache_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-MCACHE-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false);
        declareFunction("map_cache_strategy_mcache_object_tracked_content", "MAP-CACHE-STRATEGY-MCACHE-OBJECT-TRACKED-CONTENT", 2, 0, false);
        declareFunction("cache_strategy_mcache_object_untrack_all", "CACHE-STRATEGY-MCACHE-OBJECT-UNTRACK-ALL", 2, 0, false);
        declareFunction("recording_cache_strategy_facade_print_function_trampoline", "RECORDING-CACHE-STRATEGY-FACADE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("recording_cache_strategy_facade_p", "RECORDING-CACHE-STRATEGY-FACADE-P", 1, 0, false);
        new cache_utilities.$recording_cache_strategy_facade_p$UnaryFunction();
        declareFunction("rec_cachstrat_facade_cache_strategy", "REC-CACHSTRAT-FACADE-CACHE-STRATEGY", 1, 0, false);
        declareFunction("rec_cachstrat_facade_records", "REC-CACHSTRAT-FACADE-RECORDS", 1, 0, false);
        declareFunction("rec_cachstrat_facade_timestamper", "REC-CACHSTRAT-FACADE-TIMESTAMPER", 1, 0, false);
        declareFunction("_csetf_rec_cachstrat_facade_cache_strategy", "_CSETF-REC-CACHSTRAT-FACADE-CACHE-STRATEGY", 2, 0, false);
        declareFunction("_csetf_rec_cachstrat_facade_records", "_CSETF-REC-CACHSTRAT-FACADE-RECORDS", 2, 0, false);
        declareFunction("_csetf_rec_cachstrat_facade_timestamper", "_CSETF-REC-CACHSTRAT-FACADE-TIMESTAMPER", 2, 0, false);
        declareFunction("make_recording_cache_strategy_facade", "MAKE-RECORDING-CACHE-STRATEGY-FACADE", 0, 1, false);
        declareFunction("visit_defstruct_recording_cache_strategy_facade", "VISIT-DEFSTRUCT-RECORDING-CACHE-STRATEGY-FACADE", 2, 0, false);
        declareFunction("visit_defstruct_object_recording_cache_strategy_facade_method", "VISIT-DEFSTRUCT-OBJECT-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction("new_recording_cache_strategy_facade", "NEW-RECORDING-CACHE-STRATEGY-FACADE", 2, 0, false);
        declareFunction("recording_cache_strategy_facade_get_records", "RECORDING-CACHE-STRATEGY-FACADE-GET-RECORDS", 1, 0, false);
        declareFunction("recording_cache_strategy_facade_get_facaded_cache_strategy", "RECORDING-CACHE-STRATEGY-FACADE-GET-FACADED-CACHE-STRATEGY", 1, 0, false);
        declareFunction("recording_cache_strategy_facade_record_action", "RECORDING-CACHE-STRATEGY-FACADE-RECORD-ACTION", 3, 0, false);
        declareFunction("print_recording_cache_strategy_facade", "PRINT-RECORDING-CACHE-STRATEGY-FACADE", 3, 0, false);
        declareFunction("cache_strategy_object_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_reset_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-RESET-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_cache_capacity_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_cache_size_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-CACHE-SIZE-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_track_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-TRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_trackedP_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-TRACKED?-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_untrack_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-UNTRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_supports_parameter_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_get_parameter_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 3, 0, false);
        declareFunction("cache_strategy_object_set_parameter_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-SET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 3, 0, false);
        declareFunction("cache_strategy_object_note_reference_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_note_references_in_order_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_get_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_reset_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-RESET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_gather_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_dont_gather_metrics_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction("cache_strategy_object_keeps_metrics_p_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction("new_cache_strategy_object_tracked_content_iterator_recording_cache_strategy_facade_method", "NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 1, 0, false);
        declareFunction("map_cache_strategy_object_tracked_content_recording_cache_strategy_facade_method", "MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_object_untrack_all_recording_cache_strategy_facade_method", "CACHE-STRATEGY-OBJECT-UNTRACK-ALL-RECORDING-CACHE-STRATEGY-FACADE-METHOD", 2, 0, false);
        declareFunction("cache_strategy_rec_cache_object_cache_capacity", "CACHE-STRATEGY-REC-CACHE-OBJECT-CACHE-CAPACITY", 1, 0, false);
        declareFunction("cache_strategy_rec_cache_object_cache_size", "CACHE-STRATEGY-REC-CACHE-OBJECT-CACHE-SIZE", 1, 0, false);
        declareFunction("cache_strategy_rec_cache_object_dont_gather_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-DONT-GATHER-METRICS", 1, 0, false);
        declareFunction("cache_strategy_rec_cache_object_gather_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-GATHER-METRICS", 2, 0, false);
        declareFunction("cache_strategy_rec_cache_object_get_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-GET-METRICS", 1, 0, false);
        declareFunction("cache_strategy_rec_cache_object_get_parameter", "CACHE-STRATEGY-REC-CACHE-OBJECT-GET-PARAMETER", 3, 0, false);
        declareFunction("cache_strategy_rec_cache_object_keeps_metrics_p", "CACHE-STRATEGY-REC-CACHE-OBJECT-KEEPS-METRICS-P", 1, 0, false);
        declareFunction("cache_strategy_rec_cache_object_note_reference", "CACHE-STRATEGY-REC-CACHE-OBJECT-NOTE-REFERENCE", 2, 0, false);
        declareFunction("cache_strategy_rec_cache_object_note_references_in_order", "CACHE-STRATEGY-REC-CACHE-OBJECT-NOTE-REFERENCES-IN-ORDER", 2, 0, false);
        declareFunction("cache_strategy_rec_cache_object_reset", "CACHE-STRATEGY-REC-CACHE-OBJECT-RESET", 1, 0, false);
        declareFunction("cache_strategy_rec_cache_object_reset_metrics", "CACHE-STRATEGY-REC-CACHE-OBJECT-RESET-METRICS", 1, 0, false);
        declareFunction("cache_strategy_rec_cache_object_set_parameter", "CACHE-STRATEGY-REC-CACHE-OBJECT-SET-PARAMETER", 3, 0, false);
        declareFunction("cache_strategy_rec_cache_object_supports_parameter_p", "CACHE-STRATEGY-REC-CACHE-OBJECT-SUPPORTS-PARAMETER-P", 2, 0, false);
        declareFunction("cache_strategy_rec_cache_object_track", "CACHE-STRATEGY-REC-CACHE-OBJECT-TRACK", 2, 0, false);
        declareFunction("cache_strategy_rec_cache_object_trackedP", "CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED?", 2, 0, false);
        declareFunction("cache_strategy_rec_cache_object_untrack", "CACHE-STRATEGY-REC-CACHE-OBJECT-UNTRACK", 2, 0, false);
        declareFunction("cache_strategy_rec_cache_object_untrack_all", "CACHE-STRATEGY-REC-CACHE-OBJECT-UNTRACK-ALL", 2, 0, false);
        declareFunction("map_cache_strategy_rec_cache_object_tracked_content", "MAP-CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED-CONTENT", 2, 0, false);
        declareFunction("new_cache_strategy_rec_cache_object_tracked_content_iterator", "NEW-CACHE-STRATEGY-REC-CACHE-OBJECT-TRACKED-CONTENT-ITERATOR", 1, 0, false);
        declareFunction("test_mcache_strategy_implementation_conformance", "TEST-MCACHE-STRATEGY-IMPLEMENTATION-CONFORMANCE", 1, 0, false);
        declareFunction("test_cache_strategy_implementation_conformance", "TEST-CACHE-STRATEGY-IMPLEMENTATION-CONFORMANCE", 1, 0, false);
        declareFunction("test_two_cache_strategy_implementations", "TEST-TWO-CACHE-STRATEGY-IMPLEMENTATIONS", 3, 0, false);
        declareFunction("faster_cache_strategy_implementation", "FASTER-CACHE-STRATEGY-IMPLEMENTATION", 3, 1, false);
        declareFunction("determine_faster_cache_strategy_implementation", "DETERMINE-FASTER-CACHE-STRATEGY-IMPLEMENTATION", 4, 1, false);
        declareFunction("random_integers_for_testing_caches", "RANDOM-INTEGERS-FOR-TESTING-CACHES", 2, 0, false);
        declareFunction("cache_to_dictionary", "CACHE-TO-DICTIONARY", 1, 0, false);
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

    public static final SubLObject setup_cache_utilities_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cache_metrics$.getGlobalValue(), symbol_function(CACHE_METRICS_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CACHEMTR_HIT_COUNT, _CSETF_CACHEMTR_HIT_COUNT);
        def_csetf(CACHEMTR_MISS_COUNT, _CSETF_CACHEMTR_MISS_COUNT);
        identity(CACHE_METRICS);
        register_wide_cfasl_opcode_input_function($cfasl_wide_opcode_cache_metrics$.getGlobalValue(), CFASL_INPUT_CACHE_METRICS);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cache_metrics$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CACHE_METRICS_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(METERED_CACHE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(MCACHE_CACHE, _CSETF_MCACHE_CACHE);
        def_csetf(MCACHE_METRICS, _CSETF_MCACHE_METRICS);
        identity(METERED_CACHE);
        register_method($cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_P_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_RESET_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_CACHE_SIZE_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_TRACK_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function($sym52$CACHE_STRATEGY_OBJECT_TRACKED__METERED_CACHE_METHOD));
        register_method($cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_UNTRACK_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_GET_PARAMETER_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_SET_PARAMETER_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function($sym58$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_METERED_CACHE_METH));
        register_method($cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_GET_METRICS_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_RESET_METRICS_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_GATHER_METRICS_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_METERED_CACHE_METHOD));
        register_method($new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function($sym64$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_METERED_CACHE_));
        register_method($map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_METERED_CACHE_METHOD));
        register_method($cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_UNTRACK_ALL_METERED_CACHE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function(RECORDING_CACHE_STRATEGY_FACADE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(REC_CACHSTRAT_FACADE_CACHE_STRATEGY, _CSETF_REC_CACHSTRAT_FACADE_CACHE_STRATEGY);
        def_csetf(REC_CACHSTRAT_FACADE_RECORDS, _CSETF_REC_CACHSTRAT_FACADE_RECORDS);
        def_csetf(REC_CACHSTRAT_FACADE_TIMESTAMPER, _CSETF_REC_CACHSTRAT_FACADE_TIMESTAMPER);
        identity(RECORDING_CACHE_STRATEGY_FACADE);
        register_method($cache_strategy_object_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function(CACHE_STRATEGY_OBJECT_P_RECORDING_CACHE_STRATEGY_FACADE_METHOD));
        register_method($cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym87$CACHE_STRATEGY_OBJECT_RESET_RECORDING_CACHE_STRATEGY_FACADE_METHO));
        register_method($cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym88$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_RECORDING_CACHE_STRATEGY_FAC));
        register_method($cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym89$CACHE_STRATEGY_OBJECT_CACHE_SIZE_RECORDING_CACHE_STRATEGY_FACADE_));
        register_method($cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym90$CACHE_STRATEGY_OBJECT_TRACK_RECORDING_CACHE_STRATEGY_FACADE_METHO));
        register_method($cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym91$CACHE_STRATEGY_OBJECT_TRACKED__RECORDING_CACHE_STRATEGY_FACADE_ME));
        register_method($cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym92$CACHE_STRATEGY_OBJECT_UNTRACK_RECORDING_CACHE_STRATEGY_FACADE_MET));
        register_method($cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym93$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_RECORDING_CACHE_STRATE));
        register_method($cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym94$CACHE_STRATEGY_OBJECT_GET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA));
        register_method($cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym95$CACHE_STRATEGY_OBJECT_SET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA));
        register_method($cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym96$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_RECORDING_CACHE_STRATEGY_FAC));
        register_method($cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym97$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_RECORDING_CACHE_ST));
        register_method($cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym98$CACHE_STRATEGY_OBJECT_GET_METRICS_RECORDING_CACHE_STRATEGY_FACADE));
        register_method($cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym99$CACHE_STRATEGY_OBJECT_RESET_METRICS_RECORDING_CACHE_STRATEGY_FACA));
        register_method($cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym100$CACHE_STRATEGY_OBJECT_GATHER_METRICS_RECORDING_CACHE_STRATEGY_FAC));
        register_method($cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym101$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_RECORDING_CACHE_STRATEG));
        register_method($cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym102$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_RECORDING_CACHE_STRATEGY_FA));
        register_method($new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym103$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_RECORDING_CACH));
        register_method($map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym104$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_RECORDING_CACHE_STRATEG));
        register_method($cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym105$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_RECORDING_CACHE_STRATEGY_FACADE));
        define_test_case_table_int(TEST_MCACHE_STRATEGY_IMPLEMENTATION_CONFORMANCE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt117);
        return NIL;
    }

    public static SubLObject setup_cache_utilities_file() {
        if (SubLFiles.USE_V1) {
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
        }
        if (SubLFiles.USE_V2) {
            register_method($cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function($sym52$CACHE_STRATEGY_OBJECT_TRACKED__METERED_CACHE_METHOD));
            register_method($cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function($sym58$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_METERED_CACHE_METH));
            register_method($new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_metered_cache$.getGlobalValue(), symbol_function($sym64$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_METERED_CACHE_));
            register_method($cache_strategy_object_reset_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym87$CACHE_STRATEGY_OBJECT_RESET_RECORDING_CACHE_STRATEGY_FACADE_METHO));
            register_method($cache_strategy_object_cache_capacity_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym88$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_RECORDING_CACHE_STRATEGY_FAC));
            register_method($cache_strategy_object_cache_size_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym89$CACHE_STRATEGY_OBJECT_CACHE_SIZE_RECORDING_CACHE_STRATEGY_FACADE_));
            register_method($cache_strategy_object_track_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym90$CACHE_STRATEGY_OBJECT_TRACK_RECORDING_CACHE_STRATEGY_FACADE_METHO));
            register_method($cache_strategy_object_trackedP_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym91$CACHE_STRATEGY_OBJECT_TRACKED__RECORDING_CACHE_STRATEGY_FACADE_ME));
            register_method($cache_strategy_object_untrack_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym92$CACHE_STRATEGY_OBJECT_UNTRACK_RECORDING_CACHE_STRATEGY_FACADE_MET));
            register_method($cache_strategy_object_supports_parameter_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym93$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_RECORDING_CACHE_STRATE));
            register_method($cache_strategy_object_get_parameter_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym94$CACHE_STRATEGY_OBJECT_GET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA));
            register_method($cache_strategy_object_set_parameter_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym95$CACHE_STRATEGY_OBJECT_SET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA));
            register_method($cache_strategy_object_note_reference_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym96$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_RECORDING_CACHE_STRATEGY_FAC));
            register_method($cache_strategy_object_note_references_in_order_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym97$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_RECORDING_CACHE_ST));
            register_method($cache_strategy_object_get_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym98$CACHE_STRATEGY_OBJECT_GET_METRICS_RECORDING_CACHE_STRATEGY_FACADE));
            register_method($cache_strategy_object_reset_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym99$CACHE_STRATEGY_OBJECT_RESET_METRICS_RECORDING_CACHE_STRATEGY_FACA));
            register_method($cache_strategy_object_gather_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym100$CACHE_STRATEGY_OBJECT_GATHER_METRICS_RECORDING_CACHE_STRATEGY_FAC));
            register_method($cache_strategy_object_dont_gather_metrics_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym101$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_RECORDING_CACHE_STRATEG));
            register_method($cache_strategy_object_keeps_metrics_p_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym102$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_RECORDING_CACHE_STRATEGY_FA));
            register_method($new_cache_strategy_object_tracked_content_iterator_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym103$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_RECORDING_CACH));
            register_method($map_cache_strategy_object_tracked_content_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym104$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_RECORDING_CACHE_STRATEG));
            register_method($cache_strategy_object_untrack_all_method_table$.getGlobalValue(), $dtp_recording_cache_strategy_facade$.getGlobalValue(), symbol_function($sym105$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_RECORDING_CACHE_STRATEGY_FACADE));
            define_test_case_table_int(TEST_MCACHE_STRATEGY_IMPLEMENTATION_CONFORMANCE, list(new SubLObject[]{ $TEST, NIL, $OWNER, $$$rck, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt117);
        }
        return NIL;
    }

    public static SubLObject setup_cache_utilities_file_Previous() {
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

    static private final SubLString $str_alt4$Not_implemented_for__A_ = makeString("Not implemented for ~A.");

    static private final SubLList $list_alt8 = list(makeSymbol("HIT-COUNT"), makeSymbol("MISS-COUNT"));

    static private final SubLList $list_alt9 = list(makeKeyword("HIT-COUNT"), makeKeyword("MISS-COUNT"));

    static private final SubLList $list_alt10 = list(makeSymbol("CACHEMTR-HIT-COUNT"), makeSymbol("CACHEMTR-MISS-COUNT"));

    static private final SubLList $list_alt11 = list(makeSymbol("_CSETF-CACHEMTR-HIT-COUNT"), makeSymbol("_CSETF-CACHEMTR-MISS-COUNT"));

    @Override
    public void declareFunctions() {
        declare_cache_utilities_file();
    }

    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    @Override
    public void initializeVariables() {
        init_cache_utilities_file();
    }

    static private final SubLString $str_alt21$__ = makeString("#<");

    @Override
    public void runTopLevelForms() {
        setup_cache_utilities_file();
    }

    static private final SubLString $str_alt23$Hits__ = makeString("Hits: ");

    

    static private final SubLString $str_alt24$_Misses__ = makeString(" Misses: ");

    public static final class $cache_metrics_native extends SubLStructNative {
        public SubLObject $hit_count;

        public SubLObject $miss_count;

        private static final SubLStructDeclNative structDecl;

        public $cache_metrics_native() {
            cache_utilities.$cache_metrics_native.this.$hit_count = Lisp.NIL;
            cache_utilities.$cache_metrics_native.this.$miss_count = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return cache_utilities.$cache_metrics_native.this.$hit_count;
        }

        @Override
        public SubLObject getField3() {
            return cache_utilities.$cache_metrics_native.this.$miss_count;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return cache_utilities.$cache_metrics_native.this.$hit_count = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return cache_utilities.$cache_metrics_native.this.$miss_count = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cache_utilities.$cache_metrics_native.class, CACHE_METRICS, CACHE_METRICS_P, $list8, $list9, new String[]{ "$hit_count", "$miss_count" }, $list10, $list11, PRINT_CACHE_METRICS);
        }
    }

    static private final SubLList $list_alt32 = list(makeSymbol("CACHE"), makeSymbol("METRICS"));

    static private final SubLList $list_alt33 = list(makeKeyword("CACHE"), makeKeyword("METRICS"));

    static private final SubLList $list_alt34 = list(makeSymbol("MCACHE-CACHE"), makeSymbol("MCACHE-METRICS"));

    static private final SubLList $list_alt35 = list(makeSymbol("_CSETF-MCACHE-CACHE"), makeSymbol("_CSETF-MCACHE-METRICS"));

    public static final class $cache_metrics_p$UnaryFunction extends UnaryFunction {
        public $cache_metrics_p$UnaryFunction() {
            super(extractFunctionNamed("CACHE-METRICS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return cache_metrics_p(arg1);
        }
    }

    static private final SubLString $str_alt44$Cache__ = makeString("Cache: ");

    static private final SubLString $str_alt45$_ = makeString(" ");

    static private final SubLString $str_alt46$_no_metrics_ = makeString("(no metrics)");

    public static final class $metered_cache_native extends SubLStructNative {
        public SubLObject $cache;

        public SubLObject $metrics;

        private static final SubLStructDeclNative structDecl;

        public $metered_cache_native() {
            cache_utilities.$metered_cache_native.this.$cache = Lisp.NIL;
            cache_utilities.$metered_cache_native.this.$metrics = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return cache_utilities.$metered_cache_native.this.$cache;
        }

        @Override
        public SubLObject getField3() {
            return cache_utilities.$metered_cache_native.this.$metrics;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return cache_utilities.$metered_cache_native.this.$cache = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return cache_utilities.$metered_cache_native.this.$metrics = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.cache_utilities.$metered_cache_native.class, METERED_CACHE, METERED_CACHE_P, $list35, $list36, new String[]{ "$cache", "$metrics" }, $list37, $list38, PRINT_METERED_CACHE);
        }
    }

    static private final SubLSymbol $sym52$CACHE_STRATEGY_OBJECT_TRACKED__METERED_CACHE_METHOD = makeSymbol("CACHE-STRATEGY-OBJECT-TRACKED?-METERED-CACHE-METHOD");

    public static final class $metered_cache_p$UnaryFunction extends UnaryFunction {
        public $metered_cache_p$UnaryFunction() {
            super(extractFunctionNamed("METERED-CACHE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return metered_cache_p(arg1);
        }
    }

    static private final SubLSymbol $sym58$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_METERED_CACHE_METH = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-METERED-CACHE-METHOD");

    static private final SubLSymbol $sym64$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_METERED_CACHE_ = makeSymbol("NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-METERED-CACHE-METHOD");

    public static final class $recording_cache_strategy_facade_p$UnaryFunction extends UnaryFunction {
        public $recording_cache_strategy_facade_p$UnaryFunction() {
            super(extractFunctionNamed("RECORDING-CACHE-STRATEGY-FACADE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return recording_cache_strategy_facade_p(arg1);
        }
    }

    static private final SubLList $list_alt69 = list(makeSymbol("CACHE-STRATEGY"), makeSymbol("RECORDS"), makeSymbol("TIMESTAMPER"));

    static private final SubLList $list_alt70 = list(makeKeyword("CACHE-STRATEGY"), makeKeyword("RECORDS"), makeKeyword("TIMESTAMPER"));

    static private final SubLList $list_alt71 = list(makeSymbol("REC-CACHSTRAT-FACADE-CACHE-STRATEGY"), makeSymbol("REC-CACHSTRAT-FACADE-RECORDS"), makeSymbol("REC-CACHSTRAT-FACADE-TIMESTAMPER"));

    static private final SubLList $list_alt72 = list(makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-CACHE-STRATEGY"), makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-RECORDS"), makeSymbol("_CSETF-REC-CACHSTRAT-FACADE-TIMESTAMPER"));

    static private final SubLString $str_alt85$_wrapped__ = makeString(" wrapped: ");

    static private final SubLSymbol $sym87$CACHE_STRATEGY_OBJECT_RESET_RECORDING_CACHE_STRATEGY_FACADE_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym88$CACHE_STRATEGY_OBJECT_CACHE_CAPACITY_RECORDING_CACHE_STRATEGY_FAC = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-CAPACITY-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym89$CACHE_STRATEGY_OBJECT_CACHE_SIZE_RECORDING_CACHE_STRATEGY_FACADE_ = makeSymbol("CACHE-STRATEGY-OBJECT-CACHE-SIZE-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym90$CACHE_STRATEGY_OBJECT_TRACK_RECORDING_CACHE_STRATEGY_FACADE_METHO = makeSymbol("CACHE-STRATEGY-OBJECT-TRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym91$CACHE_STRATEGY_OBJECT_TRACKED__RECORDING_CACHE_STRATEGY_FACADE_ME = makeSymbol("CACHE-STRATEGY-OBJECT-TRACKED?-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym92$CACHE_STRATEGY_OBJECT_UNTRACK_RECORDING_CACHE_STRATEGY_FACADE_MET = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym93$CACHE_STRATEGY_OBJECT_SUPPORTS_PARAMETER_P_RECORDING_CACHE_STRATE = makeSymbol("CACHE-STRATEGY-OBJECT-SUPPORTS-PARAMETER-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym94$CACHE_STRATEGY_OBJECT_GET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA = makeSymbol("CACHE-STRATEGY-OBJECT-GET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym95$CACHE_STRATEGY_OBJECT_SET_PARAMETER_RECORDING_CACHE_STRATEGY_FACA = makeSymbol("CACHE-STRATEGY-OBJECT-SET-PARAMETER-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym96$CACHE_STRATEGY_OBJECT_NOTE_REFERENCE_RECORDING_CACHE_STRATEGY_FAC = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCE-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym97$CACHE_STRATEGY_OBJECT_NOTE_REFERENCES_IN_ORDER_RECORDING_CACHE_ST = makeSymbol("CACHE-STRATEGY-OBJECT-NOTE-REFERENCES-IN-ORDER-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym98$CACHE_STRATEGY_OBJECT_GET_METRICS_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol("CACHE-STRATEGY-OBJECT-GET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym99$CACHE_STRATEGY_OBJECT_RESET_METRICS_RECORDING_CACHE_STRATEGY_FACA = makeSymbol("CACHE-STRATEGY-OBJECT-RESET-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym100$CACHE_STRATEGY_OBJECT_GATHER_METRICS_RECORDING_CACHE_STRATEGY_FAC = makeSymbol("CACHE-STRATEGY-OBJECT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym101$CACHE_STRATEGY_OBJECT_DONT_GATHER_METRICS_RECORDING_CACHE_STRATEG = makeSymbol("CACHE-STRATEGY-OBJECT-DONT-GATHER-METRICS-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym102$CACHE_STRATEGY_OBJECT_KEEPS_METRICS_P_RECORDING_CACHE_STRATEGY_FA = makeSymbol("CACHE-STRATEGY-OBJECT-KEEPS-METRICS-P-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym103$NEW_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_ITERATOR_RECORDING_CACH = makeSymbol("NEW-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-ITERATOR-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym104$MAP_CACHE_STRATEGY_OBJECT_TRACKED_CONTENT_RECORDING_CACHE_STRATEG = makeSymbol("MAP-CACHE-STRATEGY-OBJECT-TRACKED-CONTENT-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLSymbol $sym105$CACHE_STRATEGY_OBJECT_UNTRACK_ALL_RECORDING_CACHE_STRATEGY_FACADE = makeSymbol("CACHE-STRATEGY-OBJECT-UNTRACK-ALL-RECORDING-CACHE-STRATEGY-FACADE-METHOD");

    static private final SubLString $$$rck = makeString("rck");

    static private final SubLList $list_alt117 = list(list(list(TEN_INTEGER), makeKeyword("SUCCESS")), list(list(TWENTY_INTEGER), makeKeyword("SUCCESS")), list(list(makeInteger(50)), makeKeyword("SUCCESS")));

    static private final SubLString $str_alt118$Cannot_properly_validate_dirty_ca = makeString("Cannot properly validate dirty cache strategy ~A.");

    static private final SubLString $str_alt119$Strategy__A_is_tracking_item__A_b = makeString("Strategy ~A is tracking item ~A before it is added.");

    static private final SubLString $str_alt120$Strategy__A_is_suggesting_to_remo = makeString("Strategy ~A is suggesting to remove item ~A before the cache is full.");

    static private final SubLString $str_alt121$Strategy__A_is_not_tracking_item_ = makeString("Strategy ~A is not tracking item ~A that was just added.");

    static private final SubLString $str_alt122$After_adding__A_items_to_an_empty = makeString("After adding ~A items to an empty cache, the cache contains ~A items.");

    static private final SubLString $str_alt123$The_strategy__A_does_not_implemen = makeString("The strategy ~A does not implement FULL-P correctly.");

    static private final SubLString $str_alt124$Strategy__A_is_tracking_item__A_t = makeString("Strategy ~A is tracking item ~A though it is no longer present.");

    static private final SubLString $str_alt125$After_removing__A_items_from_a_fu = makeString("After removing ~A items from a full cache, the cache still contains ~A items.");

    static private final SubLString $str_alt126$The_strategy__A_is_not_implementi = makeString("The strategy ~A is not implementing EMPTY-P correctly.");

    static private final SubLString $str_alt128$The_two_strategies_disagree_on_th = makeString("The two strategies disagree on the result of adding item #~A (~A).~%~A gives ~A, ~A gives ~A.");
}

/**
 * Total time: 477 ms
 */
