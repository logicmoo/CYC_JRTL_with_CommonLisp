/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.interfaces;
import com.cyc.cycjava.cycl.methods;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-LOCKABLE
 *  source file: /cyc/top/cycl/cyblack/cyblack-lockable.lisp
 *  created:     2019/07/03 17:38:42
 */
public final class cyblack_lockable extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_lockable() {
    }

    public static final SubLFile me = new cyblack_lockable();

    public static final String myName = "com.cyc.cycjava.cycl.cyblack.cyblack_lockable";

    // // Definitions
    public static final SubLObject cyblack_lockable_p(SubLObject v_cyblack_lockable) {
        return interfaces.subloop_instanceof_interface(v_cyblack_lockable, CYBLACK_LOCKABLE);
    }

    public static final SubLObject get_cyblack_basic_lockable_owner(SubLObject cyblack_basic_lockable) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_lockable, FOUR_INTEGER, OWNER);
    }

    public static final SubLObject set_cyblack_basic_lockable_owner(SubLObject cyblack_basic_lockable, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_lockable, value, FOUR_INTEGER, OWNER);
    }

    public static final SubLObject get_cyblack_basic_lockable_lock(SubLObject cyblack_basic_lockable) {
        return classes.subloop_get_access_protected_instance_slot(cyblack_basic_lockable, THREE_INTEGER, LOCK);
    }

    public static final SubLObject set_cyblack_basic_lockable_lock(SubLObject cyblack_basic_lockable, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cyblack_basic_lockable, value, THREE_INTEGER, LOCK);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_lockable_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_basic_lockable_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, APPLICATION, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_OBJECT, HTML_INDENT_BY, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_BASIC_LOCKABLE, OWNER, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_basic_lockable_p(SubLObject cyblack_basic_lockable) {
        return classes.subloop_instanceof_class(cyblack_basic_lockable, CYBLACK_BASIC_LOCKABLE);
    }

    public static final SubLObject cyblack_basic_lockable_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_basic_lockable_method = NIL;
            SubLObject owner = get_cyblack_basic_lockable_owner(self);
            SubLObject lock = get_cyblack_basic_lockable_lock(self);
            try {
                try {
                    cyblack_object.cyblack_object_initialize_method(self);
                    lock = make_lock(format(NIL, $str_alt18$_S, self));
                    owner = NIL;
                    sublisp_throw($sym17$OUTER_CATCH_FOR_CYBLACK_BASIC_LOCKABLE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_basic_lockable_owner(self, owner);
                            set_cyblack_basic_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_basic_lockable_method = Errors.handleThrowable(ccatch_env_var, $sym17$OUTER_CATCH_FOR_CYBLACK_BASIC_LOCKABLE_METHOD);
            }
            return catch_var_for_cyblack_basic_lockable_method;
        }
    }

    public static final SubLObject with_cyblack_basic_lockable(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt20);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject lockable = NIL;
                    SubLObject seizer = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    lockable = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt20);
                    seizer = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject lockable_var = make_symbol($$$LOCKABLE);
                            SubLObject seizer_var = make_symbol($$$SEIZER);
                            SubLObject lock_var = make_symbol($$$lock);
                            return list(CLET, list(list(lockable_var, lockable), list(seizer_var, seizer), list(lock_var, list(GET_CYBLACK_BASIC_LOCKABLE_LOCK, lockable_var))), list(CUNWIND_PROTECT, listS(WITH_LOCK_HELD, list(lock_var), list(SET_CYBLACK_BASIC_LOCKABLE_OWNER, lockable_var, seizer_var), body), listS(SET_CYBLACK_BASIC_LOCKABLE_OWNER, lockable_var, $list_alt29)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt20);
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject declare_cyblack_lockable_file() {
        declareFunction("cyblack_lockable_p", "CYBLACK-LOCKABLE-P", 1, 0, false);
        declareFunction("get_cyblack_basic_lockable_owner", "GET-CYBLACK-BASIC-LOCKABLE-OWNER", 1, 0, false);
        declareFunction("set_cyblack_basic_lockable_owner", "SET-CYBLACK-BASIC-LOCKABLE-OWNER", 2, 0, false);
        declareFunction("get_cyblack_basic_lockable_lock", "GET-CYBLACK-BASIC-LOCKABLE-LOCK", 1, 0, false);
        declareFunction("set_cyblack_basic_lockable_lock", "SET-CYBLACK-BASIC-LOCKABLE-LOCK", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_lockable_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LOCKABLE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_basic_lockable_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LOCKABLE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_basic_lockable_p", "CYBLACK-BASIC-LOCKABLE-P", 1, 0, false);
        declareFunction("cyblack_basic_lockable_initialize_method", "CYBLACK-BASIC-LOCKABLE-INITIALIZE-METHOD", 1, 0, false);
        declareMacro("with_cyblack_basic_lockable", "WITH-CYBLACK-BASIC-LOCKABLE");
        return NIL;
    }

    public static final SubLObject init_cyblack_lockable_file() {
        return NIL;
    }

    public static final SubLObject setup_cyblack_lockable_file() {
                interfaces.new_interface(CYBLACK_LOCKABLE, NIL, NIL, NIL);
        classes.subloop_new_class(CYBLACK_BASIC_LOCKABLE, CYBLACK_OBJECT, $list_alt3, NIL, $list_alt4);
        classes.class_set_implements_slot_listeners(CYBLACK_BASIC_LOCKABLE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_BASIC_LOCKABLE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LOCKABLE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_BASIC_LOCKABLE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LOCKABLE_INSTANCE);
        subloop_reserved_initialize_cyblack_basic_lockable_class(CYBLACK_BASIC_LOCKABLE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_BASIC_LOCKABLE, NIL, NIL, $list_alt16);
        methods.subloop_register_instance_method(CYBLACK_BASIC_LOCKABLE, INITIALIZE, CYBLACK_BASIC_LOCKABLE_INITIALIZE_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol CYBLACK_LOCKABLE = makeSymbol("CYBLACK-LOCKABLE");





    static private final SubLList $list_alt3 = list(makeSymbol("CYBLACK-LOCKABLE"));

    static private final SubLList $list_alt4 = list(list(makeSymbol("LOCK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("OWNER"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LOCKABLE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LOCKABLE-CLASS");









    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_BASIC_LOCKABLE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-BASIC-LOCKABLE-INSTANCE");



    static private final SubLList $list_alt16 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("LOCK"), list(makeSymbol("MAKE-LOCK"), list(makeSymbol("FORMAT"), NIL, makeString("~S"), makeSymbol("SELF")))), list(makeSymbol("CSETQ"), makeSymbol("OWNER"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym17$OUTER_CATCH_FOR_CYBLACK_BASIC_LOCKABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-BASIC-LOCKABLE-METHOD");

    static private final SubLString $str_alt18$_S = makeString("~S");

    private static final SubLSymbol CYBLACK_BASIC_LOCKABLE_INITIALIZE_METHOD = makeSymbol("CYBLACK-BASIC-LOCKABLE-INITIALIZE-METHOD");

    static private final SubLList $list_alt20 = list(list(makeSymbol("LOCKABLE"), makeSymbol("SEIZER")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $$$LOCKABLE = makeString("LOCKABLE");

    static private final SubLString $$$SEIZER = makeString("SEIZER");

    static private final SubLString $$$lock = makeString("lock");



    private static final SubLSymbol GET_CYBLACK_BASIC_LOCKABLE_LOCK = makeSymbol("GET-CYBLACK-BASIC-LOCKABLE-LOCK");





    private static final SubLSymbol SET_CYBLACK_BASIC_LOCKABLE_OWNER = makeSymbol("SET-CYBLACK-BASIC-LOCKABLE-OWNER");

    static private final SubLList $list_alt29 = list(NIL);

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_lockable_file();
    }

    public void initializeVariables() {
        init_cyblack_lockable_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_lockable_file();
    }
}

