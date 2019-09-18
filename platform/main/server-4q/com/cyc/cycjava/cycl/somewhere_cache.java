package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.cycjava.cycl.cfasl.cfasl_output;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$bootstrapping_kbP$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLSystemTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class somewhere_cache extends SubLTranslatedFile {
    public static final SubLFile me = new somewhere_cache();

    public static final String myName = "com.cyc.cycjava.cycl.somewhere_cache";

    public static final String myFingerPrint = "815f59def48f7ce2189ccc304dc7fc35e0ca26168d6f5b51cb255b31bed2674b";

    // defparameter
    public static final SubLSymbol $use_somewhere_cacheP$ = makeSymbol("*USE-SOMEWHERE-CACHE?*");

    // deflexical
    private static final SubLSymbol $somewhere_cached_preds_table$ = makeSymbol("*SOMEWHERE-CACHED-PREDS-TABLE*");





    // deflexical
    // For use by get-after-adding and get-after-removing
    public static final SubLSymbol $somewhere_cache_gaf_after_adding_info$ = makeSymbol("*SOMEWHERE-CACHE-GAF-AFTER-ADDING-INFO*");



    // Internal Constants
    public static final SubLList $list0 = cons(reader_make_constant_shell(makeString("argsIsa")), ONE_INTEGER);

    public static final SubLList $list1 = cons(reader_make_constant_shell(makeString("argAndRestIsa")), ONE_INTEGER);

    public static final SubLList $list2 = cons(reader_make_constant_shell(makeString("argAndRestGenl")), ONE_INTEGER);

    private static final SubLList $list3 = cons(reader_make_constant_shell(makeString("argsQuotedIsa")), ONE_INTEGER);

    private static final SubLList $list4 = cons(reader_make_constant_shell(makeString("argAndRestQuotedIsa")), ONE_INTEGER);

    private static final SubLList $list5 = cons(reader_make_constant_shell(makeString("arg1Genl")), ONE_INTEGER);

    private static final SubLList $list6 = cons(reader_make_constant_shell(makeString("arg2Genl")), ONE_INTEGER);

    private static final SubLList $list7 = cons(reader_make_constant_shell(makeString("arg3Genl")), ONE_INTEGER);

    private static final SubLList $list8 = cons(reader_make_constant_shell(makeString("arg4Genl")), ONE_INTEGER);

    private static final SubLList $list9 = cons(reader_make_constant_shell(makeString("arg5Genl")), ONE_INTEGER);

    public static final SubLList $list10 = cons(reader_make_constant_shell(makeString("arg6Genl")), ONE_INTEGER);

    private static final SubLList $list11 = cons(reader_make_constant_shell(makeString("arg1NotIsa")), ONE_INTEGER);

    public static final SubLList $list12 = cons(reader_make_constant_shell(makeString("arg2NotIsa")), ONE_INTEGER);

    private static final SubLList $list13 = cons(reader_make_constant_shell(makeString("arg3NotIsa")), ONE_INTEGER);

    private static final SubLList $list14 = cons(reader_make_constant_shell(makeString("arg4NotIsa")), ONE_INTEGER);

    private static final SubLList $list15 = cons(reader_make_constant_shell(makeString("arg5NotIsa")), ONE_INTEGER);

    private static final SubLList $list16 = cons(reader_make_constant_shell(makeString("arg6NotIsa")), ONE_INTEGER);

    private static final SubLList $list17 = cons(reader_make_constant_shell(makeString("arg1Format")), ONE_INTEGER);

    private static final SubLList $list18 = cons(reader_make_constant_shell(makeString("arg2Format")), ONE_INTEGER);

    private static final SubLList $list19 = cons(reader_make_constant_shell(makeString("arg3Format")), ONE_INTEGER);

    private static final SubLList $list20 = cons(reader_make_constant_shell(makeString("arg4Format")), ONE_INTEGER);

    private static final SubLList $list21 = cons(reader_make_constant_shell(makeString("arg5Format")), ONE_INTEGER);

    private static final SubLList $list22 = cons(reader_make_constant_shell(makeString("arg6Format")), ONE_INTEGER);

    private static final SubLList $list23 = cons(reader_make_constant_shell(makeString("arg1QuotedIsa")), ONE_INTEGER);

    private static final SubLList $list24 = cons(reader_make_constant_shell(makeString("arg2QuotedIsa")), ONE_INTEGER);

    private static final SubLList $list25 = cons(reader_make_constant_shell(makeString("arg3QuotedIsa")), ONE_INTEGER);

    private static final SubLList $list26 = cons(reader_make_constant_shell(makeString("arg4QuotedIsa")), ONE_INTEGER);

    private static final SubLList $list27 = cons(reader_make_constant_shell(makeString("arg5QuotedIsa")), ONE_INTEGER);

    private static final SubLList $list28 = cons(reader_make_constant_shell(makeString("arg6QuotedIsa")), ONE_INTEGER);

    private static final SubLObject $list29 = _constant_29_initializer();

    private static final SubLSymbol $some_pred_assertion_somewhere_cache$ = makeSymbol("*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*");



    private static final SubLSymbol $somewhere_cached_pred_argnum_dict$ = makeSymbol("*SOMEWHERE-CACHED-PRED-ARGNUM-DICT*");

    private static final SubLSymbol SOMEWHERE_CACHED_PRED_P = makeSymbol("SOMEWHERE-CACHED-PRED-P");

    private static final SubLSymbol $sym34$VALID_SOMEWHERE_CACHE_ITEM_ = makeSymbol("VALID-SOMEWHERE-CACHE-ITEM?");







    private static final SubLList $list38 = cons(makeSymbol("PRED"), makeSymbol("ARGNUM"));

    private static final SubLString $$$Initializing_all_somewhere_caches = makeString("Initializing all somewhere caches");

    private static final SubLList $list40 = cons(makeSymbol("RECACHE-SOME-PRED-ASSERTION-SOMEWHERE"), reader_make_constant_shell(makeString("UniversalVocabularyMt")));

    private static final SubLSymbol $sym41$GAF_ASSERTION_ = makeSymbol("GAF-ASSERTION?");

    private static final SubLSymbol $sym42$VALID_FORT_ = makeSymbol("VALID-FORT?");



    private static final SubLSymbol $inter_arg_result_isa_somewhere_cache$ = makeSymbol("*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*");

    private static final SubLObject $$interArgResultIsa = reader_make_constant_shell(makeString("interArgResultIsa"));

    private static final SubLString $str46$somewhere_cache_argnum_mismatch_f = makeString("somewhere-cache argnum mismatch for ~s: ~s vs. ~s");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));





    public static SubLObject some_pred_assertion_somewhereP(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        assert NIL != somewhere_cached_pred_p(pred) : "somewhere_cache.somewhere_cached_pred_p(pred) " + "CommonSymbols.NIL != somewhere_cache.somewhere_cached_pred_p(pred) " + pred;
        assert NIL != valid_somewhere_cache_itemP(v_term) : "somewhere_cache.valid_somewhere_cache_itemP(v_term) " + "CommonSymbols.NIL != somewhere_cache.valid_somewhere_cache_itemP(v_term) " + v_term;
        final SubLObject pcase_var = some_pred_assertion_somewhereP_internal(pred, v_term, argnum, initialize_if_uninitializedP);
        if (pcase_var.eql($YES)) {
            return T;
        }
        if (pcase_var.eql($NO)) {
            return NIL;
        }
        if (pcase_var.eql($MAYBE)) {
            check_somewhere_cache_argnum(pred, argnum, UNPROVIDED);
            return NIL;
        }
        return NIL;
    }

    public static SubLObject maybe_some_pred_assertion_somewhereP(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        return makeBoolean((NIL == somewhere_cached_pred_p(pred)) || ($NO != some_pred_assertion_somewhereP_internal(pred, v_term, argnum, initialize_if_uninitializedP)));
    }

    public static SubLObject possibly_initialize_all_somewhere_caches(SubLObject robustP) {
        if (robustP == UNPROVIDED) {
            robustP = T;
        }
        if (NIL != misc_utilities.uninitialized_p($some_pred_assertion_somewhere_cache$.getGlobalValue())) {
            return initialize_all_somewhere_caches();
        }
        if (NIL != robustP) {
            SubLObject cdolist_list_var = $somewhere_cached_preds_table$.getGlobalValue();
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject pred = NIL;
                SubLObject argnum = NIL;
                destructuring_bind_must_consp(current, datum, $list38);
                pred = current.first();
                current = argnum = current.rest();
                if (NIL == forts.invalid_fortP(pred)) {
                    lookup_somewhere_set_for_pred(pred, T);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject initialize_all_somewhere_caches() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        initialize_somewhere_cached_pred_argnum_dict();
        clear_all_somewhere_caches();
        final SubLObject total_pred_count = length($somewhere_cached_preds_table$.getGlobalValue());
        SubLObject count = ZERO_INTEGER;
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
                noting_percent_progress_preamble($$$Initializing_all_somewhere_caches);
                SubLObject cdolist_list_var = $somewhere_cached_preds_table$.getGlobalValue();
                SubLObject cons = NIL;
                cons = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject pred = NIL;
                    SubLObject argnum = NIL;
                    destructuring_bind_must_consp(current, datum, $list38);
                    pred = current.first();
                    current = argnum = current.rest();
                    if (NIL == forts.invalid_fortP(pred)) {
                        count = add(count, set.set_size(initialize_somewhere_cache(pred)));
                    }
                    note_percent_progress(count, total_pred_count);
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }

    public static SubLObject clear_all_somewhere_caches() {
        $some_pred_assertion_somewhere_cache$.setGlobalValue(dictionary.new_dictionary(symbol_function(EQL), length($somewhere_cached_preds_table$.getGlobalValue())));
        return ZERO_INTEGER;
    }

    public static SubLObject possibly_initialize_somewhere_cached_pred_argnum_dict() {
        if (NIL != misc_utilities.uninitialized_p($somewhere_cached_pred_argnum_dict$.getGlobalValue())) {
            return initialize_somewhere_cached_pred_argnum_dict();
        }
        return NIL;
    }

    public static SubLObject initialize_somewhere_cached_pred_argnum_dict() {
        $somewhere_cached_pred_argnum_dict$.setGlobalValue(dictionary_utilities.new_dictionary_from_alist($somewhere_cached_preds_table$.getGlobalValue(), symbol_function(EQL)));
        return dictionary.dictionary_length($somewhere_cached_pred_argnum_dict$.getGlobalValue());
    }

    public static SubLObject reclassify_somewhere_cached_preds() {
        return initialize_somewhere_cached_pred_argnum_dict();
    }

    public static SubLObject recache_some_pred_assertion_somewhere(final SubLObject argument, final SubLObject assertion) {
        assert NIL != assertions_high.gaf_assertionP(assertion) : "assertions_high.gaf_assertionP(assertion) " + "CommonSymbols.NIL != assertions_high.gaf_assertionP(assertion) " + assertion;
        final SubLObject pred = assertions_high.gaf_predicate(assertion);
        final SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
        final SubLObject arg = assertions_high.gaf_arg(assertion, argnum);
        assert NIL != somewhere_cached_pred_p(pred) : "somewhere_cache.somewhere_cached_pred_p(pred) " + "CommonSymbols.NIL != somewhere_cache.somewhere_cached_pred_p(pred) " + pred;
        if (NIL != valid_somewhere_cache_itemP(arg)) {
            recache_some_pred_assertion_somewhere_int(pred, arg);
        }
        return NIL;
    }

    public static SubLObject somewhere_cached_preds() {
        possibly_initialize_somewhere_cached_pred_argnum_dict();
        return dictionary.dictionary_keys($somewhere_cached_pred_argnum_dict$.getGlobalValue());
    }

    public static SubLObject valid_somewhere_cached_preds() {
        return list_utilities.remove_if_not($sym42$VALID_FORT_, somewhere_cached_preds(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject somewhere_cached_pred_p(final SubLObject v_object) {
        possibly_initialize_somewhere_cached_pred_argnum_dict();
        SubLObject result = dictionary_utilities.dictionary_has_keyP($somewhere_cached_pred_argnum_dict$.getGlobalValue(), v_object);
        if ((NIL == result) && (NIL != assoc(v_object, $somewhere_cached_preds_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            initialize_somewhere_cached_pred_argnum_dict();
            result = T;
        }
        return result;
    }

    public static SubLObject valid_somewhere_cached_pred_p(final SubLObject v_object) {
        return makeBoolean((NIL != forts.valid_fortP(v_object)) && (NIL != somewhere_cached_pred_p(v_object)));
    }

    public static SubLObject some_pred_assertion_somewhere_argnum(final SubLObject pred) {
        possibly_initialize_somewhere_cached_pred_argnum_dict();
        SubLObject result = dictionary.dictionary_lookup_without_values($somewhere_cached_pred_argnum_dict$.getGlobalValue(), pred, UNPROVIDED);
        if ((NIL == result) && (NIL != assoc(pred, $somewhere_cached_preds_table$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            initialize_somewhere_cached_pred_argnum_dict();
            result = dictionary.dictionary_lookup_without_values($somewhere_cached_pred_argnum_dict$.getGlobalValue(), pred, UNPROVIDED);
        }
        return result;
    }

    public static SubLObject indexed_terms_with_some_pred_assertion_somewhere(final SubLObject pred, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        assert NIL != forts.fort_p(pred) : "forts.fort_p(pred) " + "CommonSymbols.NIL != forts.fort_p(pred) " + pred;
        final SubLObject v_set = lookup_somewhere_set_for_pred(pred, initialize_if_uninitializedP);
        return set.set_element_list(v_set);
    }

    public static SubLObject inter_arg_result_isa_somewhere_cache(final SubLObject initialize_if_uninitializedP) {
        if (NIL != misc_utilities.uninitialized_p($inter_arg_result_isa_somewhere_cache$.getGlobalValue())) {
            $inter_arg_result_isa_somewhere_cache$.setGlobalValue(lookup_somewhere_set_for_pred($$interArgResultIsa, initialize_if_uninitializedP));
        }
        return $inter_arg_result_isa_somewhere_cache$.getGlobalValue();
    }

    public static SubLObject inter_arg_result_isa_somewhereP(final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == UNPROVIDED) {
            initialize_if_uninitializedP = T;
        }
        check_somewhere_cache_argnum($$interArgResultIsa, argnum, ONE_INTEGER);
        final SubLObject v_set = inter_arg_result_isa_somewhere_cache(initialize_if_uninitializedP);
        return set.set_memberP(v_term, v_set);
    }

    public static SubLObject use_somewhere_cacheP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $use_somewhere_cacheP$.getDynamicValue(thread);
    }

    public static SubLObject some_pred_assertion_somewhereP_internal(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, final SubLObject initialize_if_uninitializedP) {
        final SubLObject cached_argnum = some_pred_assertion_somewhere_argnum(pred);
        SubLObject ans = $MAYBE;
        if ((NIL != use_somewhere_cacheP()) && argnum.eql(cached_argnum)) {
            final SubLObject v_set = lookup_somewhere_set_for_pred(pred, initialize_if_uninitializedP);
            ans = (NIL != set.set_memberP(v_term, v_set)) ? $YES : $NO;
        }
        return ans;
    }

    public static SubLObject check_somewhere_cache_argnum(final SubLObject pred, final SubLObject argnum, SubLObject cached_argnum) {
        if (cached_argnum == UNPROVIDED) {
            cached_argnum = some_pred_assertion_somewhere_argnum(pred);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!argnum.eql(cached_argnum))) {
            Errors.error($str46$somewhere_cache_argnum_mismatch_f, pred, argnum, cached_argnum);
        }
        return NIL;
    }

    public static SubLObject lookup_somewhere_set_for_pred(final SubLObject pred, final SubLObject initialize_if_uninitializedP) {
        SubLObject v_set = dictionary.dictionary_lookup_without_values($some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, NIL);
        if ((NIL != initialize_if_uninitializedP) && (NIL == v_set)) {
            v_set = initialize_somewhere_cache(pred);
        }
        return v_set;
    }

    public static SubLObject initialize_somewhere_cache(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject estimated_size = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
        final SubLObject v_set = set.new_set(symbol_function(EQL), estimated_size);
        if ((NIL != $bootstrapping_kbP$.getDynamicValue(thread)) || (NIL != forts.valid_fortP(pred))) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
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
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
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
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(gaf));
                                        if (NIL != valid_$6) {
                                            cache_some_pred_assertion_somewhere(v_set, gaf);
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
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
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            dictionary.dictionary_enter($some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, v_set);
        }
        return v_set;
    }

    public static SubLObject recache_some_pred_assertion_somewhere_int(final SubLObject pred, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = lookup_somewhere_set_for_pred(pred, T);
        set.set_remove(v_term, v_set);
        SubLObject done = NIL;
        final SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
        final SubLObject _prev_bind_0 = $use_somewhere_cacheP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            $use_somewhere_cacheP$.bind(NIL, thread);
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred);
                SubLObject done_var = done;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$8 = done;
                            final SubLObject token_var_$9 = NIL;
                            while (NIL == done_var_$8) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                                final SubLObject valid_$10 = makeBoolean(!token_var_$9.eql(gaf));
                                if (NIL != valid_$10) {
                                    done = cache_some_pred_assertion_somewhere(v_set, gaf);
                                }
                                done_var_$8 = makeBoolean((NIL == valid_$10) || (NIL != done));
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                    }
                    done_var = makeBoolean((NIL == valid) || (NIL != done));
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            $use_somewhere_cacheP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != done) {
            return T;
        }
        return NIL;
    }

    public static SubLObject cache_some_pred_assertion_somewhere(final SubLObject v_set, final SubLObject gaf) {
        if (NIL != kb_accessors.assertion_still_thereP(gaf, $TRUE)) {
            final SubLObject mt = assertions_high.assertion_mt(gaf);
            if (NIL != hlmt.hlmt_p(mt)) {
                final SubLObject pred = assertions_high.gaf_predicate(gaf);
                final SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
                final SubLObject arg = assertions_high.gaf_arg(gaf, argnum);
                if (NIL != valid_somewhere_cache_itemP(arg)) {
                    set.set_add(arg, v_set);
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject valid_somewhere_cache_itemP(final SubLObject v_object) {
        return cycl_utilities.reified_term_p(v_object);
    }

    public static SubLObject somewhere_cache_unbuiltP() {
        return makeBoolean((NIL == dictionary.dictionary_p($some_pred_assertion_somewhere_cache$.getGlobalValue())) || (NIL != dictionary.dictionary_empty_p($some_pred_assertion_somewhere_cache$.getGlobalValue())));
    }

    public static SubLObject rebuild_somewhere_cache() {
        return initialize_all_somewhere_caches();
    }

    public static SubLObject dump_somewhere_cache_to_stream(final SubLObject stream) {
        cfasl_output($some_pred_assertion_somewhere_cache$.getGlobalValue(), stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        cfasl_output(NIL, stream);
        return NIL;
    }

    public static SubLObject load_somewhere_cache_from_stream(final SubLObject stream) {
        SubLObject dummy = NIL;
        $some_pred_assertion_somewhere_cache$.setGlobalValue(cfasl_input(stream, UNPROVIDED, UNPROVIDED));
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        dummy = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject declare_somewhere_cache_file() {
        declareFunction(me, "some_pred_assertion_somewhereP", "SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
        declareFunction(me, "maybe_some_pred_assertion_somewhereP", "MAYBE-SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
        declareFunction(me, "possibly_initialize_all_somewhere_caches", "POSSIBLY-INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 1, false);
        declareFunction(me, "initialize_all_somewhere_caches", "INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 0, false);
        declareFunction(me, "clear_all_somewhere_caches", "CLEAR-ALL-SOMEWHERE-CACHES", 0, 0, false);
        declareFunction(me, "possibly_initialize_somewhere_cached_pred_argnum_dict", "POSSIBLY-INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT", 0, 0, false);
        declareFunction(me, "initialize_somewhere_cached_pred_argnum_dict", "INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT", 0, 0, false);
        declareFunction(me, "reclassify_somewhere_cached_preds", "RECLASSIFY-SOMEWHERE-CACHED-PREDS", 0, 0, false);
        declareFunction(me, "recache_some_pred_assertion_somewhere", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
        declareFunction(me, "somewhere_cached_preds", "SOMEWHERE-CACHED-PREDS", 0, 0, false);
        declareFunction(me, "valid_somewhere_cached_preds", "VALID-SOMEWHERE-CACHED-PREDS", 0, 0, false);
        declareFunction(me, "somewhere_cached_pred_p", "SOMEWHERE-CACHED-PRED-P", 1, 0, false);
        declareFunction(me, "valid_somewhere_cached_pred_p", "VALID-SOMEWHERE-CACHED-PRED-P", 1, 0, false);
        declareFunction(me, "some_pred_assertion_somewhere_argnum", "SOME-PRED-ASSERTION-SOMEWHERE-ARGNUM", 1, 0, false);
        declareFunction(me, "indexed_terms_with_some_pred_assertion_somewhere", "INDEXED-TERMS-WITH-SOME-PRED-ASSERTION-SOMEWHERE", 1, 1, false);
        declareFunction(me, "inter_arg_result_isa_somewhere_cache", "INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE", 1, 0, false);
        declareFunction(me, "inter_arg_result_isa_somewhereP", "INTER-ARG-RESULT-ISA-SOMEWHERE?", 2, 1, false);
        declareFunction(me, "use_somewhere_cacheP", "USE-SOMEWHERE-CACHE?", 0, 0, false);
        declareFunction(me, "some_pred_assertion_somewhereP_internal", "SOME-PRED-ASSERTION-SOMEWHERE?-INTERNAL", 4, 0, false);
        declareFunction(me, "check_somewhere_cache_argnum", "CHECK-SOMEWHERE-CACHE-ARGNUM", 2, 1, false);
        declareFunction(me, "lookup_somewhere_set_for_pred", "LOOKUP-SOMEWHERE-SET-FOR-PRED", 2, 0, false);
        declareFunction(me, "initialize_somewhere_cache", "INITIALIZE-SOMEWHERE-CACHE", 1, 0, false);
        declareFunction(me, "recache_some_pred_assertion_somewhere_int", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE-INT", 2, 0, false);
        declareFunction(me, "cache_some_pred_assertion_somewhere", "CACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
        declareFunction(me, "valid_somewhere_cache_itemP", "VALID-SOMEWHERE-CACHE-ITEM?", 1, 0, false);
        declareFunction(me, "somewhere_cache_unbuiltP", "SOMEWHERE-CACHE-UNBUILT?", 0, 0, false);
        declareFunction(me, "rebuild_somewhere_cache", "REBUILD-SOMEWHERE-CACHE", 0, 0, false);
        declareFunction(me, "dump_somewhere_cache_to_stream", "DUMP-SOMEWHERE-CACHE-TO-STREAM", 1, 0, false);
        declareFunction(me, "load_somewhere_cache_from_stream", "LOAD-SOMEWHERE-CACHE-FROM-STREAM", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_somewhere_cache_file() {
        defparameter("*USE-SOMEWHERE-CACHE?*", T);
        deflexical("*SOMEWHERE-CACHED-PREDS-TABLE*", listS($list0, new SubLObject[]{ $list1, $list2, $list3, $list4, $list5, $list6, $list7, $list8, $list9, $list10, $list11, $list12, $list13, $list14, $list15, $list16, $list17, $list18, $list19, $list20, $list21, $list22, $list23, $list24, $list25, $list26, $list27, $list28, bq_cons(kb_control_vars.$backchain_forbidden_unless_arg_chosen$.getGlobalValue(), ONE_INTEGER), $list29 }));
        deflexical("*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*", SubLSystemTrampolineFile.maybeDefault($some_pred_assertion_somewhere_cache$, $some_pred_assertion_somewhere_cache$, $UNINITIALIZED));
        deflexical("*SOMEWHERE-CACHED-PRED-ARGNUM-DICT*", SubLSystemTrampolineFile.maybeDefault($somewhere_cached_pred_argnum_dict$, $somewhere_cached_pred_argnum_dict$, $UNINITIALIZED));
        deflexical("*SOMEWHERE-CACHE-GAF-AFTER-ADDING-INFO*", $list40);
        deflexical("*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*", SubLSystemTrampolineFile.maybeDefault($inter_arg_result_isa_somewhere_cache$, $inter_arg_result_isa_somewhere_cache$, () -> misc_utilities.uninitialized()));
        return NIL;
    }

    public static SubLObject setup_somewhere_cache_file() {
        declare_defglobal($some_pred_assertion_somewhere_cache$);
        declare_defglobal($somewhere_cached_pred_argnum_dict$);
        declare_defglobal($inter_arg_result_isa_somewhere_cache$);
        return NIL;
    }

    private static SubLObject _constant_29_initializer() {
        return list(new SubLObject[]{ cons(reader_make_constant_shell(makeString("backchainRequired")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("canonicalizerDirectiveForArg")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("canonicalizerDirectiveForAllArgs")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("canonicalizerDirectiveForArgAndRest")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("evaluateAtEL")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("evaluateImmediately")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("genlPreds")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("typedGenlPreds")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("genlInverse")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("functionCorrespondingPredicate")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("functionCorrespondingPredicate-Canonical")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("highlyRelevantTerm")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgResultIsa")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgResultGenl")), THREE_INTEGER), cons(reader_make_constant_shell(makeString("interArgGenl1-2")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgGenl2-1")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgGenl2-4")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotGenl1-2")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgIsaGenl1-2")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgIsaGenl2-1")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgIsaGenl2-3")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgIsaGenl3-2")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgGenlIsa2-1")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgDifferent")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgReln")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("irrelevantTerm")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("modalInArg")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("notAssertible")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("relationAllExists")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("relationAllInstance")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("relationInstanceAll")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("rewriteOf")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("scopingArg")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("skolemizeForward")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("typeLevelVersionInArg")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("relationAllExistsCount")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("relationAllExistsMany")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("relationAllExistsMin")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("relationAllExistsUnique")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("relationAllExistsSame")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("relationAllExistsAndOnly")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("reflexiveOn")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("requiredActorSlots-Unique")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("collRelation")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("collRelationUnique")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("requiredActorSlots")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("rolesForEventType")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("keRequirementPreds")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("roleTypesForEventType")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("requiredArg1Pred")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("preferredSubjectRole")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("subjectRoles")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("preferredIndirectObjectRole")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("indirectObjectRoles")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("preferredDirectObjectRole")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("directObjectRoles")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("posForms")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("posBaseForms")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("mtTimeIndex")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("genStringAssertion-Terse")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("genStringAssertion-Precise")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("genStringAssertion")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("dispreferredLexification")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("predTrivialForJustificationParaphrase")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("assertionTrivialForJustificationParaphrase")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("ruleTrivialForJustificationParaphrase")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("mtTrivialForJustificationParaphrase")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("ruleTrivialForSentenceImplicationConditions")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("salientTermImagePathname")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("formulaTemplateHasArgumentPositionInformation")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("except")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("exceptMt")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("assertiveWFFRule")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("forwardReificationRule")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("universalForwardReificationRule")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotIsa1-2")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotIsa1-3")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotIsa1-4")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotIsa1-5")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotIsa2-1")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotIsa2-3")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotIsa2-4")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotIsa2-5")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotIsa3-4")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotIsa3-5")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("interArgNotIsa4-5")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("singleEntryFormatInArgs")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("wffConstraintMt")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("completeExtentAsserted")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("completeExtentAssertedForValueInArg")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("completeExtentEnumerable")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("completeExtentEnumerableForArg")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("completeExtentEnumerableForValueInArg")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("completeExtentDecidable")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("completeExtentDecidableForValueInArg")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("transitiveViaArg")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("transitiveViaArgInverse")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("conservativeViaArg")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("conservativeViaArgInverse")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("functionalInArgs")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("strictlyFunctionalInArgs")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("parsingConflateTo")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("qaConflateTo")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("qaConflateToCompletely")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("terseDisambiguationString")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("denotation")), FOUR_INTEGER), cons(reader_make_constant_shell(makeString("headMedialString")), FIVE_INTEGER), cons(reader_make_constant_shell(makeString("compoundString")), FOUR_INTEGER), cons(reader_make_constant_shell(makeString("hyphenString")), FOUR_INTEGER), cons(reader_make_constant_shell(makeString("multiWordString")), FOUR_INTEGER), cons(reader_make_constant_shell(makeString("preferredNameString")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("nameString")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("placeName-WithRegion")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("placeName-WithRegionAbbreviation")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("titleOfWork")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("movieTitleString")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("gospelName-Short")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("brandNameOfProductType")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("businessName-WithTickerSymbol")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("organizationName-Standard")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("organizationName-Official")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("familyName")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("lastName")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("placeName-ShortForm")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("countryName-ShortForm")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("placeName-Standard")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("countryName-LongForm")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("chemicalFormulaString")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("fullName")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("alias")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("definiteDescriptions")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("acronymString")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("initialismString")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("initialsString")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("pseudonym")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("countryCodeTrigraph")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("atomicSymbol")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("codeMapping")), THREE_INTEGER), cons(reader_make_constant_shell(makeString("applicableWhenTypedOnlyWhenSpecialization")), THREE_INTEGER), cons(reader_make_constant_shell(makeString("mostNotableIsa")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("mostNotableGenls")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("facetOfCollectionBasedOnBinaryPred")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("facetOfCollectionBasedOnBinaryPredInverse")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("facetOfCollectionBasedOnTypeBinaryPred")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("facetOfCollectionBasedOnTypeBinaryPredInverse")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("teamSeed")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("denotesArgInReln")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("classificationSystemOf-Focally")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("genlMt-Vocabulary")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("marketTypeDefiningProductType")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("collectionDifference")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("characteristicActivityTypeOfPersonType-Frequently")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("medicalFindingTypeOfType")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("medicalDiagnosisTypeOfType")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("suppressFacetInstancesFromTaxonomy")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("quantifiedBinaryPredicateForPredWithMacro")), THREE_INTEGER), cons(reader_make_constant_shell(makeString("verbSemTransTemplate")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("evaluationTypeDirectEvalueeType")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("allSubCollectionsAreInstancesOf")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("typeDeterminesValueOfArgInReln")), THREE_INTEGER), cons(reader_make_constant_shell(makeString("hypothesisLevelStrategyForPredAndArgs")), TWO_INTEGER), cons(reader_make_constant_shell(makeString("sourceFixedSemanticValueForRelationArg")), THREE_INTEGER), cons(reader_make_constant_shell(makeString("genlRules")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("disallowMeaningSentencesForUnboundPredicates")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("hypotheticalTerm")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("predNotAllowedInGeneralizedQueryForTheSetOf")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("decontextualizedPredicate")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("decontextualizedCollection")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("predicateConventionMt")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("collectionConventionMt")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("quotedArgument")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("inverseFunctions")), ONE_INTEGER), cons(reader_make_constant_shell(makeString("genlPredsWRTArgs")), TWO_INTEGER) });
    }

    @Override
    public void declareFunctions() {
        declare_somewhere_cache_file();
    }

    @Override
    public void initializeVariables() {
        init_somewhere_cache_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_somewhere_cache_file();
    }

    
}

/**
 * Total time: 266 ms
 */
