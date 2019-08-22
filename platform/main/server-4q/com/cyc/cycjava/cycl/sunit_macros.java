package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.sublisp_throw;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.write_to_string;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.make_symbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sunit_macros extends SubLTranslatedFile {
    public static final SubLFile me = new sunit_macros();

    public static final String myName = "com.cyc.cycjava.cycl.sunit_macros";

    public static final String myFingerPrint = "ec1afa469742b60f6a36fd6f5f7192bf84478683e6000be96c5a3d2e84c8f6c8";

    // defparameter
    public static final SubLSymbol $current_module_sunit_tests$ = makeSymbol("*CURRENT-MODULE-SUNIT-TESTS*");

    // Internal Constants
    public static final SubLList $list0 = list(listS(makeSymbol("METHOD-NAME"), makeSymbol("CLASS-NAME"), makeSymbol("METHOD-PROPERTIES")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $CYC_SUNIT_FULL = makeKeyword("CYC-SUNIT-FULL");

    public static final SubLString $str3$_A_is_not_the_name_of_a_known_cla = makeString("~A is not the name of a known class.");



    public static final SubLSymbol DEF_TEST_METHOD_REGISTER = makeSymbol("DEF-TEST-METHOD-REGISTER");







    public static final SubLSymbol DEF_TEST_METHOD = makeSymbol("DEF-TEST-METHOD");

    private static final SubLList $list10 = list(cons(makeSymbol("CLASS-NAME"), makeSymbol("METHOD-PROPERTIES")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DEF_TC_CONDITIONAL_METHOD = makeSymbol("DEF-TC-CONDITIONAL-METHOD");





    private static final SubLList $list14 = list(makeSymbol("TYPE"), cons(makeSymbol("CLASS-NAME"), makeSymbol("METHOD-PROPERTIES")), makeSymbol("LAMBDA-LIST"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list15 = list(list(makeSymbol("TC-SYMBOL"), makeSymbol("MODULE-NAME"), makeSymbol("SYSTEM-NAME"), makeSymbol("&KEY"), makeSymbol("CATEGORIES")), makeSymbol("&BODY"), makeSymbol("SLOT-DECLS"));

    public static final SubLList $list16 = list(makeKeyword("CATEGORIES"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol DEFINE_TEST_CASE_INT = makeSymbol("DEFINE-TEST-CASE-INT");



    private static final SubLSymbol CYCL_TEST_CASE = makeSymbol("CYCL-TEST-CASE");

    private static final SubLList $list22 = list(makeSymbol("TYPE"), list(makeSymbol("TC-SYMBOL"), makeSymbol("MODULE-NAME"), makeSymbol("SYSTEM-NAME"), makeSymbol("&KEY"), makeSymbol("CATEGORIES")), makeSymbol("&BODY"), makeSymbol("SLOT-DECLS"));





    private static final SubLList $list25 = list(makeSymbol("*CURRENT-MODULE-SUNIT-TESTS*"));

    private static final SubLSymbol DEFINE_TEST_CASE_PREAMBLE = makeSymbol("DEFINE-TEST-CASE-PREAMBLE");



    private static final SubLSymbol DEFINE_TEST_CASE_POSTAMBLE = makeSymbol("DEFINE-TEST-CASE-POSTAMBLE");

    private static final SubLList $list29 = list(list(makeSymbol("VAR")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $catch_error_message_target$ = makeSymbol("*CATCH-ERROR-MESSAGE-TARGET*");



    private static final SubLList $list33 = list(makeSymbol("QUOTE"), makeSymbol("CATCH-SUNIT-ERROR-MESSAGE-HANDLER"));

    private static final SubLList $list34 = list(makeSymbol("NUM"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym35$HL_VARS = makeUninternedSymbol("HL-VARS");



    private static final SubLSymbol GENERATE_HL_VARIABLE_LIST = makeSymbol("GENERATE-HL-VARIABLE-LIST");

    private static final SubLSymbol TEST_WITH_HL_VARS_VAR_DECLARATIONS = makeSymbol("TEST-WITH-HL-VARS-VAR-DECLARATIONS");

    private static final SubLSymbol TEST_WITH_HL_VARS = makeSymbol("TEST-WITH-HL-VARS");

    private static final SubLString $$$VAR = makeString("VAR");



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

    public static SubLObject def_test_method_register(final SubLObject class_name, final SubLObject method_name) {
        return NIL;
    }

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
    }

    public static SubLObject define_test_case_preamble(final SubLObject tc_symbol) {
        return NIL;
    }

    public static SubLObject define_test_case_postamble(final SubLObject tc_symbol, final SubLObject module_name, final SubLObject system_name, final SubLObject categories) {
        return NIL;
    }

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
    }

    public static SubLObject catch_sunit_error_message_handler() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sublisp_throw($catch_error_message_target$.getGlobalValue(), Errors.$error_message$.getDynamicValue(thread));
    }

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

    public static SubLObject test_with_hl_vars_var_declarations(final SubLObject highest_num, final SubLObject hl_vars) {
        SubLObject results = NIL;
        SubLObject x;
        for (x = NIL, x = ZERO_INTEGER; x.numL(highest_num); x = add(x, ONE_INTEGER)) {
            results = cons(list(intern(make_symbol(cconcatenate($$$VAR, write_to_string(x, EMPTY_SUBL_OBJECT_ARRAY))), UNPROVIDED), list(NTH, x, hl_vars)), results);
        }
        return nreverse(results);
    }

    public static SubLObject declare_sunit_macros_file() {
        declareMacro(me, "def_test_method", "DEF-TEST-METHOD");
        declareFunction(me, "def_test_method_register", "DEF-TEST-METHOD-REGISTER", 2, 0, false);
        declareMacro(me, "def_setup_method", "DEF-SETUP-METHOD");
        declareMacro(me, "def_cleanup_method", "DEF-CLEANUP-METHOD");
        declareMacro(me, "def_tc_conditional_method", "DEF-TC-CONDITIONAL-METHOD");
        declareMacro(me, "define_test_case", "DEFINE-TEST-CASE");
        declareMacro(me, "define_cycl_test_case", "DEFINE-CYCL-TEST-CASE");
        declareMacro(me, "define_test_case_int", "DEFINE-TEST-CASE-INT");
        declareFunction(me, "define_test_case_preamble", "DEFINE-TEST-CASE-PREAMBLE", 1, 0, false);
        declareFunction(me, "define_test_case_postamble", "DEFINE-TEST-CASE-POSTAMBLE", 4, 0, false);
        declareMacro(me, "catch_sunit_error_message", "CATCH-SUNIT-ERROR-MESSAGE");
        declareFunction(me, "catch_sunit_error_message_handler", "CATCH-SUNIT-ERROR-MESSAGE-HANDLER", 0, 0, false);
        declareMacro(me, "test_with_hl_vars", "TEST-WITH-HL-VARS");
        declareFunction(me, "test_with_hl_vars_var_declarations", "TEST-WITH-HL-VARS-VAR-DECLARATIONS", 2, 0, false);
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

    
}

/**
 * Total time: 91 ms
 */
