/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.queues.create_p_queue;
import static com.cyc.cycjava.cycl.queues.p_dequeue;
import static com.cyc.cycjava.cycl.queues.p_enqueue;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_promotions.interrupt_process_with_args;
import static com.cyc.cycjava.cycl.utilities_macros.register_api_predefined_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_macro;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_greater;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_keyword;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_max_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_min_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.all_processes;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.interrupt_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_block;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_unblock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_whostate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.set_process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.lock_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.processp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.streamp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.type_of;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print_not_readable;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.open_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_char;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      TASK-PROCESSOR
 * source file: /cyc/top/cycl/task-processor.lisp
 * created:     2019/07/03 17:37:55
 */
public final class task_processor extends SubLTranslatedFile implements V12 {
    public static final SubLObject verbosity_test_case_p(SubLObject verbosity_test_case) {
        return classes.subloop_instanceof_class(verbosity_test_case, VERBOSITY_TEST_CASE);
    }

    public static final SubLObject task_processor_test_case_p(SubLObject task_processor_test_case) {
        return classes.subloop_instanceof_class(task_processor_test_case, TASK_PROCESSOR_TEST_CASE);
    }

    public static final SubLObject task_info_test_case_p(SubLObject task_info_test_case) {
        return classes.subloop_instanceof_class(task_info_test_case, TASK_INFO_TEST_CASE);
    }

    public static final SubLObject subloop_reserved_initialize_verbosity_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, VERBOSITY_TEST_CASE, P_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_verbosity_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_task_processor_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, TASK_PROCESSOR_TEST_CASE, P_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_task_processor_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_task_info_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, TASK_INFO_TEST_CASE, P_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_task_info_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_eval_with_bindings_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, EVAL_WITH_BINDINGS_TEST_CASE, P_QUEUE, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_eval_with_bindings_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_verbosity_test_case_p_queue(SubLObject verbosity_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(verbosity_test_case, value, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject set_task_processor_test_case_p_queue(SubLObject task_processor_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(task_processor_test_case, value, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject set_task_info_test_case_p_queue(SubLObject task_info_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(task_info_test_case, value, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject set_eval_with_bindings_test_case_p_queue(SubLObject eval_with_bindings_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(eval_with_bindings_test_case, value, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject get_verbosity_test_case_p_queue(SubLObject verbosity_test_case) {
        return classes.subloop_get_access_protected_instance_slot(verbosity_test_case, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject get_task_processor_test_case_p_queue(SubLObject task_processor_test_case) {
        return classes.subloop_get_access_protected_instance_slot(task_processor_test_case, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject get_task_info_test_case_p_queue(SubLObject task_info_test_case) {
        return classes.subloop_get_access_protected_instance_slot(task_info_test_case, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject get_eval_with_bindings_test_case_p_queue(SubLObject eval_with_bindings_test_case) {
        return classes.subloop_get_access_protected_instance_slot(eval_with_bindings_test_case, THREE_INTEGER, P_QUEUE);
    }

    public static final SubLObject eval_with_bindings_test_case_p(SubLObject eval_with_bindings_test_case) {
        return classes.subloop_instanceof_class(eval_with_bindings_test_case, EVAL_WITH_BINDINGS_TEST_CASE);
    }

    static private final SubLString $str_alt255$ = makeString("");

    public static final class $task_result_set_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.task_processor.$task_result_set_native.this.$result;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.task_processor.$task_result_set_native.this.$task_info;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.task_processor.$task_result_set_native.this.$finished;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_result_set_native.this.$result = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_result_set_native.this.$task_info = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_result_set_native.this.$finished = value;
        }

        public SubLObject $result = Lisp.NIL;

        public SubLObject $task_info = Lisp.NIL;

        public SubLObject $finished = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.task_processor.$task_result_set_native.class, TASK_RESULT_SET, TASK_RESULT_SET_P, $list_alt59, $list_alt60, new String[]{ "$result", "$task_info", "$finished" }, $list_alt61, $list_alt62, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $task_processor_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.task_processor.$task_processor_native.this.$name;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.task_processor.$task_processor_native.this.$process;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.task_processor.$task_processor_native.this.$busy_p;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.task_processor.$task_processor_native.this.$task_info;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_processor_native.this.$name = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_processor_native.this.$process = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_processor_native.this.$busy_p = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_processor_native.this.$task_info = value;
        }

        public SubLObject $name = Lisp.NIL;

        public SubLObject $process = Lisp.NIL;

        public SubLObject $busy_p = Lisp.NIL;

        public SubLObject $task_info = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.task_processor.$task_processor_native.class, TASK_PROCESSOR, TASK_PROCESSOR_P, $list_alt77, $list_alt78, new String[]{ "$name", "$process", "$busy_p", "$task_info" }, $list_alt79, $list_alt80, PRINT_TASK_PROCESSOR);
    }

    public static final class $task_process_pool_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$lock;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$request_queue;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$request_semaphore;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$processors;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$background_msgs;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$process_name_prefix;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$min_nbr_of_task_processors;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$max_nbr_of_task_processors;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$lock = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$request_queue = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$request_semaphore = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$processors = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$background_msgs = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$process_name_prefix = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$min_nbr_of_task_processors = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.this.$max_nbr_of_task_processors = value;
        }

        public SubLObject $lock = Lisp.NIL;

        public SubLObject $request_queue = Lisp.NIL;

        public SubLObject $request_semaphore = Lisp.NIL;

        public SubLObject $processors = Lisp.NIL;

        public SubLObject $background_msgs = Lisp.NIL;

        public SubLObject $process_name_prefix = Lisp.NIL;

        public SubLObject $min_nbr_of_task_processors = Lisp.NIL;

        public SubLObject $max_nbr_of_task_processors = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.class, TASK_PROCESS_POOL, TASK_PROCESS_POOL_P, $list_alt101, $list_alt102, new String[]{ "$lock", "$request_queue", "$request_semaphore", "$processors", "$background_msgs", "$process_name_prefix", "$min_nbr_of_task_processors", "$max_nbr_of_task_processors" }, $list_alt103, $list_alt104, PRINT_TASK_PROCESS_POOL);
    }

    public static final class $task_info_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$type;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$id;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$priority;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$requestor;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$giveback_info;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$bindings;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$request;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$response;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$error_message;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$task_processor_name;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$type = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$id = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$priority = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$requestor = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$giveback_info = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$bindings = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$request = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$response = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$error_message = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.task_processor.$task_info_native.this.$task_processor_name = value;
        }

        public SubLObject $type = Lisp.NIL;

        public SubLObject $id = Lisp.NIL;

        public SubLObject $priority = Lisp.NIL;

        public SubLObject $requestor = Lisp.NIL;

        public SubLObject $giveback_info = Lisp.NIL;

        public SubLObject $bindings = Lisp.NIL;

        public SubLObject $request = Lisp.NIL;

        public SubLObject $response = Lisp.NIL;

        public SubLObject $error_message = Lisp.NIL;

        public SubLObject $task_processor_name = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.task_processor.$task_info_native.class, TASK_INFO, TASK_INFO_P, $list_alt5, $list_alt6, new String[]{ "$type", "$id", "$priority", "$requestor", "$giveback_info", "$bindings", "$request", "$response", "$error_message", "$task_processor_name" }, $list_alt7, $list_alt8, PRINT_TASK_INFO);
    }

    public static final SubLFile me = new task_processor();



    // defparameter
    // Definitions
    // Diagnostic verbosity level of the task processor, 0=quiet, 9=maximum.
    /**
     * Diagnostic verbosity level of the task processor, 0=quiet, 9=maximum.
     */
    @LispMethod(comment = "Diagnostic verbosity level of the task processor, 0=quiet, 9=maximum.\ndefparameter")
    private static final SubLSymbol $task_processor_verbosity$ = makeSymbol("*TASK-PROCESSOR-VERBOSITY*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_task_info$ = makeSymbol("*DTP-TASK-INFO*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_task_result_set$ = makeSymbol("*DTP-TASK-RESULT-SET*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_task_processor$ = makeSymbol("*DTP-TASK-PROCESSOR*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_task_process_pool$ = makeSymbol("*DTP-TASK-PROCESS-POOL*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $task_request_queue_max_size$ = makeSymbol("*TASK-REQUEST-QUEUE-MAX-SIZE*");

    // deflexical
    // The optional file path for the task processor pool background messages.
    /**
     * The optional file path for the task processor pool background messages.
     */
    @LispMethod(comment = "The optional file path for the task processor pool background messages.\ndeflexical")
    private static final SubLSymbol $tpool_background_msg_path$ = makeSymbol("*TPOOL-BACKGROUND-MSG-PATH*");

    // deflexical
    // The stream for the task processor pool background messages.
    /**
     * The stream for the task processor pool background messages.
     */
    @LispMethod(comment = "The stream for the task processor pool background messages.\ndeflexical")
    private static final SubLSymbol $tpool_background_msg_stream$ = makeSymbol("*TPOOL-BACKGROUND-MSG-STREAM*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $queue_tpool_background_msgs_when_no_pathP$ = makeSymbol("*QUEUE-TPOOL-BACKGROUND-MSGS-WHEN-NO-PATH?*");

    // deflexical
    // Associates a process with its parent task-process-pool object.
    /**
     * Associates a process with its parent task-process-pool object.
     */
    @LispMethod(comment = "Associates a process with its parent task-process-pool object.\ndeflexical")
    private static final SubLSymbol $process_to_task_process_pool$ = makeSymbol("*PROCESS-TO-TASK-PROCESS-POOL*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $task_processes_being_worked_on_lock$ = makeSymbol("*TASK-PROCESSES-BEING-WORKED-ON-LOCK*");

    // deflexical
    /**
     * LRU Cache of task-process-descriptions -> process objects. This is used to
     * support task suspensions.
     */
    @LispMethod(comment = "LRU Cache of task-process-descriptions -> process objects. This is used to\r\nsupport task suspensions.\ndeflexical\nLRU Cache of task-process-descriptions -> process objects. This is used to\nsupport task suspensions.")
    private static final SubLSymbol $task_processes_being_worked_on$ = makeSymbol("*TASK-PROCESSES-BEING-WORKED-ON*");

    // defparameter
    // How many task processes we remember the cancellation of.
    /**
     * How many task processes we remember the cancellation of.
     */
    @LispMethod(comment = "How many task processes we remember the cancellation of.\ndefparameter")
    private static final SubLSymbol $task_processes_worked_on_history$ = makeSymbol("*TASK-PROCESSES-WORKED-ON-HISTORY*");

    // defparameter
    /**
     * If set to T, dont send the request back; if set to NIL, send the request
     * back.
     */
    @LispMethod(comment = "If set to T, dont send the request back; if set to NIL, send the request\r\nback.\ndefparameter\nIf set to T, dont send the request back; if set to NIL, send the request\nback.")
    private static final SubLSymbol $minimize_task_processor_info_communication$ = makeSymbol("*MINIMIZE-TASK-PROCESSOR-INFO-COMMUNICATION*");

    // defparameter
    // Contains the current task processor info block that is being handled.
    /**
     * Contains the current task processor info block that is being handled.
     */
    @LispMethod(comment = "Contains the current task processor info block that is being handled.\ndefparameter")
    private static final SubLSymbol $current_task_processor_info$ = makeSymbol("*CURRENT-TASK-PROCESSOR-INFO*");

    // defparameter
    // the standard output stream for debugging within a task-processor-request
    /**
     * the standard output stream for debugging within a task-processor-request
     */
    @LispMethod(comment = "the standard output stream for debugging within a task-processor-request\ndefparameter")
    public static final SubLSymbol $task_processor_standard_output$ = makeSymbol("*TASK-PROCESSOR-STANDARD-OUTPUT*");

    // defconstant
    // the default minimum number of task processors
    /**
     * the default minimum number of task processors
     */
    @LispMethod(comment = "the default minimum number of task processors\ndefconstant")
    public static final SubLSymbol $min_nbr_of_task_processors$ = makeSymbol("*MIN-NBR-OF-TASK-PROCESSORS*");

    // defconstant
    // the default maximum number of task processors
    /**
     * the default maximum number of task processors
     */
    @LispMethod(comment = "the default maximum number of task processors\ndefconstant")
    public static final SubLSymbol $max_nbr_of_task_processors$ = makeSymbol("*MAX-NBR-OF-TASK-PROCESSORS*");

    // deflexical
    // Task process pool for requests.
    /**
     * Task process pool for requests.
     */
    @LispMethod(comment = "Task process pool for requests.\ndeflexical")
    public static final SubLSymbol $api_task_process_pool$ = makeSymbol("*API-TASK-PROCESS-POOL*");

    // defconstant
    /**
     * Task process pool lock to guarantee only a single instance is initialized.
     */
    @LispMethod(comment = "Task process pool lock to guarantee only a single instance is initialized.\ndefconstant")
    public static final SubLSymbol $api_task_process_pool_lock$ = makeSymbol("*API-TASK-PROCESS-POOL-LOCK*");

    // deflexical
    // indicates that lease renewal requests should be displayed on the console.
    /**
     * indicates that lease renewal requests should be displayed on the console.
     */
    @LispMethod(comment = "indicates that lease renewal requests should be displayed on the console.\ndeflexical")
    private static final SubLSymbol $java_api_lease_activity_display$ = makeSymbol("*JAVA-API-LEASE-ACTIVITY-DISPLAY*");

    // deflexical
    // Task process pool for requests.
    /**
     * Task process pool for requests.
     */
    @LispMethod(comment = "Task process pool for requests.\ndeflexical")
    public static final SubLSymbol $bg_task_process_pool$ = makeSymbol("*BG-TASK-PROCESS-POOL*");

    // defconstant
    /**
     * Task process pool lock to guarantee only a single instance is initialized.
     */
    @LispMethod(comment = "Task process pool lock to guarantee only a single instance is initialized.\ndefconstant")
    public static final SubLSymbol $bg_task_process_pool_lock$ = makeSymbol("*BG-TASK-PROCESS-POOL-LOCK*");

    // deflexical
    // Dictionary of requestor-process --> response task-info.
    /**
     * Dictionary of requestor-process --> response task-info.
     */
    @LispMethod(comment = "Dictionary of requestor-process --> response task-info.\ndeflexical")
    private static final SubLSymbol $bg_task_processor_response_dict$ = makeSymbol("*BG-TASK-PROCESSOR-RESPONSE-DICT*");

    // deflexical
    // Serial number of background task processor requests.
    /**
     * Serial number of background task processor requests.
     */
    @LispMethod(comment = "Serial number of background task processor requests.\ndeflexical")
    private static final SubLSymbol $bg_task_processor_request_id$ = makeSymbol("*BG-TASK-PROCESSOR-REQUEST-ID*");

    // deflexical
    // Task process pool for requests.
    /**
     * Task process pool for requests.
     */
    @LispMethod(comment = "Task process pool for requests.\ndeflexical")
    public static final SubLSymbol $console_task_process_pool$ = makeSymbol("*CONSOLE-TASK-PROCESS-POOL*");

    // defconstant
    /**
     * Task process pool lock to guarantee only a single instance is initialized.
     */
    @LispMethod(comment = "Task process pool lock to guarantee only a single instance is initialized.\ndefconstant")
    public static final SubLSymbol $console_task_process_pool_lock$ = makeSymbol("*CONSOLE-TASK-PROCESS-POOL-LOCK*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol SET_TASK_PROCESSOR_VERBOSITY = makeSymbol("SET-TASK-PROCESSOR-VERBOSITY");

    static private final SubLString $str2$Invalid_verbosity__must_be_0___9_ = makeString("Invalid verbosity, must be 0 - 9 but was ~S~%");

    private static final SubLSymbol TASK_INFO = makeSymbol("TASK-INFO");

    private static final SubLSymbol TASK_INFO_P = makeSymbol("TASK-INFO-P");

    static private final SubLList $list5 = list(new SubLObject[]{ makeSymbol("TYPE"), makeSymbol("ID"), makeSymbol("PRIORITY"), makeSymbol("REQUESTOR"), makeSymbol("GIVEBACK-INFO"), makeSymbol("BINDINGS"), makeSymbol("REQUEST"), makeSymbol("RESPONSE"), makeSymbol("ERROR-MESSAGE"), makeSymbol("TASK-PROCESSOR-NAME") });

    static private final SubLList $list6 = list(new SubLObject[]{ $TYPE, makeKeyword("ID"), makeKeyword("PRIORITY"), makeKeyword("REQUESTOR"), makeKeyword("GIVEBACK-INFO"), makeKeyword("BINDINGS"), makeKeyword("REQUEST"), makeKeyword("RESPONSE"), makeKeyword("ERROR-MESSAGE"), makeKeyword("TASK-PROCESSOR-NAME") });

    static private final SubLList $list7 = list(new SubLObject[]{ makeSymbol("TI-TYPE"), makeSymbol("TI-ID"), makeSymbol("TI-PRIORITY"), makeSymbol("TI-REQUESTOR"), makeSymbol("TI-GIVEBACK-INFO"), makeSymbol("TI-BINDINGS"), makeSymbol("TI-REQUEST"), makeSymbol("TI-RESPONSE"), makeSymbol("TI-ERROR-MESSAGE"), makeSymbol("TI-TASK-PROCESSOR-NAME") });

    static private final SubLList $list8 = list(new SubLObject[]{ makeSymbol("_CSETF-TI-TYPE"), makeSymbol("_CSETF-TI-ID"), makeSymbol("_CSETF-TI-PRIORITY"), makeSymbol("_CSETF-TI-REQUESTOR"), makeSymbol("_CSETF-TI-GIVEBACK-INFO"), makeSymbol("_CSETF-TI-BINDINGS"), makeSymbol("_CSETF-TI-REQUEST"), makeSymbol("_CSETF-TI-RESPONSE"), makeSymbol("_CSETF-TI-ERROR-MESSAGE"), makeSymbol("_CSETF-TI-TASK-PROCESSOR-NAME") });

    private static final SubLSymbol PRINT_TASK_INFO = makeSymbol("PRINT-TASK-INFO");

    private static final SubLSymbol TASK_INFO_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-INFO-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list11 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TASK-INFO-P"));

    private static final SubLSymbol TI_TYPE = makeSymbol("TI-TYPE");

    private static final SubLSymbol _CSETF_TI_TYPE = makeSymbol("_CSETF-TI-TYPE");

    private static final SubLSymbol TI_ID = makeSymbol("TI-ID");

    private static final SubLSymbol _CSETF_TI_ID = makeSymbol("_CSETF-TI-ID");

    private static final SubLSymbol TI_PRIORITY = makeSymbol("TI-PRIORITY");

    private static final SubLSymbol _CSETF_TI_PRIORITY = makeSymbol("_CSETF-TI-PRIORITY");

    private static final SubLSymbol TI_REQUESTOR = makeSymbol("TI-REQUESTOR");

    private static final SubLSymbol _CSETF_TI_REQUESTOR = makeSymbol("_CSETF-TI-REQUESTOR");

    private static final SubLSymbol TI_GIVEBACK_INFO = makeSymbol("TI-GIVEBACK-INFO");

    private static final SubLSymbol _CSETF_TI_GIVEBACK_INFO = makeSymbol("_CSETF-TI-GIVEBACK-INFO");

    private static final SubLSymbol TI_BINDINGS = makeSymbol("TI-BINDINGS");

    private static final SubLSymbol _CSETF_TI_BINDINGS = makeSymbol("_CSETF-TI-BINDINGS");

    private static final SubLSymbol TI_REQUEST = makeSymbol("TI-REQUEST");

    private static final SubLSymbol _CSETF_TI_REQUEST = makeSymbol("_CSETF-TI-REQUEST");

    private static final SubLSymbol TI_RESPONSE = makeSymbol("TI-RESPONSE");

    private static final SubLSymbol _CSETF_TI_RESPONSE = makeSymbol("_CSETF-TI-RESPONSE");

    private static final SubLSymbol TI_ERROR_MESSAGE = makeSymbol("TI-ERROR-MESSAGE");

    private static final SubLSymbol _CSETF_TI_ERROR_MESSAGE = makeSymbol("_CSETF-TI-ERROR-MESSAGE");

    private static final SubLSymbol TI_TASK_PROCESSOR_NAME = makeSymbol("TI-TASK-PROCESSOR-NAME");

    private static final SubLSymbol _CSETF_TI_TASK_PROCESSOR_NAME = makeSymbol("_CSETF-TI-TASK-PROCESSOR-NAME");

    private static final SubLSymbol $TASK_PROCESSOR_NAME = makeKeyword("TASK-PROCESSOR-NAME");

    private static final SubLString $str42$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TASK_INFO = makeSymbol("MAKE-TASK-INFO");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TASK_INFO_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TASK-INFO-METHOD");

    private static final SubLString $str51$type_ = makeString("type=");

    private static final SubLString $str52$_id_ = makeString(" id=");

    private static final SubLString $str53$_priority_ = makeString(" priority=");

    private static final SubLString $str54$_requestor_ = makeString(" requestor=");

    private static final SubLString $str55$_giveback_info_ = makeString(" giveback-info=");

    private static final SubLString $str56$_bindings_ = makeString(" bindings=");

    private static final SubLString $str57$_request_ = makeString(" request=");

    private static final SubLString $str58$_response_ = makeString(" response=");

    private static final SubLString $str59$_error_message_ = makeString(" error-message=");

    private static final SubLSymbol TASK_RESULT_SET = makeSymbol("TASK-RESULT-SET");

    private static final SubLSymbol TASK_RESULT_SET_P = makeSymbol("TASK-RESULT-SET-P");

    static private final SubLList $list62 = list(makeSymbol("RESULT"), makeSymbol("TASK-INFO"), makeSymbol("FINISHED"));

    private static final SubLList $list63 = list(makeKeyword("RESULT"), makeKeyword("TASK-INFO"), makeKeyword("FINISHED"));

    private static final SubLList $list64 = list(makeSymbol("TASK-RESULT-SET-RESULT"), makeSymbol("TASK-RESULT-SET-TASK-INFO"), makeSymbol("TASK-RESULT-SET-FINISHED"));

    private static final SubLList $list65 = list(makeSymbol("_CSETF-TASK-RESULT-SET-RESULT"), makeSymbol("_CSETF-TASK-RESULT-SET-TASK-INFO"), makeSymbol("_CSETF-TASK-RESULT-SET-FINISHED"));

    private static final SubLSymbol TASK_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list68 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TASK-RESULT-SET-P"));

    private static final SubLSymbol TASK_RESULT_SET_RESULT = makeSymbol("TASK-RESULT-SET-RESULT");

    private static final SubLSymbol _CSETF_TASK_RESULT_SET_RESULT = makeSymbol("_CSETF-TASK-RESULT-SET-RESULT");

    private static final SubLSymbol TASK_RESULT_SET_TASK_INFO = makeSymbol("TASK-RESULT-SET-TASK-INFO");

    private static final SubLSymbol _CSETF_TASK_RESULT_SET_TASK_INFO = makeSymbol("_CSETF-TASK-RESULT-SET-TASK-INFO");

    private static final SubLSymbol TASK_RESULT_SET_FINISHED = makeSymbol("TASK-RESULT-SET-FINISHED");

    private static final SubLSymbol _CSETF_TASK_RESULT_SET_FINISHED = makeSymbol("_CSETF-TASK-RESULT-SET-FINISHED");

    private static final SubLSymbol MAKE_TASK_RESULT_SET = makeSymbol("MAKE-TASK-RESULT-SET");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TASK_RESULT_SET_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TASK-RESULT-SET-METHOD");

    private static final SubLSymbol TASK_PROCESSOR = makeSymbol("TASK-PROCESSOR");

    private static final SubLSymbol TASK_PROCESSOR_P = makeSymbol("TASK-PROCESSOR-P");

    private static final SubLList $list83 = list(makeSymbol("NAME"), makeSymbol("PROCESS"), makeSymbol("BUSY-P"), makeSymbol("TASK-INFO"));

    private static final SubLList $list84 = list($NAME, makeKeyword("PROCESS"), makeKeyword("BUSY-P"), makeKeyword("TASK-INFO"));

    private static final SubLList $list85 = list(makeSymbol("TPROC-NAME"), makeSymbol("TPROC-PROCESS"), makeSymbol("TPROC-BUSY-P"), makeSymbol("TPROC-TASK-INFO"));

    private static final SubLList $list86 = list(makeSymbol("_CSETF-TPROC-NAME"), makeSymbol("_CSETF-TPROC-PROCESS"), makeSymbol("_CSETF-TPROC-BUSY-P"), makeSymbol("_CSETF-TPROC-TASK-INFO"));

    private static final SubLSymbol PRINT_TASK_PROCESSOR = makeSymbol("PRINT-TASK-PROCESSOR");

    private static final SubLSymbol TASK_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list89 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TASK-PROCESSOR-P"));

    private static final SubLSymbol TPROC_NAME = makeSymbol("TPROC-NAME");

    private static final SubLSymbol _CSETF_TPROC_NAME = makeSymbol("_CSETF-TPROC-NAME");

    private static final SubLSymbol TPROC_PROCESS = makeSymbol("TPROC-PROCESS");

    private static final SubLSymbol _CSETF_TPROC_PROCESS = makeSymbol("_CSETF-TPROC-PROCESS");

    private static final SubLSymbol TPROC_BUSY_P = makeSymbol("TPROC-BUSY-P");

    private static final SubLSymbol _CSETF_TPROC_BUSY_P = makeSymbol("_CSETF-TPROC-BUSY-P");

    private static final SubLSymbol TPROC_TASK_INFO = makeSymbol("TPROC-TASK-INFO");

    private static final SubLSymbol _CSETF_TPROC_TASK_INFO = makeSymbol("_CSETF-TPROC-TASK-INFO");

    private static final SubLSymbol MAKE_TASK_PROCESSOR = makeSymbol("MAKE-TASK-PROCESSOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TASK_PROCESSOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TASK-PROCESSOR-METHOD");

    private static final SubLString $str103$name_ = makeString("name=");

    private static final SubLString $str104$_process_ = makeString(" process=");

    private static final SubLString $str105$_whostate_ = makeString(" whostate=");

    private static final SubLString $str106$_busy_p_ = makeString(" busy-p=");

    private static final SubLString $str107$_last_response_ = makeString(" last response=");

    private static final SubLSymbol TASK_PROCESS_POOL = makeSymbol("TASK-PROCESS-POOL");

    private static final SubLSymbol TASK_PROCESS_POOL_P = makeSymbol("TASK-PROCESS-POOL-P");

    private static final SubLList $list110 = list(makeSymbol("LOCK"), makeSymbol("REQUEST-QUEUE"), makeSymbol("REQUEST-SEMAPHORE"), makeSymbol("PROCESSORS"), makeSymbol("BACKGROUND-MSGS"), makeSymbol("PROCESS-NAME-PREFIX"), makeSymbol("MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("MAX-NBR-OF-TASK-PROCESSORS"));

    private static final SubLList $list111 = list($LOCK, makeKeyword("REQUEST-QUEUE"), makeKeyword("REQUEST-SEMAPHORE"), makeKeyword("PROCESSORS"), makeKeyword("BACKGROUND-MSGS"), makeKeyword("PROCESS-NAME-PREFIX"), makeKeyword("MIN-NBR-OF-TASK-PROCESSORS"), makeKeyword("MAX-NBR-OF-TASK-PROCESSORS"));

    private static final SubLList $list112 = list(makeSymbol("TPOOL-LOCK"), makeSymbol("TPOOL-REQUEST-QUEUE"), makeSymbol("TPOOL-REQUEST-SEMAPHORE"), makeSymbol("TPOOL-PROCESSORS"), makeSymbol("TPOOL-BACKGROUND-MSGS"), makeSymbol("TPOOL-PROCESS-NAME-PREFIX"), makeSymbol("TPOOL-MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("TPOOL-MAX-NBR-OF-TASK-PROCESSORS"));

    private static final SubLList $list113 = list(makeSymbol("_CSETF-TPOOL-LOCK"), makeSymbol("_CSETF-TPOOL-REQUEST-QUEUE"), makeSymbol("_CSETF-TPOOL-REQUEST-SEMAPHORE"), makeSymbol("_CSETF-TPOOL-PROCESSORS"), makeSymbol("_CSETF-TPOOL-BACKGROUND-MSGS"), makeSymbol("_CSETF-TPOOL-PROCESS-NAME-PREFIX"), makeSymbol("_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"));

    private static final SubLSymbol PRINT_TASK_PROCESS_POOL = makeSymbol("PRINT-TASK-PROCESS-POOL");

    private static final SubLSymbol TASK_PROCESS_POOL_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-PROCESS-POOL-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list116 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TASK-PROCESS-POOL-P"));

    private static final SubLSymbol TPOOL_LOCK = makeSymbol("TPOOL-LOCK");

    private static final SubLSymbol _CSETF_TPOOL_LOCK = makeSymbol("_CSETF-TPOOL-LOCK");

    private static final SubLSymbol TPOOL_REQUEST_QUEUE = makeSymbol("TPOOL-REQUEST-QUEUE");

    private static final SubLSymbol _CSETF_TPOOL_REQUEST_QUEUE = makeSymbol("_CSETF-TPOOL-REQUEST-QUEUE");

    private static final SubLSymbol TPOOL_REQUEST_SEMAPHORE = makeSymbol("TPOOL-REQUEST-SEMAPHORE");

    private static final SubLSymbol _CSETF_TPOOL_REQUEST_SEMAPHORE = makeSymbol("_CSETF-TPOOL-REQUEST-SEMAPHORE");

    private static final SubLSymbol TPOOL_PROCESSORS = makeSymbol("TPOOL-PROCESSORS");

    private static final SubLSymbol _CSETF_TPOOL_PROCESSORS = makeSymbol("_CSETF-TPOOL-PROCESSORS");

    private static final SubLSymbol TPOOL_BACKGROUND_MSGS = makeSymbol("TPOOL-BACKGROUND-MSGS");

    private static final SubLSymbol _CSETF_TPOOL_BACKGROUND_MSGS = makeSymbol("_CSETF-TPOOL-BACKGROUND-MSGS");

    private static final SubLSymbol TPOOL_PROCESS_NAME_PREFIX = makeSymbol("TPOOL-PROCESS-NAME-PREFIX");

    private static final SubLSymbol _CSETF_TPOOL_PROCESS_NAME_PREFIX = makeSymbol("_CSETF-TPOOL-PROCESS-NAME-PREFIX");

    private static final SubLSymbol TPOOL_MIN_NBR_OF_TASK_PROCESSORS = makeSymbol("TPOOL-MIN-NBR-OF-TASK-PROCESSORS");

    private static final SubLSymbol _CSETF_TPOOL_MIN_NBR_OF_TASK_PROCESSORS = makeSymbol("_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS");

    private static final SubLSymbol TPOOL_MAX_NBR_OF_TASK_PROCESSORS = makeSymbol("TPOOL-MAX-NBR-OF-TASK-PROCESSORS");

    private static final SubLSymbol _CSETF_TPOOL_MAX_NBR_OF_TASK_PROCESSORS = makeSymbol("_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS");

    private static final SubLSymbol $PROCESS_NAME_PREFIX = makeKeyword("PROCESS-NAME-PREFIX");

    private static final SubLSymbol $MIN_NBR_OF_TASK_PROCESSORS = makeKeyword("MIN-NBR-OF-TASK-PROCESSORS");

    private static final SubLSymbol $MAX_NBR_OF_TASK_PROCESSORS = makeKeyword("MAX-NBR-OF-TASK-PROCESSORS");

    private static final SubLSymbol MAKE_TASK_PROCESS_POOL = makeSymbol("MAKE-TASK-PROCESS-POOL");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TASK_PROCESS_POOL_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TASK-PROCESS-POOL-METHOD");

    private static final SubLString $str143$_request_queue_ = makeString(" request-queue=");

    private static final SubLString $str144$_processors_ = makeString(" processors=");

    private static final SubLString $str145$_process_name_prefix_ = makeString(" process name prefix=");

    private static final SubLString $str146$_min_processors_ = makeString(" min processors=");

    private static final SubLString $str147$_max_processors_ = makeString(" max processors=");

    private static final SubLString $str148$There_are_no_task_processors_ = makeString("There are no task processors.");

    private static final SubLString $str149$_S__ = makeString("~S~%");

    private static final SubLString $str150$request__S__ = makeString("request=~S~%");

    private static final SubLInteger $int$500 = makeInteger(500);

    private static final SubLSymbol PRIORITY_QUEUE_P = makeSymbol("PRIORITY-QUEUE-P");

    private static final SubLSymbol SET_TPOOL_BACKGROUND_MSG_PATH = makeSymbol("SET-TPOOL-BACKGROUND-MSG-PATH");

    @LispMethod(comment = "The lock used to serialize access for the task processor pool background messages.\ndeflexical")
    /**
     * The lock used to serialize access for the task processor pool background messages.
     */
    // deflexical
    private static final SubLSymbol $tpool_background_msg_lock$ = makeSymbol("*TPOOL-BACKGROUND-MSG-LOCK*");

    private static final SubLString $str157$tpool_background_msg_lock = makeString("tpool-background-msg-lock");

    private static final SubLSymbol PUSH_TPOOL_BACKGROUND_MSG = makeSymbol("PUSH-TPOOL-BACKGROUND-MSG");

    private static final SubLString $str159$_A_is_not_a_valid_file_specificat = makeString("~A is not a valid file specification, call SET-TPOOL-BACKGROUND-MSG-PATH first.");

    private static final SubLSymbol $IF_DOES_NOT_EXIST = makeKeyword("IF-DOES-NOT-EXIST");

    private static final SubLString $str166$_ = makeString("[");

    private static final SubLString $str167$_ = makeString("]");

    private static final SubLString $$$__ = makeString("  ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLSymbol FLUSH_TPOOL_BACKGROUND_MSGS = makeSymbol("FLUSH-TPOOL-BACKGROUND-MSGS");

    private static final SubLSymbol START_TASK_PROCESSOR_LOGGING_TO_FILE = makeSymbol("START-TASK-PROCESSOR-LOGGING-TO-FILE");

    private static final SubLSymbol END_TASK_PROCESSOR_LOGGING_TO_FILE = makeSymbol("END-TASK-PROCESSOR-LOGGING-TO-FILE");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol SAVE_UNLOGGED_TASK_PROCESSOR_MESSAGES_TO_FILE = makeSymbol("SAVE-UNLOGGED-TASK-PROCESSOR-MESSAGES-TO-FILE");

    private static final SubLString $str177$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLSymbol $eval_with_bindings$ = makeSymbol("*EVAL-WITH-BINDINGS*");

    private static final SubLSymbol CYC_API_EVAL = makeSymbol("CYC-API-EVAL");

    private static final SubLString $$$Task_processes_being_worked_on = makeString("Task processes being worked on");

    private static final SubLSymbol TASK_PROCESS_TERMINATION_REASON_P = makeSymbol("TASK-PROCESS-TERMINATION-REASON-P");

    private static final SubLSymbol SIGNAL_ABORT_ACTIVE_TASK_PROCESS = makeSymbol("SIGNAL-ABORT-ACTIVE-TASK-PROCESS");

    private static final SubLSymbol SIGNAL_CANCEL_ACTIVE_TASK_PROCESS = makeSymbol("SIGNAL-CANCEL-ACTIVE-TASK-PROCESS");

    private static final SubLString $str191$API_error__Unknown_active_task_pr = makeString("API error: Unknown active task process termination reason ~A");

    private static final SubLList $list193 = list(makeSymbol("ANS-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol CATCH_TASK_PROCESSOR_TERMINATION = makeSymbol("CATCH-TASK-PROCESSOR-TERMINATION");

    private static final SubLString $str197$Allow_for_the_API_calling_side_to = makeString("Allow for the API calling side to catch the termination of the task processor.\n   The client must wrap the api-request form with catch-task-processor-termination.");

    private static final SubLSymbol $sym198$ANS_VAR = makeUninternedSymbol("ANS-VAR");

    private static final SubLSymbol CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY = makeSymbol("CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY");

    private static final SubLList $list200 = list(makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str201$Allow_for_the_API_calling_side_to = makeString("Allow for the API calling side to catch the termination of the task processor\n   without looking at the termination reason.\n   The client must wrap the api-request form with catch-task-processor-termination-quietly.");

    private static final SubLFloat $float$0_001 = makeDouble(0.001);

    private static final SubLSymbol $TASK_PROCESSOR_QUIT = makeKeyword("TASK-PROCESSOR-QUIT");

    private static final SubLString $str204$Invalid_task_processor = makeString("Invalid task-processor");

    private static final SubLString $str205$Invalid_task_process_pool = makeString("Invalid task-process-pool");

    private static final SubLString $str206$Task_Info__S__ = makeString("Task Info ~S~%");

    private static final SubLString $str208$Response__S__ = makeString("Response ~S~%");

    private static final SubLString $str209$Error_message__S__ = makeString("Error-message ~S~%");

    private static final SubLString $str210$Posting_partial_results__A_at__A = makeString("Posting partial results ~A at ~A");

    private static final SubLString $str211$Function_only_valid_from_within_a = makeString("Function only valid from within a Task Processor, but running inside ~A.");



    private static final SubLString $$$Task_processor_ = makeString("Task processor ");

    private static final SubLString $str214$Initializing_task_processors__ = makeString("Initializing task processors~%");

    private static final SubLString $str215$_alock = makeString("~alock");

    private static final SubLString $str216$task_pool_request_semaphore = makeString("task-pool-request-semaphore");

    private static final SubLString $str217$_a_s = makeString("~a~s");

    private static final SubLSymbol TASK_PROCESSOR_HANDLER = makeSymbol("TASK-PROCESSOR-HANDLER");

    private static final SubLSymbol TASK_PROCESSOR_QUIT = makeSymbol("TASK-PROCESSOR-QUIT");

    private static final SubLSymbol ENSURE_TASK_PROCESSORS_KILLED = makeSymbol("ENSURE-TASK-PROCESSORS-KILLED");

    private static final SubLString $$$_processor_ = makeString(" processor ");

    private static final SubLString $str222$_Killing__A___ = makeString(" Killing ~A.~%");

    private static final SubLString $str223$Allocating_a_new_task_processor__ = makeString("Allocating a new task processor~%");

    private static final SubLString $str224$Awakening_first_available_task_pr = makeString("Awakening first available task processor~%");

    private static final SubLString $str225$Task_processors_are_not_initializ = makeString("Task processors are not initialized.");

    private static final SubLString $str226$__Error__cannot_queue_task_reques = makeString("~%Error: cannot queue task request for ~%~S~%");

    private static final SubLSymbol WITH_LONG_RUNNING_TASK_PROCESS = makeSymbol("WITH-LONG-RUNNING-TASK-PROCESS");

    static private final SubLList $list228 = list(list(makeSymbol("POOL"), list(makeSymbol("GET-TASK-PROCESS-POOL-FOR-PROCESS"), list(makeSymbol("CURRENT-PROCESS")))), list(makeSymbol("POOL-LOCK"), list(makeSymbol("GET-TPOOL-LOCK"), makeSymbol("POOL"))), makeSymbol("UPDATED-SUCCESSFULLY?"));

    private static final SubLList $list230 = list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("POOL-LOCK"), makeKeyword("WHOSTATE"), makeString("Upping maximum on process pool ....")), list(makeSymbol("CLET"), list(list(makeSymbol("CURR-MAX"), list(makeSymbol("GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"), makeSymbol("POOL")))), list(makeSymbol("SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"), makeSymbol("POOL"), list(makeSymbol("+"), makeSymbol("CURR-MAX"), ONE_INTEGER)), list(makeSymbol("CSETQ"), makeSymbol("UPDATED-SUCCESSFULLY?"), T)));

    private static final SubLList $list231 = list(list(makeSymbol("PWHEN"), makeSymbol("UPDATED-SUCCESSFULLY?"), list(makeSymbol("WITH-LOCK-HELD"), list(makeSymbol("POOL-LOCK"), makeKeyword("WHOSTATE"), makeString("Reverting maximum on process pool ....")), list(makeSymbol("CLET"), list(list(makeSymbol("CURR-MAX"), list(makeSymbol("GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"), makeSymbol("POOL")))), list(makeSymbol("SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"), makeSymbol("POOL"), list(ONE_INTEGER, makeSymbol("CURR-MAX"), ONE_INTEGER))))));

    private static final SubLList $list232 = list(makeSymbol("TYPE"), makeSymbol("MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("MAX-NBR-OF-TASK-PROCESSORS"));

    private static final SubLString $str233$_ = makeString("*");

    private static final SubLString $str234$_TASK_PROCESS_POOL_ = makeString("-TASK-PROCESS-POOL*");

    private static final SubLString $str235$_TASK_PROCESS_POOL_LOCK_ = makeString("-TASK-PROCESS-POOL-LOCK*");

    private static final SubLSymbol DEFLEXICAL_PUBLIC = makeSymbol("DEFLEXICAL-PUBLIC");

    private static final SubLList $list237 = list(NIL, makeString("Task process pool for requests."));

    private static final SubLSymbol DEFCONSTANT_PUBLIC = makeSymbol("DEFCONSTANT-PUBLIC");

    private static final SubLList $list239 = list(list(makeSymbol("MAKE-LOCK"), makeString("task processor initialization lock")), makeString("Task process pool lock to guarantee only a single instance is initialized."));

    private static final SubLString $str241$_TASK_PROCESSORS_INITIALIZED_P = makeString("-TASK-PROCESSORS-INITIALIZED-P");

    private static final SubLString $str242$Return_T_when_there_are_task_proc = makeString("Return T when there are task processors.");

    private static final SubLSymbol TASK_PROCESSORS_INITIALIZED_P = makeSymbol("TASK-PROCESSORS-INITIALIZED-P");

    private static final SubLString $str245$INITIALIZE_ = makeString("INITIALIZE-");

    private static final SubLString $str246$_TASK_PROCESSORS = makeString("-TASK-PROCESSORS");

    private static final SubLString $str247$Initialize_the_task_processor_poo = makeString("Initialize the task processor pool for requests.");

    private static final SubLList $list250 = list(list(makeSymbol("ERROR"), makeString("Illegal attempt to reinitialize processor pool without first halting it.")));

    private static final SubLSymbol INITIALIZE_TASK_PROCESSORS = makeSymbol("INITIALIZE-TASK-PROCESSORS");

    private static final SubLList $list253 = list(makeString(" processor "));

    private static final SubLList $list254 = list(list(RET, NIL));

    private static final SubLString $str255$HALT_ = makeString("HALT-");

    private static final SubLString $str256$Halt_the_task_processors_ = makeString("Halt the task processors.");

    private static final SubLSymbol HALT_TASK_PROCESSORS = makeSymbol("HALT-TASK-PROCESSORS");

    private static final SubLList $list258 = list(makeSymbol("FLUSH-TPOOL-BACKGROUND-MSGS"));

    private static final SubLList $list259 = list(NIL);

    private static final SubLString $str260$RESTART_ = makeString("RESTART-");

    private static final SubLString $str261$Restart__halt___initialize__the_t = makeString("Restart (halt + initialize) the task processors.");

    private static final SubLString $str262$SHOW_ = makeString("SHOW-");

    private static final SubLString $str263$_TP_MSGS = makeString("-TP-MSGS");

    private static final SubLString $str264$Show_and_reset_the_task_processor = makeString("Show and reset the task processor background messages for the\n          task-process-pool.");

    private static final SubLSymbol SHOW_TP_MSGS = makeSymbol("SHOW-TP-MSGS");

    private static final SubLList $list266 = list(makeSymbol("TYPE"), makeSymbol("EVAL-FN"), makeSymbol("ARGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str267$_TASK_PROCESSOR_REQUEST = makeString("-TASK-PROCESSOR-REQUEST");

    private static final SubLList $list268 = list(makeSymbol("PUNLESS"), makeSymbol("*TASK-PROCESSOR-EVAL-FN-DICT*"), list(makeSymbol("CSETQ"), makeSymbol("*TASK-PROCESSOR-EVAL-FN-DICT*"), list(makeSymbol("NEW-DICTIONARY"))));

    private static final SubLSymbol $task_processor_eval_fn_dict$ = makeSymbol("*TASK-PROCESSOR-EVAL-FN-DICT*");

    private static final SubLList $list271 = list(makeSymbol("TYPE"), makeSymbol("ARGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLString $str272$DISPATCH_ = makeString("DISPATCH-");

    private static final SubLString $str273$_TASK_PROCESSOR_RESPONSE = makeString("-TASK-PROCESSOR-RESPONSE");

    private static final SubLList $list274 = list(makeSymbol("PUNLESS"), makeSymbol("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*"), list(makeSymbol("CSETQ"), makeSymbol("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*"), list(makeSymbol("NEW-DICTIONARY"))));

    private static final SubLSymbol $task_processor_response_dispatch_fn_dict$ = makeSymbol("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*");

    private static final SubLString $str277$task_processor_initialization_loc = makeString("task processor initialization lock");

    private static final SubLString $str278$Illegal_attempt_to_reinitialize_p = makeString("Illegal attempt to reinitialize processor pool without first halting it.");

    private static final SubLString $$$API = makeString("API");

    private static final SubLSymbol SHOW_API_TASK_PROCESSORS = makeSymbol("SHOW-API-TASK-PROCESSORS");

    private static final SubLString $str281$Provides_a_convenient_alias_for_D = makeString("Provides a convenient alias for DISPLAY-API-TASK-PROCESSORS.");

    private static final SubLSymbol DISPLAY_API_TASK_PROCESSORS = makeSymbol("DISPLAY-API-TASK-PROCESSORS");

    private static final SubLString $str283$ = makeString("");

    private static final SubLSymbol INITIALIZE_API_TASK_PROCESSORS = makeSymbol("INITIALIZE-API-TASK-PROCESSORS");

    private static final SubLSymbol HALT_API_TASK_PROCESSORS = makeSymbol("HALT-API-TASK-PROCESSORS");

    private static final SubLSymbol RESTART_API_TASK_PROCESSORS = makeSymbol("RESTART-API-TASK-PROCESSORS");

    private static final SubLSymbol SHOW_API_TP_MSGS = makeSymbol("SHOW-API-TP-MSGS");

    private static final SubLSymbol API_TASK_PROCESSOR_REQUEST = makeSymbol("API-TASK-PROCESSOR-REQUEST");

    private static final SubLSymbol WITH_IMMEDIATE_EXECUTION = makeSymbol("WITH-IMMEDIATE-EXECUTION");

    private static final SubLSymbol SET_JAVA_API_LEASE_ACTIVITY_DISPLAY = makeSymbol("SET-JAVA-API-LEASE-ACTIVITY-DISPLAY");

    private static final SubLString $str292$Dispatching_api_response__S__ = makeString("Dispatching api response ~S~%");

    private static final SubLSymbol TASK_PROCESSOR_RESPONSE = makeSymbol("TASK-PROCESSOR-RESPONSE");

    private static final SubLString $str294$Sending_api_response__S_to_socket = makeString("Sending api response ~S to socket ~S~% identified by ~A~%");

    private static final SubLString $str295$Dropping_api_response__S__socket_ = makeString("Dropping api response ~S, socket ~S~% identified by ~A is not available~%");

    private static final SubLSymbol DISPATCH_API_TASK_PROCESSOR_RESPONSE = makeSymbol("DISPATCH-API-TASK-PROCESSOR-RESPONSE");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_RESET = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-RESET");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_ADD = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-ADD");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_SIZE = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-SIZE");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_CONTENTS = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-CONTENTS");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_ITERATOR = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-ITERATOR");

    private static final SubLSymbol INTERMEDIATE_RESULTS_ACCUMULATOR_ADD_ALL = makeSymbol("INTERMEDIATE-RESULTS-ACCUMULATOR-ADD-ALL");

    private static final SubLString $str303$Cannot_invoke_intermediate_result = makeString("Cannot invoke intermediate results accumulator outside of a task processor.~%");

    private static final SubLString $$$BG = makeString("BG");

    private static final SubLString $str306$dispatching_bg_response__S__ = makeString("dispatching bg response ~S~%");

    private static final SubLString $str307$bg_response_dictionary__S__ = makeString("bg response dictionary ~S~%");

    private static final SubLSymbol DISPATCH_BG_TASK_PROCESSOR_RESPONSE = makeSymbol("DISPATCH-BG-TASK-PROCESSOR-RESPONSE");

    private static final SubLString $$$CONSOLE = makeString("CONSOLE");

    private static final SubLSymbol $task_processor_console_id$ = makeSymbol("*TASK-PROCESSOR-CONSOLE-ID*");

    private static final SubLString $str312$dispatching_console_response__S__ = makeString("dispatching console response ~S~%");

    private static final SubLString $str313$_A___A__ = makeString("~A  ~A~%");

    private static final SubLSymbol DISPATCH_CONSOLE_TASK_PROCESSOR_RESPONSE = makeSymbol("DISPATCH-CONSOLE-TASK-PROCESSOR-RESPONSE");

    private static final SubLString $str315$Task_Processor_Module_Supercatego = makeString("Task-Processor Module Supercategory");

    private static final SubLString $$$Task_Processor_Subcategory = makeString("Task Processor Subcategory");

    private static final SubLString $str317$Task_Processor_Testing_Suite = makeString("Task-Processor Testing Suite");

    static final boolean assertionsDisabledSynth = true;

    /**
     *
     *
     * @return integerp
    Return the task processor verbosity level.
     */
    @LispMethod(comment = "@return integerp\r\nReturn the task processor verbosity level.")
    public static final SubLObject get_task_processor_verbosity_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $task_processor_verbosity$.getDynamicValue(thread);
        }
    }

    /**
     *
     *
     * @return integerp
    Return the task processor verbosity level.
     */
    @LispMethod(comment = "@return integerp\r\nReturn the task processor verbosity level.")
    public static SubLObject get_task_processor_verbosity() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return task_processor.$task_processor_verbosity$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @param VERBOSITY;
     * 		integerp
     * 		Set the task processor verbosity level to VERBOSITY.
     */
    @LispMethod(comment = "@param VERBOSITY;\r\n\t\tintegerp\r\n\t\tSet the task processor verbosity level to VERBOSITY.")
    public static final SubLObject set_task_processor_verbosity_alt(SubLObject verbosity) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(verbosity, INTEGERP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(MINUS_ONE_INTEGER.numL(verbosity) && verbosity.numL(TEN_INTEGER))) {
                    Errors.error($str_alt2$Invalid_verbosity__must_be_0___9_, verbosity);
                }
            }
            $task_processor_verbosity$.setDynamicValue(verbosity, thread);
            return NIL;
        }
    }

    /**
     *
     *
     * @param VERBOSITY;
     * 		integerp
     * 		Set the task processor verbosity level to VERBOSITY.
     */
    @LispMethod(comment = "@param VERBOSITY;\r\n\t\tintegerp\r\n\t\tSet the task processor verbosity level to VERBOSITY.")
    public static SubLObject set_task_processor_verbosity(final SubLObject verbosity) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(verbosity) : "! integerp(verbosity) " + ("Types.integerp(verbosity) " + "CommonSymbols.NIL != Types.integerp(verbosity) ") + verbosity;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!MINUS_ONE_INTEGER.numL(verbosity)) || (!verbosity.numL(TEN_INTEGER)))) {
            Errors.error(task_processor.$str2$Invalid_verbosity__must_be_0___9_, verbosity);
        }
        task_processor.$task_processor_verbosity$.setDynamicValue(verbosity, thread);
        return NIL;
    }

    public static final SubLObject task_info_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.task_processor.print_task_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject task_info_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        task_processor.print_task_info(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject task_info_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.task_processor.$task_info_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject task_info_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.task_processor.$task_info_native.class ? T : NIL;
    }

    public static final SubLObject ti_type_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.getField2();
    }

    public static SubLObject ti_type(final SubLObject v_object) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ti_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.getField3();
    }

    public static SubLObject ti_id(final SubLObject v_object) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ti_priority_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.getField4();
    }

    public static SubLObject ti_priority(final SubLObject v_object) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ti_requestor_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.getField5();
    }

    public static SubLObject ti_requestor(final SubLObject v_object) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject ti_giveback_info_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.getField6();
    }

    public static SubLObject ti_giveback_info(final SubLObject v_object) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject ti_bindings_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.getField7();
    }

    public static SubLObject ti_bindings(final SubLObject v_object) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject ti_request_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.getField8();
    }

    public static SubLObject ti_request(final SubLObject v_object) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject ti_response_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.getField9();
    }

    public static SubLObject ti_response(final SubLObject v_object) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject ti_error_message_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.getField10();
    }

    public static SubLObject ti_error_message(final SubLObject v_object) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject ti_task_processor_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.getField11();
    }

    public static SubLObject ti_task_processor_name(final SubLObject v_object) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject _csetf_ti_type_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ti_type(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ti_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ti_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ti_priority_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ti_priority(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ti_requestor_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ti_requestor(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_ti_giveback_info_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_ti_giveback_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_ti_bindings_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_ti_bindings(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_ti_request_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_ti_request(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_ti_response_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_ti_response(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_ti_error_message_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_ti_error_message(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_ti_task_processor_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_INFO_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_ti_task_processor_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_info_p(v_object) : "! task_processor.task_info_p(v_object) " + "task_processor.task_info_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject make_task_info_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.task_processor.$task_info_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($TYPE)) {
                        com.cyc.cycjava.cycl.task_processor._csetf_ti_type(v_new, current_value);
                    } else {
                        if (pcase_var.eql($ID)) {
                            com.cyc.cycjava.cycl.task_processor._csetf_ti_id(v_new, current_value);
                        } else {
                            if (pcase_var.eql($PRIORITY)) {
                                com.cyc.cycjava.cycl.task_processor._csetf_ti_priority(v_new, current_value);
                            } else {
                                if (pcase_var.eql($REQUESTOR)) {
                                    com.cyc.cycjava.cycl.task_processor._csetf_ti_requestor(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($GIVEBACK_INFO)) {
                                        com.cyc.cycjava.cycl.task_processor._csetf_ti_giveback_info(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($BINDINGS)) {
                                            com.cyc.cycjava.cycl.task_processor._csetf_ti_bindings(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($REQUEST)) {
                                                com.cyc.cycjava.cycl.task_processor._csetf_ti_request(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($RESPONSE)) {
                                                    com.cyc.cycjava.cycl.task_processor._csetf_ti_response(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($ERROR_MESSAGE)) {
                                                        com.cyc.cycjava.cycl.task_processor._csetf_ti_error_message(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($TASK_PROCESSOR_NAME)) {
                                                            com.cyc.cycjava.cycl.task_processor._csetf_ti_task_processor_name(v_new, current_value);
                                                        } else {
                                                            Errors.error($str_alt41$Invalid_slot__S_for_construction_, current_arg);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_task_info(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.task_processor.$task_info_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($TYPE)) {
                task_processor._csetf_ti_type(v_new, current_value);
            } else
                if (pcase_var.eql($ID)) {
                    task_processor._csetf_ti_id(v_new, current_value);
                } else
                    if (pcase_var.eql($PRIORITY)) {
                        task_processor._csetf_ti_priority(v_new, current_value);
                    } else
                        if (pcase_var.eql($REQUESTOR)) {
                            task_processor._csetf_ti_requestor(v_new, current_value);
                        } else
                            if (pcase_var.eql($GIVEBACK_INFO)) {
                                task_processor._csetf_ti_giveback_info(v_new, current_value);
                            } else
                                if (pcase_var.eql($BINDINGS)) {
                                    task_processor._csetf_ti_bindings(v_new, current_value);
                                } else
                                    if (pcase_var.eql($REQUEST)) {
                                        task_processor._csetf_ti_request(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($RESPONSE)) {
                                            task_processor._csetf_ti_response(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($ERROR_MESSAGE)) {
                                                task_processor._csetf_ti_error_message(v_new, current_value);
                                            } else
                                                if (pcase_var.eql(task_processor.$TASK_PROCESSOR_NAME)) {
                                                    task_processor._csetf_ti_task_processor_name(v_new, current_value);
                                                } else {
                                                    Errors.error(task_processor.$str42$Invalid_slot__S_for_construction_, current_arg);
                                                }









        }
        return v_new;
    }

    public static SubLObject visit_defstruct_task_info(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, task_processor.MAKE_TASK_INFO, TEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $TYPE, task_processor.ti_type(obj));
        funcall(visitor_fn, obj, $SLOT, $ID, task_processor.ti_id(obj));
        funcall(visitor_fn, obj, $SLOT, $PRIORITY, task_processor.ti_priority(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUESTOR, task_processor.ti_requestor(obj));
        funcall(visitor_fn, obj, $SLOT, $GIVEBACK_INFO, task_processor.ti_giveback_info(obj));
        funcall(visitor_fn, obj, $SLOT, $BINDINGS, task_processor.ti_bindings(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUEST, task_processor.ti_request(obj));
        funcall(visitor_fn, obj, $SLOT, $RESPONSE, task_processor.ti_response(obj));
        funcall(visitor_fn, obj, $SLOT, $ERROR_MESSAGE, task_processor.ti_error_message(obj));
        funcall(visitor_fn, obj, $SLOT, task_processor.$TASK_PROCESSOR_NAME, task_processor.ti_task_processor_name(obj));
        funcall(visitor_fn, obj, $END, task_processor.MAKE_TASK_INFO, TEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_task_info_method(final SubLObject obj, final SubLObject visitor_fn) {
        return task_processor.visit_defstruct_task_info(obj, visitor_fn);
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return symbolp for example :api or :console
    Return the type of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return symbolp for example :api or :console\r\nReturn the type of TASK-INFO.")
    public static final SubLObject get_task_info_type_alt(SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        return com.cyc.cycjava.cycl.task_processor.ti_type(task_info);
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return symbolp for example :api or :console
    Return the type of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return symbolp for example :api or :console\r\nReturn the type of TASK-INFO.")
    public static SubLObject get_task_info_type(final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        return task_processor.ti_type(task_info);
    }

    /**
     *
     *
     * @param TYPE;
    symbolp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the TYPE of TASK-INFO.
     */
    @LispMethod(comment = "@param TYPE;\nsymbolp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the TYPE of TASK-INFO.")
    public static final SubLObject set_task_info_type_alt(SubLObject type, SubLObject task_info) {
        SubLTrampolineFile.checkType(type, SYMBOLP);
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        com.cyc.cycjava.cycl.task_processor._csetf_ti_type(task_info, type);
        return NIL;
    }

    /**
     *
     *
     * @param TYPE;
    symbolp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the TYPE of TASK-INFO.
     */
    @LispMethod(comment = "@param TYPE;\nsymbolp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the TYPE of TASK-INFO.")
    public static SubLObject set_task_info_type(final SubLObject type, final SubLObject task_info) {
        assert NIL != symbolp(type) : "! symbolp(type) " + ("Types.symbolp(type) " + "CommonSymbols.NIL != Types.symbolp(type) ") + type;
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        task_processor._csetf_ti_type(task_info, type);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return integerp
    Return the id of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return integerp\r\nReturn the id of TASK-INFO.")
    public static final SubLObject get_task_info_id_alt(SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        return com.cyc.cycjava.cycl.task_processor.ti_id(task_info);
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return integerp
    Return the id of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return integerp\r\nReturn the id of TASK-INFO.")
    public static SubLObject get_task_info_id(final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        return task_processor.ti_id(task_info);
    }

    /**
     *
     *
     * @param ID;
    integerp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the ID of TASK-INFO.
     */
    @LispMethod(comment = "@param ID;\nintegerp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the ID of TASK-INFO.")
    public static final SubLObject set_task_info_id_alt(SubLObject id, SubLObject task_info) {
        SubLTrampolineFile.checkType(id, INTEGERP);
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        com.cyc.cycjava.cycl.task_processor._csetf_ti_id(task_info, id);
        return NIL;
    }

    /**
     *
     *
     * @param ID;
    integerp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the ID of TASK-INFO.
     */
    @LispMethod(comment = "@param ID;\nintegerp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the ID of TASK-INFO.")
    public static SubLObject set_task_info_id(final SubLObject id, final SubLObject task_info) {
        assert NIL != integerp(id) : "! integerp(id) " + ("Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) ") + id;
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        task_processor._csetf_ti_id(task_info, id);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return integerp
    Return the priority of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return integerp\r\nReturn the priority of TASK-INFO.")
    public static final SubLObject get_task_info_priority_alt(SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        return com.cyc.cycjava.cycl.task_processor.ti_priority(task_info);
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return integerp
    Return the priority of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return integerp\r\nReturn the priority of TASK-INFO.")
    public static SubLObject get_task_info_priority(final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        return task_processor.ti_priority(task_info);
    }

    /**
     *
     *
     * @param PRIORITY;
    integerp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the PRIORITY of TASK-INFO.
     */
    @LispMethod(comment = "@param PRIORITY;\nintegerp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the PRIORITY of TASK-INFO.")
    public static final SubLObject set_task_info_priority_alt(SubLObject priority, SubLObject task_info) {
        SubLTrampolineFile.checkType(priority, INTEGERP);
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        com.cyc.cycjava.cycl.task_processor._csetf_ti_priority(task_info, priority);
        return NIL;
    }

    /**
     *
     *
     * @param PRIORITY;
    integerp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the PRIORITY of TASK-INFO.
     */
    @LispMethod(comment = "@param PRIORITY;\nintegerp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the PRIORITY of TASK-INFO.")
    public static SubLObject set_task_info_priority(final SubLObject priority, final SubLObject task_info) {
        assert NIL != integerp(priority) : "! integerp(priority) " + ("Types.integerp(priority) " + "CommonSymbols.NIL != Types.integerp(priority) ") + priority;
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        task_processor._csetf_ti_priority(task_info, priority);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return stringp
    Return the requestor of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return stringp\r\nReturn the requestor of TASK-INFO.")
    public static final SubLObject get_task_info_requestor_alt(SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        return com.cyc.cycjava.cycl.task_processor.ti_requestor(task_info);
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return stringp
    Return the requestor of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return stringp\r\nReturn the requestor of TASK-INFO.")
    public static SubLObject get_task_info_requestor(final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        return task_processor.ti_requestor(task_info);
    }

    /**
     *
     *
     * @param REQUESTOR;
    stringp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the REQUESTOR of TASK-INFO.
     */
    @LispMethod(comment = "@param REQUESTOR;\nstringp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the REQUESTOR of TASK-INFO.")
    public static final SubLObject set_task_info_requestor_alt(SubLObject requestor, SubLObject task_info) {
        SubLTrampolineFile.checkType(requestor, STRINGP);
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        com.cyc.cycjava.cycl.task_processor._csetf_ti_requestor(task_info, requestor);
        return NIL;
    }

    /**
     *
     *
     * @param REQUESTOR;
    stringp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the REQUESTOR of TASK-INFO.
     */
    @LispMethod(comment = "@param REQUESTOR;\nstringp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the REQUESTOR of TASK-INFO.")
    public static SubLObject set_task_info_requestor(final SubLObject requestor, final SubLObject task_info) {
        assert NIL != stringp(requestor) : "! stringp(requestor) " + ("Types.stringp(requestor) " + "CommonSymbols.NIL != Types.stringp(requestor) ") + requestor;
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        task_processor._csetf_ti_requestor(task_info, requestor);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return any
    Return the giveback-info of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return any\r\nReturn the giveback-info of TASK-INFO.")
    public static final SubLObject get_task_info_giveback_info_alt(SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        return com.cyc.cycjava.cycl.task_processor.ti_giveback_info(task_info);
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return any
    Return the giveback-info of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return any\r\nReturn the giveback-info of TASK-INFO.")
    public static SubLObject get_task_info_giveback_info(final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        return task_processor.ti_giveback_info(task_info);
    }

    /**
     *
     *
     * @param GIVEBACK-INFO;
    any
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the GIVEBACK-INFO of TASK-INFO.
     */
    @LispMethod(comment = "@param GIVEBACK-INFO;\nany\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the GIVEBACK-INFO of TASK-INFO.")
    public static final SubLObject set_task_info_giveback_info_alt(SubLObject giveback_info, SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        com.cyc.cycjava.cycl.task_processor._csetf_ti_giveback_info(task_info, giveback_info);
        return NIL;
    }

    /**
     *
     *
     * @param GIVEBACK-INFO;
    any
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the GIVEBACK-INFO of TASK-INFO.
     */
    @LispMethod(comment = "@param GIVEBACK-INFO;\nany\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the GIVEBACK-INFO of TASK-INFO.")
    public static SubLObject set_task_info_giveback_info(final SubLObject giveback_info, final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        task_processor._csetf_ti_giveback_info(task_info, giveback_info);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return listp
    Return the bindings of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return listp\r\nReturn the bindings of TASK-INFO.")
    public static final SubLObject get_task_info_bindings_alt(SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        return com.cyc.cycjava.cycl.task_processor.ti_bindings(task_info);
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return listp
    Return the bindings of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return listp\r\nReturn the bindings of TASK-INFO.")
    public static SubLObject get_task_info_bindings(final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        return task_processor.ti_bindings(task_info);
    }

    /**
     *
     *
     * @param BINDINGS;
     * 		nil or CONSP of two-element lists (var value)
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the BINDINGS of TASK-INFO.
     */
    @LispMethod(comment = "@param BINDINGS;\r\n\t\tnil or CONSP of two-element lists (var value)\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the BINDINGS of TASK-INFO.")
    public static final SubLObject set_task_info_bindings_alt(SubLObject v_bindings, SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        com.cyc.cycjava.cycl.task_processor._csetf_ti_bindings(task_info, v_bindings);
        return NIL;
    }

    /**
     *
     *
     * @param BINDINGS;
     * 		nil or CONSP of two-element lists (var value)
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the BINDINGS of TASK-INFO.
     */
    @LispMethod(comment = "@param BINDINGS;\r\n\t\tnil or CONSP of two-element lists (var value)\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the BINDINGS of TASK-INFO.")
    public static SubLObject set_task_info_bindings(final SubLObject v_bindings, final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        task_processor._csetf_ti_bindings(task_info, v_bindings);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return atom or listp
    Return the request of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return atom or listp\r\nReturn the request of TASK-INFO.")
    public static final SubLObject get_task_info_request_alt(SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        return com.cyc.cycjava.cycl.task_processor.ti_request(task_info);
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return atom or listp
    Return the request of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return atom or listp\r\nReturn the request of TASK-INFO.")
    public static SubLObject get_task_info_request(final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        return task_processor.ti_request(task_info);
    }

    /**
     *
     *
     * @param REQUEST;
     * 		atom or CONSP the form for evaluation
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the REQUEST of TASK-INFO.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tatom or CONSP the form for evaluation\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the REQUEST of TASK-INFO.")
    public static final SubLObject set_task_info_request_alt(SubLObject request, SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        com.cyc.cycjava.cycl.task_processor._csetf_ti_request(task_info, request);
        return NIL;
    }

    /**
     *
     *
     * @param REQUEST;
     * 		atom or CONSP the form for evaluation
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the REQUEST of TASK-INFO.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tatom or CONSP the form for evaluation\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the REQUEST of TASK-INFO.")
    public static SubLObject set_task_info_request(final SubLObject request, final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        task_processor._csetf_ti_request(task_info, request);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return atom or listp
    Return the response of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return atom or listp\r\nReturn the response of TASK-INFO.")
    public static final SubLObject get_task_info_response_alt(SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        return com.cyc.cycjava.cycl.task_processor.ti_response(task_info);
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return atom or listp
    Return the response of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return atom or listp\r\nReturn the response of TASK-INFO.")
    public static SubLObject get_task_info_response(final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        return task_processor.ti_response(task_info);
    }

    /**
     *
     *
     * @param RESPONSE;
     * 		the results of evaluation
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the RESPONSE of TASK-INFO.
     */
    @LispMethod(comment = "@param RESPONSE;\r\n\t\tthe results of evaluation\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the RESPONSE of TASK-INFO.")
    public static final SubLObject set_task_info_response_alt(SubLObject response, SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        com.cyc.cycjava.cycl.task_processor._csetf_ti_response(task_info, response);
        return NIL;
    }

    /**
     *
     *
     * @param RESPONSE;
     * 		the results of evaluation
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the RESPONSE of TASK-INFO.
     */
    @LispMethod(comment = "@param RESPONSE;\r\n\t\tthe results of evaluation\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the RESPONSE of TASK-INFO.")
    public static SubLObject set_task_info_response(final SubLObject response, final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        task_processor._csetf_ti_response(task_info, response);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return stringp
    Return the error-message of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return stringp\r\nReturn the error-message of TASK-INFO.")
    public static final SubLObject get_task_info_error_message_alt(SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        return com.cyc.cycjava.cycl.task_processor.ti_error_message(task_info);
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return stringp
    Return the error-message of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return stringp\r\nReturn the error-message of TASK-INFO.")
    public static SubLObject get_task_info_error_message(final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        return task_processor.ti_error_message(task_info);
    }

    /**
     *
     *
     * @param ERROR-MESSAGE;
    stringp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the ERROR-MESSAGE of TASK-INFO.
     */
    @LispMethod(comment = "@param ERROR-MESSAGE;\nstringp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the ERROR-MESSAGE of TASK-INFO.")
    public static final SubLObject set_task_info_error_message_alt(SubLObject error_message, SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        com.cyc.cycjava.cycl.task_processor._csetf_ti_error_message(task_info, error_message);
        return NIL;
    }

    /**
     *
     *
     * @param ERROR-MESSAGE;
    stringp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the ERROR-MESSAGE of TASK-INFO.
     */
    @LispMethod(comment = "@param ERROR-MESSAGE;\nstringp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the ERROR-MESSAGE of TASK-INFO.")
    public static SubLObject set_task_info_error_message(final SubLObject error_message, final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        task_processor._csetf_ti_error_message(task_info, error_message);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return stringp
    Return the task-processor-name of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return stringp\r\nReturn the task-processor-name of TASK-INFO.")
    public static final SubLObject get_task_info_task_processor_name_alt(SubLObject task_info) {
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        return com.cyc.cycjava.cycl.task_processor.ti_task_processor_name(task_info);
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @return stringp
    Return the task-processor-name of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@return stringp\r\nReturn the task-processor-name of TASK-INFO.")
    public static SubLObject get_task_info_task_processor_name(final SubLObject task_info) {
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        return task_processor.ti_task_processor_name(task_info);
    }

    /**
     *
     *
     * @param TASK-PROCESSOR-NAME;
    stringp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the TASK-PROCESSOR-NAME of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-PROCESSOR-NAME;\nstringp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the TASK-PROCESSOR-NAME of TASK-INFO.")
    public static final SubLObject set_task_info_task_processor_name_alt(SubLObject task_processor_name, SubLObject task_info) {
        SubLTrampolineFile.checkType(task_processor_name, STRINGP);
        SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
        com.cyc.cycjava.cycl.task_processor._csetf_ti_task_processor_name(task_info, task_processor_name);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESSOR-NAME;
    stringp
     * 		
     * @param TASK-INFO;
     * 		task-info-p
     * 		Sets the TASK-PROCESSOR-NAME of TASK-INFO.
     */
    @LispMethod(comment = "@param TASK-PROCESSOR-NAME;\nstringp\r\n\t\t\r\n@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tSets the TASK-PROCESSOR-NAME of TASK-INFO.")
    public static SubLObject set_task_info_task_processor_name(final SubLObject task_processor_name, final SubLObject task_info) {
        assert NIL != stringp(task_processor_name) : "! stringp(task_processor_name) " + ("Types.stringp(task_processor_name) " + "CommonSymbols.NIL != Types.stringp(task_processor_name) ") + task_processor_name;
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        task_processor._csetf_ti_task_processor_name(task_info, task_processor_name);
        return NIL;
    }

    /**
     *
     *
     * @param task-info;
    task-info-p
     * 		
     * @param stream;
    streamp
     * 		
     * @param depth;
     * 		ignored
     * 		Readably displays the TASK-INFO object on STREAM.
     */
    @LispMethod(comment = "@param task-info;\ntask-info-p\r\n\t\t\r\n@param stream;\nstreamp\r\n\t\t\r\n@param depth;\r\n\t\tignored\r\n\t\tReadably displays the TASK-INFO object on STREAM.")
    public static final SubLObject print_task_info_alt(SubLObject task_info, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
            SubLTrampolineFile.checkType(stream, STREAMP);
            terpri(stream);
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(task_info, stream);
            } else {
                {
                    SubLObject v_object = task_info;
                    SubLObject stream_1 = stream;
                    write_string($str_alt45$__, stream_1, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_1 });
                    write_char(CHAR_space, stream_1);
                    write_string($str_alt47$type_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.ti_type(task_info), stream);
                    write_string($str_alt48$_id_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.ti_id(task_info), stream);
                    write_string($str_alt49$_priority_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.ti_priority(task_info), stream);
                    write_string($str_alt50$_requestor_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.ti_requestor(task_info), stream);
                    write_string($str_alt51$_giveback_info_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.ti_giveback_info(task_info), stream);
                    terpri(stream);
                    write_string($str_alt52$_bindings_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.ti_bindings(task_info), stream);
                    terpri(stream);
                    write_string($str_alt53$_request_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.ti_request(task_info), stream);
                    terpri(stream);
                    write_string($str_alt54$_response_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.ti_response(task_info), stream);
                    terpri(stream);
                    write_string($str_alt55$_error_message_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.ti_error_message(task_info), stream);
                    write_char(CHAR_space, stream_1);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_1, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_1);
                }
            }
            return task_info;
        }
    }

    /**
     *
     *
     * @param task-info;
    task-info-p
     * 		
     * @param stream;
    streamp
     * 		
     * @param depth;
     * 		ignored
     * 		Readably displays the TASK-INFO object on STREAM.
     */
    @LispMethod(comment = "@param task-info;\ntask-info-p\r\n\t\t\r\n@param stream;\nstreamp\r\n\t\t\r\n@param depth;\r\n\t\tignored\r\n\t\tReadably displays the TASK-INFO object on STREAM.")
    public static SubLObject print_task_info(final SubLObject task_info, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        terpri(stream);
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(task_info, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, task_info, T, T);
            write_string(task_processor.$str51$type_, stream, UNPROVIDED, UNPROVIDED);
            prin1(task_processor.ti_type(task_info), stream);
            write_string(task_processor.$str52$_id_, stream, UNPROVIDED, UNPROVIDED);
            prin1(task_processor.ti_id(task_info), stream);
            write_string(task_processor.$str53$_priority_, stream, UNPROVIDED, UNPROVIDED);
            prin1(task_processor.ti_priority(task_info), stream);
            write_string(task_processor.$str54$_requestor_, stream, UNPROVIDED, UNPROVIDED);
            prin1(task_processor.ti_requestor(task_info), stream);
            write_string(task_processor.$str55$_giveback_info_, stream, UNPROVIDED, UNPROVIDED);
            prin1(task_processor.ti_giveback_info(task_info), stream);
            terpri(stream);
            write_string(task_processor.$str56$_bindings_, stream, UNPROVIDED, UNPROVIDED);
            prin1(task_processor.ti_bindings(task_info), stream);
            terpri(stream);
            write_string(task_processor.$str57$_request_, stream, UNPROVIDED, UNPROVIDED);
            prin1(task_processor.ti_request(task_info), stream);
            terpri(stream);
            write_string(task_processor.$str58$_response_, stream, UNPROVIDED, UNPROVIDED);
            prin1(task_processor.ti_response(task_info), stream);
            terpri(stream);
            write_string(task_processor.$str59$_error_message_, stream, UNPROVIDED, UNPROVIDED);
            prin1(task_processor.ti_error_message(task_info), stream);
            print_macros.print_unreadable_object_postamble(stream, task_info, T, T);
        }
        return task_info;
    }

    public static final SubLObject task_result_set_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject task_result_set_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject task_result_set_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.task_processor.$task_result_set_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject task_result_set_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.task_processor.$task_result_set_native.class ? T : NIL;
    }

    public static final SubLObject task_result_set_result_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_RESULT_SET_P);
        return v_object.getField2();
    }

    public static SubLObject task_result_set_result(final SubLObject v_object) {
        assert NIL != task_processor.task_result_set_p(v_object) : "! task_processor.task_result_set_p(v_object) " + "task_processor.task_result_set_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject task_result_set_task_info_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_RESULT_SET_P);
        return v_object.getField3();
    }

    public static SubLObject task_result_set_task_info(final SubLObject v_object) {
        assert NIL != task_processor.task_result_set_p(v_object) : "! task_processor.task_result_set_p(v_object) " + "task_processor.task_result_set_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject task_result_set_finished_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_RESULT_SET_P);
        return v_object.getField4();
    }

    public static SubLObject task_result_set_finished(final SubLObject v_object) {
        assert NIL != task_processor.task_result_set_p(v_object) : "! task_processor.task_result_set_p(v_object) " + "task_processor.task_result_set_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_task_result_set_result_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_RESULT_SET_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_task_result_set_result(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_result_set_p(v_object) : "! task_processor.task_result_set_p(v_object) " + "task_processor.task_result_set_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_task_result_set_task_info_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_RESULT_SET_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_task_result_set_task_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_result_set_p(v_object) : "! task_processor.task_result_set_p(v_object) " + "task_processor.task_result_set_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_task_result_set_finished_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_RESULT_SET_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_task_result_set_finished(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_result_set_p(v_object) : "! task_processor.task_result_set_p(v_object) " + "task_processor.task_result_set_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_task_result_set_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.task_processor.$task_result_set_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($RESULT)) {
                        com.cyc.cycjava.cycl.task_processor._csetf_task_result_set_result(v_new, current_value);
                    } else {
                        if (pcase_var.eql($TASK_INFO)) {
                            com.cyc.cycjava.cycl.task_processor._csetf_task_result_set_task_info(v_new, current_value);
                        } else {
                            if (pcase_var.eql($FINISHED)) {
                                com.cyc.cycjava.cycl.task_processor._csetf_task_result_set_finished(v_new, current_value);
                            } else {
                                Errors.error($str_alt41$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_task_result_set(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.task_processor.$task_result_set_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($RESULT)) {
                task_processor._csetf_task_result_set_result(v_new, current_value);
            } else
                if (pcase_var.eql($TASK_INFO)) {
                    task_processor._csetf_task_result_set_task_info(v_new, current_value);
                } else
                    if (pcase_var.eql($FINISHED)) {
                        task_processor._csetf_task_result_set_finished(v_new, current_value);
                    } else {
                        Errors.error(task_processor.$str42$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_task_result_set(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, task_processor.MAKE_TASK_RESULT_SET, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $RESULT, task_processor.task_result_set_result(obj));
        funcall(visitor_fn, obj, $SLOT, $TASK_INFO, task_processor.task_result_set_task_info(obj));
        funcall(visitor_fn, obj, $SLOT, $FINISHED, task_processor.task_result_set_finished(obj));
        funcall(visitor_fn, obj, $END, task_processor.MAKE_TASK_RESULT_SET, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_task_result_set_method(final SubLObject obj, final SubLObject visitor_fn) {
        return task_processor.visit_defstruct_task_result_set(obj, visitor_fn);
    }

    public static final SubLObject new_task_result_set_alt(SubLObject result, SubLObject task_info, SubLObject finished) {
        SubLTrampolineFile.checkType(finished, BOOLEANP);
        {
            SubLObject result_set = com.cyc.cycjava.cycl.task_processor.make_task_result_set(UNPROVIDED);
            com.cyc.cycjava.cycl.task_processor._csetf_task_result_set_result(result_set, result);
            com.cyc.cycjava.cycl.task_processor._csetf_task_result_set_task_info(result_set, task_info);
            com.cyc.cycjava.cycl.task_processor._csetf_task_result_set_finished(result_set, finished);
            return result_set;
        }
    }

    public static SubLObject new_task_result_set(final SubLObject result, final SubLObject task_info, final SubLObject finished) {
        assert NIL != booleanp(finished) : "! booleanp(finished) " + ("Types.booleanp(finished) " + "CommonSymbols.NIL != Types.booleanp(finished) ") + finished;
        final SubLObject result_set = task_processor.make_task_result_set(UNPROVIDED);
        task_processor._csetf_task_result_set_result(result_set, result);
        task_processor._csetf_task_result_set_task_info(result_set, task_info);
        task_processor._csetf_task_result_set_finished(result_set, finished);
        return result_set;
    }

    public static final SubLObject task_result_set_priority_alt(SubLObject task_result_set) {
        return com.cyc.cycjava.cycl.task_processor.ti_priority(com.cyc.cycjava.cycl.task_processor.task_result_set_task_info(task_result_set));
    }

    public static SubLObject task_result_set_priority(final SubLObject task_result_set) {
        return task_processor.ti_priority(task_processor.task_result_set_task_info(task_result_set));
    }

    public static final SubLObject task_processor_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.task_processor.print_task_processor(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject task_processor_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        task_processor.print_task_processor(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject task_processor_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.task_processor.$task_processor_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject task_processor_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.task_processor.$task_processor_native.class ? T : NIL;
    }

    public static final SubLObject tproc_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESSOR_P);
        return v_object.getField2();
    }

    public static SubLObject tproc_name(final SubLObject v_object) {
        assert NIL != task_processor.task_processor_p(v_object) : "! task_processor.task_processor_p(v_object) " + "task_processor.task_processor_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject tproc_process_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESSOR_P);
        return v_object.getField3();
    }

    public static SubLObject tproc_process(final SubLObject v_object) {
        assert NIL != task_processor.task_processor_p(v_object) : "! task_processor.task_processor_p(v_object) " + "task_processor.task_processor_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject tproc_busy_p_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESSOR_P);
        return v_object.getField4();
    }

    public static SubLObject tproc_busy_p(final SubLObject v_object) {
        assert NIL != task_processor.task_processor_p(v_object) : "! task_processor.task_processor_p(v_object) " + "task_processor.task_processor_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject tproc_task_info_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESSOR_P);
        return v_object.getField5();
    }

    public static SubLObject tproc_task_info(final SubLObject v_object) {
        assert NIL != task_processor.task_processor_p(v_object) : "! task_processor.task_processor_p(v_object) " + "task_processor.task_processor_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject _csetf_tproc_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESSOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tproc_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_processor_p(v_object) : "! task_processor.task_processor_p(v_object) " + "task_processor.task_processor_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tproc_process_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESSOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tproc_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_processor_p(v_object) : "! task_processor.task_processor_p(v_object) " + "task_processor.task_processor_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tproc_busy_p_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESSOR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tproc_busy_p(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_processor_p(v_object) : "! task_processor.task_processor_p(v_object) " + "task_processor.task_processor_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tproc_task_info_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESSOR_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tproc_task_info(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_processor_p(v_object) : "! task_processor.task_processor_p(v_object) " + "task_processor.task_processor_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject make_task_processor_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.task_processor.$task_processor_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($NAME)) {
                        com.cyc.cycjava.cycl.task_processor._csetf_tproc_name(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PROCESS)) {
                            com.cyc.cycjava.cycl.task_processor._csetf_tproc_process(v_new, current_value);
                        } else {
                            if (pcase_var.eql($BUSY_P)) {
                                com.cyc.cycjava.cycl.task_processor._csetf_tproc_busy_p(v_new, current_value);
                            } else {
                                if (pcase_var.eql($TASK_INFO)) {
                                    com.cyc.cycjava.cycl.task_processor._csetf_tproc_task_info(v_new, current_value);
                                } else {
                                    Errors.error($str_alt41$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_task_processor(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.task_processor.$task_processor_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($NAME)) {
                task_processor._csetf_tproc_name(v_new, current_value);
            } else
                if (pcase_var.eql($PROCESS)) {
                    task_processor._csetf_tproc_process(v_new, current_value);
                } else
                    if (pcase_var.eql($BUSY_P)) {
                        task_processor._csetf_tproc_busy_p(v_new, current_value);
                    } else
                        if (pcase_var.eql($TASK_INFO)) {
                            task_processor._csetf_tproc_task_info(v_new, current_value);
                        } else {
                            Errors.error(task_processor.$str42$Invalid_slot__S_for_construction_, current_arg);
                        }



        }
        return v_new;
    }

    public static SubLObject visit_defstruct_task_processor(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, task_processor.MAKE_TASK_PROCESSOR, FOUR_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $NAME, task_processor.tproc_name(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESS, task_processor.tproc_process(obj));
        funcall(visitor_fn, obj, $SLOT, $BUSY_P, task_processor.tproc_busy_p(obj));
        funcall(visitor_fn, obj, $SLOT, $TASK_INFO, task_processor.tproc_task_info(obj));
        funcall(visitor_fn, obj, $END, task_processor.MAKE_TASK_PROCESSOR, FOUR_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_task_processor_method(final SubLObject obj, final SubLObject visitor_fn) {
        return task_processor.visit_defstruct_task_processor(obj, visitor_fn);
    }

    /**
     *
     *
     * @param TASK-PROCESSOR;
    task-processor-p
     * 		
     * @param STREAM;
    streamp
     * 		
     * @param DEPTH;
    ignored
     * 		
     */
    @LispMethod(comment = "@param TASK-PROCESSOR;\ntask-processor-p\r\n\t\t\r\n@param STREAM;\nstreamp\r\n\t\t\r\n@param DEPTH;\nignored")
    public static final SubLObject print_task_processor_alt(SubLObject v_task_processor, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(v_task_processor, stream);
            } else {
                {
                    SubLObject v_object = v_task_processor;
                    SubLObject stream_2 = stream;
                    write_string($str_alt45$__, stream_2, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_2 });
                    write_char(CHAR_space, stream_2);
                    write_string($str_alt94$name_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.tproc_name(v_task_processor), stream);
                    terpri(stream);
                    write_string($str_alt95$_process_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.tproc_process(v_task_processor), stream);
                    terpri(stream);
                    write_string($str_alt96$_whostate_, stream, UNPROVIDED, UNPROVIDED);
                    princ(process_whostate(com.cyc.cycjava.cycl.task_processor.tproc_process(v_task_processor)), stream);
                    write_string($str_alt97$_busy_p_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.tproc_busy_p(v_task_processor), stream);
                    terpri(stream);
                    if (NIL != com.cyc.cycjava.cycl.task_processor.tproc_task_info(v_task_processor)) {
                        write_string($str_alt53$_request_, stream, UNPROVIDED, UNPROVIDED);
                        format_cycl_expression.format_cycl_expression(com.cyc.cycjava.cycl.task_processor.ti_request(com.cyc.cycjava.cycl.task_processor.tproc_task_info(v_task_processor)), stream, UNPROVIDED);
                        terpri(stream);
                        if (NIL != com.cyc.cycjava.cycl.task_processor.ti_response(com.cyc.cycjava.cycl.task_processor.tproc_task_info(v_task_processor))) {
                            write_string($str_alt98$_last_response_, stream, UNPROVIDED, UNPROVIDED);
                            format_cycl_expression.format_cycl_expression(com.cyc.cycjava.cycl.task_processor.ti_response(com.cyc.cycjava.cycl.task_processor.tproc_task_info(v_task_processor)), stream, UNPROVIDED);
                            terpri(stream);
                        }
                    }
                    write_char(CHAR_space, stream_2);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_2, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_2);
                }
            }
            return v_task_processor;
        }
    }

    /**
     *
     *
     * @param TASK-PROCESSOR;
    task-processor-p
     * 		
     * @param STREAM;
    streamp
     * 		
     * @param DEPTH;
    ignored
     * 		
     */
    @LispMethod(comment = "@param TASK-PROCESSOR;\ntask-processor-p\r\n\t\t\r\n@param STREAM;\nstreamp\r\n\t\t\r\n@param DEPTH;\nignored")
    public static SubLObject print_task_processor(final SubLObject v_task_processor, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(v_task_processor, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, v_task_processor, T, T);
            write_string(task_processor.$str103$name_, stream, UNPROVIDED, UNPROVIDED);
            princ(task_processor.tproc_name(v_task_processor), stream);
            terpri(stream);
            write_string(task_processor.$str104$_process_, stream, UNPROVIDED, UNPROVIDED);
            princ(task_processor.tproc_process(v_task_processor), stream);
            terpri(stream);
            write_string(task_processor.$str105$_whostate_, stream, UNPROVIDED, UNPROVIDED);
            princ(process_whostate(task_processor.tproc_process(v_task_processor)), stream);
            write_string(task_processor.$str106$_busy_p_, stream, UNPROVIDED, UNPROVIDED);
            princ(task_processor.tproc_busy_p(v_task_processor), stream);
            terpri(stream);
            if (NIL != task_processor.tproc_task_info(v_task_processor)) {
                write_string(task_processor.$str57$_request_, stream, UNPROVIDED, UNPROVIDED);
                format_cycl_expression.format_cycl_expression(task_processor.ti_request(task_processor.tproc_task_info(v_task_processor)), stream, UNPROVIDED);
                terpri(stream);
                if (NIL != task_processor.ti_response(task_processor.tproc_task_info(v_task_processor))) {
                    write_string(task_processor.$str107$_last_response_, stream, UNPROVIDED, UNPROVIDED);
                    format_cycl_expression.format_cycl_expression(task_processor.ti_response(task_processor.tproc_task_info(v_task_processor)), stream, UNPROVIDED);
                    terpri(stream);
                }
            }
            print_macros.print_unreadable_object_postamble(stream, v_task_processor, T, T);
        }
        return v_task_processor;
    }

    public static final SubLObject task_process_pool_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.task_processor.print_task_process_pool(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject task_process_pool_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        task_processor.print_task_process_pool(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject task_process_pool_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject task_process_pool_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.task_processor.$task_process_pool_native.class ? T : NIL;
    }

    public static final SubLObject tpool_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.getField2();
    }

    public static SubLObject tpool_lock(final SubLObject v_object) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject tpool_request_queue_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.getField3();
    }

    public static SubLObject tpool_request_queue(final SubLObject v_object) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject tpool_request_semaphore_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.getField4();
    }

    public static SubLObject tpool_request_semaphore(final SubLObject v_object) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject tpool_processors_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.getField5();
    }

    public static SubLObject tpool_processors(final SubLObject v_object) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject tpool_background_msgs_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.getField6();
    }

    public static SubLObject tpool_background_msgs(final SubLObject v_object) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject tpool_process_name_prefix_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.getField7();
    }

    public static SubLObject tpool_process_name_prefix(final SubLObject v_object) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject tpool_min_nbr_of_task_processors_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.getField8();
    }

    public static SubLObject tpool_min_nbr_of_task_processors(final SubLObject v_object) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject tpool_max_nbr_of_task_processors_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.getField9();
    }

    public static SubLObject tpool_max_nbr_of_task_processors(final SubLObject v_object) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject _csetf_tpool_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tpool_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_tpool_request_queue_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tpool_request_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_tpool_request_semaphore_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tpool_request_semaphore(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_tpool_processors_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tpool_processors(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_tpool_background_msgs_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_tpool_background_msgs(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_tpool_process_name_prefix_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_tpool_process_name_prefix(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_tpool_min_nbr_of_task_processors_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_tpool_min_nbr_of_task_processors(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_tpool_max_nbr_of_task_processors_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, TASK_PROCESS_POOL_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_tpool_max_nbr_of_task_processors(final SubLObject v_object, final SubLObject value) {
        assert NIL != task_processor.task_process_pool_p(v_object) : "! task_processor.task_process_pool_p(v_object) " + "task_processor.task_process_pool_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject make_task_process_pool_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.task_processor.$task_process_pool_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LOCK)) {
                        com.cyc.cycjava.cycl.task_processor._csetf_tpool_lock(v_new, current_value);
                    } else {
                        if (pcase_var.eql($REQUEST_QUEUE)) {
                            com.cyc.cycjava.cycl.task_processor._csetf_tpool_request_queue(v_new, current_value);
                        } else {
                            if (pcase_var.eql($REQUEST_SEMAPHORE)) {
                                com.cyc.cycjava.cycl.task_processor._csetf_tpool_request_semaphore(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PROCESSORS)) {
                                    com.cyc.cycjava.cycl.task_processor._csetf_tpool_processors(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($BACKGROUND_MSGS)) {
                                        com.cyc.cycjava.cycl.task_processor._csetf_tpool_background_msgs(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PROCESS_NAME_PREFIX)) {
                                            com.cyc.cycjava.cycl.task_processor._csetf_tpool_process_name_prefix(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($MIN_NBR_OF_TASK_PROCESSORS)) {
                                                com.cyc.cycjava.cycl.task_processor._csetf_tpool_min_nbr_of_task_processors(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($MAX_NBR_OF_TASK_PROCESSORS)) {
                                                    com.cyc.cycjava.cycl.task_processor._csetf_tpool_max_nbr_of_task_processors(v_new, current_value);
                                                } else {
                                                    Errors.error($str_alt41$Invalid_slot__S_for_construction_, current_arg);
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_task_process_pool(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.task_processor.$task_process_pool_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                task_processor._csetf_tpool_lock(v_new, current_value);
            } else
                if (pcase_var.eql($REQUEST_QUEUE)) {
                    task_processor._csetf_tpool_request_queue(v_new, current_value);
                } else
                    if (pcase_var.eql($REQUEST_SEMAPHORE)) {
                        task_processor._csetf_tpool_request_semaphore(v_new, current_value);
                    } else
                        if (pcase_var.eql($PROCESSORS)) {
                            task_processor._csetf_tpool_processors(v_new, current_value);
                        } else
                            if (pcase_var.eql($BACKGROUND_MSGS)) {
                                task_processor._csetf_tpool_background_msgs(v_new, current_value);
                            } else
                                if (pcase_var.eql(task_processor.$PROCESS_NAME_PREFIX)) {
                                    task_processor._csetf_tpool_process_name_prefix(v_new, current_value);
                                } else
                                    if (pcase_var.eql(task_processor.$MIN_NBR_OF_TASK_PROCESSORS)) {
                                        task_processor._csetf_tpool_min_nbr_of_task_processors(v_new, current_value);
                                    } else
                                        if (pcase_var.eql(task_processor.$MAX_NBR_OF_TASK_PROCESSORS)) {
                                            task_processor._csetf_tpool_max_nbr_of_task_processors(v_new, current_value);
                                        } else {
                                            Errors.error(task_processor.$str42$Invalid_slot__S_for_construction_, current_arg);
                                        }







        }
        return v_new;
    }

    public static SubLObject visit_defstruct_task_process_pool(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, task_processor.MAKE_TASK_PROCESS_POOL, EIGHT_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, task_processor.tpool_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUEST_QUEUE, task_processor.tpool_request_queue(obj));
        funcall(visitor_fn, obj, $SLOT, $REQUEST_SEMAPHORE, task_processor.tpool_request_semaphore(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESSORS, task_processor.tpool_processors(obj));
        funcall(visitor_fn, obj, $SLOT, $BACKGROUND_MSGS, task_processor.tpool_background_msgs(obj));
        funcall(visitor_fn, obj, $SLOT, task_processor.$PROCESS_NAME_PREFIX, task_processor.tpool_process_name_prefix(obj));
        funcall(visitor_fn, obj, $SLOT, task_processor.$MIN_NBR_OF_TASK_PROCESSORS, task_processor.tpool_min_nbr_of_task_processors(obj));
        funcall(visitor_fn, obj, $SLOT, task_processor.$MAX_NBR_OF_TASK_PROCESSORS, task_processor.tpool_max_nbr_of_task_processors(obj));
        funcall(visitor_fn, obj, $END, task_processor.MAKE_TASK_PROCESS_POOL, EIGHT_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_task_process_pool_method(final SubLObject obj, final SubLObject visitor_fn) {
        return task_processor.visit_defstruct_task_process_pool(obj, visitor_fn);
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @param STREAM;
    streamp
     * 		
     * @param DEPTH;
    ignored
     * 		
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@param STREAM;\nstreamp\r\n\t\t\r\n@param DEPTH;\nignored")
    public static final SubLObject print_task_process_pool_alt(SubLObject task_process_pool, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_readably$.getDynamicValue(thread)) {
                print_not_readable(task_process_pool, stream);
            } else {
                {
                    SubLObject v_object = task_process_pool;
                    SubLObject stream_3 = stream;
                    write_string($str_alt45$__, stream_3, UNPROVIDED, UNPROVIDED);
                    write(type_of(v_object), new SubLObject[]{ $STREAM, stream_3 });
                    write_char(CHAR_space, stream_3);
                    write_string($str_alt131$_request_queue_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.tpool_request_queue(task_process_pool), stream);
                    terpri(stream);
                    write_string($str_alt132$_processors_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.tpool_processors(task_process_pool), stream);
                    terpri(stream);
                    write_string($str_alt133$_process_name_prefix_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.get_tpool_process_name_prefix(task_process_pool), stream);
                    terpri(stream);
                    write_string($str_alt134$_min_processors_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.get_tpool_min_nbr_of_task_processors(task_process_pool), stream);
                    terpri(stream);
                    write_string($str_alt135$_max_processors_, stream, UNPROVIDED, UNPROVIDED);
                    princ(com.cyc.cycjava.cycl.task_processor.get_tpool_max_nbr_of_task_processors(task_process_pool), stream);
                    terpri(stream);
                    write_char(CHAR_space, stream_3);
                    write(pointer(v_object), new SubLObject[]{ $STREAM, stream_3, $BASE, SIXTEEN_INTEGER });
                    write_char(CHAR_greater, stream_3);
                }
            }
            return task_process_pool;
        }
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @param STREAM;
    streamp
     * 		
     * @param DEPTH;
    ignored
     * 		
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@param STREAM;\nstreamp\r\n\t\t\r\n@param DEPTH;\nignored")
    public static SubLObject print_task_process_pool(final SubLObject task_process_pool, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(task_process_pool, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, task_process_pool, T, T);
            write_string(task_processor.$str143$_request_queue_, stream, UNPROVIDED, UNPROVIDED);
            princ(task_processor.tpool_request_queue(task_process_pool), stream);
            terpri(stream);
            write_string(task_processor.$str144$_processors_, stream, UNPROVIDED, UNPROVIDED);
            princ(task_processor.tpool_processors(task_process_pool), stream);
            terpri(stream);
            write_string(task_processor.$str145$_process_name_prefix_, stream, UNPROVIDED, UNPROVIDED);
            princ(task_processor.get_tpool_process_name_prefix(task_process_pool), stream);
            terpri(stream);
            write_string(task_processor.$str146$_min_processors_, stream, UNPROVIDED, UNPROVIDED);
            princ(task_processor.get_tpool_min_nbr_of_task_processors(task_process_pool), stream);
            terpri(stream);
            write_string(task_processor.$str147$_max_processors_, stream, UNPROVIDED, UNPROVIDED);
            princ(task_processor.get_tpool_max_nbr_of_task_processors(task_process_pool), stream);
            terpri(stream);
            print_macros.print_unreadable_object_postamble(stream, task_process_pool, T, T);
        }
        return task_process_pool;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @param STREAM;
     * 		streamp
     * 		Displays information about the task processors on STREAM.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@param STREAM;\r\n\t\tstreamp\r\n\t\tDisplays information about the task processors on STREAM.")
    public static final SubLObject display_task_processors_alt(SubLObject task_process_pool, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        SubLTrampolineFile.checkType(stream, STREAMP);
        if (NIL != com.cyc.cycjava.cycl.task_processor.tpool_processors(task_process_pool)) {
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.task_processor.tpool_processors(task_process_pool);
                SubLObject v_task_processor = NIL;
                for (v_task_processor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_task_processor = cdolist_list_var.first()) {
                    print(v_task_processor, stream);
                }
            }
        } else {
            princ($str_alt136$There_are_no_task_processors_, stream);
            terpri(stream);
        }
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @param STREAM;
     * 		streamp
     * 		Displays information about the task processors on STREAM.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@param STREAM;\r\n\t\tstreamp\r\n\t\tDisplays information about the task processors on STREAM.")
    public static SubLObject display_task_processors(final SubLObject task_process_pool, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        assert NIL != streamp(stream) : "! streamp(stream) " + ("Types.streamp(stream) " + "CommonSymbols.NIL != Types.streamp(stream) ") + stream;
        if (NIL != task_processor.tpool_processors(task_process_pool)) {
            SubLObject cdolist_list_var = task_processor.tpool_processors(task_process_pool);
            SubLObject v_task_processor = NIL;
            v_task_processor = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                print(v_task_processor, stream);
                cdolist_list_var = cdolist_list_var.rest();
                v_task_processor = cdolist_list_var.first();
            } 
        } else {
            princ(task_processor.$str148$There_are_no_task_processors_, stream);
            terpri(stream);
        }
        return NIL;
    }

    /**
     * Displays the requests for all currently-active task-processors
     *
     * @unknown this does an N^2 search, because there's no obvious way to get from a process to task-processor
    associated with that process.
     */
    @LispMethod(comment = "Displays the requests for all currently-active task-processors\r\n\r\n@unknown this does an N^2 search, because there\'s no obvious way to get from a process to task-processor\r\nassociated with that process.")
    public static final SubLObject display_active_task_processes_alt(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject cdolist_list_var = all_processes();
            SubLObject process = NIL;
            for (process = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , process = cdolist_list_var.first()) {
                {
                    SubLObject task_pool = com.cyc.cycjava.cycl.task_processor.get_task_process_pool_for_process(process);
                    SubLObject pool_processors = (NIL != task_pool) ? ((SubLObject) (com.cyc.cycjava.cycl.task_processor.tpool_processors(task_pool))) : NIL;
                    SubLObject doneP = NIL;
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = pool_processors;
                            SubLObject pool_processor = NIL;
                            for (pool_processor = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pool_processor = csome_list_var.first()) {
                                if (com.cyc.cycjava.cycl.task_processor.tproc_process(pool_processor).equal(process)) {
                                    if (NIL != com.cyc.cycjava.cycl.task_processor.tproc_task_info(pool_processor)) {
                                        doneP = T;
                                        format(stream, $str_alt137$_S__, process);
                                        format(stream, $str_alt138$request__S__, com.cyc.cycjava.cycl.task_processor.ti_request(com.cyc.cycjava.cycl.task_processor.tproc_task_info(pool_processor)));
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        return NIL;
    }

    /**
     * Displays the requests for all currently-active task-processors
     *
     * @unknown this does an N^2 search, because there's no obvious way to get from a process to task-processor
    associated with that process.
     */
    @LispMethod(comment = "Displays the requests for all currently-active task-processors\r\n\r\n@unknown this does an N^2 search, because there\'s no obvious way to get from a process to task-processor\r\nassociated with that process.")
    public static SubLObject display_active_task_processes(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject task_pool = task_processor.get_task_process_pool_for_process(process);
            final SubLObject pool_processors = (NIL != task_pool) ? task_processor.tpool_processors(task_pool) : NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                SubLObject csome_list_var = pool_processors;
                SubLObject pool_processor = NIL;
                pool_processor = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    if ((task_processor.tproc_process(pool_processor).equal(process) && (NIL != task_processor.tproc_task_info(pool_processor))) && (NIL != task_processor.ti_request(task_processor.tproc_task_info(pool_processor)))) {
                        doneP = T;
                        format(stream, task_processor.$str149$_S__, process);
                        format(stream, task_processor.$str150$request__S__, task_processor.ti_request(task_processor.tproc_task_info(pool_processor)));
                    }
                    csome_list_var = csome_list_var.rest();
                    pool_processor = csome_list_var.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Return T when there are task processors.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tReturn T when there are task processors.")
    public static final SubLObject task_processors_initialized_p_alt(SubLObject task_process_pool) {
        if (NIL == com.cyc.cycjava.cycl.task_processor.task_process_pool_p(task_process_pool)) {
            return NIL;
        }
        return listp(com.cyc.cycjava.cycl.task_processor.tpool_processors(task_process_pool));
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Return T when there are task processors.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tReturn T when there are task processors.")
    public static SubLObject task_processors_initialized_p(final SubLObject task_process_pool) {
        if (NIL == task_processor.task_process_pool_p(task_process_pool)) {
            return NIL;
        }
        return listp(task_processor.tpool_processors(task_process_pool));
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return lock-p
    Return the task process pool lock object.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return lock-p\r\nReturn the task process pool lock object.")
    public static final SubLObject get_tpool_lock_alt(SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        return com.cyc.cycjava.cycl.task_processor.tpool_lock(task_process_pool);
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return lock-p
    Return the task process pool lock object.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return lock-p\r\nReturn the task process pool lock object.")
    public static SubLObject get_tpool_lock(final SubLObject task_process_pool) {
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        return task_processor.tpool_lock(task_process_pool);
    }

    /**
     *
     *
     * @param LOCK;
    lock-p
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the LOCK for TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param LOCK;\nlock-p\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the LOCK for TASK-PROCESS-POOL.")
    public static final SubLObject set_tpool_lock_alt(SubLObject lock, SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(lock, LOCK_P);
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        com.cyc.cycjava.cycl.task_processor._csetf_tpool_lock(task_process_pool, lock);
        return NIL;
    }

    /**
     *
     *
     * @param LOCK;
    lock-p
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the LOCK for TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param LOCK;\nlock-p\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the LOCK for TASK-PROCESS-POOL.")
    public static SubLObject set_tpool_lock(final SubLObject lock, final SubLObject task_process_pool) {
        assert NIL != lock_p(lock) : "! lock_p(lock) " + ("Types.lock_p(lock) " + "CommonSymbols.NIL != Types.lock_p(lock) ") + lock;
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        task_processor._csetf_tpool_lock(task_process_pool, lock);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return priority-queue-p
    Return the task process pool request priority queue.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return priority-queue-p\r\nReturn the task process pool request priority queue.")
    public static final SubLObject get_tpool_request_queue_alt(SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        return com.cyc.cycjava.cycl.task_processor.tpool_request_queue(task_process_pool);
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return priority-queue-p
    Return the task process pool request priority queue.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return priority-queue-p\r\nReturn the task process pool request priority queue.")
    public static SubLObject get_tpool_request_queue(final SubLObject task_process_pool) {
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        return task_processor.tpool_request_queue(task_process_pool);
    }

    /**
     *
     *
     * @param REQUEST-QUEUE;
    priority-queue-p
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the REQUEST-QUEUE for TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param REQUEST-QUEUE;\npriority-queue-p\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the REQUEST-QUEUE for TASK-PROCESS-POOL.")
    public static final SubLObject set_tpool_request_queue_alt(SubLObject request_queue, SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(request_queue, PRIORITY_QUEUE_P);
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        com.cyc.cycjava.cycl.task_processor._csetf_tpool_request_queue(task_process_pool, request_queue);
        return NIL;
    }

    /**
     *
     *
     * @param REQUEST-QUEUE;
    priority-queue-p
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the REQUEST-QUEUE for TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param REQUEST-QUEUE;\npriority-queue-p\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the REQUEST-QUEUE for TASK-PROCESS-POOL.")
    public static SubLObject set_tpool_request_queue(final SubLObject request_queue, final SubLObject task_process_pool) {
        assert NIL != queues.priority_queue_p(request_queue) : "! queues.priority_queue_p(request_queue) " + ("queues.priority_queue_p(request_queue) " + "CommonSymbols.NIL != queues.priority_queue_p(request_queue) ") + request_queue;
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        task_processor._csetf_tpool_request_queue(task_process_pool, request_queue);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return listp
    Return the list of task processors which are in the given TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return listp\r\nReturn the list of task processors which are in the given TASK-PROCESS-POOL.")
    public static final SubLObject get_tpool_processors_alt(SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        return com.cyc.cycjava.cycl.task_processor.tpool_processors(task_process_pool);
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return listp
    Return the list of task processors which are in the given TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return listp\r\nReturn the list of task processors which are in the given TASK-PROCESS-POOL.")
    public static SubLObject get_tpool_processors(final SubLObject task_process_pool) {
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        return task_processor.tpool_processors(task_process_pool);
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return integerp
    Return the number of task processors which are in the given TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return integerp\r\nReturn the number of task processors which are in the given TASK-PROCESS-POOL.")
    public static final SubLObject get_tpool_processors_nbr_alt(SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        return length(com.cyc.cycjava.cycl.task_processor.tpool_processors(task_process_pool));
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return integerp
    Return the number of task processors which are in the given TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return integerp\r\nReturn the number of task processors which are in the given TASK-PROCESS-POOL.")
    public static SubLObject get_tpool_processors_nbr(final SubLObject task_process_pool) {
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        return length(task_processor.tpool_processors(task_process_pool));
    }

    /**
     *
     *
     * @param TASK-PROCESSOR;
    task-processor-p
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Pushes the TASK-PROCESSOR onto the list of task processors for TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESSOR;\ntask-processor-p\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tPushes the TASK-PROCESSOR onto the list of task processors for TASK-PROCESS-POOL.")
    public static final SubLObject push_tpool_processor_alt(SubLObject v_task_processor, SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(v_task_processor, TASK_PROCESSOR_P);
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        {
            SubLObject task_processors = com.cyc.cycjava.cycl.task_processor.tpool_processors(task_process_pool);
            task_processors = cons(v_task_processor, task_processors);
            com.cyc.cycjava.cycl.task_processor._csetf_tpool_processors(task_process_pool, task_processors);
        }
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESSOR;
    task-processor-p
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Pushes the TASK-PROCESSOR onto the list of task processors for TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESSOR;\ntask-processor-p\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tPushes the TASK-PROCESSOR onto the list of task processors for TASK-PROCESS-POOL.")
    public static SubLObject push_tpool_processor(final SubLObject v_task_processor, final SubLObject task_process_pool) {
        assert NIL != task_processor.task_processor_p(v_task_processor) : "! task_processor.task_processor_p(v_task_processor) " + ("task_processor.task_processor_p(v_task_processor) " + "CommonSymbols.NIL != task_processor.task_processor_p(v_task_processor) ") + v_task_processor;
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        SubLObject task_processors = task_processor.tpool_processors(task_process_pool);
        task_processors = cons(v_task_processor, task_processors);
        task_processor._csetf_tpool_processors(task_process_pool, task_processors);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESSORS;
    listp
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the TASK-PROCESSORS for TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESSORS;\nlistp\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the TASK-PROCESSORS for TASK-PROCESS-POOL.")
    public static final SubLObject set_tpool_processors_alt(SubLObject task_processors, SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(task_processors, LISTP);
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        com.cyc.cycjava.cycl.task_processor._csetf_tpool_processors(task_process_pool, task_processors);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESSORS;
    listp
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the TASK-PROCESSORS for TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESSORS;\nlistp\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the TASK-PROCESSORS for TASK-PROCESS-POOL.")
    public static SubLObject set_tpool_processors(final SubLObject task_processors, final SubLObject task_process_pool) {
        assert NIL != listp(task_processors) : "! listp(task_processors) " + ("Types.listp(task_processors) " + "CommonSymbols.NIL != Types.listp(task_processors) ") + task_processors;
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        task_processor._csetf_tpool_processors(task_process_pool, task_processors);
        return NIL;
    }

    /**
     *
     *
     * @param PATH;
     * 		stringp
     * 		Sets the optional file path for the task processor pool background messages.
     */
    @LispMethod(comment = "@param PATH;\r\n\t\tstringp\r\n\t\tSets the optional file path for the task processor pool background messages.")
    public static final SubLObject set_tpool_background_msg_path_alt(SubLObject path) {
        SubLTrampolineFile.checkType(path, STRINGP);
        $tpool_background_msg_path$.setGlobalValue(path);
        return NIL;
    }

    /**
     *
     *
     * @param PATH;
     * 		stringp
     * 		Sets the optional file path for the task processor pool background messages.
     */
    @LispMethod(comment = "@param PATH;\r\n\t\tstringp\r\n\t\tSets the optional file path for the task processor pool background messages.")
    public static SubLObject set_tpool_background_msg_path(final SubLObject path) {
        assert NIL != stringp(path) : "! stringp(path) " + ("Types.stringp(path) " + "CommonSymbols.NIL != Types.stringp(path) ") + path;
        task_processor.$tpool_background_msg_path$.setGlobalValue(path);
        return NIL;
    }

    /**
     *
     *
     * @param MSG;
    stringp
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Pushes a diagnostic MSG on the background message list for TASK-PROCESS-POOL, or if
     * 		a filepath is present, then the the message is output to the file stream.
     */
    @LispMethod(comment = "@param MSG;\nstringp\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tPushes a diagnostic MSG on the background message list for TASK-PROCESS-POOL, or if\r\n\t\ta filepath is present, then the the message is output to the file stream.")
    public static final SubLObject push_tpool_background_msg_alt(SubLObject msg, SubLObject task_process_pool) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(msg, STRINGP);
            if (NIL != task_process_pool) {
                SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
            }
            if (NIL == $tpool_background_msg_lock$.getGlobalValue()) {
                $tpool_background_msg_lock$.setGlobalValue(make_lock($str_alt144$tpool_background_msg_lock));
            }
            {
                SubLObject lock = $tpool_background_msg_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL != $tpool_background_msg_path$.getGlobalValue()) {
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (!$tpool_background_msg_path$.getGlobalValue().isString()) {
                                Errors.error($str_alt145$_A_is_not_a_valid_file_specificat, $tpool_background_msg_path$.getGlobalValue());
                            }
                        }
                        if (NIL == $tpool_background_msg_stream$.getGlobalValue()) {
                            $tpool_background_msg_stream$.setGlobalValue(StreamsLow.open($tpool_background_msg_path$.getGlobalValue(), new SubLObject[]{ $DIRECTION, $OUTPUT, $IF_DOES_NOT_EXIST, $CREATE, $IF_EXISTS, $OVERWRITE }));
                        }
                        princ($str_alt152$_, $tpool_background_msg_stream$.getGlobalValue());
                        princ(process_name(current_process()), $tpool_background_msg_stream$.getGlobalValue());
                        princ($str_alt153$_, $tpool_background_msg_stream$.getGlobalValue());
                        terpri($tpool_background_msg_stream$.getGlobalValue());
                        princ($str_alt154$__, $tpool_background_msg_stream$.getGlobalValue());
                        princ(msg, $tpool_background_msg_stream$.getGlobalValue());
                        terpri($tpool_background_msg_stream$.getGlobalValue());
                        force_output($tpool_background_msg_stream$.getGlobalValue());
                    } else {
                        if (NIL != task_process_pool) {
                            {
                                SubLObject background_msgs = NIL;
                                background_msgs = com.cyc.cycjava.cycl.task_processor.tpool_background_msgs(task_process_pool);
                                background_msgs = cons(cconcatenate(numeric_date_utilities.timestring(UNPROVIDED), new SubLObject[]{ $str_alt155$_, msg }), background_msgs);
                                com.cyc.cycjava.cycl.task_processor._csetf_tpool_background_msgs(task_process_pool, background_msgs);
                            }
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param MSG;
    stringp
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Pushes a diagnostic MSG on the background message list for TASK-PROCESS-POOL, or if
     * 		a filepath is present, then the the message is output to the file stream.
     */
    @LispMethod(comment = "@param MSG;\nstringp\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tPushes a diagnostic MSG on the background message list for TASK-PROCESS-POOL, or if\r\n\t\ta filepath is present, then the the message is output to the file stream.")
    public static SubLObject push_tpool_background_msg(final SubLObject msg, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(msg) : "! stringp(msg) " + ("Types.stringp(msg) " + "CommonSymbols.NIL != Types.stringp(msg) ") + msg;
        if (((NIL != task_process_pool) && (!task_processor.assertionsDisabledSynth)) && (NIL == task_processor.task_process_pool_p(task_process_pool))) {
            throw new AssertionError(task_process_pool);
        }
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$tpool_background_msg_lock$.getGlobalValue());
            if (NIL != task_processor.$tpool_background_msg_path$.getGlobalValue()) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!task_processor.$tpool_background_msg_path$.getGlobalValue().isString())) {
                    Errors.error(task_processor.$str159$_A_is_not_a_valid_file_specificat, task_processor.$tpool_background_msg_path$.getGlobalValue());
                }
                if (NIL == task_processor.$tpool_background_msg_stream$.getGlobalValue()) {
                    task_processor.$tpool_background_msg_stream$.setGlobalValue(StreamsLow.open(task_processor.$tpool_background_msg_path$.getGlobalValue(), new SubLObject[]{ $DIRECTION, $OUTPUT, task_processor.$IF_DOES_NOT_EXIST, $CREATE, $IF_EXISTS, $OVERWRITE }));
                }
                princ(task_processor.$str166$_, task_processor.$tpool_background_msg_stream$.getGlobalValue());
                princ(process_name(current_process()), task_processor.$tpool_background_msg_stream$.getGlobalValue());
                princ(task_processor.$str167$_, task_processor.$tpool_background_msg_stream$.getGlobalValue());
                terpri(task_processor.$tpool_background_msg_stream$.getGlobalValue());
                princ(task_processor.$$$__, task_processor.$tpool_background_msg_stream$.getGlobalValue());
                princ(numeric_date_utilities.timestring(UNPROVIDED), task_processor.$tpool_background_msg_stream$.getGlobalValue());
                princ(task_processor.$$$__, task_processor.$tpool_background_msg_stream$.getGlobalValue());
                princ(msg, task_processor.$tpool_background_msg_stream$.getGlobalValue());
                terpri(task_processor.$tpool_background_msg_stream$.getGlobalValue());
            } else
                if ((NIL != task_processor.$queue_tpool_background_msgs_when_no_pathP$.getDynamicValue(thread)) && (NIL != task_process_pool)) {
                    SubLObject background_msgs = NIL;
                    background_msgs = task_processor.tpool_background_msgs(task_process_pool);
                    background_msgs = cons(cconcatenate(numeric_date_utilities.timestring(UNPROVIDED), new SubLObject[]{ task_processor.$$$_, msg }), background_msgs);
                    task_processor._csetf_tpool_background_msgs(task_process_pool, background_msgs);
                }

        } finally {
            if (NIL != release) {
                release_lock(task_processor.$tpool_background_msg_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject flush_tpool_background_msgs() {
        if (task_processor.$tpool_background_msg_lock$.getGlobalValue().isLock()) {
            SubLObject release = NIL;
            try {
                release = seize_lock(task_processor.$tpool_background_msg_lock$.getGlobalValue());
                if (NIL != task_processor.$tpool_background_msg_path$.getGlobalValue()) {
                    force_output(task_processor.$tpool_background_msg_stream$.getGlobalValue());
                }
            } finally {
                if (NIL != release) {
                    release_lock(task_processor.$tpool_background_msg_lock$.getGlobalValue());
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Show and reset the task processor background messages for TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tShow and reset the task processor background messages for TASK-PROCESS-POOL.")
    public static final SubLObject show_tp_msgs_alt(SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        {
            SubLObject cdolist_list_var = nreverse(com.cyc.cycjava.cycl.task_processor.tpool_background_msgs(task_process_pool));
            SubLObject msg = NIL;
            for (msg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , msg = cdolist_list_var.first()) {
                princ(msg, UNPROVIDED);
            }
        }
        com.cyc.cycjava.cycl.task_processor._csetf_tpool_background_msgs(task_process_pool, NIL);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Show and reset the task processor background messages for TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tShow and reset the task processor background messages for TASK-PROCESS-POOL.")
    public static SubLObject show_tp_msgs(final SubLObject task_process_pool) {
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        SubLObject cdolist_list_var = nreverse(task_processor.tpool_background_msgs(task_process_pool));
        SubLObject msg = NIL;
        msg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            princ(msg, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            msg = cdolist_list_var.first();
        } 
        task_processor._csetf_tpool_background_msgs(task_process_pool, NIL);
        return NIL;
    }

    /**
     *
     *
     * @param PROCESS-NAME;
     * 		stringp
     * 		Show and reset the task processor background messages for the task-process-pool
     * 		containing the running process having PROCESS-NAME.
     */
    @LispMethod(comment = "@param PROCESS-NAME;\r\n\t\tstringp\r\n\t\tShow and reset the task processor background messages for the task-process-pool\r\n\t\tcontaining the running process having PROCESS-NAME.")
    public static final SubLObject show_tp_msgs_with_process_name_alt(SubLObject process_name) {
        SubLTrampolineFile.checkType(process_name, STRINGP);
        com.cyc.cycjava.cycl.task_processor.show_tp_msgs(com.cyc.cycjava.cycl.task_processor.find_task_process_pool(process_name));
        return NIL;
    }

    /**
     *
     *
     * @param PROCESS-NAME;
     * 		stringp
     * 		Show and reset the task processor background messages for the task-process-pool
     * 		containing the running process having PROCESS-NAME.
     */
    @LispMethod(comment = "@param PROCESS-NAME;\r\n\t\tstringp\r\n\t\tShow and reset the task processor background messages for the task-process-pool\r\n\t\tcontaining the running process having PROCESS-NAME.")
    public static SubLObject show_tp_msgs_with_process_name(final SubLObject process_name) {
        assert NIL != stringp(process_name) : "! stringp(process_name) " + ("Types.stringp(process_name) " + "CommonSymbols.NIL != Types.stringp(process_name) ") + process_name;
        task_processor.show_tp_msgs(task_processor.find_task_process_pool(process_name));
        return NIL;
    }

    /**
     *
     *
     * @param PROCESS-NAME-PREFIX;
    stringp
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the PROCESS-NAME-PREFIX for processes in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param PROCESS-NAME-PREFIX;\nstringp\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the PROCESS-NAME-PREFIX for processes in TASK-PROCESS-POOL.")
    public static final SubLObject set_tpool_process_name_prefix_alt(SubLObject process_name_prefix, SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(process_name_prefix, STRINGP);
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        com.cyc.cycjava.cycl.task_processor._csetf_tpool_process_name_prefix(task_process_pool, process_name_prefix);
        return NIL;
    }

    /**
     *
     *
     * @param PROCESS-NAME-PREFIX;
    stringp
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the PROCESS-NAME-PREFIX for processes in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param PROCESS-NAME-PREFIX;\nstringp\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the PROCESS-NAME-PREFIX for processes in TASK-PROCESS-POOL.")
    public static SubLObject set_tpool_process_name_prefix(final SubLObject process_name_prefix, final SubLObject task_process_pool) {
        assert NIL != stringp(process_name_prefix) : "! stringp(process_name_prefix) " + ("Types.stringp(process_name_prefix) " + "CommonSymbols.NIL != Types.stringp(process_name_prefix) ") + process_name_prefix;
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        task_processor._csetf_tpool_process_name_prefix(task_process_pool, process_name_prefix);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return stringp
    Return the process name prefix for processes in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return stringp\r\nReturn the process name prefix for processes in TASK-PROCESS-POOL.")
    public static final SubLObject get_tpool_process_name_prefix_alt(SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        return com.cyc.cycjava.cycl.task_processor.tpool_process_name_prefix(task_process_pool);
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return stringp
    Return the process name prefix for processes in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return stringp\r\nReturn the process name prefix for processes in TASK-PROCESS-POOL.")
    public static SubLObject get_tpool_process_name_prefix(final SubLObject task_process_pool) {
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        return task_processor.tpool_process_name_prefix(task_process_pool);
    }

    /**
     *
     *
     * @param MIN-NBR-OF-TASK-PROCESSORS
     * 		; integerp
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the MIN-NBR-OF-TASK-PROCESSORS in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param MIN-NBR-OF-TASK-PROCESSORS\r\n\t\t; integerp\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the MIN-NBR-OF-TASK-PROCESSORS in TASK-PROCESS-POOL.")
    public static final SubLObject set_tpool_min_nbr_of_task_processors_alt(SubLObject min_nbr_of_task_processors, SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(min_nbr_of_task_processors, INTEGERP);
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        com.cyc.cycjava.cycl.task_processor._csetf_tpool_min_nbr_of_task_processors(task_process_pool, min_nbr_of_task_processors);
        return NIL;
    }

    /**
     *
     *
     * @param MIN-NBR-OF-TASK-PROCESSORS
     * 		; integerp
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the MIN-NBR-OF-TASK-PROCESSORS in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param MIN-NBR-OF-TASK-PROCESSORS\r\n\t\t; integerp\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the MIN-NBR-OF-TASK-PROCESSORS in TASK-PROCESS-POOL.")
    public static SubLObject set_tpool_min_nbr_of_task_processors(final SubLObject min_nbr_of_task_processors, final SubLObject task_process_pool) {
        assert NIL != integerp(min_nbr_of_task_processors) : "! integerp(min_nbr_of_task_processors) " + ("Types.integerp(min_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(min_nbr_of_task_processors) ") + min_nbr_of_task_processors;
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        task_processor._csetf_tpool_min_nbr_of_task_processors(task_process_pool, min_nbr_of_task_processors);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return stringp
    Return the minimum number of task processors in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return stringp\r\nReturn the minimum number of task processors in TASK-PROCESS-POOL.")
    public static final SubLObject get_tpool_min_nbr_of_task_processors_alt(SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        return com.cyc.cycjava.cycl.task_processor.tpool_min_nbr_of_task_processors(task_process_pool);
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return stringp
    Return the minimum number of task processors in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return stringp\r\nReturn the minimum number of task processors in TASK-PROCESS-POOL.")
    public static SubLObject get_tpool_min_nbr_of_task_processors(final SubLObject task_process_pool) {
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        return task_processor.tpool_min_nbr_of_task_processors(task_process_pool);
    }

    /**
     *
     *
     * @param MAX-NBR-OF-TASK-PROCESSORS
     * 		; integerp
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the MAX-NBR-OF-TASK-PROCESSORS in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param MAX-NBR-OF-TASK-PROCESSORS\r\n\t\t; integerp\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the MAX-NBR-OF-TASK-PROCESSORS in TASK-PROCESS-POOL.")
    public static final SubLObject set_tpool_max_nbr_of_task_processors_alt(SubLObject max_nbr_of_task_processors, SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(max_nbr_of_task_processors, INTEGERP);
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        com.cyc.cycjava.cycl.task_processor._csetf_tpool_max_nbr_of_task_processors(task_process_pool, max_nbr_of_task_processors);
        return NIL;
    }

    /**
     *
     *
     * @param MAX-NBR-OF-TASK-PROCESSORS
     * 		; integerp
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Sets the MAX-NBR-OF-TASK-PROCESSORS in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param MAX-NBR-OF-TASK-PROCESSORS\r\n\t\t; integerp\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tSets the MAX-NBR-OF-TASK-PROCESSORS in TASK-PROCESS-POOL.")
    public static SubLObject set_tpool_max_nbr_of_task_processors(final SubLObject max_nbr_of_task_processors, final SubLObject task_process_pool) {
        assert NIL != integerp(max_nbr_of_task_processors) : "! integerp(max_nbr_of_task_processors) " + ("Types.integerp(max_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(max_nbr_of_task_processors) ") + max_nbr_of_task_processors;
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        task_processor._csetf_tpool_max_nbr_of_task_processors(task_process_pool, max_nbr_of_task_processors);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return stringp
    Return the maximum number of task processors in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return stringp\r\nReturn the maximum number of task processors in TASK-PROCESS-POOL.")
    public static final SubLObject get_tpool_max_nbr_of_task_processors_alt(SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        return com.cyc.cycjava.cycl.task_processor.tpool_max_nbr_of_task_processors(task_process_pool);
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return stringp
    Return the maximum number of task processors in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return stringp\r\nReturn the maximum number of task processors in TASK-PROCESS-POOL.")
    public static SubLObject get_tpool_max_nbr_of_task_processors(final SubLObject task_process_pool) {
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        return task_processor.tpool_max_nbr_of_task_processors(task_process_pool);
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return integerp
    Return the number of processes in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return integerp\r\nReturn the number of processes in TASK-PROCESS-POOL.")
    public static final SubLObject get_nbr_of_task_processors_alt(SubLObject task_process_pool) {
        return length(com.cyc.cycjava.cycl.task_processor.tpool_processors(task_process_pool));
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
    task-process-pool-p
     * 		
     * @return integerp
    Return the number of processes in TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\ntask-process-pool-p\r\n\t\t\r\n@return integerp\r\nReturn the number of processes in TASK-PROCESS-POOL.")
    public static SubLObject get_nbr_of_task_processors(final SubLObject task_process_pool) {
        return length(task_processor.tpool_processors(task_process_pool));
    }

    public static SubLObject start_task_processor_logging_to_file(final SubLObject filename, SubLObject level) {
        if (level == UNPROVIDED) {
            level = NIL;
        }
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        if (((NIL != level) && (!task_processor.assertionsDisabledSynth)) && (NIL == subl_promotions.non_negative_integer_p(level))) {
            throw new AssertionError(level);
        }
        task_processor.end_task_processor_logging_to_file();
        if (NIL != level) {
            task_processor.set_task_processor_verbosity(level);
        }
        task_processor.set_tpool_background_msg_path(filename);
        return NIL;
    }

    public static SubLObject end_task_processor_logging_to_file() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject old_file = task_processor.$tpool_background_msg_path$.getGlobalValue();
        final SubLObject old_stream = task_processor.$tpool_background_msg_stream$.getGlobalValue();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push(task_processor.$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(task_processor.IGNORE_ERRORS_HANDLER), thread);
                try {
                    if (NIL != old_stream) {
                        try {
                            task_processor.flush_tpool_background_msgs();
                        } finally {
                            final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                task_processor.$tpool_background_msg_stream$.setGlobalValue(NIL);
                                close(old_stream, UNPROVIDED);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                            }
                        }
                    }
                    task_processor.$tpool_background_msg_path$.setGlobalValue(NIL);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, task_processor.$IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        if (old_file.isString() && (NIL != Filesys.probe_file(old_file))) {
            return file_utilities.get_file_length(old_file);
        }
        return NIL;
    }

    public static SubLObject save_unlogged_task_processor_messages_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error(task_processor.$str177$Unable_to_open__S, filename);
            }
            final SubLObject out = stream;
            final SubLObject _prev_bind_2 = StreamsLow.$standard_output$.currentBinding(thread);
            try {
                StreamsLow.$standard_output$.bind(out, thread);
                task_processor.show_tp_msgs(task_processor.$api_task_process_pool$.getGlobalValue());
            } finally {
                StreamsLow.$standard_output$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return file_utilities.get_file_length(filename);
    }

    /**
     *
     *
     * @param BINDINGS;
     * 		nil or consp of two-element (var value) lists
     * @unknown atom or listp
     * @unknown functionp
     * @unknown atom or listp the result of evaluation
    Using EVAL-FN, evaluates FORM within the scope of specified variable BINDINGS.
     */
    @LispMethod(comment = "@param BINDINGS;\r\n\t\tnil or consp of two-element (var value) lists\r\n@unknown atom or listp\r\n@unknown functionp\r\n@unknown atom or listp the result of evaluation\r\nUsing EVAL-FN, evaluates FORM within the scope of specified variable BINDINGS.")
    public static final SubLObject eval_with_bindings_alt(SubLObject v_bindings, SubLObject form, SubLObject eval_fn) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject form_to_eval = NIL;
                {
                    SubLObject _prev_bind_0 = $eval_with_bindings$.currentBinding(thread);
                    try {
                        $eval_with_bindings$.bind(NIL, thread);
                        form_to_eval = list(CLET, append(v_bindings, NIL), list(CSETQ, $eval_with_bindings$, form));
                        if (symbol_function(CYC_API_EVAL) == eval_fn) {
                            eval_in_api.cyc_api_eval(form_to_eval);
                        } else {
                            if (symbol_function(EVAL) == eval_fn) {
                                eval(form_to_eval);
                            } else {
                                funcall(eval_fn, form_to_eval);
                            }
                        }
                        result = $eval_with_bindings$.getDynamicValue(thread);
                    } finally {
                        $eval_with_bindings$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     *
     *
     * @param BINDINGS;
     * 		nil or consp of two-element (var value) lists
     * @unknown atom or listp
     * @unknown functionp
     * @unknown atom or listp the result of evaluation
    Using EVAL-FN, evaluates FORM within the scope of specified variable BINDINGS.
     */
    @LispMethod(comment = "@param BINDINGS;\r\n\t\tnil or consp of two-element (var value) lists\r\n@unknown atom or listp\r\n@unknown functionp\r\n@unknown atom or listp the result of evaluation\r\nUsing EVAL-FN, evaluates FORM within the scope of specified variable BINDINGS.")
    public static SubLObject eval_with_bindings(final SubLObject v_bindings, final SubLObject form, final SubLObject eval_fn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject form_to_eval = NIL;
        final SubLObject _prev_bind_0 = task_processor.$eval_with_bindings$.currentBinding(thread);
        try {
            task_processor.$eval_with_bindings$.bind(NIL, thread);
            form_to_eval = list(CLET, append(v_bindings, NIL), list(CSETQ, task_processor.$eval_with_bindings$, form));
            try {
                process_utilities.current_process_note_form(form_to_eval);
                if (symbol_function(task_processor.CYC_API_EVAL).eql(eval_fn)) {
                    eval_in_api.cyc_api_eval(form_to_eval);
                } else
                    if (symbol_function(EVAL).eql(eval_fn)) {
                        eval(form_to_eval);
                    } else {
                        funcall(eval_fn, form_to_eval);
                    }

            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    process_utilities.current_process_clear_form();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
            result = task_processor.$eval_with_bindings$.getDynamicValue(thread);
        } finally {
            task_processor.$eval_with_bindings$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     *
     *
     * @param PROCESS;
    processp
     * 		
     * @return task-process-pool-p
    Returns the task-process-pool parent of the given process, or
    NIL if not found.
     */
    @LispMethod(comment = "@param PROCESS;\nprocessp\r\n\t\t\r\n@return task-process-pool-p\r\nReturns the task-process-pool parent of the given process, or\r\nNIL if not found.")
    public static final SubLObject get_task_process_pool_for_process_alt(SubLObject process) {
        SubLTrampolineFile.checkType(process, PROCESSP);
        return dictionary_utilities.synchronized_dictionary_lookup($process_to_task_process_pool$.getGlobalValue(), process, UNPROVIDED);
    }

    /**
     *
     *
     * @param PROCESS;
    processp
     * 		
     * @return task-process-pool-p
    Returns the task-process-pool parent of the given process, or
    NIL if not found.
     */
    @LispMethod(comment = "@param PROCESS;\nprocessp\r\n\t\t\r\n@return task-process-pool-p\r\nReturns the task-process-pool parent of the given process, or\r\nNIL if not found.")
    public static SubLObject get_task_process_pool_for_process(final SubLObject process) {
        assert NIL != processp(process) : "! processp(process) " + ("Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) ") + process;
        return dictionary_utilities.synchronized_dictionary_lookup(task_processor.$process_to_task_process_pool$.getGlobalValue(), process, UNPROVIDED);
    }

    /**
     *
     *
     * @param PROCESS;
    processp
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Adds the task-process-pool parent of the given process.
     */
    @LispMethod(comment = "@param PROCESS;\nprocessp\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tAdds the task-process-pool parent of the given process.")
    public static final SubLObject add_task_process_pool_for_process_alt(SubLObject process, SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(process, PROCESSP);
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        return dictionary_utilities.synchronized_dictionary_enter($process_to_task_process_pool$.getGlobalValue(), process, task_process_pool);
    }

    /**
     *
     *
     * @param PROCESS;
    processp
     * 		
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Adds the task-process-pool parent of the given process.
     */
    @LispMethod(comment = "@param PROCESS;\nprocessp\r\n\t\t\r\n@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tAdds the task-process-pool parent of the given process.")
    public static SubLObject add_task_process_pool_for_process(final SubLObject process, final SubLObject task_process_pool) {
        assert NIL != processp(process) : "! processp(process) " + ("Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) ") + process;
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        return dictionary_utilities.synchronized_dictionary_enter(task_processor.$process_to_task_process_pool$.getGlobalValue(), process, task_process_pool);
    }

    /**
     *
     *
     * @param PROCESS;
     * 		processp
     * 		Removes the task-process-pool parent of the given process.
     */
    @LispMethod(comment = "@param PROCESS;\r\n\t\tprocessp\r\n\t\tRemoves the task-process-pool parent of the given process.")
    public static final SubLObject remove_task_process_pool_for_process_alt(SubLObject process) {
        SubLTrampolineFile.checkType(process, PROCESSP);
        return dictionary_utilities.synchronized_dictionary_remove($process_to_task_process_pool$.getGlobalValue(), process);
    }

    /**
     *
     *
     * @param PROCESS;
     * 		processp
     * 		Removes the task-process-pool parent of the given process.
     */
    @LispMethod(comment = "@param PROCESS;\r\n\t\tprocessp\r\n\t\tRemoves the task-process-pool parent of the given process.")
    public static SubLObject remove_task_process_pool_for_process(final SubLObject process) {
        assert NIL != processp(process) : "! processp(process) " + ("Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) ") + process;
        return dictionary_utilities.synchronized_dictionary_remove(task_processor.$process_to_task_process_pool$.getGlobalValue(), process);
    }

    public static final SubLObject ensure_task_process_being_worked_on_initialized_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lock = $task_processes_being_worked_on_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    if (NIL == cache.cache_p($task_processes_being_worked_on$.getGlobalValue())) {
                        $task_processes_being_worked_on$.setGlobalValue(cache.new_cache($task_processes_worked_on_history$.getDynamicValue(thread), symbol_function(EQUAL)));
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return $task_processes_being_worked_on$.getGlobalValue();
        }
    }

    public static SubLObject ensure_task_process_being_worked_on_initialized() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$task_processes_being_worked_on_lock$.getGlobalValue());
            if (NIL == cache.cache_p(task_processor.$task_processes_being_worked_on$.getGlobalValue())) {
                task_processor.$task_processes_being_worked_on$.setGlobalValue(cache.new_cache(task_processor.$task_processes_worked_on_history$.getDynamicValue(thread), symbol_function(EQUAL)));
            }
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$task_processes_being_worked_on_lock$.getGlobalValue());
            }
        }
        return task_processor.$task_processes_being_worked_on$.getGlobalValue();
    }

    public static final SubLObject compute_task_process_description_from_task_info_alt(SubLObject task_info) {
        return com.cyc.cycjava.cycl.task_processor.compute_task_process_description(com.cyc.cycjava.cycl.task_processor.get_task_info_id(task_info), com.cyc.cycjava.cycl.task_processor.get_task_info_giveback_info(task_info));
    }

    public static SubLObject compute_task_process_description_from_task_info(final SubLObject task_info) {
        return task_processor.compute_task_process_description(task_processor.get_task_info_id(task_info), task_processor.get_task_info_giveback_info(task_info));
    }

    public static final SubLObject compute_task_process_description_alt(SubLObject task_id, SubLObject giveback_info) {
        return cons(task_id, giveback_info);
    }

    public static SubLObject compute_task_process_description(final SubLObject task_id, final SubLObject giveback_info) {
        return cons(task_id, giveback_info);
    }

    public static final SubLObject get_giveback_info_from_task_process_description_alt(SubLObject task_process_description) {
        return task_process_description.rest();
    }

    public static SubLObject get_giveback_info_from_task_process_description(final SubLObject task_process_description) {
        return task_process_description.rest();
    }

    /**
     * Try to make this the active task, unless someone has already left us
     * a reason to stop NOW. Return the reason for not permitted.
     */
    @LispMethod(comment = "Try to make this the active task, unless someone has already left us\r\na reason to stop NOW. Return the reason for not permitted.\nTry to make this the active task, unless someone has already left us\na reason to stop NOW. Return the reason for not permitted.")
    public static final SubLObject note_active_task_process_description_if_permitted_alt(SubLObject task_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject signature = com.cyc.cycjava.cycl.task_processor.compute_task_process_description_from_task_info(task_info);
                SubLObject process = current_process();
                SubLObject retval = NIL;
                SubLObject lock = $task_processes_being_worked_on_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    com.cyc.cycjava.cycl.task_processor.ensure_task_process_being_worked_on_initialized();
                    thread.resetMultipleValues();
                    {
                        SubLObject reason_to_stop_nowP = cache.cache_get($task_processes_being_worked_on$.getGlobalValue(), signature);
                        SubLObject foundP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == foundP) {
                            cache.cache_set($task_processes_being_worked_on$.getGlobalValue(), signature, process);
                        } else {
                            retval = reason_to_stop_nowP;
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
                return retval;
            }
        }
    }

    /**
     * Try to make this the active task, unless someone has already left us
     * a reason to stop NOW. Return the reason for not permitted.
     */
    @LispMethod(comment = "Try to make this the active task, unless someone has already left us\r\na reason to stop NOW. Return the reason for not permitted.\nTry to make this the active task, unless someone has already left us\na reason to stop NOW. Return the reason for not permitted.")
    public static SubLObject note_active_task_process_description_if_permitted(final SubLObject task_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject signature = task_processor.compute_task_process_description_from_task_info(task_info);
        final SubLObject process = current_process();
        SubLObject retval = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$task_processes_being_worked_on_lock$.getGlobalValue());
            task_processor.ensure_task_process_being_worked_on_initialized();
            thread.resetMultipleValues();
            final SubLObject reason_to_stop_nowP = cache.cache_get(task_processor.$task_processes_being_worked_on$.getGlobalValue(), signature);
            final SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL == foundP) {
                cache.cache_set(task_processor.$task_processes_being_worked_on$.getGlobalValue(), signature, process);
            } else {
                retval = reason_to_stop_nowP;
            }
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$task_processes_being_worked_on_lock$.getGlobalValue());
            }
        }
        return retval;
    }

    public static final SubLObject note_inactive_task_process_description_alt(SubLObject task_info) {
        {
            SubLObject signature = com.cyc.cycjava.cycl.task_processor.compute_task_process_description_from_task_info(task_info);
            SubLObject lock = $task_processes_being_worked_on_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != cache.cache_p($task_processes_being_worked_on$.getGlobalValue())) {
                    cache.cache_remove($task_processes_being_worked_on$.getGlobalValue(), signature);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return task_info;
    }

    public static SubLObject note_inactive_task_process_description(final SubLObject task_info) {
        final SubLObject signature = task_processor.compute_task_process_description_from_task_info(task_info);
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$task_processes_being_worked_on_lock$.getGlobalValue());
            if (NIL != cache.cache_p(task_processor.$task_processes_being_worked_on$.getGlobalValue())) {
                cache.cache_remove(task_processor.$task_processes_being_worked_on$.getGlobalValue(), signature);
            }
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$task_processes_being_worked_on_lock$.getGlobalValue());
            }
        }
        return task_info;
    }

    public static final SubLObject task_process_termination_reason_p_alt(SubLObject reason) {
        return makeBoolean(reason.isKeyword() && ((reason == $ABORT) || (reason == $CANCEL)));
    }

    public static SubLObject task_process_termination_reason_p(final SubLObject reason) {
        return makeBoolean(reason.isKeyword() && ((reason == $ABORT) || (reason == $CANCEL)));
    }

    /**
     * Interrupt the active task now, if it is already running; if it is not running yet,
     * then note that it is not supposed to start at all.
     *
     * @unknown If the NOTE-INACTIVE-TASK-PROCESS-DESCRIPTION method noted the completion,
    then this could be used to check whether the termination was too late.
     */
    @LispMethod(comment = "Interrupt the active task now, if it is already running; if it is not running yet,\r\nthen note that it is not supposed to start at all.\r\n\r\n@unknown If the NOTE-INACTIVE-TASK-PROCESS-DESCRIPTION method noted the completion,\r\nthen this could be used to check whether the termination was too late.\nInterrupt the active task now, if it is already running; if it is not running yet,\nthen note that it is not supposed to start at all.")
    public static final SubLObject terminate_active_task_process_alt(SubLObject task_id, SubLObject task_giveback_info, SubLObject reason) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(reason, TASK_PROCESS_TERMINATION_REASON_P);
            {
                SubLObject signature = com.cyc.cycjava.cycl.task_processor.compute_task_process_description(task_id, task_giveback_info);
                SubLObject lock = $task_processes_being_worked_on_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    com.cyc.cycjava.cycl.task_processor.ensure_task_process_being_worked_on_initialized();
                    thread.resetMultipleValues();
                    {
                        SubLObject process_handling_task = cache.cache_get($task_processes_being_worked_on$.getGlobalValue(), signature);
                        SubLObject foundP = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != foundP) {
                            com.cyc.cycjava.cycl.task_processor.signal_terminate_active_task_process(process_handling_task, reason, task_id, task_giveback_info);
                        } else {
                            cache.cache_set($task_processes_being_worked_on$.getGlobalValue(), signature, reason);
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return reason;
        }
    }

    /**
     * Interrupt the active task now, if it is already running; if it is not running yet,
     * then note that it is not supposed to start at all.
     *
     * @unknown If the NOTE-INACTIVE-TASK-PROCESS-DESCRIPTION method noted the completion,
    then this could be used to check whether the termination was too late.
     */
    @LispMethod(comment = "Interrupt the active task now, if it is already running; if it is not running yet,\r\nthen note that it is not supposed to start at all.\r\n\r\n@unknown If the NOTE-INACTIVE-TASK-PROCESS-DESCRIPTION method noted the completion,\r\nthen this could be used to check whether the termination was too late.\nInterrupt the active task now, if it is already running; if it is not running yet,\nthen note that it is not supposed to start at all.")
    public static SubLObject terminate_active_task_process(final SubLObject task_id, final SubLObject task_giveback_info, final SubLObject reason) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != task_processor.task_process_termination_reason_p(reason) : "! task_processor.task_process_termination_reason_p(reason) " + ("task_processor.task_process_termination_reason_p(reason) " + "CommonSymbols.NIL != task_processor.task_process_termination_reason_p(reason) ") + reason;
        final SubLObject signature = task_processor.compute_task_process_description(task_id, task_giveback_info);
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$task_processes_being_worked_on_lock$.getGlobalValue());
            task_processor.ensure_task_process_being_worked_on_initialized();
            thread.resetMultipleValues();
            final SubLObject process_handling_task = cache.cache_get(task_processor.$task_processes_being_worked_on$.getGlobalValue(), signature);
            final SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != foundP) {
                task_processor.signal_terminate_active_task_process(process_handling_task, reason, task_id, task_giveback_info);
            } else {
                cache.cache_set(task_processor.$task_processes_being_worked_on$.getGlobalValue(), signature, reason);
            }
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$task_processes_being_worked_on_lock$.getGlobalValue());
            }
        }
        return reason;
    }

    /**
     * Find all of the tasks that are currently running for the passed in task-giveback-info
     * and abort their processing tasks.
     */
    @LispMethod(comment = "Find all of the tasks that are currently running for the passed in task-giveback-info\r\nand abort their processing tasks.\nFind all of the tasks that are currently running for the passed in task-giveback-info\nand abort their processing tasks.")
    public static final SubLObject terminate_active_task_processes_alt(SubLObject task_giveback_info) {
        {
            SubLObject lock = $task_processes_being_worked_on_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != cache.cache_p($task_processes_being_worked_on$.getGlobalValue())) {
                    {
                        SubLObject cache_var = $task_processes_being_worked_on$.getGlobalValue();
                        SubLObject order_var = $NEWEST;
                        SubLObject entry = cache.do_cache_first(cache_var, order_var);
                        SubLObject task_process_description = NIL;
                        SubLObject process_handling_task = NIL;
                        while (NIL == cache.do_cache_doneP(cache_var, entry)) {
                            task_process_description = cache.do_cache_key(entry);
                            process_handling_task = cache.do_cache_value(entry);
                            entry = cache.do_cache_next(entry, order_var);
                            {
                                SubLObject current_giveback_info = com.cyc.cycjava.cycl.task_processor.get_giveback_info_from_task_process_description(task_process_description);
                                if (current_giveback_info.equal(task_giveback_info) && (NIL != valid_process_p(process_handling_task))) {
                                    {
                                        SubLObject ignore_errors_tag = NIL;
                                        try {
                                            {
                                                SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                                try {
                                                    bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                                    try {
                                                        com.cyc.cycjava.cycl.task_processor.signal_terminate_active_task_process(process_handling_task, $ABORT, MINUS_ONE_INTEGER, task_giveback_info);
                                                    } catch (Throwable catch_var) {
                                                        Errors.handleThrowable(catch_var, NIL);
                                                    }
                                                } finally {
                                                    rebind(Errors.$error_handler$, _prev_bind_0);
                                                }
                                            }
                                        } catch (Throwable ccatch_env_var) {
                                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                        }
                                    }
                                }
                            }
                        } 
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return task_giveback_info;
    }

    /**
     * Find all of the tasks that are currently running for the passed in task-giveback-info
     * and abort their processing tasks.
     */
    @LispMethod(comment = "Find all of the tasks that are currently running for the passed in task-giveback-info\r\nand abort their processing tasks.\nFind all of the tasks that are currently running for the passed in task-giveback-info\nand abort their processing tasks.")
    public static SubLObject terminate_active_task_processes(final SubLObject task_giveback_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$task_processes_being_worked_on_lock$.getGlobalValue());
            if (NIL != cache.cache_p(task_processor.$task_processes_being_worked_on$.getGlobalValue())) {
                final SubLObject cache_var = task_processor.$task_processes_being_worked_on$.getGlobalValue();
                final SubLObject order_var = $NEWEST;
                SubLObject entry = cache.do_cache_first(cache_var, order_var);
                SubLObject task_process_description = NIL;
                SubLObject process_handling_task = NIL;
                while (NIL == cache.do_cache_doneP(cache_var, entry)) {
                    task_process_description = cache.do_cache_key(entry);
                    process_handling_task = cache.do_cache_value(entry);
                    entry = cache.do_cache_next(entry, order_var);
                    final SubLObject current_giveback_info = task_processor.get_giveback_info_from_task_process_description(task_process_description);
                    if (current_giveback_info.equal(task_giveback_info) && (NIL != valid_process_p(process_handling_task))) {
                        SubLObject ignore_errors_tag = NIL;
                        try {
                            thread.throwStack.push(task_processor.$IGNORE_ERRORS_TARGET);
                            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                            try {
                                Errors.$error_handler$.bind(symbol_function(task_processor.IGNORE_ERRORS_HANDLER), thread);
                                try {
                                    task_processor.signal_terminate_active_task_process(process_handling_task, $ABORT, MINUS_ONE_INTEGER, task_giveback_info);
                                } catch (final Throwable catch_var) {
                                    Errors.handleThrowable(catch_var, NIL);
                                }
                            } finally {
                                Errors.$error_handler$.rebind(_prev_bind_0, thread);
                            }
                        } catch (final Throwable ccatch_env_var) {
                            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, task_processor.$IGNORE_ERRORS_TARGET);
                        } finally {
                            thread.throwStack.pop();
                        }
                    }
                } 
            }
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$task_processes_being_worked_on_lock$.getGlobalValue());
            }
        }
        return task_giveback_info;
    }

    public static final SubLObject signal_terminate_active_task_process_alt(SubLObject process, SubLObject reason, SubLObject task_id, SubLObject task_giveback_info) {
        {
            SubLObject pcase_var = reason;
            if (pcase_var.eql($ABORT)) {
                interrupt_process_with_args(process, symbol_function(SIGNAL_ABORT_ACTIVE_TASK_PROCESS), list(task_id, task_giveback_info));
            } else {
                if (pcase_var.eql($CANCEL)) {
                    interrupt_process_with_args(process, symbol_function(SIGNAL_CANCEL_ACTIVE_TASK_PROCESS), list(task_id, task_giveback_info));
                } else {
                    Errors.error($str_alt171$API_error__Unknown_active_task_pr, reason);
                }
            }
        }
        return reason;
    }

    public static SubLObject signal_terminate_active_task_process(final SubLObject process, final SubLObject reason, final SubLObject task_id, final SubLObject task_giveback_info) {
        if (reason.eql($ABORT)) {
            subl_promotions.interrupt_process_with_args(process, symbol_function(task_processor.SIGNAL_ABORT_ACTIVE_TASK_PROCESS), list(task_id, task_giveback_info));
        } else
            if (reason.eql($CANCEL)) {
                subl_promotions.interrupt_process_with_args(process, symbol_function(task_processor.SIGNAL_CANCEL_ACTIVE_TASK_PROCESS), list(task_id, task_giveback_info));
            } else {
                Errors.error(task_processor.$str191$API_error__Unknown_active_task_pr, reason);
            }

        return reason;
    }

    public static final SubLObject signal_abort_active_task_process_alt(SubLObject task_id, SubLObject uuid) {
        {
            SubLObject task_info = com.cyc.cycjava.cycl.task_processor.get_current_task_processor_info();
            if (NIL == task_info) {
                return NIL;
            }
            if (!uuid.equal(com.cyc.cycjava.cycl.task_processor.ti_giveback_info(task_info))) {
                return NIL;
            }
            if (task_id.numGE(ZERO_INTEGER)) {
                if (!task_id.eql(com.cyc.cycjava.cycl.task_processor.ti_id(task_info))) {
                    return NIL;
                }
            }
        }
        sublisp_throw($TERMINATE_PREMATURELY, $ABORT);
        return NIL;
    }

    public static SubLObject signal_abort_active_task_process(final SubLObject task_id, final SubLObject uuid) {
        final SubLObject task_info = task_processor.get_current_task_processor_info();
        if (NIL == task_info) {
            return NIL;
        }
        if (!uuid.equal(task_processor.ti_giveback_info(task_info))) {
            return NIL;
        }
        if (task_id.numGE(ZERO_INTEGER) && (!task_id.eql(task_processor.ti_id(task_info)))) {
            return NIL;
        }
        sublisp_throw($TERMINATE_PREMATURELY, $ABORT);
        return NIL;
    }

    public static final SubLObject signal_cancel_active_task_process_alt(SubLObject task_id, SubLObject uuid) {
        {
            SubLObject task_info = com.cyc.cycjava.cycl.task_processor.get_current_task_processor_info();
            if (NIL == task_info) {
                return NIL;
            }
            if (!uuid.equal(com.cyc.cycjava.cycl.task_processor.ti_giveback_info(task_info))) {
                return NIL;
            }
            if (task_id.numGE(ZERO_INTEGER)) {
                if (!task_id.eql(com.cyc.cycjava.cycl.task_processor.ti_id(task_info))) {
                    return NIL;
                }
            }
        }
        sublisp_throw($TERMINATE_PREMATURELY, $CANCEL);
        return NIL;
    }

    public static SubLObject signal_cancel_active_task_process(final SubLObject task_id, final SubLObject uuid) {
        final SubLObject task_info = task_processor.get_current_task_processor_info();
        if (NIL == task_info) {
            return NIL;
        }
        if (!uuid.equal(task_processor.ti_giveback_info(task_info))) {
            return NIL;
        }
        if (task_id.numGE(ZERO_INTEGER) && (!task_id.eql(task_processor.ti_id(task_info)))) {
            return NIL;
        }
        sublisp_throw($TERMINATE_PREMATURELY, $CANCEL);
        return NIL;
    }

    /**
     * Allow for the API calling side to catch the termination of the task processor.
     * The client must wrap the api-request form with catch-task-processor-termination.
     */
    @LispMethod(comment = "Allow for the API calling side to catch the termination of the task processor.\r\nThe client must wrap the api-request form with catch-task-processor-termination.\nAllow for the API calling side to catch the termination of the task processor.\nThe client must wrap the api-request form with catch-task-processor-termination.")
    public static final SubLObject catch_task_processor_termination_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject ans_var = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt173);
            ans_var = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(CCATCH, $TERMINATE_PREMATURELY, ans_var, bq_cons(PROGN, append(body, NIL)));
            }
        }
    }

    @LispMethod(comment = "Allow for the API calling side to catch the termination of the task processor.\r\nThe client must wrap the api-request form with catch-task-processor-termination.\nAllow for the API calling side to catch the termination of the task processor.\nThe client must wrap the api-request form with catch-task-processor-termination.")
    public static SubLObject catch_task_processor_termination(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject ans_var = NIL;
        destructuring_bind_must_consp(current, datum, task_processor.$list193);
        ans_var = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(CCATCH, $TERMINATE_PREMATURELY, ans_var, bq_cons(PROGN, append(body, NIL)));
    }

    /**
     * Allow for the API calling side to catch the termination of the task processor
     * without looking at the termination reason.
     * The client must wrap the api-request form with catch-task-processor-termination-quietly.
     */
    @LispMethod(comment = "Allow for the API calling side to catch the termination of the task processor\r\nwithout looking at the termination reason.\r\nThe client must wrap the api-request form with catch-task-processor-termination-quietly.\nAllow for the API calling side to catch the termination of the task processor\nwithout looking at the termination reason.\nThe client must wrap the api-request form with catch-task-processor-termination-quietly.")
    public static final SubLObject catch_task_processor_termination_quietly_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            SubLObject ans_var = $sym178$ANS_VAR;
            return list(CATCH_TASK_PROCESSOR_TERMINATION, ans_var, bq_cons(PROGN, append(body, NIL)));
        }
    }

    @LispMethod(comment = "Allow for the API calling side to catch the termination of the task processor\r\nwithout looking at the termination reason.\r\nThe client must wrap the api-request form with catch-task-processor-termination-quietly.\nAllow for the API calling side to catch the termination of the task processor\nwithout looking at the termination reason.\nThe client must wrap the api-request form with catch-task-processor-termination-quietly.")
    public static SubLObject catch_task_processor_termination_quietly(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        final SubLObject ans_var = task_processor.$sym198$ANS_VAR;
        return list(task_processor.CATCH_TASK_PROCESSOR_TERMINATION, ans_var, bq_cons(PROGN, append(body, NIL)));
    }

    public static final SubLObject get_current_task_processor_info_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $current_task_processor_info$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_current_task_processor_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return task_processor.$current_task_processor_info$.getDynamicValue(thread);
    }

    /**
     * Returns the uuid-string that identifies the current client
     */
    @LispMethod(comment = "Returns the uuid-string that identifies the current client")
    public static final SubLObject get_current_task_processor_client_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $current_task_processor_info$.getDynamicValue(thread)) {
                return com.cyc.cycjava.cycl.task_processor.get_task_info_giveback_info($current_task_processor_info$.getDynamicValue(thread));
            } else {
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Returns the uuid-string that identifies the current client")
    public static SubLObject get_current_task_processor_client() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != task_processor.$current_task_processor_info$.getDynamicValue(thread)) {
            return task_processor.get_task_info_giveback_info(task_processor.$current_task_processor_info$.getDynamicValue(thread));
        }
        return NIL;
    }

    public static final SubLObject map_task_info_priority_to_process_priority_alt(SubLObject priority) {
        return max($process_min_priority$.getGlobalValue(), min(priority, $process_max_priority$.getGlobalValue()));
    }

    public static SubLObject map_task_info_priority_to_process_priority(final SubLObject priority) {
        return max($process_min_priority$.getGlobalValue(), min(priority, $process_max_priority$.getGlobalValue()));
    }

    /**
     * When awakened, repeatedly evaluate the highest priority
     * request.
     */
    @LispMethod(comment = "When awakened, repeatedly evaluate the highest priority\r\nrequest.\nWhen awakened, repeatedly evaluate the highest priority\nrequest.")
    public static final SubLObject task_processor_handler_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject task_process_pool = com.cyc.cycjava.cycl.task_processor.get_task_process_pool_for_process(current_process());
                while (NIL == task_process_pool) {
                    sleep($float$0_001);
                    task_process_pool = com.cyc.cycjava.cycl.task_processor.get_task_process_pool_for_process(current_process());
                } 
            }
            {
                SubLObject catch_var = NIL;
                try {
                    {
                        SubLObject task_process_pool = com.cyc.cycjava.cycl.task_processor.get_task_process_pool_for_process(current_process());
                        SubLObject v_task_processor = com.cyc.cycjava.cycl.task_processor.find_task_processor(process_name(current_process()), task_process_pool);
                        SubLObject eval_fn = NIL;
                        SubLObject task_info = NIL;
                        SubLObject request = NIL;
                        SubLObject response = NIL;
                        SubLObject junk = NIL;
                        SubLObject error_message = NIL;
                        SubLObject dont_care_abort_reason = NIL;
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == com.cyc.cycjava.cycl.task_processor.task_processor_p(v_task_processor)) {
                                Errors.error($str_alt184$Invalid_task_processor);
                            }
                        }
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == com.cyc.cycjava.cycl.task_processor.task_process_pool_p(task_process_pool)) {
                                Errors.error($str_alt185$Invalid_task_process_pool);
                            }
                        }
                        while (true) {
                            task_info = NIL;
                            response = NIL;
                            error_message = NIL;
                            try {
                                com.cyc.cycjava.cycl.task_processor._csetf_tproc_busy_p(v_task_processor, NIL);
                                Semaphores.semaphore_wait(com.cyc.cycjava.cycl.task_processor.tpool_request_semaphore(task_process_pool));
                                {
                                    SubLObject lock = com.cyc.cycjava.cycl.task_processor.get_tpool_lock(task_process_pool);
                                    SubLObject release = NIL;
                                    try {
                                        release = seize_lock(lock);
                                        task_info = p_dequeue(com.cyc.cycjava.cycl.task_processor.tpool_request_queue(task_process_pool), UNPROVIDED);
                                    } finally {
                                        if (NIL != release) {
                                            release_lock(lock);
                                        }
                                    }
                                }
                                if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                                    com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt186$Task_Info__S__, task_info), task_process_pool);
                                }
                                request = com.cyc.cycjava.cycl.task_processor.ti_request(task_info);
                                com.cyc.cycjava.cycl.task_processor._csetf_ti_task_processor_name(task_info, com.cyc.cycjava.cycl.task_processor.tproc_name(v_task_processor));
                                com.cyc.cycjava.cycl.task_processor._csetf_tproc_task_info(v_task_processor, task_info);
                                eval_fn = dictionary.dictionary_lookup($task_processor_eval_fn_dict$.getGlobalValue(), com.cyc.cycjava.cycl.task_processor.ti_type(task_info), UNPROVIDED);
                                try {
                                    {
                                        SubLObject _prev_bind_0 = $current_task_processor_info$.currentBinding(thread);
                                        try {
                                            $current_task_processor_info$.bind(task_info, thread);
                                            {
                                                SubLObject abort_reason = com.cyc.cycjava.cycl.task_processor.note_active_task_process_description_if_permitted(task_info);
                                                SubLObject priority = com.cyc.cycjava.cycl.task_processor.get_task_info_priority(task_info);
                                                set_process_priority(current_process(), com.cyc.cycjava.cycl.task_processor.map_task_info_priority_to_process_priority(priority));
                                                if (NIL == abort_reason) {
                                                    try {
                                                        try {
                                                            {
                                                                SubLObject _prev_bind_0_4 = Errors.$error_handler$.currentBinding(thread);
                                                                try {
                                                                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                    try {
                                                                        response = com.cyc.cycjava.cycl.task_processor.eval_with_bindings(com.cyc.cycjava.cycl.task_processor.ti_bindings(task_info), request, eval_fn);
                                                                    } catch (Throwable catch_var_5) {
                                                                        Errors.handleThrowable(catch_var_5, NIL);
                                                                    }
                                                                } finally {
                                                                    Errors.$error_handler$.rebind(_prev_bind_0_4, thread);
                                                                }
                                                            }
                                                        } catch (Throwable ccatch_env_var) {
                                                            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                        }
                                                    } catch (Throwable ccatch_env_var) {
                                                        abort_reason = Errors.handleThrowable(ccatch_env_var, $TERMINATE_PREMATURELY);
                                                    }
                                                    if (NIL != abort_reason) {
                                                        error_message = abort_reason;
                                                    }
                                                    if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                                                        com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt188$Response__S__, response), task_process_pool);
                                                        if (error_message.isString()) {
                                                            com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt189$Error_message__S__, error_message), task_process_pool);
                                                        }
                                                    }
                                                    com.cyc.cycjava.cycl.task_processor._csetf_ti_response(task_info, response);
                                                    if (abort_reason != $ABORT) {
                                                        com.cyc.cycjava.cycl.task_processor._csetf_ti_error_message(task_info, error_message);
                                                    }
                                                    try {
                                                        com.cyc.cycjava.cycl.task_processor.dispatch_task_processor_response(task_info, T);
                                                    } catch (Throwable ccatch_env_var) {
                                                        abort_reason = Errors.handleThrowable(ccatch_env_var, $TERMINATE_PREMATURELY);
                                                    }
                                                }
                                            }
                                        } finally {
                                            $current_task_processor_info$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            com.cyc.cycjava.cycl.task_processor.note_inactive_task_process_description(task_info);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                dont_care_abort_reason = Errors.handleThrowable(ccatch_env_var, $TERMINATE_PREMATURELY);
                            }
                        } 
                    }
                } catch (Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $TASK_PROCESSOR_QUIT);
                }
            }
            return NIL;
        }
    }

    @LispMethod(comment = "When awakened, repeatedly evaluate the highest priority\r\nrequest.\nWhen awakened, repeatedly evaluate the highest priority\nrequest.")
    public static SubLObject task_processor_handler() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        for (SubLObject task_process_pool = task_processor.get_task_process_pool_for_process(current_process()); NIL == task_process_pool; task_process_pool = task_processor.get_task_process_pool_for_process(current_process())) {
            sleep(task_processor.$float$0_001);
        }
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push(task_processor.$TASK_PROCESSOR_QUIT);
            final SubLObject task_process_pool2 = task_processor.get_task_process_pool_for_process(current_process());
            final SubLObject v_task_processor = task_processor.find_task_processor(process_name(current_process()), task_process_pool2);
            SubLObject eval_fn = NIL;
            SubLObject task_info = NIL;
            SubLObject request = NIL;
            SubLObject response = NIL;
            final SubLObject junk = NIL;
            SubLObject error_message = NIL;
            SubLObject dont_care_abort_reason = NIL;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == task_processor.task_processor_p(v_task_processor))) {
                Errors.error(task_processor.$str204$Invalid_task_processor);
            }
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == task_processor.task_process_pool_p(task_process_pool2))) {
                Errors.error(task_processor.$str205$Invalid_task_process_pool);
            }
            while (true) {
                task_info = NIL;
                response = NIL;
                error_message = NIL;
                try {
                    thread.throwStack.push($TERMINATE_PREMATURELY);
                    task_processor._csetf_tproc_busy_p(v_task_processor, NIL);
                    Semaphores.semaphore_wait(task_processor.tpool_request_semaphore(task_process_pool2));
                    final SubLObject lock = task_processor.get_tpool_lock(task_process_pool2);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock);
                        task_info = queues.p_dequeue(task_processor.tpool_request_queue(task_process_pool2), UNPROVIDED);
                    } finally {
                        if (NIL != release) {
                            release_lock(lock);
                        }
                    }
                    if (task_processor.$task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                        task_processor.push_tpool_background_msg(format(NIL, task_processor.$str206$Task_Info__S__, task_info), task_process_pool2);
                    }
                    request = task_processor.ti_request(task_info);
                    task_processor._csetf_ti_task_processor_name(task_info, task_processor.tproc_name(v_task_processor));
                    task_processor._csetf_tproc_task_info(v_task_processor, task_info);
                    eval_fn = dictionary.dictionary_lookup(task_processor.$task_processor_eval_fn_dict$.getGlobalValue(), task_processor.ti_type(task_info), UNPROVIDED);
                    try {
                        final SubLObject _prev_bind_0 = task_processor.$current_task_processor_info$.currentBinding(thread);
                        try {
                            task_processor.$current_task_processor_info$.bind(task_info, thread);
                            SubLObject abort_reason = task_processor.note_active_task_process_description_if_permitted(task_info);
                            final SubLObject priority = task_processor.get_task_info_priority(task_info);
                            set_process_priority(current_process(), task_processor.map_task_info_priority_to_process_priority(priority));
                            if (NIL == abort_reason) {
                                try {
                                    thread.throwStack.push($TERMINATE_PREMATURELY);
                                    try {
                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                        final SubLObject _prev_bind_0_$3 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                            try {
                                                response = task_processor.eval_with_bindings(task_processor.ti_bindings(task_info), request, eval_fn);
                                            } catch (final Throwable catch_var_$4) {
                                                Errors.handleThrowable(catch_var_$4, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    } catch (final Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    } finally {
                                        thread.throwStack.pop();
                                    }
                                } catch (final Throwable ccatch_env_var) {
                                    abort_reason = Errors.handleThrowable(ccatch_env_var, $TERMINATE_PREMATURELY);
                                } finally {
                                    thread.throwStack.pop();
                                }
                                if (NIL != abort_reason) {
                                    error_message = abort_reason;
                                }
                                if (task_processor.$task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                                    task_processor.push_tpool_background_msg(format(NIL, task_processor.$str208$Response__S__, response), task_process_pool2);
                                    if (error_message.isString()) {
                                        task_processor.push_tpool_background_msg(format(NIL, task_processor.$str209$Error_message__S__, error_message), task_process_pool2);
                                    }
                                }
                                task_processor._csetf_ti_response(task_info, response);
                                if (abort_reason != $ABORT) {
                                    task_processor._csetf_ti_error_message(task_info, error_message);
                                }
                                try {
                                    thread.throwStack.push($TERMINATE_PREMATURELY);
                                    task_processor.dispatch_task_processor_response(task_info, T);
                                } catch (final Throwable ccatch_env_var) {
                                    abort_reason = Errors.handleThrowable(ccatch_env_var, $TERMINATE_PREMATURELY);
                                } finally {
                                    thread.throwStack.pop();
                                }
                            }
                        } finally {
                            task_processor.$current_task_processor_info$.rebind(_prev_bind_0, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            task_processor.note_inactive_task_process_description(task_info);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
                        }
                    }
                } catch (final Throwable ccatch_env_var2) {
                    dont_care_abort_reason = Errors.handleThrowable(ccatch_env_var2, $TERMINATE_PREMATURELY);
                } finally {
                    thread.throwStack.pop();
                }
            } 
        } catch (final Throwable ccatch_env_var3) {
            catch_var = Errors.handleThrowable(ccatch_env_var3, task_processor.$TASK_PROCESSOR_QUIT);
        } finally {
            thread.throwStack.pop();
        }
        return NIL;
    }

    /**
     * Allows the posting of an intermediate result to an external listener.
     */
    @LispMethod(comment = "Allows the posting of an intermediate result to an external listener.")
    public static final SubLObject post_task_info_processor_partial_results_alt(SubLObject results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(results, LISTP);
            {
                SubLObject task_process_pool = com.cyc.cycjava.cycl.task_processor.get_task_process_pool_for_process(current_process());
                if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                    com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt190$Posting_partial_results__A_at__A, results, numeric_date_utilities.timestring(get_universal_time())), task_process_pool);
                }
                return com.cyc.cycjava.cycl.task_processor.post_task_info_processor_partial_results_internal(task_process_pool, results);
            }
        }
    }

    @LispMethod(comment = "Allows the posting of an intermediate result to an external listener.")
    public static SubLObject post_task_info_processor_partial_results(final SubLObject results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != listp(results) : "! listp(results) " + ("Types.listp(results) " + "CommonSymbols.NIL != Types.listp(results) ") + results;
        final SubLObject task_process_pool = task_processor.get_task_process_pool_for_process(current_process());
        if (task_processor.$task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, task_processor.$str210$Posting_partial_results__A_at__A, results, numeric_date_utilities.timestring(get_universal_time())), task_process_pool);
        }
        return task_processor.post_task_info_processor_partial_results_internal(task_process_pool, results);
    }

    public static final SubLObject post_task_info_processor_partial_results_internal_alt(SubLObject task_process_pool, SubLObject results) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.task_processor.task_process_pool_p(task_process_pool)) {
                Errors.error($str_alt191$Function_only_valid_from_within_a, current_process());
            }
            {
                SubLObject task_info = com.cyc.cycjava.cycl.task_processor.get_current_task_processor_info();
                {
                    SubLObject _prev_bind_0 = $minimize_task_processor_info_communication$.currentBinding(thread);
                    try {
                        $minimize_task_processor_info_communication$.bind(NIL, thread);
                        com.cyc.cycjava.cycl.task_processor._csetf_ti_response(task_info, results);
                        com.cyc.cycjava.cycl.task_processor.dispatch_task_processor_response(task_info, NIL);
                    } finally {
                        $minimize_task_processor_info_communication$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return T;
        }
    }

    public static SubLObject post_task_info_processor_partial_results_internal(final SubLObject task_process_pool, final SubLObject results) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == task_processor.task_process_pool_p(task_process_pool)) {
            Errors.error(task_processor.$str211$Function_only_valid_from_within_a, current_process());
        }
        final SubLObject task_info = task_processor.get_current_task_processor_info();
        final SubLObject _prev_bind_0 = task_processor.$minimize_task_processor_info_communication$.currentBinding(thread);
        try {
            task_processor.$minimize_task_processor_info_communication$.bind(NIL, thread);
            task_processor._csetf_ti_response(task_info, results);
            task_processor.dispatch_task_processor_response(task_info, NIL);
        } finally {
            task_processor.$minimize_task_processor_info_communication$.rebind(_prev_bind_0, thread);
        }
        return T;
    }

    /**
     *
     *
     * @param PROCESS-NAME-PREFIX;
    stringp
     * 		
     * @param MIN-NBR-OF-TASK-PROCESSORS;
    integerp
     * 		
     * @param MAX-NBR-OF-TASK-PROCESSORS;
    integerp
     * 		
     * @return task-process-pool-p
    Initialize the given minimum number of task processors.
     */
    @LispMethod(comment = "@param PROCESS-NAME-PREFIX;\nstringp\r\n\t\t\r\n@param MIN-NBR-OF-TASK-PROCESSORS;\nintegerp\r\n\t\t\r\n@param MAX-NBR-OF-TASK-PROCESSORS;\nintegerp\r\n\t\t\r\n@return task-process-pool-p\r\nInitialize the given minimum number of task processors.")
    public static final SubLObject initialize_task_processors_alt(SubLObject process_name_prefix, SubLObject min_nbr_of_task_processors, SubLObject max_nbr_of_task_processors) {
        if (process_name_prefix == UNPROVIDED) {
            process_name_prefix = $str_alt193$Task_processor_;
        }
        if (min_nbr_of_task_processors == UNPROVIDED) {
            min_nbr_of_task_processors = $min_nbr_of_task_processors$.getGlobalValue();
        }
        if (max_nbr_of_task_processors == UNPROVIDED) {
            max_nbr_of_task_processors = $max_nbr_of_task_processors$.getGlobalValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(min_nbr_of_task_processors, INTEGERP);
            SubLTrampolineFile.checkType(max_nbr_of_task_processors, INTEGERP);
            SubLTrampolineFile.checkType(process_name_prefix, STRINGP);
            $task_processor_standard_output$.setDynamicValue(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
            {
                SubLObject task_process_pool = NIL;
                task_process_pool = com.cyc.cycjava.cycl.task_processor.make_task_process_pool(UNPROVIDED);
                com.cyc.cycjava.cycl.task_processor.set_tpool_process_name_prefix(process_name_prefix, task_process_pool);
                com.cyc.cycjava.cycl.task_processor.set_tpool_min_nbr_of_task_processors(min_nbr_of_task_processors, task_process_pool);
                com.cyc.cycjava.cycl.task_processor.set_tpool_max_nbr_of_task_processors(max_nbr_of_task_processors, task_process_pool);
                if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                    com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt194$Initializing_task_processors__), task_process_pool);
                }
                com.cyc.cycjava.cycl.task_processor.set_tpool_lock(make_lock(format(NIL, $str_alt195$_alock, process_name_prefix)), task_process_pool);
                com.cyc.cycjava.cycl.task_processor._csetf_tpool_request_semaphore(task_process_pool, Semaphores.new_semaphore($str_alt196$task_pool_request_semaphore, ZERO_INTEGER));
                com.cyc.cycjava.cycl.task_processor.set_tpool_request_queue(create_p_queue($task_request_queue_max_size$.getGlobalValue(), TI_PRIORITY, UNPROVIDED), task_process_pool);
                {
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(min_nbr_of_task_processors); i = add(i, ONE_INTEGER)) {
                        com.cyc.cycjava.cycl.task_processor.add_new_task_processor_to_pool(task_process_pool);
                    }
                }
                return task_process_pool;
            }
        }
    }

    /**
     *
     *
     * @param PROCESS-NAME-PREFIX;
    stringp
     * 		
     * @param MIN-NBR-OF-TASK-PROCESSORS;
    integerp
     * 		
     * @param MAX-NBR-OF-TASK-PROCESSORS;
    integerp
     * 		
     * @return task-process-pool-p
    Initialize the given minimum number of task processors.
     */
    @LispMethod(comment = "@param PROCESS-NAME-PREFIX;\nstringp\r\n\t\t\r\n@param MIN-NBR-OF-TASK-PROCESSORS;\nintegerp\r\n\t\t\r\n@param MAX-NBR-OF-TASK-PROCESSORS;\nintegerp\r\n\t\t\r\n@return task-process-pool-p\r\nInitialize the given minimum number of task processors.")
    public static SubLObject initialize_task_processors(SubLObject process_name_prefix, SubLObject min_nbr_of_task_processors, SubLObject max_nbr_of_task_processors) {
        if (process_name_prefix == UNPROVIDED) {
            process_name_prefix = task_processor.$$$Task_processor_;
        }
        if (min_nbr_of_task_processors == UNPROVIDED) {
            min_nbr_of_task_processors = task_processor.$min_nbr_of_task_processors$.getGlobalValue();
        }
        if (max_nbr_of_task_processors == UNPROVIDED) {
            max_nbr_of_task_processors = task_processor.$max_nbr_of_task_processors$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != integerp(min_nbr_of_task_processors) : "! integerp(min_nbr_of_task_processors) " + ("Types.integerp(min_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(min_nbr_of_task_processors) ") + min_nbr_of_task_processors;
        assert NIL != integerp(max_nbr_of_task_processors) : "! integerp(max_nbr_of_task_processors) " + ("Types.integerp(max_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(max_nbr_of_task_processors) ") + max_nbr_of_task_processors;
        assert NIL != stringp(process_name_prefix) : "! stringp(process_name_prefix) " + ("Types.stringp(process_name_prefix) " + "CommonSymbols.NIL != Types.stringp(process_name_prefix) ") + process_name_prefix;
        task_processor.$task_processor_standard_output$.setDynamicValue(StreamsLow.$standard_output$.getDynamicValue(thread), thread);
        SubLObject task_process_pool = NIL;
        task_process_pool = task_processor.make_task_process_pool(UNPROVIDED);
        task_processor.set_tpool_process_name_prefix(process_name_prefix, task_process_pool);
        task_processor.set_tpool_min_nbr_of_task_processors(min_nbr_of_task_processors, task_process_pool);
        task_processor.set_tpool_max_nbr_of_task_processors(max_nbr_of_task_processors, task_process_pool);
        if (task_processor.$task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, task_processor.$str214$Initializing_task_processors__), task_process_pool);
        }
        task_processor.set_tpool_lock(make_lock(format(NIL, task_processor.$str215$_alock, process_name_prefix)), task_process_pool);
        task_processor._csetf_tpool_request_semaphore(task_process_pool, Semaphores.new_semaphore(task_processor.$str216$task_pool_request_semaphore, ZERO_INTEGER));
        task_processor.set_tpool_request_queue(queues.create_p_queue(task_processor.$task_request_queue_max_size$.getGlobalValue(), task_processor.TI_PRIORITY, UNPROVIDED), task_process_pool);
        SubLObject i;
        for (i = NIL, i = ZERO_INTEGER; i.numL(min_nbr_of_task_processors); i = add(i, ONE_INTEGER)) {
            task_processor.add_new_task_processor_to_pool(task_process_pool);
        }
        return task_process_pool;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Add a new task processor for the given TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tAdd a new task processor for the given TASK-PROCESS-POOL.")
    public static final SubLObject add_new_task_processor_to_pool_alt(SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        {
            SubLObject v_task_processor = com.cyc.cycjava.cycl.task_processor.make_task_processor(UNPROVIDED);
            SubLObject process_name_prefix = com.cyc.cycjava.cycl.task_processor.get_tpool_process_name_prefix(task_process_pool);
            SubLObject nbr_of_task_processors = com.cyc.cycjava.cycl.task_processor.get_nbr_of_task_processors(task_process_pool);
            com.cyc.cycjava.cycl.task_processor._csetf_tproc_name(v_task_processor, format(NIL, $str_alt197$_a_s, process_name_prefix, add(nbr_of_task_processors, ONE_INTEGER)));
            com.cyc.cycjava.cycl.task_processor._csetf_tproc_process(v_task_processor, make_process(com.cyc.cycjava.cycl.task_processor.tproc_name(v_task_processor), symbol_function(TASK_PROCESSOR_HANDLER)));
            com.cyc.cycjava.cycl.task_processor.push_tpool_processor(v_task_processor, task_process_pool);
            com.cyc.cycjava.cycl.task_processor.add_task_process_pool_for_process(com.cyc.cycjava.cycl.task_processor.tproc_process(v_task_processor), task_process_pool);
        }
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Add a new task processor for the given TASK-PROCESS-POOL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tAdd a new task processor for the given TASK-PROCESS-POOL.")
    public static SubLObject add_new_task_processor_to_pool(final SubLObject task_process_pool) {
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        final SubLObject v_task_processor = task_processor.make_task_processor(UNPROVIDED);
        final SubLObject process_name_prefix = task_processor.get_tpool_process_name_prefix(task_process_pool);
        final SubLObject nbr_of_task_processors = task_processor.get_nbr_of_task_processors(task_process_pool);
        task_processor._csetf_tproc_name(v_task_processor, format(NIL, task_processor.$str217$_a_s, process_name_prefix, add(nbr_of_task_processors, ONE_INTEGER)));
        task_processor._csetf_tproc_process(v_task_processor, make_process(task_processor.tproc_name(v_task_processor), symbol_function(task_processor.TASK_PROCESSOR_HANDLER)));
        task_processor.push_tpool_processor(v_task_processor, task_process_pool);
        task_processor.add_task_process_pool_for_process(task_processor.tproc_process(v_task_processor), task_process_pool);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Halt all the task processors in TASK-PROCESS-POOL immediately.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tHalt all the task processors in TASK-PROCESS-POOL immediately.")
    public static final SubLObject halt_task_processors_alt(SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.task_processor.tpool_processors(task_process_pool);
            SubLObject v_task_processor = NIL;
            for (v_task_processor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_task_processor = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.task_processor.halt_task_processor(v_task_processor);
                com.cyc.cycjava.cycl.task_processor.remove_task_process_pool_for_process(com.cyc.cycjava.cycl.task_processor.tproc_process(v_task_processor));
            }
        }
        com.cyc.cycjava.cycl.task_processor._csetf_tpool_processors(task_process_pool, NIL);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
     * 		task-process-pool-p
     * 		Halt all the task processors in TASK-PROCESS-POOL immediately.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\r\n\t\ttask-process-pool-p\r\n\t\tHalt all the task processors in TASK-PROCESS-POOL immediately.")
    public static SubLObject halt_task_processors(final SubLObject task_process_pool) {
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        SubLObject cdolist_list_var = task_processor.tpool_processors(task_process_pool);
        SubLObject v_task_processor = NIL;
        v_task_processor = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            task_processor.halt_task_processor(v_task_processor);
            task_processor.remove_task_process_pool_for_process(task_processor.tproc_process(v_task_processor));
            cdolist_list_var = cdolist_list_var.rest();
            v_task_processor = cdolist_list_var.first();
        } 
        task_processor._csetf_tpool_processors(task_process_pool, NIL);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESSOR;
     * 		task-processor-p
     * 		Halt all the TASK-PROCESSOR immediately.
     */
    @LispMethod(comment = "@param TASK-PROCESSOR;\r\n\t\ttask-processor-p\r\n\t\tHalt all the TASK-PROCESSOR immediately.")
    public static final SubLObject halt_task_processor_alt(SubLObject v_task_processor) {
        SubLTrampolineFile.checkType(v_task_processor, TASK_PROCESSOR_P);
        {
            SubLObject process = com.cyc.cycjava.cycl.task_processor.tproc_process(v_task_processor);
            if (NIL != valid_process_p(process)) {
                com.cyc.cycjava.cycl.task_processor.halt_task_processor_via_interrupt(process);
            }
            com.cyc.cycjava.cycl.task_processor.remove_task_process_pool_for_process(process);
            process = NIL;
        }
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESSOR;
     * 		task-processor-p
     * 		Halt all the TASK-PROCESSOR immediately.
     */
    @LispMethod(comment = "@param TASK-PROCESSOR;\r\n\t\ttask-processor-p\r\n\t\tHalt all the TASK-PROCESSOR immediately.")
    public static SubLObject halt_task_processor(final SubLObject v_task_processor) {
        assert NIL != task_processor.task_processor_p(v_task_processor) : "! task_processor.task_processor_p(v_task_processor) " + ("task_processor.task_processor_p(v_task_processor) " + "CommonSymbols.NIL != task_processor.task_processor_p(v_task_processor) ") + v_task_processor;
        SubLObject process = task_processor.tproc_process(v_task_processor);
        if (NIL != valid_process_p(process)) {
            task_processor.halt_task_processor_via_interrupt(process);
        }
        task_processor.remove_task_process_pool_for_process(process);
        process = NIL;
        return NIL;
    }

    /**
     *
     *
     * @param PROCESS;
     * 		process-p
     * 		Halt the given task processor process via an interrupt.
     */
    @LispMethod(comment = "@param PROCESS;\r\n\t\tprocess-p\r\n\t\tHalt the given task processor process via an interrupt.")
    public static final SubLObject halt_task_processor_via_interrupt_alt(SubLObject process) {
        return interrupt_process(process, symbol_function(TASK_PROCESSOR_QUIT));
    }

    /**
     *
     *
     * @param PROCESS;
     * 		process-p
     * 		Halt the given task processor process via an interrupt.
     */
    @LispMethod(comment = "@param PROCESS;\r\n\t\tprocess-p\r\n\t\tHalt the given task processor process via an interrupt.")
    public static SubLObject halt_task_processor_via_interrupt(final SubLObject process) {
        return interrupt_process(process, symbol_function(task_processor.TASK_PROCESSOR_QUIT));
    }

    /**
     * Ensures that the task processors with the type (e.g. API) are killed.
     *
     * @param TYPE;
     * 		stringp, the task processor type (e. g. API)
     */
    @LispMethod(comment = "Ensures that the task processors with the type (e.g. API) are killed.\r\n\r\n@param TYPE;\r\n\t\tstringp, the task processor type (e. g. API)")
    public static final SubLObject ensure_task_processors_killed_alt(SubLObject type) {
        SubLTrampolineFile.checkType(type, STRINGP);
        {
            SubLObject prefix = cconcatenate(type, $str_alt201$_processor_);
            SubLObject cdolist_list_var = all_processes();
            SubLObject process = NIL;
            for (process = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , process = cdolist_list_var.first()) {
                {
                    SubLObject process_name = process_name(process);
                    if (NIL != string_utilities.starts_with(process_name, prefix)) {
                        format(T, $str_alt202$_Killing__A___, process_name);
                        kill_process(process);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Ensures that the task processors with the type (e.g. API) are killed.\r\n\r\n@param TYPE;\r\n\t\tstringp, the task processor type (e. g. API)")
    public static SubLObject ensure_task_processors_killed(final SubLObject type) {
        assert NIL != stringp(type) : "! stringp(type) " + ("Types.stringp(type) " + "CommonSymbols.NIL != Types.stringp(type) ") + type;
        final SubLObject prefix = cconcatenate(type, task_processor.$$$_processor_);
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject process_name = process_name(process);
            if (NIL != string_utilities.starts_with(process_name, prefix)) {
                format(T, task_processor.$str222$_Killing__A___, process_name);
                kill_process(process);
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Throws :TASK-PROCESSOR-QUIT which when caught by the task processor process,
     * aborts it.
     */
    @LispMethod(comment = "Throws :TASK-PROCESSOR-QUIT which when caught by the task processor process,\r\naborts it.\nThrows :TASK-PROCESSOR-QUIT which when caught by the task processor process,\naborts it.")
    public static final SubLObject task_processor_quit_alt() {
        sublisp_throw($TASK_PROCESSOR_QUIT, NIL);
        return NIL;
    }

    @LispMethod(comment = "Throws :TASK-PROCESSOR-QUIT which when caught by the task processor process,\r\naborts it.\nThrows :TASK-PROCESSOR-QUIT which when caught by the task processor process,\naborts it.")
    public static SubLObject task_processor_quit() {
        sublisp_throw(task_processor.$TASK_PROCESSOR_QUIT, NIL);
        return NIL;
    }

    /**
     *
     *
     * @param PROCESS-NAME;
    stringp
     * 		
     * @param TASK-PROCESS-POOL;
    task-process-p
     * 		
     * @return task-processor-p or nil
    Return the task processor in TASK-PROCESS-POOL having PROCESS-NAME.
    Return NIL if not found.
     */
    @LispMethod(comment = "@param PROCESS-NAME;\nstringp\r\n\t\t\r\n@param TASK-PROCESS-POOL;\ntask-process-p\r\n\t\t\r\n@return task-processor-p or nil\r\nReturn the task processor in TASK-PROCESS-POOL having PROCESS-NAME.\r\nReturn NIL if not found.")
    public static final SubLObject find_task_processor_alt(SubLObject process_name, SubLObject task_process_pool) {
        SubLTrampolineFile.checkType(process_name, STRINGP);
        SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.task_processor.tpool_processors(task_process_pool);
            SubLObject v_task_processor = NIL;
            for (v_task_processor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_task_processor = cdolist_list_var.first()) {
                if (NIL != Strings.stringE(process_name, com.cyc.cycjava.cycl.task_processor.tproc_name(v_task_processor), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return v_task_processor;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param PROCESS-NAME;
    stringp
     * 		
     * @param TASK-PROCESS-POOL;
    task-process-p
     * 		
     * @return task-processor-p or nil
    Return the task processor in TASK-PROCESS-POOL having PROCESS-NAME.
    Return NIL if not found.
     */
    @LispMethod(comment = "@param PROCESS-NAME;\nstringp\r\n\t\t\r\n@param TASK-PROCESS-POOL;\ntask-process-p\r\n\t\t\r\n@return task-processor-p or nil\r\nReturn the task processor in TASK-PROCESS-POOL having PROCESS-NAME.\r\nReturn NIL if not found.")
    public static SubLObject find_task_processor(final SubLObject process_name, final SubLObject task_process_pool) {
        assert NIL != stringp(process_name) : "! stringp(process_name) " + ("Types.stringp(process_name) " + "CommonSymbols.NIL != Types.stringp(process_name) ") + process_name;
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        SubLObject cdolist_list_var = task_processor.tpool_processors(task_process_pool);
        SubLObject v_task_processor = NIL;
        v_task_processor = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != Strings.stringE(process_name, task_processor.tproc_name(v_task_processor), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return v_task_processor;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_task_processor = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param PROCESS-NAME;
    stringp
     * 		
     * @return task-process-pool-p or nil
    Return the first task process pool having a process named PROCESS-NAME.
    Return NIL if not found.
     */
    @LispMethod(comment = "@param PROCESS-NAME;\nstringp\r\n\t\t\r\n@return task-process-pool-p or nil\r\nReturn the first task process pool having a process named PROCESS-NAME.\r\nReturn NIL if not found.")
    public static final SubLObject find_task_process_pool_alt(SubLObject process_name) {
        SubLTrampolineFile.checkType(process_name, STRINGP);
        {
            SubLObject cdolist_list_var = all_processes();
            SubLObject process = NIL;
            for (process = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , process = cdolist_list_var.first()) {
                {
                    SubLObject running_process_name = process_name(process);
                    if (NIL != Strings.stringE(process_name, running_process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return com.cyc.cycjava.cycl.task_processor.get_task_process_pool_for_process(process);
                    }
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param PROCESS-NAME;
    stringp
     * 		
     * @return task-process-pool-p or nil
    Return the first task process pool having a process named PROCESS-NAME.
    Return NIL if not found.
     */
    @LispMethod(comment = "@param PROCESS-NAME;\nstringp\r\n\t\t\r\n@return task-process-pool-p or nil\r\nReturn the first task process pool having a process named PROCESS-NAME.\r\nReturn NIL if not found.")
    public static SubLObject find_task_process_pool(final SubLObject process_name) {
        assert NIL != stringp(process_name) : "! stringp(process_name) " + ("Types.stringp(process_name) " + "CommonSymbols.NIL != Types.stringp(process_name) ") + process_name;
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject running_process_name = process_name(process);
            if (NIL != Strings.stringE(process_name, running_process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return task_processor.get_task_process_pool_for_process(process);
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
     * 		task-process-p
     * 		Awaken the first N task-processor in TASK-PROCES-POOL having a NIL busy-p, depending upon
     * 		the number of requests in the queue.
     * 		Return T if found, otherwise return NIL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\r\n\t\ttask-process-p\r\n\t\tAwaken the first N task-processor in TASK-PROCES-POOL having a NIL busy-p, depending upon\r\n\t\tthe number of requests in the queue.\r\n\t\tReturn T if found, otherwise return NIL.")
    public static final SubLObject awaken_first_available_task_processors_alt(SubLObject task_process_pool) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (com.cyc.cycjava.cycl.task_processor.get_nbr_of_task_processors(task_process_pool).numL(com.cyc.cycjava.cycl.task_processor.get_tpool_max_nbr_of_task_processors(task_process_pool))) {
                if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                    com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt203$Allocating_a_new_task_processor__), task_process_pool);
                }
                com.cyc.cycjava.cycl.task_processor.add_new_task_processor_to_pool(task_process_pool);
            }
            com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt204$Awakening_first_available_task_pr), task_process_pool);
            Semaphores.semaphore_signal(com.cyc.cycjava.cycl.task_processor.tpool_request_semaphore(task_process_pool));
            return NIL;
        }
    }

    /**
     *
     *
     * @param TASK-PROCESS-POOL;
     * 		task-process-p
     * 		Awaken the first N task-processor in TASK-PROCES-POOL having a NIL busy-p, depending upon
     * 		the number of requests in the queue.
     * 		Return T if found, otherwise return NIL.
     */
    @LispMethod(comment = "@param TASK-PROCESS-POOL;\r\n\t\ttask-process-p\r\n\t\tAwaken the first N task-processor in TASK-PROCES-POOL having a NIL busy-p, depending upon\r\n\t\tthe number of requests in the queue.\r\n\t\tReturn T if found, otherwise return NIL.")
    public static SubLObject awaken_first_available_task_processors(final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (task_processor.get_nbr_of_task_processors(task_process_pool).numL(task_processor.get_tpool_max_nbr_of_task_processors(task_process_pool))) {
            if (task_processor.$task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                task_processor.push_tpool_background_msg(format(NIL, task_processor.$str223$Allocating_a_new_task_processor__), task_process_pool);
            }
            task_processor.add_new_task_processor_to_pool(task_process_pool);
        }
        task_processor.push_tpool_background_msg(format(NIL, task_processor.$str224$Awakening_first_available_task_pr), task_process_pool);
        Semaphores.semaphore_signal(task_processor.tpool_request_semaphore(task_process_pool));
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @param TASK-PROCESS-POOL;
    task-process-p
     * 		
     * @param POSTPONE?;
     * 		booleanp
     * 		Enqueue the TASK-INFO on the TASK-PROCESS-POOL request queue and awaken the
     * 		first available task processor within the scope of the queue lock.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@param TASK-PROCESS-POOL;\ntask-process-p\r\n\t\t\r\n@param POSTPONE?;\r\n\t\tbooleanp\r\n\t\tEnqueue the TASK-INFO on the TASK-PROCESS-POOL request queue and awaken the\r\n\t\tfirst available task processor within the scope of the queue lock.")
    public static final SubLObject enqueue_task_request_alt(SubLObject task_info, SubLObject task_process_pool) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(task_info, TASK_INFO_P);
            SubLTrampolineFile.checkType(task_process_pool, TASK_PROCESS_POOL_P);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.task_processor.tpool_processors(task_process_pool)) {
                    Errors.error($str_alt205$Task_processors_are_not_initializ);
                }
            }
            {
                SubLObject lock = com.cyc.cycjava.cycl.task_processor.tpool_lock(task_process_pool);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    thread.resetMultipleValues();
                    {
                        SubLObject request_queue = p_enqueue(task_info, com.cyc.cycjava.cycl.task_processor.tpool_request_queue(task_process_pool));
                        SubLObject bumped_requestP = thread.secondMultipleValue();
                        SubLObject bumped_request_item = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != bumped_requestP) {
                            Errors.cerror($str_alt206$__Error__cannot_queue_task_reques, bumped_request_item);
                        }
                        com.cyc.cycjava.cycl.task_processor.awaken_first_available_task_processors(task_process_pool);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @param TASK-PROCESS-POOL;
    task-process-p
     * 		
     * @param POSTPONE?;
     * 		booleanp
     * 		Enqueue the TASK-INFO on the TASK-PROCESS-POOL request queue and awaken the
     * 		first available task processor within the scope of the queue lock.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@param TASK-PROCESS-POOL;\ntask-process-p\r\n\t\t\r\n@param POSTPONE?;\r\n\t\tbooleanp\r\n\t\tEnqueue the TASK-INFO on the TASK-PROCESS-POOL request queue and awaken the\r\n\t\tfirst available task processor within the scope of the queue lock.")
    public static SubLObject enqueue_task_request(final SubLObject task_info, final SubLObject task_process_pool) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != task_processor.task_info_p(task_info) : "! task_processor.task_info_p(task_info) " + ("task_processor.task_info_p(task_info) " + "CommonSymbols.NIL != task_processor.task_info_p(task_info) ") + task_info;
        assert NIL != task_processor.task_process_pool_p(task_process_pool) : "! task_processor.task_process_pool_p(task_process_pool) " + ("task_processor.task_process_pool_p(task_process_pool) " + "CommonSymbols.NIL != task_processor.task_process_pool_p(task_process_pool) ") + task_process_pool;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == task_processor.tpool_processors(task_process_pool))) {
            Errors.error(task_processor.$str225$Task_processors_are_not_initializ);
        }
        final SubLObject lock = task_processor.tpool_lock(task_process_pool);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            thread.resetMultipleValues();
            final SubLObject request_queue = queues.p_enqueue(task_info, task_processor.tpool_request_queue(task_process_pool));
            final SubLObject bumped_requestP = thread.secondMultipleValue();
            final SubLObject bumped_request_item = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != bumped_requestP) {
                Errors.cerror(task_processor.$str226$__Error__cannot_queue_task_reques, bumped_request_item);
            }
            task_processor.awaken_first_available_task_processors(task_process_pool);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return NIL;
    }

    public static SubLObject with_long_running_task_process(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return list(CLET, task_processor.$list228, listS(CUNWIND_PROTECT, listS(PROGN, task_processor.$list230, append(body, NIL)), task_processor.$list231));
    }

    /**
     *
     *
     * @param TYPE:
    stringp
     * 		
     * @param MIN-NBR-OF-TASK-PROCESSORS
     * 		
     * @param MAX-NBR-OF-TASK-PROCESSORS
     * 		Defines the initialization, finalization and access functions for
     * 		the given type of task-process-pool.
     */
    @LispMethod(comment = "@param TYPE:\nstringp\r\n\t\t\r\n@param MIN-NBR-OF-TASK-PROCESSORS\r\n\t\t\r\n@param MAX-NBR-OF-TASK-PROCESSORS\r\n\t\tDefines the initialization, finalization and access functions for\r\n\t\tthe given type of task-process-pool.")
    public static final SubLObject declare_task_process_pool_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject type = NIL;
            SubLObject min_nbr_of_task_processors = NIL;
            SubLObject max_nbr_of_task_processors = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt207);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt207);
            min_nbr_of_task_processors = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt207);
            max_nbr_of_task_processors = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLTrampolineFile.checkType(type, STRINGP);
                SubLTrampolineFile.checkType(min_nbr_of_task_processors, INTEGERP);
                SubLTrampolineFile.checkType(max_nbr_of_task_processors, INTEGERP);
                {
                    SubLObject task_process_pool = intern(cconcatenate($str_alt208$_, new SubLObject[]{ type, $str_alt209$_TASK_PROCESS_POOL_ }), UNPROVIDED);
                    SubLObject task_process_pool_lock = intern(cconcatenate($str_alt208$_, new SubLObject[]{ type, $str_alt210$_TASK_PROCESS_POOL_LOCK_ }), UNPROVIDED);
                    return list(PROGN, listS(DEFLEXICAL_PUBLIC, task_process_pool, $list_alt212), listS(DEFCONSTANT_PUBLIC, task_process_pool_lock, $list_alt214), list(DEFINE_PUBLIC, intern(cconcatenate(type, $str_alt216$_TASK_PROCESSORS_INITIALIZED_P), UNPROVIDED), NIL, $str_alt217$Return_T_when_there_are_task_proc, list(RET, list(TASK_PROCESSORS_INITIALIZED_P, task_process_pool))), listS(DEFINE_PUBLIC, intern(cconcatenate($str_alt220$INITIALIZE_, new SubLObject[]{ type, $str_alt221$_TASK_PROCESSORS }), UNPROVIDED), NIL, $str_alt222$Initialize_the_task_processor_poo, list(WITH_LOCK_HELD, list(task_process_pool_lock), listS(PWHEN, task_process_pool, $list_alt225), list(CSETQ, task_process_pool, list(INITIALIZE_TASK_PROCESSORS, listS(CCONCATENATE, type, $list_alt228), min_nbr_of_task_processors, max_nbr_of_task_processors))), $list_alt229), listS(DEFINE_PUBLIC, intern(cconcatenate($str_alt230$HALT_, new SubLObject[]{ type, $str_alt221$_TASK_PROCESSORS }), UNPROVIDED), NIL, $str_alt231$Halt_the_task_processors_, list(WITH_LOCK_HELD, list(task_process_pool_lock), list(PWHEN, task_process_pool, list(HALT_TASK_PROCESSORS, task_process_pool), listS(CSETQ, task_process_pool, $list_alt233), list(ENSURE_TASK_PROCESSORS_KILLED, type))), $list_alt229), listS(DEFINE_PUBLIC, intern(cconcatenate($str_alt234$SHOW_, new SubLObject[]{ type, $str_alt235$_TP_MSGS }), UNPROVIDED), NIL, $str_alt236$Show_and_reset_the_task_processor, list(PWHEN, task_process_pool, list(SHOW_TP_MSGS, task_process_pool)), $list_alt229));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt207);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param TYPE:
    stringp
     * 		
     * @param MIN-NBR-OF-TASK-PROCESSORS
     * 		
     * @param MAX-NBR-OF-TASK-PROCESSORS
     * 		Defines the initialization, finalization and access functions for
     * 		the given type of task-process-pool.
     */
    @LispMethod(comment = "@param TYPE:\nstringp\r\n\t\t\r\n@param MIN-NBR-OF-TASK-PROCESSORS\r\n\t\t\r\n@param MAX-NBR-OF-TASK-PROCESSORS\r\n\t\tDefines the initialization, finalization and access functions for\r\n\t\tthe given type of task-process-pool.")
    public static SubLObject declare_task_process_pool(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = NIL;
        SubLObject min_nbr_of_task_processors = NIL;
        SubLObject max_nbr_of_task_processors = NIL;
        destructuring_bind_must_consp(current, datum, task_processor.$list232);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, task_processor.$list232);
        min_nbr_of_task_processors = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, task_processor.$list232);
        max_nbr_of_task_processors = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, task_processor.$list232);
            return NIL;
        }
        assert NIL != stringp(type) : "! stringp(type) " + ("Types.stringp(type) " + "CommonSymbols.NIL != Types.stringp(type) ") + type;
        assert NIL != integerp(min_nbr_of_task_processors) : "! integerp(min_nbr_of_task_processors) " + ("Types.integerp(min_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(min_nbr_of_task_processors) ") + min_nbr_of_task_processors;
        assert NIL != integerp(max_nbr_of_task_processors) : "! integerp(max_nbr_of_task_processors) " + ("Types.integerp(max_nbr_of_task_processors) " + "CommonSymbols.NIL != Types.integerp(max_nbr_of_task_processors) ") + max_nbr_of_task_processors;
        final SubLObject task_process_pool = intern(cconcatenate(task_processor.$str233$_, new SubLObject[]{ type, task_processor.$str234$_TASK_PROCESS_POOL_ }), UNPROVIDED);
        final SubLObject task_process_pool_lock = intern(cconcatenate(task_processor.$str233$_, new SubLObject[]{ type, task_processor.$str235$_TASK_PROCESS_POOL_LOCK_ }), UNPROVIDED);
        return list(PROGN, listS(task_processor.DEFLEXICAL_PUBLIC, task_process_pool, task_processor.$list237), listS(task_processor.DEFCONSTANT_PUBLIC, task_process_pool_lock, task_processor.$list239), list(DEFINE_PUBLIC, intern(cconcatenate(type, task_processor.$str241$_TASK_PROCESSORS_INITIALIZED_P), UNPROVIDED), NIL, task_processor.$str242$Return_T_when_there_are_task_proc, list(RET, list(task_processor.TASK_PROCESSORS_INITIALIZED_P, task_process_pool))), listS(DEFINE_PUBLIC, intern(cconcatenate(task_processor.$str245$INITIALIZE_, new SubLObject[]{ type, task_processor.$str246$_TASK_PROCESSORS }), UNPROVIDED), NIL, task_processor.$str247$Initialize_the_task_processor_poo, list(WITH_LOCK_HELD, list(task_process_pool_lock), listS(PWHEN, task_process_pool, task_processor.$list250), list(CSETQ, task_process_pool, list(task_processor.INITIALIZE_TASK_PROCESSORS, listS(CCONCATENATE, type, task_processor.$list253), min_nbr_of_task_processors, max_nbr_of_task_processors))), task_processor.$list254), listS(DEFINE_PUBLIC, intern(cconcatenate(task_processor.$str255$HALT_, new SubLObject[]{ type, task_processor.$str246$_TASK_PROCESSORS }), UNPROVIDED), NIL, task_processor.$str256$Halt_the_task_processors_, list(WITH_LOCK_HELD, list(task_process_pool_lock), list(PWHEN, task_process_pool, list(task_processor.HALT_TASK_PROCESSORS, task_process_pool), task_processor.$list258, listS(CSETQ, task_process_pool, task_processor.$list259), list(task_processor.ENSURE_TASK_PROCESSORS_KILLED, type))), task_processor.$list254), listS(DEFINE_PUBLIC, intern(cconcatenate(task_processor.$str260$RESTART_, new SubLObject[]{ type, task_processor.$str246$_TASK_PROCESSORS }), UNPROVIDED), NIL, task_processor.$str261$Restart__halt___initialize__the_t, list(WITH_LOCK_HELD, list(task_process_pool_lock), list(PWHEN, task_process_pool, list(task_processor.HALT_TASK_PROCESSORS, task_process_pool), listS(CSETQ, task_process_pool, task_processor.$list259), list(task_processor.ENSURE_TASK_PROCESSORS_KILLED, type)), list(CSETQ, task_process_pool, list(task_processor.INITIALIZE_TASK_PROCESSORS, listS(CCONCATENATE, type, task_processor.$list253), min_nbr_of_task_processors, max_nbr_of_task_processors))), task_processor.$list254), listS(DEFINE_PUBLIC, intern(cconcatenate(task_processor.$str262$SHOW_, new SubLObject[]{ type, task_processor.$str263$_TP_MSGS }), UNPROVIDED), NIL, task_processor.$str264$Show_and_reset_the_task_processor, list(PWHEN, task_process_pool, list(task_processor.SHOW_TP_MSGS, task_process_pool)), task_processor.$list254));
    }

    /**
     *
     *
     * @param TYPE:
    stringp
     * 		
     * @param EVAL-FN:
    functionp
     * 		
     * @param ARGS:
     * 		listp
     * 		Defines the function which puts task-info objects on the task
     * 		request queue and specifies the evaluation function.
     */
    @LispMethod(comment = "@param TYPE:\nstringp\r\n\t\t\r\n@param EVAL-FN:\nfunctionp\r\n\t\t\r\n@param ARGS:\r\n\t\tlistp\r\n\t\tDefines the function which puts task-info objects on the task\r\n\t\trequest queue and specifies the evaluation function.")
    public static final SubLObject declare_task_process_request_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject type = NIL;
            SubLObject eval_fn = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt238);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt238);
            eval_fn = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt238);
            args = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(PROGN, listS(DEFINE_PUBLIC, intern(cconcatenate(type, $str_alt239$_TASK_PROCESSOR_REQUEST), UNPROVIDED), args, append(body, NIL)), $list_alt240, list(DICTIONARY_ENTER, $task_processor_eval_fn_dict$, make_keyword(type), eval_fn));
            }
        }
    }

    /**
     *
     *
     * @param TYPE:
    stringp
     * 		
     * @param EVAL-FN:
    functionp
     * 		
     * @param ARGS:
     * 		listp
     * 		Defines the function which puts task-info objects on the task
     * 		request queue and specifies the evaluation function.
     */
    @LispMethod(comment = "@param TYPE:\nstringp\r\n\t\t\r\n@param EVAL-FN:\nfunctionp\r\n\t\t\r\n@param ARGS:\r\n\t\tlistp\r\n\t\tDefines the function which puts task-info objects on the task\r\n\t\trequest queue and specifies the evaluation function.")
    public static SubLObject declare_task_process_request(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = NIL;
        SubLObject eval_fn = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, task_processor.$list266);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, task_processor.$list266);
        eval_fn = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, task_processor.$list266);
        args = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(PROGN, listS(DEFINE_PUBLIC, intern(cconcatenate(type, task_processor.$str267$_TASK_PROCESSOR_REQUEST), UNPROVIDED), args, append(body, NIL)), task_processor.$list268, list(DICTIONARY_ENTER, task_processor.$task_processor_eval_fn_dict$, make_keyword(type), eval_fn));
    }

    /**
     *
     *
     * @param TYPE:
    stringp
     * 		
     * @param args:
     * 		listp
     * 		Defines the function used to dispatch completed task-info objects
     * 		from the task response queue.
     */
    @LispMethod(comment = "@param TYPE:\nstringp\r\n\t\t\r\n@param args:\r\n\t\tlistp\r\n\t\tDefines the function used to dispatch completed task-info objects\r\n\t\tfrom the task response queue.")
    public static final SubLObject declare_task_process_response_dispatch_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject type = NIL;
            SubLObject args = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt243);
            type = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt243);
            args = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject response_dispatch_fn = intern(cconcatenate($str_alt244$DISPATCH_, new SubLObject[]{ type, $str_alt245$_TASK_PROCESSOR_RESPONSE }), UNPROVIDED);
                return list(PROGN, listS(DEFINE_PUBLIC, response_dispatch_fn, args, append(body, NIL)), $list_alt246, list(DICTIONARY_ENTER, $task_processor_response_dispatch_fn_dict$, make_keyword(type), list(FUNCTION, response_dispatch_fn)));
            }
        }
    }

    /**
     *
     *
     * @param TYPE:
    stringp
     * 		
     * @param args:
     * 		listp
     * 		Defines the function used to dispatch completed task-info objects
     * 		from the task response queue.
     */
    @LispMethod(comment = "@param TYPE:\nstringp\r\n\t\t\r\n@param args:\r\n\t\tlistp\r\n\t\tDefines the function used to dispatch completed task-info objects\r\n\t\tfrom the task response queue.")
    public static SubLObject declare_task_process_response_dispatch(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(current, datum, task_processor.$list271);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, task_processor.$list271);
        args = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject response_dispatch_fn = intern(cconcatenate(task_processor.$str272$DISPATCH_, new SubLObject[]{ type, task_processor.$str273$_TASK_PROCESSOR_RESPONSE }), UNPROVIDED);
        return list(PROGN, listS(DEFINE_PUBLIC, response_dispatch_fn, args, append(body, NIL)), task_processor.$list274, list(DICTIONARY_ENTER, task_processor.$task_processor_response_dispatch_fn_dict$, make_keyword(type), list(FUNCTION, response_dispatch_fn)));
    }

    /**
     * Return T when there are task processors.
     */
    @LispMethod(comment = "Return T when there are task processors.")
    public static final SubLObject api_task_processors_initialized_p_alt() {
        return com.cyc.cycjava.cycl.task_processor.task_processors_initialized_p($api_task_process_pool$.getGlobalValue());
    }

    @LispMethod(comment = "Return T when there are task processors.")
    public static SubLObject api_task_processors_initialized_p() {
        return task_processor.task_processors_initialized_p(task_processor.$api_task_process_pool$.getGlobalValue());
    }

    /**
     * Initialize the task processor pool for requests.
     */
    @LispMethod(comment = "Initialize the task processor pool for requests.")
    public static final SubLObject initialize_api_task_processors_alt() {
        {
            SubLObject lock = $api_task_process_pool_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != $api_task_process_pool$.getGlobalValue()) {
                    Errors.error($str_alt250$Illegal_attempt_to_reinitialize_p);
                }
                $api_task_process_pool$.setGlobalValue(com.cyc.cycjava.cycl.task_processor.initialize_task_processors(cconcatenate($$$API, $str_alt201$_processor_), FIVE_INTEGER, $int$25));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Initialize the task processor pool for requests.")
    public static SubLObject initialize_api_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$api_task_process_pool_lock$.getGlobalValue());
            if (NIL != task_processor.$api_task_process_pool$.getGlobalValue()) {
                Errors.error(task_processor.$str278$Illegal_attempt_to_reinitialize_p);
            }
            task_processor.$api_task_process_pool$.setGlobalValue(task_processor.initialize_task_processors(cconcatenate(task_processor.$$$API, task_processor.$$$_processor_), FIVE_INTEGER, task_processor.$int$25));
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$api_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     * Halt the task processors.
     */
    @LispMethod(comment = "Halt the task processors.")
    public static final SubLObject halt_api_task_processors_alt() {
        {
            SubLObject lock = $api_task_process_pool_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != $api_task_process_pool$.getGlobalValue()) {
                    com.cyc.cycjava.cycl.task_processor.halt_task_processors($api_task_process_pool$.getGlobalValue());
                    $api_task_process_pool$.setGlobalValue(NIL);
                    com.cyc.cycjava.cycl.task_processor.ensure_task_processors_killed($$$API);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Halt the task processors.")
    public static SubLObject halt_api_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$api_task_process_pool_lock$.getGlobalValue());
            if (NIL != task_processor.$api_task_process_pool$.getGlobalValue()) {
                task_processor.halt_task_processors(task_processor.$api_task_process_pool$.getGlobalValue());
                task_processor.flush_tpool_background_msgs();
                task_processor.$api_task_process_pool$.setGlobalValue(NIL);
                task_processor.ensure_task_processors_killed(task_processor.$$$API);
            }
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$api_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject restart_api_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$api_task_process_pool_lock$.getGlobalValue());
            if (NIL != task_processor.$api_task_process_pool$.getGlobalValue()) {
                task_processor.halt_task_processors(task_processor.$api_task_process_pool$.getGlobalValue());
                task_processor.$api_task_process_pool$.setGlobalValue(NIL);
                task_processor.ensure_task_processors_killed(task_processor.$$$API);
            }
            task_processor.$api_task_process_pool$.setGlobalValue(task_processor.initialize_task_processors(cconcatenate(task_processor.$$$API, task_processor.$$$_processor_), FIVE_INTEGER, task_processor.$int$25));
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$api_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     * Show and reset the task processor background messages for the
     * task-process-pool.
     */
    @LispMethod(comment = "Show and reset the task processor background messages for the\r\ntask-process-pool.\nShow and reset the task processor background messages for the\ntask-process-pool.")
    public static final SubLObject show_api_tp_msgs_alt() {
        if (NIL != $api_task_process_pool$.getGlobalValue()) {
            com.cyc.cycjava.cycl.task_processor.show_tp_msgs($api_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    @LispMethod(comment = "Show and reset the task processor background messages for the\r\ntask-process-pool.\nShow and reset the task processor background messages for the\ntask-process-pool.")
    public static SubLObject show_api_tp_msgs() {
        if (NIL != task_processor.$api_task_process_pool$.getGlobalValue()) {
            task_processor.show_tp_msgs(task_processor.$api_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    /**
     * Provides a convenient alias for DISPLAY-API-TASK-PROCESSORS.
     */
    @LispMethod(comment = "Provides a convenient alias for DISPLAY-API-TASK-PROCESSORS.")
    public static final SubLObject show_api_task_processors_alt() {
        com.cyc.cycjava.cycl.task_processor.display_api_task_processors();
        return NIL;
    }

    @LispMethod(comment = "Provides a convenient alias for DISPLAY-API-TASK-PROCESSORS.")
    public static SubLObject show_api_task_processors() {
        task_processor.display_api_task_processors();
        return NIL;
    }

    /**
     *
     */
    public static final SubLObject display_api_task_processors_alt() {
        if (NIL != $api_task_process_pool$.getGlobalValue()) {
            com.cyc.cycjava.cycl.task_processor.display_task_processors($api_task_process_pool$.getGlobalValue(), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject display_api_task_processors() {
        if (NIL != task_processor.$api_task_process_pool$.getGlobalValue()) {
            task_processor.display_task_processors(task_processor.$api_task_process_pool$.getGlobalValue(), UNPROVIDED);
        }
        return NIL;
    }

    /**
     *
     *
     * @param REQUEST;
     * 		consp for evaluation
     * @param ID;
    integerp
     * 		
     * @param PRIORITY;
    intergerp
     * 		
     * @param REQUESTOR;
    stringp
     * 		
     * @param BINDINGS;
     * 		consp of (var value) pairs
     * @param UUID-STRING;
     * 		stringp that identifies the client when aschronously returning the response
     * 		Submits the REQUEST form to the task request queue with ID, PRIORITY,
     * 		REQUESTOR, OUT-STREAM and BINDINGS.  If the request is wrapped with WITH-IMMEDIATE-EXECUTION, then
     * 		the request is executed in this thread and the result enqueued on the response queue.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tconsp for evaluation\r\n@param ID;\nintegerp\r\n\t\t\r\n@param PRIORITY;\nintergerp\r\n\t\t\r\n@param REQUESTOR;\nstringp\r\n\t\t\r\n@param BINDINGS;\r\n\t\tconsp of (var value) pairs\r\n@param UUID-STRING;\r\n\t\tstringp that identifies the client when aschronously returning the response\r\n\t\tSubmits the REQUEST form to the task request queue with ID, PRIORITY,\r\n\t\tREQUESTOR, OUT-STREAM and BINDINGS.  If the request is wrapped with WITH-IMMEDIATE-EXECUTION, then\r\n\t\tthe request is executed in this thread and the result enqueued on the response queue.")
    public static final SubLObject api_task_processor_request_alt(SubLObject request, SubLObject id, SubLObject priority, SubLObject requestor, SubLObject v_bindings, SubLObject uuid_string) {
        {
            SubLObject immediate_executionP = eq(request.first(), WITH_IMMEDIATE_EXECUTION);
            SubLObject task_info = com.cyc.cycjava.cycl.task_processor.make_task_info(UNPROVIDED);
            if (NIL != immediate_executionP) {
                request = second(request);
            }
            com.cyc.cycjava.cycl.task_processor.set_task_info_type($API, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_id(id, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_priority(priority, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_requestor(requestor, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_giveback_info(uuid_string, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_bindings(v_bindings, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_request(request, task_info);
            com.cyc.cycjava.cycl.task_processor.enqueue_task_request(task_info, $api_task_process_pool$.getGlobalValue());
            return NIL;
        }
    }

    /**
     *
     *
     * @param REQUEST;
     * 		consp for evaluation
     * @param ID;
    integerp
     * 		
     * @param PRIORITY;
    intergerp
     * 		
     * @param REQUESTOR;
    stringp
     * 		
     * @param BINDINGS;
     * 		consp of (var value) pairs
     * @param UUID-STRING;
     * 		stringp that identifies the client when aschronously returning the response
     * 		Submits the REQUEST form to the task request queue with ID, PRIORITY,
     * 		REQUESTOR, OUT-STREAM and BINDINGS.  If the request is wrapped with WITH-IMMEDIATE-EXECUTION, then
     * 		the request is executed in this thread and the result enqueued on the response queue.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tconsp for evaluation\r\n@param ID;\nintegerp\r\n\t\t\r\n@param PRIORITY;\nintergerp\r\n\t\t\r\n@param REQUESTOR;\nstringp\r\n\t\t\r\n@param BINDINGS;\r\n\t\tconsp of (var value) pairs\r\n@param UUID-STRING;\r\n\t\tstringp that identifies the client when aschronously returning the response\r\n\t\tSubmits the REQUEST form to the task request queue with ID, PRIORITY,\r\n\t\tREQUESTOR, OUT-STREAM and BINDINGS.  If the request is wrapped with WITH-IMMEDIATE-EXECUTION, then\r\n\t\tthe request is executed in this thread and the result enqueued on the response queue.")
    public static SubLObject api_task_processor_request(SubLObject request, final SubLObject id, final SubLObject priority, final SubLObject requestor, final SubLObject v_bindings, final SubLObject uuid_string) {
        final SubLObject immediate_executionP = eq(request.first(), task_processor.WITH_IMMEDIATE_EXECUTION);
        final SubLObject task_info = task_processor.make_task_info(UNPROVIDED);
        if (NIL != immediate_executionP) {
            request = second(request);
        }
        task_processor.set_task_info_type($API, task_info);
        task_processor.set_task_info_id(id, task_info);
        task_processor.set_task_info_priority(priority, task_info);
        task_processor.set_task_info_requestor(requestor, task_info);
        task_processor.set_task_info_giveback_info(uuid_string, task_info);
        task_processor.set_task_info_bindings(v_bindings, task_info);
        task_processor.set_task_info_request(request, task_info);
        task_processor.enqueue_task_request(task_info, task_processor.$api_task_process_pool$.getGlobalValue());
        return NIL;
    }

    /**
     * Sets the indicator that lease renewal requests should be displayed on the console.
     *
     * @param indicator
     * 		: booleanp
     */
    @LispMethod(comment = "Sets the indicator that lease renewal requests should be displayed on the console.\r\n\r\n@param indicator\r\n\t\t: booleanp")
    public static final SubLObject set_java_api_lease_activity_display_alt(SubLObject indicator) {
        SubLTrampolineFile.checkType(indicator, BOOLEANP);
        $java_api_lease_activity_display$.setGlobalValue(indicator);
        return $java_api_lease_activity_display$.getGlobalValue();
    }

    @LispMethod(comment = "Sets the indicator that lease renewal requests should be displayed on the console.\r\n\r\n@param indicator\r\n\t\t: booleanp")
    public static SubLObject set_java_api_lease_activity_display(final SubLObject indicator) {
        assert NIL != booleanp(indicator) : "! booleanp(indicator) " + ("Types.booleanp(indicator) " + "CommonSymbols.NIL != Types.booleanp(indicator) ") + indicator;
        task_processor.$java_api_lease_activity_display$.setGlobalValue(indicator);
        return task_processor.$java_api_lease_activity_display$.getGlobalValue();
    }

    /**
     * Returns the indicator that lease renewal requests should be displayed on the console.
     */
    @LispMethod(comment = "Returns the indicator that lease renewal requests should be displayed on the console.")
    public static final SubLObject java_api_lease_activity_display_alt() {
        return $java_api_lease_activity_display$.getGlobalValue();
    }

    @LispMethod(comment = "Returns the indicator that lease renewal requests should be displayed on the console.")
    public static SubLObject java_api_lease_activity_display() {
        return task_processor.$java_api_lease_activity_display$.getGlobalValue();
    }

    public static final SubLObject dispatch_task_processor_response_alt(SubLObject task_info, SubLObject finished) {
        if (finished == UNPROVIDED) {
            finished = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $minimize_task_processor_info_communication$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.task_processor.set_task_info_request(NIL, task_info);
            }
            funcall(dictionary.dictionary_lookup($task_processor_response_dispatch_fn_dict$.getGlobalValue(), com.cyc.cycjava.cycl.task_processor.ti_type(task_info), UNPROVIDED), task_info, finished);
            return NIL;
        }
    }

    public static SubLObject dispatch_task_processor_response(final SubLObject task_info, SubLObject finished) {
        if (finished == UNPROVIDED) {
            finished = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != task_processor.$minimize_task_processor_info_communication$.getDynamicValue(thread)) {
            task_processor.set_task_info_request(NIL, task_info);
        }
        funcall(dictionary.dictionary_lookup(task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue(), task_processor.ti_type(task_info), UNPROVIDED), task_info, finished);
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @param FINISHED;
     * 		booleanp
     * 		Dispatches the api task-info item by sending the
     * 		response to the api client socket from which the
     * 		request originated.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@param FINISHED;\r\n\t\tbooleanp\r\n\t\tDispatches the api task-info item by sending the\r\n\t\tresponse to the api client socket from which the\r\n\t\trequest originated.")
    public static final SubLObject dispatch_api_task_processor_response_alt(SubLObject task_info, SubLObject finished) {
        if (finished == UNPROVIDED) {
            finished = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($task_processor_verbosity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
                com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt263$Dispatching_api_response__S__, task_info), $api_task_process_pool$.getGlobalValue());
            }
            {
                SubLObject uuid_string = com.cyc.cycjava.cycl.task_processor.get_task_info_giveback_info(task_info);
                SubLObject task_processor_response = list(TASK_PROCESSOR_RESPONSE, com.cyc.cycjava.cycl.task_processor.get_task_info_request(task_info), com.cyc.cycjava.cycl.task_processor.get_task_info_id(task_info), com.cyc.cycjava.cycl.task_processor.get_task_info_priority(task_info), com.cyc.cycjava.cycl.task_processor.get_task_info_requestor(task_info), com.cyc.cycjava.cycl.task_processor.get_task_info_response(task_info), com.cyc.cycjava.cycl.task_processor.get_task_info_error_message(task_info), finished);
                SubLObject socket = java_api_kernel.java_api_socket_out_stream(uuid_string);
                SubLObject lock = java_api_kernel.java_api_lock(uuid_string);
                {
                    SubLObject _prev_bind_0 = cfasl_kb_methods.$within_complete_cfasl_objects$.currentBinding(thread);
                    try {
                        cfasl_kb_methods.$within_complete_cfasl_objects$.bind(T, thread);
                        if (socket.isStream() && (NIL != open_stream_p(socket))) {
                            cfasl_kernel.cfasl_set_mode_externalized();
                            if (com.cyc.cycjava.cycl.task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                                com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt265$Sending_api_response__S_to_socket, new SubLObject[]{ com.cyc.cycjava.cycl.task_processor.get_task_info_response(task_info), socket, uuid_string }), $api_task_process_pool$.getGlobalValue());
                            }
                            {
                                SubLObject lock_6 = lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock_6);
                                    cfasl_kernel.send_cfasl_result(socket, task_processor_response, NIL);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock_6);
                                    }
                                }
                            }
                        } else {
                            if (com.cyc.cycjava.cycl.task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                                com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt266$Dropping_api_response__S__socket_, new SubLObject[]{ task_processor_response, socket, uuid_string }), $api_task_process_pool$.getGlobalValue());
                            }
                        }
                    } finally {
                        cfasl_kb_methods.$within_complete_cfasl_objects$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param TASK-INFO;
    task-info-p
     * 		
     * @param FINISHED;
     * 		booleanp
     * 		Dispatches the api task-info item by sending the
     * 		response to the api client socket from which the
     * 		request originated.
     */
    @LispMethod(comment = "@param TASK-INFO;\ntask-info-p\r\n\t\t\r\n@param FINISHED;\r\n\t\tbooleanp\r\n\t\tDispatches the api task-info item by sending the\r\n\t\tresponse to the api client socket from which the\r\n\t\trequest originated.")
    public static SubLObject dispatch_api_task_processor_response(final SubLObject task_info, SubLObject finished) {
        if (finished == UNPROVIDED) {
            finished = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (task_processor.$task_processor_verbosity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, task_processor.$str292$Dispatching_api_response__S__, task_info), task_processor.$api_task_process_pool$.getGlobalValue());
        }
        final SubLObject uuid_string = task_processor.get_task_info_giveback_info(task_info);
        final SubLObject task_processor_response = list(task_processor.TASK_PROCESSOR_RESPONSE, task_processor.get_task_info_request(task_info), task_processor.get_task_info_id(task_info), task_processor.get_task_info_priority(task_info), task_processor.get_task_info_requestor(task_info), task_processor.get_task_info_response(task_info), task_processor.get_task_info_error_message(task_info), finished);
        final SubLObject socket = java_api_kernel.java_api_socket_out_stream(uuid_string);
        final SubLObject lock = java_api_kernel.java_api_lock(uuid_string);
        final SubLObject _prev_bind_0 = cfasl_kb_methods.$within_complete_cfasl_objects$.currentBinding(thread);
        try {
            cfasl_kb_methods.$within_complete_cfasl_objects$.bind(T, thread);
            if (socket.isStream() && (NIL != open_stream_p(socket))) {
                cfasl_kernel.cfasl_set_mode_externalized();
                if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                    task_processor.push_tpool_background_msg(format(NIL, task_processor.$str294$Sending_api_response__S_to_socket, new SubLObject[]{ task_processor.get_task_info_response(task_info), socket, uuid_string }), task_processor.$api_task_process_pool$.getGlobalValue());
                }
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    cfasl_kernel.send_cfasl_result(socket, task_processor_response, NIL);
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            } else
                if (task_processor.get_task_processor_verbosity().numG(ZERO_INTEGER)) {
                    task_processor.push_tpool_background_msg(format(NIL, task_processor.$str295$Dropping_api_response__S__socket_, new SubLObject[]{ task_processor_response, socket, uuid_string }), task_processor.$api_task_process_pool$.getGlobalValue());
                }

        } finally {
            cfasl_kb_methods.$within_complete_cfasl_objects$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    /**
     * Decorates an accumulator with asynchronous intermediate results.
     * Its final contents is the number of entries it has sent.
     */
    @LispMethod(comment = "Decorates an accumulator with asynchronous intermediate results.\r\nIts final contents is the number of entries it has sent.\nDecorates an accumulator with asynchronous intermediate results.\nIts final contents is the number of entries it has sent.")
    public static final SubLObject new_intermediate_results_accumulator_alt(SubLObject wrapped) {
        return accumulation.new_accumulator(wrapped, INTERMEDIATE_RESULTS_ACCUMULATOR_RESET, INTERMEDIATE_RESULTS_ACCUMULATOR_ADD, INTERMEDIATE_RESULTS_ACCUMULATOR_SIZE, INTERMEDIATE_RESULTS_ACCUMULATOR_CONTENTS, INTERMEDIATE_RESULTS_ACCUMULATOR_ITERATOR, INTERMEDIATE_RESULTS_ACCUMULATOR_ADD_ALL);
    }

    @LispMethod(comment = "Decorates an accumulator with asynchronous intermediate results.\r\nIts final contents is the number of entries it has sent.\nDecorates an accumulator with asynchronous intermediate results.\nIts final contents is the number of entries it has sent.")
    public static SubLObject new_intermediate_results_accumulator(final SubLObject wrapped) {
        return accumulation.new_accumulator(wrapped, task_processor.INTERMEDIATE_RESULTS_ACCUMULATOR_RESET, task_processor.INTERMEDIATE_RESULTS_ACCUMULATOR_ADD, task_processor.INTERMEDIATE_RESULTS_ACCUMULATOR_SIZE, task_processor.INTERMEDIATE_RESULTS_ACCUMULATOR_CONTENTS, task_processor.INTERMEDIATE_RESULTS_ACCUMULATOR_ITERATOR, task_processor.INTERMEDIATE_RESULTS_ACCUMULATOR_ADD_ALL);
    }

    /**
     * As each result becomes available, post it to the context's task
     * processor output. However, since the intermediate results expect
     * lists of results, auto-wrap them into a list.
     */
    @LispMethod(comment = "As each result becomes available, post it to the context\'s task\r\nprocessor output. However, since the intermediate results expect\r\nlists of results, auto-wrap them into a list.\nAs each result becomes available, post it to the context\'s task\nprocessor output. However, since the intermediate results expect\nlists of results, auto-wrap them into a list.")
    public static final SubLObject intermediate_results_accumulator_add_alt(SubLObject state, SubLObject item) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.task_processor.task_process_pool_p(com.cyc.cycjava.cycl.task_processor.get_task_process_pool_for_process(current_process()))) {
                    Errors.error(Errors.error($str_alt274$Cannot_invoke_intermediate_result));
                }
            }
            {
                SubLObject wrapped = state;
                accumulation.accumulation_add(wrapped, item);
            }
            com.cyc.cycjava.cycl.task_processor.post_task_info_processor_partial_results(list(item));
            return state;
        }
    }

    @LispMethod(comment = "As each result becomes available, post it to the context\'s task\r\nprocessor output. However, since the intermediate results expect\r\nlists of results, auto-wrap them into a list.\nAs each result becomes available, post it to the context\'s task\nprocessor output. However, since the intermediate results expect\nlists of results, auto-wrap them into a list.")
    public static SubLObject intermediate_results_accumulator_add(final SubLObject state, final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == task_processor.task_process_pool_p(task_processor.get_task_process_pool_for_process(current_process())))) {
            Errors.error(Errors.error(task_processor.$str303$Cannot_invoke_intermediate_result));
        }
        accumulation.accumulation_add(state, item);
        task_processor.post_task_info_processor_partial_results(list(item));
        return state;
    }

    /**
     * As a group of results become available, post them individually to
     * the underlying wrapped accumualtor but send them as a group to the
     * listener of the task processor.
     */
    @LispMethod(comment = "As a group of results become available, post them individually to\r\nthe underlying wrapped accumualtor but send them as a group to the\r\nlistener of the task processor.\nAs a group of results become available, post them individually to\nthe underlying wrapped accumualtor but send them as a group to the\nlistener of the task processor.")
    public static final SubLObject intermediate_results_accumulator_add_all_alt(SubLObject state, SubLObject items) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == com.cyc.cycjava.cycl.task_processor.task_process_pool_p(com.cyc.cycjava.cycl.task_processor.get_task_process_pool_for_process(current_process()))) {
                    Errors.error(Errors.error($str_alt274$Cannot_invoke_intermediate_result));
                }
            }
            {
                SubLObject wrapped = state;
                accumulation.accumulation_add_all(wrapped, items);
            }
            com.cyc.cycjava.cycl.task_processor.post_task_info_processor_partial_results(items);
            return state;
        }
    }

    @LispMethod(comment = "As a group of results become available, post them individually to\r\nthe underlying wrapped accumualtor but send them as a group to the\r\nlistener of the task processor.\nAs a group of results become available, post them individually to\nthe underlying wrapped accumualtor but send them as a group to the\nlistener of the task processor.")
    public static SubLObject intermediate_results_accumulator_add_all(final SubLObject state, final SubLObject items) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == task_processor.task_process_pool_p(task_processor.get_task_process_pool_for_process(current_process())))) {
            Errors.error(Errors.error(task_processor.$str303$Cannot_invoke_intermediate_result));
        }
        accumulation.accumulation_add_all(state, items);
        task_processor.post_task_info_processor_partial_results(items);
        return state;
    }

    /**
     * Reset the old state by passing the call through to the wrapped accumulator.
     */
    @LispMethod(comment = "Reset the old state by passing the call through to the wrapped accumulator.")
    public static final SubLObject intermediate_results_accumulator_reset_alt(SubLObject old_state) {
        {
            SubLObject wrapped = old_state;
            accumulation.accumulation_reset(wrapped);
        }
        return old_state;
    }

    @LispMethod(comment = "Reset the old state by passing the call through to the wrapped accumulator.")
    public static SubLObject intermediate_results_accumulator_reset(final SubLObject old_state) {
        accumulation.accumulation_reset(old_state);
        return old_state;
    }

    /**
     * Determine the size by passing the call through to the wrapped accumulator.
     */
    @LispMethod(comment = "Determine the size by passing the call through to the wrapped accumulator.")
    public static final SubLObject intermediate_results_accumulator_size_alt(SubLObject state) {
        {
            SubLObject wrapped = state;
            return accumulation.accumulation_size(wrapped);
        }
    }

    @LispMethod(comment = "Determine the size by passing the call through to the wrapped accumulator.")
    public static SubLObject intermediate_results_accumulator_size(final SubLObject state) {
        return accumulation.accumulation_size(state);
    }

    /**
     * Determine the contents by passing the call through to the wrapped accumulator.
     */
    @LispMethod(comment = "Determine the contents by passing the call through to the wrapped accumulator.")
    public static final SubLObject intermediate_results_accumulator_contents_alt(SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        {
            SubLObject wrapped = state;
            return accumulation.accumulation_contents(wrapped, resetP);
        }
    }

    @LispMethod(comment = "Determine the contents by passing the call through to the wrapped accumulator.")
    public static SubLObject intermediate_results_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        return accumulation.accumulation_contents(state, resetP);
    }

    /**
     * Create an iterator by passing the call through to the wrapped accumulator.
     */
    @LispMethod(comment = "Create an iterator by passing the call through to the wrapped accumulator.")
    public static final SubLObject intermediate_results_accumulator_iterator_alt(SubLObject state) {
        {
            SubLObject wrapped = state;
            return accumulation.accumulation_iterator(wrapped);
        }
    }

    @LispMethod(comment = "Create an iterator by passing the call through to the wrapped accumulator.")
    public static SubLObject intermediate_results_accumulator_iterator(final SubLObject state) {
        return accumulation.accumulation_iterator(state);
    }

    /**
     * Return T when there are task processors.
     */
    @LispMethod(comment = "Return T when there are task processors.")
    public static final SubLObject bg_task_processors_initialized_p_alt() {
        return com.cyc.cycjava.cycl.task_processor.task_processors_initialized_p($bg_task_process_pool$.getGlobalValue());
    }

    @LispMethod(comment = "Return T when there are task processors.")
    public static SubLObject bg_task_processors_initialized_p() {
        return task_processor.task_processors_initialized_p(task_processor.$bg_task_process_pool$.getGlobalValue());
    }

    /**
     * Initialize the task processor pool for requests.
     */
    @LispMethod(comment = "Initialize the task processor pool for requests.")
    public static final SubLObject initialize_bg_task_processors_alt() {
        {
            SubLObject lock = $bg_task_process_pool_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != $bg_task_process_pool$.getGlobalValue()) {
                    Errors.error($str_alt250$Illegal_attempt_to_reinitialize_p);
                }
                $bg_task_process_pool$.setGlobalValue(com.cyc.cycjava.cycl.task_processor.initialize_task_processors(cconcatenate($$$BG, $str_alt201$_processor_), TWO_INTEGER, TWO_INTEGER));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Initialize the task processor pool for requests.")
    public static SubLObject initialize_bg_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$bg_task_process_pool_lock$.getGlobalValue());
            if (NIL != task_processor.$bg_task_process_pool$.getGlobalValue()) {
                Errors.error(task_processor.$str278$Illegal_attempt_to_reinitialize_p);
            }
            task_processor.$bg_task_process_pool$.setGlobalValue(task_processor.initialize_task_processors(cconcatenate(task_processor.$$$BG, task_processor.$$$_processor_), TWO_INTEGER, TWO_INTEGER));
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$bg_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     * Halt the task processors.
     */
    @LispMethod(comment = "Halt the task processors.")
    public static final SubLObject halt_bg_task_processors_alt() {
        {
            SubLObject lock = $bg_task_process_pool_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != $bg_task_process_pool$.getGlobalValue()) {
                    com.cyc.cycjava.cycl.task_processor.halt_task_processors($bg_task_process_pool$.getGlobalValue());
                    $bg_task_process_pool$.setGlobalValue(NIL);
                    com.cyc.cycjava.cycl.task_processor.ensure_task_processors_killed($$$BG);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Halt the task processors.")
    public static SubLObject halt_bg_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$bg_task_process_pool_lock$.getGlobalValue());
            if (NIL != task_processor.$bg_task_process_pool$.getGlobalValue()) {
                task_processor.halt_task_processors(task_processor.$bg_task_process_pool$.getGlobalValue());
                task_processor.flush_tpool_background_msgs();
                task_processor.$bg_task_process_pool$.setGlobalValue(NIL);
                task_processor.ensure_task_processors_killed(task_processor.$$$BG);
            }
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$bg_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject restart_bg_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$bg_task_process_pool_lock$.getGlobalValue());
            if (NIL != task_processor.$bg_task_process_pool$.getGlobalValue()) {
                task_processor.halt_task_processors(task_processor.$bg_task_process_pool$.getGlobalValue());
                task_processor.$bg_task_process_pool$.setGlobalValue(NIL);
                task_processor.ensure_task_processors_killed(task_processor.$$$BG);
            }
            task_processor.$bg_task_process_pool$.setGlobalValue(task_processor.initialize_task_processors(cconcatenate(task_processor.$$$BG, task_processor.$$$_processor_), TWO_INTEGER, TWO_INTEGER));
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$bg_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     * Show and reset the task processor background messages for the
     * task-process-pool.
     */
    @LispMethod(comment = "Show and reset the task processor background messages for the\r\ntask-process-pool.\nShow and reset the task processor background messages for the\ntask-process-pool.")
    public static final SubLObject show_bg_tp_msgs_alt() {
        if (NIL != $bg_task_process_pool$.getGlobalValue()) {
            com.cyc.cycjava.cycl.task_processor.show_tp_msgs($bg_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    @LispMethod(comment = "Show and reset the task processor background messages for the\r\ntask-process-pool.\nShow and reset the task processor background messages for the\ntask-process-pool.")
    public static SubLObject show_bg_tp_msgs() {
        if (NIL != task_processor.$bg_task_process_pool$.getGlobalValue()) {
            task_processor.show_tp_msgs(task_processor.$bg_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    /**
     *
     *
     * @param REQUEST;
     * 		consp for evaluation
     * @param ID;
    integerp
     * 		
     * @param PRIORITY;
    intergerp
     * 		
     * @param REQUESTOR;
    stringp
     * 		
     * @param BINDINGS;
     * 		consp of (var value) pairs
     * @param REQUESTOR-PROCESS;
     * 		process-p the requesting process
     * 		Submits the REQUEST form to the task request queue with ID, PRIORITY,
     * 		REQUESTOR, BINDINGS and REQUESTOR-PROCESS.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tconsp for evaluation\r\n@param ID;\nintegerp\r\n\t\t\r\n@param PRIORITY;\nintergerp\r\n\t\t\r\n@param REQUESTOR;\nstringp\r\n\t\t\r\n@param BINDINGS;\r\n\t\tconsp of (var value) pairs\r\n@param REQUESTOR-PROCESS;\r\n\t\tprocess-p the requesting process\r\n\t\tSubmits the REQUEST form to the task request queue with ID, PRIORITY,\r\n\t\tREQUESTOR, BINDINGS and REQUESTOR-PROCESS.")
    public static final SubLObject bg_task_processor_request_alt(SubLObject request, SubLObject id, SubLObject priority, SubLObject requestor, SubLObject v_bindings, SubLObject requestor_process) {
        {
            SubLObject task_info = com.cyc.cycjava.cycl.task_processor.make_task_info(UNPROVIDED);
            com.cyc.cycjava.cycl.task_processor.set_task_info_type($BG, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_id(id, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_priority(priority, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_requestor(requestor, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_giveback_info(requestor_process, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_bindings(v_bindings, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_request(request, task_info);
            com.cyc.cycjava.cycl.task_processor.enqueue_task_request(task_info, $bg_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    /**
     *
     *
     * @param REQUEST;
     * 		consp for evaluation
     * @param ID;
    integerp
     * 		
     * @param PRIORITY;
    intergerp
     * 		
     * @param REQUESTOR;
    stringp
     * 		
     * @param BINDINGS;
     * 		consp of (var value) pairs
     * @param REQUESTOR-PROCESS;
     * 		process-p the requesting process
     * 		Submits the REQUEST form to the task request queue with ID, PRIORITY,
     * 		REQUESTOR, BINDINGS and REQUESTOR-PROCESS.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tconsp for evaluation\r\n@param ID;\nintegerp\r\n\t\t\r\n@param PRIORITY;\nintergerp\r\n\t\t\r\n@param REQUESTOR;\nstringp\r\n\t\t\r\n@param BINDINGS;\r\n\t\tconsp of (var value) pairs\r\n@param REQUESTOR-PROCESS;\r\n\t\tprocess-p the requesting process\r\n\t\tSubmits the REQUEST form to the task request queue with ID, PRIORITY,\r\n\t\tREQUESTOR, BINDINGS and REQUESTOR-PROCESS.")
    public static SubLObject bg_task_processor_request(final SubLObject request, final SubLObject id, final SubLObject priority, final SubLObject requestor, final SubLObject v_bindings, final SubLObject requestor_process) {
        final SubLObject task_info = task_processor.make_task_info(UNPROVIDED);
        task_processor.set_task_info_type($BG, task_info);
        task_processor.set_task_info_id(id, task_info);
        task_processor.set_task_info_priority(priority, task_info);
        task_processor.set_task_info_requestor(requestor, task_info);
        task_processor.set_task_info_giveback_info(requestor_process, task_info);
        task_processor.set_task_info_bindings(v_bindings, task_info);
        task_processor.set_task_info_request(request, task_info);
        task_processor.enqueue_task_request(task_info, task_processor.$bg_task_process_pool$.getGlobalValue());
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
     * 		task-info-p
     * 		Dispatches the background task-info item by placing the
     * 		response into a dictionary from which the unblocked process
     * 		can obtain the result.
     */
    @LispMethod(comment = "@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tDispatches the background task-info item by placing the\r\n\t\tresponse into a dictionary from which the unblocked process\r\n\t\tcan obtain the result.")
    public static final SubLObject dispatch_bg_task_processor_response_alt(SubLObject task_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($task_processor_verbosity$.getDynamicValue(thread).numG(MINUS_ONE_INTEGER)) {
                com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt277$dispatching_bg_response__S__, task_info), $bg_task_process_pool$.getGlobalValue());
            }
            {
                SubLObject requestor_process = com.cyc.cycjava.cycl.task_processor.get_task_info_giveback_info(task_info);
                if ($task_processor_verbosity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
                    com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt278$bg_response_dictionary__S__, $bg_task_processor_response_dict$.getGlobalValue()), $bg_task_process_pool$.getGlobalValue());
                }
                if (NIL == $bg_task_processor_response_dict$.getGlobalValue()) {
                    $bg_task_processor_response_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
                }
                if ($task_processor_verbosity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
                    com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt278$bg_response_dictionary__S__, $bg_task_processor_response_dict$.getGlobalValue()), $bg_task_process_pool$.getGlobalValue());
                }
                dictionary.dictionary_enter($bg_task_processor_response_dict$.getGlobalValue(), requestor_process, task_info);
                process_unblock(requestor_process);
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param TASK-INFO;
     * 		task-info-p
     * 		Dispatches the background task-info item by placing the
     * 		response into a dictionary from which the unblocked process
     * 		can obtain the result.
     */
    @LispMethod(comment = "@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tDispatches the background task-info item by placing the\r\n\t\tresponse into a dictionary from which the unblocked process\r\n\t\tcan obtain the result.")
    public static SubLObject dispatch_bg_task_processor_response(final SubLObject task_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (task_processor.$task_processor_verbosity$.getDynamicValue(thread).numG(MINUS_ONE_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, task_processor.$str306$dispatching_bg_response__S__, task_info), task_processor.$bg_task_process_pool$.getGlobalValue());
        }
        final SubLObject requestor_process = task_processor.get_task_info_giveback_info(task_info);
        if (task_processor.$task_processor_verbosity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, task_processor.$str307$bg_response_dictionary__S__, task_processor.$bg_task_processor_response_dict$.getGlobalValue()), task_processor.$bg_task_process_pool$.getGlobalValue());
        }
        if (NIL == task_processor.$bg_task_processor_response_dict$.getGlobalValue()) {
            task_processor.$bg_task_processor_response_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        if (task_processor.$task_processor_verbosity$.getDynamicValue(thread).numG(ZERO_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, task_processor.$str307$bg_response_dictionary__S__, task_processor.$bg_task_processor_response_dict$.getGlobalValue()), task_processor.$bg_task_process_pool$.getGlobalValue());
        }
        dictionary.dictionary_enter(task_processor.$bg_task_processor_response_dict$.getGlobalValue(), requestor_process, task_info);
        process_unblock(requestor_process);
        return NIL;
    }

    /**
     *
     *
     * @param FORM;
     * 		an expression for background evaluation
     * 		Blocks until the FORM is evaluated by a task-processor.
     */
    @LispMethod(comment = "@param FORM;\r\n\t\tan expression for background evaluation\r\n\t\tBlocks until the FORM is evaluated by a task-processor.")
    public static final SubLObject bg_api_eval_alt(SubLObject form) {
        $bg_task_processor_request_id$.setGlobalValue(add($bg_task_processor_request_id$.getGlobalValue(), ONE_INTEGER));
        com.cyc.cycjava.cycl.task_processor.bg_task_processor_request(form, $bg_task_processor_request_id$.getGlobalValue(), ONE_INTEGER, process_name(current_process()), NIL, current_process());
        process_block();
        {
            SubLObject task_info = dictionary.dictionary_lookup($bg_task_processor_response_dict$.getGlobalValue(), current_process(), UNPROVIDED);
            return com.cyc.cycjava.cycl.task_processor.get_task_info_response(task_info);
        }
    }

    /**
     *
     *
     * @param FORM;
     * 		an expression for background evaluation
     * 		Blocks until the FORM is evaluated by a task-processor.
     */
    @LispMethod(comment = "@param FORM;\r\n\t\tan expression for background evaluation\r\n\t\tBlocks until the FORM is evaluated by a task-processor.")
    public static SubLObject bg_api_eval(final SubLObject form) {
        task_processor.$bg_task_processor_request_id$.setGlobalValue(add(task_processor.$bg_task_processor_request_id$.getGlobalValue(), ONE_INTEGER));
        task_processor.bg_task_processor_request(form, task_processor.$bg_task_processor_request_id$.getGlobalValue(), ONE_INTEGER, process_name(current_process()), NIL, current_process());
        process_block();
        final SubLObject task_info = dictionary.dictionary_lookup(task_processor.$bg_task_processor_response_dict$.getGlobalValue(), current_process(), UNPROVIDED);
        return task_processor.get_task_info_response(task_info);
    }

    /**
     * Return T when there are task processors.
     */
    @LispMethod(comment = "Return T when there are task processors.")
    public static final SubLObject console_task_processors_initialized_p_alt() {
        return com.cyc.cycjava.cycl.task_processor.task_processors_initialized_p($console_task_process_pool$.getGlobalValue());
    }

    @LispMethod(comment = "Return T when there are task processors.")
    public static SubLObject console_task_processors_initialized_p() {
        return task_processor.task_processors_initialized_p(task_processor.$console_task_process_pool$.getGlobalValue());
    }

    /**
     * Initialize the task processor pool for requests.
     */
    @LispMethod(comment = "Initialize the task processor pool for requests.")
    public static final SubLObject initialize_console_task_processors_alt() {
        {
            SubLObject lock = $console_task_process_pool_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != $console_task_process_pool$.getGlobalValue()) {
                    Errors.error($str_alt250$Illegal_attempt_to_reinitialize_p);
                }
                $console_task_process_pool$.setGlobalValue(com.cyc.cycjava.cycl.task_processor.initialize_task_processors(cconcatenate($$$CONSOLE, $str_alt201$_processor_), FIVE_INTEGER, $int$25));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Initialize the task processor pool for requests.")
    public static SubLObject initialize_console_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$console_task_process_pool_lock$.getGlobalValue());
            if (NIL != task_processor.$console_task_process_pool$.getGlobalValue()) {
                Errors.error(task_processor.$str278$Illegal_attempt_to_reinitialize_p);
            }
            task_processor.$console_task_process_pool$.setGlobalValue(task_processor.initialize_task_processors(cconcatenate(task_processor.$$$CONSOLE, task_processor.$$$_processor_), FIVE_INTEGER, task_processor.$int$25));
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$console_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     * Halt the task processors.
     */
    @LispMethod(comment = "Halt the task processors.")
    public static final SubLObject halt_console_task_processors_alt() {
        {
            SubLObject lock = $console_task_process_pool_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != $console_task_process_pool$.getGlobalValue()) {
                    com.cyc.cycjava.cycl.task_processor.halt_task_processors($console_task_process_pool$.getGlobalValue());
                    $console_task_process_pool$.setGlobalValue(NIL);
                    com.cyc.cycjava.cycl.task_processor.ensure_task_processors_killed($$$CONSOLE);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Halt the task processors.")
    public static SubLObject halt_console_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$console_task_process_pool_lock$.getGlobalValue());
            if (NIL != task_processor.$console_task_process_pool$.getGlobalValue()) {
                task_processor.halt_task_processors(task_processor.$console_task_process_pool$.getGlobalValue());
                task_processor.flush_tpool_background_msgs();
                task_processor.$console_task_process_pool$.setGlobalValue(NIL);
                task_processor.ensure_task_processors_killed(task_processor.$$$CONSOLE);
            }
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$console_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static SubLObject restart_console_task_processors() {
        SubLObject release = NIL;
        try {
            release = seize_lock(task_processor.$console_task_process_pool_lock$.getGlobalValue());
            if (NIL != task_processor.$console_task_process_pool$.getGlobalValue()) {
                task_processor.halt_task_processors(task_processor.$console_task_process_pool$.getGlobalValue());
                task_processor.$console_task_process_pool$.setGlobalValue(NIL);
                task_processor.ensure_task_processors_killed(task_processor.$$$CONSOLE);
            }
            task_processor.$console_task_process_pool$.setGlobalValue(task_processor.initialize_task_processors(cconcatenate(task_processor.$$$CONSOLE, task_processor.$$$_processor_), FIVE_INTEGER, task_processor.$int$25));
        } finally {
            if (NIL != release) {
                release_lock(task_processor.$console_task_process_pool_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     * Show and reset the task processor background messages for the
     * task-process-pool.
     */
    @LispMethod(comment = "Show and reset the task processor background messages for the\r\ntask-process-pool.\nShow and reset the task processor background messages for the\ntask-process-pool.")
    public static final SubLObject show_console_tp_msgs_alt() {
        if (NIL != $console_task_process_pool$.getGlobalValue()) {
            com.cyc.cycjava.cycl.task_processor.show_tp_msgs($console_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    @LispMethod(comment = "Show and reset the task processor background messages for the\r\ntask-process-pool.\nShow and reset the task processor background messages for the\ntask-process-pool.")
    public static SubLObject show_console_tp_msgs() {
        if (NIL != task_processor.$console_task_process_pool$.getGlobalValue()) {
            task_processor.show_tp_msgs(task_processor.$console_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    /**
     *
     *
     * @param REQUEST;
     * 		atom or listp for evaluation
     * @param PRIORITY;
     * 		intergerp
     * 		Submits the REQUEST form to the task request queue with PRIORITY.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tatom or listp for evaluation\r\n@param PRIORITY;\r\n\t\tintergerp\r\n\t\tSubmits the REQUEST form to the task request queue with PRIORITY.")
    public static final SubLObject console_task_processor_request_alt(SubLObject request, SubLObject priority) {
        SubLTrampolineFile.checkType(priority, INTEGERP);
        {
            SubLObject task_info = com.cyc.cycjava.cycl.task_processor.make_task_info(UNPROVIDED);
            com.cyc.cycjava.cycl.task_processor.set_task_info_type($CONSOLE, task_info);
            $task_processor_console_id$.setGlobalValue(add($task_processor_console_id$.getGlobalValue(), ONE_INTEGER));
            com.cyc.cycjava.cycl.task_processor.set_task_info_id($task_processor_console_id$.getGlobalValue(), task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_priority(priority, task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_requestor(constants_high.constant_name(operation_communication.the_cyclist()), task_info);
            com.cyc.cycjava.cycl.task_processor.set_task_info_request(request, task_info);
            com.cyc.cycjava.cycl.task_processor.enqueue_task_request(task_info, $console_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    /**
     *
     *
     * @param REQUEST;
     * 		atom or listp for evaluation
     * @param PRIORITY;
     * 		intergerp
     * 		Submits the REQUEST form to the task request queue with PRIORITY.
     */
    @LispMethod(comment = "@param REQUEST;\r\n\t\tatom or listp for evaluation\r\n@param PRIORITY;\r\n\t\tintergerp\r\n\t\tSubmits the REQUEST form to the task request queue with PRIORITY.")
    public static SubLObject console_task_processor_request(final SubLObject request, final SubLObject priority) {
        assert NIL != integerp(priority) : "! integerp(priority) " + ("Types.integerp(priority) " + "CommonSymbols.NIL != Types.integerp(priority) ") + priority;
        final SubLObject task_info = task_processor.make_task_info(UNPROVIDED);
        task_processor.set_task_info_type($CONSOLE, task_info);
        task_processor.$task_processor_console_id$.setGlobalValue(add(task_processor.$task_processor_console_id$.getGlobalValue(), ONE_INTEGER));
        task_processor.set_task_info_id(task_processor.$task_processor_console_id$.getGlobalValue(), task_info);
        task_processor.set_task_info_priority(priority, task_info);
        task_processor.set_task_info_requestor(constants_high.constant_name(operation_communication.the_cyclist()), task_info);
        task_processor.set_task_info_request(request, task_info);
        task_processor.enqueue_task_request(task_info, task_processor.$console_task_process_pool$.getGlobalValue());
        return NIL;
    }

    /**
     *
     *
     * @param TASK-INFO;
     * 		task-info-p
     * 		Dispatches console api task-info item by sending the
     * 		response to *standard-output*.
     */
    @LispMethod(comment = "@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tDispatches console api task-info item by sending the\r\n\t\tresponse to *standard-output*.")
    public static final SubLObject dispatch_console_task_processor_response_alt(SubLObject task_info) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
                com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt283$dispatching_console_response__S__, task_info), $console_task_process_pool$.getGlobalValue());
            }
            com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt284$_A___A__, com.cyc.cycjava.cycl.task_processor.ti_task_processor_name(task_info), com.cyc.cycjava.cycl.task_processor.ti_response(task_info)), $console_task_process_pool$.getGlobalValue());
            if (NIL != com.cyc.cycjava.cycl.task_processor.ti_error_message(task_info)) {
                com.cyc.cycjava.cycl.task_processor.push_tpool_background_msg(format(NIL, $str_alt137$_S__, com.cyc.cycjava.cycl.task_processor.ti_error_message(task_info)), $console_task_process_pool$.getGlobalValue());
            }
            return NIL;
        }
    }

    /**
     *
     *
     * @param TASK-INFO;
     * 		task-info-p
     * 		Dispatches console api task-info item by sending the
     * 		response to *standard-output*.
     */
    @LispMethod(comment = "@param TASK-INFO;\r\n\t\ttask-info-p\r\n\t\tDispatches console api task-info item by sending the\r\n\t\tresponse to *standard-output*.")
    public static SubLObject dispatch_console_task_processor_response(final SubLObject task_info) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (task_processor.$task_processor_verbosity$.getDynamicValue(thread).numG(TWO_INTEGER)) {
            task_processor.push_tpool_background_msg(format(NIL, task_processor.$str312$dispatching_console_response__S__, task_info), task_processor.$console_task_process_pool$.getGlobalValue());
        }
        task_processor.push_tpool_background_msg(format(NIL, task_processor.$str313$_A___A__, task_processor.ti_task_processor_name(task_info), task_processor.ti_response(task_info)), task_processor.$console_task_process_pool$.getGlobalValue());
        if (NIL != task_processor.ti_error_message(task_info)) {
            task_processor.push_tpool_background_msg(format(NIL, task_processor.$str149$_S__, task_processor.ti_error_message(task_info)), task_processor.$console_task_process_pool$.getGlobalValue());
        }
        return NIL;
    }

    public static final SubLObject declare_task_processor_file_alt() {
        declareFunction("get_task_processor_verbosity", "GET-TASK-PROCESSOR-VERBOSITY", 0, 0, false);
        declareFunction("set_task_processor_verbosity", "SET-TASK-PROCESSOR-VERBOSITY", 1, 0, false);
        declareFunction("task_info_print_function_trampoline", "TASK-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_info_p", "TASK-INFO-P", 1, 0, false);
        new com.cyc.cycjava.cycl.task_processor.$task_info_p$UnaryFunction();
        declareFunction("ti_type", "TI-TYPE", 1, 0, false);
        declareFunction("ti_id", "TI-ID", 1, 0, false);
        declareFunction("ti_priority", "TI-PRIORITY", 1, 0, false);
        declareFunction("ti_requestor", "TI-REQUESTOR", 1, 0, false);
        declareFunction("ti_giveback_info", "TI-GIVEBACK-INFO", 1, 0, false);
        declareFunction("ti_bindings", "TI-BINDINGS", 1, 0, false);
        declareFunction("ti_request", "TI-REQUEST", 1, 0, false);
        declareFunction("ti_response", "TI-RESPONSE", 1, 0, false);
        declareFunction("ti_error_message", "TI-ERROR-MESSAGE", 1, 0, false);
        declareFunction("ti_task_processor_name", "TI-TASK-PROCESSOR-NAME", 1, 0, false);
        declareFunction("_csetf_ti_type", "_CSETF-TI-TYPE", 2, 0, false);
        declareFunction("_csetf_ti_id", "_CSETF-TI-ID", 2, 0, false);
        declareFunction("_csetf_ti_priority", "_CSETF-TI-PRIORITY", 2, 0, false);
        declareFunction("_csetf_ti_requestor", "_CSETF-TI-REQUESTOR", 2, 0, false);
        declareFunction("_csetf_ti_giveback_info", "_CSETF-TI-GIVEBACK-INFO", 2, 0, false);
        declareFunction("_csetf_ti_bindings", "_CSETF-TI-BINDINGS", 2, 0, false);
        declareFunction("_csetf_ti_request", "_CSETF-TI-REQUEST", 2, 0, false);
        declareFunction("_csetf_ti_response", "_CSETF-TI-RESPONSE", 2, 0, false);
        declareFunction("_csetf_ti_error_message", "_CSETF-TI-ERROR-MESSAGE", 2, 0, false);
        declareFunction("_csetf_ti_task_processor_name", "_CSETF-TI-TASK-PROCESSOR-NAME", 2, 0, false);
        declareFunction("make_task_info", "MAKE-TASK-INFO", 0, 1, false);
        declareFunction("get_task_info_type", "GET-TASK-INFO-TYPE", 1, 0, false);
        declareFunction("set_task_info_type", "SET-TASK-INFO-TYPE", 2, 0, false);
        declareFunction("get_task_info_id", "GET-TASK-INFO-ID", 1, 0, false);
        declareFunction("set_task_info_id", "SET-TASK-INFO-ID", 2, 0, false);
        declareFunction("get_task_info_priority", "GET-TASK-INFO-PRIORITY", 1, 0, false);
        declareFunction("set_task_info_priority", "SET-TASK-INFO-PRIORITY", 2, 0, false);
        declareFunction("get_task_info_requestor", "GET-TASK-INFO-REQUESTOR", 1, 0, false);
        declareFunction("set_task_info_requestor", "SET-TASK-INFO-REQUESTOR", 2, 0, false);
        declareFunction("get_task_info_giveback_info", "GET-TASK-INFO-GIVEBACK-INFO", 1, 0, false);
        declareFunction("set_task_info_giveback_info", "SET-TASK-INFO-GIVEBACK-INFO", 2, 0, false);
        declareFunction("get_task_info_bindings", "GET-TASK-INFO-BINDINGS", 1, 0, false);
        declareFunction("set_task_info_bindings", "SET-TASK-INFO-BINDINGS", 2, 0, false);
        declareFunction("get_task_info_request", "GET-TASK-INFO-REQUEST", 1, 0, false);
        declareFunction("set_task_info_request", "SET-TASK-INFO-REQUEST", 2, 0, false);
        declareFunction("get_task_info_response", "GET-TASK-INFO-RESPONSE", 1, 0, false);
        declareFunction("set_task_info_response", "SET-TASK-INFO-RESPONSE", 2, 0, false);
        declareFunction("get_task_info_error_message", "GET-TASK-INFO-ERROR-MESSAGE", 1, 0, false);
        declareFunction("set_task_info_error_message", "SET-TASK-INFO-ERROR-MESSAGE", 2, 0, false);
        declareFunction("get_task_info_task_processor_name", "GET-TASK-INFO-TASK-PROCESSOR-NAME", 1, 0, false);
        declareFunction("set_task_info_task_processor_name", "SET-TASK-INFO-TASK-PROCESSOR-NAME", 2, 0, false);
        declareFunction("print_task_info", "PRINT-TASK-INFO", 3, 0, false);
        declareFunction("task_result_set_print_function_trampoline", "TASK-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_result_set_p", "TASK-RESULT-SET-P", 1, 0, false);
        new com.cyc.cycjava.cycl.task_processor.$task_result_set_p$UnaryFunction();
        declareFunction("task_result_set_result", "TASK-RESULT-SET-RESULT", 1, 0, false);
        declareFunction("task_result_set_task_info", "TASK-RESULT-SET-TASK-INFO", 1, 0, false);
        declareFunction("task_result_set_finished", "TASK-RESULT-SET-FINISHED", 1, 0, false);
        declareFunction("_csetf_task_result_set_result", "_CSETF-TASK-RESULT-SET-RESULT", 2, 0, false);
        declareFunction("_csetf_task_result_set_task_info", "_CSETF-TASK-RESULT-SET-TASK-INFO", 2, 0, false);
        declareFunction("_csetf_task_result_set_finished", "_CSETF-TASK-RESULT-SET-FINISHED", 2, 0, false);
        declareFunction("make_task_result_set", "MAKE-TASK-RESULT-SET", 0, 1, false);
        declareFunction("new_task_result_set", "NEW-TASK-RESULT-SET", 3, 0, false);
        declareFunction("task_result_set_priority", "TASK-RESULT-SET-PRIORITY", 1, 0, false);
        declareFunction("task_processor_print_function_trampoline", "TASK-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_processor_p", "TASK-PROCESSOR-P", 1, 0, false);
        new com.cyc.cycjava.cycl.task_processor.$task_processor_p$UnaryFunction();
        declareFunction("tproc_name", "TPROC-NAME", 1, 0, false);
        declareFunction("tproc_process", "TPROC-PROCESS", 1, 0, false);
        declareFunction("tproc_busy_p", "TPROC-BUSY-P", 1, 0, false);
        declareFunction("tproc_task_info", "TPROC-TASK-INFO", 1, 0, false);
        declareFunction("_csetf_tproc_name", "_CSETF-TPROC-NAME", 2, 0, false);
        declareFunction("_csetf_tproc_process", "_CSETF-TPROC-PROCESS", 2, 0, false);
        declareFunction("_csetf_tproc_busy_p", "_CSETF-TPROC-BUSY-P", 2, 0, false);
        declareFunction("_csetf_tproc_task_info", "_CSETF-TPROC-TASK-INFO", 2, 0, false);
        declareFunction("make_task_processor", "MAKE-TASK-PROCESSOR", 0, 1, false);
        declareFunction("print_task_processor", "PRINT-TASK-PROCESSOR", 3, 0, false);
        declareFunction("task_process_pool_print_function_trampoline", "TASK-PROCESS-POOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_process_pool_p", "TASK-PROCESS-POOL-P", 1, 0, false);
        new com.cyc.cycjava.cycl.task_processor.$task_process_pool_p$UnaryFunction();
        declareFunction("tpool_lock", "TPOOL-LOCK", 1, 0, false);
        declareFunction("tpool_request_queue", "TPOOL-REQUEST-QUEUE", 1, 0, false);
        declareFunction("tpool_request_semaphore", "TPOOL-REQUEST-SEMAPHORE", 1, 0, false);
        declareFunction("tpool_processors", "TPOOL-PROCESSORS", 1, 0, false);
        declareFunction("tpool_background_msgs", "TPOOL-BACKGROUND-MSGS", 1, 0, false);
        declareFunction("tpool_process_name_prefix", "TPOOL-PROCESS-NAME-PREFIX", 1, 0, false);
        declareFunction("tpool_min_nbr_of_task_processors", "TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction("tpool_max_nbr_of_task_processors", "TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction("_csetf_tpool_lock", "_CSETF-TPOOL-LOCK", 2, 0, false);
        declareFunction("_csetf_tpool_request_queue", "_CSETF-TPOOL-REQUEST-QUEUE", 2, 0, false);
        declareFunction("_csetf_tpool_request_semaphore", "_CSETF-TPOOL-REQUEST-SEMAPHORE", 2, 0, false);
        declareFunction("_csetf_tpool_processors", "_CSETF-TPOOL-PROCESSORS", 2, 0, false);
        declareFunction("_csetf_tpool_background_msgs", "_CSETF-TPOOL-BACKGROUND-MSGS", 2, 0, false);
        declareFunction("_csetf_tpool_process_name_prefix", "_CSETF-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false);
        declareFunction("_csetf_tpool_min_nbr_of_task_processors", "_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction("_csetf_tpool_max_nbr_of_task_processors", "_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction("make_task_process_pool", "MAKE-TASK-PROCESS-POOL", 0, 1, false);
        declareFunction("print_task_process_pool", "PRINT-TASK-PROCESS-POOL", 3, 0, false);
        declareFunction("display_task_processors", "DISPLAY-TASK-PROCESSORS", 1, 1, false);
        declareFunction("display_active_task_processes", "DISPLAY-ACTIVE-TASK-PROCESSES", 0, 1, false);
        declareFunction("task_processors_initialized_p", "TASK-PROCESSORS-INITIALIZED-P", 1, 0, false);
        declareFunction("get_tpool_lock", "GET-TPOOL-LOCK", 1, 0, false);
        declareFunction("set_tpool_lock", "SET-TPOOL-LOCK", 2, 0, false);
        declareFunction("get_tpool_request_queue", "GET-TPOOL-REQUEST-QUEUE", 1, 0, false);
        declareFunction("set_tpool_request_queue", "SET-TPOOL-REQUEST-QUEUE", 2, 0, false);
        declareFunction("get_tpool_processors", "GET-TPOOL-PROCESSORS", 1, 0, false);
        declareFunction("get_tpool_processors_nbr", "GET-TPOOL-PROCESSORS-NBR", 1, 0, false);
        declareFunction("push_tpool_processor", "PUSH-TPOOL-PROCESSOR", 2, 0, false);
        declareFunction("set_tpool_processors", "SET-TPOOL-PROCESSORS", 2, 0, false);
        declareFunction("set_tpool_background_msg_path", "SET-TPOOL-BACKGROUND-MSG-PATH", 1, 0, false);
        declareFunction("push_tpool_background_msg", "PUSH-TPOOL-BACKGROUND-MSG", 2, 0, false);
        declareFunction("show_tp_msgs", "SHOW-TP-MSGS", 1, 0, false);
        declareFunction("show_tp_msgs_with_process_name", "SHOW-TP-MSGS-WITH-PROCESS-NAME", 1, 0, false);
        declareFunction("set_tpool_process_name_prefix", "SET-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false);
        declareFunction("get_tpool_process_name_prefix", "GET-TPOOL-PROCESS-NAME-PREFIX", 1, 0, false);
        declareFunction("set_tpool_min_nbr_of_task_processors", "SET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction("get_tpool_min_nbr_of_task_processors", "GET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction("set_tpool_max_nbr_of_task_processors", "SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction("get_tpool_max_nbr_of_task_processors", "GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction("get_nbr_of_task_processors", "GET-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction("eval_with_bindings", "EVAL-WITH-BINDINGS", 3, 0, false);
        declareFunction("get_task_process_pool_for_process", "GET-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false);
        declareFunction("add_task_process_pool_for_process", "ADD-TASK-PROCESS-POOL-FOR-PROCESS", 2, 0, false);
        declareFunction("remove_task_process_pool_for_process", "REMOVE-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false);
        declareFunction("ensure_task_process_being_worked_on_initialized", "ENSURE-TASK-PROCESS-BEING-WORKED-ON-INITIALIZED", 0, 0, false);
        declareFunction("compute_task_process_description_from_task_info", "COMPUTE-TASK-PROCESS-DESCRIPTION-FROM-TASK-INFO", 1, 0, false);
        declareFunction("compute_task_process_description", "COMPUTE-TASK-PROCESS-DESCRIPTION", 2, 0, false);
        declareFunction("get_giveback_info_from_task_process_description", "GET-GIVEBACK-INFO-FROM-TASK-PROCESS-DESCRIPTION", 1, 0, false);
        declareFunction("note_active_task_process_description_if_permitted", "NOTE-ACTIVE-TASK-PROCESS-DESCRIPTION-IF-PERMITTED", 1, 0, false);
        declareFunction("note_inactive_task_process_description", "NOTE-INACTIVE-TASK-PROCESS-DESCRIPTION", 1, 0, false);
        declareFunction("task_process_termination_reason_p", "TASK-PROCESS-TERMINATION-REASON-P", 1, 0, false);
        declareFunction("terminate_active_task_process", "TERMINATE-ACTIVE-TASK-PROCESS", 3, 0, false);
        declareFunction("terminate_active_task_processes", "TERMINATE-ACTIVE-TASK-PROCESSES", 1, 0, false);
        declareFunction("signal_terminate_active_task_process", "SIGNAL-TERMINATE-ACTIVE-TASK-PROCESS", 4, 0, false);
        declareFunction("signal_abort_active_task_process", "SIGNAL-ABORT-ACTIVE-TASK-PROCESS", 2, 0, false);
        declareFunction("signal_cancel_active_task_process", "SIGNAL-CANCEL-ACTIVE-TASK-PROCESS", 2, 0, false);
        declareMacro("catch_task_processor_termination", "CATCH-TASK-PROCESSOR-TERMINATION");
        declareMacro("catch_task_processor_termination_quietly", "CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY");
        declareFunction("get_current_task_processor_info", "GET-CURRENT-TASK-PROCESSOR-INFO", 0, 0, false);
        declareFunction("get_current_task_processor_client", "GET-CURRENT-TASK-PROCESSOR-CLIENT", 0, 0, false);
        declareFunction("map_task_info_priority_to_process_priority", "MAP-TASK-INFO-PRIORITY-TO-PROCESS-PRIORITY", 1, 0, false);
        declareFunction("task_processor_handler", "TASK-PROCESSOR-HANDLER", 0, 0, false);
        declareFunction("post_task_info_processor_partial_results", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS", 1, 0, false);
        declareFunction("post_task_info_processor_partial_results_internal", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS-INTERNAL", 2, 0, false);
        declareFunction("initialize_task_processors", "INITIALIZE-TASK-PROCESSORS", 0, 3, false);
        declareFunction("add_new_task_processor_to_pool", "ADD-NEW-TASK-PROCESSOR-TO-POOL", 1, 0, false);
        declareFunction("halt_task_processors", "HALT-TASK-PROCESSORS", 1, 0, false);
        declareFunction("halt_task_processor", "HALT-TASK-PROCESSOR", 1, 0, false);
        declareFunction("halt_task_processor_via_interrupt", "HALT-TASK-PROCESSOR-VIA-INTERRUPT", 1, 0, false);
        declareFunction("ensure_task_processors_killed", "ENSURE-TASK-PROCESSORS-KILLED", 1, 0, false);
        declareFunction("task_processor_quit", "TASK-PROCESSOR-QUIT", 0, 0, false);
        declareFunction("find_task_processor", "FIND-TASK-PROCESSOR", 2, 0, false);
        declareFunction("find_task_process_pool", "FIND-TASK-PROCESS-POOL", 1, 0, false);
        declareFunction("awaken_first_available_task_processors", "AWAKEN-FIRST-AVAILABLE-TASK-PROCESSORS", 1, 0, false);
        declareFunction("enqueue_task_request", "ENQUEUE-TASK-REQUEST", 2, 0, false);
        declareMacro("declare_task_process_pool", "DECLARE-TASK-PROCESS-POOL");
        declareMacro("declare_task_process_request", "DECLARE-TASK-PROCESS-REQUEST");
        declareMacro("declare_task_process_response_dispatch", "DECLARE-TASK-PROCESS-RESPONSE-DISPATCH");
        declareFunction("api_task_processors_initialized_p", "API-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
        declareFunction("initialize_api_task_processors", "INITIALIZE-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction("halt_api_task_processors", "HALT-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction("show_api_tp_msgs", "SHOW-API-TP-MSGS", 0, 0, false);
        declareFunction("show_api_task_processors", "SHOW-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction("display_api_task_processors", "DISPLAY-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction("api_task_processor_request", "API-TASK-PROCESSOR-REQUEST", 6, 0, false);
        declareFunction("set_java_api_lease_activity_display", "SET-JAVA-API-LEASE-ACTIVITY-DISPLAY", 1, 0, false);
        declareFunction("java_api_lease_activity_display", "JAVA-API-LEASE-ACTIVITY-DISPLAY", 0, 0, false);
        declareFunction("dispatch_task_processor_response", "DISPATCH-TASK-PROCESSOR-RESPONSE", 1, 1, false);
        declareFunction("dispatch_api_task_processor_response", "DISPATCH-API-TASK-PROCESSOR-RESPONSE", 1, 1, false);
        declareFunction("new_intermediate_results_accumulator", "NEW-INTERMEDIATE-RESULTS-ACCUMULATOR", 1, 0, false);
        declareFunction("intermediate_results_accumulator_add", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction("intermediate_results_accumulator_add_all", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD-ALL", 2, 0, false);
        declareFunction("intermediate_results_accumulator_reset", "INTERMEDIATE-RESULTS-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction("intermediate_results_accumulator_size", "INTERMEDIATE-RESULTS-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction("intermediate_results_accumulator_contents", "INTERMEDIATE-RESULTS-ACCUMULATOR-CONTENTS", 1, 1, false);
        declareFunction("intermediate_results_accumulator_iterator", "INTERMEDIATE-RESULTS-ACCUMULATOR-ITERATOR", 1, 0, false);
        declareFunction("bg_task_processors_initialized_p", "BG-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
        declareFunction("initialize_bg_task_processors", "INITIALIZE-BG-TASK-PROCESSORS", 0, 0, false);
        declareFunction("halt_bg_task_processors", "HALT-BG-TASK-PROCESSORS", 0, 0, false);
        declareFunction("show_bg_tp_msgs", "SHOW-BG-TP-MSGS", 0, 0, false);
        declareFunction("bg_task_processor_request", "BG-TASK-PROCESSOR-REQUEST", 6, 0, false);
        declareFunction("dispatch_bg_task_processor_response", "DISPATCH-BG-TASK-PROCESSOR-RESPONSE", 1, 0, false);
        declareFunction("bg_api_eval", "BG-API-EVAL", 1, 0, false);
        declareFunction("console_task_processors_initialized_p", "CONSOLE-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
        declareFunction("initialize_console_task_processors", "INITIALIZE-CONSOLE-TASK-PROCESSORS", 0, 0, false);
        declareFunction("halt_console_task_processors", "HALT-CONSOLE-TASK-PROCESSORS", 0, 0, false);
        declareFunction("show_console_tp_msgs", "SHOW-CONSOLE-TP-MSGS", 0, 0, false);
        declareFunction("console_task_processor_request", "CONSOLE-TASK-PROCESSOR-REQUEST", 2, 0, false);
        declareFunction("dispatch_console_task_processor_response", "DISPATCH-CONSOLE-TASK-PROCESSOR-RESPONSE", 1, 0, false);
        declareFunction("get_verbosity_test_case_p_queue", "GET-VERBOSITY-TEST-CASE-P-QUEUE", 1, 0, false);
        declareFunction("set_verbosity_test_case_p_queue", "SET-VERBOSITY-TEST-CASE-P-QUEUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_verbosity_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-VERBOSITY-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_verbosity_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-VERBOSITY-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("verbosity_test_case_p", "VERBOSITY-TEST-CASE-P", 1, 0, false);
        declareFunction("get_eval_with_bindings_test_case_p_queue", "GET-EVAL-WITH-BINDINGS-TEST-CASE-P-QUEUE", 1, 0, false);
        declareFunction("set_eval_with_bindings_test_case_p_queue", "SET-EVAL-WITH-BINDINGS-TEST-CASE-P-QUEUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_eval_with_bindings_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-EVAL-WITH-BINDINGS-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_eval_with_bindings_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-EVAL-WITH-BINDINGS-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("eval_with_bindings_test_case_p", "EVAL-WITH-BINDINGS-TEST-CASE-P", 1, 0, false);
        declareFunction("get_task_info_test_case_p_queue", "GET-TASK-INFO-TEST-CASE-P-QUEUE", 1, 0, false);
        declareFunction("set_task_info_test_case_p_queue", "SET-TASK-INFO-TEST-CASE-P-QUEUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_task_info_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-TASK-INFO-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_task_info_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-TASK-INFO-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("task_info_test_case_p", "TASK-INFO-TEST-CASE-P", 1, 0, false);
        declareFunction("get_task_processor_test_case_p_queue", "GET-TASK-PROCESSOR-TEST-CASE-P-QUEUE", 1, 0, false);
        declareFunction("set_task_processor_test_case_p_queue", "SET-TASK-PROCESSOR-TEST-CASE-P-QUEUE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_task_processor_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-TASK-PROCESSOR-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_task_processor_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-TASK-PROCESSOR-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("task_processor_test_case_p", "TASK-PROCESSOR-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_task_processor_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("get_task_processor_verbosity", "GET-TASK-PROCESSOR-VERBOSITY", 0, 0, false);
            declareFunction("set_task_processor_verbosity", "SET-TASK-PROCESSOR-VERBOSITY", 1, 0, false);
            declareFunction("task_info_print_function_trampoline", "TASK-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("task_info_p", "TASK-INFO-P", 1, 0, false);
            new task_processor.$task_info_p$UnaryFunction();
            declareFunction("ti_type", "TI-TYPE", 1, 0, false);
            declareFunction("ti_id", "TI-ID", 1, 0, false);
            declareFunction("ti_priority", "TI-PRIORITY", 1, 0, false);
            declareFunction("ti_requestor", "TI-REQUESTOR", 1, 0, false);
            declareFunction("ti_giveback_info", "TI-GIVEBACK-INFO", 1, 0, false);
            declareFunction("ti_bindings", "TI-BINDINGS", 1, 0, false);
            declareFunction("ti_request", "TI-REQUEST", 1, 0, false);
            declareFunction("ti_response", "TI-RESPONSE", 1, 0, false);
            declareFunction("ti_error_message", "TI-ERROR-MESSAGE", 1, 0, false);
            declareFunction("ti_task_processor_name", "TI-TASK-PROCESSOR-NAME", 1, 0, false);
            declareFunction("_csetf_ti_type", "_CSETF-TI-TYPE", 2, 0, false);
            declareFunction("_csetf_ti_id", "_CSETF-TI-ID", 2, 0, false);
            declareFunction("_csetf_ti_priority", "_CSETF-TI-PRIORITY", 2, 0, false);
            declareFunction("_csetf_ti_requestor", "_CSETF-TI-REQUESTOR", 2, 0, false);
            declareFunction("_csetf_ti_giveback_info", "_CSETF-TI-GIVEBACK-INFO", 2, 0, false);
            declareFunction("_csetf_ti_bindings", "_CSETF-TI-BINDINGS", 2, 0, false);
            declareFunction("_csetf_ti_request", "_CSETF-TI-REQUEST", 2, 0, false);
            declareFunction("_csetf_ti_response", "_CSETF-TI-RESPONSE", 2, 0, false);
            declareFunction("_csetf_ti_error_message", "_CSETF-TI-ERROR-MESSAGE", 2, 0, false);
            declareFunction("_csetf_ti_task_processor_name", "_CSETF-TI-TASK-PROCESSOR-NAME", 2, 0, false);
            declareFunction("make_task_info", "MAKE-TASK-INFO", 0, 1, false);
            declareFunction("visit_defstruct_task_info", "VISIT-DEFSTRUCT-TASK-INFO", 2, 0, false);
            declareFunction("visit_defstruct_object_task_info_method", "VISIT-DEFSTRUCT-OBJECT-TASK-INFO-METHOD", 2, 0, false);
            declareFunction("get_task_info_type", "GET-TASK-INFO-TYPE", 1, 0, false);
            declareFunction("set_task_info_type", "SET-TASK-INFO-TYPE", 2, 0, false);
            declareFunction("get_task_info_id", "GET-TASK-INFO-ID", 1, 0, false);
            declareFunction("set_task_info_id", "SET-TASK-INFO-ID", 2, 0, false);
            declareFunction("get_task_info_priority", "GET-TASK-INFO-PRIORITY", 1, 0, false);
            declareFunction("set_task_info_priority", "SET-TASK-INFO-PRIORITY", 2, 0, false);
            declareFunction("get_task_info_requestor", "GET-TASK-INFO-REQUESTOR", 1, 0, false);
            declareFunction("set_task_info_requestor", "SET-TASK-INFO-REQUESTOR", 2, 0, false);
            declareFunction("get_task_info_giveback_info", "GET-TASK-INFO-GIVEBACK-INFO", 1, 0, false);
            declareFunction("set_task_info_giveback_info", "SET-TASK-INFO-GIVEBACK-INFO", 2, 0, false);
            declareFunction("get_task_info_bindings", "GET-TASK-INFO-BINDINGS", 1, 0, false);
            declareFunction("set_task_info_bindings", "SET-TASK-INFO-BINDINGS", 2, 0, false);
            declareFunction("get_task_info_request", "GET-TASK-INFO-REQUEST", 1, 0, false);
            declareFunction("set_task_info_request", "SET-TASK-INFO-REQUEST", 2, 0, false);
            declareFunction("get_task_info_response", "GET-TASK-INFO-RESPONSE", 1, 0, false);
            declareFunction("set_task_info_response", "SET-TASK-INFO-RESPONSE", 2, 0, false);
            declareFunction("get_task_info_error_message", "GET-TASK-INFO-ERROR-MESSAGE", 1, 0, false);
            declareFunction("set_task_info_error_message", "SET-TASK-INFO-ERROR-MESSAGE", 2, 0, false);
            declareFunction("get_task_info_task_processor_name", "GET-TASK-INFO-TASK-PROCESSOR-NAME", 1, 0, false);
            declareFunction("set_task_info_task_processor_name", "SET-TASK-INFO-TASK-PROCESSOR-NAME", 2, 0, false);
            declareFunction("print_task_info", "PRINT-TASK-INFO", 3, 0, false);
            declareFunction("task_result_set_print_function_trampoline", "TASK-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("task_result_set_p", "TASK-RESULT-SET-P", 1, 0, false);
            new task_processor.$task_result_set_p$UnaryFunction();
            declareFunction("task_result_set_result", "TASK-RESULT-SET-RESULT", 1, 0, false);
            declareFunction("task_result_set_task_info", "TASK-RESULT-SET-TASK-INFO", 1, 0, false);
            declareFunction("task_result_set_finished", "TASK-RESULT-SET-FINISHED", 1, 0, false);
            declareFunction("_csetf_task_result_set_result", "_CSETF-TASK-RESULT-SET-RESULT", 2, 0, false);
            declareFunction("_csetf_task_result_set_task_info", "_CSETF-TASK-RESULT-SET-TASK-INFO", 2, 0, false);
            declareFunction("_csetf_task_result_set_finished", "_CSETF-TASK-RESULT-SET-FINISHED", 2, 0, false);
            declareFunction("make_task_result_set", "MAKE-TASK-RESULT-SET", 0, 1, false);
            declareFunction("visit_defstruct_task_result_set", "VISIT-DEFSTRUCT-TASK-RESULT-SET", 2, 0, false);
            declareFunction("visit_defstruct_object_task_result_set_method", "VISIT-DEFSTRUCT-OBJECT-TASK-RESULT-SET-METHOD", 2, 0, false);
            declareFunction("new_task_result_set", "NEW-TASK-RESULT-SET", 3, 0, false);
            declareFunction("task_result_set_priority", "TASK-RESULT-SET-PRIORITY", 1, 0, false);
            declareFunction("task_processor_print_function_trampoline", "TASK-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("task_processor_p", "TASK-PROCESSOR-P", 1, 0, false);
            new task_processor.$task_processor_p$UnaryFunction();
            declareFunction("tproc_name", "TPROC-NAME", 1, 0, false);
            declareFunction("tproc_process", "TPROC-PROCESS", 1, 0, false);
            declareFunction("tproc_busy_p", "TPROC-BUSY-P", 1, 0, false);
            declareFunction("tproc_task_info", "TPROC-TASK-INFO", 1, 0, false);
            declareFunction("_csetf_tproc_name", "_CSETF-TPROC-NAME", 2, 0, false);
            declareFunction("_csetf_tproc_process", "_CSETF-TPROC-PROCESS", 2, 0, false);
            declareFunction("_csetf_tproc_busy_p", "_CSETF-TPROC-BUSY-P", 2, 0, false);
            declareFunction("_csetf_tproc_task_info", "_CSETF-TPROC-TASK-INFO", 2, 0, false);
            declareFunction("make_task_processor", "MAKE-TASK-PROCESSOR", 0, 1, false);
            declareFunction("visit_defstruct_task_processor", "VISIT-DEFSTRUCT-TASK-PROCESSOR", 2, 0, false);
            declareFunction("visit_defstruct_object_task_processor_method", "VISIT-DEFSTRUCT-OBJECT-TASK-PROCESSOR-METHOD", 2, 0, false);
            declareFunction("print_task_processor", "PRINT-TASK-PROCESSOR", 3, 0, false);
            declareFunction("task_process_pool_print_function_trampoline", "TASK-PROCESS-POOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("task_process_pool_p", "TASK-PROCESS-POOL-P", 1, 0, false);
            new task_processor.$task_process_pool_p$UnaryFunction();
            declareFunction("tpool_lock", "TPOOL-LOCK", 1, 0, false);
            declareFunction("tpool_request_queue", "TPOOL-REQUEST-QUEUE", 1, 0, false);
            declareFunction("tpool_request_semaphore", "TPOOL-REQUEST-SEMAPHORE", 1, 0, false);
            declareFunction("tpool_processors", "TPOOL-PROCESSORS", 1, 0, false);
            declareFunction("tpool_background_msgs", "TPOOL-BACKGROUND-MSGS", 1, 0, false);
            declareFunction("tpool_process_name_prefix", "TPOOL-PROCESS-NAME-PREFIX", 1, 0, false);
            declareFunction("tpool_min_nbr_of_task_processors", "TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false);
            declareFunction("tpool_max_nbr_of_task_processors", "TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false);
            declareFunction("_csetf_tpool_lock", "_CSETF-TPOOL-LOCK", 2, 0, false);
            declareFunction("_csetf_tpool_request_queue", "_CSETF-TPOOL-REQUEST-QUEUE", 2, 0, false);
            declareFunction("_csetf_tpool_request_semaphore", "_CSETF-TPOOL-REQUEST-SEMAPHORE", 2, 0, false);
            declareFunction("_csetf_tpool_processors", "_CSETF-TPOOL-PROCESSORS", 2, 0, false);
            declareFunction("_csetf_tpool_background_msgs", "_CSETF-TPOOL-BACKGROUND-MSGS", 2, 0, false);
            declareFunction("_csetf_tpool_process_name_prefix", "_CSETF-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false);
            declareFunction("_csetf_tpool_min_nbr_of_task_processors", "_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false);
            declareFunction("_csetf_tpool_max_nbr_of_task_processors", "_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false);
            declareFunction("make_task_process_pool", "MAKE-TASK-PROCESS-POOL", 0, 1, false);
            declareFunction("visit_defstruct_task_process_pool", "VISIT-DEFSTRUCT-TASK-PROCESS-POOL", 2, 0, false);
            declareFunction("visit_defstruct_object_task_process_pool_method", "VISIT-DEFSTRUCT-OBJECT-TASK-PROCESS-POOL-METHOD", 2, 0, false);
            declareFunction("print_task_process_pool", "PRINT-TASK-PROCESS-POOL", 3, 0, false);
            declareFunction("display_task_processors", "DISPLAY-TASK-PROCESSORS", 1, 1, false);
            declareFunction("display_active_task_processes", "DISPLAY-ACTIVE-TASK-PROCESSES", 0, 1, false);
            declareFunction("task_processors_initialized_p", "TASK-PROCESSORS-INITIALIZED-P", 1, 0, false);
            declareFunction("get_tpool_lock", "GET-TPOOL-LOCK", 1, 0, false);
            declareFunction("set_tpool_lock", "SET-TPOOL-LOCK", 2, 0, false);
            declareFunction("get_tpool_request_queue", "GET-TPOOL-REQUEST-QUEUE", 1, 0, false);
            declareFunction("set_tpool_request_queue", "SET-TPOOL-REQUEST-QUEUE", 2, 0, false);
            declareFunction("get_tpool_processors", "GET-TPOOL-PROCESSORS", 1, 0, false);
            declareFunction("get_tpool_processors_nbr", "GET-TPOOL-PROCESSORS-NBR", 1, 0, false);
            declareFunction("push_tpool_processor", "PUSH-TPOOL-PROCESSOR", 2, 0, false);
            declareFunction("set_tpool_processors", "SET-TPOOL-PROCESSORS", 2, 0, false);
            declareFunction("set_tpool_background_msg_path", "SET-TPOOL-BACKGROUND-MSG-PATH", 1, 0, false);
            declareFunction("push_tpool_background_msg", "PUSH-TPOOL-BACKGROUND-MSG", 2, 0, false);
            declareFunction("flush_tpool_background_msgs", "FLUSH-TPOOL-BACKGROUND-MSGS", 0, 0, false);
            declareFunction("show_tp_msgs", "SHOW-TP-MSGS", 1, 0, false);
            declareFunction("show_tp_msgs_with_process_name", "SHOW-TP-MSGS-WITH-PROCESS-NAME", 1, 0, false);
            declareFunction("set_tpool_process_name_prefix", "SET-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false);
            declareFunction("get_tpool_process_name_prefix", "GET-TPOOL-PROCESS-NAME-PREFIX", 1, 0, false);
            declareFunction("set_tpool_min_nbr_of_task_processors", "SET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false);
            declareFunction("get_tpool_min_nbr_of_task_processors", "GET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false);
            declareFunction("set_tpool_max_nbr_of_task_processors", "SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false);
            declareFunction("get_tpool_max_nbr_of_task_processors", "GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false);
            declareFunction("get_nbr_of_task_processors", "GET-NBR-OF-TASK-PROCESSORS", 1, 0, false);
            declareFunction("start_task_processor_logging_to_file", "START-TASK-PROCESSOR-LOGGING-TO-FILE", 1, 1, false);
            declareFunction("end_task_processor_logging_to_file", "END-TASK-PROCESSOR-LOGGING-TO-FILE", 0, 0, false);
            declareFunction("save_unlogged_task_processor_messages_to_file", "SAVE-UNLOGGED-TASK-PROCESSOR-MESSAGES-TO-FILE", 1, 0, false);
            declareFunction("eval_with_bindings", "EVAL-WITH-BINDINGS", 3, 0, false);
            declareFunction("get_task_process_pool_for_process", "GET-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false);
            declareFunction("add_task_process_pool_for_process", "ADD-TASK-PROCESS-POOL-FOR-PROCESS", 2, 0, false);
            declareFunction("remove_task_process_pool_for_process", "REMOVE-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false);
            declareFunction("ensure_task_process_being_worked_on_initialized", "ENSURE-TASK-PROCESS-BEING-WORKED-ON-INITIALIZED", 0, 0, false);
            declareFunction("compute_task_process_description_from_task_info", "COMPUTE-TASK-PROCESS-DESCRIPTION-FROM-TASK-INFO", 1, 0, false);
            declareFunction("compute_task_process_description", "COMPUTE-TASK-PROCESS-DESCRIPTION", 2, 0, false);
            declareFunction("get_giveback_info_from_task_process_description", "GET-GIVEBACK-INFO-FROM-TASK-PROCESS-DESCRIPTION", 1, 0, false);
            declareFunction("note_active_task_process_description_if_permitted", "NOTE-ACTIVE-TASK-PROCESS-DESCRIPTION-IF-PERMITTED", 1, 0, false);
            declareFunction("note_inactive_task_process_description", "NOTE-INACTIVE-TASK-PROCESS-DESCRIPTION", 1, 0, false);
            declareFunction("task_process_termination_reason_p", "TASK-PROCESS-TERMINATION-REASON-P", 1, 0, false);
            declareFunction("terminate_active_task_process", "TERMINATE-ACTIVE-TASK-PROCESS", 3, 0, false);
            declareFunction("terminate_active_task_processes", "TERMINATE-ACTIVE-TASK-PROCESSES", 1, 0, false);
            declareFunction("signal_terminate_active_task_process", "SIGNAL-TERMINATE-ACTIVE-TASK-PROCESS", 4, 0, false);
            declareFunction("signal_abort_active_task_process", "SIGNAL-ABORT-ACTIVE-TASK-PROCESS", 2, 0, false);
            declareFunction("signal_cancel_active_task_process", "SIGNAL-CANCEL-ACTIVE-TASK-PROCESS", 2, 0, false);
            declareMacro("catch_task_processor_termination", "CATCH-TASK-PROCESSOR-TERMINATION");
            declareMacro("catch_task_processor_termination_quietly", "CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY");
            declareFunction("get_current_task_processor_info", "GET-CURRENT-TASK-PROCESSOR-INFO", 0, 0, false);
            declareFunction("get_current_task_processor_client", "GET-CURRENT-TASK-PROCESSOR-CLIENT", 0, 0, false);
            declareFunction("map_task_info_priority_to_process_priority", "MAP-TASK-INFO-PRIORITY-TO-PROCESS-PRIORITY", 1, 0, false);
            declareFunction("task_processor_handler", "TASK-PROCESSOR-HANDLER", 0, 0, false);
            declareFunction("post_task_info_processor_partial_results", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS", 1, 0, false);
            declareFunction("post_task_info_processor_partial_results_internal", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS-INTERNAL", 2, 0, false);
            declareFunction("initialize_task_processors", "INITIALIZE-TASK-PROCESSORS", 0, 3, false);
            declareFunction("add_new_task_processor_to_pool", "ADD-NEW-TASK-PROCESSOR-TO-POOL", 1, 0, false);
            declareFunction("halt_task_processors", "HALT-TASK-PROCESSORS", 1, 0, false);
            declareFunction("halt_task_processor", "HALT-TASK-PROCESSOR", 1, 0, false);
            declareFunction("halt_task_processor_via_interrupt", "HALT-TASK-PROCESSOR-VIA-INTERRUPT", 1, 0, false);
            declareFunction("ensure_task_processors_killed", "ENSURE-TASK-PROCESSORS-KILLED", 1, 0, false);
            declareFunction("task_processor_quit", "TASK-PROCESSOR-QUIT", 0, 0, false);
            declareFunction("find_task_processor", "FIND-TASK-PROCESSOR", 2, 0, false);
            declareFunction("find_task_process_pool", "FIND-TASK-PROCESS-POOL", 1, 0, false);
            declareFunction("awaken_first_available_task_processors", "AWAKEN-FIRST-AVAILABLE-TASK-PROCESSORS", 1, 0, false);
            declareFunction("enqueue_task_request", "ENQUEUE-TASK-REQUEST", 2, 0, false);
            declareMacro("with_long_running_task_process", "WITH-LONG-RUNNING-TASK-PROCESS");
            declareMacro("declare_task_process_pool", "DECLARE-TASK-PROCESS-POOL");
            declareMacro("declare_task_process_request", "DECLARE-TASK-PROCESS-REQUEST");
            declareMacro("declare_task_process_response_dispatch", "DECLARE-TASK-PROCESS-RESPONSE-DISPATCH");
            declareFunction("api_task_processors_initialized_p", "API-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
            declareFunction("initialize_api_task_processors", "INITIALIZE-API-TASK-PROCESSORS", 0, 0, false);
            declareFunction("halt_api_task_processors", "HALT-API-TASK-PROCESSORS", 0, 0, false);
            declareFunction("restart_api_task_processors", "RESTART-API-TASK-PROCESSORS", 0, 0, false);
            declareFunction("show_api_tp_msgs", "SHOW-API-TP-MSGS", 0, 0, false);
            declareFunction("show_api_task_processors", "SHOW-API-TASK-PROCESSORS", 0, 0, false);
            declareFunction("display_api_task_processors", "DISPLAY-API-TASK-PROCESSORS", 0, 0, false);
            declareFunction("api_task_processor_request", "API-TASK-PROCESSOR-REQUEST", 6, 0, false);
            declareFunction("set_java_api_lease_activity_display", "SET-JAVA-API-LEASE-ACTIVITY-DISPLAY", 1, 0, false);
            declareFunction("java_api_lease_activity_display", "JAVA-API-LEASE-ACTIVITY-DISPLAY", 0, 0, false);
            declareFunction("dispatch_task_processor_response", "DISPATCH-TASK-PROCESSOR-RESPONSE", 1, 1, false);
            declareFunction("dispatch_api_task_processor_response", "DISPATCH-API-TASK-PROCESSOR-RESPONSE", 1, 1, false);
            declareFunction("new_intermediate_results_accumulator", "NEW-INTERMEDIATE-RESULTS-ACCUMULATOR", 1, 0, false);
            declareFunction("intermediate_results_accumulator_add", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD", 2, 0, false);
            declareFunction("intermediate_results_accumulator_add_all", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD-ALL", 2, 0, false);
            declareFunction("intermediate_results_accumulator_reset", "INTERMEDIATE-RESULTS-ACCUMULATOR-RESET", 1, 0, false);
            declareFunction("intermediate_results_accumulator_size", "INTERMEDIATE-RESULTS-ACCUMULATOR-SIZE", 1, 0, false);
            declareFunction("intermediate_results_accumulator_contents", "INTERMEDIATE-RESULTS-ACCUMULATOR-CONTENTS", 1, 1, false);
            declareFunction("intermediate_results_accumulator_iterator", "INTERMEDIATE-RESULTS-ACCUMULATOR-ITERATOR", 1, 0, false);
            declareFunction("bg_task_processors_initialized_p", "BG-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
            declareFunction("initialize_bg_task_processors", "INITIALIZE-BG-TASK-PROCESSORS", 0, 0, false);
            declareFunction("halt_bg_task_processors", "HALT-BG-TASK-PROCESSORS", 0, 0, false);
            declareFunction("restart_bg_task_processors", "RESTART-BG-TASK-PROCESSORS", 0, 0, false);
            declareFunction("show_bg_tp_msgs", "SHOW-BG-TP-MSGS", 0, 0, false);
            declareFunction("bg_task_processor_request", "BG-TASK-PROCESSOR-REQUEST", 6, 0, false);
            declareFunction("dispatch_bg_task_processor_response", "DISPATCH-BG-TASK-PROCESSOR-RESPONSE", 1, 0, false);
            declareFunction("bg_api_eval", "BG-API-EVAL", 1, 0, false);
            declareFunction("console_task_processors_initialized_p", "CONSOLE-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
            declareFunction("initialize_console_task_processors", "INITIALIZE-CONSOLE-TASK-PROCESSORS", 0, 0, false);
            declareFunction("halt_console_task_processors", "HALT-CONSOLE-TASK-PROCESSORS", 0, 0, false);
            declareFunction("restart_console_task_processors", "RESTART-CONSOLE-TASK-PROCESSORS", 0, 0, false);
            declareFunction("show_console_tp_msgs", "SHOW-CONSOLE-TP-MSGS", 0, 0, false);
            declareFunction("console_task_processor_request", "CONSOLE-TASK-PROCESSOR-REQUEST", 2, 0, false);
            declareFunction("dispatch_console_task_processor_response", "DISPATCH-CONSOLE-TASK-PROCESSOR-RESPONSE", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_verbosity_test_case_p_queue", "GET-VERBOSITY-TEST-CASE-P-QUEUE", 1, 0, false);
            declareFunction("set_verbosity_test_case_p_queue", "SET-VERBOSITY-TEST-CASE-P-QUEUE", 2, 0, false);
            declareFunction("subloop_reserved_initialize_verbosity_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-VERBOSITY-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_verbosity_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-VERBOSITY-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("verbosity_test_case_p", "VERBOSITY-TEST-CASE-P", 1, 0, false);
            declareFunction("get_eval_with_bindings_test_case_p_queue", "GET-EVAL-WITH-BINDINGS-TEST-CASE-P-QUEUE", 1, 0, false);
            declareFunction("set_eval_with_bindings_test_case_p_queue", "SET-EVAL-WITH-BINDINGS-TEST-CASE-P-QUEUE", 2, 0, false);
            declareFunction("subloop_reserved_initialize_eval_with_bindings_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-EVAL-WITH-BINDINGS-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_eval_with_bindings_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-EVAL-WITH-BINDINGS-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("eval_with_bindings_test_case_p", "EVAL-WITH-BINDINGS-TEST-CASE-P", 1, 0, false);
            declareFunction("get_task_info_test_case_p_queue", "GET-TASK-INFO-TEST-CASE-P-QUEUE", 1, 0, false);
            declareFunction("set_task_info_test_case_p_queue", "SET-TASK-INFO-TEST-CASE-P-QUEUE", 2, 0, false);
            declareFunction("subloop_reserved_initialize_task_info_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-TASK-INFO-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_task_info_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-TASK-INFO-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("task_info_test_case_p", "TASK-INFO-TEST-CASE-P", 1, 0, false);
            declareFunction("get_task_processor_test_case_p_queue", "GET-TASK-PROCESSOR-TEST-CASE-P-QUEUE", 1, 0, false);
            declareFunction("set_task_processor_test_case_p_queue", "SET-TASK-PROCESSOR-TEST-CASE-P-QUEUE", 2, 0, false);
            declareFunction("subloop_reserved_initialize_task_processor_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-TASK-PROCESSOR-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_task_processor_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-TASK-PROCESSOR-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("task_processor_test_case_p", "TASK-PROCESSOR-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_task_processor_file_Previous() {
        declareFunction("get_task_processor_verbosity", "GET-TASK-PROCESSOR-VERBOSITY", 0, 0, false);
        declareFunction("set_task_processor_verbosity", "SET-TASK-PROCESSOR-VERBOSITY", 1, 0, false);
        declareFunction("task_info_print_function_trampoline", "TASK-INFO-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_info_p", "TASK-INFO-P", 1, 0, false);
        new task_processor.$task_info_p$UnaryFunction();
        declareFunction("ti_type", "TI-TYPE", 1, 0, false);
        declareFunction("ti_id", "TI-ID", 1, 0, false);
        declareFunction("ti_priority", "TI-PRIORITY", 1, 0, false);
        declareFunction("ti_requestor", "TI-REQUESTOR", 1, 0, false);
        declareFunction("ti_giveback_info", "TI-GIVEBACK-INFO", 1, 0, false);
        declareFunction("ti_bindings", "TI-BINDINGS", 1, 0, false);
        declareFunction("ti_request", "TI-REQUEST", 1, 0, false);
        declareFunction("ti_response", "TI-RESPONSE", 1, 0, false);
        declareFunction("ti_error_message", "TI-ERROR-MESSAGE", 1, 0, false);
        declareFunction("ti_task_processor_name", "TI-TASK-PROCESSOR-NAME", 1, 0, false);
        declareFunction("_csetf_ti_type", "_CSETF-TI-TYPE", 2, 0, false);
        declareFunction("_csetf_ti_id", "_CSETF-TI-ID", 2, 0, false);
        declareFunction("_csetf_ti_priority", "_CSETF-TI-PRIORITY", 2, 0, false);
        declareFunction("_csetf_ti_requestor", "_CSETF-TI-REQUESTOR", 2, 0, false);
        declareFunction("_csetf_ti_giveback_info", "_CSETF-TI-GIVEBACK-INFO", 2, 0, false);
        declareFunction("_csetf_ti_bindings", "_CSETF-TI-BINDINGS", 2, 0, false);
        declareFunction("_csetf_ti_request", "_CSETF-TI-REQUEST", 2, 0, false);
        declareFunction("_csetf_ti_response", "_CSETF-TI-RESPONSE", 2, 0, false);
        declareFunction("_csetf_ti_error_message", "_CSETF-TI-ERROR-MESSAGE", 2, 0, false);
        declareFunction("_csetf_ti_task_processor_name", "_CSETF-TI-TASK-PROCESSOR-NAME", 2, 0, false);
        declareFunction("make_task_info", "MAKE-TASK-INFO", 0, 1, false);
        declareFunction("visit_defstruct_task_info", "VISIT-DEFSTRUCT-TASK-INFO", 2, 0, false);
        declareFunction("visit_defstruct_object_task_info_method", "VISIT-DEFSTRUCT-OBJECT-TASK-INFO-METHOD", 2, 0, false);
        declareFunction("get_task_info_type", "GET-TASK-INFO-TYPE", 1, 0, false);
        declareFunction("set_task_info_type", "SET-TASK-INFO-TYPE", 2, 0, false);
        declareFunction("get_task_info_id", "GET-TASK-INFO-ID", 1, 0, false);
        declareFunction("set_task_info_id", "SET-TASK-INFO-ID", 2, 0, false);
        declareFunction("get_task_info_priority", "GET-TASK-INFO-PRIORITY", 1, 0, false);
        declareFunction("set_task_info_priority", "SET-TASK-INFO-PRIORITY", 2, 0, false);
        declareFunction("get_task_info_requestor", "GET-TASK-INFO-REQUESTOR", 1, 0, false);
        declareFunction("set_task_info_requestor", "SET-TASK-INFO-REQUESTOR", 2, 0, false);
        declareFunction("get_task_info_giveback_info", "GET-TASK-INFO-GIVEBACK-INFO", 1, 0, false);
        declareFunction("set_task_info_giveback_info", "SET-TASK-INFO-GIVEBACK-INFO", 2, 0, false);
        declareFunction("get_task_info_bindings", "GET-TASK-INFO-BINDINGS", 1, 0, false);
        declareFunction("set_task_info_bindings", "SET-TASK-INFO-BINDINGS", 2, 0, false);
        declareFunction("get_task_info_request", "GET-TASK-INFO-REQUEST", 1, 0, false);
        declareFunction("set_task_info_request", "SET-TASK-INFO-REQUEST", 2, 0, false);
        declareFunction("get_task_info_response", "GET-TASK-INFO-RESPONSE", 1, 0, false);
        declareFunction("set_task_info_response", "SET-TASK-INFO-RESPONSE", 2, 0, false);
        declareFunction("get_task_info_error_message", "GET-TASK-INFO-ERROR-MESSAGE", 1, 0, false);
        declareFunction("set_task_info_error_message", "SET-TASK-INFO-ERROR-MESSAGE", 2, 0, false);
        declareFunction("get_task_info_task_processor_name", "GET-TASK-INFO-TASK-PROCESSOR-NAME", 1, 0, false);
        declareFunction("set_task_info_task_processor_name", "SET-TASK-INFO-TASK-PROCESSOR-NAME", 2, 0, false);
        declareFunction("print_task_info", "PRINT-TASK-INFO", 3, 0, false);
        declareFunction("task_result_set_print_function_trampoline", "TASK-RESULT-SET-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_result_set_p", "TASK-RESULT-SET-P", 1, 0, false);
        new task_processor.$task_result_set_p$UnaryFunction();
        declareFunction("task_result_set_result", "TASK-RESULT-SET-RESULT", 1, 0, false);
        declareFunction("task_result_set_task_info", "TASK-RESULT-SET-TASK-INFO", 1, 0, false);
        declareFunction("task_result_set_finished", "TASK-RESULT-SET-FINISHED", 1, 0, false);
        declareFunction("_csetf_task_result_set_result", "_CSETF-TASK-RESULT-SET-RESULT", 2, 0, false);
        declareFunction("_csetf_task_result_set_task_info", "_CSETF-TASK-RESULT-SET-TASK-INFO", 2, 0, false);
        declareFunction("_csetf_task_result_set_finished", "_CSETF-TASK-RESULT-SET-FINISHED", 2, 0, false);
        declareFunction("make_task_result_set", "MAKE-TASK-RESULT-SET", 0, 1, false);
        declareFunction("visit_defstruct_task_result_set", "VISIT-DEFSTRUCT-TASK-RESULT-SET", 2, 0, false);
        declareFunction("visit_defstruct_object_task_result_set_method", "VISIT-DEFSTRUCT-OBJECT-TASK-RESULT-SET-METHOD", 2, 0, false);
        declareFunction("new_task_result_set", "NEW-TASK-RESULT-SET", 3, 0, false);
        declareFunction("task_result_set_priority", "TASK-RESULT-SET-PRIORITY", 1, 0, false);
        declareFunction("task_processor_print_function_trampoline", "TASK-PROCESSOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_processor_p", "TASK-PROCESSOR-P", 1, 0, false);
        new task_processor.$task_processor_p$UnaryFunction();
        declareFunction("tproc_name", "TPROC-NAME", 1, 0, false);
        declareFunction("tproc_process", "TPROC-PROCESS", 1, 0, false);
        declareFunction("tproc_busy_p", "TPROC-BUSY-P", 1, 0, false);
        declareFunction("tproc_task_info", "TPROC-TASK-INFO", 1, 0, false);
        declareFunction("_csetf_tproc_name", "_CSETF-TPROC-NAME", 2, 0, false);
        declareFunction("_csetf_tproc_process", "_CSETF-TPROC-PROCESS", 2, 0, false);
        declareFunction("_csetf_tproc_busy_p", "_CSETF-TPROC-BUSY-P", 2, 0, false);
        declareFunction("_csetf_tproc_task_info", "_CSETF-TPROC-TASK-INFO", 2, 0, false);
        declareFunction("make_task_processor", "MAKE-TASK-PROCESSOR", 0, 1, false);
        declareFunction("visit_defstruct_task_processor", "VISIT-DEFSTRUCT-TASK-PROCESSOR", 2, 0, false);
        declareFunction("visit_defstruct_object_task_processor_method", "VISIT-DEFSTRUCT-OBJECT-TASK-PROCESSOR-METHOD", 2, 0, false);
        declareFunction("print_task_processor", "PRINT-TASK-PROCESSOR", 3, 0, false);
        declareFunction("task_process_pool_print_function_trampoline", "TASK-PROCESS-POOL-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_process_pool_p", "TASK-PROCESS-POOL-P", 1, 0, false);
        new task_processor.$task_process_pool_p$UnaryFunction();
        declareFunction("tpool_lock", "TPOOL-LOCK", 1, 0, false);
        declareFunction("tpool_request_queue", "TPOOL-REQUEST-QUEUE", 1, 0, false);
        declareFunction("tpool_request_semaphore", "TPOOL-REQUEST-SEMAPHORE", 1, 0, false);
        declareFunction("tpool_processors", "TPOOL-PROCESSORS", 1, 0, false);
        declareFunction("tpool_background_msgs", "TPOOL-BACKGROUND-MSGS", 1, 0, false);
        declareFunction("tpool_process_name_prefix", "TPOOL-PROCESS-NAME-PREFIX", 1, 0, false);
        declareFunction("tpool_min_nbr_of_task_processors", "TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction("tpool_max_nbr_of_task_processors", "TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction("_csetf_tpool_lock", "_CSETF-TPOOL-LOCK", 2, 0, false);
        declareFunction("_csetf_tpool_request_queue", "_CSETF-TPOOL-REQUEST-QUEUE", 2, 0, false);
        declareFunction("_csetf_tpool_request_semaphore", "_CSETF-TPOOL-REQUEST-SEMAPHORE", 2, 0, false);
        declareFunction("_csetf_tpool_processors", "_CSETF-TPOOL-PROCESSORS", 2, 0, false);
        declareFunction("_csetf_tpool_background_msgs", "_CSETF-TPOOL-BACKGROUND-MSGS", 2, 0, false);
        declareFunction("_csetf_tpool_process_name_prefix", "_CSETF-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false);
        declareFunction("_csetf_tpool_min_nbr_of_task_processors", "_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction("_csetf_tpool_max_nbr_of_task_processors", "_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction("make_task_process_pool", "MAKE-TASK-PROCESS-POOL", 0, 1, false);
        declareFunction("visit_defstruct_task_process_pool", "VISIT-DEFSTRUCT-TASK-PROCESS-POOL", 2, 0, false);
        declareFunction("visit_defstruct_object_task_process_pool_method", "VISIT-DEFSTRUCT-OBJECT-TASK-PROCESS-POOL-METHOD", 2, 0, false);
        declareFunction("print_task_process_pool", "PRINT-TASK-PROCESS-POOL", 3, 0, false);
        declareFunction("display_task_processors", "DISPLAY-TASK-PROCESSORS", 1, 1, false);
        declareFunction("display_active_task_processes", "DISPLAY-ACTIVE-TASK-PROCESSES", 0, 1, false);
        declareFunction("task_processors_initialized_p", "TASK-PROCESSORS-INITIALIZED-P", 1, 0, false);
        declareFunction("get_tpool_lock", "GET-TPOOL-LOCK", 1, 0, false);
        declareFunction("set_tpool_lock", "SET-TPOOL-LOCK", 2, 0, false);
        declareFunction("get_tpool_request_queue", "GET-TPOOL-REQUEST-QUEUE", 1, 0, false);
        declareFunction("set_tpool_request_queue", "SET-TPOOL-REQUEST-QUEUE", 2, 0, false);
        declareFunction("get_tpool_processors", "GET-TPOOL-PROCESSORS", 1, 0, false);
        declareFunction("get_tpool_processors_nbr", "GET-TPOOL-PROCESSORS-NBR", 1, 0, false);
        declareFunction("push_tpool_processor", "PUSH-TPOOL-PROCESSOR", 2, 0, false);
        declareFunction("set_tpool_processors", "SET-TPOOL-PROCESSORS", 2, 0, false);
        declareFunction("set_tpool_background_msg_path", "SET-TPOOL-BACKGROUND-MSG-PATH", 1, 0, false);
        declareFunction("push_tpool_background_msg", "PUSH-TPOOL-BACKGROUND-MSG", 2, 0, false);
        declareFunction("flush_tpool_background_msgs", "FLUSH-TPOOL-BACKGROUND-MSGS", 0, 0, false);
        declareFunction("show_tp_msgs", "SHOW-TP-MSGS", 1, 0, false);
        declareFunction("show_tp_msgs_with_process_name", "SHOW-TP-MSGS-WITH-PROCESS-NAME", 1, 0, false);
        declareFunction("set_tpool_process_name_prefix", "SET-TPOOL-PROCESS-NAME-PREFIX", 2, 0, false);
        declareFunction("get_tpool_process_name_prefix", "GET-TPOOL-PROCESS-NAME-PREFIX", 1, 0, false);
        declareFunction("set_tpool_min_nbr_of_task_processors", "SET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction("get_tpool_min_nbr_of_task_processors", "GET-TPOOL-MIN-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction("set_tpool_max_nbr_of_task_processors", "SET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 2, 0, false);
        declareFunction("get_tpool_max_nbr_of_task_processors", "GET-TPOOL-MAX-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction("get_nbr_of_task_processors", "GET-NBR-OF-TASK-PROCESSORS", 1, 0, false);
        declareFunction("start_task_processor_logging_to_file", "START-TASK-PROCESSOR-LOGGING-TO-FILE", 1, 1, false);
        declareFunction("end_task_processor_logging_to_file", "END-TASK-PROCESSOR-LOGGING-TO-FILE", 0, 0, false);
        declareFunction("save_unlogged_task_processor_messages_to_file", "SAVE-UNLOGGED-TASK-PROCESSOR-MESSAGES-TO-FILE", 1, 0, false);
        declareFunction("eval_with_bindings", "EVAL-WITH-BINDINGS", 3, 0, false);
        declareFunction("get_task_process_pool_for_process", "GET-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false);
        declareFunction("add_task_process_pool_for_process", "ADD-TASK-PROCESS-POOL-FOR-PROCESS", 2, 0, false);
        declareFunction("remove_task_process_pool_for_process", "REMOVE-TASK-PROCESS-POOL-FOR-PROCESS", 1, 0, false);
        declareFunction("ensure_task_process_being_worked_on_initialized", "ENSURE-TASK-PROCESS-BEING-WORKED-ON-INITIALIZED", 0, 0, false);
        declareFunction("compute_task_process_description_from_task_info", "COMPUTE-TASK-PROCESS-DESCRIPTION-FROM-TASK-INFO", 1, 0, false);
        declareFunction("compute_task_process_description", "COMPUTE-TASK-PROCESS-DESCRIPTION", 2, 0, false);
        declareFunction("get_giveback_info_from_task_process_description", "GET-GIVEBACK-INFO-FROM-TASK-PROCESS-DESCRIPTION", 1, 0, false);
        declareFunction("note_active_task_process_description_if_permitted", "NOTE-ACTIVE-TASK-PROCESS-DESCRIPTION-IF-PERMITTED", 1, 0, false);
        declareFunction("note_inactive_task_process_description", "NOTE-INACTIVE-TASK-PROCESS-DESCRIPTION", 1, 0, false);
        declareFunction("task_process_termination_reason_p", "TASK-PROCESS-TERMINATION-REASON-P", 1, 0, false);
        declareFunction("terminate_active_task_process", "TERMINATE-ACTIVE-TASK-PROCESS", 3, 0, false);
        declareFunction("terminate_active_task_processes", "TERMINATE-ACTIVE-TASK-PROCESSES", 1, 0, false);
        declareFunction("signal_terminate_active_task_process", "SIGNAL-TERMINATE-ACTIVE-TASK-PROCESS", 4, 0, false);
        declareFunction("signal_abort_active_task_process", "SIGNAL-ABORT-ACTIVE-TASK-PROCESS", 2, 0, false);
        declareFunction("signal_cancel_active_task_process", "SIGNAL-CANCEL-ACTIVE-TASK-PROCESS", 2, 0, false);
        declareMacro("catch_task_processor_termination", "CATCH-TASK-PROCESSOR-TERMINATION");
        declareMacro("catch_task_processor_termination_quietly", "CATCH-TASK-PROCESSOR-TERMINATION-QUIETLY");
        declareFunction("get_current_task_processor_info", "GET-CURRENT-TASK-PROCESSOR-INFO", 0, 0, false);
        declareFunction("get_current_task_processor_client", "GET-CURRENT-TASK-PROCESSOR-CLIENT", 0, 0, false);
        declareFunction("map_task_info_priority_to_process_priority", "MAP-TASK-INFO-PRIORITY-TO-PROCESS-PRIORITY", 1, 0, false);
        declareFunction("task_processor_handler", "TASK-PROCESSOR-HANDLER", 0, 0, false);
        declareFunction("post_task_info_processor_partial_results", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS", 1, 0, false);
        declareFunction("post_task_info_processor_partial_results_internal", "POST-TASK-INFO-PROCESSOR-PARTIAL-RESULTS-INTERNAL", 2, 0, false);
        declareFunction("initialize_task_processors", "INITIALIZE-TASK-PROCESSORS", 0, 3, false);
        declareFunction("add_new_task_processor_to_pool", "ADD-NEW-TASK-PROCESSOR-TO-POOL", 1, 0, false);
        declareFunction("halt_task_processors", "HALT-TASK-PROCESSORS", 1, 0, false);
        declareFunction("halt_task_processor", "HALT-TASK-PROCESSOR", 1, 0, false);
        declareFunction("halt_task_processor_via_interrupt", "HALT-TASK-PROCESSOR-VIA-INTERRUPT", 1, 0, false);
        declareFunction("ensure_task_processors_killed", "ENSURE-TASK-PROCESSORS-KILLED", 1, 0, false);
        declareFunction("task_processor_quit", "TASK-PROCESSOR-QUIT", 0, 0, false);
        declareFunction("find_task_processor", "FIND-TASK-PROCESSOR", 2, 0, false);
        declareFunction("find_task_process_pool", "FIND-TASK-PROCESS-POOL", 1, 0, false);
        declareFunction("awaken_first_available_task_processors", "AWAKEN-FIRST-AVAILABLE-TASK-PROCESSORS", 1, 0, false);
        declareFunction("enqueue_task_request", "ENQUEUE-TASK-REQUEST", 2, 0, false);
        declareMacro("with_long_running_task_process", "WITH-LONG-RUNNING-TASK-PROCESS");
        declareMacro("declare_task_process_pool", "DECLARE-TASK-PROCESS-POOL");
        declareMacro("declare_task_process_request", "DECLARE-TASK-PROCESS-REQUEST");
        declareMacro("declare_task_process_response_dispatch", "DECLARE-TASK-PROCESS-RESPONSE-DISPATCH");
        declareFunction("api_task_processors_initialized_p", "API-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
        declareFunction("initialize_api_task_processors", "INITIALIZE-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction("halt_api_task_processors", "HALT-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction("restart_api_task_processors", "RESTART-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction("show_api_tp_msgs", "SHOW-API-TP-MSGS", 0, 0, false);
        declareFunction("show_api_task_processors", "SHOW-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction("display_api_task_processors", "DISPLAY-API-TASK-PROCESSORS", 0, 0, false);
        declareFunction("api_task_processor_request", "API-TASK-PROCESSOR-REQUEST", 6, 0, false);
        declareFunction("set_java_api_lease_activity_display", "SET-JAVA-API-LEASE-ACTIVITY-DISPLAY", 1, 0, false);
        declareFunction("java_api_lease_activity_display", "JAVA-API-LEASE-ACTIVITY-DISPLAY", 0, 0, false);
        declareFunction("dispatch_task_processor_response", "DISPATCH-TASK-PROCESSOR-RESPONSE", 1, 1, false);
        declareFunction("dispatch_api_task_processor_response", "DISPATCH-API-TASK-PROCESSOR-RESPONSE", 1, 1, false);
        declareFunction("new_intermediate_results_accumulator", "NEW-INTERMEDIATE-RESULTS-ACCUMULATOR", 1, 0, false);
        declareFunction("intermediate_results_accumulator_add", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction("intermediate_results_accumulator_add_all", "INTERMEDIATE-RESULTS-ACCUMULATOR-ADD-ALL", 2, 0, false);
        declareFunction("intermediate_results_accumulator_reset", "INTERMEDIATE-RESULTS-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction("intermediate_results_accumulator_size", "INTERMEDIATE-RESULTS-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction("intermediate_results_accumulator_contents", "INTERMEDIATE-RESULTS-ACCUMULATOR-CONTENTS", 1, 1, false);
        declareFunction("intermediate_results_accumulator_iterator", "INTERMEDIATE-RESULTS-ACCUMULATOR-ITERATOR", 1, 0, false);
        declareFunction("bg_task_processors_initialized_p", "BG-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
        declareFunction("initialize_bg_task_processors", "INITIALIZE-BG-TASK-PROCESSORS", 0, 0, false);
        declareFunction("halt_bg_task_processors", "HALT-BG-TASK-PROCESSORS", 0, 0, false);
        declareFunction("restart_bg_task_processors", "RESTART-BG-TASK-PROCESSORS", 0, 0, false);
        declareFunction("show_bg_tp_msgs", "SHOW-BG-TP-MSGS", 0, 0, false);
        declareFunction("bg_task_processor_request", "BG-TASK-PROCESSOR-REQUEST", 6, 0, false);
        declareFunction("dispatch_bg_task_processor_response", "DISPATCH-BG-TASK-PROCESSOR-RESPONSE", 1, 0, false);
        declareFunction("bg_api_eval", "BG-API-EVAL", 1, 0, false);
        declareFunction("console_task_processors_initialized_p", "CONSOLE-TASK-PROCESSORS-INITIALIZED-P", 0, 0, false);
        declareFunction("initialize_console_task_processors", "INITIALIZE-CONSOLE-TASK-PROCESSORS", 0, 0, false);
        declareFunction("halt_console_task_processors", "HALT-CONSOLE-TASK-PROCESSORS", 0, 0, false);
        declareFunction("restart_console_task_processors", "RESTART-CONSOLE-TASK-PROCESSORS", 0, 0, false);
        declareFunction("show_console_tp_msgs", "SHOW-CONSOLE-TP-MSGS", 0, 0, false);
        declareFunction("console_task_processor_request", "CONSOLE-TASK-PROCESSOR-REQUEST", 2, 0, false);
        declareFunction("dispatch_console_task_processor_response", "DISPATCH-CONSOLE-TASK-PROCESSOR-RESPONSE", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_task_processor_file_alt() {
        defparameter("*TASK-PROCESSOR-VERBOSITY*", ZERO_INTEGER);
        defconstant("*DTP-TASK-INFO*", TASK_INFO);
        defconstant("*DTP-TASK-RESULT-SET*", TASK_RESULT_SET);
        deflexical("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*", NIL);
        defconstant("*DTP-TASK-PROCESSOR*", TASK_PROCESSOR);
        defconstant("*DTP-TASK-PROCESS-POOL*", TASK_PROCESS_POOL);
        defconstant("*TASK-REQUEST-QUEUE-MAX-SIZE*", $int$500);
        deflexical("*TPOOL-BACKGROUND-MSG-PATH*", NIL);
        deflexical("*TPOOL-BACKGROUND-MSG-STREAM*", NIL);
        deflexical("*TPOOL-BACKGROUND-MSG-LOCK*", NIL);
        defparameter("*EVAL-WITH-BINDINGS*", NIL);
        deflexical("*PROCESS-TO-TASK-PROCESS-POOL*", dictionary_utilities.new_synchronized_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*TASK-PROCESSES-BEING-WORKED-ON-LOCK*", make_lock($$$Task_processes_being_worked_on));
        deflexical("*TASK-PROCESSES-BEING-WORKED-ON*", NIL);
        defparameter("*TASK-PROCESSES-WORKED-ON-HISTORY*", $int$500);
        deflexical("*TASK-PROCESSOR-EVAL-FN-DICT*", NIL);
        defparameter("*MINIMIZE-TASK-PROCESSOR-INFO-COMMUNICATION*", T);
        defparameter("*CURRENT-TASK-PROCESSOR-INFO*", NIL);
        defparameter("*TASK-PROCESSOR-STANDARD-OUTPUT*", StreamsLow.$standard_output$.getDynamicValue());
        defconstant("*MIN-NBR-OF-TASK-PROCESSORS*", FIVE_INTEGER);
        defconstant("*MAX-NBR-OF-TASK-PROCESSORS*", $int$25);
        deflexical("*API-TASK-PROCESS-POOL*", NIL);
        defconstant("*API-TASK-PROCESS-POOL-LOCK*", make_lock($str_alt249$task_processor_initialization_loc));
        deflexical("*JAVA-API-LEASE-ACTIVITY-DISPLAY*", NIL);
        deflexical("*BG-TASK-PROCESS-POOL*", NIL);
        defconstant("*BG-TASK-PROCESS-POOL-LOCK*", make_lock($str_alt249$task_processor_initialization_loc));
        deflexical("*BG-TASK-PROCESSOR-RESPONSE-DICT*", NIL);
        deflexical("*BG-TASK-PROCESSOR-REQUEST-ID*", ZERO_INTEGER);
        deflexical("*CONSOLE-TASK-PROCESS-POOL*", NIL);
        defconstant("*CONSOLE-TASK-PROCESS-POOL-LOCK*", make_lock($str_alt249$task_processor_initialization_loc));
        deflexical("*TASK-PROCESSOR-CONSOLE-ID*", NIL != boundp($task_processor_console_id$) ? ((SubLObject) ($task_processor_console_id$.getGlobalValue())) : ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject init_task_processor_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*TASK-PROCESSOR-VERBOSITY*", ZERO_INTEGER);
            defconstant("*DTP-TASK-INFO*", task_processor.TASK_INFO);
            defconstant("*DTP-TASK-RESULT-SET*", task_processor.TASK_RESULT_SET);
            deflexical("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*", NIL);
            defconstant("*DTP-TASK-PROCESSOR*", task_processor.TASK_PROCESSOR);
            defconstant("*DTP-TASK-PROCESS-POOL*", task_processor.TASK_PROCESS_POOL);
            defconstant("*TASK-REQUEST-QUEUE-MAX-SIZE*", task_processor.$int$500);
            deflexical("*TPOOL-BACKGROUND-MSG-PATH*", NIL);
            deflexical("*TPOOL-BACKGROUND-MSG-STREAM*", NIL);
            defparameter("*QUEUE-TPOOL-BACKGROUND-MSGS-WHEN-NO-PATH?*", NIL);
            deflexical("*TPOOL-BACKGROUND-MSG-LOCK*", SubLTrampolineFile.maybeDefault(task_processor.$tpool_background_msg_lock$, task_processor.$tpool_background_msg_lock$, () -> make_lock(task_processor.$str157$tpool_background_msg_lock)));
            defparameter("*EVAL-WITH-BINDINGS*", NIL);
            deflexical("*PROCESS-TO-TASK-PROCESS-POOL*", dictionary_utilities.new_synchronized_dictionary(UNPROVIDED, UNPROVIDED));
            deflexical("*TASK-PROCESSES-BEING-WORKED-ON-LOCK*", make_lock(task_processor.$$$Task_processes_being_worked_on));
            deflexical("*TASK-PROCESSES-BEING-WORKED-ON*", NIL);
            defparameter("*TASK-PROCESSES-WORKED-ON-HISTORY*", task_processor.$int$500);
            deflexical("*TASK-PROCESSOR-EVAL-FN-DICT*", NIL);
            defparameter("*MINIMIZE-TASK-PROCESSOR-INFO-COMMUNICATION*", T);
            defparameter("*CURRENT-TASK-PROCESSOR-INFO*", NIL);
            defparameter("*TASK-PROCESSOR-STANDARD-OUTPUT*", StreamsLow.$standard_output$.getDynamicValue());
            defconstant("*MIN-NBR-OF-TASK-PROCESSORS*", FIVE_INTEGER);
            defconstant("*MAX-NBR-OF-TASK-PROCESSORS*", task_processor.$int$25);
            deflexical("*API-TASK-PROCESS-POOL*", NIL);
            defconstant("*API-TASK-PROCESS-POOL-LOCK*", make_lock(task_processor.$str277$task_processor_initialization_loc));
            deflexical("*JAVA-API-LEASE-ACTIVITY-DISPLAY*", NIL);
            deflexical("*BG-TASK-PROCESS-POOL*", NIL);
            defconstant("*BG-TASK-PROCESS-POOL-LOCK*", make_lock(task_processor.$str277$task_processor_initialization_loc));
            deflexical("*BG-TASK-PROCESSOR-RESPONSE-DICT*", NIL);
            deflexical("*BG-TASK-PROCESSOR-REQUEST-ID*", ZERO_INTEGER);
            deflexical("*CONSOLE-TASK-PROCESS-POOL*", NIL);
            defconstant("*CONSOLE-TASK-PROCESS-POOL-LOCK*", make_lock(task_processor.$str277$task_processor_initialization_loc));
            deflexical("*TASK-PROCESSOR-CONSOLE-ID*", SubLTrampolineFile.maybeDefault(task_processor.$task_processor_console_id$, task_processor.$task_processor_console_id$, ZERO_INTEGER));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*TPOOL-BACKGROUND-MSG-LOCK*", NIL);
            defconstant("*API-TASK-PROCESS-POOL-LOCK*", make_lock($str_alt249$task_processor_initialization_loc));
            defconstant("*BG-TASK-PROCESS-POOL-LOCK*", make_lock($str_alt249$task_processor_initialization_loc));
            defconstant("*CONSOLE-TASK-PROCESS-POOL-LOCK*", make_lock($str_alt249$task_processor_initialization_loc));
            deflexical("*TASK-PROCESSOR-CONSOLE-ID*", NIL != boundp($task_processor_console_id$) ? ((SubLObject) ($task_processor_console_id$.getGlobalValue())) : ZERO_INTEGER);
        }
        return NIL;
    }

    public static SubLObject init_task_processor_file_Previous() {
        defparameter("*TASK-PROCESSOR-VERBOSITY*", ZERO_INTEGER);
        defconstant("*DTP-TASK-INFO*", task_processor.TASK_INFO);
        defconstant("*DTP-TASK-RESULT-SET*", task_processor.TASK_RESULT_SET);
        deflexical("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*", NIL);
        defconstant("*DTP-TASK-PROCESSOR*", task_processor.TASK_PROCESSOR);
        defconstant("*DTP-TASK-PROCESS-POOL*", task_processor.TASK_PROCESS_POOL);
        defconstant("*TASK-REQUEST-QUEUE-MAX-SIZE*", task_processor.$int$500);
        deflexical("*TPOOL-BACKGROUND-MSG-PATH*", NIL);
        deflexical("*TPOOL-BACKGROUND-MSG-STREAM*", NIL);
        defparameter("*QUEUE-TPOOL-BACKGROUND-MSGS-WHEN-NO-PATH?*", NIL);
        deflexical("*TPOOL-BACKGROUND-MSG-LOCK*", SubLTrampolineFile.maybeDefault(task_processor.$tpool_background_msg_lock$, task_processor.$tpool_background_msg_lock$, () -> make_lock(task_processor.$str157$tpool_background_msg_lock)));
        defparameter("*EVAL-WITH-BINDINGS*", NIL);
        deflexical("*PROCESS-TO-TASK-PROCESS-POOL*", dictionary_utilities.new_synchronized_dictionary(UNPROVIDED, UNPROVIDED));
        deflexical("*TASK-PROCESSES-BEING-WORKED-ON-LOCK*", make_lock(task_processor.$$$Task_processes_being_worked_on));
        deflexical("*TASK-PROCESSES-BEING-WORKED-ON*", NIL);
        defparameter("*TASK-PROCESSES-WORKED-ON-HISTORY*", task_processor.$int$500);
        deflexical("*TASK-PROCESSOR-EVAL-FN-DICT*", NIL);
        defparameter("*MINIMIZE-TASK-PROCESSOR-INFO-COMMUNICATION*", T);
        defparameter("*CURRENT-TASK-PROCESSOR-INFO*", NIL);
        defparameter("*TASK-PROCESSOR-STANDARD-OUTPUT*", StreamsLow.$standard_output$.getDynamicValue());
        defconstant("*MIN-NBR-OF-TASK-PROCESSORS*", FIVE_INTEGER);
        defconstant("*MAX-NBR-OF-TASK-PROCESSORS*", task_processor.$int$25);
        deflexical("*API-TASK-PROCESS-POOL*", NIL);
        defconstant("*API-TASK-PROCESS-POOL-LOCK*", make_lock(task_processor.$str277$task_processor_initialization_loc));
        deflexical("*JAVA-API-LEASE-ACTIVITY-DISPLAY*", NIL);
        deflexical("*BG-TASK-PROCESS-POOL*", NIL);
        defconstant("*BG-TASK-PROCESS-POOL-LOCK*", make_lock(task_processor.$str277$task_processor_initialization_loc));
        deflexical("*BG-TASK-PROCESSOR-RESPONSE-DICT*", NIL);
        deflexical("*BG-TASK-PROCESSOR-REQUEST-ID*", ZERO_INTEGER);
        deflexical("*CONSOLE-TASK-PROCESS-POOL*", NIL);
        defconstant("*CONSOLE-TASK-PROCESS-POOL-LOCK*", make_lock(task_processor.$str277$task_processor_initialization_loc));
        deflexical("*TASK-PROCESSOR-CONSOLE-ID*", SubLTrampolineFile.maybeDefault(task_processor.$task_processor_console_id$, task_processor.$task_processor_console_id$, ZERO_INTEGER));
        return NIL;
    }

    public static final SubLObject setup_task_processor_file_alt() {
        register_external_symbol(SET_TASK_PROCESSOR_VERBOSITY);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_task_info$.getGlobalValue(), symbol_function(TASK_INFO_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TI_TYPE, _CSETF_TI_TYPE);
        def_csetf(TI_ID, _CSETF_TI_ID);
        def_csetf(TI_PRIORITY, _CSETF_TI_PRIORITY);
        def_csetf(TI_REQUESTOR, _CSETF_TI_REQUESTOR);
        def_csetf(TI_GIVEBACK_INFO, _CSETF_TI_GIVEBACK_INFO);
        def_csetf(TI_BINDINGS, _CSETF_TI_BINDINGS);
        def_csetf(TI_REQUEST, _CSETF_TI_REQUEST);
        def_csetf(TI_RESPONSE, _CSETF_TI_RESPONSE);
        def_csetf(TI_ERROR_MESSAGE, _CSETF_TI_ERROR_MESSAGE);
        def_csetf(TI_TASK_PROCESSOR_NAME, _CSETF_TI_TASK_PROCESSOR_NAME);
        identity(TASK_INFO);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_task_result_set$.getGlobalValue(), symbol_function(TASK_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TASK_RESULT_SET_RESULT, _CSETF_TASK_RESULT_SET_RESULT);
        def_csetf(TASK_RESULT_SET_TASK_INFO, _CSETF_TASK_RESULT_SET_TASK_INFO);
        def_csetf(TASK_RESULT_SET_FINISHED, _CSETF_TASK_RESULT_SET_FINISHED);
        identity(TASK_RESULT_SET);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_task_processor$.getGlobalValue(), symbol_function(TASK_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TPROC_NAME, _CSETF_TPROC_NAME);
        def_csetf(TPROC_PROCESS, _CSETF_TPROC_PROCESS);
        def_csetf(TPROC_BUSY_P, _CSETF_TPROC_BUSY_P);
        def_csetf(TPROC_TASK_INFO, _CSETF_TPROC_TASK_INFO);
        identity(TASK_PROCESSOR);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_task_process_pool$.getGlobalValue(), symbol_function(TASK_PROCESS_POOL_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TPOOL_LOCK, _CSETF_TPOOL_LOCK);
        def_csetf(TPOOL_REQUEST_QUEUE, _CSETF_TPOOL_REQUEST_QUEUE);
        def_csetf(TPOOL_REQUEST_SEMAPHORE, _CSETF_TPOOL_REQUEST_SEMAPHORE);
        def_csetf(TPOOL_PROCESSORS, _CSETF_TPOOL_PROCESSORS);
        def_csetf(TPOOL_BACKGROUND_MSGS, _CSETF_TPOOL_BACKGROUND_MSGS);
        def_csetf(TPOOL_PROCESS_NAME_PREFIX, _CSETF_TPOOL_PROCESS_NAME_PREFIX);
        def_csetf(TPOOL_MIN_NBR_OF_TASK_PROCESSORS, _CSETF_TPOOL_MIN_NBR_OF_TASK_PROCESSORS);
        def_csetf(TPOOL_MAX_NBR_OF_TASK_PROCESSORS, _CSETF_TPOOL_MAX_NBR_OF_TASK_PROCESSORS);
        identity(TASK_PROCESS_POOL);
        register_external_symbol(SET_TPOOL_BACKGROUND_MSG_PATH);
        register_cyc_api_macro(CATCH_TASK_PROCESSOR_TERMINATION, $list_alt173, $str_alt177$Allow_for_the_API_calling_side_to);
        register_cyc_api_macro(CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY, $list_alt180, $str_alt181$Allow_for_the_API_calling_side_to);
        register_external_symbol(ENSURE_TASK_PROCESSORS_KILLED);
        register_cyc_api_function(SHOW_API_TASK_PROCESSORS, NIL, $str_alt253$Provides_a_convenient_alias_for_D, NIL, NIL);
        register_cyc_api_function(DISPLAY_API_TASK_PROCESSORS, NIL, $str_alt255$, NIL, NIL);
        register_api_predefined_function(INITIALIZE_API_TASK_PROCESSORS);
        register_api_predefined_function(HALT_API_TASK_PROCESSORS);
        register_api_predefined_function(SHOW_API_TP_MSGS);
        register_api_predefined_function(API_TASK_PROCESSOR_REQUEST);
        register_api_predefined_function(WITH_IMMEDIATE_EXECUTION);
        if (NIL == $task_processor_eval_fn_dict$.getGlobalValue()) {
            $task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_eval_fn_dict$.getGlobalValue(), $API, symbol_function(CYC_API_EVAL));
        register_external_symbol(SET_JAVA_API_LEASE_ACTIVITY_DISPLAY);
        if (NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
            $task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_response_dispatch_fn_dict$.getGlobalValue(), $API, symbol_function(DISPATCH_API_TASK_PROCESSOR_RESPONSE));
        if (NIL == $task_processor_eval_fn_dict$.getGlobalValue()) {
            $task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_eval_fn_dict$.getGlobalValue(), $BG, symbol_function(CYC_API_EVAL));
        if (NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
            $task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_response_dispatch_fn_dict$.getGlobalValue(), $BG, symbol_function(DISPATCH_BG_TASK_PROCESSOR_RESPONSE));
        declare_defglobal($task_processor_console_id$);
        if (NIL == $task_processor_eval_fn_dict$.getGlobalValue()) {
            $task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_eval_fn_dict$.getGlobalValue(), $CONSOLE, symbol_function(CYC_API_EVAL));
        if (NIL == $task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
            $task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter($task_processor_response_dispatch_fn_dict$.getGlobalValue(), $CONSOLE, symbol_function(DISPATCH_CONSOLE_TASK_PROCESSOR_RESPONSE));
        sunit_external.define_test_category($str_alt286$Task_Processor_Module_Supercatego, UNPROVIDED);
        sunit_external.define_test_category($$$Task_Processor_Subcategory, list($str_alt286$Task_Processor_Module_Supercatego));
        sunit_external.define_test_suite($str_alt288$Task_Processor_Testing_Suite, list($str_alt286$Task_Processor_Module_Supercatego), UNPROVIDED, UNPROVIDED);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(VERBOSITY_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(VERBOSITY_TEST_CASE);
        classes.subloop_new_class(VERBOSITY_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt291);
        classes.class_set_implements_slot_listeners(VERBOSITY_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(VERBOSITY_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_VERBOSITY_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(VERBOSITY_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_VERBOSITY_TEST_CASE_INSTANCE);
        com.cyc.cycjava.cycl.task_processor.subloop_reserved_initialize_verbosity_test_case_class(VERBOSITY_TEST_CASE);
        sunit_macros.define_test_case_postamble(VERBOSITY_TEST_CASE, $str_alt307$task_processor, $$$cycl, $list_alt309);
        sunit_macros.def_test_method_register(VERBOSITY_TEST_CASE, TEST);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(EVAL_WITH_BINDINGS_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(EVAL_WITH_BINDINGS_TEST_CASE);
        classes.subloop_new_class(EVAL_WITH_BINDINGS_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt291);
        classes.class_set_implements_slot_listeners(EVAL_WITH_BINDINGS_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(EVAL_WITH_BINDINGS_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_EVAL_WITH_BINDINGS_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(EVAL_WITH_BINDINGS_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_EVAL_WITH_BINDINGS_TEST_CASE_INSTANCE);
        com.cyc.cycjava.cycl.task_processor.subloop_reserved_initialize_eval_with_bindings_test_case_class(EVAL_WITH_BINDINGS_TEST_CASE);
        sunit_macros.define_test_case_postamble(EVAL_WITH_BINDINGS_TEST_CASE, $str_alt307$task_processor, $$$cycl, $list_alt309);
        sunit_macros.def_test_method_register(EVAL_WITH_BINDINGS_TEST_CASE, TEST);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TASK_INFO_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(TASK_INFO_TEST_CASE);
        classes.subloop_new_class(TASK_INFO_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt291);
        classes.class_set_implements_slot_listeners(TASK_INFO_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(TASK_INFO_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_TASK_INFO_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(TASK_INFO_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_TASK_INFO_TEST_CASE_INSTANCE);
        com.cyc.cycjava.cycl.task_processor.subloop_reserved_initialize_task_info_test_case_class(TASK_INFO_TEST_CASE);
        sunit_macros.define_test_case_postamble(TASK_INFO_TEST_CASE, $str_alt307$task_processor, $$$cycl, $list_alt309);
        sunit_macros.def_test_method_register(TASK_INFO_TEST_CASE, TEST);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TASK_PROCESSOR_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(TASK_PROCESSOR_TEST_CASE);
        classes.subloop_new_class(TASK_PROCESSOR_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt318);
        classes.class_set_implements_slot_listeners(TASK_PROCESSOR_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(TASK_PROCESSOR_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_TASK_PROCESSOR_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(TASK_PROCESSOR_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_TASK_PROCESSOR_TEST_CASE_INSTANCE);
        com.cyc.cycjava.cycl.task_processor.subloop_reserved_initialize_task_processor_test_case_class(TASK_PROCESSOR_TEST_CASE);
        sunit_macros.define_test_case_postamble(TASK_PROCESSOR_TEST_CASE, $str_alt307$task_processor, $$$cycl, $list_alt309);
        sunit_macros.def_test_method_register(TASK_PROCESSOR_TEST_CASE, TEST1);
        sunit_macros.def_test_method_register(TASK_PROCESSOR_TEST_CASE, TEST2);
        sunit_macros.def_test_method_register(TASK_PROCESSOR_TEST_CASE, TEST3);
        return NIL;
    }

    public static SubLObject setup_task_processor_file() {
        if (SubLFiles.USE_V1) {
            register_external_symbol(task_processor.SET_TASK_PROCESSOR_VERBOSITY);
            register_method($print_object_method_table$.getGlobalValue(), task_processor.$dtp_task_info$.getGlobalValue(), symbol_function(task_processor.TASK_INFO_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(task_processor.$list11);
            def_csetf(task_processor.TI_TYPE, task_processor._CSETF_TI_TYPE);
            def_csetf(task_processor.TI_ID, task_processor._CSETF_TI_ID);
            def_csetf(task_processor.TI_PRIORITY, task_processor._CSETF_TI_PRIORITY);
            def_csetf(task_processor.TI_REQUESTOR, task_processor._CSETF_TI_REQUESTOR);
            def_csetf(task_processor.TI_GIVEBACK_INFO, task_processor._CSETF_TI_GIVEBACK_INFO);
            def_csetf(task_processor.TI_BINDINGS, task_processor._CSETF_TI_BINDINGS);
            def_csetf(task_processor.TI_REQUEST, task_processor._CSETF_TI_REQUEST);
            def_csetf(task_processor.TI_RESPONSE, task_processor._CSETF_TI_RESPONSE);
            def_csetf(task_processor.TI_ERROR_MESSAGE, task_processor._CSETF_TI_ERROR_MESSAGE);
            def_csetf(task_processor.TI_TASK_PROCESSOR_NAME, task_processor._CSETF_TI_TASK_PROCESSOR_NAME);
            identity(task_processor.TASK_INFO);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), task_processor.$dtp_task_info$.getGlobalValue(), symbol_function(task_processor.VISIT_DEFSTRUCT_OBJECT_TASK_INFO_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), task_processor.$dtp_task_result_set$.getGlobalValue(), symbol_function(task_processor.TASK_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(task_processor.$list68);
            def_csetf(task_processor.TASK_RESULT_SET_RESULT, task_processor._CSETF_TASK_RESULT_SET_RESULT);
            def_csetf(task_processor.TASK_RESULT_SET_TASK_INFO, task_processor._CSETF_TASK_RESULT_SET_TASK_INFO);
            def_csetf(task_processor.TASK_RESULT_SET_FINISHED, task_processor._CSETF_TASK_RESULT_SET_FINISHED);
            identity(task_processor.TASK_RESULT_SET);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), task_processor.$dtp_task_result_set$.getGlobalValue(), symbol_function(task_processor.VISIT_DEFSTRUCT_OBJECT_TASK_RESULT_SET_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), task_processor.$dtp_task_processor$.getGlobalValue(), symbol_function(task_processor.TASK_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(task_processor.$list89);
            def_csetf(task_processor.TPROC_NAME, task_processor._CSETF_TPROC_NAME);
            def_csetf(task_processor.TPROC_PROCESS, task_processor._CSETF_TPROC_PROCESS);
            def_csetf(task_processor.TPROC_BUSY_P, task_processor._CSETF_TPROC_BUSY_P);
            def_csetf(task_processor.TPROC_TASK_INFO, task_processor._CSETF_TPROC_TASK_INFO);
            identity(task_processor.TASK_PROCESSOR);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), task_processor.$dtp_task_processor$.getGlobalValue(), symbol_function(task_processor.VISIT_DEFSTRUCT_OBJECT_TASK_PROCESSOR_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), task_processor.$dtp_task_process_pool$.getGlobalValue(), symbol_function(task_processor.TASK_PROCESS_POOL_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(task_processor.$list116);
            def_csetf(task_processor.TPOOL_LOCK, task_processor._CSETF_TPOOL_LOCK);
            def_csetf(task_processor.TPOOL_REQUEST_QUEUE, task_processor._CSETF_TPOOL_REQUEST_QUEUE);
            def_csetf(task_processor.TPOOL_REQUEST_SEMAPHORE, task_processor._CSETF_TPOOL_REQUEST_SEMAPHORE);
            def_csetf(task_processor.TPOOL_PROCESSORS, task_processor._CSETF_TPOOL_PROCESSORS);
            def_csetf(task_processor.TPOOL_BACKGROUND_MSGS, task_processor._CSETF_TPOOL_BACKGROUND_MSGS);
            def_csetf(task_processor.TPOOL_PROCESS_NAME_PREFIX, task_processor._CSETF_TPOOL_PROCESS_NAME_PREFIX);
            def_csetf(task_processor.TPOOL_MIN_NBR_OF_TASK_PROCESSORS, task_processor._CSETF_TPOOL_MIN_NBR_OF_TASK_PROCESSORS);
            def_csetf(task_processor.TPOOL_MAX_NBR_OF_TASK_PROCESSORS, task_processor._CSETF_TPOOL_MAX_NBR_OF_TASK_PROCESSORS);
            identity(task_processor.TASK_PROCESS_POOL);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), task_processor.$dtp_task_process_pool$.getGlobalValue(), symbol_function(task_processor.VISIT_DEFSTRUCT_OBJECT_TASK_PROCESS_POOL_METHOD));
            register_external_symbol(task_processor.SET_TPOOL_BACKGROUND_MSG_PATH);
            declare_defglobal(task_processor.$tpool_background_msg_lock$);
            register_external_symbol(task_processor.PUSH_TPOOL_BACKGROUND_MSG);
            register_external_symbol(task_processor.FLUSH_TPOOL_BACKGROUND_MSGS);
            register_external_symbol(task_processor.START_TASK_PROCESSOR_LOGGING_TO_FILE);
            register_external_symbol(task_processor.END_TASK_PROCESSOR_LOGGING_TO_FILE);
            register_external_symbol(task_processor.SAVE_UNLOGGED_TASK_PROCESSOR_MESSAGES_TO_FILE);
            register_cyc_api_macro(task_processor.CATCH_TASK_PROCESSOR_TERMINATION, task_processor.$list193, task_processor.$str197$Allow_for_the_API_calling_side_to);
            register_cyc_api_macro(task_processor.CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY, task_processor.$list200, task_processor.$str201$Allow_for_the_API_calling_side_to);
            register_external_symbol(task_processor.ENSURE_TASK_PROCESSORS_KILLED);
            register_external_symbol(task_processor.WITH_LONG_RUNNING_TASK_PROCESS);
            register_cyc_api_function(task_processor.SHOW_API_TASK_PROCESSORS, NIL, task_processor.$str281$Provides_a_convenient_alias_for_D, NIL, NIL);
            register_cyc_api_function(task_processor.DISPLAY_API_TASK_PROCESSORS, NIL, task_processor.$str283$, NIL, NIL);
            register_api_predefined_function(task_processor.INITIALIZE_API_TASK_PROCESSORS);
            register_api_predefined_function(task_processor.HALT_API_TASK_PROCESSORS);
            register_api_predefined_function(task_processor.RESTART_API_TASK_PROCESSORS);
            register_api_predefined_function(task_processor.SHOW_API_TP_MSGS);
            register_api_predefined_function(task_processor.API_TASK_PROCESSOR_REQUEST);
            register_api_predefined_function(task_processor.WITH_IMMEDIATE_EXECUTION);
            if (NIL == task_processor.$task_processor_eval_fn_dict$.getGlobalValue()) {
                task_processor.$task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            }
            dictionary.dictionary_enter(task_processor.$task_processor_eval_fn_dict$.getGlobalValue(), $API, symbol_function(task_processor.CYC_API_EVAL));
            register_external_symbol(task_processor.SET_JAVA_API_LEASE_ACTIVITY_DISPLAY);
            if (NIL == task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
                task_processor.$task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            }
            dictionary.dictionary_enter(task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue(), $API, symbol_function(task_processor.DISPATCH_API_TASK_PROCESSOR_RESPONSE));
            if (NIL == task_processor.$task_processor_eval_fn_dict$.getGlobalValue()) {
                task_processor.$task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            }
            dictionary.dictionary_enter(task_processor.$task_processor_eval_fn_dict$.getGlobalValue(), $BG, symbol_function(task_processor.CYC_API_EVAL));
            if (NIL == task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
                task_processor.$task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            }
            dictionary.dictionary_enter(task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue(), $BG, symbol_function(task_processor.DISPATCH_BG_TASK_PROCESSOR_RESPONSE));
            declare_defglobal(task_processor.$task_processor_console_id$);
            if (NIL == task_processor.$task_processor_eval_fn_dict$.getGlobalValue()) {
                task_processor.$task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            }
            dictionary.dictionary_enter(task_processor.$task_processor_eval_fn_dict$.getGlobalValue(), $CONSOLE, symbol_function(task_processor.CYC_API_EVAL));
            if (NIL == task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
                task_processor.$task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            }
            dictionary.dictionary_enter(task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue(), $CONSOLE, symbol_function(task_processor.DISPATCH_CONSOLE_TASK_PROCESSOR_RESPONSE));
            sunit_external.define_test_category(task_processor.$str315$Task_Processor_Module_Supercatego, UNPROVIDED);
            sunit_external.define_test_category(task_processor.$$$Task_Processor_Subcategory, list(task_processor.$str315$Task_Processor_Module_Supercatego));
            sunit_external.define_test_suite(task_processor.$str317$Task_Processor_Testing_Suite, list(task_processor.$str315$Task_Processor_Module_Supercatego), UNPROVIDED, UNPROVIDED);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_macro(CATCH_TASK_PROCESSOR_TERMINATION, $list_alt173, $str_alt177$Allow_for_the_API_calling_side_to);
            register_cyc_api_macro(CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY, $list_alt180, $str_alt181$Allow_for_the_API_calling_side_to);
            register_cyc_api_function(SHOW_API_TASK_PROCESSORS, NIL, $str_alt253$Provides_a_convenient_alias_for_D, NIL, NIL);
            register_cyc_api_function(DISPLAY_API_TASK_PROCESSORS, NIL, $str_alt255$, NIL, NIL);
            sunit_external.define_test_category($str_alt286$Task_Processor_Module_Supercatego, UNPROVIDED);
            sunit_external.define_test_category($$$Task_Processor_Subcategory, list($str_alt286$Task_Processor_Module_Supercatego));
            sunit_external.define_test_suite($str_alt288$Task_Processor_Testing_Suite, list($str_alt286$Task_Processor_Module_Supercatego), UNPROVIDED, UNPROVIDED);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(VERBOSITY_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(VERBOSITY_TEST_CASE);
            classes.subloop_new_class(VERBOSITY_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt291);
            classes.class_set_implements_slot_listeners(VERBOSITY_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(VERBOSITY_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_VERBOSITY_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(VERBOSITY_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_VERBOSITY_TEST_CASE_INSTANCE);
            com.cyc.cycjava.cycl.task_processor.subloop_reserved_initialize_verbosity_test_case_class(VERBOSITY_TEST_CASE);
            sunit_macros.define_test_case_postamble(VERBOSITY_TEST_CASE, $str_alt307$task_processor, $$$cycl, $list_alt309);
            sunit_macros.def_test_method_register(VERBOSITY_TEST_CASE, TEST);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(EVAL_WITH_BINDINGS_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(EVAL_WITH_BINDINGS_TEST_CASE);
            classes.subloop_new_class(EVAL_WITH_BINDINGS_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt291);
            classes.class_set_implements_slot_listeners(EVAL_WITH_BINDINGS_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(EVAL_WITH_BINDINGS_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_EVAL_WITH_BINDINGS_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(EVAL_WITH_BINDINGS_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_EVAL_WITH_BINDINGS_TEST_CASE_INSTANCE);
            com.cyc.cycjava.cycl.task_processor.subloop_reserved_initialize_eval_with_bindings_test_case_class(EVAL_WITH_BINDINGS_TEST_CASE);
            sunit_macros.define_test_case_postamble(EVAL_WITH_BINDINGS_TEST_CASE, $str_alt307$task_processor, $$$cycl, $list_alt309);
            sunit_macros.def_test_method_register(EVAL_WITH_BINDINGS_TEST_CASE, TEST);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TASK_INFO_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(TASK_INFO_TEST_CASE);
            classes.subloop_new_class(TASK_INFO_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt291);
            classes.class_set_implements_slot_listeners(TASK_INFO_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(TASK_INFO_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_TASK_INFO_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(TASK_INFO_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_TASK_INFO_TEST_CASE_INSTANCE);
            com.cyc.cycjava.cycl.task_processor.subloop_reserved_initialize_task_info_test_case_class(TASK_INFO_TEST_CASE);
            sunit_macros.define_test_case_postamble(TASK_INFO_TEST_CASE, $str_alt307$task_processor, $$$cycl, $list_alt309);
            sunit_macros.def_test_method_register(TASK_INFO_TEST_CASE, TEST);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TASK_PROCESSOR_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(TASK_PROCESSOR_TEST_CASE);
            classes.subloop_new_class(TASK_PROCESSOR_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt318);
            classes.class_set_implements_slot_listeners(TASK_PROCESSOR_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(TASK_PROCESSOR_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_TASK_PROCESSOR_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(TASK_PROCESSOR_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_TASK_PROCESSOR_TEST_CASE_INSTANCE);
            com.cyc.cycjava.cycl.task_processor.subloop_reserved_initialize_task_processor_test_case_class(TASK_PROCESSOR_TEST_CASE);
            sunit_macros.define_test_case_postamble(TASK_PROCESSOR_TEST_CASE, $str_alt307$task_processor, $$$cycl, $list_alt309);
            sunit_macros.def_test_method_register(TASK_PROCESSOR_TEST_CASE, TEST1);
            sunit_macros.def_test_method_register(TASK_PROCESSOR_TEST_CASE, TEST2);
            sunit_macros.def_test_method_register(TASK_PROCESSOR_TEST_CASE, TEST3);
        }
        return NIL;
    }

    public static SubLObject setup_task_processor_file_Previous() {
        register_external_symbol(task_processor.SET_TASK_PROCESSOR_VERBOSITY);
        register_method($print_object_method_table$.getGlobalValue(), task_processor.$dtp_task_info$.getGlobalValue(), symbol_function(task_processor.TASK_INFO_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(task_processor.$list11);
        def_csetf(task_processor.TI_TYPE, task_processor._CSETF_TI_TYPE);
        def_csetf(task_processor.TI_ID, task_processor._CSETF_TI_ID);
        def_csetf(task_processor.TI_PRIORITY, task_processor._CSETF_TI_PRIORITY);
        def_csetf(task_processor.TI_REQUESTOR, task_processor._CSETF_TI_REQUESTOR);
        def_csetf(task_processor.TI_GIVEBACK_INFO, task_processor._CSETF_TI_GIVEBACK_INFO);
        def_csetf(task_processor.TI_BINDINGS, task_processor._CSETF_TI_BINDINGS);
        def_csetf(task_processor.TI_REQUEST, task_processor._CSETF_TI_REQUEST);
        def_csetf(task_processor.TI_RESPONSE, task_processor._CSETF_TI_RESPONSE);
        def_csetf(task_processor.TI_ERROR_MESSAGE, task_processor._CSETF_TI_ERROR_MESSAGE);
        def_csetf(task_processor.TI_TASK_PROCESSOR_NAME, task_processor._CSETF_TI_TASK_PROCESSOR_NAME);
        identity(task_processor.TASK_INFO);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), task_processor.$dtp_task_info$.getGlobalValue(), symbol_function(task_processor.VISIT_DEFSTRUCT_OBJECT_TASK_INFO_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), task_processor.$dtp_task_result_set$.getGlobalValue(), symbol_function(task_processor.TASK_RESULT_SET_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(task_processor.$list68);
        def_csetf(task_processor.TASK_RESULT_SET_RESULT, task_processor._CSETF_TASK_RESULT_SET_RESULT);
        def_csetf(task_processor.TASK_RESULT_SET_TASK_INFO, task_processor._CSETF_TASK_RESULT_SET_TASK_INFO);
        def_csetf(task_processor.TASK_RESULT_SET_FINISHED, task_processor._CSETF_TASK_RESULT_SET_FINISHED);
        identity(task_processor.TASK_RESULT_SET);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), task_processor.$dtp_task_result_set$.getGlobalValue(), symbol_function(task_processor.VISIT_DEFSTRUCT_OBJECT_TASK_RESULT_SET_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), task_processor.$dtp_task_processor$.getGlobalValue(), symbol_function(task_processor.TASK_PROCESSOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(task_processor.$list89);
        def_csetf(task_processor.TPROC_NAME, task_processor._CSETF_TPROC_NAME);
        def_csetf(task_processor.TPROC_PROCESS, task_processor._CSETF_TPROC_PROCESS);
        def_csetf(task_processor.TPROC_BUSY_P, task_processor._CSETF_TPROC_BUSY_P);
        def_csetf(task_processor.TPROC_TASK_INFO, task_processor._CSETF_TPROC_TASK_INFO);
        identity(task_processor.TASK_PROCESSOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), task_processor.$dtp_task_processor$.getGlobalValue(), symbol_function(task_processor.VISIT_DEFSTRUCT_OBJECT_TASK_PROCESSOR_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), task_processor.$dtp_task_process_pool$.getGlobalValue(), symbol_function(task_processor.TASK_PROCESS_POOL_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(task_processor.$list116);
        def_csetf(task_processor.TPOOL_LOCK, task_processor._CSETF_TPOOL_LOCK);
        def_csetf(task_processor.TPOOL_REQUEST_QUEUE, task_processor._CSETF_TPOOL_REQUEST_QUEUE);
        def_csetf(task_processor.TPOOL_REQUEST_SEMAPHORE, task_processor._CSETF_TPOOL_REQUEST_SEMAPHORE);
        def_csetf(task_processor.TPOOL_PROCESSORS, task_processor._CSETF_TPOOL_PROCESSORS);
        def_csetf(task_processor.TPOOL_BACKGROUND_MSGS, task_processor._CSETF_TPOOL_BACKGROUND_MSGS);
        def_csetf(task_processor.TPOOL_PROCESS_NAME_PREFIX, task_processor._CSETF_TPOOL_PROCESS_NAME_PREFIX);
        def_csetf(task_processor.TPOOL_MIN_NBR_OF_TASK_PROCESSORS, task_processor._CSETF_TPOOL_MIN_NBR_OF_TASK_PROCESSORS);
        def_csetf(task_processor.TPOOL_MAX_NBR_OF_TASK_PROCESSORS, task_processor._CSETF_TPOOL_MAX_NBR_OF_TASK_PROCESSORS);
        identity(task_processor.TASK_PROCESS_POOL);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), task_processor.$dtp_task_process_pool$.getGlobalValue(), symbol_function(task_processor.VISIT_DEFSTRUCT_OBJECT_TASK_PROCESS_POOL_METHOD));
        register_external_symbol(task_processor.SET_TPOOL_BACKGROUND_MSG_PATH);
        declare_defglobal(task_processor.$tpool_background_msg_lock$);
        register_external_symbol(task_processor.PUSH_TPOOL_BACKGROUND_MSG);
        register_external_symbol(task_processor.FLUSH_TPOOL_BACKGROUND_MSGS);
        register_external_symbol(task_processor.START_TASK_PROCESSOR_LOGGING_TO_FILE);
        register_external_symbol(task_processor.END_TASK_PROCESSOR_LOGGING_TO_FILE);
        register_external_symbol(task_processor.SAVE_UNLOGGED_TASK_PROCESSOR_MESSAGES_TO_FILE);
        register_cyc_api_macro(task_processor.CATCH_TASK_PROCESSOR_TERMINATION, task_processor.$list193, task_processor.$str197$Allow_for_the_API_calling_side_to);
        register_cyc_api_macro(task_processor.CATCH_TASK_PROCESSOR_TERMINATION_QUIETLY, task_processor.$list200, task_processor.$str201$Allow_for_the_API_calling_side_to);
        register_external_symbol(task_processor.ENSURE_TASK_PROCESSORS_KILLED);
        register_external_symbol(task_processor.WITH_LONG_RUNNING_TASK_PROCESS);
        register_cyc_api_function(task_processor.SHOW_API_TASK_PROCESSORS, NIL, task_processor.$str281$Provides_a_convenient_alias_for_D, NIL, NIL);
        register_cyc_api_function(task_processor.DISPLAY_API_TASK_PROCESSORS, NIL, task_processor.$str283$, NIL, NIL);
        register_api_predefined_function(task_processor.INITIALIZE_API_TASK_PROCESSORS);
        register_api_predefined_function(task_processor.HALT_API_TASK_PROCESSORS);
        register_api_predefined_function(task_processor.RESTART_API_TASK_PROCESSORS);
        register_api_predefined_function(task_processor.SHOW_API_TP_MSGS);
        register_api_predefined_function(task_processor.API_TASK_PROCESSOR_REQUEST);
        register_api_predefined_function(task_processor.WITH_IMMEDIATE_EXECUTION);
        if (NIL == task_processor.$task_processor_eval_fn_dict$.getGlobalValue()) {
            task_processor.$task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter(task_processor.$task_processor_eval_fn_dict$.getGlobalValue(), $API, symbol_function(task_processor.CYC_API_EVAL));
        register_external_symbol(task_processor.SET_JAVA_API_LEASE_ACTIVITY_DISPLAY);
        if (NIL == task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
            task_processor.$task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter(task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue(), $API, symbol_function(task_processor.DISPATCH_API_TASK_PROCESSOR_RESPONSE));
        if (NIL == task_processor.$task_processor_eval_fn_dict$.getGlobalValue()) {
            task_processor.$task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter(task_processor.$task_processor_eval_fn_dict$.getGlobalValue(), $BG, symbol_function(task_processor.CYC_API_EVAL));
        if (NIL == task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
            task_processor.$task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter(task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue(), $BG, symbol_function(task_processor.DISPATCH_BG_TASK_PROCESSOR_RESPONSE));
        declare_defglobal(task_processor.$task_processor_console_id$);
        if (NIL == task_processor.$task_processor_eval_fn_dict$.getGlobalValue()) {
            task_processor.$task_processor_eval_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter(task_processor.$task_processor_eval_fn_dict$.getGlobalValue(), $CONSOLE, symbol_function(task_processor.CYC_API_EVAL));
        if (NIL == task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue()) {
            task_processor.$task_processor_response_dispatch_fn_dict$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary.dictionary_enter(task_processor.$task_processor_response_dispatch_fn_dict$.getGlobalValue(), $CONSOLE, symbol_function(task_processor.DISPATCH_CONSOLE_TASK_PROCESSOR_RESPONSE));
        sunit_external.define_test_category(task_processor.$str315$Task_Processor_Module_Supercatego, UNPROVIDED);
        sunit_external.define_test_category(task_processor.$$$Task_Processor_Subcategory, list(task_processor.$str315$Task_Processor_Module_Supercatego));
        sunit_external.define_test_suite(task_processor.$str317$Task_Processor_Testing_Suite, list(task_processor.$str315$Task_Processor_Module_Supercatego), UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    static private final SubLString $str_alt2$Invalid_verbosity__must_be_0___9_ = makeString("Invalid verbosity, must be 0 - 9 but was ~S~%");

    static private final SubLList $list_alt5 = list(new SubLObject[]{ makeSymbol("TYPE"), makeSymbol("ID"), makeSymbol("PRIORITY"), makeSymbol("REQUESTOR"), makeSymbol("GIVEBACK-INFO"), makeSymbol("BINDINGS"), makeSymbol("REQUEST"), makeSymbol("RESPONSE"), makeSymbol("ERROR-MESSAGE"), makeSymbol("TASK-PROCESSOR-NAME") });

    static private final SubLList $list_alt6 = list(new SubLObject[]{ $TYPE, makeKeyword("ID"), makeKeyword("PRIORITY"), makeKeyword("REQUESTOR"), makeKeyword("GIVEBACK-INFO"), makeKeyword("BINDINGS"), makeKeyword("REQUEST"), makeKeyword("RESPONSE"), makeKeyword("ERROR-MESSAGE"), makeKeyword("TASK-PROCESSOR-NAME") });

    static private final SubLList $list_alt7 = list(new SubLObject[]{ makeSymbol("TI-TYPE"), makeSymbol("TI-ID"), makeSymbol("TI-PRIORITY"), makeSymbol("TI-REQUESTOR"), makeSymbol("TI-GIVEBACK-INFO"), makeSymbol("TI-BINDINGS"), makeSymbol("TI-REQUEST"), makeSymbol("TI-RESPONSE"), makeSymbol("TI-ERROR-MESSAGE"), makeSymbol("TI-TASK-PROCESSOR-NAME") });

    static private final SubLList $list_alt8 = list(new SubLObject[]{ makeSymbol("_CSETF-TI-TYPE"), makeSymbol("_CSETF-TI-ID"), makeSymbol("_CSETF-TI-PRIORITY"), makeSymbol("_CSETF-TI-REQUESTOR"), makeSymbol("_CSETF-TI-GIVEBACK-INFO"), makeSymbol("_CSETF-TI-BINDINGS"), makeSymbol("_CSETF-TI-REQUEST"), makeSymbol("_CSETF-TI-RESPONSE"), makeSymbol("_CSETF-TI-ERROR-MESSAGE"), makeSymbol("_CSETF-TI-TASK-PROCESSOR-NAME") });

    @Override
    public void declareFunctions() {
        task_processor.declare_task_processor_file();
    }

    @Override
    public void initializeVariables() {
        task_processor.init_task_processor_file();
    }

    @Override
    public void runTopLevelForms() {
        task_processor.setup_task_processor_file();
    }

    static {
    }

    static private final SubLString $str_alt41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt45$__ = makeString("#<");

    static private final SubLString $str_alt47$type_ = makeString("type=");

    static private final SubLString $str_alt48$_id_ = makeString(" id=");

    static private final SubLString $str_alt49$_priority_ = makeString(" priority=");

    static private final SubLString $str_alt50$_requestor_ = makeString(" requestor=");

    static private final SubLString $str_alt51$_giveback_info_ = makeString(" giveback-info=");

    static private final SubLString $str_alt52$_bindings_ = makeString(" bindings=");

    static private final SubLString $str_alt53$_request_ = makeString(" request=");

    static private final SubLString $str_alt54$_response_ = makeString(" response=");

    static private final SubLString $str_alt55$_error_message_ = makeString(" error-message=");

    static private final SubLList $list_alt59 = list(makeSymbol("RESULT"), makeSymbol("TASK-INFO"), makeSymbol("FINISHED"));

    static private final SubLList $list_alt60 = list(makeKeyword("RESULT"), makeKeyword("TASK-INFO"), makeKeyword("FINISHED"));

    static private final SubLList $list_alt61 = list(makeSymbol("TASK-RESULT-SET-RESULT"), makeSymbol("TASK-RESULT-SET-TASK-INFO"), makeSymbol("TASK-RESULT-SET-FINISHED"));

    static private final SubLList $list_alt62 = list(makeSymbol("_CSETF-TASK-RESULT-SET-RESULT"), makeSymbol("_CSETF-TASK-RESULT-SET-TASK-INFO"), makeSymbol("_CSETF-TASK-RESULT-SET-FINISHED"));

    static private final SubLList $list_alt77 = list(makeSymbol("NAME"), makeSymbol("PROCESS"), makeSymbol("BUSY-P"), makeSymbol("TASK-INFO"));

    static private final SubLList $list_alt78 = list($NAME, makeKeyword("PROCESS"), makeKeyword("BUSY-P"), makeKeyword("TASK-INFO"));

    static private final SubLList $list_alt79 = list(makeSymbol("TPROC-NAME"), makeSymbol("TPROC-PROCESS"), makeSymbol("TPROC-BUSY-P"), makeSymbol("TPROC-TASK-INFO"));

    static private final SubLList $list_alt80 = list(makeSymbol("_CSETF-TPROC-NAME"), makeSymbol("_CSETF-TPROC-PROCESS"), makeSymbol("_CSETF-TPROC-BUSY-P"), makeSymbol("_CSETF-TPROC-TASK-INFO"));

    public static final class $task_info_p$UnaryFunction extends UnaryFunction {
        public $task_info_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-INFO-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return task_processor.task_info_p(arg1);
        }
    }

    static private final SubLString $str_alt94$name_ = makeString("name=");

    static private final SubLString $str_alt95$_process_ = makeString(" process=");

    static private final SubLString $str_alt96$_whostate_ = makeString(" whostate=");

    static private final SubLString $str_alt97$_busy_p_ = makeString(" busy-p=");

    static private final SubLString $str_alt98$_last_response_ = makeString(" last response=");

    static private final SubLList $list_alt101 = list(makeSymbol("LOCK"), makeSymbol("REQUEST-QUEUE"), makeSymbol("REQUEST-SEMAPHORE"), makeSymbol("PROCESSORS"), makeSymbol("BACKGROUND-MSGS"), makeSymbol("PROCESS-NAME-PREFIX"), makeSymbol("MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("MAX-NBR-OF-TASK-PROCESSORS"));

    static private final SubLList $list_alt102 = list($LOCK, makeKeyword("REQUEST-QUEUE"), makeKeyword("REQUEST-SEMAPHORE"), makeKeyword("PROCESSORS"), makeKeyword("BACKGROUND-MSGS"), makeKeyword("PROCESS-NAME-PREFIX"), makeKeyword("MIN-NBR-OF-TASK-PROCESSORS"), makeKeyword("MAX-NBR-OF-TASK-PROCESSORS"));

    static private final SubLList $list_alt103 = list(makeSymbol("TPOOL-LOCK"), makeSymbol("TPOOL-REQUEST-QUEUE"), makeSymbol("TPOOL-REQUEST-SEMAPHORE"), makeSymbol("TPOOL-PROCESSORS"), makeSymbol("TPOOL-BACKGROUND-MSGS"), makeSymbol("TPOOL-PROCESS-NAME-PREFIX"), makeSymbol("TPOOL-MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("TPOOL-MAX-NBR-OF-TASK-PROCESSORS"));

    static private final SubLList $list_alt104 = list(makeSymbol("_CSETF-TPOOL-LOCK"), makeSymbol("_CSETF-TPOOL-REQUEST-QUEUE"), makeSymbol("_CSETF-TPOOL-REQUEST-SEMAPHORE"), makeSymbol("_CSETF-TPOOL-PROCESSORS"), makeSymbol("_CSETF-TPOOL-BACKGROUND-MSGS"), makeSymbol("_CSETF-TPOOL-PROCESS-NAME-PREFIX"), makeSymbol("_CSETF-TPOOL-MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("_CSETF-TPOOL-MAX-NBR-OF-TASK-PROCESSORS"));

    public static final class $task_result_set_p$UnaryFunction extends UnaryFunction {
        public $task_result_set_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-RESULT-SET-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return task_processor.task_result_set_p(arg1);
        }
    }

    public static final class $task_processor_p$UnaryFunction extends UnaryFunction {
        public $task_processor_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-PROCESSOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return task_processor.task_processor_p(arg1);
        }
    }

    static private final SubLString $str_alt131$_request_queue_ = makeString(" request-queue=");

    static private final SubLString $str_alt132$_processors_ = makeString(" processors=");

    static private final SubLString $str_alt133$_process_name_prefix_ = makeString(" process name prefix=");

    static private final SubLString $str_alt134$_min_processors_ = makeString(" min processors=");

    static private final SubLString $str_alt135$_max_processors_ = makeString(" max processors=");

    static private final SubLString $str_alt136$There_are_no_task_processors_ = makeString("There are no task processors.");

    static private final SubLString $str_alt137$_S__ = makeString("~S~%");

    static private final SubLString $str_alt138$request__S__ = makeString("request=~S~%");

    static private final SubLString $str_alt144$tpool_background_msg_lock = makeString("tpool-background-msg-lock");

    static private final SubLString $str_alt145$_A_is_not_a_valid_file_specificat = makeString("~A is not a valid file specification");

    static private final SubLString $str_alt152$_ = makeString("[");

    static private final SubLString $str_alt153$_ = makeString("]");

    static private final SubLString $str_alt154$__ = makeString("  ");

    static private final SubLString $str_alt155$_ = makeString(" ");

    static private final SubLString $str_alt171$API_error__Unknown_active_task_pr = makeString("API error: Unknown active task process termination reason ~A");

    static private final SubLList $list_alt173 = list(makeSymbol("ANS-VAR"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt177$Allow_for_the_API_calling_side_to = makeString("Allow for the API calling side to catch the termination of the task processor.\n   The client must wrap the api-request form with catch-task-processor-termination.");

    static private final SubLSymbol $sym178$ANS_VAR = makeUninternedSymbol("ANS-VAR");

    static private final SubLList $list_alt180 = list(makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt181$Allow_for_the_API_calling_side_to = makeString("Allow for the API calling side to catch the termination of the task processor\n   without looking at the termination reason.\n   The client must wrap the api-request form with catch-task-processor-termination-quietly.");

    public static final class $task_process_pool_p$UnaryFunction extends UnaryFunction {
        public $task_process_pool_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-PROCESS-POOL-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return task_processor.task_process_pool_p(arg1);
        }
    }

    static private final SubLString $str_alt184$Invalid_task_processor = makeString("Invalid task-processor");

    static private final SubLString $str_alt185$Invalid_task_process_pool = makeString("Invalid task-process-pool");

    static private final SubLString $str_alt186$Task_Info__S__ = makeString("Task Info ~S~%");

    static private final SubLString $str_alt188$Response__S__ = makeString("Response ~S~%");

    static private final SubLString $str_alt189$Error_message__S__ = makeString("Error-message ~S~%");

    static private final SubLString $str_alt190$Posting_partial_results__A_at__A = makeString("Posting partial results ~A at ~A");

    static private final SubLString $str_alt191$Function_only_valid_from_within_a = makeString("Function only valid from within a Task Processor, but running inside ~A.");

    static private final SubLString $str_alt193$Task_processor_ = makeString("Task processor ");

    static private final SubLString $str_alt194$Initializing_task_processors__ = makeString("Initializing task processors~%");

    static private final SubLString $str_alt195$_alock = makeString("~alock");

    static private final SubLString $str_alt196$task_pool_request_semaphore = makeString("task-pool-request-semaphore");

    static private final SubLString $str_alt197$_a_s = makeString("~a~s");

    static private final SubLString $str_alt201$_processor_ = makeString(" processor ");

    static private final SubLString $str_alt202$_Killing__A___ = makeString(" Killing ~A.~%");

    static private final SubLString $str_alt203$Allocating_a_new_task_processor__ = makeString("Allocating a new task processor~%");

    static private final SubLString $str_alt204$Awakening_first_available_task_pr = makeString("Awakening first available task processor~%");

    static private final SubLString $str_alt205$Task_processors_are_not_initializ = makeString("Task processors are not initialized.");

    static private final SubLString $str_alt206$__Error__cannot_queue_task_reques = makeString("~%Error: cannot queue task request for ~%~S~%");

    static private final SubLList $list_alt207 = list(makeSymbol("TYPE"), makeSymbol("MIN-NBR-OF-TASK-PROCESSORS"), makeSymbol("MAX-NBR-OF-TASK-PROCESSORS"));

    static private final SubLString $str_alt208$_ = makeString("*");

    static private final SubLString $str_alt209$_TASK_PROCESS_POOL_ = makeString("-TASK-PROCESS-POOL*");

    static private final SubLString $str_alt210$_TASK_PROCESS_POOL_LOCK_ = makeString("-TASK-PROCESS-POOL-LOCK*");

    static private final SubLList $list_alt212 = list(NIL, makeString("Task process pool for requests."));

    static private final SubLList $list_alt214 = list(list(makeSymbol("MAKE-LOCK"), makeString("task processor initialization lock")), makeString("Task process pool lock to guarantee only a single instance is initialized."));

    static private final SubLString $str_alt216$_TASK_PROCESSORS_INITIALIZED_P = makeString("-TASK-PROCESSORS-INITIALIZED-P");

    static private final SubLString $str_alt217$Return_T_when_there_are_task_proc = makeString("Return T when there are task processors.");

    static private final SubLString $str_alt220$INITIALIZE_ = makeString("INITIALIZE-");

    static private final SubLString $str_alt221$_TASK_PROCESSORS = makeString("-TASK-PROCESSORS");

    static private final SubLString $str_alt222$Initialize_the_task_processor_poo = makeString("Initialize the task processor pool for requests.");

    static private final SubLList $list_alt225 = list(list(makeSymbol("ERROR"), makeString("Illegal attempt to reinitialize processor pool without first halting it.")));

    static private final SubLList $list_alt228 = list(makeString(" processor "));

    static private final SubLList $list_alt229 = list(list(RET, NIL));

    static private final SubLString $str_alt230$HALT_ = makeString("HALT-");

    static private final SubLString $str_alt231$Halt_the_task_processors_ = makeString("Halt the task processors.");

    static private final SubLList $list_alt233 = list(NIL);

    static private final SubLString $str_alt234$SHOW_ = makeString("SHOW-");

    static private final SubLString $str_alt235$_TP_MSGS = makeString("-TP-MSGS");

    static private final SubLString $str_alt236$Show_and_reset_the_task_processor = makeString("Show and reset the task processor background messages for the\n          task-process-pool.");

    static private final SubLList $list_alt238 = list(makeSymbol("TYPE"), makeSymbol("EVAL-FN"), makeSymbol("ARGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt239$_TASK_PROCESSOR_REQUEST = makeString("-TASK-PROCESSOR-REQUEST");

    static private final SubLList $list_alt240 = list(makeSymbol("PUNLESS"), makeSymbol("*TASK-PROCESSOR-EVAL-FN-DICT*"), list(makeSymbol("CSETQ"), makeSymbol("*TASK-PROCESSOR-EVAL-FN-DICT*"), list(makeSymbol("NEW-DICTIONARY"))));

    static private final SubLList $list_alt243 = list(makeSymbol("TYPE"), makeSymbol("ARGS"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt244$DISPATCH_ = makeString("DISPATCH-");

    static private final SubLString $str_alt245$_TASK_PROCESSOR_RESPONSE = makeString("-TASK-PROCESSOR-RESPONSE");

    static private final SubLList $list_alt246 = list(makeSymbol("PUNLESS"), makeSymbol("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*"), list(makeSymbol("CSETQ"), makeSymbol("*TASK-PROCESSOR-RESPONSE-DISPATCH-FN-DICT*"), list(makeSymbol("NEW-DICTIONARY"))));

    static private final SubLString $str_alt249$task_processor_initialization_loc = makeString("task processor initialization lock");

    static private final SubLString $str_alt250$Illegal_attempt_to_reinitialize_p = makeString("Illegal attempt to reinitialize processor pool without first halting it.");

    static private final SubLString $str_alt253$Provides_a_convenient_alias_for_D = makeString("Provides a convenient alias for DISPLAY-API-TASK-PROCESSORS.");

    static private final SubLString $str_alt263$Dispatching_api_response__S__ = makeString("Dispatching api response ~S~%");

    static private final SubLString $str_alt265$Sending_api_response__S_to_socket = makeString("Sending api response ~S to socket ~S~% identified by ~A~%");

    static private final SubLString $str_alt266$Dropping_api_response__S__socket_ = makeString("Dropping api response ~S, socket ~S~% identified by ~A is not available~%");

    static private final SubLString $str_alt274$Cannot_invoke_intermediate_result = makeString("Cannot invoke intermediate results accumulator outside of a task processor.~%");

    static private final SubLString $str_alt277$dispatching_bg_response__S__ = makeString("dispatching bg response ~S~%");

    static private final SubLString $str_alt278$bg_response_dictionary__S__ = makeString("bg response dictionary ~S~%");

    static private final SubLString $str_alt283$dispatching_console_response__S__ = makeString("dispatching console response ~S~%");

    static private final SubLString $str_alt284$_A___A__ = makeString("~A  ~A~%");

    static private final SubLString $str_alt286$Task_Processor_Module_Supercatego = makeString("Task-Processor Module Supercategory");

    static private final SubLString $str_alt288$Task_Processor_Testing_Suite = makeString("Task-Processor Testing Suite");

    private static final SubLSymbol VERBOSITY_TEST_CASE = makeSymbol("VERBOSITY-TEST-CASE");

    static private final SubLList $list_alt291 = list(list(makeSymbol("P-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VERBOSITY_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERBOSITY-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VERBOSITY_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERBOSITY-TEST-CASE-INSTANCE");

    static private final SubLString $str_alt307$task_processor = makeString("task-processor");

    static private final SubLString $$$cycl = makeString("cycl");

    static private final SubLList $list_alt309 = list(makeString("Task Processor Subcategory"));

    private static final SubLSymbol EVAL_WITH_BINDINGS_TEST_CASE = makeSymbol("EVAL-WITH-BINDINGS-TEST-CASE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_EVAL_WITH_BINDINGS_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EVAL-WITH-BINDINGS-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_EVAL_WITH_BINDINGS_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EVAL-WITH-BINDINGS-TEST-CASE-INSTANCE");

    private static final SubLSymbol TASK_INFO_TEST_CASE = makeSymbol("TASK-INFO-TEST-CASE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TASK_INFO_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TASK-INFO-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TASK_INFO_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TASK-INFO-TEST-CASE-INSTANCE");

    private static final SubLSymbol TASK_PROCESSOR_TEST_CASE = makeSymbol("TASK-PROCESSOR-TEST-CASE");

    static private final SubLList $list_alt318 = list(list(makeSymbol("P-QUEUE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST1"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST2"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST3"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TASK_PROCESSOR_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TASK-PROCESSOR-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TASK_PROCESSOR_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TASK-PROCESSOR-TEST-CASE-INSTANCE");
}

/**
 * Total time: 1053 ms synthetic
 */
