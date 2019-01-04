package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_macros extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_macros";
    public static final String myFingerPrint = "78f3abfc327bfc08533df7d6e0a387867f39cdd51b08dd06f7920f33b1e1ccd8";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 865L)
    public static SubLSymbol $rkf_asserting_tool$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1156L)
    private static SubLSymbol $rkf_paraphrase_methods_to_skip$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1289L)
    public static SubLSymbol $rkf_speaker$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1335L)
    public static SubLSymbol $rkf_addressee$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 2757L)
    public static SubLSymbol $rkf_always_generate_examplesP$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 2901L)
    public static SubLSymbol $rkf_ok_to_generate_examplesP$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLSymbol $sym2$_RKF_ASSERTING_TOOL_;
    private static final SubLList $list3;
    private static final SubLObject $const4$Cyc;
    private static final SubLSymbol $kw5$THE_CYCLIST;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$RKF_SPEAKER;
    private static final SubLSymbol $sym8$WITH_RKF_PARAPHRASE_PARAMETERS;
    private static final SubLSymbol $sym9$RKF_ADDRESSEE;
    private static final SubLSymbol $kw10$NONE;
    private static final SubLSymbol $sym11$RKF_PARAPHRASE_METHODS_TO_SKIP;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$PROMPTER;
    private static final SubLSymbol $sym14$NEW_RKF_SALIENT_DESCRIPTOR_PROMPTER;
    private static final SubLSymbol $sym15$RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT;
    private static final SubLSymbol $sym16$WHILE;
    private static final SubLSymbol $sym17$RKF_SALIENT_DESCRIPTOR_PROMPT_P;
    private static final SubLSymbol $sym18$CSETQ;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1014L)
    public static SubLObject rkf_with_asserting_tool_cycl(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_macros.$list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tool_cycl = (SubLObject)rkf_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_macros.$list0);
        tool_cycl = current.first();
        current = current.rest();
        if (rkf_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)rkf_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_macros.$sym2$_RKF_ASSERTING_TOOL_, tool_cycl)), ConsesLow.append(body, (SubLObject)rkf_macros.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_macros.$list0);
        return (SubLObject)rkf_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1389L)
    public static SubLObject with_rkf_paraphrase_parameters(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_macros.$sym1$CLET, (SubLObject)rkf_macros.$list6, ConsesLow.append(body, (SubLObject)rkf_macros.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 1899L)
    public static SubLObject rkf_speaker() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_macros.$rkf_speaker$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 2001L)
    public static SubLObject rkf_addressee() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = rkf_macros.$rkf_addressee$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)rkf_macros.$kw10$NONE)) {
            return (SubLObject)rkf_macros.NIL;
        }
        if (pcase_var.eql((SubLObject)rkf_macros.$kw5$THE_CYCLIST)) {
            return operation_communication.the_cyclist();
        }
        return rkf_macros.$rkf_addressee$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 2208L)
    public static SubLObject rkf_paraphrase_methods_to_skip() {
        return rkf_macros.$rkf_paraphrase_methods_to_skip$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 2348L)
    public static SubLObject do_rkf_salient_descriptor_prompts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_macros.$list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject prompt = (SubLObject)rkf_macros.NIL;
        SubLObject seed_term = (SubLObject)rkf_macros.NIL;
        SubLObject mt = (SubLObject)rkf_macros.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_macros.$list12);
        prompt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_macros.$list12);
        seed_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_macros.$list12);
        mt = current.first();
        current = current.rest();
        if (rkf_macros.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            final SubLObject prompter = (SubLObject)rkf_macros.$sym13$PROMPTER;
            return (SubLObject)ConsesLow.list((SubLObject)rkf_macros.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(prompter, (SubLObject)ConsesLow.list((SubLObject)rkf_macros.$sym14$NEW_RKF_SALIENT_DESCRIPTOR_PROMPTER, seed_term, mt)), (SubLObject)ConsesLow.list(prompt, (SubLObject)ConsesLow.list((SubLObject)rkf_macros.$sym15$RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT, prompter))), (SubLObject)ConsesLow.listS((SubLObject)rkf_macros.$sym16$WHILE, (SubLObject)ConsesLow.list((SubLObject)rkf_macros.$sym17$RKF_SALIENT_DESCRIPTOR_PROMPT_P, prompt), ConsesLow.append(body, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)rkf_macros.$sym18$CSETQ, prompt, (SubLObject)ConsesLow.list((SubLObject)rkf_macros.$sym15$RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT, prompter))))));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_macros.$list12);
        return (SubLObject)rkf_macros.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-macros.lisp", position = 3029L)
    public static SubLObject rkf_generate_examplesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_macros.NIL != rkf_macros.$rkf_always_generate_examplesP$.getDynamicValue(thread) || rkf_macros.NIL != rkf_macros.$rkf_ok_to_generate_examplesP$.getDynamicValue(thread));
    }
    
    public static SubLObject declare_rkf_macros_file() {
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_macros", "rkf_with_asserting_tool_cycl", "RKF-WITH-ASSERTING-TOOL-CYCL");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_macros", "with_rkf_paraphrase_parameters", "WITH-RKF-PARAPHRASE-PARAMETERS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_macros", "rkf_speaker", "RKF-SPEAKER", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_macros", "rkf_addressee", "RKF-ADDRESSEE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_macros", "rkf_paraphrase_methods_to_skip", "RKF-PARAPHRASE-METHODS-TO-SKIP", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_macros", "do_rkf_salient_descriptor_prompts", "DO-RKF-SALIENT-DESCRIPTOR-PROMPTS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_macros", "rkf_generate_examplesP", "RKF-GENERATE-EXAMPLES?", 0, 0, false);
        return (SubLObject)rkf_macros.NIL;
    }
    
    public static SubLObject init_rkf_macros_file() {
        rkf_macros.$rkf_asserting_tool$ = SubLFiles.defparameter("*RKF-ASSERTING-TOOL*", (SubLObject)rkf_macros.NIL);
        rkf_macros.$rkf_paraphrase_methods_to_skip$ = SubLFiles.defconstant("*RKF-PARAPHRASE-METHODS-TO-SKIP*", (SubLObject)rkf_macros.$list3);
        rkf_macros.$rkf_speaker$ = SubLFiles.defparameter("*RKF-SPEAKER*", rkf_macros.$const4$Cyc);
        rkf_macros.$rkf_addressee$ = SubLFiles.defparameter("*RKF-ADDRESSEE*", (SubLObject)rkf_macros.$kw5$THE_CYCLIST);
        rkf_macros.$rkf_always_generate_examplesP$ = SubLFiles.defparameter("*RKF-ALWAYS-GENERATE-EXAMPLES?*", (SubLObject)rkf_macros.NIL);
        rkf_macros.$rkf_ok_to_generate_examplesP$ = SubLFiles.defparameter("*RKF-OK-TO-GENERATE-EXAMPLES?*", (SubLObject)rkf_macros.NIL);
        return (SubLObject)rkf_macros.NIL;
    }
    
    public static SubLObject setup_rkf_macros_file() {
        access_macros.register_macro_helper((SubLObject)rkf_macros.$sym7$RKF_SPEAKER, (SubLObject)rkf_macros.$sym8$WITH_RKF_PARAPHRASE_PARAMETERS);
        access_macros.register_macro_helper((SubLObject)rkf_macros.$sym9$RKF_ADDRESSEE, (SubLObject)rkf_macros.$sym8$WITH_RKF_PARAPHRASE_PARAMETERS);
        access_macros.register_macro_helper((SubLObject)rkf_macros.$sym11$RKF_PARAPHRASE_METHODS_TO_SKIP, (SubLObject)rkf_macros.$sym8$WITH_RKF_PARAPHRASE_PARAMETERS);
        return (SubLObject)rkf_macros.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_macros_file();
    }
    
    public void initializeVariables() {
        init_rkf_macros_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_macros_file();
    }
    
    static {
        me = (SubLFile)new rkf_macros();
        rkf_macros.$rkf_asserting_tool$ = null;
        rkf_macros.$rkf_paraphrase_methods_to_skip$ = null;
        rkf_macros.$rkf_speaker$ = null;
        rkf_macros.$rkf_addressee$ = null;
        rkf_macros.$rkf_always_generate_examplesP$ = null;
        rkf_macros.$rkf_ok_to_generate_examplesP$ = null;
        $list0 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TOOL-CYCL")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $sym2$_RKF_ASSERTING_TOOL_ = SubLObjectFactory.makeSymbol("*RKF-ASSERTING-TOOL*");
        $list3 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GENITIVE-PARAPHRASE-METHOD"));
        $const4$Cyc = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Cyc"));
        $kw5$THE_CYCLIST = SubLObjectFactory.makeKeyword("THE-CYCLIST");
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-GUESS-NAMES-FOR-UNLEXIFIED-TERMS?*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CNOT"), (SubLObject)SubLObjectFactory.makeSymbol("*RKF-USE-CYCL-FOR-UNLEXIFIED-TERMS?*"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-SEARCH-LIMIT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FIF"), (SubLObject)SubLObjectFactory.makeSymbol("*RKF-USE-GENL-PREDS-FOR-PARAPHRASE?*"), (SubLObject)rkf_macros.TWO_INTEGER, (SubLObject)rkf_macros.ZERO_INTEGER)), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-SPEAKER*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-SPEAKER"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-ADDRESSEE*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-ADDRESSEE"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SELECT-STRING-METHODS-TO-OMIT*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-PARAPHRASE-METHODS-TO-SKIP"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PPH-LINK-ARG0?*"), (SubLObject)rkf_macros.T));
        $sym7$RKF_SPEAKER = SubLObjectFactory.makeSymbol("RKF-SPEAKER");
        $sym8$WITH_RKF_PARAPHRASE_PARAMETERS = SubLObjectFactory.makeSymbol("WITH-RKF-PARAPHRASE-PARAMETERS");
        $sym9$RKF_ADDRESSEE = SubLObjectFactory.makeSymbol("RKF-ADDRESSEE");
        $kw10$NONE = SubLObjectFactory.makeKeyword("NONE");
        $sym11$RKF_PARAPHRASE_METHODS_TO_SKIP = SubLObjectFactory.makeSymbol("RKF-PARAPHRASE-METHODS-TO-SKIP");
        $list12 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROMPT"), (SubLObject)SubLObjectFactory.makeSymbol("SEED-TERM"), (SubLObject)SubLObjectFactory.makeSymbol("MT")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym13$PROMPTER = SubLObjectFactory.makeUninternedSymbol("PROMPTER");
        $sym14$NEW_RKF_SALIENT_DESCRIPTOR_PROMPTER = SubLObjectFactory.makeSymbol("NEW-RKF-SALIENT-DESCRIPTOR-PROMPTER");
        $sym15$RKF_SALIENT_DESCRIPTOR_PROMPTER_NEXT = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPTER-NEXT");
        $sym16$WHILE = SubLObjectFactory.makeSymbol("WHILE");
        $sym17$RKF_SALIENT_DESCRIPTOR_PROMPT_P = SubLObjectFactory.makeSymbol("RKF-SALIENT-DESCRIPTOR-PROMPT-P");
        $sym18$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
    }
}

/*

	Total time: 29 ms
	
*/