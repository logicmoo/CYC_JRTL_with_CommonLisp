/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sunit_macros extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sunit_macros();



    // defparameter
    // Definitions
    @LispMethod(comment = "A list of symbols which identify test cases defined in the most recently\r\ncompiled module.  Utilities which are used to compile test cases (for\r\nexample, REBUILD-MODULE-TESTS, or certain external elisp utilities,\r\nshould clear this variable before compiling a buffer or file.\ndefparameter\nA list of symbols which identify test cases defined in the most recently\ncompiled module.  Utilities which are used to compile test cases (for\nexample, REBUILD-MODULE-TESTS, or certain external elisp utilities,\nshould clear this variable before compiling a buffer or file.")
    public static final SubLSymbol $current_module_sunit_tests$ = makeSymbol("*CURRENT-MODULE-SUNIT-TESTS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(listS(makeSymbol("METHOD-NAME"), makeSymbol("CLASS-NAME"), makeSymbol("METHOD-PROPERTIES")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $CYC_SUNIT_FULL = makeKeyword("CYC-SUNIT-FULL");

    static private final SubLString $str3$_A_is_not_the_name_of_a_known_cla = makeString("~A is not the name of a known class.");

    private static final SubLSymbol DEF_TEST_METHOD_REGISTER = makeSymbol("DEF-TEST-METHOD-REGISTER");

    private static final SubLSymbol DEF_TEST_METHOD = makeSymbol("DEF-TEST-METHOD");

    private static final SubLList $list10 = list(cons(makeSymbol("CLASS-NAME"), makeSymbol("METHOD-PROPERTIES")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DEF_TC_CONDITIONAL_METHOD = makeSymbol("DEF-TC-CONDITIONAL-METHOD");

    private static final SubLList $list14 = list(makeSymbol("TYPE"), cons(makeSymbol("CLASS-NAME"), makeSymbol("METHOD-PROPERTIES")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list15 = list(list(makeSymbol("TC-SYMBOL"), makeSymbol("MODULE-NAME"), makeSymbol("SYSTEM-NAME"), makeSymbol("&KEY"), makeSymbol("CATEGORIES")), makeSymbol("&BODY"), makeSymbol("SLOT-DECLS"));

    static private final SubLList $list16 = list(makeKeyword("CATEGORIES"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol DEFINE_TEST_CASE_INT = makeSymbol("DEFINE-TEST-CASE-INT");

    private static final SubLSymbol CYCL_TEST_CASE = makeSymbol("CYCL-TEST-CASE");

    private static final SubLList $list22 = list(makeSymbol("TYPE"), list(makeSymbol("TC-SYMBOL"), makeSymbol("MODULE-NAME"), makeSymbol("SYSTEM-NAME"), makeSymbol("&KEY"), makeSymbol("CATEGORIES")), makeSymbol("&BODY"), makeSymbol("SLOT-DECLS"));

    private static final SubLList $list25 = list(makeSymbol("*CURRENT-MODULE-SUNIT-TESTS*"));

    private static final SubLSymbol DEFINE_TEST_CASE_PREAMBLE = makeSymbol("DEFINE-TEST-CASE-PREAMBLE");

    private static final SubLSymbol DEFINE_TEST_CASE_POSTAMBLE = makeSymbol("DEFINE-TEST-CASE-POSTAMBLE");

    private static final SubLList $list29 = list(list(makeSymbol("VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $catch_error_message_target$ = makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*");

    private static final SubLList $list33 = list(QUOTE, makeSymbol("CATCH-SUNIT-ERROR-MESSAGE-HANDLER"));

    private static final SubLList $list34 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym35$HL_VARS = makeUninternedSymbol("HL-VARS");

    private static final SubLSymbol GENERATE_HL_VARIABLE_LIST = makeSymbol("GENERATE-HL-VARIABLE-LIST");

    private static final SubLSymbol TEST_WITH_HL_VARS_VAR_DECLARATIONS = makeSymbol("TEST-WITH-HL-VARS-VAR-DECLARATIONS");

    private static final SubLSymbol TEST_WITH_HL_VARS = makeSymbol("TEST-WITH-HL-VARS");

    private static final SubLString $$$VAR = makeString("VAR");

    /**
     * Define the method named METHOD-NAME for the test-case subclass named CLASS-NAME,
     * as an instance method having METHOD-PROPERTIES. The arglist signature for the
     * method is given in LAMBDA-LIST and the body in BODY.
     */
    @LispMethod(comment = "Define the method named METHOD-NAME for the test-case subclass named CLASS-NAME,\r\nas an instance method having METHOD-PROPERTIES. The arglist signature for the\r\nmethod is given in LAMBDA-LIST and the body in BODY.\nDefine the method named METHOD-NAME for the test-case subclass named CLASS-NAME,\nas an instance method having METHOD-PROPERTIES. The arglist signature for the\nmethod is given in LAMBDA-LIST and the body in BODY.")
    public static final SubLObject def_test_method_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt0);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject method_name = NIL;
                        SubLObject class_name = NIL;
                        SubLObject method_properties = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        method_name = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt0);
                        class_name = current.first();
                        current = current.rest();
                        method_properties = current;
                        current = temp;
                        {
                            SubLObject lambda_list = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt0);
                            lambda_list = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                SubLObject method_spec = cons(method_name, cons(class_name, method_properties));
                                if ((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    if (NIL == subloop_structures.class_p(classes.classes_retrieve_class(class_name))) {
                                        Errors.error($str_alt3$_A_is_not_the_name_of_a_known_cla, class_name);
                                    }
                                }
                                return bq_cons(PROGN, append((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (list(listS(PROGN, list(DEF_TEST_METHOD_REGISTER, list(QUOTE, class_name), list(QUOTE, method_name)), append(NIL != find($CYC_SUNIT, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (list(listS(DEF_INSTANCE_METHOD, method_spec, lambda_list, append(body, NIL))))) : NIL, NIL))))) : NIL, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Define the method named METHOD-NAME for the test-case subclass named CLASS-NAME,
     * as an instance method having METHOD-PROPERTIES. The arglist signature for the
     * method is given in LAMBDA-LIST and the body in BODY.
     */
    @LispMethod(comment = "Define the method named METHOD-NAME for the test-case subclass named CLASS-NAME,\r\nas an instance method having METHOD-PROPERTIES. The arglist signature for the\r\nmethod is given in LAMBDA-LIST and the body in BODY.\nDefine the method named METHOD-NAME for the test-case subclass named CLASS-NAME,\nas an instance method having METHOD-PROPERTIES. The arglist signature for the\nmethod is given in LAMBDA-LIST and the body in BODY.")
    public static SubLObject def_test_method(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject method_name = NIL;
        SubLObject class_name = NIL;
        SubLObject method_properties = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        method_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        class_name = current.first();
        current = method_properties = current.rest();
        current = temp;
        SubLObject lambda_list = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        lambda_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject method_spec = cons(method_name, cons(class_name, method_properties));
        if (((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == subloop_structures.class_p(classes.classes_retrieve_class(class_name)))) {
            Errors.error($str3$_A_is_not_the_name_of_a_known_cla, class_name);
        }
        return bq_cons(PROGN, append((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? list(listS(PROGN, list(DEF_TEST_METHOD_REGISTER, list(QUOTE, class_name), list(QUOTE, method_name)), append(NIL != find($CYC_SUNIT, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? list(listS(DEF_INSTANCE_METHOD, method_spec, lambda_list, append(body, NIL))) : NIL, NIL))) : NIL, NIL));
    }

    public static final SubLObject def_test_method_register_alt(SubLObject class_name, SubLObject method_name) {
        return instances.set_slot(class_name, TEST_METHODS, adjoin(method_name, instances.get_slot(class_name, TEST_METHODS), UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject def_test_method_register(final SubLObject class_name, final SubLObject method_name) {
        return NIL;
    }

    /**
     * Define a method named ''setup'' for the test-case subclass named CLASS-NAME, as
     * an instance method having METHOD-PROPERTIES. The arglist signature for the method
     * is given in LAMBDA-LIST and the body in BODY.
     */
    @LispMethod(comment = "Define a method named \'\'setup\'\' for the test-case subclass named CLASS-NAME, as\r\nan instance method having METHOD-PROPERTIES. The arglist signature for the method\r\nis given in LAMBDA-LIST and the body in BODY.\nDefine a method named \'\'setup\'\' for the test-case subclass named CLASS-NAME, as\nan instance method having METHOD-PROPERTIES. The arglist signature for the method\nis given in LAMBDA-LIST and the body in BODY.")
    public static final SubLObject def_setup_method_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject class_name = NIL;
                        SubLObject method_properties = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt11);
                        class_name = current.first();
                        current = current.rest();
                        method_properties = current;
                        current = temp;
                        {
                            SubLObject lambda_list = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt11);
                            lambda_list = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                if ((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    if (NIL == subloop_structures.class_p(classes.classes_retrieve_class(class_name))) {
                                        Errors.error($str_alt3$_A_is_not_the_name_of_a_known_cla, class_name);
                                    }
                                }
                                return list(PROGN, listS(DEF_TC_CONDITIONAL_METHOD, SETUP, bq_cons(class_name, method_properties), lambda_list, append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Define a method named ''setup'' for the test-case subclass named CLASS-NAME, as
     * an instance method having METHOD-PROPERTIES. The arglist signature for the method
     * is given in LAMBDA-LIST and the body in BODY.
     */
    @LispMethod(comment = "Define a method named \'\'setup\'\' for the test-case subclass named CLASS-NAME, as\r\nan instance method having METHOD-PROPERTIES. The arglist signature for the method\r\nis given in LAMBDA-LIST and the body in BODY.\nDefine a method named \'\'setup\'\' for the test-case subclass named CLASS-NAME, as\nan instance method having METHOD-PROPERTIES. The arglist signature for the method\nis given in LAMBDA-LIST and the body in BODY.")
    public static SubLObject def_setup_method(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_name = NIL;
        SubLObject method_properties = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        class_name = current.first();
        current = method_properties = current.rest();
        current = temp;
        SubLObject lambda_list = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        lambda_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == subloop_structures.class_p(classes.classes_retrieve_class(class_name)))) {
            Errors.error($str3$_A_is_not_the_name_of_a_known_cla, class_name);
        }
        return list(PROGN, listS(DEF_TC_CONDITIONAL_METHOD, SETUP, bq_cons(class_name, method_properties), lambda_list, append(body, NIL)));
    }

    /**
     * Define a method named ''cleanup'' for the test-case subclass named CLASS-NAME,
     * as an instance method having METHOD-PROPERTIES. The arglist signature for the method
     * is given in LAMBDA-LIST and the body in BODY.
     */
    @LispMethod(comment = "Define a method named \'\'cleanup\'\' for the test-case subclass named CLASS-NAME,\r\nas an instance method having METHOD-PROPERTIES. The arglist signature for the method\r\nis given in LAMBDA-LIST and the body in BODY.\nDefine a method named \'\'cleanup\'\' for the test-case subclass named CLASS-NAME,\nas an instance method having METHOD-PROPERTIES. The arglist signature for the method\nis given in LAMBDA-LIST and the body in BODY.")
    public static final SubLObject def_cleanup_method_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                destructuring_bind_must_consp(current, datum, $list_alt11);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject class_name = NIL;
                        SubLObject method_properties = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt11);
                        class_name = current.first();
                        current = current.rest();
                        method_properties = current;
                        current = temp;
                        {
                            SubLObject lambda_list = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt11);
                            lambda_list = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                if ((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                                    if (NIL == subloop_structures.class_p(classes.classes_retrieve_class(class_name))) {
                                        Errors.error($str_alt3$_A_is_not_the_name_of_a_known_cla, class_name);
                                    }
                                }
                                return list(PROGN, listS(DEF_TC_CONDITIONAL_METHOD, CLEANUP, bq_cons(class_name, method_properties), lambda_list, append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Define a method named ''cleanup'' for the test-case subclass named CLASS-NAME,
     * as an instance method having METHOD-PROPERTIES. The arglist signature for the method
     * is given in LAMBDA-LIST and the body in BODY.
     */
    @LispMethod(comment = "Define a method named \'\'cleanup\'\' for the test-case subclass named CLASS-NAME,\r\nas an instance method having METHOD-PROPERTIES. The arglist signature for the method\r\nis given in LAMBDA-LIST and the body in BODY.\nDefine a method named \'\'cleanup\'\' for the test-case subclass named CLASS-NAME,\nas an instance method having METHOD-PROPERTIES. The arglist signature for the method\nis given in LAMBDA-LIST and the body in BODY.")
    public static SubLObject def_cleanup_method(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list10);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_name = NIL;
        SubLObject method_properties = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        class_name = current.first();
        current = method_properties = current.rest();
        current = temp;
        SubLObject lambda_list = NIL;
        destructuring_bind_must_consp(current, datum, $list10);
        lambda_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        if (((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL == subloop_structures.class_p(classes.classes_retrieve_class(class_name)))) {
            Errors.error($str3$_A_is_not_the_name_of_a_known_cla, class_name);
        }
        return list(PROGN, listS(DEF_TC_CONDITIONAL_METHOD, CLEANUP, bq_cons(class_name, method_properties), lambda_list, append(body, NIL)));
    }

    public static final SubLObject def_tc_conditional_method_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject type = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt15);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt15);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject class_name = NIL;
                        SubLObject method_properties = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt15);
                        class_name = current.first();
                        current = current.rest();
                        method_properties = current;
                        current = temp;
                        {
                            SubLObject lambda_list = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt15);
                            lambda_list = current.first();
                            current = current.rest();
                            {
                                SubLObject body = current;
                                SubLObject method_spec = cons(type, cons(class_name, method_properties));
                                return bq_cons(PROGN, append(((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != find($CYC_SUNIT, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (list(listS(DEF_INSTANCE_METHOD, method_spec, lambda_list, append(body, NIL))))) : NIL, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject def_tc_conditional_method(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = NIL;
        destructuring_bind_must_consp(current, datum, $list14);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject class_name = NIL;
        SubLObject method_properties = NIL;
        destructuring_bind_must_consp(current, datum, $list14);
        class_name = current.first();
        current = method_properties = current.rest();
        current = temp;
        SubLObject lambda_list = NIL;
        destructuring_bind_must_consp(current, datum, $list14);
        lambda_list = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject method_spec = cons(type, cons(class_name, method_properties));
        return bq_cons(PROGN, append(((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) && (NIL != find($CYC_SUNIT, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? list(listS(DEF_INSTANCE_METHOD, method_spec, lambda_list, append(body, NIL))) : NIL, NIL));
    }

    /**
     * Define a test case named TC-SYMBOL as a subclass of class TEST-CASE, being a
     * test case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES
     * (if given).
     */
    @LispMethod(comment = "Define a test case named TC-SYMBOL as a subclass of class TEST-CASE, being a\r\ntest case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES\r\n(if given).\nDefine a test case named TC-SYMBOL as a subclass of class TEST-CASE, being a\ntest case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES\n(if given).")
    public static final SubLObject define_test_case_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tc_symbol = NIL;
                    SubLObject module_name = NIL;
                    SubLObject system_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    tc_symbol = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    module_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    system_name = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt16);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt16);
                            if (NIL == member(current_1, $list_alt17, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt16);
                        }
                        {
                            SubLObject categories_tail = property_list_member($CATEGORIES, current);
                            SubLObject categories = (NIL != categories_tail) ? ((SubLObject) (cadr(categories_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject slot_decls = current;
                                SubLObject arglist = (NIL != categories) ? ((SubLObject) (list(tc_symbol, module_name, system_name, $CATEGORIES, categories))) : list(tc_symbol, module_name, system_name);
                                return list(PROGN, listS(DEFINE_TEST_CASE_INT, TEST_CASE, arglist, append(slot_decls, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Define a test case named TC-SYMBOL as a subclass of class TEST-CASE, being a
     * test case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES
     * (if given).
     */
    @LispMethod(comment = "Define a test case named TC-SYMBOL as a subclass of class TEST-CASE, being a\r\ntest case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES\r\n(if given).\nDefine a test case named TC-SYMBOL as a subclass of class TEST-CASE, being a\ntest case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES\n(if given).")
    public static SubLObject define_test_case(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tc_symbol = NIL;
        SubLObject module_name = NIL;
        SubLObject system_name = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        tc_symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        module_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        system_name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list15);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list15);
            if (NIL == member(current_$1, $list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list15);
        }
        final SubLObject categories_tail = property_list_member($CATEGORIES, current);
        final SubLObject categories = (NIL != categories_tail) ? cadr(categories_tail) : NIL;
        final SubLObject slot_decls;
        current = slot_decls = temp;
        final SubLObject arglist = (NIL != categories) ? list(tc_symbol, module_name, system_name, $CATEGORIES, categories) : list(tc_symbol, module_name, system_name);
        return list(PROGN, listS(DEFINE_TEST_CASE_INT, TEST_CASE, arglist, append(slot_decls, NIL)));
    }

    /**
     * Define a test case named TC-SYMBOL as a subclass of class CYCL-TEST-CASE, being a
     * test case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES
     * (if given).
     */
    @LispMethod(comment = "Define a test case named TC-SYMBOL as a subclass of class CYCL-TEST-CASE, being a\r\ntest case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES\r\n(if given).\nDefine a test case named TC-SYMBOL as a subclass of class CYCL-TEST-CASE, being a\ntest case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES\n(if given).")
    public static final SubLObject define_cycl_test_case_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt16);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tc_symbol = NIL;
                    SubLObject module_name = NIL;
                    SubLObject system_name = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    tc_symbol = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    module_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt16);
                    system_name = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt16);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt16);
                            if (NIL == member(current_2, $list_alt17, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt16);
                        }
                        {
                            SubLObject categories_tail = property_list_member($CATEGORIES, current);
                            SubLObject categories = (NIL != categories_tail) ? ((SubLObject) (cadr(categories_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject slot_decls = current;
                                SubLObject arglist = (NIL != categories) ? ((SubLObject) (list(tc_symbol, module_name, system_name, $CATEGORIES, categories))) : list(tc_symbol, module_name, system_name);
                                return list(PROGN, listS(DEFINE_TEST_CASE_INT, CYCL_TEST_CASE, arglist, append(slot_decls, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Define a test case named TC-SYMBOL as a subclass of class CYCL-TEST-CASE, being a
     * test case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES
     * (if given).
     */
    @LispMethod(comment = "Define a test case named TC-SYMBOL as a subclass of class CYCL-TEST-CASE, being a\r\ntest case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES\r\n(if given).\nDefine a test case named TC-SYMBOL as a subclass of class CYCL-TEST-CASE, being a\ntest case covering MODULE-NAME in SYSTEM-NAME, and belonging to each of CATEGORIES\n(if given).")
    public static SubLObject define_cycl_test_case(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tc_symbol = NIL;
        SubLObject module_name = NIL;
        SubLObject system_name = NIL;
        destructuring_bind_must_consp(current, datum, $list15);
        tc_symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        module_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list15);
        system_name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$2 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list15);
            current_$2 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list15);
            if (NIL == member(current_$2, $list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$2 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list15);
        }
        final SubLObject categories_tail = property_list_member($CATEGORIES, current);
        final SubLObject categories = (NIL != categories_tail) ? cadr(categories_tail) : NIL;
        final SubLObject slot_decls;
        current = slot_decls = temp;
        final SubLObject arglist = (NIL != categories) ? list(tc_symbol, module_name, system_name, $CATEGORIES, categories) : list(tc_symbol, module_name, system_name);
        return list(PROGN, listS(DEFINE_TEST_CASE_INT, CYCL_TEST_CASE, arglist, append(slot_decls, NIL)));
    }

    /**
     * Define a test case subclassing TYPE.
     */
    @LispMethod(comment = "Define a test case subclassing TYPE.")
    public static final SubLObject define_test_case_int_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject type = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt23);
                type = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list_alt23);
                {
                    SubLObject temp = current.rest();
                    current = current.first();
                    {
                        SubLObject tc_symbol = NIL;
                        SubLObject module_name = NIL;
                        SubLObject system_name = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt23);
                        tc_symbol = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt23);
                        module_name = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt23);
                        system_name = current.first();
                        current = current.rest();
                        {
                            SubLObject allow_other_keys_p = NIL;
                            SubLObject rest = current;
                            SubLObject bad = NIL;
                            SubLObject current_3 = NIL;
                            for (; NIL != rest;) {
                                destructuring_bind_must_consp(rest, datum, $list_alt23);
                                current_3 = rest.first();
                                rest = rest.rest();
                                destructuring_bind_must_consp(rest, datum, $list_alt23);
                                if (NIL == member(current_3, $list_alt17, UNPROVIDED, UNPROVIDED)) {
                                    bad = T;
                                }
                                if (current_3 == $ALLOW_OTHER_KEYS) {
                                    allow_other_keys_p = rest.first();
                                }
                                rest = rest.rest();
                            }
                            if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                                cdestructuring_bind_error(datum, $list_alt23);
                            }
                            {
                                SubLObject categories_tail = property_list_member($CATEGORIES, current);
                                SubLObject categories = (NIL != categories_tail) ? ((SubLObject) (cadr(categories_tail))) : NIL;
                                current = temp;
                                {
                                    SubLObject slot_decls = current;
                                    SubLObject class_properties = list($EXTENDS, type);
                                    return bq_cons(PROGN, append((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? ((SubLObject) (list(list(PROGN, listS(CPUSH, list(QUOTE, tc_symbol), $list_alt26), list(DEFINE_TEST_CASE_PREAMBLE, list(QUOTE, tc_symbol)), listS(DEFINE_CLASS, bq_cons(tc_symbol, class_properties), append(slot_decls, NIL)), list(DEFINE_TEST_CASE_POSTAMBLE, list(QUOTE, tc_symbol), module_name, system_name, categories))))) : NIL, NIL));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @LispMethod(comment = "Define a test case subclassing TYPE.")
    public static SubLObject define_test_case_int(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject type = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        type = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tc_symbol = NIL;
        SubLObject module_name = NIL;
        SubLObject system_name = NIL;
        destructuring_bind_must_consp(current, datum, $list22);
        tc_symbol = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        module_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list22);
        system_name = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$3 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list22);
            current_$3 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list22);
            if (NIL == member(current_$3, $list16, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$3 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list22);
        }
        final SubLObject categories_tail = property_list_member($CATEGORIES, current);
        final SubLObject categories = (NIL != categories_tail) ? cadr(categories_tail) : NIL;
        final SubLObject slot_decls;
        current = slot_decls = temp;
        final SubLObject class_properties = list($EXTENDS, type);
        return bq_cons(PROGN, append((NIL != find($CYC_SUBLOOP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) && (NIL != find($CYC_SUNIT_FULL, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) ? list(list(PROGN, listS(CPUSH, list(QUOTE, tc_symbol), $list25), list(DEFINE_TEST_CASE_PREAMBLE, list(QUOTE, tc_symbol)), listS(DEFINE_CLASS, bq_cons(tc_symbol, class_properties), append(slot_decls, NIL)), list(DEFINE_TEST_CASE_POSTAMBLE, list(QUOTE, tc_symbol), module_name, system_name, categories))) : NIL, NIL));
    }/**
     * Define a test case subclassing TYPE.
     */


    public static final SubLObject define_test_case_preamble_alt(SubLObject tc_symbol) {
        if (NIL != subloop_structures.class_p(classes.classes_retrieve_class(tc_symbol))) {
            {
                SubLObject cdolist_list_var = methods.funcall_class_method_with_0_args(tc_symbol, GET_CATEGORIES);
                SubLObject category = NIL;
                for (category = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , category = cdolist_list_var.first()) {
                    methods.funcall_class_method_with_1_args(tc_symbol, DELETE_CATEGORY, category);
                }
            }
        }
        return NIL;
    }

    public static SubLObject define_test_case_preamble(final SubLObject tc_symbol) {
        return NIL;
    }

    public static final SubLObject define_test_case_postamble_alt(SubLObject tc_symbol, SubLObject module_name, SubLObject system_name, SubLObject categories) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject module = modules.module_lookup(module_name, system_name);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == modules.module_p(module)) {
                        Errors.error($str_alt32$Error_defining_test_case__There_i, module_name, system_name);
                    }
                }
                methods.funcall_class_method_with_0_args(tc_symbol, INITIALIZE_LOCK);
                methods.funcall_class_method_with_1_args(tc_symbol, SET_MODULE, module);
                {
                    SubLObject cdolist_list_var = categories;
                    SubLObject category = NIL;
                    for (category = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , category = cdolist_list_var.first()) {
                        methods.funcall_class_method_with_1_args(tc_symbol, ADD_CATEGORY, category);
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject define_test_case_postamble(final SubLObject tc_symbol, final SubLObject module_name, final SubLObject system_name, final SubLObject categories) {
        return NIL;
    }

    /**
     * Execute BODY as an implicit progn.  If any error occurs, and
     * SUNIT-BREAK-ON-FAILURE* is not set, the body is aborted
     * and the variable VAR is set to a string representation of the error.
     */
    @LispMethod(comment = "Execute BODY as an implicit progn.  If any error occurs, and\r\nSUNIT-BREAK-ON-FAILURE* is not set, the body is aborted\r\nand the variable VAR is set to a string representation of the error.\nExecute BODY as an implicit progn.  If any error occurs, and\nSUNIT-BREAK-ON-FAILURE* is not set, the body is aborted\nand the variable VAR is set to a string representation of the error.")
    public static final SubLObject catch_sunit_error_message_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt36);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt36);
                    var = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return list(CCATCH, $catch_error_message_target$, var, listS(WITH_ERROR_HANDLER, $list_alt40, append(body, NIL)));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt36);
                    }
                }
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Execute BODY as an implicit progn.  If any error occurs, and\r\nSUNIT-BREAK-ON-FAILURE* is not set, the body is aborted\r\nand the variable VAR is set to a string representation of the error.\nExecute BODY as an implicit progn.  If any error occurs, and\nSUNIT-BREAK-ON-FAILURE* is not set, the body is aborted\nand the variable VAR is set to a string representation of the error.")
    public static SubLObject catch_sunit_error_message(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list29);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list29);
        var = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return list(CCATCH, $catch_error_message_target$, var, listS(WITH_ERROR_HANDLER, $list33, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list29);
        return NIL;
    }/**
     * Execute BODY as an implicit progn.  If any error occurs, and
     * SUNIT-BREAK-ON-FAILURE* is not set, the body is aborted
     * and the variable VAR is set to a string representation of the error.
     */


    /**
     * Internal function for CATCH-ERROR-MESSAGE
     */
    @LispMethod(comment = "Internal function for CATCH-ERROR-MESSAGE")
    public static final SubLObject catch_sunit_error_message_handler_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != sunit_classes.$sunit_break_on_failure$.getDynamicValue(thread)) {
                return Errors.sublisp_break($str_alt41$Unexpected_error_while_running_SU, EMPTY_SUBL_OBJECT_ARRAY);
            }
            return sublisp_throw($catch_error_message_target$.getGlobalValue(), Errors.$error_message$.getDynamicValue(thread));
        }
    }

    @LispMethod(comment = "Internal function for CATCH-ERROR-MESSAGE")
    public static SubLObject catch_sunit_error_message_handler() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sublisp_throw($catch_error_message_target$.getGlobalValue(), Errors.$error_message$.getDynamicValue(thread));
    }/**
     * Internal function for CATCH-ERROR-MESSAGE
     */


    /**
     *
     *
     * @param NUM
     * 		integerp
     * 		Binds symbols var0 var1 ... varNUM to the HL variables ?var0 ?var1 .. ?varNUM.
     * 		This macro is intended to help write testing code that requires HL formulas.
     */
    @LispMethod(comment = "@param NUM\r\n\t\tintegerp\r\n\t\tBinds symbols var0 var1 ... varNUM to the HL variables ?var0 ?var1 .. ?varNUM.\r\n\t\tThis macro is intended to help write testing code that requires HL formulas.")
    public static final SubLObject test_with_hl_vars_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject num = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            num = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                SubLObject hl_vars = $sym43$HL_VARS;
                return listS(CLET, bq_cons(list(hl_vars, list(GENERATE_HL_VARIABLE_LIST, num)), append(com.cyc.cycjava.cycl.sunit_macros.test_with_hl_vars_var_declarations(num, hl_vars), NIL)), append(body, NIL));
            }
        }
    }

    /**
     *
     *
     * @param NUM
     * 		integerp
     * 		Binds symbols var0 var1 ... varNUM to the HL variables ?var0 ?var1 .. ?varNUM.
     * 		This macro is intended to help write testing code that requires HL formulas.
     */
    @LispMethod(comment = "@param NUM\r\n\t\tintegerp\r\n\t\tBinds symbols var0 var1 ... varNUM to the HL variables ?var0 ?var1 .. ?varNUM.\r\n\t\tThis macro is intended to help write testing code that requires HL formulas.")
    public static SubLObject test_with_hl_vars(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject num = NIL;
        destructuring_bind_must_consp(current, datum, $list34);
        num = current.first();
        final SubLObject body;
        current = body = current.rest();
        final SubLObject hl_vars = $sym35$HL_VARS;
        return listS(CLET, bq_cons(list(hl_vars, list(GENERATE_HL_VARIABLE_LIST, num)), append(test_with_hl_vars_var_declarations(num, hl_vars), NIL)), append(body, NIL));
    }

    public static final SubLObject test_with_hl_vars_var_declarations_alt(SubLObject highest_num, SubLObject hl_vars) {
        {
            SubLObject results = NIL;
            SubLObject x = NIL;
            for (x = ZERO_INTEGER; x.numL(highest_num); x = add(x, ONE_INTEGER)) {
                results = cons(list(intern(make_symbol(cconcatenate($$$VAR, write_to_string(x, EMPTY_SUBL_OBJECT_ARRAY))), UNPROVIDED), list(NTH, x, hl_vars)), results);
            }
            return nreverse(results);
        }
    }

    public static SubLObject test_with_hl_vars_var_declarations(final SubLObject highest_num, final SubLObject hl_vars) {
        SubLObject results = NIL;
        SubLObject x;
        for (x = NIL, x = ZERO_INTEGER; x.numL(highest_num); x = add(x, ONE_INTEGER)) {
            results = cons(list(intern(make_symbol(cconcatenate($$$VAR, write_to_string(x, EMPTY_SUBL_OBJECT_ARRAY))), UNPROVIDED), list(NTH, x, hl_vars)), results);
        }
        return nreverse(results);
    }

    public static SubLObject declare_sunit_macros_file() {
        declareMacro("def_test_method", "DEF-TEST-METHOD");
        declareFunction("def_test_method_register", "DEF-TEST-METHOD-REGISTER", 2, 0, false);
        declareMacro("def_setup_method", "DEF-SETUP-METHOD");
        declareMacro("def_cleanup_method", "DEF-CLEANUP-METHOD");
        declareMacro("def_tc_conditional_method", "DEF-TC-CONDITIONAL-METHOD");
        declareMacro("define_test_case", "DEFINE-TEST-CASE");
        declareMacro("define_cycl_test_case", "DEFINE-CYCL-TEST-CASE");
        declareMacro("define_test_case_int", "DEFINE-TEST-CASE-INT");
        declareFunction("define_test_case_preamble", "DEFINE-TEST-CASE-PREAMBLE", 1, 0, false);
        declareFunction("define_test_case_postamble", "DEFINE-TEST-CASE-POSTAMBLE", 4, 0, false);
        declareMacro("catch_sunit_error_message", "CATCH-SUNIT-ERROR-MESSAGE");
        declareFunction("catch_sunit_error_message_handler", "CATCH-SUNIT-ERROR-MESSAGE-HANDLER", 0, 0, false);
        declareMacro("test_with_hl_vars", "TEST-WITH-HL-VARS");
        declareFunction("test_with_hl_vars_var_declarations", "TEST-WITH-HL-VARS-VAR-DECLARATIONS", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sunit_macros_file() {
        defparameter("*CURRENT-MODULE-SUNIT-TESTS*", NIL);
        return NIL;
    }

    public static SubLObject setup_sunit_macros_file() {
        register_macro_helper(DEF_TEST_METHOD_REGISTER, DEF_TEST_METHOD);
        register_macro_helper(DEFINE_TEST_CASE_PREAMBLE, DEFINE_TEST_CASE_INT);
        register_macro_helper(DEFINE_TEST_CASE_POSTAMBLE, DEFINE_TEST_CASE_INT);
        register_macro_helper(TEST_WITH_HL_VARS_VAR_DECLARATIONS, TEST_WITH_HL_VARS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sunit_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_sunit_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sunit_macros_file();
    }

    static {
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(listS(makeSymbol("METHOD-NAME"), makeSymbol("CLASS-NAME"), makeSymbol("METHOD-PROPERTIES")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLString $str_alt3$_A_is_not_the_name_of_a_known_cla = makeString("~A is not the name of a known class.");

    static private final SubLList $list_alt11 = list(cons(makeSymbol("CLASS-NAME"), makeSymbol("METHOD-PROPERTIES")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt15 = list(makeSymbol("TYPE"), cons(makeSymbol("CLASS-NAME"), makeSymbol("METHOD-PROPERTIES")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt16 = list(list(makeSymbol("TC-SYMBOL"), makeSymbol("MODULE-NAME"), makeSymbol("SYSTEM-NAME"), makeSymbol("&KEY"), makeSymbol("CATEGORIES")), makeSymbol("&BODY"), makeSymbol("SLOT-DECLS"));

    static private final SubLList $list_alt17 = list(makeKeyword("CATEGORIES"));

    static private final SubLList $list_alt23 = list(makeSymbol("TYPE"), list(makeSymbol("TC-SYMBOL"), makeSymbol("MODULE-NAME"), makeSymbol("SYSTEM-NAME"), makeSymbol("&KEY"), makeSymbol("CATEGORIES")), makeSymbol("&BODY"), makeSymbol("SLOT-DECLS"));

    static private final SubLList $list_alt26 = list(makeSymbol("*CURRENT-MODULE-SUNIT-TESTS*"));

    static private final SubLString $str_alt32$Error_defining_test_case__There_i = makeString("Error defining test case: There is no module named ~S in system ~A");

    private static final SubLSymbol INITIALIZE_LOCK = makeSymbol("INITIALIZE-LOCK");

    private static final SubLSymbol SET_MODULE = makeSymbol("SET-MODULE");

    private static final SubLSymbol ADD_CATEGORY = makeSymbol("ADD-CATEGORY");

    static private final SubLList $list_alt36 = list(list(makeSymbol("VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt40 = list(QUOTE, makeSymbol("CATCH-SUNIT-ERROR-MESSAGE-HANDLER"));

    static private final SubLString $str_alt41$Unexpected_error_while_running_SU = makeString("Unexpected error while running SUnit test");

    static private final SubLList $list_alt42 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym43$HL_VARS = makeUninternedSymbol("HL-VARS");
}

/**
 * Total time: 91 ms
 */
