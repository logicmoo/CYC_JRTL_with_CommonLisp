package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sme_lexification_wizard_accessors extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sme_lexification_wizard_accessors";
    public static final String myFingerPrint = "c84bd09cdd3bba3efdc2781e5bdc47589a56c4b68a6fb243014dc15089390458";
    private static final SubLSymbol $sym0$SME_LEXIFICATION_WIZARD;
    private static final SubLSymbol $sym1$NEW;
    private static final SubLSymbol $sym2$RKF_UIA_SME_LEXIFICATION_WIZARD;
    private static final SubLSymbol $sym3$SET_INTERACTION;
    private static final SubLString $str4$Warning__;
    private static final SubLString $str5$____assertion_failed___a______;
    private static final SubLSymbol $sym6$SME_LEXWIZ;
    private static final SubLSymbol $sym7$SET_TERM;
    private static final SubLSymbol $sym8$GET_TERM;
    private static final SubLSymbol $sym9$SET_PHRASE;
    private static final SubLSymbol $sym10$GET_PHRASE;
    private static final SubLSymbol $sym11$SET_MT;
    private static final SubLSymbol $sym12$GET_MT;
    private static final SubLSymbol $sym13$SET_LEXICAL_MT;
    private static final SubLSymbol $sym14$SET_PARSING_MT;
    private static final SubLSymbol $sym15$SET_GENERATION_MT;
    private static final SubLSymbol $sym16$LEXIFY;
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 1281L)
    public static SubLObject init_sme_lexwiz() {
        return sme_lexification_wizard.init_sme_lexification_wizard();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 1688L)
    public static SubLObject create_new_sme_lexwiz() {
        return methods.funcall_class_method_with_0_args((SubLObject)sme_lexification_wizard_accessors.$sym0$SME_LEXIFICATION_WIZARD, (SubLObject)sme_lexification_wizard_accessors.$sym1$NEW);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 1899L)
    public static SubLObject create_new_uia_sme_lexwiz(final SubLObject interaction) {
        final SubLObject sme_lexwiz = methods.funcall_class_method_with_0_args((SubLObject)sme_lexification_wizard_accessors.$sym2$RKF_UIA_SME_LEXIFICATION_WIZARD, (SubLObject)sme_lexification_wizard_accessors.$sym1$NEW);
        final SubLObject args = user_interaction_agenda.ui_args(interaction);
        final SubLObject v_term = args.first();
        final SubLObject phrase = conses_high.second(args);
        methods.funcall_instance_method_with_1_args(sme_lexwiz, (SubLObject)sme_lexification_wizard_accessors.$sym3$SET_INTERACTION, interaction);
        if (sme_lexification_wizard_accessors.NIL != v_term) {
            set_sme_lexwiz_term(sme_lexwiz, v_term);
            if (sme_lexification_wizard_accessors.NIL != phrase) {
                set_sme_lexwiz_phrase(sme_lexwiz, phrase);
            }
        }
        return sme_lexwiz;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 2504L)
    public static SubLObject set_sme_lexwiz_term(final SubLObject sme_lexwiz, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sme_lexification_wizard_accessors.NIL == sme_lexwiz && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sme_lexification_wizard_accessors.$str4$Warning__, (SubLObject)sme_lexification_wizard_accessors.$str5$____assertion_failed___a______), (SubLObject)sme_lexification_wizard_accessors.$sym6$SME_LEXWIZ);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return (SubLObject)((sme_lexification_wizard_accessors.NIL != sme_lexwiz) ? methods.funcall_instance_method_with_1_args(sme_lexwiz, (SubLObject)sme_lexification_wizard_accessors.$sym7$SET_TERM, v_term) : sme_lexification_wizard_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 2803L)
    public static SubLObject get_sme_lexwiz_term(final SubLObject sme_lexwiz) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sme_lexification_wizard_accessors.NIL == sme_lexwiz && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sme_lexification_wizard_accessors.$str4$Warning__, (SubLObject)sme_lexification_wizard_accessors.$str5$____assertion_failed___a______), (SubLObject)sme_lexification_wizard_accessors.$sym6$SME_LEXWIZ);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return (SubLObject)((sme_lexification_wizard_accessors.NIL != sme_lexwiz) ? methods.funcall_instance_method_with_0_args(sme_lexwiz, (SubLObject)sme_lexification_wizard_accessors.$sym8$GET_TERM) : sme_lexification_wizard_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 3087L)
    public static SubLObject set_sme_lexwiz_phrase(final SubLObject sme_lexwiz, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sme_lexification_wizard_accessors.NIL == sme_lexwiz && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sme_lexification_wizard_accessors.$str4$Warning__, (SubLObject)sme_lexification_wizard_accessors.$str5$____assertion_failed___a______), (SubLObject)sme_lexification_wizard_accessors.$sym6$SME_LEXWIZ);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return (SubLObject)((sme_lexification_wizard_accessors.NIL != sme_lexwiz) ? methods.funcall_instance_method_with_1_args(sme_lexwiz, (SubLObject)sme_lexification_wizard_accessors.$sym9$SET_PHRASE, phrase) : sme_lexification_wizard_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 3404L)
    public static SubLObject get_sme_lexwiz_phrase(final SubLObject sme_lexwiz) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sme_lexification_wizard_accessors.NIL == sme_lexwiz && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sme_lexification_wizard_accessors.$str4$Warning__, (SubLObject)sme_lexification_wizard_accessors.$str5$____assertion_failed___a______), (SubLObject)sme_lexification_wizard_accessors.$sym6$SME_LEXWIZ);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return (SubLObject)((sme_lexification_wizard_accessors.NIL != sme_lexwiz) ? methods.funcall_instance_method_with_0_args(sme_lexwiz, (SubLObject)sme_lexification_wizard_accessors.$sym10$GET_PHRASE) : sme_lexification_wizard_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 3700L)
    public static SubLObject set_sme_lexwiz_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sme_lexification_wizard_accessors.NIL == sme_lexwiz && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sme_lexification_wizard_accessors.$str4$Warning__, (SubLObject)sme_lexification_wizard_accessors.$str5$____assertion_failed___a______), (SubLObject)sme_lexification_wizard_accessors.$sym6$SME_LEXWIZ);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return (SubLObject)((sme_lexification_wizard_accessors.NIL != sme_lexwiz) ? methods.funcall_instance_method_with_1_args(sme_lexwiz, (SubLObject)sme_lexification_wizard_accessors.$sym11$SET_MT, mt) : sme_lexification_wizard_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 3993L)
    public static SubLObject get_sme_lexwiz_mt(final SubLObject sme_lexwiz) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sme_lexification_wizard_accessors.NIL == sme_lexwiz && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sme_lexification_wizard_accessors.$str4$Warning__, (SubLObject)sme_lexification_wizard_accessors.$str5$____assertion_failed___a______), (SubLObject)sme_lexification_wizard_accessors.$sym6$SME_LEXWIZ);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return (SubLObject)((sme_lexification_wizard_accessors.NIL != sme_lexwiz) ? methods.funcall_instance_method_with_0_args(sme_lexwiz, (SubLObject)sme_lexification_wizard_accessors.$sym12$GET_MT) : sme_lexification_wizard_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 4277L)
    public static SubLObject set_sme_lexwiz_lexical_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sme_lexification_wizard_accessors.NIL == sme_lexwiz && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sme_lexification_wizard_accessors.$str4$Warning__, (SubLObject)sme_lexification_wizard_accessors.$str5$____assertion_failed___a______), (SubLObject)sme_lexification_wizard_accessors.$sym6$SME_LEXWIZ);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return (SubLObject)((sme_lexification_wizard_accessors.NIL != sme_lexwiz) ? methods.funcall_instance_method_with_1_args(sme_lexwiz, (SubLObject)sme_lexification_wizard_accessors.$sym13$SET_LEXICAL_MT, mt) : sme_lexification_wizard_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 4590L)
    public static SubLObject set_sme_lexwiz_parsing_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sme_lexification_wizard_accessors.NIL == sme_lexwiz && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sme_lexification_wizard_accessors.$str4$Warning__, (SubLObject)sme_lexification_wizard_accessors.$str5$____assertion_failed___a______), (SubLObject)sme_lexification_wizard_accessors.$sym6$SME_LEXWIZ);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return (SubLObject)((sme_lexification_wizard_accessors.NIL != sme_lexwiz) ? methods.funcall_instance_method_with_1_args(sme_lexwiz, (SubLObject)sme_lexification_wizard_accessors.$sym14$SET_PARSING_MT, mt) : sme_lexification_wizard_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 4918L)
    public static SubLObject set_sme_lexwiz_generation_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sme_lexification_wizard_accessors.NIL == sme_lexwiz && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sme_lexification_wizard_accessors.$str4$Warning__, (SubLObject)sme_lexification_wizard_accessors.$str5$____assertion_failed___a______), (SubLObject)sme_lexification_wizard_accessors.$sym6$SME_LEXWIZ);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return (SubLObject)((sme_lexification_wizard_accessors.NIL != sme_lexwiz) ? methods.funcall_instance_method_with_1_args(sme_lexwiz, (SubLObject)sme_lexification_wizard_accessors.$sym15$SET_GENERATION_MT, mt) : sme_lexification_wizard_accessors.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sme-lexification-wizard-accessors.lisp", position = 5257L)
    public static SubLObject start_sme_lexwiz(final SubLObject sme_lexwiz, SubLObject v_term, SubLObject phrase, SubLObject mt) {
        if (v_term == sme_lexification_wizard_accessors.UNPROVIDED) {
            v_term = (SubLObject)sme_lexification_wizard_accessors.NIL;
        }
        if (phrase == sme_lexification_wizard_accessors.UNPROVIDED) {
            phrase = (SubLObject)sme_lexification_wizard_accessors.NIL;
        }
        if (mt == sme_lexification_wizard_accessors.UNPROVIDED) {
            mt = (SubLObject)sme_lexification_wizard_accessors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sme_lexification_wizard_accessors.NIL == sme_lexwiz && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(Numbers.max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            PrintLow.format(StreamsLow.$trace_output$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sme_lexification_wizard_accessors.$str4$Warning__, (SubLObject)sme_lexification_wizard_accessors.$str5$____assertion_failed___a______), (SubLObject)sme_lexification_wizard_accessors.$sym6$SME_LEXWIZ);
            streams_high.force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return (SubLObject)((sme_lexification_wizard_accessors.NIL != sme_lexwiz) ? methods.funcall_instance_method_with_3_args(sme_lexwiz, (SubLObject)sme_lexification_wizard_accessors.$sym16$LEXIFY, v_term, phrase, mt) : sme_lexification_wizard_accessors.NIL);
    }
    
    public static SubLObject declare_sme_lexification_wizard_accessors_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "init_sme_lexwiz", "INIT-SME-LEXWIZ", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "create_new_sme_lexwiz", "CREATE-NEW-SME-LEXWIZ", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "create_new_uia_sme_lexwiz", "CREATE-NEW-UIA-SME-LEXWIZ", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "set_sme_lexwiz_term", "SET-SME-LEXWIZ-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "get_sme_lexwiz_term", "GET-SME-LEXWIZ-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "set_sme_lexwiz_phrase", "SET-SME-LEXWIZ-PHRASE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "get_sme_lexwiz_phrase", "GET-SME-LEXWIZ-PHRASE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "set_sme_lexwiz_mt", "SET-SME-LEXWIZ-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "get_sme_lexwiz_mt", "GET-SME-LEXWIZ-MT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "set_sme_lexwiz_lexical_mt", "SET-SME-LEXWIZ-LEXICAL-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "set_sme_lexwiz_parsing_mt", "SET-SME-LEXWIZ-PARSING-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "set_sme_lexwiz_generation_mt", "SET-SME-LEXWIZ-GENERATION-MT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sme_lexification_wizard_accessors", "start_sme_lexwiz", "START-SME-LEXWIZ", 1, 3, false);
        return (SubLObject)sme_lexification_wizard_accessors.NIL;
    }
    
    public static SubLObject init_sme_lexification_wizard_accessors_file() {
        return (SubLObject)sme_lexification_wizard_accessors.NIL;
    }
    
    public static SubLObject setup_sme_lexification_wizard_accessors_file() {
        return (SubLObject)sme_lexification_wizard_accessors.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sme_lexification_wizard_accessors_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sme_lexification_wizard_accessors_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sme_lexification_wizard_accessors_file();
    }
    
    static {
        me = (SubLFile)new sme_lexification_wizard_accessors();
        $sym0$SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("SME-LEXIFICATION-WIZARD");
        $sym1$NEW = SubLObjectFactory.makeSymbol("NEW");
        $sym2$RKF_UIA_SME_LEXIFICATION_WIZARD = SubLObjectFactory.makeSymbol("RKF-UIA-SME-LEXIFICATION-WIZARD");
        $sym3$SET_INTERACTION = SubLObjectFactory.makeSymbol("SET-INTERACTION");
        $str4$Warning__ = SubLObjectFactory.makeString("Warning: ");
        $str5$____assertion_failed___a______ = SubLObjectFactory.makeString("*** assertion failed: ~a ***~%");
        $sym6$SME_LEXWIZ = SubLObjectFactory.makeSymbol("SME-LEXWIZ");
        $sym7$SET_TERM = SubLObjectFactory.makeSymbol("SET-TERM");
        $sym8$GET_TERM = SubLObjectFactory.makeSymbol("GET-TERM");
        $sym9$SET_PHRASE = SubLObjectFactory.makeSymbol("SET-PHRASE");
        $sym10$GET_PHRASE = SubLObjectFactory.makeSymbol("GET-PHRASE");
        $sym11$SET_MT = SubLObjectFactory.makeSymbol("SET-MT");
        $sym12$GET_MT = SubLObjectFactory.makeSymbol("GET-MT");
        $sym13$SET_LEXICAL_MT = SubLObjectFactory.makeSymbol("SET-LEXICAL-MT");
        $sym14$SET_PARSING_MT = SubLObjectFactory.makeSymbol("SET-PARSING-MT");
        $sym15$SET_GENERATION_MT = SubLObjectFactory.makeSymbol("SET-GENERATION-MT");
        $sym16$LEXIFY = SubLObjectFactory.makeSymbol("LEXIFY");
    }
}

/*

	Total time: 87 ms
	
*/