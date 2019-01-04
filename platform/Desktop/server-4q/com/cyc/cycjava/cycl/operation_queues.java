package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class operation_queues extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.operation_queues";
    public static final String myFingerPrint = "7fd42f2e861e5d0aa8b21a926da259457d09fe159fa82836f26762a630c034c5";
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 380L)
    private static SubLSymbol $local_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 1886L)
    public static SubLSymbol $local_queue_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3385L)
    public static SubLSymbol $remote_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3673L)
    public static SubLSymbol $remote_queue_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4320L)
    public static SubLSymbol $transcript_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4622L)
    public static SubLSymbol $transcript_queue_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5329L)
    public static SubLSymbol $hl_transcript_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5642L)
    public static SubLSymbol $hl_transcript_queue_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6395L)
    public static SubLSymbol $auxiliary_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6701L)
    public static SubLSymbol $auxiliary_queue_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7558L)
    public static SubLSymbol $transmit_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7838L)
    public static SubLSymbol $transmit_queue_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 9354L)
    public static SubLSymbol $local_operation_storage_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 9639L)
    public static SubLSymbol $local_operation_storage_queue_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 12906L)
    public static SubLSymbol $within_a_remote_opP$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 15637L)
    public static SubLSymbol $hl_transcripts_enabledP$;
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 15928L)
    private static SubLSymbol $hl_transcript_special_operators$;
    private static final SubLSymbol $sym0$_LOCAL_QUEUE_;
    private static final SubLString $str1$Local_Queue_Lock;
    private static final SubLString $str2$Local_queue_being_overwritten___A;
    private static final SubLSymbol $sym3$_REMOTE_QUEUE_;
    private static final SubLString $str4$Remote_Queue_Lock;
    private static final SubLSymbol $sym5$_TRANSCRIPT_QUEUE_;
    private static final SubLString $str6$Transcript_Queue_Lock;
    private static final SubLSymbol $sym7$_HL_TRANSCRIPT_QUEUE_;
    private static final SubLString $str8$HL_Transcript_Queue_Lock;
    private static final SubLSymbol $sym9$_AUXILIARY_QUEUE_;
    private static final SubLString $str10$Auxiliary_Queue_Lock;
    private static final SubLSymbol $sym11$_TRANSMIT_QUEUE_;
    private static final SubLString $str12$Transmit_Queue_Lock;
    private static final SubLString $str13$The_Transmit_Queue_contains_OP__A;
    private static final SubLSymbol $sym14$_LOCAL_OPERATION_STORAGE_QUEUE_;
    private static final SubLString $str15$Local_Operation_Queue_Lock;
    private static final SubLSymbol $sym16$ALL_INTERNAL_QUEUE_SIZES;
    private static final SubLSymbol $sym17$WAIT_FOR_QUEUES_TO_FINISH;
    private static final SubLSymbol $sym18$STRINGP;
    private static final SubLSymbol $sym19$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLString $str20$_A;
    private static final SubLList $list21;
    private static final SubLSymbol $kw22$UNENCAPSULATION_ERROR;
    private static final SubLSymbol $sym23$WITH_BOOKKEEPING_INFO;
    private static final SubLSymbol $sym24$QUOTE;
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 1952L)
    public static SubLObject local_queue_size() {
        return queues.queue_size(operation_queues.$local_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2081L)
    public static SubLObject local_queue_empty() {
        return queues.queue_empty_p(operation_queues.$local_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2214L)
    public static SubLObject clear_local_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$local_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2400L)
    public static SubLObject local_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$local_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2540L)
    public static SubLObject local_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)operation_queues.NIL;
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$local_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2697L)
    public static SubLObject local_queue_peek() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)operation_queues.NIL;
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            ans = queues.queue_peek(operation_queues.$local_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2854L)
    public static SubLObject local_queue_contents() {
        return queues.queue_elements(operation_queues.$local_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 2996L)
    public static SubLObject local_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)operation_queues.NIL;
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            result = operation_queues.$local_queue$.getGlobalValue();
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3143L)
    public static SubLObject set_local_queue(final SubLObject queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_queues.NIL == local_queue_empty()) {
            Errors.warn((SubLObject)operation_queues.$str2$Local_queue_being_overwritten___A, local_queue_size());
        }
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            operation_queues.$local_queue$.setGlobalValue(queue);
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$local_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3741L)
    public static SubLObject remote_queue_size() {
        return queues.queue_size(operation_queues.$remote_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3816L)
    public static SubLObject remote_queue_empty() {
        return queues.queue_empty_p(operation_queues.$remote_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 3894L)
    public static SubLObject clear_remote_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$remote_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4018L)
    public static SubLObject remote_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$remote_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4160L)
    public static SubLObject remote_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)operation_queues.NIL;
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$remote_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$remote_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4698L)
    public static SubLObject transcript_queue_size() {
        return queues.queue_size(operation_queues.$transcript_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4781L)
    public static SubLObject transcript_queue_empty() {
        return queues.queue_empty_p(operation_queues.$transcript_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 4867L)
    public static SubLObject clear_transcript_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$transcript_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5003L)
    public static SubLObject transcript_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$transcript_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5157L)
    public static SubLObject transcript_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)operation_queues.NIL;
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$transcript_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5724L)
    public static SubLObject hl_transcript_queue_size() {
        return queues.queue_size(operation_queues.$hl_transcript_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5813L)
    public static SubLObject hl_transcript_queue_emptyP() {
        return queues.queue_empty_p(operation_queues.$hl_transcript_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 5906L)
    public static SubLObject clear_hl_transcript_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$hl_transcript_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6051L)
    public static SubLObject hl_transcript_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$hl_transcript_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6214L)
    public static SubLObject hl_transcript_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)operation_queues.NIL;
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$hl_transcript_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$hl_transcript_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6775L)
    public static SubLObject auxiliary_queue_size() {
        return queues.queue_size(operation_queues.$auxiliary_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6856L)
    public static SubLObject auxiliary_queue_empty() {
        return queues.queue_empty_p(operation_queues.$auxiliary_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 6940L)
    public static SubLObject clear_auxiliary_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$auxiliary_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7073L)
    public static SubLObject auxiliary_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$auxiliary_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7224L)
    public static SubLObject auxiliary_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)operation_queues.NIL;
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$auxiliary_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7393L)
    public static SubLObject auxiliary_queue_peek() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)operation_queues.NIL;
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            ans = queues.queue_peek(operation_queues.$auxiliary_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$auxiliary_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7910L)
    public static SubLObject transmit_queue_size() {
        return queues.queue_size(operation_queues.$transmit_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 7989L)
    public static SubLObject transmit_queue_empty() {
        return queues.queue_empty_p(operation_queues.$transmit_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 8071L)
    public static SubLObject clear_transmit_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$transmit_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 8201L)
    public static SubLObject transmit_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$transmit_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 8349L)
    public static SubLObject transmit_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)operation_queues.NIL;
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$transmit_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 8515L)
    public static SubLObject transmit_queue_peek_chunk(final SubLObject chunk_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject size = (SubLObject)operation_queues.NIL;
        SubLObject data = (SubLObject)operation_queues.NIL;
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            data = queues.queue_peek_n(operation_queues.$transmit_queue$.getGlobalValue(), chunk_size);
            size = Sequences.length(data);
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return Values.values(data, size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 8889L)
    public static SubLObject transmit_queue_remove_chunk(final SubLObject chunk) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            SubLObject cdolist_list_var = chunk;
            SubLObject expected_op = (SubLObject)operation_queues.NIL;
            expected_op = cdolist_list_var.first();
            while (operation_queues.NIL != cdolist_list_var) {
                final SubLObject found_op = queues.dequeue(operation_queues.$transmit_queue$.getGlobalValue());
                if (operation_queues.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !expected_op.equal(found_op)) {
                    Errors.error((SubLObject)operation_queues.$str13$The_Transmit_Queue_contains_OP__A, expected_op, found_op);
                }
                cdolist_list_var = cdolist_list_var.rest();
                expected_op = cdolist_list_var.first();
            }
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$transmit_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 9733L)
    public static SubLObject local_operation_storage_queue_size() {
        return queues.queue_size(operation_queues.$local_operation_storage_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 9842L)
    public static SubLObject local_operation_storage_queue_empty() {
        return queues.queue_empty_p(operation_queues.$local_operation_storage_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 9954L)
    public static SubLObject clear_local_operation_storage_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            queues.clear_queue(operation_queues.$local_operation_storage_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 10129L)
    public static SubLObject local_operation_storage_queue_enqueue(final SubLObject operation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            queues.enqueue(operation, operation_queues.$local_operation_storage_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            }
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 10322L)
    public static SubLObject local_operation_storage_queue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = (SubLObject)operation_queues.NIL;
        SubLObject release = (SubLObject)operation_queues.NIL;
        try {
            release = Locks.seize_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            ans = queues.dequeue(operation_queues.$local_operation_storage_queue$.getGlobalValue());
        }
        finally {
            if (operation_queues.NIL != release) {
                Locks.release_lock(operation_queues.$local_operation_storage_queue_lock$.getDynamicValue(thread));
            }
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 10533L)
    public static SubLObject local_operation_storage_queue_contents() {
        return queues.queue_elements(operation_queues.$local_operation_storage_queue$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 10711L)
    public static SubLObject local_operations_anywhere() {
        return (SubLObject)SubLObjectFactory.makeBoolean(operation_queues.NIL == local_queue_empty() || operation_queues.NIL == transcript_queue_empty() || operation_queues.NIL == local_operation_storage_queue_empty());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 11112L)
    public static SubLObject all_internal_queue_sizes() {
        return Numbers.add(auxiliary_queue_size(), local_queue_size());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 11321L)
    public static SubLObject wait_for_queues_to_finish(final SubLObject msg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert operation_queues.NIL != Types.stringp(msg) : msg;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)operation_queues.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)operation_queues.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)operation_queues.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(msg);
                final SubLObject max = all_internal_queue_sizes();
                while (all_internal_queue_sizes().isPositive()) {
                    final SubLObject curr = all_internal_queue_sizes();
                    final SubLObject done = Numbers.subtract(max, curr);
                    utilities_macros.note_percent_progress(done, max);
                    Threads.sleep((SubLObject)operation_queues.TEN_INTEGER);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_queues.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return msg;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 11800L)
    public static SubLObject add_to_local_queue(final SubLObject form, SubLObject encapsulateP) {
        if (encapsulateP == operation_queues.UNPROVIDED) {
            encapsulateP = (SubLObject)operation_queues.T;
        }
        final SubLObject api_op = (operation_queues.NIL != encapsulateP) ? form_to_api_op(form) : form;
        local_queue_enqueue(api_op);
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 12112L)
    public static SubLObject run_one_local_op() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject op = local_queue_dequeue();
        if (operation_queues.NIL != op) {
            final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
            try {
                api_control_vars.$use_local_queueP$.bind((SubLObject)operation_queues.NIL, thread);
                control_vars.$last_agenda_op$.setGlobalValue(op);
                final SubLObject form = api_op_to_form(op);
                if (operation_queues.NIL != form) {
                    try {
                        process_utilities.current_process_note_form(form);
                        eval_in_api.cyc_api_eval(form);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_queues.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            process_utilities.current_process_clear_form();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                }
            }
            finally {
                api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
            }
            if (operation_queues.NIL != local_queue_empty()) {
                operation_communication.save_transcript_ops();
            }
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 12594L)
    public static SubLObject add_to_remote_queue(final SubLObject form) {
        if (operation_queues.NIL != operation_communication.operation_from_meP(form)) {
            operation_communication.set_read_master_transcript_op_number(Numbers.add((SubLObject)operation_queues.ONE_INTEGER, operation_communication.read_master_transcript_op_number()));
        }
        else {
            remote_queue_enqueue(conses_high.fourth(form));
        }
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 12958L)
    public static SubLObject within_a_remote_opP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return operation_queues.$within_a_remote_opP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 13028L)
    public static SubLObject run_one_remote_op() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject op = (SubLObject)operation_queues.NIL;
        op = remote_queue_dequeue();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$use_transcriptP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = operation_queues.$within_a_remote_opP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)operation_queues.NIL, thread);
            control_vars.$use_transcriptP$.bind((SubLObject)operation_queues.NIL, thread);
            operation_queues.$within_a_remote_opP$.bind((SubLObject)operation_queues.T, thread);
            if (operation_queues.NIL != op) {
                operation_communication.set_read_master_transcript_op_number(Numbers.add((SubLObject)operation_queues.ONE_INTEGER, operation_communication.read_master_transcript_op_number()));
                control_vars.$last_agenda_op$.setGlobalValue(op);
                if (operation_queues.NIL != control_vars.$ignore_remote_errors$.getDynamicValue(thread)) {
                    SubLObject error_message = (SubLObject)operation_queues.NIL;
                    try {
                        thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind((SubLObject)operation_queues.$sym19$CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                run_one_remote_op_internal(op);
                            }
                            catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, (SubLObject)operation_queues.NIL);
                            }
                        }
                        finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                        }
                    }
                    catch (Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                    }
                    finally {
                        thread.throwStack.pop();
                    }
                    if (operation_queues.NIL != error_message) {
                        Errors.warn((SubLObject)operation_queues.$str20$_A, error_message);
                    }
                }
                else {
                    run_one_remote_op_internal(op);
                }
            }
        }
        finally {
            operation_queues.$within_a_remote_opP$.rebind(_prev_bind_3, thread);
            control_vars.$use_transcriptP$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 13861L)
    public static SubLObject run_one_remote_op_internal(final SubLObject op) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject form = api_op_to_form(op);
            if (operation_queues.NIL != form) {
                final SubLObject _prev_bind_0 = Errors.$continue_cerrorP$.currentBinding(thread);
                try {
                    Errors.$continue_cerrorP$.bind((SubLObject)operation_queues.T, thread);
                    try {
                        process_utilities.current_process_note_form(form);
                        eval_in_api.cyc_api_eval(form);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_queues.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            process_utilities.current_process_clear_form();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                    operation_communication.set_total_master_transcript_operations_processed(Numbers.add((SubLObject)operation_queues.ONE_INTEGER, operation_communication.total_master_transcript_operations_processed()));
                }
                finally {
                    Errors.$continue_cerrorP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_queues.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                operation_communication.set_total_remote_operations_run(Numbers.add((SubLObject)operation_queues.ONE_INTEGER, operation_communication.total_remote_operations_run()));
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 14534L)
    public static SubLObject add_to_auxiliary_queue(final SubLObject form) {
        auxiliary_queue_enqueue(conses_high.fourth(form));
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 14732L)
    public static SubLObject run_one_auxiliary_op() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject op = (SubLObject)operation_queues.NIL;
        op = auxiliary_queue_dequeue();
        final SubLObject _prev_bind_0 = api_control_vars.$use_local_queueP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = control_vars.$use_transcriptP$.currentBinding(thread);
        try {
            api_control_vars.$use_local_queueP$.bind((SubLObject)operation_queues.NIL, thread);
            control_vars.$use_transcriptP$.bind((SubLObject)operation_queues.NIL, thread);
            if (operation_queues.NIL != op) {
                control_vars.$last_agenda_op$.setGlobalValue(op);
                final SubLObject form = api_op_to_form(op);
                if (operation_queues.NIL != form) {
                    try {
                        process_utilities.current_process_note_form(form);
                        eval_in_api.cyc_api_eval(form);
                    }
                    finally {
                        final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)operation_queues.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            process_utilities.current_process_clear_form();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    operation_communication.inc_total_auxiliary_operations_run();
                }
            }
        }
        finally {
            control_vars.$use_transcriptP$.rebind(_prev_bind_2, thread);
            api_control_vars.$use_local_queueP$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 15177L)
    public static SubLObject possibly_add_to_transcript_queue(final SubLObject encapsulated_form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (operation_queues.NIL != control_vars.$use_transcriptP$.getDynamicValue(thread)) {
            return add_to_transcript_queue(encapsulated_form);
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 15430L)
    public static SubLObject add_to_transcript_queue(final SubLObject encapsulated_form) {
        transcript_queue_enqueue((SubLObject)ConsesLow.list(encapsulation.encapsulate(operation_communication.the_cyclist()), control_vars.cyc_image_id(), numeric_date_utilities.get_universal_date((SubLObject)operation_queues.UNPROVIDED, (SubLObject)operation_queues.UNPROVIDED), encapsulated_form));
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 16217L)
    public static SubLObject hl_transcript_formP(final SubLObject form) {
        if (form.isCons()) {
            final SubLObject operator = form.first();
            if (operation_queues.NIL == subl_promotions.memberP(operator, operation_queues.$hl_transcript_special_operators$.getGlobalValue(), (SubLObject)operation_queues.UNPROVIDED, (SubLObject)operation_queues.UNPROVIDED)) {
                return (SubLObject)operation_queues.T;
            }
        }
        return (SubLObject)operation_queues.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 16459L)
    public static SubLObject add_to_hl_transcript_queue(final SubLObject encapsulated_form) {
        hl_transcript_queue_enqueue((SubLObject)ConsesLow.list(encapsulation.encapsulate(operation_communication.the_cyclist()), control_vars.cyc_image_id(), numeric_date_utilities.get_universal_date((SubLObject)operation_queues.UNPROVIDED, (SubLObject)operation_queues.UNPROVIDED), encapsulated_form));
        return (SubLObject)operation_queues.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 16681L)
    public static SubLObject api_op_to_form(SubLObject api_op) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject form = (SubLObject)operation_queues.NIL;
        final SubLObject _prev_bind_0 = control_vars.$unencapsulating_within_agenda$.currentBinding(thread);
        try {
            control_vars.$unencapsulating_within_agenda$.bind((SubLObject)operation_queues.T, thread);
            try {
                thread.throwStack.push(operation_queues.$kw22$UNENCAPSULATION_ERROR);
                form = encapsulation.unencapsulate(api_op);
            }
            catch (Throwable ccatch_env_var) {
                api_op = Errors.handleThrowable(ccatch_env_var, (SubLObject)operation_queues.$kw22$UNENCAPSULATION_ERROR);
            }
            finally {
                thread.throwStack.pop();
            }
        }
        finally {
            control_vars.$unencapsulating_within_agenda$.rebind(_prev_bind_0, thread);
        }
        return form;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/operation-queues.lisp", position = 17059L)
    public static SubLObject form_to_api_op(final SubLObject form) {
        final SubLObject info = cyc_bookkeeping.cyc_bookkeeping_info();
        if (operation_queues.NIL != info) {
            return encapsulation.encapsulate((SubLObject)ConsesLow.list((SubLObject)operation_queues.$sym23$WITH_BOOKKEEPING_INFO, (SubLObject)ConsesLow.list((SubLObject)operation_queues.$sym24$QUOTE, info), form));
        }
        return encapsulation.encapsulate(form);
    }
    
    public static SubLObject declare_operation_queues_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_queue_size", "LOCAL-QUEUE-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_queue_empty", "LOCAL-QUEUE-EMPTY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "clear_local_queue", "CLEAR-LOCAL-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_queue_enqueue", "LOCAL-QUEUE-ENQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_queue_dequeue", "LOCAL-QUEUE-DEQUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_queue_peek", "LOCAL-QUEUE-PEEK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_queue_contents", "LOCAL-QUEUE-CONTENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_queue", "LOCAL-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "set_local_queue", "SET-LOCAL-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "remote_queue_size", "REMOTE-QUEUE-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "remote_queue_empty", "REMOTE-QUEUE-EMPTY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "clear_remote_queue", "CLEAR-REMOTE-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "remote_queue_enqueue", "REMOTE-QUEUE-ENQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "remote_queue_dequeue", "REMOTE-QUEUE-DEQUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "transcript_queue_size", "TRANSCRIPT-QUEUE-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "transcript_queue_empty", "TRANSCRIPT-QUEUE-EMPTY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "clear_transcript_queue", "CLEAR-TRANSCRIPT-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "transcript_queue_enqueue", "TRANSCRIPT-QUEUE-ENQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "transcript_queue_dequeue", "TRANSCRIPT-QUEUE-DEQUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "hl_transcript_queue_size", "HL-TRANSCRIPT-QUEUE-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "hl_transcript_queue_emptyP", "HL-TRANSCRIPT-QUEUE-EMPTY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "clear_hl_transcript_queue", "CLEAR-HL-TRANSCRIPT-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "hl_transcript_queue_enqueue", "HL-TRANSCRIPT-QUEUE-ENQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "hl_transcript_queue_dequeue", "HL-TRANSCRIPT-QUEUE-DEQUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "auxiliary_queue_size", "AUXILIARY-QUEUE-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "auxiliary_queue_empty", "AUXILIARY-QUEUE-EMPTY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "clear_auxiliary_queue", "CLEAR-AUXILIARY-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "auxiliary_queue_enqueue", "AUXILIARY-QUEUE-ENQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "auxiliary_queue_dequeue", "AUXILIARY-QUEUE-DEQUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "auxiliary_queue_peek", "AUXILIARY-QUEUE-PEEK", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "transmit_queue_size", "TRANSMIT-QUEUE-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "transmit_queue_empty", "TRANSMIT-QUEUE-EMPTY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "clear_transmit_queue", "CLEAR-TRANSMIT-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "transmit_queue_enqueue", "TRANSMIT-QUEUE-ENQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "transmit_queue_dequeue", "TRANSMIT-QUEUE-DEQUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "transmit_queue_peek_chunk", "TRANSMIT-QUEUE-PEEK-CHUNK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "transmit_queue_remove_chunk", "TRANSMIT-QUEUE-REMOVE-CHUNK", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_operation_storage_queue_size", "LOCAL-OPERATION-STORAGE-QUEUE-SIZE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_operation_storage_queue_empty", "LOCAL-OPERATION-STORAGE-QUEUE-EMPTY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "clear_local_operation_storage_queue", "CLEAR-LOCAL-OPERATION-STORAGE-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_operation_storage_queue_enqueue", "LOCAL-OPERATION-STORAGE-QUEUE-ENQUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_operation_storage_queue_dequeue", "LOCAL-OPERATION-STORAGE-QUEUE-DEQUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_operation_storage_queue_contents", "LOCAL-OPERATION-STORAGE-QUEUE-CONTENTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "local_operations_anywhere", "LOCAL-OPERATIONS-ANYWHERE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "all_internal_queue_sizes", "ALL-INTERNAL-QUEUE-SIZES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "wait_for_queues_to_finish", "WAIT-FOR-QUEUES-TO-FINISH", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "add_to_local_queue", "ADD-TO-LOCAL-QUEUE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "run_one_local_op", "RUN-ONE-LOCAL-OP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "add_to_remote_queue", "ADD-TO-REMOTE-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "within_a_remote_opP", "WITHIN-A-REMOTE-OP?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "run_one_remote_op", "RUN-ONE-REMOTE-OP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "run_one_remote_op_internal", "RUN-ONE-REMOTE-OP-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "add_to_auxiliary_queue", "ADD-TO-AUXILIARY-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "run_one_auxiliary_op", "RUN-ONE-AUXILIARY-OP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "possibly_add_to_transcript_queue", "POSSIBLY-ADD-TO-TRANSCRIPT-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "add_to_transcript_queue", "ADD-TO-TRANSCRIPT-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "hl_transcript_formP", "HL-TRANSCRIPT-FORM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "add_to_hl_transcript_queue", "ADD-TO-HL-TRANSCRIPT-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "api_op_to_form", "API-OP-TO-FORM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.operation_queues", "form_to_api_op", "FORM-TO-API-OP", 1, 0, false);
        return (SubLObject)operation_queues.NIL;
    }
    
    public static SubLObject init_operation_queues_file() {
        operation_queues.$local_queue$ = SubLFiles.deflexical("*LOCAL-QUEUE*", (operation_queues.NIL != Symbols.boundp((SubLObject)operation_queues.$sym0$_LOCAL_QUEUE_)) ? operation_queues.$local_queue$.getGlobalValue() : queues.create_queue((SubLObject)operation_queues.UNPROVIDED));
        operation_queues.$local_queue_lock$ = SubLFiles.defparameter("*LOCAL-QUEUE-LOCK*", Locks.make_lock((SubLObject)operation_queues.$str1$Local_Queue_Lock));
        operation_queues.$remote_queue$ = SubLFiles.deflexical("*REMOTE-QUEUE*", (operation_queues.NIL != Symbols.boundp((SubLObject)operation_queues.$sym3$_REMOTE_QUEUE_)) ? operation_queues.$remote_queue$.getGlobalValue() : queues.create_queue((SubLObject)operation_queues.UNPROVIDED));
        operation_queues.$remote_queue_lock$ = SubLFiles.defparameter("*REMOTE-QUEUE-LOCK*", Locks.make_lock((SubLObject)operation_queues.$str4$Remote_Queue_Lock));
        operation_queues.$transcript_queue$ = SubLFiles.deflexical("*TRANSCRIPT-QUEUE*", (operation_queues.NIL != Symbols.boundp((SubLObject)operation_queues.$sym5$_TRANSCRIPT_QUEUE_)) ? operation_queues.$transcript_queue$.getGlobalValue() : queues.create_queue((SubLObject)operation_queues.UNPROVIDED));
        operation_queues.$transcript_queue_lock$ = SubLFiles.defparameter("*TRANSCRIPT-QUEUE-LOCK*", Locks.make_lock((SubLObject)operation_queues.$str6$Transcript_Queue_Lock));
        operation_queues.$hl_transcript_queue$ = SubLFiles.deflexical("*HL-TRANSCRIPT-QUEUE*", (operation_queues.NIL != Symbols.boundp((SubLObject)operation_queues.$sym7$_HL_TRANSCRIPT_QUEUE_)) ? operation_queues.$hl_transcript_queue$.getGlobalValue() : queues.create_queue((SubLObject)operation_queues.UNPROVIDED));
        operation_queues.$hl_transcript_queue_lock$ = SubLFiles.defparameter("*HL-TRANSCRIPT-QUEUE-LOCK*", Locks.make_lock((SubLObject)operation_queues.$str8$HL_Transcript_Queue_Lock));
        operation_queues.$auxiliary_queue$ = SubLFiles.deflexical("*AUXILIARY-QUEUE*", (operation_queues.NIL != Symbols.boundp((SubLObject)operation_queues.$sym9$_AUXILIARY_QUEUE_)) ? operation_queues.$auxiliary_queue$.getGlobalValue() : queues.create_queue((SubLObject)operation_queues.UNPROVIDED));
        operation_queues.$auxiliary_queue_lock$ = SubLFiles.defparameter("*AUXILIARY-QUEUE-LOCK*", Locks.make_lock((SubLObject)operation_queues.$str10$Auxiliary_Queue_Lock));
        operation_queues.$transmit_queue$ = SubLFiles.deflexical("*TRANSMIT-QUEUE*", (operation_queues.NIL != Symbols.boundp((SubLObject)operation_queues.$sym11$_TRANSMIT_QUEUE_)) ? operation_queues.$transmit_queue$.getGlobalValue() : queues.create_queue((SubLObject)operation_queues.UNPROVIDED));
        operation_queues.$transmit_queue_lock$ = SubLFiles.defparameter("*TRANSMIT-QUEUE-LOCK*", Locks.make_lock((SubLObject)operation_queues.$str12$Transmit_Queue_Lock));
        operation_queues.$local_operation_storage_queue$ = SubLFiles.deflexical("*LOCAL-OPERATION-STORAGE-QUEUE*", (operation_queues.NIL != Symbols.boundp((SubLObject)operation_queues.$sym14$_LOCAL_OPERATION_STORAGE_QUEUE_)) ? operation_queues.$local_operation_storage_queue$.getGlobalValue() : queues.create_queue((SubLObject)operation_queues.UNPROVIDED));
        operation_queues.$local_operation_storage_queue_lock$ = SubLFiles.defparameter("*LOCAL-OPERATION-STORAGE-QUEUE-LOCK*", Locks.make_lock((SubLObject)operation_queues.$str15$Local_Operation_Queue_Lock));
        operation_queues.$within_a_remote_opP$ = SubLFiles.defparameter("*WITHIN-A-REMOTE-OP?*", (SubLObject)operation_queues.NIL);
        operation_queues.$hl_transcripts_enabledP$ = SubLFiles.defparameter("*HL-TRANSCRIPTS-ENABLED?*", (SubLObject)operation_queues.NIL);
        operation_queues.$hl_transcript_special_operators$ = SubLFiles.deflexical("*HL-TRANSCRIPT-SPECIAL-OPERATORS*", (SubLObject)operation_queues.$list21);
        return (SubLObject)operation_queues.NIL;
    }
    
    public static SubLObject setup_operation_queues_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)operation_queues.$sym0$_LOCAL_QUEUE_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_queues.$sym3$_REMOTE_QUEUE_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_queues.$sym5$_TRANSCRIPT_QUEUE_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_queues.$sym7$_HL_TRANSCRIPT_QUEUE_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_queues.$sym9$_AUXILIARY_QUEUE_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_queues.$sym11$_TRANSMIT_QUEUE_);
        subl_macro_promotions.declare_defglobal((SubLObject)operation_queues.$sym14$_LOCAL_OPERATION_STORAGE_QUEUE_);
        access_macros.register_external_symbol((SubLObject)operation_queues.$sym16$ALL_INTERNAL_QUEUE_SIZES);
        access_macros.register_external_symbol((SubLObject)operation_queues.$sym17$WAIT_FOR_QUEUES_TO_FINISH);
        return (SubLObject)operation_queues.NIL;
    }
    
    public void declareFunctions() {
        declare_operation_queues_file();
    }
    
    public void initializeVariables() {
        init_operation_queues_file();
    }
    
    public void runTopLevelForms() {
        setup_operation_queues_file();
    }
    
    static {
        me = (SubLFile)new operation_queues();
        operation_queues.$local_queue$ = null;
        operation_queues.$local_queue_lock$ = null;
        operation_queues.$remote_queue$ = null;
        operation_queues.$remote_queue_lock$ = null;
        operation_queues.$transcript_queue$ = null;
        operation_queues.$transcript_queue_lock$ = null;
        operation_queues.$hl_transcript_queue$ = null;
        operation_queues.$hl_transcript_queue_lock$ = null;
        operation_queues.$auxiliary_queue$ = null;
        operation_queues.$auxiliary_queue_lock$ = null;
        operation_queues.$transmit_queue$ = null;
        operation_queues.$transmit_queue_lock$ = null;
        operation_queues.$local_operation_storage_queue$ = null;
        operation_queues.$local_operation_storage_queue_lock$ = null;
        operation_queues.$within_a_remote_opP$ = null;
        operation_queues.$hl_transcripts_enabledP$ = null;
        operation_queues.$hl_transcript_special_operators$ = null;
        $sym0$_LOCAL_QUEUE_ = SubLObjectFactory.makeSymbol("*LOCAL-QUEUE*");
        $str1$Local_Queue_Lock = SubLObjectFactory.makeString("Local Queue Lock");
        $str2$Local_queue_being_overwritten___A = SubLObjectFactory.makeString("Local queue being overwritten, ~A operations lost");
        $sym3$_REMOTE_QUEUE_ = SubLObjectFactory.makeSymbol("*REMOTE-QUEUE*");
        $str4$Remote_Queue_Lock = SubLObjectFactory.makeString("Remote Queue Lock");
        $sym5$_TRANSCRIPT_QUEUE_ = SubLObjectFactory.makeSymbol("*TRANSCRIPT-QUEUE*");
        $str6$Transcript_Queue_Lock = SubLObjectFactory.makeString("Transcript Queue Lock");
        $sym7$_HL_TRANSCRIPT_QUEUE_ = SubLObjectFactory.makeSymbol("*HL-TRANSCRIPT-QUEUE*");
        $str8$HL_Transcript_Queue_Lock = SubLObjectFactory.makeString("HL Transcript Queue Lock");
        $sym9$_AUXILIARY_QUEUE_ = SubLObjectFactory.makeSymbol("*AUXILIARY-QUEUE*");
        $str10$Auxiliary_Queue_Lock = SubLObjectFactory.makeString("Auxiliary Queue Lock");
        $sym11$_TRANSMIT_QUEUE_ = SubLObjectFactory.makeSymbol("*TRANSMIT-QUEUE*");
        $str12$Transmit_Queue_Lock = SubLObjectFactory.makeString("Transmit Queue Lock");
        $str13$The_Transmit_Queue_contains_OP__A = SubLObjectFactory.makeString("The Transmit Queue contains OP ~A, not the expected op ~A--out of sync.");
        $sym14$_LOCAL_OPERATION_STORAGE_QUEUE_ = SubLObjectFactory.makeSymbol("*LOCAL-OPERATION-STORAGE-QUEUE*");
        $str15$Local_Operation_Queue_Lock = SubLObjectFactory.makeString("Local Operation Queue Lock");
        $sym16$ALL_INTERNAL_QUEUE_SIZES = SubLObjectFactory.makeSymbol("ALL-INTERNAL-QUEUE-SIZES");
        $sym17$WAIT_FOR_QUEUES_TO_FINISH = SubLObjectFactory.makeSymbol("WAIT-FOR-QUEUES-TO-FINISH");
        $sym18$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $sym19$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $str20$_A = SubLObjectFactory.makeString("~A");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FI-ASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-UNASSERT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-BLAST"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TIMESTAMP-CONSTANT"), (SubLObject)SubLObjectFactory.makeSymbol("FI-TIMESTAMP-ASSERTION"));
        $kw22$UNENCAPSULATION_ERROR = SubLObjectFactory.makeKeyword("UNENCAPSULATION-ERROR");
        $sym23$WITH_BOOKKEEPING_INFO = SubLObjectFactory.makeSymbol("WITH-BOOKKEEPING-INFO");
        $sym24$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
    }
}

/*

	Total time: 264 ms
	
*/