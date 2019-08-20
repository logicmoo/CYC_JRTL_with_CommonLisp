/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.code_char;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      NL-TRIE-COMPLETION
 * source file: /cyc/top/cycl/nl-trie-completion.lisp
 * created:     2019/07/03 17:38:16
 */
public final class nl_trie_completion extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new nl_trie_completion();



    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $nl_trie_completion_null_key_proxy$ = makeSymbol("*NL-TRIE-COMPLETION-NULL-KEY-PROXY*");

    static private final SubLString $str1$NL_Trie_Completion_Index_is_not_i = makeString("NL Trie Completion Index is not initialized.");

    private static final SubLSymbol REMOVE_DUPLICATES_EQUAL = makeSymbol("REMOVE-DUPLICATES-EQUAL");

    static private final SubLSymbol $sym3$CHAR_ = makeSymbol("CHAR=");

    private static final SubLSymbol NL_TRIE_COMPLETION_DECODE = makeSymbol("NL-TRIE-COMPLETION-DECODE");

    private static final SubLSymbol $sym6$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");

    public static final SubLSymbol $nl_trie_completion_index$ = makeSymbol("*NL-TRIE-COMPLETION-INDEX*");

    private static final SubLString $str13$The_NL_Trie_must_be_initialized_b = makeString("The NL Trie must be initialized before a completion index can be built.");

    private static final SubLString $str14$Populating_NL_Trie_completion_ind = makeString("Populating NL Trie completion index...");

    private static final SubLList $list15 = list(makeUninternedSymbol("STRIE-DICT-KEY"), makeUninternedSymbol("STRIE-DICT-VALUE"));

    private static final SubLList $list16 = list(makeUninternedSymbol("DICT-KEY"), makeUninternedSymbol("DICT-VALUE"));

    private static final SubLString $str17$Can_t_use__S_as_a_key_for_the_NL_ = makeString("Can't use ~S as a key for the NL Trie completion index.");

    private static final SubLString $str18$NL_Trie_completion_index_is_not_p = makeString("NL Trie completion index is not prepared. Can't add ~S");

    // Definitions
    /**
     *
     *
     * @return LISTP of strings from *NL-TRIE* that start with PREFIX.
     */
    @LispMethod(comment = "@return LISTP of strings from *NL-TRIE* that start with PREFIX.")
    public static final SubLObject nl_trie_completions_alt(SubLObject prefix, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = NIL;
        }
        SubLTrampolineFile.checkType(prefix, STRINGP);
        if (NIL == com.cyc.cycjava.cycl.nl_trie_completion.nl_trie_completion_index_p($nl_trie_completion_index$.getGlobalValue())) {
            Errors.warn($str_alt1$NL_Trie_Completion_Index_is_not_i);
            return NIL;
        }
        {
            SubLObject all_completions = Mapping.mapcar(symbol_function(FIRST), strie.strie_completions($nl_trie_completion_index$.getGlobalValue(), prefix));
            if (NIL != case_sensitiveP) {
                {
                    SubLObject matching_completions = NIL;
                    SubLObject cdolist_list_var = all_completions;
                    SubLObject completion = NIL;
                    for (completion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , completion = cdolist_list_var.first()) {
                        if (NIL != string_utilities.starts_with_by_test(completion, prefix, symbol_function($sym3$CHAR_))) {
                            matching_completions = cons(completion, matching_completions);
                        }
                    }
                    return matching_completions;
                }
            } else {
                return all_completions;
            }
        }
    }

    // Definitions
    /**
     *
     *
     * @return LISTP of strings from *NL-TRIE* that start with PREFIX.
     */
    @LispMethod(comment = "@return LISTP of strings from *NL-TRIE* that start with PREFIX.")
    public static SubLObject nl_trie_completions(final SubLObject prefix, SubLObject case_sensitiveP) {
        if (case_sensitiveP == UNPROVIDED) {
            case_sensitiveP = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        assert NIL != stringp(prefix) : "! stringp(prefix) " + ("Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) ") + prefix;
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

    /**
     *
     *
     * @return LISTP of strings from *NL-TRIE* that start with PREFIX and have denots that
    pass FUNCTION-SPEC.
     */
    @LispMethod(comment = "@return LISTP of strings from *NL-TRIE* that start with PREFIX and have denots that\r\npass FUNCTION-SPEC.")
    public static final SubLObject nl_trie_completions_with_denot_filter_function_alt(SubLObject prefix, SubLObject function_spec) {
        SubLTrampolineFile.checkType(prefix, STRINGP);
        SubLTrampolineFile.checkType(function_spec, FUNCTION_SPEC_P);
        {
            SubLObject completions = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.nl_trie_completion.nl_trie_completions(prefix, UNPROVIDED);
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                if (NIL != find_if(function_spec, lexicon_accessors.denots_of_string(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    completions = cons(string, completions);
                }
            }
            return completions;
        }
    }

    /**
     *
     *
     * @return LISTP of strings from *NL-TRIE* that start with PREFIX and have denots that
    pass FUNCTION-SPEC.
     */
    @LispMethod(comment = "@return LISTP of strings from *NL-TRIE* that start with PREFIX and have denots that\r\npass FUNCTION-SPEC.")
    public static SubLObject nl_trie_completions_with_denot_filter_function(final SubLObject prefix, final SubLObject function_spec) {
        assert NIL != stringp(prefix) : "! stringp(prefix) " + ("Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) ") + prefix;
        assert NIL != function_spec_p(function_spec) : "! function_spec_p(function_spec) " + ("Types.function_spec_p(function_spec) " + "CommonSymbols.NIL != Types.function_spec_p(function_spec) ") + function_spec;
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

    /**
     *
     *
     * @return LISTP of strings from *NL-TRIE* that start with PREFIX and have denots that
    are instances of COLLECTION.
     * @unknown - MT is set from outside.
     */
    @LispMethod(comment = "@return LISTP of strings from *NL-TRIE* that start with PREFIX and have denots that\r\nare instances of COLLECTION.\r\n@unknown - MT is set from outside.")
    public static final SubLObject nl_trie_completions_with_denot_filter_collection(SubLObject prefix, SubLObject collection, SubLObject domain_mt, SubLObject denots_lookup_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        if (denots_lookup_mt == UNPROVIDED) {
            denots_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLTrampolineFile.checkType(prefix, STRINGP);
        SubLTrampolineFile.checkType(collection, $sym5$ISA_COLLECTION_);
        {
            SubLObject completions = NIL;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.nl_trie_completion.nl_trie_completions(prefix, UNPROVIDED);
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                {
                    SubLObject okP = NIL;
                    if (NIL == okP) {
                        {
                            SubLObject csome_list_var = lexicon_accessors.denots_of_string(string, NIL, $DENOT, T, NIL, denots_lookup_mt, $NEVER, NIL, UNPROVIDED);
                            SubLObject denot = NIL;
                            for (denot = csome_list_var.first(); !((NIL != okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                okP = isa.isaP(denot, collection, domain_mt, UNPROVIDED);
                            }
                        }
                    }
                    if (NIL != okP) {
                        completions = cons(string, completions);
                    }
                }
            }
            return completions;
        }
    }

    public static SubLObject nl_trie_completions_with_denot_filter_collection(final SubLObject prefix, final SubLObject collection, final SubLObject case_sensitiveP, SubLObject domain_mt, SubLObject denots_lookup_mt) {
        if (domain_mt == UNPROVIDED) {
            domain_mt = NIL;
        }
        if (denots_lookup_mt == UNPROVIDED) {
            denots_lookup_mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(prefix) : "! stringp(prefix) " + ("Types.stringp(prefix) " + "CommonSymbols.NIL != Types.stringp(prefix) ") + prefix;
        assert NIL != fort_types_interface.isa_collectionP(collection, UNPROVIDED) : "! fort_types_interface.isa_collectionP(collection, .UNPROVIDED) " + ("fort_types_interface.isa_collectionP(collection, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_collectionP(collection, CommonSymbols.UNPROVIDED) ") + collection;
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

    /**
     *
     *
     * @return NL-TRIE-COMPLETION-INDEX-P; *NL-TRIE-COMPLETION-INDEX*, empty and ready to populate.
     */
    @LispMethod(comment = "@return NL-TRIE-COMPLETION-INDEX-P; *NL-TRIE-COMPLETION-INDEX*, empty and ready to populate.")
    public static final SubLObject prepare_nl_trie_completion_index_alt() {
        if (NIL != com.cyc.cycjava.cycl.nl_trie_completion.nl_trie_completion_index_p($nl_trie_completion_index$.getGlobalValue())) {
            com.cyc.cycjava.cycl.nl_trie_completion.clear_nl_trie_completion_index();
        } else {
            $nl_trie_completion_index$.setGlobalValue(com.cyc.cycjava.cycl.nl_trie_completion.new_nl_trie_completion_index());
        }
        return $nl_trie_completion_index$.getGlobalValue();
    }

    /**
     *
     *
     * @return NL-TRIE-COMPLETION-INDEX-P; *NL-TRIE-COMPLETION-INDEX*, empty and ready to populate.
     */
    @LispMethod(comment = "@return NL-TRIE-COMPLETION-INDEX-P; *NL-TRIE-COMPLETION-INDEX*, empty and ready to populate.")
    public static SubLObject prepare_nl_trie_completion_index() {
        if (NIL != nl_trie_completion_index_p($nl_trie_completion_index$.getGlobalValue())) {
            clear_nl_trie_completion_index();
        } else {
            $nl_trie_completion_index$.setGlobalValue(new_nl_trie_completion_index());
        }
        return $nl_trie_completion_index$.getGlobalValue();
    }

    /**
     *
     *
     * @return NL-TRIE-COMPLETION-INDEX-P; *NL-TRIE-COMPLETION-INDEX*, newly populated with
    strings from *NL-TRIE*.
     */
    @LispMethod(comment = "@return NL-TRIE-COMPLETION-INDEX-P; *NL-TRIE-COMPLETION-INDEX*, newly populated with\r\nstrings from *NL-TRIE*.")
    public static final SubLObject rebuild_nl_trie_completion_index_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == nl_trie.nl_trie_presentP(UNPROVIDED)) {
                    Errors.error($str_alt10$The_NL_Trie_must_be_initialized_b);
                }
            }
            com.cyc.cycjava.cycl.nl_trie_completion.prepare_nl_trie_completion_index();
            {
                SubLObject lock = nl_trie.$nl_trie_lock$.getGlobalValue();
                SubLObject release = NIL;
                try {
                    release = seize_lock(lock);
                    {
                        SubLObject lock_1 = nl_trie.$nl_trie_lock$.getGlobalValue();
                        SubLObject release_2 = NIL;
                        try {
                            release_2 = seize_lock(lock_1);
                            {
                                SubLObject _prev_bind_0 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                                try {
                                    file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                                    {
                                        SubLObject stack = stacks.create_stack();
                                        SubLObject the_map = nl_trie.get_nl_trie();
                                        SubLObject mess = $str_alt11$Populating_NL_Trie_completion_ind;
                                        SubLObject sofar = ZERO_INTEGER;
                                        SubLObject total = map_utilities.map_size(the_map);
                                        SubLTrampolineFile.checkType(mess, STRINGP);
                                        {
                                            SubLObject _prev_bind_0_3 = $last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                $within_noting_percent_progress$.bind(T, thread);
                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                noting_percent_progress_preamble(mess);
                                                {
                                                    SubLObject iterator = map_utilities.new_map_iterator(the_map);
                                                    SubLObject done_var = NIL;
                                                    while (NIL == done_var) {
                                                        thread.resetMultipleValues();
                                                        {
                                                            SubLObject var = iteration.iteration_next(iterator);
                                                            SubLObject valid = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject datum = var;
                                                                    SubLObject current = datum;
                                                                    SubLObject strie_dict_key = NIL;
                                                                    SubLObject strie_dict_value = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                                    strie_dict_key = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list_alt12);
                                                                    strie_dict_value = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        note_percent_progress(sofar, total);
                                                                        sofar = add(sofar, ONE_INTEGER);
                                                                        if (NIL != map_utilities.map_p(strie_dict_value)) {
                                                                            stacks.stack_push(strie_dict_value, stack);
                                                                            while (NIL == stacks.stack_empty_p(stack)) {
                                                                                {
                                                                                    SubLObject entry = stacks.stack_pop(stack);
                                                                                    SubLObject iterator_4 = map_utilities.new_map_iterator(entry);
                                                                                    SubLObject done_var_5 = NIL;
                                                                                    while (NIL == done_var_5) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject var_6 = iteration.iteration_next(iterator_4);
                                                                                            SubLObject valid_7 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != valid_7) {
                                                                                                {
                                                                                                    SubLObject datum_8 = var_6;
                                                                                                    SubLObject current_9 = datum_8;
                                                                                                    SubLObject dict_key = NIL;
                                                                                                    SubLObject dict_value = NIL;
                                                                                                    destructuring_bind_must_consp(current_9, datum_8, $list_alt13);
                                                                                                    dict_key = current_9.first();
                                                                                                    current_9 = current_9.rest();
                                                                                                    destructuring_bind_must_consp(current_9, datum_8, $list_alt13);
                                                                                                    dict_value = current_9.first();
                                                                                                    current_9 = current_9.rest();
                                                                                                    if (NIL == current_9) {
                                                                                                        if (NIL != map_utilities.map_p(dict_value)) {
                                                                                                            stacks.stack_push(dict_value, stack);
                                                                                                        } else {
                                                                                                            if (dict_value.isCons()) {
                                                                                                                {
                                                                                                                    SubLObject key = dict_value.first();
                                                                                                                    SubLObject entries = dict_value.rest();
                                                                                                                    SubLObject cdolist_list_var = entries;
                                                                                                                    SubLObject entry_10 = NIL;
                                                                                                                    for (entry_10 = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry_10 = cdolist_list_var.first()) {
                                                                                                                        {
                                                                                                                            SubLObject string = nl_trie.nl_trie_entry_string(entry_10);
                                                                                                                            com.cyc.cycjava.cycl.nl_trie_completion.nl_trie_completion_index_add_string(string);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        cdestructuring_bind_error(datum_8, $list_alt13);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            done_var_5 = makeBoolean(NIL == valid_7);
                                                                                        }
                                                                                    } 
                                                                                }
                                                                            } 
                                                                        } else {
                                                                            if (strie_dict_value.isCons()) {
                                                                                {
                                                                                    SubLObject key = strie_dict_value.first();
                                                                                    SubLObject entries = strie_dict_value.rest();
                                                                                    SubLObject cdolist_list_var = entries;
                                                                                    SubLObject entry = NIL;
                                                                                    for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject string = nl_trie.nl_trie_entry_string(entry);
                                                                                            com.cyc.cycjava.cycl.nl_trie_completion.nl_trie_completion_index_add_string(string);
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list_alt12);
                                                                    }
                                                                }
                                                            }
                                                            done_var = makeBoolean(NIL == valid);
                                                        }
                                                    } 
                                                }
                                                noting_percent_progress_postamble();
                                            } finally {
                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                $last_percent_progress_index$.rebind(_prev_bind_0_3, thread);
                                            }
                                        }
                                    }
                                } finally {
                                    file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_0, thread);
                                }
                            }
                        } finally {
                            if (NIL != release_2) {
                                release_lock(lock_1);
                            }
                        }
                    }
                } finally {
                    if (NIL != release) {
                        release_lock(lock);
                    }
                }
            }
            return $nl_trie_completion_index$.getGlobalValue();
        }
    }

    /**
     *
     *
     * @return NL-TRIE-COMPLETION-INDEX-P; *NL-TRIE-COMPLETION-INDEX*, newly populated with
    strings from *NL-TRIE*.
     */
    @LispMethod(comment = "@return NL-TRIE-COMPLETION-INDEX-P; *NL-TRIE-COMPLETION-INDEX*, newly populated with\r\nstrings from *NL-TRIE*.")
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
                        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
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

    /**
     * Index STRING in *NL-TRIE-COMPLETION-INDEX*.
     */
    @LispMethod(comment = "Index STRING in *NL-TRIE-COMPLETION-INDEX*.")
    public static final SubLObject nl_trie_completion_index_add_string_alt(SubLObject string) {
        if (NIL == strie.strie_key_p(string)) {
            Errors.warn($str_alt14$Can_t_use__S_as_a_key_for_the_NL_, string);
        } else {
            if (NIL == com.cyc.cycjava.cycl.nl_trie_completion.nl_trie_completion_index_p($nl_trie_completion_index$.getGlobalValue())) {
                Errors.warn($str_alt15$NL_Trie_completion_index_is_not_p, string);
            } else {
                if (NIL != member(string, strie.strie_lookup($nl_trie_completion_index$.getGlobalValue(), string), symbol_function(EQUAL), UNPROVIDED)) {
                } else {
                    strie.strie_insert($nl_trie_completion_index$.getGlobalValue(), string, string);
                }
            }
        }
        return $nl_trie_completion_index$.getGlobalValue();
    }

    /**
     * Index STRING in *NL-TRIE-COMPLETION-INDEX*.
     */
    @LispMethod(comment = "Index STRING in *NL-TRIE-COMPLETION-INDEX*.")
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

    /**
     * Remove STRING from *NL-TRIE-COMPLETION-INDEX*.
     */
    @LispMethod(comment = "Remove STRING from *NL-TRIE-COMPLETION-INDEX*.")
    public static final SubLObject nl_trie_completion_index_remove_string_alt(SubLObject string) {
        if ((NIL != strie.strie_key_p(string)) && (NIL != com.cyc.cycjava.cycl.nl_trie_completion.nl_trie_completion_index_p($nl_trie_completion_index$.getGlobalValue()))) {
            strie.strie_unassociate($nl_trie_completion_index$.getGlobalValue(), string, string);
        }
        return $nl_trie_completion_index$.getGlobalValue();
    }

    /**
     * Remove STRING from *NL-TRIE-COMPLETION-INDEX*.
     */
    @LispMethod(comment = "Remove STRING from *NL-TRIE-COMPLETION-INDEX*.")
    public static SubLObject nl_trie_completion_index_remove_string(final SubLObject string) {
        final SubLObject encoded_string = nl_trie_completion_encode(string);
        if ((NIL != strie.strie_key_p(encoded_string)) && (NIL != nl_trie_completion_index_p($nl_trie_completion_index$.getGlobalValue()))) {
            strie.strie_unassociate($nl_trie_completion_index$.getGlobalValue(), encoded_string, encoded_string);
        }
        return $nl_trie_completion_index$.getGlobalValue();
    }/**
     * Remove STRING from *NL-TRIE-COMPLETION-INDEX*.
     */


    public static final SubLObject clear_nl_trie_completion_index_alt() {
        strie.strie_clear($nl_trie_completion_index$.getGlobalValue());
        return $nl_trie_completion_index$.getGlobalValue();
    }

    public static SubLObject clear_nl_trie_completion_index() {
        strie.strie_clear($nl_trie_completion_index$.getGlobalValue());
        return $nl_trie_completion_index$.getGlobalValue();
    }

    public static final SubLObject new_nl_trie_completion_index_alt() {
        return strie.new_strie(strie.strie_test(nl_trie.get_nl_trie()));
    }

    public static SubLObject new_nl_trie_completion_index() {
        return strie.new_strie(strie.strie_test(nl_trie.get_nl_trie()));
    }

    public static final SubLObject nl_trie_completion_index_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != strie.strie_p(v_object, UNPROVIDED)) && (NIL != nl_trie.nl_trie_presentP(UNPROVIDED))) && (strie.strie_test(v_object) == strie.strie_test(nl_trie.get_nl_trie())));
    }

    public static SubLObject nl_trie_completion_index_p(final SubLObject v_object) {
        return makeBoolean(((NIL != strie.strie_p(v_object, UNPROVIDED)) && (NIL != nl_trie.nl_trie_presentP(UNPROVIDED))) && strie.strie_test(v_object).eql(strie.strie_test(nl_trie.get_nl_trie())));
    }

    public static final SubLObject declare_nl_trie_completion_file_alt() {
        declareFunction("nl_trie_completions", "NL-TRIE-COMPLETIONS", 1, 1, false);
        declareFunction("nl_trie_completions_with_denot_filter_function", "NL-TRIE-COMPLETIONS-WITH-DENOT-FILTER-FUNCTION", 2, 0, false);
        declareFunction("nl_trie_completions_with_denot_filter_collection", "NL-TRIE-COMPLETIONS-WITH-DENOT-FILTER-COLLECTION", 2, 2, false);
        declareFunction("prepare_nl_trie_completion_index", "PREPARE-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction("rebuild_nl_trie_completion_index", "REBUILD-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction("nl_trie_completion_index_add_string", "NL-TRIE-COMPLETION-INDEX-ADD-STRING", 1, 0, false);
        declareFunction("nl_trie_completion_index_remove_string", "NL-TRIE-COMPLETION-INDEX-REMOVE-STRING", 1, 0, false);
        declareFunction("clear_nl_trie_completion_index", "CLEAR-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction("new_nl_trie_completion_index", "NEW-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction("nl_trie_completion_index_p", "NL-TRIE-COMPLETION-INDEX-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_nl_trie_completion_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("nl_trie_completions", "NL-TRIE-COMPLETIONS", 1, 1, false);
            declareFunction("nl_trie_completions_with_denot_filter_function", "NL-TRIE-COMPLETIONS-WITH-DENOT-FILTER-FUNCTION", 2, 0, false);
            declareFunction("nl_trie_completions_with_denot_filter_collection", "NL-TRIE-COMPLETIONS-WITH-DENOT-FILTER-COLLECTION", 3, 2, false);
            declareFunction("nl_trie_completion_encode", "NL-TRIE-COMPLETION-ENCODE", 1, 0, false);
            declareFunction("nl_trie_completion_decode", "NL-TRIE-COMPLETION-DECODE", 1, 0, false);
            declareFunction("prepare_nl_trie_completion_index", "PREPARE-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
            declareFunction("rebuild_nl_trie_completion_index", "REBUILD-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
            declareFunction("nl_trie_completion_index_add_string", "NL-TRIE-COMPLETION-INDEX-ADD-STRING", 1, 0, false);
            declareFunction("nl_trie_completion_index_remove_string", "NL-TRIE-COMPLETION-INDEX-REMOVE-STRING", 1, 0, false);
            declareFunction("clear_nl_trie_completion_index", "CLEAR-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
            declareFunction("new_nl_trie_completion_index", "NEW-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
            declareFunction("nl_trie_completion_index_p", "NL-TRIE-COMPLETION-INDEX-P", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("nl_trie_completions_with_denot_filter_collection", "NL-TRIE-COMPLETIONS-WITH-DENOT-FILTER-COLLECTION", 2, 2, false);
        }
        return NIL;
    }

    public static SubLObject declare_nl_trie_completion_file_Previous() {
        declareFunction("nl_trie_completions", "NL-TRIE-COMPLETIONS", 1, 1, false);
        declareFunction("nl_trie_completions_with_denot_filter_function", "NL-TRIE-COMPLETIONS-WITH-DENOT-FILTER-FUNCTION", 2, 0, false);
        declareFunction("nl_trie_completions_with_denot_filter_collection", "NL-TRIE-COMPLETIONS-WITH-DENOT-FILTER-COLLECTION", 3, 2, false);
        declareFunction("nl_trie_completion_encode", "NL-TRIE-COMPLETION-ENCODE", 1, 0, false);
        declareFunction("nl_trie_completion_decode", "NL-TRIE-COMPLETION-DECODE", 1, 0, false);
        declareFunction("prepare_nl_trie_completion_index", "PREPARE-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction("rebuild_nl_trie_completion_index", "REBUILD-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction("nl_trie_completion_index_add_string", "NL-TRIE-COMPLETION-INDEX-ADD-STRING", 1, 0, false);
        declareFunction("nl_trie_completion_index_remove_string", "NL-TRIE-COMPLETION-INDEX-REMOVE-STRING", 1, 0, false);
        declareFunction("clear_nl_trie_completion_index", "CLEAR-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction("new_nl_trie_completion_index", "NEW-NL-TRIE-COMPLETION-INDEX", 0, 0, false);
        declareFunction("nl_trie_completion_index_p", "NL-TRIE-COMPLETION-INDEX-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_nl_trie_completion_file_alt() {
        deflexical("*NL-TRIE-COMPLETION-INDEX*", NIL != boundp($nl_trie_completion_index$) ? ((SubLObject) ($nl_trie_completion_index$.getGlobalValue())) : $UNPREPARED);
        return NIL;
    }

    public static SubLObject init_nl_trie_completion_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*NL-TRIE-COMPLETION-INDEX*", SubLTrampolineFile.maybeDefault($nl_trie_completion_index$, $nl_trie_completion_index$, $UNPREPARED));
            deflexical("*NL-TRIE-COMPLETION-NULL-KEY-PROXY*", code_char(SEVEN_INTEGER));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*NL-TRIE-COMPLETION-INDEX*", NIL != boundp($nl_trie_completion_index$) ? ((SubLObject) ($nl_trie_completion_index$.getGlobalValue())) : $UNPREPARED);
        }
        return NIL;
    }

    public static SubLObject init_nl_trie_completion_file_Previous() {
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

    static private final SubLString $str_alt1$NL_Trie_Completion_Index_is_not_i = makeString("NL Trie Completion Index is not initialized.");

    static private final SubLSymbol $sym5$ISA_COLLECTION_ = makeSymbol("ISA-COLLECTION?");

    static private final SubLString $str_alt10$The_NL_Trie_must_be_initialized_b = makeString("The NL Trie must be initialized before a completion index can be built.");

    static private final SubLString $str_alt11$Populating_NL_Trie_completion_ind = makeString("Populating NL Trie completion index...");

    static private final SubLList $list_alt12 = list(makeUninternedSymbol("STRIE-DICT-KEY"), makeUninternedSymbol("STRIE-DICT-VALUE"));

    static private final SubLList $list_alt13 = list(makeUninternedSymbol("DICT-KEY"), makeUninternedSymbol("DICT-VALUE"));

    static private final SubLString $str_alt14$Can_t_use__S_as_a_key_for_the_NL_ = makeString("Can't use ~S as a key for the NL Trie completion index.");

    static private final SubLString $str_alt15$NL_Trie_completion_index_is_not_p = makeString("NL Trie completion index is not prepared. Can't add ~S");
}

/**
 * Total time: 201 ms
 */
