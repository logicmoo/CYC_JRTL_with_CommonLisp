package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class hl_interface_infrastructure extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.hl_interface_infrastructure";
    public static final String myFingerPrint = "24845c486a94e15dde43c94c9b125bf322142bfaa9e5292d1ade95dfcc360fe5";
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 996L)
    public static SubLSymbol $hl_store_modification_and_access$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 1524L)
    public static SubLSymbol $override_hl_store_remote_accessP$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3201L)
    private static SubLSymbol $remote_hl_store_image$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3668L)
    private static SubLSymbol $remote_hl_store_connection_pool$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3765L)
    private static SubLSymbol $remote_hl_store_connection_pool_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3880L)
    private static SubLSymbol $remote_hl_store_connection_pool_max_size$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 9806L)
    public static SubLSymbol $hl_store_error_handling_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10984L)
    private static SubLSymbol $hl_store_iterators$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11129L)
    private static SubLSymbol $next_hl_store_iterator_id$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11814L)
    private static SubLSymbol $hl_store_iterator_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 16233L)
    public static SubLSymbol $hl_transcript_stream$;
    private static final SubLSymbol $kw0$LOCAL_LOCAL;
    private static final SubLSymbol $kw1$BOTH_LOCAL;
    private static final SubLSymbol $kw2$BOTH_REMOTE;
    private static final SubLSymbol $kw3$REMOTE_REMOTE;
    private static final SubLSymbol $kw4$NONE_LOCAL;
    private static final SubLSymbol $sym5$CLET;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$_REMOTE_HL_STORE_IMAGE_;
    private static final SubLSymbol $sym9$_REMOTE_HL_STORE_CONNECTION_POOL_;
    private static final SubLString $str10$Remote_HL_Store_Connection_Pool_L;
    private static final SubLString $str11$Could_not_open_a_connection_to__s;
    private static final SubLSymbol $kw12$CFASL;
    private static final SubLSymbol $sym13$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLList $list14;
    private static final SubLSymbol $sym15$DEFINE_API;
    private static final SubLSymbol $sym16$PROGN;
    private static final SubLList $list17;
    private static final SubLSymbol $sym18$NOTE_HL_MODIFIER_INVOCATION;
    private static final SubLSymbol $sym19$QUOTE;
    private static final SubLSymbol $sym20$PIF;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$WITHIN_HL_MODIFICATION;
    private static final SubLList $list23;
    private static final SubLSymbol $sym24$LIST;
    private static final SubLList $list25;
    private static final SubLSymbol $sym26$RESULT;
    private static final SubLSymbol $sym27$PWHEN;
    private static final SubLList $list28;
    private static final SubLSymbol $sym29$CSETQ;
    private static final SubLSymbol $sym30$HL_STORE_REMOTE_EVAL;
    private static final SubLList $list31;
    private static final SubLSymbol $sym32$OVERRIDE_REMOTE_HL_STORE_ACCESS;
    private static final SubLSymbol $sym33$RET;
    private static final SubLSymbol $sym34$DEFINE_HL_MODIFIER_PREAMBLE;
    private static final SubLList $list35;
    private static final SubLSymbol $sym36$DEFINE_HL_MODIFIER_POSTAMBLE;
    private static final SubLList $list37;
    private static final SubLList $list38;
    private static final SubLSymbol $kw39$BREAK;
    private static final SubLSymbol $sym40$STRINGP;
    private static final SubLSymbol $kw41$IGNORE;
    private static final SubLSymbol $kw42$WARN;
    private static final SubLList $list43;
    private static final SubLSymbol $sym44$CHECK_TYPE;
    private static final SubLList $list45;
    private static final SubLSymbol $sym46$_HL_STORE_ERROR_HANDLING_MODE_;
    private static final SubLSymbol $sym47$WITH_HL_STORE_ERROR_HANDLING_MODE;
    private static final SubLList $list48;
    private static final SubLSymbol $sym49$_HL_STORE_ITERATORS_;
    private static final SubLSymbol $sym50$_NEXT_HL_STORE_ITERATOR_ID_;
    private static final SubLString $str51$HL_Store_Iterator_Lock;
    private static final SubLSymbol $sym52$LISTP;
    private static final SubLSymbol $sym53$POSITIVE_INTEGER_P;
    private static final SubLSymbol $sym54$NEW_HL_STORE_ITERATOR_INT;
    private static final SubLSymbol $sym55$HL_STORE_ITERATOR_DONE_;
    private static final SubLSymbol $sym56$HL_STORE_ITERATOR_NEXT;
    private static final SubLSymbol $sym57$HL_STORE_ITERATOR_DESTROY;
    private static final SubLSymbol $sym58$HL_STORE_ITERATOR_DONE_INT;
    private static final SubLSymbol $sym59$HL_STORE_ITERATOR_NEXT_INT;
    private static final SubLList $list60;
    private static final SubLSymbol $sym61$HL_STORE_ITERATOR_DESTROY_INT;
    private static final SubLSymbol $sym62$HL_STORE_BUFFERED_ITERATOR_DONE_;
    private static final SubLSymbol $sym63$HL_STORE_BUFFERED_ITERATOR_NEXT;
    private static final SubLSymbol $sym64$HL_STORE_BUFFERED_ITERATOR_DESTROY;
    private static final SubLList $list65;
    private static final SubLSymbol $sym66$HL_STORE_ITERATOR_NEXT_N_INT;
    private static final SubLSymbol $sym67$_HL_TRANSCRIPT_STREAM_;
    private static final SubLSymbol $kw68$OUTPUT;
    private static final SubLSymbol $kw69$UNPROVIDED;
    private static final SubLSymbol $kw70$INPUT;
    private static final SubLString $str71$Unable_to_open__S;
    private static final SubLSymbol $kw72$EOF;
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 1708L)
    public static SubLObject hl_modify_localP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_interface_infrastructure.$kw0$LOCAL_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread) || hl_interface_infrastructure.$kw1$BOTH_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread) || hl_interface_infrastructure.$kw2$BOTH_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 1930L)
    public static SubLObject hl_modify_remoteP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_interface_infrastructure.$kw3$REMOTE_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread) || hl_interface_infrastructure.$kw1$BOTH_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread) || hl_interface_infrastructure.$kw2$BOTH_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 2155L)
    public static SubLObject hl_modify_anywhereP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_interface_infrastructure.$kw0$LOCAL_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread) || hl_interface_infrastructure.$kw3$REMOTE_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread) || hl_interface_infrastructure.$kw1$BOTH_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread) || hl_interface_infrastructure.$kw2$BOTH_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 2440L)
    public static SubLObject hl_access_localP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_interface_infrastructure.NIL != hl_interface_infrastructure.$override_hl_store_remote_accessP$.getDynamicValue(thread) || hl_interface_infrastructure.$kw0$LOCAL_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread) || hl_interface_infrastructure.$kw1$BOTH_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread) || hl_interface_infrastructure.$kw4$NONE_LOCAL == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 2701L)
    public static SubLObject hl_access_remoteP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_interface_infrastructure.NIL == hl_interface_infrastructure.$override_hl_store_remote_accessP$.getDynamicValue(thread) && (hl_interface_infrastructure.$kw3$REMOTE_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread) || hl_interface_infrastructure.$kw2$BOTH_REMOTE == hl_interface_infrastructure.$hl_store_modification_and_access$.getDynamicValue(thread)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 2923L)
    public static SubLObject override_remote_hl_store_access(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym5$CLET, (SubLObject)hl_interface_infrastructure.$list6, ConsesLow.append(body, (SubLObject)hl_interface_infrastructure.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3058L)
    public static SubLObject do_not_override_remote_hl_store_access(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym5$CLET, (SubLObject)hl_interface_infrastructure.$list7, ConsesLow.append(body, (SubLObject)hl_interface_infrastructure.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3379L)
    public static SubLObject set_remote_hl_store_image(final SubLObject machine, final SubLObject port, final SubLObject protocol) {
        hl_interface_infrastructure.$remote_hl_store_image$.setGlobalValue(remote_image.new_remote_image(machine, port, protocol));
        return remote_image.remote_image_p(hl_interface_infrastructure.$remote_hl_store_image$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3571L)
    public static SubLObject unset_remote_hl_store_image() {
        hl_interface_infrastructure.$remote_hl_store_image$.setGlobalValue((SubLObject)hl_interface_infrastructure.NIL);
        return (SubLObject)hl_interface_infrastructure.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 3946L)
    public static SubLObject clear_remote_hl_store_connection_pool() {
        for (SubLObject q = hl_interface_infrastructure.$remote_hl_store_connection_pool$.getGlobalValue(), done_var = queues.queue_empty_p(q); hl_interface_infrastructure.NIL == done_var; done_var = queues.queue_empty_p(q)) {
            final SubLObject connection = queues.dequeue(q);
            remote_image.close_remote_image_connection(connection);
        }
        return (SubLObject)hl_interface_infrastructure.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 4130L)
    public static SubLObject create_remote_hl_store_connection() {
        final SubLObject connection = remote_image.new_remote_image_connection(hl_interface_infrastructure.$remote_hl_store_image$.getGlobalValue());
        if (hl_interface_infrastructure.NIL != remote_image.remote_image_connection_p(connection)) {
            remote_image.open_remote_image_connection(connection);
            return connection;
        }
        return Errors.error((SubLObject)hl_interface_infrastructure.$str11$Could_not_open_a_connection_to__s, hl_interface_infrastructure.$remote_hl_store_image$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 4493L)
    public static SubLObject release_hl_store_connection(final SubLObject connection) {
        SubLObject release = (SubLObject)hl_interface_infrastructure.NIL;
        try {
            release = Locks.seize_lock(hl_interface_infrastructure.$remote_hl_store_connection_pool_lock$.getGlobalValue());
            if (queues.queue_size(hl_interface_infrastructure.$remote_hl_store_connection_pool$.getGlobalValue()).numGE(hl_interface_infrastructure.$remote_hl_store_connection_pool_max_size$.getGlobalValue())) {
                remote_image.close_remote_image_connection(connection);
            }
            else {
                queues.enqueue(connection, hl_interface_infrastructure.$remote_hl_store_connection_pool$.getGlobalValue());
            }
        }
        finally {
            if (hl_interface_infrastructure.NIL != release) {
                Locks.release_lock(hl_interface_infrastructure.$remote_hl_store_connection_pool_lock$.getGlobalValue());
            }
        }
        return (SubLObject)hl_interface_infrastructure.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 4900L)
    public static SubLObject open_remote_hl_store_connection_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(hl_interface_infrastructure.NIL != remote_image.remote_image_connection_p(v_object) && hl_interface_infrastructure.NIL != remote_image.remote_image_connection_openP(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 5056L)
    public static SubLObject get_free_hl_store_connection() {
        SubLObject connection = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject release = (SubLObject)hl_interface_infrastructure.NIL;
        try {
            release = Locks.seize_lock(hl_interface_infrastructure.$remote_hl_store_connection_pool_lock$.getGlobalValue());
            for (SubLObject q = hl_interface_infrastructure.$remote_hl_store_connection_pool$.getGlobalValue(), done_var = (SubLObject)SubLObjectFactory.makeBoolean(hl_interface_infrastructure.NIL != connection || hl_interface_infrastructure.NIL != queues.queue_empty_p(q)); hl_interface_infrastructure.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(hl_interface_infrastructure.NIL != connection || hl_interface_infrastructure.NIL != queues.queue_empty_p(q))) {
                final SubLObject candidate = queues.dequeue(q);
                if (hl_interface_infrastructure.NIL != open_remote_hl_store_connection_p(candidate)) {
                    connection = candidate;
                }
            }
            if (hl_interface_infrastructure.NIL == connection) {
                connection = create_remote_hl_store_connection();
            }
        }
        finally {
            if (hl_interface_infrastructure.NIL != release) {
                Locks.release_lock(hl_interface_infrastructure.$remote_hl_store_connection_pool_lock$.getGlobalValue());
            }
        }
        return connection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 5612L)
    public static SubLObject initialize_remote_hl_store_connections() {
        return clear_remote_hl_store_connection_pool();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 5792L)
    public static SubLObject declare_remote_hl_store_image(final SubLObject machine, final SubLObject port, SubLObject protocol) {
        if (protocol == hl_interface_infrastructure.UNPROVIDED) {
            protocol = (SubLObject)hl_interface_infrastructure.$kw12$CFASL;
        }
        set_remote_hl_store_image(machine, port, protocol);
        clear_remote_hl_store_connection_pool();
        return (SubLObject)hl_interface_infrastructure.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 5989L)
    public static SubLObject undeclare_remote_hl_store_image() {
        unset_remote_hl_store_image();
        clear_remote_hl_store_connection_pool();
        return (SubLObject)hl_interface_infrastructure.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 6128L)
    public static SubLObject hl_store_remote_eval(final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject error_message = (SubLObject)hl_interface_infrastructure.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)hl_interface_infrastructure.$sym13$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject connection = get_free_hl_store_connection();
                    final SubLObject _prev_bind_0_$1 = cfasl.$cfasl_common_symbols$.currentBinding(thread);
                    try {
                        cfasl.$cfasl_common_symbols$.bind((SubLObject)hl_interface_infrastructure.NIL, thread);
                        cfasl.cfasl_set_common_symbols((SubLObject)hl_interface_infrastructure.NIL);
                        final SubLObject _prev_bind_0_$2 = api_control_vars.$cfasl_constant_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = api_control_vars.$cfasl_nart_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = api_control_vars.$cfasl_assertion_handle_lookup_func$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = cfasl.$cfasl_channel_externalizedP$.currentBinding(thread);
                        try {
                            api_control_vars.$cfasl_constant_handle_lookup_func$.bind((SubLObject)hl_interface_infrastructure.NIL, thread);
                            api_control_vars.$cfasl_nart_handle_lookup_func$.bind((SubLObject)hl_interface_infrastructure.NIL, thread);
                            api_control_vars.$cfasl_assertion_handle_lookup_func$.bind((SubLObject)hl_interface_infrastructure.NIL, thread);
                            cfasl.$cfasl_channel_externalizedP$.bind((SubLObject)hl_interface_infrastructure.NIL, thread);
                            SubLObject success_var = (SubLObject)hl_interface_infrastructure.NIL;
                            try {
                                result = remote_image.remote_image_connection_eval(connection, form);
                                release_hl_store_connection(connection);
                                success_var = (SubLObject)hl_interface_infrastructure.T;
                            }
                            finally {
                                final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_interface_infrastructure.T, thread);
                                    final SubLObject _values = Values.getValuesAsVector();
                                    if (hl_interface_infrastructure.NIL == success_var) {
                                        remote_image.close_remote_image_connection(connection);
                                    }
                                    Values.restoreValuesFromVector(_values);
                                }
                                finally {
                                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                        }
                        finally {
                            cfasl.$cfasl_channel_externalizedP$.rebind(_prev_bind_4, thread);
                            api_control_vars.$cfasl_assertion_handle_lookup_func$.rebind(_prev_bind_3, thread);
                            api_control_vars.$cfasl_nart_handle_lookup_func$.rebind(_prev_bind_2, thread);
                            api_control_vars.$cfasl_constant_handle_lookup_func$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                    finally {
                        cfasl.$cfasl_common_symbols$.rebind(_prev_bind_0_$1, thread);
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)hl_interface_infrastructure.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        if (hl_interface_infrastructure.NIL != error_message) {
            hl_store_error(error_message);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 6865L)
    public static SubLObject define_hl_creator(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject arglist = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject documentation_string = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject type_declarations = (SubLObject)hl_interface_infrastructure.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        documentation_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        type_declarations = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject formal_args = memoization_state.define_formal_args(arglist);
        return (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym15$DEFINE_API, name, arglist, documentation_string, type_declarations, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym16$PROGN, (SubLObject)hl_interface_infrastructure.$list17, (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym18$NOTE_HL_MODIFIER_INVOCATION, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym19$QUOTE, name), ConsesLow.append(formal_args, (SubLObject)hl_interface_infrastructure.NIL)), (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym20$PIF, (SubLObject)hl_interface_infrastructure.$list21, reader.bq_cons((SubLObject)hl_interface_infrastructure.$sym22$WITHIN_HL_MODIFICATION, ConsesLow.append(body, (SubLObject)hl_interface_infrastructure.NIL)), (SubLObject)hl_interface_infrastructure.$list23)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 7512L)
    public static SubLObject define_hl_modifier(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject arglist = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject documentation_string = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject type_declarations = (SubLObject)hl_interface_infrastructure.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        documentation_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        type_declarations = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject formal_args = memoization_state.define_formal_args(arglist);
        SubLObject eval_args = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject cdolist_list_var = formal_args;
        SubLObject formal_arg = (SubLObject)hl_interface_infrastructure.NIL;
        formal_arg = cdolist_list_var.first();
        while (hl_interface_infrastructure.NIL != cdolist_list_var) {
            final SubLObject eval_arg = (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym24$LIST, (SubLObject)hl_interface_infrastructure.$list25, formal_arg);
            eval_args = (SubLObject)ConsesLow.cons(eval_arg, eval_args);
            cdolist_list_var = cdolist_list_var.rest();
            formal_arg = cdolist_list_var.first();
        }
        eval_args = Sequences.nreverse(eval_args);
        final SubLObject result = (SubLObject)hl_interface_infrastructure.$sym26$RESULT;
        return (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym15$DEFINE_API, name, arglist, documentation_string, type_declarations, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym5$CLET, (SubLObject)ConsesLow.list(result), (SubLObject)hl_interface_infrastructure.$list17, (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym18$NOTE_HL_MODIFIER_INVOCATION, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym19$QUOTE, name), ConsesLow.append(formal_args, (SubLObject)hl_interface_infrastructure.NIL)), (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym27$PWHEN, (SubLObject)hl_interface_infrastructure.$list28, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym29$CSETQ, result, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym30$HL_STORE_REMOTE_EVAL, (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym24$LIST, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym19$QUOTE, name), ConsesLow.append(eval_args, (SubLObject)hl_interface_infrastructure.NIL))))), (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym20$PIF, (SubLObject)hl_interface_infrastructure.$list31, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym32$OVERRIDE_REMOTE_HL_STORE_ACCESS, reader.bq_cons((SubLObject)hl_interface_infrastructure.$sym22$WITHIN_HL_MODIFICATION, ConsesLow.append(body, (SubLObject)hl_interface_infrastructure.NIL))), (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym33$RET, result))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 8594L)
    public static SubLObject define_hl_modifier_preamble() {
        memoization_state.clear_hl_store_dependent_caches();
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 8823L)
    public static SubLObject define_hl_modifier_postamble() {
        memoization_state.clear_hl_store_dependent_caches();
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 9053L)
    public static SubLObject define_hl_accessor(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject name = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject arglist = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject documentation_string = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject type_declarations = (SubLObject)hl_interface_infrastructure.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        name = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        arglist = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        documentation_string = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list14);
        type_declarations = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject formal_args = memoization_state.define_formal_args(arglist);
        SubLObject eval_args = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject cdolist_list_var = formal_args;
        SubLObject formal_arg = (SubLObject)hl_interface_infrastructure.NIL;
        formal_arg = cdolist_list_var.first();
        while (hl_interface_infrastructure.NIL != cdolist_list_var) {
            final SubLObject eval_arg = (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym24$LIST, (SubLObject)hl_interface_infrastructure.$list25, formal_arg);
            eval_args = (SubLObject)ConsesLow.cons(eval_arg, eval_args);
            cdolist_list_var = cdolist_list_var.rest();
            formal_arg = cdolist_list_var.first();
        }
        eval_args = Sequences.nreverse(eval_args);
        return (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym15$DEFINE_API, name, arglist, documentation_string, type_declarations, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym20$PIF, (SubLObject)hl_interface_infrastructure.$list37, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym33$RET, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym30$HL_STORE_REMOTE_EVAL, (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym24$LIST, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym19$QUOTE, name), ConsesLow.append(eval_args, (SubLObject)hl_interface_infrastructure.NIL)))), reader.bq_cons((SubLObject)hl_interface_infrastructure.$sym16$PROGN, ConsesLow.append(body, (SubLObject)hl_interface_infrastructure.NIL))));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 9886L)
    public static SubLObject valid_hl_store_error_handling_mode_p(final SubLObject mode) {
        return subl_promotions.memberP(mode, (SubLObject)hl_interface_infrastructure.$list38, Symbols.symbol_function((SubLObject)hl_interface_infrastructure.EQ), (SubLObject)hl_interface_infrastructure.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10002L)
    public static SubLObject hl_store_error_handling_mode() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((hl_interface_infrastructure.NIL != hl_interface_infrastructure.$hl_store_error_handling_mode$.getDynamicValue(thread)) ? hl_interface_infrastructure.$hl_store_error_handling_mode$.getDynamicValue(thread) : hl_interface_infrastructure.$kw39$BREAK);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10109L)
    public static SubLObject hl_store_error(final SubLObject error_message) {
        assert hl_interface_infrastructure.NIL != Types.stringp(error_message) : error_message;
        final SubLObject pcase_var = hl_store_error_handling_mode();
        if (pcase_var.eql((SubLObject)hl_interface_infrastructure.$kw41$IGNORE)) {
            return (SubLObject)hl_interface_infrastructure.NIL;
        }
        if (pcase_var.eql((SubLObject)hl_interface_infrastructure.$kw42$WARN)) {
            return Errors.warn(error_message);
        }
        if (pcase_var.eql((SubLObject)hl_interface_infrastructure.$kw39$BREAK)) {
            return Errors.error(error_message);
        }
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10355L)
    public static SubLObject with_hl_store_error_handling_mode(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mode = (SubLObject)hl_interface_infrastructure.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list43);
        mode = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym16$PROGN, (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym44$CHECK_TYPE, mode, (SubLObject)hl_interface_infrastructure.$list45), (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym5$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym46$_HL_STORE_ERROR_HANDLING_MODE_, mode)), ConsesLow.append(body, (SubLObject)hl_interface_infrastructure.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10569L)
    public static SubLObject with_hl_store_ignore_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym47$WITH_HL_STORE_ERROR_HANDLING_MODE, (SubLObject)hl_interface_infrastructure.$kw41$IGNORE, ConsesLow.append(body, (SubLObject)hl_interface_infrastructure.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10695L)
    public static SubLObject with_hl_store_warn_on_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym47$WITH_HL_STORE_ERROR_HANDLING_MODE, (SubLObject)hl_interface_infrastructure.$kw42$WARN, ConsesLow.append(body, (SubLObject)hl_interface_infrastructure.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 10820L)
    public static SubLObject with_hl_store_break_on_errors(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym5$CLET, (SubLObject)hl_interface_infrastructure.$list48, (SubLObject)ConsesLow.listS((SubLObject)hl_interface_infrastructure.$sym47$WITH_HL_STORE_ERROR_HANDLING_MODE, (SubLObject)hl_interface_infrastructure.$kw39$BREAK, ConsesLow.append(body, (SubLObject)hl_interface_infrastructure.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11179L)
    public static SubLObject reset_next_hl_store_iterator_id() {
        hl_interface_infrastructure.$next_hl_store_iterator_id$.setGlobalValue((SubLObject)hl_interface_infrastructure.ZERO_INTEGER);
        return hl_interface_infrastructure.$next_hl_store_iterator_id$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11310L)
    public static SubLObject candidate_next_hl_store_iterator_id() {
        final SubLObject next_id = hl_interface_infrastructure.$next_hl_store_iterator_id$.getGlobalValue();
        hl_interface_infrastructure.$next_hl_store_iterator_id$.setGlobalValue(Numbers.add(hl_interface_infrastructure.$next_hl_store_iterator_id$.getGlobalValue(), (SubLObject)hl_interface_infrastructure.ONE_INTEGER));
        if (hl_interface_infrastructure.$next_hl_store_iterator_id$.getGlobalValue().numE(Numbers.$most_positive_fixnum$.getGlobalValue())) {
            hl_interface_infrastructure.$next_hl_store_iterator_id$.setGlobalValue((SubLObject)hl_interface_infrastructure.ZERO_INTEGER);
        }
        return next_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11584L)
    public static SubLObject new_hl_store_iterator_id() {
        SubLObject next_id;
        for (next_id = candidate_next_hl_store_iterator_id(); hl_interface_infrastructure.NIL != lookup_hl_store_iterator(next_id); next_id = candidate_next_hl_store_iterator_id()) {}
        return next_id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 11899L)
    public static SubLObject note_hl_store_iterator(final SubLObject iterator) {
        SubLObject id = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject release = (SubLObject)hl_interface_infrastructure.NIL;
        try {
            release = Locks.seize_lock(hl_interface_infrastructure.$hl_store_iterator_lock$.getGlobalValue());
            id = new_hl_store_iterator_id();
            dictionary.dictionary_enter(hl_interface_infrastructure.$hl_store_iterators$.getGlobalValue(), id, iterator);
        }
        finally {
            if (hl_interface_infrastructure.NIL != release) {
                Locks.release_lock(hl_interface_infrastructure.$hl_store_iterator_lock$.getGlobalValue());
            }
        }
        return id;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12128L)
    public static SubLObject lookup_hl_store_iterator(final SubLObject id) {
        return dictionary.dictionary_lookup_without_values(hl_interface_infrastructure.$hl_store_iterators$.getGlobalValue(), id, (SubLObject)hl_interface_infrastructure.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12243L)
    public static SubLObject unnote_hl_store_iterator(final SubLObject id) {
        SubLObject result = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject release = (SubLObject)hl_interface_infrastructure.NIL;
        try {
            release = Locks.seize_lock(hl_interface_infrastructure.$hl_store_iterator_lock$.getGlobalValue());
            result = dictionary.dictionary_remove(hl_interface_infrastructure.$hl_store_iterators$.getGlobalValue(), id);
        }
        finally {
            if (hl_interface_infrastructure.NIL != release) {
                Locks.release_lock(hl_interface_infrastructure.$hl_store_iterator_lock$.getGlobalValue());
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12439L)
    public static SubLObject new_hl_store_iterator_int(final SubLObject form) {
        final SubLObject iterator = Eval.eval(form);
        return (SubLObject)((hl_interface_infrastructure.NIL != iteration.iterator_p(iterator)) ? note_hl_store_iterator(iterator) : hl_interface_infrastructure.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12605L)
    public static SubLObject hl_store_iterator_next_int(final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = lookup_hl_store_iterator(id);
        if (hl_interface_infrastructure.NIL != iterator) {
            thread.resetMultipleValues();
            final SubLObject next = iteration.iteration_next(iterator);
            final SubLObject validP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return (SubLObject)ConsesLow.list(next, validP);
        }
        return (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.NIL, (SubLObject)hl_interface_infrastructure.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 12851L)
    public static SubLObject hl_store_iterator_next_n_int(final SubLObject id, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = lookup_hl_store_iterator(id);
        SubLObject result = (SubLObject)hl_interface_infrastructure.NIL;
        if (hl_interface_infrastructure.NIL != iterator) {
            SubLObject doneP;
            SubLObject count;
            SubLObject next;
            SubLObject validP;
            for (doneP = (SubLObject)hl_interface_infrastructure.NIL, count = (SubLObject)hl_interface_infrastructure.NIL, count = (SubLObject)hl_interface_infrastructure.ZERO_INTEGER; !count.numG(n) && hl_interface_infrastructure.NIL == doneP; count = Numbers.add(count, (SubLObject)hl_interface_infrastructure.ONE_INTEGER)) {
                thread.resetMultipleValues();
                next = iteration.iteration_next(iterator);
                validP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (hl_interface_infrastructure.NIL != validP) {
                    result = (SubLObject)ConsesLow.cons(next, result);
                }
                else {
                    doneP = (SubLObject)hl_interface_infrastructure.T;
                }
            }
            result = Sequences.nreverse(result);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 13256L)
    public static SubLObject hl_store_iterator_done_int(final SubLObject id) {
        final SubLObject iterator = lookup_hl_store_iterator(id);
        if (hl_interface_infrastructure.NIL != iterator) {
            return iteration.iteration_done(iterator);
        }
        return (SubLObject)hl_interface_infrastructure.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 13423L)
    public static SubLObject hl_store_iterator_destroy_int(final SubLObject id) {
        final SubLObject iterator = lookup_hl_store_iterator(id);
        if (hl_interface_infrastructure.NIL != iterator) {
            unnote_hl_store_iterator(id);
            return iteration.iteration_finalize(iterator);
        }
        return (SubLObject)hl_interface_infrastructure.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 13643L)
    public static SubLObject new_hl_store_iterator(final SubLObject form, SubLObject buffer_size) {
        if (buffer_size == hl_interface_infrastructure.UNPROVIDED) {
            buffer_size = (SubLObject)hl_interface_infrastructure.ONE_INTEGER;
        }
        assert hl_interface_infrastructure.NIL != Types.listp(form) : form;
        assert hl_interface_infrastructure.NIL != subl_promotions.positive_integer_p(buffer_size) : buffer_size;
        final SubLObject id = (hl_interface_infrastructure.NIL != hl_access_remoteP()) ? hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym54$NEW_HL_STORE_ITERATOR_INT, (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym19$QUOTE, form))) : new_hl_store_iterator_int(form);
        return buffer_size.numE((SubLObject)hl_interface_infrastructure.ONE_INTEGER) ? create_hl_store_iterator(id) : create_hl_store_buffered_iterator(id, buffer_size);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14081L)
    public static SubLObject destroy_hl_store_iterator(final SubLObject iterator) {
        return iteration.iteration_finalize(iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14176L)
    public static SubLObject create_hl_store_iterator(final SubLObject id) {
        return iteration.new_iterator(id, (SubLObject)hl_interface_infrastructure.$sym55$HL_STORE_ITERATOR_DONE_, (SubLObject)hl_interface_infrastructure.$sym56$HL_STORE_ITERATOR_NEXT, (SubLObject)hl_interface_infrastructure.$sym57$HL_STORE_ITERATOR_DESTROY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14369L)
    public static SubLObject hl_store_iterator_doneP(final SubLObject id) {
        return (hl_interface_infrastructure.NIL != hl_access_remoteP()) ? hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym58$HL_STORE_ITERATOR_DONE_INT, id)) : hl_store_iterator_done_int(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14551L)
    public static SubLObject hl_store_iterator_next(final SubLObject id) {
        SubLObject current;
        final SubLObject datum = current = ((hl_interface_infrastructure.NIL != hl_access_remoteP()) ? hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym59$HL_STORE_ITERATOR_NEXT_INT, id)) : hl_store_iterator_next_int(id));
        SubLObject next = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject validP = (SubLObject)hl_interface_infrastructure.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list60);
        next = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)hl_interface_infrastructure.$list60);
        validP = current.first();
        current = current.rest();
        if (hl_interface_infrastructure.NIL == current) {
            return subl_promotions.values3(next, id, Types.sublisp_null(validP));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)hl_interface_infrastructure.$list60);
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14808L)
    public static SubLObject hl_store_iterator_destroy(final SubLObject id) {
        return (hl_interface_infrastructure.NIL != hl_access_remoteP()) ? hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym61$HL_STORE_ITERATOR_DESTROY_INT, id)) : hl_store_iterator_destroy_int(id);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 14998L)
    public static SubLObject create_hl_store_buffered_iterator(final SubLObject id, final SubLObject buffer_size) {
        final SubLObject state = (SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.NIL, id, buffer_size);
        return iteration.new_iterator(state, (SubLObject)hl_interface_infrastructure.$sym62$HL_STORE_BUFFERED_ITERATOR_DONE_, (SubLObject)hl_interface_infrastructure.$sym63$HL_STORE_BUFFERED_ITERATOR_NEXT, (SubLObject)hl_interface_infrastructure.$sym64$HL_STORE_BUFFERED_ITERATOR_DESTROY);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 15296L)
    public static SubLObject hl_store_buffered_iterator_doneP(final SubLObject state) {
        SubLObject buffer = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject id = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject n = (SubLObject)hl_interface_infrastructure.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)hl_interface_infrastructure.$list65);
        buffer = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)hl_interface_infrastructure.$list65);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)hl_interface_infrastructure.$list65);
        n = current.first();
        current = current.rest();
        if (hl_interface_infrastructure.NIL == current) {
            return (SubLObject)SubLObjectFactory.makeBoolean(hl_interface_infrastructure.NIL == buffer && hl_interface_infrastructure.NIL != hl_store_iterator_doneP(id));
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)hl_interface_infrastructure.$list65);
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 15484L)
    public static SubLObject hl_store_buffered_iterator_next(final SubLObject state) {
        SubLObject next = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject invalidP = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject buffer = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject id = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject n = (SubLObject)hl_interface_infrastructure.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)hl_interface_infrastructure.$list65);
        buffer = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)hl_interface_infrastructure.$list65);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)hl_interface_infrastructure.$list65);
        n = current.first();
        current = current.rest();
        if (hl_interface_infrastructure.NIL == current) {
            if (hl_interface_infrastructure.NIL == buffer) {
                final SubLObject new_buffer = (hl_interface_infrastructure.NIL != hl_access_remoteP()) ? hl_store_remote_eval((SubLObject)ConsesLow.list((SubLObject)hl_interface_infrastructure.$sym66$HL_STORE_ITERATOR_NEXT_N_INT, id, n)) : hl_store_iterator_next_n_int(id, n);
                if (hl_interface_infrastructure.NIL != new_buffer) {
                    next = new_buffer.first();
                    ConsesLow.set_nth((SubLObject)hl_interface_infrastructure.ZERO_INTEGER, state, new_buffer.rest());
                }
                else {
                    invalidP = (SubLObject)hl_interface_infrastructure.T;
                }
            }
            else {
                next = buffer.first();
                ConsesLow.set_nth((SubLObject)hl_interface_infrastructure.ZERO_INTEGER, state, buffer.rest());
            }
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)hl_interface_infrastructure.$list65);
        }
        return subl_promotions.values3(next, state, invalidP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 16063L)
    public static SubLObject hl_store_buffered_iterator_destroy(final SubLObject state) {
        SubLObject buffer = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject id = (SubLObject)hl_interface_infrastructure.NIL;
        SubLObject n = (SubLObject)hl_interface_infrastructure.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)hl_interface_infrastructure.$list65);
        buffer = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)hl_interface_infrastructure.$list65);
        id = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)hl_interface_infrastructure.$list65);
        n = current.first();
        current = current.rest();
        if (hl_interface_infrastructure.NIL == current) {
            return hl_store_iterator_destroy(id);
        }
        cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)hl_interface_infrastructure.$list65);
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 16441L)
    public static SubLObject open_hl_transcript(final SubLObject filename) {
        final SubLObject stream = compatibility.open_binary(filename, (SubLObject)hl_interface_infrastructure.$kw68$OUTPUT);
        if (stream.isStream()) {
            hl_interface_infrastructure.$hl_transcript_stream$.setGlobalValue(stream);
            return (SubLObject)hl_interface_infrastructure.T;
        }
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 16660L)
    public static SubLObject close_hl_transcript() {
        if (hl_interface_infrastructure.$hl_transcript_stream$.getGlobalValue().isStream()) {
            streams_high.close(hl_interface_infrastructure.$hl_transcript_stream$.getGlobalValue(), (SubLObject)hl_interface_infrastructure.UNPROVIDED);
            hl_interface_infrastructure.$hl_transcript_stream$.setGlobalValue((SubLObject)hl_interface_infrastructure.NIL);
            return (SubLObject)hl_interface_infrastructure.T;
        }
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 16863L)
    public static SubLObject new_hl_transcript_op(final SubLObject func, final SubLObject arg1, final SubLObject arg2, final SubLObject arg3, final SubLObject arg4, final SubLObject arg5, final SubLObject arg6, final SubLObject arg7) {
        final SubLObject args = Sequences.remove((SubLObject)hl_interface_infrastructure.$kw69$UNPROVIDED, (SubLObject)ConsesLow.list(arg1, arg2, arg3, arg4, arg5, arg6, arg7), (SubLObject)hl_interface_infrastructure.UNPROVIDED, (SubLObject)hl_interface_infrastructure.UNPROVIDED, (SubLObject)hl_interface_infrastructure.UNPROVIDED, (SubLObject)hl_interface_infrastructure.UNPROVIDED, (SubLObject)hl_interface_infrastructure.UNPROVIDED);
        return (SubLObject)ConsesLow.listS(func, args);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 17075L)
    public static SubLObject note_hl_modifier_invocation(final SubLObject name, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6, SubLObject arg7) {
        if (arg1 == hl_interface_infrastructure.UNPROVIDED) {
            arg1 = (SubLObject)hl_interface_infrastructure.$kw69$UNPROVIDED;
        }
        if (arg2 == hl_interface_infrastructure.UNPROVIDED) {
            arg2 = (SubLObject)hl_interface_infrastructure.$kw69$UNPROVIDED;
        }
        if (arg3 == hl_interface_infrastructure.UNPROVIDED) {
            arg3 = (SubLObject)hl_interface_infrastructure.$kw69$UNPROVIDED;
        }
        if (arg4 == hl_interface_infrastructure.UNPROVIDED) {
            arg4 = (SubLObject)hl_interface_infrastructure.$kw69$UNPROVIDED;
        }
        if (arg5 == hl_interface_infrastructure.UNPROVIDED) {
            arg5 = (SubLObject)hl_interface_infrastructure.$kw69$UNPROVIDED;
        }
        if (arg6 == hl_interface_infrastructure.UNPROVIDED) {
            arg6 = (SubLObject)hl_interface_infrastructure.$kw69$UNPROVIDED;
        }
        if (arg7 == hl_interface_infrastructure.UNPROVIDED) {
            arg7 = (SubLObject)hl_interface_infrastructure.$kw69$UNPROVIDED;
        }
        if (hl_interface_infrastructure.$hl_transcript_stream$.getGlobalValue().isStream()) {
            final SubLObject hlop = new_hl_transcript_op(name, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
            cfasl.cfasl_output_externalized(hlop, hl_interface_infrastructure.$hl_transcript_stream$.getGlobalValue());
        }
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 17473L)
    public static SubLObject load_hl_transcript(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)hl_interface_infrastructure.ZERO_INTEGER;
        SubLObject stream = (SubLObject)hl_interface_infrastructure.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)hl_interface_infrastructure.NIL, thread);
                stream = compatibility.open_binary(filename, (SubLObject)hl_interface_infrastructure.$kw70$INPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)hl_interface_infrastructure.$str71$Unable_to_open__S, filename);
            }
            final SubLObject stream_$4 = stream;
            SubLObject result = (SubLObject)hl_interface_infrastructure.NIL;
            while (hl_interface_infrastructure.$kw72$EOF != result) {
                result = load_one_hl_transcript_op(stream_$4);
                if (hl_interface_infrastructure.$kw72$EOF != result) {
                    count = Numbers.add(count, (SubLObject)hl_interface_infrastructure.ONE_INTEGER);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)hl_interface_infrastructure.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)hl_interface_infrastructure.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 17820L)
    public static SubLObject load_one_hl_transcript_op(final SubLObject stream) {
        final SubLObject hlop = cfasl.cfasl_input(stream, (SubLObject)hl_interface_infrastructure.NIL, (SubLObject)hl_interface_infrastructure.UNPROVIDED);
        if (hl_interface_infrastructure.$kw72$EOF == hlop) {
            return (SubLObject)hl_interface_infrastructure.$kw72$EOF;
        }
        return eval_hl_transcript_op(hlop);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/hl-interface-infrastructure.lisp", position = 17991L)
    public static SubLObject eval_hl_transcript_op(final SubLObject hlop) {
        final SubLObject func = hlop.first();
        final SubLObject arg1 = conses_high.second(hlop);
        final SubLObject rest_args = conses_high.nthcdr((SubLObject)hl_interface_infrastructure.TWO_INTEGER, hlop);
        return Functions.apply(func, arg1, rest_args);
    }
    
    public static SubLObject declare_hl_interface_infrastructure_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_modify_localP", "HL-MODIFY-LOCAL?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_modify_remoteP", "HL-MODIFY-REMOTE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_modify_anywhereP", "HL-MODIFY-ANYWHERE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_access_localP", "HL-ACCESS-LOCAL?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_access_remoteP", "HL-ACCESS-REMOTE?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_interface_infrastructure", "override_remote_hl_store_access", "OVERRIDE-REMOTE-HL-STORE-ACCESS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_interface_infrastructure", "do_not_override_remote_hl_store_access", "DO-NOT-OVERRIDE-REMOTE-HL-STORE-ACCESS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "set_remote_hl_store_image", "SET-REMOTE-HL-STORE-IMAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "unset_remote_hl_store_image", "UNSET-REMOTE-HL-STORE-IMAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "clear_remote_hl_store_connection_pool", "CLEAR-REMOTE-HL-STORE-CONNECTION-POOL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "create_remote_hl_store_connection", "CREATE-REMOTE-HL-STORE-CONNECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "release_hl_store_connection", "RELEASE-HL-STORE-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "open_remote_hl_store_connection_p", "OPEN-REMOTE-HL-STORE-CONNECTION-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "get_free_hl_store_connection", "GET-FREE-HL-STORE-CONNECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "initialize_remote_hl_store_connections", "INITIALIZE-REMOTE-HL-STORE-CONNECTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "declare_remote_hl_store_image", "DECLARE-REMOTE-HL-STORE-IMAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "undeclare_remote_hl_store_image", "UNDECLARE-REMOTE-HL-STORE-IMAGE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_remote_eval", "HL-STORE-REMOTE-EVAL", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_interface_infrastructure", "define_hl_creator", "DEFINE-HL-CREATOR");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_interface_infrastructure", "define_hl_modifier", "DEFINE-HL-MODIFIER");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "define_hl_modifier_preamble", "DEFINE-HL-MODIFIER-PREAMBLE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "define_hl_modifier_postamble", "DEFINE-HL-MODIFIER-POSTAMBLE", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_interface_infrastructure", "define_hl_accessor", "DEFINE-HL-ACCESSOR");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "valid_hl_store_error_handling_mode_p", "VALID-HL-STORE-ERROR-HANDLING-MODE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_error_handling_mode", "HL-STORE-ERROR-HANDLING-MODE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_error", "HL-STORE-ERROR", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_interface_infrastructure", "with_hl_store_error_handling_mode", "WITH-HL-STORE-ERROR-HANDLING-MODE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_interface_infrastructure", "with_hl_store_ignore_errors", "WITH-HL-STORE-IGNORE-ERRORS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_interface_infrastructure", "with_hl_store_warn_on_errors", "WITH-HL-STORE-WARN-ON-ERRORS");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.hl_interface_infrastructure", "with_hl_store_break_on_errors", "WITH-HL-STORE-BREAK-ON-ERRORS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "reset_next_hl_store_iterator_id", "RESET-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "candidate_next_hl_store_iterator_id", "CANDIDATE-NEXT-HL-STORE-ITERATOR-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "new_hl_store_iterator_id", "NEW-HL-STORE-ITERATOR-ID", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "note_hl_store_iterator", "NOTE-HL-STORE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "lookup_hl_store_iterator", "LOOKUP-HL-STORE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "unnote_hl_store_iterator", "UNNOTE-HL-STORE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "new_hl_store_iterator_int", "NEW-HL-STORE-ITERATOR-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_iterator_next_int", "HL-STORE-ITERATOR-NEXT-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_iterator_next_n_int", "HL-STORE-ITERATOR-NEXT-N-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_iterator_done_int", "HL-STORE-ITERATOR-DONE-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_iterator_destroy_int", "HL-STORE-ITERATOR-DESTROY-INT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "new_hl_store_iterator", "NEW-HL-STORE-ITERATOR", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "destroy_hl_store_iterator", "DESTROY-HL-STORE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "create_hl_store_iterator", "CREATE-HL-STORE-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_iterator_doneP", "HL-STORE-ITERATOR-DONE?", 1, 0, false);
        new $hl_store_iterator_doneP$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_iterator_next", "HL-STORE-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_iterator_destroy", "HL-STORE-ITERATOR-DESTROY", 1, 0, false);
        new $hl_store_iterator_destroy$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "create_hl_store_buffered_iterator", "CREATE-HL-STORE-BUFFERED-ITERATOR", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_buffered_iterator_doneP", "HL-STORE-BUFFERED-ITERATOR-DONE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_buffered_iterator_next", "HL-STORE-BUFFERED-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "hl_store_buffered_iterator_destroy", "HL-STORE-BUFFERED-ITERATOR-DESTROY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "open_hl_transcript", "OPEN-HL-TRANSCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "close_hl_transcript", "CLOSE-HL-TRANSCRIPT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "new_hl_transcript_op", "NEW-HL-TRANSCRIPT-OP", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "note_hl_modifier_invocation", "NOTE-HL-MODIFIER-INVOCATION", 1, 7, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "load_hl_transcript", "LOAD-HL-TRANSCRIPT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "load_one_hl_transcript_op", "LOAD-ONE-HL-TRANSCRIPT-OP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.hl_interface_infrastructure", "eval_hl_transcript_op", "EVAL-HL-TRANSCRIPT-OP", 1, 0, false);
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    public static SubLObject init_hl_interface_infrastructure_file() {
        hl_interface_infrastructure.$hl_store_modification_and_access$ = SubLFiles.defvar("*HL-STORE-MODIFICATION-AND-ACCESS*", (SubLObject)hl_interface_infrastructure.$kw0$LOCAL_LOCAL);
        hl_interface_infrastructure.$override_hl_store_remote_accessP$ = SubLFiles.defvar("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*", (SubLObject)hl_interface_infrastructure.NIL);
        hl_interface_infrastructure.$remote_hl_store_image$ = SubLFiles.deflexical("*REMOTE-HL-STORE-IMAGE*", (SubLObject)(maybeDefault((SubLObject)hl_interface_infrastructure.$sym8$_REMOTE_HL_STORE_IMAGE_, hl_interface_infrastructure.$remote_hl_store_image$, hl_interface_infrastructure.NIL)));
        hl_interface_infrastructure.$remote_hl_store_connection_pool$ = SubLFiles.deflexical("*REMOTE-HL-STORE-CONNECTION-POOL*", maybeDefault((SubLObject)hl_interface_infrastructure.$sym9$_REMOTE_HL_STORE_CONNECTION_POOL_, hl_interface_infrastructure.$remote_hl_store_connection_pool$, ()->(queues.create_queue((SubLObject)hl_interface_infrastructure.UNPROVIDED))));
        hl_interface_infrastructure.$remote_hl_store_connection_pool_lock$ = SubLFiles.deflexical("*REMOTE-HL-STORE-CONNECTION-POOL-LOCK*", Locks.make_lock((SubLObject)hl_interface_infrastructure.$str10$Remote_HL_Store_Connection_Pool_L));
        hl_interface_infrastructure.$remote_hl_store_connection_pool_max_size$ = SubLFiles.deflexical("*REMOTE-HL-STORE-CONNECTION-POOL-MAX-SIZE*", (SubLObject)hl_interface_infrastructure.NINE_INTEGER);
        hl_interface_infrastructure.$hl_store_error_handling_mode$ = SubLFiles.defparameter("*HL-STORE-ERROR-HANDLING-MODE*", (SubLObject)hl_interface_infrastructure.NIL);
        hl_interface_infrastructure.$hl_store_iterators$ = SubLFiles.deflexical("*HL-STORE-ITERATORS*", maybeDefault((SubLObject)hl_interface_infrastructure.$sym49$_HL_STORE_ITERATORS_, hl_interface_infrastructure.$hl_store_iterators$, ()->(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)hl_interface_infrastructure.EQL), (SubLObject)hl_interface_infrastructure.UNPROVIDED))));
        hl_interface_infrastructure.$next_hl_store_iterator_id$ = SubLFiles.deflexical("*NEXT-HL-STORE-ITERATOR-ID*", (SubLObject)(maybeDefault((SubLObject)hl_interface_infrastructure.$sym50$_NEXT_HL_STORE_ITERATOR_ID_, hl_interface_infrastructure.$next_hl_store_iterator_id$, hl_interface_infrastructure.ZERO_INTEGER)));
        hl_interface_infrastructure.$hl_store_iterator_lock$ = SubLFiles.deflexical("*HL-STORE-ITERATOR-LOCK*", Locks.make_lock((SubLObject)hl_interface_infrastructure.$str51$HL_Store_Iterator_Lock));
        hl_interface_infrastructure.$hl_transcript_stream$ = SubLFiles.deflexical("*HL-TRANSCRIPT-STREAM*", (SubLObject)(maybeDefault((SubLObject)hl_interface_infrastructure.$sym67$_HL_TRANSCRIPT_STREAM_, hl_interface_infrastructure.$hl_transcript_stream$, hl_interface_infrastructure.NIL)));
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    public static SubLObject setup_hl_interface_infrastructure_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)hl_interface_infrastructure.$sym8$_REMOTE_HL_STORE_IMAGE_);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_interface_infrastructure.$sym9$_REMOTE_HL_STORE_CONNECTION_POOL_);
        access_macros.register_macro_helper((SubLObject)hl_interface_infrastructure.$sym34$DEFINE_HL_MODIFIER_PREAMBLE, (SubLObject)hl_interface_infrastructure.$list35);
        access_macros.register_macro_helper((SubLObject)hl_interface_infrastructure.$sym36$DEFINE_HL_MODIFIER_POSTAMBLE, (SubLObject)hl_interface_infrastructure.$list35);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_interface_infrastructure.$sym49$_HL_STORE_ITERATORS_);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_interface_infrastructure.$sym50$_NEXT_HL_STORE_ITERATOR_ID_);
        subl_macro_promotions.declare_defglobal((SubLObject)hl_interface_infrastructure.$sym67$_HL_TRANSCRIPT_STREAM_);
        return (SubLObject)hl_interface_infrastructure.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_hl_interface_infrastructure_file();
    }
    
    @Override
	public void initializeVariables() {
        init_hl_interface_infrastructure_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_hl_interface_infrastructure_file();
    }
    
    static {
        me = (SubLFile)new hl_interface_infrastructure();
        hl_interface_infrastructure.$hl_store_modification_and_access$ = null;
        hl_interface_infrastructure.$override_hl_store_remote_accessP$ = null;
        hl_interface_infrastructure.$remote_hl_store_image$ = null;
        hl_interface_infrastructure.$remote_hl_store_connection_pool$ = null;
        hl_interface_infrastructure.$remote_hl_store_connection_pool_lock$ = null;
        hl_interface_infrastructure.$remote_hl_store_connection_pool_max_size$ = null;
        hl_interface_infrastructure.$hl_store_error_handling_mode$ = null;
        hl_interface_infrastructure.$hl_store_iterators$ = null;
        hl_interface_infrastructure.$next_hl_store_iterator_id$ = null;
        hl_interface_infrastructure.$hl_store_iterator_lock$ = null;
        hl_interface_infrastructure.$hl_transcript_stream$ = null;
        $kw0$LOCAL_LOCAL = SubLObjectFactory.makeKeyword("LOCAL-LOCAL");
        $kw1$BOTH_LOCAL = SubLObjectFactory.makeKeyword("BOTH-LOCAL");
        $kw2$BOTH_REMOTE = SubLObjectFactory.makeKeyword("BOTH-REMOTE");
        $kw3$REMOTE_REMOTE = SubLObjectFactory.makeKeyword("REMOTE-REMOTE");
        $kw4$NONE_LOCAL = SubLObjectFactory.makeKeyword("NONE-LOCAL");
        $sym5$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*"), (SubLObject)hl_interface_infrastructure.T));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*OVERRIDE-HL-STORE-REMOTE-ACCESS?*"), (SubLObject)hl_interface_infrastructure.NIL));
        $sym8$_REMOTE_HL_STORE_IMAGE_ = SubLObjectFactory.makeSymbol("*REMOTE-HL-STORE-IMAGE*");
        $sym9$_REMOTE_HL_STORE_CONNECTION_POOL_ = SubLObjectFactory.makeSymbol("*REMOTE-HL-STORE-CONNECTION-POOL*");
        $str10$Remote_HL_Store_Connection_Pool_L = SubLObjectFactory.makeString("Remote HL Store Connection Pool Lock");
        $str11$Could_not_open_a_connection_to__s = SubLObjectFactory.makeString("Could not open a connection to ~s");
        $kw12$CFASL = SubLObjectFactory.makeKeyword("CFASL");
        $sym13$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("ARGLIST"), (SubLObject)SubLObjectFactory.makeSymbol("DOCUMENTATION-STRING"), (SubLObject)SubLObjectFactory.makeSymbol("TYPE-DECLARATIONS"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym15$DEFINE_API = SubLObjectFactory.makeSymbol("DEFINE-API");
        $sym16$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list17 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE-HL-MODIFIER-PREAMBLE"));
        $sym18$NOTE_HL_MODIFIER_INVOCATION = SubLObjectFactory.makeSymbol("NOTE-HL-MODIFIER-INVOCATION");
        $sym19$QUOTE = SubLObjectFactory.makeSymbol("QUOTE");
        $sym20$PIF = SubLObjectFactory.makeSymbol("PIF");
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODIFY-ANYWHERE?"));
        $sym22$WITHIN_HL_MODIFICATION = SubLObjectFactory.makeSymbol("WITHIN-HL-MODIFICATION");
        $list23 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RET"), (SubLObject)hl_interface_infrastructure.NIL));
        $sym24$LIST = SubLObjectFactory.makeSymbol("LIST");
        $list25 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("QUOTE"));
        $sym26$RESULT = SubLObjectFactory.makeUninternedSymbol("RESULT");
        $sym27$PWHEN = SubLObjectFactory.makeSymbol("PWHEN");
        $list28 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODIFY-REMOTE?"));
        $sym29$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $sym30$HL_STORE_REMOTE_EVAL = SubLObjectFactory.makeSymbol("HL-STORE-REMOTE-EVAL");
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-MODIFY-LOCAL?"));
        $sym32$OVERRIDE_REMOTE_HL_STORE_ACCESS = SubLObjectFactory.makeSymbol("OVERRIDE-REMOTE-HL-STORE-ACCESS");
        $sym33$RET = SubLObjectFactory.makeSymbol("RET");
        $sym34$DEFINE_HL_MODIFIER_PREAMBLE = SubLObjectFactory.makeSymbol("DEFINE-HL-MODIFIER-PREAMBLE");
        $list35 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("DEFINE-HL-MODIFIER"), (SubLObject)SubLObjectFactory.makeSymbol("DEFINE-HL-CREATOR"));
        $sym36$DEFINE_HL_MODIFIER_POSTAMBLE = SubLObjectFactory.makeSymbol("DEFINE-HL-MODIFIER-POSTAMBLE");
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("HL-ACCESS-REMOTE?"));
        $list38 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IGNORE"), (SubLObject)SubLObjectFactory.makeKeyword("WARN"), (SubLObject)SubLObjectFactory.makeKeyword("BREAK"));
        $kw39$BREAK = SubLObjectFactory.makeKeyword("BREAK");
        $sym40$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw41$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw42$WARN = SubLObjectFactory.makeKeyword("WARN");
        $list43 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MODE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym44$CHECK_TYPE = SubLObjectFactory.makeSymbol("CHECK-TYPE");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("VALID-HL-STORE-ERROR-HANDLING-MODE-P"));
        $sym46$_HL_STORE_ERROR_HANDLING_MODE_ = SubLObjectFactory.makeSymbol("*HL-STORE-ERROR-HANDLING-MODE*");
        $sym47$WITH_HL_STORE_ERROR_HANDLING_MODE = SubLObjectFactory.makeSymbol("WITH-HL-STORE-ERROR-HANDLING-MODE");
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*INFERENCE-DEBUG?*"), (SubLObject)hl_interface_infrastructure.T));
        $sym49$_HL_STORE_ITERATORS_ = SubLObjectFactory.makeSymbol("*HL-STORE-ITERATORS*");
        $sym50$_NEXT_HL_STORE_ITERATOR_ID_ = SubLObjectFactory.makeSymbol("*NEXT-HL-STORE-ITERATOR-ID*");
        $str51$HL_Store_Iterator_Lock = SubLObjectFactory.makeString("HL Store Iterator Lock");
        $sym52$LISTP = SubLObjectFactory.makeSymbol("LISTP");
        $sym53$POSITIVE_INTEGER_P = SubLObjectFactory.makeSymbol("POSITIVE-INTEGER-P");
        $sym54$NEW_HL_STORE_ITERATOR_INT = SubLObjectFactory.makeSymbol("NEW-HL-STORE-ITERATOR-INT");
        $sym55$HL_STORE_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("HL-STORE-ITERATOR-DONE?");
        $sym56$HL_STORE_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("HL-STORE-ITERATOR-NEXT");
        $sym57$HL_STORE_ITERATOR_DESTROY = SubLObjectFactory.makeSymbol("HL-STORE-ITERATOR-DESTROY");
        $sym58$HL_STORE_ITERATOR_DONE_INT = SubLObjectFactory.makeSymbol("HL-STORE-ITERATOR-DONE-INT");
        $sym59$HL_STORE_ITERATOR_NEXT_INT = SubLObjectFactory.makeSymbol("HL-STORE-ITERATOR-NEXT-INT");
        $list60 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NEXT"), (SubLObject)SubLObjectFactory.makeSymbol("VALID?"));
        $sym61$HL_STORE_ITERATOR_DESTROY_INT = SubLObjectFactory.makeSymbol("HL-STORE-ITERATOR-DESTROY-INT");
        $sym62$HL_STORE_BUFFERED_ITERATOR_DONE_ = SubLObjectFactory.makeSymbol("HL-STORE-BUFFERED-ITERATOR-DONE?");
        $sym63$HL_STORE_BUFFERED_ITERATOR_NEXT = SubLObjectFactory.makeSymbol("HL-STORE-BUFFERED-ITERATOR-NEXT");
        $sym64$HL_STORE_BUFFERED_ITERATOR_DESTROY = SubLObjectFactory.makeSymbol("HL-STORE-BUFFERED-ITERATOR-DESTROY");
        $list65 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("BUFFER"), (SubLObject)SubLObjectFactory.makeSymbol("ID"), (SubLObject)SubLObjectFactory.makeSymbol("N"));
        $sym66$HL_STORE_ITERATOR_NEXT_N_INT = SubLObjectFactory.makeSymbol("HL-STORE-ITERATOR-NEXT-N-INT");
        $sym67$_HL_TRANSCRIPT_STREAM_ = SubLObjectFactory.makeSymbol("*HL-TRANSCRIPT-STREAM*");
        $kw68$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $kw69$UNPROVIDED = SubLObjectFactory.makeKeyword("UNPROVIDED");
        $kw70$INPUT = SubLObjectFactory.makeKeyword("INPUT");
        $str71$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw72$EOF = SubLObjectFactory.makeKeyword("EOF");
    }
    
    public static final class $hl_store_iterator_doneP$UnaryFunction extends UnaryFunction
    {
        public $hl_store_iterator_doneP$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-STORE-ITERATOR-DONE?"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return hl_interface_infrastructure.hl_store_iterator_doneP(arg1);
        }
    }
    
    public static final class $hl_store_iterator_destroy$UnaryFunction extends UnaryFunction
    {
        public $hl_store_iterator_destroy$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("HL-STORE-ITERATOR-DESTROY"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return hl_interface_infrastructure.hl_store_iterator_destroy(arg1);
        }
    }
}

/*

	Total time: 298 ms
	
*/