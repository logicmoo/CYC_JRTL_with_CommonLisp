/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SYSTEM-INFO
 * source file: /cyc/top/cycl/system-info.lisp
 * created:     2019/07/03 17:37:05
 */
public final class system_info extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new system_info();

 public static final String myName = "com.cyc.cycjava.cycl.system_info";


    // deflexical
    // Definitions
    @LispMethod(comment = "The pathname for the cyc home directory (suitable for use with RELATIVE-FILENAME)\ndeflexical")
    public static final SubLSymbol $cyc_home_directory$ = makeSymbol("*CYC-HOME-DIRECTORY*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $available_cyc_features$ = makeSymbol("*AVAILABLE-CYC-FEATURES*");

    static private final SubLSymbol $sym1$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol NOTE_TRANSLATION_FEATURE = makeSymbol("NOTE-TRANSLATION-FEATURE");

    private static final SubLSymbol $CYC_RESEARCHCYC_DEBUG = makeKeyword("CYC-RESEARCHCYC-DEBUG");

    private static final SubLList $list32 = list(makeSymbol("FEATURE"));

    private static final SubLSymbol CYC_REVISION_STRING = makeSymbol("CYC-REVISION-STRING");

    private static final SubLSymbol CYC_REVISION_STRING_S1P_FORMAT = makeSymbol("CYC-REVISION-STRING-S1P-FORMAT");

    private static final SubLString $$$s = makeString("s");

    private static final SubLSymbol CYC_REVISION_NUMBERS = makeSymbol("CYC-REVISION-NUMBERS");

    private static final SubLSymbol $cycl_start_time$ = makeSymbol("*CYCL-START-TIME*");

    private static final SubLSymbol CYCL_START_TIME = makeSymbol("CYCL-START-TIME");

    private static final SubLSymbol $subl_initial_continuation$ = makeSymbol("*SUBL-INITIAL-CONTINUATION*");

    private static final SubLSymbol CYC_INITIAL_CONTINUATION = makeSymbol("CYC-INITIAL-CONTINUATION");

    private static final SubLString $$$CYC = makeString("CYC");

    private static final SubLString $str43$Process_ID___D__ = makeString("Process ID: ~D~%");

    private static final SubLString $str44$System_____unknown_______A______K = makeString("System ~:[<unknown>~;~:*~A~]~@[ KB ~D~].~%");

    private static final SubLString $str45$Working_Directory___A__ = makeString("Working Directory: ~A~%");

    public static final SubLObject note_translation_feature_alt(SubLObject feature) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject item_var = feature;
                if (NIL == member(item_var, $available_cyc_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $available_cyc_features$.setGlobalValue(cons(item_var, $available_cyc_features$.getGlobalValue()));
                }
            }
            {
                SubLObject item_var = feature;
                if (NIL == member(item_var, $features$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                    $features$.setDynamicValue(cons(item_var, $features$.getDynamicValue(thread)), thread);
                }
            }
            return feature;
        }
    }

    public static SubLObject note_translation_feature(final SubLObject feature) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == member(feature, $available_cyc_features$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $available_cyc_features$.setGlobalValue(cons(feature, $available_cyc_features$.getGlobalValue()));
        }
        if (NIL == member(feature, $features$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
            $features$.setDynamicValue(cons(feature, $features$.getDynamicValue(thread)), thread);
        }
        return feature;
    }

    public static final SubLObject note_translation_features_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                if (NIL != datum) {
                    cdestructuring_bind_error(datum, NIL);
                }
                {
                    SubLObject candidate_features = $available_cyc_features$.getGlobalValue();
                    SubLObject code = NIL;
                    candidate_features = Sort.sort(copy_list(candidate_features), symbol_function($sym1$STRING_), symbol_function(SYMBOL_NAME));
                    {
                        SubLObject cdolist_list_var = candidate_features;
                        SubLObject feature = NIL;
                        for (feature = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , feature = cdolist_list_var.first()) {
                            if (NIL != member(feature, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                code = cons(list(NOTE_TRANSLATION_FEATURE, feature), code);
                            }
                        }
                    }
                    return bq_cons(PROGN, append(nreverse(code), NIL));
                }
            }
        }
    }

    public static SubLObject note_translation_features(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject datum = macroform.rest();
        if (NIL != datum) {
            cdestructuring_bind_error(datum, NIL);
        }
        SubLObject candidate_features = $available_cyc_features$.getGlobalValue();
        SubLObject code = NIL;
        SubLObject cdolist_list_var;
        candidate_features = cdolist_list_var = Sort.sort(copy_list(candidate_features), symbol_function($sym1$STRING_), symbol_function(SYMBOL_NAME));
        SubLObject feature = NIL;
        feature = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != member(feature, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                code = cons(list(NOTE_TRANSLATION_FEATURE, feature), code);
            }
            cdolist_list_var = cdolist_list_var.rest();
            feature = cdolist_list_var.first();
        } 
        return bq_cons(PROGN, append(nreverse(code), NIL));
    }

    public static final SubLObject check_for_feature_alt(SubLObject macroform, SubLObject environment) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = macroform.rest();
                SubLObject current = datum;
                SubLObject feature = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt56);
                feature = current.first();
                current = current.rest();
                if (NIL == current) {
                    return makeBoolean(NIL != member(feature, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                } else {
                    cdestructuring_bind_error(datum, $list_alt56);
                }
            }
            return NIL;
        }
    }

    public static SubLObject check_for_feature(final SubLObject macroform, final SubLObject environment) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject feature = NIL;
        destructuring_bind_must_consp(current, datum, $list32);
        feature = current.first();
        current = current.rest();
        if (NIL == current) {
            return makeBoolean(NIL != member(feature, $features$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        }
        cdestructuring_bind_error(datum, $list32);
        return NIL;
    }

    public static final SubLObject cyc_html_feature_alt() {
        return T;
    }

    public static SubLObject cyc_html_feature() {
        return T;
    }

    public static final SubLObject cyc_date_feature_alt() {
        return T;
    }

    public static SubLObject cyc_date_feature() {
        return T;
    }

    public static final SubLObject cyc_quant_feature_alt() {
        return T;
    }

    public static SubLObject cyc_quant_feature() {
        return T;
    }

    public static final SubLObject cyc_pph_feature_alt() {
        return T;
    }

    public static SubLObject cyc_pph_feature() {
        return T;
    }

    public static final SubLObject cyc_lexicon_feature_alt() {
        return T;
    }

    public static SubLObject cyc_lexicon_feature() {
        return T;
    }

    public static final SubLObject cyc_nl_feature_alt() {
        return T;
    }

    public static SubLObject cyc_nl_feature() {
        return T;
    }

    public static final SubLObject cyc_hpsg_feature_alt() {
        return NIL;
    }

    public static SubLObject cyc_hpsg_feature() {
        return NIL;
    }

    public static final SubLObject cyc_external_feature_alt() {
        return T;
    }

    public static SubLObject cyc_external_feature() {
        return T;
    }

    public static final SubLObject cyc_wordnet_feature_alt() {
        return T;
    }

    public static SubLObject cyc_wordnet_feature() {
        return T;
    }

    public static final SubLObject cyc_retrieval_feature_alt() {
        return T;
    }

    public static SubLObject cyc_retrieval_feature() {
        return NIL;
    }

    public static final SubLObject cyc_thesaurus_feature_alt() {
        return T;
    }

    public static SubLObject cyc_thesaurus_feature() {
        return NIL;
    }

    public static final SubLObject cyc_maint_feature_alt() {
        return T;
    }

    public static SubLObject cyc_maint_feature() {
        return NIL;
    }

    public static final SubLObject cyc_secure_feature_alt() {
        return T;
    }

    public static SubLObject cyc_secure_feature() {
        return NIL;
    }

    public static final SubLObject cyc_hitek_feature_alt() {
        return T;
    }

    public static SubLObject cyc_hitek_feature() {
        return NIL;
    }

    public static final SubLObject cyc_hpkb_feature_alt() {
        return T;
    }

    public static SubLObject cyc_hpkb_feature() {
        return NIL;
    }

    public static final SubLObject cyc_qa_feature_alt() {
        return NIL;
    }

    public static SubLObject cyc_qa_feature() {
        return NIL;
    }

    public static final SubLObject cyc_kbi_feature_alt() {
        return T;
    }

    public static SubLObject cyc_kbi_feature() {
        return NIL;
    }

    public static final SubLObject cyc_opencyc_feature_alt() {
        return NIL;
    }

    public static SubLObject cyc_opencyc_feature() {
        return NIL;
    }

    public static final SubLObject cyc_researchcyc_feature_alt() {
        return NIL;
    }

    public static SubLObject cyc_researchcyc_feature() {
        return T;
    }

    public static final SubLObject cyc_sksi_feature_alt() {
        return T;
    }

    public static SubLObject cyc_sksi_feature() {
        return T;
    }

    public static final SubLObject matches_execution_context_p_alt(SubLObject location) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq(system_parameters.$cyc_execution_context$.getDynamicValue(thread), location);
        }
    }

    public static SubLObject matches_execution_context_p(final SubLObject location) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq(system_parameters.$cyc_execution_context$.getDynamicValue(thread), location);
    }

    public static final SubLObject cycorp_execution_context_p_alt() {
        return com.cyc.cycjava.cycl.system_info.matches_execution_context_p($CYCORP);
    }

    public static SubLObject cycorp_execution_context_p() {
        return matches_execution_context_p($CYCORP);
    }

    /**
     * Returns the current Cyc revision numbers expressed as a period-delimited string
     */
    @LispMethod(comment = "Returns the current Cyc revision numbers expressed as a period-delimited string")
    public static final SubLObject cyc_revision_string_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return system_version.$cyc_revision_string$.getDynamicValue(thread);
        }
    }

    /**
     * Returns the current Cyc revision numbers expressed as a period-delimited string
     */
    @LispMethod(comment = "Returns the current Cyc revision numbers expressed as a period-delimited string")
    public static SubLObject cyc_revision_string() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_version.$cyc_revision_string$.getDynamicValue(thread);
    }

    public static final SubLObject cyc_revision_string_s1p_format_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return cconcatenate($$$s, format_nil.format_nil_a_no_copy(substitute(CHAR_p, CHAR_period, system_version.$cyc_revision_string$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static SubLObject cyc_revision_string_s1p_format() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cconcatenate($$$s, format_nil.format_nil_a_no_copy(substitute(CHAR_p, CHAR_period, system_version.$cyc_revision_string$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Returns a list of the current Cyc revision numbers
     */
    @LispMethod(comment = "Returns a list of the current Cyc revision numbers")
    public static final SubLObject cyc_revision_numbers_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return system_version.$cyc_revision_numbers$.getDynamicValue(thread);
        }
    }

    /**
     * Returns a list of the current Cyc revision numbers
     */
    @LispMethod(comment = "Returns a list of the current Cyc revision numbers")
    public static SubLObject cyc_revision_numbers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_version.$cyc_revision_numbers$.getDynamicValue(thread);
    }

    public static final SubLObject reset_cycl_start_time_alt(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        $cycl_start_time$.setGlobalValue(universal_time);
        return $cycl_start_time$.getGlobalValue();
    }

    public static SubLObject reset_cycl_start_time(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        $cycl_start_time$.setGlobalValue(universal_time);
        return $cycl_start_time$.getGlobalValue();
    }

    /**
     * Return the universal time when the current Cyc process was started.
     */
    @LispMethod(comment = "Return the universal time when the current Cyc process was started.")
    public static final SubLObject cycl_start_time_alt() {
        return $cycl_start_time$.getGlobalValue();
    }

    /**
     * Return the universal time when the current Cyc process was started.
     */
    @LispMethod(comment = "Return the universal time when the current Cyc process was started.")
    public static SubLObject cycl_start_time() {
        return $cycl_start_time$.getGlobalValue();
    }

    /**
     * Return the number of seconds the current Cyc process has been running since it was started.
     */
    @LispMethod(comment = "Return the number of seconds the current Cyc process has been running since it was started.")
    public static final SubLObject cycl_uptime_alt() {
        return subtract(get_universal_time(), com.cyc.cycjava.cycl.system_info.cycl_start_time());
    }

    /**
     * Return the number of seconds the current Cyc process has been running since it was started.
     */
    @LispMethod(comment = "Return the number of seconds the current Cyc process has been running since it was started.")
    public static SubLObject cycl_uptime() {
        return subtract(get_universal_time(), cycl_start_time());
    }

    /**
     * The Initial Continuation for Cyc.
     */
    @LispMethod(comment = "The Initial Continuation for Cyc.")
    public static final SubLObject cyc_initial_continuation_alt(SubLObject initialization_file, SubLObject init_form, SubLObject batchP, SubLObject backgroundP) {
        com.cyc.cycjava.cycl.system_info.cyc_initialization();
        return funcall($subl_initial_continuation$.getGlobalValue(), initialization_file, init_form, list_utilities.sublisp_boolean(batchP), list_utilities.sublisp_boolean(backgroundP));
    }

    /**
     * The Initial Continuation for Cyc.
     */
    @LispMethod(comment = "The Initial Continuation for Cyc.")
    public static SubLObject cyc_initial_continuation(final SubLObject initialization_file, final SubLObject init_form, final SubLObject batchP, final SubLObject backgroundP) {
        cyc_initialization();
        return funcall($subl_initial_continuation$.getGlobalValue(), initialization_file, init_form, list_utilities.sublisp_boolean(batchP), list_utilities.sublisp_boolean(backgroundP));
    }

    public static final SubLObject cyc_initialization_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $package$.setDynamicValue(find_package($$$CYC), thread);
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt67$Process_ID___D__, Environment.get_process_id(UNPROVIDED));
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt68$System_____unknown_______A______K, com.cyc.cycjava.cycl.system_info.cyc_revision_string(), kb_loaded());
            format(StreamsLow.$standard_output$.getDynamicValue(thread), $str_alt69$Working_Directory___A__, file_utilities.canonical_cyc_working_directory());
            force_output(StreamsLow.$terminal_io$.getDynamicValue(thread));
            return T;
        }
    }

    public static SubLObject cyc_initialization() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $package$.setDynamicValue(find_package($$$CYC), thread);
        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str43$Process_ID___D__, Environment.get_process_id(UNPROVIDED));
        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str44$System_____unknown_______A______K, cyc_revision_string(), kb_loaded());
        format(StreamsLow.$standard_output$.getDynamicValue(thread), $str45$Working_Directory___A__, file_utilities.canonical_cyc_working_directory());
        force_output(StreamsLow.$terminal_io$.getDynamicValue(thread));
        return T;
    }

    public static SubLObject declare_system_info_file() {
        declareFunction("note_translation_feature", "NOTE-TRANSLATION-FEATURE", 1, 0, false);
        declareMacro("note_translation_features", "NOTE-TRANSLATION-FEATURES");
        declareMacro("check_for_feature", "CHECK-FOR-FEATURE");
        declareFunction("cyc_html_feature", "CYC-HTML-FEATURE", 0, 0, false);
        declareFunction("cyc_date_feature", "CYC-DATE-FEATURE", 0, 0, false);
        declareFunction("cyc_quant_feature", "CYC-QUANT-FEATURE", 0, 0, false);
        declareFunction("cyc_pph_feature", "CYC-PPH-FEATURE", 0, 0, false);
        declareFunction("cyc_lexicon_feature", "CYC-LEXICON-FEATURE", 0, 0, false);
        declareFunction("cyc_nl_feature", "CYC-NL-FEATURE", 0, 0, false);
        declareFunction("cyc_hpsg_feature", "CYC-HPSG-FEATURE", 0, 0, false);
        declareFunction("cyc_external_feature", "CYC-EXTERNAL-FEATURE", 0, 0, false);
        declareFunction("cyc_wordnet_feature", "CYC-WORDNET-FEATURE", 0, 0, false);
        declareFunction("cyc_retrieval_feature", "CYC-RETRIEVAL-FEATURE", 0, 0, false);
        declareFunction("cyc_thesaurus_feature", "CYC-THESAURUS-FEATURE", 0, 0, false);
        declareFunction("cyc_maint_feature", "CYC-MAINT-FEATURE", 0, 0, false);
        declareFunction("cyc_secure_feature", "CYC-SECURE-FEATURE", 0, 0, false);
        declareFunction("cyc_hitek_feature", "CYC-HITEK-FEATURE", 0, 0, false);
        declareFunction("cyc_hpkb_feature", "CYC-HPKB-FEATURE", 0, 0, false);
        declareFunction("cyc_qa_feature", "CYC-QA-FEATURE", 0, 0, false);
        declareFunction("cyc_kbi_feature", "CYC-KBI-FEATURE", 0, 0, false);
        declareFunction("cyc_opencyc_feature", "CYC-OPENCYC-FEATURE", 0, 0, false);
        declareFunction("cyc_researchcyc_feature", "CYC-RESEARCHCYC-FEATURE", 0, 0, false);
        declareFunction("cyc_sksi_feature", "CYC-SKSI-FEATURE", 0, 0, false);
        declareFunction("matches_execution_context_p", "MATCHES-EXECUTION-CONTEXT-P", 1, 0, false);
        declareFunction("cycorp_execution_context_p", "CYCORP-EXECUTION-CONTEXT-P", 0, 0, false);
        declareFunction("cyc_revision_string", "CYC-REVISION-STRING", 0, 0, false);
        declareFunction("cyc_revision_string_s1p_format", "CYC-REVISION-STRING-S1P-FORMAT", 0, 0, false);
        declareFunction("cyc_revision_numbers", "CYC-REVISION-NUMBERS", 0, 0, false);
        declareFunction("reset_cycl_start_time", "RESET-CYCL-START-TIME", 0, 1, false);
        declareFunction("cycl_start_time", "CYCL-START-TIME", 0, 0, false);
        declareFunction("cycl_uptime", "CYCL-UPTIME", 0, 0, false);
        declareFunction("cyc_initial_continuation", "CYC-INITIAL-CONTINUATION", 4, 0, false);
        declareFunction("cyc_initialization", "CYC-INITIALIZATION", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_system_info_file_alt() {
        deflexical("*CYC-HOME-DIRECTORY*", Filesys.construct_filename(NIL, NIL, NIL, T));
        deflexical("*AVAILABLE-CYC-FEATURES*", NIL != boundp($available_cyc_features$) ? ((SubLObject) ($available_cyc_features$.getGlobalValue())) : NIL);
        deflexical("*CYCL-START-TIME*", NIL != boundp($cycl_start_time$) ? ((SubLObject) ($cycl_start_time$.getGlobalValue())) : NIL);
        deflexical("*SUBL-INITIAL-CONTINUATION*", NIL != boundp($subl_initial_continuation$) ? ((SubLObject) ($subl_initial_continuation$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_system_info_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*CYC-HOME-DIRECTORY*", Filesys.construct_filename(NIL, NIL, NIL, T));
            deflexical("*AVAILABLE-CYC-FEATURES*", SubLTrampolineFile.maybeDefault($available_cyc_features$, $available_cyc_features$, NIL));
            deflexical("*CYCL-START-TIME*", SubLTrampolineFile.maybeDefault($cycl_start_time$, $cycl_start_time$, NIL));
            deflexical("*SUBL-INITIAL-CONTINUATION*", SubLTrampolineFile.maybeDefault($subl_initial_continuation$, $subl_initial_continuation$, NIL));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*AVAILABLE-CYC-FEATURES*", NIL != boundp($available_cyc_features$) ? ((SubLObject) ($available_cyc_features$.getGlobalValue())) : NIL);
            deflexical("*CYCL-START-TIME*", NIL != boundp($cycl_start_time$) ? ((SubLObject) ($cycl_start_time$.getGlobalValue())) : NIL);
            deflexical("*SUBL-INITIAL-CONTINUATION*", NIL != boundp($subl_initial_continuation$) ? ((SubLObject) ($subl_initial_continuation$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_system_info_file_Previous() {
        deflexical("*CYC-HOME-DIRECTORY*", Filesys.construct_filename(NIL, NIL, NIL, T));
        deflexical("*AVAILABLE-CYC-FEATURES*", SubLTrampolineFile.maybeDefault($available_cyc_features$, $available_cyc_features$, NIL));
        deflexical("*CYCL-START-TIME*", SubLTrampolineFile.maybeDefault($cycl_start_time$, $cycl_start_time$, NIL));
        deflexical("*SUBL-INITIAL-CONTINUATION*", SubLTrampolineFile.maybeDefault($subl_initial_continuation$, $subl_initial_continuation$, NIL));
        return NIL;
    }

    public static final SubLObject setup_system_info_file_alt() {
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_AQA);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_BROWSER);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_BUTLER);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_CCF);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_CI);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_CSM);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_CYBLACK);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_DATE);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_EVENT);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_EXTERNAL);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_GIS);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_GRAPHER);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_HALO);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_HITEK);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_HPKB);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_HTML);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_JAVAFRAMEWORK);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_JUBL);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_KBI);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_LEXICON);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_MAINT);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_MYSENTIENT);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_NL);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_NOUNLEARNER);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_NSF_NWU_KDD);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_PIQUANT);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_PLANNER);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_PPH);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_QUANT);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_QUIRK);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_REFORMULATOR);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_REGEX);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_RETRIEVAL);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_RKF);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_RTP);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_SCENGEN);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_SECURE);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_SKSI);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_STORYTELLING);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_SUBLOOP);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_SUNIT_FULL);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_TESTING);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_THESAURUS);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_TIME);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_TRANSLATOR);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_TYPICALVERBARGS);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_UIA);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_WORDNET);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_YAHOO);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($DCYC);
        com.cyc.cycjava.cycl.system_info.note_translation_feature($LKB);
        register_external_symbol(CYC_REVISION_STRING);
        register_external_symbol(CYC_REVISION_STRING_S1P_FORMAT);
        register_external_symbol(CYC_REVISION_NUMBERS);
        declare_defglobal($cycl_start_time$);
        register_external_symbol(CYCL_START_TIME);
        declare_defglobal($subl_initial_continuation$);
        $subl_initial_continuation$.setGlobalValue(get_initial_continuation());
        set_initial_continuation(CYC_INITIAL_CONTINUATION);
        return NIL;
    }

    public static SubLObject setup_system_info_file() {
        if (SubLFiles.USE_V1) {
            note_translation_feature($CYC_BROWSER);
            note_translation_feature($CYC_BUTLER);
            note_translation_feature($CYC_DATE);
            note_translation_feature($CYC_EVENT);
            note_translation_feature($CYC_EXTERNAL);
            note_translation_feature($CYC_GRAPHER);
            note_translation_feature($CYC_HTML);
            note_translation_feature($CYC_JAVAFRAMEWORK);
            note_translation_feature($CYC_LEXICON);
            note_translation_feature($CYC_NL);
            note_translation_feature($CYC_PLANNER);
            note_translation_feature($CYC_PPH);
            note_translation_feature($CYC_QUANT);
            note_translation_feature($CYC_QUIRK);
            note_translation_feature($CYC_REFORMULATOR);
            note_translation_feature($CYC_REGEX);
            note_translation_feature($CYC_RESEARCHCYC);
            note_translation_feature($CYC_RESEARCHCYC_DEBUG);
            note_translation_feature($CYC_RKF);
            note_translation_feature($CYC_RTP);
            note_translation_feature($CYC_SCENGEN);
            note_translation_feature($CYC_SKSI);
            note_translation_feature($CYC_SUBLOOP);
            note_translation_feature($CYC_TESTING);
            note_translation_feature($CYC_TIME);
            note_translation_feature($CYC_WORDNET);
            note_translation_feature($CYC_YAHOO);
            register_external_symbol(CYC_REVISION_STRING);
            register_external_symbol(CYC_REVISION_STRING_S1P_FORMAT);
            register_external_symbol(CYC_REVISION_NUMBERS);
            declare_defglobal($cycl_start_time$);
            register_external_symbol(CYCL_START_TIME);
            declare_defglobal($subl_initial_continuation$);
            $subl_initial_continuation$.setGlobalValue(get_initial_continuation());
            set_initial_continuation(CYC_INITIAL_CONTINUATION);
        }
        if (SubLFiles.USE_V2) {
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_AQA);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_CCF);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_CI);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_CSM);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_CYBLACK);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_GIS);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_HALO);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_HITEK);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_HPKB);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_JUBL);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_KBI);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_MAINT);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_MYSENTIENT);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_NOUNLEARNER);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_NSF_NWU_KDD);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_PIQUANT);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_RETRIEVAL);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_SECURE);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_STORYTELLING);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_SUNIT_FULL);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_THESAURUS);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_TRANSLATOR);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_TYPICALVERBARGS);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($CYC_UIA);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($DCYC);
            com.cyc.cycjava.cycl.system_info.note_translation_feature($LKB);
        }
        return NIL;
    }

    public static SubLObject setup_system_info_file_Previous() {
        note_translation_feature($CYC_BROWSER);
        note_translation_feature($CYC_BUTLER);
        note_translation_feature($CYC_DATE);
        note_translation_feature($CYC_EVENT);
        note_translation_feature($CYC_EXTERNAL);
        note_translation_feature($CYC_GRAPHER);
        note_translation_feature($CYC_HTML);
        note_translation_feature($CYC_JAVAFRAMEWORK);
        note_translation_feature($CYC_LEXICON);
        note_translation_feature($CYC_NL);
        note_translation_feature($CYC_PLANNER);
        note_translation_feature($CYC_PPH);
        note_translation_feature($CYC_QUANT);
        note_translation_feature($CYC_QUIRK);
        note_translation_feature($CYC_REFORMULATOR);
        note_translation_feature($CYC_REGEX);
        note_translation_feature($CYC_RESEARCHCYC);
        note_translation_feature($CYC_RESEARCHCYC_DEBUG);
        note_translation_feature($CYC_RKF);
        note_translation_feature($CYC_RTP);
        note_translation_feature($CYC_SCENGEN);
        note_translation_feature($CYC_SKSI);
        note_translation_feature($CYC_SUBLOOP);
        note_translation_feature($CYC_TESTING);
        note_translation_feature($CYC_TIME);
        note_translation_feature($CYC_WORDNET);
        note_translation_feature($CYC_YAHOO);
        register_external_symbol(CYC_REVISION_STRING);
        register_external_symbol(CYC_REVISION_STRING_S1P_FORMAT);
        register_external_symbol(CYC_REVISION_NUMBERS);
        declare_defglobal($cycl_start_time$);
        register_external_symbol(CYCL_START_TIME);
        declare_defglobal($subl_initial_continuation$);
        $subl_initial_continuation$.setGlobalValue(get_initial_continuation());
        set_initial_continuation(CYC_INITIAL_CONTINUATION);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_system_info_file();
    }

    @Override
    public void initializeVariables() {
        init_system_info_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_system_info_file();
    }

    static {
    }

    private static final SubLSymbol $CYC_AQA = makeKeyword("CYC-AQA");

    private static final SubLSymbol $CYC_CCF = makeKeyword("CYC-CCF");

    private static final SubLSymbol $CYC_CI = makeKeyword("CYC-CI");

    private static final SubLSymbol $CYC_CSM = makeKeyword("CYC-CSM");

    private static final SubLSymbol $CYC_CYBLACK = makeKeyword("CYC-CYBLACK");

    private static final SubLSymbol $CYC_GIS = makeKeyword("CYC-GIS");

    private static final SubLSymbol $CYC_HITEK = makeKeyword("CYC-HITEK");

    private static final SubLSymbol $CYC_HPKB = makeKeyword("CYC-HPKB");

    private static final SubLSymbol $CYC_JUBL = makeKeyword("CYC-JUBL");

    private static final SubLSymbol $CYC_KBI = makeKeyword("CYC-KBI");

    private static final SubLSymbol $CYC_MYSENTIENT = makeKeyword("CYC-MYSENTIENT");

    private static final SubLSymbol $CYC_NOUNLEARNER = makeKeyword("CYC-NOUNLEARNER");

    private static final SubLSymbol $CYC_NSF_NWU_KDD = makeKeyword("CYC-NSF-NWU-KDD");

    private static final SubLSymbol $CYC_PIQUANT = makeKeyword("CYC-PIQUANT");

    private static final SubLSymbol $CYC_RETRIEVAL = makeKeyword("CYC-RETRIEVAL");

    private static final SubLSymbol $CYC_SECURE = makeKeyword("CYC-SECURE");

    private static final SubLSymbol $CYC_STORYTELLING = makeKeyword("CYC-STORYTELLING");

    private static final SubLSymbol $CYC_SUNIT_FULL = makeKeyword("CYC-SUNIT-FULL");

    private static final SubLSymbol $CYC_THESAURUS = makeKeyword("CYC-THESAURUS");

    private static final SubLSymbol $CYC_TRANSLATOR = makeKeyword("CYC-TRANSLATOR");

    private static final SubLSymbol $CYC_TYPICALVERBARGS = makeKeyword("CYC-TYPICALVERBARGS");

    private static final SubLSymbol $CYC_UIA = makeKeyword("CYC-UIA");

    private static final SubLSymbol $DCYC = makeKeyword("DCYC");

    private static final SubLSymbol $LKB = makeKeyword("LKB");

    static private final SubLList $list_alt56 = list(makeSymbol("FEATURE"));

    static private final SubLString $str_alt67$Process_ID___D__ = makeString("Process ID: ~D~%");

    static private final SubLString $str_alt68$System_____unknown_______A______K = makeString("System ~:[<unknown>~;~:*~A~]~@[ KB ~D~].~%");

    static private final SubLString $str_alt69$Working_Directory___A__ = makeString("Working Directory: ~A~%");
}

/**
 * Total time: 87 ms
 */
