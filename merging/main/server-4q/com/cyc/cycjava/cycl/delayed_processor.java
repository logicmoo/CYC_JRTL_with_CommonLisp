package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.numberp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import org.armedbear.lisp.Lisp;

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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

 
 public final class delayed_processor extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new delayed_processor();

    public static final String myName = "com.cyc.cycjava_2.cycl.delayed_processor";


    // defconstant
    public static final SubLSymbol $dtp_delayed_processor$ = makeSymbol("*DTP-DELAYED-PROCESSOR*");

    // deflexical
    private static final SubLSymbol $active_delayed_processors$ = makeSymbol("*ACTIVE-DELAYED-PROCESSORS*");

    // deflexical
    private static final SubLSymbol $delayed_processor_meta_daemon$ = makeSymbol("*DELAYED-PROCESSOR-META-DAEMON*");

    private static final SubLSymbol DELAYED_PROCESSOR = makeSymbol("DELAYED-PROCESSOR");

    private static final SubLSymbol DELAYED_PROCESSOR_P = makeSymbol("DELAYED-PROCESSOR-P");

    private static final SubLList $list2 = list(makeSymbol("DAEMON-PROCESS"), makeSymbol("QUEUE"), makeSymbol("DELAY-SECONDS"), makeSymbol("VALIDITY-TEST"), makeSymbol("PROCESS-FN"), makeSymbol("SPECIAL-INSTRUCTION"));

    private static final SubLList $list3 = list(makeKeyword("DAEMON-PROCESS"), makeKeyword("QUEUE"), makeKeyword("DELAY-SECONDS"), makeKeyword("VALIDITY-TEST"), makeKeyword("PROCESS-FN"), makeKeyword("SPECIAL-INSTRUCTION"));

    private static final SubLList $list4 = list(makeSymbol("PROCESSOR-DAEMON-PROCESS"), makeSymbol("PROCESSOR-QUEUE"), makeSymbol("PROCESSOR-DELAY-SECONDS"), makeSymbol("PROCESSOR-VALIDITY-TEST"), makeSymbol("PROCESSOR-PROCESS-FN"), makeSymbol("PROCESSOR-SPECIAL-INSTRUCTION"));

    private static final SubLList $list5 = list(makeSymbol("_CSETF-PROCESSOR-DAEMON-PROCESS"), makeSymbol("_CSETF-PROCESSOR-QUEUE"), makeSymbol("_CSETF-PROCESSOR-DELAY-SECONDS"), makeSymbol("_CSETF-PROCESSOR-VALIDITY-TEST"), makeSymbol("_CSETF-PROCESSOR-PROCESS-FN"), makeSymbol("_CSETF-PROCESSOR-SPECIAL-INSTRUCTION"));

    private static final SubLSymbol PRINT_DELAYED_PROCESSOR = makeSymbol("PRINT-DELAYED-PROCESSOR");

    private static final SubLSymbol DELAYED_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("DELAYED-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list8 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("DELAYED-PROCESSOR-P"));

    private static final SubLSymbol PROCESSOR_DAEMON_PROCESS = makeSymbol("PROCESSOR-DAEMON-PROCESS");

    private static final SubLSymbol _CSETF_PROCESSOR_DAEMON_PROCESS = makeSymbol("_CSETF-PROCESSOR-DAEMON-PROCESS");

    private static final SubLSymbol PROCESSOR_QUEUE = makeSymbol("PROCESSOR-QUEUE");

    private static final SubLSymbol _CSETF_PROCESSOR_QUEUE = makeSymbol("_CSETF-PROCESSOR-QUEUE");

    private static final SubLSymbol PROCESSOR_DELAY_SECONDS = makeSymbol("PROCESSOR-DELAY-SECONDS");

    private static final SubLSymbol _CSETF_PROCESSOR_DELAY_SECONDS = makeSymbol("_CSETF-PROCESSOR-DELAY-SECONDS");

    private static final SubLSymbol PROCESSOR_VALIDITY_TEST = makeSymbol("PROCESSOR-VALIDITY-TEST");

    private static final SubLSymbol _CSETF_PROCESSOR_VALIDITY_TEST = makeSymbol("_CSETF-PROCESSOR-VALIDITY-TEST");

    private static final SubLSymbol PROCESSOR_PROCESS_FN = makeSymbol("PROCESSOR-PROCESS-FN");

    private static final SubLSymbol _CSETF_PROCESSOR_PROCESS_FN = makeSymbol("_CSETF-PROCESSOR-PROCESS-FN");

    private static final SubLSymbol PROCESSOR_SPECIAL_INSTRUCTION = makeSymbol("PROCESSOR-SPECIAL-INSTRUCTION");

    private static final SubLSymbol _CSETF_PROCESSOR_SPECIAL_INSTRUCTION = makeSymbol("_CSETF-PROCESSOR-SPECIAL-INSTRUCTION");

    private static final SubLSymbol $DAEMON_PROCESS = makeKeyword("DAEMON-PROCESS");



    private static final SubLSymbol $DELAY_SECONDS = makeKeyword("DELAY-SECONDS");

    private static final SubLSymbol $VALIDITY_TEST = makeKeyword("VALIDITY-TEST");

    private static final SubLSymbol $PROCESS_FN = makeKeyword("PROCESS-FN");

    private static final SubLSymbol $SPECIAL_INSTRUCTION = makeKeyword("SPECIAL-INSTRUCTION");

    private static final SubLString $str27$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_DELAYED_PROCESSOR = makeSymbol("MAKE-DELAYED-PROCESSOR");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_DELAYED_PROCESSOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-DELAYED-PROCESSOR-METHOD");

    private static final SubLString $str33$_DELAYED_PROCESSOR__S_ = makeString("<DELAYED-PROCESSOR ~S>");

    private static final SubLString $$$Delayed_Processor_Scheduled_Items = makeString("Delayed Processor Scheduled Items");







    private static final SubLSymbol $FLUSH = makeKeyword("FLUSH");

    private static final SubLFloat $float$0_01 = makeDouble(0.01);

    private static final SubLString $str40$Flushing__S = makeString("Flushing ~S");

    private static final SubLList $list41 = cons(makeSymbol("SCHEDULED"), makeSymbol("ENQUEUED-TIME"));



    private static final SubLString $str43$Caught_error_invoking__S_on__S___ = makeString("Caught error invoking ~S on ~S:~% ~S");

    private static final SubLString $$$Delayed_Processor_Daemon_ = makeString("Delayed Processor Daemon ");

    private static final SubLSymbol PROCESS_SCHEDULED_ITEMS = makeSymbol("PROCESS-SCHEDULED-ITEMS");

    private static final SubLString $$$Delayed_Processor_Meta_Daemon = makeString("Delayed Processor Meta Daemon");

    private static final SubLSymbol DELAYED_PROCESSOR_META_DAEMON_RUN = makeSymbol("DELAYED-PROCESSOR-META-DAEMON-RUN");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol SXHASH_DELAYED_PROCESSOR_METHOD = makeSymbol("SXHASH-DELAYED-PROCESSOR-METHOD");

    public static SubLObject delayed_processor_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_delayed_processor(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject delayed_processor_p(final SubLObject v_object) {
        return v_object.getClass() == $delayed_processor_native.class ? T : NIL;
    }

    public static SubLObject processor_daemon_process(final SubLObject v_object) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject processor_queue(final SubLObject v_object) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject processor_delay_seconds(final SubLObject v_object) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject processor_validity_test(final SubLObject v_object) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject processor_process_fn(final SubLObject v_object) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject processor_special_instruction(final SubLObject v_object) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_processor_daemon_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_processor_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_processor_delay_seconds(final SubLObject v_object, final SubLObject value) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_processor_validity_test(final SubLObject v_object, final SubLObject value) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_processor_process_fn(final SubLObject v_object, final SubLObject value) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_processor_special_instruction(final SubLObject v_object, final SubLObject value) {
        assert NIL != delayed_processor_p(v_object) : "delayed_processor.delayed_processor_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_delayed_processor(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $delayed_processor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($DAEMON_PROCESS)) {
                _csetf_processor_daemon_process(v_new, current_value);
            } else
                if (pcase_var.eql($QUEUE)) {
                    _csetf_processor_queue(v_new, current_value);
                } else
                    if (pcase_var.eql($DELAY_SECONDS)) {
                        _csetf_processor_delay_seconds(v_new, current_value);
                    } else
                        if (pcase_var.eql($VALIDITY_TEST)) {
                            _csetf_processor_validity_test(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROCESS_FN)) {
                                _csetf_processor_process_fn(v_new, current_value);
                            } else
                                if (pcase_var.eql($SPECIAL_INSTRUCTION)) {
                                    _csetf_processor_special_instruction(v_new, current_value);
                                } else {
                                    Errors.error($str27$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_delayed_processor(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_DELAYED_PROCESSOR, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $DAEMON_PROCESS, processor_daemon_process(obj));
        funcall(visitor_fn, obj, $SLOT, $QUEUE, processor_queue(obj));
        funcall(visitor_fn, obj, $SLOT, $DELAY_SECONDS, processor_delay_seconds(obj));
        funcall(visitor_fn, obj, $SLOT, $VALIDITY_TEST, processor_validity_test(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESS_FN, processor_process_fn(obj));
        funcall(visitor_fn, obj, $SLOT, $SPECIAL_INSTRUCTION, processor_special_instruction(obj));
        funcall(visitor_fn, obj, $END, MAKE_DELAYED_PROCESSOR, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_delayed_processor_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_delayed_processor(obj, visitor_fn);
    }

    public static SubLObject print_delayed_processor(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str33$_DELAYED_PROCESSOR__S_, processor_process_fn(v_object));
        return v_object;
    }

    public static SubLObject new_delayed_processor(final SubLObject delay_seconds, final SubLObject validity_test, final SubLObject process_fn) {
        final SubLObject processor = make_delayed_processor(UNPROVIDED);
        _csetf_processor_delay_seconds(processor, delay_seconds);
        _csetf_processor_validity_test(processor, validity_test);
        _csetf_processor_process_fn(processor, process_fn);
        _csetf_processor_special_instruction(processor, NIL);
        reset_delayed_processor(processor);
        return processor;
    }

    public static SubLObject reset_delayed_processor(final SubLObject processor) {
        _csetf_processor_queue(processor, process_utilities.new_ordered_ipc_queue($$$Delayed_Processor_Scheduled_Items, UNPROVIDED));
        return processor;
    }

    public static SubLObject schedule(final SubLObject processor, final SubLObject obj) {
        delayed_processor_cancel_special_instruction(processor);
        process_utilities.ordered_ipc_enqueue(cons(obj, get_internal_real_time()), processor_queue(processor));
        note_active_delayed_processor(processor);
        ensure_delayed_processor_meta_daemon_running();
        return NIL;
    }

    public static SubLObject delayed_processor_set_delay_seconds(final SubLObject processor, final SubLObject seconds) {
        assert NIL != numberp(seconds) : "Types.numberp(seconds) " + "CommonSymbols.NIL != Types.numberp(seconds) " + seconds;
        _csetf_processor_delay_seconds(processor, seconds);
        return seconds;
    }

    public static SubLObject delayed_processor_get_delay_seconds(final SubLObject processor) {
        return delayed_processor_delay_seconds(processor);
    }

    public static SubLObject delayed_processor_cancel(final SubLObject processor) {
        _csetf_processor_special_instruction(processor, $ABORT);
        final SubLObject process_fn = delayed_processor_process_fn(processor);
        _csetf_processor_process_fn(processor, NULL);
        delayed_processor_flush(processor);
        _csetf_processor_process_fn(processor, process_fn);
        return processor;
    }

    public static SubLObject delayed_processor_flush_next_time_around(final SubLObject processor) {
        delayed_processor_set_special_instruction(processor, $FLUSH);
        return processor;
    }

    public static SubLObject delayed_processor_flush(final SubLObject processor) {
        delayed_processor_flush_next_time_around(processor);
        ensure_delayed_processor_daemon_running(processor);
        while (!ZERO_INTEGER.eql(delayed_processor_queue_size(processor))) {
            sleep($float$0_01);
        } 
        return NIL;
    }

    public static SubLObject delayed_processor_queue_size(final SubLObject processor) {
        return NIL != process_utilities.ordered_ipc_queue_p(delayed_processor_queue(processor)) ? process_utilities.ordered_ipc_current_queue_size(delayed_processor_queue(processor), UNPROVIDED) : ZERO_INTEGER;
    }

    public static SubLObject delayed_processor_daemon_process(final SubLObject processor) {
        assert NIL != delayed_processor_p(processor) : "delayed_processor.delayed_processor_p(processor) " + "CommonSymbols.NIL != delayed_processor.delayed_processor_p(processor) " + processor;
        return processor_daemon_process(processor);
    }

    public static SubLObject delayed_processor_queue(final SubLObject processor) {
        assert NIL != delayed_processor_p(processor) : "delayed_processor.delayed_processor_p(processor) " + "CommonSymbols.NIL != delayed_processor.delayed_processor_p(processor) " + processor;
        return processor_queue(processor);
    }

    public static SubLObject delayed_processor_delay_seconds(final SubLObject processor) {
        assert NIL != delayed_processor_p(processor) : "delayed_processor.delayed_processor_p(processor) " + "CommonSymbols.NIL != delayed_processor.delayed_processor_p(processor) " + processor;
        return processor_delay_seconds(processor);
    }

    public static SubLObject delayed_processor_validity_test(final SubLObject processor) {
        assert NIL != delayed_processor_p(processor) : "delayed_processor.delayed_processor_p(processor) " + "CommonSymbols.NIL != delayed_processor.delayed_processor_p(processor) " + processor;
        return processor_validity_test(processor);
    }

    public static SubLObject delayed_processor_process_fn(final SubLObject processor) {
        assert NIL != delayed_processor_p(processor) : "delayed_processor.delayed_processor_p(processor) " + "CommonSymbols.NIL != delayed_processor.delayed_processor_p(processor) " + processor;
        return processor_process_fn(processor);
    }

    public static SubLObject delayed_processor_special_instruction(final SubLObject processor) {
        assert NIL != delayed_processor_p(processor) : "delayed_processor.delayed_processor_p(processor) " + "CommonSymbols.NIL != delayed_processor.delayed_processor_p(processor) " + processor;
        return processor_special_instruction(processor);
    }

    public static SubLObject delayed_processor_abortP(final SubLObject processor) {
        assert NIL != delayed_processor_p(processor) : "delayed_processor.delayed_processor_p(processor) " + "CommonSymbols.NIL != delayed_processor.delayed_processor_p(processor) " + processor;
        return eql($ABORT, delayed_processor_special_instruction(processor));
    }

    public static SubLObject delayed_processor_flushP(final SubLObject processor) {
        assert NIL != delayed_processor_p(processor) : "delayed_processor.delayed_processor_p(processor) " + "CommonSymbols.NIL != delayed_processor.delayed_processor_p(processor) " + processor;
        return eql($FLUSH, delayed_processor_special_instruction(processor));
    }

    public static SubLObject delayed_processor_set_special_instruction(final SubLObject processor, final SubLObject instruction) {
        assert NIL != delayed_processor_p(processor) : "delayed_processor.delayed_processor_p(processor) " + "CommonSymbols.NIL != delayed_processor.delayed_processor_p(processor) " + processor;
        _csetf_processor_special_instruction(processor, instruction);
        return processor_special_instruction(processor);
    }

    public static SubLObject delayed_processor_cancel_special_instruction(final SubLObject processor) {
        assert NIL != delayed_processor_p(processor) : "delayed_processor.delayed_processor_p(processor) " + "CommonSymbols.NIL != delayed_processor.delayed_processor_p(processor) " + processor;
        return delayed_processor_set_special_instruction(processor, NIL);
    }

    public static SubLObject process_scheduled_items(final SubLObject processor) {
        SubLObject processed_count = ZERO_INTEGER;
        SubLObject q = delayed_processor_queue(processor);
        SubLObject flushP = NIL;
        while ((NIL == delayed_processor_abortP(processor)) && (NIL == process_utilities.ordered_ipc_queue_quiescedP(q))) {
            if ((NIL == flushP) && (NIL != delayed_processor_flushP(processor))) {
                flushP = T;
                Errors.warn($str40$Flushing__S, processor);
            }
            SubLObject current;
            final SubLObject datum = current = process_utilities.ordered_ipc_dequeue(q);
            SubLObject scheduled = NIL;
            SubLObject enqueued_time = NIL;
            destructuring_bind_must_consp(current, datum, $list41);
            scheduled = current.first();
            current = enqueued_time = current.rest();
            if (NIL != funcall(delayed_processor_validity_test(processor), scheduled)) {
                for (SubLObject time_to_wait = (NIL != flushP) ? ZERO_INTEGER : compute_delayed_processor_time_to_wait(processor, enqueued_time); time_to_wait.isPositive(); time_to_wait = compute_delayed_processor_time_to_wait(processor, enqueued_time)) {
                    sleep(ONE_INTEGER);
                }
                process(processor, scheduled);
                processed_count = add(processed_count, ONE_INTEGER);
            }
            q = delayed_processor_queue(processor);
        } 
        if (NIL != process_utilities.ordered_ipc_queue_quiescedP(q)) {
            note_inactive_delayed_processor(processor);
        }
        delayed_processor_cancel_special_instruction(processor);
        return processed_count;
    }

    public static SubLObject compute_delayed_processor_time_to_wait(final SubLObject processor, final SubLObject enqueued_time) {
        return NIL != delayed_processor_flushP(processor) ? ZERO_INTEGER : subtract(delayed_processor_delay_seconds(processor), numeric_date_utilities.elapsed_seconds_between_internal_real_times(enqueued_time, get_internal_real_time()));
    }

    public static SubLObject process(final SubLObject processor, final SubLObject scheduled) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err_msg = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    funcall(delayed_processor_process_fn(processor), scheduled);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != err_msg) {
            Errors.warn($str43$Caught_error_invoking__S_on__S___, delayed_processor_process_fn(processor), scheduled, err_msg);
        }
        return NIL;
    }

    public static SubLObject initialize_delayed_processor_daemon(final SubLObject processor) {
        final SubLObject old_daemon = processor_daemon_process(processor);
        if (NIL != valid_process_p(old_daemon)) {
            kill_process(old_daemon);
        }
        final SubLObject name = cconcatenate($$$Delayed_Processor_Daemon_, format_nil.format_nil_a_no_copy(delayed_processor_process_fn(processor)));
        _csetf_processor_daemon_process(processor, process_utilities.make_cyc_server_process_with_args(name, PROCESS_SCHEDULED_ITEMS, list(processor)));
        return processor;
    }

    public static SubLObject ensure_delayed_processor_daemon_running(final SubLObject processor) {
        if (NIL == valid_process_p(processor_daemon_process(processor))) {
            initialize_delayed_processor_daemon(processor);
        }
        return NIL;
    }

    public static SubLObject note_active_delayed_processor(final SubLObject processor) {
        return set.set_add(processor, $active_delayed_processors$.getGlobalValue());
    }

    public static SubLObject note_inactive_delayed_processor(final SubLObject processor) {
        return set.set_remove(processor, $active_delayed_processors$.getGlobalValue());
    }

    public static SubLObject ensure_delayed_processor_meta_daemon_running() {
        if (NIL == valid_process_p($delayed_processor_meta_daemon$.getGlobalValue())) {
            $delayed_processor_meta_daemon$.setGlobalValue(process_utilities.make_cyc_server_process($$$Delayed_Processor_Meta_Daemon, DELAYED_PROCESSOR_META_DAEMON_RUN));
        }
        return $delayed_processor_meta_daemon$.getGlobalValue();
    }

    public static SubLObject delayed_processor_meta_daemon_run() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (NIL == set.set_emptyP($active_delayed_processors$.getGlobalValue())) {
            final SubLObject set_contents_var = set.do_set_internal($active_delayed_processors$.getGlobalValue());
            SubLObject basis_object;
            SubLObject state;
            SubLObject processor;
            SubLObject ignore_errors_tag;
            SubLObject _prev_bind_0;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                processor = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, processor)) {
                    ignore_errors_tag = NIL;
                    try {
                        thread.throwStack.push($IGNORE_ERRORS_TARGET);
                        _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                ensure_delayed_processor_daemon_running(processor);
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
                }
            }
            sleep(ONE_INTEGER);
        } 
        return NIL;
    }

    public static SubLObject sxhash_delayed_processor_method(final SubLObject v_object) {
        return sxhash_delayed_processor(v_object);
    }

    public static SubLObject sxhash_delayed_processor(final SubLObject processor) {
        return Sxhash.sxhash(processor_daemon_process(processor));
    }

    public static SubLObject declare_delayed_processor_file() {
        declareFunction("delayed_processor_print_function_trampoline", "DELAYED-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("delayed_processor_p", "DELAYED-PROCESSOR-P", 1, 0, false);
        new delayed_processor.$delayed_processor_p$UnaryFunction();
        declareFunction("processor_daemon_process", "PROCESSOR-DAEMON-PROCESS", 1, 0, false);
        declareFunction("processor_queue", "PROCESSOR-QUEUE", 1, 0, false);
        declareFunction("processor_delay_seconds", "PROCESSOR-DELAY-SECONDS", 1, 0, false);
        declareFunction("processor_validity_test", "PROCESSOR-VALIDITY-TEST", 1, 0, false);
        declareFunction("processor_process_fn", "PROCESSOR-PROCESS-FN", 1, 0, false);
        declareFunction("processor_special_instruction", "PROCESSOR-SPECIAL-INSTRUCTION", 1, 0, false);
        declareFunction("_csetf_processor_daemon_process", "_CSETF-PROCESSOR-DAEMON-PROCESS", 2, 0, false);
        declareFunction("_csetf_processor_queue", "_CSETF-PROCESSOR-QUEUE", 2, 0, false);
        declareFunction("_csetf_processor_delay_seconds", "_CSETF-PROCESSOR-DELAY-SECONDS", 2, 0, false);
        declareFunction("_csetf_processor_validity_test", "_CSETF-PROCESSOR-VALIDITY-TEST", 2, 0, false);
        declareFunction("_csetf_processor_process_fn", "_CSETF-PROCESSOR-PROCESS-FN", 2, 0, false);
        declareFunction("_csetf_processor_special_instruction", "_CSETF-PROCESSOR-SPECIAL-INSTRUCTION", 2, 0, false);
        declareFunction("make_delayed_processor", "MAKE-DELAYED-PROCESSOR", 0, 1, false);
        declareFunction("visit_defstruct_delayed_processor", "VISIT-DEFSTRUCT-DELAYED-PROCESSOR", 2, 0, false);
        declareFunction("visit_defstruct_object_delayed_processor_method", "VISIT-DEFSTRUCT-OBJECT-DELAYED-PROCESSOR-METHOD", 2, 0, false);
        declareFunction("print_delayed_processor", "PRINT-DELAYED-PROCESSOR", 3, 0, false);
        declareFunction("new_delayed_processor", "NEW-DELAYED-PROCESSOR", 3, 0, false);
        declareFunction("reset_delayed_processor", "RESET-DELAYED-PROCESSOR", 1, 0, false);
        declareFunction("schedule", "SCHEDULE", 2, 0, false);
        declareFunction("delayed_processor_set_delay_seconds", "DELAYED-PROCESSOR-SET-DELAY-SECONDS", 2, 0, false);
        declareFunction("delayed_processor_get_delay_seconds", "DELAYED-PROCESSOR-GET-DELAY-SECONDS", 1, 0, false);
        declareFunction("delayed_processor_cancel", "DELAYED-PROCESSOR-CANCEL", 1, 0, false);
        declareFunction("delayed_processor_flush_next_time_around", "DELAYED-PROCESSOR-FLUSH-NEXT-TIME-AROUND", 1, 0, false);
        declareFunction("delayed_processor_flush", "DELAYED-PROCESSOR-FLUSH", 1, 0, false);
        declareFunction("delayed_processor_queue_size", "DELAYED-PROCESSOR-QUEUE-SIZE", 1, 0, false);
        declareFunction("delayed_processor_daemon_process", "DELAYED-PROCESSOR-DAEMON-PROCESS", 1, 0, false);
        declareFunction("delayed_processor_queue", "DELAYED-PROCESSOR-QUEUE", 1, 0, false);
        declareFunction("delayed_processor_delay_seconds", "DELAYED-PROCESSOR-DELAY-SECONDS", 1, 0, false);
        declareFunction("delayed_processor_validity_test", "DELAYED-PROCESSOR-VALIDITY-TEST", 1, 0, false);
        declareFunction("delayed_processor_process_fn", "DELAYED-PROCESSOR-PROCESS-FN", 1, 0, false);
        declareFunction("delayed_processor_special_instruction", "DELAYED-PROCESSOR-SPECIAL-INSTRUCTION", 1, 0, false);
        declareFunction("delayed_processor_abortP", "DELAYED-PROCESSOR-ABORT?", 1, 0, false);
        declareFunction("delayed_processor_flushP", "DELAYED-PROCESSOR-FLUSH?", 1, 0, false);
        declareFunction("delayed_processor_set_special_instruction", "DELAYED-PROCESSOR-SET-SPECIAL-INSTRUCTION", 2, 0, false);
        declareFunction("delayed_processor_cancel_special_instruction", "DELAYED-PROCESSOR-CANCEL-SPECIAL-INSTRUCTION", 1, 0, false);
        declareFunction("process_scheduled_items", "PROCESS-SCHEDULED-ITEMS", 1, 0, false);
        declareFunction("compute_delayed_processor_time_to_wait", "COMPUTE-DELAYED-PROCESSOR-TIME-TO-WAIT", 2, 0, false);
        declareFunction("process", "PROCESS", 2, 0, false);
        declareFunction("initialize_delayed_processor_daemon", "INITIALIZE-DELAYED-PROCESSOR-DAEMON", 1, 0, false);
        declareFunction("ensure_delayed_processor_daemon_running", "ENSURE-DELAYED-PROCESSOR-DAEMON-RUNNING", 1, 0, false);
        declareFunction("note_active_delayed_processor", "NOTE-ACTIVE-DELAYED-PROCESSOR", 1, 0, false);
        declareFunction("note_inactive_delayed_processor", "NOTE-INACTIVE-DELAYED-PROCESSOR", 1, 0, false);
        declareFunction("ensure_delayed_processor_meta_daemon_running", "ENSURE-DELAYED-PROCESSOR-META-DAEMON-RUNNING", 0, 0, false);
        declareFunction("delayed_processor_meta_daemon_run", "DELAYED-PROCESSOR-META-DAEMON-RUN", 0, 0, false);
        declareFunction("sxhash_delayed_processor_method", "SXHASH-DELAYED-PROCESSOR-METHOD", 1, 0, false);
        declareFunction("sxhash_delayed_processor", "SXHASH-DELAYED-PROCESSOR", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_delayed_processor_file() {
        defconstant("*DTP-DELAYED-PROCESSOR*", DELAYED_PROCESSOR);
        deflexical("*ACTIVE-DELAYED-PROCESSORS*", set.new_set(UNPROVIDED, UNPROVIDED));
        deflexical("*DELAYED-PROCESSOR-META-DAEMON*", misc_utilities.uninitialized());
        return NIL;
    }

    public static SubLObject setup_delayed_processor_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_delayed_processor$.getGlobalValue(), symbol_function(DELAYED_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list8);
        def_csetf(PROCESSOR_DAEMON_PROCESS, _CSETF_PROCESSOR_DAEMON_PROCESS);
        def_csetf(PROCESSOR_QUEUE, _CSETF_PROCESSOR_QUEUE);
        def_csetf(PROCESSOR_DELAY_SECONDS, _CSETF_PROCESSOR_DELAY_SECONDS);
        def_csetf(PROCESSOR_VALIDITY_TEST, _CSETF_PROCESSOR_VALIDITY_TEST);
        def_csetf(PROCESSOR_PROCESS_FN, _CSETF_PROCESSOR_PROCESS_FN);
        def_csetf(PROCESSOR_SPECIAL_INSTRUCTION, _CSETF_PROCESSOR_SPECIAL_INSTRUCTION);
        identity(DELAYED_PROCESSOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_delayed_processor$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_DELAYED_PROCESSOR_METHOD));
        note_funcall_helper_function(PRINT_DELAYED_PROCESSOR);
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_delayed_processor$.getGlobalValue(), symbol_function(SXHASH_DELAYED_PROCESSOR_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_delayed_processor_file();
    }

    @Override
    public void initializeVariables() {
        init_delayed_processor_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_delayed_processor_file();
    }

    

    public static final class $delayed_processor_native extends SubLStructNative {
        public SubLObject $daemon_process;

        public SubLObject $queue;

        public SubLObject $delay_seconds;

        public SubLObject $validity_test;

        public SubLObject $process_fn;

        public SubLObject $special_instruction;

        private static final SubLStructDeclNative structDecl;

        private $delayed_processor_native() {
            this.$daemon_process = Lisp.NIL;
            this.$queue = Lisp.NIL;
            this.$delay_seconds = Lisp.NIL;
            this.$validity_test = Lisp.NIL;
            this.$process_fn = Lisp.NIL;
            this.$special_instruction = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$daemon_process;
        }

        @Override
        public SubLObject getField3() {
            return this.$queue;
        }

        @Override
        public SubLObject getField4() {
            return this.$delay_seconds;
        }

        @Override
        public SubLObject getField5() {
            return this.$validity_test;
        }

        @Override
        public SubLObject getField6() {
            return this.$process_fn;
        }

        @Override
        public SubLObject getField7() {
            return this.$special_instruction;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$daemon_process = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$queue = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$delay_seconds = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$validity_test = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$process_fn = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$special_instruction = value;
        }

        static {
            structDecl = makeStructDeclNative($delayed_processor_native.class, DELAYED_PROCESSOR, DELAYED_PROCESSOR_P, $list2, $list3, new String[]{ "$daemon_process", "$queue", "$delay_seconds", "$validity_test", "$process_fn", "$special_instruction" }, $list4, $list5, PRINT_DELAYED_PROCESSOR);
        }
    }

    public static final class $delayed_processor_p$UnaryFunction extends UnaryFunction {
        public $delayed_processor_p$UnaryFunction() {
            super(extractFunctionNamed("DELAYED-PROCESSOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return delayed_processor_p(arg1);
        }
    }
}

/**
 * Total time: 400 ms
 */
