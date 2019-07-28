package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.control_vars;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing_initialization;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.cycjava.cycl.sksi.semantic_etl_bus;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Storage;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.function.Supplier;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.misc_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class misc_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new misc_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.misc_utilities";

    public static final String myFingerPrint = "510ff1a9068391f9985ba249f4b86d21919ae59a88eec4b3ea0be8bd72ab2ec2";

    // defconstant
    private static final SubLSymbol $kb_content_copyright_notice$ = makeSymbol("*KB-CONTENT-COPYRIGHT-NOTICE*");





    // deflexical
    private static final SubLSymbol $system_code_version_string$ = makeSymbol("*SYSTEM-CODE-VERSION-STRING*");

    // deflexical
    private static final SubLSymbol $system_code_release_string$ = makeSymbol("*SYSTEM-CODE-RELEASE-STRING*");

    // deflexical
    private static final SubLSymbol $id_space_fixnum_range_problem$ = makeSymbol("*ID-SPACE-FIXNUM-RANGE-PROBLEM*");







    // deflexical
    public static final SubLSymbol $standard_hl_store_cache_file_extension$ = makeSymbol("*STANDARD-HL-STORE-CACHE-FILE-EXTENSION*");



    // deflexical
    private static final SubLSymbol $machine_bogomips$ = makeSymbol("*MACHINE-BOGOMIPS*");

    private static final SubLString $str0$Copyright__c__1995___2014_Cycorp_ = makeString("Copyright (c) 1995 - 2014 Cycorp.  All rights reserved.");

    private static final SubLString $str1$___Copyright__c__1998___2014_Cyco = makeString(";; Copyright (c) 1998 - 2014 Cycorp, Inc., All Rights Reserved.\n;; This file and its contents are products of Cycorp, Inc.  They are\n;; released only under specific license agreement with Cycorp, and\n;; must be treated as Cycorp Confidential Information, as per that\n;; license agreement, including translations into another language\n;; (including but not limited to Conceptual Graphs, KIF, Ontolingua,\n;; GFP, LOOM, PowerLOOM, CycL, C, C++, IDL, predicate logic, and\n;; English) and any logically equivalent rearrangement or renaming of\n;; assertion components, terms, or variables.  This paragraph shall\n;; not be altered or removed. This file is provided \"AS IS\", without\n;; any warranty; the cumulative liability of Cycorp for all claims\n;; relating to this file shall not exceed the amount of one dollar.\n;; Cycorp, 7718 Wood Hollow Drive, Suite 250, Austin, TX 78731, USA; \n;; Website: www.cyc.com, Tel: (512) 342-4000.");

    public static final SubLSymbol $system_code_initializations_marker$ = makeSymbol("*SYSTEM-CODE-INITIALIZATIONS-MARKER*");

    private static final SubLSymbol $system_code_initializations_lock$ = makeSymbol("*SYSTEM-CODE-INITIALIZATIONS-LOCK*");

    private static final SubLString $$$System_Code_Initializations_Lock = makeString("System Code Initializations Lock");

    private static final SubLString $str5$Initializing_Cyc__A_A__ = makeString("Initializing Cyc ~A~A~%");

    private static final SubLString $str6$__ = makeString(" (");

    private static final SubLString $str7$_ = makeString(")");

    private static final SubLString $str8$ = makeString("");

    private static final SubLString $str9$No_KB_is_loaded___System_KB_initi = makeString("No KB is loaded.  System KB initializations will not be run.");

    private static final SubLString $$$_ = makeString(" ");





    private static final SubLString $$$Dreamcatcher = makeString("Dreamcatcher");



    private static final SubLString $str15$Cyc_Maint = makeString("Cyc-Maint");

    private static final SubLList $list16 = list(new SubLObject[]{ makeKeyword("CYC-WORDNET"), makeKeyword("CYC-TIME"), makeKeyword("CYC-REGEX"), makeKeyword("CYC-REFORMULATOR"), makeKeyword("CYC-QUANT"), makeKeyword("CYC-PPH"), makeKeyword("CYC-OPENCYC"), makeKeyword("CYC-LEXICON"), makeKeyword("CYC-HTML"), makeKeyword("CYC-GRAPHER"), makeKeyword("CYC-EVENT"), makeKeyword("CYC-DATE"), makeKeyword("CYC-BROWSER"), makeKeyword("CYC-API-LOCKDOWN"), makeKeyword("SL2JAVA") });

    private static final SubLString $$$OpenCyc = makeString("OpenCyc");



    private static final SubLString $str19$OpenCyc__custom_ = makeString("OpenCyc (custom)");

    private static final SubLList $list20 = list(new SubLObject[]{ makeKeyword("CYC-YAHOO"), makeKeyword("CYC-WORDNET"), makeKeyword("CYC-TIME"), makeKeyword("CYC-TESTING"), makeKeyword("CYC-SUBLOOP"), makeKeyword("CYC-SKSI"), makeKeyword("CYC-SCENGEN"), makeKeyword("CYC-RTP"), makeKeyword("CYC-RKF"), makeKeyword("CYC-RESEARCHCYC-DEBUG"), makeKeyword("CYC-RESEARCHCYC"), makeKeyword("CYC-REGEX"), makeKeyword("CYC-REFORMULATOR"), makeKeyword("CYC-QUIRK"), makeKeyword("CYC-QUANT"), makeKeyword("CYC-PPH"), makeKeyword("CYC-PLANNER"), makeKeyword("CYC-NL"), makeKeyword("CYC-LEXICON"), makeKeyword("CYC-JAVAFRAMEWORK"), makeKeyword("CYC-HTML"), makeKeyword("CYC-GRAPHER"), makeKeyword("CYC-EXTERNAL"), makeKeyword("CYC-EVENT"), makeKeyword("CYC-DATE"), makeKeyword("CYC-BUTLER"), makeKeyword("CYC-BROWSER"), makeKeyword("SL2JAVA") });

    private static final SubLString $$$ResearchCyc = makeString("ResearchCyc");

    private static final SubLSymbol $CYC_RESEARCHCYC_DEBUG = makeKeyword("CYC-RESEARCHCYC-DEBUG");

    private static final SubLString $str23$ResearchCyc__custom_ = makeString("ResearchCyc (custom)");

    private static final SubLList $list24 = list(new SubLObject[]{ makeKeyword("CYC-YAHOO"), makeKeyword("CYC-WORDNET"), makeKeyword("CYC-TIME"), makeKeyword("CYC-TESTING"), makeKeyword("CYC-SUBLOOP"), makeKeyword("CYC-SKSI"), makeKeyword("CYC-SCENGEN"), makeKeyword("CYC-RTP"), makeKeyword("CYC-RKF"), makeKeyword("CYC-RESEARCHCYC"), makeKeyword("CYC-REGEX"), makeKeyword("CYC-REFORMULATOR"), makeKeyword("CYC-QUIRK"), makeKeyword("CYC-QUANT"), makeKeyword("CYC-PPH"), makeKeyword("CYC-PLANNER"), makeKeyword("CYC-NL"), makeKeyword("CYC-LEXICON"), makeKeyword("CYC-JAVAFRAMEWORK"), makeKeyword("CYC-HTML"), makeKeyword("CYC-GRAPHER"), makeKeyword("CYC-EXTERNAL"), makeKeyword("CYC-EVENT"), makeKeyword("CYC-DATE"), makeKeyword("CYC-BUTLER"), makeKeyword("CYC-BROWSER"), makeKeyword("SL2JAVA") });

    private static final SubLString $str25$Cyc_Unknown = makeString("Cyc-Unknown");

    private static final SubLSymbol SYSTEM_CODE_INITIALIZATIONS_RUN_P = makeSymbol("SYSTEM-CODE-INITIALIZATIONS-RUN-P");

    private static final SubLString $str27$hack_ = makeString("hack!");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLString $str30$file_backed_cache_initializer = makeString("file-backed cache initializer");

    private static final SubLSymbol INITIALIZE_ALL_FILE_BACKED_CACHES = makeSymbol("INITIALIZE-ALL-FILE-BACKED-CACHES");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLString $str33$__Your_KB_object_ID_space_has_out = makeString("~%Your KB object ID space has outstripped your FIXNUM range.");

    private static final SubLString $str34$__Performance__and_most_likely_co = makeString("~%Performance (and most likely correctness) will suffer.");

    private static final SubLString $str35$__Relaunch_your_image_with_more_F = makeString("~%Relaunch your image with more FIXNUM bits (-DFIX_NUM_BITS=xx).~%");

    private static final SubLString $$$Accept_the_risks = makeString("Accept the risks");



    private static final SubLSymbol $hl_store_caches_directory$ = makeSymbol("*HL-STORE-CACHES-DIRECTORY*");

    private static final SubLSymbol $hl_store_caches_shared_symbols$ = makeSymbol("*HL-STORE-CACHES-SHARED-SYMBOLS*");

    private static final SubLSymbol $hl_store_caches_shared_symbols_simple$ = makeSymbol("*HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE*");

    private static final SubLString $str41$Cannot_initialize_HL_KB_object_ca = makeString("Cannot initialize HL KB object caches.");

    private static final SubLString $str42$Do_not_have_a_valid_location_for_ = makeString("Do not have a valid location for the HL store caches; ~A is not accessible");

    private static final SubLString $str43$Could_not_initialize_HL_store_cac = makeString("Could not initialize HL store caches from ~A.");

    private static final SubLString $str44$Initializing_HL_backing_store_cac = makeString("Initializing HL backing store caches from ~A.~%");



    private static final SubLString $str46$Could_not_initialize_shared_symbo = makeString("Could not initialize shared symbols from ~A.");



    private static final SubLString $$$cfasl = makeString("cfasl");

    private static final SubLString $str49$_ = makeString(".");

    private static final SubLString $str50$units__A_ = makeString("units/~A/");

    private static final SubLString $str51$Guessing_HL_Store_location_of__A = makeString("Guessing HL Store location of ~A");



    private static final SubLList $list53 = list(new SubLObject[]{ makeKeyword("CONS"), makeKeyword("ADJOIN"), makeKeyword("APPEND"), makeKeyword("UNION"), makeKeyword("CDR"), makeKeyword("CAR"), makeKeyword("RPLACA"), makeKeyword("REMOVE"), makeKeyword("RPLACD"), makeKeyword("REVERSE"), makeKeyword("INC"), makeKeyword("DEC") });























    private static final SubLList $list65 = list(makeKeyword("REPLACE"));











    private static final SubLList $list71 = list(CHAR_period);

    private static final SubLSymbol HOSTNAME = makeSymbol("HOSTNAME");



    private static final SubLSymbol $hostname_caching_state$ = makeSymbol("*HOSTNAME-CACHING-STATE*");

    private static final SubLString $str75$Could_not_get_hostname_ = makeString("Could not get hostname.");



    private static final SubLString $str77$_proc_cpuinfo = makeString("/proc/cpuinfo");



    private static final SubLString $str79$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$bogomips = makeString("bogomips");

    private static final SubLString $str81$_ = makeString(":");

    private static final SubLList $list82 = list(makeSymbol("FORM"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));





    private static final SubLSymbol WARN_UNLESS = makeSymbol("WARN-UNLESS");



    private static final SubLSymbol SUBL_VARIABLE_BINDING_P = makeSymbol("SUBL-VARIABLE-BINDING-P");

    private static final SubLSymbol SUBL_VARIABLE_BINDING_LIST_P = makeSymbol("SUBL-VARIABLE-BINDING-LIST-P");





    private static final SubLSymbol FLUSH_ALL_LOGS = makeSymbol("FLUSH-ALL-LOGS");









    private static final SubLString $str96$Unexpected_name_spec____S = makeString("Unexpected name-spec : ~S");

    private static final SubLSymbol STRING_UPCASE = makeSymbol("STRING-UPCASE");





    private static final SubLList $list100 = list(makeSymbol("SYMBOL"), makeSymbol("&REST"), makeSymbol("REST"));

    private static final SubLList $list101 = list(makeSymbol("ARGLIST"), makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"));

    private static final SubLString $str102$___S_ = makeString("~&~S ");

    private static final SubLString $str103$_S = makeString("~S");

    private static final SubLString $str104$__ = makeString("()");

    private static final SubLString $str105$_____S__ = makeString("~%  ~S~%");

    private static final SubLList $list106 = list(makeSymbol("&OPTIONAL"), makeSymbol("DOCUMENTATION"), makeSymbol("&REST"), makeSymbol("WHATEVER"));

    private static final SubLString $str107$___S__S = makeString("~&~S ~S");

    private static final SubLSymbol NON_EMPTY_STRING_P = makeSymbol("NON-EMPTY-STRING-P");



    private static final SubLSymbol STRING_IS_PREFIX_OF = makeSymbol("STRING-IS-PREFIX-OF");



    private static final SubLList $list112 = list(makeSymbol("ARG"), makeSymbol("VALUES"));

    private static final SubLList $list113 = list(makeSymbol("SXHASH"), makeSymbol("COLLISIONS"));

    private static final SubLList $list114 = list(makeSymbol("ARGS"), makeSymbol("VALUES"));

    private static final SubLSymbol $sym115$TERM__ = makeSymbol("TERM-<");

    private static final SubLString $str116$____Method____S = makeString("~%~%Method : ~S");

    private static final SubLList $list117 = cons(makeSymbol("ARGS"), makeSymbol("VALUES"));

    private static final SubLString $str118$_S_ = makeString("~S ");

    private static final SubLString $str119$___ = makeString("-> ");

    private static final SubLString $str120$values__S = makeString("values ~S");

    public static SubLObject copyright_notice() {
        return $str0$Copyright__c__1995___2014_Cycorp_;
    }

    public static SubLObject kb_content_copyright_notice() {
        return $kb_content_copyright_notice$.getGlobalValue();
    }

    public static SubLObject write_kb_content_copyright_notice(final SubLObject stream) {
        princ(kb_content_copyright_notice(), stream);
        return NIL;
    }

    public static SubLObject system_code_initializations(SubLObject perform_app_specific_initializationsP) {
        if (perform_app_specific_initializationsP == UNPROVIDED) {
            perform_app_specific_initializationsP = T;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock($system_code_initializations_lock$.getGlobalValue());
            system_code_initializations_internal(perform_app_specific_initializationsP);
        } finally {
            if (NIL != release) {
                release_lock($system_code_initializations_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject system_code_initializations_internal(final SubLObject perform_app_specific_initializationsP) {
        system_code_version_initialization(UNPROVIDED);
        format(T, $str5$Initializing_Cyc__A_A__, system_info.cyc_revision_string(), NIL != string_utilities.non_empty_string_p(cyc_system_code_string()) ? cconcatenate($str6$__, new SubLObject[]{ format_nil.format_nil_a_no_copy(cyc_system_code_string()), $str7$_ }) : $str8$);
        builder_utilities.initialize_cyc_product();
        research_cyc_init.research_cyc_pre_initializations();
        system_code_image_initializations();
        system_code_hl_initializations();
        system_code_inference_initializations();
        system_code_api_initializations();
        if (NIL != perform_app_specific_initializationsP) {
            system_code_application_initializations();
        }
        if (NIL != subl_promotions.positive_integer_p(kb_loaded())) {
            system_kb_initializations();
        } else {
            Errors.warn($str9$No_KB_is_loaded___System_KB_initi);
        }
        $system_code_initializations_marker$.setGlobalValue(Environment.get_process_id(UNPROVIDED));
        return T;
    }

    public static SubLObject cyc_system_code_string() {
        if ($system_code_version_string$.getGlobalValue().isString() && $system_code_release_string$.getGlobalValue().isString()) {
            return cconcatenate(format_nil.format_nil_a_no_copy($system_code_version_string$.getGlobalValue()), new SubLObject[]{ $$$_, format_nil.format_nil_a_no_copy($system_code_release_string$.getGlobalValue()) });
        }
        if ($system_code_version_string$.getGlobalValue().isString()) {
            return $system_code_version_string$.getGlobalValue();
        }
        return $str8$;
    }

    public static SubLObject system_code_version_initialization(SubLObject features) {
        if (features == UNPROVIDED) {
            features = $features$.getDynamicValue();
        }
        if ((NIL != list_utilities.member_eqP($CYC_RESEARCHCYC, features)) && (NIL != list_utilities.member_eqP($CYC_DREAMCATCHER, features))) {
            $system_code_version_string$.setGlobalValue($$$Dreamcatcher);
        } else
            if (NIL != list_utilities.member_eqP($CYC_MAINT, features)) {
                $system_code_version_string$.setGlobalValue($str15$Cyc_Maint);
            } else
                if (NIL != list_utilities.sets_equalP(features, $list16, UNPROVIDED)) {
                    $system_code_version_string$.setGlobalValue($$$OpenCyc);
                } else
                    if (NIL != list_utilities.member_eqP($CYC_OPENCYC, features)) {
                        $system_code_version_string$.setGlobalValue($str19$OpenCyc__custom_);
                    } else
                        if (NIL != list_utilities.sets_equalP(features, $list20, UNPROVIDED)) {
                            $system_code_version_string$.setGlobalValue($$$ResearchCyc);
                        } else
                            if (NIL != list_utilities.member_eqP($CYC_RESEARCHCYC_DEBUG, features)) {
                                $system_code_version_string$.setGlobalValue($str23$ResearchCyc__custom_);
                            } else
                                if (NIL != list_utilities.sets_equalP(features, $list24, UNPROVIDED)) {
                                    $system_code_version_string$.setGlobalValue($$$ResearchCyc);
                                } else
                                    if (NIL != list_utilities.member_eqP($CYC_RESEARCHCYC, features)) {
                                        $system_code_version_string$.setGlobalValue($str23$ResearchCyc__custom_);
                                    } else {
                                        $system_code_version_string$.setGlobalValue($str25$Cyc_Unknown);
                                    }







        return cyc_system_code_string();
    }

    public static SubLObject system_code_initializations_run_p() {
        return numE($system_code_initializations_marker$.getGlobalValue(), Environment.get_process_id(UNPROVIDED));
    }

    public static SubLObject redo_system_code_initializations() {
        $system_code_initializations_marker$.setGlobalValue(NIL);
        return system_code_initializations(UNPROVIDED);
    }

    public static SubLObject system_code_image_initializations() {
        clear_hostname();
        random.seed_random(UNPROVIDED);
        system_info.reset_cycl_start_time(UNPROVIDED);
        set_cyc_image_id();
        clear_machine_bogomips();
        agenda.halt_agenda(UNPROVIDED);
        tcp_server_utilities.validate_all_tcp_servers();
        os_process_utilities.clear_active_os_processes();
        event_broker.remove_stale_core_event_customers();
        process_utilities.note_active_processes_at_startup();
        return T;
    }

    public static SubLObject system_code_hl_initializations() {
        sbhl_module_declarations.initialize_sbhl_modules(UNPROVIDED);
        sbhl_time_modules.cleanly_initialize_sbhl_time_modules();
        return T;
    }

    public static SubLObject system_code_inference_initializations() {
        inference_modules.reclassify_removal_modules();
        hl_storage_modules.reclassify_hl_storage_modules();
        somewhere_cache.reclassify_somewhere_cached_preds();
        inference_datastructures_problem_store.destroy_all_problem_stores();
        forward.clear_currently_forward_propagating_supports();
        inference_datastructures_inference.initialize_pad_table($str27$hack_);
        return T;
    }

    public static SubLObject system_code_api_initializations() {
        eval_in_api.eval_in_api_initialize();
        java_api_kernel.reset_java_api_kernel();
        api_widgets.reset_api_widget_sessions_resources();
        kb_modification_event_filters.reset_external_kb_modification_event_filters_and_listeners();
        kb_modification_event_filters.clear_kb_modification_event_mailboxes();
        return T;
    }

    public static SubLObject system_code_application_initializations() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        html_kernel.clear_all_html_state();
        delayed_processor.reset_delayed_processor(pph_phrase.pph_phrase_destroyer());
        sksi_sks_interaction.sksi_close_resourced_connections();
        semantic_etl_bus.initialize_semantic_etl_infrastructure();
        inference_analysis.clear_asked_query_queue();
        commander.clear_commander_queues();
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    linkage.initialize_pos_tags();
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return T;
    }

    public static SubLObject system_kb_initializations() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        initialize_hl_store_caches();
        validate_hl_and_kb_settings();
        operation_communication.set_the_cyclist(system_parameters.$default_cyclist_name$.getDynamicValue(thread));
        transcript_utilities.initialize_transcript_handling();
        agenda.initialize_agenda();
        initialize_global_locks();
        cyc_testing_initialization.perform_cyc_testing_initializations();
        kct_utils.initialize_kct();
        make_process($str30$file_backed_cache_initializer, INITIALIZE_ALL_FILE_BACKED_CACHES);
        sleep($float$0_5);
        initialize_file_backed_nl_datastructures();
        fact_sheets.maybe_start_new_fact_sheet_updater_default_screensaver_for_user(UNPROVIDED);
        return T;
    }

    public static SubLObject validate_hl_and_kb_settings() {
        if (!max(deduction_handles.next_deduction_id(), assertion_handles.next_assertion_id()).isFixnum()) {
            Errors.cerror($$$Accept_the_risks, $id_space_fixnum_range_problem$.getGlobalValue());
        }
        return $VALIDATED;
    }

    public static SubLObject initialize_file_backed_nl_datastructures() {
        final SubLObject directory = hl_store_caches_directory();
        final SubLObject symbols = get_hl_store_caches_shared_symbols_simple();
        nl_trie.reconnect_nl_trie_backing(directory, symbols);
        return T;
    }

    public static SubLObject get_hl_store_caches_shared_symbols() {
        return $hl_store_caches_shared_symbols$.getGlobalValue();
    }

    public static SubLObject get_hl_store_caches_shared_symbols_simple() {
        return $hl_store_caches_shared_symbols_simple$.getGlobalValue();
    }

    public static SubLObject initialize_hl_store_caches() {
        if (NIL == hl_store_content_completely_cachedP()) {
            return initialize_hl_store_caches_from_directory(hl_store_caches_directory(), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject initialize_hl_store_caches_from_directory(final SubLObject direname, SubLObject symbols) {
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        if (NIL != initialize_hl_store_cache_directory_and_shared_symbols(direname, symbols)) {
            deduction_manager.initialize_deduction_hl_store_cache();
            assertion_manager.initialize_assertion_hl_store_cache();
            constant_index_manager.initialize_constant_index_hl_store_cache();
            nart_index_manager.initialize_nart_index_hl_store_cache();
            nart_hl_formula_manager.initialize_nart_hl_formula_hl_store_cache();
            unrepresented_terms.initialize_unrepresented_term_caches();
            unrepresented_term_index_manager.initialize_unrepresented_term_index_hl_store_cache();
            kb_hl_support_manager.initialize_kb_hl_support_hl_store_cache();
            sbhl_graphs.initialize_sbhl_graph_caches();
            tva_cache.reconnect_tva_cache_registry(direname, get_hl_store_caches_shared_symbols_simple());
        } else {
            Errors.warn($str41$Cannot_initialize_HL_KB_object_ca);
        }
        return T;
    }

    public static SubLObject initialize_hl_store_cache_directory_and_shared_symbols(final SubLObject direname, SubLObject symbols) {
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        if (NIL != Filesys.directory_p(direname)) {
            set_hl_store_caches_directory(direname);
        } else {
            Errors.warn($str42$Do_not_have_a_valid_location_for_, direname);
        }
        if (NIL != Filesys.directory_p(hl_store_caches_directory())) {
            initialize_hl_store_cache_shared_symbols(symbols);
            return T;
        }
        Errors.warn($str43$Could_not_initialize_HL_store_cac, direname);
        return NIL;
    }

    public static SubLObject initialize_hl_store_cache_shared_symbols(SubLObject symbols) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str44$Initializing_HL_backing_store_cac, hl_store_caches_directory());
        if (NIL == symbols) {
            SubLObject error = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        symbols = dumper.load_kb_product_shared_symbols(hl_store_caches_directory());
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (error.isString()) {
                Errors.warn($str46$Could_not_initialize_shared_symbo, hl_store_caches_directory());
            }
        }
        if (NIL != symbols) {
            $hl_store_caches_shared_symbols$.setGlobalValue(symbols);
            $hl_store_caches_shared_symbols_simple$.setGlobalValue(apply(VECTOR, symbols));
            return $hl_store_caches_shared_symbols$.getGlobalValue();
        }
        return NIL;
    }

    public static SubLObject hl_store_content_completely_cachedP() {
        return makeBoolean((((((NIL != deduction_manager.deduction_content_completely_cachedP()) && (NIL != assertion_manager.assertion_content_completely_cachedP())) && (NIL != constant_index_manager.constant_indices_completely_cachedP())) && (NIL != nart_index_manager.nart_indices_completely_cachedP())) && (NIL != unrepresented_term_index_manager.unrepresented_term_indices_completely_cachedP())) && (NIL != sbhl_graphs.sbhl_graph_completely_cachedP()));
    }

    public static SubLObject get_hl_store_cache_filename(final SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = $standard_hl_store_cache_file_extension$.getGlobalValue();
        }
        return cconcatenate($hl_store_caches_directory$.getGlobalValue(), new SubLObject[]{ filename, $str49$_, extension });
    }

    public static SubLObject set_hl_store_caches_directory(final SubLObject directory) {
        $hl_store_caches_directory$.setGlobalValue(directory);
        return NIL;
    }

    public static SubLObject generic_caches_directory() {
        return hl_store_caches_directory();
    }

    public static SubLObject hl_store_caches_directory() {
        if ($hl_store_caches_directory$.getGlobalValue().isString()) {
            return $hl_store_caches_directory$.getGlobalValue();
        }
        set_hl_store_caches_directory(compute_hl_store_caches_directory());
        return $hl_store_caches_directory$.getGlobalValue();
    }

    public static SubLObject compute_hl_store_caches_directory() {
        final SubLObject kb_num = (build_kb_loaded().isFixnum()) ? build_kb_loaded() : kb_loaded();
        final SubLObject directory = format(NIL, $str50$units__A_, operation_communication.kb_number_string(kb_num));
        Errors.warn($str51$Guessing_HL_Store_location_of__A, directory);
        return directory;
    }

    public static SubLObject cdr_eqlP(final SubLObject list, final SubLObject value) {
        return eql(list.rest(), value);
    }

    public static SubLObject not_member_equal(final SubLObject obj, final SubLObject list) {
        return makeBoolean(NIL == subl_promotions.memberP(obj, list, symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject get_indexed_obj(final SubLObject key, final SubLObject alist, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return assoc(key, alist, test, UNPROVIDED).rest();
    }

    public static SubLObject update_vector_indexed_val(final SubLObject vector_key, final SubLObject vector_alist, final SubLObject index_key, final SubLObject index_alist, final SubLObject v_new, SubLObject method, SubLObject test1, SubLObject test2, SubLObject test3) {
        if (method == UNPROVIDED) {
            method = $CONS;
        }
        if (test1 == UNPROVIDED) {
            test1 = symbol_function(EQL);
        }
        if (test2 == UNPROVIDED) {
            test2 = symbol_function(EQL);
        }
        if (test3 == UNPROVIDED) {
            test3 = symbol_function(EQL);
        }
        final SubLObject vec = get_indexed_obj(vector_key, vector_alist, test1);
        final SubLObject index = get_indexed_obj(index_key, index_alist, test2);
        if ((!vec.isVector()) || (!index.isInteger())) {
            return NIL;
        }
        if (NIL != find(method, $list53, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject old_val = aref(vec, index);
            final SubLObject pcase_var = method;
            if (pcase_var.eql($CONS)) {
                set_aref(vec, index, cons(v_new, old_val));
                return vec;
            }
            if (pcase_var.eql($ADJOIN)) {
                if (old_val.isList()) {
                    set_aref(vec, index, adjoin(v_new, old_val, test3, UNPROVIDED));
                }
                return vec;
            }
            if (pcase_var.eql($APPEND)) {
                if (v_new.isList() && old_val.isList()) {
                    set_aref(vec, index, append(v_new, old_val));
                }
                return vec;
            }
            if (pcase_var.eql($UNION)) {
                if (v_new.isList() && old_val.isList()) {
                    set_aref(vec, index, union(v_new, old_val, test3, UNPROVIDED));
                }
                return vec;
            }
            if (pcase_var.eql($CDR)) {
                if (old_val.isList()) {
                    set_aref(vec, index, old_val.rest());
                }
                return vec;
            }
            if (pcase_var.eql($CAR)) {
                if (old_val.isList()) {
                    set_aref(vec, index, old_val.first());
                }
                return vec;
            }
            if (pcase_var.eql($REMOVE)) {
                if (old_val.isList()) {
                    set_aref(vec, index, remove(v_new, old_val, test3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                }
                return vec;
            }
            if (pcase_var.eql($RPLACA)) {
                if (old_val.isCons()) {
                    rplaca(old_val, v_new);
                    set_aref(vec, index, old_val);
                }
                return vec;
            }
            if (pcase_var.eql($RPLACD)) {
                if (old_val.isCons()) {
                    rplacd(old_val, v_new);
                    set_aref(vec, index, old_val);
                }
                return vec;
            }
            if (pcase_var.eql($REVERSE)) {
                if (old_val.isSequence()) {
                    set_aref(vec, index, nreverse(old_val));
                }
                return vec;
            }
            if (pcase_var.eql($INC)) {
                if (old_val.isInteger()) {
                    if (NIL == v_new) {
                        set_aref(vec, index, add(old_val, ONE_INTEGER));
                    } else
                        if (v_new.isInteger() && v_new.numG(ZERO_INTEGER)) {
                            set_aref(vec, index, add(old_val, v_new));
                        }

                }
                return vec;
            }
            if (pcase_var.eql($DEC)) {
                if (old_val.isInteger()) {
                    if ((NIL == v_new) && old_val.numG(ZERO_INTEGER)) {
                        set_aref(vec, index, subtract(old_val, ONE_INTEGER));
                    } else
                        if ((v_new.isInteger() && v_new.numG(ZERO_INTEGER)) && old_val.numG(ZERO_INTEGER)) {
                            SubLObject new_count = subtract(old_val, v_new);
                            if (!new_count.numGE(ZERO_INTEGER)) {
                                new_count = ZERO_INTEGER;
                            }
                            set_aref(vec, index, new_count);
                        }

                }
                return vec;
            }
            return NIL;
        } else {
            if (NIL != find(method, $list65, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                set_aref(vec, index, v_new);
                return vec;
            }
            return NIL;
        }
    }

    public static SubLObject get_vector_indexed_val(final SubLObject vector_key, final SubLObject vector_alist, final SubLObject index_key, final SubLObject index_alist, SubLObject test1, SubLObject test2) {
        if (test1 == UNPROVIDED) {
            test1 = symbol_function(EQL);
        }
        if (test2 == UNPROVIDED) {
            test2 = symbol_function(EQL);
        }
        final SubLObject vec = get_indexed_obj(vector_key, vector_alist, test1);
        final SubLObject index = get_indexed_obj(index_key, index_alist, test2);
        if (vec.isVector() && index.isInteger()) {
            return aref(vec, index);
        }
        return NIL;
    }

    public static SubLObject clear_indexed_vectors(final SubLObject vector_alist) {
        SubLObject cdolist_list_var = vector_alist;
        SubLObject form = NIL;
        form = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject vec = form.rest();
            SubLObject len;
            SubLObject i;
            for (len = length(vec), i = NIL, i = ZERO_INTEGER; i.numL(len); i = add(i, ONE_INTEGER)) {
                set_aref(vec, i, NIL);
            }
            cdolist_list_var = cdolist_list_var.rest();
            form = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject make_indexed_vector(final SubLObject index_alist, SubLObject initial_element) {
        if (initial_element == UNPROVIDED) {
            initial_element = NIL;
        }
        return make_vector(length(index_alist), initial_element);
    }

    public static SubLObject vector_cells_filled(final SubLObject vector) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdotimes_end_var;
        SubLObject i;
        SubLObject val;
        for (cdotimes_end_var = length(vector), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            val = aref(vector, i);
            if (NIL != val) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject extract_until(final SubLObject obj, final SubLObject list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        return ldiff(list, member(obj, list, test, UNPROVIDED));
    }

    public static SubLObject extract_until_any(final SubLObject items, final SubLObject list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        SubLObject result = NIL;
        SubLObject things = NIL;
        SubLObject item = NIL;
        SubLObject v_this = NIL;
        things = items;
        item = things.first();
        v_this = ldiff(list, member(item, list, test, UNPROVIDED));
        while (NIL != things) {
            if ((NIL == result) || (result.isCons() && length(v_this).numL(length(result)))) {
                result = v_this;
            }
            things = things.rest();
            item = things.first();
            v_this = ldiff(list, member(item, list, test, UNPROVIDED));
        } 
        return result;
    }

    public static SubLObject number_list(final SubLObject lst) {
        assert NIL != listp(lst) : "Types.listp(lst) " + "CommonSymbols.NIL != Types.listp(lst) " + lst;
        SubLObject counter = ZERO_INTEGER;
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = lst;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(cons(counter, list(elem)), ans);
            counter = add(counter, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    public static SubLObject aconsnew(final SubLObject item, final SubLObject datum, final SubLObject alist, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (NIL != assoc(item, alist, test, key)) {
            return alist;
        }
        return acons(item, datum, alist);
    }

    public static SubLObject print_n_per_line(final SubLObject objects, final SubLObject n, SubLObject separator) {
        if (separator == UNPROVIDED) {
            separator = CHAR_space;
        }
        assert NIL != list_utilities.proper_list_p(objects) : "list_utilities.proper_list_p(objects) " + "CommonSymbols.NIL != list_utilities.proper_list_p(objects) " + objects;
        assert NIL != subl_promotions.positive_integer_p(n) : "subl_promotions.positive_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(n) " + n;
        SubLObject list_var = NIL;
        SubLObject obj = NIL;
        SubLObject i = NIL;
        list_var = objects;
        obj = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , obj = list_var.first() , i = add(ONE_INTEGER, i)) {
            prin1(obj, UNPROVIDED);
            if (mod(number_utilities.f_1X(i), n).isZero()) {
                terpri(UNPROVIDED);
            } else {
                princ(separator, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject other_binary_arg(final SubLObject arg) {
        if (arg.eql(ONE_INTEGER)) {
            return TWO_INTEGER;
        }
        if (arg.eql(TWO_INTEGER)) {
            return ONE_INTEGER;
        }
        return NIL;
    }

    public static SubLObject number_of_non_null_args(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
        if (arg1 == UNPROVIDED) {
            arg1 = NIL;
        }
        if (arg2 == UNPROVIDED) {
            arg2 = NIL;
        }
        if (arg3 == UNPROVIDED) {
            arg3 = NIL;
        }
        if (arg4 == UNPROVIDED) {
            arg4 = NIL;
        }
        if (arg5 == UNPROVIDED) {
            arg5 = NIL;
        }
        SubLObject count = ZERO_INTEGER;
        if (NIL != arg1) {
            count = add(count, ONE_INTEGER);
        }
        if (NIL != arg2) {
            count = add(count, ONE_INTEGER);
        }
        if (NIL != arg3) {
            count = add(count, ONE_INTEGER);
        }
        if (NIL != arg4) {
            count = add(count, ONE_INTEGER);
        }
        if (NIL != arg5) {
            count = add(count, ONE_INTEGER);
        }
        return count;
    }

    public static SubLObject boolean_to_keyword(final SubLObject v_boolean) {
        if (NIL != v_boolean) {
            return $TRUE;
        }
        return $FALSE;
    }

    public static SubLObject keyword_to_boolean(final SubLObject keyword) {
        return eq($TRUE, keyword);
    }

    public static SubLObject get_unqualified_machine_name() {
        return string_utilities.split_string(Environment.get_machine_name(UNPROVIDED), $list71).first();
    }

    public static SubLObject clear_hostname() {
        final SubLObject cs = $hostname_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_hostname() {
        return memoization_state.caching_state_remove_function_results_with_args($hostname_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject hostname_internal() {
        final SubLObject hostname = Environment.get_machine_name(UNPROVIDED);
        assert NIL != stringp(hostname) : "Types.stringp(hostname) " + "CommonSymbols.NIL != Types.stringp(hostname) " + hostname;
        return Strings.string_downcase(hostname, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject hostname() {
        SubLObject caching_state = $hostname_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(HOSTNAME, $hostname_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(hostname_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject machine_name() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hostname = hostname();
        final SubLObject strings = string_utilities.split_string(hostname, $list71);
        final SubLObject machine_name = strings.first();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != string_utilities.empty_string_p(machine_name))) {
            Errors.error($str75$Could_not_get_hostname_);
        }
        return machine_name;
    }

    public static SubLObject function_spec_function(final SubLObject function_spec) {
        return function_spec.isFunction() ? function_spec : symbol_function(function_spec);
    }

    public static SubLObject machine_bogomips() {
        if ($UNINITIALIZED == $machine_bogomips$.getGlobalValue()) {
            $machine_bogomips$.setGlobalValue(compute_machine_bogomips());
        }
        return $machine_bogomips$.getGlobalValue();
    }

    public static SubLObject clear_machine_bogomips() {
        $machine_bogomips$.setGlobalValue($UNINITIALIZED);
        return $machine_bogomips$.getGlobalValue();
    }

    public static SubLObject compute_machine_bogomips() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text($str77$_proc_cpuinfo, $INPUT);
                        if (!stream.isStream()) {
                            // Errors.error((SubLObject)$str79$Unable_to_open__S,
                            // (SubLObject)$str77$_proc_cpuinfo);
                        }
                        final SubLObject s = stream;
                        if (NIL != s) {
                            while (NIL == result) {
                                final SubLObject line = string_utilities.network_read_line(s, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != search($$$bogomips, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    result = read_from_string(string_utilities.substring(line, number_utilities.f_1X(search($str81$_, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } 
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return result;
    }

    public static SubLObject scale_by_bogomips(final SubLObject numbers, final SubLObject bogomips) {
        final SubLObject local_bogomips = machine_bogomips();
        if ((!local_bogomips.isNumber()) || local_bogomips.numE(bogomips)) {
            return numbers;
        }
        final SubLObject scaling_factor = divide(bogomips, local_bogomips);
        SubLObject scaled_numbers = NIL;
        SubLObject cdolist_list_var = numbers;
        SubLObject number = NIL;
        number = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            scaled_numbers = cons(multiply(number, scaling_factor), scaled_numbers);
            cdolist_list_var = cdolist_list_var.rest();
            number = cdolist_list_var.first();
        } 
        return nreverse(scaled_numbers);
    }

    public static SubLObject uninitialized() {
        return $UNINITIALIZED;
    }

    public static SubLObject uninitialized_p(final SubLObject v_object) {
        return eq(v_object, uninitialized());
    }

    public static SubLObject initialized_p(final SubLObject v_object) {
        return makeBoolean(NIL == uninitialized_p(v_object));
    }

    public static SubLObject warn_unless(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, $list82);
        form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        format_string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        return list(PUNLESS, form, listS(WARN, format_string, append(v_arguments, NIL)));
    }

    public static SubLObject would_be_nice_if(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, $list82);
        form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list82);
        format_string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        return listS(WARN_UNLESS, form, format_string, append(v_arguments, NIL));
    }

    public static SubLObject force_room(SubLObject x) {
        if (x == UNPROVIDED) {
            x = $DEFAULT;
        }
        Storage.room(x);
        force_output(UNPROVIDED);
        return NIL;
    }

    public static SubLObject subl_variable_binding_list_p(final SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != list_utilities.every_in_list(SUBL_VARIABLE_BINDING_P, v_object, UNPROVIDED)));
    }

    public static SubLObject subl_variable_binding_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.doubletonP(v_object)) && v_object.first().isSymbol());
    }

    public static SubLObject subl_variable_binding_list_variables(final SubLObject subl_binding_list) {
        assert NIL != subl_variable_binding_list_p(subl_binding_list) : "misc_utilities.subl_variable_binding_list_p(subl_binding_list) " + "CommonSymbols.NIL != misc_utilities.subl_variable_binding_list_p(subl_binding_list) " + subl_binding_list;
        return Mapping.mapcar(FIRST, subl_binding_list);
    }

    public static SubLObject subl_variable_binding_list_values(final SubLObject subl_binding_list) {
        assert NIL != subl_variable_binding_list_p(subl_binding_list) : "misc_utilities.subl_variable_binding_list_p(subl_binding_list) " + "CommonSymbols.NIL != misc_utilities.subl_variable_binding_list_p(subl_binding_list) " + subl_binding_list;
        return Mapping.mapcar(SECOND, subl_binding_list);
    }

    public static SubLObject flush_all_logs() {
        task_processor.flush_tpool_background_msgs();
        return $DONE;
    }

    public static SubLObject apropos_methods(final SubLObject name, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject v_methods = methods_matching_name(name);
        return show_apropos_methods_summary(v_methods, stream);
    }

    public static SubLObject apropos_globals(final SubLObject name, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject globals = globals_matching_name(name);
        return show_apropos_globals_summary(globals, stream);
    }

    public static SubLObject show_apropos_methods_summary(final SubLObject v_methods, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = v_methods;
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject arglist = subl_promotions.function_symbol_arglist(method);
            final SubLObject doc = method_documentation(method);
            final SubLObject tuple = listS(method, arglist, append(NIL != doc ? list(doc) : NIL, NIL));
            tuples = cons(tuple, tuples);
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        tuples = nreverse(tuples);
        show_apropos_results(tuples, stream);
        return length(tuples);
    }

    public static SubLObject show_apropos_globals_summary(final SubLObject globals, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = globals;
        SubLObject global = NIL;
        global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject doc = global_documentation(global);
            final SubLObject tuple = bq_cons(global, append(NIL != doc ? list(doc) : NIL, NIL));
            tuples = cons(tuple, tuples);
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        } 
        tuples = nreverse(tuples);
        show_apropos_results(tuples, stream);
        return length(tuples);
    }

    public static SubLObject methods_matching_name(final SubLObject name_spec) {
        return apropos_wrt_name_spec(name_spec, FBOUNDP, UNPROVIDED);
    }

    public static SubLObject globals_matching_name(final SubLObject name_spec) {
        return apropos_wrt_name_spec(name_spec, BOUNDP, UNPROVIDED);
    }

    public static SubLObject apropos_wrt_name_spec(final SubLObject name_spec, SubLObject filter, SubLObject match) {
        if (filter == UNPROVIDED) {
            filter = IDENTITY;
        }
        if (match == UNPROVIDED) {
            match = SEARCH;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!name_spec.isString())) && (NIL == list_utilities.list_of_type_p(STRINGP, name_spec))) {
            Errors.error($str96$Unexpected_name_spec____S, name_spec);
        }
        final SubLObject names = (name_spec.isString()) ? list(Strings.string_upcase(name_spec, UNPROVIDED, UNPROVIDED)) : Mapping.mapcar(symbol_function(STRING_UPCASE), name_spec);
        SubLObject symbols = NIL;
        SubLObject cdolist_list_var = list($sublisp_package$.getGlobalValue(), $cyc_package$.getGlobalValue());
        SubLObject v_package = NIL;
        v_package = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cdo_symbols_package = v_package;
            final SubLObject cdo_symbols_iterator = NIL;
            SubLObject sym = NIL;
            final Iterator cdo_symbols_iterator_$2 = makeSymbolIterator(cdo_symbols_package);
            while (symbolIteratorHasNext(cdo_symbols_iterator_$2)) {
                sym = symbolIteratorNext(cdo_symbols_iterator_$2);
                if (NIL != funcall(filter, sym)) {
                    final SubLObject symbol_name = symbol_name(sym);
                    SubLObject missing = NIL;
                    if (NIL == missing) {
                        SubLObject csome_list_var = names;
                        SubLObject name = NIL;
                        name = csome_list_var.first();
                        while ((NIL == missing) && (NIL != csome_list_var)) {
                            if (NIL == funcall(match, name, symbol_name)) {
                                missing = name;
                            }
                            csome_list_var = csome_list_var.rest();
                            name = csome_list_var.first();
                        } 
                    }
                    if (NIL != missing) {
                        continue;
                    }
                    final SubLObject item_var = sym;
                    if (NIL != member(item_var, symbols, symbol_function(EQL), symbol_function(IDENTITY))) {
                        continue;
                    }
                    symbols = cons(item_var, symbols);
                }
            } 
            cdolist_list_var = cdolist_list_var.rest();
            v_package = cdolist_list_var.first();
        } 
        symbols = Sort.sort(symbols, symbol_function(STRING_LESSP), symbol_function(SYMBOL_NAME));
        return symbols;
    }

    public static SubLObject show_apropos_results(final SubLObject tuples, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject cdolist_list_var = tuples;
        SubLObject tuple = NIL;
        tuple = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = tuple;
            SubLObject symbol = NIL;
            destructuring_bind_must_consp(current, datum, $list100);
            symbol = current.first();
            final SubLObject rest;
            current = rest = current.rest();
            if ((NIL != fboundp(symbol)) && rest.first().isList()) {
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = rest;
                SubLObject arglist = NIL;
                destructuring_bind_must_consp(current_$4, datum_$3, $list101);
                arglist = current_$4.first();
                current_$4 = current_$4.rest();
                final SubLObject documentation = (current_$4.isCons()) ? current_$4.first() : NIL;
                destructuring_bind_must_listp(current_$4, datum_$3, $list101);
                current_$4 = current_$4.rest();
                if (NIL == current_$4) {
                    format(stream, $str102$___S_, symbol);
                    if (NIL != arglist) {
                        format(stream, $str103$_S, arglist);
                    } else {
                        format(stream, $str104$__);
                    }
                    if (documentation.isString()) {
                        format(stream, $str105$_____S__, documentation);
                    }
                } else {
                    cdestructuring_bind_error(datum_$3, $list101);
                }
            }
            if (NIL != boundp(symbol)) {
                SubLObject current_$5;
                final SubLObject datum_$4 = current_$5 = rest;
                final SubLObject documentation2 = (current_$5.isCons()) ? current_$5.first() : NIL;
                destructuring_bind_must_listp(current_$5, datum_$4, $list106);
                final SubLObject whatever;
                current_$5 = whatever = current_$5.rest();
                format(stream, $str107$___S__S, symbol, eval(symbol));
                if (documentation2.isString()) {
                    format(stream, $str105$_____S__, documentation2);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject method_documentation(final SubLObject method) {
        return NIL;
    }

    public static SubLObject global_documentation(final SubLObject global) {
        return NIL;
    }

    public static SubLObject method_complete(final SubLObject name_prefix) {
        assert NIL != string_utilities.non_empty_string_p(name_prefix) : "string_utilities.non_empty_string_p(name_prefix) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(name_prefix) " + name_prefix;
        return symbol_complete(name_prefix, FBOUNDP);
    }

    public static SubLObject global_complete(final SubLObject name_prefix) {
        assert NIL != string_utilities.non_empty_string_p(name_prefix) : "string_utilities.non_empty_string_p(name_prefix) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(name_prefix) " + name_prefix;
        return symbol_complete(name_prefix, BOUNDP);
    }

    public static SubLObject symbol_complete(SubLObject name_prefix, SubLObject filter) {
        if (filter == UNPROVIDED) {
            filter = TRUE;
        }
        name_prefix = Strings.string_upcase(name_prefix, UNPROVIDED, UNPROVIDED);
        final SubLObject candidates = apropos_wrt_name_spec(name_prefix, filter, STRING_IS_PREFIX_OF);
        final SubLObject symbol_names = Mapping.mapcar(symbol_function(SYMBOL_NAME), candidates);
        final SubLObject shared_extension = sorted_strings_shared_extension(symbol_names, name_prefix);
        return values(candidates, shared_extension);
    }

    public static SubLObject string_is_prefix_of(final SubLObject prefix, final SubLObject larger_string) {
        return string_utilities.starts_with(larger_string, prefix);
    }

    public static SubLObject sorted_strings_shared_extension(final SubLObject strings, final SubLObject common_prefix) {
        if (NIL == strings) {
            return $str8$;
        }
        final SubLObject first_string = strings.first();
        final SubLObject last_string = list_utilities.last_one(strings);
        final SubLObject shared_extension_start = length(common_prefix);
        if (NIL != list_utilities.singletonP(strings)) {
            return subseq(first_string, shared_extension_start, UNPROVIDED);
        }
        final SubLObject shared_extension_end = mismatch(first_string, last_string, symbol_function(EQL), symbol_function(IDENTITY), shared_extension_start, NIL, shared_extension_start, NIL);
        final SubLObject shared_extension = (shared_extension_end.isInteger() && shared_extension_end.numGE(shared_extension_start)) ? subseq(first_string, shared_extension_start, shared_extension_end) : $str8$;
        return shared_extension;
    }

    public static SubLObject memoization_state_method_entry_tuples_for_display(final SubLObject v_memoization_state, final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) " + v_memoization_state;
        final SubLObject caching_state = memoization_state.memoization_state_lookup(v_memoization_state, method, UNPROVIDED);
        if (NIL != memoization_state.caching_state_p(caching_state)) {
            final SubLObject args_length = memoization_state.caching_state_args_length(caching_state);
            SubLObject tuples = NIL;
            final SubLObject pcase_var = args_length;
            if (pcase_var.eql(ZERO_INTEGER)) {
                final SubLObject values = memoization_state.caching_state_zero_arg_results(caching_state);
                if (values.isList()) {
                    final SubLObject tuple = listS(NIL, copy_list(values));
                    tuples = cons(tuple, tuples);
                }
            } else
                if (pcase_var.eql(ONE_INTEGER)) {
                    final SubLObject map = memoization_state.caching_state_store(caching_state);
                    final SubLObject iterator = map_utilities.new_map_iterator(map);
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject arg = NIL;
                            SubLObject values2 = NIL;
                            destructuring_bind_must_consp(current, datum, $list112);
                            arg = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list112);
                            values2 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                final SubLObject tuple2 = listS(list(arg), copy_list(values2));
                                tuples = cons(tuple2, tuples);
                            } else {
                                cdestructuring_bind_error(datum, $list112);
                            }
                        }
                    }
                } else {
                    final SubLObject map = memoization_state.caching_state_store(caching_state);
                    final SubLObject iterator = map_utilities.new_map_iterator(map);
                    SubLObject valid;
                    for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                        thread.resetMultipleValues();
                        final SubLObject var = iteration.iteration_next(iterator);
                        valid = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != valid) {
                            SubLObject current;
                            final SubLObject datum = current = var;
                            SubLObject sxhash = NIL;
                            SubLObject collisions = NIL;
                            destructuring_bind_must_consp(current, datum, $list113);
                            sxhash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list113);
                            collisions = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                SubLObject cdolist_list_var = collisions;
                                SubLObject collision = NIL;
                                collision = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    SubLObject current_$8;
                                    final SubLObject datum_$7 = current_$8 = collision;
                                    SubLObject args = NIL;
                                    SubLObject values3 = NIL;
                                    destructuring_bind_must_consp(current_$8, datum_$7, $list114);
                                    args = current_$8.first();
                                    current_$8 = current_$8.rest();
                                    destructuring_bind_must_consp(current_$8, datum_$7, $list114);
                                    values3 = current_$8.first();
                                    current_$8 = current_$8.rest();
                                    if (NIL == current_$8) {
                                        final SubLObject tuple3 = listS(copy_list(args), copy_list(values3));
                                        tuples = cons(tuple3, tuples);
                                    } else {
                                        cdestructuring_bind_error(datum_$7, $list114);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    collision = cdolist_list_var.first();
                                } 
                            } else {
                                cdestructuring_bind_error(datum, $list113);
                            }
                        }
                    }
                }

            tuples = Sort.sort(tuples, symbol_function($sym115$TERM__), symbol_function(FIRST));
            return tuples;
        }
        return NIL;
    }

    public static SubLObject show_memoization_state(final SubLObject v_memoization_state, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) " + v_memoization_state;
        SubLObject v_methods = memoization_state.memoization_state_keys(v_memoization_state);
        SubLObject cdolist_list_var;
        v_methods = cdolist_list_var = kb_utilities.sort_terms(v_methods, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject tuples = memoization_state_method_entry_tuples_for_display(v_memoization_state, method);
            if (NIL != tuples) {
                format(stream, $str116$____Method____S, method);
                SubLObject cdolist_list_var_$9 = tuples;
                SubLObject tuple = NIL;
                tuple = cdolist_list_var_$9.first();
                while (NIL != cdolist_list_var_$9) {
                    terpri(stream);
                    SubLObject current;
                    final SubLObject datum = current = tuple;
                    SubLObject args = NIL;
                    SubLObject values = NIL;
                    destructuring_bind_must_consp(current, datum, $list117);
                    args = current.first();
                    current = values = current.rest();
                    if (NIL != args) {
                        if (NIL != list_utilities.singletonP(args)) {
                            format(stream, $str118$_S_, args.first());
                        } else {
                            format(stream, $str118$_S_, args);
                        }
                    }
                    write_string($str119$___, stream, UNPROVIDED, UNPROVIDED);
                    if (NIL != list_utilities.singletonP(values)) {
                        format(stream, $str103$_S, values.first());
                    } else {
                        format(stream, $str120$values__S, values);
                    }
                    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                    tuple = cdolist_list_var_$9.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        return v_memoization_state;
    }

    public static SubLObject declare_misc_utilities_file() {
        declareFunction(me, "copyright_notice", "COPYRIGHT-NOTICE", 0, 0, false);
        declareFunction(me, "kb_content_copyright_notice", "KB-CONTENT-COPYRIGHT-NOTICE", 0, 0, false);
        declareFunction(me, "write_kb_content_copyright_notice", "WRITE-KB-CONTENT-COPYRIGHT-NOTICE", 1, 0, false);
        declareFunction(me, "system_code_initializations", "SYSTEM-CODE-INITIALIZATIONS", 0, 1, false);
        declareFunction(me, "system_code_initializations_internal", "SYSTEM-CODE-INITIALIZATIONS-INTERNAL", 1, 0, false);
        declareFunction(me, "cyc_system_code_string", "CYC-SYSTEM-CODE-STRING", 0, 0, false);
        declareFunction(me, "system_code_version_initialization", "SYSTEM-CODE-VERSION-INITIALIZATION", 0, 1, false);
        declareFunction(me, "system_code_initializations_run_p", "SYSTEM-CODE-INITIALIZATIONS-RUN-P", 0, 0, false);
        declareFunction(me, "redo_system_code_initializations", "REDO-SYSTEM-CODE-INITIALIZATIONS", 0, 0, false);
        declareFunction(me, "system_code_image_initializations", "SYSTEM-CODE-IMAGE-INITIALIZATIONS", 0, 0, false);
        declareFunction(me, "system_code_hl_initializations", "SYSTEM-CODE-HL-INITIALIZATIONS", 0, 0, false);
        declareFunction(me, "system_code_inference_initializations", "SYSTEM-CODE-INFERENCE-INITIALIZATIONS", 0, 0, false);
        declareFunction(me, "system_code_api_initializations", "SYSTEM-CODE-API-INITIALIZATIONS", 0, 0, false);
        declareFunction(me, "system_code_application_initializations", "SYSTEM-CODE-APPLICATION-INITIALIZATIONS", 0, 0, false);
        declareFunction(me, "system_kb_initializations", "SYSTEM-KB-INITIALIZATIONS", 0, 0, false);
        declareFunction(me, "validate_hl_and_kb_settings", "VALIDATE-HL-AND-KB-SETTINGS", 0, 0, false);
        declareFunction(me, "initialize_file_backed_nl_datastructures", "INITIALIZE-FILE-BACKED-NL-DATASTRUCTURES", 0, 0, false);
        declareFunction(me, "get_hl_store_caches_shared_symbols", "GET-HL-STORE-CACHES-SHARED-SYMBOLS", 0, 0, false);
        declareFunction(me, "get_hl_store_caches_shared_symbols_simple", "GET-HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE", 0, 0, false);
        declareFunction(me, "initialize_hl_store_caches", "INITIALIZE-HL-STORE-CACHES", 0, 0, false);
        declareFunction(me, "initialize_hl_store_caches_from_directory", "INITIALIZE-HL-STORE-CACHES-FROM-DIRECTORY", 1, 1, false);
        declareFunction(me, "initialize_hl_store_cache_directory_and_shared_symbols", "INITIALIZE-HL-STORE-CACHE-DIRECTORY-AND-SHARED-SYMBOLS", 1, 1, false);
        declareFunction(me, "initialize_hl_store_cache_shared_symbols", "INITIALIZE-HL-STORE-CACHE-SHARED-SYMBOLS", 1, 0, false);
        declareFunction(me, "hl_store_content_completely_cachedP", "HL-STORE-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction(me, "get_hl_store_cache_filename", "GET-HL-STORE-CACHE-FILENAME", 1, 1, false);
        declareFunction(me, "set_hl_store_caches_directory", "SET-HL-STORE-CACHES-DIRECTORY", 1, 0, false);
        declareFunction(me, "generic_caches_directory", "GENERIC-CACHES-DIRECTORY", 0, 0, false);
        declareFunction(me, "hl_store_caches_directory", "HL-STORE-CACHES-DIRECTORY", 0, 0, false);
        declareFunction(me, "compute_hl_store_caches_directory", "COMPUTE-HL-STORE-CACHES-DIRECTORY", 0, 0, false);
        declareFunction(me, "cdr_eqlP", "CDR-EQL?", 2, 0, false);
        declareFunction(me, "not_member_equal", "NOT-MEMBER-EQUAL", 2, 0, false);
        declareFunction(me, "get_indexed_obj", "GET-INDEXED-OBJ", 2, 1, false);
        declareFunction(me, "update_vector_indexed_val", "UPDATE-VECTOR-INDEXED-VAL", 5, 4, false);
        declareFunction(me, "get_vector_indexed_val", "GET-VECTOR-INDEXED-VAL", 4, 2, false);
        declareFunction(me, "clear_indexed_vectors", "CLEAR-INDEXED-VECTORS", 1, 0, false);
        declareFunction(me, "make_indexed_vector", "MAKE-INDEXED-VECTOR", 1, 1, false);
        declareFunction(me, "vector_cells_filled", "VECTOR-CELLS-FILLED", 1, 0, false);
        declareFunction(me, "extract_until", "EXTRACT-UNTIL", 2, 1, false);
        declareFunction(me, "extract_until_any", "EXTRACT-UNTIL-ANY", 2, 1, false);
        declareFunction(me, "number_list", "NUMBER-LIST", 1, 0, false);
        declareFunction(me, "aconsnew", "ACONSNEW", 3, 2, false);
        declareFunction(me, "print_n_per_line", "PRINT-N-PER-LINE", 2, 1, false);
        declareFunction(me, "other_binary_arg", "OTHER-BINARY-ARG", 1, 0, false);
        declareFunction(me, "number_of_non_null_args", "NUMBER-OF-NON-NULL-ARGS", 0, 5, false);
        declareFunction(me, "boolean_to_keyword", "BOOLEAN-TO-KEYWORD", 1, 0, false);
        declareFunction(me, "keyword_to_boolean", "KEYWORD-TO-BOOLEAN", 1, 0, false);
        declareFunction(me, "get_unqualified_machine_name", "GET-UNQUALIFIED-MACHINE-NAME", 0, 0, false);
        declareFunction(me, "clear_hostname", "CLEAR-HOSTNAME", 0, 0, false);
        declareFunction(me, "remove_hostname", "REMOVE-HOSTNAME", 0, 0, false);
        declareFunction(me, "hostname_internal", "HOSTNAME-INTERNAL", 0, 0, false);
        declareFunction(me, "hostname", "HOSTNAME", 0, 0, false);
        declareFunction(me, "machine_name", "MACHINE-NAME", 0, 0, false);
        declareFunction(me, "function_spec_function", "FUNCTION-SPEC-FUNCTION", 1, 0, false);
        declareFunction(me, "machine_bogomips", "MACHINE-BOGOMIPS", 0, 0, false);
        declareFunction(me, "clear_machine_bogomips", "CLEAR-MACHINE-BOGOMIPS", 0, 0, false);
        declareFunction(me, "compute_machine_bogomips", "COMPUTE-MACHINE-BOGOMIPS", 0, 0, false);
        declareFunction(me, "scale_by_bogomips", "SCALE-BY-BOGOMIPS", 2, 0, false);
        declareFunction(me, "uninitialized", "UNINITIALIZED", 0, 0, false);
        declareFunction(me, "uninitialized_p", "UNINITIALIZED-P", 1, 0, false);
        declareFunction(me, "initialized_p", "INITIALIZED-P", 1, 0, false);
        declareMacro(me, "warn_unless", "WARN-UNLESS");
        declareMacro(me, "would_be_nice_if", "WOULD-BE-NICE-IF");
        declareFunction(me, "force_room", "FORCE-ROOM", 0, 1, false);
        declareFunction(me, "subl_variable_binding_list_p", "SUBL-VARIABLE-BINDING-LIST-P", 1, 0, false);
        declareFunction(me, "subl_variable_binding_p", "SUBL-VARIABLE-BINDING-P", 1, 0, false);
        declareFunction(me, "subl_variable_binding_list_variables", "SUBL-VARIABLE-BINDING-LIST-VARIABLES", 1, 0, false);
        declareFunction(me, "subl_variable_binding_list_values", "SUBL-VARIABLE-BINDING-LIST-VALUES", 1, 0, false);
        declareFunction(me, "flush_all_logs", "FLUSH-ALL-LOGS", 0, 0, false);
        declareFunction(me, "apropos_methods", "APROPOS-METHODS", 1, 1, false);
        declareFunction(me, "apropos_globals", "APROPOS-GLOBALS", 1, 1, false);
        declareFunction(me, "show_apropos_methods_summary", "SHOW-APROPOS-METHODS-SUMMARY", 1, 1, false);
        declareFunction(me, "show_apropos_globals_summary", "SHOW-APROPOS-GLOBALS-SUMMARY", 1, 1, false);
        declareFunction(me, "methods_matching_name", "METHODS-MATCHING-NAME", 1, 0, false);
        declareFunction(me, "globals_matching_name", "GLOBALS-MATCHING-NAME", 1, 0, false);
        declareFunction(me, "apropos_wrt_name_spec", "APROPOS-WRT-NAME-SPEC", 1, 2, false);
        declareFunction(me, "show_apropos_results", "SHOW-APROPOS-RESULTS", 1, 1, false);
        declareFunction(me, "method_documentation", "METHOD-DOCUMENTATION", 1, 0, false);
        declareFunction(me, "global_documentation", "GLOBAL-DOCUMENTATION", 1, 0, false);
        declareFunction(me, "method_complete", "METHOD-COMPLETE", 1, 0, false);
        declareFunction(me, "global_complete", "GLOBAL-COMPLETE", 1, 0, false);
        declareFunction(me, "symbol_complete", "SYMBOL-COMPLETE", 1, 1, false);
        declareFunction(me, "string_is_prefix_of", "STRING-IS-PREFIX-OF", 2, 0, false);
        declareFunction(me, "sorted_strings_shared_extension", "SORTED-STRINGS-SHARED-EXTENSION", 2, 0, false);
        declareFunction(me, "memoization_state_method_entry_tuples_for_display", "MEMOIZATION-STATE-METHOD-ENTRY-TUPLES-FOR-DISPLAY", 2, 0, false);
        declareFunction(me, "show_memoization_state", "SHOW-MEMOIZATION-STATE", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_misc_utilities_file() {
        defconstant("*KB-CONTENT-COPYRIGHT-NOTICE*", $str1$___Copyright__c__1998___2014_Cyco);
        deflexical("*SYSTEM-CODE-INITIALIZATIONS-MARKER*", SubLTrampolineFile.maybeDefault($system_code_initializations_marker$, $system_code_initializations_marker$, () -> Environment.get_process_id(UNPROVIDED)));
        deflexical("*SYSTEM-CODE-INITIALIZATIONS-LOCK*", SubLTrampolineFile.maybeDefault($system_code_initializations_lock$, $system_code_initializations_lock$, () -> make_lock($$$System_Code_Initializations_Lock)));
        deflexical("*SYSTEM-CODE-VERSION-STRING*", NIL);
        deflexical("*SYSTEM-CODE-RELEASE-STRING*", NIL);
        deflexical("*ID-SPACE-FIXNUM-RANGE-PROBLEM*", cconcatenate($str33$__Your_KB_object_ID_space_has_out, new SubLObject[]{ $str34$__Performance__and_most_likely_co, $str35$__Relaunch_your_image_with_more_F }));
        deflexical("*HL-STORE-CACHES-DIRECTORY*", SubLTrampolineFile.maybeDefault($hl_store_caches_directory$, $hl_store_caches_directory$, NIL));
        deflexical("*HL-STORE-CACHES-SHARED-SYMBOLS*", SubLTrampolineFile.maybeDefault($hl_store_caches_shared_symbols$, $hl_store_caches_shared_symbols$, NIL));
        deflexical("*HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE*", SubLTrampolineFile.maybeDefault($hl_store_caches_shared_symbols_simple$, $hl_store_caches_shared_symbols_simple$, NIL));
        deflexical("*STANDARD-HL-STORE-CACHE-FILE-EXTENSION*", $$$cfasl);
        deflexical("*HOSTNAME-CACHING-STATE*", NIL);
        deflexical("*MACHINE-BOGOMIPS*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_misc_utilities_file() {
        declare_defglobal($system_code_initializations_marker$);
        declare_defglobal($system_code_initializations_lock$);
        register_external_symbol(SYSTEM_CODE_INITIALIZATIONS_RUN_P);
        declare_defglobal($hl_store_caches_directory$);
        declare_defglobal($hl_store_caches_shared_symbols$);
        declare_defglobal($hl_store_caches_shared_symbols_simple$);
        memoization_state.note_globally_cached_function(HOSTNAME);
        register_external_symbol(FLUSH_ALL_LOGS);
        note_funcall_helper_function(STRING_IS_PREFIX_OF);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_misc_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_misc_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_misc_utilities_file();
    }

    static {






































































































































    }
}

/**
 * Total time: 651 ms
 */
