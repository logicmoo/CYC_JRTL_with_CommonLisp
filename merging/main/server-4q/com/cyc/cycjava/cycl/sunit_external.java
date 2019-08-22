/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SUNIT-EXTERNAL
 * source file: /cyc/top/cycl/sunit-external.lisp
 * created:     2019/07/03 17:37:10
 */
public final class sunit_external extends SubLTranslatedFile implements V12 {
    /**
     * helper used to translate a list of (module-name system-name) pairs into
     * a list of module structs
     */
    @LispMethod(comment = "helper used to translate a list of (module-name system-name) pairs into\r\na list of module structs\nhelper used to translate a list of (module-name system-name) pairs into\na list of module structs")
    public static final SubLObject sunit_extract_modules(SubLObject module_refs) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject cdolist_list_var = module_refs;
                SubLObject module_ref = NIL;
                for (module_ref = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_ref = cdolist_list_var.first()) {
                    {
                        SubLObject module = modules.module_lookup(module_ref.first(), second(module_ref));
                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                            if (NIL == modules.module_p(module)) {
                                Errors.error($str_alt35$_A_does_not_refer_to_a_known_modu, module_ref);
                            }
                        }
                        result = cons(module, result);
                    }
                }
                return nreverse(result);
            }
        }
    }

    public static final SubLFile me = new sunit_external();

 public static final String myName = "com.cyc.cycjava.cycl.sunit_external";


    // Definitions
    /**
     * Creates an instance of the TEST-CATEGORY class, names it with NAME, and
     * places it under each of SUPERCATEGORIES (if given).
     */
    @LispMethod(comment = "Creates an instance of the TEST-CATEGORY class, names it with NAME, and\r\nplaces it under each of SUPERCATEGORIES (if given).\nCreates an instance of the TEST-CATEGORY class, names it with NAME, and\nplaces it under each of SUPERCATEGORIES (if given).")
    public static final SubLObject define_test_category_alt(SubLObject name, SubLObject supercategories) {
        if (supercategories == UNPROVIDED) {
            supercategories = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_cat = sunit_classes.get_test_category_by_name(name);
                if (NIL != old_cat) {
                    if (NIL != sunit_classes.$sunit_verbose$.getDynamicValue(thread)) {
                        Errors.warn($str_alt0$Replacing_the_definition_of_test_, name);
                    }
                    {
                        SubLObject old_supercats = methods.funcall_instance_method_with_0_args(old_cat, GET_SUPERCATEGORIES);
                        SubLObject supercats_to_remove = set_difference(old_supercats, supercategories, UNPROVIDED, UNPROVIDED);
                        SubLObject supercats_to_add = set_difference(supercategories, old_supercats, UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = supercats_to_remove;
                            SubLObject supercat = NIL;
                            for (supercat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supercat = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_1_args(old_cat, DELETE_SUPERCATEGORY, supercat);
                                methods.funcall_instance_method_with_1_args(sunit_classes.get_test_category_by_name(supercat), DELETE_SUBCATEGORY, methods.funcall_instance_method_with_0_args(old_cat, GET_NAME));
                            }
                        }
                        {
                            SubLObject cdolist_list_var = supercats_to_add;
                            SubLObject supercat = NIL;
                            for (supercat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supercat = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_1_args(old_cat, ADD_SUPERCATEGORY, supercat);
                                methods.funcall_instance_method_with_1_args(sunit_classes.get_test_category_by_name(supercat), ADD_SUBCATEGORY, methods.funcall_instance_method_with_0_args(old_cat, GET_NAME));
                            }
                        }
                        methods.funcall_instance_method_with_1_args(old_cat, SET_ENABLED, T);
                    }
                    return old_cat;
                } else {
                    {
                        SubLObject new_cat = methods.funcall_class_method_with_2_args(TEST_CATEGORY, NEW, name, supercategories);
                        return new_cat;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Creates an instance of the TEST-CATEGORY class, names it with NAME, and\r\nplaces it under each of SUPERCATEGORIES (if given).\nCreates an instance of the TEST-CATEGORY class, names it with NAME, and\nplaces it under each of SUPERCATEGORIES (if given).")
    public static SubLObject define_test_category(final SubLObject name, SubLObject supercategories) {
        if (supercategories == UNPROVIDED) {
            supercategories = NIL;
        }
        return NIL;
    }// Definitions
    /**
     * Creates an instance of the TEST-CATEGORY class, names it with NAME, and
     * places it under each of SUPERCATEGORIES (if given).
     */


    /**
     * Change the name of the existing test category named OLD-NAME to NEW-NAME.
     */
    @LispMethod(comment = "Change the name of the existing test category named OLD-NAME to NEW-NAME.")
    public static final SubLObject rename_test_category_alt(SubLObject old_name, SubLObject new_name) {
        {
            SubLObject old_cat = sunit_classes.get_test_category_by_name(old_name);
            if (NIL != old_cat) {
                if (!old_name.equal(new_name)) {
                    Errors.warn($str_alt10$Replacing_the_old_name___A__with_, old_name, new_name);
                    {
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(old_cat, GET_SUITES);
                        SubLObject suite = NIL;
                        for (suite = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suite = cdolist_list_var.first()) {
                            {
                                SubLObject old_suite = sunit_classes.get_test_suite_by_name(suite);
                                methods.funcall_instance_method_with_1_args(old_suite, DELETE_CATEGORY, old_name);
                                methods.funcall_instance_method_with_1_args(old_cat, ADD_SUITE, suite);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(old_cat, GET_SUBCATEGORIES);
                        SubLObject subcat = NIL;
                        for (subcat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subcat = cdolist_list_var.first()) {
                            {
                                SubLObject each_subcat = sunit_classes.get_test_category_by_name(subcat);
                                methods.funcall_instance_method_with_1_args(each_subcat, DELETE_SUPERCATEGORY, old_name);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(old_cat, GET_SUPERCATEGORIES);
                        SubLObject supercat = NIL;
                        for (supercat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supercat = cdolist_list_var.first()) {
                            {
                                SubLObject each_supercat = sunit_classes.get_test_category_by_name(supercat);
                                methods.funcall_instance_method_with_1_args(each_supercat, DELETE_SUBCATEGORY, old_name);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(old_cat, GET_TEST_CASES);
                        SubLObject test_case_symbol = NIL;
                        for (test_case_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_case_symbol = cdolist_list_var.first()) {
                            {
                                SubLObject each_tc = sunit_classes.get_test_case_by_symbol(test_case_symbol);
                                methods.funcall_class_method_with_1_args(each_tc, DELETE_CATEGORY, old_name);
                                methods.funcall_instance_method_with_1_args(old_cat, ADD_TEST_CASE, test_case_symbol);
                            }
                        }
                    }
                    methods.funcall_instance_method_with_1_args(old_cat, SET_NAME, new_name);
                    {
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(old_cat, GET_SUITES);
                        SubLObject suite = NIL;
                        for (suite = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , suite = cdolist_list_var.first()) {
                            {
                                SubLObject old_suite = sunit_classes.get_test_suite_by_name(suite);
                                methods.funcall_instance_method_with_1_args(old_suite, ADD_CATEGORY, new_name);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(old_cat, GET_SUBCATEGORIES);
                        SubLObject subcat = NIL;
                        for (subcat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subcat = cdolist_list_var.first()) {
                            {
                                SubLObject each_subcat = sunit_classes.get_test_category_by_name(subcat);
                                methods.funcall_instance_method_with_1_args(each_subcat, ADD_SUPERCATEGORY, new_name);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(old_cat, GET_SUPERCATEGORIES);
                        SubLObject supercat = NIL;
                        for (supercat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , supercat = cdolist_list_var.first()) {
                            {
                                SubLObject each_supercat = sunit_classes.get_test_category_by_name(supercat);
                                methods.funcall_instance_method_with_1_args(each_supercat, ADD_SUBCATEGORY, new_name);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(old_cat, GET_TEST_CASES);
                        SubLObject test_case_symbol = NIL;
                        for (test_case_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_case_symbol = cdolist_list_var.first()) {
                            {
                                SubLObject each_tc = sunit_classes.get_test_case_by_symbol(test_case_symbol);
                                methods.funcall_class_method_with_1_args(each_tc, ADD_CATEGORY, new_name);
                            }
                        }
                    }
                    return old_cat;
                } else {
                    Errors.warn($str_alt10$Replacing_the_old_name___A__with_, old_name, new_name);
                }
            } else {
                Errors.cerror($str_alt19$Skip_test_category_rename_operati, $str_alt20$_A_is_not_the_name_of_a_known_tes, old_name);
                return old_cat;
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Change the name of the existing test category named OLD-NAME to NEW-NAME.")
    public static SubLObject rename_test_category(final SubLObject old_name, final SubLObject new_name) {
        return NIL;
    }/**
     * Change the name of the existing test category named OLD-NAME to NEW-NAME.
     */


    /**
     * Delete the test category named TEST-CATEGORY-NAME and all references to it.
     */
    @LispMethod(comment = "Delete the test category named TEST-CATEGORY-NAME and all references to it.")
    public static final SubLObject undefine_test_category_alt(SubLObject test_category_name) {
        SubLTrampolineFile.checkType(test_category_name, STRINGP);
        {
            SubLObject test_category = sunit_classes.get_test_category_by_name(test_category_name);
            if (NIL == sunit_classes.test_category_p(test_category)) {
                Errors.cerror($$$Skip_undefine_operation, $str_alt20$_A_is_not_the_name_of_a_known_tes, test_category_name);
                return NIL;
            }
            methods.funcall_instance_method_with_0_args(test_category, ISOLATE);
            return NIL;
        }
    }

    @LispMethod(comment = "Delete the test category named TEST-CATEGORY-NAME and all references to it.")
    public static SubLObject undefine_test_category(final SubLObject test_category_name) {
        assert NIL != stringp(test_category_name) : "! stringp(test_category_name) " + ("Types.stringp(test_category_name) " + "CommonSymbols.NIL != Types.stringp(test_category_name) ") + test_category_name;
        return NIL;
    }/**
     * Delete the test category named TEST-CATEGORY-NAME and all references to it.
     */


    /**
     * Define a test suite named NAME, which includes all test cases in each of CATEGORIES
     * (and recursively, each of their subcategories), as well as all test cases in each
     * of MODULES, and each of the test cases listed in TEST-CASES.  CATEGORIES is a list
     * of strings which are test-category names.  MODULES is a list of duples, each of
     * which identify a code module by its name (a string) and system name (also a string).
     * TEST-CASES is a list of test-case symbols.
     */
    @LispMethod(comment = "Define a test suite named NAME, which includes all test cases in each of CATEGORIES\r\n(and recursively, each of their subcategories), as well as all test cases in each\r\nof MODULES, and each of the test cases listed in TEST-CASES.  CATEGORIES is a list\r\nof strings which are test-category names.  MODULES is a list of duples, each of\r\nwhich identify a code module by its name (a string) and system name (also a string).\r\nTEST-CASES is a list of test-case symbols.\nDefine a test suite named NAME, which includes all test cases in each of CATEGORIES\n(and recursively, each of their subcategories), as well as all test cases in each\nof MODULES, and each of the test cases listed in TEST-CASES.  CATEGORIES is a list\nof strings which are test-category names.  MODULES is a list of duples, each of\nwhich identify a code module by its name (a string) and system name (also a string).\nTEST-CASES is a list of test-case symbols.")
    public static final SubLObject define_test_suite_alt(SubLObject name, SubLObject categories, SubLObject v_modules, SubLObject test_cases) {
        if (categories == UNPROVIDED) {
            categories = NIL;
        }
        if (v_modules == UNPROVIDED) {
            v_modules = NIL;
        }
        if (test_cases == UNPROVIDED) {
            test_cases = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject old_suite = sunit_classes.get_test_suite_by_name(name);
                SubLObject module_structs = com.cyc.cycjava.cycl.sunit_external.sunit_extract_modules(v_modules);
                if (NIL != old_suite) {
                    if (NIL != sunit_classes.$sunit_verbose$.getDynamicValue(thread)) {
                        Errors.warn($str_alt24$Replacing_the_definition_of_test_, name);
                    }
                    {
                        SubLObject old_categories = methods.funcall_instance_method_with_0_args(old_suite, GET_CATEGORIES);
                        SubLObject cats_to_remove = set_difference(old_categories, categories, UNPROVIDED, UNPROVIDED);
                        SubLObject cats_to_add = set_difference(categories, old_categories, UNPROVIDED, UNPROVIDED);
                        SubLObject old_module_structs = methods.funcall_instance_method_with_0_args(old_suite, GET_MODULES);
                        SubLObject mods_to_remove = set_difference(old_module_structs, module_structs, UNPROVIDED, UNPROVIDED);
                        SubLObject mods_to_add = set_difference(module_structs, old_module_structs, UNPROVIDED, UNPROVIDED);
                        SubLObject old_test_cases = methods.funcall_instance_method_with_0_args(old_suite, GET_TEST_CASES);
                        SubLObject tcs_to_remove = set_difference(old_test_cases, test_cases, UNPROVIDED, UNPROVIDED);
                        SubLObject tcs_to_add = set_difference(test_cases, old_test_cases, UNPROVIDED, UNPROVIDED);
                        {
                            SubLObject cdolist_list_var = cats_to_remove;
                            SubLObject cat = NIL;
                            for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_1_args(old_suite, DELETE_CATEGORY, cat);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = cats_to_add;
                            SubLObject cat = NIL;
                            for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_1_args(old_suite, ADD_CATEGORY, cat);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = mods_to_remove;
                            SubLObject mod = NIL;
                            for (mod = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mod = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_1_args(old_suite, DELETE_MODULE, mod);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = mods_to_add;
                            SubLObject mod = NIL;
                            for (mod = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , mod = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_1_args(old_suite, ADD_MODULE, mod);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = tcs_to_remove;
                            SubLObject tc = NIL;
                            for (tc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tc = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_1_args(old_suite, DELETE_TEST_CASE, tc);
                            }
                        }
                        {
                            SubLObject cdolist_list_var = tcs_to_add;
                            SubLObject tc = NIL;
                            for (tc = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , tc = cdolist_list_var.first()) {
                                methods.funcall_instance_method_with_1_args(old_suite, ADD_TEST_CASE, tc);
                            }
                        }
                    }
                    return old_suite;
                } else {
                    {
                        SubLObject new_suite = methods.funcall_class_method_with_4_args(TEST_SUITE, NEW, name, categories, module_structs, test_cases);
                        return new_suite;
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Define a test suite named NAME, which includes all test cases in each of CATEGORIES\r\n(and recursively, each of their subcategories), as well as all test cases in each\r\nof MODULES, and each of the test cases listed in TEST-CASES.  CATEGORIES is a list\r\nof strings which are test-category names.  MODULES is a list of duples, each of\r\nwhich identify a code module by its name (a string) and system name (also a string).\r\nTEST-CASES is a list of test-case symbols.\nDefine a test suite named NAME, which includes all test cases in each of CATEGORIES\n(and recursively, each of their subcategories), as well as all test cases in each\nof MODULES, and each of the test cases listed in TEST-CASES.  CATEGORIES is a list\nof strings which are test-category names.  MODULES is a list of duples, each of\nwhich identify a code module by its name (a string) and system name (also a string).\nTEST-CASES is a list of test-case symbols.")
    public static SubLObject define_test_suite(final SubLObject name, SubLObject categories, SubLObject v_modules, SubLObject test_cases) {
        if (categories == UNPROVIDED) {
            categories = NIL;
        }
        if (v_modules == UNPROVIDED) {
            v_modules = NIL;
        }
        if (test_cases == UNPROVIDED) {
            test_cases = NIL;
        }
        return NIL;
    }/**
     * Define a test suite named NAME, which includes all test cases in each of CATEGORIES
     * (and recursively, each of their subcategories), as well as all test cases in each
     * of MODULES, and each of the test cases listed in TEST-CASES.  CATEGORIES is a list
     * of strings which are test-category names.  MODULES is a list of duples, each of
     * which identify a code module by its name (a string) and system name (also a string).
     * TEST-CASES is a list of test-case symbols.
     */


    /**
     * Change the name of the existing test suite named OLD-NAME to NEW-NAME.
     */
    @LispMethod(comment = "Change the name of the existing test suite named OLD-NAME to NEW-NAME.")
    public static final SubLObject rename_test_suite_alt(SubLObject old_name, SubLObject new_name) {
        {
            SubLObject old_suite = sunit_classes.get_test_suite_by_name(old_name);
            SubLObject old_categories = methods.funcall_instance_method_with_0_args(old_suite, GET_CATEGORIES);
            SubLObject old_modules = methods.funcall_instance_method_with_0_args(old_suite, GET_MODULES);
            SubLObject old_test_cases = methods.funcall_instance_method_with_0_args(old_suite, GET_TEST_CASES);
            if (NIL != old_suite) {
                if (!old_name.equal(new_name)) {
                    Errors.warn($str_alt31$Replacing_the_old_suite_name___A_, old_name, new_name);
                    {
                        SubLObject cdolist_list_var = old_categories;
                        SubLObject category = NIL;
                        for (category = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , category = cdolist_list_var.first()) {
                            {
                                SubLObject old_cat = sunit_classes.get_test_category_by_name(category);
                                methods.funcall_instance_method_with_1_args(old_cat, DELETE_SUITE, old_name);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = old_modules;
                        SubLObject module = NIL;
                        for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                            modules.module_remove_test_suite(module, old_name);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = old_test_cases;
                        SubLObject test_case = NIL;
                        for (test_case = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_case = cdolist_list_var.first()) {
                            {
                                SubLObject old_test_case = sunit_classes.get_test_case_by_symbol(test_case);
                                methods.funcall_class_method_with_1_args(old_test_case, DELETE_SUITE, old_name);
                            }
                        }
                    }
                    methods.funcall_instance_method_with_1_args(old_suite, SET_NAME, new_name);
                    {
                        SubLObject cdolist_list_var = old_categories;
                        SubLObject category = NIL;
                        for (category = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , category = cdolist_list_var.first()) {
                            {
                                SubLObject old_cat = sunit_classes.get_test_category_by_name(category);
                                methods.funcall_instance_method_with_1_args(old_cat, ADD_SUITE, new_name);
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = old_modules;
                        SubLObject module = NIL;
                        for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                            modules.module_add_test_suite(module, new_name);
                        }
                    }
                    {
                        SubLObject cdolist_list_var = old_test_cases;
                        SubLObject test_case = NIL;
                        for (test_case = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , test_case = cdolist_list_var.first()) {
                            {
                                SubLObject old_test_case = sunit_classes.get_test_case_by_symbol(test_case);
                                methods.funcall_class_method_with_1_args(old_test_case, ADD_SUITE, new_name);
                            }
                        }
                    }
                    return old_suite;
                } else {
                    Errors.warn($str_alt31$Replacing_the_old_suite_name___A_, old_name, new_name);
                    return old_suite;
                }
            } else {
                Errors.cerror($$$Skip_test_suite_rename_operation, $str_alt34$_A_is_not_the_name_of_a_known_tes, old_name);
                return old_suite;
            }
        }
    }

    @LispMethod(comment = "Change the name of the existing test suite named OLD-NAME to NEW-NAME.")
    public static SubLObject rename_test_suite(final SubLObject old_name, final SubLObject new_name) {
        return NIL;
    }/**
     * Change the name of the existing test suite named OLD-NAME to NEW-NAME.
     */


    /**
     * Delete the test suite named TEST-SUITE-NAME and all references to it.
     */
    @LispMethod(comment = "Delete the test suite named TEST-SUITE-NAME and all references to it.")
    public static final SubLObject undefine_test_suite_alt(SubLObject test_suite_name) {
        SubLTrampolineFile.checkType(test_suite_name, STRINGP);
        {
            SubLObject test_suite = sunit_classes.get_test_suite_by_name(test_suite_name);
            if (NIL == sunit_classes.test_suite_p(test_suite)) {
                Errors.cerror($$$Skip_undefine_operation, $str_alt34$_A_is_not_the_name_of_a_known_tes, test_suite_name);
                return NIL;
            }
            methods.funcall_instance_method_with_0_args(test_suite, ISOLATE);
            return NIL;
        }
    }

    @LispMethod(comment = "Delete the test suite named TEST-SUITE-NAME and all references to it.")
    public static SubLObject undefine_test_suite(final SubLObject test_suite_name) {
        assert NIL != stringp(test_suite_name) : "! stringp(test_suite_name) " + ("Types.stringp(test_suite_name) " + "CommonSymbols.NIL != Types.stringp(test_suite_name) ") + test_suite_name;
        return NIL;
    }/**
     * Delete the test suite named TEST-SUITE-NAME and all references to it.
     */


    public static final SubLObject declare_sunit_external_file_alt() {
        declareFunction("define_test_category", "DEFINE-TEST-CATEGORY", 1, 1, false);
        declareFunction("rename_test_category", "RENAME-TEST-CATEGORY", 2, 0, false);
        declareFunction("undefine_test_category", "UNDEFINE-TEST-CATEGORY", 1, 0, false);
        declareFunction("define_test_suite", "DEFINE-TEST-SUITE", 1, 3, false);
        declareFunction("rename_test_suite", "RENAME-TEST-SUITE", 2, 0, false);
        declareFunction("undefine_test_suite", "UNDEFINE-TEST-SUITE", 1, 0, false);
        declareFunction("sunit_extract_modules", "SUNIT-EXTRACT-MODULES", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_sunit_external_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("define_test_category", "DEFINE-TEST-CATEGORY", 1, 1, false);
            declareFunction("rename_test_category", "RENAME-TEST-CATEGORY", 2, 0, false);
            declareFunction("undefine_test_category", "UNDEFINE-TEST-CATEGORY", 1, 0, false);
            declareFunction("define_test_suite", "DEFINE-TEST-SUITE", 1, 3, false);
            declareFunction("rename_test_suite", "RENAME-TEST-SUITE", 2, 0, false);
            declareFunction("undefine_test_suite", "UNDEFINE-TEST-SUITE", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("sunit_extract_modules", "SUNIT-EXTRACT-MODULES", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_sunit_external_file_Previous() {
        declareFunction("define_test_category", "DEFINE-TEST-CATEGORY", 1, 1, false);
        declareFunction("rename_test_category", "RENAME-TEST-CATEGORY", 2, 0, false);
        declareFunction("undefine_test_category", "UNDEFINE-TEST-CATEGORY", 1, 0, false);
        declareFunction("define_test_suite", "DEFINE-TEST-SUITE", 1, 3, false);
        declareFunction("rename_test_suite", "RENAME-TEST-SUITE", 2, 0, false);
        declareFunction("undefine_test_suite", "UNDEFINE-TEST-SUITE", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_sunit_external_file() {
        return NIL;
    }

    public static SubLObject setup_sunit_external_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sunit_external_file();
    }

    @Override
    public void initializeVariables() {
        init_sunit_external_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sunit_external_file();
    }

    

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Replacing_the_definition_of_test_ = makeString("Replacing the definition of test category ~a");

    private static final SubLSymbol GET_SUPERCATEGORIES = makeSymbol("GET-SUPERCATEGORIES");

    private static final SubLSymbol DELETE_SUPERCATEGORY = makeSymbol("DELETE-SUPERCATEGORY");

    private static final SubLSymbol DELETE_SUBCATEGORY = makeSymbol("DELETE-SUBCATEGORY");

    private static final SubLSymbol ADD_SUPERCATEGORY = makeSymbol("ADD-SUPERCATEGORY");

    private static final SubLSymbol ADD_SUBCATEGORY = makeSymbol("ADD-SUBCATEGORY");

    private static final SubLSymbol SET_ENABLED = makeSymbol("SET-ENABLED");

    private static final SubLSymbol TEST_CATEGORY = makeSymbol("TEST-CATEGORY");

    static private final SubLString $str_alt10$Replacing_the_old_name___A__with_ = makeString("Replacing the old name \"~A\" with new name \"~A\"");

    private static final SubLSymbol ADD_SUITE = makeSymbol("ADD-SUITE");

    private static final SubLSymbol GET_SUITES = makeSymbol("GET-SUITES");

    private static final SubLSymbol GET_SUBCATEGORIES = makeSymbol("GET-SUBCATEGORIES");

    private static final SubLSymbol ADD_TEST_CASE = makeSymbol("ADD-TEST-CASE");

    private static final SubLSymbol ADD_CATEGORY = makeSymbol("ADD-CATEGORY");

    static private final SubLString $str_alt19$Skip_test_category_rename_operati = makeString("Skip test category rename operation");

    static private final SubLString $str_alt20$_A_is_not_the_name_of_a_known_tes = makeString("~A is not the name of a known test category");

    static private final SubLString $$$Skip_undefine_operation = makeString("Skip undefine operation");

    static private final SubLString $str_alt24$Replacing_the_definition_of_test_ = makeString("Replacing the definition of test suite ~a");

    private static final SubLSymbol GET_MODULES = makeSymbol("GET-MODULES");

    private static final SubLSymbol DELETE_MODULE = makeSymbol("DELETE-MODULE");

    private static final SubLSymbol ADD_MODULE = makeSymbol("ADD-MODULE");

    private static final SubLSymbol DELETE_TEST_CASE = makeSymbol("DELETE-TEST-CASE");

    private static final SubLSymbol TEST_SUITE = makeSymbol("TEST-SUITE");

    static private final SubLString $str_alt31$Replacing_the_old_suite_name___A_ = makeString("Replacing the old suite name \"~A\" with the new suite name \"~A\"");

    private static final SubLSymbol DELETE_SUITE = makeSymbol("DELETE-SUITE");

    static private final SubLString $$$Skip_test_suite_rename_operation = makeString("Skip test suite rename operation");

    static private final SubLString $str_alt34$_A_is_not_the_name_of_a_known_tes = makeString("~A is not the name of a known test suite");

    static private final SubLString $str_alt35$_A_does_not_refer_to_a_known_modu = makeString("~A does not refer to a known module.");
}

/**
 * Total time: 24 ms
 */
