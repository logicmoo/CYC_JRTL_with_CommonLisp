package com.cyc.cycjava.cycl.sksi.corba;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class corba_storage_module_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.corba.corba_storage_module_macros";
    public static final String myFingerPrint = "79f0e2409719c2396b4a6883ad6a91e643dfd95055d86b1048a5d12c612c43c4";
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CONTENT_MT;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLSymbol $sym3$SKS_GET_CONTENT_MT;
    private static final SubLSymbol $sym4$HL_STORAGE_MODULE;
    private static final SubLSymbol $kw5$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE;
    private static final SubLSymbol $sym6$LIST;
    private static final SubLSymbol $kw7$PRETTY_NAME;
    private static final SubLString $str8$__corbaSetObjectMethodArgs;
    private static final SubLSymbol $kw9$ARGUMENT_TYPE;
    private static final SubLSymbol $kw10$ARGUMENT;
    private static final SubLSymbol $kw11$PREDICATE;
    private static final SubLObject $const12$corbaSetObjectMethodArgs;
    private static final SubLSymbol $kw13$APPLICABILITY;
    private static final SubLList $list14;
    private static final SubLSymbol $kw15$INCOMPLETENESS;
    private static final SubLList $list16;
    private static final SubLSymbol $kw17$ADD;
    private static final SubLList $list18;
    private static final SubLSymbol $kw19$REQUIRED_MT;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLSymbol $sym22$NOTE_SKSI_CORBA_MODULE;
    private static final SubLSymbol $kw23$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE;
    private static final SubLString $str24$__corbaSetObjectFieldArg;
    private static final SubLObject $const25$corbaSetObjectFieldArg;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLSymbol $kw28$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE;
    private static final SubLString $str29$__corbaSetClassMethodArgs;
    private static final SubLObject $const30$corbaSetClassMethodArgs;
    private static final SubLList $list31;
    private static final SubLList $list32;
    private static final SubLSymbol $kw33$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE;
    private static final SubLString $str34$__corbaSetClassFieldArg;
    private static final SubLObject $const35$corbaSetClassFieldArg;
    private static final SubLList $list36;
    private static final SubLList $list37;
    private static final SubLSymbol $sym38$PRED;
    private static final SubLSymbol $sym39$CDOLIST;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$CORBA_SKS_UNDECLARE_STORAGE_MODULE;
    private static final SubLList $list42;
    private static final SubLSymbol $sym43$NAME;
    private static final SubLSymbol $sym44$MAKE_CORBA_MODULE_NAME_KEYWORD;
    private static final SubLSymbol $sym45$UNDECLARE_HL_STORAGE_MODULE;
    private static final SubLSymbol $sym46$UN_NOTE_SKSI_CORBA_MODULE;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-macros.lisp", position = 855L)
    public static SubLObject corba_sks_declare_storage_module_suite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = (SubLObject)corba_storage_module_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_storage_module_macros.$list0);
        sks = current.first();
        current = current.rest();
        if (corba_storage_module_macros.NIL == current) {
            final SubLObject content_mt = (SubLObject)corba_storage_module_macros.$sym1$CONTENT_MT;
            return (SubLObject)ConsesLow.list(new SubLObject[] { corba_storage_module_macros.$sym2$CLET, ConsesLow.list((SubLObject)ConsesLow.list(content_mt, (SubLObject)ConsesLow.list((SubLObject)corba_storage_module_macros.$sym3$SKS_GET_CONTENT_MT, sks))), ConsesLow.list((SubLObject)corba_storage_module_macros.$sym4$HL_STORAGE_MODULE, (SubLObject)corba_storage_module_macros.$kw5$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_storage_module_macros.$sym6$LIST, corba_storage_module_macros.$kw7$PRETTY_NAME, corba_storage_module_macros.$str8$__corbaSetObjectMethodArgs, corba_storage_module_macros.$kw9$ARGUMENT_TYPE, corba_storage_module_macros.$kw10$ARGUMENT, corba_storage_module_macros.$kw11$PREDICATE, corba_storage_module_macros.$const12$corbaSetObjectMethodArgs, corba_storage_module_macros.$kw13$APPLICABILITY, corba_storage_module_macros.$list14, corba_storage_module_macros.$kw15$INCOMPLETENESS, corba_storage_module_macros.$list16, corba_storage_module_macros.$kw17$ADD, corba_storage_module_macros.$list18, corba_storage_module_macros.$kw19$REQUIRED_MT, content_mt })), corba_storage_module_macros.$list20, corba_storage_module_macros.$list21, ConsesLow.list((SubLObject)corba_storage_module_macros.$sym22$NOTE_SKSI_CORBA_MODULE, (SubLObject)corba_storage_module_macros.$kw5$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE, content_mt), ConsesLow.list((SubLObject)corba_storage_module_macros.$sym4$HL_STORAGE_MODULE, (SubLObject)corba_storage_module_macros.$kw23$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_storage_module_macros.$sym6$LIST, corba_storage_module_macros.$kw7$PRETTY_NAME, corba_storage_module_macros.$str24$__corbaSetObjectFieldArg, corba_storage_module_macros.$kw9$ARGUMENT_TYPE, corba_storage_module_macros.$kw10$ARGUMENT, corba_storage_module_macros.$kw11$PREDICATE, corba_storage_module_macros.$const25$corbaSetObjectFieldArg, corba_storage_module_macros.$kw13$APPLICABILITY, corba_storage_module_macros.$list26, corba_storage_module_macros.$kw15$INCOMPLETENESS, corba_storage_module_macros.$list16, corba_storage_module_macros.$kw17$ADD, corba_storage_module_macros.$list18, corba_storage_module_macros.$kw19$REQUIRED_MT, content_mt })), corba_storage_module_macros.$list27, corba_storage_module_macros.$list21, ConsesLow.list((SubLObject)corba_storage_module_macros.$sym22$NOTE_SKSI_CORBA_MODULE, (SubLObject)corba_storage_module_macros.$kw23$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE, content_mt), ConsesLow.list((SubLObject)corba_storage_module_macros.$sym4$HL_STORAGE_MODULE, (SubLObject)corba_storage_module_macros.$kw28$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_storage_module_macros.$sym6$LIST, corba_storage_module_macros.$kw7$PRETTY_NAME, corba_storage_module_macros.$str29$__corbaSetClassMethodArgs, corba_storage_module_macros.$kw9$ARGUMENT_TYPE, corba_storage_module_macros.$kw10$ARGUMENT, corba_storage_module_macros.$kw11$PREDICATE, corba_storage_module_macros.$const30$corbaSetClassMethodArgs, corba_storage_module_macros.$kw13$APPLICABILITY, corba_storage_module_macros.$list31, corba_storage_module_macros.$kw15$INCOMPLETENESS, corba_storage_module_macros.$list16, corba_storage_module_macros.$kw17$ADD, corba_storage_module_macros.$list18, corba_storage_module_macros.$kw19$REQUIRED_MT, content_mt })), corba_storage_module_macros.$list32, corba_storage_module_macros.$list21, ConsesLow.list((SubLObject)corba_storage_module_macros.$sym22$NOTE_SKSI_CORBA_MODULE, (SubLObject)corba_storage_module_macros.$kw28$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE, content_mt), ConsesLow.list((SubLObject)corba_storage_module_macros.$sym4$HL_STORAGE_MODULE, (SubLObject)corba_storage_module_macros.$kw33$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, (SubLObject)ConsesLow.list(new SubLObject[] { corba_storage_module_macros.$sym6$LIST, corba_storage_module_macros.$kw7$PRETTY_NAME, corba_storage_module_macros.$str34$__corbaSetClassFieldArg, corba_storage_module_macros.$kw9$ARGUMENT_TYPE, corba_storage_module_macros.$kw10$ARGUMENT, corba_storage_module_macros.$kw11$PREDICATE, corba_storage_module_macros.$const35$corbaSetClassFieldArg, corba_storage_module_macros.$kw13$APPLICABILITY, corba_storage_module_macros.$list36, corba_storage_module_macros.$kw15$INCOMPLETENESS, corba_storage_module_macros.$list16, corba_storage_module_macros.$kw17$ADD, corba_storage_module_macros.$list18, corba_storage_module_macros.$kw19$REQUIRED_MT, content_mt })), corba_storage_module_macros.$list37, corba_storage_module_macros.$list21, ConsesLow.list((SubLObject)corba_storage_module_macros.$sym22$NOTE_SKSI_CORBA_MODULE, (SubLObject)corba_storage_module_macros.$kw33$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE, content_mt) });
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)corba_storage_module_macros.$list0);
        return (SubLObject)corba_storage_module_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-macros.lisp", position = 4555L)
    public static SubLObject corba_sks_undeclare_storage_module_suite(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = (SubLObject)corba_storage_module_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_storage_module_macros.$list0);
        sks = current.first();
        current = current.rest();
        if (corba_storage_module_macros.NIL == current) {
            final SubLObject pred = (SubLObject)corba_storage_module_macros.$sym38$PRED;
            return (SubLObject)ConsesLow.list((SubLObject)corba_storage_module_macros.$sym39$CDOLIST, reader.bq_cons(pred, (SubLObject)corba_storage_module_macros.$list40), (SubLObject)ConsesLow.list((SubLObject)corba_storage_module_macros.$sym41$CORBA_SKS_UNDECLARE_STORAGE_MODULE, sks, pred));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)corba_storage_module_macros.$list0);
        return (SubLObject)corba_storage_module_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/corba/corba-storage-module-macros.lisp", position = 4763L)
    public static SubLObject corba_sks_undeclare_storage_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject sks = (SubLObject)corba_storage_module_macros.NIL;
        SubLObject pred = (SubLObject)corba_storage_module_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_storage_module_macros.$list42);
        sks = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)corba_storage_module_macros.$list42);
        pred = current.first();
        current = current.rest();
        if (corba_storage_module_macros.NIL == current) {
            final SubLObject name = (SubLObject)corba_storage_module_macros.$sym43$NAME;
            return (SubLObject)ConsesLow.list((SubLObject)corba_storage_module_macros.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(name, (SubLObject)ConsesLow.list((SubLObject)corba_storage_module_macros.$sym44$MAKE_CORBA_MODULE_NAME_KEYWORD, sks, pred))), (SubLObject)ConsesLow.list((SubLObject)corba_storage_module_macros.$sym45$UNDECLARE_HL_STORAGE_MODULE, name), (SubLObject)ConsesLow.list((SubLObject)corba_storage_module_macros.$sym46$UN_NOTE_SKSI_CORBA_MODULE, name));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)corba_storage_module_macros.$list42);
        return (SubLObject)corba_storage_module_macros.NIL;
    }
    
    public static SubLObject declare_corba_storage_module_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.corba.corba_storage_module_macros", "corba_sks_declare_storage_module_suite", "CORBA-SKS-DECLARE-STORAGE-MODULE-SUITE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.corba.corba_storage_module_macros", "corba_sks_undeclare_storage_module_suite", "CORBA-SKS-UNDECLARE-STORAGE-MODULE-SUITE");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.corba.corba_storage_module_macros", "corba_sks_undeclare_storage_module", "CORBA-SKS-UNDECLARE-STORAGE-MODULE");
        return (SubLObject)corba_storage_module_macros.NIL;
    }
    
    public static SubLObject init_corba_storage_module_macros_file() {
        return (SubLObject)corba_storage_module_macros.NIL;
    }
    
    public static SubLObject setup_corba_storage_module_macros_file() {
        return (SubLObject)corba_storage_module_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_corba_storage_module_macros_file();
    }
    
    public void initializeVariables() {
        init_corba_storage_module_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_corba_storage_module_macros_file();
    }
    
    static {
        me = (SubLFile)new corba_storage_module_macros();
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS"));
        $sym1$CONTENT_MT = SubLObjectFactory.makeUninternedSymbol("CONTENT-MT");
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym3$SKS_GET_CONTENT_MT = SubLObjectFactory.makeSymbol("SKS-GET-CONTENT-MT");
        $sym4$HL_STORAGE_MODULE = SubLObjectFactory.makeSymbol("HL-STORAGE-MODULE");
        $kw5$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_METHOD_ARGS_STORAGE = SubLObjectFactory.makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-METHOD-ARGS-STORAGE");
        $sym6$LIST = SubLObjectFactory.makeSymbol("LIST");
        $kw7$PRETTY_NAME = SubLObjectFactory.makeKeyword("PRETTY-NAME");
        $str8$__corbaSetObjectMethodArgs = SubLObjectFactory.makeString("#$corbaSetObjectMethodArgs");
        $kw9$ARGUMENT_TYPE = SubLObjectFactory.makeKeyword("ARGUMENT-TYPE");
        $kw10$ARGUMENT = SubLObjectFactory.makeKeyword("ARGUMENT");
        $kw11$PREDICATE = SubLObjectFactory.makeKeyword("PREDICATE");
        $const12$corbaSetObjectMethodArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetObjectMethodArgs"));
        $kw13$APPLICABILITY = SubLObjectFactory.makeKeyword("APPLICABILITY");
        $list14 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CORBA-SET-OBJECT-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?"));
        $kw15$INCOMPLETENESS = SubLObjectFactory.makeKeyword("INCOMPLETENESS");
        $list16 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CORBA-SET-HL-STORAGE-MODULE-INCOMPLETENESS"));
        $kw17$ADD = SubLObjectFactory.makeKeyword("ADD");
        $list18 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CORBA-SET-HL-STORAGE-MODULE-ASSERT"));
        $kw19$REQUIRED_MT = SubLObjectFactory.makeKeyword("REQUIRED-MT");
        $list20 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetObjectMethodArgs")));
        $list21 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REGISTER-SOLELY-SPECIFIC-REMOVAL-MODULE-PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetObjectMethodArgs")));
        $sym22$NOTE_SKSI_CORBA_MODULE = SubLObjectFactory.makeSymbol("NOTE-SKSI-CORBA-MODULE");
        $kw23$CORBA_H_P_A_C_K_S_CORBA_SET_OBJECT_FIELD_ARG_STORAGE = SubLObjectFactory.makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-OBJECT-FIELD-ARG-STORAGE");
        $str24$__corbaSetObjectFieldArg = SubLObjectFactory.makeString("#$corbaSetObjectFieldArg");
        $const25$corbaSetObjectFieldArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetObjectFieldArg"));
        $list26 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CORBA-SET-OBJECT-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?"));
        $list27 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetObjectFieldArg")));
        $kw28$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_METHOD_ARGS_STORAGE = SubLObjectFactory.makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-METHOD-ARGS-STORAGE");
        $str29$__corbaSetClassMethodArgs = SubLObjectFactory.makeString("#$corbaSetClassMethodArgs");
        $const30$corbaSetClassMethodArgs = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetClassMethodArgs"));
        $list31 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CORBA-SET-CLASS-METHOD-ARGS-HL-STORAGE-MODULE-APPLICABLE?"));
        $list32 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetClassMethodArgs")));
        $kw33$CORBA_H_P_A_C_K_S_CORBA_SET_CLASS_FIELD_ARG_STORAGE = SubLObjectFactory.makeKeyword("CORBA-H-P-A-C-K-S-CORBA-SET-CLASS-FIELD-ARG-STORAGE");
        $str34$__corbaSetClassFieldArg = SubLObjectFactory.makeString("#$corbaSetClassFieldArg");
        $const35$corbaSetClassFieldArg = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetClassFieldArg"));
        $list36 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("QUOTE"), (SubLObject)SubLObjectFactory.makeSymbol("CORBA-SET-CLASS-FIELD-ARG-HL-STORAGE-MODULE-APPLICABLE?"));
        $list37 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("REGISTER-SOLELY-SPECIFIC-HL-STORAGE-MODULE-PREDICATE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("corbaSetClassFieldArg")));
        $sym38$PRED = SubLObjectFactory.makeUninternedSymbol("PRED");
        $sym39$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list40 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-CORBA-STORAGE-PREDICATES")));
        $sym41$CORBA_SKS_UNDECLARE_STORAGE_MODULE = SubLObjectFactory.makeSymbol("CORBA-SKS-UNDECLARE-STORAGE-MODULE");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SKS"), (SubLObject)SubLObjectFactory.makeSymbol("PRED"));
        $sym43$NAME = SubLObjectFactory.makeUninternedSymbol("NAME");
        $sym44$MAKE_CORBA_MODULE_NAME_KEYWORD = SubLObjectFactory.makeSymbol("MAKE-CORBA-MODULE-NAME-KEYWORD");
        $sym45$UNDECLARE_HL_STORAGE_MODULE = SubLObjectFactory.makeSymbol("UNDECLARE-HL-STORAGE-MODULE");
        $sym46$UN_NOTE_SKSI_CORBA_MODULE = SubLObjectFactory.makeSymbol("UN-NOTE-SKSI-CORBA-MODULE");
    }
}

/*

	Total time: 31 ms
	
*/