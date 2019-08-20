/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      REMOTE-IMAGE
 * source file: /cyc/top/cycl/remote-image.lisp
 * created:     2019/07/03 17:37:16
 */
public final class remote_image extends SubLTranslatedFile implements V12 {
    public static final class $remote_image_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.remote_image.$remote_image_native.this.$machine;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.remote_image.$remote_image_native.this.$port;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.remote_image.$remote_image_native.this.$protocol;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.remote_image.$remote_image_native.this.$machine = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.remote_image.$remote_image_native.this.$port = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.remote_image.$remote_image_native.this.$protocol = value;
        }

        public SubLObject $machine = Lisp.NIL;

        public SubLObject $port = Lisp.NIL;

        public SubLObject $protocol = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.remote_image.$remote_image_native.class, REMOTE_IMAGE, REMOTE_IMAGE_P, $list_alt5, $list_alt6, new String[]{ "$machine", "$port", "$protocol" }, $list_alt7, $list_alt8, PRINT_REMOTE_IMAGE);
    }

    public static final SubLFile me = new remote_image();



    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_remote_image$ = makeSymbol("*DTP-REMOTE-IMAGE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_remote_image_connection$ = makeSymbol("*DTP-REMOTE-IMAGE-CONNECTION*");

    static private final SubLString $str2$Unknown_API_protocol__S = makeString("Unknown API protocol ~S");

    private static final SubLSymbol REMOTE_IMAGE = makeSymbol("REMOTE-IMAGE");

    private static final SubLSymbol REMOTE_IMAGE_P = makeSymbol("REMOTE-IMAGE-P");

    static private final SubLList $list5 = list(makeSymbol("MACHINE"), makeSymbol("PORT"), makeSymbol("PROTOCOL"));

    static private final SubLList $list6 = list(makeKeyword("MACHINE"), $PORT, makeKeyword("PROTOCOL"));

    static private final SubLList $list7 = list(makeSymbol("RMT-IMG-MACHINE"), makeSymbol("RMT-IMG-PORT"), makeSymbol("RMT-IMG-PROTOCOL"));

    static private final SubLList $list8 = list(makeSymbol("_CSETF-RMT-IMG-MACHINE"), makeSymbol("_CSETF-RMT-IMG-PORT"), makeSymbol("_CSETF-RMT-IMG-PROTOCOL"));

    private static final SubLSymbol PRINT_REMOTE_IMAGE = makeSymbol("PRINT-REMOTE-IMAGE");

    private static final SubLSymbol REMOTE_IMAGE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOTE-IMAGE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REMOTE-IMAGE-P"));

    private static final SubLSymbol RMT_IMG_MACHINE = makeSymbol("RMT-IMG-MACHINE");

    private static final SubLSymbol _CSETF_RMT_IMG_MACHINE = makeSymbol("_CSETF-RMT-IMG-MACHINE");

    private static final SubLSymbol RMT_IMG_PORT = makeSymbol("RMT-IMG-PORT");

    private static final SubLSymbol _CSETF_RMT_IMG_PORT = makeSymbol("_CSETF-RMT-IMG-PORT");

    private static final SubLSymbol RMT_IMG_PROTOCOL = makeSymbol("RMT-IMG-PROTOCOL");

    private static final SubLSymbol _CSETF_RMT_IMG_PROTOCOL = makeSymbol("_CSETF-RMT-IMG-PROTOCOL");

    private static final SubLString $str21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_REMOTE_IMAGE = makeSymbol("MAKE-REMOTE-IMAGE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-METHOD");

    private static final SubLString $str27$_REMOTE_IMAGE__A__A__A_ = makeString("<REMOTE IMAGE ~A ~A ~A>");

    private static final SubLSymbol REMOTE_IMAGE_CONNECTION = makeSymbol("REMOTE-IMAGE-CONNECTION");

    private static final SubLSymbol REMOTE_IMAGE_CONNECTION_P = makeSymbol("REMOTE-IMAGE-CONNECTION-P");

    private static final SubLList $list30 = list(makeSymbol("IMAGE"), makeSymbol("CHANNEL"));

    private static final SubLList $list31 = list(makeKeyword("IMAGE"), makeKeyword("CHANNEL"));

    private static final SubLList $list32 = list(makeSymbol("RMT-IMG-CONN-IMAGE"), makeSymbol("RMT-IMG-CONN-CHANNEL"));

    private static final SubLList $list33 = list(makeSymbol("_CSETF-RMT-IMG-CONN-IMAGE"), makeSymbol("_CSETF-RMT-IMG-CONN-CHANNEL"));

    private static final SubLSymbol PRINT_REMOTE_IMAGE_CONNECTION = makeSymbol("PRINT-REMOTE-IMAGE-CONNECTION");

    private static final SubLSymbol REMOTE_IMAGE_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("REMOTE-IMAGE-CONNECTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list36 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("REMOTE-IMAGE-CONNECTION-P"));

    private static final SubLSymbol RMT_IMG_CONN_IMAGE = makeSymbol("RMT-IMG-CONN-IMAGE");

    private static final SubLSymbol _CSETF_RMT_IMG_CONN_IMAGE = makeSymbol("_CSETF-RMT-IMG-CONN-IMAGE");

    private static final SubLSymbol RMT_IMG_CONN_CHANNEL = makeSymbol("RMT-IMG-CONN-CHANNEL");

    private static final SubLSymbol _CSETF_RMT_IMG_CONN_CHANNEL = makeSymbol("_CSETF-RMT-IMG-CONN-CHANNEL");

    private static final SubLSymbol MAKE_REMOTE_IMAGE_CONNECTION = makeSymbol("MAKE-REMOTE-IMAGE-CONNECTION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_CONNECTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-CONNECTION-METHOD");

    private static final SubLString $str45$_CONNECTION_to__A___A__ = makeString("<CONNECTION to ~A (~A)>");

    private static final SubLString $$$open = makeString("open");

    private static final SubLString $$$closed = makeString("closed");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLList $list51 = list(makeSymbol("API-QUIT"));

    private static final SubLList $list52 = list(makeSymbol("CONNECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $current_remote_image_connection$ = makeSymbol("*CURRENT-REMOTE-IMAGE-CONNECTION*");

    private static final SubLList $list55 = list(makeSymbol("REMOTE-IMAGE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym56$CONNECTION = makeUninternedSymbol("CONNECTION");

    private static final SubLSymbol NEW_REMOTE_IMAGE_CONNECTION = makeSymbol("NEW-REMOTE-IMAGE-CONNECTION");

    private static final SubLSymbol OPEN_REMOTE_IMAGE_CONNECTION = makeSymbol("OPEN-REMOTE-IMAGE-CONNECTION");

    private static final SubLSymbol WITH_REMOTE_IMAGE_CONNECTION = makeSymbol("WITH-REMOTE-IMAGE-CONNECTION");

    private static final SubLSymbol CLOSE_REMOTE_IMAGE_CONNECTION = makeSymbol("CLOSE-REMOTE-IMAGE-CONNECTION");

    // Definitions
    public static final SubLObject api_channel_remote_eval_alt(SubLObject api_request, SubLObject channel, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        {
            SubLObject pcase_var = protocol;
            if (pcase_var.eql($CFASL)) {
                return cfasl_kernel.cfasl_channel_eval(api_request, channel);
            } else {
                if (pcase_var.eql($CYC_API)) {
                    return api_kernel.cyc_api_channel_eval(api_request, channel);
                } else {
                    return Errors.error($str_alt2$Unknown_API_protocol__S, protocol);
                }
            }
        }
    }

    // Definitions
    public static SubLObject api_channel_remote_eval(final SubLObject api_request, final SubLObject channel, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        final SubLObject pcase_var = protocol;
        if (pcase_var.eql($CFASL)) {
            return cfasl_kernel.cfasl_channel_eval(api_request, channel);
        }
        if (pcase_var.eql($CYC_API)) {
            return api_kernel.cyc_api_channel_eval(api_request, channel);
        }
        return Errors.error($str2$Unknown_API_protocol__S, protocol);
    }

    public static final SubLObject remote_image_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_remote_image(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject remote_image_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_remote_image(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject remote_image_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.remote_image.$remote_image_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject remote_image_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.remote_image.$remote_image_native.class ? T : NIL;
    }

    public static final SubLObject rmt_img_machine_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOTE_IMAGE_P);
        return v_object.getField2();
    }

    public static SubLObject rmt_img_machine(final SubLObject v_object) {
        assert NIL != remote_image_p(v_object) : "! remote_image.remote_image_p(v_object) " + "remote_image.remote_image_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rmt_img_port_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOTE_IMAGE_P);
        return v_object.getField3();
    }

    public static SubLObject rmt_img_port(final SubLObject v_object) {
        assert NIL != remote_image_p(v_object) : "! remote_image.remote_image_p(v_object) " + "remote_image.remote_image_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rmt_img_protocol_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOTE_IMAGE_P);
        return v_object.getField4();
    }

    public static SubLObject rmt_img_protocol(final SubLObject v_object) {
        assert NIL != remote_image_p(v_object) : "! remote_image.remote_image_p(v_object) " + "remote_image.remote_image_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_rmt_img_machine_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOTE_IMAGE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rmt_img_machine(final SubLObject v_object, final SubLObject value) {
        assert NIL != remote_image_p(v_object) : "! remote_image.remote_image_p(v_object) " + "remote_image.remote_image_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rmt_img_port_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOTE_IMAGE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rmt_img_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != remote_image_p(v_object) : "! remote_image.remote_image_p(v_object) " + "remote_image.remote_image_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rmt_img_protocol_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOTE_IMAGE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rmt_img_protocol(final SubLObject v_object, final SubLObject value) {
        assert NIL != remote_image_p(v_object) : "! remote_image.remote_image_p(v_object) " + "remote_image.remote_image_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_remote_image_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.remote_image.$remote_image_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($MACHINE)) {
                        _csetf_rmt_img_machine(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PORT)) {
                            _csetf_rmt_img_port(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PROTOCOL)) {
                                _csetf_rmt_img_protocol(v_new, current_value);
                            } else {
                                Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_remote_image(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.remote_image.$remote_image_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MACHINE)) {
                _csetf_rmt_img_machine(v_new, current_value);
            } else
                if (pcase_var.eql($PORT)) {
                    _csetf_rmt_img_port(v_new, current_value);
                } else
                    if (pcase_var.eql($PROTOCOL)) {
                        _csetf_rmt_img_protocol(v_new, current_value);
                    } else {
                        Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_remote_image(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REMOTE_IMAGE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MACHINE, rmt_img_machine(obj));
        funcall(visitor_fn, obj, $SLOT, $PORT, rmt_img_port(obj));
        funcall(visitor_fn, obj, $SLOT, $PROTOCOL, rmt_img_protocol(obj));
        funcall(visitor_fn, obj, $END, MAKE_REMOTE_IMAGE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_remote_image_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_remote_image(obj, visitor_fn);
    }

    public static final SubLObject print_remote_image_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt21$_REMOTE_IMAGE__A__A__A_, new SubLObject[]{ remote_image_machine(v_object), remote_image_port(v_object), remote_image_protocol(v_object) });
        return NIL;
    }

    public static SubLObject print_remote_image(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str27$_REMOTE_IMAGE__A__A__A_, new SubLObject[]{ remote_image_machine(v_object), remote_image_port(v_object), remote_image_protocol(v_object) });
        return NIL;
    }

    public static final SubLObject new_remote_image_alt(SubLObject machine, SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        {
            SubLObject v_remote_image = make_remote_image(UNPROVIDED);
            _csetf_rmt_img_machine(v_remote_image, machine);
            _csetf_rmt_img_port(v_remote_image, port);
            _csetf_rmt_img_protocol(v_remote_image, protocol);
            return v_remote_image;
        }
    }

    public static SubLObject new_remote_image(final SubLObject machine, final SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        final SubLObject v_remote_image = make_remote_image(UNPROVIDED);
        _csetf_rmt_img_machine(v_remote_image, machine);
        _csetf_rmt_img_port(v_remote_image, port);
        _csetf_rmt_img_protocol(v_remote_image, protocol);
        return v_remote_image;
    }

    public static final SubLObject remote_image_machine_alt(SubLObject v_remote_image) {
        return rmt_img_machine(v_remote_image);
    }

    public static SubLObject remote_image_machine(final SubLObject v_remote_image) {
        return rmt_img_machine(v_remote_image);
    }

    public static final SubLObject remote_image_port_alt(SubLObject v_remote_image) {
        return rmt_img_port(v_remote_image);
    }

    public static SubLObject remote_image_port(final SubLObject v_remote_image) {
        return rmt_img_port(v_remote_image);
    }

    public static final SubLObject remote_image_protocol_alt(SubLObject v_remote_image) {
        return rmt_img_protocol(v_remote_image);
    }

    public static SubLObject remote_image_protocol(final SubLObject v_remote_image) {
        return rmt_img_protocol(v_remote_image);
    }

    public static final SubLObject remote_image_connection_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_remote_image_connection(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject remote_image_connection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_remote_image_connection(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject remote_image_connection_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.remote_image.$remote_image_connection_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject remote_image_connection_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.remote_image.$remote_image_connection_native.class ? T : NIL;
    }

    public static final SubLObject rmt_img_conn_image_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOTE_IMAGE_CONNECTION_P);
        return v_object.getField2();
    }

    public static SubLObject rmt_img_conn_image(final SubLObject v_object) {
        assert NIL != remote_image_connection_p(v_object) : "! remote_image.remote_image_connection_p(v_object) " + "remote_image.remote_image_connection_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rmt_img_conn_channel_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, REMOTE_IMAGE_CONNECTION_P);
        return v_object.getField3();
    }

    public static SubLObject rmt_img_conn_channel(final SubLObject v_object) {
        assert NIL != remote_image_connection_p(v_object) : "! remote_image.remote_image_connection_p(v_object) " + "remote_image.remote_image_connection_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject _csetf_rmt_img_conn_image_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOTE_IMAGE_CONNECTION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rmt_img_conn_image(final SubLObject v_object, final SubLObject value) {
        assert NIL != remote_image_connection_p(v_object) : "! remote_image.remote_image_connection_p(v_object) " + "remote_image.remote_image_connection_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rmt_img_conn_channel_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, REMOTE_IMAGE_CONNECTION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rmt_img_conn_channel(final SubLObject v_object, final SubLObject value) {
        assert NIL != remote_image_connection_p(v_object) : "! remote_image.remote_image_connection_p(v_object) " + "remote_image.remote_image_connection_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject make_remote_image_connection_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.remote_image.$remote_image_connection_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($IMAGE)) {
                        _csetf_rmt_img_conn_image(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CHANNEL)) {
                            _csetf_rmt_img_conn_channel(v_new, current_value);
                        } else {
                            Errors.error($str_alt20$Invalid_slot__S_for_construction_, current_arg);
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_remote_image_connection(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.remote_image.$remote_image_connection_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($IMAGE)) {
                _csetf_rmt_img_conn_image(v_new, current_value);
            } else
                if (pcase_var.eql($CHANNEL)) {
                    _csetf_rmt_img_conn_channel(v_new, current_value);
                } else {
                    Errors.error($str21$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_remote_image_connection(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_REMOTE_IMAGE_CONNECTION, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $IMAGE, rmt_img_conn_image(obj));
        funcall(visitor_fn, obj, $SLOT, $CHANNEL, rmt_img_conn_channel(obj));
        funcall(visitor_fn, obj, $END, MAKE_REMOTE_IMAGE_CONNECTION, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_remote_image_connection_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_remote_image_connection(obj, visitor_fn);
    }

    public static final SubLObject print_remote_image_connection_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt36$_CONNECTION_to__A___A__, remote_image_connection_image(v_object), remote_image_connection_channel(v_object).isStream() ? ((SubLObject) ($$$open)) : $$$closed);
        return NIL;
    }

    public static SubLObject print_remote_image_connection(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str45$_CONNECTION_to__A___A__, remote_image_connection_image(v_object), remote_image_connection_channel(v_object).isStream() ? $$$open : $$$closed);
        return NIL;
    }

    public static final SubLObject new_remote_image_connection_alt(SubLObject v_remote_image) {
        {
            SubLObject connection = make_remote_image_connection(UNPROVIDED);
            _csetf_rmt_img_conn_image(connection, v_remote_image);
            _csetf_rmt_img_conn_channel(connection, NIL);
            return connection;
        }
    }

    public static SubLObject new_remote_image_connection(final SubLObject v_remote_image) {
        final SubLObject connection = make_remote_image_connection(UNPROVIDED);
        _csetf_rmt_img_conn_image(connection, v_remote_image);
        _csetf_rmt_img_conn_channel(connection, NIL);
        return connection;
    }

    public static final SubLObject remote_image_connection_image_alt(SubLObject connection) {
        return rmt_img_conn_image(connection);
    }

    public static SubLObject remote_image_connection_image(final SubLObject connection) {
        return rmt_img_conn_image(connection);
    }

    public static final SubLObject remote_image_connection_channel_alt(SubLObject connection) {
        return rmt_img_conn_channel(connection);
    }

    public static SubLObject remote_image_connection_channel(final SubLObject connection) {
        return rmt_img_conn_channel(connection);
    }

    public static final SubLObject open_remote_image_connection_alt(SubLObject connection) {
        {
            SubLObject channel = remote_image_connection_channel(connection);
            if (NIL != channel) {
                return NIL;
            }
            {
                SubLObject machine = remote_image_connection_machine(connection);
                SubLObject port = remote_image_connection_port(connection);
                channel = subl_promotions.open_tcp_stream_with_access(machine, port, $PRIVATE);
                _csetf_rmt_img_conn_channel(connection, channel);
                return T;
            }
        }
    }

    public static SubLObject open_remote_image_connection(final SubLObject connection) {
        SubLObject channel = remote_image_connection_channel(connection);
        if (NIL != channel) {
            return NIL;
        }
        final SubLObject machine = remote_image_connection_machine(connection);
        final SubLObject port = remote_image_connection_port(connection);
        channel = subl_promotions.open_tcp_stream_with_timeout(machine, port, NIL, $PRIVATE);
        _csetf_rmt_img_conn_channel(connection, channel);
        return T;
    }

    public static final SubLObject close_remote_image_connection_alt(SubLObject connection) {
        {
            SubLObject channel = remote_image_connection_channel(connection);
            if (NIL == channel) {
                return NIL;
            }
            {
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                            try {
                                try {
                                    try {
                                        remote_image_connection_eval(connection, $list_alt42);
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_1 = currentBinding($is_thread_performing_cleanupP$);
                                            try {
                                                bind($is_thread_performing_cleanupP$, T);
                                                close(channel, UNPROVIDED);
                                            } finally {
                                                rebind($is_thread_performing_cleanupP$, _prev_bind_0_1);
                                            }
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_2 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            _csetf_rmt_img_conn_channel(connection, NIL);
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_2);
                                        }
                                    }
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                }
            }
            return T;
        }
    }

    public static SubLObject close_remote_image_connection(final SubLObject connection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject channel = remote_image_connection_channel(connection);
        if (NIL == channel) {
            return NIL;
        }
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    try {
                        try {
                            remote_image_connection_eval(connection, $list51);
                        } finally {
                            final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                close(channel, UNPROVIDED);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            _csetf_rmt_img_conn_channel(connection, NIL);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
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
        return T;
    }

    public static final SubLObject remote_image_connection_openP_alt(SubLObject connection) {
        return streamp(remote_image_connection_channel(connection));
    }

    public static SubLObject remote_image_connection_openP(final SubLObject connection) {
        return streamp(remote_image_connection_channel(connection));
    }

    public static final SubLObject remote_image_connection_closedP_alt(SubLObject connection) {
        return makeBoolean(!remote_image_connection_channel(connection).isStream());
    }

    public static SubLObject remote_image_connection_closedP(final SubLObject connection) {
        return makeBoolean(!remote_image_connection_channel(connection).isStream());
    }

    public static final SubLObject remote_image_connection_machine_alt(SubLObject connection) {
        return remote_image_machine(remote_image_connection_image(connection));
    }

    public static SubLObject remote_image_connection_machine(final SubLObject connection) {
        return remote_image_machine(remote_image_connection_image(connection));
    }

    public static final SubLObject remote_image_connection_port_alt(SubLObject connection) {
        return remote_image_port(remote_image_connection_image(connection));
    }

    public static SubLObject remote_image_connection_port(final SubLObject connection) {
        return remote_image_port(remote_image_connection_image(connection));
    }

    public static final SubLObject remote_image_connection_protocol_alt(SubLObject connection) {
        return remote_image_protocol(remote_image_connection_image(connection));
    }

    public static SubLObject remote_image_connection_protocol(final SubLObject connection) {
        return remote_image_protocol(remote_image_connection_image(connection));
    }

    public static final SubLObject reopen_remote_image_connection_alt(SubLObject connection) {
        SubLTrampolineFile.checkType(connection, REMOTE_IMAGE_CONNECTION_P);
        close_remote_image_connection(connection);
        open_remote_image_connection(connection);
        return connection;
    }

    public static SubLObject reopen_remote_image_connection(final SubLObject connection) {
        assert NIL != remote_image_connection_p(connection) : "! remote_image.remote_image_connection_p(connection) " + ("remote_image.remote_image_connection_p(connection) " + "CommonSymbols.NIL != remote_image.remote_image_connection_p(connection) ") + connection;
        close_remote_image_connection(connection);
        open_remote_image_connection(connection);
        return connection;
    }

    public static final SubLObject remote_image_connection_eval_alt(SubLObject connection, SubLObject api_request) {
        {
            SubLObject channel = remote_image_connection_channel(connection);
            SubLObject protocol = remote_image_connection_protocol(connection);
            return api_channel_remote_eval(api_request, channel, protocol);
        }
    }

    public static SubLObject remote_image_connection_eval(final SubLObject connection, final SubLObject api_request) {
        final SubLObject channel = remote_image_connection_channel(connection);
        final SubLObject protocol = remote_image_connection_protocol(connection);
        return api_channel_remote_eval(api_request, channel, protocol);
    }

    public static final SubLObject with_remote_image_connection_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject connection = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            connection = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($current_remote_image_connection$, connection)), append(body, NIL));
            }
        }
    }

    public static SubLObject with_remote_image_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject connection = NIL;
        destructuring_bind_must_consp(current, datum, $list52);
        connection = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($current_remote_image_connection$, connection)), append(body, NIL));
    }

    public static final SubLObject current_remote_image_connection_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $current_remote_image_connection$.getDynamicValue(thread);
        }
    }

    public static SubLObject current_remote_image_connection() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $current_remote_image_connection$.getDynamicValue(thread);
    }

    public static final SubLObject current_remote_image_connection_eval_alt(SubLObject api_request) {
        return remote_image_connection_eval(current_remote_image_connection(), api_request);
    }

    public static SubLObject current_remote_image_connection_eval(final SubLObject api_request) {
        return remote_image_connection_eval(current_remote_image_connection(), api_request);
    }

    public static final SubLObject with_new_remote_image_connection_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_remote_image = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt46);
            v_remote_image = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject connection = $sym47$CONNECTION;
                return list(CLET, list(list(connection, list(NEW_REMOTE_IMAGE_CONNECTION, v_remote_image))), list(CUNWIND_PROTECT, list(PROGN, list(OPEN_REMOTE_IMAGE_CONNECTION, connection), listS(WITH_REMOTE_IMAGE_CONNECTION, connection, append(body, NIL))), list(CLOSE_REMOTE_IMAGE_CONNECTION, connection)));
            }
        }
    }

    public static SubLObject with_new_remote_image_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_remote_image = NIL;
        destructuring_bind_must_consp(current, datum, $list55);
        v_remote_image = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject connection = $sym56$CONNECTION;
        return list(CLET, list(list(connection, list(NEW_REMOTE_IMAGE_CONNECTION, v_remote_image))), list(CUNWIND_PROTECT, list(PROGN, list(OPEN_REMOTE_IMAGE_CONNECTION, connection), listS(WITH_REMOTE_IMAGE_CONNECTION, connection, append(body, NIL))), list(CLOSE_REMOTE_IMAGE_CONNECTION, connection)));
    }

    public static SubLObject declare_remote_image_file() {
        declareFunction("api_channel_remote_eval", "API-CHANNEL-REMOTE-EVAL", 2, 1, false);
        declareFunction("remote_image_print_function_trampoline", "REMOTE-IMAGE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("remote_image_p", "REMOTE-IMAGE-P", 1, 0, false);
        new remote_image.$remote_image_p$UnaryFunction();
        declareFunction("rmt_img_machine", "RMT-IMG-MACHINE", 1, 0, false);
        declareFunction("rmt_img_port", "RMT-IMG-PORT", 1, 0, false);
        declareFunction("rmt_img_protocol", "RMT-IMG-PROTOCOL", 1, 0, false);
        declareFunction("_csetf_rmt_img_machine", "_CSETF-RMT-IMG-MACHINE", 2, 0, false);
        declareFunction("_csetf_rmt_img_port", "_CSETF-RMT-IMG-PORT", 2, 0, false);
        declareFunction("_csetf_rmt_img_protocol", "_CSETF-RMT-IMG-PROTOCOL", 2, 0, false);
        declareFunction("make_remote_image", "MAKE-REMOTE-IMAGE", 0, 1, false);
        declareFunction("visit_defstruct_remote_image", "VISIT-DEFSTRUCT-REMOTE-IMAGE", 2, 0, false);
        declareFunction("visit_defstruct_object_remote_image_method", "VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-METHOD", 2, 0, false);
        declareFunction("print_remote_image", "PRINT-REMOTE-IMAGE", 3, 0, false);
        declareFunction("new_remote_image", "NEW-REMOTE-IMAGE", 2, 1, false);
        declareFunction("remote_image_machine", "REMOTE-IMAGE-MACHINE", 1, 0, false);
        declareFunction("remote_image_port", "REMOTE-IMAGE-PORT", 1, 0, false);
        declareFunction("remote_image_protocol", "REMOTE-IMAGE-PROTOCOL", 1, 0, false);
        declareFunction("remote_image_connection_print_function_trampoline", "REMOTE-IMAGE-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("remote_image_connection_p", "REMOTE-IMAGE-CONNECTION-P", 1, 0, false);
        new remote_image.$remote_image_connection_p$UnaryFunction();
        declareFunction("rmt_img_conn_image", "RMT-IMG-CONN-IMAGE", 1, 0, false);
        declareFunction("rmt_img_conn_channel", "RMT-IMG-CONN-CHANNEL", 1, 0, false);
        declareFunction("_csetf_rmt_img_conn_image", "_CSETF-RMT-IMG-CONN-IMAGE", 2, 0, false);
        declareFunction("_csetf_rmt_img_conn_channel", "_CSETF-RMT-IMG-CONN-CHANNEL", 2, 0, false);
        declareFunction("make_remote_image_connection", "MAKE-REMOTE-IMAGE-CONNECTION", 0, 1, false);
        declareFunction("visit_defstruct_remote_image_connection", "VISIT-DEFSTRUCT-REMOTE-IMAGE-CONNECTION", 2, 0, false);
        declareFunction("visit_defstruct_object_remote_image_connection_method", "VISIT-DEFSTRUCT-OBJECT-REMOTE-IMAGE-CONNECTION-METHOD", 2, 0, false);
        declareFunction("print_remote_image_connection", "PRINT-REMOTE-IMAGE-CONNECTION", 3, 0, false);
        declareFunction("new_remote_image_connection", "NEW-REMOTE-IMAGE-CONNECTION", 1, 0, false);
        declareFunction("remote_image_connection_image", "REMOTE-IMAGE-CONNECTION-IMAGE", 1, 0, false);
        declareFunction("remote_image_connection_channel", "REMOTE-IMAGE-CONNECTION-CHANNEL", 1, 0, false);
        declareFunction("open_remote_image_connection", "OPEN-REMOTE-IMAGE-CONNECTION", 1, 0, false);
        declareFunction("close_remote_image_connection", "CLOSE-REMOTE-IMAGE-CONNECTION", 1, 0, false);
        declareFunction("remote_image_connection_openP", "REMOTE-IMAGE-CONNECTION-OPEN?", 1, 0, false);
        declareFunction("remote_image_connection_closedP", "REMOTE-IMAGE-CONNECTION-CLOSED?", 1, 0, false);
        declareFunction("remote_image_connection_machine", "REMOTE-IMAGE-CONNECTION-MACHINE", 1, 0, false);
        declareFunction("remote_image_connection_port", "REMOTE-IMAGE-CONNECTION-PORT", 1, 0, false);
        declareFunction("remote_image_connection_protocol", "REMOTE-IMAGE-CONNECTION-PROTOCOL", 1, 0, false);
        declareFunction("reopen_remote_image_connection", "REOPEN-REMOTE-IMAGE-CONNECTION", 1, 0, false);
        declareFunction("remote_image_connection_eval", "REMOTE-IMAGE-CONNECTION-EVAL", 2, 0, false);
        declareMacro("with_remote_image_connection", "WITH-REMOTE-IMAGE-CONNECTION");
        declareFunction("current_remote_image_connection", "CURRENT-REMOTE-IMAGE-CONNECTION", 0, 0, false);
        declareFunction("current_remote_image_connection_eval", "CURRENT-REMOTE-IMAGE-CONNECTION-EVAL", 1, 0, false);
        declareMacro("with_new_remote_image_connection", "WITH-NEW-REMOTE-IMAGE-CONNECTION");
        return NIL;
    }

    static private final SubLString $str_alt2$Unknown_API_protocol__S = makeString("Unknown API protocol ~S");

    static private final SubLList $list_alt5 = list(makeSymbol("MACHINE"), makeSymbol("PORT"), makeSymbol("PROTOCOL"));

    static private final SubLList $list_alt6 = list(makeKeyword("MACHINE"), $PORT, makeKeyword("PROTOCOL"));

    static private final SubLList $list_alt7 = list(makeSymbol("RMT-IMG-MACHINE"), makeSymbol("RMT-IMG-PORT"), makeSymbol("RMT-IMG-PROTOCOL"));

    static private final SubLList $list_alt8 = list(makeSymbol("_CSETF-RMT-IMG-MACHINE"), makeSymbol("_CSETF-RMT-IMG-PORT"), makeSymbol("_CSETF-RMT-IMG-PROTOCOL"));

    static private final SubLString $str_alt20$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt21$_REMOTE_IMAGE__A__A__A_ = makeString("<REMOTE IMAGE ~A ~A ~A>");

    static private final SubLList $list_alt24 = list(makeSymbol("IMAGE"), makeSymbol("CHANNEL"));

    static private final SubLList $list_alt25 = list(makeKeyword("IMAGE"), makeKeyword("CHANNEL"));

    static private final SubLList $list_alt26 = list(makeSymbol("RMT-IMG-CONN-IMAGE"), makeSymbol("RMT-IMG-CONN-CHANNEL"));

    static private final SubLList $list_alt27 = list(makeSymbol("_CSETF-RMT-IMG-CONN-IMAGE"), makeSymbol("_CSETF-RMT-IMG-CONN-CHANNEL"));

    public static SubLObject init_remote_image_file() {
        defconstant("*DTP-REMOTE-IMAGE*", REMOTE_IMAGE);
        defconstant("*DTP-REMOTE-IMAGE-CONNECTION*", REMOTE_IMAGE_CONNECTION);
        defparameter("*CURRENT-REMOTE-IMAGE-CONNECTION*", NIL);
        return NIL;
    }

    static private final SubLString $str_alt36$_CONNECTION_to__A___A__ = makeString("<CONNECTION to ~A (~A)>");

    public static SubLObject setup_remote_image_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_remote_image$.getGlobalValue(), symbol_function(REMOTE_IMAGE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list11);
        def_csetf(RMT_IMG_MACHINE, _CSETF_RMT_IMG_MACHINE);
        def_csetf(RMT_IMG_PORT, _CSETF_RMT_IMG_PORT);
        def_csetf(RMT_IMG_PROTOCOL, _CSETF_RMT_IMG_PROTOCOL);
        identity(REMOTE_IMAGE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_remote_image$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_remote_image_connection$.getGlobalValue(), symbol_function(REMOTE_IMAGE_CONNECTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list36);
        def_csetf(RMT_IMG_CONN_IMAGE, _CSETF_RMT_IMG_CONN_IMAGE);
        def_csetf(RMT_IMG_CONN_CHANNEL, _CSETF_RMT_IMG_CONN_CHANNEL);
        identity(REMOTE_IMAGE_CONNECTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_remote_image_connection$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_REMOTE_IMAGE_CONNECTION_METHOD));
        return NIL;
    }

    static private final SubLList $list_alt42 = list(makeSymbol("API-QUIT"));

    static private final SubLList $list_alt43 = list(makeSymbol("CONNECTION"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt46 = list(makeSymbol("REMOTE-IMAGE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym47$CONNECTION = makeUninternedSymbol("CONNECTION");

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
    }

    public static final class $remote_image_p$UnaryFunction extends UnaryFunction {
        public $remote_image_p$UnaryFunction() {
            super(extractFunctionNamed("REMOTE-IMAGE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return remote_image_p(arg1);
        }
    }

    public static final class $remote_image_connection_native extends SubLStructNative {
        public SubLObject $image;

        public SubLObject $channel;

        private static final SubLStructDeclNative structDecl;

        public $remote_image_connection_native() {
            remote_image.$remote_image_connection_native.this.$image = Lisp.NIL;
            remote_image.$remote_image_connection_native.this.$channel = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return remote_image.$remote_image_connection_native.this.$image;
        }

        @Override
        public SubLObject getField3() {
            return remote_image.$remote_image_connection_native.this.$channel;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return remote_image.$remote_image_connection_native.this.$image = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return remote_image.$remote_image_connection_native.this.$channel = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.remote_image.$remote_image_connection_native.class, REMOTE_IMAGE_CONNECTION, REMOTE_IMAGE_CONNECTION_P, $list30, $list31, new String[]{ "$image", "$channel" }, $list32, $list33, PRINT_REMOTE_IMAGE_CONNECTION);
        }
    }

    public static final class $remote_image_connection_p$UnaryFunction extends UnaryFunction {
        public $remote_image_connection_p$UnaryFunction() {
            super(extractFunctionNamed("REMOTE-IMAGE-CONNECTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return remote_image_connection_p(arg1);
        }
    }
}

/**
 * Total time: 180 ms
 */
