package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class somewhere_cache extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.somewhere_cache";
    public static final String myFingerPrint = "815f59def48f7ce2189ccc304dc7fc35e0ca26168d6f5b51cb255b31bed2674b";
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 1597L)
    public static SubLSymbol $use_somewhere_cacheP$;
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 1765L)
    private static SubLSymbol $somewhere_cached_preds_table$;
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 9863L)
    private static SubLSymbol $some_pred_assertion_somewhere_cache$;
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 10248L)
    private static SubLSymbol $somewhere_cached_pred_argnum_dict$;
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 14724L)
    public static SubLSymbol $somewhere_cache_gaf_after_adding_info$;
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 17502L)
    private static SubLSymbol $inter_arg_result_isa_somewhere_cache$;
    private static final SubLList $list0;
    private static final SubLList $list1;
    private static final SubLList $list2;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLList $list8;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLList $list13;
    private static final SubLList $list14;
    private static final SubLList $list15;
    private static final SubLList $list16;
    private static final SubLList $list17;
    private static final SubLList $list18;
    private static final SubLList $list19;
    private static final SubLList $list20;
    private static final SubLList $list21;
    private static final SubLList $list22;
    private static final SubLList $list23;
    private static final SubLList $list24;
    private static final SubLList $list25;
    private static final SubLList $list26;
    private static final SubLList $list27;
    private static final SubLList $list28;
    private static final SubLObject $list29;
    private static final SubLSymbol $sym30$_SOME_PRED_ASSERTION_SOMEWHERE_CACHE_;
    private static final SubLSymbol $kw31$UNINITIALIZED;
    private static final SubLSymbol $sym32$_SOMEWHERE_CACHED_PRED_ARGNUM_DICT_;
    private static final SubLSymbol $sym33$SOMEWHERE_CACHED_PRED_P;
    private static final SubLSymbol $sym34$VALID_SOMEWHERE_CACHE_ITEM_;
    private static final SubLSymbol $kw35$YES;
    private static final SubLSymbol $kw36$NO;
    private static final SubLSymbol $kw37$MAYBE;
    private static final SubLList $list38;
    private static final SubLString $str39$Initializing_all_somewhere_caches;
    private static final SubLList $list40;
    private static final SubLSymbol $sym41$GAF_ASSERTION_;
    private static final SubLSymbol $sym42$VALID_FORT_;
    private static final SubLSymbol $sym43$FORT_P;
    private static final SubLSymbol $sym44$_INTER_ARG_RESULT_ISA_SOMEWHERE_CACHE_;
    private static final SubLObject $const45$interArgResultIsa;
    private static final SubLString $str46$somewhere_cache_argnum_mismatch_f;
    private static final SubLSymbol $sym47$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const48$EverythingPSC;
    private static final SubLSymbol $kw49$GAF;
    private static final SubLSymbol $kw50$TRUE;
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 10447L)
    public static SubLObject some_pred_assertion_somewhereP(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == somewhere_cache.UNPROVIDED) {
            initialize_if_uninitializedP = (SubLObject)somewhere_cache.T;
        }
        assert somewhere_cache.NIL != somewhere_cached_pred_p(pred) : pred;
        assert somewhere_cache.NIL != valid_somewhere_cache_itemP(v_term) : v_term;
        final SubLObject pcase_var = some_pred_assertion_somewhereP_internal(pred, v_term, argnum, initialize_if_uninitializedP);
        if (pcase_var.eql((SubLObject)somewhere_cache.$kw35$YES)) {
            return (SubLObject)somewhere_cache.T;
        }
        if (pcase_var.eql((SubLObject)somewhere_cache.$kw36$NO)) {
            return (SubLObject)somewhere_cache.NIL;
        }
        if (pcase_var.eql((SubLObject)somewhere_cache.$kw37$MAYBE)) {
            check_somewhere_cache_argnum(pred, argnum, (SubLObject)somewhere_cache.UNPROVIDED);
            return (SubLObject)somewhere_cache.NIL;
        }
        return (SubLObject)somewhere_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 11992L)
    public static SubLObject maybe_some_pred_assertion_somewhereP(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == somewhere_cache.UNPROVIDED) {
            initialize_if_uninitializedP = (SubLObject)somewhere_cache.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(somewhere_cache.NIL == somewhere_cached_pred_p(pred) || somewhere_cache.$kw36$NO != some_pred_assertion_somewhereP_internal(pred, v_term, argnum, initialize_if_uninitializedP));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 12744L)
    public static SubLObject possibly_initialize_all_somewhere_caches(SubLObject robustP) {
        if (robustP == somewhere_cache.UNPROVIDED) {
            robustP = (SubLObject)somewhere_cache.T;
        }
        if (somewhere_cache.NIL != misc_utilities.uninitialized_p(somewhere_cache.$some_pred_assertion_somewhere_cache$.getGlobalValue())) {
            return initialize_all_somewhere_caches();
        }
        if (somewhere_cache.NIL != robustP) {
            SubLObject cdolist_list_var = somewhere_cache.$somewhere_cached_preds_table$.getGlobalValue();
            SubLObject cons = (SubLObject)somewhere_cache.NIL;
            cons = cdolist_list_var.first();
            while (somewhere_cache.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject pred = (SubLObject)somewhere_cache.NIL;
                SubLObject argnum = (SubLObject)somewhere_cache.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)somewhere_cache.$list38);
                pred = current.first();
                current = (argnum = current.rest());
                if (somewhere_cache.NIL == forts.invalid_fortP(pred)) {
                    lookup_somewhere_set_for_pred(pred, (SubLObject)somewhere_cache.T);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
            }
        }
        return (SubLObject)somewhere_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 13334L)
    public static SubLObject initialize_all_somewhere_caches() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        initialize_somewhere_cached_pred_argnum_dict();
        clear_all_somewhere_caches();
        final SubLObject total_pred_count = Sequences.length(somewhere_cache.$somewhere_cached_preds_table$.getGlobalValue());
        SubLObject count = (SubLObject)somewhere_cache.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)somewhere_cache.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)somewhere_cache.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)somewhere_cache.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble((SubLObject)somewhere_cache.$str39$Initializing_all_somewhere_caches);
                SubLObject cdolist_list_var = somewhere_cache.$somewhere_cached_preds_table$.getGlobalValue();
                SubLObject cons = (SubLObject)somewhere_cache.NIL;
                cons = cdolist_list_var.first();
                while (somewhere_cache.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = cons;
                    SubLObject pred = (SubLObject)somewhere_cache.NIL;
                    SubLObject argnum = (SubLObject)somewhere_cache.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)somewhere_cache.$list38);
                    pred = current.first();
                    current = (argnum = current.rest());
                    if (somewhere_cache.NIL == forts.invalid_fortP(pred)) {
                        count = Numbers.add(count, set.set_size(initialize_somewhere_cache(pred)));
                    }
                    utilities_macros.note_percent_progress(count, total_pred_count);
                    cdolist_list_var = cdolist_list_var.rest();
                    cons = cdolist_list_var.first();
                }
            }
            finally {
                final SubLObject _prev_bind_0_$1 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)somewhere_cache.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 13979L)
    public static SubLObject clear_all_somewhere_caches() {
        somewhere_cache.$some_pred_assertion_somewhere_cache$.setGlobalValue(dictionary.new_dictionary(Symbols.symbol_function((SubLObject)somewhere_cache.EQL), Sequences.length(somewhere_cache.$somewhere_cached_preds_table$.getGlobalValue())));
        return (SubLObject)somewhere_cache.ZERO_INTEGER;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 14147L)
    public static SubLObject possibly_initialize_somewhere_cached_pred_argnum_dict() {
        if (somewhere_cache.NIL != misc_utilities.uninitialized_p(somewhere_cache.$somewhere_cached_pred_argnum_dict$.getGlobalValue())) {
            return initialize_somewhere_cached_pred_argnum_dict();
        }
        return (SubLObject)somewhere_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 14355L)
    public static SubLObject initialize_somewhere_cached_pred_argnum_dict() {
        somewhere_cache.$somewhere_cached_pred_argnum_dict$.setGlobalValue(dictionary_utilities.new_dictionary_from_alist(somewhere_cache.$somewhere_cached_preds_table$.getGlobalValue(), Symbols.symbol_function((SubLObject)somewhere_cache.EQL)));
        return dictionary.dictionary_length(somewhere_cache.$somewhere_cached_pred_argnum_dict$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 14612L)
    public static SubLObject reclassify_somewhere_cached_preds() {
        return initialize_somewhere_cached_pred_argnum_dict();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 14910L)
    public static SubLObject recache_some_pred_assertion_somewhere(final SubLObject argument, final SubLObject assertion) {
        assert somewhere_cache.NIL != assertions_high.gaf_assertionP(assertion) : assertion;
        final SubLObject pred = assertions_high.gaf_predicate(assertion);
        final SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
        final SubLObject arg = assertions_high.gaf_arg(assertion, argnum);
        assert somewhere_cache.NIL != somewhere_cached_pred_p(pred) : pred;
        if (somewhere_cache.NIL != valid_somewhere_cache_itemP(arg)) {
            recache_some_pred_assertion_somewhere_int(pred, arg);
        }
        return (SubLObject)somewhere_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 15580L)
    public static SubLObject somewhere_cached_preds() {
        possibly_initialize_somewhere_cached_pred_argnum_dict();
        return dictionary.dictionary_keys(somewhere_cache.$somewhere_cached_pred_argnum_dict$.getGlobalValue());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 15743L)
    public static SubLObject valid_somewhere_cached_preds() {
        return list_utilities.remove_if_not((SubLObject)somewhere_cache.$sym42$VALID_FORT_, somewhere_cached_preds(), (SubLObject)somewhere_cache.UNPROVIDED, (SubLObject)somewhere_cache.UNPROVIDED, (SubLObject)somewhere_cache.UNPROVIDED, (SubLObject)somewhere_cache.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 15854L)
    public static SubLObject somewhere_cached_pred_p(final SubLObject v_object) {
        possibly_initialize_somewhere_cached_pred_argnum_dict();
        SubLObject result = dictionary_utilities.dictionary_has_keyP(somewhere_cache.$somewhere_cached_pred_argnum_dict$.getGlobalValue(), v_object);
        if (somewhere_cache.NIL == result && somewhere_cache.NIL != conses_high.assoc(v_object, somewhere_cache.$somewhere_cached_preds_table$.getGlobalValue(), (SubLObject)somewhere_cache.UNPROVIDED, (SubLObject)somewhere_cache.UNPROVIDED)) {
            initialize_somewhere_cached_pred_argnum_dict();
            result = (SubLObject)somewhere_cache.T;
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 16222L)
    public static SubLObject valid_somewhere_cached_pred_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(somewhere_cache.NIL != forts.valid_fortP(v_object) && somewhere_cache.NIL != somewhere_cached_pred_p(v_object));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 16353L)
    public static SubLObject some_pred_assertion_somewhere_argnum(final SubLObject pred) {
        possibly_initialize_somewhere_cached_pred_argnum_dict();
        SubLObject result = dictionary.dictionary_lookup_without_values(somewhere_cache.$somewhere_cached_pred_argnum_dict$.getGlobalValue(), pred, (SubLObject)somewhere_cache.UNPROVIDED);
        if (somewhere_cache.NIL == result && somewhere_cache.NIL != conses_high.assoc(pred, somewhere_cache.$somewhere_cached_preds_table$.getGlobalValue(), (SubLObject)somewhere_cache.UNPROVIDED, (SubLObject)somewhere_cache.UNPROVIDED)) {
            initialize_somewhere_cached_pred_argnum_dict();
            result = dictionary.dictionary_lookup_without_values(somewhere_cache.$somewhere_cached_pred_argnum_dict$.getGlobalValue(), pred, (SubLObject)somewhere_cache.UNPROVIDED);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 16815L)
    public static SubLObject indexed_terms_with_some_pred_assertion_somewhere(final SubLObject pred, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == somewhere_cache.UNPROVIDED) {
            initialize_if_uninitializedP = (SubLObject)somewhere_cache.T;
        }
        assert somewhere_cache.NIL != forts.fort_p(pred) : pred;
        final SubLObject v_set = lookup_somewhere_set_for_pred(pred, initialize_if_uninitializedP);
        return set.set_element_list(v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 17770L)
    public static SubLObject inter_arg_result_isa_somewhere_cache(final SubLObject initialize_if_uninitializedP) {
        if (somewhere_cache.NIL != misc_utilities.uninitialized_p(somewhere_cache.$inter_arg_result_isa_somewhere_cache$.getGlobalValue())) {
            somewhere_cache.$inter_arg_result_isa_somewhere_cache$.setGlobalValue(lookup_somewhere_set_for_pred(somewhere_cache.$const45$interArgResultIsa, initialize_if_uninitializedP));
        }
        return somewhere_cache.$inter_arg_result_isa_somewhere_cache$.getGlobalValue();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 18102L)
    public static SubLObject inter_arg_result_isa_somewhereP(final SubLObject v_term, final SubLObject argnum, SubLObject initialize_if_uninitializedP) {
        if (initialize_if_uninitializedP == somewhere_cache.UNPROVIDED) {
            initialize_if_uninitializedP = (SubLObject)somewhere_cache.T;
        }
        check_somewhere_cache_argnum(somewhere_cache.$const45$interArgResultIsa, argnum, (SubLObject)somewhere_cache.ONE_INTEGER);
        final SubLObject v_set = inter_arg_result_isa_somewhere_cache(initialize_if_uninitializedP);
        return set.set_memberP(v_term, v_set);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 18388L)
    public static SubLObject use_somewhere_cacheP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return somewhere_cache.$use_somewhere_cacheP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 18463L)
    public static SubLObject some_pred_assertion_somewhereP_internal(final SubLObject pred, final SubLObject v_term, final SubLObject argnum, final SubLObject initialize_if_uninitializedP) {
        final SubLObject cached_argnum = some_pred_assertion_somewhere_argnum(pred);
        SubLObject ans = (SubLObject)somewhere_cache.$kw37$MAYBE;
        if (somewhere_cache.NIL != use_somewhere_cacheP() && argnum.eql(cached_argnum)) {
            final SubLObject v_set = lookup_somewhere_set_for_pred(pred, initialize_if_uninitializedP);
            ans = (SubLObject)((somewhere_cache.NIL != set.set_memberP(v_term, v_set)) ? somewhere_cache.$kw35$YES : somewhere_cache.$kw36$NO);
        }
        return ans;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 18979L)
    public static SubLObject check_somewhere_cache_argnum(final SubLObject pred, final SubLObject argnum, SubLObject cached_argnum) {
        if (cached_argnum == somewhere_cache.UNPROVIDED) {
            cached_argnum = some_pred_assertion_somewhere_argnum(pred);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (somewhere_cache.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !argnum.eql(cached_argnum)) {
            Errors.error((SubLObject)somewhere_cache.$str46$somewhere_cache_argnum_mismatch_f, pred, argnum, cached_argnum);
        }
        return (SubLObject)somewhere_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 19236L)
    public static SubLObject lookup_somewhere_set_for_pred(final SubLObject pred, final SubLObject initialize_if_uninitializedP) {
        SubLObject v_set = dictionary.dictionary_lookup_without_values(somewhere_cache.$some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, (SubLObject)somewhere_cache.NIL);
        if (somewhere_cache.NIL != initialize_if_uninitializedP && somewhere_cache.NIL == v_set) {
            v_set = initialize_somewhere_cache(pred);
        }
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 19640L)
    public static SubLObject initialize_somewhere_cache(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject estimated_size = kb_indexing.num_predicate_extent_index(pred, (SubLObject)somewhere_cache.UNPROVIDED);
        final SubLObject v_set = set.new_set(Symbols.symbol_function((SubLObject)somewhere_cache.EQL), estimated_size);
        if (somewhere_cache.NIL != control_vars.$bootstrapping_kbP$.getDynamicValue(thread) || somewhere_cache.NIL != forts.valid_fortP(pred)) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)somewhere_cache.$sym47$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(somewhere_cache.$const48$EverythingPSC, thread);
                if (somewhere_cache.NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                    final SubLObject str = (SubLObject)somewhere_cache.NIL;
                    final SubLObject _prev_bind_0_$2 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        utilities_macros.$progress_notification_count$.bind((SubLObject)somewhere_cache.ZERO_INTEGER, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)somewhere_cache.ZERO_INTEGER, thread);
                        utilities_macros.$progress_count$.bind((SubLObject)somewhere_cache.ZERO_INTEGER, thread);
                        utilities_macros.$is_noting_progressP$.bind((SubLObject)somewhere_cache.T, thread);
                        utilities_macros.$silent_progressP$.bind((SubLObject)((somewhere_cache.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : somewhere_cache.T), thread);
                        utilities_macros.noting_progress_preamble(str);
                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred);
                        SubLObject done_var = (SubLObject)somewhere_cache.NIL;
                        final SubLObject token_var = (SubLObject)somewhere_cache.NIL;
                        while (somewhere_cache.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (somewhere_cache.NIL != valid) {
                                utilities_macros.note_progress();
                                SubLObject final_index_iterator = (SubLObject)somewhere_cache.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)somewhere_cache.$kw49$GAF, (SubLObject)somewhere_cache.$kw50$TRUE, (SubLObject)somewhere_cache.NIL);
                                    SubLObject done_var_$4 = (SubLObject)somewhere_cache.NIL;
                                    final SubLObject token_var_$5 = (SubLObject)somewhere_cache.NIL;
                                    while (somewhere_cache.NIL == done_var_$4) {
                                        final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$5.eql(gaf));
                                        if (somewhere_cache.NIL != valid_$6) {
                                            cache_some_pred_assertion_somewhere(v_set, gaf);
                                        }
                                        done_var_$4 = (SubLObject)SubLObjectFactory.makeBoolean(somewhere_cache.NIL == valid_$6);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$3 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)somewhere_cache.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (somewhere_cache.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(somewhere_cache.NIL == valid);
                        }
                        utilities_macros.noting_progress_postamble();
                    }
                    finally {
                        utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                        utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                        utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                        utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                        utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
            dictionary.dictionary_enter(somewhere_cache.$some_pred_assertion_somewhere_cache$.getGlobalValue(), pred, v_set);
        }
        return v_set;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 20095L)
    public static SubLObject recache_some_pred_assertion_somewhere_int(final SubLObject pred, final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = lookup_somewhere_set_for_pred(pred, (SubLObject)somewhere_cache.T);
        set.set_remove(v_term, v_set);
        SubLObject done = (SubLObject)somewhere_cache.NIL;
        final SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
        final SubLObject _prev_bind_0 = somewhere_cache.$use_somewhere_cacheP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            somewhere_cache.$use_somewhere_cacheP$.bind((SubLObject)somewhere_cache.NIL, thread);
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)somewhere_cache.$sym47$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(somewhere_cache.$const48$EverythingPSC, thread);
            if (somewhere_cache.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred);
                SubLObject done_var = done;
                final SubLObject token_var = (SubLObject)somewhere_cache.NIL;
                while (somewhere_cache.NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                    if (somewhere_cache.NIL != valid) {
                        SubLObject final_index_iterator = (SubLObject)somewhere_cache.NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)somewhere_cache.$kw49$GAF, (SubLObject)somewhere_cache.$kw50$TRUE, (SubLObject)somewhere_cache.NIL);
                            SubLObject done_var_$8 = done;
                            final SubLObject token_var_$9 = (SubLObject)somewhere_cache.NIL;
                            while (somewhere_cache.NIL == done_var_$8) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$9);
                                final SubLObject valid_$10 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$9.eql(gaf));
                                if (somewhere_cache.NIL != valid_$10) {
                                    done = cache_some_pred_assertion_somewhere(v_set, gaf);
                                }
                                done_var_$8 = (SubLObject)SubLObjectFactory.makeBoolean(somewhere_cache.NIL == valid_$10 || somewhere_cache.NIL != done);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$11 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)somewhere_cache.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                if (somewhere_cache.NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                            }
                        }
                    }
                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(somewhere_cache.NIL == valid || somewhere_cache.NIL != done);
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            somewhere_cache.$use_somewhere_cacheP$.rebind(_prev_bind_0, thread);
        }
        if (somewhere_cache.NIL != done) {
            return (SubLObject)somewhere_cache.T;
        }
        return (SubLObject)somewhere_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 20617L)
    public static SubLObject cache_some_pred_assertion_somewhere(final SubLObject v_set, final SubLObject gaf) {
        if (somewhere_cache.NIL != kb_accessors.assertion_still_thereP(gaf, (SubLObject)somewhere_cache.$kw50$TRUE)) {
            final SubLObject mt = assertions_high.assertion_mt(gaf);
            if (somewhere_cache.NIL != hlmt.hlmt_p(mt)) {
                final SubLObject pred = assertions_high.gaf_predicate(gaf);
                final SubLObject argnum = some_pred_assertion_somewhere_argnum(pred);
                final SubLObject arg = assertions_high.gaf_arg(gaf, argnum);
                if (somewhere_cache.NIL != valid_somewhere_cache_itemP(arg)) {
                    set.set_add(arg, v_set);
                    return (SubLObject)somewhere_cache.T;
                }
            }
        }
        return (SubLObject)somewhere_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 21228L)
    public static SubLObject valid_somewhere_cache_itemP(final SubLObject v_object) {
        return cycl_utilities.reified_term_p(v_object);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 21474L)
    public static SubLObject somewhere_cache_unbuiltP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(somewhere_cache.NIL == dictionary.dictionary_p(somewhere_cache.$some_pred_assertion_somewhere_cache$.getGlobalValue()) || somewhere_cache.NIL != dictionary.dictionary_empty_p(somewhere_cache.$some_pred_assertion_somewhere_cache$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 21687L)
    public static SubLObject rebuild_somewhere_cache() {
        return initialize_all_somewhere_caches();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 21776L)
    public static SubLObject dump_somewhere_cache_to_stream(final SubLObject stream) {
        cfasl.cfasl_output(somewhere_cache.$some_pred_assertion_somewhere_cache$.getGlobalValue(), stream);
        cfasl.cfasl_output((SubLObject)somewhere_cache.NIL, stream);
        cfasl.cfasl_output((SubLObject)somewhere_cache.NIL, stream);
        cfasl.cfasl_output((SubLObject)somewhere_cache.NIL, stream);
        return (SubLObject)somewhere_cache.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/somewhere-cache.lisp", position = 22081L)
    public static SubLObject load_somewhere_cache_from_stream(final SubLObject stream) {
        SubLObject dummy = (SubLObject)somewhere_cache.NIL;
        somewhere_cache.$some_pred_assertion_somewhere_cache$.setGlobalValue(cfasl.cfasl_input(stream, (SubLObject)somewhere_cache.UNPROVIDED, (SubLObject)somewhere_cache.UNPROVIDED));
        dummy = cfasl.cfasl_input(stream, (SubLObject)somewhere_cache.UNPROVIDED, (SubLObject)somewhere_cache.UNPROVIDED);
        dummy = cfasl.cfasl_input(stream, (SubLObject)somewhere_cache.UNPROVIDED, (SubLObject)somewhere_cache.UNPROVIDED);
        dummy = cfasl.cfasl_input(stream, (SubLObject)somewhere_cache.UNPROVIDED, (SubLObject)somewhere_cache.UNPROVIDED);
        return (SubLObject)somewhere_cache.NIL;
    }
    
    public static SubLObject declare_somewhere_cache_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "some_pred_assertion_somewhereP", "SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "maybe_some_pred_assertion_somewhereP", "MAYBE-SOME-PRED-ASSERTION-SOMEWHERE?", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "possibly_initialize_all_somewhere_caches", "POSSIBLY-INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "initialize_all_somewhere_caches", "INITIALIZE-ALL-SOMEWHERE-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "clear_all_somewhere_caches", "CLEAR-ALL-SOMEWHERE-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "possibly_initialize_somewhere_cached_pred_argnum_dict", "POSSIBLY-INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "initialize_somewhere_cached_pred_argnum_dict", "INITIALIZE-SOMEWHERE-CACHED-PRED-ARGNUM-DICT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "reclassify_somewhere_cached_preds", "RECLASSIFY-SOMEWHERE-CACHED-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "recache_some_pred_assertion_somewhere", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "somewhere_cached_preds", "SOMEWHERE-CACHED-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "valid_somewhere_cached_preds", "VALID-SOMEWHERE-CACHED-PREDS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "somewhere_cached_pred_p", "SOMEWHERE-CACHED-PRED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "valid_somewhere_cached_pred_p", "VALID-SOMEWHERE-CACHED-PRED-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "some_pred_assertion_somewhere_argnum", "SOME-PRED-ASSERTION-SOMEWHERE-ARGNUM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "indexed_terms_with_some_pred_assertion_somewhere", "INDEXED-TERMS-WITH-SOME-PRED-ASSERTION-SOMEWHERE", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "inter_arg_result_isa_somewhere_cache", "INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "inter_arg_result_isa_somewhereP", "INTER-ARG-RESULT-ISA-SOMEWHERE?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "use_somewhere_cacheP", "USE-SOMEWHERE-CACHE?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "some_pred_assertion_somewhereP_internal", "SOME-PRED-ASSERTION-SOMEWHERE?-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "check_somewhere_cache_argnum", "CHECK-SOMEWHERE-CACHE-ARGNUM", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "lookup_somewhere_set_for_pred", "LOOKUP-SOMEWHERE-SET-FOR-PRED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "initialize_somewhere_cache", "INITIALIZE-SOMEWHERE-CACHE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "recache_some_pred_assertion_somewhere_int", "RECACHE-SOME-PRED-ASSERTION-SOMEWHERE-INT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "cache_some_pred_assertion_somewhere", "CACHE-SOME-PRED-ASSERTION-SOMEWHERE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "valid_somewhere_cache_itemP", "VALID-SOMEWHERE-CACHE-ITEM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "somewhere_cache_unbuiltP", "SOMEWHERE-CACHE-UNBUILT?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "rebuild_somewhere_cache", "REBUILD-SOMEWHERE-CACHE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "dump_somewhere_cache_to_stream", "DUMP-SOMEWHERE-CACHE-TO-STREAM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.somewhere_cache", "load_somewhere_cache_from_stream", "LOAD-SOMEWHERE-CACHE-FROM-STREAM", 1, 0, false);
        return (SubLObject)somewhere_cache.NIL;
    }
    
    public static SubLObject init_somewhere_cache_file() {
        somewhere_cache.$use_somewhere_cacheP$ = SubLFiles.defparameter("*USE-SOMEWHERE-CACHE?*", (SubLObject)somewhere_cache.T);
        somewhere_cache.$somewhere_cached_preds_table$ = SubLFiles.deflexical("*SOMEWHERE-CACHED-PREDS-TABLE*", (SubLObject)ConsesLow.listS((SubLObject)somewhere_cache.$list0, new SubLObject[] { somewhere_cache.$list1, somewhere_cache.$list2, somewhere_cache.$list3, somewhere_cache.$list4, somewhere_cache.$list5, somewhere_cache.$list6, somewhere_cache.$list7, somewhere_cache.$list8, somewhere_cache.$list9, somewhere_cache.$list10, somewhere_cache.$list11, somewhere_cache.$list12, somewhere_cache.$list13, somewhere_cache.$list14, somewhere_cache.$list15, somewhere_cache.$list16, somewhere_cache.$list17, somewhere_cache.$list18, somewhere_cache.$list19, somewhere_cache.$list20, somewhere_cache.$list21, somewhere_cache.$list22, somewhere_cache.$list23, somewhere_cache.$list24, somewhere_cache.$list25, somewhere_cache.$list26, somewhere_cache.$list27, somewhere_cache.$list28, reader.bq_cons(kb_control_vars.$backchain_forbidden_unless_arg_chosen$.getGlobalValue(), (SubLObject)somewhere_cache.ONE_INTEGER), somewhere_cache.$list29 }));
        somewhere_cache.$some_pred_assertion_somewhere_cache$ = SubLFiles.deflexical("*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*", (SubLObject)(maybeDefault((SubLObject)somewhere_cache.$sym30$_SOME_PRED_ASSERTION_SOMEWHERE_CACHE_, somewhere_cache.$some_pred_assertion_somewhere_cache$, somewhere_cache.$kw31$UNINITIALIZED)));
        somewhere_cache.$somewhere_cached_pred_argnum_dict$ = SubLFiles.deflexical("*SOMEWHERE-CACHED-PRED-ARGNUM-DICT*", (SubLObject)(maybeDefault((SubLObject)somewhere_cache.$sym32$_SOMEWHERE_CACHED_PRED_ARGNUM_DICT_, somewhere_cache.$somewhere_cached_pred_argnum_dict$, somewhere_cache.$kw31$UNINITIALIZED)));
        somewhere_cache.$somewhere_cache_gaf_after_adding_info$ = SubLFiles.deflexical("*SOMEWHERE-CACHE-GAF-AFTER-ADDING-INFO*", (SubLObject)somewhere_cache.$list40);
        somewhere_cache.$inter_arg_result_isa_somewhere_cache$ = SubLFiles.deflexical("*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*", maybeDefault((SubLObject)somewhere_cache.$sym44$_INTER_ARG_RESULT_ISA_SOMEWHERE_CACHE_, somewhere_cache.$inter_arg_result_isa_somewhere_cache$, ()->(misc_utilities.uninitialized())));
        return (SubLObject)somewhere_cache.NIL;
    }
    
    public static SubLObject setup_somewhere_cache_file() {
        subl_macro_promotions.declare_defglobal((SubLObject)somewhere_cache.$sym30$_SOME_PRED_ASSERTION_SOMEWHERE_CACHE_);
        subl_macro_promotions.declare_defglobal((SubLObject)somewhere_cache.$sym32$_SOMEWHERE_CACHED_PRED_ARGNUM_DICT_);
        subl_macro_promotions.declare_defglobal((SubLObject)somewhere_cache.$sym44$_INTER_ARG_RESULT_ISA_SOMEWHERE_CACHE_);
        return (SubLObject)somewhere_cache.NIL;
    }
    
    private static SubLObject _constant_29_initializer() {
        return (SubLObject)ConsesLow.list(new SubLObject[] { ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("backchainRequired")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArg")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForAllArgs")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("canonicalizerDirectiveForArgAndRest")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluateAtEL")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluateImmediately")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPreds")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typedGenlPreds")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlInverse")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionCorrespondingPredicate")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionCorrespondingPredicate-Canonical")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("highlyRelevantTerm")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgResultIsa")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgResultGenl")), (SubLObject)somewhere_cache.THREE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgGenl1-2")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgGenl2-1")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgGenl2-4")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotGenl1-2")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl1-2")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl2-1")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl2-3")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgIsaGenl3-2")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgGenlIsa2-1")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgDifferent")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgReln")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("irrelevantTerm")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("modalInArg")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("notAssertible")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExists")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllInstance")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationInstanceAll")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rewriteOf")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("scopingArg")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("skolemizeForward")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeLevelVersionInArg")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsCount")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsMany")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsMin")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsUnique")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsSame")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("relationAllExistsAndOnly")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("reflexiveOn")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("requiredActorSlots-Unique")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("collRelation")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("collRelationUnique")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("requiredActorSlots")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rolesForEventType")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("keRequirementPreds")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("roleTypesForEventType")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("requiredArg1Pred")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredSubjectRole")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("subjectRoles")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredIndirectObjectRole")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indirectObjectRoles")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredDirectObjectRole")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("directObjectRoles")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posForms")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("posBaseForms")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTimeIndex")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Terse")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion-Precise")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genStringAssertion")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("dispreferredLexification")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("predTrivialForJustificationParaphrase")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertionTrivialForJustificationParaphrase")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ruleTrivialForJustificationParaphrase")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mtTrivialForJustificationParaphrase")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ruleTrivialForSentenceImplicationConditions")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("salientTermImagePathname")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("formulaTemplateHasArgumentPositionInformation")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("except")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("exceptMt")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("assertiveWFFRule")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("forwardReificationRule")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("universalForwardReificationRule")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-2")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-3")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-4")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa1-5")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-1")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-3")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-4")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa2-5")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa3-4")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa3-5")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgNotIsa4-5")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("singleEntryFormatInArgs")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("wffConstraintMt")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("completeExtentAsserted")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("completeExtentAssertedForValueInArg")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("completeExtentEnumerable")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("completeExtentEnumerableForArg")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("completeExtentEnumerableForValueInArg")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("completeExtentDecidable")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("completeExtentDecidableForValueInArg")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArg")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("transitiveViaArgInverse")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conservativeViaArg")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("conservativeViaArgInverse")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("functionalInArgs")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("strictlyFunctionalInArgs")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("parsingConflateTo")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("qaConflateTo")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("qaConflateToCompletely")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("terseDisambiguationString")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotation")), (SubLObject)somewhere_cache.FOUR_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("headMedialString")), (SubLObject)somewhere_cache.FIVE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("compoundString")), (SubLObject)somewhere_cache.FOUR_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hyphenString")), (SubLObject)somewhere_cache.FOUR_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("multiWordString")), (SubLObject)somewhere_cache.FOUR_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("preferredNameString")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("nameString")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("placeName-WithRegion")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("placeName-WithRegionAbbreviation")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("titleOfWork")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("movieTitleString")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("gospelName-Short")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("brandNameOfProductType")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("businessName-WithTickerSymbol")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("organizationName-Standard")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("organizationName-Official")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("familyName")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("lastName")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("placeName-ShortForm")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryName-ShortForm")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("placeName-Standard")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryName-LongForm")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("chemicalFormulaString")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fullName")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("alias")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("definiteDescriptions")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("acronymString")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("initialismString")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("initialsString")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("pseudonym")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("countryCodeTrigraph")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("atomicSymbol")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("codeMapping")), (SubLObject)somewhere_cache.THREE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("applicableWhenTypedOnlyWhenSpecialization")), (SubLObject)somewhere_cache.THREE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mostNotableIsa")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("mostNotableGenls")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facetOfCollectionBasedOnBinaryPred")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facetOfCollectionBasedOnBinaryPredInverse")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facetOfCollectionBasedOnTypeBinaryPred")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("facetOfCollectionBasedOnTypeBinaryPredInverse")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("teamSeed")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("denotesArgInReln")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("classificationSystemOf-Focally")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt-Vocabulary")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("marketTypeDefiningProductType")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("collectionDifference")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("characteristicActivityTypeOfPersonType-Frequently")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("medicalFindingTypeOfType")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("medicalDiagnosisTypeOfType")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("suppressFacetInstancesFromTaxonomy")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quantifiedBinaryPredicateForPredWithMacro")), (SubLObject)somewhere_cache.THREE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("verbSemTransTemplate")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("evaluationTypeDirectEvalueeType")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("allSubCollectionsAreInstancesOf")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("typeDeterminesValueOfArgInReln")), (SubLObject)somewhere_cache.THREE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hypothesisLevelStrategyForPredAndArgs")), (SubLObject)somewhere_cache.TWO_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("sourceFixedSemanticValueForRelationArg")), (SubLObject)somewhere_cache.THREE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlRules")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("disallowMeaningSentencesForUnboundPredicates")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("hypotheticalTerm")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("predNotAllowedInGeneralizedQueryForTheSetOf")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decontextualizedPredicate")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("decontextualizedCollection")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("predicateConventionMt")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("collectionConventionMt")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedArgument")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("inverseFunctions")), (SubLObject)somewhere_cache.ONE_INTEGER), ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlPredsWRTArgs")), (SubLObject)somewhere_cache.TWO_INTEGER) });
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
    
    static {
        me = (SubLFile)new somewhere_cache();
        somewhere_cache.$use_somewhere_cacheP$ = null;
        somewhere_cache.$somewhere_cached_preds_table$ = null;
        somewhere_cache.$some_pred_assertion_somewhere_cache$ = null;
        somewhere_cache.$somewhere_cached_pred_argnum_dict$ = null;
        somewhere_cache.$somewhere_cache_gaf_after_adding_info$ = null;
        somewhere_cache.$inter_arg_result_isa_somewhere_cache$ = null;
        $list0 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list1 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list2 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestGenl")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list3 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argsQuotedIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list4 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("argAndRestQuotedIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list5 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Genl")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list6 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Genl")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list7 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Genl")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list8 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Genl")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list9 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Genl")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list10 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6Genl")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list11 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1NotIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list12 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2NotIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list13 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3NotIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list14 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4NotIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list15 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5NotIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list16 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6NotIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list17 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1Format")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list18 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2Format")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list19 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3Format")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list20 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4Format")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list21 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5Format")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list22 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6Format")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list23 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg1QuotedIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list24 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg2QuotedIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list25 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg3QuotedIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list26 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg4QuotedIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list27 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg5QuotedIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list28 = (SubLList)ConsesLow.cons(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("arg6QuotedIsa")), (SubLObject)somewhere_cache.ONE_INTEGER);
        $list29 = _constant_29_initializer();
        $sym30$_SOME_PRED_ASSERTION_SOMEWHERE_CACHE_ = SubLObjectFactory.makeSymbol("*SOME-PRED-ASSERTION-SOMEWHERE-CACHE*");
        $kw31$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym32$_SOMEWHERE_CACHED_PRED_ARGNUM_DICT_ = SubLObjectFactory.makeSymbol("*SOMEWHERE-CACHED-PRED-ARGNUM-DICT*");
        $sym33$SOMEWHERE_CACHED_PRED_P = SubLObjectFactory.makeSymbol("SOMEWHERE-CACHED-PRED-P");
        $sym34$VALID_SOMEWHERE_CACHE_ITEM_ = SubLObjectFactory.makeSymbol("VALID-SOMEWHERE-CACHE-ITEM?");
        $kw35$YES = SubLObjectFactory.makeKeyword("YES");
        $kw36$NO = SubLObjectFactory.makeKeyword("NO");
        $kw37$MAYBE = SubLObjectFactory.makeKeyword("MAYBE");
        $list38 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARGNUM"));
        $str39$Initializing_all_somewhere_caches = SubLObjectFactory.makeString("Initializing all somewhere caches");
        $list40 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("RECACHE-SOME-PRED-ASSERTION-SOMEWHERE"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt")));
        $sym41$GAF_ASSERTION_ = SubLObjectFactory.makeSymbol("GAF-ASSERTION?");
        $sym42$VALID_FORT_ = SubLObjectFactory.makeSymbol("VALID-FORT?");
        $sym43$FORT_P = SubLObjectFactory.makeSymbol("FORT-P");
        $sym44$_INTER_ARG_RESULT_ISA_SOMEWHERE_CACHE_ = SubLObjectFactory.makeSymbol("*INTER-ARG-RESULT-ISA-SOMEWHERE-CACHE*");
        $const45$interArgResultIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("interArgResultIsa"));
        $str46$somewhere_cache_argnum_mismatch_f = SubLObjectFactory.makeString("somewhere-cache argnum mismatch for ~s: ~s vs. ~s");
        $sym47$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const48$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $kw49$GAF = SubLObjectFactory.makeKeyword("GAF");
        $kw50$TRUE = SubLObjectFactory.makeKeyword("TRUE");
    }
}

/*

	Total time: 266 ms
	
*/