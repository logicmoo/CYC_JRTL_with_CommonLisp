package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.cfasl;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.cycjava.cycl.inference.harness.inference_strategist;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.subl_macro_promotions;
import com.cyc.cycjava.cycl.tva_cache;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.function.Supplier;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.tva_cache.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SIX_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


import static com.cyc.cycjava.cycl.tva_cache.*; 
 public final class tva_cache extends SubLTranslatedFile {
    public static final SubLFile me = new tva_cache();

    public static final String myName = "com.cyc.cycjava.cycl.tva_cache";

    public static final String myFingerPrint = "87dd1772214b797a7bda9866b7990a62e9da4ab8cc809ac32200215bbb3a0065";

    // defparameter
    public static final SubLSymbol $use_tva_cacheP$ = makeSymbol("*USE-TVA-CACHE?*");

    // defparameter
    public static final SubLSymbol $update_tva_cacheP$ = makeSymbol("*UPDATE-TVA-CACHE?*");

    // defconstant
    public static final SubLSymbol $dtp_tva_cache$ = makeSymbol("*DTP-TVA-CACHE*");





    // defparameter
    public static final SubLSymbol $tva_cache_use_memoized_spec_pred_listsP$ = makeSymbol("*TVA-CACHE-USE-MEMOIZED-SPEC-PRED-LISTS?*");



    // defparameter
    private static final SubLSymbol $tva_cache_assume_supports_are_validP$ = makeSymbol("*TVA-CACHE-ASSUME-SUPPORTS-ARE-VALID?*");









    // defconstant
    private static final SubLSymbol $cfasl_opcode_tva_cache$ = makeSymbol("*CFASL-OPCODE-TVA-CACHE*");

    // Internal Constants
    public static final SubLList $list0 = list(list(makeSymbol("CACHE"), makeSymbol("BIN-PRED")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym1$PRED_CACHES = makeUninternedSymbol("PRED-CACHES");



    public static final SubLList $list3 = list(list(makeSymbol("TVA-CACHE-REGISTRY")));



    public static final SubLList $list5 = list(list(makeSymbol("KEY"), makeSymbol("RAW-SUPPORTED-VALUES"), makeSymbol("SUPPORTED-SUBKEYS"), makeSymbol("CACHE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $sym6$ENTRY = makeUninternedSymbol("ENTRY");

    public static final SubLSymbol DO_MAP = makeSymbol("DO-MAP");

    public static final SubLSymbol TVA_CACHE_MAP = makeSymbol("TVA-CACHE-MAP");





    private static final SubLObject $$cacheTransitiveClosureForArgs = reader_make_constant_shell(makeString("cacheTransitiveClosureForArgs"));



    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLString $str14$Initialize_TVA_Caches_____ = makeString("Initialize TVA Caches ... ");



    private static final SubLList $list16 = list(makeSymbol("BINARY-PREDICATE"), makeSymbol("INDEX-ARGNUM"));



    private static final SubLString $str18$Problem_initializing_TVA_CACHE_fo = makeString("Problem initializing TVA-CACHE for ~A: ~A. KB Subset issue?~%");

    public static final SubLList $list19 = list(makeSymbol("KEY"), makeUninternedSymbol("ENTRY"));

    private static final SubLList $list20 = cons(makeSymbol("RAW-SUPPORTED-VALUES"), makeSymbol("SUPPORTED-SUBKEYS"));

    private static final SubLSymbol TVA_CACHE = makeSymbol("TVA-CACHE");

    private static final SubLSymbol TVA_CACHE_P = makeSymbol("TVA-CACHE-P");

    public static final SubLList $list23 = list(makeSymbol("PRED"), makeSymbol("INDEX-ARGNUM"), makeSymbol("TVA-PRED-GAFS"), makeSymbol("TVAI-PRED-GAFS"), makeSymbol("MAP"));

    public static final SubLList $list24 = list(makeKeyword("PRED"), makeKeyword("INDEX-ARGNUM"), makeKeyword("TVA-PRED-GAFS"), makeKeyword("TVAI-PRED-GAFS"), makeKeyword("MAP"));

    public static final SubLList $list25 = list(makeSymbol("TVA-CACHE-PRED"), makeSymbol("TVA-CACHE-INDEX-ARGNUM"), makeSymbol("TVA-CACHE-TVA-PRED-GAFS"), makeSymbol("TVA-CACHE-TVAI-PRED-GAFS"), makeSymbol("TVA-CACHE-MAP"));

    private static final SubLList $list26 = list(makeSymbol("_CSETF-TVA-CACHE-PRED"), makeSymbol("_CSETF-TVA-CACHE-INDEX-ARGNUM"), makeSymbol("_CSETF-TVA-CACHE-TVA-PRED-GAFS"), makeSymbol("_CSETF-TVA-CACHE-TVAI-PRED-GAFS"), makeSymbol("_CSETF-TVA-CACHE-MAP"));

    private static final SubLSymbol PPRINT_TVA_CACHE = makeSymbol("PPRINT-TVA-CACHE");

    private static final SubLSymbol TVA_CACHE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("TVA-CACHE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list29 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("TVA-CACHE-P"));

    private static final SubLSymbol TVA_CACHE_PRED = makeSymbol("TVA-CACHE-PRED");

    private static final SubLSymbol _CSETF_TVA_CACHE_PRED = makeSymbol("_CSETF-TVA-CACHE-PRED");

    private static final SubLSymbol TVA_CACHE_INDEX_ARGNUM = makeSymbol("TVA-CACHE-INDEX-ARGNUM");

    private static final SubLSymbol _CSETF_TVA_CACHE_INDEX_ARGNUM = makeSymbol("_CSETF-TVA-CACHE-INDEX-ARGNUM");

    private static final SubLSymbol TVA_CACHE_TVA_PRED_GAFS = makeSymbol("TVA-CACHE-TVA-PRED-GAFS");

    private static final SubLSymbol _CSETF_TVA_CACHE_TVA_PRED_GAFS = makeSymbol("_CSETF-TVA-CACHE-TVA-PRED-GAFS");

    private static final SubLSymbol TVA_CACHE_TVAI_PRED_GAFS = makeSymbol("TVA-CACHE-TVAI-PRED-GAFS");

    private static final SubLSymbol _CSETF_TVA_CACHE_TVAI_PRED_GAFS = makeSymbol("_CSETF-TVA-CACHE-TVAI-PRED-GAFS");

    private static final SubLSymbol _CSETF_TVA_CACHE_MAP = makeSymbol("_CSETF-TVA-CACHE-MAP");





    private static final SubLSymbol $TVA_PRED_GAFS = makeKeyword("TVA-PRED-GAFS");

    private static final SubLSymbol $TVAI_PRED_GAFS = makeKeyword("TVAI-PRED-GAFS");



    private static final SubLString $str44$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_TVA_CACHE = makeSymbol("MAKE-TVA-CACHE");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_TVA_CACHE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-TVA-CACHE-METHOD");

    private static final SubLSymbol SXHASH_TVA_CACHE_METHOD = makeSymbol("SXHASH-TVA-CACHE-METHOD");

    private static final SubLString $str51$__TVA_CACHE__S__S_ = makeString("#<TVA-CACHE ~S ~S>");



    public static final SubLSymbol $swappable_tva_cache_lock$ = makeSymbol("*SWAPPABLE-TVA-CACHE-LOCK*");

    private static final SubLString $$$Swappable_TVA_Cache = makeString("Swappable TVA Cache");

    private static final SubLString $str55$Cannot_reconnect__A__which_is_not = makeString("Cannot reconnect ~A, which is not a swappable TVA cache.");

    private static final SubLSymbol $tva_cache_registry$ = makeSymbol("*TVA-CACHE-REGISTRY*");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));









    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell(makeString("True-JustificationTruth"));





    private static final SubLString $str65$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str70$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str71$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str72$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str73$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLString $$$Creating_TVA_cache_for_ = makeString("Creating TVA cache for ");

    private static final SubLString $str75$__arg_ = makeString(" (arg ");

    private static final SubLString $str76$_ = makeString(")");

    private static final SubLSymbol $tva_cache_spec_pred_stats$ = makeSymbol("*TVA-CACHE-SPEC-PRED-STATS*");

    public static final SubLList $list78 = cons(makeSymbol("MT-INFO"), makeSymbol("TIME"));

    public static final SubLList $list79 = list(list(makeSymbol("SUB-CACHE"), makeSymbol("CACHE"), makeSymbol("INVERSE?"), makeSymbol("&KEY"), makeSymbol("DONE?")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLList $list80 = list(makeKeyword("DONE?"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");





    private static final SubLSymbol $sym84$_TVA_CACHE_USE_MEMOIZED_SPEC_PRED_LISTS__ = makeSymbol("*TVA-CACHE-USE-MEMOIZED-SPEC-PRED-LISTS?*");

    private static final SubLSymbol DO_TVA_SUB_CACHES_VIA_MEMOIZED_LISTS = makeSymbol("DO-TVA-SUB-CACHES-VIA-MEMOIZED-LISTS");

    private static final SubLSymbol DO_TVA_SUB_CACHES_VIA_INDEX_SURFING = makeSymbol("DO-TVA-SUB-CACHES-VIA-INDEX-SURFING");

    private static final SubLSymbol $sym87$SPEC_PRED = makeUninternedSymbol("SPEC-PRED");

    private static final SubLSymbol DO_ALL_SPEC_PREDICATES_AND_INVERSES = makeSymbol("DO-ALL-SPEC-PREDICATES-AND-INVERSES");





    private static final SubLSymbol FIND_TVA_SUB_CACHE = makeSymbol("FIND-TVA-SUB-CACHE");

    private static final SubLSymbol $sym92$SPEC_PRED = makeUninternedSymbol("SPEC-PRED");

    private static final SubLSymbol $sym93$SPEC_PREDS = makeUninternedSymbol("SPEC-PREDS");

    private static final SubLSymbol $sym94$SPEC_INVERSES = makeUninternedSymbol("SPEC-INVERSES");



    private static final SubLSymbol TVA_CACHE_SPEC_PREDS_AND_INVERSES = makeSymbol("TVA-CACHE-SPEC-PREDS-AND-INVERSES");



    private static final SubLList $list98 = list(NIL);

    private static final SubLList $list99 = list(T);



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));





    private static final SubLInteger $int$5000 = makeInteger(5000);

    private static final SubLSymbol $sym105$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list106 = cons(makeSymbol("VALUE"), makeSymbol("SUPPORTS"));

    private static final SubLList $list107 = cons(makeSymbol("TRANSITIVE-VALUE"), makeSymbol("MORE-SUPPORTS"));

    private static final SubLSymbol $sym108$TVA_CACHE_SUPPORT_EQUAL_ = makeSymbol("TVA-CACHE-SUPPORT-EQUAL?");



    private static final SubLSymbol WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK = makeSymbol("WITH-FILE-VECTOR-BACKED-MAP-STREAM-LOCK");

    private static final SubLList $list111 = list(makeSymbol("*SWAPPABLE-TVA-CACHE-LOCK*"));

    private static final SubLSymbol TVA_CACHE_LOOKUP_INTERNAL = makeSymbol("TVA-CACHE-LOOKUP-INTERNAL");

    public static final SubLList $list113 = list(makeSymbol("VALUE"), makeSymbol("SUPPORTS"));

    public static final SubLList $list114 = list(makeSymbol("SUBKEY"), makeSymbol("SUBKEY-SUPPORTS"));

    private static final SubLList $list115 = cons(makeSymbol("SUBKEY-VALUE"), makeSymbol("SUBKEY-VALUE-SUPPORTS"));

    private static final SubLInteger $int$32768 = makeInteger(32768);

    private static final SubLSymbol $sym117$TVA_CACHE_VALID_SUPPORT_ = makeSymbol("TVA-CACHE-VALID-SUPPORT?");

    public static final SubLList $list118 = list(makeSymbol("TYPE"), makeSymbol("GAF"), makeSymbol("&OPTIONAL"), makeSymbol("SPECIFIED-PRED"));

    private static final SubLString $str119$No_specified_pred_for__S = makeString("No specified pred for ~S");





    private static final SubLSymbol ADD_TVA_CACHE_VALUE = makeSymbol("ADD-TVA-CACHE-VALUE");

    private static final SubLSymbol ADD_TVA_CACHE_VALUE_CACHED = makeSymbol("ADD-TVA-CACHE-VALUE-CACHED");

    public static final SubLList $list124 = list(makeSymbol("BIN-PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLSymbol $add_tva_cache_value_cached_caching_state$ = makeSymbol("*ADD-TVA-CACHE-VALUE-CACHED-CACHING-STATE*");

    private static final SubLSymbol REMOVE_TVA_CACHE_VALUE = makeSymbol("REMOVE-TVA-CACHE-VALUE");

    private static final SubLSymbol REMOVE_TVA_CACHE_VALUE_CACHED = makeSymbol("REMOVE-TVA-CACHE-VALUE-CACHED");

    private static final SubLSymbol $remove_tva_cache_value_cached_caching_state$ = makeSymbol("*REMOVE-TVA-CACHE-VALUE-CACHED-CACHING-STATE*");

    private static final SubLSymbol ADD_TVA_CACHE_KEY = makeSymbol("ADD-TVA-CACHE-KEY");

    private static final SubLSymbol ADD_TVA_CACHE_KEY_CACHED = makeSymbol("ADD-TVA-CACHE-KEY-CACHED");

    private static final SubLList $list131 = list(makeSymbol("TRANS-PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));

    public static final SubLList $list132 = list(makeSymbol("CACHE"), makeSymbol("INVERSE?"), makeSymbol("ORIGINAL-TRANS-PRED"));

    private static final SubLSymbol $add_tva_cache_key_cached_caching_state$ = makeSymbol("*ADD-TVA-CACHE-KEY-CACHED-CACHING-STATE*");

    private static final SubLSymbol REMOVE_TVA_CACHE_KEY = makeSymbol("REMOVE-TVA-CACHE-KEY");

    public static final SubLList $list135 = list(makeSymbol("BIN-PRED"), makeSymbol("ARG2"), makeSymbol("INDEX-ARGNUM"));

    private static final SubLList $list136 = list(makeSymbol("KEY"), makeSymbol("VALUE"));

    private static final SubLSymbol $sym137$BINARY_PREDICATE_ = makeSymbol("BINARY-PREDICATE?");

    private static final SubLObject $$transitiveViaArg = reader_make_constant_shell(makeString("transitiveViaArg"));



    private static final SubLObject $$transitiveViaArgInverse = reader_make_constant_shell(makeString("transitiveViaArgInverse"));

    private static final SubLString $str141$Error_initializing__S_____S___Der = makeString("Error initializing ~S:~% ~S~% Deregistering cache.");

    private static final SubLString $$$TVA_Caching_ = makeString("TVA Caching ");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str144$_assertions___ = makeString(" assertions...");

    private static final SubLObject $$relationAllInstance = reader_make_constant_shell(makeString("relationAllInstance"));

    private static final SubLSymbol TVA_CACHE_MAX_INSTANCES_TO_CACHE = makeSymbol("TVA-CACHE-MAX-INSTANCES-TO-CACHE");

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLSymbol $tva_cache_max_instances_to_cache_caching_state$ = makeSymbol("*TVA-CACHE-MAX-INSTANCES-TO-CACHE-CACHING-STATE*");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLList $list150 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLObject $$relationInstanceAll = reader_make_constant_shell(makeString("relationInstanceAll"));



    private static final SubLString $str153$Complex_TVA_cache_support_in__S = makeString("Complex TVA cache support in ~S");

    private static final SubLList $list154 = cons(makeKeyword("COMPLEX"), makeKeyword("ANYTHING"));

    private static final SubLList $list155 = list(makeSymbol("IMPLICIT-KEY"), makeSymbol("SUPPORTS"));







    private static final SubLList $list159 = list(reader_make_constant_shell(makeString("isa")), list(makeKeyword("BIND"), makeSymbol("PRED")), reader_make_constant_shell(makeString("TransitiveBinaryPredicate")));



    private static final SubLString $str161$Don_t_know_how_to_find_the_transi = makeString("Don't know how to find the transitive predicate from~% ~S");

    private static final SubLList $list162 = list(makeKeyword("SPEC-PRED"), makeKeyword("INVERSE"));

    private static final SubLString $str163$Can_t_get_transitivity_support_fr = makeString("Can't get transitivity support from ~S");

    private static final SubLSymbol TVA_CACHE_SUPPORT_GAF = makeSymbol("TVA-CACHE-SUPPORT-GAF");

    private static final SubLList $list165 = list(makeSymbol("KEY"), makeSymbol("SUPPORTS"));

    private static final SubLObject $$TransitiveBinaryPredicate = reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));

    private static final SubLInteger $int$96 = makeInteger(96);

    private static final SubLSymbol CFASL_INPUT_TVA_CACHE = makeSymbol("CFASL-INPUT-TVA-CACHE");

    private static final SubLSymbol CFASL_OUTPUT_OBJECT_TVA_CACHE_METHOD = makeSymbol("CFASL-OUTPUT-OBJECT-TVA-CACHE-METHOD");

    private static final SubLString $str170$tva_cache_contents = makeString("tva-cache-contents");

    private static final SubLString $str171$tva_cache_contents_index = makeString("tva-cache-contents-index");

    private static final SubLList $list172 = list(makeSymbol("KEY"), makeSymbol("TVA-CACHES"));

    private static final SubLString $str173$Reconnecting_to_legacy_unit_files = makeString("Reconnecting to legacy unit files w/out TVA cache contents in ~A and ~A.");

    private static final SubLSymbol DUMP_TVA_CACHE_TO_STREAM = makeSymbol("DUMP-TVA-CACHE-TO-STREAM");

    private static final SubLList $list175 = list(makeSymbol("DUMP-SWAPPABLE-TVA-CACHE-TO-STREAM"));

    public static SubLObject do_tva_caches(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject v_cache = NIL;
        SubLObject bin_pred = NIL;
        destructuring_bind_must_consp(current, datum, $list0);
        v_cache = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list0);
        bin_pred = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject pred_caches = $sym1$PRED_CACHES;
            return list(DO_DICTIONARY, listS(bin_pred, pred_caches, $list3), listS(CDOLIST, list(v_cache, pred_caches), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list0);
        return NIL;
    }

    public static SubLObject do_tva_cache(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject raw_supported_values = NIL;
        SubLObject supported_subkeys = NIL;
        SubLObject v_cache = NIL;
        destructuring_bind_must_consp(current, datum, $list5);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        raw_supported_values = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        supported_subkeys = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list5);
        v_cache = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject entry = $sym6$ENTRY;
            return list(DO_MAP, list(key, entry, list(TVA_CACHE_MAP, v_cache)), listS(CDESTRUCTURING_BIND, bq_cons(raw_supported_values, supported_subkeys), entry, append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list5);
        return NIL;
    }

    public static SubLObject tva_cache_get_values(final SubLObject v_term, final SubLObject predicate, final SubLObject index_argnum, final SubLObject compute_justifications_p) {
        assert NIL != subl_promotions.positive_integer_p(index_argnum) : "subl_promotions.positive_integer_p(index_argnum) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(index_argnum) " + index_argnum;
        final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(predicate, index_argnum);
        return NIL != tva_cache_p(v_cache) ? tva_cache_lookup(v_cache, v_term, compute_justifications_p, UNPROVIDED, UNPROVIDED) : NIL;
    }

    public static SubLObject tva_cache_check_value(final SubLObject v_term, final SubLObject predicate, final SubLObject index_argnum, final SubLObject target, SubLObject test, SubLObject compute_justifications_p) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (compute_justifications_p == UNPROVIDED) {
            compute_justifications_p = NIL;
        }
        assert NIL != subl_promotions.positive_integer_p(index_argnum) : "subl_promotions.positive_integer_p(index_argnum) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(index_argnum) " + index_argnum;
        final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(predicate, index_argnum);
        return NIL != tva_cache_p(v_cache) ? tva_cache_lookup(v_cache, v_term, compute_justifications_p, target, test) : NIL;
    }

    public static SubLObject tva_cache_predicate_index_arg_cached_p(final SubLObject predicate, final SubLObject index_arg) {
        return list_utilities.sublisp_boolean(tva_cache_for_predicate_and_index_argnum(predicate, index_arg));
    }

    public static SubLObject initialize_tva_caches() {
        return initialize_tva_caches_int(T);
    }

    public static SubLObject initialize_uninitialized_tva_caches() {
        return initialize_tva_caches_int(NIL);
    }

    public static SubLObject initialize_tva_caches_int(final SubLObject redo_if_presentP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != redo_if_presentP) {
            dictionary.clear_dictionary(tva_cache_registry());
        }
        final SubLObject should_maintain_assertion_usage_countsP = assertion_manager.assertion_manager_usage_counts_enabledP();
        try {
            assertion_manager.assertion_manager_dont_maintain_usages_counts();
            final SubLObject pred = $$cacheTransitiveClosureForArgs;
            if (NIL != valid_constantP(pred, UNPROVIDED)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                    final SubLObject pred_var = pred;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = $str14$Initialize_TVA_Caches_____;
                        final SubLObject _prev_bind_0_$1 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$2 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                        try {
                            $progress_start_time$.bind(get_universal_time(), thread);
                            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                            $progress_notification_count$.bind(ZERO_INTEGER, thread);
                            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                            $progress_count$.bind(ZERO_INTEGER, thread);
                            $is_noting_progressP$.bind(T, thread);
                            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                            noting_progress_preamble(str);
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$3 = NIL;
                                        final SubLObject token_var_$4 = NIL;
                                        while (NIL == done_var_$3) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$4);
                                            final SubLObject valid_$5 = makeBoolean(!token_var_$4.eql(gaf));
                                            if (NIL != valid_$5) {
                                                SubLObject current;
                                                final SubLObject datum = current = assertions_high.gaf_args(gaf);
                                                SubLObject binary_predicate = NIL;
                                                SubLObject index_argnum = NIL;
                                                destructuring_bind_must_consp(current, datum, $list16);
                                                binary_predicate = current.first();
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list16);
                                                index_argnum = current.first();
                                                current = current.rest();
                                                if (NIL == current) {
                                                    if ((NIL != redo_if_presentP) || (NIL == tva_cache_for_predicate_and_index_argnum(binary_predicate, index_argnum))) {
                                                        SubLObject error_message = NIL;
                                                        try {
                                                            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                            final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
                                                            try {
                                                                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                                try {
                                                                    create_tva_cache(binary_predicate, index_argnum, T);
                                                                } catch (final Throwable catch_var) {
                                                                    Errors.handleThrowable(catch_var, NIL);
                                                                }
                                                            } finally {
                                                                Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
                                                            }
                                                        } catch (final Throwable ccatch_env_var) {
                                                            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                        } finally {
                                                            thread.throwStack.pop();
                                                        }
                                                        if (error_message.isString()) {
                                                            Errors.warn($str18$Problem_initializing_TVA_CACHE_fo, binary_predicate, error_message);
                                                        }
                                                    }
                                                } else {
                                                    cdestructuring_bind_error(datum, $list16);
                                                }
                                            }
                                            done_var_$3 = makeBoolean(NIL == valid_$5);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$2, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$1, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (NIL != should_maintain_assertion_usage_countsP) {
                    assertion_manager.assertion_manager_maintain_usage_counts();
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return tva_cache_registry();
    }

    public static SubLObject tva_cache_enabled_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != list_utilities.sublisp_boolean($use_tva_cacheP$.getDynamicValue(thread))) && (NIL != list_utilities.sublisp_boolean($update_tva_cacheP$.getDynamicValue(thread))));
    }

    public static SubLObject cached_tva_value_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tva_cache_registry())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject bin_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject pred_caches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = pred_caches;
            SubLObject v_cache = NIL;
            v_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject iterator = map_utilities.new_map_iterator(tva_cache_map(v_cache));
                SubLObject valid;
                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                    thread.resetMultipleValues();
                    final SubLObject var = iteration.iteration_next(iterator);
                    valid = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid) {
                        SubLObject current;
                        final SubLObject datum = current = var;
                        SubLObject key = NIL;
                        SubLObject entry = NIL;
                        destructuring_bind_must_consp(current, datum, $list19);
                        key = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list19);
                        entry = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            SubLObject current_$9;
                            final SubLObject datum_$8 = current_$9 = entry;
                            SubLObject raw_supported_values = NIL;
                            SubLObject supported_subkeys = NIL;
                            destructuring_bind_must_consp(current_$9, datum_$8, $list20);
                            raw_supported_values = current_$9.first();
                            current_$9 = supported_subkeys = current_$9.rest();
                            count = add(count, map_utilities.map_size(raw_supported_values));
                        } else {
                            cdestructuring_bind_error(datum, $list19);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_cache = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return count;
    }

    public static SubLObject tva_cache_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_tva_cache(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject tva_cache_p(final SubLObject v_object) {
        return v_object.getClass() == $tva_cache_native.class ? T : NIL;
    }

    public static SubLObject tva_cache_pred(final SubLObject v_object) {
        assert NIL != tva_cache_p(v_object) : "tva_cache.tva_cache_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject tva_cache_index_argnum(final SubLObject v_object) {
        assert NIL != tva_cache_p(v_object) : "tva_cache.tva_cache_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject tva_cache_tva_pred_gafs(final SubLObject v_object) {
        assert NIL != tva_cache_p(v_object) : "tva_cache.tva_cache_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject tva_cache_tvai_pred_gafs(final SubLObject v_object) {
        assert NIL != tva_cache_p(v_object) : "tva_cache.tva_cache_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject tva_cache_map(final SubLObject v_object) {
        assert NIL != tva_cache_p(v_object) : "tva_cache.tva_cache_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_tva_cache_pred(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_cache_p(v_object) : "tva_cache.tva_cache_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_tva_cache_index_argnum(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_cache_p(v_object) : "tva_cache.tva_cache_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_tva_cache_tva_pred_gafs(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_cache_p(v_object) : "tva_cache.tva_cache_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_tva_cache_tvai_pred_gafs(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_cache_p(v_object) : "tva_cache.tva_cache_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_tva_cache_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != tva_cache_p(v_object) : "tva_cache.tva_cache_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_tva_cache(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $tva_cache_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($PRED)) {
                _csetf_tva_cache_pred(v_new, current_value);
            } else
                if (pcase_var.eql($INDEX_ARGNUM)) {
                    _csetf_tva_cache_index_argnum(v_new, current_value);
                } else
                    if (pcase_var.eql($TVA_PRED_GAFS)) {
                        _csetf_tva_cache_tva_pred_gafs(v_new, current_value);
                    } else
                        if (pcase_var.eql($TVAI_PRED_GAFS)) {
                            _csetf_tva_cache_tvai_pred_gafs(v_new, current_value);
                        } else
                            if (pcase_var.eql($MAP)) {
                                _csetf_tva_cache_map(v_new, current_value);
                            } else {
                                Errors.error($str44$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_tva_cache(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_TVA_CACHE, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $PRED, tva_cache_pred(obj));
        funcall(visitor_fn, obj, $SLOT, $INDEX_ARGNUM, tva_cache_index_argnum(obj));
        funcall(visitor_fn, obj, $SLOT, $TVA_PRED_GAFS, tva_cache_tva_pred_gafs(obj));
        funcall(visitor_fn, obj, $SLOT, $TVAI_PRED_GAFS, tva_cache_tvai_pred_gafs(obj));
        funcall(visitor_fn, obj, $SLOT, $MAP, tva_cache_map(obj));
        funcall(visitor_fn, obj, $END, MAKE_TVA_CACHE, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_tva_cache_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_tva_cache(obj, visitor_fn);
    }

    public static SubLObject sxhash_tva_cache_method(final SubLObject v_object) {
        return Sxhash.sxhash(tva_cache_pred(v_object));
    }

    public static SubLObject pprint_tva_cache(final SubLObject v_tva_cache, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str51$__TVA_CACHE__S__S_, tva_cache_pred(v_tva_cache), tva_cache_index_argnum(v_tva_cache));
        return v_tva_cache;
    }

    public static SubLObject clone_swappable_tva_cache(final SubLObject old_tva_cache, final SubLObject fvector) {
        final SubLObject new_tva_cache = make_tva_cache(UNPROVIDED);
        _csetf_tva_cache_pred(new_tva_cache, tva_cache_pred(old_tva_cache));
        _csetf_tva_cache_index_argnum(new_tva_cache, tva_cache_index_argnum(old_tva_cache));
        _csetf_tva_cache_tva_pred_gafs(new_tva_cache, tva_cache_tva_pred_gafs(old_tva_cache));
        _csetf_tva_cache_tvai_pred_gafs(new_tva_cache, tva_cache_tvai_pred_gafs(old_tva_cache));
        final SubLObject old_map = tva_cache_map(old_tva_cache);
        final SubLObject unbacked_map = dictionary.new_dictionary(map_utilities.map_test(old_map), map_utilities.map_size(old_map));
        final SubLObject new_map = file_vector_utilities.populate_file_vector_backed_map_from_map(old_map, unbacked_map, fvector, $SWAPPED_OUT, UNPROVIDED);
        final SubLObject backed_map = file_vector_utilities.new_future_backed_map(new_map);
        _csetf_tva_cache_map(new_tva_cache, backed_map);
        return new_tva_cache;
    }

    public static SubLObject using_swappable_tva_cachesP() {
        return lock_p($swappable_tva_cache_lock$.getGlobalValue());
    }

    public static SubLObject ensure_swappable_tva_cache_lock() {
        if (NIL == using_swappable_tva_cachesP()) {
            $swappable_tva_cache_lock$.setGlobalValue(make_lock($$$Swappable_TVA_Cache));
        }
        return T;
    }

    public static SubLObject reconnect_swappable_tva_cache(final SubLObject v_tva_cache, final SubLObject fvector, SubLObject common_symbols) {
        if (common_symbols == UNPROVIDED) {
            common_symbols = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject backed_map = tva_cache_map(v_tva_cache);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == file_vector_utilities.backed_map_p(backed_map))) {
            Errors.error($str55$Cannot_reconnect__A__which_is_not, backed_map);
        }
        file_vector_utilities.reconnect_backed_map(backed_map, fvector, common_symbols);
        ensure_swappable_tva_cache_lock();
        return v_tva_cache;
    }

    public static SubLObject tva_cache_registry() {
        return $tva_cache_registry$.getGlobalValue();
    }

    public static SubLObject register_tva_cache(final SubLObject v_cache) {
        final SubLObject predicate = tva_cache_pred(v_cache);
        dictionary_utilities.dictionary_pushnew($tva_cache_registry$.getGlobalValue(), predicate, v_cache, symbol_function(EQ), UNPROVIDED);
        return v_cache;
    }

    public static SubLObject tva_caches_for_predicate(final SubLObject predicate) {
        return dictionary.dictionary_lookup_without_values(tva_cache_registry(), predicate, NIL);
    }

    public static SubLObject tva_caches_implied_by_predicate(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject caches = NIL;
        SubLObject inverse_caches = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            final SubLObject module = sbhl_module_vars.get_sbhl_module($$genlPreds);
            final SubLObject deck_type = ($BREADTH == $DEPTH) ? $STACK : $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0_$10 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = $$True_JustificationTruth;
                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$12 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$12 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(module, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(module), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(module), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(module, thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(predicate, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$13 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$14 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), module), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(predicate, UNPROVIDED);
                                    for (node_and_predicate_mode = list(predicate, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$18 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject genl_pred = node_var_$18;
                                        final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            final SubLObject inverseP = predicate_mode;
                                            SubLObject cdolist_list_var = tva_caches_for_predicate(genl_pred);
                                            SubLObject v_cache = NIL;
                                            v_cache = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                if (NIL != inverseP) {
                                                    inverse_caches = cons(v_cache, inverse_caches);
                                                } else {
                                                    caches = cons(v_cache, caches);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                v_cache = cdolist_list_var.first();
                                            } 
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(module);
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$15 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$18);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                        final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$23;
                                                                            for (iteration_state_$23 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$23); iteration_state_$23 = dictionary_contents.do_dictionary_contents_next(iteration_state_$23)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$23);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        final SubLObject sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject node_vars_link_node;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject node_vars_link_node2 = NIL;
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                while (NIL != csome_list_var) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$17, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$23);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$16, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$25;
                                                            final SubLObject new_list = cdolist_list_var_$25 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$25.first();
                                                            while (NIL != cdolist_list_var_$25) {
                                                                final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            SubLObject csome_list_var2 = sol2;
                                                                            SubLObject node_vars_link_node4 = NIL;
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                            while (NIL != csome_list_var2) {
                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$18, thread);
                                                                }
                                                                cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                                                                generating_fn = cdolist_list_var_$25.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$15, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$15, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$14, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$17, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$14, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$13, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, predicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$13, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$12, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$12, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$11, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$10, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return values(caches, inverse_caches);
    }

    public static SubLObject tva_caches_with_transitive_predicate(final SubLObject trans_pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject caches = NIL;
        SubLObject inverse_caches = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tva_cache_registry())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject bin_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject bin_pred_caches = thread.secondMultipleValue();
                thread.resetMultipleValues();
                SubLObject cdolist_list_var = bin_pred_caches;
                SubLObject v_cache = NIL;
                v_cache = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject badP = NIL;
                    if (NIL == badP) {
                        SubLObject csome_list_var = tva_cache_tva_pred_gafs(v_cache);
                        SubLObject gaf = NIL;
                        gaf = csome_list_var.first();
                        while ((NIL == badP) && (NIL != csome_list_var)) {
                            if (NIL != assertion_handles.valid_assertionP(gaf, UNPROVIDED)) {
                                final SubLObject original_pred = tva_cache_tva_pred_from_support(gaf);
                                final SubLObject gaf_argnum = assertions_high.gaf_arg3(gaf);
                                if (gaf_argnum.eql(tva_cache_index_argnum(v_cache))) {
                                    if (NIL != genl_predicates.genl_predicateP(trans_pred, original_pred, UNPROVIDED, UNPROVIDED)) {
                                        caches = cons(list(v_cache, NIL, original_pred), caches);
                                    }
                                    if (NIL != genl_predicates.genl_inverseP(trans_pred, original_pred, UNPROVIDED, UNPROVIDED)) {
                                        caches = cons(list(v_cache, T, original_pred), caches);
                                    }
                                }
                            } else {
                                badP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            gaf = csome_list_var.first();
                        } 
                    }
                    if (NIL == badP) {
                        SubLObject csome_list_var = tva_cache_tvai_pred_gafs(v_cache);
                        SubLObject gaf = NIL;
                        gaf = csome_list_var.first();
                        while ((NIL == badP) && (NIL != csome_list_var)) {
                            if (NIL != assertion_handles.valid_assertionP(gaf, UNPROVIDED)) {
                                final SubLObject original_pred = tva_cache_tva_pred_from_support(gaf);
                                final SubLObject gaf_argnum = assertions_high.gaf_arg3(gaf);
                                if (gaf_argnum.eql(tva_cache_index_argnum(v_cache))) {
                                    if (NIL != genl_predicates.genl_predicateP(trans_pred, original_pred, UNPROVIDED, UNPROVIDED)) {
                                        inverse_caches = cons(list(v_cache, NIL, original_pred), inverse_caches);
                                    }
                                    if (NIL != genl_predicates.genl_inverseP(trans_pred, original_pred, UNPROVIDED, UNPROVIDED)) {
                                        inverse_caches = cons(list(v_cache, T, original_pred), inverse_caches);
                                    }
                                }
                            } else {
                                badP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            gaf = csome_list_var.first();
                        } 
                    }
                    if (NIL != badP) {
                        deregister_tva_cache(v_cache, bin_pred);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_cache = cdolist_list_var.first();
                } 
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return values(caches, inverse_caches);
    }

    public static SubLObject tva_cache_for_predicate_and_index_argnum(final SubLObject predicate, final SubLObject index_argnum) {
        final SubLObject caches = tva_caches_for_predicate(predicate);
        final SubLObject v_cache = find(index_argnum, caches, symbol_function(EQL), TVA_CACHE_INDEX_ARGNUM, UNPROVIDED, UNPROVIDED);
        return v_cache;
    }

    public static SubLObject ensure_tva_cache_created(final SubLObject binary_predicate, final SubLObject index_argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(binary_predicate, index_argnum);
        if (NIL == v_cache) {
            final SubLObject _prev_bind_0 = $noting_progress_delayed_mode_seconds$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $noting_progress_delayed_mode_string$.currentBinding(thread);
            try {
                $noting_progress_delayed_mode_seconds$.bind(TWO_INTEGER, thread);
                $noting_progress_delayed_mode_string$.bind(cconcatenate($$$Creating_TVA_cache_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(binary_predicate), $str75$__arg_, format_nil.format_nil_d_no_copy(index_argnum), $str76$_ }), thread);
                final SubLObject str = cconcatenate($$$Creating_TVA_cache_for_, new SubLObject[]{ format_nil.format_nil_s_no_copy(binary_predicate), $str75$__arg_, format_nil.format_nil_d_no_copy(index_argnum), $str76$_ });
                final SubLObject _prev_bind_0_$28 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$29 = $progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                try {
                    $progress_start_time$.bind(get_universal_time(), thread);
                    $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                    $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    $progress_notification_count$.bind(ZERO_INTEGER, thread);
                    $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                    $progress_count$.bind(ZERO_INTEGER, thread);
                    $is_noting_progressP$.bind(T, thread);
                    $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                    noting_progress_preamble(str);
                    v_cache = create_tva_cache(binary_predicate, index_argnum, T);
                    noting_progress_postamble();
                } finally {
                    $silent_progressP$.rebind(_prev_bind_8, thread);
                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                    $progress_count$.rebind(_prev_bind_6, thread);
                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$29, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$28, thread);
                }
            } finally {
                $noting_progress_delayed_mode_string$.rebind(_prev_bind_2, thread);
                $noting_progress_delayed_mode_seconds$.rebind(_prev_bind_0, thread);
            }
        }
        return v_cache;
    }

    public static SubLObject deregister_tva_cache(final SubLObject v_cache, SubLObject bin_pred) {
        if (bin_pred == UNPROVIDED) {
            bin_pred = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != bin_pred) {
            return dictionary_utilities.dictionary_remove_from_value(tva_cache_registry(), bin_pred, v_cache, UNPROVIDED, UNPROVIDED);
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tva_cache_registry())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject this_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject pred_caches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = pred_caches;
            SubLObject this_cache = NIL;
            this_cache = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (v_cache.eql(this_cache)) {
                    deregister_tva_cache(this_cache, this_pred);
                }
                cdolist_list_var = cdolist_list_var.rest();
                this_cache = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return NIL;
    }

    public static SubLObject deregister_all_tva_caches_for_predicate(final SubLObject bin_pred) {
        SubLObject cdolist_list_var = tva_caches_for_predicate(bin_pred);
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            deregister_tva_cache(v_cache, bin_pred);
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reset_tva_cache_spec_pred_stats() {
        return dictionary.clear_dictionary($tva_cache_spec_pred_stats$.getGlobalValue());
    }

    public static SubLObject tva_cache_spec_preds_total_time() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject total = ZERO_INTEGER;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($tva_cache_spec_pred_stats$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject info = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = info;
            SubLObject pair = NIL;
            pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = pair;
                SubLObject mt_info = NIL;
                SubLObject time = NIL;
                destructuring_bind_must_consp(current, datum, $list78);
                mt_info = current.first();
                current = time = current.rest();
                if (time.numG(ZERO_INTEGER)) {
                    total = add(total, time);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pair = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return total;
    }

    public static SubLObject do_tva_sub_caches(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sub_cache = NIL;
        SubLObject v_cache = NIL;
        SubLObject inverseP = NIL;
        destructuring_bind_must_consp(current, datum, $list79);
        sub_cache = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        v_cache = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        inverseP = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$30 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list79);
            current_$30 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list79);
            if (NIL == member(current_$30, $list80, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$30 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list79);
        }
        final SubLObject doneP_tail = property_list_member($DONE_, current);
        final SubLObject doneP = (NIL != doneP_tail) ? cadr(doneP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(PIF, $sym84$_TVA_CACHE_USE_MEMOIZED_SPEC_PRED_LISTS__, listS(DO_TVA_SUB_CACHES_VIA_MEMOIZED_LISTS, list(sub_cache, v_cache, inverseP, $DONE_, doneP), append(body, NIL)), listS(DO_TVA_SUB_CACHES_VIA_INDEX_SURFING, list(sub_cache, v_cache, inverseP, $DONE_, doneP), append(body, NIL)));
    }

    public static SubLObject do_tva_sub_caches_via_index_surfing(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sub_cache = NIL;
        SubLObject v_cache = NIL;
        SubLObject inverseP = NIL;
        destructuring_bind_must_consp(current, datum, $list79);
        sub_cache = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        v_cache = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        inverseP = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$31 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list79);
            current_$31 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list79);
            if (NIL == member(current_$31, $list80, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$31 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list79);
        }
        final SubLObject doneP_tail = property_list_member($DONE_, current);
        final SubLObject doneP = (NIL != doneP_tail) ? cadr(doneP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject spec_pred = $sym87$SPEC_PRED;
        return list(DO_ALL_SPEC_PREDICATES_AND_INVERSES, list(spec_pred, inverseP, list(TVA_CACHE_PRED, v_cache), NIL, NIL, doneP), listS(CLET, list(list(sub_cache, list(FIF, list(EQUAL, spec_pred, list(TVA_CACHE_PRED, v_cache)), v_cache, list(FIND_TVA_SUB_CACHE, v_cache, spec_pred, inverseP)))), append(body, NIL)));
    }

    public static SubLObject do_tva_sub_caches_via_memoized_lists(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sub_cache = NIL;
        SubLObject v_cache = NIL;
        SubLObject inverseP = NIL;
        destructuring_bind_must_consp(current, datum, $list79);
        sub_cache = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        v_cache = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list79);
        inverseP = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$32 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list79);
            current_$32 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list79);
            if (NIL == member(current_$32, $list80, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$32 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list79);
        }
        final SubLObject doneP_tail = property_list_member($DONE_, current);
        final SubLObject doneP = (NIL != doneP_tail) ? cadr(doneP_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject spec_pred = $sym92$SPEC_PRED;
        final SubLObject spec_preds = $sym93$SPEC_PREDS;
        final SubLObject spec_inverses = $sym94$SPEC_INVERSES;
        return list(CMULTIPLE_VALUE_BIND, list(spec_preds, spec_inverses), list(TVA_CACHE_SPEC_PREDS_AND_INVERSES, list(TVA_CACHE_PRED, v_cache)), list(CSOME, list(spec_pred, spec_preds, doneP), listS(CLET, list(bq_cons(inverseP, $list98), list(sub_cache, list(FIF, list(EQUAL, spec_pred, list(TVA_CACHE_PRED, v_cache)), v_cache, list(FIND_TVA_SUB_CACHE, v_cache, spec_pred, inverseP)))), append(body, NIL))), list(CSOME, list(spec_pred, spec_inverses, doneP), listS(CLET, list(bq_cons(inverseP, $list99), list(sub_cache, list(FIF, list(EQUAL, spec_pred, list(TVA_CACHE_PRED, v_cache)), v_cache, list(FIND_TVA_SUB_CACHE, v_cache, spec_pred, inverseP)))), append(body, NIL))));
    }

    public static SubLObject tva_cache_spec_preds_and_inverses_internal(final SubLObject pred, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject spec_preds = NIL;
        SubLObject spec_inverses = NIL;
        SubLObject time = NIL;
        final SubLObject time_var = get_internal_real_time();
        if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_EVERYTHING)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject deck_type = $QUEUE;
                final SubLObject recur_deck = deck.create_deck(deck_type);
                SubLObject node_and_predicate_mode = NIL;
                final SubLObject _prev_bind_0_$33 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$34 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$35 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$35 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$36 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$36 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$37 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$40 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                        for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                            final SubLObject node_var_$41 = node_and_predicate_mode.first();
                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                            final SubLObject spec_pred = node_var_$41;
                                            final SubLObject _prev_bind_0_$37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                final SubLObject inverseP = predicate_mode;
                                                if (NIL != inverseP) {
                                                    spec_inverses = cons(spec_pred, spec_inverses);
                                                } else {
                                                    spec_preds = cons(spec_pred, spec_preds);
                                                }
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$38 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$38 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(node_var_$41);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$46;
                                                                                for (iteration_state_$46 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$46); iteration_state_$46 = dictionary_contents.do_dictionary_contents_next(iteration_state_$46)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$46);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$40, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$46);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$39, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$48;
                                                                final SubLObject new_list = cdolist_list_var_$48 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$48.first();
                                                                while (NIL != cdolist_list_var_$48) {
                                                                    final SubLObject _prev_bind_0_$41 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var2 = sol2;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while (NIL != csome_list_var2) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$41, thread);
                                                                    }
                                                                    cdolist_list_var_$48 = cdolist_list_var_$48.rest();
                                                                    generating_fn = cdolist_list_var_$48.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$38, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$38, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$37, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$40, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$37, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$36, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$36, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$35, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$35, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$34, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$33, thread);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } else
            if (NIL != mt_relevance_macros.mt_function_eq(mt_info, RELEVANT_MT_IS_ANY_MT)) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
                    mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
                    final SubLObject deck_type = $QUEUE;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    SubLObject node_and_predicate_mode = NIL;
                    final SubLObject _prev_bind_0_$43 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$44 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$39 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$45 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$46 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$41 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                            for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                final SubLObject node_var_$42 = node_and_predicate_mode.first();
                                                final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                final SubLObject spec_pred = node_var_$42;
                                                final SubLObject _prev_bind_0_$47 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                    final SubLObject inverseP = predicate_mode;
                                                    if (NIL != inverseP) {
                                                        spec_inverses = cons(spec_pred, spec_inverses);
                                                    } else {
                                                        spec_preds = cons(spec_pred, spec_preds);
                                                    }
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$48 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(node_var_$42);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$47;
                                                                                    for (iteration_state_$47 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$47); iteration_state_$47 = dictionary_contents.do_dictionary_contents_next(iteration_state_$47)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$47);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$50, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$47);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$49, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$49;
                                                                    final SubLObject new_list = cdolist_list_var_$49 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$49.first();
                                                                    while (NIL != cdolist_list_var_$49) {
                                                                        final SubLObject _prev_bind_0_$51 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var2 = sol2;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                    while (NIL != csome_list_var2) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$51, thread);
                                                                        }
                                                                        cdolist_list_var_$49 = cdolist_list_var_$49.rest();
                                                                        generating_fn = cdolist_list_var_$49.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$42, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$48, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$47, thread);
                                                }
                                            }
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$41, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$41, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$46, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$40, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$45, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$39, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$44, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$43, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != hlmt.mt_union_naut_p(mt_info)) {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT_OF_LIST_MEMBER, thread);
                        mt_relevance_macros.$relevant_mts$.bind(hlmt.mt_union_mts(mt_info), thread);
                        final SubLObject deck_type = $QUEUE;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        SubLObject node_and_predicate_mode = NIL;
                        final SubLObject _prev_bind_0_$53 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$54 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$55 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$44 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$45 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$42 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                    final SubLObject node_var_$43 = node_and_predicate_mode.first();
                                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                    final SubLObject spec_pred = node_var_$43;
                                                    final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                        final SubLObject inverseP = predicate_mode;
                                                        if (NIL != inverseP) {
                                                            spec_inverses = cons(spec_pred, spec_inverses);
                                                        } else {
                                                            spec_preds = cons(spec_pred, spec_preds);
                                                        }
                                                        SubLObject cdolist_list_var;
                                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                        SubLObject module_var = NIL;
                                                        module_var = cdolist_list_var.first();
                                                        while (NIL != cdolist_list_var) {
                                                            final SubLObject _prev_bind_0_$58 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$46 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                final SubLObject node = function_terms.naut_to_nart(node_var_$43);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link) {
                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links) {
                                                                            SubLObject iteration_state;
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                    final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        SubLObject iteration_state_$48;
                                                                                        for (iteration_state_$48 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$48); iteration_state_$48 = dictionary_contents.do_dictionary_contents_next(iteration_state_$48)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$48);
                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    final SubLObject sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                        SubLObject basis_object;
                                                                                                        SubLObject state;
                                                                                                        SubLObject node_vars_link_node;
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            SubLObject csome_list_var = sol;
                                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                            while (NIL != csome_list_var) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        } else {
                                                                                                            Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$60, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$48);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$59, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                        SubLObject cdolist_list_var_$50;
                                                                        final SubLObject new_list = cdolist_list_var_$50 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        SubLObject generating_fn = NIL;
                                                                        generating_fn = cdolist_list_var_$50.first();
                                                                        while (NIL != cdolist_list_var_$50) {
                                                                            final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                final SubLObject sol2;
                                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                if (NIL != set.set_p(sol2)) {
                                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                    SubLObject basis_object2;
                                                                                    SubLObject state2;
                                                                                    SubLObject node_vars_link_node3;
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol2.isList()) {
                                                                                        SubLObject csome_list_var2 = sol2;
                                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                        while (NIL != csome_list_var2) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$61, thread);
                                                                            }
                                                                            cdolist_list_var_$50 = cdolist_list_var_$50.rest();
                                                                            generating_fn = cdolist_list_var_$50.first();
                                                                        } 
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$46, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$58, thread);
                                                            }
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            module_var = cdolist_list_var.first();
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$57, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$42, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$45, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$56, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$44, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$55, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$43, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$54, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values3 = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values3);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$53, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                } else {
                    final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                        mt_relevance_macros.$mt$.bind(mt_info, thread);
                        final SubLObject deck_type = $QUEUE;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        SubLObject node_and_predicate_mode = NIL;
                        final SubLObject _prev_bind_0_$63 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$64 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$47 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$65 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$48 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$66 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$49 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                    final SubLObject node_var_$44 = node_and_predicate_mode.first();
                                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                    final SubLObject spec_pred = node_var_$44;
                                                    final SubLObject _prev_bind_0_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                        final SubLObject inverseP = predicate_mode;
                                                        if (NIL != inverseP) {
                                                            spec_inverses = cons(spec_pred, spec_inverses);
                                                        } else {
                                                            spec_preds = cons(spec_pred, spec_preds);
                                                        }
                                                        SubLObject cdolist_list_var;
                                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                        SubLObject module_var = NIL;
                                                        module_var = cdolist_list_var.first();
                                                        while (NIL != cdolist_list_var) {
                                                            final SubLObject _prev_bind_0_$68 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$50 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                final SubLObject node = function_terms.naut_to_nart(node_var_$44);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link) {
                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links) {
                                                                            SubLObject iteration_state;
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                    final SubLObject _prev_bind_0_$69 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        SubLObject iteration_state_$49;
                                                                                        for (iteration_state_$49 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$49); iteration_state_$49 = dictionary_contents.do_dictionary_contents_next(iteration_state_$49)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$49);
                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                final SubLObject _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    final SubLObject sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                        SubLObject basis_object;
                                                                                                        SubLObject state;
                                                                                                        SubLObject node_vars_link_node;
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            SubLObject csome_list_var = sol;
                                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                            while (NIL != csome_list_var) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        } else {
                                                                                                            Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$70, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$49);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$69, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                        SubLObject cdolist_list_var_$51;
                                                                        final SubLObject new_list = cdolist_list_var_$51 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        SubLObject generating_fn = NIL;
                                                                        generating_fn = cdolist_list_var_$51.first();
                                                                        while (NIL != cdolist_list_var_$51) {
                                                                            final SubLObject _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                final SubLObject sol2;
                                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                if (NIL != set.set_p(sol2)) {
                                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                    SubLObject basis_object2;
                                                                                    SubLObject state2;
                                                                                    SubLObject node_vars_link_node3;
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol2.isList()) {
                                                                                        SubLObject csome_list_var2 = sol2;
                                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                        while (NIL != csome_list_var2) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$71, thread);
                                                                            }
                                                                            cdolist_list_var_$51 = cdolist_list_var_$51.rest();
                                                                            generating_fn = cdolist_list_var_$51.first();
                                                                        } 
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$50, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$68, thread);
                                                            }
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            module_var = cdolist_list_var.first();
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$67, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$43, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$49, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$66, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$48, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$65, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$47, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$64, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$63, thread);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }


        time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
        dictionary_utilities.dictionary_push($tva_cache_spec_pred_stats$.getGlobalValue(), pred, cons(mt_info, time));
        return values(nreverse(spec_preds), nreverse(spec_inverses));
    }

    public static SubLObject tva_cache_spec_preds_and_inverses(final SubLObject pred, SubLObject mt_info) {
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return tva_cache_spec_preds_and_inverses_internal(pred, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TVA_CACHE_SPEC_PREDS_AND_INVERSES, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TVA_CACHE_SPEC_PREDS_AND_INVERSES, TWO_INTEGER, $int$5000, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TVA_CACHE_SPEC_PREDS_AND_INVERSES, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(tva_cache_spec_preds_and_inverses_internal(pred, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject find_tva_sub_cache(final SubLObject v_cache, final SubLObject spec_pred, final SubLObject inverseP) {
        final SubLObject index_argnum = (NIL != inverseP) ? invert_binary_argnum(tva_cache_index_argnum(v_cache)) : tva_cache_index_argnum(v_cache);
        return tva_cache_for_predicate_and_index_argnum(spec_pred, index_argnum);
    }

    public static SubLObject tva_cache_lookup(final SubLObject v_cache, final SubLObject key, SubLObject compute_justifications_p, SubLObject target, SubLObject target_test) {
        if (compute_justifications_p == UNPROVIDED) {
            compute_justifications_p = NIL;
        }
        if (target == UNPROVIDED) {
            target = NIL;
        }
        if (target_test == UNPROVIDED) {
            target_test = symbol_function(EQL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                return tva_cache_lookup_recursive(v_cache, key, compute_justifications_p, target, target_test, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
            } finally {
                final SubLObject _prev_bind_0_$105 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject tva_cache_lookup_recursive(final SubLObject v_cache, final SubLObject key, final SubLObject compute_justifications_p, final SubLObject target, final SubLObject target_test, final SubLObject tried) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject top_levelP = dictionary.dictionary_empty_p(tried);
        SubLObject doneP = subl_promotions.memberP(key, dictionary.dictionary_lookup_without_values(tried, v_cache, NIL), UNPROVIDED, UNPROVIDED);
        SubLObject possibly_supported_values = (NIL != doneP) ? NIL : tva_cache_lookup_internal(v_cache, key, compute_justifications_p, target, target_test, set.new_set(symbol_function(EQUAL), UNPROVIDED));
        final SubLObject tag = with_timeout_make_tag();
        try {
            thread.throwStack.push(tag);
            final SubLObject _prev_bind_0 = $within_with_timeout$.currentBinding(thread);
            try {
                $within_with_timeout$.bind(T, thread);
                SubLObject timer = NIL;
                try {
                    final SubLObject _prev_bind_0_$106 = $with_timeout_nesting_depth$.currentBinding(thread);
                    try {
                        $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                        timer = with_timeout_start_timer(NIL != top_levelP ? inference_strategist.current_controlling_inference_time_remaining() : NIL, tag);
                        dictionary_utilities.dictionary_push(tried, v_cache, key);
                        if (NIL != $tva_cache_use_memoized_spec_pred_listsP$.getDynamicValue(thread)) {
                            thread.resetMultipleValues();
                            final SubLObject spec_preds = tva_cache_spec_preds_and_inverses(tva_cache_pred(v_cache), UNPROVIDED);
                            final SubLObject spec_inverses = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL == doneP) {
                                SubLObject csome_list_var = spec_preds;
                                SubLObject spec_pred = NIL;
                                spec_pred = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject inverseP = NIL;
                                    final SubLObject sub_cache = (spec_pred.equal(tva_cache_pred(v_cache))) ? v_cache : find_tva_sub_cache(v_cache, spec_pred, inverseP);
                                    thread.resetMultipleValues();
                                    final SubLObject possibly_supported_values_$107 = tva_cache_lookup_recursive_internal(v_cache, sub_cache, inverseP, possibly_supported_values, tried, key, compute_justifications_p, target, target_test);
                                    final SubLObject doneP_$108 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    possibly_supported_values = possibly_supported_values_$107;
                                    doneP = doneP_$108;
                                    csome_list_var = csome_list_var.rest();
                                    spec_pred = csome_list_var.first();
                                } 
                            }
                            if (NIL == doneP) {
                                SubLObject csome_list_var = spec_inverses;
                                SubLObject spec_pred = NIL;
                                spec_pred = csome_list_var.first();
                                while ((NIL == doneP) && (NIL != csome_list_var)) {
                                    final SubLObject inverseP = T;
                                    final SubLObject sub_cache = (spec_pred.equal(tva_cache_pred(v_cache))) ? v_cache : find_tva_sub_cache(v_cache, spec_pred, inverseP);
                                    thread.resetMultipleValues();
                                    final SubLObject possibly_supported_values_$108 = tva_cache_lookup_recursive_internal(v_cache, sub_cache, inverseP, possibly_supported_values, tried, key, compute_justifications_p, target, target_test);
                                    final SubLObject doneP_$109 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    possibly_supported_values = possibly_supported_values_$108;
                                    doneP = doneP_$109;
                                    csome_list_var = csome_list_var.rest();
                                    spec_pred = csome_list_var.first();
                                } 
                            }
                        } else
                            if (NIL == doneP) {
                                final SubLObject node_var = tva_cache_pred(v_cache);
                                final SubLObject deck_type = $QUEUE;
                                final SubLObject recur_deck = deck.create_deck(deck_type);
                                SubLObject node_and_predicate_mode = NIL;
                                final SubLObject _prev_bind_0_$107 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject tv_var = NIL;
                                        final SubLObject _prev_bind_0_$108 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                        final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                if (pcase_var.eql($ERROR)) {
                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var.eql($CERROR)) {
                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else
                                                        if (pcase_var.eql($WARN)) {
                                                            Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                        } else {
                                                            Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                            Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                        }


                                            }
                                            final SubLObject _prev_bind_0_$109 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$114 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                            final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(tva_cache_pred(v_cache), sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                    final SubLObject _prev_bind_0_$110 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$115 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$117 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                        for (node_and_predicate_mode = list(tva_cache_pred(v_cache), sbhl_search_vars.genl_inverse_mode_p()); (NIL != node_and_predicate_mode) && (NIL == doneP); node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                            final SubLObject node_var_$118 = node_and_predicate_mode.first();
                                                            final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                            final SubLObject spec_pred2 = node_var_$118;
                                                            final SubLObject _prev_bind_0_$111 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                                final SubLObject inverseP2 = predicate_mode;
                                                                final SubLObject sub_cache2 = (spec_pred2.equal(tva_cache_pred(v_cache))) ? v_cache : find_tva_sub_cache(v_cache, spec_pred2, inverseP2);
                                                                thread.resetMultipleValues();
                                                                final SubLObject possibly_supported_values_$109 = tva_cache_lookup_recursive_internal(v_cache, sub_cache2, inverseP2, possibly_supported_values, tried, key, compute_justifications_p, target, target_test);
                                                                final SubLObject doneP_$110 = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                possibly_supported_values = possibly_supported_values_$109;
                                                                doneP = doneP_$110;
                                                                final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                                SubLObject rest;
                                                                SubLObject module_var;
                                                                SubLObject _prev_bind_0_$112;
                                                                SubLObject _prev_bind_1_$116;
                                                                SubLObject node;
                                                                SubLObject d_link;
                                                                SubLObject mt_links;
                                                                SubLObject iteration_state;
                                                                SubLObject mt;
                                                                SubLObject tv_links;
                                                                SubLObject _prev_bind_0_$113;
                                                                SubLObject iteration_state_$125;
                                                                SubLObject tv;
                                                                SubLObject link_nodes;
                                                                SubLObject _prev_bind_0_$114;
                                                                SubLObject sol;
                                                                SubLObject set_contents_var;
                                                                SubLObject basis_object;
                                                                SubLObject state;
                                                                SubLObject node_vars_link_node;
                                                                SubLObject csome_list_var2;
                                                                SubLObject node_vars_link_node2;
                                                                SubLObject new_list;
                                                                SubLObject rest_$127;
                                                                SubLObject generating_fn;
                                                                SubLObject _prev_bind_0_$115;
                                                                SubLObject sol2;
                                                                SubLObject link_nodes2;
                                                                SubLObject set_contents_var2;
                                                                SubLObject basis_object2;
                                                                SubLObject state2;
                                                                SubLObject node_vars_link_node3;
                                                                SubLObject csome_list_var3;
                                                                SubLObject node_vars_link_node4;
                                                                for (rest = NIL, rest = accessible_modules; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                                                                    module_var = rest.first();
                                                                    _prev_bind_0_$112 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                    _prev_bind_1_$116 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                        node = function_terms.naut_to_nart(node_var_$118);
                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                            d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                            if (NIL != d_link) {
                                                                                mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                if (NIL != mt_links) {
                                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                        thread.resetMultipleValues();
                                                                                        mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                        tv_links = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                            _prev_bind_0_$113 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                for (iteration_state_$125 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$125)); iteration_state_$125 = dictionary_contents.do_dictionary_contents_next(iteration_state_$125)) {
                                                                                                    thread.resetMultipleValues();
                                                                                                    tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$125);
                                                                                                    link_nodes = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                        _prev_bind_0_$114 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                        try {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                            sol = link_nodes;
                                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                                set_contents_var = set.do_set_internal(sol);
                                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                        deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                    }
                                                                                                                }
                                                                                                            } else
                                                                                                                if (sol.isList()) {
                                                                                                                    if (NIL == doneP) {
                                                                                                                        csome_list_var2 = sol;
                                                                                                                        node_vars_link_node2 = NIL;
                                                                                                                        node_vars_link_node2 = csome_list_var2.first();
                                                                                                                        while ((NIL == doneP) && (NIL != csome_list_var2)) {
                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                                deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                            }
                                                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                                        } 
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                                }

                                                                                                        } finally {
                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$114, thread);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$125);
                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$113, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                }
                                                                            } else {
                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            }
                                                                        } else
                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                for (rest_$127 = NIL, rest_$127 = new_list; (NIL == doneP) && (NIL != rest_$127); rest_$127 = rest_$127.rest()) {
                                                                                    generating_fn = rest_$127.first();
                                                                                    _prev_bind_0_$115 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                        link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                        if (NIL != set.set_p(sol2)) {
                                                                                            set_contents_var2 = set.do_set_internal(sol2);
                                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol2.isList()) {
                                                                                                if (NIL == doneP) {
                                                                                                    csome_list_var3 = sol2;
                                                                                                    node_vars_link_node4 = NIL;
                                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                                    while ((NIL == doneP) && (NIL != csome_list_var3)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                            deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                        }
                                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$115, thread);
                                                                                    }
                                                                                }
                                                                            }

                                                                    } finally {
                                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$116, thread);
                                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$112, thread);
                                                                    }
                                                                }
                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$111, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$117, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$115, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$110, thread);
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, tva_cache_pred(v_cache), sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$114, thread);
                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$109, thread);
                                            }
                                        } finally {
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$108, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$116 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$107, thread);
                                }
                            }

                    } finally {
                        $with_timeout_nesting_depth$.rebind(_prev_bind_0_$106, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$117 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        with_timeout_stop_timer(timer);
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                    }
                }
            } finally {
                $within_with_timeout$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            doneP = Errors.handleThrowable(ccatch_env_var, tag);
        } finally {
            thread.throwStack.pop();
        }
        return possibly_supported_values;
    }

    public static SubLObject tva_cache_lookup_recursive_internal(final SubLObject v_cache, final SubLObject sub_cache, final SubLObject inverseP, SubLObject possibly_supported_values, final SubLObject tried, final SubLObject key, final SubLObject compute_justifications_p, final SubLObject target, final SubLObject target_test) {
        final SubLObject sub_cache_results = (NIL != tva_cache_p(sub_cache)) ? tva_cache_lookup_recursive(sub_cache, key, compute_justifications_p, NIL, target_test, tried) : NIL;
        SubLObject doneP;
        SubLObject rest;
        SubLObject cons;
        SubLObject current;
        SubLObject datum;
        SubLObject value;
        SubLObject supports;
        SubLObject cache_pred;
        SubLObject this_pred;
        SubLObject support;
        SubLObject rest_$131;
        SubLObject cons_$132;
        SubLObject current_$134;
        SubLObject datum_$133;
        SubLObject transitive_value;
        SubLObject more_supports;
        for (doneP = NIL, rest = NIL, rest = sub_cache_results; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
            cons = rest.first();
            datum = current = cons;
            value = NIL;
            supports = NIL;
            destructuring_bind_must_consp(current, datum, $list106);
            value = current.first();
            current = supports = current.rest();
            if ((NIL != compute_justifications_p) && (!tva_cache_pred(sub_cache).equal(tva_cache_pred(v_cache)))) {
                cache_pred = tva_cache_pred(v_cache);
                this_pred = tva_cache_pred(sub_cache);
                support = (NIL != inverseP) ? removal_module_utilities.make_genl_inverse_support(this_pred, cache_pred) : removal_module_utilities.make_genl_preds_support(this_pred, cache_pred);
                supports = cons(support, supports);
            }
            if ((NIL == target) || (NIL != funcall(target_test, target, value))) {
                possibly_supported_values = list_utilities.alist_enter(possibly_supported_values, value, supports, UNPROVIDED);
            }
            if (NIL != fort_types_interface.transitive_binary_predicate_p(tva_cache_pred(sub_cache))) {
                for (rest_$131 = NIL, rest_$131 = tva_cache_lookup_recursive(sub_cache, value, compute_justifications_p, target, target_test, tried); (NIL == doneP) && (NIL != rest_$131); rest_$131 = rest_$131.rest()) {
                    cons_$132 = rest_$131.first();
                    datum_$133 = current_$134 = cons_$132;
                    transitive_value = NIL;
                    more_supports = NIL;
                    destructuring_bind_must_consp(current_$134, datum_$133, $list107);
                    transitive_value = current_$134.first();
                    current_$134 = more_supports = current_$134.rest();
                    if (NIL != compute_justifications_p) {
                        more_supports = cons(tva_cache_transitive_binary_predicate_support(tva_cache_pred(sub_cache)), more_supports);
                    }
                    possibly_supported_values = list_utilities.alist_enter(possibly_supported_values, transitive_value, union(supports, more_supports, symbol_function($sym108$TVA_CACHE_SUPPORT_EQUAL_), UNPROVIDED), UNPROVIDED);
                }
            }
        }
        if ((NIL != target) && (NIL != list_utilities.non_empty_list_p(possibly_supported_values))) {
            doneP = T;
        }
        return values(possibly_supported_values, doneP);
    }

    public static SubLObject cleanup_tva_cache_supports_genl_preds_chains(final SubLObject supports) {
        SubLObject clean = NIL;
        SubLObject genl_preds_supports = NIL;
        SubLObject cdolist_list_var = supports;
        SubLObject support = NIL;
        support = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($GENLPREDS.eql(arguments.support_module(support))) {
                genl_preds_supports = cons(support, genl_preds_supports);
            } else {
                clean = cons(support, clean);
            }
            cdolist_list_var = cdolist_list_var.rest();
            support = cdolist_list_var.first();
        } 
        return clean;
    }

    public static SubLObject with_tva_cache_lock(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return listS(WITH_FILE_VECTOR_BACKED_MAP_STREAM_LOCK, $list111, append(body, NIL));
    }

    public static SubLObject tva_cache_entry_for_key(final SubLObject v_cache, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject entry = NIL;
        if (NIL != using_swappable_tva_cachesP()) {
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind($swappable_tva_cache_lock$.getGlobalValue(), thread);
                entry = map_utilities.map_get_without_values(tva_cache_map(v_cache), key, NIL);
            } finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } else {
            entry = map_utilities.map_get_without_values(tva_cache_map(v_cache), key, NIL);
        }
        return entry;
    }

    public static SubLObject tva_cache_lookup_internal_internal(final SubLObject v_cache, final SubLObject key, final SubLObject compute_justifications_p, final SubLObject target, final SubLObject target_test, final SubLObject checked_keys) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entry = tva_cache_entry_for_key(v_cache, key);
        SubLObject possibly_supported_values = NIL;
        SubLObject doneP = NIL;
        if (NIL != entry) {
            set.set_add(key, checked_keys);
            SubLObject current;
            final SubLObject datum = current = entry;
            SubLObject raw_supported_values = NIL;
            SubLObject supported_subkeys = NIL;
            destructuring_bind_must_consp(current, datum, $list20);
            raw_supported_values = current.first();
            current = supported_subkeys = current.rest();
            SubLObject iterator = map_utilities.new_map_iterator(raw_supported_values);
            SubLObject valid;
            for (SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != doneP))) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current_$136;
                    final SubLObject datum_$135 = current_$136 = var;
                    SubLObject value = NIL;
                    SubLObject supports = NIL;
                    destructuring_bind_must_consp(current_$136, datum_$135, $list113);
                    value = current_$136.first();
                    current_$136 = current_$136.rest();
                    destructuring_bind_must_consp(current_$136, datum_$135, $list113);
                    supports = current_$136.first();
                    current_$136 = current_$136.rest();
                    if (NIL == current_$136) {
                        if (((NIL == target) || (NIL != funcall(target_test, value, target))) && (NIL == doneP)) {
                            SubLObject csome_list_var = supports;
                            SubLObject support = NIL;
                            support = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                final SubLObject valid_supports = unpack_and_validate_tva_cache_support(support, compute_justifications_p, tva_cache_pred(v_cache));
                                if (NIL != valid_supports) {
                                    possibly_supported_values = list_utilities.alist_enter(possibly_supported_values, value, NIL != compute_justifications_p ? valid_supports : NIL, UNPROVIDED);
                                    if (NIL != target) {
                                        doneP = T;
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                support = csome_list_var.first();
                            } 
                        }
                    } else {
                        cdestructuring_bind_error(datum_$135, $list113);
                    }
                }
            }
            iterator = map_utilities.new_map_iterator(supported_subkeys);
            for (SubLObject done_var = doneP; NIL == done_var; done_var = makeBoolean((NIL == valid) || (NIL != doneP))) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current_$137;
                    final SubLObject datum_$136 = current_$137 = var;
                    SubLObject subkey = NIL;
                    SubLObject subkey_supports = NIL;
                    destructuring_bind_must_consp(current_$137, datum_$136, $list114);
                    subkey = current_$137.first();
                    current_$137 = current_$137.rest();
                    destructuring_bind_must_consp(current_$137, datum_$136, $list114);
                    subkey_supports = current_$137.first();
                    current_$137 = current_$137.rest();
                    if (NIL == current_$137) {
                        if ((NIL == set.set_memberP(subkey, checked_keys)) && (NIL == doneP)) {
                            SubLObject csome_list_var = subkey_supports;
                            SubLObject subkey_support = NIL;
                            subkey_support = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                SubLObject valid_subkey_supports = unpack_and_validate_tva_cache_support(subkey_support, compute_justifications_p, UNPROVIDED);
                                final SubLObject transitivity_support = (NIL != valid_subkey_supports) ? tva_cache_transitivity_support(v_cache, subkey_support, UNPROVIDED) : NIL;
                                if (NIL != transitivity_support) {
                                    if (NIL != compute_justifications_p) {
                                        valid_subkey_supports = cons(transitivity_support, valid_subkey_supports);
                                    }
                                    if (NIL == doneP) {
                                        SubLObject csome_list_var_$139 = tva_cache_lookup_internal(v_cache, subkey, compute_justifications_p, target, target_test, checked_keys);
                                        SubLObject supported_subkey_value = NIL;
                                        supported_subkey_value = csome_list_var_$139.first();
                                        while ((NIL == doneP) && (NIL != csome_list_var_$139)) {
                                            SubLObject current_$138;
                                            final SubLObject datum_$137 = current_$138 = supported_subkey_value;
                                            SubLObject subkey_value = NIL;
                                            SubLObject subkey_value_supports = NIL;
                                            destructuring_bind_must_consp(current_$138, datum_$137, $list115);
                                            subkey_value = current_$138.first();
                                            current_$138 = subkey_value_supports = current_$138.rest();
                                            if ((NIL == target) || (NIL != funcall(target_test, subkey_value, target))) {
                                                final SubLObject new_value_supports = (NIL != compute_justifications_p) ? list_utilities.fast_delete_duplicates(append(subkey_value_supports, valid_subkey_supports), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL;
                                                possibly_supported_values = list_utilities.alist_enter(possibly_supported_values, subkey_value, new_value_supports, UNPROVIDED);
                                                if (NIL != target) {
                                                    doneP = T;
                                                }
                                            }
                                            csome_list_var_$139 = csome_list_var_$139.rest();
                                            supported_subkey_value = csome_list_var_$139.first();
                                        } 
                                    }
                                }
                                csome_list_var = csome_list_var.rest();
                                subkey_support = csome_list_var.first();
                            } 
                        }
                    } else {
                        cdestructuring_bind_error(datum_$136, $list114);
                    }
                }
            }
        }
        return possibly_supported_values;
    }

    public static SubLObject tva_cache_lookup_internal(final SubLObject v_cache, final SubLObject key, final SubLObject compute_justifications_p, final SubLObject target, final SubLObject target_test, final SubLObject checked_keys) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return tva_cache_lookup_internal_internal(v_cache, key, compute_justifications_p, target, target_test, checked_keys);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, TVA_CACHE_LOOKUP_INTERNAL, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), TVA_CACHE_LOOKUP_INTERNAL, SIX_INTEGER, $int$32768, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, TVA_CACHE_LOOKUP_INTERNAL, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(v_cache, key, compute_justifications_p, target, target_test, checked_keys);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_cache.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (key.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (compute_justifications_p.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (target.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (target_test.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && checked_keys.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(tva_cache_lookup_internal_internal(v_cache, key, compute_justifications_p, target, target_test, checked_keys)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_cache, key, compute_justifications_p, target, target_test, checked_keys));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject tva_cache_has_keyP(final SubLObject v_cache, final SubLObject key) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind($swappable_tva_cache_lock$.getGlobalValue(), thread);
            ans = map_utilities.map_has_keyP(tva_cache_map(v_cache), key);
        } finally {
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject tva_cache_valid_supportP_internal(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $tva_cache_assume_supports_are_validP$.getDynamicValue(thread)) {
            return T;
        }
        if (NIL != assertion_handles.assertion_p(support)) {
            return makeBoolean((NIL != assertion_handles.valid_assertionP(support, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_mtP(arguments.support_mt(support))));
        }
        if (NIL != arguments.hl_support_p(support)) {
            final SubLObject support_in_current_mt = arguments.make_hl_support(arguments.hl_support_module(support), arguments.hl_support_sentence(support), UNPROVIDED, UNPROVIDED);
            final SubLObject okP = hl_supports.hl_verify(support_in_current_mt);
            return okP;
        }
        return NIL;
    }

    public static SubLObject tva_cache_valid_supportP(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return tva_cache_valid_supportP_internal(support);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym117$TVA_CACHE_VALID_SUPPORT_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym117$TVA_CACHE_VALID_SUPPORT_, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym117$TVA_CACHE_VALID_SUPPORT_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, support, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(tva_cache_valid_supportP_internal(support)));
            memoization_state.caching_state_put(caching_state, support, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject tva_cache_support_gaf(final SubLObject support) {
        return NIL != assertion_handles.assertion_p(support) ? support : second(support);
    }

    public static SubLObject tva_cache_support_equalP(final SubLObject support1, final SubLObject support2) {
        if (NIL != tva_cache_support_complex_p(support1)) {
            return makeBoolean((NIL != tva_cache_support_complex_p(support2)) && (NIL != tva_cache_complex_support_equalP(support1, support2)));
        }
        return eql(tva_cache_support_gaf(support1), tva_cache_support_gaf(support2));
    }

    public static SubLObject unpack_and_validate_tva_cache_support(final SubLObject support, final SubLObject compute_justifications_p, SubLObject cache_pred) {
        if (cache_pred == UNPROVIDED) {
            cache_pred = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != arguments.support_p(support)) {
            return NIL != tva_cache_valid_supportP(support) ? list(support) : NIL;
        }
        if (NIL != tva_cache_support_complex_p(support)) {
            return unpack_and_validate_tva_cache_complex_support(support, compute_justifications_p, cache_pred);
        }
        SubLObject ans = NIL;
        SubLObject type = NIL;
        SubLObject gaf = NIL;
        destructuring_bind_must_consp(support, support, $list118);
        type = support.first();
        SubLObject current = support.rest();
        destructuring_bind_must_consp(current, support, $list118);
        gaf = current.first();
        current = current.rest();
        final SubLObject specified_pred = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, support, $list118);
        current = current.rest();
        if (NIL == current) {
            final SubLObject genl_pred = (NIL != specified_pred) ? specified_pred : cache_pred;
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == genl_pred)) {
                Errors.error($str119$No_specified_pred_for__S, support);
            }
            if (NIL != tva_cache_valid_supportP(gaf)) {
                final SubLObject pcase_var = type;
                if (pcase_var.eql($INVERSE)) {
                    if (NIL != genl_predicates.genl_inverseP(assertions_high.gaf_arg0(gaf), genl_pred, UNPROVIDED, UNPROVIDED)) {
                        if (NIL != compute_justifications_p) {
                            ans = cons(removal_module_utilities.make_genl_inverse_support(assertions_high.gaf_arg0(gaf), genl_pred), ans);
                        }
                        ans = cons(gaf, ans);
                    }
                } else
                    if (pcase_var.eql($SPEC_PRED) && (NIL != genl_predicates.genl_predicateP(assertions_high.gaf_arg0(gaf), genl_pred, UNPROVIDED, UNPROVIDED))) {
                        if (NIL != compute_justifications_p) {
                            ans = cons(removal_module_utilities.make_genl_preds_support(assertions_high.gaf_arg0(gaf), genl_pred), ans);
                        }
                        ans = cons(gaf, ans);
                    }

            }
        } else {
            cdestructuring_bind_error(support, $list118);
        }
        return ans;
    }

    public static SubLObject unpack_and_validate_tva_cache_complex_support(final SubLObject support, final SubLObject compute_justifications_p, SubLObject cache_pred) {
        if (cache_pred == UNPROVIDED) {
            cache_pred = NIL;
        }
        SubLObject invalidP = NIL;
        SubLObject validated = NIL;
        if (NIL == invalidP) {
            SubLObject csome_list_var = support.rest();
            SubLObject component_support = NIL;
            component_support = csome_list_var.first();
            while ((NIL == invalidP) && (NIL != csome_list_var)) {
                final SubLObject result = unpack_and_validate_tva_cache_support(component_support, compute_justifications_p, cache_pred);
                if (NIL != result) {
                    SubLObject cdolist_list_var = result;
                    SubLObject validated_support = NIL;
                    validated_support = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        validated = cons(validated_support, validated);
                        cdolist_list_var = cdolist_list_var.rest();
                        validated_support = cdolist_list_var.first();
                    } 
                } else {
                    invalidP = T;
                }
                csome_list_var = csome_list_var.rest();
                component_support = csome_list_var.first();
            } 
        }
        return NIL != invalidP ? NIL : validated;
    }

    public static SubLObject add_tva_cache_value(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $update_tva_cacheP$.getDynamicValue(thread)) && (NIL != after_adding.initial_assertion_argumentP(argument, assertion))) {
            return add_tva_cache_value_cached(assertion);
        }
        return NIL;
    }

    public static SubLObject clear_add_tva_cache_value_cached() {
        final SubLObject cs = $add_tva_cache_value_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_add_tva_cache_value_cached(final SubLObject assertion) {
        return memoization_state.caching_state_remove_function_results_with_args($add_tva_cache_value_cached_caching_state$.getGlobalValue(), list(assertion), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject add_tva_cache_value_cached_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_hl_formula(assertion), UNPROVIDED);
        SubLObject bin_pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list124);
        bin_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            final SubLObject caches = tva_caches_implied_by_predicate(bin_pred);
            final SubLObject inverse_caches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(assertion));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = caches;
                SubLObject v_cache = NIL;
                v_cache = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject pcase_var = tva_cache_index_argnum(v_cache);
                    if (pcase_var.eql(ONE_INTEGER)) {
                        tva_cache_store_one_value(v_cache, arg2);
                    } else
                        if (pcase_var.eql(TWO_INTEGER)) {
                            tva_cache_store_one_value(v_cache, arg1);
                        }

                    cdolist_list_var = cdolist_list_var.rest();
                    v_cache = cdolist_list_var.first();
                } 
                cdolist_list_var = inverse_caches;
                v_cache = NIL;
                v_cache = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject pcase_var = tva_cache_index_argnum(v_cache);
                    if (pcase_var.eql(TWO_INTEGER)) {
                        tva_cache_store_one_value(v_cache, arg2);
                    } else
                        if (pcase_var.eql(ONE_INTEGER)) {
                            tva_cache_store_one_value(v_cache, arg1);
                        }

                    cdolist_list_var = cdolist_list_var.rest();
                    v_cache = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(datum, $list124);
        }
        return NIL;
    }

    public static SubLObject add_tva_cache_value_cached(final SubLObject assertion) {
        SubLObject caching_state = $add_tva_cache_value_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ADD_TVA_CACHE_VALUE_CACHED, $add_tva_cache_value_cached_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(add_tva_cache_value_cached_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject remove_tva_cache_value(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $update_tva_cacheP$.getDynamicValue(thread)) && (NIL != after_adding.final_assertion_argumentP(argument, assertion))) {
            return remove_tva_cache_value_cached(assertion);
        }
        return NIL;
    }

    public static SubLObject clear_remove_tva_cache_value_cached() {
        final SubLObject cs = $remove_tva_cache_value_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_remove_tva_cache_value_cached(final SubLObject assertion) {
        return memoization_state.caching_state_remove_function_results_with_args($remove_tva_cache_value_cached_caching_state$.getGlobalValue(), list(assertion), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_tva_cache_value_cached_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_hl_formula(assertion), UNPROVIDED);
        SubLObject bin_pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list124);
        bin_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            final SubLObject caches = tva_caches_implied_by_predicate(bin_pred);
            final SubLObject inverse_caches = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(assertion));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = caches;
                SubLObject v_cache = NIL;
                v_cache = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject pcase_var = tva_cache_index_argnum(v_cache);
                    if (pcase_var.eql(ONE_INTEGER)) {
                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), arg1, arg2, assertion);
                    } else
                        if (pcase_var.eql(TWO_INTEGER)) {
                            tva_cache_remove_key_value_support(tva_cache_map(v_cache), arg2, arg1, assertion);
                        }

                    cdolist_list_var = cdolist_list_var.rest();
                    v_cache = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
            SubLObject cdolist_list_var2 = inverse_caches;
            SubLObject v_cache2 = NIL;
            v_cache2 = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject pcase_var2 = tva_cache_index_argnum(v_cache2);
                if (pcase_var2.eql(TWO_INTEGER)) {
                    tva_cache_remove_key_value_support(tva_cache_map(v_cache2), arg1, arg2, assertion);
                } else
                    if (pcase_var2.eql(ONE_INTEGER)) {
                        tva_cache_remove_key_value_support(tva_cache_map(v_cache2), arg2, arg1, assertion);
                    }

                cdolist_list_var2 = cdolist_list_var2.rest();
                v_cache2 = cdolist_list_var2.first();
            } 
        } else {
            cdestructuring_bind_error(datum, $list124);
        }
        return NIL;
    }

    public static SubLObject remove_tva_cache_value_cached(final SubLObject assertion) {
        SubLObject caching_state = $remove_tva_cache_value_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(REMOVE_TVA_CACHE_VALUE_CACHED, $remove_tva_cache_value_cached_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(remove_tva_cache_value_cached_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject add_tva_cache_key(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != $update_tva_cacheP$.getDynamicValue(thread)) && (NIL != after_adding.initial_assertion_argumentP(argument, assertion))) {
            return add_tva_cache_key_cached(assertion);
        }
        return NIL;
    }

    public static SubLObject clear_add_tva_cache_key_cached() {
        final SubLObject cs = $add_tva_cache_key_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_add_tva_cache_key_cached(final SubLObject assertion) {
        return memoization_state.caching_state_remove_function_results_with_args($add_tva_cache_key_cached_caching_state$.getGlobalValue(), list(assertion), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject add_tva_cache_key_cached_internal(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject current;
        final SubLObject datum = current = cycl_utilities.formula_terms(assertions_high.gaf_hl_formula(assertion), UNPROVIDED);
        SubLObject trans_pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list131);
        trans_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list131);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list131);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            thread.resetMultipleValues();
            final SubLObject cache_data = tva_caches_with_transitive_predicate(trans_pred);
            final SubLObject inverse_cache_data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(assertions_high.assertion_mt(assertion));
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                SubLObject cdolist_list_var = cache_data;
                SubLObject cache_datum = NIL;
                cache_datum = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current_$143;
                    final SubLObject datum_$142 = current_$143 = cache_datum;
                    SubLObject v_cache = NIL;
                    SubLObject inverseP = NIL;
                    SubLObject original_trans_pred = NIL;
                    destructuring_bind_must_consp(current_$143, datum_$142, $list132);
                    v_cache = current_$143.first();
                    current_$143 = current_$143.rest();
                    destructuring_bind_must_consp(current_$143, datum_$142, $list132);
                    inverseP = current_$143.first();
                    current_$143 = current_$143.rest();
                    destructuring_bind_must_consp(current_$143, datum_$142, $list132);
                    original_trans_pred = current_$143.first();
                    current_$143 = current_$143.rest();
                    if (NIL == current_$143) {
                        final SubLObject spec_predP = makeBoolean(!trans_pred.eql(original_trans_pred));
                        final SubLObject key = (NIL != inverseP) ? arg2 : arg1;
                        final SubLObject implicit_key = (NIL != inverseP) ? arg1 : arg2;
                        tva_cache_ensure_cache_has_key(v_cache, implicit_key);
                        tva_cache_note_implicit_key_supports(v_cache, key, implicit_key, list(make_tva_cache_support(assertion, inverseP, spec_predP, original_trans_pred)));
                    } else {
                        cdestructuring_bind_error(datum_$142, $list132);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cache_datum = cdolist_list_var.first();
                } 
                cdolist_list_var = inverse_cache_data;
                cache_datum = NIL;
                cache_datum = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current_$144;
                    final SubLObject datum_$143 = current_$144 = cache_datum;
                    SubLObject v_cache = NIL;
                    SubLObject inverseP = NIL;
                    SubLObject original_trans_pred = NIL;
                    destructuring_bind_must_consp(current_$144, datum_$143, $list132);
                    v_cache = current_$144.first();
                    current_$144 = current_$144.rest();
                    destructuring_bind_must_consp(current_$144, datum_$143, $list132);
                    inverseP = current_$144.first();
                    current_$144 = current_$144.rest();
                    destructuring_bind_must_consp(current_$144, datum_$143, $list132);
                    original_trans_pred = current_$144.first();
                    current_$144 = current_$144.rest();
                    if (NIL == current_$144) {
                        final SubLObject spec_predP = makeBoolean(!trans_pred.eql(original_trans_pred));
                        final SubLObject key = (NIL != inverseP) ? arg1 : arg2;
                        final SubLObject implicit_key = (NIL != inverseP) ? arg2 : arg1;
                        tva_cache_ensure_cache_has_key(v_cache, implicit_key);
                        tva_cache_note_implicit_key_supports(v_cache, key, implicit_key, list(make_tva_cache_support(assertion, inverseP, spec_predP, original_trans_pred)));
                    } else {
                        cdestructuring_bind_error(datum_$143, $list132);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    cache_datum = cdolist_list_var.first();
                } 
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        } else {
            cdestructuring_bind_error(datum, $list131);
        }
        return NIL;
    }

    public static SubLObject add_tva_cache_key_cached(final SubLObject assertion) {
        SubLObject caching_state = $add_tva_cache_key_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(ADD_TVA_CACHE_KEY_CACHED, $add_tva_cache_key_cached_caching_state$, NIL, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(add_tva_cache_key_cached_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject remove_tva_cache_key(final SubLObject argument, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $update_tva_cacheP$.getDynamicValue(thread)) {
        }
        return NIL;
    }

    public static SubLObject tva_cache_add_transitive_via_arg(final SubLObject tva_gaf) {
        final SubLObject formula = assertions_high.gaf_hl_formula(tva_gaf);
        final SubLObject bin_pred = cycl_utilities.formula_arg1(formula, UNPROVIDED);
        final SubLObject index_argnum = cycl_utilities.formula_arg3(formula, UNPROVIDED);
        final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(bin_pred, index_argnum);
        if (NIL != v_cache) {
            _csetf_tva_cache_tva_pred_gafs(v_cache, cons(tva_gaf, tva_cache_tva_pred_gafs(v_cache)));
            tva_cache_add_trans_gaf(v_cache, tva_gaf, invert_binary_argnum(index_argnum), index_argnum);
        }
        return v_cache;
    }

    public static SubLObject tva_cache_add_transitive_via_arg_inverse(final SubLObject tvai_gaf) {
        final SubLObject formula = assertions_high.gaf_hl_formula(tvai_gaf);
        final SubLObject bin_pred = cycl_utilities.formula_arg1(formula, UNPROVIDED);
        final SubLObject index_argnum = cycl_utilities.formula_arg3(formula, UNPROVIDED);
        final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(bin_pred, index_argnum);
        if (NIL != v_cache) {
            _csetf_tva_cache_tvai_pred_gafs(v_cache, cons(tvai_gaf, tva_cache_tvai_pred_gafs(v_cache)));
            tva_cache_add_trans_gaf(v_cache, tvai_gaf, invert_binary_argnum(index_argnum), index_argnum);
        }
        return v_cache;
    }

    public static SubLObject tva_cache_remove_transitive_via_arg(final SubLObject tva_gaf) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args(tva_gaf);
        SubLObject bin_pred = NIL;
        SubLObject arg2 = NIL;
        SubLObject index_argnum = NIL;
        destructuring_bind_must_consp(current, datum, $list135);
        bin_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list135);
        arg2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list135);
        index_argnum = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(bin_pred, index_argnum);
            if (NIL != v_cache) {
                _csetf_tva_cache_tva_pred_gafs(v_cache, remove(tva_gaf, tva_cache_tva_pred_gafs(v_cache), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
            return v_cache;
        }
        cdestructuring_bind_error(datum, $list135);
        return NIL;
    }

    public static SubLObject tva_cache_remove_transitive_via_arg_inverse(final SubLObject tvai_gaf) {
        SubLObject current;
        final SubLObject datum = current = assertions_high.gaf_args(tvai_gaf);
        SubLObject bin_pred = NIL;
        SubLObject arg2 = NIL;
        SubLObject index_argnum = NIL;
        destructuring_bind_must_consp(current, datum, $list135);
        bin_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list135);
        arg2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list135);
        index_argnum = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject v_cache = tva_cache_for_predicate_and_index_argnum(bin_pred, index_argnum);
            if (NIL != v_cache) {
                _csetf_tva_cache_tvai_pred_gafs(v_cache, remove(tvai_gaf, tva_cache_tvai_pred_gafs(v_cache), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
            return v_cache;
        }
        cdestructuring_bind_error(datum, $list135);
        return NIL;
    }

    public static SubLObject tva_cache_add_trans_gaf(final SubLObject v_cache, final SubLObject trans_gaf, final SubLObject index_arg, final SubLObject gather_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject iterator = map_utilities.new_map_iterator(tva_cache_map(v_cache));
        SubLObject valid;
        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
            thread.resetMultipleValues();
            final SubLObject var = iteration.iteration_next(iterator);
            valid = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != valid) {
                SubLObject current;
                final SubLObject datum = current = var;
                SubLObject key = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list136);
                key = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list136);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    tva_cache_note_implicit_keys_from_trans_gaf(v_cache, key, trans_gaf, index_arg, gather_arg);
                } else {
                    cdestructuring_bind_error(datum, $list136);
                }
            }
        }
        return v_cache;
    }

    public static SubLObject create_tva_cache(final SubLObject binary_predicate, final SubLObject index_argnum, SubLObject initializeP) {
        if (initializeP == UNPROVIDED) {
            initializeP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != kb_accessors.binary_predicateP(binary_predicate) : "kb_accessors.binary_predicateP(binary_predicate) " + "CommonSymbols.NIL != kb_accessors.binary_predicateP(binary_predicate) " + binary_predicate;
        final SubLObject v_cache = make_tva_cache(UNPROVIDED);
        _csetf_tva_cache_pred(v_cache, binary_predicate);
        _csetf_tva_cache_index_argnum(v_cache, index_argnum);
        _csetf_tva_cache_map(v_cache, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            SubLObject pred_var = $$transitiveViaArg;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(binary_predicate, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(binary_predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$146 = NIL;
                            final SubLObject token_var_$147 = NIL;
                            while (NIL == done_var_$146) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$147);
                                final SubLObject valid_$148 = makeBoolean(!token_var_$147.eql(gaf));
                                if (NIL != valid_$148) {
                                    _csetf_tva_cache_tva_pred_gafs(v_cache, cons(gaf, tva_cache_tva_pred_gafs(v_cache)));
                                }
                                done_var_$146 = makeBoolean(NIL == valid_$148);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$149 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$149, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            pred_var = $$transitiveViaArgInverse;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(binary_predicate, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(binary_predicate, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$147 = NIL;
                            final SubLObject token_var_$148 = NIL;
                            while (NIL == done_var_$147) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$148);
                                final SubLObject valid_$149 = makeBoolean(!token_var_$148.eql(gaf));
                                if (NIL != valid_$149) {
                                    _csetf_tva_cache_tvai_pred_gafs(v_cache, cons(gaf, tva_cache_tvai_pred_gafs(v_cache)));
                                }
                                done_var_$147 = makeBoolean(NIL == valid_$149);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$150 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != initializeP) {
            initialize_tva_cache(v_cache);
        }
        return v_cache;
    }

    public static SubLObject initialize_tva_cache(final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        dictionary_utilities.dictionary_remove_from_value($tva_cache_registry$.getGlobalValue(), predicate, v_cache, symbol_function(EQ), UNPROVIDED);
        map_utilities.map_remove_all(tva_cache_map(v_cache));
        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, FIVE_INTEGER), thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            tva_cache_asserted_values(v_cache);
            tva_cache_relation_all_instance_values(v_cache);
            tva_cache_relation_instance_all_values(v_cache);
            register_tva_cache(v_cache);
            SubLObject error_message = NIL;
            try {
                thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                final SubLObject _prev_bind_0_$154 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                    try {
                        final SubLObject node_var = predicate;
                        final SubLObject deck_type = $QUEUE;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        SubLObject node_and_predicate_mode = NIL;
                        final SubLObject _prev_bind_0_$155 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = $$True_JustificationTruth;
                                final SubLObject _prev_bind_0_$156 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$157 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$157 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$158 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$160 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$161 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_4_$162 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(predicate, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$158 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$159 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$161 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                for (node_and_predicate_mode = list(predicate, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                                    final SubLObject node_var_$166 = node_and_predicate_mode.first();
                                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                                    final SubLObject spec_pred = node_var_$166;
                                                    final SubLObject _prev_bind_0_$159 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                                        final SubLObject inverseP = predicate_mode;
                                                        if (!spec_pred.equal(predicate)) {
                                                            final SubLObject this_index_arg = (NIL != inverseP) ? invert_binary_argnum(index_argnum) : index_argnum;
                                                            ensure_tva_cache_created(spec_pred, this_index_arg);
                                                        }
                                                        SubLObject cdolist_list_var;
                                                        final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                                        SubLObject module_var = NIL;
                                                        module_var = cdolist_list_var.first();
                                                        while (NIL != cdolist_list_var) {
                                                            final SubLObject _prev_bind_0_$160 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$160 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                final SubLObject node = function_terms.naut_to_nart(node_var_$166);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link) {
                                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links) {
                                                                            SubLObject iteration_state;
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                    final SubLObject _prev_bind_0_$161 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        SubLObject iteration_state_$171;
                                                                                        for (iteration_state_$171 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$171); iteration_state_$171 = dictionary_contents.do_dictionary_contents_next(iteration_state_$171)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$171);
                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                final SubLObject _prev_bind_0_$162 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    final SubLObject sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                        SubLObject basis_object;
                                                                                                        SubLObject state;
                                                                                                        SubLObject node_vars_link_node;
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            SubLObject csome_list_var = sol;
                                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                                            while (NIL != csome_list_var) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        } else {
                                                                                                            Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$162, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$171);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$161, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                        SubLObject cdolist_list_var_$173;
                                                                        final SubLObject new_list = cdolist_list_var_$173 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        SubLObject generating_fn = NIL;
                                                                        generating_fn = cdolist_list_var_$173.first();
                                                                        while (NIL != cdolist_list_var_$173) {
                                                                            final SubLObject _prev_bind_0_$163 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                final SubLObject sol2;
                                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                if (NIL != set.set_p(sol2)) {
                                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                    SubLObject basis_object2;
                                                                                    SubLObject state2;
                                                                                    SubLObject node_vars_link_node3;
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol2.isList()) {
                                                                                        SubLObject csome_list_var2 = sol2;
                                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                                        while (NIL != csome_list_var2) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$163, thread);
                                                                            }
                                                                            cdolist_list_var_$173 = cdolist_list_var_$173.rest();
                                                                            generating_fn = cdolist_list_var_$173.first();
                                                                        } 
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$160, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$160, thread);
                                                            }
                                                            cdolist_list_var = cdolist_list_var.rest();
                                                            module_var = cdolist_list_var.first();
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$159, thread);
                                                    }
                                                }
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$161, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$159, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$158, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, predicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4_$162, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$161, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$160, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$158, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$157, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$157, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$156, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$164 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$164, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$155, thread);
                        }
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0_$154, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            } finally {
                thread.throwStack.pop();
            }
            if (NIL != error_message) {
                Errors.warn($str141$Error_initializing__S_____S___Der, v_cache, error_message);
                deregister_tva_cache(v_cache, UNPROVIDED);
                Errors.error(error_message);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_4, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }

    public static SubLObject tva_cache_asserted_values(final SubLObject v_cache) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        final SubLObject gather_argnum = invert_binary_argnum(index_argnum);
        final SubLObject inverseP = NIL;
        final SubLObject this_index_arg = (NIL != inverseP) ? index_argnum : gather_argnum;
        final SubLObject total = kb_indexing.num_predicate_extent_index(predicate, UNPROVIDED);
        final SubLObject _prev_bind_0 = $silent_progressP$.currentBinding(thread);
        try {
            $silent_progressP$.bind(tva_cache_silent_progressP(predicate, total, this_index_arg), thread);
            SubLObject sofar = ZERO_INTEGER;
            SubLObject gafs = NIL;
            if (total.isPositive()) {
                final SubLObject pred_var = predicate;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$176 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$177 = NIL;
                                    final SubLObject token_var_$178 = NIL;
                                    while (NIL == done_var_$177) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$178);
                                        final SubLObject valid_$179 = makeBoolean(!token_var_$178.eql(gaf));
                                        if (NIL != valid_$179) {
                                            gafs = cons(gaf, gafs);
                                        }
                                        done_var_$177 = makeBoolean(NIL == valid_$179);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$177 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$177, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$176, thread);
                    }
                }
                final SubLObject _prev_bind_0_$178 = $percent_progress_delayed_mode_seconds$.currentBinding(thread);
                final SubLObject _prev_bind_9 = $percent_progress_delayed_mode_string$.currentBinding(thread);
                final SubLObject _prev_bind_10 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_11 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_12 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_13 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $percent_progress_delayed_mode_seconds$.bind(TWO_INTEGER, thread);
                    $percent_progress_delayed_mode_string$.bind(cconcatenate($$$TVA_Caching_, new SubLObject[]{ format_nil.format_nil_s_no_copy(total), $$$_, format_nil.format_nil_s_no_copy(predicate), $str144$_assertions___ }), thread);
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(cconcatenate($$$TVA_Caching_, new SubLObject[]{ format_nil.format_nil_s_no_copy(total), $$$_, format_nil.format_nil_s_no_copy(predicate), $str144$_assertions___ }));
                        SubLObject cdolist_list_var = gafs;
                        SubLObject gaf2 = NIL;
                        gaf2 = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject value = assertions_high.gaf_arg(gaf2, this_index_arg);
                            tva_cache_store_one_gaf(v_cache, gaf2, value, predicate, inverseP);
                            sofar = add(sofar, ONE_INTEGER);
                            note_percent_progress(sofar, total);
                            cdolist_list_var = cdolist_list_var.rest();
                            gaf2 = cdolist_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$179 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_13, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_12, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_11, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_10, thread);
                    $percent_progress_delayed_mode_string$.rebind(_prev_bind_9, thread);
                    $percent_progress_delayed_mode_seconds$.rebind(_prev_bind_0_$178, thread);
                }
            }
        } finally {
            $silent_progressP$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }

    public static SubLObject tva_cache_relation_all_instance_values(final SubLObject v_cache) {
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject pred_var = $$relationAllInstance;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$183 = NIL;
                        final SubLObject token_var_$184 = NIL;
                        while (NIL == done_var_$183) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$184);
                            final SubLObject valid_$185 = makeBoolean(!token_var_$184.eql(gaf));
                            if (NIL != valid_$185) {
                                tva_cache_add_one_relation_all_instance_gaf(v_cache, gaf);
                            }
                            done_var_$183 = makeBoolean(NIL == valid_$185);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return v_cache;
    }

    public static SubLObject clear_tva_cache_max_instances_to_cache() {
        final SubLObject cs = $tva_cache_max_instances_to_cache_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_tva_cache_max_instances_to_cache() {
        return memoization_state.caching_state_remove_function_results_with_args($tva_cache_max_instances_to_cache_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tva_cache_max_instances_to_cache_internal() {
        return integerDivide(forts.fort_count(), $int$25);
    }

    public static SubLObject tva_cache_max_instances_to_cache() {
        SubLObject caching_state = $tva_cache_max_instances_to_cache_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(TVA_CACHE_MAX_INSTANCES_TO_CACHE, $tva_cache_max_instances_to_cache_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(tva_cache_max_instances_to_cache_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject tva_cache_add_one_relation_all_instance_gaf(final SubLObject v_cache, final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        final SubLObject common_value = assertions_high.gaf_arg3(gaf);
        final SubLObject domain_col = assertions_high.gaf_arg2(gaf);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            if ((NIL != indexed_term_p(domain_col)) && cardinality_estimates.instance_cardinality(domain_col).numLE(tva_cache_max_instances_to_cache())) {
                final SubLObject node_var = domain_col;
                final SubLObject _prev_bind_0_$186 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_1_$187 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$188 = node_var;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$187 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$188 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$188 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$189 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$189 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$190 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$190 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$196 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$188, UNPROVIDED);
                                                while (NIL != node_var_$188) {
                                                    final SubLObject tt_node_var = node_var_$188;
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$191 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$191 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$192 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$200;
                                                                                    for (iteration_state_$200 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$200); iteration_state_$200 = dictionary_contents.do_dictionary_contents_next(iteration_state_$200)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$200);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$193 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject instance;
                                                                                                    SubLObject key;
                                                                                                    SubLObject value;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            key = (index_argnum.eql(ONE_INTEGER)) ? instance : common_value;
                                                                                                            value = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance;
                                                                                                            if (NIL != indexed_term_p(key)) {
                                                                                                                tva_cache_ensure_cache_has_key(v_cache, key);
                                                                                                                tva_cache_note_key_value_supports(v_cache, key, value, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject instance2 = NIL;
                                                                                                        instance2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                final SubLObject key2 = (index_argnum.eql(ONE_INTEGER)) ? instance2 : common_value;
                                                                                                                final SubLObject value2 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance2;
                                                                                                                if (NIL != indexed_term_p(key2)) {
                                                                                                                    tva_cache_ensure_cache_has_key(v_cache, key2);
                                                                                                                    tva_cache_note_key_value_supports(v_cache, key2, value2, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance2, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            instance2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$193, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$200);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$192, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = NIL;
                                                                        SubLObject mt2 = NIL;
                                                                        SubLObject tv2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list150);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list150);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list150);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$194 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$195 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject instance;
                                                                                                SubLObject key;
                                                                                                SubLObject value;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        key = (index_argnum.eql(ONE_INTEGER)) ? instance : common_value;
                                                                                                        value = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance;
                                                                                                        if (NIL != indexed_term_p(key)) {
                                                                                                            tva_cache_ensure_cache_has_key(v_cache, key);
                                                                                                            tva_cache_note_key_value_supports(v_cache, key, value, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$204 = sol;
                                                                                                    SubLObject instance2 = NIL;
                                                                                                    instance2 = csome_list_var_$204.first();
                                                                                                    while (NIL != csome_list_var_$204) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            final SubLObject key2 = (index_argnum.eql(ONE_INTEGER)) ? instance2 : common_value;
                                                                                                            final SubLObject value2 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance2;
                                                                                                            if (NIL != indexed_term_p(key2)) {
                                                                                                                tva_cache_ensure_cache_has_key(v_cache, key2);
                                                                                                                tva_cache_note_key_value_supports(v_cache, key2, value2, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance2, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$204 = csome_list_var_$204.rest();
                                                                                                        instance2 = csome_list_var_$204.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$195, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$194, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list150);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$205;
                                                                    final SubLObject new_list = cdolist_list_var_$205 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$205.first();
                                                                    while (NIL != cdolist_list_var_$205) {
                                                                        final SubLObject _prev_bind_0_$196 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject instance3;
                                                                                SubLObject key3;
                                                                                SubLObject value3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, instance3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        key3 = (index_argnum.eql(ONE_INTEGER)) ? instance3 : common_value;
                                                                                        value3 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance3;
                                                                                        if (NIL != indexed_term_p(key3)) {
                                                                                            tva_cache_ensure_cache_has_key(v_cache, key3);
                                                                                            tva_cache_note_key_value_supports(v_cache, key3, value3, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance3, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var3 = sol2;
                                                                                    SubLObject instance4 = NIL;
                                                                                    instance4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            final SubLObject key4 = (index_argnum.eql(ONE_INTEGER)) ? instance4 : common_value;
                                                                                            final SubLObject value4 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance4;
                                                                                            if (NIL != indexed_term_p(key4)) {
                                                                                                tva_cache_ensure_cache_has_key(v_cache, key4);
                                                                                                tva_cache_note_key_value_supports(v_cache, key4, value4, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance4, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        instance4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$196, thread);
                                                                        }
                                                                        cdolist_list_var_$205 = cdolist_list_var_$205.rest();
                                                                        generating_fn = cdolist_list_var_$205.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$191, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$191, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject module_var2 = NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$197 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$192 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$188);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$198 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$201;
                                                                                    for (iteration_state_$201 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$201); iteration_state_$201 = dictionary_contents.do_dictionary_contents_next(iteration_state_$201)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$201);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$199 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        SubLObject csome_list_var4 = sol3;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                        while (NIL != csome_list_var4) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$199, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$201);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$198, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$206;
                                                                    final SubLObject new_list2 = cdolist_list_var_$206 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$206.first();
                                                                    while (NIL != cdolist_list_var_$206) {
                                                                        final SubLObject _prev_bind_0_$200 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            final SubLObject sol4;
                                                                            final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                SubLObject basis_object4;
                                                                                SubLObject state4;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    SubLObject csome_list_var5 = sol4;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                    while (NIL != csome_list_var5) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$200, thread);
                                                                        }
                                                                        cdolist_list_var_$206 = cdolist_list_var_$206.rest();
                                                                        generating_fn2 = cdolist_list_var_$206.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$192, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$197, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    } 
                                                    node_var_$188 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$196, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$190, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$190, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$189, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$189, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$188, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$188, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$201 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$201, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$187, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$202 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$202, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$187, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$186, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }

    public static SubLObject tva_cache_add_relation_instance_all_gaf(final SubLObject assertion) {
        SubLObject cdolist_list_var = tva_caches_for_predicate(assertions_high.gaf_arg1(assertion));
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            tva_cache_add_one_relation_instance_all_gaf(v_cache, assertion);
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        return assertion;
    }

    public static SubLObject tva_cache_add_relation_all_instance_gaf(final SubLObject assertion) {
        SubLObject cdolist_list_var = tva_caches_for_predicate(assertions_high.gaf_arg1(assertion));
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            tva_cache_add_one_relation_all_instance_gaf(v_cache, assertion);
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        return assertion;
    }

    public static SubLObject tva_cache_remove_relation_all_instance_gaf(final SubLObject assertion) {
        SubLObject cdolist_list_var = tva_caches_for_predicate(assertions_high.gaf_arg1(assertion));
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            tva_cache_remove_one_relation_all_instance_gaf(v_cache, assertion);
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        return assertion;
    }

    public static SubLObject tva_cache_remove_one_relation_all_instance_gaf(final SubLObject v_cache, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        final SubLObject domain_col = assertions_high.gaf_arg2(assertion);
        final SubLObject common_value = assertions_high.gaf_arg3(assertion);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            final SubLObject node_var = domain_col;
            final SubLObject _prev_bind_0_$216 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$217 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$218 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$217 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$218 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$218 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$219 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$219 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$220 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$220 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$226 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$218, UNPROVIDED);
                                            while (NIL != node_var_$218) {
                                                final SubLObject tt_node_var = node_var_$218;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$221 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$221 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$222 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$230;
                                                                                for (iteration_state_$230 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$230); iteration_state_$230 = dictionary_contents.do_dictionary_contents_next(iteration_state_$230)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$230);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$223 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject instance;
                                                                                                SubLObject key;
                                                                                                SubLObject value;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        key = (index_argnum.eql(ONE_INTEGER)) ? instance : common_value;
                                                                                                        value = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance;
                                                                                                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), key, value, assertion);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject instance2 = NIL;
                                                                                                    instance2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            final SubLObject key2 = (index_argnum.eql(ONE_INTEGER)) ? instance2 : common_value;
                                                                                                            final SubLObject value2 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance2;
                                                                                                            tva_cache_remove_key_value_support(tva_cache_map(v_cache), key2, value2, assertion);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        instance2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$223, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$230);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$222, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list150);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list150);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list150);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$224 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$225 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject instance;
                                                                                            SubLObject key;
                                                                                            SubLObject value;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    key = (index_argnum.eql(ONE_INTEGER)) ? instance : common_value;
                                                                                                    value = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance;
                                                                                                    tva_cache_remove_key_value_support(tva_cache_map(v_cache), key, value, assertion);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$234 = sol;
                                                                                                SubLObject instance2 = NIL;
                                                                                                instance2 = csome_list_var_$234.first();
                                                                                                while (NIL != csome_list_var_$234) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        final SubLObject key2 = (index_argnum.eql(ONE_INTEGER)) ? instance2 : common_value;
                                                                                                        final SubLObject value2 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance2;
                                                                                                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), key2, value2, assertion);
                                                                                                    }
                                                                                                    csome_list_var_$234 = csome_list_var_$234.rest();
                                                                                                    instance2 = csome_list_var_$234.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$225, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$224, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list150);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$235;
                                                                final SubLObject new_list = cdolist_list_var_$235 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$235.first();
                                                                while (NIL != cdolist_list_var_$235) {
                                                                    final SubLObject _prev_bind_0_$226 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject instance3;
                                                                            SubLObject key3;
                                                                            SubLObject value3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, instance3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    key3 = (index_argnum.eql(ONE_INTEGER)) ? instance3 : common_value;
                                                                                    value3 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance3;
                                                                                    tva_cache_remove_key_value_support(tva_cache_map(v_cache), key3, value3, assertion);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject instance4 = NIL;
                                                                                instance4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        final SubLObject key4 = (index_argnum.eql(ONE_INTEGER)) ? instance4 : common_value;
                                                                                        final SubLObject value4 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance4;
                                                                                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), key4, value4, assertion);
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    instance4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$226, thread);
                                                                    }
                                                                    cdolist_list_var_$235 = cdolist_list_var_$235.rest();
                                                                    generating_fn = cdolist_list_var_$235.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$221, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$221, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$227 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$222 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$218);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$228 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$231;
                                                                                for (iteration_state_$231 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$231); iteration_state_$231 = dictionary_contents.do_dictionary_contents_next(iteration_state_$231)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$231);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$229 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (NIL != csome_list_var4) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$229, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$231);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$228, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$236;
                                                                final SubLObject new_list2 = cdolist_list_var_$236 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$236.first();
                                                                while (NIL != cdolist_list_var_$236) {
                                                                    final SubLObject _prev_bind_0_$230 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (NIL != csome_list_var5) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$230, thread);
                                                                    }
                                                                    cdolist_list_var_$236 = cdolist_list_var_$236.rest();
                                                                    generating_fn2 = cdolist_list_var_$236.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$222, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$227, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$218 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$226, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$220, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$220, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$219, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$219, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$218, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$218, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$231 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$231, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$217, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$232 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$232, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$217, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$216, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject tva_cache_remove_relation_instance_all_gaf(final SubLObject assertion) {
        SubLObject cdolist_list_var = tva_caches_for_predicate(assertions_high.gaf_arg1(assertion));
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            tva_cache_remove_one_relation_instance_all_gaf(v_cache, assertion);
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        return assertion;
    }

    public static SubLObject tva_cache_remove_one_relation_instance_all_gaf(final SubLObject v_cache, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        final SubLObject common_value = assertions_high.gaf_arg2(assertion);
        final SubLObject domain_col = assertions_high.gaf_arg3(assertion);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            final SubLObject node_var = domain_col;
            final SubLObject _prev_bind_0_$246 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$247 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$248 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$247 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$248 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$248 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$249 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$249 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$250 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$250 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$256 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$248, UNPROVIDED);
                                            while (NIL != node_var_$248) {
                                                final SubLObject tt_node_var = node_var_$248;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$251 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$251 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$252 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$260;
                                                                                for (iteration_state_$260 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$260); iteration_state_$260 = dictionary_contents.do_dictionary_contents_next(iteration_state_$260)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$260);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$253 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject instance;
                                                                                                SubLObject key;
                                                                                                SubLObject value;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        key = (index_argnum.eql(ONE_INTEGER)) ? instance : common_value;
                                                                                                        value = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance;
                                                                                                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), key, value, assertion);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject instance2 = NIL;
                                                                                                    instance2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            final SubLObject key2 = (index_argnum.eql(ONE_INTEGER)) ? instance2 : common_value;
                                                                                                            final SubLObject value2 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance2;
                                                                                                            tva_cache_remove_key_value_support(tva_cache_map(v_cache), key2, value2, assertion);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        instance2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$253, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$260);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$252, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list150);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list150);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list150);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$254 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$255 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject instance;
                                                                                            SubLObject key;
                                                                                            SubLObject value;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    key = (index_argnum.eql(ONE_INTEGER)) ? instance : common_value;
                                                                                                    value = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance;
                                                                                                    tva_cache_remove_key_value_support(tva_cache_map(v_cache), key, value, assertion);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$264 = sol;
                                                                                                SubLObject instance2 = NIL;
                                                                                                instance2 = csome_list_var_$264.first();
                                                                                                while (NIL != csome_list_var_$264) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        final SubLObject key2 = (index_argnum.eql(ONE_INTEGER)) ? instance2 : common_value;
                                                                                                        final SubLObject value2 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance2;
                                                                                                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), key2, value2, assertion);
                                                                                                    }
                                                                                                    csome_list_var_$264 = csome_list_var_$264.rest();
                                                                                                    instance2 = csome_list_var_$264.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$255, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$254, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list150);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$265;
                                                                final SubLObject new_list = cdolist_list_var_$265 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$265.first();
                                                                while (NIL != cdolist_list_var_$265) {
                                                                    final SubLObject _prev_bind_0_$256 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject instance3;
                                                                            SubLObject key3;
                                                                            SubLObject value3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, instance3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    key3 = (index_argnum.eql(ONE_INTEGER)) ? instance3 : common_value;
                                                                                    value3 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance3;
                                                                                    tva_cache_remove_key_value_support(tva_cache_map(v_cache), key3, value3, assertion);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject instance4 = NIL;
                                                                                instance4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        final SubLObject key4 = (index_argnum.eql(ONE_INTEGER)) ? instance4 : common_value;
                                                                                        final SubLObject value4 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance4;
                                                                                        tva_cache_remove_key_value_support(tva_cache_map(v_cache), key4, value4, assertion);
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    instance4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$256, thread);
                                                                    }
                                                                    cdolist_list_var_$265 = cdolist_list_var_$265.rest();
                                                                    generating_fn = cdolist_list_var_$265.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$251, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$251, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$257 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$252 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$248);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$258 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$261;
                                                                                for (iteration_state_$261 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$261); iteration_state_$261 = dictionary_contents.do_dictionary_contents_next(iteration_state_$261)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$261);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$259 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (NIL != csome_list_var4) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$259, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$261);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$258, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$266;
                                                                final SubLObject new_list2 = cdolist_list_var_$266 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$266.first();
                                                                while (NIL != cdolist_list_var_$266) {
                                                                    final SubLObject _prev_bind_0_$260 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (NIL != csome_list_var5) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$260, thread);
                                                                    }
                                                                    cdolist_list_var_$266 = cdolist_list_var_$266.rest();
                                                                    generating_fn2 = cdolist_list_var_$266.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$252, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$257, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$248 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$256, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$250, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$250, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$249, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$249, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$248, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$248, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$261 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$261, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$247, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$262 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$262, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$247, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$246, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject tva_cache_relation_instance_all_values(final SubLObject v_cache) {
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject pred_var = $$relationInstanceAll;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(predicate, ONE_INTEGER, pred_var)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(predicate, ONE_INTEGER, pred_var);
            SubLObject done_var = NIL;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$276 = NIL;
                        final SubLObject token_var_$277 = NIL;
                        while (NIL == done_var_$276) {
                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$277);
                            final SubLObject valid_$278 = makeBoolean(!token_var_$277.eql(gaf));
                            if (NIL != valid_$278) {
                                tva_cache_add_one_relation_instance_all_gaf(v_cache, gaf);
                            }
                            done_var_$276 = makeBoolean(NIL == valid_$278);
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                        try {
                            bind($is_thread_performing_cleanupP$, T);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                        }
                    }
                }
                done_var = makeBoolean(NIL == valid);
            } 
        }
        return v_cache;
    }

    public static SubLObject tva_cache_add_one_relation_instance_all_gaf(final SubLObject v_cache, final SubLObject gaf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject common_value = assertions_high.gaf_arg2(gaf);
        final SubLObject index_argnum = tva_cache_index_argnum(v_cache);
        final SubLObject domain_col = assertions_high.gaf_arg3(gaf);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            if ((NIL != indexed_term_p(domain_col)) && cardinality_estimates.instance_cardinality(domain_col).numLE(tva_cache_max_instances_to_cache())) {
                final SubLObject node_var = domain_col;
                final SubLObject _prev_bind_0_$279 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                final SubLObject _prev_bind_1_$280 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                try {
                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                    try {
                        SubLObject node_var_$281 = node_var;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$280 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$281 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$281 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$282 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$282 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$283 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$283 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$289 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$281, UNPROVIDED);
                                                while (NIL != node_var_$281) {
                                                    final SubLObject tt_node_var = node_var_$281;
                                                    SubLObject cdolist_list_var;
                                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                    SubLObject module_var = NIL;
                                                    module_var = cdolist_list_var.first();
                                                    while (NIL != cdolist_list_var) {
                                                        final SubLObject _prev_bind_0_$284 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$284 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        SubLObject iteration_state;
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                final SubLObject _prev_bind_0_$285 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                    SubLObject iteration_state_$293;
                                                                                    for (iteration_state_$293 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$293); iteration_state_$293 = dictionary_contents.do_dictionary_contents_next(iteration_state_$293)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$293);
                                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            final SubLObject _prev_bind_0_$286 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                final SubLObject sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject instance;
                                                                                                    SubLObject key;
                                                                                                    SubLObject value;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            key = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance;
                                                                                                            value = (index_argnum.eql(ONE_INTEGER)) ? instance : common_value;
                                                                                                            if (NIL != indexed_term_p(key)) {
                                                                                                                tva_cache_ensure_cache_has_key(v_cache, key);
                                                                                                                tva_cache_note_key_value_supports(v_cache, key, value, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var = sol;
                                                                                                        SubLObject instance2 = NIL;
                                                                                                        instance2 = csome_list_var.first();
                                                                                                        while (NIL != csome_list_var) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                final SubLObject key2 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance2;
                                                                                                                final SubLObject value2 = (index_argnum.eql(ONE_INTEGER)) ? instance2 : common_value;
                                                                                                                if (NIL != indexed_term_p(key2)) {
                                                                                                                    tva_cache_ensure_cache_has_key(v_cache, key2);
                                                                                                                    tva_cache_note_key_value_supports(v_cache, key2, value2, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance2, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var = csome_list_var.rest();
                                                                                                            instance2 = csome_list_var.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$286, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$293);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$285, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                                if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                    SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                    SubLObject instance_tuple = NIL;
                                                                    instance_tuple = csome_list_var2.first();
                                                                    while (NIL != csome_list_var2) {
                                                                        SubLObject current;
                                                                        final SubLObject datum = current = instance_tuple;
                                                                        SubLObject link_node = NIL;
                                                                        SubLObject mt2 = NIL;
                                                                        SubLObject tv2 = NIL;
                                                                        destructuring_bind_must_consp(current, datum, $list150);
                                                                        link_node = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list150);
                                                                        mt2 = current.first();
                                                                        current = current.rest();
                                                                        destructuring_bind_must_consp(current, datum, $list150);
                                                                        tv2 = current.first();
                                                                        current = current.rest();
                                                                        if (NIL == current) {
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                final SubLObject _prev_bind_0_$287 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$288 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol;
                                                                                            final SubLObject link_nodes2 = sol = list(link_node);
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject instance;
                                                                                                SubLObject key;
                                                                                                SubLObject value;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    instance = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        key = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance;
                                                                                                        value = (index_argnum.eql(ONE_INTEGER)) ? instance : common_value;
                                                                                                        if (NIL != indexed_term_p(key)) {
                                                                                                            tva_cache_ensure_cache_has_key(v_cache, key);
                                                                                                            tva_cache_note_key_value_supports(v_cache, key, value, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var_$297 = sol;
                                                                                                    SubLObject instance2 = NIL;
                                                                                                    instance2 = csome_list_var_$297.first();
                                                                                                    while (NIL != csome_list_var_$297) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            final SubLObject key2 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance2;
                                                                                                            final SubLObject value2 = (index_argnum.eql(ONE_INTEGER)) ? instance2 : common_value;
                                                                                                            if (NIL != indexed_term_p(key2)) {
                                                                                                                tva_cache_ensure_cache_has_key(v_cache, key2);
                                                                                                                tva_cache_note_key_value_supports(v_cache, key2, value2, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance2, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var_$297 = csome_list_var_$297.rest();
                                                                                                        instance2 = csome_list_var_$297.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$288, thread);
                                                                                        }
                                                                                    }
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$287, thread);
                                                                                }
                                                                            }
                                                                        } else {
                                                                            cdestructuring_bind_error(datum, $list150);
                                                                        }
                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                        instance_tuple = csome_list_var2.first();
                                                                    } 
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$298;
                                                                    final SubLObject new_list = cdolist_list_var_$298 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn = NIL;
                                                                    generating_fn = cdolist_list_var_$298.first();
                                                                    while (NIL != cdolist_list_var_$298) {
                                                                        final SubLObject _prev_bind_0_$289 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            final SubLObject sol2;
                                                                            final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                SubLObject basis_object2;
                                                                                SubLObject state2;
                                                                                SubLObject instance3;
                                                                                SubLObject key3;
                                                                                SubLObject value3;
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    instance3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, instance3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(instance3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        key3 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance3;
                                                                                        value3 = (index_argnum.eql(ONE_INTEGER)) ? instance3 : common_value;
                                                                                        if (NIL != indexed_term_p(key3)) {
                                                                                            tva_cache_ensure_cache_has_key(v_cache, key3);
                                                                                            tva_cache_note_key_value_supports(v_cache, key3, value3, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance3, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    SubLObject csome_list_var3 = sol2;
                                                                                    SubLObject instance4 = NIL;
                                                                                    instance4 = csome_list_var3.first();
                                                                                    while (NIL != csome_list_var3) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(instance4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            final SubLObject key4 = (index_argnum.eql(ONE_INTEGER)) ? common_value : instance4;
                                                                                            final SubLObject value4 = (index_argnum.eql(ONE_INTEGER)) ? instance4 : common_value;
                                                                                            if (NIL != indexed_term_p(key4)) {
                                                                                                tva_cache_ensure_cache_has_key(v_cache, key4);
                                                                                                tva_cache_note_key_value_supports(v_cache, key4, value4, list(make_tva_cache_complex_support(list(gaf, make_tva_cache_hl_support(list($$isa, instance4, domain_col), UNPROVIDED, UNPROVIDED)))));
                                                                                            }
                                                                                        }
                                                                                        csome_list_var3 = csome_list_var3.rest();
                                                                                        instance4 = csome_list_var3.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$289, thread);
                                                                        }
                                                                        cdolist_list_var_$298 = cdolist_list_var_$298.rest();
                                                                        generating_fn = cdolist_list_var_$298.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$284, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$284, thread);
                                                        }
                                                        cdolist_list_var = cdolist_list_var.rest();
                                                        module_var = cdolist_list_var.first();
                                                    } 
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                    SubLObject module_var2 = NIL;
                                                    module_var2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        final SubLObject _prev_bind_0_$290 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        final SubLObject _prev_bind_1_$285 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            final SubLObject node2 = function_terms.naut_to_nart(node_var_$281);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link2) {
                                                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links2) {
                                                                        SubLObject iteration_state2;
                                                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                                final SubLObject _prev_bind_0_$291 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                    SubLObject iteration_state_$294;
                                                                                    for (iteration_state_$294 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$294); iteration_state_$294 = dictionary_contents.do_dictionary_contents_next(iteration_state_$294)) {
                                                                                        thread.resetMultipleValues();
                                                                                        final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$294);
                                                                                        final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$292 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol3 = link_nodes4;
                                                                                                if (NIL != set.set_p(sol3)) {
                                                                                                    final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                    SubLObject basis_object3;
                                                                                                    SubLObject state3;
                                                                                                    SubLObject node_vars_link_node;
                                                                                                    for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol3.isList()) {
                                                                                                        SubLObject csome_list_var4 = sol3;
                                                                                                        SubLObject node_vars_link_node2 = NIL;
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                        while (NIL != csome_list_var4) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                            }
                                                                                                            csome_list_var4 = csome_list_var4.rest();
                                                                                                            node_vars_link_node2 = csome_list_var4.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$292, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$294);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$291, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                    SubLObject cdolist_list_var_$299;
                                                                    final SubLObject new_list2 = cdolist_list_var_$299 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    SubLObject generating_fn2 = NIL;
                                                                    generating_fn2 = cdolist_list_var_$299.first();
                                                                    while (NIL != cdolist_list_var_$299) {
                                                                        final SubLObject _prev_bind_0_$293 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                            final SubLObject sol4;
                                                                            final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                            if (NIL != set.set_p(sol4)) {
                                                                                final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                                SubLObject basis_object4;
                                                                                SubLObject state4;
                                                                                SubLObject node_vars_link_node3;
                                                                                for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol4.isList()) {
                                                                                    SubLObject csome_list_var5 = sol4;
                                                                                    SubLObject node_vars_link_node4 = NIL;
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                    while (NIL != csome_list_var5) {
                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                        }
                                                                                        csome_list_var5 = csome_list_var5.rest();
                                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                                    } 
                                                                                } else {
                                                                                    Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$293, thread);
                                                                        }
                                                                        cdolist_list_var_$299 = cdolist_list_var_$299.rest();
                                                                        generating_fn2 = cdolist_list_var_$299.first();
                                                                    } 
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$285, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$290, thread);
                                                        }
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        module_var2 = cdolist_list_var2.first();
                                                    } 
                                                    node_var_$281 = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$289, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$283, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$283, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$282, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$282, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$281, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$281, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$294 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$294, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$280, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$295 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$295, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$280, thread);
                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$279, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }

    public static SubLObject tva_cache_silent_progressP(final SubLObject cache_pred, final SubLObject pred_extent_count, final SubLObject index_arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $silent_progressP$.getDynamicValue(thread);
    }

    public static SubLObject tva_cache_store_one_gaf(final SubLObject v_cache, final SubLObject gaf, final SubLObject value, final SubLObject spec_pred, final SubLObject inverseP) {
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject index_arg = tva_cache_index_argnum(v_cache);
        final SubLObject gather_arg = invert_binary_argnum(index_arg);
        final SubLObject this_index_arg = (NIL != inverseP) ? index_arg : gather_arg;
        final SubLObject this_gather_arg = invert_binary_argnum(this_index_arg);
        final SubLObject spec_predP = makeBoolean((NIL == inverseP) && (!spec_pred.eql(predicate)));
        final SubLObject key = assertions_high.gaf_arg(gaf, this_gather_arg);
        final SubLObject supports = list(make_tva_cache_support(gaf, inverseP, spec_predP, NIL));
        if (NIL != indexed_term_p(key)) {
            tva_cache_ensure_cache_has_key(v_cache, key);
            tva_cache_note_key_value_supports(v_cache, key, value, supports);
        }
        return v_cache;
    }

    public static SubLObject tva_cache_store_one_value(final SubLObject v_cache, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject predicate = tva_cache_pred(v_cache);
        final SubLObject index_arg = tva_cache_index_argnum(v_cache);
        final SubLObject gather_arg = invert_binary_argnum(index_arg);
        final SubLObject node_var = predicate;
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = $$True_JustificationTruth;
                final SubLObject _prev_bind_0_$309 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$310 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$311 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(predicate, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$311 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$312 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$314 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                for (node_and_predicate_mode = list(predicate, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$315 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject spec_pred = node_var_$315;
                                    final SubLObject _prev_bind_0_$312 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inverseP = predicate_mode;
                                        final SubLObject this_index_arg = (NIL != inverseP) ? index_arg : gather_arg;
                                        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(value, spec_pred, this_index_arg, $TRUE);
                                        SubLObject gaf = NIL;
                                        gaf = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            tva_cache_store_one_gaf(v_cache, gaf, value, spec_pred, inverseP);
                                            cdolist_list_var = cdolist_list_var.rest();
                                            gaf = cdolist_list_var.first();
                                        } 
                                        SubLObject cdolist_list_var2;
                                        final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            final SubLObject _prev_bind_0_$313 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$313 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$315);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$314 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$320;
                                                                        for (iteration_state_$320 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$320); iteration_state_$320 = dictionary_contents.do_dictionary_contents_next(iteration_state_$320)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$320);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$315 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$315, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$320);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$314, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$322;
                                                        final SubLObject new_list = cdolist_list_var_$322 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$322.first();
                                                        while (NIL != cdolist_list_var_$322) {
                                                            final SubLObject _prev_bind_0_$316 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$316, thread);
                                                            }
                                                            cdolist_list_var_$322 = cdolist_list_var_$322.rest();
                                                            generating_fn = cdolist_list_var_$322.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$313, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$313, thread);
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            module_var = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$312, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$314, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$312, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$311, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, predicate, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$311, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$310, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$309, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$317 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$317, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return v_cache;
    }

    public static SubLObject make_tva_cache_complex_support(final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject simple_supports = NIL;
        if (NIL != list_utilities.tree_find($COMPLEX, supports, UNPROVIDED, UNPROVIDED)) {
            SubLObject cdolist_list_var = supports;
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$325 = tva_cache_support_component_supports(support);
                SubLObject simple_support = NIL;
                simple_support = cdolist_list_var_$325.first();
                while (NIL != cdolist_list_var_$325) {
                    simple_supports = cons(simple_support, simple_supports);
                    cdolist_list_var_$325 = cdolist_list_var_$325.rest();
                    simple_support = cdolist_list_var_$325.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != list_utilities.tree_find($COMPLEX, simple_supports, UNPROVIDED, UNPROVIDED))) {
                Errors.error($str153$Complex_TVA_cache_support_in__S, simple_supports);
            }
        } else {
            simple_supports = supports;
        }
        simple_supports = list_utilities.fast_delete_duplicates(simple_supports, $sym108$TVA_CACHE_SUPPORT_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return bq_cons($COMPLEX, simple_supports);
    }

    public static SubLObject tva_cache_support_component_supports(final SubLObject support) {
        SubLObject simple_supports = NIL;
        if (NIL != tva_cache_support_complex_p(support)) {
            SubLObject cdolist_list_var = support.rest();
            SubLObject sub_support = NIL;
            sub_support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$326 = tva_cache_support_component_supports(sub_support);
                SubLObject component_support = NIL;
                component_support = cdolist_list_var_$326.first();
                while (NIL != cdolist_list_var_$326) {
                    simple_supports = cons(component_support, simple_supports);
                    cdolist_list_var_$326 = cdolist_list_var_$326.rest();
                    component_support = cdolist_list_var_$326.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                sub_support = cdolist_list_var.first();
            } 
        } else
            if (NIL == member(support, simple_supports, $sym108$TVA_CACHE_SUPPORT_EQUAL_, symbol_function(IDENTITY))) {
                simple_supports = cons(support, simple_supports);
            }

        return list_utilities.fast_delete_duplicates(simple_supports, $sym108$TVA_CACHE_SUPPORT_EQUAL_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tva_cache_support_complex_p(final SubLObject support) {
        return pattern_match.tree_matches_pattern(support, $list154);
    }

    public static SubLObject tva_cache_complex_support_equalP(final SubLObject support1, final SubLObject support2) {
        return list_utilities.sets_equalP(support1.rest(), support2.rest(), symbol_function($sym108$TVA_CACHE_SUPPORT_EQUAL_));
    }

    public static SubLObject make_tva_cache_support(final SubLObject gaf, final SubLObject inverseP, final SubLObject spec_predP, final SubLObject original_predicate) {
        if (NIL != inverseP) {
            return listS($INVERSE, gaf, NIL != original_predicate ? list(original_predicate) : NIL);
        }
        if (NIL != spec_predP) {
            return listS($SPEC_PRED, gaf, NIL != original_predicate ? list(original_predicate) : NIL);
        }
        return gaf;
    }

    public static SubLObject tva_cache_ensure_cache_has_key(final SubLObject v_cache, final SubLObject key) {
        if (NIL == tva_cache_has_keyP(v_cache, key)) {
            tva_cache_add_key(v_cache, key);
        }
        return tva_cache_entry_for_key(v_cache, key).rest();
    }

    public static SubLObject tva_cache_add_key(final SubLObject v_cache, final SubLObject key) {
        final SubLObject v_1_2pred_gafs = tva_cache_tva_pred_gafs(v_cache);
        final SubLObject v_2_1pred_gafs = tva_cache_tvai_pred_gafs(v_cache);
        final SubLObject cache_map = tva_cache_map(v_cache);
        map_utilities.map_put(cache_map, key, new_tva_cache_entry());
        SubLObject cdolist_list_var = v_1_2pred_gafs;
        SubLObject v_1_2pred_gaf = NIL;
        v_1_2pred_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            tva_cache_note_implicit_keys_from_trans_gaf(v_cache, key, v_1_2pred_gaf, ONE_INTEGER, TWO_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            v_1_2pred_gaf = cdolist_list_var.first();
        } 
        cdolist_list_var = v_2_1pred_gafs;
        SubLObject v_2_1pred_gaf = NIL;
        v_2_1pred_gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            tva_cache_note_implicit_keys_from_trans_gaf(v_cache, key, v_2_1pred_gaf, TWO_INTEGER, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            v_2_1pred_gaf = cdolist_list_var.first();
        } 
        return v_cache;
    }

    public static SubLObject tva_cache_note_implicit_keys_from_trans_gaf(final SubLObject v_cache, final SubLObject key, final SubLObject pred_gaf, SubLObject index_arg, SubLObject gather_arg) {
        if (index_arg == UNPROVIDED) {
            index_arg = NIL;
        }
        if (gather_arg == UNPROVIDED) {
            gather_arg = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != indexed_term_p(key)) && tva_cache_index_argnum(v_cache).eql(assertions_high.gaf_arg3(pred_gaf))) {
            final SubLObject implicit_keys = tva_cache_get_implicit_terms(key, pred_gaf, index_arg, gather_arg);
            final SubLObject iterator = map_utilities.new_map_iterator(implicit_keys);
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject implicit_key = NIL;
                    SubLObject supports = NIL;
                    destructuring_bind_must_consp(current, datum, $list155);
                    implicit_key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list155);
                    supports = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        if (NIL != indexed_term_p(implicit_key)) {
                            tva_cache_ensure_cache_has_key(v_cache, implicit_key);
                        }
                        tva_cache_note_implicit_key_supports(v_cache, key, implicit_key, supports);
                    } else {
                        cdestructuring_bind_error(datum, $list155);
                    }
                }
            }
            return implicit_keys;
        }
        return NIL;
    }

    public static SubLObject tva_cache_get_implicit_terms(final SubLObject v_term, final SubLObject pred_gaf, final SubLObject index_arg, final SubLObject gather_arg) {
        assert NIL != indexed_term_p(v_term) : "kb_indexing_datastructures.indexed_term_p(v_term) " + "CommonSymbols.NIL != kb_indexing_datastructures.indexed_term_p(v_term) " + v_term;
        final SubLObject pred = tva_cache_tva_pred_from_support(pred_gaf);
        final SubLObject supported_terms = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        map_utilities.map_put(supported_terms, $TOP, v_term);
        tva_cache_get_implicit_terms_internal(v_term, pred, index_arg, gather_arg, supported_terms, list(pred_gaf));
        map_utilities.map_remove(supported_terms, $TOP);
        return supported_terms;
    }

    public static SubLObject tva_cache_get_implicit_terms_internal(final SubLObject v_term, final SubLObject pred, final SubLObject index_arg, final SubLObject gather_arg, final SubLObject supported_terms, SubLObject supports_to_here) {
        if (supports_to_here == UNPROVIDED) {
            supports_to_here = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject top_term = map_utilities.map_get_without_values(supported_terms, $TOP, UNPROVIDED);
        final SubLObject deck_type = $QUEUE;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        SubLObject node_and_predicate_mode = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = $$True_JustificationTruth;
                final SubLObject _prev_bind_0_$327 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql($ERROR)) {
                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (pcase_var.eql($CERROR)) {
                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($WARN)) {
                                    Errors.warn($str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                } else {
                                    Errors.warn($str70$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                    Errors.cerror($$$continue_anyway, $str65$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                }


                    }
                    final SubLObject _prev_bind_0_$328 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$329 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pred, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                            final SubLObject _prev_bind_0_$329 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$330 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$332 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(pred, UNPROVIDED);
                                for (node_and_predicate_mode = list(pred, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                    final SubLObject node_var_$333 = node_and_predicate_mode.first();
                                    final SubLObject predicate_mode = second(node_and_predicate_mode);
                                    final SubLObject spec_pred = node_var_$333;
                                    final SubLObject _prev_bind_0_$330 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                        final SubLObject inverseP = predicate_mode;
                                        final SubLObject this_index_arg = (NIL != inverseP) ? gather_arg : index_arg;
                                        final SubLObject this_gather_arg = invert_binary_argnum(this_index_arg);
                                        final SubLObject spec_predP = makeBoolean((NIL == inverseP) && (!spec_pred.eql(pred)));
                                        SubLObject cdolist_list_var = kb_mapping_utilities.pred_value_gafs(v_term, spec_pred, this_index_arg, $TRUE);
                                        SubLObject gaf = NIL;
                                        gaf = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            final SubLObject implicit_term = assertions_high.gaf_arg(gaf, this_gather_arg);
                                            if ((!implicit_term.equal(top_term)) && (NIL == map_utilities.map_has_keyP(supported_terms, implicit_term))) {
                                                final SubLObject this_support = make_tva_cache_support(gaf, inverseP, spec_predP, pred);
                                                final SubLObject complex_support = make_tva_cache_complex_support(bq_cons(this_support, supports_to_here));
                                                if (!implicit_term.equal(v_term)) {
                                                    map_utilities.map_push(supported_terms, implicit_term, complex_support);
                                                    tva_cache_get_implicit_terms_internal(implicit_term, pred, index_arg, gather_arg, supported_terms, cons(this_support, supports_to_here));
                                                }
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            gaf = cdolist_list_var.first();
                                        } 
                                        SubLObject cdolist_list_var2;
                                        final SubLObject accessible_modules = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                        SubLObject module_var = NIL;
                                        module_var = cdolist_list_var2.first();
                                        while (NIL != cdolist_list_var2) {
                                            final SubLObject _prev_bind_0_$331 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$331 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                final SubLObject node = function_terms.naut_to_nart(node_var_$333);
                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                    final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                    if (NIL != d_link) {
                                                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != mt_links) {
                                                            SubLObject iteration_state;
                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                thread.resetMultipleValues();
                                                                final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                final SubLObject tv_links = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                    final SubLObject _prev_bind_0_$332 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                        SubLObject iteration_state_$338;
                                                                        for (iteration_state_$338 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$338); iteration_state_$338 = dictionary_contents.do_dictionary_contents_next(iteration_state_$338)) {
                                                                            thread.resetMultipleValues();
                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$338);
                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                final SubLObject _prev_bind_0_$333 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                    final SubLObject sol = link_nodes;
                                                                                    if (NIL != set.set_p(sol)) {
                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                        SubLObject basis_object;
                                                                                        SubLObject state;
                                                                                        SubLObject node_vars_link_node;
                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                deck.deck_push(list(node_vars_link_node, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol.isList()) {
                                                                                            SubLObject csome_list_var = sol;
                                                                                            SubLObject node_vars_link_node2 = NIL;
                                                                                            node_vars_link_node2 = csome_list_var.first();
                                                                                            while (NIL != csome_list_var) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                    deck.deck_push(list(node_vars_link_node2, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                                                }
                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                node_vars_link_node2 = csome_list_var.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$333, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$338);
                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$332, thread);
                                                                    }
                                                                }
                                                            }
                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                        }
                                                    } else {
                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str72$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                } else
                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                        SubLObject cdolist_list_var_$340;
                                                        final SubLObject new_list = cdolist_list_var_$340 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        SubLObject generating_fn = NIL;
                                                        generating_fn = cdolist_list_var_$340.first();
                                                        while (NIL != cdolist_list_var_$340) {
                                                            final SubLObject _prev_bind_0_$334 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                            try {
                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                final SubLObject sol2;
                                                                final SubLObject link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                if (NIL != set.set_p(sol2)) {
                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                    SubLObject basis_object2;
                                                                    SubLObject state2;
                                                                    SubLObject node_vars_link_node3;
                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                            deck.deck_push(list(node_vars_link_node3, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                        }
                                                                    }
                                                                } else
                                                                    if (sol2.isList()) {
                                                                        SubLObject csome_list_var2 = sol2;
                                                                        SubLObject node_vars_link_node4 = NIL;
                                                                        node_vars_link_node4 = csome_list_var2.first();
                                                                        while (NIL != csome_list_var2) {
                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                deck.deck_push(list(node_vars_link_node4, sbhl_search_vars.genl_inverse_mode_p()), recur_deck);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            node_vars_link_node4 = csome_list_var2.first();
                                                                        } 
                                                                    } else {
                                                                        Errors.error($str71$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }

                                                            } finally {
                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$334, thread);
                                                            }
                                                            cdolist_list_var_$340 = cdolist_list_var_$340.rest();
                                                            generating_fn = cdolist_list_var_$340.first();
                                                        } 
                                                    }

                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$331, thread);
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$331, thread);
                                            }
                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                            module_var = cdolist_list_var2.first();
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$330, thread);
                                    }
                                }
                            } finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$332, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$330, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$329, thread);
                            }
                        } else {
                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str73$Node__a_does_not_pass_sbhl_type_t, pred, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        }
                    } finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$329, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$328, thread);
                    }
                } finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$327, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$335 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$335, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return supported_terms;
    }

    public static SubLObject make_tva_cache_hl_support(final SubLObject sentence, SubLObject mt, SubLObject tv) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (tv == UNPROVIDED) {
            tv = $TRUE_DEF;
        }
        final SubLObject module = tva_utilities.tva_support_module_for_pred(cycl_utilities.formula_arg0(sentence));
        return arguments.make_hl_support(module, sentence, mt, tv);
    }

    public static SubLObject tva_cache_tva_pred_from_support(final SubLObject support) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = arguments.support_sentence(support);
        final SubLObject pcase_var = cycl_utilities.formula_arg0(formula);
        if (pcase_var.eql($$transitiveViaArg) || pcase_var.eql($$transitiveViaArgInverse)) {
            return cycl_utilities.formula_arg2(formula, UNPROVIDED);
        }
        thread.resetMultipleValues();
        final SubLObject success = formula_pattern_match.formula_matches_pattern(formula, $list159);
        final SubLObject v_bindings = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != success) {
            final SubLObject pred = list_utilities.alist_lookup_without_values(v_bindings, PRED, UNPROVIDED, UNPROVIDED);
            return pred;
        }
        Errors.error($str161$Don_t_know_how_to_find_the_transi, support);
        return NIL;
    }

    public static SubLObject tva_cache_transitivity_support(final SubLObject v_cache, final SubLObject subkey_support, SubLObject original_pred) {
        if (original_pred == UNPROVIDED) {
            original_pred = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == original_pred) {
            if (NIL != assertion_handles.assertion_p(subkey_support)) {
                original_pred = assertions_high.gaf_arg0(subkey_support);
            } else
                if (NIL != tva_cache_support_complex_p(subkey_support)) {
                    if (NIL == original_pred) {
                        SubLObject csome_list_var = subkey_support.rest();
                        SubLObject sub_support = NIL;
                        sub_support = csome_list_var.first();
                        while ((NIL == original_pred) && (NIL != csome_list_var)) {
                            if ((NIL != subl_promotions.memberP(sub_support, tva_cache_tva_pred_gafs(v_cache), UNPROVIDED, UNPROVIDED)) || (NIL != member(sub_support, tva_cache_tvai_pred_gafs(v_cache), UNPROVIDED, UNPROVIDED))) {
                                original_pred = tva_cache_tva_pred_from_support(sub_support);
                            }
                            csome_list_var = csome_list_var.rest();
                            sub_support = csome_list_var.first();
                        } 
                    }
                } else
                    if (subkey_support.isList() && (NIL != member(subkey_support.first(), $list162, UNPROVIDED, UNPROVIDED))) {
                        original_pred = third(subkey_support);
                    }


            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == original_pred)) {
                Errors.error($str163$Can_t_get_transitivity_support_fr, subkey_support);
            }
        }
        SubLObject support = NIL;
        if (NIL == support) {
            SubLObject csome_list_var2 = tva_cache_tva_pred_gafs(v_cache);
            SubLObject gaf = NIL;
            gaf = csome_list_var2.first();
            while ((NIL == support) && (NIL != csome_list_var2)) {
                if (tva_cache_tva_pred_from_support(gaf).eql(original_pred) && (NIL != tva_cache_valid_supportP(gaf))) {
                    support = gaf;
                }
                csome_list_var2 = csome_list_var2.rest();
                gaf = csome_list_var2.first();
            } 
        }
        if (NIL == support) {
            SubLObject csome_list_var2 = tva_cache_tvai_pred_gafs(v_cache);
            SubLObject gaf = NIL;
            gaf = csome_list_var2.first();
            while ((NIL == support) && (NIL != csome_list_var2)) {
                if (tva_cache_tva_pred_from_support(gaf).eql(original_pred) && (NIL != tva_cache_valid_supportP(gaf))) {
                    support = gaf;
                }
                csome_list_var2 = csome_list_var2.rest();
                gaf = csome_list_var2.first();
            } 
        }
        return support;
    }

    public static SubLObject new_tva_cache_entry() {
        return cons(dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED), dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
    }

    public static SubLObject tva_cache_note_key_value_supports(final SubLObject v_cache, final SubLObject key, final SubLObject value, final SubLObject supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject entry = tva_cache_entry_for_key(v_cache, key);
        final SubLObject supported_values = entry.first();
        final SubLObject existing_supports = map_utilities.map_get_without_values(supported_values, value, NIL);
        final SubLObject this_value_supports = union(supports, existing_supports, symbol_function(EQL), TVA_CACHE_SUPPORT_GAF);
        map_utilities.map_put(supported_values, value, this_value_supports);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tva_cache_implied_values(v_cache, value))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject implied_value = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject more_supports = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var = this_value_supports;
            SubLObject this_value_support = NIL;
            this_value_support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$343 = more_supports;
                SubLObject more_support = NIL;
                more_support = cdolist_list_var_$343.first();
                while (NIL != cdolist_list_var_$343) {
                    final SubLObject complex_support = make_tva_cache_complex_support(list(this_value_support, more_support));
                    map_utilities.map_pushnew(supported_values, implied_value, complex_support, $sym108$TVA_CACHE_SUPPORT_EQUAL_, UNPROVIDED);
                    cdolist_list_var_$343 = cdolist_list_var_$343.rest();
                    more_support = cdolist_list_var_$343.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                this_value_support = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return entry;
    }

    public static SubLObject tva_cache_implied_values(final SubLObject v_cache, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ans = dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED);
        final SubLObject v_1_2pred_gafs = tva_cache_tva_pred_gafs(v_cache);
        final SubLObject v_2_1pred_gafs = tva_cache_tvai_pred_gafs(v_cache);
        if (NIL != indexed_term_p(value)) {
            final SubLObject pcase_var = tva_cache_index_argnum(v_cache);
            if (pcase_var.eql(ONE_INTEGER)) {
                SubLObject cdolist_list_var = v_1_2pred_gafs;
                SubLObject v_1_2pred_gaf = NIL;
                v_1_2pred_gaf = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL != assertion_handles.valid_assertionP(v_1_2pred_gaf, UNPROVIDED)) && TWO_INTEGER.eql(assertions_high.gaf_arg3(v_1_2pred_gaf))) {
                        final SubLObject iterator = map_utilities.new_map_iterator(tva_cache_get_implicit_terms(value, v_1_2pred_gaf, ONE_INTEGER, TWO_INTEGER));
                        SubLObject valid;
                        for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                            thread.resetMultipleValues();
                            final SubLObject var = iteration.iteration_next(iterator);
                            valid = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != valid) {
                                SubLObject current;
                                final SubLObject datum = current = var;
                                SubLObject key = NIL;
                                SubLObject supports = NIL;
                                destructuring_bind_must_consp(current, datum, $list165);
                                key = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list165);
                                supports = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    dictionary.dictionary_enter(ans, key, supports);
                                } else {
                                    cdestructuring_bind_error(datum, $list165);
                                }
                            }
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_1_2pred_gaf = cdolist_list_var.first();
                } 
            } else
                if (pcase_var.eql(TWO_INTEGER)) {
                    SubLObject cdolist_list_var = v_2_1pred_gafs;
                    SubLObject v_2_1pred_gaf = NIL;
                    v_2_1pred_gaf = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if ((NIL != assertion_handles.valid_assertionP(v_2_1pred_gaf, UNPROVIDED)) && ONE_INTEGER.eql(assertions_high.gaf_arg3(v_2_1pred_gaf))) {
                            final SubLObject iterator = map_utilities.new_map_iterator(tva_cache_get_implicit_terms(value, v_2_1pred_gaf, TWO_INTEGER, ONE_INTEGER));
                            SubLObject valid;
                            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                                thread.resetMultipleValues();
                                final SubLObject var = iteration.iteration_next(iterator);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != valid) {
                                    SubLObject current;
                                    final SubLObject datum = current = var;
                                    SubLObject key = NIL;
                                    SubLObject supports = NIL;
                                    destructuring_bind_must_consp(current, datum, $list165);
                                    key = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list165);
                                    supports = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        dictionary.dictionary_enter(ans, key, supports);
                                    } else {
                                        cdestructuring_bind_error(datum, $list165);
                                    }
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        v_2_1pred_gaf = cdolist_list_var.first();
                    } 
                }

            if (NIL != fort_types_interface.transitive_binary_predicate_p(tva_cache_pred(v_cache))) {
                final SubLObject support = tva_cache_transitive_binary_predicate_support(tva_cache_pred(v_cache));
                final SubLObject index_arg = tva_cache_index_argnum(v_cache);
                final SubLObject iterator2 = map_utilities.new_map_iterator(tva_cache_get_implicit_terms(value, support, index_arg, invert_binary_argnum(index_arg)));
                SubLObject valid2;
                for (SubLObject done_var2 = NIL; NIL == done_var2; done_var2 = makeBoolean(NIL == valid2)) {
                    thread.resetMultipleValues();
                    final SubLObject var2 = iteration.iteration_next(iterator2);
                    valid2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if (NIL != valid2) {
                        SubLObject current2;
                        final SubLObject datum2 = current2 = var2;
                        SubLObject key2 = NIL;
                        SubLObject supports2 = NIL;
                        destructuring_bind_must_consp(current2, datum2, $list165);
                        key2 = current2.first();
                        current2 = current2.rest();
                        destructuring_bind_must_consp(current2, datum2, $list165);
                        supports2 = current2.first();
                        current2 = current2.rest();
                        if (NIL == current2) {
                            dictionary.dictionary_enter(ans, key2, supports2);
                        } else {
                            cdestructuring_bind_error(datum2, $list165);
                        }
                    }
                }
            }
        }
        return ans;
    }

    public static SubLObject tva_cache_transitive_binary_predicate_support(final SubLObject pred) {
        final SubLObject sentence = make_binary_formula($$isa, pred, $$TransitiveBinaryPredicate);
        final SubLObject assertion = czer_meta.find_assertion_cycl(sentence, UNPROVIDED);
        return NIL != assertion ? assertion : make_tva_cache_hl_support(sentence, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tva_cache_note_implicit_key_supports(final SubLObject v_cache, final SubLObject key, final SubLObject implicit_key, final SubLObject supports) {
        SubLObject entry = tva_cache_entry_for_key(v_cache, implicit_key);
        if (NIL == entry) {
            entry = new_tva_cache_entry();
            map_utilities.map_put(tva_cache_map(v_cache), key, entry);
        }
        final SubLObject supported_subkeys = entry.rest();
        final SubLObject existing_supports = map_utilities.map_get_without_values(supported_subkeys, key, NIL);
        map_utilities.map_put(supported_subkeys, key, union(supports, existing_supports, symbol_function(EQL), TVA_CACHE_SUPPORT_GAF));
        return entry;
    }

    public static SubLObject tva_cache_remove_key_value_support(final SubLObject cache_map, final SubLObject key, final SubLObject value, final SubLObject support) {
        final SubLObject entry = map_utilities.map_get_without_values(cache_map, key, UNPROVIDED);
        final SubLObject supported_values = entry.first();
        if (NIL != map_utilities.map_p(supported_values)) {
            final SubLObject existing_supports = map_utilities.map_get_without_values(supported_values, value, NIL);
            map_utilities.map_put(supported_values, value, delete(support, existing_supports, symbol_function(EQL), TVA_CACHE_SUPPORT_GAF, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return entry;
    }

    public static SubLObject tva_cache_remove_implicit_key_support(final SubLObject cache_map, final SubLObject key, final SubLObject implicit_key, final SubLObject support) {
        SubLObject entry = map_utilities.map_get_without_values(cache_map, implicit_key, NIL);
        if (NIL == entry) {
            entry = new_tva_cache_entry();
            map_utilities.map_put(cache_map, key, entry);
        }
        final SubLObject supported_subkeys = entry.rest();
        final SubLObject existing_supports = map_utilities.map_get_without_values(supported_subkeys, key, NIL);
        map_utilities.map_put(supported_subkeys, key, delete(support, existing_supports, symbol_function(EQL), TVA_CACHE_SUPPORT_GAF, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        return entry;
    }

    public static SubLObject invert_binary_argnum(final SubLObject argnum) {
        return subtract(THREE_INTEGER, argnum);
    }

    public static SubLObject cfasl_output_object_tva_cache_method(final SubLObject v_object, final SubLObject stream) {
        return cfasl_output_tva_cache(v_object, stream);
    }

    public static SubLObject cfasl_output_tva_cache(final SubLObject v_tva_cache, final SubLObject stream) {
        cfasl_raw_write_byte($cfasl_opcode_tva_cache$.getGlobalValue(), stream);
        cfasl_output(tva_cache_pred(v_tva_cache), stream);
        cfasl_output(tva_cache_index_argnum(v_tva_cache), stream);
        cfasl_output(tva_cache_tva_pred_gafs(v_tva_cache), stream);
        cfasl_output(tva_cache_tvai_pred_gafs(v_tva_cache), stream);
        cfasl_output(tva_cache_map(v_tva_cache), stream);
        return v_tva_cache;
    }

    public static SubLObject cfasl_input_tva_cache(final SubLObject stream) {
        SubLObject v_cache = NIL;
        v_cache = make_tva_cache(UNPROVIDED);
        _csetf_tva_cache_pred(v_cache, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_tva_cache_index_argnum(v_cache, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_tva_cache_tva_pred_gafs(v_cache, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_tva_cache_tvai_pred_gafs(v_cache, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        _csetf_tva_cache_map(v_cache, cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return v_cache;
    }

    public static SubLObject tva_cache_unbuiltP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_ANY_MT, thread);
            mt_relevance_macros.$mt$.bind($$InferencePSC, thread);
            result = makeBoolean((NIL == map_utilities.map_p($tva_cache_registry$.getGlobalValue())) || ((NIL != map_utilities.map_empty_p($tva_cache_registry$.getGlobalValue())) && kb_indexing.num_predicate_extent_index($$cacheTransitiveClosureForArgs, UNPROVIDED).numG(ZERO_INTEGER)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject rebuild_tva_cache() {
        initialize_tva_caches();
        return NIL;
    }

    public static SubLObject get_tva_cache_contents_data_file(SubLObject directory_path) {
        if (directory_path == UNPROVIDED) {
            directory_path = NIL;
        }
        return dumper.kb_dump_file($str170$tva_cache_contents, directory_path, UNPROVIDED);
    }

    public static SubLObject get_tva_cache_contents_index_file(SubLObject directory_path) {
        if (directory_path == UNPROVIDED) {
            directory_path = NIL;
        }
        return dumper.kb_dump_file($str171$tva_cache_contents_index, directory_path, UNPROVIDED);
    }

    public static SubLObject reconnect_tva_cache_registry(final SubLObject directory, final SubLObject common_symbols) {
        final SubLObject data_file = get_tva_cache_contents_data_file(directory);
        final SubLObject index_file = get_tva_cache_contents_index_file(directory);
        return reconnect_tva_cache_registry_to_file_vector_files(data_file, index_file, common_symbols);
    }

    public static SubLObject reconnect_tva_cache_registry_to_file_vector_files(final SubLObject data_file, final SubLObject index_file, SubLObject common_symbols) {
        if (common_symbols == UNPROVIDED) {
            common_symbols = cfasl_current_common_symbols();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject valid_files = makeBoolean((NIL != file_utilities.file_existsP(data_file)) && (NIL != file_utilities.file_existsP(index_file)));
        if (NIL != valid_files) {
            final SubLObject fvector = file_vector.new_file_vector(data_file, index_file, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject iterator = map_utilities.new_map_iterator($tva_cache_registry$.getGlobalValue());
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = NIL;
                    SubLObject tva_caches = NIL;
                    destructuring_bind_must_consp(current, datum, $list172);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list172);
                    tva_caches = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject cdolist_list_var = tva_caches;
                        SubLObject v_tva_cache = NIL;
                        v_tva_cache = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            reconnect_swappable_tva_cache(v_tva_cache, fvector, common_symbols);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_tva_cache = cdolist_list_var.first();
                        } 
                    } else {
                        cdestructuring_bind_error(datum, $list172);
                    }
                }
            }
        } else {
            Errors.warn($str173$Reconnecting_to_legacy_unit_files, data_file, index_file);
        }
        return valid_files;
    }

    public static SubLObject dump_swappable_tva_cache_to_stream(final SubLObject stream, final SubLObject fvector) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_registry = map_utilities.new_map_with_same_properties($tva_cache_registry$.getGlobalValue());
        final SubLObject map_lock = make_lock($$$Swappable_TVA_Cache);
        final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
        try {
            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(map_lock, thread);
            final SubLObject iterator = map_utilities.new_map_iterator($tva_cache_registry$.getGlobalValue());
            SubLObject valid;
            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                thread.resetMultipleValues();
                final SubLObject var = iteration.iteration_next(iterator);
                valid = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (NIL != valid) {
                    SubLObject current;
                    final SubLObject datum = current = var;
                    SubLObject key = NIL;
                    SubLObject tva_caches = NIL;
                    destructuring_bind_must_consp(current, datum, $list172);
                    key = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list172);
                    tva_caches = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        SubLObject new_caches = NIL;
                        SubLObject cdolist_list_var = tva_caches;
                        SubLObject v_tva_cache = NIL;
                        v_tva_cache = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject new_cache = clone_swappable_tva_cache(v_tva_cache, fvector);
                            new_caches = cons(new_cache, new_caches);
                            cdolist_list_var = cdolist_list_var.rest();
                            v_tva_cache = cdolist_list_var.first();
                        } 
                        new_caches = nreverse(new_caches);
                        map_utilities.map_put(new_registry, key, new_caches);
                    } else {
                        cdestructuring_bind_error(datum, $list172);
                    }
                }
            }
        } finally {
            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
        }
        cfasl_output(new_registry, stream);
        return NIL;
    }

    public static SubLObject dump_tva_cache_to_stream(final SubLObject stream) {
        cfasl_output($tva_cache_registry$.getGlobalValue(), stream);
        return NIL;
    }

    public static SubLObject load_tva_cache_from_stream(final SubLObject stream) {
        $tva_cache_registry$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        return NIL;
    }

    public static SubLObject declare_tva_cache_file() {
        declareMacro(me, "do_tva_caches", "DO-TVA-CACHES");
        declareMacro(me, "do_tva_cache", "DO-TVA-CACHE");
        declareFunction(me, "tva_cache_get_values", "TVA-CACHE-GET-VALUES", 4, 0, false);
        declareFunction(me, "tva_cache_check_value", "TVA-CACHE-CHECK-VALUE", 4, 2, false);
        declareFunction(me, "tva_cache_predicate_index_arg_cached_p", "TVA-CACHE-PREDICATE-INDEX-ARG-CACHED-P", 2, 0, false);
        declareFunction(me, "initialize_tva_caches", "INITIALIZE-TVA-CACHES", 0, 0, false);
        declareFunction(me, "initialize_uninitialized_tva_caches", "INITIALIZE-UNINITIALIZED-TVA-CACHES", 0, 0, false);
        declareFunction(me, "initialize_tva_caches_int", "INITIALIZE-TVA-CACHES-INT", 1, 0, false);
        declareFunction(me, "tva_cache_enabled_p", "TVA-CACHE-ENABLED-P", 0, 0, false);
        declareFunction(me, "cached_tva_value_count", "CACHED-TVA-VALUE-COUNT", 0, 0, false);
        declareFunction(me, "tva_cache_print_function_trampoline", "TVA-CACHE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "tva_cache_p", "TVA-CACHE-P", 1, 0, false);
        new tva_cache.$tva_cache_p$UnaryFunction();
        declareFunction(me, "tva_cache_pred", "TVA-CACHE-PRED", 1, 0, false);
        declareFunction(me, "tva_cache_index_argnum", "TVA-CACHE-INDEX-ARGNUM", 1, 0, false);
        declareFunction(me, "tva_cache_tva_pred_gafs", "TVA-CACHE-TVA-PRED-GAFS", 1, 0, false);
        declareFunction(me, "tva_cache_tvai_pred_gafs", "TVA-CACHE-TVAI-PRED-GAFS", 1, 0, false);
        declareFunction(me, "tva_cache_map", "TVA-CACHE-MAP", 1, 0, false);
        declareFunction(me, "_csetf_tva_cache_pred", "_CSETF-TVA-CACHE-PRED", 2, 0, false);
        declareFunction(me, "_csetf_tva_cache_index_argnum", "_CSETF-TVA-CACHE-INDEX-ARGNUM", 2, 0, false);
        declareFunction(me, "_csetf_tva_cache_tva_pred_gafs", "_CSETF-TVA-CACHE-TVA-PRED-GAFS", 2, 0, false);
        declareFunction(me, "_csetf_tva_cache_tvai_pred_gafs", "_CSETF-TVA-CACHE-TVAI-PRED-GAFS", 2, 0, false);
        declareFunction(me, "_csetf_tva_cache_map", "_CSETF-TVA-CACHE-MAP", 2, 0, false);
        declareFunction(me, "make_tva_cache", "MAKE-TVA-CACHE", 0, 1, false);
        declareFunction(me, "visit_defstruct_tva_cache", "VISIT-DEFSTRUCT-TVA-CACHE", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_tva_cache_method", "VISIT-DEFSTRUCT-OBJECT-TVA-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "sxhash_tva_cache_method", "SXHASH-TVA-CACHE-METHOD", 1, 0, false);
        declareFunction(me, "pprint_tva_cache", "PPRINT-TVA-CACHE", 1, 2, false);
        declareFunction(me, "clone_swappable_tva_cache", "CLONE-SWAPPABLE-TVA-CACHE", 2, 0, false);
        declareFunction(me, "using_swappable_tva_cachesP", "USING-SWAPPABLE-TVA-CACHES?", 0, 0, false);
        declareFunction(me, "ensure_swappable_tva_cache_lock", "ENSURE-SWAPPABLE-TVA-CACHE-LOCK", 0, 0, false);
        declareFunction(me, "reconnect_swappable_tva_cache", "RECONNECT-SWAPPABLE-TVA-CACHE", 2, 1, false);
        declareFunction(me, "tva_cache_registry", "TVA-CACHE-REGISTRY", 0, 0, false);
        declareFunction(me, "register_tva_cache", "REGISTER-TVA-CACHE", 1, 0, false);
        declareFunction(me, "tva_caches_for_predicate", "TVA-CACHES-FOR-PREDICATE", 1, 0, false);
        declareFunction(me, "tva_caches_implied_by_predicate", "TVA-CACHES-IMPLIED-BY-PREDICATE", 1, 0, false);
        declareFunction(me, "tva_caches_with_transitive_predicate", "TVA-CACHES-WITH-TRANSITIVE-PREDICATE", 1, 0, false);
        declareFunction(me, "tva_cache_for_predicate_and_index_argnum", "TVA-CACHE-FOR-PREDICATE-AND-INDEX-ARGNUM", 2, 0, false);
        declareFunction(me, "ensure_tva_cache_created", "ENSURE-TVA-CACHE-CREATED", 2, 0, false);
        declareFunction(me, "deregister_tva_cache", "DEREGISTER-TVA-CACHE", 1, 1, false);
        declareFunction(me, "deregister_all_tva_caches_for_predicate", "DEREGISTER-ALL-TVA-CACHES-FOR-PREDICATE", 1, 0, false);
        declareFunction(me, "reset_tva_cache_spec_pred_stats", "RESET-TVA-CACHE-SPEC-PRED-STATS", 0, 0, false);
        declareFunction(me, "tva_cache_spec_preds_total_time", "TVA-CACHE-SPEC-PREDS-TOTAL-TIME", 0, 0, false);
        declareMacro(me, "do_tva_sub_caches", "DO-TVA-SUB-CACHES");
        declareMacro(me, "do_tva_sub_caches_via_index_surfing", "DO-TVA-SUB-CACHES-VIA-INDEX-SURFING");
        declareMacro(me, "do_tva_sub_caches_via_memoized_lists", "DO-TVA-SUB-CACHES-VIA-MEMOIZED-LISTS");
        declareFunction(me, "tva_cache_spec_preds_and_inverses_internal", "TVA-CACHE-SPEC-PREDS-AND-INVERSES-INTERNAL", 1, 1, false);
        declareFunction(me, "tva_cache_spec_preds_and_inverses", "TVA-CACHE-SPEC-PREDS-AND-INVERSES", 1, 1, false);
        declareFunction(me, "find_tva_sub_cache", "FIND-TVA-SUB-CACHE", 3, 0, false);
        declareFunction(me, "tva_cache_lookup", "TVA-CACHE-LOOKUP", 2, 3, false);
        declareFunction(me, "tva_cache_lookup_recursive", "TVA-CACHE-LOOKUP-RECURSIVE", 6, 0, false);
        declareFunction(me, "tva_cache_lookup_recursive_internal", "TVA-CACHE-LOOKUP-RECURSIVE-INTERNAL", 9, 0, false);
        declareFunction(me, "cleanup_tva_cache_supports_genl_preds_chains", "CLEANUP-TVA-CACHE-SUPPORTS-GENL-PREDS-CHAINS", 1, 0, false);
        declareMacro(me, "with_tva_cache_lock", "WITH-TVA-CACHE-LOCK");
        declareFunction(me, "tva_cache_entry_for_key", "TVA-CACHE-ENTRY-FOR-KEY", 2, 0, false);
        declareFunction(me, "tva_cache_lookup_internal_internal", "TVA-CACHE-LOOKUP-INTERNAL-INTERNAL", 6, 0, false);
        declareFunction(me, "tva_cache_lookup_internal", "TVA-CACHE-LOOKUP-INTERNAL", 6, 0, false);
        declareFunction(me, "tva_cache_has_keyP", "TVA-CACHE-HAS-KEY?", 2, 0, false);
        declareFunction(me, "tva_cache_valid_supportP_internal", "TVA-CACHE-VALID-SUPPORT?-INTERNAL", 1, 0, false);
        declareFunction(me, "tva_cache_valid_supportP", "TVA-CACHE-VALID-SUPPORT?", 1, 0, false);
        declareFunction(me, "tva_cache_support_gaf", "TVA-CACHE-SUPPORT-GAF", 1, 0, false);
        declareFunction(me, "tva_cache_support_equalP", "TVA-CACHE-SUPPORT-EQUAL?", 2, 0, false);
        declareFunction(me, "unpack_and_validate_tva_cache_support", "UNPACK-AND-VALIDATE-TVA-CACHE-SUPPORT", 2, 1, false);
        declareFunction(me, "unpack_and_validate_tva_cache_complex_support", "UNPACK-AND-VALIDATE-TVA-CACHE-COMPLEX-SUPPORT", 2, 1, false);
        declareFunction(me, "add_tva_cache_value", "ADD-TVA-CACHE-VALUE", 2, 0, false);
        declareFunction(me, "clear_add_tva_cache_value_cached", "CLEAR-ADD-TVA-CACHE-VALUE-CACHED", 0, 0, false);
        declareFunction(me, "remove_add_tva_cache_value_cached", "REMOVE-ADD-TVA-CACHE-VALUE-CACHED", 1, 0, false);
        declareFunction(me, "add_tva_cache_value_cached_internal", "ADD-TVA-CACHE-VALUE-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "add_tva_cache_value_cached", "ADD-TVA-CACHE-VALUE-CACHED", 1, 0, false);
        declareFunction(me, "remove_tva_cache_value", "REMOVE-TVA-CACHE-VALUE", 2, 0, false);
        declareFunction(me, "clear_remove_tva_cache_value_cached", "CLEAR-REMOVE-TVA-CACHE-VALUE-CACHED", 0, 0, false);
        declareFunction(me, "remove_remove_tva_cache_value_cached", "REMOVE-REMOVE-TVA-CACHE-VALUE-CACHED", 1, 0, false);
        declareFunction(me, "remove_tva_cache_value_cached_internal", "REMOVE-TVA-CACHE-VALUE-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "remove_tva_cache_value_cached", "REMOVE-TVA-CACHE-VALUE-CACHED", 1, 0, false);
        declareFunction(me, "add_tva_cache_key", "ADD-TVA-CACHE-KEY", 2, 0, false);
        declareFunction(me, "clear_add_tva_cache_key_cached", "CLEAR-ADD-TVA-CACHE-KEY-CACHED", 0, 0, false);
        declareFunction(me, "remove_add_tva_cache_key_cached", "REMOVE-ADD-TVA-CACHE-KEY-CACHED", 1, 0, false);
        declareFunction(me, "add_tva_cache_key_cached_internal", "ADD-TVA-CACHE-KEY-CACHED-INTERNAL", 1, 0, false);
        declareFunction(me, "add_tva_cache_key_cached", "ADD-TVA-CACHE-KEY-CACHED", 1, 0, false);
        declareFunction(me, "remove_tva_cache_key", "REMOVE-TVA-CACHE-KEY", 2, 0, false);
        declareFunction(me, "tva_cache_add_transitive_via_arg", "TVA-CACHE-ADD-TRANSITIVE-VIA-ARG", 1, 0, false);
        declareFunction(me, "tva_cache_add_transitive_via_arg_inverse", "TVA-CACHE-ADD-TRANSITIVE-VIA-ARG-INVERSE", 1, 0, false);
        declareFunction(me, "tva_cache_remove_transitive_via_arg", "TVA-CACHE-REMOVE-TRANSITIVE-VIA-ARG", 1, 0, false);
        declareFunction(me, "tva_cache_remove_transitive_via_arg_inverse", "TVA-CACHE-REMOVE-TRANSITIVE-VIA-ARG-INVERSE", 1, 0, false);
        declareFunction(me, "tva_cache_add_trans_gaf", "TVA-CACHE-ADD-TRANS-GAF", 4, 0, false);
        declareFunction(me, "create_tva_cache", "CREATE-TVA-CACHE", 2, 1, false);
        declareFunction(me, "initialize_tva_cache", "INITIALIZE-TVA-CACHE", 1, 0, false);
        declareFunction(me, "tva_cache_asserted_values", "TVA-CACHE-ASSERTED-VALUES", 1, 0, false);
        declareFunction(me, "tva_cache_relation_all_instance_values", "TVA-CACHE-RELATION-ALL-INSTANCE-VALUES", 1, 0, false);
        declareFunction(me, "clear_tva_cache_max_instances_to_cache", "CLEAR-TVA-CACHE-MAX-INSTANCES-TO-CACHE", 0, 0, false);
        declareFunction(me, "remove_tva_cache_max_instances_to_cache", "REMOVE-TVA-CACHE-MAX-INSTANCES-TO-CACHE", 0, 0, false);
        declareFunction(me, "tva_cache_max_instances_to_cache_internal", "TVA-CACHE-MAX-INSTANCES-TO-CACHE-INTERNAL", 0, 0, false);
        declareFunction(me, "tva_cache_max_instances_to_cache", "TVA-CACHE-MAX-INSTANCES-TO-CACHE", 0, 0, false);
        declareFunction(me, "tva_cache_add_one_relation_all_instance_gaf", "TVA-CACHE-ADD-ONE-RELATION-ALL-INSTANCE-GAF", 2, 0, false);
        declareFunction(me, "tva_cache_add_relation_instance_all_gaf", "TVA-CACHE-ADD-RELATION-INSTANCE-ALL-GAF", 1, 0, false);
        declareFunction(me, "tva_cache_add_relation_all_instance_gaf", "TVA-CACHE-ADD-RELATION-ALL-INSTANCE-GAF", 1, 0, false);
        declareFunction(me, "tva_cache_remove_relation_all_instance_gaf", "TVA-CACHE-REMOVE-RELATION-ALL-INSTANCE-GAF", 1, 0, false);
        declareFunction(me, "tva_cache_remove_one_relation_all_instance_gaf", "TVA-CACHE-REMOVE-ONE-RELATION-ALL-INSTANCE-GAF", 2, 0, false);
        declareFunction(me, "tva_cache_remove_relation_instance_all_gaf", "TVA-CACHE-REMOVE-RELATION-INSTANCE-ALL-GAF", 1, 0, false);
        declareFunction(me, "tva_cache_remove_one_relation_instance_all_gaf", "TVA-CACHE-REMOVE-ONE-RELATION-INSTANCE-ALL-GAF", 2, 0, false);
        declareFunction(me, "tva_cache_relation_instance_all_values", "TVA-CACHE-RELATION-INSTANCE-ALL-VALUES", 1, 0, false);
        declareFunction(me, "tva_cache_add_one_relation_instance_all_gaf", "TVA-CACHE-ADD-ONE-RELATION-INSTANCE-ALL-GAF", 2, 0, false);
        declareFunction(me, "tva_cache_silent_progressP", "TVA-CACHE-SILENT-PROGRESS?", 3, 0, false);
        declareFunction(me, "tva_cache_store_one_gaf", "TVA-CACHE-STORE-ONE-GAF", 5, 0, false);
        declareFunction(me, "tva_cache_store_one_value", "TVA-CACHE-STORE-ONE-VALUE", 2, 0, false);
        declareFunction(me, "make_tva_cache_complex_support", "MAKE-TVA-CACHE-COMPLEX-SUPPORT", 1, 0, false);
        declareFunction(me, "tva_cache_support_component_supports", "TVA-CACHE-SUPPORT-COMPONENT-SUPPORTS", 1, 0, false);
        declareFunction(me, "tva_cache_support_complex_p", "TVA-CACHE-SUPPORT-COMPLEX-P", 1, 0, false);
        declareFunction(me, "tva_cache_complex_support_equalP", "TVA-CACHE-COMPLEX-SUPPORT-EQUAL?", 2, 0, false);
        declareFunction(me, "make_tva_cache_support", "MAKE-TVA-CACHE-SUPPORT", 4, 0, false);
        declareFunction(me, "tva_cache_ensure_cache_has_key", "TVA-CACHE-ENSURE-CACHE-HAS-KEY", 2, 0, false);
        declareFunction(me, "tva_cache_add_key", "TVA-CACHE-ADD-KEY", 2, 0, false);
        declareFunction(me, "tva_cache_note_implicit_keys_from_trans_gaf", "TVA-CACHE-NOTE-IMPLICIT-KEYS-FROM-TRANS-GAF", 3, 2, false);
        declareFunction(me, "tva_cache_get_implicit_terms", "TVA-CACHE-GET-IMPLICIT-TERMS", 4, 0, false);
        declareFunction(me, "tva_cache_get_implicit_terms_internal", "TVA-CACHE-GET-IMPLICIT-TERMS-INTERNAL", 5, 1, false);
        declareFunction(me, "make_tva_cache_hl_support", "MAKE-TVA-CACHE-HL-SUPPORT", 1, 2, false);
        declareFunction(me, "tva_cache_tva_pred_from_support", "TVA-CACHE-TVA-PRED-FROM-SUPPORT", 1, 0, false);
        declareFunction(me, "tva_cache_transitivity_support", "TVA-CACHE-TRANSITIVITY-SUPPORT", 2, 1, false);
        declareFunction(me, "new_tva_cache_entry", "NEW-TVA-CACHE-ENTRY", 0, 0, false);
        declareFunction(me, "tva_cache_note_key_value_supports", "TVA-CACHE-NOTE-KEY-VALUE-SUPPORTS", 4, 0, false);
        declareFunction(me, "tva_cache_implied_values", "TVA-CACHE-IMPLIED-VALUES", 2, 0, false);
        declareFunction(me, "tva_cache_transitive_binary_predicate_support", "TVA-CACHE-TRANSITIVE-BINARY-PREDICATE-SUPPORT", 1, 0, false);
        declareFunction(me, "tva_cache_note_implicit_key_supports", "TVA-CACHE-NOTE-IMPLICIT-KEY-SUPPORTS", 4, 0, false);
        declareFunction(me, "tva_cache_remove_key_value_support", "TVA-CACHE-REMOVE-KEY-VALUE-SUPPORT", 4, 0, false);
        declareFunction(me, "tva_cache_remove_implicit_key_support", "TVA-CACHE-REMOVE-IMPLICIT-KEY-SUPPORT", 4, 0, false);
        declareFunction(me, "invert_binary_argnum", "INVERT-BINARY-ARGNUM", 1, 0, false);
        declareFunction(me, "cfasl_output_object_tva_cache_method", "CFASL-OUTPUT-OBJECT-TVA-CACHE-METHOD", 2, 0, false);
        declareFunction(me, "cfasl_output_tva_cache", "CFASL-OUTPUT-TVA-CACHE", 2, 0, false);
        declareFunction(me, "cfasl_input_tva_cache", "CFASL-INPUT-TVA-CACHE", 1, 0, false);
        declareFunction(me, "tva_cache_unbuiltP", "TVA-CACHE-UNBUILT?", 0, 0, false);
        declareFunction(me, "rebuild_tva_cache", "REBUILD-TVA-CACHE", 0, 0, false);
        declareFunction(me, "get_tva_cache_contents_data_file", "GET-TVA-CACHE-CONTENTS-DATA-FILE", 0, 1, false);
        declareFunction(me, "get_tva_cache_contents_index_file", "GET-TVA-CACHE-CONTENTS-INDEX-FILE", 0, 1, false);
        declareFunction(me, "reconnect_tva_cache_registry", "RECONNECT-TVA-CACHE-REGISTRY", 2, 0, false);
        declareFunction(me, "reconnect_tva_cache_registry_to_file_vector_files", "RECONNECT-TVA-CACHE-REGISTRY-TO-FILE-VECTOR-FILES", 2, 1, false);
        declareFunction(me, "dump_swappable_tva_cache_to_stream", "DUMP-SWAPPABLE-TVA-CACHE-TO-STREAM", 2, 0, false);
        declareFunction(me, "dump_tva_cache_to_stream", "DUMP-TVA-CACHE-TO-STREAM", 1, 0, false);
        declareFunction(me, "load_tva_cache_from_stream", "LOAD-TVA-CACHE-FROM-STREAM", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_tva_cache_file() {
        defparameter("*USE-TVA-CACHE?*", T);
        defparameter("*UPDATE-TVA-CACHE?*", T);
        defconstant("*DTP-TVA-CACHE*", TVA_CACHE);
        deflexical("*SWAPPABLE-TVA-CACHE-LOCK*", SubLTrampolineFile.maybeDefault($swappable_tva_cache_lock$, $swappable_tva_cache_lock$, NIL));
        deflexical("*TVA-CACHE-REGISTRY*", SubLTrampolineFile.maybeDefault($tva_cache_registry$, $tva_cache_registry$, () -> dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED)));
        defparameter("*TVA-CACHE-USE-MEMOIZED-SPEC-PRED-LISTS?*", NIL);
        deflexical("*TVA-CACHE-SPEC-PRED-STATS*", SubLTrampolineFile.maybeDefault($tva_cache_spec_pred_stats$, $tva_cache_spec_pred_stats$, () -> dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED)));
        defparameter("*TVA-CACHE-ASSUME-SUPPORTS-ARE-VALID?*", NIL);
        deflexical("*ADD-TVA-CACHE-VALUE-CACHED-CACHING-STATE*", NIL);
        deflexical("*REMOVE-TVA-CACHE-VALUE-CACHED-CACHING-STATE*", NIL);
        deflexical("*ADD-TVA-CACHE-KEY-CACHED-CACHING-STATE*", NIL);
        deflexical("*TVA-CACHE-MAX-INSTANCES-TO-CACHE-CACHING-STATE*", NIL);
        defconstant("*CFASL-OPCODE-TVA-CACHE*", $int$96);
        return NIL;
    }

    public static SubLObject setup_tva_cache_file() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_tva_cache$.getGlobalValue(), symbol_function(TVA_CACHE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list29);
        def_csetf(TVA_CACHE_PRED, _CSETF_TVA_CACHE_PRED);
        def_csetf(TVA_CACHE_INDEX_ARGNUM, _CSETF_TVA_CACHE_INDEX_ARGNUM);
        def_csetf(TVA_CACHE_TVA_PRED_GAFS, _CSETF_TVA_CACHE_TVA_PRED_GAFS);
        def_csetf(TVA_CACHE_TVAI_PRED_GAFS, _CSETF_TVA_CACHE_TVAI_PRED_GAFS);
        def_csetf(TVA_CACHE_MAP, _CSETF_TVA_CACHE_MAP);
        identity(TVA_CACHE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_tva_cache$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_TVA_CACHE_METHOD));
        register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_tva_cache$.getGlobalValue(), symbol_function(SXHASH_TVA_CACHE_METHOD));
        declare_defglobal($swappable_tva_cache_lock$);
        declare_defglobal($tva_cache_registry$);
        declare_defglobal($tva_cache_spec_pred_stats$);
        memoization_state.note_memoized_function(TVA_CACHE_SPEC_PREDS_AND_INVERSES);
        memoization_state.note_memoized_function(TVA_CACHE_LOOKUP_INTERNAL);
        memoization_state.note_memoized_function($sym117$TVA_CACHE_VALID_SUPPORT_);
        register_kb_function(ADD_TVA_CACHE_VALUE);
        memoization_state.note_globally_cached_function(ADD_TVA_CACHE_VALUE_CACHED);
        register_kb_function(REMOVE_TVA_CACHE_VALUE);
        memoization_state.note_globally_cached_function(REMOVE_TVA_CACHE_VALUE_CACHED);
        register_kb_function(ADD_TVA_CACHE_KEY);
        memoization_state.note_globally_cached_function(ADD_TVA_CACHE_KEY_CACHED);
        register_kb_function(REMOVE_TVA_CACHE_KEY);
        memoization_state.note_globally_cached_function(TVA_CACHE_MAX_INSTANCES_TO_CACHE);
        register_cfasl_input_function($cfasl_opcode_tva_cache$.getGlobalValue(), CFASL_INPUT_TVA_CACHE);
        register_method($cfasl_output_object_method_table$.getGlobalValue(), $dtp_tva_cache$.getGlobalValue(), symbol_function(CFASL_OUTPUT_OBJECT_TVA_CACHE_METHOD));
        define_obsolete_register(DUMP_TVA_CACHE_TO_STREAM, $list175);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_tva_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_tva_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_tva_cache_file();
    }

    static {






























































































































































































    }

    public static final class $tva_cache_native extends SubLStructNative {
        public SubLObject $pred;

        public SubLObject $index_argnum;

        public SubLObject $tva_pred_gafs;

        public SubLObject $tvai_pred_gafs;

        public SubLObject $map;

        private static final SubLStructDeclNative structDecl;

        private $tva_cache_native() {
            this.$pred = Lisp.NIL;
            this.$index_argnum = Lisp.NIL;
            this.$tva_pred_gafs = Lisp.NIL;
            this.$tvai_pred_gafs = Lisp.NIL;
            this.$map = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$pred;
        }

        @Override
        public SubLObject getField3() {
            return this.$index_argnum;
        }

        @Override
        public SubLObject getField4() {
            return this.$tva_pred_gafs;
        }

        @Override
        public SubLObject getField5() {
            return this.$tvai_pred_gafs;
        }

        @Override
        public SubLObject getField6() {
            return this.$map;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$pred = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$index_argnum = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$tva_pred_gafs = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$tvai_pred_gafs = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$map = value;
        }

        static {
            structDecl = makeStructDeclNative($tva_cache_native.class, TVA_CACHE, TVA_CACHE_P, $list23, $list24, new String[]{ "$pred", "$index_argnum", "$tva_pred_gafs", "$tvai_pred_gafs", "$map" }, $list25, $list26, PPRINT_TVA_CACHE);
        }
    }

    public static final class $tva_cache_p$UnaryFunction extends UnaryFunction {
        public $tva_cache_p$UnaryFunction() {
            super(extractFunctionNamed("TVA-CACHE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return tva_cache_p(arg1);
        }
    }
}

/**
 * Total time: 9336 ms
 */
