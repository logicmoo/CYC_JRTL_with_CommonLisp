package com.cyc.cycjava.cycl.sksi.corba;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class corba_storage_module_macros extends SubLTranslatedFile {
    public static final SubLFile me = new corba_storage_module_macros();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_storage_module_macros";

    public static final String myFingerPrint = "79f0e2409719c2396b4a6883ad6a91e643dfd95055d86b1048a5d12c612c43c4";

    // Internal Constants
    public static final SubLList $list0 = list(makeSymbol("SKS"));

    public static final SubLSymbol $sym1$CONTENT_MT = makeUninternedSymbol("CONTENT-MT");



    public static final SubLSymbol SKS_GET_CONTENT_MT = makeSymbol("SKS-GET-CONTENT-MT");

    public static final SubLSymbol HL_STORAGE_MODULE = makeSymbol("HL-STORAGE-MODULE");

    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-METHOD-ARGS-STORAGE");





    public static final SubLString $str8$__corbaSetObjectMethodArgs = makeString("#$corbaSetObjectMethodArgs");







    private static final SubLObject $$corbaSetObjectMethodArgs = reader_make_constant_shell(makeString("corbaSetObjectMethodArgs"));



    public static final SubLList $list14 = list(makeSymbol("QUOTE"), makeSymbol("CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?"));



    public static final SubLList $list16 = list(makeSymbol("QUOTE"), makeSymbol("CORBA-SET-HL-STORAGE-MODULE-INCOMPLETENESS"));



    public static final SubLList $list18 = list(makeSymbol("QUOTE"), makeSymbol("CORBA-SET-HL-STORAGE-MODULE-ASSERT"));



    public static final SubLList $list20 = list(makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), reader_make_constant_shell(makeString("corbaSetObjectMethodArgs")));

    public static final SubLList $list21 = list(makeSymbol("REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE"), reader_make_constant_shell(makeString("corbaSetObjectMethodArgs")));

    public static final SubLSymbol NOTE_SKSI_CORBA_MODULE = makeSymbol("NOTE-SKSI-CORBA-MODULE");

    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-FIELD-ARG-STORAGE");

    public static final SubLString $str24$__corbaSetObjectFieldArg = makeString("#$corbaSetObjectFieldArg");

    private static final SubLObject $$corbaSetObjectFieldArg = reader_make_constant_shell(makeString("corbaSetObjectFieldArg"));

    public static final SubLList $list26 = list(makeSymbol("QUOTE"), makeSymbol("CORBA-SET-OBJECT-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?"));

    public static final SubLList $list27 = list(makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), reader_make_constant_shell(makeString("corbaSetObjectFieldArg")));

    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-METHOD-ARGS-STORAGE");

    public static final SubLString $str29$__corbaSetClassMethodArgs = makeString("#$corbaSetClassMethodArgs");

    private static final SubLObject $$corbaSetClassMethodArgs = reader_make_constant_shell(makeString("corbaSetClassMethodArgs"));

    public static final SubLList $list31 = list(makeSymbol("QUOTE"), makeSymbol("CORBA-SET-CLASS-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?"));

    public static final SubLList $list32 = list(makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), reader_make_constant_shell(makeString("corbaSetClassMethodArgs")));

    private static final SubLSymbol $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE = makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-FIELD-ARG-STORAGE");

    public static final SubLString $str34$__corbaSetClassFieldArg = makeString("#$corbaSetClassFieldArg");

    private static final SubLObject $$corbaSetClassFieldArg = reader_make_constant_shell(makeString("corbaSetClassFieldArg"));

    public static final SubLList $list36 = list(makeSymbol("QUOTE"), makeSymbol("CORBA-SET-CLASS-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?"));

    public static final SubLList $list37 = list(makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), reader_make_constant_shell(makeString("corbaSetClassFieldArg")));

    public static final SubLSymbol $sym38$PRED = makeUninternedSymbol("PRED");



    public static final SubLList $list40 = list(list(makeSymbol("GET-CORBA-STORAGE-PREDICATES")));

    public static final SubLSymbol CORBA_SKS_UNDECLARE_STORAGE_MODULE = makeSymbol("CORBA-SKS-UNDECLARE-STORAGE-MODULE");

    public static final SubLList $list42 = list(makeSymbol("SKS"), makeSymbol("PRED"));

    public static final SubLSymbol $sym43$NAME = makeUninternedSymbol("NAME");

    public static final SubLSymbol MAKE_CORBA_MODULE_NAME_KEYWORD = makeSymbol("MAKE-CORBA-MODULE-NAME-KEYWORD");

    public static final SubLSymbol UNDECLARE_HL_STORAGE_MODULE = makeSymbol("UNDECLARE-HL-STORAGE-MODULE");

    public static final SubLSymbol UN_NOTE_SKSI_CORBA_MODULE = makeSymbol("UN-NOTE-SKSI-CORBA-MODULE");

    public static SubLObject corba_sks_declare_storage_module_suite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        sks = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject content_mt = $sym1$CONTENT_MT;
            return list(new SubLObject[]{ CLET, list(list(content_mt, list(SKS_GET_CONTENT_MT, sks))), list(HL_STORAGE_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, list(new SubLObject[]{ LIST, $PRETTY_NAME, $str8$__corbaSetObjectMethodArgs, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetObjectMethodArgs, $APPLICABILITY, $list14, $INCOMPLETENESS, $list16, $ADD, $list18, $REQUIRED_MT, content_mt })), $list20, $list21, list(NOTE_SKSI_CORBA_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, content_mt), list(HL_STORAGE_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, list(new SubLObject[]{ LIST, $PRETTY_NAME, $str24$__corbaSetObjectFieldArg, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetObjectFieldArg, $APPLICABILITY, $list26, $INCOMPLETENESS, $list16, $ADD, $list18, $REQUIRED_MT, content_mt })), $list27, $list21, list(NOTE_SKSI_CORBA_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, content_mt), list(HL_STORAGE_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, list(new SubLObject[]{ LIST, $PRETTY_NAME, $str29$__corbaSetClassMethodArgs, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetClassMethodArgs, $APPLICABILITY, $list31, $INCOMPLETENESS, $list16, $ADD, $list18, $REQUIRED_MT, content_mt })), $list32, $list21, list(NOTE_SKSI_CORBA_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, content_mt), list(HL_STORAGE_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, list(new SubLObject[]{ LIST, $PRETTY_NAME, $str34$__corbaSetClassFieldArg, $ARGUMENT_TYPE, $ARGUMENT, $PREDICATE, $$corbaSetClassFieldArg, $APPLICABILITY, $list36, $INCOMPLETENESS, $list16, $ADD, $list18, $REQUIRED_MT, content_mt })), $list37, $list21, list(NOTE_SKSI_CORBA_MODULE, $CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, content_mt) });
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject corba_sks_undeclare_storage_module_suite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        sks = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pred = $sym38$PRED;
            return list(CDOLIST, bq_cons(pred, $list40), list(CORBA_SKS_UNDECLARE_STORAGE_MODULE, sks, pred));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject corba_sks_undeclare_storage_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(current, datum, $list42);
        sks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject name = $sym43$NAME;
            return list(CLET, list(list(name, list(MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred))), list(UNDECLARE_HL_STORAGE_MODULE, name), list(UN_NOTE_SKSI_CORBA_MODULE, name));
        }
        cdestructuring_bind_error(datum, $list42);
        return NIL;
    }

    public static SubLObject declare_corba_storage_module_macros_file() {
        declareMacro(me, "corba_sks_declare_storage_module_suite", "CORBA-SKS-DECLARE-STORAGE-MODULE-SUITE");
        declareMacro(me, "corba_sks_undeclare_storage_module_suite", "CORBA-SKS-UNDECLARE-STORAGE-MODULE-SUITE");
        declareMacro(me, "corba_sks_undeclare_storage_module", "CORBA-SKS-UNDECLARE-STORAGE-MODULE");
        return NIL;
    }

    public static SubLObject init_corba_storage_module_macros_file() {
        return NIL;
    }

    public static SubLObject setup_corba_storage_module_macros_file() {
        return NIL;
    }

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

/**
 * Total time: 31 ms
 */
