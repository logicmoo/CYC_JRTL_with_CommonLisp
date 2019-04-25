package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class remote_image extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.remote_image";
    public static final String myFingerPrint = "3b99baaccb04ce58edd77f109bcae429718537888879bb981455edc13b86958f";
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLSymbol $dtp_remote_image$;
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
    public static SubLSymbol $dtp_remote_image_connection$;
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5891L)
    public static SubLSymbol $current_remote_image_connection$;
    private static final SubLSymbol $kw0$CFASL;
    private static final SubLSymbol $kw1$CYC_API;
    private static final SubLString $str2$Unknown_API_protocol__S;
    private static final SubLSymbol $sym3$REMOTE_IMAGE;
    private static final SubLSymbol $sym4$REMOTE_IMAGE_P;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLSymbol $sym9$PRINT_REMOTE_IMAGE;
    private static final SubLSymbol $sym10$REMOTE_IMAGE_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$RMT_IMG_MACHINE;
    private static final SubLSymbol $sym13$_CSETF_RMT_IMG_MACHINE;
    private static final SubLSymbol $sym14$RMT_IMG_PORT;
    private static final SubLSymbol $sym15$_CSETF_RMT_IMG_PORT;
    private static final SubLSymbol $sym16$RMT_IMG_PROTOCOL;
    private static final SubLSymbol $sym17$_CSETF_RMT_IMG_PROTOCOL;
    private static final SubLSymbol $kw18$MACHINE;
    private static final SubLSymbol $kw19$PORT;
    private static final SubLSymbol $kw20$PROTOCOL;
    private static final SubLString $str21$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw22$BEGIN;
    private static final SubLSymbol $sym23$MAKE_REMOTE_IMAGE;
    private static final SubLSymbol $kw24$SLOT;
    private static final SubLSymbol $kw25$END;
    private static final SubLSymbol $sym26$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_METHOD;
    private static final SubLString $str27$_REMOTE_IMAGE__A__A__A_;
    private static final SubLSymbol $sym28$REMOTE_IMAGE_CONNECTION;
    private static final SubLSymbol $sym29$REMOTE_IMAGE_CONNECTION_P;
    private static final SubLList $list30;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLList $list33;
    private static final SubLSymbol $sym34$PRINT_REMOTE_IMAGE_CONNECTION;
    private static final SubLSymbol $sym35$REMOTE_IMAGE_CONNECTION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list36;
    private static final SubLSymbol $sym37$RMT_IMG_CONN_IMAGE;
    private static final SubLSymbol $sym38$_CSETF_RMT_IMG_CONN_IMAGE;
    private static final SubLSymbol $sym39$RMT_IMG_CONN_CHANNEL;
    private static final SubLSymbol $sym40$_CSETF_RMT_IMG_CONN_CHANNEL;
    private static final SubLSymbol $kw41$IMAGE;
    private static final SubLSymbol $kw42$CHANNEL;
    private static final SubLSymbol $sym43$MAKE_REMOTE_IMAGE_CONNECTION;
    private static final SubLSymbol $sym44$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_CONNECTION_METHOD;
    private static final SubLString $str45$_CONNECTION_to__A___A__;
    private static final SubLString $str46$open;
    private static final SubLString $str47$closed;
    private static final SubLSymbol $kw48$PRIVATE;
    private static final SubLSymbol $kw49$IGNORE_ERRORS_TARGET;
    private static final SubLSymbol $sym50$IGNORE_ERRORS_HANDLER;
    private static final SubLList $list51;
    private static final SubLList $list52;
    private static final SubLSymbol $sym53$CLET;
    private static final SubLSymbol $sym54$_CURRENT_REMOTE_IMAGE_CONNECTION_;
    private static final SubLList $list55;
    private static final SubLSymbol $sym56$CONNECTION;
    private static final SubLSymbol $sym57$NEW_REMOTE_IMAGE_CONNECTION;
    private static final SubLSymbol $sym58$CUNWIND_PROTECT;
    private static final SubLSymbol $sym59$PROGN;
    private static final SubLSymbol $sym60$OPEN_REMOTE_IMAGE_CONNECTION;
    private static final SubLSymbol $sym61$WITH_REMOTE_IMAGE_CONNECTION;
    private static final SubLSymbol $sym62$CLOSE_REMOTE_IMAGE_CONNECTION;
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 851L)
    public static SubLObject api_channel_remote_eval(final SubLObject api_request, final SubLObject channel, SubLObject protocol) {
        if (protocol == remote_image.UNPROVIDED) {
            protocol = (SubLObject)remote_image.$kw0$CFASL;
        }
        final SubLObject pcase_var = protocol;
        if (pcase_var.eql((SubLObject)remote_image.$kw0$CFASL)) {
            return cfasl_kernel.cfasl_channel_eval(api_request, channel);
        }
        if (pcase_var.eql((SubLObject)remote_image.$kw1$CYC_API)) {
            return api_kernel.cyc_api_channel_eval(api_request, channel);
        }
        return Errors.error((SubLObject)remote_image.$str2$Unknown_API_protocol__S, protocol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLObject remote_image_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_remote_image(v_object, stream, (SubLObject)remote_image.ZERO_INTEGER);
        return (SubLObject)remote_image.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLObject remote_image_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $remote_image_native.class) ? remote_image.T : remote_image.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLObject rmt_img_machine(final SubLObject v_object) {
        assert remote_image.NIL != remote_image_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLObject rmt_img_port(final SubLObject v_object) {
        assert remote_image.NIL != remote_image_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLObject rmt_img_protocol(final SubLObject v_object) {
        assert remote_image.NIL != remote_image_p(v_object) : v_object;
        return v_object.getField4();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLObject _csetf_rmt_img_machine(final SubLObject v_object, final SubLObject value) {
        assert remote_image.NIL != remote_image_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLObject _csetf_rmt_img_port(final SubLObject v_object, final SubLObject value) {
        assert remote_image.NIL != remote_image_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLObject _csetf_rmt_img_protocol(final SubLObject v_object, final SubLObject value) {
        assert remote_image.NIL != remote_image_p(v_object) : v_object;
        return v_object.setField4(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLObject make_remote_image(SubLObject arglist) {
        if (arglist == remote_image.UNPROVIDED) {
            arglist = (SubLObject)remote_image.NIL;
        }
        final SubLObject v_new = (SubLObject)new $remote_image_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)remote_image.NIL, next = arglist; remote_image.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)remote_image.$kw18$MACHINE)) {
                _csetf_rmt_img_machine(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)remote_image.$kw19$PORT)) {
                _csetf_rmt_img_port(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)remote_image.$kw20$PROTOCOL)) {
                _csetf_rmt_img_protocol(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)remote_image.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLObject visit_defstruct_remote_image(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)remote_image.$kw22$BEGIN, (SubLObject)remote_image.$sym23$MAKE_REMOTE_IMAGE, (SubLObject)remote_image.THREE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)remote_image.$kw24$SLOT, (SubLObject)remote_image.$kw18$MACHINE, rmt_img_machine(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)remote_image.$kw24$SLOT, (SubLObject)remote_image.$kw19$PORT, rmt_img_port(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)remote_image.$kw24$SLOT, (SubLObject)remote_image.$kw20$PROTOCOL, rmt_img_protocol(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)remote_image.$kw25$END, (SubLObject)remote_image.$sym23$MAKE_REMOTE_IMAGE, (SubLObject)remote_image.THREE_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1354L)
    public static SubLObject visit_defstruct_object_remote_image_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_remote_image(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1701L)
    public static SubLObject print_remote_image(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)remote_image.$str27$_REMOTE_IMAGE__A__A__A_, new SubLObject[] { remote_image_machine(v_object), remote_image_port(v_object), remote_image_protocol(v_object) });
        return (SubLObject)remote_image.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 1932L)
    public static SubLObject new_remote_image(final SubLObject machine, final SubLObject port, SubLObject protocol) {
        if (protocol == remote_image.UNPROVIDED) {
            protocol = (SubLObject)remote_image.$kw0$CFASL;
        }
        final SubLObject v_remote_image = make_remote_image((SubLObject)remote_image.UNPROVIDED);
        _csetf_rmt_img_machine(v_remote_image, machine);
        _csetf_rmt_img_port(v_remote_image, port);
        _csetf_rmt_img_protocol(v_remote_image, protocol);
        return v_remote_image;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2248L)
    public static SubLObject remote_image_machine(final SubLObject v_remote_image) {
        return rmt_img_machine(v_remote_image);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2367L)
    public static SubLObject remote_image_port(final SubLObject v_remote_image) {
        return rmt_img_port(v_remote_image);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2453L)
    public static SubLObject remote_image_protocol(final SubLObject v_remote_image) {
        return rmt_img_protocol(v_remote_image);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
    public static SubLObject remote_image_connection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_remote_image_connection(v_object, stream, (SubLObject)remote_image.ZERO_INTEGER);
        return (SubLObject)remote_image.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
    public static SubLObject remote_image_connection_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $remote_image_connection_native.class) ? remote_image.T : remote_image.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
    public static SubLObject rmt_img_conn_image(final SubLObject v_object) {
        assert remote_image.NIL != remote_image_connection_p(v_object) : v_object;
        return v_object.getField2();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
    public static SubLObject rmt_img_conn_channel(final SubLObject v_object) {
        assert remote_image.NIL != remote_image_connection_p(v_object) : v_object;
        return v_object.getField3();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
    public static SubLObject _csetf_rmt_img_conn_image(final SubLObject v_object, final SubLObject value) {
        assert remote_image.NIL != remote_image_connection_p(v_object) : v_object;
        return v_object.setField2(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
    public static SubLObject _csetf_rmt_img_conn_channel(final SubLObject v_object, final SubLObject value) {
        assert remote_image.NIL != remote_image_connection_p(v_object) : v_object;
        return v_object.setField3(value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
    public static SubLObject make_remote_image_connection(SubLObject arglist) {
        if (arglist == remote_image.UNPROVIDED) {
            arglist = (SubLObject)remote_image.NIL;
        }
        final SubLObject v_new = (SubLObject)new $remote_image_connection_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)remote_image.NIL, next = arglist; remote_image.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)remote_image.$kw41$IMAGE)) {
                _csetf_rmt_img_conn_image(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)remote_image.$kw42$CHANNEL)) {
                _csetf_rmt_img_conn_channel(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)remote_image.$str21$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
    public static SubLObject visit_defstruct_remote_image_connection(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)remote_image.$kw22$BEGIN, (SubLObject)remote_image.$sym43$MAKE_REMOTE_IMAGE_CONNECTION, (SubLObject)remote_image.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)remote_image.$kw24$SLOT, (SubLObject)remote_image.$kw41$IMAGE, rmt_img_conn_image(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)remote_image.$kw24$SLOT, (SubLObject)remote_image.$kw42$CHANNEL, rmt_img_conn_channel(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)remote_image.$kw25$END, (SubLObject)remote_image.$sym43$MAKE_REMOTE_IMAGE_CONNECTION, (SubLObject)remote_image.TWO_INTEGER);
        return obj;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 2826L)
    public static SubLObject visit_defstruct_object_remote_image_connection_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_remote_image_connection(obj, visitor_fn);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 3091L)
    public static SubLObject print_remote_image_connection(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)remote_image.$str45$_CONNECTION_to__A___A__, remote_image_connection_image(v_object), (SubLObject)(remote_image_connection_channel(v_object).isStream() ? remote_image.$str46$open : remote_image.$str47$closed));
        return (SubLObject)remote_image.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 3360L)
    public static SubLObject new_remote_image_connection(final SubLObject v_remote_image) {
        final SubLObject connection = make_remote_image_connection((SubLObject)remote_image.UNPROVIDED);
        _csetf_rmt_img_conn_image(connection, v_remote_image);
        _csetf_rmt_img_conn_channel(connection, (SubLObject)remote_image.NIL);
        return connection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 3619L)
    public static SubLObject remote_image_connection_image(final SubLObject connection) {
        return rmt_img_conn_image(connection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 3746L)
    public static SubLObject remote_image_connection_channel(final SubLObject connection) {
        return rmt_img_conn_channel(connection);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 3850L)
    public static SubLObject open_remote_image_connection(final SubLObject connection) {
        SubLObject channel = remote_image_connection_channel(connection);
        if (remote_image.NIL != channel) {
            return (SubLObject)remote_image.NIL;
        }
        final SubLObject machine = remote_image_connection_machine(connection);
        final SubLObject port = remote_image_connection_port(connection);
        channel = subl_promotions.open_tcp_stream_with_timeout(machine, port, (SubLObject)remote_image.NIL, (SubLObject)remote_image.$kw48$PRIVATE);
        _csetf_rmt_img_conn_channel(connection, channel);
        return (SubLObject)remote_image.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 4356L)
    public static SubLObject close_remote_image_connection(final SubLObject connection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject channel = remote_image_connection_channel(connection);
        if (remote_image.NIL == channel) {
            return (SubLObject)remote_image.NIL;
        }
        SubLObject ignore_errors_tag = (SubLObject)remote_image.NIL;
        try {
            thread.throwStack.push(remote_image.$kw49$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(Symbols.symbol_function((SubLObject)remote_image.$sym50$IGNORE_ERRORS_HANDLER), thread);
                try {
                    try {
                        try {
                            remote_image_connection_eval(connection, (SubLObject)remote_image.$list51);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)remote_image.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                streams_high.close(channel, (SubLObject)remote_image.UNPROVIDED);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                            }
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)remote_image.T, thread);
                            final SubLObject _values2 = Values.getValuesAsVector();
                            _csetf_rmt_img_conn_channel(connection, (SubLObject)remote_image.NIL);
                            Values.restoreValuesFromVector(_values2);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)remote_image.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, (SubLObject)remote_image.$kw49$IGNORE_ERRORS_TARGET);
        }
        finally {
            thread.throwStack.pop();
        }
        return (SubLObject)remote_image.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 4720L)
    public static SubLObject remote_image_connection_openP(final SubLObject connection) {
        return Types.streamp(remote_image_connection_channel(connection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 4857L)
    public static SubLObject remote_image_connection_closedP(final SubLObject connection) {
        return (SubLObject)SubLObjectFactory.makeBoolean(!remote_image_connection_channel(connection).isStream());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 4989L)
    public static SubLObject remote_image_connection_machine(final SubLObject connection) {
        return remote_image_machine(remote_image_connection_image(connection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5125L)
    public static SubLObject remote_image_connection_port(final SubLObject connection) {
        return remote_image_port(remote_image_connection_image(connection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5255L)
    public static SubLObject remote_image_connection_protocol(final SubLObject connection) {
        return remote_image_protocol(remote_image_connection_image(connection));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5393L)
    public static SubLObject reopen_remote_image_connection(final SubLObject connection) {
        assert remote_image.NIL != remote_image_connection_p(connection) : connection;
        close_remote_image_connection(connection);
        open_remote_image_connection(connection);
        return connection;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5629L)
    public static SubLObject remote_image_connection_eval(final SubLObject connection, final SubLObject api_request) {
        final SubLObject channel = remote_image_connection_channel(connection);
        final SubLObject protocol = remote_image_connection_protocol(connection);
        return api_channel_remote_eval(api_request, channel, protocol);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 5955L)
    public static SubLObject with_remote_image_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject connection = (SubLObject)remote_image.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)remote_image.$list52);
        connection = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)remote_image.$sym53$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)remote_image.$sym54$_CURRENT_REMOTE_IMAGE_CONNECTION_, connection)), ConsesLow.append(body, (SubLObject)remote_image.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 6103L)
    public static SubLObject current_remote_image_connection() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return remote_image.$current_remote_image_connection$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 6200L)
    public static SubLObject current_remote_image_connection_eval(final SubLObject api_request) {
        return remote_image_connection_eval(current_remote_image_connection(), api_request);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/remote-image.lisp", position = 6353L)
    public static SubLObject with_new_remote_image_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_remote_image = (SubLObject)remote_image.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)remote_image.$list55);
        v_remote_image = current.first();
        final SubLObject body;
        current = (body = current.rest());
        final SubLObject connection = (SubLObject)remote_image.$sym56$CONNECTION;
        return (SubLObject)ConsesLow.list((SubLObject)remote_image.$sym53$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(connection, (SubLObject)ConsesLow.list((SubLObject)remote_image.$sym57$NEW_REMOTE_IMAGE_CONNECTION, v_remote_image))), (SubLObject)ConsesLow.list((SubLObject)remote_image.$sym58$CUNWIND_PROTECT, (SubLObject)ConsesLow.list((SubLObject)remote_image.$sym59$PROGN, (SubLObject)ConsesLow.list((SubLObject)remote_image.$sym60$OPEN_REMOTE_IMAGE_CONNECTION, connection), (SubLObject)ConsesLow.listS((SubLObject)remote_image.$sym61$WITH_REMOTE_IMAGE_CONNECTION, connection, ConsesLow.append(body, (SubLObject)remote_image.NIL))), (SubLObject)ConsesLow.list((SubLObject)remote_image.$sym62$CLOSE_REMOTE_IMAGE_CONNECTION, connection)));
    }
    
    public static SubLObject declare_remote_image_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "api_channel_remote_eval", "API-CHANNEL-REMOTE-EVAL", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_print_function_trampoline", "REMOTE-IMAGE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_p", "REMOTE-IMAGE-P", 1, 0, false);
        new $remote_image_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "rmt_img_machine", "RMT-IMG-MACHINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "rmt_img_port", "RMT-IMG-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "rmt_img_protocol", "RMT-IMG-PROTOCOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "_csetf_rmt_img_machine", "_CSETF-RMT-IMG-MACHINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "_csetf_rmt_img_port", "_CSETF-RMT-IMG-PORT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "_csetf_rmt_img_protocol", "_CSETF-RMT-IMG-PROTOCOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "make_remote_image", "MAKE-REMOTE-IMAGE", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "visit_defstruct_remote_image", "VISIT-DEFSTRUCT-REMOTE-IMAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "visit_defstruct_object_remote_image_method", "VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "print_remote_image", "PRINT-REMOTE-IMAGE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "new_remote_image", "NEW-REMOTE-IMAGE", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_machine", "REMOTE-IMAGE-MACHINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_port", "REMOTE-IMAGE-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_protocol", "REMOTE-IMAGE-PROTOCOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_connection_print_function_trampoline", "REMOTE-IMAGE-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_connection_p", "REMOTE-IMAGE-CONNECTION-P", 1, 0, false);
        new $remote_image_connection_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "rmt_img_conn_image", "RMT-IMG-CONN-IMAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "rmt_img_conn_channel", "RMT-IMG-CONN-CHANNEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "_csetf_rmt_img_conn_image", "_CSETF-RMT-IMG-CONN-IMAGE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "_csetf_rmt_img_conn_channel", "_CSETF-RMT-IMG-CONN-CHANNEL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "make_remote_image_connection", "MAKE-REMOTE-IMAGE-CONNECTION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "visit_defstruct_remote_image_connection", "VISIT-DEFSTRUCT-REMOTE-IMAGE-CONNECTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "visit_defstruct_object_remote_image_connection_method", "VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-CONNECTION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "print_remote_image_connection", "PRINT-REMOTE-IMAGE-CONNECTION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "new_remote_image_connection", "NEW-REMOTE-IMAGE-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_connection_image", "REMOTE-IMAGE-CONNECTION-IMAGE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_connection_channel", "REMOTE-IMAGE-CONNECTION-CHANNEL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "open_remote_image_connection", "OPEN-REMOTE-IMAGE-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "close_remote_image_connection", "CLOSE-REMOTE-IMAGE-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_connection_openP", "REMOTE-IMAGE-CONNECTION-OPEN?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_connection_closedP", "REMOTE-IMAGE-CONNECTION-CLOSED?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_connection_machine", "REMOTE-IMAGE-CONNECTION-MACHINE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_connection_port", "REMOTE-IMAGE-CONNECTION-PORT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_connection_protocol", "REMOTE-IMAGE-CONNECTION-PROTOCOL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "reopen_remote_image_connection", "REOPEN-REMOTE-IMAGE-CONNECTION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "remote_image_connection_eval", "REMOTE-IMAGE-CONNECTION-EVAL", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.remote_image", "with_remote_image_connection", "WITH-REMOTE-IMAGE-CONNECTION");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "current_remote_image_connection", "CURRENT-REMOTE-IMAGE-CONNECTION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.remote_image", "current_remote_image_connection_eval", "CURRENT-REMOTE-IMAGE-CONNECTION-EVAL", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.remote_image", "with_new_remote_image_connection", "WITH-NEW-REMOTE-IMAGE-CONNECTION");
        return (SubLObject)remote_image.NIL;
    }
    
    public static SubLObject init_remote_image_file() {
        remote_image.$dtp_remote_image$ = SubLFiles.defconstant("*DTP-REMOTE-IMAGE*", (SubLObject)remote_image.$sym3$REMOTE_IMAGE);
        remote_image.$dtp_remote_image_connection$ = SubLFiles.defconstant("*DTP-REMOTE-IMAGE-CONNECTION*", (SubLObject)remote_image.$sym28$REMOTE_IMAGE_CONNECTION);
        remote_image.$current_remote_image_connection$ = SubLFiles.defparameter("*CURRENT-REMOTE-IMAGE-CONNECTION*", (SubLObject)remote_image.NIL);
        return (SubLObject)remote_image.NIL;
    }
    
    public static SubLObject setup_remote_image_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), remote_image.$dtp_remote_image$.getGlobalValue(), Symbols.symbol_function((SubLObject)remote_image.$sym10$REMOTE_IMAGE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)remote_image.$list11);
        Structures.def_csetf((SubLObject)remote_image.$sym12$RMT_IMG_MACHINE, (SubLObject)remote_image.$sym13$_CSETF_RMT_IMG_MACHINE);
        Structures.def_csetf((SubLObject)remote_image.$sym14$RMT_IMG_PORT, (SubLObject)remote_image.$sym15$_CSETF_RMT_IMG_PORT);
        Structures.def_csetf((SubLObject)remote_image.$sym16$RMT_IMG_PROTOCOL, (SubLObject)remote_image.$sym17$_CSETF_RMT_IMG_PROTOCOL);
        Equality.identity((SubLObject)remote_image.$sym3$REMOTE_IMAGE);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), remote_image.$dtp_remote_image$.getGlobalValue(), Symbols.symbol_function((SubLObject)remote_image.$sym26$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), remote_image.$dtp_remote_image_connection$.getGlobalValue(), Symbols.symbol_function((SubLObject)remote_image.$sym35$REMOTE_IMAGE_CONNECTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)remote_image.$list36);
        Structures.def_csetf((SubLObject)remote_image.$sym37$RMT_IMG_CONN_IMAGE, (SubLObject)remote_image.$sym38$_CSETF_RMT_IMG_CONN_IMAGE);
        Structures.def_csetf((SubLObject)remote_image.$sym39$RMT_IMG_CONN_CHANNEL, (SubLObject)remote_image.$sym40$_CSETF_RMT_IMG_CONN_CHANNEL);
        Equality.identity((SubLObject)remote_image.$sym28$REMOTE_IMAGE_CONNECTION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), remote_image.$dtp_remote_image_connection$.getGlobalValue(), Symbols.symbol_function((SubLObject)remote_image.$sym44$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_CONNECTION_METHOD));
        return (SubLObject)remote_image.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_remote_image_file();
    }
    
    @Override
	public void initializeVariables() {
        init_remote_image_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_remote_image_file();
    }
    
    static {
        me = (SubLFile)new remote_image();
        remote_image.$dtp_remote_image$ = null;
        remote_image.$dtp_remote_image_connection$ = null;
        remote_image.$current_remote_image_connection$ = null;
        $kw0$CFASL = SubLObjectFactory.makeKeyword("CFASL");
        $kw1$CYC_API = SubLObjectFactory.makeKeyword("CYC-API");
        $str2$Unknown_API_protocol__S = SubLObjectFactory.makeString("Unknown API protocol ~S");
        $sym3$REMOTE_IMAGE = SubLObjectFactory.makeSymbol("REMOTE-IMAGE");
        $sym4$REMOTE_IMAGE_P = SubLObjectFactory.makeSymbol("REMOTE-IMAGE-P");
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("PORT"), (SubLObject)SubLObjectFactory.makeSymbol("PROTOCOL"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MACHINE"), (SubLObject)SubLObjectFactory.makeKeyword("PORT"), (SubLObject)SubLObjectFactory.makeKeyword("PROTOCOL"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RMT-IMG-MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("RMT-IMG-PORT"), (SubLObject)SubLObjectFactory.makeSymbol("RMT-IMG-PROTOCOL"));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RMT-IMG-MACHINE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RMT-IMG-PORT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RMT-IMG-PROTOCOL"));
        $sym9$PRINT_REMOTE_IMAGE = SubLObjectFactory.makeSymbol("PRINT-REMOTE-IMAGE");
        $sym10$REMOTE_IMAGE_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REMOTE-IMAGE-PRINT-FUNCTION-TRAMPOLINE");
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOTE-IMAGE-P"));
        $sym12$RMT_IMG_MACHINE = SubLObjectFactory.makeSymbol("RMT-IMG-MACHINE");
        $sym13$_CSETF_RMT_IMG_MACHINE = SubLObjectFactory.makeSymbol("_CSETF-RMT-IMG-MACHINE");
        $sym14$RMT_IMG_PORT = SubLObjectFactory.makeSymbol("RMT-IMG-PORT");
        $sym15$_CSETF_RMT_IMG_PORT = SubLObjectFactory.makeSymbol("_CSETF-RMT-IMG-PORT");
        $sym16$RMT_IMG_PROTOCOL = SubLObjectFactory.makeSymbol("RMT-IMG-PROTOCOL");
        $sym17$_CSETF_RMT_IMG_PROTOCOL = SubLObjectFactory.makeSymbol("_CSETF-RMT-IMG-PROTOCOL");
        $kw18$MACHINE = SubLObjectFactory.makeKeyword("MACHINE");
        $kw19$PORT = SubLObjectFactory.makeKeyword("PORT");
        $kw20$PROTOCOL = SubLObjectFactory.makeKeyword("PROTOCOL");
        $str21$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw22$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym23$MAKE_REMOTE_IMAGE = SubLObjectFactory.makeSymbol("MAKE-REMOTE-IMAGE");
        $kw24$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw25$END = SubLObjectFactory.makeKeyword("END");
        $sym26$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-METHOD");
        $str27$_REMOTE_IMAGE__A__A__A_ = SubLObjectFactory.makeString("<REMOTE IMAGE ~A ~A ~A>");
        $sym28$REMOTE_IMAGE_CONNECTION = SubLObjectFactory.makeSymbol("REMOTE-IMAGE-CONNECTION");
        $sym29$REMOTE_IMAGE_CONNECTION_P = SubLObjectFactory.makeSymbol("REMOTE-IMAGE-CONNECTION-P");
        $list30 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IMAGE"), (SubLObject)SubLObjectFactory.makeSymbol("CHANNEL"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("IMAGE"), (SubLObject)SubLObjectFactory.makeKeyword("CHANNEL"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RMT-IMG-CONN-IMAGE"), (SubLObject)SubLObjectFactory.makeSymbol("RMT-IMG-CONN-CHANNEL"));
        $list33 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RMT-IMG-CONN-IMAGE"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-RMT-IMG-CONN-CHANNEL"));
        $sym34$PRINT_REMOTE_IMAGE_CONNECTION = SubLObjectFactory.makeSymbol("PRINT-REMOTE-IMAGE-CONNECTION");
        $sym35$REMOTE_IMAGE_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("REMOTE-IMAGE-CONNECTION-PRINT-FUNCTION-TRAMPOLINE");
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("REMOTE-IMAGE-CONNECTION-P"));
        $sym37$RMT_IMG_CONN_IMAGE = SubLObjectFactory.makeSymbol("RMT-IMG-CONN-IMAGE");
        $sym38$_CSETF_RMT_IMG_CONN_IMAGE = SubLObjectFactory.makeSymbol("_CSETF-RMT-IMG-CONN-IMAGE");
        $sym39$RMT_IMG_CONN_CHANNEL = SubLObjectFactory.makeSymbol("RMT-IMG-CONN-CHANNEL");
        $sym40$_CSETF_RMT_IMG_CONN_CHANNEL = SubLObjectFactory.makeSymbol("_CSETF-RMT-IMG-CONN-CHANNEL");
        $kw41$IMAGE = SubLObjectFactory.makeKeyword("IMAGE");
        $kw42$CHANNEL = SubLObjectFactory.makeKeyword("CHANNEL");
        $sym43$MAKE_REMOTE_IMAGE_CONNECTION = SubLObjectFactory.makeSymbol("MAKE-REMOTE-IMAGE-CONNECTION");
        $sym44$VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_CONNECTION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-CONNECTION-METHOD");
        $str45$_CONNECTION_to__A___A__ = SubLObjectFactory.makeString("<CONNECTION to ~A (~A)>");
        $str46$open = SubLObjectFactory.makeString("open");
        $str47$closed = SubLObjectFactory.makeString("closed");
        $kw48$PRIVATE = SubLObjectFactory.makeKeyword("PRIVATE");
        $kw49$IGNORE_ERRORS_TARGET = SubLObjectFactory.makeKeyword("IGNORE-ERRORS-TARGET");
        $sym50$IGNORE_ERRORS_HANDLER = SubLObjectFactory.makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");
        $list51 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("API-QUIT"));
        $list52 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CONNECTION"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym53$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym54$_CURRENT_REMOTE_IMAGE_CONNECTION_ = SubLObjectFactory.makeSymbol("*CURRENT-REMOTE-IMAGE-CONNECTION*");
        $list55 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REMOTE-IMAGE"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym56$CONNECTION = SubLObjectFactory.makeUninternedSymbol("CONNECTION");
        $sym57$NEW_REMOTE_IMAGE_CONNECTION = SubLObjectFactory.makeSymbol("NEW-REMOTE-IMAGE-CONNECTION");
        $sym58$CUNWIND_PROTECT = SubLObjectFactory.makeSymbol("CUNWIND-PROTECT");
        $sym59$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $sym60$OPEN_REMOTE_IMAGE_CONNECTION = SubLObjectFactory.makeSymbol("OPEN-REMOTE-IMAGE-CONNECTION");
        $sym61$WITH_REMOTE_IMAGE_CONNECTION = SubLObjectFactory.makeSymbol("WITH-REMOTE-IMAGE-CONNECTION");
        $sym62$CLOSE_REMOTE_IMAGE_CONNECTION = SubLObjectFactory.makeSymbol("CLOSE-REMOTE-IMAGE-CONNECTION");
    }
    
    public static final class $remote_image_native extends SubLStructNative
    {
        public SubLObject $machine;
        public SubLObject $port;
        public SubLObject $protocol;
        private static final SubLStructDeclNative structDecl;
        
        public $remote_image_native() {
            this.$machine = (SubLObject)CommonSymbols.NIL;
            this.$port = (SubLObject)CommonSymbols.NIL;
            this.$protocol = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$remote_image_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$machine;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$port;
        }
        
        @Override
		public SubLObject getField4() {
            return this.$protocol;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$machine = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$port = value;
        }
        
        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$protocol = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$remote_image_native.class, remote_image.$sym3$REMOTE_IMAGE, remote_image.$sym4$REMOTE_IMAGE_P, remote_image.$list5, remote_image.$list6, new String[] { "$machine", "$port", "$protocol" }, remote_image.$list7, remote_image.$list8, remote_image.$sym9$PRINT_REMOTE_IMAGE);
        }
    }
    
    public static final class $remote_image_p$UnaryFunction extends UnaryFunction
    {
        public $remote_image_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOTE-IMAGE-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return remote_image.remote_image_p(arg1);
        }
    }
    
    public static final class $remote_image_connection_native extends SubLStructNative
    {
        public SubLObject $image;
        public SubLObject $channel;
        private static final SubLStructDeclNative structDecl;
        
        public $remote_image_connection_native() {
            this.$image = (SubLObject)CommonSymbols.NIL;
            this.$channel = (SubLObject)CommonSymbols.NIL;
        }
        
        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$remote_image_connection_native.structDecl;
        }
        
        @Override
		public SubLObject getField2() {
            return this.$image;
        }
        
        @Override
		public SubLObject getField3() {
            return this.$channel;
        }
        
        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$image = value;
        }
        
        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$channel = value;
        }
        
        static {
            structDecl = Structures.makeStructDeclNative((Class)$remote_image_connection_native.class, remote_image.$sym28$REMOTE_IMAGE_CONNECTION, remote_image.$sym29$REMOTE_IMAGE_CONNECTION_P, remote_image.$list30, remote_image.$list31, new String[] { "$image", "$channel" }, remote_image.$list32, remote_image.$list33, remote_image.$sym34$PRINT_REMOTE_IMAGE_CONNECTION);
        }
    }
    
    public static final class $remote_image_connection_p$UnaryFunction extends UnaryFunction
    {
        public $remote_image_connection_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("REMOTE-IMAGE-CONNECTION-P"));
        }
        
        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return remote_image.remote_image_connection_p(arg1);
        }
    }
}

/*

	Total time: 180 ms
	
*/