/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.open_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CORBA-UTILITIES
 *  source file: /cyc/top/cycl/sksi/corba/corba-utilities.lisp
 *  created:     2019/07/03 17:37:52
 */
public final class corba_utilities extends SubLTranslatedFile implements V10 {
    // // Constructor
    private corba_utilities() {
    }

    public static final SubLFile me = new corba_utilities();


    // // Definitions
    // deflexical
    private static final SubLSymbol $corba_predicates$ = makeSymbol("*CORBA-PREDICATES*");

    public static final SubLObject get_corba_predicates() {
        if (NIL == $corba_predicates$.getGlobalValue()) {
            $corba_predicates$.setGlobalValue(isa.all_fort_instances_in_all_mts($$CORBAPredicate));
        }
        return $corba_predicates$.getGlobalValue();
    }

    public static final SubLObject corba_predicate_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_corba_predicates(), UNPROVIDED, UNPROVIDED);
    }

    // deflexical
    private static final SubLSymbol $corba_removal_predicates$ = makeSymbol("*CORBA-REMOVAL-PREDICATES*");

    public static final SubLObject get_corba_removal_predicates() {
        if (NIL == $corba_removal_predicates$.getGlobalValue()) {
            $corba_removal_predicates$.setGlobalValue(isa.all_fort_instances_in_all_mts($$CORBARemovalPredicate));
        }
        return $corba_removal_predicates$.getGlobalValue();
    }

    public static final SubLObject corba_removal_predicate_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_corba_removal_predicates(), UNPROVIDED, UNPROVIDED);
    }

    // deflexical
    private static final SubLSymbol $corba_storage_predicates$ = makeSymbol("*CORBA-STORAGE-PREDICATES*");

    public static final SubLObject get_corba_storage_predicates() {
        if (NIL == $corba_storage_predicates$.getGlobalValue()) {
            $corba_storage_predicates$.setGlobalValue(isa.all_fort_instances_in_all_mts($$CORBAStoragePredicate));
        }
        return $corba_storage_predicates$.getGlobalValue();
    }

    public static final SubLObject corba_storage_predicate_p(SubLObject v_object) {
        return subl_promotions.memberP(v_object, get_corba_storage_predicates(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject clear_corba_caches() {
        $corba_predicates$.setGlobalValue(NIL);
        $corba_removal_predicates$.setGlobalValue(NIL);
        $corba_storage_predicates$.setGlobalValue(NIL);
        corba_module_utilities.$corba_connections_by_sks$.setGlobalValue(NIL);
        return NIL;
    }

    public static final SubLObject corba_object_id_from_object(SubLObject v_object, SubLObject corba_connection) {
        if (NIL != corba_connection) {
            SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        }
        if (v_object == $$TheCORBAInitialObject) {
            return corba_connection_get_initial_object_id(corba_connection);
        } else
            if (v_object.isList() && $$CORBAObjectFn.equal(v_object.first())) {
                return second(v_object);
            } else {
                return v_object;
            }

    }

    public static final SubLObject corba_object_from_object_id(SubLObject object_id, SubLObject corba_connection) {
        if (NIL != corba_connection) {
            SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        }
        {
            SubLObject initial_object_id = corba_connection_get_initial_object_id(corba_connection);
            if (object_id.equal(initial_object_id)) {
                return $$TheCORBAInitialObject;
            } else {
                return list($$CORBAObjectFn, object_id);
            }
        }
    }

    public static final SubLObject corba_object_id_ify_list(SubLObject el_list, SubLObject corba_connection) {
        SubLTrampolineFile.checkType(el_list, EL_LIST_P);
        if (NIL != el_utilities.el_empty_list_p(el_list)) {
            return NIL;
        } else {
            {
                SubLObject list = el_utilities.el_list_items(el_list);
                SubLObject result = NIL;
                SubLObject cdolist_list_var = list;
                SubLObject item = NIL;
                for (item = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , item = cdolist_list_var.first()) {
                    result = cons(corba_object_id_from_object(item, corba_connection), result);
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLObject corba_encode_object(SubLObject v_object, SubLObject corba_connection) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        if (NIL != el_utilities.el_list_p(v_object)) {
            return corba_object_id_ify_list(v_object, corba_connection);
        } else {
            return corba_object_id_from_object(v_object, corba_connection);
        }
    }

    public static final SubLObject corba_encode_list(SubLObject list, SubLObject corba_connection) {
        SubLTrampolineFile.checkType(list, LISTP);
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        {
            SubLObject result = NIL;
            SubLObject cdolist_list_var = list;
            SubLObject elem = NIL;
            for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                result = cons(corba_encode_object(elem, corba_connection), result);
            }
            return nreverse(result);
        }
    }

    public static final class $corba_connection_native extends SubLStructNative {
        @Override
	public SubLStructDecl getStructDecl() {
            return corba_utilities.$corba_connection_native.structDecl;
        }

        @Override
	public SubLObject getField2() {
            return $stream;
        }

        @Override
	public SubLObject getField3() {
            return $properties;
        }

        @Override
	public SubLObject getField4() {
            return $initial_object_id;
        }

        @Override
	public SubLObject getField5() {
            return $history;
        }

        @Override
	public SubLObject getField6() {
            return $error_handling;
        }

        @Override
	public SubLObject setField2(SubLObject value) {
            return $stream = value;
        }

        @Override
	public SubLObject setField3(SubLObject value) {
            return $properties = value;
        }

        @Override
	public SubLObject setField4(SubLObject value) {
            return $initial_object_id = value;
        }

        @Override
	public SubLObject setField5(SubLObject value) {
            return $history = value;
        }

        @Override
	public SubLObject setField6(SubLObject value) {
            return $error_handling = value;
        }

        public SubLObject $stream = Lisp.NIL;

        public SubLObject $properties = Lisp.NIL;

        public SubLObject $initial_object_id = Lisp.NIL;

        public SubLObject $history = Lisp.NIL;

        public SubLObject $error_handling = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(corba_utilities.$corba_connection_native.class, CORBA_CONNECTION, CORBA_CONNECTION_P, $list_alt9, $list_alt10, new String[]{ "$stream", "$properties", "$initial_object_id", "$history", "$error_handling" }, $list_alt11, $list_alt12, CORBA_CONNECTION_INT_PRINT);
    }

    // defconstant
    public static final SubLSymbol $dtp_corba_connection$ = makeSymbol("*DTP-CORBA-CONNECTION*");

    public static final SubLObject corba_connection_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        corba_connection_int_print(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject corba_connection_p(SubLObject v_object) {
        return v_object.getClass() == corba_utilities.$corba_connection_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $corba_connection_p$UnaryFunction extends UnaryFunction {
        public $corba_connection_p$UnaryFunction() {
            super(extractFunctionNamed("CORBA-CONNECTION-P"));
        }

        @Override
	public SubLObject processItem(SubLObject arg1) {
            return corba_connection_p(arg1);
        }
    }

    public static final SubLObject corba_connection_int_stream(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CORBA_CONNECTION_P);
        return v_object.getField2();
    }

    public static final SubLObject corba_connection_int_properties(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CORBA_CONNECTION_P);
        return v_object.getField3();
    }

    public static final SubLObject corba_connection_int_initial_object_id(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CORBA_CONNECTION_P);
        return v_object.getField4();
    }

    public static final SubLObject corba_connection_int_history(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CORBA_CONNECTION_P);
        return v_object.getField5();
    }

    public static final SubLObject corba_connection_int_error_handling(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, CORBA_CONNECTION_P);
        return v_object.getField6();
    }

    public static final SubLObject _csetf_corba_connection_int_stream(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CORBA_CONNECTION_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_corba_connection_int_properties(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CORBA_CONNECTION_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_corba_connection_int_initial_object_id(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CORBA_CONNECTION_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_corba_connection_int_history(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CORBA_CONNECTION_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_corba_connection_int_error_handling(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, CORBA_CONNECTION_P);
        return v_object.setField6(value);
    }

    public static final SubLObject make_corba_connection(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new corba_utilities.$corba_connection_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
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
                                        Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
                                    }




                }
            }
            return v_new;
        }
    }

    /**
     * Pretty-print CORBA-CONNECTION to STREAM, ignoring DEPTH
     */
    public static final SubLObject corba_connection_int_print(SubLObject corba_connection, SubLObject stream, SubLObject depth) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        write_string($str_alt31$__CORBA_CONNECTION_, stream, UNPROVIDED, UNPROVIDED);
        prin1(corba_connection_int_initial_object_id(corba_connection), stream);
        if (!corba_connection_int_stream(corba_connection).isStream()) {
            write_string($str_alt32$_streamless, stream, UNPROVIDED, UNPROVIDED);
        } else
            if (NIL != open_stream_p(corba_connection_int_stream(corba_connection))) {
                write_string($str_alt33$_open, stream, UNPROVIDED, UNPROVIDED);
            } else {
                write_string($str_alt34$_closed, stream, UNPROVIDED, UNPROVIDED);
            }

        write_string($str_alt35$_, stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    /**
     * The default connection timeout for for corba-connection-eval
     */
    // defvar
    private static final SubLSymbol $corba_connection_open_connection_timeout$ = makeSymbol("*CORBA-CONNECTION-OPEN-CONNECTION-TIMEOUT*");

    /**
     * The default transaction timeout for for corba-connection-eval
     */
    // defvar
    private static final SubLSymbol $corba_connection_transaction_timeout$ = makeSymbol("*CORBA-CONNECTION-TRANSACTION-TIMEOUT*");

    /**
     * Connect to a CORBA server through a Cyc-aware proxy.
     *
     * @unknown a corba-connection-p but not corba-connection-open-p
     */
    public static final SubLObject new_corba_connection(SubLObject corba_connection_properties) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject corba_connection = make_corba_connection(list($PROPERTIES, corba_connection_properties));
                SubLObject connection_timed_outP = T;
                SubLObject transaction_timed_outP = T;
                SubLObject corba_result = NIL;
                SubLObject transaction_timed_out = NIL;
                SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                try {
                    {
                        SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                        try {
                            subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                            {
                                SubLObject timer = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0_1 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                        try {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                            timer = subl_macro_promotions.with_timeout_start_timer($corba_connection_transaction_timeout$.getDynamicValue(thread), tag);
                                            try {
                                                if (NIL != corba_connection_open(corba_connection, $corba_connection_open_connection_timeout$.getDynamicValue(thread), $PRIVATE)) {
                                                    connection_timed_outP = NIL;
                                                    corba_result = corba_connection_eval_encoded_int(corba_connection, list($NEW_CONNECTION, corba_connection_properties));
                                                    transaction_timed_outP = NIL;
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if (NIL != corba_connection_open_p(corba_connection)) {
                                                            corba_connection_close(corba_connection);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_1, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            subl_macro_promotions.with_timeout_stop_timer(timer);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_3, thread);
                                        }
                                    }
                                }
                            }
                        } finally {
                            subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    transaction_timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                }
                if (NIL != connection_timed_outP) {
                    return Errors.error($$$corba_connection_timeout);
                }
                if (NIL != transaction_timed_outP) {
                    return Errors.error($$$corba_transaction_timeout);
                }
                if (NIL != corba_connection_eval_errorP(corba_result)) {
                    return Errors.error($str_alt41$_A, corba_connection_eval_error_get_string(corba_result));
                }
                if (!corba_result.isInteger()) {
                    return Errors.error($$$corba_server_not_found);
                }
                corba_connection_set_initial_object_id(corba_connection, corba_result);
                return corba_connection;
            }
        }
    }

    // deflexical
    private static final SubLSymbol $corba_connection_property_keywords$ = makeSymbol("*CORBA-CONNECTION-PROPERTY-KEYWORDS*");

    public static final SubLObject corba_connection_set_stream(SubLObject corba_connection, SubLObject stream) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        if (NIL != stream) {
            SubLTrampolineFile.checkType(stream, STREAMP);
        }
        _csetf_corba_connection_int_stream(corba_connection, stream);
        return stream;
    }

    public static final SubLObject corba_connection_get_stream(SubLObject corba_connection) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        return corba_connection_int_stream(corba_connection);
    }

    public static final SubLObject corba_connection_set_initial_object_id(SubLObject corba_connection, SubLObject initial_object_id) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        _csetf_corba_connection_int_initial_object_id(corba_connection, initial_object_id);
        return initial_object_id;
    }

    public static final SubLObject corba_connection_get_initial_object_id(SubLObject corba_connection) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        return corba_connection_int_initial_object_id(corba_connection);
    }

    public static final SubLObject corba_connection_get_properties(SubLObject corba_connection) {
        return corba_connection_int_properties(corba_connection);
    }

    public static final SubLObject corba_connection_set_property(SubLObject corba_connection, SubLObject property, SubLObject value) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        SubLTrampolineFile.checkType(property, KEYWORDP);
        return putf(corba_connection_int_properties(corba_connection), property, value);
    }

    public static final SubLObject corba_connection_get_property(SubLObject corba_connection, SubLObject property) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        SubLTrampolineFile.checkType(property, KEYWORDP);
        return getf(corba_connection_int_properties(corba_connection), property, UNPROVIDED);
    }

    public static final SubLObject corba_connection_rem_property(SubLObject corba_connection, SubLObject property) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        SubLTrampolineFile.checkType(property, KEYWORDP);
        return remf(corba_connection_int_properties(corba_connection), property);
    }

    public static final SubLObject corba_connection_set_invalid(SubLObject corba_connection, SubLObject invalidP) {
        return corba_connection_set_property(corba_connection, $INVALID, invalidP);
    }

    public static final SubLObject corba_connection_invalidP(SubLObject corba_connection) {
        return corba_connection_get_property(corba_connection, $INVALID);
    }

    /**
     *
     *
     * @return NIL or stream-p ; a TCP stream to use for CORBA-CONNECTION, or NIL if the connection timed out.
     */
    public static final SubLObject corba_connection_open(SubLObject corba_connection, SubLObject connection_timeout, SubLObject access_mode) {
        if (connection_timeout == UNPROVIDED) {
            connection_timeout = NIL;
        }
        if (access_mode == UNPROVIDED) {
            access_mode = $PUBLIC;
        }
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        if (NIL != corba_connection_open_p(corba_connection)) {
            Errors.warn($str_alt48$CORBA_connection_being_reopened_);
        }
        {
            SubLObject proxy_host = corba_connection_get_property(corba_connection, $PROXY_HOST);
            SubLObject proxy_port = corba_connection_get_property(corba_connection, $PROXY_PORT);
            SubLObject stream = subl_promotions.open_tcp_stream_with_timeout(proxy_host, proxy_port, connection_timeout, access_mode);
            if (NIL == stream) {
                return NIL;
            }
            corba_connection_set_stream(corba_connection, stream);
            return stream;
        }
    }

    public static final SubLObject corba_connection_close(SubLObject corba_connection) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        if (NIL == corba_connection_open_p(corba_connection)) {
            return NIL;
        }
        {
            SubLObject corba_form = list($CLOSE_CONNECTION);
            SubLObject send_response = NIL;
            send_response = corba_connection_send(corba_connection, corba_form);
            {
                SubLObject stream = corba_connection_get_stream(corba_connection);
                close(stream, UNPROVIDED);
            }
            return send_response;
        }
    }

    /**
     * Tells the corba server that the objects used for this corba-connection session are no longer needed.
     */
    public static final SubLObject corba_connection_shutdown(SubLObject corba_connection) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_OPEN_P);
        {
            SubLObject initial_object_id = corba_connection_get_initial_object_id(corba_connection);
            if (NIL != initial_object_id) {
                {
                    SubLObject corba_form = list($SHUTDOWN_CONNECTION, initial_object_id);
                    SubLObject send_response = NIL;
                    send_response = corba_connection_send(corba_connection, corba_form);
                    {
                        SubLObject stream = corba_connection_get_stream(corba_connection);
                        close(stream, UNPROVIDED);
                    }
                    return send_response;
                }
            } else {
                return NIL;
            }
        }
    }

    public static final SubLObject corba_connection_open_p(SubLObject corba_connection) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        {
            SubLObject stream = corba_connection_get_stream(corba_connection);
            return makeBoolean(stream.isStream() && (NIL != open_stream_p(stream)));
        }
    }

    public static final SubLObject corba_connection_eval(SubLObject corba_connection, SubLObject corba_predicate, SubLObject args) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
        SubLTrampolineFile.checkType(args, LISTP);
        {
            SubLObject corba_fn = corba_module_utilities.make_corba_gateway_keyword(corba_predicate);
            SubLObject encoded_args = corba_encode_list(args, corba_connection);
            SubLObject result = corba_connection_eval_encoded(corba_connection, cons(corba_fn, encoded_args));
            if (NIL != corba_connection_eval_errorP(result)) {
                Errors.error($str_alt54$corba_result_error___A, result);
            }
            if (NIL != corba_module_utilities.corba_predicate_returns_objectP(corba_predicate)) {
                result = corba_object_from_object_id(result, corba_connection);
            }
            return result;
        }
    }

    public static final SubLObject corba_connection_eval_encoded(SubLObject corba_connection, SubLObject encoded_corba_form) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_P);
            if (NIL != corba_connection_open_p(corba_connection)) {
                Errors.warn($str_alt55$attempt_to_use_corba_connection_p);
                return corba_connection_eval_encoded(corba_connection_clone(corba_connection), encoded_corba_form);
            } else {
                {
                    SubLObject connection_timed_outP = T;
                    SubLObject transaction_timed_outP = T;
                    SubLObject result = NIL;
                    SubLObject transaction_timed_out = NIL;
                    SubLObject tag = subl_macro_promotions.with_timeout_make_tag();
                    try {
                        {
                            SubLObject _prev_bind_0 = subl_macro_promotions.$within_with_timeout$.currentBinding(thread);
                            try {
                                subl_macro_promotions.$within_with_timeout$.bind(T, thread);
                                {
                                    SubLObject timer = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_4 = subl_macro_promotions.$with_timeout_nesting_depth$.currentBinding(thread);
                                            try {
                                                subl_macro_promotions.$with_timeout_nesting_depth$.bind(add(ONE_INTEGER, subl_macro_promotions.$with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                timer = subl_macro_promotions.with_timeout_start_timer($corba_connection_transaction_timeout$.getDynamicValue(thread), tag);
                                                try {
                                                    if (NIL != corba_connection_open(corba_connection, $corba_connection_open_connection_timeout$.getDynamicValue(thread), $PUBLIC)) {
                                                        connection_timed_outP = NIL;
                                                        corba_connection_verify(corba_connection);
                                                        result = corba_connection_eval_encoded_int(corba_connection, encoded_corba_form);
                                                        transaction_timed_outP = NIL;
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != corba_connection_open_p(corba_connection)) {
                                                                corba_connection_close(corba_connection);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                subl_macro_promotions.$with_timeout_nesting_depth$.rebind(_prev_bind_0_4, thread);
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                subl_macro_promotions.with_timeout_stop_timer(timer);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                            }
                                        }
                                    }
                                }
                            } finally {
                                subl_macro_promotions.$within_with_timeout$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } catch (Throwable ccatch_env_var) {
                        transaction_timed_out = Errors.handleThrowable(ccatch_env_var, tag);
                    }
                    if (NIL != connection_timed_outP) {
                        result = new_corba_connection_eval_error($$$connection_timeout);
                    }
                    if (NIL != transaction_timed_outP) {
                        result = new_corba_connection_eval_error($$$transaction_timeout);
                    }
                    return result;
                }
            }
        }
    }

    public static final SubLObject corba_connection_eval_encoded_int(SubLObject corba_connection, SubLObject encoded_corba_form) {
        {
            SubLObject send_response = NIL;
            SubLObject receive_response = NIL;
            send_response = corba_connection_send(corba_connection, encoded_corba_form);
            if (NIL != corba_connection_eval_errorP(send_response)) {
                Errors.error($str_alt58$corba_eval_send_error___A, send_response);
            }
            receive_response = corba_connection_receive(corba_connection);
            if (NIL != corba_connection_eval_errorP(receive_response)) {
                Errors.error($str_alt59$corba_eval_receive_error___A, receive_response);
            }
            return receive_response;
        }
    }

    /**
     *
     *
     * @return corba-connection-eval-error?
     */
    public static final SubLObject new_corba_connection_eval_error(SubLObject error_string) {
        SubLTrampolineFile.checkType(error_string, STRINGP);
        return list($ERROR, error_string);
    }

    public static final SubLObject corba_connection_eval_errorP(SubLObject corba_connection_eval_result) {
        if (corba_connection_eval_result.isList() && (corba_connection_eval_result.first() == $ERROR)) {
            return T;
        } else {
            return NIL;
        }
    }

    public static final SubLObject corba_connection_eval_error_get_string(SubLObject corba_connection_eval_error) {
        if (NIL != corba_connection_eval_errorP(corba_connection_eval_error)) {
            return second(corba_connection_eval_error);
        }
        return NIL;
    }

    /**
     *
     *
     * @return nil if corba-connection not valid.
     */
    public static final SubLObject corba_connection_verify(SubLObject corba_connection) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_OPEN_P);
        if (NIL != corba_connection_get_initial_object_id(corba_connection)) {
            {
                SubLObject result = corba_connection_eval_encoded_int(corba_connection, list($VERIFY_CONNECTION, corba_connection_get_initial_object_id(corba_connection)));
                if (result == $NULL) {
                    corba_connection_set_invalid(corba_connection, T);
                    Errors.warn($str_alt64$CORBA_server_has_been_restarted__);
                    clear_corba_caches();
                    corba_connection_set_initial_object_id(corba_connection, NIL);
                    return NIL;
                }
                return result;
            }
        }
        return NIL;
    }

    public static final SubLObject corba_connection_clone(SubLObject corba_connection) {
        return new_corba_connection(corba_connection_get_properties(corba_connection));
    }

    public static final SubLObject corba_connection_send(SubLObject corba_connection, SubLObject form) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_OPEN_P);
        {
            SubLObject error_message = NIL;
            SubLObject response = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            cfasl_output(form, corba_connection_get_stream(corba_connection));
                            force_output(corba_connection_get_stream(corba_connection));
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_message) {
                Errors.cerror($$$continue, error_message);
            }
            return response;
        }
    }

    public static final SubLObject corba_connection_receive(SubLObject corba_connection) {
        SubLTrampolineFile.checkType(corba_connection, CORBA_CONNECTION_OPEN_P);
        {
            SubLObject error_message = NIL;
            SubLObject response = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            response = cfasl_input(corba_connection_get_stream(corba_connection), UNPROVIDED, UNPROVIDED);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_message) {
                Errors.cerror($$$continue, error_message);
            }
            return response;
        }
    }

    public static final SubLObject declare_corba_utilities_file() {
	declareFunction("get_corba_predicates", "GET-CORBA-PREDICATES", 0, 0, false);
	declareFunction("corba_predicate_p", "CORBA-PREDICATE-P", 1, 0, false);
	declareFunction("get_corba_removal_predicates", "GET-CORBA-REMOVAL-PREDICATES", 0, 0, false);
	declareFunction("corba_removal_predicate_p", "CORBA-REMOVAL-PREDICATE-P", 1, 0, false);
	declareFunction("get_corba_storage_predicates", "GET-CORBA-STORAGE-PREDICATES", 0, 0, false);
	declareFunction("corba_storage_predicate_p", "CORBA-STORAGE-PREDICATE-P", 1, 0, false);
	declareFunction("clear_corba_caches", "CLEAR-CORBA-CACHES", 0, 0, false);
	declareFunction("corba_object_id_from_object", "CORBA-OBJECT-ID-FROM-OBJECT", 2, 0, false);
	declareFunction("corba_object_from_object_id", "CORBA-OBJECT-FROM-OBJECT-ID", 2, 0, false);
	declareFunction("corba_object_id_ify_list", "CORBA-OBJECT-ID-IFY-LIST", 2, 0, false);
	declareFunction("corba_encode_object", "CORBA-ENCODE-OBJECT", 2, 0, false);
	declareFunction("corba_encode_list", "CORBA-ENCODE-LIST", 2, 0, false);
	declareFunction("corba_connection_print_function_trampoline", "CORBA-CONNECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("corba_connection_p", "CORBA-CONNECTION-P", 1, 0, false);
        new corba_utilities.$corba_connection_p$UnaryFunction();
	declareFunction("corba_connection_int_stream", "CORBA-CONNECTION-INT-STREAM", 1, 0, false);
	declareFunction("corba_connection_int_properties", "CORBA-CONNECTION-INT-PROPERTIES", 1, 0, false);
	declareFunction("corba_connection_int_initial_object_id", "CORBA-CONNECTION-INT-INITIAL-OBJECT-ID", 1, 0, false);
	declareFunction("corba_connection_int_history", "CORBA-CONNECTION-INT-HISTORY", 1, 0, false);
	declareFunction("corba_connection_int_error_handling", "CORBA-CONNECTION-INT-ERROR-HANDLING", 1, 0, false);
	declareFunction("_csetf_corba_connection_int_stream", "_CSETF-CORBA-CONNECTION-INT-STREAM", 2, 0, false);
	declareFunction("_csetf_corba_connection_int_properties", "_CSETF-CORBA-CONNECTION-INT-PROPERTIES", 2, 0, false);
	declareFunction("_csetf_corba_connection_int_initial_object_id", "_CSETF-CORBA-CONNECTION-INT-INITIAL-OBJECT-ID", 2, 0, false);
	declareFunction("_csetf_corba_connection_int_history", "_CSETF-CORBA-CONNECTION-INT-HISTORY", 2, 0, false);
	declareFunction("_csetf_corba_connection_int_error_handling", "_CSETF-CORBA-CONNECTION-INT-ERROR-HANDLING", 2, 0, false);
	declareFunction("make_corba_connection", "MAKE-CORBA-CONNECTION", 0, 1, false);
	declareFunction("corba_connection_int_print", "CORBA-CONNECTION-INT-PRINT", 3, 0, false);
	declareFunction("new_corba_connection", "NEW-CORBA-CONNECTION", 1, 0, false);
	declareFunction("corba_connection_set_stream", "CORBA-CONNECTION-SET-STREAM", 2, 0, false);
	declareFunction("corba_connection_get_stream", "CORBA-CONNECTION-GET-STREAM", 1, 0, false);
	declareFunction("corba_connection_set_initial_object_id", "CORBA-CONNECTION-SET-INITIAL-OBJECT-ID", 2, 0, false);
	declareFunction("corba_connection_get_initial_object_id", "CORBA-CONNECTION-GET-INITIAL-OBJECT-ID", 1, 0, false);
	declareFunction("corba_connection_get_properties", "CORBA-CONNECTION-GET-PROPERTIES", 1, 0, false);
	declareFunction("corba_connection_set_property", "CORBA-CONNECTION-SET-PROPERTY", 3, 0, false);
	declareFunction("corba_connection_get_property", "CORBA-CONNECTION-GET-PROPERTY", 2, 0, false);
	declareFunction("corba_connection_rem_property", "CORBA-CONNECTION-REM-PROPERTY", 2, 0, false);
	declareFunction("corba_connection_set_invalid", "CORBA-CONNECTION-SET-INVALID", 2, 0, false);
	declareFunction("corba_connection_invalidP", "CORBA-CONNECTION-INVALID?", 1, 0, false);
	declareFunction("corba_connection_open", "CORBA-CONNECTION-OPEN", 1, 2, false);
	declareFunction("corba_connection_close", "CORBA-CONNECTION-CLOSE", 1, 0, false);
	declareFunction("corba_connection_shutdown", "CORBA-CONNECTION-SHUTDOWN", 1, 0, false);
	declareFunction("corba_connection_open_p", "CORBA-CONNECTION-OPEN-P", 1, 0, false);
	declareFunction("corba_connection_eval", "CORBA-CONNECTION-EVAL", 3, 0, false);
	declareFunction("corba_connection_eval_encoded", "CORBA-CONNECTION-EVAL-ENCODED", 2, 0, false);
	declareFunction("corba_connection_eval_encoded_int", "CORBA-CONNECTION-EVAL-ENCODED-INT", 2, 0, false);
	declareFunction("new_corba_connection_eval_error", "NEW-CORBA-CONNECTION-EVAL-ERROR", 1, 0, false);
	declareFunction("corba_connection_eval_errorP", "CORBA-CONNECTION-EVAL-ERROR?", 1, 0, false);
	declareFunction("corba_connection_eval_error_get_string", "CORBA-CONNECTION-EVAL-ERROR-GET-STRING", 1, 0, false);
	declareFunction("corba_connection_verify", "CORBA-CONNECTION-VERIFY", 1, 0, false);
	declareFunction("corba_connection_clone", "CORBA-CONNECTION-CLONE", 1, 0, false);
	declareFunction("corba_connection_send", "CORBA-CONNECTION-SEND", 2, 0, false);
	declareFunction("corba_connection_receive", "CORBA-CONNECTION-RECEIVE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_corba_utilities_file() {
        deflexical("*CORBA-PREDICATES*", NIL);
        deflexical("*CORBA-REMOVAL-PREDICATES*", NIL);
        deflexical("*CORBA-STORAGE-PREDICATES*", NIL);
        defconstant("*DTP-CORBA-CONNECTION*", CORBA_CONNECTION);
        defvar("*CORBA-CONNECTION-OPEN-CONNECTION-TIMEOUT*", TEN_INTEGER);
        defvar("*CORBA-CONNECTION-TRANSACTION-TIMEOUT*", $int$900);
        deflexical("*CORBA-CONNECTION-PROPERTY-KEYWORDS*", $list_alt43);
        return NIL;
    }

    public static final SubLObject setup_corba_utilities_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_corba_connection$.getGlobalValue(), symbol_function(CORBA_CONNECTION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(CORBA_CONNECTION_INT_STREAM, _CSETF_CORBA_CONNECTION_INT_STREAM);
        def_csetf(CORBA_CONNECTION_INT_PROPERTIES, _CSETF_CORBA_CONNECTION_INT_PROPERTIES);
        def_csetf(CORBA_CONNECTION_INT_INITIAL_OBJECT_ID, _CSETF_CORBA_CONNECTION_INT_INITIAL_OBJECT_ID);
        def_csetf(CORBA_CONNECTION_INT_HISTORY, _CSETF_CORBA_CONNECTION_INT_HISTORY);
        def_csetf(CORBA_CONNECTION_INT_ERROR_HANDLING, _CSETF_CORBA_CONNECTION_INT_ERROR_HANDLING);
        identity(CORBA_CONNECTION);
        return NIL;
    }

    // // Internal Constants
    public static final SubLObject $$CORBAPredicate = constant_handles.reader_make_constant_shell(makeString("CORBAPredicate"));

    public static final SubLObject $$CORBARemovalPredicate = constant_handles.reader_make_constant_shell(makeString("CORBARemovalPredicate"));

    public static final SubLObject $$CORBAStoragePredicate = constant_handles.reader_make_constant_shell(makeString("CORBAStoragePredicate"));

    private static final SubLSymbol CORBA_CONNECTION_P = makeSymbol("CORBA-CONNECTION-P");

    public static final SubLObject $$TheCORBAInitialObject = constant_handles.reader_make_constant_shell(makeString("TheCORBAInitialObject"));

    public static final SubLObject $$CORBAObjectFn = constant_handles.reader_make_constant_shell(makeString("CORBAObjectFn"));





    private static final SubLSymbol CORBA_CONNECTION = makeSymbol("CORBA-CONNECTION");

    static private final SubLList $list_alt9 = list(makeSymbol("STREAM"), makeSymbol("PROPERTIES"), makeSymbol("INITIAL-OBJECT-ID"), makeSymbol("HISTORY"), makeSymbol("ERROR-HANDLING"));

    static private final SubLList $list_alt10 = list(makeKeyword("STREAM"), makeKeyword("PROPERTIES"), makeKeyword("INITIAL-OBJECT-ID"), makeKeyword("HISTORY"), makeKeyword("ERROR-HANDLING"));

    static private final SubLList $list_alt11 = list(makeSymbol("CORBA-CONNECTION-INT-STREAM"), makeSymbol("CORBA-CONNECTION-INT-PROPERTIES"), makeSymbol("CORBA-CONNECTION-INT-INITIAL-OBJECT-ID"), makeSymbol("CORBA-CONNECTION-INT-HISTORY"), makeSymbol("CORBA-CONNECTION-INT-ERROR-HANDLING"));

    static private final SubLList $list_alt12 = list(makeSymbol("_CSETF-CORBA-CONNECTION-INT-STREAM"), makeSymbol("_CSETF-CORBA-CONNECTION-INT-PROPERTIES"), makeSymbol("_CSETF-CORBA-CONNECTION-INT-INITIAL-OBJECT-ID"), makeSymbol("_CSETF-CORBA-CONNECTION-INT-HISTORY"), makeSymbol("_CSETF-CORBA-CONNECTION-INT-ERROR-HANDLING"));

    private static final SubLSymbol CORBA_CONNECTION_INT_PRINT = makeSymbol("CORBA-CONNECTION-INT-PRINT");

    private static final SubLSymbol CORBA_CONNECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("CORBA-CONNECTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol CORBA_CONNECTION_INT_STREAM = makeSymbol("CORBA-CONNECTION-INT-STREAM");

    public static final SubLSymbol _CSETF_CORBA_CONNECTION_INT_STREAM = makeSymbol("_CSETF-CORBA-CONNECTION-INT-STREAM");

    private static final SubLSymbol CORBA_CONNECTION_INT_PROPERTIES = makeSymbol("CORBA-CONNECTION-INT-PROPERTIES");

    public static final SubLSymbol _CSETF_CORBA_CONNECTION_INT_PROPERTIES = makeSymbol("_CSETF-CORBA-CONNECTION-INT-PROPERTIES");

    private static final SubLSymbol CORBA_CONNECTION_INT_INITIAL_OBJECT_ID = makeSymbol("CORBA-CONNECTION-INT-INITIAL-OBJECT-ID");

    public static final SubLSymbol _CSETF_CORBA_CONNECTION_INT_INITIAL_OBJECT_ID = makeSymbol("_CSETF-CORBA-CONNECTION-INT-INITIAL-OBJECT-ID");

    private static final SubLSymbol CORBA_CONNECTION_INT_HISTORY = makeSymbol("CORBA-CONNECTION-INT-HISTORY");

    public static final SubLSymbol _CSETF_CORBA_CONNECTION_INT_HISTORY = makeSymbol("_CSETF-CORBA-CONNECTION-INT-HISTORY");

    private static final SubLSymbol CORBA_CONNECTION_INT_ERROR_HANDLING = makeSymbol("CORBA-CONNECTION-INT-ERROR-HANDLING");

    public static final SubLSymbol _CSETF_CORBA_CONNECTION_INT_ERROR_HANDLING = makeSymbol("_CSETF-CORBA-CONNECTION-INT-ERROR-HANDLING");





    private static final SubLSymbol $INITIAL_OBJECT_ID = makeKeyword("INITIAL-OBJECT-ID");





    static private final SubLString $str_alt30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt31$__CORBA_CONNECTION_ = makeString("#<CORBA-CONNECTION ");

    static private final SubLString $str_alt32$_streamless = makeString(" streamless");

    static private final SubLString $str_alt33$_open = makeString(" open");

    static private final SubLString $str_alt34$_closed = makeString(" closed");

    static private final SubLString $str_alt35$_ = makeString(">");

    public static final SubLInteger $int$900 = makeInteger(900);





    static private final SubLString $$$corba_connection_timeout = makeString("corba connection timeout");

    static private final SubLString $$$corba_transaction_timeout = makeString("corba transaction timeout");

    static private final SubLString $str_alt41$_A = makeString("~A");

    static private final SubLString $$$corba_server_not_found = makeString("corba server not found");

    static private final SubLList $list_alt43 = list(makeKeyword("PROXY-HOST"), makeKeyword("PROXY-PORT"), makeKeyword("INITIAL-ORB-HOST"), makeKeyword("INITIAL-ORB-PORT"), makeKeyword("SERVICE-NAME"), makeKeyword("INITIAL-OBJECT-FACTORY-HELPER"), makeKeyword("INITIAL-OBJECT-CLASS"), makeKeyword("INVALID"));









    static private final SubLString $str_alt48$CORBA_connection_being_reopened_ = makeString("CORBA connection being reopened.");







    private static final SubLSymbol CORBA_CONNECTION_OPEN_P = makeSymbol("CORBA-CONNECTION-OPEN-P");



    static private final SubLString $str_alt54$corba_result_error___A = makeString("corba result error: ~A");

    static private final SubLString $str_alt55$attempt_to_use_corba_connection_p = makeString("attempt to use corba-connection-p again awhile open (possibly because of multithreading).  cloning connection.");

    static private final SubLString $$$connection_timeout = makeString("connection timeout");

    static private final SubLString $$$transaction_timeout = makeString("transaction timeout");

    static private final SubLString $str_alt58$corba_eval_send_error___A = makeString("corba-eval send error: ~A");

    static private final SubLString $str_alt59$corba_eval_receive_error___A = makeString("corba-eval receive error: ~A");









    static private final SubLString $str_alt64$CORBA_server_has_been_restarted__ = makeString("CORBA server has been restarted.  Existing codeMapping assertions for this knowledge source are now stale, should be removed, and the relevant forward rules repropagated.");



    static private final SubLString $$$continue = makeString("continue");

    // // Initializers
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
}

