package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_ignoring_errors;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class wff_utilities extends SubLTranslatedFile {
    public static final SubLFile me = new wff_utilities();

    public static final String myName = "com.cyc.cycjava.cycl.wff_utilities";

    public static final String myFingerPrint = "453636a9f917be7a69d09ce199ff8ce43670496bac2011e8215676aefc66d538";

    // defparameter
    public static final SubLSymbol $check_wff_constantsP$ = makeSymbol("*CHECK-WFF-CONSTANTS?*");

    // defparameter
    public static final SubLSymbol $check_wff_semanticsP$ = makeSymbol("*CHECK-WFF-SEMANTICS?*");

    // defparameter
    public static final SubLSymbol $check_wff_coherenceP$ = makeSymbol("*CHECK-WFF-COHERENCE?*");

    // defparameter
    public static final SubLSymbol $check_arg_typesP$ = makeSymbol("*CHECK-ARG-TYPES?*");

    // defparameter
    public static final SubLSymbol $check_var_typesP$ = makeSymbol("*CHECK-VAR-TYPES?*");

    // defparameter
    public static final SubLSymbol $check_arityP$ = makeSymbol("*CHECK-ARITY?*");

    // defparameter
    public static final SubLSymbol $use_cycl_grammar_if_semantic_checking_disabledP$ = makeSymbol("*USE-CYCL-GRAMMAR-IF-SEMANTIC-CHECKING-DISABLED?*");















    // defvar
    private static final SubLSymbol $non_wff_store$ = makeSymbol("*NON-WFF-STORE*");





    // defparameter
    private static final SubLSymbol $non_wff_current_assertion$ = makeSymbol("*NON-WFF-CURRENT-ASSERTION*");

    // defparameter
    private static final SubLSymbol $non_wff_outlier_timeout$ = makeSymbol("*NON-WFF-OUTLIER-TIMEOUT*");

    // defparameter
    private static final SubLSymbol $non_wff_count$ = makeSymbol("*NON-WFF-COUNT*");

    // defparameter
    private static final SubLSymbol $non_wff_verboseP$ = makeSymbol("*NON-WFF-VERBOSE?*");



    public static final SubLSymbol NON_WF_VARIABLE_P = makeSymbol("NON-WF-VARIABLE-P");

    public static final SubLSymbol $non_wff_list$ = makeSymbol("*NON-WFF-LIST*");

    public static final SubLSymbol $num_assertions_checked$ = makeSymbol("*NUM-ASSERTIONS-CHECKED*");

    public static final SubLSymbol $last_checked_assertion_id$ = makeSymbol("*LAST-CHECKED-ASSERTION-ID*");

    public static final SubLSymbol $non_wff_error$ = makeSymbol("*NON-WFF-ERROR*");

    public static final SubLSymbol $non_wff_error_list$ = makeSymbol("*NON-WFF-ERROR-LIST*");

    private static final SubLString $$$mapping_Cyc_assertions = makeString("mapping Cyc assertions");







    private static final SubLString $str11$WFF_checking_assertion_range__A__ = makeString("WFF-checking assertion range ~A - ~A");

    private static final SubLList $list12 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    public static final SubLSymbol $pre_wff_hash$ = makeSymbol("*PRE-WFF-HASH*");

    public static final SubLSymbol $post_wff_hash$ = makeSymbol("*POST-WFF-HASH*");

    private static final SubLObject $$genlMt = reader_make_constant_shell(makeString("genlMt"));

    public static final SubLString $str16$it_is_not_the_case_that____genlMt = makeString("it is not the case that (#$genlMt ~s ~s)");







    private static final SubLInteger $int$2048 = makeInteger(2048);

    public static final SubLSymbol $non_wff_start$ = makeSymbol("*NON-WFF-START*");

    public static final SubLSymbol $non_wff_end$ = makeSymbol("*NON-WFF-END*");

    private static final SubLInteger $int$30 = makeInteger(30);

    public static final SubLString $$$Determining_largest_checked_ID = makeString("Determining largest checked ID");

    public static final SubLString $str25$____Starting_with_ID____S = makeString("~%~%Starting with ID = ~S");



    public static final SubLString $str27$Unable_to_open__S = makeString("Unable to open ~S");

    public static final SubLString $str28$____start_time__S_ = makeString("~%(:start-time ~S)");



    public static final SubLString $str30$____S__S_ = makeString("~%(~S ~S)");

    public static final SubLString $str31$WFF_took_more_than__S_seconds_on_ = makeString("WFF took more than ~S seconds on ~S");

    public static final SubLString $str32$____error__S__S_ = makeString("~%(:error ~S ~S)");

    public static final SubLString $str33$____end_time__S_ = makeString("~%(:end-time ~S)");

    public static final SubLString $str34$No_WFF_sweep_has_been_started_ = makeString("No WFF-sweep has been started.");

    public static final SubLString $str35$After__S___the_whole_KB_should_ta = makeString("After ~S%, the whole KB should take ~S days.  Expected completion: ~A.");

    private static final SubLInteger $int$24 = makeInteger(24);

    private static final SubLInteger $int$60 = makeInteger(60);









    public static final SubLString $str42$Converting__non_wff_list__to__non = makeString("Converting *non-wff-list* to *non-wff-store*");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str44$Loading_newer_non_wff_store_from_ = makeString("Loading newer non-wff store from ~A");

    private static final SubLList $list45 = list(makeString("data"), makeString("non-wff"));

    private static final SubLString $str46$non_wff_store = makeString("non-wff-store");

    private static final SubLString $$$text = makeString("text");

    private static final SubLString $str48$______A = makeString("~%;; ~A");



    private static final SubLString $str50$Saving_the_non_WFF_store_in_exter = makeString("Saving the non-WFF store in externalized form.");



    private static final SubLString $str52$Saving_the_non_WFF_store_in_inter = makeString("Saving the non-WFF store in internalized form.");

    private static final SubLString $str53$____record_count__S_ = makeString("~%(:record-count ~S)");

    private static final SubLString $str54$____error__S_ = makeString("~%(:error ~S)");

    private static final SubLString $str55$__Problem__NIL_assertion_ID_in_er = makeString("~%Problem: NIL assertion ID in error list.");

    private static final SubLString $str56$Loading_the_non_WFF_store = makeString("Loading the non-WFF store");





    private static final SubLString $str59$The_assertion_with_this_external_ = makeString("The assertion with this external ID has a NIL assertion-id: ~S");

    private static final SubLString $str60$Assertions_with_HL_external_ID__S = makeString("Assertions with HL external ID ~S is not valid; skipping.");

    private static final SubLString $str61$Assertions_with_internal_ID__S_is = makeString("Assertions with internal ID ~S is not valid; skipping.");

    private static final SubLString $str62$Record__S_is_an_unknown_type_ = makeString("Record ~S is an unknown type.");



    public static SubLObject assertion_not_wffP(final SubLObject assertion) {
        return makeBoolean(NIL == assertion_wffP(assertion));
    }

    public static SubLObject assertion_wffP(final SubLObject assertion) {
        final SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return wff.el_wffP(formula, mt, UNPROVIDED);
    }

    public static SubLObject assertion_not_wff_assertibleP(final SubLObject assertion) {
        return makeBoolean(NIL == assertion_wff_assertibleP(assertion));
    }

    public static SubLObject assertion_wff_assertibleP(final SubLObject assertion) {
        final SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return wff.el_wff_assertibleP(formula, mt, UNPROVIDED);
    }

    public static SubLObject assertion_why_not_wff(final SubLObject assertion) {
        final SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return wff.why_not_wff(formula, mt, UNPROVIDED);
    }

    public static SubLObject assertion_why_not_wff_assert(final SubLObject assertion) {
        final SubLObject formula = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        return wff.why_not_wff_assert(formula, mt, UNPROVIDED);
    }

    public static SubLObject set_dont_check_wff_semantics() {
        $within_assert$.setDynamicValue(NIL);
        $check_arg_typesP$.setDynamicValue(NIL);
        at_vars.$at_check_arg_typesP$.setDynamicValue(NIL);
        $check_wff_semanticsP$.setDynamicValue(NIL);
        $check_wff_coherenceP$.setDynamicValue(NIL);
        $check_var_typesP$.setDynamicValue(NIL);
        czer_vars.$simplify_literalP$.setDynamicValue(NIL);
        at_vars.$at_check_relator_constraintsP$.setDynamicValue(NIL);
        at_vars.$at_check_arg_formatP$.setDynamicValue(NIL);
        wff_vars.$validate_constantsP$.setDynamicValue(NIL);
        system_parameters.$suspend_sbhl_type_checkingP$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject set_check_wff_semantics() {
        $check_arg_typesP$.setDynamicValue(T);
        at_vars.$at_check_arg_typesP$.setDynamicValue(T);
        $check_wff_semanticsP$.setDynamicValue(T);
        $check_var_typesP$.setDynamicValue(T);
        czer_vars.$simplify_literalP$.setDynamicValue(T);
        at_vars.$at_check_relator_constraintsP$.setDynamicValue(T);
        at_vars.$at_check_arg_formatP$.setDynamicValue(T);
        wff_vars.$validate_constantsP$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject check_assertible_literalP() {
        return within_assertP();
    }

    public static SubLObject mal_mt_specP(final SubLObject mt) {
        return makeBoolean(NIL == valid_mt_specP(mt));
    }

    public static SubLObject valid_mt_specP(final SubLObject mt) {
        return makeBoolean((NIL != hlmt.hlmtP(mt)) || ((NIL == mt) && (NIL != mt_relevance_macros.all_mts_are_relevantP())));
    }

    public static SubLObject wf_fort_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != forts.valid_fortP(v_object)) {
            return T;
        }
        if (NIL == forts.fort_p(v_object)) {
            return NIL;
        }
        if (NIL != wff_vars.$within_wffP$.getDynamicValue(thread)) {
            wff.note_wff_violation(list($MAL_FORT, v_object));
        }
        return NIL;
    }

    public static SubLObject non_wf_fort_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL == wf_fort_p(v_object)));
    }

    public static SubLObject non_wf_variable_p(final SubLObject v_object) {
        return makeBoolean((NIL != cycl_variables.el_varP(v_object)) && (NIL == cycl_variables.valid_el_varP(v_object)));
    }

    public static SubLObject mal_variablesP(final SubLObject sentence) {
        return cycl_utilities.expression_find_if(symbol_function(NON_WF_VARIABLE_P), sentence, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject mal_variables(final SubLObject sentence) {
        return cycl_utilities.expression_gather(sentence, symbol_function(NON_WF_VARIABLE_P), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject non_wff_assertion_ids() {
        return $non_wff_list$.getGlobalValue();
    }

    public static SubLObject number_of_assertions_wff_checked() {
        return $num_assertions_checked$.getGlobalValue();
    }

    public static SubLObject last_wff_checked_assertion_id() {
        return $last_checked_assertion_id$.getGlobalValue();
    }

    public static SubLObject non_wff_error() {
        return $non_wff_error$.getGlobalValue();
    }

    public static SubLObject non_wffs_in_mts(final SubLObject mts, SubLObject start_id) {
        if (start_id == UNPROVIDED) {
            start_id = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $num_assertions_checked$.setGlobalValue(ZERO_INTEGER);
        $last_checked_assertion_id$.setGlobalValue(ZERO_INTEGER);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
                final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                    try {
                        final SubLObject idx = assertion_handles.do_assertions_table();
                        final SubLObject mess = $$$mapping_Cyc_assertions;
                        final SubLObject total = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                        final SubLObject _prev_bind_0_$2 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$4 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(mess);
                                final SubLObject idx_$5 = idx;
                                if (NIL == id_index_objects_empty_p(idx_$5, $SKIP)) {
                                    final SubLObject idx_$6 = idx_$5;
                                    if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                                        final SubLObject vector_var = id_index_dense_objects(idx_$6);
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject a_id;
                                        SubLObject a_handle;
                                        SubLObject ass;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            a_handle = aref(vector_var, a_id);
                                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                if (NIL != id_index_tombstone_p(a_handle)) {
                                                    a_handle = $SKIP;
                                                }
                                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                                if ((assertion_handles.assertion_id(ass).numGE(start_id) && (NIL != mt_relevance_macros.in_one_of_these_mtsP(ass, mts))) && (NIL != assertion_not_wffP(ass))) {
                                                    $non_wff_list$.setGlobalValue(cons(assertion_handles.assertion_id(ass), $non_wff_list$.getGlobalValue()));
                                                }
                                                $last_checked_assertion_id$.setGlobalValue(assertion_handles.assertion_id(ass));
                                                $num_assertions_checked$.setGlobalValue(add($num_assertions_checked$.getGlobalValue(), ONE_INTEGER));
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                        }
                                    }
                                    final SubLObject idx_$7 = idx_$5;
                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$7)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        final SubLObject sparse = id_index_sparse_objects(idx_$7);
                                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$7);
                                        final SubLObject end_id = id_index_next_id(idx_$7);
                                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                        while (a_id2.numL(end_id)) {
                                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                if ((assertion_handles.assertion_id(ass2).numGE(start_id) && (NIL != mt_relevance_macros.in_one_of_these_mtsP(ass2, mts))) && (NIL != assertion_not_wffP(ass2))) {
                                                    $non_wff_list$.setGlobalValue(cons(assertion_handles.assertion_id(ass2), $non_wff_list$.getGlobalValue()));
                                                }
                                                $last_checked_assertion_id$.setGlobalValue(assertion_handles.assertion_id(ass2));
                                                $num_assertions_checked$.setGlobalValue(add($num_assertions_checked$.getGlobalValue(), ONE_INTEGER));
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            a_id2 = add(a_id2, ONE_INTEGER);
                                        } 
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2_$4, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$3, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return $non_wff_list$.getGlobalValue();
    }

    public static SubLObject all_non_wff_assertion_ids(SubLObject start_id) {
        if (start_id == UNPROVIDED) {
            start_id = ZERO_INTEGER;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $num_assertions_checked$.setGlobalValue(ZERO_INTEGER);
        $last_checked_assertion_id$.setGlobalValue(ZERO_INTEGER);
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
                final SubLObject _prev_bind_0_$11 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                    try {
                        final SubLObject idx = assertion_handles.do_assertions_table();
                        final SubLObject mess = $$$mapping_Cyc_assertions;
                        final SubLObject total = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                        final SubLObject _prev_bind_0_$12 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$13 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$14 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(mess);
                                final SubLObject idx_$15 = idx;
                                if (NIL == id_index_objects_empty_p(idx_$15, $SKIP)) {
                                    final SubLObject idx_$16 = idx_$15;
                                    if (NIL == id_index_dense_objects_empty_p(idx_$16, $SKIP)) {
                                        final SubLObject vector_var = id_index_dense_objects(idx_$16);
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject a_id;
                                        SubLObject a_handle;
                                        SubLObject ass;
                                        SubLObject error;
                                        SubLObject _prev_bind_0_$13;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            a_handle = aref(vector_var, a_id);
                                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                if (NIL != id_index_tombstone_p(a_handle)) {
                                                    a_handle = $SKIP;
                                                }
                                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                                if (assertion_handles.assertion_id(ass).numGE(start_id)) {
                                                    error = NIL;
                                                    try {
                                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                        _prev_bind_0_$13 = Errors.$error_handler$.currentBinding(thread);
                                                        try {
                                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                            try {
                                                                if (NIL != assertion_not_wffP(ass)) {
                                                                    $non_wff_list$.setGlobalValue(cons(assertion_handles.assertion_id(ass), $non_wff_list$.getGlobalValue()));
                                                                }
                                                            } catch (final Throwable catch_var) {
                                                                Errors.handleThrowable(catch_var, NIL);
                                                            }
                                                        } finally {
                                                            Errors.$error_handler$.rebind(_prev_bind_0_$13, thread);
                                                        }
                                                    } catch (final Throwable ccatch_env_var) {
                                                        error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                                                    } finally {
                                                        thread.throwStack.pop();
                                                    }
                                                    if (NIL != error) {
                                                        $non_wff_error_list$.setGlobalValue(cons(assertion_handles.assertion_id(ass), $non_wff_error_list$.getGlobalValue()));
                                                    }
                                                }
                                                $last_checked_assertion_id$.setGlobalValue(assertion_handles.assertion_id(ass));
                                                $num_assertions_checked$.setGlobalValue(add($num_assertions_checked$.getGlobalValue(), ONE_INTEGER));
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                        }
                                    }
                                    final SubLObject idx_$17 = idx_$15;
                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$17)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        final SubLObject sparse = id_index_sparse_objects(idx_$17);
                                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$17);
                                        final SubLObject end_id = id_index_next_id(idx_$17);
                                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                        while (a_id2.numL(end_id)) {
                                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                if (assertion_handles.assertion_id(ass2).numGE(start_id)) {
                                                    SubLObject error2 = NIL;
                                                    try {
                                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                        final SubLObject _prev_bind_0_$14 = Errors.$error_handler$.currentBinding(thread);
                                                        try {
                                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                            try {
                                                                if (NIL != assertion_not_wffP(ass2)) {
                                                                    $non_wff_list$.setGlobalValue(cons(assertion_handles.assertion_id(ass2), $non_wff_list$.getGlobalValue()));
                                                                }
                                                            } catch (final Throwable catch_var2) {
                                                                Errors.handleThrowable(catch_var2, NIL);
                                                            }
                                                        } finally {
                                                            Errors.$error_handler$.rebind(_prev_bind_0_$14, thread);
                                                        }
                                                    } catch (final Throwable ccatch_env_var2) {
                                                        error2 = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                                                    } finally {
                                                        thread.throwStack.pop();
                                                    }
                                                    if (NIL != error2) {
                                                        $non_wff_error_list$.setGlobalValue(cons(assertion_handles.assertion_id(ass2), $non_wff_error_list$.getGlobalValue()));
                                                    }
                                                }
                                                $last_checked_assertion_id$.setGlobalValue(assertion_handles.assertion_id(ass2));
                                                $num_assertions_checked$.setGlobalValue(add($num_assertions_checked$.getGlobalValue(), ONE_INTEGER));
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            a_id2 = add(a_id2, ONE_INTEGER);
                                        } 
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2_$14, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$13, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$12, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$11, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return $non_wff_list$.getGlobalValue();
    }

    public static SubLObject non_wff_assertion_ids_in_range(final SubLObject start_id, final SubLObject stop_id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $non_wff_list$.setGlobalValue(NIL);
        $num_assertions_checked$.setGlobalValue(ZERO_INTEGER);
        $last_checked_assertion_id$.setGlobalValue(ZERO_INTEGER);
        $non_wff_error$.setGlobalValue(NIL);
        SubLObject error = NIL;
        SubLObject finished = NIL;
        final SubLObject message = format(NIL, $str11$WFF_checking_assertion_range__A__, start_id, stop_id);
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject _prev_bind_0_$23 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
                            final SubLObject _prev_bind_0_$24 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                                try {
                                    final SubLObject idx = assertion_handles.do_assertions_table();
                                    final SubLObject mess = message;
                                    final SubLObject total = id_index_count(idx);
                                    SubLObject sofar = ZERO_INTEGER;
                                    assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                                    final SubLObject _prev_bind_0_$25 = $last_percent_progress_index$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$26 = $last_percent_progress_prediction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$27 = $within_noting_percent_progress$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                        $within_noting_percent_progress$.bind(T, thread);
                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                        try {
                                            noting_percent_progress_preamble(mess);
                                            final SubLObject idx_$28 = idx;
                                            if (NIL == id_index_objects_empty_p(idx_$28, $SKIP)) {
                                                final SubLObject idx_$29 = idx_$28;
                                                if (NIL == id_index_dense_objects_empty_p(idx_$29, $SKIP)) {
                                                    final SubLObject vector_var = id_index_dense_objects(idx_$29);
                                                    final SubLObject backwardP_var = NIL;
                                                    final SubLObject length = length(vector_var);
                                                    SubLObject current;
                                                    final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                                                    SubLObject start = NIL;
                                                    SubLObject end = NIL;
                                                    SubLObject delta = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list12);
                                                    start = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list12);
                                                    end = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list12);
                                                    delta = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL == finished) {
                                                            SubLObject end_var;
                                                            SubLObject a_id;
                                                            SubLObject a_handle;
                                                            SubLObject ass;
                                                            for (end_var = end, a_id = NIL, a_id = start; (NIL == finished) && (NIL == subl_macros.do_numbers_endtest(a_id, delta, end_var)); a_id = add(a_id, delta)) {
                                                                a_handle = aref(vector_var, a_id);
                                                                if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                                    if (NIL != id_index_tombstone_p(a_handle)) {
                                                                        a_handle = $SKIP;
                                                                    }
                                                                    ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                                                    if (assertion_handles.assertion_id(ass).numGE(start_id)) {
                                                                        if (assertion_handles.assertion_id(ass).numGE(stop_id)) {
                                                                            finished = T;
                                                                        }
                                                                        if (NIL != assertion_not_wffP(ass)) {
                                                                            $non_wff_list$.setGlobalValue(cons(assertion_handles.assertion_id(ass), $non_wff_list$.getGlobalValue()));
                                                                        }
                                                                        $num_assertions_checked$.setGlobalValue(add($num_assertions_checked$.getGlobalValue(), ONE_INTEGER));
                                                                    }
                                                                    $last_checked_assertion_id$.setGlobalValue(assertion_handles.assertion_id(ass));
                                                                    sofar = add(sofar, ONE_INTEGER);
                                                                    note_percent_progress(sofar, total);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list12);
                                                    }
                                                }
                                                final SubLObject idx_$30 = idx_$28;
                                                if ((NIL == id_index_sparse_objects_empty_p(idx_$30)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                    final SubLObject sparse = id_index_sparse_objects(idx_$30);
                                                    SubLObject a_id2 = id_index_sparse_id_threshold(idx_$30);
                                                    final SubLObject end_id = id_index_next_id(idx_$30);
                                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                                    while (a_id2.numL(end_id) && (NIL == finished)) {
                                                        final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                            final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                            if (assertion_handles.assertion_id(ass2).numGE(start_id)) {
                                                                if (assertion_handles.assertion_id(ass2).numGE(stop_id)) {
                                                                    finished = T;
                                                                }
                                                                if (NIL != assertion_not_wffP(ass2)) {
                                                                    $non_wff_list$.setGlobalValue(cons(assertion_handles.assertion_id(ass2), $non_wff_list$.getGlobalValue()));
                                                                }
                                                                $num_assertions_checked$.setGlobalValue(add($num_assertions_checked$.getGlobalValue(), ONE_INTEGER));
                                                            }
                                                            $last_checked_assertion_id$.setGlobalValue(assertion_handles.assertion_id(ass2));
                                                            sofar = add(sofar, ONE_INTEGER);
                                                            note_percent_progress(sofar, total);
                                                        }
                                                        a_id2 = add(a_id2, ONE_INTEGER);
                                                    } 
                                                }
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                noting_percent_progress_postamble();
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                            }
                                        }
                                    } finally {
                                        $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                        $within_noting_percent_progress$.rebind(_prev_bind_2_$27, thread);
                                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$26, thread);
                                        $last_percent_progress_index$.rebind(_prev_bind_0_$25, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values2 = getValuesAsVector();
                                        sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                                        restoreValuesFromVector(_values2);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$24, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$28 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$28, thread);
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$23, thread);
                    }
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
        if (NIL != error) {
            $non_wff_error$.setGlobalValue(error);
        }
        return $non_wff_list$.getGlobalValue();
    }

    public static SubLObject relevant_spec_mts(final SubLObject low, final SubLObject high) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = make_binary_formula($$genlMt, low, high);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == kb_indexing.find_gaf_any_mt(formula))) {
            Errors.error($str16$it_is_not_the_case_that____genlMt, low, high);
        }
        fi.fi_unassert_int(formula, mt_vars.$mt_mt$.getGlobalValue());
        SubLObject result = NIL;
        result = set_difference(genl_mts.all_spec_mts(low, UNPROVIDED, UNPROVIDED), genl_mts.all_spec_mts(high, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        fi.fi_assert_int(formula, mt_vars.$mt_mt$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
        return result;
    }

    public static SubLObject pre_num_wff() {
        SubLObject num = ZERO_INTEGER;
        SubLObject id = NIL;
        SubLObject not_wffP = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($pre_wff_hash$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                id = getEntryKey(cdohash_entry);
                not_wffP = getEntryValue(cdohash_entry);
                if (NIL == not_wffP) {
                    num = add(num, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return num;
    }

    public static SubLObject pre_num_not_wff() {
        SubLObject num = ZERO_INTEGER;
        SubLObject id = NIL;
        SubLObject not_wffP = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($pre_wff_hash$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                id = getEntryKey(cdohash_entry);
                not_wffP = getEntryValue(cdohash_entry);
                if (NIL != not_wffP) {
                    num = add(num, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return num;
    }

    public static SubLObject pre_percent_not_wff() {
        return multiply($int$100, divide(pre_num_not_wff(), hash_table_count($pre_wff_hash$.getGlobalValue())));
    }

    public static SubLObject post_num_wff() {
        SubLObject num = ZERO_INTEGER;
        SubLObject id = NIL;
        SubLObject not_wffP = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($post_wff_hash$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                id = getEntryKey(cdohash_entry);
                not_wffP = getEntryValue(cdohash_entry);
                if (NIL == not_wffP) {
                    num = add(num, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return num;
    }

    public static SubLObject post_num_not_wff() {
        SubLObject num = ZERO_INTEGER;
        SubLObject id = NIL;
        SubLObject not_wffP = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator($post_wff_hash$.getGlobalValue());
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                id = getEntryKey(cdohash_entry);
                not_wffP = getEntryValue(cdohash_entry);
                if (NIL != not_wffP) {
                    num = add(num, ONE_INTEGER);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return num;
    }

    public static SubLObject post_percent_not_wff() {
        return multiply($int$100, divide(post_num_not_wff(), hash_table_count($post_wff_hash$.getGlobalValue())));
    }

    public static SubLObject pre_wff_check_in_mts(final SubLObject mts, SubLObject init_wff_hashP, SubLObject start_id, SubLObject stop_id) {
        if (init_wff_hashP == UNPROVIDED) {
            init_wff_hashP = T;
        }
        if (start_id == UNPROVIDED) {
            start_id = ZERO_INTEGER;
        }
        if (stop_id == UNPROVIDED) {
            stop_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != init_wff_hashP) {
            $pre_wff_hash$.setGlobalValue(make_hash_table($int$1000, UNPROVIDED, UNPROVIDED));
        }
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
                final SubLObject _prev_bind_0_$34 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                    try {
                        final SubLObject idx = assertion_handles.do_assertions_table();
                        final SubLObject mess = $$$mapping_Cyc_assertions;
                        final SubLObject total = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                        final SubLObject _prev_bind_0_$35 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$36 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$37 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(mess);
                                final SubLObject idx_$38 = idx;
                                if (NIL == id_index_objects_empty_p(idx_$38, $SKIP)) {
                                    final SubLObject idx_$39 = idx_$38;
                                    if (NIL == id_index_dense_objects_empty_p(idx_$39, $SKIP)) {
                                        final SubLObject vector_var = id_index_dense_objects(idx_$39);
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject a_id;
                                        SubLObject a_handle;
                                        SubLObject ass;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            a_handle = aref(vector_var, a_id);
                                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                if (NIL != id_index_tombstone_p(a_handle)) {
                                                    a_handle = $SKIP;
                                                }
                                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                                if ((assertion_handles.assertion_id(ass).numGE(start_id) && (NIL != mt_relevance_macros.in_one_of_these_mtsP(ass, mts))) && ((NIL == stop_id) || assertion_handles.assertion_id(ass).numLE(stop_id))) {
                                                    sethash(assertion_handles.assertion_id(ass), $pre_wff_hash$.getGlobalValue(), assertion_not_wffP(ass));
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                        }
                                    }
                                    final SubLObject idx_$40 = idx_$38;
                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$40)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        final SubLObject sparse = id_index_sparse_objects(idx_$40);
                                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$40);
                                        final SubLObject end_id = id_index_next_id(idx_$40);
                                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                        while (a_id2.numL(end_id)) {
                                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                if ((assertion_handles.assertion_id(ass2).numGE(start_id) && (NIL != mt_relevance_macros.in_one_of_these_mtsP(ass2, mts))) && ((NIL == stop_id) || assertion_handles.assertion_id(ass2).numLE(stop_id))) {
                                                    sethash(assertion_handles.assertion_id(ass2), $pre_wff_hash$.getGlobalValue(), assertion_not_wffP(ass2));
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            a_id2 = add(a_id2, ONE_INTEGER);
                                        } 
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$36 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$36, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2_$37, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$36, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$35, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$37 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$37, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$34, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return $pre_wff_hash$.getGlobalValue();
    }

    public static SubLObject post_wff_check_in_mts(final SubLObject mts, SubLObject init_wff_hashP, SubLObject start_id, SubLObject stop_id) {
        if (init_wff_hashP == UNPROVIDED) {
            init_wff_hashP = T;
        }
        if (start_id == UNPROVIDED) {
            start_id = ZERO_INTEGER;
        }
        if (stop_id == UNPROVIDED) {
            stop_id = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != init_wff_hashP) {
            $post_wff_hash$.setGlobalValue(make_hash_table($int$1000, UNPROVIDED, UNPROVIDED));
        }
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
                final SubLObject _prev_bind_0_$44 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                    try {
                        final SubLObject idx = assertion_handles.do_assertions_table();
                        final SubLObject mess = $$$mapping_Cyc_assertions;
                        final SubLObject total = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                        final SubLObject _prev_bind_0_$45 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$46 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$47 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(mess);
                                final SubLObject idx_$48 = idx;
                                if (NIL == id_index_objects_empty_p(idx_$48, $SKIP)) {
                                    final SubLObject idx_$49 = idx_$48;
                                    if (NIL == id_index_dense_objects_empty_p(idx_$49, $SKIP)) {
                                        final SubLObject vector_var = id_index_dense_objects(idx_$49);
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject a_id;
                                        SubLObject a_handle;
                                        SubLObject ass;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            a_handle = aref(vector_var, a_id);
                                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                if (NIL != id_index_tombstone_p(a_handle)) {
                                                    a_handle = $SKIP;
                                                }
                                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                                if ((assertion_handles.assertion_id(ass).numGE(start_id) && (NIL != mt_relevance_macros.in_one_of_these_mtsP(ass, mts))) && ((NIL == stop_id) || assertion_handles.assertion_id(ass).numLE(stop_id))) {
                                                    sethash(assertion_handles.assertion_id(ass), $post_wff_hash$.getGlobalValue(), assertion_not_wffP(ass));
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                        }
                                    }
                                    final SubLObject idx_$50 = idx_$48;
                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$50)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        final SubLObject sparse = id_index_sparse_objects(idx_$50);
                                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$50);
                                        final SubLObject end_id = id_index_next_id(idx_$50);
                                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                        while (a_id2.numL(end_id)) {
                                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                if ((assertion_handles.assertion_id(ass2).numGE(start_id) && (NIL != mt_relevance_macros.in_one_of_these_mtsP(ass2, mts))) && ((NIL == stop_id) || assertion_handles.assertion_id(ass2).numLE(stop_id))) {
                                                    sethash(assertion_handles.assertion_id(ass2), $post_wff_hash$.getGlobalValue(), assertion_not_wffP(ass2));
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            a_id2 = add(a_id2, ONE_INTEGER);
                                        } 
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2_$47, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$46, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$45, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$44, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values3 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values3);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return $post_wff_hash$.getGlobalValue();
    }

    public static SubLObject last_checked_id(final SubLObject hash) {
        SubLObject max = ZERO_INTEGER;
        SubLObject id = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(hash);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                id = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                if (id.numG(max)) {
                    max = id;
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return max;
    }

    public static SubLObject pre_post_deltas(SubLObject post_smallerP) {
        if (post_smallerP == UNPROVIDED) {
            post_smallerP = T;
        }
        final SubLObject small_hash = (NIL != post_smallerP) ? $post_wff_hash$.getGlobalValue() : $pre_wff_hash$.getGlobalValue();
        final SubLObject big_hash = (NIL != post_smallerP) ? $pre_wff_hash$.getGlobalValue() : $post_wff_hash$.getGlobalValue();
        SubLObject deltas = NIL;
        SubLObject key = NIL;
        SubLObject val = NIL;
        final Iterator cdohash_iterator = getEntrySetIterator(small_hash);
        try {
            while (iteratorHasNext(cdohash_iterator)) {
                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                key = getEntryKey(cdohash_entry);
                val = getEntryValue(cdohash_entry);
                if (!val.eql(gethash(key, big_hash, UNPROVIDED))) {
                    deltas = cons(key, deltas);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator);
        }
        return deltas;
    }

    public static SubLObject non_wff_cached_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject assertion_id = assertion_handles.assertion_id(assertion);
        return list_utilities.sublisp_boolean(gethash(assertion_id, $non_wff_store$.getDynamicValue(thread), UNPROVIDED));
    }

    public static SubLObject non_wff_enter(final SubLObject assertion, SubLObject kb_version_string) {
        if (kb_version_string == UNPROVIDED) {
            kb_version_string = operation_communication.kb_version_string();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject assertion_id = assertion_handles.assertion_id(assertion);
        return sethash(assertion_id, $non_wff_store$.getDynamicValue(thread), kb_version_string);
    }

    public static SubLObject non_wff_remove(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject assertion_id = assertion_handles.assertion_id(assertion);
        return remhash(assertion_id, $non_wff_store$.getDynamicValue(thread));
    }

    public static SubLObject non_wff_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_count($non_wff_store$.getDynamicValue(thread));
    }

    public static SubLObject non_wff_in_what_kb(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != assertion_handles.assertion_p(assertion) : "assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) " + assertion;
        final SubLObject assertion_id = assertion_handles.assertion_id(assertion);
        return gethash(assertion_id, $non_wff_store$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject initialize_non_wff_store_to_file(final SubLObject filename, SubLObject restartP) {
        if (restartP == UNPROVIDED) {
            restartP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        $non_wff_end$.setGlobalValue(NIL);
        $non_wff_start$.setGlobalValue(get_universal_time());
        SubLObject start_id = NIL;
        if (NIL != restartP) {
            non_wff_store_load_externalized(filename);
            SubLObject max_id = ZERO_INTEGER;
            final SubLObject table_var = $non_wff_store$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($$$Determining_largest_checked_ID, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject internal_id = NIL;
                    SubLObject ignore = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            internal_id = getEntryKey(cdohash_entry);
                            ignore = getEntryValue(cdohash_entry);
                            if (internal_id.numG(max_id)) {
                                max_id = internal_id;
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$54 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$54, thread);
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
            $last_checked_assertion_id$.setGlobalValue(max_id);
            start_id = add(ONE_INTEGER, $last_checked_assertion_id$.getGlobalValue());
            format(T, $str25$____Starting_with_ID____S, start_id);
            $num_assertions_checked$.setGlobalValue(ZERO_INTEGER);
        } else {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $OUTPUT);
                if (!stream.isStream()) {
                    Errors.error($str27$Unable_to_open__S, filename);
                }
                final SubLObject stream_$55 = stream;
                format(stream_$55, $str28$____start_time__S_, $non_wff_start$.getGlobalValue());
            } finally {
                final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
                }
            }
            clrhash($non_wff_store$.getDynamicValue(thread));
            $num_assertions_checked$.setGlobalValue(ZERO_INTEGER);
            $last_checked_assertion_id$.setGlobalValue(ZERO_INTEGER);
            start_id = ZERO_INTEGER;
        }
        final SubLObject kb_version_string = operation_communication.kb_version_string();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_10 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
                final SubLObject _prev_bind_0_$55 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_11 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                final SubLObject _prev_bind_12 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
                    try {
                        final SubLObject idx = assertion_handles.do_assertions_table();
                        final SubLObject mess = $$$mapping_Cyc_assertions;
                        final SubLObject total = id_index_count(idx);
                        SubLObject sofar = ZERO_INTEGER;
                        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                        final SubLObject _prev_bind_0_$56 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$58 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$59 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_13 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(mess);
                                final SubLObject idx_$60 = idx;
                                if (NIL == id_index_objects_empty_p(idx_$60, $SKIP)) {
                                    final SubLObject idx_$61 = idx_$60;
                                    if (NIL == id_index_dense_objects_empty_p(idx_$61, $SKIP)) {
                                        final SubLObject vector_var = id_index_dense_objects(idx_$61);
                                        final SubLObject backwardP_var = NIL;
                                        SubLObject length;
                                        SubLObject v_iteration;
                                        SubLObject a_id;
                                        SubLObject a_handle;
                                        SubLObject ass;
                                        SubLObject error;
                                        SubLObject timed_outP;
                                        SubLObject _prev_bind_0_$57;
                                        SubLObject tag;
                                        SubLObject _prev_bind_0_$58;
                                        SubLObject timer;
                                        SubLObject _prev_bind_0_$59;
                                        SubLObject stream2;
                                        SubLObject stream_$56;
                                        SubLObject _prev_bind_0_$60;
                                        SubLObject _values3;
                                        SubLObject _prev_bind_0_$61;
                                        SubLObject _values4;
                                        SubLObject stream3;
                                        SubLObject stream_$57;
                                        SubLObject _prev_bind_0_$62;
                                        SubLObject _values5;
                                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                            a_handle = aref(vector_var, a_id);
                                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                if (NIL != id_index_tombstone_p(a_handle)) {
                                                    a_handle = $SKIP;
                                                }
                                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                                if (assertion_handles.assertion_id(ass).numGE(start_id)) {
                                                    $non_wff_current_assertion$.setDynamicValue(ass, thread);
                                                    error = NIL;
                                                    timed_outP = NIL;
                                                    try {
                                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                        _prev_bind_0_$57 = Errors.$error_handler$.currentBinding(thread);
                                                        try {
                                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                            try {
                                                                tag = with_timeout_make_tag();
                                                                try {
                                                                    thread.throwStack.push(tag);
                                                                    _prev_bind_0_$58 = $within_with_timeout$.currentBinding(thread);
                                                                    try {
                                                                        $within_with_timeout$.bind(T, thread);
                                                                        timer = NIL;
                                                                        try {
                                                                            _prev_bind_0_$59 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                            try {
                                                                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                                timer = with_timeout_start_timer($non_wff_outlier_timeout$.getDynamicValue(thread), tag);
                                                                                if (NIL != assertion_not_wffP(ass)) {
                                                                                    non_wff_enter(ass, kb_version_string);
                                                                                    stream2 = NIL;
                                                                                    try {
                                                                                        stream2 = compatibility.open_text(filename, $APPEND);
                                                                                        if (!stream2.isStream()) {
                                                                                            Errors.error($str27$Unable_to_open__S, filename);
                                                                                        }
                                                                                        stream_$56 = stream2;
                                                                                        format(stream_$56, $str30$____S__S_, kb_utilities.hl_external_id_string(ass), kb_version_string);
                                                                                    } finally {
                                                                                        _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            _values3 = getValuesAsVector();
                                                                                            if (stream2.isStream()) {
                                                                                                close(stream2, UNPROVIDED);
                                                                                            }
                                                                                            restoreValuesFromVector(_values3);
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$59, thread);
                                                                            }
                                                                        } finally {
                                                                            _prev_bind_0_$61 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                _values4 = getValuesAsVector();
                                                                                with_timeout_stop_timer(timer);
                                                                                restoreValuesFromVector(_values4);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$61, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        $within_with_timeout$.rebind(_prev_bind_0_$58, thread);
                                                                    }
                                                                } catch (final Throwable ccatch_env_var) {
                                                                    timed_outP = Errors.handleThrowable(ccatch_env_var, tag);
                                                                } finally {
                                                                    thread.throwStack.pop();
                                                                }
                                                                if (NIL != timed_outP) {
                                                                    Errors.error($str31$WFF_took_more_than__S_seconds_on_, $non_wff_outlier_timeout$.getDynamicValue(thread), ass);
                                                                }
                                                            } catch (final Throwable catch_var) {
                                                                Errors.handleThrowable(catch_var, NIL);
                                                            }
                                                        } finally {
                                                            Errors.$error_handler$.rebind(_prev_bind_0_$57, thread);
                                                        }
                                                    } catch (final Throwable ccatch_env_var2) {
                                                        error = Errors.handleThrowable(ccatch_env_var2, $catch_error_message_target$.getGlobalValue());
                                                    } finally {
                                                        thread.throwStack.pop();
                                                    }
                                                    if (NIL != error) {
                                                        $non_wff_error_list$.setGlobalValue(cons(assertion_handles.assertion_id(ass), $non_wff_error_list$.getGlobalValue()));
                                                        stream3 = NIL;
                                                        try {
                                                            stream3 = compatibility.open_text(filename, $APPEND);
                                                            if (!stream3.isStream()) {
                                                                Errors.error($str27$Unable_to_open__S, filename);
                                                            }
                                                            stream_$57 = stream3;
                                                            format(stream_$57, $str32$____error__S__S_, kb_utilities.hl_external_id_string(ass), error);
                                                        } finally {
                                                            _prev_bind_0_$62 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                _values5 = getValuesAsVector();
                                                                if (stream3.isStream()) {
                                                                    close(stream3, UNPROVIDED);
                                                                }
                                                                restoreValuesFromVector(_values5);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$62, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                $last_checked_assertion_id$.setGlobalValue(assertion_handles.assertion_id(ass));
                                                $num_assertions_checked$.setGlobalValue(add($num_assertions_checked$.getGlobalValue(), ONE_INTEGER));
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                        }
                                    }
                                    final SubLObject idx_$62 = idx_$60;
                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$62)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        final SubLObject sparse = id_index_sparse_objects(idx_$62);
                                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$62);
                                        final SubLObject end_id = id_index_next_id(idx_$62);
                                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                        while (a_id2.numL(end_id)) {
                                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                                if (assertion_handles.assertion_id(ass2).numGE(start_id)) {
                                                    $non_wff_current_assertion$.setDynamicValue(ass2, thread);
                                                    SubLObject error2 = NIL;
                                                    SubLObject timed_outP2 = NIL;
                                                    try {
                                                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                                                        final SubLObject _prev_bind_0_$63 = Errors.$error_handler$.currentBinding(thread);
                                                        try {
                                                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                                            try {
                                                                final SubLObject tag2 = with_timeout_make_tag();
                                                                try {
                                                                    thread.throwStack.push(tag2);
                                                                    final SubLObject _prev_bind_0_$64 = $within_with_timeout$.currentBinding(thread);
                                                                    try {
                                                                        $within_with_timeout$.bind(T, thread);
                                                                        SubLObject timer2 = NIL;
                                                                        try {
                                                                            final SubLObject _prev_bind_0_$65 = $with_timeout_nesting_depth$.currentBinding(thread);
                                                                            try {
                                                                                $with_timeout_nesting_depth$.bind(add(ONE_INTEGER, $with_timeout_nesting_depth$.getDynamicValue(thread)), thread);
                                                                                timer2 = with_timeout_start_timer($non_wff_outlier_timeout$.getDynamicValue(thread), tag2);
                                                                                if (NIL != assertion_not_wffP(ass2)) {
                                                                                    non_wff_enter(ass2, kb_version_string);
                                                                                    SubLObject stream4 = NIL;
                                                                                    try {
                                                                                        stream4 = compatibility.open_text(filename, $APPEND);
                                                                                        if (!stream4.isStream()) {
                                                                                            Errors.error($str27$Unable_to_open__S, filename);
                                                                                        }
                                                                                        final SubLObject stream_$58 = stream4;
                                                                                        format(stream_$58, $str30$____S__S_, kb_utilities.hl_external_id_string(ass2), kb_version_string);
                                                                                    } finally {
                                                                                        final SubLObject _prev_bind_0_$66 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                        try {
                                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                            final SubLObject _values6 = getValuesAsVector();
                                                                                            if (stream4.isStream()) {
                                                                                                close(stream4, UNPROVIDED);
                                                                                            }
                                                                                            restoreValuesFromVector(_values6);
                                                                                        } finally {
                                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$66, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                $with_timeout_nesting_depth$.rebind(_prev_bind_0_$65, thread);
                                                                            }
                                                                        } finally {
                                                                            final SubLObject _prev_bind_0_$67 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                final SubLObject _values7 = getValuesAsVector();
                                                                                with_timeout_stop_timer(timer2);
                                                                                restoreValuesFromVector(_values7);
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$67, thread);
                                                                            }
                                                                        }
                                                                    } finally {
                                                                        $within_with_timeout$.rebind(_prev_bind_0_$64, thread);
                                                                    }
                                                                } catch (final Throwable ccatch_env_var3) {
                                                                    timed_outP2 = Errors.handleThrowable(ccatch_env_var3, tag2);
                                                                } finally {
                                                                    thread.throwStack.pop();
                                                                }
                                                                if (NIL != timed_outP2) {
                                                                    Errors.error($str31$WFF_took_more_than__S_seconds_on_, $non_wff_outlier_timeout$.getDynamicValue(thread), ass2);
                                                                }
                                                            } catch (final Throwable catch_var2) {
                                                                Errors.handleThrowable(catch_var2, NIL);
                                                            }
                                                        } finally {
                                                            Errors.$error_handler$.rebind(_prev_bind_0_$63, thread);
                                                        }
                                                    } catch (final Throwable ccatch_env_var4) {
                                                        error2 = Errors.handleThrowable(ccatch_env_var4, $catch_error_message_target$.getGlobalValue());
                                                    } finally {
                                                        thread.throwStack.pop();
                                                    }
                                                    if (NIL != error2) {
                                                        $non_wff_error_list$.setGlobalValue(cons(assertion_handles.assertion_id(ass2), $non_wff_error_list$.getGlobalValue()));
                                                        SubLObject stream5 = NIL;
                                                        try {
                                                            stream5 = compatibility.open_text(filename, $APPEND);
                                                            if (!stream5.isStream()) {
                                                                Errors.error($str27$Unable_to_open__S, filename);
                                                            }
                                                            final SubLObject stream_$59 = stream5;
                                                            format(stream_$59, $str32$____error__S__S_, kb_utilities.hl_external_id_string(ass2), error2);
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values8 = getValuesAsVector();
                                                                if (stream5.isStream()) {
                                                                    close(stream5, UNPROVIDED);
                                                                }
                                                                restoreValuesFromVector(_values8);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                                                            }
                                                        }
                                                    }
                                                }
                                                $last_checked_assertion_id$.setGlobalValue(assertion_handles.assertion_id(ass2));
                                                $num_assertions_checked$.setGlobalValue(add($num_assertions_checked$.getGlobalValue(), ONE_INTEGER));
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            a_id2 = add(a_id2, ONE_INTEGER);
                                        } 
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$69 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values9 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values9);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_13, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_2_$59, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$58, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$56, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$70 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values10 = getValuesAsVector();
                            sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                            restoreValuesFromVector(_values10);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$70, thread);
                        }
                    }
                } finally {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_12, thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_11, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0_$55, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$71 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values11 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values11);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$71, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_10, thread);
        }
        $non_wff_end$.setGlobalValue(get_universal_time());
        SubLObject stream6 = NIL;
        try {
            stream6 = compatibility.open_text(filename, $APPEND);
            if (!stream6.isStream()) {
                Errors.error($str27$Unable_to_open__S, filename);
            }
            final SubLObject stream_$60 = stream6;
            format(stream_$60, $str33$____end_time__S_, $non_wff_end$.getGlobalValue());
        } finally {
            final SubLObject _prev_bind_14 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values12 = getValuesAsVector();
                if (stream6.isStream()) {
                    close(stream6, UNPROVIDED);
                }
                restoreValuesFromVector(_values12);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_14, thread);
            }
        }
        return $non_wff_store$.getDynamicValue(thread);
    }

    public static SubLObject initialize_non_wff_store_progress() {
        if (NIL == $non_wff_start$.getGlobalValue()) {
            return format(NIL, $str34$No_WFF_sweep_has_been_started_);
        }
        final SubLObject sofar = $num_assertions_checked$.getGlobalValue();
        final SubLObject total = assertion_handles.assertion_count();
        final SubLObject end_time = (NIL != $non_wff_end$.getGlobalValue()) ? $non_wff_end$.getGlobalValue() : get_universal_time();
        final SubLObject seconds_so_far = subtract(end_time, $non_wff_start$.getGlobalValue());
        final SubLObject predicted_total_seconds = truncate(multiply(seconds_so_far, divide(total, sofar)), UNPROVIDED);
        final SubLObject predicted_end = add($non_wff_start$.getGlobalValue(), predicted_total_seconds);
        return format(NIL, $str35$After__S___the_whole_KB_should_ta, new SubLObject[]{ number_utilities.significant_digits(multiply($int$100, divide(sofar, total)), THREE_INTEGER), number_utilities.significant_digits(divide(predicted_total_seconds, multiply($int$24, $int$60, $int$60)), TWO_INTEGER), numeric_date_utilities.time_abbreviation_string(predicted_end) });
    }

    public static SubLObject initialize_non_wff_store_to_file_startedP(final SubLObject filename) {
        return list_utilities.sublisp_boolean(Filesys.probe_file(filename));
    }

    public static SubLObject initialize_non_wff_store_to_file_completeP(final SubLObject filename) {
        return non_wff_store_file_value_for_record(filename, $END_TIME);
    }

    public static SubLObject non_wff_file_newerP(final SubLObject filename) {
        final SubLObject start_time = non_wff_store_file_value_for_record(filename, $START_TIME);
        if (!start_time.isInteger()) {
            return NIL;
        }
        if ($non_wff_start$.getGlobalValue().isInteger()) {
            return numG(start_time, $non_wff_start$.getGlobalValue());
        }
        return T;
    }

    public static SubLObject non_wff_store_file_value_for_record(final SubLObject filename, final SubLObject keyword) {
        SubLObject found = NIL;
        SubLObject value = NIL;
        if (NIL != initialize_non_wff_store_to_file_startedP(filename)) {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(filename, $INPUT);
                if (!stream.isStream()) {
                    Errors.error($str27$Unable_to_open__S, filename);
                }
                SubLObject instream;
                SubLObject item;
                for (instream = stream, item = NIL, item = read_ignoring_errors(instream, NIL, $EOF); (item != $EOF) && (NIL == found); item = read_ignoring_errors(instream, NIL, $EOF)) {
                    if (item.isCons() && item.first().eql(keyword)) {
                        found = T;
                        value = second(item);
                    }
                }
            } finally {
                final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                try {
                    bind($is_thread_performing_cleanupP$, T);
                    final SubLObject _values = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values);
                } finally {
                    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                }
            }
            return values(value, found);
        }
        return NIL;
    }

    public static SubLObject initialize_non_wff_store_from_non_wff_list() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clrhash($non_wff_store$.getDynamicValue(thread));
        final SubLObject list_var = $non_wff_list$.getGlobalValue();
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($str42$Converting__non_wff_list__to__non, thread);
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
                SubLObject id = NIL;
                id = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject assertion = assertion_handles.find_assertion_by_id(id);
                    if (NIL != assertion_handles.assertion_p(assertion)) {
                        non_wff_enter(assertion, UNPROVIDED);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    id = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
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
        return $non_wff_store$.getDynamicValue(thread);
    }

    public static SubLObject possibly_load_newer_non_wff_store() {
        final SubLObject filename = external_non_wff_store_filename();
        if ((NIL != non_wff_file_newerP(filename)) && (NIL != initialize_non_wff_store_to_file_completeP(filename))) {
            format(T, $str44$Loading_newer_non_wff_store_from_, filename);
            return non_wff_store_load_externalized(filename);
        }
        return NIL;
    }

    public static SubLObject external_non_wff_store_filename() {
        return file_utilities.cyc_home_filename($list45, $str46$non_wff_store, $$$text);
    }

    public static SubLObject non_wff_store_save_externalized(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str27$Unable_to_open__S, filename);
            }
            final SubLObject out = stream;
            format(out, $str48$______A, misc_utilities.copyright_notice());
            non_wff_store_save_preamble(out, $EXTERNAL);
            final SubLObject table_var = $non_wff_store$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str50$Saving_the_non_WFF_store_in_exter, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject internal_id = NIL;
                    SubLObject kb_version_string = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            internal_id = getEntryKey(cdohash_entry);
                            kb_version_string = getEntryValue(cdohash_entry);
                            final SubLObject assertion = assertion_handles.find_assertion_by_id(internal_id);
                            SubLObject external_id = NIL;
                            if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                external_id = kb_utilities.hl_external_id_string(assertion);
                            }
                            format(out, $str30$____S__S_, external_id, kb_version_string);
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
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
        } finally {
            final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return T;
    }

    public static SubLObject non_wff_store_save_internalized(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $OUTPUT);
            if (!stream.isStream()) {
                Errors.error($str27$Unable_to_open__S, filename);
            }
            final SubLObject out = stream;
            format(out, $str48$______A, misc_utilities.copyright_notice());
            non_wff_store_save_preamble(out, $INTERNAL);
            final SubLObject table_var = $non_wff_store$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $progress_note$.bind($str52$Saving_the_non_WFF_store_in_inter, thread);
                $progress_start_time$.bind(get_universal_time(), thread);
                $progress_total$.bind(hash_table_count(table_var), thread);
                $progress_sofar$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                    SubLObject internal_id = NIL;
                    SubLObject kb_version_string = NIL;
                    final Iterator cdohash_iterator = getEntrySetIterator(table_var);
                    try {
                        while (iteratorHasNext(cdohash_iterator)) {
                            final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                            internal_id = getEntryKey(cdohash_entry);
                            kb_version_string = getEntryValue(cdohash_entry);
                            final SubLObject assertion = assertion_handles.find_assertion_by_id(internal_id);
                            if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                format(out, $str30$____S__S_, internal_id, kb_version_string);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                        } 
                    } finally {
                        releaseEntrySetIterator(cdohash_iterator);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$85 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$85, thread);
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
        } finally {
            final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return T;
    }

    public static SubLObject non_wff_store_save_preamble(final SubLObject stream, final SubLObject format) {
        format(stream, $str53$____record_count__S_, non_wff_count());
        format(stream, $str28$____start_time__S_, $non_wff_start$.getGlobalValue());
        if (NIL != $non_wff_end$.getGlobalValue()) {
            format(stream, $str33$____end_time__S_, $non_wff_end$.getGlobalValue());
        }
        SubLObject cdolist_list_var = $non_wff_error_list$.getGlobalValue();
        SubLObject error_id = NIL;
        error_id = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (error_id.isInteger()) {
                if (format.eql($EXTERNAL)) {
                    format(stream, $str54$____error__S_, kb_utilities.hl_external_id_string(assertion_handles.find_assertion_by_id(error_id)));
                } else
                    if (format.eql($INTERNAL)) {
                        format(stream, $str54$____error__S_, error_id);
                    }

            } else {
                Errors.warn($str55$__Problem__NIL_assertion_ID_in_er);
            }
            cdolist_list_var = cdolist_list_var.rest();
            error_id = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject non_wff_store_load_externalized(final SubLObject filename) {
        return non_wff_store_load(filename);
    }

    public static SubLObject non_wff_store_load_internalized(final SubLObject filename) {
        return non_wff_store_load(filename);
    }

    public static SubLObject non_wff_store_load(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clrhash($non_wff_store$.getDynamicValue(thread));
        $non_wff_error_list$.setGlobalValue(NIL);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(filename, $INPUT);
            if (!stream.isStream()) {
                Errors.error($str27$Unable_to_open__S, filename);
            }
            final SubLObject instream = stream;
            final SubLObject length = file_length(instream);
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($str56$Loading_the_non_WFF_store);
                    SubLObject item = NIL;
                    SubLObject position = NIL;
                    item = read_ignoring_errors(instream, NIL, $EOF);
                    position = file_position(instream, UNPROVIDED);
                    while (item != $EOF) {
                        non_wff_store_process_item(item);
                        note_percent_progress(position, length);
                        item = read_ignoring_errors(instream, NIL, $EOF);
                        position = file_position(instream, UNPROVIDED);
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return $non_wff_store$.getDynamicValue(thread);
    }

    public static SubLObject non_wff_store_process_item(final SubLObject item) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (item.first() == $RECORD_COUNT) {
            $non_wff_count$.setDynamicValue(second(item), thread);
        } else
            if (item.first() == $START_TIME) {
                $non_wff_start$.setGlobalValue(second(item));
            } else
                if (item.first() == $END_TIME) {
                    $non_wff_end$.setGlobalValue(second(item));
                } else
                    if (item.first() == $ERROR) {
                        if (NIL != kb_utilities.hl_external_id_string_p(second(item))) {
                            final SubLObject assertion = kb_utilities.find_object_by_hl_external_id_string(second(item));
                            if (NIL != assertion_handles.assertion_p(assertion)) {
                                if (assertion_handles.assertion_id(assertion).isInteger()) {
                                    $non_wff_error_list$.setGlobalValue(cons(assertion_handles.assertion_id(assertion), $non_wff_error_list$.getGlobalValue()));
                                } else
                                    if (NIL != $non_wff_verboseP$.getDynamicValue(thread)) {
                                        Errors.warn($str59$The_assertion_with_this_external_, second(item));
                                    }

                            }
                        } else
                            if (NIL != assertion_handles.assertion_id_p(second(item))) {
                                final SubLObject assertion = assertion_handles.find_assertion_by_id(second(item));
                                if (NIL != assertion_handles.assertion_p(assertion)) {
                                    $non_wff_error_list$.setGlobalValue(cons(second(item), $non_wff_error_list$.getGlobalValue()));
                                }
                            }

                    } else
                        if (NIL != kb_utilities.hl_external_id_string_p(item.first())) {
                            final SubLObject assertion = kb_utilities.find_object_by_hl_external_id_string(item.first());
                            if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                non_wff_enter(assertion, second(item));
                            } else
                                if (NIL != $non_wff_verboseP$.getDynamicValue(thread)) {
                                    Errors.warn($str60$Assertions_with_HL_external_ID__S, item.first());
                                }

                        } else
                            if (NIL != assertion_handles.assertion_id_p(item.first())) {
                                final SubLObject assertion = assertion_handles.find_assertion_by_id(item.first());
                                if (NIL != assertions_high.valid_assertion(assertion, UNPROVIDED)) {
                                    non_wff_enter(assertion, second(item));
                                } else
                                    if (NIL != $non_wff_verboseP$.getDynamicValue(thread)) {
                                        Errors.warn($str61$Assertions_with_internal_ID__S_is, item.first());
                                    }

                            } else
                                if (NIL != $non_wff_verboseP$.getDynamicValue(thread)) {
                                    Errors.warn($str62$Record__S_is_an_unknown_type_, item);
                                }






        return NIL;
    }

    public static SubLObject wff_check_assertion(final SubLObject assertion) {
        final SubLObject sentence = uncanonicalizer.assertion_el_formula(assertion);
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject wffP = wff.el_wffP(sentence, mt, UNPROVIDED);
        if (NIL != wffP) {
            non_wff_remove(assertion);
        } else {
            non_wff_enter(assertion, UNPROVIDED);
        }
        return wffP;
    }

    public static SubLObject wff_check_assertions_via_tl(final SubLObject sentence, final SubLObject mt) {
        assert NIL != el_formula_p(sentence) : "el_utilities.el_formula_p(sentence) " + "CommonSymbols.NIL != el_utilities.el_formula_p(sentence) " + sentence;
        final SubLObject assertions = ke.find_assertions_via_tl(sentence, mt);
        SubLObject wffP = T;
        SubLObject cdolist_list_var = assertions;
        SubLObject assertion = NIL;
        assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == wff_check_assertion(assertion)) {
                wffP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            assertion = cdolist_list_var.first();
        } 
        return wffP;
    }

    public static SubLObject declare_wff_utilities_file() {
        declareFunction(me, "assertion_not_wffP", "ASSERTION-NOT-WFF?", 1, 0, false);
        declareFunction(me, "assertion_wffP", "ASSERTION-WFF?", 1, 0, false);
        declareFunction(me, "assertion_not_wff_assertibleP", "ASSERTION-NOT-WFF-ASSERTIBLE?", 1, 0, false);
        declareFunction(me, "assertion_wff_assertibleP", "ASSERTION-WFF-ASSERTIBLE?", 1, 0, false);
        declareFunction(me, "assertion_why_not_wff", "ASSERTION-WHY-NOT-WFF", 1, 0, false);
        declareFunction(me, "assertion_why_not_wff_assert", "ASSERTION-WHY-NOT-WFF-ASSERT", 1, 0, false);
        declareFunction(me, "set_dont_check_wff_semantics", "SET-DONT-CHECK-WFF-SEMANTICS", 0, 0, false);
        declareFunction(me, "set_check_wff_semantics", "SET-CHECK-WFF-SEMANTICS", 0, 0, false);
        declareFunction(me, "check_assertible_literalP", "CHECK-ASSERTIBLE-LITERAL?", 0, 0, false);
        declareFunction(me, "mal_mt_specP", "MAL-MT-SPEC?", 1, 0, false);
        declareFunction(me, "valid_mt_specP", "VALID-MT-SPEC?", 1, 0, false);
        declareFunction(me, "wf_fort_p", "WF-FORT-P", 1, 0, false);
        declareFunction(me, "non_wf_fort_p", "NON-WF-FORT-P", 1, 0, false);
        new wff_utilities.$non_wf_fort_p$UnaryFunction();
        declareFunction(me, "non_wf_variable_p", "NON-WF-VARIABLE-P", 1, 0, false);
        new wff_utilities.$non_wf_variable_p$UnaryFunction();
        declareFunction(me, "mal_variablesP", "MAL-VARIABLES?", 1, 0, false);
        declareFunction(me, "mal_variables", "MAL-VARIABLES", 1, 0, false);
        declareFunction(me, "non_wff_assertion_ids", "NON-WFF-ASSERTION-IDS", 0, 0, false);
        declareFunction(me, "number_of_assertions_wff_checked", "NUMBER-OF-ASSERTIONS-WFF-CHECKED", 0, 0, false);
        declareFunction(me, "last_wff_checked_assertion_id", "LAST-WFF-CHECKED-ASSERTION-ID", 0, 0, false);
        declareFunction(me, "non_wff_error", "NON-WFF-ERROR", 0, 0, false);
        declareFunction(me, "non_wffs_in_mts", "NON-WFFS-IN-MTS", 1, 1, false);
        declareFunction(me, "all_non_wff_assertion_ids", "ALL-NON-WFF-ASSERTION-IDS", 0, 1, false);
        declareFunction(me, "non_wff_assertion_ids_in_range", "NON-WFF-ASSERTION-IDS-IN-RANGE", 2, 0, false);
        declareFunction(me, "relevant_spec_mts", "RELEVANT-SPEC-MTS", 2, 0, false);
        declareFunction(me, "pre_num_wff", "PRE-NUM-WFF", 0, 0, false);
        declareFunction(me, "pre_num_not_wff", "PRE-NUM-NOT-WFF", 0, 0, false);
        declareFunction(me, "pre_percent_not_wff", "PRE-PERCENT-NOT-WFF", 0, 0, false);
        declareFunction(me, "post_num_wff", "POST-NUM-WFF", 0, 0, false);
        declareFunction(me, "post_num_not_wff", "POST-NUM-NOT-WFF", 0, 0, false);
        declareFunction(me, "post_percent_not_wff", "POST-PERCENT-NOT-WFF", 0, 0, false);
        declareFunction(me, "pre_wff_check_in_mts", "PRE-WFF-CHECK-IN-MTS", 1, 3, false);
        declareFunction(me, "post_wff_check_in_mts", "POST-WFF-CHECK-IN-MTS", 1, 3, false);
        declareFunction(me, "last_checked_id", "LAST-CHECKED-ID", 1, 0, false);
        declareFunction(me, "pre_post_deltas", "PRE-POST-DELTAS", 0, 1, false);
        declareFunction(me, "non_wff_cached_p", "NON-WFF-CACHED-P", 1, 0, false);
        declareFunction(me, "non_wff_enter", "NON-WFF-ENTER", 1, 1, false);
        declareFunction(me, "non_wff_remove", "NON-WFF-REMOVE", 1, 0, false);
        declareFunction(me, "non_wff_count", "NON-WFF-COUNT", 0, 0, false);
        declareFunction(me, "non_wff_in_what_kb", "NON-WFF-IN-WHAT-KB", 1, 0, false);
        declareFunction(me, "initialize_non_wff_store_to_file", "INITIALIZE-NON-WFF-STORE-TO-FILE", 1, 1, false);
        declareFunction(me, "initialize_non_wff_store_progress", "INITIALIZE-NON-WFF-STORE-PROGRESS", 0, 0, false);
        declareFunction(me, "initialize_non_wff_store_to_file_startedP", "INITIALIZE-NON-WFF-STORE-TO-FILE-STARTED?", 1, 0, false);
        declareFunction(me, "initialize_non_wff_store_to_file_completeP", "INITIALIZE-NON-WFF-STORE-TO-FILE-COMPLETE?", 1, 0, false);
        declareFunction(me, "non_wff_file_newerP", "NON-WFF-FILE-NEWER?", 1, 0, false);
        declareFunction(me, "non_wff_store_file_value_for_record", "NON-WFF-STORE-FILE-VALUE-FOR-RECORD", 2, 0, false);
        declareFunction(me, "initialize_non_wff_store_from_non_wff_list", "INITIALIZE-NON-WFF-STORE-FROM-NON-WFF-LIST", 0, 0, false);
        declareFunction(me, "possibly_load_newer_non_wff_store", "POSSIBLY-LOAD-NEWER-NON-WFF-STORE", 0, 0, false);
        declareFunction(me, "external_non_wff_store_filename", "EXTERNAL-NON-WFF-STORE-FILENAME", 0, 0, false);
        declareFunction(me, "non_wff_store_save_externalized", "NON-WFF-STORE-SAVE-EXTERNALIZED", 1, 0, false);
        declareFunction(me, "non_wff_store_save_internalized", "NON-WFF-STORE-SAVE-INTERNALIZED", 1, 0, false);
        declareFunction(me, "non_wff_store_save_preamble", "NON-WFF-STORE-SAVE-PREAMBLE", 2, 0, false);
        declareFunction(me, "non_wff_store_load_externalized", "NON-WFF-STORE-LOAD-EXTERNALIZED", 1, 0, false);
        declareFunction(me, "non_wff_store_load_internalized", "NON-WFF-STORE-LOAD-INTERNALIZED", 1, 0, false);
        declareFunction(me, "non_wff_store_load", "NON-WFF-STORE-LOAD", 1, 0, false);
        declareFunction(me, "non_wff_store_process_item", "NON-WFF-STORE-PROCESS-ITEM", 1, 0, false);
        declareFunction(me, "wff_check_assertion", "WFF-CHECK-ASSERTION", 1, 0, false);
        declareFunction(me, "wff_check_assertions_via_tl", "WFF-CHECK-ASSERTIONS-VIA-TL", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_wff_utilities_file() {
        defparameter("*CHECK-WFF-CONSTANTS?*", T);
        defparameter("*CHECK-WFF-SEMANTICS?*", T);
        defparameter("*CHECK-WFF-COHERENCE?*", NIL);
        defparameter("*CHECK-ARG-TYPES?*", T);
        defparameter("*CHECK-VAR-TYPES?*", T);
        defparameter("*CHECK-ARITY?*", T);
        defparameter("*USE-CYCL-GRAMMAR-IF-SEMANTIC-CHECKING-DISABLED?*", T);
        deflexical("*NON-WFF-LIST*", SubLTrampolineFile.maybeDefault($non_wff_list$, $non_wff_list$, NIL));
        deflexical("*NUM-ASSERTIONS-CHECKED*", SubLTrampolineFile.maybeDefault($num_assertions_checked$, $num_assertions_checked$, ZERO_INTEGER));
        deflexical("*LAST-CHECKED-ASSERTION-ID*", SubLTrampolineFile.maybeDefault($last_checked_assertion_id$, $last_checked_assertion_id$, ZERO_INTEGER));
        deflexical("*NON-WFF-ERROR*", SubLTrampolineFile.maybeDefault($non_wff_error$, $non_wff_error$, NIL));
        deflexical("*NON-WFF-ERROR-LIST*", SubLTrampolineFile.maybeDefault($non_wff_error_list$, $non_wff_error_list$, NIL));
        deflexical("*PRE-WFF-HASH*", SubLTrampolineFile.maybeDefault($pre_wff_hash$, $pre_wff_hash$, NIL));
        deflexical("*POST-WFF-HASH*", SubLTrampolineFile.maybeDefault($post_wff_hash$, $post_wff_hash$, NIL));
        defvar("*NON-WFF-STORE*", make_hash_table($int$2048, symbol_function(EQUAL), UNPROVIDED));
        deflexical("*NON-WFF-START*", SubLTrampolineFile.maybeDefault($non_wff_start$, $non_wff_start$, NIL));
        deflexical("*NON-WFF-END*", SubLTrampolineFile.maybeDefault($non_wff_end$, $non_wff_end$, NIL));
        defparameter("*NON-WFF-CURRENT-ASSERTION*", NIL);
        defparameter("*NON-WFF-OUTLIER-TIMEOUT*", $int$30);
        defparameter("*NON-WFF-COUNT*", NIL);
        defparameter("*NON-WFF-VERBOSE?*", NIL);
        return NIL;
    }

    public static SubLObject setup_wff_utilities_file() {
        declare_defglobal($non_wff_list$);
        declare_defglobal($num_assertions_checked$);
        declare_defglobal($last_checked_assertion_id$);
        declare_defglobal($non_wff_error$);
        declare_defglobal($non_wff_error_list$);
        declare_defglobal($pre_wff_hash$);
        declare_defglobal($post_wff_hash$);
        declare_defglobal($non_wff_start$);
        declare_defglobal($non_wff_end$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_wff_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_wff_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_wff_utilities_file();
    }

    

    public static final class $non_wf_fort_p$UnaryFunction extends UnaryFunction {
        public $non_wf_fort_p$UnaryFunction() {
            super(extractFunctionNamed("NON-WF-FORT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return non_wf_fort_p(arg1);
        }
    }

    public static final class $non_wf_variable_p$UnaryFunction extends UnaryFunction {
        public $non_wf_variable_p$UnaryFunction() {
            super(extractFunctionNamed("NON-WF-VARIABLE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return non_wf_variable_p(arg1);
        }
    }
}

/**
 * Total time: 2639 ms
 */
