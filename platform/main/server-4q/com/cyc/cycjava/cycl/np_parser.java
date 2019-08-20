/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.define_obsolete_register;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.gafP;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equalp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.hash_table_count;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.adjoin;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.fourth;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nintersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class np_parser extends SubLTranslatedFile implements V12 {
    public static final SubLObject npp_tests_init(SubLObject infile) {
        if (infile == UNPROVIDED) {
            infile = $npp_test_file$.getGlobalValue();
        }
        {
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(infile, $INPUT, NIL);
                if (!stream.isStream()) {
                    Errors.error($str_alt100$Unable_to_open__S, infile);
                }
                {
                    SubLObject stream_42 = stream;
                    $npp_tests$.setGlobalValue(read(stream_42, NIL, $EOF, UNPROVIDED));
                }
            } finally {
                {
                    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                    try {
                        bind($is_thread_performing_cleanupP$, T);
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                    } finally {
                        rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                    }
                }
            }
        }
        return $npp_tests$.getGlobalValue();
    }

    public static final SubLSymbol $npp_tests$ = makeSymbol("*NPP-TESTS*");

    static private final SubLString $str_alt95$ = makeString("");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $npp_test_file$ = makeSymbol("*NPP-TEST-FILE*");

    public static final SubLFile me = new np_parser();



    // defparameter
    // Should the caches be cleared before each parse?
    /**
     * Should the caches be cleared before each parse?
     */
    @LispMethod(comment = "Should the caches be cleared before each parse?\ndefparameter")
    public static final SubLSymbol $clear_npp_caches_each_parseP$ = makeSymbol("*CLEAR-NPP-CACHES-EACH-PARSE?*");

    // deflexical
    // Should we analyze every word morphologically?
    /**
     * Should we analyze every word morphologically?
     */
    @LispMethod(comment = "Should we analyze every word morphologically?\ndeflexical")
    private static final SubLSymbol $npp_always_use_mwpP$ = makeSymbol("*NPP-ALWAYS-USE-MWP?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $npp_denot_preds_to_exclude$ = makeSymbol("*NPP-DENOT-PREDS-TO-EXCLUDE*");

    // deflexical
    // Parts of speech used in parser code constraints
    /**
     * Parts of speech used in parser code constraints
     */
    @LispMethod(comment = "Parts of speech used in parser code constraints\ndeflexical")
    private static final SubLSymbol $code_constraint_poses$ = makeSymbol("*CODE-CONSTRAINT-POSES*");

    // defparameter
    // Should we try to return more specific semtrans templates?
    /**
     * Should we try to return more specific semtrans templates?
     */
    @LispMethod(comment = "Should we try to return more specific semtrans templates?\ndefparameter")
    private static final SubLSymbol $npp_specify_semtransP$ = makeSymbol("*NPP-SPECIFY-SEMTRANS?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $wf_col_template_comboP_caching_state$ = makeSymbol("*WF-COL-TEMPLATE-COMBO?-CACHING-STATE*");

    private static final SubLSymbol STANDARD_STRING_TOKENIZE = makeSymbol("STANDARD-STRING-TOKENIZE");

    private static final SubLSymbol $sym4$NPP_NO_DENOT_TRIPLE_ = makeSymbol("NPP-NO-DENOT-TRIPLE?");



    private static final SubLSymbol $sym7$NPP_KNOWN_STRING_ = makeSymbol("NPP-KNOWN-STRING?");



    private static final SubLObject $const10$DenotationPredicate_ExcludedFromN = reader_make_constant_shell("DenotationPredicate-ExcludedFromNPParser");

    private static final SubLSymbol NPP_VALUES_SAME_EXCEPT_FOR_DENOT_P = makeSymbol("NPP-VALUES-SAME-EXCEPT-FOR-DENOT-P");

    private static final SubLSymbol INTERVAL_TOKEN_END = makeSymbol("INTERVAL-TOKEN-END");

    private static final SubLSymbol INTERVAL_TOKEN_START = makeSymbol("INTERVAL-TOKEN-START");



    private static final SubLString $str18$_S_is_not_a_valid_NPP_value_type = makeString("~S is not a valid NPP value type");



    private static final SubLString $str20$Don_t_know_how_to_make_NPP_value_ = makeString("Don't know how to make NPP value type ~S");

    private static final SubLSymbol NPP_CANONICAL_POS_TABLE = makeSymbol("NPP-CANONICAL-POS-TABLE");

    private static final SubLSymbol $npp_canonical_pos_table_caching_state$ = makeSymbol("*NPP-CANONICAL-POS-TABLE-CACHING-STATE*");

    private static final SubLObject $$True_JustificationTruth = reader_make_constant_shell("True-JustificationTruth");

    private static final SubLString $str29$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str34$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");





    private static final SubLString $str37$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str38$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLString $str39$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLList $list40 = list(reader_make_constant_shell("PossessivePronoun-Pre"));











    private static final SubLSymbol $sym47$NPP_PARSE_ = makeSymbol("NPP-PARSE?");

    static private final SubLSymbol $sym48$NPP_PARSE_ = makeSymbol("NPP-PARSE=");

    private static final SubLSymbol GET_FORTS_FOR_NP = makeSymbol("GET-FORTS-FOR-NP");

    private static final SubLSymbol GET_CYCLS_FOR_NP = makeSymbol("GET-CYCLS-FOR-NP");

    private static final SubLList $list51 = list(makeSymbol("PS-GET-CYCLS-FOR-NP"));

    private static final SubLSymbol GET_BEST_CYCLS_FOR_NP = makeSymbol("GET-BEST-CYCLS-FOR-NP");

    private static final SubLSymbol PARSE_NP = makeSymbol("PARSE-NP");

    private static final SubLSymbol PARSE_NBAR = makeSymbol("PARSE-NBAR");

    private static final SubLList $list56 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));

    private static final SubLObject $$PossessivePronoun_Pre = reader_make_constant_shell("PossessivePronoun-Pre");

    private static final SubLList $list58 = list(makeSymbol("NBAR-DENOT"), makeSymbol("NBAR-PRED"));





    private static final SubLList $list61 = list(makeSymbol("DENOT"), makeSymbol("POS"), makeSymbol("PRED"));



    private static final SubLString $$$and_ = makeString("and ");

    private static final SubLSymbol $sym64$NPP_STRING_ = makeSymbol("NPP-STRING=");



    private static final SubLString $$$_ = makeString(" ");

    private static final SubLList $list69 = list(makeSymbol("NBAR1-CYCL"), makeSymbol("NBAR1-PRED"));

    static private final SubLList $list70 = list(makeSymbol("NBAR2-CYCL"), makeSymbol("NBAR2-PRED"));









    private static final SubLList $list75 = list(makeSymbol("NBAR-CYCL"), makeSymbol("NBAR-POS-PRED"));





    private static final SubLSymbol $sym78$_OBJ = makeSymbol("?OBJ");







    private static final SubLSymbol $sym83$NPP_TERM_ = makeSymbol("NPP-TERM=");



    private static final SubLSymbol $sym86$WF_COL_TEMPLATE_COMBO_ = makeSymbol("WF-COL-TEMPLATE-COMBO?");

    private static final SubLSymbol $sym87$_WF_COL_TEMPLATE_COMBO__CACHING_STATE_ = makeSymbol("*WF-COL-TEMPLATE-COMBO?-CACHING-STATE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    private static final SubLSymbol $prep_semtrans_hash$ = makeSymbol("*PREP-SEMTRANS-HASH*");





    private static final SubLObject $$Post_NounPhraseModifyingFrame = reader_make_constant_shell("Post-NounPhraseModifyingFrame");

    private static final SubLString $str93$__Adding__S__S_to____S = makeString("~%Adding ~S ~S to : ~S");

    private static final SubLString $str94$ = makeString("");

    private static final SubLList $list95 = list(makeSymbol("CYCL"), makeSymbol("PRED"));

    // Definitions
    public static final SubLObject clear_npp_caches_alt() {
        com.cyc.cycjava.cycl.np_parser.clear_wf_col_template_comboP();
        com.cyc.cycjava.cycl.np_parser.clear_prep_semtrans_hash();
        nl_reformulator.clear_nl_reformulator_caches();
        noun_compound_parser.clear_rbp_floors_cached();
        psp_main.clear_psp_caches();
        com.cyc.cycjava.cycl.np_parser.clear_npp_canonical_pos_table();
        noun_compound_parser.clear_rbp_rb_rules_matching_closed_specs();
        rbp_rule_bank.clear_noun_compound_constraint_string_specs();
        return T;
    }

    // Definitions
    public static SubLObject clear_npp_caches() {
        clear_wf_col_template_comboP();
        clear_prep_semtrans_hash();
        nl_reformulator.clear_nl_reformulator_caches();
        noun_compound_parser.clear_rbp_floors_cached();
        psp_main.clear_psp_caches();
        clear_npp_canonical_pos_table();
        noun_compound_parser.clear_rbp_rb_rules_matching_closed_specs();
        rbp_rule_bank.clear_noun_compound_constraint_string_specs();
        return T;
    }

    public static final SubLObject npp_tokenize_strings_alt(SubLObject strings, SubLObject value_type, SubLObject remove_no_denot_tokensP) {
        if (value_type == UNPROVIDED) {
            value_type = $TRIPLES;
        }
        if (remove_no_denot_tokensP == UNPROVIDED) {
            remove_no_denot_tokensP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == strings) {
                return NIL;
            }
            com.cyc.cycjava.cycl.np_parser.npp_triefy_unknown_strings(strings);
            {
                SubLObject return_type = $INTERVAL;
                SubLObject initial_tokenization = nl_trie_accessors.nl_trie_sentence_tokenize(strings, return_type, $DILIGENT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject filtered_tokenization = com.cyc.cycjava.cycl.np_parser.npp_filter_tokens(initial_tokenization, strings);
                SubLObject raw_tokens = com.cyc.cycjava.cycl.np_parser.npp_convert_interval_tokens(filtered_tokenization, value_type);
                SubLObject filtered_tokens = (NIL != remove_no_denot_tokensP) ? ((SubLObject) (com.cyc.cycjava.cycl.np_parser.npp_remove_no_denot_triples(raw_tokens))) : raw_tokens;
                SubLObject final_token_list = (NIL != parsing_vars.$npp_use_strings_for_semanticsP$.getDynamicValue(thread)) ? ((SubLObject) (com.cyc.cycjava.cycl.np_parser.npp_add_original_string_tokens(nreverse(filtered_tokens), strings, value_type))) : reverse(filtered_tokens);
                return final_token_list;
            }
        }
    }

    public static SubLObject npp_tokenize_strings(final SubLObject strings, SubLObject value_type, SubLObject remove_no_denot_tokensP) {
        if (value_type == UNPROVIDED) {
            value_type = $TRIPLES;
        }
        if (remove_no_denot_tokensP == UNPROVIDED) {
            remove_no_denot_tokensP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == strings) {
            return NIL;
        }
        npp_triefy_unknown_strings(strings);
        final SubLObject return_type = $INTERVAL;
        final SubLObject initial_tokenization = nl_trie_accessors.nl_trie_sentence_tokenize(strings, return_type, $DILIGENT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject filtered_tokenization = npp_filter_tokens(initial_tokenization, strings);
        final SubLObject raw_tokens = npp_convert_interval_tokens(filtered_tokenization, value_type);
        final SubLObject filtered_tokens = (NIL != remove_no_denot_tokensP) ? npp_remove_no_denot_triples(raw_tokens) : raw_tokens;
        final SubLObject final_token_list = (NIL != parsing_vars.$npp_use_strings_for_semanticsP$.getDynamicValue(thread)) ? npp_add_original_string_tokens(nreverse(filtered_tokens), strings, value_type) : reverse(filtered_tokens);
        return final_token_list;
    }

    /**
     *
     *
     * @param STRING
    stringp
     * 		
     * @return 1 LISTP of tokenizations, each a list of tokens
     * @return 2 LISTP of strings, representing the tokenization used.
     */
    @LispMethod(comment = "@param STRING\nstringp\r\n\t\t\r\n@return 1 LISTP of tokenizations, each a list of tokens\r\n@return 2 LISTP of strings, representing the tokenization used.")
    public static final SubLObject npp_sentence_tokenize_alt(SubLObject string, SubLObject value_type, SubLObject string_tokenizer, SubLObject remove_no_denot_tokensP) {
        if (value_type == UNPROVIDED) {
            value_type = $TRIPLES;
        }
        if (string_tokenizer == UNPROVIDED) {
            string_tokenizer = STANDARD_STRING_TOKENIZE;
        }
        if (remove_no_denot_tokensP == UNPROVIDED) {
            remove_no_denot_tokensP = T;
        }
        if (NIL == nl_trie.nl_trie_presentP(UNPROVIDED)) {
            Errors.warn($str_alt4$_NL_TRIE__not_present_);
            return NIL;
        }
        {
            SubLObject strings = funcall(string_tokenizer, string);
            return values(com.cyc.cycjava.cycl.np_parser.npp_tokenize_strings(strings, value_type, remove_no_denot_tokensP), strings);
        }
    }

    /**
     *
     *
     * @param STRING
    stringp
     * 		
     * @return 1 LISTP of tokenizations, each a list of tokens
     * @return 2 LISTP of strings, representing the tokenization used.
     */
    @LispMethod(comment = "@param STRING\nstringp\r\n\t\t\r\n@return 1 LISTP of tokenizations, each a list of tokens\r\n@return 2 LISTP of strings, representing the tokenization used.")
    public static SubLObject npp_sentence_tokenize(final SubLObject string, SubLObject value_type, SubLObject string_tokenizer, SubLObject remove_no_denot_tokensP) {
        if (value_type == UNPROVIDED) {
            value_type = $TRIPLES;
        }
        if (string_tokenizer == UNPROVIDED) {
            string_tokenizer = STANDARD_STRING_TOKENIZE;
        }
        if (remove_no_denot_tokensP == UNPROVIDED) {
            remove_no_denot_tokensP = T;
        }
        if (NIL == nl_trie.nl_trie_presentP(UNPROVIDED)) {
            return NIL;
        }
        final SubLObject strings = funcall(string_tokenizer, string);
        return values(npp_tokenize_strings(strings, value_type, remove_no_denot_tokensP), strings);
    }

    /**
     * Remove all triples that have no denots from members of TOKENS.
     */
    @LispMethod(comment = "Remove all triples that have no denots from members of TOKENS.")
    public static final SubLObject npp_remove_no_denot_triples_alt(SubLObject tokens) {
        {
            SubLObject cdolist_list_var = tokens;
            SubLObject token = NIL;
            for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                standard_tokenization.string_token_value_set(standard_tokenization.interval_token_value(token), remove_if($sym5$NPP_NO_DENOT_TRIPLE_, standard_tokenization.string_token_value(standard_tokenization.interval_token_value(token)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            }
        }
        return tokens;
    }

    /**
     * Remove all triples that have no denots from members of TOKENS.
     */
    @LispMethod(comment = "Remove all triples that have no denots from members of TOKENS.")
    public static SubLObject npp_remove_no_denot_triples(final SubLObject tokens) {
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            standard_tokenization.string_token_value_set(standard_tokenization.interval_token_value(token), remove_if($sym4$NPP_NO_DENOT_TRIPLE_, standard_tokenization.string_token_value(standard_tokenization.interval_token_value(token)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        return tokens;
    }

    public static final SubLObject npp_no_denot_tripleP_alt(SubLObject triple) {
        return eq(com.cyc.cycjava.cycl.np_parser.npp_value_denot(triple), $NO_DENOT);
    }

    public static SubLObject npp_no_denot_tripleP(final SubLObject triple) {
        return eq(npp_value_denot(triple), $NO_DENOT);
    }

    public static final SubLObject npp_no_denot_quadP_alt(SubLObject quad) {
        return eq(com.cyc.cycjava.cycl.np_parser.npp_value_denot(quad), $NO_DENOT);
    }

    public static SubLObject npp_no_denot_quadP(final SubLObject quad) {
        return eq(npp_value_denot(quad), $NO_DENOT);
    }

    /**
     * Filter TOKENIZATION against STRINGS.
     */
    @LispMethod(comment = "Filter TOKENIZATION against STRINGS.")
    public static final SubLObject npp_filter_tokens_alt(SubLObject tokenization, SubLObject strings) {
        {
            SubLObject cdolist_list_var = tokenization;
            SubLObject token = NIL;
            for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                {
                    SubLObject filtered = NIL;
                    SubLObject actual_string = string_utilities.bunge(subseq(strings, standard_tokenization.interval_token_start(token), standard_tokenization.interval_token_end(token)), UNPROVIDED);
                    SubLObject value = standard_tokenization.interval_token_value(token);
                    SubLObject structs = standard_tokenization.string_token_value(value);
                    SubLObject cdolist_list_var_1 = structs;
                    SubLObject struct = NIL;
                    for (struct = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , struct = cdolist_list_var_1.first()) {
                        if (NIL == com.cyc.cycjava.cycl.np_parser.npp_bad_entryP(struct, actual_string)) {
                            filtered = cons(struct, filtered);
                        }
                    }
                    standard_tokenization.string_token_string_set(value, actual_string);
                    standard_tokenization.string_token_value_set(value, filtered);
                    standard_tokenization.interval_token_value_set(token, value);
                }
            }
        }
        return tokenization;
    }

    /**
     * Filter TOKENIZATION against STRINGS.
     */
    @LispMethod(comment = "Filter TOKENIZATION against STRINGS.")
    public static SubLObject npp_filter_tokens(final SubLObject tokenization, final SubLObject strings) {
        SubLObject cdolist_list_var = tokenization;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject filtered = NIL;
            final SubLObject actual_string = string_utilities.bunge(subseq(strings, standard_tokenization.interval_token_start(token), standard_tokenization.interval_token_end(token)), UNPROVIDED);
            final SubLObject value = standard_tokenization.interval_token_value(token);
            SubLObject cdolist_list_var_$1;
            final SubLObject structs = cdolist_list_var_$1 = standard_tokenization.string_token_value(value);
            SubLObject struct = NIL;
            struct = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                if (NIL == npp_bad_entryP(struct, actual_string)) {
                    filtered = cons(struct, filtered);
                }
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                struct = cdolist_list_var_$1.first();
            } 
            standard_tokenization.string_token_string_set(value, actual_string);
            standard_tokenization.string_token_value_set(value, filtered);
            standard_tokenization.interval_token_value_set(token, value);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        return tokenization;
    }

    /**
     *
     *
     * @return BOOLEAN; Is ENTRY a bad entry for STRING?
     */
    @LispMethod(comment = "@return BOOLEAN; Is ENTRY a bad entry for STRING?")
    public static final SubLObject npp_bad_entryP_alt(SubLObject entry, SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject okP = NIL;
                SubLObject entry_semantic_mt = nl_trie.nl_trie_entry_semantic_mt(entry);
                SubLObject mt = (NIL != entry_semantic_mt) ? ((SubLObject) (entry_semantic_mt)) : nl_trie.nl_trie_entry_mt(entry);
                if (NIL != lexicon_accessors.genl_lexicon_mtP(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), mt)) {
                    if (NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) {
                        okP = T;
                    } else {
                        if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                            {
                                SubLObject pcase_var = nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
                                if (pcase_var.eql($$abbreviationForLexicalWord)) {
                                    {
                                        SubLObject wu = nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED);
                                        if (NIL != indexed_term_p(wu)) {
                                            {
                                                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                                                {
                                                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                                    try {
                                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                                        if (NIL == okP) {
                                                            {
                                                                SubLObject csome_list_var = kb_mapping_utilities.pred_values(wu, $$abbreviationForLexicalWord, ONE_INTEGER, THREE_INTEGER, UNPROVIDED);
                                                                SubLObject good_string = NIL;
                                                                for (good_string = csome_list_var.first(); !((NIL != okP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , good_string = csome_list_var.first()) {
                                                                    okP = Strings.stringE(good_string, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    okP = T;
                                }
                            }
                        }
                    }
                }
                return makeBoolean(NIL == okP);
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is ENTRY a bad entry for STRING?
     */
    @LispMethod(comment = "@return BOOLEAN; Is ENTRY a bad entry for STRING?")
    public static SubLObject npp_bad_entryP(final SubLObject entry, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = NIL;
        final SubLObject entry_semantic_mt = nl_trie.nl_trie_entry_semantic_mt(entry);
        final SubLObject mt = (NIL != entry_semantic_mt) ? entry_semantic_mt : nl_trie.nl_trie_entry_mt(entry);
        if (NIL != lexicon_accessors.genl_lexicon_mtP(lexicon_vars.$lexicon_lookup_mt$.getDynamicValue(thread), mt)) {
            if (NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) {
                okP = T;
            } else
                if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
                    final SubLObject pcase_var = nl_trie.nl_trie_entry_semantic_pred(entry, UNPROVIDED);
                    if (pcase_var.eql($$abbreviationForLexicalWord)) {
                        final SubLObject wu = nl_trie.nl_trie_word_word_unit(entry, UNPROVIDED);
                        if (NIL != indexed_term_p(wu)) {
                            final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                            try {
                                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                if (NIL == okP) {
                                    SubLObject csome_list_var;
                                    SubLObject good_string;
                                    for (csome_list_var = kb_mapping_utilities.pred_values(wu, $$abbreviationForLexicalWord, ONE_INTEGER, THREE_INTEGER, UNPROVIDED), good_string = NIL, good_string = csome_list_var.first(); (NIL == okP) && (NIL != csome_list_var); okP = Strings.stringE(good_string, string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) , csome_list_var = csome_list_var.rest() , good_string = csome_list_var.first()) {
                                    }
                                }
                            } finally {
                                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                            }
                        }
                    } else {
                        okP = T;
                    }
                }

        }
        return makeBoolean(NIL == okP);
    }

    /**
     * Given STRING-LIST, representing an initial tokenization of an input string,
     * find items that are not recognized, and insert a best-guess value for them.
     *
     * @unknown LISTP of strings that were not recognized.
     */
    @LispMethod(comment = "Given STRING-LIST, representing an initial tokenization of an input string,\r\nfind items that are not recognized, and insert a best-guess value for them.\r\n\r\n@unknown LISTP of strings that were not recognized.\nGiven STRING-LIST, representing an initial tokenization of an input string,\nfind items that are not recognized, and insert a best-guess value for them.")
    public static final SubLObject npp_triefy_unknown_strings_alt(SubLObject string_list) {
        {
            SubLObject unknown_strings = list_utilities.remove_if_not($sym8$NPP_KNOWN_STRING_, string_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject cdolist_list_var = unknown_strings;
            SubLObject string = NIL;
            for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                com.cyc.cycjava.cycl.np_parser.npp_triefy_unknown_string(string);
            }
            return unknown_strings;
        }
    }

    /**
     * Given STRING-LIST, representing an initial tokenization of an input string,
     * find items that are not recognized, and insert a best-guess value for them.
     *
     * @unknown LISTP of strings that were not recognized.
     */
    @LispMethod(comment = "Given STRING-LIST, representing an initial tokenization of an input string,\r\nfind items that are not recognized, and insert a best-guess value for them.\r\n\r\n@unknown LISTP of strings that were not recognized.\nGiven STRING-LIST, representing an initial tokenization of an input string,\nfind items that are not recognized, and insert a best-guess value for them.")
    public static SubLObject npp_triefy_unknown_strings(final SubLObject string_list) {
        SubLObject cdolist_list_var;
        final SubLObject unknown_strings = cdolist_list_var = list_utilities.remove_if_not($sym7$NPP_KNOWN_STRING_, string_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            npp_triefy_unknown_string(string);
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return unknown_strings;
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject npp_triefy_unknown_string_alt(SubLObject string) {
        return NIL;
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject npp_triefy_unknown_string(final SubLObject string) {
        return NIL;
    }

    /**
     * Is STRING a known word for the purposes of the Noun Phrase Parser?
     *
     * @param ADD-NEW?
     * 		Should new morphologically derived forms be added to the trie?
     */
    @LispMethod(comment = "Is STRING a known word for the purposes of the Noun Phrase Parser?\r\n\r\n@param ADD-NEW?\r\n\t\tShould new morphologically derived forms be added to the trie?")
    public static final SubLObject npp_known_stringP_alt(SubLObject string, SubLObject add_newP) {
        if (add_newP == UNPROVIDED) {
            add_newP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject values = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
                SubLObject knownP = NIL;
                if (values.isList()) {
                    if (NIL == knownP) {
                        {
                            SubLObject csome_list_var = values;
                            SubLObject value = NIL;
                            for (value = csome_list_var.first(); !((NIL != knownP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , value = csome_list_var.first()) {
                                knownP = list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.np_parser.nl_trie_entry_to_value_type(value, $TRIPLES));
                            }
                        }
                    }
                }
                if (((NIL != lexicon_vars.$use_mwpP$.getDynamicValue(thread)) && (NIL == knownP)) || (NIL != $npp_always_use_mwpP$.getGlobalValue())) {
                    {
                        SubLObject _prev_bind_0 = lexicon_vars.$mwp_triefy_resultsP$.currentBinding(thread);
                        try {
                            lexicon_vars.$mwp_triefy_resultsP$.bind(add_newP, thread);
                            knownP = list_utilities.sublisp_boolean(morphological_word_parser.parse_affixes(string, UNPROVIDED));
                        } finally {
                            lexicon_vars.$mwp_triefy_resultsP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return knownP;
            }
        }
    }

    /**
     * Is STRING a known word for the purposes of the Noun Phrase Parser?
     *
     * @param ADD-NEW?
     * 		Should new morphologically derived forms be added to the trie?
     */
    @LispMethod(comment = "Is STRING a known word for the purposes of the Noun Phrase Parser?\r\n\r\n@param ADD-NEW?\r\n\t\tShould new morphologically derived forms be added to the trie?")
    public static SubLObject npp_known_stringP(final SubLObject string, SubLObject add_newP) {
        if (add_newP == UNPROVIDED) {
            add_newP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject values = nl_trie.nl_trie_search(string, UNPROVIDED, UNPROVIDED);
        SubLObject knownP = NIL;
        if (values.isList() && (NIL == knownP)) {
            SubLObject csome_list_var;
            SubLObject value;
            for (csome_list_var = values, value = NIL, value = csome_list_var.first(); (NIL == knownP) && (NIL != csome_list_var); knownP = list_utilities.sublisp_boolean(nl_trie_entry_to_value_type(value, $TRIPLES)) , csome_list_var = csome_list_var.rest() , value = csome_list_var.first()) {
            }
        }
        if (((NIL != lexicon_vars.$use_mwpP$.getDynamicValue(thread)) && (NIL == knownP)) || (NIL != $npp_always_use_mwpP$.getGlobalValue())) {
            final SubLObject _prev_bind_0 = lexicon_vars.$mwp_triefy_resultsP$.currentBinding(thread);
            try {
                lexicon_vars.$mwp_triefy_resultsP$.bind(add_newP, thread);
                knownP = list_utilities.sublisp_boolean(morphological_word_parser.parse_affixes(string, UNPROVIDED));
            } finally {
                lexicon_vars.$mwp_triefy_resultsP$.rebind(_prev_bind_0, thread);
            }
        }
        return knownP;
    }

    public static final SubLObject npp_init_excluded_denot_preds_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject v_instances = isa.all_fort_instances($const11$DenotationPredicate_ExcludedFromN, UNPROVIDED, UNPROVIDED);
                        $npp_denot_preds_to_exclude$.setDynamicValue(NIL != v_instances ? ((SubLObject) (v_instances)) : $NONE, thread);
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return $npp_denot_preds_to_exclude$.getDynamicValue(thread);
        }
    }

    public static SubLObject npp_init_excluded_denot_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject v_instances = isa.all_fort_instances($const10$DenotationPredicate_ExcludedFromN, UNPROVIDED, UNPROVIDED);
            $npp_denot_preds_to_exclude$.setDynamicValue(NIL != v_instances ? v_instances : $NONE, thread);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $npp_denot_preds_to_exclude$.getDynamicValue(thread);
    }

    public static final SubLObject npp_excluded_denot_predP_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $npp_denot_preds_to_exclude$.getDynamicValue(thread)) {
                com.cyc.cycjava.cycl.np_parser.npp_init_excluded_denot_preds();
            }
            return makeBoolean(($npp_denot_preds_to_exclude$.getDynamicValue(thread) != $NONE) && (NIL != find(v_object, $npp_denot_preds_to_exclude$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
        }
    }

    public static SubLObject npp_excluded_denot_predP(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $npp_denot_preds_to_exclude$.getDynamicValue(thread)) {
            npp_init_excluded_denot_preds();
        }
        return makeBoolean(($npp_denot_preds_to_exclude$.getDynamicValue(thread) != $NONE) && (NIL != find(v_object, $npp_denot_preds_to_exclude$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)));
    }

    /**
     * Convert list of lists of string tokens from *NL-TRIE*-style to *NP-TRIE* style.
     */
    @LispMethod(comment = "Convert list of lists of string tokens from *NL-TRIE*-style to *NP-TRIE* style.")
    public static final SubLObject npp_convert_chunkings_alt(SubLObject chunkings, SubLObject value_type) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = chunkings;
            SubLObject chunking = NIL;
            for (chunking = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , chunking = cdolist_list_var.first()) {
                ans = cons(com.cyc.cycjava.cycl.np_parser.npp_convert_string_tokens(chunking, value_type), ans);
            }
            return ans;
        }
    }

    /**
     * Convert list of lists of string tokens from *NL-TRIE*-style to *NP-TRIE* style.
     */
    @LispMethod(comment = "Convert list of lists of string tokens from *NL-TRIE*-style to *NP-TRIE* style.")
    public static SubLObject npp_convert_chunkings(final SubLObject chunkings, final SubLObject value_type) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = chunkings;
        SubLObject chunking = NIL;
        chunking = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(npp_convert_string_tokens(chunking, value_type), ans);
            cdolist_list_var = cdolist_list_var.rest();
            chunking = cdolist_list_var.first();
        } 
        return ans;
    }

    /**
     * Convert *NL-TRIE*-style string token list to *NP-TRIE* style.
     */
    @LispMethod(comment = "Convert *NL-TRIE*-style string token list to *NP-TRIE* style.")
    public static final SubLObject npp_convert_string_tokens_alt(SubLObject tokens, SubLObject value_type) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = tokens;
            SubLObject token = NIL;
            for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                ans = cons(com.cyc.cycjava.cycl.np_parser.npp_convert_string_token(token, value_type), ans);
            }
            return nreverse(ans);
        }
    }

    /**
     * Convert *NL-TRIE*-style string token list to *NP-TRIE* style.
     */
    @LispMethod(comment = "Convert *NL-TRIE*-style string token list to *NP-TRIE* style.")
    public static SubLObject npp_convert_string_tokens(final SubLObject tokens, final SubLObject value_type) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(npp_convert_string_token(token, value_type), ans);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        return nreverse(ans);
    }

    /**
     * Convert *NL-TRIE*-style interval token list to *NP-TRIE* style.
     */
    @LispMethod(comment = "Convert *NL-TRIE*-style interval token list to *NP-TRIE* style.")
    public static final SubLObject npp_convert_interval_tokens_alt(SubLObject tokens, SubLObject value_type) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = tokens;
            SubLObject token = NIL;
            for (token = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , token = cdolist_list_var.first()) {
                {
                    SubLObject converted_token = com.cyc.cycjava.cycl.np_parser.npp_convert_interval_token(token, value_type);
                    if (NIL != standard_tokenization.interval_token_value(converted_token)) {
                        ans = cons(converted_token, ans);
                    }
                }
            }
            return ans;
        }
    }

    /**
     * Convert *NL-TRIE*-style interval token list to *NP-TRIE* style.
     */
    @LispMethod(comment = "Convert *NL-TRIE*-style interval token list to *NP-TRIE* style.")
    public static SubLObject npp_convert_interval_tokens(final SubLObject tokens, final SubLObject value_type) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = NIL;
        token = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject converted_token = npp_convert_interval_token(token, value_type);
            if (NIL != standard_tokenization.interval_token_value(converted_token)) {
                ans = cons(converted_token, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        } 
        return ans;
    }

    /**
     * Convert a single *NL-TRIE*-style string token to *NP-TRIE* style
     */
    @LispMethod(comment = "Convert a single *NL-TRIE*-style string token to *NP-TRIE* style")
    public static final SubLObject npp_convert_string_token_alt(SubLObject token, SubLObject value_type) {
        {
            SubLObject ans = standard_tokenization.copy_string_token(token);
            SubLObject values = NIL;
            SubLObject cdolist_list_var = standard_tokenization.string_token_value(token);
            SubLObject entry = NIL;
            for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_2 = com.cyc.cycjava.cycl.np_parser.nl_trie_entry_to_value_type(entry, value_type);
                    SubLObject value = NIL;
                    for (value = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , value = cdolist_list_var_2.first()) {
                        values = cons(value, values);
                    }
                }
            }
            standard_tokenization.string_token_value_set(ans, values);
            return ans;
        }
    }

    /**
     * Convert a single *NL-TRIE*-style string token to *NP-TRIE* style
     */
    @LispMethod(comment = "Convert a single *NL-TRIE*-style string token to *NP-TRIE* style")
    public static SubLObject npp_convert_string_token(final SubLObject token, final SubLObject value_type) {
        final SubLObject ans = standard_tokenization.copy_string_token(token);
        SubLObject values = NIL;
        SubLObject cdolist_list_var = standard_tokenization.string_token_value(token);
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$2 = nl_trie_entry_to_value_type(entry, value_type);
            SubLObject value = NIL;
            value = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                values = cons(value, values);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                value = cdolist_list_var_$2.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        standard_tokenization.string_token_value_set(ans, values);
        return ans;
    }

    /**
     * Convert a single *NL-TRIE*-style interval token to *NP-TRIE* style
     */
    @LispMethod(comment = "Convert a single *NL-TRIE*-style interval token to *NP-TRIE* style")
    public static final SubLObject npp_convert_interval_token_alt(SubLObject token, SubLObject value_type) {
        {
            SubLObject input_value = standard_tokenization.interval_token_value(token);
            SubLObject nl_trie_entries = standard_tokenization.string_token_value(input_value);
            SubLObject new_values = NIL;
            {
                SubLObject cdolist_list_var = nl_trie_entries;
                SubLObject entry = NIL;
                for (entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , entry = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_3 = com.cyc.cycjava.cycl.np_parser.nl_trie_entry_to_value_type(entry, value_type);
                        SubLObject value = NIL;
                        for (value = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , value = cdolist_list_var_3.first()) {
                            {
                                SubLObject item_var = value;
                                if (NIL == member(item_var, new_values, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                                    new_values = cons(item_var, new_values);
                                }
                            }
                        }
                    }
                }
            }
            {
                SubLObject filtered_values = NIL;
                SubLObject cdolist_list_var = new_values;
                SubLObject value = NIL;
                for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                    if (com.cyc.cycjava.cycl.np_parser.npp_value_denot(value) != $NO_DENOT) {
                        filtered_values = cons(value, filtered_values);
                    } else {
                        if (NIL != member(value, remove(value, new_values, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NPP_VALUES_SAME_EXCEPT_FOR_DENOT_P, UNPROVIDED)) {
                        } else {
                            filtered_values = cons(value, filtered_values);
                        }
                    }
                }
                standard_tokenization.string_token_value_set(input_value, filtered_values);
            }
            standard_tokenization.interval_token_value_set(token, input_value);
            return token;
        }
    }

    /**
     * Convert a single *NL-TRIE*-style interval token to *NP-TRIE* style
     */
    @LispMethod(comment = "Convert a single *NL-TRIE*-style interval token to *NP-TRIE* style")
    public static SubLObject npp_convert_interval_token(final SubLObject token, final SubLObject value_type) {
        final SubLObject input_value = standard_tokenization.interval_token_value(token);
        final SubLObject nl_trie_entries = standard_tokenization.string_token_value(input_value);
        SubLObject new_values = NIL;
        SubLObject cdolist_list_var = nl_trie_entries;
        SubLObject entry = NIL;
        entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$3 = nl_trie_entry_to_value_type(entry, value_type);
            SubLObject value = NIL;
            value = cdolist_list_var_$3.first();
            while (NIL != cdolist_list_var_$3) {
                final SubLObject item_var = value;
                if (NIL == member(item_var, new_values, symbol_function(EQUALP), symbol_function(IDENTITY))) {
                    new_values = cons(item_var, new_values);
                }
                cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                value = cdolist_list_var_$3.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            entry = cdolist_list_var.first();
        } 
        SubLObject filtered_values = NIL;
        SubLObject cdolist_list_var2 = new_values;
        SubLObject value2 = NIL;
        value2 = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (npp_value_denot(value2) != $NO_DENOT) {
                filtered_values = cons(value2, filtered_values);
            } else
                if (NIL == member(value2, remove(value2, new_values, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NPP_VALUES_SAME_EXCEPT_FOR_DENOT_P, UNPROVIDED)) {
                    filtered_values = cons(value2, filtered_values);
                }

            cdolist_list_var2 = cdolist_list_var2.rest();
            value2 = cdolist_list_var2.first();
        } 
        standard_tokenization.string_token_value_set(input_value, filtered_values);
        standard_tokenization.interval_token_value_set(token, input_value);
        return token;
    }

    /**
     *
     *
     * @param TOKENS;
     * 		listp of INTERVAL-TOKEN-P.
     */
    @LispMethod(comment = "@param TOKENS;\r\n\t\tlistp of INTERVAL-TOKEN-P.")
    public static final SubLObject npp_add_original_string_tokens_alt(SubLObject tokens, SubLObject strings, SubLObject value_type) {
        {
            SubLObject length = length(strings);
            SubLObject end_var = length;
            SubLObject start = NIL;
            for (start = ZERO_INTEGER; !start.numGE(end_var); start = number_utilities.f_1X(start)) {
                {
                    SubLObject end_var_4 = number_utilities.f_1X(length);
                    SubLObject end = NIL;
                    for (end = number_utilities.f_1X(start); !end.numGE(end_var_4); end = number_utilities.f_1X(end)) {
                        {
                            SubLObject string = string_utilities.bunge(subseq(strings, start, end), UNPROVIDED);
                            SubLObject original_string_tuple = com.cyc.cycjava.cycl.np_parser.npp_make_original_string_value(value_type, string);
                            SubLObject existing_token = find(start, list_utilities.find_all(end, tokens, symbol_function(EQL), INTERVAL_TOKEN_END), symbol_function(EQL), INTERVAL_TOKEN_START, UNPROVIDED, UNPROVIDED);
                            if (NIL != existing_token) {
                                {
                                    SubLObject existing_token_value = standard_tokenization.interval_token_value(existing_token);
                                    SubLObject existing_token_tuples = standard_tokenization.string_token_value(existing_token_value);
                                    SubLObject new_tuples = cons(original_string_tuple, existing_token_tuples);
                                    standard_tokenization.string_token_value_set(existing_token_value, new_tuples);
                                }
                            } else {
                                {
                                    SubLObject value = standard_tokenization.new_string_token(string, list(original_string_tuple));
                                    SubLObject new_token = standard_tokenization.new_interval_token(start, end, value);
                                    tokens = cons(new_token, tokens);
                                }
                            }
                        }
                    }
                }
            }
            return tokens;
        }
    }

    /**
     *
     *
     * @param TOKENS;
     * 		listp of INTERVAL-TOKEN-P.
     */
    @LispMethod(comment = "@param TOKENS;\r\n\t\tlistp of INTERVAL-TOKEN-P.")
    public static SubLObject npp_add_original_string_tokens(SubLObject tokens, final SubLObject strings, final SubLObject value_type) {
        SubLObject end_var;
        SubLObject length;
        SubLObject start;
        SubLObject end_var_$4;
        SubLObject end;
        SubLObject string;
        SubLObject original_string_tuple;
        SubLObject existing_token;
        SubLObject existing_token_value;
        SubLObject existing_token_tuples;
        SubLObject new_tuples;
        SubLObject value;
        SubLObject new_token;
        for (length = end_var = length(strings), start = NIL, start = ZERO_INTEGER; !start.numGE(end_var); start = number_utilities.f_1X(start)) {
            for (end_var_$4 = number_utilities.f_1X(length), end = NIL, end = number_utilities.f_1X(start); !end.numGE(end_var_$4); end = number_utilities.f_1X(end)) {
                string = string_utilities.bunge(subseq(strings, start, end), UNPROVIDED);
                original_string_tuple = npp_make_original_string_value(value_type, string);
                existing_token = find(start, list_utilities.find_all(end, tokens, symbol_function(EQL), INTERVAL_TOKEN_END), symbol_function(EQL), INTERVAL_TOKEN_START, UNPROVIDED, UNPROVIDED);
                if (NIL != existing_token) {
                    existing_token_value = standard_tokenization.interval_token_value(existing_token);
                    existing_token_tuples = standard_tokenization.string_token_value(existing_token_value);
                    new_tuples = cons(original_string_tuple, existing_token_tuples);
                    standard_tokenization.string_token_value_set(existing_token_value, new_tuples);
                } else {
                    value = standard_tokenization.new_string_token(string, list(original_string_tuple));
                    new_token = standard_tokenization.new_interval_token(start, end, value);
                    tokens = cons(new_token, tokens);
                }
            }
        }
        return tokens;
    }

    public static final SubLObject npp_make_original_string_value_alt(SubLObject value_type, SubLObject original_string) {
        return com.cyc.cycjava.cycl.np_parser.make_npp_value_type(value_type, original_string, $$CharacterString, $ORIGINAL_STRING, UNPROVIDED);
    }

    public static SubLObject npp_make_original_string_value(final SubLObject value_type, final SubLObject original_string) {
        return make_npp_value_type(value_type, original_string, $$CharacterString, $ORIGINAL_STRING, UNPROVIDED);
    }

    public static final SubLObject nl_trie_entry_to_value_type_alt(SubLObject entry, SubLObject value_type) {
        if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
            return com.cyc.cycjava.cycl.np_parser.nl_trie_word_to_value_type(entry, value_type);
        } else {
            if (NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) {
                return com.cyc.cycjava.cycl.np_parser.nl_trie_name_to_value_type(entry, value_type);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject nl_trie_entry_to_value_type(final SubLObject entry, final SubLObject value_type) {
        if (NIL != nl_trie.nl_trie_word_p(entry, UNPROVIDED)) {
            return nl_trie_word_to_value_type(entry, value_type);
        }
        if (NIL != nl_trie.nl_trie_name_p(entry, UNPROVIDED)) {
            return nl_trie_name_to_value_type(entry, value_type);
        }
        return NIL;
    }

    /**
     *
     *
     * @return LISTP of values of type VALUE-TYPE.
     */
    @LispMethod(comment = "@return LISTP of values of type VALUE-TYPE.")
    public static final SubLObject nl_trie_word_to_value_type_alt(SubLObject word, SubLObject value_type) {
        {
            SubLObject pos = com.cyc.cycjava.cycl.np_parser.npp_canonicalize_pos(nl_trie.nl_trie_word_pos(word), UNPROVIDED);
            SubLObject lex_pred = nl_trie.nl_trie_entry_semantic_pred(word, UNPROVIDED);
            SubLObject ans = NIL;
            SubLObject denots = (NIL != com.cyc.cycjava.cycl.np_parser.npp_excluded_denot_predP(lex_pred)) ? ((SubLObject) (NIL)) : nl_trie.nl_trie_entry_denots(word);
            if ((NIL != denots) || (NIL != com.cyc.cycjava.cycl.np_parser.npp_ok_with_no_denotsP(word))) {
                {
                    SubLObject pcase_var = value_type;
                    if (pcase_var.eql($TRIPLES)) {
                        if (NIL != denots) {
                            {
                                SubLObject cdolist_list_var = denots;
                                SubLObject denot = NIL;
                                for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                    {
                                        SubLObject cdolist_list_var_5 = nl_trie.nl_trie_word_pos_preds(word);
                                        SubLObject pred = NIL;
                                        for (pred = cdolist_list_var_5.first(); NIL != cdolist_list_var_5; cdolist_list_var_5 = cdolist_list_var_5.rest() , pred = cdolist_list_var_5.first()) {
                                            ans = cons(list(denot, pos, pred), ans);
                                        }
                                    }
                                }
                            }
                        } else {
                            {
                                SubLObject cdolist_list_var = nl_trie.nl_trie_word_pos_preds(word);
                                SubLObject pred = NIL;
                                for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                    ans = cons(list($NO_DENOT, pos, pred), ans);
                                }
                            }
                        }
                    } else {
                        if (pcase_var.eql($QUADS)) {
                            {
                                SubLObject wu = (NIL != lexicon_utilities.stringlist_args_of_pred_cached(lex_pred)) ? ((SubLObject) (NIL)) : nl_trie.nl_trie_word_word_unit(word, UNPROVIDED);
                                if (NIL != denots) {
                                    {
                                        SubLObject cdolist_list_var = denots;
                                        SubLObject denot = NIL;
                                        for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                                            {
                                                SubLObject cdolist_list_var_6 = nl_trie.nl_trie_word_pos_preds(word);
                                                SubLObject pred = NIL;
                                                for (pred = cdolist_list_var_6.first(); NIL != cdolist_list_var_6; cdolist_list_var_6 = cdolist_list_var_6.rest() , pred = cdolist_list_var_6.first()) {
                                                    ans = cons(list(denot, pos, pred, wu), ans);
                                                }
                                            }
                                        }
                                    }
                                } else {
                                    {
                                        SubLObject cdolist_list_var = nl_trie.nl_trie_word_pos_preds(word);
                                        SubLObject pred = NIL;
                                        for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                            ans = cons(list($NO_DENOT, pos, pred, wu), ans);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return LISTP of values of type VALUE-TYPE.
     */
    @LispMethod(comment = "@return LISTP of values of type VALUE-TYPE.")
    public static SubLObject nl_trie_word_to_value_type(final SubLObject word, final SubLObject value_type) {
        final SubLObject pos = npp_canonicalize_pos(nl_trie.nl_trie_word_pos(word), UNPROVIDED);
        final SubLObject lex_pred = nl_trie.nl_trie_entry_semantic_pred(word, UNPROVIDED);
        SubLObject ans = NIL;
        final SubLObject denots = (NIL != npp_excluded_denot_predP(lex_pred)) ? NIL : nl_trie.nl_trie_entry_denots(word);
        if ((NIL != denots) || (NIL != npp_ok_with_no_denotsP(word))) {
            if (value_type.eql($TRIPLES)) {
                if (NIL != denots) {
                    SubLObject cdolist_list_var = denots;
                    SubLObject denot = NIL;
                    denot = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject cdolist_list_var_$5 = nl_trie.nl_trie_word_pos_preds(word);
                        SubLObject pred = NIL;
                        pred = cdolist_list_var_$5.first();
                        while (NIL != cdolist_list_var_$5) {
                            ans = cons(list(denot, pos, pred), ans);
                            cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                            pred = cdolist_list_var_$5.first();
                        } 
                        cdolist_list_var = cdolist_list_var.rest();
                        denot = cdolist_list_var.first();
                    } 
                } else {
                    SubLObject cdolist_list_var = nl_trie.nl_trie_word_pos_preds(word);
                    SubLObject pred2 = NIL;
                    pred2 = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        ans = cons(list($NO_DENOT, pos, pred2), ans);
                        cdolist_list_var = cdolist_list_var.rest();
                        pred2 = cdolist_list_var.first();
                    } 
                }
            } else
                if (value_type.eql($QUADS)) {
                    final SubLObject wu = (NIL != lexicon_utilities.stringlist_args_of_pred_cached(lex_pred)) ? NIL : nl_trie.nl_trie_word_word_unit(word, UNPROVIDED);
                    if (NIL != denots) {
                        SubLObject cdolist_list_var2 = denots;
                        SubLObject denot2 = NIL;
                        denot2 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$6 = nl_trie.nl_trie_word_pos_preds(word);
                            SubLObject pred3 = NIL;
                            pred3 = cdolist_list_var_$6.first();
                            while (NIL != cdolist_list_var_$6) {
                                ans = cons(list(denot2, pos, pred3, wu), ans);
                                cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                                pred3 = cdolist_list_var_$6.first();
                            } 
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            denot2 = cdolist_list_var2.first();
                        } 
                    } else {
                        SubLObject cdolist_list_var2 = nl_trie.nl_trie_word_pos_preds(word);
                        SubLObject pred4 = NIL;
                        pred4 = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            ans = cons(list($NO_DENOT, pos, pred4, wu), ans);
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            pred4 = cdolist_list_var2.first();
                        } 
                    }
                }

        }
        return ans;
    }

    public static final SubLObject npp_value_denot_alt(SubLObject value) {
        return value.first();
    }

    public static SubLObject npp_value_denot(final SubLObject value) {
        return value.first();
    }

    public static final SubLObject npp_values_same_except_for_denot_p_alt(SubLObject value1, SubLObject value2) {
        return equal(value1.rest(), value2.rest());
    }

    public static SubLObject npp_values_same_except_for_denot_p(final SubLObject value1, final SubLObject value2) {
        return equal(value1.rest(), value2.rest());
    }

    public static final SubLObject npp_value_typeP_alt(SubLObject v_object, SubLObject value_type) {
        {
            SubLObject pcase_var = value_type;
            if (pcase_var.eql($TRIPLES)) {
                return com.cyc.cycjava.cycl.np_parser.npp_tripleP(v_object);
            } else {
                if (pcase_var.eql($QUADS)) {
                    return com.cyc.cycjava.cycl.np_parser.npp_quadP(v_object);
                } else {
                    Errors.sublisp_break($str_alt19$_S_is_not_a_valid_NPP_value_type, new SubLObject[]{ value_type });
                }
            }
        }
        return NIL;
    }

    public static SubLObject npp_value_typeP(final SubLObject v_object, final SubLObject value_type) {
        if (value_type.eql($TRIPLES)) {
            return npp_tripleP(v_object);
        }
        if (value_type.eql($QUADS)) {
            return npp_quadP(v_object);
        }
        Errors.sublisp_break($str18$_S_is_not_a_valid_NPP_value_type, new SubLObject[]{ value_type });
        return NIL;
    }

    public static final SubLObject npp_values_of_typeP_alt(SubLObject values, SubLObject value_type) {
        {
            SubLObject badP = NIL;
            if (NIL == badP) {
                {
                    SubLObject csome_list_var = values;
                    SubLObject value = NIL;
                    for (value = csome_list_var.first(); !((NIL != badP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , value = csome_list_var.first()) {
                        badP = makeBoolean(NIL == com.cyc.cycjava.cycl.np_parser.npp_value_typeP(value, value_type));
                    }
                }
            }
            return makeBoolean(NIL == badP);
        }
    }

    public static SubLObject npp_values_of_typeP(final SubLObject values, final SubLObject value_type) {
        SubLObject badP = NIL;
        if (NIL == badP) {
            SubLObject csome_list_var;
            SubLObject value;
            for (csome_list_var = values, value = NIL, value = csome_list_var.first(); (NIL == badP) && (NIL != csome_list_var); badP = makeBoolean(NIL == npp_value_typeP(value, value_type)) , csome_list_var = csome_list_var.rest() , value = csome_list_var.first()) {
            }
        }
        return makeBoolean(NIL == badP);
    }

    public static final SubLObject npp_tripleP_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.np_parser.npp_proper_tripleP(v_object)) || (NIL != com.cyc.cycjava.cycl.np_parser.npp_original_string_triple_p(v_object)));
    }

    public static SubLObject npp_tripleP(final SubLObject v_object) {
        return makeBoolean((NIL != npp_proper_tripleP(v_object)) || (NIL != npp_original_string_triple_p(v_object)));
    }

    public static final SubLObject npp_proper_tripleP_alt(SubLObject v_object) {
        return makeBoolean(((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.np_parser.npp_denot_p(v_object.first()))) && (NIL != com.cyc.cycjava.cycl.np_parser.npp_posP(second(v_object)))) && (NIL != com.cyc.cycjava.cycl.np_parser.npp_predP(third(v_object))));
    }

    public static SubLObject npp_proper_tripleP(final SubLObject v_object) {
        return makeBoolean(((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && (NIL != npp_denot_p(v_object.first()))) && (NIL != npp_posP(second(v_object)))) && (NIL != npp_predP(third(v_object))));
    }

    public static final SubLObject npp_original_string_triple_p_alt(SubLObject v_object) {
        return makeBoolean(((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && v_object.first().isString()) && (second(v_object) == $$CharacterString)) && (third(v_object) == $ORIGINAL_STRING));
    }

    public static SubLObject npp_original_string_triple_p(final SubLObject v_object) {
        return makeBoolean(((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, THREE_INTEGER, UNPROVIDED))) && v_object.first().isString()) && second(v_object).eql($$CharacterString)) && (third(v_object) == $ORIGINAL_STRING));
    }

    public static final SubLObject npp_quadP_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.np_parser.npp_proper_quadP(v_object);
    }

    public static SubLObject npp_quadP(final SubLObject v_object) {
        return npp_proper_quadP(v_object);
    }

    public static final SubLObject npp_proper_quadP_alt(SubLObject v_object) {
        return makeBoolean((((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && (NIL != com.cyc.cycjava.cycl.np_parser.npp_denot_p(v_object.first()))) && (NIL != com.cyc.cycjava.cycl.np_parser.npp_posP(second(v_object)))) && (NIL != com.cyc.cycjava.cycl.np_parser.npp_predP(third(v_object)))) && (NIL != com.cyc.cycjava.cycl.np_parser.npp_wuP(fourth(v_object))));
    }

    public static SubLObject npp_proper_quadP(final SubLObject v_object) {
        return makeBoolean((((((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, FOUR_INTEGER, UNPROVIDED))) && (NIL != npp_denot_p(v_object.first()))) && (NIL != npp_posP(second(v_object)))) && (NIL != npp_predP(third(v_object)))) && (NIL != npp_wuP(fourth(v_object))));
    }

    public static final SubLObject npp_denot_p_alt(SubLObject v_object) {
        return makeBoolean(((v_object == $NO_DENOT) || (NIL != forts.fort_p(v_object))) || (NIL != narts_high.naut_p(v_object)));
    }

    public static SubLObject npp_denot_p(final SubLObject v_object) {
        return makeBoolean(((v_object == $NO_DENOT) || (NIL != forts.fort_p(v_object))) || (NIL != narts_high.naut_p(v_object)));
    }

    public static final SubLObject npp_posP_alt(SubLObject v_object) {
        return makeBoolean((v_object == $$NounPhrase) || (NIL != lexicon_accessors.speech_partP(v_object, UNPROVIDED)));
    }

    public static SubLObject npp_posP(final SubLObject v_object) {
        return makeBoolean(v_object.eql($$NounPhrase) || (NIL != lexicon_accessors.speech_partP(v_object, UNPROVIDED)));
    }

    public static final SubLObject npp_predP_alt(SubLObject v_object) {
        return makeBoolean((NIL != lexicon_accessors.speech_part_predP(v_object, UNPROVIDED)) || (NIL != lexicon_vars.name_string_predP(v_object)));
    }

    public static SubLObject npp_predP(final SubLObject v_object) {
        return makeBoolean((NIL != lexicon_accessors.speech_part_predP(v_object, UNPROVIDED)) || (NIL != lexicon_vars.name_string_predP(v_object)));
    }

    public static final SubLObject npp_wuP_alt(SubLObject v_object) {
        return lexicon_accessors.quick_lexical_wordP(v_object, UNPROVIDED);
    }

    public static SubLObject npp_wuP(final SubLObject v_object) {
        return lexicon_accessors.quick_lexical_wordP(v_object, UNPROVIDED);
    }

    public static final SubLObject make_npp_value_type_alt(SubLObject value_type, SubLObject denot, SubLObject pos, SubLObject pred, SubLObject wu) {
        if (wu == UNPROVIDED) {
            wu = NIL;
        }
        {
            SubLObject pcase_var = value_type;
            if (pcase_var.eql($TRIPLES)) {
                return com.cyc.cycjava.cycl.np_parser.make_npp_triple(denot, pos, pred);
            } else {
                if (pcase_var.eql($QUADS)) {
                    return com.cyc.cycjava.cycl.np_parser.make_npp_quad(denot, pos, pred, wu);
                } else {
                    Errors.sublisp_break($str_alt21$Don_t_know_how_to_make_NPP_value_, new SubLObject[]{ value_type });
                }
            }
        }
        return NIL;
    }

    public static SubLObject make_npp_value_type(final SubLObject value_type, final SubLObject denot, final SubLObject pos, final SubLObject pred, SubLObject wu) {
        if (wu == UNPROVIDED) {
            wu = NIL;
        }
        if (value_type.eql($TRIPLES)) {
            return make_npp_triple(denot, pos, pred);
        }
        if (value_type.eql($QUADS)) {
            return make_npp_quad(denot, pos, pred, wu);
        }
        Errors.sublisp_break($str20$Don_t_know_how_to_make_NPP_value_, new SubLObject[]{ value_type });
        return NIL;
    }

    public static final SubLObject make_npp_triple_alt(SubLObject denot, SubLObject pos, SubLObject pred) {
        return list(denot, pos, pred);
    }

    public static SubLObject make_npp_triple(final SubLObject denot, final SubLObject pos, final SubLObject pred) {
        return list(denot, pos, pred);
    }

    public static final SubLObject make_npp_quad_alt(SubLObject denot, SubLObject pos, SubLObject pred, SubLObject wu) {
        return list(denot, pos, pred, wu);
    }

    public static SubLObject make_npp_quad(final SubLObject denot, final SubLObject pos, final SubLObject pred, final SubLObject wu) {
        return list(denot, pos, pred, wu);
    }

    /**
     *
     *
     * @return SPEECH-PART?; The genl of POS to use for parsing.
     */
    @LispMethod(comment = "@return SPEECH-PART?; The genl of POS to use for parsing.")
    public static final SubLObject npp_canonicalize_pos_alt(SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject table = com.cyc.cycjava.cycl.np_parser.npp_canonical_pos_table(mt);
                thread.resetMultipleValues();
                {
                    SubLObject canonical_pos = dictionary.dictionary_lookup(table, pos, pos);
                    SubLObject changedP = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    return values(canonical_pos, changedP);
                }
            }
        }
    }

    /**
     *
     *
     * @return SPEECH-PART?; The genl of POS to use for parsing.
     */
    @LispMethod(comment = "@return SPEECH-PART?; The genl of POS to use for parsing.")
    public static SubLObject npp_canonicalize_pos(final SubLObject pos, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject table = npp_canonical_pos_table(mt);
        thread.resetMultipleValues();
        final SubLObject canonical_pos = dictionary.dictionary_lookup(table, pos, pos);
        final SubLObject changedP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(canonical_pos, changedP);
    }

    public static final SubLObject clear_npp_canonical_pos_table_alt() {
        {
            SubLObject cs = $npp_canonical_pos_table_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_npp_canonical_pos_table() {
        final SubLObject cs = $npp_canonical_pos_table_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_npp_canonical_pos_table_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($npp_canonical_pos_table_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_npp_canonical_pos_table(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($npp_canonical_pos_table_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject npp_canonical_pos_table_internal_alt(SubLObject mt) {
        {
            SubLObject table = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
            SubLObject constraint_poses = com.cyc.cycjava.cycl.np_parser.get_constraint_poses(mt);
            SubLObject cdolist_list_var = constraint_poses;
            SubLObject pos = NIL;
            for (pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos = cdolist_list_var.first()) {
                {
                    SubLObject subsumed_poses = com.cyc.cycjava.cycl.np_parser.get_subsumed_poses(pos, mt);
                    SubLObject cdolist_list_var_7 = subsumed_poses;
                    SubLObject subsumed_pos = NIL;
                    for (subsumed_pos = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , subsumed_pos = cdolist_list_var_7.first()) {
                        dictionary.dictionary_enter(table, subsumed_pos, pos);
                    }
                }
            }
            return table;
        }
    }

    public static SubLObject npp_canonical_pos_table_internal(final SubLObject mt) {
        final SubLObject table = dictionary.new_dictionary(UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject constraint_poses = cdolist_list_var = get_constraint_poses(mt);
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$7;
            final SubLObject subsumed_poses = cdolist_list_var_$7 = get_subsumed_poses(pos, mt);
            SubLObject subsumed_pos = NIL;
            subsumed_pos = cdolist_list_var_$7.first();
            while (NIL != cdolist_list_var_$7) {
                dictionary.dictionary_enter(table, subsumed_pos, pos);
                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                subsumed_pos = cdolist_list_var_$7.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return table;
    }

    public static final SubLObject npp_canonical_pos_table_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $npp_canonical_pos_table_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(NPP_CANONICAL_POS_TABLE, $npp_canonical_pos_table_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, $kw24$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw24$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.np_parser.npp_canonical_pos_table_internal(mt)));
                    memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject npp_canonical_pos_table(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $npp_canonical_pos_table_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(NPP_CANONICAL_POS_TABLE, $npp_canonical_pos_table_caching_state$, NIL, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(npp_canonical_pos_table_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject get_subsumed_poses_alt(SubLObject pos, SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject abortP = NIL;
                SubLObject subsumed_poses = NIL;
                if (NIL == abortP) {
                    {
                        SubLObject node_var = pos;
                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                        SubLObject recur_deck = deck.create_deck(deck_type);
                        {
                            SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject mt_var = mt;
                                    {
                                        SubLObject _prev_bind_0_8 = mt_relevance_macros.$mt$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                        try {
                                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                            {
                                                SubLObject tv_var = $$True_JustificationTruth;
                                                {
                                                    SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                        if (NIL != tv_var) {
                                                            if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                    {
                                                                        SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                        if (pcase_var.eql($ERROR)) {
                                                                            sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        } else {
                                                                            if (pcase_var.eql($CERROR)) {
                                                                                sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($WARN)) {
                                                                                    Errors.warn($str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                } else {
                                                                                    Errors.warn($str_alt36$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                    Errors.cerror($$$continue_anyway, $str_alt31$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        {
                                                            SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_12 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                            SubLObject _prev_bind_2_13 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                            SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            try {
                                                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pos, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                    {
                                                                        SubLObject _prev_bind_0_14 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_15 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_16 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                                                            while ((NIL != node_var) && (NIL == abortP)) {
                                                                                {
                                                                                    SubLObject spec = node_var;
                                                                                    if (spec == pos) {
                                                                                    } else {
                                                                                        if (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(spec, $$semTransPredForPOS, mt, UNPROVIDED, UNPROVIDED)) {
                                                                                            abortP = T;
                                                                                        } else {
                                                                                            subsumed_poses = cons(spec, subsumed_poses);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                {
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                                                                    SubLObject rest = NIL;
                                                                                    for (rest = accessible_modules; !((NIL != abortP) || (NIL == rest)); rest = rest.rest()) {
                                                                                        {
                                                                                            SubLObject module_var = rest.first();
                                                                                            {
                                                                                                SubLObject _prev_bind_0_17 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (!((NIL != abortP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt_19 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt_19)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_20 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt_19, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (!((NIL != abortP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state_21)))) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_21);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject rest_23 = NIL;
                                                                                                                                                                                for (rest_23 = new_list; !((NIL != abortP) || (NIL == rest_23)); rest_23 = rest_23.rest()) {
                                                                                                                                                                                    {
                                                                                                                                                                                        SubLObject node_vars_link_node = rest_23.first();
                                                                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_22, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_21 = dictionary_contents.do_dictionary_contents_next(iteration_state_21);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_21);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_20, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt39$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject rest_24 = NIL;
                                                                                                                    for (rest_24 = new_list; !((NIL != abortP) || (NIL == rest_24)); rest_24 = rest_24.rest()) {
                                                                                                                        {
                                                                                                                            SubLObject generating_fn = rest_24.first();
                                                                                                                            {
                                                                                                                                SubLObject _prev_bind_0_25 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                                try {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                    {
                                                                                                                                        SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                        SubLObject new_list_26 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                        SubLObject rest_27 = NIL;
                                                                                                                                        for (rest_27 = new_list_26; !((NIL != abortP) || (NIL == rest_27)); rest_27 = rest_27.rest()) {
                                                                                                                                            {
                                                                                                                                                SubLObject node_vars_link_node = rest_27.first();
                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                } finally {
                                                                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_25, thread);
                                                                                                                                }
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_18, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_17, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_16, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_15, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_14, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt40$Node__a_does_not_pass_sbhl_type_t, pos, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_13, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_12, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_11, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_10, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_9, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                                            mt_relevance_macros.$mt$.rebind(_prev_bind_0_8, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
                return NIL != abortP ? ((SubLObject) (NIL)) : subsumed_poses;
            }
        }
    }

    public static SubLObject get_subsumed_poses(final SubLObject pos, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject abortP = NIL;
        SubLObject subsumed_poses = NIL;
        if (NIL == abortP) {
            SubLObject node_var = pos;
            final SubLObject deck_type = $STACK;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject _prev_bind_0_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                        final SubLObject tv_var = $$True_JustificationTruth;
                        final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                if (pcase_var.eql($ERROR)) {
                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($CERROR)) {
                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($WARN)) {
                                            Errors.warn($str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        } else {
                                            Errors.warn($str34$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                            Errors.cerror($$$continue_anyway, $str29$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                        }


                            }
                            final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$13 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                            final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genls), thread);
                                if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(pos, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$12 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$14 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genls)), thread);
                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                        while ((NIL != node_var) && (NIL == abortP)) {
                                            final SubLObject spec = node_var;
                                            if (!spec.eql(pos)) {
                                                if (NIL != kb_mapping_utilities.some_pred_value_in_relevant_mts(spec, $$semTransPredForPOS, mt, UNPROVIDED, UNPROVIDED)) {
                                                    abortP = T;
                                                } else {
                                                    subsumed_poses = cons(spec, subsumed_poses);
                                                }
                                            }
                                            final SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genls));
                                            SubLObject rest;
                                            SubLObject module_var;
                                            SubLObject _prev_bind_0_$12;
                                            SubLObject _prev_bind_1_$13;
                                            SubLObject node;
                                            SubLObject d_link;
                                            SubLObject mt_links;
                                            SubLObject iteration_state;
                                            SubLObject mt_$19;
                                            SubLObject tv_links;
                                            SubLObject _prev_bind_0_$13;
                                            SubLObject iteration_state_$21;
                                            SubLObject tv;
                                            SubLObject link_nodes;
                                            SubLObject _prev_bind_0_$14;
                                            SubLObject sol;
                                            SubLObject set_contents_var;
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject node_vars_link_node;
                                            SubLObject csome_list_var;
                                            SubLObject node_vars_link_node2;
                                            SubLObject new_list;
                                            SubLObject rest_$23;
                                            SubLObject generating_fn;
                                            SubLObject _prev_bind_0_$15;
                                            SubLObject sol2;
                                            SubLObject link_nodes2;
                                            SubLObject set_contents_var2;
                                            SubLObject basis_object2;
                                            SubLObject state2;
                                            SubLObject node_vars_link_node3;
                                            SubLObject csome_list_var2;
                                            SubLObject node_vars_link_node4;
                                            for (rest = NIL, rest = accessible_modules; (NIL == abortP) && (NIL != rest); rest = rest.rest()) {
                                                module_var = rest.first();
                                                _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    node = function_terms.naut_to_nart(node_var);
                                                    if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                        d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                        if (NIL != d_link) {
                                                            mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != mt_links) {
                                                                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); (NIL == abortP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    mt_$19 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                    tv_links = thread.secondMultipleValue();
                                                                    thread.resetMultipleValues();
                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_$19)) {
                                                                        _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt_$19, thread);
                                                                            for (iteration_state_$21 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); (NIL == abortP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$21)); iteration_state_$21 = dictionary_contents.do_dictionary_contents_next(iteration_state_$21)) {
                                                                                thread.resetMultipleValues();
                                                                                tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$21);
                                                                                link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                        sol = link_nodes;
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            set_contents_var = set.do_set_internal(sol);
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == abortP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                if (NIL == abortP) {
                                                                                                    csome_list_var = sol;
                                                                                                    node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                                    while ((NIL == abortP) && (NIL != csome_list_var)) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                                    } 
                                                                                                }
                                                                                            } else {
                                                                                                Errors.error($str37$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$14, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$21);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$13, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str38$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            for (rest_$23 = NIL, rest_$23 = new_list; (NIL == abortP) && (NIL != rest_$23); rest_$23 = rest_$23.rest()) {
                                                                generating_fn = rest_$23.first();
                                                                _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    link_nodes2 = sol2 = funcall(generating_fn, node);
                                                                    if (NIL != set.set_p(sol2)) {
                                                                        set_contents_var2 = set.do_set_internal(sol2);
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); (NIL == abortP) && (NIL == set_contents.do_set_contents_doneP(basis_object2, state2)); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    } else
                                                                        if (sol2.isList()) {
                                                                            if (NIL == abortP) {
                                                                                csome_list_var2 = sol2;
                                                                                node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var2.first();
                                                                                while ((NIL == abortP) && (NIL != csome_list_var2)) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                                    node_vars_link_node4 = csome_list_var2.first();
                                                                                } 
                                                                            }
                                                                        } else {
                                                                            Errors.error($str37$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$15, thread);
                                                                }
                                                            }
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$12, thread);
                                                }
                                            }
                                            node_var = deck.deck_pop(recur_deck);
                                        } 
                                    } finally {
                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$14, thread);
                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$12, thread);
                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$11, thread);
                                    }
                                } else {
                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str39$Node__a_does_not_pass_sbhl_type_t, pos, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2_$13, thread);
                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$11, thread);
                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$10, thread);
                            }
                        } finally {
                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$10, thread);
                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$9, thread);
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$8, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
            }
        }
        return NIL != abortP ? NIL : subsumed_poses;
    }

    public static final SubLObject get_constraint_poses_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject all_constraint_poses = $code_constraint_poses$.getGlobalValue();
                if (NIL != kb_mapping_macros.do_function_extent_index_key_validator($$ConstituentTypeConstraintFn)) {
                    {
                        SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec($$ConstituentTypeConstraintFn);
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            {
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject tou = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                        SubLObject valid = makeBoolean(token_var != tou);
                                        if (NIL != valid) {
                                            {
                                                SubLObject nart = assertions_high.gaf_arg1(tou);
                                                SubLObject constituent_type = cycl_utilities.nat_arg2(nart, UNPROVIDED);
                                                if (NIL != lexicon_accessors.speech_partP(constituent_type, mt)) {
                                                    all_constraint_poses = cons(constituent_type, all_constraint_poses);
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        } finally {
                            {
                                SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                            all_constraint_poses = genls.min_cols(all_constraint_poses, UNPROVIDED, UNPROVIDED);
                        } finally {
                            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return all_constraint_poses;
            }
        }
    }

    public static SubLObject get_constraint_poses(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_constraint_poses = $code_constraint_poses$.getGlobalValue();
        if (NIL != kb_mapping_macros.do_function_extent_index_key_validator($$ConstituentTypeConstraintFn)) {
            final SubLObject final_index_spec = kb_mapping_macros.function_extent_final_index_spec($$ConstituentTypeConstraintFn);
            SubLObject final_index_iterator = NIL;
            try {
                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject tou = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(tou));
                    if (NIL != valid) {
                        final SubLObject nart = assertions_high.gaf_arg1(tou);
                        final SubLObject constituent_type = cycl_utilities.nat_arg2(nart, UNPROVIDED);
                        if (NIL != lexicon_accessors.speech_partP(constituent_type, mt)) {
                            all_constraint_poses = cons(constituent_type, all_constraint_poses);
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
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
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_4 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            all_constraint_poses = genls.min_cols(all_constraint_poses, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_4, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
        }
        return all_constraint_poses;
    }

    public static final SubLObject npp_ok_with_no_denotsP_alt(SubLObject word) {
        return makeBoolean(NIL == lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(word), $$ProperNoun, UNPROVIDED));
    }

    public static SubLObject npp_ok_with_no_denotsP(final SubLObject word) {
        return makeBoolean(NIL == lexicon_accessors.genl_posP(nl_trie.nl_trie_word_pos(word), $$ProperNoun, UNPROVIDED));
    }

    /**
     *
     *
     * @return LISTP of values of type VALUE-TYPE.
     */
    @LispMethod(comment = "@return LISTP of values of type VALUE-TYPE.")
    public static final SubLObject nl_trie_name_to_value_type_alt(SubLObject name, SubLObject value_type) {
        {
            SubLObject pred = nl_trie.nl_trie_entry_semantic_pred(name, UNPROVIDED);
            SubLObject ans = NIL;
            if (NIL == parsing_utilities.npp_excluded_name_predP(pred)) {
                {
                    SubLObject pos = (NIL != lexicon_accessors.genl_pos_predP(pred, $$nameString, UNPROVIDED)) ? ((SubLObject) ($$NounPhrase)) : $$Noun;
                    SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(name);
                    SubLObject denot = NIL;
                    for (denot = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , denot = cdolist_list_var.first()) {
                        {
                            SubLObject pcase_var = value_type;
                            if (pcase_var.eql($TRIPLES)) {
                                ans = cons(list(denot, pos, pred), ans);
                            } else {
                                if (pcase_var.eql($QUADS)) {
                                    ans = cons(list(denot, pos, pred, NIL), ans);
                                }
                            }
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return LISTP of values of type VALUE-TYPE.
     */
    @LispMethod(comment = "@return LISTP of values of type VALUE-TYPE.")
    public static SubLObject nl_trie_name_to_value_type(final SubLObject name, final SubLObject value_type) {
        final SubLObject pred = nl_trie.nl_trie_entry_semantic_pred(name, UNPROVIDED);
        SubLObject ans = NIL;
        if (NIL == parsing_utilities.npp_excluded_name_predP(pred)) {
            final SubLObject pos = (NIL != lexicon_accessors.genl_pos_predP(pred, $$nameString, UNPROVIDED)) ? $$NounPhrase : $$Noun;
            SubLObject cdolist_list_var = nl_trie.nl_trie_entry_denots(name);
            SubLObject denot = NIL;
            denot = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (value_type.eql($TRIPLES)) {
                    ans = cons(list(denot, pos, pred), ans);
                } else
                    if (value_type.eql($QUADS)) {
                        ans = cons(list(denot, pos, pred, NIL), ans);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                denot = cdolist_list_var.first();
            } 
        }
        return ans;
    }

    public static final SubLObject npp_stringE_alt(SubLObject string1, SubLObject string2) {
        return equalp(string1, string2);
    }

    public static SubLObject npp_stringE(final SubLObject string1, final SubLObject string2) {
        return equalp(string1, string2);
    }

    /**
     *
     *
     * @return BOOLEAN; Are two Cyc terms equivalent for our purposes?
     */
    @LispMethod(comment = "@return BOOLEAN; Are two Cyc terms equivalent for our purposes?")
    public static final SubLObject npp_termE_alt(SubLObject term1, SubLObject term2) {
        return equalp(term1, term2);
    }

    /**
     *
     *
     * @return BOOLEAN; Are two Cyc terms equivalent for our purposes?
     */
    @LispMethod(comment = "@return BOOLEAN; Are two Cyc terms equivalent for our purposes?")
    public static SubLObject npp_termE(final SubLObject term1, final SubLObject term2) {
        return equalp(term1, term2);
    }

    public static final SubLObject make_npp_parse_alt(SubLObject denot, SubLObject pred) {
        return list(denot, pred);
    }

    public static SubLObject make_npp_parse(final SubLObject denot, final SubLObject pred) {
        return list(denot, pred);
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a 'parse'?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a \'parse\'?")
    public static final SubLObject npp_parseP_alt(SubLObject obj) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.np_parser.npp_proper_parseP(obj)) || (NIL != com.cyc.cycjava.cycl.np_parser.npp_original_string_parse_p(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a 'parse'?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a \'parse\'?")
    public static SubLObject npp_parseP(final SubLObject obj) {
        return makeBoolean((NIL != npp_proper_parseP(obj)) || (NIL != npp_original_string_parse_p(obj)));
    }

    public static final SubLObject npp_proper_parseP_alt(SubLObject obj) {
        return makeBoolean((obj.isCons() && (NIL != list_utilities.lengthE(obj, TWO_INTEGER, UNPROVIDED))) && (((NIL != lexicon_accessors.speech_part_predP(second(obj), UNPROVIDED)) || (NIL != lexicon_vars.name_string_predP(second(obj)))) || (second(obj) == $$partOfSpeech)));
    }

    public static SubLObject npp_proper_parseP(final SubLObject obj) {
        return makeBoolean((obj.isCons() && (NIL != list_utilities.lengthE(obj, TWO_INTEGER, UNPROVIDED))) && (((NIL != lexicon_accessors.speech_part_predP(second(obj), UNPROVIDED)) || (NIL != lexicon_vars.name_string_predP(second(obj)))) || second(obj).eql($$partOfSpeech)));
    }

    public static final SubLObject npp_original_string_parse_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && (second(v_object) == $ORIGINAL_STRING));
    }

    public static SubLObject npp_original_string_parse_p(final SubLObject v_object) {
        return makeBoolean(((NIL != list_utilities.proper_list_p(v_object)) && (NIL != list_utilities.lengthE(v_object, TWO_INTEGER, UNPROVIDED))) && second(v_object).eql($ORIGINAL_STRING));
    }

    /**
     *
     *
     * @return BOOLEAN; Are two (<CycL> <pos-pred>) pairs equivalent for our purposes?
     */
    @LispMethod(comment = "@return BOOLEAN; Are two (<CycL> <pos-pred>) pairs equivalent for our purposes?")
    public static final SubLObject npp_parseE_alt(SubLObject parse1, SubLObject parse2) {
        SubLTrampolineFile.checkType(parse1, $sym48$NPP_PARSE_);
        SubLTrampolineFile.checkType(parse2, $sym48$NPP_PARSE_);
        return makeBoolean((NIL != com.cyc.cycjava.cycl.np_parser.npp_termE(com.cyc.cycjava.cycl.np_parser.npp_parse_cycl(parse1), com.cyc.cycjava.cycl.np_parser.npp_parse_cycl(parse2))) && (NIL != com.cyc.cycjava.cycl.np_parser.npp_termE(com.cyc.cycjava.cycl.np_parser.npp_parse_pred(parse1), com.cyc.cycjava.cycl.np_parser.npp_parse_pred(parse2))));
    }

    /**
     *
     *
     * @return BOOLEAN; Are two (<CycL> <pos-pred>) pairs equivalent for our purposes?
     */
    @LispMethod(comment = "@return BOOLEAN; Are two (<CycL> <pos-pred>) pairs equivalent for our purposes?")
    public static SubLObject npp_parseE(final SubLObject parse1, final SubLObject parse2) {
        assert NIL != npp_parseP(parse1) : "! np_parser.npp_parseP(parse1) " + ("np_parser.npp_parseP(parse1) " + "CommonSymbols.NIL != np_parser.npp_parseP(parse1) ") + parse1;
        assert NIL != npp_parseP(parse2) : "! np_parser.npp_parseP(parse2) " + ("np_parser.npp_parseP(parse2) " + "CommonSymbols.NIL != np_parser.npp_parseP(parse2) ") + parse2;
        return makeBoolean((NIL != npp_termE(npp_parse_cycl(parse1), npp_parse_cycl(parse2))) && (NIL != npp_termE(npp_parse_pred(parse1), npp_parse_pred(parse2))));
    }

    /**
     * Return the CycL part of PARSE
     */
    @LispMethod(comment = "Return the CycL part of PARSE")
    public static final SubLObject npp_parse_cycl_alt(SubLObject parse) {
        SubLTrampolineFile.checkType(parse, $sym48$NPP_PARSE_);
        return parse.first();
    }

    /**
     * Return the CycL part of PARSE
     */
    @LispMethod(comment = "Return the CycL part of PARSE")
    public static SubLObject npp_parse_cycl(final SubLObject parse) {
        assert NIL != npp_parseP(parse) : "! np_parser.npp_parseP(parse) " + ("np_parser.npp_parseP(parse) " + "CommonSymbols.NIL != np_parser.npp_parseP(parse) ") + parse;
        return parse.first();
    }/**
     * Return the CycL part of PARSE
     */


    /**
     * Return the POS pred part of PARSE
     */
    @LispMethod(comment = "Return the POS pred part of PARSE")
    public static final SubLObject npp_parse_pred_alt(SubLObject parse) {
        SubLTrampolineFile.checkType(parse, $sym48$NPP_PARSE_);
        return second(parse);
    }

    /**
     * Return the POS pred part of PARSE
     */
    @LispMethod(comment = "Return the POS pred part of PARSE")
    public static SubLObject npp_parse_pred(final SubLObject parse) {
        assert NIL != npp_parseP(parse) : "! np_parser.npp_parseP(parse) " + ("np_parser.npp_parseP(parse) " + "CommonSymbols.NIL != np_parser.npp_parseP(parse) ") + parse;
        return second(parse);
    }/**
     * Return the POS pred part of PARSE
     */


    /**
     *
     *
     * @return LISTP of the union of two parse lists
     */
    @LispMethod(comment = "@return LISTP of the union of two parse lists")
    public static final SubLObject npp_combine_parse_lists_alt(SubLObject parses1, SubLObject parses2) {
        {
            SubLObject ans = parses2;
            SubLObject cdolist_list_var = parses1;
            SubLObject parse = NIL;
            for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                {
                    SubLObject item_var = parse;
                    if (NIL == member(item_var, ans, $sym49$NPP_PARSE_, symbol_function(IDENTITY))) {
                        ans = cons(item_var, ans);
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return LISTP of the union of two parse lists
     */
    @LispMethod(comment = "@return LISTP of the union of two parse lists")
    public static SubLObject npp_combine_parse_lists(final SubLObject parses1, final SubLObject parses2) {
        SubLObject ans = parses2;
        SubLObject cdolist_list_var = parses1;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = parse;
            if (NIL == member(item_var, ans, $sym48$NPP_PARSE_, symbol_function(IDENTITY))) {
                ans = cons(item_var, ans);
            }
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        return ans;
    }

    /**
     * Call without parameters to find out the filter level.
     * Call with an integer 0-2 to set the filter level.
     *
     * @return integer; level of wff filtering of NATs.
     */
    @LispMethod(comment = "Call without parameters to find out the filter level.\r\nCall with an integer 0-2 to set the filter level.\r\n\r\n@return integer; level of wff filtering of NATs.\nCall without parameters to find out the filter level.\nCall with an integer 0-2 to set the filter level.")
    public static final SubLObject np_wff_filter_alt(SubLObject new_level) {
        if (new_level == UNPROVIDED) {
            new_level = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (new_level.isInteger()) {
                {
                    SubLObject min = ZERO_INTEGER;
                    SubLObject max = TWO_INTEGER;
                    SubLObject new_level_final = (new_level.numL(min)) ? ((SubLObject) (min)) : new_level.numG(max) ? ((SubLObject) (max)) : new_level;
                    if (parsing_vars.$np_wff_filter_level$.getDynamicValue(thread) != new_level_final) {
                        parsing_vars.$np_wff_filter_level$.setDynamicValue(new_level_final, thread);
                    }
                }
            }
            return parsing_vars.$np_wff_filter_level$.getDynamicValue(thread);
        }
    }

    /**
     * Call without parameters to find out the filter level.
     * Call with an integer 0-2 to set the filter level.
     *
     * @return integer; level of wff filtering of NATs.
     */
    @LispMethod(comment = "Call without parameters to find out the filter level.\r\nCall with an integer 0-2 to set the filter level.\r\n\r\n@return integer; level of wff filtering of NATs.\nCall without parameters to find out the filter level.\nCall with an integer 0-2 to set the filter level.")
    public static SubLObject np_wff_filter(SubLObject new_level) {
        if (new_level == UNPROVIDED) {
            new_level = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (new_level.isInteger()) {
            final SubLObject min = ZERO_INTEGER;
            final SubLObject max = TWO_INTEGER;
            final SubLObject new_level_final = (new_level.numL(min)) ? min : new_level.numG(max) ? max : new_level;
            if (!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).eql(new_level_final)) {
                parsing_vars.$np_wff_filter_level$.setDynamicValue(new_level_final, thread);
            }
        }
        return parsing_vars.$np_wff_filter_level$.getDynamicValue(thread);
    }/**
     * Call without parameters to find out the filter level.
     * Call with an integer 0-2 to set the filter level.
     *
     * @return integer; level of wff filtering of NATs.
     */


    /**
     * Return all CycL expressions in (GET-CYCLS-FOR-NP STRING) that are reified terms
     */
    @LispMethod(comment = "Return all CycL expressions in (GET-CYCLS-FOR-NP STRING) that are reified terms")
    public static final SubLObject get_forts_for_np_alt(SubLObject string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_forts = NIL;
                {
                    SubLObject _prev_bind_0 = parsing_vars.$np_wff_filter_level$.currentBinding(thread);
                    try {
                        parsing_vars.$np_wff_filter_level$.bind(ZERO_INTEGER, thread);
                        {
                            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.np_parser.get_cycls_for_np(string);
                            SubLObject cycl = NIL;
                            for (cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cycl = cdolist_list_var.first()) {
                                if (NIL != cycl_utilities.reified_term_p(function_terms.naut_to_nart(cycl))) {
                                    v_forts = cons(cycl, v_forts);
                                }
                            }
                        }
                    } finally {
                        parsing_vars.$np_wff_filter_level$.rebind(_prev_bind_0, thread);
                    }
                }
                return v_forts;
            }
        }
    }

    /**
     * Return all CycL expressions in (GET-CYCLS-FOR-NP STRING) that are reified terms
     */
    @LispMethod(comment = "Return all CycL expressions in (GET-CYCLS-FOR-NP STRING) that are reified terms")
    public static SubLObject get_forts_for_np(final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_forts = NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$np_wff_filter_level$.currentBinding(thread);
        try {
            parsing_vars.$np_wff_filter_level$.bind(ZERO_INTEGER, thread);
            SubLObject cdolist_list_var = get_cycls_for_np(string);
            SubLObject cycl = NIL;
            cycl = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != cycl_utilities.reified_term_p(function_terms.naut_to_nart(cycl))) {
                    v_forts = cons(cycl, v_forts);
                }
                cdolist_list_var = cdolist_list_var.rest();
                cycl = cdolist_list_var.first();
            } 
        } finally {
            parsing_vars.$np_wff_filter_level$.rebind(_prev_bind_0, thread);
        }
        return v_forts;
    }/**
     * Return all CycL expressions in (GET-CYCLS-FOR-NP STRING) that are reified terms
     */


    /**
     * Parse STRING into CycL, under the assumption that it is a well-formed English NP.
     *
     * @param STRING
     * 		stringp; a putative NP to parse.
     * @return LISTP; a list of CycL parses and nameString-type denotations for STRING
     */
    @LispMethod(comment = "Parse STRING into CycL, under the assumption that it is a well-formed English NP.\r\n\r\n@param STRING\r\n\t\tstringp; a putative NP to parse.\r\n@return LISTP; a list of CycL parses and nameString-type denotations for STRING")
    public static final SubLObject get_cycls_for_np_alt(SubLObject string) {
        return psp_main.ps_get_cycls_for_np(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Parse STRING into CycL, under the assumption that it is a well-formed English NP.\r\n\r\n@param STRING\r\n\t\tstringp; a putative NP to parse.\r\n@return LISTP; a list of CycL parses and nameString-type denotations for STRING")
    public static SubLObject get_cycls_for_np(final SubLObject string) {
        return psp_main.ps_get_cycls_for_np(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Parse STRING into CycL, under the assumption that it is a well-formed English NP.
     *
     * @param STRING
     * 		stringp; a putative NP to parse.
     * @return LISTP; a list of CycL parses and nameString-type denotations for STRING
     */


    /**
     *
     *
     * @return LISTP; of our best guesses about what STRING means as a noun phrase
     */
    @LispMethod(comment = "@return LISTP; of our best guesses about what STRING means as a noun phrase")
    public static final SubLObject get_best_cycls_for_np_alt(SubLObject string) {
        SubLTrampolineFile.checkType(string, STRINGP);
        {
            SubLObject cycls = com.cyc.cycjava.cycl.np_parser.get_cycls_for_np(string);
            SubLObject ans = NIL;
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                {
                    SubLObject csome_list_var = cycls;
                    SubLObject cycl = NIL;
                    for (cycl = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cycl = csome_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.np_parser.npp_term_complexity_L(cycls.first(), cycl)) {
                            doneP = T;
                        } else {
                            ans = cons(cycl, ans);
                        }
                    }
                }
            }
            return ans;
        }
    }

    /**
     *
     *
     * @return LISTP; of our best guesses about what STRING means as a noun phrase
     */
    @LispMethod(comment = "@return LISTP; of our best guesses about what STRING means as a noun phrase")
    public static SubLObject get_best_cycls_for_np(final SubLObject string) {
        assert NIL != stringp(string) : "! stringp(string) " + ("Types.stringp(string) " + "CommonSymbols.NIL != Types.stringp(string) ") + string;
        final SubLObject cycls = get_cycls_for_np(string);
        SubLObject ans = NIL;
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = cycls;
            SubLObject cycl = NIL;
            cycl = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                if (NIL != npp_term_complexity_L(cycls.first(), cycl)) {
                    doneP = T;
                } else {
                    ans = cons(cycl, ans);
                }
                csome_list_var = csome_list_var.rest();
                cycl = csome_list_var.first();
            } 
        }
        return ans;
    }

    /**
     * Parse STRING into (<CycL> <pos-pred>) pairs, under the assumption that it is a well-formed English NP.
     *
     * @param STRING
     * 		stringp; a putative NP to parse.
     * @param DEFAULT-QUANT
     * 		keywordp; :indefinite :definite (Used when there is no overt determiner.)
     * @return LISTP; a list of (<CycL> <pos-pred>) pairs for STRING
     */
    @LispMethod(comment = "Parse STRING into (<CycL> <pos-pred>) pairs, under the assumption that it is a well-formed English NP.\r\n\r\n@param STRING\r\n\t\tstringp; a putative NP to parse.\r\n@param DEFAULT-QUANT\r\n\t\tkeywordp; :indefinite :definite (Used when there is no overt determiner.)\r\n@return LISTP; a list of (<CycL> <pos-pred>) pairs for STRING")
    public static final SubLObject parse_np_alt(SubLObject string, SubLObject default_quant) {
        if (default_quant == UNPROVIDED) {
            default_quant = NIL;
        }
        return psp_main.ps_get_cycls_for_np(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Parse STRING into (<CycL> <pos-pred>) pairs, under the assumption that it is a well-formed English NP.\r\n\r\n@param STRING\r\n\t\tstringp; a putative NP to parse.\r\n@param DEFAULT-QUANT\r\n\t\tkeywordp; :indefinite :definite (Used when there is no overt determiner.)\r\n@return LISTP; a list of (<CycL> <pos-pred>) pairs for STRING")
    public static SubLObject parse_np(final SubLObject string, SubLObject default_quant) {
        if (default_quant == UNPROVIDED) {
            default_quant = NIL;
        }
        return psp_main.ps_get_cycls_for_np(string, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Parse STRING into (<CycL> <pos-pred>) pairs, under the assumption that it is a well-formed English NP.
     *
     * @param STRING
     * 		stringp; a putative NP to parse.
     * @param DEFAULT-QUANT
     * 		keywordp; :indefinite :definite (Used when there is no overt determiner.)
     * @return LISTP; a list of (<CycL> <pos-pred>) pairs for STRING
     */


    /**
     * Parse NBAR, a noun phrase with any determiners stripped off.
     *
     * @return LISTP; of (<CycL> <pos-pred>) pairs
     */
    @LispMethod(comment = "Parse NBAR, a noun phrase with any determiners stripped off.\r\n\r\n@return LISTP; of (<CycL> <pos-pred>) pairs")
    public static final SubLObject parse_nbar_alt(SubLObject nbar) {
        return psp_main.ps_get_cycls_for_phrase(nbar, $list_alt57, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    @LispMethod(comment = "Parse NBAR, a noun phrase with any determiners stripped off.\r\n\r\n@return LISTP; of (<CycL> <pos-pred>) pairs")
    public static SubLObject parse_nbar(final SubLObject nbar) {
        return psp_main.ps_get_cycls_for_phrase(nbar, $list56, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Parse NBAR, a noun phrase with any determiners stripped off.
     *
     * @return LISTP; of (<CycL> <pos-pred>) pairs
     */


    /**
     *
     *
     * @param DET
    stringp
     * 		
     * @param NBAR
    stringp
     * 		
     * @return LISTP; of (<CycL> <pos-pred>) parses.
     */
    @LispMethod(comment = "@param DET\nstringp\r\n\t\t\r\n@param NBAR\nstringp\r\n\t\t\r\n@return LISTP; of (<CycL> <pos-pred>) parses.")
    public static final SubLObject parse_possessive_np_alt(SubLObject det, SubLObject nbar) {
        {
            SubLObject parses = NIL;
            SubLObject nbar_parses = com.cyc.cycjava.cycl.np_parser.parse_nbar(nbar);
            SubLObject cdolist_list_var = lexicon_accessors.pos_of_string(det, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject pos = NIL;
            for (pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos = cdolist_list_var.first()) {
                if (NIL != rbp_wff.npp_genlP(pos, $$PossessivePronoun_Pre, UNPROVIDED)) {
                    {
                        SubLObject cdolist_list_var_28 = lexicon_accessors.denots_of_stringXspeech_part(det, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        SubLObject det_denot = NIL;
                        for (det_denot = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , det_denot = cdolist_list_var_28.first()) {
                            {
                                SubLObject cdolist_list_var_29 = nbar_parses;
                                SubLObject nbar_parse = NIL;
                                for (nbar_parse = cdolist_list_var_29.first(); NIL != cdolist_list_var_29; cdolist_list_var_29 = cdolist_list_var_29.rest() , nbar_parse = cdolist_list_var_29.first()) {
                                    {
                                        SubLObject datum = nbar_parse;
                                        SubLObject current = datum;
                                        SubLObject nbar_denot = NIL;
                                        SubLObject nbar_pred = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        nbar_denot = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt59);
                                        nbar_pred = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            {
                                                SubLObject poss_nat = list($$SubcollectionOfWithRelationFromFn, nbar_denot, $$possessiveRelation, det_denot);
                                                SubLObject item_var = com.cyc.cycjava.cycl.np_parser.make_npp_parse(nl_reformulator.nl_reformulate(poss_nat, UNPROVIDED), nbar_pred);
                                                if (NIL == member(item_var, parses, $sym49$NPP_PARSE_, symbol_function(IDENTITY))) {
                                                    parses = cons(item_var, parses);
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt59);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return parses;
        }
    }

    /**
     *
     *
     * @param DET
    stringp
     * 		
     * @param NBAR
    stringp
     * 		
     * @return LISTP; of (<CycL> <pos-pred>) parses.
     */
    @LispMethod(comment = "@param DET\nstringp\r\n\t\t\r\n@param NBAR\nstringp\r\n\t\t\r\n@return LISTP; of (<CycL> <pos-pred>) parses.")
    public static SubLObject parse_possessive_np(final SubLObject det, final SubLObject nbar) {
        SubLObject parses = NIL;
        final SubLObject nbar_parses = parse_nbar(nbar);
        SubLObject cdolist_list_var = lexicon_accessors.pos_of_string(det, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject pos = NIL;
        pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != rbp_wff.npp_genlP(pos, $$PossessivePronoun_Pre, UNPROVIDED)) {
                SubLObject cdolist_list_var_$26 = lexicon_accessors.denots_of_stringXspeech_part(det, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject det_denot = NIL;
                det_denot = cdolist_list_var_$26.first();
                while (NIL != cdolist_list_var_$26) {
                    SubLObject cdolist_list_var_$27 = nbar_parses;
                    SubLObject nbar_parse = NIL;
                    nbar_parse = cdolist_list_var_$27.first();
                    while (NIL != cdolist_list_var_$27) {
                        SubLObject current;
                        final SubLObject datum = current = nbar_parse;
                        SubLObject nbar_denot = NIL;
                        SubLObject nbar_pred = NIL;
                        destructuring_bind_must_consp(current, datum, $list58);
                        nbar_denot = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list58);
                        nbar_pred = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            final SubLObject poss_nat = list($$SubcollectionOfWithRelationFromFn, nbar_denot, $$possessiveRelation, det_denot);
                            final SubLObject item_var = make_npp_parse(nl_reformulator.nl_reformulate(poss_nat, UNPROVIDED), nbar_pred);
                            if (NIL == member(item_var, parses, $sym48$NPP_PARSE_, symbol_function(IDENTITY))) {
                                parses = cons(item_var, parses);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list58);
                        }
                        cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                        nbar_parse = cdolist_list_var_$27.first();
                    } 
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    det_denot = cdolist_list_var_$26.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            pos = cdolist_list_var.first();
        } 
        return parses;
    }

    public static final SubLObject wrap_and_reformulate_cycl_alt(SubLObject wrapper, SubLObject cycl) {
        return nl_reformulator.nl_reformulate(list(wrapper, cycl), UNPROVIDED);
    }

    public static SubLObject wrap_and_reformulate_cycl(final SubLObject wrapper, final SubLObject cycl) {
        return nl_reformulator.nl_reformulate(list(wrapper, cycl), UNPROVIDED);
    }

    /**
     * Parse NBAR just by looking in the lexical cache.
     */
    @LispMethod(comment = "Parse NBAR just by looking in the lexical cache.")
    public static final SubLObject parse_nbar_via_lookup_alt(SubLObject nbar) {
        {
            SubLObject parses = NIL;
            SubLObject values = nl_trie.nl_trie_search(nbar, UNPROVIDED, UNPROVIDED);
            if (values.isList()) {
                {
                    SubLObject cdolist_list_var = values;
                    SubLObject value = NIL;
                    for (value = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , value = cdolist_list_var.first()) {
                        if (NIL != nl_trie.nl_trie_word_p(value, UNPROVIDED)) {
                            {
                                SubLObject cdolist_list_var_30 = com.cyc.cycjava.cycl.np_parser.nl_trie_word_to_value_type(value, $TRIPLES);
                                SubLObject triple = NIL;
                                for (triple = cdolist_list_var_30.first(); NIL != cdolist_list_var_30; cdolist_list_var_30 = cdolist_list_var_30.rest() , triple = cdolist_list_var_30.first()) {
                                    {
                                        SubLObject datum = triple;
                                        SubLObject current = datum;
                                        SubLObject denot = NIL;
                                        SubLObject pos = NIL;
                                        SubLObject pred = NIL;
                                        destructuring_bind_must_consp(current, datum, $list_alt62);
                                        denot = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt62);
                                        pos = current.first();
                                        current = current.rest();
                                        destructuring_bind_must_consp(current, datum, $list_alt62);
                                        pred = current.first();
                                        current = current.rest();
                                        if (NIL == current) {
                                            if ((NIL != denot) && (NIL != genls.genl_in_any_mtP(pos, $$Noun))) {
                                                parses = cons(com.cyc.cycjava.cycl.np_parser.make_npp_parse(denot, pred), parses);
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum, $list_alt62);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return parses;
        }
    }

    @LispMethod(comment = "Parse NBAR just by looking in the lexical cache.")
    public static SubLObject parse_nbar_via_lookup(final SubLObject nbar) {
        SubLObject parses = NIL;
        final SubLObject values = nl_trie.nl_trie_search(nbar, UNPROVIDED, UNPROVIDED);
        if (values.isList()) {
            SubLObject cdolist_list_var = values;
            SubLObject value = NIL;
            value = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != nl_trie.nl_trie_word_p(value, UNPROVIDED)) {
                    SubLObject cdolist_list_var_$28 = nl_trie_word_to_value_type(value, $TRIPLES);
                    SubLObject triple = NIL;
                    triple = cdolist_list_var_$28.first();
                    while (NIL != cdolist_list_var_$28) {
                        SubLObject current;
                        final SubLObject datum = current = triple;
                        SubLObject denot = NIL;
                        SubLObject pos = NIL;
                        SubLObject pred = NIL;
                        destructuring_bind_must_consp(current, datum, $list61);
                        denot = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list61);
                        pos = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list61);
                        pred = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if ((NIL != denot) && (NIL != genls.genl_in_any_mtP(pos, $$Noun))) {
                                parses = cons(make_npp_parse(denot, pred), parses);
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list61);
                        }
                        cdolist_list_var_$28 = cdolist_list_var_$28.rest();
                        triple = cdolist_list_var_$28.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                value = cdolist_list_var.first();
            } 
        }
        return parses;
    }/**
     * Parse NBAR just by looking in the lexical cache.
     */


    /**
     * Parse an N-bar containing an 'and'
     *
     * @return LISTP; of (<CycL> <pos-pred>) pairs
     */
    @LispMethod(comment = "Parse an N-bar containing an \'and\'\r\n\r\n@return LISTP; of (<CycL> <pos-pred>) pairs")
    public static final SubLObject parse_nbar_with_and_alt(SubLObject nbar) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parses = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject and_phrase = com.cyc.cycjava.cycl.np_parser.find_final_phrase_beginning_with_pos(nbar, $$CoordinatingConjunction);
                    SubLObject conj1 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != list_utilities.lengthG(and_phrase, FOUR_INTEGER, UNPROVIDED)) && (NIL != string_utilities.starts_with_by_test(and_phrase, $str_alt64$and_, $sym65$NPP_STRING_))) {
                        {
                            SubLObject conj2 = string_utilities.substring(and_phrase, FOUR_INTEGER, UNPROVIDED);
                            parses = com.cyc.cycjava.cycl.np_parser.npp_combine_parse_lists(parses, com.cyc.cycjava.cycl.np_parser.parse_conjoined_nbars(conj1, conj2, $UNION));
                            thread.resetMultipleValues();
                            {
                                SubLObject adj1 = com.cyc.cycjava.cycl.np_parser.find_initial_strings_with_pos(conj1, $$Adjective);
                                SubLObject mini_conj1 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (NIL != string_utilities.non_empty_stringP(adj1)) {
                                    if (NIL != string_utilities.non_empty_stringP(mini_conj1)) {
                                        {
                                            SubLObject new_conj2 = cconcatenate(adj1, new SubLObject[]{ $str_alt68$_, conj2 });
                                            parses = com.cyc.cycjava.cycl.np_parser.npp_combine_parse_lists(parses, com.cyc.cycjava.cycl.np_parser.parse_conjoined_nbars(conj1, new_conj2, $UNION));
                                        }
                                    } else {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject adj2 = com.cyc.cycjava.cycl.np_parser.find_initial_strings_with_pos(conj2, $$Adjective);
                                            SubLObject mini_conj2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if ((NIL != string_utilities.non_empty_stringP(adj2)) && (NIL != string_utilities.non_empty_stringP(mini_conj2))) {
                                                {
                                                    SubLObject new_conj1 = cconcatenate(adj1, new SubLObject[]{ $str_alt68$_, mini_conj2 });
                                                    parses = com.cyc.cycjava.cycl.np_parser.npp_combine_parse_lists(parses, com.cyc.cycjava.cycl.np_parser.parse_conjoined_nbars(new_conj1, conj2, $UNION));
                                                    parses = com.cyc.cycjava.cycl.np_parser.npp_combine_parse_lists(parses, com.cyc.cycjava.cycl.np_parser.parse_conjoined_nbars(new_conj1, conj2, $INTERSECTION));
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return parses;
            }
        }
    }

    @LispMethod(comment = "Parse an N-bar containing an \'and\'\r\n\r\n@return LISTP; of (<CycL> <pos-pred>) pairs")
    public static SubLObject parse_nbar_with_and(final SubLObject nbar) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = NIL;
        thread.resetMultipleValues();
        final SubLObject and_phrase = find_final_phrase_beginning_with_pos(nbar, $$CoordinatingConjunction);
        final SubLObject conj1 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((NIL != list_utilities.lengthG(and_phrase, FOUR_INTEGER, UNPROVIDED)) && (NIL != string_utilities.starts_with_by_test(and_phrase, $$$and_, $sym64$NPP_STRING_))) {
            final SubLObject conj2 = string_utilities.substring(and_phrase, FOUR_INTEGER, UNPROVIDED);
            parses = npp_combine_parse_lists(parses, parse_conjoined_nbars(conj1, conj2, $UNION));
            thread.resetMultipleValues();
            final SubLObject adj1 = find_initial_strings_with_pos(conj1, $$Adjective);
            final SubLObject mini_conj1 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != string_utilities.non_empty_stringP(adj1)) {
                if (NIL != string_utilities.non_empty_stringP(mini_conj1)) {
                    final SubLObject new_conj2 = cconcatenate(adj1, new SubLObject[]{ $$$_, conj2 });
                    parses = npp_combine_parse_lists(parses, parse_conjoined_nbars(conj1, new_conj2, $UNION));
                } else {
                    thread.resetMultipleValues();
                    final SubLObject adj2 = find_initial_strings_with_pos(conj2, $$Adjective);
                    final SubLObject mini_conj2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL != string_utilities.non_empty_stringP(adj2)) && (NIL != string_utilities.non_empty_stringP(mini_conj2))) {
                        final SubLObject new_conj3 = cconcatenate(adj1, new SubLObject[]{ $$$_, mini_conj2 });
                        parses = npp_combine_parse_lists(parses, parse_conjoined_nbars(new_conj3, conj2, $UNION));
                        parses = npp_combine_parse_lists(parses, parse_conjoined_nbars(new_conj3, conj2, $INTERSECTION));
                    }
                }
            }
        }
        return parses;
    }/**
     * Parse an N-bar containing an 'and'
     *
     * @return LISTP; of (<CycL> <pos-pred>) pairs
     */


    /**
     * Parse NBAR1 and NBAR2 as simple conjoined nbars.
     *
     * @return LISTP; of (<CycL> <pos-pred>) pairs
     */
    @LispMethod(comment = "Parse NBAR1 and NBAR2 as simple conjoined nbars.\r\n\r\n@return LISTP; of (<CycL> <pos-pred>) pairs")
    public static final SubLObject parse_conjoined_nbars_alt(SubLObject nbar1, SubLObject nbar2, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $UNION;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject parses = NIL;
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.np_parser.parse_nbar(nbar1);
                SubLObject nbar1_parse = NIL;
                for (nbar1_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nbar1_parse = cdolist_list_var.first()) {
                    {
                        SubLObject datum = nbar1_parse;
                        SubLObject current = datum;
                        SubLObject nbar1_cycl = NIL;
                        SubLObject nbar1_pred = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt70);
                        nbar1_cycl = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt70);
                        nbar1_pred = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject cdolist_list_var_31 = com.cyc.cycjava.cycl.np_parser.parse_nbar(nbar2);
                                SubLObject nbar2_parse = NIL;
                                for (nbar2_parse = cdolist_list_var_31.first(); NIL != cdolist_list_var_31; cdolist_list_var_31 = cdolist_list_var_31.rest() , nbar2_parse = cdolist_list_var_31.first()) {
                                    {
                                        SubLObject datum_32 = nbar2_parse;
                                        SubLObject current_33 = datum_32;
                                        SubLObject nbar2_cycl = NIL;
                                        SubLObject nbar2_pred = NIL;
                                        destructuring_bind_must_consp(current_33, datum_32, $list_alt71);
                                        nbar2_cycl = current_33.first();
                                        current_33 = current_33.rest();
                                        destructuring_bind_must_consp(current_33, datum_32, $list_alt71);
                                        nbar2_pred = current_33.first();
                                        current_33 = current_33.rest();
                                        if (NIL == current_33) {
                                            if (((NIL != rbp_wff.npp_collectionP(nbar1_cycl)) && (NIL != rbp_wff.npp_collectionP(nbar2_cycl))) && (nbar1_pred == nbar2_pred)) {
                                                {
                                                    SubLObject pcase_var = type;
                                                    if (pcase_var.eql($UNION)) {
                                                        {
                                                            SubLObject new_cycl = make_binary_formula($$TheCoordinationSet, nbar1_cycl, nbar2_cycl);
                                                            SubLObject okP = rbp_wff.rbp_wf_natP(new_cycl, parsing_vars.$np_wff_filter_level$.getDynamicValue(thread));
                                                            if (NIL != okP) {
                                                                {
                                                                    SubLObject item_var = com.cyc.cycjava.cycl.np_parser.make_npp_parse(new_cycl, nbar1_pred);
                                                                    if (NIL == member(item_var, parses, $sym49$NPP_PARSE_, symbol_function(IDENTITY))) {
                                                                        parses = cons(item_var, parses);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        if (pcase_var.eql($INTERSECTION)) {
                                                            {
                                                                SubLObject new_cycl = nl_reformulator.nl_reformulate(list($$CollectionIntersection2Fn, nbar1_cycl, nbar2_cycl), UNPROVIDED);
                                                                SubLObject okP = rbp_wff.rbp_wf_natP(new_cycl, parsing_vars.$np_wff_filter_level$.getDynamicValue(thread));
                                                                if (NIL != okP) {
                                                                    {
                                                                        SubLObject item_var = com.cyc.cycjava.cycl.np_parser.make_npp_parse(new_cycl, nbar1_pred);
                                                                        if (NIL == member(item_var, parses, $sym49$NPP_PARSE_, symbol_function(IDENTITY))) {
                                                                            parses = cons(item_var, parses);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                if (((type == $UNION) && (NIL != rbp_wff.npp_individualP(nbar1_cycl))) && (NIL != rbp_wff.npp_individualP(nbar2_cycl))) {
                                                    {
                                                        SubLObject preds = list(nbar1_pred, nbar2_pred);
                                                        SubLObject preds_okP = nintersection(preds, sbhl_search_methods.sbhl_ceilings(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                        if (NIL != preds_okP) {
                                                            {
                                                                SubLObject coord_set_cycl = make_binary_formula($$TheCoordinationSet, nbar1_cycl, nbar2_cycl);
                                                                SubLObject item_var = com.cyc.cycjava.cycl.np_parser.make_npp_parse(coord_set_cycl, $$plural);
                                                                if (NIL == member(item_var, parses, $sym49$NPP_PARSE_, symbol_function(IDENTITY))) {
                                                                    parses = cons(item_var, parses);
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            cdestructuring_bind_error(datum_32, $list_alt71);
                                        }
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt70);
                        }
                    }
                }
                return parses;
            }
        }
    }

    @LispMethod(comment = "Parse NBAR1 and NBAR2 as simple conjoined nbars.\r\n\r\n@return LISTP; of (<CycL> <pos-pred>) pairs")
    public static SubLObject parse_conjoined_nbars(final SubLObject nbar1, final SubLObject nbar2, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $UNION;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = NIL;
        SubLObject cdolist_list_var = parse_nbar(nbar1);
        SubLObject nbar1_parse = NIL;
        nbar1_parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = nbar1_parse;
            SubLObject nbar1_cycl = NIL;
            SubLObject nbar1_pred = NIL;
            destructuring_bind_must_consp(current, datum, $list69);
            nbar1_cycl = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list69);
            nbar1_pred = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$29 = parse_nbar(nbar2);
                SubLObject nbar2_parse = NIL;
                nbar2_parse = cdolist_list_var_$29.first();
                while (NIL != cdolist_list_var_$29) {
                    SubLObject current_$31;
                    final SubLObject datum_$30 = current_$31 = nbar2_parse;
                    SubLObject nbar2_cycl = NIL;
                    SubLObject nbar2_pred = NIL;
                    destructuring_bind_must_consp(current_$31, datum_$30, $list70);
                    nbar2_cycl = current_$31.first();
                    current_$31 = current_$31.rest();
                    destructuring_bind_must_consp(current_$31, datum_$30, $list70);
                    nbar2_pred = current_$31.first();
                    current_$31 = current_$31.rest();
                    if (NIL == current_$31) {
                        if (((NIL != rbp_wff.npp_collectionP(nbar1_cycl)) && (NIL != rbp_wff.npp_collectionP(nbar2_cycl))) && nbar1_pred.eql(nbar2_pred)) {
                            final SubLObject pcase_var = type;
                            if (pcase_var.eql($UNION)) {
                                final SubLObject new_cycl = make_binary_formula($$TheCoordinationSet, nbar1_cycl, nbar2_cycl);
                                final SubLObject okP = rbp_wff.rbp_wf_natP(new_cycl, parsing_vars.$np_wff_filter_level$.getDynamicValue(thread));
                                if (NIL != okP) {
                                    final SubLObject item_var = make_npp_parse(new_cycl, nbar1_pred);
                                    if (NIL == member(item_var, parses, $sym48$NPP_PARSE_, symbol_function(IDENTITY))) {
                                        parses = cons(item_var, parses);
                                    }
                                }
                            } else
                                if (pcase_var.eql($INTERSECTION)) {
                                    final SubLObject new_cycl = nl_reformulator.nl_reformulate(list($$CollectionIntersection2Fn, nbar1_cycl, nbar2_cycl), UNPROVIDED);
                                    final SubLObject okP = rbp_wff.rbp_wf_natP(new_cycl, parsing_vars.$np_wff_filter_level$.getDynamicValue(thread));
                                    if (NIL != okP) {
                                        final SubLObject item_var = make_npp_parse(new_cycl, nbar1_pred);
                                        if (NIL == member(item_var, parses, $sym48$NPP_PARSE_, symbol_function(IDENTITY))) {
                                            parses = cons(item_var, parses);
                                        }
                                    }
                                }

                        } else
                            if (((type == $UNION) && (NIL != rbp_wff.npp_individualP(nbar1_cycl))) && (NIL != rbp_wff.npp_individualP(nbar2_cycl))) {
                                final SubLObject preds = list(nbar1_pred, nbar2_pred);
                                final SubLObject preds_okP = nintersection(preds, sbhl_search_methods.sbhl_ceilings(sbhl_module_vars.get_sbhl_module($$genlPreds), preds, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                if (NIL != preds_okP) {
                                    final SubLObject coord_set_cycl = make_binary_formula($$TheCoordinationSet, nbar1_cycl, nbar2_cycl);
                                    final SubLObject item_var = make_npp_parse(coord_set_cycl, $$plural);
                                    if (NIL == member(item_var, parses, $sym48$NPP_PARSE_, symbol_function(IDENTITY))) {
                                        parses = cons(item_var, parses);
                                    }
                                }
                            }

                    } else {
                        cdestructuring_bind_error(datum_$30, $list70);
                    }
                    cdolist_list_var_$29 = cdolist_list_var_$29.rest();
                    nbar2_parse = cdolist_list_var_$29.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list69);
            }
            cdolist_list_var = cdolist_list_var.rest();
            nbar1_parse = cdolist_list_var.first();
        } 
        return parses;
    }/**
     * Parse NBAR1 and NBAR2 as simple conjoined nbars.
     *
     * @return LISTP; of (<CycL> <pos-pred>) pairs
     */


    /**
     * Parse the phrase consisting of NBAR subsectively post-modified by PP
     *
     * @param NBAR
    stringp
     * 		
     * @param PP
    stringp
     * 		
     * @return LISTP; of (<CycL> <pos-pred>) pairs
     */
    @LispMethod(comment = "Parse the phrase consisting of NBAR subsectively post-modified by PP\r\n\r\n@param NBAR\nstringp\r\n\t\t\r\n@param PP\nstringp\r\n\t\t\r\n@return LISTP; of (<CycL> <pos-pred>) pairs")
    public static final SubLObject parse_nbar_pp_alt(SubLObject nbar, SubLObject pp) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject nbar_parses = com.cyc.cycjava.cycl.np_parser.parse_nbar(nbar);
                SubLObject parses = NIL;
                if (NIL != nbar_parses) {
                    thread.resetMultipleValues();
                    {
                        SubLObject prep = com.cyc.cycjava.cycl.np_parser.split_and_parse_pp(pp);
                        SubLObject prep_obj_cycls = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject pp_cycls = com.cyc.cycjava.cycl.np_parser.parse_pp_in_np(prep, prep_obj_cycls);
                            SubLObject cdolist_list_var = nbar_parses;
                            SubLObject nbar_parse = NIL;
                            for (nbar_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nbar_parse = cdolist_list_var.first()) {
                                {
                                    SubLObject datum = nbar_parse;
                                    SubLObject current = datum;
                                    SubLObject nbar_cycl = NIL;
                                    SubLObject nbar_pos_pred = NIL;
                                    destructuring_bind_must_consp(current, datum, $list_alt76);
                                    nbar_cycl = current.first();
                                    current = current.rest();
                                    destructuring_bind_must_consp(current, datum, $list_alt76);
                                    nbar_pos_pred = current.first();
                                    current = current.rest();
                                    if (NIL == current) {
                                        if (!((NIL != rbp_wff.npp_genl_predP(nbar_pos_pred, $$termStrings)) || (NIL == rbp_wff.npp_collectionP(nbar_cycl)))) {
                                            if (NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread)) {
                                                nbar_cycl = list($$SomeFn, nbar_cycl);
                                            }
                                            {
                                                SubLObject cdolist_list_var_34 = pp_cycls;
                                                SubLObject pp_cycl = NIL;
                                                for (pp_cycl = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , pp_cycl = cdolist_list_var_34.first()) {
                                                    {
                                                        SubLObject cdolist_list_var_35 = com.cyc.cycjava.cycl.np_parser.specify_prep_semtrans(pp_cycl, nbar_cycl, $NOUN);
                                                        SubLObject spec_pp_cycl = NIL;
                                                        for (spec_pp_cycl = cdolist_list_var_35.first(); NIL != cdolist_list_var_35; cdolist_list_var_35 = cdolist_list_var_35.rest() , spec_pp_cycl = cdolist_list_var_35.first()) {
                                                            {
                                                                SubLObject var = czer_utilities.unique_el_var_wrt_expression(spec_pp_cycl, $sym79$_OBJ);
                                                                SubLObject nat = list($$CollectionSubsetFn, nbar_cycl, list($$TheSetOf, var, subst(var, $NOUN, spec_pp_cycl, UNPROVIDED, UNPROVIDED)));
                                                                SubLObject reformulated_nat = nl_reformulator.nl_reformulate(nat, UNPROVIDED);
                                                                SubLObject okP = rbp_wff.rbp_wf_natP(reformulated_nat, parsing_vars.$np_wff_filter_level$.getDynamicValue(thread));
                                                                if (NIL != okP) {
                                                                    {
                                                                        SubLObject item_var = list(reformulated_nat, nbar_pos_pred);
                                                                        if (NIL == member(item_var, parses, $sym49$NPP_PARSE_, symbol_function(IDENTITY))) {
                                                                            parses = cons(item_var, parses);
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
                                        cdestructuring_bind_error(datum, $list_alt76);
                                    }
                                }
                            }
                        }
                    }
                }
                return parses;
            }
        }
    }

    @LispMethod(comment = "Parse the phrase consisting of NBAR subsectively post-modified by PP\r\n\r\n@param NBAR\n\t\tstringp\r\n\t\t\r\n@param PP\n\t\tstringp\r\n\t\t\r\n@return LISTP; of (<CycL> <pos-pred>) pairs")
    public static SubLObject parse_nbar_pp(final SubLObject nbar, final SubLObject pp) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject nbar_parses = parse_nbar(nbar);
        SubLObject parses = NIL;
        if (NIL != nbar_parses) {
            thread.resetMultipleValues();
            final SubLObject prep = split_and_parse_pp(pp);
            final SubLObject prep_obj_cycls = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject pp_cycls = parse_pp_in_np(prep, prep_obj_cycls);
            SubLObject cdolist_list_var = nbar_parses;
            SubLObject nbar_parse = NIL;
            nbar_parse = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = nbar_parse;
                SubLObject nbar_cycl = NIL;
                SubLObject nbar_pos_pred = NIL;
                destructuring_bind_must_consp(current, datum, $list75);
                nbar_cycl = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list75);
                nbar_pos_pred = current.first();
                current = current.rest();
                if (NIL == current) {
                    if ((NIL == rbp_wff.npp_genl_predP(nbar_pos_pred, $$termStrings)) && (NIL != rbp_wff.npp_collectionP(nbar_cycl))) {
                        if (NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread)) {
                            nbar_cycl = list($$SomeFn, nbar_cycl);
                        }
                        SubLObject cdolist_list_var_$32 = pp_cycls;
                        SubLObject pp_cycl = NIL;
                        pp_cycl = cdolist_list_var_$32.first();
                        while (NIL != cdolist_list_var_$32) {
                            SubLObject cdolist_list_var_$33 = specify_prep_semtrans(pp_cycl, nbar_cycl, $NOUN);
                            SubLObject spec_pp_cycl = NIL;
                            spec_pp_cycl = cdolist_list_var_$33.first();
                            while (NIL != cdolist_list_var_$33) {
                                final SubLObject var = czer_utilities.unique_el_var_wrt_expression(spec_pp_cycl, $sym78$_OBJ);
                                final SubLObject nat = list($$CollectionSubsetFn, nbar_cycl, list($$TheSetOf, var, subst(var, $NOUN, spec_pp_cycl, UNPROVIDED, UNPROVIDED)));
                                final SubLObject reformulated_nat = nl_reformulator.nl_reformulate(nat, UNPROVIDED);
                                final SubLObject okP = rbp_wff.rbp_wf_natP(reformulated_nat, parsing_vars.$np_wff_filter_level$.getDynamicValue(thread));
                                if (NIL != okP) {
                                    final SubLObject item_var = list(reformulated_nat, nbar_pos_pred);
                                    if (NIL == member(item_var, parses, $sym48$NPP_PARSE_, symbol_function(IDENTITY))) {
                                        parses = cons(item_var, parses);
                                    }
                                }
                                cdolist_list_var_$33 = cdolist_list_var_$33.rest();
                                spec_pp_cycl = cdolist_list_var_$33.first();
                            } 
                            cdolist_list_var_$32 = cdolist_list_var_$32.rest();
                            pp_cycl = cdolist_list_var_$32.first();
                        } 
                    }
                } else {
                    cdestructuring_bind_error(datum, $list75);
                }
                cdolist_list_var = cdolist_list_var.rest();
                nbar_parse = cdolist_list_var.first();
            } 
        }
        return parses;
    }/**
     * Parse the phrase consisting of NBAR subsectively post-modified by PP
     *
     * @param NBAR
    		stringp
     * 		
     * @param PP
    		stringp
     * 		
     * @return LISTP; of (<CycL> <pos-pred>) pairs
     */


    /**
     * Given a string assumed to be a prepositional phrase, chunk off the preposition
     * and parse the object of the preposition into a list of CycL expressions.
     *
     * @param PP-STRING
    stringp
     * 		
     * @return 1 STRINGP
     * @return 2 LISTP of CycL expressions
     */
    @LispMethod(comment = "Given a string assumed to be a prepositional phrase, chunk off the preposition\r\nand parse the object of the preposition into a list of CycL expressions.\r\n\r\n@param PP-STRING\nstringp\r\n\t\t\r\n@return 1 STRINGP\r\n@return 2 LISTP of CycL expressions\nGiven a string assumed to be a prepositional phrase, chunk off the preposition\nand parse the object of the preposition into a list of CycL expressions.")
    public static final SubLObject split_and_parse_pp_alt(SubLObject pp_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject np_cycls = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject prep = com.cyc.cycjava.cycl.np_parser.find_initial_strings_with_pos(pp_string, $$Preposition);
                    SubLObject np = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    {
                        SubLObject cdolist_list_var = com.cyc.cycjava.cycl.np_parser.parse_np(np, UNPROVIDED);
                        SubLObject np_parse = NIL;
                        for (np_parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , np_parse = cdolist_list_var.first()) {
                            {
                                SubLObject item_var = com.cyc.cycjava.cycl.np_parser.npp_parse_cycl(np_parse);
                                if (NIL == member(item_var, np_cycls, $sym84$NPP_TERM_, symbol_function(IDENTITY))) {
                                    np_cycls = cons(item_var, np_cycls);
                                }
                            }
                        }
                    }
                    return values(prep, np_cycls);
                }
            }
        }
    }

    @LispMethod(comment = "Given a string assumed to be a prepositional phrase, chunk off the preposition\r\nand parse the object of the preposition into a list of CycL expressions.\r\n\r\n@param PP-STRING\n\t\tstringp\r\n\t\t\r\n@return 1 STRINGP\r\n@return 2 LISTP of CycL expressions\nGiven a string assumed to be a prepositional phrase, chunk off the preposition\nand parse the object of the preposition into a list of CycL expressions.")
    public static SubLObject split_and_parse_pp(final SubLObject pp_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject np_cycls = NIL;
        thread.resetMultipleValues();
        final SubLObject prep = find_initial_strings_with_pos(pp_string, $$Preposition);
        final SubLObject np = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = parse_np(np, UNPROVIDED);
        SubLObject np_parse = NIL;
        np_parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = npp_parse_cycl(np_parse);
            if (NIL == member(item_var, np_cycls, $sym83$NPP_TERM_, symbol_function(IDENTITY))) {
                np_cycls = cons(item_var, np_cycls);
            }
            cdolist_list_var = cdolist_list_var.rest();
            np_parse = cdolist_list_var.first();
        } 
        return values(prep, np_cycls);
    }/**
     * Given a string assumed to be a prepositional phrase, chunk off the preposition
     * and parse the object of the preposition into a list of CycL expressions.
     *
     * @param PP-STRING
    		stringp
     * 		
     * @return 1 STRINGP
     * @return 2 LISTP of CycL expressions
     */


    /**
     * Parse PP-STRING as a PP post-modifying a nominal expression
     *
     * @return LISTP of CycL expressions
     */
    @LispMethod(comment = "Parse PP-STRING as a PP post-modifying a nominal expression\r\n\r\n@return LISTP of CycL expressions")
    public static final SubLObject parse_pp_in_np_alt(SubLObject prep, SubLObject prep_obj_cycls) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject cdolist_list_var = com.cyc.cycjava.cycl.np_parser.semtrans_of_prep_string(prep);
                SubLObject semtrans = NIL;
                for (semtrans = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , semtrans = cdolist_list_var.first()) {
                    {
                        SubLObject cdolist_list_var_36 = prep_obj_cycls;
                        SubLObject np_cycl = NIL;
                        for (np_cycl = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , np_cycl = cdolist_list_var_36.first()) {
                            if ((NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread)) && (NIL != rbp_wff.npp_collectionP(np_cycl))) {
                                np_cycl = list($$SomeFn, np_cycl);
                            }
                            ans = cons(subst(np_cycl, $OBJECT, semtrans, UNPROVIDED, UNPROVIDED), ans);
                        }
                    }
                }
                return ans;
            }
        }
    }

    @LispMethod(comment = "Parse PP-STRING as a PP post-modifying a nominal expression\r\n\r\n@return LISTP of CycL expressions")
    public static SubLObject parse_pp_in_np(final SubLObject prep, final SubLObject prep_obj_cycls) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = semtrans_of_prep_string(prep);
        SubLObject semtrans = NIL;
        semtrans = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$34 = prep_obj_cycls;
            SubLObject np_cycl = NIL;
            np_cycl = cdolist_list_var_$34.first();
            while (NIL != cdolist_list_var_$34) {
                if ((NIL == parsing_vars.$npp_use_nl_tagsP$.getDynamicValue(thread)) && (NIL != rbp_wff.npp_collectionP(np_cycl))) {
                    np_cycl = list($$SomeFn, np_cycl);
                }
                ans = cons(subst(np_cycl, $OBJECT, semtrans, UNPROVIDED, UNPROVIDED), ans);
                cdolist_list_var_$34 = cdolist_list_var_$34.rest();
                np_cycl = cdolist_list_var_$34.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            semtrans = cdolist_list_var.first();
        } 
        return ans;
    }/**
     * Parse PP-STRING as a PP post-modifying a nominal expression
     *
     * @return LISTP of CycL expressions
     */


    /**
     * Given a SEMTRANS template and a CycL term (OBJ-CYCL), return a list of more
     * specific templates based on what OBJ-CYCL is.
     */
    @LispMethod(comment = "Given a SEMTRANS template and a CycL term (OBJ-CYCL), return a list of more\r\nspecific templates based on what OBJ-CYCL is.\nGiven a SEMTRANS template and a CycL term (OBJ-CYCL), return a list of more\nspecific templates based on what OBJ-CYCL is.")
    public static final SubLObject specify_prep_semtrans_alt(SubLObject semtrans, SubLObject obj_cycl, SubLObject keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject clause = ((NIL != gafP(semtrans)) && (NIL != cycl_utilities.formula_find(keyword, semtrans, UNPROVIDED, UNPROVIDED, UNPROVIDED))) ? ((SubLObject) (semtrans)) : NIL;
                SubLObject pred = (NIL != clause) ? ((SubLObject) (cycl_utilities.formula_operator(clause))) : NIL;
                SubLObject ans = (NIL != clause) ? ((SubLObject) (NIL != com.cyc.cycjava.cycl.np_parser.wf_col_template_comboP(clause, obj_cycl, keyword) ? ((SubLObject) (list(clause))) : NIL)) : NIL;
                if ((NIL != ans) && (NIL != $npp_specify_semtransP$.getDynamicValue(thread))) {
                    {
                        SubLObject cdolist_list_var = genl_predicates.spec_predicates(pred, $$GeneralEnglishMt, UNPROVIDED);
                        SubLObject spec_pred = NIL;
                        for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                            {
                                SubLObject spec_clause = cons(spec_pred, cycl_utilities.formula_args(clause, UNPROVIDED));
                                SubLObject cdolist_list_var_37 = com.cyc.cycjava.cycl.np_parser.specify_prep_semtrans(spec_clause, obj_cycl, keyword);
                                SubLObject spec_spec_clause = NIL;
                                for (spec_spec_clause = cdolist_list_var_37.first(); NIL != cdolist_list_var_37; cdolist_list_var_37 = cdolist_list_var_37.rest() , spec_spec_clause = cdolist_list_var_37.first()) {
                                    ans = cons(spec_spec_clause, ans);
                                }
                            }
                        }
                    }
                }
                return remove_duplicates(ans, $sym84$NPP_TERM_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            }
        }
    }

    @LispMethod(comment = "Given a SEMTRANS template and a CycL term (OBJ-CYCL), return a list of more\r\nspecific templates based on what OBJ-CYCL is.\nGiven a SEMTRANS template and a CycL term (OBJ-CYCL), return a list of more\nspecific templates based on what OBJ-CYCL is.")
    public static SubLObject specify_prep_semtrans(final SubLObject semtrans, final SubLObject obj_cycl, final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject clause = ((NIL != gafP(semtrans)) && (NIL != cycl_utilities.formula_find(keyword, semtrans, UNPROVIDED, UNPROVIDED, UNPROVIDED))) ? semtrans : NIL;
        final SubLObject pred = (NIL != clause) ? cycl_utilities.formula_operator(clause) : NIL;
        SubLObject ans = (NIL != clause) ? NIL != wf_col_template_comboP(clause, obj_cycl, keyword) ? list(clause) : NIL : NIL;
        if ((NIL != ans) && (NIL != $npp_specify_semtransP$.getDynamicValue(thread))) {
            SubLObject cdolist_list_var = genl_predicates.spec_predicates(pred, $$GeneralEnglishMt, UNPROVIDED);
            SubLObject spec_pred = NIL;
            spec_pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject spec_clause = cons(spec_pred, cycl_utilities.formula_args(clause, UNPROVIDED));
                SubLObject cdolist_list_var_$35 = specify_prep_semtrans(spec_clause, obj_cycl, keyword);
                SubLObject spec_spec_clause = NIL;
                spec_spec_clause = cdolist_list_var_$35.first();
                while (NIL != cdolist_list_var_$35) {
                    ans = cons(spec_spec_clause, ans);
                    cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                    spec_spec_clause = cdolist_list_var_$35.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                spec_pred = cdolist_list_var.first();
            } 
        }
        return remove_duplicates(ans, $sym83$NPP_TERM_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }/**
     * Given a SEMTRANS template and a CycL term (OBJ-CYCL), return a list of more
     * specific templates based on what OBJ-CYCL is.
     */


    public static final SubLObject clear_wf_col_template_comboP_alt() {
        {
            SubLObject cs = $wf_col_template_comboP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_wf_col_template_comboP() {
        final SubLObject cs = $wf_col_template_comboP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_wf_col_template_comboP_alt(SubLObject template, SubLObject obj_cycl, SubLObject keyword) {
        return memoization_state.caching_state_remove_function_results_with_args($wf_col_template_comboP_caching_state$.getGlobalValue(), list(template, obj_cycl, keyword), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_wf_col_template_comboP(final SubLObject template, final SubLObject obj_cycl, final SubLObject keyword) {
        return memoization_state.caching_state_remove_function_results_with_args($wf_col_template_comboP_caching_state$.getGlobalValue(), list(template, obj_cycl, keyword), UNPROVIDED, UNPROVIDED);
    }

    /**
     * The main wff-checking function for semtrans templates.
     *
     * @param TEMPLATE;
    #$KeywordVariableTemplate
     * 		
     * @return BOOLEAN; Is TEMPLATE well-formed with OBJ-CYCL substituted for KEYWORD?
     */
    @LispMethod(comment = "The main wff-checking function for semtrans templates.\r\n\r\n@param TEMPLATE;\n#$KeywordVariableTemplate\r\n\t\t\r\n@return BOOLEAN; Is TEMPLATE well-formed with OBJ-CYCL substituted for KEYWORD?")
    public static final SubLObject wf_col_template_comboP_internal_alt(SubLObject template, SubLObject obj_cycl, SubLObject keyword) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stripped_template = parsing_utilities.strip_nl_tags(template, UNPROVIDED);
                SubLObject stripped_obj_cycl = parsing_utilities.strip_nl_tags(obj_cycl, UNPROVIDED);
                SubLObject keyword_bindings = list(cons(keyword, stripped_obj_cycl));
                return makeBoolean(((!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ZERO_INTEGER)) || (NIL != rbp_wff.rbp_wf_template_argsP(stripped_template, keyword_bindings, ONE_INTEGER))) && ((!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ONE_INTEGER)) || (NIL != rbp_wff.rbp_wf_template_argsP(stripped_template, keyword_bindings, TWO_INTEGER))));
            }
        }
    }

    @LispMethod(comment = "The main wff-checking function for semtrans templates.\r\n\r\n@param TEMPLATE;\n\t\t#$KeywordVariableTemplate\r\n\t\t\r\n@return BOOLEAN; Is TEMPLATE well-formed with OBJ-CYCL substituted for KEYWORD?")
    public static SubLObject wf_col_template_comboP_internal(final SubLObject template, final SubLObject obj_cycl, final SubLObject keyword) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject stripped_template = parsing_utilities.strip_nl_tags(template, UNPROVIDED);
        final SubLObject stripped_obj_cycl = parsing_utilities.strip_nl_tags(obj_cycl, UNPROVIDED);
        final SubLObject keyword_bindings = list(cons(keyword, stripped_obj_cycl));
        return makeBoolean(((!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ZERO_INTEGER)) || (NIL != rbp_wff.rbp_wf_template_argsP(stripped_template, keyword_bindings, ONE_INTEGER))) && ((!parsing_vars.$np_wff_filter_level$.getDynamicValue(thread).numG(ONE_INTEGER)) || (NIL != rbp_wff.rbp_wf_template_argsP(stripped_template, keyword_bindings, TWO_INTEGER))));
    }/**
     * The main wff-checking function for semtrans templates.
     *
     * @param TEMPLATE;
    		#$KeywordVariableTemplate
     * 		
     * @return BOOLEAN; Is TEMPLATE well-formed with OBJ-CYCL substituted for KEYWORD?
     */


    public static final SubLObject wf_col_template_comboP_alt(SubLObject template, SubLObject obj_cycl, SubLObject keyword) {
        {
            SubLObject caching_state = $wf_col_template_comboP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym87$WF_COL_TEMPLATE_COMBO_, $sym88$_WF_COL_TEMPLATE_COMBO__CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int$1024);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_3(template, obj_cycl, keyword);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw24$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (template.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (obj_cycl.equal(cached_args.first())) {
                                        cached_args = cached_args.rest();
                                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && keyword.equal(cached_args.first())) {
                                            return memoization_state.caching_results(results2);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.np_parser.wf_col_template_comboP_internal(template, obj_cycl, keyword)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(template, obj_cycl, keyword));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject wf_col_template_comboP(final SubLObject template, final SubLObject obj_cycl, final SubLObject keyword) {
        SubLObject caching_state = $wf_col_template_comboP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym86$WF_COL_TEMPLATE_COMBO_, $sym87$_WF_COL_TEMPLATE_COMBO__CACHING_STATE_, NIL, EQUAL, THREE_INTEGER, $int$1024);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(template, obj_cycl, keyword);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (template.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (obj_cycl.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && keyword.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(wf_col_template_comboP_internal(template, obj_cycl, keyword)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(template, obj_cycl, keyword));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_prep_semtrans_hash_alt() {
        if (!$prep_semtrans_hash$.getGlobalValue().isHashtable()) {
            $prep_semtrans_hash$.setGlobalValue(make_hash_table($int$48, symbol_function(EQUALP), UNPROVIDED));
        }
        return clrhash($prep_semtrans_hash$.getGlobalValue());
    }

    public static SubLObject clear_prep_semtrans_hash() {
        if (!$prep_semtrans_hash$.getGlobalValue().isHashtable()) {
            $prep_semtrans_hash$.setGlobalValue(make_hash_table($int$48, symbol_function(EQUALP), UNPROVIDED));
        }
        return clrhash($prep_semtrans_hash$.getGlobalValue());
    }

    public static final SubLObject initialize_prep_semtrans_hash_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.np_parser.clear_prep_semtrans_hash();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject pred_var = $$prepSemTrans;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator($$Post_NounPhraseModifyingFrame, THREE_INTEGER, pred_var)) {
                            {
                                SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator($$Post_NounPhraseModifyingFrame, THREE_INTEGER, pred_var);
                                SubLObject done_var = NIL;
                                SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    {
                                        SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                        SubLObject valid = makeBoolean(token_var != final_index_spec);
                                        if (NIL != valid) {
                                            {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                    {
                                                        SubLObject done_var_38 = NIL;
                                                        SubLObject token_var_39 = NIL;
                                                        while (NIL == done_var_38) {
                                                            {
                                                                SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_39);
                                                                SubLObject valid_40 = makeBoolean(token_var_39 != as);
                                                                if (NIL != valid_40) {
                                                                    com.cyc.cycjava.cycl.np_parser.add_to_prep_semtrans_hash(as);
                                                                }
                                                                done_var_38 = makeBoolean(NIL == valid_40);
                                                            }
                                                        } 
                                                    }
                                                } finally {
                                                    {
                                                        SubLObject _prev_bind_0_41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_41, thread);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                        done_var = makeBoolean(NIL == valid);
                                    }
                                } 
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return $prep_semtrans_hash$.getGlobalValue();
        }
    }

    public static SubLObject initialize_prep_semtrans_hash() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_prep_semtrans_hash();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject pred_var = $$prepSemTrans;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator($$Post_NounPhraseModifyingFrame, THREE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator($$Post_NounPhraseModifyingFrame, THREE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                            SubLObject done_var_$36 = NIL;
                            final SubLObject token_var_$37 = NIL;
                            while (NIL == done_var_$36) {
                                final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$37);
                                final SubLObject valid_$38 = makeBoolean(!token_var_$37.eql(as));
                                if (NIL != valid_$38) {
                                    add_to_prep_semtrans_hash(as);
                                }
                                done_var_$36 = makeBoolean(NIL == valid_$38);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$39 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$39, thread);
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
        return $prep_semtrans_hash$.getGlobalValue();
    }

    /**
     * Add the information from AS to *PREP-SEMTRANS-HASH*
     */
    @LispMethod(comment = "Add the information from AS to *PREP-SEMTRANS-HASH*")
    public static final SubLObject add_to_prep_semtrans_hash_alt(SubLObject as) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject formula = fi.assertion_fi_formula(as, UNPROVIDED);
                SubLObject wu = cycl_utilities.formula_arg1(formula, UNPROVIDED);
                SubLObject strings = lexicon_accessors.get_strings_of_type(wu, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject semtrans = cycl_utilities.formula_arg4(formula, UNPROVIDED);
                SubLObject cdolist_list_var = strings;
                SubLObject string = NIL;
                for (string = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , string = cdolist_list_var.first()) {
                    {
                        SubLObject sofar = gethash(string, $prep_semtrans_hash$.getGlobalValue(), NIL);
                        if (NIL == subl_promotions.memberP(semtrans, sofar, $sym84$NPP_TERM_, UNPROVIDED)) {
                            if (NIL != lexicon_vars.$print_while_building_hashP$.getDynamicValue(thread)) {
                                format(T, $str_alt94$__Adding__S__S_to____S, new SubLObject[]{ string, semtrans, sofar });
                            }
                            sethash(string, $prep_semtrans_hash$.getGlobalValue(), adjoin(semtrans, sofar, UNPROVIDED, UNPROVIDED));
                        }
                    }
                }
            }
            return $prep_semtrans_hash$.getGlobalValue();
        }
    }

    @LispMethod(comment = "Add the information from AS to *PREP-SEMTRANS-HASH*")
    public static SubLObject add_to_prep_semtrans_hash(final SubLObject as) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject formula = fi.assertion_fi_formula(as, UNPROVIDED);
        final SubLObject wu = cycl_utilities.formula_arg1(formula, UNPROVIDED);
        final SubLObject strings = lexicon_accessors.get_strings_of_type(wu, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject semtrans = cycl_utilities.formula_arg4(formula, UNPROVIDED);
        SubLObject cdolist_list_var = strings;
        SubLObject string = NIL;
        string = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject sofar = gethash(string, $prep_semtrans_hash$.getGlobalValue(), NIL);
            if (NIL == subl_promotions.memberP(semtrans, sofar, $sym83$NPP_TERM_, UNPROVIDED)) {
                if (NIL != lexicon_vars.$print_while_building_hashP$.getDynamicValue(thread)) {
                    format(T, $str93$__Adding__S__S_to____S, new SubLObject[]{ string, semtrans, sofar });
                }
                sethash(string, $prep_semtrans_hash$.getGlobalValue(), adjoin(semtrans, sofar, UNPROVIDED, UNPROVIDED));
            }
            cdolist_list_var = cdolist_list_var.rest();
            string = cdolist_list_var.first();
        } 
        return $prep_semtrans_hash$.getGlobalValue();
    }/**
     * Add the information from AS to *PREP-SEMTRANS-HASH*
     */


    /**
     *
     *
     * @param STRING;
     * 		a preposition string like 'with'
     * @return LISTP; of NLTemplateExpression objects
     */
    @LispMethod(comment = "@param STRING;\r\n\t\ta preposition string like \'with\'\r\n@return LISTP; of NLTemplateExpression objects")
    public static final SubLObject semtrans_of_prep_string_alt(SubLObject string) {
        if (!hash_table_count($prep_semtrans_hash$.getGlobalValue()).isPositive()) {
            com.cyc.cycjava.cycl.np_parser.initialize_prep_semtrans_hash();
        }
        return gethash(string, $prep_semtrans_hash$.getGlobalValue(), UNPROVIDED);
    }

    /**
     *
     *
     * @param STRING;
     * 		a preposition string like 'with'
     * @return LISTP; of NLTemplateExpression objects
     */
    @LispMethod(comment = "@param STRING;\r\n\t\ta preposition string like \'with\'\r\n@return LISTP; of NLTemplateExpression objects")
    public static SubLObject semtrans_of_prep_string(final SubLObject string) {
        if (!hash_table_count($prep_semtrans_hash$.getGlobalValue()).isPositive()) {
            initialize_prep_semtrans_hash();
        }
        return gethash(string, $prep_semtrans_hash$.getGlobalValue(), UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ1 less complex than OBJ2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ1 less complex than OBJ2?")
    public static final SubLObject npp_term_complexity_L_alt(SubLObject obj1, SubLObject obj2) {
        if (obj2.isAtom()) {
            return NIL;
        } else {
            if (NIL == obj1) {
                return NIL;
            } else {
                if (obj1.isAtom()) {
                    return T;
                }
            }
        }
        {
            SubLObject depth1 = function_terms.term_functional_complexity(obj1);
            SubLObject depth2 = function_terms.term_functional_complexity(obj2);
            if (NIL != list_utilities.lesser_length_p(obj1, obj2)) {
                return T;
            } else {
                if (NIL != list_utilities.greater_length_p(obj1, obj2)) {
                    return NIL;
                } else {
                    if (depth1.numL(depth2)) {
                        return T;
                    } else {
                        if (depth1.numG(depth2)) {
                            return NIL;
                        } else {
                            if (NIL != list_utilities.lesser_length_p(list_utilities.flatten(obj1), list_utilities.flatten(obj2))) {
                                return T;
                            } else {
                                if (NIL != list_utilities.greater_length_p(list_utilities.flatten(obj1), list_utilities.flatten(obj2))) {
                                    return NIL;
                                } else {
                                    return NIL;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ1 less complex than OBJ2?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ1 less complex than OBJ2?")
    public static SubLObject npp_term_complexity_L(final SubLObject obj1, final SubLObject obj2) {
        if (obj2.isAtom()) {
            return NIL;
        }
        if (NIL == obj1) {
            return NIL;
        }
        if (obj1.isAtom()) {
            return T;
        }
        final SubLObject depth1 = function_terms.term_functional_complexity(obj1);
        final SubLObject depth2 = function_terms.term_functional_complexity(obj2);
        if (NIL != list_utilities.lesser_length_p(obj1, obj2)) {
            return T;
        }
        if (NIL != list_utilities.greater_length_p(obj1, obj2)) {
            return NIL;
        }
        if (depth1.numL(depth2)) {
            return T;
        }
        if (depth1.numG(depth2)) {
            return NIL;
        }
        if (NIL != list_utilities.lesser_length_p(list_utilities.flatten(obj1), list_utilities.flatten(obj2))) {
            return T;
        }
        if (NIL != list_utilities.greater_length_p(list_utilities.flatten(obj1), list_utilities.flatten(obj2))) {
            return NIL;
        }
        return NIL;
    }

    /**
     *
     *
     * @param STRING
    stringp;
     * 		
     * @return LISTP of pairs of strings
     */
    @LispMethod(comment = "@param STRING\nstringp;\r\n\t\t\r\n@return LISTP of pairs of strings")
    public static final SubLObject split_string_at_prepositions_alt(SubLObject string) {
        {
            SubLObject tokens = string_utilities.string_tokenize(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject initial_stack = NIL;
            SubLObject ans = NIL;
            SubLObject token = NIL;
            for (token = tokens.first(); NIL != tokens; token = tokens.first()) {
                if (NIL != lexicon_accessors.string_is_posP(token, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    ans = cons(list(string_utilities.bunge(reverse(initial_stack), UNPROVIDED), string_utilities.bunge(tokens, UNPROVIDED)), ans);
                }
                initial_stack = cons(token, initial_stack);
                tokens = tokens.rest();
            }
            return ans;
        }
    }

    /**
     *
     *
     * @param STRING
    stringp;
     * 		
     * @return LISTP of pairs of strings
     */
    @LispMethod(comment = "@param STRING\nstringp;\r\n\t\t\r\n@return LISTP of pairs of strings")
    public static SubLObject split_string_at_prepositions(final SubLObject string) {
        SubLObject tokens = string_utilities.string_tokenize(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject initial_stack = NIL;
        SubLObject ans = NIL;
        SubLObject token = NIL;
        token = tokens.first();
        while (NIL != tokens) {
            if (NIL != lexicon_accessors.string_is_posP(token, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                ans = cons(list(string_utilities.bunge(reverse(initial_stack), UNPROVIDED), string_utilities.bunge(tokens, UNPROVIDED)), ans);
            }
            initial_stack = cons(token, initial_stack);
            tokens = tokens.rest();
            token = tokens.first();
        } 
        return ans;
    }

    /**
     *
     *
     * @param POS
     * 		fort-p; a #$SpeechPart
     * @return 1 STRINGP; the part of STRING beginning with the first word matching POS
     * @return 2 STRINGP; the rest (i.e. first part) of STRING
     */
    @LispMethod(comment = "@param POS\r\n\t\tfort-p; a #$SpeechPart\r\n@return 1 STRINGP; the part of STRING beginning with the first word matching POS\r\n@return 2 STRINGP; the rest (i.e. first part) of STRING")
    public static final SubLObject find_final_phrase_beginning_with_pos_alt(SubLObject string, SubLObject pos) {
        {
            SubLObject tokens = string_utilities.string_tokenize(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject phrase = $str_alt95$;
            SubLObject initial_stack = NIL;
            SubLObject token = NIL;
            for (token = tokens.first(); !((NIL == tokens) || (NIL != string_utilities.non_empty_stringP(phrase))); token = tokens.first()) {
                if (NIL != lexicon_accessors.string_is_posP(token, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    phrase = string_utilities.bunge(tokens, UNPROVIDED);
                } else {
                    initial_stack = cons(token, initial_stack);
                    tokens = tokens.rest();
                }
            }
            return values(phrase, string_utilities.bunge(reverse(initial_stack), UNPROVIDED));
        }
    }

    /**
     *
     *
     * @param POS
     * 		fort-p; a #$SpeechPart
     * @return 1 STRINGP; the part of STRING beginning with the first word matching POS
     * @return 2 STRINGP; the rest (i.e. first part) of STRING
     */
    @LispMethod(comment = "@param POS\r\n\t\tfort-p; a #$SpeechPart\r\n@return 1 STRINGP; the part of STRING beginning with the first word matching POS\r\n@return 2 STRINGP; the rest (i.e. first part) of STRING")
    public static SubLObject find_final_phrase_beginning_with_pos(final SubLObject string, final SubLObject pos) {
        SubLObject tokens = string_utilities.string_tokenize(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject phrase = $str94$;
        SubLObject initial_stack = NIL;
        SubLObject token = NIL;
        token = tokens.first();
        while ((NIL != tokens) && (NIL == string_utilities.non_empty_stringP(phrase))) {
            if (NIL != lexicon_accessors.string_is_posP(token, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                phrase = string_utilities.bunge(tokens, UNPROVIDED);
            } else {
                initial_stack = cons(token, initial_stack);
                tokens = tokens.rest();
            }
            token = tokens.first();
        } 
        return values(phrase, string_utilities.bunge(reverse(initial_stack), UNPROVIDED));
    }

    /**
     *
     *
     * @param POS
     * 		fort-p; a #$SpeechPart
     * @return 1 STRINGP; a maximal list of initial words in STRING matching POS
     * @return 2 STRINGP; the rest of STRING
     */
    @LispMethod(comment = "@param POS\r\n\t\tfort-p; a #$SpeechPart\r\n@return 1 STRINGP; a maximal list of initial words in STRING matching POS\r\n@return 2 STRINGP; the rest of STRING")
    public static final SubLObject find_initial_strings_with_pos_alt(SubLObject string, SubLObject pos) {
        {
            SubLObject tokens = string_utilities.string_tokenize(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject initial_stack = NIL;
            SubLObject non_initial_words = NIL;
            SubLObject token = NIL;
            for (token = tokens.first(); !((NIL == tokens) || (NIL != non_initial_words)); token = tokens.first()) {
                if (NIL != lexicon_accessors.string_is_posP(token, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    initial_stack = cons(token, initial_stack);
                    tokens = tokens.rest();
                } else {
                    non_initial_words = tokens;
                }
            }
            return values(string_utilities.bunge(reverse(initial_stack), UNPROVIDED), string_utilities.bunge(non_initial_words, UNPROVIDED));
        }
    }

    /**
     *
     *
     * @param POS
     * 		fort-p; a #$SpeechPart
     * @return 1 STRINGP; a maximal list of initial words in STRING matching POS
     * @return 2 STRINGP; the rest of STRING
     */
    @LispMethod(comment = "@param POS\r\n\t\tfort-p; a #$SpeechPart\r\n@return 1 STRINGP; a maximal list of initial words in STRING matching POS\r\n@return 2 STRINGP; the rest of STRING")
    public static SubLObject find_initial_strings_with_pos(final SubLObject string, final SubLObject pos) {
        SubLObject tokens = string_utilities.string_tokenize(string, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject initial_stack = NIL;
        SubLObject non_initial_words = NIL;
        SubLObject token = NIL;
        token = tokens.first();
        while ((NIL != tokens) && (NIL == non_initial_words)) {
            if (NIL != lexicon_accessors.string_is_posP(token, pos, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                initial_stack = cons(token, initial_stack);
                tokens = tokens.rest();
            } else {
                non_initial_words = tokens;
            }
            token = tokens.first();
        } 
        return values(string_utilities.bunge(reverse(initial_stack), UNPROVIDED), string_utilities.bunge(non_initial_words, UNPROVIDED));
    }

    /**
     * Add wrapper functions and tags to the CycL in each parse of PARSES
     */
    @LispMethod(comment = "Add wrapper functions and tags to the CycL in each parse of PARSES")
    public static final SubLObject npp_add_morph_wrappers_alt(SubLObject parses) {
        {
            SubLObject ans = NIL;
            SubLObject cdolist_list_var = parses;
            SubLObject parse = NIL;
            for (parse = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , parse = cdolist_list_var.first()) {
                ans = cons(com.cyc.cycjava.cycl.np_parser.npp_add_number_wrapper(parse), ans);
            }
            return ans;
        }
    }

    @LispMethod(comment = "Add wrapper functions and tags to the CycL in each parse of PARSES")
    public static SubLObject npp_add_morph_wrappers(final SubLObject parses) {
        SubLObject ans = NIL;
        SubLObject cdolist_list_var = parses;
        SubLObject parse = NIL;
        parse = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            ans = cons(npp_add_number_wrapper(parse), ans);
            cdolist_list_var = cdolist_list_var.rest();
            parse = cdolist_list_var.first();
        } 
        return ans;
    }/**
     * Add wrapper functions and tags to the CycL in each parse of PARSES
     */


    /**
     * Add a wrapper function and tag to the CycL in PARSE, based on the pred in PARSE.
     */
    @LispMethod(comment = "Add a wrapper function and tag to the CycL in PARSE, based on the pred in PARSE.")
    public static final SubLObject npp_add_number_wrapper_alt(SubLObject parse) {
        {
            SubLObject datum = parse;
            SubLObject current = datum;
            SubLObject cycl = NIL;
            SubLObject pred = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt96);
            cycl = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt96);
            pred = current.first();
            current = current.rest();
            if (NIL == current) {
                return com.cyc.cycjava.cycl.np_parser.make_npp_parse(parsing_utilities.add_nl_number_wrapper(cycl, pred), pred);
            } else {
                cdestructuring_bind_error(datum, $list_alt96);
            }
        }
        return NIL;
    }

    @LispMethod(comment = "Add a wrapper function and tag to the CycL in PARSE, based on the pred in PARSE.")
    public static SubLObject npp_add_number_wrapper(final SubLObject parse) {
        SubLObject cycl = NIL;
        SubLObject pred = NIL;
        destructuring_bind_must_consp(parse, parse, $list95);
        cycl = parse.first();
        SubLObject current = parse.rest();
        destructuring_bind_must_consp(current, parse, $list95);
        pred = current.first();
        current = current.rest();
        if (NIL == current) {
            return make_npp_parse(parsing_utilities.add_nl_number_wrapper(cycl, pred), pred);
        }
        cdestructuring_bind_error(parse, $list95);
        return NIL;
    }/**
     * Add a wrapper function and tag to the CycL in PARSE, based on the pred in PARSE.
     */


    public static final SubLObject declare_np_parser_file_alt() {
        declareFunction("clear_npp_caches", "CLEAR-NPP-CACHES", 0, 0, false);
        declareFunction("npp_tokenize_strings", "NPP-TOKENIZE-STRINGS", 1, 2, false);
        declareFunction("npp_sentence_tokenize", "NPP-SENTENCE-TOKENIZE", 1, 3, false);
        declareFunction("npp_remove_no_denot_triples", "NPP-REMOVE-NO-DENOT-TRIPLES", 1, 0, false);
        declareFunction("npp_no_denot_tripleP", "NPP-NO-DENOT-TRIPLE?", 1, 0, false);
        declareFunction("npp_no_denot_quadP", "NPP-NO-DENOT-QUAD?", 1, 0, false);
        declareFunction("npp_filter_tokens", "NPP-FILTER-TOKENS", 2, 0, false);
        declareFunction("npp_bad_entryP", "NPP-BAD-ENTRY?", 2, 0, false);
        declareFunction("npp_triefy_unknown_strings", "NPP-TRIEFY-UNKNOWN-STRINGS", 1, 0, false);
        declareFunction("npp_triefy_unknown_string", "NPP-TRIEFY-UNKNOWN-STRING", 1, 0, false);
        declareFunction("npp_known_stringP", "NPP-KNOWN-STRING?", 1, 1, false);
        declareFunction("npp_init_excluded_denot_preds", "NPP-INIT-EXCLUDED-DENOT-PREDS", 0, 0, false);
        declareFunction("npp_excluded_denot_predP", "NPP-EXCLUDED-DENOT-PRED?", 1, 0, false);
        declareFunction("npp_convert_chunkings", "NPP-CONVERT-CHUNKINGS", 2, 0, false);
        declareFunction("npp_convert_string_tokens", "NPP-CONVERT-STRING-TOKENS", 2, 0, false);
        declareFunction("npp_convert_interval_tokens", "NPP-CONVERT-INTERVAL-TOKENS", 2, 0, false);
        declareFunction("npp_convert_string_token", "NPP-CONVERT-STRING-TOKEN", 2, 0, false);
        declareFunction("npp_convert_interval_token", "NPP-CONVERT-INTERVAL-TOKEN", 2, 0, false);
        declareFunction("npp_add_original_string_tokens", "NPP-ADD-ORIGINAL-STRING-TOKENS", 3, 0, false);
        declareFunction("npp_make_original_string_value", "NPP-MAKE-ORIGINAL-STRING-VALUE", 2, 0, false);
        declareFunction("nl_trie_entry_to_value_type", "NL-TRIE-ENTRY-TO-VALUE-TYPE", 2, 0, false);
        declareFunction("nl_trie_word_to_value_type", "NL-TRIE-WORD-TO-VALUE-TYPE", 2, 0, false);
        declareFunction("npp_value_denot", "NPP-VALUE-DENOT", 1, 0, false);
        declareFunction("npp_values_same_except_for_denot_p", "NPP-VALUES-SAME-EXCEPT-FOR-DENOT-P", 2, 0, false);
        declareFunction("npp_value_typeP", "NPP-VALUE-TYPE?", 2, 0, false);
        declareFunction("npp_values_of_typeP", "NPP-VALUES-OF-TYPE?", 2, 0, false);
        declareFunction("npp_tripleP", "NPP-TRIPLE?", 1, 0, false);
        declareFunction("npp_proper_tripleP", "NPP-PROPER-TRIPLE?", 1, 0, false);
        declareFunction("npp_original_string_triple_p", "NPP-ORIGINAL-STRING-TRIPLE-P", 1, 0, false);
        declareFunction("npp_quadP", "NPP-QUAD?", 1, 0, false);
        declareFunction("npp_proper_quadP", "NPP-PROPER-QUAD?", 1, 0, false);
        declareFunction("npp_denot_p", "NPP-DENOT-P", 1, 0, false);
        declareFunction("npp_posP", "NPP-POS?", 1, 0, false);
        declareFunction("npp_predP", "NPP-PRED?", 1, 0, false);
        declareFunction("npp_wuP", "NPP-WU?", 1, 0, false);
        declareFunction("make_npp_value_type", "MAKE-NPP-VALUE-TYPE", 4, 1, false);
        declareFunction("make_npp_triple", "MAKE-NPP-TRIPLE", 3, 0, false);
        declareFunction("make_npp_quad", "MAKE-NPP-QUAD", 4, 0, false);
        declareFunction("npp_canonicalize_pos", "NPP-CANONICALIZE-POS", 1, 1, false);
        declareFunction("clear_npp_canonical_pos_table", "CLEAR-NPP-CANONICAL-POS-TABLE", 0, 0, false);
        declareFunction("remove_npp_canonical_pos_table", "REMOVE-NPP-CANONICAL-POS-TABLE", 0, 1, false);
        declareFunction("npp_canonical_pos_table_internal", "NPP-CANONICAL-POS-TABLE-INTERNAL", 1, 0, false);
        declareFunction("npp_canonical_pos_table", "NPP-CANONICAL-POS-TABLE", 0, 1, false);
        declareFunction("get_subsumed_poses", "GET-SUBSUMED-POSES", 2, 0, false);
        declareFunction("get_constraint_poses", "GET-CONSTRAINT-POSES", 1, 0, false);
        declareFunction("npp_ok_with_no_denotsP", "NPP-OK-WITH-NO-DENOTS?", 1, 0, false);
        declareFunction("nl_trie_name_to_value_type", "NL-TRIE-NAME-TO-VALUE-TYPE", 2, 0, false);
        declareFunction("npp_stringE", "NPP-STRING=", 2, 0, false);
        declareFunction("npp_termE", "NPP-TERM=", 2, 0, false);
        declareFunction("make_npp_parse", "MAKE-NPP-PARSE", 2, 0, false);
        declareFunction("npp_parseP", "NPP-PARSE?", 1, 0, false);
        declareFunction("npp_proper_parseP", "NPP-PROPER-PARSE?", 1, 0, false);
        declareFunction("npp_original_string_parse_p", "NPP-ORIGINAL-STRING-PARSE-P", 1, 0, false);
        declareFunction("npp_parseE", "NPP-PARSE=", 2, 0, false);
        declareFunction("npp_parse_cycl", "NPP-PARSE-CYCL", 1, 0, false);
        declareFunction("npp_parse_pred", "NPP-PARSE-PRED", 1, 0, false);
        declareFunction("npp_combine_parse_lists", "NPP-COMBINE-PARSE-LISTS", 2, 0, false);
        declareFunction("np_wff_filter", "NP-WFF-FILTER", 0, 1, false);
        declareFunction("get_forts_for_np", "GET-FORTS-FOR-NP", 1, 0, false);
        declareFunction("get_cycls_for_np", "GET-CYCLS-FOR-NP", 1, 0, false);
        declareFunction("get_best_cycls_for_np", "GET-BEST-CYCLS-FOR-NP", 1, 0, false);
        declareFunction("parse_np", "PARSE-NP", 1, 1, false);
        declareFunction("parse_nbar", "PARSE-NBAR", 1, 0, false);
        declareFunction("parse_possessive_np", "PARSE-POSSESSIVE-NP", 2, 0, false);
        declareFunction("wrap_and_reformulate_cycl", "WRAP-AND-REFORMULATE-CYCL", 2, 0, false);
        declareFunction("parse_nbar_via_lookup", "PARSE-NBAR-VIA-LOOKUP", 1, 0, false);
        declareFunction("parse_nbar_with_and", "PARSE-NBAR-WITH-AND", 1, 0, false);
        declareFunction("parse_conjoined_nbars", "PARSE-CONJOINED-NBARS", 2, 1, false);
        declareFunction("parse_nbar_pp", "PARSE-NBAR-PP", 2, 0, false);
        declareFunction("split_and_parse_pp", "SPLIT-AND-PARSE-PP", 1, 0, false);
        declareFunction("parse_pp_in_np", "PARSE-PP-IN-NP", 2, 0, false);
        declareFunction("specify_prep_semtrans", "SPECIFY-PREP-SEMTRANS", 3, 0, false);
        declareFunction("clear_wf_col_template_comboP", "CLEAR-WF-COL-TEMPLATE-COMBO?", 0, 0, false);
        declareFunction("remove_wf_col_template_comboP", "REMOVE-WF-COL-TEMPLATE-COMBO?", 3, 0, false);
        declareFunction("wf_col_template_comboP_internal", "WF-COL-TEMPLATE-COMBO?-INTERNAL", 3, 0, false);
        declareFunction("wf_col_template_comboP", "WF-COL-TEMPLATE-COMBO?", 3, 0, false);
        declareFunction("clear_prep_semtrans_hash", "CLEAR-PREP-SEMTRANS-HASH", 0, 0, false);
        declareFunction("initialize_prep_semtrans_hash", "INITIALIZE-PREP-SEMTRANS-HASH", 0, 0, false);
        declareFunction("add_to_prep_semtrans_hash", "ADD-TO-PREP-SEMTRANS-HASH", 1, 0, false);
        declareFunction("semtrans_of_prep_string", "SEMTRANS-OF-PREP-STRING", 1, 0, false);
        declareFunction("npp_term_complexity_L", "NPP-TERM-COMPLEXITY-<", 2, 0, false);
        declareFunction("split_string_at_prepositions", "SPLIT-STRING-AT-PREPOSITIONS", 1, 0, false);
        declareFunction("find_final_phrase_beginning_with_pos", "FIND-FINAL-PHRASE-BEGINNING-WITH-POS", 2, 0, false);
        declareFunction("find_initial_strings_with_pos", "FIND-INITIAL-STRINGS-WITH-POS", 2, 0, false);
        declareFunction("npp_add_morph_wrappers", "NPP-ADD-MORPH-WRAPPERS", 1, 0, false);
        declareFunction("npp_add_number_wrapper", "NPP-ADD-NUMBER-WRAPPER", 1, 0, false);
        declareFunction("npp_tests_init", "NPP-TESTS-INIT", 0, 1, false);
        return NIL;
    }

    public static SubLObject declare_np_parser_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("clear_npp_caches", "CLEAR-NPP-CACHES", 0, 0, false);
            declareFunction("npp_tokenize_strings", "NPP-TOKENIZE-STRINGS", 1, 2, false);
            declareFunction("npp_sentence_tokenize", "NPP-SENTENCE-TOKENIZE", 1, 3, false);
            declareFunction("npp_remove_no_denot_triples", "NPP-REMOVE-NO-DENOT-TRIPLES", 1, 0, false);
            declareFunction("npp_no_denot_tripleP", "NPP-NO-DENOT-TRIPLE?", 1, 0, false);
            declareFunction("npp_no_denot_quadP", "NPP-NO-DENOT-QUAD?", 1, 0, false);
            declareFunction("npp_filter_tokens", "NPP-FILTER-TOKENS", 2, 0, false);
            declareFunction("npp_bad_entryP", "NPP-BAD-ENTRY?", 2, 0, false);
            declareFunction("npp_triefy_unknown_strings", "NPP-TRIEFY-UNKNOWN-STRINGS", 1, 0, false);
            declareFunction("npp_triefy_unknown_string", "NPP-TRIEFY-UNKNOWN-STRING", 1, 0, false);
            declareFunction("npp_known_stringP", "NPP-KNOWN-STRING?", 1, 1, false);
            declareFunction("npp_init_excluded_denot_preds", "NPP-INIT-EXCLUDED-DENOT-PREDS", 0, 0, false);
            declareFunction("npp_excluded_denot_predP", "NPP-EXCLUDED-DENOT-PRED?", 1, 0, false);
            declareFunction("npp_convert_chunkings", "NPP-CONVERT-CHUNKINGS", 2, 0, false);
            declareFunction("npp_convert_string_tokens", "NPP-CONVERT-STRING-TOKENS", 2, 0, false);
            declareFunction("npp_convert_interval_tokens", "NPP-CONVERT-INTERVAL-TOKENS", 2, 0, false);
            declareFunction("npp_convert_string_token", "NPP-CONVERT-STRING-TOKEN", 2, 0, false);
            declareFunction("npp_convert_interval_token", "NPP-CONVERT-INTERVAL-TOKEN", 2, 0, false);
            declareFunction("npp_add_original_string_tokens", "NPP-ADD-ORIGINAL-STRING-TOKENS", 3, 0, false);
            declareFunction("npp_make_original_string_value", "NPP-MAKE-ORIGINAL-STRING-VALUE", 2, 0, false);
            declareFunction("nl_trie_entry_to_value_type", "NL-TRIE-ENTRY-TO-VALUE-TYPE", 2, 0, false);
            declareFunction("nl_trie_word_to_value_type", "NL-TRIE-WORD-TO-VALUE-TYPE", 2, 0, false);
            declareFunction("npp_value_denot", "NPP-VALUE-DENOT", 1, 0, false);
            declareFunction("npp_values_same_except_for_denot_p", "NPP-VALUES-SAME-EXCEPT-FOR-DENOT-P", 2, 0, false);
            declareFunction("npp_value_typeP", "NPP-VALUE-TYPE?", 2, 0, false);
            declareFunction("npp_values_of_typeP", "NPP-VALUES-OF-TYPE?", 2, 0, false);
            declareFunction("npp_tripleP", "NPP-TRIPLE?", 1, 0, false);
            declareFunction("npp_proper_tripleP", "NPP-PROPER-TRIPLE?", 1, 0, false);
            declareFunction("npp_original_string_triple_p", "NPP-ORIGINAL-STRING-TRIPLE-P", 1, 0, false);
            declareFunction("npp_quadP", "NPP-QUAD?", 1, 0, false);
            declareFunction("npp_proper_quadP", "NPP-PROPER-QUAD?", 1, 0, false);
            declareFunction("npp_denot_p", "NPP-DENOT-P", 1, 0, false);
            declareFunction("npp_posP", "NPP-POS?", 1, 0, false);
            declareFunction("npp_predP", "NPP-PRED?", 1, 0, false);
            declareFunction("npp_wuP", "NPP-WU?", 1, 0, false);
            declareFunction("make_npp_value_type", "MAKE-NPP-VALUE-TYPE", 4, 1, false);
            declareFunction("make_npp_triple", "MAKE-NPP-TRIPLE", 3, 0, false);
            declareFunction("make_npp_quad", "MAKE-NPP-QUAD", 4, 0, false);
            declareFunction("npp_canonicalize_pos", "NPP-CANONICALIZE-POS", 1, 1, false);
            declareFunction("clear_npp_canonical_pos_table", "CLEAR-NPP-CANONICAL-POS-TABLE", 0, 0, false);
            declareFunction("remove_npp_canonical_pos_table", "REMOVE-NPP-CANONICAL-POS-TABLE", 0, 1, false);
            declareFunction("npp_canonical_pos_table_internal", "NPP-CANONICAL-POS-TABLE-INTERNAL", 1, 0, false);
            declareFunction("npp_canonical_pos_table", "NPP-CANONICAL-POS-TABLE", 0, 1, false);
            declareFunction("get_subsumed_poses", "GET-SUBSUMED-POSES", 2, 0, false);
            declareFunction("get_constraint_poses", "GET-CONSTRAINT-POSES", 1, 0, false);
            declareFunction("npp_ok_with_no_denotsP", "NPP-OK-WITH-NO-DENOTS?", 1, 0, false);
            declareFunction("nl_trie_name_to_value_type", "NL-TRIE-NAME-TO-VALUE-TYPE", 2, 0, false);
            declareFunction("npp_stringE", "NPP-STRING=", 2, 0, false);
            declareFunction("npp_termE", "NPP-TERM=", 2, 0, false);
            declareFunction("make_npp_parse", "MAKE-NPP-PARSE", 2, 0, false);
            declareFunction("npp_parseP", "NPP-PARSE?", 1, 0, false);
            declareFunction("npp_proper_parseP", "NPP-PROPER-PARSE?", 1, 0, false);
            declareFunction("npp_original_string_parse_p", "NPP-ORIGINAL-STRING-PARSE-P", 1, 0, false);
            declareFunction("npp_parseE", "NPP-PARSE=", 2, 0, false);
            declareFunction("npp_parse_cycl", "NPP-PARSE-CYCL", 1, 0, false);
            declareFunction("npp_parse_pred", "NPP-PARSE-PRED", 1, 0, false);
            declareFunction("npp_combine_parse_lists", "NPP-COMBINE-PARSE-LISTS", 2, 0, false);
            declareFunction("np_wff_filter", "NP-WFF-FILTER", 0, 1, false);
            declareFunction("get_forts_for_np", "GET-FORTS-FOR-NP", 1, 0, false);
            declareFunction("get_cycls_for_np", "GET-CYCLS-FOR-NP", 1, 0, false);
            declareFunction("get_best_cycls_for_np", "GET-BEST-CYCLS-FOR-NP", 1, 0, false);
            declareFunction("parse_np", "PARSE-NP", 1, 1, false);
            declareFunction("parse_nbar", "PARSE-NBAR", 1, 0, false);
            declareFunction("parse_possessive_np", "PARSE-POSSESSIVE-NP", 2, 0, false);
            declareFunction("wrap_and_reformulate_cycl", "WRAP-AND-REFORMULATE-CYCL", 2, 0, false);
            declareFunction("parse_nbar_via_lookup", "PARSE-NBAR-VIA-LOOKUP", 1, 0, false);
            declareFunction("parse_nbar_with_and", "PARSE-NBAR-WITH-AND", 1, 0, false);
            declareFunction("parse_conjoined_nbars", "PARSE-CONJOINED-NBARS", 2, 1, false);
            declareFunction("parse_nbar_pp", "PARSE-NBAR-PP", 2, 0, false);
            declareFunction("split_and_parse_pp", "SPLIT-AND-PARSE-PP", 1, 0, false);
            declareFunction("parse_pp_in_np", "PARSE-PP-IN-NP", 2, 0, false);
            declareFunction("specify_prep_semtrans", "SPECIFY-PREP-SEMTRANS", 3, 0, false);
            declareFunction("clear_wf_col_template_comboP", "CLEAR-WF-COL-TEMPLATE-COMBO?", 0, 0, false);
            declareFunction("remove_wf_col_template_comboP", "REMOVE-WF-COL-TEMPLATE-COMBO?", 3, 0, false);
            declareFunction("wf_col_template_comboP_internal", "WF-COL-TEMPLATE-COMBO?-INTERNAL", 3, 0, false);
            declareFunction("wf_col_template_comboP", "WF-COL-TEMPLATE-COMBO?", 3, 0, false);
            declareFunction("clear_prep_semtrans_hash", "CLEAR-PREP-SEMTRANS-HASH", 0, 0, false);
            declareFunction("initialize_prep_semtrans_hash", "INITIALIZE-PREP-SEMTRANS-HASH", 0, 0, false);
            declareFunction("add_to_prep_semtrans_hash", "ADD-TO-PREP-SEMTRANS-HASH", 1, 0, false);
            declareFunction("semtrans_of_prep_string", "SEMTRANS-OF-PREP-STRING", 1, 0, false);
            declareFunction("npp_term_complexity_L", "NPP-TERM-COMPLEXITY-<", 2, 0, false);
            declareFunction("split_string_at_prepositions", "SPLIT-STRING-AT-PREPOSITIONS", 1, 0, false);
            declareFunction("find_final_phrase_beginning_with_pos", "FIND-FINAL-PHRASE-BEGINNING-WITH-POS", 2, 0, false);
            declareFunction("find_initial_strings_with_pos", "FIND-INITIAL-STRINGS-WITH-POS", 2, 0, false);
            declareFunction("npp_add_morph_wrappers", "NPP-ADD-MORPH-WRAPPERS", 1, 0, false);
            declareFunction("npp_add_number_wrapper", "NPP-ADD-NUMBER-WRAPPER", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("npp_tests_init", "NPP-TESTS-INIT", 0, 1, false);
        }
        return NIL;
    }

    public static SubLObject declare_np_parser_file_Previous() {
        declareFunction("clear_npp_caches", "CLEAR-NPP-CACHES", 0, 0, false);
        declareFunction("npp_tokenize_strings", "NPP-TOKENIZE-STRINGS", 1, 2, false);
        declareFunction("npp_sentence_tokenize", "NPP-SENTENCE-TOKENIZE", 1, 3, false);
        declareFunction("npp_remove_no_denot_triples", "NPP-REMOVE-NO-DENOT-TRIPLES", 1, 0, false);
        declareFunction("npp_no_denot_tripleP", "NPP-NO-DENOT-TRIPLE?", 1, 0, false);
        declareFunction("npp_no_denot_quadP", "NPP-NO-DENOT-QUAD?", 1, 0, false);
        declareFunction("npp_filter_tokens", "NPP-FILTER-TOKENS", 2, 0, false);
        declareFunction("npp_bad_entryP", "NPP-BAD-ENTRY?", 2, 0, false);
        declareFunction("npp_triefy_unknown_strings", "NPP-TRIEFY-UNKNOWN-STRINGS", 1, 0, false);
        declareFunction("npp_triefy_unknown_string", "NPP-TRIEFY-UNKNOWN-STRING", 1, 0, false);
        declareFunction("npp_known_stringP", "NPP-KNOWN-STRING?", 1, 1, false);
        declareFunction("npp_init_excluded_denot_preds", "NPP-INIT-EXCLUDED-DENOT-PREDS", 0, 0, false);
        declareFunction("npp_excluded_denot_predP", "NPP-EXCLUDED-DENOT-PRED?", 1, 0, false);
        declareFunction("npp_convert_chunkings", "NPP-CONVERT-CHUNKINGS", 2, 0, false);
        declareFunction("npp_convert_string_tokens", "NPP-CONVERT-STRING-TOKENS", 2, 0, false);
        declareFunction("npp_convert_interval_tokens", "NPP-CONVERT-INTERVAL-TOKENS", 2, 0, false);
        declareFunction("npp_convert_string_token", "NPP-CONVERT-STRING-TOKEN", 2, 0, false);
        declareFunction("npp_convert_interval_token", "NPP-CONVERT-INTERVAL-TOKEN", 2, 0, false);
        declareFunction("npp_add_original_string_tokens", "NPP-ADD-ORIGINAL-STRING-TOKENS", 3, 0, false);
        declareFunction("npp_make_original_string_value", "NPP-MAKE-ORIGINAL-STRING-VALUE", 2, 0, false);
        declareFunction("nl_trie_entry_to_value_type", "NL-TRIE-ENTRY-TO-VALUE-TYPE", 2, 0, false);
        declareFunction("nl_trie_word_to_value_type", "NL-TRIE-WORD-TO-VALUE-TYPE", 2, 0, false);
        declareFunction("npp_value_denot", "NPP-VALUE-DENOT", 1, 0, false);
        declareFunction("npp_values_same_except_for_denot_p", "NPP-VALUES-SAME-EXCEPT-FOR-DENOT-P", 2, 0, false);
        declareFunction("npp_value_typeP", "NPP-VALUE-TYPE?", 2, 0, false);
        declareFunction("npp_values_of_typeP", "NPP-VALUES-OF-TYPE?", 2, 0, false);
        declareFunction("npp_tripleP", "NPP-TRIPLE?", 1, 0, false);
        declareFunction("npp_proper_tripleP", "NPP-PROPER-TRIPLE?", 1, 0, false);
        declareFunction("npp_original_string_triple_p", "NPP-ORIGINAL-STRING-TRIPLE-P", 1, 0, false);
        declareFunction("npp_quadP", "NPP-QUAD?", 1, 0, false);
        declareFunction("npp_proper_quadP", "NPP-PROPER-QUAD?", 1, 0, false);
        declareFunction("npp_denot_p", "NPP-DENOT-P", 1, 0, false);
        declareFunction("npp_posP", "NPP-POS?", 1, 0, false);
        declareFunction("npp_predP", "NPP-PRED?", 1, 0, false);
        declareFunction("npp_wuP", "NPP-WU?", 1, 0, false);
        declareFunction("make_npp_value_type", "MAKE-NPP-VALUE-TYPE", 4, 1, false);
        declareFunction("make_npp_triple", "MAKE-NPP-TRIPLE", 3, 0, false);
        declareFunction("make_npp_quad", "MAKE-NPP-QUAD", 4, 0, false);
        declareFunction("npp_canonicalize_pos", "NPP-CANONICALIZE-POS", 1, 1, false);
        declareFunction("clear_npp_canonical_pos_table", "CLEAR-NPP-CANONICAL-POS-TABLE", 0, 0, false);
        declareFunction("remove_npp_canonical_pos_table", "REMOVE-NPP-CANONICAL-POS-TABLE", 0, 1, false);
        declareFunction("npp_canonical_pos_table_internal", "NPP-CANONICAL-POS-TABLE-INTERNAL", 1, 0, false);
        declareFunction("npp_canonical_pos_table", "NPP-CANONICAL-POS-TABLE", 0, 1, false);
        declareFunction("get_subsumed_poses", "GET-SUBSUMED-POSES", 2, 0, false);
        declareFunction("get_constraint_poses", "GET-CONSTRAINT-POSES", 1, 0, false);
        declareFunction("npp_ok_with_no_denotsP", "NPP-OK-WITH-NO-DENOTS?", 1, 0, false);
        declareFunction("nl_trie_name_to_value_type", "NL-TRIE-NAME-TO-VALUE-TYPE", 2, 0, false);
        declareFunction("npp_stringE", "NPP-STRING=", 2, 0, false);
        declareFunction("npp_termE", "NPP-TERM=", 2, 0, false);
        declareFunction("make_npp_parse", "MAKE-NPP-PARSE", 2, 0, false);
        declareFunction("npp_parseP", "NPP-PARSE?", 1, 0, false);
        declareFunction("npp_proper_parseP", "NPP-PROPER-PARSE?", 1, 0, false);
        declareFunction("npp_original_string_parse_p", "NPP-ORIGINAL-STRING-PARSE-P", 1, 0, false);
        declareFunction("npp_parseE", "NPP-PARSE=", 2, 0, false);
        declareFunction("npp_parse_cycl", "NPP-PARSE-CYCL", 1, 0, false);
        declareFunction("npp_parse_pred", "NPP-PARSE-PRED", 1, 0, false);
        declareFunction("npp_combine_parse_lists", "NPP-COMBINE-PARSE-LISTS", 2, 0, false);
        declareFunction("np_wff_filter", "NP-WFF-FILTER", 0, 1, false);
        declareFunction("get_forts_for_np", "GET-FORTS-FOR-NP", 1, 0, false);
        declareFunction("get_cycls_for_np", "GET-CYCLS-FOR-NP", 1, 0, false);
        declareFunction("get_best_cycls_for_np", "GET-BEST-CYCLS-FOR-NP", 1, 0, false);
        declareFunction("parse_np", "PARSE-NP", 1, 1, false);
        declareFunction("parse_nbar", "PARSE-NBAR", 1, 0, false);
        declareFunction("parse_possessive_np", "PARSE-POSSESSIVE-NP", 2, 0, false);
        declareFunction("wrap_and_reformulate_cycl", "WRAP-AND-REFORMULATE-CYCL", 2, 0, false);
        declareFunction("parse_nbar_via_lookup", "PARSE-NBAR-VIA-LOOKUP", 1, 0, false);
        declareFunction("parse_nbar_with_and", "PARSE-NBAR-WITH-AND", 1, 0, false);
        declareFunction("parse_conjoined_nbars", "PARSE-CONJOINED-NBARS", 2, 1, false);
        declareFunction("parse_nbar_pp", "PARSE-NBAR-PP", 2, 0, false);
        declareFunction("split_and_parse_pp", "SPLIT-AND-PARSE-PP", 1, 0, false);
        declareFunction("parse_pp_in_np", "PARSE-PP-IN-NP", 2, 0, false);
        declareFunction("specify_prep_semtrans", "SPECIFY-PREP-SEMTRANS", 3, 0, false);
        declareFunction("clear_wf_col_template_comboP", "CLEAR-WF-COL-TEMPLATE-COMBO?", 0, 0, false);
        declareFunction("remove_wf_col_template_comboP", "REMOVE-WF-COL-TEMPLATE-COMBO?", 3, 0, false);
        declareFunction("wf_col_template_comboP_internal", "WF-COL-TEMPLATE-COMBO?-INTERNAL", 3, 0, false);
        declareFunction("wf_col_template_comboP", "WF-COL-TEMPLATE-COMBO?", 3, 0, false);
        declareFunction("clear_prep_semtrans_hash", "CLEAR-PREP-SEMTRANS-HASH", 0, 0, false);
        declareFunction("initialize_prep_semtrans_hash", "INITIALIZE-PREP-SEMTRANS-HASH", 0, 0, false);
        declareFunction("add_to_prep_semtrans_hash", "ADD-TO-PREP-SEMTRANS-HASH", 1, 0, false);
        declareFunction("semtrans_of_prep_string", "SEMTRANS-OF-PREP-STRING", 1, 0, false);
        declareFunction("npp_term_complexity_L", "NPP-TERM-COMPLEXITY-<", 2, 0, false);
        declareFunction("split_string_at_prepositions", "SPLIT-STRING-AT-PREPOSITIONS", 1, 0, false);
        declareFunction("find_final_phrase_beginning_with_pos", "FIND-FINAL-PHRASE-BEGINNING-WITH-POS", 2, 0, false);
        declareFunction("find_initial_strings_with_pos", "FIND-INITIAL-STRINGS-WITH-POS", 2, 0, false);
        declareFunction("npp_add_morph_wrappers", "NPP-ADD-MORPH-WRAPPERS", 1, 0, false);
        declareFunction("npp_add_number_wrapper", "NPP-ADD-NUMBER-WRAPPER", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_np_parser_file_alt() {
        defparameter("*CLEAR-NPP-CACHES-EACH-PARSE?*", T);
        deflexical("*NPP-ALWAYS-USE-MWP?*", NIL);
        defparameter("*NPP-DENOT-PREDS-TO-EXCLUDE*", NIL);
        deflexical("*NPP-CANONICAL-POS-TABLE-CACHING-STATE*", NIL);
        deflexical("*CODE-CONSTRAINT-POSES*", $list_alt41);
        defparameter("*NPP-SPECIFY-SEMTRANS?*", NIL);
        deflexical("*WF-COL-TEMPLATE-COMBO?-CACHING-STATE*", NIL);
        deflexical("*PREP-SEMTRANS-HASH*", NIL != boundp($prep_semtrans_hash$) ? ((SubLObject) ($prep_semtrans_hash$.getGlobalValue())) : make_hash_table($int$48, symbol_function(EQUALP), UNPROVIDED));
        deflexical("*NPP-TESTS*", NIL != boundp($npp_tests$) ? ((SubLObject) ($npp_tests$.getGlobalValue())) : NIL);
        deflexical("*NPP-TEST-FILE*", $str_alt98$_cyc_projects_rkf_usecases_biolog);
        return NIL;
    }

    public static SubLObject init_np_parser_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*CLEAR-NPP-CACHES-EACH-PARSE?*", T);
            deflexical("*NPP-ALWAYS-USE-MWP?*", NIL);
            defparameter("*NPP-DENOT-PREDS-TO-EXCLUDE*", NIL);
            deflexical("*NPP-CANONICAL-POS-TABLE-CACHING-STATE*", NIL);
            deflexical("*CODE-CONSTRAINT-POSES*", $list40);
            defparameter("*NPP-SPECIFY-SEMTRANS?*", NIL);
            deflexical("*WF-COL-TEMPLATE-COMBO?-CACHING-STATE*", NIL);
            deflexical("*PREP-SEMTRANS-HASH*", SubLTrampolineFile.maybeDefault($prep_semtrans_hash$, $prep_semtrans_hash$, () -> make_hash_table($int$48, symbol_function(EQUALP), UNPROVIDED)));
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CODE-CONSTRAINT-POSES*", $list_alt41);
            deflexical("*PREP-SEMTRANS-HASH*", NIL != boundp($prep_semtrans_hash$) ? ((SubLObject) ($prep_semtrans_hash$.getGlobalValue())) : make_hash_table($int$48, symbol_function(EQUALP), UNPROVIDED));
            deflexical("*NPP-TESTS*", NIL != boundp($npp_tests$) ? ((SubLObject) ($npp_tests$.getGlobalValue())) : NIL);
            deflexical("*NPP-TEST-FILE*", $str_alt98$_cyc_projects_rkf_usecases_biolog);
        }
        return NIL;
    }

    public static SubLObject init_np_parser_file_Previous() {
        defparameter("*CLEAR-NPP-CACHES-EACH-PARSE?*", T);
        deflexical("*NPP-ALWAYS-USE-MWP?*", NIL);
        defparameter("*NPP-DENOT-PREDS-TO-EXCLUDE*", NIL);
        deflexical("*NPP-CANONICAL-POS-TABLE-CACHING-STATE*", NIL);
        deflexical("*CODE-CONSTRAINT-POSES*", $list40);
        defparameter("*NPP-SPECIFY-SEMTRANS?*", NIL);
        deflexical("*WF-COL-TEMPLATE-COMBO?-CACHING-STATE*", NIL);
        deflexical("*PREP-SEMTRANS-HASH*", SubLTrampolineFile.maybeDefault($prep_semtrans_hash$, $prep_semtrans_hash$, () -> make_hash_table($int$48, symbol_function(EQUALP), UNPROVIDED)));
        return NIL;
    }

    public static final SubLObject setup_np_parser_file_alt() {
        memoization_state.note_globally_cached_function(NPP_CANONICAL_POS_TABLE);
        define_obsolete_register(GET_FORTS_FOR_NP, NIL);
        define_obsolete_register(GET_CYCLS_FOR_NP, $list_alt52);
        define_obsolete_register(GET_BEST_CYCLS_FOR_NP, NIL);
        define_obsolete_register(PARSE_NP, NIL);
        define_obsolete_register(PARSE_NBAR, NIL);
        memoization_state.note_globally_cached_function($sym87$WF_COL_TEMPLATE_COMBO_);
        declare_defglobal($prep_semtrans_hash$);
        declare_defglobal($npp_tests$);
        return NIL;
    }

    public static SubLObject setup_np_parser_file() {
        if (SubLFiles.USE_V1) {
            memoization_state.note_globally_cached_function(NPP_CANONICAL_POS_TABLE);
            define_obsolete_register(GET_FORTS_FOR_NP, NIL);
            define_obsolete_register(GET_CYCLS_FOR_NP, $list51);
            define_obsolete_register(GET_BEST_CYCLS_FOR_NP, NIL);
            define_obsolete_register(PARSE_NP, NIL);
            define_obsolete_register(PARSE_NBAR, NIL);
            memoization_state.note_globally_cached_function($sym86$WF_COL_TEMPLATE_COMBO_);
            declare_defglobal($prep_semtrans_hash$);
        }
        if (SubLFiles.USE_V2) {
            define_obsolete_register(GET_CYCLS_FOR_NP, $list_alt52);
            memoization_state.note_globally_cached_function($sym87$WF_COL_TEMPLATE_COMBO_);
            declare_defglobal($npp_tests$);
        }
        return NIL;
    }

    public static SubLObject setup_np_parser_file_Previous() {
        memoization_state.note_globally_cached_function(NPP_CANONICAL_POS_TABLE);
        define_obsolete_register(GET_FORTS_FOR_NP, NIL);
        define_obsolete_register(GET_CYCLS_FOR_NP, $list51);
        define_obsolete_register(GET_BEST_CYCLS_FOR_NP, NIL);
        define_obsolete_register(PARSE_NP, NIL);
        define_obsolete_register(PARSE_NBAR, NIL);
        memoization_state.note_globally_cached_function($sym86$WF_COL_TEMPLATE_COMBO_);
        declare_defglobal($prep_semtrans_hash$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_np_parser_file();
    }

    @Override
    public void initializeVariables() {
        init_np_parser_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_np_parser_file();
    }

    static {
    }

    static private final SubLString $str_alt4$_NL_TRIE__not_present_ = makeString("*NL-TRIE* not present.");

    static private final SubLSymbol $sym5$NPP_NO_DENOT_TRIPLE_ = makeSymbol("NPP-NO-DENOT-TRIPLE?");

    static private final SubLSymbol $sym8$NPP_KNOWN_STRING_ = makeSymbol("NPP-KNOWN-STRING?");

    public static final SubLObject $const11$DenotationPredicate_ExcludedFromN = reader_make_constant_shell("DenotationPredicate-ExcludedFromNPParser");

    static private final SubLString $str_alt19$_S_is_not_a_valid_NPP_value_type = makeString("~S is not a valid NPP value type");

    static private final SubLString $str_alt21$Don_t_know_how_to_make_NPP_value_ = makeString("Don't know how to make NPP value type ~S");

    public static final SubLSymbol $kw24$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLString $str_alt31$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt36$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt39$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLString $str_alt40$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLList $list_alt41 = list(reader_make_constant_shell("PossessivePronoun-Pre"));

    static private final SubLSymbol $sym49$NPP_PARSE_ = makeSymbol("NPP-PARSE=");

    static private final SubLList $list_alt52 = list(makeSymbol("PS-GET-CYCLS-FOR-NP"));

    static private final SubLList $list_alt57 = list(reader_make_constant_shell("PhraseFn-Bar1"), reader_make_constant_shell("Noun"));

    static private final SubLList $list_alt59 = list(makeSymbol("NBAR-DENOT"), makeSymbol("NBAR-PRED"));

    static private final SubLList $list_alt62 = list(makeSymbol("DENOT"), makeSymbol("POS"), makeSymbol("PRED"));

    static private final SubLString $str_alt64$and_ = makeString("and ");

    static private final SubLSymbol $sym65$NPP_STRING_ = makeSymbol("NPP-STRING=");

    static private final SubLString $str_alt68$_ = makeString(" ");

    static private final SubLList $list_alt70 = list(makeSymbol("NBAR1-CYCL"), makeSymbol("NBAR1-PRED"));

    static private final SubLList $list_alt71 = list(makeSymbol("NBAR2-CYCL"), makeSymbol("NBAR2-PRED"));

    static private final SubLList $list_alt76 = list(makeSymbol("NBAR-CYCL"), makeSymbol("NBAR-POS-PRED"));

    static private final SubLSymbol $sym79$_OBJ = makeSymbol("?OBJ");

    static private final SubLSymbol $sym84$NPP_TERM_ = makeSymbol("NPP-TERM=");

    static private final SubLSymbol $sym87$WF_COL_TEMPLATE_COMBO_ = makeSymbol("WF-COL-TEMPLATE-COMBO?");

    static private final SubLSymbol $sym88$_WF_COL_TEMPLATE_COMBO__CACHING_STATE_ = makeSymbol("*WF-COL-TEMPLATE-COMBO?-CACHING-STATE*");

    static private final SubLString $str_alt94$__Adding__S__S_to____S = makeString("~%Adding ~S ~S to : ~S");

    static private final SubLList $list_alt96 = list(makeSymbol("CYCL"), makeSymbol("PRED"));

    static private final SubLString $str_alt98$_cyc_projects_rkf_usecases_biolog = makeString("/cyc/projects/rkf/usecases/biologytext/parseplan/tests/npp-test-data.lisp");

    static private final SubLString $str_alt100$Unable_to_open__S = makeString("Unable to open ~S");
}

/**
 * Total time: 922 ms
 */
