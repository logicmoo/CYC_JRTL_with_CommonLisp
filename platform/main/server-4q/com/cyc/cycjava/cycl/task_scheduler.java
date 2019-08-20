/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.evenp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.creduce;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_block;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_whostate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.decode_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.encode_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.remf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
 *  module:      TASK-SCHEDULER
 *  source file: /cyc/top/cycl/task-scheduler.lisp
 *  created:     2019/07/03 17:37:55
 */
public final class task_scheduler extends SubLTranslatedFile implements V02 {
    // // Constructor
    private task_scheduler() {
    }

    public static final SubLFile me = new task_scheduler();


    // // Definitions
    /**
     * A representative sample of the KB constants that the Cyc Task Scheduler depends on.
     */
    // deflexical
    private static final SubLSymbol $cyc_task_scheduler_core_constants$ = makeSymbol("*CYC-TASK-SCHEDULER-CORE-CONSTANTS*");

    /**
     * Determines whether the portion of the KB used by the Task Scheduler is loaded.
     * Note that even when this part of the KB is not loaded, one can still use
     * the Task Scheduler by declaring tasks in code.
     */
    public static final SubLObject initialize_cyc_task_scheduler_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $cyc_task_scheduler_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_cyc_task_scheduler_kb_loaded();
        } else {
            kb_control_vars.unset_cyc_task_scheduler_kb_loaded();
        }
        return kb_control_vars.cyc_task_scheduler_kb_loaded_p();
    }

    public static final class $task_scheduler_task_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return task_scheduler.$task_scheduler_task_native.structDecl;
        }

        public SubLObject getField2() {
            return $process;
        }

        public SubLObject getField3() {
            return $next_scheduled_time;
        }

        public SubLObject getField4() {
            return $expression;
        }

        public SubLObject getField5() {
            return $result;
        }

        public SubLObject getField6() {
            return $regular_time_interval;
        }

        public SubLObject getField7() {
            return $time_pattern;
        }

        public SubLObject getField8() {
            return $date_pattern;
        }

        public SubLObject setField2(SubLObject value) {
            return $process = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $next_scheduled_time = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $expression = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $result = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $regular_time_interval = value;
        }

        public SubLObject setField7(SubLObject value) {
            return $time_pattern = value;
        }

        public SubLObject setField8(SubLObject value) {
            return $date_pattern = value;
        }

        public SubLObject $process = Lisp.NIL;

        public SubLObject $next_scheduled_time = Lisp.NIL;

        public SubLObject $expression = Lisp.NIL;

        public SubLObject $result = Lisp.NIL;

        public SubLObject $regular_time_interval = Lisp.NIL;

        public SubLObject $time_pattern = Lisp.NIL;

        public SubLObject $date_pattern = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(task_scheduler.$task_scheduler_task_native.class, TASK_SCHEDULER_TASK, TASK_SCHEDULER_TASK_P, $list_alt4, $list_alt5, new String[]{ "$process", "$next_scheduled_time", "$expression", "$result", "$regular_time_interval", "$time_pattern", "$date_pattern" }, $list_alt6, $list_alt7, PRINT_TASK_SCHEDULER_TASK);
    }

    // defconstant
    public static final SubLSymbol $dtp_task_scheduler_task$ = makeSymbol("*DTP-TASK-SCHEDULER-TASK*");

    public static final SubLObject task_scheduler_task_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_task_scheduler_task(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject task_scheduler_task_p(SubLObject v_object) {
        return v_object.getClass() == task_scheduler.$task_scheduler_task_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $task_scheduler_task_p$UnaryFunction extends UnaryFunction {
        public $task_scheduler_task_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-SCHEDULER-TASK-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return task_scheduler_task_p(arg1);
        }
    }

    public static final SubLObject tst_process(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.getField2();
    }

    public static final SubLObject tst_next_scheduled_time(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.getField3();
    }

    public static final SubLObject tst_expression(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.getField4();
    }

    public static final SubLObject tst_result(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.getField5();
    }

    public static final SubLObject tst_regular_time_interval(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.getField6();
    }

    public static final SubLObject tst_time_pattern(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.getField7();
    }

    public static final SubLObject tst_date_pattern(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.getField8();
    }

    public static final SubLObject _csetf_tst_process(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tst_next_scheduled_time(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tst_expression(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tst_result(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tst_regular_time_interval(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_tst_time_pattern(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_tst_date_pattern(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_TASK_P);
        return v_object.setField8(value);
    }

    public static final SubLObject make_task_scheduler_task(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new task_scheduler.$task_scheduler_task_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($PROCESS)) {
                        _csetf_tst_process(v_new, current_value);
                    } else
                        if (pcase_var.eql($NEXT_SCHEDULED_TIME)) {
                            _csetf_tst_next_scheduled_time(v_new, current_value);
                        } else
                            if (pcase_var.eql($EXPRESSION)) {
                                _csetf_tst_expression(v_new, current_value);
                            } else
                                if (pcase_var.eql($RESULT)) {
                                    _csetf_tst_result(v_new, current_value);
                                } else
                                    if (pcase_var.eql($REGULAR_TIME_INTERVAL)) {
                                        _csetf_tst_regular_time_interval(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($TIME_PATTERN)) {
                                            _csetf_tst_time_pattern(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($DATE_PATTERN)) {
                                                _csetf_tst_date_pattern(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt31$Invalid_slot__S_for_construction_, current_arg);
                                            }






                }
            }
            return v_new;
        }
    }

    public static final SubLObject task_scheduler_task_process(SubLObject task) {
        return tst_process(task);
    }

    public static final SubLObject task_scheduler_task_next_scheduled_time(SubLObject task) {
        return tst_next_scheduled_time(task);
    }

    public static final SubLObject task_scheduler_task_expression(SubLObject task) {
        return tst_expression(task);
    }

    public static final SubLObject task_scheduler_task_result(SubLObject task) {
        return tst_result(task);
    }

    public static final SubLObject task_scheduler_task_regular_time_interval(SubLObject task) {
        return tst_regular_time_interval(task);
    }

    public static final SubLObject task_scheduler_task_time_pattern(SubLObject task) {
        return tst_time_pattern(task);
    }

    public static final SubLObject task_scheduler_task_date_pattern(SubLObject task) {
        return tst_date_pattern(task);
    }

    /**
     * Print function for @xref task-scheduler-task
     */
    public static final SubLObject print_task_scheduler_task(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt32$__TASK_SCHEDULER_TASK__s__s__s__s, new SubLObject[]{ tst_process(v_object), tst_next_scheduled_time(v_object), tst_expression(v_object), tst_result(v_object), tst_regular_time_interval(v_object), tst_time_pattern(v_object), tst_date_pattern(v_object) });
        return NIL;
    }

    /**
     *
     *
     * @param NEXT-SCHEDULED-TIME;
     * 		universal-time-p
     * @param EXPRESSION;
     * 		subl-expression-syntax-p
     * @param REGULAR-TIME-INTERVAL;
     * 		NULL or non-negative-integerp
     * @param TIME-PATTERN;
     * 		task-scheduler-time-pattern-expression-p
     * @param DATE-PATTERN;
     * 		task-scheduler-date-pattern-expression-p
     * @return task-scheduler-task-p
    Creates a new task object for the Task Scheduler.
     * @unknown The PROCESS field of the resulting task object is set later
    (when the process is actually created).
     */
    public static final SubLObject new_task_scheduler_task(SubLObject next_scheduled_time, SubLObject expression, SubLObject regular_time_interval, SubLObject time_pattern, SubLObject date_pattern) {
        {
            SubLObject task = make_task_scheduler_task(UNPROVIDED);
            _csetf_tst_next_scheduled_time(task, next_scheduled_time);
            _csetf_tst_expression(task, expression);
            _csetf_tst_regular_time_interval(task, regular_time_interval);
            _csetf_tst_time_pattern(task, time_pattern);
            _csetf_tst_date_pattern(task, date_pattern);
            return task;
        }
    }

    /**
     *
     *
     * @param TASK;
     * 		task-scheduler-task-p
     * @param PROCESS;
     * 		processp
     * @return task-scheduler-task-p
    Sets the process field of TASK to PROCESS.
     */
    public static final SubLObject set_process_for_task(SubLObject task, SubLObject process) {
        _csetf_tst_process(task, process);
        return task;
    }

    public static final SubLObject set_performance_result_for_task(SubLObject result, SubLObject task_name, SubLObject task) {
        _csetf_tst_result(task, result);
        format(T, $str_alt33$__The_result_of_performing_the_ta, task_name, result);
        inform_user_of_performance_result(task_name, result);
        return task;
    }

    /**
     * Informs the Task Scheduler user of progress on TASK-NAME both by printing progress messages
     * on the standard output and (if the Task Scheduler KB is available) asserting progress
     * assertions in the image KB.
     */
    public static final SubLObject inform_user_of_performance_result(SubLObject task_name, SubLObject result) {
        {
            SubLObject task_constant = constants_high.find_constant(task_name);
            if ((NIL != task_constant) && (NIL != kb_control_vars.cyc_task_scheduler_kb_loaded_p())) {
                replace_progress_assertion(task_constant, $const34$taskSchedulerTaskLastPerformanceR, result);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param TASK;
     * 		task-scheduler-task-p
     * @return NULL or task-scheduler-task-p
    Computes and sets the universal time (if any) that TASK is to be performed next
    depending on the regular-time-interval and time/date patterns specified for TASK.
     */
    public static final SubLObject set_next_scheduled_universal_time_for_task(SubLObject name, SubLObject task) {
        {
            SubLObject regular_time_interval = task_scheduler_task_regular_time_interval(task);
            SubLObject time_pattern = task_scheduler_task_time_pattern(task);
            SubLObject date_pattern = task_scheduler_task_date_pattern(task);
            SubLObject last_scheduled_time = task_scheduler_task_next_scheduled_time(task);
            SubLObject next_scheduled_time = compute_next_scheduled_universal_time_for_task(regular_time_interval, time_pattern, date_pattern, NIL != regular_time_interval ? ((SubLObject) (last_scheduled_time)) : increment_universal_time_depending_on_time_pattern(last_scheduled_time, time_pattern));
            inform_user_of_performance_time(name, last_scheduled_time, next_scheduled_time);
            if (NIL != next_scheduled_time) {
                return set_next_scheduled_time_for_task_int(task, next_scheduled_time);
            }
        }
        return NIL;
    }

    /**
     * Sets the next scheduled time for TASK.
     */
    public static final SubLObject set_next_scheduled_time_for_task_int(SubLObject task, SubLObject next_scheduled_time) {
        _csetf_tst_next_scheduled_time(task, next_scheduled_time);
        return task;
    }

    public static final SubLObject increment_universal_time_depending_on_time_pattern(SubLObject universal_time, SubLObject time_pattern) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject second = decode_time_pattern(time_pattern);
                SubLObject minute = thread.secondMultipleValue();
                SubLObject hour = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != second) {
                    return increment_universal_time(universal_time, UNPROVIDED);
                } else
                    if (NIL != minute) {
                        return increment_universal_time(universal_time, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue());
                    } else
                        if (NIL != hour) {
                            return increment_universal_time(universal_time, numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue());
                        }


            }
            return NIL;
        }
    }

    public static final class $task_scheduler_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return task_scheduler.$task_scheduler_native.structDecl;
        }

        public SubLObject getField2() {
            return $task_table;
        }

        public SubLObject getField3() {
            return $task_table_lock;
        }

        public SubLObject getField4() {
            return $main_process;
        }

        public SubLObject getField5() {
            return $main_process_task_list;
        }

        public SubLObject getField6() {
            return $main_process_task_list_lock;
        }

        public SubLObject setField2(SubLObject value) {
            return $task_table = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $task_table_lock = value;
        }

        public SubLObject setField4(SubLObject value) {
            return $main_process = value;
        }

        public SubLObject setField5(SubLObject value) {
            return $main_process_task_list = value;
        }

        public SubLObject setField6(SubLObject value) {
            return $main_process_task_list_lock = value;
        }

        public SubLObject $task_table = Lisp.NIL;

        public SubLObject $task_table_lock = Lisp.NIL;

        public SubLObject $main_process = Lisp.NIL;

        public SubLObject $main_process_task_list = Lisp.NIL;

        public SubLObject $main_process_task_list_lock = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(task_scheduler.$task_scheduler_native.class, TASK_SCHEDULER, TASK_SCHEDULER_P, $list_alt37, $list_alt38, new String[]{ "$task_table", "$task_table_lock", "$main_process", "$main_process_task_list", "$main_process_task_list_lock" }, $list_alt39, $list_alt40, PRINT_TASK_SCHEDULER);
    }

    // defconstant
    public static final SubLSymbol $dtp_task_scheduler$ = makeSymbol("*DTP-TASK-SCHEDULER*");

    public static final SubLObject task_scheduler_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        print_task_scheduler(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject task_scheduler_p(SubLObject v_object) {
        return v_object.getClass() == task_scheduler.$task_scheduler_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $task_scheduler_p$UnaryFunction extends UnaryFunction {
        public $task_scheduler_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-SCHEDULER-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return task_scheduler_p(arg1);
        }
    }

    public static final SubLObject ts_task_table(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_P);
        return v_object.getField2();
    }

    public static final SubLObject ts_task_table_lock(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_P);
        return v_object.getField3();
    }

    public static final SubLObject ts_main_process(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_P);
        return v_object.getField4();
    }

    public static final SubLObject ts_main_process_task_list(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_P);
        return v_object.getField5();
    }

    public static final SubLObject ts_main_process_task_list_lock(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_P);
        return v_object.getField6();
    }

    public static final SubLObject _csetf_ts_task_table(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ts_task_table_lock(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_P);
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ts_main_process(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_P);
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ts_main_process_task_list(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_P);
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ts_main_process_task_list_lock(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_SCHEDULER_P);
        return v_object.setField6(value);
    }

    public static final SubLObject make_task_scheduler(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new task_scheduler.$task_scheduler_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TASK_TABLE)) {
                        _csetf_ts_task_table(v_new, current_value);
                    } else
                        if (pcase_var.eql($TASK_TABLE_LOCK)) {
                            _csetf_ts_task_table_lock(v_new, current_value);
                        } else
                            if (pcase_var.eql($MAIN_PROCESS)) {
                                _csetf_ts_main_process(v_new, current_value);
                            } else
                                if (pcase_var.eql($MAIN_PROCESS_TASK_LIST)) {
                                    _csetf_ts_main_process_task_list(v_new, current_value);
                                } else
                                    if (pcase_var.eql($MAIN_PROCESS_TASK_LIST_LOCK)) {
                                        _csetf_ts_main_process_task_list_lock(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt31$Invalid_slot__S_for_construction_, current_arg);
                                    }




                }
            }
            return v_new;
        }
    }

    public static final SubLObject task_scheduler_task_table(SubLObject v_task_scheduler) {
        return ts_task_table(v_task_scheduler);
    }

    public static final SubLObject task_scheduler_task_table_lock(SubLObject v_task_scheduler) {
        return ts_task_table_lock(v_task_scheduler);
    }

    public static final SubLObject task_scheduler_main_process(SubLObject v_task_scheduler) {
        return ts_main_process(v_task_scheduler);
    }

    public static final SubLObject task_scheduler_main_process_task_list(SubLObject v_task_scheduler) {
        return ts_main_process_task_list(v_task_scheduler);
    }

    public static final SubLObject task_scheduler_main_process_task_list_lock(SubLObject v_task_scheduler) {
        return ts_main_process_task_list_lock(v_task_scheduler);
    }

    /**
     * Print function for @xref task-scheduler.
     */
    public static final SubLObject print_task_scheduler(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt58$__TASK_SCHEDULER__s__s__s__s__s, new SubLObject[]{ ts_task_table(v_object), ts_task_table_lock(v_object), ts_main_process(v_object), ts_main_process_task_list(v_object), ts_main_process_task_list_lock(v_object) });
        return NIL;
    }

    /**
     *
     *
     * @return task-scheduler-p
    Creates and returns a new task scheduler object.
     */
    public static final SubLObject new_task_scheduler() {
        if (NIL == kb_control_vars.cyc_task_scheduler_kb_loaded_p()) {
            task_scheduler_kb_not_loaded_warning();
            return NIL;
        }
        {
            SubLObject v_task_scheduler = make_task_scheduler(UNPROVIDED);
            _csetf_ts_task_table(v_task_scheduler, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            _csetf_ts_task_table_lock(v_task_scheduler, make_lock($$$Task_Scheduler_Task_Table_Lock));
            _csetf_ts_main_process_task_list_lock(v_task_scheduler, make_lock($str_alt60$Task_Scheduler_Main_Process_Task_));
            return v_task_scheduler;
        }
    }

    public static final SubLObject set_task_scheduler_main_process(SubLObject v_task_scheduler, SubLObject main_process) {
        _csetf_ts_main_process(v_task_scheduler, main_process);
        return v_task_scheduler;
    }

    public static final SubLObject set_task_scheduler_main_process_task_list(SubLObject v_task_scheduler, SubLObject task_list) {
        _csetf_ts_main_process_task_list(v_task_scheduler, task_list);
        return v_task_scheduler;
    }

    public static final SubLObject free_task_scheduler(SubLObject v_task_scheduler) {
        v_task_scheduler = NIL;
        return v_task_scheduler;
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return task-scheduler-task-p
    Returns the task scheduler task object corresponding to NAME from the task table for TASK-SCHEDULER.
     */
    public static final SubLObject get_task_scheduler_task_by_name_from_task_table(SubLObject name, SubLObject v_task_scheduler) {
        {
            SubLObject task = NIL;
            SubLObject lock = task_scheduler_task_table_lock(v_task_scheduler);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                task = dictionary.dictionary_lookup(task_scheduler_task_table(v_task_scheduler), name, UNPROVIDED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return task;
        }
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK;
     * 		task-scheduler-task-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Adds TASK to the task table for TASK-SCHEDULER under NAME.
     */
    public static final SubLObject add_new_task_to_task_scheduler_task_table(SubLObject name, SubLObject task, SubLObject v_task_scheduler) {
        {
            SubLObject lock = task_scheduler_task_table_lock(v_task_scheduler);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary.dictionary_enter(task_scheduler_task_table(v_task_scheduler), name, task);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK;
     * 		task-scheduler-task-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Removes the entry for NAME from the task table for TASK-SCHEDULER.
     */
    public static final SubLObject remove_task_from_task_scheduler_task_table(SubLObject name, SubLObject v_task_scheduler) {
        {
            SubLObject lock = task_scheduler_task_table_lock(v_task_scheduler);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                dictionary.dictionary_remove(task_scheduler_task_table(v_task_scheduler), name);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static final SubLObject do_task_scheduler_task_table(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt61);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject task_name = NIL;
                    SubLObject task_object = NIL;
                    SubLObject v_task_scheduler = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt61);
                    task_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt61);
                    task_object = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt61);
                    v_task_scheduler = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt61);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt61);
                            if (NIL == member(current_1, $list_alt62, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt61);
                        }
                        {
                            SubLObject doneP_tail = property_list_member($DONE_, current);
                            SubLObject doneP = (NIL != doneP_tail) ? ((SubLObject) (cadr(doneP_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject task_table = $sym65$TASK_TABLE;
                                return list(WITH_LOCK_HELD, list(list(TASK_SCHEDULER_TASK_TABLE_LOCK, v_task_scheduler)), list(CLET, list(list(task_table, list(TASK_SCHEDULER_TASK_TABLE, v_task_scheduler))), listS(DO_DICTIONARY, list(task_name, task_object, task_table, doneP), append(body, NIL))));
                            }
                        }
                    }
                }
            }
        }
    }



    public static final SubLObject cyc_task_scheduler() {
        return $cyc_task_scheduler$.getGlobalValue();
    }



    public static final SubLObject clear_cyc_task_scheduler_task_description_predicate_p() {
        {
            SubLObject cs = $cyc_task_scheduler_task_description_predicate_p_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static final SubLObject remove_cyc_task_scheduler_task_description_predicate_p(SubLObject v_object) {
        return memoization_state.caching_state_remove_function_results_with_args($cyc_task_scheduler_task_description_predicate_p_caching_state$.getGlobalValue(), list(v_object), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject cyc_task_scheduler_task_description_predicate_p_internal(SubLObject v_object) {
        return isa.isa_in_any_mtP(v_object, $const73$CycTaskSchedulerTaskDescriptionPr);
    }

    public static final SubLObject cyc_task_scheduler_task_description_predicate_p(SubLObject v_object) {
        {
            SubLObject caching_state = $cyc_task_scheduler_task_description_predicate_p_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(CYC_TASK_SCHEDULER_TASK_DESCRIPTION_PREDICATE_P, $cyc_task_scheduler_task_description_predicate_p_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, $kw75$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw75$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(cyc_task_scheduler_task_description_predicate_p_internal(v_object)));
                    memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    /**
     *
     *
     * @return booleanp : T iff the Cyc Task Scheduler is available in the current image
     */
    public static final SubLObject cyc_task_scheduler_availableP() {
        return task_scheduler_p($cyc_task_scheduler$.getGlobalValue());
    }

    /**
     * Makes the Cyc Task Scheduler available in the current image by creating a task scheduler object
     * and loading all the tasks from the KB which the current Cyclist is specified as a user for.
     */
    public static final SubLObject start_cyc_task_scheduler(SubLObject load_user_tasksP) {
        if (load_user_tasksP == UNPROVIDED) {
            load_user_tasksP = T;
        }
        if (NIL == cyc_task_scheduler_availableP()) {
            $cyc_task_scheduler$.setGlobalValue(new_task_scheduler());
            if ((NIL != task_scheduler_p($cyc_task_scheduler$.getGlobalValue())) && (NIL != load_user_tasksP)) {
                load_task_scheduler_tasks_for_user_from_kb(UNPROVIDED, UNPROVIDED);
            }
            return $cyc_task_scheduler$.getGlobalValue();
        }
        return NIL;
    }

    /**
     * Makes the Cyc Task Scheduler unavailable in the current image by undeclaring all its tasks
     * and setting the scheduler to NIL.
     */
    public static final SubLObject stop_cyc_task_scheduler() {
        if (NIL != cyc_task_scheduler_availableP()) {
            $cyc_task_scheduler$.setGlobalValue(stop_task_scheduler($cyc_task_scheduler$.getGlobalValue()));
            return $cyc_task_scheduler$.getGlobalValue();
        }
        return NIL;
    }

    /**
     *
     *
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Stops TASK-SCHEDULER by undeclaring all its tasks and setting it to NIL.
     */
    public static final SubLObject stop_task_scheduler(SubLObject v_task_scheduler) {
        if (NIL != task_scheduler_p(v_task_scheduler)) {
            undeclare_all_task_scheduler_tasks(v_task_scheduler);
            v_task_scheduler = free_task_scheduler(v_task_scheduler);
            return v_task_scheduler;
        }
        return NIL;
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param PLIST;
     * 		property-list-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @param OVERRIDE-EXISTINS-TASK-BY-NAME?;
     * 		booleanp
     * @return task-scheduler-task-p
    Schedules a new task for TASK-SCHEDULER with name NAME and properties as specified by PLIST.
    If OVERRIDE-EXISTINS-TASK-BY-NAME? is T then any existing TASK-SCHEDULER task by name NAME will be overriden.
     */
    public static final SubLObject declare_task_scheduler_task(SubLObject name, SubLObject plist, SubLObject v_task_scheduler, SubLObject override_existing_task_by_nameP) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (override_existing_task_by_nameP == UNPROVIDED) {
            override_existing_task_by_nameP = T;
        }
        if (NIL == task_scheduler_p(v_task_scheduler)) {
            task_scheduler_not_available_warning();
            return NIL;
        }
        {
            SubLObject expression = getf(plist, $EXPRESSION, UNPROVIDED);
            SubLObject regular_time_interval = getf(plist, $REGULAR_TIME_INTERVAL, UNPROVIDED);
            SubLObject time_pattern = getf(plist, $TIME_PATTERN, UNPROVIDED);
            SubLObject date_pattern = convert_date_pattern(getf(plist, $DATE_PATTERN, UNPROVIDED));
            return schedule_new_task(name, expression, regular_time_interval, time_pattern, date_pattern, v_task_scheduler, override_existing_task_by_nameP);
        }
    }

    /**
     *
     *
     * @param USER;
     * 		constant-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return integerp : the number of tasks successfully loaded on TASK-SCHEDULER
    Unless USER is #$Guest and the portion of KB that required by the task scheduler is available in the current image,
    then loads all the tasks from the KB for which USER is specified as a user, on TASK-SCHEDULER.
     */
    public static final SubLObject load_task_scheduler_tasks_for_user_from_kb(SubLObject user, SubLObject v_task_scheduler) {
        if (user == UNPROVIDED) {
            user = operation_communication.the_cyclist();
        }
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == task_scheduler_p(v_task_scheduler)) {
                task_scheduler_not_available_warning();
                return NIL;
            }
            if (NIL != user_is_guestP(user)) {
                return NIL;
            }
            if (NIL == kb_control_vars.cyc_task_scheduler_kb_loaded_p()) {
                task_scheduler_kb_not_loaded_warning();
                return NIL;
            }
            {
                SubLObject task_constants = NIL;
                SubLObject task = NIL;
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        task_constants = get_tasks_for_user(user);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject cdolist_list_var = task_constants;
                    SubLObject task_constant = NIL;
                    for (task_constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , task_constant = cdolist_list_var.first()) {
                        task = load_task_scheduler_task_from_kb(task_constant, v_task_scheduler, UNPROVIDED);
                        if (NIL != task_scheduler_task_p(task)) {
                            count = add(count, ONE_INTEGER);
                        }
                    }
                }
                return count;
            }
        }
    }

    /**
     *
     *
     * @param TASK-CONSTANT;
     * 		constant-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @param IGNORE-PROPERTY;
     * 		constant-p (an instance of the #$CycTaskSchedulerTaskDescriptionPredicate that should be ignored while loading the task;
     * 		this is a @hack to get the #$afterRemovings work properly)
     * @return task-scheduler-task-p
    If the portion of the KB required by the task scheduler is available in the current image,
    then checks to see if the task corresponding to TASK-CONSTANT is already registered with TASK-SCHEDULER
    and if so, reloads the task.
     */
    public static final SubLObject reload_task_scheduler_task_from_kb_if_loaded(SubLObject task_constant, SubLObject v_task_scheduler, SubLObject ignore_property) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (ignore_property == UNPROVIDED) {
            ignore_property = NIL;
        }
        if (NIL == task_scheduler_p(v_task_scheduler)) {
            task_scheduler_not_available_warning();
            return NIL;
        }
        if (NIL == kb_control_vars.cyc_task_scheduler_kb_loaded_p()) {
            task_scheduler_kb_not_loaded_warning();
            return NIL;
        }
        if (NIL != task_scheduler_task_p(get_task_scheduler_task(task_constant, UNPROVIDED))) {
            return load_task_scheduler_task_from_kb_int(task_constant, v_task_scheduler, T, ignore_property);
        }
        return NIL;
    }

    /**
     *
     *
     * @param TASK-CONSTANT;
     * 		constant-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @param OVERRIDE-EXISTINS-TASK-BY-NAME?;
     * 		booleanp
     * @return task-scheduler-task-p
    If the portion of the KB required by the task scheduler is available in the current image,
    then creates a new task object for TASK-CONSTANT and loads it on TASK-SCHEDULER.
    If OVERRIDE-EXISTINS-TASK-BY-NAME? is T then any existing TASK-SCHEDULER task by name NAME will be overriden.
     */
    public static final SubLObject load_task_scheduler_task_from_kb(SubLObject task_constant, SubLObject v_task_scheduler, SubLObject override_existing_task_by_nameP) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (override_existing_task_by_nameP == UNPROVIDED) {
            override_existing_task_by_nameP = T;
        }
        if (NIL == task_scheduler_p(v_task_scheduler)) {
            task_scheduler_not_available_warning();
            return NIL;
        }
        if (NIL == kb_control_vars.cyc_task_scheduler_kb_loaded_p()) {
            task_scheduler_kb_not_loaded_warning();
            return NIL;
        }
        return load_task_scheduler_task_from_kb_int(task_constant, v_task_scheduler, override_existing_task_by_nameP, UNPROVIDED);
    }

    public static final SubLObject load_task_scheduler_task_from_kb_int(SubLObject task_constant, SubLObject v_task_scheduler, SubLObject override_existing_task_by_nameP, SubLObject ignore_property) {
        if (ignore_property == UNPROVIDED) {
            ignore_property = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject task = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject expression = kb_lookup_task_scheduler_task_expression(task_constant);
                            if (NIL != expression) {
                                {
                                    SubLObject regular_time_interval = (ignore_property == $const78$taskSchedulerTaskRegularTimeInter) ? ((SubLObject) (NIL)) : kb_lookup_task_scheduler_task_regular_time_interval(task_constant);
                                    SubLObject time_pattern = (ignore_property == $$taskSchedulerTaskTimePattern) ? ((SubLObject) (NIL)) : kb_lookup_task_scheduler_task_time_pattern(task_constant);
                                    SubLObject date_pattern = (ignore_property == $$taskSchedulerTaskDatePattern) ? ((SubLObject) (NIL)) : kb_lookup_task_scheduler_task_date_pattern(task_constant);
                                    task = schedule_new_task(task_name_for_task_constant(task_constant), expression, regular_time_interval, time_pattern, date_pattern, v_task_scheduler, override_existing_task_by_nameP);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return task;
            }
        }
    }

    /**
     *
     *
     * @param TASK-CONSTANT;
     * 		constant-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Unloads the task corresponding to TASK-CONSTANT from TASK-SCHEDULER.
     */
    public static final SubLObject unload_task_scheduler_task(SubLObject task_constant, SubLObject v_task_scheduler) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (NIL != task_scheduler_p(v_task_scheduler)) {
            {
                SubLObject task_name = task_name_for_task_constant(task_constant);
                return undeclare_task_scheduler_task_for_name(task_name, v_task_scheduler);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Undeclares the task by name NAME formerly declared for TASK-SCHEDULER.
     */
    public static final SubLObject undeclare_task_scheduler_task_for_name(SubLObject name, SubLObject v_task_scheduler) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (NIL != task_scheduler_p(v_task_scheduler)) {
            {
                SubLObject task = get_task_scheduler_task_by_name(name, v_task_scheduler);
                if (NIL != task_scheduler_task_p(task)) {
                    return undeclare_task_scheduler_task_for_name_int(name, task, v_task_scheduler);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK;
     * 		task-scheduler-task-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     */
    public static final SubLObject undeclare_task_scheduler_task_for_name_int(SubLObject name, SubLObject task, SubLObject v_task_scheduler) {
        remove_task_from_task_scheduler_task_table(name, v_task_scheduler);
        {
            SubLObject process = task_scheduler_task_process(task);
            if (NIL != task_scheduler_main_processP(process, v_task_scheduler)) {
                undeclare_task_for_task_scheduler_main_process(name, v_task_scheduler);
            } else {
                undeclare_task_scheduler_process(process);
            }
        }
        return v_task_scheduler;
    }

    public static final SubLObject task_scheduler_main_process_taskP(SubLObject task, SubLObject v_task_scheduler) {
        {
            SubLObject process = task_scheduler_task_process(task);
            return task_scheduler_main_processP(process, v_task_scheduler);
        }
    }

    /**
     * Undeclares all tasks formerly declared for TASK-SCHEDULER and kills the processes responsible
     * for performing them.
     */
    public static final SubLObject undeclare_all_task_scheduler_tasks(SubLObject v_task_scheduler) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != task_scheduler_p(v_task_scheduler)) {
                {
                    SubLObject lock = task_scheduler_task_table_lock(v_task_scheduler);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        {
                            SubLObject task_table = task_scheduler_task_table(v_task_scheduler);
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(task_table));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject name = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject task = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL == task_scheduler_main_process_taskP(task, v_task_scheduler)) {
                                        undeclare_task_scheduler_task_for_name_int(name, task, v_task_scheduler);
                                    }
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                }
                undeclare_task_scheduler_main_process(v_task_scheduler);
            }
            return v_task_scheduler;
        }
    }

    /**
     *
     *
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Displays the tasks scheduled for task scheduler in the order of their next execution dates/times.
     */
    public static final SubLObject display_task_scheduler_scheduled_tasks(SubLObject v_task_scheduler, SubLObject stream) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (NIL == task_scheduler_p(v_task_scheduler)) {
            task_scheduler_not_available_warning();
            return NIL;
        }
        {
            SubLObject task_table = task_scheduler_task_table(v_task_scheduler);
            SubLObject task_table_list = dictionary_utilities.dictionary_to_alist(task_table);
            SubLObject sorted_task_list = list_utilities.sort_alist_by_values(task_table_list, $sym81$TASK_NEXT_SCHEDULED_TIME_);
            if (NIL != sorted_task_list) {
                format(stream, $str_alt82$You_currently_have__A_tasks_sched, length(sorted_task_list));
            } else {
                format(stream, $str_alt83$You_currently_have_no_tasks_sched);
            }
            {
                SubLObject cdolist_list_var = sorted_task_list;
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject task_name = NIL;
                        SubLObject task_object = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt84);
                        task_name = current.first();
                        current = current.rest();
                        task_object = current;
                        format(stream, $str_alt85$__The_task__A_will_next_be_perfor, task_name, make_progress_string_for_universal_time(task_scheduler_task_next_scheduled_time(task_object)));
                    }
                }
            }
        }
        return NIL;
    }

    public static final SubLObject task_next_scheduled_timeL(SubLObject task1, SubLObject task2) {
        return numL(task_scheduler_task_next_scheduled_time(task1), task_scheduler_task_next_scheduled_time(task2));
    }

    /**
     *
     *
     * @param TASK-CONSTANT;
     * 		constant-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return task-scheduler-task-p
    Returns the task-scheduler-task corresponding to TASK-CONSTANT.
     */
    public static final SubLObject get_task_scheduler_task(SubLObject task_constant, SubLObject v_task_scheduler) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (NIL != task_scheduler_p(v_task_scheduler)) {
            return get_task_scheduler_task_by_name(constants_high.constant_name(task_constant), UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return task-scheduler-task-p
    Returns the task corresponding to NAME from among the tasks declared for TASK-SCHEDULER.
     */
    public static final SubLObject get_task_scheduler_task_by_name(SubLObject name, SubLObject v_task_scheduler) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (NIL != task_scheduler_p(v_task_scheduler)) {
            return get_task_scheduler_task_by_name_from_task_table(name, v_task_scheduler);
        }
        return NIL;
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return universal-time-p
    Returns the next universal time the task corresponding to NAME is scheduled for.
     */
    public static final SubLObject get_next_scheduled_time_for_task_name(SubLObject name, SubLObject v_task_scheduler) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (NIL != task_scheduler_p(v_task_scheduler)) {
            return task_scheduler_task_next_scheduled_time(get_task_scheduler_task_by_name(name, v_task_scheduler));
        }
        return NIL;
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return processp
    Returns the process that is responsible for performing the task corresponding to NAME.
     */
    public static final SubLObject get_process_for_task_name(SubLObject name, SubLObject v_task_scheduler) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (NIL != task_scheduler_p(v_task_scheduler)) {
            return task_scheduler_task_process(get_task_scheduler_task_by_name(name, v_task_scheduler));
        }
        return NIL;
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return processp
    Returns the result of the latest performance of the task corresponding to NAME.
     */
    public static final SubLObject get_result_for_task_name(SubLObject name, SubLObject v_task_scheduler) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (NIL != task_scheduler_p(v_task_scheduler)) {
            return task_scheduler_task_result(get_task_scheduler_task_by_name(name, v_task_scheduler));
        }
        return NIL;
    }

    /**
     * A number from 0 to 5 indicating how much tracing of the Task Scheduler should be done.
     * 0 is least, 5 is most.
     */
    // defparameter
    private static final SubLSymbol $task_scheduler_trace_level$ = makeSymbol("*TASK-SCHEDULER-TRACE-LEVEL*");

    public static final SubLObject task_scheduler_warn(SubLObject level, SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($task_scheduler_trace_level$.getDynamicValue(thread).numGE(level)) {
                format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }
            return NIL;
        }
    }

    public static final SubLObject task_scheduler_not_available_warning() {
        return task_scheduler_warn(ZERO_INTEGER, $str_alt86$The_Task_Scheduler_is_not_availab, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject task_scheduler_kb_not_loaded_warning() {
        return task_scheduler_warn(ZERO_INTEGER, $str_alt87$The_portion_of_the_Cyc_KB_used_by, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Whether USER is #$Guest.
     */
    public static final SubLObject user_is_guestP(SubLObject user) {
        return eq(user, $$Guest);
    }

    /**
     *
     *
     * @param CONSTANT;
     * 		constant-p
     * @return stringp
    Returns the task name for CONSTANT.
     */
    public static final SubLObject task_name_for_task_constant(SubLObject constant) {
        return constants_high.constant_name(constant);
    }

    /**
     *
     *
     * @param TASK-NAME;
     * 		stringp
     * @return constant-p or NIL
    Returns the Cyc constant (if any) corresponding to TASK-NAME.
     */
    public static final SubLObject task_constant_for_task_name(SubLObject task_name) {
        return constants_high.find_constant(task_name);
    }

    /**
     *
     *
     * @param USER;
     * 		constant-p
     * 		Returns all instances of #$CycTaskSchedulerTask which have USER specified
     * 		as a user through the predicate #$taskSchedulerTaskUser.
     */
    public static final SubLObject get_tasks_for_user(SubLObject user) {
        if (user == UNPROVIDED) {
            user = operation_communication.the_cyclist();
        }
        return kb_mapping_utilities.pred_values(user, $$taskSchedulerTaskUser, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static final SubLObject kb_lookup_task_scheduler_task_property(SubLObject task, SubLObject pred) {
        return kb_mapping_utilities.fpred_value_in_any_mt(task, pred, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kb_lookup_task_scheduler_task_property_in_miscellaneous_index(SubLObject task, SubLObject pred) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject all_misc_assertions = kb_mapping.gather_other_index(task);
                            if (NIL == result) {
                                {
                                    SubLObject csome_list_var = all_misc_assertions;
                                    SubLObject misc_assertion = NIL;
                                    for (misc_assertion = csome_list_var.first(); !((NIL != result) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , misc_assertion = csome_list_var.first()) {
                                        {
                                            SubLObject formula = fi.assertion_hl_formula(misc_assertion, UNPROVIDED);
                                            if (cycl_utilities.formula_operator(formula) == pred) {
                                                result = cycl_utilities.formula_arg2(misc_assertion, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static final SubLObject kb_lookup_task_scheduler_task_expression(SubLObject task) {
        {
            SubLObject expression = kb_lookup_task_scheduler_task_property(task, $$taskSchedulerTaskExpression);
            if (NIL != term.nautP(expression, UNPROVIDED)) {
                {
                    SubLObject pcase_var = cycl_utilities.nat_functor(expression);
                    if (pcase_var.eql($$ExpandSubLFn)) {
                        return cycl_utilities.nat_arg2(expression, UNPROVIDED);
                    } else
                        if (pcase_var.eql($$SubLQuoteFn)) {
                            return cycl_utilities.nat_arg1(expression, UNPROVIDED);
                        }

                }
            }
        }
        return NIL;
    }

    public static final SubLObject kb_lookup_task_scheduler_task_regular_time_interval(SubLObject task) {
        return kb_lookup_task_scheduler_task_property(task, $const78$taskSchedulerTaskRegularTimeInter);
    }

    public static final SubLObject kb_lookup_task_scheduler_task_time_pattern(SubLObject task) {
        return kb_lookup_task_scheduler_task_property(task, $$taskSchedulerTaskTimePattern);
    }

    public static final SubLObject kb_lookup_task_scheduler_task_date_pattern(SubLObject task) {
        {
            SubLObject date_pattern = kb_lookup_task_scheduler_task_property(task, $$taskSchedulerTaskDatePattern);
            if (NIL != el_utilities.el_list_p(date_pattern)) {
                date_pattern = el_utilities.make_el_list(convert_date_pattern(evaluation_defns.el_list_to_subl_list(date_pattern)), UNPROVIDED);
            }
            return date_pattern;
        }
    }

    public static final SubLObject convert_date_pattern(SubLObject date_pattern) {
        {
            SubLObject temp_date_pattern = copy_list(date_pattern);
            temp_date_pattern = replace_month_pattern(temp_date_pattern);
            if (NIL != kb_control_vars.cyc_task_scheduler_kb_loaded_p()) {
                temp_date_pattern = replace_day_of_week_pattern(temp_date_pattern);
            }
            return temp_date_pattern;
        }
    }

    public static final SubLObject replace_month_pattern(SubLObject date_pattern) {
        {
            SubLObject month_pattern = getf(date_pattern, $MONTH, UNPROVIDED);
            SubLObject new_month_pattern = convert_month_pattern(month_pattern);
            if (NIL != new_month_pattern) {
                return putf(remf(date_pattern, $MONTH), $MONTH, new_month_pattern);
            } else {
                return date_pattern;
            }
        }
    }

    /**
     * Replaces any month constants mentioned in MONTH-PATTERN with the corresponding
     * month numbers.
     */
    public static final SubLObject convert_month_pattern(SubLObject month_pattern) {
        if (month_pattern.isNumber()) {
            return month_pattern;
        } else
            if (NIL != constant_handles.constant_p(month_pattern)) {
                return date_utilities.number_of_month(month_pattern);
            } else
                if (NIL != time_or_date_component_interval_p(month_pattern)) {
                    return make_time_or_date_component_interval(convert_month_pattern(first_in_time_or_date_component_interval(month_pattern)), convert_month_pattern(last_in_time_or_date_component_interval(month_pattern)));
                } else
                    if (NIL != time_or_date_component_list_p(month_pattern)) {
                        return make_time_or_date_component_list(Mapping.mapcar(CONVERT_MONTH_PATTERN, time_or_date_component_list_items(month_pattern)));
                    }



        return NIL;
    }

    /**
     * The table that associates days of the week with the numeral returned by
     *
     * @unknown DECODE-UNIVERSAL-TIME for each day of the week.
     */
    // deflexical
    private static final SubLSymbol $day_of_week_constant_table$ = makeSymbol("*DAY-OF-WEEK-CONSTANT-TABLE*");

    public static final SubLObject get_day_of_week_for_numeral(SubLObject numeral) {
        return nth(numeral, $day_of_week_constant_table$.getGlobalValue());
    }

    public static final SubLObject get_numeral_for_day_of_week(SubLObject day_of_week) {
        return position(day_of_week, $day_of_week_constant_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject day_of_week_numeral(SubLObject day) {
        return day.isNumber() ? ((SubLObject) (day)) : get_numeral_for_day_of_week(day);
    }

    public static final SubLObject replace_day_of_week_pattern(SubLObject date_pattern) {
        {
            SubLObject day_of_week_pattern = getf(date_pattern, $DAY_OF_WEEK, UNPROVIDED);
            SubLObject new_day_of_week_pattern = convert_day_of_week_pattern(day_of_week_pattern);
            if (NIL != new_day_of_week_pattern) {
                return putf(remf(date_pattern, $DAY_OF_WEEK), $DAY_OF_WEEK, new_day_of_week_pattern);
            } else {
                return date_pattern;
            }
        }
    }

    /**
     * Replaces any day of the week constants mentioned in DAY-OF-WEEK-PATTERN with the corresponding
     * day of the week numbers.
     */
    public static final SubLObject convert_day_of_week_pattern(SubLObject day_of_week_pattern) {
        if (NIL != member(day_of_week_pattern, $list_alt97, UNPROVIDED, UNPROVIDED)) {
            return day_of_week_pattern;
        } else
            if (day_of_week_pattern.isAtom()) {
                return day_of_week_numeral(day_of_week_pattern);
            } else
                if (NIL != day_of_week_interval_p(day_of_week_pattern)) {
                    return make_day_of_week_interval(convert_day_of_week_pattern(first_day_in_interval(day_of_week_pattern)), convert_day_of_week_pattern(last_day_in_interval(day_of_week_pattern)));
                } else
                    if (NIL != day_of_week_list_p(day_of_week_pattern)) {
                        return make_day_of_week_list(Mapping.mapcar(CONVERT_DAY_OF_WEEK_PATTERN, day_of_week_list_items(day_of_week_pattern)));
                    }



        return NIL;
    }

    /**
     * The unit of time functions that are used to specify regular time interval units of time for Task Scheduler tasks.
     */
    // deflexical
    private static final SubLSymbol $task_regular_time_interval_units_of_time$ = makeSymbol("*TASK-REGULAR-TIME-INTERVAL-UNITS-OF-TIME*");

    /**
     * #$defnIff for #$TaskSchedulerRegularTimeIntervalExpression.
     * Returns T iff OBJECT is a well-formed regular time interval expression.
     */
    public static final SubLObject task_scheduler_regular_time_interval_expression_p(SubLObject v_object) {
        return well_formed_regular_time_interval_expressionP(v_object);
    }

    /**
     *
     *
     * @param REGULAR-TIME-INTERVAL;
     * 		el-formula-p
     * @return booleanp : T iff DATE-PATTERN is a well-formed date pattern
     */
    public static final SubLObject well_formed_regular_time_interval_expressionP(SubLObject regular_time_interval) {
        if (NIL != el_utilities.el_unary_formula_p(regular_time_interval)) {
            {
                SubLObject unit_of_time = cycl_utilities.formula_operator(regular_time_interval);
                SubLObject interval_length = cycl_utilities.formula_arg1(regular_time_interval, UNPROVIDED);
                return makeBoolean((NIL != subl_promotions.memberP(unit_of_time, $task_regular_time_interval_units_of_time$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) && (NIL != number_utilities.positive_number_p(interval_length)));
            }
        }
        return NIL;
    }

    /**
     * The list of keywords that are used to specify date patterns for Task Scheduler tasks.
     */
    // deflexical
    private static final SubLSymbol $task_scheduler_date_pattern_keywords$ = makeSymbol("*TASK-SCHEDULER-DATE-PATTERN-KEYWORDS*");

    /**
     * The list of keywords that are used to specify time patterns for Task Scheduler tasks.
     */
    // deflexical
    private static final SubLSymbol $task_scheduler_time_pattern_keywords$ = makeSymbol("*TASK-SCHEDULER-TIME-PATTERN-KEYWORDS*");

    /**
     *
     *
     * @param PATTERN;
     * 		property-list-p : time or date pattern
     * @param LIST-OF-KEYWORDS;
     * 		listp : list of keywords allowable in time or date patterns
     * @return booleanp : T iff all the identifiers in PATTERN are elements of LIST-OF-KEYWORDS
     */
    public static final SubLObject valid_time_or_date_pattern_keywordsP(SubLObject pattern, SubLObject list_of_keywords, SubLObject warnP) {
        {
            SubLObject non_wffP = NIL;
            SubLObject list_var = NIL;
            SubLObject element = NIL;
            SubLObject index = NIL;
            for (list_var = pattern, element = list_var.first(), index = ZERO_INTEGER; !((NIL != non_wffP) || (NIL == list_var)); list_var = list_var.rest() , element = list_var.first() , index = add(ONE_INTEGER, index)) {
                if ((NIL != evenp(index)) && (NIL == subl_promotions.memberP(element, list_of_keywords, UNPROVIDED, UNPROVIDED))) {
                    if (NIL != warnP) {
                        format(T, $str_alt103$__Found_an_invalid_identifier_key, element, list_of_keywords);
                    }
                    non_wffP = T;
                }
            }
            return makeBoolean(NIL == non_wffP);
        }
    }

    /**
     * #$defnIff for #$TaskSchedulerDatePatternExpression.
     * Returns T iff OBJECT is a well-formed date pattern.
     */
    public static final SubLObject task_scheduler_date_pattern_expression_p(SubLObject v_object, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        if (NIL == el_utilities.el_list_p(v_object)) {
            return NIL;
        }
        {
            SubLObject pattern = el_utilities.el_list_items(v_object);
            if (NIL == list_utilities.property_list_p(pattern)) {
                return NIL;
            }
            return well_formed_date_pattern_expressionP(pattern, warnP);
        }
    }

    /**
     *
     *
     * @param DATE-EXPRESSION;
     * 		property-list-p
     * @return booleanp : T iff DATE-PATTERN is a well-formed date pattern
     */
    public static final SubLObject well_formed_date_pattern_expressionP(SubLObject date_pattern, SubLObject warnP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == valid_time_or_date_pattern_keywordsP(date_pattern, $task_scheduler_date_pattern_keywords$.getGlobalValue(), warnP)) {
                return NIL;
            }
            thread.resetMultipleValues();
            {
                SubLObject day = decode_date_pattern(date_pattern);
                SubLObject month = thread.secondMultipleValue();
                SubLObject year = thread.thirdMultipleValue();
                SubLObject day_of_week = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean(((((NIL == day) || (NIL != well_formed_day_expressionP(day))) && ((NIL == month) || (NIL != well_formed_month_expressionP(month)))) && ((NIL == year) || (NIL != well_formed_year_expressionP(year)))) && ((NIL == day_of_week) || (NIL != well_formed_day_of_week_expressionP(day_of_week))));
            }
        }
    }

    public static final SubLObject well_formed_day_expressionP(SubLObject exp) {
        return makeBoolean(((NIL != integer_within_intervalP(exp, ONE_INTEGER, $int$31)) || (((NIL != time_or_date_component_interval_p(exp)) && (NIL != well_formed_day_expressionP(first_in_time_or_date_component_interval(exp)))) && (NIL != well_formed_day_expressionP(last_in_time_or_date_component_interval(exp))))) || ((NIL != time_or_date_component_list_p(exp)) && (NIL != list_utilities.every_in_list($sym106$WELL_FORMED_DAY_EXPRESSION_, time_or_date_component_list_items(exp), UNPROVIDED))));
    }

    public static final SubLObject well_formed_month_expressionP(SubLObject exp) {
        return makeBoolean((((NIL != integer_within_intervalP(exp, ONE_INTEGER, TWELVE_INTEGER)) || (NIL != isa.isaP(exp, $$MonthOfYearType, UNPROVIDED, UNPROVIDED))) || (((NIL != time_or_date_component_interval_p(exp)) && (NIL != well_formed_month_expressionP(first_in_time_or_date_component_interval(exp)))) && (NIL != well_formed_month_expressionP(last_in_time_or_date_component_interval(exp))))) || ((NIL != time_or_date_component_list_p(exp)) && (NIL != list_utilities.every_in_list($sym108$WELL_FORMED_MONTH_EXPRESSION_, time_or_date_component_list_items(exp), UNPROVIDED))));
    }

    public static final SubLObject well_formed_year_expressionP(SubLObject exp) {
        return makeBoolean(((NIL != subl_promotions.positive_integer_p(exp)) || (((NIL != time_or_date_component_interval_p(exp)) && (NIL != well_formed_year_expressionP(first_in_time_or_date_component_interval(exp)))) && (NIL != well_formed_year_expressionP(last_in_time_or_date_component_interval(exp))))) || ((NIL != time_or_date_component_list_p(exp)) && (NIL != list_utilities.every_in_list($sym109$WELL_FORMED_YEAR_EXPRESSION_, time_or_date_component_list_items(exp), UNPROVIDED))));
    }

    public static final SubLObject well_formed_day_of_week_expressionP(SubLObject exp) {
        return makeBoolean((NIL != subl_promotions.memberP(exp, $list_alt97, UNPROVIDED, UNPROVIDED)) || (NIL != well_formed_day_of_week_expression_intP(exp)));
    }

    public static final SubLObject well_formed_day_of_week_expression_intP(SubLObject exp) {
        return makeBoolean((((NIL != integer_within_intervalP(exp, ZERO_INTEGER, SIX_INTEGER)) || (NIL != isa.isaP(exp, $$DayOfWeekType, UNPROVIDED, UNPROVIDED))) || (((NIL != day_of_week_interval_p(exp)) && (NIL != well_formed_day_of_week_expressionP(first_day_in_interval(exp)))) && (NIL != well_formed_day_of_week_expressionP(last_day_in_interval(exp))))) || ((NIL != day_of_week_list_p(exp)) && (NIL != list_utilities.every_in_list($sym111$WELL_FORMED_DAY_OF_WEEK_EXPRESSION_, day_of_week_list_items(exp), UNPROVIDED))));
    }

    /**
     * #$defnIff for #$TaskSchedulerTimePatternExpression.
     * Returns T iff OBJECT is a well-formed time pattern.
     */
    public static final SubLObject task_scheduler_time_pattern_expression_p(SubLObject v_object, SubLObject warnP) {
        if (warnP == UNPROVIDED) {
            warnP = NIL;
        }
        if (NIL == el_utilities.el_list_p(v_object)) {
            return NIL;
        }
        {
            SubLObject pattern = el_utilities.el_list_items(v_object);
            if (NIL == list_utilities.property_list_p(pattern)) {
                return NIL;
            }
            return well_formed_time_pattern_expressionP(pattern, warnP);
        }
    }

    /**
     *
     *
     * @param TIME-EXPRESSION;
     * 		property-list-p
     * @return booleanp : T iff TIME-PATTERN is a well-formed time pattern
     */
    public static final SubLObject well_formed_time_pattern_expressionP(SubLObject time_pattern, SubLObject warnP) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == valid_time_or_date_pattern_keywordsP(time_pattern, $task_scheduler_time_pattern_keywords$.getGlobalValue(), warnP)) {
                return NIL;
            }
            thread.resetMultipleValues();
            {
                SubLObject second = decode_time_pattern(time_pattern);
                SubLObject minute = thread.secondMultipleValue();
                SubLObject hour = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean((((NIL == second) || (NIL != well_formed_second_expressionP(second))) && ((NIL == minute) || (NIL != well_formed_minute_expressionP(minute)))) && ((NIL == hour) || (NIL != well_formed_hour_expressionP(hour))));
            }
        }
    }

    public static final SubLObject well_formed_second_expressionP(SubLObject exp) {
        return integer_within_intervalP(exp, ZERO_INTEGER, $int$59);
    }

    public static final SubLObject well_formed_minute_expressionP(SubLObject exp) {
        return makeBoolean(((NIL != integer_within_intervalP(exp, ZERO_INTEGER, $int$59)) || (((NIL != time_or_date_component_interval_p(exp)) && (NIL != well_formed_minute_expressionP(first_in_time_or_date_component_interval(exp)))) && (NIL != well_formed_minute_expressionP(last_in_time_or_date_component_interval(exp))))) || ((NIL != time_or_date_component_list_p(exp)) && (NIL != list_utilities.every_in_list($sym114$WELL_FORMED_MINUTE_EXPRESSION_, time_or_date_component_list_items(exp), UNPROVIDED))));
    }

    public static final SubLObject well_formed_hour_expressionP(SubLObject exp) {
        return makeBoolean(((NIL != integer_within_intervalP(exp, ZERO_INTEGER, $int$23)) || (((NIL != time_or_date_component_interval_p(exp)) && (NIL != well_formed_hour_expressionP(first_in_time_or_date_component_interval(exp)))) && (NIL != well_formed_hour_expressionP(last_in_time_or_date_component_interval(exp))))) || ((NIL != time_or_date_component_list_p(exp)) && (NIL != list_utilities.every_in_list($sym116$WELL_FORMED_HOUR_EXPRESSION_, time_or_date_component_list_items(exp), UNPROVIDED))));
    }

    public static final SubLObject integer_within_intervalP(SubLObject v_int, SubLObject min, SubLObject max) {
        return makeBoolean((v_int.isInteger() && min.numLE(v_int)) && v_int.numLE(max));
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param EXPRESSION;
     * 		subl-expression-syntax-p
     * @param REGULAR-TIME-INTERVAL;
     * 		NULL or non-negative-integerp
     * @param TIME-PATTERN;
     * 		task-scheduler-time-pattern-expression-p
     * @param DATE-PATTERN;
     * 		task-scheduler-date-pattern-expression-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @param OVERRIDE-EXISTINS-TASK-BY-NAME?;
     * 		booleanp
     * @return task-scheduler-task-p
    Creates a new task object for TASK-SCHEDULER with given properties and enters it in the task table under NAME.
    If OVERRIDE-EXISTINS-TASK-BY-NAME? is T then any existing TASK-SCHEDULER task by name NAME will be overriden.
     */
    public static final SubLObject schedule_new_task(SubLObject name, SubLObject expression, SubLObject regular_time_interval, SubLObject time_pattern, SubLObject date_pattern, SubLObject v_task_scheduler, SubLObject override_existing_task_by_nameP) {
        if (v_task_scheduler == UNPROVIDED) {
            v_task_scheduler = $cyc_task_scheduler$.getGlobalValue();
        }
        if (override_existing_task_by_nameP == UNPROVIDED) {
            override_existing_task_by_nameP = T;
        }
        if ((NIL != get_task_scheduler_task_by_name(name, UNPROVIDED)) && (NIL == override_existing_task_by_nameP)) {
            task_scheduler_warn(ZERO_INTEGER, $str_alt117$Already_a_task_by_name_NAME__Plea, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        } else
            if (NIL == cycl_grammar.subl_expression_syntax_p(expression)) {
                task_scheduler_warn(ZERO_INTEGER, $str_alt118$The_expression__A_specified_for_t, expression, name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return NIL;
            } else
                if ((NIL != regular_time_interval) && (NIL == task_scheduler_regular_time_interval_expression_p(regular_time_interval))) {
                    task_scheduler_warn(ZERO_INTEGER, $str_alt119$The_regular_time_interval__A_spec, regular_time_interval, name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    return NIL;
                } else
                    if ((NIL != time_pattern) && (NIL == task_scheduler_time_pattern_expression_p(time_pattern, T))) {
                        task_scheduler_warn(ZERO_INTEGER, $str_alt120$The_time_pattern__A_specified_for, time_pattern, name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        return NIL;
                    } else
                        if ((NIL != date_pattern) && (NIL == task_scheduler_date_pattern_expression_p(date_pattern, T))) {
                            task_scheduler_warn(ZERO_INTEGER, $str_alt121$The_date_pattern__A_specified_for, date_pattern, name, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            return NIL;
                        } else
                            if (((NIL == regular_time_interval) && (NIL == time_pattern)) && (NIL == date_pattern)) {
                                task_scheduler_warn(ZERO_INTEGER, $str_alt122$A_task_scheduler_task_needs_to_ha, name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                return NIL;
                            } else {
                                return schedule_new_task_int(name, expression, regular_time_interval, NIL != el_utilities.el_list_p(time_pattern) ? ((SubLObject) (evaluation_defns.el_list_to_subl_list(time_pattern))) : time_pattern, NIL != el_utilities.el_list_p(date_pattern) ? ((SubLObject) (evaluation_defns.el_list_to_subl_list(date_pattern))) : date_pattern, v_task_scheduler);
                            }





    }

    public static final SubLObject schedule_new_task_int(SubLObject name, SubLObject expression, SubLObject regular_time_interval, SubLObject time_pattern, SubLObject date_pattern, SubLObject v_task_scheduler) {
        {
            SubLObject regular_time_interval_in_seconds = convert_regular_time_interval_to_seconds(regular_time_interval);
            SubLObject first_scheduled_time = ((NIL == time_pattern) && (NIL == date_pattern)) ? ((SubLObject) (get_universal_time())) : compute_next_scheduled_universal_time(time_pattern, date_pattern, UNPROVIDED);
            SubLObject process = NIL;
            SubLObject task = NIL;
            SubLObject task_for_main_processP = NIL;
            if (NIL != first_scheduled_time) {
                undeclare_task_scheduler_task_for_name(name, v_task_scheduler);
                task = new_task_scheduler_task(first_scheduled_time, expression, regular_time_interval_in_seconds, time_pattern, date_pattern);
                inform_user_of_performance_time_int(name, task_constant_for_task_name(name), $NEXT, first_scheduled_time);
                if (NIL != task_is_likely_to_run_oftenP(regular_time_interval_in_seconds, time_pattern)) {
                    process = declare_task_scheduler_process(name, task, v_task_scheduler);
                } else {
                    process = get_task_scheduler_main_process(v_task_scheduler);
                    task_for_main_processP = T;
                }
                task = set_process_for_task(task, process);
                add_new_task_to_task_scheduler_task_table(name, task, v_task_scheduler);
                if (NIL != task_for_main_processP) {
                    declare_new_task_for_task_scheduler_main_process(name, v_task_scheduler);
                }
                return task;
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param REGULAR-TIME-INTERVAL;
     * 		NULL or non-negative-integer-p
     * @param TIME-PATTERN;
     * 		property-list-p
     * @return booleanp : T iff the given REGULAR-TIME-INTERVAL (in seconds) and TIME-PATTERN indicate
    that a certain task is likely to run *often*; right now, if the task
    is to run more often than once a day, that is considered often
     */
    public static final SubLObject task_is_likely_to_run_oftenP(SubLObject regular_time_interval, SubLObject time_pattern) {
        return T;
    }

    public static final SubLObject time_pattern_contains_intervals_or_listsP(SubLObject time_pattern) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject second = decode_time_pattern(time_pattern);
                SubLObject minute = thread.secondMultipleValue();
                SubLObject hour = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return makeBoolean(((NIL != time_or_date_component_interval_or_list_p(second)) || (NIL != time_or_date_component_interval_or_list_p(minute))) || (NIL != time_or_date_component_interval_or_list_p(hour)));
            }
        }
    }

    /**
     * Informs the user of progress on TASK-NAME both by printing progress messages on the standard output
     * and (if the Task Scheduler KB is available) asserting progress assertions in the image KB.
     */
    public static final SubLObject inform_user_of_performance_time(SubLObject task_name, SubLObject last_scheduled_time, SubLObject next_scheduled_time) {
        {
            SubLObject task_constant = constants_high.find_constant(task_name);
            if (NIL != last_scheduled_time) {
                inform_user_of_performance_time_int(task_name, task_constant, $LAST, last_scheduled_time);
            }
            if (NIL != next_scheduled_time) {
                inform_user_of_performance_time_int(task_name, task_constant, $NEXT, next_scheduled_time);
            }
        }
        return NIL;
    }

    public static final SubLObject inform_user_of_performance_time_int(SubLObject task_name, SubLObject task_constant, SubLObject which_one, SubLObject universal_time) {
        if (NIL == task_constant) {
            return NIL;
        }
        {
            SubLObject universal_date = numeric_date_utilities.get_universal_date(universal_time, UNPROVIDED);
            SubLObject universal_second = numeric_date_utilities.get_universal_second(universal_time);
            SubLObject pcase_var = which_one;
            if (pcase_var.eql($LAST)) {
                format(T, $str_alt125$__The_task__A_was_last_performed_, task_name, make_progress_string_for_universal_time(universal_time));
                if ((NIL != task_constant) && (NIL != kb_control_vars.cyc_task_scheduler_kb_loaded_p())) {
                    replace_progress_assertion(task_constant, $const126$taskSchedulerTaskLastPerformanceT, universal_second);
                    replace_progress_assertion(task_constant, $const127$taskSchedulerTaskLastPerformanceD, universal_date);
                }
            } else
                if (pcase_var.eql($NEXT)) {
                    format(T, $str_alt85$__The_task__A_will_next_be_perfor, task_name, make_progress_string_for_universal_time(universal_time));
                    if ((NIL != task_constant) && (NIL != kb_control_vars.cyc_task_scheduler_kb_loaded_p())) {
                        replace_progress_assertion(task_constant, $const128$taskSchedulerTaskNextPerformanceT, universal_second);
                        replace_progress_assertion(task_constant, $const129$taskSchedulerTaskNextPerformanceD, universal_date);
                    }
                }

        }
        return NIL;
    }

    public static final SubLObject make_progress_string_for_universal_time(SubLObject universal_time) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject progress_string = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
                    SubLObject minute = thread.secondMultipleValue();
                    SubLObject hour = thread.thirdMultipleValue();
                    SubLObject day = thread.fourthMultipleValue();
                    SubLObject month = thread.fifthMultipleValue();
                    SubLObject year = thread.sixthMultipleValue();
                    SubLObject day_of_week = thread.seventhMultipleValue();
                    SubLObject daylight_saving_time_p = thread.eighthMultipleValue();
                    SubLObject time_zone = SubLProcess.nthMultipleValue(EIGHT_INTEGER);
                    thread.resetMultipleValues();
                    month = numeric_date_utilities.abbreviation_for_month_number(month);
                    progress_string = cons(format(NIL, $str_alt130$on__A__A___A, new SubLObject[]{ month, day, year }), progress_string);
                    progress_string = cons(format(NIL, $str_alt131$at__2__0d__2__0d__2__0d_, new SubLObject[]{ hour, minute, second }), progress_string);
                    return creduce(CCONCATENATE, progress_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
        }
    }

    public static final SubLObject replace_progress_assertion(SubLObject constant, SubLObject pred, SubLObject new_value) {
        {
            SubLObject old_assertions = kb_mapping.gather_gaf_arg_index(constant, ONE_INTEGER, pred, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = old_assertions;
            SubLObject assertion = NIL;
            for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                cyc_kernel.cyc_unassert(assertions_high.assertion_formula(assertion), assertions_high.assertion_mt(assertion));
            }
            return cyc_kernel.cyc_assert(el_utilities.make_el_formula(pred, list(constant, new_value), UNPROVIDED), $$BookkeepingMt, UNPROVIDED);
        }
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK;
     * 		task-scheduler-task-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return processp
    Creates a new to perform TASK declared for TASK-SCHEDULER.
     */
    public static final SubLObject declare_task_scheduler_process(SubLObject name, SubLObject task, SubLObject v_task_scheduler) {
        return new_task_scheduler_process(name, task, v_task_scheduler);
    }

    public static final SubLObject new_task_scheduler_process(SubLObject name, SubLObject task, SubLObject v_task_scheduler) {
        {
            SubLObject process_name = make_task_scheduler_process_name(name);
            return subl_promotions.make_process_with_args(process_name, TASK_SCHEDULER_PROCESS, list(name, task, v_task_scheduler));
        }
    }

    public static final SubLObject make_task_scheduler_process_name(SubLObject name) {
        return cconcatenate($str_alt135$Task_Scheduler_Process_, name);
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK;
     * 		task-scheduler-task-p
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Recursively performs TASK (that is among TASK-SCHEDULER tasks) at the time it is next scheduled to be
     * 		performed until no such time exists.
     */
    public static final SubLObject task_scheduler_process(SubLObject name, SubLObject task, SubLObject v_task_scheduler) {
        {
            SubLObject next_task = set_process_for_task(task, current_process());
            SubLObject delta_seconds = NIL;
            while (NIL != next_task) {
                delta_seconds = subtract(task_scheduler_task_next_scheduled_time(next_task), get_universal_time());
                if (delta_seconds.isPositive()) {
                    sleep(delta_seconds);
                }
                perform_scheduled_task(name, next_task);
                next_task = set_next_scheduled_universal_time_for_task(name, next_task);
                if (NIL != next_task) {
                    add_new_task_to_task_scheduler_task_table(name, next_task, v_task_scheduler);
                } else {
                    remove_task_from_task_scheduler_task_table(name, v_task_scheduler);
                }
            } 
            return NIL;
        }
    }

    /**
     *
     *
     * @param TASK-NAME;
     * 		stringp
     * @param TASK;
     * 		task-scheduler-task-p
     * 		Perform TASK by evaluating the specified expression, update the performance
     * 		result for TASK and inform the user of the result.
     */
    public static final SubLObject perform_scheduled_task(SubLObject task_name, SubLObject task) {
        {
            SubLObject expression = task_scheduler_task_expression(task);
            SubLObject result = eval(expression);
            return set_performance_result_for_task(result, task_name, task);
        }
    }

    /**
     *
     *
     * @param PROCESS;
     * 		processp
     * 		Kills the Task Scheduler process PROCESS.
     */
    public static final SubLObject undeclare_task_scheduler_process(SubLObject process) {
        if (NIL != valid_process_p(process)) {
            return kill_process(process);
        }
        return NIL;
    }

    /**
     *
     *
     * @return processp
    Creates the main task scheduler process; the process is blocked until there comes a task for it to handle.
     */
    public static final SubLObject create_task_scheduler_main_process() {
        return subl_promotions.make_process_with_args($$$Task_Scheduler_Main_Process, CREATE_TASK_SCHEDULER_MAIN_PROCESS_INT, UNPROVIDED);
    }

    public static final SubLObject create_task_scheduler_main_process_int() {
        process_block();
        return NIL;
    }

    /**
     *
     *
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return processp : the main process for the task scheduler TASK-SCHEDULER
     */
    public static final SubLObject get_task_scheduler_main_process(SubLObject v_task_scheduler) {
        if (NIL == valid_process_p(task_scheduler_main_process(v_task_scheduler))) {
            set_task_scheduler_main_process(v_task_scheduler, create_task_scheduler_main_process());
        }
        return task_scheduler_main_process(v_task_scheduler);
    }

    /**
     *
     *
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Kills the main process for the task scheduler TASK-SCHEDULER.
     */
    public static final SubLObject undeclare_task_scheduler_main_process(SubLObject v_task_scheduler) {
        set_task_scheduler_main_process_task_list(v_task_scheduler, NIL);
        undeclare_task_scheduler_process(task_scheduler_main_process(v_task_scheduler));
        return NIL;
    }

    /**
     *
     *
     * @param PROCESS;
     * 		processp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return booleanp : T iff PROCESS is the main process for the task scheduler TASK-SCHEDULER
     */
    public static final SubLObject task_scheduler_main_processP(SubLObject process, SubLObject v_task_scheduler) {
        return eq(process, task_scheduler_main_process(v_task_scheduler));
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Adds task name NAME in the task list for the main process for TASK-SCHEDULER and
     * 		interrupts the main process to make it check the first task in the list.
     */
    public static final SubLObject declare_new_task_for_task_scheduler_main_process(SubLObject name, SubLObject v_task_scheduler) {
        return add_new_task_to_main_process_task_list(name, v_task_scheduler);
    }

    public static final SubLObject interrupt_main_process_to_check_next_in_task_list(SubLObject v_task_scheduler) {
        {
            SubLObject main_process = task_scheduler_main_process(v_task_scheduler);
            subl_promotions.interrupt_process_with_args(main_process, CHECK_NEXT_IN_MAIN_PROCESS_TASK_LIST, list(v_task_scheduler));
        }
        return NIL;
    }

    /**
     * If T then that means task scheduler main process
     * has been interrupted within a :sleep-interrupted ccatch body
     */
    // defparameter
    private static final SubLSymbol $interrupted_while_asleepP$ = makeSymbol("*INTERRUPTED-WHILE-ASLEEP?*");

    /**
     *
     *
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Checks the task next in line to be performed by the main process for TASK-SCHEDULER.
     */
    public static final SubLObject check_next_in_main_process_task_list(SubLObject v_task_scheduler) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject next_task_name = get_next_task_name_in_main_process_task_list(v_task_scheduler);
                SubLObject next_task = get_task_scheduler_task_by_name(next_task_name, v_task_scheduler);
                if (NIL != task_scheduler_task_p(next_task)) {
                    if (NIL != $interrupted_while_asleepP$.getDynamicValue(thread)) {
                        sublisp_throw($SLEEP_INTERRUPTED, T);
                    } else {
                        handle_next_task_in_main_process_task_list(next_task, next_task_name, v_task_scheduler);
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject handle_next_task_in_main_process_task_list(SubLObject next_task, SubLObject next_task_name, SubLObject v_task_scheduler) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject next_scheduled_time = task_scheduler_task_next_scheduled_time(next_task);
                SubLObject delta_time = subtract(next_scheduled_time, get_universal_time());
                SubLObject sleep_interruptedP = NIL;
                try {
                    if (delta_time.isPositive()) {
                        {
                            SubLObject _prev_bind_0 = $interrupted_while_asleepP$.currentBinding(thread);
                            try {
                                $interrupted_while_asleepP$.bind(T, thread);
                                sleep(delta_time);
                            } finally {
                                $interrupted_while_asleepP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    sleep_interruptedP = Errors.handleThrowable(ccatch_env_var, $SLEEP_INTERRUPTED);
                }
                if (NIL != sleep_interruptedP) {
                    return check_next_in_main_process_task_list(v_task_scheduler);
                } else {
                    remove_next_task_in_main_process_task_list(v_task_scheduler);
                    create_process_to_perform_scheduled_task(next_task_name, next_task);
                    next_task = set_next_scheduled_universal_time_for_task(next_task_name, next_task);
                    if (NIL != next_task) {
                        add_new_task_to_task_scheduler_task_table(next_task_name, next_task, v_task_scheduler);
                        add_new_task_to_main_process_task_list(next_task_name, v_task_scheduler);
                    } else {
                        remove_task_from_task_scheduler_task_table(next_task_name, v_task_scheduler);
                    }
                    return NIL;
                }
            }
        }
    }

    /**
     *
     *
     * @param TASK-NAME;
     * 		stringp
     * @param TASK;
     * 		task-scheduler-task-p
     * @return processp
    Creates a new process to perform TASK by evaluating the specified expression.
     */
    public static final SubLObject create_process_to_perform_scheduled_task(SubLObject task_name, SubLObject task) {
        {
            SubLObject process_name = make_task_scheduler_process_name(task_name);
            return subl_promotions.make_process_with_args(process_name, PERFORM_SCHEDULED_TASK, list(task_name, task));
        }
    }

    /**
     *
     *
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return stringp : the name corresponding to the next task to be performed by
    the main process for TASK-SCHEDULER
     */
    public static final SubLObject get_next_task_name_in_main_process_task_list(SubLObject v_task_scheduler) {
        {
            SubLObject name = NIL;
            SubLObject lock = task_scheduler_main_process_task_list_lock(v_task_scheduler);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                name = task_scheduler_main_process_task_list(v_task_scheduler).first();
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return name;
        }
    }

    /**
     *
     *
     * @unknown Necessary to use SORT-ADJOIN in @xref add-new-task-to-main-process-task-list
    with unary @xref get-next-scheduled-time-for-task-scheduler-task-name.
     */
    // defparameter
    private static final SubLSymbol $temporary_task_scheduler_to_add_new_task_to_main_process_task_list$ = makeSymbol("*TEMPORARY-TASK-SCHEDULER-TO-ADD-NEW-TASK-TO-MAIN-PROCESS-TASK-LIST*");

    /**
     *
     *
     * @param TASK-NAME;
     * 		stringp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return booleanp : T iff the next task to be performed is now different
    Adds TASK-NAME to the list of tasks that the main process for TASK-SCHEDULER handles,
    in the right order depending on the time it is scheduled to be performed next.
     */
    public static final SubLObject add_new_task_to_main_process_task_list(SubLObject task_name, SubLObject v_task_scheduler) {
        {
            SubLObject order_changedP = add_new_task_to_main_process_task_list_int(task_name, v_task_scheduler);
            if (NIL != order_changedP) {
                return interrupt_main_process_to_check_next_in_task_list(v_task_scheduler);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param TASK-NAME;
     * 		stringp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * @return booleanp : T iff the next task to be performed is now different
    Adds TASK-NAME to the list of tasks that the main process for TASK-SCHEDULER handles,
    in the right order depending on the time it is scheduled to be performed next.
     */
    public static final SubLObject add_new_task_to_main_process_task_list_int(SubLObject task_name, SubLObject v_task_scheduler) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject order_changedP = NIL;
                {
                    SubLObject _prev_bind_0 = $temporary_task_scheduler_to_add_new_task_to_main_process_task_list$.currentBinding(thread);
                    try {
                        $temporary_task_scheduler_to_add_new_task_to_main_process_task_list$.bind(v_task_scheduler, thread);
                        {
                            SubLObject lock = task_scheduler_main_process_task_list_lock(v_task_scheduler);
                            SubLObject release = NIL;
                            try {
                                release = seize_lock(lock);
                                {
                                    SubLObject task_list = task_scheduler_main_process_task_list(v_task_scheduler);
                                    SubLObject new_task_list = list_utilities.sort_adjoin(task_name, task_scheduler_main_process_task_list(v_task_scheduler), EQ, $sym141$_, GET_NEXT_SCHEDULED_TIME_FOR_TASK_SCHEDULER_TASK_NAME);
                                    set_task_scheduler_main_process_task_list(v_task_scheduler, new_task_list);
                                    order_changedP = makeBoolean(!get_task_scheduler_task_by_name(task_list.first(), v_task_scheduler).equalp(get_task_scheduler_task_by_name(new_task_list.first(), v_task_scheduler)));
                                }
                            } finally {
                                if (NIL != release) {
                                    release_lock(lock);
                                }
                            }
                        }
                    } finally {
                        $temporary_task_scheduler_to_add_new_task_to_main_process_task_list$.rebind(_prev_bind_0, thread);
                    }
                }
                return order_changedP;
            }
        }
    }

    public static final SubLObject get_next_scheduled_time_for_task_scheduler_task_name(SubLObject name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return get_next_scheduled_time_for_task_name(name, $temporary_task_scheduler_to_add_new_task_to_main_process_task_list$.getDynamicValue(thread));
        }
    }

    /**
     *
     *
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Removes the first in the list of tasks that the main process for TASK-SCHEDULER handles.
     */
    public static final SubLObject remove_next_task_in_main_process_task_list(SubLObject v_task_scheduler) {
        {
            SubLObject lock = task_scheduler_main_process_task_list_lock(v_task_scheduler);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                set_task_scheduler_main_process_task_list(v_task_scheduler, task_scheduler_main_process_task_list(v_task_scheduler).rest());
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Undeclares the task corresponding to NAME for the main process for TASK-SCHEDULER
     * 		by removing NAME from the list of tasks to be performed by the main process.
     */
    public static final SubLObject undeclare_task_for_task_scheduler_main_process(SubLObject name, SubLObject v_task_scheduler) {
        return remove_task_from_task_scheduler_main_process_task_list(name, v_task_scheduler);
    }

    /**
     *
     *
     * @param TASK-NAME;
     * 		stringp
     * @param TASK-SCHEDULER;
     * 		task-scheduler-p
     * 		Removes TASK-NAME from the list of tasks that the main process for TASK-SCHEDULER handles.
     */
    public static final SubLObject remove_task_from_task_scheduler_main_process_task_list(SubLObject task_name, SubLObject v_task_scheduler) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject order_changedP = remove_task_from_task_scheduler_main_process_task_list_int(task_name, v_task_scheduler);
                if (NIL != order_changedP) {
                    {
                        SubLObject _prev_bind_0 = $interrupted_while_asleepP$.currentBinding(thread);
                        try {
                            $interrupted_while_asleepP$.bind(T, thread);
                            interrupt_main_process_to_check_next_in_task_list(v_task_scheduler);
                        } finally {
                            $interrupted_while_asleepP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static final SubLObject remove_task_from_task_scheduler_main_process_task_list_int(SubLObject task_name, SubLObject v_task_scheduler) {
        {
            SubLObject order_changedP = NIL;
            SubLObject lock = task_scheduler_main_process_task_list_lock(v_task_scheduler);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject task_list = task_scheduler_main_process_task_list(v_task_scheduler);
                    order_changedP = equal(task_name, task_list.first());
                    set_task_scheduler_main_process_task_list(v_task_scheduler, remove(task_name, task_list, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return order_changedP;
        }
    }

    /**
     *
     *
     * @param PROCESS;
     * 		processp
     * @return booleanp : T iff PROCESS is sleeping
     */
    public static final SubLObject process_asleepP(SubLObject process) {
        return member(process_whostate(process), $list_alt143, symbol_function(EQUAL), UNPROVIDED);
    }

    /**
     *
     *
     * @param REGULAR-TIME-INTERVAL;
     * 		NULL or non-negative-integer-p
     * @param TIME-PATTERN;
     * 		property-list-p
     * @param DATE-PATTERN;
     * 		property-list-p
     * @param UNIVERSAL-TIME;
     * 		universal-time-p
     * @return universal-time-p
    Computes the next scheduled universal time following UNIVERSAL-TIME (possibly UNIVERSAL-TIME itself)
    depending on REGULAR-TIME-INTERVAL, TIME-PATTERN and DATE-PATTERN.
     */
    public static final SubLObject compute_next_scheduled_universal_time_for_task(SubLObject regular_time_interval, SubLObject time_pattern, SubLObject date_pattern, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        {
            SubLObject next_scheduled_time = NIL;
            if (NIL != regular_time_interval) {
                next_scheduled_time = increment_universal_time(universal_time, regular_time_interval);
                if (NIL == universal_time_satisfies_time_and_date_patternsP(time_pattern, date_pattern, next_scheduled_time)) {
                    next_scheduled_time = compute_next_scheduled_universal_time(time_pattern, date_pattern, next_scheduled_time);
                }
            } else {
                next_scheduled_time = compute_next_scheduled_universal_time(time_pattern, date_pattern, universal_time);
            }
            return next_scheduled_time;
        }
    }

    /**
     *
     *
     * @param TIME-PATTERN;
     * 		property-list-p
     * @param DATE-PATTERN;
     * 		property-list-p
     * @param UNIVERSAL-TIME;
     * 		universal-time-p
     * @return booleanp : T iff UNIVERSAL-TIME satisfies both TIME-PATTERN and DATE-PATTERN
     */
    public static final SubLObject universal_time_satisfies_time_and_date_patternsP(SubLObject time_pattern, SubLObject date_pattern, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != time_pattern) {
                thread.resetMultipleValues();
                {
                    SubLObject second = decode_time_pattern(time_pattern);
                    SubLObject minute = thread.secondMultipleValue();
                    SubLObject hour = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == universal_time_satisfies_time_patternP(universal_time, second, minute, hour)) {
                        return NIL;
                    }
                }
            }
            if (NIL != date_pattern) {
                thread.resetMultipleValues();
                {
                    SubLObject day = decode_date_pattern(date_pattern);
                    SubLObject month = thread.secondMultipleValue();
                    SubLObject year = thread.thirdMultipleValue();
                    SubLObject day_of_week = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL == universal_date_satisfies_date_patternP(numeric_date_utilities.get_universal_date(universal_time, UNPROVIDED), day, month, year, day_of_week)) {
                        return NIL;
                    }
                }
            }
            return T;
        }
    }

    /**
     *
     *
     * @param TIME-PATTERN;
     * 		property-list-p
     * @param DATE-PATTERN;
     * 		property-list-p
     * @param UNIVERSAL-TIME;
     * 		universal-time-p
     * @return universal-time-p
    Computes the next universal time following UNIVERSAL-TIME (possibly UNIVERSAL-TIME itself)
    that satisfies both TIME-PATTERN and DATE-PATTERN.
     */
    public static final SubLObject compute_next_scheduled_universal_time(SubLObject time_pattern, SubLObject date_pattern, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        if ((NIL != time_pattern) && (NIL != date_pattern)) {
            {
                SubLObject next_universal_time = compute_next_universal_time_satisfying_time_pattern(time_pattern, universal_time);
                return compute_next_universal_time_satisfying_time_and_date_patterns(next_universal_time, time_pattern, date_pattern);
            }
        } else
            if (NIL != time_pattern) {
                return compute_next_universal_time_satisfying_time_pattern(time_pattern, universal_time);
            } else
                if (NIL != date_pattern) {
                    return encode_a_sample_universal_time_for_universal_date(compute_next_universal_date_satisfying_date_pattern(date_pattern, numeric_date_utilities.get_universal_date(universal_time, UNPROVIDED)));
                } else {
                    return NIL;
                }


    }

    /**
     *
     *
     * @param TIME-PATTERN;
     * 		property-list-p
     * @param UNIVERSAL-TIME;
     * 		universal-time-p
     * @return universal-time-p
    Computes the next universal time (within 24 hours of UNIVERSAL-TIME) that satisfies TIME-PATTERN.
     */
    public static final SubLObject compute_next_universal_time_satisfying_time_pattern(SubLObject time_pattern, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject pattern_second = decode_time_pattern(time_pattern);
                SubLObject pattern_minute = thread.secondMultipleValue();
                SubLObject pattern_hour = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != universal_time_satisfies_time_patternP(universal_time, pattern_second, pattern_minute, pattern_hour)) {
                    return universal_time;
                } else {
                    return compute_next_universal_time_satisfying_time_pattern_int(pattern_second, pattern_minute, pattern_hour, universal_time);
                }
            }
        }
    }

    /**
     *
     *
     * @param TIME-PATTERN;
     * 		property-list-p
     * 		Decodes the time pattern TIME-PATTERN to get the individual patterns for second, minute and hour.
     */
    public static final SubLObject decode_time_pattern(SubLObject time_pattern) {
        {
            SubLObject second = getf(time_pattern, $SECOND, UNPROVIDED);
            SubLObject minute = getf(time_pattern, $MINUTE, UNPROVIDED);
            SubLObject hour = getf(time_pattern, $HOUR, UNPROVIDED);
            return values(second, minute, hour);
        }
    }

    /**
     * Returns T iff the universal time UNIVERSAL-TIME satisfies the patterns given for second, minute and hour.
     */
    public static final SubLObject universal_time_satisfies_time_patternP(SubLObject universal_time, SubLObject pattern_second, SubLObject pattern_minute, SubLObject pattern_hour) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
                SubLObject minute = thread.secondMultipleValue();
                SubLObject hour = thread.thirdMultipleValue();
                SubLObject day = thread.fourthMultipleValue();
                SubLObject month = thread.fifthMultipleValue();
                SubLObject year = thread.sixthMultipleValue();
                SubLObject day_of_week = thread.seventhMultipleValue();
                SubLObject daylight_saving_time_p = thread.eighthMultipleValue();
                SubLObject time_zone = SubLProcess.nthMultipleValue(EIGHT_INTEGER);
                thread.resetMultipleValues();
                return time_satisfies_time_patternP(second, minute, hour, pattern_second, pattern_minute, pattern_hour);
            }
        }
    }

    public static final SubLObject time_satisfies_time_patternP(SubLObject second, SubLObject minute, SubLObject hour, SubLObject pattern_second, SubLObject pattern_minute, SubLObject pattern_hour) {
        return makeBoolean((((NIL == pattern_second) || (pattern_second == second)) && (NIL != satisfying_time_componentP(minute, pattern_minute))) && (NIL != satisfying_time_componentP(hour, pattern_hour)));
    }

    public static final SubLObject satisfying_time_componentP(SubLObject given, SubLObject required) {
        return satisfying_time_or_date_componentP(given, required);
    }

    /**
     * Computes the next universal time following UNIVERSAL-TIME that satisfies the given patterns for second, minute, hour.
     */
    public static final SubLObject compute_next_universal_time_satisfying_time_pattern_int(SubLObject pattern_second, SubLObject pattern_minute, SubLObject pattern_hour, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        return get_next_universal_time_satisfying_time_pattern(pattern_second, pattern_minute, pattern_hour, universal_time);
    }

    /**
     * Computes the next universal time following UNIVERSAL-TIME that satisfies the given patterns (if any) for second, minute, and hour.
     */
    public static final SubLObject get_next_universal_time_satisfying_time_pattern(SubLObject pattern_second, SubLObject pattern_minute, SubLObject pattern_hour, SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject second = decode_universal_time(universal_time, UNPROVIDED);
                SubLObject minute = thread.secondMultipleValue();
                SubLObject hour = thread.thirdMultipleValue();
                SubLObject day = thread.fourthMultipleValue();
                SubLObject month = thread.fifthMultipleValue();
                SubLObject year = thread.sixthMultipleValue();
                SubLObject day_of_week = thread.seventhMultipleValue();
                SubLObject daylight_saving_time_p = thread.eighthMultipleValue();
                SubLObject time_zone = SubLProcess.nthMultipleValue(EIGHT_INTEGER);
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject next_universal_second = increment_universal_second(numeric_date_utilities.encode_universal_second(second, minute, hour), UNPROVIDED);
                    SubLObject delta_days = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject new_next_second = NIL;
                        SubLObject new_next_minute = NIL;
                        SubLObject new_next_hour = NIL;
                        thread.resetMultipleValues();
                        {
                            SubLObject next_second = numeric_date_utilities.decode_universal_second(next_universal_second);
                            SubLObject next_minute = thread.secondMultipleValue();
                            SubLObject next_hour = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            while (NIL == time_satisfies_time_patternP(next_second, next_minute, next_hour, pattern_second, pattern_minute, pattern_hour)) {
                                new_next_second = get_next_time_component_satisfying_time_pattern(pattern_second, increment_second(next_second));
                                if ((NIL != new_next_second) && (next_second != new_next_second)) {
                                    next_second = new_next_second;
                                } else {
                                    new_next_minute = get_next_time_component_satisfying_time_pattern(pattern_minute, increment_minute(next_minute));
                                    if ((NIL != new_next_minute) && (new_next_minute != next_minute)) {
                                        next_minute = new_next_minute;
                                        next_second = get_next_time_component_satisfying_time_pattern(pattern_second, ZERO_INTEGER);
                                    } else {
                                        new_next_hour = get_next_time_component_satisfying_time_pattern(pattern_hour, increment_hour(next_hour));
                                        if ((NIL != new_next_hour) && (new_next_hour != next_hour)) {
                                            next_hour = new_next_hour;
                                            next_minute = get_next_time_component_satisfying_time_pattern(pattern_minute, ZERO_INTEGER);
                                            next_second = get_next_time_component_satisfying_time_pattern(pattern_second, ZERO_INTEGER);
                                        } else {
                                            delta_days = add(delta_days, ONE_INTEGER);
                                            next_hour = get_next_time_component_satisfying_time_pattern(pattern_hour, ZERO_INTEGER);
                                            next_minute = get_next_time_component_satisfying_time_pattern(pattern_minute, ZERO_INTEGER);
                                            next_second = get_next_time_component_satisfying_time_pattern(pattern_second, ZERO_INTEGER);
                                        }
                                    }
                                }
                            } 
                            day = add(day, delta_days);
                            return encode_universal_time(next_second, next_minute, next_hour, day, month, year, UNPROVIDED);
                        }
                    }
                }
            }
        }
    }

    public static final SubLObject get_next_time_component_satisfying_time_pattern(SubLObject component_pattern, SubLObject time_component) {
        return get_next_time_or_date_component_satisfying_pattern(component_pattern, time_component);
    }

    public static final SubLObject increment_second(SubLObject second) {
        return second.numL(number_utilities.f_1_(numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue())) ? ((SubLObject) (number_utilities.f_1X(second))) : NIL;
    }

    public static final SubLObject increment_minute(SubLObject minute) {
        return minute.numL(number_utilities.f_1_(numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue())) ? ((SubLObject) (number_utilities.f_1X(minute))) : NIL;
    }

    public static final SubLObject increment_hour(SubLObject hour) {
        return hour.numL(number_utilities.f_1_(numeric_date_utilities.$hours_in_a_day$.getGlobalValue())) ? ((SubLObject) (number_utilities.f_1X(hour))) : NIL;
    }

    /**
     *
     *
     * @param DATE-PATTERN;
     * 		property-list-p
     * @param UNIVERSAL-DATE;
     * 		universal-date-p
     * @return universal-date-p
    Computes the next universal date following UNIVERSAL-DATE that satisfies DATE-PATTERN.
     */
    public static final SubLObject compute_next_universal_date_satisfying_date_pattern(SubLObject date_pattern, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject pattern_day = decode_date_pattern(date_pattern);
                SubLObject pattern_month = thread.secondMultipleValue();
                SubLObject pattern_year = thread.thirdMultipleValue();
                SubLObject pattern_day_of_week = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                return compute_next_universal_date_satisfying_date_pattern_int(pattern_day, pattern_month, pattern_year, pattern_day_of_week, universal_date);
            }
        }
    }

    /**
     *
     *
     * @param UNIVERSAL-TIME;
     * 		universal-time-p : time first universal time within the next 24 hours that satisfies TIME-PATTERN
     * @param TIME-PATTERN;
     * 		property-list-p
     * @param DATE-PATTERN;
     * 		property-list-p
     * 		Computes the next universal time from UNIVERSAL-TIME on (possibly UNIVERSAL-TIME itself)
     * 		that satisfies both TIME-PATTERN and DATE-PATTERN.
     */
    public static final SubLObject compute_next_universal_time_satisfying_time_and_date_patterns(SubLObject universal_time, SubLObject time_pattern, SubLObject date_pattern) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject pattern_day = decode_date_pattern(date_pattern);
                SubLObject pattern_month = thread.secondMultipleValue();
                SubLObject pattern_year = thread.thirdMultipleValue();
                SubLObject pattern_day_of_week = thread.fourthMultipleValue();
                thread.resetMultipleValues();
                {
                    SubLObject universal_date = numeric_date_utilities.get_universal_date(universal_time, UNPROVIDED);
                    if (NIL != universal_date_satisfies_date_patternP(universal_date, pattern_day, pattern_month, pattern_year, pattern_day_of_week)) {
                        return universal_time;
                    } else {
                        {
                            SubLObject universal_date_2 = compute_next_universal_date_satisfying_date_pattern_int(pattern_day, pattern_month, pattern_year, pattern_day_of_week, UNPROVIDED);
                            if (NIL != universal_date_2) {
                                return compute_next_universal_time_satisfying_time_pattern(time_pattern, encode_a_sample_universal_time_for_universal_date(universal_date_2));
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param DATE-PATTERN;
     * 		property-list-p
     * 		Decodes the date pattern DATE-PATTERN to get the individual patterns for day, month, year and day of the week.
     */
    public static final SubLObject decode_date_pattern(SubLObject date_pattern) {
        {
            SubLObject day = getf(date_pattern, $DAY, UNPROVIDED);
            SubLObject month = getf(date_pattern, $MONTH, UNPROVIDED);
            SubLObject year = getf(date_pattern, $YEAR, UNPROVIDED);
            SubLObject day_of_week = getf(date_pattern, $DAY_OF_WEEK, UNPROVIDED);
            return values(day, month, year, day_of_week);
        }
    }

    /**
     * Computes the next universal date following UNIVERSAL-DATE that satisfies the given patterns for day, month, year and day of the week.
     */
    public static final SubLObject compute_next_universal_date_satisfying_date_pattern_int(SubLObject pattern_day, SubLObject pattern_month, SubLObject pattern_year, SubLObject pattern_day_of_week, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (((NIL != pattern_day) || (NIL != pattern_month)) || (NIL != pattern_year)) {
            {
                SubLObject next_universal_date = get_next_universal_date_satisfying_date_pattern(pattern_day, pattern_month, pattern_year, pattern_day_of_week, universal_date);
                return next_universal_date;
            }
        } else
            if (NIL != pattern_day_of_week) {
                return get_next_universal_date_satisfying_day_of_week_pattern(pattern_day_of_week, universal_date);
            }

        return NIL;
    }

    /**
     * Computes the next universal date following UNIVERSAL-DATE that satisfies the given patterns (if any)
     * for day, month, year and day of the week.
     */
    public static final SubLObject get_next_universal_date_satisfying_date_pattern(SubLObject pattern_day, SubLObject pattern_month, SubLObject pattern_year, SubLObject pattern_day_of_week, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject next_universal_date = increment_universal_date(universal_date, UNPROVIDED);
                SubLObject failP = NIL;
                SubLObject new_next_day = NIL;
                SubLObject new_next_month = NIL;
                SubLObject new_next_year = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject next_day = numeric_date_utilities.decode_universal_date(next_universal_date);
                    SubLObject next_month = thread.secondMultipleValue();
                    SubLObject next_year = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    while (!((NIL != failP) || ((NIL != universal_date_validP(next_universal_date)) && (NIL != universal_date_satisfies_date_patternP(next_universal_date, pattern_day, pattern_month, pattern_year, pattern_day_of_week))))) {
                        new_next_day = get_next_date_component_satisfying_date_pattern(pattern_day, increment_day(next_day, next_month, next_year));
                        if ((NIL != new_next_day) && (next_day != new_next_day)) {
                            next_day = new_next_day;
                        } else {
                            if ((NIL == pattern_year) && (NIL == pattern_month)) {
                                next_day = get_next_date_component_satisfying_date_pattern(pattern_day, ZERO_INTEGER);
                                thread.resetMultipleValues();
                                {
                                    SubLObject next_month_3 = get_month_and_year_with_day_upcoming(next_day, next_universal_date);
                                    SubLObject next_year_4 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    next_month = next_month_3;
                                    next_year = next_year_4;
                                }
                            } else {
                                new_next_month = get_next_date_component_satisfying_date_pattern(pattern_month, increment_month(next_month));
                                if ((NIL != new_next_month) && (new_next_month != next_month)) {
                                    next_month = new_next_month;
                                    next_day = get_next_date_component_satisfying_date_pattern(pattern_day, ZERO_INTEGER);
                                } else {
                                    if (NIL == pattern_year) {
                                        next_day = get_next_date_component_satisfying_date_pattern(pattern_day, ZERO_INTEGER);
                                        next_month = get_next_date_component_satisfying_date_pattern(pattern_month, ZERO_INTEGER);
                                        next_year = get_year_with_day_and_month_upcoming(next_day, next_month, next_universal_date);
                                    } else {
                                        new_next_year = get_next_date_component_satisfying_date_pattern(pattern_year, increment_year(next_year));
                                        if ((NIL != new_next_year) && (new_next_year != next_year)) {
                                            next_year = new_next_year;
                                            next_month = get_next_date_component_satisfying_date_pattern(pattern_month, ZERO_INTEGER);
                                            next_day = get_next_date_component_satisfying_date_pattern(pattern_day, ZERO_INTEGER);
                                        } else {
                                            failP = T;
                                        }
                                    }
                                }
                            }
                        }
                        if (((NIL != next_day) && (NIL != next_month)) && (NIL != next_year)) {
                            next_universal_date = numeric_date_utilities.encode_universal_date(next_day, next_month, next_year);
                        } else {
                            failP = T;
                        }
                    } 
                    return NIL != failP ? ((SubLObject) (NIL)) : next_universal_date;
                }
            }
        }
    }

    public static final SubLObject get_next_date_component_satisfying_date_pattern(SubLObject component_pattern, SubLObject date_component) {
        return get_next_time_or_date_component_satisfying_pattern(component_pattern, date_component);
    }

    public static final SubLObject increment_day(SubLObject day, SubLObject month, SubLObject year) {
        return day.numL(number_utilities.f_1_(numeric_date_utilities.days_in_month_number(month, year))) ? ((SubLObject) (number_utilities.f_1X(day))) : NIL;
    }

    public static final SubLObject increment_month(SubLObject month) {
        return month.numL(number_utilities.f_1_(numeric_date_utilities.$months_in_a_year$.getGlobalValue())) ? ((SubLObject) (number_utilities.f_1X(month))) : NIL;
    }

    public static final SubLObject increment_year(SubLObject year) {
        return number_utilities.f_1X(year);
    }

    /**
     * Returns T iff the universal date  UNIVERSAL-DATE satisfies the patterns given for day, month, year and day of the week.
     */
    public static final SubLObject universal_date_satisfies_date_patternP(SubLObject universal_date, SubLObject pattern_day, SubLObject pattern_month, SubLObject pattern_year, SubLObject pattern_day_of_week) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
                SubLObject month = thread.secondMultipleValue();
                SubLObject year = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return date_satisfies_date_patternP(day, month, year, what_day_of_week_is_universal_date(universal_date), pattern_day, pattern_month, pattern_year, pattern_day_of_week);
            }
        }
    }

    public static final SubLObject date_satisfies_date_patternP(SubLObject day, SubLObject month, SubLObject year, SubLObject day_of_week, SubLObject pattern_day, SubLObject pattern_month, SubLObject pattern_year, SubLObject pattern_day_of_week) {
        return makeBoolean((((NIL != satisfying_time_or_date_componentP(day, pattern_day)) && (NIL != satisfying_time_or_date_componentP(month, pattern_month))) && (NIL != satisfying_time_or_date_componentP(year, pattern_year))) && (NIL != satisfying_day_of_weekP(day_of_week, pattern_day_of_week)));
    }

    /**
     * Returns T iff DAY-OF-WEEK satisfies DAY-OF-WEEK-PATTERN.
     */
    public static final SubLObject satisfying_day_of_weekP(SubLObject day_of_week, SubLObject day_of_week_pattern) {
        if (NIL == day_of_week_pattern) {
            return T;
        } else
            if (NIL != is_day_of_week_pattern_a_day_of_week_intervalP(day_of_week_pattern)) {
                return is_day_within_day_of_week_intervalP(day_of_week_pattern, day_of_week);
            } else
                if (NIL != is_day_of_week_pattern_a_day_of_week_listP(day_of_week_pattern)) {
                    return is_day_within_day_of_week_listP(day_of_week_pattern, day_of_week);
                }


        {
            SubLObject pcase_var = day_of_week_pattern;
            if (pcase_var.eql($WEEKDAY)) {
                return is_weekdayP(day_of_week);
            } else
                if (pcase_var.eql($NON_WEEKDAY)) {
                    return is_non_weekdayP(day_of_week);
                } else {
                    return is_day_the_given_day_of_weekP(day_of_week_pattern, day_of_week);
                }

        }
    }

    /**
     * Returns the universal date corresponding to the next date following UNIVERSAL-DATE that satisfies DAY-OF-WEEK-PATTERN.
     */
    public static final SubLObject get_next_universal_date_satisfying_day_of_week_pattern(SubLObject day_of_week_pattern, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (NIL == day_of_week_pattern) {
            return increment_universal_date(universal_date, UNPROVIDED);
        } else
            if (NIL != is_day_of_week_pattern_a_day_of_week_intervalP(day_of_week_pattern)) {
                return get_next_universal_date_within_day_of_week_interval(day_of_week_pattern, universal_date);
            } else
                if (NIL != is_day_of_week_pattern_a_day_of_week_listP(day_of_week_pattern)) {
                    return get_next_universal_date_within_day_of_week_list(day_of_week_pattern, universal_date);
                }


        {
            SubLObject pcase_var = day_of_week_pattern;
            if (pcase_var.eql($WEEKDAY)) {
                return get_universal_date_for_next_weekday(universal_date);
            } else
                if (pcase_var.eql($NON_WEEKDAY)) {
                    return get_universal_date_for_next_non_weekday(universal_date);
                } else {
                    return get_universal_date_for_next_given_day_of_week(day_of_week_pattern, universal_date);
                }

        }
    }

    public static final SubLObject is_day_of_week_pattern_a_day_of_week_intervalP(SubLObject day_of_week_pattern) {
        return day_of_week_interval_p(day_of_week_pattern);
    }

    public static final SubLObject is_day_of_week_pattern_a_day_of_week_listP(SubLObject day_of_week_pattern) {
        return day_of_week_list_p(day_of_week_pattern);
    }

    public static final SubLObject satisfying_time_or_date_componentP(SubLObject given, SubLObject required) {
        if (NIL == required) {
            return T;
        } else
            if (NIL != time_or_date_component_interval_p(required)) {
                return time_or_date_component_is_within_specified_intervalP(given, required);
            } else
                if (NIL != time_or_date_component_list_p(required)) {
                    return time_or_date_component_is_within_specified_listP(given, required);
                } else {
                    return eq(given, required);
                }


    }

    public static final SubLObject time_or_date_component_interval_p(SubLObject v_object) {
        return makeBoolean((NIL != el_utilities.el_formula_with_operator_p(v_object, $const151$TaskSchedulerPatternPropertyInter)) && (NIL != el_utilities.formula_arityE(v_object, TWO_INTEGER, UNPROVIDED)));
    }

    public static final SubLObject first_in_time_or_date_component_interval(SubLObject interval) {
        return cycl_utilities.formula_arg1(interval, UNPROVIDED);
    }

    public static final SubLObject last_in_time_or_date_component_interval(SubLObject interval) {
        return cycl_utilities.formula_arg2(interval, UNPROVIDED);
    }

    public static final SubLObject make_time_or_date_component_interval(SubLObject first, SubLObject last) {
        return el_utilities.make_el_formula($const151$TaskSchedulerPatternPropertyInter, list(first, last), UNPROVIDED);
    }

    public static final SubLObject time_or_date_component_is_within_specified_intervalP(SubLObject given_component, SubLObject interval) {
        return makeBoolean(first_in_time_or_date_component_interval(interval).numLE(given_component) && given_component.numLE(last_in_time_or_date_component_interval(interval)));
    }

    public static final SubLObject time_or_date_component_list_p(SubLObject v_object) {
        return el_utilities.el_formula_with_operator_p(v_object, $$TheList);
    }

    public static final SubLObject make_time_or_date_component_list(SubLObject elements) {
        return el_utilities.make_el_list(elements, UNPROVIDED);
    }

    public static final SubLObject time_or_date_component_list_items(SubLObject list) {
        return el_utilities.el_list_items(list);
    }

    public static final SubLObject time_or_date_component_is_within_specified_listP(SubLObject given_component, SubLObject list) {
        return subl_promotions.memberP(given_component, time_or_date_component_list_items(list), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject get_next_time_or_date_component_satisfying_pattern(SubLObject component_pattern, SubLObject given_component) {
        if (NIL == given_component) {
            return NIL;
        } else
            if (NIL == component_pattern) {
                return given_component;
            } else
                if (NIL != satisfying_time_or_date_componentP(given_component, component_pattern)) {
                    return given_component;
                } else
                    if (component_pattern.isInteger() && given_component.numL(component_pattern)) {
                        return component_pattern;
                    } else
                        if ((NIL != time_or_date_component_interval_p(component_pattern)) && given_component.numL(first_in_time_or_date_component_interval(component_pattern))) {
                            return first_in_time_or_date_component_interval(component_pattern);
                        } else
                            if (NIL != time_or_date_component_list_p(component_pattern)) {
                                return closest_in_time_or_date_component_list(component_pattern, given_component);
                            }





        return NIL;
    }

    public static final SubLObject closest_in_time_or_date_component_list(SubLObject pattern_list, SubLObject given_component) {
        {
            SubLObject closest = NIL;
            SubLObject delta = NIL;
            SubLObject min_delta = NIL;
            SubLObject cdolist_list_var = time_or_date_component_list_items(pattern_list);
            SubLObject each = NIL;
            for (each = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , each = cdolist_list_var.first()) {
                delta = subtract(each, given_component);
                if (delta.isPositive() && ((NIL == min_delta) || delta.numL(min_delta))) {
                    min_delta = delta;
                    closest = each;
                }
            }
            return closest;
        }
    }

    public static final SubLObject time_or_date_component_interval_or_list_p(SubLObject v_object) {
        return makeBoolean((NIL != time_or_date_component_interval_p(v_object)) || (NIL != time_or_date_component_list_p(v_object)));
    }

    /**
     *
     *
     * @param REGULAR-TIME-INTERVAL;
     * 		task-scheduler-regular-time-interval-expression-p
     * @return positive-number-p
    Convert REGULAR-TIME-INTERVAL to an amount of time in seconds.
     */
    public static final SubLObject convert_regular_time_interval_to_seconds(SubLObject regular_time_interval) {
        {
            SubLObject interval_type = cycl_utilities.formula_operator(regular_time_interval);
            SubLObject duration = cycl_utilities.formula_arg1(regular_time_interval, UNPROVIDED);
            SubLObject pcase_var = interval_type;
            if (pcase_var.eql($$SecondsDuration)) {
                return duration;
            } else
                if (pcase_var.eql($$MinutesDuration)) {
                    return multiply(duration, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue());
                } else
                    if (pcase_var.eql($$HoursDuration)) {
                        return multiply(duration, numeric_date_utilities.$seconds_in_an_hour$.getGlobalValue());
                    } else
                        if (pcase_var.eql($$DaysDuration)) {
                            return multiply(duration, numeric_date_utilities.$seconds_in_a_day$.getGlobalValue());
                        }



        }
        return NIL;
    }

    /**
     *
     *
     * @param DAY;
     * 		non-negative-integer-p
     * @return booleanp : T iff DAY corresponds to a weekday
     */
    public static final SubLObject is_weekdayP(SubLObject day) {
        if (day == UNPROVIDED) {
            day = numeric_date_utilities.universal_time_day_of_week_number(UNPROVIDED);
        }
        return numL(day, FIVE_INTEGER);
    }

    /**
     *
     *
     * @param DAY;
     * 		non-negative-integer-p
     * @return booleanp : T iff DAY corresponds to a non-weekday
     */
    public static final SubLObject is_non_weekdayP(SubLObject day) {
        if (day == UNPROVIDED) {
            day = numeric_date_utilities.universal_time_day_of_week_number(UNPROVIDED);
        }
        return makeBoolean(NIL == is_weekdayP(day));
    }

    /**
     * Returns T iff OBJECT is a time/date interval.
     */
    public static final SubLObject day_of_week_interval_p(SubLObject v_object) {
        return time_or_date_component_interval_p(v_object);
    }

    public static final SubLObject make_day_of_week_interval(SubLObject first, SubLObject last) {
        return make_time_or_date_component_interval(first, last);
    }

    public static final SubLObject first_day_in_interval(SubLObject interval) {
        return first_in_time_or_date_component_interval(interval);
    }

    public static final SubLObject last_day_in_interval(SubLObject interval) {
        return last_in_time_or_date_component_interval(interval);
    }

    /**
     *
     *
     * @param INTERVAL;
     * 		day-of-week-interval-p
     * @param DAY;
     * 		non-negative-integer-p
     * @return booleanp : T iff DAY falls within INTERVAL.
     * @unknown (is-day-within-day-of-week-interval? '(#$TaskSchedulerPatternPropertyIntervalFn 3 6) 5)
    T
     */
    public static final SubLObject is_day_within_day_of_week_intervalP(SubLObject interval, SubLObject day) {
        if (day == UNPROVIDED) {
            day = numeric_date_utilities.universal_time_day_of_week_number(UNPROVIDED);
        }
        {
            SubLObject first_day = first_day_in_interval(interval);
            SubLObject last_day = last_day_in_interval(interval);
            return makeBoolean(first_day.numLE(day) && day.numLE(last_day));
        }
    }

    /**
     * Returns T iff OBJECT is a proper list.
     */
    public static final SubLObject day_of_week_list_p(SubLObject v_object) {
        return time_or_date_component_list_p(v_object);
    }

    public static final SubLObject make_day_of_week_list(SubLObject items) {
        return make_time_or_date_component_list(items);
    }

    public static final SubLObject day_of_week_list_items(SubLObject list) {
        return time_or_date_component_list_items(list);
    }

    /**
     *
     *
     * @param LIST;
     * 		proper-list-p
     * @param DAY;
     * 		keywordp or non-negative-integer-p
     * @return booleanp : T iff DAY is within LIST.
     * @unknown (is-day-within-day-of-week-list? '(:monday :thursday :sunday) :saturday)
    NIL
     * @unknown (is-day-within-day-of-week-interval? '(1 3 6) 3)
    T
     */
    public static final SubLObject is_day_within_day_of_week_listP(SubLObject list, SubLObject day) {
        if (day == UNPROVIDED) {
            day = numeric_date_utilities.universal_time_day_of_week_number(UNPROVIDED);
        }
        return list_utilities.sublisp_boolean(member(day, list, $sym157$IS_DAY_THE_GIVEN_DAY_OF_WEEK_, UNPROVIDED));
    }

    public static final SubLObject is_day_the_given_day_of_weekP(SubLObject day_of_week, SubLObject day) {
        if (day == UNPROVIDED) {
            day = numeric_date_utilities.universal_time_day_of_week_number(UNPROVIDED);
        }
        return eq(day_of_week, day);
    }

    /**
     *
     *
     * @param DAY-OF-WEEK;
     * 		keywordp or non-negative-integer-p
     * @param UNIVERSAL-DATE;
     * 		universal-date-p
     * @return booleanp; T iff UNIVERSAL-DATE corresponds to DAY-OF-WEEK
     */
    public static final SubLObject is_universal_date_the_given_day_of_weekP(SubLObject day_of_week, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        return is_day_the_given_day_of_weekP(day_of_week, numeric_date_utilities.universal_time_day_of_week_number(encode_a_sample_universal_time_for_universal_date(universal_date)));
    }

    /**
     *
     *
     * @param UNIVERSAL-DATE;
     * 		universal-date-p
     * @return universal-time-p : a sample universal time for UNIVERSAL-DATE
     */
    public static final SubLObject encode_a_sample_universal_time_for_universal_date(SubLObject universal_date) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
                SubLObject month = thread.secondMultipleValue();
                SubLObject year = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return encode_universal_time(ZERO_INTEGER, ZERO_INTEGER, ZERO_INTEGER, day, month, year, UNPROVIDED);
            }
        }
    }

    /**
     *
     *
     * @param UNIVERSAL-DATE;
     * 		universal-date-p
     * @return non-negative-integer-p : the day of the week numeral corresponding to UNIVERSAL-DATE
     */
    public static final SubLObject what_day_of_week_is_universal_date(SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        return numeric_date_utilities.universal_time_day_of_week_number(encode_a_sample_universal_time_for_universal_date(universal_date));
    }

    /**
     *
     *
     * @param UNIVERSAL-DATE;
     * 		universal-date-p
     * @return positive-integer-p : the year corresponding to UNIVERSAL-DATE
     */
    public static final SubLObject get_year_from_universal_date(SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
                SubLObject month = thread.secondMultipleValue();
                SubLObject year = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                return year;
            }
        }
    }

    /**
     * Return the next year following UNIVERSAL-DATE with DAY and MONTH upcoming.
     */
    public static final SubLObject get_year_with_day_and_month_upcoming(SubLObject day, SubLObject month, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (NIL == valid_day_and_month_combinationP(day, month)) {
            return NIL;
        }
        {
            SubLObject given_year = get_year_from_universal_date(universal_date);
            SubLObject date_in_given_year = numeric_date_utilities.encode_universal_date(day, month, given_year);
            SubLObject year = (universal_date.numGE(date_in_given_year)) ? ((SubLObject) (number_utilities.f_1X(given_year))) : given_year;
            while (day.numG(numeric_date_utilities.days_in_month_number(month, year))) {
                year = add(year, ONE_INTEGER);
            } 
            return year;
        }
    }

    public static final SubLObject valid_day_and_month_combinationP(SubLObject day, SubLObject month) {
        {
            SubLObject days_in_month = numeric_date_utilities.usual_days_in_month_number(month);
            SubLObject max_days_in_month = (month == TWO_INTEGER) ? ((SubLObject) (number_utilities.f_1X(days_in_month))) : days_in_month;
            return numLE(day, max_days_in_month);
        }
    }

    /**
     *
     *
     * @param GIVEN-DAY;
     * 		positive-integer-p
     * 		Returns the next month and year following UNIVERSAL-DATE with GIVEN-DAY upcoming.
     */
    public static final SubLObject get_month_and_year_with_day_upcoming(SubLObject given_day, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            thread.resetMultipleValues();
            {
                SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
                SubLObject month = thread.secondMultipleValue();
                SubLObject year = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (given_day.numLE(day)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject month_5 = next_month_and_year(month, year);
                        SubLObject year_6 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        month = month_5;
                        year = year_6;
                    }
                }
                while (numeric_date_utilities.days_in_month_number(month, year).numL(given_day)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject month_7 = next_month_and_year(month, year);
                        SubLObject year_8 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        month = month_7;
                        year = year_8;
                    }
                } 
                return values(month, year);
            }
        }
    }

    public static final SubLObject next_month_and_year(SubLObject month, SubLObject year) {
        {
            SubLObject next_month = number_utilities.f_1X(month);
            SubLObject next_year = year;
            if (next_month.numG(TWELVE_INTEGER)) {
                next_year = add(next_year, ONE_INTEGER);
                next_month = ONE_INTEGER;
            }
            return values(next_month, next_year);
        }
    }

    /**
     *
     *
     * @param DAY-OF-WEEK-INTERVAL;
     * 		day-of-week-interval-p
     * @param UNIVERSAL-DATE;
     * 		universal-date-p
     * @return universal-date-p : next universal date following UNIVERSAL-DATE such that
    its day of the week falls within DAY-OF-WEEK-INTERVAL
     */
    public static final SubLObject get_next_universal_date_within_day_of_week_interval(SubLObject day_of_week_interval, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        {
            SubLObject date = increment_universal_date(universal_date, UNPROVIDED);
            SubLObject day_of_week = what_day_of_week_is_universal_date(date);
            if (NIL != is_day_within_day_of_week_intervalP(day_of_week_interval, day_of_week)) {
                return date;
            } else {
                {
                    SubLObject delta = number_utilities.modular_subtraction(first_day_in_interval(day_of_week_interval), day_of_week, SEVEN_INTEGER);
                    return increment_universal_date(date, delta);
                }
            }
        }
    }

    /**
     *
     *
     * @param DAY-OF-WEEK-LIST;
     * 		day-of-week-list-p
     * @param UNIVERSAL-DATE;
     * 		universal-date-p
     * @return universal-date-p : next universal date following UNIVERSAL-DATE such that
    its day of the week occurs in DAY-OF-WEEK-LIST
     */
    public static final SubLObject get_next_universal_date_within_day_of_week_list(SubLObject day_of_week_list, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        {
            SubLObject date = increment_universal_date(universal_date, UNPROVIDED);
            SubLObject day_of_week = what_day_of_week_is_universal_date(date);
            if (NIL != is_day_within_day_of_week_listP(day_of_week_list, day_of_week)) {
                return date;
            } else {
                {
                    SubLObject min_delta = SEVEN_INTEGER;
                    SubLObject delta = NIL;
                    SubLObject cdolist_list_var = day_of_week_list_items(day_of_week_list);
                    SubLObject day = NIL;
                    for (day = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , day = cdolist_list_var.first()) {
                        delta = number_utilities.modular_subtraction(day, day_of_week, SEVEN_INTEGER);
                        min_delta = min(delta, min_delta);
                    }
                    return increment_universal_date(date, min_delta);
                }
            }
        }
    }

    /**
     *
     *
     * @param UNIVERSAL-DATE;
     * 		universal-date-p
     * @param DELTA;
     * 		non-negative-integer-p
     * @return universal-date-p : the universal date that corresponds to the date DELTA days after UNIVERSAL-DATE
     */
    public static final SubLObject increment_universal_date(SubLObject universal_date, SubLObject delta) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(universal_date, UNIVERSAL_DATE_P);
            SubLTrampolineFile.checkType(delta, NON_NEGATIVE_INTEGER_P);
            thread.resetMultipleValues();
            {
                SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
                SubLObject month = thread.secondMultipleValue();
                SubLObject year = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                day = add(day, delta);
                {
                    SubLObject days_in_current_month = numeric_date_utilities.days_in_month_number(month, year);
                    while (days_in_current_month.numL(day)) {
                        day = subtract(day, days_in_current_month);
                        thread.resetMultipleValues();
                        {
                            SubLObject month_9 = next_month_and_year(month, year);
                            SubLObject year_10 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            month = month_9;
                            year = year_10;
                        }
                        days_in_current_month = numeric_date_utilities.days_in_month_number(month, year);
                    } 
                }
                return numeric_date_utilities.encode_universal_date(day, month, year);
            }
        }
    }

    /**
     *
     *
     * @param UNIVERSAL-SECOND;
     * 		universal-second-p
     * @param DELTA;
     * 		non-negative-integer-p
     * @return 0 universal-second-p : the universal second that corresponds to the time DELTA seconds after UNIVERSAL-SECOND
     * @return 1 non-negative-integer-p : the number of days between UNIVERSAL-SECOND and the universal second returned
     */
    public static final SubLObject increment_universal_second(SubLObject universal_second, SubLObject delta) {
        if (universal_second == UNPROVIDED) {
            universal_second = numeric_date_utilities.get_universal_second(UNPROVIDED);
        }
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(universal_second, UNIVERSAL_SECOND_P);
            SubLTrampolineFile.checkType(delta, NON_NEGATIVE_INTEGER_P);
            thread.resetMultipleValues();
            {
                SubLObject second = numeric_date_utilities.decode_universal_second(universal_second);
                SubLObject minute = thread.secondMultipleValue();
                SubLObject hour = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                thread.resetMultipleValues();
                {
                    SubLObject delta_seconds = numeric_date_utilities.decode_elapsed_seconds(delta);
                    SubLObject delta_minutes = thread.secondMultipleValue();
                    SubLObject delta_hours = thread.thirdMultipleValue();
                    SubLObject delta_days = thread.fourthMultipleValue();
                    thread.resetMultipleValues();
                    second = add(second, delta_seconds);
                    minute = add(minute, delta_minutes);
                    hour = add(hour, delta_hours);
                    if (second.numGE(numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue())) {
                        second = subtract(second, numeric_date_utilities.$seconds_in_a_minute$.getGlobalValue());
                        minute = add(minute, ONE_INTEGER);
                    }
                    if (minute.numGE(numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue())) {
                        minute = subtract(minute, numeric_date_utilities.$minutes_in_an_hour$.getGlobalValue());
                        hour = add(hour, ONE_INTEGER);
                    }
                    if (hour.numGE(numeric_date_utilities.$hours_in_a_day$.getGlobalValue())) {
                        hour = subtract(hour, numeric_date_utilities.$hours_in_a_day$.getGlobalValue());
                        delta_days = add(delta_days, ONE_INTEGER);
                    }
                    return values(numeric_date_utilities.encode_universal_second(second, minute, hour), delta_days);
                }
            }
        }
    }

    /**
     *
     *
     * @param UNIVERSAL-TIME;
     * 		universal-time-p
     * @param DELTA;
     * 		integerp
     * @return universal-time-p : the universal time that corresponds to the time DELTA seconds after UNIVERSAL-TIME
     */
    public static final SubLObject increment_universal_time(SubLObject universal_time, SubLObject delta) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        if (delta == UNPROVIDED) {
            delta = ONE_INTEGER;
        }
        SubLTrampolineFile.checkType(universal_time, UNIVERSAL_TIME_P);
        return add(universal_time, delta);
    }

    /**
     * Returns the universal date for the next weekday following UNIVERSAL-DATE.
     */
    public static final SubLObject get_universal_date_for_next_weekday(SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        return get_next_universal_date_within_day_of_week_interval($list_alt162, universal_date);
    }

    /**
     * Returns the universal date for the next non-weekday following UNIVERSAL-DATE.
     */
    public static final SubLObject get_universal_date_for_next_non_weekday(SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        return get_next_universal_date_within_day_of_week_interval($list_alt163, universal_date);
    }

    /**
     *
     *
     * @param DAY-OF-WEEK;
     * 		keywordp or non-negative-integer-p
     * @return universal-date-p : next universal date following UNIVERSAL-DATE such that
    its day of the week is the same as DAY-OF-WEEK
     */
    public static final SubLObject get_universal_date_for_next_given_day_of_week(SubLObject day_of_week, SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        return get_next_universal_date_within_day_of_week_list(make_day_of_week_list(list(day_of_week)), universal_date);
    }

    /**
     *
     *
     * @param UNIVERSAL-DATE;
     * 		universal-date-p
     * @return booleanp : T iff UNIVERSAL-DATE corresponds to a valid date
     * @unknown (universal-date-valid? 20020229)
    NIL
     * @unknown (universal-date-valid? 20040229)
    T
     */
    public static final SubLObject universal_date_validP(SubLObject universal_date) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != numeric_date_utilities.universal_date_p(universal_date)) {
                thread.resetMultipleValues();
                {
                    SubLObject day = numeric_date_utilities.decode_universal_date(universal_date);
                    SubLObject month = thread.secondMultipleValue();
                    SubLObject year = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    return date_validP(day, month, year);
                }
            }
            return NIL;
        }
    }

    /**
     * Returns T iff the date corresponding to DAY, MONTH and YEAR is a valid one.
     */
    public static final SubLObject date_validP(SubLObject day, SubLObject month, SubLObject year) {
        return numLE(day, numeric_date_utilities.days_in_month_number(month, year));
    }

    /**
     *
     *
     * @param UNIVERSAL-DATE;
     * 		universal-date-p
     * @return booleanp : T iff today's universal date is smaller than UNIVERSAL-DATE
     */
    public static final SubLObject universal_date_yet_to_comeP(SubLObject universal_date) {
        if (universal_date == UNPROVIDED) {
            universal_date = numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED);
        }
        return numL(numeric_date_utilities.get_universal_date(UNPROVIDED, UNPROVIDED), universal_date);
    }

    public static final SubLObject declare_task_scheduler_file() {
        declareFunction("initialize_cyc_task_scheduler_kb_feature", "INITIALIZE-CYC-TASK-SCHEDULER-KB-FEATURE", 0, 0, false);
        declareFunction("task_scheduler_task_print_function_trampoline", "TASK-SCHEDULER-TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_scheduler_task_p", "TASK-SCHEDULER-TASK-P", 1, 0, false);
        new task_scheduler.$task_scheduler_task_p$UnaryFunction();
        declareFunction("tst_process", "TST-PROCESS", 1, 0, false);
        declareFunction("tst_next_scheduled_time", "TST-NEXT-SCHEDULED-TIME", 1, 0, false);
        declareFunction("tst_expression", "TST-EXPRESSION", 1, 0, false);
        declareFunction("tst_result", "TST-RESULT", 1, 0, false);
        declareFunction("tst_regular_time_interval", "TST-REGULAR-TIME-INTERVAL", 1, 0, false);
        declareFunction("tst_time_pattern", "TST-TIME-PATTERN", 1, 0, false);
        declareFunction("tst_date_pattern", "TST-DATE-PATTERN", 1, 0, false);
        declareFunction("_csetf_tst_process", "_CSETF-TST-PROCESS", 2, 0, false);
        declareFunction("_csetf_tst_next_scheduled_time", "_CSETF-TST-NEXT-SCHEDULED-TIME", 2, 0, false);
        declareFunction("_csetf_tst_expression", "_CSETF-TST-EXPRESSION", 2, 0, false);
        declareFunction("_csetf_tst_result", "_CSETF-TST-RESULT", 2, 0, false);
        declareFunction("_csetf_tst_regular_time_interval", "_CSETF-TST-REGULAR-TIME-INTERVAL", 2, 0, false);
        declareFunction("_csetf_tst_time_pattern", "_CSETF-TST-TIME-PATTERN", 2, 0, false);
        declareFunction("_csetf_tst_date_pattern", "_CSETF-TST-DATE-PATTERN", 2, 0, false);
        declareFunction("make_task_scheduler_task", "MAKE-TASK-SCHEDULER-TASK", 0, 1, false);
        declareFunction("task_scheduler_task_process", "TASK-SCHEDULER-TASK-PROCESS", 1, 0, false);
        declareFunction("task_scheduler_task_next_scheduled_time", "TASK-SCHEDULER-TASK-NEXT-SCHEDULED-TIME", 1, 0, false);
        declareFunction("task_scheduler_task_expression", "TASK-SCHEDULER-TASK-EXPRESSION", 1, 0, false);
        declareFunction("task_scheduler_task_result", "TASK-SCHEDULER-TASK-RESULT", 1, 0, false);
        declareFunction("task_scheduler_task_regular_time_interval", "TASK-SCHEDULER-TASK-REGULAR-TIME-INTERVAL", 1, 0, false);
        declareFunction("task_scheduler_task_time_pattern", "TASK-SCHEDULER-TASK-TIME-PATTERN", 1, 0, false);
        declareFunction("task_scheduler_task_date_pattern", "TASK-SCHEDULER-TASK-DATE-PATTERN", 1, 0, false);
        declareFunction("print_task_scheduler_task", "PRINT-TASK-SCHEDULER-TASK", 3, 0, false);
        declareFunction("new_task_scheduler_task", "NEW-TASK-SCHEDULER-TASK", 5, 0, false);
        declareFunction("set_process_for_task", "SET-PROCESS-FOR-TASK", 2, 0, false);
        declareFunction("set_performance_result_for_task", "SET-PERFORMANCE-RESULT-FOR-TASK", 3, 0, false);
        declareFunction("inform_user_of_performance_result", "INFORM-USER-OF-PERFORMANCE-RESULT", 2, 0, false);
        declareFunction("set_next_scheduled_universal_time_for_task", "SET-NEXT-SCHEDULED-UNIVERSAL-TIME-FOR-TASK", 2, 0, false);
        declareFunction("set_next_scheduled_time_for_task_int", "SET-NEXT-SCHEDULED-TIME-FOR-TASK-INT", 2, 0, false);
        declareFunction("increment_universal_time_depending_on_time_pattern", "INCREMENT-UNIVERSAL-TIME-DEPENDING-ON-TIME-PATTERN", 2, 0, false);
        declareFunction("task_scheduler_print_function_trampoline", "TASK-SCHEDULER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_scheduler_p", "TASK-SCHEDULER-P", 1, 0, false);
        new task_scheduler.$task_scheduler_p$UnaryFunction();
        declareFunction("ts_task_table", "TS-TASK-TABLE", 1, 0, false);
        declareFunction("ts_task_table_lock", "TS-TASK-TABLE-LOCK", 1, 0, false);
        declareFunction("ts_main_process", "TS-MAIN-PROCESS", 1, 0, false);
        declareFunction("ts_main_process_task_list", "TS-MAIN-PROCESS-TASK-LIST", 1, 0, false);
        declareFunction("ts_main_process_task_list_lock", "TS-MAIN-PROCESS-TASK-LIST-LOCK", 1, 0, false);
        declareFunction("_csetf_ts_task_table", "_CSETF-TS-TASK-TABLE", 2, 0, false);
        declareFunction("_csetf_ts_task_table_lock", "_CSETF-TS-TASK-TABLE-LOCK", 2, 0, false);
        declareFunction("_csetf_ts_main_process", "_CSETF-TS-MAIN-PROCESS", 2, 0, false);
        declareFunction("_csetf_ts_main_process_task_list", "_CSETF-TS-MAIN-PROCESS-TASK-LIST", 2, 0, false);
        declareFunction("_csetf_ts_main_process_task_list_lock", "_CSETF-TS-MAIN-PROCESS-TASK-LIST-LOCK", 2, 0, false);
        declareFunction("make_task_scheduler", "MAKE-TASK-SCHEDULER", 0, 1, false);
        declareFunction("task_scheduler_task_table", "TASK-SCHEDULER-TASK-TABLE", 1, 0, false);
        declareFunction("task_scheduler_task_table_lock", "TASK-SCHEDULER-TASK-TABLE-LOCK", 1, 0, false);
        declareFunction("task_scheduler_main_process", "TASK-SCHEDULER-MAIN-PROCESS", 1, 0, false);
        declareFunction("task_scheduler_main_process_task_list", "TASK-SCHEDULER-MAIN-PROCESS-TASK-LIST", 1, 0, false);
        declareFunction("task_scheduler_main_process_task_list_lock", "TASK-SCHEDULER-MAIN-PROCESS-TASK-LIST-LOCK", 1, 0, false);
        declareFunction("print_task_scheduler", "PRINT-TASK-SCHEDULER", 3, 0, false);
        declareFunction("new_task_scheduler", "NEW-TASK-SCHEDULER", 0, 0, false);
        declareFunction("set_task_scheduler_main_process", "SET-TASK-SCHEDULER-MAIN-PROCESS", 2, 0, false);
        declareFunction("set_task_scheduler_main_process_task_list", "SET-TASK-SCHEDULER-MAIN-PROCESS-TASK-LIST", 2, 0, false);
        declareFunction("free_task_scheduler", "FREE-TASK-SCHEDULER", 1, 0, false);
        declareFunction("get_task_scheduler_task_by_name_from_task_table", "GET-TASK-SCHEDULER-TASK-BY-NAME-FROM-TASK-TABLE", 2, 0, false);
        declareFunction("add_new_task_to_task_scheduler_task_table", "ADD-NEW-TASK-TO-TASK-SCHEDULER-TASK-TABLE", 3, 0, false);
        declareFunction("remove_task_from_task_scheduler_task_table", "REMOVE-TASK-FROM-TASK-SCHEDULER-TASK-TABLE", 2, 0, false);
        declareMacro("do_task_scheduler_task_table", "DO-TASK-SCHEDULER-TASK-TABLE");
        declareFunction("cyc_task_scheduler", "CYC-TASK-SCHEDULER", 0, 0, false);
        declareFunction("clear_cyc_task_scheduler_task_description_predicate_p", "CLEAR-CYC-TASK-SCHEDULER-TASK-DESCRIPTION-PREDICATE-P", 0, 0, false);
        declareFunction("remove_cyc_task_scheduler_task_description_predicate_p", "REMOVE-CYC-TASK-SCHEDULER-TASK-DESCRIPTION-PREDICATE-P", 1, 0, false);
        declareFunction("cyc_task_scheduler_task_description_predicate_p_internal", "CYC-TASK-SCHEDULER-TASK-DESCRIPTION-PREDICATE-P-INTERNAL", 1, 0, false);
        declareFunction("cyc_task_scheduler_task_description_predicate_p", "CYC-TASK-SCHEDULER-TASK-DESCRIPTION-PREDICATE-P", 1, 0, false);
        declareFunction("cyc_task_scheduler_availableP", "CYC-TASK-SCHEDULER-AVAILABLE?", 0, 0, false);
        declareFunction("start_cyc_task_scheduler", "START-CYC-TASK-SCHEDULER", 0, 1, false);
        declareFunction("stop_cyc_task_scheduler", "STOP-CYC-TASK-SCHEDULER", 0, 0, false);
        declareFunction("stop_task_scheduler", "STOP-TASK-SCHEDULER", 1, 0, false);
        declareFunction("declare_task_scheduler_task", "DECLARE-TASK-SCHEDULER-TASK", 2, 2, false);
        declareFunction("load_task_scheduler_tasks_for_user_from_kb", "LOAD-TASK-SCHEDULER-TASKS-FOR-USER-FROM-KB", 0, 2, false);
        declareFunction("reload_task_scheduler_task_from_kb_if_loaded", "RELOAD-TASK-SCHEDULER-TASK-FROM-KB-IF-LOADED", 1, 2, false);
        declareFunction("load_task_scheduler_task_from_kb", "LOAD-TASK-SCHEDULER-TASK-FROM-KB", 1, 2, false);
        declareFunction("load_task_scheduler_task_from_kb_int", "LOAD-TASK-SCHEDULER-TASK-FROM-KB-INT", 3, 1, false);
        declareFunction("unload_task_scheduler_task", "UNLOAD-TASK-SCHEDULER-TASK", 1, 1, false);
        declareFunction("undeclare_task_scheduler_task_for_name", "UNDECLARE-TASK-SCHEDULER-TASK-FOR-NAME", 1, 1, false);
        declareFunction("undeclare_task_scheduler_task_for_name_int", "UNDECLARE-TASK-SCHEDULER-TASK-FOR-NAME-INT", 3, 0, false);
        declareFunction("task_scheduler_main_process_taskP", "TASK-SCHEDULER-MAIN-PROCESS-TASK?", 2, 0, false);
        declareFunction("undeclare_all_task_scheduler_tasks", "UNDECLARE-ALL-TASK-SCHEDULER-TASKS", 0, 1, false);
        declareFunction("display_task_scheduler_scheduled_tasks", "DISPLAY-TASK-SCHEDULER-SCHEDULED-TASKS", 0, 2, false);
        declareFunction("task_next_scheduled_timeL", "TASK-NEXT-SCHEDULED-TIME<", 2, 0, false);
        declareFunction("get_task_scheduler_task", "GET-TASK-SCHEDULER-TASK", 1, 1, false);
        declareFunction("get_task_scheduler_task_by_name", "GET-TASK-SCHEDULER-TASK-BY-NAME", 1, 1, false);
        declareFunction("get_next_scheduled_time_for_task_name", "GET-NEXT-SCHEDULED-TIME-FOR-TASK-NAME", 1, 1, false);
        declareFunction("get_process_for_task_name", "GET-PROCESS-FOR-TASK-NAME", 1, 1, false);
        declareFunction("get_result_for_task_name", "GET-RESULT-FOR-TASK-NAME", 1, 1, false);
        declareFunction("task_scheduler_warn", "TASK-SCHEDULER-WARN", 2, 5, false);
        declareFunction("task_scheduler_not_available_warning", "TASK-SCHEDULER-NOT-AVAILABLE-WARNING", 0, 0, false);
        declareFunction("task_scheduler_kb_not_loaded_warning", "TASK-SCHEDULER-KB-NOT-LOADED-WARNING", 0, 0, false);
        declareFunction("user_is_guestP", "USER-IS-GUEST?", 1, 0, false);
        declareFunction("task_name_for_task_constant", "TASK-NAME-FOR-TASK-CONSTANT", 1, 0, false);
        declareFunction("task_constant_for_task_name", "TASK-CONSTANT-FOR-TASK-NAME", 1, 0, false);
        declareFunction("get_tasks_for_user", "GET-TASKS-FOR-USER", 0, 1, false);
        declareFunction("kb_lookup_task_scheduler_task_property", "KB-LOOKUP-TASK-SCHEDULER-TASK-PROPERTY", 2, 0, false);
        declareFunction("kb_lookup_task_scheduler_task_property_in_miscellaneous_index", "KB-LOOKUP-TASK-SCHEDULER-TASK-PROPERTY-IN-MISCELLANEOUS-INDEX", 2, 0, false);
        declareFunction("kb_lookup_task_scheduler_task_expression", "KB-LOOKUP-TASK-SCHEDULER-TASK-EXPRESSION", 1, 0, false);
        declareFunction("kb_lookup_task_scheduler_task_regular_time_interval", "KB-LOOKUP-TASK-SCHEDULER-TASK-REGULAR-TIME-INTERVAL", 1, 0, false);
        declareFunction("kb_lookup_task_scheduler_task_time_pattern", "KB-LOOKUP-TASK-SCHEDULER-TASK-TIME-PATTERN", 1, 0, false);
        declareFunction("kb_lookup_task_scheduler_task_date_pattern", "KB-LOOKUP-TASK-SCHEDULER-TASK-DATE-PATTERN", 1, 0, false);
        declareFunction("convert_date_pattern", "CONVERT-DATE-PATTERN", 1, 0, false);
        declareFunction("replace_month_pattern", "REPLACE-MONTH-PATTERN", 1, 0, false);
        declareFunction("convert_month_pattern", "CONVERT-MONTH-PATTERN", 1, 0, false);
        declareFunction("get_day_of_week_for_numeral", "GET-DAY-OF-WEEK-FOR-NUMERAL", 1, 0, false);
        declareFunction("get_numeral_for_day_of_week", "GET-NUMERAL-FOR-DAY-OF-WEEK", 1, 0, false);
        declareFunction("day_of_week_numeral", "DAY-OF-WEEK-NUMERAL", 1, 0, false);
        declareFunction("replace_day_of_week_pattern", "REPLACE-DAY-OF-WEEK-PATTERN", 1, 0, false);
        declareFunction("convert_day_of_week_pattern", "CONVERT-DAY-OF-WEEK-PATTERN", 1, 0, false);
        declareFunction("task_scheduler_regular_time_interval_expression_p", "TASK-SCHEDULER-REGULAR-TIME-INTERVAL-EXPRESSION-P", 1, 0, false);
        declareFunction("well_formed_regular_time_interval_expressionP", "WELL-FORMED-REGULAR-TIME-INTERVAL-EXPRESSION?", 1, 0, false);
        declareFunction("valid_time_or_date_pattern_keywordsP", "VALID-TIME-OR-DATE-PATTERN-KEYWORDS?", 3, 0, false);
        declareFunction("task_scheduler_date_pattern_expression_p", "TASK-SCHEDULER-DATE-PATTERN-EXPRESSION-P", 1, 1, false);
        declareFunction("well_formed_date_pattern_expressionP", "WELL-FORMED-DATE-PATTERN-EXPRESSION?", 2, 0, false);
        declareFunction("well_formed_day_expressionP", "WELL-FORMED-DAY-EXPRESSION?", 1, 0, false);
        declareFunction("well_formed_month_expressionP", "WELL-FORMED-MONTH-EXPRESSION?", 1, 0, false);
        declareFunction("well_formed_year_expressionP", "WELL-FORMED-YEAR-EXPRESSION?", 1, 0, false);
        declareFunction("well_formed_day_of_week_expressionP", "WELL-FORMED-DAY-OF-WEEK-EXPRESSION?", 1, 0, false);
        declareFunction("well_formed_day_of_week_expression_intP", "WELL-FORMED-DAY-OF-WEEK-EXPRESSION-INT?", 1, 0, false);
        declareFunction("task_scheduler_time_pattern_expression_p", "TASK-SCHEDULER-TIME-PATTERN-EXPRESSION-P", 1, 1, false);
        declareFunction("well_formed_time_pattern_expressionP", "WELL-FORMED-TIME-PATTERN-EXPRESSION?", 2, 0, false);
        declareFunction("well_formed_second_expressionP", "WELL-FORMED-SECOND-EXPRESSION?", 1, 0, false);
        declareFunction("well_formed_minute_expressionP", "WELL-FORMED-MINUTE-EXPRESSION?", 1, 0, false);
        declareFunction("well_formed_hour_expressionP", "WELL-FORMED-HOUR-EXPRESSION?", 1, 0, false);
        declareFunction("integer_within_intervalP", "INTEGER-WITHIN-INTERVAL?", 3, 0, false);
        declareFunction("schedule_new_task", "SCHEDULE-NEW-TASK", 5, 2, false);
        declareFunction("schedule_new_task_int", "SCHEDULE-NEW-TASK-INT", 6, 0, false);
        declareFunction("task_is_likely_to_run_oftenP", "TASK-IS-LIKELY-TO-RUN-OFTEN?", 2, 0, false);
        declareFunction("time_pattern_contains_intervals_or_listsP", "TIME-PATTERN-CONTAINS-INTERVALS-OR-LISTS?", 1, 0, false);
        declareFunction("inform_user_of_performance_time", "INFORM-USER-OF-PERFORMANCE-TIME", 3, 0, false);
        declareFunction("inform_user_of_performance_time_int", "INFORM-USER-OF-PERFORMANCE-TIME-INT", 4, 0, false);
        declareFunction("make_progress_string_for_universal_time", "MAKE-PROGRESS-STRING-FOR-UNIVERSAL-TIME", 1, 0, false);
        declareFunction("replace_progress_assertion", "REPLACE-PROGRESS-ASSERTION", 3, 0, false);
        declareFunction("declare_task_scheduler_process", "DECLARE-TASK-SCHEDULER-PROCESS", 3, 0, false);
        declareFunction("new_task_scheduler_process", "NEW-TASK-SCHEDULER-PROCESS", 3, 0, false);
        declareFunction("make_task_scheduler_process_name", "MAKE-TASK-SCHEDULER-PROCESS-NAME", 1, 0, false);
        declareFunction("task_scheduler_process", "TASK-SCHEDULER-PROCESS", 3, 0, false);
        declareFunction("perform_scheduled_task", "PERFORM-SCHEDULED-TASK", 2, 0, false);
        declareFunction("undeclare_task_scheduler_process", "UNDECLARE-TASK-SCHEDULER-PROCESS", 1, 0, false);
        declareFunction("create_task_scheduler_main_process", "CREATE-TASK-SCHEDULER-MAIN-PROCESS", 0, 0, false);
        declareFunction("create_task_scheduler_main_process_int", "CREATE-TASK-SCHEDULER-MAIN-PROCESS-INT", 0, 0, false);
        declareFunction("get_task_scheduler_main_process", "GET-TASK-SCHEDULER-MAIN-PROCESS", 1, 0, false);
        declareFunction("undeclare_task_scheduler_main_process", "UNDECLARE-TASK-SCHEDULER-MAIN-PROCESS", 1, 0, false);
        declareFunction("task_scheduler_main_processP", "TASK-SCHEDULER-MAIN-PROCESS?", 2, 0, false);
        declareFunction("declare_new_task_for_task_scheduler_main_process", "DECLARE-NEW-TASK-FOR-TASK-SCHEDULER-MAIN-PROCESS", 2, 0, false);
        declareFunction("interrupt_main_process_to_check_next_in_task_list", "INTERRUPT-MAIN-PROCESS-TO-CHECK-NEXT-IN-TASK-LIST", 1, 0, false);
        declareFunction("check_next_in_main_process_task_list", "CHECK-NEXT-IN-MAIN-PROCESS-TASK-LIST", 1, 0, false);
        declareFunction("handle_next_task_in_main_process_task_list", "HANDLE-NEXT-TASK-IN-MAIN-PROCESS-TASK-LIST", 3, 0, false);
        declareFunction("create_process_to_perform_scheduled_task", "CREATE-PROCESS-TO-PERFORM-SCHEDULED-TASK", 2, 0, false);
        declareFunction("get_next_task_name_in_main_process_task_list", "GET-NEXT-TASK-NAME-IN-MAIN-PROCESS-TASK-LIST", 1, 0, false);
        declareFunction("add_new_task_to_main_process_task_list", "ADD-NEW-TASK-TO-MAIN-PROCESS-TASK-LIST", 2, 0, false);
        declareFunction("add_new_task_to_main_process_task_list_int", "ADD-NEW-TASK-TO-MAIN-PROCESS-TASK-LIST-INT", 2, 0, false);
        declareFunction("get_next_scheduled_time_for_task_scheduler_task_name", "GET-NEXT-SCHEDULED-TIME-FOR-TASK-SCHEDULER-TASK-NAME", 1, 0, false);
        declareFunction("remove_next_task_in_main_process_task_list", "REMOVE-NEXT-TASK-IN-MAIN-PROCESS-TASK-LIST", 1, 0, false);
        declareFunction("undeclare_task_for_task_scheduler_main_process", "UNDECLARE-TASK-FOR-TASK-SCHEDULER-MAIN-PROCESS", 2, 0, false);
        declareFunction("remove_task_from_task_scheduler_main_process_task_list", "REMOVE-TASK-FROM-TASK-SCHEDULER-MAIN-PROCESS-TASK-LIST", 2, 0, false);
        declareFunction("remove_task_from_task_scheduler_main_process_task_list_int", "REMOVE-TASK-FROM-TASK-SCHEDULER-MAIN-PROCESS-TASK-LIST-INT", 2, 0, false);
        declareFunction("process_asleepP", "PROCESS-ASLEEP?", 1, 0, false);
        declareFunction("compute_next_scheduled_universal_time_for_task", "COMPUTE-NEXT-SCHEDULED-UNIVERSAL-TIME-FOR-TASK", 3, 1, false);
        declareFunction("universal_time_satisfies_time_and_date_patternsP", "UNIVERSAL-TIME-SATISFIES-TIME-AND-DATE-PATTERNS?", 2, 1, false);
        declareFunction("compute_next_scheduled_universal_time", "COMPUTE-NEXT-SCHEDULED-UNIVERSAL-TIME", 2, 1, false);
        declareFunction("compute_next_universal_time_satisfying_time_pattern", "COMPUTE-NEXT-UNIVERSAL-TIME-SATISFYING-TIME-PATTERN", 1, 1, false);
        declareFunction("decode_time_pattern", "DECODE-TIME-PATTERN", 1, 0, false);
        declareFunction("universal_time_satisfies_time_patternP", "UNIVERSAL-TIME-SATISFIES-TIME-PATTERN?", 4, 0, false);
        declareFunction("time_satisfies_time_patternP", "TIME-SATISFIES-TIME-PATTERN?", 6, 0, false);
        declareFunction("satisfying_time_componentP", "SATISFYING-TIME-COMPONENT?", 2, 0, false);
        declareFunction("compute_next_universal_time_satisfying_time_pattern_int", "COMPUTE-NEXT-UNIVERSAL-TIME-SATISFYING-TIME-PATTERN-INT", 3, 1, false);
        declareFunction("get_next_universal_time_satisfying_time_pattern", "GET-NEXT-UNIVERSAL-TIME-SATISFYING-TIME-PATTERN", 3, 1, false);
        declareFunction("get_next_time_component_satisfying_time_pattern", "GET-NEXT-TIME-COMPONENT-SATISFYING-TIME-PATTERN", 2, 0, false);
        declareFunction("increment_second", "INCREMENT-SECOND", 1, 0, false);
        declareFunction("increment_minute", "INCREMENT-MINUTE", 1, 0, false);
        declareFunction("increment_hour", "INCREMENT-HOUR", 1, 0, false);
        declareFunction("compute_next_universal_date_satisfying_date_pattern", "COMPUTE-NEXT-UNIVERSAL-DATE-SATISFYING-DATE-PATTERN", 1, 1, false);
        declareFunction("compute_next_universal_time_satisfying_time_and_date_patterns", "COMPUTE-NEXT-UNIVERSAL-TIME-SATISFYING-TIME-AND-DATE-PATTERNS", 3, 0, false);
        declareFunction("decode_date_pattern", "DECODE-DATE-PATTERN", 1, 0, false);
        declareFunction("compute_next_universal_date_satisfying_date_pattern_int", "COMPUTE-NEXT-UNIVERSAL-DATE-SATISFYING-DATE-PATTERN-INT", 4, 1, false);
        declareFunction("get_next_universal_date_satisfying_date_pattern", "GET-NEXT-UNIVERSAL-DATE-SATISFYING-DATE-PATTERN", 4, 1, false);
        declareFunction("get_next_date_component_satisfying_date_pattern", "GET-NEXT-DATE-COMPONENT-SATISFYING-DATE-PATTERN", 2, 0, false);
        declareFunction("increment_day", "INCREMENT-DAY", 3, 0, false);
        declareFunction("increment_month", "INCREMENT-MONTH", 1, 0, false);
        declareFunction("increment_year", "INCREMENT-YEAR", 1, 0, false);
        declareFunction("universal_date_satisfies_date_patternP", "UNIVERSAL-DATE-SATISFIES-DATE-PATTERN?", 5, 0, false);
        declareFunction("date_satisfies_date_patternP", "DATE-SATISFIES-DATE-PATTERN?", 8, 0, false);
        declareFunction("satisfying_day_of_weekP", "SATISFYING-DAY-OF-WEEK?", 2, 0, false);
        declareFunction("get_next_universal_date_satisfying_day_of_week_pattern", "GET-NEXT-UNIVERSAL-DATE-SATISFYING-DAY-OF-WEEK-PATTERN", 1, 1, false);
        declareFunction("is_day_of_week_pattern_a_day_of_week_intervalP", "IS-DAY-OF-WEEK-PATTERN-A-DAY-OF-WEEK-INTERVAL?", 1, 0, false);
        declareFunction("is_day_of_week_pattern_a_day_of_week_listP", "IS-DAY-OF-WEEK-PATTERN-A-DAY-OF-WEEK-LIST?", 1, 0, false);
        declareFunction("satisfying_time_or_date_componentP", "SATISFYING-TIME-OR-DATE-COMPONENT?", 2, 0, false);
        declareFunction("time_or_date_component_interval_p", "TIME-OR-DATE-COMPONENT-INTERVAL-P", 1, 0, false);
        declareFunction("first_in_time_or_date_component_interval", "FIRST-IN-TIME-OR-DATE-COMPONENT-INTERVAL", 1, 0, false);
        declareFunction("last_in_time_or_date_component_interval", "LAST-IN-TIME-OR-DATE-COMPONENT-INTERVAL", 1, 0, false);
        declareFunction("make_time_or_date_component_interval", "MAKE-TIME-OR-DATE-COMPONENT-INTERVAL", 2, 0, false);
        declareFunction("time_or_date_component_is_within_specified_intervalP", "TIME-OR-DATE-COMPONENT-IS-WITHIN-SPECIFIED-INTERVAL?", 2, 0, false);
        declareFunction("time_or_date_component_list_p", "TIME-OR-DATE-COMPONENT-LIST-P", 1, 0, false);
        declareFunction("make_time_or_date_component_list", "MAKE-TIME-OR-DATE-COMPONENT-LIST", 1, 0, false);
        declareFunction("time_or_date_component_list_items", "TIME-OR-DATE-COMPONENT-LIST-ITEMS", 1, 0, false);
        declareFunction("time_or_date_component_is_within_specified_listP", "TIME-OR-DATE-COMPONENT-IS-WITHIN-SPECIFIED-LIST?", 2, 0, false);
        declareFunction("get_next_time_or_date_component_satisfying_pattern", "GET-NEXT-TIME-OR-DATE-COMPONENT-SATISFYING-PATTERN", 2, 0, false);
        declareFunction("closest_in_time_or_date_component_list", "CLOSEST-IN-TIME-OR-DATE-COMPONENT-LIST", 2, 0, false);
        declareFunction("time_or_date_component_interval_or_list_p", "TIME-OR-DATE-COMPONENT-INTERVAL-OR-LIST-P", 1, 0, false);
        declareFunction("convert_regular_time_interval_to_seconds", "CONVERT-REGULAR-TIME-INTERVAL-TO-SECONDS", 1, 0, false);
        declareFunction("is_weekdayP", "IS-WEEKDAY?", 0, 1, false);
        declareFunction("is_non_weekdayP", "IS-NON-WEEKDAY?", 0, 1, false);
        declareFunction("day_of_week_interval_p", "DAY-OF-WEEK-INTERVAL-P", 1, 0, false);
        declareFunction("make_day_of_week_interval", "MAKE-DAY-OF-WEEK-INTERVAL", 2, 0, false);
        declareFunction("first_day_in_interval", "FIRST-DAY-IN-INTERVAL", 1, 0, false);
        declareFunction("last_day_in_interval", "LAST-DAY-IN-INTERVAL", 1, 0, false);
        declareFunction("is_day_within_day_of_week_intervalP", "IS-DAY-WITHIN-DAY-OF-WEEK-INTERVAL?", 1, 1, false);
        declareFunction("day_of_week_list_p", "DAY-OF-WEEK-LIST-P", 1, 0, false);
        declareFunction("make_day_of_week_list", "MAKE-DAY-OF-WEEK-LIST", 1, 0, false);
        declareFunction("day_of_week_list_items", "DAY-OF-WEEK-LIST-ITEMS", 1, 0, false);
        declareFunction("is_day_within_day_of_week_listP", "IS-DAY-WITHIN-DAY-OF-WEEK-LIST?", 1, 1, false);
        declareFunction("is_day_the_given_day_of_weekP", "IS-DAY-THE-GIVEN-DAY-OF-WEEK?", 1, 1, false);
        declareFunction("is_universal_date_the_given_day_of_weekP", "IS-UNIVERSAL-DATE-THE-GIVEN-DAY-OF-WEEK?", 1, 1, false);
        declareFunction("encode_a_sample_universal_time_for_universal_date", "ENCODE-A-SAMPLE-UNIVERSAL-TIME-FOR-UNIVERSAL-DATE", 1, 0, false);
        declareFunction("what_day_of_week_is_universal_date", "WHAT-DAY-OF-WEEK-IS-UNIVERSAL-DATE", 0, 1, false);
        declareFunction("get_year_from_universal_date", "GET-YEAR-FROM-UNIVERSAL-DATE", 0, 1, false);
        declareFunction("get_year_with_day_and_month_upcoming", "GET-YEAR-WITH-DAY-AND-MONTH-UPCOMING", 2, 1, false);
        declareFunction("valid_day_and_month_combinationP", "VALID-DAY-AND-MONTH-COMBINATION?", 2, 0, false);
        declareFunction("get_month_and_year_with_day_upcoming", "GET-MONTH-AND-YEAR-WITH-DAY-UPCOMING", 1, 1, false);
        declareFunction("next_month_and_year", "NEXT-MONTH-AND-YEAR", 2, 0, false);
        declareFunction("get_next_universal_date_within_day_of_week_interval", "GET-NEXT-UNIVERSAL-DATE-WITHIN-DAY-OF-WEEK-INTERVAL", 1, 1, false);
        declareFunction("get_next_universal_date_within_day_of_week_list", "GET-NEXT-UNIVERSAL-DATE-WITHIN-DAY-OF-WEEK-LIST", 1, 1, false);
        declareFunction("increment_universal_date", "INCREMENT-UNIVERSAL-DATE", 0, 2, false);
        declareFunction("increment_universal_second", "INCREMENT-UNIVERSAL-SECOND", 0, 2, false);
        declareFunction("increment_universal_time", "INCREMENT-UNIVERSAL-TIME", 0, 2, false);
        declareFunction("get_universal_date_for_next_weekday", "GET-UNIVERSAL-DATE-FOR-NEXT-WEEKDAY", 0, 1, false);
        declareFunction("get_universal_date_for_next_non_weekday", "GET-UNIVERSAL-DATE-FOR-NEXT-NON-WEEKDAY", 0, 1, false);
        declareFunction("get_universal_date_for_next_given_day_of_week", "GET-UNIVERSAL-DATE-FOR-NEXT-GIVEN-DAY-OF-WEEK", 1, 1, false);
        declareFunction("universal_date_validP", "UNIVERSAL-DATE-VALID?", 1, 0, false);
        declareFunction("date_validP", "DATE-VALID?", 3, 0, false);
        declareFunction("universal_date_yet_to_comeP", "UNIVERSAL-DATE-YET-TO-COME?", 0, 1, false);
        return NIL;
    }

    public static final SubLObject init_task_scheduler_file() {
        deflexical("*CYC-TASK-SCHEDULER-CORE-CONSTANTS*", $list_alt0);
        defconstant("*DTP-TASK-SCHEDULER-TASK*", TASK_SCHEDULER_TASK);
        defconstant("*DTP-TASK-SCHEDULER*", TASK_SCHEDULER);
        deflexical("*CYC-TASK-SCHEDULER*", NIL != boundp($cyc_task_scheduler$) ? ((SubLObject) ($cyc_task_scheduler$.getGlobalValue())) : NIL);
        deflexical("*CYC-TASK-SCHEDULER-TASK-DESCRIPTION-PREDICATE-P-CACHING-STATE*", NIL);
        defparameter("*TASK-SCHEDULER-TRACE-LEVEL*", ONE_INTEGER);
        deflexical("*DAY-OF-WEEK-CONSTANT-TABLE*", $list_alt95);
        deflexical("*TASK-REGULAR-TIME-INTERVAL-UNITS-OF-TIME*", $list_alt99);
        deflexical("*TASK-SCHEDULER-DATE-PATTERN-KEYWORDS*", $list_alt101);
        deflexical("*TASK-SCHEDULER-TIME-PATTERN-KEYWORDS*", $list_alt102);
        defparameter("*INTERRUPTED-WHILE-ASLEEP?*", NIL);
        defparameter("*TEMPORARY-TASK-SCHEDULER-TO-ADD-NEW-TASK-TO-MAIN-PROCESS-TASK-LIST*", NIL);
        return NIL;
    }

    public static final SubLObject setup_task_scheduler_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_task_scheduler_task$.getGlobalValue(), symbol_function(TASK_SCHEDULER_TASK_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TST_PROCESS, _CSETF_TST_PROCESS);
        def_csetf(TST_NEXT_SCHEDULED_TIME, _CSETF_TST_NEXT_SCHEDULED_TIME);
        def_csetf(TST_EXPRESSION, _CSETF_TST_EXPRESSION);
        def_csetf(TST_RESULT, _CSETF_TST_RESULT);
        def_csetf(TST_REGULAR_TIME_INTERVAL, _CSETF_TST_REGULAR_TIME_INTERVAL);
        def_csetf(TST_TIME_PATTERN, _CSETF_TST_TIME_PATTERN);
        def_csetf(TST_DATE_PATTERN, _CSETF_TST_DATE_PATTERN);
        identity(TASK_SCHEDULER_TASK);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_task_scheduler$.getGlobalValue(), symbol_function(TASK_SCHEDULER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TS_TASK_TABLE, _CSETF_TS_TASK_TABLE);
        def_csetf(TS_TASK_TABLE_LOCK, _CSETF_TS_TASK_TABLE_LOCK);
        def_csetf(TS_MAIN_PROCESS, _CSETF_TS_MAIN_PROCESS);
        def_csetf(TS_MAIN_PROCESS_TASK_LIST, _CSETF_TS_MAIN_PROCESS_TASK_LIST);
        def_csetf(TS_MAIN_PROCESS_TASK_LIST_LOCK, _CSETF_TS_MAIN_PROCESS_TASK_LIST_LOCK);
        identity(TASK_SCHEDULER);
        subl_macro_promotions.declare_defglobal($cyc_task_scheduler$);
        memoization_state.note_globally_cached_function(CYC_TASK_SCHEDULER_TASK_DESCRIPTION_PREDICATE_P);
        utilities_macros.register_kb_function(TASK_SCHEDULER_REGULAR_TIME_INTERVAL_EXPRESSION_P);
        utilities_macros.register_kb_function(TASK_SCHEDULER_DATE_PATTERN_EXPRESSION_P);
        utilities_macros.register_kb_function(TASK_SCHEDULER_TIME_PATTERN_EXPRESSION_P);
        return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(new SubLObject[]{ constant_handles.reader_make_constant_shell(makeString("SecondsDuration")), constant_handles.reader_make_constant_shell(makeString("MinutesDuration")), constant_handles.reader_make_constant_shell(makeString("HoursDuration")), constant_handles.reader_make_constant_shell(makeString("DaysDuration")), constant_handles.reader_make_constant_shell(makeString("MonthOfYearType")), constant_handles.reader_make_constant_shell(makeString("DayOfWeekType")), constant_handles.reader_make_constant_shell(makeString("Monday")), constant_handles.reader_make_constant_shell(makeString("Tuesday")), constant_handles.reader_make_constant_shell(makeString("Wednesday")), constant_handles.reader_make_constant_shell(makeString("Thursday")), constant_handles.reader_make_constant_shell(makeString("Friday")), constant_handles.reader_make_constant_shell(makeString("Saturday")), constant_handles.reader_make_constant_shell(makeString("Sunday")), constant_handles.reader_make_constant_shell(makeString("January")), constant_handles.reader_make_constant_shell(makeString("February")), constant_handles.reader_make_constant_shell(makeString("March")), constant_handles.reader_make_constant_shell(makeString("April")), constant_handles.reader_make_constant_shell(makeString("May")), constant_handles.reader_make_constant_shell(makeString("June")), constant_handles.reader_make_constant_shell(makeString("July")), constant_handles.reader_make_constant_shell(makeString("August")), constant_handles.reader_make_constant_shell(makeString("September")), constant_handles.reader_make_constant_shell(makeString("October")), constant_handles.reader_make_constant_shell(makeString("November")), constant_handles.reader_make_constant_shell(makeString("December")), constant_handles.reader_make_constant_shell(makeString("TheList")), constant_handles.reader_make_constant_shell(makeString("CycTaskSchedulerTask")), constant_handles.reader_make_constant_shell(makeString("TaskSchedulerPatternPropertyIntervalFn")), constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskUser")), constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskExpression")), constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskLastPerformanceTime")), constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskLastPerformanceDate")), constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskNextPerformanceTime")), constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskNextPerformanceDate")), constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskRegularTimeInterval")), constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskDatePattern")), constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskTimePattern")) });

    static private final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLSymbol TASK_SCHEDULER_TASK = makeSymbol("TASK-SCHEDULER-TASK");

    private static final SubLSymbol TASK_SCHEDULER_TASK_P = makeSymbol("TASK-SCHEDULER-TASK-P");

    static private final SubLList $list_alt4 = list(makeSymbol("PROCESS"), makeSymbol("NEXT-SCHEDULED-TIME"), makeSymbol("EXPRESSION"), makeSymbol("RESULT"), makeSymbol("REGULAR-TIME-INTERVAL"), makeSymbol("TIME-PATTERN"), makeSymbol("DATE-PATTERN"));

    static private final SubLList $list_alt5 = list(makeKeyword("PROCESS"), makeKeyword("NEXT-SCHEDULED-TIME"), makeKeyword("EXPRESSION"), makeKeyword("RESULT"), makeKeyword("REGULAR-TIME-INTERVAL"), makeKeyword("TIME-PATTERN"), makeKeyword("DATE-PATTERN"));

    static private final SubLList $list_alt6 = list(makeSymbol("TST-PROCESS"), makeSymbol("TST-NEXT-SCHEDULED-TIME"), makeSymbol("TST-EXPRESSION"), makeSymbol("TST-RESULT"), makeSymbol("TST-REGULAR-TIME-INTERVAL"), makeSymbol("TST-TIME-PATTERN"), makeSymbol("TST-DATE-PATTERN"));

    static private final SubLList $list_alt7 = list(makeSymbol("_CSETF-TST-PROCESS"), makeSymbol("_CSETF-TST-NEXT-SCHEDULED-TIME"), makeSymbol("_CSETF-TST-EXPRESSION"), makeSymbol("_CSETF-TST-RESULT"), makeSymbol("_CSETF-TST-REGULAR-TIME-INTERVAL"), makeSymbol("_CSETF-TST-TIME-PATTERN"), makeSymbol("_CSETF-TST-DATE-PATTERN"));

    private static final SubLSymbol PRINT_TASK_SCHEDULER_TASK = makeSymbol("PRINT-TASK-SCHEDULER-TASK");

    private static final SubLSymbol TASK_SCHEDULER_TASK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-SCHEDULER-TASK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol TST_PROCESS = makeSymbol("TST-PROCESS");

    public static final SubLSymbol _CSETF_TST_PROCESS = makeSymbol("_CSETF-TST-PROCESS");

    private static final SubLSymbol TST_NEXT_SCHEDULED_TIME = makeSymbol("TST-NEXT-SCHEDULED-TIME");

    public static final SubLSymbol _CSETF_TST_NEXT_SCHEDULED_TIME = makeSymbol("_CSETF-TST-NEXT-SCHEDULED-TIME");

    private static final SubLSymbol TST_EXPRESSION = makeSymbol("TST-EXPRESSION");

    public static final SubLSymbol _CSETF_TST_EXPRESSION = makeSymbol("_CSETF-TST-EXPRESSION");

    private static final SubLSymbol TST_RESULT = makeSymbol("TST-RESULT");

    public static final SubLSymbol _CSETF_TST_RESULT = makeSymbol("_CSETF-TST-RESULT");

    private static final SubLSymbol TST_REGULAR_TIME_INTERVAL = makeSymbol("TST-REGULAR-TIME-INTERVAL");

    public static final SubLSymbol _CSETF_TST_REGULAR_TIME_INTERVAL = makeSymbol("_CSETF-TST-REGULAR-TIME-INTERVAL");

    private static final SubLSymbol TST_TIME_PATTERN = makeSymbol("TST-TIME-PATTERN");

    public static final SubLSymbol _CSETF_TST_TIME_PATTERN = makeSymbol("_CSETF-TST-TIME-PATTERN");

    private static final SubLSymbol TST_DATE_PATTERN = makeSymbol("TST-DATE-PATTERN");

    public static final SubLSymbol _CSETF_TST_DATE_PATTERN = makeSymbol("_CSETF-TST-DATE-PATTERN");



    private static final SubLSymbol $NEXT_SCHEDULED_TIME = makeKeyword("NEXT-SCHEDULED-TIME");





    private static final SubLSymbol $REGULAR_TIME_INTERVAL = makeKeyword("REGULAR-TIME-INTERVAL");

    private static final SubLSymbol $TIME_PATTERN = makeKeyword("TIME-PATTERN");

    private static final SubLSymbol $DATE_PATTERN = makeKeyword("DATE-PATTERN");

    static private final SubLString $str_alt31$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt32$__TASK_SCHEDULER_TASK__s__s__s__s = makeString("#<TASK-SCHEDULER-TASK:~s:~s:~s:~s:~s:~s:~s");

    static private final SubLString $str_alt33$__The_result_of_performing_the_ta = makeString("~%The result of performing the task ~A was ~A.~%");

    public static final SubLObject $const34$taskSchedulerTaskLastPerformanceR = constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskLastPerformanceResult"));

    private static final SubLSymbol TASK_SCHEDULER = makeSymbol("TASK-SCHEDULER");

    private static final SubLSymbol TASK_SCHEDULER_P = makeSymbol("TASK-SCHEDULER-P");

    static private final SubLList $list_alt37 = list(makeSymbol("TASK-TABLE"), makeSymbol("TASK-TABLE-LOCK"), makeSymbol("MAIN-PROCESS"), makeSymbol("MAIN-PROCESS-TASK-LIST"), makeSymbol("MAIN-PROCESS-TASK-LIST-LOCK"));

    static private final SubLList $list_alt38 = list(makeKeyword("TASK-TABLE"), makeKeyword("TASK-TABLE-LOCK"), makeKeyword("MAIN-PROCESS"), makeKeyword("MAIN-PROCESS-TASK-LIST"), makeKeyword("MAIN-PROCESS-TASK-LIST-LOCK"));

    static private final SubLList $list_alt39 = list(makeSymbol("TS-TASK-TABLE"), makeSymbol("TS-TASK-TABLE-LOCK"), makeSymbol("TS-MAIN-PROCESS"), makeSymbol("TS-MAIN-PROCESS-TASK-LIST"), makeSymbol("TS-MAIN-PROCESS-TASK-LIST-LOCK"));

    static private final SubLList $list_alt40 = list(makeSymbol("_CSETF-TS-TASK-TABLE"), makeSymbol("_CSETF-TS-TASK-TABLE-LOCK"), makeSymbol("_CSETF-TS-MAIN-PROCESS"), makeSymbol("_CSETF-TS-MAIN-PROCESS-TASK-LIST"), makeSymbol("_CSETF-TS-MAIN-PROCESS-TASK-LIST-LOCK"));

    private static final SubLSymbol PRINT_TASK_SCHEDULER = makeSymbol("PRINT-TASK-SCHEDULER");

    private static final SubLSymbol TASK_SCHEDULER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-SCHEDULER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol TS_TASK_TABLE = makeSymbol("TS-TASK-TABLE");

    public static final SubLSymbol _CSETF_TS_TASK_TABLE = makeSymbol("_CSETF-TS-TASK-TABLE");

    private static final SubLSymbol TS_TASK_TABLE_LOCK = makeSymbol("TS-TASK-TABLE-LOCK");

    public static final SubLSymbol _CSETF_TS_TASK_TABLE_LOCK = makeSymbol("_CSETF-TS-TASK-TABLE-LOCK");

    private static final SubLSymbol TS_MAIN_PROCESS = makeSymbol("TS-MAIN-PROCESS");

    public static final SubLSymbol _CSETF_TS_MAIN_PROCESS = makeSymbol("_CSETF-TS-MAIN-PROCESS");

    private static final SubLSymbol TS_MAIN_PROCESS_TASK_LIST = makeSymbol("TS-MAIN-PROCESS-TASK-LIST");

    public static final SubLSymbol _CSETF_TS_MAIN_PROCESS_TASK_LIST = makeSymbol("_CSETF-TS-MAIN-PROCESS-TASK-LIST");

    private static final SubLSymbol TS_MAIN_PROCESS_TASK_LIST_LOCK = makeSymbol("TS-MAIN-PROCESS-TASK-LIST-LOCK");

    public static final SubLSymbol _CSETF_TS_MAIN_PROCESS_TASK_LIST_LOCK = makeSymbol("_CSETF-TS-MAIN-PROCESS-TASK-LIST-LOCK");

    private static final SubLSymbol $TASK_TABLE = makeKeyword("TASK-TABLE");

    private static final SubLSymbol $TASK_TABLE_LOCK = makeKeyword("TASK-TABLE-LOCK");

    private static final SubLSymbol $MAIN_PROCESS = makeKeyword("MAIN-PROCESS");

    private static final SubLSymbol $MAIN_PROCESS_TASK_LIST = makeKeyword("MAIN-PROCESS-TASK-LIST");

    private static final SubLSymbol $MAIN_PROCESS_TASK_LIST_LOCK = makeKeyword("MAIN-PROCESS-TASK-LIST-LOCK");

    static private final SubLString $str_alt58$__TASK_SCHEDULER__s__s__s__s__s = makeString("#<TASK-SCHEDULER:~s:~s:~s:~s:~s");

    static private final SubLString $$$Task_Scheduler_Task_Table_Lock = makeString("Task Scheduler Task Table Lock");

    static private final SubLString $str_alt60$Task_Scheduler_Main_Process_Task_ = makeString("Task Scheduler Main Process Task List Lock");

    static private final SubLList $list_alt61 = list(list(makeSymbol("TASK-NAME"), makeSymbol("TASK-OBJECT"), makeSymbol("TASK-SCHEDULER"), makeSymbol("&KEY"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt62 = list(makeKeyword("DONE?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    static private final SubLSymbol $sym65$TASK_TABLE = makeUninternedSymbol("TASK-TABLE");



    private static final SubLSymbol TASK_SCHEDULER_TASK_TABLE_LOCK = makeSymbol("TASK-SCHEDULER-TASK-TABLE-LOCK");



    private static final SubLSymbol TASK_SCHEDULER_TASK_TABLE = makeSymbol("TASK-SCHEDULER-TASK-TABLE");



    public static final SubLSymbol $cyc_task_scheduler$ = makeSymbol("*CYC-TASK-SCHEDULER*");

    private static final SubLSymbol CYC_TASK_SCHEDULER_TASK_DESCRIPTION_PREDICATE_P = makeSymbol("CYC-TASK-SCHEDULER-TASK-DESCRIPTION-PREDICATE-P");

    public static final SubLObject $const73$CycTaskSchedulerTaskDescriptionPr = constant_handles.reader_make_constant_shell(makeString("CycTaskSchedulerTaskDescriptionPredicate"));

    public static final SubLSymbol $cyc_task_scheduler_task_description_predicate_p_caching_state$ = makeSymbol("*CYC-TASK-SCHEDULER-TASK-DESCRIPTION-PREDICATE-P-CACHING-STATE*");

    public static final SubLSymbol $kw75$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");



    public static final SubLObject $$EverythingPSC = constant_handles.reader_make_constant_shell(makeString("EverythingPSC"));

    public static final SubLObject $const78$taskSchedulerTaskRegularTimeInter = constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskRegularTimeInterval"));

    public static final SubLObject $$taskSchedulerTaskTimePattern = constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskTimePattern"));

    public static final SubLObject $$taskSchedulerTaskDatePattern = constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskDatePattern"));

    static private final SubLSymbol $sym81$TASK_NEXT_SCHEDULED_TIME_ = makeSymbol("TASK-NEXT-SCHEDULED-TIME<");

    static private final SubLString $str_alt82$You_currently_have__A_tasks_sched = makeString("You currently have ~A tasks scheduled in your image.~%");

    static private final SubLString $str_alt83$You_currently_have_no_tasks_sched = makeString("You currently have no tasks scheduled in your image.~%");

    static private final SubLList $list_alt84 = cons(makeSymbol("TASK-NAME"), makeSymbol("TASK-OBJECT"));

    static private final SubLString $str_alt85$__The_task__A_will_next_be_perfor = makeString("~%The task ~A will next be performed ~A.~%");

    static private final SubLString $str_alt86$The_Task_Scheduler_is_not_availab = makeString("The Task Scheduler is not available in the current image.");

    static private final SubLString $str_alt87$The_portion_of_the_Cyc_KB_used_by = makeString("The portion of the Cyc KB used by the Task Scheduler is not available in the current image.");

    public static final SubLObject $$Guest = constant_handles.reader_make_constant_shell(makeString("Guest"));

    public static final SubLObject $$taskSchedulerTaskUser = constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskUser"));

    public static final SubLObject $$taskSchedulerTaskExpression = constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskExpression"));

    public static final SubLObject $$ExpandSubLFn = constant_handles.reader_make_constant_shell(makeString("ExpandSubLFn"));

    public static final SubLObject $$SubLQuoteFn = constant_handles.reader_make_constant_shell(makeString("SubLQuoteFn"));



    private static final SubLSymbol CONVERT_MONTH_PATTERN = makeSymbol("CONVERT-MONTH-PATTERN");

    static private final SubLList $list_alt95 = list(constant_handles.reader_make_constant_shell(makeString("Monday")), constant_handles.reader_make_constant_shell(makeString("Tuesday")), constant_handles.reader_make_constant_shell(makeString("Wednesday")), constant_handles.reader_make_constant_shell(makeString("Thursday")), constant_handles.reader_make_constant_shell(makeString("Friday")), constant_handles.reader_make_constant_shell(makeString("Saturday")), constant_handles.reader_make_constant_shell(makeString("Sunday")));

    private static final SubLSymbol $DAY_OF_WEEK = makeKeyword("DAY-OF-WEEK");

    static private final SubLList $list_alt97 = list(makeKeyword("WEEKDAY"), makeKeyword("NON-WEEKDAY"));

    private static final SubLSymbol CONVERT_DAY_OF_WEEK_PATTERN = makeSymbol("CONVERT-DAY-OF-WEEK-PATTERN");

    static private final SubLList $list_alt99 = list(constant_handles.reader_make_constant_shell(makeString("SecondsDuration")), constant_handles.reader_make_constant_shell(makeString("MinutesDuration")), constant_handles.reader_make_constant_shell(makeString("HoursDuration")), constant_handles.reader_make_constant_shell(makeString("DaysDuration")));

    private static final SubLSymbol TASK_SCHEDULER_REGULAR_TIME_INTERVAL_EXPRESSION_P = makeSymbol("TASK-SCHEDULER-REGULAR-TIME-INTERVAL-EXPRESSION-P");

    static private final SubLList $list_alt101 = list(makeKeyword("DAY"), makeKeyword("MONTH"), $YEAR, makeKeyword("DAY-OF-WEEK"));

    static private final SubLList $list_alt102 = list(makeKeyword("SECOND"), makeKeyword("MINUTE"), $HOUR);

    static private final SubLString $str_alt103$__Found_an_invalid_identifier_key = makeString("~%Found an invalid identifier keyword in pattern: ~s~%The only keywords allowed are:~%~s~%");

    private static final SubLSymbol TASK_SCHEDULER_DATE_PATTERN_EXPRESSION_P = makeSymbol("TASK-SCHEDULER-DATE-PATTERN-EXPRESSION-P");

    public static final SubLInteger $int$31 = makeInteger(31);

    static private final SubLSymbol $sym106$WELL_FORMED_DAY_EXPRESSION_ = makeSymbol("WELL-FORMED-DAY-EXPRESSION?");

    public static final SubLObject $$MonthOfYearType = constant_handles.reader_make_constant_shell(makeString("MonthOfYearType"));

    static private final SubLSymbol $sym108$WELL_FORMED_MONTH_EXPRESSION_ = makeSymbol("WELL-FORMED-MONTH-EXPRESSION?");

    static private final SubLSymbol $sym109$WELL_FORMED_YEAR_EXPRESSION_ = makeSymbol("WELL-FORMED-YEAR-EXPRESSION?");

    public static final SubLObject $$DayOfWeekType = constant_handles.reader_make_constant_shell(makeString("DayOfWeekType"));

    static private final SubLSymbol $sym111$WELL_FORMED_DAY_OF_WEEK_EXPRESSION_ = makeSymbol("WELL-FORMED-DAY-OF-WEEK-EXPRESSION?");

    private static final SubLSymbol TASK_SCHEDULER_TIME_PATTERN_EXPRESSION_P = makeSymbol("TASK-SCHEDULER-TIME-PATTERN-EXPRESSION-P");

    public static final SubLInteger $int$59 = makeInteger(59);

    static private final SubLSymbol $sym114$WELL_FORMED_MINUTE_EXPRESSION_ = makeSymbol("WELL-FORMED-MINUTE-EXPRESSION?");

    public static final SubLInteger $int$23 = makeInteger(23);

    static private final SubLSymbol $sym116$WELL_FORMED_HOUR_EXPRESSION_ = makeSymbol("WELL-FORMED-HOUR-EXPRESSION?");

    static private final SubLString $str_alt117$Already_a_task_by_name_NAME__Plea = makeString("Already a task by name NAME. Please try another name.");

    static private final SubLString $str_alt118$The_expression__A_specified_for_t = makeString("The expression ~A specified for task ~A is not well-formed.");

    static private final SubLString $str_alt119$The_regular_time_interval__A_spec = makeString("The regular time interval ~A specified for task ~A is not well-formed.");

    static private final SubLString $str_alt120$The_time_pattern__A_specified_for = makeString("The time pattern ~A specified for task ~A is not well-formed.");

    static private final SubLString $str_alt121$The_date_pattern__A_specified_for = makeString("The date pattern ~A specified for task ~A is not well-formed.");

    static private final SubLString $str_alt122$A_task_scheduler_task_needs_to_ha = makeString("A task scheduler task needs to have at least one of the following specified: \na regular time interval, a time pattern, and/or a date pattern. \nThe given task ~A is missing all of the above.");





    static private final SubLString $str_alt125$__The_task__A_was_last_performed_ = makeString("~%The task ~A was last performed ~A.~%");

    public static final SubLObject $const126$taskSchedulerTaskLastPerformanceT = constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskLastPerformanceTime"));

    public static final SubLObject $const127$taskSchedulerTaskLastPerformanceD = constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskLastPerformanceDate"));

    public static final SubLObject $const128$taskSchedulerTaskNextPerformanceT = constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskNextPerformanceTime"));

    public static final SubLObject $const129$taskSchedulerTaskNextPerformanceD = constant_handles.reader_make_constant_shell(makeString("taskSchedulerTaskNextPerformanceDate"));

    static private final SubLString $str_alt130$on__A__A___A = makeString("on ~A ~A, ~A");

    static private final SubLString $str_alt131$at__2__0d__2__0d__2__0d_ = makeString("at ~2,'0d:~2,'0d:~2,'0d ");



    public static final SubLObject $$BookkeepingMt = constant_handles.reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLSymbol TASK_SCHEDULER_PROCESS = makeSymbol("TASK-SCHEDULER-PROCESS");

    static private final SubLString $str_alt135$Task_Scheduler_Process_ = makeString("Task Scheduler Process ");

    static private final SubLString $$$Task_Scheduler_Main_Process = makeString("Task Scheduler Main Process");

    private static final SubLSymbol CREATE_TASK_SCHEDULER_MAIN_PROCESS_INT = makeSymbol("CREATE-TASK-SCHEDULER-MAIN-PROCESS-INT");

    private static final SubLSymbol CHECK_NEXT_IN_MAIN_PROCESS_TASK_LIST = makeSymbol("CHECK-NEXT-IN-MAIN-PROCESS-TASK-LIST");

    private static final SubLSymbol $SLEEP_INTERRUPTED = makeKeyword("SLEEP-INTERRUPTED");

    private static final SubLSymbol PERFORM_SCHEDULED_TASK = makeSymbol("PERFORM-SCHEDULED-TASK");

    static private final SubLSymbol $sym141$_ = makeSymbol("<");

    private static final SubLSymbol GET_NEXT_SCHEDULED_TIME_FOR_TASK_SCHEDULER_TASK_NAME = makeSymbol("GET-NEXT-SCHEDULED-TIME-FOR-TASK-SCHEDULER-TASK-NAME");

    static private final SubLList $list_alt143 = list(makeString("Sleeping"), makeString("Sleep"), makeString("Blocked"));











    private static final SubLSymbol $WEEKDAY = makeKeyword("WEEKDAY");

    private static final SubLSymbol $NON_WEEKDAY = makeKeyword("NON-WEEKDAY");

    public static final SubLObject $const151$TaskSchedulerPatternPropertyInter = constant_handles.reader_make_constant_shell(makeString("TaskSchedulerPatternPropertyIntervalFn"));

    public static final SubLObject $$TheList = constant_handles.reader_make_constant_shell(makeString("TheList"));

    public static final SubLObject $$SecondsDuration = constant_handles.reader_make_constant_shell(makeString("SecondsDuration"));

    public static final SubLObject $$MinutesDuration = constant_handles.reader_make_constant_shell(makeString("MinutesDuration"));

    public static final SubLObject $$HoursDuration = constant_handles.reader_make_constant_shell(makeString("HoursDuration"));

    public static final SubLObject $$DaysDuration = constant_handles.reader_make_constant_shell(makeString("DaysDuration"));

    static private final SubLSymbol $sym157$IS_DAY_THE_GIVEN_DAY_OF_WEEK_ = makeSymbol("IS-DAY-THE-GIVEN-DAY-OF-WEEK?");









    static private final SubLList $list_alt162 = list(constant_handles.reader_make_constant_shell(makeString("TaskSchedulerPatternPropertyIntervalFn")), ZERO_INTEGER, FOUR_INTEGER);

    static private final SubLList $list_alt163 = list(constant_handles.reader_make_constant_shell(makeString("TaskSchedulerPatternPropertyIntervalFn")), FIVE_INTEGER, SIX_INTEGER);

    // // Initializers
    public void declareFunctions() {
        declare_task_scheduler_file();
    }

    public void initializeVariables() {
        init_task_scheduler_file();
    }

    public void runTopLevelForms() {
        setup_task_scheduler_file();
    }
}

