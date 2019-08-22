/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      DCYC-KERNEL
 *  source file: /cyc/top/cycl/dcyc-kernel.lisp
 *  created:     2019/07/03 17:37:51
 */
public final class dcyc_kernel extends SubLTranslatedFile implements V02 {
    // // Constructor
    private dcyc_kernel() {
    }

    public static final SubLFile me = new dcyc_kernel();


    // // Definitions
    // defparameter
    private static final SubLSymbol $cco_buffer$ = makeSymbol("*CCO-BUFFER*");

    // defparameter
    private static final SubLSymbol $cco_buffer_lock$ = makeSymbol("*CCO-BUFFER-LOCK*");

    public static final SubLObject add_agent_cco_buffer() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject new_lq = queues.create_locked_queue();
                SubLObject lock = $cco_buffer_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    $cco_buffer$.setDynamicValue(append($cco_buffer$.getDynamicValue(thread), list(new_lq)), thread);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return new_lq;
            }
        }
    }

    public static final SubLObject remove_agent_cco_buffer(SubLObject agent_id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $cco_buffer_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    set_nth(agent_id, $cco_buffer$.getDynamicValue(thread), NIL);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return T;
        }
    }

    public static final SubLObject cco_buffer_management(SubLObject cco) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject agent_id = ccc_id(cco_receiver(cco));
                queues.locked_enqueue(cco, nth(agent_id, $cco_buffer$.getDynamicValue(thread)));
            }
            return cco;
        }
    }

    // defparameter
    public static final SubLSymbol $cco_buffer_fn$ = makeSymbol("*CCO-BUFFER-FN*");

    /**
     * The number of seconds an image will wait after dequeueing NIL from
     * its cco-buffer.  This prevents a busy-wait.
     *
     * @see cco-recv
     */
    // defparameter
    private static final SubLSymbol $buffer_sleep_time$ = makeSymbol("*BUFFER-SLEEP-TIME*");

    // defparameter
    public static final SubLSymbol $dcyc_debug$ = makeSymbol("*DCYC-DEBUG*");

    // defparameter
    public static final SubLSymbol $dcyc_timeout$ = makeSymbol("*DCYC-TIMEOUT*");



    /**
     * Returns the globally bound agent-id.
     */
    public static final SubLObject agent_id() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $agent_id$.getDynamicValue(thread);
        }
    }

    public static final class $ccc_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return dcyc_kernel.$ccc_native.structDecl;
        }

        public SubLObject getField2() {
            return $machine;
        }

        public SubLObject getField3() {
            return $port;
        }

        public SubLObject getField4() {
            return $id;
        }

        public SubLObject setField2(SubLObject value) {
            return $machine = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $port = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $id = value;
        }

        public SubLObject $machine = Lisp.NIL;

        public SubLObject $port = Lisp.NIL;

        public SubLObject $id = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(dcyc_kernel.$ccc_native.class, CCC, CCC_P, $list_alt5, $list_alt6, new String[]{ "$machine", "$port", "$id" }, $list_alt7, $list_alt8, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_ccc$ = makeSymbol("*DTP-CCC*");

    public static final SubLObject ccc_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ccc_p(SubLObject v_object) {
        return v_object.getJavaClass() ==dcyc_kernel.$ccc_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $ccc_p$UnaryFunction extends UnaryFunction {
        public $ccc_p$UnaryFunction() {
            super(extractFunctionNamed("CCC-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return ccc_p(arg1);
        }
    }

    public static final SubLObject ccc_machine(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CCC_P);
        return v_object.getField2();
    }

    public static final SubLObject ccc_port(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CCC_P);
        return v_object.getField3();
    }

    public static final SubLObject ccc_id(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CCC_P);
        return v_object.getField4();
    }

    public static final SubLObject _csetf_ccc_machine(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CCC_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ccc_port(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CCC_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ccc_id(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CCC_P);
        return v_object.setField4(value);
    }

    public static final SubLObject make_ccc(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new dcyc_kernel.$ccc_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($MACHINE)) {
                        _csetf_ccc_machine(v_new, current_value);
                    } else
                        if (pcase_var.eql($PORT)) {
                            _csetf_ccc_port(v_new, current_value);
                        } else
                            if (pcase_var.eql($ID)) {
                                _csetf_ccc_id(v_new, current_value);
                            } else {
                                Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                            }


                }
            }
            return v_new;
        }
    }

    // defconstant
    private static final SubLSymbol $cfasl_opcode_ccc$ = makeSymbol("*CFASL-OPCODE-CCC*");

    public static final SubLObject cfasl_output_object_ccc_method(SubLObject v_object, SubLObject stream) {
        return cfasl_output_ccc(v_object, stream);
    }

    public static final SubLObject cfasl_output_ccc(SubLObject ccc, SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_ccc$.getGlobalValue(), stream);
        cfasl_output(ccc_machine(ccc), stream);
        cfasl_output(ccc_port(ccc), stream);
        cfasl_output(ccc_id(ccc), stream);
        return ccc;
    }

    public static final SubLObject cfasl_input_ccc(SubLObject stream) {
        {
            SubLObject ccc = make_ccc(UNPROVIDED);
            _csetf_ccc_machine(ccc, cfasl_input_object(stream));
            _csetf_ccc_port(ccc, cfasl_input_object(stream));
            _csetf_ccc_id(ccc, cfasl_input_object(stream));
            return ccc;
        }
    }

    public static final SubLObject ccc_constructor(SubLObject machine, SubLObject port, SubLObject id) {
        {
            SubLObject v_object = make_ccc(UNPROVIDED);
            _csetf_ccc_machine(v_object, machine);
            _csetf_ccc_port(v_object, port);
            _csetf_ccc_id(v_object, id);
            return v_object;
        }
    }

    public static final SubLObject ccc_equal(SubLObject ccc1, SubLObject ccc2) {
        if ((ccc_machine(ccc1).equalp(ccc_machine(ccc2)) && ccc_port(ccc1).numE(ccc_port(ccc2))) && ccc_id(ccc1).numE(ccc_id(ccc2))) {
            return T;
        }
        return NIL;
    }

    public static final class $cco_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return dcyc_kernel.$cco_native.structDecl;
        }

        public SubLObject getField2() {
            return $sender;
        }

        public SubLObject getField3() {
            return $receiver;
        }

        public SubLObject getField4() {
            return $data;
        }

        public SubLObject setField2(SubLObject value) {
            return $sender = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $receiver = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $data = value;
        }

        public SubLObject $sender = Lisp.NIL;

        public SubLObject $receiver = Lisp.NIL;

        public SubLObject $data = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(dcyc_kernel.$cco_native.class, CCO, CCO_P, $list_alt26, $list_alt27, new String[]{ "$sender", "$receiver", "$data" }, $list_alt28, $list_alt29, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_cco$ = makeSymbol("*DTP-CCO*");

    public static final SubLObject cco_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject cco_p(SubLObject v_object) {
        return v_object.getJavaClass() ==dcyc_kernel.$cco_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $cco_p$UnaryFunction extends UnaryFunction {
        public $cco_p$UnaryFunction() {
            super(extractFunctionNamed("CCO-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return cco_p(arg1);
        }
    }

    public static final SubLObject cco_sender(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CCO_P);
        return v_object.getField2();
    }

    public static final SubLObject cco_receiver(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CCO_P);
        return v_object.getField3();
    }

    public static final SubLObject cco_data(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CCO_P);
        return v_object.getField4();
    }

    public static final SubLObject _csetf_cco_sender(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CCO_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_cco_receiver(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CCO_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_cco_data(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CCO_P);
        return v_object.setField4(value);
    }

    public static final SubLObject make_cco(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new dcyc_kernel.$cco_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SENDER)) {
                        _csetf_cco_sender(v_new, current_value);
                    } else
                        if (pcase_var.eql($RECEIVER)) {
                            _csetf_cco_receiver(v_new, current_value);
                        } else
                            if (pcase_var.eql($DATA)) {
                                _csetf_cco_data(v_new, current_value);
                            } else {
                                Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                            }


                }
            }
            return v_new;
        }
    }

    // defconstant
    private static final SubLSymbol $cfasl_opcode_cco$ = makeSymbol("*CFASL-OPCODE-CCO*");

    public static final SubLObject cfasl_output_object_cco_method(SubLObject v_object, SubLObject stream) {
        return cfasl_output_cco(v_object, stream);
    }

    public static final SubLObject cfasl_output_cco(SubLObject cco, SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_cco$.getGlobalValue(), stream);
        cfasl_output(cco_sender(cco), stream);
        cfasl_output(cco_receiver(cco), stream);
        cfasl_output(cco_data(cco), stream);
        return cco;
    }

    public static final SubLObject cfasl_input_cco(SubLObject stream) {
        {
            SubLObject cco = make_cco(UNPROVIDED);
            _csetf_cco_sender(cco, cfasl_input_object(stream));
            _csetf_cco_receiver(cco, cfasl_input_object(stream));
            _csetf_cco_data(cco, cfasl_input_object(stream));
            return cco;
        }
    }

    public static final SubLObject cco_constructor(SubLObject receiver, SubLObject value) {
        {
            SubLObject cco_object = make_cco(UNPROVIDED);
            SubLObject ccc_object = make_ccc(UNPROVIDED);
            _csetf_ccc_machine(ccc_object, Environment.get_machine_name(UNPROVIDED));
            _csetf_ccc_port(ccc_object, cfasl_kernel.cfasl_port());
            _csetf_ccc_id(ccc_object, agent_id());
            _csetf_cco_sender(cco_object, ccc_object);
            _csetf_cco_receiver(cco_object, receiver);
            _csetf_cco_data(cco_object, value);
            return cco_object;
        }
    }

    /**
     * Opens a tcp connection to the machine and port specified in CCC
     * and stores OBJECT in the data slot of a new cco structure.  The
     * specific item that is transmitted across the tcp connection is
     * a list of the form ( *cco-buffer-fn* cco-struct )
     */
    public static final SubLObject cco_send(SubLObject v_object, SubLObject ccc) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ccc_p(ccc)) {
                {
                    SubLObject cco = cco_constructor(ccc, v_object);
                    SubLObject channel = NIL;
                    try {
                        channel = subl_promotions.open_tcp_stream_with_timeout(ccc_machine(cco_receiver(cco)), ccc_port(cco_receiver(cco)), NIL, $PRIVATE);
                        if (NIL != channel) {
                            cfasl_output(list($cco_buffer_fn$.getDynamicValue(thread), cco), channel);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (NIL != channel) {
                                    close(channel, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                    return T;
                }
            }
            return NIL;
        }
    }

    /**
     * Removes one non-nil cco object from the specified BUFFER.
     * BUFFER must be a locked-queue structure.  Since this is a
     * blocking protocol a permanent wait is possible.
     */
    public static final SubLObject cco_recv(SubLObject buffer) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != queues.locked_queue_p(buffer)) {
                {
                    SubLObject v_object = queues.locked_dequeue(buffer);
                    while (NIL == v_object) {
                        sleep($buffer_sleep_time$.getDynamicValue(thread));
                        v_object = queues.locked_dequeue(buffer);
                    } 
                    if (NIL != $dcyc_debug$.getDynamicValue(thread)) {
                        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt44$Received__a__, cco_data(v_object));
                        if (NIL != ccc_p(cadr(cco_data(v_object)))) {
                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt45$CCC_machine____a___port____a___id, new SubLObject[]{ ccc_machine(cadr(cco_data(v_object))), ccc_port(cadr(cco_data(v_object))), ccc_id(cadr(cco_data(v_object))) });
                        }
                        force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                    }
                    return v_object;
                }
            }
            return NIL;
        }
    }

    /**
     * Spawns off a child process to use cco-send on OBJECT and CHANNEL.
     *
     * @return task; The task that is performing the cco-send.
     */
    public static final SubLObject cco_isend(SubLObject v_object, SubLObject channel) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != ccc_p(channel)) {
                return process_utilities.new_task($str_alt46$isend___Task, symbol_function(CCO_SEND), list(v_object, channel), list(list($agent_id$, $agent_id$.getDynamicValue(thread))));
            }
            return NIL;
        }
    }

    /**
     * Dequeues a non-nil object from BUFFER (which must be a locked queue)
     * and places it in the Nth entry of OBJECT-VECTOR.
     * Returns the non-nil object.
     */
    public static final SubLObject cco_ibuffer_input(SubLObject object_vector, SubLObject buffer, SubLObject n) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_object = queues.locked_dequeue(buffer);
                while (NIL == v_object) {
                    sleep($buffer_sleep_time$.getDynamicValue(thread));
                    v_object = queues.locked_dequeue(buffer);
                } 
                if (NIL != $dcyc_debug$.getDynamicValue(thread)) {
                    format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt49$IReceived__a__, cco_data(v_object));
                    force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
                }
                set_aref(object_vector, n, v_object);
                return v_object;
            }
        }
    }

    /**
     * Spawns off a child process to receive a non-nil object from BUFFER.
     * The object retrieved is stored in the Nth entry of OBJECT-VECTOR.
     *
     * @return task; The task that is performing the retrieval.
     * @see cco-ibuffer-input
     */
    public static final SubLObject cco_irecv(SubLObject object_vector, SubLObject buffer, SubLObject n) {
        if (n == UNPROVIDED) {
            n = ZERO_INTEGER;
        }
        if ((((NIL != queues.locked_queue_p(buffer)) && n.isInteger()) && n.numL(length(object_vector))) && n.numGE(ZERO_INTEGER)) {
            return process_utilities.new_task($str_alt50$irecv___task, symbol_function(CCO_IBUFFER_INPUT), list(object_vector, buffer, n), UNPROVIDED);
        }
        return NIL;
    }

    /**
     * This parameter is rebound to a specific task within cco test commands.
     *
     * @unknown This is necessary since process-wait-with-timeout can only take a
    unary predicate to test;
     * @unknown Lambdas would make this parameter unnecessary;
     * @see task-test
     */
    // defparameter
    private static final SubLSymbol $cco_wait_slot$ = makeSymbol("*CCO-WAIT-SLOT*");

    /**
     *
     *
     * @see *cco-wait-slot*
     */
    public static final SubLObject task_test() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return process_utilities.task_completed($cco_wait_slot$.getDynamicValue(thread));
        }
    }

    /**
     *
     *
     * @return boolean; (task-completed REQUEST)
     * @see *cco-wait-slot*
     */
    public static final SubLObject cco_test(SubLObject task) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != process_utilities.task_p(task)) {
                {
                    SubLObject ans = NIL;
                    {
                        SubLObject _prev_bind_0 = $cco_wait_slot$.currentBinding(thread);
                        try {
                            $cco_wait_slot$.bind(task, thread);
                            ans = task_test();
                        } finally {
                            $cco_wait_slot$.rebind(_prev_bind_0, thread);
                        }
                    }
                    return ans;
                }
            }
            return NIL;
        }
    }

    /**
     * The current process will wait until (task-completed REQUEST) is T
     * or TIMEOUT seconds have passed.
     *
     * @return boolean; t iff (task-completed REQUEST)
     */
    public static final SubLObject cco_wait(SubLObject task, SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $cco_wait_slot$.currentBinding(thread);
                    try {
                        $cco_wait_slot$.bind(task, thread);
                        if (timeout.isInteger()) {
                            ans = process_wait_with_timeout(timeout, $str_alt52$cco_wait, symbol_function(TASK_TEST));
                        } else {
                            ans = process_wait($str_alt52$cco_wait, symbol_function(TASK_TEST));
                        }
                    } finally {
                        $cco_wait_slot$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff one or more of *cco-wait-slot* satisfies task-completed
     */
    public static final SubLObject task_test_any() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vector_length = length($cco_wait_slot$.getDynamicValue(thread));
                SubLObject found = NIL;
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; !(index.numE(vector_length) || (NIL != found)); index = add(index, ONE_INTEGER)) {
                    if (NIL != cco_test(aref($cco_wait_slot$.getDynamicValue(thread), index))) {
                        found = T;
                    }
                }
                return found;
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff one or more of the tasks in TASK-VECTOR have completed.
     */
    public static final SubLObject cco_testany(SubLObject task_vector) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $cco_wait_slot$.currentBinding(thread);
                    try {
                        $cco_wait_slot$.bind(task_vector, thread);
                        ans = task_test_any();
                    } finally {
                        $cco_wait_slot$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * The current process will wait until one or more of the tasks in
     * TASK-VECTOR satisfy task-completed or TIMEOUT seconds have passed.
     *
     * @return boolean; t iff one of more of the tasks in TASK-VECTOR have completed.
     */
    public static final SubLObject cco_waitany(SubLObject task_vector, SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $cco_wait_slot$.currentBinding(thread);
                    try {
                        $cco_wait_slot$.bind(task_vector, thread);
                        if (timeout.isInteger()) {
                            ans = process_wait_with_timeout(timeout, $str_alt54$cco_waitany, symbol_function(TASK_TEST_ANY));
                        } else {
                            ans = process_wait($str_alt54$cco_waitany, symbol_function(TASK_TEST_ANY));
                        }
                    } finally {
                        $cco_wait_slot$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff all of *cco-wait-slot* satisfies task-completed
     */
    public static final SubLObject task_test_all() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject vector_length = length($cco_wait_slot$.getDynamicValue(thread));
                SubLObject found = NIL;
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; !(index.numE(vector_length) || (NIL != found)); index = add(index, ONE_INTEGER)) {
                    if (NIL == cco_test(aref($cco_wait_slot$.getDynamicValue(thread), index))) {
                        found = T;
                    }
                }
                return sublisp_null(found);
            }
        }
    }

    /**
     *
     *
     * @return boolean; t iff all of the tasks in TASK-VECTOR have completed.
     * @unknown If return is NIL that doesn't mean that the tasks haven't completed.
    The tasks *could* have completed in the split second between the test
    and the return.
     */
    public static final SubLObject cco_testall(SubLObject task_vector) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $cco_wait_slot$.currentBinding(thread);
                    try {
                        $cco_wait_slot$.bind(task_vector, thread);
                        ans = task_test_all();
                    } finally {
                        $cco_wait_slot$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * The current process will wait until all of the tasks in TASK-VECTOR
     * satisfy task-completed or TIMEOUT seconds have passed.
     *
     * @return boolean; t iff all tasks in TASK-VECTOR have completed.
     */
    public static final SubLObject cco_waitall(SubLObject task_vector, SubLObject timeout) {
        if (timeout == UNPROVIDED) {
            timeout = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $cco_wait_slot$.currentBinding(thread);
                    try {
                        $cco_wait_slot$.bind(task_vector, thread);
                        if (timeout.isInteger()) {
                            ans = process_wait_with_timeout(timeout, $str_alt56$cco_waitall, symbol_function(TASK_TEST_ALL));
                        } else {
                            ans = process_wait($str_alt56$cco_waitall, symbol_function(TASK_TEST_ALL));
                        }
                    } finally {
                        $cco_wait_slot$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     * Sends OBJECT to all channels in CHANNEL-VECTOR.
     *
     * @return vector; Composed of tasks performing cco-isend.
     */
    public static final SubLObject cco_broadcast(SubLObject v_object, SubLObject channel_vector) {
        if (NIL == list_utilities.find_if_not(symbol_function(CCC_P), channel_vector, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject channel_length = length(channel_vector);
                SubLObject request_vector = make_vector(channel_length, UNPROVIDED);
                SubLObject cdotimes_end_var = length(channel_vector);
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; index.numL(cdotimes_end_var); index = add(index, ONE_INTEGER)) {
                    set_aref(request_vector, index, cco_isend(v_object, aref(channel_vector, index)));
                }
                return request_vector;
            }
        }
        return NIL;
    }

    /**
     * Sends each object in OBJECT-VECTOR to the associated channel in CHANNEL-VECTOR.
     *
     * @return 0 nil; if (length OBJECT-VECTOR) > (length CHANNEL-VECTOR)
     * @return 1 vector; Composed of tasks performing cco-isend.
     * @unknown - if (length CHANNEL-VECTOR) > (length OBJECT-VECTOR) no messages are
    sent to the remaining channels.
     */
    public static final SubLObject cco_scatter(SubLObject object_vector, SubLObject channel_vector) {
        if (NIL == list_utilities.find_if_not(symbol_function(CCC_P), channel_vector, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            {
                SubLObject object_length = length(object_vector);
                SubLObject request_vector = make_vector(object_length, UNPROVIDED);
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; index.numL(object_length); index = add(index, ONE_INTEGER)) {
                    set_aref(request_vector, index, cco_isend(aref(object_vector, index), aref(channel_vector, index)));
                }
                return request_vector;
            }
        }
        return NIL;
    }

    /**
     * Fills in OBJECT-VECTOR by receiving (length OBJECT-VECTOR) objects from the buffer.
     *
     * @return vector; Composed of tasks performing cco-irecv into OBJECT-VECTOR.
     */
    public static final SubLObject cco_gather(SubLObject object_vector, SubLObject buffer) {
        if (NIL != queues.locked_queue_p(buffer)) {
            {
                SubLObject object_length = length(object_vector);
                SubLObject request_vector = make_vector(object_length, UNPROVIDED);
                SubLObject index = NIL;
                for (index = ZERO_INTEGER; index.numL(object_length); index = add(index, ONE_INTEGER)) {
                    set_aref(request_vector, index, cco_irecv(object_vector, buffer, index));
                }
                return request_vector;
            }
        }
        return NIL;
    }

    /**
     * Map over OBJECT-VECTOR performing cco-data on each element.
     *
     * @return vector; cco-data of each element of OBJECT-VECTOR
     * @unknown - If key is not identity then we funcall key on the cco-data of
    each element of the vector.
     */
    public static final SubLObject cco_vector_data(SubLObject object_vector, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $dcyc_debug$.getDynamicValue(thread)) {
                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt58$OV____a____a__, object_vector, funcall(key, cco_data(aref(object_vector, ZERO_INTEGER))));
                force_output(StreamsLow.$standard_output$.getDynamicValue(thread));
            }
            if (object_vector.isVector()) {
                if (NIL == list_utilities.find_if_not(symbol_function(CCO_P), object_vector, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject vector_length = length(object_vector);
                        SubLObject result_vector = make_vector(vector_length, UNPROVIDED);
                        SubLObject i = NIL;
                        for (i = ZERO_INTEGER; i.numL(vector_length); i = add(i, ONE_INTEGER)) {
                            set_aref(result_vector, i, funcall(key, cco_data(aref(object_vector, i))));
                        }
                        return result_vector;
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject declare_dcyc_kernel_file() {
        declareFunction("add_agent_cco_buffer", "ADD-AGENT-CCO-BUFFER", 0, 0, false);
        declareFunction("remove_agent_cco_buffer", "REMOVE-AGENT-CCO-BUFFER", 1, 0, false);
        declareFunction("cco_buffer_management", "CCO-BUFFER-MANAGEMENT", 1, 0, false);
        declareFunction("agent_id", "AGENT-ID", 0, 0, false);
        declareFunction("ccc_print_function_trampoline", "CCC-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ccc_p", "CCC-P", 1, 0, false);
        new dcyc_kernel.$ccc_p$UnaryFunction();
        declareFunction("ccc_machine", "CCC-MACHINE", 1, 0, false);
        declareFunction("ccc_port", "CCC-PORT", 1, 0, false);
        declareFunction("ccc_id", "CCC-ID", 1, 0, false);
        declareFunction("_csetf_ccc_machine", "_CSETF-CCC-MACHINE", 2, 0, false);
        declareFunction("_csetf_ccc_port", "_CSETF-CCC-PORT", 2, 0, false);
        declareFunction("_csetf_ccc_id", "_CSETF-CCC-ID", 2, 0, false);
        declareFunction("make_ccc", "MAKE-CCC", 0, 1, false);
        declareFunction("cfasl_output_object_ccc_method", "CFASL-OUTPUT-OBJECT-CCC-METHOD", 2, 0, false);
        declareFunction("cfasl_output_ccc", "CFASL-OUTPUT-CCC", 2, 0, false);
        declareFunction("cfasl_input_ccc", "CFASL-INPUT-CCC", 1, 0, false);
        declareFunction("ccc_constructor", "CCC-CONSTRUCTOR", 3, 0, false);
        declareFunction("ccc_equal", "CCC-EQUAL", 2, 0, false);
        declareFunction("cco_print_function_trampoline", "CCO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("cco_p", "CCO-P", 1, 0, false);
        new dcyc_kernel.$cco_p$UnaryFunction();
        declareFunction("cco_sender", "CCO-SENDER", 1, 0, false);
        declareFunction("cco_receiver", "CCO-RECEIVER", 1, 0, false);
        declareFunction("cco_data", "CCO-DATA", 1, 0, false);
        declareFunction("_csetf_cco_sender", "_CSETF-CCO-SENDER", 2, 0, false);
        declareFunction("_csetf_cco_receiver", "_CSETF-CCO-RECEIVER", 2, 0, false);
        declareFunction("_csetf_cco_data", "_CSETF-CCO-DATA", 2, 0, false);
        declareFunction("make_cco", "MAKE-CCO", 0, 1, false);
        declareFunction("cfasl_output_object_cco_method", "CFASL-OUTPUT-OBJECT-CCO-METHOD", 2, 0, false);
        declareFunction("cfasl_output_cco", "CFASL-OUTPUT-CCO", 2, 0, false);
        declareFunction("cfasl_input_cco", "CFASL-INPUT-CCO", 1, 0, false);
        declareFunction("cco_constructor", "CCO-CONSTRUCTOR", 2, 0, false);
        declareFunction("cco_send", "CCO-SEND", 2, 0, false);
        declareFunction("cco_recv", "CCO-RECV", 1, 0, false);
        declareFunction("cco_isend", "CCO-ISEND", 2, 0, false);
        declareFunction("cco_ibuffer_input", "CCO-IBUFFER-INPUT", 3, 0, false);
        declareFunction("cco_irecv", "CCO-IRECV", 2, 1, false);
        declareFunction("task_test", "TASK-TEST", 0, 0, false);
        declareFunction("cco_test", "CCO-TEST", 1, 0, false);
        declareFunction("cco_wait", "CCO-WAIT", 1, 1, false);
        declareFunction("task_test_any", "TASK-TEST-ANY", 0, 0, false);
        declareFunction("cco_testany", "CCO-TESTANY", 1, 0, false);
        declareFunction("cco_waitany", "CCO-WAITANY", 1, 1, false);
        declareFunction("task_test_all", "TASK-TEST-ALL", 0, 0, false);
        declareFunction("cco_testall", "CCO-TESTALL", 1, 0, false);
        declareFunction("cco_waitall", "CCO-WAITALL", 1, 1, false);
        declareFunction("cco_broadcast", "CCO-BROADCAST", 2, 0, false);
        declareFunction("cco_scatter", "CCO-SCATTER", 2, 0, false);
        declareFunction("cco_gather", "CCO-GATHER", 2, 0, false);
        declareFunction("cco_vector_data", "CCO-VECTOR-DATA", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_dcyc_kernel_file() {
        defparameter("*CCO-BUFFER*", NIL);
        defparameter("*CCO-BUFFER-LOCK*", make_lock($$$CCO_Buffer_Lock));
        defparameter("*CCO-BUFFER-FN*", CCO_BUFFER_MANAGEMENT);
        defparameter("*BUFFER-SLEEP-TIME*", TWO_INTEGER);
        defparameter("*DCYC-DEBUG*", NIL);
        defparameter("*DCYC-TIMEOUT*", DCYC_TIMEOUT);
        defparameter("*AGENT-ID*", NIL);
        defconstant("*DTP-CCC*", CCC);
        defconstant("*CFASL-OPCODE-CCC*", $int$121);
        defconstant("*DTP-CCO*", CCO);
        defconstant("*CFASL-OPCODE-CCO*", $int$123);
        defparameter("*CCO-WAIT-SLOT*", process_utilities.make_task(UNPROVIDED));
        return NIL;
    }

    public static final SubLObject setup_dcyc_kernel_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_ccc$.getGlobalValue(), symbol_function(CCC_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CCC_MACHINE, _CSETF_CCC_MACHINE);
        def_csetf(CCC_PORT, _CSETF_CCC_PORT);
        def_csetf(CCC_ID, _CSETF_CCC_ID);
        identity(CCC);
        register_cfasl_input_function($cfasl_opcode_ccc$.getGlobalValue(), CFASL_INPUT_CCC);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_ccc$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CCC_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_cco$.getGlobalValue(), symbol_function(CCO_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CCO_SENDER, _CSETF_CCO_SENDER);
        def_csetf(CCO_RECEIVER, _CSETF_CCO_RECEIVER);
        def_csetf(CCO_DATA, _CSETF_CCO_DATA);
        identity(CCO);
        register_cfasl_input_function($cfasl_opcode_cco$.getGlobalValue(), CFASL_INPUT_CCO);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_cco$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_CCO_METHOD));
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$CCO_Buffer_Lock = makeString("CCO Buffer Lock");

    private static final SubLSymbol CCO_BUFFER_MANAGEMENT = makeSymbol("CCO-BUFFER-MANAGEMENT");

    private static final SubLSymbol DCYC_TIMEOUT = makeSymbol("DCYC-TIMEOUT");

    private static final SubLSymbol CCC = makeSymbol("CCC");

    private static final SubLSymbol CCC_P = makeSymbol("CCC-P");

    static private final SubLList $list_alt5 = list(makeSymbol("MACHINE"), makeSymbol("PORT"), makeSymbol("ID"));

    static private final SubLList $list_alt6 = list(makeKeyword("MACHINE"), $PORT, makeKeyword("ID"));

    static private final SubLList $list_alt7 = list(makeSymbol("CCC-MACHINE"), makeSymbol("CCC-PORT"), makeSymbol("CCC-ID"));

    static private final SubLList $list_alt8 = list(makeSymbol("_CSETF-CCC-MACHINE"), makeSymbol("_CSETF-CCC-PORT"), makeSymbol("_CSETF-CCC-ID"));



    private static final SubLSymbol CCC_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CCC-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol CCC_MACHINE = makeSymbol("CCC-MACHINE");

    public static final SubLSymbol _CSETF_CCC_MACHINE = makeSymbol("_CSETF-CCC-MACHINE");

    private static final SubLSymbol CCC_PORT = makeSymbol("CCC-PORT");

    public static final SubLSymbol _CSETF_CCC_PORT = makeSymbol("_CSETF-CCC-PORT");

    private static final SubLSymbol CCC_ID = makeSymbol("CCC-ID");

    public static final SubLSymbol _CSETF_CCC_ID = makeSymbol("_CSETF-CCC-ID");







    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    public static final SubLInteger $int$121 = makeInteger(121);

    private static final SubLSymbol CFASL_INPUT_CCC = makeSymbol("CFASL-INPUT-CCC");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_CCC_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CCC-METHOD");

    private static final SubLSymbol CCO = makeSymbol("CCO");

    private static final SubLSymbol CCO_P = makeSymbol("CCO-P");

    static private final SubLList $list_alt26 = list(makeSymbol("SENDER"), makeSymbol("RECEIVER"), makeSymbol("DATA"));

    static private final SubLList $list_alt27 = list(makeKeyword("SENDER"), makeKeyword("RECEIVER"), $DATA);

    static private final SubLList $list_alt28 = list(makeSymbol("CCO-SENDER"), makeSymbol("CCO-RECEIVER"), makeSymbol("CCO-DATA"));

    static private final SubLList $list_alt29 = list(makeSymbol("_CSETF-CCO-SENDER"), makeSymbol("_CSETF-CCO-RECEIVER"), makeSymbol("_CSETF-CCO-DATA"));

    private static final SubLSymbol CCO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CCO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol CCO_SENDER = makeSymbol("CCO-SENDER");

    public static final SubLSymbol _CSETF_CCO_SENDER = makeSymbol("_CSETF-CCO-SENDER");

    private static final SubLSymbol CCO_RECEIVER = makeSymbol("CCO-RECEIVER");

    public static final SubLSymbol _CSETF_CCO_RECEIVER = makeSymbol("_CSETF-CCO-RECEIVER");

    private static final SubLSymbol CCO_DATA = makeSymbol("CCO-DATA");

    public static final SubLSymbol _CSETF_CCO_DATA = makeSymbol("_CSETF-CCO-DATA");







    public static final SubLInteger $int$123 = makeInteger(123);

    private static final SubLSymbol CFASL_INPUT_CCO = makeSymbol("CFASL-INPUT-CCO");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_CCO_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-CCO-METHOD");



    static private final SubLString $str_alt44$Received__a__ = makeString("Received ~a~%");

    static private final SubLString $str_alt45$CCC_machine____a___port____a___id = makeString("CCC machine = ~a : port = ~a : id = ~a~%");

    static private final SubLString $str_alt46$isend___Task = makeString("isend - Task");

    private static final SubLSymbol CCO_SEND = makeSymbol("CCO-SEND");

    public static final SubLSymbol $agent_id$ = makeSymbol("*AGENT-ID*");

    static private final SubLString $str_alt49$IReceived__a__ = makeString("IReceived ~a~%");

    static private final SubLString $str_alt50$irecv___task = makeString("irecv - task");

    private static final SubLSymbol CCO_IBUFFER_INPUT = makeSymbol("CCO-IBUFFER-INPUT");

    static private final SubLString $str_alt52$cco_wait = makeString("cco-wait");

    private static final SubLSymbol TASK_TEST = makeSymbol("TASK-TEST");

    static private final SubLString $str_alt54$cco_waitany = makeString("cco-waitany");

    private static final SubLSymbol TASK_TEST_ANY = makeSymbol("TASK-TEST-ANY");

    static private final SubLString $str_alt56$cco_waitall = makeString("cco-waitall");

    private static final SubLSymbol TASK_TEST_ALL = makeSymbol("TASK-TEST-ALL");

    static private final SubLString $str_alt58$OV____a____a__ = makeString("OV : ~a : ~a~%");

    // // Initializers
    public void declareFunctions() {
        declare_dcyc_kernel_file();
    }

    public void initializeVariables() {
        init_dcyc_kernel_file();
    }

    public void runTopLevelForms() {
        setup_dcyc_kernel_file();
    }
}

