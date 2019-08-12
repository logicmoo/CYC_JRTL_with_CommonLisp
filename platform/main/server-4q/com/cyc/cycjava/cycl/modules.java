/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MODULES
 * source file: /cyc/top/cycl/modules.lisp
 * created:     2019/07/03 17:37:05
 */
public final class modules extends SubLTranslatedFile implements V12 {
    public static final class $module_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$basis;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$name;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$system;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$pathname;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$test_cases;
        }

        public SubLObject getField7() {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$test_suites;
        }

        public SubLObject getField8() {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$provisional_p;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$basis = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$name = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$system = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$pathname = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$test_cases = value;
        }

        public SubLObject setField7(SubLObject value) {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$test_suites = value;
        }

        public SubLObject setField8(SubLObject value) {
            return com.cyc.cycjava.cycl.modules.$module_native.this.$provisional_p = value;
        }

        public SubLObject $basis = Lisp.NIL;

        public SubLObject $name = Lisp.NIL;

        public SubLObject $system = Lisp.NIL;

        public SubLObject $pathname = Lisp.NIL;

        public SubLObject $test_cases = Lisp.NIL;

        public SubLObject $test_suites = Lisp.NIL;

        public SubLObject $provisional_p = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.modules.$module_native.class, MODULE, MODULE_P, $list_alt7, $list_alt8, new String[]{ "$basis", "$name", "$system", "$pathname", "$test_cases", "$test_suites", "$provisional_p" }, $list_alt9, $list_alt10, PRINT_MODULE);
    }

    public static final SubLFile me = new modules();

 public static final String myName = "com.cyc.cycjava.cycl.modules";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $module_lock$ = makeSymbol("*MODULE-LOCK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $system_lock$ = makeSymbol("*SYSTEM-LOCK*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_module$ = makeSymbol("*DTP-MODULE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_system$ = makeSymbol("*DTP-SYSTEM*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$Module_Lock = makeString("Module Lock");

    static private final SubLList $list2 = list(makeSymbol("*MODULE-LOCK*"));

    static private final SubLString $$$System_Lock = makeString("System Lock");

    static private final SubLList $list4 = list(makeSymbol("*SYSTEM-LOCK*"));

    private static final SubLSymbol MODULE_P = makeSymbol("MODULE-P");

    static private final SubLList $list7 = list(makeSymbol("BASIS"), makeSymbol("NAME"), makeSymbol("SYSTEM"), makeSymbol("PATHNAME"), makeSymbol("TEST-CASES"), makeSymbol("TEST-SUITES"), makeSymbol("PROVISIONAL-P"));

    static private final SubLList $list8 = list(makeKeyword("BASIS"), $NAME, makeKeyword("SYSTEM"), makeKeyword("PATHNAME"), makeKeyword("TEST-CASES"), makeKeyword("TEST-SUITES"), makeKeyword("PROVISIONAL-P"));

    static private final SubLList $list9 = list(makeSymbol("MODULE-BASIS"), makeSymbol("MODULE-NAME"), makeSymbol("MODULE-SYSTEM"), makeSymbol("MODULE-PATHNAME"), makeSymbol("MODULE-TEST-CASES"), makeSymbol("MODULE-TEST-SUITES"), makeSymbol("MODULE-PROVISIONAL-P"));

    static private final SubLList $list10 = list(makeSymbol("_CSETF-MODULE-BASIS"), makeSymbol("_CSETF-MODULE-NAME"), makeSymbol("_CSETF-MODULE-SYSTEM"), makeSymbol("_CSETF-MODULE-PATHNAME"), makeSymbol("_CSETF-MODULE-TEST-CASES"), makeSymbol("_CSETF-MODULE-TEST-SUITES"), makeSymbol("_CSETF-MODULE-PROVISIONAL-P"));

    private static final SubLSymbol PRINT_MODULE = makeSymbol("PRINT-MODULE");

    private static final SubLSymbol MODULE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MODULE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list13 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MODULE-P"));

    private static final SubLSymbol MODULE_BASIS = makeSymbol("MODULE-BASIS");

    private static final SubLSymbol _CSETF_MODULE_BASIS = makeSymbol("_CSETF-MODULE-BASIS");

    private static final SubLSymbol MODULE_NAME = makeSymbol("MODULE-NAME");

    private static final SubLSymbol _CSETF_MODULE_NAME = makeSymbol("_CSETF-MODULE-NAME");

    private static final SubLSymbol MODULE_SYSTEM = makeSymbol("MODULE-SYSTEM");

    private static final SubLSymbol _CSETF_MODULE_SYSTEM = makeSymbol("_CSETF-MODULE-SYSTEM");

    private static final SubLSymbol MODULE_PATHNAME = makeSymbol("MODULE-PATHNAME");

    private static final SubLSymbol _CSETF_MODULE_PATHNAME = makeSymbol("_CSETF-MODULE-PATHNAME");

    private static final SubLSymbol MODULE_TEST_CASES = makeSymbol("MODULE-TEST-CASES");

    private static final SubLSymbol _CSETF_MODULE_TEST_CASES = makeSymbol("_CSETF-MODULE-TEST-CASES");

    private static final SubLSymbol MODULE_TEST_SUITES = makeSymbol("MODULE-TEST-SUITES");

    private static final SubLSymbol _CSETF_MODULE_TEST_SUITES = makeSymbol("_CSETF-MODULE-TEST-SUITES");

    private static final SubLSymbol MODULE_PROVISIONAL_P = makeSymbol("MODULE-PROVISIONAL-P");

    private static final SubLSymbol _CSETF_MODULE_PROVISIONAL_P = makeSymbol("_CSETF-MODULE-PROVISIONAL-P");

    private static final SubLString $str35$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_MODULE = makeSymbol("MAKE-MODULE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_MODULE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MODULE-METHOD");

    private static final SubLString $str41$_S_in__S = makeString("~S in ~S");

    private static final SubLSymbol SXHASH_MODULE_METHOD = makeSymbol("SXHASH-MODULE-METHOD");

    private static final SubLSymbol $module_index$ = makeSymbol("*MODULE-INDEX*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLList $list46 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("SYSTEM"), list(makeSymbol("MESSAGE"), makeString("mapping modules"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list47 = list(makeKeyword("SYSTEM"), makeKeyword("MESSAGE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLString $$$mapping_modules = makeString("mapping modules");

    private static final SubLSymbol $sym51$MODULE_REF = makeUninternedSymbol("MODULE-REF");

    private static final SubLSymbol $sym52$MODULE_NAME = makeUninternedSymbol("MODULE-NAME");

    private static final SubLSymbol $sym53$SYSTEM_NAME = makeUninternedSymbol("SYSTEM-NAME");

    private static final SubLSymbol SYSTEM_P = makeSymbol("SYSTEM-P");

    private static final SubLSymbol SYSTEM_LOOKUP = makeSymbol("SYSTEM-LOOKUP");

    private static final SubLString $str60$_A_is_not_a_known_system_name_ = makeString("~A is not a known system name.");

    private static final SubLSymbol PROGRESS_CDOHASH = makeSymbol("PROGRESS-CDOHASH");

    private static final SubLList $list62 = list(makeSymbol("MODULE-GET-INDEX"));

    private static final SubLSymbol MODULE_GET_INDEX = makeSymbol("MODULE-GET-INDEX");

    private static final SubLSymbol DO_MODULES = makeSymbol("DO-MODULES");

    private static final SubLString $str70$_A_is_not_the_name_of_a_known_sys = makeString("~A is not the name of a known system.");

    static private final SubLList $list73 = list(makeSymbol("BASIS"), makeSymbol("NAME"), makeSymbol("DEFAULT-PATHNAME"), makeSymbol("MODULES"), makeSymbol("PROVISIONAL-P"));

    private static final SubLList $list74 = list(makeKeyword("BASIS"), $NAME, makeKeyword("DEFAULT-PATHNAME"), makeKeyword("MODULES"), makeKeyword("PROVISIONAL-P"));

    private static final SubLList $list75 = list(makeSymbol("SYSTEM-BASIS"), makeSymbol("SYSTEM-NAME"), makeSymbol("SYSTEM-DEFAULT-PATHNAME"), makeSymbol("SYSTEM-MODULES"), makeSymbol("SYSTEM-PROVISIONAL-P"));

    private static final SubLList $list76 = list(makeSymbol("_CSETF-SYSTEM-BASIS"), makeSymbol("_CSETF-SYSTEM-NAME"), makeSymbol("_CSETF-SYSTEM-DEFAULT-PATHNAME"), makeSymbol("_CSETF-SYSTEM-MODULES"), makeSymbol("_CSETF-SYSTEM-PROVISIONAL-P"));

    private static final SubLSymbol PRINT_SYSTEM = makeSymbol("PRINT-SYSTEM");

    private static final SubLSymbol SYSTEM_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SYSTEM-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list79 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SYSTEM-P"));

    private static final SubLSymbol SYSTEM_BASIS = makeSymbol("SYSTEM-BASIS");

    private static final SubLSymbol _CSETF_SYSTEM_BASIS = makeSymbol("_CSETF-SYSTEM-BASIS");

    private static final SubLSymbol SYSTEM_NAME = makeSymbol("SYSTEM-NAME");

    private static final SubLSymbol _CSETF_SYSTEM_NAME = makeSymbol("_CSETF-SYSTEM-NAME");

    private static final SubLSymbol SYSTEM_DEFAULT_PATHNAME = makeSymbol("SYSTEM-DEFAULT-PATHNAME");

    private static final SubLSymbol _CSETF_SYSTEM_DEFAULT_PATHNAME = makeSymbol("_CSETF-SYSTEM-DEFAULT-PATHNAME");

    private static final SubLSymbol SYSTEM_MODULES = makeSymbol("SYSTEM-MODULES");

    private static final SubLSymbol _CSETF_SYSTEM_MODULES = makeSymbol("_CSETF-SYSTEM-MODULES");

    private static final SubLSymbol SYSTEM_PROVISIONAL_P = makeSymbol("SYSTEM-PROVISIONAL-P");

    private static final SubLSymbol _CSETF_SYSTEM_PROVISIONAL_P = makeSymbol("_CSETF-SYSTEM-PROVISIONAL-P");

    private static final SubLSymbol MAKE_SYSTEM = makeSymbol("MAKE-SYSTEM");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SYSTEM_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SYSTEM-METHOD");

    private static final SubLString $str94$System__S = makeString("System ~S");

    private static final SubLSymbol SXHASH_SYSTEM_METHOD = makeSymbol("SXHASH-SYSTEM-METHOD");

    private static final SubLSymbol $system_index$ = makeSymbol("*SYSTEM-INDEX*");

    private static final SubLSymbol SYSTEM_GET_NAME = makeSymbol("SYSTEM-GET-NAME");

    private static final SubLString $str98$_A_is_already_the_name_of_a_known = makeString("~A is already the name of a known system.");

    private static final SubLList $list99 = list(makeSymbol("SYSTEM-NAME"));

    private static final SubLList $list101 = list(makeSymbol("PROGN"));

    private static final SubLList $list102 = list(makeSymbol("CREATE-SYSTEM"), makeString("cycl"));

    private static final SubLSymbol CREATE_MODULE = makeSymbol("CREATE-MODULE");

    public static final SubLObject with_module_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt2, append(body, NIL));
        }
    }

    public static SubLObject with_module_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list2, append(body, NIL));
    }

    public static final SubLObject with_system_lock_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject body = current;
            return listS(WITH_LOCK_HELD, $list_alt4, append(body, NIL));
        }
    }

    public static SubLObject with_system_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_LOCK_HELD, $list4, append(body, NIL));
    }

    public static final SubLObject module_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject module_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_module(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject module_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.modules.$module_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject module_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.modules.$module_native.class ? T : NIL;
    }

    public static final SubLObject module_basis_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.getField2();
    }

    public static SubLObject module_basis(final SubLObject v_object) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject module_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.getField3();
    }

    public static SubLObject module_name(final SubLObject v_object) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject module_system_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.getField4();
    }

    public static SubLObject module_system(final SubLObject v_object) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject module_pathname_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.getField5();
    }

    public static SubLObject module_pathname(final SubLObject v_object) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject module_test_cases_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.getField6();
    }

    public static SubLObject module_test_cases(final SubLObject v_object) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject module_test_suites_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.getField7();
    }

    public static SubLObject module_test_suites(final SubLObject v_object) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject module_provisional_p_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.getField8();
    }

    public static SubLObject module_provisional_p(final SubLObject v_object) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.getField8();
    }

    public static final SubLObject _csetf_module_basis_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_module_basis(final SubLObject v_object, final SubLObject value) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_module_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_module_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_module_system_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_module_system(final SubLObject v_object, final SubLObject value) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_module_pathname_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_module_pathname(final SubLObject v_object, final SubLObject value) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_module_test_cases_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_module_test_cases(final SubLObject v_object, final SubLObject value) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_module_test_suites_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_module_test_suites(final SubLObject v_object, final SubLObject value) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject _csetf_module_provisional_p_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MODULE_P);
        return v_object.setField8(value);
    }

    public static SubLObject _csetf_module_provisional_p(final SubLObject v_object, final SubLObject value) {
        assert NIL != module_p(v_object) : "! modules.module_p(v_object) " + "modules.module_p error :" + v_object;
        return v_object.setField8(value);
    }

    public static final SubLObject make_module_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.modules.$module_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($BASIS)) {
                        _csetf_module_basis(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NAME)) {
                            _csetf_module_name(v_new, current_value);
                        } else {
                            if (pcase_var.eql($SYSTEM)) {
                                _csetf_module_system(v_new, current_value);
                            } else {
                                if (pcase_var.eql($PATHNAME)) {
                                    _csetf_module_pathname(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($TEST_CASES)) {
                                        _csetf_module_test_cases(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($TEST_SUITES)) {
                                            _csetf_module_test_suites(v_new, current_value);
                                        } else {
                                            if (pcase_var.eql($PROVISIONAL_P)) {
                                                _csetf_module_provisional_p(v_new, current_value);
                                            } else {
                                                Errors.error($str_alt34$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_module(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.modules.$module_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($BASIS)) {
                _csetf_module_basis(v_new, current_value);
            } else
                if (pcase_var.eql($NAME)) {
                    _csetf_module_name(v_new, current_value);
                } else
                    if (pcase_var.eql($SYSTEM)) {
                        _csetf_module_system(v_new, current_value);
                    } else
                        if (pcase_var.eql($PATHNAME)) {
                            _csetf_module_pathname(v_new, current_value);
                        } else
                            if (pcase_var.eql($TEST_CASES)) {
                                _csetf_module_test_cases(v_new, current_value);
                            } else
                                if (pcase_var.eql($TEST_SUITES)) {
                                    _csetf_module_test_suites(v_new, current_value);
                                } else
                                    if (pcase_var.eql($PROVISIONAL_P)) {
                                        _csetf_module_provisional_p(v_new, current_value);
                                    } else {
                                        Errors.error($str35$Invalid_slot__S_for_construction_, current_arg);
                                    }






        }
        return v_new;
    }

    public static SubLObject visit_defstruct_module(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_MODULE, SEVEN_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $BASIS, module_basis(obj));
        funcall(visitor_fn, obj, $SLOT, $NAME, module_name(obj));
        funcall(visitor_fn, obj, $SLOT, $SYSTEM, module_system(obj));
        funcall(visitor_fn, obj, $SLOT, $PATHNAME, module_pathname(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST_CASES, module_test_cases(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST_SUITES, module_test_suites(obj));
        funcall(visitor_fn, obj, $SLOT, $PROVISIONAL_P, module_provisional_p(obj));
        funcall(visitor_fn, obj, $END, MAKE_MODULE, SEVEN_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_module_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_module(obj, visitor_fn);
    }

    public static final SubLObject print_module_alt(SubLObject module, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject module_name = module_get_name(module);
                SubLObject system_name = module_get_system(module);
                if (NIL != $print_readably$.getDynamicValue(thread)) {
                    print_not_readable(module, stream);
                } else {
                    {
                        SubLObject v_object = module;
                        SubLObject stream_1 = stream;
                        write_string($str_alt35$__, stream_1, UNPROVIDED, UNPROVIDED);
                        write(type_of(v_object), new SubLObject[]{ $STREAM, stream_1 });
                        write_char(CHAR_space, stream_1);
                        format(stream, $str_alt37$_S_in__S, module_name, system_name);
                        write_char(CHAR_greater, stream_1);
                    }
                }
            }
            return module;
        }
    }

    public static SubLObject print_module(final SubLObject module, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject module_name = module_get_name(module);
        final SubLObject system_name = module_get_system(module);
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(module, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, module, T, T);
            format(stream, $str41$_S_in__S, module_name, system_name);
            print_macros.print_unreadable_object_postamble(stream, module, NIL, NIL);
        }
        return module;
    }

    public static final SubLObject sxhash_module_method_alt(SubLObject v_object) {
        return logxor(Sxhash.sxhash(module_get_name(v_object)), Sxhash.sxhash(module_get_system(v_object)));
    }

    public static SubLObject sxhash_module_method(final SubLObject v_object) {
        return logxor(Sxhash.sxhash(module_get_name(v_object)), Sxhash.sxhash(module_get_system(v_object)));
    }

    public static final SubLObject module_store_alt(SubLObject module) {
        {
            SubLObject entry = list(module_get_name(module), module_get_system(module));
            SubLObject v_answer = NIL;
            SubLObject lock = $module_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                v_answer = sethash(entry, $module_index$.getGlobalValue(), module);
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return v_answer;
        }
    }

    public static SubLObject module_store(final SubLObject module) {
        final SubLObject entry = list(module_get_name(module), module_get_system(module));
        SubLObject v_answer = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($module_lock$.getGlobalValue());
            v_answer = sethash(entry, $module_index$.getGlobalValue(), module);
        } finally {
            if (NIL != release) {
                release_lock($module_lock$.getGlobalValue());
            }
        }
        return v_answer;
    }

    public static final SubLObject module_remove_alt(SubLObject module) {
        {
            SubLObject entry = list(module_get_name(module), module_get_system(module));
            SubLObject v_answer = NIL;
            SubLObject lock = $module_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                v_answer = remhash(entry, $module_index$.getGlobalValue());
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return v_answer;
        }
    }

    public static SubLObject module_remove(final SubLObject module) {
        final SubLObject entry = list(module_get_name(module), module_get_system(module));
        SubLObject v_answer = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($module_lock$.getGlobalValue());
            v_answer = remhash(entry, $module_index$.getGlobalValue());
        } finally {
            if (NIL != release) {
                release_lock($module_lock$.getGlobalValue());
            }
        }
        return v_answer;
    }

    public static final SubLObject module_lookup_alt(SubLObject module_name, SubLObject system_name) {
        SubLTrampolineFile.checkType(module_name, STRINGP);
        SubLTrampolineFile.checkType(system_name, STRINGP);
        {
            SubLObject entry = list(module_name, system_name);
            SubLObject module = gethash(entry, $module_index$.getGlobalValue(), UNPROVIDED);
            return module;
        }
    }

    public static SubLObject module_lookup(final SubLObject module_name, final SubLObject system_name) {
        assert NIL != stringp(module_name) : "! stringp(module_name) " + ("Types.stringp(module_name) " + "CommonSymbols.NIL != Types.stringp(module_name) ") + module_name;
        assert NIL != stringp(system_name) : "! stringp(system_name) " + ("Types.stringp(system_name) " + "CommonSymbols.NIL != Types.stringp(system_name) ") + system_name;
        final SubLObject entry = list(module_name, system_name);
        final SubLObject module = gethash(entry, $module_index$.getGlobalValue(), UNPROVIDED);
        return module;
    }

    /**
     * returns all modules in all systems.
     */
    @LispMethod(comment = "returns all modules in all systems.")
    public static final SubLObject all_modules_alt() {
        return hash_table_utilities.hash_table_values($module_index$.getGlobalValue());
    }

    /**
     * returns all modules in all systems.
     */
    @LispMethod(comment = "returns all modules in all systems.")
    public static SubLObject all_modules() {
        return hash_table_utilities.hash_table_values($module_index$.getGlobalValue());
    }

    /**
     * Iterate over all modules, executing BODY within the scope of VAR.
     * VAR is bound to each module.
     * If SYSTEM is provided, only execute BODY if a module is in SYSTEM.
     */
    @LispMethod(comment = "Iterate over all modules, executing BODY within the scope of VAR.\r\nVAR is bound to each module.\r\nIf SYSTEM is provided, only execute BODY if a module is in SYSTEM.\nIterate over all modules, executing BODY within the scope of VAR.\nVAR is bound to each module.\nIf SYSTEM is provided, only execute BODY if a module is in SYSTEM.")
    public static final SubLObject do_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt43);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt43);
                    var = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt43);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt43);
                            if (NIL == member(current_2, $list_alt44, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt43);
                        }
                        {
                            SubLObject system_tail = property_list_member($SYSTEM, current);
                            SubLObject system = (NIL != system_tail) ? ((SubLObject) (cadr(system_tail))) : NIL;
                            SubLObject message_tail = property_list_member($MESSAGE, current);
                            SubLObject message = (NIL != message_tail) ? ((SubLObject) (cadr(message_tail))) : $$$mapping_modules;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject module_ref = $sym48$MODULE_REF;
                                SubLObject module_name = $sym49$MODULE_NAME;
                                SubLObject system_name = $sym50$SYSTEM_NAME;
                                return list(PROGN, list(PWHEN, list(STRINGP, system), list(PUNLESS, list(SYSTEM_P, list(SYSTEM_LOOKUP, system)), list(ERROR, $str_alt57$_A_is_not_a_known_system_name_, system))), list(PROGRESS_CDOHASH, list(module_ref, var, $list_alt59, message), list(CDESTRUCTURING_BIND, list(module_name, system_name), module_ref, list(IGNORE, module_name), listS(PWHEN, list(COR, list(NULL, system), list(CAND, system, list(EQUAL, system_name, system))), append(body, NIL)))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over all modules, executing BODY within the scope of VAR.
     * VAR is bound to each module.
     * If SYSTEM is provided, only execute BODY if a module is in SYSTEM.
     */
    @LispMethod(comment = "Iterate over all modules, executing BODY within the scope of VAR.\r\nVAR is bound to each module.\r\nIf SYSTEM is provided, only execute BODY if a module is in SYSTEM.\nIterate over all modules, executing BODY within the scope of VAR.\nVAR is bound to each module.\nIf SYSTEM is provided, only execute BODY if a module is in SYSTEM.")
    public static SubLObject do_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        destructuring_bind_must_consp(current, datum, $list46);
        var = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list46);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list46);
            if (NIL == member(current_$1, $list47, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list46);
        }
        final SubLObject system_tail = property_list_member($SYSTEM, current);
        final SubLObject system = (NIL != system_tail) ? cadr(system_tail) : NIL;
        final SubLObject message_tail = property_list_member($MESSAGE, current);
        final SubLObject message = (NIL != message_tail) ? cadr(message_tail) : $$$mapping_modules;
        final SubLObject body;
        current = body = temp;
        final SubLObject module_ref = $sym51$MODULE_REF;
        final SubLObject module_name = $sym52$MODULE_NAME;
        final SubLObject system_name = $sym53$SYSTEM_NAME;
        return list(PROGN, list(PWHEN, list(STRINGP, system), list(PUNLESS, list(SYSTEM_P, list(SYSTEM_LOOKUP, system)), list(ERROR, $str60$_A_is_not_a_known_system_name_, system))), list(PROGRESS_CDOHASH, list(module_ref, var, $list62, message), list(CDESTRUCTURING_BIND, list(module_name, system_name), module_ref, list(IGNORE, module_name), listS(PWHEN, list(COR, list(NULL, system), list(CAND, system, list(EQUAL, system_name, system))), append(body, NIL)))));
    }

    public static final SubLObject module_get_index_alt() {
        return $module_index$.getGlobalValue();
    }

    public static SubLObject module_get_index() {
        return $module_index$.getGlobalValue();
    }

    public static final SubLObject module_new_alt(SubLObject name, SubLObject system_name, SubLObject provisional_p, SubLObject pathname) {
        if (provisional_p == UNPROVIDED) {
            provisional_p = NIL;
        }
        if (pathname == UNPROVIDED) {
            pathname = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(name, STRINGP);
            SubLTrampolineFile.checkType(system_name, STRINGP);
            {
                SubLObject system = system_lookup(system_name);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == system_p(system)) {
                        Errors.error($str_alt67$_A_is_not_the_name_of_a_known_sys, system_name);
                    }
                }
                name = Strings.string_downcase(name, UNPROVIDED, UNPROVIDED);
                system_name = Strings.string_downcase(system_name, UNPROVIDED, UNPROVIDED);
                {
                    SubLObject v_new = make_module(UNPROVIDED);
                    _csetf_module_name(v_new, name);
                    _csetf_module_system(v_new, system_name);
                    module_store(v_new);
                    system_add_module(system, v_new);
                    return v_new;
                }
            }
        }
    }

    public static SubLObject module_new(SubLObject name, SubLObject system_name, SubLObject provisional_p, SubLObject pathname) {
        if (provisional_p == UNPROVIDED) {
            provisional_p = NIL;
        }
        if (pathname == UNPROVIDED) {
            pathname = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(name) : "! stringp(name) " + ("Types.stringp(name) " + "CommonSymbols.NIL != Types.stringp(name) ") + name;
        assert NIL != stringp(system_name) : "! stringp(system_name) " + ("Types.stringp(system_name) " + "CommonSymbols.NIL != Types.stringp(system_name) ") + system_name;
        final SubLObject system = system_lookup(system_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == system_p(system))) {
            Errors.error($str70$_A_is_not_the_name_of_a_known_sys, system_name);
        }
        name = Strings.string_downcase(name, UNPROVIDED, UNPROVIDED);
        system_name = Strings.string_downcase(system_name, UNPROVIDED, UNPROVIDED);
        final SubLObject v_new = make_module(UNPROVIDED);
        _csetf_module_name(v_new, name);
        _csetf_module_system(v_new, system_name);
        module_store(v_new);
        system_add_module(system, v_new);
        return v_new;
    }

    /**
     * Ensures existence of a module structure, representing the specified code
     * module named MODULE-NAME, in system SYSTEM-NAME, to be found at PATHNAME,
     * that is not part of a declared system.  If the module structure already
     * exists, it is simply returned.  If the module structure does not already
     * exist, it is created and then returned.
     */
    @LispMethod(comment = "Ensures existence of a module structure, representing the specified code\r\nmodule named MODULE-NAME, in system SYSTEM-NAME, to be found at PATHNAME,\r\nthat is not part of a declared system.  If the module structure already\r\nexists, it is simply returned.  If the module structure does not already\r\nexist, it is created and then returned.\nEnsures existence of a module structure, representing the specified code\nmodule named MODULE-NAME, in system SYSTEM-NAME, to be found at PATHNAME,\nthat is not part of a declared system.  If the module structure already\nexists, it is simply returned.  If the module structure does not already\nexist, it is created and then returned.")
    public static final SubLObject ensure_provisional_module_alt(SubLObject module_name, SubLObject system_name, SubLObject pathname) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(module_name, STRINGP);
            SubLTrampolineFile.checkType(system_name, STRINGP);
            SubLTrampolineFile.checkType(pathname, STRINGP);
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == system_p(system_lookup(system_name))) {
                    Errors.error($str_alt67$_A_is_not_the_name_of_a_known_sys, system_name);
                }
            }
            {
                SubLObject existing_module = module_lookup(module_name, system_name);
                if (NIL != module_p(existing_module)) {
                    return existing_module;
                } else {
                    return create_provisional_module(module_name, system_name, pathname);
                }
            }
        }
    }

    /**
     * Ensures existence of a module structure, representing the specified code
     * module named MODULE-NAME, in system SYSTEM-NAME, to be found at PATHNAME,
     * that is not part of a declared system.  If the module structure already
     * exists, it is simply returned.  If the module structure does not already
     * exist, it is created and then returned.
     */
    @LispMethod(comment = "Ensures existence of a module structure, representing the specified code\r\nmodule named MODULE-NAME, in system SYSTEM-NAME, to be found at PATHNAME,\r\nthat is not part of a declared system.  If the module structure already\r\nexists, it is simply returned.  If the module structure does not already\r\nexist, it is created and then returned.\nEnsures existence of a module structure, representing the specified code\nmodule named MODULE-NAME, in system SYSTEM-NAME, to be found at PATHNAME,\nthat is not part of a declared system.  If the module structure already\nexists, it is simply returned.  If the module structure does not already\nexist, it is created and then returned.")
    public static SubLObject ensure_provisional_module(final SubLObject module_name, final SubLObject system_name, final SubLObject pathname) {
        return NIL;
    }

    /**
     * Creates a module structure to represent a code module named MODULE-NAME,
     * in system SYSTEM-NAME, to be found at PATHNAME, that is not part of a
     * declared system.
     */
    @LispMethod(comment = "Creates a module structure to represent a code module named MODULE-NAME,\r\nin system SYSTEM-NAME, to be found at PATHNAME, that is not part of a\r\ndeclared system.\nCreates a module structure to represent a code module named MODULE-NAME,\nin system SYSTEM-NAME, to be found at PATHNAME, that is not part of a\ndeclared system.")
    public static final SubLObject create_provisional_module_alt(SubLObject module_name, SubLObject system_name, SubLObject pathname) {
        return module_new(module_name, system_name, T, pathname);
    }

    /**
     * Creates a module structure to represent a code module named MODULE-NAME,
     * in system SYSTEM-NAME, to be found at PATHNAME, that is not part of a
     * declared system.
     */
    @LispMethod(comment = "Creates a module structure to represent a code module named MODULE-NAME,\r\nin system SYSTEM-NAME, to be found at PATHNAME, that is not part of a\r\ndeclared system.\nCreates a module structure to represent a code module named MODULE-NAME,\nin system SYSTEM-NAME, to be found at PATHNAME, that is not part of a\ndeclared system.")
    public static SubLObject create_provisional_module(final SubLObject module_name, final SubLObject system_name, final SubLObject pathname) {
        return module_new(module_name, system_name, T, pathname);
    }

    public static final SubLObject create_module_alt(SubLObject module_name, SubLObject system_name) {
        SubLTrampolineFile.checkType(module_name, STRINGP);
        SubLTrampolineFile.checkType(system_name, STRINGP);
        return module_new(module_name, system_name, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject create_module(final SubLObject module_name, final SubLObject system_name) {
        assert NIL != stringp(module_name) : "! stringp(module_name) " + ("Types.stringp(module_name) " + "CommonSymbols.NIL != Types.stringp(module_name) ") + module_name;
        assert NIL != stringp(system_name) : "! stringp(system_name) " + ("Types.stringp(system_name) " + "CommonSymbols.NIL != Types.stringp(system_name) ") + system_name;
        return module_new(module_name, system_name, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject module_get_name_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, MODULE_P);
        return module_name(module);
    }

    public static SubLObject module_get_name(final SubLObject module) {
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        return module_name(module);
    }

    public static final SubLObject module_get_system_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, MODULE_P);
        return module_system(module);
    }

    public static SubLObject module_get_system(final SubLObject module) {
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        return module_system(module);
    }

    public static final SubLObject module_get_pathname_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, MODULE_P);
        return module_pathname(module);
    }

    public static SubLObject module_get_pathname(final SubLObject module) {
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        return module_pathname(module);
    }

    public static final SubLObject module_add_test_case_alt(SubLObject module, SubLObject test_case_symbol) {
        SubLTrampolineFile.checkType(module, MODULE_P);
        SubLTrampolineFile.checkType(test_case_symbol, SYMBOLP);
        {
            SubLObject lock = $module_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = test_case_symbol;
                    if (NIL == member(item_var, module_test_cases(module), symbol_function(EQL), symbol_function(IDENTITY))) {
                        _csetf_module_test_cases(module, cons(item_var, module_test_cases(module)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return module_test_cases(module);
    }

    public static SubLObject module_add_test_case(final SubLObject module, final SubLObject test_case_symbol) {
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        assert NIL != symbolp(test_case_symbol) : "! symbolp(test_case_symbol) " + ("Types.symbolp(test_case_symbol) " + "CommonSymbols.NIL != Types.symbolp(test_case_symbol) ") + test_case_symbol;
        SubLObject release = NIL;
        try {
            release = seize_lock($module_lock$.getGlobalValue());
            if (NIL == member(test_case_symbol, module_test_cases(module), symbol_function(EQL), symbol_function(IDENTITY))) {
                _csetf_module_test_cases(module, cons(test_case_symbol, module_test_cases(module)));
            }
        } finally {
            if (NIL != release) {
                release_lock($module_lock$.getGlobalValue());
            }
        }
        return module_test_cases(module);
    }

    public static final SubLObject module_remove_test_case_alt(SubLObject module, SubLObject test_case_symbol) {
        SubLTrampolineFile.checkType(module, MODULE_P);
        SubLTrampolineFile.checkType(test_case_symbol, SYMBOLP);
        {
            SubLObject lock = $module_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_module_test_cases(module, delete(test_case_symbol, module_test_cases(module), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return module_test_cases(module);
    }

    public static SubLObject module_remove_test_case(final SubLObject module, final SubLObject test_case_symbol) {
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        assert NIL != symbolp(test_case_symbol) : "! symbolp(test_case_symbol) " + ("Types.symbolp(test_case_symbol) " + "CommonSymbols.NIL != Types.symbolp(test_case_symbol) ") + test_case_symbol;
        SubLObject release = NIL;
        try {
            release = seize_lock($module_lock$.getGlobalValue());
            _csetf_module_test_cases(module, delete(test_case_symbol, module_test_cases(module), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($module_lock$.getGlobalValue());
            }
        }
        return module_test_cases(module);
    }

    public static final SubLObject module_get_test_cases_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, MODULE_P);
        return module_test_cases(module);
    }

    public static SubLObject module_get_test_cases(final SubLObject module) {
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        return module_test_cases(module);
    }

    public static final SubLObject module_add_test_suite_alt(SubLObject module, SubLObject test_suite_name) {
        SubLTrampolineFile.checkType(module, MODULE_P);
        SubLTrampolineFile.checkType(test_suite_name, STRINGP);
        {
            SubLObject lock = $module_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = test_suite_name;
                    if (NIL == member(item_var, module_test_suites(module), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                        _csetf_module_test_suites(module, cons(item_var, module_test_suites(module)));
                    }
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return module_test_suites(module);
    }

    public static SubLObject module_add_test_suite(final SubLObject module, final SubLObject test_suite_name) {
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        assert NIL != stringp(test_suite_name) : "! stringp(test_suite_name) " + ("Types.stringp(test_suite_name) " + "CommonSymbols.NIL != Types.stringp(test_suite_name) ") + test_suite_name;
        SubLObject release = NIL;
        try {
            release = seize_lock($module_lock$.getGlobalValue());
            if (NIL == member(test_suite_name, module_test_suites(module), symbol_function(EQUAL), symbol_function(IDENTITY))) {
                _csetf_module_test_suites(module, cons(test_suite_name, module_test_suites(module)));
            }
        } finally {
            if (NIL != release) {
                release_lock($module_lock$.getGlobalValue());
            }
        }
        return module_test_suites(module);
    }

    public static final SubLObject module_remove_test_suite_alt(SubLObject module, SubLObject test_suite_name) {
        SubLTrampolineFile.checkType(module, MODULE_P);
        SubLTrampolineFile.checkType(test_suite_name, STRINGP);
        {
            SubLObject lock = $module_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_module_test_suites(module, delete(test_suite_name, module_test_suites(module), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return module_test_suites(module);
    }

    public static SubLObject module_remove_test_suite(final SubLObject module, final SubLObject test_suite_name) {
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        assert NIL != stringp(test_suite_name) : "! stringp(test_suite_name) " + ("Types.stringp(test_suite_name) " + "CommonSymbols.NIL != Types.stringp(test_suite_name) ") + test_suite_name;
        SubLObject release = NIL;
        try {
            release = seize_lock($module_lock$.getGlobalValue());
            _csetf_module_test_suites(module, delete(test_suite_name, module_test_suites(module), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($module_lock$.getGlobalValue());
            }
        }
        return module_test_suites(module);
    }

    public static final SubLObject module_get_test_suites_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, MODULE_P);
        return module_test_suites(module);
    }

    public static SubLObject module_get_test_suites(final SubLObject module) {
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        return module_test_suites(module);
    }

    public static final SubLObject module_get_provisional_p_alt(SubLObject module) {
        SubLTrampolineFile.checkType(module, MODULE_P);
        return module_provisional_p(module);
    }

    public static SubLObject module_get_provisional_p(final SubLObject module) {
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        return module_provisional_p(module);
    }

    public static final SubLObject system_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_system(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject system_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_system(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject system_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.modules.$system_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject system_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.modules.$system_native.class ? T : NIL;
    }

    public static final SubLObject system_basis_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_P);
        return v_object.getField2();
    }

    public static SubLObject system_basis(final SubLObject v_object) {
        assert NIL != system_p(v_object) : "! modules.system_p(v_object) " + "modules.system_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject system_name_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_P);
        return v_object.getField3();
    }

    public static SubLObject system_name(final SubLObject v_object) {
        assert NIL != system_p(v_object) : "! modules.system_p(v_object) " + "modules.system_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject system_default_pathname_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_P);
        return v_object.getField4();
    }

    public static SubLObject system_default_pathname(final SubLObject v_object) {
        assert NIL != system_p(v_object) : "! modules.system_p(v_object) " + "modules.system_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject system_modules_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_P);
        return v_object.getField5();
    }

    public static SubLObject system_modules(final SubLObject v_object) {
        assert NIL != system_p(v_object) : "! modules.system_p(v_object) " + "modules.system_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject system_provisional_p_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_P);
        return v_object.getField6();
    }

    public static SubLObject system_provisional_p(final SubLObject v_object) {
        assert NIL != system_p(v_object) : "! modules.system_p(v_object) " + "modules.system_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_system_basis_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_system_basis(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_p(v_object) : "! modules.system_p(v_object) " + "modules.system_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_system_name_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_system_name(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_p(v_object) : "! modules.system_p(v_object) " + "modules.system_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_system_default_pathname_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_system_default_pathname(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_p(v_object) : "! modules.system_p(v_object) " + "modules.system_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_system_modules_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_system_modules(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_p(v_object) : "! modules.system_p(v_object) " + "modules.system_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_system_provisional_p_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, SYSTEM_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_system_provisional_p(final SubLObject v_object, final SubLObject value) {
        assert NIL != system_p(v_object) : "! modules.system_p(v_object) " + "modules.system_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_system_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.modules.$system_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($BASIS)) {
                        _csetf_system_basis(v_new, current_value);
                    } else {
                        if (pcase_var.eql($NAME)) {
                            _csetf_system_name(v_new, current_value);
                        } else {
                            if (pcase_var.eql($DEFAULT_PATHNAME)) {
                                _csetf_system_default_pathname(v_new, current_value);
                            } else {
                                if (pcase_var.eql($MODULES)) {
                                    _csetf_system_modules(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($PROVISIONAL_P)) {
                                        _csetf_system_provisional_p(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt34$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_system(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.modules.$system_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($BASIS)) {
                _csetf_system_basis(v_new, current_value);
            } else
                if (pcase_var.eql($NAME)) {
                    _csetf_system_name(v_new, current_value);
                } else
                    if (pcase_var.eql($DEFAULT_PATHNAME)) {
                        _csetf_system_default_pathname(v_new, current_value);
                    } else
                        if (pcase_var.eql($MODULES)) {
                            _csetf_system_modules(v_new, current_value);
                        } else
                            if (pcase_var.eql($PROVISIONAL_P)) {
                                _csetf_system_provisional_p(v_new, current_value);
                            } else {
                                Errors.error($str35$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_system(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_SYSTEM, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $BASIS, system_basis(obj));
        funcall(visitor_fn, obj, $SLOT, $NAME, system_name(obj));
        funcall(visitor_fn, obj, $SLOT, $DEFAULT_PATHNAME, system_default_pathname(obj));
        funcall(visitor_fn, obj, $SLOT, $MODULES, system_modules(obj));
        funcall(visitor_fn, obj, $SLOT, $PROVISIONAL_P, system_provisional_p(obj));
        funcall(visitor_fn, obj, $END, MAKE_SYSTEM, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_system_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_system(obj, visitor_fn);
    }

    public static final SubLObject print_system_alt(SubLObject system, SubLObject stream, SubLObject depth) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject system_name = system_get_name(system);
                if (NIL != $print_readably$.getDynamicValue(thread)) {
                    print_not_readable(system, stream);
                } else {
                    {
                        SubLObject v_object = system;
                        SubLObject stream_3 = stream;
                        write_string($str_alt35$__, stream_3, UNPROVIDED, UNPROVIDED);
                        write(type_of(v_object), new SubLObject[]{ $STREAM, stream_3 });
                        write_char(CHAR_space, stream_3);
                        format(stream, $str_alt88$System__S, system_name);
                        write_char(CHAR_greater, stream_3);
                    }
                }
            }
            return system;
        }
    }

    public static SubLObject print_system(final SubLObject system, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject system_name = system_get_name(system);
        if (NIL != $print_readably$.getDynamicValue(thread)) {
            print_not_readable(system, stream);
        } else {
            print_macros.print_unreadable_object_preamble(stream, system, T, T);
            format(stream, $str94$System__S, system_name);
            print_macros.print_unreadable_object_postamble(stream, system, NIL, NIL);
        }
        return system;
    }

    public static final SubLObject sxhash_system_method_alt(SubLObject v_object) {
        return Sxhash.sxhash(system_get_name(v_object));
    }

    public static SubLObject sxhash_system_method(final SubLObject v_object) {
        return Sxhash.sxhash(system_get_name(v_object));
    }

    public static final SubLObject system_store_alt(SubLObject system) {
        {
            SubLObject lock = $system_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject item_var = system;
                    if (NIL == member(item_var, $system_index$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $system_index$.setGlobalValue(cons(item_var, $system_index$.getGlobalValue()));
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

    public static SubLObject system_store(final SubLObject system) {
        SubLObject release = NIL;
        try {
            release = seize_lock($system_lock$.getGlobalValue());
            if (NIL == member(system, $system_index$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                $system_index$.setGlobalValue(cons(system, $system_index$.getGlobalValue()));
            }
        } finally {
            if (NIL != release) {
                release_lock($system_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject system_remove_alt(SubLObject system) {
        {
            SubLObject lock = $system_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                $system_index$.setGlobalValue(remove(system, $system_index$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    public static SubLObject system_remove(final SubLObject system) {
        SubLObject release = NIL;
        try {
            release = seize_lock($system_lock$.getGlobalValue());
            $system_index$.setGlobalValue(remove(system, $system_index$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($system_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject system_lookup_alt(SubLObject system_name) {
        SubLTrampolineFile.checkType(system_name, STRINGP);
        return find(system_name, $system_index$.getGlobalValue(), symbol_function(EQUAL), symbol_function(SYSTEM_GET_NAME), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject system_lookup(final SubLObject system_name) {
        assert NIL != stringp(system_name) : "! stringp(system_name) " + ("Types.stringp(system_name) " + "CommonSymbols.NIL != Types.stringp(system_name) ") + system_name;
        return find(system_name, $system_index$.getGlobalValue(), symbol_function(EQUAL), symbol_function(SYSTEM_GET_NAME), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject all_systems_alt() {
        return $system_index$.getGlobalValue();
    }

    public static SubLObject all_systems() {
        return $system_index$.getGlobalValue();
    }

    public static final SubLObject system_new_alt(SubLObject system_name, SubLObject provisional_p, SubLObject default_pathname) {
        if (provisional_p == UNPROVIDED) {
            provisional_p = NIL;
        }
        if (default_pathname == UNPROVIDED) {
            default_pathname = NIL;
        }
        SubLTrampolineFile.checkType(system_name, STRINGP);
        system_name = Strings.string_downcase(system_name, UNPROVIDED, UNPROVIDED);
        {
            SubLObject v_new = make_system(UNPROVIDED);
            _csetf_system_name(v_new, system_name);
            system_store(v_new);
            return v_new;
        }
    }

    public static SubLObject system_new(SubLObject system_name, SubLObject provisional_p, SubLObject default_pathname) {
        if (provisional_p == UNPROVIDED) {
            provisional_p = NIL;
        }
        if (default_pathname == UNPROVIDED) {
            default_pathname = NIL;
        }
        assert NIL != stringp(system_name) : "! stringp(system_name) " + ("Types.stringp(system_name) " + "CommonSymbols.NIL != Types.stringp(system_name) ") + system_name;
        system_name = Strings.string_downcase(system_name, UNPROVIDED, UNPROVIDED);
        final SubLObject v_new = make_system(UNPROVIDED);
        _csetf_system_name(v_new, system_name);
        system_store(v_new);
        return v_new;
    }

    /**
     * Ensures existence of a system structure, representing the specified
     * system name, the modules of which are to be found at default-pathname,
     * that is not a declared system.   If the system structure already
     * exists, it is simply returned.  If the system structure does not already
     * exist, it is created and then returned.
     */
    @LispMethod(comment = "Ensures existence of a system structure, representing the specified\r\nsystem name, the modules of which are to be found at default-pathname,\r\nthat is not a declared system.   If the system structure already\r\nexists, it is simply returned.  If the system structure does not already\r\nexist, it is created and then returned.\nEnsures existence of a system structure, representing the specified\nsystem name, the modules of which are to be found at default-pathname,\nthat is not a declared system.   If the system structure already\nexists, it is simply returned.  If the system structure does not already\nexist, it is created and then returned.")
    public static final SubLObject ensure_provisional_system_alt(SubLObject system_name, SubLObject default_pathname) {
        SubLTrampolineFile.checkType(system_name, STRINGP);
        SubLTrampolineFile.checkType(default_pathname, STRINGP);
        {
            SubLObject existing_system = system_lookup(system_name);
            if (NIL != system_p(existing_system)) {
                return existing_system;
            } else {
                return create_provisional_system(system_name, default_pathname);
            }
        }
    }

    @LispMethod(comment = "Ensures existence of a system structure, representing the specified\r\nsystem name, the modules of which are to be found at default-pathname,\r\nthat is not a declared system.   If the system structure already\r\nexists, it is simply returned.  If the system structure does not already\r\nexist, it is created and then returned.\nEnsures existence of a system structure, representing the specified\nsystem name, the modules of which are to be found at default-pathname,\nthat is not a declared system.   If the system structure already\nexists, it is simply returned.  If the system structure does not already\nexist, it is created and then returned.")
    public static SubLObject ensure_provisional_system(final SubLObject system_name, final SubLObject default_pathname) {
        assert NIL != stringp(system_name) : "! stringp(system_name) " + ("Types.stringp(system_name) " + "CommonSymbols.NIL != Types.stringp(system_name) ") + system_name;
        assert NIL != stringp(default_pathname) : "! stringp(default_pathname) " + ("Types.stringp(default_pathname) " + "CommonSymbols.NIL != Types.stringp(default_pathname) ") + default_pathname;
        final SubLObject existing_system = system_lookup(system_name);
        if (NIL != system_p(existing_system)) {
            return existing_system;
        }
        return create_provisional_system(system_name, default_pathname);
    }

    /**
     * Creates a system structure to represent a system
     * named SYSTEM-NAME, the modules of which are to be found at
     * DEFAULT-PATHNAME, that is not a declared system.
     */
    @LispMethod(comment = "Creates a system structure to represent a system\r\nnamed SYSTEM-NAME, the modules of which are to be found at\r\nDEFAULT-PATHNAME, that is not a declared system.\nCreates a system structure to represent a system\nnamed SYSTEM-NAME, the modules of which are to be found at\nDEFAULT-PATHNAME, that is not a declared system.")
    public static final SubLObject create_provisional_system_alt(SubLObject system_name, SubLObject default_pathname) {
        SubLTrampolineFile.checkType(system_name, STRINGP);
        SubLTrampolineFile.checkType(default_pathname, STRINGP);
        {
            SubLObject existing_system = system_lookup(system_name);
            if (NIL != system_p(existing_system)) {
                Errors.error($str_alt92$_A_is_already_the_name_of_a_known, system_name);
            } else {
                return system_new(system_name, T, default_pathname);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Creates a system structure to represent a system\r\nnamed SYSTEM-NAME, the modules of which are to be found at\r\nDEFAULT-PATHNAME, that is not a declared system.\nCreates a system structure to represent a system\nnamed SYSTEM-NAME, the modules of which are to be found at\nDEFAULT-PATHNAME, that is not a declared system.")
    public static SubLObject create_provisional_system(final SubLObject system_name, final SubLObject default_pathname) {
        assert NIL != stringp(system_name) : "! stringp(system_name) " + ("Types.stringp(system_name) " + "CommonSymbols.NIL != Types.stringp(system_name) ") + system_name;
        assert NIL != stringp(default_pathname) : "! stringp(default_pathname) " + ("Types.stringp(default_pathname) " + "CommonSymbols.NIL != Types.stringp(default_pathname) ") + default_pathname;
        final SubLObject existing_system = system_lookup(system_name);
        if (NIL != system_p(existing_system)) {
            Errors.error($str98$_A_is_already_the_name_of_a_known, system_name);
            return NIL;
        }
        return system_new(system_name, T, default_pathname);
    }

    public static final SubLObject create_system_alt(SubLObject system_name) {
        SubLTrampolineFile.checkType(system_name, STRINGP);
        return system_new(system_name, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject create_system(final SubLObject system_name) {
        assert NIL != stringp(system_name) : "! stringp(system_name) " + ("Types.stringp(system_name) " + "CommonSymbols.NIL != Types.stringp(system_name) ") + system_name;
        return system_new(system_name, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject system_get_name_alt(SubLObject system) {
        SubLTrampolineFile.checkType(system, SYSTEM_P);
        return system_name(system);
    }

    public static SubLObject system_get_name(final SubLObject system) {
        assert NIL != system_p(system) : "! modules.system_p(system) " + ("modules.system_p(system) " + "CommonSymbols.NIL != modules.system_p(system) ") + system;
        return system_name(system);
    }

    public static final SubLObject system_get_default_pathname_alt(SubLObject system) {
        SubLTrampolineFile.checkType(system, SYSTEM_P);
        return system_default_pathname(system);
    }

    public static SubLObject system_get_default_pathname(final SubLObject system) {
        assert NIL != system_p(system) : "! modules.system_p(system) " + ("modules.system_p(system) " + "CommonSymbols.NIL != modules.system_p(system) ") + system;
        return system_default_pathname(system);
    }

    public static final SubLObject system_get_modules_alt(SubLObject system, SubLObject include_provisional_modules) {
        if (include_provisional_modules == UNPROVIDED) {
            include_provisional_modules = NIL;
        }
        SubLTrampolineFile.checkType(system, SYSTEM_P);
        return system_modules(system);
    }

    public static SubLObject system_get_modules(final SubLObject system, SubLObject include_provisional_modules) {
        if (include_provisional_modules == UNPROVIDED) {
            include_provisional_modules = NIL;
        }
        assert NIL != system_p(system) : "! modules.system_p(system) " + ("modules.system_p(system) " + "CommonSymbols.NIL != modules.system_p(system) ") + system;
        return reverse(system_modules(system));
    }

    /**
     * This is only called when MODULE is a provisional module, or we
     * are running translated C code!
     */
    @LispMethod(comment = "This is only called when MODULE is a provisional module, or we\r\nare running translated C code!\nThis is only called when MODULE is a provisional module, or we\nare running translated C code!")
    public static final SubLObject system_add_module_alt(SubLObject system, SubLObject module) {
        SubLTrampolineFile.checkType(system, SYSTEM_P);
        SubLTrampolineFile.checkType(module, MODULE_P);
        {
            SubLObject lock = $system_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_system_modules(system, adjoin(module, system_modules(system), UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return system_modules(system);
    }

    @LispMethod(comment = "This is only called when MODULE is a provisional module, or we\r\nare running translated C code!\nThis is only called when MODULE is a provisional module, or we\nare running translated C code!")
    public static SubLObject system_add_module(final SubLObject system, final SubLObject module) {
        assert NIL != system_p(system) : "! modules.system_p(system) " + ("modules.system_p(system) " + "CommonSymbols.NIL != modules.system_p(system) ") + system;
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        SubLObject release = NIL;
        try {
            release = seize_lock($system_lock$.getGlobalValue());
            _csetf_system_modules(system, adjoin(module, system_modules(system), UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($system_lock$.getGlobalValue());
            }
        }
        return system_modules(system);
    }

    /**
     * This is only called when MODULE is a provisional module, or we
     * are running translated C code!
     */
    @LispMethod(comment = "This is only called when MODULE is a provisional module, or we\r\nare running translated C code!\nThis is only called when MODULE is a provisional module, or we\nare running translated C code!")
    public static final SubLObject system_remove_module_alt(SubLObject system, SubLObject module) {
        SubLTrampolineFile.checkType(system, SYSTEM_P);
        SubLTrampolineFile.checkType(module, MODULE_P);
        {
            SubLObject lock = $system_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                _csetf_system_modules(system, delete(module, system_modules(system), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return system_modules(system);
    }

    @LispMethod(comment = "This is only called when MODULE is a provisional module, or we\r\nare running translated C code!\nThis is only called when MODULE is a provisional module, or we\nare running translated C code!")
    public static SubLObject system_remove_module(final SubLObject system, final SubLObject module) {
        assert NIL != system_p(system) : "! modules.system_p(system) " + ("modules.system_p(system) " + "CommonSymbols.NIL != modules.system_p(system) ") + system;
        assert NIL != module_p(module) : "! modules.module_p(module) " + ("modules.module_p(module) " + "CommonSymbols.NIL != modules.module_p(module) ") + module;
        SubLObject release = NIL;
        try {
            release = seize_lock($system_lock$.getGlobalValue());
            _csetf_system_modules(system, delete(module, system_modules(system), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        } finally {
            if (NIL != release) {
                release_lock($system_lock$.getGlobalValue());
            }
        }
        return system_modules(system);
    }

    public static final SubLObject system_get_provisional_p_alt(SubLObject system) {
        SubLTrampolineFile.checkType(system, SYSTEM_P);
        return system_provisional_p(system);
    }

    public static SubLObject system_get_provisional_p(final SubLObject system) {
        assert NIL != system_p(system) : "! modules.system_p(system) " + ("modules.system_p(system) " + "CommonSymbols.NIL != modules.system_p(system) ") + system;
        return system_provisional_p(system);
    }

    public static final SubLObject system_module_names_alt(SubLObject system_name, SubLObject include_provisional) {
        if (include_provisional == UNPROVIDED) {
            include_provisional = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject system = system_lookup(system_name);
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL == system_p(system)) {
                        Errors.error($str_alt67$_A_is_not_the_name_of_a_known_sys, system_name);
                    }
                }
                {
                    SubLObject result = NIL;
                    if (NIL != system_p(system)) {
                        {
                            SubLObject cdolist_list_var = system_get_modules(system, UNPROVIDED);
                            SubLObject module = NIL;
                            for (module = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module = cdolist_list_var.first()) {
                                result = cons(module_get_name(module), result);
                            }
                        }
                    }
                    return nreverse(result);
                }
            }
        }
    }

    public static SubLObject system_module_names(final SubLObject system_name, SubLObject include_provisional) {
        if (include_provisional == UNPROVIDED) {
            include_provisional = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject system = system_lookup(system_name);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == system_p(system))) {
            Errors.error($str70$_A_is_not_the_name_of_a_known_sys, system_name);
        }
        SubLObject result = NIL;
        if (NIL != system_p(system)) {
            SubLObject cdolist_list_var = system_get_modules(system, UNPROVIDED);
            SubLObject module = NIL;
            module = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(module_get_name(module), result);
                cdolist_list_var = cdolist_list_var.rest();
                module = cdolist_list_var.first();
            } 
        }
        return nreverse(result);
    }

    public static final SubLObject system_names_alt(SubLObject include_provisional) {
        if (include_provisional == UNPROVIDED) {
            include_provisional = NIL;
        }
        {
            SubLObject all_systems = all_systems();
            return Mapping.mapcar(symbol_function(SYSTEM_GET_NAME), all_systems);
        }
    }

    public static SubLObject system_names(SubLObject include_provisional) {
        if (include_provisional == UNPROVIDED) {
            include_provisional = NIL;
        }
        final SubLObject all_systems = all_systems();
        return Mapping.mapcar(symbol_function(SYSTEM_GET_NAME), all_systems);
    }

    public static final SubLObject note_translated_modules_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject system_name = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt93);
            system_name = current.first();
            current = current.rest();
            if (NIL == current) {
                return $list_alt94;
            } else {
                cdestructuring_bind_error(datum, $list_alt93);
            }
        }
        return NIL;
    }

    public static SubLObject note_translated_modules(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject system_name = NIL;
        destructuring_bind_must_consp(current, datum, $list99);
        system_name = current.first();
        current = current.rest();
        if (NIL != current) {
            cdestructuring_bind_error(datum, $list99);
            return NIL;
        }
        if (NIL != find($COMMON_LISP, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return $list101;
        }
        final SubLObject v_modules = system_get_modules(system_lookup(system_name), UNPROVIDED);
        SubLObject module_names = NIL;
        SubLObject cdolist_list_var = v_modules;
        SubLObject module = NIL;
        module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject name = module_get_name(module);
            module_names = cons(name, module_names);
            cdolist_list_var = cdolist_list_var.rest();
            module = cdolist_list_var.first();
        } 
        module_names = nreverse(module_names);
        return list(PROGN, $list102, list(CDOLIST, list(NAME, list(QUOTE, module_names)), list(CREATE_MODULE, NAME, system_name)));
    }

    public static SubLObject declare_modules_file() {
        declareMacro("with_module_lock", "WITH-MODULE-LOCK");
        declareMacro("with_system_lock", "WITH-SYSTEM-LOCK");
        declareFunction("module_print_function_trampoline", "MODULE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("module_p", "MODULE-P", 1, 0, false);
        new modules.$module_p$UnaryFunction();
        declareFunction("module_basis", "MODULE-BASIS", 1, 0, false);
        declareFunction("module_name", "MODULE-NAME", 1, 0, false);
        declareFunction("module_system", "MODULE-SYSTEM", 1, 0, false);
        declareFunction("module_pathname", "MODULE-PATHNAME", 1, 0, false);
        declareFunction("module_test_cases", "MODULE-TEST-CASES", 1, 0, false);
        declareFunction("module_test_suites", "MODULE-TEST-SUITES", 1, 0, false);
        declareFunction("module_provisional_p", "MODULE-PROVISIONAL-P", 1, 0, false);
        declareFunction("_csetf_module_basis", "_CSETF-MODULE-BASIS", 2, 0, false);
        declareFunction("_csetf_module_name", "_CSETF-MODULE-NAME", 2, 0, false);
        declareFunction("_csetf_module_system", "_CSETF-MODULE-SYSTEM", 2, 0, false);
        declareFunction("_csetf_module_pathname", "_CSETF-MODULE-PATHNAME", 2, 0, false);
        declareFunction("_csetf_module_test_cases", "_CSETF-MODULE-TEST-CASES", 2, 0, false);
        declareFunction("_csetf_module_test_suites", "_CSETF-MODULE-TEST-SUITES", 2, 0, false);
        declareFunction("_csetf_module_provisional_p", "_CSETF-MODULE-PROVISIONAL-P", 2, 0, false);
        declareFunction("make_module", "MAKE-MODULE", 0, 1, false);
        declareFunction("visit_defstruct_module", "VISIT-DEFSTRUCT-MODULE", 2, 0, false);
        declareFunction("visit_defstruct_object_module_method", "VISIT-DEFSTRUCT-OBJECT-MODULE-METHOD", 2, 0, false);
        declareFunction("print_module", "PRINT-MODULE", 3, 0, false);
        declareFunction("sxhash_module_method", "SXHASH-MODULE-METHOD", 1, 0, false);
        declareFunction("module_store", "MODULE-STORE", 1, 0, false);
        declareFunction("module_remove", "MODULE-REMOVE", 1, 0, false);
        declareFunction("module_lookup", "MODULE-LOOKUP", 2, 0, false);
        declareFunction("all_modules", "ALL-MODULES", 0, 0, false);
        declareMacro("do_modules", "DO-MODULES");
        declareFunction("module_get_index", "MODULE-GET-INDEX", 0, 0, false);
        declareFunction("module_new", "MODULE-NEW", 2, 2, false);
        declareFunction("ensure_provisional_module", "ENSURE-PROVISIONAL-MODULE", 3, 0, false);
        declareFunction("create_provisional_module", "CREATE-PROVISIONAL-MODULE", 3, 0, false);
        declareFunction("create_module", "CREATE-MODULE", 2, 0, false);
        declareFunction("module_get_name", "MODULE-GET-NAME", 1, 0, false);
        declareFunction("module_get_system", "MODULE-GET-SYSTEM", 1, 0, false);
        declareFunction("module_get_pathname", "MODULE-GET-PATHNAME", 1, 0, false);
        declareFunction("module_add_test_case", "MODULE-ADD-TEST-CASE", 2, 0, false);
        declareFunction("module_remove_test_case", "MODULE-REMOVE-TEST-CASE", 2, 0, false);
        declareFunction("module_get_test_cases", "MODULE-GET-TEST-CASES", 1, 0, false);
        declareFunction("module_add_test_suite", "MODULE-ADD-TEST-SUITE", 2, 0, false);
        declareFunction("module_remove_test_suite", "MODULE-REMOVE-TEST-SUITE", 2, 0, false);
        declareFunction("module_get_test_suites", "MODULE-GET-TEST-SUITES", 1, 0, false);
        declareFunction("module_get_provisional_p", "MODULE-GET-PROVISIONAL-P", 1, 0, false);
        declareFunction("system_print_function_trampoline", "SYSTEM-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("system_p", "SYSTEM-P", 1, 0, false);
        new modules.$system_p$UnaryFunction();
        declareFunction("system_basis", "SYSTEM-BASIS", 1, 0, false);
        declareFunction("system_name", "SYSTEM-NAME", 1, 0, false);
        declareFunction("system_default_pathname", "SYSTEM-DEFAULT-PATHNAME", 1, 0, false);
        declareFunction("system_modules", "SYSTEM-MODULES", 1, 0, false);
        declareFunction("system_provisional_p", "SYSTEM-PROVISIONAL-P", 1, 0, false);
        declareFunction("_csetf_system_basis", "_CSETF-SYSTEM-BASIS", 2, 0, false);
        declareFunction("_csetf_system_name", "_CSETF-SYSTEM-NAME", 2, 0, false);
        declareFunction("_csetf_system_default_pathname", "_CSETF-SYSTEM-DEFAULT-PATHNAME", 2, 0, false);
        declareFunction("_csetf_system_modules", "_CSETF-SYSTEM-MODULES", 2, 0, false);
        declareFunction("_csetf_system_provisional_p", "_CSETF-SYSTEM-PROVISIONAL-P", 2, 0, false);
        declareFunction("make_system", "MAKE-SYSTEM", 0, 1, false);
        declareFunction("visit_defstruct_system", "VISIT-DEFSTRUCT-SYSTEM", 2, 0, false);
        declareFunction("visit_defstruct_object_system_method", "VISIT-DEFSTRUCT-OBJECT-SYSTEM-METHOD", 2, 0, false);
        declareFunction("print_system", "PRINT-SYSTEM", 3, 0, false);
        declareFunction("sxhash_system_method", "SXHASH-SYSTEM-METHOD", 1, 0, false);
        declareFunction("system_store", "SYSTEM-STORE", 1, 0, false);
        declareFunction("system_remove", "SYSTEM-REMOVE", 1, 0, false);
        declareFunction("system_lookup", "SYSTEM-LOOKUP", 1, 0, false);
        declareFunction("all_systems", "ALL-SYSTEMS", 0, 0, false);
        declareFunction("system_new", "SYSTEM-NEW", 1, 2, false);
        declareFunction("ensure_provisional_system", "ENSURE-PROVISIONAL-SYSTEM", 2, 0, false);
        declareFunction("create_provisional_system", "CREATE-PROVISIONAL-SYSTEM", 2, 0, false);
        declareFunction("create_system", "CREATE-SYSTEM", 1, 0, false);
        declareFunction("system_get_name", "SYSTEM-GET-NAME", 1, 0, false);
        declareFunction("system_get_default_pathname", "SYSTEM-GET-DEFAULT-PATHNAME", 1, 0, false);
        declareFunction("system_get_modules", "SYSTEM-GET-MODULES", 1, 1, false);
        declareFunction("system_add_module", "SYSTEM-ADD-MODULE", 2, 0, false);
        declareFunction("system_remove_module", "SYSTEM-REMOVE-MODULE", 2, 0, false);
        declareFunction("system_get_provisional_p", "SYSTEM-GET-PROVISIONAL-P", 1, 0, false);
        declareFunction("system_module_names", "SYSTEM-MODULE-NAMES", 1, 1, false);
        declareFunction("system_names", "SYSTEM-NAMES", 0, 1, false);
        declareMacro("note_translated_modules", "NOTE-TRANSLATED-MODULES");
        return NIL;
    }

    static private final SubLList $list_alt2 = list(makeSymbol("*MODULE-LOCK*"));

    static private final SubLList $list_alt4 = list(makeSymbol("*SYSTEM-LOCK*"));

    static private final SubLList $list_alt7 = list(makeSymbol("BASIS"), makeSymbol("NAME"), makeSymbol("SYSTEM"), makeSymbol("PATHNAME"), makeSymbol("TEST-CASES"), makeSymbol("TEST-SUITES"), makeSymbol("PROVISIONAL-P"));

    static private final SubLList $list_alt8 = list(makeKeyword("BASIS"), $NAME, makeKeyword("SYSTEM"), makeKeyword("PATHNAME"), makeKeyword("TEST-CASES"), makeKeyword("TEST-SUITES"), makeKeyword("PROVISIONAL-P"));

    static private final SubLList $list_alt9 = list(makeSymbol("MODULE-BASIS"), makeSymbol("MODULE-NAME"), makeSymbol("MODULE-SYSTEM"), makeSymbol("MODULE-PATHNAME"), makeSymbol("MODULE-TEST-CASES"), makeSymbol("MODULE-TEST-SUITES"), makeSymbol("MODULE-PROVISIONAL-P"));

    static private final SubLList $list_alt10 = list(makeSymbol("_CSETF-MODULE-BASIS"), makeSymbol("_CSETF-MODULE-NAME"), makeSymbol("_CSETF-MODULE-SYSTEM"), makeSymbol("_CSETF-MODULE-PATHNAME"), makeSymbol("_CSETF-MODULE-TEST-CASES"), makeSymbol("_CSETF-MODULE-TEST-SUITES"), makeSymbol("_CSETF-MODULE-PROVISIONAL-P"));

    public static final SubLObject init_modules_file_alt() {
        deflexical("*MODULE-LOCK*", make_lock($$$Module_Lock));
        deflexical("*SYSTEM-LOCK*", make_lock($$$System_Lock));
        defconstant("*DTP-MODULE*", MODULE);
        deflexical("*MODULE-INDEX*", NIL != boundp($module_index$) ? ((SubLObject) ($module_index$.getGlobalValue())) : make_hash_table($int$1024, symbol_function(EQUALP), UNPROVIDED));
        defconstant("*DTP-SYSTEM*", SYSTEM);
        deflexical("*SYSTEM-INDEX*", NIL != boundp($system_index$) ? ((SubLObject) ($system_index$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_modules_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*MODULE-LOCK*", make_lock($$$Module_Lock));
            deflexical("*SYSTEM-LOCK*", make_lock($$$System_Lock));
            defconstant("*DTP-MODULE*", MODULE);
            deflexical("*MODULE-INDEX*", SubLTrampolineFile.maybeDefault($module_index$, $module_index$, () -> make_hash_table($int$1024, symbol_function(EQUALP), UNPROVIDED)));
            defconstant("*DTP-SYSTEM*", SYSTEM);
            deflexical("*SYSTEM-INDEX*", SubLTrampolineFile.maybeDefault($system_index$, $system_index$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*MODULE-INDEX*", NIL != boundp($module_index$) ? ((SubLObject) ($module_index$.getGlobalValue())) : make_hash_table($int$1024, symbol_function(EQUALP), UNPROVIDED));
            deflexical("*SYSTEM-INDEX*", NIL != boundp($system_index$) ? ((SubLObject) ($system_index$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_modules_file_Previous() {
        deflexical("*MODULE-LOCK*", make_lock($$$Module_Lock));
        deflexical("*SYSTEM-LOCK*", make_lock($$$System_Lock));
        defconstant("*DTP-MODULE*", MODULE);
        deflexical("*MODULE-INDEX*", SubLTrampolineFile.maybeDefault($module_index$, $module_index$, () -> make_hash_table($int$1024, symbol_function(EQUALP), UNPROVIDED)));
        defconstant("*DTP-SYSTEM*", SYSTEM);
        deflexical("*SYSTEM-INDEX*", SubLTrampolineFile.maybeDefault($system_index$, $system_index$, NIL));
        return NIL;
    }

    public static SubLObject setup_modules_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_module$.getGlobalValue(), symbol_function(MODULE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list13);
        def_csetf(MODULE_BASIS, _CSETF_MODULE_BASIS);
        def_csetf(MODULE_NAME, _CSETF_MODULE_NAME);
        def_csetf(MODULE_SYSTEM, _CSETF_MODULE_SYSTEM);
        def_csetf(MODULE_PATHNAME, _CSETF_MODULE_PATHNAME);
        def_csetf(MODULE_TEST_CASES, _CSETF_MODULE_TEST_CASES);
        def_csetf(MODULE_TEST_SUITES, _CSETF_MODULE_TEST_SUITES);
        def_csetf(MODULE_PROVISIONAL_P, _CSETF_MODULE_PROVISIONAL_P);
        identity(MODULE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_module$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MODULE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_module$.getGlobalValue(), symbol_function(SXHASH_MODULE_METHOD));
        declare_defglobal($module_index$);
        register_macro_helper(MODULE_GET_INDEX, DO_MODULES);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_system$.getGlobalValue(), symbol_function(SYSTEM_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list79);
        def_csetf(SYSTEM_BASIS, _CSETF_SYSTEM_BASIS);
        def_csetf(SYSTEM_NAME, _CSETF_SYSTEM_NAME);
        def_csetf(SYSTEM_DEFAULT_PATHNAME, _CSETF_SYSTEM_DEFAULT_PATHNAME);
        def_csetf(SYSTEM_MODULES, _CSETF_SYSTEM_MODULES);
        def_csetf(SYSTEM_PROVISIONAL_P, _CSETF_SYSTEM_PROVISIONAL_P);
        identity(SYSTEM);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_system$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_SYSTEM_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_system$.getGlobalValue(), symbol_function(SXHASH_SYSTEM_METHOD));
        declare_defglobal($system_index$);
        return NIL;
    }

    static private final SubLString $str_alt34$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt35$__ = makeString("#<");

    static private final SubLString $str_alt37$_S_in__S = makeString("~S in ~S");

    static private final SubLList $list_alt43 = list(list(makeSymbol("VAR"), makeSymbol("&KEY"), makeSymbol("SYSTEM"), list(makeSymbol("MESSAGE"), makeString("mapping modules"))), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt44 = list(makeKeyword("SYSTEM"), makeKeyword("MESSAGE"));

    static private final SubLSymbol $sym48$MODULE_REF = makeUninternedSymbol("MODULE-REF");

    static private final SubLSymbol $sym49$MODULE_NAME = makeUninternedSymbol("MODULE-NAME");

    static private final SubLSymbol $sym50$SYSTEM_NAME = makeUninternedSymbol("SYSTEM-NAME");

    static private final SubLString $str_alt57$_A_is_not_a_known_system_name_ = makeString("~A is not a known system name.");

    static private final SubLList $list_alt59 = list(makeSymbol("MODULE-GET-INDEX"));

    @Override
    public void declareFunctions() {
        declare_modules_file();
    }

    @Override
    public void initializeVariables() {
        init_modules_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_modules_file();
    }

    static private final SubLString $str_alt67$_A_is_not_the_name_of_a_known_sys = makeString("~A is not the name of a known system.");

    static {
    }

    static private final SubLList $list_alt70 = list(makeSymbol("BASIS"), makeSymbol("NAME"), makeSymbol("DEFAULT-PATHNAME"), makeSymbol("MODULES"), makeSymbol("PROVISIONAL-P"));

    static private final SubLList $list_alt71 = list(makeKeyword("BASIS"), $NAME, makeKeyword("DEFAULT-PATHNAME"), makeKeyword("MODULES"), makeKeyword("PROVISIONAL-P"));

    static private final SubLList $list_alt72 = list(makeSymbol("SYSTEM-BASIS"), makeSymbol("SYSTEM-NAME"), makeSymbol("SYSTEM-DEFAULT-PATHNAME"), makeSymbol("SYSTEM-MODULES"), makeSymbol("SYSTEM-PROVISIONAL-P"));

    static private final SubLList $list_alt73 = list(makeSymbol("_CSETF-SYSTEM-BASIS"), makeSymbol("_CSETF-SYSTEM-NAME"), makeSymbol("_CSETF-SYSTEM-DEFAULT-PATHNAME"), makeSymbol("_CSETF-SYSTEM-MODULES"), makeSymbol("_CSETF-SYSTEM-PROVISIONAL-P"));

    static private final SubLString $str_alt88$System__S = makeString("System ~S");

    static private final SubLString $str_alt92$_A_is_already_the_name_of_a_known = makeString("~A is already the name of a known system.");

    static private final SubLList $list_alt93 = list(makeSymbol("SYSTEM-NAME"));

    static private final SubLList $list_alt94 = list(makeSymbol("PROGN"));

    public static final class $module_p$UnaryFunction extends UnaryFunction {
        public $module_p$UnaryFunction() {
            super(extractFunctionNamed("MODULE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return module_p(arg1);
        }
    }

    public static final class $system_native extends SubLStructNative {
        public SubLObject $basis;

        public SubLObject $name;

        public SubLObject $default_pathname;

        public SubLObject $modules;

        public SubLObject $provisional_p;

        private static final SubLStructDeclNative structDecl;

        public $system_native() {
            modules.$system_native.this.$basis = Lisp.NIL;
            modules.$system_native.this.$name = Lisp.NIL;
            modules.$system_native.this.$default_pathname = Lisp.NIL;
            modules.$system_native.this.$modules = Lisp.NIL;
            modules.$system_native.this.$provisional_p = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return modules.$system_native.this.$basis;
        }

        @Override
        public SubLObject getField3() {
            return modules.$system_native.this.$name;
        }

        @Override
        public SubLObject getField4() {
            return modules.$system_native.this.$default_pathname;
        }

        @Override
        public SubLObject getField5() {
            return modules.$system_native.this.$modules;
        }

        @Override
        public SubLObject getField6() {
            return modules.$system_native.this.$provisional_p;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return modules.$system_native.this.$basis = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return modules.$system_native.this.$name = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return modules.$system_native.this.$default_pathname = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return modules.$system_native.this.$modules = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return modules.$system_native.this.$provisional_p = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.modules.$system_native.class, SYSTEM, SYSTEM_P, $list73, $list74, new String[]{ "$basis", "$name", "$default_pathname", "$modules", "$provisional_p" }, $list75, $list76, PRINT_SYSTEM);
        }
    }

    public static final class $system_p$UnaryFunction extends UnaryFunction {
        public $system_p$UnaryFunction() {
            super(extractFunctionNamed("SYSTEM-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return system_p(arg1);
        }
    }
}

/**
 * Total time: 564 ms
 */
