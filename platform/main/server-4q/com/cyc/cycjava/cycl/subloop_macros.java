/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_tree;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SUBLOOP-MACROS
 * source file: /cyc/top/cycl/subloop-macros.lisp
 * created:     2019/07/03 17:37:08
 */
public final class subloop_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new subloop_macros();

 public static final String myName = "com.cyc.cycjava.cycl.subloop_macros";


    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeSymbol("DEF-FORM"), makeSymbol("FUNCTION-NAME"), list(makeSymbol("METHOD-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("LAMBDA-LIST"), makeSymbol("&REST"), makeSymbol("CLASSES"));

    static private final SubLString $str1$_S_P = makeString("~S-P");

    static private final SubLString $str5$_S____S_is_not_an_instance_of__S_ = makeString("~S: ~~S is not an instance of ~S.");

    static private final SubLList $list9 = list(makeSymbol("FUNCTION-NAME"), list(makeSymbol("METHOD-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("LAMBDA-LIST"), makeSymbol("&REST"), makeSymbol("CLASSES"));

    private static final SubLSymbol DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION = makeSymbol("DEF-OPTIMIZED-INSTANCE-METHOD-FUNCTION");

    // Definitions
    public static final SubLObject def_optimized_instance_method_function_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject def_form = NIL;
            SubLObject function_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            def_form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt0);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject method_name = NIL;
                    SubLObject class_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    method_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt0);
                    class_name = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject lambda_list = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt0);
                            lambda_list = current.first();
                            current = current.rest();
                            {
                                SubLObject v_classes = current;
                                SubLObject arg_list = methods.methods_filter_option_words_from_lambda_list(lambda_list);
                                SubLObject class_conds = NIL;
                                SubLObject list_expression = v_classes;
                                if (NIL == list_expression) {
                                    class_conds = NIL;
                                } else {
                                    if (list_expression.isAtom()) {
                                        class_conds = list(list_expression);
                                    } else {
                                        if (NIL == list_expression.rest()) {
                                            {
                                                SubLObject v_class = list_expression.first();
                                                class_conds = list(copy_tree(list(list(intern(format(NIL, $str_alt1$_S_P, v_class), UNPROVIDED), class_name), list(RET, listS(INLINE_METHOD, list(method_name, v_class), class_name, append(copy_list(arg_list), NIL))))));
                                            }
                                        } else {
                                            {
                                                SubLObject tail_cons = NIL;
                                                SubLObject result = NIL;
                                                {
                                                    SubLObject v_class = list_expression.first();
                                                    class_conds = list(copy_tree(list(list(intern(format(NIL, $str_alt1$_S_P, v_class), UNPROVIDED), class_name), list(RET, listS(INLINE_METHOD, list(method_name, v_class), class_name, append(copy_list(arg_list), NIL))))));
                                                    tail_cons = class_conds;
                                                }
                                                {
                                                    SubLObject cdolist_list_var = list_expression.rest();
                                                    SubLObject v_class = NIL;
                                                    for (v_class = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_class = cdolist_list_var.first()) {
                                                        result = list(copy_tree(list(list(intern(format(NIL, $str_alt1$_S_P, v_class), UNPROVIDED), class_name), list(RET, listS(INLINE_METHOD, list(method_name, v_class), class_name, append(copy_list(arg_list), NIL))))));
                                                        rplacd(tail_cons, result);
                                                        tail_cons = result;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                return list(def_form, function_name, bq_cons(class_name, copy_tree(lambda_list)), list(MUST, list(intern(format(NIL, $str_alt1$_S_P, class_name), UNPROVIDED), class_name), format(NIL, $str_alt5$_S____S_is_not_an_instance_of__S_, function_name, class_name), class_name), bq_cons(PCOND, append(class_conds, list(list(T, list(RET, listS(FUNCALL_INSTANCE_METHOD, class_name, list(QUOTE, method_name), append(copy_list(arg_list), NIL))))))));
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt0);
                    }
                }
            }
        }
        return NIL;
    }

    // Definitions
    public static SubLObject def_optimized_instance_method_function(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject def_form = NIL;
        SubLObject function_name = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        def_form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        function_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = NIL;
        SubLObject class_name = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        method_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        class_name = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject lambda_list = NIL;
            destructuring_bind_must_consp(current, datum, $list0);
            lambda_list = current.first();
            final SubLObject v_classes;
            current = v_classes = current.rest();
            final SubLObject arg_list = methods.methods_filter_option_words_from_lambda_list(lambda_list);
            SubLObject class_conds = NIL;
            final SubLObject list_expression = v_classes;
            if (NIL == list_expression) {
                class_conds = NIL;
            } else
                if (list_expression.isAtom()) {
                    class_conds = list(list_expression);
                } else
                    if (NIL == list_expression.rest()) {
                        final SubLObject v_class = list_expression.first();
                        class_conds = list(copy_tree(list(list(intern(format(NIL, $str1$_S_P, v_class), UNPROVIDED), class_name), list(RET, listS(INLINE_METHOD, list(method_name, v_class), class_name, append(copy_list(arg_list), NIL))))));
                    } else {
                        SubLObject tail_cons = NIL;
                        SubLObject result = NIL;
                        final SubLObject v_class2 = list_expression.first();
                        class_conds = tail_cons = list(copy_tree(list(list(intern(format(NIL, $str1$_S_P, v_class2), UNPROVIDED), class_name), list(RET, listS(INLINE_METHOD, list(method_name, v_class2), class_name, append(copy_list(arg_list), NIL))))));
                        SubLObject cdolist_list_var = list_expression.rest();
                        SubLObject v_class3 = NIL;
                        v_class3 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            result = list(copy_tree(list(list(intern(format(NIL, $str1$_S_P, v_class3), UNPROVIDED), class_name), list(RET, listS(INLINE_METHOD, list(method_name, v_class3), class_name, append(copy_list(arg_list), NIL))))));
                            rplacd(tail_cons, result);
                            tail_cons = result;
                            cdolist_list_var = cdolist_list_var.rest();
                            v_class3 = cdolist_list_var.first();
                        } 
                    }


            return list(def_form, function_name, bq_cons(class_name, copy_tree(lambda_list)), list(MUST, list(intern(format(NIL, $str1$_S_P, class_name), UNPROVIDED), class_name), format(NIL, $str5$_S____S_is_not_an_instance_of__S_, function_name, class_name), class_name), bq_cons(PCOND, append(class_conds, list(list(T, list(RET, listS(FUNCALL_INSTANCE_METHOD, class_name, list(QUOTE, method_name), append(copy_list(arg_list), NIL))))))));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static final SubLObject def_optimized_instance_method_function_public_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject method_name = NIL;
                    SubLObject class_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    method_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    class_name = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject lambda_list = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt9);
                            lambda_list = current.first();
                            current = current.rest();
                            {
                                SubLObject v_classes = current;
                                return listS(DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION, DEFINE_PUBLIC, function_name, list(method_name, class_name), lambda_list, v_classes);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt9);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject def_optimized_instance_method_function_public(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_name = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        function_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = NIL;
        SubLObject class_name = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        method_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        class_name = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject lambda_list = NIL;
            destructuring_bind_must_consp(current, datum, $list9);
            lambda_list = current.first();
            final SubLObject v_classes;
            current = v_classes = current.rest();
            return listS(DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION, DEFINE_PUBLIC, function_name, list(method_name, class_name), lambda_list, v_classes);
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    public static final SubLObject def_optimized_instance_method_function_protected_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject method_name = NIL;
                    SubLObject class_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    method_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    class_name = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject lambda_list = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt9);
                            lambda_list = current.first();
                            current = current.rest();
                            {
                                SubLObject v_classes = current;
                                return listS(DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION, DEFINE_PROTECTED, function_name, list(method_name, class_name), lambda_list, v_classes);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt9);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject def_optimized_instance_method_function_protected(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_name = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        function_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = NIL;
        SubLObject class_name = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        method_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        class_name = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject lambda_list = NIL;
            destructuring_bind_must_consp(current, datum, $list9);
            lambda_list = current.first();
            final SubLObject v_classes;
            current = v_classes = current.rest();
            return listS(DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION, DEFINE_PROTECTED, function_name, list(method_name, class_name), lambda_list, v_classes);
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    public static final SubLObject def_optimized_instance_method_function_private_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject function_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt9);
            function_name = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt9);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject method_name = NIL;
                    SubLObject class_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    method_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt9);
                    class_name = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject lambda_list = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt9);
                            lambda_list = current.first();
                            current = current.rest();
                            {
                                SubLObject v_classes = current;
                                return listS(DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION, DEFINE_PRIVATE, function_name, list(method_name, class_name), lambda_list, v_classes);
                            }
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt9);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject def_optimized_instance_method_function_private(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject function_name = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        function_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = NIL;
        SubLObject class_name = NIL;
        destructuring_bind_must_consp(current, datum, $list9);
        method_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list9);
        class_name = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            SubLObject lambda_list = NIL;
            destructuring_bind_must_consp(current, datum, $list9);
            lambda_list = current.first();
            final SubLObject v_classes;
            current = v_classes = current.rest();
            return listS(DEF_OPTIMIZED_INSTANCE_METHOD_FUNCTION, DEFINE_PRIVATE, function_name, list(method_name, class_name), lambda_list, v_classes);
        }
        cdestructuring_bind_error(datum, $list9);
        return NIL;
    }

    public static SubLObject declare_subloop_macros_file() {
        declareMacro("def_optimized_instance_method_function", "DEF-OPTIMIZED-INSTANCE-METHOD-FUNCTION");
        declareMacro("def_optimized_instance_method_function_public", "DEF-OPTIMIZED-INSTANCE-METHOD-FUNCTION-PUBLIC");
        declareMacro("def_optimized_instance_method_function_protected", "DEF-OPTIMIZED-INSTANCE-METHOD-FUNCTION-PROTECTED");
        declareMacro("def_optimized_instance_method_function_private", "DEF-OPTIMIZED-INSTANCE-METHOD-FUNCTION-PRIVATE");
        return NIL;
    }

    public static SubLObject init_subloop_macros_file() {
        return NIL;
    }

    public static SubLObject setup_subloop_macros_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_subloop_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_subloop_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_subloop_macros_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeSymbol("DEF-FORM"), makeSymbol("FUNCTION-NAME"), list(makeSymbol("METHOD-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("LAMBDA-LIST"), makeSymbol("&REST"), makeSymbol("CLASSES"));

    static private final SubLString $str_alt1$_S_P = makeString("~S-P");

    static private final SubLString $str_alt5$_S____S_is_not_an_instance_of__S_ = makeString("~S: ~~S is not an instance of ~S.");

    static private final SubLList $list_alt9 = list(makeSymbol("FUNCTION-NAME"), list(makeSymbol("METHOD-NAME"), makeSymbol("CLASS-NAME")), makeSymbol("LAMBDA-LIST"), makeSymbol("&REST"), makeSymbol("CLASSES"));
}

/**
 * Total time: 103 ms
 */
