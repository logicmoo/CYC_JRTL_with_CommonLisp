package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_user_modeler extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_user_modeler";
    public static final String myFingerPrint = "05c73f81acc1a5e4156d9e72de767dc5e7e322ab827c444863c4d3b89edc0692";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-user-modeler.lisp", position = 785L)
    private static SubLSymbol $rkf_user_definition_mt$;
    private static final SubLObject $const0$CyclistsMt;
    private static final SubLObject $const1$InferencePSC;
    private static final SubLList $list2;
    private static final SubLObject $const3$and;
    private static final SubLList $list4;
    private static final SubLObject $const5$languageSpoken;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLObject $const9$languageAvailableForUIAInteractio;
    private static final SubLSymbol $kw10$SUPPORTED;
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-user-modeler.lisp", position = 845L)
    public static SubLObject rkf_user_modeler_supported_language_prompts_for_user(final SubLObject user) {
        final SubLObject mt = rkf_user_modeler.$const1$InferencePSC;
        final SubLObject pairs = ask_utilities.ask_template((SubLObject)rkf_user_modeler.$list2, (SubLObject)ConsesLow.listS(rkf_user_modeler.$const3$and, (SubLObject)rkf_user_modeler.$list4, (SubLObject)ConsesLow.listS(rkf_user_modeler.$const5$languageSpoken, user, (SubLObject)rkf_user_modeler.$list6), (SubLObject)rkf_user_modeler.$list7), mt, (SubLObject)rkf_user_modeler.NIL, (SubLObject)rkf_user_modeler.UNPROVIDED, (SubLObject)rkf_user_modeler.UNPROVIDED, (SubLObject)rkf_user_modeler.UNPROVIDED);
        SubLObject supported_prompts = (SubLObject)rkf_user_modeler.NIL;
        SubLObject all_prompts = (SubLObject)rkf_user_modeler.NIL;
        SubLObject cdolist_list_var = pairs;
        SubLObject pair = (SubLObject)rkf_user_modeler.NIL;
        pair = cdolist_list_var.first();
        while (rkf_user_modeler.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject language = (SubLObject)rkf_user_modeler.NIL;
            SubLObject prompt_string = (SubLObject)rkf_user_modeler.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_user_modeler.$list8);
            language = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_user_modeler.$list8);
            prompt_string = current.first();
            current = current.rest();
            if (rkf_user_modeler.NIL == current) {
                if (rkf_user_modeler.NIL != backward.removal_ask((SubLObject)ConsesLow.list(rkf_user_modeler.$const9$languageAvailableForUIAInteractio, language), mt, (SubLObject)rkf_user_modeler.UNPROVIDED, (SubLObject)rkf_user_modeler.UNPROVIDED)) {
                    supported_prompts = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(language, prompt_string, (SubLObject)rkf_user_modeler.$kw10$SUPPORTED), supported_prompts);
                }
                else {
                    all_prompts = (SubLObject)ConsesLow.cons(pair, all_prompts);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_user_modeler.$list8);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        }
        return ConsesLow.append(supported_prompts, all_prompts);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/rkf-user-modeler.lisp", position = 2077L)
    public static SubLObject rkf_user_modeler_language_prompt_language(final SubLObject language_prompt) {
        return language_prompt.first();
    }
    
    public static SubLObject declare_rkf_user_modeler_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_user_modeler", "rkf_user_modeler_supported_language_prompts_for_user", "RKF-USER-MODELER-SUPPORTED-LANGUAGE-PROMPTS-FOR-USER", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_user_modeler", "rkf_user_modeler_language_prompt_language", "RKF-USER-MODELER-LANGUAGE-PROMPT-LANGUAGE", 1, 0, false);
        return (SubLObject)rkf_user_modeler.NIL;
    }
    
    public static SubLObject init_rkf_user_modeler_file() {
        rkf_user_modeler.$rkf_user_definition_mt$ = SubLFiles.deflexical("*RKF-USER-DEFINITION-MT*", rkf_user_modeler.$const0$CyclistsMt);
        return (SubLObject)rkf_user_modeler.NIL;
    }
    
    public static SubLObject setup_rkf_user_modeler_file() {
        return (SubLObject)rkf_user_modeler.NIL;
    }
    
    public void declareFunctions() {
        declare_rkf_user_modeler_file();
    }
    
    public void initializeVariables() {
        init_rkf_user_modeler_file();
    }
    
    public void runTopLevelForms() {
        setup_rkf_user_modeler_file();
    }
    
    static {
        me = (SubLFile)new rkf_user_modeler();
        rkf_user_modeler.$rkf_user_definition_mt$ = null;
        $const0$CyclistsMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CyclistsMt"));
        $const1$InferencePSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InferencePSC"));
        $list2 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LANGUAGE"), (SubLObject)SubLObjectFactory.makeSymbol("?PROMPT-STRING"));
        $const3$and = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and"));
        $list4 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languagePostedOnUIA")), (SubLObject)SubLObjectFactory.makeSymbol("?LANGUAGE"));
        $const5$languageSpoken = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languageSpoken"));
        $list6 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("?LANGUAGE"));
        $list7 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languagePromptForUIA")), (SubLObject)SubLObjectFactory.makeSymbol("?LANGUAGE"), (SubLObject)SubLObjectFactory.makeSymbol("?PROMPT-STRING")));
        $list8 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LANGUAGE"), (SubLObject)SubLObjectFactory.makeSymbol("PROMPT-STRING"));
        $const9$languageAvailableForUIAInteractio = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("languageAvailableForUIAInteractions"));
        $kw10$SUPPORTED = SubLObjectFactory.makeKeyword("SUPPORTED");
    }
}

/*

	Total time: 72 ms
	
*/