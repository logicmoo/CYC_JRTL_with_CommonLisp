package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class delayed_processor extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.delayed_processor";
    public static final String myFingerPrint = "ef30ecb6653331a2e85edce23c0bd2dea1b46db0684387290983627bbd911f4e";
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLSymbol $dtp_delayed_processor$;
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 9542L)
    private static SubLSymbol $active_delayed_processors$;
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 9685L)
    private static SubLSymbol $delayed_processor_meta_daemon$;
    private static final SubLSymbol $sym0$DELAYED_PROCESSOR;
    private static final SubLSymbol $sym1$DELAYED_PROCESSOR_P;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLSymbol $sym6$PRINT_DELAYED_PROCESSOR;
    private static final SubLSymbol $sym7$DELAYED_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$PROCESSOR_DAEMON_PROCESS;
    private static final SubLSymbol $sym10$_CSETF_PROCESSOR_DAEMON_PROCESS;
    private static final SubLSymbol $sym11$PROCESSOR_QUEUE;
    private static final SubLSymbol $sym12$_CSETF_PROCESSOR_QUEUE;
    private static final SubLSymbol $sym13$PROCESSOR_DELAY_SECONDS;
    private static final SubLSymbol $sym14$_CSETF_PROCESSOR_DELAY_SECONDS;
    private static final SubLSymbol $sym15$PROCESSOR_VALIDITY_TEST;
    private static final SubLSymbol $sym16$_CSETF_PROCESSOR_VALIDITY_TEST;
    private static final SubLSymbol $sym17$PROCESSOR_PROCESS_FN;
    private static final SubLSymbol $sym18$_CSETF_PROCESSOR_PROCESS_FN;
    private static final SubLSymbol $sym19$PROCESSOR_SPECIAL_INSTRUCTION;
    private static final SubLSymbol $sym20$_CSETF_PROCESSOR_SPECIAL_INSTRUCTION;
    private static final SubLSymbol $kw21$DAEMON_PROCESS;
    private static final SubLSymbol $kw22$QUEUE;
    private static final SubLSymbol $kw23$DELAY_SECONDS;
    private static final SubLSymbol $kw24$VALIDITY_TEST;
    private static final SubLSymbol $kw25$PROCESS_FN;
    private static final SubLSymbol $kw26$SPECIAL_INSTRUCTION;
    private static final SubLString $str27$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw28$BEGIN;
    private static final SubLSymbol $sym29$MAKE_DELAYED_PROCESSOR;
    private static final SubLSymbol $kw30$SLOT;
    private static final SubLSymbol $kw31$END;
    private static final SubLSymbol $sym32$VISIT_DEFSTRUCT_OBJECT_DELAYED_PROCESSOR_METHOD;
    private static final SubLString $str33$_DELAYED_PROCESSOR__S_;
    private static final SubLString $str34$Delayed_Processor_Scheduled_Items;
    private static final SubLSymbol $sym35$NUMBERP;
    private static final SubLSymbol $kw36$ABORT;
    private static final SubLSymbol $sym37$NULL;
    private static final SubLSymbol $kw38$FLUSH;
    private static final SubLFloat $float39$0_01;
    private static final SubLString $str40$Flushing__S;
    private static final SubLList $list41;
    private static final SubLSymbol $sym42$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str43$Caught_error_invoking__S_on__S___;
    private static final SubLString $str44$Delayed_Processor_Daemon_;
    private static final SubLSymbol $sym45$PROCESS_SCHEDULED_ITEMS;
    private static final SubLString $str46$Delayed_Processor_Meta_Daemon;
    private static final SubLSymbol $sym47$DELAYED_PROCESSOR_META_DAEMON_RUN;
    private static final SubLSymbol $kw48$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym49$IGNORE_ERRORS_HANDLER;
    private static final SubLSymbol $sym50$SXHASH_DELAYED_PROCESSOR_METHOD;
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject delayed_processor_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_delayed_processor(v_object, stream, (SubLObject)delayed_processor.ZERO_INTEGER);
        return (SubLObject)delayed_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject delayed_processor_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $delayed_processor_native.class) ? delayed_processor.T : delayed_processor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject processor_daemon_process(final SubLObject v_object) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject processor_queue(final SubLObject v_object) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject processor_delay_seconds(final SubLObject v_object) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject processor_validity_test(final SubLObject v_object) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.getField5();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject processor_process_fn(final SubLObject v_object) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.getField6();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject processor_special_instruction(final SubLObject v_object) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.getField7();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject _csetf_processor_daemon_process(final SubLObject v_object, final SubLObject value) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject _csetf_processor_queue(final SubLObject v_object, final SubLObject value) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject _csetf_processor_delay_seconds(final SubLObject v_object, final SubLObject value) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject _csetf_processor_validity_test(final SubLObject v_object, final SubLObject value) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.setField5(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject _csetf_processor_process_fn(final SubLObject v_object, final SubLObject value) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.setField6(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject _csetf_processor_special_instruction(final SubLObject v_object, final SubLObject value) {
        assert delayed_processor.NIL != delayed_processor_p(v_object) : v_object;
        return v_object.setField7(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject make_delayed_processor(SubLObject arglist) {
        if (arglist == delayed_processor.UNPROVIDED) {
            arglist = (SubLObject)delayed_processor.NIL;
        }
        final SubLObject v_new = (SubLObject)new $delayed_processor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)delayed_processor.NIL, next = arglist; delayed_processor.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)delayed_processor.$kw21$DAEMON_PROCESS)) {
                _csetf_processor_daemon_process(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)delayed_processor.$kw22$QUEUE)) {
                _csetf_processor_queue(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)delayed_processor.$kw23$DELAY_SECONDS)) {
                _csetf_processor_delay_seconds(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)delayed_processor.$kw24$VALIDITY_TEST)) {
                _csetf_processor_validity_test(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)delayed_processor.$kw25$PROCESS_FN)) {
                _csetf_processor_process_fn(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)delayed_processor.$kw26$SPECIAL_INSTRUCTION)) {
                _csetf_processor_special_instruction(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)delayed_processor.$str27$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject visit_defstruct_delayed_processor(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)delayed_processor.$kw28$BEGIN, (SubLObject)delayed_processor.$sym29$MAKE_DELAYED_PROCESSOR, (SubLObject)delayed_processor.SIX_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)delayed_processor.$kw30$SLOT, (SubLObject)delayed_processor.$kw21$DAEMON_PROCESS, processor_daemon_process(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)delayed_processor.$kw30$SLOT, (SubLObject)delayed_processor.$kw22$QUEUE, processor_queue(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)delayed_processor.$kw30$SLOT, (SubLObject)delayed_processor.$kw23$DELAY_SECONDS, processor_delay_seconds(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)delayed_processor.$kw30$SLOT, (SubLObject)delayed_processor.$kw24$VALIDITY_TEST, processor_validity_test(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)delayed_processor.$kw30$SLOT, (SubLObject)delayed_processor.$kw25$PROCESS_FN, processor_process_fn(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)delayed_processor.$kw30$SLOT, (SubLObject)delayed_processor.$kw26$SPECIAL_INSTRUCTION, processor_special_instruction(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)delayed_processor.$kw31$END, (SubLObject)delayed_processor.$sym29$MAKE_DELAYED_PROCESSOR, (SubLObject)delayed_processor.SIX_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1328L)
    public static SubLObject visit_defstruct_object_delayed_processor_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_delayed_processor(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1539L)
    public static SubLObject print_delayed_processor(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)delayed_processor.$str33$_DELAYED_PROCESSOR__S_, processor_process_fn(v_object));
        return v_object;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 1716L)
    public static SubLObject new_delayed_processor(final SubLObject delay_seconds, final SubLObject validity_test, final SubLObject process_fn) {
        final SubLObject processor = make_delayed_processor((SubLObject)delayed_processor.UNPROVIDED);
        _csetf_processor_delay_seconds(processor, delay_seconds);
        _csetf_processor_validity_test(processor, validity_test);
        _csetf_processor_process_fn(processor, process_fn);
        _csetf_processor_special_instruction(processor, (SubLObject)delayed_processor.NIL);
        reset_delayed_processor(processor);
        return processor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 2159L)
    public static SubLObject reset_delayed_processor(final SubLObject processor) {
        _csetf_processor_queue(processor, process_utilities.new_ordered_ipc_queue((SubLObject)delayed_processor.$str34$Delayed_Processor_Scheduled_Items, (SubLObject)delayed_processor.UNPROVIDED));
        return processor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 2424L)
    public static SubLObject schedule(final SubLObject processor, final SubLObject obj) {
        delayed_processor_cancel_special_instruction(processor);
        process_utilities.ordered_ipc_enqueue((SubLObject)ConsesLow.cons(obj, Time.get_internal_real_time()), processor_queue(processor));
        note_active_delayed_processor(processor);
        ensure_delayed_processor_meta_daemon_running();
        return (SubLObject)delayed_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 3016L)
    public static SubLObject delayed_processor_set_delay_seconds(final SubLObject processor, final SubLObject seconds) {
        assert delayed_processor.NIL != Types.numberp(seconds) : seconds;
        _csetf_processor_delay_seconds(processor, seconds);
        return seconds;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 3236L)
    public static SubLObject delayed_processor_get_delay_seconds(final SubLObject processor) {
        return delayed_processor_delay_seconds(processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 3400L)
    public static SubLObject delayed_processor_cancel(final SubLObject processor) {
        _csetf_processor_special_instruction(processor, (SubLObject)delayed_processor.$kw36$ABORT);
        final SubLObject process_fn = delayed_processor_process_fn(processor);
        _csetf_processor_process_fn(processor, (SubLObject)delayed_processor.$sym37$NULL);
        delayed_processor_flush(processor);
        _csetf_processor_process_fn(processor, process_fn);
        return processor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 3862L)
    public static SubLObject delayed_processor_flush_next_time_around(final SubLObject processor) {
        delayed_processor_set_special_instruction(processor, (SubLObject)delayed_processor.$kw38$FLUSH);
        return processor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 4160L)
    public static SubLObject delayed_processor_flush(final SubLObject processor) {
        delayed_processor_flush_next_time_around(processor);
        ensure_delayed_processor_daemon_running(processor);
        while (!delayed_processor.ZERO_INTEGER.eql(delayed_processor_queue_size(processor))) {
            Threads.sleep((SubLObject)delayed_processor.$float39$0_01);
        }
        return (SubLObject)delayed_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 4539L)
    public static SubLObject delayed_processor_queue_size(final SubLObject processor) {
        return (SubLObject)((delayed_processor.NIL != process_utilities.ordered_ipc_queue_p(delayed_processor_queue(processor))) ? process_utilities.ordered_ipc_current_queue_size(delayed_processor_queue(processor), (SubLObject)delayed_processor.UNPROVIDED) : delayed_processor.ZERO_INTEGER);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 4750L)
    public static SubLObject delayed_processor_daemon_process(final SubLObject processor) {
        assert delayed_processor.NIL != delayed_processor_p(processor) : processor;
        return processor_daemon_process(processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 4915L)
    public static SubLObject delayed_processor_queue(final SubLObject processor) {
        assert delayed_processor.NIL != delayed_processor_p(processor) : processor;
        return processor_queue(processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 5050L)
    public static SubLObject delayed_processor_delay_seconds(final SubLObject processor) {
        assert delayed_processor.NIL != delayed_processor_p(processor) : processor;
        return processor_delay_seconds(processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 5201L)
    public static SubLObject delayed_processor_validity_test(final SubLObject processor) {
        assert delayed_processor.NIL != delayed_processor_p(processor) : processor;
        return processor_validity_test(processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 5352L)
    public static SubLObject delayed_processor_process_fn(final SubLObject processor) {
        assert delayed_processor.NIL != delayed_processor_p(processor) : processor;
        return processor_process_fn(processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 5497L)
    public static SubLObject delayed_processor_special_instruction(final SubLObject processor) {
        assert delayed_processor.NIL != delayed_processor_p(processor) : processor;
        return processor_special_instruction(processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 5660L)
    public static SubLObject delayed_processor_abortP(final SubLObject processor) {
        assert delayed_processor.NIL != delayed_processor_p(processor) : processor;
        return Equality.eql((SubLObject)delayed_processor.$kw36$ABORT, delayed_processor_special_instruction(processor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 5831L)
    public static SubLObject delayed_processor_flushP(final SubLObject processor) {
        assert delayed_processor.NIL != delayed_processor_p(processor) : processor;
        return Equality.eql((SubLObject)delayed_processor.$kw38$FLUSH, delayed_processor_special_instruction(processor));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 6002L)
    public static SubLObject delayed_processor_set_special_instruction(final SubLObject processor, final SubLObject instruction) {
        assert delayed_processor.NIL != delayed_processor_p(processor) : processor;
        _csetf_processor_special_instruction(processor, instruction);
        return processor_special_instruction(processor);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 6258L)
    public static SubLObject delayed_processor_cancel_special_instruction(final SubLObject processor) {
        assert delayed_processor.NIL != delayed_processor_p(processor) : processor;
        return delayed_processor_set_special_instruction(processor, (SubLObject)delayed_processor.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 6444L)
    public static SubLObject process_scheduled_items(final SubLObject processor) {
        SubLObject processed_count = (SubLObject)delayed_processor.ZERO_INTEGER;
        SubLObject q = delayed_processor_queue(processor);
        SubLObject flushP = (SubLObject)delayed_processor.NIL;
        while (delayed_processor.NIL == delayed_processor_abortP(processor) && delayed_processor.NIL == process_utilities.ordered_ipc_queue_quiescedP(q)) {
            if (delayed_processor.NIL == flushP && delayed_processor.NIL != delayed_processor_flushP(processor)) {
                flushP = (SubLObject)delayed_processor.T;
                Errors.warn((SubLObject)delayed_processor.$str40$Flushing__S, processor);
            }
            SubLObject current;
            final SubLObject datum = current = process_utilities.ordered_ipc_dequeue(q);
            SubLObject scheduled = (SubLObject)delayed_processor.NIL;
            SubLObject enqueued_time = (SubLObject)delayed_processor.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)delayed_processor.$list41);
            scheduled = current.first();
            current = (enqueued_time = current.rest());
            if (delayed_processor.NIL != Functions.funcall(delayed_processor_validity_test(processor), scheduled)) {
                for (SubLObject time_to_wait = (SubLObject)((delayed_processor.NIL != flushP) ? delayed_processor.ZERO_INTEGER : compute_delayed_processor_time_to_wait(processor, enqueued_time)); time_to_wait.isPositive(); time_to_wait = compute_delayed_processor_time_to_wait(processor, enqueued_time)) {
                    Threads.sleep((SubLObject)delayed_processor.ONE_INTEGER);
                }
                process(processor, scheduled);
                processed_count = Numbers.add(processed_count, (SubLObject)delayed_processor.ONE_INTEGER);
            }
            q = delayed_processor_queue(processor);
        }
        if (delayed_processor.NIL != process_utilities.ordered_ipc_queue_quiescedP(q)) {
            note_inactive_delayed_processor(processor);
        }
        delayed_processor_cancel_special_instruction(processor);
        return processed_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 7895L)
    public static SubLObject compute_delayed_processor_time_to_wait(final SubLObject processor, final SubLObject enqueued_time) {
        return (SubLObject)((delayed_processor.NIL != delayed_processor_flushP(processor)) ? delayed_processor.ZERO_INTEGER : Numbers.subtract(delayed_processor_delay_seconds(processor), numeric_date_utilities.elapsed_seconds_between_internal_real_times(enqueued_time, Time.get_internal_real_time())));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 8185L)
    public static SubLObject process(final SubLObject processor, final SubLObject scheduled) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject err_msg = (SubLObject)delayed_processor.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)delayed_processor.$sym42$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    Functions.funcall(delayed_processor_process_fn(processor), scheduled);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)delayed_processor.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            err_msg = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (delayed_processor.NIL != err_msg) {
            Errors.warn((SubLObject)delayed_processor.$str43$Caught_error_invoking__S_on__S___, delayed_processor_process_fn(processor), scheduled, err_msg);
        }
        return (SubLObject)delayed_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 8727L)
    public static SubLObject initialize_delayed_processor_daemon(final SubLObject processor) {
        final SubLObject old_daemon = processor_daemon_process(processor);
        if (delayed_processor.NIL != Threads.valid_process_p(old_daemon)) {
            Threads.kill_process(old_daemon);
        }
        final SubLObject name = Sequences.cconcatenate((SubLObject)delayed_processor.$str44$Delayed_Processor_Daemon_, format_nil.format_nil_a_no_copy(delayed_processor_process_fn(processor)));
        _csetf_processor_daemon_process(processor, process_utilities.make_cyc_server_process_with_args(name, (SubLObject)delayed_processor.$sym45$PROCESS_SCHEDULED_ITEMS, (SubLObject)ConsesLow.list(processor)));
        return processor;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 9341L)
    public static SubLObject ensure_delayed_processor_daemon_running(final SubLObject processor) {
        if (delayed_processor.NIL == Threads.valid_process_p(processor_daemon_process(processor))) {
            initialize_delayed_processor_daemon(processor);
        }
        return (SubLObject)delayed_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 9754L)
    public static SubLObject note_active_delayed_processor(final SubLObject processor) {
        return set.set_add(processor, delayed_processor.$active_delayed_processors$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 9870L)
    public static SubLObject note_inactive_delayed_processor(final SubLObject processor) {
        return set.set_remove(processor, delayed_processor.$active_delayed_processors$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 9991L)
    public static SubLObject ensure_delayed_processor_meta_daemon_running() {
        if (delayed_processor.NIL == Threads.valid_process_p(delayed_processor.$delayed_processor_meta_daemon$.getGlobalValue())) {
            delayed_processor.$delayed_processor_meta_daemon$.setGlobalValue(process_utilities.make_cyc_server_process((SubLObject)delayed_processor.$str46$Delayed_Processor_Meta_Daemon, (SubLObject)delayed_processor.$sym47$DELAYED_PROCESSOR_META_DAEMON_RUN));
        }
        return delayed_processor.$delayed_processor_meta_daemon$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 10309L)
    public static SubLObject delayed_processor_meta_daemon_run() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        while (delayed_processor.NIL == set.set_emptyP(delayed_processor.$active_delayed_processors$.getGlobalValue())) {
            final SubLObject set_contents_var = set.do_set_internal(delayed_processor.$active_delayed_processors$.getGlobalValue());
            SubLObject basis_object;
            SubLObject state;
            SubLObject processor;
            SubLObject ignore_errors_tag;
            SubLObject _prev_bind_0;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)delayed_processor.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); delayed_processor.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                processor = set_contents.do_set_contents_next(basis_object, state);
                if (delayed_processor.NIL != set_contents.do_set_contents_element_validP(state, processor)) {
                    ignore_errors_tag = (SubLObject)delayed_processor.NIL;
                    try {
                        thread.throwStack.push(delayed_processor.$kw48$IGNORE_ERRORS_TARGET);
                        _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)delayed_processor.$sym49$IGNORE_ERRORS_HANDLER), thread);
                            try {
                                ensure_delayed_processor_daemon_running(processor);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)delayed_processor.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)delayed_processor.$kw48$IGNORE_ERRORS_TARGET);
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                }
            }
            Threads.sleep((SubLObject)delayed_processor.ONE_INTEGER);
        }
        return (SubLObject)delayed_processor.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 10569L)
    public static SubLObject sxhash_delayed_processor_method(final SubLObject v_object) {
        return sxhash_delayed_processor(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/delayed-processor.lisp", position = 10683L)
    public static SubLObject sxhash_delayed_processor(final SubLObject processor) {
        return Sxhash.sxhash(processor_daemon_process(processor));
    }
    
    public static SubLObject declare_delayed_processor_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_print_function_trampoline", "DELAYED-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_p", "DELAYED-PROCESSOR-P", 1, 0, false);
        new $delayed_processor_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "processor_daemon_process", "PROCESSOR-DAEMON-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "processor_queue", "PROCESSOR-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "processor_delay_seconds", "PROCESSOR-DELAY-SECONDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "processor_validity_test", "PROCESSOR-VALIDITY-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "processor_process_fn", "PROCESSOR-PROCESS-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "processor_special_instruction", "PROCESSOR-SPECIAL-INSTRUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "_csetf_processor_daemon_process", "_CSETF-PROCESSOR-DAEMON-PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "_csetf_processor_queue", "_CSETF-PROCESSOR-QUEUE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "_csetf_processor_delay_seconds", "_CSETF-PROCESSOR-DELAY-SECONDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "_csetf_processor_validity_test", "_CSETF-PROCESSOR-VALIDITY-TEST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "_csetf_processor_process_fn", "_CSETF-PROCESSOR-PROCESS-FN", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "_csetf_processor_special_instruction", "_CSETF-PROCESSOR-SPECIAL-INSTRUCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "make_delayed_processor", "MAKE-DELAYED-PROCESSOR", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "visit_defstruct_delayed_processor", "VISIT-DEFSTRUCT-DELAYED-PROCESSOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "visit_defstruct_object_delayed_processor_method", "VISIT-DEFSTRUCT-OBJECT-DELAYED-PROCESSOR-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "print_delayed_processor", "PRINT-DELAYED-PROCESSOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "new_delayed_processor", "NEW-DELAYED-PROCESSOR", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "reset_delayed_processor", "RESET-DELAYED-PROCESSOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "schedule", "SCHEDULE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_set_delay_seconds", "DELAYED-PROCESSOR-SET-DELAY-SECONDS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_get_delay_seconds", "DELAYED-PROCESSOR-GET-DELAY-SECONDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_cancel", "DELAYED-PROCESSOR-CANCEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_flush_next_time_around", "DELAYED-PROCESSOR-FLUSH-NEXT-TIME-AROUND", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_flush", "DELAYED-PROCESSOR-FLUSH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_queue_size", "DELAYED-PROCESSOR-QUEUE-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_daemon_process", "DELAYED-PROCESSOR-DAEMON-PROCESS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_queue", "DELAYED-PROCESSOR-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_delay_seconds", "DELAYED-PROCESSOR-DELAY-SECONDS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_validity_test", "DELAYED-PROCESSOR-VALIDITY-TEST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_process_fn", "DELAYED-PROCESSOR-PROCESS-FN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_special_instruction", "DELAYED-PROCESSOR-SPECIAL-INSTRUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_abortP", "DELAYED-PROCESSOR-ABORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_flushP", "DELAYED-PROCESSOR-FLUSH?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_set_special_instruction", "DELAYED-PROCESSOR-SET-SPECIAL-INSTRUCTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_cancel_special_instruction", "DELAYED-PROCESSOR-CANCEL-SPECIAL-INSTRUCTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "process_scheduled_items", "PROCESS-SCHEDULED-ITEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "compute_delayed_processor_time_to_wait", "COMPUTE-DELAYED-PROCESSOR-TIME-TO-WAIT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "process", "PROCESS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "initialize_delayed_processor_daemon", "INITIALIZE-DELAYED-PROCESSOR-DAEMON", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "ensure_delayed_processor_daemon_running", "ENSURE-DELAYED-PROCESSOR-DAEMON-RUNNING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "note_active_delayed_processor", "NOTE-ACTIVE-DELAYED-PROCESSOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "note_inactive_delayed_processor", "NOTE-INACTIVE-DELAYED-PROCESSOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "ensure_delayed_processor_meta_daemon_running", "ENSURE-DELAYED-PROCESSOR-META-DAEMON-RUNNING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "delayed_processor_meta_daemon_run", "DELAYED-PROCESSOR-META-DAEMON-RUN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "sxhash_delayed_processor_method", "SXHASH-DELAYED-PROCESSOR-METHOD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.delayed_processor", "sxhash_delayed_processor", "SXHASH-DELAYED-PROCESSOR", 1, 0, false);
        return (SubLObject)delayed_processor.NIL;
    }
    
    public static SubLObject init_delayed_processor_file() {
        delayed_processor.$dtp_delayed_processor$ = SubLFiles.defconstant("*DTP-DELAYED-PROCESSOR*", (SubLObject)delayed_processor.$sym0$DELAYED_PROCESSOR);
        delayed_processor.$active_delayed_processors$ = SubLFiles.deflexical("*ACTIVE-DELAYED-PROCESSORS*", set.new_set((SubLObject)delayed_processor.UNPROVIDED, (SubLObject)delayed_processor.UNPROVIDED));
        delayed_processor.$delayed_processor_meta_daemon$ = SubLFiles.deflexical("*DELAYED-PROCESSOR-META-DAEMON*", misc_utilities.uninitialized());
        return (SubLObject)delayed_processor.NIL;
    }
    
    public static SubLObject setup_delayed_processor_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), delayed_processor.$dtp_delayed_processor$.getGlobalValue(), Symbols.symbol_function((SubLObject)delayed_processor.$sym7$DELAYED_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)delayed_processor.$list8);
        Structures.def_csetf((SubLObject)delayed_processor.$sym9$PROCESSOR_DAEMON_PROCESS, (SubLObject)delayed_processor.$sym10$_CSETF_PROCESSOR_DAEMON_PROCESS);
        Structures.def_csetf((SubLObject)delayed_processor.$sym11$PROCESSOR_QUEUE, (SubLObject)delayed_processor.$sym12$_CSETF_PROCESSOR_QUEUE);
        Structures.def_csetf((SubLObject)delayed_processor.$sym13$PROCESSOR_DELAY_SECONDS, (SubLObject)delayed_processor.$sym14$_CSETF_PROCESSOR_DELAY_SECONDS);
        Structures.def_csetf((SubLObject)delayed_processor.$sym15$PROCESSOR_VALIDITY_TEST, (SubLObject)delayed_processor.$sym16$_CSETF_PROCESSOR_VALIDITY_TEST);
        Structures.def_csetf((SubLObject)delayed_processor.$sym17$PROCESSOR_PROCESS_FN, (SubLObject)delayed_processor.$sym18$_CSETF_PROCESSOR_PROCESS_FN);
        Structures.def_csetf((SubLObject)delayed_processor.$sym19$PROCESSOR_SPECIAL_INSTRUCTION, (SubLObject)delayed_processor.$sym20$_CSETF_PROCESSOR_SPECIAL_INSTRUCTION);
        Equality.identity((SubLObject)delayed_processor.$sym0$DELAYED_PROCESSOR);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), delayed_processor.$dtp_delayed_processor$.getGlobalValue(), Symbols.symbol_function((SubLObject)delayed_processor.$sym32$VISIT_DEFSTRUCT_OBJECT_DELAYED_PROCESSOR_METHOD));
        utilities_macros.note_funcall_helper_function((SubLObject)delayed_processor.$sym6$PRINT_DELAYED_PROCESSOR);
        Structures.register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), delayed_processor.$dtp_delayed_processor$.getGlobalValue(), Symbols.symbol_function((SubLObject)delayed_processor.$sym50$SXHASH_DELAYED_PROCESSOR_METHOD));
        return (SubLObject)delayed_processor.NIL;
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
    
    static {
        me = (SubLFile)new delayed_processor();
        delayed_processor.$dtp_delayed_processor$ = null;
        delayed_processor.$active_delayed_processors$ = null;
        delayed_processor.$delayed_processor_meta_daemon$ = null;
        $sym0$DELAYED_PROCESSOR = SubLObjectFactory.makeSymbol("DELAYED-PROCESSOR");
        $sym1$DELAYED_PROCESSOR_P = SubLObjectFactory.makeSymbol("DELAYED-PROCESSOR-P");
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DAEMON-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("DELAY-SECONDS"), (SubLObject)SubLObjectFactory.makeSymbol("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESS-FN"), (SubLObject)SubLObjectFactory.makeSymbol("SPECIAL-INSTRUCTION"));
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DAEMON-PROCESS"), (SubLObject)SubLObjectFactory.makeKeyword("QUEUE"), (SubLObject)SubLObjectFactory.makeKeyword("DELAY-SECONDS"), (SubLObject)SubLObjectFactory.makeKeyword("VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeKeyword("PROCESS-FN"), (SubLObject)SubLObjectFactory.makeKeyword("SPECIAL-INSTRUCTION"));
        $list4 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROCESSOR-DAEMON-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESSOR-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESSOR-DELAY-SECONDS"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESSOR-VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESSOR-PROCESS-FN"), (SubLObject)SubLObjectFactory.makeSymbol("PROCESSOR-SPECIAL-INSTRUCTION"));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-DAEMON-PROCESS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-QUEUE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-DELAY-SECONDS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-VALIDITY-TEST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-PROCESS-FN"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-SPECIAL-INSTRUCTION"));
        $sym6$PRINT_DELAYED_PROCESSOR = SubLObjectFactory.makeSymbol("PRINT-DELAYED-PROCESSOR");
        $sym7$DELAYED_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("DELAYED-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE");
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("DELAYED-PROCESSOR-P"));
        $sym9$PROCESSOR_DAEMON_PROCESS = SubLObjectFactory.makeSymbol("PROCESSOR-DAEMON-PROCESS");
        $sym10$_CSETF_PROCESSOR_DAEMON_PROCESS = SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-DAEMON-PROCESS");
        $sym11$PROCESSOR_QUEUE = SubLObjectFactory.makeSymbol("PROCESSOR-QUEUE");
        $sym12$_CSETF_PROCESSOR_QUEUE = SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-QUEUE");
        $sym13$PROCESSOR_DELAY_SECONDS = SubLObjectFactory.makeSymbol("PROCESSOR-DELAY-SECONDS");
        $sym14$_CSETF_PROCESSOR_DELAY_SECONDS = SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-DELAY-SECONDS");
        $sym15$PROCESSOR_VALIDITY_TEST = SubLObjectFactory.makeSymbol("PROCESSOR-VALIDITY-TEST");
        $sym16$_CSETF_PROCESSOR_VALIDITY_TEST = SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-VALIDITY-TEST");
        $sym17$PROCESSOR_PROCESS_FN = SubLObjectFactory.makeSymbol("PROCESSOR-PROCESS-FN");
        $sym18$_CSETF_PROCESSOR_PROCESS_FN = SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-PROCESS-FN");
        $sym19$PROCESSOR_SPECIAL_INSTRUCTION = SubLObjectFactory.makeSymbol("PROCESSOR-SPECIAL-INSTRUCTION");
        $sym20$_CSETF_PROCESSOR_SPECIAL_INSTRUCTION = SubLObjectFactory.makeSymbol("_CSETF-PROCESSOR-SPECIAL-INSTRUCTION");
        $kw21$DAEMON_PROCESS = SubLObjectFactory.makeKeyword("DAEMON-PROCESS");
        $kw22$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw23$DELAY_SECONDS = SubLObjectFactory.makeKeyword("DELAY-SECONDS");
        $kw24$VALIDITY_TEST = SubLObjectFactory.makeKeyword("VALIDITY-TEST");
        $kw25$PROCESS_FN = SubLObjectFactory.makeKeyword("PROCESS-FN");
        $kw26$SPECIAL_INSTRUCTION = SubLObjectFactory.makeKeyword("SPECIAL-INSTRUCTION");
        $str27$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw28$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym29$MAKE_DELAYED_PROCESSOR = SubLObjectFactory.makeSymbol("MAKE-DELAYED-PROCESSOR");
        $kw30$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw31$END = SubLObjectFactory.makeKeyword("END");
        $sym32$VISIT_DEFSTRUCT_OBJECT_DELAYED_PROCESSOR_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-DELAYED-PROCESSOR-METHOD");
        $str33$_DELAYED_PROCESSOR__S_ = SubLObjectFactory.makeString("<DELAYED-PROCESSOR ~S>");
        $str34$Delayed_Processor_Scheduled_Items = SubLObjectFactory.makeString("Delayed Processor Scheduled Items");
        $sym35$NUMBERP = SubLObjectFactory.makeSymbol("NUMBERP");
        $kw36$ABORT = SubLObjectFactory.makeKeyword("ABORT");
        $sym37$NULL = SubLObjectFactory.makeSymbol("NULL");
        $kw38$FLUSH = SubLObjectFactory.makeKeyword("FLUSH");
        $float39$0_01 = (SubLFloat)SubLObjectFactory.makeDouble(0.01);
        $str40$Flushing__S = SubLObjectFactory.makeString("Flushing ~S");
        $list41 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("SCHEDULED"), (SubLObject)SubLObjectFactory.makeSymbol("ENQUEUED-TIME"));
        $sym42$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str43$Caught_error_invoking__S_on__S___ = SubLObjectFactory.makeString("Caught error invoking ~S on ~S:~% ~S");
        $str44$Delayed_Processor_Daemon_ = SubLObjectFactory.makeString("Delayed Processor Daemon ");
        $sym45$PROCESS_SCHEDULED_ITEMS = SubLObjectFactory.makeSymbol("PROCESS-SCHEDULED-ITEMS");
        $str46$Delayed_Processor_Meta_Daemon = SubLObjectFactory.makeString("Delayed Processor Meta Daemon");
        $sym47$DELAYED_PROCESSOR_META_DAEMON_RUN = SubLObjectFactory.makeSymbol("DELAYED-PROCESSOR-META-DAEMON-RUN");
        $kw48$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym49$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $sym50$SXHASH_DELAYED_PROCESSOR_METHOD = SubLObjectFactory.makeSymbol("SXHASH-DELAYED-PROCESSOR-METHOD");
    }
    
    public static final class $delayed_processor_native extends SubLStructNative
    {
        public SubLObject $daemon_process;
        public SubLObject $queue;
        public SubLObject $delay_seconds;
        public SubLObject $validity_test;
        public SubLObject $process_fn;
        public SubLObject $special_instruction;
        private static final SubLStructDeclNative structDecl;
        
        public $delayed_processor_native() {
            this.$daemon_process = (SubLObject)CommonSymbols.NIL;
            this.$queue = (SubLObject)CommonSymbols.NIL;
            this.$delay_seconds = (SubLObject)CommonSymbols.NIL;
            this.$validity_test = (SubLObject)CommonSymbols.NIL;
            this.$process_fn = (SubLObject)CommonSymbols.NIL;
            this.$special_instruction = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$delayed_processor_native.structDecl;
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
            structDecl = Structures.makeStructDeclNative((Class)$delayed_processor_native.class, delayed_processor.$sym0$DELAYED_PROCESSOR, delayed_processor.$sym1$DELAYED_PROCESSOR_P, delayed_processor.$list2, delayed_processor.$list3, new String[] { "$daemon_process", "$queue", "$delay_seconds", "$validity_test", "$process_fn", "$special_instruction" }, delayed_processor.$list4, delayed_processor.$list5, delayed_processor.$sym6$PRINT_DELAYED_PROCESSOR);
        }
    }
    
    public static final class $delayed_processor_p$UnaryFunction extends UnaryFunction
    {
        public $delayed_processor_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("DELAYED-PROCESSOR-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return delayed_processor.delayed_processor_p(arg1);
        }
    }
}

/*

	Total time: 400 ms
	
*/