/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.html_utilities;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.object_monitor;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-OBJECT
 *  source file: /cyc/top/cycl/cyblack/cyblack-object.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_object extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_object() {
    }

    public static final SubLFile me = new cyblack_object();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_object";

    // // Definitions
    public static final SubLObject get_cyblack_object_html_indent_by(SubLObject v_cyblack_object) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_object, TWO_INTEGER, HTML_INDENT_BY);
    }

    public static final SubLObject set_cyblack_object_html_indent_by(SubLObject v_cyblack_object, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_object, value, TWO_INTEGER, HTML_INDENT_BY);
    }

    public static final SubLObject get_cyblack_object_application(SubLObject v_cyblack_object) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_object, ONE_INTEGER, APPLICATION);
    }

    public static final SubLObject set_cyblack_object_application(SubLObject v_cyblack_object, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_object, value, ONE_INTEGER, APPLICATION);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_object_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_object_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_object_p(SubLObject v_cyblack_object) {
        return classes.subloop_instanceof_class(v_cyblack_object, CYBLACK_OBJECT);
    }

    public static final SubLObject cyblack_object_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_object_method = NIL;
            SubLObject html_indent_by = get_cyblack_object_html_indent_by(self);
            SubLObject application = get_cyblack_object_application(self);
            try {
                try {
                    object.object_initialize_method(self);
                    application = NIL;
                    html_indent_by = ZERO_INTEGER;
                    sublisp_throw($sym14$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_object_html_indent_by(self, html_indent_by);
                            set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_object_method = Errors.handleThrowable(ccatch_env_var, $sym14$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD);
            }
            return catch_var_for_cyblack_object_method;
        }
    }

    public static final SubLObject cyblack_object_get_application_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_object_method = NIL;
            SubLObject application = get_cyblack_object_application(self);
            try {
                try {
                    sublisp_throw($sym19$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD, application);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_object_method = Errors.handleThrowable(ccatch_env_var, $sym19$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD);
            }
            return catch_var_for_cyblack_object_method;
        }
    }

    public static final SubLObject cyblack_object_set_application_method(SubLObject self, SubLObject new_application) {
        {
            SubLObject catch_var_for_cyblack_object_method = NIL;
            SubLObject application = get_cyblack_object_application(self);
            try {
                try {
                    if (NIL != cyblack_application.cyblack_application_p(self)) {
                    }
                    application = new_application;
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_object_method = Errors.handleThrowable(ccatch_env_var, $sym24$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD);
            }
            return catch_var_for_cyblack_object_method;
        }
    }

    public static final SubLObject cyblack_object_uninstall_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_object_method = NIL;
            SubLObject application = get_cyblack_object_application(self);
            try {
                try {
                    application = NIL;
                    sublisp_throw($sym28$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_object_application(self, application);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_object_method = Errors.handleThrowable(ccatch_env_var, $sym28$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD);
            }
            return catch_var_for_cyblack_object_method;
        }
    }

    public static final SubLObject cyblack_object_on_startup_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_object_on_shutdown_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject cyblack_object_monitor_method(SubLObject self, SubLObject v_object_monitor) {
        if (NIL != object_monitor.object_monitor_p(v_object_monitor)) {
            methods.funcall_instance_method_with_1_args(v_object_monitor, MONITOR, self);
        }
        return NIL;
    }

    public static final SubLObject cyblack_object_unmonitor_method(SubLObject self, SubLObject v_object_monitor) {
        if (NIL != object_monitor.object_monitor_p(v_object_monitor)) {
            methods.funcall_instance_method_with_1_args(v_object_monitor, UNMONITOR, self);
        }
        return NIL;
    }

    public static final SubLObject cyblack_object_get_html_indent_method(SubLObject self) {
        {
            SubLObject html_indent_by = get_cyblack_object_html_indent_by(self);
            return html_indent_by;
        }
    }

    public static final SubLObject cyblack_object_set_html_indent_method(SubLObject self, SubLObject new_indent) {
        {
            SubLObject catch_var_for_cyblack_object_method = NIL;
            SubLObject html_indent_by = get_cyblack_object_html_indent_by(self);
            try {
                try {
                    html_indent_by = new_indent;
                    sublisp_throw($sym49$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD, new_indent);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_object_html_indent_by(self, html_indent_by);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_object_method = Errors.handleThrowable(ccatch_env_var, $sym49$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD);
            }
            return catch_var_for_cyblack_object_method;
        }
    }

    public static final SubLObject cyblack_object_describe_in_html_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_object_method = NIL;
            SubLObject html_indent_by = get_cyblack_object_html_indent_by(self);
            try {
                try {
                    html_utilities.html_indent(html_indent_by);
                    sublisp_throw($sym53$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_object_html_indent_by(self, html_indent_by);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_object_method = Errors.handleThrowable(ccatch_env_var, $sym53$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD);
            }
            return catch_var_for_cyblack_object_method;
        }
    }

    public static final SubLObject declare_cyblack_object_file() {
        declareFunction("get_cyblack_object_html_indent_by", "GET-CYBLACK-OBJECT-HTML-INDENT-BY", 1, 0, false);
        declareFunction("set_cyblack_object_html_indent_by", "SET-CYBLACK-OBJECT-HTML-INDENT-BY", 2, 0, false);
        declareFunction("get_cyblack_object_application", "GET-CYBLACK-OBJECT-APPLICATION", 1, 0, false);
        declareFunction("set_cyblack_object_application", "SET-CYBLACK-OBJECT-APPLICATION", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_object_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-OBJECT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_object_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-OBJECT-INSTANCE", 1, 0, false);
        declareFunction("cyblack_object_p", "CYBLACK-OBJECT-P", 1, 0, false);
        declareFunction("cyblack_object_initialize_method", "CYBLACK-OBJECT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_object_get_application_method", "CYBLACK-OBJECT-GET-APPLICATION-METHOD", 1, 0, false);
        declareFunction("cyblack_object_set_application_method", "CYBLACK-OBJECT-SET-APPLICATION-METHOD", 2, 0, false);
        declareFunction("cyblack_object_uninstall_method", "CYBLACK-OBJECT-UNINSTALL-METHOD", 1, 0, false);
        declareFunction("cyblack_object_on_startup_method", "CYBLACK-OBJECT-ON-STARTUP-METHOD", 1, 0, false);
        declareFunction("cyblack_object_on_shutdown_method", "CYBLACK-OBJECT-ON-SHUTDOWN-METHOD", 1, 0, false);
        declareFunction("cyblack_object_monitor_method", "CYBLACK-OBJECT-MONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_object_unmonitor_method", "CYBLACK-OBJECT-UNMONITOR-METHOD", 2, 0, false);
        declareFunction("cyblack_object_get_html_indent_method", "CYBLACK-OBJECT-GET-HTML-INDENT-METHOD", 1, 0, false);
        declareFunction("cyblack_object_set_html_indent_method", "CYBLACK-OBJECT-SET-HTML-INDENT-METHOD", 2, 0, false);
        declareFunction("cyblack_object_describe_in_html_method", "CYBLACK-OBJECT-DESCRIBE-IN-HTML-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_object_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_object_file() {
                classes.subloop_new_class(CYBLACK_OBJECT, OBJECT, $list_alt2, NIL, $list_alt3);
        classes.class_set_implements_slot_listeners(CYBLACK_OBJECT, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_OBJECT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_OBJECT_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_OBJECT, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_OBJECT_INSTANCE);
        subloop_reserved_initialize_cyblack_object_class(CYBLACK_OBJECT);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_OBJECT, $list_alt12, NIL, $list_alt13);
        methods.subloop_register_instance_method(CYBLACK_OBJECT, INITIALIZE, CYBLACK_OBJECT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_APPLICATION, CYBLACK_OBJECT, $list_alt17, NIL, $list_alt18);
        methods.subloop_register_instance_method(CYBLACK_OBJECT, GET_APPLICATION, CYBLACK_OBJECT_GET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(SET_APPLICATION, CYBLACK_OBJECT, $list_alt17, $list_alt22, $list_alt23);
        methods.subloop_register_instance_method(CYBLACK_OBJECT, SET_APPLICATION, CYBLACK_OBJECT_SET_APPLICATION_METHOD);
        methods.methods_incorporate_instance_method(UNINSTALL, CYBLACK_OBJECT, $list_alt17, NIL, $list_alt27);
        methods.subloop_register_instance_method(CYBLACK_OBJECT, UNINSTALL, CYBLACK_OBJECT_UNINSTALL_METHOD);
        methods.methods_incorporate_instance_method(ON_STARTUP, CYBLACK_OBJECT, $list_alt17, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_OBJECT, ON_STARTUP, CYBLACK_OBJECT_ON_STARTUP_METHOD);
        methods.methods_incorporate_instance_method(ON_SHUTDOWN, CYBLACK_OBJECT, $list_alt17, NIL, $list_alt31);
        methods.subloop_register_instance_method(CYBLACK_OBJECT, ON_SHUTDOWN, CYBLACK_OBJECT_ON_SHUTDOWN_METHOD);
        methods.methods_incorporate_instance_method(MONITOR, CYBLACK_OBJECT, $list_alt17, $list_alt36, $list_alt37);
        methods.subloop_register_instance_method(CYBLACK_OBJECT, MONITOR, CYBLACK_OBJECT_MONITOR_METHOD);
        methods.methods_incorporate_instance_method(UNMONITOR, CYBLACK_OBJECT, $list_alt17, $list_alt36, $list_alt40);
        methods.subloop_register_instance_method(CYBLACK_OBJECT, UNMONITOR, CYBLACK_OBJECT_UNMONITOR_METHOD);
        methods.methods_incorporate_instance_method(GET_HTML_INDENT, CYBLACK_OBJECT, $list_alt43, NIL, $list_alt44);
        methods.subloop_register_instance_method(CYBLACK_OBJECT, GET_HTML_INDENT, CYBLACK_OBJECT_GET_HTML_INDENT_METHOD);
        methods.methods_incorporate_instance_method(SET_HTML_INDENT, CYBLACK_OBJECT, $list_alt17, $list_alt47, $list_alt48);
        methods.subloop_register_instance_method(CYBLACK_OBJECT, SET_HTML_INDENT, CYBLACK_OBJECT_SET_HTML_INDENT_METHOD);
        methods.methods_incorporate_instance_method(DESCRIBE_IN_HTML, CYBLACK_OBJECT, $list_alt17, NIL, $list_alt52);
        methods.subloop_register_instance_method(CYBLACK_OBJECT, DESCRIBE_IN_HTML, CYBLACK_OBJECT_DESCRIBE_IN_HTML_METHOD);
        return NIL;
    }





    static private final SubLList $list_alt2 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt3 = list(new SubLObject[]{ list(makeSymbol("APPLICATION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("HTML-INDENT-BY"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-APPLICATION"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-APPLICATION"), list(makeSymbol("NEW-APPLICATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNINSTALL"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-STARTUP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ON-SHUTDOWN"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MONITOR"), list(makeSymbol("OBJECT-MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("UNMONITOR"), list(makeSymbol("OBJECT-MONITOR")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HTML-INDENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-HTML-INDENT"), list(makeSymbol("NEW-INDENT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DESCRIBE-IN-HTML"), NIL, makeKeyword("PUBLIC")) });







    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_OBJECT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-OBJECT-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_OBJECT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-OBJECT-INSTANCE");



    static private final SubLList $list_alt12 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt13 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("HTML-INDENT-BY"), ZERO_INTEGER), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym14$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-OBJECT-METHOD");

    private static final SubLSymbol CYBLACK_OBJECT_INITIALIZE_METHOD = makeSymbol("CYBLACK-OBJECT-INITIALIZE-METHOD");



    static private final SubLList $list_alt17 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt18 = list(list(RET, makeSymbol("APPLICATION")));

    static private final SubLSymbol $sym19$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-OBJECT-METHOD");

    private static final SubLSymbol CYBLACK_OBJECT_GET_APPLICATION_METHOD = makeSymbol("CYBLACK-OBJECT-GET-APPLICATION-METHOD");



    static private final SubLList $list_alt22 = list(makeSymbol("NEW-APPLICATION"));

    static private final SubLList $list_alt23 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("COR"), list(makeSymbol("NULL"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("NEW-APPLICATION"))), makeString("(SET-APPLICATION ~S): ~S is not a valid cyblack application object."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-APPLICATION-P"), makeSymbol("SELF")), list(makeSymbol("CYBLACK-MUST"), list(EQ, makeSymbol("SELF"), makeSymbol("NEW-APPLICATION")), makeString("(SET-APPLICATION ~S): An application\'s application cannot be set to any application but itself.~%~\n       ~S is not the same application instance as ~S."), makeSymbol("SELF"), makeSymbol("NEW-APPLICATION"), makeSymbol("SELF"))), list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), makeSymbol("NEW-APPLICATION")));

    static private final SubLSymbol $sym24$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-OBJECT-METHOD");

    private static final SubLSymbol CYBLACK_OBJECT_SET_APPLICATION_METHOD = makeSymbol("CYBLACK-OBJECT-SET-APPLICATION-METHOD");



    static private final SubLList $list_alt27 = list(list(makeSymbol("CSETQ"), makeSymbol("APPLICATION"), NIL), list(RET, NIL));

    static private final SubLSymbol $sym28$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-OBJECT-METHOD");

    private static final SubLSymbol CYBLACK_OBJECT_UNINSTALL_METHOD = makeSymbol("CYBLACK-OBJECT-UNINSTALL-METHOD");



    static private final SubLList $list_alt31 = list(list(RET, NIL));

    private static final SubLSymbol CYBLACK_OBJECT_ON_STARTUP_METHOD = makeSymbol("CYBLACK-OBJECT-ON-STARTUP-METHOD");



    private static final SubLSymbol CYBLACK_OBJECT_ON_SHUTDOWN_METHOD = makeSymbol("CYBLACK-OBJECT-ON-SHUTDOWN-METHOD");



    static private final SubLList $list_alt36 = list(makeSymbol("OBJECT-MONITOR"));

    static private final SubLList $list_alt37 = list(list(makeSymbol("PWHEN"), list(makeSymbol("OBJECT-MONITOR-P"), makeSymbol("OBJECT-MONITOR")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OBJECT-MONITOR"), list(QUOTE, makeSymbol("MONITOR")), makeSymbol("SELF"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_OBJECT_MONITOR_METHOD = makeSymbol("CYBLACK-OBJECT-MONITOR-METHOD");



    static private final SubLList $list_alt40 = list(list(makeSymbol("PWHEN"), list(makeSymbol("OBJECT-MONITOR-P"), makeSymbol("OBJECT-MONITOR")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OBJECT-MONITOR"), list(QUOTE, makeSymbol("UNMONITOR")), makeSymbol("SELF"))), list(RET, NIL));

    private static final SubLSymbol CYBLACK_OBJECT_UNMONITOR_METHOD = makeSymbol("CYBLACK-OBJECT-UNMONITOR-METHOD");

    private static final SubLSymbol GET_HTML_INDENT = makeSymbol("GET-HTML-INDENT");

    static private final SubLList $list_alt43 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt44 = list(list(RET, makeSymbol("HTML-INDENT-BY")));

    private static final SubLSymbol CYBLACK_OBJECT_GET_HTML_INDENT_METHOD = makeSymbol("CYBLACK-OBJECT-GET-HTML-INDENT-METHOD");

    private static final SubLSymbol SET_HTML_INDENT = makeSymbol("SET-HTML-INDENT");

    static private final SubLList $list_alt47 = list(makeSymbol("NEW-INDENT"));

    static private final SubLList $list_alt48 = list(list(makeSymbol("CSETQ"), makeSymbol("HTML-INDENT-BY"), makeSymbol("NEW-INDENT")), list(RET, makeSymbol("NEW-INDENT")));

    static private final SubLSymbol $sym49$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-OBJECT-METHOD");

    private static final SubLSymbol CYBLACK_OBJECT_SET_HTML_INDENT_METHOD = makeSymbol("CYBLACK-OBJECT-SET-HTML-INDENT-METHOD");

    private static final SubLSymbol DESCRIBE_IN_HTML = makeSymbol("DESCRIBE-IN-HTML");

    static private final SubLList $list_alt52 = list(list(makeSymbol("HTML-INDENT"), makeSymbol("HTML-INDENT-BY")), list(RET, NIL));

    static private final SubLSymbol $sym53$OUTER_CATCH_FOR_CYBLACK_OBJECT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-OBJECT-METHOD");

    private static final SubLSymbol CYBLACK_OBJECT_DESCRIBE_IN_HTML_METHOD = makeSymbol("CYBLACK-OBJECT-DESCRIBE-IN-HTML-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_object_file();
    }

    public void initializeVariables() {
        init_cyblack_object_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_object_file();
    }
}

