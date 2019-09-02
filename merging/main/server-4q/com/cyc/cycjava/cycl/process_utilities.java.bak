/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      PROCESS-UTILITIES
 * source file: /cyc/top/cycl/process-utilities.lisp
 * created:     2019/07/03 17:37:13
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.extract_dynamic_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind_dynamic_vars;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.pointer;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.lock_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.$package$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.find_package;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$process_normal_priority$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.all_processes;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.debug_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_block;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_unblock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.process_whostate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.set_process_priority;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_lock$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.$dtp_process$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.processp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_readably$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ_to_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_default_float_format$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$read_eval$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Semaphores;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public class process_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLObject thinking_test_case_p(SubLObject thinking_test_case) {
        return classes.subloop_instanceof_class(thinking_test_case, THINKING_TEST_CASE);
    }

    public static final SubLObject subloop_reserved_initialize_thinking_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, THINKING_TEST_CASE, THINKING, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_thinking_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_thinking_test_case_thinking(SubLObject thinking_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(thinking_test_case, value, THREE_INTEGER, THINKING);
    }

    public static final SubLObject get_thinking_test_case_thinking(SubLObject thinking_test_case) {
        return classes.subloop_get_access_protected_instance_slot(thinking_test_case, THREE_INTEGER, THINKING);
    }

    // @SubL(source = "cycl/process-utilities.lisp", position = 2865)
    // public static final SubLObject task_p(SubLObject v_object) {
    // return ((v_object.getClass() == $task_native.class) ? ((SubLObject) T) : NIL);
    // }
    // 
    // public static final class $task_p$UnaryFunction extends UnaryFunction {
    // public $task_p$UnaryFunction() {
    // super(extractFunctionNamed("TASK-P"));
    // }
    // 
    // public SubLObject processItem(SubLObject arg1) {
    // return task_p(arg1);
    // }
    // }
    // 
    // @SubL(source = "cycl/process-utilities.lisp", position = 2865)
    // public static final SubLObject task_process(SubLObject v_object) {
    // checkType(v_object, $sym8$TASK_P);
    // return v_object.getField2();
    // }
    // 
    // @SubL(source = "cycl/process-utilities.lisp", position = 2865)
    // public static final SubLObject task_completed(SubLObject v_object) {
    // checkType(v_object, $sym8$TASK_P);
    // return v_object.getField3();
    // }
    // 
    // @SubL(source = "cycl/process-utilities.lisp", position = 2865)
    // public static final SubLObject _csetf_task_process(SubLObject v_object, SubLObject value) {
    // checkType(v_object, $sym8$TASK_P);
    // return v_object.setField2(value);
    // }
    // 
    // @SubL(source = "cycl/process-utilities.lisp", position = 2865)
    // public static final SubLObject _csetf_task_completed(SubLObject v_object, SubLObject value) {
    // checkType(v_object, $sym8$TASK_P);
    // return v_object.setField3(value);
    // }
    // 
    // @SubL(source = "cycl/process-utilities.lisp", position = 2865)
    // public static final SubLObject make_task(SubLObject arglist) {
    // if ((arglist == UNPROVIDED)) {
    // arglist = NIL;
    // }
    // {
    // SubLObject v_new = new $task_native();
    // SubLObject next = NIL;
    // for (next = arglist; (NIL != next); next = conses_high.cddr(next)) {
    // {
    // SubLObject current_arg = next.first();
    // SubLObject current_value = conses_high.cadr(next);
    // SubLObject pcase_var = current_arg;
    // if (pcase_var.eql($kw19$PROCESS)) {
    // _csetf_task_process(v_new, current_value);
    // } else if (pcase_var.eql($kw20$COMPLETED)) {
    // _csetf_task_completed(v_new, current_value);
    // } else {
    // Errors.error($str_alt21$Invalid_slot__S_for_construction_, current_arg);
    // }
    // }
    // }
    // return v_new;
    // }
    // }
    // 
    // @SubL(source = "cycl/process-utilities.lisp", position = 3080)
    // public static final SubLObject new_task(SubLObject name, SubLObject function, SubLObject args, SubLObject a_list) {
    // if ((args == UNPROVIDED)) {
    // args = NIL;
    // }
    // if ((a_list == UNPROVIDED)) {
    // a_list = NIL;
    // }
    // {
    // SubLObject task = make_task(UNPROVIDED);
    // SubLObject symbol_list = Mapping.mapcar(Symbols.symbol_function($sym22$SYMBOL_NAME), Mapping.mapcar(Symbols.symbol_function($sym23$CAR), a_list));
    // SubLObject value_list = Mapping.mapcar(Symbols.symbol_function($sym24$CADR), a_list);
    // subl_promotions.make_process_with_args(name, Symbols.symbol_function($sym25$NEW_TASK_INTERNAL), list(task, function, args, symbol_list, value_list));
    // return task;
    // }
    // }
    // 
    // @SubL(source = "cycl/process-utilities.lisp", position = 3409)
    // public static final SubLObject new_task_internal(SubLObject task, SubLObject function, SubLObject args, SubLObject symbol_list, SubLObject value_list) {
    // try {
    // {
    // SubLObject cprogv_var = Mapping.mapcar(Symbols.symbol_function($sym26$FIND_SYMBOL), symbol_list);
    // final ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);
    // try {
    // Dynamic.bind_dynamic_vars(cprogv_var, value_list);
    // _csetf_task_process(task, Threads.current_process());
    // Functions.apply(function, args);
    // } finally {
    // Dynamic.rebind_dynamic_vars(cprogv_var, old_values);
    // }
    // }
    // } finally {
    // {
    // SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
    // try {
    // Dynamic.bind(Threads.$is_thread_performing_cleanupP$, T);
    // _csetf_task_completed(task, T);
    // _csetf_task_process(task, NIL);
    // } finally {
    // Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
    // }
    // }
    // }
    // return NIL;
    // }
    @LispMethod(comment = "@SubL(source = \"cycl/process-utilities.lisp\", position = 2865)\npublic static final SubLObject task_p(SubLObject v_object) {\nreturn ((v_object.getClass() == $task_native.class) ? ((SubLObject) T) : NIL);\n}\npublic static final class $task_p$UnaryFunction extends UnaryFunction {\npublic $task_p$UnaryFunction() {\nsuper(extractFunctionNamed(\"TASK-P\"));\npublic SubLObject processItem(SubLObject arg1) {\nreturn task_p(arg1);\npublic static final SubLObject task_process(SubLObject v_object) {\ncheckType(v_object, $sym8$TASK_P);\nreturn v_object.getField2();\npublic static final SubLObject task_completed(SubLObject v_object) {\nreturn v_object.getField3();\npublic static final SubLObject _csetf_task_process(SubLObject v_object, SubLObject value) {\nreturn v_object.setField2(value);\npublic static final SubLObject _csetf_task_completed(SubLObject v_object, SubLObject value) {\nreturn v_object.setField3(value);\npublic static final SubLObject make_task(SubLObject arglist) {\nif ((arglist == UNPROVIDED)) {\narglist = NIL;\nSubLObject v_new = new $task_native();\nSubLObject next = NIL;\nfor (next = arglist; (NIL != next); next = conses_high.cddr(next)) {\nSubLObject current_arg = next.first();\nSubLObject current_value = conses_high.cadr(next);\nSubLObject pcase_var = current_arg;\nif (pcase_var.eql($kw19$PROCESS)) {\n_csetf_task_process(v_new, current_value);\n} else if (pcase_var.eql($kw20$COMPLETED)) {\n_csetf_task_completed(v_new, current_value);\n} else {\nErrors.error($str_alt21$Invalid_slot__S_for_construction_, current_arg);\nreturn v_new;\n@SubL(source = \"cycl/process-utilities.lisp\", position = 3080)\npublic static final SubLObject new_task(SubLObject name, SubLObject function, SubLObject args, SubLObject a_list) {\nif ((args == UNPROVIDED)) {\nargs = NIL;\nif ((a_list == UNPROVIDED)) {\na_list = NIL;\nSubLObject task = make_task(UNPROVIDED);\nSubLObject symbol_list = Mapping.mapcar(Symbols.symbol_function($sym22$SYMBOL_NAME), Mapping.mapcar(Symbols.symbol_function($sym23$CAR), a_list));\nSubLObject value_list = Mapping.mapcar(Symbols.symbol_function($sym24$CADR), a_list);\nsubl_promotions.make_process_with_args(name, Symbols.symbol_function($sym25$NEW_TASK_INTERNAL), list(task, function, args, symbol_list, value_list));\nreturn task;\n@SubL(source = \"cycl/process-utilities.lisp\", position = 3409)\npublic static final SubLObject new_task_internal(SubLObject task, SubLObject function, SubLObject args, SubLObject symbol_list, SubLObject value_list) {\ntry {\nSubLObject cprogv_var = Mapping.mapcar(Symbols.symbol_function($sym26$FIND_SYMBOL), symbol_list);\nfinal ArrayList old_values = Dynamic.extract_dynamic_values(cprogv_var);\nDynamic.bind_dynamic_vars(cprogv_var, value_list);\n_csetf_task_process(task, Threads.current_process());\nFunctions.apply(function, args);\n} finally {\nDynamic.rebind_dynamic_vars(cprogv_var, old_values);\nSubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);\nDynamic.bind(Threads.$is_thread_performing_cleanupP$, T);\n_csetf_task_completed(task, T);\n_csetf_task_process(task, NIL);\nDynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);\nreturn NIL;")
    public static final class $thinking_task_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$lock;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$thread;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$name;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$status;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$progress_message;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$progress_sofar;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$progress_total;
        }

        public SubLObject getField9() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$start_time;
        }

        public SubLObject getField10() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$finish_time;
        }

        public SubLObject getField11() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$result;
        }

        public SubLObject getField12() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$error_message;
        }

        public SubLObject getField13() {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$properties;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$lock = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$thread = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$name = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$status = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$progress_message = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$progress_sofar = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$progress_total = value;
        }

        public SubLObject setField9(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$start_time = value;
        }

        public SubLObject setField10(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$finish_time = value;
        }

        public SubLObject setField11(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$result = value;
        }

        public SubLObject setField12(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$error_message = value;
        }

        public SubLObject setField13(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.this.$properties = value;
        }

        public SubLObject $lock = Lisp.NIL;

        public SubLObject $thread = Lisp.NIL;

        public SubLObject $name = Lisp.NIL;

        public SubLObject $status = Lisp.NIL;

        public SubLObject $progress_message = Lisp.NIL;

        public SubLObject $progress_sofar = Lisp.NIL;

        public SubLObject $progress_total = Lisp.NIL;

        public SubLObject $start_time = Lisp.NIL;

        public SubLObject $finish_time = Lisp.NIL;

        public SubLObject $result = Lisp.NIL;

        public SubLObject $error_message = Lisp.NIL;

        public SubLObject $properties = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.class, THINKING_TASK, THINKING_TASK_P, $list_alt29, $list_alt30, new String[]{ "$lock", "$thread", "$name", "$status", "$progress_message", "$progress_sofar", "$progress_total", "$start_time", "$finish_time", "$result", "$error_message", "$properties" }, $list_alt31, $list_alt32, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $process_wrapper_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.this.$id;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.this.$process;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.this.$state;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.this.$lock;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.this.$plist;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.this.$id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.this.$process = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.this.$state = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.this.$lock = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.this.$plist = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $process = Lisp.NIL;

        public SubLObject $state = Lisp.NIL;

        public SubLObject $lock = Lisp.NIL;

        public SubLObject $plist = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.class, PROCESS_WRAPPER, PROCESS_WRAPPER_P, $list_alt148, $list_alt149, new String[]{ "$id", "$process", "$state", "$lock", "$plist" }, $list_alt150, $list_alt151, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final class $ipc_queue_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.process_utilities.$ipc_queue_native.this.$lock;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.process_utilities.$ipc_queue_native.this.$semaphore;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.process_utilities.$ipc_queue_native.this.$data_queue;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$ipc_queue_native.this.$lock = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$ipc_queue_native.this.$semaphore = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.process_utilities.$ipc_queue_native.this.$data_queue = value;
        }

        public SubLObject $lock = Lisp.NIL;

        public SubLObject $semaphore = Lisp.NIL;

        public SubLObject $data_queue = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.process_utilities.$ipc_queue_native.class, IPC_QUEUE, IPC_QUEUE_P, $list_alt95, $list_alt96, new String[]{ "$lock", "$semaphore", "$data_queue" }, $list_alt97, $list_alt98, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new process_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.process_utilities";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $process_form_lock$ = makeSymbol("*PROCESS-FORM-LOCK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_task$ = makeSymbol("*DTP-TASK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_thinking_task$ = makeSymbol("*DTP-THINKING-TASK*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $thinking_task$ = makeSymbol("*THINKING-TASK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ipc_queue$ = makeSymbol("*DTP-IPC-QUEUE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ipcq_debugP$ = makeSymbol("*IPCQ-DEBUG?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $ipcq_test_items$ = makeSymbol("*IPCQ-TEST-ITEMS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_ordered_ipc_queue$ = makeSymbol("*DTP-ORDERED-IPC-QUEUE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $ordered_ipcq_empty$ = makeSymbol("*ORDERED-IPCQ-EMPTY*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $ordered_ipc_current_queue_size_estimation_threshold$ = makeSymbol("*ORDERED-IPC-CURRENT-QUEUE-SIZE-ESTIMATION-THRESHOLD*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_process_wrapper$ = makeSymbol("*DTP-PROCESS-WRAPPER*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol INTERRUPT_INITIAL_PROCESS = makeSymbol("INTERRUPT-INITIAL-PROCESS");

    static private final SubLList $list1 = list(makeSymbol("DEBUG-INITIAL-PROCESS"));

    static private final SubLString $$$Idle = makeString("Idle");

    static private final SubLString $$$Sleep = makeString("Sleep");

    static private final SubLString $$$wait = makeString("wait");

    static private final SubLString $$$blocked = makeString("blocked");

    static private final SubLString $$$run = makeString("run");

    private static final SubLSymbol PROCESS_NAME = makeSymbol("PROCESS-NAME");

    private static final SubLSymbol $active_processes_at_startup$ = makeSymbol("*ACTIVE-PROCESSES-AT-STARTUP*");

    private static final SubLSymbol $process_form_map$ = makeSymbol("*PROCESS-FORM-MAP*");

    private static final SubLString $$$Process_Form = makeString("Process Form");

    private static final SubLSymbol TASK_P = makeSymbol("TASK-P");

    private static final SubLList $list15 = list(makeSymbol("PROCESS"), makeSymbol("COMPLETED"));

    private static final SubLList $list16 = list(makeKeyword("PROCESS"), makeKeyword("COMPLETED"));

    private static final SubLList $list17 = list(makeSymbol("TASK-PROCESS"), makeSymbol("TASK-COMPLETED"));

    private static final SubLList $list18 = list(makeSymbol("_CSETF-TASK-PROCESS"), makeSymbol("_CSETF-TASK-COMPLETED"));

    private static final SubLSymbol TASK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TASK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list21 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TASK-P"));

    private static final SubLSymbol TASK_PROCESS = makeSymbol("TASK-PROCESS");

    private static final SubLSymbol _CSETF_TASK_PROCESS = makeSymbol("_CSETF-TASK-PROCESS");

    private static final SubLSymbol TASK_COMPLETED = makeSymbol("TASK-COMPLETED");

    private static final SubLSymbol _CSETF_TASK_COMPLETED = makeSymbol("_CSETF-TASK-COMPLETED");

    private static final SubLString $str28$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_TASK = makeSymbol("MAKE-TASK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TASK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TASK-METHOD");

    private static final SubLSymbol NEW_TASK_INTERNAL = makeSymbol("NEW-TASK-INTERNAL");

    private static final SubLSymbol FIND_SYMBOL = makeSymbol("FIND-SYMBOL");

    private static final SubLSymbol THINKING_TASK = makeSymbol("THINKING-TASK");

    private static final SubLSymbol THINKING_TASK_P = makeSymbol("THINKING-TASK-P");

    private static final SubLList $list41 = list(new SubLObject[]{ makeSymbol("LOCK"), makeSymbol("THREAD"), makeSymbol("NAME"), makeSymbol("STATUS"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("PROGRESS-SOFAR"), makeSymbol("PROGRESS-TOTAL"), makeSymbol("START-TIME"), makeSymbol("FINISH-TIME"), makeSymbol("RESULT"), makeSymbol("ERROR-MESSAGE"), makeSymbol("PROPERTIES") });

    private static final SubLList $list42 = list(new SubLObject[]{ $LOCK, makeKeyword("THREAD"), $NAME, makeKeyword("STATUS"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("PROGRESS-SOFAR"), makeKeyword("PROGRESS-TOTAL"), makeKeyword("START-TIME"), makeKeyword("FINISH-TIME"), makeKeyword("RESULT"), makeKeyword("ERROR-MESSAGE"), makeKeyword("PROPERTIES") });

    private static final SubLList $list43 = list(new SubLObject[]{ makeSymbol("T-TASK-LOCK"), makeSymbol("T-TASK-THREAD"), makeSymbol("T-TASK-NAME"), makeSymbol("T-TASK-STATUS"), makeSymbol("T-TASK-PROGRESS-MESSAGE"), makeSymbol("T-TASK-PROGRESS-SOFAR"), makeSymbol("T-TASK-PROGRESS-TOTAL"), makeSymbol("T-TASK-START-TIME"), makeSymbol("T-TASK-FINISH-TIME"), makeSymbol("T-TASK-RESULT"), makeSymbol("T-TASK-ERROR-MESSAGE"), makeSymbol("T-TASK-PROPERTIES") });

    private static final SubLList $list44 = list(new SubLObject[]{ makeSymbol("_CSETF-T-TASK-LOCK"), makeSymbol("_CSETF-T-TASK-THREAD"), makeSymbol("_CSETF-T-TASK-NAME"), makeSymbol("_CSETF-T-TASK-STATUS"), makeSymbol("_CSETF-T-TASK-PROGRESS-MESSAGE"), makeSymbol("_CSETF-T-TASK-PROGRESS-SOFAR"), makeSymbol("_CSETF-T-TASK-PROGRESS-TOTAL"), makeSymbol("_CSETF-T-TASK-START-TIME"), makeSymbol("_CSETF-T-TASK-FINISH-TIME"), makeSymbol("_CSETF-T-TASK-RESULT"), makeSymbol("_CSETF-T-TASK-ERROR-MESSAGE"), makeSymbol("_CSETF-T-TASK-PROPERTIES") });

    private static final SubLSymbol THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list46 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("THINKING-TASK-P"));

    private static final SubLSymbol T_TASK_LOCK = makeSymbol("T-TASK-LOCK");

    private static final SubLSymbol _CSETF_T_TASK_LOCK = makeSymbol("_CSETF-T-TASK-LOCK");

    private static final SubLSymbol T_TASK_THREAD = makeSymbol("T-TASK-THREAD");

    private static final SubLSymbol _CSETF_T_TASK_THREAD = makeSymbol("_CSETF-T-TASK-THREAD");

    private static final SubLSymbol T_TASK_NAME = makeSymbol("T-TASK-NAME");

    private static final SubLSymbol _CSETF_T_TASK_NAME = makeSymbol("_CSETF-T-TASK-NAME");

    private static final SubLSymbol T_TASK_STATUS = makeSymbol("T-TASK-STATUS");

    private static final SubLSymbol _CSETF_T_TASK_STATUS = makeSymbol("_CSETF-T-TASK-STATUS");

    private static final SubLSymbol T_TASK_PROGRESS_MESSAGE = makeSymbol("T-TASK-PROGRESS-MESSAGE");

    private static final SubLSymbol _CSETF_T_TASK_PROGRESS_MESSAGE = makeSymbol("_CSETF-T-TASK-PROGRESS-MESSAGE");

    private static final SubLSymbol T_TASK_PROGRESS_SOFAR = makeSymbol("T-TASK-PROGRESS-SOFAR");

    private static final SubLSymbol _CSETF_T_TASK_PROGRESS_SOFAR = makeSymbol("_CSETF-T-TASK-PROGRESS-SOFAR");

    private static final SubLSymbol T_TASK_PROGRESS_TOTAL = makeSymbol("T-TASK-PROGRESS-TOTAL");

    private static final SubLSymbol _CSETF_T_TASK_PROGRESS_TOTAL = makeSymbol("_CSETF-T-TASK-PROGRESS-TOTAL");

    private static final SubLSymbol T_TASK_START_TIME = makeSymbol("T-TASK-START-TIME");

    private static final SubLSymbol _CSETF_T_TASK_START_TIME = makeSymbol("_CSETF-T-TASK-START-TIME");

    private static final SubLSymbol T_TASK_FINISH_TIME = makeSymbol("T-TASK-FINISH-TIME");

    private static final SubLSymbol _CSETF_T_TASK_FINISH_TIME = makeSymbol("_CSETF-T-TASK-FINISH-TIME");

    private static final SubLSymbol T_TASK_RESULT = makeSymbol("T-TASK-RESULT");

    private static final SubLSymbol _CSETF_T_TASK_RESULT = makeSymbol("_CSETF-T-TASK-RESULT");

    private static final SubLSymbol T_TASK_ERROR_MESSAGE = makeSymbol("T-TASK-ERROR-MESSAGE");

    private static final SubLSymbol _CSETF_T_TASK_ERROR_MESSAGE = makeSymbol("_CSETF-T-TASK-ERROR-MESSAGE");

    private static final SubLSymbol T_TASK_PROPERTIES = makeSymbol("T-TASK-PROPERTIES");

    private static final SubLSymbol _CSETF_T_TASK_PROPERTIES = makeSymbol("_CSETF-T-TASK-PROPERTIES");

    private static final SubLSymbol MAKE_THINKING_TASK = makeSymbol("MAKE-THINKING-TASK");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_THINKING_TASK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-THINKING-TASK-METHOD");

    private static final SubLList $list88 = list(list(makeSymbol("THINKING")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym89$LOCK = makeUninternedSymbol("LOCK");

    private static final SubLSymbol THINKING_LOCK = makeSymbol("THINKING-LOCK");

    private static final SubLSymbol THINKING_THREAD_RUN = makeSymbol("THINKING-THREAD-RUN");

    private static final SubLString $$$CYC = makeString("CYC");

    private static final SubLString $str103$Function__A_in_thread__A_terminat = makeString("Function ~A in thread ~A terminated by uncaught THROW.");

    private static final SubLSymbol IPC_QUEUE = makeSymbol("IPC-QUEUE");

    private static final SubLSymbol IPC_QUEUE_P = makeSymbol("IPC-QUEUE-P");

    private static final SubLList $list108 = list(makeSymbol("LOCK"), makeSymbol("SEMAPHORE"), makeSymbol("DATA-QUEUE"));

    private static final SubLList $list109 = list($LOCK, makeKeyword("SEMAPHORE"), makeKeyword("DATA-QUEUE"));

    private static final SubLList $list110 = list(makeSymbol("IPC-QUEUE-LOCK"), makeSymbol("IPC-QUEUE-SEMAPHORE"), makeSymbol("IPC-QUEUE-DATA-QUEUE"));

    private static final SubLList $list111 = list(makeSymbol("_CSETF-IPC-QUEUE-LOCK"), makeSymbol("_CSETF-IPC-QUEUE-SEMAPHORE"), makeSymbol("_CSETF-IPC-QUEUE-DATA-QUEUE"));

    private static final SubLSymbol IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list113 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("IPC-QUEUE-P"));

    private static final SubLSymbol IPC_QUEUE_LOCK = makeSymbol("IPC-QUEUE-LOCK");

    private static final SubLSymbol _CSETF_IPC_QUEUE_LOCK = makeSymbol("_CSETF-IPC-QUEUE-LOCK");

    private static final SubLSymbol IPC_QUEUE_SEMAPHORE = makeSymbol("IPC-QUEUE-SEMAPHORE");

    private static final SubLSymbol _CSETF_IPC_QUEUE_SEMAPHORE = makeSymbol("_CSETF-IPC-QUEUE-SEMAPHORE");

    private static final SubLSymbol IPC_QUEUE_DATA_QUEUE = makeSymbol("IPC-QUEUE-DATA-QUEUE");

    private static final SubLSymbol _CSETF_IPC_QUEUE_DATA_QUEUE = makeSymbol("_CSETF-IPC-QUEUE-DATA-QUEUE");

    private static final SubLSymbol MAKE_IPC_QUEUE = makeSymbol("MAKE-IPC-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_IPC_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-IPC-QUEUE-METHOD");

    private static final SubLString $$$Lock_for_Queue_ = makeString("Lock for Queue ");

    private static final SubLString $str125$Waiting_to_enqueue__A = makeString("Waiting to enqueue ~A");

    private static final SubLString $str126$Enqueuing__A = makeString("Enqueuing ~A");

    private static final SubLString $str127$Enqueued__A = makeString("Enqueued ~A");

    private static final SubLString $str128$Queue_size___S = makeString("Queue size: ~S");

    private static final SubLString $str129$Waiting_for_dequeue_semaphore_ = makeString("Waiting for dequeue semaphore.");

    private static final SubLString $str130$Waiting_for_Queue_lock_to_dequeue = makeString("Waiting for Queue lock to dequeue.");

    private static final SubLString $str131$Dequeued__A = makeString("Dequeued ~A");

    private static final SubLString $str132$Unknown_error_ = makeString("Unknown error.");

    private static final SubLSymbol $sym133$_EXIT = makeSymbol("%EXIT");

    private static final SubLString $str134$____D___A___A___Q___D_S___D__ = makeString("~&[~D] ~A (~A): Q: ~D S: ~D~%");

    private static final SubLString $str135$We_are_out_of_sync_on_either_the_ = makeString("We are out of sync on either the queue ~D or the semaphore ~D.");

    private static final SubLString $str136$____D___A___A____A__ = makeString("~&[~D] ~A (~A): ~A~%");

    private static final SubLString $str139$Dequeueing__up_to___D_item__P_ = makeString("Dequeueing (up to) ~D item~:P.");

    private static final SubLFloat $float$0_01 = makeDouble(0.01);

    private static final SubLList $list141 = list(makeSymbol("A"), makeSymbol("B"), makeSymbol("C"), ONE_INTEGER, TWO_INTEGER, THREE_INTEGER);

    private static final SubLString $$$IPCQ_Test_Producer = makeString("IPCQ Test Producer");

    private static final SubLSymbol IPCQ_TEST_PRODUCER_RUN = makeSymbol("IPCQ-TEST-PRODUCER-RUN");

    private static final SubLString $$$Test_IPC_Queue = makeString("Test IPC Queue");

    private static final SubLString $str145$Expected__S__got__S = makeString("Expected ~S, got ~S");

    private static final SubLSymbol TEST_IPC_ENQUEUE_DEQUEUE = makeSymbol("TEST-IPC-ENQUEUE-DEQUEUE");

    static private final SubLList $list150 = list(makeSymbol("IPCQ-TEST-CASES"));

    private static final SubLList $list154 = list(list(NIL, T));

    private static final SubLSymbol TEST_IPC_ENQUEUE_DRAIN = makeSymbol("TEST-IPC-ENQUEUE-DRAIN");

    private static final SubLSymbol TEST_IPC_ENQUEUE_DRAIN_DEQUEUE = makeSymbol("TEST-IPC-ENQUEUE-DRAIN-DEQUEUE");

    private static final SubLSymbol ORDERED_IPC_QUEUE = makeSymbol("ORDERED-IPC-QUEUE");

    private static final SubLSymbol ORDERED_IPC_QUEUE_P = makeSymbol("ORDERED-IPC-QUEUE-P");

    private static final SubLList $list159 = list(makeSymbol("LOCK"), makeSymbol("PRODUCER-ISG"), makeSymbol("CONSUMER-ISG"), makeSymbol("PAYLOAD"), makeSymbol("EARLY-CONSUMER-SEMAPHORE"));

    private static final SubLList $list160 = list($LOCK, makeKeyword("PRODUCER-ISG"), makeKeyword("CONSUMER-ISG"), makeKeyword("PAYLOAD"), makeKeyword("EARLY-CONSUMER-SEMAPHORE"));

    private static final SubLList $list161 = list(makeSymbol("ORDRD-IPCQ-LOCK"), makeSymbol("ORDRD-IPCQ-PRODUCER-ISG"), makeSymbol("ORDRD-IPCQ-CONSUMER-ISG"), makeSymbol("ORDRD-IPCQ-PAYLOAD"), makeSymbol("ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE"));

    private static final SubLList $list162 = list(makeSymbol("_CSETF-ORDRD-IPCQ-LOCK"), makeSymbol("_CSETF-ORDRD-IPCQ-PRODUCER-ISG"), makeSymbol("_CSETF-ORDRD-IPCQ-CONSUMER-ISG"), makeSymbol("_CSETF-ORDRD-IPCQ-PAYLOAD"), makeSymbol("_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE"));

    private static final SubLSymbol ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list164 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ORDERED-IPC-QUEUE-P"));

    private static final SubLSymbol ORDRD_IPCQ_LOCK = makeSymbol("ORDRD-IPCQ-LOCK");

    private static final SubLSymbol _CSETF_ORDRD_IPCQ_LOCK = makeSymbol("_CSETF-ORDRD-IPCQ-LOCK");

    private static final SubLSymbol ORDRD_IPCQ_PRODUCER_ISG = makeSymbol("ORDRD-IPCQ-PRODUCER-ISG");

    private static final SubLSymbol _CSETF_ORDRD_IPCQ_PRODUCER_ISG = makeSymbol("_CSETF-ORDRD-IPCQ-PRODUCER-ISG");

    private static final SubLSymbol ORDRD_IPCQ_CONSUMER_ISG = makeSymbol("ORDRD-IPCQ-CONSUMER-ISG");

    private static final SubLSymbol _CSETF_ORDRD_IPCQ_CONSUMER_ISG = makeSymbol("_CSETF-ORDRD-IPCQ-CONSUMER-ISG");

    private static final SubLSymbol ORDRD_IPCQ_PAYLOAD = makeSymbol("ORDRD-IPCQ-PAYLOAD");

    private static final SubLSymbol _CSETF_ORDRD_IPCQ_PAYLOAD = makeSymbol("_CSETF-ORDRD-IPCQ-PAYLOAD");

    private static final SubLSymbol ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE = makeSymbol("ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE");

    private static final SubLSymbol _CSETF_ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE = makeSymbol("_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE");

    private static final SubLSymbol $EARLY_CONSUMER_SEMAPHORE = makeKeyword("EARLY-CONSUMER-SEMAPHORE");

    private static final SubLSymbol MAKE_ORDERED_IPC_QUEUE = makeSymbol("MAKE-ORDERED-IPC-QUEUE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ORDERED_IPC_QUEUE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ORDERED-IPC-QUEUE-METHOD");

    private static final SubLString $$$empty_ordered_IPC_queue_entry = makeString("empty ordered IPC queue entry");

    private static final SubLString $$$Lock_for_Ordered_IPC_Queue_ = makeString("Lock for Ordered IPC Queue ");

    private static final SubLString $$$Ordered_IPCQ_Early_Producer = makeString("Ordered IPCQ Early Producer");

    private static final SubLString $str184$Unexpected_entry__A_in_the_payloa = makeString("Unexpected entry ~A in the payload of ordered IPC queue ~A: expected nothing or waiting process.");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLSymbol KILL_PROCESS_NAMED = makeSymbol("KILL-PROCESS-NAMED");

    private static final SubLList $list187 = list(makeSymbol("NAME"));

    private static final SubLString $str188$_param_NAME__stringp____Kills_any = makeString("@param NAME; stringp\n   Kills any process having the given process name. Note\n   that kill-process is not yet supported on Win32.");

    private static final SubLList $list189 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));

    private static final SubLList $list190 = list(NIL);

    private static final SubLSymbol PROCESS_EXHAUST_IMMEDIATELY_FN = makeSymbol("PROCESS-EXHAUST-IMMEDIATELY-FN");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD");

    private static final SubLSymbol MAKE_EXHAUSTED_PROCESS = makeSymbol("MAKE-EXHAUSTED-PROCESS");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD");

    private static final SubLSymbol PROCESS_WRAPPER = makeSymbol("PROCESS-WRAPPER");

    private static final SubLSymbol PROCESS_WRAPPER_P = makeSymbol("PROCESS-WRAPPER-P");

    private static final SubLList $list198 = list(makeSymbol("ID"), makeSymbol("PROCESS"), makeSymbol("STATE"), makeSymbol("LOCK"), makeSymbol("PLIST"));

    private static final SubLList $list199 = list(makeKeyword("ID"), makeKeyword("PROCESS"), makeKeyword("STATE"), $LOCK, makeKeyword("PLIST"));

    private static final SubLList $list200 = list(makeSymbol("PROCESS-WRAPPER-ID"), makeSymbol("PROCESS-WRAPPER-PROCESS"), makeSymbol("PROCESS-WRAPPER-STATE"), makeSymbol("PROCESS-WRAPPER-LOCK"), makeSymbol("PROCESS-WRAPPER-PLIST"));

    private static final SubLList $list201 = list(makeSymbol("_CSETF-PROCESS-WRAPPER-ID"), makeSymbol("_CSETF-PROCESS-WRAPPER-PROCESS"), makeSymbol("_CSETF-PROCESS-WRAPPER-STATE"), makeSymbol("_CSETF-PROCESS-WRAPPER-LOCK"), makeSymbol("_CSETF-PROCESS-WRAPPER-PLIST"));

    private static final SubLSymbol PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list203 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROCESS-WRAPPER-P"));

    private static final SubLSymbol PROCESS_WRAPPER_ID = makeSymbol("PROCESS-WRAPPER-ID");

    private static final SubLSymbol _CSETF_PROCESS_WRAPPER_ID = makeSymbol("_CSETF-PROCESS-WRAPPER-ID");

    private static final SubLSymbol PROCESS_WRAPPER_PROCESS = makeSymbol("PROCESS-WRAPPER-PROCESS");

    private static final SubLSymbol _CSETF_PROCESS_WRAPPER_PROCESS = makeSymbol("_CSETF-PROCESS-WRAPPER-PROCESS");

    private static final SubLSymbol PROCESS_WRAPPER_STATE = makeSymbol("PROCESS-WRAPPER-STATE");

    private static final SubLSymbol _CSETF_PROCESS_WRAPPER_STATE = makeSymbol("_CSETF-PROCESS-WRAPPER-STATE");

    private static final SubLSymbol PROCESS_WRAPPER_LOCK = makeSymbol("PROCESS-WRAPPER-LOCK");

    private static final SubLSymbol _CSETF_PROCESS_WRAPPER_LOCK = makeSymbol("_CSETF-PROCESS-WRAPPER-LOCK");

    private static final SubLSymbol PROCESS_WRAPPER_PLIST = makeSymbol("PROCESS-WRAPPER-PLIST");

    private static final SubLSymbol _CSETF_PROCESS_WRAPPER_PLIST = makeSymbol("_CSETF-PROCESS-WRAPPER-PLIST");

    private static final SubLSymbol MAKE_PROCESS_WRAPPER = makeSymbol("MAKE-PROCESS-WRAPPER");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROCESS_WRAPPER_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROCESS-WRAPPER-METHOD");

    private static final SubLSymbol $process_wrapper_isg$ = makeSymbol("*PROCESS-WRAPPER-ISG*");

    private static final SubLSymbol NEW_PROCESS_WRAPPER_INT = makeSymbol("NEW-PROCESS-WRAPPER-INT");

    private static final SubLSymbol CYC_SERVER_PROCESS_FUNCALL = makeSymbol("CYC-SERVER-PROCESS-FUNCALL");

    private static final SubLSymbol CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS = makeSymbol("CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS");

    private static final SubLList $list228 = cons(makeSymbol("FUNCTION"), makeSymbol("ARGS"));

    static final boolean assertionsDisabledSynth = true;

    // Definitions
    /**
     * Debug the initial process, if any.
     */
    @LispMethod(comment = "Debug the initial process, if any.")
    public static final SubLObject debug_initial_process_alt() {
        {
            SubLObject initial_process = subl_promotions.initial_process();
            if (NIL != valid_process_p(initial_process)) {
                return debug_process(initial_process);
            }
        }
        return NIL;
    }

    // Definitions
    /**
     * Debug the initial process, if any.
     */
    @LispMethod(comment = "Debug the initial process, if any.")
    public static SubLObject debug_initial_process() {
        final SubLObject initial_process = subl_promotions.initial_process();
        if (NIL != valid_process_p(initial_process)) {
            return debug_process(initial_process);
        }
        return NIL;
    }

    public static final SubLObject interrupt_initial_process_alt() {
        return debug_initial_process();
    }

    public static SubLObject interrupt_initial_process() {
        return process_utilities.debug_initial_process();
    }

    /**
     * Determine whether the process who state is one of those that indicate
     * that the process is not doing anything. Notice that some processes,
     * like the API task processors, block on a semaphore; they will show as
     * blocked, not idle or sleeping.
     *
     * @return BOOLEANP indicating whether the process is idle or not
     */
    @LispMethod(comment = "Determine whether the process who state is one of those that indicate\r\nthat the process is not doing anything. Notice that some processes,\r\nlike the API task processors, block on a semaphore; they will show as\r\nblocked, not idle or sleeping.\r\n\r\n@return BOOLEANP indicating whether the process is idle or not\nDetermine whether the process who state is one of those that indicate\nthat the process is not doing anything. Notice that some processes,\nlike the API task processors, block on a semaphore; they will show as\nblocked, not idle or sleeping.")
    public static final SubLObject process_idleP_alt(SubLObject process) {
        {
            SubLObject state = process_whostate(process);
            return makeBoolean((NIL != string_utilities.starts_with(state, $$$Idle)) || (NIL != string_utilities.starts_with(state, $$$Sleep)));
        }
    }

    /**
     * Determine whether the process who state is one of those that indicate
     * that the process is not doing anything. Notice that some processes,
     * like the API task processors, block on a semaphore; they will show as
     * blocked, not idle or sleeping.
     *
     * @return BOOLEANP indicating whether the process is idle or not
     */
    @LispMethod(comment = "Determine whether the process who state is one of those that indicate\r\nthat the process is not doing anything. Notice that some processes,\r\nlike the API task processors, block on a semaphore; they will show as\r\nblocked, not idle or sleeping.\r\n\r\n@return BOOLEANP indicating whether the process is idle or not\nDetermine whether the process who state is one of those that indicate\nthat the process is not doing anything. Notice that some processes,\nlike the API task processors, block on a semaphore; they will show as\nblocked, not idle or sleeping.")
    public static SubLObject process_idleP(final SubLObject process) {
        final SubLObject state = process_whostate(process);
        return makeBoolean((NIL != string_utilities.starts_with(state, process_utilities.$$$Idle)) || (NIL != string_utilities.starts_with(state, process_utilities.$$$Sleep)));
    }

    /**
     * The converse to PROCESS-IDLE?.
     *
     * @return BOOLEANP if the process is either running or waiting
     */
    @LispMethod(comment = "The converse to PROCESS-IDLE?.\r\n\r\n@return BOOLEANP if the process is either running or waiting")
    public static final SubLObject process_busyP_alt(SubLObject process) {
        return makeBoolean((NIL != process_runningP(process)) || (NIL != process_waitingP(process)));
    }

    /**
     * The converse to PROCESS-IDLE?.
     *
     * @return BOOLEANP if the process is either running or waiting
     */
    @LispMethod(comment = "The converse to PROCESS-IDLE?.\r\n\r\n@return BOOLEANP if the process is either running or waiting")
    public static SubLObject process_busyP(final SubLObject process) {
        return makeBoolean((NIL != process_utilities.process_runningP(process)) || (NIL != process_utilities.process_waitingP(process)));
    }

    /**
     * Determine whether the process is waiting for something, either for a lock
     * or for an I/O event.
     *
     * @return BOOLEANP indicating whether the process is waiting or not
     */
    @LispMethod(comment = "Determine whether the process is waiting for something, either for a lock\r\nor for an I/O event.\r\n\r\n@return BOOLEANP indicating whether the process is waiting or not\nDetermine whether the process is waiting for something, either for a lock\nor for an I/O event.")
    public static final SubLObject process_waitingP_alt(SubLObject process) {
        {
            SubLObject state = process_whostate(process);
            return makeBoolean(search($$$wait, state, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isFixnum() || search($$$blocked, state, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isFixnum());
        }
    }

    /**
     * Determine whether the process is waiting for something, either for a lock
     * or for an I/O event.
     *
     * @return BOOLEANP indicating whether the process is waiting or not
     */
    @LispMethod(comment = "Determine whether the process is waiting for something, either for a lock\r\nor for an I/O event.\r\n\r\n@return BOOLEANP indicating whether the process is waiting or not\nDetermine whether the process is waiting for something, either for a lock\nor for an I/O event.")
    public static SubLObject process_waitingP(final SubLObject process) {
        final SubLObject state = process_whostate(process);
        return makeBoolean(search(process_utilities.$$$wait, state, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isFixnum() || search(process_utilities.$$$blocked, state, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).isFixnum());
    }

    /**
     * Determine whether the process who state is one of those that indicate
     * that the process is running.
     *
     * @return BOOLEANP indicating whether the process is running
     */
    @LispMethod(comment = "Determine whether the process who state is one of those that indicate\r\nthat the process is running.\r\n\r\n@return BOOLEANP indicating whether the process is running\nDetermine whether the process who state is one of those that indicate\nthat the process is running.")
    public static final SubLObject process_runningP_alt(SubLObject process) {
        {
            SubLObject state = process_whostate(process);
            return search($$$run, state, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    /**
     * Determine whether the process who state is one of those that indicate
     * that the process is running.
     *
     * @return BOOLEANP indicating whether the process is running
     */
    @LispMethod(comment = "Determine whether the process who state is one of those that indicate\r\nthat the process is running.\r\n\r\n@return BOOLEANP indicating whether the process is running\nDetermine whether the process who state is one of those that indicate\nthat the process is running.")
    public static SubLObject process_runningP(final SubLObject process) {
        final SubLObject state = process_whostate(process);
        return search(process_utilities.$$$run, state, EQUALP, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject process_suid(final SubLObject process) {
        assert NIL != processp(process) : "! processp(process) " + ("Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) ") + process;
        SubLObject suid = NIL;
        suid = pointer(process);
        return suid;
    }

    public static SubLObject find_process_by_suid(final SubLObject suid) {
        assert NIL != integerp(suid) : "! integerp(suid) " + ("Types.integerp(suid) " + "CommonSymbols.NIL != Types.integerp(suid) ") + suid;
        SubLObject result = NIL;
        if (NIL == result) {
            SubLObject csome_list_var = all_processes();
            SubLObject process = NIL;
            process = csome_list_var.first();
            while ((NIL == result) && (NIL != csome_list_var)) {
                if (suid.numE(process_utilities.process_suid(process))) {
                    result = process;
                }
                csome_list_var = csome_list_var.rest();
                process = csome_list_var.first();
            } 
        }
        return result;
    }

    public static SubLObject find_process_by_name(final SubLObject name, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        return find(name, all_processes(), test, symbol_function(process_utilities.PROCESS_NAME), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject gather_processes_by_name(final SubLObject name, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        return list_utilities.gather_all(name, all_processes(), test, symbol_function(process_utilities.PROCESS_NAME));
    }

    public static SubLObject active_process_at_startupP(final SubLObject v_object) {
        return makeBoolean((NIL != processp(v_object)) && (NIL != list_utilities.member_eqP(v_object, process_utilities.$active_processes_at_startup$.getGlobalValue())));
    }

    public static SubLObject note_active_processes_at_startup() {
        process_utilities.$active_processes_at_startup$.setGlobalValue(copy_list(all_processes()));
        return length(process_utilities.$active_processes_at_startup$.getGlobalValue());
    }

    public static SubLObject process_form(final SubLObject process) {
        assert NIL != processp(process) : "! processp(process) " + ("Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) ") + process;
        if (NIL != valid_process_p(process)) {
            return gethash_without_values(process, process_utilities.$process_form_map$.getGlobalValue(), NIL);
        }
        return NIL;
    }

    public static SubLObject process_note_form(final SubLObject process, final SubLObject form) {
        assert NIL != processp(process) : "! processp(process) " + ("Types.processp(process) " + "CommonSymbols.NIL != Types.processp(process) ") + process;
        SubLObject release = NIL;
        try {
            release = seize_lock(process_utilities.$process_form_lock$.getGlobalValue());
            if (NIL != form) {
                sethash(process, process_utilities.$process_form_map$.getGlobalValue(), form);
            } else {
                remhash(process, process_utilities.$process_form_map$.getGlobalValue());
            }
        } finally {
            if (NIL != release) {
                release_lock(process_utilities.$process_form_lock$.getGlobalValue());
            }
        }
        return process;
    }

    public static SubLObject current_process_note_form(final SubLObject form) {
        return process_utilities.process_note_form(current_process(), form);
    }

    public static SubLObject current_process_clear_form() {
        if (random.random(TWENTY_INTEGER).isZero()) {
            process_utilities.clear_invalid_process_forms();
        }
        return process_utilities.current_process_note_form(NIL);
    }

    public static SubLObject clear_invalid_process_forms() {
        SubLObject invalid_processes = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(process_utilities.$process_form_lock$.getGlobalValue());
            SubLObject process = NIL;
            SubLObject no_value = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(process_utilities.$process_form_map$.getGlobalValue());
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    process = getEntryKey(cdohash_entry);
                    no_value = getEntryValue(cdohash_entry);
                    if (NIL == valid_process_p(process)) {
                        invalid_processes = cons(process, invalid_processes);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
            SubLObject cdolist_list_var = invalid_processes;
            SubLObject invalid_process = NIL;
            invalid_process = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                remhash(invalid_process, process_utilities.$process_form_map$.getGlobalValue());
                cdolist_list_var = cdolist_list_var.rest();
                invalid_process = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != release) {
                release_lock(process_utilities.$process_form_lock$.getGlobalValue());
            }
        }
        return length(invalid_processes);
    }

    // @SubL(source = "cycl/process-utilities.lisp", position = 2865)
    // public static SubLSymbol $dtp_task$ = null;
    @LispMethod(comment = "@SubL(source = \"cycl/process-utilities.lisp\", position = 2865)\npublic static SubLSymbol $dtp_task$ = null;")
    public static final SubLObject task_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    // @SubL(source = "cycl/process-utilities.lisp", position = 2865)
    // public static SubLSymbol $dtp_task$ = null;
    @LispMethod(comment = "@SubL(source = \"cycl/process-utilities.lisp\", position = 2865)\npublic static SubLSymbol $dtp_task$ = null;")
    public static SubLObject task_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject task_p(final SubLObject v_object) {
        return v_object.getClass() == process_utilities.$task_native.class ? T : NIL;
    }

    public static SubLObject task_process(final SubLObject v_object) {
        assert NIL != process_utilities.task_p(v_object) : "! process_utilities.task_p(v_object) " + "process_utilities.task_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject task_completed(final SubLObject v_object) {
        assert NIL != process_utilities.task_p(v_object) : "! process_utilities.task_p(v_object) " + "process_utilities.task_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject _csetf_task_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.task_p(v_object) : "! process_utilities.task_p(v_object) " + "process_utilities.task_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_task_completed(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.task_p(v_object) : "! process_utilities.task_p(v_object) " + "process_utilities.task_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject make_task(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new process_utilities.$task_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PROCESS)) {
                process_utilities._csetf_task_process(v_new, current_value);
            } else
                if (pcase_var.eql($COMPLETED)) {
                    process_utilities._csetf_task_completed(v_new, current_value);
                } else {
                    Errors.error(process_utilities.$str28$Invalid_slot__S_for_construction_, current_arg);
                }

        }
        return v_new;
    }

    public static SubLObject visit_defstruct_task(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, process_utilities.MAKE_TASK, TWO_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PROCESS, process_utilities.task_process(obj));
        funcall(visitor_fn, obj, $SLOT, $COMPLETED, process_utilities.task_completed(obj));
        funcall(visitor_fn, obj, $END, process_utilities.MAKE_TASK, TWO_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_task_method(final SubLObject obj, final SubLObject visitor_fn) {
        return process_utilities.visit_defstruct_task(obj, visitor_fn);
    }

    public static SubLObject new_task(final SubLObject name, final SubLObject function, SubLObject args, SubLObject a_list) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        if (a_list == UNPROVIDED) {
            a_list = NIL;
        }
        final SubLObject task = process_utilities.make_task(UNPROVIDED);
        final SubLObject symbol_list = Mapping.mapcar(symbol_function(SYMBOL_NAME), Mapping.mapcar(symbol_function(CAR), a_list));
        final SubLObject value_list = Mapping.mapcar(symbol_function(CADR), a_list);
        subl_promotions.make_process_with_args(name, symbol_function(process_utilities.NEW_TASK_INTERNAL), list(task, function, args, symbol_list, value_list));
        return task;
    }

    public static SubLObject new_task_internal(final SubLObject task, final SubLObject function, final SubLObject args, final SubLObject symbol_list, final SubLObject value_list) {
        try {
            final SubLObject cprogv_var = Mapping.mapcar(symbol_function(process_utilities.FIND_SYMBOL), symbol_list);
            final ArrayList old_values = extract_dynamic_values(cprogv_var);
            try {
                bind_dynamic_vars(cprogv_var, value_list);
                process_utilities._csetf_task_process(task, current_process());
                apply(function, args);
            } finally {
                rebind_dynamic_vars(cprogv_var, old_values);
            }
        } finally {
            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
            try {
                bind($is_thread_performing_cleanupP$, T);
                final SubLObject _values = getValuesAsVector();
                process_utilities._csetf_task_completed(task, T);
                process_utilities._csetf_task_process(task, NIL);
                restoreValuesFromVector(_values);
            } finally {
                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return NIL;
    }

    public static final SubLObject thinking_task_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject thinking_task_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject thinking_task_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject thinking_task_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.process_utilities.$thinking_task_native.class ? T : NIL;
    }

    public static final SubLObject t_task_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField2();
    }

    public static SubLObject t_task_lock(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject t_task_thread_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField3();
    }

    public static SubLObject t_task_thread(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject t_task_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField4();
    }

    public static SubLObject t_task_name(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject t_task_status_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField5();
    }

    public static SubLObject t_task_status(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject t_task_progress_message_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField6();
    }

    public static SubLObject t_task_progress_message(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject t_task_progress_sofar_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField7();
    }

    public static SubLObject t_task_progress_sofar(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject t_task_progress_total_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField8();
    }

    public static SubLObject t_task_progress_total(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject t_task_start_time_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField9();
    }

    public static SubLObject t_task_start_time(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField9();
    }

    public static final SubLObject t_task_finish_time_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField10();
    }

    public static SubLObject t_task_finish_time(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField10();
    }

    public static final SubLObject t_task_result_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField11();
    }

    public static SubLObject t_task_result(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField11();
    }

    public static final SubLObject t_task_error_message_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField12();
    }

    public static SubLObject t_task_error_message(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField12();
    }

    public static final SubLObject t_task_properties_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.getField13();
    }

    public static SubLObject t_task_properties(final SubLObject v_object) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.getField13();
    }

    public static final SubLObject _csetf_t_task_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_t_task_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_t_task_thread_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_t_task_thread(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_t_task_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_t_task_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_t_task_status_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_t_task_status(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_t_task_progress_message_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_t_task_progress_message(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_t_task_progress_sofar_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_t_task_progress_sofar(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_t_task_progress_total_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_t_task_progress_total(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject _csetf_t_task_start_time_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField9(value);
    }

    public static SubLObject _csetf_t_task_start_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField9(value);
    }

    public static final SubLObject _csetf_t_task_finish_time_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField10(value);
    }

    public static SubLObject _csetf_t_task_finish_time(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField10(value);
    }

    public static final SubLObject _csetf_t_task_result_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField11(value);
    }

    public static SubLObject _csetf_t_task_result(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField11(value);
    }

    public static final SubLObject _csetf_t_task_error_message_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField12(value);
    }

    public static SubLObject _csetf_t_task_error_message(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField12(value);
    }

    public static final SubLObject _csetf_t_task_properties_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, THINKING_TASK_P);
        return v_object.setField13(value);
    }

    public static SubLObject _csetf_t_task_properties(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(v_object) : "! process_utilities.thinking_task_p(v_object) " + "process_utilities.thinking_task_p error :" + v_object;
        return v_object.setField13(value);
    }

    public static final SubLObject make_thinking_task_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.process_utilities.$thinking_task_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LOCK)) {
                        _csetf_t_task_lock(v_new, current_value);
                    } else {
                        if (pcase_var.eql($THREAD)) {
                            _csetf_t_task_thread(v_new, current_value);
                        } else {
                            if (pcase_var.eql($NAME)) {
                                _csetf_t_task_name(v_new, current_value);
                            } else {
                                if (pcase_var.eql($STATUS)) {
                                    _csetf_t_task_status(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PROGRESS_MESSAGE)) {
                                        _csetf_t_task_progress_message(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($PROGRESS_SOFAR)) {
                                            _csetf_t_task_progress_sofar(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($PROGRESS_TOTAL)) {
                                                _csetf_t_task_progress_total(v_new, current_value);
                                            } else {
                                                if (pcase_var.eql($START_TIME)) {
                                                    _csetf_t_task_start_time(v_new, current_value);
                                                } else {
                                                    if (pcase_var.eql($FINISH_TIME)) {
                                                        _csetf_t_task_finish_time(v_new, current_value);
                                                    } else {
                                                        if (pcase_var.eql($RESULT)) {
                                                            _csetf_t_task_result(v_new, current_value);
                                                        } else {
                                                            if (pcase_var.eql($ERROR_MESSAGE)) {
                                                                _csetf_t_task_error_message(v_new, current_value);
                                                            } else {
                                                                if (pcase_var.eql($PROPERTIES)) {
                                                                    _csetf_t_task_properties(v_new, current_value);
                                                                } else {
                                                                    Errors.error($str_alt21$Invalid_slot__S_for_construction_, current_arg);
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
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_thinking_task(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.process_utilities.$thinking_task_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                process_utilities._csetf_t_task_lock(v_new, current_value);
            } else
                if (pcase_var.eql($THREAD)) {
                    process_utilities._csetf_t_task_thread(v_new, current_value);
                } else
                    if (pcase_var.eql($NAME)) {
                        process_utilities._csetf_t_task_name(v_new, current_value);
                    } else
                        if (pcase_var.eql($STATUS)) {
                            process_utilities._csetf_t_task_status(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROGRESS_MESSAGE)) {
                                process_utilities._csetf_t_task_progress_message(v_new, current_value);
                            } else
                                if (pcase_var.eql($PROGRESS_SOFAR)) {
                                    process_utilities._csetf_t_task_progress_sofar(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PROGRESS_TOTAL)) {
                                        process_utilities._csetf_t_task_progress_total(v_new, current_value);
                                    } else
                                        if (pcase_var.eql($START_TIME)) {
                                            process_utilities._csetf_t_task_start_time(v_new, current_value);
                                        } else
                                            if (pcase_var.eql($FINISH_TIME)) {
                                                process_utilities._csetf_t_task_finish_time(v_new, current_value);
                                            } else
                                                if (pcase_var.eql($RESULT)) {
                                                    process_utilities._csetf_t_task_result(v_new, current_value);
                                                } else
                                                    if (pcase_var.eql($ERROR_MESSAGE)) {
                                                        process_utilities._csetf_t_task_error_message(v_new, current_value);
                                                    } else
                                                        if (pcase_var.eql($PROPERTIES)) {
                                                            process_utilities._csetf_t_task_properties(v_new, current_value);
                                                        } else {
                                                            Errors.error(process_utilities.$str28$Invalid_slot__S_for_construction_, current_arg);
                                                        }











        }
        return v_new;
    }

    public static SubLObject visit_defstruct_thinking_task(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, process_utilities.MAKE_THINKING_TASK, TWELVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, process_utilities.t_task_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $THREAD, process_utilities.t_task_thread(obj));
        funcall(visitor_fn, obj, $SLOT, $NAME, process_utilities.t_task_name(obj));
        funcall(visitor_fn, obj, $SLOT, $STATUS, process_utilities.t_task_status(obj));
        funcall(visitor_fn, obj, $SLOT, $PROGRESS_MESSAGE, process_utilities.t_task_progress_message(obj));
        funcall(visitor_fn, obj, $SLOT, $PROGRESS_SOFAR, process_utilities.t_task_progress_sofar(obj));
        funcall(visitor_fn, obj, $SLOT, $PROGRESS_TOTAL, process_utilities.t_task_progress_total(obj));
        funcall(visitor_fn, obj, $SLOT, $START_TIME, process_utilities.t_task_start_time(obj));
        funcall(visitor_fn, obj, $SLOT, $FINISH_TIME, process_utilities.t_task_finish_time(obj));
        funcall(visitor_fn, obj, $SLOT, $RESULT, process_utilities.t_task_result(obj));
        funcall(visitor_fn, obj, $SLOT, $ERROR_MESSAGE, process_utilities.t_task_error_message(obj));
        funcall(visitor_fn, obj, $SLOT, $PROPERTIES, process_utilities.t_task_properties(obj));
        funcall(visitor_fn, obj, $END, process_utilities.MAKE_THINKING_TASK, TWELVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_thinking_task_method(final SubLObject obj, final SubLObject visitor_fn) {
        return process_utilities.visit_defstruct_thinking_task(obj, visitor_fn);
    }

    /**
     *
     *
     * @param name
    stringp
     * 		
     * @param progress-message
     * 		stringp
     * 		Create and return a new thinking task structure with name NAME and progress
     * 		message PROGRESS-MESSAGE.  PROPERTIES may be provided as a PLIST if the application
     * 		requires additional information to be stored with the thinking task.
     */
    @LispMethod(comment = "@param name\nstringp\r\n\t\t\r\n@param progress-message\r\n\t\tstringp\r\n\t\tCreate and return a new thinking task structure with name NAME and progress\r\n\t\tmessage PROGRESS-MESSAGE.  PROPERTIES may be provided as a PLIST if the application\r\n\t\trequires additional information to be stored with the thinking task.")
    public static final SubLObject new_thinking_task_alt(SubLObject name, SubLObject progress_message, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        SubLTrampolineFile.checkType(name, STRINGP);
        SubLTrampolineFile.checkType(progress_message, STRINGP);
        if (NIL != v_properties) {
            SubLTrampolineFile.checkType(v_properties, PROPERTY_LIST_P);
        }
        {
            SubLObject thinking = make_thinking_task(UNPROVIDED);
            SubLObject lock = make_lock(name);
            _csetf_t_task_progress_message(thinking, progress_message);
            _csetf_t_task_name(thinking, name);
            _csetf_t_task_lock(thinking, lock);
            _csetf_t_task_status(thinking, $NONE);
            if (NIL != v_properties) {
                _csetf_t_task_properties(thinking, v_properties);
            }
            return thinking;
        }
    }

    /**
     *
     *
     * @param name
    stringp
     * 		
     * @param progress-message
     * 		stringp
     * 		Create and return a new thinking task structure with name NAME and progress
     * 		message PROGRESS-MESSAGE.  PROPERTIES may be provided as a PLIST if the application
     * 		requires additional information to be stored with the thinking task.
     */
    @LispMethod(comment = "@param name\nstringp\r\n\t\t\r\n@param progress-message\r\n\t\tstringp\r\n\t\tCreate and return a new thinking task structure with name NAME and progress\r\n\t\tmessage PROGRESS-MESSAGE.  PROPERTIES may be provided as a PLIST if the application\r\n\t\trequires additional information to be stored with the thinking task.")
    public static SubLObject new_thinking_task(final SubLObject name, final SubLObject progress_message, SubLObject v_properties) {
        if (v_properties == UNPROVIDED) {
            v_properties = NIL;
        }
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != stringp(progress_message) : "! stringp(progress_message) " + ("Types.stringp(progress_message) " + "CommonSymbols.NIL != Types.stringp(progress_message) ") + progress_message;
        if (((NIL != v_properties) && (!process_utilities.assertionsDisabledSynth)) && (NIL == list_utilities.property_list_p(v_properties))) {
            throw new AssertionError(v_properties);
        }
        final SubLObject thinking = process_utilities.make_thinking_task(UNPROVIDED);
        final SubLObject lock = make_lock(name);
        process_utilities._csetf_t_task_progress_message(thinking, progress_message);
        process_utilities._csetf_t_task_name(thinking, name);
        process_utilities._csetf_t_task_lock(thinking, lock);
        process_utilities._csetf_t_task_status(thinking, $NONE);
        if (NIL != v_properties) {
            process_utilities._csetf_t_task_properties(thinking, v_properties);
        }
        return thinking;
    }

    public static final SubLObject with_thinking_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt73);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject thinking = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt73);
                    thinking = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            SubLObject lock = $sym74$LOCK;
                            return list(CLET, list(list(lock, list(THINKING_LOCK, thinking))), listS(WITH_LOCK_HELD, list(lock), append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt73);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject with_thinking_lock(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, process_utilities.$list88);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject thinking = NIL;
        destructuring_bind_must_consp(current, datum, process_utilities.$list88);
        thinking = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject lock = process_utilities.$sym89$LOCK;
            return list(CLET, list(list(lock, list(process_utilities.THINKING_LOCK, thinking))), listS(WITH_LOCK_HELD, list(lock), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, process_utilities.$list88);
        return NIL;
    }

    public static final SubLObject thinking_note_thread_alt(SubLObject thinking, SubLObject thread) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        SubLTrampolineFile.checkType(thread, PROCESSP);
        {
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_1 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_1);
                _csetf_t_task_thread(thinking, thread);
            } finally {
                if (NIL != release) {
                    release_lock(lock_1);
                }
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_thread(final SubLObject thinking, final SubLObject thread) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        assert NIL != processp(thread) : "! processp(thread) " + ("Types.processp(thread) " + "CommonSymbols.NIL != Types.processp(thread) ") + thread;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_t_task_thread(thinking, thread);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static final SubLObject thinking_clear_thread_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        _csetf_t_task_thread(thinking, NIL);
        return thinking;
    }

    public static SubLObject thinking_clear_thread(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        process_utilities._csetf_t_task_thread(thinking, NIL);
        return thinking;
    }

    public static final SubLObject thinking_note_status_alt(SubLObject thinking, SubLObject status) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        SubLTrampolineFile.checkType(status, KEYWORDP);
        {
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_2 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_2);
                _csetf_t_task_status(thinking, status);
            } finally {
                if (NIL != release) {
                    release_lock(lock_2);
                }
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_status(final SubLObject thinking, final SubLObject status) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        assert NIL != keywordp(status) : "! keywordp(status) " + ("Types.keywordp(status) " + "CommonSymbols.NIL != Types.keywordp(status) ") + status;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_t_task_status(thinking, status);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    /**
     * Set the progress message for THINKING to MESSAGE.
     */
    @LispMethod(comment = "Set the progress message for THINKING to MESSAGE.")
    public static final SubLObject thinking_note_progress_message_alt(SubLObject thinking, SubLObject message) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        SubLTrampolineFile.checkType(message, STRINGP);
        {
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_3 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_3);
                _csetf_t_task_progress_message(thinking, message);
            } finally {
                if (NIL != release) {
                    release_lock(lock_3);
                }
            }
        }
        return thinking;
    }

    /**
     * Set the progress message for THINKING to MESSAGE.
     */
    @LispMethod(comment = "Set the progress message for THINKING to MESSAGE.")
    public static SubLObject thinking_note_progress_message(final SubLObject thinking, final SubLObject message) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        assert NIL != stringp(message) : "! stringp(message) " + ("Types.stringp(message) " + "CommonSymbols.NIL != Types.stringp(message) ") + message;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_t_task_progress_message(thinking, message);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    /**
     * Set the progress count for THINKING to SOFAR.
     */
    @LispMethod(comment = "Set the progress count for THINKING to SOFAR.")
    public static final SubLObject thinking_note_progress_sofar_alt(SubLObject thinking, SubLObject sofar) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        SubLTrampolineFile.checkType(sofar, INTEGERP);
        {
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_4 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_4);
                _csetf_t_task_progress_sofar(thinking, sofar);
            } finally {
                if (NIL != release) {
                    release_lock(lock_4);
                }
            }
        }
        return thinking;
    }

    /**
     * Set the progress count for THINKING to SOFAR.
     */
    @LispMethod(comment = "Set the progress count for THINKING to SOFAR.")
    public static SubLObject thinking_note_progress_sofar(final SubLObject thinking, final SubLObject sofar) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        assert NIL != integerp(sofar) : "! integerp(sofar) " + ("Types.integerp(sofar) " + "CommonSymbols.NIL != Types.integerp(sofar) ") + sofar;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_t_task_progress_sofar(thinking, sofar);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    /**
     * Set the total work count for THINKING to TOTAL.
     */
    @LispMethod(comment = "Set the total work count for THINKING to TOTAL.")
    public static final SubLObject thinking_note_progress_total_alt(SubLObject thinking, SubLObject total) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        SubLTrampolineFile.checkType(total, INTEGERP);
        {
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_5 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_5);
                _csetf_t_task_progress_total(thinking, total);
            } finally {
                if (NIL != release) {
                    release_lock(lock_5);
                }
            }
        }
        return thinking;
    }

    /**
     * Set the total work count for THINKING to TOTAL.
     */
    @LispMethod(comment = "Set the total work count for THINKING to TOTAL.")
    public static SubLObject thinking_note_progress_total(final SubLObject thinking, final SubLObject total) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        assert NIL != integerp(total) : "! integerp(total) " + ("Types.integerp(total) " + "CommonSymbols.NIL != Types.integerp(total) ") + total;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_t_task_progress_total(thinking, total);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static final SubLObject thinking_note_start_time_alt(SubLObject thinking, SubLObject time) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        SubLTrampolineFile.checkType(time, UNIVERSAL_TIME_P);
        {
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_6 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_6);
                _csetf_t_task_start_time(thinking, time);
            } finally {
                if (NIL != release) {
                    release_lock(lock_6);
                }
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_start_time(final SubLObject thinking, final SubLObject time) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        assert NIL != numeric_date_utilities.universal_time_p(time) : "! numeric_date_utilities.universal_time_p(time) " + ("numeric_date_utilities.universal_time_p(time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(time) ") + time;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_t_task_start_time(thinking, time);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static final SubLObject thinking_note_finish_time_alt(SubLObject thinking, SubLObject time) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        SubLTrampolineFile.checkType(time, UNIVERSAL_TIME_P);
        {
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_7 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_7);
                _csetf_t_task_finish_time(thinking, time);
            } finally {
                if (NIL != release) {
                    release_lock(lock_7);
                }
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_finish_time(final SubLObject thinking, final SubLObject time) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        assert NIL != numeric_date_utilities.universal_time_p(time) : "! numeric_date_utilities.universal_time_p(time) " + ("numeric_date_utilities.universal_time_p(time) " + "CommonSymbols.NIL != numeric_date_utilities.universal_time_p(time) ") + time;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_t_task_finish_time(thinking, time);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static final SubLObject thinking_note_result_alt(SubLObject thinking, SubLObject result) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        {
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_8 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_8);
                _csetf_t_task_result(thinking, result);
            } finally {
                if (NIL != release) {
                    release_lock(lock_8);
                }
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_result(final SubLObject thinking, final SubLObject result) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_t_task_result(thinking, result);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static final SubLObject thinking_note_error_message_alt(SubLObject thinking, SubLObject error_message) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        SubLTrampolineFile.checkType(error_message, STRINGP);
        {
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_9 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_9);
                _csetf_t_task_error_message(thinking, error_message);
            } finally {
                if (NIL != release) {
                    release_lock(lock_9);
                }
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_error_message(final SubLObject thinking, final SubLObject error_message) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        assert NIL != stringp(error_message) : "! stringp(error_message) " + ("Types.stringp(error_message) " + "CommonSymbols.NIL != Types.stringp(error_message) ") + error_message;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_t_task_error_message(thinking, error_message);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static final SubLObject thinking_note_property_alt(SubLObject thinking, SubLObject property, SubLObject value) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        SubLTrampolineFile.checkType(property, KEYWORDP);
        {
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_10 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_10);
                _csetf_t_task_properties(thinking, putf(t_task_properties(thinking), property, value));
            } finally {
                if (NIL != release) {
                    release_lock(lock_10);
                }
            }
        }
        return thinking;
    }

    public static SubLObject thinking_note_property(final SubLObject thinking, final SubLObject property, final SubLObject value) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        assert NIL != keywordp(property) : "! keywordp(property) " + ("Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) ") + property;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_t_task_properties(thinking, putf(process_utilities.t_task_properties(thinking), property, value));
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return thinking;
    }

    public static final SubLObject thinking_lock_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return t_task_lock(thinking);
    }

    public static SubLObject thinking_lock(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return process_utilities.t_task_lock(thinking);
    }

    public static final SubLObject thinking_thread_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return t_task_thread(thinking);
    }

    public static SubLObject thinking_thread(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return process_utilities.t_task_thread(thinking);
    }

    public static final SubLObject thinking_name_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return t_task_name(thinking);
    }

    public static SubLObject thinking_name(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return process_utilities.t_task_name(thinking);
    }

    public static final SubLObject thinking_status_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return t_task_status(thinking);
    }

    public static SubLObject thinking_status(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return process_utilities.t_task_status(thinking);
    }

    public static final SubLObject thinking_progress_message_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return t_task_progress_message(thinking);
    }

    public static SubLObject thinking_progress_message(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return process_utilities.t_task_progress_message(thinking);
    }

    public static final SubLObject thinking_progress_sofar_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return t_task_progress_sofar(thinking);
    }

    public static SubLObject thinking_progress_sofar(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return process_utilities.t_task_progress_sofar(thinking);
    }

    public static final SubLObject thinking_progress_total_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return t_task_progress_total(thinking);
    }

    public static SubLObject thinking_progress_total(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return process_utilities.t_task_progress_total(thinking);
    }

    public static final SubLObject thinking_start_time_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return t_task_start_time(thinking);
    }

    public static SubLObject thinking_start_time(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return process_utilities.t_task_start_time(thinking);
    }

    public static final SubLObject thinking_finish_time_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return t_task_finish_time(thinking);
    }

    public static SubLObject thinking_finish_time(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return process_utilities.t_task_finish_time(thinking);
    }

    public static final SubLObject thinking_result_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return t_task_result(thinking);
    }

    public static SubLObject thinking_result(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return process_utilities.t_task_result(thinking);
    }

    public static final SubLObject thinking_error_message_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return t_task_error_message(thinking);
    }

    public static SubLObject thinking_error_message(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return process_utilities.t_task_error_message(thinking);
    }

    public static final SubLObject thinking_property_alt(SubLObject thinking, SubLObject property) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        SubLTrampolineFile.checkType(property, KEYWORDP);
        return getf(t_task_properties(thinking), property, UNPROVIDED);
    }

    public static SubLObject thinking_property(final SubLObject thinking, final SubLObject property) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        assert NIL != keywordp(property) : "! keywordp(property) " + ("Types.keywordp(property) " + "CommonSymbols.NIL != Types.keywordp(property) ") + property;
        return getf(process_utilities.t_task_properties(thinking), property, UNPROVIDED);
    }

    public static final SubLObject thinking_properties_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        return copy_list(t_task_properties(thinking));
    }

    public static SubLObject thinking_properties(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        return copy_list(process_utilities.t_task_properties(thinking));
    }

    /**
     * Return the thinking task, if any, associated with the current thread.
     */
    @LispMethod(comment = "Return the thinking task, if any, associated with the current thread.")
    public static final SubLObject thinking_task_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $thinking_task$.getDynamicValue(thread);
        }
    }

    /**
     * Return the thinking task, if any, associated with the current thread.
     */
    @LispMethod(comment = "Return the thinking task, if any, associated with the current thread.")
    public static SubLObject thinking_task() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return process_utilities.$thinking_task$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @param thinking
    thinking-task-p
     * 		
     * @param function
    function-spec-p
     * 		
     * @param arg-list
    listp
     * 		
     * @return processp
    Launch a new thread for the thinking task THINKING, which will run FUNCTION
    by calling APPLY on FUNCTION and ARG-LIST.
     */
    @LispMethod(comment = "@param thinking\nthinking-task-p\r\n\t\t\r\n@param function\nfunction-spec-p\r\n\t\t\r\n@param arg-list\nlistp\r\n\t\t\r\n@return processp\r\nLaunch a new thread for the thinking task THINKING, which will run FUNCTION\r\nby calling APPLY on FUNCTION and ARG-LIST.")
    public static final SubLObject thinking_start_alt(SubLObject thinking, SubLObject function, SubLObject arg_list) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        SubLTrampolineFile.checkType(function, FUNCTION_SPEC_P);
        SubLTrampolineFile.checkType(arg_list, LISTP);
        {
            SubLObject v_answer = NIL;
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_11 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_11);
                {
                    SubLObject thread = thinking_thread(thinking);
                    if (NIL == thread) {
                        {
                            SubLObject thread_args = list(thinking, function, arg_list);
                            SubLObject name = thinking_name(thinking);
                            thread = subl_promotions.make_process_with_args(name, THINKING_THREAD_RUN, thread_args);
                            thinking_note_status(thinking, $STARTED);
                            v_answer = thread;
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock_11);
                }
            }
            return v_answer;
        }
    }

    /**
     *
     *
     * @param thinking
    thinking-task-p
     * 		
     * @param function
    function-spec-p
     * 		
     * @param arg-list
    listp
     * 		
     * @return processp
    Launch a new thread for the thinking task THINKING, which will run FUNCTION
    by calling APPLY on FUNCTION and ARG-LIST.
     */
    @LispMethod(comment = "@param thinking\nthinking-task-p\r\n\t\t\r\n@param function\nfunction-spec-p\r\n\t\t\r\n@param arg-list\nlistp\r\n\t\t\r\n@return processp\r\nLaunch a new thread for the thinking task THINKING, which will run FUNCTION\r\nby calling APPLY on FUNCTION and ARG-LIST.")
    public static SubLObject thinking_start(final SubLObject thinking, final SubLObject function, final SubLObject arg_list) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        assert NIL != function_spec_p(function) : "! function_spec_p(function) " + ("Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) ") + function;
        assert NIL != listp(arg_list) : "! listp(arg_list) " + ("Types.listp(arg_list) " + "CommonSymbols.NIL != Types.listp(arg_list) ") + arg_list;
        SubLObject v_answer = NIL;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            SubLObject thread = process_utilities.thinking_thread(thinking);
            if (NIL == thread) {
                final SubLObject thread_args = list(thinking, function, arg_list);
                final SubLObject name = process_utilities.thinking_name(thinking);
                thread = subl_promotions.make_process_with_args(name, process_utilities.THINKING_THREAD_RUN, thread_args);
                process_utilities.thinking_note_status(thinking, $STARTED);
                v_answer = thread;
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return v_answer;
    }

    /**
     *
     *
     * @param thinking
    thinking-task-p
     * 		
     * @return boolean
    Halt the thread associated with the task THINKING.
     */
    @LispMethod(comment = "@param thinking\nthinking-task-p\r\n\t\t\r\n@return boolean\r\nHalt the thread associated with the task THINKING.")
    public static final SubLObject thinking_stop_alt(SubLObject thinking) {
        SubLTrampolineFile.checkType(thinking, THINKING_TASK_P);
        {
            SubLObject v_answer = NIL;
            SubLObject lock = thinking_lock(thinking);
            SubLObject lock_12 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_12);
                {
                    SubLObject thread = thinking_thread(thinking);
                    if (NIL != processp(thread)) {
                        try {
                            if (NIL != valid_process_p(thread)) {
                                kill_process(thread);
                            }
                            v_answer = T;
                        } finally {
                            {
                                SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                                try {
                                    bind($is_thread_performing_cleanupP$, T);
                                    if (NIL == thinking_finish_time(thinking)) {
                                        thinking_note_finish_time(thinking, get_universal_time());
                                    }
                                    thinking_clear_thread(thinking);
                                    thinking_note_status(thinking, $STOPPED);
                                } finally {
                                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                                }
                            }
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock_12);
                }
            }
            return v_answer;
        }
    }

    /**
     *
     *
     * @param thinking
    thinking-task-p
     * 		
     * @return boolean
    Halt the thread associated with the task THINKING.
     */
    @LispMethod(comment = "@param thinking\nthinking-task-p\r\n\t\t\r\n@return boolean\r\nHalt the thread associated with the task THINKING.")
    public static SubLObject thinking_stop(final SubLObject thinking) {
        assert NIL != process_utilities.thinking_task_p(thinking) : "! process_utilities.thinking_task_p(thinking) " + ("process_utilities.thinking_task_p(thinking) " + "CommonSymbols.NIL != process_utilities.thinking_task_p(thinking) ") + thinking;
        SubLObject v_answer = NIL;
        final SubLObject lock = process_utilities.thinking_lock(thinking);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject thread = process_utilities.thinking_thread(thinking);
            if (NIL != processp(thread)) {
                try {
                    if (NIL != valid_process_p(thread)) {
                        kill_process(thread);
                    }
                    v_answer = T;
                } finally {
                    final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL == process_utilities.thinking_finish_time(thinking)) {
                            process_utilities.thinking_note_finish_time(thinking, get_universal_time());
                        }
                        process_utilities.thinking_clear_thread(thinking);
                        process_utilities.thinking_note_status(thinking, $STOPPED);
                        restoreValuesFromVector(_values);
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return v_answer;
    }

    public static final SubLObject thinking_thread_run_alt(SubLObject thinking, SubLObject function, SubLObject args) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject success = NIL;
                SubLObject error_message = NIL;
                SubLObject uncaught_errorP = NIL;
                {
                    SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                    try {
                        $package$.bind(find_package($$$CYC), thread);
                        thinking_thread_initialize(thinking);
                        try {
                            uncaught_errorP = T;
                            {
                                SubLObject _prev_bind_0_13 = $thinking_task$.currentBinding(thread);
                                try {
                                    $thinking_task$.bind(thinking, thread);
                                    try {
                                        {
                                            SubLObject _prev_bind_0_14 = Errors.$error_handler$.currentBinding(thread);
                                            try {
                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                try {
                                                    {
                                                        SubLObject _prev_bind_0_15 = Errors.$continue_cerrorP$.currentBinding(thread);
                                                        try {
                                                            Errors.$continue_cerrorP$.bind(T, thread);
                                                            thinking_note_status(thinking, $RUNNING);
                                                            result = apply(function, args);
                                                        } finally {
                                                            Errors.$continue_cerrorP$.rebind(_prev_bind_0_15, thread);
                                                        }
                                                    }
                                                    success = T;
                                                    uncaught_errorP = NIL;
                                                } catch (Throwable catch_var) {
                                                    Errors.handleThrowable(catch_var, NIL);
                                                }
                                            } finally {
                                                Errors.$error_handler$.rebind(_prev_bind_0_14, thread);
                                            }
                                        }
                                    } catch (Throwable ccatch_env_var) {
                                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                    }
                                } finally {
                                    $thinking_task$.rebind(_prev_bind_0_13, thread);
                                }
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (((NIL != uncaught_errorP) && (thinking_status(thinking) != $STOPPED)) && (NIL == error_message)) {
                                        error_message = format(NIL, $str_alt90$Function__A_in_thread__A_terminat, function, thinking_name(thinking));
                                    }
                                    thinking_thread_finalize(thinking, result, success, error_message);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
                                }
                            }
                        }
                    } finally {
                        $package$.rebind(_prev_bind_0, thread);
                    }
                }
                return values(result, success, error_message);
            }
        }
    }

    public static SubLObject thinking_thread_run(final SubLObject thinking, final SubLObject function, final SubLObject args) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject success = NIL;
        SubLObject error_message = NIL;
        SubLObject uncaught_errorP = NIL;
        final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
        try {
            $package$.bind(find_package(process_utilities.$$$CYC), thread);
            process_utilities.thinking_thread_initialize(thinking);
            try {
                uncaught_errorP = T;
                final SubLObject _prev_bind_0_$1 = process_utilities.$thinking_task$.currentBinding(thread);
                try {
                    process_utilities.$thinking_task$.bind(thinking, thread);
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                final SubLObject _prev_bind_0_$3 = Errors.$continue_cerrorP$.currentBinding(thread);
                                try {
                                    Errors.$continue_cerrorP$.bind(T, thread);
                                    process_utilities.thinking_note_status(thinking, $RUNNING);
                                    result = apply(function, args);
                                } finally {
                                    Errors.$continue_cerrorP$.rebind(_prev_bind_0_$3, thread);
                                }
                                success = T;
                                uncaught_errorP = NIL;
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                } finally {
                    process_utilities.$thinking_task$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    if (((NIL != uncaught_errorP) && (process_utilities.thinking_status(thinking) != $STOPPED)) && (NIL == error_message)) {
                        error_message = format(NIL, process_utilities.$str103$Function__A_in_thread__A_terminat, function, process_utilities.thinking_name(thinking));
                    }
                    process_utilities.thinking_thread_finalize(thinking, result, success, error_message);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            $package$.rebind(_prev_bind_0, thread);
        }
        return values(result, success, error_message);
    }

    public static final SubLObject thinking_thread_initialize_alt(SubLObject thinking) {
        thinking_note_start_time(thinking, get_universal_time());
        {
            SubLObject thread = current_process();
            thinking_note_thread(thinking, thread);
        }
        return thinking;
    }

    public static SubLObject thinking_thread_initialize(final SubLObject thinking) {
        process_utilities.thinking_note_start_time(thinking, get_universal_time());
        final SubLObject thread = current_process();
        process_utilities.thinking_note_thread(thinking, thread);
        return thinking;
    }

    public static final SubLObject thinking_thread_finalize_alt(SubLObject thinking, SubLObject result, SubLObject success, SubLObject error_message) {
        {
            SubLObject stopped = (thinking_status(thinking) == $STOPPED) ? ((SubLObject) (T)) : NIL;
            if (NIL != success) {
                thinking_note_result(thinking, result);
            } else {
                if (NIL != error_message) {
                    thinking_note_error_message(thinking, error_message);
                }
            }
            thinking_note_finish_time(thinking, get_universal_time());
            thinking_clear_thread(thinking);
            if (NIL == stopped) {
                thinking_note_status(thinking, NIL != error_message ? ((SubLObject) ($ERROR)) : $FINISHED);
            }
            return NIL;
        }
    }

    public static SubLObject thinking_thread_finalize(final SubLObject thinking, final SubLObject result, final SubLObject success, final SubLObject error_message) {
        final SubLObject stopped = (process_utilities.thinking_status(thinking) == $STOPPED) ? T : NIL;
        if (NIL != success) {
            process_utilities.thinking_note_result(thinking, result);
        } else
            if (NIL != error_message) {
                process_utilities.thinking_note_error_message(thinking, error_message);
            }

        process_utilities.thinking_note_finish_time(thinking, get_universal_time());
        process_utilities.thinking_clear_thread(thinking);
        if (NIL == stopped) {
            process_utilities.thinking_note_status(thinking, NIL != error_message ? $ERROR : $FINISHED);
        }
        return NIL;
    }

    public static final SubLObject ipc_queue_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ipc_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ipc_queue_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.process_utilities.$ipc_queue_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ipc_queue_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.process_utilities.$ipc_queue_native.class ? T : NIL;
    }

    public static final SubLObject ipc_queue_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, IPC_QUEUE_P);
        return v_object.getField2();
    }

    public static SubLObject ipc_queue_lock(final SubLObject v_object) {
        assert NIL != process_utilities.ipc_queue_p(v_object) : "! process_utilities.ipc_queue_p(v_object) " + "process_utilities.ipc_queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ipc_queue_semaphore_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, IPC_QUEUE_P);
        return v_object.getField3();
    }

    public static SubLObject ipc_queue_semaphore(final SubLObject v_object) {
        assert NIL != process_utilities.ipc_queue_p(v_object) : "! process_utilities.ipc_queue_p(v_object) " + "process_utilities.ipc_queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ipc_queue_data_queue_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, IPC_QUEUE_P);
        return v_object.getField4();
    }

    public static SubLObject ipc_queue_data_queue(final SubLObject v_object) {
        assert NIL != process_utilities.ipc_queue_p(v_object) : "! process_utilities.ipc_queue_p(v_object) " + "process_utilities.ipc_queue_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_ipc_queue_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, IPC_QUEUE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_ipc_queue_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.ipc_queue_p(v_object) : "! process_utilities.ipc_queue_p(v_object) " + "process_utilities.ipc_queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ipc_queue_semaphore_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, IPC_QUEUE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_ipc_queue_semaphore(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.ipc_queue_p(v_object) : "! process_utilities.ipc_queue_p(v_object) " + "process_utilities.ipc_queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ipc_queue_data_queue_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, IPC_QUEUE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_ipc_queue_data_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.ipc_queue_p(v_object) : "! process_utilities.ipc_queue_p(v_object) " + "process_utilities.ipc_queue_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_ipc_queue_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.process_utilities.$ipc_queue_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LOCK)) {
                        _csetf_ipc_queue_lock(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SEMAPHORE)) {
                            _csetf_ipc_queue_semaphore(v_new, current_value);
                        } else {
                            if (pcase_var.eql($DATA_QUEUE)) {
                                _csetf_ipc_queue_data_queue(v_new, current_value);
                            } else {
                                Errors.error($str_alt21$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_ipc_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.process_utilities.$ipc_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                process_utilities._csetf_ipc_queue_lock(v_new, current_value);
            } else
                if (pcase_var.eql($SEMAPHORE)) {
                    process_utilities._csetf_ipc_queue_semaphore(v_new, current_value);
                } else
                    if (pcase_var.eql($DATA_QUEUE)) {
                        process_utilities._csetf_ipc_queue_data_queue(v_new, current_value);
                    } else {
                        Errors.error(process_utilities.$str28$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ipc_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, process_utilities.MAKE_IPC_QUEUE, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, process_utilities.ipc_queue_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $SEMAPHORE, process_utilities.ipc_queue_semaphore(obj));
        funcall(visitor_fn, obj, $SLOT, $DATA_QUEUE, process_utilities.ipc_queue_data_queue(obj));
        funcall(visitor_fn, obj, $END, process_utilities.MAKE_IPC_QUEUE, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ipc_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return process_utilities.visit_defstruct_ipc_queue(obj, visitor_fn);
    }

    public static final SubLObject new_ipc_queue_alt(SubLObject name) {
        {
            SubLObject ipcq = make_ipc_queue(UNPROVIDED);
            SubLObject lock_name = cconcatenate($str_alt108$Lock_for_Queue_, name);
            _csetf_ipc_queue_lock(ipcq, make_lock(lock_name));
            _csetf_ipc_queue_semaphore(ipcq, Semaphores.new_semaphore(name, ZERO_INTEGER));
            _csetf_ipc_queue_data_queue(ipcq, queues.create_queue());
            return ipcq;
        }
    }

    public static SubLObject new_ipc_queue(final SubLObject name) {
        final SubLObject ipcq = process_utilities.make_ipc_queue(UNPROVIDED);
        final SubLObject lock_name = cconcatenate(process_utilities.$$$Lock_for_Queue_, name);
        process_utilities._csetf_ipc_queue_lock(ipcq, make_lock(lock_name));
        process_utilities._csetf_ipc_queue_semaphore(ipcq, Semaphores.new_semaphore(name, ZERO_INTEGER));
        process_utilities._csetf_ipc_queue_data_queue(ipcq, queues.create_queue(UNPROVIDED));
        return ipcq;
    }

    public static final SubLObject ipc_enqueue(SubLObject item, SubLObject ipc_queue) {
        {
            SubLObject lock = ipc_queue_lock(ipc_queue);
            SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
            SubLObject lock_17 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_17);
                queues.enqueue(item, data_queue);
            } finally {
                if (NIL != release) {
                    release_lock(lock_17);
                }
            }
            Semaphores.semaphore_signal(ipc_queue_semaphore(ipc_queue));
        }
        return ipc_queue;
    }

    public static SubLObject ipc_enqueue(final SubLObject item, final SubLObject ipc_queue, SubLObject debugP) {
        if (debugP == UNPROVIDED) {
            debugP = process_utilities.$ipcq_debugP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lock = process_utilities.ipc_queue_lock(ipc_queue);
        final SubLObject data_queue = process_utilities.ipc_queue_data_queue(ipc_queue);
        final SubLObject item_string = (NIL != debugP) ? string_utilities.string_first_n(TWELVE_INTEGER, princ_to_string(item)) : NIL;
        final SubLObject _prev_bind_0 = process_utilities.$ipcq_debugP$.currentBinding(thread);
        try {
            process_utilities.$ipcq_debugP$.bind(debugP, thread);
            process_utilities.ipcq_debug(ipc_queue, process_utilities.$str125$Waiting_to_enqueue__A, item_string, UNPROVIDED, UNPROVIDED);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                process_utilities.ipcq_debug(ipc_queue, process_utilities.$str126$Enqueuing__A, item_string, UNPROVIDED, UNPROVIDED);
                queues.enqueue(item, data_queue);
                if (NIL != debugP) {
                    process_utilities.ipcq_debug(ipc_queue, process_utilities.$str127$Enqueued__A, item_string, UNPROVIDED, UNPROVIDED);
                    process_utilities.ipcq_debug(ipc_queue, process_utilities.$str128$Queue_size___S, queues.queue_size(data_queue), UNPROVIDED, UNPROVIDED);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            Semaphores.semaphore_signal(process_utilities.ipc_queue_semaphore(ipc_queue));
            process_utilities.check_ipcq_synchronized(ipc_queue);
        } finally {
            process_utilities.$ipcq_debugP$.rebind(_prev_bind_0, thread);
        }
        return ipc_queue;
    }

    public static final SubLObject ipc_dequeue(SubLObject ipc_queue) {
        {
            SubLObject result = NIL;
            SubLObject lock = ipc_queue_lock(ipc_queue);
            SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
            SubLObject succeeded = NIL;
            try {
                Semaphores.semaphore_wait(ipc_queue_semaphore(ipc_queue));
                succeeded = T;
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != succeeded) {
                            {
                                SubLObject lock_18 = lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock_18);
                                    result = queues.dequeue(data_queue);
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock_18);
                                    }
                                }
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject ipc_dequeue(final SubLObject ipc_queue, SubLObject debugP) {
        if (debugP == UNPROVIDED) {
            debugP = process_utilities.$ipcq_debugP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = process_utilities.$ipcq_debugP$.currentBinding(thread);
        try {
            process_utilities.$ipcq_debugP$.bind(debugP, thread);
            SubLObject result = NIL;
            SubLObject err_msg = NIL;
            process_utilities.check_ipcq_synchronized(ipc_queue);
            final SubLObject lock = process_utilities.ipc_queue_lock(ipc_queue);
            final SubLObject data_queue = process_utilities.ipc_queue_data_queue(ipc_queue);
            SubLObject succeeded = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$5 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        process_utilities.ipcq_debug(ipc_queue, process_utilities.$str129$Waiting_for_dequeue_semaphore_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        Semaphores.semaphore_wait(process_utilities.ipc_queue_semaphore(ipc_queue));
                        succeeded = T;
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$5, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                err_msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != succeeded) {
                process_utilities.ipcq_debug(ipc_queue, process_utilities.$str130$Waiting_for_Queue_lock_to_dequeue, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    result = queues.dequeue(data_queue);
                    if (NIL != debugP) {
                        process_utilities.ipcq_debug(ipc_queue, process_utilities.$str131$Dequeued__A, string_utilities.string_first_n(TWELVE_INTEGER, princ_to_string(result)), UNPROVIDED, UNPROVIDED);
                        process_utilities.ipcq_debug(ipc_queue, process_utilities.$str128$Queue_size___S, queues.queue_size(data_queue), UNPROVIDED, UNPROVIDED);
                        process_utilities.check_ipcq_synchronized(ipc_queue);
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            } else
                if (NIL == err_msg) {
                    err_msg = process_utilities.$str132$Unknown_error_;
                }

            return values(result, err_msg);
        } finally {
            process_utilities.$ipcq_debugP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject check_ipcq_synchronized(final SubLObject ipc_queue) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != process_utilities.$ipcq_debugP$.getDynamicValue(thread)) {
            final SubLObject q_size = process_utilities.ipc_current_queue_size(ipc_queue);
            final SubLObject s_count = Semaphores.semaphore_current_count(process_utilities.ipc_queue_semaphore(ipc_queue));
            format_nil.force_format(T, process_utilities.$str134$____D___A___A___Q___D_S___D__, process_utilities.process_suid(current_process()), numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), Semaphores.semaphore_name(process_utilities.ipc_queue_semaphore(ipc_queue)), q_size, s_count, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            if (!q_size.numE(s_count)) {
                Errors.warn(process_utilities.$str135$We_are_out_of_sync_on_either_the_, q_size, s_count);
            }
            return NIL;
        }
        return NIL;
    }

    public static SubLObject ipcq_debug(final SubLObject ipc_queue, final SubLObject str, SubLObject arg1, SubLObject arg2, SubLObject arg3) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != process_utilities.$ipcq_debugP$.getDynamicValue(thread)) {
            format_nil.force_format(T, process_utilities.$str136$____D___A___A____A__, process_utilities.process_suid(current_process()), numeric_date_utilities.timestamp_with_milliseconds(UNPROVIDED, UNPROVIDED), Semaphores.semaphore_name(process_utilities.ipc_queue_semaphore(ipc_queue)), format(NIL, str, new SubLObject[]{ arg1, arg2, arg3 }), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    /**
     * Removes (dequeues) up to N items from IPC-QUEUE, returning
     * them in a list in the order of removal.
     */
    @LispMethod(comment = "Removes (dequeues) up to N items from IPC-QUEUE, returning\r\nthem in a list in the order of removal.\nRemoves (dequeues) up to N items from IPC-QUEUE, returning\nthem in a list in the order of removal.")
    public static final SubLObject ipc_dequeue_n(SubLObject ipc_queue, SubLObject n) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        SubLTrampolineFile.checkType(n, POSITIVE_INTEGER_P);
        SubLTrampolineFile.checkType(ipc_queue, IPC_QUEUE_P);
        if (n.numE(ONE_INTEGER)) {
            return ipc_dequeue(ipc_queue);
        }
        {
            SubLObject result = NIL;
            SubLObject lock = ipc_queue_lock(ipc_queue);
            SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
            SubLObject succeeded = NIL;
            try {
                Semaphores.semaphore_wait(ipc_queue_semaphore(ipc_queue));
                succeeded = T;
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (NIL != succeeded) {
                            {
                                SubLObject lock_19 = lock;
                                SubLObject release = NIL;
                                try {
                                    release = seize_lock(lock_19);
                                    {
                                        SubLObject tmp = queues.dequeue(data_queue);
                                        SubLObject count = ZERO_INTEGER;
                                        while ((NIL != tmp) && count.numL(n)) {
                                            result = cons(tmp, result);
                                            tmp = queues.dequeue(data_queue);
                                            count = add(count, ONE_INTEGER);
                                        } 
                                    }
                                } finally {
                                    if (NIL != release) {
                                        release_lock(lock_19);
                                    }
                                }
                            }
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
            return nreverse(result);
        }
    }

    public static SubLObject ipc_dequeue_n(final SubLObject ipc_queue, SubLObject n, SubLObject debugP) {
        if (n == UNPROVIDED) {
            n = $int$100;
        }
        if (debugP == UNPROVIDED) {
            debugP = process_utilities.$ipcq_debugP$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.non_negative_integer_p(n) : "! subl_promotions.non_negative_integer_p(n) " + ("subl_promotions.non_negative_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(n) ") + n;
        assert NIL != process_utilities.ipc_queue_p(ipc_queue) : "! process_utilities.ipc_queue_p(ipc_queue) " + ("process_utilities.ipc_queue_p(ipc_queue) " + "CommonSymbols.NIL != process_utilities.ipc_queue_p(ipc_queue) ") + ipc_queue;
        final SubLObject _prev_bind_0 = process_utilities.$ipcq_debugP$.currentBinding(thread);
        try {
            process_utilities.$ipcq_debugP$.bind(debugP, thread);
            SubLObject count = ZERO_INTEGER;
            SubLObject result = NIL;
            process_utilities.ipcq_debug(ipc_queue, process_utilities.$str139$Dequeueing__up_to___D_item__P_, n, UNPROVIDED, UNPROVIDED);
            while (count.numL(n) && process_utilities.ipc_current_queue_size(ipc_queue).numG(ZERO_INTEGER)) {
                result = cons(process_utilities.ipc_dequeue(ipc_queue, debugP), result);
                count = add(count, ONE_INTEGER);
            } 
            return nreverse(result);
        } finally {
            process_utilities.$ipcq_debugP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject ipc_drain(final SubLObject ipc_queue, SubLObject debugP) {
        if (debugP == UNPROVIDED) {
            debugP = process_utilities.$ipcq_debugP$.getDynamicValue();
        }
        return process_utilities.ipc_dequeue_n(ipc_queue, process_utilities.ipc_current_queue_size(ipc_queue), debugP);
    }

    public static final SubLObject ipc_dequeue_with_timeout_alt(SubLObject ipc_queue, SubLObject timeout_secs, SubLObject wait_slice) {
        if (wait_slice == UNPROVIDED) {
            wait_slice = $float$0_01;
        }
        {
            SubLObject timeout_realtime = elapsed_seconds_to_elapsed_internal_real_time(timeout_secs);
            SubLObject final_time = add(timeout_realtime, get_internal_real_time());
            while (get_internal_real_time().numL(final_time)) {
                if (ipc_current_queue_size(ipc_queue).isPositive()) {
                    return values(ipc_dequeue(ipc_queue), NIL);
                }
                sleep(wait_slice);
            } 
            return values(NIL, T);
        }
    }

    public static SubLObject ipc_dequeue_with_timeout(final SubLObject ipc_queue, final SubLObject timeout_secs, SubLObject wait_slice) {
        if (wait_slice == UNPROVIDED) {
            wait_slice = process_utilities.$float$0_01;
        }
        final SubLObject timeout_realtime = numeric_date_utilities.elapsed_seconds_to_elapsed_internal_real_time(timeout_secs);
        final SubLObject final_time = add(timeout_realtime, get_internal_real_time());
        while (get_internal_real_time().numL(final_time)) {
            if (process_utilities.ipc_current_queue_size(ipc_queue).isPositive()) {
                return values(process_utilities.ipc_dequeue(ipc_queue, UNPROVIDED), NIL);
            }
            sleep(wait_slice);
        } 
        return values(NIL, T);
    }

    public static final SubLObject ipc_current_queue_size_alt(SubLObject ipc_queue) {
        {
            SubLObject result = NIL;
            SubLObject time_stamp = NIL;
            SubLObject lock = ipc_queue_lock(ipc_queue);
            SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
            SubLObject lock_20 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_20);
                time_stamp = get_universal_time();
                result = queues.queue_size(data_queue);
            } finally {
                if (NIL != release) {
                    release_lock(lock_20);
                }
            }
            return values(result, time_stamp);
        }
    }

    public static SubLObject ipc_current_queue_size(final SubLObject ipc_queue) {
        SubLObject result = NIL;
        SubLObject time_stamp = NIL;
        final SubLObject lock = process_utilities.ipc_queue_lock(ipc_queue);
        final SubLObject data_queue = process_utilities.ipc_queue_data_queue(ipc_queue);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            time_stamp = get_universal_time();
            result = queues.queue_size(data_queue);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return values(result, time_stamp);
    }

    public static final SubLObject ipc_current_queue_content_alt(SubLObject ipc_queue) {
        {
            SubLObject result = NIL;
            SubLObject time_stamp = NIL;
            SubLObject lock = ipc_queue_lock(ipc_queue);
            SubLObject data_queue = ipc_queue_data_queue(ipc_queue);
            SubLObject lock_21 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_21);
                time_stamp = get_universal_time();
                result = queues.queue_elements(data_queue);
            } finally {
                if (NIL != release) {
                    release_lock(lock_21);
                }
            }
            return values(result, time_stamp);
        }
    }

    public static SubLObject ipc_current_queue_content(final SubLObject ipc_queue) {
        SubLObject result = NIL;
        SubLObject time_stamp = NIL;
        final SubLObject lock = process_utilities.ipc_queue_lock(ipc_queue);
        final SubLObject data_queue = process_utilities.ipc_queue_data_queue(ipc_queue);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            time_stamp = get_universal_time();
            result = queues.queue_elements(data_queue);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return values(result, time_stamp);
    }

    public static SubLObject launch_ipcq_test_producer(final SubLObject ipc_queue, SubLObject delay) {
        if (delay == UNPROVIDED) {
            delay = ZERO_INTEGER;
        }
        return process_utilities.make_cyc_server_process_with_args(process_utilities.$$$IPCQ_Test_Producer, process_utilities.IPCQ_TEST_PRODUCER_RUN, list(ipc_queue, delay));
    }

    public static SubLObject ipcq_test_producer_run(final SubLObject ipc_queue, SubLObject delay) {
        if (delay == UNPROVIDED) {
            delay = ZERO_INTEGER;
        }
        sleep(delay);
        SubLObject cdolist_list_var = process_utilities.$ipcq_test_items$.getGlobalValue();
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            process_utilities.ipc_enqueue(item, ipc_queue, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject test_ipc_enqueue_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ipc_queue = process_utilities.new_ipc_queue(process_utilities.$$$Test_IPC_Queue);
        process_utilities.launch_ipcq_test_producer(ipc_queue, UNPROVIDED);
        SubLObject cdolist_list_var = process_utilities.$ipcq_test_items$.getGlobalValue();
        SubLObject item = NIL;
        item = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject result = process_utilities.ipc_dequeue(ipc_queue, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!item.equal(result))) {
                Errors.error(process_utilities.$str145$Expected__S__got__S, item, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            item = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject test_ipc_enqueue_drain() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ipc_queue = process_utilities.new_ipc_queue(process_utilities.$$$Test_IPC_Queue);
        process_utilities.launch_ipcq_test_producer(ipc_queue, UNPROVIDED);
        while (!length(process_utilities.$ipcq_test_items$.getGlobalValue()).equal(process_utilities.ipc_current_queue_size(ipc_queue))) {
            sleep(ONE_INTEGER);
        } 
        final SubLObject result = process_utilities.ipc_drain(ipc_queue, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!process_utilities.$ipcq_test_items$.getGlobalValue().equal(result))) {
            Errors.error(process_utilities.$str145$Expected__S__got__S, process_utilities.$ipcq_test_items$.getGlobalValue(), result);
        }
        return T;
    }

    public static SubLObject test_ipc_enqueue_drain_dequeue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ipc_queue = process_utilities.new_ipc_queue(process_utilities.$$$Test_IPC_Queue);
        process_utilities.launch_ipcq_test_producer(ipc_queue, UNPROVIDED);
        while (!length(process_utilities.$ipcq_test_items$.getGlobalValue()).equal(process_utilities.ipc_current_queue_size(ipc_queue))) {
            sleep(ONE_INTEGER);
        } 
        process_utilities.ipc_drain(ipc_queue, UNPROVIDED);
        process_utilities.launch_ipcq_test_producer(ipc_queue, TWO_INTEGER);
        final SubLObject expected = process_utilities.$ipcq_test_items$.getGlobalValue().first();
        final SubLObject actual = process_utilities.ipc_dequeue(ipc_queue, UNPROVIDED);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!expected.equal(actual))) {
            Errors.error(process_utilities.$str145$Expected__S__got__S, expected, actual);
        }
        return T;
    }

    public static final SubLObject ordered_ipc_queue_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject ordered_ipc_queue_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject ordered_ipc_queue_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.process_utilities.$ordered_ipc_queue_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject ordered_ipc_queue_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.process_utilities.$ordered_ipc_queue_native.class ? T : NIL;
    }

    public static final SubLObject ordrd_ipcq_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, process_utilities.ORDERED_IPC_QUEUE_P);
        return (($ordered_ipc_queue_native)v_object).$lock;
    }

    public static SubLObject ordrd_ipcq_lock(final SubLObject v_object) {
        assert NIL != process_utilities.ordered_ipc_queue_p(v_object) : "! process_utilities.ordered_ipc_queue_p(v_object) " + "process_utilities.ordered_ipc_queue_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject ordrd_ipcq_producer_isg_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, process_utilities.ORDERED_IPC_QUEUE_P);
        return (($ordered_ipc_queue_native)v_object).$producer_isg;
    }

    public static SubLObject ordrd_ipcq_producer_isg(final SubLObject v_object) {
        assert NIL != process_utilities.ordered_ipc_queue_p(v_object) : "! process_utilities.ordered_ipc_queue_p(v_object) " + "process_utilities.ordered_ipc_queue_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject ordrd_ipcq_consumer_isg_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, process_utilities.ORDERED_IPC_QUEUE_P);
        return (($ordered_ipc_queue_native)v_object).$consumer_isg;
    }

    public static SubLObject ordrd_ipcq_consumer_isg(final SubLObject v_object) {
        assert NIL != process_utilities.ordered_ipc_queue_p(v_object) : "! process_utilities.ordered_ipc_queue_p(v_object) " + "process_utilities.ordered_ipc_queue_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject ordrd_ipcq_payload_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, process_utilities.ORDERED_IPC_QUEUE_P);
        return (($ordered_ipc_queue_native)v_object).$payload;
    }

    public static SubLObject ordrd_ipcq_payload(final SubLObject v_object) {
        assert NIL != process_utilities.ordered_ipc_queue_p(v_object) : "! process_utilities.ordered_ipc_queue_p(v_object) " + "process_utilities.ordered_ipc_queue_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject ordrd_ipcq_early_consumer_semaphore(final SubLObject v_object) {
        assert NIL != process_utilities.ordered_ipc_queue_p(v_object) : "! process_utilities.ordered_ipc_queue_p(v_object) " + "process_utilities.ordered_ipc_queue_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_ordrd_ipcq_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, process_utilities.ORDERED_IPC_QUEUE_P);
        return (($ordered_ipc_queue_native)v_object).$lock = (value);
    }

    public static SubLObject _csetf_ordrd_ipcq_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.ordered_ipc_queue_p(v_object) : "! process_utilities.ordered_ipc_queue_p(v_object) " + "process_utilities.ordered_ipc_queue_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ordrd_ipcq_producer_isg_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, process_utilities.ORDERED_IPC_QUEUE_P);
        return (($ordered_ipc_queue_native)v_object).$producer_isg = (value);
    }

    public static SubLObject _csetf_ordrd_ipcq_producer_isg(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.ordered_ipc_queue_p(v_object) : "! process_utilities.ordered_ipc_queue_p(v_object) " + "process_utilities.ordered_ipc_queue_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_ordrd_ipcq_consumer_isg_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, process_utilities.ORDERED_IPC_QUEUE_P);
        return (($ordered_ipc_queue_native)v_object).$consumer_isg = (value);
    }

    public static SubLObject _csetf_ordrd_ipcq_consumer_isg(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.ordered_ipc_queue_p(v_object) : "! process_utilities.ordered_ipc_queue_p(v_object) " + "process_utilities.ordered_ipc_queue_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_ordrd_ipcq_payload_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, process_utilities.ORDERED_IPC_QUEUE_P);
        return (($ordered_ipc_queue_native)v_object).$payload = (value);
    }

    public static SubLObject _csetf_ordrd_ipcq_payload(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.ordered_ipc_queue_p(v_object) : "! process_utilities.ordered_ipc_queue_p(v_object) " + "process_utilities.ordered_ipc_queue_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_ordrd_ipcq_early_consumer_semaphore(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.ordered_ipc_queue_p(v_object) : "! process_utilities.ordered_ipc_queue_p(v_object) " + "process_utilities.ordered_ipc_queue_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_ordered_ipc_queue_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.process_utilities.$ordered_ipc_queue_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($LOCK)) {
                        _csetf_ordrd_ipcq_lock(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PRODUCER_ISG)) {
                            _csetf_ordrd_ipcq_producer_isg(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CONSUMER_ISG)) {
                                _csetf_ordrd_ipcq_consumer_isg(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PAYLOAD)) {
                                    _csetf_ordrd_ipcq_payload(v_new, current_value);
                                } else {
                                    Errors.error($str_alt21$Invalid_slot__S_for_construction_, current_arg);
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_ordered_ipc_queue(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.process_utilities.$ordered_ipc_queue_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($LOCK)) {
                process_utilities._csetf_ordrd_ipcq_lock(v_new, current_value);
            } else
                if (pcase_var.eql($PRODUCER_ISG)) {
                    process_utilities._csetf_ordrd_ipcq_producer_isg(v_new, current_value);
                } else
                    if (pcase_var.eql($CONSUMER_ISG)) {
                        process_utilities._csetf_ordrd_ipcq_consumer_isg(v_new, current_value);
                    } else
                        if (pcase_var.eql($PAYLOAD)) {
                            process_utilities._csetf_ordrd_ipcq_payload(v_new, current_value);
                        } else
                            if (pcase_var.eql(process_utilities.$EARLY_CONSUMER_SEMAPHORE)) {
                                process_utilities._csetf_ordrd_ipcq_early_consumer_semaphore(v_new, current_value);
                            } else {
                                Errors.error(process_utilities.$str28$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_ordered_ipc_queue(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, process_utilities.MAKE_ORDERED_IPC_QUEUE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $LOCK, process_utilities.ordrd_ipcq_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $PRODUCER_ISG, process_utilities.ordrd_ipcq_producer_isg(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSUMER_ISG, process_utilities.ordrd_ipcq_consumer_isg(obj));
        funcall(visitor_fn, obj, $SLOT, $PAYLOAD, process_utilities.ordrd_ipcq_payload(obj));
        funcall(visitor_fn, obj, $SLOT, process_utilities.$EARLY_CONSUMER_SEMAPHORE, process_utilities.ordrd_ipcq_early_consumer_semaphore(obj));
        funcall(visitor_fn, obj, $END, process_utilities.MAKE_ORDERED_IPC_QUEUE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_ordered_ipc_queue_method(final SubLObject obj, final SubLObject visitor_fn) {
        return process_utilities.visit_defstruct_ordered_ipc_queue(obj, visitor_fn);
    }

    /**
     * Create a new ordered IPC queue, that will use NAME as the root of its various lock
     * and process names. The queue will have SIZE-LIMIT entries at most.
     *
     * @unknown SIZE-LIMIT is currently not used.
     */
    @LispMethod(comment = "Create a new ordered IPC queue, that will use NAME as the root of its various lock\r\nand process names. The queue will have SIZE-LIMIT entries at most.\r\n\r\n@unknown SIZE-LIMIT is currently not used.\nCreate a new ordered IPC queue, that will use NAME as the root of its various lock\nand process names. The queue will have SIZE-LIMIT entries at most.")
    public static final SubLObject new_ordered_ipc_queue_alt(SubLObject name, SubLObject size_limit) {
        if (size_limit == UNPROVIDED) {
            size_limit = NIL;
        }
        SubLTrampolineFile.checkType(name, STRINGP);
        {
            SubLObject o_ipcq = make_ordered_ipc_queue(UNPROVIDED);
            SubLObject lock_name = cconcatenate($str_alt131$Lock_for_Ordered_IPC_Queue_, name);
            _csetf_ordrd_ipcq_lock(o_ipcq, make_lock(lock_name));
            _csetf_ordrd_ipcq_producer_isg(o_ipcq, integer_sequence_generator.new_integer_sequence_generator(ZERO_INTEGER, size_limit, UNPROVIDED));
            _csetf_ordrd_ipcq_consumer_isg(o_ipcq, integer_sequence_generator.new_integer_sequence_generator(ZERO_INTEGER, size_limit, UNPROVIDED));
            _csetf_ordrd_ipcq_payload(o_ipcq, dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
            return o_ipcq;
        }
    }

    /**
     * Create a new ordered IPC queue, that will use NAME as the root of its various lock
     * and process names. The queue will have SIZE-LIMIT entries at most.
     *
     * @unknown SIZE-LIMIT is currently not used.
     */
    @LispMethod(comment = "Create a new ordered IPC queue, that will use NAME as the root of its various lock\r\nand process names. The queue will have SIZE-LIMIT entries at most.\r\n\r\n@unknown SIZE-LIMIT is currently not used.\nCreate a new ordered IPC queue, that will use NAME as the root of its various lock\nand process names. The queue will have SIZE-LIMIT entries at most.")
    public static SubLObject new_ordered_ipc_queue(final SubLObject name, SubLObject size_limit) {
        if (size_limit == UNPROVIDED) {
            size_limit = NIL;
        }
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        final SubLObject o_ipcq = process_utilities.make_ordered_ipc_queue(UNPROVIDED);
        final SubLObject lock_name = cconcatenate(process_utilities.$$$Lock_for_Ordered_IPC_Queue_, name);
        process_utilities._csetf_ordrd_ipcq_lock(o_ipcq, make_lock(lock_name));
        process_utilities._csetf_ordrd_ipcq_producer_isg(o_ipcq, integer_sequence_generator.new_integer_sequence_generator(ZERO_INTEGER, size_limit, UNPROVIDED));
        process_utilities._csetf_ordrd_ipcq_consumer_isg(o_ipcq, integer_sequence_generator.new_integer_sequence_generator(ZERO_INTEGER, size_limit, UNPROVIDED));
        process_utilities._csetf_ordrd_ipcq_payload(o_ipcq, dictionary_utilities.new_synchronized_dictionary(UNPROVIDED, UNPROVIDED));
        process_utilities._csetf_ordrd_ipcq_early_consumer_semaphore(o_ipcq, Semaphores.new_semaphore(process_utilities.$$$Ordered_IPCQ_Early_Producer, ZERO_INTEGER));
        return o_ipcq;
    }

    /**
     * Enqueue element ITEM with the ordered IPC queue O-IPCQ. Return T if that resulted
     * in awakening a waiting process, NIL if not.
     */
    @LispMethod(comment = "Enqueue element ITEM with the ordered IPC queue O-IPCQ. Return T if that resulted\r\nin awakening a waiting process, NIL if not.\nEnqueue element ITEM with the ordered IPC queue O-IPCQ. Return T if that resulted\nin awakening a waiting process, NIL if not.")
    public static final SubLObject ordered_ipc_enqueue_alt(SubLObject item, SubLObject o_ipcq) {
        SubLTrampolineFile.checkType(o_ipcq, ORDERED_IPC_QUEUE_P);
        {
            SubLObject ticket = integer_sequence_generator.integer_sequence_generator_next(ordrd_ipcq_producer_isg(o_ipcq));
            SubLObject lock = ordrd_ipcq_lock(o_ipcq);
            SubLObject payload = ordrd_ipcq_payload(o_ipcq);
            SubLObject awoke_someoneP = NIL;
            SubLObject lock_22 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_22);
                {
                    SubLObject entry = dictionary.dictionary_lookup(payload, ticket, $ordered_ipcq_empty$.getGlobalValue());
                    dictionary.dictionary_enter(payload, ticket, item);
                    if ($ordered_ipcq_empty$.getGlobalValue() == entry) {
                        awoke_someoneP = NIL;
                    } else {
                        if (NIL != valid_process_p(entry)) {
                            process_unblock(entry);
                            awoke_someoneP = T;
                        } else {
                            if (NIL != processp(entry)) {
                                awoke_someoneP = ordered_ipc_enqueue(item, o_ipcq);
                            } else {
                                Errors.error($str_alt132$Unexpected_entry__A_in_the_payloa, entry, o_ipcq);
                            }
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock_22);
                }
            }
            return awoke_someoneP;
        }
    }

    /**
     * Enqueue element ITEM with the ordered IPC queue O-IPCQ. Return T if that resulted
     * in awakening a waiting process, NIL if not.
     */
    @LispMethod(comment = "Enqueue element ITEM with the ordered IPC queue O-IPCQ. Return T if that resulted\r\nin awakening a waiting process, NIL if not.\nEnqueue element ITEM with the ordered IPC queue O-IPCQ. Return T if that resulted\nin awakening a waiting process, NIL if not.")
    public static SubLObject ordered_ipc_enqueue(final SubLObject item, final SubLObject o_ipcq) {
        assert NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) : "! process_utilities.ordered_ipc_queue_p(o_ipcq) " + ("process_utilities.ordered_ipc_queue_p(o_ipcq) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) ") + o_ipcq;
        final SubLObject ticket = integer_sequence_generator.integer_sequence_generator_next(process_utilities.ordrd_ipcq_producer_isg(o_ipcq));
        final SubLObject lock = process_utilities.ordrd_ipcq_lock(o_ipcq);
        final SubLObject payload = process_utilities.ordrd_ipcq_payload(o_ipcq);
        SubLObject awoke_someoneP = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject entry = map_utilities.map_get(payload, ticket, process_utilities.$ordered_ipcq_empty$.getGlobalValue());
            map_utilities.map_put(payload, ticket, item);
            if (process_utilities.$ordered_ipcq_empty$.getGlobalValue().eql(entry)) {
                awoke_someoneP = NIL;
            } else
                if (NIL != valid_process_p(entry)) {
                    Semaphores.semaphore_signal(process_utilities.ordrd_ipcq_early_consumer_semaphore(o_ipcq));
                    awoke_someoneP = T;
                } else
                    if (NIL != processp(entry)) {
                        awoke_someoneP = process_utilities.ordered_ipc_enqueue(item, o_ipcq);
                    } else {
                        Errors.error(process_utilities.$str184$Unexpected_entry__A_in_the_payloa, entry, o_ipcq);
                    }


        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return awoke_someoneP;
    }

    /**
     * Block until an element becomes available, then dequeue the element from the
     * ordered IPC queue O-IPCQ and return it to the caller.
     */
    @LispMethod(comment = "Block until an element becomes available, then dequeue the element from the\r\nordered IPC queue O-IPCQ and return it to the caller.\nBlock until an element becomes available, then dequeue the element from the\nordered IPC queue O-IPCQ and return it to the caller.")
    public static final SubLObject ordered_ipc_dequeue_alt(SubLObject o_ipcq) {
        SubLTrampolineFile.checkType(o_ipcq, ORDERED_IPC_QUEUE_P);
        {
            SubLObject ticket = integer_sequence_generator.integer_sequence_generator_next(ordrd_ipcq_consumer_isg(o_ipcq));
            SubLObject lock = ordrd_ipcq_lock(o_ipcq);
            SubLObject payload = ordrd_ipcq_payload(o_ipcq);
            SubLObject entry = $ordered_ipcq_empty$.getGlobalValue();
            SubLObject sleepP = NIL;
            while ($ordered_ipcq_empty$.getGlobalValue() == entry) {
                {
                    SubLObject lock_23 = lock;
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(lock_23);
                        entry = dictionary.dictionary_lookup(payload, ticket, $ordered_ipcq_empty$.getGlobalValue());
                        if ($ordered_ipcq_empty$.getGlobalValue() == entry) {
                            dictionary.dictionary_enter(payload, ticket, current_process());
                            sleepP = T;
                        } else {
                            dictionary.dictionary_remove(payload, ticket);
                        }
                    } finally {
                        if (NIL != release) {
                            release_lock(lock_23);
                        }
                    }
                }
                if (NIL != sleepP) {
                    process_block();
                }
            } 
            return entry;
        }
    }

    /**
     * Block until an element becomes available, then dequeue the element from the
     * ordered IPC queue O-IPCQ and return it to the caller.
     */
    @LispMethod(comment = "Block until an element becomes available, then dequeue the element from the\r\nordered IPC queue O-IPCQ and return it to the caller.\nBlock until an element becomes available, then dequeue the element from the\nordered IPC queue O-IPCQ and return it to the caller.")
    public static SubLObject ordered_ipc_dequeue(final SubLObject o_ipcq) {
        assert NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) : "! process_utilities.ordered_ipc_queue_p(o_ipcq) " + ("process_utilities.ordered_ipc_queue_p(o_ipcq) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) ") + o_ipcq;
        final SubLObject ticket = integer_sequence_generator.integer_sequence_generator_next(process_utilities.ordrd_ipcq_consumer_isg(o_ipcq));
        final SubLObject lock = process_utilities.ordrd_ipcq_lock(o_ipcq);
        final SubLObject payload = process_utilities.ordrd_ipcq_payload(o_ipcq);
        SubLObject entry = process_utilities.$ordered_ipcq_empty$.getGlobalValue();
        while (process_utilities.$ordered_ipcq_empty$.getGlobalValue().eql(entry)) {
            SubLObject earlyP = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                entry = map_utilities.map_get_without_values(payload, ticket, process_utilities.$ordered_ipcq_empty$.getGlobalValue());
                if (process_utilities.$ordered_ipcq_empty$.getGlobalValue().eql(entry)) {
                    map_utilities.map_put(payload, ticket, current_process());
                    earlyP = T;
                } else {
                    map_utilities.map_remove(payload, ticket);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (NIL != earlyP) {
                Semaphores.semaphore_wait(process_utilities.ordrd_ipcq_early_consumer_semaphore(o_ipcq));
            }
        } 
        return entry;
    }

    public static SubLObject ordered_ipc_queue_emptyP(final SubLObject o_ipcq) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator_var = map_utilities.new_map_iterator(process_utilities.ordrd_ipcq_payload(o_ipcq));
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject entry = iteration.iteration_next(iterator_var);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                final SubLObject value = second(entry);
                if (NIL == processp(value)) {
                    return NIL;
                }
            }
        }
        return T;
    }

    /**
     * Returns the FIXNUM-P of elments currently waiting in O-IPCQ.
     *
     * @unknown There is no way to ask an ISG for its current value, so we need this
    expensive way.
     */
    @LispMethod(comment = "Returns the FIXNUM-P of elments currently waiting in O-IPCQ.\r\n\r\n@unknown There is no way to ask an ISG for its current value, so we need this\r\nexpensive way.")
    public static final SubLObject ordered_ipc_current_queue_size(SubLObject o_ipcq) {
        SubLTrampolineFile.checkType(o_ipcq, ORDERED_IPC_QUEUE_P);
        return length(ordered_ipc_current_queue_contents(o_ipcq));
    }

    public static SubLObject ordered_ipc_current_queue_size(final SubLObject o_ipcq, SubLObject estimation_threshold) {
        if (estimation_threshold == UNPROVIDED) {
            estimation_threshold = process_utilities.$ordered_ipc_current_queue_size_estimation_threshold$.getDynamicValue();
        }
        assert NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) : "! process_utilities.ordered_ipc_queue_p(o_ipcq) " + ("process_utilities.ordered_ipc_queue_p(o_ipcq) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) ") + o_ipcq;
        SubLObject estimate = subtract(integer_sequence_generator.get_integer_sequence_generator_recent(process_utilities.ordrd_ipcq_producer_isg(o_ipcq)), integer_sequence_generator.get_integer_sequence_generator_recent(process_utilities.ordrd_ipcq_consumer_isg(o_ipcq)));
        if ((!estimate.eql(ZERO_INTEGER)) || (NIL == process_utilities.ordered_ipc_queue_emptyP(o_ipcq))) {
            estimate = add(estimate, ONE_INTEGER);
        }
        return estimate.numG(estimation_threshold) ? estimate : length(process_utilities.ordered_ipc_current_queue_contents(o_ipcq));
    }

    /**
     * Returns a LISTP of the elements currently awaiting pickup in O-IPCQ.
     *
     * @unknown This assumes that processes are never stored there -- which may be wrong.
     */
    @LispMethod(comment = "Returns a LISTP of the elements currently awaiting pickup in O-IPCQ.\r\n\r\n@unknown This assumes that processes are never stored there -- which may be wrong.")
    public static final SubLObject ordered_ipc_current_queue_contents_alt(SubLObject o_ipcq) {
        SubLTrampolineFile.checkType(o_ipcq, ORDERED_IPC_QUEUE_P);
        return remove_if(PROCESSP, dictionary.dictionary_values(ordrd_ipcq_payload(o_ipcq)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     * Returns a LISTP of the elements currently awaiting pickup in O-IPCQ.
     *
     * @unknown This assumes that processes are never stored there -- which may be wrong.
     */
    @LispMethod(comment = "Returns a LISTP of the elements currently awaiting pickup in O-IPCQ.\r\n\r\n@unknown This assumes that processes are never stored there -- which may be wrong.")
    public static SubLObject ordered_ipc_current_queue_contents(final SubLObject o_ipcq) {
        assert NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) : "! process_utilities.ordered_ipc_queue_p(o_ipcq) " + ("process_utilities.ordered_ipc_queue_p(o_ipcq) " + "CommonSymbols.NIL != process_utilities.ordered_ipc_queue_p(o_ipcq) ") + o_ipcq;
        return remove_if(PROCESSP, map_utilities.map_values(process_utilities.ordrd_ipcq_payload(o_ipcq)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject ordered_ipc_queue_quiescedP(final SubLObject o_ipcq) {
        return map_utilities.map_empty_p(process_utilities.ordrd_ipcq_payload(o_ipcq));
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * 		Kills any process having the given process name. Note
     * 		that kill-process is not yet supported on Win32.
     */
    @LispMethod(comment = "@param NAME;\r\n\t\tstringp\r\n\t\tKills any process having the given process name. Note\r\n\t\tthat kill-process is not yet supported on Win32.")
    public static final SubLObject kill_process_named_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, STRINGP);
        {
            SubLObject cdolist_list_var = all_processes();
            SubLObject process = NIL;
            for (process = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , process = cdolist_list_var.first()) {
                {
                    SubLObject process_name = process_name(process);
                    if (NIL != Strings.stringE(name, process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        kill_process(process);
                    }
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
     * 		Kills any process having the given process name. Note
     * 		that kill-process is not yet supported on Win32.
     */
    @LispMethod(comment = "@param NAME;\r\n\t\tstringp\r\n\t\tKills any process having the given process name. Note\r\n\t\tthat kill-process is not yet supported on Win32.")
    public static SubLObject kill_process_named(final SubLObject name) {
        SubLTrampolineFile.enforceType(name, STRINGP);
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject process_name = process_name(process);
            if (NIL != Strings.stringE(name, process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                kill_process(process);
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @param NAME;
     * 		stringp
     * 		Returns the first process having the given process name.
     */
    @LispMethod(comment = "@param NAME;\r\n\t\tstringp\r\n\t\tReturns the first process having the given process name.")
    public static final SubLObject process_named_alt(SubLObject name) {
        SubLTrampolineFile.checkType(name, STRINGP);
        {
            SubLObject cdolist_list_var = all_processes();
            SubLObject process = NIL;
            for (process = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , process = cdolist_list_var.first()) {
                {
                    SubLObject process_name = process_name(process);
                    if (NIL != Strings.stringE(name, process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return process;
                    }
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
     * 		Returns the first process having the given process name.
     */
    @LispMethod(comment = "@param NAME;\r\n\t\tstringp\r\n\t\tReturns the first process having the given process name.")
    public static SubLObject process_named(final SubLObject name) {
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        SubLObject cdolist_list_var = all_processes();
        SubLObject process = NIL;
        process = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject process_name = process_name(process);
            if (NIL != Strings.stringE(name, process_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return process;
            }
            cdolist_list_var = cdolist_list_var.rest();
            process = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject process_exhaust_immediately_fn_alt() {
        return NIL;
    }

    public static SubLObject process_exhaust_immediately_fn() {
        return NIL;
    }

    /**
     * A wrapper for creating an already exhausted process.
     */
    @LispMethod(comment = "A wrapper for creating an already exhausted process.")
    public static final SubLObject make_exhausted_process_alt(SubLObject name) {
        return make_process(name, PROCESS_EXHAUST_IMMEDIATELY_FN);
    }

    /**
     * A wrapper for creating an already exhausted process.
     */
    @LispMethod(comment = "A wrapper for creating an already exhausted process.")
    public static SubLObject make_exhausted_process(final SubLObject name) {
        return make_process(name, process_utilities.PROCESS_EXHAUST_IMMEDIATELY_FN);
    }

    public static final SubLObject visit_defstruct_object_process_method_alt(SubLObject v_object, SubLObject visitor_fn) {
        return visit_defstruct_object_process(v_object, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_process_method(final SubLObject v_object, final SubLObject visitor_fn) {
        return process_utilities.visit_defstruct_object_process(v_object, visitor_fn);
    }

    public static final SubLObject visit_defstruct_object_process_alt(SubLObject process, SubLObject visitor_fn) {
        funcall(visitor_fn, process, $BEGIN, MAKE_EXHAUSTED_PROCESS, ONE_INTEGER);
        funcall(visitor_fn, process, $SLOT, $NAME, process_name(process));
        funcall(visitor_fn, process, $END, MAKE_EXHAUSTED_PROCESS, ONE_INTEGER);
        return process;
    }

    public static SubLObject visit_defstruct_object_process(final SubLObject process, final SubLObject visitor_fn) {
        funcall(visitor_fn, process, $BEGIN, process_utilities.MAKE_EXHAUSTED_PROCESS, ONE_INTEGER);
        funcall(visitor_fn, process, $SLOT, $NAME, process_name(process));
        funcall(visitor_fn, process, $END, process_utilities.MAKE_EXHAUSTED_PROCESS, ONE_INTEGER);
        return process;
    }

    public static final SubLObject visit_defstruct_object_lock_method_alt(SubLObject v_object, SubLObject visitor_fn) {
        return visit_defstruct_object_lock(v_object, visitor_fn);
    }

    public static SubLObject visit_defstruct_object_lock_method(final SubLObject v_object, final SubLObject visitor_fn) {
        return process_utilities.visit_defstruct_object_lock(v_object, visitor_fn);
    }

    public static final SubLObject visit_defstruct_object_lock_alt(SubLObject lock, SubLObject visitor_fn) {
        funcall(visitor_fn, lock, $BEGIN, MAKE_LOCK, ONE_INTEGER);
        funcall(visitor_fn, lock, $SLOT, $NAME, lock_name(lock));
        funcall(visitor_fn, lock, $END, MAKE_LOCK, ONE_INTEGER);
        return lock;
    }

    public static SubLObject visit_defstruct_object_lock(final SubLObject lock, final SubLObject visitor_fn) {
        funcall(visitor_fn, lock, $BEGIN, MAKE_LOCK, ONE_INTEGER);
        funcall(visitor_fn, lock, $SLOT, $NAME, lock_name(lock));
        funcall(visitor_fn, lock, $END, MAKE_LOCK, ONE_INTEGER);
        return lock;
    }

    public static final SubLObject process_wrapper_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject process_wrapper_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject process_wrapper_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject process_wrapper_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native.class ? T : NIL;
    }

    public static final SubLObject process_wrapper_id_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PROCESS_WRAPPER_P);
        return v_object.getField2();
    }

    public static SubLObject process_wrapper_id(final SubLObject v_object) {
        assert NIL != process_utilities.process_wrapper_p(v_object) : "! process_utilities.process_wrapper_p(v_object) " + "process_utilities.process_wrapper_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject process_wrapper_process_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PROCESS_WRAPPER_P);
        return v_object.getField3();
    }

    public static SubLObject process_wrapper_process(final SubLObject v_object) {
        assert NIL != process_utilities.process_wrapper_p(v_object) : "! process_utilities.process_wrapper_p(v_object) " + "process_utilities.process_wrapper_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject process_wrapper_state_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PROCESS_WRAPPER_P);
        return v_object.getField4();
    }

    public static SubLObject process_wrapper_state(final SubLObject v_object) {
        assert NIL != process_utilities.process_wrapper_p(v_object) : "! process_utilities.process_wrapper_p(v_object) " + "process_utilities.process_wrapper_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject process_wrapper_lock_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PROCESS_WRAPPER_P);
        return v_object.getField5();
    }

    public static SubLObject process_wrapper_lock(final SubLObject v_object) {
        assert NIL != process_utilities.process_wrapper_p(v_object) : "! process_utilities.process_wrapper_p(v_object) " + "process_utilities.process_wrapper_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject process_wrapper_plist_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, PROCESS_WRAPPER_P);
        return v_object.getField6();
    }

    public static SubLObject process_wrapper_plist(final SubLObject v_object) {
        assert NIL != process_utilities.process_wrapper_p(v_object) : "! process_utilities.process_wrapper_p(v_object) " + "process_utilities.process_wrapper_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_process_wrapper_id_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PROCESS_WRAPPER_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_process_wrapper_id(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.process_wrapper_p(v_object) : "! process_utilities.process_wrapper_p(v_object) " + "process_utilities.process_wrapper_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_process_wrapper_process_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PROCESS_WRAPPER_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_process_wrapper_process(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.process_wrapper_p(v_object) : "! process_utilities.process_wrapper_p(v_object) " + "process_utilities.process_wrapper_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_process_wrapper_state_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PROCESS_WRAPPER_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_process_wrapper_state(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.process_wrapper_p(v_object) : "! process_utilities.process_wrapper_p(v_object) " + "process_utilities.process_wrapper_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_process_wrapper_lock_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PROCESS_WRAPPER_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_process_wrapper_lock(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.process_wrapper_p(v_object) : "! process_utilities.process_wrapper_p(v_object) " + "process_utilities.process_wrapper_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_process_wrapper_plist_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, PROCESS_WRAPPER_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_process_wrapper_plist(final SubLObject v_object, final SubLObject value) {
        assert NIL != process_utilities.process_wrapper_p(v_object) : "! process_utilities.process_wrapper_p(v_object) " + "process_utilities.process_wrapper_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_process_wrapper_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_process_wrapper_id(v_new, current_value);
                    } else {
                        if (pcase_var.eql($PROCESS)) {
                            _csetf_process_wrapper_process(v_new, current_value);
                        } else {
                            if (pcase_var.eql($STATE)) {
                                _csetf_process_wrapper_state(v_new, current_value);
                            } else {
                                if (pcase_var.eql($LOCK)) {
                                    _csetf_process_wrapper_lock(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PLIST)) {
                                        _csetf_process_wrapper_plist(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt21$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_process_wrapper(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.process_utilities.$process_wrapper_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($ID)) {
                process_utilities._csetf_process_wrapper_id(v_new, current_value);
            } else
                if (pcase_var.eql($PROCESS)) {
                    process_utilities._csetf_process_wrapper_process(v_new, current_value);
                } else
                    if (pcase_var.eql($STATE)) {
                        process_utilities._csetf_process_wrapper_state(v_new, current_value);
                    } else
                        if (pcase_var.eql($LOCK)) {
                            process_utilities._csetf_process_wrapper_lock(v_new, current_value);
                        } else
                            if (pcase_var.eql($PLIST)) {
                                process_utilities._csetf_process_wrapper_plist(v_new, current_value);
                            } else {
                                Errors.error(process_utilities.$str28$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_process_wrapper(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, process_utilities.MAKE_PROCESS_WRAPPER, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $ID, process_utilities.process_wrapper_id(obj));
        funcall(visitor_fn, obj, $SLOT, $PROCESS, process_utilities.process_wrapper_process(obj));
        funcall(visitor_fn, obj, $SLOT, $STATE, process_utilities.process_wrapper_state(obj));
        funcall(visitor_fn, obj, $SLOT, $LOCK, process_utilities.process_wrapper_lock(obj));
        funcall(visitor_fn, obj, $SLOT, $PLIST, process_utilities.process_wrapper_plist(obj));
        funcall(visitor_fn, obj, $END, process_utilities.MAKE_PROCESS_WRAPPER, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_process_wrapper_method(final SubLObject obj, final SubLObject visitor_fn) {
        return process_utilities.visit_defstruct_process_wrapper(obj, visitor_fn);
    }

    /**
     * An isg used for setting the process-id slot.
     */
    // @SubL(source = "cycl/process-utilities.lisp", position = 28387)
    // private static SubLSymbol $process_wrapper_isg$ = null;
    /**
     * Make a new process wrapper.
     *
     * @unknown that the arglist signature for PROCESS-WRAPPER-FUNCTION should look like: (PROCESS-WRAPPER [rest of the args]) and REST-ARGS should be the rest of the args.
     */
    @LispMethod(comment = "An isg used for setting the process-id slot.\n@SubL(source = \"cycl/process-utilities.lisp\", position = 28387)\nprivate static SubLSymbol $process_wrapper_isg$ = null;\nMake a new process wrapper.")
    public static final SubLObject new_process_wrapper_alt(SubLObject name, SubLObject process_wrapper_function, SubLObject rest_args) {
        if (rest_args == UNPROVIDED) {
            rest_args = NIL;
        }
        {
            SubLObject process_lock = make_lock(name);
            SubLObject process_wrapper = NIL;
            SubLObject lock = process_lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                process_wrapper = make_process_wrapper(list($LOCK, process_lock, $STATE, $STARTING, $ID, integer_sequence_generator.integer_sequence_generator_next($process_wrapper_isg$.getGlobalValue())));
                {
                    SubLObject process = make_cyc_server_process_with_args(name, NEW_PROCESS_WRAPPER_INT, list(process_wrapper, process_wrapper_function, rest_args));
                    _csetf_process_wrapper_process(process_wrapper, process);
                    _csetf_process_wrapper_state(process_wrapper, $RUNNING);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return process_wrapper;
        }
    }

    /**
     * An isg used for setting the process-id slot.
     */
    // @SubL(source = "cycl/process-utilities.lisp", position = 28387)
    // private static SubLSymbol $process_wrapper_isg$ = null;
    /**
     * Make a new process wrapper.
     *
     * @unknown that the arglist signature for PROCESS-WRAPPER-FUNCTION should look like: (PROCESS-WRAPPER [rest of the args]) and REST-ARGS should be the rest of the args.
     */
    @LispMethod(comment = "An isg used for setting the process-id slot.\n@SubL(source = \"cycl/process-utilities.lisp\", position = 28387)\nprivate static SubLSymbol $process_wrapper_isg$ = null;\nMake a new process wrapper.")
    public static SubLObject new_process_wrapper(final SubLObject name, final SubLObject process_wrapper_function, SubLObject rest_args) {
        if (rest_args == UNPROVIDED) {
            rest_args = NIL;
        }
        final SubLObject process_lock = make_lock(name);
        SubLObject process_wrapper = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(process_lock);
            process_wrapper = process_utilities.make_process_wrapper(list($LOCK, process_lock, $STATE, $STARTING, $ID, integer_sequence_generator.integer_sequence_generator_next(process_utilities.$process_wrapper_isg$.getGlobalValue())));
            final SubLObject process = process_utilities.make_cyc_server_process_with_args(name, process_utilities.NEW_PROCESS_WRAPPER_INT, list(process_wrapper, process_wrapper_function, rest_args));
            process_utilities._csetf_process_wrapper_process(process_wrapper, process);
            process_utilities._csetf_process_wrapper_state(process_wrapper, $RUNNING);
        } finally {
            if (NIL != release) {
                release_lock(process_lock);
            }
        }
        return process_wrapper;
    }

    /**
     * Helper function that performs cleanup after PROCESS-WRAPPER-FUNCTION has finished.
     */
    @LispMethod(comment = "Helper function that performs cleanup after PROCESS-WRAPPER-FUNCTION has finished.")
    public static final SubLObject new_process_wrapper_int_alt(SubLObject process_wrapper, SubLObject process_wrapper_function, SubLObject rest_args) {
        {
            SubLObject result = NIL;
            result = apply(process_wrapper_function, cons(process_wrapper, rest_args));
            {
                SubLObject lock = process_wrapper_lock(process_wrapper);
                SubLObject lock_24 = lock;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock_24);
                    _csetf_process_wrapper_state(process_wrapper, $COMPLETED);
                    _csetf_process_wrapper_process(process_wrapper, NIL);
                } finally {
                    if (NIL != release) {
                        release_lock(lock_24);
                    }
                }
            }
            return result;
        }
    }

    /**
     * Helper function that performs cleanup after PROCESS-WRAPPER-FUNCTION has finished.
     */
    @LispMethod(comment = "Helper function that performs cleanup after PROCESS-WRAPPER-FUNCTION has finished.")
    public static SubLObject new_process_wrapper_int(final SubLObject process_wrapper, final SubLObject process_wrapper_function, final SubLObject rest_args) {
        SubLObject result = NIL;
        result = apply(process_wrapper_function, cons(process_wrapper, rest_args));
        final SubLObject lock = process_utilities.process_wrapper_lock(process_wrapper);
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_process_wrapper_state(process_wrapper, $COMPLETED);
            process_utilities._csetf_process_wrapper_process(process_wrapper, NIL);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static final SubLObject process_wrapper_get_id_alt(SubLObject process_wrapper) {
        return process_wrapper_id(process_wrapper);
    }

    public static SubLObject process_wrapper_get_id(final SubLObject process_wrapper) {
        return process_utilities.process_wrapper_id(process_wrapper);
    }

    public static final SubLObject process_wrapper_get_process_alt(SubLObject process_wrapper) {
        return process_wrapper_process(process_wrapper);
    }

    public static SubLObject process_wrapper_get_process(final SubLObject process_wrapper) {
        return process_utilities.process_wrapper_process(process_wrapper);
    }

    public static final SubLObject process_wrapper_get_state_alt(SubLObject process_wrapper) {
        return process_wrapper_state(process_wrapper);
    }

    public static SubLObject process_wrapper_get_state(final SubLObject process_wrapper) {
        return process_utilities.process_wrapper_state(process_wrapper);
    }

    public static final SubLObject process_wrapper_get_lock_alt(SubLObject process_wrapper) {
        return process_wrapper_lock(process_wrapper);
    }

    public static SubLObject process_wrapper_get_lock(final SubLObject process_wrapper) {
        return process_utilities.process_wrapper_lock(process_wrapper);
    }

    public static final SubLObject process_wrapper_get_plist_alt(SubLObject process_wrapper) {
        return copy_list(process_wrapper_plist(process_wrapper));
    }

    public static SubLObject process_wrapper_get_plist(final SubLObject process_wrapper) {
        return copy_list(process_utilities.process_wrapper_plist(process_wrapper));
    }

    public static final SubLObject process_wrapper_process_startingP_alt(SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $STARTING);
    }

    public static SubLObject process_wrapper_process_startingP(final SubLObject process_wrapper) {
        return eq(process_utilities.process_wrapper_state(process_wrapper), $STARTING);
    }

    public static final SubLObject process_wrapper_process_runningP_alt(SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $RUNNING);
    }

    public static SubLObject process_wrapper_process_runningP(final SubLObject process_wrapper) {
        return eq(process_utilities.process_wrapper_state(process_wrapper), $RUNNING);
    }

    public static final SubLObject process_wrapper_process_completedP_alt(SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $COMPLETED);
    }

    public static SubLObject process_wrapper_process_completedP(final SubLObject process_wrapper) {
        return eq(process_utilities.process_wrapper_state(process_wrapper), $COMPLETED);
    }

    public static final SubLObject process_wrapper_process_abortedP_alt(SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $ABORTED);
    }

    public static SubLObject process_wrapper_process_abortedP(final SubLObject process_wrapper) {
        return eq(process_utilities.process_wrapper_state(process_wrapper), $ABORTED);
    }

    public static final SubLObject process_wrapper_process_pausingP_alt(SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $PAUSING);
    }

    public static SubLObject process_wrapper_process_pausingP(final SubLObject process_wrapper) {
        return eq(process_utilities.process_wrapper_state(process_wrapper), $PAUSING);
    }

    public static final SubLObject process_wrapper_process_pausedP_alt(SubLObject process_wrapper) {
        return eq(process_wrapper_state(process_wrapper), $PAUSED);
    }

    public static SubLObject process_wrapper_process_pausedP(final SubLObject process_wrapper) {
        return eq(process_utilities.process_wrapper_state(process_wrapper), $PAUSED);
    }

    public static final SubLObject process_wrapper_process_pause_alt(SubLObject process_wrapper) {
        {
            SubLObject lock = process_wrapper_lock(process_wrapper);
            SubLObject result = NIL;
            SubLObject lock_25 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_25);
                {
                    SubLObject pcase_var = process_wrapper_state(process_wrapper);
                    if (pcase_var.eql($RUNNING)) {
                        _csetf_process_wrapper_state(process_wrapper, $PAUSING);
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock_25);
                }
            }
            return result;
        }
    }

    public static SubLObject process_wrapper_process_pause(final SubLObject process_wrapper) {
        final SubLObject lock = process_utilities.process_wrapper_lock(process_wrapper);
        final SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject pcase_var = process_utilities.process_wrapper_state(process_wrapper);
            if (pcase_var.eql($RUNNING)) {
                process_utilities._csetf_process_wrapper_state(process_wrapper, $PAUSING);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static final SubLObject process_wrapper_process_resume_alt(SubLObject process_wrapper) {
        {
            SubLObject lock = process_wrapper_lock(process_wrapper);
            SubLObject result = NIL;
            SubLObject lock_26 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_26);
                {
                    SubLObject pcase_var = process_wrapper_state(process_wrapper);
                    if (pcase_var.eql($PAUSING)) {
                        _csetf_process_wrapper_state(process_wrapper, $RUNNING);
                    } else {
                        if (pcase_var.eql($PAUSED)) {
                            process_unblock(process_wrapper_process(process_wrapper));
                            _csetf_process_wrapper_state(process_wrapper, $RUNNING);
                        }
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock_26);
                }
            }
            return result;
        }
    }

    public static SubLObject process_wrapper_process_resume(final SubLObject process_wrapper) {
        final SubLObject lock = process_utilities.process_wrapper_lock(process_wrapper);
        final SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject pcase_var = process_utilities.process_wrapper_state(process_wrapper);
            if (pcase_var.eql($PAUSING)) {
                process_utilities._csetf_process_wrapper_state(process_wrapper, $RUNNING);
            } else
                if (pcase_var.eql($PAUSED)) {
                    process_unblock(process_utilities.process_wrapper_process(process_wrapper));
                    process_utilities._csetf_process_wrapper_state(process_wrapper, $RUNNING);
                }

        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    /**
     * This function should be called as many times as possible between pieces of work being done.  If the process has been requested to pause, this function will block the process.  If this is called from a process that is not the same as the one in the process-wrapper argument, it will do nothing.
     */
    @LispMethod(comment = "This function should be called as many times as possible between pieces of work being done.  If the process has been requested to pause, this function will block the process.  If this is called from a process that is not the same as the one in the process-wrapper argument, it will do nothing.")
    public static final SubLObject process_wrapper_checkpoint_alt(SubLObject process_wrapper) {
        if (current_process() == process_wrapper_process(process_wrapper)) {
            {
                SubLObject lock = process_wrapper_lock(process_wrapper);
                SubLObject blockP = NIL;
                SubLObject lock_27 = lock;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock_27);
                    {
                        SubLObject pcase_var = process_wrapper_state(process_wrapper);
                        if (pcase_var.eql($PAUSING)) {
                            _csetf_process_wrapper_state(process_wrapper, $PAUSED);
                            blockP = T;
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock_27);
                    }
                }
                if (NIL != blockP) {
                    process_block();
                }
            }
        }
        return NIL;
    }

    /**
     * This function should be called as many times as possible between pieces of work being done.  If the process has been requested to pause, this function will block the process.  If this is called from a process that is not the same as the one in the process-wrapper argument, it will do nothing.
     */
    @LispMethod(comment = "This function should be called as many times as possible between pieces of work being done.  If the process has been requested to pause, this function will block the process.  If this is called from a process that is not the same as the one in the process-wrapper argument, it will do nothing.")
    public static SubLObject process_wrapper_checkpoint(final SubLObject process_wrapper) {
        if (current_process().eql(process_utilities.process_wrapper_process(process_wrapper))) {
            final SubLObject lock = process_utilities.process_wrapper_lock(process_wrapper);
            SubLObject blockP = NIL;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                final SubLObject pcase_var = process_utilities.process_wrapper_state(process_wrapper);
                if (pcase_var.eql($PAUSING)) {
                    process_utilities._csetf_process_wrapper_state(process_wrapper, $PAUSED);
                    blockP = T;
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            if (NIL != blockP) {
                process_block();
            }
        }
        return NIL;
    }

    /**
     * This function is called within the encapsulated process to block or pause the process.
     * Will change the state of PROCESS-WRAPPER to :PAUSED.
     */
    @LispMethod(comment = "This function is called within the encapsulated process to block or pause the process.\r\nWill change the state of PROCESS-WRAPPER to :PAUSED.\nThis function is called within the encapsulated process to block or pause the process.\nWill change the state of PROCESS-WRAPPER to :PAUSED.")
    public static final SubLObject process_wrapper_block_alt(SubLObject process_wrapper) {
        if (current_process() == process_wrapper_process(process_wrapper)) {
            {
                SubLObject lock = process_wrapper_lock(process_wrapper);
                SubLObject lock_28 = lock;
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock_28);
                    _csetf_process_wrapper_state(process_wrapper, $PAUSED);
                } finally {
                    if (NIL != release) {
                        release_lock(lock_28);
                    }
                }
                process_block();
            }
            return NIL;
        }
        return NIL;
    }

    /**
     * This function is called within the encapsulated process to block or pause the process.
     * Will change the state of PROCESS-WRAPPER to :PAUSED.
     */
    @LispMethod(comment = "This function is called within the encapsulated process to block or pause the process.\r\nWill change the state of PROCESS-WRAPPER to :PAUSED.\nThis function is called within the encapsulated process to block or pause the process.\nWill change the state of PROCESS-WRAPPER to :PAUSED.")
    public static SubLObject process_wrapper_block(final SubLObject process_wrapper) {
        if (current_process().eql(process_utilities.process_wrapper_process(process_wrapper))) {
            final SubLObject lock = process_utilities.process_wrapper_lock(process_wrapper);
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                process_utilities._csetf_process_wrapper_state(process_wrapper, $PAUSED);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            process_block();
            return NIL;
        }
        return NIL;
    }

    public static final SubLObject process_wrapper_process_abort_alt(SubLObject process_wrapper) {
        {
            SubLObject lock = process_wrapper_lock(process_wrapper);
            SubLObject release_lock_then_killP = eq(current_process(), process_wrapper_process(process_wrapper));
            SubLObject result = NIL;
            SubLObject lock_29 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_29);
                _csetf_process_wrapper_state(process_wrapper, $ABORTED);
                if (NIL == release_lock_then_killP) {
                    result = kill_process(process_wrapper_process(process_wrapper));
                    _csetf_process_wrapper_process(process_wrapper, NIL);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock_29);
                }
            }
            if (NIL != release_lock_then_killP) {
                result = kill_process(process_wrapper_process(process_wrapper));
                _csetf_process_wrapper_process(process_wrapper, NIL);
            }
            return result;
        }
    }

    public static SubLObject process_wrapper_process_abort(final SubLObject process_wrapper) {
        final SubLObject lock = process_utilities.process_wrapper_lock(process_wrapper);
        final SubLObject release_lock_then_killP = eq(current_process(), process_utilities.process_wrapper_process(process_wrapper));
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            process_utilities._csetf_process_wrapper_state(process_wrapper, $ABORTED);
            if (NIL == release_lock_then_killP) {
                result = kill_process(process_utilities.process_wrapper_process(process_wrapper));
                process_utilities._csetf_process_wrapper_process(process_wrapper, NIL);
            }
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        if (NIL != release_lock_then_killP) {
            result = kill_process(process_utilities.process_wrapper_process(process_wrapper));
            process_utilities._csetf_process_wrapper_process(process_wrapper, NIL);
        }
        return result;
    }

    public static final SubLObject process_wrapper_set_property_alt(SubLObject process_wrapper, SubLObject indicator, SubLObject value) {
        {
            SubLObject lock = process_wrapper_lock(process_wrapper);
            SubLObject result = NIL;
            SubLObject lock_30 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_30);
                {
                    SubLObject plist = process_wrapper_plist(process_wrapper);
                    result = putf(plist, indicator, value);
                    _csetf_process_wrapper_plist(process_wrapper, result);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock_30);
                }
            }
            return result;
        }
    }

    public static SubLObject process_wrapper_set_property(final SubLObject process_wrapper, final SubLObject indicator, final SubLObject value) {
        final SubLObject lock = process_utilities.process_wrapper_lock(process_wrapper);
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            final SubLObject plist = process_utilities.process_wrapper_plist(process_wrapper);
            result = putf(plist, indicator, value);
            process_utilities._csetf_process_wrapper_plist(process_wrapper, result);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    public static final SubLObject process_wrapper_get_property_alt(SubLObject process_wrapper, SubLObject indicator, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        {
            SubLObject lock = process_wrapper_lock(process_wrapper);
            SubLObject result = NIL;
            SubLObject lock_31 = lock;
            SubLObject release = NIL;
            try {
                release = seize_lock(lock_31);
                result = getf(process_wrapper_plist(process_wrapper), indicator, default_value);
            } finally {
                if (NIL != release) {
                    release_lock(lock_31);
                }
            }
            return result;
        }
    }

    public static SubLObject process_wrapper_get_property(final SubLObject process_wrapper, final SubLObject indicator, SubLObject default_value) {
        if (default_value == UNPROVIDED) {
            default_value = NIL;
        }
        final SubLObject lock = process_utilities.process_wrapper_lock(process_wrapper);
        SubLObject result = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(lock);
            result = getf(process_utilities.process_wrapper_plist(process_wrapper), indicator, default_value);
        } finally {
            if (NIL != release) {
                release_lock(lock);
            }
        }
        return result;
    }

    /**
     * Like @xref make-process but executes FUNCTION within the context assumed by a Cyc server.
     */
    @LispMethod(comment = "Like @xref make-process but executes FUNCTION within the context assumed by a Cyc server.")
    public static final SubLObject make_cyc_server_process_alt(SubLObject name, SubLObject function) {
        return subl_promotions.make_process_with_args(name, CYC_SERVER_PROCESS_FUNCALL, list(function));
    }

    /**
     * Like @xref make-process but executes FUNCTION within the context assumed by a Cyc server.
     */
    @LispMethod(comment = "Like @xref make-process but executes FUNCTION within the context assumed by a Cyc server.")
    public static SubLObject make_cyc_server_process(final SubLObject name, final SubLObject function) {
        return subl_promotions.make_process_with_args(name, process_utilities.CYC_SERVER_PROCESS_FUNCALL, list(function));
    }

    public static final SubLObject cyc_server_process_funcall_alt(SubLObject function) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
                SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
                try {
                    $package$.bind(find_package($$$CYC), thread);
                    $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                    $print_readably$.bind(NIL, thread);
                    $read_eval$.bind(NIL, thread);
                    {
                        SubLObject old_priority = process_priority(current_process());
                        try {
                            set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                            return funcall(function);
                        } finally {
                            {
                                SubLObject _prev_bind_0_32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    set_process_priority(current_process(), old_priority);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_32, thread);
                                }
                            }
                        }
                    }
                } finally {
                    $read_eval$.rebind(_prev_bind_3, thread);
                    $print_readably$.rebind(_prev_bind_2, thread);
                    $read_default_float_format$.rebind(_prev_bind_1, thread);
                    $package$.rebind(_prev_bind_0, thread);
                }
            }
        }
    }

    public static SubLObject cyc_server_process_funcall(final SubLObject function) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $read_eval$.currentBinding(thread);
        try {
            $package$.bind(find_package(process_utilities.$$$CYC), thread);
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            $print_readably$.bind(NIL, thread);
            $read_eval$.bind(NIL, thread);
            final SubLObject old_priority = process_priority(current_process());
            try {
                set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                return funcall(function);
            } finally {
                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_process_priority(current_process(), old_priority);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                }
            }
        } finally {
            $read_eval$.rebind(_prev_bind_4, thread);
            $print_readably$.rebind(_prev_bind_3, thread);
            $read_default_float_format$.rebind(_prev_bind_2, thread);
            $package$.rebind(_prev_bind_0, thread);
        }
    }

    /**
     * Like @xref make-process-with-args but applies FUNCTION to ARGS within the context assumed by a Cyc server.
     */
    @LispMethod(comment = "Like @xref make-process-with-args but applies FUNCTION to ARGS within the context assumed by a Cyc server.")
    public static final SubLObject make_cyc_server_process_with_args_alt(SubLObject name, SubLObject function, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return subl_promotions.make_process_with_args(name, CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS, list(cons(function, args)));
    }

    /**
     * Like @xref make-process-with-args but applies FUNCTION to ARGS within the context assumed by a Cyc server.
     */
    @LispMethod(comment = "Like @xref make-process-with-args but applies FUNCTION to ARGS within the context assumed by a Cyc server.")
    public static SubLObject make_cyc_server_process_with_args(final SubLObject name, final SubLObject function, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        return subl_promotions.make_process_with_args(name, process_utilities.CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS, list(cons(function, args)));
    }

    public static final SubLObject cyc_server_process_funcall_with_args_alt(SubLObject functionXargs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = functionXargs;
                SubLObject current = datum;
                SubLObject function = NIL;
                SubLObject args = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt176);
                function = current.first();
                current = current.rest();
                args = current;
                {
                    SubLObject _prev_bind_0 = $package$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $read_default_float_format$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $print_readably$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $read_eval$.currentBinding(thread);
                    try {
                        $package$.bind(find_package($$$CYC), thread);
                        $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
                        $print_readably$.bind(NIL, thread);
                        $read_eval$.bind(NIL, thread);
                        {
                            SubLObject old_priority = process_priority(current_process());
                            try {
                                set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                                return apply(function, args);
                            } finally {
                                {
                                    SubLObject _prev_bind_0_33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        set_process_priority(current_process(), old_priority);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_33, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $read_eval$.rebind(_prev_bind_3, thread);
                        $print_readably$.rebind(_prev_bind_2, thread);
                        $read_default_float_format$.rebind(_prev_bind_1, thread);
                        $package$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        }
    }

    public static SubLObject cyc_server_process_funcall_with_args(final SubLObject functionXargs) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject function = NIL;
        SubLObject args = NIL;
        destructuring_bind_must_consp(functionXargs, functionXargs, process_utilities.$list228);
        function = functionXargs.first();
        final SubLObject current = args = functionXargs.rest();
        final SubLObject _prev_bind_0 = $package$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $read_default_float_format$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $print_readably$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $read_eval$.currentBinding(thread);
        try {
            $package$.bind(find_package(process_utilities.$$$CYC), thread);
            $read_default_float_format$.bind(DOUBLE_FLOAT, thread);
            $print_readably$.bind(NIL, thread);
            $read_eval$.bind(NIL, thread);
            final SubLObject old_priority = process_priority(current_process());
            try {
                set_process_priority(current_process(), $process_normal_priority$.getGlobalValue());
                return apply(function, args);
            } finally {
                final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_process_priority(current_process(), old_priority);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                }
            }
        } finally {
            $read_eval$.rebind(_prev_bind_4, thread);
            $print_readably$.rebind(_prev_bind_3, thread);
            $read_default_float_format$.rebind(_prev_bind_2, thread);
            $package$.rebind(_prev_bind_0, thread);
        }
    }

    public static final SubLObject process_count_alt() {
        return length(all_processes());
    }

    public static SubLObject process_count() {
        return length(all_processes());
    }

    public static final SubLObject declare_process_utilities_file_alt() {
        declareFunction("debug_initial_process", "DEBUG-INITIAL-PROCESS", 0, 0, false);
        declareFunction("interrupt_initial_process", "INTERRUPT-INITIAL-PROCESS", 0, 0, false);
        declareFunction("process_idleP", "PROCESS-IDLE?", 1, 0, false);
        declareFunction("process_busyP", "PROCESS-BUSY?", 1, 0, false);
        declareFunction("process_waitingP", "PROCESS-WAITING?", 1, 0, false);
        declareFunction("process_runningP", "PROCESS-RUNNING?", 1, 0, false);
        declareFunction("task_print_function_trampoline", "TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_p", "TASK-P", 1, 0, false);
        new process_utilities.$task_p$UnaryFunction();
        declareFunction("task_process", "TASK-PROCESS", 1, 0, false);
        declareFunction("task_completed", "TASK-COMPLETED", 1, 0, false);
        declareFunction("_csetf_task_process", "_CSETF-TASK-PROCESS", 2, 0, false);
        declareFunction("_csetf_task_completed", "_CSETF-TASK-COMPLETED", 2, 0, false);
        declareFunction("make_task", "MAKE-TASK", 0, 1, false);
        declareFunction("new_task", "NEW-TASK", 2, 2, false);
        declareFunction("new_task_internal", "NEW-TASK-INTERNAL", 5, 0, false);
        declareFunction("thinking_task_print_function_trampoline", "THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("thinking_task_p", "THINKING-TASK-P", 1, 0, false);
        new com.cyc.cycjava.cycl.process_utilities.$thinking_task_p$UnaryFunction();
        declareFunction("t_task_lock", "T-TASK-LOCK", 1, 0, false);
        declareFunction("t_task_thread", "T-TASK-THREAD", 1, 0, false);
        declareFunction("t_task_name", "T-TASK-NAME", 1, 0, false);
        declareFunction("t_task_status", "T-TASK-STATUS", 1, 0, false);
        declareFunction("t_task_progress_message", "T-TASK-PROGRESS-MESSAGE", 1, 0, false);
        declareFunction("t_task_progress_sofar", "T-TASK-PROGRESS-SOFAR", 1, 0, false);
        declareFunction("t_task_progress_total", "T-TASK-PROGRESS-TOTAL", 1, 0, false);
        declareFunction("t_task_start_time", "T-TASK-START-TIME", 1, 0, false);
        declareFunction("t_task_finish_time", "T-TASK-FINISH-TIME", 1, 0, false);
        declareFunction("t_task_result", "T-TASK-RESULT", 1, 0, false);
        declareFunction("t_task_error_message", "T-TASK-ERROR-MESSAGE", 1, 0, false);
        declareFunction("t_task_properties", "T-TASK-PROPERTIES", 1, 0, false);
        declareFunction("_csetf_t_task_lock", "_CSETF-T-TASK-LOCK", 2, 0, false);
        declareFunction("_csetf_t_task_thread", "_CSETF-T-TASK-THREAD", 2, 0, false);
        declareFunction("_csetf_t_task_name", "_CSETF-T-TASK-NAME", 2, 0, false);
        declareFunction("_csetf_t_task_status", "_CSETF-T-TASK-STATUS", 2, 0, false);
        declareFunction("_csetf_t_task_progress_message", "_CSETF-T-TASK-PROGRESS-MESSAGE", 2, 0, false);
        declareFunction("_csetf_t_task_progress_sofar", "_CSETF-T-TASK-PROGRESS-SOFAR", 2, 0, false);
        declareFunction("_csetf_t_task_progress_total", "_CSETF-T-TASK-PROGRESS-TOTAL", 2, 0, false);
        declareFunction("_csetf_t_task_start_time", "_CSETF-T-TASK-START-TIME", 2, 0, false);
        declareFunction("_csetf_t_task_finish_time", "_CSETF-T-TASK-FINISH-TIME", 2, 0, false);
        declareFunction("_csetf_t_task_result", "_CSETF-T-TASK-RESULT", 2, 0, false);
        declareFunction("_csetf_t_task_error_message", "_CSETF-T-TASK-ERROR-MESSAGE", 2, 0, false);
        declareFunction("_csetf_t_task_properties", "_CSETF-T-TASK-PROPERTIES", 2, 0, false);
        declareFunction("make_thinking_task", "MAKE-THINKING-TASK", 0, 1, false);
        declareFunction("new_thinking_task", "NEW-THINKING-TASK", 2, 1, false);
        declareMacro("with_thinking_lock", "WITH-THINKING-LOCK");
        declareFunction("thinking_note_thread", "THINKING-NOTE-THREAD", 2, 0, false);
        declareFunction("thinking_clear_thread", "THINKING-CLEAR-THREAD", 1, 0, false);
        declareFunction("thinking_note_status", "THINKING-NOTE-STATUS", 2, 0, false);
        declareFunction("thinking_note_progress_message", "THINKING-NOTE-PROGRESS-MESSAGE", 2, 0, false);
        declareFunction("thinking_note_progress_sofar", "THINKING-NOTE-PROGRESS-SOFAR", 2, 0, false);
        declareFunction("thinking_note_progress_total", "THINKING-NOTE-PROGRESS-TOTAL", 2, 0, false);
        declareFunction("thinking_note_start_time", "THINKING-NOTE-START-TIME", 2, 0, false);
        declareFunction("thinking_note_finish_time", "THINKING-NOTE-FINISH-TIME", 2, 0, false);
        declareFunction("thinking_note_result", "THINKING-NOTE-RESULT", 2, 0, false);
        declareFunction("thinking_note_error_message", "THINKING-NOTE-ERROR-MESSAGE", 2, 0, false);
        declareFunction("thinking_note_property", "THINKING-NOTE-PROPERTY", 3, 0, false);
        declareFunction("thinking_lock", "THINKING-LOCK", 1, 0, false);
        declareFunction("thinking_thread", "THINKING-THREAD", 1, 0, false);
        declareFunction("thinking_name", "THINKING-NAME", 1, 0, false);
        declareFunction("thinking_status", "THINKING-STATUS", 1, 0, false);
        declareFunction("thinking_progress_message", "THINKING-PROGRESS-MESSAGE", 1, 0, false);
        declareFunction("thinking_progress_sofar", "THINKING-PROGRESS-SOFAR", 1, 0, false);
        declareFunction("thinking_progress_total", "THINKING-PROGRESS-TOTAL", 1, 0, false);
        declareFunction("thinking_start_time", "THINKING-START-TIME", 1, 0, false);
        declareFunction("thinking_finish_time", "THINKING-FINISH-TIME", 1, 0, false);
        declareFunction("thinking_result", "THINKING-RESULT", 1, 0, false);
        declareFunction("thinking_error_message", "THINKING-ERROR-MESSAGE", 1, 0, false);
        declareFunction("thinking_property", "THINKING-PROPERTY", 2, 0, false);
        declareFunction("thinking_properties", "THINKING-PROPERTIES", 1, 0, false);
        declareFunction("thinking_task", "THINKING-TASK", 0, 0, false);
        declareFunction("thinking_start", "THINKING-START", 3, 0, false);
        declareFunction("thinking_stop", "THINKING-STOP", 1, 0, false);
        declareFunction("thinking_thread_run", "THINKING-THREAD-RUN", 3, 0, false);
        declareFunction("thinking_thread_initialize", "THINKING-THREAD-INITIALIZE", 1, 0, false);
        declareFunction("thinking_thread_finalize", "THINKING-THREAD-FINALIZE", 4, 0, false);
        declareFunction("ipc_queue_print_function_trampoline", "IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ipc_queue_p", "IPC-QUEUE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.process_utilities.$ipc_queue_p$UnaryFunction();
        declareFunction("ipc_queue_lock", "IPC-QUEUE-LOCK", 1, 0, false);
        declareFunction("ipc_queue_semaphore", "IPC-QUEUE-SEMAPHORE", 1, 0, false);
        declareFunction("ipc_queue_data_queue", "IPC-QUEUE-DATA-QUEUE", 1, 0, false);
        declareFunction("_csetf_ipc_queue_lock", "_CSETF-IPC-QUEUE-LOCK", 2, 0, false);
        declareFunction("_csetf_ipc_queue_semaphore", "_CSETF-IPC-QUEUE-SEMAPHORE", 2, 0, false);
        declareFunction("_csetf_ipc_queue_data_queue", "_CSETF-IPC-QUEUE-DATA-QUEUE", 2, 0, false);
        declareFunction("make_ipc_queue", "MAKE-IPC-QUEUE", 0, 1, false);
        declareFunction("new_ipc_queue", "NEW-IPC-QUEUE", 1, 0, false);
        declareFunction("ipc_enqueue", "IPC-ENQUEUE", 2, 0, false);
        declareFunction("ipc_dequeue", "IPC-DEQUEUE", 1, 0, false);
        declareFunction("ipc_dequeue_n", "IPC-DEQUEUE-N", 1, 1, false);
        declareFunction("ipc_dequeue_with_timeout", "IPC-DEQUEUE-WITH-TIMEOUT", 2, 1, false);
        declareFunction("ipc_current_queue_size", "IPC-CURRENT-QUEUE-SIZE", 1, 0, false);
        declareFunction("ipc_current_queue_content", "IPC-CURRENT-QUEUE-CONTENT", 1, 0, false);
        declareFunction("ordered_ipc_queue_print_function_trampoline", "ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ordered_ipc_queue_p", "ORDERED-IPC-QUEUE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.process_utilities.$ordered_ipc_queue_p$UnaryFunction();
        declareFunction("ordrd_ipcq_lock", "ORDRD-IPCQ-LOCK", 1, 0, false);
        declareFunction("ordrd_ipcq_producer_isg", "ORDRD-IPCQ-PRODUCER-ISG", 1, 0, false);
        declareFunction("ordrd_ipcq_consumer_isg", "ORDRD-IPCQ-CONSUMER-ISG", 1, 0, false);
        declareFunction("ordrd_ipcq_payload", "ORDRD-IPCQ-PAYLOAD", 1, 0, false);
        declareFunction("_csetf_ordrd_ipcq_lock", "_CSETF-ORDRD-IPCQ-LOCK", 2, 0, false);
        declareFunction("_csetf_ordrd_ipcq_producer_isg", "_CSETF-ORDRD-IPCQ-PRODUCER-ISG", 2, 0, false);
        declareFunction("_csetf_ordrd_ipcq_consumer_isg", "_CSETF-ORDRD-IPCQ-CONSUMER-ISG", 2, 0, false);
        declareFunction("_csetf_ordrd_ipcq_payload", "_CSETF-ORDRD-IPCQ-PAYLOAD", 2, 0, false);
        declareFunction("make_ordered_ipc_queue", "MAKE-ORDERED-IPC-QUEUE", 0, 1, false);
        declareFunction("new_ordered_ipc_queue", "NEW-ORDERED-IPC-QUEUE", 1, 1, false);
        declareFunction("ordered_ipc_enqueue", "ORDERED-IPC-ENQUEUE", 2, 0, false);
        declareFunction("ordered_ipc_dequeue", "ORDERED-IPC-DEQUEUE", 1, 0, false);
        declareFunction("ordered_ipc_current_queue_size", "ORDERED-IPC-CURRENT-QUEUE-SIZE", 1, 0, false);
        declareFunction("ordered_ipc_current_queue_contents", "ORDERED-IPC-CURRENT-QUEUE-CONTENTS", 1, 0, false);
        declareFunction("kill_process_named", "KILL-PROCESS-NAMED", 1, 0, false);
        declareFunction("process_named", "PROCESS-NAMED", 1, 0, false);
        declareFunction("process_exhaust_immediately_fn", "PROCESS-EXHAUST-IMMEDIATELY-FN", 0, 0, false);
        declareFunction("make_exhausted_process", "MAKE-EXHAUSTED-PROCESS", 1, 0, false);
        declareFunction("visit_defstruct_object_process_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD", 2, 0, false);
        declareFunction("visit_defstruct_object_process", "VISIT-DEFSTRUCT-OBJECT-PROCESS", 2, 0, false);
        declareFunction("visit_defstruct_object_lock_method", "VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD", 2, 0, false);
        declareFunction("visit_defstruct_object_lock", "VISIT-DEFSTRUCT-OBJECT-LOCK", 2, 0, false);
        declareFunction("process_wrapper_print_function_trampoline", "PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("process_wrapper_p", "PROCESS-WRAPPER-P", 1, 0, false);
        new com.cyc.cycjava.cycl.process_utilities.$process_wrapper_p$UnaryFunction();
        declareFunction("process_wrapper_id", "PROCESS-WRAPPER-ID", 1, 0, false);
        declareFunction("process_wrapper_process", "PROCESS-WRAPPER-PROCESS", 1, 0, false);
        declareFunction("process_wrapper_state", "PROCESS-WRAPPER-STATE", 1, 0, false);
        declareFunction("process_wrapper_lock", "PROCESS-WRAPPER-LOCK", 1, 0, false);
        declareFunction("process_wrapper_plist", "PROCESS-WRAPPER-PLIST", 1, 0, false);
        declareFunction("_csetf_process_wrapper_id", "_CSETF-PROCESS-WRAPPER-ID", 2, 0, false);
        declareFunction("_csetf_process_wrapper_process", "_CSETF-PROCESS-WRAPPER-PROCESS", 2, 0, false);
        declareFunction("_csetf_process_wrapper_state", "_CSETF-PROCESS-WRAPPER-STATE", 2, 0, false);
        declareFunction("_csetf_process_wrapper_lock", "_CSETF-PROCESS-WRAPPER-LOCK", 2, 0, false);
        declareFunction("_csetf_process_wrapper_plist", "_CSETF-PROCESS-WRAPPER-PLIST", 2, 0, false);
        declareFunction("make_process_wrapper", "MAKE-PROCESS-WRAPPER", 0, 1, false);
        declareFunction("new_process_wrapper", "NEW-PROCESS-WRAPPER", 2, 1, false);
        declareFunction("new_process_wrapper_int", "NEW-PROCESS-WRAPPER-INT", 3, 0, false);
        declareFunction("process_wrapper_get_id", "PROCESS-WRAPPER-GET-ID", 1, 0, false);
        declareFunction("process_wrapper_get_process", "PROCESS-WRAPPER-GET-PROCESS", 1, 0, false);
        declareFunction("process_wrapper_get_state", "PROCESS-WRAPPER-GET-STATE", 1, 0, false);
        declareFunction("process_wrapper_get_lock", "PROCESS-WRAPPER-GET-LOCK", 1, 0, false);
        declareFunction("process_wrapper_get_plist", "PROCESS-WRAPPER-GET-PLIST", 1, 0, false);
        declareFunction("process_wrapper_process_startingP", "PROCESS-WRAPPER-PROCESS-STARTING?", 1, 0, false);
        declareFunction("process_wrapper_process_runningP", "PROCESS-WRAPPER-PROCESS-RUNNING?", 1, 0, false);
        declareFunction("process_wrapper_process_completedP", "PROCESS-WRAPPER-PROCESS-COMPLETED?", 1, 0, false);
        declareFunction("process_wrapper_process_abortedP", "PROCESS-WRAPPER-PROCESS-ABORTED?", 1, 0, false);
        declareFunction("process_wrapper_process_pausingP", "PROCESS-WRAPPER-PROCESS-PAUSING?", 1, 0, false);
        declareFunction("process_wrapper_process_pausedP", "PROCESS-WRAPPER-PROCESS-PAUSED?", 1, 0, false);
        declareFunction("process_wrapper_process_pause", "PROCESS-WRAPPER-PROCESS-PAUSE", 1, 0, false);
        declareFunction("process_wrapper_process_resume", "PROCESS-WRAPPER-PROCESS-RESUME", 1, 0, false);
        declareFunction("process_wrapper_checkpoint", "PROCESS-WRAPPER-CHECKPOINT", 1, 0, false);
        declareFunction("process_wrapper_block", "PROCESS-WRAPPER-BLOCK", 1, 0, false);
        declareFunction("process_wrapper_process_abort", "PROCESS-WRAPPER-PROCESS-ABORT", 1, 0, false);
        declareFunction("process_wrapper_set_property", "PROCESS-WRAPPER-SET-PROPERTY", 3, 0, false);
        declareFunction("process_wrapper_get_property", "PROCESS-WRAPPER-GET-PROPERTY", 2, 1, false);
        declareFunction("make_cyc_server_process", "MAKE-CYC-SERVER-PROCESS", 2, 0, false);
        declareFunction("cyc_server_process_funcall", "CYC-SERVER-PROCESS-FUNCALL", 1, 0, false);
        declareFunction("make_cyc_server_process_with_args", "MAKE-CYC-SERVER-PROCESS-WITH-ARGS", 2, 1, false);
        declareFunction("cyc_server_process_funcall_with_args", "CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS", 1, 0, false);
        declareFunction("process_count", "PROCESS-COUNT", 0, 0, false);
        declareFunction("get_thinking_test_case_thinking", "GET-THINKING-TEST-CASE-THINKING", 1, 0, false);
        declareFunction("set_thinking_test_case_thinking", "SET-THINKING-TEST-CASE-THINKING", 2, 0, false);
        declareFunction("subloop_reserved_initialize_thinking_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-THINKING-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_thinking_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-THINKING-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("thinking_test_case_p", "THINKING-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_process_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("debug_initial_process", "DEBUG-INITIAL-PROCESS", 0, 0, false);
            declareFunction("interrupt_initial_process", "INTERRUPT-INITIAL-PROCESS", 0, 0, false);
            declareFunction("process_idleP", "PROCESS-IDLE?", 1, 0, false);
            declareFunction("process_busyP", "PROCESS-BUSY?", 1, 0, false);
            declareFunction("process_waitingP", "PROCESS-WAITING?", 1, 0, false);
            declareFunction("process_runningP", "PROCESS-RUNNING?", 1, 0, false);
            declareFunction("process_suid", "PROCESS-SUID", 1, 0, false);
            declareFunction("find_process_by_suid", "FIND-PROCESS-BY-SUID", 1, 0, false);
            declareFunction("find_process_by_name", "FIND-PROCESS-BY-NAME", 1, 1, false);
            declareFunction("gather_processes_by_name", "GATHER-PROCESSES-BY-NAME", 1, 1, false);
            declareFunction("active_process_at_startupP", "ACTIVE-PROCESS-AT-STARTUP?", 1, 0, false);
            declareFunction("note_active_processes_at_startup", "NOTE-ACTIVE-PROCESSES-AT-STARTUP", 0, 0, false);
            declareFunction("process_form", "PROCESS-FORM", 1, 0, false);
            declareFunction("process_note_form", "PROCESS-NOTE-FORM", 2, 0, false);
            declareFunction("current_process_note_form", "CURRENT-PROCESS-NOTE-FORM", 1, 0, false);
            declareFunction("current_process_clear_form", "CURRENT-PROCESS-CLEAR-FORM", 0, 0, false);
            declareFunction("clear_invalid_process_forms", "CLEAR-INVALID-PROCESS-FORMS", 0, 0, false);
            declareFunction("task_print_function_trampoline", "TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("task_p", "TASK-P", 1, 0, false);
            new process_utilities.$task_p$UnaryFunction();
            declareFunction("task_process", "TASK-PROCESS", 1, 0, false);
            declareFunction("task_completed", "TASK-COMPLETED", 1, 0, false);
            declareFunction("_csetf_task_process", "_CSETF-TASK-PROCESS", 2, 0, false);
            declareFunction("_csetf_task_completed", "_CSETF-TASK-COMPLETED", 2, 0, false);
            declareFunction("make_task", "MAKE-TASK", 0, 1, false);
            declareFunction("visit_defstruct_task", "VISIT-DEFSTRUCT-TASK", 2, 0, false);
            declareFunction("visit_defstruct_object_task_method", "VISIT-DEFSTRUCT-OBJECT-TASK-METHOD", 2, 0, false);
            declareFunction("new_task", "NEW-TASK", 2, 2, false);
            declareFunction("new_task_internal", "NEW-TASK-INTERNAL", 5, 0, false);
            declareFunction("thinking_task_print_function_trampoline", "THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("thinking_task_p", "THINKING-TASK-P", 1, 0, false);
            new process_utilities.$thinking_task_p$UnaryFunction();
            declareFunction("t_task_lock", "T-TASK-LOCK", 1, 0, false);
            declareFunction("t_task_thread", "T-TASK-THREAD", 1, 0, false);
            declareFunction("t_task_name", "T-TASK-NAME", 1, 0, false);
            declareFunction("t_task_status", "T-TASK-STATUS", 1, 0, false);
            declareFunction("t_task_progress_message", "T-TASK-PROGRESS-MESSAGE", 1, 0, false);
            declareFunction("t_task_progress_sofar", "T-TASK-PROGRESS-SOFAR", 1, 0, false);
            declareFunction("t_task_progress_total", "T-TASK-PROGRESS-TOTAL", 1, 0, false);
            declareFunction("t_task_start_time", "T-TASK-START-TIME", 1, 0, false);
            declareFunction("t_task_finish_time", "T-TASK-FINISH-TIME", 1, 0, false);
            declareFunction("t_task_result", "T-TASK-RESULT", 1, 0, false);
            declareFunction("t_task_error_message", "T-TASK-ERROR-MESSAGE", 1, 0, false);
            declareFunction("t_task_properties", "T-TASK-PROPERTIES", 1, 0, false);
            declareFunction("_csetf_t_task_lock", "_CSETF-T-TASK-LOCK", 2, 0, false);
            declareFunction("_csetf_t_task_thread", "_CSETF-T-TASK-THREAD", 2, 0, false);
            declareFunction("_csetf_t_task_name", "_CSETF-T-TASK-NAME", 2, 0, false);
            declareFunction("_csetf_t_task_status", "_CSETF-T-TASK-STATUS", 2, 0, false);
            declareFunction("_csetf_t_task_progress_message", "_CSETF-T-TASK-PROGRESS-MESSAGE", 2, 0, false);
            declareFunction("_csetf_t_task_progress_sofar", "_CSETF-T-TASK-PROGRESS-SOFAR", 2, 0, false);
            declareFunction("_csetf_t_task_progress_total", "_CSETF-T-TASK-PROGRESS-TOTAL", 2, 0, false);
            declareFunction("_csetf_t_task_start_time", "_CSETF-T-TASK-START-TIME", 2, 0, false);
            declareFunction("_csetf_t_task_finish_time", "_CSETF-T-TASK-FINISH-TIME", 2, 0, false);
            declareFunction("_csetf_t_task_result", "_CSETF-T-TASK-RESULT", 2, 0, false);
            declareFunction("_csetf_t_task_error_message", "_CSETF-T-TASK-ERROR-MESSAGE", 2, 0, false);
            declareFunction("_csetf_t_task_properties", "_CSETF-T-TASK-PROPERTIES", 2, 0, false);
            declareFunction("make_thinking_task", "MAKE-THINKING-TASK", 0, 1, false);
            declareFunction("visit_defstruct_thinking_task", "VISIT-DEFSTRUCT-THINKING-TASK", 2, 0, false);
            declareFunction("visit_defstruct_object_thinking_task_method", "VISIT-DEFSTRUCT-OBJECT-THINKING-TASK-METHOD", 2, 0, false);
            declareFunction("new_thinking_task", "NEW-THINKING-TASK", 2, 1, false);
            declareMacro("with_thinking_lock", "WITH-THINKING-LOCK");
            declareFunction("thinking_note_thread", "THINKING-NOTE-THREAD", 2, 0, false);
            declareFunction("thinking_clear_thread", "THINKING-CLEAR-THREAD", 1, 0, false);
            declareFunction("thinking_note_status", "THINKING-NOTE-STATUS", 2, 0, false);
            declareFunction("thinking_note_progress_message", "THINKING-NOTE-PROGRESS-MESSAGE", 2, 0, false);
            declareFunction("thinking_note_progress_sofar", "THINKING-NOTE-PROGRESS-SOFAR", 2, 0, false);
            declareFunction("thinking_note_progress_total", "THINKING-NOTE-PROGRESS-TOTAL", 2, 0, false);
            declareFunction("thinking_note_start_time", "THINKING-NOTE-START-TIME", 2, 0, false);
            declareFunction("thinking_note_finish_time", "THINKING-NOTE-FINISH-TIME", 2, 0, false);
            declareFunction("thinking_note_result", "THINKING-NOTE-RESULT", 2, 0, false);
            declareFunction("thinking_note_error_message", "THINKING-NOTE-ERROR-MESSAGE", 2, 0, false);
            declareFunction("thinking_note_property", "THINKING-NOTE-PROPERTY", 3, 0, false);
            declareFunction("thinking_lock", "THINKING-LOCK", 1, 0, false);
            declareFunction("thinking_thread", "THINKING-THREAD", 1, 0, false);
            declareFunction("thinking_name", "THINKING-NAME", 1, 0, false);
            declareFunction("thinking_status", "THINKING-STATUS", 1, 0, false);
            declareFunction("thinking_progress_message", "THINKING-PROGRESS-MESSAGE", 1, 0, false);
            declareFunction("thinking_progress_sofar", "THINKING-PROGRESS-SOFAR", 1, 0, false);
            declareFunction("thinking_progress_total", "THINKING-PROGRESS-TOTAL", 1, 0, false);
            declareFunction("thinking_start_time", "THINKING-START-TIME", 1, 0, false);
            declareFunction("thinking_finish_time", "THINKING-FINISH-TIME", 1, 0, false);
            declareFunction("thinking_result", "THINKING-RESULT", 1, 0, false);
            declareFunction("thinking_error_message", "THINKING-ERROR-MESSAGE", 1, 0, false);
            declareFunction("thinking_property", "THINKING-PROPERTY", 2, 0, false);
            declareFunction("thinking_properties", "THINKING-PROPERTIES", 1, 0, false);
            declareFunction("thinking_task", "THINKING-TASK", 0, 0, false);
            declareFunction("thinking_start", "THINKING-START", 3, 0, false);
            declareFunction("thinking_stop", "THINKING-STOP", 1, 0, false);
            declareFunction("thinking_thread_run", "THINKING-THREAD-RUN", 3, 0, false);
            declareFunction("thinking_thread_initialize", "THINKING-THREAD-INITIALIZE", 1, 0, false);
            declareFunction("thinking_thread_finalize", "THINKING-THREAD-FINALIZE", 4, 0, false);
            declareFunction("ipc_queue_print_function_trampoline", "IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("ipc_queue_p", "IPC-QUEUE-P", 1, 0, false);
            new process_utilities.$ipc_queue_p$UnaryFunction();
            declareFunction("ipc_queue_lock", "IPC-QUEUE-LOCK", 1, 0, false);
            declareFunction("ipc_queue_semaphore", "IPC-QUEUE-SEMAPHORE", 1, 0, false);
            declareFunction("ipc_queue_data_queue", "IPC-QUEUE-DATA-QUEUE", 1, 0, false);
            declareFunction("_csetf_ipc_queue_lock", "_CSETF-IPC-QUEUE-LOCK", 2, 0, false);
            declareFunction("_csetf_ipc_queue_semaphore", "_CSETF-IPC-QUEUE-SEMAPHORE", 2, 0, false);
            declareFunction("_csetf_ipc_queue_data_queue", "_CSETF-IPC-QUEUE-DATA-QUEUE", 2, 0, false);
            declareFunction("make_ipc_queue", "MAKE-IPC-QUEUE", 0, 1, false);
            declareFunction("visit_defstruct_ipc_queue", "VISIT-DEFSTRUCT-IPC-QUEUE", 2, 0, false);
            declareFunction("visit_defstruct_object_ipc_queue_method", "VISIT-DEFSTRUCT-OBJECT-IPC-QUEUE-METHOD", 2, 0, false);
            declareFunction("new_ipc_queue", "NEW-IPC-QUEUE", 1, 0, false);
            declareFunction("ipc_enqueue", "IPC-ENQUEUE", 2, 1, false);
            declareFunction("ipc_dequeue", "IPC-DEQUEUE", 1, 1, false);
            declareFunction("check_ipcq_synchronized", "CHECK-IPCQ-SYNCHRONIZED", 1, 0, false);
            declareFunction("ipcq_debug", "IPCQ-DEBUG", 2, 3, false);
            declareFunction("ipc_dequeue_n", "IPC-DEQUEUE-N", 1, 2, false);
            declareFunction("ipc_drain", "IPC-DRAIN", 1, 1, false);
            declareFunction("ipc_dequeue_with_timeout", "IPC-DEQUEUE-WITH-TIMEOUT", 2, 1, false);
            declareFunction("ipc_current_queue_size", "IPC-CURRENT-QUEUE-SIZE", 1, 0, false);
            declareFunction("ipc_current_queue_content", "IPC-CURRENT-QUEUE-CONTENT", 1, 0, false);
            declareFunction("launch_ipcq_test_producer", "LAUNCH-IPCQ-TEST-PRODUCER", 1, 1, false);
            declareFunction("ipcq_test_producer_run", "IPCQ-TEST-PRODUCER-RUN", 1, 1, false);
            declareFunction("test_ipc_enqueue_dequeue", "TEST-IPC-ENQUEUE-DEQUEUE", 0, 0, false);
            declareFunction("test_ipc_enqueue_drain", "TEST-IPC-ENQUEUE-DRAIN", 0, 0, false);
            declareFunction("test_ipc_enqueue_drain_dequeue", "TEST-IPC-ENQUEUE-DRAIN-DEQUEUE", 0, 0, false);
            declareFunction("ordered_ipc_queue_print_function_trampoline", "ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("ordered_ipc_queue_p", "ORDERED-IPC-QUEUE-P", 1, 0, false);
            new process_utilities.$ordered_ipc_queue_p$UnaryFunction();
            declareFunction("ordrd_ipcq_lock", "ORDRD-IPCQ-LOCK", 1, 0, false);
            declareFunction("ordrd_ipcq_producer_isg", "ORDRD-IPCQ-PRODUCER-ISG", 1, 0, false);
            declareFunction("ordrd_ipcq_consumer_isg", "ORDRD-IPCQ-CONSUMER-ISG", 1, 0, false);
            declareFunction("ordrd_ipcq_payload", "ORDRD-IPCQ-PAYLOAD", 1, 0, false);
            declareFunction("ordrd_ipcq_early_consumer_semaphore", "ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE", 1, 0, false);
            declareFunction("_csetf_ordrd_ipcq_lock", "_CSETF-ORDRD-IPCQ-LOCK", 2, 0, false);
            declareFunction("_csetf_ordrd_ipcq_producer_isg", "_CSETF-ORDRD-IPCQ-PRODUCER-ISG", 2, 0, false);
            declareFunction("_csetf_ordrd_ipcq_consumer_isg", "_CSETF-ORDRD-IPCQ-CONSUMER-ISG", 2, 0, false);
            declareFunction("_csetf_ordrd_ipcq_payload", "_CSETF-ORDRD-IPCQ-PAYLOAD", 2, 0, false);
            declareFunction("_csetf_ordrd_ipcq_early_consumer_semaphore", "_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE", 2, 0, false);
            declareFunction("make_ordered_ipc_queue", "MAKE-ORDERED-IPC-QUEUE", 0, 1, false);
            declareFunction("visit_defstruct_ordered_ipc_queue", "VISIT-DEFSTRUCT-ORDERED-IPC-QUEUE", 2, 0, false);
            declareFunction("visit_defstruct_object_ordered_ipc_queue_method", "VISIT-DEFSTRUCT-OBJECT-ORDERED-IPC-QUEUE-METHOD", 2, 0, false);
            declareFunction("new_ordered_ipc_queue", "NEW-ORDERED-IPC-QUEUE", 1, 1, false);
            declareFunction("ordered_ipc_enqueue", "ORDERED-IPC-ENQUEUE", 2, 0, false);
            declareFunction("ordered_ipc_dequeue", "ORDERED-IPC-DEQUEUE", 1, 0, false);
            declareFunction("ordered_ipc_queue_emptyP", "ORDERED-IPC-QUEUE-EMPTY?", 1, 0, false);
            declareFunction("ordered_ipc_current_queue_size", "ORDERED-IPC-CURRENT-QUEUE-SIZE", 1, 1, false);
            declareFunction("ordered_ipc_current_queue_contents", "ORDERED-IPC-CURRENT-QUEUE-CONTENTS", 1, 0, false);
            declareFunction("ordered_ipc_queue_quiescedP", "ORDERED-IPC-QUEUE-QUIESCED?", 1, 0, false);
            declareFunction("kill_process_named", "KILL-PROCESS-NAMED", 1, 0, false);
            declareFunction("process_named", "PROCESS-NAMED", 1, 0, false);
            declareFunction("process_exhaust_immediately_fn", "PROCESS-EXHAUST-IMMEDIATELY-FN", 0, 0, false);
            declareFunction("make_exhausted_process", "MAKE-EXHAUSTED-PROCESS", 1, 0, false);
            declareFunction("visit_defstruct_object_process_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD", 2, 0, false);
            declareFunction("visit_defstruct_object_process", "VISIT-DEFSTRUCT-OBJECT-PROCESS", 2, 0, false);
            declareFunction("visit_defstruct_object_lock_method", "VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD", 2, 0, false);
            declareFunction("visit_defstruct_object_lock", "VISIT-DEFSTRUCT-OBJECT-LOCK", 2, 0, false);
            declareFunction("process_wrapper_print_function_trampoline", "PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("process_wrapper_p", "PROCESS-WRAPPER-P", 1, 0, false);
            new process_utilities.$process_wrapper_p$UnaryFunction();
            declareFunction("process_wrapper_id", "PROCESS-WRAPPER-ID", 1, 0, false);
            declareFunction("process_wrapper_process", "PROCESS-WRAPPER-PROCESS", 1, 0, false);
            declareFunction("process_wrapper_state", "PROCESS-WRAPPER-STATE", 1, 0, false);
            declareFunction("process_wrapper_lock", "PROCESS-WRAPPER-LOCK", 1, 0, false);
            declareFunction("process_wrapper_plist", "PROCESS-WRAPPER-PLIST", 1, 0, false);
            declareFunction("_csetf_process_wrapper_id", "_CSETF-PROCESS-WRAPPER-ID", 2, 0, false);
            declareFunction("_csetf_process_wrapper_process", "_CSETF-PROCESS-WRAPPER-PROCESS", 2, 0, false);
            declareFunction("_csetf_process_wrapper_state", "_CSETF-PROCESS-WRAPPER-STATE", 2, 0, false);
            declareFunction("_csetf_process_wrapper_lock", "_CSETF-PROCESS-WRAPPER-LOCK", 2, 0, false);
            declareFunction("_csetf_process_wrapper_plist", "_CSETF-PROCESS-WRAPPER-PLIST", 2, 0, false);
            declareFunction("make_process_wrapper", "MAKE-PROCESS-WRAPPER", 0, 1, false);
            declareFunction("visit_defstruct_process_wrapper", "VISIT-DEFSTRUCT-PROCESS-WRAPPER", 2, 0, false);
            declareFunction("visit_defstruct_object_process_wrapper_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-WRAPPER-METHOD", 2, 0, false);
            declareFunction("new_process_wrapper", "NEW-PROCESS-WRAPPER", 2, 1, false);
            declareFunction("new_process_wrapper_int", "NEW-PROCESS-WRAPPER-INT", 3, 0, false);
            declareFunction("process_wrapper_get_id", "PROCESS-WRAPPER-GET-ID", 1, 0, false);
            declareFunction("process_wrapper_get_process", "PROCESS-WRAPPER-GET-PROCESS", 1, 0, false);
            declareFunction("process_wrapper_get_state", "PROCESS-WRAPPER-GET-STATE", 1, 0, false);
            declareFunction("process_wrapper_get_lock", "PROCESS-WRAPPER-GET-LOCK", 1, 0, false);
            declareFunction("process_wrapper_get_plist", "PROCESS-WRAPPER-GET-PLIST", 1, 0, false);
            declareFunction("process_wrapper_process_startingP", "PROCESS-WRAPPER-PROCESS-STARTING?", 1, 0, false);
            declareFunction("process_wrapper_process_runningP", "PROCESS-WRAPPER-PROCESS-RUNNING?", 1, 0, false);
            declareFunction("process_wrapper_process_completedP", "PROCESS-WRAPPER-PROCESS-COMPLETED?", 1, 0, false);
            declareFunction("process_wrapper_process_abortedP", "PROCESS-WRAPPER-PROCESS-ABORTED?", 1, 0, false);
            declareFunction("process_wrapper_process_pausingP", "PROCESS-WRAPPER-PROCESS-PAUSING?", 1, 0, false);
            declareFunction("process_wrapper_process_pausedP", "PROCESS-WRAPPER-PROCESS-PAUSED?", 1, 0, false);
            declareFunction("process_wrapper_process_pause", "PROCESS-WRAPPER-PROCESS-PAUSE", 1, 0, false);
            declareFunction("process_wrapper_process_resume", "PROCESS-WRAPPER-PROCESS-RESUME", 1, 0, false);
            declareFunction("process_wrapper_checkpoint", "PROCESS-WRAPPER-CHECKPOINT", 1, 0, false);
            declareFunction("process_wrapper_block", "PROCESS-WRAPPER-BLOCK", 1, 0, false);
            declareFunction("process_wrapper_process_abort", "PROCESS-WRAPPER-PROCESS-ABORT", 1, 0, false);
            declareFunction("process_wrapper_set_property", "PROCESS-WRAPPER-SET-PROPERTY", 3, 0, false);
            declareFunction("process_wrapper_get_property", "PROCESS-WRAPPER-GET-PROPERTY", 2, 1, false);
            declareFunction("make_cyc_server_process", "MAKE-CYC-SERVER-PROCESS", 2, 0, false);
            declareFunction("cyc_server_process_funcall", "CYC-SERVER-PROCESS-FUNCALL", 1, 0, false);
            declareFunction("make_cyc_server_process_with_args", "MAKE-CYC-SERVER-PROCESS-WITH-ARGS", 2, 1, false);
            declareFunction("cyc_server_process_funcall_with_args", "CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS", 1, 0, false);
            declareFunction("process_count", "PROCESS-COUNT", 0, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("ipc_enqueue", "IPC-ENQUEUE", 2, 0, false);
            declareFunction("ipc_dequeue", "IPC-DEQUEUE", 1, 0, false);
            declareFunction("ipc_dequeue_n", "IPC-DEQUEUE-N", 1, 1, false);
            declareFunction("ordered_ipc_current_queue_size", "ORDERED-IPC-CURRENT-QUEUE-SIZE", 1, 0, false);
            declareFunction("get_thinking_test_case_thinking", "GET-THINKING-TEST-CASE-THINKING", 1, 0, false);
            declareFunction("set_thinking_test_case_thinking", "SET-THINKING-TEST-CASE-THINKING", 2, 0, false);
            declareFunction("subloop_reserved_initialize_thinking_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-THINKING-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_thinking_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-THINKING-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("thinking_test_case_p", "THINKING-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_process_utilities_file_Previous() {
        declareFunction("debug_initial_process", "DEBUG-INITIAL-PROCESS", 0, 0, false);
        declareFunction("interrupt_initial_process", "INTERRUPT-INITIAL-PROCESS", 0, 0, false);
        declareFunction("process_idleP", "PROCESS-IDLE?", 1, 0, false);
        declareFunction("process_busyP", "PROCESS-BUSY?", 1, 0, false);
        declareFunction("process_waitingP", "PROCESS-WAITING?", 1, 0, false);
        declareFunction("process_runningP", "PROCESS-RUNNING?", 1, 0, false);
        declareFunction("process_suid", "PROCESS-SUID", 1, 0, false);
        declareFunction("find_process_by_suid", "FIND-PROCESS-BY-SUID", 1, 0, false);
        declareFunction("find_process_by_name", "FIND-PROCESS-BY-NAME", 1, 1, false);
        declareFunction("gather_processes_by_name", "GATHER-PROCESSES-BY-NAME", 1, 1, false);
        declareFunction("active_process_at_startupP", "ACTIVE-PROCESS-AT-STARTUP?", 1, 0, false);
        declareFunction("note_active_processes_at_startup", "NOTE-ACTIVE-PROCESSES-AT-STARTUP", 0, 0, false);
        declareFunction("process_form", "PROCESS-FORM", 1, 0, false);
        declareFunction("process_note_form", "PROCESS-NOTE-FORM", 2, 0, false);
        declareFunction("current_process_note_form", "CURRENT-PROCESS-NOTE-FORM", 1, 0, false);
        declareFunction("current_process_clear_form", "CURRENT-PROCESS-CLEAR-FORM", 0, 0, false);
        declareFunction("clear_invalid_process_forms", "CLEAR-INVALID-PROCESS-FORMS", 0, 0, false);
        declareFunction("task_print_function_trampoline", "TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("task_p", "TASK-P", 1, 0, false);
        new process_utilities.$task_p$UnaryFunction();
        declareFunction("task_process", "TASK-PROCESS", 1, 0, false);
        declareFunction("task_completed", "TASK-COMPLETED", 1, 0, false);
        declareFunction("_csetf_task_process", "_CSETF-TASK-PROCESS", 2, 0, false);
        declareFunction("_csetf_task_completed", "_CSETF-TASK-COMPLETED", 2, 0, false);
        declareFunction("make_task", "MAKE-TASK", 0, 1, false);
        declareFunction("visit_defstruct_task", "VISIT-DEFSTRUCT-TASK", 2, 0, false);
        declareFunction("visit_defstruct_object_task_method", "VISIT-DEFSTRUCT-OBJECT-TASK-METHOD", 2, 0, false);
        declareFunction("new_task", "NEW-TASK", 2, 2, false);
        declareFunction("new_task_internal", "NEW-TASK-INTERNAL", 5, 0, false);
        declareFunction("thinking_task_print_function_trampoline", "THINKING-TASK-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("thinking_task_p", "THINKING-TASK-P", 1, 0, false);
        new process_utilities.$thinking_task_p$UnaryFunction();
        declareFunction("t_task_lock", "T-TASK-LOCK", 1, 0, false);
        declareFunction("t_task_thread", "T-TASK-THREAD", 1, 0, false);
        declareFunction("t_task_name", "T-TASK-NAME", 1, 0, false);
        declareFunction("t_task_status", "T-TASK-STATUS", 1, 0, false);
        declareFunction("t_task_progress_message", "T-TASK-PROGRESS-MESSAGE", 1, 0, false);
        declareFunction("t_task_progress_sofar", "T-TASK-PROGRESS-SOFAR", 1, 0, false);
        declareFunction("t_task_progress_total", "T-TASK-PROGRESS-TOTAL", 1, 0, false);
        declareFunction("t_task_start_time", "T-TASK-START-TIME", 1, 0, false);
        declareFunction("t_task_finish_time", "T-TASK-FINISH-TIME", 1, 0, false);
        declareFunction("t_task_result", "T-TASK-RESULT", 1, 0, false);
        declareFunction("t_task_error_message", "T-TASK-ERROR-MESSAGE", 1, 0, false);
        declareFunction("t_task_properties", "T-TASK-PROPERTIES", 1, 0, false);
        declareFunction("_csetf_t_task_lock", "_CSETF-T-TASK-LOCK", 2, 0, false);
        declareFunction("_csetf_t_task_thread", "_CSETF-T-TASK-THREAD", 2, 0, false);
        declareFunction("_csetf_t_task_name", "_CSETF-T-TASK-NAME", 2, 0, false);
        declareFunction("_csetf_t_task_status", "_CSETF-T-TASK-STATUS", 2, 0, false);
        declareFunction("_csetf_t_task_progress_message", "_CSETF-T-TASK-PROGRESS-MESSAGE", 2, 0, false);
        declareFunction("_csetf_t_task_progress_sofar", "_CSETF-T-TASK-PROGRESS-SOFAR", 2, 0, false);
        declareFunction("_csetf_t_task_progress_total", "_CSETF-T-TASK-PROGRESS-TOTAL", 2, 0, false);
        declareFunction("_csetf_t_task_start_time", "_CSETF-T-TASK-START-TIME", 2, 0, false);
        declareFunction("_csetf_t_task_finish_time", "_CSETF-T-TASK-FINISH-TIME", 2, 0, false);
        declareFunction("_csetf_t_task_result", "_CSETF-T-TASK-RESULT", 2, 0, false);
        declareFunction("_csetf_t_task_error_message", "_CSETF-T-TASK-ERROR-MESSAGE", 2, 0, false);
        declareFunction("_csetf_t_task_properties", "_CSETF-T-TASK-PROPERTIES", 2, 0, false);
        declareFunction("make_thinking_task", "MAKE-THINKING-TASK", 0, 1, false);
        declareFunction("visit_defstruct_thinking_task", "VISIT-DEFSTRUCT-THINKING-TASK", 2, 0, false);
        declareFunction("visit_defstruct_object_thinking_task_method", "VISIT-DEFSTRUCT-OBJECT-THINKING-TASK-METHOD", 2, 0, false);
        declareFunction("new_thinking_task", "NEW-THINKING-TASK", 2, 1, false);
        declareMacro("with_thinking_lock", "WITH-THINKING-LOCK");
        declareFunction("thinking_note_thread", "THINKING-NOTE-THREAD", 2, 0, false);
        declareFunction("thinking_clear_thread", "THINKING-CLEAR-THREAD", 1, 0, false);
        declareFunction("thinking_note_status", "THINKING-NOTE-STATUS", 2, 0, false);
        declareFunction("thinking_note_progress_message", "THINKING-NOTE-PROGRESS-MESSAGE", 2, 0, false);
        declareFunction("thinking_note_progress_sofar", "THINKING-NOTE-PROGRESS-SOFAR", 2, 0, false);
        declareFunction("thinking_note_progress_total", "THINKING-NOTE-PROGRESS-TOTAL", 2, 0, false);
        declareFunction("thinking_note_start_time", "THINKING-NOTE-START-TIME", 2, 0, false);
        declareFunction("thinking_note_finish_time", "THINKING-NOTE-FINISH-TIME", 2, 0, false);
        declareFunction("thinking_note_result", "THINKING-NOTE-RESULT", 2, 0, false);
        declareFunction("thinking_note_error_message", "THINKING-NOTE-ERROR-MESSAGE", 2, 0, false);
        declareFunction("thinking_note_property", "THINKING-NOTE-PROPERTY", 3, 0, false);
        declareFunction("thinking_lock", "THINKING-LOCK", 1, 0, false);
        declareFunction("thinking_thread", "THINKING-THREAD", 1, 0, false);
        declareFunction("thinking_name", "THINKING-NAME", 1, 0, false);
        declareFunction("thinking_status", "THINKING-STATUS", 1, 0, false);
        declareFunction("thinking_progress_message", "THINKING-PROGRESS-MESSAGE", 1, 0, false);
        declareFunction("thinking_progress_sofar", "THINKING-PROGRESS-SOFAR", 1, 0, false);
        declareFunction("thinking_progress_total", "THINKING-PROGRESS-TOTAL", 1, 0, false);
        declareFunction("thinking_start_time", "THINKING-START-TIME", 1, 0, false);
        declareFunction("thinking_finish_time", "THINKING-FINISH-TIME", 1, 0, false);
        declareFunction("thinking_result", "THINKING-RESULT", 1, 0, false);
        declareFunction("thinking_error_message", "THINKING-ERROR-MESSAGE", 1, 0, false);
        declareFunction("thinking_property", "THINKING-PROPERTY", 2, 0, false);
        declareFunction("thinking_properties", "THINKING-PROPERTIES", 1, 0, false);
        declareFunction("thinking_task", "THINKING-TASK", 0, 0, false);
        declareFunction("thinking_start", "THINKING-START", 3, 0, false);
        declareFunction("thinking_stop", "THINKING-STOP", 1, 0, false);
        declareFunction("thinking_thread_run", "THINKING-THREAD-RUN", 3, 0, false);
        declareFunction("thinking_thread_initialize", "THINKING-THREAD-INITIALIZE", 1, 0, false);
        declareFunction("thinking_thread_finalize", "THINKING-THREAD-FINALIZE", 4, 0, false);
        declareFunction("ipc_queue_print_function_trampoline", "IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ipc_queue_p", "IPC-QUEUE-P", 1, 0, false);
        new process_utilities.$ipc_queue_p$UnaryFunction();
        declareFunction("ipc_queue_lock", "IPC-QUEUE-LOCK", 1, 0, false);
        declareFunction("ipc_queue_semaphore", "IPC-QUEUE-SEMAPHORE", 1, 0, false);
        declareFunction("ipc_queue_data_queue", "IPC-QUEUE-DATA-QUEUE", 1, 0, false);
        declareFunction("_csetf_ipc_queue_lock", "_CSETF-IPC-QUEUE-LOCK", 2, 0, false);
        declareFunction("_csetf_ipc_queue_semaphore", "_CSETF-IPC-QUEUE-SEMAPHORE", 2, 0, false);
        declareFunction("_csetf_ipc_queue_data_queue", "_CSETF-IPC-QUEUE-DATA-QUEUE", 2, 0, false);
        declareFunction("make_ipc_queue", "MAKE-IPC-QUEUE", 0, 1, false);
        declareFunction("visit_defstruct_ipc_queue", "VISIT-DEFSTRUCT-IPC-QUEUE", 2, 0, false);
        declareFunction("visit_defstruct_object_ipc_queue_method", "VISIT-DEFSTRUCT-OBJECT-IPC-QUEUE-METHOD", 2, 0, false);
        declareFunction("new_ipc_queue", "NEW-IPC-QUEUE", 1, 0, false);
        declareFunction("ipc_enqueue", "IPC-ENQUEUE", 2, 1, false);
        declareFunction("ipc_dequeue", "IPC-DEQUEUE", 1, 1, false);
        declareFunction("check_ipcq_synchronized", "CHECK-IPCQ-SYNCHRONIZED", 1, 0, false);
        declareFunction("ipcq_debug", "IPCQ-DEBUG", 2, 3, false);
        declareFunction("ipc_dequeue_n", "IPC-DEQUEUE-N", 1, 2, false);
        declareFunction("ipc_drain", "IPC-DRAIN", 1, 1, false);
        declareFunction("ipc_dequeue_with_timeout", "IPC-DEQUEUE-WITH-TIMEOUT", 2, 1, false);
        declareFunction("ipc_current_queue_size", "IPC-CURRENT-QUEUE-SIZE", 1, 0, false);
        declareFunction("ipc_current_queue_content", "IPC-CURRENT-QUEUE-CONTENT", 1, 0, false);
        declareFunction("launch_ipcq_test_producer", "LAUNCH-IPCQ-TEST-PRODUCER", 1, 1, false);
        declareFunction("ipcq_test_producer_run", "IPCQ-TEST-PRODUCER-RUN", 1, 1, false);
        declareFunction("test_ipc_enqueue_dequeue", "TEST-IPC-ENQUEUE-DEQUEUE", 0, 0, false);
        declareFunction("test_ipc_enqueue_drain", "TEST-IPC-ENQUEUE-DRAIN", 0, 0, false);
        declareFunction("test_ipc_enqueue_drain_dequeue", "TEST-IPC-ENQUEUE-DRAIN-DEQUEUE", 0, 0, false);
        declareFunction("ordered_ipc_queue_print_function_trampoline", "ORDERED-IPC-QUEUE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("ordered_ipc_queue_p", "ORDERED-IPC-QUEUE-P", 1, 0, false);
        new process_utilities.$ordered_ipc_queue_p$UnaryFunction();
        declareFunction("ordrd_ipcq_lock", "ORDRD-IPCQ-LOCK", 1, 0, false);
        declareFunction("ordrd_ipcq_producer_isg", "ORDRD-IPCQ-PRODUCER-ISG", 1, 0, false);
        declareFunction("ordrd_ipcq_consumer_isg", "ORDRD-IPCQ-CONSUMER-ISG", 1, 0, false);
        declareFunction("ordrd_ipcq_payload", "ORDRD-IPCQ-PAYLOAD", 1, 0, false);
        declareFunction("ordrd_ipcq_early_consumer_semaphore", "ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE", 1, 0, false);
        declareFunction("_csetf_ordrd_ipcq_lock", "_CSETF-ORDRD-IPCQ-LOCK", 2, 0, false);
        declareFunction("_csetf_ordrd_ipcq_producer_isg", "_CSETF-ORDRD-IPCQ-PRODUCER-ISG", 2, 0, false);
        declareFunction("_csetf_ordrd_ipcq_consumer_isg", "_CSETF-ORDRD-IPCQ-CONSUMER-ISG", 2, 0, false);
        declareFunction("_csetf_ordrd_ipcq_payload", "_CSETF-ORDRD-IPCQ-PAYLOAD", 2, 0, false);
        declareFunction("_csetf_ordrd_ipcq_early_consumer_semaphore", "_CSETF-ORDRD-IPCQ-EARLY-CONSUMER-SEMAPHORE", 2, 0, false);
        declareFunction("make_ordered_ipc_queue", "MAKE-ORDERED-IPC-QUEUE", 0, 1, false);
        declareFunction("visit_defstruct_ordered_ipc_queue", "VISIT-DEFSTRUCT-ORDERED-IPC-QUEUE", 2, 0, false);
        declareFunction("visit_defstruct_object_ordered_ipc_queue_method", "VISIT-DEFSTRUCT-OBJECT-ORDERED-IPC-QUEUE-METHOD", 2, 0, false);
        declareFunction("new_ordered_ipc_queue", "NEW-ORDERED-IPC-QUEUE", 1, 1, false);
        declareFunction("ordered_ipc_enqueue", "ORDERED-IPC-ENQUEUE", 2, 0, false);
        declareFunction("ordered_ipc_dequeue", "ORDERED-IPC-DEQUEUE", 1, 0, false);
        declareFunction("ordered_ipc_queue_emptyP", "ORDERED-IPC-QUEUE-EMPTY?", 1, 0, false);
        declareFunction("ordered_ipc_current_queue_size", "ORDERED-IPC-CURRENT-QUEUE-SIZE", 1, 1, false);
        declareFunction("ordered_ipc_current_queue_contents", "ORDERED-IPC-CURRENT-QUEUE-CONTENTS", 1, 0, false);
        declareFunction("ordered_ipc_queue_quiescedP", "ORDERED-IPC-QUEUE-QUIESCED?", 1, 0, false);
        declareFunction("kill_process_named", "KILL-PROCESS-NAMED", 1, 0, false);
        declareFunction("process_named", "PROCESS-NAMED", 1, 0, false);
        declareFunction("process_exhaust_immediately_fn", "PROCESS-EXHAUST-IMMEDIATELY-FN", 0, 0, false);
        declareFunction("make_exhausted_process", "MAKE-EXHAUSTED-PROCESS", 1, 0, false);
        declareFunction("visit_defstruct_object_process_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-METHOD", 2, 0, false);
        declareFunction("visit_defstruct_object_process", "VISIT-DEFSTRUCT-OBJECT-PROCESS", 2, 0, false);
        declareFunction("visit_defstruct_object_lock_method", "VISIT-DEFSTRUCT-OBJECT-LOCK-METHOD", 2, 0, false);
        declareFunction("visit_defstruct_object_lock", "VISIT-DEFSTRUCT-OBJECT-LOCK", 2, 0, false);
        declareFunction("process_wrapper_print_function_trampoline", "PROCESS-WRAPPER-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("process_wrapper_p", "PROCESS-WRAPPER-P", 1, 0, false);
        new process_utilities.$process_wrapper_p$UnaryFunction();
        declareFunction("process_wrapper_id", "PROCESS-WRAPPER-ID", 1, 0, false);
        declareFunction("process_wrapper_process", "PROCESS-WRAPPER-PROCESS", 1, 0, false);
        declareFunction("process_wrapper_state", "PROCESS-WRAPPER-STATE", 1, 0, false);
        declareFunction("process_wrapper_lock", "PROCESS-WRAPPER-LOCK", 1, 0, false);
        declareFunction("process_wrapper_plist", "PROCESS-WRAPPER-PLIST", 1, 0, false);
        declareFunction("_csetf_process_wrapper_id", "_CSETF-PROCESS-WRAPPER-ID", 2, 0, false);
        declareFunction("_csetf_process_wrapper_process", "_CSETF-PROCESS-WRAPPER-PROCESS", 2, 0, false);
        declareFunction("_csetf_process_wrapper_state", "_CSETF-PROCESS-WRAPPER-STATE", 2, 0, false);
        declareFunction("_csetf_process_wrapper_lock", "_CSETF-PROCESS-WRAPPER-LOCK", 2, 0, false);
        declareFunction("_csetf_process_wrapper_plist", "_CSETF-PROCESS-WRAPPER-PLIST", 2, 0, false);
        declareFunction("make_process_wrapper", "MAKE-PROCESS-WRAPPER", 0, 1, false);
        declareFunction("visit_defstruct_process_wrapper", "VISIT-DEFSTRUCT-PROCESS-WRAPPER", 2, 0, false);
        declareFunction("visit_defstruct_object_process_wrapper_method", "VISIT-DEFSTRUCT-OBJECT-PROCESS-WRAPPER-METHOD", 2, 0, false);
        declareFunction("new_process_wrapper", "NEW-PROCESS-WRAPPER", 2, 1, false);
        declareFunction("new_process_wrapper_int", "NEW-PROCESS-WRAPPER-INT", 3, 0, false);
        declareFunction("process_wrapper_get_id", "PROCESS-WRAPPER-GET-ID", 1, 0, false);
        declareFunction("process_wrapper_get_process", "PROCESS-WRAPPER-GET-PROCESS", 1, 0, false);
        declareFunction("process_wrapper_get_state", "PROCESS-WRAPPER-GET-STATE", 1, 0, false);
        declareFunction("process_wrapper_get_lock", "PROCESS-WRAPPER-GET-LOCK", 1, 0, false);
        declareFunction("process_wrapper_get_plist", "PROCESS-WRAPPER-GET-PLIST", 1, 0, false);
        declareFunction("process_wrapper_process_startingP", "PROCESS-WRAPPER-PROCESS-STARTING?", 1, 0, false);
        declareFunction("process_wrapper_process_runningP", "PROCESS-WRAPPER-PROCESS-RUNNING?", 1, 0, false);
        declareFunction("process_wrapper_process_completedP", "PROCESS-WRAPPER-PROCESS-COMPLETED?", 1, 0, false);
        declareFunction("process_wrapper_process_abortedP", "PROCESS-WRAPPER-PROCESS-ABORTED?", 1, 0, false);
        declareFunction("process_wrapper_process_pausingP", "PROCESS-WRAPPER-PROCESS-PAUSING?", 1, 0, false);
        declareFunction("process_wrapper_process_pausedP", "PROCESS-WRAPPER-PROCESS-PAUSED?", 1, 0, false);
        declareFunction("process_wrapper_process_pause", "PROCESS-WRAPPER-PROCESS-PAUSE", 1, 0, false);
        declareFunction("process_wrapper_process_resume", "PROCESS-WRAPPER-PROCESS-RESUME", 1, 0, false);
        declareFunction("process_wrapper_checkpoint", "PROCESS-WRAPPER-CHECKPOINT", 1, 0, false);
        declareFunction("process_wrapper_block", "PROCESS-WRAPPER-BLOCK", 1, 0, false);
        declareFunction("process_wrapper_process_abort", "PROCESS-WRAPPER-PROCESS-ABORT", 1, 0, false);
        declareFunction("process_wrapper_set_property", "PROCESS-WRAPPER-SET-PROPERTY", 3, 0, false);
        declareFunction("process_wrapper_get_property", "PROCESS-WRAPPER-GET-PROPERTY", 2, 1, false);
        declareFunction("make_cyc_server_process", "MAKE-CYC-SERVER-PROCESS", 2, 0, false);
        declareFunction("cyc_server_process_funcall", "CYC-SERVER-PROCESS-FUNCALL", 1, 0, false);
        declareFunction("make_cyc_server_process_with_args", "MAKE-CYC-SERVER-PROCESS-WITH-ARGS", 2, 1, false);
        declareFunction("cyc_server_process_funcall_with_args", "CYC-SERVER-PROCESS-FUNCALL-WITH-ARGS", 1, 0, false);
        declareFunction("process_count", "PROCESS-COUNT", 0, 0, false);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeSymbol("DEBUG-INITIAL-PROCESS"));

    static private final SubLList $list_alt9 = list(makeSymbol("PROCESS"), makeSymbol("COMPLETED"));

    static private final SubLList $list_alt10 = list(makeKeyword("PROCESS"), makeKeyword("COMPLETED"));

    static private final SubLList $list_alt11 = list(makeSymbol("TASK-PROCESS"), makeSymbol("TASK-COMPLETED"));

    static private final SubLList $list_alt12 = list(makeSymbol("_CSETF-TASK-PROCESS"), makeSymbol("_CSETF-TASK-COMPLETED"));

    static private final SubLString $str_alt21$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLList $list_alt29 = list(new SubLObject[]{ makeSymbol("LOCK"), makeSymbol("THREAD"), makeSymbol("NAME"), makeSymbol("STATUS"), makeSymbol("PROGRESS-MESSAGE"), makeSymbol("PROGRESS-SOFAR"), makeSymbol("PROGRESS-TOTAL"), makeSymbol("START-TIME"), makeSymbol("FINISH-TIME"), makeSymbol("RESULT"), makeSymbol("ERROR-MESSAGE"), makeSymbol("PROPERTIES") });

    static private final SubLList $list_alt30 = list(new SubLObject[]{ $LOCK, makeKeyword("THREAD"), $NAME, makeKeyword("STATUS"), makeKeyword("PROGRESS-MESSAGE"), makeKeyword("PROGRESS-SOFAR"), makeKeyword("PROGRESS-TOTAL"), makeKeyword("START-TIME"), makeKeyword("FINISH-TIME"), makeKeyword("RESULT"), makeKeyword("ERROR-MESSAGE"), makeKeyword("PROPERTIES") });

    public static final SubLObject init_process_utilities_file_alt() {
        // $dtp_task$ = defconstant("*DTP-TASK*", $sym7$TASK);
        defconstant("*DTP-THINKING-TASK*", THINKING_TASK);
        defparameter("*THINKING-TASK*", NIL);
        defconstant("*DTP-IPC-QUEUE*", IPC_QUEUE);
        defconstant("*DTP-ORDERED-IPC-QUEUE*", ORDERED_IPC_QUEUE);
        defconstant("*ORDERED-IPCQ-EMPTY*", make_symbol($$$empty_ordered_IPC_queue_entry));
        defconstant("*DTP-PROCESS-WRAPPER*", PROCESS_WRAPPER);
        // $process_wrapper_isg$ =
        deflexical("*PROCESS-WRAPPER-ISG*", NIL != boundp($process_wrapper_isg$) ? ((SubLObject) ($process_wrapper_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject init_process_utilities_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*ACTIVE-PROCESSES-AT-STARTUP*", SubLTrampolineFile.maybeDefault(process_utilities.$active_processes_at_startup$, process_utilities.$active_processes_at_startup$, NIL));
            deflexical("*PROCESS-FORM-MAP*", SubLTrampolineFile.maybeDefault(process_utilities.$process_form_map$, process_utilities.$process_form_map$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQ), UNPROVIDED)));
            deflexical("*PROCESS-FORM-LOCK*", make_lock(process_utilities.$$$Process_Form));
            defconstant("*DTP-TASK*", TASK);
            defconstant("*DTP-THINKING-TASK*", process_utilities.THINKING_TASK);
            defparameter("*THINKING-TASK*", NIL);
            defconstant("*DTP-IPC-QUEUE*", process_utilities.IPC_QUEUE);
            defparameter("*IPCQ-DEBUG?*", NIL);
            deflexical("*IPCQ-TEST-ITEMS*", process_utilities.$list141);
            defconstant("*DTP-ORDERED-IPC-QUEUE*", process_utilities.ORDERED_IPC_QUEUE);
            defconstant("*ORDERED-IPCQ-EMPTY*", make_symbol(process_utilities.$$$empty_ordered_IPC_queue_entry));
            defparameter("*ORDERED-IPC-CURRENT-QUEUE-SIZE-ESTIMATION-THRESHOLD*", process_utilities.$int$212);
            defconstant("*DTP-PROCESS-WRAPPER*", process_utilities.PROCESS_WRAPPER);
            deflexical("*PROCESS-WRAPPER-ISG*", SubLTrampolineFile.maybeDefault(process_utilities.$process_wrapper_isg$, process_utilities.$process_wrapper_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            // $dtp_task$ = defconstant("*DTP-TASK*", $sym7$TASK);
            defconstant("*DTP-THINKING-TASK*", THINKING_TASK);
            // $process_wrapper_isg$ =
            deflexical("*PROCESS-WRAPPER-ISG*", NIL != boundp($process_wrapper_isg$) ? ((SubLObject) ($process_wrapper_isg$.getGlobalValue())) : integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_process_utilities_file_Previous() {
        deflexical("*ACTIVE-PROCESSES-AT-STARTUP*", SubLTrampolineFile.maybeDefault(process_utilities.$active_processes_at_startup$, process_utilities.$active_processes_at_startup$, NIL));
        deflexical("*PROCESS-FORM-MAP*", SubLTrampolineFile.maybeDefault(process_utilities.$process_form_map$, process_utilities.$process_form_map$, () -> make_hash_table(TEN_INTEGER, symbol_function(EQ), UNPROVIDED)));
        deflexical("*PROCESS-FORM-LOCK*", make_lock(process_utilities.$$$Process_Form));
        defconstant("*DTP-TASK*", TASK);
        defconstant("*DTP-THINKING-TASK*", process_utilities.THINKING_TASK);
        defparameter("*THINKING-TASK*", NIL);
        defconstant("*DTP-IPC-QUEUE*", process_utilities.IPC_QUEUE);
        defparameter("*IPCQ-DEBUG?*", NIL);
        deflexical("*IPCQ-TEST-ITEMS*", process_utilities.$list141);
        defconstant("*DTP-ORDERED-IPC-QUEUE*", process_utilities.ORDERED_IPC_QUEUE);
        defconstant("*ORDERED-IPCQ-EMPTY*", make_symbol(process_utilities.$$$empty_ordered_IPC_queue_entry));
        defparameter("*ORDERED-IPC-CURRENT-QUEUE-SIZE-ESTIMATION-THRESHOLD*", process_utilities.$int$212);
        defconstant("*DTP-PROCESS-WRAPPER*", process_utilities.PROCESS_WRAPPER);
        deflexical("*PROCESS-WRAPPER-ISG*", SubLTrampolineFile.maybeDefault(process_utilities.$process_wrapper_isg$, process_utilities.$process_wrapper_isg$, () -> integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        return NIL;
    }

    static private final SubLList $list_alt31 = list(new SubLObject[]{ makeSymbol("T-TASK-LOCK"), makeSymbol("T-TASK-THREAD"), makeSymbol("T-TASK-NAME"), makeSymbol("T-TASK-STATUS"), makeSymbol("T-TASK-PROGRESS-MESSAGE"), makeSymbol("T-TASK-PROGRESS-SOFAR"), makeSymbol("T-TASK-PROGRESS-TOTAL"), makeSymbol("T-TASK-START-TIME"), makeSymbol("T-TASK-FINISH-TIME"), makeSymbol("T-TASK-RESULT"), makeSymbol("T-TASK-ERROR-MESSAGE"), makeSymbol("T-TASK-PROPERTIES") });

    static private final SubLList $list_alt32 = list(new SubLObject[]{ makeSymbol("_CSETF-T-TASK-LOCK"), makeSymbol("_CSETF-T-TASK-THREAD"), makeSymbol("_CSETF-T-TASK-NAME"), makeSymbol("_CSETF-T-TASK-STATUS"), makeSymbol("_CSETF-T-TASK-PROGRESS-MESSAGE"), makeSymbol("_CSETF-T-TASK-PROGRESS-SOFAR"), makeSymbol("_CSETF-T-TASK-PROGRESS-TOTAL"), makeSymbol("_CSETF-T-TASK-START-TIME"), makeSymbol("_CSETF-T-TASK-FINISH-TIME"), makeSymbol("_CSETF-T-TASK-RESULT"), makeSymbol("_CSETF-T-TASK-ERROR-MESSAGE"), makeSymbol("_CSETF-T-TASK-PROPERTIES") });

    public static final SubLObject setup_process_utilities_file_alt() {
        define_obsolete_register(INTERRUPT_INITIAL_PROCESS, $list_alt1);
        register_method($print_object_method_table$.getGlobalValue(), process_utilities.$dtp_task$.getGlobalValue(), symbol_function(TASK_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(TASK_PROCESS, _CSETF_TASK_PROCESS);
        def_csetf(TASK_COMPLETED, _CSETF_TASK_COMPLETED);
        identity(TASK);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_thinking_task$.getGlobalValue(), symbol_function(THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(T_TASK_LOCK, _CSETF_T_TASK_LOCK);
        def_csetf(T_TASK_THREAD, _CSETF_T_TASK_THREAD);
        def_csetf(T_TASK_NAME, _CSETF_T_TASK_NAME);
        def_csetf(T_TASK_STATUS, _CSETF_T_TASK_STATUS);
        def_csetf(T_TASK_PROGRESS_MESSAGE, _CSETF_T_TASK_PROGRESS_MESSAGE);
        def_csetf(T_TASK_PROGRESS_SOFAR, _CSETF_T_TASK_PROGRESS_SOFAR);
        def_csetf(T_TASK_PROGRESS_TOTAL, _CSETF_T_TASK_PROGRESS_TOTAL);
        def_csetf(T_TASK_START_TIME, _CSETF_T_TASK_START_TIME);
        def_csetf(T_TASK_FINISH_TIME, _CSETF_T_TASK_FINISH_TIME);
        def_csetf(T_TASK_RESULT, _CSETF_T_TASK_RESULT);
        def_csetf(T_TASK_ERROR_MESSAGE, _CSETF_T_TASK_ERROR_MESSAGE);
        def_csetf(T_TASK_PROPERTIES, _CSETF_T_TASK_PROPERTIES);
        identity(THINKING_TASK);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ipc_queue$.getGlobalValue(), symbol_function(IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(IPC_QUEUE_LOCK, _CSETF_IPC_QUEUE_LOCK);
        def_csetf(IPC_QUEUE_SEMAPHORE, _CSETF_IPC_QUEUE_SEMAPHORE);
        def_csetf(IPC_QUEUE_DATA_QUEUE, _CSETF_IPC_QUEUE_DATA_QUEUE);
        identity(IPC_QUEUE);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_ordered_ipc_queue$.getGlobalValue(), symbol_function(ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(ORDRD_IPCQ_LOCK, _CSETF_ORDRD_IPCQ_LOCK);
        def_csetf(ORDRD_IPCQ_PRODUCER_ISG, _CSETF_ORDRD_IPCQ_PRODUCER_ISG);
        def_csetf(ORDRD_IPCQ_CONSUMER_ISG, _CSETF_ORDRD_IPCQ_CONSUMER_ISG);
        def_csetf(ORDRD_IPCQ_PAYLOAD, _CSETF_ORDRD_IPCQ_PAYLOAD);
        identity(ORDERED_IPC_QUEUE);
        register_cyc_api_function(KILL_PROCESS_NAMED, $list_alt134, $str_alt135$_param_NAME__stringp____Kills_any, $list_alt136, $list_alt137);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_process$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD));
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_lock$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), $dtp_process_wrapper$.getGlobalValue(), symbol_function(PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(PROCESS_WRAPPER_ID, _CSETF_PROCESS_WRAPPER_ID);
        def_csetf(PROCESS_WRAPPER_PROCESS, _CSETF_PROCESS_WRAPPER_PROCESS);
        def_csetf(PROCESS_WRAPPER_STATE, _CSETF_PROCESS_WRAPPER_STATE);
        def_csetf(PROCESS_WRAPPER_LOCK, _CSETF_PROCESS_WRAPPER_LOCK);
        def_csetf(PROCESS_WRAPPER_PLIST, _CSETF_PROCESS_WRAPPER_PLIST);
        identity(PROCESS_WRAPPER);
        declare_defglobal($process_wrapper_isg$);
        note_funcall_helper_function(CYC_SERVER_PROCESS_FUNCALL);
        note_funcall_helper_function(CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(THINKING_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(THINKING_TEST_CASE);
        classes.subloop_new_class(THINKING_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt179);
        classes.class_set_implements_slot_listeners(THINKING_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(THINKING_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_THINKING_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(THINKING_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_THINKING_TEST_CASE_INSTANCE);
        subloop_reserved_initialize_thinking_test_case_class(THINKING_TEST_CASE);
        sunit_macros.define_test_case_postamble(THINKING_TEST_CASE, $str_alt195$process_utilities, $$$cycl, NIL);
        sunit_macros.def_test_method_register(THINKING_TEST_CASE, THINKING_EXISTS_TESTS);
        sunit_macros.def_test_method_register(THINKING_TEST_CASE, THINKING_BAD_ARGS_TESTS);
        sunit_macros.def_test_method_register(THINKING_TEST_CASE, THINKING_COMPLEX_TEST_1);
        sunit_macros.def_test_method_register(THINKING_TEST_CASE, THINKING_COMPLEX_TEST_2);
        return NIL;
    }

    public static SubLObject setup_process_utilities_file() {
        if (SubLFiles.USE_V1) {
            define_obsolete_register(process_utilities.INTERRUPT_INITIAL_PROCESS, process_utilities.$list1);
            declare_defglobal(process_utilities.$active_processes_at_startup$);
            declare_defglobal(process_utilities.$process_form_map$);
            register_method($print_object_method_table$.getGlobalValue(), process_utilities.$dtp_task$.getGlobalValue(), symbol_function(process_utilities.TASK_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(process_utilities.$list21);
            def_csetf(process_utilities.TASK_PROCESS, process_utilities._CSETF_TASK_PROCESS);
            def_csetf(process_utilities.TASK_COMPLETED, process_utilities._CSETF_TASK_COMPLETED);
            identity(TASK);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_task$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_TASK_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), process_utilities.$dtp_thinking_task$.getGlobalValue(), symbol_function(process_utilities.THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(process_utilities.$list46);
            def_csetf(process_utilities.T_TASK_LOCK, process_utilities._CSETF_T_TASK_LOCK);
            def_csetf(process_utilities.T_TASK_THREAD, process_utilities._CSETF_T_TASK_THREAD);
            def_csetf(process_utilities.T_TASK_NAME, process_utilities._CSETF_T_TASK_NAME);
            def_csetf(process_utilities.T_TASK_STATUS, process_utilities._CSETF_T_TASK_STATUS);
            def_csetf(process_utilities.T_TASK_PROGRESS_MESSAGE, process_utilities._CSETF_T_TASK_PROGRESS_MESSAGE);
            def_csetf(process_utilities.T_TASK_PROGRESS_SOFAR, process_utilities._CSETF_T_TASK_PROGRESS_SOFAR);
            def_csetf(process_utilities.T_TASK_PROGRESS_TOTAL, process_utilities._CSETF_T_TASK_PROGRESS_TOTAL);
            def_csetf(process_utilities.T_TASK_START_TIME, process_utilities._CSETF_T_TASK_START_TIME);
            def_csetf(process_utilities.T_TASK_FINISH_TIME, process_utilities._CSETF_T_TASK_FINISH_TIME);
            def_csetf(process_utilities.T_TASK_RESULT, process_utilities._CSETF_T_TASK_RESULT);
            def_csetf(process_utilities.T_TASK_ERROR_MESSAGE, process_utilities._CSETF_T_TASK_ERROR_MESSAGE);
            def_csetf(process_utilities.T_TASK_PROPERTIES, process_utilities._CSETF_T_TASK_PROPERTIES);
            identity(process_utilities.THINKING_TASK);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_thinking_task$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_THINKING_TASK_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), process_utilities.$dtp_ipc_queue$.getGlobalValue(), symbol_function(process_utilities.IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(process_utilities.$list113);
            def_csetf(process_utilities.IPC_QUEUE_LOCK, process_utilities._CSETF_IPC_QUEUE_LOCK);
            def_csetf(process_utilities.IPC_QUEUE_SEMAPHORE, process_utilities._CSETF_IPC_QUEUE_SEMAPHORE);
            def_csetf(process_utilities.IPC_QUEUE_DATA_QUEUE, process_utilities._CSETF_IPC_QUEUE_DATA_QUEUE);
            identity(process_utilities.IPC_QUEUE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_ipc_queue$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_IPC_QUEUE_METHOD));
            define_test_case_table_int(process_utilities.TEST_IPC_ENQUEUE_DEQUEUE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, process_utilities.$list150, $KB, $TINY, $WORKING_, T }), process_utilities.$list154);
            define_test_case_table_int(process_utilities.TEST_IPC_ENQUEUE_DRAIN, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, process_utilities.$list150, $KB, $TINY, $WORKING_, T }), process_utilities.$list154);
            define_test_case_table_int(process_utilities.TEST_IPC_ENQUEUE_DRAIN_DEQUEUE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, process_utilities.$list150, $KB, $TINY, $WORKING_, T }), process_utilities.$list154);
            register_method($print_object_method_table$.getGlobalValue(), process_utilities.$dtp_ordered_ipc_queue$.getGlobalValue(), symbol_function(process_utilities.ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(process_utilities.$list164);
            def_csetf(process_utilities.ORDRD_IPCQ_LOCK, process_utilities._CSETF_ORDRD_IPCQ_LOCK);
            def_csetf(process_utilities.ORDRD_IPCQ_PRODUCER_ISG, process_utilities._CSETF_ORDRD_IPCQ_PRODUCER_ISG);
            def_csetf(process_utilities.ORDRD_IPCQ_CONSUMER_ISG, process_utilities._CSETF_ORDRD_IPCQ_CONSUMER_ISG);
            def_csetf(process_utilities.ORDRD_IPCQ_PAYLOAD, process_utilities._CSETF_ORDRD_IPCQ_PAYLOAD);
            def_csetf(process_utilities.ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE, process_utilities._CSETF_ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE);
            identity(process_utilities.ORDERED_IPC_QUEUE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_ordered_ipc_queue$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_ORDERED_IPC_QUEUE_METHOD));
            register_cyc_api_function(process_utilities.KILL_PROCESS_NAMED, process_utilities.$list187, process_utilities.$str188$_param_NAME__stringp____Kills_any, process_utilities.$list189, process_utilities.$list190);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_process$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD));
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_lock$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD));
            register_method($print_object_method_table$.getGlobalValue(), process_utilities.$dtp_process_wrapper$.getGlobalValue(), symbol_function(process_utilities.PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(process_utilities.$list203);
            def_csetf(process_utilities.PROCESS_WRAPPER_ID, process_utilities._CSETF_PROCESS_WRAPPER_ID);
            def_csetf(process_utilities.PROCESS_WRAPPER_PROCESS, process_utilities._CSETF_PROCESS_WRAPPER_PROCESS);
            def_csetf(process_utilities.PROCESS_WRAPPER_STATE, process_utilities._CSETF_PROCESS_WRAPPER_STATE);
            def_csetf(process_utilities.PROCESS_WRAPPER_LOCK, process_utilities._CSETF_PROCESS_WRAPPER_LOCK);
            def_csetf(process_utilities.PROCESS_WRAPPER_PLIST, process_utilities._CSETF_PROCESS_WRAPPER_PLIST);
            identity(process_utilities.PROCESS_WRAPPER);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_process_wrapper$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_PROCESS_WRAPPER_METHOD));
            declare_defglobal(process_utilities.$process_wrapper_isg$);
            note_funcall_helper_function(process_utilities.CYC_SERVER_PROCESS_FUNCALL);
            note_funcall_helper_function(process_utilities.CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS);
        }
        if (SubLFiles.USE_V2) {
            register_cyc_api_function(KILL_PROCESS_NAMED, $list_alt134, $str_alt135$_param_NAME__stringp____Kills_any, $list_alt136, $list_alt137);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(THINKING_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(THINKING_TEST_CASE);
            classes.subloop_new_class(THINKING_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt179);
            classes.class_set_implements_slot_listeners(THINKING_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(THINKING_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_THINKING_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(THINKING_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_THINKING_TEST_CASE_INSTANCE);
            subloop_reserved_initialize_thinking_test_case_class(THINKING_TEST_CASE);
            sunit_macros.define_test_case_postamble(THINKING_TEST_CASE, $str_alt195$process_utilities, $$$cycl, NIL);
            sunit_macros.def_test_method_register(THINKING_TEST_CASE, THINKING_EXISTS_TESTS);
            sunit_macros.def_test_method_register(THINKING_TEST_CASE, THINKING_BAD_ARGS_TESTS);
            sunit_macros.def_test_method_register(THINKING_TEST_CASE, THINKING_COMPLEX_TEST_1);
            sunit_macros.def_test_method_register(THINKING_TEST_CASE, THINKING_COMPLEX_TEST_2);
        }
        return NIL;
    }

    public static SubLObject setup_process_utilities_file_Previous() {
        define_obsolete_register(process_utilities.INTERRUPT_INITIAL_PROCESS, process_utilities.$list1);
        declare_defglobal(process_utilities.$active_processes_at_startup$);
        declare_defglobal(process_utilities.$process_form_map$);
        register_method($print_object_method_table$.getGlobalValue(), process_utilities.$dtp_task$.getGlobalValue(), symbol_function(process_utilities.TASK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(process_utilities.$list21);
        def_csetf(process_utilities.TASK_PROCESS, process_utilities._CSETF_TASK_PROCESS);
        def_csetf(process_utilities.TASK_COMPLETED, process_utilities._CSETF_TASK_COMPLETED);
        identity(TASK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_task$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_TASK_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), process_utilities.$dtp_thinking_task$.getGlobalValue(), symbol_function(process_utilities.THINKING_TASK_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(process_utilities.$list46);
        def_csetf(process_utilities.T_TASK_LOCK, process_utilities._CSETF_T_TASK_LOCK);
        def_csetf(process_utilities.T_TASK_THREAD, process_utilities._CSETF_T_TASK_THREAD);
        def_csetf(process_utilities.T_TASK_NAME, process_utilities._CSETF_T_TASK_NAME);
        def_csetf(process_utilities.T_TASK_STATUS, process_utilities._CSETF_T_TASK_STATUS);
        def_csetf(process_utilities.T_TASK_PROGRESS_MESSAGE, process_utilities._CSETF_T_TASK_PROGRESS_MESSAGE);
        def_csetf(process_utilities.T_TASK_PROGRESS_SOFAR, process_utilities._CSETF_T_TASK_PROGRESS_SOFAR);
        def_csetf(process_utilities.T_TASK_PROGRESS_TOTAL, process_utilities._CSETF_T_TASK_PROGRESS_TOTAL);
        def_csetf(process_utilities.T_TASK_START_TIME, process_utilities._CSETF_T_TASK_START_TIME);
        def_csetf(process_utilities.T_TASK_FINISH_TIME, process_utilities._CSETF_T_TASK_FINISH_TIME);
        def_csetf(process_utilities.T_TASK_RESULT, process_utilities._CSETF_T_TASK_RESULT);
        def_csetf(process_utilities.T_TASK_ERROR_MESSAGE, process_utilities._CSETF_T_TASK_ERROR_MESSAGE);
        def_csetf(process_utilities.T_TASK_PROPERTIES, process_utilities._CSETF_T_TASK_PROPERTIES);
        identity(process_utilities.THINKING_TASK);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_thinking_task$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_THINKING_TASK_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), process_utilities.$dtp_ipc_queue$.getGlobalValue(), symbol_function(process_utilities.IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(process_utilities.$list113);
        def_csetf(process_utilities.IPC_QUEUE_LOCK, process_utilities._CSETF_IPC_QUEUE_LOCK);
        def_csetf(process_utilities.IPC_QUEUE_SEMAPHORE, process_utilities._CSETF_IPC_QUEUE_SEMAPHORE);
        def_csetf(process_utilities.IPC_QUEUE_DATA_QUEUE, process_utilities._CSETF_IPC_QUEUE_DATA_QUEUE);
        identity(process_utilities.IPC_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_ipc_queue$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_IPC_QUEUE_METHOD));
        define_test_case_table_int(process_utilities.TEST_IPC_ENQUEUE_DEQUEUE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, process_utilities.$list150, $KB, $TINY, $WORKING_, T }), process_utilities.$list154);
        define_test_case_table_int(process_utilities.TEST_IPC_ENQUEUE_DRAIN, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, process_utilities.$list150, $KB, $TINY, $WORKING_, T }), process_utilities.$list154);
        define_test_case_table_int(process_utilities.TEST_IPC_ENQUEUE_DRAIN_DEQUEUE, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, process_utilities.$list150, $KB, $TINY, $WORKING_, T }), process_utilities.$list154);
        register_method($print_object_method_table$.getGlobalValue(), process_utilities.$dtp_ordered_ipc_queue$.getGlobalValue(), symbol_function(process_utilities.ORDERED_IPC_QUEUE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(process_utilities.$list164);
        def_csetf(process_utilities.ORDRD_IPCQ_LOCK, process_utilities._CSETF_ORDRD_IPCQ_LOCK);
        def_csetf(process_utilities.ORDRD_IPCQ_PRODUCER_ISG, process_utilities._CSETF_ORDRD_IPCQ_PRODUCER_ISG);
        def_csetf(process_utilities.ORDRD_IPCQ_CONSUMER_ISG, process_utilities._CSETF_ORDRD_IPCQ_CONSUMER_ISG);
        def_csetf(process_utilities.ORDRD_IPCQ_PAYLOAD, process_utilities._CSETF_ORDRD_IPCQ_PAYLOAD);
        def_csetf(process_utilities.ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE, process_utilities._CSETF_ORDRD_IPCQ_EARLY_CONSUMER_SEMAPHORE);
        identity(process_utilities.ORDERED_IPC_QUEUE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_ordered_ipc_queue$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_ORDERED_IPC_QUEUE_METHOD));
        register_cyc_api_function(process_utilities.KILL_PROCESS_NAMED, process_utilities.$list187, process_utilities.$str188$_param_NAME__stringp____Kills_any, process_utilities.$list189, process_utilities.$list190);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_process$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_PROCESS_METHOD));
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_lock$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_LOCK_METHOD));
        register_method($print_object_method_table$.getGlobalValue(), process_utilities.$dtp_process_wrapper$.getGlobalValue(), symbol_function(process_utilities.PROCESS_WRAPPER_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(process_utilities.$list203);
        def_csetf(process_utilities.PROCESS_WRAPPER_ID, process_utilities._CSETF_PROCESS_WRAPPER_ID);
        def_csetf(process_utilities.PROCESS_WRAPPER_PROCESS, process_utilities._CSETF_PROCESS_WRAPPER_PROCESS);
        def_csetf(process_utilities.PROCESS_WRAPPER_STATE, process_utilities._CSETF_PROCESS_WRAPPER_STATE);
        def_csetf(process_utilities.PROCESS_WRAPPER_LOCK, process_utilities._CSETF_PROCESS_WRAPPER_LOCK);
        def_csetf(process_utilities.PROCESS_WRAPPER_PLIST, process_utilities._CSETF_PROCESS_WRAPPER_PLIST);
        identity(process_utilities.PROCESS_WRAPPER);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), process_utilities.$dtp_process_wrapper$.getGlobalValue(), symbol_function(process_utilities.VISIT_DEFSTRUCT_OBJECT_PROCESS_WRAPPER_METHOD));
        declare_defglobal(process_utilities.$process_wrapper_isg$);
        note_funcall_helper_function(process_utilities.CYC_SERVER_PROCESS_FUNCALL);
        note_funcall_helper_function(process_utilities.CYC_SERVER_PROCESS_FUNCALL_WITH_ARGS);
        return NIL;
    }

    static private final SubLList $list_alt73 = list(list(makeSymbol("THINKING")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym74$LOCK = makeUninternedSymbol("LOCK");

    static private final SubLString $str_alt90$Function__A_in_thread__A_terminat = makeString("Function ~A in thread ~A terminated by uncaught THROW.");

    static private final SubLList $list_alt95 = list(makeSymbol("LOCK"), makeSymbol("SEMAPHORE"), makeSymbol("DATA-QUEUE"));

    static private final SubLList $list_alt96 = list($LOCK, makeKeyword("SEMAPHORE"), makeKeyword("DATA-QUEUE"));

    static private final SubLList $list_alt97 = list(makeSymbol("IPC-QUEUE-LOCK"), makeSymbol("IPC-QUEUE-SEMAPHORE"), makeSymbol("IPC-QUEUE-DATA-QUEUE"));

    static private final SubLList $list_alt98 = list(makeSymbol("_CSETF-IPC-QUEUE-LOCK"), makeSymbol("_CSETF-IPC-QUEUE-SEMAPHORE"), makeSymbol("_CSETF-IPC-QUEUE-DATA-QUEUE"));

    static private final SubLString $str_alt108$Lock_for_Queue_ = makeString("Lock for Queue ");

    static private final SubLList $list_alt114 = list(makeSymbol("LOCK"), makeSymbol("PRODUCER-ISG"), makeSymbol("CONSUMER-ISG"), makeSymbol("PAYLOAD"));

    @Override
    public void declareFunctions() {
        process_utilities.declare_process_utilities_file();
    }

    @Override
    public void initializeVariables() {
        process_utilities.init_process_utilities_file();
    }

    static private final SubLList $list_alt115 = list($LOCK, makeKeyword("PRODUCER-ISG"), makeKeyword("CONSUMER-ISG"), makeKeyword("PAYLOAD"));

    @Override
    public void runTopLevelForms() {
        process_utilities.setup_process_utilities_file();
    }

    static private final SubLList $list_alt116 = list(makeSymbol("ORDRD-IPCQ-LOCK"), makeSymbol("ORDRD-IPCQ-PRODUCER-ISG"), makeSymbol("ORDRD-IPCQ-CONSUMER-ISG"), makeSymbol("ORDRD-IPCQ-PAYLOAD"));

    

    public static final class $task_native extends SubLStructNative {
        public SubLObject $process;

        public SubLObject $completed;

        private static final SubLStructDeclNative structDecl;

        public $task_native() {
            this.$process = Lisp.NIL;
            this.$completed = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$process;
        }

        @Override
        public SubLObject getField3() {
            return this.$completed;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$process = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$completed = value;
        }

        static {
            structDecl = makeStructDeclNative(process_utilities.$task_native.class, TASK, process_utilities.TASK_P, process_utilities.$list15, process_utilities.$list16, new String[]{ "$process", "$completed" }, process_utilities.$list17, process_utilities.$list18, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    static private final SubLList $list_alt117 = list(makeSymbol("_CSETF-ORDRD-IPCQ-LOCK"), makeSymbol("_CSETF-ORDRD-IPCQ-PRODUCER-ISG"), makeSymbol("_CSETF-ORDRD-IPCQ-CONSUMER-ISG"), makeSymbol("_CSETF-ORDRD-IPCQ-PAYLOAD"));

    public static final class $task_p$UnaryFunction extends UnaryFunction {
        public $task_p$UnaryFunction() {
            super(extractFunctionNamed("TASK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return process_utilities.task_p(arg1);
        }
    }

    // public static final class $thinking_task_native extends SubLStructNative {
    // public SubLObject $lock;
    // 
    // public SubLObject $thread;
    // 
    // public SubLObject $name;
    // 
    // public SubLObject $status;
    // 
    // public SubLObject $progress_message;
    // 
    // public SubLObject $progress_sofar;
    // 
    // public SubLObject $progress_total;
    // 
    // public SubLObject $start_time;
    // 
    // public SubLObject $finish_time;
    // 
    // public SubLObject $result;
    // 
    // public SubLObject $error_message;
    // 
    // public SubLObject $properties;
    // 
    // private static final SubLStructDeclNative structDecl;
    // 
    // public $thinking_task_native() {
    // this.$lock = Lisp.NIL;
    // this.$thread = Lisp.NIL;
    // this.$name = Lisp.NIL;
    // this.$status = Lisp.NIL;
    // this.$progress_message = Lisp.NIL;
    // this.$progress_sofar = Lisp.NIL;
    // this.$progress_total = Lisp.NIL;
    // this.$start_time = Lisp.NIL;
    // this.$finish_time = Lisp.NIL;
    // this.$result = Lisp.NIL;
    // this.$error_message = Lisp.NIL;
    // this.$properties = Lisp.NIL;
    // }
    // 
    // @Override
    // public SubLStructDecl getStructDecl() {
    // return structDecl;
    // }
    // 
    // @Override
    // public SubLObject getField2() {
    // return this.$lock;
    // }
    // 
    // @Override
    // public SubLObject getField3() {
    // return this.$thread;
    // }
    // 
    // @Override
    // public SubLObject getField4() {
    // return this.$name;
    // }
    // 
    // @Override
    // public SubLObject getField5() {
    // return this.$status;
    // }
    // 
    // @Override
    // public SubLObject getField6() {
    // return this.$progress_message;
    // }
    // 
    // @Override
    // public SubLObject getField7() {
    // return this.$progress_sofar;
    // }
    // 
    // @Override
    // public SubLObject getField8() {
    // return this.$progress_total;
    // }
    // 
    // @Override
    // public SubLObject getField9() {
    // return this.$start_time;
    // }
    // 
    // @Override
    // public SubLObject getField10() {
    // return this.$finish_time;
    // }
    // 
    // @Override
    // public SubLObject getField11() {
    // return this.$result;
    // }
    // 
    // @Override
    // public SubLObject getField12() {
    // return this.$error_message;
    // }
    // 
    // @Override
    // public SubLObject getField13() {
    // return this.$properties;
    // }
    // 
    // @Override
    // public SubLObject setField2(final SubLObject value) {
    // return this.$lock = value;
    // }
    // 
    // @Override
    // public SubLObject setField3(final SubLObject value) {
    // return this.$thread = value;
    // }
    // 
    // @Override
    // public SubLObject setField4(final SubLObject value) {
    // return this.$name = value;
    // }
    // 
    // @Override
    // public SubLObject setField5(final SubLObject value) {
    // return this.$status = value;
    // }
    // 
    // @Override
    // public SubLObject setField6(final SubLObject value) {
    // return this.$progress_message = value;
    // }
    // 
    // @Override
    // public SubLObject setField7(final SubLObject value) {
    // return this.$progress_sofar = value;
    // }
    // 
    // @Override
    // public SubLObject setField8(final SubLObject value) {
    // return this.$progress_total = value;
    // }
    // 
    // @Override
    // public SubLObject setField9(final SubLObject value) {
    // return this.$start_time = value;
    // }
    // 
    // @Override
    // public SubLObject setField10(final SubLObject value) {
    // return this.$finish_time = value;
    // }
    // 
    // @Override
    // public SubLObject setField11(final SubLObject value) {
    // return this.$result = value;
    // }
    // 
    // @Override
    // public SubLObject setField12(final SubLObject value) {
    // return this.$error_message = value;
    // }
    // 
    // @Override
    // public SubLObject setField13(final SubLObject value) {
    // return this.$properties = value;
    // }
    // 
    // static {
    // structDecl = makeStructDeclNative($thinking_task_native.class, THINKING_TASK, THINKING_TASK_P, $list41, $list42,
    // new String[] { "$lock", "$thread", "$name", "$status", "$progress_message", "$progress_sofar", "$progress_total", "$start_time", "$finish_time", "$result", "$error_message", "$properties" }, $list43, $list44, DEFAULT_STRUCT_PRINT_FUNCTION);
    // }
    // }
    @LispMethod(comment = "public static final class $thinking_task_native extends SubLStructNative {\npublic SubLObject $lock;\npublic SubLObject $thread;\npublic SubLObject $name;\npublic SubLObject $status;\npublic SubLObject $progress_message;\npublic SubLObject $progress_sofar;\npublic SubLObject $progress_total;\npublic SubLObject $start_time;\npublic SubLObject $finish_time;\npublic SubLObject $result;\npublic SubLObject $error_message;\npublic SubLObject $properties;\nprivate static final SubLStructDeclNative structDecl;\npublic $thinking_task_native() {\nthis.$lock = Lisp.NIL;\nthis.$thread = Lisp.NIL;\nthis.$name = Lisp.NIL;\nthis.$status = Lisp.NIL;\nthis.$progress_message = Lisp.NIL;\nthis.$progress_sofar = Lisp.NIL;\nthis.$progress_total = Lisp.NIL;\nthis.$start_time = Lisp.NIL;\nthis.$finish_time = Lisp.NIL;\nthis.$result = Lisp.NIL;\nthis.$error_message = Lisp.NIL;\nthis.$properties = Lisp.NIL;\n}\n@Override\npublic SubLStructDecl getStructDecl() {\nreturn structDecl;\npublic SubLObject getField2() {\nreturn this.$lock;\npublic SubLObject getField3() {\nreturn this.$thread;\npublic SubLObject getField4() {\nreturn this.$name;\npublic SubLObject getField5() {\nreturn this.$status;\npublic SubLObject getField6() {\nreturn this.$progress_message;\npublic SubLObject getField7() {\nreturn this.$progress_sofar;\npublic SubLObject getField8() {\nreturn this.$progress_total;\npublic SubLObject getField9() {\nreturn this.$start_time;\npublic SubLObject getField10() {\nreturn this.$finish_time;\npublic SubLObject getField11() {\nreturn this.$result;\npublic SubLObject getField12() {\nreturn this.$error_message;\npublic SubLObject getField13() {\nreturn this.$properties;\npublic SubLObject setField2(final SubLObject value) {\nreturn this.$lock = value;\npublic SubLObject setField3(final SubLObject value) {\nreturn this.$thread = value;\npublic SubLObject setField4(final SubLObject value) {\nreturn this.$name = value;\npublic SubLObject setField5(final SubLObject value) {\nreturn this.$status = value;\npublic SubLObject setField6(final SubLObject value) {\nreturn this.$progress_message = value;\npublic SubLObject setField7(final SubLObject value) {\nreturn this.$progress_sofar = value;\npublic SubLObject setField8(final SubLObject value) {\nreturn this.$progress_total = value;\npublic SubLObject setField9(final SubLObject value) {\nreturn this.$start_time = value;\npublic SubLObject setField10(final SubLObject value) {\nreturn this.$finish_time = value;\npublic SubLObject setField11(final SubLObject value) {\nreturn this.$result = value;\npublic SubLObject setField12(final SubLObject value) {\nreturn this.$error_message = value;\npublic SubLObject setField13(final SubLObject value) {\nreturn this.$properties = value;\nstatic structDecl = makeStructDeclNative($thinking_task_native.class, THINKING_TASK, THINKING_TASK_P, $list41, $list42,\nnew String[] { \"$lock\", \"$thread\", \"$name\", \"$status\", \"$progress_message\", \"$progress_sofar\", \"$progress_total\", \"$start_time\", \"$finish_time\", \"$result\", \"$error_message\", \"$properties\" }, $list43, $list44, DEFAULT_STRUCT_PRINT_FUNCTION);")
    public static final class $thinking_task_p$UnaryFunction extends UnaryFunction {
        public $thinking_task_p$UnaryFunction() {
            super(extractFunctionNamed("THINKING-TASK-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return process_utilities.thinking_task_p(arg1);
        }
    }

    static private final SubLString $str_alt131$Lock_for_Ordered_IPC_Queue_ = makeString("Lock for Ordered IPC Queue ");

    static private final SubLString $str_alt132$Unexpected_entry__A_in_the_payloa = makeString("Unexpected entry ~A in the payload of ordered IPC queue ~A: expected nothing or waiting process.");

    static private final SubLList $list_alt134 = list(makeSymbol("NAME"));

    static private final SubLString $str_alt135$_param_NAME__stringp____Kills_any = makeString("@param NAME; stringp\n   Kills any process having the given process name. Note\n   that kill-process is not yet supported on Win32.");

    static private final SubLList $list_alt136 = list(list(makeSymbol("NAME"), makeSymbol("STRINGP")));

    static private final SubLList $list_alt137 = list(NIL);

    static private final SubLList $list_alt148 = list(makeSymbol("ID"), makeSymbol("PROCESS"), makeSymbol("STATE"), makeSymbol("LOCK"), makeSymbol("PLIST"));

    static private final SubLList $list_alt149 = list(makeKeyword("ID"), makeKeyword("PROCESS"), makeKeyword("STATE"), $LOCK, makeKeyword("PLIST"));

    static private final SubLList $list_alt150 = list(makeSymbol("PROCESS-WRAPPER-ID"), makeSymbol("PROCESS-WRAPPER-PROCESS"), makeSymbol("PROCESS-WRAPPER-STATE"), makeSymbol("PROCESS-WRAPPER-LOCK"), makeSymbol("PROCESS-WRAPPER-PLIST"));

    static private final SubLList $list_alt151 = list(makeSymbol("_CSETF-PROCESS-WRAPPER-ID"), makeSymbol("_CSETF-PROCESS-WRAPPER-PROCESS"), makeSymbol("_CSETF-PROCESS-WRAPPER-STATE"), makeSymbol("_CSETF-PROCESS-WRAPPER-LOCK"), makeSymbol("_CSETF-PROCESS-WRAPPER-PLIST"));

    static private final SubLSymbol $sym174$_EXIT = makeSymbol("%EXIT");

    static private final SubLList $list_alt176 = cons(makeSymbol("FUNCTION"), makeSymbol("ARGS"));

    private static final SubLSymbol THINKING_TEST_CASE = makeSymbol("THINKING-TEST-CASE");

    static private final SubLList $list_alt179 = list(list(makeSymbol("THINKING"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("THINKING-EXISTS-TESTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("THINKING-BAD-ARGS-TESTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("THINKING-COMPLEX-TEST-1"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("THINKING-COMPLEX-TEST-2"), NIL, makeKeyword("PROTECTED")));

    private static final SubLSymbol THINKING = makeSymbol("THINKING");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_THINKING_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-THINKING-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_THINKING_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-THINKING-TEST-CASE-INSTANCE");

    public static final class $ipc_queue_p$UnaryFunction extends UnaryFunction {
        public $ipc_queue_p$UnaryFunction() {
            super(extractFunctionNamed("IPC-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return process_utilities.ipc_queue_p(arg1);
        }
    }

    static private final SubLString $str_alt195$process_utilities = makeString("process-utilities");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol THINKING_EXISTS_TESTS = makeSymbol("THINKING-EXISTS-TESTS");

    public static final class $ordered_ipc_queue_native extends SubLStructNative {
        public SubLObject $lock;

        public SubLObject $producer_isg;

        public SubLObject $consumer_isg;

        public SubLObject $payload;

        public SubLObject $early_consumer_semaphore;

        private static final SubLStructDeclNative structDecl;

        public $ordered_ipc_queue_native() {
            process_utilities.$ordered_ipc_queue_native.this.$lock = Lisp.NIL;
            process_utilities.$ordered_ipc_queue_native.this.$producer_isg = Lisp.NIL;
            process_utilities.$ordered_ipc_queue_native.this.$consumer_isg = Lisp.NIL;
            process_utilities.$ordered_ipc_queue_native.this.$payload = Lisp.NIL;
            process_utilities.$ordered_ipc_queue_native.this.$early_consumer_semaphore = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return process_utilities.$ordered_ipc_queue_native.this.$lock;
        }

        @Override
        public SubLObject getField3() {
            return process_utilities.$ordered_ipc_queue_native.this.$producer_isg;
        }

        @Override
        public SubLObject getField4() {
            return process_utilities.$ordered_ipc_queue_native.this.$consumer_isg;
        }

        @Override
        public SubLObject getField5() {
            return process_utilities.$ordered_ipc_queue_native.this.$payload;
        }

        @Override
        public SubLObject getField6() {
            return process_utilities.$ordered_ipc_queue_native.this.$early_consumer_semaphore;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return process_utilities.$ordered_ipc_queue_native.this.$lock = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return process_utilities.$ordered_ipc_queue_native.this.$producer_isg = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return process_utilities.$ordered_ipc_queue_native.this.$consumer_isg = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return process_utilities.$ordered_ipc_queue_native.this.$payload = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return process_utilities.$ordered_ipc_queue_native.this.$early_consumer_semaphore = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.process_utilities.$ordered_ipc_queue_native.class, process_utilities.ORDERED_IPC_QUEUE, process_utilities.ORDERED_IPC_QUEUE_P, process_utilities.$list159, process_utilities.$list160, new String[]{ "$lock", "$producer_isg", "$consumer_isg", "$payload", "$early_consumer_semaphore" }, process_utilities.$list161, process_utilities.$list162, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    private static final SubLSymbol THINKING_BAD_ARGS_TESTS = makeSymbol("THINKING-BAD-ARGS-TESTS");

    private static final SubLSymbol THINKING_COMPLEX_TEST_1 = makeSymbol("THINKING-COMPLEX-TEST-1");

    private static final SubLSymbol THINKING_COMPLEX_TEST_2 = makeSymbol("THINKING-COMPLEX-TEST-2");

    public static final class $ordered_ipc_queue_p$UnaryFunction extends UnaryFunction {
        public $ordered_ipc_queue_p$UnaryFunction() {
            super(extractFunctionNamed("ORDERED-IPC-QUEUE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return process_utilities.ordered_ipc_queue_p(arg1);
        }
    }

    public static final class $process_wrapper_p$UnaryFunction extends UnaryFunction {
        public $process_wrapper_p$UnaryFunction() {
            super(extractFunctionNamed("PROCESS-WRAPPER-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return process_utilities.process_wrapper_p(arg1);
        }
    }
}

/**
 * Total time: 748 ms synthetic
 */
