package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.bytes;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class object_monitor extends SubLTranslatedFile {
    public static final SubLFile me = new object_monitor();

    public static final String myName = "com.cyc.cycjava.cycl.object_monitor";

    public static final String myFingerPrint = "be2f481145cdff76f4ce8ebb7c19afc6194b6e10bbe957f5eb3ebf06eac1f412";





    public static final SubLList $list2 = list(new SubLObject[]{ list(makeSymbol("MONITORING-P"), makeKeyword("INSTANCE"), makeKeyword("BOOLEAN"), makeKeyword("PUBLIC")), list(makeSymbol("SUBJECTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("STREAM"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("NESTING-DEPTH"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TAB-STRING"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TAB-TO-DEPTH"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR-SET-SLOT"), list(makeSymbol("TARGET"), makeSymbol("NEW-VALUE"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR-BEFORE-METHOD"), list(makeSymbol("OWNING-METHOD-NAME"), makeSymbol("INSTANCE-OR-CLASS"), makeSymbol("ARGS"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR-AFTER-METHOD"), list(makeSymbol("OWNING-METHOD-NAME"), makeSymbol("INSTANCE-OR-CLASS"), makeSymbol("ARGS"), makeSymbol("RESULT"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR"), list(makeSymbol("TARGET"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNMONITOR"), list(makeSymbol("TARGET"))), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR-INSTANCE"), list(makeSymbol("TARGET")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("START-MONITORING"), NIL), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("STOP-MONITORING"), NIL) });

    public static final SubLSymbol TAB_STRING = makeSymbol("TAB-STRING");

    public static final SubLSymbol NESTING_DEPTH = makeSymbol("NESTING-DEPTH");



    private static final SubLInteger $int$4097 = makeInteger(4097);



    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-CLASS");









    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-INSTANCE");



    public static final SubLList $list15 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("MONITORING-P"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SUBJECTS"), NIL), list(makeSymbol("CSETQ"), makeSymbol("STREAM"), T), list(makeSymbol("CSETQ"), makeSymbol("NESTING-DEPTH"), ZERO_INTEGER), list(makeSymbol("CSETQ"), makeSymbol("TAB-STRING"), makeString("   |")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");

    public static final SubLString $str17$____ = makeString("   |");

    public static final SubLSymbol OBJECT_MONITOR_INITIALIZE_METHOD = makeSymbol("OBJECT-MONITOR-INITIALIZE-METHOD");

    public static final SubLSymbol TAB_TO_DEPTH = makeSymbol("TAB-TO-DEPTH");

    public static final SubLList $list20 = list(list(makeSymbol("CDOTIMES"), list(makeSymbol("I"), makeSymbol("NESTING-DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeSymbol("TAB-STRING"))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");

    public static final SubLSymbol OBJECT_MONITOR_TAB_TO_DEPTH_METHOD = makeSymbol("OBJECT-MONITOR-TAB-TO-DEPTH-METHOD");

    public static final SubLSymbol MONITOR_SET_SLOT = makeSymbol("MONITOR-SET-SLOT");

    public static final SubLList $list24 = list(makeSymbol("TARGET"), makeSymbol("NEW-VALUE"));

    public static final SubLList $list25 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%")), list(makeSymbol("TAB-TO-DEPTH"), makeSymbol("SELF")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("(SET-SLOT ~S ~S ~S)"), makeSymbol("TARGET"), list(makeSymbol("FIF"), list(makeSymbol("CAND"), makeSymbol("*ACTIVE-SLOT-LISTENER*"), list(makeSymbol("SLOT-LISTENER-P"), makeSymbol("*ACTIVE-SLOT-LISTENER*"))), list(makeSymbol("SL-SLOT-NAME"), makeSymbol("*ACTIVE-SLOT-LISTENER*")), makeKeyword("UNKNOWN-SLOT")), makeSymbol("NEW-VALUE")), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");

    public static final SubLString $str27$__ = makeString("~%");

    public static final SubLString $str28$_SET_SLOT__S__S__S_ = makeString("(SET-SLOT ~S ~S ~S)");



    public static final SubLSymbol OBJECT_MONITOR_MONITOR_SET_SLOT_METHOD = makeSymbol("OBJECT-MONITOR-MONITOR-SET-SLOT-METHOD");

    public static final SubLSymbol MONITOR_BEFORE_METHOD = makeSymbol("MONITOR-BEFORE-METHOD");

    public static final SubLList $list32 = list(makeKeyword("AUTO-UPDATE"));

    public static final SubLList $list33 = list(makeSymbol("INSTANCE-OR-CLASS"), makeSymbol("OWNING-METHOD-NAME"), makeSymbol("ARGS"));

    public static final SubLList $list34 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%")), list(makeSymbol("TAB-TO-DEPTH"), makeSymbol("SELF")), list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED-LAMBDA-LIST"), list(makeSymbol("METHOD-LISTENERS-FILTERED-LAMBDA-LIST"), makeSymbol("INSTANCE-OR-CLASS"), makeSymbol("OWNING-METHOD-NAME"))), list(makeSymbol("CURRENT-VAR"), NIL), list(makeSymbol("CURRENT-ARG"))), list(makeSymbol("PCOND"), list(list(makeSymbol("INSTANCE-P"), makeSymbol("INSTANCE-OR-CLASS")), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-OF-INSTANCE"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("INSTANCE-OR-CLASS")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("Entered: (~S ~S) ~S"), makeSymbol("OWNING-METHOD-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS-OF-INSTANCE")), list(makeSymbol("CONS"), makeSymbol("INSTANCE-OR-CLASS"), makeSymbol("ARGS"))))), list(list(makeSymbol("CLASS-P"), makeSymbol("INSTANCE-OR-CLASS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("Entered: (~S ~S) ~S"), makeSymbol("OWNING-METHOD-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("INSTANCE-OR-CLASS")), makeSymbol("ARGS"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("Entered: ~S ~S"), makeSymbol("OWNING-METHOD-NAME"), list(makeSymbol("CONS"), makeSymbol("OWNING-METHOD-NAME"), makeSymbol("ARGS"))))), list(makeSymbol("WHILE"), list(makeSymbol("CAND"), makeSymbol("FILTERED-LAMBDA-LIST"), makeSymbol("ARGS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%")), list(makeSymbol("TAB-TO-DEPTH"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CURRENT-VAR"), list(makeSymbol("CAR"), makeSymbol("FILTERED-LAMBDA-LIST")), makeSymbol("CURRENT-ARG"), list(makeSymbol("CAR"), makeSymbol("ARGS"))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("Arg: ~S = ~S"), makeSymbol("CURRENT-VAR"), makeSymbol("CURRENT-ARG")), list(makeSymbol("CSETQ"), makeSymbol("FILTERED-LAMBDA-LIST"), list(makeSymbol("CDR"), makeSymbol("FILTERED-LAMBDA-LIST")), makeSymbol("ARGS"), list(makeSymbol("CDR"), makeSymbol("ARGS"))))), list(makeSymbol("CINC"), makeSymbol("NESTING-DEPTH")), list(makeSymbol("RET"), NIL));

    public static final SubLString $str35$Entered____S__S___S = makeString("Entered: (~S ~S) ~S");

    public static final SubLString $str36$Entered___S__S = makeString("Entered: ~S ~S");

    public static final SubLString $str37$Arg___S____S = makeString("Arg: ~S = ~S");

    public static final SubLSymbol OBJECT_MONITOR_MONITOR_BEFORE_METHOD_METHOD = makeSymbol("OBJECT-MONITOR-MONITOR-BEFORE-METHOD-METHOD");

    public static final SubLSymbol MONITOR_AFTER_METHOD = makeSymbol("MONITOR-AFTER-METHOD");

    public static final SubLList $list40 = list(makeSymbol("INSTANCE-OR-CLASS"), makeSymbol("OWNING-METHOD-NAME"), makeSymbol("ARGS"), makeSymbol("RESULT"));

    public static final SubLList $list41 = list(list(makeSymbol("CDEC"), makeSymbol("NESTING-DEPTH")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%")), list(makeSymbol("TAB-TO-DEPTH"), makeSymbol("SELF")), list(makeSymbol("PCOND"), list(list(makeSymbol("INSTANCE-P"), makeSymbol("INSTANCE-OR-CLASS")), list(makeSymbol("CLET"), list(list(makeSymbol("CLASS-OF-INSTANCE"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("INSTANCE-OR-CLASS")))), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("Returning: (~S ~S) ~S -> ~S"), makeSymbol("OWNING-METHOD-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("CLASS-OF-INSTANCE")), list(makeSymbol("CONS"), makeSymbol("INSTANCE-OR-CLASS"), makeSymbol("ARGS")), makeSymbol("RESULT")))), list(list(makeSymbol("CLASS-P"), makeSymbol("INSTANCE-OR-CLASS")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("Returning: (~S ~S) ~S -> ~S"), makeSymbol("OWNING-METHOD-NAME"), list(makeSymbol("CLASS-NAME"), makeSymbol("INSTANCE-OR-CLASS")), makeSymbol("ARGS"), makeSymbol("RESULT"))), list(T, list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("Returning: ~S ~S -> ~S"), makeSymbol("OWNING-METHOD-NAME"), list(makeSymbol("CONS"), makeSymbol("OWNING-METHOD-NAME"), makeSymbol("ARGS")), makeSymbol("RESULT")))), list(makeSymbol("RET"), NIL));

    public static final SubLString $str42$Returning____S__S___S_____S = makeString("Returning: (~S ~S) ~S -> ~S");

    public static final SubLString $str43$Returning___S__S_____S = makeString("Returning: ~S ~S -> ~S");

    public static final SubLSymbol OBJECT_MONITOR_MONITOR_AFTER_METHOD_METHOD = makeSymbol("OBJECT-MONITOR-MONITOR-AFTER-METHOD-METHOD");



    public static final SubLList $list46 = list(makeSymbol("TARGET"));

    public static final SubLList $list47 = list(list(makeSymbol("PWHEN"), list(makeSymbol("INSTANCE-P"), makeSymbol("TARGET")), list(makeSymbol("CPUSHNEW"), makeSymbol("TARGET"), makeSymbol("SUBJECTS")), list(makeSymbol("PWHEN"), makeSymbol("MONITORING-P"), list(makeSymbol("MONITOR-INSTANCE"), makeSymbol("SELF"), makeSymbol("TARGET"))), list(makeSymbol("RET"), T)), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");

    public static final SubLSymbol OBJECT_MONITOR_MONITOR_METHOD = makeSymbol("OBJECT-MONITOR-MONITOR-METHOD");



    public static final SubLList $list51 = list(list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER"), makeSymbol("TARGET"), makeSymbol("SUBJECTS"), list(makeSymbol("FUNCTION"), EQ)), list(makeSymbol("CSETQ"), makeSymbol("SUBJECTS"), list(makeSymbol("DELETE"), makeSymbol("TARGET"), makeSymbol("SUBJECTS"))), list(makeSymbol("PWHEN"), makeSymbol("MONITORING-P"), list(makeSymbol("REMOVE-ALL-SET-SLOT-LISTENERS"), makeSymbol("SELF"), makeSymbol("TARGET"))), list(makeSymbol("RET"), T)), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol $sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");

    public static final SubLSymbol OBJECT_MONITOR_UNMONITOR_METHOD = makeSymbol("OBJECT-MONITOR-UNMONITOR-METHOD");

    public static final SubLSymbol MONITOR_INSTANCE = makeSymbol("MONITOR-INSTANCE");

    public static final SubLList $list55 = list(list(makeSymbol("CLET"), list(makeSymbol("SLOTS"), makeSymbol("METHOD-NAMES")), list(makeSymbol("CSETQ"), makeSymbol("SLOTS"), list(makeSymbol("INSTANCES-ALL-ANY-INSTANCE-SLOTS"), makeSymbol("TARGET"))), list(makeSymbol("CDOLIST"), list(makeSymbol("SLOT"), makeSymbol("SLOTS")), list(makeSymbol("ADD-SET-SLOT-LISTENER"), makeSymbol("SELF"), makeSymbol("TARGET"), makeSymbol("SLOT"), list(makeSymbol("QUOTE"), makeSymbol("MONITOR-SET-SLOT")))), list(makeSymbol("CSETQ"), makeSymbol("METHOD-NAMES"), list(makeSymbol("METHODS-GET-ALL-METHOD-NAMES"), makeSymbol("TARGET"))), list(makeSymbol("CDOLIST"), list(makeSymbol("METHOD-NAME"), makeSymbol("METHOD-NAMES")), list(makeSymbol("ADD-CLASS-WIDE-BEFORE-METHOD-LISTENER"), makeSymbol("SELF"), makeSymbol("TARGET"), makeSymbol("METHOD-NAME"), list(makeSymbol("QUOTE"), makeSymbol("MONITOR-BEFORE-METHOD"))), list(makeSymbol("ADD-CLASS-WIDE-AFTER-METHOD-LISTENER"), makeSymbol("SELF"), makeSymbol("TARGET"), makeSymbol("METHOD-NAME"), list(makeSymbol("QUOTE"), makeSymbol("MONITOR-AFTER-METHOD"))))), list(makeSymbol("RET"), NIL));

    public static final SubLSymbol OBJECT_MONITOR_MONITOR_INSTANCE_METHOD = makeSymbol("OBJECT-MONITOR-MONITOR-INSTANCE-METHOD");

    public static final SubLSymbol START_MONITORING = makeSymbol("START-MONITORING");

    public static final SubLList $list58 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("TARGET"), makeSymbol("SUBJECTS")), list(makeSymbol("MONITOR-INSTANCE"), makeSymbol("SELF"), makeSymbol("TARGET"))), list(makeSymbol("CSETQ"), makeSymbol("MONITORING-P"), T), list(makeSymbol("RET"), T));

    public static final SubLSymbol $sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");

    public static final SubLSymbol OBJECT_MONITOR_START_MONITORING_METHOD = makeSymbol("OBJECT-MONITOR-START-MONITORING-METHOD");

    public static final SubLSymbol STOP_MONITORING = makeSymbol("STOP-MONITORING");

    public static final SubLList $list62 = list(list(makeSymbol("PWHEN"), makeSymbol("MONITORING-P"), list(makeSymbol("CDOLIST"), list(makeSymbol("TARGET"), makeSymbol("SUBJECTS")), list(makeSymbol("REMOVE-ALL-SET-SLOT-LISTENERS"), makeSymbol("SELF"), makeSymbol("TARGET")), list(makeSymbol("REMOVE-ALL-CLASS-WIDE-METHOD-LISTENERS"), makeSymbol("SELF"), makeSymbol("TARGET"))), list(makeSymbol("CSETQ"), makeSymbol("MONITORING-P"), NIL)), list(makeSymbol("RET"), T));

    public static final SubLSymbol $sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-OBJECT-MONITOR-METHOD");

    public static final SubLSymbol OBJECT_MONITOR_STOP_MONITORING_METHOD = makeSymbol("OBJECT-MONITOR-STOP-MONITORING-METHOD");

    public static SubLObject get_object_monitor_tab_string(final SubLObject v_object_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_object_monitor, FOUR_INTEGER, TAB_STRING);
    }

    public static SubLObject set_object_monitor_tab_string(final SubLObject v_object_monitor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_object_monitor, value, FOUR_INTEGER, TAB_STRING);
    }

    public static SubLObject get_object_monitor_nesting_depth(final SubLObject v_object_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_object_monitor, THREE_INTEGER, NESTING_DEPTH);
    }

    public static SubLObject set_object_monitor_nesting_depth(final SubLObject v_object_monitor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_object_monitor, value, THREE_INTEGER, NESTING_DEPTH);
    }

    public static SubLObject get_object_monitor_stream(final SubLObject v_object_monitor) {
        return classes.subloop_get_instance_slot(v_object_monitor, TWO_INTEGER);
    }

    public static SubLObject set_object_monitor_stream(final SubLObject v_object_monitor, final SubLObject value) {
        return classes.subloop_set_instance_slot(v_object_monitor, value, TWO_INTEGER);
    }

    public static SubLObject get_object_monitor_subjects(final SubLObject v_object_monitor) {
        return classes.subloop_get_access_protected_instance_slot(v_object_monitor, ONE_INTEGER, SUBJECTS);
    }

    public static SubLObject set_object_monitor_subjects(final SubLObject v_object_monitor, final SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_object_monitor, value, ONE_INTEGER, SUBJECTS);
    }

    public static SubLObject get_object_monitor_monitoring_p(final SubLObject v_object_monitor) {
        return classes.ldb_test($int$4097, subloop_structures.instance_boolean_slots(v_object_monitor));
    }

    public static SubLObject set_object_monitor_monitoring_p(final SubLObject v_object_monitor, final SubLObject value) {
        subloop_structures._csetf_instance_boolean_slots(v_object_monitor, bytes.dpb(NIL != value ? ONE_INTEGER : ZERO_INTEGER, $int$4097, subloop_structures.instance_boolean_slots(v_object_monitor)));
        return value;
    }

    public static SubLObject subloop_reserved_initialize_object_monitor_class(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_object_monitor_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT_MONITOR, MONITORING_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT_MONITOR, SUBJECTS, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT_MONITOR, STREAM, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT_MONITOR, NESTING_DEPTH, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT_MONITOR, TAB_STRING, NIL);
        return NIL;
    }

    public static SubLObject object_monitor_p(final SubLObject v_object_monitor) {
        return classes.subloop_instanceof_class(v_object_monitor, OBJECT_MONITOR);
    }

    public static SubLObject object_monitor_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = NIL;
        SubLObject tab_string = get_object_monitor_tab_string(self);
        SubLObject nesting_depth = get_object_monitor_nesting_depth(self);
        SubLObject stream = get_object_monitor_stream(self);
        SubLObject subjects = get_object_monitor_subjects(self);
        SubLObject monitoring_p = get_object_monitor_monitoring_p(self);
        try {
            thread.throwStack.push($sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                object.object_initialize_method(self);
                monitoring_p = NIL;
                subjects = NIL;
                stream = T;
                nesting_depth = ZERO_INTEGER;
                tab_string = $str17$____;
                sublisp_throw($sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_object_monitor_tab_string(self, tab_string);
                    set_object_monitor_nesting_depth(self, nesting_depth);
                    set_object_monitor_stream(self, stream);
                    set_object_monitor_subjects(self, subjects);
                    set_object_monitor_monitoring_p(self, monitoring_p);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym16$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }

    public static SubLObject object_monitor_tab_to_depth_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = NIL;
        final SubLObject tab_string = get_object_monitor_tab_string(self);
        final SubLObject nesting_depth = get_object_monitor_nesting_depth(self);
        final SubLObject stream = get_object_monitor_stream(self);
        try {
            thread.throwStack.push($sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                SubLObject i;
                for (i = NIL, i = ZERO_INTEGER; i.numL(nesting_depth); i = add(i, ONE_INTEGER)) {
                    format(stream, tab_string);
                }
                sublisp_throw($sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_object_monitor_tab_string(self, tab_string);
                    set_object_monitor_nesting_depth(self, nesting_depth);
                    set_object_monitor_stream(self, stream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym21$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }

    public static SubLObject object_monitor_monitor_set_slot_method(final SubLObject self, final SubLObject target, final SubLObject new_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = NIL;
        final SubLObject stream = get_object_monitor_stream(self);
        try {
            thread.throwStack.push($sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                format(stream, $str27$__);
                object_monitor_tab_to_depth_method(self);
                format(stream, $str28$_SET_SLOT__S__S__S_, new SubLObject[]{ target, (NIL != slot_listeners.$active_slot_listener$.getDynamicValue(thread)) && (NIL != subloop_structures.slot_listener_p(slot_listeners.$active_slot_listener$.getDynamicValue(thread))) ? subloop_structures.sl_slot_name(slot_listeners.$active_slot_listener$.getDynamicValue(thread)) : $UNKNOWN_SLOT, new_value });
                sublisp_throw($sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_object_monitor_stream(self, stream);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym26$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }

    public static SubLObject object_monitor_monitor_before_method_method(final SubLObject self, final SubLObject instance_or_class, final SubLObject owning_method_name, SubLObject args) {
        SubLObject nesting_depth = get_object_monitor_nesting_depth(self);
        final SubLObject stream = get_object_monitor_stream(self);
        format(stream, $str27$__);
        object_monitor_tab_to_depth_method(self);
        SubLObject filtered_lambda_list = method_listeners.method_listeners_filtered_lambda_list(instance_or_class, owning_method_name);
        SubLObject current_var = NIL;
        SubLObject current_arg = NIL;
        if (NIL != subloop_structures.instance_p(instance_or_class)) {
            final SubLObject class_of_instance = subloop_structures.instance_class(instance_or_class);
            format(stream, $str35$Entered____S__S___S, new SubLObject[]{ owning_method_name, subloop_structures.class_name(class_of_instance), cons(instance_or_class, args) });
        } else
            if (NIL != subloop_structures.class_p(instance_or_class)) {
                format(stream, $str35$Entered____S__S___S, new SubLObject[]{ owning_method_name, subloop_structures.class_name(instance_or_class), args });
            } else {
                format(stream, $str36$Entered___S__S, owning_method_name, cons(owning_method_name, args));
            }

        while ((NIL != filtered_lambda_list) && (NIL != args)) {
            format(stream, $str27$__);
            object_monitor_tab_to_depth_method(self);
            current_var = filtered_lambda_list.first();
            current_arg = args.first();
            format(stream, $str37$Arg___S____S, current_var, current_arg);
            filtered_lambda_list = filtered_lambda_list.rest();
            args = args.rest();
        } 
        nesting_depth = add(nesting_depth, ONE_INTEGER);
        set_object_monitor_nesting_depth(self, nesting_depth);
        return NIL;
    }

    public static SubLObject object_monitor_monitor_after_method_method(final SubLObject self, final SubLObject instance_or_class, final SubLObject owning_method_name, final SubLObject args, final SubLObject result) {
        SubLObject nesting_depth = get_object_monitor_nesting_depth(self);
        final SubLObject stream = get_object_monitor_stream(self);
        nesting_depth = subtract(nesting_depth, ONE_INTEGER);
        set_object_monitor_nesting_depth(self, nesting_depth);
        format(stream, $str27$__);
        object_monitor_tab_to_depth_method(self);
        if (NIL != subloop_structures.instance_p(instance_or_class)) {
            final SubLObject class_of_instance = subloop_structures.instance_class(instance_or_class);
            format(stream, $str42$Returning____S__S___S_____S, new SubLObject[]{ owning_method_name, subloop_structures.class_name(class_of_instance), cons(instance_or_class, args), result });
        } else
            if (NIL != subloop_structures.class_p(instance_or_class)) {
                format(stream, $str42$Returning____S__S___S_____S, new SubLObject[]{ owning_method_name, subloop_structures.class_name(instance_or_class), args, result });
            } else {
                format(stream, $str43$Returning___S__S_____S, new SubLObject[]{ owning_method_name, cons(owning_method_name, args), result });
            }

        return NIL;
    }

    public static SubLObject object_monitor_monitor_method(final SubLObject self, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = NIL;
        SubLObject subjects = get_object_monitor_subjects(self);
        final SubLObject monitoring_p = get_object_monitor_monitoring_p(self);
        try {
            thread.throwStack.push($sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                if (NIL != subloop_structures.instance_p(target)) {
                    if (NIL == member(target, subjects, symbol_function(EQL), symbol_function(IDENTITY))) {
                        subjects = cons(target, subjects);
                    }
                    if (NIL != monitoring_p) {
                        object_monitor_monitor_instance_method(self, target);
                    }
                    sublisp_throw($sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, T);
                }
                sublisp_throw($sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_object_monitor_subjects(self, subjects);
                    set_object_monitor_monitoring_p(self, monitoring_p);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym48$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }

    public static SubLObject object_monitor_unmonitor_method(final SubLObject self, final SubLObject target) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = NIL;
        SubLObject subjects = get_object_monitor_subjects(self);
        final SubLObject monitoring_p = get_object_monitor_monitoring_p(self);
        try {
            thread.throwStack.push($sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                if (NIL != member(target, subjects, symbol_function(EQ), UNPROVIDED)) {
                    subjects = delete(target, subjects, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != monitoring_p) {
                        object.object_remove_all_set_slot_listeners_method(self, target, UNPROVIDED);
                    }
                    sublisp_throw($sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, T);
                }
                sublisp_throw($sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, NIL);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_object_monitor_subjects(self, subjects);
                    set_object_monitor_monitoring_p(self, monitoring_p);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym52$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }

    public static SubLObject object_monitor_monitor_instance_method(final SubLObject self, final SubLObject target) {
        SubLObject v_slots = NIL;
        SubLObject method_names = NIL;
        SubLObject cdolist_list_var;
        v_slots = cdolist_list_var = instances.instances_all_any_instance_slots(target);
        SubLObject slot = NIL;
        slot = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            object.object_add_set_slot_listener_method(self, target, slot, MONITOR_SET_SLOT);
            cdolist_list_var = cdolist_list_var.rest();
            slot = cdolist_list_var.first();
        } 
        method_names = cdolist_list_var = methods.methods_get_all_method_names(target);
        SubLObject method_name = NIL;
        method_name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            object.object_add_class_wide_before_method_listener_method(self, target, method_name, MONITOR_BEFORE_METHOD);
            object.object_add_class_wide_after_method_listener_method(self, target, method_name, MONITOR_AFTER_METHOD);
            cdolist_list_var = cdolist_list_var.rest();
            method_name = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject object_monitor_start_monitoring_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = NIL;
        final SubLObject subjects = get_object_monitor_subjects(self);
        SubLObject monitoring_p = get_object_monitor_monitoring_p(self);
        try {
            thread.throwStack.push($sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                SubLObject cdolist_list_var = subjects;
                SubLObject target = NIL;
                target = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    object_monitor_monitor_instance_method(self, target);
                    cdolist_list_var = cdolist_list_var.rest();
                    target = cdolist_list_var.first();
                } 
                monitoring_p = T;
                sublisp_throw($sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_object_monitor_subjects(self, subjects);
                    set_object_monitor_monitoring_p(self, monitoring_p);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym59$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }

    public static SubLObject object_monitor_stop_monitoring_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_object_monitor_method = NIL;
        final SubLObject subjects = get_object_monitor_subjects(self);
        SubLObject monitoring_p = get_object_monitor_monitoring_p(self);
        try {
            thread.throwStack.push($sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
            try {
                if (NIL != monitoring_p) {
                    SubLObject cdolist_list_var = subjects;
                    SubLObject target = NIL;
                    target = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        object.object_remove_all_set_slot_listeners_method(self, target, UNPROVIDED);
                        object.object_remove_all_class_wide_method_listeners_method(self, target, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        target = cdolist_list_var.first();
                    } 
                    monitoring_p = NIL;
                }
                sublisp_throw($sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD, T);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_object_monitor_subjects(self, subjects);
                    set_object_monitor_monitoring_p(self, monitoring_p);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_object_monitor_method = Errors.handleThrowable(ccatch_env_var, $sym63$OUTER_CATCH_FOR_OBJECT_MONITOR_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_object_monitor_method;
    }

    public static SubLObject declare_object_monitor_file() {
        declareFunction(me, "get_object_monitor_tab_string", "GET-OBJECT-MONITOR-TAB-STRING", 1, 0, false);
        declareFunction(me, "set_object_monitor_tab_string", "SET-OBJECT-MONITOR-TAB-STRING", 2, 0, false);
        declareFunction(me, "get_object_monitor_nesting_depth", "GET-OBJECT-MONITOR-NESTING-DEPTH", 1, 0, false);
        declareFunction(me, "set_object_monitor_nesting_depth", "SET-OBJECT-MONITOR-NESTING-DEPTH", 2, 0, false);
        declareFunction(me, "get_object_monitor_stream", "GET-OBJECT-MONITOR-STREAM", 1, 0, false);
        declareFunction(me, "set_object_monitor_stream", "SET-OBJECT-MONITOR-STREAM", 2, 0, false);
        declareFunction(me, "get_object_monitor_subjects", "GET-OBJECT-MONITOR-SUBJECTS", 1, 0, false);
        declareFunction(me, "set_object_monitor_subjects", "SET-OBJECT-MONITOR-SUBJECTS", 2, 0, false);
        declareFunction(me, "get_object_monitor_monitoring_p", "GET-OBJECT-MONITOR-MONITORING-P", 1, 0, false);
        declareFunction(me, "set_object_monitor_monitoring_p", "SET-OBJECT-MONITOR-MONITORING-P", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_object_monitor_class", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_object_monitor_instance", "SUBLOOP-RESERVED-INITIALIZE-OBJECT-MONITOR-INSTANCE", 1, 0, false);
        declareFunction(me, "object_monitor_p", "OBJECT-MONITOR-P", 1, 0, false);
        declareFunction(me, "object_monitor_initialize_method", "OBJECT-MONITOR-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "object_monitor_tab_to_depth_method", "OBJECT-MONITOR-TAB-TO-DEPTH-METHOD", 1, 0, false);
        declareFunction(me, "object_monitor_monitor_set_slot_method", "OBJECT-MONITOR-MONITOR-SET-SLOT-METHOD", 3, 0, false);
        declareFunction(me, "object_monitor_monitor_before_method_method", "OBJECT-MONITOR-MONITOR-BEFORE-METHOD-METHOD", 4, 0, false);
        declareFunction(me, "object_monitor_monitor_after_method_method", "OBJECT-MONITOR-MONITOR-AFTER-METHOD-METHOD", 5, 0, false);
        declareFunction(me, "object_monitor_monitor_method", "OBJECT-MONITOR-MONITOR-METHOD", 2, 0, false);
        declareFunction(me, "object_monitor_unmonitor_method", "OBJECT-MONITOR-UNMONITOR-METHOD", 2, 0, false);
        declareFunction(me, "object_monitor_monitor_instance_method", "OBJECT-MONITOR-MONITOR-INSTANCE-METHOD", 2, 0, false);
        declareFunction(me, "object_monitor_start_monitoring_method", "OBJECT-MONITOR-START-MONITORING-METHOD", 1, 0, false);
        declareFunction(me, "object_monitor_stop_monitoring_method", "OBJECT-MONITOR-STOP-MONITORING-METHOD", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_object_monitor_file() {
        return NIL;
    }

    public static SubLObject setup_object_monitor_file() {
        classes.subloop_new_class(OBJECT_MONITOR, OBJECT, NIL, NIL, $list2);
        classes.class_set_implements_slot_listeners(OBJECT_MONITOR, NIL);
        classes.subloop_note_class_initialization_function(OBJECT_MONITOR, SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_CLASS);
        classes.subloop_note_instance_initialization_function(OBJECT_MONITOR, SUBLOOP_RESERVED_INITIALIZE_OBJECT_MONITOR_INSTANCE);
        subloop_reserved_initialize_object_monitor_class(OBJECT_MONITOR);
        methods.methods_incorporate_instance_method(INITIALIZE, OBJECT_MONITOR, NIL, NIL, $list15);
        methods.subloop_register_instance_method(OBJECT_MONITOR, INITIALIZE, OBJECT_MONITOR_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(TAB_TO_DEPTH, OBJECT_MONITOR, NIL, NIL, $list20);
        methods.subloop_register_instance_method(OBJECT_MONITOR, TAB_TO_DEPTH, OBJECT_MONITOR_TAB_TO_DEPTH_METHOD);
        methods.methods_incorporate_instance_method(MONITOR_SET_SLOT, OBJECT_MONITOR, NIL, $list24, $list25);
        methods.subloop_register_instance_method(OBJECT_MONITOR, MONITOR_SET_SLOT, OBJECT_MONITOR_MONITOR_SET_SLOT_METHOD);
        methods.methods_incorporate_instance_method(MONITOR_BEFORE_METHOD, OBJECT_MONITOR, $list32, $list33, $list34);
        methods.subloop_register_instance_method(OBJECT_MONITOR, MONITOR_BEFORE_METHOD, OBJECT_MONITOR_MONITOR_BEFORE_METHOD_METHOD);
        methods.methods_incorporate_instance_method(MONITOR_AFTER_METHOD, OBJECT_MONITOR, $list32, $list40, $list41);
        methods.subloop_register_instance_method(OBJECT_MONITOR, MONITOR_AFTER_METHOD, OBJECT_MONITOR_MONITOR_AFTER_METHOD_METHOD);
        methods.methods_incorporate_instance_method(MONITOR, OBJECT_MONITOR, NIL, $list46, $list47);
        methods.subloop_register_instance_method(OBJECT_MONITOR, MONITOR, OBJECT_MONITOR_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(UNMONITOR, OBJECT_MONITOR, NIL, $list46, $list51);
        methods.subloop_register_instance_method(OBJECT_MONITOR, UNMONITOR, OBJECT_MONITOR_UNMONITOR_METHOD);
        methods.methods_incorporate_instance_method(MONITOR_INSTANCE, OBJECT_MONITOR, NIL, $list46, $list55);
        methods.subloop_register_instance_method(OBJECT_MONITOR, MONITOR_INSTANCE, OBJECT_MONITOR_MONITOR_INSTANCE_METHOD);
        methods.methods_incorporate_instance_method(START_MONITORING, OBJECT_MONITOR, NIL, NIL, $list58);
        methods.subloop_register_instance_method(OBJECT_MONITOR, START_MONITORING, OBJECT_MONITOR_START_MONITORING_METHOD);
        methods.methods_incorporate_instance_method(STOP_MONITORING, OBJECT_MONITOR, NIL, NIL, $list62);
        methods.subloop_register_instance_method(OBJECT_MONITOR, STOP_MONITORING, OBJECT_MONITOR_STOP_MONITORING_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_object_monitor_file();
    }

    @Override
    public void initializeVariables() {
        init_object_monitor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_object_monitor_file();
    }

    
}

/**
 * Total time: 324 ms
 */
