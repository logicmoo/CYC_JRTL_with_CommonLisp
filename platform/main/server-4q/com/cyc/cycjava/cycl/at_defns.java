package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$bootstrapping_kbP$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_answer$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_data_1$;
import static com.cyc.cycjava.cycl.control_vars.within_assertP;
import static com.cyc.cycjava.cycl.el_utilities.cycl_subl_symbol_symbol;
import static com.cyc.cycjava.cycl.el_utilities.el_negation_p;
import static com.cyc.cycjava.cycl.el_utilities.isa_litP;
import static com.cyc.cycjava.cycl.el_utilities.possibly_fo_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.quoted_isa_litP;
import static com.cyc.cycjava.cycl.utilities_macros.$defn_state_variables$;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.mapping_finished;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_kb_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.max;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_internal_real_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.symbolp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nset_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nunion;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.print;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.time_high;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class at_defns extends SubLTranslatedFile {
    public static final SubLFile me = new at_defns();

    public static final String myName = "com.cyc.cycjava.cycl.at_defns";

    public static final String myFingerPrint = "975a5bf585fcd3fa4ab472fcc84270433a7a51d147c6ca04d18ef1d35273d97b";

    // defvar
    public static final SubLSymbol $use_new_defns_functionsP$ = makeSymbol("*USE-NEW-DEFNS-FUNCTIONS?*");

    // defparameter
    public static final SubLSymbol $old_defns_admitP_meters$ = makeSymbol("*OLD-DEFNS-ADMIT?-METERS*");

    // defparameter
    public static final SubLSymbol $old_defns_rejectP_meters$ = makeSymbol("*OLD-DEFNS-REJECT?-METERS*");



    // defparameter
    public static final SubLSymbol $sufficient_defns_admitP_meters$ = makeSymbol("*SUFFICIENT-DEFNS-ADMIT?-METERS*");

    // defparameter
    public static final SubLSymbol $necessary_defns_rejectP_meters$ = makeSymbol("*NECESSARY-DEFNS-REJECT?-METERS*");



    // defparameter
    public static final SubLSymbol $old_quoted_defns_admitP_meters$ = makeSymbol("*OLD-QUOTED-DEFNS-ADMIT?-METERS*");

    // defparameter
    public static final SubLSymbol $old_quoted_defns_rejectP_meters$ = makeSymbol("*OLD-QUOTED-DEFNS-REJECT?-METERS*");



    // defparameter
    public static final SubLSymbol $quoted_sufficient_defns_admitP_meters$ = makeSymbol("*QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS*");

    // defparameter
    public static final SubLSymbol $quoted_necessary_defns_rejectP_meters$ = makeSymbol("*QUOTED-NECESSARY-DEFNS-REJECT?-METERS*");



    // defparameter
    public static final SubLSymbol $defn_admits_intP_meters$ = makeSymbol("*DEFN-ADMITS-INT?-METERS*");

    // defparameter
    public static final SubLSymbol $quoted_defn_admits_intP_meters$ = makeSymbol("*QUOTED-DEFN-ADMITS-INT?-METERS*");



    // defparameter
    // hashtable of defns that fail for term
    private static final SubLSymbol $cat_defns_failing$ = makeSymbol("*CAT-DEFNS-FAILING*");

























    // defparameter
    // invalid keys of suf-function cache
    private static final SubLSymbol $suf_function_cache_mal_keys$ = makeSymbol("*SUF-FUNCTION-CACHE-MAL-KEYS*");

    // defparameter
    // keys of suf-function cache that have no value
    private static final SubLSymbol $suf_function_cache_key_wXo_value$ = makeSymbol("*SUF-FUNCTION-CACHE-KEY-W/O-VALUE*");

    // defparameter
    // keys of suf-function cache that have an invalid value
    private static final SubLSymbol $suf_function_cache_key_wXmal_value$ = makeSymbol("*SUF-FUNCTION-CACHE-KEY-W/MAL-VALUE*");

    // defparameter
    // keys of suf-function cache that have an inappropriate indirect value
    private static final SubLSymbol $suf_function_cache_key_wXstale_value$ = makeSymbol("*SUF-FUNCTION-CACHE-KEY-W/STALE-VALUE*");

    // defparameter
    // keys of suf-function cache that are missing an indirect value
    private static final SubLSymbol $suf_function_cache_keys_wXo_inerited_value$ = makeSymbol("*SUF-FUNCTION-CACHE-KEYS-W/O-INERITED-VALUE*");

    // defparameter
    // assertions missing as direct values from suf-function cache
    private static final SubLSymbol $suf_function_cache_awol_direct_assertions$ = makeSymbol("*SUF-FUNCTION-CACHE-AWOL-DIRECT-ASSERTIONS*");

    // Internal Constants
    public static final SubLString $str0$___remove_sufficent_defn__a__a_ = makeString("~%(remove-sufficent-defn ~a ~a)");





    public static final SubLSymbol $sym3$_OLD_DEFNS_ADMIT__METERS_ = makeSymbol("*OLD-DEFNS-ADMIT?-METERS*");











    private static final SubLList $list9 = list(makeSymbol("COLLECTION"), makeSymbol("TERM"), makeSymbol("MT"));



    private static final SubLSymbol $sym11$OLD_DEFNS_ADMIT_ = makeSymbol("OLD-DEFNS-ADMIT?");



    private static final SubLSymbol $sym13$RESET_OLD_DEFNS_ADMIT__METERS = makeSymbol("RESET-OLD-DEFNS-ADMIT?-METERS");

    private static final SubLSymbol $sym14$_OLD_DEFNS_REJECT__METERS_ = makeSymbol("*OLD-DEFNS-REJECT?-METERS*");

    private static final SubLSymbol $sym15$OLD_DEFNS_REJECT_ = makeSymbol("OLD-DEFNS-REJECT?");

    private static final SubLSymbol $sym16$RESET_OLD_DEFNS_REJECT__METERS = makeSymbol("RESET-OLD-DEFNS-REJECT?-METERS");

    public static final SubLSymbol $defining_defns_status_meters$ = makeSymbol("*DEFINING-DEFNS-STATUS-METERS*");

    private static final SubLSymbol DEFINING_DEFNS_STATUS = makeSymbol("DEFINING-DEFNS-STATUS");

    private static final SubLSymbol RESET_DEFINING_DEFNS_STATUS_METERS = makeSymbol("RESET-DEFINING-DEFNS-STATUS-METERS");

    private static final SubLObject $$defnIff = reader_make_constant_shell(makeString("defnIff"));



    private static final SubLSymbol $VIA_GENL_PRED = makeKeyword("VIA-GENL-PRED");

    private static final SubLSymbol $AT_CONSTRAINT_GAF = makeKeyword("AT-CONSTRAINT-GAF");

    private static final SubLSymbol $MAL_ARG_WRT_QUOTED_IFF_DEFN = makeKeyword("MAL-ARG-WRT-QUOTED-IFF-DEFN");

    private static final SubLSymbol $MAL_ARG_WRT_IFF_DEFN = makeKeyword("MAL-ARG-WRT-IFF-DEFN");

    private static final SubLSymbol $sym26$_SUFFICIENT_DEFNS_ADMIT__METERS_ = makeSymbol("*SUFFICIENT-DEFNS-ADMIT?-METERS*");

    private static final SubLSymbol $sym27$SUFFICIENT_DEFNS_ADMIT_ = makeSymbol("SUFFICIENT-DEFNS-ADMIT?");

    private static final SubLSymbol $sym28$RESET_SUFFICIENT_DEFNS_ADMIT__METERS = makeSymbol("RESET-SUFFICIENT-DEFNS-ADMIT?-METERS");

    private static final SubLSymbol $MAL_ARG_WRT_QUOTED_SUF_DEFNS = makeKeyword("MAL-ARG-WRT-QUOTED-SUF-DEFNS");

    private static final SubLSymbol $MAL_ARG_WRT_SUF_DEFNS = makeKeyword("MAL-ARG-WRT-SUF-DEFNS");

    private static final SubLSymbol $sym31$_NECESSARY_DEFNS_REJECT__METERS_ = makeSymbol("*NECESSARY-DEFNS-REJECT?-METERS*");

    private static final SubLSymbol $sym32$NECESSARY_DEFNS_REJECT_ = makeSymbol("NECESSARY-DEFNS-REJECT?");

    private static final SubLSymbol $sym33$RESET_NECESSARY_DEFNS_REJECT__METERS = makeSymbol("RESET-NECESSARY-DEFNS-REJECT?-METERS");











    private static final SubLString $str39$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str44$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLList $list46 = list(reader_make_constant_shell(makeString("defnIff")), reader_make_constant_shell(makeString("defnNecessary")));

    private static final SubLString $str47$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str48$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str49$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");



    public static final SubLSymbol $rejected_by_necessary_defns_meters$ = makeSymbol("*REJECTED-BY-NECESSARY-DEFNS-METERS*");

    private static final SubLSymbol REJECTED_BY_NECESSARY_DEFNS = makeSymbol("REJECTED-BY-NECESSARY-DEFNS");

    private static final SubLSymbol RESET_REJECTED_BY_NECESSARY_DEFNS_METERS = makeSymbol("RESET-REJECTED-BY-NECESSARY-DEFNS-METERS");

    private static final SubLObject $$defnNecessary = reader_make_constant_shell(makeString("defnNecessary"));

    private static final SubLSymbol $MAL_ARG_WRT_QUOTED_NEC_DEFN = makeKeyword("MAL-ARG-WRT-QUOTED-NEC-DEFN");

    private static final SubLSymbol $MAL_ARG_WRT_NEC_DEFN = makeKeyword("MAL-ARG-WRT-NEC-DEFN");

    private static final SubLSymbol $sym57$_OLD_QUOTED_DEFNS_ADMIT__METERS_ = makeSymbol("*OLD-QUOTED-DEFNS-ADMIT?-METERS*");

    private static final SubLSymbol $sym58$OLD_QUOTED_DEFNS_ADMIT_ = makeSymbol("OLD-QUOTED-DEFNS-ADMIT?");

    private static final SubLSymbol $sym59$RESET_OLD_QUOTED_DEFNS_ADMIT__METERS = makeSymbol("RESET-OLD-QUOTED-DEFNS-ADMIT?-METERS");

    private static final SubLSymbol $sym60$_OLD_QUOTED_DEFNS_REJECT__METERS_ = makeSymbol("*OLD-QUOTED-DEFNS-REJECT?-METERS*");

    private static final SubLSymbol $sym61$OLD_QUOTED_DEFNS_REJECT_ = makeSymbol("OLD-QUOTED-DEFNS-REJECT?");

    private static final SubLSymbol $sym62$RESET_OLD_QUOTED_DEFNS_REJECT__METERS = makeSymbol("RESET-OLD-QUOTED-DEFNS-REJECT?-METERS");

    public static final SubLSymbol $quoted_defining_defns_status_meters$ = makeSymbol("*QUOTED-DEFINING-DEFNS-STATUS-METERS*");

    private static final SubLSymbol QUOTED_DEFINING_DEFNS_STATUS = makeSymbol("QUOTED-DEFINING-DEFNS-STATUS");

    private static final SubLSymbol RESET_QUOTED_DEFINING_DEFNS_STATUS_METERS = makeSymbol("RESET-QUOTED-DEFINING-DEFNS-STATUS-METERS");

    private static final SubLObject $$quotedDefnIff = reader_make_constant_shell(makeString("quotedDefnIff"));

    private static final SubLSymbol $sym67$_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS_ = makeSymbol("*QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS*");

    private static final SubLSymbol $sym68$QUOTED_SUFFICIENT_DEFNS_ADMIT_ = makeSymbol("QUOTED-SUFFICIENT-DEFNS-ADMIT?");

    private static final SubLSymbol $sym69$RESET_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS = makeSymbol("RESET-QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS");

    private static final SubLSymbol $sym70$_QUOTED_NECESSARY_DEFNS_REJECT__METERS_ = makeSymbol("*QUOTED-NECESSARY-DEFNS-REJECT?-METERS*");

    private static final SubLSymbol $sym71$QUOTED_NECESSARY_DEFNS_REJECT_ = makeSymbol("QUOTED-NECESSARY-DEFNS-REJECT?");

    private static final SubLSymbol $sym72$RESET_QUOTED_NECESSARY_DEFNS_REJECT__METERS = makeSymbol("RESET-QUOTED-NECESSARY-DEFNS-REJECT?-METERS");

    private static final SubLList $list73 = list(reader_make_constant_shell(makeString("quotedDefnIff")), reader_make_constant_shell(makeString("quotedDefnNecessary")));

    public static final SubLSymbol $rejected_by_quoted_necessary_defns_meters$ = makeSymbol("*REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS*");

    private static final SubLSymbol REJECTED_BY_QUOTED_NECESSARY_DEFNS = makeSymbol("REJECTED-BY-QUOTED-NECESSARY-DEFNS");

    private static final SubLSymbol RESET_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS = makeSymbol("RESET-REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS");

    private static final SubLObject $$quotedDefnNecessary = reader_make_constant_shell(makeString("quotedDefnNecessary"));

    private static final SubLString $str78$defn_stack_consistency_error___Ex = makeString("defn-stack consistency error.  Expected ~s to be on the top of the stack, but instead got ~s.");

    private static final SubLString $str79$recursive_call_of_defn__a_with_ar = makeString("recursive call of defn ~a with argument ~a");

    private static final SubLSymbol $sym80$_DEFN_ADMITS_INT__METERS_ = makeSymbol("*DEFN-ADMITS-INT?-METERS*");

    private static final SubLList $list81 = list(makeSymbol("DEFN"), makeSymbol("TERM"), makeSymbol("COLLECTION"));

    private static final SubLSymbol $sym82$DEFN_ADMITS_INT_ = makeSymbol("DEFN-ADMITS-INT?");

    private static final SubLSymbol $sym83$RESET_DEFN_ADMITS_INT__METERS = makeSymbol("RESET-DEFN-ADMITS-INT?-METERS");

    private static final SubLString $str84$__defn_test__term__s__defn__s_of_ = makeString("~%defn test: term ~s; defn ~s of collection ~s: ~s");

    private static final SubLString $str85$__defn_test__term__s__defn__s_of_ = makeString("~%defn test: term ~s; defn ~s of collection ~s (via ~s): ~s");

    private static final SubLString $str86$recursive_call_of_quoted_defn__a_ = makeString("recursive call of quoted defn ~a with argument ~a");

    private static final SubLSymbol $sym87$_QUOTED_DEFN_ADMITS_INT__METERS_ = makeSymbol("*QUOTED-DEFN-ADMITS-INT?-METERS*");

    private static final SubLSymbol $sym88$QUOTED_DEFN_ADMITS_INT_ = makeSymbol("QUOTED-DEFN-ADMITS-INT?");

    private static final SubLSymbol $sym89$RESET_QUOTED_DEFN_ADMITS_INT__METERS = makeSymbol("RESET-QUOTED-DEFN-ADMITS-INT?-METERS");

    private static final SubLSymbol DEFN_CYC_EVALUATE = makeSymbol("DEFN-CYC-EVALUATE");

    private static final SubLSymbol $defn_cyc_evaluate_caching_state$ = makeSymbol("*DEFN-CYC-EVALUATE-CACHING-STATE*");

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLString $str93$_s_has_invalid_defn___s = makeString("~s has invalid defn: ~s");

    private static final SubLString $str94$invalid_defn___s = makeString("invalid defn: ~s");

    private static final SubLString $str95$_s_has_non_viable_defn___s = makeString("~s has non-viable defn: ~s");

    private static final SubLString $str96$non_viable_defn___s = makeString("non-viable defn: ~s");

    private static final SubLSymbol $sym97$CYC_VAR_ = makeSymbol("CYC-VAR?");

    private static final SubLList $list98 = cons(makeSymbol("COL"), makeSymbol("DEFN-ASSERTIONS"));

    private static final SubLSymbol $sym99$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol $sym100$QUIET_HAS_TYPE_MEMOIZED_ = makeSymbol("QUIET-HAS-TYPE-MEMOIZED?");

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$Function_Denotational = reader_make_constant_shell(makeString("Function-Denotational"));

    private static final SubLObject $$SpecsFn = reader_make_constant_shell(makeString("SpecsFn"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));

    private static final SubLList $list105 = list(reader_make_constant_shell(makeString("BaseKB")));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));



    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));







    private static final SubLObject $$disjointWith = reader_make_constant_shell(makeString("disjointWith"));

    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));



    private static final SubLObject $$defnSufficient = reader_make_constant_shell(makeString("defnSufficient"));

    private static final SubLSymbol COLLECTIONS_ADMITTING_TERM_VIA_DEFNS_1 = makeSymbol("COLLECTIONS-ADMITTING-TERM-VIA-DEFNS-1");

    private static final SubLSymbol GATHER_COLLECTIONS_ADMITTING_VIA_DEFNS = makeSymbol("GATHER-COLLECTIONS-ADMITTING-VIA-DEFNS");

    private static final SubLString $str119$__warn__ = makeString("~%warn: ");



    private static final SubLString $str121$____defn_module_meters_ = makeString("~%~%defn module meters ");

    private static final SubLInteger $int$27 = makeInteger(27);

    private static final SubLString $str123$_ = makeString("*");

    private static final SubLString $str124$_____a__ = makeString("~%  ~a :");

    private static final SubLString $$$function = makeString("function");

    private static final SubLString $str126$___calls___ = makeString(" [ calls ] ");

    private static final SubLString $str127$___total_time___ = makeString(" [ total time ] ");

    private static final SubLString $str128$____avg_time____ = makeString(" [  avg time  ] ");

    private static final SubLString $str129$_s = makeString("~s");

    private static final SubLSymbol $sym130$_ = makeSymbol("+");

    private static final SubLString $str131$____a___ = makeString("   ~a   ");

    private static final SubLString $str132$_a = makeString("~a");

    public static final SubLString $$$_ = makeString(" ");

    private static final SubLInteger $int$46 = makeInteger(46);

    private static final SubLString $str135$_s_ = makeString("~s ");

    private static final SubLString $str136$_____a = makeString("~%~%~a");

    private static final SubLInteger $int$37 = makeInteger(37);

    private static final SubLString $str138$______call__ = makeString("~%  [ call ]");

    private static final SubLString $str139$____a___ = makeString(" [ ~a ] ");

    private static final SubLString $str140$____result____ = makeString(" [  result  ] ");

    private static final SubLString $str141$_____time_____ = makeString(" [   time   ] ");

    private static final SubLString $str142$____a = makeString("~% ~a");

    private static final SubLString $$$total = makeString("total");

    private static final SubLSymbol KBEQ = makeSymbol("KBEQ");

    private static final SubLSymbol ADD_SUF_DEFN = makeSymbol("ADD-SUF-DEFN");

    private static final SubLSymbol ADD_IFF_DEFN = makeSymbol("ADD-IFF-DEFN");



    private static final SubLString $$$skip_defn_op = makeString("skip defn op");

    private static final SubLString $str149$_s_is_not_a_collection_in__s = makeString("~s is not a collection in ~s");

    private static final SubLString $str150$_s_is_not_a_symbol = makeString("~s is not a symbol");

    private static final SubLSymbol OLD_ADD_SUF_DEFN = makeSymbol("OLD-ADD-SUF-DEFN");

    private static final SubLSymbol REMOVE_SUF_DEFN = makeSymbol("REMOVE-SUF-DEFN");

    private static final SubLSymbol REMOVE_IFF_DEFN = makeSymbol("REMOVE-IFF-DEFN");

    private static final SubLSymbol OLD_REMOVE_SUF_DEFN = makeSymbol("OLD-REMOVE-SUF-DEFN");

    public static final SubLSymbol $cache_suf_defn_meters$ = makeSymbol("*CACHE-SUF-DEFN-METERS*");

    private static final SubLList $list156 = list(makeSymbol("COL"), makeSymbol("ASSERTION"));

    private static final SubLSymbol CACHE_SUF_DEFN = makeSymbol("CACHE-SUF-DEFN");

    private static final SubLSymbol RESET_CACHE_SUF_DEFN_METERS = makeSymbol("RESET-CACHE-SUF-DEFN-METERS");

    public static final SubLSymbol $uncache_suf_defn_meters$ = makeSymbol("*UNCACHE-SUF-DEFN-METERS*");

    private static final SubLSymbol UNCACHE_SUF_DEFN = makeSymbol("UNCACHE-SUF-DEFN");

    private static final SubLSymbol RESET_UNCACHE_SUF_DEFN_METERS = makeSymbol("RESET-UNCACHE-SUF-DEFN-METERS");

    private static final SubLString $str162$___add_sufficent_defn__a__a_ = makeString("~%(add-sufficent-defn ~a ~a)");

    private static final SubLString $str163$removed_sufficient_defn_not_found = makeString("removed sufficient defn not found in cache: ~s");

    public static final SubLSymbol $old_handle_added_genl_for_suf_defns_meters$ = makeSymbol("*OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*");

    private static final SubLList $list165 = list(makeSymbol("SPEC"), makeSymbol("GENL"));

    private static final SubLSymbol OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS = makeSymbol("OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS");

    private static final SubLSymbol RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS = makeSymbol("RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS");

    public static final SubLSymbol $old_handle_removed_genl_for_suf_defns_meters$ = makeSymbol("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*");

    private static final SubLSymbol OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS = makeSymbol("OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS");

    private static final SubLSymbol RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS = makeSymbol("RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS");

    private static final SubLSymbol ADD_SUF_DEFN_ASSERTION = makeSymbol("ADD-SUF-DEFN-ASSERTION");

    private static final SubLSymbol REMOVE_SUF_DEFN_ASSERTION = makeSymbol("REMOVE-SUF-DEFN-ASSERTION");

    private static final SubLSymbol MERGE_SUF_DEFN_ASSERTIONS = makeSymbol("MERGE-SUF-DEFN-ASSERTIONS");

    private static final SubLSymbol REMOVE_SUF_DEFN_ASSERTIONS = makeSymbol("REMOVE-SUF-DEFN-ASSERTIONS");



    private static final SubLSymbol $sym176$_ = makeSymbol(">");

    private static final SubLSymbol ARG1_SPEC_CARDINALITY = makeSymbol("ARG1-SPEC-CARDINALITY");

    private static final SubLList $list178 = list(reader_make_constant_shell(makeString("defnIff")), reader_make_constant_shell(makeString("defnSufficient")));

    private static final SubLString $str179$Initializing_sufficient_defns_cac = makeString("Initializing sufficient defns cache...");

    private static final SubLSymbol ADD_SUF_QUOTED_DEFN = makeSymbol("ADD-SUF-QUOTED-DEFN");

    private static final SubLSymbol ADD_IFF_QUOTED_DEFN = makeSymbol("ADD-IFF-QUOTED-DEFN");

    private static final SubLString $$$skip_quoted_defn_op = makeString("skip quoted defn op");

    private static final SubLSymbol OLD_ADD_SUF_QUOTED_DEFN = makeSymbol("OLD-ADD-SUF-QUOTED-DEFN");

    private static final SubLSymbol REMOVE_SUF_QUOTED_DEFN = makeSymbol("REMOVE-SUF-QUOTED-DEFN");

    private static final SubLSymbol REMOVE_IFF_QUOTED_DEFN = makeSymbol("REMOVE-IFF-QUOTED-DEFN");

    private static final SubLSymbol OLD_REMOVE_SUF_QUOTED_DEFN = makeSymbol("OLD-REMOVE-SUF-QUOTED-DEFN");

    public static final SubLSymbol $cache_suf_quoted_defn_meters$ = makeSymbol("*CACHE-SUF-QUOTED-DEFN-METERS*");

    private static final SubLSymbol CACHE_SUF_QUOTED_DEFN = makeSymbol("CACHE-SUF-QUOTED-DEFN");

    private static final SubLSymbol RESET_CACHE_SUF_QUOTED_DEFN_METERS = makeSymbol("RESET-CACHE-SUF-QUOTED-DEFN-METERS");

    public static final SubLSymbol $uncache_suf_quoted_defn_meters$ = makeSymbol("*UNCACHE-SUF-QUOTED-DEFN-METERS*");

    private static final SubLSymbol UNCACHE_SUF_QUOTED_DEFN = makeSymbol("UNCACHE-SUF-QUOTED-DEFN");

    private static final SubLSymbol RESET_UNCACHE_SUF_QUOTED_DEFN_METERS = makeSymbol("RESET-UNCACHE-SUF-QUOTED-DEFN-METERS");

    private static final SubLString $str193$___add_sufficent_quoted_defn__a__ = makeString("~%(add-sufficent-quoted-defn ~a ~a)");

    private static final SubLString $str194$removed_sufficient_quoted_defn_no = makeString("removed sufficient quoted defn not found in cache: ~s");

    private static final SubLString $str195$___remove_sufficent_quoted_defn__ = makeString("~%(remove-sufficent-quoted-defn ~a ~a)");

    public static final SubLSymbol $old_handle_added_genl_for_suf_quoted_defns_meters$ = makeSymbol("*OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");

    private static final SubLSymbol OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS = makeSymbol("OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS");

    private static final SubLSymbol RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = makeSymbol("RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");

    public static final SubLSymbol $old_handle_removed_genl_for_suf_quoted_defns_meters$ = makeSymbol("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*");

    private static final SubLSymbol OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS = makeSymbol("OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS");

    private static final SubLSymbol RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS = makeSymbol("RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS");

    private static final SubLSymbol ADD_SUF_QUOTED_DEFN_ASSERTION = makeSymbol("ADD-SUF-QUOTED-DEFN-ASSERTION");

    private static final SubLSymbol REMOVE_SUF_QUOTED_DEFN_ASSERTION = makeSymbol("REMOVE-SUF-QUOTED-DEFN-ASSERTION");

    private static final SubLSymbol MERGE_SUF_QUOTED_DEFN_ASSERTIONS = makeSymbol("MERGE-SUF-QUOTED-DEFN-ASSERTIONS");

    private static final SubLSymbol REMOVE_SUF_QUOTED_DEFN_ASSERTIONS = makeSymbol("REMOVE-SUF-QUOTED-DEFN-ASSERTIONS");

    private static final SubLList $list206 = list(reader_make_constant_shell(makeString("quotedDefnIff")), reader_make_constant_shell(makeString("quotedDefnSufficient")));

    private static final SubLString $str207$Initializing_sufficient_quoted_de = makeString("Initializing sufficient quoted defns cache...");



    private static final SubLSymbol ADD_SUF_FUNCTION = makeSymbol("ADD-SUF-FUNCTION");

    private static final SubLSymbol REMOVE_SUF_FUNCTION = makeSymbol("REMOVE-SUF-FUNCTION");

    private static final SubLSymbol ADD_SUF_QUOTED_FUNCTION = makeSymbol("ADD-SUF-QUOTED-FUNCTION");

    private static final SubLSymbol REMOVE_SUF_QUOTED_FUNCTION = makeSymbol("REMOVE-SUF-QUOTED-FUNCTION");

    private static final SubLObject $$evaluationResultQuotedIsa = reader_make_constant_shell(makeString("evaluationResultQuotedIsa"));

    private static final SubLString $str214$oh_well___ = makeString("oh well...");

    private static final SubLString $str215$_s_is_not_a_evaluatable_functor_i = makeString("~s is not a evaluatable functor in ~s");

    private static final SubLString $str216$_s_is_not_a_functor_in__s = makeString("~s is not a functor in ~s");

    private static final SubLSymbol ADD_SUF_FUNCTION_INT = makeSymbol("ADD-SUF-FUNCTION-INT");

    private static final SubLSymbol REMOVE_SUF_FUNCTION_INT = makeSymbol("REMOVE-SUF-FUNCTION-INT");

    public static final SubLSymbol $cache_suf_function_meters$ = makeSymbol("*CACHE-SUF-FUNCTION-METERS*");

    private static final SubLList $list220 = list(makeSymbol("COL"), makeSymbol("ASSERTION"), makeSymbol("TYPE"));

    private static final SubLSymbol CACHE_SUF_FUNCTION = makeSymbol("CACHE-SUF-FUNCTION");

    private static final SubLSymbol RESET_CACHE_SUF_FUNCTION_METERS = makeSymbol("RESET-CACHE-SUF-FUNCTION-METERS");

    public static final SubLSymbol $uncache_suf_function_meters$ = makeSymbol("*UNCACHE-SUF-FUNCTION-METERS*");

    private static final SubLSymbol UNCACHE_SUF_FUNCTION = makeSymbol("UNCACHE-SUF-FUNCTION");

    private static final SubLSymbol RESET_UNCACHE_SUF_FUNCTION_METERS = makeSymbol("RESET-UNCACHE-SUF-FUNCTION-METERS");

    private static final SubLString $str226$____a__a__a_ = makeString("~%(~a ~a ~a)");

    private static final SubLString $str227$add_sufficient_function = makeString("add-sufficient-function");

    private static final SubLString $str228$add_sufficient_quoted_function = makeString("add-sufficient-quoted-function");

    private static final SubLString $str229$removed_sufficient_function_not_f = makeString("removed sufficient function not found in cache: ~s");

    private static final SubLString $str230$remove_sufficient_function = makeString("remove-sufficient-function");

    private static final SubLString $str231$remove_sufficient_quoted_function = makeString("remove-sufficient-quoted-function");

    public static final SubLSymbol $handle_added_genl_for_suf_functions_meters$ = makeSymbol("*HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS*");

    private static final SubLSymbol HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS = makeSymbol("HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS");

    private static final SubLSymbol RESET_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS = makeSymbol("RESET-HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS");

    private static final SubLList $list235 = list(makeKeyword("ISA"), makeKeyword("QUOTED-ISA"));

    public static final SubLSymbol $handle_removed_genl_for_suf_functions_meters$ = makeSymbol("*HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS*");

    private static final SubLSymbol HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS = makeSymbol("HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS");

    private static final SubLSymbol RESET_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS = makeSymbol("RESET-HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS");

    private static final SubLSymbol ADD_SUF_FUNCTION_ASSERTION = makeSymbol("ADD-SUF-FUNCTION-ASSERTION");

    private static final SubLSymbol ADD_SUF_QUOTED_FUNCTION_ASSERTION = makeSymbol("ADD-SUF-QUOTED-FUNCTION-ASSERTION");

    private static final SubLSymbol REMOVE_SUF_FUNCTION_ASSERTION = makeSymbol("REMOVE-SUF-FUNCTION-ASSERTION");

    private static final SubLSymbol REMOVE_SUF_QUOTED_FUNCTION_ASSERTION = makeSymbol("REMOVE-SUF-QUOTED-FUNCTION-ASSERTION");

    private static final SubLSymbol MERGE_SUF_FUNCTION_ASSERTIONS = makeSymbol("MERGE-SUF-FUNCTION-ASSERTIONS");

    private static final SubLSymbol MERGE_SUF_QUOTED_FUNCTION_ASSERTIONS = makeSymbol("MERGE-SUF-QUOTED-FUNCTION-ASSERTIONS");

    private static final SubLSymbol REMOVE_SUF_FUNCTION_ASSERTIONS = makeSymbol("REMOVE-SUF-FUNCTION-ASSERTIONS");

    private static final SubLSymbol REMOVE_SUF_QUOTED_FUNCTION_ASSERTIONS = makeSymbol("REMOVE-SUF-QUOTED-FUNCTION-ASSERTIONS");

    private static final SubLString $str247$___add_sufficent_function__a__a_ = makeString("~%(add-sufficent-function ~a ~a)");

    private static final SubLString $str248$remove_sufficent_function = makeString("remove-sufficent-function");

    private static final SubLSymbol SUF_FUNCTION_SORT_PRED = makeSymbol("SUF-FUNCTION-SORT-PRED");



    private static final SubLList $list251 = list(reader_make_constant_shell(makeString("resultIsa")));

    private static final SubLList $list252 = list(reader_make_constant_shell(makeString("evaluationResultQuotedIsa")), reader_make_constant_shell(makeString("resultQuotedIsa")));

    private static final SubLString $str253$Initializing_sufficient_functions = makeString("Initializing sufficient functions cache...");

    private static final SubLString $str254$Initializing_sufficient_quoted_fu = makeString("Initializing sufficient quoted functions cache...");

    private static final SubLString $$$cdohash = makeString("cdohash");

    private static final SubLString $$$stop = makeString("stop");



    private static final SubLString $str258$diagnostics__sufficient_functions = makeString("diagnostics: sufficient-functions-cache");

    private static final SubLString $str259$___suf_function_cache_mal_keys___ = makeString("~%*suf-function-cache-mal-keys* : ~a");

    private static final SubLString $str260$___suf_function_cache_key_w_o_val = makeString("~%*suf-function-cache-key-w/o-value* : ~a");

    private static final SubLString $str261$___suf_function_cache_key_w_mal_v = makeString("~%*suf-function-cache-key-w/mal-value* : ~a");

    private static final SubLString $str262$___suf_function_cache_key_w_stale = makeString("~%*suf-function-cache-key-w/stale-value* : ~a");

    private static final SubLString $str263$___suf_function_cache_keys_w_o_in = makeString("~%*suf-function-cache-keys-w/o-inerited-value* : ~a");

    private static final SubLString $str264$___suf_function_cache_awol_direct = makeString("~%*suf-function-cache-awol-direct-assertions* : ~a");

    private static final SubLObject $$SkolemFunction = reader_make_constant_shell(makeString("SkolemFunction"));

    private static final SubLString $$$mapping_skolems = makeString("mapping skolems");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str268$_a_ = makeString("~a ");

    public static SubLObject suf_defn_cache_as_alist() {
        return defns.defns_cache_hash_table_to_alist(defns.$suf_defn_cache_index$.getGlobalValue());
    }

    public static SubLObject suf_defn_cache_get(final SubLObject collection) {
        return defns.defns_cache_gethash_without_values(collection, defns.$suf_defn_cache_index$.getGlobalValue());
    }

    public static SubLObject suf_defn_cache_add(final SubLObject col, final SubLObject assertion) {
        final SubLObject new_val = suf_defn_sort(cons(assertion, defns.defns_cache_gethash_without_values(col, defns.$suf_defn_cache_index$.getGlobalValue())));
        if (NIL != new_val) {
            defns.defns_cache_sethash(col, defns.$suf_defn_cache_index$.getGlobalValue(), new_val);
        }
        return new_val;
    }

    public static SubLObject suf_defn_cache_rem(final SubLObject col, final SubLObject assertion) {
        final SubLObject new_val = suf_defn_sort(delete(assertion, defns.defns_cache_gethash_without_values(col, defns.$suf_defn_cache_index$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if (NIL != new_val) {
            defns.defns_cache_sethash(col, defns.$suf_defn_cache_index$.getGlobalValue(), new_val);
        } else {
            defns.defns_cache_remhash(col, defns.$suf_defn_cache_index$.getGlobalValue());
        }
        return new_val;
    }

    public static SubLObject suf_defn_cache_merge(final SubLObject collection, final SubLObject defn_assertions) {
        return defns.defns_cache_sethash(collection, defns.$suf_defn_cache_index$.getGlobalValue(), suf_defn_sort(nunion(defns.defns_cache_gethash_without_values(collection, defns.$suf_defn_cache_index$.getGlobalValue()), copy_list(defn_assertions), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject remove_suf_defn_assertions(final SubLObject collection, SubLObject defn_assertions) {
        if (defn_assertions == UNPROVIDED) {
            defn_assertions = at_vars.$at_defns$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == defn_genl_searchedP(collection)) {
            final SubLObject assertions = suf_defn_cache_get(collection);
            if (NIL != assertions) {
                SubLObject assertions_to_remove = NIL;
                SubLObject cdolist_list_var = defn_assertions;
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == assertions_high.valid_assertion(assertion, UNPROVIDED)) || (NIL == genls.genlP(assertions_high.gaf_arg1(assertion), collection, UNPROVIDED, UNPROVIDED))) {
                        assertions_to_remove = cons(assertion, assertions_to_remove);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
                if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                    cdolist_list_var = assertions_to_remove;
                    assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        defn_note(FOUR_INTEGER, $str0$___remove_sufficent_defn__a__a_, collection, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                }
                final SubLObject new_value = suf_defn_sort(nset_difference(assertions, assertions_to_remove, UNPROVIDED, UNPROVIDED));
                if (NIL != new_value) {
                    defns.defns_cache_sethash(collection, defns.$suf_defn_cache_index$.getGlobalValue(), new_value);
                } else {
                    defns.defns_cache_remhash(collection, defns.$suf_defn_cache_index$.getGlobalValue());
                }
                return new_value;
            }
        }
        return NIL;
    }

    public static SubLObject clear_suf_defns() {
        defns.defns_cache_clrhash(defns.$suf_defn_cache_index$.getGlobalValue());
        return NIL;
    }

    public static SubLObject sort_suf_defn_cache() {
        final SubLObject cdohash_table = defns.get_defn_cache_from_index(defns.$suf_defn_cache_index$.getGlobalValue());
        SubLObject fort = NIL;
        SubLObject suf_defn_assertions = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                fort = getEntryKey(cdohash_entry);
                suf_defn_assertions = getEntryValue(cdohash_entry);
                defns.defns_cache_sethash(fort, defns.$suf_defn_cache_index$.getGlobalValue(), suf_defn_sort(suf_defn_assertions));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject suf_quoted_defn_cache_as_alist() {
        return defns.defns_cache_hash_table_to_alist(defns.$suf_quoted_defn_cache_index$.getGlobalValue());
    }

    public static SubLObject suf_quoted_defn_cache_get(final SubLObject collection) {
        return defns.defns_cache_gethash_without_values(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue());
    }

    public static SubLObject suf_quoted_defn_cache_add(final SubLObject col, final SubLObject assertion) {
        final SubLObject new_val = suf_defn_sort(cons(assertion, defns.defns_cache_gethash_without_values(col, defns.$suf_quoted_defn_cache_index$.getGlobalValue())));
        if (NIL != new_val) {
            defns.defns_cache_sethash(col, defns.$suf_quoted_defn_cache_index$.getGlobalValue(), new_val);
        }
        return new_val;
    }

    public static SubLObject suf_quoted_defn_cache_rem(final SubLObject col, final SubLObject assertion) {
        final SubLObject new_val = suf_defn_sort(delete(assertion, defns.defns_cache_gethash_without_values(col, defns.$suf_quoted_defn_cache_index$.getGlobalValue()), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if (NIL != new_val) {
            defns.defns_cache_sethash(col, defns.$suf_quoted_defn_cache_index$.getGlobalValue(), new_val);
        } else {
            defns.defns_cache_remhash(col, defns.$suf_quoted_defn_cache_index$.getGlobalValue());
        }
        return new_val;
    }

    public static SubLObject suf_quoted_defn_cache_merge(final SubLObject collection, final SubLObject defn_assertions) {
        return defns.defns_cache_sethash(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue(), suf_defn_sort(nunion(defns.defns_cache_gethash_without_values(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue()), copy_list(defn_assertions), UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject remove_suf_quoted_defn_assertions(final SubLObject collection, SubLObject defn_assertions) {
        if (defn_assertions == UNPROVIDED) {
            defn_assertions = at_vars.$at_defns$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == defn_genl_searchedP(collection)) {
            final SubLObject assertions = defns.defns_cache_gethash_without_values(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue());
            if (NIL != assertions) {
                SubLObject assertions_to_remove = NIL;
                SubLObject cdolist_list_var = defn_assertions;
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == assertions_high.valid_assertion(assertion, UNPROVIDED)) || (NIL == genls.genlP(assertions_high.gaf_arg1(assertion), collection, UNPROVIDED, UNPROVIDED))) {
                        assertions_to_remove = cons(assertion, assertions_to_remove);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
                if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                    cdolist_list_var = assertions_to_remove;
                    assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        defn_note(FOUR_INTEGER, $str0$___remove_sufficent_defn__a__a_, collection, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                }
                final SubLObject new_value = suf_defn_sort(nset_difference(assertions, assertions_to_remove, UNPROVIDED, UNPROVIDED));
                if (NIL != new_value) {
                    defns.defns_cache_sethash(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue(), new_value);
                } else {
                    defns.defns_cache_remhash(collection, defns.$suf_quoted_defn_cache_index$.getGlobalValue());
                }
                return new_value;
            }
        }
        return NIL;
    }

    public static SubLObject clear_suf_quoted_defns() {
        defns.defns_cache_clrhash(defns.$suf_quoted_defn_cache_index$.getGlobalValue());
        return NIL;
    }

    public static SubLObject sort_suf_quoted_defn_cache() {
        final SubLObject cdohash_table = defns.get_defn_cache_from_index(defns.$suf_quoted_defn_cache_index$.getGlobalValue());
        SubLObject fort = NIL;
        SubLObject suf_quoted_defn_assertions = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                fort = getEntryKey(cdohash_entry);
                suf_quoted_defn_assertions = getEntryValue(cdohash_entry);
                defns.defns_cache_sethash(fort, defns.$suf_quoted_defn_cache_index$.getGlobalValue(), suf_defn_sort(suf_quoted_defn_assertions));
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return NIL;
    }

    public static SubLObject at_defns_admitP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
            return NIL;
        }
        final SubLObject pcase_var = get_defn_col_history(collection);
        if (pcase_var.eql($ADMITTED)) {
            return T;
        }
        if (pcase_var.eql($REJECTED)) {
            return NIL;
        }
        final SubLObject admitsP = defns_admitP(collection, at_vars.$at_arg$.getDynamicValue(thread), UNPROVIDED);
        if (NIL != admitsP) {
            set_defn_col_history(collection, $ADMITTED);
        } else {
            set_defn_col_history(collection, $REJECTED);
        }
        return admitsP;
    }

    public static SubLObject at_defns_rejectP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
            return NIL;
        }
        final SubLObject pcase_var = get_defn_col_history(collection);
        if (pcase_var.eql($ADMITTED)) {
            return NIL;
        }
        if (pcase_var.eql($REJECTED)) {
            return T;
        }
        final SubLObject rejectsP = defns_rejectP(collection, at_vars.$at_arg$.getDynamicValue(thread), UNPROVIDED);
        if (NIL != rejectsP) {
            set_defn_col_history(collection, $REJECTED);
        } else {
            set_defn_col_history(collection, $ADMITTED);
        }
        return rejectsP;
    }

    public static SubLObject defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_defns_admitP(collection, v_term, mt);
        }
        return old_defns_admitP(collection, v_term, mt);
    }

    public static SubLObject reset_old_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $old_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $old_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $old_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $old_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $old_defns_admitP_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $old_defns_admitP_meters$.getDynamicValue(thread), $sym11$OLD_DEFNS_ADMIT_);
        return NIL;
    }

    public static SubLObject old_defns_admitP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != isa.isaP(v_term, collection, mt, UNPROVIDED)) {
            return T;
        }
        SubLObject admittedP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = defining_defns_status(collection, v_term, mt);
                if (pcase_var.eql($ADMITTED)) {
                    admittedP = T;
                } else
                    if (!pcase_var.eql($REJECTED)) {
                        admittedP = makeBoolean(((NIL != suf_defn_assertions(collection)) && ((NIL == at_vars.$at_apply_necessary_defnsP$.getDynamicValue(thread)) || (NIL != necessary_defns_permitP(collection, v_term, mt)))) && (NIL != sufficient_defns_admitP(collection, v_term, mt)));
                    }

            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        if ((NIL == admittedP) && (NIL != cycl_grammar.fast_quote_term_p(v_term))) {
            final SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, UNPROVIDED);
            if ((NIL != denoted_term) && (NIL != quoted_defns_admitP(collection, denoted_term, mt))) {
                admittedP = T;
            }
        }
        return admittedP;
    }

    public static SubLObject old_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = old_defns_admitP_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $old_defns_admitP_meters$.getDynamicValue(thread), add(gethash($CALLS, $old_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $old_defns_admitP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $old_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $old_defns_admitP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $old_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $old_defns_admitP_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $old_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return old_defns_admitP_metered(collection, v_term, mt);
    }

    public static SubLObject defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_defns_rejectP(collection, v_term, mt);
        }
        return old_defns_rejectP(collection, v_term, mt);
    }

    public static SubLObject reset_old_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $old_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $old_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $old_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $old_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $old_defns_rejectP_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $old_defns_rejectP_meters$.getDynamicValue(thread), $sym15$OLD_DEFNS_REJECT_);
        return NIL;
    }

    public static SubLObject old_defns_rejectP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != isa.isaP(v_term, collection, mt, UNPROVIDED)) {
            return NIL;
        }
        SubLObject rejected = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = defining_defns_status(collection, v_term, mt);
                if (!pcase_var.eql($ADMITTED)) {
                    if (pcase_var.eql($REJECTED)) {
                        rejected = T;
                    } else {
                        rejected = necessary_defns_rejectP(collection, v_term, mt);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        if ((NIL == rejected) && (NIL != cycl_grammar.fast_quote_term_p(v_term))) {
            final SubLObject denoted_term = czer_main.unquote_quoted_term(v_term, UNPROVIDED);
            if ((NIL != denoted_term) && (NIL != quoted_defns_rejectP(collection, denoted_term, mt))) {
                rejected = T;
            }
        }
        return rejected;
    }

    public static SubLObject old_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = old_defns_rejectP_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $old_defns_rejectP_meters$.getDynamicValue(thread), add(gethash($CALLS, $old_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $old_defns_rejectP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $old_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $old_defns_rejectP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $old_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $old_defns_rejectP_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $old_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return old_defns_rejectP_metered(collection, v_term, mt);
    }

    public static SubLObject defining_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                result = defining_defns_status(collection, v_term, mt);
            } finally {
                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return eq($ADMITTED, result);
    }

    public static SubLObject defining_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                result = defining_defns_status(collection, v_term, mt);
            } finally {
                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return eq($REJECTED, result);
    }

    public static SubLObject reset_defining_defns_status_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $defining_defns_status_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $defining_defns_status_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $defining_defns_status_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $defining_defns_status_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $defining_defns_status_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $defining_defns_status_meters$.getDynamicValue(thread), DEFINING_DEFNS_STATUS);
        return NIL;
    }

    public static SubLObject defining_defns_status_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defn = cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_relevant_mts(collection, $$defnIff, mt, ONE_INTEGER, TWO_INTEGER, $TRUE));
        SubLObject status = NIL;
        if (NIL != viable_defnP(defn, collection)) {
            final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
            try {
                at_vars.$defn_collection$.bind(collection, thread);
                if (NIL != defn_admitsP(defn, v_term, collection, mt)) {
                    status = $ADMITTED;
                } else
                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                        status = $REJECTED;
                        at_utilities.note_at_violation(defining_defn_violation_data(collection, v_term, defn, NIL, mt));
                    } else {
                        status = $REJECTED;
                    }

            } finally {
                at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
            }
        }
        return status;
    }

    public static SubLObject defining_defns_status(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = defining_defns_status_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $defining_defns_status_meters$.getDynamicValue(thread), add(gethash($CALLS, $defining_defns_status_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $defining_defns_status_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $defining_defns_status_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $defining_defns_status_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $defining_defns_status_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $defining_defns_status_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $defining_defns_status_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return defining_defns_status_metered(collection, v_term, mt);
    }

    public static SubLObject defining_defn_violation_data(final SubLObject collection, final SubLObject v_term, final SubLObject defn, final SubLObject quotedP, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = NIL;
        if (((NIL != at_vars.$at_source$.getDynamicValue(thread)) && (NIL != at_vars.$at_reln$.getDynamicValue(thread))) && (!at_vars.$at_source$.getDynamicValue(thread).eql(at_vars.$at_reln$.getDynamicValue(thread)))) {
            data = cons(list($VIA_GENL_PRED, at_vars.$at_source$.getDynamicValue(thread)), data);
        }
        if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != at_vars.$at_constraint_gaf$.getDynamicValue(thread))) {
            data = cons(list($AT_CONSTRAINT_GAF, at_vars.$at_constraint_gaf$.getDynamicValue(thread)), data);
        }
        if (NIL != mt) {
            data = cons(mt, data);
        } else {
            data = cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
        }
        if (NIL != quotedP) {
            return listS($MAL_ARG_WRT_QUOTED_IFF_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, defn, data });
        }
        return listS($MAL_ARG_WRT_IFF_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, defn, data });
    }

    public static SubLObject reset_sufficient_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $sufficient_defns_admitP_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $sufficient_defns_admitP_meters$.getDynamicValue(thread), $sym27$SUFFICIENT_DEFNS_ADMIT_);
        return NIL;
    }

    public static SubLObject sufficient_defns_admitP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sufficient_defns_admit_int(collection, v_term, suf_defn_assertions(collection), NIL, mt);
    }

    public static SubLObject sufficient_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = sufficient_defns_admitP_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), add(gethash($CALLS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $sufficient_defns_admitP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $sufficient_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $sufficient_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return sufficient_defns_admitP_metered(collection, v_term, mt);
    }

    public static SubLObject sufficient_defns_admit_int(final SubLObject collection, final SubLObject v_term, final SubLObject defn_assertions, SubLObject quotedP, SubLObject mt) {
        if (quotedP == UNPROVIDED) {
            quotedP = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admittedP = NIL;
        SubLObject failing_defns = NIL;
        SubLObject at_violations = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_violations$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            at_vars.$at_violations$.bind(NIL, thread);
            if (NIL == admittedP) {
                SubLObject csome_list_var = defn_assertions;
                SubLObject assertion = NIL;
                assertion = csome_list_var.first();
                while ((NIL == admittedP) && (NIL != csome_list_var)) {
                    if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                        final SubLObject _prev_bind_0_$5 = at_vars.$defn_collection$.currentBinding(thread);
                        try {
                            at_vars.$defn_collection$.bind(assertions_high.gaf_arg1(assertion), thread);
                            final SubLObject defn_mt = assertions_high.assertion_mt(assertion);
                            if ((NIL != mt_relevance_macros.relevant_mtP(defn_mt)) && (NIL != genls.genlP(at_vars.$defn_collection$.getDynamicValue(thread), collection, mt, UNPROVIDED))) {
                                final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                if (NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                                    final SubLObject _prev_bind_0_$6 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$7 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$8 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                                    try {
                                        at_vars.$noting_at_violationsP$.bind(NIL, thread);
                                        at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                                        wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                                        wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                                        if ((NIL == quotedP) && (NIL != defn_admitsP(defn, v_term, collection, mt))) {
                                            admittedP = T;
                                        } else
                                            if ((NIL != quotedP) && (NIL != quoted_defn_admitsP(defn, v_term, collection, mt))) {
                                                admittedP = T;
                                            }

                                    } finally {
                                        wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
                                        wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2_$8, thread);
                                        at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1_$7, thread);
                                        at_vars.$noting_at_violationsP$.rebind(_prev_bind_0_$6, thread);
                                    }
                                    if ((NIL == admittedP) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        final SubLObject item_var = at_vars.$defn_collection$.getDynamicValue(thread);
                                        if (NIL == member(item_var, failing_defns, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            failing_defns = cons(item_var, failing_defns);
                                        }
                                    }
                                }
                            }
                        } finally {
                            at_vars.$defn_collection$.rebind(_prev_bind_0_$5, thread);
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                } 
            }
            if (NIL == admittedP) {
                at_violations = at_vars.$at_violations$.getDynamicValue(thread);
            }
        } finally {
            at_vars.$at_violations$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (((NIL == admittedP) && (NIL != failing_defns)) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
            SubLObject cdolist_list_var = at_violations;
            SubLObject at_violation = NIL;
            at_violation = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                at_utilities.note_at_violation(at_violation);
                cdolist_list_var = cdolist_list_var.rest();
                at_violation = cdolist_list_var.first();
            } 
            at_utilities.note_at_violation(sufficient_defn_violation_data(collection, v_term, failing_defns, quotedP, mt));
        }
        return admittedP;
    }

    public static SubLObject why_sufficient_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$9 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$10 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    if (NIL == just) {
                        SubLObject csome_list_var = suf_defn_assertions(collection);
                        SubLObject assertion = NIL;
                        assertion = csome_list_var.first();
                        while ((NIL == just) && (NIL != csome_list_var)) {
                            if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                final SubLObject _prev_bind_0_$10 = at_vars.$defn_collection$.currentBinding(thread);
                                try {
                                    at_vars.$defn_collection$.bind(assertions_high.gaf_arg1(assertion), thread);
                                    final SubLObject defn_mt = assertions_high.assertion_mt(assertion);
                                    if (NIL != mt_relevance_macros.relevant_mtP(defn_mt)) {
                                        final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                        if (NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                                            if (NIL != isa.isaP(v_term, at_vars.$defn_collection$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                                just = isa.why_isaP(v_term, at_vars.$defn_collection$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (NIL != quiet_defn_admitsP(defn, v_term, collection, mt)) {
                                                    if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                        just = genls.why_genlP(at_vars.$defn_collection$.getDynamicValue(thread), collection, mt, UNPROVIDED, UNPROVIDED);
                                                    }
                                                    just = cons(list(assertions_high.assertion_formula(assertion), $TRUE), just);
                                                }

                                        }
                                    }
                                } finally {
                                    at_vars.$defn_collection$.rebind(_prev_bind_0_$10, thread);
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            assertion = csome_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$10, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$9, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return just;
    }

    public static SubLObject sufficient_defn_violation_data(final SubLObject collection, final SubLObject v_term, final SubLObject v_defns, final SubLObject quotedP, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = NIL;
        if (((NIL != at_vars.$at_source$.getDynamicValue(thread)) && (NIL != at_vars.$at_reln$.getDynamicValue(thread))) && (!at_vars.$at_source$.getDynamicValue(thread).eql(at_vars.$at_reln$.getDynamicValue(thread)))) {
            data = cons(list($VIA_GENL_PRED, at_vars.$at_source$.getDynamicValue(thread)), data);
        }
        if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != at_vars.$at_constraint_gaf$.getDynamicValue(thread))) {
            data = cons(list($AT_CONSTRAINT_GAF, at_vars.$at_constraint_gaf$.getDynamicValue(thread)), data);
        }
        if (NIL != mt) {
            data = cons(mt, data);
        } else {
            data = cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
        }
        if (NIL != quotedP) {
            return listS($MAL_ARG_WRT_QUOTED_SUF_DEFNS, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, v_defns, data });
        }
        return listS($MAL_ARG_WRT_SUF_DEFNS, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, v_defns, data });
    }

    public static SubLObject necessary_defns_permitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(NIL == necessary_defns_rejectP(collection, v_term, mt));
    }

    public static SubLObject reset_necessary_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $necessary_defns_rejectP_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $necessary_defns_rejectP_meters$.getDynamicValue(thread), $sym32$NECESSARY_DEFNS_REJECT_);
        return NIL;
    }

    public static SubLObject necessary_defns_rejectP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejectedP = NIL;
        SubLObject doneP = NIL;
        if ((NIL == denotational_term_admitted_by_defn_via_isaP(v_term, collection, mt)) && (NIL == doneP)) {
            SubLObject node_var = collection;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$13 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$14 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$15 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$15 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$16 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$18 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$16 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$17 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while ((NIL != node_var) && (NIL == doneP)) {
                                            final SubLObject genl = node_var;
                                            final SubLObject _prev_bind_0_$17 = at_vars.$defn_collection$.currentBinding(thread);
                                            try {
                                                at_vars.$defn_collection$.bind(genl, thread);
                                                if (NIL == doneP) {
                                                    SubLObject csome_list_var = $list46;
                                                    SubLObject defn_pred = NIL;
                                                    defn_pred = csome_list_var.first();
                                                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject rejectedP_$23 = necessary_defns_rejectP_int(collection, v_term, genl, defn_pred, NIL, mt);
                                                        final SubLObject doneP_$24 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        rejectedP = rejectedP_$23;
                                                        doneP = doneP_$24;
                                                        csome_list_var = csome_list_var.rest();
                                                        defn_pred = csome_list_var.first();
                                                    } 
                                                }
                                            } finally {
                                                at_vars.$defn_collection$.rebind(_prev_bind_0_$17, thread);
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$18;
                                            SubLObject _prev_bind_1_$18;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$27;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$19;
                                            SubLObject iteration_state_$29;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$20;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$31;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$21;
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
                                                _prev_bind_0_$18 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$27 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$27)) {
                                                                        _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$27, thread);
                                                                            for (iteration_state_$29 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$29)); iteration_state_$29 = dictionary_contents.do_dictionary_contents_next(iteration_state_$29)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$29);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
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
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                                        node_vars_link_node2 = csome_list_var2.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$20, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$29);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$19, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$31 = NIL, rest_$31 = new_list; (NIL == doneP) && (NIL != rest_$31); rest_$31 = rest_$31.rest()) {
                                                                generating_fn = rest_$31.first();
                                                                _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
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
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$21, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$18, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$18, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$19, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$17, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$16, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$18, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$16, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$15, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$15, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$14, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$13, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return rejectedP;
    }

    public static SubLObject necessary_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = necessary_defns_rejectP_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), add(gethash($CALLS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $necessary_defns_rejectP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $necessary_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $necessary_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return necessary_defns_rejectP_metered(collection, v_term, mt);
    }

    public static SubLObject necessary_defns_rejectP_int(final SubLObject collection, final SubLObject v_term, final SubLObject genl, final SubLObject defn_pred, final SubLObject quotedP, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejectedP = NIL;
        SubLObject doneP = NIL;
        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, ONE_INTEGER, defn_pred)) {
            final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, ONE_INTEGER, defn_pred);
            SubLObject done_var = doneP;
            final SubLObject token_var = NIL;
            while (NIL == done_var) {
                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                if (NIL != valid) {
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                        SubLObject done_var_$34 = doneP;
                        final SubLObject token_var_$35 = NIL;
                        while (NIL == done_var_$34) {
                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$35);
                            final SubLObject valid_$36 = makeBoolean(!token_var_$35.eql(assertion));
                            if (NIL != valid_$36) {
                                final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                if (NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                                    if ((NIL == quotedP) && (NIL == defn_admitsP(defn, v_term, collection, UNPROVIDED))) {
                                        rejectedP = T;
                                    } else
                                        if ((NIL != quotedP) && (NIL == quoted_defn_admitsP(defn, v_term, collection, UNPROVIDED))) {
                                            rejectedP = T;
                                        }

                                    if ((NIL != rejectedP) && (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread))) {
                                        at_utilities.note_at_violation(necessary_defn_violation_data(collection, v_term, at_vars.$defn_collection$.getDynamicValue(thread), defn, quotedP, mt));
                                    }
                                    if (NIL == czer_vars.$accumulating_semantic_violationsP$.getDynamicValue(thread)) {
                                        doneP = T;
                                    }
                                }
                            }
                            done_var_$34 = makeBoolean((NIL == valid_$36) || (NIL != doneP));
                        } 
                    } finally {
                        final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                done_var = makeBoolean((NIL == valid) || (NIL != doneP));
            } 
        }
        return values(rejectedP, doneP);
    }

    public static SubLObject denotational_term_admitted_by_defn_via_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admittedP = NIL;
        if (NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP()) {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    admittedP = makeBoolean((NIL != at_denotational_term_p(v_term, UNPROVIDED)) && (((NIL != isa.isaP(v_term, collection, mt, UNPROVIDED)) || ((((NIL != assertions_high.gaf_assertionP(sbhl_link_vars.$added_assertion$.getDynamicValue(thread))) && (NIL != isa_litP(assertions_high.gaf_formula(sbhl_link_vars.$added_assertion$.getDynamicValue(thread))))) && v_term.equal(assertions_high.gaf_arg1(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)))) && (NIL != genls.genlsP(assertions_high.gaf_arg2(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)), collection, mt, UNPROVIDED)))) || (((((((NIL != wff_macros.within_wffP()) && (NIL != within_assertP())) && (NIL != isa_litP(wff_vars.wff_formula()))) && v_term.equal(cycl_utilities.sentence_arg1(wff_vars.wff_formula(), UNPROVIDED))) && (NIL != term.el_fort_p(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), UNPROVIDED)))) && (NIL != genls.genlsP(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), UNPROVIDED), collection, mt, UNPROVIDED))) && (NIL == el_negation_p(wff_vars.wff_formula())))));
                } finally {
                    final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
            }
        }
        return admittedP;
    }

    public static SubLObject reset_rejected_by_necessary_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), REJECTED_BY_NECESSARY_DEFNS);
        return NIL;
    }

    public static SubLObject rejected_by_necessary_defns_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejected_by = NIL;
        if (NIL == denotational_term_admitted_by_defn_via_isaP(v_term, collection, mt)) {
            SubLObject node_var = collection;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$38 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$40 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$40 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$41 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$43 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$41 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$42 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$44 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            final SubLObject _prev_bind_0_$42 = at_vars.$defn_collection$.currentBinding(thread);
                                            try {
                                                at_vars.$defn_collection$.bind(genl, thread);
                                                final SubLObject pred_var = $$defnNecessary;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, ONE_INTEGER, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, ONE_INTEGER, pred_var);
                                                    SubLObject done_var = NIL;
                                                    final SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                        if (NIL != valid) {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                SubLObject done_var_$48 = NIL;
                                                                final SubLObject token_var_$49 = NIL;
                                                                while (NIL == done_var_$48) {
                                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$49);
                                                                    final SubLObject valid_$50 = makeBoolean(!token_var_$49.eql(assertion));
                                                                    if (NIL != valid_$50) {
                                                                        final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                        if ((NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) && (NIL == defn_admitsP(defn, v_term, collection, UNPROVIDED))) {
                                                                            final SubLObject item_var = defn;
                                                                            if (NIL == member(item_var, rejected_by, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                rejected_by = cons(item_var, rejected_by);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_$48 = makeBoolean(NIL == valid_$50);
                                                                } 
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values = getValuesAsVector();
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    restoreValuesFromVector(_values);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    } 
                                                }
                                            } finally {
                                                at_vars.$defn_collection$.rebind(_prev_bind_0_$42, thread);
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$44 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$43 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$54 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$54)) {
                                                                        final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$54, thread);
                                                                            SubLObject iteration_state_$56;
                                                                            for (iteration_state_$56 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$56); iteration_state_$56 = dictionary_contents.do_dictionary_contents_next(iteration_state_$56)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$56);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
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
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$46, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$56);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$45, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$58;
                                                            final SubLObject new_list = cdolist_list_var_$58 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$58.first();
                                                            while (NIL != cdolist_list_var_$58) {
                                                                final SubLObject _prev_bind_0_$47 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
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
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$47, thread);
                                                                }
                                                                cdolist_list_var_$58 = cdolist_list_var_$58.rest();
                                                                generating_fn = cdolist_list_var_$58.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$43, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$44, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$44, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$42, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$41, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$43, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$41, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$40, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$40, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$39, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$38, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return rejected_by;
    }

    public static SubLObject rejected_by_necessary_defns(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = rejected_by_necessary_defns_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $rejected_by_necessary_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return rejected_by_necessary_defns_metered(collection, v_term, mt);
    }

    public static SubLObject why_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                if ((NIL == denotational_term_admitted_by_defn_via_isaP(v_term, collection, mt)) && (NIL == just)) {
                    SubLObject node_var = collection;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$61 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = mt;
                            final SubLObject _prev_bind_0_$62 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$63 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$64 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$63 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$64 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$64 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$65 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$65 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$70 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$65 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$66 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$66 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                while ((NIL != node_var) && (NIL == just)) {
                                                    final SubLObject genl = node_var;
                                                    final SubLObject _prev_bind_0_$66 = at_vars.$defn_collection$.currentBinding(thread);
                                                    try {
                                                        at_vars.$defn_collection$.bind(genl, thread);
                                                        if (NIL == just) {
                                                            SubLObject csome_list_var = $list46;
                                                            SubLObject defn_pred = NIL;
                                                            defn_pred = csome_list_var.first();
                                                            while ((NIL == just) && (NIL != csome_list_var)) {
                                                                final SubLObject pred_var = defn_pred;
                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, ONE_INTEGER, pred_var)) {
                                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, ONE_INTEGER, pred_var);
                                                                    SubLObject done_var = NIL;
                                                                    final SubLObject token_var = NIL;
                                                                    while (NIL == done_var) {
                                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                        if (NIL != valid) {
                                                                            SubLObject final_index_iterator = NIL;
                                                                            try {
                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                SubLObject done_var_$75 = NIL;
                                                                                final SubLObject token_var_$76 = NIL;
                                                                                while (NIL == done_var_$75) {
                                                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$76);
                                                                                    final SubLObject valid_$77 = makeBoolean(!token_var_$76.eql(assertion));
                                                                                    if (NIL != valid_$77) {
                                                                                        final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                                        if ((NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) && (NIL == defn_admitsP(defn, v_term, collection, UNPROVIDED))) {
                                                                                            if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                                                                just = genls.why_genlP(collection, at_vars.$defn_collection$.getDynamicValue(thread), mt, UNPROVIDED, UNPROVIDED);
                                                                                            }
                                                                                            just = cons(list(assertions_high.assertion_formula(assertion), $TRUE), just);
                                                                                        }
                                                                                    }
                                                                                    done_var_$75 = makeBoolean(NIL == valid_$77);
                                                                                } 
                                                                            } finally {
                                                                                final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    final SubLObject _values = getValuesAsVector();
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                    restoreValuesFromVector(_values);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var = makeBoolean(NIL == valid);
                                                                    } 
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                defn_pred = csome_list_var.first();
                                                            } 
                                                        }
                                                    } finally {
                                                        at_vars.$defn_collection$.rebind(_prev_bind_0_$66, thread);
                                                    }
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$68;
                                                    SubLObject _prev_bind_1_$67;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt_$81;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$69;
                                                    SubLObject iteration_state_$83;
                                                    SubLObject tv;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$70;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var2;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list;
                                                    SubLObject rest_$85;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$71;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes2;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest = NIL, rest = accessible_modules; (NIL == just) && (NIL != rest); rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$68 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$67 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == just) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$81 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$81)) {
                                                                                _prev_bind_0_$69 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$81, thread);
                                                                                    for (iteration_state_$83 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == just) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$83)); iteration_state_$83 = dictionary_contents.do_dictionary_contents_next(iteration_state_$83)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$83);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$70 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == just) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        if (NIL == just) {
                                                                                                            csome_list_var2 = sol;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                            while ((NIL == just) && (NIL != csome_list_var2)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$70, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$83);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$69, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$85 = NIL, rest_$85 = new_list; (NIL == just) && (NIL != rest_$85); rest_$85 = rest_$85.rest()) {
                                                                        generating_fn = rest_$85.first();
                                                                        _prev_bind_0_$71 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == just) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    if (NIL == just) {
                                                                                        csome_list_var3 = sol2;
                                                                                        node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                                        while ((NIL == just) && (NIL != csome_list_var3)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$71, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$67, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$68, thread);
                                                        }
                                                    }
                                                    node_var = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$66, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$66, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$65, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$70, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$65, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$65, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$64, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$64, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$63, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$64, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$63, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$62, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$61, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$73 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$73, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return just;
    }

    public static SubLObject necessary_defn_violation_data(final SubLObject collection, final SubLObject v_term, final SubLObject defn_col, final SubLObject defn, final SubLObject quotedP, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject data = NIL;
        if (((NIL != at_vars.$at_source$.getDynamicValue(thread)) && (NIL != at_vars.$at_reln$.getDynamicValue(thread))) && (!at_vars.$at_source$.getDynamicValue(thread).eql(at_vars.$at_reln$.getDynamicValue(thread)))) {
            data = cons(list($VIA_GENL_PRED, at_vars.$at_source$.getDynamicValue(thread)), data);
        }
        if ((NIL != at_vars.$include_at_constraint_gafP$.getDynamicValue(thread)) && (NIL != at_vars.$at_constraint_gaf$.getDynamicValue(thread))) {
            data = cons(list($AT_CONSTRAINT_GAF, at_vars.$at_constraint_gaf$.getDynamicValue(thread)), data);
        }
        if (NIL != mt) {
            data = cons(mt, data);
        } else {
            data = cons(mt_relevance_macros.$mt$.getDynamicValue(thread), data);
        }
        if (NIL != quotedP) {
            return listS($MAL_ARG_WRT_QUOTED_NEC_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, defn_col, defn, data });
        }
        return listS($MAL_ARG_WRT_NEC_DEFN, new SubLObject[]{ v_term, at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), collection, defn_col, defn, data });
    }

    public static SubLObject at_quoted_defns_admitP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
            return NIL;
        }
        final SubLObject pcase_var = get_quoted_defn_col_history(collection);
        if (pcase_var.eql($ADMITTED)) {
            return T;
        }
        if (pcase_var.eql($REJECTED)) {
            return NIL;
        }
        final SubLObject admitsP = quoted_defns_admitP(collection, at_vars.$at_arg$.getDynamicValue(thread), UNPROVIDED);
        if (NIL != admitsP) {
            set_quoted_defn_fn_history(collection, $ADMITTED);
        } else {
            set_quoted_defn_fn_history(collection, $REJECTED);
        }
        return admitsP;
    }

    public static SubLObject at_quoted_defns_rejectP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$at_defns_availableP$.getDynamicValue(thread)) {
            return NIL;
        }
        final SubLObject pcase_var = get_quoted_defn_col_history(collection);
        if (pcase_var.eql($ADMITTED)) {
            return NIL;
        }
        if (pcase_var.eql($REJECTED)) {
            return T;
        }
        final SubLObject rejectsP = quoted_defns_rejectP(collection, at_vars.$at_arg$.getDynamicValue(thread), UNPROVIDED);
        if (NIL != rejectsP) {
            set_quoted_defn_fn_history(collection, $REJECTED);
        } else {
            set_quoted_defn_fn_history(collection, $ADMITTED);
        }
        return rejectsP;
    }

    public static SubLObject quoted_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_quoted_defns_admitP(collection, v_term, mt);
        }
        return old_quoted_defns_admitP(collection, v_term, mt);
    }

    public static SubLObject reset_old_quoted_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), $sym58$OLD_QUOTED_DEFNS_ADMIT_);
        return NIL;
    }

    public static SubLObject old_quoted_defns_admitP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != isa.quoted_isaP(v_term, collection, mt, UNPROVIDED)) {
            return T;
        }
        SubLObject admittedP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = quoted_defining_defns_status(collection, v_term, mt);
                if (pcase_var.eql($ADMITTED)) {
                    admittedP = T;
                } else
                    if (!pcase_var.eql($REJECTED)) {
                        admittedP = makeBoolean(((NIL != suf_quoted_defn_assertions(collection)) && ((NIL == at_vars.$at_apply_necessary_defnsP$.getDynamicValue(thread)) || (NIL != quoted_necessary_defns_permitP(collection, v_term, mt)))) && (NIL != quoted_sufficient_defns_admitP(collection, v_term, mt)));
                    }

            } finally {
                final SubLObject _prev_bind_0_$89 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$89, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return admittedP;
    }

    public static SubLObject old_quoted_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = old_quoted_defns_admitP_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), add(gethash($CALLS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $old_quoted_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return old_quoted_defns_admitP_metered(collection, v_term, mt);
    }

    public static SubLObject quoted_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_quoted_defns_rejectP(collection, v_term, mt);
        }
        return old_quoted_defns_rejectP(collection, v_term, mt);
    }

    public static SubLObject reset_old_quoted_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), $sym61$OLD_QUOTED_DEFNS_REJECT_);
        return NIL;
    }

    public static SubLObject old_quoted_defns_rejectP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != isa.quoted_isaP(v_term, collection, mt, UNPROVIDED)) {
            return NIL;
        }
        SubLObject rejected = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject pcase_var = quoted_defining_defns_status(collection, v_term, mt);
                if (!pcase_var.eql($ADMITTED)) {
                    if (pcase_var.eql($REJECTED)) {
                        rejected = T;
                    } else {
                        rejected = quoted_necessary_defns_rejectP(collection, v_term, mt);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$90 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$90, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return rejected;
    }

    public static SubLObject old_quoted_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = old_quoted_defns_rejectP_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), add(gethash($CALLS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $old_quoted_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return old_quoted_defns_rejectP_metered(collection, v_term, mt);
    }

    public static SubLObject reset_quoted_defining_defns_status_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $quoted_defining_defns_status_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $quoted_defining_defns_status_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $quoted_defining_defns_status_meters$.getDynamicValue(thread), QUOTED_DEFINING_DEFNS_STATUS);
        return NIL;
    }

    public static SubLObject quoted_defining_defns_status_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject defn = cycl_subl_symbol_symbol(kb_mapping_utilities.fpred_value_in_relevant_mts(collection, $$quotedDefnIff, mt, ONE_INTEGER, TWO_INTEGER, $TRUE));
        SubLObject status = NIL;
        if (NIL != viable_defnP(defn, collection)) {
            final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
            try {
                at_vars.$defn_collection$.bind(collection, thread);
                if (NIL != quoted_defn_admitsP(defn, v_term, collection, mt)) {
                    status = $ADMITTED;
                } else
                    if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                        status = $REJECTED;
                        at_utilities.note_at_violation(defining_defn_violation_data(collection, v_term, defn, T, mt));
                    } else {
                        status = $REJECTED;
                    }

            } finally {
                at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
            }
        }
        return status;
    }

    public static SubLObject quoted_defining_defns_status(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = quoted_defining_defns_status_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), add(gethash($CALLS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $quoted_defining_defns_status_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $quoted_defining_defns_status_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $quoted_defining_defns_status_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return quoted_defining_defns_status_metered(collection, v_term, mt);
    }

    public static SubLObject reset_quoted_sufficient_defns_admitP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), $sym68$QUOTED_SUFFICIENT_DEFNS_ADMIT_);
        return NIL;
    }

    public static SubLObject quoted_sufficient_defns_admitP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return sufficient_defns_admit_int(collection, v_term, suf_quoted_defn_assertions(collection), T, mt);
    }

    public static SubLObject quoted_sufficient_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = quoted_sufficient_defns_admitP_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), add(gethash($CALLS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return quoted_sufficient_defns_admitP_metered(collection, v_term, mt);
    }

    public static SubLObject quoted_necessary_defns_permitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean(NIL == quoted_necessary_defns_rejectP(collection, v_term, mt));
    }

    public static SubLObject reset_quoted_necessary_defns_rejectP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), $sym71$QUOTED_NECESSARY_DEFNS_REJECT_);
        return NIL;
    }

    public static SubLObject quoted_necessary_defns_rejectP_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejectedP = NIL;
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject node_var = collection;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$91 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$92 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$93 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$93 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$94 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$96 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$94 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$95 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$97 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while ((NIL != node_var) && (NIL == doneP)) {
                                            final SubLObject genl = node_var;
                                            final SubLObject _prev_bind_0_$95 = at_vars.$defn_collection$.currentBinding(thread);
                                            try {
                                                at_vars.$defn_collection$.bind(genl, thread);
                                                if (NIL == doneP) {
                                                    SubLObject csome_list_var = $list73;
                                                    SubLObject defn_pred = NIL;
                                                    defn_pred = csome_list_var.first();
                                                    while ((NIL == doneP) && (NIL != csome_list_var)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject rejectedP_$101 = necessary_defns_rejectP_int(collection, v_term, genl, defn_pred, T, mt);
                                                        final SubLObject doneP_$102 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        rejectedP = rejectedP_$101;
                                                        doneP = doneP_$102;
                                                        csome_list_var = csome_list_var.rest();
                                                        defn_pred = csome_list_var.first();
                                                    } 
                                                }
                                            } finally {
                                                at_vars.$defn_collection$.rebind(_prev_bind_0_$95, thread);
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$96;
                                            SubLObject _prev_bind_1_$96;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$105;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$97;
                                            SubLObject iteration_state_$107;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$98;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$109;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$99;
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
                                                _prev_bind_0_$96 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$105 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$105)) {
                                                                        _prev_bind_0_$97 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$105, thread);
                                                                            for (iteration_state_$107 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == doneP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$107)); iteration_state_$107 = dictionary_contents.do_dictionary_contents_next(iteration_state_$107)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$107);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$98 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
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
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var2 = csome_list_var2.rest();
                                                                                                        node_vars_link_node2 = csome_list_var2.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$98, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$107);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$97, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$109 = NIL, rest_$109 = new_list; (NIL == doneP) && (NIL != rest_$109); rest_$109 = rest_$109.rest()) {
                                                                generating_fn = rest_$109.first();
                                                                _prev_bind_0_$99 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == doneP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
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
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    node_vars_link_node4 = csome_list_var3.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$99, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$96, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$96, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$97, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$95, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$94, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$96, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$94, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$93, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$93, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$92, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$91, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$100 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$100, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return rejectedP;
    }

    public static SubLObject quoted_necessary_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = quoted_necessary_defns_rejectP_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), add(gethash($CALLS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return quoted_necessary_defns_rejectP_metered(collection, v_term, mt);
    }

    public static SubLObject denotational_term_admitted_by_quoted_defn_via_quoted_isaP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admittedP = NIL;
        if (NIL != at_vars.permitting_denotational_terms_admitted_by_defn_via_isaP()) {
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    admittedP = makeBoolean((NIL != at_denotational_term_p(v_term, UNPROVIDED)) && (((NIL != isa.quoted_isaP(v_term, collection, mt, UNPROVIDED)) || ((((NIL != assertions_high.gaf_assertionP(sbhl_link_vars.$added_assertion$.getDynamicValue(thread))) && (NIL != quoted_isa_litP(assertions_high.gaf_formula(sbhl_link_vars.$added_assertion$.getDynamicValue(thread))))) && v_term.equal(assertions_high.gaf_arg1(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)))) && (NIL != genls.genlsP(assertions_high.gaf_arg2(sbhl_link_vars.$added_assertion$.getDynamicValue(thread)), collection, mt, UNPROVIDED)))) || (((((((NIL != wff_macros.within_wffP()) && (NIL != within_assertP())) && (NIL != quoted_isa_litP(wff_vars.wff_formula()))) && v_term.equal(cycl_utilities.sentence_arg1(wff_vars.wff_formula(), UNPROVIDED))) && (NIL != term.el_fort_p(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), UNPROVIDED)))) && (NIL != genls.genlsP(cycl_utilities.sentence_arg2(wff_vars.wff_formula(), UNPROVIDED), collection, mt, UNPROVIDED))) && (NIL == el_negation_p(wff_vars.wff_formula())))));
                } finally {
                    final SubLObject _prev_bind_0_$112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
            }
        }
        return admittedP;
    }

    public static SubLObject reset_rejected_by_quoted_necessary_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), $list9);
        sethash($FUNCTION, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), REJECTED_BY_QUOTED_NECESSARY_DEFNS);
        return NIL;
    }

    public static SubLObject rejected_by_quoted_necessary_defns_metered(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejected_by = NIL;
        if (NIL == denotational_term_admitted_by_quoted_defn_via_quoted_isaP(v_term, collection, mt)) {
            SubLObject node_var = collection;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject mt_var = mt;
                    final SubLObject _prev_bind_0_$113 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        final SubLObject tv_var = NIL;
                        final SubLObject _prev_bind_0_$114 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$115 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$115 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$116 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$118 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$116 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$117 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$119 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while (NIL != node_var) {
                                            final SubLObject genl = node_var;
                                            final SubLObject _prev_bind_0_$117 = at_vars.$defn_collection$.currentBinding(thread);
                                            try {
                                                at_vars.$defn_collection$.bind(genl, thread);
                                                final SubLObject pred_var = $$quotedDefnNecessary;
                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, ONE_INTEGER, pred_var)) {
                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, ONE_INTEGER, pred_var);
                                                    SubLObject done_var = NIL;
                                                    final SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                        if (NIL != valid) {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                SubLObject done_var_$123 = NIL;
                                                                final SubLObject token_var_$124 = NIL;
                                                                while (NIL == done_var_$123) {
                                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$124);
                                                                    final SubLObject valid_$125 = makeBoolean(!token_var_$124.eql(assertion));
                                                                    if (NIL != valid_$125) {
                                                                        final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                        if ((NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) && (NIL == quoted_defn_admitsP(defn, v_term, collection, UNPROVIDED))) {
                                                                            final SubLObject item_var = defn;
                                                                            if (NIL == member(item_var, rejected_by, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                rejected_by = cons(item_var, rejected_by);
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_$123 = makeBoolean(NIL == valid_$125);
                                                                } 
                                                            } finally {
                                                                final SubLObject _prev_bind_0_$118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                try {
                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                    final SubLObject _values = getValuesAsVector();
                                                                    if (NIL != final_index_iterator) {
                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                    }
                                                                    restoreValuesFromVector(_values);
                                                                } finally {
                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                                                }
                                                            }
                                                        }
                                                        done_var = makeBoolean(NIL == valid);
                                                    } 
                                                }
                                            } finally {
                                                at_vars.$defn_collection$.rebind(_prev_bind_0_$117, thread);
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$119 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$118 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                SubLObject iteration_state;
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    final SubLObject mt_$129 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    final SubLObject tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$129)) {
                                                                        final SubLObject _prev_bind_0_$120 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$129, thread);
                                                                            SubLObject iteration_state_$131;
                                                                            for (iteration_state_$131 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$131); iteration_state_$131 = dictionary_contents.do_dictionary_contents_next(iteration_state_$131)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$131);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$121 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
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
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$121, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$131);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$120, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$133;
                                                            final SubLObject new_list = cdolist_list_var_$133 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$133.first();
                                                            while (NIL != cdolist_list_var_$133) {
                                                                final SubLObject _prev_bind_0_$122 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
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
                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                            } 
                                                                        } else {
                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$122, thread);
                                                                }
                                                                cdolist_list_var_$133 = cdolist_list_var_$133.rest();
                                                                generating_fn = cdolist_list_var_$133.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$118, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$119, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$119, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$117, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$116, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$118, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$116, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$115, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$115, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$114, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$113, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$123 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$123, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return rejected_by;
    }

    public static SubLObject rejected_by_quoted_necessary_defns(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = rejected_by_quoted_necessary_defns_metered(collection, v_term, mt);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), cons(list(collection, v_term, mt), gethash($ARGS, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return rejected_by_quoted_necessary_defns_metered(collection, v_term, mt);
    }

    public static SubLObject why_quoted_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                if ((NIL == denotational_term_admitted_by_quoted_defn_via_quoted_isaP(v_term, collection, mt)) && (NIL == just)) {
                    SubLObject node_var = collection;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$136 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject mt_var = mt;
                            final SubLObject _prev_bind_0_$137 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$138 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$139 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                final SubLObject tv_var = NIL;
                                final SubLObject _prev_bind_0_$138 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$139 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                    if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                        if (pcase_var.eql($ERROR)) {
                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($CERROR)) {
                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($WARN)) {
                                                    Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                } else {
                                                    Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                    Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                }


                                    }
                                    final SubLObject _prev_bind_0_$139 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$140 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$140 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                    final SubLObject _prev_bind_3_$145 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                        if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                            final SubLObject _prev_bind_0_$140 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$141 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                            final SubLObject _prev_bind_2_$141 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                            try {
                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                while ((NIL != node_var) && (NIL == just)) {
                                                    final SubLObject genl = node_var;
                                                    final SubLObject _prev_bind_0_$141 = at_vars.$defn_collection$.currentBinding(thread);
                                                    try {
                                                        at_vars.$defn_collection$.bind(genl, thread);
                                                        if (NIL == just) {
                                                            SubLObject csome_list_var = $list73;
                                                            SubLObject defn_pred = NIL;
                                                            defn_pred = csome_list_var.first();
                                                            while ((NIL == just) && (NIL != csome_list_var)) {
                                                                final SubLObject pred_var = defn_pred;
                                                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, ONE_INTEGER, pred_var)) {
                                                                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, ONE_INTEGER, pred_var);
                                                                    SubLObject done_var = NIL;
                                                                    final SubLObject token_var = NIL;
                                                                    while (NIL == done_var) {
                                                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                        if (NIL != valid) {
                                                                            SubLObject final_index_iterator = NIL;
                                                                            try {
                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                SubLObject done_var_$150 = NIL;
                                                                                final SubLObject token_var_$151 = NIL;
                                                                                while (NIL == done_var_$150) {
                                                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$151);
                                                                                    final SubLObject valid_$152 = makeBoolean(!token_var_$151.eql(assertion));
                                                                                    if (NIL != valid_$152) {
                                                                                        final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                                        if ((NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) && (NIL == quoted_defn_admitsP(defn, v_term, collection, UNPROVIDED))) {
                                                                                            if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                                                                just = genls.why_genlP(collection, at_vars.$defn_collection$.getDynamicValue(thread), mt, UNPROVIDED, UNPROVIDED);
                                                                                            }
                                                                                            just = cons(list(assertions_high.assertion_formula(assertion), $TRUE), just);
                                                                                        }
                                                                                    }
                                                                                    done_var_$150 = makeBoolean(NIL == valid_$152);
                                                                                } 
                                                                            } finally {
                                                                                final SubLObject _prev_bind_0_$142 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                try {
                                                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                    final SubLObject _values = getValuesAsVector();
                                                                                    if (NIL != final_index_iterator) {
                                                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                    }
                                                                                    restoreValuesFromVector(_values);
                                                                                } finally {
                                                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$142, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        done_var = makeBoolean(NIL == valid);
                                                                    } 
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                defn_pred = csome_list_var.first();
                                                            } 
                                                        }
                                                    } finally {
                                                        at_vars.$defn_collection$.rebind(_prev_bind_0_$141, thread);
                                                    }
                                                    final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                    SubLObject rest;
                                                    SubLObject module_var;
                                                    SubLObject _prev_bind_0_$143;
                                                    SubLObject _prev_bind_1_$142;
                                                    SubLObject node;
                                                    SubLObject d_link;
                                                    SubLObject mt_links;
                                                    SubLObject iteration_state;
                                                    SubLObject mt_$156;
                                                    SubLObject tv_links;
                                                    SubLObject _prev_bind_0_$144;
                                                    SubLObject iteration_state_$158;
                                                    SubLObject tv;
                                                    SubLObject link_nodes;
                                                    SubLObject _prev_bind_0_$145;
                                                    SubLObject sol;
                                                    SubLObject set_contents_var;
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject node_vars_link_node;
                                                    SubLObject csome_list_var2;
                                                    SubLObject node_vars_link_node2;
                                                    SubLObject new_list;
                                                    SubLObject rest_$160;
                                                    SubLObject generating_fn;
                                                    SubLObject _prev_bind_0_$146;
                                                    SubLObject sol2;
                                                    SubLObject link_nodes2;
                                                    SubLObject set_contents_var2;
                                                    SubLObject basis_object2;
                                                    SubLObject state2;
                                                    SubLObject node_vars_link_node3;
                                                    SubLObject csome_list_var3;
                                                    SubLObject node_vars_link_node4;
                                                    for (rest = NIL, rest = accessible_modules; (NIL == just) && (NIL != rest); rest = rest.rest()) {
                                                        module_var = rest.first();
                                                        _prev_bind_0_$143 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                        _prev_bind_1_$142 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                        try {
                                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                            node = function_terms.naut_to_nart(node_var);
                                                            if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != d_link) {
                                                                    mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != mt_links) {
                                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == just) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                            thread.resetMultipleValues();
                                                                            mt_$156 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                            tv_links = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_$156)) {
                                                                                _prev_bind_0_$144 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_$156, thread);
                                                                                    for (iteration_state_$158 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == just) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$158)); iteration_state_$158 = dictionary_contents.do_dictionary_contents_next(iteration_state_$158)) {
                                                                                        thread.resetMultipleValues();
                                                                                        tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$158);
                                                                                        link_nodes = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                            _prev_bind_0_$145 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                sol = link_nodes;
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    set_contents_var = set.do_set_internal(sol);
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == just) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        if (NIL == just) {
                                                                                                            csome_list_var2 = sol;
                                                                                                            node_vars_link_node2 = NIL;
                                                                                                            node_vars_link_node2 = csome_list_var2.first();
                                                                                                            while ((NIL == just) && (NIL != csome_list_var2)) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                    deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                }
                                                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                            } 
                                                                                                        }
                                                                                                    } else {
                                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$145, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$158);
                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$144, thread);
                                                                                }
                                                                            }
                                                                        }
                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } else
                                                                if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                    new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    for (rest_$160 = NIL, rest_$160 = new_list; (NIL == just) && (NIL != rest_$160); rest_$160 = rest_$160.rest()) {
                                                                        generating_fn = rest_$160.first();
                                                                        _prev_bind_0_$146 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                            link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                            if (NIL != set.set_p(sol2)) {
                                                                                set_contents_var2 = set.do_set_internal(sol2);
                                                                                for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == just) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                    node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                    }
                                                                                }
                                                                            } else
                                                                                if (sol2.isList()) {
                                                                                    if (NIL == just) {
                                                                                        csome_list_var3 = sol2;
                                                                                        node_vars_link_node4 = NIL;
                                                                                        node_vars_link_node4 = csome_list_var3.first();
                                                                                        while ((NIL == just) && (NIL != csome_list_var3)) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                                        } 
                                                                                    }
                                                                                } else {
                                                                                    Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                }

                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$146, thread);
                                                                        }
                                                                    }
                                                                }

                                                        } finally {
                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$142, thread);
                                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$143, thread);
                                                        }
                                                    }
                                                    node_var = deck.deck_pop(recur_deck);
                                                } 
                                            } finally {
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$141, thread);
                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$141, thread);
                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$140, thread);
                                            }
                                        } else {
                                            sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        }
                                    } finally {
                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$145, thread);
                                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$140, thread);
                                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$140, thread);
                                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$139, thread);
                                    }
                                } finally {
                                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$139, thread);
                                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$138, thread);
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$139, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$138, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$137, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$147 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$147, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$136, thread);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$148 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$148, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return just;
    }

    public static SubLObject new_defn_stack() {
        return make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject defn_stack_push(final SubLObject defn, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.push_hash(defn, v_term, at_vars.$defn_stack$.getDynamicValue(thread));
    }

    public static SubLObject defn_stack_pop(final SubLObject defn, final SubLObject expected_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject actual_term = hash_table_utilities.pop_hash(defn, at_vars.$defn_stack$.getDynamicValue(thread));
        if (!expected_term.equal(actual_term)) {
            defn_error(FOUR_INTEGER, $str78$defn_stack_consistency_error___Ex, expected_term, actual_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return actual_term;
    }

    public static SubLObject recursive_defn_callP(final SubLObject defn, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != misc_utilities.initialized_p(at_vars.$defn_stack$.getDynamicValue(thread))) {
            final SubLObject term_stack = gethash_without_values(defn, at_vars.$defn_stack$.getDynamicValue(thread), UNPROVIDED);
            return subl_promotions.memberP(v_term, term_stack, symbol_function(EQUAL), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject get_defn_col_history(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        result = gethash_without_values(collection, at_vars.$defn_col_history$.getDynamicValue(thread), UNPROVIDED);
        return result;
    }

    public static SubLObject set_defn_col_history(final SubLObject defn, final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(defn, at_vars.$defn_col_history$.getDynamicValue(thread), result);
        return result;
    }

    public static SubLObject get_defn_fn_history(final SubLObject defn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        result = gethash_without_values(defn, at_vars.$defn_fn_history$.getDynamicValue(thread), UNPROVIDED);
        return result;
    }

    public static SubLObject set_defn_fn_history(final SubLObject defn, final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(defn, at_vars.$defn_fn_history$.getDynamicValue(thread), result);
        return result;
    }

    public static SubLObject get_quoted_defn_fn_history(final SubLObject defn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        result = gethash_without_values(defn, at_vars.$quoted_defn_fn_history$.getDynamicValue(thread), UNPROVIDED);
        return result;
    }

    public static SubLObject set_quoted_defn_fn_history(final SubLObject defn, final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(defn, at_vars.$quoted_defn_fn_history$.getDynamicValue(thread), result);
        return result;
    }

    public static SubLObject get_quoted_defn_col_history(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        result = gethash_without_values(collection, at_vars.$quoted_defn_col_history$.getDynamicValue(thread), UNPROVIDED);
        return result;
    }

    public static SubLObject set_quoted_defn_col_history(final SubLObject defn, final SubLObject result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash(defn, at_vars.$quoted_defn_col_history$.getDynamicValue(thread), result);
        return result;
    }

    public static SubLObject quiet_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            result = defns_admitP(collection, v_term, mt);
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject quiet_sufficient_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            at_vars.$at_apply_necessary_defnsP$.bind(NIL, thread);
            result = defns_admitP(collection, v_term, mt);
        } finally {
            at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject quiet_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            at_vars.$at_apply_necessary_defnsP$.bind(NIL, thread);
            result = defns_rejectP(collection, v_term, mt);
        } finally {
            at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject quiet_defn_admitsP(final SubLObject defn, final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            result = defn_admitsP(defn, v_term, collection, mt);
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject defn_admitsP(final SubLObject defn, final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = defn_history(defn);
        if (pcase_var.eql($ADMITTED)) {
            return T;
        }
        if (pcase_var.eql($REJECTED)) {
            return NIL;
        }
        if (NIL != recursive_defn_callP(defn, v_term)) {
            defn_error(THREE_INTEGER, $str79$recursive_call_of_defn__a_with_ar, defn, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        SubLObject admitsP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_stack$.currentBinding(thread);
        try {
            at_vars.$defn_stack$.bind(NIL != misc_utilities.uninitialized_p(at_vars.$defn_stack$.getDynamicValue(thread)) ? new_defn_stack() : at_vars.$defn_stack$.getDynamicValue(thread), thread);
            try {
                defn_stack_push(defn, v_term);
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$164 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    admitsP = defn_admits_intP(defn, v_term, collection);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$164, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$165 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    defn_stack_pop(defn, v_term);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$165, thread);
                }
            }
        } finally {
            at_vars.$defn_stack$.rebind(_prev_bind_0, thread);
        }
        if (NIL == collection_specific_defnP(defn)) {
            if (NIL != admitsP) {
                set_defn_fn_history(defn, $ADMITTED);
            } else {
                set_defn_fn_history(defn, $REJECTED);
            }
        }
        return admitsP;
    }

    public static SubLObject collection_specific_defnP(final SubLObject symbol) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(symbol, at_vars.$at_collection_specific_defns$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject defn_history(final SubLObject defn) {
        if ((NIL != viable_defnP(defn, UNPROVIDED)) && (NIL == collection_specific_defnP(defn))) {
            return get_defn_fn_history(defn);
        }
        return NIL;
    }

    public static SubLObject reset_defn_admits_intP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $defn_admits_intP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $defn_admits_intP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $defn_admits_intP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $defn_admits_intP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $defn_admits_intP_meters$.getDynamicValue(thread), $list81);
        sethash($FUNCTION, $defn_admits_intP_meters$.getDynamicValue(thread), $sym82$DEFN_ADMITS_INT_);
        return NIL;
    }

    public static SubLObject defn_admits_intP_metered(final SubLObject defn, final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admitsP = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                admitsP = makeBoolean((NIL != denotational_term_admitted_by_defn_via_isaP(v_term, collection, UNPROVIDED)) || (NIL != defn_funcall(defn, v_term)));
            } finally {
                final SubLObject _prev_bind_0_$166 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$166, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        if (collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
            defn_note(FIVE_INTEGER, $str84$__defn_test__term__s__defn__s_of_, v_term, defn, collection, NIL != admitsP ? $ADMITTED : $REJECTED, UNPROVIDED, UNPROVIDED);
        } else {
            defn_note(FIVE_INTEGER, $str85$__defn_test__term__s__defn__s_of_, v_term, defn, collection, at_vars.$defn_collection$.getDynamicValue(thread), NIL != admitsP ? $ADMITTED : $REJECTED, UNPROVIDED);
        }
        return admitsP;
    }

    public static SubLObject defn_admits_intP(final SubLObject defn, final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = defn_admits_intP_metered(defn, v_term, collection);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $defn_admits_intP_meters$.getDynamicValue(thread), add(gethash($CALLS, $defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $defn_admits_intP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $defn_admits_intP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $defn_admits_intP_meters$.getDynamicValue(thread), cons(list(defn, v_term, collection), gethash($ARGS, $defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return defn_admits_intP_metered(defn, v_term, collection);
    }

    public static SubLObject quiet_quoted_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            result = quoted_defns_admitP(collection, v_term, mt);
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject quiet_quoted_sufficient_defns_admitP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            at_vars.$at_apply_necessary_defnsP$.bind(NIL, thread);
            result = quoted_defns_admitP(collection, v_term, mt);
        } finally {
            at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_5, thread);
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject quiet_quoted_defns_rejectP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            result = quoted_defns_rejectP(collection, v_term, mt);
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject quiet_quoted_defn_admitsP(final SubLObject defn, final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            result = quoted_defn_admitsP(defn, v_term, collection, mt);
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject quoted_defn_admitsP(final SubLObject defn, final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = quoted_defn_history(defn);
        if (pcase_var.eql($ADMITTED)) {
            return T;
        }
        if (pcase_var.eql($REJECTED)) {
            return NIL;
        }
        if (NIL != recursive_defn_callP(defn, v_term)) {
            defn_error(THREE_INTEGER, $str86$recursive_call_of_quoted_defn__a_, defn, v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        SubLObject admitsP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_stack$.currentBinding(thread);
        try {
            at_vars.$defn_stack$.bind(NIL != misc_utilities.uninitialized_p(at_vars.$defn_stack$.getDynamicValue(thread)) ? new_defn_stack() : at_vars.$defn_stack$.getDynamicValue(thread), thread);
            try {
                defn_stack_push(defn, v_term);
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$167 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    admitsP = quoted_defn_admits_intP(defn, v_term, collection);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$167, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$168 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    defn_stack_pop(defn, v_term);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$168, thread);
                }
            }
        } finally {
            at_vars.$defn_stack$.rebind(_prev_bind_0, thread);
        }
        if (NIL == collection_specific_defnP(defn)) {
            if (NIL != admitsP) {
                sethash(defn, at_vars.$quoted_defn_fn_history$.getDynamicValue(thread), $ADMITTED);
            } else {
                sethash(defn, at_vars.$quoted_defn_fn_history$.getDynamicValue(thread), $REJECTED);
            }
        }
        return admitsP;
    }

    public static SubLObject quoted_defn_history(final SubLObject defn) {
        if ((NIL != viable_defnP(defn, UNPROVIDED)) && (NIL == collection_specific_defnP(defn))) {
            return get_quoted_defn_fn_history(defn);
        }
        return NIL;
    }

    public static SubLObject reset_quoted_defn_admits_intP_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), $list81);
        sethash($FUNCTION, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), $sym88$QUOTED_DEFN_ADMITS_INT_);
        return NIL;
    }

    public static SubLObject quoted_defn_admits_intP_metered(final SubLObject defn, final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject admitsP = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                admitsP = makeBoolean((NIL != denotational_term_admitted_by_quoted_defn_via_quoted_isaP(v_term, collection, UNPROVIDED)) || (NIL != defn_funcall(defn, v_term)));
            } finally {
                final SubLObject _prev_bind_0_$169 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$169, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        if (collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
            defn_note(FIVE_INTEGER, $str84$__defn_test__term__s__defn__s_of_, v_term, defn, collection, NIL != admitsP ? $ADMITTED : $REJECTED, UNPROVIDED, UNPROVIDED);
        } else {
            defn_note(FIVE_INTEGER, $str85$__defn_test__term__s__defn__s_of_, v_term, defn, collection, at_vars.$defn_collection$.getDynamicValue(thread), NIL != admitsP ? $ADMITTED : $REJECTED, UNPROVIDED);
        }
        return admitsP;
    }

    public static SubLObject quoted_defn_admits_intP(final SubLObject defn, final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = quoted_defn_admits_intP_metered(defn, v_term, collection);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), add(gethash($CALLS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), cons(list(defn, v_term, collection), gethash($ARGS, $quoted_defn_admits_intP_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return quoted_defn_admits_intP_metered(defn, v_term, collection);
    }

    public static SubLObject clear_defn_cyc_evaluate() {
        final SubLObject cs = $defn_cyc_evaluate_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_defn_cyc_evaluate(final SubLObject v_term) {
        return memoization_state.caching_state_remove_function_results_with_args($defn_cyc_evaluate_caching_state$.getGlobalValue(), list(v_term), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject defn_cyc_evaluate_internal(final SubLObject v_term) {
        return relation_evaluation.cyc_evaluate(v_term);
    }

    public static SubLObject defn_cyc_evaluate(final SubLObject v_term) {
        SubLObject caching_state = $defn_cyc_evaluate_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(DEFN_CYC_EVALUATE, $defn_cyc_evaluate_caching_state$, NIL, EQUAL, ONE_INTEGER, $int$24);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_term, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(defn_cyc_evaluate_internal(v_term)));
            memoization_state.caching_state_put(caching_state, v_term, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject valid_defnP(final SubLObject defn, SubLObject defn_collection) {
        if (defn_collection == UNPROVIDED) {
            defn_collection = NIL;
        }
        if (NIL != defn) {
            final SubLObject validP = symbolp(defn);
            if (NIL == validP) {
                if (NIL != defn_collection) {
                    defn_error(FOUR_INTEGER, $str93$_s_has_invalid_defn___s, defn_collection, defn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    defn_error(FOUR_INTEGER, $str94$invalid_defn___s, defn_collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return validP;
        }
        return NIL;
    }

    public static SubLObject viable_defnP(final SubLObject defn, SubLObject defn_collection) {
        if (defn_collection == UNPROVIDED) {
            defn_collection = NIL;
        }
        if (NIL != valid_defnP(defn, UNPROVIDED)) {
            final SubLObject viableP = eval_in_api.possibly_cyc_api_function_spec_p(defn);
            if (NIL == viableP) {
                if (NIL != defn_collection) {
                    defn_error(FOUR_INTEGER, $str95$_s_has_non_viable_defn___s, defn_collection, defn, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                } else {
                    defn_error(FOUR_INTEGER, $str96$non_viable_defn___s, defn_collection, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
            }
            return viableP;
        }
        return NIL;
    }

    public static SubLObject defn_funcall(final SubLObject defn, final SubLObject v_term) {
        return eval_in_api.possibly_cyc_api_funcall_1(defn, v_term);
    }

    public static SubLObject at_denotational_term_p(final SubLObject v_term, SubLObject varP) {
        if (varP == UNPROVIDED) {
            varP = symbol_function($sym97$CYC_VAR_);
        }
        return makeBoolean((NIL != forts.fort_p(v_term)) || (NIL != term.closed_nautP(v_term, varP)));
    }

    public static SubLObject clear_defn_space() {
        clear_defn_cyc_evaluate();
        return NIL;
    }

    public static SubLObject map_sufficient_defn_cols(final SubLObject function) {
        SubLObject cdolist_list_var = suf_defn_cache_as_alist();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject col = NIL;
            SubLObject defn_assertions = NIL;
            destructuring_bind_must_consp(current, datum, $list98);
            col = current.first();
            current = defn_assertions = current.rest();
            funcall(function, col, defn_assertions);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject has_typeP(final SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        collection = cycl_utilities.find_when_ground_naut(collection);
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
            return makeBoolean((NIL != isa.isaP(v_term, collection, mt, UNPROVIDED)) || (NIL != defns_admitP(collection, v_term, mt)));
        } finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject quiet_has_typeP(final SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        collection = cycl_utilities.find_when_ground_naut(collection);
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
            return makeBoolean((NIL != isa.isaP(v_term, collection, mt, UNPROVIDED)) || (NIL != quiet_defns_admitP(collection, v_term, mt)));
        } finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject quiet_has_any_typeP(final SubLObject v_term, final SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
            result = isa.isa_anyP(v_term, collections, mt, UNPROVIDED);
            if (NIL == result) {
                SubLObject csome_list_var;
                SubLObject collection;
                for (csome_list_var = collections, collection = NIL, collection = csome_list_var.first(); (NIL == result) && (NIL != csome_list_var); result = quiet_defns_admitP(collection, v_term, mt) , csome_list_var = csome_list_var.rest() , collection = csome_list_var.first()) {
                }
            }
        } finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject quiet_has_type_among(final SubLObject v_term, final SubLObject collections, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
            result = isa.all_isa_among(v_term, collections, mt, UNPROVIDED);
            SubLObject cdolist_list_var = collections;
            SubLObject collection = NIL;
            collection = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if ((NIL == list_utilities.member_kbeqP(v_term, result)) && (NIL != quiet_defns_admitP(collection, v_term, mt))) {
                    result = cons(collection, result);
                }
                cdolist_list_var = cdolist_list_var.rest();
                collection = cdolist_list_var.first();
            } 
        } finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject quiet_has_type_memoizedP_internal(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        return quiet_has_typeP(v_term, collection, mt);
    }

    public static SubLObject quiet_has_type_memoizedP(final SubLObject v_term, final SubLObject collection, SubLObject mt, SubLObject mt_info) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (mt_info == UNPROVIDED) {
            mt_info = mt_relevance_macros.mt_info(UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return quiet_has_type_memoizedP_internal(v_term, collection, mt, mt_info);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym100$QUIET_HAS_TYPE_MEMOIZED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym100$QUIET_HAS_TYPE_MEMOIZED_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym100$QUIET_HAS_TYPE_MEMOIZED_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(v_term, collection, mt, mt_info);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (v_term.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (collection.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (mt.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt_info.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(quiet_has_type_memoizedP_internal(v_term, collection, mt, mt_info)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(v_term, collection, mt, mt_info));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject not_has_type_by_extent_knownP(final SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        collection = cycl_utilities.find_when_ground_naut(collection);
        return makeBoolean(((NIL != forts.fort_p(collection)) && (NIL != kb_accessors.completely_enumerable_collectionP(collection, mt))) && (NIL == quiet_has_typeP(v_term, collection, mt)));
    }

    public static SubLObject not_has_typeP(final SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        collection = cycl_utilities.find_when_ground_naut(collection);
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
            return makeBoolean((NIL != defns_rejectP(collection, v_term, mt)) || (NIL != isa.not_isaP(v_term, collection, mt, UNPROVIDED)));
        } finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject quiet_not_has_typeP(final SubLObject v_term, SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        collection = cycl_utilities.find_when_ground_naut(collection);
        final SubLObject _prev_bind_0 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
        try {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
            return makeBoolean((NIL != quiet_defns_rejectP(collection, v_term, mt)) || (NIL != isa.not_isaP(v_term, collection, mt, UNPROVIDED)));
        } finally {
            at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject quick_quiet_has_typeP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$InferencePSC;
        }
        if (NIL != forts.fort_p(collection)) {
            return quick_quiet_has_typeP_fort(v_term, collection, mt);
        }
        if (NIL != possibly_naut_p(collection)) {
            return quick_quiet_has_typeP_naut(v_term, collection, mt);
        }
        return NIL;
    }

    public static SubLObject quick_quiet_has_typeP_fort(final SubLObject v_term, final SubLObject collection, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if ((NIL != forts.fort_p(v_term)) && (NIL != isa.isaP(v_term, collection, mt, UNPROVIDED))) {
                ans = T;
            } else
                if (((NIL != possibly_fo_naut_p(v_term)) && (NIL != isa.isaP(v_term.first(), $$Function_Denotational, UNPROVIDED, UNPROVIDED))) && (NIL != isa.nat_isaP(v_term, collection, UNPROVIDED, UNPROVIDED))) {
                    ans = T;
                } else {
                    final SubLObject _prev_bind_0_$170 = at_vars.$at_apply_necessary_defnsP$.currentBinding(thread);
                    try {
                        at_vars.$at_apply_necessary_defnsP$.bind(NIL, thread);
                        ans = quiet_defns_admitP(collection, v_term, UNPROVIDED);
                    } finally {
                        at_vars.$at_apply_necessary_defnsP$.rebind(_prev_bind_0_$170, thread);
                    }
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject quick_quiet_has_typeP_naut(final SubLObject v_term, final SubLObject collection, final SubLObject mt) {
        if (((NIL != cycl_utilities.naut_with_functor_p(collection, $$SpecsFn)) && (NIL != term.el_fort_p(v_term))) && (NIL != genls.genlP(v_term, cycl_utilities.nat_arg1(collection, UNPROVIDED), mt, UNPROVIDED))) {
            return T;
        }
        if (NIL != cycl_utilities.collection_union_natP(collection)) {
            return quick_quiet_has_typeP_collection_union(v_term, collection, mt);
        }
        if (NIL != cycl_utilities.collection_intersection_natP(collection)) {
            return quick_quiet_has_typeP_collection_intersection(v_term, collection, mt);
        }
        if ((NIL != parsing_utilities.ternary_parsing_subcollection_function_nautP(v_term)) && (NIL != quick_quiet_has_typeP(cycl_utilities.nat_arg1(v_term, UNPROVIDED), collection, mt))) {
            return T;
        }
        if (NIL != term.ground_nautP(collection, UNPROVIDED)) {
            final SubLObject maybe_nart = cycl_utilities.find_ground_naut(collection);
            return makeBoolean((NIL != nart_handles.nart_p(maybe_nart)) && (NIL != quick_quiet_has_typeP(v_term, maybe_nart, mt)));
        }
        return NIL;
    }

    public static SubLObject quick_quiet_has_typeP_collection_union(final SubLObject v_term, final SubLObject collection_union, final SubLObject mt) {
        SubLObject cdolist_list_var = cycl_utilities.collection_union_united_collections(collection_union);
        SubLObject union_member = NIL;
        union_member = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != quick_quiet_has_typeP(v_term, union_member, mt)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            union_member = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject quick_quiet_has_typeP_collection_intersection(final SubLObject v_term, final SubLObject v_collection_intersection, final SubLObject mt) {
        SubLObject cdolist_list_var = cycl_utilities.collection_intersection_intersectees(v_collection_intersection);
        SubLObject intersection_member = NIL;
        intersection_member = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == quick_quiet_has_typeP(v_term, intersection_member, mt)) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            intersection_member = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject max_mts_of_admitting_defns(final SubLObject v_term, final SubLObject collection) {
        if (collection.eql($$Thing)) {
            return $list105;
        }
        return genl_mts.max_mts(mts_of_admitting_sufficient_defns(v_term, collection), UNPROVIDED);
    }

    public static SubLObject mts_of_admitting_sufficient_defns(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_mts_of_admitting_defns(v_term, collection);
        }
        return old_mts_of_admitting_sufficient_defns(v_term, collection);
    }

    public static SubLObject old_mts_of_admitting_sufficient_defns(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject mt_sets = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject _prev_bind_0_$171 = at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.currentBinding(thread);
                try {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.bind(NIL, thread);
                    SubLObject cdolist_list_var = suf_defn_assertions(collection);
                    SubLObject assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject _prev_bind_0_$172 = at_vars.$defn_collection$.currentBinding(thread);
                        try {
                            at_vars.$defn_collection$.bind(assertions_high.gaf_arg1(assertion), thread);
                            final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                            final SubLObject mt = assertions_high.assertion_mt(assertion);
                            if (NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                                final SubLObject _prev_bind_0_$173 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$174 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                                    if ((NIL != quiet_defn_admitsP(defn, v_term, collection, UNPROVIDED)) && ((NIL == at_vars.$at_apply_necessary_defnsP$.getDynamicValue(thread)) || (NIL != necessary_defns_permitP(collection, v_term, UNPROVIDED)))) {
                                        SubLObject cdolist_list_var_$175 = genls.min_mts_of_genls_paths(at_vars.$defn_collection$.getDynamicValue(thread), collection, UNPROVIDED);
                                        SubLObject mt_set = NIL;
                                        mt_set = cdolist_list_var_$175.first();
                                        while (NIL != cdolist_list_var_$175) {
                                            mt_sets = cons(cons(mt, mt_set), mt_sets);
                                            cdolist_list_var_$175 = cdolist_list_var_$175.rest();
                                            mt_set = cdolist_list_var_$175.first();
                                        } 
                                    }
                                } finally {
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$174, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$173, thread);
                                }
                            }
                        } finally {
                            at_vars.$defn_collection$.rebind(_prev_bind_0_$172, thread);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                } finally {
                    at_vars.$permitting_denotational_terms_admitted_by_defn_via_isaP$.rebind(_prev_bind_0_$171, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$174 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$174, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return genl_mts.max_floor_mts_from_mt_sets(mt_sets);
    }

    public static SubLObject max_mts_of_admitting_quoted_defns(final SubLObject v_term, final SubLObject collection) {
        return genl_mts.max_mts(mts_of_admitting_sufficient_quoted_defns(v_term, collection), UNPROVIDED);
    }

    public static SubLObject mts_of_admitting_sufficient_quoted_defns(final SubLObject v_term, final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.mts_of_admitting_quoted_defns(v_term, collection);
        }
        return NIL;
    }

    public static SubLObject isa_via_defnsP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return defns_admitP(collection, v_term, mt);
    }

    public static SubLObject hl_justify_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_hl_justify_isa_via_defns(v_term, collection, mt);
        }
        return old_hl_justify_isa_via_defns(v_term, collection, mt);
    }

    public static SubLObject old_hl_justify_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$177 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$178 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    if (NIL == supports) {
                        SubLObject csome_list_var = suf_defn_assertions(collection);
                        SubLObject assertion = NIL;
                        assertion = csome_list_var.first();
                        while ((NIL == supports) && (NIL != csome_list_var)) {
                            if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                final SubLObject _prev_bind_0_$178 = at_vars.$defn_collection$.currentBinding(thread);
                                try {
                                    at_vars.$defn_collection$.bind(assertions_high.gaf_arg1(assertion), thread);
                                    final SubLObject defn_mt = assertions_high.assertion_mt(assertion);
                                    if (NIL != mt_relevance_macros.relevant_mtP(defn_mt)) {
                                        final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                        if (NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                                            if (NIL != isa.isaP(v_term, at_vars.$defn_collection$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                                supports = cons(arguments.make_hl_support($ISA, list($$isa, v_term, collection), UNPROVIDED, UNPROVIDED), supports);
                                            } else
                                                if (NIL != quiet_defn_admitsP(defn, v_term, collection, mt)) {
                                                    if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                        supports = cons(arguments.make_hl_support($GENLS, list($$genls, at_vars.$defn_collection$.getDynamicValue(thread), collection), UNPROVIDED, UNPROVIDED), supports);
                                                    }
                                                    supports = cons(assertion, supports);
                                                }

                                        }
                                    }
                                } finally {
                                    at_vars.$defn_collection$.rebind(_prev_bind_0_$178, thread);
                                }
                            }
                            csome_list_var = csome_list_var.rest();
                            assertion = csome_list_var.first();
                        } 
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$178, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$177, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$179 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$179, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    public static SubLObject not_isa_via_defnsP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return makeBoolean((NIL != defns_rejectP(collection, v_term, mt)) || (NIL != collection_rejects_via_disjoint_defnsP(collection, v_term, mt)));
    }

    public static SubLObject why_not_isa_via_defnsP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject just = why_defns_rejectP(collection, v_term, mt);
        if (NIL == just) {
            just = why_collection_rejects_via_disjoint_defnsP(collection, v_term, mt);
        }
        return just;
    }

    public static SubLObject hl_justify_not_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$181 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$182 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    if (NIL == supports) {
                        SubLObject node_var = collection;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$182 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject mt_var_$184 = mt;
                                final SubLObject _prev_bind_0_$183 = mt_relevance_macros.$mt$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$183 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$187 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$184), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$184), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$184), thread);
                                    final SubLObject tv_var = NIL;
                                    final SubLObject _prev_bind_0_$184 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$184 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql($ERROR)) {
                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($CERROR)) {
                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var.eql($WARN)) {
                                                        Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    } else {
                                                        Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                        Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    }


                                        }
                                        final SubLObject _prev_bind_0_$185 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$185 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$188 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_3_$193 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                final SubLObject _prev_bind_0_$186 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$186 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$189 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                    while ((NIL != node_var) && (NIL == supports)) {
                                                        final SubLObject genl = node_var;
                                                        final SubLObject _prev_bind_0_$187 = at_vars.$defn_collection$.currentBinding(thread);
                                                        try {
                                                            at_vars.$defn_collection$.bind(genl, thread);
                                                            if (NIL == supports) {
                                                                SubLObject csome_list_var = $list46;
                                                                SubLObject defn_pred = NIL;
                                                                defn_pred = csome_list_var.first();
                                                                while ((NIL == supports) && (NIL != csome_list_var)) {
                                                                    final SubLObject pred_var = defn_pred;
                                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, ONE_INTEGER, pred_var)) {
                                                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, ONE_INTEGER, pred_var);
                                                                        SubLObject done_var = NIL;
                                                                        final SubLObject token_var = NIL;
                                                                        while (NIL == done_var) {
                                                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                            if (NIL != valid) {
                                                                                SubLObject final_index_iterator = NIL;
                                                                                try {
                                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                    SubLObject done_var_$198 = NIL;
                                                                                    final SubLObject token_var_$199 = NIL;
                                                                                    while (NIL == done_var_$198) {
                                                                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$199);
                                                                                        final SubLObject valid_$200 = makeBoolean(!token_var_$199.eql(assertion));
                                                                                        if (NIL != valid_$200) {
                                                                                            final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                                            if ((NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) && (NIL == quiet_defn_admitsP(defn, v_term, collection, mt))) {
                                                                                                if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                                                                    supports = cons(arguments.make_hl_support($GENLS, list($$genls, collection, at_vars.$defn_collection$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED), supports);
                                                                                                }
                                                                                                supports = cons(assertion, supports);
                                                                                            }
                                                                                        }
                                                                                        done_var_$198 = makeBoolean(NIL == valid_$200);
                                                                                    } 
                                                                                } finally {
                                                                                    final SubLObject _prev_bind_0_$188 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        final SubLObject _values = getValuesAsVector();
                                                                                        if (NIL != final_index_iterator) {
                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                        }
                                                                                        restoreValuesFromVector(_values);
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$188, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var = makeBoolean(NIL == valid);
                                                                        } 
                                                                    }
                                                                    csome_list_var = csome_list_var.rest();
                                                                    defn_pred = csome_list_var.first();
                                                                } 
                                                            }
                                                        } finally {
                                                            at_vars.$defn_collection$.rebind(_prev_bind_0_$187, thread);
                                                        }
                                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                        SubLObject rest;
                                                        SubLObject module_var;
                                                        SubLObject _prev_bind_0_$189;
                                                        SubLObject _prev_bind_1_$187;
                                                        SubLObject node;
                                                        SubLObject d_link;
                                                        SubLObject mt_links;
                                                        SubLObject iteration_state;
                                                        SubLObject mt_$204;
                                                        SubLObject tv_links;
                                                        SubLObject _prev_bind_0_$190;
                                                        SubLObject iteration_state_$206;
                                                        SubLObject tv;
                                                        SubLObject link_nodes;
                                                        SubLObject _prev_bind_0_$191;
                                                        SubLObject sol;
                                                        SubLObject set_contents_var;
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject node_vars_link_node;
                                                        SubLObject csome_list_var2;
                                                        SubLObject node_vars_link_node2;
                                                        SubLObject new_list;
                                                        SubLObject rest_$208;
                                                        SubLObject generating_fn;
                                                        SubLObject _prev_bind_0_$192;
                                                        SubLObject sol2;
                                                        SubLObject link_nodes2;
                                                        SubLObject set_contents_var2;
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject node_vars_link_node3;
                                                        SubLObject csome_list_var3;
                                                        SubLObject node_vars_link_node4;
                                                        for (rest = NIL, rest = accessible_modules; (NIL == supports) && (NIL != rest); rest = rest.rest()) {
                                                            module_var = rest.first();
                                                            _prev_bind_0_$189 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            _prev_bind_1_$187 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                node = function_terms.naut_to_nart(node_var);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link) {
                                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links) {
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == supports) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                mt_$204 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$204)) {
                                                                                    _prev_bind_0_$190 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$204, thread);
                                                                                        for (iteration_state_$206 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == supports) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$206)); iteration_state_$206 = dictionary_contents.do_dictionary_contents_next(iteration_state_$206)) {
                                                                                            thread.resetMultipleValues();
                                                                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$206);
                                                                                            link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                _prev_bind_0_$191 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == supports) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            if (NIL == supports) {
                                                                                                                csome_list_var2 = sol;
                                                                                                                node_vars_link_node2 = NIL;
                                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                                while ((NIL == supports) && (NIL != csome_list_var2)) {
                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                    }
                                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        } else {
                                                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$191, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$206);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$190, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        for (rest_$208 = NIL, rest_$208 = new_list; (NIL == supports) && (NIL != rest_$208); rest_$208 = rest_$208.rest()) {
                                                                            generating_fn = rest_$208.first();
                                                                            _prev_bind_0_$192 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                if (NIL != set.set_p(sol2)) {
                                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == supports) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol2.isList()) {
                                                                                        if (NIL == supports) {
                                                                                            csome_list_var3 = sol2;
                                                                                            node_vars_link_node4 = NIL;
                                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                                            while ((NIL == supports) && (NIL != csome_list_var3)) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                }
                                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                                node_vars_link_node4 = csome_list_var3.first();
                                                                                            } 
                                                                                        }
                                                                                    } else {
                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$192, thread);
                                                                            }
                                                                        }
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$187, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$189, thread);
                                                            }
                                                        }
                                                        node_var = deck.deck_pop(recur_deck);
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$189, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$186, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$186, thread);
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$193, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$188, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$185, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$185, thread);
                                        }
                                    } finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$184, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$184, thread);
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$187, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$183, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$183, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$193 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$193, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$182, thread);
                        }
                    }
                    if (NIL == supports) {
                        final SubLObject _prev_bind_0_$194 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$188 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$190 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$194 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                        try {
                            at_vars.$noting_at_violationsP$.bind(NIL, thread);
                            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                            if (NIL == supports) {
                                SubLObject csome_list_var4 = disjoint_with.max_all_disjoint_with(collection, mt, UNPROVIDED);
                                SubLObject disjoint_col = NIL;
                                disjoint_col = csome_list_var4.first();
                                while ((NIL == supports) && (NIL != csome_list_var4)) {
                                    if (NIL != quiet_defns_admitP(disjoint_col, v_term, mt)) {
                                        supports = list(arguments.make_hl_support($DEFN, list($$isa, v_term, disjoint_col), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($DISJOINTWITH, list($$disjointWith, collection, disjoint_col), UNPROVIDED, UNPROVIDED));
                                    }
                                    csome_list_var4 = csome_list_var4.rest();
                                    disjoint_col = csome_list_var4.first();
                                } 
                            }
                        } finally {
                            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3_$194, thread);
                            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2_$190, thread);
                            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1_$188, thread);
                            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0_$194, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$182, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$181, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$195 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$195, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    public static SubLObject hl_justify_not_quoted_isa_via_defns(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$216 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$217 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    if (NIL == supports) {
                        SubLObject node_var = collection;
                        final SubLObject deck_type = $STACK;
                        final SubLObject recur_deck = deck.create_deck(deck_type);
                        final SubLObject _prev_bind_0_$217 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject mt_var_$219 = mt;
                                final SubLObject _prev_bind_0_$218 = mt_relevance_macros.$mt$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$218 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$222 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var_$219), thread);
                                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var_$219), thread);
                                    mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var_$219), thread);
                                    final SubLObject tv_var = NIL;
                                    final SubLObject _prev_bind_0_$219 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$219 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql($ERROR)) {
                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($CERROR)) {
                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var.eql($WARN)) {
                                                        Errors.warn($str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    } else {
                                                        Errors.warn($str44$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                        Errors.cerror($$$continue_anyway, $str39$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    }


                                        }
                                        final SubLObject _prev_bind_0_$220 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$220 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$223 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                        final SubLObject _prev_bind_3_$228 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(collection, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                final SubLObject _prev_bind_0_$221 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$221 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$224 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                    while ((NIL != node_var) && (NIL == supports)) {
                                                        final SubLObject genl = node_var;
                                                        final SubLObject _prev_bind_0_$222 = at_vars.$defn_collection$.currentBinding(thread);
                                                        try {
                                                            at_vars.$defn_collection$.bind(genl, thread);
                                                            if (NIL == supports) {
                                                                SubLObject csome_list_var = $list46;
                                                                SubLObject defn_pred = NIL;
                                                                defn_pred = csome_list_var.first();
                                                                while ((NIL == supports) && (NIL != csome_list_var)) {
                                                                    final SubLObject pred_var = defn_pred;
                                                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(genl, ONE_INTEGER, pred_var)) {
                                                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(genl, ONE_INTEGER, pred_var);
                                                                        SubLObject done_var = NIL;
                                                                        final SubLObject token_var = NIL;
                                                                        while (NIL == done_var) {
                                                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                                                            if (NIL != valid) {
                                                                                SubLObject final_index_iterator = NIL;
                                                                                try {
                                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                                    SubLObject done_var_$233 = NIL;
                                                                                    final SubLObject token_var_$234 = NIL;
                                                                                    while (NIL == done_var_$233) {
                                                                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$234);
                                                                                        final SubLObject valid_$235 = makeBoolean(!token_var_$234.eql(assertion));
                                                                                        if (NIL != valid_$235) {
                                                                                            final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
                                                                                            if ((NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) && (NIL == quiet_quoted_defn_admitsP(defn, v_term, collection, mt))) {
                                                                                                if (!collection.eql(at_vars.$defn_collection$.getDynamicValue(thread))) {
                                                                                                    supports = cons(arguments.make_hl_support($GENLS, list($$genls, collection, at_vars.$defn_collection$.getDynamicValue(thread)), UNPROVIDED, UNPROVIDED), supports);
                                                                                                }
                                                                                                supports = cons(assertion, supports);
                                                                                            }
                                                                                        }
                                                                                        done_var_$233 = makeBoolean(NIL == valid_$235);
                                                                                    } 
                                                                                } finally {
                                                                                    final SubLObject _prev_bind_0_$223 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                    try {
                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                        final SubLObject _values = getValuesAsVector();
                                                                                        if (NIL != final_index_iterator) {
                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                        }
                                                                                        restoreValuesFromVector(_values);
                                                                                    } finally {
                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$223, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var = makeBoolean(NIL == valid);
                                                                        } 
                                                                    }
                                                                    csome_list_var = csome_list_var.rest();
                                                                    defn_pred = csome_list_var.first();
                                                                } 
                                                            }
                                                        } finally {
                                                            at_vars.$defn_collection$.rebind(_prev_bind_0_$222, thread);
                                                        }
                                                        final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                        SubLObject rest;
                                                        SubLObject module_var;
                                                        SubLObject _prev_bind_0_$224;
                                                        SubLObject _prev_bind_1_$222;
                                                        SubLObject node;
                                                        SubLObject d_link;
                                                        SubLObject mt_links;
                                                        SubLObject iteration_state;
                                                        SubLObject mt_$239;
                                                        SubLObject tv_links;
                                                        SubLObject _prev_bind_0_$225;
                                                        SubLObject iteration_state_$241;
                                                        SubLObject tv;
                                                        SubLObject link_nodes;
                                                        SubLObject _prev_bind_0_$226;
                                                        SubLObject sol;
                                                        SubLObject set_contents_var;
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject node_vars_link_node;
                                                        SubLObject csome_list_var2;
                                                        SubLObject node_vars_link_node2;
                                                        SubLObject new_list;
                                                        SubLObject rest_$243;
                                                        SubLObject generating_fn;
                                                        SubLObject _prev_bind_0_$227;
                                                        SubLObject sol2;
                                                        SubLObject link_nodes2;
                                                        SubLObject set_contents_var2;
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject node_vars_link_node3;
                                                        SubLObject csome_list_var3;
                                                        SubLObject node_vars_link_node4;
                                                        for (rest = NIL, rest = accessible_modules; (NIL == supports) && (NIL != rest); rest = rest.rest()) {
                                                            module_var = rest.first();
                                                            _prev_bind_0_$224 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            _prev_bind_1_$222 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                node = function_terms.naut_to_nart(node_var);
                                                                if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                    d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                    if (NIL != d_link) {
                                                                        mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        if (NIL != mt_links) {
                                                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == supports) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                                thread.resetMultipleValues();
                                                                                mt_$239 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                tv_links = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_$239)) {
                                                                                    _prev_bind_0_$225 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt_$239, thread);
                                                                                        for (iteration_state_$241 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == supports) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$241)); iteration_state_$241 = dictionary_contents.do_dictionary_contents_next(iteration_state_$241)) {
                                                                                            thread.resetMultipleValues();
                                                                                            tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$241);
                                                                                            link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                _prev_bind_0_$226 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        set_contents_var = set.do_set_internal(sol);
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == supports) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            if (NIL == supports) {
                                                                                                                csome_list_var2 = sol;
                                                                                                                node_vars_link_node2 = NIL;
                                                                                                                node_vars_link_node2 = csome_list_var2.first();
                                                                                                                while ((NIL == supports) && (NIL != csome_list_var2)) {
                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                                    }
                                                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                                                    node_vars_link_node2 = csome_list_var2.first();
                                                                                                                } 
                                                                                                            }
                                                                                                        } else {
                                                                                                            Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$226, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$241);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$225, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str48$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                        new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        for (rest_$243 = NIL, rest_$243 = new_list; (NIL == supports) && (NIL != rest_$243); rest_$243 = rest_$243.rest()) {
                                                                            generating_fn = rest_$243.first();
                                                                            _prev_bind_0_$227 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                                if (NIL != set.set_p(sol2)) {
                                                                                    set_contents_var2 = set.do_set_internal(sol2);
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == supports) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol2.isList()) {
                                                                                        if (NIL == supports) {
                                                                                            csome_list_var3 = sol2;
                                                                                            node_vars_link_node4 = NIL;
                                                                                            node_vars_link_node4 = csome_list_var3.first();
                                                                                            while ((NIL == supports) && (NIL != csome_list_var3)) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                                }
                                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                                node_vars_link_node4 = csome_list_var3.first();
                                                                                            } 
                                                                                        }
                                                                                    } else {
                                                                                        Errors.error($str47$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$227, thread);
                                                                            }
                                                                        }
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$222, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$224, thread);
                                                            }
                                                        }
                                                        node_var = deck.deck_pop(recur_deck);
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$224, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$221, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$221, thread);
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str49$Node__a_does_not_pass_sbhl_type_t, collection, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3_$228, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$223, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$220, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$220, thread);
                                        }
                                    } finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$219, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$219, thread);
                                    }
                                } finally {
                                    mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$222, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$218, thread);
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_0_$218, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$228 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$228, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$217, thread);
                        }
                    }
                    if (NIL == supports) {
                        final SubLObject _prev_bind_0_$229 = at_vars.$noting_at_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$223 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$225 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$229 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
                        try {
                            at_vars.$noting_at_violationsP$.bind(NIL, thread);
                            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                            if (NIL == supports) {
                                SubLObject csome_list_var4 = disjoint_with.max_all_disjoint_with(collection, mt, UNPROVIDED);
                                SubLObject disjoint_col = NIL;
                                disjoint_col = csome_list_var4.first();
                                while ((NIL == supports) && (NIL != csome_list_var4)) {
                                    if (NIL != quiet_quoted_defns_admitP(disjoint_col, v_term, mt)) {
                                        supports = list(arguments.make_hl_support($DEFN, list($$quotedIsa, v_term, disjoint_col), UNPROVIDED, UNPROVIDED), arguments.make_hl_support($DISJOINTWITH, list($$disjointWith, collection, disjoint_col), UNPROVIDED, UNPROVIDED));
                                    }
                                    csome_list_var4 = csome_list_var4.rest();
                                    disjoint_col = csome_list_var4.first();
                                } 
                            }
                        } finally {
                            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_3_$229, thread);
                            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_2_$225, thread);
                            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_1_$223, thread);
                            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0_$229, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$217, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$216, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$230 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$230, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return supports;
    }

    public static SubLObject collection_rejects_via_disjoint_defnsP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rejectP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            if (NIL == rejectP) {
                SubLObject csome_list_var;
                SubLObject disjoint_col;
                for (csome_list_var = disjoint_with.max_all_disjoint_with(collection, mt, UNPROVIDED), disjoint_col = NIL, disjoint_col = csome_list_var.first(); (NIL == rejectP) && (NIL != csome_list_var); rejectP = defns_admitP(disjoint_col, v_term, mt) , csome_list_var = csome_list_var.rest() , disjoint_col = csome_list_var.first()) {
                }
            }
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return rejectP;
    }

    public static SubLObject why_collection_rejects_via_disjoint_defnsP(final SubLObject collection, final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject just = NIL;
        final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            at_vars.$noting_at_violationsP$.bind(NIL, thread);
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
            if (NIL == just) {
                SubLObject csome_list_var = disjoint_with.max_all_disjoint_with(collection, mt, UNPROVIDED);
                SubLObject disjoint_col = NIL;
                disjoint_col = csome_list_var.first();
                while ((NIL == just) && (NIL != csome_list_var)) {
                    if (NIL != defns_admitP(disjoint_col, v_term, mt)) {
                        just = nconc(disjoint_with.why_disjoint_withP(collection, disjoint_col, mt, UNPROVIDED, UNPROVIDED), why_sufficient_defns_admitP(disjoint_col, v_term, mt));
                    }
                    csome_list_var = csome_list_var.rest();
                    disjoint_col = csome_list_var.first();
                } 
            }
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return just;
    }

    public static SubLObject collections_admitting_term_via_defns(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject _prev_bind_0_$251 = $mapping_data_1$.currentBinding(thread);
                final SubLObject _prev_bind_1_$252 = $mapping_answer$.currentBinding(thread);
                final SubLObject _prev_bind_2_$253 = $cat_defns_failing$.currentBinding(thread);
                try {
                    $mapping_data_1$.bind(v_term, thread);
                    $mapping_answer$.bind(make_hash_table($int$64, UNPROVIDED, UNPROVIDED), thread);
                    $cat_defns_failing$.bind(make_hash_table($int$64, UNPROVIDED, UNPROVIDED), thread);
                    genl_predicates.map_all_spec_preds($$defnSufficient, COLLECTIONS_ADMITTING_TERM_VIA_DEFNS_1, UNPROVIDED, UNPROVIDED);
                    final SubLObject cdohash_table = $mapping_answer$.getDynamicValue(thread);
                    SubLObject defn = NIL;
                    SubLObject cols = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            defn = getEntryKey(cdohash_entry);
                            cols = getEntryValue(cdohash_entry);
                            result = nunion(result, cols, UNPROVIDED, UNPROVIDED);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    $cat_defns_failing$.rebind(_prev_bind_2_$253, thread);
                    $mapping_answer$.rebind(_prev_bind_1_$252, thread);
                    $mapping_data_1$.rebind(_prev_bind_0_$251, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$252 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$252, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject min_max_collections_admitting_term_via_defns(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = at_vars.$defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$defn_col_history$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
        try {
            at_vars.$defn_fn_history$.bind(at_macros.possibly_make_defn_fn_history_table(), thread);
            at_vars.$quoted_defn_fn_history$.bind(at_macros.possibly_make_quoted_defn_fn_history_table(), thread);
            at_vars.$defn_col_history$.bind(at_macros.possibly_make_defn_col_history_table(), thread);
            at_vars.$quoted_defn_col_history$.bind(at_macros.possibly_make_quoted_defn_col_history_table(), thread);
            try {
                final SubLObject mt_var = mt;
                final SubLObject _prev_bind_0_$255 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$256 = mt_relevance_macros.$mt$.currentBinding(thread);
                final SubLObject _prev_bind_2_$257 = $mapping_data_1$.currentBinding(thread);
                final SubLObject _prev_bind_3_$258 = $mapping_answer$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    $mapping_data_1$.bind(v_term, thread);
                    $mapping_answer$.bind(make_hash_table($int$64, UNPROVIDED, UNPROVIDED), thread);
                    genl_predicates.map_all_spec_preds($$defnSufficient, COLLECTIONS_ADMITTING_TERM_VIA_DEFNS_1, UNPROVIDED, UNPROVIDED);
                    final SubLObject cdohash_table = $mapping_answer$.getDynamicValue(thread);
                    SubLObject defn = NIL;
                    SubLObject cols = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            defn = getEntryKey(cdohash_entry);
                            cols = getEntryValue(cdohash_entry);
                            result = nunion(result, genls.max_cols(cols, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    $mapping_answer$.rebind(_prev_bind_3_$258, thread);
                    $mapping_data_1$.rebind(_prev_bind_2_$257, thread);
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$256, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$255, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$256 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    clear_defn_space();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$256, thread);
                }
            }
        } finally {
            at_vars.$quoted_defn_col_history$.rebind(_prev_bind_4, thread);
            at_vars.$defn_col_history$.rebind(_prev_bind_3, thread);
            at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2, thread);
            at_vars.$defn_fn_history$.rebind(_prev_bind_0, thread);
        }
        return genls.min_cols(result, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject collections_admitting_term_via_defns_1(final SubLObject suff_defn_pred) {
        if (NIL != forts.fort_p(suff_defn_pred)) {
            kb_mapping.map_predicate_extent_index(GATHER_COLLECTIONS_ADMITTING_VIA_DEFNS, suff_defn_pred, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject gather_collections_admitting_via_defns(final SubLObject suff_defn_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != assertions_high.gaf_assertionP(suff_defn_assertion)) {
            final SubLObject _prev_bind_0 = at_vars.$defn_collection$.currentBinding(thread);
            try {
                at_vars.$defn_collection$.bind(assertions_high.gaf_arg1(suff_defn_assertion), thread);
                final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(suff_defn_assertion));
                if (NIL != viable_defnP(defn, at_vars.$defn_collection$.getDynamicValue(thread))) {
                    if (NIL != gethash_without_values(defn, $mapping_answer$.getDynamicValue(thread), UNPROVIDED)) {
                        hash_table_utilities.pushnew_hash(defn, at_vars.$defn_collection$.getDynamicValue(thread), $mapping_answer$.getDynamicValue(thread), UNPROVIDED);
                    } else
                        if (NIL == gethash_without_values(defn, $cat_defns_failing$.getDynamicValue(thread), UNPROVIDED)) {
                            if (NIL != quiet_defn_admitsP(defn, $mapping_data_1$.getDynamicValue(thread), at_vars.$defn_collection$.getDynamicValue(thread), UNPROVIDED)) {
                                hash_table_utilities.pushnew_hash(defn, at_vars.$defn_collection$.getDynamicValue(thread), $mapping_answer$.getDynamicValue(thread), UNPROVIDED);
                            } else {
                                sethash(defn, $cat_defns_failing$.getDynamicValue(thread), T);
                            }
                        }

                }
            } finally {
                at_vars.$defn_collection$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject defn_note(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5, SubLObject arg6) {
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
        if (arg6 == UNPROVIDED) {
            arg6 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(level)) {
            format(T, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5, arg6 });
            return NIL;
        }
        return NIL;
    }

    public static SubLObject defn_error(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror($$$continue_anyway, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, at_vars.$defn_trace_level$.getDynamicValue(thread)).numGE(level)) {
                format(T, cconcatenate($str119$__warn__, format_str), new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static SubLObject defn_cerror(final SubLObject level, final SubLObject continue_str, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(level)) {
            Errors.cerror(continue_str, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
        } else
            if (add(TWO_INTEGER, at_vars.$defn_trace_level$.getDynamicValue(thread)).numGE(level)) {
                Errors.warn(format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            }

        return NIL;
    }

    public static SubLObject defn_warn(final SubLObject level, final SubLObject format_str, SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5) {
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
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(level)) {
            apply(WARN, format_str, new SubLObject[]{ arg1, arg2, arg3, arg4, arg5 });
            return NIL;
        }
        return NIL;
    }

    public static SubLObject reset_defn_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue(thread);
        SubLObject meter_cache = NIL;
        meter_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            funcall(gethash($RESET, meter_cache, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            meter_cache = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject report_defn_meters(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue(thread);
        SubLObject meter_cache = NIL;
        meter_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (gethash($CALLS, meter_cache, UNPROVIDED).numG(ZERO_INTEGER)) {
                report_defn_meter_cache(meter_cache, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meter_cache = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject summarize_defn_meters(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject function_col_width = function_col_width(at_vars.$defn_meter_caches$.getDynamicValue(thread));
        summarize_defn_meter_cache_header(function_col_width, stream);
        SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue(thread);
        SubLObject meter_cache = NIL;
        meter_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (gethash($CALLS, meter_cache, UNPROVIDED).numG(ZERO_INTEGER)) {
                summarize_defn_meter_cache(meter_cache, function_col_width, stream);
            }
            cdolist_list_var = cdolist_list_var.rest();
            meter_cache = cdolist_list_var.first();
        } 
        summarize_defn_meter_cache_trailer(function_col_width, stream);
        return NIL;
    }

    public static SubLObject summarize_defn_meter_cache_header(SubLObject fn_col_width, SubLObject stream) {
        if (fn_col_width == UNPROVIDED) {
            fn_col_width = TEN_INTEGER;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str121$____defn_module_meters_);
        string_utilities.tab(add(fn_col_width, $int$27), stream, NIL, $str123$_, UNPROVIDED);
        format(stream, $str124$_____a__, string_utilities.right_justify($$$function, fn_col_width, UNPROVIDED));
        format(stream, $str126$___calls___);
        format(stream, $str127$___total_time___);
        format(stream, $str128$____avg_time____);
        return NIL;
    }

    public static SubLObject summarize_defn_meter_cache(final SubLObject meter_cache, SubLObject fn_col_width, SubLObject stream) {
        if (fn_col_width == UNPROVIDED) {
            fn_col_width = TEN_INTEGER;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject name = format(NIL, $str129$_s, gethash($FUNCTION, meter_cache, UNPROVIDED));
        final SubLObject calls = gethash($CALLS, meter_cache, UNPROVIDED);
        if ((NIL != calls) && calls.numG(ZERO_INTEGER)) {
            final SubLObject times = ((NIL != calls) && calls.numG(ZERO_INTEGER)) ? gethash($TIMES, meter_cache, UNPROVIDED) : NIL;
            final SubLObject total = (NIL != times) ? apply(symbol_function($sym130$_), times) : NIL;
            final SubLObject avg = (NIL != total) ? divide(total, calls) : NIL;
            format(stream, $str124$_____a__, string_utilities.right_justify(Strings.string_downcase(name, UNPROVIDED, UNPROVIDED), fn_col_width, UNPROVIDED));
            format(stream, $str131$____a___, string_utilities.left_justify(string_utilities.right_justify(string_utilities.str(calls), FOUR_INTEGER, UNPROVIDED), FIVE_INTEGER, UNPROVIDED));
            if (NIL != total) {
                format(stream, $str131$____a___, string_utilities.align_char(format(NIL, $str132$_a, number_utilities.float_n(total, TWO_INTEGER)), string_utilities.$point_char$.getGlobalValue(), TEN_INTEGER, SEVEN_INTEGER, UNPROVIDED));
            } else {
                string_utilities.tab(SIXTEEN_INTEGER, stream, NIL, $$$_, UNPROVIDED);
            }
            if (NIL != avg) {
                format(stream, $str131$____a___, string_utilities.align_char(string_utilities.str(number_utilities.float_n(avg, TWO_INTEGER)), string_utilities.$point_char$.getGlobalValue(), TEN_INTEGER, SEVEN_INTEGER, UNPROVIDED));
            } else {
                string_utilities.tab(SIXTEEN_INTEGER, stream, NIL, $$$_, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject summarize_defn_meter_cache_trailer(SubLObject fn_col_width, SubLObject stream) {
        if (fn_col_width == UNPROVIDED) {
            fn_col_width = TEN_INTEGER;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        string_utilities.tab(add(fn_col_width, $int$46), stream, T, $str123$_, UNPROVIDED);
        return NIL;
    }

    public static SubLObject report_defn_meter_cache(final SubLObject meter_cache, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject meter_col_widths = meter_col_widths(meter_cache);
        report_defn_meter_cache_header(meter_cache, meter_col_widths, stream);
        SubLObject cdotimes_end_var;
        SubLObject n;
        for (cdotimes_end_var = gethash($CALLS, meter_cache, UNPROVIDED), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
            report_defn_meter_cache_call(meter_cache, add(ONE_INTEGER, n), meter_col_widths, stream);
        }
        report_defn_meter_cache_total(meter_cache, meter_col_widths, stream);
        report_defn_meter_cache_trailer(meter_cache, meter_col_widths, stream);
        return NIL;
    }

    public static SubLObject report_defn_meter_cache_header(final SubLObject meter_cache, SubLObject col_widths, SubLObject stream) {
        if (col_widths == UNPROVIDED) {
            col_widths = meter_col_widths(meter_cache);
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject name = format(NIL, $str135$_s_, gethash($FUNCTION, meter_cache, UNPROVIDED));
        final SubLObject length = length(name);
        format(stream, $str136$_____a, Strings.string_downcase(name, UNPROVIDED, UNPROVIDED));
        SubLObject cdolist_list_var = col_widths;
        SubLObject width = NIL;
        width = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            string_utilities.tab(add(SIX_INTEGER, width), stream, NIL, $str123$_, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            width = cdolist_list_var.first();
        } 
        string_utilities.tab(subtract($int$37, length), stream, NIL, $str123$_, UNPROVIDED);
        format(stream, $str138$______call__);
        SubLObject m = ZERO_INTEGER;
        SubLObject cdolist_list_var2 = gethash($ARG_LIST, meter_cache, UNPROVIDED);
        SubLObject arg = NIL;
        arg = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject name_$260 = Strings.string_downcase(format(NIL, $str129$_s, arg), UNPROVIDED, UNPROVIDED);
            final SubLObject width2 = nth(m, col_widths);
            final SubLObject label = string_utilities.substring(name_$260, ZERO_INTEGER, min(width2, length(name_$260)));
            format(stream, $str139$____a___, string_utilities.center_string(label, width2, UNPROVIDED));
            m = add(m, ONE_INTEGER);
            cdolist_list_var2 = cdolist_list_var2.rest();
            arg = cdolist_list_var2.first();
        } 
        format(stream, $str140$____result____);
        format(stream, $str141$_____time_____);
        return NIL;
    }

    public static SubLObject report_defn_meter_cache_trailer(final SubLObject meter_cache, SubLObject col_widths, SubLObject stream) {
        if (col_widths == UNPROVIDED) {
            col_widths = meter_col_widths(meter_cache);
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject length = length(format(NIL, $str135$_s_, gethash($FUNCTION, meter_cache, UNPROVIDED)));
        string_utilities.tab(length, stream, T, $str123$_, UNPROVIDED);
        SubLObject cdolist_list_var = col_widths;
        SubLObject width = NIL;
        width = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            string_utilities.tab(add(SIX_INTEGER, width), stream, NIL, $str123$_, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            width = cdolist_list_var.first();
        } 
        string_utilities.tab(subtract($int$37, length), stream, NIL, $str123$_, UNPROVIDED);
        return NIL;
    }

    public static SubLObject report_defn_meter_cache_call(final SubLObject meter_cache, final SubLObject n, SubLObject col_widths, SubLObject stream) {
        if (col_widths == UNPROVIDED) {
            col_widths = meter_col_widths(meter_cache);
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str142$____a, string_utilities.center_string(format(NIL, $str132$_a, n), NINE_INTEGER, UNPROVIDED));
        SubLObject m = ZERO_INTEGER;
        SubLObject cdolist_list_var = nth(subtract(n, ONE_INTEGER), gethash($ARGS, meter_cache, UNPROVIDED));
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject name = format(NIL, $str129$_s, arg);
            final SubLObject width = nth(m, col_widths);
            final SubLObject label = string_utilities.substring(name, ZERO_INTEGER, min(width, length(name)));
            format(stream, $str139$____a___, string_utilities.center_string(label, width, UNPROVIDED));
            m = add(m, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        format(stream, $str139$____a___, string_utilities.center_string(format(NIL, $str132$_a, nth(subtract(n, ONE_INTEGER), gethash($RESULTS, meter_cache, UNPROVIDED))), EIGHT_INTEGER, UNPROVIDED));
        format(stream, $str139$____a___, string_utilities.center_string(format(NIL, $str132$_a, number_utilities.float_n(nth(subtract(n, ONE_INTEGER), gethash($TIMES, meter_cache, UNPROVIDED)), FOUR_INTEGER)), EIGHT_INTEGER, UNPROVIDED));
        return NIL;
    }

    public static SubLObject report_defn_meter_cache_total(final SubLObject meter_cache, SubLObject col_widths, SubLObject stream) {
        if (col_widths == UNPROVIDED) {
            col_widths = meter_col_widths(meter_cache);
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        format(stream, $str142$____a, string_utilities.center_string($$$total, NINE_INTEGER, UNPROVIDED));
        SubLObject cdolist_list_var = col_widths;
        SubLObject width = NIL;
        width = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            string_utilities.tab(add(SIX_INTEGER, width), stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            width = cdolist_list_var.first();
        } 
        string_utilities.tab(FOURTEEN_INTEGER, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject times = gethash($TIMES, meter_cache, UNPROVIDED);
        final SubLObject total = (NIL != times) ? apply(symbol_function($sym130$_), times) : NIL;
        if (NIL != total) {
            format(stream, $str139$____a___, string_utilities.center_string(format(NIL, $str132$_a, number_utilities.float_n(total, FOUR_INTEGER)), EIGHT_INTEGER, UNPROVIDED));
        } else {
            string_utilities.tab(FOURTEEN_INTEGER, stream, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject function_col_width(final SubLObject meter_caches) {
        SubLObject width = NIL;
        SubLObject cdolist_list_var = meter_caches;
        SubLObject meter_cache = NIL;
        meter_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (gethash($CALLS, meter_cache, UNPROVIDED).numG(ZERO_INTEGER)) {
                if (NIL != width) {
                    width = max(width, string_utilities.print_length(gethash($FUNCTION, meter_cache, UNPROVIDED)));
                } else {
                    width = string_utilities.print_length(gethash($FUNCTION, meter_cache, UNPROVIDED));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            meter_cache = cdolist_list_var.first();
        } 
        return width;
    }

    public static SubLObject meter_col_widths(final SubLObject meter_cache) {
        final SubLObject titles = gethash($ARG_LIST, meter_cache, UNPROVIDED);
        final SubLObject data = gethash($ARGS, meter_cache, UNPROVIDED);
        final SubLObject calls = gethash($CALLS, meter_cache, UNPROVIDED);
        SubLObject widths = NIL;
        SubLObject cdotimes_end_var;
        SubLObject n;
        SubLObject width;
        SubLObject m;
        for (cdotimes_end_var = length(titles), n = NIL, n = ZERO_INTEGER; n.numL(cdotimes_end_var); n = add(n, ONE_INTEGER)) {
            width = string_utilities.print_length(nth(n, titles));
            for (m = NIL, m = ZERO_INTEGER; m.numL(calls); m = add(m, ONE_INTEGER)) {
                width = max(width, string_utilities.print_length(nth(n, nth(m, data))));
            }
            widths = cons(min(FIFTEEN_INTEGER, add(TWO_INTEGER, width)), widths);
        }
        return nreverse(widths);
    }

    public static SubLObject suf_defn_assertions(final SubLObject collection) {
        if (NIL != forts.fort_p(collection)) {
            return suf_defn_cache_get(collection);
        }
        if (NIL != obsolete.reifiable_natP(collection, UNPROVIDED, UNPROVIDED)) {
            return suf_defn_assertions(narts_high.find_nart(collection));
        }
        return NIL;
    }

    public static SubLObject suf_defnP(final SubLObject collection, final SubLObject defn) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_suf_defnP(collection, defn, UNPROVIDED);
        }
        return old_suf_defnP(collection, defn);
    }

    public static SubLObject old_suf_defnP(final SubLObject collection, final SubLObject defn) {
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = suf_defn_assertions(collection);
            SubLObject assertion = NIL;
            assertion = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    foundP = eql(defn, cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion)));
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static SubLObject any_sufficient_defn_anywhereP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.has_suf_defn_somewhereP(collection, NIL);
        }
        return old_any_sufficient_defn_anywhereP(collection);
    }

    public static SubLObject old_any_sufficient_defn_anywhereP(final SubLObject collection) {
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = suf_defn_assertions(collection);
            SubLObject assertion = NIL;
            assertion = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    foundP = T;
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static SubLObject suf_defn_assertionP(final SubLObject col, final SubLObject assertion) {
        return subl_promotions.memberP(assertion, suf_defn_cache_get(col), symbol_function(KBEQ), UNPROVIDED);
    }

    public static SubLObject add_suf_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_add_suf_defn(source, assertion);
        }
        return old_add_suf_defn(source, assertion);
    }

    public static SubLObject add_iff_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_add_iff_defn(source, assertion);
        }
        return old_add_suf_defn(source, assertion);
    }

    public static SubLObject old_add_suf_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg1(assertion);
            final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
            if (((NIL != $bootstrapping_kbP$.getDynamicValue(thread)) && (NIL != forts.fort_p(col))) && defn.isSymbol()) {
                cache_suf_defn(col, assertion);
            } else {
                final SubLObject _prev_bind_0_$261 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$262 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject valid_defnP = valid_defnP(defn, col);
                    final SubLObject collectionP = forts.fort_p(col);
                    if ((NIL != collectionP) && (NIL != valid_defnP)) {
                        cache_suf_defn(col, assertion);
                    } else
                        if (NIL == collectionP) {
                            defn_cerror(ONE_INTEGER, $$$skip_defn_op, $str149$_s_is_not_a_collection_in__s, col, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (NIL == valid_defnP) {
                                defn_cerror(ONE_INTEGER, $$$skip_defn_op, $str150$_s_is_not_a_symbol, defn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }


                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$262, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$261, thread);
                }
            }
        } finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject remove_suf_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_remove_suf_defn(source, assertion);
        }
        return old_remove_suf_defn(source, assertion);
    }

    public static SubLObject remove_iff_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_remove_iff_defn(source, assertion);
        }
        return old_remove_suf_defn(source, assertion);
    }

    public static SubLObject old_remove_suf_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg1(assertion);
            final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
            if (((NIL != $bootstrapping_kbP$.getDynamicValue(thread)) && (NIL != forts.fort_p(col))) && defn.isSymbol()) {
                uncache_suf_defn(col, assertion);
            } else {
                final SubLObject _prev_bind_0_$263 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$264 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject valid_defnP = valid_defnP(defn, col);
                    final SubLObject collectionP = forts.fort_p(col);
                    if ((NIL != collectionP) && (NIL != valid_defnP)) {
                        uncache_suf_defn(col, assertion);
                    } else
                        if (NIL == collectionP) {
                            defn_cerror(ONE_INTEGER, $$$skip_defn_op, $str149$_s_is_not_a_collection_in__s, col, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (NIL == valid_defnP) {
                                defn_cerror(ONE_INTEGER, $$$skip_defn_op, $str150$_s_is_not_a_symbol, defn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }


                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$264, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$263, thread);
                }
            }
        } finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject reset_cache_suf_defn_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $cache_suf_defn_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $cache_suf_defn_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $cache_suf_defn_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $cache_suf_defn_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $cache_suf_defn_meters$.getDynamicValue(thread), $list156);
        sethash($FUNCTION, $cache_suf_defn_meters$.getDynamicValue(thread), CACHE_SUF_DEFN);
        return NIL;
    }

    public static SubLObject cache_suf_defn_metered(final SubLObject col, final SubLObject assertion) {
        cache_suf_defn_int(col, assertion, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cache_suf_defn(final SubLObject col, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = cache_suf_defn_metered(col, assertion);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $cache_suf_defn_meters$.getDynamicValue(thread), add(gethash($CALLS, $cache_suf_defn_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $cache_suf_defn_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $cache_suf_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $cache_suf_defn_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $cache_suf_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $cache_suf_defn_meters$.getDynamicValue(thread), cons(list(col, assertion), gethash($ARGS, $cache_suf_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return cache_suf_defn_metered(col, assertion);
    }

    public static SubLObject reset_uncache_suf_defn_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $uncache_suf_defn_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $uncache_suf_defn_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $uncache_suf_defn_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $uncache_suf_defn_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $uncache_suf_defn_meters$.getDynamicValue(thread), $list156);
        sethash($FUNCTION, $uncache_suf_defn_meters$.getDynamicValue(thread), UNCACHE_SUF_DEFN);
        return NIL;
    }

    public static SubLObject uncache_suf_defn_metered(final SubLObject col, final SubLObject assertion) {
        uncache_suf_defn_int(col, assertion, UNPROVIDED);
        return NIL;
    }

    public static SubLObject uncache_suf_defn(final SubLObject col, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = uncache_suf_defn_metered(col, assertion);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $uncache_suf_defn_meters$.getDynamicValue(thread), add(gethash($CALLS, $uncache_suf_defn_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $uncache_suf_defn_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $uncache_suf_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $uncache_suf_defn_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $uncache_suf_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $uncache_suf_defn_meters$.getDynamicValue(thread), cons(list(col, assertion), gethash($ARGS, $uncache_suf_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return uncache_suf_defn_metered(col, assertion);
    }

    public static SubLObject cache_suf_defn_int(final SubLObject col, final SubLObject assertion, SubLObject propagateP) {
        if (propagateP == UNPROVIDED) {
            propagateP = T;
        }
        if (NIL != suf_defn_assertionP(col, assertion)) {
            return NIL;
        }
        if (NIL != propagateP) {
            return propagate_added_suf_defn(col, assertion);
        }
        defn_note(FOUR_INTEGER, $str162$___add_sufficent_defn__a__a_, col, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return suf_defn_cache_add(col, assertion);
    }

    public static SubLObject uncache_suf_defn_int(final SubLObject col, final SubLObject assertion, SubLObject propagateP) {
        if (propagateP == UNPROVIDED) {
            propagateP = T;
        }
        if (NIL == suf_defn_assertionP(col, assertion)) {
            defn_error(FOUR_INTEGER, $str163$removed_sufficient_defn_not_found, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (NIL != propagateP) {
            return propagate_removed_suf_defn(col, assertion);
        }
        defn_note(FOUR_INTEGER, $str0$___remove_sufficent_defn__a__a_, col, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return suf_defn_cache_rem(col, assertion);
    }

    public static SubLObject handle_added_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_handle_added_genl_for_suf_defns(spec, genl);
        }
        return old_handle_added_genl_for_suf_defns(spec, genl);
    }

    public static SubLObject reset_old_handle_added_genl_for_suf_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), $list165);
        sethash($FUNCTION, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS);
        return NIL;
    }

    public static SubLObject old_handle_added_genl_for_suf_defns_metered(final SubLObject spec, final SubLObject genl) {
        final SubLObject defn_assertions = suf_defn_assertions(spec);
        if (NIL != defn_assertions) {
            propagate_added_suf_defns(spec, defn_assertions);
        }
        return NIL;
    }

    public static SubLObject old_handle_added_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = old_handle_added_genl_for_suf_defns_metered(spec, genl);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return old_handle_added_genl_for_suf_defns_metered(spec, genl);
    }

    public static SubLObject handle_removed_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_handle_removed_genl_for_suf_defns(spec, genl);
        }
        return old_handle_removed_genl_for_suf_defns(spec, genl);
    }

    public static SubLObject reset_old_handle_removed_genl_for_suf_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), $list165);
        sethash($FUNCTION, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS);
        return NIL;
    }

    public static SubLObject old_handle_removed_genl_for_suf_defns_metered(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == genls.genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
                final SubLObject defn_assertions = suf_defn_assertions(spec);
                if (NIL != defn_assertions) {
                    final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                    final SubLObject _prev_bind_0_$265 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$266 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$266 = at_vars.$at_genls_space$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$267 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), spec, UNPROVIDED, UNPROVIDED);
                                propagate_removed_suf_defns(genl, defn_assertions);
                            } finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$267, thread);
                                at_vars.$at_genls_space$.rebind(_prev_bind_0_$266, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$267 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$267, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$266, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$265, thread);
                    }
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject old_handle_removed_genl_for_suf_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = old_handle_removed_genl_for_suf_defns_metered(spec, genl);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return old_handle_removed_genl_for_suf_defns_metered(spec, genl);
    }

    public static SubLObject propagate_added_suf_defn(final SubLObject collection, final SubLObject defn_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defn$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_defn$.bind(defn_assertion, thread);
            genls.map_all_genls(symbol_function(ADD_SUF_DEFN_ASSERTION), collection, UNPROVIDED, UNPROVIDED);
        } finally {
            at_vars.$at_defn$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject propagate_removed_suf_defn(final SubLObject collection, final SubLObject defn_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defn$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_defn$.bind(defn_assertion, thread);
            genls.map_all_genls(symbol_function(REMOVE_SUF_DEFN_ASSERTION), collection, UNPROVIDED, UNPROVIDED);
        } finally {
            at_vars.$at_defn$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject propagate_added_suf_defns(final SubLObject collection, final SubLObject defn_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defns$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_defns$.bind(defn_assertions, thread);
            genls.map_all_genls(symbol_function(MERGE_SUF_DEFN_ASSERTIONS), collection, UNPROVIDED, UNPROVIDED);
        } finally {
            at_vars.$at_defns$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject propagate_removed_suf_defns(final SubLObject collection, final SubLObject defn_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defns$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_defns$.bind(defn_assertions, thread);
            genls.map_all_genls(symbol_function(REMOVE_SUF_DEFN_ASSERTIONS), collection, UNPROVIDED, UNPROVIDED);
        } finally {
            at_vars.$at_defns$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject add_suf_defn_assertion(final SubLObject collection, SubLObject defn_assertion) {
        if (defn_assertion == UNPROVIDED) {
            defn_assertion = at_vars.$at_defn$.getDynamicValue();
        }
        return cache_suf_defn_int(collection, defn_assertion, NIL);
    }

    public static SubLObject remove_suf_defn_assertion(final SubLObject collection, SubLObject defn_assertion) {
        if (defn_assertion == UNPROVIDED) {
            defn_assertion = at_vars.$at_defn$.getDynamicValue();
        }
        return uncache_suf_defn_int(collection, defn_assertion, NIL);
    }

    public static SubLObject merge_suf_defn_assertions(final SubLObject collection, SubLObject defn_assertions) {
        if (defn_assertions == UNPROVIDED) {
            defn_assertions = at_vars.$at_defns$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            SubLObject cdolist_list_var = defn_assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                defn_note(FIVE_INTEGER, $str162$___add_sufficent_defn__a__a_, collection, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        }
        return suf_defn_cache_merge(collection, defn_assertions);
    }

    public static SubLObject defn_genl_searchedP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject searchedP = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(at_vars.$at_genls_space$.getDynamicValue(thread), thread);
            searchedP = sbhl_marking_methods.sbhl_recorded_node_p(fort, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return searchedP;
    }

    public static SubLObject arg1_spec_cardinality(final SubLObject assertion) {
        return cardinality_estimates.spec_cardinality(assertions_high.gaf_arg1(assertion));
    }

    public static SubLObject suf_defn_sort(SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$sort_suf_defn_assertionsP$.getDynamicValue(thread)) {
            return assertions;
        }
        if (NIL == assertions) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(assertions)) {
            return assertions;
        }
        assertions = copy_list(assertions);
        assertions = list_utilities.delete_if_not(symbol_function(VALID_ASSERTION), assertions, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return Sort.sort(assertions, symbol_function($sym176$_), symbol_function(ARG1_SPEC_CARDINALITY));
    }

    public static SubLObject reset_col_suf_defns(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doneP = NIL;
        SubLObject cdolist_list_var = $list178;
        SubLObject defn_pred = NIL;
        defn_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$270 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_1_$271 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    final SubLObject pred_var = defn_pred;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$271 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$272 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$274 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                            SubLObject done_var = doneP;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$275 = doneP;
                                        final SubLObject token_var_$276 = NIL;
                                        while (NIL == done_var_$275) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$276);
                                            final SubLObject valid_$277 = makeBoolean(!token_var_$276.eql(assertion));
                                            if (NIL != valid_$277) {
                                                final SubLObject defn_collection = assertions_high.gaf_arg1(assertion);
                                                if (NIL != genls.genlP(defn_collection, collection, UNPROVIDED, UNPROVIDED)) {
                                                    cache_suf_defn(collection, assertion);
                                                }
                                            }
                                            done_var_$275 = makeBoolean((NIL == valid_$277) || (NIL != doneP));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$272 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$272, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$274, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$272, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$271, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$271, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$270, thread);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            defn_pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reset_all_suf_defns(SubLObject clearP, SubLObject traceP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (traceP == UNPROVIDED) {
            traceP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_trace_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$sort_suf_defn_assertionsP$.currentBinding(thread);
        try {
            at_vars.$at_trace_level$.bind(NIL != traceP ? FIVE_INTEGER : at_vars.$at_trace_level$.getDynamicValue(thread), thread);
            at_vars.$sort_suf_defn_assertionsP$.bind(NIL, thread);
            final SubLObject doneP = NIL;
            if (NIL != clearP) {
                clear_suf_defns();
            }
            SubLObject cdolist_list_var = $list178;
            SubLObject defn_pred = NIL;
            defn_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0_$279 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$280 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$280 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$281 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        final SubLObject pred_var = defn_pred;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str = NIL;
                            final SubLObject _prev_bind_0_$281 = $progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$282 = $progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$285 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                                SubLObject done_var = doneP;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        note_progress();
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$286 = doneP;
                                            final SubLObject token_var_$287 = NIL;
                                            while (NIL == done_var_$286) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$287);
                                                final SubLObject valid_$288 = makeBoolean(!token_var_$287.eql(assertion));
                                                if (NIL != valid_$288) {
                                                    final SubLObject defn_collection = assertions_high.gaf_arg1(assertion);
                                                    cache_suf_defn(defn_collection, assertion);
                                                }
                                                done_var_$286 = makeBoolean((NIL == valid_$288) || (NIL != doneP));
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$282 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$282, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                } 
                                noting_progress_postamble();
                            } finally {
                                $silent_progressP$.rebind(_prev_bind_8, thread);
                                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                                $progress_count$.rebind(_prev_bind_6, thread);
                                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                $progress_notification_count$.rebind(_prev_bind_4, thread);
                                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$285, thread);
                                $progress_last_pacification_time$.rebind(_prev_bind_1_$282, thread);
                                $progress_start_time$.rebind(_prev_bind_0_$281, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$281, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$280, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$280, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$279, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                defn_pred = cdolist_list_var.first();
            } 
        } finally {
            at_vars.$sort_suf_defn_assertionsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_trace_level$.rebind(_prev_bind_0, thread);
        }
        if (NIL != at_vars.$sort_suf_defn_assertionsP$.getDynamicValue(thread)) {
            sort_suf_defn_cache();
        }
        return NIL;
    }

    public static SubLObject initialize_sufficient_defns_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = $str179$Initializing_sufficient_defns_cac;
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
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
            reset_all_suf_defns(T, UNPROVIDED);
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject suf_quoted_defn_assertions(final SubLObject collection) {
        if (NIL != forts.fort_p(collection)) {
            return suf_quoted_defn_cache_get(collection);
        }
        if (NIL != obsolete.reifiable_natP(collection, UNPROVIDED, UNPROVIDED)) {
            return suf_quoted_defn_assertions(narts_high.find_nart(collection));
        }
        return NIL;
    }

    public static SubLObject suf_quoted_defnP(final SubLObject collection, final SubLObject defn) {
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = suf_quoted_defn_assertions(collection);
            SubLObject assertion = NIL;
            assertion = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    foundP = eql(defn, cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion)));
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static SubLObject any_sufficient_quoted_defnP(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL == foundP) {
                SubLObject csome_list_var = suf_quoted_defn_assertions(collection);
                SubLObject assertion = NIL;
                assertion = csome_list_var.first();
                while ((NIL == foundP) && (NIL != csome_list_var)) {
                    if ((NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_assertionP(assertion))) {
                        foundP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return foundP;
    }

    public static SubLObject any_sufficient_quoted_defn_anywhereP(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.has_suf_defn_somewhereP(collection, T);
        }
        return old_any_sufficient_quoted_defn_anywhereP(collection);
    }

    public static SubLObject old_any_sufficient_quoted_defn_anywhereP(final SubLObject collection) {
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = suf_quoted_defn_assertions(collection);
            SubLObject assertion = NIL;
            assertion = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    foundP = T;
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static SubLObject suf_quoted_defn_assertionP(final SubLObject col, final SubLObject assertion) {
        return subl_promotions.memberP(assertion, suf_quoted_defn_cache_get(col), symbol_function(KBEQ), UNPROVIDED);
    }

    public static SubLObject quoted_has_typeP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.ground_nautP(collection, UNPROVIDED)) {
            return quoted_has_typeP(v_term, cycl_utilities.find_ground_naut(collection), mt);
        }
        if (NIL != forts.fort_p(collection)) {
            return makeBoolean((NIL != isa.quoted_isaP(v_term, collection, mt, UNPROVIDED)) || (NIL != quoted_defns_admitP(collection, v_term, mt)));
        }
        return NIL;
    }

    public static SubLObject quiet_quoted_has_typeP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.ground_nautP(collection, UNPROVIDED)) {
            return quiet_quoted_has_typeP(v_term, cycl_utilities.find_ground_naut(collection), mt);
        }
        if (NIL != forts.fort_p(collection)) {
            return makeBoolean((NIL != isa.quoted_isaP(v_term, collection, mt, UNPROVIDED)) || (NIL != quiet_quoted_defns_admitP(collection, v_term, mt)));
        }
        return NIL;
    }

    public static SubLObject not_quoted_has_type_by_extent_knownP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.ground_nautP(collection, UNPROVIDED)) {
            return not_quoted_has_type_by_extent_knownP(v_term, cycl_utilities.find_ground_naut(collection), mt);
        }
        if ((NIL != forts.fort_p(collection)) && (NIL != kb_accessors.completely_enumerable_collectionP(collection, mt))) {
            return makeBoolean(NIL == quiet_quoted_has_typeP(v_term, collection, mt));
        }
        return NIL;
    }

    public static SubLObject not_quoted_has_typeP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.ground_nautP(collection, UNPROVIDED)) {
            return not_quoted_has_typeP(v_term, cycl_utilities.find_ground_naut(collection), mt);
        }
        if (NIL != forts.fort_p(collection)) {
            return makeBoolean((NIL != quoted_defns_rejectP(collection, v_term, mt)) || (NIL != isa.not_quoted_isaP(v_term, collection, mt, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject quiet_not_quoted_has_typeP(final SubLObject v_term, final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.ground_nautP(collection, UNPROVIDED)) {
            return not_quoted_has_typeP(v_term, cycl_utilities.find_ground_naut(collection), mt);
        }
        if (NIL != forts.fort_p(collection)) {
            return makeBoolean((NIL != quiet_quoted_defns_rejectP(collection, v_term, mt)) || (NIL != isa.not_quoted_isaP(v_term, collection, mt, UNPROVIDED)));
        }
        return NIL;
    }

    public static SubLObject add_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_add_suf_quoted_defn(source, assertion);
        }
        return old_add_suf_quoted_defn(source, assertion);
    }

    public static SubLObject add_iff_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_add_iff_quoted_defn(source, assertion);
        }
        return old_add_suf_quoted_defn(source, assertion);
    }

    public static SubLObject old_add_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg1(assertion);
            final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
            if (((NIL != $bootstrapping_kbP$.getDynamicValue(thread)) && (NIL != forts.fort_p(col))) && defn.isSymbol()) {
                cache_suf_quoted_defn(col, assertion);
            } else {
                final SubLObject _prev_bind_0_$290 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$291 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject valid_defnP = valid_defnP(defn, col);
                    final SubLObject collectionP = forts.fort_p(col);
                    if ((NIL != collectionP) && (NIL != valid_defnP)) {
                        cache_suf_quoted_defn(col, assertion);
                    } else
                        if (NIL == collectionP) {
                            defn_cerror(ONE_INTEGER, $$$skip_quoted_defn_op, $str149$_s_is_not_a_collection_in__s, col, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (NIL == valid_defnP) {
                                defn_cerror(ONE_INTEGER, $$$skip_quoted_defn_op, $str150$_s_is_not_a_symbol, defn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }


                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$291, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$290, thread);
                }
            }
        } finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject remove_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_remove_suf_quoted_defn(source, assertion);
        }
        return old_remove_suf_quoted_defn(source, assertion);
    }

    public static SubLObject remove_iff_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_remove_iff_quoted_defn(source, assertion);
        }
        return old_remove_suf_quoted_defn(source, assertion);
    }

    public static SubLObject old_remove_suf_quoted_defn(SubLObject source, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg1(assertion);
            final SubLObject defn = cycl_subl_symbol_symbol(assertions_high.gaf_arg2(assertion));
            if (((NIL != $bootstrapping_kbP$.getDynamicValue(thread)) && (NIL != forts.fort_p(col))) && defn.isSymbol()) {
                uncache_suf_quoted_defn(col, assertion);
            } else {
                final SubLObject _prev_bind_0_$292 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$293 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject valid_defnP = valid_defnP(defn, col);
                    final SubLObject collectionP = forts.fort_p(col);
                    if ((NIL != collectionP) && (NIL != valid_defnP)) {
                        uncache_suf_quoted_defn(col, assertion);
                    } else
                        if (NIL == collectionP) {
                            defn_cerror(ONE_INTEGER, $$$skip_quoted_defn_op, $str149$_s_is_not_a_collection_in__s, col, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else
                            if (NIL == valid_defnP) {
                                defn_cerror(ONE_INTEGER, $$$skip_quoted_defn_op, $str150$_s_is_not_a_symbol, defn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }


                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$293, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$292, thread);
                }
            }
        } finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject reset_cache_suf_quoted_defn_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), $list156);
        sethash($FUNCTION, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), CACHE_SUF_QUOTED_DEFN);
        return NIL;
    }

    public static SubLObject cache_suf_quoted_defn_metered(final SubLObject col, final SubLObject assertion) {
        cache_suf_quoted_defn_int(col, assertion, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cache_suf_quoted_defn(final SubLObject col, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = cache_suf_quoted_defn_metered(col, assertion);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), add(gethash($CALLS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), cons(list(col, assertion), gethash($ARGS, $cache_suf_quoted_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return cache_suf_quoted_defn_metered(col, assertion);
    }

    public static SubLObject reset_uncache_suf_quoted_defn_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), $list156);
        sethash($FUNCTION, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), UNCACHE_SUF_QUOTED_DEFN);
        return NIL;
    }

    public static SubLObject uncache_suf_quoted_defn_metered(final SubLObject col, final SubLObject assertion) {
        uncache_suf_quoted_defn_int(col, assertion, UNPROVIDED);
        return NIL;
    }

    public static SubLObject uncache_suf_quoted_defn(final SubLObject col, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = uncache_suf_quoted_defn_metered(col, assertion);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), add(gethash($CALLS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), cons(list(col, assertion), gethash($ARGS, $uncache_suf_quoted_defn_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return uncache_suf_quoted_defn_metered(col, assertion);
    }

    public static SubLObject cache_suf_quoted_defn_int(final SubLObject col, final SubLObject assertion, SubLObject propagateP) {
        if (propagateP == UNPROVIDED) {
            propagateP = T;
        }
        if (NIL != suf_quoted_defn_assertionP(col, assertion)) {
            return NIL;
        }
        if (NIL != propagateP) {
            return propagate_added_suf_quoted_defn(col, assertion);
        }
        defn_note(FOUR_INTEGER, $str193$___add_sufficent_quoted_defn__a__, col, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return suf_quoted_defn_cache_add(col, assertion);
    }

    public static SubLObject uncache_suf_quoted_defn_int(final SubLObject col, final SubLObject assertion, SubLObject propagateP) {
        if (propagateP == UNPROVIDED) {
            propagateP = T;
        }
        if (NIL == suf_quoted_defn_assertionP(col, assertion)) {
            defn_error(FOUR_INTEGER, $str194$removed_sufficient_quoted_defn_no, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (NIL != propagateP) {
            return propagate_removed_suf_quoted_defn(col, assertion);
        }
        defn_note(FOUR_INTEGER, $str195$___remove_sufficent_quoted_defn__, col, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return suf_quoted_defn_cache_rem(col, assertion);
    }

    public static SubLObject handle_added_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_handle_added_genl_for_suf_quoted_defns(spec, genl);
        }
        return old_handle_added_genl_for_suf_quoted_defns(spec, genl);
    }

    public static SubLObject reset_old_handle_added_genl_for_suf_quoted_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $list165);
        sethash($FUNCTION, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS);
        return NIL;
    }

    public static SubLObject old_handle_added_genl_for_suf_quoted_defns_metered(final SubLObject spec, final SubLObject genl) {
        final SubLObject defn_assertions = suf_quoted_defn_assertions(spec);
        if (NIL != defn_assertions) {
            propagate_added_suf_quoted_defns(spec, defn_assertions);
        }
        return NIL;
    }

    public static SubLObject old_handle_added_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = old_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return old_handle_added_genl_for_suf_quoted_defns_metered(spec, genl);
    }

    public static SubLObject handle_removed_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $use_new_defns_functionsP$.getDynamicValue(thread)) {
            return defns.new_handle_removed_genl_for_suf_quoted_defns(spec, genl);
        }
        return old_handle_removed_genl_for_suf_quoted_defns(spec, genl);
    }

    public static SubLObject reset_old_handle_removed_genl_for_suf_quoted_defns_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), $list165);
        sethash($FUNCTION, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS);
        return NIL;
    }

    public static SubLObject old_handle_removed_genl_for_suf_quoted_defns_metered(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == genls.genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
                final SubLObject defn_assertions = suf_quoted_defn_assertions(spec);
                if (NIL != defn_assertions) {
                    final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                    final SubLObject _prev_bind_0_$294 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$295 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$295 = at_vars.$at_genls_space$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$296 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), spec, UNPROVIDED, UNPROVIDED);
                                propagate_removed_suf_quoted_defns(genl, defn_assertions);
                            } finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$296, thread);
                                at_vars.$at_genls_space$.rebind(_prev_bind_0_$295, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$296 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$296, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$295, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$294, thread);
                    }
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject old_handle_removed_genl_for_suf_quoted_defns(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = old_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), add(gethash($CALLS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return old_handle_removed_genl_for_suf_quoted_defns_metered(spec, genl);
    }

    public static SubLObject propagate_added_suf_quoted_defn(final SubLObject collection, final SubLObject defn_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defn$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_defn$.bind(defn_assertion, thread);
            genls.map_all_genls(symbol_function(ADD_SUF_QUOTED_DEFN_ASSERTION), collection, UNPROVIDED, UNPROVIDED);
        } finally {
            at_vars.$at_defn$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject propagate_removed_suf_quoted_defn(final SubLObject collection, final SubLObject defn_assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defn$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_defn$.bind(defn_assertion, thread);
            genls.map_all_genls(symbol_function(REMOVE_SUF_QUOTED_DEFN_ASSERTION), collection, UNPROVIDED, UNPROVIDED);
        } finally {
            at_vars.$at_defn$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject propagate_added_suf_quoted_defns(final SubLObject collection, final SubLObject defn_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defns$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_defns$.bind(defn_assertions, thread);
            genls.map_all_genls(symbol_function(MERGE_SUF_QUOTED_DEFN_ASSERTIONS), collection, UNPROVIDED, UNPROVIDED);
        } finally {
            at_vars.$at_defns$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject propagate_removed_suf_quoted_defns(final SubLObject collection, final SubLObject defn_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_defns$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_defns$.bind(defn_assertions, thread);
            genls.map_all_genls(symbol_function(REMOVE_SUF_QUOTED_DEFN_ASSERTIONS), collection, UNPROVIDED, UNPROVIDED);
        } finally {
            at_vars.$at_defns$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject add_suf_quoted_defn_assertion(final SubLObject collection, SubLObject defn_assertion) {
        if (defn_assertion == UNPROVIDED) {
            defn_assertion = at_vars.$at_defn$.getDynamicValue();
        }
        return cache_suf_quoted_defn_int(collection, defn_assertion, NIL);
    }

    public static SubLObject remove_suf_quoted_defn_assertion(final SubLObject collection, SubLObject defn_assertion) {
        if (defn_assertion == UNPROVIDED) {
            defn_assertion = at_vars.$at_defn$.getDynamicValue();
        }
        return uncache_suf_quoted_defn_int(collection, defn_assertion, NIL);
    }

    public static SubLObject merge_suf_quoted_defn_assertions(final SubLObject collection, SubLObject defn_assertions) {
        if (defn_assertions == UNPROVIDED) {
            defn_assertions = at_vars.$at_defns$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            SubLObject cdolist_list_var = defn_assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                defn_note(FIVE_INTEGER, $str162$___add_sufficent_defn__a__a_, collection, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        }
        return suf_quoted_defn_cache_merge(collection, defn_assertions);
    }

    public static SubLObject reset_col_suf_quoted_defns(final SubLObject collection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject doneP = NIL;
        SubLObject cdolist_list_var = $list206;
        SubLObject defn_pred = NIL;
        defn_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject pred_var = defn_pred;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$299 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$300 = $progress_last_pacification_time$.currentBinding(thread);
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
                        SubLObject done_var = doneP;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$301 = doneP;
                                    final SubLObject token_var_$302 = NIL;
                                    while (NIL == done_var_$301) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$302);
                                        final SubLObject valid_$303 = makeBoolean(!token_var_$302.eql(assertion));
                                        if (NIL != valid_$303) {
                                            final SubLObject defn_collection = assertions_high.gaf_arg1(assertion);
                                            if (NIL != genls.genlP(defn_collection, collection, UNPROVIDED, UNPROVIDED)) {
                                                cache_suf_quoted_defn(collection, assertion);
                                            }
                                        }
                                        done_var_$301 = makeBoolean((NIL == valid_$303) || (NIL != doneP));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$300 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$300, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$300, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$299, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            defn_pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reset_all_suf_quoted_defns(SubLObject clearP, SubLObject traceP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (traceP == UNPROVIDED) {
            traceP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_trace_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$sort_suf_defn_assertionsP$.currentBinding(thread);
        try {
            at_vars.$at_trace_level$.bind(NIL != traceP ? FIVE_INTEGER : at_vars.$at_trace_level$.getDynamicValue(thread), thread);
            at_vars.$sort_suf_defn_assertionsP$.bind(NIL, thread);
            final SubLObject doneP = NIL;
            if (NIL != clearP) {
                clear_suf_quoted_defns();
            }
            SubLObject cdolist_list_var = $list206;
            SubLObject defn_pred = NIL;
            defn_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject _prev_bind_0_$305 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$306 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                    final SubLObject _prev_bind_0_$306 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$307 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                        final SubLObject pred_var = defn_pred;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str = NIL;
                            final SubLObject _prev_bind_0_$307 = $progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$308 = $progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$311 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                                SubLObject done_var = doneP;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        note_progress();
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                            SubLObject done_var_$312 = doneP;
                                            final SubLObject token_var_$313 = NIL;
                                            while (NIL == done_var_$312) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$313);
                                                final SubLObject valid_$314 = makeBoolean(!token_var_$313.eql(assertion));
                                                if (NIL != valid_$314) {
                                                    final SubLObject defn_collection = assertions_high.gaf_arg1(assertion);
                                                    cache_suf_quoted_defn(defn_collection, assertion);
                                                }
                                                done_var_$312 = makeBoolean((NIL == valid_$314) || (NIL != doneP));
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$308 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$308, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                } 
                                noting_progress_postamble();
                            } finally {
                                $silent_progressP$.rebind(_prev_bind_8, thread);
                                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                                $progress_count$.rebind(_prev_bind_6, thread);
                                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                $progress_notification_count$.rebind(_prev_bind_4, thread);
                                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$311, thread);
                                $progress_last_pacification_time$.rebind(_prev_bind_1_$308, thread);
                                $progress_start_time$.rebind(_prev_bind_0_$307, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$307, thread);
                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$306, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$306, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$305, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                defn_pred = cdolist_list_var.first();
            } 
        } finally {
            at_vars.$sort_suf_defn_assertionsP$.rebind(_prev_bind_2, thread);
            at_vars.$at_trace_level$.rebind(_prev_bind_0, thread);
        }
        if (NIL != at_vars.$sort_suf_defn_assertionsP$.getDynamicValue(thread)) {
            sort_suf_quoted_defn_cache();
        }
        return NIL;
    }

    public static SubLObject initialize_sufficient_quoted_defns_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = $str207$Initializing_sufficient_quoted_de;
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
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
            reset_all_suf_quoted_defns(T, UNPROVIDED);
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject suf_function_cache(final SubLObject type) {
        if (type.eql($ISA)) {
            return defns.$suf_function_cache_index$.getGlobalValue();
        }
        if (type.eql($QUOTED_ISA)) {
            return defns.$suf_quoted_function_cache_index$.getGlobalValue();
        }
        return NIL;
    }

    public static SubLObject get_suf_function_assertions(final SubLObject collection, final SubLObject type) {
        return defns.defns_cache_gethash(collection, suf_function_cache(type));
    }

    public static SubLObject set_suf_function_assertions(final SubLObject collection, final SubLObject assertions, final SubLObject type) {
        defns.defns_cache_sethash(collection, suf_function_cache(type), assertions);
        return assertions;
    }

    public static SubLObject rem_suf_function_assertions(final SubLObject collection, final SubLObject type) {
        defns.defns_cache_remhash(collection, suf_function_cache(type));
        return collection;
    }

    public static SubLObject suf_function_assertions(final SubLObject collection, final SubLObject type) {
        if (NIL != forts.fort_p(collection)) {
            get_suf_function_assertions(collection, type);
        } else
            if (NIL != obsolete.reifiable_natP(collection, UNPROVIDED, UNPROVIDED)) {
                return suf_function_assertions(narts_high.find_nart(collection), type);
            }

        return NIL;
    }

    public static SubLObject suf_functionP(final SubLObject collection, final SubLObject function, final SubLObject type) {
        SubLObject foundP = NIL;
        if (NIL == foundP) {
            SubLObject csome_list_var = suf_function_assertions(collection, type);
            SubLObject assertion = NIL;
            assertion = csome_list_var.first();
            while ((NIL == foundP) && (NIL != csome_list_var)) {
                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                    foundP = eql(function, assertions_high.gaf_arg1(assertion));
                }
                csome_list_var = csome_list_var.rest();
                assertion = csome_list_var.first();
            } 
        }
        return foundP;
    }

    public static SubLObject any_sufficient_functionP(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return any_sufficient_functionP_int(collection, mt, $ISA);
    }

    public static SubLObject any_sufficient_quoted_functionP(final SubLObject collection, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return any_sufficient_functionP_int(collection, mt, $QUOTED_ISA);
    }

    public static SubLObject any_sufficient_functionP_int(final SubLObject collection, final SubLObject mt, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt), thread);
            if (NIL == foundP) {
                SubLObject csome_list_var = suf_function_assertions(collection, type);
                SubLObject assertion = NIL;
                assertion = csome_list_var.first();
                while ((NIL == foundP) && (NIL != csome_list_var)) {
                    if (((NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_assertionP(assertion))) && (NIL != genls.genlP(assertions_high.gaf_arg2(assertion), collection, UNPROVIDED, UNPROVIDED))) {
                        foundP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return foundP;
    }

    public static SubLObject any_sufficient_non_reified_functionP(final SubLObject collection, final SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            if (NIL == foundP) {
                SubLObject csome_list_var = suf_function_assertions(collection, type);
                SubLObject assertion = NIL;
                assertion = csome_list_var.first();
                while ((NIL == foundP) && (NIL != csome_list_var)) {
                    if (((NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) && (NIL != mt_relevance_macros.relevant_assertionP(assertion))) && (NIL != genls.genlP(assertions_high.gaf_arg2(assertion), collection, UNPROVIDED, UNPROVIDED))) {
                        foundP = makeBoolean(NIL == czer_utilities.reifiable_functorP(assertions_high.gaf_arg1(assertion), UNPROVIDED));
                    }
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return foundP;
    }

    public static SubLObject suf_function_assertionP(final SubLObject col, final SubLObject assertion, final SubLObject type) {
        return subl_promotions.memberP(assertion, get_suf_function_assertions(col, type), symbol_function(KBEQ), UNPROVIDED);
    }

    public static SubLObject sufficient_function_of(final SubLObject fn, final SubLObject type, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject collections = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            final SubLObject cdohash_table = suf_function_cache(type);
            SubLObject col = NIL;
            SubLObject assertions = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    col = getEntryKey(cdohash_entry);
                    assertions = getEntryValue(cdohash_entry);
                    SubLObject foundP = NIL;
                    if (NIL == foundP) {
                        SubLObject csome_list_var = assertions;
                        SubLObject assertion = NIL;
                        assertion = csome_list_var.first();
                        while ((NIL == foundP) && (NIL != csome_list_var)) {
                            if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                foundP = makeBoolean((NIL != mt_relevance_macros.relevant_assertionP(assertion)) && fn.eql(assertions_high.gaf_arg1(assertion)));
                            }
                            csome_list_var = csome_list_var.rest();
                            assertion = csome_list_var.first();
                        } 
                    }
                    if (NIL != foundP) {
                        collections = cons(col, collections);
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return genls.min_cols(collections, mt, UNPROVIDED);
    }

    public static SubLObject add_suf_function(SubLObject source, final SubLObject assertion) {
        return add_suf_function_int(source, assertion, $ISA);
    }

    public static SubLObject remove_suf_function(SubLObject source, final SubLObject assertion) {
        return remove_suf_function_int(source, assertion, $ISA);
    }

    public static SubLObject add_suf_quoted_function(SubLObject source, final SubLObject assertion) {
        return add_suf_function_int(source, assertion, $QUOTED_ISA);
    }

    public static SubLObject remove_suf_quoted_function(SubLObject source, final SubLObject assertion) {
        return remove_suf_function_int(source, assertion, $QUOTED_ISA);
    }

    public static SubLObject add_suf_function_int(SubLObject source, final SubLObject assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg2(assertion);
            final SubLObject function = assertions_high.gaf_arg1(assertion);
            if (((NIL != $bootstrapping_kbP$.getDynamicValue(thread)) && (NIL != forts.fort_p(col))) && (NIL != forts.fort_p(function))) {
                cache_suf_function(col, assertion, type);
            } else {
                final SubLObject _prev_bind_0_$316 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$317 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject collectionP = forts.fort_p(col);
                    final SubLObject functionP = makeBoolean((NIL != fort_types_interface.non_predicate_functionP(function)) || (NIL != at_utilities.truth_functionP(function)));
                    if (((type == $QUOTED_ISA) && (NIL != assertion_utilities.gaf_assertion_has_pred_p(assertion, $$evaluationResultQuotedIsa))) && (NIL == fort_types_interface.evaluatable_function_p(function))) {
                        defn_cerror(TWO_INTEGER, $str214$oh_well___, $str215$_s_is_not_a_evaluatable_functor_i, function, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if ((NIL != collectionP) && (NIL != functionP)) {
                            cache_suf_function(col, assertion, type);
                        } else
                            if (NIL == collectionP) {
                                defn_cerror(TWO_INTEGER, $str214$oh_well___, $str149$_s_is_not_a_collection_in__s, col, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != forts.fort_p(col)) {
                                    cache_suf_function(col, assertion, type);
                                }
                            } else
                                if (NIL == functionP) {
                                    defn_cerror(TWO_INTEGER, $str214$oh_well___, $str216$_s_is_not_a_functor_in__s, function, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    cache_suf_function(col, assertion, type);
                                }



                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$317, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$316, thread);
                }
            }
        } finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject remove_suf_function_int(SubLObject source, final SubLObject assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sbhl_link_vars.$added_source$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_link_vars.$added_assertion$.currentBinding(thread);
        try {
            sbhl_link_vars.$added_source$.bind(source, thread);
            sbhl_link_vars.$added_assertion$.bind(assertion, thread);
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject col = assertions_high.gaf_arg2(assertion);
            final SubLObject function = assertions_high.gaf_arg1(assertion);
            if (((NIL != $bootstrapping_kbP$.getDynamicValue(thread)) && (NIL != forts.fort_p(col))) && (NIL != forts.fort_p(function))) {
                uncache_suf_function(col, assertion, type);
            } else {
                final SubLObject _prev_bind_0_$318 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$319 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                    mt_relevance_macros.$mt$.bind(mt, thread);
                    final SubLObject collectionP = forts.fort_p(col);
                    final SubLObject functionP = makeBoolean((NIL != fort_types_interface.non_predicate_functionP(function)) || (NIL != at_utilities.truth_functionP(function)));
                    if ((NIL != collectionP) && (NIL != functionP)) {
                        uncache_suf_function(col, assertion, type);
                    } else
                        if (NIL == collectionP) {
                            defn_cerror(TWO_INTEGER, $str214$oh_well___, $str149$_s_is_not_a_collection_in__s, col, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            if (NIL != suf_function_assertionP(col, assertion, type)) {
                                uncache_suf_function(col, assertion, type);
                            }
                        } else
                            if (NIL == functionP) {
                                defn_cerror(TWO_INTEGER, $str214$oh_well___, $str216$_s_is_not_a_functor_in__s, function, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                if (NIL != suf_function_assertionP(col, assertion, type)) {
                                    uncache_suf_function(col, assertion, type);
                                }
                            }


                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$319, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$318, thread);
                }
            }
        } finally {
            sbhl_link_vars.$added_assertion$.rebind(_prev_bind_2, thread);
            sbhl_link_vars.$added_source$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject reset_cache_suf_function_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $cache_suf_function_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $cache_suf_function_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $cache_suf_function_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $cache_suf_function_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $cache_suf_function_meters$.getDynamicValue(thread), $list220);
        sethash($FUNCTION, $cache_suf_function_meters$.getDynamicValue(thread), CACHE_SUF_FUNCTION);
        return NIL;
    }

    public static SubLObject cache_suf_function_metered(final SubLObject col, final SubLObject assertion, final SubLObject type) {
        cache_suf_function_int(col, assertion, type, UNPROVIDED);
        return NIL;
    }

    public static SubLObject cache_suf_function(final SubLObject col, final SubLObject assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = cache_suf_function_metered(col, assertion, type);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $cache_suf_function_meters$.getDynamicValue(thread), add(gethash($CALLS, $cache_suf_function_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $cache_suf_function_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $cache_suf_function_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $cache_suf_function_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $cache_suf_function_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $cache_suf_function_meters$.getDynamicValue(thread), cons(list(col, assertion, type), gethash($ARGS, $cache_suf_function_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return cache_suf_function_metered(col, assertion, type);
    }

    public static SubLObject reset_uncache_suf_function_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $uncache_suf_function_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $uncache_suf_function_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $uncache_suf_function_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $uncache_suf_function_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $uncache_suf_function_meters$.getDynamicValue(thread), $list220);
        sethash($FUNCTION, $uncache_suf_function_meters$.getDynamicValue(thread), UNCACHE_SUF_FUNCTION);
        return NIL;
    }

    public static SubLObject uncache_suf_function_metered(final SubLObject col, final SubLObject assertion, final SubLObject type) {
        uncache_suf_function_int(col, assertion, type, UNPROVIDED);
        return NIL;
    }

    public static SubLObject uncache_suf_function(final SubLObject col, final SubLObject assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = uncache_suf_function_metered(col, assertion, type);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $uncache_suf_function_meters$.getDynamicValue(thread), add(gethash($CALLS, $uncache_suf_function_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $uncache_suf_function_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $uncache_suf_function_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $uncache_suf_function_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $uncache_suf_function_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $uncache_suf_function_meters$.getDynamicValue(thread), cons(list(col, assertion, type), gethash($ARGS, $uncache_suf_function_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return uncache_suf_function_metered(col, assertion, type);
    }

    public static SubLObject cache_suf_function_int(final SubLObject col, final SubLObject assertion, final SubLObject type, SubLObject propagateP) {
        if (propagateP == UNPROVIDED) {
            propagateP = T;
        }
        if (NIL != suf_function_assertionP(col, assertion, type)) {
            return NIL;
        }
        if (NIL != propagateP) {
            return propagate_added_suf_function(col, assertion, type);
        }
        defn_note(FOUR_INTEGER, $str226$____a__a__a_, type == $ISA ? $str227$add_sufficient_function : $str228$add_sufficient_quoted_function, col, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject new_val = suf_function_sort(cons(assertion, get_suf_function_assertions(col, type)));
        if (NIL != new_val) {
            set_suf_function_assertions(col, new_val, type);
        }
        return new_val;
    }

    public static SubLObject uncache_suf_function_int(final SubLObject col, final SubLObject assertion, final SubLObject type, SubLObject propagateP) {
        if (propagateP == UNPROVIDED) {
            propagateP = T;
        }
        if (NIL == suf_function_assertionP(col, assertion, type)) {
            defn_error(THREE_INTEGER, $str229$removed_sufficient_function_not_f, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return NIL;
        }
        if (NIL != propagateP) {
            return propagate_removed_suf_function(col, assertion, type);
        }
        defn_note(FOUR_INTEGER, $str226$____a__a__a_, type == $ISA ? $str230$remove_sufficient_function : $str231$remove_sufficient_quoted_function, col, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject new_val = suf_function_sort(delete(assertion, get_suf_function_assertions(col, type), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        if (NIL != new_val) {
            set_suf_function_assertions(col, new_val, type);
        } else {
            rem_suf_function_assertions(col, type);
        }
        return new_val;
    }

    public static SubLObject reset_handle_added_genl_for_suf_functions_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), $list165);
        sethash($FUNCTION, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS);
        return NIL;
    }

    public static SubLObject handle_added_genl_for_suf_functions_metered(final SubLObject spec, final SubLObject genl) {
        SubLObject cdolist_list_var = $list235;
        SubLObject type = NIL;
        type = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject function_assertions = suf_function_assertions(spec, type);
            if (NIL != function_assertions) {
                propagate_added_suf_functions(spec, function_assertions, type);
            }
            cdolist_list_var = cdolist_list_var.rest();
            type = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject handle_added_genl_for_suf_functions(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = handle_added_genl_for_suf_functions_metered(spec, genl);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), add(gethash($CALLS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return handle_added_genl_for_suf_functions_metered(spec, genl);
    }

    public static SubLObject reset_handle_removed_genl_for_suf_functions_meters() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        sethash($CALLS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), ZERO_INTEGER);
        sethash($TIMES, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
        sethash($RESULTS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
        sethash($ARGS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), NIL);
        sethash($ARG_LIST, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), $list165);
        sethash($FUNCTION, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS);
        return NIL;
    }

    public static SubLObject handle_removed_genl_for_suf_functions_metered(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == genls.genlP(spec, genl, UNPROVIDED, UNPROVIDED)) {
                SubLObject cdolist_list_var = $list235;
                SubLObject type = NIL;
                type = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject function_assertions = suf_function_assertions(spec, type);
                    if (NIL != function_assertions) {
                        final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                        final SubLObject _prev_bind_0_$320 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$321 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                            sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                final SubLObject _prev_bind_0_$321 = at_vars.$at_genls_space$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$322 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                try {
                                    at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), spec, UNPROVIDED, UNPROVIDED);
                                    propagate_removed_suf_functions(genl, function_assertions, type);
                                } finally {
                                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$322, thread);
                                    at_vars.$at_genls_space$.rebind(_prev_bind_0_$321, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$322 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$322, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$321, thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$320, thread);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    type = cdolist_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject handle_removed_genl_for_suf_functions(final SubLObject spec, final SubLObject genl) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$defn_metersP$.getDynamicValue(thread)) {
            SubLObject result = NIL;
            SubLObject run_time = NIL;
            final SubLObject time_var = get_internal_real_time();
            result = handle_removed_genl_for_suf_functions_metered(spec, genl);
            run_time = divide(subtract(get_internal_real_time(), time_var), time_high.$internal_time_units_per_second$.getGlobalValue());
            sethash($CALLS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), add(gethash($CALLS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED), ONE_INTEGER));
            sethash($TIMES, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(run_time, gethash($TIMES, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($RESULTS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(result, gethash($RESULTS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
            sethash($ARGS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), cons(list(spec, genl), gethash($ARGS, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(thread), UNPROVIDED)));
            return result;
        }
        return handle_removed_genl_for_suf_functions_metered(spec, genl);
    }

    public static SubLObject propagate_added_suf_function(final SubLObject collection, final SubLObject function_assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_function$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_function$.bind(function_assertion, thread);
            if (type.eql($ISA)) {
                genls.map_all_genls(symbol_function(ADD_SUF_FUNCTION_ASSERTION), collection, UNPROVIDED, UNPROVIDED);
            } else
                if (type.eql($QUOTED_ISA)) {
                    genls.map_all_genls(symbol_function(ADD_SUF_QUOTED_FUNCTION_ASSERTION), collection, UNPROVIDED, UNPROVIDED);
                }

        } finally {
            at_vars.$at_function$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject propagate_removed_suf_function(final SubLObject collection, final SubLObject function_assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_function$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_function$.bind(function_assertion, thread);
            if (type.eql($ISA)) {
                genls.map_all_genls(symbol_function(REMOVE_SUF_FUNCTION_ASSERTION), collection, UNPROVIDED, UNPROVIDED);
            } else
                if (type.eql($QUOTED_ISA)) {
                    genls.map_all_genls(symbol_function(REMOVE_SUF_QUOTED_FUNCTION_ASSERTION), collection, UNPROVIDED, UNPROVIDED);
                }

        } finally {
            at_vars.$at_function$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject propagate_added_suf_functions(final SubLObject collection, final SubLObject function_assertions, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_functions$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_functions$.bind(function_assertions, thread);
            if (type.eql($ISA)) {
                genls.map_all_genls(symbol_function(MERGE_SUF_FUNCTION_ASSERTIONS), collection, UNPROVIDED, UNPROVIDED);
            } else
                if (type.eql($QUOTED_ISA)) {
                    genls.map_all_genls(symbol_function(MERGE_SUF_QUOTED_FUNCTION_ASSERTIONS), collection, UNPROVIDED, UNPROVIDED);
                }

        } finally {
            at_vars.$at_functions$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject propagate_removed_suf_functions(final SubLObject collection, final SubLObject function_assertions, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_functions$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            at_vars.$at_functions$.bind(function_assertions, thread);
            if (type.eql($ISA)) {
                genls.map_all_genls(symbol_function(REMOVE_SUF_FUNCTION_ASSERTIONS), collection, UNPROVIDED, UNPROVIDED);
            } else
                if (type.eql($QUOTED_ISA)) {
                    genls.map_all_genls(symbol_function(REMOVE_SUF_QUOTED_FUNCTION_ASSERTIONS), collection, UNPROVIDED, UNPROVIDED);
                }

        } finally {
            at_vars.$at_functions$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject add_suf_function_assertion(final SubLObject collection, SubLObject function_assertion) {
        if (function_assertion == UNPROVIDED) {
            function_assertion = at_vars.$at_function$.getDynamicValue();
        }
        return cache_suf_function_int(collection, function_assertion, $ISA, NIL);
    }

    public static SubLObject remove_suf_function_assertion(final SubLObject collection, SubLObject function_assertion) {
        if (function_assertion == UNPROVIDED) {
            function_assertion = at_vars.$at_function$.getDynamicValue();
        }
        return uncache_suf_function_int(collection, function_assertion, $ISA, NIL);
    }

    public static SubLObject merge_suf_function_assertions(final SubLObject collection, SubLObject function_assertions) {
        if (function_assertions == UNPROVIDED) {
            function_assertions = at_vars.$at_functions$.getDynamicValue();
        }
        return merge_suf_function_assertions_int(collection, function_assertions, $ISA);
    }

    public static SubLObject remove_suf_function_assertions(final SubLObject collection, SubLObject function_assertions) {
        if (function_assertions == UNPROVIDED) {
            function_assertions = at_vars.$at_functions$.getDynamicValue();
        }
        return remove_suf_function_assertions_int(collection, function_assertions, $ISA);
    }

    public static SubLObject add_suf_quoted_function_assertion(final SubLObject collection, SubLObject function_assertion) {
        if (function_assertion == UNPROVIDED) {
            function_assertion = at_vars.$at_function$.getDynamicValue();
        }
        return cache_suf_function_int(collection, function_assertion, $QUOTED_ISA, NIL);
    }

    public static SubLObject remove_suf_quoted_function_assertion(final SubLObject collection, SubLObject function_assertion) {
        if (function_assertion == UNPROVIDED) {
            function_assertion = at_vars.$at_function$.getDynamicValue();
        }
        return uncache_suf_function_int(collection, function_assertion, $QUOTED_ISA, NIL);
    }

    public static SubLObject merge_suf_quoted_function_assertions(final SubLObject collection, SubLObject function_assertions) {
        if (function_assertions == UNPROVIDED) {
            function_assertions = at_vars.$at_functions$.getDynamicValue();
        }
        return merge_suf_function_assertions_int(collection, function_assertions, $QUOTED_ISA);
    }

    public static SubLObject remove_suf_quoted_function_assertions(final SubLObject collection, SubLObject function_assertions) {
        if (function_assertions == UNPROVIDED) {
            function_assertions = at_vars.$at_functions$.getDynamicValue();
        }
        return remove_suf_function_assertions_int(collection, function_assertions, $QUOTED_ISA);
    }

    public static SubLObject merge_suf_function_assertions_int(final SubLObject collection, final SubLObject function_assertions, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(FIVE_INTEGER)) {
            SubLObject cdolist_list_var = function_assertions;
            SubLObject assertion = NIL;
            assertion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                defn_note(FIVE_INTEGER, $str247$___add_sufficent_function__a__a_, collection, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                assertion = cdolist_list_var.first();
            } 
        }
        return set_suf_function_assertions(collection, suf_function_sort(list_utilities.hash_delete_duplicates(nconc(get_suf_function_assertions(collection, type), copy_list(function_assertions)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)), type);
    }

    public static SubLObject remove_suf_function_assertions_int(final SubLObject collection, final SubLObject function_assertions, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == function_genl_searchedP(collection)) {
            final SubLObject assertions = get_suf_function_assertions(collection, type);
            if (NIL != assertions) {
                SubLObject assertions_to_remove = NIL;
                SubLObject cdolist_list_var = function_assertions;
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((NIL == assertions_high.valid_assertion(assertion, UNPROVIDED)) || (NIL == genls.genlP(assertions_high.gaf_arg2(assertion), collection, UNPROVIDED, UNPROVIDED))) {
                        assertions_to_remove = cons(assertion, assertions_to_remove);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
                if (at_vars.$defn_trace_level$.getDynamicValue(thread).numGE(FOUR_INTEGER)) {
                    cdolist_list_var = assertions_to_remove;
                    assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        defn_note(FOUR_INTEGER, $str226$____a__a__a_, type == $ISA ? $str248$remove_sufficent_function : $str231$remove_sufficient_quoted_function, collection, assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                }
                final SubLObject new_value = suf_function_sort(nset_difference(assertions, assertions_to_remove, UNPROVIDED, UNPROVIDED));
                if (NIL != new_value) {
                    set_suf_function_assertions(collection, new_value, type);
                } else {
                    rem_suf_function_assertions(collection, type);
                }
                return new_value;
            }
        }
        return NIL;
    }

    public static SubLObject function_genl_searchedP(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject searchedP = NIL;
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_table$.bind(at_vars.$at_genls_space$.getDynamicValue(thread), thread);
            searchedP = sbhl_marking_methods.sbhl_recorded_node_p(fort, UNPROVIDED);
        } finally {
            sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_0, thread);
        }
        return searchedP;
    }

    public static SubLObject suf_function_sort(final SubLObject assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.$sort_suf_function_assertionsP$.getDynamicValue(thread)) {
            return assertions;
        }
        if (NIL == assertions) {
            return NIL;
        }
        if (NIL != list_utilities.singletonP(assertions)) {
            return assertions;
        }
        return Sort.sort(copy_list(assertions), symbol_function(SUF_FUNCTION_SORT_PRED), symbol_function(GAF_ARG2));
    }

    public static SubLObject suf_function_sort_pred(final SubLObject fort_1, final SubLObject fort_2) {
        final SubLObject card_1 = cardinality_estimates.spec_cardinality(fort_1);
        final SubLObject card_2 = cardinality_estimates.spec_cardinality(fort_2);
        if (card_1.numG(card_2)) {
            return T;
        }
        if (card_1.numE(card_2)) {
            return kb_utilities.term_L(fort_1, fort_2, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject clear_suf_functions() {
        defns.defns_cache_clrhash(suf_function_cache($ISA));
        return NIL;
    }

    public static SubLObject clear_suf_quoted_functions() {
        defns.defns_cache_clrhash(suf_function_cache($QUOTED_ISA));
        return NIL;
    }

    public static SubLObject reset_col_suf_functions(final SubLObject collection, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject function_preds = NIL;
        final SubLObject doneP = NIL;
        if (type.eql($ISA)) {
            function_preds = $list251;
        } else
            if (type.eql($QUOTED_ISA)) {
                function_preds = $list252;
            }

        SubLObject cdolist_list_var = function_preds;
        SubLObject function_pred = NIL;
        function_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                final SubLObject pred_var = function_pred;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$325 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$326 = $progress_last_pacification_time$.currentBinding(thread);
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
                        SubLObject done_var = doneP;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                note_progress();
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$327 = doneP;
                                    final SubLObject token_var_$328 = NIL;
                                    while (NIL == done_var_$327) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$328);
                                        final SubLObject valid_$329 = makeBoolean(!token_var_$328.eql(assertion));
                                        if (NIL != valid_$329) {
                                            final SubLObject function_collection = assertions_high.gaf_arg2(assertion);
                                            if (NIL != genls.genlP(function_collection, collection, UNPROVIDED, UNPROVIDED)) {
                                                cache_suf_function(collection, assertion, type);
                                            }
                                        }
                                        done_var_$327 = makeBoolean((NIL == valid_$329) || (NIL != doneP));
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$326 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$326, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                        } 
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_8, thread);
                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                        $progress_count$.rebind(_prev_bind_6, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$326, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$325, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            cdolist_list_var = cdolist_list_var.rest();
            function_pred = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject reset_all_suf_functions(final SubLObject type, SubLObject clearP, SubLObject traceP) {
        if (clearP == UNPROVIDED) {
            clearP = T;
        }
        if (traceP == UNPROVIDED) {
            traceP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_trace_level$.currentBinding(thread);
        try {
            at_vars.$at_trace_level$.bind(NIL != traceP ? FIVE_INTEGER : at_vars.$at_trace_level$.getDynamicValue(thread), thread);
            SubLObject function_preds = NIL;
            final SubLObject _prev_bind_0_$331 = at_vars.$sort_suf_function_assertionsP$.currentBinding(thread);
            try {
                at_vars.$sort_suf_function_assertionsP$.bind(NIL, thread);
                final SubLObject doneP = NIL;
                if (NIL != clearP) {
                    if (type.eql($ISA)) {
                        clear_suf_functions();
                        function_preds = $list251;
                    } else
                        if (type.eql($QUOTED_ISA)) {
                            clear_suf_quoted_functions();
                            function_preds = $list252;
                        }

                }
                SubLObject cdolist_list_var = function_preds;
                SubLObject function_pred = NIL;
                function_pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject _prev_bind_0_$332 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                        final SubLObject _prev_bind_0_$333 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$334 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                        try {
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                            final SubLObject pred_var = function_pred;
                            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                final SubLObject str = NIL;
                                final SubLObject _prev_bind_0_$334 = $progress_start_time$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$335 = $progress_last_pacification_time$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$337 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                                    SubLObject done_var = doneP;
                                    final SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                        if (NIL != valid) {
                                            note_progress();
                                            SubLObject final_index_iterator = NIL;
                                            try {
                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                SubLObject done_var_$338 = doneP;
                                                final SubLObject token_var_$339 = NIL;
                                                while (NIL == done_var_$338) {
                                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$339);
                                                    final SubLObject valid_$340 = makeBoolean(!token_var_$339.eql(assertion));
                                                    if (NIL != valid_$340) {
                                                        final SubLObject function_collection = assertions_high.gaf_arg2(assertion);
                                                        cache_suf_function(function_collection, assertion, type);
                                                    }
                                                    done_var_$338 = makeBoolean((NIL == valid_$340) || (NIL != doneP));
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$335 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values = getValuesAsVector();
                                                    if (NIL != final_index_iterator) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                    }
                                                    restoreValuesFromVector(_values);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$335, thread);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                    } 
                                    noting_progress_postamble();
                                } finally {
                                    $silent_progressP$.rebind(_prev_bind_8, thread);
                                    $is_noting_progressP$.rebind(_prev_bind_7, thread);
                                    $progress_count$.rebind(_prev_bind_6, thread);
                                    $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                    $progress_notification_count$.rebind(_prev_bind_4, thread);
                                    $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$337, thread);
                                    $progress_last_pacification_time$.rebind(_prev_bind_1_$335, thread);
                                    $progress_start_time$.rebind(_prev_bind_0_$334, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1_$334, thread);
                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$333, thread);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$332, thread);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    function_pred = cdolist_list_var.first();
                } 
            } finally {
                at_vars.$sort_suf_function_assertionsP$.rebind(_prev_bind_0_$331, thread);
            }
        } finally {
            at_vars.$at_trace_level$.rebind(_prev_bind_0, thread);
        }
        if (NIL != at_vars.$sort_suf_function_assertionsP$.getDynamicValue(thread)) {
            final SubLObject cdohash_table = suf_function_cache(type);
            SubLObject fort = NIL;
            SubLObject suf_function_assertions = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    fort = getEntryKey(cdohash_entry);
                    suf_function_assertions = getEntryValue(cdohash_entry);
                    set_suf_function_assertions(fort, suf_function_sort(suf_function_assertions), type);
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        }
        return defns.defns_cache_hash_table_count(suf_function_cache(type));
    }

    public static SubLObject initialize_sufficient_functions_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = $str253$Initializing_sufficient_functions;
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
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
            reset_all_suf_functions($ISA, T, UNPROVIDED);
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject initialize_sufficient_quoted_functions_cache() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str = $str254$Initializing_sufficient_quoted_fu;
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
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
            reset_all_suf_functions($QUOTED_ISA, T, UNPROVIDED);
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sufficient_function_cache_mal_assertions(SubLObject v_cache) {
        if (v_cache == UNPROVIDED) {
            v_cache = defns.$suf_function_cache_index$.getGlobalValue();
        }
        SubLObject result = NIL;
        if (NIL != defns.defns_cache_index_p(v_cache)) {
            final SubLObject cdohash_table = defns.get_defn_cache_from_index(v_cache);
            SubLObject key = NIL;
            SubLObject value = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    SubLObject cdolist_list_var;
                    value = cdolist_list_var = getEntryValue(cdohash_entry);
                    SubLObject assertion = NIL;
                    assertion = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL == assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                            final SubLObject item_var = assertion;
                            if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result = cons(item_var, result);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        assertion = cdolist_list_var.first();
                    } 
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        } else {
            SubLObject key2 = NIL;
            SubLObject value2 = NIL;
            final Iterator cdohash_iterator2 = getEntrySetIterator(v_cache);
            try {
                while (iteratorHasNext(cdohash_iterator2)) {
                    final Map.Entry cdohash_entry2 = iteratorNextEntry(cdohash_iterator2);
                    key2 = getEntryKey(cdohash_entry2);
                    SubLObject cdolist_list_var2;
                    value2 = cdolist_list_var2 = getEntryValue(cdohash_entry2);
                    SubLObject assertion2 = NIL;
                    assertion2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (NIL == assertions_high.valid_assertion(assertion2, UNPROVIDED)) {
                            final SubLObject item_var2 = assertion2;
                            if (NIL == member(item_var2, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                result = cons(item_var2, result);
                            }
                        }
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        assertion2 = cdolist_list_var2.first();
                    } 
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator2);
            }
        }
        return result;
    }

    public static SubLObject sufficient_function_cache_mal_assertions_coerce(SubLObject v_cache) {
        if (v_cache == UNPROVIDED) {
            v_cache = defns.$suf_function_cache_index$.getGlobalValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != defns.defns_cache_index_p(v_cache)) {
            final SubLObject table_var = defns.get_defn_cache_from_index(v_cache);
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$cdohash, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            print(key, UNPROVIDED);
                            fi.fi_kill_int(key);
                            final SubLObject mal_assertions = sufficient_function_cache_mal_assertions(UNPROVIDED);
                            if (NIL != mal_assertions) {
                                print(mal_assertions, UNPROVIDED);
                                Errors.sublisp_break($$$stop, EMPTY_SUBL_OBJECT_ARRAY);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$342 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$342, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject table_var = v_cache;
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$cdohash, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject key = NIL;
                    SubLObject value = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            key = getEntryKey(cdohash_entry);
                            value = getEntryValue(cdohash_entry);
                            print(key, UNPROVIDED);
                            fi.fi_kill_int(key);
                            final SubLObject mal_assertions = sufficient_function_cache_mal_assertions(UNPROVIDED);
                            if (NIL != mal_assertions) {
                                print(mal_assertions, UNPROVIDED);
                                Errors.sublisp_break($$$stop, EMPTY_SUBL_OBJECT_ARRAY);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$343 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$343, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_2, thread);
                $progress_note$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject assertion_referenced_in_sufficient_function_cacheP(final SubLObject assertion, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        SubLObject catch_var = NIL;
        try {
            thread.throwStack.push($MAPPING_DONE);
            final SubLObject cdohash_table = suf_function_cache(type);
            SubLObject key = NIL;
            SubLObject value = NIL;
            final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
            try {
                while (iteratorHasNext(cdohash_iterator)) {
                    final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                    key = getEntryKey(cdohash_entry);
                    value = getEntryValue(cdohash_entry);
                    if (NIL != subl_promotions.memberP(assertion, value, symbol_function(KBEQ), UNPROVIDED)) {
                        v_answer = T;
                        mapping_finished();
                    }
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator);
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
        } finally {
            thread.throwStack.pop();
        }
        return v_answer;
    }

    public static SubLObject diagnose_sufficient_functions_cache(final SubLObject type, SubLObject statusP, SubLObject stream) {
        if (statusP == UNPROVIDED) {
            statusP = NIL;
        }
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $suf_function_cache_mal_keys$.setDynamicValue(NIL, thread);
        $suf_function_cache_key_wXo_value$.setDynamicValue(NIL, thread);
        $suf_function_cache_key_wXmal_value$.setDynamicValue(NIL, thread);
        $suf_function_cache_key_wXstale_value$.setDynamicValue(NIL, thread);
        $suf_function_cache_keys_wXo_inerited_value$.setDynamicValue(NIL, thread);
        $suf_function_cache_awol_direct_assertions$.setDynamicValue(NIL, thread);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = (type == $ISA) ? $list251 : $list252;
            SubLObject function_pred = NIL;
            function_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject doneP = NIL;
                final SubLObject _prev_bind_0_$344 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_1_$345 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject pred_var = function_pred;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$345 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$346 = $progress_last_pacification_time$.currentBinding(thread);
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
                            SubLObject done_var = doneP;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                        SubLObject done_var_$348 = doneP;
                                        final SubLObject token_var_$349 = NIL;
                                        while (NIL == done_var_$348) {
                                            final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$349);
                                            final SubLObject valid_$350 = makeBoolean(!token_var_$349.eql(assertion));
                                            if (NIL != valid_$350) {
                                                final SubLObject function_collection = assertions_high.gaf_arg2(assertion);
                                                if (NIL == suf_function_assertionP(function_collection, assertion, type)) {
                                                    $suf_function_cache_awol_direct_assertions$.setDynamicValue(cons(assertion, $suf_function_cache_awol_direct_assertions$.getDynamicValue(thread)), thread);
                                                }
                                            }
                                            done_var_$348 = makeBoolean((NIL == valid_$350) || (NIL != doneP));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$346 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$346, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$346, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$345, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1_$345, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$344, thread);
                }
                cdolist_list_var = cdolist_list_var.rest();
                function_pred = cdolist_list_var.first();
            } 
            final SubLObject table_var = suf_function_cache(type);
            final SubLObject _prev_bind_0_$347 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$347 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_10 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_11 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_12 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_13 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_14 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str258$diagnostics__sufficient_functions, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject fort = NIL;
                    SubLObject assertions = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            fort = getEntryKey(cdohash_entry);
                            assertions = getEntryValue(cdohash_entry);
                            final SubLObject _prev_bind_0_$348 = $progress_total$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$348 = $progress_sofar$.currentBinding(thread);
                            try {
                                $progress_total$.bind(NIL, thread);
                                $progress_sofar$.bind(NIL, thread);
                                if (NIL == forts.valid_fortP(fort)) {
                                    $suf_function_cache_mal_keys$.setDynamicValue(cons(fort, $suf_function_cache_mal_keys$.getDynamicValue(thread)), thread);
                                }
                                if (NIL == assertions) {
                                    $suf_function_cache_key_wXo_value$.setDynamicValue(cons(fort, $suf_function_cache_key_wXo_value$.getDynamicValue(thread)), thread);
                                }
                                SubLObject mal_assertionP = NIL;
                                if (NIL == mal_assertionP) {
                                    SubLObject csome_list_var;
                                    SubLObject assertion2;
                                    for (csome_list_var = assertions, assertion2 = NIL, assertion2 = csome_list_var.first(); (NIL == mal_assertionP) && (NIL != csome_list_var); mal_assertionP = makeBoolean(NIL == assertions_high.valid_assertion(assertion2, UNPROVIDED)) , csome_list_var = csome_list_var.rest() , assertion2 = csome_list_var.first()) {
                                    }
                                }
                                if (NIL != mal_assertionP) {
                                    $suf_function_cache_key_wXmal_value$.setDynamicValue(cons(fort, $suf_function_cache_key_wXmal_value$.getDynamicValue(thread)), thread);
                                }
                                mal_assertionP = NIL;
                                if (NIL == mal_assertionP) {
                                    SubLObject csome_list_var = assertions;
                                    SubLObject assertion2 = NIL;
                                    assertion2 = csome_list_var.first();
                                    while ((NIL == mal_assertionP) && (NIL != csome_list_var)) {
                                        final SubLObject function_collection2 = assertions_high.gaf_arg2(assertion2);
                                        mal_assertionP = makeBoolean(NIL == genls.genlP(function_collection2, fort, UNPROVIDED, UNPROVIDED));
                                        csome_list_var = csome_list_var.rest();
                                        assertion2 = csome_list_var.first();
                                    } 
                                }
                                if (NIL != mal_assertionP) {
                                    $suf_function_cache_key_wXstale_value$.setDynamicValue(cons(fort, $suf_function_cache_key_wXstale_value$.getDynamicValue(thread)), thread);
                                }
                                if (NIL != assertions) {
                                    SubLObject cdolist_list_var2 = genls.all_genls(fort, UNPROVIDED, UNPROVIDED);
                                    SubLObject genl = NIL;
                                    genl = cdolist_list_var2.first();
                                    while (NIL != cdolist_list_var2) {
                                        if (NIL != set_difference(assertions, get_suf_function_assertions(genl, type), UNPROVIDED, UNPROVIDED)) {
                                            final SubLObject item_var = genl;
                                            if (NIL == member(item_var, $suf_function_cache_keys_wXo_inerited_value$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                                $suf_function_cache_keys_wXo_inerited_value$.setDynamicValue(cons(item_var, $suf_function_cache_keys_wXo_inerited_value$.getDynamicValue(thread)), thread);
                                            }
                                        }
                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                        genl = cdolist_list_var2.first();
                                    } 
                                }
                            } finally {
                                $progress_sofar$.rebind(_prev_bind_1_$348, thread);
                                $progress_total$.rebind(_prev_bind_0_$348, thread);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$349 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$349, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_14, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_13, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_12, thread);
                $last_percent_progress_index$.rebind(_prev_bind_11, thread);
                $progress_sofar$.rebind(_prev_bind_10, thread);
                $progress_total$.rebind(_prev_bind_9, thread);
                $progress_start_time$.rebind(_prev_bind_1_$347, thread);
                $progress_note$.rebind(_prev_bind_0_$347, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != statusP) {
            kbi_sfc_status(stream);
        }
        return T;
    }

    public static SubLObject kbi_sfc_status(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(stream, $str259$___suf_function_cache_mal_keys___, length($suf_function_cache_mal_keys$.getDynamicValue(thread)));
        format(stream, $str260$___suf_function_cache_key_w_o_val, length($suf_function_cache_key_wXo_value$.getDynamicValue(thread)));
        format(stream, $str261$___suf_function_cache_key_w_mal_v, length($suf_function_cache_key_wXmal_value$.getDynamicValue(thread)));
        format(stream, $str262$___suf_function_cache_key_w_stale, length($suf_function_cache_key_wXstale_value$.getDynamicValue(thread)));
        format(stream, $str263$___suf_function_cache_keys_w_o_in, length($suf_function_cache_keys_wXo_inerited_value$.getDynamicValue(thread)));
        format(stream, $str264$___suf_function_cache_awol_direct, length($suf_function_cache_awol_direct_assertions$.getDynamicValue(thread)));
        return T;
    }

    public static SubLObject sfc_cleanup(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject collection = NIL;
        SubLObject v_skolems = NIL;
        SubLObject n = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            terpri(UNPROVIDED);
            final SubLObject list_var;
            v_skolems = list_var = isa.all_fort_instances($$SkolemFunction, UNPROVIDED, UNPROVIDED);
            final SubLObject _prev_bind_0_$357 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_1_$358 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$mapping_skolems, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(length(list_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject csome_list_var = list_var;
                    SubLObject skolem = NIL;
                    skolem = csome_list_var.first();
                    while (NIL != csome_list_var) {
                        final SubLObject cols = sufficient_function_of(skolem, type, UNPROVIDED);
                        fi.fi_kill_int(skolem);
                        n = add(n, ONE_INTEGER);
                        SubLObject cdolist_list_var = cols;
                        SubLObject col = NIL;
                        col = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            collection = col;
                            SubLObject cdolist_list_var_$359 = suf_function_assertions(col, type);
                            SubLObject assertion = NIL;
                            assertion = cdolist_list_var_$359.first();
                            while (NIL != cdolist_list_var_$359) {
                                if (NIL == assertions_high.valid_assertion(assertion, T)) {
                                    print(assertion, UNPROVIDED);
                                    print(list(skolem, collection), UNPROVIDED);
                                    Errors.sublisp_break($$$stop, EMPTY_SUBL_OBJECT_ARRAY);
                                }
                                cdolist_list_var_$359 = cdolist_list_var_$359.rest();
                                assertion = cdolist_list_var_$359.first();
                            } 
                            any_sufficient_non_reified_functionP(col, type, UNPROVIDED);
                            cdolist_list_var = cdolist_list_var.rest();
                            col = cdolist_list_var.first();
                        } 
                        format(T, $str268$_a_, n);
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        csome_list_var = csome_list_var.rest();
                        skolem = csome_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$358 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$358, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                $progress_sofar$.rebind(_prev_bind_4, thread);
                $progress_total$.rebind(_prev_bind_3, thread);
                $progress_start_time$.rebind(_prev_bind_1_$358, thread);
                $progress_note$.rebind(_prev_bind_0_$357, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject sfc_mal_assertions(final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table_var = suf_function_cache(type);
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str258$diagnostics__sufficient_functions, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(hash_table_count(table_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject fort = NIL;
                SubLObject assertions = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        fort = getEntryKey(cdohash_entry);
                        SubLObject cdolist_list_var;
                        assertions = cdolist_list_var = getEntryValue(cdohash_entry);
                        SubLObject assertion = NIL;
                        assertion = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL == assertions_high.valid_assertion(assertion, T)) {
                                print(assertion, UNPROVIDED);
                                print(fort, UNPROVIDED);
                                Errors.sublisp_break($$$stop, EMPTY_SUBL_OBJECT_ARRAY);
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            assertion = cdolist_list_var.first();
                        } 
                        $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                        note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            } finally {
                final SubLObject _prev_bind_0_$361 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$361, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject declare_at_defns_file() {
        declareFunction(me, "suf_defn_cache_as_alist", "SUF-DEFN-CACHE-AS-ALIST", 0, 0, false);
        declareFunction(me, "suf_defn_cache_get", "SUF-DEFN-CACHE-GET", 1, 0, false);
        declareFunction(me, "suf_defn_cache_add", "SUF-DEFN-CACHE-ADD", 2, 0, false);
        declareFunction(me, "suf_defn_cache_rem", "SUF-DEFN-CACHE-REM", 2, 0, false);
        declareFunction(me, "suf_defn_cache_merge", "SUF-DEFN-CACHE-MERGE", 2, 0, false);
        declareFunction(me, "remove_suf_defn_assertions", "REMOVE-SUF-DEFN-ASSERTIONS", 1, 1, false);
        declareFunction(me, "clear_suf_defns", "CLEAR-SUF-DEFNS", 0, 0, false);
        declareFunction(me, "sort_suf_defn_cache", "SORT-SUF-DEFN-CACHE", 0, 0, false);
        declareFunction(me, "suf_quoted_defn_cache_as_alist", "SUF-QUOTED-DEFN-CACHE-AS-ALIST", 0, 0, false);
        declareFunction(me, "suf_quoted_defn_cache_get", "SUF-QUOTED-DEFN-CACHE-GET", 1, 0, false);
        declareFunction(me, "suf_quoted_defn_cache_add", "SUF-QUOTED-DEFN-CACHE-ADD", 2, 0, false);
        declareFunction(me, "suf_quoted_defn_cache_rem", "SUF-QUOTED-DEFN-CACHE-REM", 2, 0, false);
        declareFunction(me, "suf_quoted_defn_cache_merge", "SUF-QUOTED-DEFN-CACHE-MERGE", 2, 0, false);
        declareFunction(me, "remove_suf_quoted_defn_assertions", "REMOVE-SUF-QUOTED-DEFN-ASSERTIONS", 1, 1, false);
        declareFunction(me, "clear_suf_quoted_defns", "CLEAR-SUF-QUOTED-DEFNS", 0, 0, false);
        declareFunction(me, "sort_suf_quoted_defn_cache", "SORT-SUF-QUOTED-DEFN-CACHE", 0, 0, false);
        declareFunction(me, "at_defns_admitP", "AT-DEFNS-ADMIT?", 1, 0, false);
        declareFunction(me, "at_defns_rejectP", "AT-DEFNS-REJECT?", 1, 0, false);
        declareFunction(me, "defns_admitP", "DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "reset_old_defns_admitP_meters", "RESET-OLD-DEFNS-ADMIT?-METERS", 0, 0, false);
        declareFunction(me, "old_defns_admitP_metered", "OLD-DEFNS-ADMIT?-METERED", 2, 1, false);
        declareFunction(me, "old_defns_admitP", "OLD-DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "defns_rejectP", "DEFNS-REJECT?", 2, 1, false);
        declareFunction(me, "reset_old_defns_rejectP_meters", "RESET-OLD-DEFNS-REJECT?-METERS", 0, 0, false);
        declareFunction(me, "old_defns_rejectP_metered", "OLD-DEFNS-REJECT?-METERED", 2, 1, false);
        declareFunction(me, "old_defns_rejectP", "OLD-DEFNS-REJECT?", 2, 1, false);
        declareFunction(me, "defining_defns_admitP", "DEFINING-DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "defining_defns_rejectP", "DEFINING-DEFNS-REJECT?", 2, 1, false);
        declareFunction(me, "reset_defining_defns_status_meters", "RESET-DEFINING-DEFNS-STATUS-METERS", 0, 0, false);
        declareFunction(me, "defining_defns_status_metered", "DEFINING-DEFNS-STATUS-METERED", 2, 1, false);
        declareFunction(me, "defining_defns_status", "DEFINING-DEFNS-STATUS", 2, 1, false);
        declareFunction(me, "defining_defn_violation_data", "DEFINING-DEFN-VIOLATION-DATA", 4, 1, false);
        declareFunction(me, "reset_sufficient_defns_admitP_meters", "RESET-SUFFICIENT-DEFNS-ADMIT?-METERS", 0, 0, false);
        declareFunction(me, "sufficient_defns_admitP_metered", "SUFFICIENT-DEFNS-ADMIT?-METERED", 2, 1, false);
        declareFunction(me, "sufficient_defns_admitP", "SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "sufficient_defns_admit_int", "SUFFICIENT-DEFNS-ADMIT-INT", 3, 2, false);
        declareFunction(me, "why_sufficient_defns_admitP", "WHY-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "sufficient_defn_violation_data", "SUFFICIENT-DEFN-VIOLATION-DATA", 4, 1, false);
        declareFunction(me, "necessary_defns_permitP", "NECESSARY-DEFNS-PERMIT?", 2, 1, false);
        declareFunction(me, "reset_necessary_defns_rejectP_meters", "RESET-NECESSARY-DEFNS-REJECT?-METERS", 0, 0, false);
        declareFunction(me, "necessary_defns_rejectP_metered", "NECESSARY-DEFNS-REJECT?-METERED", 2, 1, false);
        declareFunction(me, "necessary_defns_rejectP", "NECESSARY-DEFNS-REJECT?", 2, 1, false);
        declareFunction(me, "necessary_defns_rejectP_int", "NECESSARY-DEFNS-REJECT?-INT", 5, 1, false);
        declareFunction(me, "denotational_term_admitted_by_defn_via_isaP", "DENOTATIONAL-TERM-ADMITTED-BY-DEFN-VIA-ISA?", 2, 1, false);
        declareFunction(me, "reset_rejected_by_necessary_defns_meters", "RESET-REJECTED-BY-NECESSARY-DEFNS-METERS", 0, 0, false);
        declareFunction(me, "rejected_by_necessary_defns_metered", "REJECTED-BY-NECESSARY-DEFNS-METERED", 2, 1, false);
        declareFunction(me, "rejected_by_necessary_defns", "REJECTED-BY-NECESSARY-DEFNS", 2, 1, false);
        declareFunction(me, "why_defns_rejectP", "WHY-DEFNS-REJECT?", 2, 1, false);
        declareFunction(me, "necessary_defn_violation_data", "NECESSARY-DEFN-VIOLATION-DATA", 5, 1, false);
        declareFunction(me, "at_quoted_defns_admitP", "AT-QUOTED-DEFNS-ADMIT?", 1, 0, false);
        declareFunction(me, "at_quoted_defns_rejectP", "AT-QUOTED-DEFNS-REJECT?", 1, 0, false);
        declareFunction(me, "quoted_defns_admitP", "QUOTED-DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "reset_old_quoted_defns_admitP_meters", "RESET-OLD-QUOTED-DEFNS-ADMIT?-METERS", 0, 0, false);
        declareFunction(me, "old_quoted_defns_admitP_metered", "OLD-QUOTED-DEFNS-ADMIT?-METERED", 2, 1, false);
        declareFunction(me, "old_quoted_defns_admitP", "OLD-QUOTED-DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "quoted_defns_rejectP", "QUOTED-DEFNS-REJECT?", 2, 1, false);
        declareFunction(me, "reset_old_quoted_defns_rejectP_meters", "RESET-OLD-QUOTED-DEFNS-REJECT?-METERS", 0, 0, false);
        declareFunction(me, "old_quoted_defns_rejectP_metered", "OLD-QUOTED-DEFNS-REJECT?-METERED", 2, 1, false);
        declareFunction(me, "old_quoted_defns_rejectP", "OLD-QUOTED-DEFNS-REJECT?", 2, 1, false);
        declareFunction(me, "reset_quoted_defining_defns_status_meters", "RESET-QUOTED-DEFINING-DEFNS-STATUS-METERS", 0, 0, false);
        declareFunction(me, "quoted_defining_defns_status_metered", "QUOTED-DEFINING-DEFNS-STATUS-METERED", 2, 1, false);
        declareFunction(me, "quoted_defining_defns_status", "QUOTED-DEFINING-DEFNS-STATUS", 2, 1, false);
        declareFunction(me, "reset_quoted_sufficient_defns_admitP_meters", "RESET-QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS", 0, 0, false);
        declareFunction(me, "quoted_sufficient_defns_admitP_metered", "QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERED", 2, 1, false);
        declareFunction(me, "quoted_sufficient_defns_admitP", "QUOTED-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "quoted_necessary_defns_permitP", "QUOTED-NECESSARY-DEFNS-PERMIT?", 2, 1, false);
        declareFunction(me, "reset_quoted_necessary_defns_rejectP_meters", "RESET-QUOTED-NECESSARY-DEFNS-REJECT?-METERS", 0, 0, false);
        declareFunction(me, "quoted_necessary_defns_rejectP_metered", "QUOTED-NECESSARY-DEFNS-REJECT?-METERED", 2, 1, false);
        declareFunction(me, "quoted_necessary_defns_rejectP", "QUOTED-NECESSARY-DEFNS-REJECT?", 2, 1, false);
        declareFunction(me, "denotational_term_admitted_by_quoted_defn_via_quoted_isaP", "DENOTATIONAL-TERM-ADMITTED-BY-QUOTED-DEFN-VIA-QUOTED-ISA?", 2, 1, false);
        declareFunction(me, "reset_rejected_by_quoted_necessary_defns_meters", "RESET-REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS", 0, 0, false);
        declareFunction(me, "rejected_by_quoted_necessary_defns_metered", "REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERED", 2, 1, false);
        declareFunction(me, "rejected_by_quoted_necessary_defns", "REJECTED-BY-QUOTED-NECESSARY-DEFNS", 2, 1, false);
        declareFunction(me, "why_quoted_defns_rejectP", "WHY-QUOTED-DEFNS-REJECT?", 2, 1, false);
        declareFunction(me, "new_defn_stack", "NEW-DEFN-STACK", 0, 0, false);
        declareFunction(me, "defn_stack_push", "DEFN-STACK-PUSH", 2, 0, false);
        declareFunction(me, "defn_stack_pop", "DEFN-STACK-POP", 2, 0, false);
        declareFunction(me, "recursive_defn_callP", "RECURSIVE-DEFN-CALL?", 2, 0, false);
        declareFunction(me, "get_defn_col_history", "GET-DEFN-COL-HISTORY", 1, 0, false);
        declareFunction(me, "set_defn_col_history", "SET-DEFN-COL-HISTORY", 2, 0, false);
        declareFunction(me, "get_defn_fn_history", "GET-DEFN-FN-HISTORY", 1, 0, false);
        declareFunction(me, "set_defn_fn_history", "SET-DEFN-FN-HISTORY", 2, 0, false);
        declareFunction(me, "get_quoted_defn_fn_history", "GET-QUOTED-DEFN-FN-HISTORY", 1, 0, false);
        declareFunction(me, "set_quoted_defn_fn_history", "SET-QUOTED-DEFN-FN-HISTORY", 2, 0, false);
        declareFunction(me, "get_quoted_defn_col_history", "GET-QUOTED-DEFN-COL-HISTORY", 1, 0, false);
        declareFunction(me, "set_quoted_defn_col_history", "SET-QUOTED-DEFN-COL-HISTORY", 2, 0, false);
        declareFunction(me, "quiet_defns_admitP", "QUIET-DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "quiet_sufficient_defns_admitP", "QUIET-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "quiet_defns_rejectP", "QUIET-DEFNS-REJECT?", 2, 1, false);
        declareFunction(me, "quiet_defn_admitsP", "QUIET-DEFN-ADMITS?", 3, 1, false);
        declareFunction(me, "defn_admitsP", "DEFN-ADMITS?", 3, 1, false);
        declareFunction(me, "collection_specific_defnP", "COLLECTION-SPECIFIC-DEFN?", 1, 0, false);
        declareFunction(me, "defn_history", "DEFN-HISTORY", 1, 0, false);
        declareFunction(me, "reset_defn_admits_intP_meters", "RESET-DEFN-ADMITS-INT?-METERS", 0, 0, false);
        declareFunction(me, "defn_admits_intP_metered", "DEFN-ADMITS-INT?-METERED", 3, 0, false);
        declareFunction(me, "defn_admits_intP", "DEFN-ADMITS-INT?", 3, 0, false);
        declareFunction(me, "quiet_quoted_defns_admitP", "QUIET-QUOTED-DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "quiet_quoted_sufficient_defns_admitP", "QUIET-QUOTED-SUFFICIENT-DEFNS-ADMIT?", 2, 1, false);
        declareFunction(me, "quiet_quoted_defns_rejectP", "QUIET-QUOTED-DEFNS-REJECT?", 2, 1, false);
        declareFunction(me, "quiet_quoted_defn_admitsP", "QUIET-QUOTED-DEFN-ADMITS?", 3, 1, false);
        declareFunction(me, "quoted_defn_admitsP", "QUOTED-DEFN-ADMITS?", 3, 1, false);
        declareFunction(me, "quoted_defn_history", "QUOTED-DEFN-HISTORY", 1, 0, false);
        declareFunction(me, "reset_quoted_defn_admits_intP_meters", "RESET-QUOTED-DEFN-ADMITS-INT?-METERS", 0, 0, false);
        declareFunction(me, "quoted_defn_admits_intP_metered", "QUOTED-DEFN-ADMITS-INT?-METERED", 3, 0, false);
        declareFunction(me, "quoted_defn_admits_intP", "QUOTED-DEFN-ADMITS-INT?", 3, 0, false);
        declareFunction(me, "clear_defn_cyc_evaluate", "CLEAR-DEFN-CYC-EVALUATE", 0, 0, false);
        declareFunction(me, "remove_defn_cyc_evaluate", "REMOVE-DEFN-CYC-EVALUATE", 1, 0, false);
        declareFunction(me, "defn_cyc_evaluate_internal", "DEFN-CYC-EVALUATE-INTERNAL", 1, 0, false);
        declareFunction(me, "defn_cyc_evaluate", "DEFN-CYC-EVALUATE", 1, 0, false);
        declareFunction(me, "valid_defnP", "VALID-DEFN?", 1, 1, false);
        declareFunction(me, "viable_defnP", "VIABLE-DEFN?", 1, 1, false);
        declareFunction(me, "defn_funcall", "DEFN-FUNCALL", 2, 0, false);
        declareFunction(me, "at_denotational_term_p", "AT-DENOTATIONAL-TERM-P", 1, 1, false);
        declareFunction(me, "clear_defn_space", "CLEAR-DEFN-SPACE", 0, 0, false);
        declareFunction(me, "map_sufficient_defn_cols", "MAP-SUFFICIENT-DEFN-COLS", 1, 0, false);
        declareFunction(me, "has_typeP", "HAS-TYPE?", 2, 1, false);
        declareFunction(me, "quiet_has_typeP", "QUIET-HAS-TYPE?", 2, 1, false);
        declareFunction(me, "quiet_has_any_typeP", "QUIET-HAS-ANY-TYPE?", 2, 1, false);
        declareFunction(me, "quiet_has_type_among", "QUIET-HAS-TYPE-AMONG", 2, 1, false);
        declareFunction(me, "quiet_has_type_memoizedP_internal", "QUIET-HAS-TYPE-MEMOIZED?-INTERNAL", 2, 2, false);
        declareFunction(me, "quiet_has_type_memoizedP", "QUIET-HAS-TYPE-MEMOIZED?", 2, 2, false);
        declareFunction(me, "not_has_type_by_extent_knownP", "NOT-HAS-TYPE-BY-EXTENT-KNOWN?", 2, 1, false);
        declareFunction(me, "not_has_typeP", "NOT-HAS-TYPE?", 2, 1, false);
        declareFunction(me, "quiet_not_has_typeP", "QUIET-NOT-HAS-TYPE?", 2, 1, false);
        declareFunction(me, "quick_quiet_has_typeP", "QUICK-QUIET-HAS-TYPE?", 2, 1, false);
        declareFunction(me, "quick_quiet_has_typeP_fort", "QUICK-QUIET-HAS-TYPE?-FORT", 3, 0, false);
        declareFunction(me, "quick_quiet_has_typeP_naut", "QUICK-QUIET-HAS-TYPE?-NAUT", 3, 0, false);
        declareFunction(me, "quick_quiet_has_typeP_collection_union", "QUICK-QUIET-HAS-TYPE?-COLLECTION-UNION", 3, 0, false);
        declareFunction(me, "quick_quiet_has_typeP_collection_intersection", "QUICK-QUIET-HAS-TYPE?-COLLECTION-INTERSECTION", 3, 0, false);
        declareFunction(me, "max_mts_of_admitting_defns", "MAX-MTS-OF-ADMITTING-DEFNS", 2, 0, false);
        declareFunction(me, "mts_of_admitting_sufficient_defns", "MTS-OF-ADMITTING-SUFFICIENT-DEFNS", 2, 0, false);
        declareFunction(me, "old_mts_of_admitting_sufficient_defns", "OLD-MTS-OF-ADMITTING-SUFFICIENT-DEFNS", 2, 0, false);
        declareFunction(me, "max_mts_of_admitting_quoted_defns", "MAX-MTS-OF-ADMITTING-QUOTED-DEFNS", 2, 0, false);
        declareFunction(me, "mts_of_admitting_sufficient_quoted_defns", "MTS-OF-ADMITTING-SUFFICIENT-QUOTED-DEFNS", 2, 0, false);
        declareFunction(me, "isa_via_defnsP", "ISA-VIA-DEFNS?", 2, 1, false);
        declareFunction(me, "hl_justify_isa_via_defns", "HL-JUSTIFY-ISA-VIA-DEFNS", 2, 1, false);
        declareFunction(me, "old_hl_justify_isa_via_defns", "OLD-HL-JUSTIFY-ISA-VIA-DEFNS", 2, 1, false);
        declareFunction(me, "not_isa_via_defnsP", "NOT-ISA-VIA-DEFNS?", 2, 1, false);
        declareFunction(me, "why_not_isa_via_defnsP", "WHY-NOT-ISA-VIA-DEFNS?", 2, 1, false);
        declareFunction(me, "hl_justify_not_isa_via_defns", "HL-JUSTIFY-NOT-ISA-VIA-DEFNS", 2, 1, false);
        declareFunction(me, "hl_justify_not_quoted_isa_via_defns", "HL-JUSTIFY-NOT-QUOTED-ISA-VIA-DEFNS", 2, 1, false);
        declareFunction(me, "collection_rejects_via_disjoint_defnsP", "COLLECTION-REJECTS-VIA-DISJOINT-DEFNS?", 2, 1, false);
        declareFunction(me, "why_collection_rejects_via_disjoint_defnsP", "WHY-COLLECTION-REJECTS-VIA-DISJOINT-DEFNS?", 2, 1, false);
        declareFunction(me, "collections_admitting_term_via_defns", "COLLECTIONS-ADMITTING-TERM-VIA-DEFNS", 1, 0, false);
        declareFunction(me, "min_max_collections_admitting_term_via_defns", "MIN-MAX-COLLECTIONS-ADMITTING-TERM-VIA-DEFNS", 1, 1, false);
        declareFunction(me, "collections_admitting_term_via_defns_1", "COLLECTIONS-ADMITTING-TERM-VIA-DEFNS-1", 1, 0, false);
        declareFunction(me, "gather_collections_admitting_via_defns", "GATHER-COLLECTIONS-ADMITTING-VIA-DEFNS", 1, 0, false);
        declareFunction(me, "defn_note", "DEFN-NOTE", 2, 6, false);
        declareFunction(me, "defn_error", "DEFN-ERROR", 2, 5, false);
        declareFunction(me, "defn_cerror", "DEFN-CERROR", 3, 5, false);
        declareFunction(me, "defn_warn", "DEFN-WARN", 2, 5, false);
        declareFunction(me, "reset_defn_meters", "RESET-DEFN-METERS", 0, 0, false);
        declareFunction(me, "report_defn_meters", "REPORT-DEFN-METERS", 0, 1, false);
        declareFunction(me, "summarize_defn_meters", "SUMMARIZE-DEFN-METERS", 0, 1, false);
        declareFunction(me, "summarize_defn_meter_cache_header", "SUMMARIZE-DEFN-METER-CACHE-HEADER", 0, 2, false);
        declareFunction(me, "summarize_defn_meter_cache", "SUMMARIZE-DEFN-METER-CACHE", 1, 2, false);
        declareFunction(me, "summarize_defn_meter_cache_trailer", "SUMMARIZE-DEFN-METER-CACHE-TRAILER", 0, 2, false);
        declareFunction(me, "report_defn_meter_cache", "REPORT-DEFN-METER-CACHE", 1, 1, false);
        declareFunction(me, "report_defn_meter_cache_header", "REPORT-DEFN-METER-CACHE-HEADER", 1, 2, false);
        declareFunction(me, "report_defn_meter_cache_trailer", "REPORT-DEFN-METER-CACHE-TRAILER", 1, 2, false);
        declareFunction(me, "report_defn_meter_cache_call", "REPORT-DEFN-METER-CACHE-CALL", 2, 2, false);
        declareFunction(me, "report_defn_meter_cache_total", "REPORT-DEFN-METER-CACHE-TOTAL", 1, 2, false);
        declareFunction(me, "function_col_width", "FUNCTION-COL-WIDTH", 1, 0, false);
        declareFunction(me, "meter_col_widths", "METER-COL-WIDTHS", 1, 0, false);
        declareFunction(me, "suf_defn_assertions", "SUF-DEFN-ASSERTIONS", 1, 0, false);
        declareFunction(me, "suf_defnP", "SUF-DEFN?", 2, 0, false);
        declareFunction(me, "old_suf_defnP", "OLD-SUF-DEFN?", 2, 0, false);
        declareFunction(me, "any_sufficient_defn_anywhereP", "ANY-SUFFICIENT-DEFN-ANYWHERE?", 1, 0, false);
        declareFunction(me, "old_any_sufficient_defn_anywhereP", "OLD-ANY-SUFFICIENT-DEFN-ANYWHERE?", 1, 0, false);
        declareFunction(me, "suf_defn_assertionP", "SUF-DEFN-ASSERTION?", 2, 0, false);
        declareFunction(me, "add_suf_defn", "ADD-SUF-DEFN", 2, 0, false);
        declareFunction(me, "add_iff_defn", "ADD-IFF-DEFN", 2, 0, false);
        declareFunction(me, "old_add_suf_defn", "OLD-ADD-SUF-DEFN", 2, 0, false);
        declareFunction(me, "remove_suf_defn", "REMOVE-SUF-DEFN", 2, 0, false);
        declareFunction(me, "remove_iff_defn", "REMOVE-IFF-DEFN", 2, 0, false);
        declareFunction(me, "old_remove_suf_defn", "OLD-REMOVE-SUF-DEFN", 2, 0, false);
        declareFunction(me, "reset_cache_suf_defn_meters", "RESET-CACHE-SUF-DEFN-METERS", 0, 0, false);
        declareFunction(me, "cache_suf_defn_metered", "CACHE-SUF-DEFN-METERED", 2, 0, false);
        declareFunction(me, "cache_suf_defn", "CACHE-SUF-DEFN", 2, 0, false);
        declareFunction(me, "reset_uncache_suf_defn_meters", "RESET-UNCACHE-SUF-DEFN-METERS", 0, 0, false);
        declareFunction(me, "uncache_suf_defn_metered", "UNCACHE-SUF-DEFN-METERED", 2, 0, false);
        declareFunction(me, "uncache_suf_defn", "UNCACHE-SUF-DEFN", 2, 0, false);
        declareFunction(me, "cache_suf_defn_int", "CACHE-SUF-DEFN-INT", 2, 1, false);
        declareFunction(me, "uncache_suf_defn_int", "UNCACHE-SUF-DEFN-INT", 2, 1, false);
        declareFunction(me, "handle_added_genl_for_suf_defns", "HANDLE-ADDED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        declareFunction(me, "reset_old_handle_added_genl_for_suf_defns_meters", "RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
        declareFunction(me, "old_handle_added_genl_for_suf_defns_metered", "OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
        declareFunction(me, "old_handle_added_genl_for_suf_defns", "OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        declareFunction(me, "handle_removed_genl_for_suf_defns", "HANDLE-REMOVED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        declareFunction(me, "reset_old_handle_removed_genl_for_suf_defns_meters", "RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS", 0, 0, false);
        declareFunction(me, "old_handle_removed_genl_for_suf_defns_metered", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERED", 2, 0, false);
        declareFunction(me, "old_handle_removed_genl_for_suf_defns", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS", 2, 0, false);
        declareFunction(me, "propagate_added_suf_defn", "PROPAGATE-ADDED-SUF-DEFN", 2, 0, false);
        declareFunction(me, "propagate_removed_suf_defn", "PROPAGATE-REMOVED-SUF-DEFN", 2, 0, false);
        declareFunction(me, "propagate_added_suf_defns", "PROPAGATE-ADDED-SUF-DEFNS", 2, 0, false);
        declareFunction(me, "propagate_removed_suf_defns", "PROPAGATE-REMOVED-SUF-DEFNS", 2, 0, false);
        declareFunction(me, "add_suf_defn_assertion", "ADD-SUF-DEFN-ASSERTION", 1, 1, false);
        declareFunction(me, "remove_suf_defn_assertion", "REMOVE-SUF-DEFN-ASSERTION", 1, 1, false);
        declareFunction(me, "merge_suf_defn_assertions", "MERGE-SUF-DEFN-ASSERTIONS", 1, 1, false);
        declareFunction(me, "defn_genl_searchedP", "DEFN-GENL-SEARCHED?", 1, 0, false);
        declareFunction(me, "arg1_spec_cardinality", "ARG1-SPEC-CARDINALITY", 1, 0, false);
        declareFunction(me, "suf_defn_sort", "SUF-DEFN-SORT", 1, 0, false);
        declareFunction(me, "reset_col_suf_defns", "RESET-COL-SUF-DEFNS", 1, 0, false);
        declareFunction(me, "reset_all_suf_defns", "RESET-ALL-SUF-DEFNS", 0, 2, false);
        declareFunction(me, "initialize_sufficient_defns_cache", "INITIALIZE-SUFFICIENT-DEFNS-CACHE", 0, 0, false);
        declareFunction(me, "suf_quoted_defn_assertions", "SUF-QUOTED-DEFN-ASSERTIONS", 1, 0, false);
        declareFunction(me, "suf_quoted_defnP", "SUF-QUOTED-DEFN?", 2, 0, false);
        declareFunction(me, "any_sufficient_quoted_defnP", "ANY-SUFFICIENT-QUOTED-DEFN?", 1, 1, false);
        declareFunction(me, "any_sufficient_quoted_defn_anywhereP", "ANY-SUFFICIENT-QUOTED-DEFN-ANYWHERE?", 1, 0, false);
        declareFunction(me, "old_any_sufficient_quoted_defn_anywhereP", "OLD-ANY-SUFFICIENT-QUOTED-DEFN-ANYWHERE?", 1, 0, false);
        declareFunction(me, "suf_quoted_defn_assertionP", "SUF-QUOTED-DEFN-ASSERTION?", 2, 0, false);
        declareFunction(me, "quoted_has_typeP", "QUOTED-HAS-TYPE?", 2, 1, false);
        declareFunction(me, "quiet_quoted_has_typeP", "QUIET-QUOTED-HAS-TYPE?", 2, 1, false);
        declareFunction(me, "not_quoted_has_type_by_extent_knownP", "NOT-QUOTED-HAS-TYPE-BY-EXTENT-KNOWN?", 2, 1, false);
        declareFunction(me, "not_quoted_has_typeP", "NOT-QUOTED-HAS-TYPE?", 2, 1, false);
        declareFunction(me, "quiet_not_quoted_has_typeP", "QUIET-NOT-QUOTED-HAS-TYPE?", 2, 1, false);
        declareFunction(me, "add_suf_quoted_defn", "ADD-SUF-QUOTED-DEFN", 2, 0, false);
        declareFunction(me, "add_iff_quoted_defn", "ADD-IFF-QUOTED-DEFN", 2, 0, false);
        declareFunction(me, "old_add_suf_quoted_defn", "OLD-ADD-SUF-QUOTED-DEFN", 2, 0, false);
        declareFunction(me, "remove_suf_quoted_defn", "REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
        declareFunction(me, "remove_iff_quoted_defn", "REMOVE-IFF-QUOTED-DEFN", 2, 0, false);
        declareFunction(me, "old_remove_suf_quoted_defn", "OLD-REMOVE-SUF-QUOTED-DEFN", 2, 0, false);
        declareFunction(me, "reset_cache_suf_quoted_defn_meters", "RESET-CACHE-SUF-QUOTED-DEFN-METERS", 0, 0, false);
        declareFunction(me, "cache_suf_quoted_defn_metered", "CACHE-SUF-QUOTED-DEFN-METERED", 2, 0, false);
        declareFunction(me, "cache_suf_quoted_defn", "CACHE-SUF-QUOTED-DEFN", 2, 0, false);
        declareFunction(me, "reset_uncache_suf_quoted_defn_meters", "RESET-UNCACHE-SUF-QUOTED-DEFN-METERS", 0, 0, false);
        declareFunction(me, "uncache_suf_quoted_defn_metered", "UNCACHE-SUF-QUOTED-DEFN-METERED", 2, 0, false);
        declareFunction(me, "uncache_suf_quoted_defn", "UNCACHE-SUF-QUOTED-DEFN", 2, 0, false);
        declareFunction(me, "cache_suf_quoted_defn_int", "CACHE-SUF-QUOTED-DEFN-INT", 2, 1, false);
        declareFunction(me, "uncache_suf_quoted_defn_int", "UNCACHE-SUF-QUOTED-DEFN-INT", 2, 1, false);
        declareFunction(me, "handle_added_genl_for_suf_quoted_defns", "HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        declareFunction(me, "reset_old_handle_added_genl_for_suf_quoted_defns_meters", "RESET-OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
        declareFunction(me, "old_handle_added_genl_for_suf_quoted_defns_metered", "OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
        declareFunction(me, "old_handle_added_genl_for_suf_quoted_defns", "OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        declareFunction(me, "handle_removed_genl_for_suf_quoted_defns", "HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        declareFunction(me, "reset_old_handle_removed_genl_for_suf_quoted_defns_meters", "RESET-OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS", 0, 0, false);
        declareFunction(me, "old_handle_removed_genl_for_suf_quoted_defns_metered", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERED", 2, 0, false);
        declareFunction(me, "old_handle_removed_genl_for_suf_quoted_defns", "OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS", 2, 0, false);
        declareFunction(me, "propagate_added_suf_quoted_defn", "PROPAGATE-ADDED-SUF-QUOTED-DEFN", 2, 0, false);
        declareFunction(me, "propagate_removed_suf_quoted_defn", "PROPAGATE-REMOVED-SUF-QUOTED-DEFN", 2, 0, false);
        declareFunction(me, "propagate_added_suf_quoted_defns", "PROPAGATE-ADDED-SUF-QUOTED-DEFNS", 2, 0, false);
        declareFunction(me, "propagate_removed_suf_quoted_defns", "PROPAGATE-REMOVED-SUF-QUOTED-DEFNS", 2, 0, false);
        declareFunction(me, "add_suf_quoted_defn_assertion", "ADD-SUF-QUOTED-DEFN-ASSERTION", 1, 1, false);
        declareFunction(me, "remove_suf_quoted_defn_assertion", "REMOVE-SUF-QUOTED-DEFN-ASSERTION", 1, 1, false);
        declareFunction(me, "merge_suf_quoted_defn_assertions", "MERGE-SUF-QUOTED-DEFN-ASSERTIONS", 1, 1, false);
        declareFunction(me, "reset_col_suf_quoted_defns", "RESET-COL-SUF-QUOTED-DEFNS", 1, 0, false);
        declareFunction(me, "reset_all_suf_quoted_defns", "RESET-ALL-SUF-QUOTED-DEFNS", 0, 2, false);
        declareFunction(me, "initialize_sufficient_quoted_defns_cache", "INITIALIZE-SUFFICIENT-QUOTED-DEFNS-CACHE", 0, 0, false);
        declareFunction(me, "suf_function_cache", "SUF-FUNCTION-CACHE", 1, 0, false);
        declareFunction(me, "get_suf_function_assertions", "GET-SUF-FUNCTION-ASSERTIONS", 2, 0, false);
        declareFunction(me, "set_suf_function_assertions", "SET-SUF-FUNCTION-ASSERTIONS", 3, 0, false);
        declareFunction(me, "rem_suf_function_assertions", "REM-SUF-FUNCTION-ASSERTIONS", 2, 0, false);
        declareFunction(me, "suf_function_assertions", "SUF-FUNCTION-ASSERTIONS", 2, 0, false);
        declareFunction(me, "suf_functionP", "SUF-FUNCTION?", 3, 0, false);
        declareFunction(me, "any_sufficient_functionP", "ANY-SUFFICIENT-FUNCTION?", 1, 1, false);
        declareFunction(me, "any_sufficient_quoted_functionP", "ANY-SUFFICIENT-QUOTED-FUNCTION?", 1, 1, false);
        declareFunction(me, "any_sufficient_functionP_int", "ANY-SUFFICIENT-FUNCTION?-INT", 3, 0, false);
        declareFunction(me, "any_sufficient_non_reified_functionP", "ANY-SUFFICIENT-NON-REIFIED-FUNCTION?", 2, 1, false);
        declareFunction(me, "suf_function_assertionP", "SUF-FUNCTION-ASSERTION?", 3, 0, false);
        declareFunction(me, "sufficient_function_of", "SUFFICIENT-FUNCTION-OF", 2, 1, false);
        declareFunction(me, "add_suf_function", "ADD-SUF-FUNCTION", 2, 0, false);
        declareFunction(me, "remove_suf_function", "REMOVE-SUF-FUNCTION", 2, 0, false);
        declareFunction(me, "add_suf_quoted_function", "ADD-SUF-QUOTED-FUNCTION", 2, 0, false);
        declareFunction(me, "remove_suf_quoted_function", "REMOVE-SUF-QUOTED-FUNCTION", 2, 0, false);
        declareFunction(me, "add_suf_function_int", "ADD-SUF-FUNCTION-INT", 3, 0, false);
        declareFunction(me, "remove_suf_function_int", "REMOVE-SUF-FUNCTION-INT", 3, 0, false);
        declareFunction(me, "reset_cache_suf_function_meters", "RESET-CACHE-SUF-FUNCTION-METERS", 0, 0, false);
        declareFunction(me, "cache_suf_function_metered", "CACHE-SUF-FUNCTION-METERED", 3, 0, false);
        declareFunction(me, "cache_suf_function", "CACHE-SUF-FUNCTION", 3, 0, false);
        declareFunction(me, "reset_uncache_suf_function_meters", "RESET-UNCACHE-SUF-FUNCTION-METERS", 0, 0, false);
        declareFunction(me, "uncache_suf_function_metered", "UNCACHE-SUF-FUNCTION-METERED", 3, 0, false);
        declareFunction(me, "uncache_suf_function", "UNCACHE-SUF-FUNCTION", 3, 0, false);
        declareFunction(me, "cache_suf_function_int", "CACHE-SUF-FUNCTION-INT", 3, 1, false);
        declareFunction(me, "uncache_suf_function_int", "UNCACHE-SUF-FUNCTION-INT", 3, 1, false);
        declareFunction(me, "reset_handle_added_genl_for_suf_functions_meters", "RESET-HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS", 0, 0, false);
        declareFunction(me, "handle_added_genl_for_suf_functions_metered", "HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERED", 2, 0, false);
        declareFunction(me, "handle_added_genl_for_suf_functions", "HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS", 2, 0, false);
        declareFunction(me, "reset_handle_removed_genl_for_suf_functions_meters", "RESET-HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS", 0, 0, false);
        declareFunction(me, "handle_removed_genl_for_suf_functions_metered", "HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERED", 2, 0, false);
        declareFunction(me, "handle_removed_genl_for_suf_functions", "HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS", 2, 0, false);
        declareFunction(me, "propagate_added_suf_function", "PROPAGATE-ADDED-SUF-FUNCTION", 3, 0, false);
        declareFunction(me, "propagate_removed_suf_function", "PROPAGATE-REMOVED-SUF-FUNCTION", 3, 0, false);
        declareFunction(me, "propagate_added_suf_functions", "PROPAGATE-ADDED-SUF-FUNCTIONS", 3, 0, false);
        declareFunction(me, "propagate_removed_suf_functions", "PROPAGATE-REMOVED-SUF-FUNCTIONS", 3, 0, false);
        declareFunction(me, "add_suf_function_assertion", "ADD-SUF-FUNCTION-ASSERTION", 1, 1, false);
        declareFunction(me, "remove_suf_function_assertion", "REMOVE-SUF-FUNCTION-ASSERTION", 1, 1, false);
        declareFunction(me, "merge_suf_function_assertions", "MERGE-SUF-FUNCTION-ASSERTIONS", 1, 1, false);
        declareFunction(me, "remove_suf_function_assertions", "REMOVE-SUF-FUNCTION-ASSERTIONS", 1, 1, false);
        declareFunction(me, "add_suf_quoted_function_assertion", "ADD-SUF-QUOTED-FUNCTION-ASSERTION", 1, 1, false);
        declareFunction(me, "remove_suf_quoted_function_assertion", "REMOVE-SUF-QUOTED-FUNCTION-ASSERTION", 1, 1, false);
        declareFunction(me, "merge_suf_quoted_function_assertions", "MERGE-SUF-QUOTED-FUNCTION-ASSERTIONS", 1, 1, false);
        declareFunction(me, "remove_suf_quoted_function_assertions", "REMOVE-SUF-QUOTED-FUNCTION-ASSERTIONS", 1, 1, false);
        declareFunction(me, "merge_suf_function_assertions_int", "MERGE-SUF-FUNCTION-ASSERTIONS-INT", 3, 0, false);
        declareFunction(me, "remove_suf_function_assertions_int", "REMOVE-SUF-FUNCTION-ASSERTIONS-INT", 3, 0, false);
        declareFunction(me, "function_genl_searchedP", "FUNCTION-GENL-SEARCHED?", 1, 0, false);
        declareFunction(me, "suf_function_sort", "SUF-FUNCTION-SORT", 1, 0, false);
        declareFunction(me, "suf_function_sort_pred", "SUF-FUNCTION-SORT-PRED", 2, 0, false);
        declareFunction(me, "clear_suf_functions", "CLEAR-SUF-FUNCTIONS", 0, 0, false);
        declareFunction(me, "clear_suf_quoted_functions", "CLEAR-SUF-QUOTED-FUNCTIONS", 0, 0, false);
        declareFunction(me, "reset_col_suf_functions", "RESET-COL-SUF-FUNCTIONS", 2, 0, false);
        declareFunction(me, "reset_all_suf_functions", "RESET-ALL-SUF-FUNCTIONS", 1, 2, false);
        declareFunction(me, "initialize_sufficient_functions_cache", "INITIALIZE-SUFFICIENT-FUNCTIONS-CACHE", 0, 0, false);
        declareFunction(me, "initialize_sufficient_quoted_functions_cache", "INITIALIZE-SUFFICIENT-QUOTED-FUNCTIONS-CACHE", 0, 0, false);
        declareFunction(me, "sufficient_function_cache_mal_assertions", "SUFFICIENT-FUNCTION-CACHE-MAL-ASSERTIONS", 0, 1, false);
        declareFunction(me, "sufficient_function_cache_mal_assertions_coerce", "SUFFICIENT-FUNCTION-CACHE-MAL-ASSERTIONS-COERCE", 0, 1, false);
        declareFunction(me, "assertion_referenced_in_sufficient_function_cacheP", "ASSERTION-REFERENCED-IN-SUFFICIENT-FUNCTION-CACHE?", 2, 0, false);
        declareFunction(me, "diagnose_sufficient_functions_cache", "DIAGNOSE-SUFFICIENT-FUNCTIONS-CACHE", 1, 2, false);
        declareFunction(me, "kbi_sfc_status", "KBI-SFC-STATUS", 0, 1, false);
        declareFunction(me, "sfc_cleanup", "SFC-CLEANUP", 1, 0, false);
        declareFunction(me, "sfc_mal_assertions", "SFC-MAL-ASSERTIONS", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_at_defns_file() {
        defvar("*USE-NEW-DEFNS-FUNCTIONS?*", T);
        defparameter("*OLD-DEFNS-ADMIT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*OLD-DEFNS-REJECT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*DEFINING-DEFNS-STATUS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*SUFFICIENT-DEFNS-ADMIT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*NECESSARY-DEFNS-REJECT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*REJECTED-BY-NECESSARY-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*OLD-QUOTED-DEFNS-ADMIT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*OLD-QUOTED-DEFNS-REJECT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*QUOTED-DEFINING-DEFNS-STATUS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*QUOTED-SUFFICIENT-DEFNS-ADMIT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*QUOTED-NECESSARY-DEFNS-REJECT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*REJECTED-BY-QUOTED-NECESSARY-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*DEFN-ADMITS-INT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*QUOTED-DEFN-ADMITS-INT?-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        deflexical("*DEFN-CYC-EVALUATE-CACHING-STATE*", NIL);
        defparameter("*CAT-DEFNS-FAILING*", NIL);
        defparameter("*CACHE-SUF-DEFN-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*UNCACHE-SUF-DEFN-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*OLD-HANDLE-ADDED-GENL-FOR-SUF-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*CACHE-SUF-QUOTED-DEFN-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*UNCACHE-SUF-QUOTED-DEFN-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*OLD-HANDLE-ADDED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*OLD-HANDLE-REMOVED-GENL-FOR-SUF-QUOTED-DEFNS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*CACHE-SUF-FUNCTION-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*UNCACHE-SUF-FUNCTION-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*HANDLE-ADDED-GENL-FOR-SUF-FUNCTIONS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*HANDLE-REMOVED-GENL-FOR-SUF-FUNCTIONS-METERS*", make_hash_table(EIGHT_INTEGER, UNPROVIDED, UNPROVIDED));
        defparameter("*SUF-FUNCTION-CACHE-MAL-KEYS*", NIL);
        defparameter("*SUF-FUNCTION-CACHE-KEY-W/O-VALUE*", NIL);
        defparameter("*SUF-FUNCTION-CACHE-KEY-W/MAL-VALUE*", NIL);
        defparameter("*SUF-FUNCTION-CACHE-KEY-W/STALE-VALUE*", NIL);
        defparameter("*SUF-FUNCTION-CACHE-KEYS-W/O-INERITED-VALUE*", NIL);
        defparameter("*SUF-FUNCTION-CACHE-AWOL-DIRECT-ASSERTIONS*", NIL);
        return NIL;
    }

    public static SubLObject setup_at_defns_file() {
        SubLObject item_var = $sym3$_OLD_DEFNS_ADMIT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_old_defns_admitP_meters();
        sethash($RESET, $old_defns_admitP_meters$.getDynamicValue(), $sym13$RESET_OLD_DEFNS_ADMIT__METERS);
        SubLObject cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        SubLObject v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym11$OLD_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($old_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym14$_OLD_DEFNS_REJECT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_old_defns_rejectP_meters();
        sethash($RESET, $old_defns_rejectP_meters$.getDynamicValue(), $sym16$RESET_OLD_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym15$OLD_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($old_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $defining_defns_status_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_defining_defns_status_meters();
        sethash($RESET, $defining_defns_status_meters$.getDynamicValue(), RESET_DEFINING_DEFNS_STATUS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (DEFINING_DEFNS_STATUS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($defining_defns_status_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym26$_SUFFICIENT_DEFNS_ADMIT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_sufficient_defns_admitP_meters();
        sethash($RESET, $sufficient_defns_admitP_meters$.getDynamicValue(), $sym28$RESET_SUFFICIENT_DEFNS_ADMIT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym27$SUFFICIENT_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($sufficient_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym31$_NECESSARY_DEFNS_REJECT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_necessary_defns_rejectP_meters();
        sethash($RESET, $necessary_defns_rejectP_meters$.getDynamicValue(), $sym33$RESET_NECESSARY_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym32$NECESSARY_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($necessary_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $rejected_by_necessary_defns_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_rejected_by_necessary_defns_meters();
        sethash($RESET, $rejected_by_necessary_defns_meters$.getDynamicValue(), RESET_REJECTED_BY_NECESSARY_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (REJECTED_BY_NECESSARY_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($rejected_by_necessary_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym57$_OLD_QUOTED_DEFNS_ADMIT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_old_quoted_defns_admitP_meters();
        sethash($RESET, $old_quoted_defns_admitP_meters$.getDynamicValue(), $sym59$RESET_OLD_QUOTED_DEFNS_ADMIT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym58$OLD_QUOTED_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($old_quoted_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym60$_OLD_QUOTED_DEFNS_REJECT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_old_quoted_defns_rejectP_meters();
        sethash($RESET, $old_quoted_defns_rejectP_meters$.getDynamicValue(), $sym62$RESET_OLD_QUOTED_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym61$OLD_QUOTED_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($old_quoted_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $quoted_defining_defns_status_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_quoted_defining_defns_status_meters();
        sethash($RESET, $quoted_defining_defns_status_meters$.getDynamicValue(), RESET_QUOTED_DEFINING_DEFNS_STATUS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (QUOTED_DEFINING_DEFNS_STATUS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($quoted_defining_defns_status_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym67$_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_quoted_sufficient_defns_admitP_meters();
        sethash($RESET, $quoted_sufficient_defns_admitP_meters$.getDynamicValue(), $sym69$RESET_QUOTED_SUFFICIENT_DEFNS_ADMIT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym68$QUOTED_SUFFICIENT_DEFNS_ADMIT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($quoted_sufficient_defns_admitP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym70$_QUOTED_NECESSARY_DEFNS_REJECT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_quoted_necessary_defns_rejectP_meters();
        sethash($RESET, $quoted_necessary_defns_rejectP_meters$.getDynamicValue(), $sym72$RESET_QUOTED_NECESSARY_DEFNS_REJECT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym71$QUOTED_NECESSARY_DEFNS_REJECT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($quoted_necessary_defns_rejectP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $rejected_by_quoted_necessary_defns_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_rejected_by_quoted_necessary_defns_meters();
        sethash($RESET, $rejected_by_quoted_necessary_defns_meters$.getDynamicValue(), RESET_REJECTED_BY_QUOTED_NECESSARY_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (REJECTED_BY_QUOTED_NECESSARY_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($rejected_by_quoted_necessary_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym80$_DEFN_ADMITS_INT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_defn_admits_intP_meters();
        sethash($RESET, $defn_admits_intP_meters$.getDynamicValue(), $sym83$RESET_DEFN_ADMITS_INT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym82$DEFN_ADMITS_INT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($defn_admits_intP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $sym87$_QUOTED_DEFN_ADMITS_INT__METERS_;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_quoted_defn_admits_intP_meters();
        sethash($RESET, $quoted_defn_admits_intP_meters$.getDynamicValue(), $sym89$RESET_QUOTED_DEFN_ADMITS_INT__METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ($sym88$QUOTED_DEFN_ADMITS_INT_ == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($quoted_defn_admits_intP_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        memoization_state.note_globally_cached_function(DEFN_CYC_EVALUATE);
        memoization_state.note_memoized_function($sym100$QUIET_HAS_TYPE_MEMOIZED_);
        register_kb_function(ADD_SUF_DEFN);
        register_kb_function(ADD_IFF_DEFN);
        register_kb_function(OLD_ADD_SUF_DEFN);
        register_kb_function(REMOVE_SUF_DEFN);
        register_kb_function(REMOVE_IFF_DEFN);
        register_kb_function(OLD_REMOVE_SUF_DEFN);
        item_var = $cache_suf_defn_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_cache_suf_defn_meters();
        sethash($RESET, $cache_suf_defn_meters$.getDynamicValue(), RESET_CACHE_SUF_DEFN_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (CACHE_SUF_DEFN == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($cache_suf_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $uncache_suf_defn_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_uncache_suf_defn_meters();
        sethash($RESET, $uncache_suf_defn_meters$.getDynamicValue(), RESET_UNCACHE_SUF_DEFN_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (UNCACHE_SUF_DEFN == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($uncache_suf_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $old_handle_added_genl_for_suf_defns_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_old_handle_added_genl_for_suf_defns_meters();
        sethash($RESET, $old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (OLD_HANDLE_ADDED_GENL_FOR_SUF_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($old_handle_added_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $old_handle_removed_genl_for_suf_defns_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_old_handle_removed_genl_for_suf_defns_meters();
        sethash($RESET, $old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (OLD_HANDLE_REMOVED_GENL_FOR_SUF_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($old_handle_removed_genl_for_suf_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        register_kb_function(ADD_SUF_QUOTED_DEFN);
        register_kb_function(ADD_IFF_QUOTED_DEFN);
        register_kb_function(OLD_ADD_SUF_QUOTED_DEFN);
        register_kb_function(REMOVE_SUF_QUOTED_DEFN);
        register_kb_function(REMOVE_IFF_QUOTED_DEFN);
        register_kb_function(OLD_REMOVE_SUF_QUOTED_DEFN);
        item_var = $cache_suf_quoted_defn_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_cache_suf_quoted_defn_meters();
        sethash($RESET, $cache_suf_quoted_defn_meters$.getDynamicValue(), RESET_CACHE_SUF_QUOTED_DEFN_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (CACHE_SUF_QUOTED_DEFN == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($cache_suf_quoted_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $uncache_suf_quoted_defn_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_uncache_suf_quoted_defn_meters();
        sethash($RESET, $uncache_suf_quoted_defn_meters$.getDynamicValue(), RESET_UNCACHE_SUF_QUOTED_DEFN_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (UNCACHE_SUF_QUOTED_DEFN == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($uncache_suf_quoted_defn_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $old_handle_added_genl_for_suf_quoted_defns_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_old_handle_added_genl_for_suf_quoted_defns_meters();
        sethash($RESET, $old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), RESET_OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (OLD_HANDLE_ADDED_GENL_FOR_SUF_QUOTED_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($old_handle_added_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $old_handle_removed_genl_for_suf_quoted_defns_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_old_handle_removed_genl_for_suf_quoted_defns_meters();
        sethash($RESET, $old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), RESET_OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (OLD_HANDLE_REMOVED_GENL_FOR_SUF_QUOTED_DEFNS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($old_handle_removed_genl_for_suf_quoted_defns_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        register_kb_function(ADD_SUF_FUNCTION);
        register_kb_function(REMOVE_SUF_FUNCTION);
        register_kb_function(ADD_SUF_QUOTED_FUNCTION);
        register_kb_function(REMOVE_SUF_QUOTED_FUNCTION);
        register_kb_function(ADD_SUF_FUNCTION_INT);
        register_kb_function(REMOVE_SUF_FUNCTION_INT);
        item_var = $cache_suf_function_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_cache_suf_function_meters();
        sethash($RESET, $cache_suf_function_meters$.getDynamicValue(), RESET_CACHE_SUF_FUNCTION_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (CACHE_SUF_FUNCTION == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($cache_suf_function_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $uncache_suf_function_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_uncache_suf_function_meters();
        sethash($RESET, $uncache_suf_function_meters$.getDynamicValue(), RESET_UNCACHE_SUF_FUNCTION_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (UNCACHE_SUF_FUNCTION == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($uncache_suf_function_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $handle_added_genl_for_suf_functions_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_handle_added_genl_for_suf_functions_meters();
        sethash($RESET, $handle_added_genl_for_suf_functions_meters$.getDynamicValue(), RESET_HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (HANDLE_ADDED_GENL_FOR_SUF_FUNCTIONS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($handle_added_genl_for_suf_functions_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        item_var = $handle_removed_genl_for_suf_functions_meters$;
        if (NIL == member(item_var, $defn_state_variables$.getGlobalValue(), symbol_function(EQL), symbol_function(IDENTITY))) {
            $defn_state_variables$.setGlobalValue(cons(item_var, $defn_state_variables$.getGlobalValue()));
        }
        reset_handle_removed_genl_for_suf_functions_meters();
        sethash($RESET, $handle_removed_genl_for_suf_functions_meters$.getDynamicValue(), RESET_HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS_METERS);
        cdolist_list_var = at_vars.$defn_meter_caches$.getDynamicValue();
        v_cache = NIL;
        v_cache = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (HANDLE_REMOVED_GENL_FOR_SUF_FUNCTIONS == gethash($FUNCTION, v_cache, UNPROVIDED)) {
                at_vars.$defn_meter_caches$.setDynamicValue(delete(v_cache, at_vars.$defn_meter_caches$.getDynamicValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                clrhash(v_cache);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_cache = cdolist_list_var.first();
        } 
        at_vars.$defn_meter_caches$.setDynamicValue(cons($handle_removed_genl_for_suf_functions_meters$.getDynamicValue(), at_vars.$defn_meter_caches$.getDynamicValue()));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_at_defns_file();
    }

    @Override
    public void initializeVariables() {
        init_at_defns_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_at_defns_file();
    }

    
}

/**
 * Total time: 7171 ms
 */
