/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
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
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SME-LEXIFICATION-WIZARD-ACCESSORS
 * source file: /cyc/top/cycl/sme-lexification-wizard-accessors.lisp
 * created:     2019/07/03 17:38:23
 */
public final class sme_lexification_wizard_accessors extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new sme_lexification_wizard_accessors();



    private static final SubLSymbol RKF_UIA_SME_LEXIFICATION_WIZARD = makeSymbol("RKF-UIA-SME-LEXIFICATION-WIZARD");

    static private final SubLString $str4$Warning__ = makeString("Warning: ");

    static private final SubLString $str5$____assertion_failed___a______ = makeString("*** assertion failed: ~a ***~%");

    private static final SubLSymbol SME_LEXWIZ = makeSymbol("SME-LEXWIZ");

    private static final SubLSymbol SET_TERM = makeSymbol("SET-TERM");

    private static final SubLSymbol GET_TERM = makeSymbol("GET-TERM");

    private static final SubLSymbol SET_PHRASE = makeSymbol("SET-PHRASE");

    private static final SubLSymbol GET_PHRASE = makeSymbol("GET-PHRASE");

    private static final SubLSymbol SET_LEXICAL_MT = makeSymbol("SET-LEXICAL-MT");

    private static final SubLSymbol SET_PARSING_MT = makeSymbol("SET-PARSING-MT");

    private static final SubLSymbol SET_GENERATION_MT = makeSymbol("SET-GENERATION-MT");

    // Definitions
    /**
     * Initializes the Dictionary Assistant (aka SME lexification wizard)
     */
    @LispMethod(comment = "Initializes the Dictionary Assistant (aka SME lexification wizard)")
    public static final SubLObject init_sme_lexwiz_alt() {
        return sme_lexification_wizard.init_sme_lexification_wizard();
    }

    // Definitions
    /**
     * Initializes the Dictionary Assistant (aka SME lexification wizard)
     */
    @LispMethod(comment = "Initializes the Dictionary Assistant (aka SME lexification wizard)")
    public static SubLObject init_sme_lexwiz() {
        return sme_lexification_wizard.init_sme_lexification_wizard();
    }

    /**
     *
     *
     * @return sme-lexification-wizard ; new instance of the class
     */
    @LispMethod(comment = "@return sme-lexification-wizard ; new instance of the class")
    public static final SubLObject create_new_sme_lexwiz_alt() {
        return methods.funcall_class_method_with_0_args(SME_LEXIFICATION_WIZARD, NEW);
    }

    /**
     *
     *
     * @return sme-lexification-wizard ; new instance of the class
     */
    @LispMethod(comment = "@return sme-lexification-wizard ; new instance of the class")
    public static SubLObject create_new_sme_lexwiz() {
        return methods.funcall_class_method_with_0_args(SME_LEXIFICATION_WIZARD, NEW);
    }

    /**
     *
     *
     * @return rkf-uia-sme-lexification-wizard ; new instance initialized with UIA INTERACTION
     */
    @LispMethod(comment = "@return rkf-uia-sme-lexification-wizard ; new instance initialized with UIA INTERACTION")
    public static final SubLObject create_new_uia_sme_lexwiz_alt(SubLObject interaction) {
        {
            SubLObject sme_lexwiz = methods.funcall_class_method_with_0_args(RKF_UIA_SME_LEXIFICATION_WIZARD, NEW);
            SubLObject args = user_interaction_agenda.ui_args(interaction);
            SubLObject v_term = args.first();
            SubLObject phrase = second(args);
            methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_INTERACTION, interaction);
            if (NIL != v_term) {
                com.cyc.cycjava.cycl.sme_lexification_wizard_accessors.set_sme_lexwiz_term(sme_lexwiz, v_term);
                if (NIL != phrase) {
                    com.cyc.cycjava.cycl.sme_lexification_wizard_accessors.set_sme_lexwiz_phrase(sme_lexwiz, phrase);
                }
            }
            return sme_lexwiz;
        }
    }

    /**
     *
     *
     * @return rkf-uia-sme-lexification-wizard ; new instance initialized with UIA INTERACTION
     */
    @LispMethod(comment = "@return rkf-uia-sme-lexification-wizard ; new instance initialized with UIA INTERACTION")
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

    /**
     * Sets the Cyc term to be lexified (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Sets the Cyc term to be lexified (using sme-lexwiz instance)")
    public static final SubLObject set_sme_lexwiz_term_alt(SubLObject sme_lexwiz, SubLObject v_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sme_lexwiz) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt4$Warning__, $str_alt5$____assertion_failed___a______), SME_LEXWIZ);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
            }
            return NIL != sme_lexwiz ? ((SubLObject) (methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_TERM, v_term))) : NIL;
        }
    }

    /**
     * Sets the Cyc term to be lexified (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Sets the Cyc term to be lexified (using sme-lexwiz instance)")
    public static SubLObject set_sme_lexwiz_term(final SubLObject sme_lexwiz, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_TERM, v_term) : NIL;
    }

    /**
     * Gets the Cyc term to be lexified (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Gets the Cyc term to be lexified (using sme-lexwiz instance)")
    public static final SubLObject get_sme_lexwiz_term_alt(SubLObject sme_lexwiz) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sme_lexwiz) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt4$Warning__, $str_alt5$____assertion_failed___a______), SME_LEXWIZ);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
            }
            return NIL != sme_lexwiz ? ((SubLObject) (methods.funcall_instance_method_with_0_args(sme_lexwiz, GET_TERM))) : NIL;
        }
    }

    @LispMethod(comment = "Gets the Cyc term to be lexified (using sme-lexwiz instance)")
    public static SubLObject get_sme_lexwiz_term(final SubLObject sme_lexwiz) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_0_args(sme_lexwiz, GET_TERM) : NIL;
    }

    /**
     * Sets the Cyc phrase for the lexification (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Sets the Cyc phrase for the lexification (using sme-lexwiz instance)")
    public static final SubLObject set_sme_lexwiz_phrase_alt(SubLObject sme_lexwiz, SubLObject phrase) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sme_lexwiz) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt4$Warning__, $str_alt5$____assertion_failed___a______), SME_LEXWIZ);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
            }
            return NIL != sme_lexwiz ? ((SubLObject) (methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_PHRASE, phrase))) : NIL;
        }
    }

    /**
     * Sets the Cyc phrase for the lexification (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Sets the Cyc phrase for the lexification (using sme-lexwiz instance)")
    public static SubLObject set_sme_lexwiz_phrase(final SubLObject sme_lexwiz, final SubLObject phrase) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_PHRASE, phrase) : NIL;
    }

    /**
     * Gets the Cyc phrase for the lexification (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Gets the Cyc phrase for the lexification (using sme-lexwiz instance)")
    public static final SubLObject get_sme_lexwiz_phrase_alt(SubLObject sme_lexwiz) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sme_lexwiz) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt4$Warning__, $str_alt5$____assertion_failed___a______), SME_LEXWIZ);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
            }
            return NIL != sme_lexwiz ? ((SubLObject) (methods.funcall_instance_method_with_0_args(sme_lexwiz, GET_PHRASE))) : NIL;
        }
    }

    /**
     * Gets the Cyc phrase for the lexification (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Gets the Cyc phrase for the lexification (using sme-lexwiz instance)")
    public static SubLObject get_sme_lexwiz_phrase(final SubLObject sme_lexwiz) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_0_args(sme_lexwiz, GET_PHRASE) : NIL;
    }

    /**
     * Sets the Cyc mt for the lexification (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Sets the Cyc mt for the lexification (using sme-lexwiz instance)")
    public static final SubLObject set_sme_lexwiz_mt_alt(SubLObject sme_lexwiz, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sme_lexwiz) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt4$Warning__, $str_alt5$____assertion_failed___a______), SME_LEXWIZ);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
            }
            return NIL != sme_lexwiz ? ((SubLObject) (methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_MT, mt))) : NIL;
        }
    }

    /**
     * Sets the Cyc mt for the lexification (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Sets the Cyc mt for the lexification (using sme-lexwiz instance)")
    public static SubLObject set_sme_lexwiz_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_MT, mt) : NIL;
    }

    /**
     * Gets the Cyc mt for the lexification (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Gets the Cyc mt for the lexification (using sme-lexwiz instance)")
    public static final SubLObject get_sme_lexwiz_mt_alt(SubLObject sme_lexwiz) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sme_lexwiz) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt4$Warning__, $str_alt5$____assertion_failed___a______), SME_LEXWIZ);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
            }
            return NIL != sme_lexwiz ? ((SubLObject) (methods.funcall_instance_method_with_0_args(sme_lexwiz, GET_MT))) : NIL;
        }
    }

    @LispMethod(comment = "Gets the Cyc mt for the lexification (using sme-lexwiz instance)")
    public static SubLObject get_sme_lexwiz_mt(final SubLObject sme_lexwiz) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_0_args(sme_lexwiz, GET_MT) : NIL;
    }

    /**
     * Sets the Cyc mt for general lexification (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Sets the Cyc mt for general lexification (using sme-lexwiz instance)")
    public static final SubLObject set_sme_lexwiz_lexical_mt_alt(SubLObject sme_lexwiz, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sme_lexwiz) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt4$Warning__, $str_alt5$____assertion_failed___a______), SME_LEXWIZ);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
            }
            return NIL != sme_lexwiz ? ((SubLObject) (methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_LEXICAL_MT, mt))) : NIL;
        }
    }

    @LispMethod(comment = "Sets the Cyc mt for general lexification (using sme-lexwiz instance)")
    public static SubLObject set_sme_lexwiz_lexical_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_LEXICAL_MT, mt) : NIL;
    }/**
     * Sets the Cyc mt for general lexification (using sme-lexwiz instance)
     */


    /**
     * Sets the Cyc mt for the lexification of parse templates (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Sets the Cyc mt for the lexification of parse templates (using sme-lexwiz instance)")
    public static final SubLObject set_sme_lexwiz_parsing_mt_alt(SubLObject sme_lexwiz, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sme_lexwiz) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt4$Warning__, $str_alt5$____assertion_failed___a______), SME_LEXWIZ);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
            }
            return NIL != sme_lexwiz ? ((SubLObject) (methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_PARSING_MT, mt))) : NIL;
        }
    }

    @LispMethod(comment = "Sets the Cyc mt for the lexification of parse templates (using sme-lexwiz instance)")
    public static SubLObject set_sme_lexwiz_parsing_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_PARSING_MT, mt) : NIL;
    }/**
     * Sets the Cyc mt for the lexification of parse templates (using sme-lexwiz instance)
     */


    /**
     * Sets the Cyc mt for the lexification of generation templates (using sme-lexwiz instance)
     */
    @LispMethod(comment = "Sets the Cyc mt for the lexification of generation templates (using sme-lexwiz instance)")
    public static final SubLObject set_sme_lexwiz_generation_mt_alt(SubLObject sme_lexwiz, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sme_lexwiz) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt4$Warning__, $str_alt5$____assertion_failed___a______), SME_LEXWIZ);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
            }
            return NIL != sme_lexwiz ? ((SubLObject) (methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_GENERATION_MT, mt))) : NIL;
        }
    }

    @LispMethod(comment = "Sets the Cyc mt for the lexification of generation templates (using sme-lexwiz instance)")
    public static SubLObject set_sme_lexwiz_generation_mt(final SubLObject sme_lexwiz, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == sme_lexwiz) && lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
            format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str4$Warning__, $str5$____assertion_failed___a______), SME_LEXWIZ);
            force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
        }
        return NIL != sme_lexwiz ? methods.funcall_instance_method_with_1_args(sme_lexwiz, SET_GENERATION_MT, mt) : NIL;
    }/**
     * Sets the Cyc mt for the lexification of generation templates (using sme-lexwiz instance)
     */


    /**
     * Perform lexification for term using sme-lexwiz instance
     */
    @LispMethod(comment = "Perform lexification for term using sme-lexwiz instance")
    public static final SubLObject start_sme_lexwiz_alt(SubLObject sme_lexwiz, SubLObject v_term, SubLObject phrase, SubLObject mt) {
        if (v_term == UNPROVIDED) {
            v_term = NIL;
        }
        if (phrase == UNPROVIDED) {
            phrase = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == sme_lexwiz) {
                if (lexification_utilities.$lex_trace_level$.getDynamicValue(thread).numGE(max(lexification_utilities.$lex_trace_level$.getDynamicValue(thread), lexification_utilities.$lex_basic$.getGlobalValue()))) {
                    format(StreamsLow.$trace_output$.getDynamicValue(thread), cconcatenate($str_alt4$Warning__, $str_alt5$____assertion_failed___a______), SME_LEXWIZ);
                    force_output(StreamsLow.$trace_output$.getDynamicValue(thread));
                }
            }
            return NIL != sme_lexwiz ? ((SubLObject) (methods.funcall_instance_method_with_3_args(sme_lexwiz, LEXIFY, v_term, phrase, mt))) : NIL;
        }
    }

    @LispMethod(comment = "Perform lexification for term using sme-lexwiz instance")
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
    }/**
     * Perform lexification for term using sme-lexwiz instance
     */


    public static SubLObject declare_sme_lexification_wizard_accessors_file() {
        declareFunction("init_sme_lexwiz", "INIT-SME-LEXWIZ", 0, 0, false);
        declareFunction("create_new_sme_lexwiz", "CREATE-NEW-SME-LEXWIZ", 0, 0, false);
        declareFunction("create_new_uia_sme_lexwiz", "CREATE-NEW-UIA-SME-LEXWIZ", 1, 0, false);
        declareFunction("set_sme_lexwiz_term", "SET-SME-LEXWIZ-TERM", 2, 0, false);
        declareFunction("get_sme_lexwiz_term", "GET-SME-LEXWIZ-TERM", 1, 0, false);
        declareFunction("set_sme_lexwiz_phrase", "SET-SME-LEXWIZ-PHRASE", 2, 0, false);
        declareFunction("get_sme_lexwiz_phrase", "GET-SME-LEXWIZ-PHRASE", 1, 0, false);
        declareFunction("set_sme_lexwiz_mt", "SET-SME-LEXWIZ-MT", 2, 0, false);
        declareFunction("get_sme_lexwiz_mt", "GET-SME-LEXWIZ-MT", 1, 0, false);
        declareFunction("set_sme_lexwiz_lexical_mt", "SET-SME-LEXWIZ-LEXICAL-MT", 2, 0, false);
        declareFunction("set_sme_lexwiz_parsing_mt", "SET-SME-LEXWIZ-PARSING-MT", 2, 0, false);
        declareFunction("set_sme_lexwiz_generation_mt", "SET-SME-LEXWIZ-GENERATION-MT", 2, 0, false);
        declareFunction("start_sme_lexwiz", "START-SME-LEXWIZ", 1, 3, false);
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

    static {
    }

    static private final SubLString $str_alt4$Warning__ = makeString("Warning: ");

    static private final SubLString $str_alt5$____assertion_failed___a______ = makeString("*** assertion failed: ~a ***~%");
}

/**
 * Total time: 87 ms
 */
