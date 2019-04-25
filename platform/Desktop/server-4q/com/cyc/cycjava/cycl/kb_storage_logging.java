package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kb_storage_logging extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kb_storage_logging";
    public static final String myFingerPrint = "31f823cef1582165bb1be7a11413dba1f275ae92fc2ad90f8680d73ffd5566d5";
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 826L)
    public static SubLSymbol $kb_storage_client$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 1845L)
    public static SubLSymbol $kb_storage_logging_sink$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 4233L)
    public static SubLSymbol $kb_storage_log_time_stamp_interval$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 4340L)
    private static SubLSymbol $next_kb_storage_log_time_stamp_message$;
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 7059L)
    public static SubLSymbol $kb_storage_logging_tag_table$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLSymbol $sym2$_KB_STORAGE_CLIENT_;
    private static final SubLSymbol $sym3$ADD_KB_STORAGE_LOGGING_ADD_TAG;
    private static final SubLSymbol $sym4$WITH_KB_STORAGE_CLIENT;
    private static final SubLSymbol $kw5$LOAD;
    private static final SubLSymbol $kw6$PAGE_OUT;
    private static final SubLSymbol $kw7$MUTATE;
    private static final SubLSymbol $kw8$DONE;
    private static final SubLSymbol $sym9$START_KB_STORAGE_LOGGING;
    private static final SubLString $str10$KB_Storage_logging_already_runnin;
    private static final SubLString $str11$KB_Storage_Logger;
    private static final SubLSymbol $sym12$KB_STORAGE_LOGGER_MAIN;
    private static final SubLSymbol $sym13$STOP_KB_STORAGE_LOGGING;
    private static final SubLString $str14$KB_Storage_Logging_Queue;
    private static final SubLSymbol $kw15$OUTPUT;
    private static final SubLString $str16$Unable_to_open__S;
    private static final SubLList $list17;
    private static final SubLString $str18$I;
    private static final SubLString $str19$O;
    private static final SubLString $str20$M;
    private static final SubLString $str21$Malformed_KB_storage_logging_oper;
    private static final SubLString $str22$T_;
    private static final SubLString $str23$_;
    private static final SubLList $list24;
    private static final SubLSymbol $sym25$TAG;
    private static final SubLSymbol $sym26$DERIVE_KB_STORAGE_LOGGING_TAG_FROM_OBJECT;
    private static final SubLSymbol $sym27$WITH_KB_STORAGE_CLIENT_FROM_OBJECT;
    private static final SubLString $str28$n_a;
    private static final SubLSymbol $sym29$_KB_STORAGE_LOGGING_TAG_TABLE_;
    private static final SubLSymbol $sym30$KBEQ;
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 1008L)
    public static SubLObject with_kb_storage_client(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_storage_logging.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tag = (SubLObject)kb_storage_logging.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_storage_logging.$list0);
        tag = current.first();
        current = current.rest();
        if (kb_storage_logging.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)kb_storage_logging.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)kb_storage_logging.$sym2$_KB_STORAGE_CLIENT_, (SubLObject)ConsesLow.list((SubLObject)kb_storage_logging.$sym3$ADD_KB_STORAGE_LOGGING_ADD_TAG, tag))), ConsesLow.append(body, (SubLObject)kb_storage_logging.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_storage_logging.$list0);
        return (SubLObject)kb_storage_logging.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 1247L)
    public static SubLObject add_kb_storage_logging_add_tag(final SubLObject tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_storage_logging.NIL == kb_storage_logging.$kb_storage_client$.getDynamicValue(thread)) {
            return tag;
        }
        if (tag.eql(kb_storage_logging.$kb_storage_client$.getDynamicValue(thread))) {
            return tag;
        }
        if (!kb_storage_logging.$kb_storage_client$.getDynamicValue(thread).isCons()) {
            return (SubLObject)ConsesLow.list(tag, kb_storage_logging.$kb_storage_client$.getDynamicValue(thread));
        }
        if (kb_storage_logging.NIL != subl_promotions.memberP(tag, kb_storage_logging.$kb_storage_client$.getDynamicValue(thread), (SubLObject)kb_storage_logging.UNPROVIDED, (SubLObject)kb_storage_logging.UNPROVIDED)) {
            return kb_storage_logging.$kb_storage_client$.getDynamicValue(thread);
        }
        return (SubLObject)ConsesLow.cons(tag, kb_storage_logging.$kb_storage_client$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 1691L)
    public static SubLObject has_kb_storage_clientP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(kb_storage_logging.$kb_storage_client$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 1997L)
    public static SubLObject kb_storage_logging_p() {
        return process_utilities.ipc_queue_p(kb_storage_logging.$kb_storage_logging_sink$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 2138L)
    public static SubLObject maybe_kb_storage_log_load(final SubLObject suid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_storage_logging.NIL != kb_storage_logging_p()) {
            process_utilities.ipc_enqueue((SubLObject)ConsesLow.list((SubLObject)kb_storage_logging.$kw5$LOAD, suid, kb_storage_logging.$kb_storage_client$.getDynamicValue(thread)), kb_storage_logging.$kb_storage_logging_sink$.getGlobalValue(), (SubLObject)kb_storage_logging.UNPROVIDED);
        }
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 2320L)
    public static SubLObject maybe_kb_storage_log_page_out(final SubLObject suid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_storage_logging.NIL != kb_storage_logging_p()) {
            process_utilities.ipc_enqueue((SubLObject)ConsesLow.list((SubLObject)kb_storage_logging.$kw6$PAGE_OUT, suid, kb_storage_logging.$kb_storage_client$.getDynamicValue(thread)), kb_storage_logging.$kb_storage_logging_sink$.getGlobalValue(), (SubLObject)kb_storage_logging.UNPROVIDED);
        }
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 2509L)
    public static SubLObject maybe_kb_storage_log_mutate(final SubLObject suid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_storage_logging.NIL != kb_storage_logging_p()) {
            process_utilities.ipc_enqueue((SubLObject)ConsesLow.list((SubLObject)kb_storage_logging.$kw7$MUTATE, suid, kb_storage_logging.$kb_storage_client$.getDynamicValue(thread)), kb_storage_logging.$kb_storage_logging_sink$.getGlobalValue(), (SubLObject)kb_storage_logging.UNPROVIDED);
        }
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 2694L)
    public static SubLObject maybe_kb_storage_log_shutdown() {
        if (kb_storage_logging.NIL != kb_storage_logging_p()) {
            process_utilities.ipc_enqueue((SubLObject)ConsesLow.list((SubLObject)kb_storage_logging.$kw8$DONE, (SubLObject)kb_storage_logging.MINUS_ONE_INTEGER, (SubLObject)kb_storage_logging.NIL), kb_storage_logging.$kb_storage_logging_sink$.getGlobalValue(), (SubLObject)kb_storage_logging.UNPROVIDED);
        }
        return (SubLObject)kb_storage_logging.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 2856L)
    public static SubLObject start_kb_storage_logging(final SubLObject log_filename) {
        if (kb_storage_logging.NIL != kb_storage_logging_p()) {
            Errors.error((SubLObject)kb_storage_logging.$str10$KB_Storage_logging_already_runnin);
        }
        return subl_promotions.make_process_with_args((SubLObject)kb_storage_logging.$str11$KB_Storage_Logger, (SubLObject)kb_storage_logging.$sym12$KB_STORAGE_LOGGER_MAIN, (SubLObject)ConsesLow.list(log_filename));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 3148L)
    public static SubLObject stop_kb_storage_logging() {
        return maybe_kb_storage_log_shutdown();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 3234L)
    public static SubLObject kb_storage_logger_main(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_storage_logging.$kb_storage_logging_sink$.setGlobalValue(process_utilities.new_ipc_queue((SubLObject)kb_storage_logging.$str14$KB_Storage_Logging_Queue));
        SubLObject stream = (SubLObject)kb_storage_logging.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kb_storage_logging.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)kb_storage_logging.$kw15$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kb_storage_logging.$str16$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            SubLObject doneP = (SubLObject)kb_storage_logging.NIL;
            while (kb_storage_logging.NIL == doneP) {
                final SubLObject msg = process_utilities.ipc_dequeue(kb_storage_logging.$kb_storage_logging_sink$.getGlobalValue(), (SubLObject)kb_storage_logging.UNPROVIDED);
                possibly_emit_kb_storage_logger_timestamp(s);
                if (msg.isCons() && kb_storage_logging.NIL != list_utilities.lengthE(msg, (SubLObject)kb_storage_logging.THREE_INTEGER, (SubLObject)kb_storage_logging.UNPROVIDED)) {
                    SubLObject current;
                    final SubLObject datum = current = msg;
                    SubLObject op = (SubLObject)kb_storage_logging.NIL;
                    SubLObject suid = (SubLObject)kb_storage_logging.NIL;
                    SubLObject v_context = (SubLObject)kb_storage_logging.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_storage_logging.$list17);
                    op = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_storage_logging.$list17);
                    suid = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_storage_logging.$list17);
                    v_context = current.first();
                    current = current.rest();
                    if (kb_storage_logging.NIL == current) {
                        final SubLObject pcase_var = op;
                        if (pcase_var.eql((SubLObject)kb_storage_logging.$kw8$DONE)) {
                            doneP = (SubLObject)kb_storage_logging.T;
                        }
                        else if (pcase_var.eql((SubLObject)kb_storage_logging.$kw5$LOAD)) {
                            log_kb_storage_message(s, (SubLObject)kb_storage_logging.$str18$I, suid, v_context);
                        }
                        else if (pcase_var.eql((SubLObject)kb_storage_logging.$kw6$PAGE_OUT)) {
                            log_kb_storage_message(s, (SubLObject)kb_storage_logging.$str19$O, suid, v_context);
                        }
                        else if (pcase_var.eql((SubLObject)kb_storage_logging.$kw7$MUTATE)) {
                            log_kb_storage_message(s, (SubLObject)kb_storage_logging.$str20$M, suid, v_context);
                        }
                        else {
                            Errors.warn((SubLObject)kb_storage_logging.$str21$Malformed_KB_storage_logging_oper, op);
                        }
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_storage_logging.$list17);
                    }
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kb_storage_logging.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kb_storage_logging.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        kb_storage_logging.$kb_storage_logging_sink$.setGlobalValue((SubLObject)kb_storage_logging.NIL);
        return (SubLObject)kb_storage_logging.$kw8$DONE;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 4488L)
    public static SubLObject possibly_emit_kb_storage_logger_timestamp(final SubLObject s) {
        if (kb_storage_logging.NIL != Time.time_has_arrivedP(kb_storage_logging.$next_kb_storage_log_time_stamp_message$.getGlobalValue())) {
            streams_high.write_string((SubLObject)kb_storage_logging.$str22$T_, s, (SubLObject)kb_storage_logging.UNPROVIDED, (SubLObject)kb_storage_logging.UNPROVIDED);
            streams_high.write_string(numeric_date_utilities.timestamp((SubLObject)kb_storage_logging.UNPROVIDED, (SubLObject)kb_storage_logging.UNPROVIDED), s, (SubLObject)kb_storage_logging.UNPROVIDED, (SubLObject)kb_storage_logging.UNPROVIDED);
            streams_high.terpri(s);
            kb_storage_logging.$next_kb_storage_log_time_stamp_message$.setGlobalValue(Numbers.add(Time.get_universal_time(), kb_storage_logging.$kb_storage_log_time_stamp_interval$.getGlobalValue()));
        }
        return s;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 4834L)
    public static SubLObject log_kb_storage_message(final SubLObject s, final SubLObject op_token, final SubLObject suid, final SubLObject v_context) {
        streams_high.write_string(string_utilities.to_string(op_token), s, (SubLObject)kb_storage_logging.UNPROVIDED, (SubLObject)kb_storage_logging.UNPROVIDED);
        streams_high.write_string((SubLObject)kb_storage_logging.$str23$_, s, (SubLObject)kb_storage_logging.UNPROVIDED, (SubLObject)kb_storage_logging.UNPROVIDED);
        print_high.princ(suid, s);
        SubLObject cdolist_list_var = v_context;
        SubLObject item = (SubLObject)kb_storage_logging.NIL;
        item = cdolist_list_var.first();
        while (kb_storage_logging.NIL != cdolist_list_var) {
            streams_high.write_string((SubLObject)kb_storage_logging.$str23$_, s, (SubLObject)kb_storage_logging.UNPROVIDED, (SubLObject)kb_storage_logging.UNPROVIDED);
            streams_high.write_string(string_utilities.to_string(item), s, (SubLObject)kb_storage_logging.UNPROVIDED, (SubLObject)kb_storage_logging.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        }
        streams_high.terpri(s);
        return s;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 5125L)
    public static SubLObject with_kb_storage_client_from_object(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_storage_logging.$list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_object = (SubLObject)kb_storage_logging.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kb_storage_logging.$list24);
        v_object = current.first();
        current = current.rest();
        if (kb_storage_logging.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject tag = (SubLObject)kb_storage_logging.$sym25$TAG;
            return (SubLObject)ConsesLow.list((SubLObject)kb_storage_logging.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(tag, (SubLObject)ConsesLow.list((SubLObject)kb_storage_logging.$sym26$DERIVE_KB_STORAGE_LOGGING_TAG_FROM_OBJECT, v_object))), (SubLObject)ConsesLow.listS((SubLObject)kb_storage_logging.$sym4$WITH_KB_STORAGE_CLIENT, (SubLObject)ConsesLow.list(tag), ConsesLow.append(body, (SubLObject)kb_storage_logging.NIL)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kb_storage_logging.$list24);
        return (SubLObject)kb_storage_logging.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 5968L)
    public static SubLObject derive_kb_storage_logging_tag_from_object(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_storage_logging.NIL != has_kb_storage_clientP()) {
            return kb_storage_logging.$kb_storage_client$.getDynamicValue(thread).isCons() ? kb_storage_logging.$kb_storage_client$.getDynamicValue(thread).first() : kb_storage_logging.$kb_storage_client$.getDynamicValue(thread);
        }
        return lookup_kb_storage_logging_tag(v_object, (SubLObject)kb_storage_logging.$str28$n_a);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 6423L)
    public static SubLObject maybe_kb_storage_log_load_in_context(final SubLObject suid, final SubLObject v_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_storage_logging.NIL != kb_storage_logging_p()) {
            final SubLObject tag = derive_kb_storage_logging_tag_from_object(v_context);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(add_kb_storage_logging_add_tag(tag), thread);
                maybe_kb_storage_log_load(suid);
            }
            finally {
                kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        }
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 6631L)
    public static SubLObject maybe_kb_storage_log_page_out_in_context(final SubLObject suid, final SubLObject v_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_storage_logging.NIL != kb_storage_logging_p()) {
            final SubLObject tag = derive_kb_storage_logging_tag_from_object(v_context);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(add_kb_storage_logging_add_tag(tag), thread);
                maybe_kb_storage_log_page_out(suid);
            }
            finally {
                kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        }
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 6847L)
    public static SubLObject maybe_kb_storage_log_mutate_in_context(final SubLObject suid, final SubLObject v_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kb_storage_logging.NIL != kb_storage_logging_p()) {
            final SubLObject tag = derive_kb_storage_logging_tag_from_object(v_context);
            final SubLObject _prev_bind_0 = kb_storage_logging.$kb_storage_client$.currentBinding(thread);
            try {
                kb_storage_logging.$kb_storage_client$.bind(add_kb_storage_logging_add_tag(tag), thread);
                maybe_kb_storage_log_mutate(suid);
            }
            finally {
                kb_storage_logging.$kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        }
        return suid;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 7256L)
    public static SubLObject register_kb_storage_logging_tag(final SubLObject v_object, final SubLObject tag) {
        kb_storage_logging.$kb_storage_logging_tag_table$.setGlobalValue(list_utilities.alist_enter(kb_storage_logging.$kb_storage_logging_tag_table$.getGlobalValue(), v_object, tag, (SubLObject)kb_storage_logging.UNPROVIDED));
        return kb_storage_logging.$kb_storage_logging_tag_table$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kb-storage-logging.lisp", position = 7457L)
    public static SubLObject lookup_kb_storage_logging_tag(final SubLObject v_object, SubLObject v_default) {
        if (v_default == kb_storage_logging.UNPROVIDED) {
            v_default = (SubLObject)kb_storage_logging.NIL;
        }
        return list_utilities.alist_lookup(kb_storage_logging.$kb_storage_logging_tag_table$.getGlobalValue(), v_object, (SubLObject)kb_storage_logging.$sym30$KBEQ, v_default);
    }
    
    public static SubLObject declare_kb_storage_logging_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_storage_logging", "with_kb_storage_client", "WITH-KB-STORAGE-CLIENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "add_kb_storage_logging_add_tag", "ADD-KB-STORAGE-LOGGING-ADD-TAG", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "has_kb_storage_clientP", "HAS-KB-STORAGE-CLIENT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "kb_storage_logging_p", "KB-STORAGE-LOGGING-P", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "maybe_kb_storage_log_load", "MAYBE-KB-STORAGE-LOG-LOAD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "maybe_kb_storage_log_page_out", "MAYBE-KB-STORAGE-LOG-PAGE-OUT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "maybe_kb_storage_log_mutate", "MAYBE-KB-STORAGE-LOG-MUTATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "maybe_kb_storage_log_shutdown", "MAYBE-KB-STORAGE-LOG-SHUTDOWN", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "start_kb_storage_logging", "START-KB-STORAGE-LOGGING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "stop_kb_storage_logging", "STOP-KB-STORAGE-LOGGING", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "kb_storage_logger_main", "KB-STORAGE-LOGGER-MAIN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "possibly_emit_kb_storage_logger_timestamp", "POSSIBLY-EMIT-KB-STORAGE-LOGGER-TIMESTAMP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "log_kb_storage_message", "LOG-KB-STORAGE-MESSAGE", 4, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kb_storage_logging", "with_kb_storage_client_from_object", "WITH-KB-STORAGE-CLIENT-FROM-OBJECT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "derive_kb_storage_logging_tag_from_object", "DERIVE-KB-STORAGE-LOGGING-TAG-FROM-OBJECT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "maybe_kb_storage_log_load_in_context", "MAYBE-KB-STORAGE-LOG-LOAD-IN-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "maybe_kb_storage_log_page_out_in_context", "MAYBE-KB-STORAGE-LOG-PAGE-OUT-IN-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "maybe_kb_storage_log_mutate_in_context", "MAYBE-KB-STORAGE-LOG-MUTATE-IN-CONTEXT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "register_kb_storage_logging_tag", "REGISTER-KB-STORAGE-LOGGING-TAG", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kb_storage_logging", "lookup_kb_storage_logging_tag", "LOOKUP-KB-STORAGE-LOGGING-TAG", 1, 1, false);
        return (SubLObject)kb_storage_logging.NIL;
    }
    
    public static SubLObject init_kb_storage_logging_file() {
        kb_storage_logging.$kb_storage_client$ = SubLFiles.defparameter("*KB-STORAGE-CLIENT*", (SubLObject)kb_storage_logging.NIL);
        kb_storage_logging.$kb_storage_logging_sink$ = SubLFiles.deflexical("*KB-STORAGE-LOGGING-SINK*", (SubLObject)kb_storage_logging.NIL);
        kb_storage_logging.$kb_storage_log_time_stamp_interval$ = SubLFiles.deflexical("*KB-STORAGE-LOG-TIME-STAMP-INTERVAL*", (SubLObject)kb_storage_logging.ONE_INTEGER);
        kb_storage_logging.$next_kb_storage_log_time_stamp_message$ = SubLFiles.deflexical("*NEXT-KB-STORAGE-LOG-TIME-STAMP-MESSAGE*", Time.get_universal_time());
        kb_storage_logging.$kb_storage_logging_tag_table$ = SubLFiles.deflexical("*KB-STORAGE-LOGGING-TAG-TABLE*", (SubLObject)(maybeDefault((SubLObject)kb_storage_logging.$sym29$_KB_STORAGE_LOGGING_TAG_TABLE_, kb_storage_logging.$kb_storage_logging_tag_table$, kb_storage_logging.NIL)));
        return (SubLObject)kb_storage_logging.NIL;
    }
    
    public static SubLObject setup_kb_storage_logging_file() {
        access_macros.register_macro_helper((SubLObject)kb_storage_logging.$sym3$ADD_KB_STORAGE_LOGGING_ADD_TAG, (SubLObject)kb_storage_logging.$sym4$WITH_KB_STORAGE_CLIENT);
        access_macros.register_external_symbol((SubLObject)kb_storage_logging.$sym9$START_KB_STORAGE_LOGGING);
        access_macros.register_external_symbol((SubLObject)kb_storage_logging.$sym13$STOP_KB_STORAGE_LOGGING);
        utilities_macros.note_funcall_helper_function((SubLObject)kb_storage_logging.$sym12$KB_STORAGE_LOGGER_MAIN);
        access_macros.register_macro_helper((SubLObject)kb_storage_logging.$sym26$DERIVE_KB_STORAGE_LOGGING_TAG_FROM_OBJECT, (SubLObject)kb_storage_logging.$sym27$WITH_KB_STORAGE_CLIENT_FROM_OBJECT);
        subl_macro_promotions.declare_defglobal((SubLObject)kb_storage_logging.$sym29$_KB_STORAGE_LOGGING_TAG_TABLE_);
        return (SubLObject)kb_storage_logging.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_kb_storage_logging_file();
    }
    
    @Override
	public void initializeVariables() {
        init_kb_storage_logging_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_kb_storage_logging_file();
    }
    
    static {
        me = (SubLFile)new kb_storage_logging();
        kb_storage_logging.$kb_storage_client$ = null;
        kb_storage_logging.$kb_storage_logging_sink$ = null;
        kb_storage_logging.$kb_storage_log_time_stamp_interval$ = null;
        kb_storage_logging.$next_kb_storage_log_time_stamp_message$ = null;
        kb_storage_logging.$kb_storage_logging_tag_table$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TAG")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym2$_KB_STORAGE_CLIENT_ = SubLObjectFactory.makeSymbol("*KB-STORAGE-CLIENT*");
        $sym3$ADD_KB_STORAGE_LOGGING_ADD_TAG = SubLObjectFactory.makeSymbol("ADD-KB-STORAGE-LOGGING-ADD-TAG");
        $sym4$WITH_KB_STORAGE_CLIENT = SubLObjectFactory.makeSymbol("WITH-KB-STORAGE-CLIENT");
        $kw5$LOAD = SubLObjectFactory.makeKeyword("LOAD");
        $kw6$PAGE_OUT = SubLObjectFactory.makeKeyword("PAGE-OUT");
        $kw7$MUTATE = SubLObjectFactory.makeKeyword("MUTATE");
        $kw8$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym9$START_KB_STORAGE_LOGGING = SubLObjectFactory.makeSymbol("START-KB-STORAGE-LOGGING");
        $str10$KB_Storage_logging_already_runnin = SubLObjectFactory.makeString("KB Storage logging already running.");
        $str11$KB_Storage_Logger = SubLObjectFactory.makeString("KB Storage Logger");
        $sym12$KB_STORAGE_LOGGER_MAIN = SubLObjectFactory.makeSymbol("KB-STORAGE-LOGGER-MAIN");
        $sym13$STOP_KB_STORAGE_LOGGING = SubLObjectFactory.makeSymbol("STOP-KB-STORAGE-LOGGING");
        $str14$KB_Storage_Logging_Queue = SubLObjectFactory.makeString("KB Storage Logging Queue");
        $kw15$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str16$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OP"), (SubLObject)SubLObjectFactory.makeSymbol("SUID"), (SubLObject)SubLObjectFactory.makeSymbol("CONTEXT"));
        $str18$I = SubLObjectFactory.makeString("I");
        $str19$O = SubLObjectFactory.makeString("O");
        $str20$M = SubLObjectFactory.makeString("M");
        $str21$Malformed_KB_storage_logging_oper = SubLObjectFactory.makeString("Malformed KB storage logging operator ~S ignored.~%");
        $str22$T_ = SubLObjectFactory.makeString("T ");
        $str23$_ = SubLObjectFactory.makeString(" ");
        $list24 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OBJECT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym25$TAG = SubLObjectFactory.makeUninternedSymbol("TAG");
        $sym26$DERIVE_KB_STORAGE_LOGGING_TAG_FROM_OBJECT = SubLObjectFactory.makeSymbol("DERIVE-KB-STORAGE-LOGGING-TAG-FROM-OBJECT");
        $sym27$WITH_KB_STORAGE_CLIENT_FROM_OBJECT = SubLObjectFactory.makeSymbol("WITH-KB-STORAGE-CLIENT-FROM-OBJECT");
        $str28$n_a = SubLObjectFactory.makeString("n/a");
        $sym29$_KB_STORAGE_LOGGING_TAG_TABLE_ = SubLObjectFactory.makeSymbol("*KB-STORAGE-LOGGING-TAG-TABLE*");
        $sym30$KBEQ = SubLObjectFactory.makeSymbol("KBEQ");
    }
}

/*

	Total time: 174 ms
	
*/