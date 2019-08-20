/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SUNIT-CLASSES
 *  source file: /cyc/top/cycl/sunit-classes.lisp
 *  created:     2019/07/03 17:37:10
 */
public final class sunit_classes extends SubLTranslatedFile implements V02 {
    // // Constructor
    private sunit_classes() {
    }

    public static final SubLFile me = new sunit_classes();


    // // Definitions
    // defparameter
    public static final SubLSymbol $sunit_verbose$ = makeSymbol("*SUNIT-VERBOSE*");

    /**
     * If non-nil, rather that throwing out of a test upon failure, signal
     * a break so that state can be examined, etc.
     */
    // defparameter
    public static final SubLSymbol $sunit_break_on_failure$ = makeSymbol("*SUNIT-BREAK-ON-FAILURE*");

    public static final SubLObject get_sunit_lockable_lock(SubLObject sunit_lockable) {
        return classes.subloop_get_access_protected_instance_slot(sunit_lockable, ONE_INTEGER, LOCK);
    }

    public static final SubLObject set_sunit_lockable_lock(SubLObject sunit_lockable, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(sunit_lockable, value, ONE_INTEGER, LOCK);
    }

    public static final SubLObject subloop_reserved_initialize_sunit_lockable_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_sunit_lockable_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SUNIT_LOCKABLE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject sunit_lockable_p(SubLObject sunit_lockable) {
        return classes.subloop_instanceof_class(sunit_lockable, SUNIT_LOCKABLE);
    }

    public static final SubLObject sunit_lockable_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_sunit_lockable_method = NIL;
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    object.object_initialize_method(self);
                    lock = make_lock(format(NIL, $str_alt13$_S_lock, self));
                    sublisp_throw($sym12$OUTER_CATCH_FOR_SUNIT_LOCKABLE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_sunit_lockable_method = Errors.handleThrowable(ccatch_env_var, $sym12$OUTER_CATCH_FOR_SUNIT_LOCKABLE_METHOD);
            }
            return catch_var_for_sunit_lockable_method;
        }
    }

    public static final SubLObject get_test_result_time(SubLObject test_result) {
        return classes.subloop_get_access_protected_instance_slot(test_result, SIX_INTEGER, TIME);
    }

    public static final SubLObject set_test_result_time(SubLObject test_result, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_result, value, SIX_INTEGER, TIME);
    }

    public static final SubLObject get_test_result_explanation(SubLObject test_result) {
        return classes.subloop_get_access_protected_instance_slot(test_result, FIVE_INTEGER, EXPLANATION);
    }

    public static final SubLObject set_test_result_explanation(SubLObject test_result, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_result, value, FIVE_INTEGER, EXPLANATION);
    }

    public static final SubLObject get_test_result_result(SubLObject test_result) {
        return classes.subloop_get_access_protected_instance_slot(test_result, FOUR_INTEGER, RESULT);
    }

    public static final SubLObject set_test_result_result(SubLObject test_result, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_result, value, FOUR_INTEGER, RESULT);
    }

    public static final SubLObject get_test_result_test_method(SubLObject test_result) {
        return classes.subloop_get_access_protected_instance_slot(test_result, THREE_INTEGER, TEST_METHOD);
    }

    public static final SubLObject set_test_result_test_method(SubLObject test_result, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_result, value, THREE_INTEGER, TEST_METHOD);
    }

    public static final SubLObject get_test_result_test_case(SubLObject test_result) {
        return classes.subloop_get_access_protected_instance_slot(test_result, TWO_INTEGER, TEST_CASE);
    }

    public static final SubLObject set_test_result_test_case(SubLObject test_result, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_result, value, TWO_INTEGER, TEST_CASE);
    }

    public static final SubLObject subloop_reserved_initialize_test_result_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_result_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SUNIT_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_RESULT, TEST_CASE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_RESULT, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_RESULT, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_RESULT, EXPLANATION, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_RESULT, TIME, NIL);
        return NIL;
    }

    public static final SubLObject test_result_p(SubLObject test_result) {
        return classes.subloop_instanceof_class(test_result, TEST_RESULT);
    }

    public static final SubLObject test_result_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject time = get_test_result_time(self);
            SubLObject explanation = get_test_result_explanation(self);
            SubLObject result = get_test_result_result(self);
            SubLObject test_method = get_test_result_test_method(self);
            SubLObject test_case = get_test_result_test_case(self);
            try {
                try {
                    sunit_lockable_initialize_method(self);
                    test_case = NIL;
                    test_method = NIL;
                    result = $SUCCESS;
                    explanation = $str_alt28$;
                    time = NIL;
                    sublisp_throw($sym26$OUTER_CATCH_FOR_TEST_RESULT_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_time(self, time);
                            set_test_result_explanation(self, explanation);
                            set_test_result_result(self, result);
                            set_test_result_test_method(self, test_method);
                            set_test_result_test_case(self, test_case);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym26$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_set_test_case_method(SubLObject self, SubLObject test_case_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_result_method = NIL;
                SubLObject test_case = get_test_result_test_case(self);
                SubLObject lock = get_sunit_lockable_lock(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == classes.subclassp(test_case_name, TEST_CASE)) {
                                Errors.error($str_alt35$_A_is_not_the_name_of_a_known_tes, test_case_name);
                            }
                        }
                        {
                            SubLObject lock_1 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_1);
                                test_case = test_case_name;
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_1);
                                }
                            }
                        }
                        sublisp_throw($sym34$OUTER_CATCH_FOR_TEST_RESULT_METHOD, test_case);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_result_test_case(self, test_case);
                                set_sunit_lockable_lock(self, lock);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym34$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
                }
                return catch_var_for_test_result_method;
            }
        }
    }

    public static final SubLObject test_result_get_test_case_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject test_case = get_test_result_test_case(self);
            try {
                try {
                    sublisp_throw($sym39$OUTER_CATCH_FOR_TEST_RESULT_METHOD, test_case);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_test_case(self, test_case);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym39$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_set_test_method_method(SubLObject self, SubLObject method) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject test_method = get_test_result_test_method(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    SubLTrampolineFile.checkType(method, SYMBOLP);
                    {
                        SubLObject lock_2 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_2);
                            test_method = method;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_2);
                            }
                        }
                    }
                    sublisp_throw($sym44$OUTER_CATCH_FOR_TEST_RESULT_METHOD, test_method);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_test_method(self, test_method);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym44$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_get_test_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject test_method = get_test_result_test_method(self);
            try {
                try {
                    sublisp_throw($sym49$OUTER_CATCH_FOR_TEST_RESULT_METHOD, test_method);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_test_method(self, test_method);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym49$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_set_result_method(SubLObject self, SubLObject res) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject result = get_test_result_result(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    SubLTrampolineFile.checkType(res, KEYWORDP);
                    {
                        SubLObject lock_3 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_3);
                            result = res;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_3);
                            }
                        }
                    }
                    sublisp_throw($sym54$OUTER_CATCH_FOR_TEST_RESULT_METHOD, result);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_result(self, result);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym54$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_get_result_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject result = get_test_result_result(self);
            try {
                try {
                    sublisp_throw($sym59$OUTER_CATCH_FOR_TEST_RESULT_METHOD, result);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_result(self, result);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym59$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_set_explanation_method(SubLObject self, SubLObject explain) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject explanation = get_test_result_explanation(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    SubLTrampolineFile.checkType(explain, STRINGP);
                    {
                        SubLObject lock_4 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_4);
                            explanation = explain;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_4);
                            }
                        }
                    }
                    sublisp_throw($sym64$OUTER_CATCH_FOR_TEST_RESULT_METHOD, explanation);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_explanation(self, explanation);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym64$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_get_explanation_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject explanation = get_test_result_explanation(self);
            try {
                try {
                    sublisp_throw($sym69$OUTER_CATCH_FOR_TEST_RESULT_METHOD, explanation);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_explanation(self, explanation);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_set_time_method(SubLObject self, SubLObject new_time) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject time = get_test_result_time(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    SubLTrampolineFile.checkType(new_time, INTEGERP);
                    {
                        SubLObject lock_5 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_5);
                            time = new_time;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_5);
                            }
                        }
                    }
                    sublisp_throw($sym74$OUTER_CATCH_FOR_TEST_RESULT_METHOD, time);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_time(self, time);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym74$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_get_time_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject time = get_test_result_time(self);
            try {
                try {
                    sublisp_throw($sym79$OUTER_CATCH_FOR_TEST_RESULT_METHOD, time);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_time(self, time);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym79$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_note_error_method(SubLObject self, SubLObject error_message, SubLObject phase) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    SubLTrampolineFile.checkType(error_message, STRINGP);
                    {
                        SubLObject preamble = NIL;
                        SubLObject pcase_var = phase;
                        if (pcase_var.eql($SETUP)) {
                            preamble = $str_alt86$Halted_with_this_error_during_set;
                        } else
                            if (pcase_var.eql($EXECUTION)) {
                                preamble = $str_alt88$Halted_with_this_error_during_exe;
                            } else
                                if (pcase_var.eql($CLEANUP)) {
                                    preamble = $str_alt90$Halted_with_this_error_during_cle;
                                } else {
                                    Errors.error($str_alt91$Unknown_test_phase__A, phase);
                                }


                        {
                            SubLObject lock_6 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_6);
                                test_result_set_result_method(self, $ERROR);
                                test_result_set_explanation_method(self, cconcatenate(preamble, error_message));
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_6);
                                }
                            }
                        }
                    }
                    sublisp_throw($sym84$OUTER_CATCH_FOR_TEST_RESULT_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym84$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_format_method(SubLObject self, SubLObject stream) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject time = get_test_result_time(self);
            SubLObject explanation = get_test_result_explanation(self);
            SubLObject result = get_test_result_result(self);
            SubLObject test_method = get_test_result_test_method(self);
            SubLObject test_case = get_test_result_test_case(self);
            try {
                try {
                    format(stream, $str_alt98$____Test_Case___A_, test_case);
                    format(stream, $str_alt99$__Test_Method___A___, test_method);
                    format(stream, $str_alt100$__Finished_in__A__A_with_this_res, new SubLObject[]{ time, time.eql(ONE_INTEGER) ? ((SubLObject) ($$$second)) : $$$seconds, result });
                    if (NIL != string_utilities.empty_string_p(explanation)) {
                        format(stream, $str_alt103$____);
                    } else {
                        format(stream, $str_alt104$__Explanation___A____, explanation);
                    }
                    sublisp_throw($sym97$OUTER_CATCH_FOR_TEST_RESULT_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_time(self, time);
                            set_test_result_explanation(self, explanation);
                            set_test_result_result(self, result);
                            set_test_result_test_method(self, test_method);
                            set_test_result_test_case(self, test_case);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym97$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    public static final SubLObject test_result_isolate_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_result_method = NIL;
            SubLObject time = get_test_result_time(self);
            SubLObject explanation = get_test_result_explanation(self);
            SubLObject result = get_test_result_result(self);
            SubLObject test_method = get_test_result_test_method(self);
            SubLObject test_case = get_test_result_test_case(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject lock_7 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_7);
                            time = NIL;
                            explanation = NIL;
                            result = NIL;
                            test_method = NIL;
                            test_case = NIL;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_7);
                            }
                        }
                        object.object_isolate_method(self);
                        sublisp_throw($sym108$OUTER_CATCH_FOR_TEST_RESULT_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_result_time(self, time);
                            set_test_result_explanation(self, explanation);
                            set_test_result_result(self, result);
                            set_test_result_test_method(self, test_method);
                            set_test_result_test_case(self, test_case);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_result_method = Errors.handleThrowable(ccatch_env_var, $sym108$OUTER_CATCH_FOR_TEST_RESULT_METHOD);
            }
            return catch_var_for_test_result_method;
        }
    }

    // deflexical
    private static final SubLSymbol $test_category_dictionary_lock$ = makeSymbol("*TEST-CATEGORY-DICTIONARY-LOCK*");



    public static final SubLObject get_test_category_by_name(SubLObject name) {
        SubLTrampolineFile.checkType(name, STRINGP);
        return gethash(name, $test_category_dictionary$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject valid_test_category_name(SubLObject name) {
        return list_utilities.sublisp_boolean(get_test_category_by_name(name));
    }

    public static final SubLObject store_test_category_by_name(SubLObject name, SubLObject test_category) {
        SubLTrampolineFile.checkType(name, STRINGP);
        SubLTrampolineFile.checkType(test_category, TEST_CATEGORY_P);
        {
            SubLObject result = NIL;
            SubLObject lock = $test_category_dictionary_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                result = sethash(name, $test_category_dictionary$.getGlobalValue(), test_category);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static final SubLObject remove_test_category_by_name(SubLObject test_category_name) {
        SubLTrampolineFile.checkType(test_category_name, STRINGP);
        {
            SubLObject test_cat = get_test_category_by_name(test_category_name);
            if (NIL == test_category_p(test_cat)) {
                Errors.cerror($$$Skip_removal_attempt, $str_alt114$_A_is_not_the_name_of_a_known_tes, test_category_name);
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject lock = $test_category_dictionary_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = remhash(test_category_name, $test_category_dictionary$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject get_test_category_test_cases(SubLObject test_category) {
        return classes.subloop_get_access_protected_instance_slot(test_category, SEVEN_INTEGER, TEST_CASES);
    }

    public static final SubLObject set_test_category_test_cases(SubLObject test_category, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_category, value, SEVEN_INTEGER, TEST_CASES);
    }

    public static final SubLObject get_test_category_enabled(SubLObject test_category) {
        return classes.subloop_get_access_protected_instance_slot(test_category, SIX_INTEGER, ENABLED);
    }

    public static final SubLObject set_test_category_enabled(SubLObject test_category, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_category, value, SIX_INTEGER, ENABLED);
    }

    public static final SubLObject get_test_category_suites(SubLObject test_category) {
        return classes.subloop_get_access_protected_instance_slot(test_category, FIVE_INTEGER, SUITES);
    }

    public static final SubLObject set_test_category_suites(SubLObject test_category, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_category, value, FIVE_INTEGER, SUITES);
    }

    public static final SubLObject get_test_category_subcategories(SubLObject test_category) {
        return classes.subloop_get_access_protected_instance_slot(test_category, FOUR_INTEGER, SUBCATEGORIES);
    }

    public static final SubLObject set_test_category_subcategories(SubLObject test_category, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_category, value, FOUR_INTEGER, SUBCATEGORIES);
    }

    public static final SubLObject get_test_category_supercategories(SubLObject test_category) {
        return classes.subloop_get_access_protected_instance_slot(test_category, THREE_INTEGER, SUPERCATEGORIES);
    }

    public static final SubLObject set_test_category_supercategories(SubLObject test_category, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_category, value, THREE_INTEGER, SUPERCATEGORIES);
    }

    public static final SubLObject get_test_category_name(SubLObject test_category) {
        return classes.subloop_get_access_protected_instance_slot(test_category, TWO_INTEGER, NAME);
    }

    public static final SubLObject set_test_category_name(SubLObject test_category, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_category, value, TWO_INTEGER, NAME);
    }

    public static final SubLObject subloop_reserved_initialize_test_category_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_category_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SUNIT_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CATEGORY, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CATEGORY, SUPERCATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CATEGORY, SUBCATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CATEGORY, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CATEGORY, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CATEGORY, TEST_CASES, NIL);
        return NIL;
    }

    public static final SubLObject test_category_p(SubLObject test_category) {
        return classes.subloop_instanceof_class(test_category, TEST_CATEGORY);
    }

    public static final SubLObject test_category_new_method(SubLObject self, SubLObject new_name, SubLObject new_supercategories) {
        if (new_supercategories == UNPROVIDED) {
            new_supercategories = NIL;
        }
        {
            SubLObject new_instance = object.new_class_instance(self);
            store_test_category_by_name(new_name, new_instance);
            methods.funcall_instance_method_with_1_args(new_instance, SET_NAME, new_name);
            methods.funcall_instance_method_with_1_args(new_instance, SET_SUPERCATEGORIES, new_supercategories);
            {
                SubLObject cdolist_list_var = new_supercategories;
                SubLObject super_name = NIL;
                for (super_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , super_name = cdolist_list_var.first()) {
                    {
                        SubLObject supercategory = get_test_category_by_name(super_name);
                        SubLObject existing_subcategories = methods.funcall_instance_method_with_0_args(supercategory, GET_SUBCATEGORIES);
                        SubLObject new_subs = union(list(new_name), existing_subcategories, UNPROVIDED, UNPROVIDED);
                        methods.funcall_instance_method_with_1_args(supercategory, SET_SUBCATEGORIES, new_subs);
                    }
                }
            }
            return new_instance;
        }
    }

    public static final SubLObject test_category_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject test_cases = get_test_category_test_cases(self);
            SubLObject enabled = get_test_category_enabled(self);
            SubLObject suites = get_test_category_suites(self);
            SubLObject subcategories = get_test_category_subcategories(self);
            SubLObject supercategories = get_test_category_supercategories(self);
            SubLObject name = get_test_category_name(self);
            try {
                try {
                    sunit_lockable_initialize_method(self);
                    name = $str_alt28$;
                    supercategories = NIL;
                    subcategories = NIL;
                    suites = NIL;
                    enabled = T;
                    test_cases = NIL;
                    sublisp_throw($sym134$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_test_cases(self, test_cases);
                            set_test_category_enabled(self, enabled);
                            set_test_category_suites(self, suites);
                            set_test_category_subcategories(self, subcategories);
                            set_test_category_supercategories(self, supercategories);
                            set_test_category_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym134$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_get_name_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject name = get_test_category_name(self);
            try {
                try {
                    sublisp_throw($sym138$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym138$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_set_name_method(SubLObject self, SubLObject new_category_name) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject name = get_test_category_name(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    SubLTrampolineFile.checkType(new_category_name, STRINGP);
                    if (name.isString()) {
                        if (!($str_alt28$.equal(name) || name.equal(new_category_name))) {
                            remove_test_category_by_name(name);
                        }
                    }
                    {
                        SubLObject lock_8 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_8);
                            name = new_category_name;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_8);
                            }
                        }
                    }
                    store_test_category_by_name(name, self);
                    sublisp_throw($sym142$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_name(self, name);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym142$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_add_test_case_method(SubLObject self, SubLObject new_test_case) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_category_method = NIL;
                SubLObject test_cases = get_test_category_test_cases(self);
                try {
                    try {
                        SubLTrampolineFile.checkType(new_test_case, SYMBOLP);
                        {
                            SubLObject test_case = get_test_case_by_symbol(new_test_case);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == test_case) {
                                    Errors.error($str_alt148$_A_is_not_a_known_Test_Case, new_test_case);
                                }
                            }
                            test_cases = union(list(new_test_case), test_category_get_test_cases_method(self), UNPROVIDED, UNPROVIDED);
                        }
                        sublisp_throw($sym147$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, test_category_get_test_cases_method(self));
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_category_test_cases(self, test_cases);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym147$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
                }
                return catch_var_for_test_category_method;
            }
        }
    }

    public static final SubLObject test_category_delete_test_case_method(SubLObject self, SubLObject old_test_case) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_category_method = NIL;
                SubLObject test_cases = get_test_category_test_cases(self);
                SubLObject lock = get_sunit_lockable_lock(self);
                try {
                    try {
                        {
                            SubLObject test_case = get_test_case_by_symbol(old_test_case);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == test_case) {
                                    Errors.error($str_alt148$_A_is_not_a_known_Test_Case, old_test_case);
                                }
                            }
                            {
                                SubLObject lock_9 = lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock_9);
                                    test_cases = remove(old_test_case, test_category_get_test_cases_method(self), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock_9);
                                    }
                                }
                            }
                            sublisp_throw($sym153$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_category_test_cases(self, test_cases);
                                set_sunit_lockable_lock(self, lock);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym153$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
                }
                return catch_var_for_test_category_method;
            }
        }
    }

    public static final SubLObject test_category_get_test_cases_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject test_cases = get_test_category_test_cases(self);
            try {
                try {
                    sublisp_throw($sym157$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, test_cases);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_test_cases(self, test_cases);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym157$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_set_test_cases_method(SubLObject self, SubLObject new_test_cases) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_category_method = NIL;
                SubLObject test_cases = get_test_category_test_cases(self);
                try {
                    try {
                        {
                            SubLObject cdolist_list_var = new_test_cases;
                            SubLObject new_test_case = NIL;
                            for (new_test_case = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , new_test_case = cdolist_list_var.first()) {
                                SubLTrampolineFile.checkType(new_test_case, SYMBOLP);
                                {
                                    SubLObject test_case = get_test_case_by_symbol(new_test_case);
                                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                        if (NIL == test_case) {
                                            Errors.error($str_alt148$_A_is_not_a_known_Test_Case, new_test_case);
                                        }
                                    }
                                }
                            }
                            test_cases = new_test_cases;
                            sublisp_throw($sym162$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, test_cases);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_category_test_cases(self, test_cases);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym162$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
                }
                return catch_var_for_test_category_method;
            }
        }
    }

    public static final SubLObject test_category_get_all_test_cases_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject test_cases = get_test_category_test_cases(self);
            SubLObject subcategories = get_test_category_subcategories(self);
            try {
                try {
                    {
                        SubLObject result = NIL;
                        SubLObject cdolist_list_var = subcategories;
                        SubLObject subcategory_name = NIL;
                        for (subcategory_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subcategory_name = cdolist_list_var.first()) {
                            {
                                SubLObject subcategory = get_test_category_by_name(subcategory_name);
                                result = union(result, methods.funcall_instance_method_with_0_args(subcategory, GET_ALL_TEST_CASES), UNPROVIDED, UNPROVIDED);
                            }
                        }
                        result = union(test_cases, result, UNPROVIDED, UNPROVIDED);
                        sublisp_throw($sym166$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, result);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_test_cases(self, test_cases);
                            set_test_category_subcategories(self, subcategories);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym166$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_get_suites_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject suites = get_test_category_suites(self);
            try {
                try {
                    sublisp_throw($sym170$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, suites);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_suites(self, suites);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym170$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_set_suites_method(SubLObject self, SubLObject suite_names) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_category_method = NIL;
                SubLObject suites = get_test_category_suites(self);
                try {
                    try {
                        {
                            SubLObject cdolist_list_var = suite_names;
                            SubLObject suite_name = NIL;
                            for (suite_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suite_name = cdolist_list_var.first()) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == test_suite_p(get_test_suite_by_name(suite_name))) {
                                        Errors.error($str_alt176$_A_is_not_a_known_instance_of_tes, suite_name);
                                    }
                                }
                            }
                            suites = suite_names;
                            sublisp_throw($sym175$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, suites);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_category_suites(self, suites);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym175$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
                }
                return catch_var_for_test_category_method;
            }
        }
    }

    public static final SubLObject test_category_add_suite_method(SubLObject self, SubLObject new_suite) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_category_method = NIL;
                SubLObject suites = get_test_category_suites(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == test_suite_p(get_test_suite_by_name(new_suite))) {
                                Errors.error($str_alt182$_A_is_not_a_known_instance_of_TES, new_suite);
                            }
                        }
                        {
                            SubLObject item_var = new_suite;
                            if (NIL == member(item_var, suites, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                suites = cons(item_var, suites);
                            }
                        }
                        sublisp_throw($sym181$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, suites);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_category_suites(self, suites);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym181$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
                }
                return catch_var_for_test_category_method;
            }
        }
    }

    public static final SubLObject test_category_delete_suite_method(SubLObject self, SubLObject old_suite) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_category_method = NIL;
                SubLObject suites = get_test_category_suites(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == test_suite_p(get_test_suite_by_name(old_suite))) {
                                Errors.error($str_alt182$_A_is_not_a_known_instance_of_TES, old_suite);
                            }
                        }
                        suites = remove(old_suite, suites, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        sublisp_throw($sym187$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, suites);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_category_suites(self, suites);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym187$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
                }
                return catch_var_for_test_category_method;
            }
        }
    }

    public static final SubLObject test_category_get_subcategories_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject subcategories = get_test_category_subcategories(self);
            try {
                try {
                    sublisp_throw($sym190$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, subcategories);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_subcategories(self, subcategories);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym190$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_set_subcategories_method(SubLObject self, SubLObject subcategory_names) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_category_method = NIL;
                SubLObject subcategories = get_test_category_subcategories(self);
                try {
                    try {
                        {
                            SubLObject cdolist_list_var = subcategory_names;
                            SubLObject subcategory_name = NIL;
                            for (subcategory_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subcategory_name = cdolist_list_var.first()) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == valid_test_category_name(subcategory_name)) {
                                        Errors.error($str_alt195$_A_is_not_a_known_test_category_n, subcategory_name);
                                    }
                                }
                            }
                            subcategories = subcategory_names;
                            sublisp_throw($sym194$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, subcategories);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_category_subcategories(self, subcategories);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym194$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
                }
                return catch_var_for_test_category_method;
            }
        }
    }

    public static final SubLObject test_category_add_subcategory_method(SubLObject self, SubLObject new_category_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_category_method = NIL;
                SubLObject subcategories = get_test_category_subcategories(self);
                try {
                    try {
                        SubLTrampolineFile.checkType(new_category_name, STRINGP);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == get_test_category_by_name(new_category_name)) {
                                Errors.error($str_alt200$_A_is_not_the_name_of_a_known_TES, new_category_name);
                            }
                        }
                        {
                            SubLObject item_var = new_category_name;
                            if (NIL == member(item_var, subcategories, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                subcategories = cons(item_var, subcategories);
                            }
                        }
                        sublisp_throw($sym199$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, subcategories);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_category_subcategories(self, subcategories);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym199$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
                }
                return catch_var_for_test_category_method;
            }
        }
    }

    public static final SubLObject test_category_delete_subcategory_method(SubLObject self, SubLObject old_subcategory_name) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject subcategories = get_test_category_subcategories(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject lock_10 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_10);
                            subcategories = remove(old_subcategory_name, subcategories, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_10);
                            }
                        }
                        sublisp_throw($sym205$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_subcategories(self, subcategories);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym205$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_add_supercategory_method(SubLObject self, SubLObject new_category_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_category_method = NIL;
                SubLObject supercategories = get_test_category_supercategories(self);
                try {
                    try {
                        SubLTrampolineFile.checkType(new_category_name, STRINGP);
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == get_test_category_by_name(new_category_name)) {
                                Errors.error($str_alt200$_A_is_not_the_name_of_a_known_TES, new_category_name);
                            }
                        }
                        {
                            SubLObject item_var = new_category_name;
                            if (NIL == member(item_var, supercategories, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                supercategories = cons(item_var, supercategories);
                            }
                        }
                        sublisp_throw($sym209$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, supercategories);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_category_supercategories(self, supercategories);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym209$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
                }
                return catch_var_for_test_category_method;
            }
        }
    }

    public static final SubLObject test_category_delete_supercategory_method(SubLObject self, SubLObject old_supercategory_name) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject supercategories = get_test_category_supercategories(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject lock_11 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_11);
                            supercategories = remove(old_supercategory_name, supercategories, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_11);
                            }
                        }
                        sublisp_throw($sym214$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_supercategories(self, supercategories);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym214$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_get_supercategories_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject supercategories = get_test_category_supercategories(self);
            try {
                try {
                    sublisp_throw($sym218$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, supercategories);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_supercategories(self, supercategories);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym218$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_set_supercategories_method(SubLObject self, SubLObject supercategory_names) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_category_method = NIL;
                SubLObject supercategories = get_test_category_supercategories(self);
                try {
                    try {
                        {
                            SubLObject cdolist_list_var = supercategory_names;
                            SubLObject supercategory_name = NIL;
                            for (supercategory_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supercategory_name = cdolist_list_var.first()) {
                                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                    if (NIL == valid_test_category_name(supercategory_name)) {
                                        Errors.error($str_alt195$_A_is_not_a_known_test_category_n, supercategory_name);
                                    }
                                }
                            }
                            supercategories = supercategory_names;
                            sublisp_throw($sym222$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, supercategories);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_category_supercategories(self, supercategories);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym222$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
                }
                return catch_var_for_test_category_method;
            }
        }
    }

    public static final SubLObject test_category_enabledp_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject enabled = get_test_category_enabled(self);
            try {
                try {
                    sublisp_throw($sym226$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, enabled);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_enabled(self, enabled);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym226$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_set_enabled_method(SubLObject self, SubLObject bool) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject enabled = get_test_category_enabled(self);
            try {
                try {
                    SubLTrampolineFile.checkType(bool, ATOM);
                    enabled = bool;
                    sublisp_throw($sym231$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, enabled);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_enabled(self, enabled);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym231$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject test_category_isolate_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_category_method = NIL;
            SubLObject test_cases = get_test_category_test_cases(self);
            SubLObject enabled = get_test_category_enabled(self);
            SubLObject suites = get_test_category_suites(self);
            SubLObject subcategories = get_test_category_subcategories(self);
            SubLObject supercategories = get_test_category_supercategories(self);
            SubLObject name = get_test_category_name(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject lock_12 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_12);
                            {
                                SubLObject cdolist_list_var = suites;
                                SubLObject suite = NIL;
                                for (suite = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suite = cdolist_list_var.first()) {
                                    {
                                        SubLObject old_suite = get_test_suite_by_name(suite);
                                        methods.funcall_instance_method_with_1_args(old_suite, DELETE_CATEGORY, test_category_get_name_method(self));
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = supercategories;
                                SubLObject supercategory = NIL;
                                for (supercategory = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supercategory = cdolist_list_var.first()) {
                                    {
                                        SubLObject old_super_category = get_test_category_by_name(supercategory);
                                        test_category_delete_supercategory_method(self, supercategory);
                                        methods.funcall_instance_method_with_1_args(old_super_category, DELETE_SUBCATEGORY, test_category_get_name_method(self));
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = subcategories;
                                SubLObject subcategory = NIL;
                                for (subcategory = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subcategory = cdolist_list_var.first()) {
                                    {
                                        SubLObject old_sub_category = get_test_category_by_name(subcategory);
                                        test_category_delete_subcategory_method(self, subcategory);
                                        methods.funcall_instance_method_with_1_args(old_sub_category, DELETE_SUPERCATEGORY, test_category_get_name_method(self));
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = test_cases;
                                SubLObject test_case = NIL;
                                for (test_case = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_case = cdolist_list_var.first()) {
                                    {
                                        SubLObject test_case_obj = get_test_case_by_symbol(test_case);
                                        methods.funcall_class_method_with_1_args(test_case_obj, DELETE_CATEGORY, test_category_get_name_method(self));
                                    }
                                }
                            }
                            name = NIL;
                            enabled = NIL;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_12);
                            }
                        }
                        remove_test_category_by_name(test_category_get_name_method(self));
                        object.object_isolate_method(self);
                        sublisp_throw($sym235$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_category_test_cases(self, test_cases);
                            set_test_category_enabled(self, enabled);
                            set_test_category_suites(self, suites);
                            set_test_category_subcategories(self, subcategories);
                            set_test_category_supercategories(self, supercategories);
                            set_test_category_name(self, name);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_category_method = Errors.handleThrowable(ccatch_env_var, $sym235$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD);
            }
            return catch_var_for_test_category_method;
        }
    }

    public static final SubLObject get_test_case_by_symbol(SubLObject test_case) {
        SubLTrampolineFile.checkType(test_case, SYMBOLP);
        return classes.classes_retrieve_class(test_case);
    }

    public static final SubLObject get_test_case_test_method(SubLObject test_case) {
        return classes.subloop_get_access_protected_instance_slot(test_case, TWO_INTEGER, TEST_METHOD);
    }

    public static final SubLObject set_test_case_test_method(SubLObject test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_case, value, TWO_INTEGER, TEST_METHOD);
    }

    public static final SubLObject get_test_case_result(SubLObject test_case) {
        return classes.subloop_get_access_protected_instance_slot(test_case, ONE_INTEGER, RESULT);
    }

    public static final SubLObject set_test_case_result(SubLObject test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_case, value, ONE_INTEGER, RESULT);
    }

    public static final SubLObject get_test_case_lock(SubLObject test_case) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LOCK, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_test_case_lock(SubLObject test_case, SubLObject value) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(LOCK, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), SIX_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject get_test_case_enabled(SubLObject test_case) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(ENABLED, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_test_case_enabled(SubLObject test_case, SubLObject value) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(ENABLED, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject get_test_case_test_methods(SubLObject test_case) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TEST_METHODS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_test_case_test_methods(SubLObject test_case, SubLObject value) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(TEST_METHODS, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), FOUR_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject get_test_case_suites(SubLObject test_case) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(SUITES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_test_case_suites(SubLObject test_case, SubLObject value) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(SUITES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), THREE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject get_test_case_categories(SubLObject test_case) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(CATEGORIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_test_case_categories(SubLObject test_case, SubLObject value) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(CATEGORIES, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), TWO_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject get_test_case_module(SubLObject test_case) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MODULE, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER);
            }
            return NIL;
        }
    }

    public static final SubLObject set_test_case_module(SubLObject test_case, SubLObject value) {
        {
            SubLObject v_class = (test_case.isSymbol()) ? ((SubLObject) (classes.classes_retrieve_class(test_case))) : NIL != subloop_structures.class_p(test_case) ? ((SubLObject) (test_case)) : NIL != subloop_structures.instance_p(test_case) ? ((SubLObject) (subloop_structures.instance_class(test_case))) : NIL;
            if (NIL != v_class) {
                classes.classes_access_check_class_slot(v_class, slots.slot_assoc(MODULE, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
                return set_aref(subloop_structures.class_any_slots(v_class), ONE_INTEGER, value);
            }
            return NIL;
        }
    }

    public static final SubLObject subloop_reserved_initialize_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        return NIL;
    }

    public static final SubLObject test_case_p(SubLObject test_case) {
        return classes.subloop_instanceof_class(test_case, TEST_CASE);
    }

    public static final SubLObject test_case_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject enabled = get_test_case_enabled(self);
            SubLObject test_method = get_test_case_test_method(self);
            SubLObject result = get_test_case_result(self);
            try {
                try {
                    object.object_initialize_method(self);
                    result = object.new_class_instance(TEST_RESULT);
                    test_method = TEST;
                    enabled = T;
                    sublisp_throw($sym245$OUTER_CATCH_FOR_TEST_CASE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_enabled(self, enabled);
                            set_test_case_test_method(self, test_method);
                            set_test_case_result(self, result);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym245$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_new_method(SubLObject self, SubLObject test_method) {
        {
            SubLObject new_instance = object.new_class_instance(self);
            methods.funcall_instance_method_with_1_args(new_instance, SET_TEST_METHOD, test_method);
            methods.funcall_instance_method_with_1_args(instances.get_slot(new_instance, RESULT), SET_TEST_CASE, subloop_structures.class_name(subloop_structures.instance_class(new_instance)));
            methods.funcall_instance_method_with_1_args(instances.get_slot(new_instance, RESULT), SET_TEST_METHOD, test_method);
            return new_instance;
        }
    }

    public static final SubLObject test_case_set_module_method(SubLObject self, SubLObject new_module) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject lock = get_test_case_lock(self);
            SubLObject module = get_test_case_module(self);
            try {
                try {
                    SubLTrampolineFile.checkType(new_module, MODULE_P);
                    modules.module_add_test_case(new_module, subloop_structures.class_name(self));
                    {
                        SubLObject lock_13 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_13);
                            module = new_module;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_13);
                            }
                        }
                    }
                    sublisp_throw($sym255$OUTER_CATCH_FOR_TEST_CASE_METHOD, module);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_lock(self, lock);
                            set_test_case_module(self, module);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym255$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_get_module_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject module = get_test_case_module(self);
            try {
                try {
                    sublisp_throw($sym260$OUTER_CATCH_FOR_TEST_CASE_METHOD, module);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_module(self, module);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym260$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_add_category_method(SubLObject self, SubLObject new_category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_case_method = NIL;
                SubLObject lock = get_test_case_lock(self);
                SubLObject categories = get_test_case_categories(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == get_test_category_by_name(new_category)) {
                                Errors.error($str_alt200$_A_is_not_the_name_of_a_known_TES, new_category);
                            }
                        }
                        {
                            SubLObject lock_14 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_14);
                                {
                                    SubLObject item_var = new_category;
                                    if (NIL == member(item_var, categories, symbol_function(EQL), symbol_function(IDENTITY))) {
                                        categories = cons(item_var, categories);
                                    }
                                }
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_14);
                                }
                            }
                        }
                        {
                            SubLObject category_obj = get_test_category_by_name(new_category);
                            methods.funcall_instance_method_with_1_args(category_obj, ADD_TEST_CASE, subloop_structures.class_name(self));
                        }
                        sublisp_throw($sym265$OUTER_CATCH_FOR_TEST_CASE_METHOD, categories);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_case_lock(self, lock);
                                set_test_case_categories(self, categories);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym265$OUTER_CATCH_FOR_TEST_CASE_METHOD);
                }
                return catch_var_for_test_case_method;
            }
        }
    }

    public static final SubLObject test_case_delete_category_method(SubLObject self, SubLObject old_category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_case_method = NIL;
                SubLObject lock = get_test_case_lock(self);
                SubLObject categories = get_test_case_categories(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == get_test_category_by_name(old_category)) {
                                Errors.error($str_alt200$_A_is_not_the_name_of_a_known_TES, old_category);
                            }
                        }
                        {
                            SubLObject lock_15 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_15);
                                categories = remove(old_category, categories, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_15);
                                }
                            }
                        }
                        {
                            SubLObject category_obj = get_test_category_by_name(old_category);
                            methods.funcall_instance_method_with_1_args(category_obj, DELETE_TEST_CASE, subloop_structures.class_name(self));
                        }
                        sublisp_throw($sym269$OUTER_CATCH_FOR_TEST_CASE_METHOD, categories);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_case_lock(self, lock);
                                set_test_case_categories(self, categories);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym269$OUTER_CATCH_FOR_TEST_CASE_METHOD);
                }
                return catch_var_for_test_case_method;
            }
        }
    }

    public static final SubLObject test_case_get_categories_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject categories = get_test_case_categories(self);
            try {
                try {
                    sublisp_throw($sym273$OUTER_CATCH_FOR_TEST_CASE_METHOD, categories);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_categories(self, categories);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym273$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_add_suite_method(SubLObject self, SubLObject new_suite) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_case_method = NIL;
                SubLObject lock = get_test_case_lock(self);
                SubLObject suites = get_test_case_suites(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == test_suite_p(get_test_suite_by_name(new_suite))) {
                                Errors.error($str_alt182$_A_is_not_a_known_instance_of_TES, new_suite);
                            }
                        }
                        {
                            SubLObject lock_16 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_16);
                                {
                                    SubLObject item_var = new_suite;
                                    if (NIL == member(item_var, suites, symbol_function(EQUAL), symbol_function(IDENTITY))) {
                                        suites = cons(item_var, suites);
                                    }
                                }
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_16);
                                }
                            }
                        }
                        sublisp_throw($sym276$OUTER_CATCH_FOR_TEST_CASE_METHOD, suites);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_case_lock(self, lock);
                                set_test_case_suites(self, suites);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym276$OUTER_CATCH_FOR_TEST_CASE_METHOD);
                }
                return catch_var_for_test_case_method;
            }
        }
    }

    public static final SubLObject test_case_delete_suite_method(SubLObject self, SubLObject old_suite) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_case_method = NIL;
                SubLObject lock = get_test_case_lock(self);
                SubLObject suites = get_test_case_suites(self);
                try {
                    try {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == test_suite_p(get_test_suite_by_name(old_suite))) {
                                Errors.error($str_alt182$_A_is_not_a_known_instance_of_TES, old_suite);
                            }
                        }
                        {
                            SubLObject lock_17 = lock;
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock_17);
                                suites = remove(old_suite, suites, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock_17);
                                }
                            }
                        }
                        sublisp_throw($sym279$OUTER_CATCH_FOR_TEST_CASE_METHOD, suites);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_case_lock(self, lock);
                                set_test_case_suites(self, suites);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym279$OUTER_CATCH_FOR_TEST_CASE_METHOD);
                }
                return catch_var_for_test_case_method;
            }
        }
    }

    public static final SubLObject test_case_get_suites_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject suites = get_test_case_suites(self);
            try {
                try {
                    sublisp_throw($sym281$OUTER_CATCH_FOR_TEST_CASE_METHOD, suites);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_suites(self, suites);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym281$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_get_test_methods_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject test_methods = get_test_case_test_methods(self);
            try {
                try {
                    sublisp_throw($sym285$OUTER_CATCH_FOR_TEST_CASE_METHOD, test_methods);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_test_methods(self, test_methods);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym285$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_initialize_lock_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject lock = get_test_case_lock(self);
            try {
                try {
                    lock = make_lock(format(NIL, $str_alt290$_A_lock, subloop_structures.class_name(self)));
                    sublisp_throw($sym289$OUTER_CATCH_FOR_TEST_CASE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym289$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_enabledp_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject enabled = get_test_case_enabled(self);
            try {
                try {
                    sublisp_throw($sym292$OUTER_CATCH_FOR_TEST_CASE_METHOD, enabled);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_enabled(self, enabled);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym292$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_set_enabled_method(SubLObject self, SubLObject v_boolean) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject lock = get_test_case_lock(self);
            SubLObject enabled = get_test_case_enabled(self);
            try {
                try {
                    SubLTrampolineFile.checkType(v_boolean, ATOM);
                    {
                        SubLObject lock_18 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_18);
                            enabled = v_boolean;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_18);
                            }
                        }
                    }
                    sublisp_throw($sym296$OUTER_CATCH_FOR_TEST_CASE_METHOD, enabled);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_lock(self, lock);
                            set_test_case_enabled(self, enabled);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym296$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_set_result_method(SubLObject self, SubLObject new_result) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject lock = get_test_case_lock(self);
            SubLObject result = get_test_case_result(self);
            try {
                try {
                    SubLTrampolineFile.checkType(new_result, TEST_RESULT_P);
                    {
                        SubLObject lock_19 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_19);
                            result = new_result;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_19);
                            }
                        }
                    }
                    sublisp_throw($sym300$OUTER_CATCH_FOR_TEST_CASE_METHOD, result);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_lock(self, lock);
                            set_test_case_result(self, result);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym300$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_get_result_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject result = get_test_case_result(self);
            try {
                try {
                    sublisp_throw($sym303$OUTER_CATCH_FOR_TEST_CASE_METHOD, result);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_result(self, result);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym303$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_set_test_method_method(SubLObject self, SubLObject method) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject lock = get_test_case_lock(self);
            SubLObject test_method = get_test_case_test_method(self);
            try {
                try {
                    {
                        SubLObject lock_20 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_20);
                            test_method = method;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_20);
                            }
                        }
                        sublisp_throw($sym306$OUTER_CATCH_FOR_TEST_CASE_METHOD, test_method);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_lock(self, lock);
                            set_test_case_test_method(self, test_method);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym306$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_get_test_method_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject test_method = get_test_case_test_method(self);
            try {
                try {
                    sublisp_throw($sym308$OUTER_CATCH_FOR_TEST_CASE_METHOD, test_method);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_test_method(self, test_method);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym308$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }

    public static final SubLObject test_case_setup_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject test_case_cleanup_method(SubLObject self) {
        return NIL;
    }

    public static final SubLObject test_case_test_method(SubLObject self) {
        return Errors.error($str_alt316$Method_TEST_for_class_TEST_CASE_i);
    }

    /**
     * If VALUE is NIL, register a failure and record EXPLANATION as its explanation.
     */
    public static final SubLObject test_case_fail_unless_method(SubLObject self, SubLObject value, SubLObject explanation) {
        if (NIL == value) {
            test_case_fail_method(self, explanation);
        }
        return NIL;
    }

    /**
     * If VALUE is non-NIL, register a failure and record EXPLANATION as its explanation.
     */
    public static final SubLObject test_case_fail_if_method(SubLObject self, SubLObject value, SubLObject explanation) {
        if (NIL != value) {
            test_case_fail_method(self, explanation);
        }
        return NIL;
    }

    /**
     * If ITEM1 and ITEM2 are equal, register a failure and record EXPLANATION
     * as its explanation. If TEST is not provided, #'EQL is used to test the
     * equality of ITEM1 and ITEM2.
     */
    public static final SubLObject test_case_fail_if_equal_method(SubLObject self, SubLObject item1, SubLObject item2, SubLObject explanation, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject returned = funcall(test, item1, item2);
            if (NIL != returned) {
                {
                    SubLObject augmented_explanation = cconcatenate(explanation, format(NIL, $str_alt328$____Specifically___A_and__A_shoul, new SubLObject[]{ item1, item2, test }));
                    test_case_fail_method(self, augmented_explanation);
                }
            }
            return NIL;
        }
    }

    /**
     * If ITEM1 and ITEM2 are not equal, register a failure and record EXPLANATION
     * as its explanation. If TEST is not provided, #'EQL is used to test the
     * equality of ITEM1 and ITEM2.
     */
    public static final SubLObject test_case_fail_unless_equal_method(SubLObject self, SubLObject item1, SubLObject item2, SubLObject explanation, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject returned = funcall(test, item1, item2);
            if (NIL == returned) {
                {
                    SubLObject augmented_explanation = cconcatenate(explanation, format(NIL, $str_alt332$____Specifically___A_and__A_shoul, new SubLObject[]{ item1, item2, test }));
                    test_case_fail_method(self, augmented_explanation);
                }
            }
            return NIL;
        }
    }

    /**
     * If calling EVAL on EXPRESSION triggers an error, signal a test failure
     * and record EXPLANATION as its explanation.
     */
    public static final SubLObject test_case_fail_if_error_method(SubLObject self, SubLObject expression, SubLObject explanation) {
        {
            SubLObject message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            eval(expression);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL != message) {
                test_case_fail_method(self, explanation);
            }
            return NIL;
        }
    }

    /**
     * If calling EVAL on EXPRESSION does not trigger an error, signal a test failure
     * and record EXPLANATION as its explanation.
     */
    public static final SubLObject test_case_fail_unless_error_method(SubLObject self, SubLObject expression, SubLObject explanation) {
        {
            SubLObject message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            eval(expression);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                message = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            }
            if (NIL == message) {
                test_case_fail_method(self, explanation);
            }
            return NIL;
        }
    }

    /**
     * Simply signal a test failure and record EXPLANATION as its explanation.
     */
    public static final SubLObject test_case_fail_method(SubLObject self, SubLObject explanation) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_case_method = NIL;
                SubLObject result = get_test_case_result(self);
                try {
                    try {
                        test_result_set_result_method(result, $FAIL);
                        test_result_set_explanation_method(result, explanation);
                        if (NIL != $sunit_break_on_failure$.getDynamicValue(thread)) {
                            Errors.sublisp_break(cconcatenate($str_alt347$SUnit_Failure__, explanation), EMPTY_SUBL_OBJECT_ARRAY);
                        }
                        sublisp_throw(SUNIT_FAILURE, NIL);
                        sublisp_throw($sym345$OUTER_CATCH_FOR_TEST_CASE_METHOD, NIL);
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_case_result(self, result);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym345$OUTER_CATCH_FOR_TEST_CASE_METHOD);
                }
                return catch_var_for_test_case_method;
            }
        }
    }

    public static final SubLObject test_case_isolate_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_case_method = NIL;
            SubLObject lock = get_test_case_lock(self);
            SubLObject enabled = get_test_case_enabled(self);
            SubLObject test_method = get_test_case_test_method(self);
            SubLObject result = get_test_case_result(self);
            try {
                try {
                    methods.funcall_instance_method_with_0_args(result, ISOLATE);
                    {
                        SubLObject lock_21 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_21);
                            result = NIL;
                            test_method = NIL;
                            enabled = NIL;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_21);
                            }
                        }
                    }
                    object.object_isolate_method(self);
                    sublisp_throw($sym351$OUTER_CATCH_FOR_TEST_CASE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_case_lock(self, lock);
                            set_test_case_enabled(self, enabled);
                            set_test_case_test_method(self, test_method);
                            set_test_case_result(self, result);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym351$OUTER_CATCH_FOR_TEST_CASE_METHOD);
            }
            return catch_var_for_test_case_method;
        }
    }



    // deflexical
    private static final SubLSymbol $test_suite_dictionary_lock$ = makeSymbol("*TEST-SUITE-DICTIONARY-LOCK*");

    public static final SubLObject get_test_suite_by_name(SubLObject name) {
        SubLTrampolineFile.checkType(name, STRINGP);
        return gethash(name, $test_suite_dictionary$.getGlobalValue(), UNPROVIDED);
    }

    public static final SubLObject valid_test_suite_name(SubLObject name) {
        return list_utilities.sublisp_boolean(get_test_suite_by_name(name));
    }

    public static final SubLObject store_test_suite_by_name(SubLObject name, SubLObject test_suite) {
        SubLTrampolineFile.checkType(name, STRINGP);
        SubLTrampolineFile.checkType(test_suite, TEST_SUITE_P);
        {
            SubLObject result = NIL;
            SubLObject lock = $test_suite_dictionary_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                result = sethash(name, $test_suite_dictionary$.getGlobalValue(), test_suite);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return result;
        }
    }

    public static final SubLObject remove_test_suite_by_name(SubLObject test_suite_name) {
        SubLTrampolineFile.checkType(test_suite_name, STRINGP);
        {
            SubLObject test_suite = get_test_suite_by_name(test_suite_name);
            if (NIL == test_suite_p(test_suite)) {
                Errors.cerror($$$Skip_removal_attempt, $str_alt356$_A_is_not_the_name_of_a_known_tes, test_suite_name);
                return NIL;
            }
            {
                SubLObject result = NIL;
                SubLObject lock = $test_suite_dictionary_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = remhash(test_suite_name, $test_suite_dictionary$.getGlobalValue());
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject get_test_suite_enabled(SubLObject test_suite) {
        return classes.subloop_get_instance_slot(test_suite, SIX_INTEGER);
    }

    public static final SubLObject set_test_suite_enabled(SubLObject test_suite, SubLObject value) {
        return classes.subloop_set_instance_slot(test_suite, value, SIX_INTEGER);
    }

    public static final SubLObject get_test_suite_test_cases(SubLObject test_suite) {
        return classes.subloop_get_instance_slot(test_suite, FIVE_INTEGER);
    }

    public static final SubLObject set_test_suite_test_cases(SubLObject test_suite, SubLObject value) {
        return classes.subloop_set_instance_slot(test_suite, value, FIVE_INTEGER);
    }

    public static final SubLObject get_test_suite_modules(SubLObject test_suite) {
        return classes.subloop_get_instance_slot(test_suite, FOUR_INTEGER);
    }

    public static final SubLObject set_test_suite_modules(SubLObject test_suite, SubLObject value) {
        return classes.subloop_set_instance_slot(test_suite, value, FOUR_INTEGER);
    }

    public static final SubLObject get_test_suite_categories(SubLObject test_suite) {
        return classes.subloop_get_instance_slot(test_suite, THREE_INTEGER);
    }

    public static final SubLObject set_test_suite_categories(SubLObject test_suite, SubLObject value) {
        return classes.subloop_set_instance_slot(test_suite, value, THREE_INTEGER);
    }

    public static final SubLObject get_test_suite_name(SubLObject test_suite) {
        return classes.subloop_get_instance_slot(test_suite, TWO_INTEGER);
    }

    public static final SubLObject set_test_suite_name(SubLObject test_suite, SubLObject value) {
        return classes.subloop_set_instance_slot(test_suite, value, TWO_INTEGER);
    }

    public static final SubLObject subloop_reserved_initialize_test_suite_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_suite_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SUNIT_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SUITE, NAME, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SUITE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SUITE, MODULES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SUITE, TEST_CASES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SUITE, ENABLED, NIL);
        return NIL;
    }

    public static final SubLObject test_suite_p(SubLObject test_suite) {
        return classes.subloop_instanceof_class(test_suite, TEST_SUITE);
    }

    public static final SubLObject test_suite_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject enabled = get_test_suite_enabled(self);
            SubLObject test_cases = get_test_suite_test_cases(self);
            SubLObject v_modules = get_test_suite_modules(self);
            SubLObject categories = get_test_suite_categories(self);
            SubLObject name = get_test_suite_name(self);
            try {
                try {
                    sunit_lockable_initialize_method(self);
                    name = $str_alt28$;
                    categories = NIL;
                    v_modules = NIL;
                    test_cases = NIL;
                    enabled = T;
                    sublisp_throw($sym363$OUTER_CATCH_FOR_TEST_SUITE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_enabled(self, enabled);
                            set_test_suite_test_cases(self, test_cases);
                            set_test_suite_modules(self, v_modules);
                            set_test_suite_categories(self, categories);
                            set_test_suite_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym363$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    public static final SubLObject test_suite_new_method(SubLObject self, SubLObject new_name, SubLObject new_categories, SubLObject new_module_structs, SubLObject new_test_cases) {
        if (new_categories == UNPROVIDED) {
            new_categories = NIL;
        }
        if (new_module_structs == UNPROVIDED) {
            new_module_structs = NIL;
        }
        if (new_test_cases == UNPROVIDED) {
            new_test_cases = NIL;
        }
        {
            SubLObject new_instance = object.new_class_instance(self);
            store_test_suite_by_name(new_name, new_instance);
            methods.funcall_instance_method_with_1_args(new_instance, SET_NAME, new_name);
            {
                SubLObject cdolist_list_var = new_categories;
                SubLObject cat = NIL;
                for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                    methods.funcall_instance_method_with_1_args(new_instance, ADD_CATEGORY, cat);
                }
            }
            {
                SubLObject cdolist_list_var = new_module_structs;
                SubLObject mod = NIL;
                for (mod = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mod = cdolist_list_var.first()) {
                    methods.funcall_instance_method_with_1_args(new_instance, ADD_MODULE, mod);
                }
            }
            {
                SubLObject cdolist_list_var = new_test_cases;
                SubLObject tc = NIL;
                for (tc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tc = cdolist_list_var.first()) {
                    methods.funcall_instance_method_with_1_args(new_instance, ADD_TEST_CASE, tc);
                }
            }
            return new_instance;
        }
    }

    public static final SubLObject test_suite_get_name_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject name = get_test_suite_name(self);
            try {
                try {
                    sublisp_throw($sym369$OUTER_CATCH_FOR_TEST_SUITE_METHOD, name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_name(self, name);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym369$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    public static final SubLObject test_suite_set_name_method(SubLObject self, SubLObject new_name) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject name = get_test_suite_name(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    SubLTrampolineFile.checkType(new_name, STRINGP);
                    if (name.isString()) {
                        if (!($str_alt28$.equal(name) || name.equal(new_name))) {
                            remove_test_suite_by_name(name);
                        }
                    }
                    {
                        SubLObject lock_22 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_22);
                            name = new_name;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_22);
                            }
                        }
                    }
                    store_test_suite_by_name(name, self);
                    sublisp_throw($sym373$OUTER_CATCH_FOR_TEST_SUITE_METHOD, name);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_name(self, name);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym373$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    public static final SubLObject test_suite_add_category_method(SubLObject self, SubLObject new_category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_suite_method = NIL;
                SubLObject categories = get_test_suite_categories(self);
                SubLObject lock = get_sunit_lockable_lock(self);
                try {
                    try {
                        {
                            SubLObject category = get_test_category_by_name(new_category);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == category) {
                                    Errors.error($str_alt377$_A_isn_t_the_name_of_a_known_test, new_category);
                                }
                            }
                            {
                                SubLObject lock_23 = lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock_23);
                                    categories = union(list(new_category), test_suite_get_categories_method(self), symbol_function(EQUAL), UNPROVIDED);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock_23);
                                    }
                                }
                            }
                            methods.funcall_instance_method_with_1_args(category, ADD_SUITE, test_suite_get_name_method(self));
                            sublisp_throw($sym376$OUTER_CATCH_FOR_TEST_SUITE_METHOD, test_suite_get_categories_method(self));
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_suite_categories(self, categories);
                                set_sunit_lockable_lock(self, lock);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym376$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
                }
                return catch_var_for_test_suite_method;
            }
        }
    }

    public static final SubLObject test_suite_delete_category_method(SubLObject self, SubLObject old_category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_suite_method = NIL;
                SubLObject categories = get_test_suite_categories(self);
                SubLObject lock = get_sunit_lockable_lock(self);
                try {
                    try {
                        {
                            SubLObject category = get_test_category_by_name(old_category);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == category) {
                                    Errors.error($str_alt377$_A_isn_t_the_name_of_a_known_test, old_category);
                                }
                            }
                            {
                                SubLObject lock_24 = lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock_24);
                                    categories = remove(old_category, test_suite_get_categories_method(self), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock_24);
                                    }
                                }
                            }
                            methods.funcall_instance_method_with_1_args(category, DELETE_SUITE, test_suite_get_name_method(self));
                            sublisp_throw($sym380$OUTER_CATCH_FOR_TEST_SUITE_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_suite_categories(self, categories);
                                set_sunit_lockable_lock(self, lock);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym380$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
                }
                return catch_var_for_test_suite_method;
            }
        }
    }

    public static final SubLObject test_suite_get_categories_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject categories = get_test_suite_categories(self);
            try {
                try {
                    sublisp_throw($sym382$OUTER_CATCH_FOR_TEST_SUITE_METHOD, categories);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_categories(self, categories);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym382$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    public static final SubLObject test_suite_add_module_method(SubLObject self, SubLObject new_module_struct) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject v_modules = get_test_suite_modules(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    SubLTrampolineFile.checkType(new_module_struct, MODULE_P);
                    {
                        SubLObject lock_25 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_25);
                            v_modules = union(list(new_module_struct), test_suite_get_modules_method(self), symbol_function(EQUAL), UNPROVIDED);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_25);
                            }
                        }
                    }
                    modules.module_add_test_suite(new_module_struct, test_suite_get_name_method(self));
                    sublisp_throw($sym386$OUTER_CATCH_FOR_TEST_SUITE_METHOD, test_suite_get_modules_method(self));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_modules(self, v_modules);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym386$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    public static final SubLObject test_suite_delete_module_method(SubLObject self, SubLObject old_module_struct) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject v_modules = get_test_suite_modules(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    SubLTrampolineFile.checkType(old_module_struct, MODULE_P);
                    {
                        SubLObject lock_26 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_26);
                            v_modules = remove(old_module_struct, test_suite_get_modules_method(self), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_26);
                            }
                        }
                    }
                    modules.module_remove_test_suite(old_module_struct, test_suite_get_name_method(self));
                    sublisp_throw($sym391$OUTER_CATCH_FOR_TEST_SUITE_METHOD, test_suite_get_modules_method(self));
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_modules(self, v_modules);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym391$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    public static final SubLObject test_suite_get_modules_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject v_modules = get_test_suite_modules(self);
            try {
                try {
                    sublisp_throw($sym395$OUTER_CATCH_FOR_TEST_SUITE_METHOD, v_modules);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_modules(self, v_modules);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym395$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    public static final SubLObject test_suite_add_test_case_method(SubLObject self, SubLObject new_test_case) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_suite_method = NIL;
                SubLObject test_cases = get_test_suite_test_cases(self);
                SubLObject lock = get_sunit_lockable_lock(self);
                try {
                    try {
                        {
                            SubLObject test_case = get_test_case_by_symbol(new_test_case);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == test_case) {
                                    Errors.error($str_alt148$_A_is_not_a_known_Test_Case, new_test_case);
                                }
                            }
                            {
                                SubLObject lock_27 = lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock_27);
                                    test_cases = union(list(new_test_case), test_suite_get_test_cases_method(self), UNPROVIDED, UNPROVIDED);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock_27);
                                    }
                                }
                            }
                            methods.funcall_class_method_with_1_args(test_case, ADD_SUITE, test_suite_get_name_method(self));
                            sublisp_throw($sym398$OUTER_CATCH_FOR_TEST_SUITE_METHOD, test_suite_get_test_cases_method(self));
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_suite_test_cases(self, test_cases);
                                set_sunit_lockable_lock(self, lock);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym398$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
                }
                return catch_var_for_test_suite_method;
            }
        }
    }

    public static final SubLObject test_suite_delete_test_case_method(SubLObject self, SubLObject old_test_case) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_suite_method = NIL;
                SubLObject test_cases = get_test_suite_test_cases(self);
                SubLObject lock = get_sunit_lockable_lock(self);
                try {
                    try {
                        {
                            SubLObject test_case = get_test_case_by_symbol(old_test_case);
                            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                if (NIL == test_case) {
                                    Errors.error($str_alt148$_A_is_not_a_known_Test_Case, old_test_case);
                                }
                            }
                            {
                                SubLObject lock_28 = lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock_28);
                                    test_cases = remove(old_test_case, test_suite_get_test_cases_method(self), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock_28);
                                    }
                                }
                            }
                            methods.funcall_class_method_with_1_args(test_case, DELETE_SUITE, test_suite_get_name_method(self));
                            sublisp_throw($sym401$OUTER_CATCH_FOR_TEST_SUITE_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_suite_test_cases(self, test_cases);
                                set_sunit_lockable_lock(self, lock);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym401$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
                }
                return catch_var_for_test_suite_method;
            }
        }
    }

    public static final SubLObject test_suite_get_test_cases_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject test_cases = get_test_suite_test_cases(self);
            try {
                try {
                    sublisp_throw($sym403$OUTER_CATCH_FOR_TEST_SUITE_METHOD, test_cases);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_test_cases(self, test_cases);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym403$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    public static final SubLObject test_suite_enabledp_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject enabled = get_test_suite_enabled(self);
            try {
                try {
                    sublisp_throw($sym405$OUTER_CATCH_FOR_TEST_SUITE_METHOD, enabled);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_enabled(self, enabled);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym405$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    public static final SubLObject test_suite_set_enabled_method(SubLObject self, SubLObject v_boolean) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject enabled = get_test_suite_enabled(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    SubLTrampolineFile.checkType(v_boolean, ATOM);
                    {
                        SubLObject lock_29 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_29);
                            enabled = v_boolean;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_29);
                            }
                        }
                    }
                    sublisp_throw($sym408$OUTER_CATCH_FOR_TEST_SUITE_METHOD, v_boolean);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_enabled(self, enabled);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym408$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    /**
     * Retrieve all test case classes either directly in this test suite or
     * in one of its included modules or categories
     */
    public static final SubLObject test_suite_get_all_test_cases_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject v_modules = get_test_suite_modules(self);
            SubLObject categories = get_test_suite_categories(self);
            try {
                try {
                    {
                        SubLObject all_test_cases = test_suite_get_test_cases_method(self);
                        {
                            SubLObject cdolist_list_var = v_modules;
                            SubLObject module_struct = NIL;
                            for (module_struct = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_struct = cdolist_list_var.first()) {
                                all_test_cases = nunion(all_test_cases, modules.module_get_test_cases(module_struct), UNPROVIDED, UNPROVIDED);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = categories;
                            SubLObject category_name = NIL;
                            for (category_name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , category_name = cdolist_list_var.first()) {
                                {
                                    SubLObject category = get_test_category_by_name(category_name);
                                    all_test_cases = nunion(all_test_cases, methods.funcall_instance_method_with_0_args(category, GET_ALL_TEST_CASES), UNPROVIDED, UNPROVIDED);
                                }
                            }
                        }
                        sublisp_throw($sym411$OUTER_CATCH_FOR_TEST_SUITE_METHOD, all_test_cases);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_modules(self, v_modules);
                            set_test_suite_categories(self, categories);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym411$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    public static final SubLObject test_suite_isolate_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_suite_method = NIL;
            SubLObject enabled = get_test_suite_enabled(self);
            SubLObject test_cases = get_test_suite_test_cases(self);
            SubLObject v_modules = get_test_suite_modules(self);
            SubLObject categories = get_test_suite_categories(self);
            SubLObject name = get_test_suite_name(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    {
                        SubLObject lock_30 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_30);
                            {
                                SubLObject cdolist_list_var = v_modules;
                                SubLObject module = NIL;
                                for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                    test_suite_delete_module_method(self, module);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = categories;
                                SubLObject category = NIL;
                                for (category = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , category = cdolist_list_var.first()) {
                                    test_suite_delete_category_method(self, category);
                                }
                            }
                            {
                                SubLObject cdolist_list_var = test_cases;
                                SubLObject test_case = NIL;
                                for (test_case = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_case = cdolist_list_var.first()) {
                                    test_suite_delete_test_case_method(self, test_case);
                                }
                            }
                            name = NIL;
                            enabled = NIL;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_30);
                            }
                        }
                        remove_test_suite_by_name(test_suite_get_name_method(self));
                        object.object_isolate_method(self);
                        sublisp_throw($sym414$OUTER_CATCH_FOR_TEST_SUITE_METHOD, NIL);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_suite_enabled(self, enabled);
                            set_test_suite_test_cases(self, test_cases);
                            set_test_suite_modules(self, v_modules);
                            set_test_suite_categories(self, categories);
                            set_test_suite_name(self, name);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_suite_method = Errors.handleThrowable(ccatch_env_var, $sym414$OUTER_CATCH_FOR_TEST_SUITE_METHOD);
            }
            return catch_var_for_test_suite_method;
        }
    }

    public static final SubLObject get_test_runner_stream(SubLObject test_runner) {
        return classes.subloop_get_access_protected_instance_slot(test_runner, TWO_INTEGER, STREAM);
    }

    public static final SubLObject set_test_runner_stream(SubLObject test_runner, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_runner, value, TWO_INTEGER, STREAM);
    }

    public static final SubLObject subloop_reserved_initialize_test_runner_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_runner_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, SUNIT_LOCKABLE, LOCK, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_RUNNER, STREAM, NIL);
        return NIL;
    }

    public static final SubLObject test_runner_p(SubLObject test_runner) {
        return classes.subloop_instanceof_class(test_runner, TEST_RUNNER);
    }

    public static final SubLObject test_runner_set_stream_method(SubLObject self, SubLObject new_stream) {
        {
            SubLObject catch_var_for_test_runner_method = NIL;
            SubLObject stream = get_test_runner_stream(self);
            SubLObject lock = get_sunit_lockable_lock(self);
            try {
                try {
                    SubLTrampolineFile.checkType(new_stream, STREAMP);
                    {
                        SubLObject lock_31 = lock;
                        SubLObject release = NIL;
                        try {
                            release = seize_lock(lock_31);
                            stream = new_stream;
                        } finally {
                            if (NIL != release) {
                                release_lock(lock_31);
                            }
                        }
                    }
                    sublisp_throw($sym424$OUTER_CATCH_FOR_TEST_RUNNER_METHOD, stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_runner_stream(self, stream);
                            set_sunit_lockable_lock(self, lock);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_runner_method = Errors.handleThrowable(ccatch_env_var, $sym424$OUTER_CATCH_FOR_TEST_RUNNER_METHOD);
            }
            return catch_var_for_test_runner_method;
        }
    }

    public static final SubLObject test_runner_get_stream_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_runner_method = NIL;
            SubLObject stream = get_test_runner_stream(self);
            try {
                try {
                    sublisp_throw($sym429$OUTER_CATCH_FOR_TEST_RUNNER_METHOD, stream);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_runner_stream(self, stream);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_runner_method = Errors.handleThrowable(ccatch_env_var, $sym429$OUTER_CATCH_FOR_TEST_RUNNER_METHOD);
            }
            return catch_var_for_test_runner_method;
        }
    }

    public static final SubLObject test_runner_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_test_runner_method = NIL;
            SubLObject stream = get_test_runner_stream(self);
            try {
                try {
                    sunit_lockable_initialize_method(self);
                    stream = T;
                    sublisp_throw($sym432$OUTER_CATCH_FOR_TEST_RUNNER_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_test_runner_stream(self, stream);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_test_runner_method = Errors.handleThrowable(ccatch_env_var, $sym432$OUTER_CATCH_FOR_TEST_RUNNER_METHOD);
            }
            return catch_var_for_test_runner_method;
        }
    }

    public static final SubLObject test_runner_new_method(SubLObject self, SubLObject new_stream) {
        if (new_stream == UNPROVIDED) {
            new_stream = NIL;
        }
        {
            SubLObject new_instance = object.new_class_instance(self);
            if (NIL != new_stream) {
                methods.funcall_instance_method_with_1_args(new_instance, SET_STREAM, new_stream);
            }
            return new_instance;
        }
    }

    /**
     * Runs the given test-case instance or test-suite instance and outputs
     * the result to the test-runner's stream
     */
    public static final SubLObject test_runner_run_method(SubLObject self, SubLObject test_case_or_suite) {
        {
            SubLObject return_value = NIL;
            if (NIL != test_case_p(test_case_or_suite)) {
                return_value = test_runner_run_test_case_method(self, test_case_or_suite);
            } else
                if (NIL != test_suite_p(test_case_or_suite)) {
                    return_value = test_runner_run_test_suite_method(self, test_case_or_suite);
                } else {
                    Errors.error($str_alt440$_A_is_not_an_instance_of_TEST_CAS, test_case_or_suite);
                }

            return return_value;
        }
    }

    public static final SubLObject test_runner_run_test_case_method(SubLObject self, SubLObject test_case) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_test_runner_method = NIL;
                SubLObject stream = get_test_runner_stream(self);
                try {
                    try {
                        {
                            SubLObject result = methods.funcall_instance_method_with_0_args(test_case, GET_RESULT);
                            SubLObject stream_32 = test_runner_get_stream_method(self);
                            SubLObject start_time = NIL;
                            SubLObject end_time = NIL;
                            SubLObject return_value = NIL;
                            SubLObject setup_error = NIL;
                            SubLObject cleanup_error = NIL;
                            SubLObject runtime_error = NIL;
                            SubLObject failure = NIL;
                            try {
                                {
                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_SUNIT_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject result_33 = methods.safe_funcall_instance_method_with_0_args(test_case, SETUP);
                                                SubLObject problem_code = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != problem_code) {
                                                    test_runner_handle_problem_code_method(self, problem_code, test_case, SETUP);
                                                }
                                            }
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                setup_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            if (NIL != setup_error) {
                                methods.funcall_instance_method_with_2_args(result, NOTE_ERROR, setup_error, $SETUP);
                            } else {
                                try {
                                    try {
                                        {
                                            SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_SUNIT_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    start_time = get_universal_time();
                                                    thread.resetMultipleValues();
                                                    {
                                                        SubLObject result_34 = methods.safe_funcall_instance_method_with_0_args(test_case, methods.funcall_instance_method_with_0_args(test_case, GET_TEST_METHOD));
                                                        SubLObject problem_code = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != problem_code) {
                                                            test_runner_handle_problem_code_method(self, problem_code, test_case, methods.funcall_instance_method_with_0_args(test_case, GET_TEST_METHOD));
                                                        }
                                                    }
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        runtime_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    failure = Errors.handleThrowable(ccatch_env_var, SUNIT_FAILURE);
                                }
                                end_time = get_universal_time();
                                methods.funcall_instance_method_with_1_args(result, SET_TIME, subtract(end_time, start_time));
                                if (NIL != runtime_error) {
                                    methods.funcall_instance_method_with_2_args(result, NOTE_ERROR, runtime_error, $EXECUTION);
                                }
                            }
                            try {
                                {
                                    SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_SUNIT_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject result_35 = methods.safe_funcall_instance_method_with_0_args(test_case, CLEANUP);
                                                SubLObject problem_code = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != problem_code) {
                                                    test_runner_handle_problem_code_method(self, problem_code, test_case, CLEANUP);
                                                }
                                            }
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                cleanup_error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
                            }
                            if ((NIL != cleanup_error) && (NIL == setup_error)) {
                                methods.funcall_instance_method_with_2_args(result, NOTE_ERROR, cleanup_error, $CLEANUP);
                            }
                            methods.funcall_instance_method_with_1_args(result, FORMAT, stream_32);
                            return_value = methods.funcall_instance_method_with_0_args(result, GET_RESULT);
                            sublisp_throw($sym445$OUTER_CATCH_FOR_TEST_RUNNER_METHOD, return_value);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_test_runner_stream(self, stream);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_test_runner_method = Errors.handleThrowable(ccatch_env_var, $sym445$OUTER_CATCH_FOR_TEST_RUNNER_METHOD);
                }
                return catch_var_for_test_runner_method;
            }
        }
    }

    public static final SubLObject test_runner_handle_problem_code_method(SubLObject self, SubLObject problem_code, SubLObject test_case_subclass, SubLObject method) {
        {
            SubLObject definer = (method.eql(SETUP)) ? ((SubLObject) (DEF_SETUP_METHOD)) : method.eql(CLEANUP) ? ((SubLObject) (DEF_CLEANUP_METHOD)) : DEF_TEST_METHOD;
            SubLObject pcase_var = problem_code;
            if (pcase_var.eql($UNDEFINED_METHOD)) {
                Errors.error($str_alt455$_A_is_not_a_defined_method_of__A_, method, test_case_subclass, definer);
            } else
                if (pcase_var.eql($UNDECLARED_METHOD)) {
                    Errors.error($str_alt457$_A_is_not_a_declared_method_of__A, method, test_case_subclass, definer);
                } else
                    if (((((pcase_var.eql($INVALID_METHOD_NAME) || pcase_var.eql($TARGET_NOT_AN_INSTANCE)) || pcase_var.eql($TARGET_NOT_AN_INSTANCE)) || pcase_var.eql($TARGET_METHOD_CONFLICT)) || pcase_var.eql($TARGET_NOT_A_CLASS)) || pcase_var.eql($ACCESS_LEVEL_CONFLICT)) {
                        Errors.error($str_alt463$SAFE_FUNCALL_INSTANCE_METHOD_enco, problem_code, method, test_case_subclass);
                    } else {
                        Errors.error($str_alt464$Unknown_problem_code__A, problem_code);
                    }


            return NIL;
        }
    }

    public static final SubLObject test_runner_run_test_suite_method(SubLObject self, SubLObject test_suite) {
        {
            SubLObject test_case_classes = methods.funcall_instance_method_with_0_args(test_suite, GET_ALL_TEST_CASES);
            SubLObject return_value = $SUCCESS;
            SubLObject last_return = NIL;
            SubLObject cdolist_list_var = test_case_classes;
            SubLObject test_case_class = NIL;
            for (test_case_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_case_class = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_36 = methods.funcall_class_method_with_0_args(test_case_class, GET_TEST_METHODS);
                    SubLObject test_method = NIL;
                    for (test_method = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , test_method = cdolist_list_var_36.first()) {
                        {
                            SubLObject test_case_instance = methods.funcall_class_method_with_1_args(test_case_class, NEW, test_method);
                            last_return = test_runner_run_test_case_method(self, test_case_instance);
                            if (last_return != $SUCCESS) {
                                return_value = last_return;
                            }
                            methods.funcall_instance_method_with_0_args(test_case_instance, ISOLATE);
                        }
                    }
                }
            }
            return return_value;
        }
    }

    public static final SubLObject get_cycl_test_case_constants(SubLObject cycl_test_case) {
        return classes.subloop_get_access_protected_instance_slot(cycl_test_case, THREE_INTEGER, CONSTANTS);
    }

    public static final SubLObject set_cycl_test_case_constants(SubLObject cycl_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(cycl_test_case, value, THREE_INTEGER, CONSTANTS);
    }

    public static final SubLObject subloop_reserved_initialize_cycl_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cycl_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_TEST_CASE, CONSTANTS, NIL);
        return NIL;
    }

    public static final SubLObject cycl_test_case_p(SubLObject cycl_test_case) {
        return classes.subloop_instanceof_class(cycl_test_case, CYCL_TEST_CASE);
    }

    /**
     * Creates a new test constant with a unique name based on NAME, and asserts
     * that it's an instance of COLLECTION in MT.  Constants created this way are
     * saved on the member variable CONSTANTS, so that they will be killed during
     * cleanup.
     */
    public static final SubLObject cycl_test_case_new_test_constant_method(SubLObject self, SubLObject name, SubLObject collection, SubLObject mt) {
        SubLTrampolineFile.checkType(name, STRINGP);
        SubLTrampolineFile.checkType(collection, COLLECTION_P);
        {
            SubLObject new_constant = methods.funcall_instance_method_with_1_args(self, CREATE_TEST_CONSTANT, name);
            SubLObject v_isa = constants_high.find_constant($$$isa);
            if (NIL != v_isa) {
                cycl_test_case_do_asserts_method(self, list(list(v_isa, new_constant, collection)), mt);
            }
            return new_constant;
        }
    }

    /**
     * Assert each sentence in SENTENCES in MT.
     */
    public static final SubLObject cycl_test_case_do_asserts_method(SubLObject self, SubLObject sentences, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = sentences;
                SubLObject sentence = NIL;
                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                    {
                        SubLObject form = list(FI_ASSERT_INT, list(QUOTE, sentence), mt);
                        if (NIL != $sunit_verbose$.getDynamicValue(thread)) {
                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt487$___S, form);
                        }
                        {
                            SubLObject success = eval(form);
                            if (NIL == success) {
                                {
                                    SubLObject error_msg = (NIL != fi.fi_error_signaledP()) ? ((SubLObject) (fi.fi_get_error_string_int())) : NIL;
                                    Errors.error($str_alt488$Failed_while_attempting_to_assert, form, error_msg);
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    /**
     * Unassert each sentence in SENTENCES from MT.
     */
    public static final SubLObject cycl_test_case_do_unasserts_method(SubLObject self, SubLObject sentences, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = sentences;
                SubLObject sentence = NIL;
                for (sentence = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sentence = cdolist_list_var.first()) {
                    {
                        SubLObject form = list(FI_UNASSERT_INT, list(QUOTE, sentence), mt);
                        if (NIL != $sunit_verbose$.getDynamicValue(thread)) {
                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt487$___S, form);
                        }
                        {
                            SubLObject success = eval(form);
                            if (NIL == success) {
                                {
                                    SubLObject error_msg = (NIL != fi.fi_error_signaledP()) ? ((SubLObject) (fi.fi_get_error_string_int())) : NIL;
                                    Errors.error($str_alt493$Failed_while_attempting_to_unasse, form, error_msg);
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    /**
     * Kills all the temporary testing constants that were introduced by the method
     * NEW-TEST-CONSTANT.  Call this method, e.g., (cleanup super), in any cleanup
     * method of a subclass of CYCL-TEST-CASE.
     */
    public static final SubLObject cycl_test_case_cleanup_method(SubLObject self) {
        {
            SubLObject catch_var_for_cycl_test_case_method = NIL;
            SubLObject constants = get_cycl_test_case_constants(self);
            try {
                try {
                    cycl_test_case_cleanup_test_constants_method(self);
                    constants = NIL;
                    sublisp_throw($sym496$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cycl_test_case_constants(self, constants);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cycl_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym496$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD);
            }
            return catch_var_for_cycl_test_case_method;
        }
    }

    public static final SubLObject cycl_test_case_initialize_method(SubLObject self) {
        {
            SubLObject catch_var_for_cycl_test_case_method = NIL;
            SubLObject constants = get_cycl_test_case_constants(self);
            try {
                try {
                    test_case_initialize_method(self);
                    constants = NIL;
                    sublisp_throw($sym499$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD, self);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cycl_test_case_constants(self, constants);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cycl_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym499$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD);
            }
            return catch_var_for_cycl_test_case_method;
        }
    }

    public static final SubLObject cycl_test_case_create_test_constant_method(SubLObject self, SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject catch_var_for_cycl_test_case_method = NIL;
                SubLObject constants = get_cycl_test_case_constants(self);
                try {
                    try {
                        {
                            SubLObject unique_name = NIL;
                            SubLObject form = NIL;
                            SubLObject constant = NIL;
                            SubLObject unique = NIL;
                            unique_name = constant_completion_high.uniquify_constant_name(name);
                            form = list(FI_FIND_OR_CREATE_INT, unique_name);
                            if (NIL != $sunit_verbose$.getDynamicValue(thread)) {
                                format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt487$___S, form);
                            }
                            if (NIL == fi.fi_find_int(unique_name)) {
                                unique = T;
                                constant = eval(form);
                            }
                            if (NIL == unique) {
                                test_case_fail_method(self, format(NIL, $str_alt505$Failure_to_create_a_test_constant, name));
                            } else {
                                if (NIL != constant) {
                                    {
                                        SubLObject item_var = constant;
                                        if (NIL == member(item_var, constants, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            constants = cons(item_var, constants);
                                        }
                                    }
                                    sublisp_throw($sym503$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD, constant);
                                }
                            }
                            sublisp_throw($sym503$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD, NIL);
                        }
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                set_cycl_test_case_constants(self, constants);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var_for_cycl_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym503$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD);
                }
                return catch_var_for_cycl_test_case_method;
            }
        }
    }

    public static final SubLObject cycl_test_case_kill_constants_method(SubLObject self, SubLObject constant_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = constant_list;
                SubLObject constant = NIL;
                for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                    {
                        SubLObject form = list(FI_KILL_INT, constant);
                        if (NIL != $sunit_verbose$.getDynamicValue(thread)) {
                            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt487$___S, form);
                        }
                        {
                            SubLObject success = eval(form);
                            if (NIL == success) {
                                test_case_fail_method(self, format(NIL, $str_alt511$Failed_during_cleanup_while_tryin, constant));
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    public static final SubLObject cycl_test_case_cleanup_test_constants_method(SubLObject self) {
        {
            SubLObject catch_var_for_cycl_test_case_method = NIL;
            SubLObject constants = get_cycl_test_case_constants(self);
            try {
                try {
                    cycl_test_case_kill_constants_method(self, constants);
                    sublisp_throw($sym515$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD, NIL);
                } finally {
                    {
                        SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            set_cycl_test_case_constants(self, constants);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
            } catch (Throwable ccatch_env_var) {
                catch_var_for_cycl_test_case_method = Errors.handleThrowable(ccatch_env_var, $sym515$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD);
            }
            return catch_var_for_cycl_test_case_method;
        }
    }

    public static final SubLObject declare_sunit_classes_file() {
        declareFunction("get_sunit_lockable_lock", "GET-SUNIT-LOCKABLE-LOCK", 1, 0, false);
        declareFunction("set_sunit_lockable_lock", "SET-SUNIT-LOCKABLE-LOCK", 2, 0, false);
        declareFunction("subloop_reserved_initialize_sunit_lockable_class", "SUBLOOP-RESERVED-INITIALIZE-SUNIT-LOCKABLE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_sunit_lockable_instance", "SUBLOOP-RESERVED-INITIALIZE-SUNIT-LOCKABLE-INSTANCE", 1, 0, false);
        declareFunction("sunit_lockable_p", "SUNIT-LOCKABLE-P", 1, 0, false);
        declareFunction("sunit_lockable_initialize_method", "SUNIT-LOCKABLE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("get_test_result_time", "GET-TEST-RESULT-TIME", 1, 0, false);
        declareFunction("set_test_result_time", "SET-TEST-RESULT-TIME", 2, 0, false);
        declareFunction("get_test_result_explanation", "GET-TEST-RESULT-EXPLANATION", 1, 0, false);
        declareFunction("set_test_result_explanation", "SET-TEST-RESULT-EXPLANATION", 2, 0, false);
        declareFunction("get_test_result_result", "GET-TEST-RESULT-RESULT", 1, 0, false);
        declareFunction("set_test_result_result", "SET-TEST-RESULT-RESULT", 2, 0, false);
        declareFunction("get_test_result_test_method", "GET-TEST-RESULT-TEST-METHOD", 1, 0, false);
        declareFunction("set_test_result_test_method", "SET-TEST-RESULT-TEST-METHOD", 2, 0, false);
        declareFunction("get_test_result_test_case", "GET-TEST-RESULT-TEST-CASE", 1, 0, false);
        declareFunction("set_test_result_test_case", "SET-TEST-RESULT-TEST-CASE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_test_result_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-RESULT-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_result_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-RESULT-INSTANCE", 1, 0, false);
        declareFunction("test_result_p", "TEST-RESULT-P", 1, 0, false);
        declareFunction("test_result_initialize_method", "TEST-RESULT-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("test_result_set_test_case_method", "TEST-RESULT-SET-TEST-CASE-METHOD", 2, 0, false);
        declareFunction("test_result_get_test_case_method", "TEST-RESULT-GET-TEST-CASE-METHOD", 1, 0, false);
        declareFunction("test_result_set_test_method_method", "TEST-RESULT-SET-TEST-METHOD-METHOD", 2, 0, false);
        declareFunction("test_result_get_test_method_method", "TEST-RESULT-GET-TEST-METHOD-METHOD", 1, 0, false);
        declareFunction("test_result_set_result_method", "TEST-RESULT-SET-RESULT-METHOD", 2, 0, false);
        declareFunction("test_result_get_result_method", "TEST-RESULT-GET-RESULT-METHOD", 1, 0, false);
        declareFunction("test_result_set_explanation_method", "TEST-RESULT-SET-EXPLANATION-METHOD", 2, 0, false);
        declareFunction("test_result_get_explanation_method", "TEST-RESULT-GET-EXPLANATION-METHOD", 1, 0, false);
        declareFunction("test_result_set_time_method", "TEST-RESULT-SET-TIME-METHOD", 2, 0, false);
        declareFunction("test_result_get_time_method", "TEST-RESULT-GET-TIME-METHOD", 1, 0, false);
        declareFunction("test_result_note_error_method", "TEST-RESULT-NOTE-ERROR-METHOD", 3, 0, false);
        declareFunction("test_result_format_method", "TEST-RESULT-FORMAT-METHOD", 2, 0, false);
        declareFunction("test_result_isolate_method", "TEST-RESULT-ISOLATE-METHOD", 1, 0, false);
        declareFunction("get_test_category_by_name", "GET-TEST-CATEGORY-BY-NAME", 1, 0, false);
        declareFunction("valid_test_category_name", "VALID-TEST-CATEGORY-NAME", 1, 0, false);
        declareFunction("store_test_category_by_name", "STORE-TEST-CATEGORY-BY-NAME", 2, 0, false);
        declareFunction("remove_test_category_by_name", "REMOVE-TEST-CATEGORY-BY-NAME", 1, 0, false);
        declareFunction("get_test_category_test_cases", "GET-TEST-CATEGORY-TEST-CASES", 1, 0, false);
        declareFunction("set_test_category_test_cases", "SET-TEST-CATEGORY-TEST-CASES", 2, 0, false);
        declareFunction("get_test_category_enabled", "GET-TEST-CATEGORY-ENABLED", 1, 0, false);
        declareFunction("set_test_category_enabled", "SET-TEST-CATEGORY-ENABLED", 2, 0, false);
        declareFunction("get_test_category_suites", "GET-TEST-CATEGORY-SUITES", 1, 0, false);
        declareFunction("set_test_category_suites", "SET-TEST-CATEGORY-SUITES", 2, 0, false);
        declareFunction("get_test_category_subcategories", "GET-TEST-CATEGORY-SUBCATEGORIES", 1, 0, false);
        declareFunction("set_test_category_subcategories", "SET-TEST-CATEGORY-SUBCATEGORIES", 2, 0, false);
        declareFunction("get_test_category_supercategories", "GET-TEST-CATEGORY-SUPERCATEGORIES", 1, 0, false);
        declareFunction("set_test_category_supercategories", "SET-TEST-CATEGORY-SUPERCATEGORIES", 2, 0, false);
        declareFunction("get_test_category_name", "GET-TEST-CATEGORY-NAME", 1, 0, false);
        declareFunction("set_test_category_name", "SET-TEST-CATEGORY-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_test_category_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-CATEGORY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_category_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-CATEGORY-INSTANCE", 1, 0, false);
        declareFunction("test_category_p", "TEST-CATEGORY-P", 1, 0, false);
        declareFunction("test_category_new_method", "TEST-CATEGORY-NEW-METHOD", 2, 1, false);
        declareFunction("test_category_initialize_method", "TEST-CATEGORY-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("test_category_get_name_method", "TEST-CATEGORY-GET-NAME-METHOD", 1, 0, false);
        declareFunction("test_category_set_name_method", "TEST-CATEGORY-SET-NAME-METHOD", 2, 0, false);
        declareFunction("test_category_add_test_case_method", "TEST-CATEGORY-ADD-TEST-CASE-METHOD", 2, 0, false);
        declareFunction("test_category_delete_test_case_method", "TEST-CATEGORY-DELETE-TEST-CASE-METHOD", 2, 0, false);
        declareFunction("test_category_get_test_cases_method", "TEST-CATEGORY-GET-TEST-CASES-METHOD", 1, 0, false);
        declareFunction("test_category_set_test_cases_method", "TEST-CATEGORY-SET-TEST-CASES-METHOD", 2, 0, false);
        declareFunction("test_category_get_all_test_cases_method", "TEST-CATEGORY-GET-ALL-TEST-CASES-METHOD", 1, 0, false);
        declareFunction("test_category_get_suites_method", "TEST-CATEGORY-GET-SUITES-METHOD", 1, 0, false);
        declareFunction("test_category_set_suites_method", "TEST-CATEGORY-SET-SUITES-METHOD", 2, 0, false);
        declareFunction("test_category_add_suite_method", "TEST-CATEGORY-ADD-SUITE-METHOD", 2, 0, false);
        declareFunction("test_category_delete_suite_method", "TEST-CATEGORY-DELETE-SUITE-METHOD", 2, 0, false);
        declareFunction("test_category_get_subcategories_method", "TEST-CATEGORY-GET-SUBCATEGORIES-METHOD", 1, 0, false);
        declareFunction("test_category_set_subcategories_method", "TEST-CATEGORY-SET-SUBCATEGORIES-METHOD", 2, 0, false);
        declareFunction("test_category_add_subcategory_method", "TEST-CATEGORY-ADD-SUBCATEGORY-METHOD", 2, 0, false);
        declareFunction("test_category_delete_subcategory_method", "TEST-CATEGORY-DELETE-SUBCATEGORY-METHOD", 2, 0, false);
        declareFunction("test_category_add_supercategory_method", "TEST-CATEGORY-ADD-SUPERCATEGORY-METHOD", 2, 0, false);
        declareFunction("test_category_delete_supercategory_method", "TEST-CATEGORY-DELETE-SUPERCATEGORY-METHOD", 2, 0, false);
        declareFunction("test_category_get_supercategories_method", "TEST-CATEGORY-GET-SUPERCATEGORIES-METHOD", 1, 0, false);
        declareFunction("test_category_set_supercategories_method", "TEST-CATEGORY-SET-SUPERCATEGORIES-METHOD", 2, 0, false);
        declareFunction("test_category_enabledp_method", "TEST-CATEGORY-ENABLEDP-METHOD", 1, 0, false);
        declareFunction("test_category_set_enabled_method", "TEST-CATEGORY-SET-ENABLED-METHOD", 2, 0, false);
        declareFunction("test_category_isolate_method", "TEST-CATEGORY-ISOLATE-METHOD", 1, 0, false);
        declareFunction("get_test_case_by_symbol", "GET-TEST-CASE-BY-SYMBOL", 1, 0, false);
        declareFunction("get_test_case_test_method", "GET-TEST-CASE-TEST-METHOD", 1, 0, false);
        declareFunction("set_test_case_test_method", "SET-TEST-CASE-TEST-METHOD", 2, 0, false);
        declareFunction("get_test_case_result", "GET-TEST-CASE-RESULT", 1, 0, false);
        declareFunction("set_test_case_result", "SET-TEST-CASE-RESULT", 2, 0, false);
        declareFunction("get_test_case_lock", "GET-TEST-CASE-LOCK", 1, 0, false);
        declareFunction("set_test_case_lock", "SET-TEST-CASE-LOCK", 2, 0, false);
        declareFunction("get_test_case_enabled", "GET-TEST-CASE-ENABLED", 1, 0, false);
        declareFunction("set_test_case_enabled", "SET-TEST-CASE-ENABLED", 2, 0, false);
        declareFunction("get_test_case_test_methods", "GET-TEST-CASE-TEST-METHODS", 1, 0, false);
        declareFunction("set_test_case_test_methods", "SET-TEST-CASE-TEST-METHODS", 2, 0, false);
        declareFunction("get_test_case_suites", "GET-TEST-CASE-SUITES", 1, 0, false);
        declareFunction("set_test_case_suites", "SET-TEST-CASE-SUITES", 2, 0, false);
        declareFunction("get_test_case_categories", "GET-TEST-CASE-CATEGORIES", 1, 0, false);
        declareFunction("set_test_case_categories", "SET-TEST-CASE-CATEGORIES", 2, 0, false);
        declareFunction("get_test_case_module", "GET-TEST-CASE-MODULE", 1, 0, false);
        declareFunction("set_test_case_module", "SET-TEST-CASE-MODULE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("test_case_p", "TEST-CASE-P", 1, 0, false);
        declareFunction("test_case_initialize_method", "TEST-CASE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("test_case_new_method", "TEST-CASE-NEW-METHOD", 2, 0, false);
        declareFunction("test_case_set_module_method", "TEST-CASE-SET-MODULE-METHOD", 2, 0, false);
        declareFunction("test_case_get_module_method", "TEST-CASE-GET-MODULE-METHOD", 1, 0, false);
        declareFunction("test_case_add_category_method", "TEST-CASE-ADD-CATEGORY-METHOD", 2, 0, false);
        declareFunction("test_case_delete_category_method", "TEST-CASE-DELETE-CATEGORY-METHOD", 2, 0, false);
        declareFunction("test_case_get_categories_method", "TEST-CASE-GET-CATEGORIES-METHOD", 1, 0, false);
        declareFunction("test_case_add_suite_method", "TEST-CASE-ADD-SUITE-METHOD", 2, 0, false);
        declareFunction("test_case_delete_suite_method", "TEST-CASE-DELETE-SUITE-METHOD", 2, 0, false);
        declareFunction("test_case_get_suites_method", "TEST-CASE-GET-SUITES-METHOD", 1, 0, false);
        declareFunction("test_case_get_test_methods_method", "TEST-CASE-GET-TEST-METHODS-METHOD", 1, 0, false);
        declareFunction("test_case_initialize_lock_method", "TEST-CASE-INITIALIZE-LOCK-METHOD", 1, 0, false);
        declareFunction("test_case_enabledp_method", "TEST-CASE-ENABLEDP-METHOD", 1, 0, false);
        declareFunction("test_case_set_enabled_method", "TEST-CASE-SET-ENABLED-METHOD", 2, 0, false);
        declareFunction("test_case_set_result_method", "TEST-CASE-SET-RESULT-METHOD", 2, 0, false);
        declareFunction("test_case_get_result_method", "TEST-CASE-GET-RESULT-METHOD", 1, 0, false);
        declareFunction("test_case_set_test_method_method", "TEST-CASE-SET-TEST-METHOD-METHOD", 2, 0, false);
        declareFunction("test_case_get_test_method_method", "TEST-CASE-GET-TEST-METHOD-METHOD", 1, 0, false);
        declareFunction("test_case_setup_method", "TEST-CASE-SETUP-METHOD", 1, 0, false);
        declareFunction("test_case_cleanup_method", "TEST-CASE-CLEANUP-METHOD", 1, 0, false);
        declareFunction("test_case_test_method", "TEST-CASE-TEST-METHOD", 1, 0, false);
        declareFunction("test_case_fail_unless_method", "TEST-CASE-FAIL-UNLESS-METHOD", 3, 0, false);
        declareFunction("test_case_fail_if_method", "TEST-CASE-FAIL-IF-METHOD", 3, 0, false);
        declareFunction("test_case_fail_if_equal_method", "TEST-CASE-FAIL-IF-EQUAL-METHOD", 4, 1, false);
        declareFunction("test_case_fail_unless_equal_method", "TEST-CASE-FAIL-UNLESS-EQUAL-METHOD", 4, 1, false);
        declareFunction("test_case_fail_if_error_method", "TEST-CASE-FAIL-IF-ERROR-METHOD", 3, 0, false);
        declareFunction("test_case_fail_unless_error_method", "TEST-CASE-FAIL-UNLESS-ERROR-METHOD", 3, 0, false);
        declareFunction("test_case_fail_method", "TEST-CASE-FAIL-METHOD", 2, 0, false);
        declareFunction("test_case_isolate_method", "TEST-CASE-ISOLATE-METHOD", 1, 0, false);
        declareFunction("get_test_suite_by_name", "GET-TEST-SUITE-BY-NAME", 1, 0, false);
        declareFunction("valid_test_suite_name", "VALID-TEST-SUITE-NAME", 1, 0, false);
        declareFunction("store_test_suite_by_name", "STORE-TEST-SUITE-BY-NAME", 2, 0, false);
        declareFunction("remove_test_suite_by_name", "REMOVE-TEST-SUITE-BY-NAME", 1, 0, false);
        declareFunction("get_test_suite_enabled", "GET-TEST-SUITE-ENABLED", 1, 0, false);
        declareFunction("set_test_suite_enabled", "SET-TEST-SUITE-ENABLED", 2, 0, false);
        declareFunction("get_test_suite_test_cases", "GET-TEST-SUITE-TEST-CASES", 1, 0, false);
        declareFunction("set_test_suite_test_cases", "SET-TEST-SUITE-TEST-CASES", 2, 0, false);
        declareFunction("get_test_suite_modules", "GET-TEST-SUITE-MODULES", 1, 0, false);
        declareFunction("set_test_suite_modules", "SET-TEST-SUITE-MODULES", 2, 0, false);
        declareFunction("get_test_suite_categories", "GET-TEST-SUITE-CATEGORIES", 1, 0, false);
        declareFunction("set_test_suite_categories", "SET-TEST-SUITE-CATEGORIES", 2, 0, false);
        declareFunction("get_test_suite_name", "GET-TEST-SUITE-NAME", 1, 0, false);
        declareFunction("set_test_suite_name", "SET-TEST-SUITE-NAME", 2, 0, false);
        declareFunction("subloop_reserved_initialize_test_suite_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-SUITE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_suite_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-SUITE-INSTANCE", 1, 0, false);
        declareFunction("test_suite_p", "TEST-SUITE-P", 1, 0, false);
        declareFunction("test_suite_initialize_method", "TEST-SUITE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("test_suite_new_method", "TEST-SUITE-NEW-METHOD", 2, 3, false);
        declareFunction("test_suite_get_name_method", "TEST-SUITE-GET-NAME-METHOD", 1, 0, false);
        declareFunction("test_suite_set_name_method", "TEST-SUITE-SET-NAME-METHOD", 2, 0, false);
        declareFunction("test_suite_add_category_method", "TEST-SUITE-ADD-CATEGORY-METHOD", 2, 0, false);
        declareFunction("test_suite_delete_category_method", "TEST-SUITE-DELETE-CATEGORY-METHOD", 2, 0, false);
        declareFunction("test_suite_get_categories_method", "TEST-SUITE-GET-CATEGORIES-METHOD", 1, 0, false);
        declareFunction("test_suite_add_module_method", "TEST-SUITE-ADD-MODULE-METHOD", 2, 0, false);
        declareFunction("test_suite_delete_module_method", "TEST-SUITE-DELETE-MODULE-METHOD", 2, 0, false);
        declareFunction("test_suite_get_modules_method", "TEST-SUITE-GET-MODULES-METHOD", 1, 0, false);
        declareFunction("test_suite_add_test_case_method", "TEST-SUITE-ADD-TEST-CASE-METHOD", 2, 0, false);
        declareFunction("test_suite_delete_test_case_method", "TEST-SUITE-DELETE-TEST-CASE-METHOD", 2, 0, false);
        declareFunction("test_suite_get_test_cases_method", "TEST-SUITE-GET-TEST-CASES-METHOD", 1, 0, false);
        declareFunction("test_suite_enabledp_method", "TEST-SUITE-ENABLEDP-METHOD", 1, 0, false);
        declareFunction("test_suite_set_enabled_method", "TEST-SUITE-SET-ENABLED-METHOD", 2, 0, false);
        declareFunction("test_suite_get_all_test_cases_method", "TEST-SUITE-GET-ALL-TEST-CASES-METHOD", 1, 0, false);
        declareFunction("test_suite_isolate_method", "TEST-SUITE-ISOLATE-METHOD", 1, 0, false);
        declareFunction("get_test_runner_stream", "GET-TEST-RUNNER-STREAM", 1, 0, false);
        declareFunction("set_test_runner_stream", "SET-TEST-RUNNER-STREAM", 2, 0, false);
        declareFunction("subloop_reserved_initialize_test_runner_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-RUNNER-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_runner_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-RUNNER-INSTANCE", 1, 0, false);
        declareFunction("test_runner_p", "TEST-RUNNER-P", 1, 0, false);
        declareFunction("test_runner_set_stream_method", "TEST-RUNNER-SET-STREAM-METHOD", 2, 0, false);
        declareFunction("test_runner_get_stream_method", "TEST-RUNNER-GET-STREAM-METHOD", 1, 0, false);
        declareFunction("test_runner_initialize_method", "TEST-RUNNER-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("test_runner_new_method", "TEST-RUNNER-NEW-METHOD", 1, 1, false);
        declareFunction("test_runner_run_method", "TEST-RUNNER-RUN-METHOD", 2, 0, false);
        declareFunction("test_runner_run_test_case_method", "TEST-RUNNER-RUN-TEST-CASE-METHOD", 2, 0, false);
        declareFunction("test_runner_handle_problem_code_method", "TEST-RUNNER-HANDLE-PROBLEM-CODE-METHOD", 4, 0, false);
        declareFunction("test_runner_run_test_suite_method", "TEST-RUNNER-RUN-TEST-SUITE-METHOD", 2, 0, false);
        declareFunction("get_cycl_test_case_constants", "GET-CYCL-TEST-CASE-CONSTANTS", 1, 0, false);
        declareFunction("set_cycl_test_case_constants", "SET-CYCL-TEST-CASE-CONSTANTS", 2, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-CYCL-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_cycl_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-CYCL-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("cycl_test_case_p", "CYCL-TEST-CASE-P", 1, 0, false);
        declareFunction("cycl_test_case_new_test_constant_method", "CYCL-TEST-CASE-NEW-TEST-CONSTANT-METHOD", 4, 0, false);
        declareFunction("cycl_test_case_do_asserts_method", "CYCL-TEST-CASE-DO-ASSERTS-METHOD", 3, 0, false);
        declareFunction("cycl_test_case_do_unasserts_method", "CYCL-TEST-CASE-DO-UNASSERTS-METHOD", 3, 0, false);
        declareFunction("cycl_test_case_cleanup_method", "CYCL-TEST-CASE-CLEANUP-METHOD", 1, 0, false);
        declareFunction("cycl_test_case_initialize_method", "CYCL-TEST-CASE-INITIALIZE-METHOD", 1, 0, false);
        declareFunction("cycl_test_case_create_test_constant_method", "CYCL-TEST-CASE-CREATE-TEST-CONSTANT-METHOD", 2, 0, false);
        declareFunction("cycl_test_case_kill_constants_method", "CYCL-TEST-CASE-KILL-CONSTANTS-METHOD", 2, 0, false);
        declareFunction("cycl_test_case_cleanup_test_constants_method", "CYCL-TEST-CASE-CLEANUP-TEST-CONSTANTS-METHOD", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_sunit_classes_file() {
        defparameter("*SUNIT-VERBOSE*", NIL);
        defparameter("*SUNIT-BREAK-ON-FAILURE*", NIL);
        deflexical("*TEST-CATEGORY-DICTIONARY-LOCK*", make_lock($$$Test_Category_Dictionary_Lock));
        deflexical("*TEST-CATEGORY-DICTIONARY*", NIL != boundp($test_category_dictionary$) ? ((SubLObject) ($test_category_dictionary$.getGlobalValue())) : make_hash_table(SIXTEEN_INTEGER, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*TEST-SUITE-DICTIONARY*", NIL != boundp($test_suite_dictionary$) ? ((SubLObject) ($test_suite_dictionary$.getGlobalValue())) : make_hash_table(SIXTEEN_INTEGER, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*TEST-SUITE-DICTIONARY-LOCK*", make_lock($$$Test_Suite_Dictionary_Lock));
        return NIL;
    }

    public static final SubLObject setup_sunit_classes_file() {
                classes.subloop_new_class(SUNIT_LOCKABLE, OBJECT, NIL, NIL, $list_alt2);
        classes.class_set_implements_slot_listeners(SUNIT_LOCKABLE, NIL);
        classes.subloop_note_class_initialization_function(SUNIT_LOCKABLE, SUBLOOP_RESERVED_INITIALIZE_SUNIT_LOCKABLE_CLASS);
        classes.subloop_note_instance_initialization_function(SUNIT_LOCKABLE, SUBLOOP_RESERVED_INITIALIZE_SUNIT_LOCKABLE_INSTANCE);
        subloop_reserved_initialize_sunit_lockable_class(SUNIT_LOCKABLE);
        methods.methods_incorporate_instance_method(INITIALIZE, SUNIT_LOCKABLE, $list_alt10, NIL, $list_alt11);
        methods.subloop_register_instance_method(SUNIT_LOCKABLE, INITIALIZE, SUNIT_LOCKABLE_INITIALIZE_METHOD);
        classes.subloop_new_class(TEST_RESULT, SUNIT_LOCKABLE, NIL, NIL, $list_alt16);
        classes.class_set_implements_slot_listeners(TEST_RESULT, NIL);
        classes.subloop_note_class_initialization_function(TEST_RESULT, SUBLOOP_RESERVED_INITIALIZE_TEST_RESULT_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_RESULT, SUBLOOP_RESERVED_INITIALIZE_TEST_RESULT_INSTANCE);
        subloop_reserved_initialize_test_result_class(TEST_RESULT);
        methods.methods_incorporate_instance_method(INITIALIZE, TEST_RESULT, $list_alt24, NIL, $list_alt25);
        methods.subloop_register_instance_method(TEST_RESULT, INITIALIZE, TEST_RESULT_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(SET_TEST_CASE, TEST_RESULT, $list_alt31, $list_alt32, $list_alt33);
        methods.subloop_register_instance_method(TEST_RESULT, SET_TEST_CASE, TEST_RESULT_SET_TEST_CASE_METHOD);
        methods.methods_incorporate_instance_method(GET_TEST_CASE, TEST_RESULT, $list_alt31, NIL, $list_alt38);
        methods.subloop_register_instance_method(TEST_RESULT, GET_TEST_CASE, TEST_RESULT_GET_TEST_CASE_METHOD);
        methods.methods_incorporate_instance_method(SET_TEST_METHOD, TEST_RESULT, $list_alt31, $list_alt42, $list_alt43);
        methods.subloop_register_instance_method(TEST_RESULT, SET_TEST_METHOD, TEST_RESULT_SET_TEST_METHOD_METHOD);
        methods.methods_incorporate_instance_method(GET_TEST_METHOD, TEST_RESULT, $list_alt31, NIL, $list_alt48);
        methods.subloop_register_instance_method(TEST_RESULT, GET_TEST_METHOD, TEST_RESULT_GET_TEST_METHOD_METHOD);
        methods.methods_incorporate_instance_method(SET_RESULT, TEST_RESULT, $list_alt31, $list_alt52, $list_alt53);
        methods.subloop_register_instance_method(TEST_RESULT, SET_RESULT, TEST_RESULT_SET_RESULT_METHOD);
        methods.methods_incorporate_instance_method(GET_RESULT, TEST_RESULT, $list_alt24, NIL, $list_alt58);
        methods.subloop_register_instance_method(TEST_RESULT, GET_RESULT, TEST_RESULT_GET_RESULT_METHOD);
        methods.methods_incorporate_instance_method(SET_EXPLANATION, TEST_RESULT, $list_alt31, $list_alt62, $list_alt63);
        methods.subloop_register_instance_method(TEST_RESULT, SET_EXPLANATION, TEST_RESULT_SET_EXPLANATION_METHOD);
        methods.methods_incorporate_instance_method(GET_EXPLANATION, TEST_RESULT, $list_alt24, NIL, $list_alt68);
        methods.subloop_register_instance_method(TEST_RESULT, GET_EXPLANATION, TEST_RESULT_GET_EXPLANATION_METHOD);
        methods.methods_incorporate_instance_method(SET_TIME, TEST_RESULT, $list_alt31, $list_alt72, $list_alt73);
        methods.subloop_register_instance_method(TEST_RESULT, SET_TIME, TEST_RESULT_SET_TIME_METHOD);
        methods.methods_incorporate_instance_method(GET_TIME, TEST_RESULT, $list_alt24, NIL, $list_alt78);
        methods.subloop_register_instance_method(TEST_RESULT, GET_TIME, TEST_RESULT_GET_TIME_METHOD);
        methods.methods_incorporate_instance_method(NOTE_ERROR, TEST_RESULT, $list_alt31, $list_alt82, $list_alt83);
        methods.subloop_register_instance_method(TEST_RESULT, NOTE_ERROR, TEST_RESULT_NOTE_ERROR_METHOD);
        methods.methods_incorporate_instance_method(FORMAT, TEST_RESULT, $list_alt31, $list_alt95, $list_alt96);
        methods.subloop_register_instance_method(TEST_RESULT, FORMAT, TEST_RESULT_FORMAT_METHOD);
        methods.methods_incorporate_instance_method(ISOLATE, TEST_RESULT, $list_alt31, NIL, $list_alt107);
        methods.subloop_register_instance_method(TEST_RESULT, ISOLATE, TEST_RESULT_ISOLATE_METHOD);
        subl_macro_promotions.declare_defglobal($test_category_dictionary$);
        classes.subloop_new_class(TEST_CATEGORY, SUNIT_LOCKABLE, NIL, NIL, $list_alt116);
        classes.class_set_implements_slot_listeners(TEST_CATEGORY, NIL);
        classes.subloop_note_class_initialization_function(TEST_CATEGORY, SUBLOOP_RESERVED_INITIALIZE_TEST_CATEGORY_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_CATEGORY, SUBLOOP_RESERVED_INITIALIZE_TEST_CATEGORY_INSTANCE);
        subloop_reserved_initialize_test_category_class(TEST_CATEGORY);
        methods.methods_incorporate_class_method(NEW, TEST_CATEGORY, $list_alt31, $list_alt126, $list_alt127);
        methods.subloop_register_class_method(TEST_CATEGORY, NEW, TEST_CATEGORY_NEW_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, TEST_CATEGORY, $list_alt24, NIL, $list_alt133);
        methods.subloop_register_instance_method(TEST_CATEGORY, INITIALIZE, TEST_CATEGORY_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(GET_NAME, TEST_CATEGORY, $list_alt31, NIL, $list_alt137);
        methods.subloop_register_instance_method(TEST_CATEGORY, GET_NAME, TEST_CATEGORY_GET_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_NAME, TEST_CATEGORY, $list_alt31, $list_alt140, $list_alt141);
        methods.subloop_register_instance_method(TEST_CATEGORY, SET_NAME, TEST_CATEGORY_SET_NAME_METHOD);
        methods.methods_incorporate_instance_method(ADD_TEST_CASE, TEST_CATEGORY, $list_alt31, $list_alt145, $list_alt146);
        methods.subloop_register_instance_method(TEST_CATEGORY, ADD_TEST_CASE, TEST_CATEGORY_ADD_TEST_CASE_METHOD);
        methods.methods_incorporate_instance_method(DELETE_TEST_CASE, TEST_CATEGORY, $list_alt31, $list_alt151, $list_alt152);
        methods.subloop_register_instance_method(TEST_CATEGORY, DELETE_TEST_CASE, TEST_CATEGORY_DELETE_TEST_CASE_METHOD);
        methods.methods_incorporate_instance_method(GET_TEST_CASES, TEST_CATEGORY, $list_alt31, NIL, $list_alt156);
        methods.subloop_register_instance_method(TEST_CATEGORY, GET_TEST_CASES, TEST_CATEGORY_GET_TEST_CASES_METHOD);
        methods.methods_incorporate_instance_method(SET_TEST_CASES, TEST_CATEGORY, $list_alt31, $list_alt160, $list_alt161);
        methods.subloop_register_instance_method(TEST_CATEGORY, SET_TEST_CASES, TEST_CATEGORY_SET_TEST_CASES_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_TEST_CASES, TEST_CATEGORY, $list_alt31, NIL, $list_alt165);
        methods.subloop_register_instance_method(TEST_CATEGORY, GET_ALL_TEST_CASES, TEST_CATEGORY_GET_ALL_TEST_CASES_METHOD);
        methods.methods_incorporate_instance_method(GET_SUITES, TEST_CATEGORY, $list_alt31, NIL, $list_alt169);
        methods.subloop_register_instance_method(TEST_CATEGORY, GET_SUITES, TEST_CATEGORY_GET_SUITES_METHOD);
        methods.methods_incorporate_instance_method(SET_SUITES, TEST_CATEGORY, $list_alt31, $list_alt173, $list_alt174);
        methods.subloop_register_instance_method(TEST_CATEGORY, SET_SUITES, TEST_CATEGORY_SET_SUITES_METHOD);
        methods.methods_incorporate_class_method(ADD_SUITE, TEST_CATEGORY, $list_alt31, $list_alt179, $list_alt180);
        methods.subloop_register_class_method(TEST_CATEGORY, ADD_SUITE, TEST_CATEGORY_ADD_SUITE_METHOD);
        methods.methods_incorporate_class_method(DELETE_SUITE, TEST_CATEGORY, $list_alt31, $list_alt185, $list_alt186);
        methods.subloop_register_class_method(TEST_CATEGORY, DELETE_SUITE, TEST_CATEGORY_DELETE_SUITE_METHOD);
        methods.methods_incorporate_instance_method(GET_SUBCATEGORIES, TEST_CATEGORY, $list_alt31, NIL, $list_alt189);
        methods.subloop_register_instance_method(TEST_CATEGORY, GET_SUBCATEGORIES, TEST_CATEGORY_GET_SUBCATEGORIES_METHOD);
        methods.methods_incorporate_instance_method(SET_SUBCATEGORIES, TEST_CATEGORY, $list_alt31, $list_alt192, $list_alt193);
        methods.subloop_register_instance_method(TEST_CATEGORY, SET_SUBCATEGORIES, TEST_CATEGORY_SET_SUBCATEGORIES_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUBCATEGORY, TEST_CATEGORY, $list_alt31, $list_alt140, $list_alt198);
        methods.subloop_register_instance_method(TEST_CATEGORY, ADD_SUBCATEGORY, TEST_CATEGORY_ADD_SUBCATEGORY_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SUBCATEGORY, TEST_CATEGORY, $list_alt24, $list_alt203, $list_alt204);
        methods.subloop_register_instance_method(TEST_CATEGORY, DELETE_SUBCATEGORY, TEST_CATEGORY_DELETE_SUBCATEGORY_METHOD);
        methods.methods_incorporate_instance_method(ADD_SUPERCATEGORY, TEST_CATEGORY, $list_alt31, $list_alt140, $list_alt208);
        methods.subloop_register_instance_method(TEST_CATEGORY, ADD_SUPERCATEGORY, TEST_CATEGORY_ADD_SUPERCATEGORY_METHOD);
        methods.methods_incorporate_instance_method(DELETE_SUPERCATEGORY, TEST_CATEGORY, $list_alt31, $list_alt212, $list_alt213);
        methods.subloop_register_instance_method(TEST_CATEGORY, DELETE_SUPERCATEGORY, TEST_CATEGORY_DELETE_SUPERCATEGORY_METHOD);
        methods.methods_incorporate_instance_method(GET_SUPERCATEGORIES, TEST_CATEGORY, $list_alt31, NIL, $list_alt217);
        methods.subloop_register_instance_method(TEST_CATEGORY, GET_SUPERCATEGORIES, TEST_CATEGORY_GET_SUPERCATEGORIES_METHOD);
        methods.methods_incorporate_instance_method(SET_SUPERCATEGORIES, TEST_CATEGORY, $list_alt31, $list_alt220, $list_alt221);
        methods.subloop_register_instance_method(TEST_CATEGORY, SET_SUPERCATEGORIES, TEST_CATEGORY_SET_SUPERCATEGORIES_METHOD);
        methods.methods_incorporate_instance_method(ENABLEDP, TEST_CATEGORY, $list_alt31, NIL, $list_alt225);
        methods.subloop_register_instance_method(TEST_CATEGORY, ENABLEDP, TEST_CATEGORY_ENABLEDP_METHOD);
        methods.methods_incorporate_instance_method(SET_ENABLED, TEST_CATEGORY, $list_alt31, $list_alt229, $list_alt230);
        methods.subloop_register_instance_method(TEST_CATEGORY, SET_ENABLED, TEST_CATEGORY_SET_ENABLED_METHOD);
        methods.methods_incorporate_instance_method(ISOLATE, TEST_CATEGORY, $list_alt31, NIL, $list_alt234);
        methods.subloop_register_instance_method(TEST_CATEGORY, ISOLATE, TEST_CATEGORY_ISOLATE_METHOD);
        classes.subloop_new_class(TEST_CASE, OBJECT, NIL, NIL, $list_alt238);
        classes.class_set_implements_slot_listeners(TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_INSTANCE);
        subloop_reserved_initialize_test_case_class(TEST_CASE);
        methods.methods_incorporate_instance_method(INITIALIZE, TEST_CASE, $list_alt10, NIL, $list_alt244);
        methods.subloop_register_instance_method(TEST_CASE, INITIALIZE, TEST_CASE_INITIALIZE_METHOD);
        methods.methods_incorporate_class_method(NEW, TEST_CASE, $list_alt248, $list_alt249, $list_alt250);
        methods.subloop_register_class_method(TEST_CASE, NEW, TEST_CASE_NEW_METHOD);
        methods.methods_incorporate_class_method(SET_MODULE, TEST_CASE, $list_alt31, $list_alt253, $list_alt254);
        methods.subloop_register_class_method(TEST_CASE, SET_MODULE, TEST_CASE_SET_MODULE_METHOD);
        methods.methods_incorporate_class_method(GET_MODULE, TEST_CASE, $list_alt31, NIL, $list_alt259);
        methods.subloop_register_class_method(TEST_CASE, GET_MODULE, TEST_CASE_GET_MODULE_METHOD);
        methods.methods_incorporate_class_method(ADD_CATEGORY, TEST_CASE, $list_alt31, $list_alt263, $list_alt264);
        methods.subloop_register_class_method(TEST_CASE, ADD_CATEGORY, TEST_CASE_ADD_CATEGORY_METHOD);
        methods.methods_incorporate_class_method(DELETE_CATEGORY, TEST_CASE, $list_alt31, $list_alt267, $list_alt268);
        methods.subloop_register_class_method(TEST_CASE, DELETE_CATEGORY, TEST_CASE_DELETE_CATEGORY_METHOD);
        methods.methods_incorporate_class_method(GET_CATEGORIES, TEST_CASE, $list_alt31, NIL, $list_alt272);
        methods.subloop_register_class_method(TEST_CASE, GET_CATEGORIES, TEST_CASE_GET_CATEGORIES_METHOD);
        methods.methods_incorporate_class_method(ADD_SUITE, TEST_CASE, $list_alt31, $list_alt179, $list_alt275);
        methods.subloop_register_class_method(TEST_CASE, ADD_SUITE, TEST_CASE_ADD_SUITE_METHOD);
        methods.methods_incorporate_class_method(DELETE_SUITE, TEST_CASE, $list_alt31, $list_alt185, $list_alt278);
        methods.subloop_register_class_method(TEST_CASE, DELETE_SUITE, TEST_CASE_DELETE_SUITE_METHOD);
        methods.methods_incorporate_class_method(GET_SUITES, TEST_CASE, $list_alt31, NIL, $list_alt169);
        methods.subloop_register_class_method(TEST_CASE, GET_SUITES, TEST_CASE_GET_SUITES_METHOD);
        methods.methods_incorporate_class_method(GET_TEST_METHODS, TEST_CASE, $list_alt31, NIL, $list_alt284);
        methods.subloop_register_class_method(TEST_CASE, GET_TEST_METHODS, TEST_CASE_GET_TEST_METHODS_METHOD);
        methods.methods_incorporate_class_method(INITIALIZE_LOCK, TEST_CASE, $list_alt31, NIL, $list_alt288);
        methods.subloop_register_class_method(TEST_CASE, INITIALIZE_LOCK, TEST_CASE_INITIALIZE_LOCK_METHOD);
        methods.methods_incorporate_class_method(ENABLEDP, TEST_CASE, $list_alt31, NIL, $list_alt225);
        methods.subloop_register_class_method(TEST_CASE, ENABLEDP, TEST_CASE_ENABLEDP_METHOD);
        methods.methods_incorporate_class_method(SET_ENABLED, TEST_CASE, $list_alt31, $list_alt294, $list_alt295);
        methods.subloop_register_class_method(TEST_CASE, SET_ENABLED, TEST_CASE_SET_ENABLED_METHOD);
        methods.methods_incorporate_instance_method(SET_RESULT, TEST_CASE, $list_alt10, $list_alt298, $list_alt299);
        methods.subloop_register_instance_method(TEST_CASE, SET_RESULT, TEST_CASE_SET_RESULT_METHOD);
        methods.methods_incorporate_instance_method(GET_RESULT, TEST_CASE, $list_alt31, NIL, $list_alt58);
        methods.subloop_register_instance_method(TEST_CASE, GET_RESULT, TEST_CASE_GET_RESULT_METHOD);
        methods.methods_incorporate_instance_method(SET_TEST_METHOD, TEST_CASE, $list_alt10, $list_alt42, $list_alt305);
        methods.subloop_register_instance_method(TEST_CASE, SET_TEST_METHOD, TEST_CASE_SET_TEST_METHOD_METHOD);
        methods.methods_incorporate_instance_method(GET_TEST_METHOD, TEST_CASE, $list_alt31, NIL, $list_alt48);
        methods.subloop_register_instance_method(TEST_CASE, GET_TEST_METHOD, TEST_CASE_GET_TEST_METHOD_METHOD);
        methods.methods_incorporate_instance_method(SETUP, TEST_CASE, $list_alt10, NIL, $list_alt311);
        methods.subloop_register_instance_method(TEST_CASE, SETUP, TEST_CASE_SETUP_METHOD);
        methods.methods_incorporate_instance_method(CLEANUP, TEST_CASE, $list_alt10, NIL, $list_alt311);
        methods.subloop_register_instance_method(TEST_CASE, CLEANUP, TEST_CASE_CLEANUP_METHOD);
        methods.methods_incorporate_instance_method(TEST, TEST_CASE, $list_alt24, NIL, $list_alt315);
        methods.subloop_register_instance_method(TEST_CASE, TEST, TEST_CASE_TEST_METHOD);
        methods.methods_incorporate_instance_method(FAIL_UNLESS, TEST_CASE, $list_alt10, $list_alt319, $list_alt320);
        methods.subloop_register_instance_method(TEST_CASE, FAIL_UNLESS, TEST_CASE_FAIL_UNLESS_METHOD);
        methods.methods_incorporate_instance_method(FAIL_IF, TEST_CASE, $list_alt10, $list_alt319, $list_alt323);
        methods.subloop_register_instance_method(TEST_CASE, FAIL_IF, TEST_CASE_FAIL_IF_METHOD);
        methods.methods_incorporate_instance_method(FAIL_IF_EQUAL, TEST_CASE, $list_alt10, $list_alt326, $list_alt327);
        methods.subloop_register_instance_method(TEST_CASE, FAIL_IF_EQUAL, TEST_CASE_FAIL_IF_EQUAL_METHOD);
        methods.methods_incorporate_instance_method(FAIL_UNLESS_EQUAL, TEST_CASE, $list_alt10, $list_alt326, $list_alt331);
        methods.subloop_register_instance_method(TEST_CASE, FAIL_UNLESS_EQUAL, TEST_CASE_FAIL_UNLESS_EQUAL_METHOD);
        methods.methods_incorporate_instance_method(FAIL_IF_ERROR, TEST_CASE, $list_alt10, $list_alt335, $list_alt336);
        methods.subloop_register_instance_method(TEST_CASE, FAIL_IF_ERROR, TEST_CASE_FAIL_IF_ERROR_METHOD);
        methods.methods_incorporate_instance_method(FAIL_UNLESS_ERROR, TEST_CASE, $list_alt10, $list_alt335, $list_alt340);
        methods.subloop_register_instance_method(TEST_CASE, FAIL_UNLESS_ERROR, TEST_CASE_FAIL_UNLESS_ERROR_METHOD);
        methods.methods_incorporate_instance_method(FAIL, TEST_CASE, $list_alt10, $list_alt343, $list_alt344);
        methods.subloop_register_instance_method(TEST_CASE, FAIL, TEST_CASE_FAIL_METHOD);
        methods.methods_incorporate_instance_method(ISOLATE, TEST_CASE, $list_alt31, NIL, $list_alt350);
        methods.subloop_register_instance_method(TEST_CASE, ISOLATE, TEST_CASE_ISOLATE_METHOD);
        subl_macro_promotions.declare_defglobal($test_suite_dictionary$);
        classes.subloop_new_class(TEST_SUITE, SUNIT_LOCKABLE, NIL, NIL, $list_alt358);
        classes.class_set_implements_slot_listeners(TEST_SUITE, NIL);
        classes.subloop_note_class_initialization_function(TEST_SUITE, SUBLOOP_RESERVED_INITIALIZE_TEST_SUITE_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_SUITE, SUBLOOP_RESERVED_INITIALIZE_TEST_SUITE_INSTANCE);
        subloop_reserved_initialize_test_suite_class(TEST_SUITE);
        methods.methods_incorporate_instance_method(INITIALIZE, TEST_SUITE, $list_alt24, NIL, $list_alt362);
        methods.subloop_register_instance_method(TEST_SUITE, INITIALIZE, TEST_SUITE_INITIALIZE_METHOD);
        methods.methods_incorporate_class_method(NEW, TEST_SUITE, $list_alt31, $list_alt365, $list_alt366);
        methods.subloop_register_class_method(TEST_SUITE, NEW, TEST_SUITE_NEW_METHOD);
        methods.methods_incorporate_instance_method(GET_NAME, TEST_SUITE, $list_alt31, NIL, $list_alt137);
        methods.subloop_register_instance_method(TEST_SUITE, GET_NAME, TEST_SUITE_GET_NAME_METHOD);
        methods.methods_incorporate_instance_method(SET_NAME, TEST_SUITE, $list_alt31, $list_alt371, $list_alt372);
        methods.subloop_register_instance_method(TEST_SUITE, SET_NAME, TEST_SUITE_SET_NAME_METHOD);
        methods.methods_incorporate_instance_method(ADD_CATEGORY, TEST_SUITE, $list_alt31, $list_alt263, $list_alt375);
        methods.subloop_register_instance_method(TEST_SUITE, ADD_CATEGORY, TEST_SUITE_ADD_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method(DELETE_CATEGORY, TEST_SUITE, $list_alt31, $list_alt267, $list_alt379);
        methods.subloop_register_instance_method(TEST_SUITE, DELETE_CATEGORY, TEST_SUITE_DELETE_CATEGORY_METHOD);
        methods.methods_incorporate_instance_method(GET_CATEGORIES, TEST_SUITE, $list_alt31, NIL, $list_alt272);
        methods.subloop_register_instance_method(TEST_SUITE, GET_CATEGORIES, TEST_SUITE_GET_CATEGORIES_METHOD);
        methods.methods_incorporate_instance_method(ADD_MODULE, TEST_SUITE, $list_alt31, $list_alt384, $list_alt385);
        methods.subloop_register_instance_method(TEST_SUITE, ADD_MODULE, TEST_SUITE_ADD_MODULE_METHOD);
        methods.methods_incorporate_instance_method(DELETE_MODULE, TEST_SUITE, $list_alt31, $list_alt389, $list_alt390);
        methods.subloop_register_instance_method(TEST_SUITE, DELETE_MODULE, TEST_SUITE_DELETE_MODULE_METHOD);
        methods.methods_incorporate_instance_method(GET_MODULES, TEST_SUITE, $list_alt31, NIL, $list_alt394);
        methods.subloop_register_instance_method(TEST_SUITE, GET_MODULES, TEST_SUITE_GET_MODULES_METHOD);
        methods.methods_incorporate_instance_method(ADD_TEST_CASE, TEST_SUITE, $list_alt31, $list_alt145, $list_alt397);
        methods.subloop_register_instance_method(TEST_SUITE, ADD_TEST_CASE, TEST_SUITE_ADD_TEST_CASE_METHOD);
        methods.methods_incorporate_instance_method(DELETE_TEST_CASE, TEST_SUITE, $list_alt31, $list_alt151, $list_alt400);
        methods.subloop_register_instance_method(TEST_SUITE, DELETE_TEST_CASE, TEST_SUITE_DELETE_TEST_CASE_METHOD);
        methods.methods_incorporate_instance_method(GET_TEST_CASES, TEST_SUITE, $list_alt31, NIL, $list_alt156);
        methods.subloop_register_instance_method(TEST_SUITE, GET_TEST_CASES, TEST_SUITE_GET_TEST_CASES_METHOD);
        methods.methods_incorporate_instance_method(ENABLEDP, TEST_SUITE, $list_alt31, NIL, $list_alt225);
        methods.subloop_register_instance_method(TEST_SUITE, ENABLEDP, TEST_SUITE_ENABLEDP_METHOD);
        methods.methods_incorporate_instance_method(SET_ENABLED, TEST_SUITE, $list_alt31, $list_alt294, $list_alt407);
        methods.subloop_register_instance_method(TEST_SUITE, SET_ENABLED, TEST_SUITE_SET_ENABLED_METHOD);
        methods.methods_incorporate_instance_method(GET_ALL_TEST_CASES, TEST_SUITE, $list_alt31, NIL, $list_alt410);
        methods.subloop_register_instance_method(TEST_SUITE, GET_ALL_TEST_CASES, TEST_SUITE_GET_ALL_TEST_CASES_METHOD);
        methods.methods_incorporate_instance_method(ISOLATE, TEST_SUITE, $list_alt31, NIL, $list_alt413);
        methods.subloop_register_instance_method(TEST_SUITE, ISOLATE, TEST_SUITE_ISOLATE_METHOD);
        classes.subloop_new_class(TEST_RUNNER, SUNIT_LOCKABLE, NIL, NIL, $list_alt417);
        classes.class_set_implements_slot_listeners(TEST_RUNNER, NIL);
        classes.subloop_note_class_initialization_function(TEST_RUNNER, SUBLOOP_RESERVED_INITIALIZE_TEST_RUNNER_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_RUNNER, SUBLOOP_RESERVED_INITIALIZE_TEST_RUNNER_INSTANCE);
        subloop_reserved_initialize_test_runner_class(TEST_RUNNER);
        methods.methods_incorporate_instance_method(SET_STREAM, TEST_RUNNER, $list_alt10, $list_alt422, $list_alt423);
        methods.subloop_register_instance_method(TEST_RUNNER, SET_STREAM, TEST_RUNNER_SET_STREAM_METHOD);
        methods.methods_incorporate_instance_method(GET_STREAM, TEST_RUNNER, $list_alt10, NIL, $list_alt428);
        methods.subloop_register_instance_method(TEST_RUNNER, GET_STREAM, TEST_RUNNER_GET_STREAM_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, TEST_RUNNER, $list_alt10, NIL, $list_alt431);
        methods.subloop_register_instance_method(TEST_RUNNER, INITIALIZE, TEST_RUNNER_INITIALIZE_METHOD);
        methods.methods_incorporate_class_method(NEW, TEST_RUNNER, $list_alt31, $list_alt434, $list_alt435);
        methods.subloop_register_class_method(TEST_RUNNER, NEW, TEST_RUNNER_NEW_METHOD);
        methods.methods_incorporate_instance_method(RUN, TEST_RUNNER, $list_alt31, $list_alt438, $list_alt439);
        methods.subloop_register_instance_method(TEST_RUNNER, RUN, TEST_RUNNER_RUN_METHOD);
        methods.methods_incorporate_instance_method(RUN_TEST_CASE, TEST_RUNNER, $list_alt24, $list_alt443, $list_alt444);
        methods.subloop_register_instance_method(TEST_RUNNER, RUN_TEST_CASE, TEST_RUNNER_RUN_TEST_CASE_METHOD);
        methods.methods_incorporate_instance_method(HANDLE_PROBLEM_CODE, TEST_RUNNER, $list_alt24, $list_alt449, $list_alt450);
        methods.subloop_register_instance_method(TEST_RUNNER, HANDLE_PROBLEM_CODE, TEST_RUNNER_HANDLE_PROBLEM_CODE_METHOD);
        methods.methods_incorporate_instance_method(RUN_TEST_SUITE, TEST_RUNNER, $list_alt24, $list_alt467, $list_alt468);
        methods.subloop_register_instance_method(TEST_RUNNER, RUN_TEST_SUITE, TEST_RUNNER_RUN_TEST_SUITE_METHOD);
        classes.subloop_new_class(CYCL_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt471);
        classes.class_set_implements_slot_listeners(CYCL_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(CYCL_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_CYCL_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(CYCL_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_CYCL_TEST_CASE_INSTANCE);
        subloop_reserved_initialize_cycl_test_case_class(CYCL_TEST_CASE);
        methods.methods_incorporate_instance_method(NEW_TEST_CONSTANT, CYCL_TEST_CASE, $list_alt10, $list_alt476, $list_alt477);
        methods.subloop_register_instance_method(CYCL_TEST_CASE, NEW_TEST_CONSTANT, CYCL_TEST_CASE_NEW_TEST_CONSTANT_METHOD);
        methods.methods_incorporate_instance_method(DO_ASSERTS, CYCL_TEST_CASE, $list_alt10, $list_alt483, $list_alt484);
        methods.subloop_register_instance_method(CYCL_TEST_CASE, DO_ASSERTS, CYCL_TEST_CASE_DO_ASSERTS_METHOD);
        methods.methods_incorporate_instance_method(DO_UNASSERTS, CYCL_TEST_CASE, $list_alt10, $list_alt483, $list_alt491);
        methods.subloop_register_instance_method(CYCL_TEST_CASE, DO_UNASSERTS, CYCL_TEST_CASE_DO_UNASSERTS_METHOD);
        methods.methods_incorporate_instance_method(CLEANUP, CYCL_TEST_CASE, $list_alt10, NIL, $list_alt495);
        methods.subloop_register_instance_method(CYCL_TEST_CASE, CLEANUP, CYCL_TEST_CASE_CLEANUP_METHOD);
        methods.methods_incorporate_instance_method(INITIALIZE, CYCL_TEST_CASE, $list_alt10, NIL, $list_alt498);
        methods.subloop_register_instance_method(CYCL_TEST_CASE, INITIALIZE, CYCL_TEST_CASE_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(CREATE_TEST_CONSTANT, CYCL_TEST_CASE, $list_alt10, $list_alt501, $list_alt502);
        methods.subloop_register_instance_method(CYCL_TEST_CASE, CREATE_TEST_CONSTANT, CYCL_TEST_CASE_CREATE_TEST_CONSTANT_METHOD);
        methods.methods_incorporate_instance_method(KILL_CONSTANTS, CYCL_TEST_CASE, $list_alt10, $list_alt508, $list_alt509);
        methods.subloop_register_instance_method(CYCL_TEST_CASE, KILL_CONSTANTS, CYCL_TEST_CASE_KILL_CONSTANTS_METHOD);
        methods.methods_incorporate_instance_method(CLEANUP_TEST_CONSTANTS, CYCL_TEST_CASE, $list_alt10, NIL, $list_alt514);
        methods.subloop_register_instance_method(CYCL_TEST_CASE, CLEANUP_TEST_CONSTANTS, CYCL_TEST_CASE_CLEANUP_TEST_CONSTANTS_METHOD);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol SUNIT_LOCKABLE = makeSymbol("SUNIT-LOCKABLE");



    static private final SubLList $list_alt2 = list(list(makeSymbol("LOCK"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")));





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUNIT_LOCKABLE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUNIT-LOCKABLE-CLASS");





    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SUNIT_LOCKABLE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SUNIT-LOCKABLE-INSTANCE");



    static private final SubLList $list_alt10 = list(makeKeyword("PROTECTED"));

    static private final SubLList $list_alt11 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("LOCK"), list(makeSymbol("MAKE-LOCK"), list(makeSymbol("FORMAT"), NIL, makeString("~S lock"), makeSymbol("SELF")))), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym12$OUTER_CATCH_FOR_SUNIT_LOCKABLE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SUNIT-LOCKABLE-METHOD");

    static private final SubLString $str_alt13$_S_lock = makeString("~S lock");

    private static final SubLSymbol SUNIT_LOCKABLE_INITIALIZE_METHOD = makeSymbol("SUNIT-LOCKABLE-INITIALIZE-METHOD");

    private static final SubLSymbol TEST_RESULT = makeSymbol("TEST-RESULT");

    static private final SubLList $list_alt16 = list(new SubLObject[]{ list(makeSymbol("TEST-CASE"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TEST-METHOD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("RESULT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("EXPLANATION"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TIME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TEST-CASE"), list(makeSymbol("TEST-CASE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TEST-METHOD"), list(makeSymbol("METHOD")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-METHOD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-RESULT"), list(makeSymbol("RESULT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RESULT"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-EXPLANATION"), list(makeSymbol("EXPLANATION")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-EXPLANATION"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TIME"), list(makeSymbol("TIME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TIME"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NOTE-ERROR"), list(makeSymbol("ERROR-MESSAGE"), makeSymbol("PHASE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FORMAT"), list(makeSymbol("STREAM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ISOLATE"), NIL, makeKeyword("PUBLIC")) });











    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_RESULT_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-RESULT-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_RESULT_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-RESULT-INSTANCE");

    static private final SubLList $list_alt24 = list(makeKeyword("PRIVATE"));

    static private final SubLList $list_alt25 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("TEST-CASE"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TEST-METHOD"), NIL), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), makeKeyword("SUCCESS")), list(makeSymbol("CSETQ"), makeSymbol("EXPLANATION"), makeString("")), list(makeSymbol("CSETQ"), makeSymbol("TIME"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym26$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");



    static private final SubLString $str_alt28$ = makeString("");

    private static final SubLSymbol TEST_RESULT_INITIALIZE_METHOD = makeSymbol("TEST-RESULT-INITIALIZE-METHOD");

    private static final SubLSymbol SET_TEST_CASE = makeSymbol("SET-TEST-CASE");

    static private final SubLList $list_alt31 = list(makeKeyword("PUBLIC"));

    static private final SubLList $list_alt32 = list(makeSymbol("TEST-CASE-NAME"));

    static private final SubLList $list_alt33 = list(list(makeSymbol("MUST"), list(makeSymbol("SUBCLASSP"), makeSymbol("TEST-CASE-NAME"), list(QUOTE, makeSymbol("TEST-CASE"))), makeString("~A is not the name of a known test case class."), makeSymbol("TEST-CASE-NAME")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("TEST-CASE"), makeSymbol("TEST-CASE-NAME"))), list(RET, makeSymbol("TEST-CASE")));

    static private final SubLSymbol $sym34$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");

    static private final SubLString $str_alt35$_A_is_not_the_name_of_a_known_tes = makeString("~A is not the name of a known test case class.");

    private static final SubLSymbol TEST_RESULT_SET_TEST_CASE_METHOD = makeSymbol("TEST-RESULT-SET-TEST-CASE-METHOD");

    private static final SubLSymbol GET_TEST_CASE = makeSymbol("GET-TEST-CASE");

    static private final SubLList $list_alt38 = list(list(RET, makeSymbol("TEST-CASE")));

    static private final SubLSymbol $sym39$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");

    private static final SubLSymbol TEST_RESULT_GET_TEST_CASE_METHOD = makeSymbol("TEST-RESULT-GET-TEST-CASE-METHOD");

    private static final SubLSymbol SET_TEST_METHOD = makeSymbol("SET-TEST-METHOD");

    static private final SubLList $list_alt42 = list(makeSymbol("METHOD"));

    static private final SubLList $list_alt43 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("METHOD"), makeSymbol("SYMBOLP")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("TEST-METHOD"), makeSymbol("METHOD"))), list(RET, makeSymbol("TEST-METHOD")));

    static private final SubLSymbol $sym44$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");



    private static final SubLSymbol TEST_RESULT_SET_TEST_METHOD_METHOD = makeSymbol("TEST-RESULT-SET-TEST-METHOD-METHOD");

    private static final SubLSymbol GET_TEST_METHOD = makeSymbol("GET-TEST-METHOD");

    static private final SubLList $list_alt48 = list(list(RET, makeSymbol("TEST-METHOD")));

    static private final SubLSymbol $sym49$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");

    private static final SubLSymbol TEST_RESULT_GET_TEST_METHOD_METHOD = makeSymbol("TEST-RESULT-GET-TEST-METHOD-METHOD");



    static private final SubLList $list_alt52 = list(makeSymbol("RES"));

    static private final SubLList $list_alt53 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("RES"), makeSymbol("KEYWORDP")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), makeSymbol("RES"))), list(RET, makeSymbol("RESULT")));

    static private final SubLSymbol $sym54$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");



    private static final SubLSymbol TEST_RESULT_SET_RESULT_METHOD = makeSymbol("TEST-RESULT-SET-RESULT-METHOD");



    static private final SubLList $list_alt58 = list(list(RET, makeSymbol("RESULT")));

    static private final SubLSymbol $sym59$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");

    private static final SubLSymbol TEST_RESULT_GET_RESULT_METHOD = makeSymbol("TEST-RESULT-GET-RESULT-METHOD");

    private static final SubLSymbol SET_EXPLANATION = makeSymbol("SET-EXPLANATION");

    static private final SubLList $list_alt62 = list(makeSymbol("EXPLAIN"));

    static private final SubLList $list_alt63 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("EXPLAIN"), makeSymbol("STRINGP")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("EXPLANATION"), makeSymbol("EXPLAIN"))), list(RET, makeSymbol("EXPLANATION")));

    static private final SubLSymbol $sym64$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");



    private static final SubLSymbol TEST_RESULT_SET_EXPLANATION_METHOD = makeSymbol("TEST-RESULT-SET-EXPLANATION-METHOD");

    private static final SubLSymbol GET_EXPLANATION = makeSymbol("GET-EXPLANATION");

    static private final SubLList $list_alt68 = list(list(RET, makeSymbol("EXPLANATION")));

    static private final SubLSymbol $sym69$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");

    private static final SubLSymbol TEST_RESULT_GET_EXPLANATION_METHOD = makeSymbol("TEST-RESULT-GET-EXPLANATION-METHOD");

    private static final SubLSymbol SET_TIME = makeSymbol("SET-TIME");

    static private final SubLList $list_alt72 = list(makeSymbol("NEW-TIME"));

    static private final SubLList $list_alt73 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-TIME"), makeSymbol("INTEGERP")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("TIME"), makeSymbol("NEW-TIME"))), list(RET, makeSymbol("TIME")));

    static private final SubLSymbol $sym74$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");



    private static final SubLSymbol TEST_RESULT_SET_TIME_METHOD = makeSymbol("TEST-RESULT-SET-TIME-METHOD");

    private static final SubLSymbol GET_TIME = makeSymbol("GET-TIME");

    static private final SubLList $list_alt78 = list(list(RET, makeSymbol("TIME")));

    static private final SubLSymbol $sym79$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");

    private static final SubLSymbol TEST_RESULT_GET_TIME_METHOD = makeSymbol("TEST-RESULT-GET-TIME-METHOD");

    private static final SubLSymbol NOTE_ERROR = makeSymbol("NOTE-ERROR");

    static private final SubLList $list_alt82 = list(makeSymbol("ERROR-MESSAGE"), makeSymbol("PHASE"));

    static private final SubLList $list_alt83 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("ERROR-MESSAGE"), makeSymbol("STRINGP")), list(makeSymbol("CLET"), list(list(makeSymbol("PREAMBLE"), NIL)), list(makeSymbol("PCASE"), makeSymbol("PHASE"), list(makeKeyword("SETUP"), list(makeSymbol("CSETQ"), makeSymbol("PREAMBLE"), makeString("Halted with this error during setup: "))), list(makeKeyword("EXECUTION"), list(makeSymbol("CSETQ"), makeSymbol("PREAMBLE"), makeString("Halted with this error during execution:  "))), list(makeKeyword("CLEANUP"), list(makeSymbol("CSETQ"), makeSymbol("PREAMBLE"), makeString("Halted with this error during cleanup:  "))), list(makeSymbol("OTHERWISE"), list(makeSymbol("ERROR"), makeString("Unknown test phase ~A"), makeSymbol("PHASE")))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("SET-RESULT"), makeSymbol("SELF"), makeKeyword("ERROR")), list(makeSymbol("SET-EXPLANATION"), makeSymbol("SELF"), list(makeSymbol("CCONCATENATE"), makeSymbol("PREAMBLE"), makeSymbol("ERROR-MESSAGE"))))), list(RET, NIL));

    static private final SubLSymbol $sym84$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");



    static private final SubLString $str_alt86$Halted_with_this_error_during_set = makeString("Halted with this error during setup: ");

    private static final SubLSymbol $EXECUTION = makeKeyword("EXECUTION");

    static private final SubLString $str_alt88$Halted_with_this_error_during_exe = makeString("Halted with this error during execution:  ");

    private static final SubLSymbol $CLEANUP = makeKeyword("CLEANUP");

    static private final SubLString $str_alt90$Halted_with_this_error_during_cle = makeString("Halted with this error during cleanup:  ");

    static private final SubLString $str_alt91$Unknown_test_phase__A = makeString("Unknown test phase ~A");



    private static final SubLSymbol TEST_RESULT_NOTE_ERROR_METHOD = makeSymbol("TEST-RESULT-NOTE-ERROR-METHOD");



    static private final SubLList $list_alt95 = list(makeSymbol("STREAM"));

    static private final SubLList $list_alt96 = list(list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%~%Test Case: ~A "), makeSymbol("TEST-CASE")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%Test Method: ~A~% "), makeSymbol("TEST-METHOD")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%Finished in ~A ~A with this result: ~A"), makeSymbol("TIME"), list(makeSymbol("FIF"), list(EQL, makeSymbol("TIME"), ONE_INTEGER), makeString("second"), makeString("seconds")), makeSymbol("RESULT")), list(makeSymbol("PIF"), list(makeSymbol("EMPTY-STRING-P"), makeSymbol("EXPLANATION")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%~%")), list(makeSymbol("FORMAT"), makeSymbol("STREAM"), makeString("~%Explanation: ~A~%~%"), makeSymbol("EXPLANATION"))), list(RET, NIL));

    static private final SubLSymbol $sym97$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");

    static private final SubLString $str_alt98$____Test_Case___A_ = makeString("~%~%Test Case: ~A ");

    static private final SubLString $str_alt99$__Test_Method___A___ = makeString("~%Test Method: ~A~% ");

    static private final SubLString $str_alt100$__Finished_in__A__A_with_this_res = makeString("~%Finished in ~A ~A with this result: ~A");

    static private final SubLString $$$second = makeString("second");

    static private final SubLString $$$seconds = makeString("seconds");

    static private final SubLString $str_alt103$____ = makeString("~%~%");

    static private final SubLString $str_alt104$__Explanation___A____ = makeString("~%Explanation: ~A~%~%");

    private static final SubLSymbol TEST_RESULT_FORMAT_METHOD = makeSymbol("TEST-RESULT-FORMAT-METHOD");



    static private final SubLList $list_alt107 = list(list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("TIME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("EXPLANATION"), NIL), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TEST-METHOD"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TEST-CASE"), NIL)), list(makeSymbol("ISOLATE"), makeSymbol("SUPER")), list(RET, NIL));

    static private final SubLSymbol $sym108$OUTER_CATCH_FOR_TEST_RESULT_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RESULT-METHOD");

    private static final SubLSymbol TEST_RESULT_ISOLATE_METHOD = makeSymbol("TEST-RESULT-ISOLATE-METHOD");

    static private final SubLString $$$Test_Category_Dictionary_Lock = makeString("Test Category Dictionary Lock");

    public static final SubLSymbol $test_category_dictionary$ = makeSymbol("*TEST-CATEGORY-DICTIONARY*");

    private static final SubLSymbol TEST_CATEGORY_P = makeSymbol("TEST-CATEGORY-P");

    static private final SubLString $$$Skip_removal_attempt = makeString("Skip removal attempt");

    static private final SubLString $str_alt114$_A_is_not_the_name_of_a_known_tes = makeString("~A is not the name of a known test-category");

    private static final SubLSymbol TEST_CATEGORY = makeSymbol("TEST-CATEGORY");

    static private final SubLList $list_alt116 = list(new SubLObject[]{ list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUPERCATEGORIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUBCATEGORIES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("SUITES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("ENABLED"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TEST-CASES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), list(makeSymbol("NAME"), makeSymbol("&OPTIONAL"), makeSymbol("SUPERCATEGORIES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TEST-CASE"), list(makeSymbol("TEST-CASE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-TEST-CASE"), list(makeSymbol("TEST-CASE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TEST-CASES"), list(makeSymbol("TEST-CASES")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-TEST-CASES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUITE"), list(makeSymbol("SUITE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SUITE"), list(makeSymbol("SUITE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUITES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUITES"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NAME"), list(makeSymbol("NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBCATEGORIES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUBCATEGORIES"), list(makeSymbol("SUBS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUBCATEGORY"), list(makeSymbol("CAT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SUBCATEGORY"), list(makeSymbol("SUB")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUPERCATEGORIES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-SUPERCATEGORIES"), list(makeSymbol("SUPERS")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-SUPERCATEGORY"), list(makeSymbol("CAT")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-SUPERCATEGORY"), list(makeSymbol("SUPER")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENABLEDP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ENABLED"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ISOLATE"), NIL, makeKeyword("PUBLIC")) });













    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_CATEGORY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-CATEGORY-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_CATEGORY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-CATEGORY-INSTANCE");



    static private final SubLList $list_alt126 = list(makeSymbol("NEW-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("NEW-SUPERCATEGORIES"));

    static private final SubLList $list_alt127 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-INSTANCE"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("STORE-TEST-CATEGORY-BY-NAME"), makeSymbol("NEW-NAME"), makeSymbol("NEW-INSTANCE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-INSTANCE"), list(QUOTE, makeSymbol("SET-NAME")), makeSymbol("NEW-NAME")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-INSTANCE"), list(QUOTE, makeSymbol("SET-SUPERCATEGORIES")), makeSymbol("NEW-SUPERCATEGORIES")), list(makeSymbol("CDOLIST"), list(makeSymbol("SUPER-NAME"), makeSymbol("NEW-SUPERCATEGORIES")), list(makeSymbol("CLET"), list(list(makeSymbol("SUPERCATEGORY"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("SUPER-NAME"))), list(makeSymbol("EXISTING-SUBCATEGORIES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SUPERCATEGORY"), list(QUOTE, makeSymbol("GET-SUBCATEGORIES")))), list(makeSymbol("NEW-SUBS"), list(makeSymbol("UNION"), list(makeSymbol("LIST"), makeSymbol("NEW-NAME")), makeSymbol("EXISTING-SUBCATEGORIES")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SUPERCATEGORY"), list(QUOTE, makeSymbol("SET-SUBCATEGORIES")), makeSymbol("NEW-SUBS")))), list(RET, makeSymbol("NEW-INSTANCE"))));



    private static final SubLSymbol SET_SUPERCATEGORIES = makeSymbol("SET-SUPERCATEGORIES");

    private static final SubLSymbol GET_SUBCATEGORIES = makeSymbol("GET-SUBCATEGORIES");

    private static final SubLSymbol SET_SUBCATEGORIES = makeSymbol("SET-SUBCATEGORIES");

    private static final SubLSymbol TEST_CATEGORY_NEW_METHOD = makeSymbol("TEST-CATEGORY-NEW-METHOD");

    static private final SubLList $list_alt133 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeString("")), list(makeSymbol("CSETQ"), makeSymbol("SUPERCATEGORIES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SUBCATEGORIES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("SUITES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ENABLED"), T), list(makeSymbol("CSETQ"), makeSymbol("TEST-CASES"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym134$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_INITIALIZE_METHOD = makeSymbol("TEST-CATEGORY-INITIALIZE-METHOD");



    static private final SubLList $list_alt137 = list(list(RET, makeSymbol("NAME")));

    static private final SubLSymbol $sym138$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_GET_NAME_METHOD = makeSymbol("TEST-CATEGORY-GET-NAME-METHOD");

    static private final SubLList $list_alt140 = list(makeSymbol("NEW-CATEGORY-NAME"));

    static private final SubLList $list_alt141 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-CATEGORY-NAME"), makeSymbol("STRINGP")), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), makeSymbol("NAME")), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(EQUAL, makeString(""), makeSymbol("NAME")), list(EQUAL, makeSymbol("NAME"), makeSymbol("NEW-CATEGORY-NAME"))), list(makeSymbol("REMOVE-TEST-CATEGORY-BY-NAME"), makeSymbol("NAME")))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeSymbol("NEW-CATEGORY-NAME"))), list(makeSymbol("STORE-TEST-CATEGORY-BY-NAME"), makeSymbol("NAME"), makeSymbol("SELF")), list(RET, makeSymbol("NAME")));

    static private final SubLSymbol $sym142$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_SET_NAME_METHOD = makeSymbol("TEST-CATEGORY-SET-NAME-METHOD");

    private static final SubLSymbol ADD_TEST_CASE = makeSymbol("ADD-TEST-CASE");

    static private final SubLList $list_alt145 = list(makeSymbol("NEW-TEST-CASE"));

    static private final SubLList $list_alt146 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-TEST-CASE"), makeSymbol("SYMBOLP")), list(makeSymbol("CLET"), list(list(makeSymbol("TEST-CASE"), list(makeSymbol("GET-TEST-CASE-BY-SYMBOL"), makeSymbol("NEW-TEST-CASE")))), list(makeSymbol("MUST"), makeSymbol("TEST-CASE"), makeString("~A is not a known Test Case"), makeSymbol("NEW-TEST-CASE")), list(makeSymbol("CSETQ"), makeSymbol("TEST-CASES"), list(makeSymbol("UNION"), list(makeSymbol("LIST"), makeSymbol("NEW-TEST-CASE")), list(makeSymbol("GET-TEST-CASES"), makeSymbol("SELF"))))), list(RET, list(makeSymbol("GET-TEST-CASES"), makeSymbol("SELF"))));

    static private final SubLSymbol $sym147$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    static private final SubLString $str_alt148$_A_is_not_a_known_Test_Case = makeString("~A is not a known Test Case");

    private static final SubLSymbol TEST_CATEGORY_ADD_TEST_CASE_METHOD = makeSymbol("TEST-CATEGORY-ADD-TEST-CASE-METHOD");

    private static final SubLSymbol DELETE_TEST_CASE = makeSymbol("DELETE-TEST-CASE");

    static private final SubLList $list_alt151 = list(makeSymbol("OLD-TEST-CASE"));

    static private final SubLList $list_alt152 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEST-CASE"), list(makeSymbol("GET-TEST-CASE-BY-SYMBOL"), makeSymbol("OLD-TEST-CASE")))), list(makeSymbol("MUST"), makeSymbol("TEST-CASE"), makeString("~A is not a known Test Case"), makeSymbol("OLD-TEST-CASE"))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("TEST-CASES"), list(makeSymbol("REMOVE"), makeSymbol("OLD-TEST-CASE"), list(makeSymbol("GET-TEST-CASES"), makeSymbol("SELF"))))), list(RET, NIL));

    static private final SubLSymbol $sym153$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_DELETE_TEST_CASE_METHOD = makeSymbol("TEST-CATEGORY-DELETE-TEST-CASE-METHOD");



    static private final SubLList $list_alt156 = list(list(RET, makeSymbol("TEST-CASES")));

    static private final SubLSymbol $sym157$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_GET_TEST_CASES_METHOD = makeSymbol("TEST-CATEGORY-GET-TEST-CASES-METHOD");

    private static final SubLSymbol SET_TEST_CASES = makeSymbol("SET-TEST-CASES");

    static private final SubLList $list_alt160 = list(makeSymbol("NEW-TEST-CASES"));

    static private final SubLList $list_alt161 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("NEW-TEST-CASE"), makeSymbol("NEW-TEST-CASES")), list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-TEST-CASE"), makeSymbol("SYMBOLP")), list(makeSymbol("CLET"), list(list(makeSymbol("TEST-CASE"), list(makeSymbol("GET-TEST-CASE-BY-SYMBOL"), makeSymbol("NEW-TEST-CASE")))), list(makeSymbol("MUST"), makeSymbol("TEST-CASE"), makeString("~A is not a known Test Case"), makeSymbol("NEW-TEST-CASE")))), list(makeSymbol("CSETQ"), makeSymbol("TEST-CASES"), makeSymbol("NEW-TEST-CASES")), list(RET, makeSymbol("TEST-CASES")));

    static private final SubLSymbol $sym162$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_SET_TEST_CASES_METHOD = makeSymbol("TEST-CATEGORY-SET-TEST-CASES-METHOD");

    private static final SubLSymbol GET_ALL_TEST_CASES = makeSymbol("GET-ALL-TEST-CASES");

    static private final SubLList $list_alt165 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBCATEGORY-NAME"), makeSymbol("SUBCATEGORIES")), list(makeSymbol("CLET"), list(list(makeSymbol("SUBCATEGORY"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("SUBCATEGORY-NAME")))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("UNION"), makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SUBCATEGORY"), list(QUOTE, makeSymbol("GET-ALL-TEST-CASES"))))))), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("UNION"), makeSymbol("TEST-CASES"), makeSymbol("RESULT"))), list(RET, makeSymbol("RESULT"))));

    static private final SubLSymbol $sym166$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_GET_ALL_TEST_CASES_METHOD = makeSymbol("TEST-CATEGORY-GET-ALL-TEST-CASES-METHOD");

    private static final SubLSymbol GET_SUITES = makeSymbol("GET-SUITES");

    static private final SubLList $list_alt169 = list(list(RET, makeSymbol("SUITES")));

    static private final SubLSymbol $sym170$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_GET_SUITES_METHOD = makeSymbol("TEST-CATEGORY-GET-SUITES-METHOD");

    private static final SubLSymbol SET_SUITES = makeSymbol("SET-SUITES");

    static private final SubLList $list_alt173 = list(makeSymbol("SUITE-NAMES"));

    static private final SubLList $list_alt174 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("SUITE-NAME"), makeSymbol("SUITE-NAMES")), list(makeSymbol("MUST"), list(makeSymbol("TEST-SUITE-P"), list(makeSymbol("GET-TEST-SUITE-BY-NAME"), makeSymbol("SUITE-NAME"))), makeString("~A is not a known instance of test suite "), makeSymbol("SUITE-NAME"))), list(makeSymbol("CSETQ"), makeSymbol("SUITES"), makeSymbol("SUITE-NAMES")), list(RET, makeSymbol("SUITES")));

    static private final SubLSymbol $sym175$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    static private final SubLString $str_alt176$_A_is_not_a_known_instance_of_tes = makeString("~A is not a known instance of test suite ");

    private static final SubLSymbol TEST_CATEGORY_SET_SUITES_METHOD = makeSymbol("TEST-CATEGORY-SET-SUITES-METHOD");

    private static final SubLSymbol ADD_SUITE = makeSymbol("ADD-SUITE");

    static private final SubLList $list_alt179 = list(makeSymbol("NEW-SUITE"));

    static private final SubLList $list_alt180 = list(list(makeSymbol("MUST"), list(makeSymbol("TEST-SUITE-P"), list(makeSymbol("GET-TEST-SUITE-BY-NAME"), makeSymbol("NEW-SUITE"))), makeString("~A is not a known instance of TEST-SUITE"), makeSymbol("NEW-SUITE")), list(makeSymbol("CPUSHNEW"), makeSymbol("NEW-SUITE"), makeSymbol("SUITES"), list(makeSymbol("FUNCTION"), EQUAL)), list(RET, makeSymbol("SUITES")));

    static private final SubLSymbol $sym181$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    static private final SubLString $str_alt182$_A_is_not_a_known_instance_of_TES = makeString("~A is not a known instance of TEST-SUITE");

    private static final SubLSymbol TEST_CATEGORY_ADD_SUITE_METHOD = makeSymbol("TEST-CATEGORY-ADD-SUITE-METHOD");

    private static final SubLSymbol DELETE_SUITE = makeSymbol("DELETE-SUITE");

    static private final SubLList $list_alt185 = list(makeSymbol("OLD-SUITE"));

    static private final SubLList $list_alt186 = list(list(makeSymbol("MUST"), list(makeSymbol("TEST-SUITE-P"), list(makeSymbol("GET-TEST-SUITE-BY-NAME"), makeSymbol("OLD-SUITE"))), makeString("~A is not a known instance of TEST-SUITE"), makeSymbol("OLD-SUITE")), list(makeSymbol("CSETQ"), makeSymbol("SUITES"), list(makeSymbol("REMOVE"), makeSymbol("OLD-SUITE"), makeSymbol("SUITES"), list(makeSymbol("FUNCTION"), EQUAL))), list(RET, makeSymbol("SUITES")));

    static private final SubLSymbol $sym187$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_DELETE_SUITE_METHOD = makeSymbol("TEST-CATEGORY-DELETE-SUITE-METHOD");

    static private final SubLList $list_alt189 = list(list(RET, makeSymbol("SUBCATEGORIES")));

    static private final SubLSymbol $sym190$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_GET_SUBCATEGORIES_METHOD = makeSymbol("TEST-CATEGORY-GET-SUBCATEGORIES-METHOD");

    static private final SubLList $list_alt192 = list(makeSymbol("SUBCATEGORY-NAMES"));

    static private final SubLList $list_alt193 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("SUBCATEGORY-NAME"), makeSymbol("SUBCATEGORY-NAMES")), list(makeSymbol("MUST"), list(makeSymbol("VALID-TEST-CATEGORY-NAME"), makeSymbol("SUBCATEGORY-NAME")), makeString("~A is not a known test category name."), makeSymbol("SUBCATEGORY-NAME"))), list(makeSymbol("CSETQ"), makeSymbol("SUBCATEGORIES"), makeSymbol("SUBCATEGORY-NAMES")), list(RET, makeSymbol("SUBCATEGORIES")));

    static private final SubLSymbol $sym194$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    static private final SubLString $str_alt195$_A_is_not_a_known_test_category_n = makeString("~A is not a known test category name.");

    private static final SubLSymbol TEST_CATEGORY_SET_SUBCATEGORIES_METHOD = makeSymbol("TEST-CATEGORY-SET-SUBCATEGORIES-METHOD");

    private static final SubLSymbol ADD_SUBCATEGORY = makeSymbol("ADD-SUBCATEGORY");

    static private final SubLList $list_alt198 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-CATEGORY-NAME"), makeSymbol("STRINGP")), list(makeSymbol("MUST"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("NEW-CATEGORY-NAME")), makeString("~A is not the name of a known TEST-CATEGORY instance."), makeSymbol("NEW-CATEGORY-NAME")), list(makeSymbol("CPUSHNEW"), makeSymbol("NEW-CATEGORY-NAME"), makeSymbol("SUBCATEGORIES"), list(makeSymbol("FUNCTION"), EQUAL)), list(RET, makeSymbol("SUBCATEGORIES")));

    static private final SubLSymbol $sym199$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    static private final SubLString $str_alt200$_A_is_not_the_name_of_a_known_TES = makeString("~A is not the name of a known TEST-CATEGORY instance.");

    private static final SubLSymbol TEST_CATEGORY_ADD_SUBCATEGORY_METHOD = makeSymbol("TEST-CATEGORY-ADD-SUBCATEGORY-METHOD");

    private static final SubLSymbol DELETE_SUBCATEGORY = makeSymbol("DELETE-SUBCATEGORY");

    static private final SubLList $list_alt203 = list(makeSymbol("OLD-SUBCATEGORY-NAME"));

    static private final SubLList $list_alt204 = list(list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("SUBCATEGORIES"), list(makeSymbol("REMOVE"), makeSymbol("OLD-SUBCATEGORY-NAME"), makeSymbol("SUBCATEGORIES"), list(makeSymbol("FUNCTION"), EQUAL)))), list(RET, NIL));

    static private final SubLSymbol $sym205$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_DELETE_SUBCATEGORY_METHOD = makeSymbol("TEST-CATEGORY-DELETE-SUBCATEGORY-METHOD");

    private static final SubLSymbol ADD_SUPERCATEGORY = makeSymbol("ADD-SUPERCATEGORY");

    static private final SubLList $list_alt208 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-CATEGORY-NAME"), makeSymbol("STRINGP")), list(makeSymbol("MUST"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("NEW-CATEGORY-NAME")), makeString("~A is not the name of a known TEST-CATEGORY instance."), makeSymbol("NEW-CATEGORY-NAME")), list(makeSymbol("CPUSHNEW"), makeSymbol("NEW-CATEGORY-NAME"), makeSymbol("SUPERCATEGORIES"), list(makeSymbol("FUNCTION"), EQUAL)), list(RET, makeSymbol("SUPERCATEGORIES")));

    static private final SubLSymbol $sym209$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_ADD_SUPERCATEGORY_METHOD = makeSymbol("TEST-CATEGORY-ADD-SUPERCATEGORY-METHOD");

    private static final SubLSymbol DELETE_SUPERCATEGORY = makeSymbol("DELETE-SUPERCATEGORY");

    static private final SubLList $list_alt212 = list(makeSymbol("OLD-SUPERCATEGORY-NAME"));

    static private final SubLList $list_alt213 = list(list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("SUPERCATEGORIES"), list(makeSymbol("REMOVE"), makeSymbol("OLD-SUPERCATEGORY-NAME"), makeSymbol("SUPERCATEGORIES"), list(makeSymbol("FUNCTION"), EQUAL)))), list(RET, NIL));

    static private final SubLSymbol $sym214$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_DELETE_SUPERCATEGORY_METHOD = makeSymbol("TEST-CATEGORY-DELETE-SUPERCATEGORY-METHOD");

    private static final SubLSymbol GET_SUPERCATEGORIES = makeSymbol("GET-SUPERCATEGORIES");

    static private final SubLList $list_alt217 = list(list(RET, makeSymbol("SUPERCATEGORIES")));

    static private final SubLSymbol $sym218$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_GET_SUPERCATEGORIES_METHOD = makeSymbol("TEST-CATEGORY-GET-SUPERCATEGORIES-METHOD");

    static private final SubLList $list_alt220 = list(makeSymbol("SUPERCATEGORY-NAMES"));

    static private final SubLList $list_alt221 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("SUPERCATEGORY-NAME"), makeSymbol("SUPERCATEGORY-NAMES")), list(makeSymbol("MUST"), list(makeSymbol("VALID-TEST-CATEGORY-NAME"), makeSymbol("SUPERCATEGORY-NAME")), makeString("~A is not a known test category name."), makeSymbol("SUPERCATEGORY-NAME"))), list(makeSymbol("CSETQ"), makeSymbol("SUPERCATEGORIES"), makeSymbol("SUPERCATEGORY-NAMES")), list(RET, makeSymbol("SUPERCATEGORIES")));

    static private final SubLSymbol $sym222$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_SET_SUPERCATEGORIES_METHOD = makeSymbol("TEST-CATEGORY-SET-SUPERCATEGORIES-METHOD");

    private static final SubLSymbol ENABLEDP = makeSymbol("ENABLEDP");

    static private final SubLList $list_alt225 = list(list(RET, makeSymbol("ENABLED")));

    static private final SubLSymbol $sym226$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");

    private static final SubLSymbol TEST_CATEGORY_ENABLEDP_METHOD = makeSymbol("TEST-CATEGORY-ENABLEDP-METHOD");

    private static final SubLSymbol SET_ENABLED = makeSymbol("SET-ENABLED");

    static private final SubLList $list_alt229 = list(makeSymbol("BOOL"));

    static private final SubLList $list_alt230 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("BOOL"), makeSymbol("ATOM")), list(makeSymbol("CSETQ"), makeSymbol("ENABLED"), makeSymbol("BOOL")), list(RET, makeSymbol("ENABLED")));

    static private final SubLSymbol $sym231$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");



    private static final SubLSymbol TEST_CATEGORY_SET_ENABLED_METHOD = makeSymbol("TEST-CATEGORY-SET-ENABLED-METHOD");

    static private final SubLList $list_alt234 = list(list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CDOLIST"), list(makeSymbol("SUITE"), makeSymbol("SUITES")), list(makeSymbol("CLET"), list(list(makeSymbol("OLD-SUITE"), list(makeSymbol("GET-TEST-SUITE-BY-NAME"), makeSymbol("SUITE")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-SUITE"), list(QUOTE, makeSymbol("DELETE-CATEGORY")), list(makeSymbol("GET-NAME"), makeSymbol("SELF"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("SUPERCATEGORY"), makeSymbol("SUPERCATEGORIES")), list(makeSymbol("CLET"), list(list(makeSymbol("OLD-SUPER-CATEGORY"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("SUPERCATEGORY")))), list(makeSymbol("DELETE-SUPERCATEGORY"), makeSymbol("SELF"), makeSymbol("SUPERCATEGORY")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-SUPER-CATEGORY"), list(QUOTE, makeSymbol("DELETE-SUBCATEGORY")), list(makeSymbol("GET-NAME"), makeSymbol("SELF"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("SUBCATEGORY"), makeSymbol("SUBCATEGORIES")), list(makeSymbol("CLET"), list(list(makeSymbol("OLD-SUB-CATEGORY"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("SUBCATEGORY")))), list(makeSymbol("DELETE-SUBCATEGORY"), makeSymbol("SELF"), makeSymbol("SUBCATEGORY")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("OLD-SUB-CATEGORY"), list(QUOTE, makeSymbol("DELETE-SUPERCATEGORY")), list(makeSymbol("GET-NAME"), makeSymbol("SELF"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEST-CASE"), makeSymbol("TEST-CASES")), list(makeSymbol("CLET"), list(list(makeSymbol("TEST-CASE-OBJ"), list(makeSymbol("GET-TEST-CASE-BY-SYMBOL"), makeSymbol("TEST-CASE")))), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("TEST-CASE-OBJ"), list(QUOTE, makeSymbol("DELETE-CATEGORY")), list(makeSymbol("GET-NAME"), makeSymbol("SELF"))))), list(makeSymbol("CSETQ"), makeSymbol("NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ENABLED"), NIL)), list(makeSymbol("REMOVE-TEST-CATEGORY-BY-NAME"), list(makeSymbol("GET-NAME"), makeSymbol("SELF"))), list(makeSymbol("ISOLATE"), makeSymbol("SUPER")), list(RET, NIL));

    static private final SubLSymbol $sym235$OUTER_CATCH_FOR_TEST_CATEGORY_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CATEGORY-METHOD");



    private static final SubLSymbol TEST_CATEGORY_ISOLATE_METHOD = makeSymbol("TEST-CATEGORY-ISOLATE-METHOD");

    static private final SubLList $list_alt238 = list(new SubLObject[]{ list(makeSymbol("MODULE"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("CATEGORIES"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("SUITES"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("TEST-METHODS"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("ENABLED"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("RESULT"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("TEST-METHOD"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("LOCK"), makeKeyword("CLASS"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), list(makeSymbol("TEST-METHOD")), makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SET-MODULE"), list(makeSymbol("NEW-MODULE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-MODULE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ADD-CATEGORY"), list(makeSymbol("NEW-CATEGORY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("DELETE-CATEGORY"), list(makeSymbol("OLD-CATEGORY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-CATEGORIES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ADD-SUITE"), list(makeSymbol("NEW-SUITE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("DELETE-SUITE"), list(makeSymbol("OLD-SUITE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-SUITES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("GET-TEST-METHODS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("INITIALIZE-LOCK"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("ENABLEDP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("SET-ENABLED"), list(makeSymbol("BOOLEAN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-RESULT"), list(makeSymbol("NEW-RESULT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RESULT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-TEST-METHOD"), list(makeSymbol("TEST-METHOD")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-METHOD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FAIL-UNLESS"), list(makeSymbol("EXPRESSION"), makeSymbol("EXPLANATION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FAIL-IF"), list(makeSymbol("EXPRESSION"), makeSymbol("EXPLANATION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FAIL"), list(makeSymbol("EXPLANATION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FAIL-IF-EQUAL"), list(makeSymbol("ITEM1"), makeSymbol("ITEM2"), makeSymbol("EXPLANATION"), makeSymbol("&OPTIONAL"), makeSymbol("TEST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FAIL-UNLESS-EQUAL"), list(makeSymbol("ITEM1"), makeSymbol("ITEM2"), makeSymbol("EXPLANATION"), makeSymbol("&OPTIONAL"), makeSymbol("TEST")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FAIL-IF-ERROR"), list(makeSymbol("EXPRESSION"), makeSymbol("EXPLANATION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FAIL-UNLESS-ERROR"), list(makeSymbol("EXPRESSION"), makeSymbol("EXPLANATION")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ISOLATE"), NIL, makeKeyword("PUBLIC")) });







    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-CASE-INSTANCE");

    static private final SubLList $list_alt244 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("NEW-CLASS-INSTANCE"), list(QUOTE, makeSymbol("TEST-RESULT")))), list(makeSymbol("CSETQ"), makeSymbol("TEST-METHOD"), list(QUOTE, makeSymbol("TEST"))), list(makeSymbol("CSETQ"), makeSymbol("ENABLED"), T), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym245$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");



    private static final SubLSymbol TEST_CASE_INITIALIZE_METHOD = makeSymbol("TEST-CASE-INITIALIZE-METHOD");

    static private final SubLList $list_alt248 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PUBLIC"));

    static private final SubLList $list_alt249 = list(makeSymbol("TEST-METHOD"));

    static private final SubLList $list_alt250 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-INSTANCE"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-INSTANCE"), list(QUOTE, makeSymbol("SET-TEST-METHOD")), makeSymbol("TEST-METHOD")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-INSTANCE"), list(QUOTE, makeSymbol("RESULT"))), list(QUOTE, makeSymbol("SET-TEST-CASE")), list(makeSymbol("CLASS-NAME"), list(makeSymbol("INSTANCE-CLASS"), makeSymbol("NEW-INSTANCE")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), list(makeSymbol("GET-SLOT"), makeSymbol("NEW-INSTANCE"), list(QUOTE, makeSymbol("RESULT"))), list(QUOTE, makeSymbol("SET-TEST-METHOD")), makeSymbol("TEST-METHOD")), list(RET, makeSymbol("NEW-INSTANCE"))));

    private static final SubLSymbol TEST_CASE_NEW_METHOD = makeSymbol("TEST-CASE-NEW-METHOD");

    private static final SubLSymbol SET_MODULE = makeSymbol("SET-MODULE");

    static private final SubLList $list_alt253 = list(makeSymbol("NEW-MODULE"));

    static private final SubLList $list_alt254 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-MODULE"), makeSymbol("MODULE-P")), list(makeSymbol("MODULE-ADD-TEST-CASE"), makeSymbol("NEW-MODULE"), list(makeSymbol("CLASS-NAME"), makeSymbol("SELF"))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("MODULE"), makeSymbol("NEW-MODULE"))), list(RET, makeSymbol("MODULE")));

    static private final SubLSymbol $sym255$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol MODULE_P = makeSymbol("MODULE-P");

    private static final SubLSymbol TEST_CASE_SET_MODULE_METHOD = makeSymbol("TEST-CASE-SET-MODULE-METHOD");

    private static final SubLSymbol GET_MODULE = makeSymbol("GET-MODULE");

    static private final SubLList $list_alt259 = list(list(RET, makeSymbol("MODULE")));

    static private final SubLSymbol $sym260$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_GET_MODULE_METHOD = makeSymbol("TEST-CASE-GET-MODULE-METHOD");

    private static final SubLSymbol ADD_CATEGORY = makeSymbol("ADD-CATEGORY");

    static private final SubLList $list_alt263 = list(makeSymbol("NEW-CATEGORY"));

    static private final SubLList $list_alt264 = list(list(makeSymbol("MUST"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("NEW-CATEGORY")), makeString("~A is not the name of a known TEST-CATEGORY instance."), makeSymbol("NEW-CATEGORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSHNEW"), makeSymbol("NEW-CATEGORY"), makeSymbol("CATEGORIES"))), list(makeSymbol("CLET"), list(list(makeSymbol("CATEGORY-OBJ"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("NEW-CATEGORY")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CATEGORY-OBJ"), list(QUOTE, makeSymbol("ADD-TEST-CASE")), list(makeSymbol("CLASS-NAME"), makeSymbol("SELF")))), list(RET, makeSymbol("CATEGORIES")));

    static private final SubLSymbol $sym265$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_ADD_CATEGORY_METHOD = makeSymbol("TEST-CASE-ADD-CATEGORY-METHOD");

    static private final SubLList $list_alt267 = list(makeSymbol("OLD-CATEGORY"));

    static private final SubLList $list_alt268 = list(list(makeSymbol("MUST"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("OLD-CATEGORY")), makeString("~A is not the name of a known TEST-CATEGORY instance."), makeSymbol("OLD-CATEGORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("CATEGORIES"), list(makeSymbol("REMOVE"), makeSymbol("OLD-CATEGORY"), makeSymbol("CATEGORIES"), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("CLET"), list(list(makeSymbol("CATEGORY-OBJ"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("OLD-CATEGORY")))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CATEGORY-OBJ"), list(QUOTE, makeSymbol("DELETE-TEST-CASE")), list(makeSymbol("CLASS-NAME"), makeSymbol("SELF")))), list(RET, makeSymbol("CATEGORIES")));

    static private final SubLSymbol $sym269$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_DELETE_CATEGORY_METHOD = makeSymbol("TEST-CASE-DELETE-CATEGORY-METHOD");



    static private final SubLList $list_alt272 = list(list(RET, makeSymbol("CATEGORIES")));

    static private final SubLSymbol $sym273$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_GET_CATEGORIES_METHOD = makeSymbol("TEST-CASE-GET-CATEGORIES-METHOD");

    static private final SubLList $list_alt275 = list(list(makeSymbol("MUST"), list(makeSymbol("TEST-SUITE-P"), list(makeSymbol("GET-TEST-SUITE-BY-NAME"), makeSymbol("NEW-SUITE"))), makeString("~A is not a known instance of TEST-SUITE"), makeSymbol("NEW-SUITE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CPUSHNEW"), makeSymbol("NEW-SUITE"), makeSymbol("SUITES"), list(makeSymbol("FUNCTION"), EQUAL))), list(RET, makeSymbol("SUITES")));

    static private final SubLSymbol $sym276$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_ADD_SUITE_METHOD = makeSymbol("TEST-CASE-ADD-SUITE-METHOD");

    static private final SubLList $list_alt278 = list(list(makeSymbol("MUST"), list(makeSymbol("TEST-SUITE-P"), list(makeSymbol("GET-TEST-SUITE-BY-NAME"), makeSymbol("OLD-SUITE"))), makeString("~A is not a known instance of TEST-SUITE"), makeSymbol("OLD-SUITE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("SUITES"), list(makeSymbol("REMOVE"), makeSymbol("OLD-SUITE"), makeSymbol("SUITES"), list(makeSymbol("FUNCTION"), EQUAL)))), list(RET, makeSymbol("SUITES")));

    static private final SubLSymbol $sym279$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_DELETE_SUITE_METHOD = makeSymbol("TEST-CASE-DELETE-SUITE-METHOD");

    static private final SubLSymbol $sym281$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_GET_SUITES_METHOD = makeSymbol("TEST-CASE-GET-SUITES-METHOD");

    private static final SubLSymbol GET_TEST_METHODS = makeSymbol("GET-TEST-METHODS");

    static private final SubLList $list_alt284 = list(list(RET, makeSymbol("TEST-METHODS")));

    static private final SubLSymbol $sym285$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_GET_TEST_METHODS_METHOD = makeSymbol("TEST-CASE-GET-TEST-METHODS-METHOD");

    private static final SubLSymbol INITIALIZE_LOCK = makeSymbol("INITIALIZE-LOCK");

    static private final SubLList $list_alt288 = list(list(makeSymbol("CSETQ"), makeSymbol("LOCK"), list(makeSymbol("MAKE-LOCK"), list(makeSymbol("FORMAT"), NIL, makeString("~A lock"), list(makeSymbol("CLASS-NAME"), makeSymbol("SELF"))))), list(RET, NIL));

    static private final SubLSymbol $sym289$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    static private final SubLString $str_alt290$_A_lock = makeString("~A lock");

    private static final SubLSymbol TEST_CASE_INITIALIZE_LOCK_METHOD = makeSymbol("TEST-CASE-INITIALIZE-LOCK-METHOD");

    static private final SubLSymbol $sym292$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_ENABLEDP_METHOD = makeSymbol("TEST-CASE-ENABLEDP-METHOD");

    static private final SubLList $list_alt294 = list(makeSymbol("BOOLEAN"));

    static private final SubLList $list_alt295 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("BOOLEAN"), makeSymbol("ATOM")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("ENABLED"), makeSymbol("BOOLEAN"))), list(RET, makeSymbol("ENABLED")));

    static private final SubLSymbol $sym296$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_SET_ENABLED_METHOD = makeSymbol("TEST-CASE-SET-ENABLED-METHOD");

    static private final SubLList $list_alt298 = list(makeSymbol("NEW-RESULT"));

    static private final SubLList $list_alt299 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-RESULT"), makeSymbol("TEST-RESULT-P")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), makeSymbol("NEW-RESULT"))), list(RET, makeSymbol("RESULT")));

    static private final SubLSymbol $sym300$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_RESULT_P = makeSymbol("TEST-RESULT-P");

    private static final SubLSymbol TEST_CASE_SET_RESULT_METHOD = makeSymbol("TEST-CASE-SET-RESULT-METHOD");

    static private final SubLSymbol $sym303$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_GET_RESULT_METHOD = makeSymbol("TEST-CASE-GET-RESULT-METHOD");

    static private final SubLList $list_alt305 = list(list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("TEST-METHOD"), makeSymbol("METHOD"))), list(RET, makeSymbol("TEST-METHOD")));

    static private final SubLSymbol $sym306$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_SET_TEST_METHOD_METHOD = makeSymbol("TEST-CASE-SET-TEST-METHOD-METHOD");

    static private final SubLSymbol $sym308$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_GET_TEST_METHOD_METHOD = makeSymbol("TEST-CASE-GET-TEST-METHOD-METHOD");



    static private final SubLList $list_alt311 = list(list(RET, NIL));

    private static final SubLSymbol TEST_CASE_SETUP_METHOD = makeSymbol("TEST-CASE-SETUP-METHOD");



    private static final SubLSymbol TEST_CASE_CLEANUP_METHOD = makeSymbol("TEST-CASE-CLEANUP-METHOD");

    static private final SubLList $list_alt315 = list(list(RET, list(makeSymbol("ERROR"), makeString("Method TEST for class TEST-CASE is not implemented."))));

    static private final SubLString $str_alt316$Method_TEST_for_class_TEST_CASE_i = makeString("Method TEST for class TEST-CASE is not implemented.");

    private static final SubLSymbol TEST_CASE_TEST_METHOD = makeSymbol("TEST-CASE-TEST-METHOD");

    private static final SubLSymbol FAIL_UNLESS = makeSymbol("FAIL-UNLESS");

    static private final SubLList $list_alt319 = list(makeSymbol("VALUE"), makeSymbol("EXPLANATION"));

    static private final SubLList $list_alt320 = list(makeString("If VALUE is NIL, register a failure and record EXPLANATION as its explanation."), list(makeSymbol("PUNLESS"), makeSymbol("VALUE"), list(makeSymbol("FAIL"), makeSymbol("SELF"), makeSymbol("EXPLANATION"))), list(RET, NIL));

    private static final SubLSymbol TEST_CASE_FAIL_UNLESS_METHOD = makeSymbol("TEST-CASE-FAIL-UNLESS-METHOD");

    private static final SubLSymbol FAIL_IF = makeSymbol("FAIL-IF");

    static private final SubLList $list_alt323 = list(makeString("If VALUE is non-NIL, register a failure and record EXPLANATION as its explanation."), list(makeSymbol("PWHEN"), makeSymbol("VALUE"), list(makeSymbol("FAIL"), makeSymbol("SELF"), makeSymbol("EXPLANATION"))), list(RET, NIL));

    private static final SubLSymbol TEST_CASE_FAIL_IF_METHOD = makeSymbol("TEST-CASE-FAIL-IF-METHOD");

    private static final SubLSymbol FAIL_IF_EQUAL = makeSymbol("FAIL-IF-EQUAL");

    static private final SubLList $list_alt326 = list(makeSymbol("ITEM1"), makeSymbol("ITEM2"), makeSymbol("EXPLANATION"), makeSymbol("&OPTIONAL"), list(makeSymbol("TEST"), list(makeSymbol("FUNCTION"), EQL)));

    static private final SubLList $list_alt327 = list(makeString("If ITEM1 and ITEM2 are equal, register a failure and record EXPLANATION \n   as its explanation. If TEST is not provided, #\'EQL is used to test the \n   equality of ITEM1 and ITEM2."), list(makeSymbol("CLET"), list(list(makeSymbol("RETURNED"), list(makeSymbol("FUNCALL"), makeSymbol("TEST"), makeSymbol("ITEM1"), makeSymbol("ITEM2")))), list(makeSymbol("PWHEN"), makeSymbol("RETURNED"), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTED-EXPLANATION"), list(makeSymbol("CCONCATENATE"), makeSymbol("EXPLANATION"), list(makeSymbol("FORMAT"), NIL, makeString(" -- Specifically, ~A and ~A should not be ~A but are."), makeSymbol("ITEM1"), makeSymbol("ITEM2"), makeSymbol("TEST"))))), list(makeSymbol("FAIL"), makeSymbol("SELF"), makeSymbol("AUGMENTED-EXPLANATION")))), list(RET, NIL)));

    static private final SubLString $str_alt328$____Specifically___A_and__A_shoul = makeString(" -- Specifically, ~A and ~A should not be ~A but are.");

    private static final SubLSymbol TEST_CASE_FAIL_IF_EQUAL_METHOD = makeSymbol("TEST-CASE-FAIL-IF-EQUAL-METHOD");

    private static final SubLSymbol FAIL_UNLESS_EQUAL = makeSymbol("FAIL-UNLESS-EQUAL");

    static private final SubLList $list_alt331 = list(makeString("If ITEM1 and ITEM2 are not equal, register a failure and record EXPLANATION \n   as its explanation. If TEST is not provided, #\'EQL is used to test the \n   equality of ITEM1 and ITEM2."), list(makeSymbol("CLET"), list(list(makeSymbol("RETURNED"), list(makeSymbol("FUNCALL"), makeSymbol("TEST"), makeSymbol("ITEM1"), makeSymbol("ITEM2")))), list(makeSymbol("PUNLESS"), makeSymbol("RETURNED"), list(makeSymbol("CLET"), list(list(makeSymbol("AUGMENTED-EXPLANATION"), list(makeSymbol("CCONCATENATE"), makeSymbol("EXPLANATION"), list(makeSymbol("FORMAT"), NIL, makeString(" -- Specifically, ~A and ~A should be ~A but aren't."), makeSymbol("ITEM1"), makeSymbol("ITEM2"), makeSymbol("TEST"))))), list(makeSymbol("FAIL"), makeSymbol("SELF"), makeSymbol("AUGMENTED-EXPLANATION")))), list(RET, NIL)));

    static private final SubLString $str_alt332$____Specifically___A_and__A_shoul = makeString(" -- Specifically, ~A and ~A should be ~A but aren't.");

    private static final SubLSymbol TEST_CASE_FAIL_UNLESS_EQUAL_METHOD = makeSymbol("TEST-CASE-FAIL-UNLESS-EQUAL-METHOD");

    private static final SubLSymbol FAIL_IF_ERROR = makeSymbol("FAIL-IF-ERROR");

    static private final SubLList $list_alt335 = list(makeSymbol("EXPRESSION"), makeSymbol("EXPLANATION"));

    static private final SubLList $list_alt336 = list(makeString("If calling EVAL on EXPRESSION triggers an error, signal a test failure \n   and record EXPLANATION as its explanation."), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE"), NIL)), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("MESSAGE")), list(makeSymbol("EVAL"), makeSymbol("EXPRESSION"))), list(makeSymbol("PWHEN"), makeSymbol("MESSAGE"), list(makeSymbol("FAIL"), makeSymbol("SELF"), makeSymbol("EXPLANATION")))), list(RET, NIL));



    private static final SubLSymbol TEST_CASE_FAIL_IF_ERROR_METHOD = makeSymbol("TEST-CASE-FAIL-IF-ERROR-METHOD");

    private static final SubLSymbol FAIL_UNLESS_ERROR = makeSymbol("FAIL-UNLESS-ERROR");

    static private final SubLList $list_alt340 = list(makeString("If calling EVAL on EXPRESSION does not trigger an error, signal a test failure \n   and record EXPLANATION as its explanation."), list(makeSymbol("CLET"), list(list(makeSymbol("MESSAGE"), NIL)), list(makeSymbol("CATCH-ERROR-MESSAGE"), list(makeSymbol("MESSAGE")), list(makeSymbol("EVAL"), makeSymbol("EXPRESSION"))), list(makeSymbol("PUNLESS"), makeSymbol("MESSAGE"), list(makeSymbol("FAIL"), makeSymbol("SELF"), makeSymbol("EXPLANATION")))), list(RET, NIL));

    private static final SubLSymbol TEST_CASE_FAIL_UNLESS_ERROR_METHOD = makeSymbol("TEST-CASE-FAIL-UNLESS-ERROR-METHOD");



    static private final SubLList $list_alt343 = list(makeSymbol("EXPLANATION"));

    static private final SubLList $list_alt344 = list(makeString("Simply signal a test failure and record EXPLANATION as its explanation."), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-RESULT"), makeSymbol("TEST-RESULT")), makeSymbol("RESULT"), $FAIL), list(makeSymbol("INLINE-METHOD"), list(makeSymbol("SET-EXPLANATION"), makeSymbol("TEST-RESULT")), makeSymbol("RESULT"), makeSymbol("EXPLANATION")), list(makeSymbol("PWHEN"), makeSymbol("*SUNIT-BREAK-ON-FAILURE*"), list(makeSymbol("BREAK"), list(makeSymbol("CCONCATENATE"), makeString("SUnit Failure: "), makeSymbol("EXPLANATION")))), list(makeSymbol("THROW"), list(QUOTE, makeSymbol("SUNIT-FAILURE")), NIL), list(RET, NIL));

    static private final SubLSymbol $sym345$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");



    static private final SubLString $str_alt347$SUnit_Failure__ = makeString("SUnit Failure: ");

    private static final SubLSymbol SUNIT_FAILURE = makeSymbol("SUNIT-FAILURE");

    private static final SubLSymbol TEST_CASE_FAIL_METHOD = makeSymbol("TEST-CASE-FAIL-METHOD");

    static private final SubLList $list_alt350 = list(list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("RESULT"), list(QUOTE, makeSymbol("ISOLATE"))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("RESULT"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TEST-METHOD"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ENABLED"), NIL)), list(makeSymbol("ISOLATE"), makeSymbol("SUPER")), list(RET, NIL));

    static private final SubLSymbol $sym351$OUTER_CATCH_FOR_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-CASE-METHOD");

    private static final SubLSymbol TEST_CASE_ISOLATE_METHOD = makeSymbol("TEST-CASE-ISOLATE-METHOD");

    public static final SubLSymbol $test_suite_dictionary$ = makeSymbol("*TEST-SUITE-DICTIONARY*");

    static private final SubLString $$$Test_Suite_Dictionary_Lock = makeString("Test Suite Dictionary Lock");



    static private final SubLString $str_alt356$_A_is_not_the_name_of_a_known_tes = makeString("~A is not the name of a known test-suite");

    private static final SubLSymbol TEST_SUITE = makeSymbol("TEST-SUITE");

    static private final SubLList $list_alt358 = list(new SubLObject[]{ list(makeSymbol("NAME"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("CATEGORIES"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("MODULES"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("TEST-CASES"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("ENABLED"), makeKeyword("INSTANCE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), list(makeSymbol("NEW-NAME"), makeSymbol("NEW-CATEGORIES"), makeSymbol("NEW-MODULES"), makeSymbol("NEW-TEST-CASES")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NAME"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-NAME"), list(makeSymbol("NEW-NAME")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-CATEGORY"), list(makeSymbol("NEW-CATEGORY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-CATEGORY"), list(makeSymbol("OLD-CATEGORY")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CATEGORIES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-MODULE"), list(makeSymbol("NEW-MODULE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-MODULE"), list(makeSymbol("OLD-MODULE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODULES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADD-TEST-CASE"), list(makeSymbol("NEW-TEST-CASE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DELETE-TEST-CASE"), list(makeSymbol("OLD-TEST-CASE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TEST-CASES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ENABLEDP"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-ENABLED"), list(makeSymbol("BOOLEAN")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ALL-TEST-CASES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ISOLATE"), NIL, makeKeyword("PUBLIC")) });

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_SUITE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-SUITE-CLASS");



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_SUITE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-SUITE-INSTANCE");

    static private final SubLList $list_alt362 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeString("")), list(makeSymbol("CSETQ"), makeSymbol("CATEGORIES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("MODULES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("TEST-CASES"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ENABLED"), T), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym363$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_INITIALIZE_METHOD = makeSymbol("TEST-SUITE-INITIALIZE-METHOD");

    static private final SubLList $list_alt365 = list(makeSymbol("NEW-NAME"), makeSymbol("&OPTIONAL"), makeSymbol("NEW-CATEGORIES"), makeSymbol("NEW-MODULE-STRUCTS"), makeSymbol("NEW-TEST-CASES"));

    static private final SubLList $list_alt366 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-INSTANCE"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("STORE-TEST-SUITE-BY-NAME"), makeSymbol("NEW-NAME"), makeSymbol("NEW-INSTANCE")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-INSTANCE"), list(QUOTE, makeSymbol("SET-NAME")), makeSymbol("NEW-NAME")), list(makeSymbol("CDOLIST"), list(makeSymbol("CAT"), makeSymbol("NEW-CATEGORIES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-INSTANCE"), list(QUOTE, makeSymbol("ADD-CATEGORY")), makeSymbol("CAT"))), list(makeSymbol("CDOLIST"), list(makeSymbol("MOD"), makeSymbol("NEW-MODULE-STRUCTS")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-INSTANCE"), list(QUOTE, makeSymbol("ADD-MODULE")), makeSymbol("MOD"))), list(makeSymbol("CDOLIST"), list(makeSymbol("TC"), makeSymbol("NEW-TEST-CASES")), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-INSTANCE"), list(QUOTE, makeSymbol("ADD-TEST-CASE")), makeSymbol("TC"))), list(RET, makeSymbol("NEW-INSTANCE"))));

    private static final SubLSymbol ADD_MODULE = makeSymbol("ADD-MODULE");

    private static final SubLSymbol TEST_SUITE_NEW_METHOD = makeSymbol("TEST-SUITE-NEW-METHOD");

    static private final SubLSymbol $sym369$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_GET_NAME_METHOD = makeSymbol("TEST-SUITE-GET-NAME-METHOD");

    static private final SubLList $list_alt371 = list(makeSymbol("NEW-NAME"));

    static private final SubLList $list_alt372 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-NAME"), makeSymbol("STRINGP")), list(makeSymbol("PWHEN"), list(makeSymbol("STRINGP"), makeSymbol("NAME")), list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(EQUAL, makeString(""), makeSymbol("NAME")), list(EQUAL, makeSymbol("NAME"), makeSymbol("NEW-NAME"))), list(makeSymbol("REMOVE-TEST-SUITE-BY-NAME"), makeSymbol("NAME")))), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("NAME"), makeSymbol("NEW-NAME"))), list(makeSymbol("STORE-TEST-SUITE-BY-NAME"), makeSymbol("NAME"), makeSymbol("SELF")), list(RET, makeSymbol("NAME")));

    static private final SubLSymbol $sym373$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_SET_NAME_METHOD = makeSymbol("TEST-SUITE-SET-NAME-METHOD");

    static private final SubLList $list_alt375 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CATEGORY"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("NEW-CATEGORY")))), list(makeSymbol("MUST"), makeSymbol("CATEGORY"), makeString("~A isn't the name of a known test category."), makeSymbol("NEW-CATEGORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("CATEGORIES"), list(makeSymbol("UNION"), list(makeSymbol("LIST"), makeSymbol("NEW-CATEGORY")), list(makeSymbol("GET-CATEGORIES"), makeSymbol("SELF")), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CATEGORY"), list(QUOTE, makeSymbol("ADD-SUITE")), list(makeSymbol("GET-NAME"), makeSymbol("SELF")))), list(RET, list(makeSymbol("GET-CATEGORIES"), makeSymbol("SELF"))));

    static private final SubLSymbol $sym376$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    static private final SubLString $str_alt377$_A_isn_t_the_name_of_a_known_test = makeString("~A isn't the name of a known test category.");

    private static final SubLSymbol TEST_SUITE_ADD_CATEGORY_METHOD = makeSymbol("TEST-SUITE-ADD-CATEGORY-METHOD");

    static private final SubLList $list_alt379 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CATEGORY"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("OLD-CATEGORY")))), list(makeSymbol("MUST"), makeSymbol("CATEGORY"), makeString("~A isn't the name of a known test category."), makeSymbol("OLD-CATEGORY")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("CATEGORIES"), list(makeSymbol("REMOVE"), makeSymbol("OLD-CATEGORY"), list(makeSymbol("GET-CATEGORIES"), makeSymbol("SELF")), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CATEGORY"), list(QUOTE, makeSymbol("DELETE-SUITE")), list(makeSymbol("GET-NAME"), makeSymbol("SELF")))), list(RET, NIL));

    static private final SubLSymbol $sym380$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_DELETE_CATEGORY_METHOD = makeSymbol("TEST-SUITE-DELETE-CATEGORY-METHOD");

    static private final SubLSymbol $sym382$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_GET_CATEGORIES_METHOD = makeSymbol("TEST-SUITE-GET-CATEGORIES-METHOD");

    static private final SubLList $list_alt384 = list(makeSymbol("NEW-MODULE-STRUCT"));

    static private final SubLList $list_alt385 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-MODULE-STRUCT"), makeSymbol("MODULE-P")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("MODULES"), list(makeSymbol("UNION"), list(makeSymbol("LIST"), makeSymbol("NEW-MODULE-STRUCT")), list(makeSymbol("GET-MODULES"), makeSymbol("SELF")), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("MODULE-ADD-TEST-SUITE"), makeSymbol("NEW-MODULE-STRUCT"), list(makeSymbol("GET-NAME"), makeSymbol("SELF"))), list(RET, list(makeSymbol("GET-MODULES"), makeSymbol("SELF"))));

    static private final SubLSymbol $sym386$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_ADD_MODULE_METHOD = makeSymbol("TEST-SUITE-ADD-MODULE-METHOD");

    private static final SubLSymbol DELETE_MODULE = makeSymbol("DELETE-MODULE");

    static private final SubLList $list_alt389 = list(makeSymbol("OLD-MODULE-STRUCT"));

    static private final SubLList $list_alt390 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("OLD-MODULE-STRUCT"), makeSymbol("MODULE-P")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("MODULES"), list(makeSymbol("REMOVE"), makeSymbol("OLD-MODULE-STRUCT"), list(makeSymbol("GET-MODULES"), makeSymbol("SELF")), list(makeSymbol("FUNCTION"), EQUAL)))), list(makeSymbol("MODULE-REMOVE-TEST-SUITE"), makeSymbol("OLD-MODULE-STRUCT"), list(makeSymbol("GET-NAME"), makeSymbol("SELF"))), list(RET, list(makeSymbol("GET-MODULES"), makeSymbol("SELF"))));

    static private final SubLSymbol $sym391$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_DELETE_MODULE_METHOD = makeSymbol("TEST-SUITE-DELETE-MODULE-METHOD");

    private static final SubLSymbol GET_MODULES = makeSymbol("GET-MODULES");

    static private final SubLList $list_alt394 = list(list(RET, makeSymbol("MODULES")));

    static private final SubLSymbol $sym395$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_GET_MODULES_METHOD = makeSymbol("TEST-SUITE-GET-MODULES-METHOD");

    static private final SubLList $list_alt397 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEST-CASE"), list(makeSymbol("GET-TEST-CASE-BY-SYMBOL"), makeSymbol("NEW-TEST-CASE")))), list(makeSymbol("MUST"), makeSymbol("TEST-CASE"), makeString("~A is not a known Test Case"), makeSymbol("NEW-TEST-CASE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("TEST-CASES"), list(makeSymbol("UNION"), list(makeSymbol("LIST"), makeSymbol("NEW-TEST-CASE")), list(makeSymbol("GET-TEST-CASES"), makeSymbol("SELF"))))), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("TEST-CASE"), list(QUOTE, makeSymbol("ADD-SUITE")), list(makeSymbol("GET-NAME"), makeSymbol("SELF")))), list(RET, list(makeSymbol("GET-TEST-CASES"), makeSymbol("SELF"))));

    static private final SubLSymbol $sym398$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_ADD_TEST_CASE_METHOD = makeSymbol("TEST-SUITE-ADD-TEST-CASE-METHOD");

    static private final SubLList $list_alt400 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEST-CASE"), list(makeSymbol("GET-TEST-CASE-BY-SYMBOL"), makeSymbol("OLD-TEST-CASE")))), list(makeSymbol("MUST"), makeSymbol("TEST-CASE"), makeString("~A is not a known Test Case"), makeSymbol("OLD-TEST-CASE")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("TEST-CASES"), list(makeSymbol("REMOVE"), makeSymbol("OLD-TEST-CASE"), list(makeSymbol("GET-TEST-CASES"), makeSymbol("SELF"))))), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("TEST-CASE"), list(QUOTE, makeSymbol("DELETE-SUITE")), list(makeSymbol("GET-NAME"), makeSymbol("SELF")))), list(RET, NIL));

    static private final SubLSymbol $sym401$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_DELETE_TEST_CASE_METHOD = makeSymbol("TEST-SUITE-DELETE-TEST-CASE-METHOD");

    static private final SubLSymbol $sym403$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_GET_TEST_CASES_METHOD = makeSymbol("TEST-SUITE-GET-TEST-CASES-METHOD");

    static private final SubLSymbol $sym405$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_ENABLEDP_METHOD = makeSymbol("TEST-SUITE-ENABLEDP-METHOD");

    static private final SubLList $list_alt407 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("BOOLEAN"), makeSymbol("ATOM")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("ENABLED"), makeSymbol("BOOLEAN"))), list(RET, makeSymbol("BOOLEAN")));

    static private final SubLSymbol $sym408$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_SET_ENABLED_METHOD = makeSymbol("TEST-SUITE-SET-ENABLED-METHOD");

    static private final SubLList $list_alt410 = list(makeString("Retrieve all test case classes either directly in this test suite or \n   in one of its included modules or categories"), list(makeSymbol("CLET"), list(list(makeSymbol("ALL-TEST-CASES"), list(makeSymbol("GET-TEST-CASES"), makeSymbol("SELF")))), list(makeSymbol("CDOLIST"), list(makeSymbol("MODULE-STRUCT"), makeSymbol("MODULES")), list(makeSymbol("CSETQ"), makeSymbol("ALL-TEST-CASES"), list(makeSymbol("NUNION"), makeSymbol("ALL-TEST-CASES"), list(makeSymbol("MODULE-GET-TEST-CASES"), makeSymbol("MODULE-STRUCT"))))), list(makeSymbol("CDOLIST"), list(makeSymbol("CATEGORY-NAME"), makeSymbol("CATEGORIES")), list(makeSymbol("CLET"), list(list(makeSymbol("CATEGORY"), list(makeSymbol("GET-TEST-CATEGORY-BY-NAME"), makeSymbol("CATEGORY-NAME")))), list(makeSymbol("CSETQ"), makeSymbol("ALL-TEST-CASES"), list(makeSymbol("NUNION"), makeSymbol("ALL-TEST-CASES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("CATEGORY"), list(QUOTE, makeSymbol("GET-ALL-TEST-CASES"))))))), list(RET, makeSymbol("ALL-TEST-CASES"))));

    static private final SubLSymbol $sym411$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_GET_ALL_TEST_CASES_METHOD = makeSymbol("TEST-SUITE-GET-ALL-TEST-CASES-METHOD");

    static private final SubLList $list_alt413 = list(list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CDOLIST"), list(makeSymbol("MODULE"), makeSymbol("MODULES")), list(makeSymbol("DELETE-MODULE"), makeSymbol("SELF"), makeSymbol("MODULE"))), list(makeSymbol("CDOLIST"), list(makeSymbol("CATEGORY"), makeSymbol("CATEGORIES")), list(makeSymbol("DELETE-CATEGORY"), makeSymbol("SELF"), makeSymbol("CATEGORY"))), list(makeSymbol("CDOLIST"), list(makeSymbol("TEST-CASE"), makeSymbol("TEST-CASES")), list(makeSymbol("DELETE-TEST-CASE"), makeSymbol("SELF"), makeSymbol("TEST-CASE"))), list(makeSymbol("CSETQ"), makeSymbol("NAME"), NIL), list(makeSymbol("CSETQ"), makeSymbol("ENABLED"), NIL)), list(makeSymbol("REMOVE-TEST-SUITE-BY-NAME"), list(makeSymbol("GET-NAME"), makeSymbol("SELF"))), list(makeSymbol("ISOLATE"), makeSymbol("SUPER")), list(RET, NIL));

    static private final SubLSymbol $sym414$OUTER_CATCH_FOR_TEST_SUITE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-SUITE-METHOD");

    private static final SubLSymbol TEST_SUITE_ISOLATE_METHOD = makeSymbol("TEST-SUITE-ISOLATE-METHOD");

    private static final SubLSymbol TEST_RUNNER = makeSymbol("TEST-RUNNER");

    static private final SubLList $list_alt417 = list(new SubLObject[]{ list(makeSymbol("STREAM"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-STREAM"), list(makeSymbol("NEW-STREAM")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STREAM"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INITIALIZE"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-CLASS-METHOD"), makeSymbol("NEW"), list(makeSymbol("STREAM")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("HANDLE-PROBLEM-CODE"), NIL, makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN"), list(makeSymbol("TEST-CASE-OR-SUITE")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN-TEST-CASE"), list(makeSymbol("TEST-CASE")), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RUN-TEST-SUITE"), list(makeSymbol("TEST-SUITE")), makeKeyword("PRIVATE")) });



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_RUNNER_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-RUNNER-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_RUNNER_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-RUNNER-INSTANCE");



    static private final SubLList $list_alt422 = list(makeSymbol("NEW-STREAM"));

    static private final SubLList $list_alt423 = list(list(makeSymbol("CHECK-TYPE"), makeSymbol("NEW-STREAM"), makeSymbol("STREAMP")), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("LOCK")), list(makeSymbol("CSETQ"), makeSymbol("STREAM"), makeSymbol("NEW-STREAM"))), list(RET, makeSymbol("STREAM")));

    static private final SubLSymbol $sym424$OUTER_CATCH_FOR_TEST_RUNNER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RUNNER-METHOD");



    private static final SubLSymbol TEST_RUNNER_SET_STREAM_METHOD = makeSymbol("TEST-RUNNER-SET-STREAM-METHOD");

    private static final SubLSymbol GET_STREAM = makeSymbol("GET-STREAM");

    static private final SubLList $list_alt428 = list(list(RET, makeSymbol("STREAM")));

    static private final SubLSymbol $sym429$OUTER_CATCH_FOR_TEST_RUNNER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RUNNER-METHOD");

    private static final SubLSymbol TEST_RUNNER_GET_STREAM_METHOD = makeSymbol("TEST-RUNNER-GET-STREAM-METHOD");

    static private final SubLList $list_alt431 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("STREAM"), T), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym432$OUTER_CATCH_FOR_TEST_RUNNER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RUNNER-METHOD");

    private static final SubLSymbol TEST_RUNNER_INITIALIZE_METHOD = makeSymbol("TEST-RUNNER-INITIALIZE-METHOD");

    static private final SubLList $list_alt434 = list(makeSymbol("&OPTIONAL"), makeSymbol("NEW-STREAM"));

    static private final SubLList $list_alt435 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NEW-INSTANCE"), list(makeSymbol("NEW-CLASS-INSTANCE"), makeSymbol("SELF")))), list(makeSymbol("PWHEN"), makeSymbol("NEW-STREAM"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("NEW-INSTANCE"), list(QUOTE, makeSymbol("SET-STREAM")), makeSymbol("NEW-STREAM"))), list(RET, makeSymbol("NEW-INSTANCE"))));

    private static final SubLSymbol TEST_RUNNER_NEW_METHOD = makeSymbol("TEST-RUNNER-NEW-METHOD");



    static private final SubLList $list_alt438 = list(makeSymbol("TEST-CASE-OR-SUITE"));

    static private final SubLList $list_alt439 = list(makeString("Runs the given test-case instance or test-suite instance and outputs \n   the result to the test-runner\'s stream"), list(makeSymbol("CLET"), list(list(makeSymbol("RETURN-VALUE"), NIL)), list(makeSymbol("PCOND"), list(list(makeSymbol("TEST-CASE-P"), makeSymbol("TEST-CASE-OR-SUITE")), list(makeSymbol("CSETQ"), makeSymbol("RETURN-VALUE"), list(makeSymbol("RUN-TEST-CASE"), makeSymbol("SELF"), makeSymbol("TEST-CASE-OR-SUITE")))), list(list(makeSymbol("TEST-SUITE-P"), makeSymbol("TEST-CASE-OR-SUITE")), list(makeSymbol("CSETQ"), makeSymbol("RETURN-VALUE"), list(makeSymbol("RUN-TEST-SUITE"), makeSymbol("SELF"), makeSymbol("TEST-CASE-OR-SUITE")))), list(T, list(makeSymbol("ERROR"), makeString("~A is not an instance of TEST-CASE or TEST-SUITE"), makeSymbol("TEST-CASE-OR-SUITE")))), list(RET, makeSymbol("RETURN-VALUE"))));

    static private final SubLString $str_alt440$_A_is_not_an_instance_of_TEST_CAS = makeString("~A is not an instance of TEST-CASE or TEST-SUITE");

    private static final SubLSymbol TEST_RUNNER_RUN_METHOD = makeSymbol("TEST-RUNNER-RUN-METHOD");

    private static final SubLSymbol RUN_TEST_CASE = makeSymbol("RUN-TEST-CASE");

    static private final SubLList $list_alt443 = list(makeSymbol("TEST-CASE"));

    static private final SubLList $list_alt444 = list(list(makeSymbol("CLET"), list(list(makeSymbol("RESULT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-CASE"), list(QUOTE, makeSymbol("GET-RESULT")))), list(makeSymbol("STREAM"), list(makeSymbol("GET-STREAM"), makeSymbol("SELF"))), list(makeSymbol("START-TIME"), NIL), list(makeSymbol("END-TIME"), NIL), list(makeSymbol("RETURN-VALUE"))), list(new SubLObject[]{ makeSymbol("CLET"), list(list(makeSymbol("SETUP-ERROR"), NIL), list(makeSymbol("CLEANUP-ERROR"), NIL), list(makeSymbol("RUNTIME-ERROR"), NIL), list(makeSymbol("FAILURE"), NIL)), list(makeSymbol("IGNORE"), makeSymbol("FAILURE")), list(makeSymbol("CATCH-SUNIT-ERROR-MESSAGE"), list(makeSymbol("SETUP-ERROR")), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("RESULT"), makeSymbol("PROBLEM-CODE")), list(makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-CASE"), list(QUOTE, makeSymbol("SETUP"))), list(makeSymbol("IGNORE"), makeSymbol("RESULT")), list(makeSymbol("PWHEN"), makeSymbol("PROBLEM-CODE"), list(makeSymbol("HANDLE-PROBLEM-CODE"), makeSymbol("SELF"), makeSymbol("PROBLEM-CODE"), makeSymbol("TEST-CASE"), list(QUOTE, makeSymbol("SETUP")))))), list(makeSymbol("PIF"), makeSymbol("SETUP-ERROR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("RESULT"), list(QUOTE, makeSymbol("NOTE-ERROR")), makeSymbol("SETUP-ERROR"), makeKeyword("SETUP")), list(makeSymbol("PROGN"), list(makeSymbol("CCATCH"), list(QUOTE, makeSymbol("SUNIT-FAILURE")), makeSymbol("FAILURE"), list(makeSymbol("CATCH-SUNIT-ERROR-MESSAGE"), list(makeSymbol("RUNTIME-ERROR")), list(makeSymbol("CSETQ"), makeSymbol("START-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("RESULT"), makeSymbol("PROBLEM-CODE")), list(makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-CASE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-CASE"), list(QUOTE, makeSymbol("GET-TEST-METHOD")))), list(makeSymbol("IGNORE"), makeSymbol("RESULT")), list(makeSymbol("PWHEN"), makeSymbol("PROBLEM-CODE"), list(makeSymbol("HANDLE-PROBLEM-CODE"), makeSymbol("SELF"), makeSymbol("PROBLEM-CODE"), makeSymbol("TEST-CASE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-CASE"), list(QUOTE, makeSymbol("GET-TEST-METHOD")))))))), list(makeSymbol("CSETQ"), makeSymbol("END-TIME"), list(makeSymbol("GET-UNIVERSAL-TIME"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("RESULT"), list(QUOTE, makeSymbol("SET-TIME")), list(makeSymbol("-"), makeSymbol("END-TIME"), makeSymbol("START-TIME"))), list(makeSymbol("PWHEN"), makeSymbol("RUNTIME-ERROR"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("RESULT"), list(QUOTE, makeSymbol("NOTE-ERROR")), makeSymbol("RUNTIME-ERROR"), makeKeyword("EXECUTION"))))), list(makeSymbol("CATCH-SUNIT-ERROR-MESSAGE"), list(makeSymbol("CLEANUP-ERROR")), list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("RESULT"), makeSymbol("PROBLEM-CODE")), list(makeSymbol("SAFE-FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-CASE"), list(QUOTE, makeSymbol("CLEANUP"))), list(makeSymbol("IGNORE"), makeSymbol("RESULT")), list(makeSymbol("PWHEN"), makeSymbol("PROBLEM-CODE"), list(makeSymbol("HANDLE-PROBLEM-CODE"), makeSymbol("SELF"), makeSymbol("PROBLEM-CODE"), makeSymbol("TEST-CASE"), list(QUOTE, makeSymbol("CLEANUP")))))), list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CLEANUP-ERROR"), list(makeSymbol("CNOT"), makeSymbol("SETUP-ERROR"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("RESULT"), list(QUOTE, makeSymbol("NOTE-ERROR")), makeSymbol("CLEANUP-ERROR"), makeKeyword("CLEANUP"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("RESULT"), list(QUOTE, makeSymbol("FORMAT")), makeSymbol("STREAM")), list(makeSymbol("CSETQ"), makeSymbol("RETURN-VALUE"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("RESULT"), list(QUOTE, makeSymbol("GET-RESULT")))) }), list(RET, makeSymbol("RETURN-VALUE"))));

    static private final SubLSymbol $sym445$OUTER_CATCH_FOR_TEST_RUNNER_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-TEST-RUNNER-METHOD");

    private static final SubLSymbol CATCH_SUNIT_ERROR_MESSAGE_HANDLER = makeSymbol("CATCH-SUNIT-ERROR-MESSAGE-HANDLER");

    private static final SubLSymbol TEST_RUNNER_RUN_TEST_CASE_METHOD = makeSymbol("TEST-RUNNER-RUN-TEST-CASE-METHOD");

    private static final SubLSymbol HANDLE_PROBLEM_CODE = makeSymbol("HANDLE-PROBLEM-CODE");

    static private final SubLList $list_alt449 = list(makeSymbol("PROBLEM-CODE"), makeSymbol("TEST-CASE-SUBCLASS"), makeSymbol("METHOD"));

    static private final SubLList $list_alt450 = list(list(makeSymbol("CLET"), list(list(makeSymbol("DEFINER"), list(makeSymbol("FIF"), list(EQL, makeSymbol("METHOD"), list(QUOTE, makeSymbol("SETUP"))), list(QUOTE, makeSymbol("DEF-SETUP-METHOD")), list(makeSymbol("FIF"), list(EQL, makeSymbol("METHOD"), list(QUOTE, makeSymbol("CLEANUP"))), list(QUOTE, makeSymbol("DEF-CLEANUP-METHOD")), list(QUOTE, makeSymbol("DEF-TEST-METHOD")))))), list(makeSymbol("PCASE"), makeSymbol("PROBLEM-CODE"), list(makeKeyword("UNDEFINED-METHOD"), list(makeSymbol("ERROR"), makeString("~A is not a defined method of ~A.  Make sure you have defined it with ~A and have run REBUILD-MODULE-TESTS."), makeSymbol("METHOD"), makeSymbol("TEST-CASE-SUBCLASS"), makeSymbol("DEFINER"))), list(makeKeyword("UNDECLARED-METHOD"), list(makeSymbol("ERROR"), makeString("~A is not a declared method of ~A.  Make sure you declare it in the body of DEFINE-TEST-CASE and define it with ~A."), makeSymbol("METHOD"), makeSymbol("TEST-CASE-SUBCLASS"), makeSymbol("DEFINER"))), list(list(makeKeyword("INVALID-METHOD-NAME"), makeKeyword("TARGET-NOT-AN-INSTANCE"), makeKeyword("TARGET-NOT-AN-INSTANCE"), makeKeyword("TARGET-METHOD-CONFLICT"), makeKeyword("TARGET-NOT-A-CLASS"), makeKeyword("ACCESS-LEVEL-CONFLICT")), list(makeSymbol("ERROR"), makeString("SAFE-FUNCALL-INSTANCE-METHOD encountered the problem ~A attempting to run method ~A of object ~A"), makeSymbol("PROBLEM-CODE"), makeSymbol("METHOD"), makeSymbol("TEST-CASE-SUBCLASS"))), list(makeSymbol("OTHERWISE"), list(makeSymbol("ERROR"), makeString("Unknown problem code ~A"), makeSymbol("PROBLEM-CODE"))))), list(RET, NIL));

    private static final SubLSymbol DEF_SETUP_METHOD = makeSymbol("DEF-SETUP-METHOD");

    private static final SubLSymbol DEF_CLEANUP_METHOD = makeSymbol("DEF-CLEANUP-METHOD");

    private static final SubLSymbol DEF_TEST_METHOD = makeSymbol("DEF-TEST-METHOD");



    static private final SubLString $str_alt455$_A_is_not_a_defined_method_of__A_ = makeString("~A is not a defined method of ~A.  Make sure you have defined it with ~A and have run REBUILD-MODULE-TESTS.");



    static private final SubLString $str_alt457$_A_is_not_a_declared_method_of__A = makeString("~A is not a declared method of ~A.  Make sure you declare it in the body of DEFINE-TEST-CASE and define it with ~A.");

    private static final SubLSymbol $INVALID_METHOD_NAME = makeKeyword("INVALID-METHOD-NAME");

    private static final SubLSymbol $TARGET_NOT_AN_INSTANCE = makeKeyword("TARGET-NOT-AN-INSTANCE");

    private static final SubLSymbol $TARGET_METHOD_CONFLICT = makeKeyword("TARGET-METHOD-CONFLICT");

    private static final SubLSymbol $TARGET_NOT_A_CLASS = makeKeyword("TARGET-NOT-A-CLASS");

    private static final SubLSymbol $ACCESS_LEVEL_CONFLICT = makeKeyword("ACCESS-LEVEL-CONFLICT");

    static private final SubLString $str_alt463$SAFE_FUNCALL_INSTANCE_METHOD_enco = makeString("SAFE-FUNCALL-INSTANCE-METHOD encountered the problem ~A attempting to run method ~A of object ~A");

    static private final SubLString $str_alt464$Unknown_problem_code__A = makeString("Unknown problem code ~A");

    private static final SubLSymbol TEST_RUNNER_HANDLE_PROBLEM_CODE_METHOD = makeSymbol("TEST-RUNNER-HANDLE-PROBLEM-CODE-METHOD");

    private static final SubLSymbol RUN_TEST_SUITE = makeSymbol("RUN-TEST-SUITE");

    static private final SubLList $list_alt467 = list(makeSymbol("TEST-SUITE"));

    static private final SubLList $list_alt468 = list(list(makeSymbol("CLET"), list(list(makeSymbol("TEST-CASE-CLASSES"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-SUITE"), list(QUOTE, makeSymbol("GET-ALL-TEST-CASES")))), list(makeSymbol("RETURN-VALUE"), makeKeyword("SUCCESS")), list(makeSymbol("LAST-RETURN"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("TEST-CASE-CLASS"), makeSymbol("TEST-CASE-CLASSES")), list(makeSymbol("CDOLIST"), list(makeSymbol("TEST-METHOD"), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("TEST-CASE-CLASS"), list(QUOTE, makeSymbol("GET-TEST-METHODS")))), list(makeSymbol("CLET"), list(list(makeSymbol("TEST-CASE-INSTANCE"), list(makeSymbol("FUNCALL-CLASS-METHOD"), makeSymbol("TEST-CASE-CLASS"), list(QUOTE, makeSymbol("NEW")), makeSymbol("TEST-METHOD")))), list(makeSymbol("CSETQ"), makeSymbol("LAST-RETURN"), list(makeSymbol("RUN-TEST-CASE"), makeSymbol("SELF"), makeSymbol("TEST-CASE-INSTANCE"))), list(makeSymbol("PUNLESS"), list(EQ, makeSymbol("LAST-RETURN"), makeKeyword("SUCCESS")), list(makeSymbol("CSETQ"), makeSymbol("RETURN-VALUE"), makeSymbol("LAST-RETURN"))), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("TEST-CASE-INSTANCE"), list(QUOTE, makeSymbol("ISOLATE")))))), list(RET, makeSymbol("RETURN-VALUE"))));

    private static final SubLSymbol TEST_RUNNER_RUN_TEST_SUITE_METHOD = makeSymbol("TEST-RUNNER-RUN-TEST-SUITE-METHOD");

    private static final SubLSymbol CYCL_TEST_CASE = makeSymbol("CYCL-TEST-CASE");

    static private final SubLList $list_alt471 = list(list(makeSymbol("CONSTANTS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CREATE-TEST-CONSTANT"), list(makeSymbol("NAME")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DO-ASSERTS"), list(makeSymbol("SENTENCES"), makeSymbol("MT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DO-UNASSERTS"), list(makeSymbol("SENTENCES"), makeSymbol("MT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("NEW-TEST-CONSTANT"), list(makeSymbol("NAME"), makeSymbol("COLLECTION"), makeSymbol("MT")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP-TEST-CONSTANTS"), NIL, makeKeyword("PROTECTED")));



    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CYCL_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CYCL-TEST-CASE-INSTANCE");

    private static final SubLSymbol NEW_TEST_CONSTANT = makeSymbol("NEW-TEST-CONSTANT");

    static private final SubLList $list_alt476 = list(makeSymbol("NAME"), makeSymbol("COLLECTION"), makeSymbol("MT"));

    static private final SubLList $list_alt477 = list(makeString("Creates a new test constant with a unique name based on NAME, and asserts \n   that it\'s an instance of COLLECTION in MT.  Constants created this way are\n   saved on the member variable CONSTANTS, so that they will be killed during \n   cleanup."), list(makeSymbol("CHECK-TYPE"), makeSymbol("NAME"), makeSymbol("STRINGP")), list(makeSymbol("CHECK-TYPE"), makeSymbol("COLLECTION"), makeSymbol("COLLECTION-P")), list(makeSymbol("CLET"), list(list(makeSymbol("NEW-CONSTANT"), list(makeSymbol("FUNCALL-INSTANCE-METHOD"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CREATE-TEST-CONSTANT")), makeSymbol("NAME"))), list(makeSymbol("ISA"), list(makeSymbol("FIND-CONSTANT"), makeString("isa")))), list(makeSymbol("PWHEN"), makeSymbol("ISA"), list(makeSymbol("DO-ASSERTS"), makeSymbol("SELF"), list(makeSymbol("BQ-LIST"), list(makeSymbol("BQ-LIST"), makeSymbol("ISA"), makeSymbol("NEW-CONSTANT"), makeSymbol("COLLECTION"))), makeSymbol("MT"))), list(RET, makeSymbol("NEW-CONSTANT"))));



    private static final SubLSymbol CREATE_TEST_CONSTANT = makeSymbol("CREATE-TEST-CONSTANT");

    static private final SubLString $$$isa = makeString("isa");

    private static final SubLSymbol CYCL_TEST_CASE_NEW_TEST_CONSTANT_METHOD = makeSymbol("CYCL-TEST-CASE-NEW-TEST-CONSTANT-METHOD");

    private static final SubLSymbol DO_ASSERTS = makeSymbol("DO-ASSERTS");

    static private final SubLList $list_alt483 = list(makeSymbol("SENTENCES"), makeSymbol("MT"));

    static private final SubLList $list_alt484 = list(makeString("Assert each sentence in SENTENCES in MT."), list(makeSymbol("CDOLIST"), list(makeSymbol("SENTENCE"), makeSymbol("SENTENCES")), list(makeSymbol("CLET"), list(list(makeSymbol("FORM"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("FI-ASSERT-INT")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("SENTENCE")), makeSymbol("MT")))), list(makeSymbol("PWHEN"), makeSymbol("*SUNIT-VERBOSE*"), list(makeSymbol("FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%~S"), makeSymbol("FORM"))), list(makeSymbol("CLET"), list(list(makeSymbol("SUCCESS"), list(makeSymbol("EVAL"), makeSymbol("FORM")))), list(makeSymbol("PUNLESS"), makeSymbol("SUCCESS"), list(makeSymbol("CLET"), list(list(makeSymbol("ERROR-MSG"), list(makeSymbol("FWHEN"), list(makeSymbol("FI-ERROR-SIGNALED?")), list(makeSymbol("FI-GET-ERROR-STRING-INT"))))), list(makeSymbol("ERROR"), makeString("Failed while attempting to assert ~S, with this error: ~%~S"), makeSymbol("FORM"), makeSymbol("ERROR-MSG"))))))), list(RET, NIL));

    private static final SubLSymbol FI_ASSERT_INT = makeSymbol("FI-ASSERT-INT");



    static private final SubLString $str_alt487$___S = makeString("~%~S");

    static private final SubLString $str_alt488$Failed_while_attempting_to_assert = makeString("Failed while attempting to assert ~S, with this error: ~%~S");

    private static final SubLSymbol CYCL_TEST_CASE_DO_ASSERTS_METHOD = makeSymbol("CYCL-TEST-CASE-DO-ASSERTS-METHOD");

    private static final SubLSymbol DO_UNASSERTS = makeSymbol("DO-UNASSERTS");

    static private final SubLList $list_alt491 = list(makeString("Unassert each sentence in SENTENCES from MT."), list(makeSymbol("CDOLIST"), list(makeSymbol("SENTENCE"), makeSymbol("SENTENCES")), list(makeSymbol("CLET"), list(list(makeSymbol("FORM"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("FI-UNASSERT-INT")), list(makeSymbol("BQ-LIST"), list(QUOTE, QUOTE), makeSymbol("SENTENCE")), makeSymbol("MT")))), list(makeSymbol("PWHEN"), makeSymbol("*SUNIT-VERBOSE*"), list(makeSymbol("FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%~S"), makeSymbol("FORM"))), list(makeSymbol("CLET"), list(list(makeSymbol("SUCCESS"), list(makeSymbol("EVAL"), makeSymbol("FORM")))), list(makeSymbol("PUNLESS"), makeSymbol("SUCCESS"), list(makeSymbol("CLET"), list(list(makeSymbol("ERROR-MSG"), list(makeSymbol("FWHEN"), list(makeSymbol("FI-ERROR-SIGNALED?")), list(makeSymbol("FI-GET-ERROR-STRING-INT"))))), list(makeSymbol("ERROR"), makeString("Failed while attempting to unassert ~S, with this error:  ~%~S"), makeSymbol("FORM"), makeSymbol("ERROR-MSG"))))))), list(RET, NIL));

    private static final SubLSymbol FI_UNASSERT_INT = makeSymbol("FI-UNASSERT-INT");

    static private final SubLString $str_alt493$Failed_while_attempting_to_unasse = makeString("Failed while attempting to unassert ~S, with this error:  ~%~S");

    private static final SubLSymbol CYCL_TEST_CASE_DO_UNASSERTS_METHOD = makeSymbol("CYCL-TEST-CASE-DO-UNASSERTS-METHOD");

    static private final SubLList $list_alt495 = list(makeString("Kills all the temporary testing constants that were introduced by the method \n   NEW-TEST-CONSTANT.  Call this method, e.g., (cleanup super), in any cleanup \n   method of a subclass of CYCL-TEST-CASE."), list(makeSymbol("CLEANUP-TEST-CONSTANTS"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("CONSTANTS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym496$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-TEST-CASE-METHOD");

    private static final SubLSymbol CYCL_TEST_CASE_CLEANUP_METHOD = makeSymbol("CYCL-TEST-CASE-CLEANUP-METHOD");

    static private final SubLList $list_alt498 = list(list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("CONSTANTS"), NIL), list(RET, makeSymbol("SELF")));

    static private final SubLSymbol $sym499$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-TEST-CASE-METHOD");

    private static final SubLSymbol CYCL_TEST_CASE_INITIALIZE_METHOD = makeSymbol("CYCL-TEST-CASE-INITIALIZE-METHOD");

    static private final SubLList $list_alt501 = list(makeSymbol("NAME"));

    static private final SubLList $list_alt502 = list(list(makeSymbol("CLET"), list(list(makeSymbol("UNIQUE-NAME"), NIL), list(makeSymbol("FORM"), NIL), list(makeSymbol("CONSTANT"), NIL), list(makeSymbol("UNIQUE"), NIL)), list(makeSymbol("CSETQ"), makeSymbol("UNIQUE-NAME"), list(makeSymbol("UNIQUIFY-CONSTANT-NAME"), makeSymbol("NAME"))), list(makeSymbol("CSETQ"), makeSymbol("FORM"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("FI-FIND-OR-CREATE-INT")), makeSymbol("UNIQUE-NAME"))), list(makeSymbol("PWHEN"), makeSymbol("*SUNIT-VERBOSE*"), list(makeSymbol("FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%~S"), makeSymbol("FORM"))), list(makeSymbol("PWHEN"), list(makeSymbol("CNOT"), list(makeSymbol("FI-FIND-INT"), makeSymbol("UNIQUE-NAME"))), list(makeSymbol("CSETQ"), makeSymbol("UNIQUE"), T), list(makeSymbol("CSETQ"), makeSymbol("CONSTANT"), list(makeSymbol("EVAL"), makeSymbol("FORM")))), list(makeSymbol("PIF"), list(makeSymbol("CNOT"), makeSymbol("UNIQUE")), list(makeSymbol("FAIL"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("Failure to create a test constant named ~A"), makeSymbol("NAME"))), list(makeSymbol("PWHEN"), makeSymbol("CONSTANT"), list(makeSymbol("CPUSHNEW"), makeSymbol("CONSTANT"), makeSymbol("CONSTANTS")), list(RET, makeSymbol("CONSTANT")))), list(RET, NIL)));

    static private final SubLSymbol $sym503$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-TEST-CASE-METHOD");

    private static final SubLSymbol FI_FIND_OR_CREATE_INT = makeSymbol("FI-FIND-OR-CREATE-INT");

    static private final SubLString $str_alt505$Failure_to_create_a_test_constant = makeString("Failure to create a test constant named ~A");

    private static final SubLSymbol CYCL_TEST_CASE_CREATE_TEST_CONSTANT_METHOD = makeSymbol("CYCL-TEST-CASE-CREATE-TEST-CONSTANT-METHOD");

    private static final SubLSymbol KILL_CONSTANTS = makeSymbol("KILL-CONSTANTS");

    static private final SubLList $list_alt508 = list(makeSymbol("CONSTANT-LIST"));

    static private final SubLList $list_alt509 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("CONSTANT"), makeSymbol("CONSTANT-LIST")), list(makeSymbol("CLET"), list(list(makeSymbol("FORM"), list(makeSymbol("BQ-LIST"), list(QUOTE, makeSymbol("FI-KILL-INT")), makeSymbol("CONSTANT")))), list(makeSymbol("PWHEN"), makeSymbol("*SUNIT-VERBOSE*"), list(makeSymbol("FORMAT"), makeSymbol("*STANDARD-OUTPUT*"), makeString("~%~S"), makeSymbol("FORM"))), list(makeSymbol("CLET"), list(list(makeSymbol("SUCCESS"), list(makeSymbol("EVAL"), makeSymbol("FORM")))), list(makeSymbol("PUNLESS"), makeSymbol("SUCCESS"), list(makeSymbol("FAIL"), makeSymbol("SELF"), list(makeSymbol("FORMAT"), NIL, makeString("Failed during cleanup while trying to kill ~S"), makeSymbol("CONSTANT"))))))), list(RET, NIL));

    private static final SubLSymbol FI_KILL_INT = makeSymbol("FI-KILL-INT");

    static private final SubLString $str_alt511$Failed_during_cleanup_while_tryin = makeString("Failed during cleanup while trying to kill ~S");

    private static final SubLSymbol CYCL_TEST_CASE_KILL_CONSTANTS_METHOD = makeSymbol("CYCL-TEST-CASE-KILL-CONSTANTS-METHOD");

    private static final SubLSymbol CLEANUP_TEST_CONSTANTS = makeSymbol("CLEANUP-TEST-CONSTANTS");

    static private final SubLList $list_alt514 = list(list(makeSymbol("KILL-CONSTANTS"), makeSymbol("SELF"), makeSymbol("CONSTANTS")), list(RET, NIL));

    static private final SubLSymbol $sym515$OUTER_CATCH_FOR_CYCL_TEST_CASE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-CYCL-TEST-CASE-METHOD");

    private static final SubLSymbol CYCL_TEST_CASE_CLEANUP_TEST_CONSTANTS_METHOD = makeSymbol("CYCL-TEST-CASE-CLEANUP-TEST-CONSTANTS-METHOD");

    // // Initializers
    public void declareFunctions() {
        declare_sunit_classes_file();
    }

    public void initializeVariables() {
        init_sunit_classes_file();
    }

    public void runTopLevelForms() {
        setup_sunit_classes_file();
    }
}

