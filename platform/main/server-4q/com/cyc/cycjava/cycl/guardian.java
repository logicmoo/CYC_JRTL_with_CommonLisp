package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.fixnump;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class guardian extends SubLTranslatedFile {
    public static final SubLFile me = new guardian();

    public static final String myName = "com.cyc.cycjava.cycl.guardian";

    public static final String myFingerPrint = "3a3b16988554cf89585c61272ca1a845d9361bb184460df72f3570e66cd539a3";





    // deflexical
    private static final SubLSymbol $guardian_timeslice$ = makeSymbol("*GUARDIAN-TIMESLICE*");



    // defconstant
    public static final SubLSymbol $dtp_guardian_request$ = makeSymbol("*DTP-GUARDIAN-REQUEST*");





    // Internal Constants
    public static final SubLSymbol $guardian_process$ = makeSymbol("*GUARDIAN-PROCESS*");

    public static final SubLSymbol $guarding_requests$ = makeSymbol("*GUARDING-REQUESTS*");

    public static final SubLSymbol $guardian_isg$ = makeSymbol("*GUARDIAN-ISG*");

    public static final SubLSymbol GUARDIAN_REQUEST = makeSymbol("GUARDIAN-REQUEST");

    public static final SubLSymbol GUARDIAN_REQUEST_P = makeSymbol("GUARDIAN-REQUEST-P");

    public static final SubLList $list5 = list(makeSymbol("ID"), makeSymbol("CHECKER-FN"), makeSymbol("PARAMETER"), makeSymbol("NOTIFICATION-FN"), makeSymbol("INTERRUPT-P"), makeSymbol("PROCESS"));

    public static final SubLList $list6 = list(makeKeyword("ID"), makeKeyword("CHECKER-FN"), makeKeyword("PARAMETER"), makeKeyword("NOTIFICATION-FN"), makeKeyword("INTERRUPT-P"), makeKeyword("PROCESS"));

    public static final SubLList $list7 = list(makeSymbol("GUARDIAN-REQUEST-ID"), makeSymbol("GUARDIAN-REQUEST-CHECKER-FN"), makeSymbol("GUARDIAN-REQUEST-PARAMETER"), makeSymbol("GUARDIAN-REQUEST-NOTIFICATION-FN"), makeSymbol("GUARDIAN-REQUEST-INTERRUPT-P"), makeSymbol("GUARDIAN-REQUEST-PROCESS"));

    public static final SubLList $list8 = list(makeSymbol("_CSETF-GUARDIAN-REQUEST-ID"), makeSymbol("_CSETF-GUARDIAN-REQUEST-CHECKER-FN"), makeSymbol("_CSETF-GUARDIAN-REQUEST-PARAMETER"), makeSymbol("_CSETF-GUARDIAN-REQUEST-NOTIFICATION-FN"), makeSymbol("_CSETF-GUARDIAN-REQUEST-INTERRUPT-P"), makeSymbol("_CSETF-GUARDIAN-REQUEST-PROCESS"));

    public static final SubLSymbol PRINT_GUARDIAN_REQUEST = makeSymbol("PRINT-GUARDIAN-REQUEST");

    public static final SubLSymbol GUARDIAN_REQUEST_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("GUARDIAN-REQUEST-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("GUARDIAN-REQUEST-P"));

    private static final SubLSymbol GUARDIAN_REQUEST_ID = makeSymbol("GUARDIAN-REQUEST-ID");

    private static final SubLSymbol _CSETF_GUARDIAN_REQUEST_ID = makeSymbol("_CSETF-GUARDIAN-REQUEST-ID");

    private static final SubLSymbol GUARDIAN_REQUEST_CHECKER_FN = makeSymbol("GUARDIAN-REQUEST-CHECKER-FN");

    private static final SubLSymbol _CSETF_GUARDIAN_REQUEST_CHECKER_FN = makeSymbol("_CSETF-GUARDIAN-REQUEST-CHECKER-FN");

    private static final SubLSymbol GUARDIAN_REQUEST_PARAMETER = makeSymbol("GUARDIAN-REQUEST-PARAMETER");

    private static final SubLSymbol _CSETF_GUARDIAN_REQUEST_PARAMETER = makeSymbol("_CSETF-GUARDIAN-REQUEST-PARAMETER");

    private static final SubLSymbol GUARDIAN_REQUEST_NOTIFICATION_FN = makeSymbol("GUARDIAN-REQUEST-NOTIFICATION-FN");

    private static final SubLSymbol _CSETF_GUARDIAN_REQUEST_NOTIFICATION_FN = makeSymbol("_CSETF-GUARDIAN-REQUEST-NOTIFICATION-FN");

    private static final SubLSymbol GUARDIAN_REQUEST_INTERRUPT_P = makeSymbol("GUARDIAN-REQUEST-INTERRUPT-P");

    private static final SubLSymbol _CSETF_GUARDIAN_REQUEST_INTERRUPT_P = makeSymbol("_CSETF-GUARDIAN-REQUEST-INTERRUPT-P");

    private static final SubLSymbol GUARDIAN_REQUEST_PROCESS = makeSymbol("GUARDIAN-REQUEST-PROCESS");

    private static final SubLSymbol _CSETF_GUARDIAN_REQUEST_PROCESS = makeSymbol("_CSETF-GUARDIAN-REQUEST-PROCESS");













    private static final SubLString $str30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_GUARDIAN_REQUEST = makeSymbol("MAKE-GUARDIAN-REQUEST");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_GUARDIAN_REQUEST_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-GUARDIAN-REQUEST-METHOD");

    private static final SubLString $str36$__GUARDIAN_REQUEST__A__check__A_a = makeString("#<GUARDIAN-REQUEST ~A: check ~A argument ~A notify ~A via ~A using ~A>");

    private static final SubLString $$$INTERRUPT = makeString("INTERRUPT");

    private static final SubLString $$$FUNCALL = makeString("FUNCALL");





    private static final SubLSymbol VALID_PROCESS_P = makeSymbol("VALID-PROCESS-P");

    private static final SubLSymbol SCHEDULE_GUARDIAN_REQUEST = makeSymbol("SCHEDULE-GUARDIAN-REQUEST");

    private static final SubLList $list43 = list(makeSymbol("CHECKER-FN"), makeSymbol("PARAMETER"), makeSymbol("NOTIFICATION-FN"), makeSymbol("&OPTIONAL"), makeSymbol("PROCESS"), makeSymbol("INTERRUPT-P"));

    private static final SubLString $str44$Schedule_a_guardian_request___fun = makeString("Schedule a guardian request. (funcall checker-fn parameter) will be called\n   until it returns NIL. \n   In this case, the requesting process is notified, either via FUNCALL or INTERRUPT-PROCESS-WITH-ARGS\n   and passed the parameter one last time; the INTERRUPT-P flag decides which one it is; FUNCALL is default.\n   @note use FUNCALL when the function invoked cannot or need not run in the process being notified;\n   for example, TERMINATE-ACTIVE-TASK-PROCESS already calls INTERRRUPT-PROCESS, and not all LISP implementation\n   actually handle that gracefully, so there FUNCALL is sufficient.\n   @return the ticked for the guardian request");

    private static final SubLList $list45 = list(list(makeSymbol("CHECKER-FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("NOTIFICATION-FN"), makeSymbol("FUNCTION-SPEC-P")), list(makeSymbol("INTERRUPT-P"), makeSymbol("BOOLEANP")));

    private static final SubLList $list46 = list(makeSymbol("FIXNUMP"));

    private static final SubLSymbol GUARDIAN_REQUEST_ID_P = makeSymbol("GUARDIAN-REQUEST-ID-P");

    public static final SubLList $list48 = list(makeSymbol("REQUEST-ID"));

    private static final SubLString $str49$Determine_whether_this_is_a_prope = makeString("Determine whether this is a proper guardian request id.");

    public static final SubLList $list50 = list(makeSymbol("BOOLEANP"));



    private static final SubLSymbol CANCEL_GUARDIAN_REQUEST = makeSymbol("CANCEL-GUARDIAN-REQUEST");

    private static final SubLString $str53$Abort_a_guardian_request_that_is_ = makeString("Abort a guardian request that is currently scheduled to be checked.\n   @return T");

    private static final SubLList $list54 = list(list(makeSymbol("REQUEST-ID"), makeSymbol("FIXNUMP")));

    private static final SubLList $list55 = list(makeSymbol("SYMBOLP"));

    private static final SubLList $list56 = list(list(makeSymbol("CHECKER-FN"), makeSymbol("PARAMETER"), makeSymbol("NOTIFICATION-FN")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym57$REQUEST_ID = makeUninternedSymbol("REQUEST-ID");



    private static final SubLList $list59 = list(makeSymbol("ENSURE-GUARDIAN-RUNNING"));







    private static final SubLSymbol WITH_GUARDIAN_REQUEST = makeSymbol("WITH-GUARDIAN-REQUEST");

    private static final SubLString $str64$Setup_a_guardian_request_and_canc = makeString("Setup a guardian request and cancel if necessary.");

    private static final SubLSymbol ACTIVE_GUARDIAN_REQUESTS = makeSymbol("ACTIVE-GUARDIAN-REQUESTS");

    private static final SubLString $str66$The_active_guardian_requests_____ = makeString("The active guardian requests.\n   @return 0 the elements on the request queue\n   @return 1 the UnivTime Stamp of the contents");

    private static final SubLString $str67$Currrently_no_guardian_active_ = makeString("Currrently no guardian active.");

    private static final SubLString $$$Active_Guardian_Requests_at_ = makeString("Active Guardian Requests at ");

    private static final SubLSymbol INITIALIZE_GUARDIAN = makeSymbol("INITIALIZE-GUARDIAN");

    private static final SubLString $str70$Starts_the_guardian_unless_it_is_ = makeString("Starts the guardian unless it is running.");

    private static final SubLSymbol $guardian_shutdown_marker$ = makeSymbol("*GUARDIAN-SHUTDOWN-MARKER*");

    private static final SubLString $$$Guardian_Shutdown_Marker = makeString("Guardian Shutdown Marker");

    private static final SubLSymbol STOP_GUARDIAN = makeSymbol("STOP-GUARDIAN");

    private static final SubLString $str74$Tell_the_guardian_to_shut_itself_ = makeString("Tell the guardian to shut itself down.");

    private static final SubLString $$$Guardian_Process = makeString("Guardian Process");

    private static final SubLSymbol GUARDIAN_HANDLER = makeSymbol("GUARDIAN-HANDLER");

    private static final SubLSymbol START_GUARDIAN = makeSymbol("START-GUARDIAN");

    private static final SubLString $str78$Launch_the_guardian_process__pote = makeString("Launch the guardian process, potentially overwriting an existing ");

    private static final SubLSymbol ENSURE_GUARDIAN_RUNNING = makeSymbol("ENSURE-GUARDIAN-RUNNING");

    private static final SubLString $str80$Launch_the_guardian_process_if_it = makeString("Launch the guardian process if it is not currently running.");

    private static final SubLSymbol $guardian_sleep_marker$ = makeSymbol("*GUARDIAN-SLEEP-MARKER*");

    private static final SubLString $$$Guardian_Sleep_Marker = makeString("Guardian Sleep Marker");

    private static final SubLString $str83$Connection_Guardian_Requests_ = makeString("Connection Guardian Requests)");





    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    public static SubLObject guardian_request_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_guardian_request(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject guardian_request_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$guardian_request_native.class ? T : NIL;
    }

    public static SubLObject guardian_request_id(final SubLObject v_object) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject guardian_request_checker_fn(final SubLObject v_object) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject guardian_request_parameter(final SubLObject v_object) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject guardian_request_notification_fn(final SubLObject v_object) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject guardian_request_interrupt_p(final SubLObject v_object) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject guardian_request_process(final SubLObject v_object) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_guardian_request_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_guardian_request_checker_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_guardian_request_parameter(final SubLObject v_object, final SubLObject value) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_guardian_request_notification_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_guardian_request_interrupt_p(final SubLObject v_object, final SubLObject value) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_guardian_request_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != guardian_request_p(v_object) : "guardian.guardian_request_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_guardian_request(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $guardian_request_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                _csetf_guardian_request_id(v_new, current_value);
            } else
                if (pcase_var.eql($CHECKER_FN)) {
                    _csetf_guardian_request_checker_fn(v_new, current_value);
                } else
                    if (pcase_var.eql($PARAMETER)) {
                        _csetf_guardian_request_parameter(v_new, current_value);
                    } else
                        if (pcase_var.eql($NOTIFICATION_FN)) {
                            _csetf_guardian_request_notification_fn(v_new, current_value);
                        } else
                            if (pcase_var.eql($INTERRUPT_P)) {
                                _csetf_guardian_request_interrupt_p(v_new, current_value);
                            } else
                                if (pcase_var.eql($PROCESS)) {
                                    _csetf_guardian_request_process(v_new, current_value);
                                } else {
                                    Errors.error($str30$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_guardian_request(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_GUARDIAN_REQUEST, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, guardian_request_id(obj));
        funcall(visitor_fn, obj, $SLOT, $CHECKER_FN, guardian_request_checker_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $PARAMETER, guardian_request_parameter(obj));
        funcall(visitor_fn, obj, $SLOT, $NOTIFICATION_FN, guardian_request_notification_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $INTERRUPT_P, guardian_request_interrupt_p(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESS, guardian_request_process(obj));
        funcall(visitor_fn, obj, $END, MAKE_GUARDIAN_REQUEST, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_guardian_request_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_guardian_request(obj, visitor_fn);
    }

    public static SubLObject new_guardian_request(final SubLObject checker_fn, final SubLObject parameter, final SubLObject notification_fn, final SubLObject process, final SubLObject interrupt_p) {
        return make_guardian_request(list(new SubLObject[]{ $ID, integer_sequence_generator.integer_sequence_generator_next($guardian_isg$.getGlobalValue()), $CHECKER_FN, checker_fn, $PARAMETER, parameter, $NOTIFICATION_FN, notification_fn, $PROCESS, process, $INTERRUPT_P, interrupt_p }));
    }

    public static SubLObject print_guardian_request(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str36$__GUARDIAN_REQUEST__A__check__A_a, new SubLObject[]{ guardian_request_id(v_object), guardian_request_checker_fn(v_object), guardian_request_parameter(v_object), guardian_request_process(v_object), guardian_request_notification_fn(v_object), NIL != guardian_request_interrupt_p(v_object) ? $$$INTERRUPT : $$$FUNCALL });
        return v_object;
    }

    public static SubLObject schedule_guardian_request(final SubLObject checker_fn, final SubLObject parameter, final SubLObject notification_fn, SubLObject process, SubLObject interrupt_p) {
        if (process == UNPROVIDED) {
            process = NIL;
        }
        if (interrupt_p == UNPROVIDED) {
            interrupt_p = NIL;
        }
        SubLTrampolineFile.enforceType(checker_fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(notification_fn, FUNCTION_SPEC_P);
        SubLTrampolineFile.enforceType(interrupt_p, BOOLEANP);
        if (NIL == process) {
            process = current_process();
        }
        assert NIL != valid_process_p(process) : "Threads.valid_process_p(process) " + "CommonSymbols.NIL != Threads.valid_process_p(process) " + process;
        if (NIL == process_utilities.ipc_queue_p($guarding_requests$.getGlobalValue())) {
            return NIL;
        }
        final SubLObject request = new_guardian_request(checker_fn, parameter, notification_fn, process, interrupt_p);
        final SubLObject request_id = guardian_request_id(request);
        process_utilities.ipc_enqueue(request, $guarding_requests$.getGlobalValue(), UNPROVIDED);
        return request_id;
    }

    public static SubLObject guardian_request_id_p(final SubLObject request_id) {
        return fixnump(request_id);
    }

    public static SubLObject cancel_guardian_request(final SubLObject request_id) {
        SubLTrampolineFile.enforceType(request_id, FIXNUMP);
        if (NIL != process_utilities.ipc_queue_p($guarding_requests$.getGlobalValue())) {
            process_utilities.ipc_enqueue(request_id, $guarding_requests$.getGlobalValue(), UNPROVIDED);
        }
        return request_id;
    }

    public static SubLObject with_guardian_request(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject checker_fn = NIL;
        SubLObject parameter = NIL;
        SubLObject notification_fn = NIL;
        destructuring_bind_must_consp(current, datum, $list56);
        checker_fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        parameter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list56);
        notification_fn = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject request_id = $sym57$REQUEST_ID;
            return list(PROGN, $list59, list(CLET, list(list(request_id, list(SCHEDULE_GUARDIAN_REQUEST, checker_fn, parameter, notification_fn))), bq_cons(CUNWIND_PROTECT, append(body, list(list(PWHEN, list(GUARDIAN_REQUEST_ID_P, request_id), list(CANCEL_GUARDIAN_REQUEST, request_id)))))));
        }
        cdestructuring_bind_error(datum, $list56);
        return NIL;
    }

    public static SubLObject active_guardian_requests() {
        if (NIL != process_utilities.ipc_queue_p($guarding_requests$.getGlobalValue())) {
            return process_utilities.ipc_current_queue_content($guarding_requests$.getGlobalValue());
        }
        return values(NIL, get_universal_time());
    }

    public static SubLObject print_active_guardian_requests(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == current_guardian_process()) {
            terpri(stream);
            write_string($str67$Currrently_no_guardian_active_, stream, UNPROVIDED, UNPROVIDED);
            return stream;
        }
        thread.resetMultipleValues();
        final SubLObject contents = active_guardian_requests();
        final SubLObject time_stamp = thread.secondMultipleValue();
        thread.resetMultipleValues();
        terpri(stream);
        write_string($$$Active_Guardian_Requests_at_, stream, UNPROVIDED, UNPROVIDED);
        write_string(numeric_date_utilities.timestring(time_stamp), stream, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = contents;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            print(entry, stream);
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return stream;
    }

    public static SubLObject current_guardian_process() {
        return $guardian_process$.getGlobalValue();
    }

    public static SubLObject initialize_guardian() {
        if (NIL != valid_process_p(current_guardian_process())) {
            stop_guardian();
        }
        start_guardian();
        return valid_process_p(current_guardian_process());
    }

    public static SubLObject stop_guardian() {
        if (NIL != process_utilities.ipc_queue_p($guarding_requests$.getGlobalValue())) {
            process_utilities.ipc_enqueue($guardian_shutdown_marker$.getGlobalValue(), $guarding_requests$.getGlobalValue(), UNPROVIDED);
        }
        SubLObject small_number;
        SubLObject i;
        for (small_number = TEN_INTEGER, i = NIL, i = ZERO_INTEGER; i.numL(small_number); i = add(i, ONE_INTEGER)) {
            if (NIL != valid_process_p(current_guardian_process())) {
                sleep(ZERO_INTEGER);
            }
        }
        return makeBoolean(NIL == valid_process_p(current_guardian_process()));
    }

    public static SubLObject start_guardian() {
        make_process($$$Guardian_Process, GUARDIAN_HANDLER);
        SubLObject small_number;
        SubLObject i;
        for (small_number = TEN_INTEGER, i = NIL, i = ZERO_INTEGER; i.numL(small_number); i = add(i, ONE_INTEGER)) {
            if (NIL == valid_process_p(current_guardian_process())) {
                sleep(ZERO_INTEGER);
            }
        }
        return valid_process_p(current_guardian_process());
    }

    public static SubLObject ensure_guardian_running() {
        if (NIL == valid_process_p(current_guardian_process())) {
            start_guardian();
        }
        return valid_process_p(current_guardian_process());
    }

    public static SubLObject is_guardian_shutdown_marker(final SubLObject marker) {
        return eq(marker, $guardian_shutdown_marker$.getGlobalValue());
    }

    public static SubLObject guardian_handler() {
        final SubLObject deleted = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        final SubLObject queue = process_utilities.new_ipc_queue($str83$Connection_Guardian_Requests_);
        SubLObject add_sleep_markerP = T;
        SubLObject doneP = NIL;
        $guardian_process$.setGlobalValue(current_process());
        $guarding_requests$.setGlobalValue(queue);
        try {
            while (NIL == doneP) {
                final SubLObject request = process_utilities.ipc_dequeue(queue, UNPROVIDED);
                if (NIL != add_sleep_markerP) {
                    process_utilities.ipc_enqueue($guardian_sleep_marker$.getGlobalValue(), queue, UNPROVIDED);
                    add_sleep_markerP = NIL;
                }
                if ($guardian_sleep_marker$.getGlobalValue().eql(request)) {
                    if (process_utilities.ipc_current_queue_size(queue).isZero()) {
                        if (NIL == dictionary.dictionary_empty_p(deleted)) {
                            dictionary.clear_dictionary(deleted);
                        }
                    } else {
                        sleep($guardian_timeslice$.getGlobalValue());
                    }
                    add_sleep_markerP = T;
                } else
                    if (NIL != is_guardian_shutdown_marker(request)) {
                        doneP = T;
                    } else
                        if (request.isFixnum()) {
                            if (NIL != dictionary.dictionary_lookup(deleted, request, UNPROVIDED)) {
                                continue;
                            }
                            dictionary.dictionary_enter(deleted, request, $DELETE);
                        } else {
                            if (NIL == guardian_request_p(request)) {
                                continue;
                            }
                            final SubLObject id = guardian_request_id(request);
                            if (NIL != dictionary.dictionary_lookup(deleted, id, UNPROVIDED)) {
                                dictionary.dictionary_remove(deleted, id);
                            } else
                                if ((NIL == valid_process_p(guardian_request_process(request))) || (NIL == check_guardian_request(request))) {
                                    dictionary.dictionary_enter(deleted, guardian_request_id(request), $DELETE);
                                } else {
                                    process_utilities.ipc_enqueue(request, queue, UNPROVIDED);
                                }

                        }


            } 
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if ($guardian_process$.getGlobalValue().eql(current_process())) {
                    $guardian_process$.setGlobalValue(NIL);
                }
                if ($guarding_requests$.getGlobalValue().eql(queue)) {
                    $guarding_requests$.setGlobalValue(NIL);
                }
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return NIL;
    }

    public static SubLObject check_guardian_request(final SubLObject request) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject value = $CHECK_FAILED;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    value = list_utilities.sublisp_boolean(funcall(guardian_request_checker_fn(request), guardian_request_parameter(request)));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (value == $CHECK_FAILED) {
            value = NIL;
        }
        if (NIL == value) {
            SubLObject ignore_errors_tag_$1 = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_2 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        if (NIL != guardian_request_interrupt_p(request)) {
                            subl_promotions.interrupt_process_with_args(guardian_request_process(request), guardian_request_notification_fn(request), guardian_request_parameter(request));
                        } else {
                            funcall(guardian_request_notification_fn(request), guardian_request_parameter(request));
                        }
                    } catch (final Throwable catch_var2) {
                        Errors.handleThrowable(catch_var2, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_2, thread);
                }
            } catch (final Throwable ccatch_env_var2) {
                ignore_errors_tag_$1 = Errors.handleThrowable(ccatch_env_var2, $IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        return list_utilities.sublisp_boolean(value);
    }

    public static SubLObject declare_guardian_file() {
        declareFunction(me, "guardian_request_print_function_trampoline", "GUARDIAN-REQUEST-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "guardian_request_p", "GUARDIAN-REQUEST-P", 1, 0, false);
        new guardian.$guardian_request_p$UnaryFunction();
        declareFunction(me, "guardian_request_id", "GUARDIAN-REQUEST-ID", 1, 0, false);
        declareFunction(me, "guardian_request_checker_fn", "GUARDIAN-REQUEST-CHECKER-FN", 1, 0, false);
        declareFunction(me, "guardian_request_parameter", "GUARDIAN-REQUEST-PARAMETER", 1, 0, false);
        declareFunction(me, "guardian_request_notification_fn", "GUARDIAN-REQUEST-NOTIFICATION-FN", 1, 0, false);
        declareFunction(me, "guardian_request_interrupt_p", "GUARDIAN-REQUEST-INTERRUPT-P", 1, 0, false);
        declareFunction(me, "guardian_request_process", "GUARDIAN-REQUEST-PROCESS", 1, 0, false);
        declareFunction(me, "_csetf_guardian_request_id", "_CSETF-GUARDIAN-REQUEST-ID", 2, 0, false);
        declareFunction(me, "_csetf_guardian_request_checker_fn", "_CSETF-GUARDIAN-REQUEST-CHECKER-FN", 2, 0, false);
        declareFunction(me, "_csetf_guardian_request_parameter", "_CSETF-GUARDIAN-REQUEST-PARAMETER", 2, 0, false);
        declareFunction(me, "_csetf_guardian_request_notification_fn", "_CSETF-GUARDIAN-REQUEST-NOTIFICATION-FN", 2, 0, false);
        declareFunction(me, "_csetf_guardian_request_interrupt_p", "_CSETF-GUARDIAN-REQUEST-INTERRUPT-P", 2, 0, false);
        declareFunction(me, "_csetf_guardian_request_process", "_CSETF-GUARDIAN-REQUEST-PROCESS", 2, 0, false);
        declareFunction(me, "make_guardian_request", "MAKE-GUARDIAN-REQUEST", 0, 1, false);
        declareFunction(me, "visit_defstruct_guardian_request", "VISIT-DEFSTRUCT-GUARDIAN-REQUEST", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_guardian_request_method", "VISIT-DEFSTRUCT-OBJECT-GUARDIAN-REQUEST-METHOD", 2, 0, false);
        declareFunction(me, "new_guardian_request", "NEW-GUARDIAN-REQUEST", 5, 0, false);
        declareFunction(me, "print_guardian_request", "PRINT-GUARDIAN-REQUEST", 3, 0, false);
        declareFunction(me, "schedule_guardian_request", "SCHEDULE-GUARDIAN-REQUEST", 3, 2, false);
        declareFunction(me, "guardian_request_id_p", "GUARDIAN-REQUEST-ID-P", 1, 0, false);
        declareFunction(me, "cancel_guardian_request", "CANCEL-GUARDIAN-REQUEST", 1, 0, false);
        declareMacro(me, "with_guardian_request", "WITH-GUARDIAN-REQUEST");
        declareFunction(me, "active_guardian_requests", "ACTIVE-GUARDIAN-REQUESTS", 0, 0, false);
        declareFunction(me, "print_active_guardian_requests", "PRINT-ACTIVE-GUARDIAN-REQUESTS", 0, 1, false);
        declareFunction(me, "current_guardian_process", "CURRENT-GUARDIAN-PROCESS", 0, 0, false);
        declareFunction(me, "initialize_guardian", "INITIALIZE-GUARDIAN", 0, 0, false);
        declareFunction(me, "stop_guardian", "STOP-GUARDIAN", 0, 0, false);
        declareFunction(me, "start_guardian", "START-GUARDIAN", 0, 0, false);
        declareFunction(me, "ensure_guardian_running", "ENSURE-GUARDIAN-RUNNING", 0, 0, false);
        declareFunction(me, "is_guardian_shutdown_marker", "IS-GUARDIAN-SHUTDOWN-MARKER", 1, 0, false);
        declareFunction(me, "guardian_handler", "GUARDIAN-HANDLER", 0, 0, false);
        declareFunction(me, "check_guardian_request", "CHECK-GUARDIAN-REQUEST", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_guardian_file() {
        deflexical("*GUARDIAN-PROCESS*", SubLTrampolineFile.maybeDefault($guardian_process$, $guardian_process$, NIL));
        deflexical("*GUARDING-REQUESTS*", SubLTrampolineFile.maybeDefault($guarding_requests$, $guarding_requests$, NIL));
        deflexical("*GUARDIAN-TIMESLICE*", TWO_INTEGER);
        deflexical("*GUARDIAN-ISG*", SubLTrampolineFile.maybeDefault($guardian_isg$, $guardian_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-GUARDIAN-REQUEST*", GUARDIAN_REQUEST);
        deflexical("*GUARDIAN-SHUTDOWN-MARKER*", SubLTrampolineFile.maybeDefault($guardian_shutdown_marker$, $guardian_shutdown_marker$, () -> make_symbol($$$Guardian_Shutdown_Marker)));
        deflexical("*GUARDIAN-SLEEP-MARKER*", SubLTrampolineFile.maybeDefault($guardian_sleep_marker$, $guardian_sleep_marker$, () -> make_symbol($$$Guardian_Sleep_Marker)));
        return NIL;
    }

    public static SubLObject setup_guardian_file() {
        declare_defglobal($guardian_process$);
        declare_defglobal($guarding_requests$);
        declare_defglobal($guardian_isg$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_guardian_request$.getGlobalValue(), symbol_function(GUARDIAN_REQUEST_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list11);
        def_csetf(GUARDIAN_REQUEST_ID, _CSETF_GUARDIAN_REQUEST_ID);
        def_csetf(GUARDIAN_REQUEST_CHECKER_FN, _CSETF_GUARDIAN_REQUEST_CHECKER_FN);
        def_csetf(GUARDIAN_REQUEST_PARAMETER, _CSETF_GUARDIAN_REQUEST_PARAMETER);
        def_csetf(GUARDIAN_REQUEST_NOTIFICATION_FN, _CSETF_GUARDIAN_REQUEST_NOTIFICATION_FN);
        def_csetf(GUARDIAN_REQUEST_INTERRUPT_P, _CSETF_GUARDIAN_REQUEST_INTERRUPT_P);
        def_csetf(GUARDIAN_REQUEST_PROCESS, _CSETF_GUARDIAN_REQUEST_PROCESS);
        identity(GUARDIAN_REQUEST);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_guardian_request$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_GUARDIAN_REQUEST_METHOD));
        register_cyc_api_function(SCHEDULE_GUARDIAN_REQUEST, $list43, $str44$Schedule_a_guardian_request___fun, $list45, $list46);
        register_cyc_api_function(GUARDIAN_REQUEST_ID_P, $list48, $str49$Determine_whether_this_is_a_prope, NIL, $list50);
        register_cyc_api_function(CANCEL_GUARDIAN_REQUEST, $list48, $str53$Abort_a_guardian_request_that_is_, $list54, $list55);
        register_cyc_api_macro(WITH_GUARDIAN_REQUEST, $list56, $str64$Setup_a_guardian_request_and_canc);
        register_cyc_api_function(ACTIVE_GUARDIAN_REQUESTS, NIL, $str66$The_active_guardian_requests_____, NIL, NIL);
        register_cyc_api_function(INITIALIZE_GUARDIAN, NIL, $str70$Starts_the_guardian_unless_it_is_, NIL, $list50);
        declare_defglobal($guardian_shutdown_marker$);
        register_cyc_api_function(STOP_GUARDIAN, NIL, $str74$Tell_the_guardian_to_shut_itself_, NIL, $list50);
        register_cyc_api_function(START_GUARDIAN, NIL, $str78$Launch_the_guardian_process__pote, NIL, $list50);
        register_cyc_api_function(ENSURE_GUARDIAN_RUNNING, NIL, $str80$Launch_the_guardian_process_if_it, NIL, $list50);
        declare_defglobal($guardian_sleep_marker$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_guardian_file();
    }

    @Override
    public void initializeVariables() {
        init_guardian_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_guardian_file();
    }

    

    public static final class $guardian_request_native extends SubLStructNative {
        public SubLObject $id;

        public SubLObject $checker_fn;

        public SubLObject $parameter;

        public SubLObject $notification_fn;

        public SubLObject $interrupt_p;

        public SubLObject $process;

        private static final SubLStructDeclNative structDecl;

        private $guardian_request_native() {
            this.$id = Lisp.NIL;
            this.$checker_fn = Lisp.NIL;
            this.$parameter = Lisp.NIL;
            this.$notification_fn = Lisp.NIL;
            this.$interrupt_p = Lisp.NIL;
            this.$process = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$id;
        }

        @Override
        public SubLObject getField3() {
            return this.$checker_fn;
        }

        @Override
        public SubLObject getField4() {
            return this.$parameter;
        }

        @Override
        public SubLObject getField5() {
            return this.$notification_fn;
        }

        @Override
        public SubLObject getField6() {
            return this.$interrupt_p;
        }

        @Override
        public SubLObject getField7() {
            return this.$process;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$id = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$checker_fn = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$parameter = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$notification_fn = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$interrupt_p = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$process = value;
        }

        static {
            structDecl = makeStructDeclNative($guardian_request_native.class, GUARDIAN_REQUEST, GUARDIAN_REQUEST_P, $list5, $list6, new String[]{ "$id", "$checker_fn", "$parameter", "$notification_fn", "$interrupt_p", "$process" }, $list7, $list8, PRINT_GUARDIAN_REQUEST);
        }
    }

    public static final class $guardian_request_p$UnaryFunction extends UnaryFunction {
        public $guardian_request_p$UnaryFunction() {
            super(extractFunctionNamed("GUARDIAN-REQUEST-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return guardian_request_p(arg1);
        }
    }
}

/**
 * Total time: 241 ms
 */
