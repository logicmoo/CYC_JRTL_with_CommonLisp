/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-ACTIVATION-PATTERN
 *  source file: /cyc/top/cycl/cyblack/cyblack-activation-pattern.lisp
 *  created:     2019/07/03 17:38:46
 */
public final class cyblack_activation_pattern extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_activation_pattern() {
    }

    public static final SubLFile me = new cyblack_activation_pattern();


    // // Definitions
    public static final SubLObject cyblack_activation_pattern_p(SubLObject v_cyblack_activation_pattern) {
        return interfaces.subloop_instanceof_interface(v_cyblack_activation_pattern, CYBLACK_ACTIVATION_PATTERN);
    }

    public static final SubLObject get_cyblack_basic_activation_pattern_environment(SubLObject cyblack_basic_activation_pattern) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_activation_pattern, THREE_INTEGER, ENVIRONMENT);
    }

    public static final SubLObject set_cyblack_basic_activation_pattern_environment(SubLObject cyblack_basic_activation_pattern, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_activation_pattern, value, THREE_INTEGER, ENVIRONMENT);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_activation_pattern_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_activation_pattern_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_ACTIVATION_PATTERN, ENVIRONMENT, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_activation_pattern_p(SubLObject cyblack_basic_activation_pattern) {
        return classes.subloop_instanceof_class(cyblack_basic_activation_pattern, CYBLACK_BASIC_ACTIVATION_PATTERN);
    }

    public static final SubLObject cyblack_basic_activation_pattern_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_activation_pattern_method = NIL;
            SubLObject environment = get_cyblack_basic_activation_pattern_environment(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    environment = NIL;
                    sublisp_throw($sym20$OUTER_CATCH_FOR_CYBLACK_BASIC_ACTIVATION_PATTERN_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_activation_pattern_environment(self, environment);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_activation_pattern_method = Errors.handleThrowable(ccatch_env_var, $sym20$OUTER_CATCH_FOR_CYBLACK_BASIC_ACTIVATION_PATTERN_METHOD);
            }
            return catch_var_for_cyblack_basic_activation_pattern_method;
        }
    }

    public static final SubLObject cyblack_basic_activation_pattern_clone_method(SubLObject self) {
        {
            SubLObject copy_of_self = cyblack_basic_activation_pattern_clone_method(self);
            return copy_of_self;
        }
    }

    public static final SubLObject cyblack_basic_activation_pattern_get_value_method(SubLObject self, SubLObject variable) {
        {
            SubLObject catch_var_for_cyblack_basic_activation_pattern_method = NIL;
            SubLObject environment = get_cyblack_basic_activation_pattern_environment(self);
            try {
                try {
                    if (NIL != environment) {
                        sublisp_throw($sym29$OUTER_CATCH_FOR_CYBLACK_BASIC_ACTIVATION_PATTERN_METHOD, cyblack_precondition_pattern.cyblack_environment_get_method(environment, variable, UNPROVIDED));
                    } else {
                        sublisp_throw($sym29$OUTER_CATCH_FOR_CYBLACK_BASIC_ACTIVATION_PATTERN_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_activation_pattern_environment(self, environment);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_activation_pattern_method = Errors.handleThrowable(ccatch_env_var, $sym29$OUTER_CATCH_FOR_CYBLACK_BASIC_ACTIVATION_PATTERN_METHOD);
            }
            return catch_var_for_cyblack_basic_activation_pattern_method;
        }
    }

    public static final SubLObject cyblack_basic_activation_pattern_get_variables_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_activation_pattern_method = NIL;
            SubLObject environment = get_cyblack_basic_activation_pattern_environment(self);
            try {
                try {
                    {
                        SubLObject listed_bindings = (NIL != environment) ? ((SubLObject) (cyblack_precondition_pattern.cyblack_environment_listify_local_bindings_method(environment))) : NIL;
                        if (NIL != listed_bindings) {
                            {
                                SubLObject v_variables = NIL;
                                SubLObject list_expression = listed_bindings;
                                if (NIL == list_expression) {
                                    v_variables = NIL;
                                } else
                                    if (list_expression.isAtom()) {
                                        v_variables = list(list_expression);
                                    } else
                                        if (NIL == list_expression.rest()) {
                                            {
                                                SubLObject binding = list_expression.first();
                                                v_variables = list(binding.first());
                                            }
                                        } else {
                                            {
                                                SubLObject tail_cons = NIL;
                                                SubLObject result = NIL;
                                                {
                                                    SubLObject binding = list_expression.first();
                                                    v_variables = list(binding.first());
                                                    tail_cons = v_variables;
                                                }
                                                {
                                                    SubLObject cdolist_list_var = list_expression.rest();
                                                    SubLObject binding = NIL;
                                                    for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                                                        result = list(binding.first());
                                                        rplacd(tail_cons, result);
                                                        tail_cons = result;
                                                    }
                                                }
                                            }
                                        }


                                sublisp_throw($sym33$OUTER_CATCH_FOR_CYBLACK_BASIC_ACTIVATION_PATTERN_METHOD, v_variables);
                            }
                        } else {
                            sublisp_throw($sym33$OUTER_CATCH_FOR_CYBLACK_BASIC_ACTIVATION_PATTERN_METHOD, NIL);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_activation_pattern_environment(self, environment);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_activation_pattern_method = Errors.handleThrowable(ccatch_env_var, $sym33$OUTER_CATCH_FOR_CYBLACK_BASIC_ACTIVATION_PATTERN_METHOD);
            }
            return catch_var_for_cyblack_basic_activation_pattern_method;
        }
    }

    public static final SubLObject cyblack_basic_activation_pattern_valid_p_method(SubLObject self) {
        return T;
    }

    public static final SubLObject declare_cyblack_activation_pattern_file() {
        declareFunction("cyblack_activation_pattern_p", "CYBLACK-ACTIVATION-PATTERN-P", 1, 0, false);
        declareFunction("get_cyblack_basic_activation_pattern_environment", "GET-CYBLACK-BASIC-ACTIVATION-PATTERN-ENVIRONMENT", 1, 0, false);
        declareFunction("set_cyblack_basic_activation_pattern_environment", "SET-CYBLACK-BASIC-ACTIVATION-PATTERN-ENVIRONMENT", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_activation_pattern_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-ACTIVATION-PATTERN-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_activation_pattern_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-ACTIVATION-PATTERN-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_activation_pattern_p", "CYBLACK-BASIC-ACTIVATION-PATTERN-P", 1, 0, false);
        declareFunction("cyblack_basic_activation_pattern_initialize_method", "CYBLACK-BASIC-ACTIVATION-PATTERN-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_activation_pattern_clone_method", "CYBLACK-BASIC-ACTIVATION-PATTERN-CLONE-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_activation_pattern_get_value_method", "CYBLACK-BASIC-ACTIVATION-PATTERN-GET-VALUE-METHOD", 2, 0, false);
        declareFunction("cyblack_basic_activation_pattern_get_variables_method", "CYBLACK-BASIC-ACTIVATION-PATTERN-GET-VARIABLES-METHOD", 1, 0, false);
        declareFunction("cyblack_basic_activation_pattern_valid_p_method", "CYBLACK-BASIC-ACTIVATION-PATTERN-VALID-P-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_activation_pattern_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_activation_pattern_file() {
        interfaces.new_interface(CYBLACK_ACTIVATION_PATTERN, $list_alt1, $list_alt2, $list_alt3);
        classes.subloop_new_class(CYBLACK_BASIC_ACTIVATION_PATTERN, CYBLACK_OBJECT, $list_alt6, NIL, $list_alt7);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_ACTIVATION_PATTERN, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_ACTIVATION_PATTERN, $sym11$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_ACTIVATION_PATTERN_CLAS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_ACTIVATION_PATTERN, $sym16$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_ACTIVATION_PATTERN_INST);
        subloop_reserved_initialize_cyblack_basic_activation_pattern_class(CYBLACK_BASIC_ACTIVATION_PATTERN);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_ACTIVATION_PATTERN, $list_alt18, NIL, $list_alt19);
        methods.subloop_register_instance_method(CYBLACK_BASIC_ACTIVATION_PATTERN, INITIALIZE, CYBLACK_BASIC_ACTIVATION_PATTERN_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CLONE, CYBLACK_BASIC_ACTIVATION_PATTERN, $list_alt23, NIL, $list_alt24);
        methods.subloop_register_instance_method(CYBLACK_BASIC_ACTIVATION_PATTERN, CLONE, CYBLACK_BASIC_ACTIVATION_PATTERN_CLONE_METHOD);
        methods.methods_incorporate_instance_method(GET_VALUE, CYBLACK_BASIC_ACTIVATION_PATTERN, $list_alt23, $list_alt27, $list_alt28);
        methods.subloop_register_instance_method(CYBLACK_BASIC_ACTIVATION_PATTERN, GET_VALUE, CYBLACK_BASIC_ACTIVATION_PATTERN_GET_VALUE_METHOD);
        methods.methods_incorporate_instance_method(GET_VARIABLES, CYBLACK_BASIC_ACTIVATION_PATTERN, $list_alt23, NIL, $list_alt32);
        methods.subloop_register_instance_method(CYBLACK_BASIC_ACTIVATION_PATTERN, GET_VARIABLES, CYBLACK_BASIC_ACTIVATION_PATTERN_GET_VARIABLES_METHOD);
        methods.methods_incorporate_instance_method(VALID_P, CYBLACK_BASIC_ACTIVATION_PATTERN, $list_alt23, NIL, $list_alt36);
        methods.subloop_register_instance_method(CYBLACK_BASIC_ACTIVATION_PATTERN, VALID_P, CYBLACK_BASIC_ACTIVATION_PATTERN_VALID_P_METHOD);
        return NIL;
    }



    static private final SubLList $list_alt1 = list(makeSymbol("CYBLACK-COMPONENT"));

    static private final SubLList $list_alt2 = list(makeKeyword("EXTENDS"), list(makeSymbol("CYBLACK-COMPONENT")));

    static private final SubLList $list_alt3 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLONE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VALUE"), list(makeSymbol("VARIABLE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VARIABLES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALID-P"), NIL, makeKeyword("PUBLIC")));

    private static final SubLSymbol CYBLACK_BASIC_ACTIVATION_PATTERN = makeSymbol("CYBLACK-BASIC-ACTIVATION-PATTERN");



    static private final SubLList $list_alt6 = list(makeSymbol("CYBLACK-ACTIVATION-PATTERN"));

    static private final SubLList $list_alt7 = list(list(makeSymbol("ENVIRONMENT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLONE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VALUE"), list(makeSymbol("VARIABLE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VARIABLES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("VALID-P"), NIL, makeKeyword("PUBLIC")));







    static private final SubLSymbol $sym11$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_ACTIVATION_PATTERN_CLAS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-ACTIVATION-PATTERN-CLASS");









    static private final SubLSymbol $sym16$SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_ACTIVATION_PATTERN_INST = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-ACTIVATION-PATTERN-INSTANCE");



    static private final SubLList $list_alt18 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt19 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("ENVIRONMENT"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym20$OUTER_CATCH_FOR_CYBLACK_BASIC_ACTIVATION_PATTERN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-ACTIVATION-PATTERN-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_ACTIVATION_PATTERN_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-ACTIVATION-PATTERN-INITIALIZE-METHOD");



    static private final SubLList $list_alt23 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt24 = list(list(makeSymbol("CLET"), list(list(makeSymbol("COPY-OF-SELF"), list(makeSymbol("CLONE"), makeSymbol("SELF")))), list(RET, makeSymbol("COPY-OF-SELF"))));

    private static final SubLSymbol CYBLACK_BASIC_ACTIVATION_PATTERN_CLONE_METHOD = makeSymbol("CYBLACK-BASIC-ACTIVATION-PATTERN-CLONE-METHOD");



    static private final SubLList $list_alt27 = list(makeSymbol("VARIABLE"));

    static private final SubLList $list_alt28 = list(list(makeSymbol("PIF"), makeSymbol("ENVIRONMENT"), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("ENVIRONMENT"), makeSymbol("VARIABLE"))), list(RET, NIL)));

    static private final SubLSymbol $sym29$OUTER_CATCH_FOR_CYBLACK_BASIC_ACTIVATION_PATTERN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-ACTIVATION-PATTERN-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_ACTIVATION_PATTERN_GET_VALUE_METHOD = makeSymbol("CYBLACK-BASIC-ACTIVATION-PATTERN-GET-VALUE-METHOD");



    static private final SubLList $list_alt32 = list(list(makeSymbol("CLET"), list(list(makeSymbol("LISTED-BINDINGS"), list(makeSymbol("FIF"), makeSymbol("ENVIRONMENT"), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("LISTIFY-LOCAL-BINDINGS"), makeSymbol("CYBLACK-ENVIRONMENT")), makeSymbol("ENVIRONMENT")), NIL))), list(makeSymbol("PIF"), makeSymbol("LISTED-BINDINGS"), list(makeSymbol("CLET"), list(list(makeSymbol("VARIABLES"), NIL)), list(makeSymbol("CDOLIST-COLLECTING"), list(makeSymbol("BINDING"), makeSymbol("LISTED-BINDINGS"), makeSymbol("VARIABLES")), list(makeSymbol("CAR"), makeSymbol("BINDING"))), list(RET, makeSymbol("VARIABLES"))), list(RET, NIL))));

    static private final SubLSymbol $sym33$OUTER_CATCH_FOR_CYBLACK_BASIC_ACTIVATION_PATTERN_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-ACTIVATION-PATTERN-METHOD");

    private static final SubLSymbol CYBLACK_BASIC_ACTIVATION_PATTERN_GET_VARIABLES_METHOD = makeSymbol("CYBLACK-BASIC-ACTIVATION-PATTERN-GET-VARIABLES-METHOD");



    static private final SubLList $list_alt36 = list(list(RET, T));

    private static final SubLSymbol CYBLACK_BASIC_ACTIVATION_PATTERN_VALID_P_METHOD = makeSymbol("CYBLACK-BASIC-ACTIVATION-PATTERN-VALID-P-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_activation_pattern_file();
    }

    public void initializeVariables() {
        init_cyblack_activation_pattern_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_activation_pattern_file();
    }
}

