package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.sksi.corba.corba_utilities.$corba_connection_native;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class corba_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new corba_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_utilities";

    public static final String myFingerPrint = "3d81c671f786875e838e21407459cf8ab4719f2ddef92d42d05d66e924e0630f";

    // deflexical
    private static final SubLSymbol $corba_predicates$ = makeSymbol("*CORBA-PREDICATES*");

    // deflexical
    private static final SubLSymbol $corba_removal_predicates$ = makeSymbol("*CORBA-REMOVAL-PREDICATES*");

    // deflexical
    private static final SubLSymbol $corba_storage_predicates$ = makeSymbol("*CORBA-STORAGE-PREDICATES*");

    // defconstant
    public static final SubLSymbol $dtp_corba_connection$ = makeSymbol("*DTP-CORBA-CONNECTION*");

    // defvar
    // The default connection timeout for for corba-connection-eval
    private static final SubLSymbol $corba_connection_open_connection_timeout$ = makeSymbol("*CORBA-CONNECTION-OPEN-CONNECTION-TIMEOUT*");

    // defvar
    // The default transaction timeout for for corba-connection-eval
    private static final SubLSymbol $corba_connection_transaction_timeout$ = makeSymbol("*CORBA-CONNECTION-TRANSACTION-TIMEOUT*");

    // deflexical
    private static final SubLSymbol $corba_connection_property_keywords$ = makeSymbol("*CORBA-CONNECTION-PROPERTY-KEYWORDS*");

    private static final SubLObject $$CORBAPredicate = reader_make_constant_shell(makeString("CORBAPredicate"));

    private static final SubLObject $$CORBARemovalPredicate = reader_make_constant_shell(makeString("CORBARemovalPredicate"));

    private static final SubLObject $$CORBAStoragePredicate = reader_make_constant_shell(makeString("CORBAStoragePredicate"));

    public static final SubLSymbol CORBA_CONNECTION_P = makeSymbol("CORBA-CONNECTION-P");

    private static final SubLObject $$TheCORBAInitialObject = reader_make_constant_shell(makeString("TheCORBAInitialObject"));

    private static final SubLObject $$CORBAObjectFn = reader_make_constant_shell(makeString("CORBAObjectFn"));





    public static final SubLSymbol CORBA_CONNECTION = makeSymbol("CORBA-CONNECTION");

    public static final SubLList $list9 = list(makeSymbol("STREAM"), makeSymbol("PROPERTIES"), makeSymbol("INITIAL-OBJECT-ID"), makeSymbol("HISTORY"), makeSymbol("ERROR-HANDLING"));

    public static final SubLList $list10 = list(makeKeyword("STREAM"), makeKeyword("PROPERTIES"), makeKeyword("INITIAL-OBJECT-ID"), makeKeyword("HISTORY"), makeKeyword("ERROR-HANDLING"));

    public static final SubLList $list11 = list(makeSymbol("CORBA-CONNECTION-INT-STREAM"), makeSymbol("CORBA-CONNECTION-INT-PROPERTIES"), makeSymbol("CORBA-CONNECTION-INT-INITIAL-OBJECT-ID"), makeSymbol("CORBA-CONNECTION-INT-HISTORY"), makeSymbol("CORBA-CONNECTION-INT-ERROR-HANDLING"));

    public static final SubLList $list12 = list(makeSymbol("_CSETF-CORBA-CONNECTION-INT-STREAM"), makeSymbol("_CSETF-CORBA-CONNECTION-INT-PROPERTIES"), makeSymbol("_CSETF-CORBA-CONNECTION-INT-INITIAL-OBJECT-ID"), makeSymbol("_CSETF-CORBA-CONNECTION-INT-HISTORY"), makeSymbol("_CSETF-CORBA-CONNECTION-INT-ERROR-HANDLING"));

    public static final SubLSymbol CORBA_CONNECTION_INT_PRINT = makeSymbol("CORBA-CONNECTION-INT-PRINT");

    public static final SubLSymbol CORBA_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CORBA-CONNECTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list15 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("CORBA-CONNECTION-P"));

    private static final SubLSymbol CORBA_CONNECTION_INT_STREAM = makeSymbol("CORBA-CONNECTION-INT-STREAM");

    private static final SubLSymbol _CSETF_CORBA_CONNECTION_INT_STREAM = makeSymbol("_CSETF-CORBA-CONNECTION-INT-STREAM");

    private static final SubLSymbol CORBA_CONNECTION_INT_PROPERTIES = makeSymbol("CORBA-CONNECTION-INT-PROPERTIES");

    private static final SubLSymbol _CSETF_CORBA_CONNECTION_INT_PROPERTIES = makeSymbol("_CSETF-CORBA-CONNECTION-INT-PROPERTIES");

    private static final SubLSymbol CORBA_CONNECTION_INT_INITIAL_OBJECT_ID = makeSymbol("CORBA-CONNECTION-INT-INITIAL-OBJECT-ID");

    private static final SubLSymbol _CSETF_CORBA_CONNECTION_INT_INITIAL_OBJECT_ID = makeSymbol("_CSETF-CORBA-CONNECTION-INT-INITIAL-OBJECT-ID");

    private static final SubLSymbol CORBA_CONNECTION_INT_HISTORY = makeSymbol("CORBA-CONNECTION-INT-HISTORY");

    private static final SubLSymbol _CSETF_CORBA_CONNECTION_INT_HISTORY = makeSymbol("_CSETF-CORBA-CONNECTION-INT-HISTORY");

    private static final SubLSymbol CORBA_CONNECTION_INT_ERROR_HANDLING = makeSymbol("CORBA-CONNECTION-INT-ERROR-HANDLING");

    private static final SubLSymbol _CSETF_CORBA_CONNECTION_INT_ERROR_HANDLING = makeSymbol("_CSETF-CORBA-CONNECTION-INT-ERROR-HANDLING");





    private static final SubLSymbol $INITIAL_OBJECT_ID = makeKeyword("INITIAL-OBJECT-ID");





    private static final SubLString $str31$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_CORBA_CONNECTION = makeSymbol("MAKE-CORBA-CONNECTION");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_CORBA_CONNECTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-CORBA-CONNECTION-METHOD");

    private static final SubLString $str37$__CORBA_CONNECTION_ = makeString("#<CORBA-CONNECTION ");

    private static final SubLString $$$_streamless = makeString(" streamless");

    private static final SubLString $$$_open = makeString(" open");

    private static final SubLString $$$_closed = makeString(" closed");

    private static final SubLString $str41$_ = makeString(">");

    private static final SubLInteger $int$900 = makeInteger(900);





    private static final SubLString $$$corba_connection_timeout = makeString("corba connection timeout");

    private static final SubLString $$$corba_transaction_timeout = makeString("corba transaction timeout");

    private static final SubLString $str47$_A = makeString("~A");

    private static final SubLString $$$corba_server_not_found = makeString("corba server not found");

    private static final SubLList $list49 = list(makeKeyword("PROXY-HOST"), makeKeyword("PROXY-PORT"), makeKeyword("INITIAL-ORB-HOST"), makeKeyword("INITIAL-ORB-PORT"), makeKeyword("SERVICE-NAME"), makeKeyword("INITIAL-OBJECT-FACTORY-HELPER"), makeKeyword("INITIAL-OBJECT-CLASS"), makeKeyword("INVALID"));









    private static final SubLString $str54$CORBA_connection_being_reopened_ = makeString("CORBA connection being reopened.");







    private static final SubLSymbol CORBA_CONNECTION_OPEN_P = makeSymbol("CORBA-CONNECTION-OPEN-P");



    private static final SubLString $str60$corba_result_error___A = makeString("corba result error: ~A");

    private static final SubLString $str61$attempt_to_use_corba_connection_p = makeString("attempt to use corba-connection-p again awhile open (possibly because of multithreading).  cloning connection.");

    private static final SubLString $$$connection_timeout = makeString("connection timeout");

    private static final SubLString $$$transaction_timeout = makeString("transaction timeout");

    private static final SubLString $str64$corba_eval_send_error___A = makeString("corba-eval send error: ~A");

    private static final SubLString $str65$corba_eval_receive_error___A = makeString("corba-eval receive error: ~A");









    private static final SubLString $str70$CORBA_server_has_been_restarted__ = makeString("CORBA server has been restarted.  Existing codeMapping assertions for this knowledge source are now stale, should be removed, and the relevant forward rules repropagated.");



    private static final SubLString $$$continue = makeString("continue");

    public static SubLObject get_corba_predicates() {
        if (NIL == $corba_predicates$.getGlobalValue()) {
            $corba_predicates$.setGlobalValue(isa.all_fort_instances_in_all_mts($$CORBAPredicate));
        }
        return $corba_predicates$.getGlobalValue();
    }

    public static SubLObject corba_predicate_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_corba_predicates(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_corba_removal_predicates() {
        if (NIL == $corba_removal_predicates$.getGlobalValue()) {
            $corba_removal_predicates$.setGlobalValue(isa.all_fort_instances_in_all_mts($$CORBARemovalPredicate));
        }
        return $corba_removal_predicates$.getGlobalValue();
    }

    public static SubLObject corba_removal_predicate_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_corba_removal_predicates(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_corba_storage_predicates() {
        if (NIL == $corba_storage_predicates$.getGlobalValue()) {
            $corba_storage_predicates$.setGlobalValue(isa.all_fort_instances_in_all_mts($$CORBAStoragePredicate));
        }
        return $corba_storage_predicates$.getGlobalValue();
    }

    public static SubLObject corba_storage_predicate_p(final SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_corba_storage_predicates(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_corba_caches() {
        $corba_predicates$.setGlobalValue(NIL);
        $corba_removal_predicates$.setGlobalValue(NIL);
        $corba_storage_predicates$.setGlobalValue(NIL);
        corba_module_utilities.$corba_connections_by_sks$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject corba_object_id_from_object(final SubLObject v_object, final SubLObject corba_connection) {
        if (((NIL != corba_connection) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == corba_connection_p(corba_connection))) {
            throw new AssertionError(corba_connection);
        }
        if (v_object.eql($$TheCORBAInitialObject)) {
            return corba_connection_get_initial_object_id(corba_connection);
        }
        if (v_object.isList() && $$CORBAObjectFn.equal(v_object.first())) {
            return second(v_object);
        }
        return v_object;
    }

    public static SubLObject corba_object_from_object_id(final SubLObject object_id, final SubLObject corba_connection) {
        if (((NIL != corba_connection) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == corba_connection_p(corba_connection))) {
            throw new AssertionError(corba_connection);
        }
        final SubLObject initial_object_id = corba_connection_get_initial_object_id(corba_connection);
        if (object_id.equal(initial_object_id)) {
            return $$TheCORBAInitialObject;
        }
        return list($$CORBAObjectFn, object_id);
    }

    public static SubLObject corba_object_id_ify_list(final SubLObject el_list, final SubLObject corba_connection) {
        assert NIL != el_list_p(el_list) : "el_utilities.el_list_p(el_list) " + "CommonSymbols.NIL != el_utilities.el_list_p(el_list) " + el_list;
        if (NIL != el_empty_list_p(el_list)) {
            return NIL;
        }
        final SubLObject list = el_list_items(el_list);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = list;
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(corba_object_id_from_object(item, corba_connection), result);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject corba_encode_object(final SubLObject v_object, final SubLObject corba_connection) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        if (NIL != el_list_p(v_object)) {
            return corba_object_id_ify_list(v_object, corba_connection);
        }
        return corba_object_id_from_object(v_object, corba_connection);
    }

    public static SubLObject corba_encode_list(final SubLObject list, final SubLObject corba_connection) {
        assert NIL != listp(list) : "Types.listp(list) " + "CommonSymbols.NIL != Types.listp(list) " + list;
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        SubLObject result = NIL;
        SubLObject cdolist_list_var = list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(corba_encode_object(elem, corba_connection), result);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return nreverse(result);
    }

    public static SubLObject corba_connection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        corba_connection_int_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject corba_connection_p(final SubLObject v_object) {
        return v_object.getClass() == $corba_connection_native.class ? T : NIL;
    }

    public static SubLObject corba_connection_int_stream(final SubLObject v_object) {
        assert NIL != corba_connection_p(v_object) : "corba_utilities.corba_connection_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject corba_connection_int_properties(final SubLObject v_object) {
        assert NIL != corba_connection_p(v_object) : "corba_utilities.corba_connection_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject corba_connection_int_initial_object_id(final SubLObject v_object) {
        assert NIL != corba_connection_p(v_object) : "corba_utilities.corba_connection_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject corba_connection_int_history(final SubLObject v_object) {
        assert NIL != corba_connection_p(v_object) : "corba_utilities.corba_connection_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject corba_connection_int_error_handling(final SubLObject v_object) {
        assert NIL != corba_connection_p(v_object) : "corba_utilities.corba_connection_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_corba_connection_int_stream(final SubLObject v_object, final SubLObject value) {
        assert NIL != corba_connection_p(v_object) : "corba_utilities.corba_connection_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_corba_connection_int_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != corba_connection_p(v_object) : "corba_utilities.corba_connection_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_corba_connection_int_initial_object_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != corba_connection_p(v_object) : "corba_utilities.corba_connection_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_corba_connection_int_history(final SubLObject v_object, final SubLObject value) {
        assert NIL != corba_connection_p(v_object) : "corba_utilities.corba_connection_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_corba_connection_int_error_handling(final SubLObject v_object, final SubLObject value) {
        assert NIL != corba_connection_p(v_object) : "corba_utilities.corba_connection_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_corba_connection(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $corba_connection_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($STREAM)) {
                _csetf_corba_connection_int_stream(v_new, current_value);
            } else
                if (pcase_var.eql($PROPERTIES)) {
                    _csetf_corba_connection_int_properties(v_new, current_value);
                } else
                    if (pcase_var.eql($INITIAL_OBJECT_ID)) {
                        _csetf_corba_connection_int_initial_object_id(v_new, current_value);
                    } else
                        if (pcase_var.eql($HISTORY)) {
                            _csetf_corba_connection_int_history(v_new, current_value);
                        } else
                            if (pcase_var.eql($ERROR_HANDLING)) {
                                _csetf_corba_connection_int_error_handling(v_new, current_value);
                            } else {
                                Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_corba_connection(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_CORBA_CONNECTION, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $STREAM, corba_connection_int_stream(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, corba_connection_int_properties(obj));
        funcall(visitor_fn, obj, $SLOT, $INITIAL_OBJECT_ID, corba_connection_int_initial_object_id(obj));
        funcall(visitor_fn, obj, $SLOT, $HISTORY, corba_connection_int_history(obj));
        funcall(visitor_fn, obj, $SLOT, $ERROR_HANDLING, corba_connection_int_error_handling(obj));
        funcall(visitor_fn, obj, $END, MAKE_CORBA_CONNECTION, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_corba_connection_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_corba_connection(obj, visitor_fn);
    }

    public static SubLObject corba_connection_int_print(final SubLObject corba_connection, final SubLObject stream, final SubLObject depth) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        write_string($str37$__CORBA_CONNECTION_, stream, UNPROVIDED, UNPROVIDED);
        prin1(corba_connection_int_initial_object_id(corba_connection), stream);
        if (!corba_connection_int_stream(corba_connection).isStream()) {
            write_string($$$_streamless, stream, UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != open_stream_p(corba_connection_int_stream(corba_connection))) {
                write_string($$$_open, stream, UNPROVIDED, UNPROVIDED);
            } else {
                write_string($$$_closed, stream, UNPROVIDED, UNPROVIDED);
            }

        write_string($str41$_, stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject new_corba_connection(final SubLObject corba_connection_properties) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject corba_connection = make_corba_connection(list($PROPERTIES, corba_connection_properties));
        SubLObject connection_timed_outP = T;
        SubLObject transaction_timed_outP = T;
        SubLObject corba_result = NIL;
        SubLObject transaction_timed_out = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$1 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer($corba_connection_transaction_timeout$.getDynamicValue(thread), tag);
                        try {
                            if (NIL != corba_connection_open(corba_connection, $corba_connection_open_connection_timeout$.getDynamicValue(thread), $PRIVATE)) {
                                connection_timed_outP = NIL;
                                corba_result = corba_connection_eval_encoded_int(corba_connection, list($NEW_CONNECTION, corba_connection_properties));
                                transaction_timed_outP = NIL;
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != corba_connection_open_p(corba_connection)) {
                                    corba_connection_close(corba_connection);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                            }
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$1, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            transaction_timed_out = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != connection_timed_outP) {
            return Errors.error($$$corba_connection_timeout);
        }
        if (NIL != transaction_timed_outP) {
            return Errors.error($$$corba_transaction_timeout);
        }
        if (NIL != corba_connection_eval_errorP(corba_result)) {
            return Errors.error($str47$_A, corba_connection_eval_error_get_string(corba_result));
        }
        if (!corba_result.isInteger()) {
            return Errors.error($$$corba_server_not_found);
        }
        corba_connection_set_initial_object_id(corba_connection, corba_result);
        return corba_connection;
    }

    public static SubLObject corba_connection_set_stream(final SubLObject corba_connection, final SubLObject stream) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        if (((NIL != stream) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == streamp(stream))) {
            throw new AssertionError(stream);
        }
        _csetf_corba_connection_int_stream(corba_connection, stream);
        return stream;
    }

    public static SubLObject corba_connection_get_stream(final SubLObject corba_connection) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        return corba_connection_int_stream(corba_connection);
    }

    public static SubLObject corba_connection_set_initial_object_id(final SubLObject corba_connection, final SubLObject initial_object_id) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        _csetf_corba_connection_int_initial_object_id(corba_connection, initial_object_id);
        return initial_object_id;
    }

    public static SubLObject corba_connection_get_initial_object_id(final SubLObject corba_connection) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        return corba_connection_int_initial_object_id(corba_connection);
    }

    public static SubLObject corba_connection_get_properties(final SubLObject corba_connection) {
        return corba_connection_int_properties(corba_connection);
    }

    public static SubLObject corba_connection_set_property(final SubLObject corba_connection, final SubLObject property, final SubLObject value) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        assert NIL != keywordp(property) : "Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) " + property;
        return putf(corba_connection_int_properties(corba_connection), property, value);
    }

    public static SubLObject corba_connection_get_property(final SubLObject corba_connection, final SubLObject property) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        assert NIL != keywordp(property) : "Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) " + property;
        return getf(corba_connection_int_properties(corba_connection), property, UNPROVIDED);
    }

    public static SubLObject corba_connection_rem_property(final SubLObject corba_connection, final SubLObject property) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        assert NIL != keywordp(property) : "Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) " + property;
        return remf(corba_connection_int_properties(corba_connection), property);
    }

    public static SubLObject corba_connection_set_invalid(final SubLObject corba_connection, final SubLObject invalidP) {
        return corba_connection_set_property(corba_connection, $INVALID, invalidP);
    }

    public static SubLObject corba_connection_invalidP(final SubLObject corba_connection) {
        return corba_connection_get_property(corba_connection, $INVALID);
    }

    public static SubLObject corba_connection_open(final SubLObject corba_connection, SubLObject connection_timeout, SubLObject access_mode) {
        if (connection_timeout == UNPROVIDED) {
            connection_timeout = NIL;
        }
        if (access_mode == UNPROVIDED) {
            access_mode = $PUBLIC;
        }
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        if (NIL != corba_connection_open_p(corba_connection)) {
            Errors.warn($str54$CORBA_connection_being_reopened_);
        }
        final SubLObject proxy_host = corba_connection_get_property(corba_connection, $PROXY_HOST);
        final SubLObject proxy_port = corba_connection_get_property(corba_connection, $PROXY_PORT);
        final SubLObject stream = subl_promotions.open_tcp_stream_with_timeout(proxy_host, proxy_port, connection_timeout, access_mode);
        if (NIL == stream) {
            return NIL;
        }
        corba_connection_set_stream(corba_connection, stream);
        return stream;
    }

    public static SubLObject corba_connection_close(final SubLObject corba_connection) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        if (NIL == corba_connection_open_p(corba_connection)) {
            return NIL;
        }
        final SubLObject corba_form = list($CLOSE_CONNECTION);
        SubLObject send_response = NIL;
        send_response = corba_connection_send(corba_connection, corba_form);
        final SubLObject stream = corba_connection_get_stream(corba_connection);
        close(stream, UNPROVIDED);
        return send_response;
    }

    public static SubLObject corba_connection_shutdown(final SubLObject corba_connection) {
        assert NIL != corba_connection_open_p(corba_connection) : "corba_utilities.corba_connection_open_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_open_p(corba_connection) " + corba_connection;
        final SubLObject initial_object_id = corba_connection_get_initial_object_id(corba_connection);
        if (NIL != initial_object_id) {
            final SubLObject corba_form = list($SHUTDOWN_CONNECTION, initial_object_id);
            SubLObject send_response = NIL;
            send_response = corba_connection_send(corba_connection, corba_form);
            final SubLObject stream = corba_connection_get_stream(corba_connection);
            close(stream, UNPROVIDED);
            return send_response;
        }
        return NIL;
    }

    public static SubLObject corba_connection_open_p(final SubLObject corba_connection) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        final SubLObject stream = corba_connection_get_stream(corba_connection);
        return makeBoolean(stream.isStream() && (NIL != open_stream_p(stream)));
    }

    public static SubLObject corba_connection_eval(final SubLObject corba_connection, final SubLObject corba_predicate, final SubLObject args) {
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        assert NIL != listp(args) : "Types.listp(args) " + "CommonSymbols.NIL != Types.listp(args) " + args;
        final SubLObject corba_fn = corba_module_utilities.make_corba_gateway_keyword(corba_predicate);
        final SubLObject encoded_args = corba_encode_list(args, corba_connection);
        SubLObject result = corba_connection_eval_encoded(corba_connection, cons(corba_fn, encoded_args));
        if (NIL != corba_connection_eval_errorP(result)) {
            Errors.error($str60$corba_result_error___A, result);
        }
        if (NIL != corba_module_utilities.corba_predicate_returns_objectP(corba_predicate)) {
            result = corba_object_from_object_id(result, corba_connection);
        }
        return result;
    }

    public static SubLObject corba_connection_eval_encoded(final SubLObject corba_connection, final SubLObject encoded_corba_form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != corba_connection_p(corba_connection) : "corba_utilities.corba_connection_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_p(corba_connection) " + corba_connection;
        if (NIL != corba_connection_open_p(corba_connection)) {
            Errors.warn($str61$attempt_to_use_corba_connection_p);
            return corba_connection_eval_encoded(corba_connection_clone(corba_connection), encoded_corba_form);
        }
        SubLObject connection_timed_outP = T;
        SubLObject transaction_timed_outP = T;
        SubLObject result = NIL;
        SubLObject transaction_timed_out = NIL;
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$4 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer($corba_connection_transaction_timeout$.getDynamicValue(thread), tag);
                        try {
                            if (NIL != corba_connection_open(corba_connection, $corba_connection_open_connection_timeout$.getDynamicValue(thread), $PUBLIC)) {
                                connection_timed_outP = NIL;
                                corba_connection_verify(corba_connection);
                                result = corba_connection_eval_encoded_int(corba_connection, encoded_corba_form);
                                transaction_timed_outP = NIL;
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != corba_connection_open_p(corba_connection)) {
                                    corba_connection_close(corba_connection);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                            }
                        }
                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$4, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            transaction_timed_out = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != connection_timed_outP) {
            result = new_corba_connection_eval_error($$$connection_timeout);
        }
        if (NIL != transaction_timed_outP) {
            result = new_corba_connection_eval_error($$$transaction_timeout);
        }
        return result;
    }

    public static SubLObject corba_connection_eval_encoded_int(final SubLObject corba_connection, final SubLObject encoded_corba_form) {
        SubLObject send_response = NIL;
        SubLObject receive_response = NIL;
        send_response = corba_connection_send(corba_connection, encoded_corba_form);
        if (NIL != corba_connection_eval_errorP(send_response)) {
            Errors.error($str64$corba_eval_send_error___A, send_response);
        }
        receive_response = corba_connection_receive(corba_connection);
        if (NIL != corba_connection_eval_errorP(receive_response)) {
            Errors.error($str65$corba_eval_receive_error___A, receive_response);
        }
        return receive_response;
    }

    public static SubLObject new_corba_connection_eval_error(final SubLObject error_string) {
        assert NIL != stringp(error_string) : "Types.stringp(error_string) " + "CommonSymbols.NIL != Types.stringp(error_string) " + error_string;
        return list($ERROR, error_string);
    }

    public static SubLObject corba_connection_eval_errorP(final SubLObject corba_connection_eval_result) {
        if (corba_connection_eval_result.isList() && (corba_connection_eval_result.first() == $ERROR)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject corba_connection_eval_error_get_string(final SubLObject corba_connection_eval_error) {
        if (NIL != corba_connection_eval_errorP(corba_connection_eval_error)) {
            return second(corba_connection_eval_error);
        }
        return NIL;
    }

    public static SubLObject corba_connection_verify(final SubLObject corba_connection) {
        assert NIL != corba_connection_open_p(corba_connection) : "corba_utilities.corba_connection_open_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_open_p(corba_connection) " + corba_connection;
        if (NIL == corba_connection_get_initial_object_id(corba_connection)) {
            return NIL;
        }
        final SubLObject result = corba_connection_eval_encoded_int(corba_connection, list($VERIFY_CONNECTION, corba_connection_get_initial_object_id(corba_connection)));
        if (result == $NULL) {
            corba_connection_set_invalid(corba_connection, T);
            Errors.warn($str70$CORBA_server_has_been_restarted__);
            clear_corba_caches();
            corba_connection_set_initial_object_id(corba_connection, NIL);
            return NIL;
        }
        return result;
    }

    public static SubLObject corba_connection_clone(final SubLObject corba_connection) {
        return new_corba_connection(corba_connection_get_properties(corba_connection));
    }

    public static SubLObject corba_connection_send(final SubLObject corba_connection, final SubLObject form) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != corba_connection_open_p(corba_connection) : "corba_utilities.corba_connection_open_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_open_p(corba_connection) " + corba_connection;
        SubLObject error_message = NIL;
        final SubLObject response = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    cfasl_output(form, corba_connection_get_stream(corba_connection));
                    force_output(corba_connection_get_stream(corba_connection));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            Errors.cerror($$$continue, error_message);
        }
        return response;
    }

    public static SubLObject corba_connection_receive(final SubLObject corba_connection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != corba_connection_open_p(corba_connection) : "corba_utilities.corba_connection_open_p(corba_connection) " + "CommonSymbols.NIL != corba_utilities.corba_connection_open_p(corba_connection) " + corba_connection;
        SubLObject error_message = NIL;
        SubLObject response = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    response = cfasl_input(corba_connection_get_stream(corba_connection), UNPROVIDED, UNPROVIDED);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            Errors.cerror($$$continue, error_message);
        }
        return response;
    }

    public static SubLObject declare_corba_utilities_file() {
        declareFunction(me, "get_corba_predicates", "GET-CORBA-PREDICATES", 0, 0, false);
        declareFunction(me, "corba_predicate_p", "CORBA-PREDICATE-P", 1, 0, false);
        declareFunction(me, "get_corba_removal_predicates", "GET-CORBA-REMOVAL-PREDICATES", 0, 0, false);
        declareFunction(me, "corba_removal_predicate_p", "CORBA-REMOVAL-PREDICATE-P", 1, 0, false);
        declareFunction(me, "get_corba_storage_predicates", "GET-CORBA-STORAGE-PREDICATES", 0, 0, false);
        declareFunction(me, "corba_storage_predicate_p", "CORBA-STORAGE-PREDICATE-P", 1, 0, false);
        declareFunction(me, "clear_corba_caches", "CLEAR-CORBA-CACHES", 0, 0, false);
        declareFunction(me, "corba_object_id_from_object", "CORBA-OBJECT-ID-FROM-OBJECT", 2, 0, false);
        declareFunction(me, "corba_object_from_object_id", "CORBA-OBJECT-FROM-OBJECT-ID", 2, 0, false);
        declareFunction(me, "corba_object_id_ify_list", "CORBA-OBJECT-ID-IFY-LIST", 2, 0, false);
        declareFunction(me, "corba_encode_object", "CORBA-ENCODE-OBJECT", 2, 0, false);
        declareFunction(me, "corba_encode_list", "CORBA-ENCODE-LIST", 2, 0, false);
        declareFunction(me, "corba_connection_print_function_trampoline", "CORBA-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "corba_connection_p", "CORBA-CONNECTION-P", 1, 0, false);
        new corba_utilities.$corba_connection_p$UnaryFunction();
        declareFunction(me, "corba_connection_int_stream", "CORBA-CONNECTION-INT-STREAM", 1, 0, false);
        declareFunction(me, "corba_connection_int_properties", "CORBA-CONNECTION-INT-PROPERTIES", 1, 0, false);
        declareFunction(me, "corba_connection_int_initial_object_id", "CORBA-CONNECTION-INT-INITIAL-OBJECT-ID", 1, 0, false);
        declareFunction(me, "corba_connection_int_history", "CORBA-CONNECTION-INT-HISTORY", 1, 0, false);
        declareFunction(me, "corba_connection_int_error_handling", "CORBA-CONNECTION-INT-ERROR-HANDLING", 1, 0, false);
        declareFunction(me, "_csetf_corba_connection_int_stream", "_CSETF-CORBA-CONNECTION-INT-STREAM", 2, 0, false);
        declareFunction(me, "_csetf_corba_connection_int_properties", "_CSETF-CORBA-CONNECTION-INT-PROPERTIES", 2, 0, false);
        declareFunction(me, "_csetf_corba_connection_int_initial_object_id", "_CSETF-CORBA-CONNECTION-INT-INITIAL-OBJECT-ID", 2, 0, false);
        declareFunction(me, "_csetf_corba_connection_int_history", "_CSETF-CORBA-CONNECTION-INT-HISTORY", 2, 0, false);
        declareFunction(me, "_csetf_corba_connection_int_error_handling", "_CSETF-CORBA-CONNECTION-INT-ERROR-HANDLING", 2, 0, false);
        declareFunction(me, "make_corba_connection", "MAKE-CORBA-CONNECTION", 0, 1, false);
        declareFunction(me, "visit_defstruct_corba_connection", "VISIT-DEFSTRUCT-CORBA-CONNECTION", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_corba_connection_method", "VISIT-DEFSTRUCT-OBJECT-CORBA-CONNECTION-METHOD", 2, 0, false);
        declareFunction(me, "corba_connection_int_print", "CORBA-CONNECTION-INT-PRINT", 3, 0, false);
        declareFunction(me, "new_corba_connection", "NEW-CORBA-CONNECTION", 1, 0, false);
        declareFunction(me, "corba_connection_set_stream", "CORBA-CONNECTION-SET-STREAM", 2, 0, false);
        declareFunction(me, "corba_connection_get_stream", "CORBA-CONNECTION-GET-STREAM", 1, 0, false);
        declareFunction(me, "corba_connection_set_initial_object_id", "CORBA-CONNECTION-SET-INITIAL-OBJECT-ID", 2, 0, false);
        declareFunction(me, "corba_connection_get_initial_object_id", "CORBA-CONNECTION-GET-INITIAL-OBJECT-ID", 1, 0, false);
        declareFunction(me, "corba_connection_get_properties", "CORBA-CONNECTION-GET-PROPERTIES", 1, 0, false);
        declareFunction(me, "corba_connection_set_property", "CORBA-CONNECTION-SET-PROPERTY", 3, 0, false);
        declareFunction(me, "corba_connection_get_property", "CORBA-CONNECTION-GET-PROPERTY", 2, 0, false);
        declareFunction(me, "corba_connection_rem_property", "CORBA-CONNECTION-REM-PROPERTY", 2, 0, false);
        declareFunction(me, "corba_connection_set_invalid", "CORBA-CONNECTION-SET-INVALID", 2, 0, false);
        declareFunction(me, "corba_connection_invalidP", "CORBA-CONNECTION-INVALID?", 1, 0, false);
        declareFunction(me, "corba_connection_open", "CORBA-CONNECTION-OPEN", 1, 2, false);
        declareFunction(me, "corba_connection_close", "CORBA-CONNECTION-CLOSE", 1, 0, false);
        declareFunction(me, "corba_connection_shutdown", "CORBA-CONNECTION-SHUTDOWN", 1, 0, false);
        declareFunction(me, "corba_connection_open_p", "CORBA-CONNECTION-OPEN-P", 1, 0, false);
        declareFunction(me, "corba_connection_eval", "CORBA-CONNECTION-EVAL", 3, 0, false);
        declareFunction(me, "corba_connection_eval_encoded", "CORBA-CONNECTION-EVAL-ENCODED", 2, 0, false);
        declareFunction(me, "corba_connection_eval_encoded_int", "CORBA-CONNECTION-EVAL-ENCODED-INT", 2, 0, false);
        declareFunction(me, "new_corba_connection_eval_error", "NEW-CORBA-CONNECTION-EVAL-ERROR", 1, 0, false);
        declareFunction(me, "corba_connection_eval_errorP", "CORBA-CONNECTION-EVAL-ERROR?", 1, 0, false);
        declareFunction(me, "corba_connection_eval_error_get_string", "CORBA-CONNECTION-EVAL-ERROR-GET-STRING", 1, 0, false);
        declareFunction(me, "corba_connection_verify", "CORBA-CONNECTION-VERIFY", 1, 0, false);
        declareFunction(me, "corba_connection_clone", "CORBA-CONNECTION-CLONE", 1, 0, false);
        declareFunction(me, "corba_connection_send", "CORBA-CONNECTION-SEND", 2, 0, false);
        declareFunction(me, "corba_connection_receive", "CORBA-CONNECTION-RECEIVE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_corba_utilities_file() {
        deflexical("*CORBA-PREDICATES*", NIL);
        deflexical("*CORBA-REMOVAL-PREDICATES*", NIL);
        deflexical("*CORBA-STORAGE-PREDICATES*", NIL);
        defconstant("*DTP-CORBA-CONNECTION*", CORBA_CONNECTION);
        defvar("*CORBA-CONNECTION-OPEN-CONNECTION-TIMEOUT*", TEN_INTEGER);
        defvar("*CORBA-CONNECTION-TRANSACTION-TIMEOUT*", $int$900);
        deflexical("*CORBA-CONNECTION-PROPERTY-KEYWORDS*", $list49);
        return NIL;
    }

    public static SubLObject setup_corba_utilities_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_corba_connection$.getGlobalValue(), symbol_function(CORBA_CONNECTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list15);
        def_csetf(CORBA_CONNECTION_INT_STREAM, _CSETF_CORBA_CONNECTION_INT_STREAM);
        def_csetf(CORBA_CONNECTION_INT_PROPERTIES, _CSETF_CORBA_CONNECTION_INT_PROPERTIES);
        def_csetf(CORBA_CONNECTION_INT_INITIAL_OBJECT_ID, _CSETF_CORBA_CONNECTION_INT_INITIAL_OBJECT_ID);
        def_csetf(CORBA_CONNECTION_INT_HISTORY, _CSETF_CORBA_CONNECTION_INT_HISTORY);
        def_csetf(CORBA_CONNECTION_INT_ERROR_HANDLING, _CSETF_CORBA_CONNECTION_INT_ERROR_HANDLING);
        identity(CORBA_CONNECTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_corba_connection$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_CORBA_CONNECTION_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_corba_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_corba_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_corba_utilities_file();
    }

    static {

















































































    }

    public static final class $corba_connection_native extends SubLStructNative {
        public SubLObject $stream;

        public SubLObject $properties;

        public SubLObject $initial_object_id;

        public SubLObject $history;

        public SubLObject $error_handling;

        private static final SubLStructDeclNative structDecl;

        private $corba_connection_native() {
            this.$stream = Lisp.NIL;
            this.$properties = Lisp.NIL;
            this.$initial_object_id = Lisp.NIL;
            this.$history = Lisp.NIL;
            this.$error_handling = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$stream;
        }

        @Override
        public SubLObject getField3() {
            return this.$properties;
        }

        @Override
        public SubLObject getField4() {
            return this.$initial_object_id;
        }

        @Override
        public SubLObject getField5() {
            return this.$history;
        }

        @Override
        public SubLObject getField6() {
            return this.$error_handling;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$stream = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$properties = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$initial_object_id = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$history = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$error_handling = value;
        }

        static {
            structDecl = makeStructDeclNative($corba_connection_native.class, CORBA_CONNECTION, CORBA_CONNECTION_P, $list9, $list10, new String[]{ "$stream", "$properties", "$initial_object_id", "$history", "$error_handling" }, $list11, $list12, CORBA_CONNECTION_INT_PRINT);
        }
    }

    public static final class $corba_connection_p$UnaryFunction extends UnaryFunction {
        public $corba_connection_p$UnaryFunction() {
            super(extractFunctionNamed("CORBA-CONNECTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return corba_connection_p(arg1);
        }
    }
}

/**
 * Total time: 211 ms synthetic
 */
