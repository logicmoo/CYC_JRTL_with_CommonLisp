/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.cycjava.cycl.V10;
import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 *  module:      CORBA-STORAGE-MODULE-MACROS
 *  source file: /cyc/top/cycl/sksi/corba/corba-storage-module-macros.lisp
 *  created:     2019/07/03 17:38:36
 */
public final class corba_storage_module_macros extends SubLTranslatedFile implements V10 {
    // // Constructor
    private corba_storage_module_macros() {
    }

    public static final SubLFile me = new corba_storage_module_macros();

    public static final String myName = "com.cyc.cycjava_2.cycl.sksi.corba.corba_storage_module_macros";

    // // Definitions
    public static final SubLObject corba_sks_declare_storage_module_suite(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sks = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            sks = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject content_mt = $sym1$CONTENT_MT;
                    return list(new SubLObject[]{ CLET, list(list(content_mt, list(SKS_GET_CONTENT_MT, sks))), list(HL_STORAGE_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, list(new SubLObject[]{ LIST, $PRETTY_NAME, $str_alt8$__corbaSetObjectMethodArgs, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetObjectMethodArgs, $APPLICABILITY, $list_alt14, $INCOMPLETENESS, $list_alt16, $ADD, $list_alt18, $REQUIRED_MT, content_mt })), $list_alt20, $list_alt21, list(NOTE_SKSI_CORBA_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, content_mt), list(HL_STORAGE_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, list(new SubLObject[]{ LIST, $PRETTY_NAME, $str_alt24$__corbaSetObjectFieldArg, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetObjectFieldArg, $APPLICABILITY, $list_alt26, $INCOMPLETENESS, $list_alt16, $ADD, $list_alt18, $REQUIRED_MT, content_mt })), $list_alt27, $list_alt21, list(NOTE_SKSI_CORBA_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, content_mt), list(HL_STORAGE_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, list(new SubLObject[]{ LIST, $PRETTY_NAME, $str_alt29$__corbaSetClassMethodArgs, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetClassMethodArgs, $APPLICABILITY, $list_alt31, $INCOMPLETENESS, $list_alt16, $ADD, $list_alt18, $REQUIRED_MT, content_mt })), $list_alt32, $list_alt21, list(NOTE_SKSI_CORBA_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, content_mt), list(HL_STORAGE_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, list(new SubLObject[]{ LIST, $PRETTY_NAME, $str_alt34$__corbaSetClassFieldArg, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetClassFieldArg, $APPLICABILITY, $list_alt36, $INCOMPLETENESS, $list_alt16, $ADD, $list_alt18, $REQUIRED_MT, content_mt })), $list_alt37, $list_alt21, list(NOTE_SKSI_CORBA_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, content_mt) });
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    public static final SubLObject corba_sks_undeclare_storage_module_suite(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sks = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt0);
            sks = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pred = $sym38$PRED;
                    return list(CDOLIST, bq_cons(pred, $list_alt40), list(CORBA_SKS_UNDECLARE_STORAGE_MODULE, sks, pred));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt0);
            }
        }
        return NIL;
    }

    public static final SubLObject corba_sks_undeclare_storage_module(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject sks = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt42);
            sks = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt42);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject name = $sym43$NAME;
                    return list(CLET, list(list(name, list(MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred))), list(UNDECLARE_HL_STORAGE_MODULE, name), list(UN_NOTE_SKSI_CORBA_MODULE, name));
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt42);
            }
        }
        return NIL;
    }

    public static final SubLObject declare_corba_storage_module_macros_file() {
        declareMacro("corba_sks_declare_storage_module_suite", "CORBA-SKS-DECLARE-STORAGE-MODULE-SUITE");
        declareMacro("corba_sks_undeclare_storage_module_suite", "CORBA-SKS-UNDECLARE-STORAGE-MODULE-SUITE");
        declareMacro("corba_sks_undeclare_storage_module", "CORBA-SKS-UNDECLARE-STORAGE-MODULE");
        return NIL;
    }

    public static final SubLObject init_corba_storage_module_macros_file() {
        return NIL;
    }

    public static final SubLObject setup_corba_storage_module_macros_file() {
                return NIL;
    }

    // // Internal Constants
    static private final SubLList $list_alt0 = list(makeSymbol("SKS"));

    static private final SubLSymbol $sym1$CONTENT_MT = makeUninternedSymbol("CONTENT-MT");



    private static final SubLSymbol SKS_GET_CONTENT_MT = makeSymbol("SKS-GET-CONTENT-MT");

    private static final SubLSymbol HL_STORAGE_MODULE = makeSymbol("HL-STORAGE-MODULE");

    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-METHOD-ARGS-STORAGE");





    static private final SubLString $str_alt8$__corbaSetObjectMethodArgs = makeString("#$corbaSetObjectMethodArgs");







    public static final SubLObject $$corbaSetObjectMethodArgs = constant_handles.reader_make_constant_shell(makeString("corbaSetObjectMethodArgs"));



    static private final SubLList $list_alt14 = list(QUOTE, makeSymbol("CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?"));



    static private final SubLList $list_alt16 = list(QUOTE, makeSymbol("CORBA-SET-HL-STORAGE-MODULE-INCOMPLETENESS"));



    static private final SubLList $list_alt18 = list(QUOTE, makeSymbol("CORBA-SET-HL-STORAGE-MODULE-ASSERT"));



    static private final SubLList $list_alt20 = list(makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), constant_handles.reader_make_constant_shell(makeString("corbaSetObjectMethodArgs")));

    static private final SubLList $list_alt21 = list(makeSymbol("REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE"), constant_handles.reader_make_constant_shell(makeString("corbaSetObjectMethodArgs")));

    private static final SubLSymbol NOTE_SKSI_CORBA_MODULE = makeSymbol("NOTE-SKSI-CORBA-MODULE");

    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-FIELD-ARG-STORAGE");

    static private final SubLString $str_alt24$__corbaSetObjectFieldArg = makeString("#$corbaSetObjectFieldArg");

    public static final SubLObject $$corbaSetObjectFieldArg = constant_handles.reader_make_constant_shell(makeString("corbaSetObjectFieldArg"));

    static private final SubLList $list_alt26 = list(QUOTE, makeSymbol("CORBA-SET-OBJECT-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?"));

    static private final SubLList $list_alt27 = list(makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), constant_handles.reader_make_constant_shell(makeString("corbaSetObjectFieldArg")));

    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-METHOD-ARGS-STORAGE");

    static private final SubLString $str_alt29$__corbaSetClassMethodArgs = makeString("#$corbaSetClassMethodArgs");

    public static final SubLObject $$corbaSetClassMethodArgs = constant_handles.reader_make_constant_shell(makeString("corbaSetClassMethodArgs"));

    static private final SubLList $list_alt31 = list(QUOTE, makeSymbol("CORBA-SET-CLASS-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?"));

    static private final SubLList $list_alt32 = list(makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), constant_handles.reader_make_constant_shell(makeString("corbaSetClassMethodArgs")));

    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-FIELD-ARG-STORAGE");

    static private final SubLString $str_alt34$__corbaSetClassFieldArg = makeString("#$corbaSetClassFieldArg");

    public static final SubLObject $$corbaSetClassFieldArg = constant_handles.reader_make_constant_shell(makeString("corbaSetClassFieldArg"));

    static private final SubLList $list_alt36 = list(QUOTE, makeSymbol("CORBA-SET-CLASS-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?"));

    static private final SubLList $list_alt37 = list(makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), constant_handles.reader_make_constant_shell(makeString("corbaSetClassFieldArg")));

    static private final SubLSymbol $sym38$PRED = makeUninternedSymbol("PRED");



    static private final SubLList $list_alt40 = list(list(makeSymbol("GET-CORBA-STORAGE-PREDICATES")));

    private static final SubLSymbol CORBA_SKS_UNDECLARE_STORAGE_MODULE = makeSymbol("CORBA-SKS-UNDECLARE-STORAGE-MODULE");

    static private final SubLList $list_alt42 = list(makeSymbol("SKS"), makeSymbol("PRED"));

    static private final SubLSymbol $sym43$NAME = makeUninternedSymbol("NAME");

    private static final SubLSymbol MAKE_CORBA_MODULE_NAME_KEYWORD = makeSymbol("MAKE-CORBA-MODULE-NAME-KEYWORD");

    private static final SubLSymbol UNDECLARE_HL_STORAGE_MODULE = makeSymbol("UNDECLARE-HL-STORAGE-MODULE");

    private static final SubLSymbol UN_NOTE_SKSI_CORBA_MODULE = makeSymbol("UN-NOTE-SKSI-CORBA-MODULE");

    // // Initializers
    @Override
    public void declareFunctions() {
        declare_corba_storage_module_macros_file();
    }

    @Override
    public void initializeVariables() {
        init_corba_storage_module_macros_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_corba_storage_module_macros_file();
    }
}

