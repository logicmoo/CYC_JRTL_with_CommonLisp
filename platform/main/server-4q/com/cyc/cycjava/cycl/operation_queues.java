/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.control_vars.$ignore_remote_errors$;
import static com.cyc.cycjava.cycl.control_vars.$last_agenda_op$;
import static com.cyc.cycjava.cycl.control_vars.$unencapsulating_within_agenda$;
import static com.cyc.cycjava.cycl.control_vars.$use_transcriptP$;
import static com.cyc.cycjava.cycl.control_vars.cyc_image_id;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      OPERATION-QUEUES
 * source file: /cyc/top/cycl/operation-queues.lisp
 * created:     2019/07/03 17:37:50
 */
public final class operation_queues extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new operation_queues();



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $local_queue_lock$ = makeSymbol("*LOCAL-QUEUE-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $remote_queue_lock$ = makeSymbol("*REMOTE-QUEUE-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $transcript_queue_lock$ = makeSymbol("*TRANSCRIPT-QUEUE-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $hl_transcript_queue_lock$ = makeSymbol("*HL-TRANSCRIPT-QUEUE-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $auxiliary_queue_lock$ = makeSymbol("*AUXILIARY-QUEUE-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $transmit_queue_lock$ = makeSymbol("*TRANSMIT-QUEUE-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $local_operation_storage_queue_lock$ = makeSymbol("*LOCAL-OPERATION-STORAGE-QUEUE-LOCK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $within_a_remote_opP$ = makeSymbol("*WITHIN-A-REMOTE-OP?*");

    // defparameter
    /**
     * Do we support HL transcripts? Currently (11/04) HL transcript support is
     * experimental, so this should be left as NIL.
     */
    @LispMethod(comment = "Do we support HL transcripts? Currently (11/04) HL transcript support is\r\nexperimental, so this should be left as NIL.\ndefparameter\nDo we support HL transcripts? Currently (11/04) HL transcript support is\nexperimental, so this should be left as NIL.")
    public static final SubLSymbol $hl_transcripts_enabledP$ = makeSymbol("*HL-TRANSCRIPTS-ENABLED?*");

    // deflexical
    /**
     * Operators that are handled differently in HL transcripts than EL transcripts,
     * and so should not be straightforwardly written to the HL transcript
     */
    @LispMethod(comment = "Operators that are handled differently in HL transcripts than EL transcripts,\r\nand so should not be straightforwardly written to the HL transcript\ndeflexical\nOperators that are handled differently in HL transcripts than EL transcripts,\nand so should not be straightforwardly written to the HL transcript")
    private static final SubLSymbol $hl_transcript_special_operators$ = makeSymbol("*HL-TRANSCRIPT-SPECIAL-OPERATORS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $local_queue$ = makeSymbol("*LOCAL-QUEUE*");

    static private final SubLString $$$Local_Queue_Lock = makeString("Local Queue Lock");

    static private final SubLString $str2$Local_queue_being_overwritten___A = makeString("Local queue being overwritten, ~A operations lost");

    public static final SubLSymbol $remote_queue$ = makeSymbol("*REMOTE-QUEUE*");

    static private final SubLString $$$Remote_Queue_Lock = makeString("Remote Queue Lock");

    public static final SubLSymbol $transcript_queue$ = makeSymbol("*TRANSCRIPT-QUEUE*");

    static private final SubLString $$$Transcript_Queue_Lock = makeString("Transcript Queue Lock");

    public static final SubLSymbol $hl_transcript_queue$ = makeSymbol("*HL-TRANSCRIPT-QUEUE*");

    static private final SubLString $$$HL_Transcript_Queue_Lock = makeString("HL Transcript Queue Lock");

    public static final SubLSymbol $auxiliary_queue$ = makeSymbol("*AUXILIARY-QUEUE*");

    static private final SubLString $$$Auxiliary_Queue_Lock = makeString("Auxiliary Queue Lock");

    public static final SubLSymbol $transmit_queue$ = makeSymbol("*TRANSMIT-QUEUE*");

    static private final SubLString $$$Transmit_Queue_Lock = makeString("Transmit Queue Lock");

    private static final SubLString $str13$The_Transmit_Queue_contains_OP__A = makeString("The Transmit Queue contains OP ~A, not the expected op ~A--out of sync.");

    public static final SubLSymbol $local_operation_storage_queue$ = makeSymbol("*LOCAL-OPERATION-STORAGE-QUEUE*");

    private static final SubLString $$$Local_Operation_Queue_Lock = makeString("Local Operation Queue Lock");

    private static final SubLSymbol ALL_INTERNAL_QUEUE_SIZES = makeSymbol("ALL-INTERNAL-QUEUE-SIZES");

    private static final SubLSymbol WAIT_FOR_QUEUES_TO_FINISH = makeSymbol("WAIT-FOR-QUEUES-TO-FINISH");

    private static final SubLString $str20$_A = makeString("~A");

    private static final SubLList $list21 = list(makeSymbol("FI-ASSERT"), makeSymbol("FI-UNASSERT"), makeSymbol("FI-BLAST"), makeSymbol("FI-TIMESTAMP-CONSTANT"), makeSymbol("FI-TIMESTAMP-ASSERTION"));

    private static final SubLSymbol WITH_BOOKKEEPING_INFO = makeSymbol("WITH-BOOKKEEPING-INFO");

    /**
     * Return the number of pending local queue operations.
     */
    @LispMethod(comment = "Return the number of pending local queue operations.")
    public static final SubLObject local_queue_size_alt() {
        return queues.queue_size($local_queue$.getGlobalValue());
    }

    /**
     * Return the number of pending local queue operations.
     */
    @LispMethod(comment = "Return the number of pending local queue operations.")
    public static SubLObject local_queue_size() {
        return queues.queue_size(operation_queues.$local_queue$.getGlobalValue());
    }

    /**
     * Return T iff there are no local operations pending.
     */
    @LispMethod(comment = "Return T iff there are no local operations pending.")
    public static final SubLObject local_queue_empty_alt() {
        return queues.queue_empty_p($local_queue$.getGlobalValue());
    }

    /**
     * Return T iff there are no local operations pending.
     */
    @LispMethod(comment = "Return T iff there are no local operations pending.")
    public static SubLObject local_queue_empty() {
        return queues.queue_empty_p(operation_queues.$local_queue$.getGlobalValue());
    }

    /**
     * Clear the contents of the local queue without executing them.
     */
    @LispMethod(comment = "Clear the contents of the local queue without executing them.")
    public static final SubLObject clear_local_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $local_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.clear_queue($local_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return T;
        }
    }

    /**
     * Clear the contents of the local queue without executing them.
     */
    @LispMethod(comment = "Clear the contents of the local queue without executing them.")
    public static SubLObject clear_local_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$local_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static final SubLObject local_queue_enqueue_alt(SubLObject operation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $local_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.enqueue(operation, $local_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject local_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$local_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static final SubLObject local_queue_dequeue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject lock = $local_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    ans = queues.dequeue($local_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject local_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$local_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static final SubLObject local_queue_peek_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject lock = $local_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    ans = queues.queue_peek($local_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject local_queue_peek() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            ans = queues.queue_peek(operation_queues.$local_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    /**
     * Return a copy of the current contents of the local queue.
     */
    @LispMethod(comment = "Return a copy of the current contents of the local queue.")
    public static final SubLObject local_queue_contents_alt() {
        return queues.queue_elements($local_queue$.getGlobalValue());
    }

    /**
     * Return a copy of the current contents of the local queue.
     */
    @LispMethod(comment = "Return a copy of the current contents of the local queue.")
    public static SubLObject local_queue_contents() {
        return queues.queue_elements(operation_queues.$local_queue$.getGlobalValue());
    }

    public static final SubLObject local_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject lock = $local_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = $local_queue$.getGlobalValue();
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject local_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            result = operation_queues.$local_queue$.getGlobalValue();
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return result;
    }

    public static final SubLObject set_local_queue_alt(SubLObject queue) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.operation_queues.local_queue_empty()) {
                Errors.warn($str_alt2$Local_queue_being_overwritten___A, com.cyc.cycjava.cycl.operation_queues.local_queue_size());
            }
            {
                SubLObject lock = $local_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    $local_queue$.setGlobalValue(queue);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject set_local_queue(final SubLObject queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == operation_queues.local_queue_empty()) {
            Errors.warn(operation_queues.$str2$Local_queue_being_overwritten___A, operation_queues.local_queue_size());
        }
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            operation_queues.$local_queue$.setGlobalValue(queue);
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static final SubLObject remote_queue_size_alt() {
        return queues.queue_size($remote_queue$.getGlobalValue());
    }

    public static SubLObject remote_queue_size() {
        return queues.queue_size(operation_queues.$remote_queue$.getGlobalValue());
    }

    public static final SubLObject remote_queue_empty_alt() {
        return queues.queue_empty_p($remote_queue$.getGlobalValue());
    }

    public static SubLObject remote_queue_empty() {
        return queues.queue_empty_p(operation_queues.$remote_queue$.getGlobalValue());
    }

    public static final SubLObject clear_remote_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $remote_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.clear_queue($remote_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject clear_remote_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$remote_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static final SubLObject remote_queue_enqueue_alt(SubLObject operation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $remote_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.enqueue(operation, $remote_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject remote_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$remote_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static final SubLObject remote_queue_dequeue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject lock = $remote_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    ans = queues.dequeue($remote_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject remote_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$remote_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static final SubLObject transcript_queue_size_alt() {
        return queues.queue_size($transcript_queue$.getGlobalValue());
    }

    public static SubLObject transcript_queue_size() {
        return queues.queue_size(operation_queues.$transcript_queue$.getGlobalValue());
    }

    public static final SubLObject transcript_queue_empty_alt() {
        return queues.queue_empty_p($transcript_queue$.getGlobalValue());
    }

    public static SubLObject transcript_queue_empty() {
        return queues.queue_empty_p(operation_queues.$transcript_queue$.getGlobalValue());
    }

    public static final SubLObject clear_transcript_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $transcript_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.clear_queue($transcript_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject clear_transcript_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static final SubLObject transcript_queue_enqueue_alt(SubLObject operation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $transcript_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.enqueue(operation, $transcript_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject transcript_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static final SubLObject transcript_queue_dequeue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject lock = $transcript_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    ans = queues.dequeue($transcript_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject transcript_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static final SubLObject hl_transcript_queue_size_alt() {
        return queues.queue_size($hl_transcript_queue$.getGlobalValue());
    }

    public static SubLObject hl_transcript_queue_size() {
        return queues.queue_size(operation_queues.$hl_transcript_queue$.getGlobalValue());
    }

    public static final SubLObject hl_transcript_queue_emptyP_alt() {
        return queues.queue_empty_p($hl_transcript_queue$.getGlobalValue());
    }

    public static SubLObject hl_transcript_queue_emptyP() {
        return queues.queue_empty_p(operation_queues.$hl_transcript_queue$.getGlobalValue());
    }

    public static final SubLObject clear_hl_transcript_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $hl_transcript_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.clear_queue($hl_transcript_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject clear_hl_transcript_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$hl_transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static final SubLObject hl_transcript_queue_enqueue_alt(SubLObject operation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $hl_transcript_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.enqueue(operation, $hl_transcript_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject hl_transcript_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$hl_transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static final SubLObject hl_transcript_queue_dequeue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject lock = $hl_transcript_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    ans = queues.dequeue($hl_transcript_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject hl_transcript_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$hl_transcript_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static final SubLObject auxiliary_queue_size_alt() {
        return queues.queue_size($auxiliary_queue$.getGlobalValue());
    }

    public static SubLObject auxiliary_queue_size() {
        return queues.queue_size(operation_queues.$auxiliary_queue$.getGlobalValue());
    }

    public static final SubLObject auxiliary_queue_empty_alt() {
        return queues.queue_empty_p($auxiliary_queue$.getGlobalValue());
    }

    public static SubLObject auxiliary_queue_empty() {
        return queues.queue_empty_p(operation_queues.$auxiliary_queue$.getGlobalValue());
    }

    public static final SubLObject clear_auxiliary_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $auxiliary_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.clear_queue($auxiliary_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject clear_auxiliary_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$auxiliary_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static final SubLObject auxiliary_queue_enqueue_alt(SubLObject operation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $auxiliary_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.enqueue(operation, $auxiliary_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject auxiliary_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$auxiliary_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static final SubLObject auxiliary_queue_dequeue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject lock = $auxiliary_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    ans = queues.dequeue($auxiliary_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject auxiliary_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$auxiliary_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static SubLObject auxiliary_queue_peek() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            ans = queues.queue_peek(operation_queues.$auxiliary_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    public static final SubLObject transmit_queue_size_alt() {
        return queues.queue_size($transmit_queue$.getGlobalValue());
    }

    public static SubLObject transmit_queue_size() {
        return queues.queue_size(operation_queues.$transmit_queue$.getGlobalValue());
    }

    public static final SubLObject transmit_queue_empty_alt() {
        return queues.queue_empty_p($transmit_queue$.getGlobalValue());
    }

    public static SubLObject transmit_queue_empty() {
        return queues.queue_empty_p(operation_queues.$transmit_queue$.getGlobalValue());
    }

    public static final SubLObject clear_transmit_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $transmit_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.clear_queue($transmit_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject clear_transmit_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$transmit_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static final SubLObject transmit_queue_enqueue_alt(SubLObject operation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $transmit_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.enqueue(operation, $transmit_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject transmit_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$transmit_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static final SubLObject transmit_queue_dequeue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject lock = $transmit_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    ans = queues.dequeue($transmit_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject transmit_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$transmit_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
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
            release = seize_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            data = queues.queue_peek_n(operation_queues.$transmit_queue$.getGlobalValue(), chunk_size);
            size = length(data);
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return values(data, size);
    }

    public static SubLObject transmit_queue_remove_chunk(final SubLObject chunk) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            SubLObject cdolist_list_var = chunk;
            SubLObject expected_op = NIL;
            expected_op = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject found_op = queues.dequeue(operation_queues.$transmit_queue$.getGlobalValue());
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected_op.equal(found_op))) {
                    Errors.error(operation_queues.$str13$The_Transmit_Queue_contains_OP__A, expected_op, found_op);
                }
                cdolist_list_var = cdolist_list_var.rest();
                expected_op = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static final SubLObject local_operation_storage_queue_size_alt() {
        return queues.queue_size($local_operation_storage_queue$.getGlobalValue());
    }

    public static SubLObject local_operation_storage_queue_size() {
        return queues.queue_size(operation_queues.$local_operation_storage_queue$.getGlobalValue());
    }

    public static final SubLObject local_operation_storage_queue_empty_alt() {
        return queues.queue_empty_p($local_operation_storage_queue$.getGlobalValue());
    }

    public static SubLObject local_operation_storage_queue_empty() {
        return queues.queue_empty_p(operation_queues.$local_operation_storage_queue$.getGlobalValue());
    }

    public static final SubLObject clear_local_operation_storage_queue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $local_operation_storage_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.clear_queue($local_operation_storage_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject clear_local_operation_storage_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$local_operation_storage_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            }
        }
        return T;
    }

    public static final SubLObject local_operation_storage_queue_enqueue_alt(SubLObject operation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $local_operation_storage_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    queues.enqueue(operation, $local_operation_storage_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject local_operation_storage_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$local_operation_storage_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            }
        }
        return NIL;
    }

    public static final SubLObject local_operation_storage_queue_dequeue_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject lock = $local_operation_storage_queue_lock$.getDynamicValue(thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    ans = queues.dequeue($local_operation_storage_queue$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject local_operation_storage_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$local_operation_storage_queue$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }

    /**
     * Return a copy of the current contents of the local queue.
     */
    @LispMethod(comment = "Return a copy of the current contents of the local queue.")
    public static final SubLObject local_operation_storage_queue_contents_alt() {
        return queues.queue_elements($local_operation_storage_queue$.getGlobalValue());
    }

    @LispMethod(comment = "Return a copy of the current contents of the local queue.")
    public static SubLObject local_operation_storage_queue_contents() {
        return queues.queue_elements(operation_queues.$local_operation_storage_queue$.getGlobalValue());
    }

    /**
     * A boolean method which returns true if there are operations in any of
     * local-queue, transcript-queue, or local-operation-storage-queue.
     */
    @LispMethod(comment = "A boolean method which returns true if there are operations in any of\r\nlocal-queue, transcript-queue, or local-operation-storage-queue.\nA boolean method which returns true if there are operations in any of\nlocal-queue, transcript-queue, or local-operation-storage-queue.")
    public static final SubLObject local_operations_anywhere_alt() {
        return makeBoolean(((NIL == com.cyc.cycjava.cycl.operation_queues.local_queue_empty()) || (NIL == com.cyc.cycjava.cycl.operation_queues.transcript_queue_empty())) || (NIL == com.cyc.cycjava.cycl.operation_queues.local_operation_storage_queue_empty()));
    }

    @LispMethod(comment = "A boolean method which returns true if there are operations in any of\r\nlocal-queue, transcript-queue, or local-operation-storage-queue.\nA boolean method which returns true if there are operations in any of\nlocal-queue, transcript-queue, or local-operation-storage-queue.")
    public static SubLObject local_operations_anywhere() {
        return makeBoolean(((NIL == operation_queues.local_queue_empty()) || (NIL == operation_queues.transcript_queue_empty())) || (NIL == operation_queues.local_operation_storage_queue_empty()));
    }

    public static SubLObject all_internal_queue_sizes() {
        return add(operation_queues.auxiliary_queue_size(), operation_queues.local_queue_size());
    }

    public static SubLObject wait_for_queues_to_finish(final SubLObject msg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(msg) : "! stringp(msg) " + ("Types.stringp(msg) " + "CommonSymbols.NIL != Types.stringp(msg) ") + msg;
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
                final SubLObject max = operation_queues.all_internal_queue_sizes();
                while (operation_queues.all_internal_queue_sizes().isPositive()) {
                    final SubLObject curr = operation_queues.all_internal_queue_sizes();
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

    public static final SubLObject add_to_local_queue_alt(SubLObject form, SubLObject encapsulateP) {
        if (encapsulateP == UNPROVIDED) {
            encapsulateP = T;
        }
        {
            SubLObject api_op = (NIL != encapsulateP) ? ((SubLObject) (com.cyc.cycjava.cycl.operation_queues.form_to_api_op(form))) : form;
            com.cyc.cycjava.cycl.operation_queues.local_queue_enqueue(api_op);
            return T;
        }
    }

    public static SubLObject add_to_local_queue(final SubLObject form, SubLObject encapsulateP) {
        if (encapsulateP == UNPROVIDED) {
            encapsulateP = T;
        }
        final SubLObject api_op = (NIL != encapsulateP) ? operation_queues.form_to_api_op(form) : form;
        operation_queues.local_queue_enqueue(api_op);
        return T;
    }

    public static final SubLObject run_one_local_op_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject op = com.cyc.cycjava.cycl.operation_queues.local_queue_dequeue();
                if (NIL != op) {
                    {
                        SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                        try {
                            api_control_vars.$use_local_queueP$.bind(NIL, thread);
                            $last_agenda_op$.setGlobalValue(op);
                            {
                                SubLObject form = com.cyc.cycjava.cycl.operation_queues.api_op_to_form(op);
                                if (NIL != form) {
                                    eval_in_api.cyc_api_eval(form);
                                }
                            }
                        } finally {
                            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL != com.cyc.cycjava.cycl.operation_queues.local_queue_empty()) {
                        operation_communication.save_transcript_ops();
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject run_one_local_op() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject op = operation_queues.local_queue_dequeue();
        if (NIL != op) {
            final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
            try {
                api_control_vars.$use_local_queueP$.bind(NIL, thread);
                $last_agenda_op$.setGlobalValue(op);
                final SubLObject form = operation_queues.api_op_to_form(op);
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
            if (NIL != operation_queues.local_queue_empty()) {
                operation_communication.save_transcript_ops();
            }
        }
        return NIL;
    }

    public static final SubLObject add_to_remote_queue_alt(SubLObject form) {
        if (NIL != operation_communication.operation_from_meP(form)) {
            operation_communication.set_read_master_transcript_op_number(add(ONE_INTEGER, operation_communication.read_master_transcript_op_number()));
        } else {
            com.cyc.cycjava.cycl.operation_queues.remote_queue_enqueue(fourth(form));
        }
        return T;
    }

    public static SubLObject add_to_remote_queue(final SubLObject form) {
        if (NIL != operation_communication.operation_from_meP(form)) {
            operation_communication.set_read_master_transcript_op_number(add(ONE_INTEGER, operation_communication.read_master_transcript_op_number()));
        } else {
            operation_queues.remote_queue_enqueue(fourth(form));
        }
        return T;
    }

    public static final SubLObject within_a_remote_opP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $within_a_remote_opP$.getDynamicValue(thread);
        }
    }

    public static SubLObject within_a_remote_opP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return operation_queues.$within_a_remote_opP$.getDynamicValue(thread);
    }

    public static final SubLObject run_one_remote_op_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject op = NIL;
                op = com.cyc.cycjava.cycl.operation_queues.remote_queue_dequeue();
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $use_transcriptP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_a_remote_opP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        $use_transcriptP$.bind(NIL, thread);
                        $within_a_remote_opP$.bind(T, thread);
                        if (NIL != op) {
                            operation_communication.set_read_master_transcript_op_number(add(ONE_INTEGER, operation_communication.read_master_transcript_op_number()));
                            $last_agenda_op$.setGlobalValue(op);
                            if (NIL != $ignore_remote_errors$.getDynamicValue(thread)) {
                                {
                                    SubLObject error_message = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_1 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    com.cyc.cycjava.cycl.operation_queues.run_one_remote_op_internal(op);
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_1, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    }
                                    if (NIL != error_message) {
                                        Errors.warn($str_alt16$_A, error_message);
                                    }
                                }
                            } else {
                                com.cyc.cycjava.cycl.operation_queues.run_one_remote_op_internal(op);
                            }
                        }
                    } finally {
                        $within_a_remote_opP$.rebind(_prev_bind_2, thread);
                        $use_transcriptP$.rebind(_prev_bind_1, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject run_one_remote_op() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject op = NIL;
        op = operation_queues.remote_queue_dequeue();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $use_transcriptP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = operation_queues.$within_a_remote_opP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            $use_transcriptP$.bind(NIL, thread);
            operation_queues.$within_a_remote_opP$.bind(T, thread);
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
                                operation_queues.run_one_remote_op_internal(op);
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
                        Errors.warn(operation_queues.$str20$_A, error_message);
                    }
                } else {
                    operation_queues.run_one_remote_op_internal(op);
                }
            }
        } finally {
            operation_queues.$within_a_remote_opP$.rebind(_prev_bind_3, thread);
            $use_transcriptP$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject run_one_remote_op_internal_alt(SubLObject op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            try {
                {
                    SubLObject form = com.cyc.cycjava.cycl.operation_queues.api_op_to_form(op);
                    if (NIL != form) {
                        {
                            SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
                            try {
                                Errors.$continue_cerrorP$.bind(T, thread);
                                if (NIL != remote_operation_filters.passes_remote_operation_filters(form)) {
                                    eval_in_api.cyc_api_eval(form);
                                    operation_communication.set_total_master_transcript_operations_processed(add(ONE_INTEGER, operation_communication.total_master_transcript_operations_processed()));
                                }
                            } finally {
                                Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        operation_communication.set_total_remote_operations_run(add(ONE_INTEGER, operation_communication.total_remote_operations_run()));
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject run_one_remote_op_internal(final SubLObject op) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject form = operation_queues.api_op_to_form(op);
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

    public static final SubLObject add_to_auxiliary_queue_alt(SubLObject form) {
        com.cyc.cycjava.cycl.operation_queues.auxiliary_queue_enqueue(fourth(form));
        return T;
    }

    public static SubLObject add_to_auxiliary_queue(final SubLObject form) {
        operation_queues.auxiliary_queue_enqueue(fourth(form));
        return T;
    }

    public static final SubLObject run_one_auxiliary_op_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject op = NIL;
                op = com.cyc.cycjava.cycl.operation_queues.auxiliary_queue_dequeue();
                {
                    SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $use_transcriptP$.currentBinding(thread);
                    try {
                        api_control_vars.$use_local_queueP$.bind(NIL, thread);
                        $use_transcriptP$.bind(NIL, thread);
                        if (NIL != op) {
                            $last_agenda_op$.setGlobalValue(op);
                            {
                                SubLObject form = com.cyc.cycjava.cycl.operation_queues.api_op_to_form(op);
                                if (NIL != form) {
                                    eval_in_api.cyc_api_eval(form);
                                    operation_communication.inc_total_auxiliary_operations_run();
                                }
                            }
                        }
                    } finally {
                        $use_transcriptP$.rebind(_prev_bind_1, thread);
                        api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject run_one_auxiliary_op() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject op = NIL;
        op = operation_queues.auxiliary_queue_dequeue();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $use_transcriptP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind(NIL, thread);
            $use_transcriptP$.bind(NIL, thread);
            if (NIL != op) {
                $last_agenda_op$.setGlobalValue(op);
                final SubLObject form = operation_queues.api_op_to_form(op);
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
            return operation_queues.add_to_transcript_queue(encapsulated_form);
        }
        return NIL;
    }

    public static final SubLObject add_to_transcript_queue_alt(SubLObject encapsulated_form) {
        com.cyc.cycjava.cycl.operation_queues.transcript_queue_enqueue(list(encapsulation.encapsulate(operation_communication.the_cyclist()), cyc_image_id(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), encapsulated_form));
        return T;
    }

    public static SubLObject add_to_transcript_queue(final SubLObject encapsulated_form) {
        operation_queues.transcript_queue_enqueue(list(encapsulation.encapsulate(operation_communication.the_cyclist()), cyc_image_id(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), encapsulated_form));
        return T;
    }

    public static final SubLObject hl_transcript_formP_alt(SubLObject form) {
        if (form.isCons()) {
            {
                SubLObject operator = form.first();
                if (NIL == subl_promotions.memberP(operator, $hl_transcript_special_operators$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject hl_transcript_formP(final SubLObject form) {
        if (form.isCons()) {
            final SubLObject operator = form.first();
            if (NIL == subl_promotions.memberP(operator, operation_queues.$hl_transcript_special_operators$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                return T;
            }
        }
        return NIL;
    }

    public static final SubLObject add_to_hl_transcript_queue_alt(SubLObject encapsulated_form) {
        com.cyc.cycjava.cycl.operation_queues.hl_transcript_queue_enqueue(list(encapsulation.encapsulate(operation_communication.the_cyclist()), cyc_image_id(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), encapsulated_form));
        return T;
    }

    public static SubLObject add_to_hl_transcript_queue(final SubLObject encapsulated_form) {
        operation_queues.hl_transcript_queue_enqueue(list(encapsulation.encapsulate(operation_communication.the_cyclist()), cyc_image_id(), numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), encapsulated_form));
        return T;
    }

    /**
     * Transforms API-OP from an external to an internal
     * form, including unencapsulating API-OP (while ignoring errors).
     */
    @LispMethod(comment = "Transforms API-OP from an external to an internal\r\nform, including unencapsulating API-OP (while ignoring errors).\nTransforms API-OP from an external to an internal\nform, including unencapsulating API-OP (while ignoring errors).")
    public static final SubLObject api_op_to_form_alt(SubLObject api_op) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject form = NIL;
                {
                    SubLObject _prev_bind_0 = $unencapsulating_within_agenda$.currentBinding(thread);
                    try {
                        $unencapsulating_within_agenda$.bind(T, thread);
                        try {
                            form = encapsulation.unencapsulate(api_op);
                        } catch (Throwable ccatch_env_var) {
                            api_op = Errors.handleThrowable(ccatch_env_var, $UNENCAPSULATION_ERROR);
                        }
                    } finally {
                        $unencapsulating_within_agenda$.rebind(_prev_bind_0, thread);
                    }
                }
                return form;
            }
        }
    }

    /**
     * Transforms API-OP from an external to an internal
     * form, including unencapsulating API-OP (while ignoring errors).
     */
    @LispMethod(comment = "Transforms API-OP from an external to an internal\r\nform, including unencapsulating API-OP (while ignoring errors).\nTransforms API-OP from an external to an internal\nform, including unencapsulating API-OP (while ignoring errors).")
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

    /**
     * Add bookkeeping info (if any) and other context to FORM,
     * then encapsulate it so it is externalizable.
     */
    @LispMethod(comment = "Add bookkeeping info (if any) and other context to FORM,\r\nthen encapsulate it so it is externalizable.\nAdd bookkeeping info (if any) and other context to FORM,\nthen encapsulate it so it is externalizable.")
    public static final SubLObject form_to_api_op_alt(SubLObject form) {
        {
            SubLObject info = cyc_bookkeeping.cyc_bookkeeping_info();
            if (NIL != info) {
                return encapsulation.encapsulate(list(WITH_BOOKKEEPING_INFO, list(QUOTE, info), form));
            } else {
                return encapsulation.encapsulate(form);
            }
        }
    }

    /**
     * Add bookkeeping info (if any) and other context to FORM,
     * then encapsulate it so it is externalizable.
     */
    @LispMethod(comment = "Add bookkeeping info (if any) and other context to FORM,\r\nthen encapsulate it so it is externalizable.\nAdd bookkeeping info (if any) and other context to FORM,\nthen encapsulate it so it is externalizable.")
    public static SubLObject form_to_api_op(final SubLObject form) {
        final SubLObject info = cyc_bookkeeping.cyc_bookkeeping_info();
        if (NIL != info) {
            return encapsulation.encapsulate(list(operation_queues.WITH_BOOKKEEPING_INFO, list(QUOTE, info), form));
        }
        return encapsulation.encapsulate(form);
    }

    public static SubLObject declare_operation_queues_file() {
        declareFunction("local_queue_size", "LOCAL-QUEUE-SIZE", 0, 0, false);
        declareFunction("local_queue_empty", "LOCAL-QUEUE-EMPTY", 0, 0, false);
        declareFunction("clear_local_queue", "CLEAR-LOCAL-QUEUE", 0, 0, false);
        declareFunction("local_queue_enqueue", "LOCAL-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction("local_queue_dequeue", "LOCAL-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction("local_queue_peek", "LOCAL-QUEUE-PEEK", 0, 0, false);
        declareFunction("local_queue_contents", "LOCAL-QUEUE-CONTENTS", 0, 0, false);
        declareFunction("local_queue", "LOCAL-QUEUE", 0, 0, false);
        declareFunction("set_local_queue", "SET-LOCAL-QUEUE", 1, 0, false);
        declareFunction("remote_queue_size", "REMOTE-QUEUE-SIZE", 0, 0, false);
        declareFunction("remote_queue_empty", "REMOTE-QUEUE-EMPTY", 0, 0, false);
        declareFunction("clear_remote_queue", "CLEAR-REMOTE-QUEUE", 0, 0, false);
        declareFunction("remote_queue_enqueue", "REMOTE-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction("remote_queue_dequeue", "REMOTE-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction("transcript_queue_size", "TRANSCRIPT-QUEUE-SIZE", 0, 0, false);
        declareFunction("transcript_queue_empty", "TRANSCRIPT-QUEUE-EMPTY", 0, 0, false);
        declareFunction("clear_transcript_queue", "CLEAR-TRANSCRIPT-QUEUE", 0, 0, false);
        declareFunction("transcript_queue_enqueue", "TRANSCRIPT-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction("transcript_queue_dequeue", "TRANSCRIPT-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction("hl_transcript_queue_size", "HL-TRANSCRIPT-QUEUE-SIZE", 0, 0, false);
        declareFunction("hl_transcript_queue_emptyP", "HL-TRANSCRIPT-QUEUE-EMPTY?", 0, 0, false);
        declareFunction("clear_hl_transcript_queue", "CLEAR-HL-TRANSCRIPT-QUEUE", 0, 0, false);
        declareFunction("hl_transcript_queue_enqueue", "HL-TRANSCRIPT-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction("hl_transcript_queue_dequeue", "HL-TRANSCRIPT-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction("auxiliary_queue_size", "AUXILIARY-QUEUE-SIZE", 0, 0, false);
        declareFunction("auxiliary_queue_empty", "AUXILIARY-QUEUE-EMPTY", 0, 0, false);
        declareFunction("clear_auxiliary_queue", "CLEAR-AUXILIARY-QUEUE", 0, 0, false);
        declareFunction("auxiliary_queue_enqueue", "AUXILIARY-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction("auxiliary_queue_dequeue", "AUXILIARY-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction("auxiliary_queue_peek", "AUXILIARY-QUEUE-PEEK", 0, 0, false);
        declareFunction("transmit_queue_size", "TRANSMIT-QUEUE-SIZE", 0, 0, false);
        declareFunction("transmit_queue_empty", "TRANSMIT-QUEUE-EMPTY", 0, 0, false);
        declareFunction("clear_transmit_queue", "CLEAR-TRANSMIT-QUEUE", 0, 0, false);
        declareFunction("transmit_queue_enqueue", "TRANSMIT-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction("transmit_queue_dequeue", "TRANSMIT-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction("transmit_queue_peek_chunk", "TRANSMIT-QUEUE-PEEK-CHUNK", 1, 0, false);
        declareFunction("transmit_queue_remove_chunk", "TRANSMIT-QUEUE-REMOVE-CHUNK", 1, 0, false);
        declareFunction("local_operation_storage_queue_size", "LOCAL-OPERATION-STORAGE-QUEUE-SIZE", 0, 0, false);
        declareFunction("local_operation_storage_queue_empty", "LOCAL-OPERATION-STORAGE-QUEUE-EMPTY", 0, 0, false);
        declareFunction("clear_local_operation_storage_queue", "CLEAR-LOCAL-OPERATION-STORAGE-QUEUE", 0, 0, false);
        declareFunction("local_operation_storage_queue_enqueue", "LOCAL-OPERATION-STORAGE-QUEUE-ENQUEUE", 1, 0, false);
        declareFunction("local_operation_storage_queue_dequeue", "LOCAL-OPERATION-STORAGE-QUEUE-DEQUEUE", 0, 0, false);
        declareFunction("local_operation_storage_queue_contents", "LOCAL-OPERATION-STORAGE-QUEUE-CONTENTS", 0, 0, false);
        declareFunction("local_operations_anywhere", "LOCAL-OPERATIONS-ANYWHERE", 0, 0, false);
        declareFunction("all_internal_queue_sizes", "ALL-INTERNAL-QUEUE-SIZES", 0, 0, false);
        declareFunction("wait_for_queues_to_finish", "WAIT-FOR-QUEUES-TO-FINISH", 1, 0, false);
        declareFunction("add_to_local_queue", "ADD-TO-LOCAL-QUEUE", 1, 1, false);
        declareFunction("run_one_local_op", "RUN-ONE-LOCAL-OP", 0, 0, false);
        declareFunction("add_to_remote_queue", "ADD-TO-REMOTE-QUEUE", 1, 0, false);
        declareFunction("within_a_remote_opP", "WITHIN-A-REMOTE-OP?", 0, 0, false);
        declareFunction("run_one_remote_op", "RUN-ONE-REMOTE-OP", 0, 0, false);
        declareFunction("run_one_remote_op_internal", "RUN-ONE-REMOTE-OP-INTERNAL", 1, 0, false);
        declareFunction("add_to_auxiliary_queue", "ADD-TO-AUXILIARY-QUEUE", 1, 0, false);
        declareFunction("run_one_auxiliary_op", "RUN-ONE-AUXILIARY-OP", 0, 0, false);
        declareFunction("possibly_add_to_transcript_queue", "POSSIBLY-ADD-TO-TRANSCRIPT-QUEUE", 1, 0, false);
        declareFunction("add_to_transcript_queue", "ADD-TO-TRANSCRIPT-QUEUE", 1, 0, false);
        declareFunction("hl_transcript_formP", "HL-TRANSCRIPT-FORM?", 1, 0, false);
        declareFunction("add_to_hl_transcript_queue", "ADD-TO-HL-TRANSCRIPT-QUEUE", 1, 0, false);
        declareFunction("api_op_to_form", "API-OP-TO-FORM", 1, 0, false);
        declareFunction("form_to_api_op", "FORM-TO-API-OP", 1, 0, false);
        return NIL;
    }

    static private final SubLString $str_alt2$Local_queue_being_overwritten___A = makeString("Local queue being overwritten, ~A operations lost");

    public static final SubLObject init_operation_queues_file_alt() {
        deflexical("*LOCAL-QUEUE*", NIL != boundp($local_queue$) ? ((SubLObject) ($local_queue$.getGlobalValue())) : queues.create_queue());
        defparameter("*LOCAL-QUEUE-LOCK*", make_lock($$$Local_Queue_Lock));
        deflexical("*REMOTE-QUEUE*", NIL != boundp($remote_queue$) ? ((SubLObject) ($remote_queue$.getGlobalValue())) : queues.create_queue());
        defparameter("*REMOTE-QUEUE-LOCK*", make_lock($$$Remote_Queue_Lock));
        deflexical("*TRANSCRIPT-QUEUE*", NIL != boundp($transcript_queue$) ? ((SubLObject) ($transcript_queue$.getGlobalValue())) : queues.create_queue());
        defparameter("*TRANSCRIPT-QUEUE-LOCK*", make_lock($$$Transcript_Queue_Lock));
        deflexical("*HL-TRANSCRIPT-QUEUE*", NIL != boundp($hl_transcript_queue$) ? ((SubLObject) ($hl_transcript_queue$.getGlobalValue())) : queues.create_queue());
        defparameter("*HL-TRANSCRIPT-QUEUE-LOCK*", make_lock($$$HL_Transcript_Queue_Lock));
        deflexical("*AUXILIARY-QUEUE*", NIL != boundp($auxiliary_queue$) ? ((SubLObject) ($auxiliary_queue$.getGlobalValue())) : queues.create_queue());
        defparameter("*AUXILIARY-QUEUE-LOCK*", make_lock($$$Auxiliary_Queue_Lock));
        deflexical("*TRANSMIT-QUEUE*", NIL != boundp($transmit_queue$) ? ((SubLObject) ($transmit_queue$.getGlobalValue())) : queues.create_queue());
        defparameter("*TRANSMIT-QUEUE-LOCK*", make_lock($$$Transmit_Queue_Lock));
        deflexical("*LOCAL-OPERATION-STORAGE-QUEUE*", NIL != boundp($local_operation_storage_queue$) ? ((SubLObject) ($local_operation_storage_queue$.getGlobalValue())) : queues.create_queue());
        defparameter("*LOCAL-OPERATION-STORAGE-QUEUE-LOCK*", make_lock($$$Local_Operation_Queue_Lock));
        defparameter("*WITHIN-A-REMOTE-OP?*", NIL);
        defparameter("*HL-TRANSCRIPTS-ENABLED?*", NIL);
        deflexical("*HL-TRANSCRIPT-SPECIAL-OPERATORS*", $list_alt17);
        return NIL;
    }

    public static SubLObject init_operation_queues_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*LOCAL-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$local_queue$, operation_queues.$local_queue$, () -> queues.create_queue(UNPROVIDED)));
            defparameter("*LOCAL-QUEUE-LOCK*", make_lock(operation_queues.$$$Local_Queue_Lock));
            deflexical("*REMOTE-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$remote_queue$, operation_queues.$remote_queue$, () -> queues.create_queue(UNPROVIDED)));
            defparameter("*REMOTE-QUEUE-LOCK*", make_lock(operation_queues.$$$Remote_Queue_Lock));
            deflexical("*TRANSCRIPT-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$transcript_queue$, operation_queues.$transcript_queue$, () -> queues.create_queue(UNPROVIDED)));
            defparameter("*TRANSCRIPT-QUEUE-LOCK*", make_lock(operation_queues.$$$Transcript_Queue_Lock));
            deflexical("*HL-TRANSCRIPT-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$hl_transcript_queue$, operation_queues.$hl_transcript_queue$, () -> queues.create_queue(UNPROVIDED)));
            defparameter("*HL-TRANSCRIPT-QUEUE-LOCK*", make_lock(operation_queues.$$$HL_Transcript_Queue_Lock));
            deflexical("*AUXILIARY-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$auxiliary_queue$, operation_queues.$auxiliary_queue$, () -> queues.create_queue(UNPROVIDED)));
            defparameter("*AUXILIARY-QUEUE-LOCK*", make_lock(operation_queues.$$$Auxiliary_Queue_Lock));
            deflexical("*TRANSMIT-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$transmit_queue$, operation_queues.$transmit_queue$, () -> queues.create_queue(UNPROVIDED)));
            defparameter("*TRANSMIT-QUEUE-LOCK*", make_lock(operation_queues.$$$Transmit_Queue_Lock));
            deflexical("*LOCAL-OPERATION-STORAGE-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$local_operation_storage_queue$, operation_queues.$local_operation_storage_queue$, () -> queues.create_queue(UNPROVIDED)));
            defparameter("*LOCAL-OPERATION-STORAGE-QUEUE-LOCK*", make_lock(operation_queues.$$$Local_Operation_Queue_Lock));
            defparameter("*WITHIN-A-REMOTE-OP?*", NIL);
            defparameter("*HL-TRANSCRIPTS-ENABLED?*", NIL);
            deflexical("*HL-TRANSCRIPT-SPECIAL-OPERATORS*", operation_queues.$list21);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*LOCAL-QUEUE*", NIL != boundp($local_queue$) ? ((SubLObject) ($local_queue$.getGlobalValue())) : queues.create_queue());
            deflexical("*REMOTE-QUEUE*", NIL != boundp($remote_queue$) ? ((SubLObject) ($remote_queue$.getGlobalValue())) : queues.create_queue());
            deflexical("*TRANSCRIPT-QUEUE*", NIL != boundp($transcript_queue$) ? ((SubLObject) ($transcript_queue$.getGlobalValue())) : queues.create_queue());
            deflexical("*HL-TRANSCRIPT-QUEUE*", NIL != boundp($hl_transcript_queue$) ? ((SubLObject) ($hl_transcript_queue$.getGlobalValue())) : queues.create_queue());
            deflexical("*AUXILIARY-QUEUE*", NIL != boundp($auxiliary_queue$) ? ((SubLObject) ($auxiliary_queue$.getGlobalValue())) : queues.create_queue());
            deflexical("*TRANSMIT-QUEUE*", NIL != boundp($transmit_queue$) ? ((SubLObject) ($transmit_queue$.getGlobalValue())) : queues.create_queue());
            deflexical("*LOCAL-OPERATION-STORAGE-QUEUE*", NIL != boundp($local_operation_storage_queue$) ? ((SubLObject) ($local_operation_storage_queue$.getGlobalValue())) : queues.create_queue());
            deflexical("*HL-TRANSCRIPT-SPECIAL-OPERATORS*", $list_alt17);
        }
        return NIL;
    }

    public static SubLObject init_operation_queues_file_Previous() {
        deflexical("*LOCAL-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$local_queue$, operation_queues.$local_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*LOCAL-QUEUE-LOCK*", make_lock(operation_queues.$$$Local_Queue_Lock));
        deflexical("*REMOTE-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$remote_queue$, operation_queues.$remote_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*REMOTE-QUEUE-LOCK*", make_lock(operation_queues.$$$Remote_Queue_Lock));
        deflexical("*TRANSCRIPT-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$transcript_queue$, operation_queues.$transcript_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*TRANSCRIPT-QUEUE-LOCK*", make_lock(operation_queues.$$$Transcript_Queue_Lock));
        deflexical("*HL-TRANSCRIPT-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$hl_transcript_queue$, operation_queues.$hl_transcript_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*HL-TRANSCRIPT-QUEUE-LOCK*", make_lock(operation_queues.$$$HL_Transcript_Queue_Lock));
        deflexical("*AUXILIARY-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$auxiliary_queue$, operation_queues.$auxiliary_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*AUXILIARY-QUEUE-LOCK*", make_lock(operation_queues.$$$Auxiliary_Queue_Lock));
        deflexical("*TRANSMIT-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$transmit_queue$, operation_queues.$transmit_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*TRANSMIT-QUEUE-LOCK*", make_lock(operation_queues.$$$Transmit_Queue_Lock));
        deflexical("*LOCAL-OPERATION-STORAGE-QUEUE*", SubLTrampolineFile.maybeDefault(operation_queues.$local_operation_storage_queue$, operation_queues.$local_operation_storage_queue$, () -> queues.create_queue(UNPROVIDED)));
        defparameter("*LOCAL-OPERATION-STORAGE-QUEUE-LOCK*", make_lock(operation_queues.$$$Local_Operation_Queue_Lock));
        defparameter("*WITHIN-A-REMOTE-OP?*", NIL);
        defparameter("*HL-TRANSCRIPTS-ENABLED?*", NIL);
        deflexical("*HL-TRANSCRIPT-SPECIAL-OPERATORS*", operation_queues.$list21);
        return NIL;
    }

    static private final SubLString $str_alt16$_A = makeString("~A");

    static private final SubLList $list_alt17 = list(makeSymbol("FI-ASSERT"), makeSymbol("FI-UNASSERT"), makeSymbol("FI-BLAST"), makeSymbol("FI-TIMESTAMP-CONSTANT"), makeSymbol("FI-TIMESTAMP-ASSERTION"));

    public static SubLObject setup_operation_queues_file() {
        declare_defglobal(operation_queues.$local_queue$);
        declare_defglobal(operation_queues.$remote_queue$);
        declare_defglobal(operation_queues.$transcript_queue$);
        declare_defglobal(operation_queues.$hl_transcript_queue$);
        declare_defglobal(operation_queues.$auxiliary_queue$);
        declare_defglobal(operation_queues.$transmit_queue$);
        declare_defglobal(operation_queues.$local_operation_storage_queue$);
        register_external_symbol(operation_queues.ALL_INTERNAL_QUEUE_SIZES);
        register_external_symbol(operation_queues.WAIT_FOR_QUEUES_TO_FINISH);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        operation_queues.declare_operation_queues_file();
    }

    @Override
    public void initializeVariables() {
        operation_queues.init_operation_queues_file();
    }

    @Override
    public void runTopLevelForms() {
        operation_queues.setup_operation_queues_file();
    }

    static {
    }
}

/**
 * Total time: 264 ms
 */
