package com.cyc.cycjava.cycl.sbhl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.groundP;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.date_utilities;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.map_utilities;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.time_interval_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sbhl_time_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new sbhl_time_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sbhl.sbhl_time_utilities";

    public static final String myFingerPrint = "ee452d1fbbfe562ac0d24a92f18b34b8f0a06d5aafffac613167125d9a95844a";

    // deflexical
    // Definitions
    /**
     * A representative sample of the KB constants that time reasoning depends on.
     */
    private static final SubLSymbol $time_core_constants$ = makeSymbol("*TIME-CORE-CONSTANTS*");









    // defconstant
    public static final SubLSymbol $dtp_hl_start$ = makeSymbol("*DTP-HL-START*");

    // defconstant
    public static final SubLSymbol $dtp_hl_end$ = makeSymbol("*DTP-HL-END*");

    // Internal Constants
    public static final SubLList $list0 = list(reader_make_constant_shell(makeString("weak-HL-TimePrecedence")), reader_make_constant_shell(makeString("strict-HL-TimePrecedence")), reader_make_constant_shell(makeString("successorStrict-HL-TimePrecedence")), reader_make_constant_shell(makeString("weakSuccessor-HL-TimePrecedence")));

    public static final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    public static final SubLSymbol $hl_start_table_lock$ = makeSymbol("*HL-START-TABLE-LOCK*");

    public static final SubLString $str3$_hl_start_table_lock_ = makeString("*hl-start-table-lock*");

    public static final SubLSymbol $hl_start_table$ = makeSymbol("*HL-START-TABLE*");



    public static final SubLSymbol $hl_end_table_lock$ = makeSymbol("*HL-END-TABLE-LOCK*");

    public static final SubLString $str7$_hl_end_table_lock_ = makeString("*hl-end-table-lock*");

    public static final SubLSymbol $hl_end_table$ = makeSymbol("*HL-END-TABLE*");

    public static final SubLSymbol HL_START = makeSymbol("HL-START");

    public static final SubLSymbol HL_START_P = makeSymbol("HL-START-P");

    public static final SubLList $list11 = list(makeSymbol("INTERVAL"));

    public static final SubLList $list12 = list(makeKeyword("INTERVAL"));

    public static final SubLList $list13 = list(makeSymbol("HL-START-INTERVAL"));

    public static final SubLList $list14 = list(makeSymbol("_CSETF-HL-START-INTERVAL"));

    public static final SubLSymbol PRINT_HL_ENDPOINT = makeSymbol("PRINT-HL-ENDPOINT");

    public static final SubLSymbol HL_START_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HL-START-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list17 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HL-START-P"));

    private static final SubLSymbol HL_START_INTERVAL = makeSymbol("HL-START-INTERVAL");

    private static final SubLSymbol _CSETF_HL_START_INTERVAL = makeSymbol("_CSETF-HL-START-INTERVAL");



    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_HL_START = makeSymbol("MAKE-HL-START");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HL_START_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HL-START-METHOD");

    private static final SubLSymbol SXHASH_HL_START_METHOD = makeSymbol("SXHASH-HL-START-METHOD");

    private static final SubLSymbol HL_END = makeSymbol("HL-END");

    private static final SubLSymbol HL_END_P = makeSymbol("HL-END-P");

    private static final SubLList $list30 = list(makeSymbol("HL-END-INTERVAL"));

    private static final SubLList $list31 = list(makeSymbol("_CSETF-HL-END-INTERVAL"));

    private static final SubLSymbol HL_END_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("HL-END-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list33 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("HL-END-P"));

    private static final SubLSymbol HL_END_INTERVAL = makeSymbol("HL-END-INTERVAL");

    private static final SubLSymbol _CSETF_HL_END_INTERVAL = makeSymbol("_CSETF-HL-END-INTERVAL");

    private static final SubLSymbol MAKE_HL_END = makeSymbol("MAKE-HL-END");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_HL_END_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-HL-END-METHOD");

    private static final SubLSymbol SXHASH_HL_END_METHOD = makeSymbol("SXHASH-HL-END-METHOD");

    private static final SubLString $str39$_a = makeString("~a");

    private static final SubLString $str40$_a_is_not_a_valid_endpoint_p_ = makeString("~a is not a valid endpoint-p.");

    private static final SubLSymbol HL_ENDPOINT_P = makeSymbol("HL-ENDPOINT-P");

    private static final SubLList $list42 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));







    private static final SubLObject $$SomeTimeInIntervalFn = reader_make_constant_shell(makeString("SomeTimeInIntervalFn"));

    private static final SubLObject $$TimeIntervalInclusiveFn = reader_make_constant_shell(makeString("TimeIntervalInclusiveFn"));

    private static final SubLObject $$TimeIntervalBetweenFn = reader_make_constant_shell(makeString("TimeIntervalBetweenFn"));

    private static final SubLObject $$StartFn = reader_make_constant_shell(makeString("StartFn"));

    private static final SubLObject $$EndFn = reader_make_constant_shell(makeString("EndFn"));

    private static final SubLObject $$IntervalStartedByFn = reader_make_constant_shell(makeString("IntervalStartedByFn"));

    private static final SubLObject $$IntervalStartedByFn_Inclusive = reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive"));

    private static final SubLObject $$IntervalEndedByFn = reader_make_constant_shell(makeString("IntervalEndedByFn"));

    private static final SubLObject $$IntervalEndedByFn_Inclusive = reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive"));

    private static final SubLList $list55 = list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), reader_make_constant_shell(makeString("StartFn")), reader_make_constant_shell(makeString("EndFn")), reader_make_constant_shell(makeString("IntervalEndedByFn")), reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")), reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")));

    private static final SubLList $list56 = list(reader_make_constant_shell(makeString("TimeIntervalInclusiveFn")), reader_make_constant_shell(makeString("StartFn")), reader_make_constant_shell(makeString("EndFn")), reader_make_constant_shell(makeString("IntervalStartedByFn")), reader_make_constant_shell(makeString("IntervalStartedByFn-Inclusive")), reader_make_constant_shell(makeString("IntervalEndedByFn-Inclusive")));

    private static final SubLObject $$MilliSecondFn = reader_make_constant_shell(makeString("MilliSecondFn"));

    private static final SubLInteger $int$999 = makeInteger(999);

    private static final SubLObject $$SecondFn = reader_make_constant_shell(makeString("SecondFn"));

    private static final SubLInteger $int$59 = makeInteger(59);

    private static final SubLObject $$MinuteFn = reader_make_constant_shell(makeString("MinuteFn"));

    private static final SubLObject $$HourFn = reader_make_constant_shell(makeString("HourFn"));

    private static final SubLInteger $int$23 = makeInteger(23);

    private static final SubLObject $$DayFn = reader_make_constant_shell(makeString("DayFn"));

    private static final SubLInteger $int$31 = makeInteger(31);

    private static final SubLObject $$MonthFn = reader_make_constant_shell(makeString("MonthFn"));

    private static final SubLObject $$YearFn = reader_make_constant_shell(makeString("YearFn"));

    private static final SubLObject $$QuarterFn = reader_make_constant_shell(makeString("QuarterFn"));

    private static final SubLObject $$DecadeFn = reader_make_constant_shell(makeString("DecadeFn"));

    private static final SubLObject $$CenturyFn = reader_make_constant_shell(makeString("CenturyFn"));

    private static final SubLObject $$weak_HL_TimePrecedence = reader_make_constant_shell(makeString("weak-HL-TimePrecedence"));

    private static final SubLList $list72 = list(makeSymbol("NODE"), makeSymbol("LINK"));

    public static SubLObject initialize_time_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $time_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_time_kb_loaded();
        } else {
            kb_control_vars.unset_time_kb_loaded();
        }
        return kb_control_vars.time_kb_loaded_p();
    }

    public static SubLObject initialize_hl_endpoint_tables() {
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_start_table_lock$.getGlobalValue());
            $hl_start_table$.setGlobalValue(make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($hl_start_table_lock$.getGlobalValue());
            }
        }
        release = NIL;
        try {
            release = seize_lock($hl_end_table_lock$.getGlobalValue());
            $hl_end_table$.setGlobalValue(make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($hl_end_table_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject hl_start_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_hl_endpoint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject hl_start_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$hl_start_native.class ? T : NIL;
    }

    public static SubLObject hl_start_interval(final SubLObject v_object) {
        assert NIL != hl_start_p(v_object) : "sbhl_time_utilities.hl_start_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_hl_start_interval(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_start_p(v_object) : "sbhl_time_utilities.hl_start_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_hl_start(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $hl_start_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INTERVAL)) {
                _csetf_hl_start_interval(v_new, current_value);
            } else {
                Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_hl_start(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HL_START, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INTERVAL, hl_start_interval(obj));
        funcall(visitor_fn, obj, $END, MAKE_HL_START, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_hl_start_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_hl_start(obj, visitor_fn);
    }

    public static SubLObject sxhash_hl_start_method(final SubLObject v_object) {
        return Sxhash.sxhash(hl_start_interval(v_object));
    }

    public static SubLObject hl_end_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_hl_endpoint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject hl_end_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$hl_end_native.class ? T : NIL;
    }

    public static SubLObject hl_end_interval(final SubLObject v_object) {
        assert NIL != hl_end_p(v_object) : "sbhl_time_utilities.hl_end_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject _csetf_hl_end_interval(final SubLObject v_object, final SubLObject value) {
        assert NIL != hl_end_p(v_object) : "sbhl_time_utilities.hl_end_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject make_hl_end(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $hl_end_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($INTERVAL)) {
                _csetf_hl_end_interval(v_new, current_value);
            } else {
                Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    public static SubLObject visit_defstruct_hl_end(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_HL_END, ONE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $INTERVAL, hl_end_interval(obj));
        funcall(visitor_fn, obj, $END, MAKE_HL_END, ONE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_hl_end_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_hl_end(obj, visitor_fn);
    }

    public static SubLObject sxhash_hl_end_method(final SubLObject v_object) {
        return Sxhash.sxhash(hl_end_interval(v_object));
    }

    public static SubLObject print_hl_endpoint(final SubLObject hl_endpoint, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(hl_endpoint, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, hl_endpoint, T, T);
            format(stream, $str39$_a, hl_interval_of_endpoint(hl_endpoint));
            print_macros.print_unreadable_object_postamble(stream, hl_endpoint, T, T);
        }
        return NIL;
    }

    public static SubLObject new_hl_start(final SubLObject interval) {
        final SubLObject hl_start = make_hl_start(UNPROVIDED);
        _csetf_hl_start_interval(hl_start, interval);
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_start_table_lock$.getGlobalValue());
            sethash(interval, $hl_start_table$.getGlobalValue(), hl_start);
        } finally {
            if (NIL != release) {
                release_lock($hl_start_table_lock$.getGlobalValue());
            }
        }
        return hl_start;
    }

    public static SubLObject new_hl_end(final SubLObject interval) {
        final SubLObject hl_end = make_hl_end(UNPROVIDED);
        _csetf_hl_end_interval(hl_end, interval);
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_end_table_lock$.getGlobalValue());
            sethash(interval, $hl_end_table$.getGlobalValue(), hl_end);
        } finally {
            if (NIL != release) {
                release_lock($hl_end_table_lock$.getGlobalValue());
            }
        }
        return hl_end;
    }

    public static SubLObject hl_endpoint_p(final SubLObject v_object) {
        return makeBoolean((NIL != hl_start_p(v_object)) || (NIL != hl_end_p(v_object)));
    }

    public static SubLObject sbhl_time_node_object_p(final SubLObject v_object) {
        return hl_endpoint_p(v_object);
    }

    public static SubLObject hl_interval_of_endpoint(final SubLObject endpoint) {
        if (NIL != hl_start_p(endpoint)) {
            return hl_start_interval(endpoint);
        }
        if (NIL != hl_end_p(endpoint)) {
            return hl_end_interval(endpoint);
        }
        sbhl_paranoia.sbhl_error($str40$_a_is_not_a_valid_endpoint_p_, endpoint, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject find_hl_start(final SubLObject time) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_start_table_lock$.getGlobalValue());
            result = gethash(time, $hl_start_table$.getGlobalValue(), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($hl_start_table_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject find_hl_end(final SubLObject time) {
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_end_table_lock$.getGlobalValue());
            result = gethash(time, $hl_end_table$.getGlobalValue(), UNPROVIDED);
        } finally {
            if (NIL != release) {
                release_lock($hl_end_table_lock$.getGlobalValue());
            }
        }
        return result;
    }

    public static SubLObject remove_hl_start(final SubLObject time, SubLObject hl_start) {
        if (hl_start == UNPROVIDED) {
            hl_start = NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_start_table_lock$.getGlobalValue());
            if (NIL == hl_start) {
                hl_start = gethash(time, $hl_start_table$.getGlobalValue(), UNPROVIDED);
            }
            remhash(time, $hl_start_table$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($hl_start_table_lock$.getGlobalValue());
            }
        }
        remove_hl_endpoint_backpointers(hl_start);
        return NIL;
    }

    public static SubLObject remove_hl_end(final SubLObject time, SubLObject hl_end) {
        if (hl_end == UNPROVIDED) {
            hl_end = NIL;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_end_table_lock$.getGlobalValue());
            if (NIL == hl_end) {
                hl_end = gethash(time, $hl_end_table$.getGlobalValue(), UNPROVIDED);
            }
            remhash(time, $hl_end_table$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($hl_end_table_lock$.getGlobalValue());
            }
        }
        remove_hl_endpoint_backpointers(hl_end);
        return NIL;
    }

    public static SubLObject remove_hl_endpoint(final SubLObject point) {
        assert NIL != hl_endpoint_p(point) : "sbhl_time_utilities.hl_endpoint_p(point) " + "CommonSymbols.NIL != sbhl_time_utilities.hl_endpoint_p(point) " + point;
        if (NIL != hl_start_p(point)) {
            remove_hl_start(hl_interval_of_endpoint(point), UNPROVIDED);
        } else {
            remove_hl_end(hl_interval_of_endpoint(point), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject remove_hl_endpoint_backpointers(final SubLObject point) {
        assert NIL != hl_endpoint_p(point) : "sbhl_time_utilities.hl_endpoint_p(point) " + "CommonSymbols.NIL != sbhl_time_utilities.hl_endpoint_p(point) " + point;
        SubLObject cdolist_list_var = sbhl_time_vars.get_sbhl_hl_time_predicates();
        SubLObject sbhl_time_pred = NIL;
        sbhl_time_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module = sbhl_module_vars.get_sbhl_module(sbhl_time_pred);
            sbhl_graphs.remove_sbhl_graph_link(point, module);
            cdolist_list_var = cdolist_list_var.rest();
            sbhl_time_pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject time_stored_in_hl_p(final SubLObject time) {
        return makeBoolean((NIL != find_hl_start(time)) || (NIL != find_hl_end(time)));
    }

    public static SubLObject hl_start(final SubLObject time) {
        final SubLObject hl_start = find_hl_start(time);
        if (NIL != hl_start) {
            return hl_start;
        }
        return new_hl_start(time);
    }

    public static SubLObject hl_end(final SubLObject time) {
        final SubLObject hl_end = find_hl_end(time);
        if (NIL != hl_end) {
            return hl_end;
        }
        return new_hl_end(time);
    }

    public static SubLObject hl_date_predecessor_of_start(final SubLObject eu_date) {
        return hl_end(numeric_date_utilities.preceding_extended_universal_date(eu_date));
    }

    public static SubLObject hl_date_successor_of_end(final SubLObject eu_date) {
        return hl_start(numeric_date_utilities.succeeding_extended_universal_date(eu_date));
    }

    public static SubLObject sbhl_time_arg_p(final SubLObject v_object) {
        return makeBoolean((NIL != groundP(v_object, UNPROVIDED)) && (NIL == sksi_infrastructure_utilities.sksi_external_term_p(v_object)));
    }

    public static SubLObject sbhl_time_inference_arg_p(final SubLObject v_object) {
        return makeBoolean((NIL != sbhl_time_arg_p(v_object)) && (((NIL != time_interval_utilities.valid_time_index_p(v_object)) || (NIL != sbhl_temporal_node_p(hl_start(v_object)))) || (NIL != sbhl_temporal_node_p(hl_end(v_object)))));
    }

    public static SubLObject sbhl_time_inference_args(final SubLObject literal) {
        SubLObject current;
        final SubLObject datum = current = literal_args(literal, UNPROVIDED);
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list42);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            return values(date_utilities.possibly_bind_temporal_indexical_in_object(arg1), date_utilities.possibly_bind_temporal_indexical_in_object(arg2));
        }
        cdestructuring_bind_error(datum, $list42);
        return NIL;
    }

    public static SubLObject sbhl_temporal_node_p(final SubLObject temporal_point) {
        if (NIL != sbhl_time_node_object_p(temporal_point)) {
            SubLObject foundP;
            SubLObject rest;
            SubLObject pred;
            for (foundP = NIL, rest = NIL, rest = sbhl_time_vars.get_sbhl_hl_time_predicates(); (NIL == foundP) && (NIL != rest); rest = rest.rest()) {
                pred = rest.first();
                if (NIL != gethash(temporal_point, sbhl_module_vars.get_sbhl_module_graph(sbhl_module_vars.get_sbhl_module(pred)), UNPROVIDED)) {
                    foundP = T;
                }
            }
            return foundP;
        }
        return NIL;
    }

    public static SubLObject temporal_link_disjunction_term_p(final SubLObject temporal_point) {
        return list_utilities.sublisp_boolean(gethash(temporal_point, sbhl_time_vars.$sbhl_temporal_link_disjunction_term_table$.getGlobalValue(), UNPROVIDED));
    }

    public static SubLObject sbhl_temporality_term_p(final SubLObject v_term) {
        return makeBoolean(((((NIL != sbhl_temporal_node_p(hl_start(v_term))) || (NIL != sbhl_temporal_node_p(hl_end(v_term)))) || (NIL != temporal_link_disjunction_term_p(hl_start(v_term)))) || (NIL != temporal_link_disjunction_term_p(hl_end(v_term)))) || (NIL != hl_endpoint_p(v_term)));
    }

    public static SubLObject valid_sbhl_time_literal_argsP(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        return makeBoolean((((NIL != sbhl_time_vars.sbhl_temporality_activeP()) && (NIL != sbhl_time_predicate_p(pred))) && (NIL != sbhl_time_arg_p(arg1))) && (NIL != sbhl_time_arg_p(arg2)));
    }

    public static SubLObject sbhl_node_passes_temporality_all_accesses_filtersP(final SubLObject node) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != sbhl_time_vars.$sbhl_temporality_dont_collect_dates_when_all_accessingP$.getDynamicValue(thread)) && (NIL != date_utilities.possibly_hl_date_p(hl_interval_of_endpoint(node)))) {
            return NIL;
        }
        if (sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.getDynamicValue(thread) == $START) {
            return hl_start_p(node);
        }
        if (sbhl_time_vars.$sbhl_temporality_all_accesses_polarity_filter$.getDynamicValue(thread) == $END) {
            return hl_end_p(node);
        }
        return T;
    }

    public static SubLObject point_args(final SubLObject temporal_points) {
        SubLObject args = NIL;
        SubLObject cdolist_list_var = temporal_points;
        SubLObject point = NIL;
        point = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            args = cons(hl_interval_of_endpoint(point), args);
            cdolist_list_var = cdolist_list_var.rest();
            point = cdolist_list_var.first();
        } 
        return args;
    }

    public static SubLObject sbhl_temporal_point_nartP(final SubLObject v_term) {
        return hl_endpoint_p(v_term);
    }

    public static SubLObject quasi_hl_start(final SubLObject time) {
        return list($START, start_arg(time));
    }

    public static SubLObject quasi_hl_earliest_start(final SubLObject time) {
        return list($START, earliest_start_arg(time));
    }

    public static SubLObject quasi_hl_latest_start(final SubLObject time) {
        return list($START, latest_start_arg(time));
    }

    public static SubLObject quasi_hl_end(final SubLObject time) {
        return list($END, end_arg(time));
    }

    public static SubLObject quasi_hl_latest_end(final SubLObject time) {
        return list($END, latest_end_arg(time));
    }

    public static SubLObject quasi_hl_earliest_end(final SubLObject time) {
        return list($END, earliest_end_arg(time));
    }

    public static SubLObject sbhl_time_predicate_p(final SubLObject predicate) {
        return subl_promotions.memberP(predicate, sbhl_time_vars.$sbhl_time_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sbhl_time_predicate_with_no_spec_pred_or_inverseP(final SubLObject predicate) {
        return makeBoolean((NIL != sbhl_time_predicate_p(predicate)) && (NIL == genl_predicates.some_spec_pred_or_inverseP(predicate, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject conjunctive_temporal_relation_predP(final SubLObject pred) {
        if (NIL == sbhl_time_predicate_p(pred)) {
            return NIL;
        }
        final SubLObject conjunctiveP = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTIVE_, $NOT_FOUND);
        if (NIL == booleanp(conjunctiveP)) {
            return NIL;
        }
        return conjunctiveP;
    }

    public static SubLObject disjunctive_temporal_relation_predP(final SubLObject pred) {
        if (NIL == sbhl_time_predicate_p(pred)) {
            return NIL;
        }
        final SubLObject conjunctiveP = sbhl_time_modules.get_sbhl_time_module(pred, $CONJUNCTIVE_, $NOT_FOUND);
        if (NIL == booleanp(conjunctiveP)) {
            return NIL;
        }
        return makeBoolean(NIL == conjunctiveP);
    }

    public static SubLObject earliest_start_arg(final SubLObject time) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(time);
        if (pcase_var.eql($$SomeTimeInIntervalFn)) {
            return earliest_start_arg(cycl_utilities.nat_arg1(time, UNPROVIDED));
        }
        return start_arg(time);
    }

    public static SubLObject latest_start_arg(final SubLObject time) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(time);
        if (pcase_var.eql($$SomeTimeInIntervalFn)) {
            return latest_end_arg(cycl_utilities.nat_arg1(time, UNPROVIDED));
        }
        return start_arg(time);
    }

    public static SubLObject start_arg(final SubLObject time) {
        if (NIL != date_interval_nat_p(time)) {
            final SubLObject pcase_var = cycl_utilities.formula_operator(time);
            if (pcase_var.eql($$TimeIntervalInclusiveFn)) {
                return start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql($$TimeIntervalBetweenFn)) {
                return numeric_date_utilities.succeeding_extended_universal_date(end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED)));
            }
            if (pcase_var.eql($$StartFn)) {
                return start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql($$EndFn)) {
                return end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql($$IntervalStartedByFn)) {
                return numeric_date_utilities.succeeding_extended_universal_date(end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED)));
            }
            if (pcase_var.eql($$IntervalStartedByFn_Inclusive)) {
                return start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql($$IntervalEndedByFn)) {
                return date_utilities.$beginning_of_time$.getGlobalValue();
            }
            if (pcase_var.eql($$IntervalEndedByFn_Inclusive)) {
                return date_utilities.$beginning_of_time$.getGlobalValue();
            }
        } else
            if (NIL != time_interval_nat_with_possibly_reducible_start_p(time)) {
                final SubLObject pcase_var = cycl_utilities.formula_operator(time);
                if (pcase_var.eql($$TimeIntervalInclusiveFn)) {
                    return start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql($$StartFn)) {
                    return start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql($$EndFn)) {
                    return end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql($$IntervalStartedByFn_Inclusive)) {
                    return start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql($$IntervalEndedByFn)) {
                    return date_utilities.$beginning_of_time$.getGlobalValue();
                }
                if (pcase_var.eql($$IntervalEndedByFn_Inclusive)) {
                    return date_utilities.$beginning_of_time$.getGlobalValue();
                }
            } else {
                if (NIL != date_utilities.always_time_intervalP(time)) {
                    return date_utilities.$beginning_of_time$.getGlobalValue();
                }
                if (NIL != date_utilities.beginning_of_timeP(time)) {
                    return time;
                }
                if (NIL != date_utilities.end_of_timeP(time)) {
                    return time;
                }
                if (NIL != sbhl_time_el_date_p(time)) {
                    return date_utilities.extended_universal_date_for_date_initial_second(time);
                }
                if (NIL != groundP(time, UNPROVIDED)) {
                    return time;
                }
            }

        return NIL;
    }

    public static SubLObject earliest_end_arg(final SubLObject time) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(time);
        if (pcase_var.eql($$SomeTimeInIntervalFn)) {
            return earliest_start_arg(cycl_utilities.nat_arg1(time, UNPROVIDED));
        }
        return end_arg(time);
    }

    public static SubLObject latest_end_arg(final SubLObject time) {
        final SubLObject pcase_var = cycl_utilities.formula_operator(time);
        if (pcase_var.eql($$SomeTimeInIntervalFn)) {
            return latest_end_arg(cycl_utilities.nat_arg1(time, UNPROVIDED));
        }
        return end_arg(time);
    }

    public static SubLObject end_arg(final SubLObject time) {
        if (NIL != date_interval_nat_p(time)) {
            final SubLObject pcase_var = cycl_utilities.formula_operator(time);
            if (pcase_var.eql($$TimeIntervalInclusiveFn)) {
                return end_arg(cycl_utilities.formula_arg2(time, UNPROVIDED));
            }
            if (pcase_var.eql($$TimeIntervalBetweenFn)) {
                return numeric_date_utilities.preceding_extended_universal_date(start_arg(cycl_utilities.formula_arg2(time, UNPROVIDED)));
            }
            if (pcase_var.eql($$StartFn)) {
                return start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql($$EndFn)) {
                return end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
            }
            if (pcase_var.eql($$IntervalStartedByFn)) {
                return date_utilities.$end_of_time$.getGlobalValue();
            }
            if (pcase_var.eql($$IntervalStartedByFn_Inclusive)) {
                return date_utilities.$end_of_time$.getGlobalValue();
            }
            if (pcase_var.eql($$IntervalEndedByFn)) {
                return numeric_date_utilities.preceding_extended_universal_date(start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED)));
            }
            if (pcase_var.eql($$IntervalEndedByFn_Inclusive)) {
                return end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
            }
        } else
            if (NIL != time_interval_nat_with_possibly_reducible_end_p(time)) {
                final SubLObject pcase_var = cycl_utilities.formula_operator(time);
                if (pcase_var.eql($$TimeIntervalInclusiveFn)) {
                    return end_arg(cycl_utilities.formula_arg2(time, UNPROVIDED));
                }
                if (pcase_var.eql($$StartFn)) {
                    return start_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql($$EndFn)) {
                    return end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                }
                if (pcase_var.eql($$IntervalStartedByFn)) {
                    return date_utilities.$end_of_time$.getGlobalValue();
                }
                if (pcase_var.eql($$IntervalStartedByFn_Inclusive)) {
                    return date_utilities.$end_of_time$.getGlobalValue();
                }
                if (pcase_var.eql($$IntervalEndedByFn_Inclusive)) {
                    return end_arg(cycl_utilities.formula_arg1(time, UNPROVIDED));
                }
            } else {
                if (NIL != date_utilities.always_time_intervalP(time)) {
                    return date_utilities.$end_of_time$.getGlobalValue();
                }
                if (NIL != date_utilities.beginning_of_timeP(time)) {
                    return time;
                }
                if (NIL != date_utilities.end_of_timeP(time)) {
                    return time;
                }
                if (NIL != sbhl_time_el_date_p(time)) {
                    return date_utilities.extended_universal_date_for_date_final_second(time);
                }
                if (NIL != groundP(time, UNPROVIDED)) {
                    return time;
                }
            }

        return NIL;
    }

    public static SubLObject hl_date_point_p(final SubLObject v_object) {
        return makeBoolean((NIL != hl_endpoint_p(v_object)) && (NIL != sbhl_time_dates.sbhl_date_p(hl_interval_of_endpoint(v_object))));
    }

    public static SubLObject date_interval_nat_p(final SubLObject time) {
        if (NIL == cycl_grammar.cycl_nat_p(time)) {
            return NIL;
        }
        final SubLObject pcase_var = cycl_utilities.formula_operator(time);
        if (pcase_var.eql($$TimeIntervalInclusiveFn) || pcase_var.eql($$TimeIntervalBetweenFn)) {
            final SubLObject arg1 = cycl_utilities.formula_arg1(time, UNPROVIDED);
            final SubLObject arg2 = cycl_utilities.formula_arg2(time, UNPROVIDED);
            return makeBoolean(((NIL != sbhl_time_el_date_p(arg1)) || (NIL != date_interval_nat_p(arg1))) && ((NIL != sbhl_time_el_date_p(arg2)) || (NIL != date_interval_nat_p(arg2))));
        }
        if (((((pcase_var.eql($$StartFn) || pcase_var.eql($$EndFn)) || pcase_var.eql($$IntervalStartedByFn)) || pcase_var.eql($$IntervalEndedByFn)) || pcase_var.eql($$IntervalStartedByFn_Inclusive)) || pcase_var.eql($$IntervalEndedByFn_Inclusive)) {
            final SubLObject arg1 = cycl_utilities.formula_arg1(time, UNPROVIDED);
            return makeBoolean((NIL != sbhl_time_el_date_p(arg1)) || (NIL != date_interval_nat_p(arg1)));
        }
        return NIL;
    }

    public static SubLObject time_interval_nat_with_possibly_reducible_start_p(final SubLObject time) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(time)) && (NIL != member(cycl_utilities.formula_operator(time), $list55, symbol_function(EQL), UNPROVIDED)));
    }

    public static SubLObject time_interval_nat_with_possibly_reducible_end_p(final SubLObject time) {
        return makeBoolean((NIL != cycl_grammar.cycl_nat_p(time)) && (NIL != subl_promotions.memberP(cycl_utilities.formula_operator(time), $list56, symbol_function(EQL), UNPROVIDED)));
    }

    public static SubLObject sbhl_time_el_date_p(final SubLObject v_object) {
        return sbhl_time_el_date_p_recursive(v_object, NIL);
    }

    public static SubLObject sbhl_time_el_date_p_recursive(final SubLObject v_object, final SubLObject expected) {
        if (NIL == possibly_naut_p(v_object)) {
            return NIL;
        }
        final SubLObject function = cycl_utilities.formula_operator(v_object);
        if ((NIL != expected) && (!function.eql(expected))) {
            return NIL;
        }
        final SubLObject pcase_var = function;
        if (pcase_var.eql($$MilliSecondFn)) {
            final SubLObject millisecond = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((millisecond.isInteger() && ZERO_INTEGER.numLE(millisecond)) && millisecond.numLE($int$999)) && (NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$SecondFn)));
        }
        if (pcase_var.eql($$SecondFn)) {
            final SubLObject second = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((second.isInteger() && ZERO_INTEGER.numLE(second)) && second.numLE($int$59)) && (NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$MinuteFn)));
        }
        if (pcase_var.eql($$MinuteFn)) {
            final SubLObject minute = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((minute.isInteger() && ZERO_INTEGER.numLE(minute)) && minute.numLE($int$59)) && (NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$HourFn)));
        }
        if (pcase_var.eql($$HourFn)) {
            final SubLObject hour = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((hour.isInteger() && ZERO_INTEGER.numLE(hour)) && hour.numLE($int$23)) && (NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$DayFn)));
        }
        if (pcase_var.eql($$DayFn)) {
            final SubLObject day = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((day.isInteger() && ONE_INTEGER.numLE(day)) && day.numLE($int$31)) && (NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$MonthFn)));
        }
        if (pcase_var.eql($$MonthFn)) {
            final SubLObject month = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
            return makeBoolean((NIL != date_utilities.month_p(month)) && (NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$YearFn)));
        }
        if (pcase_var.eql($$QuarterFn)) {
            final SubLObject quarter = cycl_utilities.formula_arg1(v_object, UNPROVIDED);
            return makeBoolean(((quarter.isInteger() && ONE_INTEGER.numLE(quarter)) && quarter.numLE(FOUR_INTEGER)) && (NIL != sbhl_time_el_date_p_recursive(cycl_utilities.formula_arg2(v_object, UNPROVIDED), $$YearFn)));
        }
        if (pcase_var.eql($$YearFn)) {
            return integerp(cycl_utilities.formula_arg1(v_object, UNPROVIDED));
        }
        if (pcase_var.eql($$DecadeFn)) {
            return integerp(cycl_utilities.formula_arg1(v_object, UNPROVIDED));
        }
        if (pcase_var.eql($$CenturyFn)) {
            return integerp(cycl_utilities.formula_arg1(v_object, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject sbhl_weak_graph_busted_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject module = sbhl_module_vars.get_sbhl_module($$weak_HL_TimePrecedence);
        sbhl_graphs.swap_in_all_graph_links(module);
        final SubLObject iterator = map_utilities.new_map_iterator(sbhl_module_vars.get_sbhl_module_graph(module));
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject node = NIL;
                SubLObject link = NIL;
                destructuring_bind_must_consp(current, datum, $list72);
                node = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list72);
                link = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject interval_term = NIL;
                    if (NIL != hl_start_p(node)) {
                        interval_term = hl_start_interval(node);
                    } else
                        if (NIL != hl_end_p(node)) {
                            interval_term = hl_end_interval(node);
                        }

                    if ((NIL == narts_high.naut_p(interval_term)) && (NIL == forts.valid_fortP(interval_term))) {
                        result = cons(interval_term, result);
                    }
                } else {
                    cdestructuring_bind_error(datum, $list72);
                }
            }
        }
        return nreverse(result);
    }

    public static SubLObject declare_sbhl_time_utilities_file() {
        declareFunction(me, "initialize_time_kb_feature", "INITIALIZE-TIME-KB-FEATURE", 0, 0, false);
        declareFunction(me, "initialize_hl_endpoint_tables", "INITIALIZE-HL-ENDPOINT-TABLES", 0, 0, false);
        declareFunction(me, "hl_start_print_function_trampoline", "HL-START-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "hl_start_p", "HL-START-P", 1, 0, false);
        new sbhl_time_utilities.$hl_start_p$UnaryFunction();
        declareFunction(me, "hl_start_interval", "HL-START-INTERVAL", 1, 0, false);
        declareFunction(me, "_csetf_hl_start_interval", "_CSETF-HL-START-INTERVAL", 2, 0, false);
        declareFunction(me, "make_hl_start", "MAKE-HL-START", 0, 1, false);
        declareFunction(me, "visit_defstruct_hl_start", "VISIT-DEFSTRUCT-HL-START", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_hl_start_method", "VISIT-DEFSTRUCT-OBJECT-HL-START-METHOD", 2, 0, false);
        declareFunction(me, "sxhash_hl_start_method", "SXHASH-HL-START-METHOD", 1, 0, false);
        new sbhl_time_utilities.$sxhash_hl_start_method$UnaryFunction();
        declareFunction(me, "hl_end_print_function_trampoline", "HL-END-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "hl_end_p", "HL-END-P", 1, 0, false);
        new sbhl_time_utilities.$hl_end_p$UnaryFunction();
        declareFunction(me, "hl_end_interval", "HL-END-INTERVAL", 1, 0, false);
        declareFunction(me, "_csetf_hl_end_interval", "_CSETF-HL-END-INTERVAL", 2, 0, false);
        declareFunction(me, "make_hl_end", "MAKE-HL-END", 0, 1, false);
        declareFunction(me, "visit_defstruct_hl_end", "VISIT-DEFSTRUCT-HL-END", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_hl_end_method", "VISIT-DEFSTRUCT-OBJECT-HL-END-METHOD", 2, 0, false);
        declareFunction(me, "sxhash_hl_end_method", "SXHASH-HL-END-METHOD", 1, 0, false);
        new sbhl_time_utilities.$sxhash_hl_end_method$UnaryFunction();
        declareFunction(me, "print_hl_endpoint", "PRINT-HL-ENDPOINT", 3, 0, false);
        declareFunction(me, "new_hl_start", "NEW-HL-START", 1, 0, false);
        declareFunction(me, "new_hl_end", "NEW-HL-END", 1, 0, false);
        declareFunction(me, "hl_endpoint_p", "HL-ENDPOINT-P", 1, 0, false);
        declareFunction(me, "sbhl_time_node_object_p", "SBHL-TIME-NODE-OBJECT-P", 1, 0, false);
        declareFunction(me, "hl_interval_of_endpoint", "HL-INTERVAL-OF-ENDPOINT", 1, 0, false);
        declareFunction(me, "find_hl_start", "FIND-HL-START", 1, 0, false);
        declareFunction(me, "find_hl_end", "FIND-HL-END", 1, 0, false);
        declareFunction(me, "remove_hl_start", "REMOVE-HL-START", 1, 1, false);
        declareFunction(me, "remove_hl_end", "REMOVE-HL-END", 1, 1, false);
        declareFunction(me, "remove_hl_endpoint", "REMOVE-HL-ENDPOINT", 1, 0, false);
        declareFunction(me, "remove_hl_endpoint_backpointers", "REMOVE-HL-ENDPOINT-BACKPOINTERS", 1, 0, false);
        declareFunction(me, "time_stored_in_hl_p", "TIME-STORED-IN-HL-P", 1, 0, false);
        declareFunction(me, "hl_start", "HL-START", 1, 0, false);
        declareFunction(me, "hl_end", "HL-END", 1, 0, false);
        declareFunction(me, "hl_date_predecessor_of_start", "HL-DATE-PREDECESSOR-OF-START", 1, 0, false);
        declareFunction(me, "hl_date_successor_of_end", "HL-DATE-SUCCESSOR-OF-END", 1, 0, false);
        declareFunction(me, "sbhl_time_arg_p", "SBHL-TIME-ARG-P", 1, 0, false);
        declareFunction(me, "sbhl_time_inference_arg_p", "SBHL-TIME-INFERENCE-ARG-P", 1, 0, false);
        declareFunction(me, "sbhl_time_inference_args", "SBHL-TIME-INFERENCE-ARGS", 1, 0, false);
        declareFunction(me, "sbhl_temporal_node_p", "SBHL-TEMPORAL-NODE-P", 1, 0, false);
        declareFunction(me, "temporal_link_disjunction_term_p", "TEMPORAL-LINK-DISJUNCTION-TERM-P", 1, 0, false);
        declareFunction(me, "sbhl_temporality_term_p", "SBHL-TEMPORALITY-TERM-P", 1, 0, false);
        declareFunction(me, "valid_sbhl_time_literal_argsP", "VALID-SBHL-TIME-LITERAL-ARGS?", 3, 0, false);
        declareFunction(me, "sbhl_node_passes_temporality_all_accesses_filtersP", "SBHL-NODE-PASSES-TEMPORALITY-ALL-ACCESSES-FILTERS?", 1, 0, false);
        declareFunction(me, "point_args", "POINT-ARGS", 1, 0, false);
        declareFunction(me, "sbhl_temporal_point_nartP", "SBHL-TEMPORAL-POINT-NART?", 1, 0, false);
        declareFunction(me, "quasi_hl_start", "QUASI-HL-START", 1, 0, false);
        declareFunction(me, "quasi_hl_earliest_start", "QUASI-HL-EARLIEST-START", 1, 0, false);
        declareFunction(me, "quasi_hl_latest_start", "QUASI-HL-LATEST-START", 1, 0, false);
        declareFunction(me, "quasi_hl_end", "QUASI-HL-END", 1, 0, false);
        declareFunction(me, "quasi_hl_latest_end", "QUASI-HL-LATEST-END", 1, 0, false);
        declareFunction(me, "quasi_hl_earliest_end", "QUASI-HL-EARLIEST-END", 1, 0, false);
        declareFunction(me, "sbhl_time_predicate_p", "SBHL-TIME-PREDICATE-P", 1, 0, false);
        new sbhl_time_utilities.$sbhl_time_predicate_p$UnaryFunction();
        declareFunction(me, "sbhl_time_predicate_with_no_spec_pred_or_inverseP", "SBHL-TIME-PREDICATE-WITH-NO-SPEC-PRED-OR-INVERSE?", 1, 0, false);
        declareFunction(me, "conjunctive_temporal_relation_predP", "CONJUNCTIVE-TEMPORAL-RELATION-PRED?", 1, 0, false);
        declareFunction(me, "disjunctive_temporal_relation_predP", "DISJUNCTIVE-TEMPORAL-RELATION-PRED?", 1, 0, false);
        declareFunction(me, "earliest_start_arg", "EARLIEST-START-ARG", 1, 0, false);
        declareFunction(me, "latest_start_arg", "LATEST-START-ARG", 1, 0, false);
        declareFunction(me, "start_arg", "START-ARG", 1, 0, false);
        declareFunction(me, "earliest_end_arg", "EARLIEST-END-ARG", 1, 0, false);
        declareFunction(me, "latest_end_arg", "LATEST-END-ARG", 1, 0, false);
        declareFunction(me, "end_arg", "END-ARG", 1, 0, false);
        declareFunction(me, "hl_date_point_p", "HL-DATE-POINT-P", 1, 0, false);
        declareFunction(me, "date_interval_nat_p", "DATE-INTERVAL-NAT-P", 1, 0, false);
        declareFunction(me, "time_interval_nat_with_possibly_reducible_start_p", "TIME-INTERVAL-NAT-WITH-POSSIBLY-REDUCIBLE-START-P", 1, 0, false);
        declareFunction(me, "time_interval_nat_with_possibly_reducible_end_p", "TIME-INTERVAL-NAT-WITH-POSSIBLY-REDUCIBLE-END-P", 1, 0, false);
        declareFunction(me, "sbhl_time_el_date_p", "SBHL-TIME-EL-DATE-P", 1, 0, false);
        declareFunction(me, "sbhl_time_el_date_p_recursive", "SBHL-TIME-EL-DATE-P-RECURSIVE", 2, 0, false);
        declareFunction(me, "sbhl_weak_graph_busted_forts", "SBHL-WEAK-GRAPH-BUSTED-FORTS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_sbhl_time_utilities_file() {
        deflexical("*TIME-CORE-CONSTANTS*", $list0);
        deflexical("*HL-START-TABLE-LOCK*", SubLSystemTrampolineFile.maybeDefault($hl_start_table_lock$, $hl_start_table_lock$, () -> make_lock($str3$_hl_start_table_lock_)));
        deflexical("*HL-START-TABLE*", SubLSystemTrampolineFile.maybeDefault($hl_start_table$, $hl_start_table$, () -> make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED)));
        deflexical("*HL-END-TABLE-LOCK*", SubLSystemTrampolineFile.maybeDefault($hl_end_table_lock$, $hl_end_table_lock$, () -> make_lock($str7$_hl_end_table_lock_)));
        deflexical("*HL-END-TABLE*", SubLSystemTrampolineFile.maybeDefault($hl_end_table$, $hl_end_table$, () -> make_hash_table($int$100, symbol_function(EQUAL), UNPROVIDED)));
        defconstant("*DTP-HL-START*", HL_START);
        defconstant("*DTP-HL-END*", HL_END);
        return NIL;
    }

    public static SubLObject setup_sbhl_time_utilities_file() {
        declare_defglobal($hl_start_table_lock$);
        declare_defglobal($hl_start_table$);
        declare_defglobal($hl_end_table_lock$);
        declare_defglobal($hl_end_table$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_hl_start$.getGlobalValue(), symbol_function(HL_START_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list17);
        def_csetf(HL_START_INTERVAL, _CSETF_HL_START_INTERVAL);
        identity(HL_START);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_hl_start$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HL_START_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_hl_start$.getGlobalValue(), symbol_function(SXHASH_HL_START_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_hl_end$.getGlobalValue(), symbol_function(HL_END_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list33);
        def_csetf(HL_END_INTERVAL, _CSETF_HL_END_INTERVAL);
        identity(HL_END);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_hl_end$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_HL_END_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_hl_end$.getGlobalValue(), symbol_function(SXHASH_HL_END_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sbhl_time_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_sbhl_time_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sbhl_time_utilities_file();
    }

    

    public static final class $hl_start_native extends SubLStructNative {
        public SubLObject $interval;

        private static final SubLStructDeclNative structDecl;

        private $hl_start_native() {
            this.$interval = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$interval;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$interval = value;
        }

        static {
            structDecl = makeStructDeclNative($hl_start_native.class, HL_START, HL_START_P, $list11, $list12, new String[]{ "$interval" }, $list13, $list14, PRINT_HL_ENDPOINT);
        }
    }

    public static final class $hl_start_p$UnaryFunction extends UnaryFunction {
        public $hl_start_p$UnaryFunction() {
            super(extractFunctionNamed("HL-START-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_start_p(arg1);
        }
    }

    public static final class $sxhash_hl_start_method$UnaryFunction extends UnaryFunction {
        public $sxhash_hl_start_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-HL-START-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_hl_start_method(arg1);
        }
    }

    public static final class $hl_end_native extends SubLStructNative {
        public SubLObject $interval;

        private static final SubLStructDeclNative structDecl;

        private $hl_end_native() {
            this.$interval = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$interval;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$interval = value;
        }

        static {
            structDecl = makeStructDeclNative($hl_end_native.class, HL_END, HL_END_P, $list11, $list12, new String[]{ "$interval" }, $list30, $list31, PRINT_HL_ENDPOINT);
        }
    }

    public static final class $hl_end_p$UnaryFunction extends UnaryFunction {
        public $hl_end_p$UnaryFunction() {
            super(extractFunctionNamed("HL-END-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return hl_end_p(arg1);
        }
    }

    public static final class $sxhash_hl_end_method$UnaryFunction extends UnaryFunction {
        public $sxhash_hl_end_method$UnaryFunction() {
            super(extractFunctionNamed("SXHASH-HL-END-METHOD"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sxhash_hl_end_method(arg1);
        }
    }

    public static final class $sbhl_time_predicate_p$UnaryFunction extends UnaryFunction {
        public $sbhl_time_predicate_p$UnaryFunction() {
            super(extractFunctionNamed("SBHL-TIME-PREDICATE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return sbhl_time_predicate_p(arg1);
        }
    }
}

/**
 * Total time: 248 ms
 */
