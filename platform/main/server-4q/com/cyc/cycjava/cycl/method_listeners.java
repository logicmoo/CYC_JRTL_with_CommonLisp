package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.method_listeners;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.method_listeners.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class method_listeners extends SubLTranslatedFile {
    public static final SubLFile me = new method_listeners();

    public static final String myName = "com.cyc.cycjava.cycl.method_listeners";

    public static final String myFingerPrint = "96756bfc99ad15275fc6b474c999e5ad787e40cef51b6ef8b4aac8510029eabb";

    // defconstant
    private static final SubLSymbol $method_listeners_illegal_demon_type_message$ = makeSymbol("*METHOD-LISTENERS-ILLEGAL-DEMON-TYPE-MESSAGE*");

    // defconstant
    private static final SubLSymbol $method_listeners_illegal_method_message$ = makeSymbol("*METHOD-LISTENERS-ILLEGAL-METHOD-MESSAGE*");

    // defconstant
    private static final SubLSymbol $method_listeners_illegal_function_message$ = makeSymbol("*METHOD-LISTENERS-ILLEGAL-FUNCTION-MESSAGE*");

    // defconstant
    private static final SubLSymbol $method_listeners_illegal_class_name_message$ = makeSymbol("*METHOD-LISTENERS-ILLEGAL-CLASS-NAME-MESSAGE*");

    // defconstant
    private static final SubLSymbol $method_listeners_illegal_class_or_instance_message$ = makeSymbol("*METHOD-LISTENERS-ILLEGAL-CLASS-OR-INSTANCE-MESSAGE*");

    // defconstant
    private static final SubLSymbol $method_listeners_illegal_instance_method$ = makeSymbol("*METHOD-LISTENERS-ILLEGAL-INSTANCE-METHOD*");

    // defparameter
    private static final SubLSymbol $method_listeners_demon_types$ = makeSymbol("*METHOD-LISTENERS-DEMON-TYPES*");

    // defparameter
    private static final SubLSymbol $method_listeners_registry_types$ = makeSymbol("*METHOD-LISTENERS-REGISTRY-TYPES*");

    // Internal Constants
    public static final SubLString $str0$_S_is_not_a_legal_demon_type___Me = makeString("~S is not a legal demon type.  Method listener demon types must be one of :before or :after.");

    public static final SubLString $str1$_S_is_not_a_legal_method___A_meth = makeString("~S is not a legal method.  A method must be a non-nil symbol.");

    public static final SubLString $str2$_S_is_not_a_legal_function___A_fu = makeString("~S is not a legal function.  A function must be a non-nil symbol.");

    public static final SubLString $str3$_S_is_not_a_legal_class_name___A_ = makeString("~S is not a legal class name.  A class name must be a non-nil symbol.");

    public static final SubLString $str4$_S_is_not_a_legal_class_or_instan = makeString("~S is not a legal class or instance.");

    public static final SubLString $str5$_S_is_not_a_legal_instance_ = makeString("~S is not a legal instance.");

    public static final SubLList $list6 = list(makeKeyword("BEFORE"), makeKeyword("AFTER"));

    public static final SubLList $list7 = list(makeKeyword("BEFORE-METHOD-REGISTRY"), makeKeyword("AFTER-METHOD-REGISTRY"));

    private static final SubLSymbol $METHOD_LISTENERS_NO_VALUE = makeKeyword("METHOD-LISTENERS-NO-VALUE");





    public static final SubLList $list11 = list(list(makeSymbol("INSTANCE"), makeSymbol("REGISTRY-TYPE")), makeSymbol("&BODY"), makeSymbol("FORMS"));

    public static final SubLSymbol WITH_METHOD_LISTENER_REGISTRY = makeSymbol("WITH-METHOD-LISTENER-REGISTRY");

    public static final SubLSymbol METHOD_LISTENERS_FIND_REGISTRY = makeSymbol("METHOD-LISTENERS-FIND-REGISTRY");

    public static final SubLSymbol WITH_METHOD_LISTENER_REGISTRY_PRIVATE = makeSymbol("WITH-METHOD-LISTENER-REGISTRY-PRIVATE");

    public static SubLObject method_listeners_valid_demon_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != member(v_object, $method_listeners_demon_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static SubLObject method_listeners_valid_registry_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return NIL != member(v_object, $method_listeners_registry_types$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED) ? T : NIL;
    }

    public static SubLObject method_listeners_call_listener(final SubLObject method_listener, final SubLObject instance_or_class, final SubLObject args, SubLObject return_value) {
        if (return_value == UNPROVIDED) {
            return_value = $METHOD_LISTENERS_NO_VALUE;
        }
        if (NIL != subloop_structures.method_listener_p(method_listener)) {
            final SubLObject owning_method_name = subloop_structures.ml_owning_method_name(method_listener);
            final SubLObject detail = subloop_structures.ml_detail(method_listener);
            if (NIL != subloop_structures.function_detail_p(detail)) {
                final SubLObject function_detail = detail;
                final SubLObject function_name = subloop_structures.fd_function_name(function_detail);
                if (NIL != function_name) {
                    if (return_value == $METHOD_LISTENERS_NO_VALUE) {
                        funcall(function_name, instance_or_class, owning_method_name, args);
                    } else {
                        funcall(function_name, instance_or_class, owning_method_name, args, return_value);
                    }
                    return T;
                }
            } else
                if (NIL != subloop_structures.method_detail_p(detail)) {
                    final SubLObject method_detail = detail;
                    final SubLObject method_name = subloop_structures.md_method_name(method_detail);
                    final SubLObject function_name2 = subloop_structures.md_function_name(method_detail);
                    final SubLObject instance = subloop_structures.md_instance(method_detail);
                    if (NIL != function_name2) {
                        if (return_value == $METHOD_LISTENERS_NO_VALUE) {
                            funcall(function_name2, instance, instance_or_class, owning_method_name, args);
                        } else {
                            funcall(function_name2, instance, instance_or_class, owning_method_name, args, return_value);
                        }
                        return T;
                    }
                    if (NIL != method_name) {
                        if (NIL != subloop_structures.class_p(instance)) {
                            if (return_value == $METHOD_LISTENERS_NO_VALUE) {
                                methods.funcall_class_method_with_3_args(instance, method_name, instance_or_class, owning_method_name, args);
                            } else {
                                methods.funcall_class_method_with_4_args(instance, method_name, instance_or_class, owning_method_name, args, return_value);
                            }
                            return T;
                        }
                        if (NIL != subloop_structures.instance_p(instance)) {
                            if (return_value == $METHOD_LISTENERS_NO_VALUE) {
                                methods.funcall_instance_method_with_3_args(instance, method_name, instance_or_class, owning_method_name, args);
                            } else {
                                methods.funcall_instance_method_with_4_args(instance, method_name, instance_or_class, owning_method_name, args, return_value);
                            }
                            return T;
                        }
                    }
                }

        }
        return NIL;
    }

    public static SubLObject new_function_based_method_listener(final SubLObject monitored_method, final SubLObject monitored_class, final SubLObject new_demon_type, final SubLObject monitoring_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == monitored_method) || (!monitored_method.isSymbol()))) {
            Errors.error($method_listeners_illegal_method_message$.getGlobalValue(), monitored_method);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == monitored_class) || (!monitored_class.isSymbol()))) {
            Errors.error($method_listeners_illegal_class_name_message$.getGlobalValue(), monitored_class);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == method_listeners_valid_demon_type_p(new_demon_type))) {
            Errors.error($method_listeners_illegal_demon_type_message$.getGlobalValue(), new_demon_type);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == monitoring_function) || (!monitoring_function.isSymbol()))) {
            Errors.error($method_listeners_illegal_function_message$.getGlobalValue(), monitoring_function);
        }
        final SubLObject method_listener = subloop_structures.make_method_listener(UNPROVIDED);
        final SubLObject v_class = classes.classes_retrieve_class(monitored_class);
        final SubLObject method = (NIL != v_class) ? methods.methods_get_method(v_class, monitored_method) : NIL;
        final SubLObject new_arglist = (NIL != method) ? methods.methods_lambda_list_to_listed_arg_value_expression(subloop_structures.method_lambda_list(method)) : NIL;
        final SubLObject method_listener_$2 = method_listener;
        SubLObject owning_method_name = subloop_structures.ml_owning_method_name(method_listener_$2);
        SubLObject owning_class_name = subloop_structures.ml_owning_class_name(method_listener_$2);
        SubLObject demon_type = subloop_structures.ml_demon_type(method_listener_$2);
        SubLObject detail = subloop_structures.ml_detail(method_listener_$2);
        try {
            owning_method_name = monitored_method;
            owning_class_name = monitored_class;
            demon_type = new_demon_type;
            final SubLObject function_detail;
            detail = function_detail = subloop_structures.make_function_detail(UNPROVIDED);
            SubLObject function_name = subloop_structures.fd_function_name(function_detail);
            SubLObject arglist = subloop_structures.fd_arglist(function_detail);
            try {
                function_name = monitoring_function;
                arglist = new_arglist;
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_structures._csetf_fd_function_name(function_detail, function_name);
                    subloop_structures._csetf_fd_arglist(function_detail, arglist);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                subloop_structures._csetf_ml_owning_method_name(method_listener_$2, owning_method_name);
                subloop_structures._csetf_ml_owning_class_name(method_listener_$2, owning_class_name);
                subloop_structures._csetf_ml_demon_type(method_listener_$2, demon_type);
                subloop_structures._csetf_ml_detail(method_listener_$2, detail);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return method_listener;
    }

    public static SubLObject new_method_based_method_listener(final SubLObject monitored_method, final SubLObject monitored_class, final SubLObject new_demon_type, final SubLObject monitoring_method, final SubLObject monitoring_class_or_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == monitored_method) || (!monitored_method.isSymbol()))) {
            Errors.error($method_listeners_illegal_method_message$.getGlobalValue(), monitored_method);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == monitored_class) || (!monitored_class.isSymbol()))) {
            Errors.error($method_listeners_illegal_class_name_message$.getGlobalValue(), monitored_class);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == method_listeners_valid_demon_type_p(new_demon_type))) {
            Errors.error($method_listeners_illegal_demon_type_message$.getGlobalValue(), new_demon_type);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == monitoring_method) || (!monitoring_method.isSymbol()))) {
            Errors.error($method_listeners_illegal_method_message$.getGlobalValue(), monitoring_method);
        }
        final SubLObject method_listener = subloop_structures.make_method_listener(UNPROVIDED);
        final SubLObject v_class = classes.classes_retrieve_class(monitored_class);
        final SubLObject method = (NIL != v_class) ? methods.methods_get_method(v_class, monitored_method) : NIL;
        final SubLObject new_arglist = (NIL != method) ? methods.methods_lambda_list_to_listed_arg_value_expression(subloop_structures.method_lambda_list(method)) : NIL;
        final SubLObject method_listener_$3 = method_listener;
        SubLObject owning_method_name = subloop_structures.ml_owning_method_name(method_listener_$3);
        SubLObject owning_class_name = subloop_structures.ml_owning_class_name(method_listener_$3);
        SubLObject demon_type = subloop_structures.ml_demon_type(method_listener_$3);
        SubLObject detail = subloop_structures.ml_detail(method_listener_$3);
        try {
            owning_method_name = monitored_method;
            owning_class_name = monitored_class;
            demon_type = new_demon_type;
            final SubLObject method_detail;
            detail = method_detail = subloop_structures.make_method_detail(UNPROVIDED);
            SubLObject method_name = subloop_structures.md_method_name(method_detail);
            SubLObject function_name = subloop_structures.md_function_name(method_detail);
            SubLObject arglist = subloop_structures.md_arglist(method_detail);
            SubLObject instance = subloop_structures.md_instance(method_detail);
            try {
                method_name = monitoring_method;
                final SubLObject monitoring_class = (NIL != subloop_structures.class_p(monitoring_class_or_instance)) ? monitoring_class_or_instance : NIL != subloop_structures.instance_p(monitoring_class_or_instance) ? subloop_structures.instance_class(monitoring_class_or_instance) : NIL;
                if (NIL != monitoring_class) {
                    final SubLObject method_$4 = methods.methods_get_method(monitoring_class, monitoring_method);
                    if (NIL != method_$4) {
                        function_name = subloop_structures.method_function_name(method_$4);
                    } else {
                        function_name = NIL;
                    }
                } else {
                    function_name = NIL;
                }
                arglist = new_arglist;
                instance = monitoring_class_or_instance;
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    subloop_structures._csetf_md_method_name(method_detail, method_name);
                    subloop_structures._csetf_md_function_name(method_detail, function_name);
                    subloop_structures._csetf_md_arglist(method_detail, arglist);
                    subloop_structures._csetf_md_instance(method_detail, instance);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                subloop_structures._csetf_ml_owning_method_name(method_listener_$3, owning_method_name);
                subloop_structures._csetf_ml_owning_class_name(method_listener_$3, owning_class_name);
                subloop_structures._csetf_ml_demon_type(method_listener_$3, demon_type);
                subloop_structures._csetf_ml_detail(method_listener_$3, detail);
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return method_listener;
    }

    public static SubLObject method_listeners_get_listeners(final SubLObject method, final SubLObject type) {
        if (type.eql($BEFORE)) {
            return subloop_structures.method_before_listeners(method);
        }
        if (type.eql($AFTER)) {
            return subloop_structures.method_after_listeners(method);
        }
        return NIL;
    }

    public static SubLObject method_listeners_invoke_method_listeners_private(final SubLObject method, final SubLObject type, final SubLObject class_or_instance, final SubLObject args, SubLObject return_value) {
        if (return_value == UNPROVIDED) {
            return_value = $METHOD_LISTENERS_NO_VALUE;
        }
        final SubLObject v_method_listeners = method_listeners_get_listeners(method, type);
        if (return_value == $METHOD_LISTENERS_NO_VALUE) {
            SubLObject cdolist_list_var = v_method_listeners;
            SubLObject method_listener = NIL;
            method_listener = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                method_listeners_call_listener(method_listener, class_or_instance, args, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                method_listener = cdolist_list_var.first();
            } 
        } else {
            SubLObject cdolist_list_var = v_method_listeners;
            SubLObject method_listener = NIL;
            method_listener = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                method_listeners_call_listener(method_listener, class_or_instance, args, return_value);
                cdolist_list_var = cdolist_list_var.rest();
                method_listener = cdolist_list_var.first();
            } 
        }
        return T;
    }

    public static SubLObject method_listeners_invoke_before_method_listeners(final SubLObject method, final SubLObject class_or_instance, final SubLObject args) {
        if (NIL != subloop_structures.method_p(method)) {
            return method_listeners_invoke_method_listeners_private(method, $BEFORE, class_or_instance, args, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject method_listeners_invoke_after_method_listeners(final SubLObject method, final SubLObject class_or_instance, final SubLObject args, final SubLObject return_value) {
        if (NIL != subloop_structures.method_p(method)) {
            return method_listeners_invoke_method_listeners_private(method, $AFTER, class_or_instance, args, return_value);
        }
        return NIL;
    }

    public static SubLObject method_listeners_invoke_before_listeners(final SubLObject method_name, final SubLObject class_or_instance, final SubLObject args) {
        if (method_name.isSymbol() && args.isList()) {
            if (NIL != subloop_structures.instance_p(class_or_instance)) {
                final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
                if (NIL != subloop_structures.class_p(v_class)) {
                    final SubLObject method = methods.methods_get_method(v_class, method_name);
                    method_listeners_invoke_before_method_listeners(method, class_or_instance, args);
                }
            } else {
                if (NIL == subloop_structures.class_p(class_or_instance)) {
                    return NIL;
                }
                final SubLObject method2 = methods.methods_get_method(class_or_instance, method_name);
                method_listeners_invoke_before_method_listeners(method2, class_or_instance, args);
            }
        }
        return NIL;
    }

    public static SubLObject method_listeners_invoke_after_listeners(final SubLObject method_name, final SubLObject class_or_instance, final SubLObject args, final SubLObject return_value) {
        if (method_name.isSymbol() && args.isList()) {
            if (NIL != subloop_structures.instance_p(class_or_instance)) {
                final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
                if (NIL != subloop_structures.class_p(v_class)) {
                    final SubLObject method = methods.methods_get_method(v_class, method_name);
                    method_listeners_invoke_after_method_listeners(method, class_or_instance, args, return_value);
                }
            } else {
                if (NIL == subloop_structures.class_p(class_or_instance)) {
                    return NIL;
                }
                final SubLObject method2 = methods.methods_get_method(class_or_instance, method_name);
                method_listeners_invoke_after_method_listeners(method2, class_or_instance, args, return_value);
            }
        }
        return NIL;
    }

    public static SubLObject method_listeners_add_listener(final SubLObject class_name, final SubLObject method, final SubLObject type, final SubLObject function_or_method, SubLObject class_or_instance_if_method) {
        if (class_or_instance_if_method == UNPROVIDED) {
            class_or_instance_if_method = NIL;
        }
        if (type.eql($BEFORE)) {
            final SubLObject v_method_listeners = subloop_structures.method_before_listeners(method);
            if (NIL != class_or_instance_if_method) {
                SubLObject cdolist_list_var = v_method_listeners;
                SubLObject method_listener = NIL;
                method_listener = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject method_listener_$5 = method_listener;
                    final SubLObject owning_class_name = subloop_structures.ml_owning_class_name(method_listener_$5);
                    final SubLObject detail = subloop_structures.ml_detail(method_listener_$5);
                    if (owning_class_name.eql(class_name) && (NIL != subloop_structures.method_detail_p(detail))) {
                        final SubLObject method_detail = detail;
                        final SubLObject method_name = subloop_structures.md_method_name(method_detail);
                        final SubLObject instance = subloop_structures.md_instance(method_detail);
                        if (method_name.eql(function_or_method) && instance.eql(class_or_instance_if_method)) {
                            return NIL;
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    method_listener = cdolist_list_var.first();
                } 
                final SubLObject name = subloop_structures.method_name(method);
                final SubLObject class_name_$7 = subloop_structures.method_class_name(method);
                SubLObject before_listeners = subloop_structures.method_before_listeners(method);
                try {
                    before_listeners = nconc(before_listeners, list(new_method_based_method_listener(name, class_name_$7, $BEFORE, function_or_method, class_or_instance_if_method)));
                } finally {
                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values = getValuesAsVector();
                        subloop_structures._csetf_method_name(method, name);
                        subloop_structures._csetf_method_class_name(method, class_name_$7);
                        subloop_structures._csetf_method_before_listeners(method, before_listeners);
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
                return T;
            }
            SubLObject cdolist_list_var = v_method_listeners;
            SubLObject method_listener = NIL;
            method_listener = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject method_listener_$6 = method_listener;
                final SubLObject owning_class_name = subloop_structures.ml_owning_class_name(method_listener_$6);
                final SubLObject detail = subloop_structures.ml_detail(method_listener_$6);
                if (owning_class_name.eql(class_name) && (NIL != subloop_structures.function_detail_p(detail))) {
                    final SubLObject function_detail = detail;
                    final SubLObject function_name = subloop_structures.fd_function_name(function_detail);
                    if (function_name.eql(function_or_method)) {
                        return NIL;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                method_listener = cdolist_list_var.first();
            } 
            final SubLObject name = subloop_structures.method_name(method);
            final SubLObject class_name_$8 = subloop_structures.method_class_name(method);
            SubLObject before_listeners = subloop_structures.method_before_listeners(method);
            try {
                before_listeners = nconc(before_listeners, list(new_function_based_method_listener(name, class_name_$8, $BEFORE, function_or_method)));
            } finally {
                final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values2 = getValuesAsVector();
                    subloop_structures._csetf_method_name(method, name);
                    subloop_structures._csetf_method_class_name(method, class_name_$8);
                    subloop_structures._csetf_method_before_listeners(method, before_listeners);
                    restoreValuesFromVector(_values2);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_2);
                }
            }
            return NIL;
        } else {
            if (!type.eql($AFTER)) {
                return NIL;
            }
            final SubLObject v_method_listeners = subloop_structures.method_after_listeners(method);
            if (NIL != class_or_instance_if_method) {
                SubLObject cdolist_list_var = v_method_listeners;
                SubLObject method_listener = NIL;
                method_listener = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject method_listener_$7 = method_listener;
                    final SubLObject owning_class_name = subloop_structures.ml_owning_class_name(method_listener_$7);
                    final SubLObject detail = subloop_structures.ml_detail(method_listener_$7);
                    if (owning_class_name.eql(class_name) && (NIL != subloop_structures.method_detail_p(detail))) {
                        final SubLObject method_detail = detail;
                        final SubLObject method_name = subloop_structures.md_method_name(method_detail);
                        final SubLObject instance = subloop_structures.md_instance(method_detail);
                        if (method_name.eql(function_or_method) && instance.eql(class_or_instance_if_method)) {
                            return NIL;
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    method_listener = cdolist_list_var.first();
                } 
                final SubLObject name = subloop_structures.method_name(method);
                final SubLObject class_name_$9 = subloop_structures.method_class_name(method);
                SubLObject after_listeners = subloop_structures.method_after_listeners(method);
                try {
                    after_listeners = cons(new_method_based_method_listener(name, class_name_$9, $AFTER, function_or_method, class_or_instance_if_method), after_listeners);
                } finally {
                    final SubLObject _prev_bind_3 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values3 = getValuesAsVector();
                        subloop_structures._csetf_method_name(method, name);
                        subloop_structures._csetf_method_class_name(method, class_name_$9);
                        subloop_structures._csetf_method_after_listeners(method, after_listeners);
                        restoreValuesFromVector(_values3);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_3);
                    }
                }
                return T;
            }
            SubLObject cdolist_list_var = v_method_listeners;
            SubLObject method_listener = NIL;
            method_listener = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject method_listener_$8 = method_listener;
                final SubLObject owning_class_name = subloop_structures.ml_owning_class_name(method_listener_$8);
                final SubLObject detail = subloop_structures.ml_detail(method_listener_$8);
                if (owning_class_name.eql(class_name) && (NIL != subloop_structures.function_detail_p(detail))) {
                    final SubLObject function_detail = detail;
                    final SubLObject function_name = subloop_structures.fd_function_name(function_detail);
                    if (function_name.eql(function_or_method)) {
                        return NIL;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                method_listener = cdolist_list_var.first();
            } 
            final SubLObject class_name_$10 = subloop_structures.method_class_name(method);
            SubLObject after_listeners2 = subloop_structures.method_after_listeners(method);
            try {
                after_listeners2 = cons(new_function_based_method_listener(method, class_name_$10, $AFTER, function_or_method), after_listeners2);
            } finally {
                final SubLObject _prev_bind_4 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values4 = getValuesAsVector();
                    subloop_structures._csetf_method_class_name(method, class_name_$10);
                    subloop_structures._csetf_method_after_listeners(method, after_listeners2);
                    restoreValuesFromVector(_values4);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_4);
                }
            }
            return T;
        }
    }

    public static SubLObject method_listeners_add_before_listener(final SubLObject class_name, final SubLObject method_name, final SubLObject function_or_method, SubLObject class_or_instance_if_method) {
        if (class_or_instance_if_method == UNPROVIDED) {
            class_or_instance_if_method = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == class_name) || (!class_name.isSymbol()))) {
            Errors.error($method_listeners_illegal_class_name_message$.getGlobalValue(), class_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == method_name) || (!method_name.isSymbol()))) {
            Errors.error($method_listeners_illegal_method_message$.getGlobalValue(), method_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == function_or_method) || (!function_or_method.isSymbol()))) {
            Errors.error($method_listeners_illegal_function_message$.getGlobalValue(), function_or_method);
        }
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        if (NIL != v_class) {
            final SubLObject method = methods.methods_get_method(v_class, method_name);
            if (NIL != method) {
                return method_listeners_add_listener(class_name, method, $BEFORE, function_or_method, class_or_instance_if_method);
            }
        }
        return NIL;
    }

    public static SubLObject method_listeners_add_after_listener(final SubLObject class_name, final SubLObject method_name, final SubLObject function_or_method, SubLObject class_or_instance_if_method) {
        if (class_or_instance_if_method == UNPROVIDED) {
            class_or_instance_if_method = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == class_name) || (!class_name.isSymbol()))) {
            Errors.error($method_listeners_illegal_class_name_message$.getGlobalValue(), class_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == method_name) || (!method_name.isSymbol()))) {
            Errors.error($method_listeners_illegal_method_message$.getGlobalValue(), method_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == function_or_method) || (!function_or_method.isSymbol()))) {
            Errors.error($method_listeners_illegal_function_message$.getGlobalValue(), function_or_method);
        }
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        if (NIL != v_class) {
            final SubLObject method = methods.methods_get_method(v_class, method_name);
            if (NIL != method) {
                return method_listeners_add_listener(class_name, method, $AFTER, function_or_method, class_or_instance_if_method);
            }
        }
        return NIL;
    }

    public static SubLObject method_listeners_remove_all_method_listeners_private(final SubLObject monitored_instance) {
        final SubLObject monitored_class = (NIL != subloop_structures.class_p(monitored_instance)) ? monitored_instance : subloop_structures.instance_class(monitored_instance);
        final SubLObject monitored_class_name = subloop_structures.class_name(monitored_class);
        final SubLObject v_class = monitored_class;
        SubLObject cdolist_list_var;
        final SubLObject compiled_instance_method_access_alist = cdolist_list_var = subloop_structures.class_compiled_instance_method_access_alist(v_class);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject method_$17 = method;
            final SubLObject class_name = subloop_structures.method_class_name(method_$17);
            SubLObject before_listeners = subloop_structures.method_before_listeners(method_$17);
            SubLObject after_listeners = subloop_structures.method_after_listeners(method_$17);
            try {
                if (monitored_class_name.eql(class_name)) {
                    before_listeners = NIL;
                    after_listeners = NIL;
                }
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    subloop_structures._csetf_method_class_name(method_$17, class_name);
                    subloop_structures._csetf_method_before_listeners(method_$17, before_listeners);
                    subloop_structures._csetf_method_after_listeners(method_$17, after_listeners);
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject method_listeners_remove_all_method_listeners_with_target(final SubLObject monitored_instance, final SubLObject target) {
        final SubLObject monitored_class = (NIL != subloop_structures.class_p(monitored_instance)) ? monitored_instance : subloop_structures.instance_class(monitored_instance);
        final SubLObject monitored_class_name = subloop_structures.class_name(monitored_class);
        final SubLObject v_class = monitored_class;
        SubLObject cdolist_list_var;
        final SubLObject compiled_instance_method_access_alist = cdolist_list_var = subloop_structures.class_compiled_instance_method_access_alist(v_class);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject method_$18 = method;
            final SubLObject class_name = subloop_structures.method_class_name(method_$18);
            SubLObject before_listeners = subloop_structures.method_before_listeners(method_$18);
            SubLObject after_listeners = subloop_structures.method_after_listeners(method_$18);
            try {
                if (monitored_class_name.eql(class_name)) {
                    SubLObject new_listeners = NIL;
                    new_listeners = NIL;
                    SubLObject cdolist_list_var_$19 = before_listeners;
                    SubLObject listener = NIL;
                    listener = cdolist_list_var_$19.first();
                    while (NIL != cdolist_list_var_$19) {
                        final SubLObject method_listener = listener;
                        final SubLObject detail = subloop_structures.ml_detail(method_listener);
                        if ((NIL == subloop_structures.method_detail_p(detail)) || (!subloop_structures.md_instance(detail).eql(target))) {
                            new_listeners = cons(listener, new_listeners);
                        }
                        cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                        listener = cdolist_list_var_$19.first();
                    } 
                    before_listeners = nreverse(new_listeners);
                    new_listeners = NIL;
                    SubLObject cdolist_list_var_$20 = after_listeners;
                    listener = NIL;
                    listener = cdolist_list_var_$20.first();
                    while (NIL != cdolist_list_var_$20) {
                        final SubLObject method_listener = listener;
                        final SubLObject detail = subloop_structures.ml_detail(method_listener);
                        if ((NIL == subloop_structures.method_detail_p(detail)) || (!subloop_structures.md_instance(detail).eql(target))) {
                            new_listeners = cons(listener, new_listeners);
                        }
                        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                        listener = cdolist_list_var_$20.first();
                    } 
                    after_listeners = nreverse(new_listeners);
                }
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    subloop_structures._csetf_method_class_name(method_$18, class_name);
                    subloop_structures._csetf_method_before_listeners(method_$18, before_listeners);
                    subloop_structures._csetf_method_after_listeners(method_$18, after_listeners);
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject method_listeners_remove_all_method_listeners_with_target_and_method_internal(final SubLObject monitored_instance, final SubLObject target, final SubLObject monitoring_method) {
        final SubLObject monitored_class = (NIL != subloop_structures.class_p(monitored_instance)) ? monitored_instance : subloop_structures.instance_class(monitored_instance);
        final SubLObject monitored_class_name = subloop_structures.class_name(monitored_class);
        final SubLObject v_class = monitored_class;
        SubLObject cdolist_list_var;
        final SubLObject compiled_instance_method_access_alist = cdolist_list_var = subloop_structures.class_compiled_instance_method_access_alist(v_class);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject method_$21 = method;
            final SubLObject class_name = subloop_structures.method_class_name(method_$21);
            SubLObject before_listeners = subloop_structures.method_before_listeners(method_$21);
            SubLObject after_listeners = subloop_structures.method_after_listeners(method_$21);
            try {
                if (monitored_class_name.eql(class_name)) {
                    SubLObject new_listeners = NIL;
                    new_listeners = NIL;
                    SubLObject cdolist_list_var_$22 = before_listeners;
                    SubLObject listener = NIL;
                    listener = cdolist_list_var_$22.first();
                    while (NIL != cdolist_list_var_$22) {
                        final SubLObject method_listener = listener;
                        final SubLObject detail = subloop_structures.ml_detail(method_listener);
                        if (((NIL == subloop_structures.method_detail_p(detail)) || (!subloop_structures.md_instance(detail).eql(target))) || (!subloop_structures.md_method_name(detail).eql(monitoring_method))) {
                            new_listeners = cons(listener, new_listeners);
                        }
                        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                        listener = cdolist_list_var_$22.first();
                    } 
                    before_listeners = nreverse(new_listeners);
                    new_listeners = NIL;
                    SubLObject cdolist_list_var_$23 = after_listeners;
                    listener = NIL;
                    listener = cdolist_list_var_$23.first();
                    while (NIL != cdolist_list_var_$23) {
                        final SubLObject method_listener = listener;
                        final SubLObject detail = subloop_structures.ml_detail(method_listener);
                        if (((NIL == subloop_structures.method_detail_p(detail)) || (!subloop_structures.md_instance(detail).eql(target))) || (!subloop_structures.md_method_name(detail).eql(monitoring_method))) {
                            new_listeners = cons(listener, new_listeners);
                        }
                        cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                        listener = cdolist_list_var_$23.first();
                    } 
                    after_listeners = nreverse(new_listeners);
                }
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    subloop_structures._csetf_method_class_name(method_$21, class_name);
                    subloop_structures._csetf_method_before_listeners(method_$21, before_listeners);
                    subloop_structures._csetf_method_after_listeners(method_$21, after_listeners);
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject method_listeners_remove_all_method_listeners(final SubLObject monitored_instance, SubLObject target_class_or_instance, SubLObject method_name) {
        if (target_class_or_instance == UNPROVIDED) {
            target_class_or_instance = NIL;
        }
        if (method_name == UNPROVIDED) {
            method_name = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.class_p(monitored_instance))) && (NIL == subloop_structures.instance_p(monitored_instance))) {
            Errors.error($method_listeners_illegal_class_or_instance_message$.getGlobalValue(), monitored_instance);
        }
        if ((((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != target_class_or_instance)) && (NIL == subloop_structures.class_p(target_class_or_instance))) && (NIL == subloop_structures.instance_p(target_class_or_instance))) {
            Errors.error($method_listeners_illegal_class_or_instance_message$.getGlobalValue(), target_class_or_instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!method_name.isSymbol())) {
            Errors.error($method_listeners_illegal_method_message$.getGlobalValue(), method_name);
        }
        if (NIL != target_class_or_instance) {
            if (NIL != method_name) {
                method_listeners_remove_all_method_listeners_with_target_and_method_internal(monitored_instance, target_class_or_instance, method_name);
            } else {
                method_listeners_remove_all_method_listeners_with_target(monitored_instance, target_class_or_instance);
            }
        } else {
            method_listeners_remove_all_method_listeners_private(monitored_instance);
        }
        return T;
    }

    public static SubLObject method_listeners_filtered_lambda_list(final SubLObject class_instance_or_class_name, final SubLObject method_name) {
        final SubLObject v_class = (NIL != subloop_structures.class_p(class_instance_or_class_name)) ? class_instance_or_class_name : NIL != subloop_structures.instance_p(class_instance_or_class_name) ? subloop_structures.instance_class(class_instance_or_class_name) : class_instance_or_class_name.isSymbol() ? classes.classes_retrieve_class(class_instance_or_class_name) : NIL;
        if (NIL == v_class) {
            return NIL;
        }
        final SubLObject method = methods.methods_get_method(v_class, method_name);
        if (NIL != method) {
            final SubLObject method_$24 = method;
            final SubLObject lambda_list = subloop_structures.method_lambda_list(method_$24);
            return methods.methods_filter_option_words_from_lambda_list(lambda_list);
        }
        return NIL;
    }

    public static SubLObject method_listeners_add_registry(final SubLObject instance_to_modify, final SubLObject registry_type) {
        if (NIL != subloop_structures.instance_p(instance_to_modify)) {
            final SubLObject method_listener_registry;
            final SubLObject new_method_listener_registry = method_listener_registry = subloop_structures.make_method_listener_registry(UNPROVIDED);
            SubLObject instance = subloop_structures.mlr_instance(method_listener_registry);
            SubLObject listener_alist = subloop_structures.mlr_listener_alist(method_listener_registry);
            try {
                instance = instance_to_modify;
                listener_alist = NIL;
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    subloop_structures._csetf_mlr_instance(method_listener_registry, instance);
                    subloop_structures._csetf_mlr_listener_alist(method_listener_registry, listener_alist);
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            instances.instance_set_property(instance_to_modify, registry_type, new_method_listener_registry);
            return new_method_listener_registry;
        }
        return NIL;
    }

    public static SubLObject method_listeners_get_registry(final SubLObject instance, final SubLObject registry_type) {
        if (NIL != subloop_structures.instance_p(instance)) {
            return classes.classes_getf(subloop_structures.instance_plist(instance), registry_type);
        }
        return NIL;
    }

    public static SubLObject method_listeners_find_registry(final SubLObject instance, final SubLObject registry_type) {
        if ((NIL == subloop_structures.instance_p(instance)) || (NIL == method_listeners_valid_registry_type_p(registry_type))) {
            return NIL;
        }
        final SubLObject registry = method_listeners_get_registry(instance, registry_type);
        if (NIL != registry) {
            return registry;
        }
        return method_listeners_add_registry(instance, registry_type);
    }

    public static SubLObject with_instance_method_listener_registry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance = NIL;
        SubLObject registry_type = NIL;
        destructuring_bind_must_consp(current, datum, $list11);
        instance = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        registry_type = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject forms;
            current = forms = temp;
            return listS(WITH_METHOD_LISTENER_REGISTRY, list(METHOD_LISTENERS_FIND_REGISTRY, instance, registry_type), forms);
        }
        cdestructuring_bind_error(datum, $list11);
        return NIL;
    }

    public static SubLObject with_instance_method_listener_registry_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance = NIL;
        SubLObject registry_type = NIL;
        destructuring_bind_must_consp(current, datum, $list11);
        instance = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list11);
        registry_type = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject forms;
            current = forms = temp;
            return listS(WITH_METHOD_LISTENER_REGISTRY_PRIVATE, list(METHOD_LISTENERS_FIND_REGISTRY, instance, registry_type), forms);
        }
        cdestructuring_bind_error(datum, $list11);
        return NIL;
    }

    public static SubLObject method_listeners_add_instance_specific_listener(final SubLObject target_instance, final SubLObject method, final SubLObject type, final SubLObject function_or_method, SubLObject class_or_instance_if_method) {
        if (class_or_instance_if_method == UNPROVIDED) {
            class_or_instance_if_method = NIL;
        }
        return NIL;
    }

    public static SubLObject method_listeners_add_instance_specific_before_listener(final SubLObject instance, final SubLObject method_name, final SubLObject function_or_method, SubLObject class_or_instance_if_method) {
        if (class_or_instance_if_method == UNPROVIDED) {
            class_or_instance_if_method = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subloop_structures.instance_p(instance))) {
            Errors.error($method_listeners_illegal_instance_method$.getGlobalValue(), instance);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == method_name) || (!method_name.isSymbol()))) {
            Errors.error($method_listeners_illegal_method_message$.getGlobalValue(), method_name);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == function_or_method) || (!function_or_method.isSymbol()))) {
            Errors.error($method_listeners_illegal_function_message$.getGlobalValue(), function_or_method);
        }
        method_listeners_add_instance_specific_listener(instance, method_name, $BEFORE, function_or_method, class_or_instance_if_method);
        return NIL;
    }

    public static SubLObject declare_method_listeners_file() {
        declareFunction(me, "method_listeners_valid_demon_type_p", "METHOD-LISTENERS-VALID-DEMON-TYPE-P", 1, 0, false);
        declareFunction(me, "method_listeners_valid_registry_type_p", "METHOD-LISTENERS-VALID-REGISTRY-TYPE-P", 1, 0, false);
        declareFunction(me, "method_listeners_call_listener", "METHOD-LISTENERS-CALL-LISTENER", 3, 1, false);
        declareFunction(me, "new_function_based_method_listener", "NEW-FUNCTION-BASED-METHOD-LISTENER", 4, 0, false);
        declareFunction(me, "new_method_based_method_listener", "NEW-METHOD-BASED-METHOD-LISTENER", 5, 0, false);
        declareFunction(me, "method_listeners_get_listeners", "METHOD-LISTENERS-GET-LISTENERS", 2, 0, false);
        declareFunction(me, "method_listeners_invoke_method_listeners_private", "METHOD-LISTENERS-INVOKE-METHOD-LISTENERS-PRIVATE", 4, 1, false);
        declareFunction(me, "method_listeners_invoke_before_method_listeners", "METHOD-LISTENERS-INVOKE-BEFORE-METHOD-LISTENERS", 3, 0, false);
        declareFunction(me, "method_listeners_invoke_after_method_listeners", "METHOD-LISTENERS-INVOKE-AFTER-METHOD-LISTENERS", 4, 0, false);
        declareFunction(me, "method_listeners_invoke_before_listeners", "METHOD-LISTENERS-INVOKE-BEFORE-LISTENERS", 3, 0, false);
        declareFunction(me, "method_listeners_invoke_after_listeners", "METHOD-LISTENERS-INVOKE-AFTER-LISTENERS", 4, 0, false);
        declareFunction(me, "method_listeners_add_listener", "METHOD-LISTENERS-ADD-LISTENER", 4, 1, false);
        declareFunction(me, "method_listeners_add_before_listener", "METHOD-LISTENERS-ADD-BEFORE-LISTENER", 3, 1, false);
        declareFunction(me, "method_listeners_add_after_listener", "METHOD-LISTENERS-ADD-AFTER-LISTENER", 3, 1, false);
        declareFunction(me, "method_listeners_remove_all_method_listeners_private", "METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS-PRIVATE", 1, 0, false);
        declareFunction(me, "method_listeners_remove_all_method_listeners_with_target", "METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS-WITH-TARGET", 2, 0, false);
        declareFunction(me, "method_listeners_remove_all_method_listeners_with_target_and_method_internal", "METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS-WITH-TARGET-AND-METHOD-INTERNAL", 3, 0, false);
        declareFunction(me, "method_listeners_remove_all_method_listeners", "METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS", 1, 2, false);
        declareFunction(me, "method_listeners_filtered_lambda_list", "METHOD-LISTENERS-FILTERED-LAMBDA-LIST", 2, 0, false);
        declareFunction(me, "method_listeners_add_registry", "METHOD-LISTENERS-ADD-REGISTRY", 2, 0, false);
        declareFunction(me, "method_listeners_get_registry", "METHOD-LISTENERS-GET-REGISTRY", 2, 0, false);
        declareFunction(me, "method_listeners_find_registry", "METHOD-LISTENERS-FIND-REGISTRY", 2, 0, false);
        declareMacro(me, "with_instance_method_listener_registry", "WITH-INSTANCE-METHOD-LISTENER-REGISTRY");
        declareMacro(me, "with_instance_method_listener_registry_private", "WITH-INSTANCE-METHOD-LISTENER-REGISTRY-PRIVATE");
        declareFunction(me, "method_listeners_add_instance_specific_listener", "METHOD-LISTENERS-ADD-INSTANCE-SPECIFIC-LISTENER", 4, 1, false);
        declareFunction(me, "method_listeners_add_instance_specific_before_listener", "METHOD-LISTENERS-ADD-INSTANCE-SPECIFIC-BEFORE-LISTENER", 3, 1, false);
        return NIL;
    }

    public static SubLObject init_method_listeners_file() {
        defconstant("*METHOD-LISTENERS-ILLEGAL-DEMON-TYPE-MESSAGE*", $str0$_S_is_not_a_legal_demon_type___Me);
        defconstant("*METHOD-LISTENERS-ILLEGAL-METHOD-MESSAGE*", $str1$_S_is_not_a_legal_method___A_meth);
        defconstant("*METHOD-LISTENERS-ILLEGAL-FUNCTION-MESSAGE*", $str2$_S_is_not_a_legal_function___A_fu);
        defconstant("*METHOD-LISTENERS-ILLEGAL-CLASS-NAME-MESSAGE*", $str3$_S_is_not_a_legal_class_name___A_);
        defconstant("*METHOD-LISTENERS-ILLEGAL-CLASS-OR-INSTANCE-MESSAGE*", $str4$_S_is_not_a_legal_class_or_instan);
        defconstant("*METHOD-LISTENERS-ILLEGAL-INSTANCE-METHOD*", $str5$_S_is_not_a_legal_instance_);
        defparameter("*METHOD-LISTENERS-DEMON-TYPES*", $list6);
        defparameter("*METHOD-LISTENERS-REGISTRY-TYPES*", $list7);
        return NIL;
    }

    public static SubLObject setup_method_listeners_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_method_listeners_file();
    }

    @Override
    public void initializeVariables() {
        init_method_listeners_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_method_listeners_file();
    }

    static {
























    }
}

/**
 * Total time: 292 ms
 */
