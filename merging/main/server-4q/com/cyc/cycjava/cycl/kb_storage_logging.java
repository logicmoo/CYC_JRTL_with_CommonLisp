package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.time_has_arrivedP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class kb_storage_logging extends SubLTranslatedFile implements V10 {
    public static final SubLFile me = new kb_storage_logging();

    public static final String myName = "com.cyc.cycjava_2.cycl.kb_storage_logging";




    // deflexical
    public static final SubLSymbol $kb_storage_logging_sink$ = makeSymbol("*KB-STORAGE-LOGGING-SINK*");

    // deflexical
    public static final SubLSymbol $kb_storage_log_time_stamp_interval$ = makeSymbol("*KB-STORAGE-LOG-TIME-STAMP-INTERVAL*");

    // deflexical
    private static final SubLSymbol $next_kb_storage_log_time_stamp_message$ = makeSymbol("*NEXT-KB-STORAGE-LOG-TIME-STAMP-MESSAGE*");



    private static final SubLList $list0 = list(list(makeSymbol("TAG")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLSymbol $kb_storage_client$ = makeSymbol("*KB-STORAGE-CLIENT*");

    private static final SubLSymbol ADD_KB_STORAGE_LOGGING_ADD_TAG = makeSymbol("ADD-KB-STORAGE-LOGGING-ADD-TAG");

    private static final SubLSymbol WITH_KB_STORAGE_CLIENT = makeSymbol("WITH-KB-STORAGE-CLIENT");


    private static final SubLSymbol $PAGE_OUT = makeKeyword("PAGE-OUT");

    private static final SubLSymbol $MUTATE = makeKeyword("MUTATE");



    private static final SubLSymbol START_KB_STORAGE_LOGGING = makeSymbol("START-KB-STORAGE-LOGGING");

    private static final SubLString $str10$KB_Storage_logging_already_runnin = makeString("KB Storage logging already running.");

    private static final SubLString $$$KB_Storage_Logger = makeString("KB Storage Logger");

    private static final SubLSymbol KB_STORAGE_LOGGER_MAIN = makeSymbol("KB-STORAGE-LOGGER-MAIN");

    private static final SubLSymbol STOP_KB_STORAGE_LOGGING = makeSymbol("STOP-KB-STORAGE-LOGGING");

    private static final SubLString $$$KB_Storage_Logging_Queue = makeString("KB Storage Logging Queue");



    private static final SubLString $str16$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLList $list17 = list(makeSymbol("OP"), makeSymbol("SUID"), makeSymbol("CONTEXT"));

    private static final SubLString $$$I = makeString("I");

    private static final SubLString $$$O = makeString("O");

    private static final SubLString $$$M = makeString("M");

    private static final SubLString $str21$Malformed_KB_storage_logging_oper = makeString("Malformed KB storage logging operator ~S ignored.~%");

    private static final SubLString $$$T_ = makeString("T ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLList $list24 = list(list(makeSymbol("OBJECT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym25$TAG = makeUninternedSymbol("TAG");

    private static final SubLSymbol DERIVE_KB_STORAGE_LOGGING_TAG_FROM_OBJECT = makeSymbol("DERIVE-KB-STORAGE-LOGGING-TAG-FROM-OBJECT");

    private static final SubLSymbol WITH_KB_STORAGE_CLIENT_FROM_OBJECT = makeSymbol("WITH-KB-STORAGE-CLIENT-FROM-OBJECT");

    private static final SubLString $str28$n_a = makeString("n/a");

    public static final SubLSymbol $kb_storage_logging_tag_table$ = makeSymbol("*KB-STORAGE-LOGGING-TAG-TABLE*");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    public static SubLObject with_kb_storage_client(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tag = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        tag = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CLET, list(list($kb_storage_client$, list(ADD_KB_STORAGE_LOGGING_ADD_TAG, tag))), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject add_kb_storage_logging_add_tag(final SubLObject tag) {
        final SubLObject dynamicValue = $kb_storage_client$.getValue();// ( SubLProcess.currentSubLThread() );

        if (NIL == dynamicValue) {
            return tag;
        }
        if (tag.eql(dynamicValue)) {
            return tag;
        }
        if (!dynamicValue.isCons()) {
            return list(tag, dynamicValue);
        }
        if (NIL != subl_promotions.memberP(tag, dynamicValue, UNPROVIDED, UNPROVIDED)) {
            return dynamicValue;
        }
        return cons(tag, dynamicValue);
    }

    public static SubLObject add_kb_storage_logging_add_tagOLD(final SubLObject tag) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $kb_storage_client$.getDynamicValue(thread)) {
            return tag;
        }
        if (tag.eql($kb_storage_client$.getDynamicValue(thread))) {
            return tag;
        }
        if (!$kb_storage_client$.getDynamicValue(thread).isCons()) {
            return list(tag, $kb_storage_client$.getDynamicValue(thread));
        }
        if (NIL != subl_promotions.memberP(tag, $kb_storage_client$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return $kb_storage_client$.getDynamicValue(thread);
        }
        return cons(tag, $kb_storage_client$.getDynamicValue(thread));
    }

    public static SubLObject has_kb_storage_clientP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean($kb_storage_client$.getDynamicValue(thread));
    }

    public static SubLObject kb_storage_logging_p() {
        return process_utilities.ipc_queue_p($kb_storage_logging_sink$.getGlobalValue());
    }

    public static SubLObject maybe_kb_storage_log_load(final SubLObject suid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_storage_logging_p()) {
            process_utilities.ipc_enqueue(list($LOAD, suid, $kb_storage_client$.getDynamicValue(thread)), $kb_storage_logging_sink$.getGlobalValue(), UNPROVIDED);
        }
        return suid;
    }

    public static SubLObject maybe_kb_storage_log_page_out(final SubLObject suid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_storage_logging_p()) {
            process_utilities.ipc_enqueue(list($PAGE_OUT, suid, $kb_storage_client$.getDynamicValue(thread)), $kb_storage_logging_sink$.getGlobalValue(), UNPROVIDED);
        }
        return suid;
    }

    public static SubLObject maybe_kb_storage_log_mutate(final SubLObject suid) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_storage_logging_p()) {
            process_utilities.ipc_enqueue(list($MUTATE, suid, $kb_storage_client$.getDynamicValue(thread)), $kb_storage_logging_sink$.getGlobalValue(), UNPROVIDED);
        }
        return suid;
    }

    public static SubLObject maybe_kb_storage_log_shutdown() {
        if (NIL != kb_storage_logging_p()) {
            process_utilities.ipc_enqueue(list($DONE, MINUS_ONE_INTEGER, NIL), $kb_storage_logging_sink$.getGlobalValue(), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject start_kb_storage_logging(final SubLObject log_filename) {
        if (NIL != kb_storage_logging_p()) {
            Errors.error($str10$KB_Storage_logging_already_runnin);
        }
        return subl_promotions.make_process_with_args($$$KB_Storage_Logger, KB_STORAGE_LOGGER_MAIN, list(log_filename));
    }

    public static SubLObject stop_kb_storage_logging() {
        return maybe_kb_storage_log_shutdown();
    }

    public static SubLObject kb_storage_logger_main(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $kb_storage_logging_sink$.setGlobalValue(process_utilities.new_ipc_queue($$$KB_Storage_Logging_Queue));
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str16$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            SubLObject doneP = NIL;
            while (NIL == doneP) {
                final SubLObject msg = process_utilities.ipc_dequeue($kb_storage_logging_sink$.getGlobalValue(), UNPROVIDED);
                possibly_emit_kb_storage_logger_timestamp(s);
                if (msg.isCons() && (NIL != list_utilities.lengthE(msg, THREE_INTEGER, UNPROVIDED))) {
                    SubLObject current;
                    final SubLObject datum = current = msg;
                    SubLObject op = NIL;
                    SubLObject suid = NIL;
                    SubLObject v_context = NIL;
                    destructuring_bind_must_consp(current, datum, $list17);
                    op = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list17);
                    suid = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list17);
                    v_context = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        final SubLObject pcase_var = op;
                        if (pcase_var.eql($DONE)) {
                            doneP = T;
                        } else
                            if (pcase_var.eql($LOAD)) {
                                log_kb_storage_message(s, $$$I, suid, v_context);
                            } else
                                if (pcase_var.eql($PAGE_OUT)) {
                                    log_kb_storage_message(s, $$$O, suid, v_context);
                                } else
                                    if (pcase_var.eql($MUTATE)) {
                                        log_kb_storage_message(s, $$$M, suid, v_context);
                                    } else {
                                        Errors.warn($str21$Malformed_KB_storage_logging_oper, op);
                                    }



                    } else {
                        cdestructuring_bind_error(datum, $list17);
                    }
                }
            } 
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        $kb_storage_logging_sink$.setGlobalValue(NIL);
        return $DONE;
    }

    public static SubLObject possibly_emit_kb_storage_logger_timestamp(final SubLObject s) {
        if (NIL != time_has_arrivedP($next_kb_storage_log_time_stamp_message$.getGlobalValue())) {
            write_string($$$T_, s, UNPROVIDED, UNPROVIDED);
            write_string(numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED), s, UNPROVIDED, UNPROVIDED);
            terpri(s);
            $next_kb_storage_log_time_stamp_message$.setGlobalValue(add(get_universal_time(), $kb_storage_log_time_stamp_interval$.getGlobalValue()));
        }
        return s;
    }

    public static SubLObject log_kb_storage_message(final SubLObject s, final SubLObject op_token, final SubLObject suid, final SubLObject v_context) {
        write_string(string_utilities.to_string(op_token), s, UNPROVIDED, UNPROVIDED);
        write_string($$$_, s, UNPROVIDED, UNPROVIDED);
        princ(suid, s);
        SubLObject cdolist_list_var = v_context;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_string($$$_, s, UNPROVIDED, UNPROVIDED);
            write_string(string_utilities.to_string(item), s, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        terpri(s);
        return s;
    }

    public static SubLObject with_kb_storage_client_from_object(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list24);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_object = NIL;
        destructuring_bind_must_consp(current, datum, $list24);
        v_object = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject tag = $sym25$TAG;
            return list(CLET, list(list(tag, list(DERIVE_KB_STORAGE_LOGGING_TAG_FROM_OBJECT, v_object))), listS(WITH_KB_STORAGE_CLIENT, list(tag), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list24);
        return NIL;
    }

    public static SubLObject derive_kb_storage_logging_tag_from_object(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != has_kb_storage_clientP()) {
            return $kb_storage_client$.getDynamicValue(thread).isCons() ? $kb_storage_client$.getDynamicValue(thread).first() : $kb_storage_client$.getDynamicValue(thread);
        }
        return lookup_kb_storage_logging_tag(v_object, $str28$n_a);
    }

    public static SubLObject maybe_kb_storage_log_load_in_context(final SubLObject suid, final SubLObject v_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_storage_logging_p()) {
            final SubLObject tag = derive_kb_storage_logging_tag_from_object(v_context);
            final SubLObject _prev_bind_0 = $kb_storage_client$.currentBinding(thread);
            try {
                $kb_storage_client$.bind(add_kb_storage_logging_add_tag(tag), thread);
                maybe_kb_storage_log_load(suid);
            } finally {
                $kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        }
        return suid;
    }

    public static SubLObject maybe_kb_storage_log_page_out_in_context(final SubLObject suid, final SubLObject v_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_storage_logging_p()) {
            final SubLObject tag = derive_kb_storage_logging_tag_from_object(v_context);
            final SubLObject _prev_bind_0 = $kb_storage_client$.currentBinding(thread);
            try {
                $kb_storage_client$.bind(add_kb_storage_logging_add_tag(tag), thread);
                maybe_kb_storage_log_page_out(suid);
            } finally {
                $kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        }
        return suid;
    }

    public static SubLObject maybe_kb_storage_log_mutate_in_context(final SubLObject suid, final SubLObject v_context) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_storage_logging_p()) {
            final SubLObject tag = derive_kb_storage_logging_tag_from_object(v_context);
            final SubLObject _prev_bind_0 = $kb_storage_client$.currentBinding(thread);
            try {
                $kb_storage_client$.bind(add_kb_storage_logging_add_tag(tag), thread);
                maybe_kb_storage_log_mutate(suid);
            } finally {
                $kb_storage_client$.rebind(_prev_bind_0, thread);
            }
        }
        return suid;
    }

    public static SubLObject register_kb_storage_logging_tag(final SubLObject v_object, final SubLObject tag) {
        $kb_storage_logging_tag_table$.setGlobalValue(list_utilities.alist_enter($kb_storage_logging_tag_table$.getGlobalValue(), v_object, tag, UNPROVIDED));
        return $kb_storage_logging_tag_table$.getGlobalValue();
    }

    public static SubLObject lookup_kb_storage_logging_tag(final SubLObject v_object, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return list_utilities.alist_lookup($kb_storage_logging_tag_table$.getGlobalValue(), v_object, KBEQ, v_default);
    }

    public static SubLObject declare_kb_storage_logging_file() {
        declareMacro("with_kb_storage_client", "WITH-KB-STORAGE-CLIENT");
        declareFunction("add_kb_storage_logging_add_tag", "ADD-KB-STORAGE-LOGGING-ADD-TAG", 1, 0, false);
        declareFunction("has_kb_storage_clientP", "HAS-KB-STORAGE-CLIENT?", 0, 0, false);
        declareFunction("kb_storage_logging_p", "KB-STORAGE-LOGGING-P", 0, 0, false);
        declareFunction("maybe_kb_storage_log_load", "MAYBE-KB-STORAGE-LOG-LOAD", 1, 0, false);
        declareFunction("maybe_kb_storage_log_page_out", "MAYBE-KB-STORAGE-LOG-PAGE-OUT", 1, 0, false);
        declareFunction("maybe_kb_storage_log_mutate", "MAYBE-KB-STORAGE-LOG-MUTATE", 1, 0, false);
        declareFunction("maybe_kb_storage_log_shutdown", "MAYBE-KB-STORAGE-LOG-SHUTDOWN", 0, 0, false);
        declareFunction("start_kb_storage_logging", "START-KB-STORAGE-LOGGING", 1, 0, false);
        declareFunction("stop_kb_storage_logging", "STOP-KB-STORAGE-LOGGING", 0, 0, false);
        declareFunction("kb_storage_logger_main", "KB-STORAGE-LOGGER-MAIN", 1, 0, false);
        declareFunction("possibly_emit_kb_storage_logger_timestamp", "POSSIBLY-EMIT-KB-STORAGE-LOGGER-TIMESTAMP", 1, 0, false);
        declareFunction("log_kb_storage_message", "LOG-KB-STORAGE-MESSAGE", 4, 0, false);
        declareMacro("with_kb_storage_client_from_object", "WITH-KB-STORAGE-CLIENT-FROM-OBJECT");
        declareFunction("derive_kb_storage_logging_tag_from_object", "DERIVE-KB-STORAGE-LOGGING-TAG-FROM-OBJECT", 1, 0, false);
        declareFunction("maybe_kb_storage_log_load_in_context", "MAYBE-KB-STORAGE-LOG-LOAD-IN-CONTEXT", 2, 0, false);
        declareFunction("maybe_kb_storage_log_page_out_in_context", "MAYBE-KB-STORAGE-LOG-PAGE-OUT-IN-CONTEXT", 2, 0, false);
        declareFunction("maybe_kb_storage_log_mutate_in_context", "MAYBE-KB-STORAGE-LOG-MUTATE-IN-CONTEXT", 2, 0, false);
        declareFunction("register_kb_storage_logging_tag", "REGISTER-KB-STORAGE-LOGGING-TAG", 2, 0, false);
        declareFunction("lookup_kb_storage_logging_tag", "LOOKUP-KB-STORAGE-LOGGING-TAG", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_kb_storage_logging_file() {
        defparameter("*KB-STORAGE-CLIENT*", NIL);
        deflexical("*KB-STORAGE-LOGGING-SINK*", NIL);
        deflexical("*KB-STORAGE-LOG-TIME-STAMP-INTERVAL*", ONE_INTEGER);
        deflexical("*NEXT-KB-STORAGE-LOG-TIME-STAMP-MESSAGE*", get_universal_time());
        deflexical("*KB-STORAGE-LOGGING-TAG-TABLE*", SubLTrampolineFile.maybeDefault($kb_storage_logging_tag_table$, $kb_storage_logging_tag_table$, NIL));
        return NIL;
    }

    public static SubLObject setup_kb_storage_logging_file() {
        register_macro_helper(ADD_KB_STORAGE_LOGGING_ADD_TAG, WITH_KB_STORAGE_CLIENT);
        register_external_symbol(START_KB_STORAGE_LOGGING);
        register_external_symbol(STOP_KB_STORAGE_LOGGING);
        note_funcall_helper_function(KB_STORAGE_LOGGER_MAIN);
        register_macro_helper(DERIVE_KB_STORAGE_LOGGING_TAG_FROM_OBJECT, WITH_KB_STORAGE_CLIENT_FROM_OBJECT);
        declare_defglobal($kb_storage_logging_tag_table$);
        return NIL;
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

    
}

/**
 * Total time: 174 ms
 */
