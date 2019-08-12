/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.format_nil.*;
import static com.cyc.cycjava.cycl.iteration.*;
import static com.cyc.cycjava.cycl.memoization_state.*;
import static com.cyc.cycjava.cycl.set_contents.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LEXICON-SUBWORD-INDEX
 * source file: /cyc/top/cycl/lexicon-subword-index.lisp
 * created:     2019/07/03 17:38:16
 */
public final class lexicon_subword_index extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @return listp of lists. The first contains start offsets into STRING for subwords of STRING.
    The second contains end-offsets into STRING for subwords of STRING.
     * @unknown (pivot-locations 'cardiac septal myectomy')
    => ((0 8 15) (7 14 23))
    this corresponds to the strings 'cardiac', 'cardiac septal', 'cardiac septal myectomy', 'septal',
    'septal myectomy' and 'myectomy'.
     */
    @LispMethod(comment = "@return listp of lists. The first contains start offsets into STRING for subwords of STRING.\r\nThe second contains end-offsets into STRING for subwords of STRING.\r\n@unknown (pivot-locations \'cardiac septal myectomy\')\r\n=> ((0 8 15) (7 14 23))\r\nthis corresponds to the strings \'cardiac\', \'cardiac septal\', \'cardiac septal myectomy\', \'septal\',\r\n\'septal myectomy\' and \'myectomy\'.")
    public static final SubLObject pivot_locations(SubLObject string) {
        {
            SubLObject break_chars = com.cyc.cycjava.cycl.lexicon_subword_index.pivot_location_break_chars();
            SubLObject tokens = string_utilities.string_tokenize(string, break_chars, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject starts = NIL;
            SubLObject ends = NIL;
            SubLObject current_location = ZERO_INTEGER;
            SubLObject cdolist_list_var = tokens;
            SubLObject token = NIL;
            for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                if (NIL != list_utilities.lengthG(token, ZERO_INTEGER, UNPROVIDED)) {
                    {
                        SubLObject start = search(token, string, EQUAL, IDENTITY, ZERO_INTEGER, NIL, current_location, UNPROVIDED);
                        SubLObject end = add(start, length(token));
                        current_location = end;
                        starts = cons(start, starts);
                        ends = cons(end, ends);
                    }
                }
            }
            return list(nreverse(starts), nreverse(ends));
        }
    }

    public static final SubLFile me = new lexicon_subword_index();

 public static final String myName = "com.cyc.cycjava.cycl.lexicon_subword_index";


    // deflexical
    // Definitions
    /**
     * Lock used for opening the file hashtable to prevent multiple version from being opened
     */
    @LispMethod(comment = "Lock used for opening the file hashtable to prevent multiple version from being opened\ndeflexical")
    private static final SubLSymbol $nl_trie_subword_fht_lock$ = makeSymbol("*NL-TRIE-SUBWORD-FHT-LOCK*");

    // deflexical
    @LispMethod(comment = "The fully-qualified path to the subword fht\ndeflexical")
    private static final SubLSymbol $nl_trie_subword_fht_name$ = makeSymbol("*NL-TRIE-SUBWORD-FHT-NAME*");

    // deflexical
    @LispMethod(comment = "A file-backed cache of subword -> full-string mappings taking from the NL trie to allow it function\r\nmore or less like an inverted index.\ndeflexical\nA file-backed cache of subword -> full-string mappings taking from the NL trie to allow it function\nmore or less like an inverted index.")
    private static final SubLSymbol $nl_trie_subword_cache$ = makeSymbol("*NL-TRIE-SUBWORD-CACHE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $pivot_location_break_chars$ = makeSymbol("*PIVOT-LOCATION-BREAK-CHARS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str0$nl_trie_subword_fht_lock = makeString("nl-trie-subword-fht-lock");

    public static final SubLSymbol $nl_trie_subword_index$ = makeSymbol("*NL-TRIE-SUBWORD-INDEX*");

    private static final SubLSymbol CYCL_STRING_P = makeSymbol("CYCL-STRING-P");

    private static final SubLSymbol $nl_trie_subword_cache_initialization_lock$ = makeSymbol("*NL-TRIE-SUBWORD-CACHE-INITIALIZATION-LOCK*");

    private static final SubLString $str4$_nl_trie_subword_cache_initializa = makeString("*nl-trie-subword-cache-initialization-lock*");

    private static final SubLString $str5$_S_is_not_an_ASCII_string_ = makeString("~S is not an ASCII string.");

    private static final SubLSymbol SUBWORD_INDEX_RAW_SEARCH_SET = makeSymbol("SUBWORD-INDEX-RAW-SEARCH-SET");

    private static final SubLSymbol SUBWORD_INDEX_BREAK_CHAR_P = makeSymbol("SUBWORD-INDEX-BREAK-CHAR-P");

    private static final SubLString $str14$Unexpected_result__S_from_SUBWORD = makeString("Unexpected result ~S from SUBWORD-INDEX-RAW-SEARCH-SET");

    private static final SubLSymbol $sym15$_EXIT = makeSymbol("%EXIT");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol SUBWORDS = makeSymbol("SUBWORDS");

    private static final SubLSymbol $sym19$LEXICON_SUBWORD_INDEX_STOP_WORD_ = makeSymbol("LEXICON-SUBWORD-INDEX-STOP-WORD?");



    private static final SubLString $$$Indexing_arg_ = makeString("Indexing arg ");

    private static final SubLString $$$_of_ = makeString(" of ");

    private static final SubLString $str28$Un_indexing_arg_ = makeString("Un-indexing arg ");

    private static final SubLSymbol NON_TRIE_SUBWORD_PREDS = makeSymbol("NON-TRIE-SUBWORD-PREDS");



    private static final SubLSymbol $sym31$STRING_IN_TRIE_ = makeSymbol("STRING-IN-TRIE?");

    private static final SubLSymbol $IMAGE_INDEPENDENT_CFASL = makeKeyword("IMAGE-INDEPENDENT-CFASL");

    private static final SubLString $$$Lexicon_not_yet_initialized = makeString("Lexicon not yet initialized");

    private static final SubLString $str35$building_in_memory_NL_trie_subwor = makeString("building in-memory NL trie subword index");

    private static final SubLList $list36 = list(makeUninternedSymbol("STRIE-DICT-KEY"), makeUninternedSymbol("STRIE-DICT-VALUE"));

    private static final SubLList $list37 = list(makeUninternedSymbol("DICT-KEY"), makeUninternedSymbol("DICT-VALUE"));

    private static final SubLString $str39$nl_trie_subwords = makeString("nl-trie-subwords");

    private static final SubLString $str40$The_in_memory_NL_Trie_Subword_Ind = makeString("The in-memory NL Trie Subword Index is not initialized and no cache attached--it will not be dumped!");

    private static final SubLSymbol $sym41$SET_EMPTY_ = makeSymbol("SET-EMPTY?");

    private static final SubLString $str42$Dumping_NL_Trie_Subword_Index_Cac = makeString("Dumping NL Trie Subword Index Cache");

    private static final SubLString $str43$__Added__A_new_entries_to_the_NL_ = makeString("~&Added ~A new entries to the NL trie subword index.~%");

    private static final SubLString $str44$__Deleted__A_entries_from_the_NL_ = makeString("~&Deleted ~A entries from the NL trie subword index.~%");

    private static final SubLString $str45$__Modified__A_existing_entries_in = makeString("~&Modified ~A existing entries in the NL trie subword index.~%");

    private static final SubLString $str46$Temp_directory__ = makeString("Temp directory '");

    private static final SubLString $str47$__unavailable = makeString("' unavailable");

    private static final SubLString $str48$Writing_nl_trie_subword_index_to_ = makeString("Writing nl-trie-subword-index to file: ");

    private static final SubLSymbol UTF8_STRING_TO_CYCL_SAFE_STRING = makeSymbol("UTF8-STRING-TO-CYCL-SAFE-STRING");

    private static final SubLSymbol $sym51$1_ = makeSymbol("1+");

    private static final SubLSymbol TEST_SUBWORD_INDEX = makeSymbol("TEST-SUBWORD-INDEX");

    private static final SubLList $list59 = list(list(list(makeString("The emu is a noble beast.")), NIL), list(list(list(reader_make_constant_shell("UnicodeStringFn"), makeString("foo &u41D;&u435;&u440;&u43E;&u43D; bar bam"))), NIL));

    /**
     *
     *
     * @param STRING
    		stringp
     * 		
     * @return listp; a list containing strings in the *NL-TRIE* that are superstrings of STRING
     */
    @LispMethod(comment = "@param STRING\n\t\tstringp\r\n\t\t\r\n@return listp; a list containing strings in the *NL-TRIE* that are superstrings of STRING")
    public static final SubLObject nl_trie_subword_index_search(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == file_backed_cache.file_backed_cache_p($nl_trie_subword_cache$.getGlobalValue())) {
                com.cyc.cycjava.cycl.lexicon_subword_index.initialize_nl_trie_subword_caches();
            }
            {
                SubLObject v_set = NIL;
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                        v_set = file_backed_cache.file_backed_cache_lookup(string, $nl_trie_subword_cache$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL == set.set_p(v_set)) {
                    return NIL;
                }
                return set.set_element_list(v_set);
            }
        }
    }

    public static SubLObject nl_trie_subword_index_search(final SubLObject string, SubLObject case_sensitivity) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_subword_index_default_case_sensitivity$.getDynamicValue();
        }
        assert NIL != cycl_string.cycl_string_p(string) : "! cycl_string.cycl_string_p(string) " + ("cycl_string.cycl_string_p(string) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(string) ") + string;
        final SubLObject v_set = nl_trie_subword_index_search_set(string, case_sensitivity);
        if (NIL == set.set_p(v_set)) {
            return NIL;
        }
        return set.set_element_list(v_set);
    }

    public static SubLObject get_nl_trie_subword_cache() {
        maybe_initialize_nl_trie_subword_cache();
        return $nl_trie_subword_cache$.getGlobalValue();
    }

    public static SubLObject nl_trie_subword_index_existsP() {
        return file_backed_cache.file_backed_cache_p(get_nl_trie_subword_cache());
    }

    public static SubLObject maybe_initialize_nl_trie_subword_cache() {
        SubLObject release = NIL;
        try {
            release = seize_lock($nl_trie_subword_cache_initialization_lock$.getGlobalValue());
            if (NIL == file_backed_cache.file_backed_cache_p($nl_trie_subword_cache$.getGlobalValue())) {
                initialize_nl_trie_subword_caches();
            }
        } finally {
            if (NIL != release) {
                release_lock($nl_trie_subword_cache_initialization_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param STRING
    		stringp
     * 		
     * @return set-p or :not-found; a set containing strings in the *NL-TRIE* that are superstrings of STRING
     */
    @LispMethod(comment = "@param STRING\n\t\tstringp\r\n\t\t\r\n@return set-p or :not-found; a set containing strings in the *NL-TRIE* that are superstrings of STRING")
    public static final SubLObject nl_trie_subword_index_search_set(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == file_backed_cache.file_backed_cache_p($nl_trie_subword_cache$.getGlobalValue())) {
                com.cyc.cycjava.cycl.lexicon_subword_index.initialize_nl_trie_subword_caches();
            }
            {
                SubLObject v_set = NIL;
                {
                    SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
                    try {
                        $cfasl_common_symbols$.bind(NIL, thread);
                        cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols());
                        v_set = file_backed_cache.file_backed_cache_lookup(string, $nl_trie_subword_cache$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
                    } finally {
                        $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_set;
            }
        }
    }

    public static SubLObject nl_trie_subword_index_search_set(SubLObject string, SubLObject case_sensitivity) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_subword_index_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_string.cycl_string_p(string) : "! cycl_string.cycl_string_p(string) " + ("cycl_string.cycl_string_p(string) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(string) ") + string;
        if (NIL != unicode_strings.non_ascii_string_p(string)) {
            string = unicode_nauts.utf8_string_to_cycl_safe_string(string);
        }
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && string.isString()) && (NIL == unicode_strings.ascii_string_p(string))) {
            Errors.error($str5$_S_is_not_an_ASCII_string_, string);
        }
        thread.resetMultipleValues();
        final SubLObject ans = nl_trie_subword_index_search_set_low(string, case_sensitivity);
        final SubLObject new_setP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return (NIL != new_setP) || (NIL == set.set_p(ans)) ? ans : set.copy_set(ans);
    }

    public static SubLObject nl_trie_subword_index_search_set_low(final SubLObject v_cycl_string, SubLObject case_sensitivity) {
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_subword_index_default_case_sensitivity$.getDynamicValue();
        }
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
        final SubLObject raw_answer = subword_index_raw_search_set(string_utilities.trim_whitespace(string));
        if (NIL == set.set_p(raw_answer)) {
            return raw_answer;
        }
        final SubLObject pcase_var = case_sensitivity;
        if (pcase_var.eql($ON) || pcase_var.eql($OFF)) {
            final SubLObject ans = set.new_set(set.set_test(raw_answer), UNPROVIDED);
            final SubLObject test = (case_sensitivity == $ON) ? symbol_function(EQUAL) : symbol_function(EQUALP);
            final SubLObject set_contents_var = set.do_set_internal(raw_answer);
            SubLObject basis_object;
            SubLObject state;
            SubLObject str;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                str = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, str)) && (NIL != search(string, str, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED))) {
                    set.set_add(unicode_nauts.utf8_string_to_cycl_safe_string(str), ans);
                }
            }
            return ans;
        }
        if (!pcase_var.eql($PREFERRED)) {
            return NIL;
        }
        SubLObject case_sensitive_matches = NIL;
        SubLObject case_insensitive_matches = NIL;
        final SubLObject set_contents_var = set.do_set_internal(raw_answer);
        SubLObject basis_object;
        SubLObject state;
        SubLObject str;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            str = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, str)) {
                if (NIL != search(string, str, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    case_sensitive_matches = cons(unicode_nauts.utf8_string_to_cycl_safe_string(str), case_sensitive_matches);
                } else
                    if (NIL != search(string, str, symbol_function(EQUALP), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        case_insensitive_matches = cons(unicode_nauts.utf8_string_to_cycl_safe_string(str), case_insensitive_matches);
                    }

            }
        }
        if (NIL != case_sensitive_matches) {
            return set_utilities.construct_set_from_list(case_sensitive_matches, set.set_test(raw_answer), UNPROVIDED);
        }
        return set_utilities.construct_set_from_list(case_insensitive_matches, set.set_test(raw_answer), UNPROVIDED);
    }

    public static SubLObject subword_index_raw_search_set_internal(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        if (NIL != find_if(SUBWORD_INDEX_BREAK_CHAR_P, string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            final SubLObject subword_results = Mapping.mapcar(SUBWORD_INDEX_RAW_SEARCH_SET, subwords(string));
            if (NIL != find($NOT_FOUND, subword_results, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return $NOT_FOUND;
            }
            if (NIL != list_utilities.find_if_not(SET_P, subword_results, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                Errors.error($str14$Unexpected_result__S_from_SUBWORD, list_utilities.find_if_not(SET_P, subword_results, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            } else {
                if (NIL != list_utilities.empty_list_p(subword_results)) {
                    return $NOT_FOUND;
                }
                final SubLObject results = set_utilities.set_intersection(subword_results, UNPROVIDED);
                return NIL != set.set_emptyP(results) ? $NOT_FOUND : results;
            }
        } else {
            final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
            try {
                $cfasl_common_symbols$.bind(NIL, thread);
                cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
                return file_backed_cache.file_backed_cache_lookup(string, get_nl_trie_subword_cache(), UNPROVIDED, UNPROVIDED);
            } finally {
                $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL;
    }

    public static SubLObject subword_index_raw_search_set(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return subword_index_raw_search_set_internal(string);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SUBWORD_INDEX_RAW_SEARCH_SET, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SUBWORD_INDEX_RAW_SEARCH_SET, ONE_INTEGER, $int$1024, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SUBWORD_INDEX_RAW_SEARCH_SET, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(subword_index_raw_search_set_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     *
     *
     * @return listp; a list of concepts whose lexical strings contain STRING as a subword.
     * @unknown o (denots-of-nl-trie-subword-index-search 'infarct')
    => (#$CvirEkgInfarct #$Angina-PostInfarction)
     */
    @LispMethod(comment = "@return listp; a list of concepts whose lexical strings contain STRING as a subword.\r\n@unknown o (denots-of-nl-trie-subword-index-search \'infarct\')\r\n=> (#$CvirEkgInfarct #$Angina-PostInfarction)")
    public static final SubLObject denots_of_nl_trie_subword_index_search(SubLObject string, SubLObject limit) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_set = com.cyc.cycjava.cycl.lexicon_subword_index.nl_trie_subword_index_search_set(string);
                SubLObject denots = NIL;
                SubLObject current_denot_count = ZERO_INTEGER;
                SubLObject limit_exceeded = NIL;
                if (NIL == set.set_p(v_set)) {
                    return NIL;
                }
                {
                    SubLObject denot_lexicon = denots_of_string_lexicon.lexicon_for_denots_of_string(NIL, $DENOT, T, NIL, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), UNPROVIDED);
                    SubLObject set_contents_var = set.do_set_internal(v_set);
                    SubLObject basis_object = do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != limit_exceeded) || (NIL != do_set_contents_doneP(basis_object, state))); state = do_set_contents_update_state(state)) {
                        {
                            SubLObject elt = do_set_contents_next(basis_object, state);
                            if (NIL != do_set_contents_element_validP(state, elt)) {
                                if (NIL == limit_exceeded) {
                                    {
                                        SubLObject csome_list_var = lexicon_accessors.denots_of_string(elt, NIL, $DENOT, T, NIL, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), lexicon_vars.$parse_morphologically$.getDynamicValue(thread), NIL, denot_lexicon);
                                        SubLObject denot = NIL;
                                        for (denot = csome_list_var.first(); !((NIL != limit_exceeded) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , denot = csome_list_var.first()) {
                                            {
                                                SubLObject item_var = denot;
                                                if (NIL == member(item_var, denots, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                    denots = cons(item_var, denots);
                                                }
                                            }
                                            current_denot_count = add(current_denot_count, ONE_INTEGER);
                                            if (limit == current_denot_count) {
                                                limit_exceeded = T;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return values(denots, NIL != limit_exceeded ? ((SubLObject) (set.set_size(v_set))) : NIL);
            }
        }
    }

    public static SubLObject denots_of_nl_trie_subword_index_search(final SubLObject string, SubLObject limit, SubLObject case_sensitivity) {
        if (limit == UNPROVIDED) {
            limit = NIL;
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_subword_index_default_case_sensitivity$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = nl_trie_subword_index_search_set(string, case_sensitivity);
        SubLObject denots = NIL;
        SubLObject current_denot_count = ZERO_INTEGER;
        SubLObject limit_exceeded = NIL;
        if (NIL == set.set_p(v_set)) {
            return NIL;
        }
        final SubLObject _prev_bind_0 = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.currentBinding(thread);
        try {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.bind(case_sensitivity, thread);
            final SubLObject denot_lexicon = denots_of_string_lexicon.lexicon_for_denots_of_string(NIL, $DENOT, T, NIL, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), case_sensitivity);
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject elt;
            SubLObject csome_list_var;
            SubLObject denot;
            SubLObject item_var;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == limit_exceeded) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                elt = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, elt)) && (NIL == limit_exceeded)) {
                    csome_list_var = lexicon_accessors.denots_of_string(elt, NIL, $DENOT, T, NIL, lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), lexicon_vars.$parse_morphologically$.getDynamicValue(thread), NIL, denot_lexicon);
                    denot = NIL;
                    denot = csome_list_var.first();
                    while ((NIL == limit_exceeded) && (NIL != csome_list_var)) {
                        item_var = denot;
                        if (NIL == member(item_var, denots, symbol_function(EQL), symbol_function(IDENTITY))) {
                            denots = cons(item_var, denots);
                        }
                        current_denot_count = add(current_denot_count, ONE_INTEGER);
                        if (limit.eql(current_denot_count)) {
                            limit_exceeded = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        denot = csome_list_var.first();
                    } 
                }
            }
        } finally {
            lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.rebind(_prev_bind_0, thread);
        }
        return values(denots, NIL != limit_exceeded ? set.set_size(v_set) : NIL);
    }

    /**
     *
     *
     * @return listp of string-p
     */
    @LispMethod(comment = "@return listp of string-p")
    public static final SubLObject subwords_internal_alt(SubLObject string) {
        {
            SubLObject result = NIL;
            SubLObject datum = com.cyc.cycjava.cycl.lexicon_subword_index.pivot_locations(string);
            SubLObject current = datum;
            SubLObject starts = NIL;
            SubLObject ends = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt4);
            starts = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt4);
            ends = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject cdolist_list_var = starts;
                    SubLObject start = NIL;
                    for (start = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , start = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_1 = ends;
                            SubLObject end = NIL;
                            for (end = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , end = cdolist_list_var_1.first()) {
                                if (end.numG(start)) {
                                    {
                                        SubLObject item_var = string_utilities.trim_whitespace(subseq(string, start, end));
                                        if (NIL == member(item_var, result, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            result = cons(item_var, result);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt4);
            }
            return result;
        }
    }

    /**
     *
     *
     * @return listp of string-p
     */
    @LispMethod(comment = "@return listp of string-p")
    public static SubLObject subwords_internal(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        return delete_if($sym19$LEXICON_SUBWORD_INDEX_STOP_WORD_, string_utilities.string_tokenize(string, pivot_location_break_chars(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject subwords_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.lexicon_subword_index.subwords_internal(string);
                }
                caching_state = memoization_state_lookup(v_memoization_state, SUBWORDS, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = create_caching_state(memoization_state_lock(v_memoization_state), SUBWORDS, ONE_INTEGER, $int$1000, EQUAL, UNPROVIDED);
                    memoization_state_put(v_memoization_state, SUBWORDS, caching_state);
                }
                {
                    SubLObject results = caching_state_lookup(caching_state, string, $kw6$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.lexicon_subword_index.subwords_internal(string)));
                        caching_state_put(caching_state, string, results, UNPROVIDED);
                    }
                    return caching_results(results);
                }
            }
        }
    }

    public static SubLObject subwords(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return subwords_internal(string);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SUBWORDS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SUBWORDS, ONE_INTEGER, $int$1000, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SUBWORDS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, string, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(subwords_internal(string)));
            memoization_state.caching_state_put(caching_state, string, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject lexicon_subword_index_stop_wordP(final SubLObject string) {
        return lexicon_accessors.closed_lexical_class_string_case_insensitiveP(string, UNPROVIDED);
    }

    /**
     * What characters should be used as break-chars when determining what counts as a subword?
     */
    @LispMethod(comment = "What characters should be used as break-chars when determining what counts as a subword?")
    public static final SubLObject pivot_location_break_chars_alt() {
        if ($pivot_location_break_chars$.getGlobalValue() == $UNINITIALIZED) {
            $pivot_location_break_chars$.setGlobalValue(cconcatenate(string_utilities.grammatical_punctuation_chars(), string_utilities.whitespace_chars()));
        }
        return $pivot_location_break_chars$.getGlobalValue();
    }

    /**
     * What characters should be used as break-chars when determining what counts as a subword?
     */
    @LispMethod(comment = "What characters should be used as break-chars when determining what counts as a subword?")
    public static SubLObject pivot_location_break_chars() {
        if ($pivot_location_break_chars$.getGlobalValue() == $UNINITIALIZED) {
            $pivot_location_break_chars$.setGlobalValue(cconcatenate(string_utilities.grammatical_punctuation_chars(), string_utilities.whitespace_chars()));
        }
        return $pivot_location_break_chars$.getGlobalValue();
    }

    public static SubLObject subword_index_break_char_p(final SubLObject v_char) {
        return member(v_char, pivot_location_break_chars(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject add_non_trie_predicate_to_sub_word_index(final SubLObject pred, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject total = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject message = cconcatenate($$$Indexing_arg_, new SubLObject[]{ format_nil.format_nil_d_no_copy(n), $$$_of_, format_nil.format_nil_s_no_copy(pred) });
            final SubLObject _prev_bind_0_$1 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$2 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$5 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$6 = $progress_notification_count$.currentBinding(thread);
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
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$7 = NIL;
                                        final SubLObject token_var_$8 = NIL;
                                        while (NIL == done_var_$7) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$8);
                                            final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(gaf));
                                            if (NIL != valid_$9) {
                                                final SubLObject string = assertions_high.gaf_arg(gaf, n);
                                                if (string.isString()) {
                                                    reset_nl_trie_subword_index_for_string(string, NIL);
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            done_var_$7 = makeBoolean(NIL == valid_$9);
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
                            $progress_notification_count$.rebind(_prev_bind_3_$6, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$5, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$2, thread);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $ADDED;
    }

    public static SubLObject remove_non_trie_predicate_from_sub_word_index(final SubLObject pred, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject total = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject message = cconcatenate($str28$Un_indexing_arg_, new SubLObject[]{ format_nil.format_nil_d_no_copy(n), $$$_of_, format_nil.format_nil_s_no_copy(pred) });
            final SubLObject _prev_bind_0_$12 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$13 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$13 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$14 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$16 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$17 = $progress_notification_count$.currentBinding(thread);
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
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$18 = NIL;
                                        final SubLObject token_var_$19 = NIL;
                                        while (NIL == done_var_$18) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$19);
                                            final SubLObject valid_$20 = makeBoolean(!token_var_$19.eql(gaf));
                                            if (NIL != valid_$20) {
                                                final SubLObject string = assertions_high.gaf_arg(gaf, n);
                                                if (string.isString()) {
                                                    reset_nl_trie_subword_index_for_string(string, T);
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            done_var_$18 = makeBoolean(NIL == valid_$20);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
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
                            $progress_notification_count$.rebind(_prev_bind_3_$17, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$16, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$14, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$13, thread);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$13, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$12, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $ADDED;
    }

    /**
     * The guts of the afteradding/removing for this index.  Determine if there are subwords of
     * STRING that should be added or removed from the subword-index, and add/remove them
     */
    @LispMethod(comment = "The guts of the afteradding/removing for this index.  Determine if there are subwords of\r\nSTRING that should be added or removed from the subword-index, and add/remove them\nThe guts of the afteradding/removing for this index.  Determine if there are subwords of\nSTRING that should be added or removed from the subword-index, and add/remove them")
    public static final SubLObject reset_nl_trie_subword_index_for_string(SubLObject string) {
        if (NIL != com.cyc.cycjava.cycl.lexicon_subword_index.string_in_trieP(string, UNPROVIDED)) {
            {
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.lexicon_subword_index.subwords(string);
                SubLObject subword = NIL;
                for (subword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subword = cdolist_list_var.first()) {
                    {
                        SubLObject subword_super_strings = com.cyc.cycjava.cycl.lexicon_subword_index.nl_trie_subword_index_search_set(subword);
                        if (NIL == set.set_p(subword_super_strings)) {
                            subword_super_strings = set.new_set(EQUAL, UNPROVIDED);
                        }
                        set.set_add(string, subword_super_strings);
                        file_backed_cache.file_backed_cache_enter(subword, subword_super_strings, $nl_trie_subword_cache$.getGlobalValue());
                    }
                }
            }
            return NIL;
        }
        {
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.lexicon_subword_index.subwords(string);
            SubLObject subword = NIL;
            for (subword = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , subword = cdolist_list_var.first()) {
                {
                    SubLObject subword_super_strings = com.cyc.cycjava.cycl.lexicon_subword_index.nl_trie_subword_index_search_set(subword);
                    if (NIL != set.set_p(subword_super_strings)) {
                        set.set_remove(string, subword_super_strings);
                        file_backed_cache.file_backed_cache_enter(subword, subword_super_strings, $nl_trie_subword_cache$.getGlobalValue());
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject reset_nl_trie_subword_index_for_string(final SubLObject v_cycl_string, final SubLObject removedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != cycl_string.cycl_string_p(v_cycl_string) : "! cycl_string.cycl_string_p(v_cycl_string) " + ("cycl_string.cycl_string_p(v_cycl_string) " + "CommonSymbols.NIL != cycl_string.cycl_string_p(v_cycl_string) ") + v_cycl_string;
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
        final SubLObject _prev_bind_0 = $cfasl_common_symbols$.currentBinding(thread);
        try {
            $cfasl_common_symbols$.bind(NIL, thread);
            cfasl_set_common_symbols_simple(misc_utilities.get_hl_store_caches_shared_symbols_simple());
            if (NIL == removedP) {
                SubLObject cdolist_list_var = subwords(string);
                SubLObject subword = NIL;
                subword = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject subword_super_strings = subword_index_raw_search_set(subword);
                    if (NIL == set.set_p(subword_super_strings)) {
                        subword_super_strings = set.new_set(EQUAL, UNPROVIDED);
                    }
                    set.set_add(string, subword_super_strings);
                    file_backed_cache.file_backed_cache_enter(subword, subword_super_strings, get_nl_trie_subword_cache());
                    cdolist_list_var = cdolist_list_var.rest();
                    subword = cdolist_list_var.first();
                } 
            } else
                if (NIL == string_in_trieP(string, UNPROVIDED)) {
                    if (NIL == string_asserted_on_non_trie_subword_pred_arg_comboP(string)) {
                        SubLObject cdolist_list_var = subwords(string);
                        SubLObject subword = NIL;
                        subword = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            final SubLObject subword_super_strings = subword_index_raw_search_set(subword);
                            if (NIL != set.set_p(subword_super_strings)) {
                                set.set_remove(string, subword_super_strings);
                                file_backed_cache.file_backed_cache_enter(subword, subword_super_strings, get_nl_trie_subword_cache());
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            subword = cdolist_list_var.first();
                        } 
                    }
                }

        } finally {
            $cfasl_common_symbols$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject non_trie_subword_preds_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject preds = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$indexSubWordsForArg;
            if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                final SubLObject str = NIL;
                final SubLObject _prev_bind_0_$23 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_1_$24 = $progress_last_pacification_time$.currentBinding(thread);
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
                                SubLObject done_var_$25 = NIL;
                                final SubLObject token_var_$26 = NIL;
                                while (NIL == done_var_$25) {
                                    final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$26);
                                    final SubLObject valid_$27 = makeBoolean(!token_var_$26.eql(gaf));
                                    if (NIL != valid_$27) {
                                        final SubLObject item_var = assertions_high.gaf_arg1(gaf);
                                        if (NIL == member(item_var, preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            preds = cons(item_var, preds);
                                        }
                                    }
                                    done_var_$25 = makeBoolean(NIL == valid_$27);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
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
                    $progress_last_pacification_time$.rebind(_prev_bind_1_$24, thread);
                    $progress_start_time$.rebind(_prev_bind_0_$23, thread);
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return preds;
    }

    public static SubLObject non_trie_subword_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return non_trie_subword_preds_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NON_TRIE_SUBWORD_PREDS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NON_TRIE_SUBWORD_PREDS, ZERO_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NON_TRIE_SUBWORD_PREDS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(non_trie_subword_preds_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject non_trie_subword_pred_args(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            return copy_list(kb_mapping_utilities.pred_values(pred, $$indexSubWordsForArg, ONE_INTEGER, TWO_INTEGER, UNPROVIDED));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject string_asserted_on_non_trie_subword_pred_arg_comboP(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertedP = NIL;
        final SubLObject v_cycl_string = unicode_nauts.utf8_string_to_cycl_safe_string(string);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL == assertedP) {
                SubLObject csome_list_var = non_trie_subword_preds();
                SubLObject pred = NIL;
                pred = csome_list_var.first();
                while ((NIL == assertedP) && (NIL != csome_list_var)) {
                    if (NIL == assertedP) {
                        SubLObject csome_list_var_$29 = non_trie_subword_pred_args(pred);
                        SubLObject arg = NIL;
                        arg = csome_list_var_$29.first();
                        while ((NIL == assertedP) && (NIL != csome_list_var_$29)) {
                            if (kb_indexing.num_gaf_arg_index(v_cycl_string, arg, pred, UNPROVIDED).isPositive()) {
                                assertedP = T;
                            }
                            csome_list_var_$29 = csome_list_var_$29.rest();
                            arg = csome_list_var_$29.first();
                        } 
                    }
                    csome_list_var = csome_list_var.rest();
                    pred = csome_list_var.first();
                } 
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertedP;
    }

    public static final SubLObject string_in_trieP_internal_alt(SubLObject string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        {
            SubLObject entries = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = entries;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                if (NIL != funcall(test, string, nl_trie.nl_trie_entry_string(entry))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject string_in_trieP_internal(final SubLObject string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        final SubLObject v_cycl_string = unicode_nauts.utf8_string_to_cycl_safe_string(string);
        final SubLObject utf8_string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
        SubLObject cdolist_list_var;
        final SubLObject entries = cdolist_list_var = nl_trie.nl_trie_search(v_cycl_string, UNPROVIDED, UNPROVIDED);
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != funcall(test, utf8_string, nl_trie.nl_trie_entry_string(entry))) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject string_in_trieP_alt(SubLObject string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = $memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.lexicon_subword_index.string_in_trieP_internal(string, test);
                }
                caching_state = memoization_state_lookup(v_memoization_state, $sym8$STRING_IN_TRIE_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = create_caching_state(memoization_state_lock(v_memoization_state), $sym8$STRING_IN_TRIE_, TWO_INTEGER, $int$100, EQUAL, UNPROVIDED);
                    memoization_state_put(v_memoization_state, $sym8$STRING_IN_TRIE_, caching_state);
                }
                {
                    SubLObject sxhash = sxhash_calc_2(string, test);
                    SubLObject collisions = caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                    if (collisions != $kw6$_MEMOIZED_ITEM_NOT_FOUND_) {
                        {
                            SubLObject cdolist_list_var = collisions;
                            SubLObject collision = NIL;
                            for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                                {
                                    SubLObject cached_args = collision.first();
                                    SubLObject results2 = second(collision);
                                    if (string.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && test.equal(cached_args.first())) {
                                            return caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                    {
                        SubLObject results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.lexicon_subword_index.string_in_trieP_internal(string, test)));
                        caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(string, test));
                        return caching_results(results);
                    }
                }
            }
        }
    }

    public static SubLObject string_in_trieP(final SubLObject string, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQUAL);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return string_in_trieP_internal(string, test);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym31$STRING_IN_TRIE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym31$STRING_IN_TRIE_, TWO_INTEGER, $int$100, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym31$STRING_IN_TRIE_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(string, test);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (string.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && test.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(string_in_trieP_internal(string, test)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(string, test));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject initialize_nl_trie_subword_caches_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject path = com.cyc.cycjava.cycl.lexicon_subword_index.get_default_nl_trie_subword_cache_file_path(UNPROVIDED);
                if (NIL != Filesys.probe_file(path)) {
                    $nl_trie_subword_cache$.setGlobalValue(file_backed_cache.file_backed_cache_create(path, NIL, NIL, file_hash_table.$fht_cache_percentage$.getDynamicValue(thread), EQUAL, $IMAGE_INDEPENDENT_CFASL));
                }
            }
            return $nl_trie_subword_cache$.getGlobalValue();
        }
    }

    public static SubLObject initialize_nl_trie_subword_caches() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject path = get_default_nl_trie_subword_cache_file_path(UNPROVIDED);
        if (NIL != Filesys.probe_file(path)) {
            $nl_trie_subword_cache$.setGlobalValue(file_backed_cache.file_backed_cache_create(path, NIL, NIL, file_hash_table.$fht_cache_percentage$.getDynamicValue(thread), EQUALP, $IMAGE_INDEPENDENT_CFASL));
        }
        return $nl_trie_subword_cache$.getGlobalValue();
    }

    /**
     * Closes all filehashtables and reinitializes the nl-trie subword caches.
     * Any dynamic updating of the live cache is lost.
     */
    @LispMethod(comment = "Closes all filehashtables and reinitializes the nl-trie subword caches.\r\nAny dynamic updating of the live cache is lost.\nCloses all filehashtables and reinitializes the nl-trie subword caches.\nAny dynamic updating of the live cache is lost.")
    public static final SubLObject reset_nl_trie_subword_caches_alt() {
        {
            SubLObject lock = $nl_trie_subword_fht_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (NIL != $nl_trie_subword_cache$.getGlobalValue()) {
                    $nl_trie_subword_fht_name$.setGlobalValue(NIL);
                    file_backed_cache.file_backed_cache_reset($nl_trie_subword_cache$.getGlobalValue(), UNPROVIDED);
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return NIL;
    }

    /**
     * Closes all filehashtables and reinitializes the nl-trie subword caches.
     * Any dynamic updating of the live cache is lost.
     */
    @LispMethod(comment = "Closes all filehashtables and reinitializes the nl-trie subword caches.\r\nAny dynamic updating of the live cache is lost.\nCloses all filehashtables and reinitializes the nl-trie subword caches.\nAny dynamic updating of the live cache is lost.")
    public static SubLObject reset_nl_trie_subword_caches() {
        SubLObject release = NIL;
        try {
            release = seize_lock($nl_trie_subword_fht_lock$.getGlobalValue());
            if (NIL != $nl_trie_subword_cache$.getGlobalValue()) {
                $nl_trie_subword_fht_name$.setGlobalValue(NIL);
                file_backed_cache.file_backed_cache_reset($nl_trie_subword_cache$.getGlobalValue(), UNPROVIDED);
            }
        } finally {
            if (NIL != release) {
                release_lock($nl_trie_subword_fht_lock$.getGlobalValue());
            }
        }
        return NIL;
    }

    public static final SubLObject build_nl_trie_subword_index_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == lexicon_initialized_p()) {
                    Errors.error($$$Lexicon_not_yet_initialized);
                }
            }
            $nl_trie_subword_index$.setGlobalValue(dictionary.new_dictionary(EQUAL, UNPROVIDED));
            {
                SubLObject state = possibly_new_memoization_state();
                SubLObject local_state = state;
                {
                    SubLObject _prev_bind_0 = $memoization_state$.currentBinding(thread);
                    try {
                        $memoization_state$.bind(local_state, thread);
                        {
                            SubLObject original_memoization_process = NIL;
                            if ((NIL != local_state) && (NIL == memoization_state_lock(local_state))) {
                                original_memoization_process = memoization_state_get_current_process_internal(local_state);
                                {
                                    SubLObject current_proc = current_process();
                                    if (NIL == original_memoization_process) {
                                        memoization_state_set_current_process_internal(local_state, current_proc);
                                    } else {
                                        if (original_memoization_process != current_proc) {
                                            Errors.error($str_alt12$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                    {
                                        SubLObject _prev_bind_0_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                            {
                                                SubLObject lock = nl_trie.$nl_trie_lock$.getGlobalValue();
                                                SubLObject release = NIL;
                                                try {
                                                    release = seize_lock(lock);
                                                    {
                                                        SubLObject _prev_bind_0_3 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                                                        try {
                                                            file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                                                            {
                                                                SubLObject stack = stacks.create_stack();
                                                                SubLObject the_map = nl_trie.get_nl_trie();
                                                                SubLObject mess = $str_alt13$building_in_memory_NL_trie_subwor;
                                                                SubLObject sofar = ZERO_INTEGER;
                                                                SubLObject total = map_utilities.map_size(the_map);
                                                                SubLTrampolineFile.checkType(mess, STRINGP);
                                                                {
                                                                    SubLObject _prev_bind_0_4 = $last_percent_progress_index$.currentBinding(thread);
                                                                    SubLObject _prev_bind_1_5 = $last_percent_progress_prediction$.currentBinding(thread);
                                                                    SubLObject _prev_bind_2_6 = $within_noting_percent_progress$.currentBinding(thread);
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
                                                                                    SubLObject var = iteration_next(iterator);
                                                                                    SubLObject valid = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != valid) {
                                                                                        {
                                                                                            SubLObject datum = var;
                                                                                            SubLObject current = datum;
                                                                                            SubLObject strie_dict_key = NIL;
                                                                                            SubLObject strie_dict_value = NIL;
                                                                                            destructuring_bind_must_consp(current, datum, $list_alt15);
                                                                                            strie_dict_key = current.first();
                                                                                            current = current.rest();
                                                                                            destructuring_bind_must_consp(current, datum, $list_alt15);
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
                                                                                                            SubLObject iterator_7 = map_utilities.new_map_iterator(entry);
                                                                                                            SubLObject done_var_8 = NIL;
                                                                                                            while (NIL == done_var_8) {
                                                                                                                thread.resetMultipleValues();
                                                                                                                {
                                                                                                                    SubLObject var_9 = iteration_next(iterator_7);
                                                                                                                    SubLObject valid_10 = thread.secondMultipleValue();
                                                                                                                    thread.resetMultipleValues();
                                                                                                                    if (NIL != valid_10) {
                                                                                                                        {
                                                                                                                            SubLObject datum_11 = var_9;
                                                                                                                            SubLObject current_12 = datum_11;
                                                                                                                            SubLObject dict_key = NIL;
                                                                                                                            SubLObject dict_value = NIL;
                                                                                                                            destructuring_bind_must_consp(current_12, datum_11, $list_alt16);
                                                                                                                            dict_key = current_12.first();
                                                                                                                            current_12 = current_12.rest();
                                                                                                                            destructuring_bind_must_consp(current_12, datum_11, $list_alt16);
                                                                                                                            dict_value = current_12.first();
                                                                                                                            current_12 = current_12.rest();
                                                                                                                            if (NIL == current_12) {
                                                                                                                                if (NIL != map_utilities.map_p(dict_value)) {
                                                                                                                                    stacks.stack_push(dict_value, stack);
                                                                                                                                } else {
                                                                                                                                    if (dict_value.isCons()) {
                                                                                                                                        {
                                                                                                                                            SubLObject key = dict_value.first();
                                                                                                                                            SubLObject entries = dict_value.rest();
                                                                                                                                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.lexicon_subword_index.nl_trie_entries_strings(entries);
                                                                                                                                            SubLObject entry_string = NIL;
                                                                                                                                            for (entry_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry_string = cdolist_list_var.first()) {
                                                                                                                                                if (NIL != entry_string) {
                                                                                                                                                    {
                                                                                                                                                        SubLObject cdolist_list_var_13 = com.cyc.cycjava.cycl.lexicon_subword_index.subwords(entry_string);
                                                                                                                                                        SubLObject subword = NIL;
                                                                                                                                                        for (subword = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest() , subword = cdolist_list_var_13.first()) {
                                                                                                                                                            {
                                                                                                                                                                SubLObject v_set = dictionary.dictionary_lookup($nl_trie_subword_index$.getGlobalValue(), subword, UNPROVIDED);
                                                                                                                                                                if (NIL == set.set_p(v_set)) {
                                                                                                                                                                    v_set = set.new_set(EQUAL, UNPROVIDED);
                                                                                                                                                                    dictionary.dictionary_enter($nl_trie_subword_index$.getGlobalValue(), subword, v_set);
                                                                                                                                                                }
                                                                                                                                                                set.set_add(entry_string, v_set);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cdestructuring_bind_error(datum_11, $list_alt16);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                    done_var_8 = makeBoolean(NIL == valid_10);
                                                                                                                }
                                                                                                            } 
                                                                                                        }
                                                                                                    } 
                                                                                                } else {
                                                                                                    if (strie_dict_value.isCons()) {
                                                                                                        {
                                                                                                            SubLObject key = strie_dict_value.first();
                                                                                                            SubLObject entries = strie_dict_value.rest();
                                                                                                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.lexicon_subword_index.nl_trie_entries_strings(entries);
                                                                                                            SubLObject entry_string = NIL;
                                                                                                            for (entry_string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry_string = cdolist_list_var.first()) {
                                                                                                                if (NIL != entry_string) {
                                                                                                                    {
                                                                                                                        SubLObject cdolist_list_var_14 = com.cyc.cycjava.cycl.lexicon_subword_index.subwords(entry_string);
                                                                                                                        SubLObject subword = NIL;
                                                                                                                        for (subword = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , subword = cdolist_list_var_14.first()) {
                                                                                                                            {
                                                                                                                                SubLObject v_set = dictionary.dictionary_lookup($nl_trie_subword_index$.getGlobalValue(), subword, UNPROVIDED);
                                                                                                                                if (NIL == set.set_p(v_set)) {
                                                                                                                                    v_set = set.new_set(EQUAL, UNPROVIDED);
                                                                                                                                    dictionary.dictionary_enter($nl_trie_subword_index$.getGlobalValue(), subword, v_set);
                                                                                                                                }
                                                                                                                                set.set_add(entry_string, v_set);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else {
                                                                                                cdestructuring_bind_error(datum, $list_alt15);
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
                                                                        $within_noting_percent_progress$.rebind(_prev_bind_2_6, thread);
                                                                        $last_percent_progress_prediction$.rebind(_prev_bind_1_5, thread);
                                                                        $last_percent_progress_index$.rebind(_prev_bind_0_4, thread);
                                                                    }
                                                                }
                                                            }
                                                        } finally {
                                                            file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_0_3, thread);
                                                        }
                                                    }
                                                } finally {
                                                    if (NIL != release) {
                                                        release_lock(lock);
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_2, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_15, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        $memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return $nl_trie_subword_index$.getGlobalValue();
        }
    }

    public static SubLObject build_nl_trie_subword_index() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == lexicon_initialized_p())) {
            Errors.error($$$Lexicon_not_yet_initialized);
        }
        $nl_trie_subword_index$.setGlobalValue(dictionary.new_dictionary(EQUALP, UNPROVIDED));
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$30 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    SubLObject release = NIL;
                    try {
                        release = seize_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                        final SubLObject _prev_bind_0_$31 = file_vector_utilities.$file_vector_backed_map_read_lock$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$32 = file_vector_utilities.$current_backed_map_cache_strategy$.currentBinding(thread);
                        try {
                            file_vector_utilities.$file_vector_backed_map_read_lock$.bind(nl_trie.$nl_trie_lock$.getGlobalValue(), thread);
                            file_vector_utilities.$current_backed_map_cache_strategy$.bind(nl_trie.$nl_trie_cache_strategy$.getGlobalValue(), thread);
                            final SubLObject stack = stacks.create_stack();
                            final SubLObject the_map = nl_trie.get_nl_trie();
                            final SubLObject mess = $str35$building_in_memory_NL_trie_subwor;
                            SubLObject sofar = ZERO_INTEGER;
                            final SubLObject total = map_utilities.map_size(the_map);
                            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                            final SubLObject _prev_bind_0_$32 = $last_percent_progress_index$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$33 = $last_percent_progress_prediction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$35 = $within_noting_percent_progress$.currentBinding(thread);
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
                                            destructuring_bind_must_consp(current, datum, $list36);
                                            strie_dict_key = current.first();
                                            current = current.rest();
                                            destructuring_bind_must_consp(current, datum, $list36);
                                            strie_dict_value = current.first();
                                            current = current.rest();
                                            if (NIL == current) {
                                                note_percent_progress(sofar, total);
                                                sofar = add(sofar, ONE_INTEGER);
                                                if (NIL != map_utilities.map_p(strie_dict_value)) {
                                                    stacks.stack_push(strie_dict_value, stack);
                                                    while (NIL == stacks.stack_empty_p(stack)) {
                                                        final SubLObject entry = stacks.stack_pop(stack);
                                                        final SubLObject iterator_$36 = map_utilities.new_map_iterator(entry);
                                                        SubLObject valid_$39;
                                                        for (SubLObject done_var_$37 = NIL; NIL == done_var_$37; done_var_$37 = makeBoolean(NIL == valid_$39)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject var_$38 = iteration.iteration_next(iterator_$36);
                                                            valid_$39 = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (NIL != valid_$39) {
                                                                SubLObject current_$41;
                                                                final SubLObject datum_$40 = current_$41 = var_$38;
                                                                SubLObject dict_key = NIL;
                                                                SubLObject dict_value = NIL;
                                                                destructuring_bind_must_consp(current_$41, datum_$40, $list37);
                                                                dict_key = current_$41.first();
                                                                current_$41 = current_$41.rest();
                                                                destructuring_bind_must_consp(current_$41, datum_$40, $list37);
                                                                dict_value = current_$41.first();
                                                                current_$41 = current_$41.rest();
                                                                if (NIL == current_$41) {
                                                                    if (NIL != map_utilities.map_p(dict_value)) {
                                                                        stacks.stack_push(dict_value, stack);
                                                                    } else
                                                                        if (dict_value.isCons()) {
                                                                            final SubLObject key = dict_value.first();
                                                                            final SubLObject entries = dict_value.rest();
                                                                            SubLObject cdolist_list_var = nl_trie_entries_strings(entries);
                                                                            SubLObject entry_string = NIL;
                                                                            entry_string = cdolist_list_var.first();
                                                                            while (NIL != cdolist_list_var) {
                                                                                if (NIL != entry_string) {
                                                                                    index_sub_words(entry_string);
                                                                                }
                                                                                cdolist_list_var = cdolist_list_var.rest();
                                                                                entry_string = cdolist_list_var.first();
                                                                            } 
                                                                        }

                                                                } else {
                                                                    cdestructuring_bind_error(datum_$40, $list37);
                                                                }
                                                            }
                                                        }
                                                    } 
                                                } else
                                                    if (strie_dict_value.isCons()) {
                                                        final SubLObject key2 = strie_dict_value.first();
                                                        final SubLObject entries2 = strie_dict_value.rest();
                                                        SubLObject cdolist_list_var2 = nl_trie_entries_strings(entries2);
                                                        SubLObject entry_string2 = NIL;
                                                        entry_string2 = cdolist_list_var2.first();
                                                        while (NIL != cdolist_list_var2) {
                                                            if (NIL != entry_string2) {
                                                                index_sub_words(entry_string2);
                                                            }
                                                            cdolist_list_var2 = cdolist_list_var2.rest();
                                                            entry_string2 = cdolist_list_var2.first();
                                                        } 
                                                    }

                                            } else {
                                                cdestructuring_bind_error(datum, $list36);
                                            }
                                        }
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        noting_percent_progress_postamble();
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                                    }
                                }
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_2_$35, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1_$33, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_$32, thread);
                            }
                        } finally {
                            file_vector_utilities.$current_backed_map_cache_strategy$.rebind(_prev_bind_1_$32, thread);
                            file_vector_utilities.$file_vector_backed_map_read_lock$.rebind(_prev_bind_0_$31, thread);
                        }
                    } finally {
                        if (NIL != release) {
                            release_lock(nl_trie.$nl_trie_lock$.getGlobalValue());
                        }
                    }
                    SubLObject cdolist_list_var3 = non_trie_subword_preds();
                    SubLObject pred = NIL;
                    pred = cdolist_list_var3.first();
                    while (NIL != cdolist_list_var3) {
                        SubLObject cdolist_list_var_$43 = non_trie_subword_pred_args(pred);
                        SubLObject arg = NIL;
                        arg = cdolist_list_var_$43.first();
                        while (NIL != cdolist_list_var_$43) {
                            index_sub_words_for_pred_and_arg(pred, arg);
                            cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                            arg = cdolist_list_var_$43.first();
                        } 
                        cdolist_list_var3 = cdolist_list_var3.rest();
                        pred = cdolist_list_var3.first();
                    } 
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$30, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return $nl_trie_subword_index$.getGlobalValue();
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $str_alt0$nl_trie_subword_fht_lock = makeString("nl-trie-subword-fht-lock");

    static private final SubLList $list_alt4 = list(makeSymbol("STARTS"), makeSymbol("ENDS"));

    public static final SubLSymbol $kw6$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym8$STRING_IN_TRIE_ = makeSymbol("STRING-IN-TRIE?");

    static private final SubLString $str_alt12$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt13$building_in_memory_NL_trie_subwor = makeString("building in-memory NL trie subword index");

    static private final SubLList $list_alt15 = list(makeUninternedSymbol("STRIE-DICT-KEY"), makeUninternedSymbol("STRIE-DICT-VALUE"));

    static private final SubLList $list_alt16 = list(makeUninternedSymbol("DICT-KEY"), makeUninternedSymbol("DICT-VALUE"));

    static private final SubLString $str_alt17$nl_trie_subwords = makeString("nl-trie-subwords");

    static private final SubLString $str_alt18$The_in_memory_NL_Trie_Subword_Ind = makeString("The in-memory NL Trie Subword Index is not initialized and no cache attached--it will not be dumped!");

    static private final SubLString $str_alt19$Dumping_NL_Trie_Subword_Index_Cac = makeString("Dumping NL Trie Subword Index Cache");

    static private final SubLString $str_alt20$Temp_directory__ = makeString("Temp directory '");

    static private final SubLString $str_alt21$__unavailable = makeString("' unavailable");

    static private final SubLString $str_alt22$Writing_nl_trie_subword_index_to_ = makeString("Writing nl-trie-subword-index to file: ");

    public static SubLObject index_sub_words(final SubLObject v_cycl_string) {
        final SubLObject string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
        SubLObject cdolist_list_var = subwords(string);
        SubLObject subword = NIL;
        subword = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject v_set = dictionary.dictionary_lookup($nl_trie_subword_index$.getGlobalValue(), subword, UNPROVIDED);
            if (NIL == set.set_p(v_set)) {
                v_set = set.new_set(EQUAL, UNPROVIDED);
                dictionary.dictionary_enter($nl_trie_subword_index$.getGlobalValue(), subword, v_set);
            }
            set.set_add(string, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            subword = cdolist_list_var.first();
        } 
        return $INDEXED;
    }

    public static SubLObject index_sub_words_for_pred_and_arg(final SubLObject pred, final SubLObject n) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject total = kb_indexing.num_predicate_extent_index(pred, UNPROVIDED);
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject message = cconcatenate($$$Indexing_arg_, new SubLObject[]{ format_nil.format_nil_d_no_copy(n), $$$_of_, format_nil.format_nil_s_no_copy(pred) });
            final SubLObject _prev_bind_0_$45 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$46 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message);
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$46 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$47 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$49 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_3_$50 = $progress_notification_count$.currentBinding(thread);
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
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$51 = NIL;
                                        final SubLObject token_var_$52 = NIL;
                                        while (NIL == done_var_$51) {
                                            final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$52);
                                            final SubLObject valid_$53 = makeBoolean(!token_var_$52.eql(gaf));
                                            if (NIL != valid_$53) {
                                                final SubLObject string = assertions_high.gaf_arg(gaf, n);
                                                if (string.isString()) {
                                                    index_sub_words(string);
                                                }
                                                sofar = add(sofar, ONE_INTEGER);
                                                note_percent_progress(sofar, total);
                                            }
                                            done_var_$51 = makeBoolean(NIL == valid_$53);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
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
                            $progress_notification_count$.rebind(_prev_bind_3_$50, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$49, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$47, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$46, thread);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$48 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$48, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$46, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$45, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $INDEXED;
    }

    public static final SubLObject nl_trie_entries_strings_alt(SubLObject entries) {
        {
            SubLObject strings = NIL;
            SubLObject cdolist_list_var = entries;
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                {
                    SubLObject item_var = nl_trie.nl_trie_entry_string(entry);
                    if (NIL == member(item_var, strings, EQUAL, symbol_function(IDENTITY))) {
                        strings = cons(item_var, strings);
                    }
                }
            }
            return strings;
        }
    }

    public static SubLObject nl_trie_entries_strings(final SubLObject entries) {
        SubLObject strings = NIL;
        SubLObject cdolist_list_var = entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = nl_trie.nl_trie_entry_string(entry);
            if (NIL == member(item_var, strings, EQUAL, symbol_function(IDENTITY))) {
                strings = cons(item_var, strings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        return strings;
    }

    public static final SubLObject dump_nl_trie_subword_index_alt(SubLObject dump_directory) {
        {
            SubLObject file = dumper.kb_dump_product_file($str_alt17$nl_trie_subwords, dump_directory, UNPROVIDED);
            if (NIL == dictionary.dictionary_p($nl_trie_subword_index$.getGlobalValue())) {
                if (NIL == file_backed_cache.file_backed_cache_p($nl_trie_subword_cache$.getGlobalValue())) {
                    return Errors.warn($str_alt18$The_in_memory_NL_Trie_Subword_Ind);
                }
                {
                    SubLObject source_common_symbols = misc_utilities.get_hl_store_caches_shared_symbols();
                    SubLObject target_common_symbols = cfasl_current_common_symbols();
                    return file_backed_cache.replicate_file_backed_cache($nl_trie_subword_cache$.getGlobalValue(), file, source_common_symbols, target_common_symbols, file_utilities.temp_directory(), $str_alt19$Dumping_NL_Trie_Subword_Index_Cac);
                }
            }
            return com.cyc.cycjava.cycl.lexicon_subword_index.dump_nl_trie_subword_index_int($nl_trie_subword_index$.getGlobalValue(), file, UNPROVIDED);
        }
    }

    public static SubLObject dump_nl_trie_subword_index(final SubLObject dump_directory) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject file = dumper.kb_dump_product_file($str39$nl_trie_subwords, dump_directory, UNPROVIDED);
        if (NIL != dictionary.dictionary_p($nl_trie_subword_index$.getGlobalValue())) {
            return dump_nl_trie_subword_index_int($nl_trie_subword_index$.getGlobalValue(), file, UNPROVIDED);
        }
        if (NIL == file_backed_cache.file_backed_cache_p($nl_trie_subword_cache$.getGlobalValue())) {
            return Errors.warn($str40$The_in_memory_NL_Trie_Subword_Ind);
        }
        final SubLObject source_common_symbols = misc_utilities.get_hl_store_caches_shared_symbols_simple();
        final SubLObject target_common_symbols = cfasl_current_common_symbols();
        thread.resetMultipleValues();
        final SubLObject the_file = file_backed_cache.replicate_file_backed_cache($nl_trie_subword_cache$.getGlobalValue(), file, $sym41$SET_EMPTY_, source_common_symbols, target_common_symbols, file_utilities.temp_directory(), $str42$Dumping_NL_Trie_Subword_Index_Cac);
        final SubLObject updates = thread.secondMultipleValue();
        final SubLObject additions = thread.thirdMultipleValue();
        final SubLObject deletions = thread.fourthMultipleValue();
        thread.resetMultipleValues();
        if (additions.isPositive()) {
            format(T, $str43$__Added__A_new_entries_to_the_NL_, additions);
        }
        if (deletions.isPositive()) {
            format(T, $str44$__Deleted__A_entries_from_the_NL_, deletions);
        }
        if (updates.isPositive()) {
            format(T, $str45$__Modified__A_existing_entries_in, updates);
        }
        return file;
    }

    public static final SubLObject dump_nl_trie_subword_index_int_alt(SubLObject index, SubLObject filename, SubLObject tmp_dir) {
        if (index == UNPROVIDED) {
            index = $nl_trie_subword_index$.getGlobalValue();
        }
        if (filename == UNPROVIDED) {
            filename = com.cyc.cycjava.cycl.lexicon_subword_index.get_default_nl_trie_subword_cache_file_path(UNPROVIDED);
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = file_utilities.temp_directory();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == Filesys.probe_file(tmp_dir)) {
                    Errors.error(cconcatenate($str_alt20$Temp_directory__, new SubLObject[]{ format_nil_a_no_copy(tmp_dir), $str_alt21$__unavailable }));
                }
            }
            {
                SubLObject fht = file_hash_table.fast_create_file_hash_table(filename, tmp_dir, symbol_function(EQUAL), $IMAGE_INDEPENDENT_CFASL);
                SubLObject progress_message = cconcatenate($str_alt22$Writing_nl_trie_subword_index_to_, format_nil_s_no_copy(filename));
                SubLObject so_far = ZERO_INTEGER;
                SubLObject total = dictionary.dictionary_length(index);
                {
                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        noting_percent_progress_preamble(progress_message);
                        {
                            SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index));
                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject subword = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                    SubLObject super_word_set = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    file_hash_table.fast_put_file_hash_table(subword, fht, super_word_set);
                                    so_far = add(so_far, ONE_INTEGER);
                                    note_percent_progress(so_far, total);
                                    iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                }
                            } 
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        noting_percent_progress_postamble();
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                    }
                }
                file_hash_table.finalize_fast_create_file_hash_table(fht, NIL, $USE_FIRST);
                return fht;
            }
        }
    }

    public static SubLObject dump_nl_trie_subword_index_int(SubLObject index, SubLObject filename, SubLObject tmp_dir) {
        if (index == UNPROVIDED) {
            index = $nl_trie_subword_index$.getGlobalValue();
        }
        if (filename == UNPROVIDED) {
            filename = get_default_nl_trie_subword_cache_file_path(UNPROVIDED);
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = file_utilities.temp_directory();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == Filesys.probe_file(tmp_dir))) {
            Errors.error(cconcatenate($str46$Temp_directory__, new SubLObject[]{ format_nil.format_nil_a_no_copy(tmp_dir), $str47$__unavailable }));
        }
        final SubLObject fht = file_hash_table.fast_create_file_hash_table(filename, tmp_dir, symbol_function(EQUALP), $IMAGE_INDEPENDENT_CFASL);
        final SubLObject progress_message = cconcatenate($str48$Writing_nl_trie_subword_index_to_, format_nil.format_nil_s_no_copy(filename));
        SubLObject so_far = ZERO_INTEGER;
        final SubLObject total = dictionary.dictionary_length(index);
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
                noting_percent_progress_preamble(progress_message);
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(index)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject subword = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject super_word_set = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    file_hash_table.fast_put_file_hash_table(subword, fht, super_word_set);
                    so_far = add(so_far, ONE_INTEGER);
                    note_percent_progress(so_far, total);
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            } finally {
                final SubLObject _prev_bind_0_$56 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$56, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        file_hash_table.finalize_fast_create_file_hash_table(fht, NIL, $USE_FIRST);
        return fht;
    }

    public static final SubLObject get_default_nl_trie_subword_cache_file_path_alt(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        if (NIL != subl_promotions.positive_integer_p(kb)) {
            if (!($nl_trie_subword_fht_name$.getGlobalValue().isString() && (NIL != Filesys.probe_file($nl_trie_subword_fht_name$.getGlobalValue())))) {
                $nl_trie_subword_fht_name$.setGlobalValue(dumper.kb_dump_product_file($str_alt17$nl_trie_subwords, misc_utilities.generic_caches_directory(), UNPROVIDED));
            }
        }
        return $nl_trie_subword_fht_name$.getGlobalValue();
    }

    public static SubLObject get_default_nl_trie_subword_cache_file_path(SubLObject kb) {
        if (kb == UNPROVIDED) {
            kb = kb_loaded();
        }
        if ((NIL != subl_promotions.positive_integer_p(kb)) && ((!$nl_trie_subword_fht_name$.getGlobalValue().isString()) || (NIL == Filesys.probe_file($nl_trie_subword_fht_name$.getGlobalValue())))) {
            $nl_trie_subword_fht_name$.setGlobalValue(dumper.kb_dump_product_file($str39$nl_trie_subwords, misc_utilities.generic_caches_directory(), UNPROVIDED));
        }
        return $nl_trie_subword_fht_name$.getGlobalValue();
    }

    public static SubLObject test_subword_index(final SubLObject v_cycl_string) {
        final SubLObject utf8_string = cycl_string.cycl_string_to_utf8_string(v_cycl_string);
        SubLObject failed_subwords = NIL;
        reset_nl_trie_subword_index_for_string(v_cycl_string, NIL);
        SubLObject cdolist_list_var = Mapping.mapcar(UTF8_STRING_TO_CYCL_SAFE_STRING, subwords(utf8_string));
        SubLObject subword = NIL;
        subword = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((subword.isString() && (NIL == lexicon_subword_index_stop_wordP(subword))) && (NIL == set_utilities.set_find(v_cycl_string, nl_trie_subword_index_search_set(subword, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED))) {
                failed_subwords = cons(subword, failed_subwords);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subword = cdolist_list_var.first();
        } 
        final SubLObject space_positions = list_utilities.all_positions(CHAR_space, utf8_string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject start_indices = cons(ZERO_INTEGER, Mapping.mapcar($sym51$1_, butlast(space_positions, UNPROVIDED)));
        SubLObject end_indices = list_utilities.add_to_end(NIL, space_positions.rest());
        SubLObject cdolist_list_var2 = start_indices;
        SubLObject i = NIL;
        i = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject cdolist_list_var_$57 = end_indices;
            SubLObject j = NIL;
            j = cdolist_list_var_$57.first();
            while (NIL != cdolist_list_var_$57) {
                final SubLObject subphrase = subseq(utf8_string, i, j);
                final SubLObject cycl_subphrase = unicode_nauts.utf8_string_to_cycl_safe_string(subphrase);
                if ((NIL == list_utilities.empty_list_p(subwords(subphrase))) && (NIL == set_utilities.set_find(v_cycl_string, nl_trie_subword_index_search_set(cycl_subphrase, UNPROVIDED), symbol_function(EQUAL), UNPROVIDED))) {
                    failed_subwords = cons(cycl_subphrase, failed_subwords);
                }
                cdolist_list_var_$57 = cdolist_list_var_$57.rest();
                j = cdolist_list_var_$57.first();
            } 
            end_indices = end_indices.rest();
            cdolist_list_var2 = cdolist_list_var2.rest();
            i = cdolist_list_var2.first();
        } 
        reset_nl_trie_subword_index_for_string(v_cycl_string, T);
        return failed_subwords;
    }

    public static final SubLObject declare_lexicon_subword_index_file_alt() {
        declareFunction("nl_trie_subword_index_search", "NL-TRIE-SUBWORD-INDEX-SEARCH", 1, 0, false);
        declareFunction("nl_trie_subword_index_search_set", "NL-TRIE-SUBWORD-INDEX-SEARCH-SET", 1, 0, false);
        declareFunction("denots_of_nl_trie_subword_index_search", "DENOTS-OF-NL-TRIE-SUBWORD-INDEX-SEARCH", 1, 1, false);
        declareFunction("subwords_internal", "SUBWORDS-INTERNAL", 1, 0, false);
        declareFunction("subwords", "SUBWORDS", 1, 0, false);
        declareFunction("pivot_location_break_chars", "PIVOT-LOCATION-BREAK-CHARS", 0, 0, false);
        declareFunction("pivot_locations", "PIVOT-LOCATIONS", 1, 0, false);
        declareFunction("reset_nl_trie_subword_index_for_string", "RESET-NL-TRIE-SUBWORD-INDEX-FOR-STRING", 1, 0, false);
        declareFunction("string_in_trieP_internal", "STRING-IN-TRIE?-INTERNAL", 1, 1, false);
        declareFunction("string_in_trieP", "STRING-IN-TRIE?", 1, 1, false);
        declareFunction("initialize_nl_trie_subword_caches", "INITIALIZE-NL-TRIE-SUBWORD-CACHES", 0, 0, false);
        declareFunction("reset_nl_trie_subword_caches", "RESET-NL-TRIE-SUBWORD-CACHES", 0, 0, false);
        declareFunction("build_nl_trie_subword_index", "BUILD-NL-TRIE-SUBWORD-INDEX", 0, 0, false);
        declareFunction("nl_trie_entries_strings", "NL-TRIE-ENTRIES-STRINGS", 1, 0, false);
        declareFunction("dump_nl_trie_subword_index", "DUMP-NL-TRIE-SUBWORD-INDEX", 1, 0, false);
        declareFunction("dump_nl_trie_subword_index_int", "DUMP-NL-TRIE-SUBWORD-INDEX-INT", 0, 3, false);
        declareFunction("get_default_nl_trie_subword_cache_file_path", "GET-DEFAULT-NL-TRIE-SUBWORD-CACHE-FILE-PATH", 0, 1, false);
        return NIL;
    }

    public static SubLObject declare_lexicon_subword_index_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("nl_trie_subword_index_search", "NL-TRIE-SUBWORD-INDEX-SEARCH", 1, 1, false);
            declareFunction("get_nl_trie_subword_cache", "GET-NL-TRIE-SUBWORD-CACHE", 0, 0, false);
            declareFunction("nl_trie_subword_index_existsP", "NL-TRIE-SUBWORD-INDEX-EXISTS?", 0, 0, false);
            declareFunction("maybe_initialize_nl_trie_subword_cache", "MAYBE-INITIALIZE-NL-TRIE-SUBWORD-CACHE", 0, 0, false);
            declareFunction("nl_trie_subword_index_search_set", "NL-TRIE-SUBWORD-INDEX-SEARCH-SET", 1, 1, false);
            declareFunction("nl_trie_subword_index_search_set_low", "NL-TRIE-SUBWORD-INDEX-SEARCH-SET-LOW", 1, 1, false);
            declareFunction("subword_index_raw_search_set_internal", "SUBWORD-INDEX-RAW-SEARCH-SET-INTERNAL", 1, 0, false);
            declareFunction("subword_index_raw_search_set", "SUBWORD-INDEX-RAW-SEARCH-SET", 1, 0, false);
            declareFunction("denots_of_nl_trie_subword_index_search", "DENOTS-OF-NL-TRIE-SUBWORD-INDEX-SEARCH", 1, 2, false);
            declareFunction("subwords_internal", "SUBWORDS-INTERNAL", 1, 0, false);
            declareFunction("subwords", "SUBWORDS", 1, 0, false);
            declareFunction("lexicon_subword_index_stop_wordP", "LEXICON-SUBWORD-INDEX-STOP-WORD?", 1, 0, false);
            declareFunction("pivot_location_break_chars", "PIVOT-LOCATION-BREAK-CHARS", 0, 0, false);
            declareFunction("subword_index_break_char_p", "SUBWORD-INDEX-BREAK-CHAR-P", 1, 0, false);
            declareFunction("add_non_trie_predicate_to_sub_word_index", "ADD-NON-TRIE-PREDICATE-TO-SUB-WORD-INDEX", 2, 0, false);
            declareFunction("remove_non_trie_predicate_from_sub_word_index", "REMOVE-NON-TRIE-PREDICATE-FROM-SUB-WORD-INDEX", 2, 0, false);
            declareFunction("reset_nl_trie_subword_index_for_string", "RESET-NL-TRIE-SUBWORD-INDEX-FOR-STRING", 2, 0, false);
            declareFunction("non_trie_subword_preds_internal", "NON-TRIE-SUBWORD-PREDS-INTERNAL", 0, 0, false);
            declareFunction("non_trie_subword_preds", "NON-TRIE-SUBWORD-PREDS", 0, 0, false);
            declareFunction("non_trie_subword_pred_args", "NON-TRIE-SUBWORD-PRED-ARGS", 1, 0, false);
            declareFunction("string_asserted_on_non_trie_subword_pred_arg_comboP", "STRING-ASSERTED-ON-NON-TRIE-SUBWORD-PRED-ARG-COMBO?", 1, 0, false);
            declareFunction("string_in_trieP_internal", "STRING-IN-TRIE?-INTERNAL", 1, 1, false);
            declareFunction("string_in_trieP", "STRING-IN-TRIE?", 1, 1, false);
            declareFunction("initialize_nl_trie_subword_caches", "INITIALIZE-NL-TRIE-SUBWORD-CACHES", 0, 0, false);
            declareFunction("reset_nl_trie_subword_caches", "RESET-NL-TRIE-SUBWORD-CACHES", 0, 0, false);
            declareFunction("build_nl_trie_subword_index", "BUILD-NL-TRIE-SUBWORD-INDEX", 0, 0, false);
            declareFunction("index_sub_words", "INDEX-SUB-WORDS", 1, 0, false);
            declareFunction("index_sub_words_for_pred_and_arg", "INDEX-SUB-WORDS-FOR-PRED-AND-ARG", 2, 0, false);
            declareFunction("nl_trie_entries_strings", "NL-TRIE-ENTRIES-STRINGS", 1, 0, false);
            declareFunction("dump_nl_trie_subword_index", "DUMP-NL-TRIE-SUBWORD-INDEX", 1, 0, false);
            declareFunction("dump_nl_trie_subword_index_int", "DUMP-NL-TRIE-SUBWORD-INDEX-INT", 0, 3, false);
            declareFunction("get_default_nl_trie_subword_cache_file_path", "GET-DEFAULT-NL-TRIE-SUBWORD-CACHE-FILE-PATH", 0, 1, false);
            declareFunction("test_subword_index", "TEST-SUBWORD-INDEX", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("nl_trie_subword_index_search", "NL-TRIE-SUBWORD-INDEX-SEARCH", 1, 0, false);
            declareFunction("nl_trie_subword_index_search_set", "NL-TRIE-SUBWORD-INDEX-SEARCH-SET", 1, 0, false);
            declareFunction("denots_of_nl_trie_subword_index_search", "DENOTS-OF-NL-TRIE-SUBWORD-INDEX-SEARCH", 1, 1, false);
            declareFunction("pivot_locations", "PIVOT-LOCATIONS", 1, 0, false);
            declareFunction("reset_nl_trie_subword_index_for_string", "RESET-NL-TRIE-SUBWORD-INDEX-FOR-STRING", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_lexicon_subword_index_file_Previous() {
        declareFunction("nl_trie_subword_index_search", "NL-TRIE-SUBWORD-INDEX-SEARCH", 1, 1, false);
        declareFunction("get_nl_trie_subword_cache", "GET-NL-TRIE-SUBWORD-CACHE", 0, 0, false);
        declareFunction("nl_trie_subword_index_existsP", "NL-TRIE-SUBWORD-INDEX-EXISTS?", 0, 0, false);
        declareFunction("maybe_initialize_nl_trie_subword_cache", "MAYBE-INITIALIZE-NL-TRIE-SUBWORD-CACHE", 0, 0, false);
        declareFunction("nl_trie_subword_index_search_set", "NL-TRIE-SUBWORD-INDEX-SEARCH-SET", 1, 1, false);
        declareFunction("nl_trie_subword_index_search_set_low", "NL-TRIE-SUBWORD-INDEX-SEARCH-SET-LOW", 1, 1, false);
        declareFunction("subword_index_raw_search_set_internal", "SUBWORD-INDEX-RAW-SEARCH-SET-INTERNAL", 1, 0, false);
        declareFunction("subword_index_raw_search_set", "SUBWORD-INDEX-RAW-SEARCH-SET", 1, 0, false);
        declareFunction("denots_of_nl_trie_subword_index_search", "DENOTS-OF-NL-TRIE-SUBWORD-INDEX-SEARCH", 1, 2, false);
        declareFunction("subwords_internal", "SUBWORDS-INTERNAL", 1, 0, false);
        declareFunction("subwords", "SUBWORDS", 1, 0, false);
        declareFunction("lexicon_subword_index_stop_wordP", "LEXICON-SUBWORD-INDEX-STOP-WORD?", 1, 0, false);
        declareFunction("pivot_location_break_chars", "PIVOT-LOCATION-BREAK-CHARS", 0, 0, false);
        declareFunction("subword_index_break_char_p", "SUBWORD-INDEX-BREAK-CHAR-P", 1, 0, false);
        declareFunction("add_non_trie_predicate_to_sub_word_index", "ADD-NON-TRIE-PREDICATE-TO-SUB-WORD-INDEX", 2, 0, false);
        declareFunction("remove_non_trie_predicate_from_sub_word_index", "REMOVE-NON-TRIE-PREDICATE-FROM-SUB-WORD-INDEX", 2, 0, false);
        declareFunction("reset_nl_trie_subword_index_for_string", "RESET-NL-TRIE-SUBWORD-INDEX-FOR-STRING", 2, 0, false);
        declareFunction("non_trie_subword_preds_internal", "NON-TRIE-SUBWORD-PREDS-INTERNAL", 0, 0, false);
        declareFunction("non_trie_subword_preds", "NON-TRIE-SUBWORD-PREDS", 0, 0, false);
        declareFunction("non_trie_subword_pred_args", "NON-TRIE-SUBWORD-PRED-ARGS", 1, 0, false);
        declareFunction("string_asserted_on_non_trie_subword_pred_arg_comboP", "STRING-ASSERTED-ON-NON-TRIE-SUBWORD-PRED-ARG-COMBO?", 1, 0, false);
        declareFunction("string_in_trieP_internal", "STRING-IN-TRIE?-INTERNAL", 1, 1, false);
        declareFunction("string_in_trieP", "STRING-IN-TRIE?", 1, 1, false);
        declareFunction("initialize_nl_trie_subword_caches", "INITIALIZE-NL-TRIE-SUBWORD-CACHES", 0, 0, false);
        declareFunction("reset_nl_trie_subword_caches", "RESET-NL-TRIE-SUBWORD-CACHES", 0, 0, false);
        declareFunction("build_nl_trie_subword_index", "BUILD-NL-TRIE-SUBWORD-INDEX", 0, 0, false);
        declareFunction("index_sub_words", "INDEX-SUB-WORDS", 1, 0, false);
        declareFunction("index_sub_words_for_pred_and_arg", "INDEX-SUB-WORDS-FOR-PRED-AND-ARG", 2, 0, false);
        declareFunction("nl_trie_entries_strings", "NL-TRIE-ENTRIES-STRINGS", 1, 0, false);
        declareFunction("dump_nl_trie_subword_index", "DUMP-NL-TRIE-SUBWORD-INDEX", 1, 0, false);
        declareFunction("dump_nl_trie_subword_index_int", "DUMP-NL-TRIE-SUBWORD-INDEX-INT", 0, 3, false);
        declareFunction("get_default_nl_trie_subword_cache_file_path", "GET-DEFAULT-NL-TRIE-SUBWORD-CACHE-FILE-PATH", 0, 1, false);
        declareFunction("test_subword_index", "TEST-SUBWORD-INDEX", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_lexicon_subword_index_file_alt() {
        deflexical("*NL-TRIE-SUBWORD-FHT-LOCK*", make_lock($str_alt0$nl_trie_subword_fht_lock));
        deflexical("*NL-TRIE-SUBWORD-FHT-NAME*", NIL);
        deflexical("*NL-TRIE-SUBWORD-CACHE*", NIL);
        deflexical("*NL-TRIE-SUBWORD-INDEX*", NIL != boundp($nl_trie_subword_index$) ? ((SubLObject) ($nl_trie_subword_index$.getGlobalValue())) : NIL);
        deflexical("*PIVOT-LOCATION-BREAK-CHARS*", $UNINITIALIZED);
        return NIL;
    }

    public static SubLObject init_lexicon_subword_index_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*NL-TRIE-SUBWORD-FHT-LOCK*", make_lock($str0$nl_trie_subword_fht_lock));
            deflexical("*NL-TRIE-SUBWORD-FHT-NAME*", NIL);
            deflexical("*NL-TRIE-SUBWORD-CACHE*", NIL);
            deflexical("*NL-TRIE-SUBWORD-INDEX*", SubLTrampolineFile.maybeDefault($nl_trie_subword_index$, $nl_trie_subword_index$, NIL));
            deflexical("*NL-TRIE-SUBWORD-CACHE-INITIALIZATION-LOCK*", SubLTrampolineFile.maybeDefault($nl_trie_subword_cache_initialization_lock$, $nl_trie_subword_cache_initialization_lock$, () -> make_lock($str4$_nl_trie_subword_cache_initializa)));
            deflexical("*PIVOT-LOCATION-BREAK-CHARS*", $UNINITIALIZED);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*NL-TRIE-SUBWORD-INDEX*", NIL != boundp($nl_trie_subword_index$) ? ((SubLObject) ($nl_trie_subword_index$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_lexicon_subword_index_file_Previous() {
        deflexical("*NL-TRIE-SUBWORD-FHT-LOCK*", make_lock($str0$nl_trie_subword_fht_lock));
        deflexical("*NL-TRIE-SUBWORD-FHT-NAME*", NIL);
        deflexical("*NL-TRIE-SUBWORD-CACHE*", NIL);
        deflexical("*NL-TRIE-SUBWORD-INDEX*", SubLTrampolineFile.maybeDefault($nl_trie_subword_index$, $nl_trie_subword_index$, NIL));
        deflexical("*NL-TRIE-SUBWORD-CACHE-INITIALIZATION-LOCK*", SubLTrampolineFile.maybeDefault($nl_trie_subword_cache_initialization_lock$, $nl_trie_subword_cache_initialization_lock$, () -> make_lock($str4$_nl_trie_subword_cache_initializa)));
        deflexical("*PIVOT-LOCATION-BREAK-CHARS*", $UNINITIALIZED);
        return NIL;
    }

    public static final SubLObject setup_lexicon_subword_index_file_alt() {
        declare_defglobal($nl_trie_subword_index$);
        note_memoized_function(SUBWORDS);
        note_memoized_function($sym8$STRING_IN_TRIE_);
        return NIL;
    }

    public static SubLObject setup_lexicon_subword_index_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal($nl_trie_subword_index$);
            declare_defglobal($nl_trie_subword_cache_initialization_lock$);
            memoization_state.note_memoized_function(SUBWORD_INDEX_RAW_SEARCH_SET);
            memoization_state.note_memoized_function(SUBWORDS);
            memoization_state.note_memoized_function(NON_TRIE_SUBWORD_PREDS);
            memoization_state.note_memoized_function($sym31$STRING_IN_TRIE_);
            define_test_case_table_int(TEST_SUBWORD_INDEX, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list59);
        }
        if (SubLFiles.USE_V2) {
            note_memoized_function($sym8$STRING_IN_TRIE_);
        }
        return NIL;
    }

    public static SubLObject setup_lexicon_subword_index_file_Previous() {
        declare_defglobal($nl_trie_subword_index$);
        declare_defglobal($nl_trie_subword_cache_initialization_lock$);
        memoization_state.note_memoized_function(SUBWORD_INDEX_RAW_SEARCH_SET);
        memoization_state.note_memoized_function(SUBWORDS);
        memoization_state.note_memoized_function(NON_TRIE_SUBWORD_PREDS);
        memoization_state.note_memoized_function($sym31$STRING_IN_TRIE_);
        define_test_case_table_int(TEST_SUBWORD_INDEX, list(new SubLObject[]{ $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $FULL, $WORKING_, T }), $list59);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lexicon_subword_index_file();
    }

    @Override
    public void initializeVariables() {
        init_lexicon_subword_index_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexicon_subword_index_file();
    }

    static {
    }
}

/**
 * Total time: 631 ms
 */
