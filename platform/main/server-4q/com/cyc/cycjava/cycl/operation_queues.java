package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class operation_queues extends SubLTranslatedFile {
    public static final SubLFile me = new operation_queues();

    public static final String myName = "com.cyc.cycjava.cycl.operation_queues";

    public static final String myFingerPrint = "7fd42f2e861e5d0aa8b21a926da259457d09fe159fa82836f26762a630c034c5";



    // defparameter
    public static final SubLSymbol $local_queue_lock$ = makeSymbol("*LOCAL-QUEUE-LOCK*");



    // defparameter
    public static final SubLSymbol $remote_queue_lock$ = makeSymbol("*REMOTE-QUEUE-LOCK*");



    // defparameter
    public static final SubLSymbol $transcript_queue_lock$ = makeSymbol("*TRANSCRIPT-QUEUE-LOCK*");



    // defparameter
    public static final SubLSymbol $hl_transcript_queue_lock$ = makeSymbol("*HL-TRANSCRIPT-QUEUE-LOCK*");



    // defparameter
    public static final SubLSymbol $auxiliary_queue_lock$ = makeSymbol("*AUXILIARY-QUEUE-LOCK*");



    // defparameter
    public static final SubLSymbol $transmit_queue_lock$ = makeSymbol("*TRANSMIT-QUEUE-LOCK*");



    // defparameter
    public static final SubLSymbol $local_operation_storage_queue_lock$ = makeSymbol("*LOCAL-OPERATION-STORAGE-QUEUE-LOCK*");

    // defparameter
    public static final SubLSymbol $within_a_remote_opP$ = makeSymbol("*WITHIN-A-REMOTE-OP?*");

    // defparameter
    /**
     * Do we support HL transcripts? Currently (11/04) HL transcript support is
     * experimental, so this should be left as NIL.
     */
    public static final SubLSymbol $hl_transcripts_enabledP$ = makeSymbol("*HL-TRANSCRIPTS-ENABLED?*");

    // deflexical
    /**
     * Operators that are handled differently in HL transcripts than EL transcripts,
     * and so should not be straightforwardly written to the HL transcript
     */
    private static final SubLSymbol $hl_transcript_special_operators$ = makeSymbol("*HL-TRANSCRIPT-SPECIAL-OPERATORS*");

    // Internal Constants
    public static final SubLSymbol $local_queue$ = makeSymbol("*LOCAL-QUEUE*");

    public static final SubLString $$$Local_Queue_Lock = makeString("Local Queue Lock");

    public static final SubLString $str2$Local_queue_being_overwritten___A = makeString("Local queue being overwritten, ~A operations lost");

    public static final SubLSymbol $remote_queue$ = makeSymbol("*REMOTE-QUEUE*");

    public static final SubLString $$$Remote_Queue_Lock = makeString("Remote Queue Lock");

    public static final SubLSymbol $transcript_queue$ = makeSymbol("*TRANSCRIPT-QUEUE*");

    public static final SubLString $$$Transcript_Queue_Lock = makeString("Transcript Queue Lock");

    public static final SubLSymbol $hl_transcript_queue$ = makeSymbol("*HL-TRANSCRIPT-QUEUE*");

    public static final SubLString $$$HL_Transcript_Queue_Lock = makeString("HL Transcript Queue Lock");

    public static final SubLSymbol $auxiliary_queue$ = makeSymbol("*AUXILIARY-QUEUE*");

    public static final SubLString $$$Auxiliary_Queue_Lock = makeString("Auxiliary Queue Lock");

    public static final SubLSymbol $transmit_queue$ = makeSymbol("*TRANSMIT-QUEUE*");

    public static final SubLString $$$Transmit_Queue_Lock = makeString("Transmit Queue Lock");

    private static final SubLString $str13$The_Transmit_Queue_contains_OP__A = makeString("The Transmit Queue contains OP ~A, not the expected op ~A--out of sync.");

    public static final SubLSymbol $local_operation_storage_queue$ = makeSymbol("*LOCAL-OPERATION-STORAGE-QUEUE*");

    private static final SubLString $$$Local_Operation_Queue_Lock = makeString("Local Operation Queue Lock");

    private static final SubLSymbol ALL_INTERNAL_QUEUE_SIZES = makeSymbol("ALL-INTERNAL-QUEUE-SIZES");

    private static final SubLSymbol WAIT_FOR_QUEUES_TO_FINISH = makeSymbol("WAIT-FOR-QUEUES-TO-FINISH");





    private static final SubLString $str20$_A = makeString("~A");

    private static final SubLList $list21 = list(makeSymbol("FI-ASSERT"), makeSymbol("FI-UNASSERT"), makeSymbol("FI-BLAST"), makeSymbol("FI-TIMESTAMP-CONSTANT"), makeSymbol("FI-TIMESTAMP-ASSERTION"));



    private static final SubLSymbol WITH_BOOKKEEPING_INFO = makeSymbol("WITH-BOOKKEEPING-INFO");



    public static SubLObject local_queue_size() {
        return queues.queue_size($local_queue$.getGlobalValue());
    }

    public static SubLObject local_queue_empty() {
        return queues.queue_empty_p($local_queue$.getGlobalValue());
    }

    public static SubLObject clear_local_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($local_queue_lock$.getDynamicValue(thread));
            queues.clear_queue($local_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($local_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static SubLObject local_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($local_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, $local_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($local_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static SubLObject local_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($local_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue($local_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($local_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static SubLObject local_queue_peek() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($local_queue_lock$.getDynamicValue(thread));
            ans = queues.queue_peek($local_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($local_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static SubLObject local_queue_contents() {
        return queues.queue_elements($local_queue$.getGlobalValue());
    }

    public static SubLObject local_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($local_queue_lock$.getDynamicValue(thread));
            result = $local_queue$.getGlobalValue();
        } finally {
            if (NIL != release) {
                release_lock($local_queue_lock$.getDynamicValue(thread));
            }
        }
        return result;
    }

    public static SubLObject set_local_queue(final SubLObject queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == local_queue_empty()) {
            Errors.warn($str2$Local_queue_being_overwritten___A, local_queue_size());
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($local_queue_lock$.getDynamicValue(thread));
            $local_queue$.setGlobalValue(queue);
        } finally {
            if (NIL != release) {
                release_lock($local_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static SubLObject remote_queue_size() {
        return queues.queue_size($remote_queue$.getGlobalValue());
    }

    public static SubLObject remote_queue_empty() {
        return queues.queue_empty_p($remote_queue$.getGlobalValue());
    }

    public static SubLObject clear_remote_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($remote_queue_lock$.getDynamicValue(thread));
            queues.clear_queue($remote_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($remote_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static SubLObject remote_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($remote_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, $remote_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($remote_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static SubLObject remote_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($remote_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue($remote_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($remote_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static SubLObject transcript_queue_size() {
        return queues.queue_size($transcript_queue$.getGlobalValue());
    }

    public static SubLObject transcript_queue_empty() {
        return queues.queue_empty_p($transcript_queue$.getGlobalValue());
    }

    public static SubLObject clear_transcript_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($transcript_queue_lock$.getDynamicValue(thread));
            queues.clear_queue($transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static SubLObject transcript_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($transcript_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, $transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static SubLObject transcript_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($transcript_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue($transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static SubLObject hl_transcript_queue_size() {
        return queues.queue_size($hl_transcript_queue$.getGlobalValue());
    }

    public static SubLObject hl_transcript_queue_emptyP() {
        return queues.queue_empty_p($hl_transcript_queue$.getGlobalValue());
    }

    public static SubLObject clear_hl_transcript_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_transcript_queue_lock$.getDynamicValue(thread));
            queues.clear_queue($hl_transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($hl_transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static SubLObject hl_transcript_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_transcript_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, $hl_transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($hl_transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static SubLObject hl_transcript_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($hl_transcript_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue($hl_transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($hl_transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static SubLObject auxiliary_queue_size() {
        return queues.queue_size($auxiliary_queue$.getGlobalValue());
    }

    public static SubLObject auxiliary_queue_empty() {
        return queues.queue_empty_p($auxiliary_queue$.getGlobalValue());
    }

    public static SubLObject clear_auxiliary_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($auxiliary_queue_lock$.getDynamicValue(thread));
            queues.clear_queue($auxiliary_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static SubLObject auxiliary_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($auxiliary_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, $auxiliary_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static SubLObject auxiliary_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($auxiliary_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue($auxiliary_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static SubLObject auxiliary_queue_peek() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($auxiliary_queue_lock$.getDynamicValue(thread));
            ans = queues.queue_peek($auxiliary_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static SubLObject transmit_queue_size() {
        return queues.queue_size($transmit_queue$.getGlobalValue());
    }

    public static SubLObject transmit_queue_empty() {
        return queues.queue_empty_p($transmit_queue$.getGlobalValue());
    }

    public static SubLObject clear_transmit_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($transmit_queue_lock$.getDynamicValue(thread));
            queues.clear_queue($transmit_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static SubLObject transmit_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($transmit_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, $transmit_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static SubLObject transmit_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($transmit_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue($transmit_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static SubLObject transmit_queue_peek_chunk(final SubLObject chunk_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject size = NIL;
        SubLObject data = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($transmit_queue_lock$.getDynamicValue(thread));
            data = queues.queue_peek_n($transmit_queue$.getGlobalValue(), chunk_size);
            size = length(data);
        } finally {
            if (NIL != release) {
                release_lock($transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return values(data, size);
    }

    public static SubLObject transmit_queue_remove_chunk(final SubLObject chunk) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($transmit_queue_lock$.getDynamicValue(thread));
            SubLObject cdolist_list_var = chunk;
            SubLObject expected_op = NIL;
            expected_op = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject found_op = queues.dequeue($transmit_queue$.getGlobalValue());
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected_op.equal(found_op))) {
                    Errors.error($str13$The_Transmit_Queue_contains_OP__A, expected_op, found_op);
                }
                cdolist_list_var = cdolist_list_var.rest();
                expected_op = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock($transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static SubLObject local_operation_storage_queue_size() {
        return queues.queue_size($local_operation_storage_queue$.getGlobalValue());
    }

    public static SubLObject local_operation_storage_queue_empty() {
        return queues.queue_empty_p($local_operation_storage_queue$.getGlobalValue());
    }

    public static SubLObject clear_local_operation_storage_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($local_operation_storage_queue_lock$.getDynamicValue(thread));
            queues.clear_queue($local_operation_storage_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($local_operation_storage_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static SubLObject local_operation_storage_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock($local_operation_storage_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, $local_operation_storage_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($local_operation_storage_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static SubLObject local_operation_storage_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($local_operation_storage_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue($local_operation_storage_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($local_operation_storage_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static SubLObject local_operation_storage_queue_contents() {
        return queues.queue_elements($local_operation_storage_queue$.getGlobalValue());
    }

    public static SubLObject local_operations_anywhere() {
        return makeBoolean(((NIL == local_queue_empty()) || (NIL == transcript_queue_empty())) || (NIL == local_operation_storage_queue_empty()));
    }

    public static SubLObject all_internal_queue_sizes() {
        return add(auxiliary_queue_size(), local_queue_size());
    }

    public static SubLObject wait_for_queues_to_finish(final SubLObject msg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(msg) : "Types.stringp(msg) " + "CommonSymbols.NIL != Types.stringp(msg) " + msg;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(msg);
                final SubLObject max = all_internal_queue_sizes();
                while (all_internal_queue_sizes().isPositive()) {
                    final SubLObject curr = all_internal_queue_sizes();
                    final SubLObject done = subtract(max, curr);
                    note_percent_progress(done, max);
                    sleep(TEN_INTEGER);
                } 
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return msg;
    }

    public static SubLObject add_to_local_queue(final SubLObject form, SubLObject encapsulateP) {
        if (encapsulateP == UNPROVIDED) {
            encapsulateP = T;
        }
        final SubLObject api_op = (NIL != encapsulateP) ? form_to_api_op(form) : form;
        local_queue_enqueue(api_op);
        return T;
    }

    public static SubLObject run_one_local_op() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject op = local_queue_dequeue();
        if (NIL != op) {
            final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
            try {
                api_control_vars.$use_local_queueP$.bind(NIL, thread);
                $last_agenda_op$.setGlobalValue(op);
                final SubLObject form = api_op_to_form(op);
                if (NIL != form) {
                    try {
                        process_utilities.current_process_note_form(form);
                        eval_in_api.cyc_api_eval(form);
                    } finally {
                        final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            process_utilities.current_process_clear_form();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                }
            } finally {
                api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
            }
            if (NIL != local_queue_empty()) {
                operation_communication.save_transcript_ops();
            }
        }
        return NIL;
    }

    public static SubLObject add_to_remote_queue(final SubLObject form) {
        if (NIL != operation_communication.operation_from_meP(form)) {
            operation_communication.set_read_master_transcript_op_number(add(ONE_INTEGER, operation_communication.read_master_transcript_op_number()));
        } else {
            remote_queue_enqueue(fourth(form));
        }
        return T;
    }

    public static SubLObject within_a_remote_opP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $within_a_remote_opP$.getDynamicValue(thread);
    }

    public static SubLObject run_one_remote_op() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject op = NIL;
        op = remote_queue_dequeue();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $use_transcriptP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_a_remote_opP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            $use_transcriptP$.bind(NIL, thread);
            $within_a_remote_opP$.bind(T, thread);
            if (NIL != op) {
                operation_communication.set_read_master_transcript_op_number(add(ONE_INTEGER, operation_communication.read_master_transcript_op_number()));
                $last_agenda_op$.setGlobalValue(op);
                if (NIL != $ignore_remote_errors$.getDynamicValue(thread)) {
                    SubLObject error_message = NIL;
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                run_one_remote_op_internal(op);
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if (NIL != error_message) {
                        Errors.warn($str20$_A, error_message);
                    }
                } else {
                    run_one_remote_op_internal(op);
                }
            }
        } finally {
            $within_a_remote_opP$.rebind(_prev_bind_3, thread);
            $use_transcriptP$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject run_one_remote_op_internal(final SubLObject op) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject form = api_op_to_form(op);
            if (NIL != form) {
                final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
                try {
                    Errors.$continue_cerrorP$.bind(T, thread);
                    try {
                        process_utilities.current_process_note_form(form);
                        eval_in_api.cyc_api_eval(form);
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            process_utilities.current_process_clear_form();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                    operation_communication.set_total_master_transcript_operations_processed(add(ONE_INTEGER, operation_communication.total_master_transcript_operations_processed()));
                } finally {
                    Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                operation_communication.set_total_remote_operations_run(add(ONE_INTEGER, operation_communication.total_remote_operations_run()));
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return NIL;
    }

    public static SubLObject add_to_auxiliary_queue(final SubLObject form) {
        auxiliary_queue_enqueue(fourth(form));
        return T;
    }

    public static SubLObject run_one_auxiliary_op() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject op = NIL;
        op = auxiliary_queue_dequeue();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $use_transcriptP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            $use_transcriptP$.bind(NIL, thread);
            if (NIL != op) {
                $last_agenda_op$.setGlobalValue(op);
                final SubLObject form = api_op_to_form(op);
                if (NIL != form) {
                    try {
                        process_utilities.current_process_note_form(form);
                        eval_in_api.cyc_api_eval(form);
                    } finally {
                        final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            process_utilities.current_process_clear_form();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    operation_communication.inc_total_auxiliary_operations_run();
                }
            }
        } finally {
            $use_transcriptP$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject possibly_add_to_transcript_queue(final SubLObject encapsulated_form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_transcriptP$.getDynamicValue(thread)) {
            return add_to_transcript_queue(encapsulated_form);
        }
        return NIL;
    }

    public static SubLObject add_to_transcript_queue(final SubLObject encapsulated_form) {
        transcript_queue_enqueue(list(encapsulation.encapsulate(operation_communication.the_cyclist()), cyc_image_id(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), encapsulated_form));
        return T;
    }

    public static SubLObject hl_transcript_formP(final SubLObject form) {
        if (form.isCons()) {
            final SubLObject operator = form.first();
            if (NIL == subl_promotions.memberP(operator, $hl_transcript_special_operators$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject add_to_hl_transcript_queue(final SubLObject encapsulated_form) {
        hl_transcript_queue_enqueue(list(encapsulation.encapsulate(operation_communication.the_cyclist()), cyc_image_id(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), encapsulated_form));
        return T;
    }

    public static SubLObject api_op_to_form(SubLObject api_op) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject form = NIL;
        final SubLObject _prev_bind_0 = $unencapsulating_within_agenda$.currentBinding(thread);
        try {
            $unencapsulating_within_agenda$.bind(T, thread);
            try {
                thread.throwStack.push($UNENCAPSULATION_ERROR);
                form = encapsulation.unencapsulate(api_op);
            } catch (final Throwable ccatch_env_var) {
                api_op = Errors.handleThrowable(ccatch_env_var, $UNENCAPSULATION_ERROR);
            } finally {
                thread.throwStack.pop();
            }
        } finally {
            $unencapsulating_within_agenda$.rebind(_prev_bind_0, thread);
        }
        return form;
    }

    public static SubLObject form_to_api_op(final SubLObject form) {
        final SubLObject info = cyc_bookkeeping.cyc_bookkeeping_info();
        if (NIL != info) {
            return encapsulation.encapsulate(list(WITH_BOOKKEEPING_INFO, list(QUOTE, info), form));
        }
        return encapsulation.encapsulate(form);
    }

    public static SubLObject declare_operation_queues_file() {
        declareFunction(me, "local_queue_size", "LOCAL-QUEUE-SIZE", 0, 0, false);
        declareFunction(me, "local_queue_empty", "LOCAL-QUEUE-EMPTY", 0, 0, false);
        declareFunction(me, "clear_local_queue", "CLEAR-LOCAL-QUEUE", 0, 0, false);
        declareFunction(me, "local_queue_enqueue", "LOCAL-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction(me, "local_queue_dequeue", "LOCAL-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction(me, "local_queue_peek", "LOCAL-QUEUE-PEEK", 0, 0, false);
        declareFunction(me, "local_queue_contents", "LOCAL-QUEUE-CONTENTS", 0, 0, false);
        declareFunction(me, "local_queue", "LOCAL-QUEUE", 0, 0, false);
        declareFunction(me, "set_local_queue", "SET-LOCAL-QUEUE", 1, 0, false);
        declareFunction(me, "remote_queue_size", "REMOTE-QUEUE-SIZE", 0, 0, false);
        declareFunction(me, "remote_queue_empty", "REMOTE-QUEUE-EMPTY", 0, 0, false);
        declareFunction(me, "clear_remote_queue", "CLEAR-REMOTE-QUEUE", 0, 0, false);
        declareFunction(me, "remote_queue_enqueue", "REMOTE-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction(me, "remote_queue_dequeue", "REMOTE-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction(me, "transcript_queue_size", "TRANSCRIPT-QUEUE-SIZE", 0, 0, false);
        declareFunction(me, "transcript_queue_empty", "TRANSCRIPT-QUEUE-EMPTY", 0, 0, false);
        declareFunction(me, "clear_transcript_queue", "CLEAR-TRANSCRIPT-QUEUE", 0, 0, false);
        declareFunction(me, "transcript_queue_enqueue", "TRANSCRIPT-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction(me, "transcript_queue_dequeue", "TRANSCRIPT-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction(me, "hl_transcript_queue_size", "HL-TRANSCRIPT-QUEUE-SIZE", 0, 0, false);
        declareFunction(me, "hl_transcript_queue_emptyP", "HL-TRANSCRIPT-QUEUE-EMPTY?", 0, 0, false);
        declareFunction(me, "clear_hl_transcript_queue", "CLEAR-HL-TRANSCRIPT-QUEUE", 0, 0, false);
        declareFunction(me, "hl_transcript_queue_enqueue", "HL-TRANSCRIPT-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction(me, "hl_transcript_queue_dequeue", "HL-TRANSCRIPT-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction(me, "auxiliary_queue_size", "AUXILIARY-QUEUE-SIZE", 0, 0, false);
        declareFunction(me, "auxiliary_queue_empty", "AUXILIARY-QUEUE-EMPTY", 0, 0, false);
        declareFunction(me, "clear_auxiliary_queue", "CLEAR-AUXILIARY-QUEUE", 0, 0, false);
        declareFunction(me, "auxiliary_queue_enqueue", "AUXILIARY-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction(me, "auxiliary_queue_dequeue", "AUXILIARY-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction(me, "auxiliary_queue_peek", "AUXILIARY-QUEUE-PEEK", 0, 0, false);
        declareFunction(me, "transmit_queue_size", "TRANSMIT-QUEUE-SIZE", 0, 0, false);
        declareFunction(me, "transmit_queue_empty", "TRANSMIT-QUEUE-EMPTY", 0, 0, false);
        declareFunction(me, "clear_transmit_queue", "CLEAR-TRANSMIT-QUEUE", 0, 0, false);
        declareFunction(me, "transmit_queue_enqueue", "TRANSMIT-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction(me, "transmit_queue_dequeue", "TRANSMIT-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction(me, "transmit_queue_peek_chunk", "TRANSMIT-QUEUE-PEEK-CHUNK", 1, 0, false);
        declareFunction(me, "transmit_queue_remove_chunk", "TRANSMIT-QUEUE-REMOVE-CHUNK", 1, 0, false);
        declareFunction(me, "local_operation_storage_queue_size", "LOCAL-OPERATION-STORAGE-QUEUE-SIZE", 0, 0, false);
        declareFunction(me, "local_operation_storage_queue_empty", "LOCAL-OPERATION-STORAGE-QUEUE-EMPTY", 0, 0, false);
        declareFunction(me, "clear_local_operation_storage_queue", "CLEAR-LOCAL-OPERATION-STORAGE-QUEUE", 0, 0, false);
        declareFunction(me, "local_operation_storage_queue_enqueue", "LOCAL-OPERATION-STORAGE-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction(me, "local_operation_storage_queue_dequeue", "LOCAL-OPERATION-STORAGE-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction(me, "local_operation_storage_queue_contents", "LOCAL-OPERATION-STORAGE-QUEUE-CONTENTS", 0, 0, false);
        declareFunction(me, "local_operations_anywhere", "LOCAL-OPERATIONS-ANYWHERE", 0, 0, false);
        declareFunction(me, "all_internal_queue_sizes", "ALL-INTERNAL-QUEUE-SIZES", 0, 0, false);
        declareFunction(me, "wait_for_queues_to_finish", "WAIT-FOR-QUEUES-TO-FINISH", 1, 0, false);
        declareFunction(me, "add_to_local_queue", "ADD-TO-LOCAL-QUEUE", 1, 1, false);
        declareFunction(me, "run_one_local_op", "RUN-ONE-LOCAL-OP", 0, 0, false);
        declareFunction(me, "add_to_remote_queue", "ADD-TO-REMOTE-QUEUE", 1, 0, false);
        declareFunction(me, "within_a_remote_opP", "WITHIN-A-REMOTE-OP?", 0, 0, false);
        declareFunction(me, "run_one_remote_op", "RUN-ONE-REMOTE-OP", 0, 0, false);
        declareFunction(me, "run_one_remote_op_internal", "RUN-ONE-REMOTE-OP-INTERNAL", 1, 0, false);
        declareFunction(me, "add_to_auxiliary_queue", "ADD-TO-AUXILIARY-QUEUE", 1, 0, false);
        declareFunction(me, "run_one_auxiliary_op", "RUN-ONE-AUXILIARY-OP", 0, 0, false);
        declareFunction(me, "possibly_add_to_transcript_queue", "POSSIBLY-ADD-TO-TRANSCRIPT-QUEUE", 1, 0, false);
        declareFunction(me, "add_to_transcript_queue", "ADD-TO-TRANSCRIPT-QUEUE", 1, 0, false);
        declareFunction(me, "hl_transcript_formP", "HL-TRANSCRIPT-FORM?", 1, 0, false);
        declareFunction(me, "add_to_hl_transcript_queue", "ADD-TO-HL-TRANSCRIPT-QUEUE", 1, 0, false);
        declareFunction(me, "api_op_to_form", "API-OP-TO-FORM", 1, 0, false);
        declareFunction(me, "form_to_api_op", "FORM-TO-API-OP", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_operation_queues_file() {
        deflexical("*LOCAL-QUEUE*", SubLTrampolineFile.maybeDefault($local_queue$, $local_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*LOCAL-QUEUE-LOCK*", make_lock($$$Local_Queue_Lock));
        deflexical("*REMOTE-QUEUE*", SubLTrampolineFile.maybeDefault($remote_queue$, $remote_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*REMOTE-QUEUE-LOCK*", make_lock($$$Remote_Queue_Lock));
        deflexical("*TRANSCRIPT-QUEUE*", SubLTrampolineFile.maybeDefault($transcript_queue$, $transcript_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*TRANSCRIPT-QUEUE-LOCK*", make_lock($$$Transcript_Queue_Lock));
        deflexical("*HL-TRANSCRIPT-QUEUE*", SubLTrampolineFile.maybeDefault($hl_transcript_queue$, $hl_transcript_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*HL-TRANSCRIPT-QUEUE-LOCK*", make_lock($$$HL_Transcript_Queue_Lock));
        deflexical("*AUXILIARY-QUEUE*", SubLTrampolineFile.maybeDefault($auxiliary_queue$, $auxiliary_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*AUXILIARY-QUEUE-LOCK*", make_lock($$$Auxiliary_Queue_Lock));
        deflexical("*TRANSMIT-QUEUE*", SubLTrampolineFile.maybeDefault($transmit_queue$, $transmit_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*TRANSMIT-QUEUE-LOCK*", make_lock($$$Transmit_Queue_Lock));
        deflexical("*LOCAL-OPERATION-STORAGE-QUEUE*", SubLTrampolineFile.maybeDefault($local_operation_storage_queue$, $local_operation_storage_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*LOCAL-OPERATION-STORAGE-QUEUE-LOCK*", make_lock($$$Local_Operation_Queue_Lock));
        defparameter("*WITHIN-A-REMOTE-OP?*", NIL);
        defparameter("*HL-TRANSCRIPTS-ENABLED?*", NIL);
        deflexical("*HL-TRANSCRIPT-SPECIAL-OPERATORS*", $list21);
        return NIL;
    }

    public static SubLObject setup_operation_queues_file() {
        declare_defglobal($local_queue$);
        declare_defglobal($remote_queue$);
        declare_defglobal($transcript_queue$);
        declare_defglobal($hl_transcript_queue$);
        declare_defglobal($auxiliary_queue$);
        declare_defglobal($transmit_queue$);
        declare_defglobal($local_operation_storage_queue$);
        register_external_symbol(ALL_INTERNAL_QUEUE_SIZES);
        register_external_symbol(WAIT_FOR_QUEUES_TO_FINISH);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_operation_queues_file();
    }

    @Override
    public void initializeVariables() {
        init_operation_queues_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_operation_queues_file();
    }

    
}

/**
 * Total time: 264 ms
 */
