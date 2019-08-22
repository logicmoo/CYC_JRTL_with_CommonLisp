package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
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
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class system_info extends SubLTranslatedFile {
    public static final SubLFile me = new system_info();

    public static final String myName = "com.cyc.cycjava.cycl.system_info";

    public static final String myFingerPrint = "87c436ffbec68a3168168699e95f3eb1a9542207cb63010c0c9870fe77385236";

    // deflexical
    public static final SubLSymbol $cyc_home_directory$ = makeSymbol("*CYC-HOME-DIRECTORY*");







    // Internal Constants
    public static final SubLSymbol $available_cyc_features$ = makeSymbol("*AVAILABLE-CYC-FEATURES*");

    public static final SubLSymbol $sym1$STRING_ = makeSymbol("STRING<");



    public static final SubLSymbol NOTE_TRANSLATION_FEATURE = makeSymbol("NOTE-TRANSLATION-FEATURE");





































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

    public static SubLObject cyc_html_feature() {
        return T;
    }

    public static SubLObject cyc_date_feature() {
        return T;
    }

    public static SubLObject cyc_quant_feature() {
        return T;
    }

    public static SubLObject cyc_pph_feature() {
        return T;
    }

    public static SubLObject cyc_lexicon_feature() {
        return T;
    }

    public static SubLObject cyc_nl_feature() {
        return T;
    }

    public static SubLObject cyc_hpsg_feature() {
        return NIL;
    }

    public static SubLObject cyc_external_feature() {
        return T;
    }

    public static SubLObject cyc_wordnet_feature() {
        return T;
    }

    public static SubLObject cyc_retrieval_feature() {
        return NIL;
    }

    public static SubLObject cyc_thesaurus_feature() {
        return NIL;
    }

    public static SubLObject cyc_maint_feature() {
        return NIL;
    }

    public static SubLObject cyc_secure_feature() {
        return NIL;
    }

    public static SubLObject cyc_hitek_feature() {
        return NIL;
    }

    public static SubLObject cyc_hpkb_feature() {
        return NIL;
    }

    public static SubLObject cyc_qa_feature() {
        return NIL;
    }

    public static SubLObject cyc_kbi_feature() {
        return NIL;
    }

    public static SubLObject cyc_opencyc_feature() {
        return NIL;
    }

    public static SubLObject cyc_researchcyc_feature() {
        return T;
    }

    public static SubLObject cyc_sksi_feature() {
        return T;
    }

    public static SubLObject matches_execution_context_p(final SubLObject location) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq(system_parameters.$cyc_execution_context$.getDynamicValue(thread), location);
    }

    public static SubLObject cycorp_execution_context_p() {
        return matches_execution_context_p($CYCORP);
    }

    public static SubLObject cyc_revision_string() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_version.$cyc_revision_string$.getDynamicValue(thread);
    }

    public static SubLObject cyc_revision_string_s1p_format() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return cconcatenate($$$s, format_nil.format_nil_a_no_copy(substitute(CHAR_p, CHAR_period, system_version.$cyc_revision_string$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject cyc_revision_numbers() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return system_version.$cyc_revision_numbers$.getDynamicValue(thread);
    }

    public static SubLObject reset_cycl_start_time(SubLObject universal_time) {
        if (universal_time == UNPROVIDED) {
            universal_time = get_universal_time();
        }
        $cycl_start_time$.setGlobalValue(universal_time);
        return $cycl_start_time$.getGlobalValue();
    }

    public static SubLObject cycl_start_time() {
        return $cycl_start_time$.getGlobalValue();
    }

    public static SubLObject cycl_uptime() {
        return subtract(get_universal_time(), cycl_start_time());
    }

    public static SubLObject cyc_initial_continuation(final SubLObject initialization_file, final SubLObject init_form, final SubLObject batchP, final SubLObject backgroundP) {
        cyc_initialization();
        return funcall($subl_initial_continuation$.getGlobalValue(), initialization_file, init_form, list_utilities.sublisp_boolean(batchP), list_utilities.sublisp_boolean(backgroundP));
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
        declareFunction(me, "note_translation_feature", "NOTE-TRANSLATION-FEATURE", 1, 0, false);
        declareMacro(me, "note_translation_features", "NOTE-TRANSLATION-FEATURES");
        declareMacro(me, "check_for_feature", "CHECK-FOR-FEATURE");
        declareFunction(me, "cyc_html_feature", "CYC-HTML-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_date_feature", "CYC-DATE-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_quant_feature", "CYC-QUANT-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_pph_feature", "CYC-PPH-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_lexicon_feature", "CYC-LEXICON-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_nl_feature", "CYC-NL-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_hpsg_feature", "CYC-HPSG-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_external_feature", "CYC-EXTERNAL-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_wordnet_feature", "CYC-WORDNET-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_retrieval_feature", "CYC-RETRIEVAL-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_thesaurus_feature", "CYC-THESAURUS-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_maint_feature", "CYC-MAINT-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_secure_feature", "CYC-SECURE-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_hitek_feature", "CYC-HITEK-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_hpkb_feature", "CYC-HPKB-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_qa_feature", "CYC-QA-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_kbi_feature", "CYC-KBI-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_opencyc_feature", "CYC-OPENCYC-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_researchcyc_feature", "CYC-RESEARCHCYC-FEATURE", 0, 0, false);
        declareFunction(me, "cyc_sksi_feature", "CYC-SKSI-FEATURE", 0, 0, false);
        declareFunction(me, "matches_execution_context_p", "MATCHES-EXECUTION-CONTEXT-P", 1, 0, false);
        declareFunction(me, "cycorp_execution_context_p", "CYCORP-EXECUTION-CONTEXT-P", 0, 0, false);
        declareFunction(me, "cyc_revision_string", "CYC-REVISION-STRING", 0, 0, false);
        declareFunction(me, "cyc_revision_string_s1p_format", "CYC-REVISION-STRING-S1P-FORMAT", 0, 0, false);
        declareFunction(me, "cyc_revision_numbers", "CYC-REVISION-NUMBERS", 0, 0, false);
        declareFunction(me, "reset_cycl_start_time", "RESET-CYCL-START-TIME", 0, 1, false);
        declareFunction(me, "cycl_start_time", "CYCL-START-TIME", 0, 0, false);
        declareFunction(me, "cycl_uptime", "CYCL-UPTIME", 0, 0, false);
        declareFunction(me, "cyc_initial_continuation", "CYC-INITIAL-CONTINUATION", 4, 0, false);
        declareFunction(me, "cyc_initialization", "CYC-INITIALIZATION", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_system_info_file() {
        deflexical("*CYC-HOME-DIRECTORY*", Filesys.construct_filename(NIL, NIL, NIL, T));
        deflexical("*AVAILABLE-CYC-FEATURES*", SubLTrampolineFile.maybeDefault($available_cyc_features$, $available_cyc_features$, NIL));
        deflexical("*CYCL-START-TIME*", SubLTrampolineFile.maybeDefault($cycl_start_time$, $cycl_start_time$, NIL));
        deflexical("*SUBL-INITIAL-CONTINUATION*", SubLTrampolineFile.maybeDefault($subl_initial_continuation$, $subl_initial_continuation$, NIL));
        return NIL;
    }

    public static SubLObject setup_system_info_file() {
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

    
}

/**
 * Total time: 87 ms
 */
