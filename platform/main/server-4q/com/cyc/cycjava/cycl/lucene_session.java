/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LUCENE-SESSION
 * source file: /cyc/top/cycl/lucene-session.lisp
 * created:     2019/07/03 17:38:57
 */
public final class lucene_session extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new lucene_session();



    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $lucene_host$ = makeSymbol("*LUCENE-HOST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $lucene_port$ = makeSymbol("*LUCENE-PORT*");

    // defparameter
    @LispMethod(comment = "Specifying a value for this will override any other setting that might get bound elsewhere\ndefparameter")
    private static final SubLSymbol $lucene_host_override$ = makeSymbol("*LUCENE-HOST-OVERRIDE*");

    // defparameter
    @LispMethod(comment = "Specifying a value for this will override any other settings that might get bound elsewhere\ndefparameter")
    private static final SubLSymbol $lucene_port_override$ = makeSymbol("*LUCENE-PORT-OVERRIDE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $init_lucene_session$ = makeSymbol("*INIT-LUCENE-SESSION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $add_document$ = makeSymbol("*ADD-DOCUMENT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $query$ = makeSymbol("*QUERY*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $optimize$ = makeSymbol("*OPTIMIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $close_index$ = makeSymbol("*CLOSE-INDEX*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $new_index_writer$ = makeSymbol("*NEW-INDEX-WRITER*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_lucene_session$ = makeSymbol("*DTP-LUCENE-SESSION*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$semanticsearch = makeString("semanticsearch");

    private static final SubLInteger $int$1928 = makeInteger(1928);

    static private final SubLList $list2 = list(list(makeSymbol("SESSION"), makeSymbol("INDEX"), makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("HOST"), list(makeSymbol("GET-LUCENE-HOST"))), list(makeSymbol("PORT"), list(makeSymbol("GET-LUCENE-PORT")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol NEW_LUCENE_SESSION = makeSymbol("NEW-LUCENE-SESSION");

    private static final SubLSymbol LUCENE_SESSION_P = makeSymbol("LUCENE-SESSION-P");

    private static final SubLSymbol LUCENE_FINALIZE = makeSymbol("LUCENE-FINALIZE");

    private static final SubLSymbol LUCENE_SESSION = makeSymbol("LUCENE-SESSION");

    static private final SubLList $list12 = list(makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("CONNECTION"), makeSymbol("SESSION-TYPE"), makeSymbol("INDEX"), makeSymbol("OVERWRITE"));

    static private final SubLList $list13 = list($HOST, $PORT, makeKeyword("CONNECTION"), makeKeyword("SESSION-TYPE"), makeKeyword("INDEX"), makeKeyword("OVERWRITE"));

    static private final SubLList $list14 = list(makeSymbol("LUCENE-HOST"), makeSymbol("LUCENE-PORT"), makeSymbol("LUCENE-CONNECTION"), makeSymbol("LUCENE-SESSION-TYPE"), makeSymbol("LUCENE-INDEX"), makeSymbol("LUCENE-OVERWRITE"));

    static private final SubLList $list15 = list(makeSymbol("_CSETF-LUCENE-HOST"), makeSymbol("_CSETF-LUCENE-PORT"), makeSymbol("_CSETF-LUCENE-CONNECTION"), makeSymbol("_CSETF-LUCENE-SESSION-TYPE"), makeSymbol("_CSETF-LUCENE-INDEX"), makeSymbol("_CSETF-LUCENE-OVERWRITE"));

    private static final SubLSymbol LUCENE_PRINT = makeSymbol("LUCENE-PRINT");

    private static final SubLSymbol LUCENE_SESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("LUCENE-SESSION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list18 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("LUCENE-SESSION-P"));

    private static final SubLSymbol LUCENE_HOST = makeSymbol("LUCENE-HOST");

    private static final SubLSymbol _CSETF_LUCENE_HOST = makeSymbol("_CSETF-LUCENE-HOST");

    private static final SubLSymbol LUCENE_PORT = makeSymbol("LUCENE-PORT");

    private static final SubLSymbol _CSETF_LUCENE_PORT = makeSymbol("_CSETF-LUCENE-PORT");

    private static final SubLSymbol LUCENE_CONNECTION = makeSymbol("LUCENE-CONNECTION");

    private static final SubLSymbol _CSETF_LUCENE_CONNECTION = makeSymbol("_CSETF-LUCENE-CONNECTION");

    private static final SubLSymbol LUCENE_SESSION_TYPE = makeSymbol("LUCENE-SESSION-TYPE");

    private static final SubLSymbol _CSETF_LUCENE_SESSION_TYPE = makeSymbol("_CSETF-LUCENE-SESSION-TYPE");

    private static final SubLSymbol LUCENE_INDEX = makeSymbol("LUCENE-INDEX");

    private static final SubLSymbol _CSETF_LUCENE_INDEX = makeSymbol("_CSETF-LUCENE-INDEX");

    private static final SubLSymbol LUCENE_OVERWRITE = makeSymbol("LUCENE-OVERWRITE");

    private static final SubLSymbol _CSETF_LUCENE_OVERWRITE = makeSymbol("_CSETF-LUCENE-OVERWRITE");

    private static final SubLString $str37$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_LUCENE_SESSION = makeSymbol("MAKE-LUCENE-SESSION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LUCENE_SESSION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LUCENE-SESSION-METHOD");

    private static final SubLString $str50$__LUCENE_SESSION_ = makeString("#<LUCENE-SESSION ");

    private static final SubLString $str51$_ = makeString(":");

    private static final SubLString $str52$_ = makeString(">");

    private static final SubLFloat $float$1_0 = makeDouble(1.0);

    private static final SubLInteger $int$50 = makeInteger(50);

    public static final SubLObject get_lucene_host_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $lucene_host_override$.getDynamicValue(thread) ? ((SubLObject) ($lucene_host_override$.getDynamicValue(thread))) : $lucene_host$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_lucene_host() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $lucene_host_override$.getDynamicValue(thread) ? $lucene_host_override$.getDynamicValue(thread) : $lucene_host$.getDynamicValue(thread);
    }

    public static final SubLObject get_lucene_port_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return NIL != $lucene_port_override$.getDynamicValue(thread) ? ((SubLObject) ($lucene_port_override$.getDynamicValue(thread))) : $lucene_port$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_lucene_port() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != $lucene_port_override$.getDynamicValue(thread) ? $lucene_port_override$.getDynamicValue(thread) : $lucene_port$.getDynamicValue(thread);
    }

    /**
     * Binds SESSION to a new lucene session on HOST:PORT of TYPE using INDEX
     */
    @LispMethod(comment = "Binds SESSION to a new lucene session on HOST:PORT of TYPE using INDEX")
    public static final SubLObject with_lucene_session_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject session = NIL;
                    SubLObject index = NIL;
                    SubLObject type = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    session = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    index = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt2);
                    type = current.first();
                    current = current.rest();
                    {
                        SubLObject host = (current.isCons()) ? ((SubLObject) (current.first())) : get_lucene_host();
                        destructuring_bind_must_listp(current, datum, $list_alt2);
                        current = current.rest();
                        {
                            SubLObject port = (current.isCons()) ? ((SubLObject) (current.first())) : get_lucene_port();
                            destructuring_bind_must_listp(current, datum, $list_alt2);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    return list(CLET, list(session), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, session, list(NEW_LUCENE_SESSION, host, port, index, type)), append(body, NIL)), list(PWHEN, list(LUCENE_SESSION_P, session), list(LUCENE_FINALIZE, session))));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt2);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Binds SESSION to a new lucene session on HOST:PORT of TYPE using INDEX
     */
    @LispMethod(comment = "Binds SESSION to a new lucene session on HOST:PORT of TYPE using INDEX")
    public static SubLObject with_lucene_session(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject session = NIL;
        SubLObject index = NIL;
        SubLObject type = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        session = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        index = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list2);
        type = current.first();
        current = current.rest();
        final SubLObject host = (current.isCons()) ? current.first() : get_lucene_host();
        destructuring_bind_must_listp(current, datum, $list2);
        current = current.rest();
        final SubLObject port = (current.isCons()) ? current.first() : get_lucene_port();
        destructuring_bind_must_listp(current, datum, $list2);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CLET, list(session), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, session, list(NEW_LUCENE_SESSION, host, port, index, type)), append(body, NIL)), list(PWHEN, list(LUCENE_SESSION_P, session), list(LUCENE_FINALIZE, session))));
        }
        cdestructuring_bind_error(datum, $list2);
        return NIL;
    }

    public static final SubLObject lucene_session_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        lucene_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject lucene_session_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        lucene_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject lucene_session_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.lucene_session.$lucene_session_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject lucene_session_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.lucene_session.$lucene_session_native.class ? T : NIL;
    }

    public static final SubLObject lucene_host_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.getField2();
    }

    public static SubLObject lucene_host(final SubLObject v_object) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject lucene_port_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.getField3();
    }

    public static SubLObject lucene_port(final SubLObject v_object) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject lucene_connection_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.getField4();
    }

    public static SubLObject lucene_connection(final SubLObject v_object) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject lucene_session_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.getField5();
    }

    public static SubLObject lucene_session_type(final SubLObject v_object) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject lucene_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.getField6();
    }

    public static SubLObject lucene_index(final SubLObject v_object) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject lucene_overwrite_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.getField7();
    }

    public static SubLObject lucene_overwrite(final SubLObject v_object) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_lucene_host_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_lucene_host(final SubLObject v_object, final SubLObject value) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_lucene_port_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_lucene_port(final SubLObject v_object, final SubLObject value) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_lucene_connection_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_lucene_connection(final SubLObject v_object, final SubLObject value) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_lucene_session_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_lucene_session_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_lucene_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_lucene_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_lucene_overwrite_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, LUCENE_SESSION_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_lucene_overwrite(final SubLObject v_object, final SubLObject value) {
        assert NIL != lucene_session_p(v_object) : "! lucene_session.lucene_session_p(v_object) " + "lucene_session.lucene_session_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_lucene_session_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.lucene_session.$lucene_session_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($HOST)) {
                        _csetf_lucene_host(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PORT)) {
                            _csetf_lucene_port(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CONNECTION)) {
                                _csetf_lucene_connection(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SESSION_TYPE)) {
                                    _csetf_lucene_session_type(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($INDEX)) {
                                        _csetf_lucene_index(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($OVERWRITE)) {
                                            _csetf_lucene_overwrite(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt36$Invalid_slot__S_for_construction_, current_arg);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_lucene_session(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.lucene_session.$lucene_session_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($HOST)) {
                _csetf_lucene_host(v_new, current_value);
            } else
                if (pcase_var.eql($PORT)) {
                    _csetf_lucene_port(v_new, current_value);
                } else
                    if (pcase_var.eql($CONNECTION)) {
                        _csetf_lucene_connection(v_new, current_value);
                    } else
                        if (pcase_var.eql($SESSION_TYPE)) {
                            _csetf_lucene_session_type(v_new, current_value);
                        } else
                            if (pcase_var.eql($INDEX)) {
                                _csetf_lucene_index(v_new, current_value);
                            } else
                                if (pcase_var.eql($OVERWRITE)) {
                                    _csetf_lucene_overwrite(v_new, current_value);
                                } else {
                                    Errors.error($str37$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_lucene_session(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_LUCENE_SESSION, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $HOST, lucene_host(obj));
        funcall(visitor_fn, obj, $SLOT, $PORT, lucene_port(obj));
        funcall(visitor_fn, obj, $SLOT, $CONNECTION, lucene_connection(obj));
        funcall(visitor_fn, obj, $SLOT, $SESSION_TYPE, lucene_session_type(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX, lucene_index(obj));
        funcall(visitor_fn, obj, $SLOT, $OVERWRITE, lucene_overwrite(obj));
        funcall(visitor_fn, obj, $END, MAKE_LUCENE_SESSION, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_lucene_session_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_lucene_session(obj, visitor_fn);
    }

    /**
     * Returns a new lucene session of type SESSION-TYPE, connected to HOST:PORT, using index INDEX
     */
    @LispMethod(comment = "Returns a new lucene session of type SESSION-TYPE, connected to HOST:PORT, using index INDEX")
    public static final SubLObject new_lucene_session_alt(SubLObject host, SubLObject port, SubLObject index, SubLObject session_type, SubLObject overwriteP) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = NIL;
        }
        SubLTrampolineFile.checkType(host, STRINGP);
        SubLTrampolineFile.checkType(port, POSITIVE_INTEGER_P);
        SubLTrampolineFile.checkType(index, STRINGP);
        SubLTrampolineFile.checkType(session_type, KEYWORDP);
        SubLTrampolineFile.checkType(overwriteP, BOOLEANP);
        {
            SubLObject session = make_lucene_session(UNPROVIDED);
            SubLObject session_type_as_int = NIL;
            SubLObject pcase_var = session_type;
            if (pcase_var.eql($CYC)) {
                session_type_as_int = ZERO_INTEGER;
            } else {
                if (pcase_var.eql($TEXT)) {
                    session_type_as_int = ONE_INTEGER;
                }
            }
            _csetf_lucene_host(session, host);
            _csetf_lucene_port(session, port);
            _csetf_lucene_connection(session, subl_promotions.open_tcp_stream_with_access(host, port, $PRIVATE));
            _csetf_lucene_session_type(session, session_type);
            _csetf_lucene_index(session, index);
            _csetf_lucene_overwrite(session, overwriteP);
            lucene_init(session, index, session_type_as_int);
            return session;
        }
    }

    /**
     * Returns a new lucene session of type SESSION-TYPE, connected to HOST:PORT, using index INDEX
     */
    @LispMethod(comment = "Returns a new lucene session of type SESSION-TYPE, connected to HOST:PORT, using index INDEX")
    public static SubLObject new_lucene_session(final SubLObject host, final SubLObject port, final SubLObject index, final SubLObject session_type, SubLObject overwriteP) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = NIL;
        }
        assert NIL != stringp(host) : "! stringp(host) " + ("Types.stringp(host) " + "CommonSymbols.NIL != Types.stringp(host) ") + host;
        assert NIL != subl_promotions.positive_integer_p(port) : "! subl_promotions.positive_integer_p(port) " + ("subl_promotions.positive_integer_p(port) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(port) ") + port;
        assert NIL != stringp(index) : "! stringp(index) " + ("Types.stringp(index) " + "CommonSymbols.NIL != Types.stringp(index) ") + index;
        assert NIL != keywordp(session_type) : "! keywordp(session_type) " + ("Types.keywordp(session_type) " + "CommonSymbols.NIL != Types.keywordp(session_type) ") + session_type;
        assert NIL != booleanp(overwriteP) : "! booleanp(overwriteP) " + ("Types.booleanp(overwriteP) " + "CommonSymbols.NIL != Types.booleanp(overwriteP) ") + overwriteP;
        final SubLObject session = make_lucene_session(UNPROVIDED);
        SubLObject session_type_as_int = NIL;
        if (session_type.eql($CYC)) {
            session_type_as_int = ZERO_INTEGER;
        } else
            if (session_type.eql($TEXT)) {
                session_type_as_int = ONE_INTEGER;
            }

        _csetf_lucene_host(session, host);
        _csetf_lucene_port(session, port);
        _csetf_lucene_connection(session, subl_promotions.open_tcp_stream_with_timeout(host, port, NIL, $PRIVATE));
        _csetf_lucene_session_type(session, session_type);
        _csetf_lucene_index(session, index);
        _csetf_lucene_overwrite(session, overwriteP);
        lucene_init(session, index, session_type_as_int);
        return session;
    }

    /**
     * Finalizes SESSION
     */
    @LispMethod(comment = "Finalizes SESSION")
    public static final SubLObject lucene_finalize_alt(SubLObject session) {
        SubLTrampolineFile.checkType(session, LUCENE_SESSION_P);
        return close(lucene_connection(session), UNPROVIDED);
    }

    /**
     * Finalizes SESSION
     */
    @LispMethod(comment = "Finalizes SESSION")
    public static SubLObject lucene_finalize(final SubLObject session) {
        assert NIL != lucene_session_p(session) : "! lucene_session.lucene_session_p(session) " + ("lucene_session.lucene_session_p(session) " + "CommonSymbols.NIL != lucene_session.lucene_session_p(session) ") + session;
        return close(lucene_connection(session), UNPROVIDED);
    }

    /**
     * Prints SESSION to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints SESSION to STREAM, ignoring DEPTH")
    public static final SubLObject lucene_print_alt(SubLObject session, SubLObject stream, SubLObject depth) {
        write_string($str_alt44$__LUCENE_SESSION_, stream, UNPROVIDED, UNPROVIDED);
        write_string(lucene_host(session), stream, UNPROVIDED, UNPROVIDED);
        write_string($str_alt45$_, stream, UNPROVIDED, UNPROVIDED);
        princ(lucene_port(session), stream);
        write_string($str_alt46$_, stream, UNPROVIDED, UNPROVIDED);
        return session;
    }

    /**
     * Prints SESSION to STREAM, ignoring DEPTH
     */
    @LispMethod(comment = "Prints SESSION to STREAM, ignoring DEPTH")
    public static SubLObject lucene_print(final SubLObject session, final SubLObject stream, final SubLObject depth) {
        write_string($str50$__LUCENE_SESSION_, stream, UNPROVIDED, UNPROVIDED);
        write_string(lucene_host(session), stream, UNPROVIDED, UNPROVIDED);
        write_string($str51$_, stream, UNPROVIDED, UNPROVIDED);
        princ(lucene_port(session), stream);
        write_string($str52$_, stream, UNPROVIDED, UNPROVIDED);
        return session;
    }

    /**
     * Initializes SESSION by with index PATH. If OVERWRITE? is t, the index will be created/overwritten.
     * Otherwise, SESSION will be connected to an existing index
     */
    @LispMethod(comment = "Initializes SESSION by with index PATH. If OVERWRITE? is t, the index will be created/overwritten.\r\nOtherwise, SESSION will be connected to an existing index\nInitializes SESSION by with index PATH. If OVERWRITE? is t, the index will be created/overwritten.\nOtherwise, SESSION will be connected to an existing index")
    public static final SubLObject lucene_init_alt(SubLObject session, SubLObject path, SubLObject session_type) {
        return lucene_execute(session, $init_lucene_session$.getGlobalValue(), list(path, session_type));
    }

    /**
     * Initializes SESSION by with index PATH. If OVERWRITE? is t, the index will be created/overwritten.
     * Otherwise, SESSION will be connected to an existing index
     */
    @LispMethod(comment = "Initializes SESSION by with index PATH. If OVERWRITE? is t, the index will be created/overwritten.\r\nOtherwise, SESSION will be connected to an existing index\nInitializes SESSION by with index PATH. If OVERWRITE? is t, the index will be created/overwritten.\nOtherwise, SESSION will be connected to an existing index")
    public static SubLObject lucene_init(final SubLObject session, final SubLObject path, final SubLObject session_type) {
        return lucene_execute(session, $init_lucene_session$.getGlobalValue(), list(path, session_type));
    }

    /**
     * Creates a new index writer within SESSION to SESSION's index.
     * If OVERWRITE is t, the old contents of the index will be overwritten.
     */
    @LispMethod(comment = "Creates a new index writer within SESSION to SESSION\'s index.\r\nIf OVERWRITE is t, the old contents of the index will be overwritten.\nCreates a new index writer within SESSION to SESSION\'s index.\nIf OVERWRITE is t, the old contents of the index will be overwritten.")
    public static final SubLObject lucene_new_index_writer_alt(SubLObject session, SubLObject overwriteP) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = NIL;
        }
        SubLTrampolineFile.checkType(session, LUCENE_SESSION_P);
        SubLTrampolineFile.checkType(overwriteP, BOOLEANP);
        return lucene_execute(session, $new_index_writer$.getGlobalValue(), list(overwriteP));
    }

    /**
     * Creates a new index writer within SESSION to SESSION's index.
     * If OVERWRITE is t, the old contents of the index will be overwritten.
     */
    @LispMethod(comment = "Creates a new index writer within SESSION to SESSION\'s index.\r\nIf OVERWRITE is t, the old contents of the index will be overwritten.\nCreates a new index writer within SESSION to SESSION\'s index.\nIf OVERWRITE is t, the old contents of the index will be overwritten.")
    public static SubLObject lucene_new_index_writer(final SubLObject session, SubLObject overwriteP) {
        if (overwriteP == UNPROVIDED) {
            overwriteP = NIL;
        }
        assert NIL != lucene_session_p(session) : "! lucene_session.lucene_session_p(session) " + ("lucene_session.lucene_session_p(session) " + "CommonSymbols.NIL != lucene_session.lucene_session_p(session) ") + session;
        assert NIL != booleanp(overwriteP) : "! booleanp(overwriteP) " + ("Types.booleanp(overwriteP) " + "CommonSymbols.NIL != Types.booleanp(overwriteP) ") + overwriteP;
        return lucene_execute(session, $new_index_writer$.getGlobalValue(), list(overwriteP));
    }

    /**
     * Close SESSION's index
     */
    @LispMethod(comment = "Close SESSION\'s index")
    public static final SubLObject lucene_close_index_writer_alt(SubLObject session) {
        SubLTrampolineFile.checkType(session, LUCENE_SESSION_P);
        return lucene_execute(session, $close_index$.getGlobalValue(), NIL);
    }

    /**
     * Close SESSION's index
     */
    @LispMethod(comment = "Close SESSION\'s index")
    public static SubLObject lucene_close_index_writer(final SubLObject session) {
        assert NIL != lucene_session_p(session) : "! lucene_session.lucene_session_p(session) " + ("lucene_session.lucene_session_p(session) " + "CommonSymbols.NIL != lucene_session.lucene_session_p(session) ") + session;
        return lucene_execute(session, $close_index$.getGlobalValue(), NIL);
    }

    public static final SubLObject default_lucene_confirmed_terms_boost_alt() {
        return $float$1_0;
    }

    public static SubLObject default_lucene_confirmed_terms_boost() {
        return $float$1_0;
    }

    /**
     * Adds CONTENT, URL and TITLE etc. indexed under INDEX-TERMS to SESSION's index
     */
    @LispMethod(comment = "Adds CONTENT, URL and TITLE etc. indexed under INDEX-TERMS to SESSION\'s index")
    public static final SubLObject lucene_add_document_alt(SubLObject session, SubLObject content, SubLObject index_terms, SubLObject confirmed_index_terms, SubLObject url, SubLObject title, SubLObject confirmed_terms_boost, SubLObject user_param) {
        if (confirmed_terms_boost == UNPROVIDED) {
            confirmed_terms_boost = default_lucene_confirmed_terms_boost();
        }
        if (user_param == UNPROVIDED) {
            user_param = NIL;
        }
        SubLTrampolineFile.checkType(session, LUCENE_SESSION_P);
        SubLTrampolineFile.checkType(content, STRINGP);
        SubLTrampolineFile.checkType(index_terms, STRINGP);
        SubLTrampolineFile.checkType(confirmed_index_terms, STRINGP);
        SubLTrampolineFile.checkType(url, STRINGP);
        SubLTrampolineFile.checkType(title, STRINGP);
        SubLTrampolineFile.checkType(confirmed_terms_boost, POSITIVE_NUMBER_P);
        if (NIL != user_param) {
            SubLTrampolineFile.checkType(user_param, STRINGP);
        }
        {
            SubLObject result = NIL;
            lucene_new_index_writer(session, lucene_overwrite(session));
            {
                SubLObject v_arguments = list(content, index_terms, confirmed_index_terms, url, title, confirmed_terms_boost);
                if (NIL != user_param) {
                    v_arguments = append(v_arguments, list(user_param));
                }
                try {
                    result = lucene_execute(session, $add_document$.getGlobalValue(), v_arguments);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            if (NIL != lucene_overwrite(session)) {
                                _csetf_lucene_overwrite(session, NIL);
                            }
                            lucene_close_index_writer(session);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            }
            return result;
        }
    }

    @LispMethod(comment = "Adds CONTENT, URL and TITLE etc. indexed under INDEX-TERMS to SESSION\'s index")
    public static SubLObject lucene_add_document(final SubLObject session, final SubLObject content, final SubLObject index_terms, final SubLObject confirmed_index_terms, final SubLObject url, final SubLObject title, SubLObject confirmed_terms_boost, SubLObject user_param) {
        if (confirmed_terms_boost == UNPROVIDED) {
            confirmed_terms_boost = default_lucene_confirmed_terms_boost();
        }
        if (user_param == UNPROVIDED) {
            user_param = NIL;
        }
        assert NIL != lucene_session_p(session) : "! lucene_session.lucene_session_p(session) " + ("lucene_session.lucene_session_p(session) " + "CommonSymbols.NIL != lucene_session.lucene_session_p(session) ") + session;
        assert NIL != stringp(content) : "! stringp(content) " + ("Types.stringp(content) " + "CommonSymbols.NIL != Types.stringp(content) ") + content;
        assert NIL != stringp(index_terms) : "! stringp(index_terms) " + ("Types.stringp(index_terms) " + "CommonSymbols.NIL != Types.stringp(index_terms) ") + index_terms;
        assert NIL != stringp(confirmed_index_terms) : "! stringp(confirmed_index_terms) " + ("Types.stringp(confirmed_index_terms) " + "CommonSymbols.NIL != Types.stringp(confirmed_index_terms) ") + confirmed_index_terms;
        assert NIL != stringp(url) : "! stringp(url) " + ("Types.stringp(url) " + "CommonSymbols.NIL != Types.stringp(url) ") + url;
        assert NIL != stringp(title) : "! stringp(title) " + ("Types.stringp(title) " + "CommonSymbols.NIL != Types.stringp(title) ") + title;
        assert NIL != number_utilities.positive_number_p(confirmed_terms_boost) : "! number_utilities.positive_number_p(confirmed_terms_boost) " + ("number_utilities.positive_number_p(confirmed_terms_boost) " + "CommonSymbols.NIL != number_utilities.positive_number_p(confirmed_terms_boost) ") + confirmed_terms_boost;
        if (((NIL != user_param) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == stringp(user_param))) {
            throw new AssertionError(user_param);
        }
        SubLObject result = NIL;
        lucene_new_index_writer(session, lucene_overwrite(session));
        SubLObject v_arguments = list(content, index_terms, confirmed_index_terms, url, title, confirmed_terms_boost);
        if (NIL != user_param) {
            v_arguments = append(v_arguments, list(user_param));
        }
        try {
            result = lucene_execute(session, $add_document$.getGlobalValue(), v_arguments);
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                if (NIL != lucene_overwrite(session)) {
                    _csetf_lucene_overwrite(session, NIL);
                }
                lucene_close_index_writer(session);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result;
    }

    /**
     * Optimizes the SESSION's index
     */
    @LispMethod(comment = "Optimizes the SESSION\'s index")
    public static final SubLObject lucene_optimize_alt(SubLObject session) {
        SubLTrampolineFile.checkType(session, LUCENE_SESSION_P);
        lucene_new_index_writer(session, UNPROVIDED);
        {
            SubLObject ret_value = lucene_execute(session, $optimize$.getGlobalValue(), NIL);
            lucene_close_index_writer(session);
            return ret_value;
        }
    }

    @LispMethod(comment = "Optimizes the SESSION\'s index")
    public static SubLObject lucene_optimize(final SubLObject session) {
        assert NIL != lucene_session_p(session) : "! lucene_session.lucene_session_p(session) " + ("lucene_session.lucene_session_p(session) " + "CommonSymbols.NIL != lucene_session.lucene_session_p(session) ") + session;
        lucene_new_index_writer(session, UNPROVIDED);
        final SubLObject ret_value = lucene_execute(session, $optimize$.getGlobalValue(), NIL);
        lucene_close_index_writer(session);
        return ret_value;
    }

    /**
     * Queries SESSION's index with QUERY and returns a list of hits.
     */
    @LispMethod(comment = "Queries SESSION\'s index with QUERY and returns a list of hits.")
    public static final SubLObject lucene_query_alt(SubLObject session, SubLObject query, SubLObject count) {
        if (count == UNPROVIDED) {
            count = $int$50;
        }
        SubLTrampolineFile.checkType(session, LUCENE_SESSION_P);
        SubLTrampolineFile.checkType(query, STRINGP);
        SubLTrampolineFile.checkType(count, NON_NEGATIVE_INTEGER_P);
        return lucene_execute(session, $query$.getGlobalValue(), list(query, count));
    }

    @LispMethod(comment = "Queries SESSION\'s index with QUERY and returns a list of hits.")
    public static SubLObject lucene_query(final SubLObject session, final SubLObject query, SubLObject count) {
        if (count == UNPROVIDED) {
            count = $int$50;
        }
        assert NIL != lucene_session_p(session) : "! lucene_session.lucene_session_p(session) " + ("lucene_session.lucene_session_p(session) " + "CommonSymbols.NIL != lucene_session.lucene_session_p(session) ") + session;
        assert NIL != stringp(query) : "! stringp(query) " + ("Types.stringp(query) " + "CommonSymbols.NIL != Types.stringp(query) ") + query;
        assert NIL != subl_promotions.non_negative_integer_p(count) : "! subl_promotions.non_negative_integer_p(count) " + ("subl_promotions.non_negative_integer_p(count) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(count) ") + count;
        return lucene_execute(session, $query$.getGlobalValue(), list(query, count));
    }

    /**
     * Sends FUNCTION with ARGS to SESSION
     */
    @LispMethod(comment = "Sends FUNCTION with ARGS to SESSION")
    public static final SubLObject lucene_send_alt(SubLObject session, SubLObject function, SubLObject args) {
        cfasl_output(cons(function, args), lucene_connection(session));
        force_output(lucene_connection(session));
        return NIL;
    }

    @LispMethod(comment = "Sends FUNCTION with ARGS to SESSION")
    public static SubLObject lucene_send(final SubLObject session, final SubLObject function, final SubLObject args) {
        cfasl_output(cons(function, args), lucene_connection(session));
        force_output(lucene_connection(session));
        return NIL;
    }

    /**
     * Reads and returns a result from SESSION
     */
    @LispMethod(comment = "Reads and returns a result from SESSION")
    public static final SubLObject lucene_receive_alt(SubLObject session) {
        {
            SubLObject response = cfasl_input(lucene_connection(session), UNPROVIDED, UNPROVIDED);
            return interpret_lucene_response(response);
        }
    }

    @LispMethod(comment = "Reads and returns a result from SESSION")
    public static SubLObject lucene_receive(final SubLObject session) {
        final SubLObject response = cfasl_input(lucene_connection(session), UNPROVIDED, UNPROVIDED);
        return interpret_lucene_response(response);
    }

    /**
     * Lets SESSION execute FUNTION with ARGS and returns the result
     */
    @LispMethod(comment = "Lets SESSION execute FUNTION with ARGS and returns the result")
    public static final SubLObject lucene_execute_alt(SubLObject session, SubLObject function, SubLObject args) {
        lucene_send(session, function, args);
        return lucene_receive(session);
    }

    @LispMethod(comment = "Lets SESSION execute FUNTION with ARGS and returns the result")
    public static SubLObject lucene_execute(final SubLObject session, final SubLObject function, final SubLObject args) {
        lucene_send(session, function, args);
        return lucene_receive(session);
    }

    /**
     * Returns the contents of lucene RESPONSE in the right format
     */
    @LispMethod(comment = "Returns the contents of lucene RESPONSE in the right format")
    public static final SubLObject interpret_lucene_response_alt(SubLObject response) {
        {
            SubLObject type = response.first();
            return type.isNegative() ? ((SubLObject) (Errors.error(response.rest()))) : response.rest();
        }
    }

    @LispMethod(comment = "Returns the contents of lucene RESPONSE in the right format")
    public static SubLObject interpret_lucene_response(final SubLObject response) {
        final SubLObject type = response.first();
        return type.isNegative() ? Errors.error(response.rest()) : response.rest();
    }

    public static SubLObject declare_lucene_session_file() {
        declareFunction("get_lucene_host", "GET-LUCENE-HOST", 0, 0, false);
        declareFunction("get_lucene_port", "GET-LUCENE-PORT", 0, 0, false);
        declareMacro("with_lucene_session", "WITH-LUCENE-SESSION");
        declareFunction("lucene_session_print_function_trampoline", "LUCENE-SESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("lucene_session_p", "LUCENE-SESSION-P", 1, 0, false);
        new lucene_session.$lucene_session_p$UnaryFunction();
        declareFunction("lucene_host", "LUCENE-HOST", 1, 0, false);
        declareFunction("lucene_port", "LUCENE-PORT", 1, 0, false);
        declareFunction("lucene_connection", "LUCENE-CONNECTION", 1, 0, false);
        declareFunction("lucene_session_type", "LUCENE-SESSION-TYPE", 1, 0, false);
        declareFunction("lucene_index", "LUCENE-INDEX", 1, 0, false);
        declareFunction("lucene_overwrite", "LUCENE-OVERWRITE", 1, 0, false);
        declareFunction("_csetf_lucene_host", "_CSETF-LUCENE-HOST", 2, 0, false);
        declareFunction("_csetf_lucene_port", "_CSETF-LUCENE-PORT", 2, 0, false);
        declareFunction("_csetf_lucene_connection", "_CSETF-LUCENE-CONNECTION", 2, 0, false);
        declareFunction("_csetf_lucene_session_type", "_CSETF-LUCENE-SESSION-TYPE", 2, 0, false);
        declareFunction("_csetf_lucene_index", "_CSETF-LUCENE-INDEX", 2, 0, false);
        declareFunction("_csetf_lucene_overwrite", "_CSETF-LUCENE-OVERWRITE", 2, 0, false);
        declareFunction("make_lucene_session", "MAKE-LUCENE-SESSION", 0, 1, false);
        declareFunction("visit_defstruct_lucene_session", "VISIT-DEFSTRUCT-LUCENE-SESSION", 2, 0, false);
        declareFunction("visit_defstruct_object_lucene_session_method", "VISIT-DEFSTRUCT-OBJECT-LUCENE-SESSION-METHOD", 2, 0, false);
        declareFunction("new_lucene_session", "NEW-LUCENE-SESSION", 4, 1, false);
        declareFunction("lucene_finalize", "LUCENE-FINALIZE", 1, 0, false);
        declareFunction("lucene_print", "LUCENE-PRINT", 3, 0, false);
        declareFunction("lucene_init", "LUCENE-INIT", 3, 0, false);
        declareFunction("lucene_new_index_writer", "LUCENE-NEW-INDEX-WRITER", 1, 1, false);
        declareFunction("lucene_close_index_writer", "LUCENE-CLOSE-INDEX-WRITER", 1, 0, false);
        declareFunction("default_lucene_confirmed_terms_boost", "DEFAULT-LUCENE-CONFIRMED-TERMS-BOOST", 0, 0, false);
        declareFunction("lucene_add_document", "LUCENE-ADD-DOCUMENT", 6, 2, false);
        declareFunction("lucene_optimize", "LUCENE-OPTIMIZE", 1, 0, false);
        declareFunction("lucene_query", "LUCENE-QUERY", 2, 1, false);
        declareFunction("lucene_send", "LUCENE-SEND", 3, 0, false);
        declareFunction("lucene_receive", "LUCENE-RECEIVE", 1, 0, false);
        declareFunction("lucene_execute", "LUCENE-EXECUTE", 3, 0, false);
        declareFunction("interpret_lucene_response", "INTERPRET-LUCENE-RESPONSE", 1, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt2 = list(list(makeSymbol("SESSION"), makeSymbol("INDEX"), makeSymbol("TYPE"), makeSymbol("&OPTIONAL"), list(makeSymbol("HOST"), list(makeSymbol("GET-LUCENE-HOST"))), list(makeSymbol("PORT"), list(makeSymbol("GET-LUCENE-PORT")))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt12 = list(makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("CONNECTION"), makeSymbol("SESSION-TYPE"), makeSymbol("INDEX"), makeSymbol("OVERWRITE"));

    static private final SubLList $list_alt13 = list($HOST, $PORT, makeKeyword("CONNECTION"), makeKeyword("SESSION-TYPE"), makeKeyword("INDEX"), makeKeyword("OVERWRITE"));

    static private final SubLList $list_alt14 = list(makeSymbol("LUCENE-HOST"), makeSymbol("LUCENE-PORT"), makeSymbol("LUCENE-CONNECTION"), makeSymbol("LUCENE-SESSION-TYPE"), makeSymbol("LUCENE-INDEX"), makeSymbol("LUCENE-OVERWRITE"));

    public static SubLObject init_lucene_session_file() {
        defparameter("*LUCENE-HOST*", $$$semanticsearch);
        defparameter("*LUCENE-PORT*", $int$1928);
        defparameter("*LUCENE-HOST-OVERRIDE*", NIL);
        defparameter("*LUCENE-PORT-OVERRIDE*", NIL);
        deflexical("*INIT-LUCENE-SESSION*", ZERO_INTEGER);
        deflexical("*ADD-DOCUMENT*", ONE_INTEGER);
        deflexical("*QUERY*", TWO_INTEGER);
        deflexical("*OPTIMIZE*", THREE_INTEGER);
        deflexical("*CLOSE-INDEX*", FOUR_INTEGER);
        deflexical("*NEW-INDEX-WRITER*", FIVE_INTEGER);
        defconstant("*DTP-LUCENE-SESSION*", LUCENE_SESSION);
        return NIL;
    }

    static private final SubLList $list_alt15 = list(makeSymbol("_CSETF-LUCENE-HOST"), makeSymbol("_CSETF-LUCENE-PORT"), makeSymbol("_CSETF-LUCENE-CONNECTION"), makeSymbol("_CSETF-LUCENE-SESSION-TYPE"), makeSymbol("_CSETF-LUCENE-INDEX"), makeSymbol("_CSETF-LUCENE-OVERWRITE"));

    public static SubLObject setup_lucene_session_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_lucene_session$.getGlobalValue(), symbol_function(LUCENE_SESSION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list18);
        def_csetf(LUCENE_HOST, _CSETF_LUCENE_HOST);
        def_csetf(LUCENE_PORT, _CSETF_LUCENE_PORT);
        def_csetf(LUCENE_CONNECTION, _CSETF_LUCENE_CONNECTION);
        def_csetf(LUCENE_SESSION_TYPE, _CSETF_LUCENE_SESSION_TYPE);
        def_csetf(LUCENE_INDEX, _CSETF_LUCENE_INDEX);
        def_csetf(LUCENE_OVERWRITE, _CSETF_LUCENE_OVERWRITE);
        identity(LUCENE_SESSION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_lucene_session$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LUCENE_SESSION_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lucene_session_file();
    }

    @Override
    public void initializeVariables() {
        init_lucene_session_file();
    }

    static private final SubLString $str_alt36$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    @Override
    public void runTopLevelForms() {
        setup_lucene_session_file();
    }

    static {
    }

    static private final SubLString $str_alt44$__LUCENE_SESSION_ = makeString("#<LUCENE-SESSION ");

    public static final class $lucene_session_native extends SubLStructNative {
        public SubLObject $host;

        public SubLObject $port;

        public SubLObject $connection;

        public SubLObject $session_type;

        public SubLObject $index;

        public SubLObject $overwrite;

        private static final SubLStructDeclNative structDecl;

        public $lucene_session_native() {
            lucene_session.$lucene_session_native.this.$host = Lisp.NIL;
            lucene_session.$lucene_session_native.this.$port = Lisp.NIL;
            lucene_session.$lucene_session_native.this.$connection = Lisp.NIL;
            lucene_session.$lucene_session_native.this.$session_type = Lisp.NIL;
            lucene_session.$lucene_session_native.this.$index = Lisp.NIL;
            lucene_session.$lucene_session_native.this.$overwrite = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return lucene_session.$lucene_session_native.this.$host;
        }

        @Override
        public SubLObject getField3() {
            return lucene_session.$lucene_session_native.this.$port;
        }

        @Override
        public SubLObject getField4() {
            return lucene_session.$lucene_session_native.this.$connection;
        }

        @Override
        public SubLObject getField5() {
            return lucene_session.$lucene_session_native.this.$session_type;
        }

        @Override
        public SubLObject getField6() {
            return lucene_session.$lucene_session_native.this.$index;
        }

        @Override
        public SubLObject getField7() {
            return lucene_session.$lucene_session_native.this.$overwrite;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return lucene_session.$lucene_session_native.this.$host = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return lucene_session.$lucene_session_native.this.$port = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return lucene_session.$lucene_session_native.this.$connection = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return lucene_session.$lucene_session_native.this.$session_type = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return lucene_session.$lucene_session_native.this.$index = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return lucene_session.$lucene_session_native.this.$overwrite = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.lucene_session.$lucene_session_native.class, LUCENE_SESSION, LUCENE_SESSION_P, $list12, $list13, new String[]{ "$host", "$port", "$connection", "$session_type", "$index", "$overwrite" }, $list14, $list15, LUCENE_PRINT);
        }
    }

    static private final SubLString $str_alt45$_ = makeString(":");

    static private final SubLString $str_alt46$_ = makeString(">");

    public static final class $lucene_session_p$UnaryFunction extends UnaryFunction {
        public $lucene_session_p$UnaryFunction() {
            super(extractFunctionNamed("LUCENE-SESSION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return lucene_session_p(arg1);
        }
    }
}

/**
 * Total time: 279 ms synthetic
 */
