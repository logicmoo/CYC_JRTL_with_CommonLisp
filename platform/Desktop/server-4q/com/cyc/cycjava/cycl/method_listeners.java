package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class method_listeners extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.method_listeners";
    public static final String myFingerPrint = "96756bfc99ad15275fc6b474c999e5ad787e40cef51b6ef8b4aac8510029eabb";
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 655L)
    private static SubLSymbol $method_listeners_illegal_demon_type_message$;
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 1140L)
    private static SubLSymbol $method_listeners_illegal_method_message$;
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 1273L)
    private static SubLSymbol $method_listeners_illegal_function_message$;
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 1412L)
    private static SubLSymbol $method_listeners_illegal_class_name_message$;
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 1557L)
    private static SubLSymbol $method_listeners_illegal_class_or_instance_message$;
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 1676L)
    private static SubLSymbol $method_listeners_illegal_instance_method$;
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 1776L)
    private static SubLSymbol $method_listeners_demon_types$;
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 1985L)
    private static SubLSymbol $method_listeners_registry_types$;
    private static final SubLString $str0$_S_is_not_a_legal_demon_type___Me;
    private static final SubLString $str1$_S_is_not_a_legal_method___A_meth;
    private static final SubLString $str2$_S_is_not_a_legal_function___A_fu;
    private static final SubLString $str3$_S_is_not_a_legal_class_name___A_;
    private static final SubLString $str4$_S_is_not_a_legal_class_or_instan;
    private static final SubLString $str5$_S_is_not_a_legal_instance_;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $kw8$METHOD_LISTENERS_NO_VALUE;
    private static final SubLSymbol $kw9$BEFORE;
    private static final SubLSymbol $kw10$AFTER;
    private static final SubLList $list11;
    private static final SubLSymbol $sym12$WITH_METHOD_LISTENER_REGISTRY;
    private static final SubLSymbol $sym13$METHOD_LISTENERS_FIND_REGISTRY;
    private static final SubLSymbol $sym14$WITH_METHOD_LISTENER_REGISTRY_PRIVATE;
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 1853L)
    public static SubLObject method_listeners_valid_demon_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((method_listeners.NIL != conses_high.member(v_object, method_listeners.$method_listeners_demon_types$.getDynamicValue(thread), (SubLObject)method_listeners.UNPROVIDED, (SubLObject)method_listeners.UNPROVIDED)) ? method_listeners.T : method_listeners.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 2093L)
    public static SubLObject method_listeners_valid_registry_type_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)((method_listeners.NIL != conses_high.member(v_object, method_listeners.$method_listeners_registry_types$.getDynamicValue(thread), (SubLObject)method_listeners.UNPROVIDED, (SubLObject)method_listeners.UNPROVIDED)) ? method_listeners.T : method_listeners.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 2231L)
    public static SubLObject method_listeners_call_listener(final SubLObject method_listener, final SubLObject instance_or_class, final SubLObject args, SubLObject return_value) {
        if (return_value == method_listeners.UNPROVIDED) {
            return_value = (SubLObject)method_listeners.$kw8$METHOD_LISTENERS_NO_VALUE;
        }
        if (method_listeners.NIL != subloop_structures.method_listener_p(method_listener)) {
            final SubLObject owning_method_name = subloop_structures.ml_owning_method_name(method_listener);
            final SubLObject detail = subloop_structures.ml_detail(method_listener);
            if (method_listeners.NIL != subloop_structures.function_detail_p(detail)) {
                final SubLObject function_detail = detail;
                final SubLObject function_name = subloop_structures.fd_function_name(function_detail);
                if (method_listeners.NIL != function_name) {
                    if (return_value == method_listeners.$kw8$METHOD_LISTENERS_NO_VALUE) {
                        Functions.funcall(function_name, instance_or_class, owning_method_name, args);
                    }
                    else {
                        Functions.funcall(function_name, instance_or_class, owning_method_name, args, return_value);
                    }
                    return (SubLObject)method_listeners.T;
                }
            }
            else if (method_listeners.NIL != subloop_structures.method_detail_p(detail)) {
                final SubLObject method_detail = detail;
                final SubLObject method_name = subloop_structures.md_method_name(method_detail);
                final SubLObject function_name2 = subloop_structures.md_function_name(method_detail);
                final SubLObject instance = subloop_structures.md_instance(method_detail);
                if (method_listeners.NIL != function_name2) {
                    if (return_value == method_listeners.$kw8$METHOD_LISTENERS_NO_VALUE) {
                        Functions.funcall(function_name2, instance, instance_or_class, owning_method_name, args);
                    }
                    else {
                        Functions.funcall(function_name2, instance, instance_or_class, owning_method_name, args, return_value);
                    }
                    return (SubLObject)method_listeners.T;
                }
                if (method_listeners.NIL != method_name) {
                    if (method_listeners.NIL != subloop_structures.class_p(instance)) {
                        if (return_value == method_listeners.$kw8$METHOD_LISTENERS_NO_VALUE) {
                            methods.funcall_class_method_with_3_args(instance, method_name, instance_or_class, owning_method_name, args);
                        }
                        else {
                            methods.funcall_class_method_with_4_args(instance, method_name, instance_or_class, owning_method_name, args, return_value);
                        }
                        return (SubLObject)method_listeners.T;
                    }
                    if (method_listeners.NIL != subloop_structures.instance_p(instance)) {
                        if (return_value == method_listeners.$kw8$METHOD_LISTENERS_NO_VALUE) {
                            methods.funcall_instance_method_with_3_args(instance, method_name, instance_or_class, owning_method_name, args);
                        }
                        else {
                            methods.funcall_instance_method_with_4_args(instance, method_name, instance_or_class, owning_method_name, args, return_value);
                        }
                        return (SubLObject)method_listeners.T;
                    }
                }
            }
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 3827L)
    public static SubLObject new_function_based_method_listener(final SubLObject monitored_method, final SubLObject monitored_class, final SubLObject new_demon_type, final SubLObject monitoring_function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == monitored_method || !monitored_method.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_method_message$.getGlobalValue(), monitored_method);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == monitored_class || !monitored_class.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_class_name_message$.getGlobalValue(), monitored_class);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && method_listeners.NIL == method_listeners_valid_demon_type_p(new_demon_type)) {
            Errors.error(method_listeners.$method_listeners_illegal_demon_type_message$.getGlobalValue(), new_demon_type);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == monitoring_function || !monitoring_function.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_function_message$.getGlobalValue(), monitoring_function);
        }
        final SubLObject method_listener = subloop_structures.make_method_listener((SubLObject)method_listeners.UNPROVIDED);
        final SubLObject v_class = classes.classes_retrieve_class(monitored_class);
        final SubLObject method = (SubLObject)((method_listeners.NIL != v_class) ? methods.methods_get_method(v_class, monitored_method) : method_listeners.NIL);
        final SubLObject new_arglist = (SubLObject)((method_listeners.NIL != method) ? methods.methods_lambda_list_to_listed_arg_value_expression(subloop_structures.method_lambda_list(method)) : method_listeners.NIL);
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
            detail = (function_detail = subloop_structures.make_function_detail((SubLObject)method_listeners.UNPROVIDED));
            SubLObject function_name = subloop_structures.fd_function_name(function_detail);
            SubLObject arglist = subloop_structures.fd_arglist(function_detail);
            try {
                function_name = monitoring_function;
                arglist = new_arglist;
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)method_listeners.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_fd_function_name(function_detail, function_name);
                    subloop_structures._csetf_fd_arglist(function_detail, arglist);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)method_listeners.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                subloop_structures._csetf_ml_owning_method_name(method_listener_$2, owning_method_name);
                subloop_structures._csetf_ml_owning_class_name(method_listener_$2, owning_class_name);
                subloop_structures._csetf_ml_demon_type(method_listener_$2, demon_type);
                subloop_structures._csetf_ml_detail(method_listener_$2, detail);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return method_listener;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 5127L)
    public static SubLObject new_method_based_method_listener(final SubLObject monitored_method, final SubLObject monitored_class, final SubLObject new_demon_type, final SubLObject monitoring_method, final SubLObject monitoring_class_or_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == monitored_method || !monitored_method.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_method_message$.getGlobalValue(), monitored_method);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == monitored_class || !monitored_class.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_class_name_message$.getGlobalValue(), monitored_class);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && method_listeners.NIL == method_listeners_valid_demon_type_p(new_demon_type)) {
            Errors.error(method_listeners.$method_listeners_illegal_demon_type_message$.getGlobalValue(), new_demon_type);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == monitoring_method || !monitoring_method.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_method_message$.getGlobalValue(), monitoring_method);
        }
        final SubLObject method_listener = subloop_structures.make_method_listener((SubLObject)method_listeners.UNPROVIDED);
        final SubLObject v_class = classes.classes_retrieve_class(monitored_class);
        final SubLObject method = (SubLObject)((method_listeners.NIL != v_class) ? methods.methods_get_method(v_class, monitored_method) : method_listeners.NIL);
        final SubLObject new_arglist = (SubLObject)((method_listeners.NIL != method) ? methods.methods_lambda_list_to_listed_arg_value_expression(subloop_structures.method_lambda_list(method)) : method_listeners.NIL);
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
            detail = (method_detail = subloop_structures.make_method_detail((SubLObject)method_listeners.UNPROVIDED));
            SubLObject method_name = subloop_structures.md_method_name(method_detail);
            SubLObject function_name = subloop_structures.md_function_name(method_detail);
            SubLObject arglist = subloop_structures.md_arglist(method_detail);
            SubLObject instance = subloop_structures.md_instance(method_detail);
            try {
                method_name = monitoring_method;
                final SubLObject monitoring_class = (SubLObject)((method_listeners.NIL != subloop_structures.class_p(monitoring_class_or_instance)) ? monitoring_class_or_instance : ((method_listeners.NIL != subloop_structures.instance_p(monitoring_class_or_instance)) ? subloop_structures.instance_class(monitoring_class_or_instance) : method_listeners.NIL));
                if (method_listeners.NIL != monitoring_class) {
                    final SubLObject method_$4 = methods.methods_get_method(monitoring_class, monitoring_method);
                    if (method_listeners.NIL != method_$4) {
                        function_name = subloop_structures.method_function_name(method_$4);
                    }
                    else {
                        function_name = (SubLObject)method_listeners.NIL;
                    }
                }
                else {
                    function_name = (SubLObject)method_listeners.NIL;
                }
                arglist = new_arglist;
                instance = monitoring_class_or_instance;
            }
            finally {
                final SubLObject _prev_bind_0 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)method_listeners.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_md_method_name(method_detail, method_name);
                    subloop_structures._csetf_md_function_name(method_detail, function_name);
                    subloop_structures._csetf_md_arglist(method_detail, arglist);
                    subloop_structures._csetf_md_instance(method_detail, instance);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)method_listeners.T, thread);
                final SubLObject _values2 = Values.getValuesAsVector();
                subloop_structures._csetf_ml_owning_method_name(method_listener_$3, owning_method_name);
                subloop_structures._csetf_ml_owning_class_name(method_listener_$3, owning_class_name);
                subloop_structures._csetf_ml_demon_type(method_listener_$3, demon_type);
                subloop_structures._csetf_ml_detail(method_listener_$3, detail);
                Values.restoreValuesFromVector(_values2);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return method_listener;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 7150L)
    public static SubLObject method_listeners_get_listeners(final SubLObject method, final SubLObject type) {
        if (type.eql((SubLObject)method_listeners.$kw9$BEFORE)) {
            return subloop_structures.method_before_listeners(method);
        }
        if (type.eql((SubLObject)method_listeners.$kw10$AFTER)) {
            return subloop_structures.method_after_listeners(method);
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 7358L)
    public static SubLObject method_listeners_invoke_method_listeners_private(final SubLObject method, final SubLObject type, final SubLObject class_or_instance, final SubLObject args, SubLObject return_value) {
        if (return_value == method_listeners.UNPROVIDED) {
            return_value = (SubLObject)method_listeners.$kw8$METHOD_LISTENERS_NO_VALUE;
        }
        final SubLObject v_method_listeners = method_listeners_get_listeners(method, type);
        if (return_value == method_listeners.$kw8$METHOD_LISTENERS_NO_VALUE) {
            SubLObject cdolist_list_var = v_method_listeners;
            SubLObject method_listener = (SubLObject)method_listeners.NIL;
            method_listener = cdolist_list_var.first();
            while (method_listeners.NIL != cdolist_list_var) {
                method_listeners_call_listener(method_listener, class_or_instance, args, (SubLObject)method_listeners.UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                method_listener = cdolist_list_var.first();
            }
        }
        else {
            SubLObject cdolist_list_var = v_method_listeners;
            SubLObject method_listener = (SubLObject)method_listeners.NIL;
            method_listener = cdolist_list_var.first();
            while (method_listeners.NIL != cdolist_list_var) {
                method_listeners_call_listener(method_listener, class_or_instance, args, return_value);
                cdolist_list_var = cdolist_list_var.rest();
                method_listener = cdolist_list_var.first();
            }
        }
        return (SubLObject)method_listeners.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 7917L)
    public static SubLObject method_listeners_invoke_before_method_listeners(final SubLObject method, final SubLObject class_or_instance, final SubLObject args) {
        if (method_listeners.NIL != subloop_structures.method_p(method)) {
            return method_listeners_invoke_method_listeners_private(method, (SubLObject)method_listeners.$kw9$BEFORE, class_or_instance, args, (SubLObject)method_listeners.UNPROVIDED);
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 8247L)
    public static SubLObject method_listeners_invoke_after_method_listeners(final SubLObject method, final SubLObject class_or_instance, final SubLObject args, final SubLObject return_value) {
        if (method_listeners.NIL != subloop_structures.method_p(method)) {
            return method_listeners_invoke_method_listeners_private(method, (SubLObject)method_listeners.$kw10$AFTER, class_or_instance, args, return_value);
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 8601L)
    public static SubLObject method_listeners_invoke_before_listeners(final SubLObject method_name, final SubLObject class_or_instance, final SubLObject args) {
        if (method_name.isSymbol() && args.isList()) {
            if (method_listeners.NIL != subloop_structures.instance_p(class_or_instance)) {
                final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
                if (method_listeners.NIL != subloop_structures.class_p(v_class)) {
                    final SubLObject method = methods.methods_get_method(v_class, method_name);
                    method_listeners_invoke_before_method_listeners(method, class_or_instance, args);
                }
            }
            else {
                if (method_listeners.NIL == subloop_structures.class_p(class_or_instance)) {
                    return (SubLObject)method_listeners.NIL;
                }
                final SubLObject method2 = methods.methods_get_method(class_or_instance, method_name);
                method_listeners_invoke_before_method_listeners(method2, class_or_instance, args);
            }
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 9250L)
    public static SubLObject method_listeners_invoke_after_listeners(final SubLObject method_name, final SubLObject class_or_instance, final SubLObject args, final SubLObject return_value) {
        if (method_name.isSymbol() && args.isList()) {
            if (method_listeners.NIL != subloop_structures.instance_p(class_or_instance)) {
                final SubLObject v_class = subloop_structures.instance_class(class_or_instance);
                if (method_listeners.NIL != subloop_structures.class_p(v_class)) {
                    final SubLObject method = methods.methods_get_method(v_class, method_name);
                    method_listeners_invoke_after_method_listeners(method, class_or_instance, args, return_value);
                }
            }
            else {
                if (method_listeners.NIL == subloop_structures.class_p(class_or_instance)) {
                    return (SubLObject)method_listeners.NIL;
                }
                final SubLObject method2 = methods.methods_get_method(class_or_instance, method_name);
                method_listeners_invoke_after_method_listeners(method2, class_or_instance, args, return_value);
            }
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 9935L)
    public static SubLObject method_listeners_add_listener(final SubLObject class_name, final SubLObject method, final SubLObject type, final SubLObject function_or_method, SubLObject class_or_instance_if_method) {
        if (class_or_instance_if_method == method_listeners.UNPROVIDED) {
            class_or_instance_if_method = (SubLObject)method_listeners.NIL;
        }
        if (type.eql((SubLObject)method_listeners.$kw9$BEFORE)) {
            final SubLObject v_method_listeners = subloop_structures.method_before_listeners(method);
            if (method_listeners.NIL != class_or_instance_if_method) {
                SubLObject cdolist_list_var = v_method_listeners;
                SubLObject method_listener = (SubLObject)method_listeners.NIL;
                method_listener = cdolist_list_var.first();
                while (method_listeners.NIL != cdolist_list_var) {
                    final SubLObject method_listener_$5 = method_listener;
                    final SubLObject owning_class_name = subloop_structures.ml_owning_class_name(method_listener_$5);
                    final SubLObject detail = subloop_structures.ml_detail(method_listener_$5);
                    if (owning_class_name.eql(class_name) && method_listeners.NIL != subloop_structures.method_detail_p(detail)) {
                        final SubLObject method_detail = detail;
                        final SubLObject method_name = subloop_structures.md_method_name(method_detail);
                        final SubLObject instance = subloop_structures.md_instance(method_detail);
                        if (method_name.eql(function_or_method) && instance.eql(class_or_instance_if_method)) {
                            return (SubLObject)method_listeners.NIL;
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    method_listener = cdolist_list_var.first();
                }
                final SubLObject name = subloop_structures.method_name(method);
                final SubLObject class_name_$7 = subloop_structures.method_class_name(method);
                SubLObject before_listeners = subloop_structures.method_before_listeners(method);
                try {
                    before_listeners = ConsesLow.nconc(before_listeners, (SubLObject)ConsesLow.list(new_method_based_method_listener(name, class_name_$7, (SubLObject)method_listeners.$kw9$BEFORE, function_or_method, class_or_instance_if_method)));
                }
                finally {
                    final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)method_listeners.T);
                        final SubLObject _values = Values.getValuesAsVector();
                        subloop_structures._csetf_method_name(method, name);
                        subloop_structures._csetf_method_class_name(method, class_name_$7);
                        subloop_structures._csetf_method_before_listeners(method, before_listeners);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
                return (SubLObject)method_listeners.T;
            }
            SubLObject cdolist_list_var = v_method_listeners;
            SubLObject method_listener = (SubLObject)method_listeners.NIL;
            method_listener = cdolist_list_var.first();
            while (method_listeners.NIL != cdolist_list_var) {
                final SubLObject method_listener_$6 = method_listener;
                final SubLObject owning_class_name = subloop_structures.ml_owning_class_name(method_listener_$6);
                final SubLObject detail = subloop_structures.ml_detail(method_listener_$6);
                if (owning_class_name.eql(class_name) && method_listeners.NIL != subloop_structures.function_detail_p(detail)) {
                    final SubLObject function_detail = detail;
                    final SubLObject function_name = subloop_structures.fd_function_name(function_detail);
                    if (function_name.eql(function_or_method)) {
                        return (SubLObject)method_listeners.NIL;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                method_listener = cdolist_list_var.first();
            }
            final SubLObject name = subloop_structures.method_name(method);
            final SubLObject class_name_$8 = subloop_structures.method_class_name(method);
            SubLObject before_listeners = subloop_structures.method_before_listeners(method);
            try {
                before_listeners = ConsesLow.nconc(before_listeners, (SubLObject)ConsesLow.list(new_function_based_method_listener(name, class_name_$8, (SubLObject)method_listeners.$kw9$BEFORE, function_or_method)));
            }
            finally {
                final SubLObject _prev_bind_2 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)method_listeners.T);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    subloop_structures._csetf_method_name(method, name);
                    subloop_structures._csetf_method_class_name(method, class_name_$8);
                    subloop_structures._csetf_method_before_listeners(method, before_listeners);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_2);
                }
            }
            return (SubLObject)method_listeners.NIL;
        }
        else {
            if (!type.eql((SubLObject)method_listeners.$kw10$AFTER)) {
                return (SubLObject)method_listeners.NIL;
            }
            final SubLObject v_method_listeners = subloop_structures.method_after_listeners(method);
            if (method_listeners.NIL != class_or_instance_if_method) {
                SubLObject cdolist_list_var = v_method_listeners;
                SubLObject method_listener = (SubLObject)method_listeners.NIL;
                method_listener = cdolist_list_var.first();
                while (method_listeners.NIL != cdolist_list_var) {
                    final SubLObject method_listener_$7 = method_listener;
                    final SubLObject owning_class_name = subloop_structures.ml_owning_class_name(method_listener_$7);
                    final SubLObject detail = subloop_structures.ml_detail(method_listener_$7);
                    if (owning_class_name.eql(class_name) && method_listeners.NIL != subloop_structures.method_detail_p(detail)) {
                        final SubLObject method_detail = detail;
                        final SubLObject method_name = subloop_structures.md_method_name(method_detail);
                        final SubLObject instance = subloop_structures.md_instance(method_detail);
                        if (method_name.eql(function_or_method) && instance.eql(class_or_instance_if_method)) {
                            return (SubLObject)method_listeners.NIL;
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    method_listener = cdolist_list_var.first();
                }
                final SubLObject name = subloop_structures.method_name(method);
                final SubLObject class_name_$9 = subloop_structures.method_class_name(method);
                SubLObject after_listeners = subloop_structures.method_after_listeners(method);
                try {
                    after_listeners = (SubLObject)ConsesLow.cons(new_method_based_method_listener(name, class_name_$9, (SubLObject)method_listeners.$kw10$AFTER, function_or_method, class_or_instance_if_method), after_listeners);
                }
                finally {
                    final SubLObject _prev_bind_3 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                    try {
                        Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)method_listeners.T);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        subloop_structures._csetf_method_name(method, name);
                        subloop_structures._csetf_method_class_name(method, class_name_$9);
                        subloop_structures._csetf_method_after_listeners(method, after_listeners);
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_3);
                    }
                }
                return (SubLObject)method_listeners.T;
            }
            SubLObject cdolist_list_var = v_method_listeners;
            SubLObject method_listener = (SubLObject)method_listeners.NIL;
            method_listener = cdolist_list_var.first();
            while (method_listeners.NIL != cdolist_list_var) {
                final SubLObject method_listener_$8 = method_listener;
                final SubLObject owning_class_name = subloop_structures.ml_owning_class_name(method_listener_$8);
                final SubLObject detail = subloop_structures.ml_detail(method_listener_$8);
                if (owning_class_name.eql(class_name) && method_listeners.NIL != subloop_structures.function_detail_p(detail)) {
                    final SubLObject function_detail = detail;
                    final SubLObject function_name = subloop_structures.fd_function_name(function_detail);
                    if (function_name.eql(function_or_method)) {
                        return (SubLObject)method_listeners.NIL;
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                method_listener = cdolist_list_var.first();
            }
            final SubLObject class_name_$10 = subloop_structures.method_class_name(method);
            SubLObject after_listeners2 = subloop_structures.method_after_listeners(method);
            try {
                after_listeners2 = (SubLObject)ConsesLow.cons(new_function_based_method_listener(method, class_name_$10, (SubLObject)method_listeners.$kw10$AFTER, function_or_method), after_listeners2);
            }
            finally {
                final SubLObject _prev_bind_4 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)method_listeners.T);
                    final SubLObject _values4 = Values.getValuesAsVector();
                    subloop_structures._csetf_method_class_name(method, class_name_$10);
                    subloop_structures._csetf_method_after_listeners(method, after_listeners2);
                    Values.restoreValuesFromVector(_values4);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_4);
                }
            }
            return (SubLObject)method_listeners.T;
        }
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 13108L)
    public static SubLObject method_listeners_add_before_listener(final SubLObject class_name, final SubLObject method_name, final SubLObject function_or_method, SubLObject class_or_instance_if_method) {
        if (class_or_instance_if_method == method_listeners.UNPROVIDED) {
            class_or_instance_if_method = (SubLObject)method_listeners.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == class_name || !class_name.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_class_name_message$.getGlobalValue(), class_name);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == method_name || !method_name.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_method_message$.getGlobalValue(), method_name);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == function_or_method || !function_or_method.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_function_message$.getGlobalValue(), function_or_method);
        }
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        if (method_listeners.NIL != v_class) {
            final SubLObject method = methods.methods_get_method(v_class, method_name);
            if (method_listeners.NIL != method) {
                return method_listeners_add_listener(class_name, method, (SubLObject)method_listeners.$kw9$BEFORE, function_or_method, class_or_instance_if_method);
            }
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 13882L)
    public static SubLObject method_listeners_add_after_listener(final SubLObject class_name, final SubLObject method_name, final SubLObject function_or_method, SubLObject class_or_instance_if_method) {
        if (class_or_instance_if_method == method_listeners.UNPROVIDED) {
            class_or_instance_if_method = (SubLObject)method_listeners.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == class_name || !class_name.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_class_name_message$.getGlobalValue(), class_name);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == method_name || !method_name.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_method_message$.getGlobalValue(), method_name);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == function_or_method || !function_or_method.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_function_message$.getGlobalValue(), function_or_method);
        }
        final SubLObject v_class = classes.classes_retrieve_class(class_name);
        if (method_listeners.NIL != v_class) {
            final SubLObject method = methods.methods_get_method(v_class, method_name);
            if (method_listeners.NIL != method) {
                return method_listeners_add_listener(class_name, method, (SubLObject)method_listeners.$kw10$AFTER, function_or_method, class_or_instance_if_method);
            }
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 14654L)
    public static SubLObject method_listeners_remove_all_method_listeners_private(final SubLObject monitored_instance) {
        final SubLObject monitored_class = (method_listeners.NIL != subloop_structures.class_p(monitored_instance)) ? monitored_instance : subloop_structures.instance_class(monitored_instance);
        final SubLObject monitored_class_name = subloop_structures.class_name(monitored_class);
        final SubLObject v_class = monitored_class;
        SubLObject cdolist_list_var;
        final SubLObject compiled_instance_method_access_alist = cdolist_list_var = subloop_structures.class_compiled_instance_method_access_alist(v_class);
        SubLObject method = (SubLObject)method_listeners.NIL;
        method = cdolist_list_var.first();
        while (method_listeners.NIL != cdolist_list_var) {
            final SubLObject method_$17 = method;
            final SubLObject class_name = subloop_structures.method_class_name(method_$17);
            SubLObject before_listeners = subloop_structures.method_before_listeners(method_$17);
            SubLObject after_listeners = subloop_structures.method_after_listeners(method_$17);
            try {
                if (monitored_class_name.eql(class_name)) {
                    before_listeners = (SubLObject)method_listeners.NIL;
                    after_listeners = (SubLObject)method_listeners.NIL;
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)method_listeners.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_method_class_name(method_$17, class_name);
                    subloop_structures._csetf_method_before_listeners(method_$17, before_listeners);
                    subloop_structures._csetf_method_after_listeners(method_$17, after_listeners);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return (SubLObject)method_listeners.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 15192L)
    public static SubLObject method_listeners_remove_all_method_listeners_with_target(final SubLObject monitored_instance, final SubLObject target) {
        final SubLObject monitored_class = (method_listeners.NIL != subloop_structures.class_p(monitored_instance)) ? monitored_instance : subloop_structures.instance_class(monitored_instance);
        final SubLObject monitored_class_name = subloop_structures.class_name(monitored_class);
        final SubLObject v_class = monitored_class;
        SubLObject cdolist_list_var;
        final SubLObject compiled_instance_method_access_alist = cdolist_list_var = subloop_structures.class_compiled_instance_method_access_alist(v_class);
        SubLObject method = (SubLObject)method_listeners.NIL;
        method = cdolist_list_var.first();
        while (method_listeners.NIL != cdolist_list_var) {
            final SubLObject method_$18 = method;
            final SubLObject class_name = subloop_structures.method_class_name(method_$18);
            SubLObject before_listeners = subloop_structures.method_before_listeners(method_$18);
            SubLObject after_listeners = subloop_structures.method_after_listeners(method_$18);
            try {
                if (monitored_class_name.eql(class_name)) {
                    SubLObject new_listeners = (SubLObject)method_listeners.NIL;
                    new_listeners = (SubLObject)method_listeners.NIL;
                    SubLObject cdolist_list_var_$19 = before_listeners;
                    SubLObject listener = (SubLObject)method_listeners.NIL;
                    listener = cdolist_list_var_$19.first();
                    while (method_listeners.NIL != cdolist_list_var_$19) {
                        final SubLObject method_listener = listener;
                        final SubLObject detail = subloop_structures.ml_detail(method_listener);
                        if (method_listeners.NIL == subloop_structures.method_detail_p(detail) || !subloop_structures.md_instance(detail).eql(target)) {
                            new_listeners = (SubLObject)ConsesLow.cons(listener, new_listeners);
                        }
                        cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                        listener = cdolist_list_var_$19.first();
                    }
                    before_listeners = Sequences.nreverse(new_listeners);
                    new_listeners = (SubLObject)method_listeners.NIL;
                    SubLObject cdolist_list_var_$20 = after_listeners;
                    listener = (SubLObject)method_listeners.NIL;
                    listener = cdolist_list_var_$20.first();
                    while (method_listeners.NIL != cdolist_list_var_$20) {
                        final SubLObject method_listener = listener;
                        final SubLObject detail = subloop_structures.ml_detail(method_listener);
                        if (method_listeners.NIL == subloop_structures.method_detail_p(detail) || !subloop_structures.md_instance(detail).eql(target)) {
                            new_listeners = (SubLObject)ConsesLow.cons(listener, new_listeners);
                        }
                        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                        listener = cdolist_list_var_$20.first();
                    }
                    after_listeners = Sequences.nreverse(new_listeners);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)method_listeners.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_method_class_name(method_$18, class_name);
                    subloop_structures._csetf_method_before_listeners(method_$18, before_listeners);
                    subloop_structures._csetf_method_after_listeners(method_$18, after_listeners);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return (SubLObject)method_listeners.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 16287L)
    public static SubLObject method_listeners_remove_all_method_listeners_with_target_and_method_internal(final SubLObject monitored_instance, final SubLObject target, final SubLObject monitoring_method) {
        final SubLObject monitored_class = (method_listeners.NIL != subloop_structures.class_p(monitored_instance)) ? monitored_instance : subloop_structures.instance_class(monitored_instance);
        final SubLObject monitored_class_name = subloop_structures.class_name(monitored_class);
        final SubLObject v_class = monitored_class;
        SubLObject cdolist_list_var;
        final SubLObject compiled_instance_method_access_alist = cdolist_list_var = subloop_structures.class_compiled_instance_method_access_alist(v_class);
        SubLObject method = (SubLObject)method_listeners.NIL;
        method = cdolist_list_var.first();
        while (method_listeners.NIL != cdolist_list_var) {
            final SubLObject method_$21 = method;
            final SubLObject class_name = subloop_structures.method_class_name(method_$21);
            SubLObject before_listeners = subloop_structures.method_before_listeners(method_$21);
            SubLObject after_listeners = subloop_structures.method_after_listeners(method_$21);
            try {
                if (monitored_class_name.eql(class_name)) {
                    SubLObject new_listeners = (SubLObject)method_listeners.NIL;
                    new_listeners = (SubLObject)method_listeners.NIL;
                    SubLObject cdolist_list_var_$22 = before_listeners;
                    SubLObject listener = (SubLObject)method_listeners.NIL;
                    listener = cdolist_list_var_$22.first();
                    while (method_listeners.NIL != cdolist_list_var_$22) {
                        final SubLObject method_listener = listener;
                        final SubLObject detail = subloop_structures.ml_detail(method_listener);
                        if (method_listeners.NIL == subloop_structures.method_detail_p(detail) || !subloop_structures.md_instance(detail).eql(target) || !subloop_structures.md_method_name(detail).eql(monitoring_method)) {
                            new_listeners = (SubLObject)ConsesLow.cons(listener, new_listeners);
                        }
                        cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                        listener = cdolist_list_var_$22.first();
                    }
                    before_listeners = Sequences.nreverse(new_listeners);
                    new_listeners = (SubLObject)method_listeners.NIL;
                    SubLObject cdolist_list_var_$23 = after_listeners;
                    listener = (SubLObject)method_listeners.NIL;
                    listener = cdolist_list_var_$23.first();
                    while (method_listeners.NIL != cdolist_list_var_$23) {
                        final SubLObject method_listener = listener;
                        final SubLObject detail = subloop_structures.ml_detail(method_listener);
                        if (method_listeners.NIL == subloop_structures.method_detail_p(detail) || !subloop_structures.md_instance(detail).eql(target) || !subloop_structures.md_method_name(detail).eql(monitoring_method)) {
                            new_listeners = (SubLObject)ConsesLow.cons(listener, new_listeners);
                        }
                        cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                        listener = cdolist_list_var_$23.first();
                    }
                    after_listeners = Sequences.nreverse(new_listeners);
                }
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)method_listeners.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_method_class_name(method_$21, class_name);
                    subloop_structures._csetf_method_before_listeners(method_$21, before_listeners);
                    subloop_structures._csetf_method_after_listeners(method_$21, after_listeners);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        }
        return (SubLObject)method_listeners.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 17528L)
    public static SubLObject method_listeners_remove_all_method_listeners(final SubLObject monitored_instance, SubLObject target_class_or_instance, SubLObject method_name) {
        if (target_class_or_instance == method_listeners.UNPROVIDED) {
            target_class_or_instance = (SubLObject)method_listeners.NIL;
        }
        if (method_name == method_listeners.UNPROVIDED) {
            method_name = (SubLObject)method_listeners.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && method_listeners.NIL == subloop_structures.class_p(monitored_instance) && method_listeners.NIL == subloop_structures.instance_p(monitored_instance)) {
            Errors.error(method_listeners.$method_listeners_illegal_class_or_instance_message$.getGlobalValue(), monitored_instance);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && method_listeners.NIL != target_class_or_instance && method_listeners.NIL == subloop_structures.class_p(target_class_or_instance) && method_listeners.NIL == subloop_structures.instance_p(target_class_or_instance)) {
            Errors.error(method_listeners.$method_listeners_illegal_class_or_instance_message$.getGlobalValue(), target_class_or_instance);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !method_name.isSymbol()) {
            Errors.error(method_listeners.$method_listeners_illegal_method_message$.getGlobalValue(), method_name);
        }
        if (method_listeners.NIL != target_class_or_instance) {
            if (method_listeners.NIL != method_name) {
                method_listeners_remove_all_method_listeners_with_target_and_method_internal(monitored_instance, target_class_or_instance, method_name);
            }
            else {
                method_listeners_remove_all_method_listeners_with_target(monitored_instance, target_class_or_instance);
            }
        }
        else {
            method_listeners_remove_all_method_listeners_private(monitored_instance);
        }
        return (SubLObject)method_listeners.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 18550L)
    public static SubLObject method_listeners_filtered_lambda_list(final SubLObject class_instance_or_class_name, final SubLObject method_name) {
        final SubLObject v_class = (SubLObject)((method_listeners.NIL != subloop_structures.class_p(class_instance_or_class_name)) ? class_instance_or_class_name : ((method_listeners.NIL != subloop_structures.instance_p(class_instance_or_class_name)) ? subloop_structures.instance_class(class_instance_or_class_name) : (class_instance_or_class_name.isSymbol() ? classes.classes_retrieve_class(class_instance_or_class_name) : method_listeners.NIL)));
        if (method_listeners.NIL == v_class) {
            return (SubLObject)method_listeners.NIL;
        }
        final SubLObject method = methods.methods_get_method(v_class, method_name);
        if (method_listeners.NIL != method) {
            final SubLObject method_$24 = method;
            final SubLObject lambda_list = subloop_structures.method_lambda_list(method_$24);
            return methods.methods_filter_option_words_from_lambda_list(lambda_list);
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 19190L)
    public static SubLObject method_listeners_add_registry(final SubLObject instance_to_modify, final SubLObject registry_type) {
        if (method_listeners.NIL != subloop_structures.instance_p(instance_to_modify)) {
            final SubLObject method_listener_registry;
            final SubLObject new_method_listener_registry = method_listener_registry = subloop_structures.make_method_listener_registry((SubLObject)method_listeners.UNPROVIDED);
            SubLObject instance = subloop_structures.mlr_instance(method_listener_registry);
            SubLObject listener_alist = subloop_structures.mlr_listener_alist(method_listener_registry);
            try {
                instance = instance_to_modify;
                listener_alist = (SubLObject)method_listeners.NIL;
            }
            finally {
                final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
                try {
                    Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)method_listeners.T);
                    final SubLObject _values = Values.getValuesAsVector();
                    subloop_structures._csetf_mlr_instance(method_listener_registry, instance);
                    subloop_structures._csetf_mlr_listener_alist(method_listener_registry, listener_alist);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            instances.instance_set_property(instance_to_modify, registry_type, new_method_listener_registry);
            return new_method_listener_registry;
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 19765L)
    public static SubLObject method_listeners_get_registry(final SubLObject instance, final SubLObject registry_type) {
        if (method_listeners.NIL != subloop_structures.instance_p(instance)) {
            return classes.classes_getf(subloop_structures.instance_plist(instance), registry_type);
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 19950L)
    public static SubLObject method_listeners_find_registry(final SubLObject instance, final SubLObject registry_type) {
        if (method_listeners.NIL == subloop_structures.instance_p(instance) || method_listeners.NIL == method_listeners_valid_registry_type_p(registry_type)) {
            return (SubLObject)method_listeners.NIL;
        }
        final SubLObject registry = method_listeners_get_registry(instance, registry_type);
        if (method_listeners.NIL != registry) {
            return registry;
        }
        return method_listeners_add_registry(instance, registry_type);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 20316L)
    public static SubLObject with_instance_method_listener_registry(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)method_listeners.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance = (SubLObject)method_listeners.NIL;
        SubLObject registry_type = (SubLObject)method_listeners.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)method_listeners.$list11);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)method_listeners.$list11);
        registry_type = current.first();
        current = current.rest();
        if (method_listeners.NIL == current) {
            final SubLObject forms;
            current = (forms = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)method_listeners.$sym12$WITH_METHOD_LISTENER_REGISTRY, (SubLObject)ConsesLow.list((SubLObject)method_listeners.$sym13$METHOD_LISTENERS_FIND_REGISTRY, instance, registry_type), forms);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)method_listeners.$list11);
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 20517L)
    public static SubLObject with_instance_method_listener_registry_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)method_listeners.$list11);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance = (SubLObject)method_listeners.NIL;
        SubLObject registry_type = (SubLObject)method_listeners.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)method_listeners.$list11);
        instance = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)method_listeners.$list11);
        registry_type = current.first();
        current = current.rest();
        if (method_listeners.NIL == current) {
            final SubLObject forms;
            current = (forms = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)method_listeners.$sym14$WITH_METHOD_LISTENER_REGISTRY_PRIVATE, (SubLObject)ConsesLow.list((SubLObject)method_listeners.$sym13$METHOD_LISTENERS_FIND_REGISTRY, instance, registry_type), forms);
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)method_listeners.$list11);
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 20734L)
    public static SubLObject method_listeners_add_instance_specific_listener(final SubLObject target_instance, final SubLObject method, final SubLObject type, final SubLObject function_or_method, SubLObject class_or_instance_if_method) {
        if (class_or_instance_if_method == method_listeners.UNPROVIDED) {
            class_or_instance_if_method = (SubLObject)method_listeners.NIL;
        }
        return (SubLObject)method_listeners.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/method-listeners.lisp", position = 21009L)
    public static SubLObject method_listeners_add_instance_specific_before_listener(final SubLObject instance, final SubLObject method_name, final SubLObject function_or_method, SubLObject class_or_instance_if_method) {
        if (class_or_instance_if_method == method_listeners.UNPROVIDED) {
            class_or_instance_if_method = (SubLObject)method_listeners.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && method_listeners.NIL == subloop_structures.instance_p(instance)) {
            Errors.error(method_listeners.$method_listeners_illegal_instance_method$.getGlobalValue(), instance);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == method_name || !method_name.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_method_message$.getGlobalValue(), method_name);
        }
        if (method_listeners.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && (method_listeners.NIL == function_or_method || !function_or_method.isSymbol())) {
            Errors.error(method_listeners.$method_listeners_illegal_function_message$.getGlobalValue(), function_or_method);
        }
        method_listeners_add_instance_specific_listener(instance, method_name, (SubLObject)method_listeners.$kw9$BEFORE, function_or_method, class_or_instance_if_method);
        return (SubLObject)method_listeners.NIL;
    }
    
    public static SubLObject declare_method_listeners_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_valid_demon_type_p", "METHOD-LISTENERS-VALID-DEMON-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_valid_registry_type_p", "METHOD-LISTENERS-VALID-REGISTRY-TYPE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_call_listener", "METHOD-LISTENERS-CALL-LISTENER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "new_function_based_method_listener", "NEW-FUNCTION-BASED-METHOD-LISTENER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "new_method_based_method_listener", "NEW-METHOD-BASED-METHOD-LISTENER", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_get_listeners", "METHOD-LISTENERS-GET-LISTENERS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_invoke_method_listeners_private", "METHOD-LISTENERS-INVOKE-METHOD-LISTENERS-PRIVATE", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_invoke_before_method_listeners", "METHOD-LISTENERS-INVOKE-BEFORE-METHOD-LISTENERS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_invoke_after_method_listeners", "METHOD-LISTENERS-INVOKE-AFTER-METHOD-LISTENERS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_invoke_before_listeners", "METHOD-LISTENERS-INVOKE-BEFORE-LISTENERS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_invoke_after_listeners", "METHOD-LISTENERS-INVOKE-AFTER-LISTENERS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_add_listener", "METHOD-LISTENERS-ADD-LISTENER", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_add_before_listener", "METHOD-LISTENERS-ADD-BEFORE-LISTENER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_add_after_listener", "METHOD-LISTENERS-ADD-AFTER-LISTENER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_remove_all_method_listeners_private", "METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS-PRIVATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_remove_all_method_listeners_with_target", "METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS-WITH-TARGET", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_remove_all_method_listeners_with_target_and_method_internal", "METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS-WITH-TARGET-AND-METHOD-INTERNAL", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_remove_all_method_listeners", "METHOD-LISTENERS-REMOVE-ALL-METHOD-LISTENERS", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_filtered_lambda_list", "METHOD-LISTENERS-FILTERED-LAMBDA-LIST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_add_registry", "METHOD-LISTENERS-ADD-REGISTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_get_registry", "METHOD-LISTENERS-GET-REGISTRY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_find_registry", "METHOD-LISTENERS-FIND-REGISTRY", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.method_listeners", "with_instance_method_listener_registry", "WITH-INSTANCE-METHOD-LISTENER-REGISTRY");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.method_listeners", "with_instance_method_listener_registry_private", "WITH-INSTANCE-METHOD-LISTENER-REGISTRY-PRIVATE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_add_instance_specific_listener", "METHOD-LISTENERS-ADD-INSTANCE-SPECIFIC-LISTENER", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.method_listeners", "method_listeners_add_instance_specific_before_listener", "METHOD-LISTENERS-ADD-INSTANCE-SPECIFIC-BEFORE-LISTENER", 3, 1, false);
        return (SubLObject)method_listeners.NIL;
    }
    
    public static SubLObject init_method_listeners_file() {
        method_listeners.$method_listeners_illegal_demon_type_message$ = SubLFiles.defconstant("*METHOD-LISTENERS-ILLEGAL-DEMON-TYPE-MESSAGE*", (SubLObject)method_listeners.$str0$_S_is_not_a_legal_demon_type___Me);
        method_listeners.$method_listeners_illegal_method_message$ = SubLFiles.defconstant("*METHOD-LISTENERS-ILLEGAL-METHOD-MESSAGE*", (SubLObject)method_listeners.$str1$_S_is_not_a_legal_method___A_meth);
        method_listeners.$method_listeners_illegal_function_message$ = SubLFiles.defconstant("*METHOD-LISTENERS-ILLEGAL-FUNCTION-MESSAGE*", (SubLObject)method_listeners.$str2$_S_is_not_a_legal_function___A_fu);
        method_listeners.$method_listeners_illegal_class_name_message$ = SubLFiles.defconstant("*METHOD-LISTENERS-ILLEGAL-CLASS-NAME-MESSAGE*", (SubLObject)method_listeners.$str3$_S_is_not_a_legal_class_name___A_);
        method_listeners.$method_listeners_illegal_class_or_instance_message$ = SubLFiles.defconstant("*METHOD-LISTENERS-ILLEGAL-CLASS-OR-INSTANCE-MESSAGE*", (SubLObject)method_listeners.$str4$_S_is_not_a_legal_class_or_instan);
        method_listeners.$method_listeners_illegal_instance_method$ = SubLFiles.defconstant("*METHOD-LISTENERS-ILLEGAL-INSTANCE-METHOD*", (SubLObject)method_listeners.$str5$_S_is_not_a_legal_instance_);
        method_listeners.$method_listeners_demon_types$ = SubLFiles.defparameter("*METHOD-LISTENERS-DEMON-TYPES*", (SubLObject)method_listeners.$list6);
        method_listeners.$method_listeners_registry_types$ = SubLFiles.defparameter("*METHOD-LISTENERS-REGISTRY-TYPES*", (SubLObject)method_listeners.$list7);
        return (SubLObject)method_listeners.NIL;
    }
    
    public static SubLObject setup_method_listeners_file() {
        return (SubLObject)method_listeners.NIL;
    }
    
    public void declareFunctions() {
        declare_method_listeners_file();
    }
    
    public void initializeVariables() {
        init_method_listeners_file();
    }
    
    public void runTopLevelForms() {
        setup_method_listeners_file();
    }
    
    static {
        me = (SubLFile)new method_listeners();
        method_listeners.$method_listeners_illegal_demon_type_message$ = null;
        method_listeners.$method_listeners_illegal_method_message$ = null;
        method_listeners.$method_listeners_illegal_function_message$ = null;
        method_listeners.$method_listeners_illegal_class_name_message$ = null;
        method_listeners.$method_listeners_illegal_class_or_instance_message$ = null;
        method_listeners.$method_listeners_illegal_instance_method$ = null;
        method_listeners.$method_listeners_demon_types$ = null;
        method_listeners.$method_listeners_registry_types$ = null;
        $str0$_S_is_not_a_legal_demon_type___Me = SubLObjectFactory.makeString("~S is not a legal demon type.  Method listener demon types must be one of :before or :after.");
        $str1$_S_is_not_a_legal_method___A_meth = SubLObjectFactory.makeString("~S is not a legal method.  A method must be a non-nil symbol.");
        $str2$_S_is_not_a_legal_function___A_fu = SubLObjectFactory.makeString("~S is not a legal function.  A function must be a non-nil symbol.");
        $str3$_S_is_not_a_legal_class_name___A_ = SubLObjectFactory.makeString("~S is not a legal class name.  A class name must be a non-nil symbol.");
        $str4$_S_is_not_a_legal_class_or_instan = SubLObjectFactory.makeString("~S is not a legal class or instance.");
        $str5$_S_is_not_a_legal_instance_ = SubLObjectFactory.makeString("~S is not a legal instance.");
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BEFORE"), (SubLObject)SubLObjectFactory.makeKeyword("AFTER"));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BEFORE-METHOD-REGISTRY"), (SubLObject)SubLObjectFactory.makeKeyword("AFTER-METHOD-REGISTRY"));
        $kw8$METHOD_LISTENERS_NO_VALUE = SubLObjectFactory.makeKeyword("METHOD-LISTENERS-NO-VALUE");
        $kw9$BEFORE = SubLObjectFactory.makeKeyword("BEFORE");
        $kw10$AFTER = SubLObjectFactory.makeKeyword("AFTER");
        $list11 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeSymbol("REGISTRY-TYPE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("FORMS"));
        $sym12$WITH_METHOD_LISTENER_REGISTRY = SubLObjectFactory.makeSymbol("WITH-METHOD-LISTENER-REGISTRY");
        $sym13$METHOD_LISTENERS_FIND_REGISTRY = SubLObjectFactory.makeSymbol("METHOD-LISTENERS-FIND-REGISTRY");
        $sym14$WITH_METHOD_LISTENER_REGISTRY_PRIVATE = SubLObjectFactory.makeSymbol("WITH-METHOD-LISTENER-REGISTRY-PRIVATE");
    }
}

/*

	Total time: 292 ms
	
*/