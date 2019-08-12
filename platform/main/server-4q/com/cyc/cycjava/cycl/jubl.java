/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Tcp;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      JUBL
 *  source file: /cyc/top/cycl/jubl.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class jubl extends SubLTranslatedFile implements V02 {
    // // Constructor
    private jubl() {
    }

    public static final SubLFile me = new jubl();

    public static final String myName = "com.cyc.cycjava.cycl.jubl";

    // // Definitions
    // deflexical
    private static final SubLSymbol $jsession_host$ = makeSymbol("*JSESSION-HOST*");

    // deflexical
    private static final SubLSymbol $jsession_port$ = makeSymbol("*JSESSION-PORT*");

    // defparameter
    public static final SubLSymbol $jsession$ = makeSymbol("*JSESSION*");

    /**
     *
     *
     * @param JIN
     * 		jin-p
     * @param METHOD
     * 		stringp
     * @param ARGS
     * 		listp
     * @return object; the result of calling METHOD with ARGS on JIN
     */
    public static final SubLObject jin_call(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject jin = NIL;
            SubLObject method = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            jin = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt2);
            method = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(JSESSION_EXEC, list(JIN_SESSION, jin), list(FORMAT, NIL, $str_alt6$self_objects__a___a_a, list(JIN_ID, jin), method, list(JYTHON_ARGLIST, bq_cons(LIST, append(args, NIL)))));
            }
        }
    }

    /**
     * Execute BODY with ELEMENT successively bound to each element in SEQ-EXPRESSION
     */
    public static final SubLObject do_jin_sequence(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt10);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element = NIL;
                    SubLObject seq_expression = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    element = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt10);
                    seq_expression = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject sequence = $sym11$SEQUENCE;
                            SubLObject size = $sym12$SIZE;
                            SubLObject i = $sym13$I;
                            return list(CLET, list(element, list(sequence, seq_expression), list(size, listS(JIN_CALL, sequence, $list_alt16))), listS(CDOTIMES, list(i, size), list(CSETQ, element, list(JIN_CALL, sequence, $str_alt19$__getitem__, i)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt10);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with ELEMENT successively bound to each element in SEQ-EXPRESSION. Execution is halted once ENDVAR becomes non-NULL.
     */
    public static final SubLObject some_jin_sequence(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject element = NIL;
                    SubLObject seq_expression = NIL;
                    SubLObject endvar = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    element = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    seq_expression = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    endvar = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject sequence = $sym21$SEQUENCE;
                            SubLObject size = $sym22$SIZE;
                            SubLObject done_var = $sym23$DONE_VAR;
                            SubLObject i = $sym24$I;
                            return list(CLET, list(element, list(sequence, seq_expression), list(size, listS(JIN_CALL, sequence, $list_alt16)), list(done_var, endvar)), listS(CDO, list(list(i, ZERO_INTEGER, list($sym26$1_, i))), list(list(COR, done_var, list($sym28$_, i, size))), list(CSETQ, element, list(JIN_CALL, sequence, $str_alt19$__getitem__, i)), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt20);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param SEQUENCE
     * 		jin-p; a Jython sequence jin
     * @return listp; a SubL list version of SEQUENCE
     */
    public static final SubLObject jseq_to_list(SubLObject sequence) {
        {
            SubLObject list = NIL;
            SubLObject element = NIL;
            SubLObject sequence_1 = sequence;
            SubLObject size = jsession_exec(jin_session(sequence_1), format(NIL, $str_alt6$self_objects__a___a_a, new SubLObject[]{ jin_id(sequence_1), $str_alt29$__len__, jython_arglist(list(EMPTY_SUBL_OBJECT_ARRAY)) }));
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                element = jsession_exec(jin_session(sequence_1), format(NIL, $str_alt6$self_objects__a___a_a, new SubLObject[]{ jin_id(sequence_1), $str_alt19$__getitem__, jython_arglist(list(i)) }));
                list = cons(element, list);
            }
            return nreverse(list);
        }
    }

    public static final class $jsession_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return jubl.$jsession_native.structDecl;
        }

        public SubLObject getField2() {
            return $host;
        }

        public SubLObject getField3() {
            return $port;
        }

        public SubLObject getField4() {
            return $channel;
        }

        public SubLObject getField5() {
            return $packages;
        }

        public SubLObject getField6() {
            return $classes;
        }

        public SubLObject getField7() {
            return $objects;
        }

        public SubLObject setField2(SubLObject value) {
            return $host = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $port = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $channel = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $packages = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $classes = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $objects = value;
        }

        public SubLObject $host = Lisp.NIL;

        public SubLObject $port = Lisp.NIL;

        public SubLObject $channel = Lisp.NIL;

        public SubLObject $packages = Lisp.NIL;

        public SubLObject $classes = Lisp.NIL;

        public SubLObject $objects = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(jubl.$jsession_native.class, JSESSION, JSESSION_P, $list_alt32, $list_alt33, new String[]{ "$host", "$port", "$channel", "$packages", "$classes", "$objects" }, $list_alt34, $list_alt35, JSESSION_PRINT);
    }

    // defconstant
    public static final SubLSymbol $dtp_jsession$ = makeSymbol("*DTP-JSESSION*");

    public static final SubLObject jsession_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        jsession_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject jsession_p(SubLObject v_object) {
        return v_object.getClass() == jubl.$jsession_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $jsession_p$UnaryFunction extends UnaryFunction {
        public $jsession_p$UnaryFunction() {
            super(extractFunctionNamed("JSESSION-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return jsession_p(arg1);
        }
    }

    public static final SubLObject jsession_host(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.getField2();
    }

    public static final SubLObject jsession_port(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.getField3();
    }

    public static final SubLObject jsession_channel(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.getField4();
    }

    public static final SubLObject jsession_packages(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.getField5();
    }

    public static final SubLObject jsession_classes(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.getField6();
    }

    public static final SubLObject jsession_objects(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.getField7();
    }

    public static final SubLObject _csetf_jsession_host(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_jsession_port(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_jsession_channel(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_jsession_packages(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_jsession_classes(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_jsession_objects(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JSESSION_P);
        return v_object.setField7(value);
    }

    public static final SubLObject make_jsession(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new jubl.$jsession_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($HOST)) {
                        _csetf_jsession_host(v_new, current_value);
                    } else
                        if (pcase_var.eql($PORT)) {
                            _csetf_jsession_port(v_new, current_value);
                        } else
                            if (pcase_var.eql($CHANNEL)) {
                                _csetf_jsession_channel(v_new, current_value);
                            } else
                                if (pcase_var.eql($PACKAGES)) {
                                    _csetf_jsession_packages(v_new, current_value);
                                } else
                                    if (pcase_var.eql($CLASSES)) {
                                        _csetf_jsession_classes(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($OBJECTS)) {
                                            _csetf_jsession_objects(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt56$Invalid_slot__S_for_construction_, current_arg);
                                        }





                }
            }
            return v_new;
        }
    }

    /**
     *
     *
     * @param HOST
     * 		stringp
     * @param PORT
     * 		positive-integer-p
     * @param CFASL-CLASSES
     * 		listp
     * @return jsession-p; a new session to a Jython server on machine HOST and port PORT
    CFASL-CLASSES is a list of fully qualified java classes that will be sent back according
    to the CFASL protocol rather than as proxy objects
     */
    public static final SubLObject new_jsession(SubLObject host, SubLObject port, SubLObject cfasl_classes) {
        if (cfasl_classes == UNPROVIDED) {
            cfasl_classes = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(host, STRINGP);
            SubLTrampolineFile.checkType(port, NON_NEGATIVE_INTEGER_P);
            SubLTrampolineFile.checkType(cfasl_classes, LISTP);
            {
                SubLObject channel = NIL;
                SubLObject error_message = NIL;
                SubLObject timed_outP = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                {
                                    SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                                    try {
                                        {
                                            SubLObject _prev_bind_0_2 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                                            try {
                                                subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                                {
                                                    SubLObject timer = NIL;
                                                    try {
                                                        {
                                                            SubLObject _prev_bind_0_3 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                                            try {
                                                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                timer = subl_macro_promotions.with_timeout_start_timer(THREE_INTEGER, tag);
                                                                channel = Tcp.open_tcp_stream(host, port);
                                                            } finally {
                                                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_3, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0_2, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                    }
                                }
                                if (NIL != timed_outP) {
                                    Errors.error($str_alt61$Can_t_create_new_jsession__timeou);
                                }
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                }
                if (NIL != error_message) {
                    Errors.error(error_message);
                }
                {
                    SubLObject js = make_jsession(UNPROVIDED);
                    SubLObject pjc = $str_alt62$org_python_core_PyJavaClass;
                    _csetf_jsession_host(js, host);
                    _csetf_jsession_port(js, port);
                    _csetf_jsession_channel(js, channel);
                    _csetf_jsession_packages(js, NIL);
                    _csetf_jsession_classes(js, dictionary.new_dictionary(EQUAL, EIGHT_INTEGER));
                    _csetf_jsession_objects(js, make_hash_table($int$64, EQL, UNPROVIDED));
                    jsession_exec(js, format(NIL, $str_alt64$import__a__self_modules___a______, new SubLObject[]{ pjc, pjc, pjc }));
                    {
                        SubLObject cdolist_list_var = cfasl_classes;
                        SubLObject v_class = NIL;
                        for (v_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_class = cdolist_list_var.first()) {
                            jsession_map(js, v_class);
                        }
                    }
                    return js;
                }
            }
        }
    }

    /**
     * Pretty prints JS to STREAM, ignoring DEPTH
     */
    public static final SubLObject jsession_print(SubLObject js, SubLObject stream, SubLObject depth) {
        write_string($str_alt65$__JSESSION_, stream, UNPROVIDED, UNPROVIDED);
        if (NIL == jsession_open_p(js)) {
            write_string($str_alt66$closed_, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($$$to, stream, UNPROVIDED, UNPROVIDED);
        write_string($str_alt68$__, stream, UNPROVIDED, UNPROVIDED);
        write_string(jsession_host(js), stream, UNPROVIDED, UNPROVIDED);
        write_string($str_alt69$_, stream, UNPROVIDED, UNPROVIDED);
        prin1(jsession_port(js), stream);
        write_string($str_alt70$__, stream, UNPROVIDED, UNPROVIDED);
        return js;
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * 		Closes JS
     */
    public static final SubLObject jsession_close(SubLObject js) {
        SubLTrampolineFile.checkType(js, JSESSION_P);
        jsession_destroy_objects(js);
        jsession_destroy_classes(js);
        jsession_destroy_packages(js);
        close(jsession_channel(js), UNPROVIDED);
        return js;
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p;
     * @return boolean; t if JS is open, nil otherwise
     */
    public static final SubLObject jsession_open_p(SubLObject js) {
        SubLTrampolineFile.checkType(js, JSESSION_P);
        return open_stream_p(jsession_channel(js));
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is an open jython session, nil otherwise
     */
    public static final SubLObject open_jsession_p(SubLObject v_object) {
        return makeBoolean((NIL != jsession_p(v_object)) && (NIL != jsession_open_p(v_object)));
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param CLASS-OR-PACKAGE
     * 		stringp
     * @return jcl-p or jpg-p
    Imports CLASS-OR-PACKAGE into JS unless already imported, and returns a handle
    on CLASS-OR-PACKAGE
     */
    public static final SubLObject jsession_import(SubLObject js, SubLObject class_or_package) {
        SubLTrampolineFile.checkType(js, JSESSION_P);
        SubLTrampolineFile.checkType(class_or_package, STRINGP);
        {
            SubLObject jcp = jsession_get_jcl(js, class_or_package);
            if (NIL == jcp) {
                jsession_get_jpg(js, class_or_package);
            }
            if (NIL == jcp) {
                {
                    SubLObject classP = numE(ONE_INTEGER, jsession_exec(js, format(NIL, $str_alt71$import__a__self_modules___a______, new SubLObject[]{ class_or_package, class_or_package, class_or_package, class_or_package })));
                    if (NIL != classP) {
                        jcp = new_jcl(class_or_package, js);
                        jsession_set_jcl(js, jcp);
                    } else {
                        jcp = new_jpg(class_or_package, js);
                        jsession_set_jpg(js, jcp);
                    }
                }
            }
            return jcp;
        }
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param CLASS
     * 		stringp
     * 		Ensures that any instance of CLASS will be sent over according to the CFASL
     * 		protocol rather than as a proxy
     */
    public static final SubLObject jsession_map(SubLObject js, SubLObject v_class) {
        return jsession_exec(js, format(NIL, $str_alt72$import__a__self_literal_classes_a, v_class, v_class));
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param CLASS
     * 		stringp
     * 		Ensures that any instance of CLASS will be sent over as a proxy rather than
     * 		according to the CFASL protocol
     */
    public static final SubLObject jsession_unmap(SubLObject js, SubLObject v_class) {
        return jsession_exec(js, format(NIL, $str_alt73$import__a__self_literal_classes_r, v_class, v_class));
    }

    /**
     * Execute BODY with JS bound to a jsession running on machine HOST on port PORT
     */
    public static final SubLObject with_jsession(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt74);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject js = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt74);
                    js = current.first();
                    current = current.rest();
                    {
                        SubLObject host = (current.isCons()) ? ((SubLObject) (current.first())) : $jsession_host$.getGlobalValue();
                        destructuring_bind_must_listp(current, datum, $list_alt74);
                        current = current.rest();
                        {
                            SubLObject port = (current.isCons()) ? ((SubLObject) (current.first())) : $jsession_port$.getGlobalValue();
                            destructuring_bind_must_listp(current, datum, $list_alt74);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    return list(CLET, list(js), list(CUNWIND_PROTECT, listS(PROGN, list(CSETQ, js, list(NEW_JSESSION, host, port)), append(body, NIL)), list(PWHEN, list(JSESSION_P, js), list(JSESSION_CLOSE, js))));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt74);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final class $jpg_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return jubl.$jpg_native.structDecl;
        }

        public SubLObject getField2() {
            return $name;
        }

        public SubLObject getField3() {
            return $session;
        }

        public SubLObject setField2(SubLObject value) {
            return $name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $session = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $session = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(jubl.$jpg_native.class, JPG, JPG_P, $list_alt82, $list_alt83, new String[]{ "$name", "$session" }, $list_alt84, $list_alt85, JPG_PRINT);
    }

    // defconstant
    public static final SubLSymbol $dtp_jpg$ = makeSymbol("*DTP-JPG*");

    public static final SubLObject jpg_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        jpg_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject jpg_p(SubLObject v_object) {
        return v_object.getClass() == jubl.$jpg_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $jpg_p$UnaryFunction extends UnaryFunction {
        public $jpg_p$UnaryFunction() {
            super(extractFunctionNamed("JPG-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return jpg_p(arg1);
        }
    }

    public static final SubLObject jpg_name(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JPG_P);
        return v_object.getField2();
    }

    public static final SubLObject jpg_session(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JPG_P);
        return v_object.getField3();
    }

    public static final SubLObject _csetf_jpg_name(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JPG_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_jpg_session(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JPG_P);
        return v_object.setField3(value);
    }

    public static final SubLObject make_jpg(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new jubl.$jpg_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_jpg_name(v_new, current_value);
                    } else
                        if (pcase_var.eql($SESSION)) {
                            _csetf_jpg_session(v_new, current_value);
                        } else {
                            Errors.error($str_alt56$Invalid_slot__S_for_construction_, current_arg);
                        }

                }
            }
            return v_new;
        }
    }

    /**
     *
     *
     * @param PACKAGE
     * 		stringp
     * @param JS
     * 		jsesssion-p
     * @return jpg-p; a new package handle for PACKAGE belonging to JS
     */
    public static final SubLObject new_jpg(SubLObject v_package, SubLObject js) {
        {
            SubLObject jpg = make_jpg(UNPROVIDED);
            _csetf_jpg_name(jpg, v_package);
            _csetf_jpg_session(jpg, js);
            return jpg;
        }
    }

    /**
     * Pretty prints OBJECT to STREAM, ignoring DEPTH
     */
    public static final SubLObject jpg_print(SubLObject v_object, SubLObject stream, SubLObject depth) {
        write_string($str_alt94$__JPG__, stream, UNPROVIDED, UNPROVIDED);
        write_string(jpg_name(v_object), stream, UNPROVIDED, UNPROVIDED);
        if (NIL == open_jsession_p(jpg_session(v_object))) {
            write_string($str_alt95$__destroyed_, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str_alt96$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    /**
     *
     *
     * @param JPG
     * 		jpg-p
     * @return jcl-p
    Imports CLASS unless already imported and returns a jcl class object
     */
    public static final SubLObject jpg_import(SubLObject jpg, SubLObject v_class) {
        SubLTrampolineFile.checkType(jpg, JPG_P);
        SubLTrampolineFile.checkType(v_class, STRINGP);
        return jsession_import(jpg_session(jpg), cconcatenate(jpg_name(jpg), new SubLObject[]{ $str_alt97$_, v_class }));
    }

    /**
     *
     *
     * @param JPG
     * 		jpg-p
     * @return listp; a list of all classes in package JPG
     */
    public static final SubLObject jpg_classes(SubLObject jpg) {
        {
            SubLObject js = jpg_session(jpg);
            SubLObject v_package = jpg_name(jpg);
            SubLObject jin = jsession_exec(js, format(NIL, $str_alt98$dir_self_modules___a___, v_package));
            SubLObject v_classes = NIL;
            SubLObject classjin = NIL;
            SubLObject v_class = NIL;
            SubLObject sequence = jin;
            SubLObject size = jsession_exec(jin_session(sequence), format(NIL, $str_alt6$self_objects__a___a_a, new SubLObject[]{ jin_id(sequence), $str_alt29$__len__, jython_arglist(list(EMPTY_SUBL_OBJECT_ARRAY)) }));
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
                v_class = jsession_exec(jin_session(sequence), format(NIL, $str_alt6$self_objects__a___a_a, new SubLObject[]{ jin_id(sequence), $str_alt19$__getitem__, jython_arglist(list(i)) }));
                classjin = jsession_exec(js, format(NIL, $str_alt99$type_getattr_self_modules___a____, v_package, v_class));
                if (NIL != Strings.stringE(jcl_name(jin_class(classjin)), $str_alt62$org_python_core_PyJavaClass, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    v_classes = cons(jsession_import(js, cconcatenate(v_package, new SubLObject[]{ $str_alt97$_, v_class })), v_classes);
                }
            }
            return v_classes;
        }
    }

    public static final class $jcl_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return jubl.$jcl_native.structDecl;
        }

        public SubLObject getField2() {
            return $name;
        }

        public SubLObject getField3() {
            return $session;
        }

        public SubLObject setField2(SubLObject value) {
            return $name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $session = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $session = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(jubl.$jcl_native.class, JCL, JCL_P, $list_alt82, $list_alt83, new String[]{ "$name", "$session" }, $list_alt102, $list_alt103, JCL_PRINT);
    }

    // defconstant
    public static final SubLSymbol $dtp_jcl$ = makeSymbol("*DTP-JCL*");

    public static final SubLObject jcl_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        jcl_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject jcl_p(SubLObject v_object) {
        return v_object.getClass() == jubl.$jcl_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $jcl_p$UnaryFunction extends UnaryFunction {
        public $jcl_p$UnaryFunction() {
            super(extractFunctionNamed("JCL-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return jcl_p(arg1);
        }
    }

    public static final SubLObject jcl_name(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JCL_P);
        return v_object.getField2();
    }

    public static final SubLObject jcl_session(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JCL_P);
        return v_object.getField3();
    }

    public static final SubLObject _csetf_jcl_name(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JCL_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_jcl_session(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JCL_P);
        return v_object.setField3(value);
    }

    public static final SubLObject make_jcl(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new jubl.$jcl_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        _csetf_jcl_name(v_new, current_value);
                    } else
                        if (pcase_var.eql($SESSION)) {
                            _csetf_jcl_session(v_new, current_value);
                        } else {
                            Errors.error($str_alt56$Invalid_slot__S_for_construction_, current_arg);
                        }

                }
            }
            return v_new;
        }
    }

    /**
     *
     *
     * @param CLASS
     * 		stringp
     * @param JS
     * 		jsesssion-p
     * @return jcl-p; a new class handle for CLASS belonging to JS
     */
    public static final SubLObject new_jcl(SubLObject v_class, SubLObject js) {
        {
            SubLObject jcl = make_jcl(UNPROVIDED);
            _csetf_jcl_name(jcl, v_class);
            _csetf_jcl_session(jcl, js);
            return jcl;
        }
    }

    /**
     * Pretty prints OBJECT to STREAM, ignoring DEPTH
     */
    public static final SubLObject jcl_print(SubLObject v_object, SubLObject stream, SubLObject depth) {
        write_string($str_alt110$__JCL__, stream, UNPROVIDED, UNPROVIDED);
        write_string(jcl_name(v_object), stream, UNPROVIDED, UNPROVIDED);
        if (NIL == open_jsession_p(jcl_session(v_object))) {
            write_string($str_alt95$__destroyed_, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str_alt96$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    /**
     *
     *
     * @param JCL
     * 		jcl-p
     * @param FIELD
     * 		stringp
     * @return object; the value of the class attribute FIELD in class JCL
     */
    public static final SubLObject jcl_get(SubLObject jcl, SubLObject field) {
        SubLTrampolineFile.checkType(jcl, JCL_P);
        SubLTrampolineFile.checkType(field, STRINGP);
        return jsession_exec(jcl_session(jcl), format(NIL, $str_alt111$self_modules___a____a, jcl_name(jcl), field));
    }

    /**
     *
     *
     * @param JCL
     * 		jcl-p
     * @param FIELD
     * 		stringp
     * 		Sets class attribute FILED of class JCL to VALUE
     */
    public static final SubLObject jcl_set(SubLObject jcl, SubLObject field, SubLObject value) {
        SubLTrampolineFile.checkType(jcl, JCL_P);
        SubLTrampolineFile.checkType(field, STRINGP);
        return jsession_exec(jcl_session(jcl), format(NIL, $str_alt112$self_modules___a____a____a, new SubLObject[]{ jcl_name(jcl), field, value }));
    }

    /**
     *
     *
     * @param JCL
     * 		jcl-p
     * @param ARGS
     * 		listp
     * @return jin-p; a new instance of this class
     */
    public static final SubLObject jcl_new(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject jcl = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt113);
            jcl = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(JSESSION_EXEC, list(JCL_SESSION, jcl), list(FORMAT, NIL, $str_alt114$object___self_modules___a___a__ob, list(JCL_NAME, jcl), list(JYTHON_ARGLIST, bq_cons(LIST, append(args, NIL)))));
            }
        }
    }

    /**
     *
     *
     * @param JCL
     * 		jcl-p
     * @param METHOD
     * 		stringp
     * @param ARGS
     * 		listp
     * @return object; the result of calling class method METHOD with ARGS on class JCL
     */
    public static final SubLObject jcl_call(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject jcl = NIL;
            SubLObject method = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt115);
            jcl = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt115);
            method = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return list(JSESSION_EXEC, list(JCL_SESSION, jcl), list(FORMAT, NIL, $str_alt116$self_modules___a____a_a, list(JCL_NAME, jcl), method, list(JYTHON_ARGLIST, bq_cons(LIST, append(args, NIL)))));
            }
        }
    }

    /**
     * Execute BODY with JCL bound to a jcl handle to class CLASS and the jsession running
     * on machine HOST on port PORT
     */
    public static final SubLObject with_jcl(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt117);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject jcl = NIL;
                    SubLObject v_class = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    jcl = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt117);
                    v_class = current.first();
                    current = current.rest();
                    {
                        SubLObject host = (current.isCons()) ? ((SubLObject) (current.first())) : $jsession_host$.getGlobalValue();
                        destructuring_bind_must_listp(current, datum, $list_alt117);
                        current = current.rest();
                        {
                            SubLObject port = (current.isCons()) ? ((SubLObject) (current.first())) : $jsession_port$.getGlobalValue();
                            destructuring_bind_must_listp(current, datum, $list_alt117);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    SubLObject js = $sym118$JS;
                                    return list(CLET, list(jcl), listS(WITH_JSESSION, list(js, host, port), list(CSETQ, jcl, list(JSESSION_IMPORT, js, v_class)), append(body, NIL)));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt117);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static final class $jin_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return jubl.$jin_native.structDecl;
        }

        public SubLObject getField2() {
            return $session;
        }

        public SubLObject getField3() {
            return $class;
        }

        public SubLObject getField4() {
            return $id;
        }

        public SubLObject setField2(SubLObject value) {
            return $session = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $class = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $id = value;
        }

        public SubLObject $session = Lisp.NIL;

        public SubLObject $class = Lisp.NIL;

        public SubLObject $id = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(jubl.$jin_native.class, JIN, JIN_P, $list_alt123, $list_alt124, new String[]{ "$session", "$class", "$id" }, $list_alt125, $list_alt126, JIN_PRINT);
    }

    // defconstant
    public static final SubLSymbol $dtp_jin$ = makeSymbol("*DTP-JIN*");

    public static final SubLObject jin_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        jin_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject jin_p(SubLObject v_object) {
        return v_object.getClass() == jubl.$jin_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $jin_p$UnaryFunction extends UnaryFunction {
        public $jin_p$UnaryFunction() {
            super(extractFunctionNamed("JIN-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return jin_p(arg1);
        }
    }

    public static final SubLObject jin_session(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JIN_P);
        return v_object.getField2();
    }

    public static final SubLObject jin_class(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JIN_P);
        return v_object.getField3();
    }

    public static final SubLObject jin_id(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, JIN_P);
        return v_object.getField4();
    }

    public static final SubLObject _csetf_jin_session(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JIN_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_jin_class(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JIN_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_jin_id(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, JIN_P);
        return v_object.setField4(value);
    }

    public static final SubLObject make_jin(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new jubl.$jin_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($SESSION)) {
                        _csetf_jin_session(v_new, current_value);
                    } else
                        if (pcase_var.eql($CLASS)) {
                            _csetf_jin_class(v_new, current_value);
                        } else
                            if (pcase_var.eql($ID)) {
                                _csetf_jin_id(v_new, current_value);
                            } else {
                                Errors.error($str_alt56$Invalid_slot__S_for_construction_, current_arg);
                            }


                }
            }
            return v_new;
        }
    }

    /**
     * Pretty prints OBJECT to STREAM, ignoring DEPTH
     */
    public static final SubLObject jin_print(SubLObject v_object, SubLObject stream, SubLObject depth) {
        write_string($str_alt135$__JIN__, stream, UNPROVIDED, UNPROVIDED);
        write_string(jcl_name(jin_class(v_object)), stream, UNPROVIDED, UNPROVIDED);
        if (NIL == open_jsession_p(jin_session(v_object))) {
            write_string($str_alt95$__destroyed_, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str_alt96$_, stream, UNPROVIDED, UNPROVIDED);
        return v_object;
    }

    /**
     *
     *
     * @param JIN
     * 		jin-p
     * @param FIELD
     * 		stringp
     * @return object; the value of the instance attribute FIELD in instance JIN
     */
    public static final SubLObject jin_get(SubLObject jin, SubLObject field) {
        SubLTrampolineFile.checkType(jin, JIN_P);
        SubLTrampolineFile.checkType(field, STRINGP);
        return jsession_exec(jin_session(jin), format(NIL, $str_alt136$self_objects__a___a, jin_id(jin), field));
    }

    /**
     *
     *
     * @param JIN
     * 		jin-p
     * @param FIELD
     * 		stringp
     * 		Sets instance attribute FIELD of instance JIN to VALUE
     */
    public static final SubLObject jin_set(SubLObject jin, SubLObject field, SubLObject value) {
        SubLTrampolineFile.checkType(jin, JIN_P);
        SubLTrampolineFile.checkType(field, STRINGP);
        return jsession_exec(jin_session(jin), format(NIL, $str_alt137$self_objects__a___a____a, new SubLObject[]{ jin_id(jin), field, value }));
    }

    /**
     *
     *
     * @param JIN
     * 		jin-p
     * 		Destroys JIN
     */
    public static final SubLObject jin_destroy(SubLObject jin) {
        SubLTrampolineFile.checkType(jin, JIN_P);
        if (NIL != open_jsession_p(jin_session(jin))) {
            jsession_exec(jin_session(jin), format(NIL, $str_alt138$del_self_objects__a_, jin_id(jin)));
            jsession_remove_jin(jin_session(jin), jin);
            _csetf_jin_session(jin, NIL);
        }
        return jin;
    }

    /**
     *
     *
     * @param JIN
     * 		jin-p
     * @param CLASS
     * 		stringp
     * 		Throw an error unless JIN is of type CLASS
     */
    public static final SubLObject check_jin_type(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject jin = NIL;
            SubLObject v_class = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt139);
            jin = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt139);
            v_class = current.first();
            current = current.rest();
            if (NIL == current) {
                return list(MUST, list(CAND, list(JIN_P, jin), list($sym142$STRING_, list(JCL_NAME, list(JIN_CLASS, jin)), v_class)), $str_alt143$_a_is_not_a__a, jin, v_class);
            } else {
                cdestructuring_bind_error(datum, $list_alt139);
            }
        }
        return NIL;
    }

    /**
     * Execute BODY with JIN bound to an instance of class CLASS and the jsession
     * running on machine HOST on port PORT
     */
    public static final SubLObject with_jin(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt144);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject jin = NIL;
                    SubLObject v_class = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    jin = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt144);
                    v_class = current.first();
                    current = current.rest();
                    {
                        SubLObject host = (current.isCons()) ? ((SubLObject) (current.first())) : $jsession_host$.getGlobalValue();
                        destructuring_bind_must_listp(current, datum, $list_alt144);
                        current = current.rest();
                        {
                            SubLObject port = (current.isCons()) ? ((SubLObject) (current.first())) : $jsession_port$.getGlobalValue();
                            destructuring_bind_must_listp(current, datum, $list_alt144);
                            current = current.rest();
                            if (NIL == current) {
                                current = temp;
                                {
                                    SubLObject body = current;
                                    SubLObject jcl = $sym145$JCL;
                                    return listS(WITH_JCL, list(jcl, v_class, host, port), list(CSETQ, jin, list(JCL_NEW, jcl)), append(body, NIL));
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list_alt144);
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param JCL
     * 		jcl-p
     * @return listp; a list of all fields of class JCL
     */
    public static final SubLObject jcl_fields(SubLObject jcl) {
        SubLTrampolineFile.checkType(jcl, JCL_P);
        jsession_import(jcl_session(jcl), $str_alt148$java_lang_Class);
        {
            SubLObject jin_seq = jsession_exec(jcl_session(jsession_import(jcl_session(jcl), jcl_name(jcl))), format(NIL, $str_alt116$self_modules___a____a_a, new SubLObject[]{ jcl_name(jsession_import(jcl_session(jcl), jcl_name(jcl))), $$$getFields, jython_arglist(list(EMPTY_SUBL_OBJECT_ARRAY)) }));
            SubLObject fields = jseq_to_list(jin_seq);
            jin_destroy(jin_seq);
            return fields;
        }
    }

    /**
     *
     *
     * @param JCL
     * 		jcl-p
     * @return listp; a list of all constructors of class JCL
     */
    public static final SubLObject jcl_constructors(SubLObject jcl) {
        SubLTrampolineFile.checkType(jcl, JCL_P);
        jsession_import(jcl_session(jcl), $str_alt148$java_lang_Class);
        {
            SubLObject jin_seq = jsession_exec(jcl_session(jsession_import(jcl_session(jcl), jcl_name(jcl))), format(NIL, $str_alt116$self_modules___a____a_a, new SubLObject[]{ jcl_name(jsession_import(jcl_session(jcl), jcl_name(jcl))), $$$getConstructors, jython_arglist(list(EMPTY_SUBL_OBJECT_ARRAY)) }));
            SubLObject constructors = jseq_to_list(jin_seq);
            jin_destroy(jin_seq);
            return constructors;
        }
    }

    /**
     *
     *
     * @param JCL
     * 		jcl-p
     * @return listp; a list of all methods of class JCL
     */
    public static final SubLObject jcl_methods(SubLObject jcl) {
        SubLTrampolineFile.checkType(jcl, JCL_P);
        jsession_import(jcl_session(jcl), $str_alt148$java_lang_Class);
        {
            SubLObject jin_seq = jsession_exec(jcl_session(jsession_import(jcl_session(jcl), jcl_name(jcl))), format(NIL, $str_alt116$self_modules___a____a_a, new SubLObject[]{ jcl_name(jsession_import(jcl_session(jcl), jcl_name(jcl))), $$$getMethods, jython_arglist(list(EMPTY_SUBL_OBJECT_ARRAY)) }));
            SubLObject v_methods = jseq_to_list(jin_seq);
            jin_destroy(jin_seq);
            return v_methods;
        }
    }

    /**
     *
     *
     * @param JIN
     * 		jin-p; a field, constructor or method
     * @return boolean; t if JIN is a class member, false otherwise
     */
    public static final SubLObject jin_class_member_p(SubLObject member) {
        SubLTrampolineFile.checkType(member, JIN_P);
        return numE(jsession_exec(jcl_session(jsession_import(jin_session(member), $str_alt152$java_lang_reflect_Modifier)), format(NIL, $str_alt116$self_modules___a____a_a, new SubLObject[]{ jcl_name(jsession_import(jin_session(member), $str_alt152$java_lang_reflect_Modifier)), $$$isStatic, jython_arglist(list(jsession_exec(jin_session(member), format(NIL, $str_alt6$self_objects__a___a_a, new SubLObject[]{ jin_id(member), $$$getModifiers, jython_arglist(list(EMPTY_SUBL_OBJECT_ARRAY)) })))) })), ONE_INTEGER);
    }

    /**
     *
     *
     * @param JIN
     * 		jin-p; a field, constructor or method
     * @return boolean; t if JIN is an instance member, false otherwise
     */
    public static final SubLObject jin_instance_member_p(SubLObject member) {
        return makeBoolean(NIL == jin_class_member_p(member));
    }

    /**
     *
     *
     * @param JIN
     * 		jin-p; a field, constructor or method
     * @return boolean; t if JIN is final, false otherwise
     */
    public static final SubLObject jin_final_member_p(SubLObject member) {
        SubLTrampolineFile.checkType(member, JIN_P);
        return numE(jsession_exec(jcl_session(jsession_import(jin_session(member), $str_alt152$java_lang_reflect_Modifier)), format(NIL, $str_alt116$self_modules___a____a_a, new SubLObject[]{ jcl_name(jsession_import(jin_session(member), $str_alt152$java_lang_reflect_Modifier)), $$$isFinal, jython_arglist(list(jsession_exec(jin_session(member), format(NIL, $str_alt6$self_objects__a___a_a, new SubLObject[]{ jin_id(member), $$$getModifiers, jython_arglist(list(EMPTY_SUBL_OBJECT_ARRAY)) })))) })), ONE_INTEGER);
    }

    /**
     *
     *
     * @param JIN
     * 		jin-p; a field, constructor or method
     * @return boolean; t if JIN is non-final, false otherwise
     */
    public static final SubLObject jin_non_final_member_p(SubLObject member) {
        return makeBoolean(NIL == jin_final_member_p(member));
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param REQUEST
     * 		stringp
     * @return object; the result of evaluating REQUEST within the Jython server that
    JS is connected to
     */
    public static final SubLObject jsession_exec(SubLObject js, SubLObject request) {
        SubLTrampolineFile.checkType(js, JSESSION_P);
        SubLTrampolineFile.checkType(request, STRINGP);
        cfasl_output(request, jsession_channel(js));
        finish_output(jsession_channel(js));
        return jsession_decode(js, cfasl_input(jsession_channel(js), UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param CLASS
     * 		stringp
     * @return jcl-p; the jcl corresponding to CLASS
     */
    public static final SubLObject jsession_get_jcl(SubLObject js, SubLObject v_class) {
        return dictionary.dictionary_lookup(jsession_classes(js), v_class, UNPROVIDED);
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param JCL
     * 		jcl-p
     * 		Records the fact that JCL has been imported into JS
     */
    public static final SubLObject jsession_set_jcl(SubLObject js, SubLObject jcl) {
        return dictionary.dictionary_enter(jsession_classes(js), jcl_name(jcl), jcl);
    }

    /**
     * Removes all jcls from session JS
     */
    public static final SubLObject jsession_destroy_classes(SubLObject js) {
        return dictionary.clear_dictionary(jsession_classes(js));
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param CLASS
     * 		stringp
     * @return jcl-p; the jcl corresponding to CLASS
     */
    public static final SubLObject jsession_get_jpg(SubLObject js, SubLObject v_package) {
        return assoc(v_package, jsession_packages(js), EQUAL, UNPROVIDED).rest();
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param JCL
     * 		jcl-p
     * 		Records the fact that JCL has been imported into JS
     */
    public static final SubLObject jsession_set_jpg(SubLObject js, SubLObject jpg) {
        _csetf_jsession_packages(js, cons(cons(jpg_name(jpg), jpg), jsession_packages(js)));
        return js;
    }

    /**
     * Removes all jpgs from session JS
     */
    public static final SubLObject jsession_destroy_packages(SubLObject js) {
        _csetf_jsession_packages(js, NIL);
        return js;
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param ID
     * 		positive-integer-p
     * @param CLASS
     * 		stringp
     * @return jin-p; a new jin instance of CLASS with id ID
     */
    public static final SubLObject jsession_make_jin(SubLObject js, SubLObject id, SubLObject v_class) {
        {
            SubLObject jcl = jsession_import(js, v_class);
            SubLObject jin = make_jin(UNPROVIDED);
            _csetf_jin_session(jin, js);
            _csetf_jin_class(jin, jcl);
            _csetf_jin_id(jin, id);
            jsession_set_jin(js, jin);
            return jin;
        }
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param ID
     * 		positive-integer-p
     * @return jin-p; the object whose in JS is ID
     */
    public static final SubLObject jsession_get_jin(SubLObject js, SubLObject id) {
        return gethash(id, jsession_objects(js), UNPROVIDED);
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param JIN
     * 		jin-p
     * 		Stores the instance JIN in JS
     */
    public static final SubLObject jsession_set_jin(SubLObject js, SubLObject jin) {
        return sethash(jin_id(jin), jsession_objects(js), jin);
    }

    /**
     *
     *
     * @param JS
     * 		jsession-p
     * @param JIN
     * 		jin-p
     * 		Removes JIN from JS's object table
     */
    public static final SubLObject jsession_remove_jin(SubLObject js, SubLObject jin) {
        return remhash(jin_id(jin), jsession_objects(js));
    }

    /**
     * Removes all jins from session JS
     */
    public static final SubLObject jsession_destroy_objects(SubLObject js) {
        return clrhash(jsession_objects(js));
    }

    /**
     *
     *
     * @param RESPONSE
     * 		listp; a response from the Jython server encoded as a two-element
     * 		list whose first element is the type of response and remainder is the content
     */
    public static final SubLObject jsession_decode(SubLObject js, SubLObject response) {
        {
            SubLObject pcase_var = response.first();
            if (pcase_var.eql(MINUS_ONE_INTEGER)) {
                Errors.error(second(response));
            } else
                if (pcase_var.eql(ONE_INTEGER)) {
                    return second(response);
                } else
                    if (pcase_var.eql(TWO_INTEGER)) {
                        {
                            SubLObject jin = jsession_get_jin(js, second(response).first());
                            if (NIL == jin) {
                                jin = jsession_make_jin(js, second(response).first(), second(second(response)));
                            }
                            return jin;
                        }
                    } else {
                        Errors.error($str_alt156$Unknown_response_code__a, response.first());
                    }


        }
        return NIL;
    }

    /**
     * Transforms list LIST into the printed represenation of the equivalent Jython list
     */
    public static final SubLObject jython_arglist(SubLObject list) {
        if (NIL == list) {
            return $str_alt157$__;
        }
        {
            SubLObject string = cconcatenate($str_alt158$_, jarg_to_string(list.first()));
            SubLObject cdolist_list_var = list.rest();
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                string = cconcatenate(string, new SubLObject[]{ $str_alt159$__, jarg_to_string(element) });
            }
            return cconcatenate(string, $str_alt160$_);
        }
    }

    /**
     * Converts JARG to a Jython evaluatable string representation
     */
    public static final SubLObject jarg_to_string(SubLObject jarg) {
        return NIL != jin_p(jarg) ? ((SubLObject) (format(NIL, $str_alt161$self_objects__a_, jin_id(jarg)))) : jarg.isDouble() ? ((SubLObject) (float_to_string(jarg))) : NIL == jarg ? ((SubLObject) ($$$None)) : prin1_to_string(jarg);
    }

    public static final SubLObject float_to_string(SubLObject v_float) {
        return substitute(CHAR_e, CHAR_d, prin1_to_string(v_float), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject declare_jubl_file() {
        declareMacro("jin_call", "JIN-CALL");
        declareMacro("do_jin_sequence", "DO-JIN-SEQUENCE");
        declareMacro("some_jin_sequence", "SOME-JIN-SEQUENCE");
        declareFunction("jseq_to_list", "JSEQ-TO-LIST", 1, 0, false);
        declareFunction("jsession_print_function_trampoline", "JSESSION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("jsession_p", "JSESSION-P", 1, 0, false);
        new jubl.$jsession_p$UnaryFunction();
        declareFunction("jsession_host", "JSESSION-HOST", 1, 0, false);
        declareFunction("jsession_port", "JSESSION-PORT", 1, 0, false);
        declareFunction("jsession_channel", "JSESSION-CHANNEL", 1, 0, false);
        declareFunction("jsession_packages", "JSESSION-PACKAGES", 1, 0, false);
        declareFunction("jsession_classes", "JSESSION-CLASSES", 1, 0, false);
        declareFunction("jsession_objects", "JSESSION-OBJECTS", 1, 0, false);
        declareFunction("_csetf_jsession_host", "_CSETF-JSESSION-HOST", 2, 0, false);
        declareFunction("_csetf_jsession_port", "_CSETF-JSESSION-PORT", 2, 0, false);
        declareFunction("_csetf_jsession_channel", "_CSETF-JSESSION-CHANNEL", 2, 0, false);
        declareFunction("_csetf_jsession_packages", "_CSETF-JSESSION-PACKAGES", 2, 0, false);
        declareFunction("_csetf_jsession_classes", "_CSETF-JSESSION-CLASSES", 2, 0, false);
        declareFunction("_csetf_jsession_objects", "_CSETF-JSESSION-OBJECTS", 2, 0, false);
        declareFunction("make_jsession", "MAKE-JSESSION", 0, 1, false);
        declareFunction("new_jsession", "NEW-JSESSION", 2, 1, false);
        declareFunction("jsession_print", "JSESSION-PRINT", 3, 0, false);
        declareFunction("jsession_close", "JSESSION-CLOSE", 1, 0, false);
        declareFunction("jsession_open_p", "JSESSION-OPEN-P", 1, 0, false);
        declareFunction("open_jsession_p", "OPEN-JSESSION-P", 1, 0, false);
        declareFunction("jsession_import", "JSESSION-IMPORT", 2, 0, false);
        declareFunction("jsession_map", "JSESSION-MAP", 2, 0, false);
        declareFunction("jsession_unmap", "JSESSION-UNMAP", 2, 0, false);
        declareMacro("with_jsession", "WITH-JSESSION");
        declareFunction("jpg_print_function_trampoline", "JPG-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("jpg_p", "JPG-P", 1, 0, false);
        new jubl.$jpg_p$UnaryFunction();
        declareFunction("jpg_name", "JPG-NAME", 1, 0, false);
        declareFunction("jpg_session", "JPG-SESSION", 1, 0, false);
        declareFunction("_csetf_jpg_name", "_CSETF-JPG-NAME", 2, 0, false);
        declareFunction("_csetf_jpg_session", "_CSETF-JPG-SESSION", 2, 0, false);
        declareFunction("make_jpg", "MAKE-JPG", 0, 1, false);
        declareFunction("new_jpg", "NEW-JPG", 2, 0, false);
        declareFunction("jpg_print", "JPG-PRINT", 3, 0, false);
        declareFunction("jpg_import", "JPG-IMPORT", 2, 0, false);
        declareFunction("jpg_classes", "JPG-CLASSES", 1, 0, false);
        declareFunction("jcl_print_function_trampoline", "JCL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("jcl_p", "JCL-P", 1, 0, false);
        new jubl.$jcl_p$UnaryFunction();
        declareFunction("jcl_name", "JCL-NAME", 1, 0, false);
        declareFunction("jcl_session", "JCL-SESSION", 1, 0, false);
        declareFunction("_csetf_jcl_name", "_CSETF-JCL-NAME", 2, 0, false);
        declareFunction("_csetf_jcl_session", "_CSETF-JCL-SESSION", 2, 0, false);
        declareFunction("make_jcl", "MAKE-JCL", 0, 1, false);
        declareFunction("new_jcl", "NEW-JCL", 2, 0, false);
        declareFunction("jcl_print", "JCL-PRINT", 3, 0, false);
        declareFunction("jcl_get", "JCL-GET", 2, 0, false);
        declareFunction("jcl_set", "JCL-SET", 3, 0, false);
        declareMacro("jcl_new", "JCL-NEW");
        declareMacro("jcl_call", "JCL-CALL");
        declareMacro("with_jcl", "WITH-JCL");
        declareFunction("jin_print_function_trampoline", "JIN-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("jin_p", "JIN-P", 1, 0, false);
        new jubl.$jin_p$UnaryFunction();
        declareFunction("jin_session", "JIN-SESSION", 1, 0, false);
        declareFunction("jin_class", "JIN-CLASS", 1, 0, false);
        declareFunction("jin_id", "JIN-ID", 1, 0, false);
        declareFunction("_csetf_jin_session", "_CSETF-JIN-SESSION", 2, 0, false);
        declareFunction("_csetf_jin_class", "_CSETF-JIN-CLASS", 2, 0, false);
        declareFunction("_csetf_jin_id", "_CSETF-JIN-ID", 2, 0, false);
        declareFunction("make_jin", "MAKE-JIN", 0, 1, false);
        declareFunction("jin_print", "JIN-PRINT", 3, 0, false);
        declareFunction("jin_get", "JIN-GET", 2, 0, false);
        declareFunction("jin_set", "JIN-SET", 3, 0, false);
        declareFunction("jin_destroy", "JIN-DESTROY", 1, 0, false);
        declareMacro("check_jin_type", "CHECK-JIN-TYPE");
        declareMacro("with_jin", "WITH-JIN");
        declareFunction("jcl_fields", "JCL-FIELDS", 1, 0, false);
        declareFunction("jcl_constructors", "JCL-CONSTRUCTORS", 1, 0, false);
        declareFunction("jcl_methods", "JCL-METHODS", 1, 0, false);
        declareFunction("jin_class_member_p", "JIN-CLASS-MEMBER-P", 1, 0, false);
        declareFunction("jin_instance_member_p", "JIN-INSTANCE-MEMBER-P", 1, 0, false);
        declareFunction("jin_final_member_p", "JIN-FINAL-MEMBER-P", 1, 0, false);
        declareFunction("jin_non_final_member_p", "JIN-NON-FINAL-MEMBER-P", 1, 0, false);
        declareFunction("jsession_exec", "JSESSION-EXEC", 2, 0, false);
        declareFunction("jsession_get_jcl", "JSESSION-GET-JCL", 2, 0, false);
        declareFunction("jsession_set_jcl", "JSESSION-SET-JCL", 2, 0, false);
        declareFunction("jsession_destroy_classes", "JSESSION-DESTROY-CLASSES", 1, 0, false);
        declareFunction("jsession_get_jpg", "JSESSION-GET-JPG", 2, 0, false);
        declareFunction("jsession_set_jpg", "JSESSION-SET-JPG", 2, 0, false);
        declareFunction("jsession_destroy_packages", "JSESSION-DESTROY-PACKAGES", 1, 0, false);
        declareFunction("jsession_make_jin", "JSESSION-MAKE-JIN", 3, 0, false);
        declareFunction("jsession_get_jin", "JSESSION-GET-JIN", 2, 0, false);
        declareFunction("jsession_set_jin", "JSESSION-SET-JIN", 2, 0, false);
        declareFunction("jsession_remove_jin", "JSESSION-REMOVE-JIN", 2, 0, false);
        declareFunction("jsession_destroy_objects", "JSESSION-DESTROY-OBJECTS", 1, 0, false);
        declareFunction("jsession_decode", "JSESSION-DECODE", 2, 0, false);
        declareFunction("jython_arglist", "JYTHON-ARGLIST", 1, 0, false);
        declareFunction("jarg_to_string", "JARG-TO-STRING", 1, 0, false);
        declareFunction("float_to_string", "FLOAT-TO-STRING", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_jubl_file() {
        deflexical("*JSESSION-HOST*", $str_alt0$billie_cyc_com);
        deflexical("*JSESSION-PORT*", $int$9998);
        defparameter("*JSESSION*", NIL);
        defconstant("*DTP-JSESSION*", JSESSION);
        defconstant("*DTP-JPG*", JPG);
        defconstant("*DTP-JCL*", JCL);
        defconstant("*DTP-JIN*", JIN);
        return NIL;
    }

    public static final SubLObject setup_jubl_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_jsession$.getGlobalValue(), symbol_function(JSESSION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(JSESSION_HOST, _CSETF_JSESSION_HOST);
        def_csetf(JSESSION_PORT, _CSETF_JSESSION_PORT);
        def_csetf(JSESSION_CHANNEL, _CSETF_JSESSION_CHANNEL);
        def_csetf(JSESSION_PACKAGES, _CSETF_JSESSION_PACKAGES);
        def_csetf(JSESSION_CLASSES, _CSETF_JSESSION_CLASSES);
        def_csetf(JSESSION_OBJECTS, _CSETF_JSESSION_OBJECTS);
        identity(JSESSION);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_jpg$.getGlobalValue(), symbol_function(JPG_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(JPG_NAME, _CSETF_JPG_NAME);
        def_csetf(JPG_SESSION, _CSETF_JPG_SESSION);
        identity(JPG);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_jcl$.getGlobalValue(), symbol_function(JCL_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(JCL_NAME, _CSETF_JCL_NAME);
        def_csetf(JCL_SESSION, _CSETF_JCL_SESSION);
        identity(JCL);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_jin$.getGlobalValue(), symbol_function(JIN_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(JIN_SESSION, _CSETF_JIN_SESSION);
        def_csetf(JIN_CLASS, _CSETF_JIN_CLASS);
        def_csetf(JIN_ID, _CSETF_JIN_ID);
        identity(JIN);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $str_alt0$billie_cyc_com = makeString("billie.cyc.com");

    public static final SubLInteger $int$9998 = makeInteger(9998);

    static private final SubLList $list_alt2 = list(makeSymbol("JIN"), makeSymbol("METHOD"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol JSESSION_EXEC = makeSymbol("JSESSION-EXEC");

    private static final SubLSymbol JIN_SESSION = makeSymbol("JIN-SESSION");



    static private final SubLString $str_alt6$self_objects__a___a_a = makeString("self.objects[~a].~a~a");

    private static final SubLSymbol JIN_ID = makeSymbol("JIN-ID");

    private static final SubLSymbol JYTHON_ARGLIST = makeSymbol("JYTHON-ARGLIST");



    static private final SubLList $list_alt10 = list(list(makeSymbol("ELEMENT"), makeSymbol("SEQ-EXPRESSION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym11$SEQUENCE = makeUninternedSymbol("SEQUENCE");

    static private final SubLSymbol $sym12$SIZE = makeUninternedSymbol("SIZE");

    static private final SubLSymbol $sym13$I = makeUninternedSymbol("I");



    private static final SubLSymbol JIN_CALL = makeSymbol("JIN-CALL");

    static private final SubLList $list_alt16 = list(makeString("__len__"));





    static private final SubLString $str_alt19$__getitem__ = makeString("__getitem__");

    static private final SubLList $list_alt20 = list(list(makeSymbol("ELEMENT"), makeSymbol("SEQ-EXPRESSION"), makeSymbol("ENDVAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym21$SEQUENCE = makeUninternedSymbol("SEQUENCE");

    static private final SubLSymbol $sym22$SIZE = makeUninternedSymbol("SIZE");

    static private final SubLSymbol $sym23$DONE_VAR = makeUninternedSymbol("DONE-VAR");

    static private final SubLSymbol $sym24$I = makeUninternedSymbol("I");



    static private final SubLSymbol $sym26$1_ = makeSymbol("1+");



    static private final SubLSymbol $sym28$_ = makeSymbol("=");

    static private final SubLString $str_alt29$__len__ = makeString("__len__");

    private static final SubLSymbol JSESSION = makeSymbol("JSESSION");

    private static final SubLSymbol JSESSION_P = makeSymbol("JSESSION-P");

    static private final SubLList $list_alt32 = list(makeSymbol("HOST"), makeSymbol("PORT"), makeSymbol("CHANNEL"), makeSymbol("PACKAGES"), makeSymbol("CLASSES"), makeSymbol("OBJECTS"));

    static private final SubLList $list_alt33 = list($HOST, $PORT, makeKeyword("CHANNEL"), makeKeyword("PACKAGES"), makeKeyword("CLASSES"), makeKeyword("OBJECTS"));

    static private final SubLList $list_alt34 = list(makeSymbol("JSESSION-HOST"), makeSymbol("JSESSION-PORT"), makeSymbol("JSESSION-CHANNEL"), makeSymbol("JSESSION-PACKAGES"), makeSymbol("JSESSION-CLASSES"), makeSymbol("JSESSION-OBJECTS"));

    static private final SubLList $list_alt35 = list(makeSymbol("_CSETF-JSESSION-HOST"), makeSymbol("_CSETF-JSESSION-PORT"), makeSymbol("_CSETF-JSESSION-CHANNEL"), makeSymbol("_CSETF-JSESSION-PACKAGES"), makeSymbol("_CSETF-JSESSION-CLASSES"), makeSymbol("_CSETF-JSESSION-OBJECTS"));

    private static final SubLSymbol JSESSION_PRINT = makeSymbol("JSESSION-PRINT");

    private static final SubLSymbol JSESSION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("JSESSION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol JSESSION_HOST = makeSymbol("JSESSION-HOST");

    public static final SubLSymbol _CSETF_JSESSION_HOST = makeSymbol("_CSETF-JSESSION-HOST");

    private static final SubLSymbol JSESSION_PORT = makeSymbol("JSESSION-PORT");

    public static final SubLSymbol _CSETF_JSESSION_PORT = makeSymbol("_CSETF-JSESSION-PORT");

    private static final SubLSymbol JSESSION_CHANNEL = makeSymbol("JSESSION-CHANNEL");

    public static final SubLSymbol _CSETF_JSESSION_CHANNEL = makeSymbol("_CSETF-JSESSION-CHANNEL");

    private static final SubLSymbol JSESSION_PACKAGES = makeSymbol("JSESSION-PACKAGES");

    public static final SubLSymbol _CSETF_JSESSION_PACKAGES = makeSymbol("_CSETF-JSESSION-PACKAGES");

    private static final SubLSymbol JSESSION_CLASSES = makeSymbol("JSESSION-CLASSES");

    public static final SubLSymbol _CSETF_JSESSION_CLASSES = makeSymbol("_CSETF-JSESSION-CLASSES");

    private static final SubLSymbol JSESSION_OBJECTS = makeSymbol("JSESSION-OBJECTS");

    public static final SubLSymbol _CSETF_JSESSION_OBJECTS = makeSymbol("_CSETF-JSESSION-OBJECTS");







    private static final SubLSymbol $PACKAGES = makeKeyword("PACKAGES");



    private static final SubLSymbol $OBJECTS = makeKeyword("OBJECTS");

    static private final SubLString $str_alt56$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");









    static private final SubLString $str_alt61$Can_t_create_new_jsession__timeou = makeString("Can't create new jsession: timeout");

    static private final SubLString $str_alt62$org_python_core_PyJavaClass = makeString("org.python.core.PyJavaClass");



    static private final SubLString $str_alt64$import__a__self_modules___a______ = makeString("import ~a~%self.modules['~a'] = ~a");

    static private final SubLString $str_alt65$__JSESSION_ = makeString("#<JSESSION ");

    static private final SubLString $str_alt66$closed_ = makeString("closed ");

    static private final SubLString $$$to = makeString("to");

    static private final SubLString $str_alt68$__ = makeString(" [");

    static private final SubLString $str_alt69$_ = makeString("/");

    static private final SubLString $str_alt70$__ = makeString("]>");

    static private final SubLString $str_alt71$import__a__self_modules___a______ = makeString("import ~a~%self.modules['~a'] = ~a~%isinstance(~a, self.modules['org.python.core.PyJavaClass'])");

    static private final SubLString $str_alt72$import__a__self_literal_classes_a = makeString("import ~a~%self.literal_classes.append(~a)");

    static private final SubLString $str_alt73$import__a__self_literal_classes_r = makeString("import ~a~%self.literal_classes.remove(~a)");

    static private final SubLList $list_alt74 = list(list(makeSymbol("JS"), makeSymbol("&OPTIONAL"), list(makeSymbol("HOST"), makeSymbol("*JSESSION-HOST*")), list(makeSymbol("PORT"), makeSymbol("*JSESSION-PORT*"))), makeSymbol("&BODY"), makeSymbol("BODY"));





    private static final SubLSymbol NEW_JSESSION = makeSymbol("NEW-JSESSION");



    private static final SubLSymbol JSESSION_CLOSE = makeSymbol("JSESSION-CLOSE");

    private static final SubLSymbol JPG = makeSymbol("JPG");

    private static final SubLSymbol JPG_P = makeSymbol("JPG-P");

    static private final SubLList $list_alt82 = list(makeSymbol("NAME"), makeSymbol("SESSION"));

    static private final SubLList $list_alt83 = list($NAME, makeKeyword("SESSION"));

    static private final SubLList $list_alt84 = list(makeSymbol("JPG-NAME"), makeSymbol("JPG-SESSION"));

    static private final SubLList $list_alt85 = list(makeSymbol("_CSETF-JPG-NAME"), makeSymbol("_CSETF-JPG-SESSION"));

    private static final SubLSymbol JPG_PRINT = makeSymbol("JPG-PRINT");

    private static final SubLSymbol JPG_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("JPG-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol JPG_NAME = makeSymbol("JPG-NAME");

    public static final SubLSymbol _CSETF_JPG_NAME = makeSymbol("_CSETF-JPG-NAME");

    private static final SubLSymbol JPG_SESSION = makeSymbol("JPG-SESSION");

    public static final SubLSymbol _CSETF_JPG_SESSION = makeSymbol("_CSETF-JPG-SESSION");





    static private final SubLString $str_alt94$__JPG__ = makeString("#<JPG: ");

    static private final SubLString $str_alt95$__destroyed_ = makeString(" (destroyed)");

    static private final SubLString $str_alt96$_ = makeString(">");

    static private final SubLString $str_alt97$_ = makeString(".");

    static private final SubLString $str_alt98$dir_self_modules___a___ = makeString("dir(self.modules['~a'])");

    static private final SubLString $str_alt99$type_getattr_self_modules___a____ = makeString("type(getattr(self.modules['~a'], ~s))");

    private static final SubLSymbol JCL = makeSymbol("JCL");

    private static final SubLSymbol JCL_P = makeSymbol("JCL-P");

    static private final SubLList $list_alt102 = list(makeSymbol("JCL-NAME"), makeSymbol("JCL-SESSION"));

    static private final SubLList $list_alt103 = list(makeSymbol("_CSETF-JCL-NAME"), makeSymbol("_CSETF-JCL-SESSION"));

    private static final SubLSymbol JCL_PRINT = makeSymbol("JCL-PRINT");

    private static final SubLSymbol JCL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("JCL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol JCL_NAME = makeSymbol("JCL-NAME");

    public static final SubLSymbol _CSETF_JCL_NAME = makeSymbol("_CSETF-JCL-NAME");

    private static final SubLSymbol JCL_SESSION = makeSymbol("JCL-SESSION");

    public static final SubLSymbol _CSETF_JCL_SESSION = makeSymbol("_CSETF-JCL-SESSION");

    static private final SubLString $str_alt110$__JCL__ = makeString("#<JCL: ");

    static private final SubLString $str_alt111$self_modules___a____a = makeString("self.modules['~a'].~a");

    static private final SubLString $str_alt112$self_modules___a____a____a = makeString("self.modules['~a'].~a = ~a");

    static private final SubLList $list_alt113 = list(makeSymbol("JCL"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLString $str_alt114$object___self_modules___a___a__ob = makeString("object = self.modules['~a']~a~%object");

    static private final SubLList $list_alt115 = list(makeSymbol("JCL"), makeSymbol("METHOD"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLString $str_alt116$self_modules___a____a_a = makeString("self.modules['~a'].~a~a");

    static private final SubLList $list_alt117 = list(list(makeSymbol("JCL"), makeSymbol("CLASS"), makeSymbol("&OPTIONAL"), list(makeSymbol("HOST"), makeSymbol("*JSESSION-HOST*")), list(makeSymbol("PORT"), makeSymbol("*JSESSION-PORT*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym118$JS = makeUninternedSymbol("JS");

    private static final SubLSymbol WITH_JSESSION = makeSymbol("WITH-JSESSION");

    private static final SubLSymbol JSESSION_IMPORT = makeSymbol("JSESSION-IMPORT");

    private static final SubLSymbol JIN = makeSymbol("JIN");

    private static final SubLSymbol JIN_P = makeSymbol("JIN-P");

    static private final SubLList $list_alt123 = list(makeSymbol("SESSION"), makeSymbol("CLASS"), makeSymbol("ID"));

    static private final SubLList $list_alt124 = list(makeKeyword("SESSION"), makeKeyword("CLASS"), makeKeyword("ID"));

    static private final SubLList $list_alt125 = list(makeSymbol("JIN-SESSION"), makeSymbol("JIN-CLASS"), makeSymbol("JIN-ID"));

    static private final SubLList $list_alt126 = list(makeSymbol("_CSETF-JIN-SESSION"), makeSymbol("_CSETF-JIN-CLASS"), makeSymbol("_CSETF-JIN-ID"));

    private static final SubLSymbol JIN_PRINT = makeSymbol("JIN-PRINT");

    private static final SubLSymbol JIN_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("JIN-PRINT-FUNCTION-TRAMPOLINE");

    public static final SubLSymbol _CSETF_JIN_SESSION = makeSymbol("_CSETF-JIN-SESSION");

    private static final SubLSymbol JIN_CLASS = makeSymbol("JIN-CLASS");

    public static final SubLSymbol _CSETF_JIN_CLASS = makeSymbol("_CSETF-JIN-CLASS");

    public static final SubLSymbol _CSETF_JIN_ID = makeSymbol("_CSETF-JIN-ID");





    static private final SubLString $str_alt135$__JIN__ = makeString("#<JIN: ");

    static private final SubLString $str_alt136$self_objects__a___a = makeString("self.objects[~a].~a");

    static private final SubLString $str_alt137$self_objects__a___a____a = makeString("self.objects[~a].~a = ~a");

    static private final SubLString $str_alt138$del_self_objects__a_ = makeString("del self.objects[~a]");

    static private final SubLList $list_alt139 = list(makeSymbol("JIN"), makeSymbol("CLASS"));





    static private final SubLSymbol $sym142$STRING_ = makeSymbol("STRING=");

    static private final SubLString $str_alt143$_a_is_not_a__a = makeString("~a is not a ~a");

    static private final SubLList $list_alt144 = list(list(makeSymbol("JIN"), makeSymbol("CLASS"), makeSymbol("&OPTIONAL"), list(makeSymbol("HOST"), makeSymbol("*JSESSION-HOST*")), list(makeSymbol("PORT"), makeSymbol("*JSESSION-PORT*"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym145$JCL = makeUninternedSymbol("JCL");

    private static final SubLSymbol WITH_JCL = makeSymbol("WITH-JCL");

    private static final SubLSymbol JCL_NEW = makeSymbol("JCL-NEW");

    static private final SubLString $str_alt148$java_lang_Class = makeString("java.lang.Class");

    static private final SubLString $$$getFields = makeString("getFields");

    static private final SubLString $$$getConstructors = makeString("getConstructors");

    static private final SubLString $$$getMethods = makeString("getMethods");

    static private final SubLString $str_alt152$java_lang_reflect_Modifier = makeString("java.lang.reflect.Modifier");

    static private final SubLString $$$isStatic = makeString("isStatic");

    static private final SubLString $$$getModifiers = makeString("getModifiers");

    static private final SubLString $$$isFinal = makeString("isFinal");

    static private final SubLString $str_alt156$Unknown_response_code__a = makeString("Unknown response code ~a");

    static private final SubLString $str_alt157$__ = makeString("()");

    static private final SubLString $str_alt158$_ = makeString("(");

    static private final SubLString $str_alt159$__ = makeString(", ");

    static private final SubLString $str_alt160$_ = makeString(")");

    static private final SubLString $str_alt161$self_objects__a_ = makeString("self.objects[~a]");

    static private final SubLString $$$None = makeString("None");

    // // Initializers
    public void declareFunctions() {
        declare_jubl_file();
    }

    public void initializeVariables() {
        init_jubl_file();
    }

    public void runTopLevelForms() {
        setup_jubl_file();
    }
}

