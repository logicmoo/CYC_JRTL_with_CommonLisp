package com.cyc.cycjava.cycl;


import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class sme_lexification_wizard_accessors extends SubLTranslatedFile {
    public static final SubLFile me = new sme_lexification_wizard_accessors();

    public static final String myName = "com.cyc.cycjava.cycl.sme_lexification_wizard_accessors";

    public static final String myFingerPrint = "c84bd09cdd3bba3efdc2781e5bdc47589a56c4b68a6fb243014dc15089390458";





    public static final SubLSymbol RKF_UIA_SME_LEXIFICATION_WIZARD = makeSymbol("RKF-UIA-SME-LEXIFICATION-WIZARD");



    public static final SubLString $str4$Warning__ = makeString("Warning: ");

    public static final SubLString $str5$____assertion_failed___a______ = makeString("*** assertion failed: ~a ***~%");

    public static final SubLSymbol SME_LEXWIZ = makeSymbol("SME-LEXWIZ");

    public static final SubLSymbol SET_TERM = makeSymbol("SET-TERM");

    public static final SubLSymbol GET_TERM = makeSymbol("GET-TERM");

    public static final SubLSymbol SET_PHRASE = makeSymbol("SET-PHRASE");

    public static final SubLSymbol GET_PHRASE = makeSymbol("GET-PHRASE");





    public static final SubLSymbol SET_LEXICAL_MT = makeSymbol("SET-LEXICAL-MT");

    public static final SubLSymbol SET_PARSING_MT = makeSymbol("SET-PARSING-MT");

    public static final SubLSymbol SET_GENERATION_MT = makeSymbol("SET-GENERATION-MT");



    public static SubLObject init_sme_lexwiz() {
        return sme_lexification_wizard.init_sme_lexification_wizard();
    }

    public static SubLObject create_new_sme_lexwiz() {
        return methods.funcall_class_method_with_0_args(SME_LEXIFICATION_WIZARD, NEW);
    }

    public static SubLObject create_new_uia_sme_lexwiz(final SubLObject interaction) {
        final SubLObject sme_lexwiz = methods.funcall_class_method_with_0_args(RKF_UIA_SME_LEXIFICATION_WIZARD, NEW);
        final SubLObject args = user_interaction_agenda.ui_args(interaction);
        final SubLObject v_term = args.first();
        final SubLObject phrase = second(args);
        methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_INTERACTION, interaction);
        if (NIL != v_term) {
            set_sme_lexwiz_term(sme_lexwiz, v_term);
            if (NIL != phrase) {
                set_sme_lexwiz_phrase(sme_lexwiz, phrase);
            }
        }
        return sme_lexwiz;
    }

    public static SubLObject set_sme_lexwiz_term(final SubLObject sme_lexwiz, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_TERM, v_term) : NIL;
    }

    public static SubLObject get_sme_lexwiz_term(final SubLObject sme_lexwiz) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_0_args(sme_lexwiz, GET_TERM) : NIL;
    }

    public static SubLObject set_sme_lexwiz_phrase(final SubLObject sme_lexwiz, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_PHRASE, phrase) : NIL;
    }

    public static SubLObject get_sme_lexwiz_phrase(final SubLObject sme_lexwiz) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_0_args(sme_lexwiz, GET_PHRASE) : NIL;
    }

    public static SubLObject set_sme_lexwiz_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_MT, mt) : NIL;
    }

    public static SubLObject get_sme_lexwiz_mt(final SubLObject sme_lexwiz) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_0_args(sme_lexwiz, GET_MT) : NIL;
    }

    public static SubLObject set_sme_lexwiz_lexical_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_LEXICAL_MT, mt) : NIL;
    }

    public static SubLObject set_sme_lexwiz_parsing_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_PARSING_MT, mt) : NIL;
    }

    public static SubLObject set_sme_lexwiz_generation_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_GENERATION_MT, mt) : NIL;
    }

    public static SubLObject start_sme_lexwiz(final SubLObject sme_lexwiz, SubLObject v_term, SubLObject phrase, SubLObject mt) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_3_args(sme_lexwiz, LEXIFY, v_term, phrase, mt) : NIL;
    }

    public static SubLObject declare_sme_lexification_wizard_accessors_file() {
        declareFunction(me, "init_sme_lexwiz", "INIT-SME-LEXWIZ", 0, 0, false);
        declareFunction(me, "create_new_sme_lexwiz", "CREATE-NEW-SME-LEXWIZ", 0, 0, false);
        declareFunction(me, "create_new_uia_sme_lexwiz", "CREATE-NEW-UIA-SME-LEXWIZ", 1, 0, false);
        declareFunction(me, "set_sme_lexwiz_term", "SET-SME-LEXWIZ-TERM", 2, 0, false);
        declareFunction(me, "get_sme_lexwiz_term", "GET-SME-LEXWIZ-TERM", 1, 0, false);
        declareFunction(me, "set_sme_lexwiz_phrase", "SET-SME-LEXWIZ-PHRASE", 2, 0, false);
        declareFunction(me, "get_sme_lexwiz_phrase", "GET-SME-LEXWIZ-PHRASE", 1, 0, false);
        declareFunction(me, "set_sme_lexwiz_mt", "SET-SME-LEXWIZ-MT", 2, 0, false);
        declareFunction(me, "get_sme_lexwiz_mt", "GET-SME-LEXWIZ-MT", 1, 0, false);
        declareFunction(me, "set_sme_lexwiz_lexical_mt", "SET-SME-LEXWIZ-LEXICAL-MT", 2, 0, false);
        declareFunction(me, "set_sme_lexwiz_parsing_mt", "SET-SME-LEXWIZ-PARSING-MT", 2, 0, false);
        declareFunction(me, "set_sme_lexwiz_generation_mt", "SET-SME-LEXWIZ-GENERATION-MT", 2, 0, false);
        declareFunction(me, "start_sme_lexwiz", "START-SME-LEXWIZ", 1, 3, false);
        return NIL;
    }

    public static SubLObject init_sme_lexification_wizard_accessors_file() {
        return NIL;
    }

    public static SubLObject setup_sme_lexification_wizard_accessors_file() {
        return NIL;
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

    
}

/**
 * Total time: 87 ms
 */
