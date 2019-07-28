package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.nl_trie_completion;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.nl_trie_completion.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.SEVEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class nl_trie_completion extends SubLTranslatedFile {
    public static final SubLFile me = new nl_trie_completion();

    public static final String myName = "com.cyc.cycjava.cycl.nl_trie_completion";

    public static final String myFingerPrint = "f70acc2d5475b04ecdef51342d9d50b42e8de48bcecb71baedf7553fb51adf32";



    // deflexical
    private static final SubLSymbol $nl_trie_completion_null_key_proxy$ = makeSymbol("*NL-TRIE-COMPLETION-NULL-KEY-PROXY*");



    public static final SubLString $str1$NL_Trie_Completion_Index_is_not_i = makeString("NL Trie Completion Index is not initialized.");

    private static final SubLSymbol REMOVE_DUPLICATES_EQUAL = makeSymbol("REMOVE-DUPLICATES-EQUAL");

    public static final SubLSymbol $sym3$CHAR_ = makeSymbol("CHAR=");

    private static final SubLSymbol NL_TRIE_COMPLETION_DECODE = makeSymbol("NL-TRIE-COMPLETION-DECODE");



    private static final SubLSymbol $sym6$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");









    public static final SubLSymbol $nl_trie_completion_index$ = makeSymbol("*NL-TRIE-COMPLETION-INDEX*");



    private static final SubLString $str13$The_NL_Trie_must_be_initialized_b = makeString("The NL Trie must be initialized before a completion index can be built.");

    private static final SubLString $str14$Populating_NL_Trie_completion_ind = makeString("Populating NL Trie completion index...");

    private static final SubLList $list15 = list(makeUninternedSymbol("STRIE-DICT-KEY"), makeUninternedSymbol("STRIE-DICT-VALUE"));

    private static final SubLList $list16 = list(makeUninternedSymbol("DICT-KEY"), makeUninternedSymbol("DICT-VALUE"));

    private static final SubLString $str17$Can_t_use__S_as_a_key_for_the_NL_ = makeString("Can't use ~S as a key for the NL Trie completion index.");

    private static final SubLString $str18$NL_Trie_completion_index_is_not_p = makeString("NL Trie completion index is not prepared. Can't add ~S");

    public static SubLObject nl_trie_completions(final SubLObject prefix, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        assert NIL != stringp(prefix) : "Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) " + prefix;
        if (NIL == nl_trie_completion_index_p($nl_trie_completion_index$.getGlobalValue())) {
            Errors.warn($str1$NL_Trie_Completion_Index_is_not_i);
            return NIL;
        }
        final SubLObject encoded_prefix = nl_trie_completion_encode(prefix);
        final SubLObject encoded_completions = Mapping.mapcan(symbol_function(REMOVE_DUPLICATES_EQUAL), strie.strie_completions($nl_trie_completion_index$.getGlobalValue(), encoded_prefix), EMPTY_SUBL_OBJECT_ARRAY);
        if (NIL != case_sensitiveP) {
            SubLObject matching_completions = NIL;
            SubLObject cdolist_list_var = encoded_completions;
            SubLObject completion = NIL;
            completion = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != string_utilities.starts_with_by_test(completion, encoded_prefix, symbol_function($sym3$CHAR_))) {
                    matching_completions = cons(nl_trie_completion_decode(completion), matching_completions);
                }
                cdolist_list_var = cdolist_list_var.rest();
                completion = cdolist_list_var.first();
            } 
            return matching_completions;
        }
        return Mapping.mapcar(NL_TRIE_COMPLETION_DECODE, encoded_completions);
    }

    public static SubLObject nl_trie_completions_with_denot_filter_function(final SubLObject prefix, final SubLObject function_spec) {
        assert NIL != stringp(prefix) : "Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) " + prefix;
        assert NIL != function_spec_p(function_spec) : "Types.function_spec_p(function_spec) " + "CommonSymbols.NIL != Types.function_spec_p(function_spec) " + function_spec;
        SubLObject completions = NIL;
        SubLObject cdolist_list_var = nl_trie_completions(prefix, UNPROVIDED);
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != find_if(function_spec, lexicon_accessors.denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                completions = cons(string, completions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return completions;
    }

    public static SubLObject nl_trie_completions_with_denot_filter_collection(final SubLObject prefix, final SubLObject collection, final SubLObject case_sensitiveP, SubLObject domain_mt, SubLObject denots_lookup_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        if (denots_lookup_mt == UNPROVIDED) {
            denots_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(prefix) : "Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) " + prefix;
        assert NIL != fort_types_interface.isa_collectionP(collection, UNPROVIDED) : "fort_types_interface.isa_collectionP(collection, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_collectionP(collection, CommonSymbols.UNPROVIDED) " + collection;
        SubLObject completions = NIL;
        SubLObject cdolist_list_var = nl_trie_completions(prefix, case_sensitiveP);
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject okP = NIL;
            final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
            try {
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind(NIL != case_sensitiveP ? $ON : $OFF, thread);
                if (NIL == okP) {
                    SubLObject csome_list_var;
                    SubLObject denot;
                    for (csome_list_var = lexicon_accessors.denots_of_string(string, NIL, $DENOT, T, NIL, denots_lookup_mt, $NEVER, NIL, UNPROVIDED), denot = NIL, denot = csome_list_var.first(); (NIL == okP) && (NIL != csome_list_var); okP = isa.isaP(denot, collection, domain_mt, UNPROVIDED) , csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                    }
                }
            } finally {
                lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
            }
            if (NIL != okP) {
                completions = cons(string, completions);
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return completions;
    }

    public static SubLObject nl_trie_completion_encode(final SubLObject prefix) {
        return NIL != find(strie.$strie_null_key$.getGlobalValue(), prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? string_utilities.char_subst($nl_trie_completion_null_key_proxy$.getGlobalValue(), strie.$strie_null_key$.getGlobalValue(), prefix) : prefix;
    }

    public static SubLObject nl_trie_completion_decode(final SubLObject prefix) {
        return NIL != find($nl_trie_completion_null_key_proxy$.getGlobalValue(), prefix, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? string_utilities.char_subst(strie.$strie_null_key$.getGlobalValue(), $nl_trie_completion_null_key_proxy$.getGlobalValue(), prefix) : prefix;
    }

    public static SubLObject prepare_nl_trie_completion_index() {
        if (NIL != nl_trie_completion_index_p($nl_trie_completion_index$.getGlobalValue())) {
            clear_nl_trie_completion_index();
        } else {
            $nl_trie_completion_index$.setGlobalValue(new_nl_trie_completion_index());
        }
        return $nl_trie_completion_index$.getGlobalValue();
    }

    public static SubLObject rebuild_nl_trie_completion_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == nl_trie.nl_trie_presentP(UNPROVIDED))) {
            Errors.error($str13$The_NL_Trie_must_be_initialized_b);
        }
        prepare_nl_trie_completion_index();
        SubLObject release = NIL;
        try {
            release = seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            final SubLObject _prev_bind_0 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
            try {
                file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                SubLObject release_$1 = NIL;
                try {
                    release_$1 = seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    final SubLObject _prev_bind_0_$2 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                    try {
                        file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                        file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                        final SubLObject stack = stacks.create_stack();
                        final SubLObject the_map = nl_trie.get_nl_trie();
                        final SubLObject mess = $str14$Populating_NL_Trie_completion_ind;
                        SubLObject sofar = ZERO_INTEGER;
                        final SubLObject total = map_utilities.map_size(the_map);
                        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                        final SubLObject _prev_bind_0_$3 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(mess);
                                final SubLObject iterator = map_utilities.new_map_iterator(the_map);
                                SubLObject valid;
                                for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                                    thread.resetMultipleValues();
                                    final SubLObject var = iteration.iteration_next(iterator);
                                    valid = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != valid) {
                                        SubLObject current;
                                        final SubLObject datum = current = var;
                                        SubLObject strie_dict_key = NIL;
                                        SubLObject strie_dict_value = NIL;
                                        destructuring_bind_must_consp(current, datum, $list15);
                                        strie_dict_key = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list15);
                                        strie_dict_value = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            note_percent_progress(sofar, total);
                                            sofar = add(sofar, ONE_INTEGER);
                                            if (NIL != map_utilities.map_p(strie_dict_value)) {
                                                stacks.stack_push(strie_dict_value, stack);
                                                while (NIL == stacks.stack_empty_p(stack)) {
                                                    final SubLObject entry = stacks.stack_pop(stack);
                                                    final SubLObject iterator_$5 = map_utilities.new_map_iterator(entry);
                                                    SubLObject valid_$8;
                                                    for (SubLObject done_var_$6 = NIL; NIL == done_var_$6; done_var_$6 = makeBoolean(NIL == valid_$8)) {
                                                        thread.resetMultipleValues();
                                                        final SubLObject var_$7 = iteration.iteration_next(iterator_$5);
                                                        valid_$8 = thread.secondMultipleValue();
                                                        thread.resetMultipleValues();
                                                        if (NIL != valid_$8) {
                                                            SubLObject current_$10;
                                                            final SubLObject datum_$9 = current_$10 = var_$7;
                                                            SubLObject dict_key = NIL;
                                                            SubLObject dict_value = NIL;
                                                            destructuring_bind_must_consp(current_$10, datum_$9, $list16);
                                                            dict_key = current_$10.first();
                                                            current_$10 = current_$10.rest();
                                                            destructuring_bind_must_consp(current_$10, datum_$9, $list16);
                                                            dict_value = current_$10.first();
                                                            current_$10 = current_$10.rest();
                                                            if (NIL == current_$10) {
                                                                if (NIL != map_utilities.map_p(dict_value)) {
                                                                    stacks.stack_push(dict_value, stack);
                                                                } else
                                                                    if (dict_value.isCons()) {
                                                                        final SubLObject key = dict_value.first();
                                                                        SubLObject cdolist_list_var;
                                                                        final SubLObject entries = cdolist_list_var = dict_value.rest();
                                                                        SubLObject entry_$11 = NIL;
                                                                        entry_$11 = cdolist_list_var.first();
                                                                        while (NIL != cdolist_list_var) {
                                                                            final SubLObject string = nl_trie.nl_trie_entry_string(entry_$11);
                                                                            nl_trie_completion_index_add_string(string);
                                                                            cdolist_list_var = cdolist_list_var.rest();
                                                                            entry_$11 = cdolist_list_var.first();
                                                                        } 
                                                                    }

                                                            } else {
                                                                cdestructuring_bind_error(datum_$9, $list16);
                                                            }
                                                        }
                                                    }
                                                } 
                                            } else
                                                if (strie_dict_value.isCons()) {
                                                    final SubLObject key2 = strie_dict_value.first();
                                                    SubLObject cdolist_list_var2;
                                                    final SubLObject entries2 = cdolist_list_var2 = strie_dict_value.rest();
                                                    SubLObject entry2 = NIL;
                                                    entry2 = cdolist_list_var2.first();
                                                    while (NIL != cdolist_list_var2) {
                                                        final SubLObject string2 = nl_trie.nl_trie_entry_string(entry2);
                                                        nl_trie_completion_index_add_string(string2);
                                                        cdolist_list_var2 = cdolist_list_var2.rest();
                                                        entry2 = cdolist_list_var2.first();
                                                    } 
                                                }

                                        } else {
                                            cdestructuring_bind_error(datum, $list15);
                                        }
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_1_$4, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$3, thread);
                        }
                    } finally {
                        file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_2, thread);
                        file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    if (NIL != release_$1) {
                        release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                    }
                }
            } finally {
                file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != release) {
                release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
            }
        }
        return $nl_trie_completion_index$.getGlobalValue();
    }

    public static SubLObject nl_trie_completion_index_add_string(final SubLObject string) {
        final SubLObject encoded_string = nl_trie_completion_encode(string);
        if (NIL == strie.strie_key_p(encoded_string)) {
            Errors.warn($str17$Can_t_use__S_as_a_key_for_the_NL_, encoded_string);
        } else
            if (NIL == nl_trie_completion_index_p($nl_trie_completion_index$.getGlobalValue())) {
                Errors.warn($str18$NL_Trie_completion_index_is_not_p, encoded_string);
            } else
                if (NIL == member(encoded_string, strie.strie_lookup($nl_trie_completion_index$.getGlobalValue(), encoded_string), symbol_function(EQUAL), UNPROVIDED)) {
                    strie.strie_insert($nl_trie_completion_index$.getGlobalValue(), encoded_string, encoded_string);
                }


        return $nl_trie_completion_index$.getGlobalValue();
    }

    public static SubLObject nl_trie_completion_index_remove_string(final SubLObject string) {
        final SubLObject encoded_string = nl_trie_completion_encode(string);
        if ((NIL != strie.strie_key_p(encoded_string)) && (NIL != nl_trie_completion_index_p($nl_trie_completion_index$.getGlobalValue()))) {
            strie.strie_unassociate($nl_trie_completion_index$.getGlobalValue(), encoded_string, encoded_string);
        }
        return $nl_trie_completion_index$.getGlobalValue();
    }

    public static SubLObject clear_nl_trie_completion_index() {
        strie.strie_clear($nl_trie_completion_index$.getGlobalValue());
        return $nl_trie_completion_index$.getGlobalValue();
    }

    public static SubLObject new_nl_trie_completion_index() {
        return strie.new_strie(strie.strie_test(nl_trie.get_nl_trie()));
    }

    public static SubLObject nl_trie_completion_index_p(final SubLObject v_object) {
        return makeBoolean(((NIL != strie.strie_p(v_object, UNPROVIDED)) && (NIL != nl_trie.nl_trie_presentP(UNPROVIDED))) && strie.strie_test(v_object).eql(strie.strie_test(nl_trie.get_nl_trie())));
    }

    public static SubLObject declare_nl_trie_completion_file() {
        declareFunction(me, "nl_trie_completions", "NL-TRIE-COMPLETIONS", 1, 1, false);
        declareFunction(me, "nl_trie_completions_with_denot_filter_function", "NL-TRIE-COMPLETIONS-WITH-DENOT-FILTER-FUNCTION", 2, 0, false);
        declareFunction(me, "nl_trie_completions_with_denot_filter_collection", "NL-TRIE-COMPLETIONS-WITH-DENOT-FILTER-COLLECTION", 3, 2, false);
        declareFunction(me, "nl_trie_completion_encode", "NL-TRIE-COMPLETION-ENCODE", 1, 0, false);
        declareFunction(me, "nl_trie_completion_decode", "NL-TRIE-COMPLETION-DECODE", 1, 0, false);
        declareFunction(me, "prepare_nl_trie_completion_index", "PREPARE-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction(me, "rebuild_nl_trie_completion_index", "REBUILD-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction(me, "nl_trie_completion_index_add_string", "NL-TRIE-COMPLETION-INDEX-ADD-STRING", 1, 0, false);
        declareFunction(me, "nl_trie_completion_index_remove_string", "NL-TRIE-COMPLETION-INDEX-REMOVE-STRING", 1, 0, false);
        declareFunction(me, "clear_nl_trie_completion_index", "CLEAR-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction(me, "new_nl_trie_completion_index", "NEW-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction(me, "nl_trie_completion_index_p", "NL-TRIE-COMPLETION-INDEX-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_nl_trie_completion_file() {
        deflexical("*NL-TRIE-COMPLETION-INDEX*", SubLTrampolineFile.maybeDefault($nl_trie_completion_index$, $nl_trie_completion_index$, $UNPREPARED));
        deflexical("*NL-TRIE-COMPLETION-NULL-KEY-PROXY*", code_char(SEVEN_INTEGER));
        return NIL;
    }

    public static SubLObject setup_nl_trie_completion_file() {
        declare_defglobal($nl_trie_completion_index$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_nl_trie_completion_file();
    }

    @Override
    public void initializeVariables() {
        init_nl_trie_completion_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_nl_trie_completion_file();
    }

    static {






















    }
}

/**
 * Total time: 201 ms
 */
