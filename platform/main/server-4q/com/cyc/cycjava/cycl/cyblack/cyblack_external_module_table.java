/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyblack;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V02;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CYBLACK-EXTERNAL-MODULE-TABLE
 *  source file: /cyc/top/cycl/cyblack/cyblack-external-module-table.lisp
 *  created:     2019/07/03 17:38:44
 */
public final class cyblack_external_module_table extends SubLTranslatedFile implements V02 {
    // // Constructor
    private cyblack_external_module_table() {
    }

    public static final SubLFile me = new cyblack_external_module_table();


    // // Definitions
    public static final class $external_module_association_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cyblack_external_module_table.$external_module_association_native.structDecl;
        }

        public SubLObject getField2() {
            return $id;
        }

        public SubLObject getField3() {
            return $name;
        }

        public SubLObject setField2(SubLObject value) {
            return $id = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $name = value;
        }

        public SubLObject $id = Lisp.NIL;

        public SubLObject $name = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cyblack_external_module_table.$external_module_association_native.class, EXTERNAL_MODULE_ASSOCIATION, EXTERNAL_MODULE_ASSOCIATION_P, $list_alt2, $list_alt3, new String[]{ "$id", "$name" }, $list_alt4, $list_alt5, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_external_module_association$ = makeSymbol("*DTP-EXTERNAL-MODULE-ASSOCIATION*");

    public static final SubLObject external_module_association_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject external_module_association_p(SubLObject v_object) {
        return v_object.getJavaClass() ==cyblack_external_module_table.$external_module_association_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $external_module_association_p$UnaryFunction extends UnaryFunction {
        public $external_module_association_p$UnaryFunction() {
            super(extractFunctionNamed("EXTERNAL-MODULE-ASSOCIATION-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return external_module_association_p(arg1);
        }
    }

    public static final SubLObject ema_id(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_MODULE_ASSOCIATION_P);
        return v_object.getField2();
    }

    public static final SubLObject ema_name(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_MODULE_ASSOCIATION_P);
        return v_object.getField3();
    }

    public static final SubLObject _csetf_ema_id(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_MODULE_ASSOCIATION_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_ema_name(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_MODULE_ASSOCIATION_P);
        return v_object.setField3(value);
    }

    public static final SubLObject make_external_module_association(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cyblack_external_module_table.$external_module_association_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($ID)) {
                        _csetf_ema_id(v_new, current_value);
                    } else
                        if (pcase_var.eql($NAME)) {
                            _csetf_ema_name(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }

                }
            }
            return v_new;
        }
    }

    public static final class $external_module_table_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return cyblack_external_module_table.$external_module_table_native.structDecl;
        }

        public SubLObject getField2() {
            return $application;
        }

        public SubLObject getField3() {
            return $list;
        }

        public SubLObject setField2(SubLObject value) {
            return $application = value;
        }

        public SubLObject setField3(SubLObject value) {
            return $list = value;
        }

        public SubLObject $application = Lisp.NIL;

        public SubLObject $list = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(cyblack_external_module_table.$external_module_table_native.class, EXTERNAL_MODULE_TABLE, EXTERNAL_MODULE_TABLE_P, $list_alt17, $list_alt18, new String[]{ "$application", "$list" }, $list_alt19, $list_alt20, DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    // defconstant
    public static final SubLSymbol $dtp_external_module_table$ = makeSymbol("*DTP-EXTERNAL-MODULE-TABLE*");

    public static final SubLObject external_module_table_print_function_trampoline(SubLObject v_object, SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject external_module_table_p(SubLObject v_object) {
        return v_object.getJavaClass() ==cyblack_external_module_table.$external_module_table_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static final class $external_module_table_p$UnaryFunction extends UnaryFunction {
        public $external_module_table_p$UnaryFunction() {
            super(extractFunctionNamed("EXTERNAL-MODULE-TABLE-P"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return external_module_table_p(arg1);
        }
    }

    public static final SubLObject emt_application(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_MODULE_TABLE_P);
        return v_object.getField2();
    }

    public static final SubLObject emt_list(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_MODULE_TABLE_P);
        return v_object.getField3();
    }

    public static final SubLObject _csetf_emt_application(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_MODULE_TABLE_P);
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_emt_list(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, EXTERNAL_MODULE_TABLE_P);
        return v_object.setField3(value);
    }

    public static final SubLObject make_external_module_table(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new cyblack_external_module_table.$external_module_table_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($APPLICATION)) {
                        _csetf_emt_application(v_new, current_value);
                    } else
                        if (pcase_var.eql($LIST)) {
                            _csetf_emt_list(v_new, current_value);
                        } else {
                            Errors.error($str_alt14$Invalid_slot__S_for_construction_, current_arg);
                        }

                }
            }
            return v_new;
        }
    }

    public static final SubLObject new_external_module_table(SubLObject application) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == cyblack_application.cyblack_application_p(application)) {
                    Errors.error($str_alt28$NEW_EXTERNAL_MODULE_TABLE___S_is_, application);
                }
            }
            {
                SubLObject emt = make_external_module_table(UNPROVIDED);
                _csetf_emt_application(emt, application);
                _csetf_emt_list(emt, NIL);
                return emt;
            }
        }
    }

    public static final SubLObject get_external_module_id(SubLObject table, SubLObject external_module_name) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == external_module_table_p(table)) {
                    Errors.error($str_alt29$GET_EXTERNAL_MODULE_ID___S_is_not, table);
                }
            }
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!external_module_name.isString()) {
                    Errors.error($str_alt30$GET_EXTERNAL_MODULE_ID___S_is_not, external_module_name);
                }
            }
            {
                SubLObject table_list = emt_list(table);
                SubLObject cdolist_list_var = table_list;
                SubLObject association = NIL;
                for (association = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , association = cdolist_list_var.first()) {
                    if (NIL != Strings.string_equal(ema_name(association), external_module_name, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        return ema_id(association);
                    }
                }
                {
                    SubLObject new_association = make_external_module_association(UNPROVIDED);
                    SubLObject new_guid_as_string = Guids.guid_to_string(Guids.new_guid());
                    _csetf_ema_id(new_association, new_guid_as_string);
                    _csetf_ema_name(new_association, external_module_name);
                    _csetf_emt_list(table, cons(new_association, table_list));
                    return new_guid_as_string;
                }
            }
        }
    }

    public static final SubLObject declare_cyblack_external_module_table_file() {
        declareFunction("external_module_association_print_function_trampoline", "EXTERNAL-MODULE-ASSOCIATION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("external_module_association_p", "EXTERNAL-MODULE-ASSOCIATION-P", 1, 0, false);
        new cyblack_external_module_table.$external_module_association_p$UnaryFunction();
        declareFunction("ema_id", "EMA-ID", 1, 0, false);
        declareFunction("ema_name", "EMA-NAME", 1, 0, false);
        declareFunction("_csetf_ema_id", "_CSETF-EMA-ID", 2, 0, false);
        declareFunction("_csetf_ema_name", "_CSETF-EMA-NAME", 2, 0, false);
        declareFunction("make_external_module_association", "MAKE-EXTERNAL-MODULE-ASSOCIATION", 0, 1, false);
        declareFunction("external_module_table_print_function_trampoline", "EXTERNAL-MODULE-TABLE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("external_module_table_p", "EXTERNAL-MODULE-TABLE-P", 1, 0, false);
        new cyblack_external_module_table.$external_module_table_p$UnaryFunction();
        declareFunction("emt_application", "EMT-APPLICATION", 1, 0, false);
        declareFunction("emt_list", "EMT-LIST", 1, 0, false);
        declareFunction("_csetf_emt_application", "_CSETF-EMT-APPLICATION", 2, 0, false);
        declareFunction("_csetf_emt_list", "_CSETF-EMT-LIST", 2, 0, false);
        declareFunction("make_external_module_table", "MAKE-EXTERNAL-MODULE-TABLE", 0, 1, false);
        declareFunction("new_external_module_table", "NEW-EXTERNAL-MODULE-TABLE", 1, 0, false);
        declareFunction("get_external_module_id", "GET-EXTERNAL-MODULE-ID", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_cyblack_external_module_table_file() {
        defconstant("*DTP-EXTERNAL-MODULE-ASSOCIATION*", EXTERNAL_MODULE_ASSOCIATION);
        defconstant("*DTP-EXTERNAL-MODULE-TABLE*", EXTERNAL_MODULE_TABLE);
        return NIL;
    }

    public static final SubLObject setup_cyblack_external_module_table_file() {
                register_method($print_object_method_table$.getGlobalValue(), $dtp_external_module_association$.getGlobalValue(), symbol_function(EXTERNAL_MODULE_ASSOCIATION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(EMA_ID, _CSETF_EMA_ID);
        def_csetf(EMA_NAME, _CSETF_EMA_NAME);
        identity(EXTERNAL_MODULE_ASSOCIATION);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_external_module_table$.getGlobalValue(), symbol_function(EXTERNAL_MODULE_TABLE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(EMT_APPLICATION, _CSETF_EMT_APPLICATION);
        def_csetf(EMT_LIST, _CSETF_EMT_LIST);
        identity(EXTERNAL_MODULE_TABLE);
        return NIL;
    }

    // // Internal Constants
    private static final SubLSymbol EXTERNAL_MODULE_ASSOCIATION = makeSymbol("EXTERNAL-MODULE-ASSOCIATION");

    private static final SubLSymbol EXTERNAL_MODULE_ASSOCIATION_P = makeSymbol("EXTERNAL-MODULE-ASSOCIATION-P");

    static private final SubLList $list_alt2 = list(makeSymbol("ID"), makeSymbol("NAME"));

    static private final SubLList $list_alt3 = list(makeKeyword("ID"), $NAME);

    static private final SubLList $list_alt4 = list(makeSymbol("EMA-ID"), makeSymbol("EMA-NAME"));

    static private final SubLList $list_alt5 = list(makeSymbol("_CSETF-EMA-ID"), makeSymbol("_CSETF-EMA-NAME"));



    private static final SubLSymbol EXTERNAL_MODULE_ASSOCIATION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EXTERNAL-MODULE-ASSOCIATION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol EMA_ID = makeSymbol("EMA-ID");

    public static final SubLSymbol _CSETF_EMA_ID = makeSymbol("_CSETF-EMA-ID");

    private static final SubLSymbol EMA_NAME = makeSymbol("EMA-NAME");

    public static final SubLSymbol _CSETF_EMA_NAME = makeSymbol("_CSETF-EMA-NAME");





    static private final SubLString $str_alt14$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol EXTERNAL_MODULE_TABLE_P = makeSymbol("EXTERNAL-MODULE-TABLE-P");

    static private final SubLList $list_alt17 = list(makeSymbol("APPLICATION"), makeSymbol("LIST"));

    static private final SubLList $list_alt18 = list(makeKeyword("APPLICATION"), $LIST);

    static private final SubLList $list_alt19 = list(makeSymbol("EMT-APPLICATION"), makeSymbol("EMT-LIST"));

    static private final SubLList $list_alt20 = list(makeSymbol("_CSETF-EMT-APPLICATION"), makeSymbol("_CSETF-EMT-LIST"));

    private static final SubLSymbol EXTERNAL_MODULE_TABLE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("EXTERNAL-MODULE-TABLE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLSymbol EMT_APPLICATION = makeSymbol("EMT-APPLICATION");

    public static final SubLSymbol _CSETF_EMT_APPLICATION = makeSymbol("_CSETF-EMT-APPLICATION");

    private static final SubLSymbol EMT_LIST = makeSymbol("EMT-LIST");

    public static final SubLSymbol _CSETF_EMT_LIST = makeSymbol("_CSETF-EMT-LIST");





    static private final SubLString $str_alt28$NEW_EXTERNAL_MODULE_TABLE___S_is_ = makeString("NEW-EXTERNAL-MODULE-TABLE: ~S is not an instance of CYBLACK-APPLICATION.");

    static private final SubLString $str_alt29$GET_EXTERNAL_MODULE_ID___S_is_not = makeString("GET-EXTERNAL-MODULE-ID: ~S is not an instance of EXTERNAL-MODULE-TABLE.");

    static private final SubLString $str_alt30$GET_EXTERNAL_MODULE_ID___S_is_not = makeString("GET-EXTERNAL-MODULE-ID: ~S is not a string.");

    // // Initializers
    public void declareFunctions() {
        declare_cyblack_external_module_table_file();
    }

    public void initializeVariables() {
        init_cyblack_external_module_table_file();
    }

    public void runTopLevelForms() {
        setup_cyblack_external_module_table_file();
    }
}

