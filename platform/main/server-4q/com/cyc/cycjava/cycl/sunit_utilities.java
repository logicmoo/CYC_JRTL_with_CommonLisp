/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.load;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      SUNIT-UTILITIES
 *  source file: /cyc/top/cycl/sunit-utilities.lisp
 *  created:     2019/07/03 17:37:10
 */
public final class sunit_utilities extends SubLTranslatedFile implements V02 {
    // // Constructor
    private sunit_utilities() {
    }

    public static final SubLFile me = new sunit_utilities();


    // // Definitions
    /**
     * Run the test method denoted by TEST-METHOD-SYMBOL of the Test Case denoted
     * by TEST-CASE-SYMBOL and output the results to STREAM, if provided, or stdout
     * if NIL.
     */
    public static final SubLObject run_test_case_with_method(SubLObject test_case_symbol, SubLObject test_method_symbol, SubLObject stream, SubLObject break_on_failure) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (break_on_failure == UNPROVIDED) {
            break_on_failure = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLSystemTrampolineFile.checkType(test_method_symbol, SYMBOLP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == classes.subclassp(test_case_symbol, TEST_CASE)) {
                    Errors.error($str_alt2$_A_is_not_a_known_test_case_subcl, test_case_symbol);
                }
            }
            {
                SubLObject test_runner = methods.funcall_class_method_with_1_args(TEST_RUNNER, NEW, stream);
                SubLObject test_case_class = sunit_classes.get_test_case_by_symbol(test_case_symbol);
                SubLObject test_case_instance = methods.funcall_class_method_with_1_args(test_case_class, NEW, test_method_symbol);
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = sunit_classes.$sunit_break_on_failure$.currentBinding(thread);
                    try {
                        sunit_classes.$sunit_break_on_failure$.bind(break_on_failure, thread);
                        result = methods.funcall_instance_method_with_1_args(test_runner, RUN, test_case_instance);
                    } finally {
                        sunit_classes.$sunit_break_on_failure$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Run all the test methods of the Test Case denoted by TEST-CASE-SYMBOL
     * and output the results to STREAM, if provided, or stdout if NIL.
     */
    public static final SubLObject run_test_case_all_methods(SubLObject test_case_symbol, SubLObject stream, SubLObject break_on_failure) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (break_on_failure == UNPROVIDED) {
            break_on_failure = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == classes.subclassp(test_case_symbol, TEST_CASE)) {
                    Errors.error($str_alt2$_A_is_not_a_known_test_case_subcl, test_case_symbol);
                }
            }
            {
                SubLObject test_runner = methods.funcall_class_method_with_1_args(TEST_RUNNER, NEW, stream);
                SubLObject test_case_class = sunit_classes.get_test_case_by_symbol(test_case_symbol);
                SubLObject return_value = $SUCCESS;
                SubLObject last_return = NIL;
                {
                    SubLObject _prev_bind_0 = sunit_classes.$sunit_break_on_failure$.currentBinding(thread);
                    try {
                        sunit_classes.$sunit_break_on_failure$.bind(break_on_failure, thread);
                        {
                            SubLObject cdolist_list_var = methods.funcall_class_method_with_0_args(test_case_class, GET_TEST_METHODS);
                            SubLObject test_method_symbol = NIL;
                            for (test_method_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_method_symbol = cdolist_list_var.first()) {
                                {
                                    SubLObject test_case_instance = methods.funcall_class_method_with_1_args(test_case_class, NEW, test_method_symbol);
                                    last_return = methods.funcall_instance_method_with_1_args(test_runner, RUN, test_case_instance);
                                    if (last_return != $SUCCESS) {
                                        return_value = last_return;
                                    }
                                }
                            }
                        }
                    } finally {
                        sunit_classes.$sunit_break_on_failure$.rebind(_prev_bind_0, thread);
                    }
                }
                return return_value;
            }
        }
    }

    /**
     * Run all the test methods of all the Test Cases associated with the Test
     * Suite named TEST-SUITE-NAME, and output the results to STREAM, if provided,
     * or stdout if NIL. A Test Case is associated with a Test Suite if it a) is
     * directly recorded as belonging, b) belongs to a Test Category (or one of
     * its subcategories) that is recorded on the Test Suite, or c) concerns a
     * Module which is recorded on the Test Suite.
     */
    public static final SubLObject run_test_suite(SubLObject test_suite_name, SubLObject stream, SubLObject break_on_failure) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (break_on_failure == UNPROVIDED) {
            break_on_failure = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject test_suite = sunit_classes.get_test_suite_by_name(test_suite_name);
                SubLObject result = NIL;
                SubLSystemTrampolineFile.checkType(test_suite, TEST_SUITE_P);
                {
                    SubLObject test_runner = methods.funcall_class_method_with_1_args(TEST_RUNNER, NEW, stream);
                    {
                        SubLObject _prev_bind_0 = sunit_classes.$sunit_break_on_failure$.currentBinding(thread);
                        try {
                            sunit_classes.$sunit_break_on_failure$.bind(break_on_failure, thread);
                            result = methods.funcall_instance_method_with_1_args(test_runner, RUN, test_suite);
                        } finally {
                            sunit_classes.$sunit_break_on_failure$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return result;
            }
        }
    }

    /**
     * Run all the test methods of all the test cases in the category named CATEGORY-NAME,
     * and output the result to STREAM.
     */
    public static final SubLObject run_test_category(SubLObject category_name, SubLObject stream, SubLObject break_on_failure) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (break_on_failure == UNPROVIDED) {
            break_on_failure = NIL;
        }
        SubLSystemTrampolineFile.checkType(category_name, STRINGP);
        SubLSystemTrampolineFile.checkType(stream, OUTPUT_STREAM_P);
        {
            SubLObject return_value = $SUCCESS;
            SubLObject last_return = NIL;
            SubLObject succeeded = ZERO_INTEGER;
            SubLObject failed = ZERO_INTEGER;
            SubLObject test_category = sunit_classes.get_test_category_by_name(category_name);
            if (NIL == test_category) {
                Errors.error($str_alt11$No_test_category__a, category_name);
            }
            {
                SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(test_category, GET_ALL_TEST_CASES);
                SubLObject test_case = NIL;
                for (test_case = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_case = cdolist_list_var.first()) {
                    last_return = run_test_case_all_methods(test_case, stream, break_on_failure);
                    if (last_return == $SUCCESS) {
                        succeeded = add(succeeded, ONE_INTEGER);
                    } else {
                        return_value = last_return;
                        failed = add(failed, ONE_INTEGER);
                    }
                }
            }
            format(stream, $str_alt13$_a_test_cases_total___a_succeeded, new SubLObject[]{ add(succeeded, failed), succeeded, failed });
            return return_value;
        }
    }

    /**
     * Rebuild the code module named MODULE-NAME which is part of the system
     * named SYSTEM-NAME, in order to actually compile the functions implementing
     * setup, test, and cleanup methods for any TEST-CASE subclasses present
     * in the module.
     */
    public static final SubLObject rebuild_module_tests(SubLObject module_name, SubLObject system_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(NIL, thread);
            {
                SubLObject module = modules.module_lookup(module_name, system_name);
                if (NIL != modules.module_p(module)) {
                    {
                        SubLObject module_pathname = modules.module_get_pathname(module);
                        {
                            SubLObject _prev_bind_0 = $features$.currentBinding(thread);
                            try {
                                $features$.bind(adjoin($CYC_SUNIT, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED), thread);
                                if (module_pathname.isString() && (NIL != Filesys.probe_file(module_pathname))) {
                                    load(module_pathname);
                                }
                            } finally {
                                $features$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                } else {
                    Errors.warn($str_alt15$No_module_named__S_in__S, module_name, system_name);
                }
            }
            return NIL;
        }
    }

    /**
     * Load test file MODULE in SYSTEM with location PATHNAME
     */
    public static final SubLObject load_tests(SubLObject module_name, SubLObject system_name, SubLObject pathname) {
        SubLSystemTrampolineFile.checkType(module_name, STRINGP);
        SubLSystemTrampolineFile.checkType(system_name, STRINGP);
        SubLSystemTrampolineFile.checkType(pathname, STRINGP);
        modules.ensure_provisional_module(module_name, system_name, pathname);
        rebuild_module_tests(module_name, system_name);
        return T;
    }

    public static final SubLObject test_case_undefined_methods(SubLObject tc_symbol) {
        {
            SubLObject test_case_class = classes.classes_retrieve_class(tc_symbol);
            SubLObject test_methods = methods.funcall_class_method_with_0_args(test_case_class, GET_TEST_METHODS);
            SubLObject undefined = NIL;
            SubLObject cdolist_list_var = test_methods;
            SubLObject test_method = NIL;
            for (test_method = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_method = cdolist_list_var.first()) {
                if (NIL == classes_utilities.method_bound_p(test_case_class, test_method)) {
                    undefined = cons(test_method, undefined);
                }
            }
            return nreverse(undefined);
        }
    }

    public static final SubLObject test_case_defined_p(SubLObject tc_symbol) {
        {
            SubLObject test_case_class = classes.classes_retrieve_class(tc_symbol);
            if (NIL == subloop_structures.class_p(test_case_class)) {
                Errors.warn($str_alt16$No_known_test_case_named__A, tc_symbol);
                return NIL;
            }
        }
        return sublisp_null(test_case_undefined_methods(tc_symbol));
    }

    public static final SubLObject test_suite_undefined_test_cases(SubLObject test_suite_name) {
        {
            SubLObject test_suite = sunit_classes.get_test_suite_by_name(test_suite_name);
            if (NIL == sunit_classes.test_suite_p(test_suite)) {
                Errors.warn($str_alt17$No_known_test_suite_named__A, test_suite_name);
                return NIL;
            }
            {
                SubLObject test_cases = methods.funcall_instance_method_with_0_args(test_suite, GET_ALL_TEST_CASES);
                SubLObject undefined = NIL;
                SubLObject cdolist_list_var = test_cases;
                SubLObject test_case = NIL;
                for (test_case = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_case = cdolist_list_var.first()) {
                    if (NIL == test_case_defined_p(test_case)) {
                        undefined = cons(test_case, undefined);
                    }
                }
                return nreverse(undefined);
            }
        }
    }

    public static final SubLObject test_suite_defined_p(SubLObject test_suite_name) {
        {
            SubLObject test_suite = sunit_classes.get_test_suite_by_name(test_suite_name);
            if (NIL == sunit_classes.test_suite_p(test_suite)) {
                Errors.warn($str_alt17$No_known_test_suite_named__A, test_suite_name);
                return NIL;
            }
        }
        return sublisp_null(test_suite_undefined_test_cases(test_suite_name));
    }

    public static final SubLObject declare_sunit_utilities_file() {
        declareFunction("run_test_case_with_method", "RUN-TEST-CASE-WITH-METHOD", 2, 2, false);
        declareFunction("run_test_case_all_methods", "RUN-TEST-CASE-ALL-METHODS", 1, 2, false);
        declareFunction("run_test_suite", "RUN-TEST-SUITE", 1, 2, false);
        declareFunction("run_test_category", "RUN-TEST-CATEGORY", 1, 2, false);
        declareFunction("rebuild_module_tests", "REBUILD-MODULE-TESTS", 2, 0, false);
        declareFunction("load_tests", "LOAD-TESTS", 3, 0, false);
        declareFunction("test_case_undefined_methods", "TEST-CASE-UNDEFINED-METHODS", 1, 0, false);
        declareFunction("test_case_defined_p", "TEST-CASE-DEFINED-P", 1, 0, false);
        declareFunction("test_suite_undefined_test_cases", "TEST-SUITE-UNDEFINED-TEST-CASES", 1, 0, false);
        declareFunction("test_suite_defined_p", "TEST-SUITE-DEFINED-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_sunit_utilities_file() {
        return NIL;
    }

    public static final SubLObject setup_sunit_utilities_file() {
                return NIL;
    }





    static private final SubLString $str_alt2$_A_is_not_a_known_test_case_subcl = makeString("~A is not a known test-case subclass");

    private static final SubLSymbol TEST_RUNNER = makeSymbol("TEST-RUNNER");







    private static final SubLSymbol GET_TEST_METHODS = makeSymbol("GET-TEST-METHODS");







    static private final SubLString $str_alt11$No_test_category__a = makeString("No test category ~a");

    private static final SubLSymbol GET_ALL_TEST_CASES = makeSymbol("GET-ALL-TEST-CASES");

    static private final SubLString $str_alt13$_a_test_cases_total___a_succeeded = makeString("~a test cases total, ~a succeeded, ~a failed~%");



    static private final SubLString $str_alt15$No_module_named__S_in__S = makeString("No module named ~S in ~S");

    static private final SubLString $str_alt16$No_known_test_case_named__A = makeString("No known test case named ~A");

    static private final SubLString $str_alt17$No_known_test_suite_named__A = makeString("No known test suite named ~A");

    // // Initializers
    public void declareFunctions() {
        declare_sunit_utilities_file();
    }

    public void initializeVariables() {
        init_sunit_utilities_file();
    }

    public void runTopLevelForms() {
        setup_sunit_utilities_file();
    }
}

