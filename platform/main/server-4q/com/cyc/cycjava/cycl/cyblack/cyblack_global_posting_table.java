/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V02;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.methods;
import com.cyc.cycjava.cycl.object;
import com.cyc.cycjava.cycl.subloop_sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-GLOBAL-POSTING-TABLE
 *  source file: /cyc/top/cycl/cyblack/cyblack-global-posting-table.lisp
 *  created:     2019/07/03 17:38:44
 */
public final class cyblack_global_posting_table extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_global_posting_table() {
    }

    public static final SubLFile me = new cyblack_global_posting_table();


    // // Definitions
    // defparameter
    private static final SubLSymbol $cyblack_global_posting_table_lock$ = makeSymbol("*CYBLACK-GLOBAL-POSTING-TABLE-LOCK*");

    public static final SubLObject cyblack_posting_id_p(SubLObject v_object) {
        return integerp(v_object);
    }

    public static final SubLObject get_cyblack_global_posting_table_table(SubLObject v_cyblack_global_posting_table) {
        return classes.subloop_get_access_protected_instance_slot(v_cyblack_global_posting_table, ONE_INTEGER, TABLE);
    }

    public static final SubLObject set_cyblack_global_posting_table_table(SubLObject v_cyblack_global_posting_table, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(v_cyblack_global_posting_table, value, ONE_INTEGER, TABLE);
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_global_posting_table_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cyblack_global_posting_table_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, CYBLACK_GLOBAL_POSTING_TABLE, TABLE, NIL);
        return NIL;
    }

    public static final SubLObject cyblack_global_posting_table_p(SubLObject v_cyblack_global_posting_table) {
        return classes.subloop_instanceof_class(v_cyblack_global_posting_table, CYBLACK_GLOBAL_POSTING_TABLE);
    }

    public static final SubLObject cyblack_global_posting_table_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cyblack_global_posting_table_method = NIL;
            SubLObject table = get_cyblack_global_posting_table_table(self);
            try {
                try {
                    object.object_initialize_method(self);
                    table = object.new_object_instance(BASIC_VARIABLE_LENGTH_SEQUENCE);
                    sublisp_throw($sym13$OUTER_CATCH_FOR_CYBLACK_GLOBAL_POSTING_TABLE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_global_posting_table_table(self, table);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_global_posting_table_method = Errors.handleThrowable(ccatch_env_var, $sym13$OUTER_CATCH_FOR_CYBLACK_GLOBAL_POSTING_TABLE_METHOD);
            }
            return catch_var_for_cyblack_global_posting_table_method;
        }
    }

    public static final SubLObject cyblack_global_posting_table_record_posting_method(SubLObject self, SubLObject posting) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cyblack_global_posting_table_method = NIL;
                SubLObject table = get_cyblack_global_posting_table_table(self);
                try {
                    try {
                        if (NIL != cyblack_posting.cyblack_basic_posting_p(posting)) {
                            {
                                SubLObject lock = $cyblack_global_posting_table_lock$.getDynamicValue(thread);
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock);
                                    subloop_sequences.basic_variable_length_sequence_set_nth_method(table, cyblack_posting.get_cyblack_basic_posting_internal_pid(posting), posting);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock);
                                    }
                                }
                            }
                        }
                        sublisp_throw($sym20$OUTER_CATCH_FOR_CYBLACK_GLOBAL_POSTING_TABLE_METHOD, posting);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cyblack_global_posting_table_table(self, table);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cyblack_global_posting_table_method = Errors.handleThrowable(ccatch_env_var, $sym20$OUTER_CATCH_FOR_CYBLACK_GLOBAL_POSTING_TABLE_METHOD);
                }
                return catch_var_for_cyblack_global_posting_table_method;
            }
        }
    }

    public static final SubLObject cyblack_global_posting_table_retrieve_posting_method(SubLObject self, SubLObject posting_id) {
        {
            SubLObject catch_var_for_cyblack_global_posting_table_method = NIL;
            SubLObject table = get_cyblack_global_posting_table_table(self);
            try {
                try {
                    if (posting_id.numGE(ZERO_INTEGER)) {
                        sublisp_throw($sym25$OUTER_CATCH_FOR_CYBLACK_GLOBAL_POSTING_TABLE_METHOD, subloop_sequences.basic_variable_length_sequence_get_nth_method(table, posting_id, UNPROVIDED));
                    }
                    sublisp_throw($sym25$OUTER_CATCH_FOR_CYBLACK_GLOBAL_POSTING_TABLE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cyblack_global_posting_table_table(self, table);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cyblack_global_posting_table_method = Errors.handleThrowable(ccatch_env_var, $sym25$OUTER_CATCH_FOR_CYBLACK_GLOBAL_POSTING_TABLE_METHOD);
            }
            return catch_var_for_cyblack_global_posting_table_method;
        }
    }

    public static final SubLObject declare_cyblack_global_posting_table_file() {
        declareFunction("cyblack_posting_id_p", "CYBLACK-POSTING-ID-P", 1, 0, false);
        declareFunction("get_cyblack_global_posting_table_table", "GET-CYBLACK-GLOBAL-POSTING-TABLE-TABLE", 1, 0, false);
        declareFunction("set_cyblack_global_posting_table_table", "SET-CYBLACK-GLOBAL-POSTING-TABLE-TABLE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_global_posting_table_class", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GLOBAL-POSTING-TABLE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cyblack_global_posting_table_instance", "SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GLOBAL-POSTING-TABLE-INSTANCE", 1, 0, false);
        declareFunction("cyblack_global_posting_table_p", "CYBLACK-GLOBAL-POSTING-TABLE-P", 1, 0, false);
        declareFunction("cyblack_global_posting_table_initialize_method", "CYBLACK-GLOBAL-POSTING-TABLE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cyblack_global_posting_table_record_posting_method", "CYBLACK-GLOBAL-POSTING-TABLE-RECORD-POSTING-METHOD", 2, 0, false);
        declareFunction("cyblack_global_posting_table_retrieve_posting_method", "CYBLACK-GLOBAL-POSTING-TABLE-RETRIEVE-POSTING-METHOD", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_global_posting_table_file() {
        defparameter("*CYBLACK-GLOBAL-POSTING-TABLE-LOCK*", make_lock($$$Global_Posting_Table_Lock));
        return NIL;
    }

    public static final SubLObject setup_cyblack_global_posting_table_file() {
                classes.subloop_new_class(CYBLACK_GLOBAL_POSTING_TABLE, OBJECT, NIL, NIL, $list_alt3);
        classes.class_set_implements_slot_listeners(CYBLACK_GLOBAL_POSTING_TABLE, NIL);
        classes.subloop_note_class_initialization_function(CYBLACK_GLOBAL_POSTING_TABLE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GLOBAL_POSTING_TABLE_CLASS);
        classes.subloop_note_instance_initialization_function(CYBLACK_GLOBAL_POSTING_TABLE, SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GLOBAL_POSTING_TABLE_INSTANCE);
        subloop_reserved_initialize_cyblack_global_posting_table_class(CYBLACK_GLOBAL_POSTING_TABLE);
        methods.methods_incorporate_instance_method(INITIALIZE, CYBLACK_GLOBAL_POSTING_TABLE, $list_alt11, NIL, $list_alt12);
        methods.subloop_register_instance_method(CYBLACK_GLOBAL_POSTING_TABLE, INITIALIZE, CYBLACK_GLOBAL_POSTING_TABLE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(RECORD_POSTING, CYBLACK_GLOBAL_POSTING_TABLE, $list_alt17, $list_alt18, $list_alt19);
        methods.subloop_register_instance_method(CYBLACK_GLOBAL_POSTING_TABLE, RECORD_POSTING, CYBLACK_GLOBAL_POSTING_TABLE_RECORD_POSTING_METHOD);
        methods.methods_incorporate_instance_method(RETRIEVE_POSTING, CYBLACK_GLOBAL_POSTING_TABLE, $list_alt17, $list_alt23, $list_alt24);
        methods.subloop_register_instance_method(CYBLACK_GLOBAL_POSTING_TABLE, RETRIEVE_POSTING, CYBLACK_GLOBAL_POSTING_TABLE_RETRIEVE_POSTING_METHOD);
        return NIL;
    }

    // // Internal Constants
    static private final SubLString $$$Global_Posting_Table_Lock = makeString("Global Posting Table Lock");

    private static final SubLSymbol CYBLACK_GLOBAL_POSTING_TABLE = makeSymbol("CYBLACK-GLOBAL-POSTING-TABLE");



    static private final SubLList $list_alt3 = list(list(makeSymbol("TABLE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RECORD-POSTING"), list(makeSymbol("POSTING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETRIEVE-POSTING"), list(makeSymbol("POSTING-ID")), makeKeyword("PUBLIC")));





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GLOBAL_POSTING_TABLE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GLOBAL-POSTING-TABLE-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYBLACK_GLOBAL_POSTING_TABLE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYBLACK-GLOBAL-POSTING-TABLE-INSTANCE");



    static private final SubLList $list_alt11 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt12 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TABLE"), list(makeSymbol("NEW-OBJECT-INSTANCE"), list(QUOTE, makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym13$OUTER_CATCH_FOR_CYBLACK_GLOBAL_POSTING_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GLOBAL-POSTING-TABLE-METHOD");

    private static final SubLSymbol BASIC_VARIABLE_LENGTH_SEQUENCE = makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE");

    private static final SubLSymbol CYBLACK_GLOBAL_POSTING_TABLE_INITIALIZE_METHOD = makeSymbol("CYBLACK-GLOBAL-POSTING-TABLE-INITIALIZE-METHOD");

    private static final SubLSymbol RECORD_POSTING = makeSymbol("RECORD-POSTING");

    static private final SubLList $list_alt17 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt18 = list(makeSymbol("POSTING"));

    static private final SubLList $list_alt19 = list(list(makeSymbol("PWHEN"), list(makeSymbol("CYBLACK-BASIC-POSTING-P"), makeSymbol("POSTING")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("*CYBLACK-GLOBAL-POSTING-TABLE-LOCK*")), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-NTH"), makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE")), makeSymbol("TABLE"), list(makeSymbol("GET-CYBLACK-BASIC-POSTING-INTERNAL-PID"), makeSymbol("POSTING")), makeSymbol("POSTING")))), list(RET, makeSymbol("POSTING")));

    static private final SubLSymbol $sym20$OUTER_CATCH_FOR_CYBLACK_GLOBAL_POSTING_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GLOBAL-POSTING-TABLE-METHOD");

    private static final SubLSymbol CYBLACK_GLOBAL_POSTING_TABLE_RECORD_POSTING_METHOD = makeSymbol("CYBLACK-GLOBAL-POSTING-TABLE-RECORD-POSTING-METHOD");

    private static final SubLSymbol RETRIEVE_POSTING = makeSymbol("RETRIEVE-POSTING");

    static private final SubLList $list_alt23 = list(makeSymbol("POSTING-ID"));

    static private final SubLList $list_alt24 = list(list(makeSymbol("CYBLACK-MUST"), list(makeSymbol("CYBLACK-POSTING-ID-P"), makeSymbol("POSTING-ID")), makeString("(RETRIEVE-POSTING ~S): ~S is not a valid posting ID."), makeSymbol("SELF"), makeSymbol("POSTING-ID")), list(makeSymbol("PWHEN"), list(makeSymbol(">="), makeSymbol("POSTING-ID"), ZERO_INTEGER), list(RET, list(makeSymbol("INLINE-METHOD"), list(makeSymbol("GET-NTH"), makeSymbol("BASIC-VARIABLE-LENGTH-SEQUENCE")), makeSymbol("TABLE"), makeSymbol("POSTING-ID")))), list(RET, NIL));

    static private final SubLSymbol $sym25$OUTER_CATCH_FOR_CYBLACK_GLOBAL_POSTING_TABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYBLACK-GLOBAL-POSTING-TABLE-METHOD");

    private static final SubLSymbol CYBLACK_GLOBAL_POSTING_TABLE_RETRIEVE_POSTING_METHOD = makeSymbol("CYBLACK-GLOBAL-POSTING-TABLE-RETRIEVE-POSTING-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_global_posting_table_file();
    }

    public void initializeVariables() {
        init_cyblack_global_posting_table_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_global_posting_table_file();
    }
}

