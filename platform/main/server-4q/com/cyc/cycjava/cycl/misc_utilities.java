/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.agenda.initialize_agenda;
import static com.cyc.cycjava.cycl.control_vars.$cyc_package$;
import static com.cyc.cycjava.cycl.control_vars.$sublisp_package$;
import static com.cyc.cycjava.cycl.control_vars.build_kb_loaded;
import static com.cyc.cycjava.cycl.control_vars.kb_loaded;
import static com.cyc.cycjava.cycl.control_vars.set_cyc_image_id;
import static com.cyc.cycjava.cycl.list_utilities.doubletonP;
import static com.cyc.cycjava.cycl.list_utilities.every_in_list;
import static com.cyc.cycjava.cycl.string_utilities.empty_string_p;
import static com.cyc.cycjava.cycl.string_utilities.split_string;
import static com.cyc.cycjava.cycl.string_utilities.substring;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.system_info.reset_cycl_start_time;
import static com.cyc.cycjava.cycl.utilities_macros.initialize_global_locks;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_period;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_space;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.makeSymbolIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.symbolIteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.symbolIteratorNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.mismatch;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.search;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.make_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.set_aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.acons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.ldiff;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.prin1;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.$features$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.read_line;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import java.util.Iterator;

import com.cyc.cycjava.cycl.cyc_testing.cyc_testing_initialization;
import com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils;
import com.cyc.cycjava.cycl.inference.harness.forward;
import com.cyc.cycjava.cycl.inference.harness.inference_analysis;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_inference;
import com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.cycjava.cycl.sksi.semantic_etl_bus;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.thesaurus.tm_control_vars;
import com.cyc.cycjava.cycl.thesaurus.tm_datastructures;
import com.cyc.cycjava.cycl.thesaurus.tm_internals;
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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MISC-UTILITIES
 * source file: /cyc/top/cycl/misc-utilities.lisp
 * created:     2019/07/03 17:37:16
 */
public final class misc_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new misc_utilities();



    // defconstant
    @LispMethod(comment = "defconstant")
    private static final SubLSymbol $kb_content_copyright_notice$ = makeSymbol("*KB-CONTENT-COPYRIGHT-NOTICE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $system_code_version_string$ = makeSymbol("*SYSTEM-CODE-VERSION-STRING*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $system_code_release_string$ = makeSymbol("*SYSTEM-CODE-RELEASE-STRING*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $id_space_fixnum_range_problem$ = makeSymbol("*ID-SPACE-FIXNUM-RANGE-PROBLEM*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $standard_hl_store_cache_file_extension$ = makeSymbol("*STANDARD-HL-STORE-CACHE-FILE-EXTENSION*");

    // deflexical
    @LispMethod(comment = "deflexical")
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

    private static final SubLList $list53 = list(new SubLObject[]{ $CONS, makeKeyword("ADJOIN"), makeKeyword("APPEND"), makeKeyword("UNION"), makeKeyword("CDR"), makeKeyword("CAR"), makeKeyword("RPLACA"), makeKeyword("REMOVE"), makeKeyword("RPLACD"), makeKeyword("REVERSE"), makeKeyword("INC"), makeKeyword("DEC") });

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

    // Definitions
    public static final SubLObject copyright_notice_alt() {
        return $str_alt0$Copyright__c__1995___2009_Cycorp_;
    }

    // Definitions
    public static SubLObject copyright_notice() {
        return misc_utilities.$str0$Copyright__c__1995___2014_Cycorp_;
    }

    public static final SubLObject kb_content_copyright_notice_alt() {
        return $kb_content_copyright_notice$.getGlobalValue();
    }

    public static SubLObject kb_content_copyright_notice() {
        return misc_utilities.$kb_content_copyright_notice$.getGlobalValue();
    }

    public static final SubLObject write_kb_content_copyright_notice_alt(SubLObject stream) {
        princ(com.cyc.cycjava.cycl.misc_utilities.kb_content_copyright_notice(), stream);
        return NIL;
    }

    public static SubLObject write_kb_content_copyright_notice(final SubLObject stream) {
        princ(misc_utilities.kb_content_copyright_notice(), stream);
        return NIL;
    }

    /**
     * Initializations which should be run every time the system code is initialized.
     */
    @LispMethod(comment = "Initializations which should be run every time the system code is initialized.")
    public static final SubLObject system_code_initializations_alt(SubLObject perform_app_specific_initializationsP) {
        if (perform_app_specific_initializationsP == UNPROVIDED) {
            perform_app_specific_initializationsP = T;
        }
        builder_utilities.initialize_cyc_product();
        com.cyc.cycjava.cycl.misc_utilities.system_code_image_initializations();
        com.cyc.cycjava.cycl.misc_utilities.system_code_hl_initializations();
        com.cyc.cycjava.cycl.misc_utilities.system_code_inference_initializations();
        com.cyc.cycjava.cycl.misc_utilities.system_code_api_initializations();
        if (NIL != perform_app_specific_initializationsP) {
            com.cyc.cycjava.cycl.misc_utilities.system_code_application_initializations();
        }
        if (NIL != subl_promotions.positive_integer_p(kb_loaded())) {
            com.cyc.cycjava.cycl.misc_utilities.system_kb_initializations();
        } else {
            Errors.warn($str_alt3$No_KB_is_loaded___System_KB_initi);
        }
        $system_code_initializations_marker$.setGlobalValue(Environment.get_process_id(UNPROVIDED));
        return T;
    }

    /**
     * Initializations which should be run every time the system code is initialized.
     */
    @LispMethod(comment = "Initializations which should be run every time the system code is initialized.")
    public static SubLObject system_code_initializations(SubLObject perform_app_specific_initializationsP) {
        if (perform_app_specific_initializationsP == UNPROVIDED) {
            perform_app_specific_initializationsP = T;
        }
        SubLObject release = NIL;
        try {
            release = seize_lock(misc_utilities.$system_code_initializations_lock$.getGlobalValue());
            misc_utilities.system_code_initializations_internal(perform_app_specific_initializationsP);
        } finally {
            if (NIL != release) {
                release_lock(misc_utilities.$system_code_initializations_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject system_code_initializations_internal(final SubLObject perform_app_specific_initializationsP) {
        misc_utilities.system_code_version_initialization(UNPROVIDED);
        format(T, misc_utilities.$str5$Initializing_Cyc__A_A__, system_info.cyc_revision_string(), NIL != string_utilities.non_empty_string_p(misc_utilities.cyc_system_code_string()) ? cconcatenate(misc_utilities.$str6$__, new SubLObject[]{ format_nil.format_nil_a_no_copy(misc_utilities.cyc_system_code_string()), misc_utilities.$str7$_ }) : misc_utilities.$str8$);
        builder_utilities.initialize_cyc_product();
        research_cyc_init.research_cyc_pre_initializations();
        misc_utilities.system_code_image_initializations();
        misc_utilities.system_code_hl_initializations();
        misc_utilities.system_code_inference_initializations();
        misc_utilities.system_code_api_initializations();
        if (NIL != perform_app_specific_initializationsP) {
            misc_utilities.system_code_application_initializations();
        }
        if (NIL != subl_promotions.positive_integer_p(kb_loaded())) {
            misc_utilities.system_kb_initializations();
        } else {
            Errors.warn(misc_utilities.$str9$No_KB_is_loaded___System_KB_initi);
        }
        misc_utilities.$system_code_initializations_marker$.setGlobalValue(Environment.get_process_id(UNPROVIDED));
        return T;
    }

    public static SubLObject cyc_system_code_string() {
        if (misc_utilities.$system_code_version_string$.getGlobalValue().isString() && misc_utilities.$system_code_release_string$.getGlobalValue().isString()) {
            return cconcatenate(format_nil.format_nil_a_no_copy(misc_utilities.$system_code_version_string$.getGlobalValue()), new SubLObject[]{ misc_utilities.$$$_, format_nil.format_nil_a_no_copy(misc_utilities.$system_code_release_string$.getGlobalValue()) });
        }
        if (misc_utilities.$system_code_version_string$.getGlobalValue().isString()) {
            return misc_utilities.$system_code_version_string$.getGlobalValue();
        }
        return misc_utilities.$str8$;
    }

    public static SubLObject system_code_version_initialization(SubLObject features) {
        if (features == UNPROVIDED) {
            features = $features$.getDynamicValue();
        }
        if ((NIL != list_utilities.member_eqP($CYC_RESEARCHCYC, features)) && (NIL != list_utilities.member_eqP($CYC_DREAMCATCHER, features))) {
            misc_utilities.$system_code_version_string$.setGlobalValue(misc_utilities.$$$Dreamcatcher);
        } else
            if (NIL != list_utilities.member_eqP($CYC_MAINT, features)) {
                misc_utilities.$system_code_version_string$.setGlobalValue(misc_utilities.$str15$Cyc_Maint);
            } else
                if (NIL != list_utilities.sets_equalP(features, misc_utilities.$list16, UNPROVIDED)) {
                    misc_utilities.$system_code_version_string$.setGlobalValue(misc_utilities.$$$OpenCyc);
                } else
                    if (NIL != list_utilities.member_eqP($CYC_OPENCYC, features)) {
                        misc_utilities.$system_code_version_string$.setGlobalValue(misc_utilities.$str19$OpenCyc__custom_);
                    } else
                        if (NIL != list_utilities.sets_equalP(features, misc_utilities.$list20, UNPROVIDED)) {
                            misc_utilities.$system_code_version_string$.setGlobalValue(misc_utilities.$$$ResearchCyc);
                        } else
                            if (NIL != list_utilities.member_eqP(misc_utilities.$CYC_RESEARCHCYC_DEBUG, features)) {
                                misc_utilities.$system_code_version_string$.setGlobalValue(misc_utilities.$str23$ResearchCyc__custom_);
                            } else
                                if (NIL != list_utilities.sets_equalP(features, misc_utilities.$list24, UNPROVIDED)) {
                                    misc_utilities.$system_code_version_string$.setGlobalValue(misc_utilities.$$$ResearchCyc);
                                } else
                                    if (NIL != list_utilities.member_eqP($CYC_RESEARCHCYC, features)) {
                                        misc_utilities.$system_code_version_string$.setGlobalValue(misc_utilities.$str23$ResearchCyc__custom_);
                                    } else {
                                        misc_utilities.$system_code_version_string$.setGlobalValue(misc_utilities.$str25$Cyc_Unknown);
                                    }







        return misc_utilities.cyc_system_code_string();
    }

    public static final SubLObject system_code_initializations_run_p_alt() {
        return numE($system_code_initializations_marker$.getGlobalValue(), Environment.get_process_id(UNPROVIDED));
    }

    public static SubLObject system_code_initializations_run_p() {
        return numE(misc_utilities.$system_code_initializations_marker$.getGlobalValue(), Environment.get_process_id(UNPROVIDED));
    }

    /**
     * Support for redoing system code initializations after creating a child
     * server process with FORK-PROCESS.
     */
    @LispMethod(comment = "Support for redoing system code initializations after creating a child\r\nserver process with FORK-PROCESS.\nSupport for redoing system code initializations after creating a child\nserver process with FORK-PROCESS.")
    public static final SubLObject redo_system_code_initializations_alt() {
        $system_code_initializations_marker$.setGlobalValue(NIL);
        return com.cyc.cycjava.cycl.misc_utilities.system_code_initializations(UNPROVIDED);
    }

    /**
     * Support for redoing system code initializations after creating a child
     * server process with FORK-PROCESS.
     */
    @LispMethod(comment = "Support for redoing system code initializations after creating a child\r\nserver process with FORK-PROCESS.\nSupport for redoing system code initializations after creating a child\nserver process with FORK-PROCESS.")
    public static SubLObject redo_system_code_initializations() {
        misc_utilities.$system_code_initializations_marker$.setGlobalValue(NIL);
        return misc_utilities.system_code_initializations(UNPROVIDED);
    }

    /**
     * System code initializations that have to do with distinguishing
     * the current image from the image that saved out the world being used.
     */
    @LispMethod(comment = "System code initializations that have to do with distinguishing\r\nthe current image from the image that saved out the world being used.\nSystem code initializations that have to do with distinguishing\nthe current image from the image that saved out the world being used.")
    public static final SubLObject system_code_image_initializations_alt() {
        random.seed_random(UNPROVIDED);
        reset_cycl_start_time(UNPROVIDED);
        set_cyc_image_id();
        com.cyc.cycjava.cycl.misc_utilities.clear_machine_bogomips();
        tcp_server_utilities.validate_all_tcp_servers();
        os_process_utilities.clear_active_os_processes();
        event_broker.remove_stale_core_event_customers();
        return T;
    }

    /**
     * System code initializations that have to do with distinguishing
     * the current image from the image that saved out the world being used.
     */
    @LispMethod(comment = "System code initializations that have to do with distinguishing\r\nthe current image from the image that saved out the world being used.\nSystem code initializations that have to do with distinguishing\nthe current image from the image that saved out the world being used.")
    public static SubLObject system_code_image_initializations() {
        misc_utilities.clear_hostname();
        random.seed_random(UNPROVIDED);
        system_info.reset_cycl_start_time(UNPROVIDED);
        set_cyc_image_id();
        misc_utilities.clear_machine_bogomips();
        agenda.halt_agenda(UNPROVIDED);
        tcp_server_utilities.validate_all_tcp_servers();
        os_process_utilities.clear_active_os_processes();
        event_broker.remove_stale_core_event_customers();
        process_utilities.note_active_processes_at_startup();
        return T;
    }

    /**
     * System code initializations that have to do with HL level reasoning.
     */
    @LispMethod(comment = "System code initializations that have to do with HL level reasoning.")
    public static final SubLObject system_code_hl_initializations_alt() {
        sbhl_module_declarations.initialize_sbhl_modules(UNPROVIDED);
        sbhl_time_modules.initialize_sbhl_time_modules();
        return T;
    }

    /**
     * System code initializations that have to do with HL level reasoning.
     */
    @LispMethod(comment = "System code initializations that have to do with HL level reasoning.")
    public static SubLObject system_code_hl_initializations() {
        sbhl_module_declarations.initialize_sbhl_modules(UNPROVIDED);
        sbhl_time_modules.cleanly_initialize_sbhl_time_modules();
        return T;
    }

    /**
     * System code initializations that have to do with inference.
     */
    @LispMethod(comment = "System code initializations that have to do with inference.")
    public static final SubLObject system_code_inference_initializations_alt() {
        inference_modules.reclassify_removal_modules();
        hl_storage_modules.reclassify_hl_storage_modules();
        inference_datastructures_problem_store.destroy_all_problem_stores();
        inference_datastructures_inference.initialize_pad_table($str_alt5$hack_);
        return T;
    }

    /**
     * System code initializations that have to do with inference.
     */
    @LispMethod(comment = "System code initializations that have to do with inference.")
    public static SubLObject system_code_inference_initializations() {
        inference_modules.reclassify_removal_modules();
        hl_storage_modules.reclassify_hl_storage_modules();
        somewhere_cache.reclassify_somewhere_cached_preds();
        inference_datastructures_problem_store.destroy_all_problem_stores();
        forward.clear_currently_forward_propagating_supports();
        inference_datastructures_inference.initialize_pad_table(misc_utilities.$str27$hack_);
        return T;
    }

    /**
     * System code initializations that have to do with the Cyc API.
     */
    @LispMethod(comment = "System code initializations that have to do with the Cyc API.")
    public static final SubLObject system_code_api_initializations_alt() {
        eval_in_api.eval_in_api_initialize();
        java_api_kernel.reset_java_api_kernel();
        api_widgets.reset_api_widget_sessions_resources();
        kb_modification_event_filters.reset_external_kb_modification_event_filters_and_listeners();
        kb_modification_event_filters.clear_kb_modification_event_mailboxes();
        return T;
    }

    /**
     * System code initializations that have to do with the Cyc API.
     */
    @LispMethod(comment = "System code initializations that have to do with the Cyc API.")
    public static SubLObject system_code_api_initializations() {
        eval_in_api.eval_in_api_initialize();
        java_api_kernel.reset_java_api_kernel();
        api_widgets.reset_api_widget_sessions_resources();
        kb_modification_event_filters.reset_external_kb_modification_event_filters_and_listeners();
        kb_modification_event_filters.clear_kb_modification_event_mailboxes();
        return T;
    }

    /**
     * System code initializations for application code built into Cyc.
     * To be called only by system-code-initializations.
     */
    @LispMethod(comment = "System code initializations for application code built into Cyc.\r\nTo be called only by system-code-initializations.\nSystem code initializations for application code built into Cyc.\nTo be called only by system-code-initializations.")
    public static final SubLObject system_code_application_initializations_alt() {
        html_kernel.clear_all_html_state();
        if (NIL == system_parameters.system_parameter_value_unset_p(transcript_server.use_transcript_server())) {
            if (NIL != transcript_server.use_transcript_server()) {
                operation_communication.set_allow_transmitting(NIL);
            }
        }
        ql_index_support.initialize_ql_index_globals();
        sksi_sks_interaction.sksi_close_resourced_connections();
        semantic_etl_bus.initialize_semantic_etl_infrastructure();
        inference_analysis.clear_asked_query_queue();
        {
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            linkage.initialize_pos_tags();
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
        }
        return T;
    }

    /**
     * System code initializations for application code built into Cyc.
     * To be called only by system-code-initializations.
     */
    @LispMethod(comment = "System code initializations for application code built into Cyc.\r\nTo be called only by system-code-initializations.\nSystem code initializations for application code built into Cyc.\nTo be called only by system-code-initializations.")
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
            thread.throwStack.push(misc_utilities.$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(misc_utilities.IGNORE_ERRORS_HANDLER), thread);
                try {
                    linkage.initialize_pos_tags();
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, misc_utilities.$IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return T;
    }

    /**
     * Initializations which should be run every time the system is initialized, if there is a KB present.
     */
    @LispMethod(comment = "Initializations which should be run every time the system is initialized, if there is a KB present.")
    public static final SubLObject system_kb_initializations_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.misc_utilities.initialize_hl_store_caches();
            operation_communication.set_the_cyclist(system_parameters.$default_cyclist_name$.getDynamicValue(thread));
            transcript_utilities.initialize_transcript_handling();
            tm_datastructures.$thesaurus_subdirectories$.setGlobalValue($list_alt8);
            tm_datastructures.$thesaurus_filename$.setGlobalValue($str_alt9$gw_thesaurus_init);
            tm_datastructures.$thesaurus_filename_extension$.setGlobalValue($$$lisp);
            if (NIL != tm_control_vars.$tm_load_thesaurus_init_file_at_startup$.getDynamicValue(thread)) {
                tm_internals.load_thesaurus_init_file(UNPROVIDED);
            }
            initialize_agenda();
            initialize_global_locks();
            cyc_testing_initialization.perform_cyc_testing_initializations();
            kct_utils.initialize_kct();
            make_process($str_alt11$file_backed_cache_initializer, INITIALIZE_ALL_FILE_BACKED_CACHES);
            sleep($float$0_5);
            com.cyc.cycjava.cycl.misc_utilities.initialize_file_backed_nl_datastructures();
            fact_sheets.maybe_start_new_fact_sheet_updater_default_screensaver_for_user(UNPROVIDED);
            return T;
        }
    }

    /**
     * Initializations which should be run every time the system is initialized, if there is a KB present.
     */
    @LispMethod(comment = "Initializations which should be run every time the system is initialized, if there is a KB present.")
    public static SubLObject system_kb_initializations() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        misc_utilities.initialize_hl_store_caches();
        misc_utilities.validate_hl_and_kb_settings();
        operation_communication.set_the_cyclist(system_parameters.$default_cyclist_name$.getDynamicValue(thread));
        transcript_utilities.initialize_transcript_handling();
        agenda.initialize_agenda();
        initialize_global_locks();
        cyc_testing_initialization.perform_cyc_testing_initializations();
        kct_utils.initialize_kct();
        make_process(misc_utilities.$str30$file_backed_cache_initializer, misc_utilities.INITIALIZE_ALL_FILE_BACKED_CACHES);
        sleep(misc_utilities.$float$0_5);
        misc_utilities.initialize_file_backed_nl_datastructures();
        fact_sheets.maybe_start_new_fact_sheet_updater_default_screensaver_for_user(UNPROVIDED);
        return T;
    }

    public static SubLObject validate_hl_and_kb_settings() {
        if (!max(deduction_handles.next_deduction_id(), assertion_handles.next_assertion_id()).isFixnum()) {
            Errors.cerror(misc_utilities.$$$Accept_the_risks, misc_utilities.$id_space_fixnum_range_problem$.getGlobalValue());
        }
        return $VALIDATED;
    }

    public static final SubLObject initialize_file_backed_nl_datastructures_alt() {
        {
            SubLObject directory = com.cyc.cycjava.cycl.misc_utilities.hl_store_caches_directory();
            SubLObject symbols = com.cyc.cycjava.cycl.misc_utilities.get_hl_store_caches_shared_symbols();
            nl_trie.reconnect_nl_trie_backing(directory, symbols);
        }
        return T;
    }

    public static SubLObject initialize_file_backed_nl_datastructures() {
        final SubLObject directory = misc_utilities.hl_store_caches_directory();
        final SubLObject symbols = misc_utilities.get_hl_store_caches_shared_symbols_simple();
        nl_trie.reconnect_nl_trie_backing(directory, symbols);
        return T;
    }

    public static final SubLObject get_hl_store_caches_shared_symbols_alt() {
        return $hl_store_caches_shared_symbols$.getGlobalValue();
    }

    public static SubLObject get_hl_store_caches_shared_symbols() {
        return misc_utilities.$hl_store_caches_shared_symbols$.getGlobalValue();
    }

    public static SubLObject get_hl_store_caches_shared_symbols_simple() {
        return misc_utilities.$hl_store_caches_shared_symbols_simple$.getGlobalValue();
    }

    public static final SubLObject initialize_hl_store_caches_alt() {
        if (NIL == com.cyc.cycjava.cycl.misc_utilities.hl_store_content_completely_cachedP()) {
            return com.cyc.cycjava.cycl.misc_utilities.initialize_hl_store_caches_from_directory(com.cyc.cycjava.cycl.misc_utilities.hl_store_caches_directory(), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject initialize_hl_store_caches() {
        if (NIL == misc_utilities.hl_store_content_completely_cachedP()) {
            return misc_utilities.initialize_hl_store_caches_from_directory(misc_utilities.hl_store_caches_directory(), UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject initialize_hl_store_caches_from_directory_alt(SubLObject direname, SubLObject symbols) {
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        if (NIL != com.cyc.cycjava.cycl.misc_utilities.initialize_hl_store_cache_directory_and_shared_symbols(direname, symbols)) {
            deduction_manager.initialize_deduction_hl_store_cache();
            assertion_manager.initialize_assertion_hl_store_cache();
            constant_index_manager.initialize_constant_index_hl_store_cache();
            nart_index_manager.initialize_nart_index_hl_store_cache();
            nart_hl_formula_manager.initialize_nart_hl_formula_hl_store_cache();
            unrepresented_term_index_manager.initialize_unrepresented_term_index_hl_store_cache();
            kb_hl_support_manager.initialize_kb_hl_support_hl_store_cache();
            sbhl_graphs.initialize_sbhl_graph_caches();
            tva_cache.reconnect_tva_cache_registry(direname, com.cyc.cycjava.cycl.misc_utilities.get_hl_store_caches_shared_symbols());
        } else {
            Errors.warn($str_alt16$Cannot_initialize_HL_KB_object_ca);
        }
        return T;
    }

    public static SubLObject initialize_hl_store_caches_from_directory(final SubLObject direname, SubLObject symbols) {
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        if (NIL != misc_utilities.initialize_hl_store_cache_directory_and_shared_symbols(direname, symbols)) {
            deduction_manager.initialize_deduction_hl_store_cache();
            assertion_manager.initialize_assertion_hl_store_cache();
            constant_index_manager.initialize_constant_index_hl_store_cache();
            nart_index_manager.initialize_nart_index_hl_store_cache();
            nart_hl_formula_manager.initialize_nart_hl_formula_hl_store_cache();
            unrepresented_terms.initialize_unrepresented_term_caches();
            unrepresented_term_index_manager.initialize_unrepresented_term_index_hl_store_cache();
            kb_hl_support_manager.initialize_kb_hl_support_hl_store_cache();
            sbhl_graphs.initialize_sbhl_graph_caches();
            tva_cache.reconnect_tva_cache_registry(direname, misc_utilities.get_hl_store_caches_shared_symbols_simple());
        } else {
            Errors.warn(misc_utilities.$str41$Cannot_initialize_HL_KB_object_ca);
        }
        return T;
    }

    public static final SubLObject initialize_hl_store_cache_directory_and_shared_symbols_alt(SubLObject direname, SubLObject symbols) {
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        if (NIL != Filesys.directory_p(direname)) {
            com.cyc.cycjava.cycl.misc_utilities.set_hl_store_caches_directory(direname);
        } else {
            Errors.warn($str_alt17$Do_not_have_a_valid_location_for_, direname);
        }
        if (NIL != Filesys.directory_p(com.cyc.cycjava.cycl.misc_utilities.hl_store_caches_directory())) {
            com.cyc.cycjava.cycl.misc_utilities.initialize_hl_store_cache_shared_symbols(symbols);
            return T;
        } else {
            Errors.warn($str_alt18$Could_not_initialize_HL_store_cac, direname);
        }
        return NIL;
    }

    public static SubLObject initialize_hl_store_cache_directory_and_shared_symbols(final SubLObject direname, SubLObject symbols) {
        if (symbols == UNPROVIDED) {
            symbols = NIL;
        }
        if (NIL != Filesys.directory_p(direname)) {
            misc_utilities.set_hl_store_caches_directory(direname);
        } else {
            Errors.warn(misc_utilities.$str42$Do_not_have_a_valid_location_for_, direname);
        }
        if (NIL != Filesys.directory_p(misc_utilities.hl_store_caches_directory())) {
            misc_utilities.initialize_hl_store_cache_shared_symbols(symbols);
            return T;
        }
        Errors.warn(misc_utilities.$str43$Could_not_initialize_HL_store_cac, direname);
        return NIL;
    }

    public static final SubLObject initialize_hl_store_cache_shared_symbols_alt(SubLObject symbols) {
        format(T, $str_alt19$Initializing_HL_backing_store_cac, com.cyc.cycjava.cycl.misc_utilities.hl_store_caches_directory());
        if (NIL == symbols) {
            {
                SubLObject error = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                        try {
                            bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                            try {
                                symbols = dumper.load_kb_product_shared_symbols(com.cyc.cycjava.cycl.misc_utilities.hl_store_caches_directory());
                            } catch (Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            rebind(Errors.$error_handler$, _prev_bind_0);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                }
                if (error.isString()) {
                    Errors.warn($str_alt21$Could_not_initialize_shared_symbo, com.cyc.cycjava.cycl.misc_utilities.hl_store_caches_directory());
                }
            }
        }
        if (NIL != symbols) {
            $hl_store_caches_shared_symbols$.setGlobalValue(symbols);
            return $hl_store_caches_shared_symbols$.getGlobalValue();
        }
        return NIL;
    }

    public static SubLObject initialize_hl_store_cache_shared_symbols(SubLObject symbols) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, misc_utilities.$str44$Initializing_HL_backing_store_cac, misc_utilities.hl_store_caches_directory());
        if (NIL == symbols) {
            SubLObject error = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        symbols = dumper.load_kb_product_shared_symbols(misc_utilities.hl_store_caches_directory());
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
                Errors.warn(misc_utilities.$str46$Could_not_initialize_shared_symbo, misc_utilities.hl_store_caches_directory());
            }
        }
        if (NIL != symbols) {
            misc_utilities.$hl_store_caches_shared_symbols$.setGlobalValue(symbols);
            misc_utilities.$hl_store_caches_shared_symbols_simple$.setGlobalValue(apply(VECTOR, symbols));
            return misc_utilities.$hl_store_caches_shared_symbols$.getGlobalValue();
        }
        return NIL;
    }

    public static final SubLObject hl_store_content_completely_cachedP_alt() {
        return makeBoolean((((((NIL != deduction_manager.deduction_content_completely_cachedP()) && (NIL != assertion_manager.assertion_content_completely_cachedP())) && (NIL != constant_index_manager.constant_indices_completely_cachedP())) && (NIL != nart_index_manager.nart_indices_completely_cachedP())) && (NIL != unrepresented_term_index_manager.unrepresented_term_indices_completely_cachedP())) && (NIL != sbhl_graphs.sbhl_graph_completely_cachedP()));
    }

    public static SubLObject hl_store_content_completely_cachedP() {
        return makeBoolean((((((NIL != deduction_manager.deduction_content_completely_cachedP()) && (NIL != assertion_manager.assertion_content_completely_cachedP())) && (NIL != constant_index_manager.constant_indices_completely_cachedP())) && (NIL != nart_index_manager.nart_indices_completely_cachedP())) && (NIL != unrepresented_term_index_manager.unrepresented_term_indices_completely_cachedP())) && (NIL != sbhl_graphs.sbhl_graph_completely_cachedP()));
    }

    public static final SubLObject get_hl_store_cache_filename_alt(SubLObject filename, SubLObject extension) {
        return cconcatenate($hl_store_caches_directory$.getGlobalValue(), new SubLObject[]{ filename, $str_alt22$_, extension });
    }

    public static SubLObject get_hl_store_cache_filename(final SubLObject filename, SubLObject extension) {
        if (extension == UNPROVIDED) {
            extension = misc_utilities.$standard_hl_store_cache_file_extension$.getGlobalValue();
        }
        return cconcatenate(misc_utilities.$hl_store_caches_directory$.getGlobalValue(), new SubLObject[]{ filename, misc_utilities.$str49$_, extension });
    }

    public static final SubLObject set_hl_store_caches_directory_alt(SubLObject directory) {
        if (NIL != file_utilities.absolute_pathP(directory)) {
            Errors.warn($str_alt23$HL_Store_directory_being_set_to_a, directory);
        }
        $hl_store_caches_directory$.setGlobalValue(directory);
        return NIL;
    }

    public static SubLObject set_hl_store_caches_directory(final SubLObject directory) {
        misc_utilities.$hl_store_caches_directory$.setGlobalValue(directory);
        return NIL;
    }

    /**
     *
     *
     * @unknown make the HL store caches directory dependent on this one,
    rather than the other way around
     */
    @LispMethod(comment = "@unknown make the HL store caches directory dependent on this one,\r\nrather than the other way around")
    public static final SubLObject generic_caches_directory_alt() {
        if (NIL != dumper.force_monolithic_kb_assumptionP()) {
            Errors.error($str_alt24$The_caches_directory_will_be_wron);
        }
        return com.cyc.cycjava.cycl.misc_utilities.hl_store_caches_directory();
    }

    /**
     *
     *
     * @unknown make the HL store caches directory dependent on this one,
    rather than the other way around
     */
    @LispMethod(comment = "@unknown make the HL store caches directory dependent on this one,\r\nrather than the other way around")
    public static SubLObject generic_caches_directory() {
        return misc_utilities.hl_store_caches_directory();
    }

    public static final SubLObject hl_store_caches_directory_alt() {
        if ($hl_store_caches_directory$.getGlobalValue().isString()) {
            return $hl_store_caches_directory$.getGlobalValue();
        }
        if (NIL == dumper.force_monolithic_kb_assumptionP()) {
            com.cyc.cycjava.cycl.misc_utilities.set_hl_store_caches_directory(com.cyc.cycjava.cycl.misc_utilities.compute_hl_store_caches_directory());
        }
        return $hl_store_caches_directory$.getGlobalValue();
    }

    public static SubLObject hl_store_caches_directory() {
        if (misc_utilities.$hl_store_caches_directory$.getGlobalValue().isString()) {
            return misc_utilities.$hl_store_caches_directory$.getGlobalValue();
        }
        misc_utilities.set_hl_store_caches_directory(misc_utilities.compute_hl_store_caches_directory());
        return misc_utilities.$hl_store_caches_directory$.getGlobalValue();
    }

    /**
     *
     *
     * @unknown this needs to come from the RED or something like that
     */
    @LispMethod(comment = "@unknown this needs to come from the RED or something like that")
    public static final SubLObject compute_hl_store_caches_directory_alt() {
        {
            SubLObject kb_num = (build_kb_loaded().isFixnum()) ? ((SubLObject) (build_kb_loaded())) : kb_loaded();
            SubLObject directory = format(NIL, $str_alt25$units__4__0d_, kb_num);
            Errors.warn($str_alt26$Guessing_HL_Store_location_of__A, directory);
            return directory;
        }
    }

    /**
     *
     *
     * @unknown this needs to come from the RED or something like that
     */
    @LispMethod(comment = "@unknown this needs to come from the RED or something like that")
    public static SubLObject compute_hl_store_caches_directory() {
        final SubLObject kb_num = (build_kb_loaded().isFixnum()) ? build_kb_loaded() : kb_loaded();
        final SubLObject directory = format(NIL, misc_utilities.$str50$units__A_, operation_communication.kb_number_string(kb_num));
        Errors.warn(misc_utilities.$str51$Guessing_HL_Store_location_of__A, directory);
        return directory;
    }

    public static final SubLObject cdr_eqlP_alt(SubLObject list, SubLObject value) {
        return eql(list.rest(), value);
    }

    public static SubLObject cdr_eqlP(final SubLObject list, final SubLObject value) {
        return eql(list.rest(), value);
    }

    public static final SubLObject not_member_equal_alt(SubLObject obj, SubLObject list) {
        return makeBoolean(NIL == subl_promotions.memberP(obj, list, symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject not_member_equal(final SubLObject obj, final SubLObject list) {
        return makeBoolean(NIL == subl_promotions.memberP(obj, list, symbol_function(EQUAL), UNPROVIDED));
    }

    public static final SubLObject get_indexed_obj_alt(SubLObject key, SubLObject alist, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return assoc(key, alist, test, UNPROVIDED).rest();
    }

    public static SubLObject get_indexed_obj(final SubLObject key, final SubLObject alist, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        return assoc(key, alist, test, UNPROVIDED).rest();
    }

    /**
     * Methods for updating vector values include :cons, :adjoin, :append, :union,
     * :replace, :cdr, :car, :rplaca, :rplacd, :reverse, :remove, :inc, and :dec.
     */
    @LispMethod(comment = "Methods for updating vector values include :cons, :adjoin, :append, :union,\r\n:replace, :cdr, :car, :rplaca, :rplacd, :reverse, :remove, :inc, and :dec.\nMethods for updating vector values include :cons, :adjoin, :append, :union,\n:replace, :cdr, :car, :rplaca, :rplacd, :reverse, :remove, :inc, and :dec.")
    public static final SubLObject update_vector_indexed_val_alt(SubLObject vector_key, SubLObject vector_alist, SubLObject index_key, SubLObject index_alist, SubLObject v_new, SubLObject method, SubLObject test1, SubLObject test2, SubLObject test3) {
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
        {
            SubLObject vec = com.cyc.cycjava.cycl.misc_utilities.get_indexed_obj(vector_key, vector_alist, test1);
            SubLObject index = com.cyc.cycjava.cycl.misc_utilities.get_indexed_obj(index_key, index_alist, test2);
            if (vec.isVector() && index.isInteger()) {
                if (NIL != find(method, $list_alt28, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    {
                        SubLObject old_val = aref(vec, index);
                        SubLObject pcase_var = method;
                        if (pcase_var.eql($CONS)) {
                            set_aref(vec, index, cons(v_new, old_val));
                            return vec;
                        } else {
                            if (pcase_var.eql($ADJOIN)) {
                                if (old_val.isList()) {
                                    set_aref(vec, index, adjoin(v_new, old_val, test3, UNPROVIDED));
                                }
                                return vec;
                            } else {
                                if (pcase_var.eql($APPEND)) {
                                    if (v_new.isList() && old_val.isList()) {
                                        set_aref(vec, index, append(v_new, old_val));
                                    }
                                    return vec;
                                } else {
                                    if (pcase_var.eql($UNION)) {
                                        if (v_new.isList() && old_val.isList()) {
                                            set_aref(vec, index, union(v_new, old_val, test3, UNPROVIDED));
                                        }
                                        return vec;
                                    } else {
                                        if (pcase_var.eql($CDR)) {
                                            if (old_val.isList()) {
                                                set_aref(vec, index, old_val.rest());
                                            }
                                            return vec;
                                        } else {
                                            if (pcase_var.eql($CAR)) {
                                                if (old_val.isList()) {
                                                    set_aref(vec, index, old_val.first());
                                                }
                                                return vec;
                                            } else {
                                                if (pcase_var.eql($REMOVE)) {
                                                    if (old_val.isList()) {
                                                        set_aref(vec, index, remove(v_new, old_val, test3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                    }
                                                    return vec;
                                                } else {
                                                    if (pcase_var.eql($RPLACA)) {
                                                        if (old_val.isCons()) {
                                                            rplaca(old_val, v_new);
                                                            set_aref(vec, index, old_val);
                                                        }
                                                        return vec;
                                                    } else {
                                                        if (pcase_var.eql($RPLACD)) {
                                                            if (old_val.isCons()) {
                                                                rplacd(old_val, v_new);
                                                                set_aref(vec, index, old_val);
                                                            }
                                                            return vec;
                                                        } else {
                                                            if (pcase_var.eql($REVERSE)) {
                                                                if (old_val.isSequence()) {
                                                                    set_aref(vec, index, nreverse(old_val));
                                                                }
                                                                return vec;
                                                            } else {
                                                                if (pcase_var.eql($INC)) {
                                                                    if (old_val.isInteger()) {
                                                                        if (NIL == v_new) {
                                                                            set_aref(vec, index, add(old_val, ONE_INTEGER));
                                                                        } else {
                                                                            if (v_new.isInteger() && v_new.numG(ZERO_INTEGER)) {
                                                                                set_aref(vec, index, add(old_val, v_new));
                                                                            }
                                                                        }
                                                                    }
                                                                    return vec;
                                                                } else {
                                                                    if (pcase_var.eql($DEC)) {
                                                                        if (old_val.isInteger()) {
                                                                            if ((NIL == v_new) && old_val.numG(ZERO_INTEGER)) {
                                                                                set_aref(vec, index, subtract(old_val, ONE_INTEGER));
                                                                            } else {
                                                                                if ((v_new.isInteger() && v_new.numG(ZERO_INTEGER)) && old_val.numG(ZERO_INTEGER)) {
                                                                                    {
                                                                                        SubLObject new_count = subtract(old_val, v_new);
                                                                                        if (!new_count.numGE(ZERO_INTEGER)) {
                                                                                            new_count = ZERO_INTEGER;
                                                                                        }
                                                                                        set_aref(vec, index, new_count);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                        return vec;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (NIL != find(method, $list_alt40, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        set_aref(vec, index, v_new);
                        return vec;
                    } else {
                        return NIL;
                    }
                }
            } else {
                return NIL;
            }
        }
        return NIL;
    }

    /**
     * Methods for updating vector values include :cons, :adjoin, :append, :union,
     * :replace, :cdr, :car, :rplaca, :rplacd, :reverse, :remove, :inc, and :dec.
     */
    @LispMethod(comment = "Methods for updating vector values include :cons, :adjoin, :append, :union,\r\n:replace, :cdr, :car, :rplaca, :rplacd, :reverse, :remove, :inc, and :dec.\nMethods for updating vector values include :cons, :adjoin, :append, :union,\n:replace, :cdr, :car, :rplaca, :rplacd, :reverse, :remove, :inc, and :dec.")
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
        final SubLObject vec = misc_utilities.get_indexed_obj(vector_key, vector_alist, test1);
        final SubLObject index = misc_utilities.get_indexed_obj(index_key, index_alist, test2);
        if ((!vec.isVector()) || (!index.isInteger())) {
            return NIL;
        }
        if (NIL != find(method, misc_utilities.$list53, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
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
            if (NIL != find(method, misc_utilities.$list65, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                set_aref(vec, index, v_new);
                return vec;
            }
            return NIL;
        }
    }

    public static final SubLObject get_vector_indexed_val_alt(SubLObject vector_key, SubLObject vector_alist, SubLObject index_key, SubLObject index_alist, SubLObject test1, SubLObject test2) {
        if (test1 == UNPROVIDED) {
            test1 = symbol_function(EQL);
        }
        if (test2 == UNPROVIDED) {
            test2 = symbol_function(EQL);
        }
        {
            SubLObject vec = com.cyc.cycjava.cycl.misc_utilities.get_indexed_obj(vector_key, vector_alist, test1);
            SubLObject index = com.cyc.cycjava.cycl.misc_utilities.get_indexed_obj(index_key, index_alist, test2);
            if (vec.isVector() && index.isInteger()) {
                return aref(vec, index);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject get_vector_indexed_val(final SubLObject vector_key, final SubLObject vector_alist, final SubLObject index_key, final SubLObject index_alist, SubLObject test1, SubLObject test2) {
        if (test1 == UNPROVIDED) {
            test1 = symbol_function(EQL);
        }
        if (test2 == UNPROVIDED) {
            test2 = symbol_function(EQL);
        }
        final SubLObject vec = misc_utilities.get_indexed_obj(vector_key, vector_alist, test1);
        final SubLObject index = misc_utilities.get_indexed_obj(index_key, index_alist, test2);
        if (vec.isVector() && index.isInteger()) {
            return aref(vec, index);
        }
        return NIL;
    }

    public static final SubLObject clear_indexed_vectors_alt(SubLObject vector_alist) {
        {
            SubLObject cdolist_list_var = vector_alist;
            SubLObject form = NIL;
            for (form = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , form = cdolist_list_var.first()) {
                {
                    SubLObject vec = form.rest();
                    SubLObject len = length(vec);
                    SubLObject i = NIL;
                    for (i = ZERO_INTEGER; i.numL(len); i = add(i, ONE_INTEGER)) {
                        set_aref(vec, i, NIL);
                    }
                }
            }
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

    public static final SubLObject make_indexed_vector_alt(SubLObject index_alist, SubLObject initial_element) {
        if (initial_element == UNPROVIDED) {
            initial_element = NIL;
        }
        return make_vector(length(index_alist), initial_element);
    }

    public static SubLObject make_indexed_vector(final SubLObject index_alist, SubLObject initial_element) {
        if (initial_element == UNPROVIDED) {
            initial_element = NIL;
        }
        return make_vector(length(index_alist), initial_element);
    }

    /**
     * Returns the number of cells in vector filled with a non-NIL value
     */
    @LispMethod(comment = "Returns the number of cells in vector filled with a non-NIL value")
    public static final SubLObject vector_cells_filled_alt(SubLObject vector) {
        {
            SubLObject count = ZERO_INTEGER;
            SubLObject cdotimes_end_var = length(vector);
            SubLObject i = NIL;
            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                {
                    SubLObject val = aref(vector, i);
                    if (NIL != val) {
                        count = add(count, ONE_INTEGER);
                    }
                }
            }
            return count;
        }
    }

    /**
     * Returns the number of cells in vector filled with a non-NIL value
     */
    @LispMethod(comment = "Returns the number of cells in vector filled with a non-NIL value")
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

    /**
     * Return subsequence of list from beginning until obj is encountered
     */
    @LispMethod(comment = "Return subsequence of list from beginning until obj is encountered")
    public static final SubLObject extract_until_alt(SubLObject obj, SubLObject list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        return ldiff(list, member(obj, list, test, UNPROVIDED));
    }

    /**
     * Return subsequence of list from beginning until obj is encountered
     */
    @LispMethod(comment = "Return subsequence of list from beginning until obj is encountered")
    public static SubLObject extract_until(final SubLObject obj, final SubLObject list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        return ldiff(list, member(obj, list, test, UNPROVIDED));
    }

    /**
     * Return subsequence of list from beginning until any of ITEMS are encountered
     */
    @LispMethod(comment = "Return subsequence of list from beginning until any of ITEMS are encountered")
    public static final SubLObject extract_until_any_alt(SubLObject items, SubLObject list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUALP);
        }
        {
            SubLObject result = NIL;
            SubLObject things = NIL;
            SubLObject item = NIL;
            SubLObject v_this = NIL;
            for (things = items, item = things.first(), v_this = ldiff(list, member(item, list, test, UNPROVIDED)); NIL != things; things = things.rest() , item = things.first() , v_this = ldiff(list, member(item, list, test, UNPROVIDED))) {
                if ((NIL == result) || (result.isCons() && length(v_this).numL(length(result)))) {
                    result = v_this;
                }
            }
            return result;
        }
    }

    /**
     * Return subsequence of list from beginning until any of ITEMS are encountered
     */
    @LispMethod(comment = "Return subsequence of list from beginning until any of ITEMS are encountered")
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

    /**
     * Given a list of the form (A0 A1 A2 ... ), numbers the elements to return a list
     * like ((0 (A0)) (1 (A1)) (2 (A2)) ... )
     */
    @LispMethod(comment = "Given a list of the form (A0 A1 A2 ... ), numbers the elements to return a list\r\nlike ((0 (A0)) (1 (A1)) (2 (A2)) ... )\nGiven a list of the form (A0 A1 A2 ... ), numbers the elements to return a list\nlike ((0 (A0)) (1 (A1)) (2 (A2)) ... )")
    public static final SubLObject number_list_alt(SubLObject lst) {
        SubLTrampolineFile.checkType(lst, LISTP);
        {
            SubLObject counter = ZERO_INTEGER;
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = lst;
            SubLObject elem = NIL;
            for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                ans = cons(cons(counter, list(elem)), ans);
                counter = add(counter, ONE_INTEGER);
            }
            return nreverse(ans);
        }
    }

    /**
     * Given a list of the form (A0 A1 A2 ... ), numbers the elements to return a list
     * like ((0 (A0)) (1 (A1)) (2 (A2)) ... )
     */
    @LispMethod(comment = "Given a list of the form (A0 A1 A2 ... ), numbers the elements to return a list\r\nlike ((0 (A0)) (1 (A1)) (2 (A2)) ... )\nGiven a list of the form (A0 A1 A2 ... ), numbers the elements to return a list\nlike ((0 (A0)) (1 (A1)) (2 (A2)) ... )")
    public static SubLObject number_list(final SubLObject lst) {
        assert NIL != listp(lst) : "! listp(lst) " + ("Types.listp(lst) " + "CommonSymbols.NIL != Types.listp(lst) ") + lst;
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

    /**
     * Like ACONS, except will not add an association for KEY if any association
     * for KEY already exists.
     */
    @LispMethod(comment = "Like ACONS, except will not add an association for KEY if any association\r\nfor KEY already exists.\nLike ACONS, except will not add an association for KEY if any association\nfor KEY already exists.")
    public static final SubLObject aconsnew_alt(SubLObject item, SubLObject datum, SubLObject alist, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        if (NIL != assoc(item, alist, test, key)) {
            return alist;
        } else {
            return acons(item, datum, alist);
        }
    }

    /**
     * Like ACONS, except will not add an association for KEY if any association
     * for KEY already exists.
     */
    @LispMethod(comment = "Like ACONS, except will not add an association for KEY if any association\r\nfor KEY already exists.\nLike ACONS, except will not add an association for KEY if any association\nfor KEY already exists.")
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

    /**
     *
     *
     * @param OBJECTS
     * 		listp ; a list.
     * 		prints each object in OBJECTS, N per line, separated by SEPARATOR.
     * @unknown baxter
     */
    @LispMethod(comment = "@param OBJECTS\r\n\t\tlistp ; a list.\r\n\t\tprints each object in OBJECTS, N per line, separated by SEPARATOR.\r\n@unknown baxter")
    public static final SubLObject print_n_per_line_alt(SubLObject objects, SubLObject n, SubLObject separator) {
        if (separator == UNPROVIDED) {
            separator = CHAR_space;
        }
        SubLTrampolineFile.checkType(objects, PROPER_LIST_P);
        SubLTrampolineFile.checkType(n, POSITIVE_INTEGER_P);
        {
            SubLObject list_var = NIL;
            SubLObject obj = NIL;
            SubLObject i = NIL;
            for (list_var = objects, obj = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , obj = list_var.first() , i = add(ONE_INTEGER, i)) {
                prin1(obj, UNPROVIDED);
                if (mod(number_utilities.f_1X(i), n).isZero()) {
                    terpri(UNPROVIDED);
                } else {
                    princ(separator, UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param OBJECTS
     * 		listp ; a list.
     * 		prints each object in OBJECTS, N per line, separated by SEPARATOR.
     * @unknown baxter
     */
    @LispMethod(comment = "@param OBJECTS\r\n\t\tlistp ; a list.\r\n\t\tprints each object in OBJECTS, N per line, separated by SEPARATOR.\r\n@unknown baxter")
    public static SubLObject print_n_per_line(final SubLObject objects, final SubLObject n, SubLObject separator) {
        if (separator == UNPROVIDED) {
            separator = CHAR_space;
        }
        assert NIL != list_utilities.proper_list_p(objects) : "! list_utilities.proper_list_p(objects) " + ("list_utilities.proper_list_p(objects) " + "CommonSymbols.NIL != list_utilities.proper_list_p(objects) ") + objects;
        assert NIL != subl_promotions.positive_integer_p(n) : "! subl_promotions.positive_integer_p(n) " + ("subl_promotions.positive_integer_p(n) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(n) ") + n;
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

    public static final SubLObject other_binary_arg_alt(SubLObject arg) {
        {
            SubLObject pcase_var = arg;
            if (pcase_var.eql(ONE_INTEGER)) {
                return TWO_INTEGER;
            } else {
                if (pcase_var.eql(TWO_INTEGER)) {
                    return ONE_INTEGER;
                }
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

    public static final SubLObject number_of_non_null_args_alt(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        {
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

    public static final SubLObject boolean_to_keyword_alt(SubLObject v_boolean) {
        if (NIL != v_boolean) {
            return $TRUE;
        } else {
            return $FALSE;
        }
    }

    public static SubLObject boolean_to_keyword(final SubLObject v_boolean) {
        if (NIL != v_boolean) {
            return $TRUE;
        }
        return $FALSE;
    }

    public static final SubLObject keyword_to_boolean_alt(SubLObject keyword) {
        return eq($TRUE, keyword);
    }

    public static SubLObject keyword_to_boolean(final SubLObject keyword) {
        return eq($TRUE, keyword);
    }

    /**
     *
     *
     * @return stringp ;the first part of the domain name of the machine running cyc.
     * @unknown ; If Cyc running on sigrun.cyc.com, (get-unqualified-machine-name) ==> 'sigrun'
     */
    @LispMethod(comment = "@return stringp ;the first part of the domain name of the machine running cyc.\r\n@unknown ; If Cyc running on sigrun.cyc.com, (get-unqualified-machine-name) ==> \'sigrun\'")
    public static final SubLObject get_unqualified_machine_name_alt() {
        return split_string(Environment.get_machine_name(UNPROVIDED), $list_alt46).first();
    }

    /**
     *
     *
     * @return stringp ;the first part of the domain name of the machine running cyc.
     * @unknown ; If Cyc running on sigrun.cyc.com, (get-unqualified-machine-name) ==> 'sigrun'
     */
    @LispMethod(comment = "@return stringp ;the first part of the domain name of the machine running cyc.\r\n@unknown ; If Cyc running on sigrun.cyc.com, (get-unqualified-machine-name) ==> \'sigrun\'")
    public static SubLObject get_unqualified_machine_name() {
        return string_utilities.split_string(Environment.get_machine_name(UNPROVIDED), misc_utilities.$list71).first();
    }

    public static final SubLObject clear_hostname_alt() {
        {
            SubLObject cs = $hostname_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_hostname() {
        final SubLObject cs = misc_utilities.$hostname_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_hostname_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($hostname_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_hostname() {
        return memoization_state.caching_state_remove_function_results_with_args(misc_utilities.$hostname_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject hostname_internal_alt() {
        {
            SubLObject hostname = Environment.get_machine_name(UNPROVIDED);
            SubLTrampolineFile.checkType(hostname, STRINGP);
            return Strings.string_downcase(hostname, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject hostname_internal() {
        final SubLObject hostname = Environment.get_machine_name(UNPROVIDED);
        assert NIL != stringp(hostname) : "! stringp(hostname) " + ("Types.stringp(hostname) " + "CommonSymbols.NIL != Types.stringp(hostname) ") + hostname;
        return Strings.string_downcase(hostname, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject hostname_alt() {
        {
            SubLObject caching_state = $hostname_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(HOSTNAME, $hostname_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw50$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.misc_utilities.hostname_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject hostname() {
        SubLObject caching_state = misc_utilities.$hostname_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(misc_utilities.HOSTNAME, misc_utilities.$hostname_caching_state$, NIL, EQ, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(misc_utilities.hostname_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject machine_name_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject hostname = com.cyc.cycjava.cycl.misc_utilities.hostname();
                SubLObject strings = split_string(hostname, $list_alt46);
                SubLObject machine_name = strings.first();
                if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                    if (NIL != empty_string_p(machine_name)) {
                        Errors.error($str_alt51$Could_not_get_hostname_);
                    }
                }
                return machine_name;
            }
        }
    }

    public static SubLObject machine_name() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject hostname = misc_utilities.hostname();
        final SubLObject strings = string_utilities.split_string(hostname, misc_utilities.$list71);
        final SubLObject machine_name = strings.first();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != string_utilities.empty_string_p(machine_name))) {
            Errors.error(misc_utilities.$str75$Could_not_get_hostname_);
        }
        return machine_name;
    }

    public static final SubLObject function_spec_function_alt(SubLObject function_spec) {
        return function_spec.isFunction() ? ((SubLObject) (function_spec)) : symbol_function(function_spec);
    }

    public static SubLObject function_spec_function(final SubLObject function_spec) {
        return function_spec.isFunction() ? function_spec : symbol_function(function_spec);
    }

    /**
     * Return the processor speed of this machine in bogomips,
     * or NIL if this can't be determined.
     */
    @LispMethod(comment = "Return the processor speed of this machine in bogomips,\r\nor NIL if this can\'t be determined.\nReturn the processor speed of this machine in bogomips,\nor NIL if this can\'t be determined.")
    public static final SubLObject machine_bogomips_alt() {
        if ($UNINITIALIZED == $machine_bogomips$.getGlobalValue()) {
            $machine_bogomips$.setGlobalValue(com.cyc.cycjava.cycl.misc_utilities.compute_machine_bogomips());
        }
        return $machine_bogomips$.getGlobalValue();
    }

    /**
     * Return the processor speed of this machine in bogomips,
     * or NIL if this can't be determined.
     */
    @LispMethod(comment = "Return the processor speed of this machine in bogomips,\r\nor NIL if this can\'t be determined.\nReturn the processor speed of this machine in bogomips,\nor NIL if this can\'t be determined.")
    public static SubLObject machine_bogomips() {
        if ($UNINITIALIZED == misc_utilities.$machine_bogomips$.getGlobalValue()) {
            misc_utilities.$machine_bogomips$.setGlobalValue(misc_utilities.compute_machine_bogomips());
        }
        return misc_utilities.$machine_bogomips$.getGlobalValue();
    }

    public static final SubLObject clear_machine_bogomips_alt() {
        $machine_bogomips$.setGlobalValue($UNINITIALIZED);
        return $machine_bogomips$.getGlobalValue();
    }

    public static SubLObject clear_machine_bogomips() {
        misc_utilities.$machine_bogomips$.setGlobalValue($UNINITIALIZED);
        return misc_utilities.$machine_bogomips$.getGlobalValue();
    }

    public static final SubLObject compute_machine_bogomips_alt() {
        {
            SubLObject result = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            {
                                SubLObject stream = NIL;
                                try {
                                    stream = compatibility.open_text($str_alt53$_proc_cpuinfo, $INPUT, NIL);
                                    if (!stream.isStream()) {
                                        Errors.error($str_alt55$Unable_to_open__S, $str_alt53$_proc_cpuinfo);
                                    }
                                    {
                                        SubLObject s = stream;
                                        if (NIL != s) {
                                            while (NIL == result) {
                                                {
                                                    SubLObject line = read_line(s, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    if (NIL != search($$$bogomips, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                        result = read_from_string(substring(line, number_utilities.f_1X(search($str_alt57$_, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            } 
                                        }
                                    }
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_1 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (stream.isStream()) {
                                                close(stream, UNPROVIDED);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_1);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            return result;
        }
    }

    public static SubLObject compute_machine_bogomips() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push(misc_utilities.$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(misc_utilities.IGNORE_ERRORS_HANDLER), thread);
                try {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(misc_utilities.$str77$_proc_cpuinfo, $INPUT);
                        if (!stream.isStream()) {
                            // Errors.error((SubLObject)$str79$Unable_to_open__S,
                            // (SubLObject)$str77$_proc_cpuinfo);
                        }
                        final SubLObject s = stream;
                        if (NIL != s) {
                            while (NIL == result) {
                                final SubLObject line = string_utilities.network_read_line(s, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != search(misc_utilities.$$$bogomips, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    result = read_from_string(string_utilities.substring(line, number_utilities.f_1X(search(misc_utilities.$str81$_, line, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, misc_utilities.$IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return result;
    }

    /**
     * Multiplies each number in NUMBERS by BOGOMIPS/(machine-bogomips).
     * If this machine is faster than BOGOMIPS, NUMBERS will get smaller.
     * If this machine is slower than BOGOMIPS, NUMBERS will get bigger.
     * If (machine-bogomips) is unknown, returns NUMBERS unscaled.
     */
    @LispMethod(comment = "Multiplies each number in NUMBERS by BOGOMIPS/(machine-bogomips).\r\nIf this machine is faster than BOGOMIPS, NUMBERS will get smaller.\r\nIf this machine is slower than BOGOMIPS, NUMBERS will get bigger.\r\nIf (machine-bogomips) is unknown, returns NUMBERS unscaled.\nMultiplies each number in NUMBERS by BOGOMIPS/(machine-bogomips).\nIf this machine is faster than BOGOMIPS, NUMBERS will get smaller.\nIf this machine is slower than BOGOMIPS, NUMBERS will get bigger.\nIf (machine-bogomips) is unknown, returns NUMBERS unscaled.")
    public static final SubLObject scale_by_bogomips_alt(SubLObject numbers, SubLObject bogomips) {
        {
            SubLObject local_bogomips = com.cyc.cycjava.cycl.misc_utilities.machine_bogomips();
            if ((!local_bogomips.isNumber()) || local_bogomips.numE(bogomips)) {
                return numbers;
            } else {
                {
                    SubLObject scaling_factor = divide(bogomips, local_bogomips);
                    SubLObject scaled_numbers = NIL;
                    SubLObject cdolist_list_var = numbers;
                    SubLObject number = NIL;
                    for (number = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , number = cdolist_list_var.first()) {
                        scaled_numbers = cons(multiply(number, scaling_factor), scaled_numbers);
                    }
                    return nreverse(scaled_numbers);
                }
            }
        }
    }

    /**
     * Multiplies each number in NUMBERS by BOGOMIPS/(machine-bogomips).
     * If this machine is faster than BOGOMIPS, NUMBERS will get smaller.
     * If this machine is slower than BOGOMIPS, NUMBERS will get bigger.
     * If (machine-bogomips) is unknown, returns NUMBERS unscaled.
     */
    @LispMethod(comment = "Multiplies each number in NUMBERS by BOGOMIPS/(machine-bogomips).\r\nIf this machine is faster than BOGOMIPS, NUMBERS will get smaller.\r\nIf this machine is slower than BOGOMIPS, NUMBERS will get bigger.\r\nIf (machine-bogomips) is unknown, returns NUMBERS unscaled.\nMultiplies each number in NUMBERS by BOGOMIPS/(machine-bogomips).\nIf this machine is faster than BOGOMIPS, NUMBERS will get smaller.\nIf this machine is slower than BOGOMIPS, NUMBERS will get bigger.\nIf (machine-bogomips) is unknown, returns NUMBERS unscaled.")
    public static SubLObject scale_by_bogomips(final SubLObject numbers, final SubLObject bogomips) {
        final SubLObject local_bogomips = misc_utilities.machine_bogomips();
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

    public static final SubLObject uninitialized_alt() {
        return $UNINITIALIZED;
    }

    public static SubLObject uninitialized() {
        return $UNINITIALIZED;
    }

    public static final SubLObject uninitialized_p_alt(SubLObject v_object) {
        return eq(v_object, com.cyc.cycjava.cycl.misc_utilities.uninitialized());
    }

    public static SubLObject uninitialized_p(final SubLObject v_object) {
        return eq(v_object, misc_utilities.uninitialized());
    }

    public static final SubLObject initialized_p_alt(SubLObject v_object) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.misc_utilities.uninitialized_p(v_object));
    }

    public static SubLObject initialized_p(final SubLObject v_object) {
        return makeBoolean(NIL == misc_utilities.uninitialized_p(v_object));
    }

    public static final SubLObject warn_unless_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject form = NIL;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt58);
            format_string = current.first();
            current = current.rest();
            {
                SubLObject v_arguments = current;
                return list(PUNLESS, form, listS(WARN, format_string, append(v_arguments, NIL)));
            }
        }
    }

    public static SubLObject warn_unless(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, misc_utilities.$list82);
        form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, misc_utilities.$list82);
        format_string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        return list(PUNLESS, form, listS(WARN, format_string, append(v_arguments, NIL)));
    }

    public static final SubLObject would_be_nice_if_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject form = NIL;
            SubLObject format_string = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt58);
            form = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt58);
            format_string = current.first();
            current = current.rest();
            {
                SubLObject v_arguments = current;
                return listS(WARN_UNLESS, form, format_string, append(v_arguments, NIL));
            }
        }
    }

    public static SubLObject would_be_nice_if(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject form = NIL;
        SubLObject format_string = NIL;
        destructuring_bind_must_consp(current, datum, misc_utilities.$list82);
        form = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, misc_utilities.$list82);
        format_string = current.first();
        final SubLObject v_arguments;
        current = v_arguments = current.rest();
        return listS(misc_utilities.WARN_UNLESS, form, format_string, append(v_arguments, NIL));
    }

    public static final SubLObject force_room_alt(SubLObject x) {
        if (x == UNPROVIDED) {
            x = $DEFAULT;
        }
        Storage.room(x);
        force_output(UNPROVIDED);
        return NIL;
    }

    public static SubLObject force_room(SubLObject x) {
        if (x == UNPROVIDED) {
            x = $DEFAULT;
        }
        Storage.room(x);
        force_output(UNPROVIDED);
        return NIL;
    }

    /**
     * A list of bindings which bind SubL variables (symbols) to values, as in a clet.
     *
     * @unknown this differs from a binding-list-p because variable binding lists are dotted and this is not.
     */
    @LispMethod(comment = "A list of bindings which bind SubL variables (symbols) to values, as in a clet.\r\n\r\n@unknown this differs from a binding-list-p because variable binding lists are dotted and this is not.")
    public static final SubLObject subl_variable_binding_list_p_alt(SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != every_in_list(SUBL_VARIABLE_BINDING_P, v_object, UNPROVIDED)));
    }

    /**
     * A list of bindings which bind SubL variables (symbols) to values, as in a clet.
     *
     * @unknown this differs from a binding-list-p because variable binding lists are dotted and this is not.
     */
    @LispMethod(comment = "A list of bindings which bind SubL variables (symbols) to values, as in a clet.\r\n\r\n@unknown this differs from a binding-list-p because variable binding lists are dotted and this is not.")
    public static SubLObject subl_variable_binding_list_p(final SubLObject v_object) {
        return makeBoolean(v_object.isList() && (NIL != list_utilities.every_in_list(misc_utilities.SUBL_VARIABLE_BINDING_P, v_object, UNPROVIDED)));
    }

    /**
     * A binding from a SubL variable (symbol) to a value, as in one element of a clet.
     *
     * @unknown this differs from a binding-p because variable bindings are dotted and this is not.
     */
    @LispMethod(comment = "A binding from a SubL variable (symbol) to a value, as in one element of a clet.\r\n\r\n@unknown this differs from a binding-p because variable bindings are dotted and this is not.")
    public static final SubLObject subl_variable_binding_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != doubletonP(v_object)) && v_object.first().isSymbol());
    }

    /**
     * A binding from a SubL variable (symbol) to a value, as in one element of a clet.
     *
     * @unknown this differs from a binding-p because variable bindings are dotted and this is not.
     */
    @LispMethod(comment = "A binding from a SubL variable (symbol) to a value, as in one element of a clet.\r\n\r\n@unknown this differs from a binding-p because variable bindings are dotted and this is not.")
    public static SubLObject subl_variable_binding_p(final SubLObject v_object) {
        return makeBoolean((NIL != list_utilities.doubletonP(v_object)) && v_object.first().isSymbol());
    }

    public static final SubLObject subl_variable_binding_list_variables_alt(SubLObject subl_binding_list) {
        SubLTrampolineFile.checkType(subl_binding_list, SUBL_VARIABLE_BINDING_LIST_P);
        return Mapping.mapcar(FIRST, subl_binding_list);
    }

    public static SubLObject subl_variable_binding_list_variables(final SubLObject subl_binding_list) {
        assert NIL != misc_utilities.subl_variable_binding_list_p(subl_binding_list) : "! misc_utilities.subl_variable_binding_list_p(subl_binding_list) " + ("misc_utilities.subl_variable_binding_list_p(subl_binding_list) " + "CommonSymbols.NIL != misc_utilities.subl_variable_binding_list_p(subl_binding_list) ") + subl_binding_list;
        return Mapping.mapcar(FIRST, subl_binding_list);
    }

    public static final SubLObject subl_variable_binding_list_values_alt(SubLObject subl_binding_list) {
        SubLTrampolineFile.checkType(subl_binding_list, SUBL_VARIABLE_BINDING_LIST_P);
        return Mapping.mapcar(SECOND, subl_binding_list);
    }

    public static SubLObject subl_variable_binding_list_values(final SubLObject subl_binding_list) {
        assert NIL != misc_utilities.subl_variable_binding_list_p(subl_binding_list) : "! misc_utilities.subl_variable_binding_list_p(subl_binding_list) " + ("misc_utilities.subl_variable_binding_list_p(subl_binding_list) " + "CommonSymbols.NIL != misc_utilities.subl_variable_binding_list_p(subl_binding_list) ") + subl_binding_list;
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
        final SubLObject v_methods = misc_utilities.methods_matching_name(name);
        return misc_utilities.show_apropos_methods_summary(v_methods, stream);
    }

    public static SubLObject apropos_globals(final SubLObject name, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject globals = misc_utilities.globals_matching_name(name);
        return misc_utilities.show_apropos_globals_summary(globals, stream);
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$Copyright__c__1995___2009_Cycorp_ = makeString("Copyright (c) 1995 - 2019 Cycorp.  All rights reserved.");

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
            final SubLObject doc = misc_utilities.method_documentation(method);
            final SubLObject tuple = listS(method, arglist, append(NIL != doc ? list(doc) : NIL, NIL));
            tuples = cons(tuple, tuples);
            cdolist_list_var = cdolist_list_var.rest();
            method = cdolist_list_var.first();
        } 
        tuples = nreverse(tuples);
        misc_utilities.show_apropos_results(tuples, stream);
        return length(tuples);
    }

    static private final SubLString $str_alt1$___Copyright__c__1998___2009_Cyco = makeString(";; Copyright (c) 1998 - 2009 Cycorp, Inc., All Rights Reserved.\n;; This file and its contents are products of Cycorp, Inc.  They are\n;; released only under specific license agreement with Cycorp, and\n;; must be treated as Cycorp Confidential Information, as per that\n;; license agreement, including translations into another language\n;; (including but not limited to Conceptual Graphs, KIF, Ontolingua,\n;; GFP, LOOM, PowerLOOM, CycL, C, C++, IDL, predicate logic, and\n;; English) and any logically equivalent rearrangement or renaming of\n;; assertion components, terms, or variables.  This paragraph shall\n;; not be altered or removed. This file is provided \"AS IS\", without\n;; any warranty; the cumulative liability of Cycorp for all claims\n;; relating to this file shall not exceed the amount of one dollar.\n;; Cycorp, 7718 Wood Hollow Drive, Suite 250, Austin, TX 78731, USA; \n;; Website: www.cyc.com, Tel: (512) 342-4000.");

    public static SubLObject show_apropos_globals_summary(final SubLObject globals, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        SubLObject tuples = NIL;
        SubLObject cdolist_list_var = globals;
        SubLObject global = NIL;
        global = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject doc = misc_utilities.global_documentation(global);
            final SubLObject tuple = bq_cons(global, append(NIL != doc ? list(doc) : NIL, NIL));
            tuples = cons(tuple, tuples);
            cdolist_list_var = cdolist_list_var.rest();
            global = cdolist_list_var.first();
        } 
        tuples = nreverse(tuples);
        misc_utilities.show_apropos_results(tuples, stream);
        return length(tuples);
    }

    static private final SubLString $str_alt3$No_KB_is_loaded___System_KB_initi = makeString("No KB is loaded.  System KB initializations will not be run.");

    static private final SubLString $str_alt5$hack_ = makeString("hack!");

    static private final SubLList $list_alt8 = list(makeString("init"), makeString("applications"));

    public static SubLObject methods_matching_name(final SubLObject name_spec) {
        return misc_utilities.apropos_wrt_name_spec(name_spec, FBOUNDP, UNPROVIDED);
    }

    static private final SubLString $str_alt9$gw_thesaurus_init = makeString("gw-thesaurus-init");

    static private final SubLString $$$lisp = makeString("lisp");

    public static SubLObject globals_matching_name(final SubLObject name_spec) {
        return misc_utilities.apropos_wrt_name_spec(name_spec, BOUNDP, UNPROVIDED);
    }

    static private final SubLString $str_alt11$file_backed_cache_initializer = makeString("file-backed cache initializer");

    public static SubLObject apropos_wrt_name_spec(final SubLObject name_spec, SubLObject filter, SubLObject match) {
        if (filter == UNPROVIDED) {
            filter = IDENTITY;
        }
        if (match == UNPROVIDED) {
            match = SEARCH;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!name_spec.isString())) && (NIL == list_utilities.list_of_type_p(STRINGP, name_spec))) {
            Errors.error(misc_utilities.$str96$Unexpected_name_spec____S, name_spec);
        }
        final SubLObject names = (name_spec.isString()) ? list(Strings.string_upcase(name_spec, UNPROVIDED, UNPROVIDED)) : Mapping.mapcar(symbol_function(misc_utilities.STRING_UPCASE), name_spec);
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

    static private final SubLString $str_alt16$Cannot_initialize_HL_KB_object_ca = makeString("Cannot initialize HL KB object caches.");

    static private final SubLString $str_alt17$Do_not_have_a_valid_location_for_ = makeString("Do not have a valid location for the HL store caches; ~A is not accessible");

    static private final SubLString $str_alt18$Could_not_initialize_HL_store_cac = makeString("Could not initialize HL store caches from ~A.");

    static private final SubLString $str_alt19$Initializing_HL_backing_store_cac = makeString("Initializing HL backing store caches from ~A.~%");

    static private final SubLString $str_alt21$Could_not_initialize_shared_symbo = makeString("Could not initialize shared symbols from ~A.");

    static private final SubLString $str_alt22$_ = makeString(".");

    static private final SubLString $str_alt23$HL_Store_directory_being_set_to_a = makeString("HL Store directory being set to absolute directory ~A.  Saved worlds will depend on this directory and may have problems running on other machines.");

    static private final SubLString $str_alt24$The_caches_directory_will_be_wron = makeString("The caches directory will be wrong under monolithic KB assumptions.");

    static private final SubLString $str_alt25$units__4__0d_ = makeString("units/~4,'0d/");

    static private final SubLString $str_alt26$Guessing_HL_Store_location_of__A = makeString("Guessing HL Store location of ~A");

    static private final SubLList $list_alt28 = list(new SubLObject[]{ $CONS, makeKeyword("ADJOIN"), makeKeyword("APPEND"), makeKeyword("UNION"), makeKeyword("CDR"), makeKeyword("CAR"), makeKeyword("RPLACA"), makeKeyword("REMOVE"), makeKeyword("RPLACD"), makeKeyword("REVERSE"), makeKeyword("INC"), makeKeyword("DEC") });

    static private final SubLList $list_alt40 = list(makeKeyword("REPLACE"));

    static private final SubLList $list_alt46 = list(CHAR_period);

    public static final SubLSymbol $kw50$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt51$Could_not_get_hostname_ = makeString("Could not get hostname.");

    static private final SubLString $str_alt53$_proc_cpuinfo = makeString("/proc/cpuinfo");

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
            destructuring_bind_must_consp(current, datum, misc_utilities.$list100);
            symbol = current.first();
            final SubLObject rest;
            current = rest = current.rest();
            if ((NIL != fboundp(symbol)) && rest.first().isList()) {
                SubLObject current_$4;
                final SubLObject datum_$3 = current_$4 = rest;
                SubLObject arglist = NIL;
                destructuring_bind_must_consp(current_$4, datum_$3, misc_utilities.$list101);
                arglist = current_$4.first();
                current_$4 = current_$4.rest();
                final SubLObject documentation = (current_$4.isCons()) ? current_$4.first() : NIL;
                destructuring_bind_must_listp(current_$4, datum_$3, misc_utilities.$list101);
                current_$4 = current_$4.rest();
                if (NIL == current_$4) {
                    format(stream, misc_utilities.$str102$___S_, symbol);
                    if (NIL != arglist) {
                        format(stream, misc_utilities.$str103$_S, arglist);
                    } else {
                        format(stream, misc_utilities.$str104$__);
                    }
                    if (documentation.isString()) {
                        format(stream, misc_utilities.$str105$_____S__, documentation);
                    }
                } else {
                    cdestructuring_bind_error(datum_$3, misc_utilities.$list101);
                }
            }
            if (NIL != boundp(symbol)) {
                SubLObject current_$5;
                final SubLObject datum_$4 = current_$5 = rest;
                final SubLObject documentation2 = (current_$5.isCons()) ? current_$5.first() : NIL;
                destructuring_bind_must_listp(current_$5, datum_$4, misc_utilities.$list106);
                final SubLObject whatever;
                current_$5 = whatever = current_$5.rest();
                format(stream, misc_utilities.$str107$___S__S, symbol, eval(symbol));
                if (documentation2.isString()) {
                    format(stream, misc_utilities.$str105$_____S__, documentation2);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            tuple = cdolist_list_var.first();
        } 
        return NIL;
    }

    static private final SubLString $str_alt55$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt57$_ = makeString(":");

    static private final SubLList $list_alt58 = list(makeSymbol("FORM"), makeSymbol("FORMAT-STRING"), makeSymbol("&REST"), makeSymbol("ARGUMENTS"));

    public static SubLObject method_documentation(final SubLObject method) {
        return NIL;
    }

    public static SubLObject global_documentation(final SubLObject global) {
        return NIL;
    }

    public static SubLObject method_complete(final SubLObject name_prefix) {
        assert NIL != string_utilities.non_empty_string_p(name_prefix) : "! string_utilities.non_empty_string_p(name_prefix) " + ("string_utilities.non_empty_string_p(name_prefix) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(name_prefix) ") + name_prefix;
        return misc_utilities.symbol_complete(name_prefix, FBOUNDP);
    }

    public static SubLObject global_complete(final SubLObject name_prefix) {
        assert NIL != string_utilities.non_empty_string_p(name_prefix) : "! string_utilities.non_empty_string_p(name_prefix) " + ("string_utilities.non_empty_string_p(name_prefix) " + "CommonSymbols.NIL != string_utilities.non_empty_string_p(name_prefix) ") + name_prefix;
        return misc_utilities.symbol_complete(name_prefix, BOUNDP);
    }

    public static SubLObject symbol_complete(SubLObject name_prefix, SubLObject filter) {
        if (filter == UNPROVIDED) {
            filter = TRUE;
        }
        name_prefix = Strings.string_upcase(name_prefix, UNPROVIDED, UNPROVIDED);
        final SubLObject candidates = misc_utilities.apropos_wrt_name_spec(name_prefix, filter, misc_utilities.STRING_IS_PREFIX_OF);
        final SubLObject symbol_names = Mapping.mapcar(symbol_function(SYMBOL_NAME), candidates);
        final SubLObject shared_extension = misc_utilities.sorted_strings_shared_extension(symbol_names, name_prefix);
        return values(candidates, shared_extension);
    }

    public static SubLObject string_is_prefix_of(final SubLObject prefix, final SubLObject larger_string) {
        return string_utilities.starts_with(larger_string, prefix);
    }

    public static SubLObject sorted_strings_shared_extension(final SubLObject strings, final SubLObject common_prefix) {
        if (NIL == strings) {
            return misc_utilities.$str8$;
        }
        final SubLObject first_string = strings.first();
        final SubLObject last_string = list_utilities.last_one(strings);
        final SubLObject shared_extension_start = length(common_prefix);
        if (NIL != list_utilities.singletonP(strings)) {
            return subseq(first_string, shared_extension_start, UNPROVIDED);
        }
        final SubLObject shared_extension_end = mismatch(first_string, last_string, symbol_function(EQL), symbol_function(IDENTITY), shared_extension_start, NIL, shared_extension_start, NIL);
        final SubLObject shared_extension = (shared_extension_end.isInteger() && shared_extension_end.numGE(shared_extension_start)) ? subseq(first_string, shared_extension_start, shared_extension_end) : misc_utilities.$str8$;
        return shared_extension;
    }

    public static SubLObject memoization_state_method_entry_tuples_for_display(final SubLObject v_memoization_state, final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "! memoization_state.memoization_state_p(v_memoization_state) " + ("memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) ") + v_memoization_state;
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
                            destructuring_bind_must_consp(current, datum, misc_utilities.$list112);
                            arg = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, misc_utilities.$list112);
                            values2 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                final SubLObject tuple2 = listS(list(arg), copy_list(values2));
                                tuples = cons(tuple2, tuples);
                            } else {
                                cdestructuring_bind_error(datum, misc_utilities.$list112);
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
                            destructuring_bind_must_consp(current, datum, misc_utilities.$list113);
                            sxhash = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, misc_utilities.$list113);
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
                                    destructuring_bind_must_consp(current_$8, datum_$7, misc_utilities.$list114);
                                    args = current_$8.first();
                                    current_$8 = current_$8.rest();
                                    destructuring_bind_must_consp(current_$8, datum_$7, misc_utilities.$list114);
                                    values3 = current_$8.first();
                                    current_$8 = current_$8.rest();
                                    if (NIL == current_$8) {
                                        final SubLObject tuple3 = listS(copy_list(args), copy_list(values3));
                                        tuples = cons(tuple3, tuples);
                                    } else {
                                        cdestructuring_bind_error(datum_$7, misc_utilities.$list114);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    collision = cdolist_list_var.first();
                                } 
                            } else {
                                cdestructuring_bind_error(datum, misc_utilities.$list113);
                            }
                        }
                    }
                }

            tuples = Sort.sort(tuples, symbol_function(misc_utilities.$sym115$TERM__), symbol_function(FIRST));
            return tuples;
        }
        return NIL;
    }

    public static SubLObject show_memoization_state(final SubLObject v_memoization_state, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        assert NIL != memoization_state.memoization_state_p(v_memoization_state) : "! memoization_state.memoization_state_p(v_memoization_state) " + ("memoization_state.memoization_state_p(v_memoization_state) " + "CommonSymbols.NIL != memoization_state.memoization_state_p(v_memoization_state) ") + v_memoization_state;
        SubLObject v_methods = memoization_state.memoization_state_keys(v_memoization_state);
        SubLObject cdolist_list_var;
        v_methods = cdolist_list_var = kb_utilities.sort_terms(v_methods, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject method = NIL;
        method = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject tuples = misc_utilities.memoization_state_method_entry_tuples_for_display(v_memoization_state, method);
            if (NIL != tuples) {
                format(stream, misc_utilities.$str116$____Method____S, method);
                SubLObject cdolist_list_var_$9 = tuples;
                SubLObject tuple = NIL;
                tuple = cdolist_list_var_$9.first();
                while (NIL != cdolist_list_var_$9) {
                    terpri(stream);
                    SubLObject current;
                    final SubLObject datum = current = tuple;
                    SubLObject args = NIL;
                    SubLObject values = NIL;
                    destructuring_bind_must_consp(current, datum, misc_utilities.$list117);
                    args = current.first();
                    current = values = current.rest();
                    if (NIL != args) {
                        if (NIL != list_utilities.singletonP(args)) {
                            format(stream, misc_utilities.$str118$_S_, args.first());
                        } else {
                            format(stream, misc_utilities.$str118$_S_, args);
                        }
                    }
                    write_string(misc_utilities.$str119$___, stream, UNPROVIDED, UNPROVIDED);
                    if (NIL != list_utilities.singletonP(values)) {
                        format(stream, misc_utilities.$str103$_S, values.first());
                    } else {
                        format(stream, misc_utilities.$str120$values__S, values);
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

    public static final SubLObject declare_misc_utilities_file_alt() {
        declareFunction("copyright_notice", "COPYRIGHT-NOTICE", 0, 0, false);
        declareFunction("kb_content_copyright_notice", "KB-CONTENT-COPYRIGHT-NOTICE", 0, 0, false);
        declareFunction("write_kb_content_copyright_notice", "WRITE-KB-CONTENT-COPYRIGHT-NOTICE", 1, 0, false);
        declareFunction("system_code_initializations", "SYSTEM-CODE-INITIALIZATIONS", 0, 1, false);
        declareFunction("system_code_initializations_run_p", "SYSTEM-CODE-INITIALIZATIONS-RUN-P", 0, 0, false);
        declareFunction("redo_system_code_initializations", "REDO-SYSTEM-CODE-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_code_image_initializations", "SYSTEM-CODE-IMAGE-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_code_hl_initializations", "SYSTEM-CODE-HL-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_code_inference_initializations", "SYSTEM-CODE-INFERENCE-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_code_api_initializations", "SYSTEM-CODE-API-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_code_application_initializations", "SYSTEM-CODE-APPLICATION-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_kb_initializations", "SYSTEM-KB-INITIALIZATIONS", 0, 0, false);
        declareFunction("initialize_file_backed_nl_datastructures", "INITIALIZE-FILE-BACKED-NL-DATASTRUCTURES", 0, 0, false);
        declareFunction("get_hl_store_caches_shared_symbols", "GET-HL-STORE-CACHES-SHARED-SYMBOLS", 0, 0, false);
        declareFunction("initialize_hl_store_caches", "INITIALIZE-HL-STORE-CACHES", 0, 0, false);
        declareFunction("initialize_hl_store_caches_from_directory", "INITIALIZE-HL-STORE-CACHES-FROM-DIRECTORY", 1, 1, false);
        declareFunction("initialize_hl_store_cache_directory_and_shared_symbols", "INITIALIZE-HL-STORE-CACHE-DIRECTORY-AND-SHARED-SYMBOLS", 1, 1, false);
        declareFunction("initialize_hl_store_cache_shared_symbols", "INITIALIZE-HL-STORE-CACHE-SHARED-SYMBOLS", 1, 0, false);
        declareFunction("hl_store_content_completely_cachedP", "HL-STORE-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction("get_hl_store_cache_filename", "GET-HL-STORE-CACHE-FILENAME", 2, 0, false);
        declareFunction("set_hl_store_caches_directory", "SET-HL-STORE-CACHES-DIRECTORY", 1, 0, false);
        declareFunction("generic_caches_directory", "GENERIC-CACHES-DIRECTORY", 0, 0, false);
        declareFunction("hl_store_caches_directory", "HL-STORE-CACHES-DIRECTORY", 0, 0, false);
        declareFunction("compute_hl_store_caches_directory", "COMPUTE-HL-STORE-CACHES-DIRECTORY", 0, 0, false);
        declareFunction("cdr_eqlP", "CDR-EQL?", 2, 0, false);
        declareFunction("not_member_equal", "NOT-MEMBER-EQUAL", 2, 0, false);
        declareFunction("get_indexed_obj", "GET-INDEXED-OBJ", 2, 1, false);
        declareFunction("update_vector_indexed_val", "UPDATE-VECTOR-INDEXED-VAL", 5, 4, false);
        declareFunction("get_vector_indexed_val", "GET-VECTOR-INDEXED-VAL", 4, 2, false);
        declareFunction("clear_indexed_vectors", "CLEAR-INDEXED-VECTORS", 1, 0, false);
        declareFunction("make_indexed_vector", "MAKE-INDEXED-VECTOR", 1, 1, false);
        declareFunction("vector_cells_filled", "VECTOR-CELLS-FILLED", 1, 0, false);
        declareFunction("extract_until", "EXTRACT-UNTIL", 2, 1, false);
        declareFunction("extract_until_any", "EXTRACT-UNTIL-ANY", 2, 1, false);
        declareFunction("number_list", "NUMBER-LIST", 1, 0, false);
        declareFunction("aconsnew", "ACONSNEW", 3, 2, false);
        declareFunction("print_n_per_line", "PRINT-N-PER-LINE", 2, 1, false);
        declareFunction("other_binary_arg", "OTHER-BINARY-ARG", 1, 0, false);
        declareFunction("number_of_non_null_args", "NUMBER-OF-NON-NULL-ARGS", 0, 5, false);
        declareFunction("boolean_to_keyword", "BOOLEAN-TO-KEYWORD", 1, 0, false);
        declareFunction("keyword_to_boolean", "KEYWORD-TO-BOOLEAN", 1, 0, false);
        declareFunction("get_unqualified_machine_name", "GET-UNQUALIFIED-MACHINE-NAME", 0, 0, false);
        declareFunction("clear_hostname", "CLEAR-HOSTNAME", 0, 0, false);
        declareFunction("remove_hostname", "REMOVE-HOSTNAME", 0, 0, false);
        declareFunction("hostname_internal", "HOSTNAME-INTERNAL", 0, 0, false);
        declareFunction("hostname", "HOSTNAME", 0, 0, false);
        declareFunction("machine_name", "MACHINE-NAME", 0, 0, false);
        declareFunction("function_spec_function", "FUNCTION-SPEC-FUNCTION", 1, 0, false);
        declareFunction("machine_bogomips", "MACHINE-BOGOMIPS", 0, 0, false);
        declareFunction("clear_machine_bogomips", "CLEAR-MACHINE-BOGOMIPS", 0, 0, false);
        declareFunction("compute_machine_bogomips", "COMPUTE-MACHINE-BOGOMIPS", 0, 0, false);
        declareFunction("scale_by_bogomips", "SCALE-BY-BOGOMIPS", 2, 0, false);
        declareFunction("uninitialized", "UNINITIALIZED", 0, 0, false);
        declareFunction("uninitialized_p", "UNINITIALIZED-P", 1, 0, false);
        declareFunction("initialized_p", "INITIALIZED-P", 1, 0, false);
        declareMacro("warn_unless", "WARN-UNLESS");
        declareMacro("would_be_nice_if", "WOULD-BE-NICE-IF");
        declareFunction("force_room", "FORCE-ROOM", 0, 1, false);
        declareFunction("subl_variable_binding_list_p", "SUBL-VARIABLE-BINDING-LIST-P", 1, 0, false);
        declareFunction("subl_variable_binding_p", "SUBL-VARIABLE-BINDING-P", 1, 0, false);
        declareFunction("subl_variable_binding_list_variables", "SUBL-VARIABLE-BINDING-LIST-VARIABLES", 1, 0, false);
        declareFunction("subl_variable_binding_list_values", "SUBL-VARIABLE-BINDING-LIST-VALUES", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_misc_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("copyright_notice", "COPYRIGHT-NOTICE", 0, 0, false);
            declareFunction("kb_content_copyright_notice", "KB-CONTENT-COPYRIGHT-NOTICE", 0, 0, false);
            declareFunction("write_kb_content_copyright_notice", "WRITE-KB-CONTENT-COPYRIGHT-NOTICE", 1, 0, false);
            declareFunction("system_code_initializations", "SYSTEM-CODE-INITIALIZATIONS", 0, 1, false);
            declareFunction("system_code_initializations_internal", "SYSTEM-CODE-INITIALIZATIONS-INTERNAL", 1, 0, false);
            declareFunction("cyc_system_code_string", "CYC-SYSTEM-CODE-STRING", 0, 0, false);
            declareFunction("system_code_version_initialization", "SYSTEM-CODE-VERSION-INITIALIZATION", 0, 1, false);
            declareFunction("system_code_initializations_run_p", "SYSTEM-CODE-INITIALIZATIONS-RUN-P", 0, 0, false);
            declareFunction("redo_system_code_initializations", "REDO-SYSTEM-CODE-INITIALIZATIONS", 0, 0, false);
            declareFunction("system_code_image_initializations", "SYSTEM-CODE-IMAGE-INITIALIZATIONS", 0, 0, false);
            declareFunction("system_code_hl_initializations", "SYSTEM-CODE-HL-INITIALIZATIONS", 0, 0, false);
            declareFunction("system_code_inference_initializations", "SYSTEM-CODE-INFERENCE-INITIALIZATIONS", 0, 0, false);
            declareFunction("system_code_api_initializations", "SYSTEM-CODE-API-INITIALIZATIONS", 0, 0, false);
            declareFunction("system_code_application_initializations", "SYSTEM-CODE-APPLICATION-INITIALIZATIONS", 0, 0, false);
            declareFunction("system_kb_initializations", "SYSTEM-KB-INITIALIZATIONS", 0, 0, false);
            declareFunction("validate_hl_and_kb_settings", "VALIDATE-HL-AND-KB-SETTINGS", 0, 0, false);
            declareFunction("initialize_file_backed_nl_datastructures", "INITIALIZE-FILE-BACKED-NL-DATASTRUCTURES", 0, 0, false);
            declareFunction("get_hl_store_caches_shared_symbols", "GET-HL-STORE-CACHES-SHARED-SYMBOLS", 0, 0, false);
            declareFunction("get_hl_store_caches_shared_symbols_simple", "GET-HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE", 0, 0, false);
            declareFunction("initialize_hl_store_caches", "INITIALIZE-HL-STORE-CACHES", 0, 0, false);
            declareFunction("initialize_hl_store_caches_from_directory", "INITIALIZE-HL-STORE-CACHES-FROM-DIRECTORY", 1, 1, false);
            declareFunction("initialize_hl_store_cache_directory_and_shared_symbols", "INITIALIZE-HL-STORE-CACHE-DIRECTORY-AND-SHARED-SYMBOLS", 1, 1, false);
            declareFunction("initialize_hl_store_cache_shared_symbols", "INITIALIZE-HL-STORE-CACHE-SHARED-SYMBOLS", 1, 0, false);
            declareFunction("hl_store_content_completely_cachedP", "HL-STORE-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
            declareFunction("get_hl_store_cache_filename", "GET-HL-STORE-CACHE-FILENAME", 1, 1, false);
            declareFunction("set_hl_store_caches_directory", "SET-HL-STORE-CACHES-DIRECTORY", 1, 0, false);
            declareFunction("generic_caches_directory", "GENERIC-CACHES-DIRECTORY", 0, 0, false);
            declareFunction("hl_store_caches_directory", "HL-STORE-CACHES-DIRECTORY", 0, 0, false);
            declareFunction("compute_hl_store_caches_directory", "COMPUTE-HL-STORE-CACHES-DIRECTORY", 0, 0, false);
            declareFunction("cdr_eqlP", "CDR-EQL?", 2, 0, false);
            declareFunction("not_member_equal", "NOT-MEMBER-EQUAL", 2, 0, false);
            declareFunction("get_indexed_obj", "GET-INDEXED-OBJ", 2, 1, false);
            declareFunction("update_vector_indexed_val", "UPDATE-VECTOR-INDEXED-VAL", 5, 4, false);
            declareFunction("get_vector_indexed_val", "GET-VECTOR-INDEXED-VAL", 4, 2, false);
            declareFunction("clear_indexed_vectors", "CLEAR-INDEXED-VECTORS", 1, 0, false);
            declareFunction("make_indexed_vector", "MAKE-INDEXED-VECTOR", 1, 1, false);
            declareFunction("vector_cells_filled", "VECTOR-CELLS-FILLED", 1, 0, false);
            declareFunction("extract_until", "EXTRACT-UNTIL", 2, 1, false);
            declareFunction("extract_until_any", "EXTRACT-UNTIL-ANY", 2, 1, false);
            declareFunction("number_list", "NUMBER-LIST", 1, 0, false);
            declareFunction("aconsnew", "ACONSNEW", 3, 2, false);
            declareFunction("print_n_per_line", "PRINT-N-PER-LINE", 2, 1, false);
            declareFunction("other_binary_arg", "OTHER-BINARY-ARG", 1, 0, false);
            declareFunction("number_of_non_null_args", "NUMBER-OF-NON-NULL-ARGS", 0, 5, false);
            declareFunction("boolean_to_keyword", "BOOLEAN-TO-KEYWORD", 1, 0, false);
            declareFunction("keyword_to_boolean", "KEYWORD-TO-BOOLEAN", 1, 0, false);
            declareFunction("get_unqualified_machine_name", "GET-UNQUALIFIED-MACHINE-NAME", 0, 0, false);
            declareFunction("clear_hostname", "CLEAR-HOSTNAME", 0, 0, false);
            declareFunction("remove_hostname", "REMOVE-HOSTNAME", 0, 0, false);
            declareFunction("hostname_internal", "HOSTNAME-INTERNAL", 0, 0, false);
            declareFunction("hostname", "HOSTNAME", 0, 0, false);
            declareFunction("machine_name", "MACHINE-NAME", 0, 0, false);
            declareFunction("function_spec_function", "FUNCTION-SPEC-FUNCTION", 1, 0, false);
            declareFunction("machine_bogomips", "MACHINE-BOGOMIPS", 0, 0, false);
            declareFunction("clear_machine_bogomips", "CLEAR-MACHINE-BOGOMIPS", 0, 0, false);
            declareFunction("compute_machine_bogomips", "COMPUTE-MACHINE-BOGOMIPS", 0, 0, false);
            declareFunction("scale_by_bogomips", "SCALE-BY-BOGOMIPS", 2, 0, false);
            declareFunction("uninitialized", "UNINITIALIZED", 0, 0, false);
            declareFunction("uninitialized_p", "UNINITIALIZED-P", 1, 0, false);
            declareFunction("initialized_p", "INITIALIZED-P", 1, 0, false);
            declareMacro("warn_unless", "WARN-UNLESS");
            declareMacro("would_be_nice_if", "WOULD-BE-NICE-IF");
            declareFunction("force_room", "FORCE-ROOM", 0, 1, false);
            declareFunction("subl_variable_binding_list_p", "SUBL-VARIABLE-BINDING-LIST-P", 1, 0, false);
            declareFunction("subl_variable_binding_p", "SUBL-VARIABLE-BINDING-P", 1, 0, false);
            declareFunction("subl_variable_binding_list_variables", "SUBL-VARIABLE-BINDING-LIST-VARIABLES", 1, 0, false);
            declareFunction("subl_variable_binding_list_values", "SUBL-VARIABLE-BINDING-LIST-VALUES", 1, 0, false);
            declareFunction("flush_all_logs", "FLUSH-ALL-LOGS", 0, 0, false);
            declareFunction("apropos_methods", "APROPOS-METHODS", 1, 1, false);
            declareFunction("apropos_globals", "APROPOS-GLOBALS", 1, 1, false);
            declareFunction("show_apropos_methods_summary", "SHOW-APROPOS-METHODS-SUMMARY", 1, 1, false);
            declareFunction("show_apropos_globals_summary", "SHOW-APROPOS-GLOBALS-SUMMARY", 1, 1, false);
            declareFunction("methods_matching_name", "METHODS-MATCHING-NAME", 1, 0, false);
            declareFunction("globals_matching_name", "GLOBALS-MATCHING-NAME", 1, 0, false);
            declareFunction("apropos_wrt_name_spec", "APROPOS-WRT-NAME-SPEC", 1, 2, false);
            declareFunction("show_apropos_results", "SHOW-APROPOS-RESULTS", 1, 1, false);
            declareFunction("method_documentation", "METHOD-DOCUMENTATION", 1, 0, false);
            declareFunction("global_documentation", "GLOBAL-DOCUMENTATION", 1, 0, false);
            declareFunction("method_complete", "METHOD-COMPLETE", 1, 0, false);
            declareFunction("global_complete", "GLOBAL-COMPLETE", 1, 0, false);
            declareFunction("symbol_complete", "SYMBOL-COMPLETE", 1, 1, false);
            declareFunction("string_is_prefix_of", "STRING-IS-PREFIX-OF", 2, 0, false);
            declareFunction("sorted_strings_shared_extension", "SORTED-STRINGS-SHARED-EXTENSION", 2, 0, false);
            declareFunction("memoization_state_method_entry_tuples_for_display", "MEMOIZATION-STATE-METHOD-ENTRY-TUPLES-FOR-DISPLAY", 2, 0, false);
            declareFunction("show_memoization_state", "SHOW-MEMOIZATION-STATE", 1, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_hl_store_cache_filename", "GET-HL-STORE-CACHE-FILENAME", 2, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_misc_utilities_file_Previous() {
        declareFunction("copyright_notice", "COPYRIGHT-NOTICE", 0, 0, false);
        declareFunction("kb_content_copyright_notice", "KB-CONTENT-COPYRIGHT-NOTICE", 0, 0, false);
        declareFunction("write_kb_content_copyright_notice", "WRITE-KB-CONTENT-COPYRIGHT-NOTICE", 1, 0, false);
        declareFunction("system_code_initializations", "SYSTEM-CODE-INITIALIZATIONS", 0, 1, false);
        declareFunction("system_code_initializations_internal", "SYSTEM-CODE-INITIALIZATIONS-INTERNAL", 1, 0, false);
        declareFunction("cyc_system_code_string", "CYC-SYSTEM-CODE-STRING", 0, 0, false);
        declareFunction("system_code_version_initialization", "SYSTEM-CODE-VERSION-INITIALIZATION", 0, 1, false);
        declareFunction("system_code_initializations_run_p", "SYSTEM-CODE-INITIALIZATIONS-RUN-P", 0, 0, false);
        declareFunction("redo_system_code_initializations", "REDO-SYSTEM-CODE-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_code_image_initializations", "SYSTEM-CODE-IMAGE-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_code_hl_initializations", "SYSTEM-CODE-HL-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_code_inference_initializations", "SYSTEM-CODE-INFERENCE-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_code_api_initializations", "SYSTEM-CODE-API-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_code_application_initializations", "SYSTEM-CODE-APPLICATION-INITIALIZATIONS", 0, 0, false);
        declareFunction("system_kb_initializations", "SYSTEM-KB-INITIALIZATIONS", 0, 0, false);
        declareFunction("validate_hl_and_kb_settings", "VALIDATE-HL-AND-KB-SETTINGS", 0, 0, false);
        declareFunction("initialize_file_backed_nl_datastructures", "INITIALIZE-FILE-BACKED-NL-DATASTRUCTURES", 0, 0, false);
        declareFunction("get_hl_store_caches_shared_symbols", "GET-HL-STORE-CACHES-SHARED-SYMBOLS", 0, 0, false);
        declareFunction("get_hl_store_caches_shared_symbols_simple", "GET-HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE", 0, 0, false);
        declareFunction("initialize_hl_store_caches", "INITIALIZE-HL-STORE-CACHES", 0, 0, false);
        declareFunction("initialize_hl_store_caches_from_directory", "INITIALIZE-HL-STORE-CACHES-FROM-DIRECTORY", 1, 1, false);
        declareFunction("initialize_hl_store_cache_directory_and_shared_symbols", "INITIALIZE-HL-STORE-CACHE-DIRECTORY-AND-SHARED-SYMBOLS", 1, 1, false);
        declareFunction("initialize_hl_store_cache_shared_symbols", "INITIALIZE-HL-STORE-CACHE-SHARED-SYMBOLS", 1, 0, false);
        declareFunction("hl_store_content_completely_cachedP", "HL-STORE-CONTENT-COMPLETELY-CACHED?", 0, 0, false);
        declareFunction("get_hl_store_cache_filename", "GET-HL-STORE-CACHE-FILENAME", 1, 1, false);
        declareFunction("set_hl_store_caches_directory", "SET-HL-STORE-CACHES-DIRECTORY", 1, 0, false);
        declareFunction("generic_caches_directory", "GENERIC-CACHES-DIRECTORY", 0, 0, false);
        declareFunction("hl_store_caches_directory", "HL-STORE-CACHES-DIRECTORY", 0, 0, false);
        declareFunction("compute_hl_store_caches_directory", "COMPUTE-HL-STORE-CACHES-DIRECTORY", 0, 0, false);
        declareFunction("cdr_eqlP", "CDR-EQL?", 2, 0, false);
        declareFunction("not_member_equal", "NOT-MEMBER-EQUAL", 2, 0, false);
        declareFunction("get_indexed_obj", "GET-INDEXED-OBJ", 2, 1, false);
        declareFunction("update_vector_indexed_val", "UPDATE-VECTOR-INDEXED-VAL", 5, 4, false);
        declareFunction("get_vector_indexed_val", "GET-VECTOR-INDEXED-VAL", 4, 2, false);
        declareFunction("clear_indexed_vectors", "CLEAR-INDEXED-VECTORS", 1, 0, false);
        declareFunction("make_indexed_vector", "MAKE-INDEXED-VECTOR", 1, 1, false);
        declareFunction("vector_cells_filled", "VECTOR-CELLS-FILLED", 1, 0, false);
        declareFunction("extract_until", "EXTRACT-UNTIL", 2, 1, false);
        declareFunction("extract_until_any", "EXTRACT-UNTIL-ANY", 2, 1, false);
        declareFunction("number_list", "NUMBER-LIST", 1, 0, false);
        declareFunction("aconsnew", "ACONSNEW", 3, 2, false);
        declareFunction("print_n_per_line", "PRINT-N-PER-LINE", 2, 1, false);
        declareFunction("other_binary_arg", "OTHER-BINARY-ARG", 1, 0, false);
        declareFunction("number_of_non_null_args", "NUMBER-OF-NON-NULL-ARGS", 0, 5, false);
        declareFunction("boolean_to_keyword", "BOOLEAN-TO-KEYWORD", 1, 0, false);
        declareFunction("keyword_to_boolean", "KEYWORD-TO-BOOLEAN", 1, 0, false);
        declareFunction("get_unqualified_machine_name", "GET-UNQUALIFIED-MACHINE-NAME", 0, 0, false);
        declareFunction("clear_hostname", "CLEAR-HOSTNAME", 0, 0, false);
        declareFunction("remove_hostname", "REMOVE-HOSTNAME", 0, 0, false);
        declareFunction("hostname_internal", "HOSTNAME-INTERNAL", 0, 0, false);
        declareFunction("hostname", "HOSTNAME", 0, 0, false);
        declareFunction("machine_name", "MACHINE-NAME", 0, 0, false);
        declareFunction("function_spec_function", "FUNCTION-SPEC-FUNCTION", 1, 0, false);
        declareFunction("machine_bogomips", "MACHINE-BOGOMIPS", 0, 0, false);
        declareFunction("clear_machine_bogomips", "CLEAR-MACHINE-BOGOMIPS", 0, 0, false);
        declareFunction("compute_machine_bogomips", "COMPUTE-MACHINE-BOGOMIPS", 0, 0, false);
        declareFunction("scale_by_bogomips", "SCALE-BY-BOGOMIPS", 2, 0, false);
        declareFunction("uninitialized", "UNINITIALIZED", 0, 0, false);
        declareFunction("uninitialized_p", "UNINITIALIZED-P", 1, 0, false);
        declareFunction("initialized_p", "INITIALIZED-P", 1, 0, false);
        declareMacro("warn_unless", "WARN-UNLESS");
        declareMacro("would_be_nice_if", "WOULD-BE-NICE-IF");
        declareFunction("force_room", "FORCE-ROOM", 0, 1, false);
        declareFunction("subl_variable_binding_list_p", "SUBL-VARIABLE-BINDING-LIST-P", 1, 0, false);
        declareFunction("subl_variable_binding_p", "SUBL-VARIABLE-BINDING-P", 1, 0, false);
        declareFunction("subl_variable_binding_list_variables", "SUBL-VARIABLE-BINDING-LIST-VARIABLES", 1, 0, false);
        declareFunction("subl_variable_binding_list_values", "SUBL-VARIABLE-BINDING-LIST-VALUES", 1, 0, false);
        declareFunction("flush_all_logs", "FLUSH-ALL-LOGS", 0, 0, false);
        declareFunction("apropos_methods", "APROPOS-METHODS", 1, 1, false);
        declareFunction("apropos_globals", "APROPOS-GLOBALS", 1, 1, false);
        declareFunction("show_apropos_methods_summary", "SHOW-APROPOS-METHODS-SUMMARY", 1, 1, false);
        declareFunction("show_apropos_globals_summary", "SHOW-APROPOS-GLOBALS-SUMMARY", 1, 1, false);
        declareFunction("methods_matching_name", "METHODS-MATCHING-NAME", 1, 0, false);
        declareFunction("globals_matching_name", "GLOBALS-MATCHING-NAME", 1, 0, false);
        declareFunction("apropos_wrt_name_spec", "APROPOS-WRT-NAME-SPEC", 1, 2, false);
        declareFunction("show_apropos_results", "SHOW-APROPOS-RESULTS", 1, 1, false);
        declareFunction("method_documentation", "METHOD-DOCUMENTATION", 1, 0, false);
        declareFunction("global_documentation", "GLOBAL-DOCUMENTATION", 1, 0, false);
        declareFunction("method_complete", "METHOD-COMPLETE", 1, 0, false);
        declareFunction("global_complete", "GLOBAL-COMPLETE", 1, 0, false);
        declareFunction("symbol_complete", "SYMBOL-COMPLETE", 1, 1, false);
        declareFunction("string_is_prefix_of", "STRING-IS-PREFIX-OF", 2, 0, false);
        declareFunction("sorted_strings_shared_extension", "SORTED-STRINGS-SHARED-EXTENSION", 2, 0, false);
        declareFunction("memoization_state_method_entry_tuples_for_display", "MEMOIZATION-STATE-METHOD-ENTRY-TUPLES-FOR-DISPLAY", 2, 0, false);
        declareFunction("show_memoization_state", "SHOW-MEMOIZATION-STATE", 1, 1, false);
        return NIL;
    }

    public static final SubLObject init_misc_utilities_file_alt() {
        defconstant("*KB-CONTENT-COPYRIGHT-NOTICE*", $str_alt1$___Copyright__c__1998___2009_Cyco);
        deflexical("*SYSTEM-CODE-INITIALIZATIONS-MARKER*", NIL != boundp($system_code_initializations_marker$) ? ((SubLObject) ($system_code_initializations_marker$.getGlobalValue())) : Environment.get_process_id(UNPROVIDED));
        deflexical("*HL-STORE-CACHES-DIRECTORY*", NIL != boundp($hl_store_caches_directory$) ? ((SubLObject) ($hl_store_caches_directory$.getGlobalValue())) : NIL);
        deflexical("*HL-STORE-CACHES-SHARED-SYMBOLS*", NIL != boundp($hl_store_caches_shared_symbols$) ? ((SubLObject) ($hl_store_caches_shared_symbols$.getGlobalValue())) : NIL);
        deflexical("*HOSTNAME-CACHING-STATE*", NIL);
        deflexical("*MACHINE-BOGOMIPS*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject init_misc_utilities_file() {
        if (SubLFiles.USE_V1) {
            defconstant("*KB-CONTENT-COPYRIGHT-NOTICE*", misc_utilities.$str1$___Copyright__c__1998___2014_Cyco);
            deflexical("*SYSTEM-CODE-INITIALIZATIONS-MARKER*", SubLTrampolineFile.maybeDefault(misc_utilities.$system_code_initializations_marker$, misc_utilities.$system_code_initializations_marker$, () -> Environment.get_process_id(UNPROVIDED)));
            deflexical("*SYSTEM-CODE-INITIALIZATIONS-LOCK*", SubLTrampolineFile.maybeDefault(misc_utilities.$system_code_initializations_lock$, misc_utilities.$system_code_initializations_lock$, () -> make_lock(misc_utilities.$$$System_Code_Initializations_Lock)));
            deflexical("*SYSTEM-CODE-VERSION-STRING*", NIL);
            deflexical("*SYSTEM-CODE-RELEASE-STRING*", NIL);
            deflexical("*ID-SPACE-FIXNUM-RANGE-PROBLEM*", cconcatenate(misc_utilities.$str33$__Your_KB_object_ID_space_has_out, new SubLObject[]{ misc_utilities.$str34$__Performance__and_most_likely_co, misc_utilities.$str35$__Relaunch_your_image_with_more_F }));
            deflexical("*HL-STORE-CACHES-DIRECTORY*", SubLTrampolineFile.maybeDefault(misc_utilities.$hl_store_caches_directory$, misc_utilities.$hl_store_caches_directory$, NIL));
            deflexical("*HL-STORE-CACHES-SHARED-SYMBOLS*", SubLTrampolineFile.maybeDefault(misc_utilities.$hl_store_caches_shared_symbols$, misc_utilities.$hl_store_caches_shared_symbols$, NIL));
            deflexical("*HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE*", SubLTrampolineFile.maybeDefault(misc_utilities.$hl_store_caches_shared_symbols_simple$, misc_utilities.$hl_store_caches_shared_symbols_simple$, NIL));
            deflexical("*STANDARD-HL-STORE-CACHE-FILE-EXTENSION*", misc_utilities.$$$cfasl);
            deflexical("*HOSTNAME-CACHING-STATE*", NIL);
            deflexical("*MACHINE-BOGOMIPS*", $UNINITIALIZED);
        }
        if (SubLFiles.USE_V2) {
            defconstant("*KB-CONTENT-COPYRIGHT-NOTICE*", $str_alt1$___Copyright__c__1998___2009_Cyco);
            deflexical("*SYSTEM-CODE-INITIALIZATIONS-MARKER*", NIL != boundp($system_code_initializations_marker$) ? ((SubLObject) ($system_code_initializations_marker$.getGlobalValue())) : Environment.get_process_id(UNPROVIDED));
            deflexical("*HL-STORE-CACHES-DIRECTORY*", NIL != boundp($hl_store_caches_directory$) ? ((SubLObject) ($hl_store_caches_directory$.getGlobalValue())) : NIL);
            deflexical("*HL-STORE-CACHES-SHARED-SYMBOLS*", NIL != boundp($hl_store_caches_shared_symbols$) ? ((SubLObject) ($hl_store_caches_shared_symbols$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_misc_utilities_file_Previous() {
        defconstant("*KB-CONTENT-COPYRIGHT-NOTICE*", misc_utilities.$str1$___Copyright__c__1998___2014_Cyco);
        deflexical("*SYSTEM-CODE-INITIALIZATIONS-MARKER*", SubLTrampolineFile.maybeDefault(misc_utilities.$system_code_initializations_marker$, misc_utilities.$system_code_initializations_marker$, () -> Environment.get_process_id(UNPROVIDED)));
        deflexical("*SYSTEM-CODE-INITIALIZATIONS-LOCK*", SubLTrampolineFile.maybeDefault(misc_utilities.$system_code_initializations_lock$, misc_utilities.$system_code_initializations_lock$, () -> make_lock(misc_utilities.$$$System_Code_Initializations_Lock)));
        deflexical("*SYSTEM-CODE-VERSION-STRING*", NIL);
        deflexical("*SYSTEM-CODE-RELEASE-STRING*", NIL);
        deflexical("*ID-SPACE-FIXNUM-RANGE-PROBLEM*", cconcatenate(misc_utilities.$str33$__Your_KB_object_ID_space_has_out, new SubLObject[]{ misc_utilities.$str34$__Performance__and_most_likely_co, misc_utilities.$str35$__Relaunch_your_image_with_more_F }));
        deflexical("*HL-STORE-CACHES-DIRECTORY*", SubLTrampolineFile.maybeDefault(misc_utilities.$hl_store_caches_directory$, misc_utilities.$hl_store_caches_directory$, NIL));
        deflexical("*HL-STORE-CACHES-SHARED-SYMBOLS*", SubLTrampolineFile.maybeDefault(misc_utilities.$hl_store_caches_shared_symbols$, misc_utilities.$hl_store_caches_shared_symbols$, NIL));
        deflexical("*HL-STORE-CACHES-SHARED-SYMBOLS-SIMPLE*", SubLTrampolineFile.maybeDefault(misc_utilities.$hl_store_caches_shared_symbols_simple$, misc_utilities.$hl_store_caches_shared_symbols_simple$, NIL));
        deflexical("*STANDARD-HL-STORE-CACHE-FILE-EXTENSION*", misc_utilities.$$$cfasl);
        deflexical("*HOSTNAME-CACHING-STATE*", NIL);
        deflexical("*MACHINE-BOGOMIPS*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject setup_misc_utilities_file() {
        declare_defglobal(misc_utilities.$system_code_initializations_marker$);
        declare_defglobal(misc_utilities.$system_code_initializations_lock$);
        register_external_symbol(misc_utilities.SYSTEM_CODE_INITIALIZATIONS_RUN_P);
        declare_defglobal(misc_utilities.$hl_store_caches_directory$);
        declare_defglobal(misc_utilities.$hl_store_caches_shared_symbols$);
        declare_defglobal(misc_utilities.$hl_store_caches_shared_symbols_simple$);
        memoization_state.note_globally_cached_function(misc_utilities.HOSTNAME);
        register_external_symbol(misc_utilities.FLUSH_ALL_LOGS);
        note_funcall_helper_function(misc_utilities.STRING_IS_PREFIX_OF);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        misc_utilities.declare_misc_utilities_file();
    }

    @Override
    public void initializeVariables() {
        misc_utilities.init_misc_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        misc_utilities.setup_misc_utilities_file();
    }

    static {
    }
}

/**
 * Total time: 651 ms
 */
