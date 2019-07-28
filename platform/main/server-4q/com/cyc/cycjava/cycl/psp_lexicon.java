package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.psp_lexicon;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.psp_lexicon.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.THREE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class psp_lexicon extends SubLTranslatedFile {
    public static final SubLFile me = new psp_lexicon();

    public static final String myName = "com.cyc.cycjava.cycl.psp_lexicon";

    public static final String myFingerPrint = "c89a6007b42c780987c7f46970e6010adf3bebd868f08a6a7afcf65d278933ef";



    // defparameter
    private static final SubLSymbol $default_psp_lexicon_semantic_filter_preds$ = makeSymbol("*DEFAULT-PSP-LEXICON-SEMANTIC-FILTER-PREDS*");

    // Internal Constants
    public static final SubLSymbol PSP_LEXICON = makeSymbol("PSP-LEXICON");

    public static final SubLSymbol TERM_LEXICON_P = makeSymbol("TERM-LEXICON-P");



    public static final SubLSymbol GET_DEFAULT_PSP_LEXICON_EXPLICIT = makeSymbol("GET-DEFAULT-PSP-LEXICON-EXPLICIT");





    public static final SubLSymbol INITIALIZE_EXCLUDED_PREDS = makeSymbol("INITIALIZE-EXCLUDED-PREDS");

    public static final SubLSymbol $get_default_psp_lexicon_explicit_caching_state$ = makeSymbol("*GET-DEFAULT-PSP-LEXICON-EXPLICIT-CACHING-STATE*");



    private static final SubLList $list9 = list(reader_make_constant_shell(makeString("denotationRelatedTo")), reader_make_constant_shell(makeString("denotationPlaceholder")));





    private static final SubLObject $$preferredNameString = reader_make_constant_shell(makeString("preferredNameString"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$titleOfWork = reader_make_constant_shell(makeString("titleOfWork"));











    private static final SubLString $str21$_A_is_not_a__A = makeString("~A is not a ~A");





    private static final SubLString $$$continue_anyway = makeString("continue anyway");



    private static final SubLString $str26$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLObject $$genlPreds = reader_make_constant_shell(makeString("genlPreds"));

    private static final SubLString $str28$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    public static final SubLString $str29$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    public static final SubLString $str30$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");



    public static final SubLList $list32 = list(list(makeSymbol("SEMTRANS-LEXICON"), makeKeyword("CLASS"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMTRANS-ENTRIES"), list(makeSymbol("STRING")), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMTRANS-LEXICON"), NIL, makeKeyword("PRIVATE")));







    public static final SubLSymbol ABSTRACT_LEXICON = makeSymbol("ABSTRACT-LEXICON");



    public static final SubLList $list38 = list(new SubLObject[]{ reader_make_constant_shell(makeString("WebSearchDataMt")), reader_make_constant_shell(makeString("CyclistsMt")), reader_make_constant_shell(makeString("RelationParaphraseMt")), reader_make_constant_shell(makeString("WordNetMappingMt")), reader_make_constant_shell(makeString("PornographyJargonMt")), reader_make_constant_shell(makeString("CommonEnglishMisspellingsMt")), reader_make_constant_shell(makeString("ComputereseLexicalMt")), reader_make_constant_shell(makeString("CyclishMt")), reader_make_constant_shell(makeString("TemporaryLexicalAssertionsMt")), reader_make_constant_shell(makeString("EnglishWordSenseAssertions-HoldingMt")), reader_make_constant_shell(makeString("TemporaryLexicalAssertions-WordNetImportMt")), reader_make_constant_shell(makeString("RedundantLexicalMt")), reader_make_constant_shell(makeString("PDATemplateTestMt")), reader_make_constant_shell(makeString("EnglishParaphraseMt")), reader_make_constant_shell(makeString("SupplementalDeterminerSemTransLexicalMt")) });



    private static final SubLObject $const40$AllGeneralEnglishValidatedLexical = reader_make_constant_shell(makeString("AllGeneralEnglishValidatedLexicalMicrotheoryPSC"));



    private static final SubLObject $$AbstractLexiconSpecification = reader_make_constant_shell(makeString("AbstractLexiconSpecification"));

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PSP_LEXICON_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PSP-LEXICON-CLASS");























    public static final SubLSymbol $sym55$IGNORE_CACHE_ = makeSymbol("IGNORE-CACHE?");



    public static final SubLSymbol $sym57$ALLOW_FABRICATION_ = makeSymbol("ALLOW-FABRICATION?");









    public static final SubLSymbol $sym62$CONVERT_TO_EL_ = makeSymbol("CONVERT-TO-EL?");



    public static final SubLSymbol DEPENDENT_LEXICONS = makeSymbol("DEPENDENT-LEXICONS");

    public static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PSP_LEXICON_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PSP-LEXICON-INSTANCE");



    public static final SubLList $list67 = list(makeKeyword("PROTECTED"));

    public static final SubLList $list68 = list(makeString("@return lexicon-p; a newly created lexicon"), list(makeSymbol("INITIALIZE"), makeSymbol("SUPER")), list(makeSymbol("CSETQ"), makeSymbol("EXCLUDED-POS-LIST"), NIL), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLSymbol $sym69$OUTER_CATCH_FOR_PSP_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PSP-LEXICON-METHOD");

    public static final SubLSymbol PSP_LEXICON_INITIALIZE_METHOD = makeSymbol("PSP-LEXICON-INITIALIZE-METHOD");



    public static final SubLList $list72 = list(makeSymbol("POS"));

    public static final SubLList $list73 = list(makeString("Overridden to disallow exclusion of speech parts."), list(makeSymbol("ERROR"), makeString("Can't exclude ~S from a PSP lexicon."), makeSymbol("POS")), list(makeSymbol("RET"), makeSymbol("SELF")));

    public static final SubLString $str74$Can_t_exclude__S_from_a_PSP_lexic = makeString("Can't exclude ~S from a PSP lexicon.");

    public static final SubLSymbol PSP_LEXICON_EXCLUDE_POS_METHOD = makeSymbol("PSP-LEXICON-EXCLUDE-POS-METHOD");



    public static final SubLList $list77 = list(makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY"));

    public static final SubLList $list78 = list(makeString("@param STRING stringp; a string for which to create a list of lex-entries\n   @param NL-TRIE-ENTRY nl-trie-word-p or nl-trie-name-p; an nl-trie entry out of which\n   to construct a lexical entry\n   @return listp; a list of lex-entries containing the information in STRING and NL-TRIE-ENTRY"), list(makeSymbol("CLET"), list(list(makeSymbol("LEX-ENTRIES"), list(makeSymbol("CREATE-LEX-ENTRIES"), makeSymbol("SUPER"), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))), list(makeSymbol("PWHEN"), list(makeSymbol("EMPTY-LIST-P"), makeSymbol("LEX-ENTRIES")), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS-LEXICON"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMTRANS-LEXICON")))), list(makeSymbol("SEMTRANS-ENTRIES"), list(makeSymbol("FIM"), makeSymbol("SEMTRANS-LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("CREATE-LEX-ENTRIES")), makeSymbol("STRING"), makeSymbol("NL-TRIE-ENTRY")))), list(makeSymbol("PUNLESS"), list(makeSymbol("EMPTY-LIST-P"), makeSymbol("SEMTRANS-ENTRIES")), list(makeSymbol("CSETQ"), makeSymbol("LEX-ENTRIES"), list(makeSymbol("PSP-LEX-ENTRIES-FROM-SEMTRANS-LEX-ENTRIES"), makeSymbol("SEMTRANS-ENTRIES")))))), list(makeSymbol("RET"), makeSymbol("LEX-ENTRIES"))));

    public static final SubLSymbol $sym79$OUTER_CATCH_FOR_PSP_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PSP-LEXICON-METHOD");

    public static final SubLSymbol GET_SEMTRANS_LEXICON = makeSymbol("GET-SEMTRANS-LEXICON");

    public static final SubLSymbol PSP_LEXICON_CREATE_LEX_ENTRIES_METHOD = makeSymbol("PSP-LEXICON-CREATE-LEX-ENTRIES-METHOD");













    public static final SubLList $list88 = list(makeKeyword("PRIVATE"));

    public static final SubLList $list89 = list(makeString("@return SEMTRANS-LEXICON-P; the semtrans lexicon associated with this lexicon."), list(makeSymbol("PUNLESS"), list(makeSymbol("SEMTRANS-LEXICON-P"), makeSymbol("SEMTRANS-LEXICON")), list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS-LEXICON"), list(makeSymbol("SEMTRANS-LEXICON-FROM-TERM-LEXICON"), makeSymbol("SELF"))), list(makeSymbol("SET-ABSTRACT-LEXICON-BASE-MT"), makeSymbol("SEMTRANS-LEXICON"), list(makeSymbol("GET-ABSTRACT-LEXICON-BASE-MT"), makeSymbol("SELF"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("NOTE-DEPENDENT-LEXICON")), makeSymbol("SEMTRANS-LEXICON"))), list(makeSymbol("RET"), makeSymbol("SEMTRANS-LEXICON")));

    public static final SubLSymbol $sym90$OUTER_CATCH_FOR_PSP_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PSP-LEXICON-METHOD");

    public static final SubLSymbol NOTE_DEPENDENT_LEXICON = makeSymbol("NOTE-DEPENDENT-LEXICON");

    public static final SubLSymbol PSP_LEXICON_GET_SEMTRANS_LEXICON_METHOD = makeSymbol("PSP-LEXICON-GET-SEMTRANS-LEXICON-METHOD");

    public static final SubLSymbol GET_SEMTRANS_ENTRIES = makeSymbol("GET-SEMTRANS-ENTRIES");

    public static final SubLList $list94 = list(makeKeyword("PUBLIC"));

    public static final SubLList $list95 = list(makeSymbol("STRING"));

    public static final SubLList $list96 = list(makeString("@return SEMTRANS-LEXICON-P; the semtrans lexicon associated with this lexicon."), list(makeSymbol("CLET"), list(list(makeSymbol("SEMTRANS-LEXICON"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(makeSymbol("QUOTE"), makeSymbol("GET-SEMTRANS-LEXICON"))))), list(makeSymbol("RET"), list(makeSymbol("FIM"), makeSymbol("SEMTRANS-LEXICON"), list(makeSymbol("QUOTE"), makeSymbol("GET")), makeSymbol("STRING")))));

    public static final SubLSymbol $sym97$OUTER_CATCH_FOR_PSP_LEXICON_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PSP-LEXICON-METHOD");

    public static final SubLSymbol PSP_LEXICON_GET_SEMTRANS_ENTRIES_METHOD = makeSymbol("PSP-LEXICON-GET-SEMTRANS-ENTRIES-METHOD");

    public static SubLObject new_psp_lexicon() {
        return object.new_class_instance(PSP_LEXICON);
    }

    public static SubLObject new_psp_lexicon_from_term_lexicon(final SubLObject lexicon) {
        assert NIL != term_lexicon.term_lexicon_p(lexicon) : "term_lexicon.term_lexicon_p(lexicon) " + "CommonSymbols.NIL != term_lexicon.term_lexicon_p(lexicon) " + lexicon;
        final SubLObject v_psp_lexicon = methods.funcall_instance_method_with_1_args(lexicon, COPY, new_psp_lexicon());
        return v_psp_lexicon;
    }

    public static SubLObject get_default_psp_lexicon(SubLObject lexicon_lookup_mt, SubLObject case_sensitivity, SubLObject filter_preds) {
        if (lexicon_lookup_mt == UNPROVIDED) {
            lexicon_lookup_mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        if (filter_preds == UNPROVIDED) {
            filter_preds = default_psp_filter_preds();
        }
        return get_default_psp_lexicon_explicit(lexicon_lookup_mt, case_sensitivity, filter_preds);
    }

    public static SubLObject clear_get_default_psp_lexicon_explicit() {
        final SubLObject cs = $get_default_psp_lexicon_explicit_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_get_default_psp_lexicon_explicit(SubLObject lexicon_lookup_mt, SubLObject case_sensitivity, SubLObject filter_preds) {
        if (lexicon_lookup_mt == UNPROVIDED) {
            lexicon_lookup_mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        if (filter_preds == UNPROVIDED) {
            filter_preds = default_psp_filter_preds();
        }
        return memoization_state.caching_state_remove_function_results_with_args($get_default_psp_lexicon_explicit_caching_state$.getGlobalValue(), list(lexicon_lookup_mt, case_sensitivity, filter_preds), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject get_default_psp_lexicon_explicit_internal(final SubLObject lexicon_lookup_mt, final SubLObject case_sensitivity, final SubLObject filter_preds) {
        final SubLObject lexicon = make_default_psp_lexicon();
        instances.set_slot(lexicon, DEFAULT_BASE_MT, lexicon_lookup_mt);
        methods.funcall_instance_method_with_1_args(lexicon, SET_CASE_SENSITIVITY, case_sensitivity);
        methods.funcall_instance_method_with_1_args(lexicon, INITIALIZE_EXCLUDED_PREDS, filter_preds);
        return lexicon;
    }

    public static SubLObject get_default_psp_lexicon_explicit(SubLObject lexicon_lookup_mt, SubLObject case_sensitivity, SubLObject filter_preds) {
        if (lexicon_lookup_mt == UNPROVIDED) {
            lexicon_lookup_mt = parsing_utilities.psp_lexicon_root_mt(UNPROVIDED);
        }
        if (case_sensitivity == UNPROVIDED) {
            case_sensitivity = lexicon_macros.$nl_trie_accessor_default_case_sensitivity$.getDynamicValue();
        }
        if (filter_preds == UNPROVIDED) {
            filter_preds = default_psp_filter_preds();
        }
        SubLObject caching_state = $get_default_psp_lexicon_explicit_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GET_DEFAULT_PSP_LEXICON_EXPLICIT, $get_default_psp_lexicon_explicit_caching_state$, $int$64, EQUAL, THREE_INTEGER, ZERO_INTEGER);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(lexicon_lookup_mt, case_sensitivity, filter_preds);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (lexicon_lookup_mt.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (case_sensitivity.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && filter_preds.equal(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(get_default_psp_lexicon_explicit_internal(lexicon_lookup_mt, case_sensitivity, filter_preds)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(lexicon_lookup_mt, case_sensitivity, filter_preds));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject default_psp_filter_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject filter_preds = parsing_vars.$psp_pos_pred_filter_preds$.getDynamicValue(thread);
        final SubLObject iterator_var = parsing_utilities.npp_name_preds_to_exclude_iterator();
        SubLObject done_var = NIL;
        final SubLObject token_var = NIL;
        while (NIL == done_var) {
            final SubLObject pred = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
            final SubLObject valid = makeBoolean(!token_var.eql(pred));
            if (NIL != valid) {
                final SubLObject item_var = pred;
                if (NIL == member(item_var, filter_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                    filter_preds = cons(item_var, filter_preds);
                }
            }
            done_var = makeBoolean(NIL == valid);
        } 
        SubLObject cdolist_list_var = $default_psp_lexicon_semantic_filter_preds$.getDynamicValue(thread);
        SubLObject pred2 = NIL;
        pred2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject item_var = pred2;
            if (NIL == member(item_var, filter_preds, symbol_function(EQL), symbol_function(IDENTITY))) {
                filter_preds = cons(item_var, filter_preds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred2 = cdolist_list_var.first();
        } 
        return filter_preds;
    }

    public static SubLObject make_default_psp_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lexicon = new_psp_lexicon();
        methods.funcall_instance_method_with_0_args(lexicon, IGNORE_CACHE);
        methods.funcall_instance_method_with_1_args(lexicon, ALLOW_PREDICATE, $$preferredNameString);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject node_var = $$titleOfWork;
            final SubLObject deck_type = $QUEUE;
            final SubLObject recur_deck = deck.create_deck(deck_type);
            SubLObject node_and_predicate_mode = NIL;
            final SubLObject _prev_bind_0_$1 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
            try {
                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    final SubLObject tv_var = NIL;
                    final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                            if (pcase_var.eql($ERROR)) {
                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else
                                if (pcase_var.eql($CERROR)) {
                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                } else
                                    if (pcase_var.eql($WARN)) {
                                        Errors.warn($str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    } else {
                                        Errors.warn($str26$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror($$$continue_anyway, $str21$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                    }


                        }
                        final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                        final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$genlPreds), thread);
                            if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test($$titleOfWork, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$8 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_vars.get_sbhl_module($$genlPreds)), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var, UNPROVIDED);
                                    for (node_and_predicate_mode = list($$titleOfWork, sbhl_search_vars.genl_inverse_mode_p()); NIL != node_and_predicate_mode; node_and_predicate_mode = deck.deck_pop(recur_deck)) {
                                        final SubLObject node_var_$9 = node_and_predicate_mode.first();
                                        final SubLObject predicate_mode = second(node_and_predicate_mode);
                                        final SubLObject pred = node_var_$9;
                                        final SubLObject _prev_bind_0_$5 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(predicate_mode, thread);
                                            if (NIL != sbhl_search_utilities.apply_sbhl_add_node_test(sbhl_search_vars.get_sbhl_search_add_node_test(), node_var_$9)) {
                                                methods.funcall_instance_method_with_1_args(lexicon, ALLOW_PREDICATE, pred);
                                            }
                                            SubLObject cdolist_list_var;
                                            final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$genlPreds));
                                            SubLObject module_var = NIL;
                                            module_var = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                final SubLObject _prev_bind_0_$6 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                    final SubLObject node = function_terms.naut_to_nart(node_var_$9);
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
                                                                        final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                            SubLObject iteration_state_$14;
                                                                            for (iteration_state_$14 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$14); iteration_state_$14 = dictionary_contents.do_dictionary_contents_next(iteration_state_$14)) {
                                                                                thread.resetMultipleValues();
                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$14);
                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                    final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$8, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$14);
                                                                        } finally {
                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$7, thread);
                                                                        }
                                                                    }
                                                                }
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        } else {
                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str29$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                        }
                                                    } else
                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$16;
                                                            final SubLObject new_list = cdolist_list_var_$16 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            SubLObject generating_fn = NIL;
                                                            generating_fn = cdolist_list_var_$16.first();
                                                            while (NIL != cdolist_list_var_$16) {
                                                                final SubLObject _prev_bind_0_$9 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                            Errors.error($str28$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                        }

                                                                } finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$9, thread);
                                                                }
                                                                cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                                                generating_fn = cdolist_list_var_$16.first();
                                                            } 
                                                        }

                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$6, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                module_var = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_0_$5, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$8, thread);
                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$4, thread);
                                }
                            } else {
                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str30$Node__a_does_not_pass_sbhl_type_t, $$titleOfWork, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                        }
                    } finally {
                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$3, thread);
                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return lexicon;
    }

    public static SubLObject get_psp_lexicon_semtrans_lexicon(final SubLObject v_psp_lexicon) {
        final SubLObject v_class = (v_psp_lexicon.isSymbol()) ? classes.classes_retrieve_class(v_psp_lexicon) : NIL != subloop_structures.class_p(v_psp_lexicon) ? v_psp_lexicon : NIL != subloop_structures.instance_p(v_psp_lexicon) ? subloop_structures.instance_class(v_psp_lexicon) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(SEMTRANS_LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER);
        }
        return NIL;
    }

    public static SubLObject set_psp_lexicon_semtrans_lexicon(final SubLObject v_psp_lexicon, final SubLObject value) {
        final SubLObject v_class = (v_psp_lexicon.isSymbol()) ? classes.classes_retrieve_class(v_psp_lexicon) : NIL != subloop_structures.class_p(v_psp_lexicon) ? v_psp_lexicon : NIL != subloop_structures.instance_p(v_psp_lexicon) ? subloop_structures.instance_class(v_psp_lexicon) : NIL;
        if (NIL != v_class) {
            classes.classes_access_check_class_slot(v_class, slots.slot_assoc(SEMTRANS_LEXICON, subloop_structures.class_compiled_class_slot_access_alist(v_class)));
            return set_aref(subloop_structures.class_any_slots(v_class), FIVE_INTEGER, value);
        }
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_psp_lexicon_class(final SubLObject new_instance) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_MTS, $list38);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_EXCLUDE_PREDICATES, set.set_element_list(lexicon_vars.$semantic_predicates_excluded_from_lexical_lookup$.getDynamicValue(thread)));
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_BASE_MT, $const40$AllGeneralEnglishValidatedLexical);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, DEFAULT_KB_SPEC, $$AbstractLexiconSpecification);
        classes.subloop_initialize_slot(new_instance, PSP_LEXICON, SEMTRANS_LEXICON, NIL);
        return NIL;
    }

    public static SubLObject subloop_reserved_initialize_psp_lexicon_instance(final SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOWED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_MTS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, BASE_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ROOT_MT, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_PREDS, $UNINITIALIZED);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, EXCLUDED_POS_LIST, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, TRIE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CACHE, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym55$IGNORE_CACHE_, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, CASE_SENSITIVITY, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, $sym57$ALLOW_FABRICATION_, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, LEARNED, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ACTIVE_LEARNERS, NIL);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, ALLOW_STEMMING, T);
        classes.subloop_initialize_slot(new_instance, ABSTRACT_LEXICON, STOP_WORDS, NIL);
        classes.subloop_initialize_slot(new_instance, TERM_LEXICON, $sym62$CONVERT_TO_EL_, T);
        classes.subloop_initialize_slot(new_instance, TERM_LEXICON, CONCEPT_FILTER_SPECS, NIL);
        classes.subloop_initialize_slot(new_instance, TERM_LEXICON, DEPENDENT_LEXICONS, NIL);
        return NIL;
    }

    public static SubLObject psp_lexicon_p(final SubLObject v_psp_lexicon) {
        return classes.subloop_instanceof_class(v_psp_lexicon, PSP_LEXICON);
    }

    public static SubLObject psp_lexicon_initialize_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_psp_lexicon_method = NIL;
        SubLObject excluded_pos_list = abstract_lexicon.get_abstract_lexicon_excluded_pos_list(self);
        try {
            thread.throwStack.push($sym69$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
            try {
                term_lexicon.term_lexicon_initialize_method(self);
                excluded_pos_list = NIL;
                sublisp_throw($sym69$OUTER_CATCH_FOR_PSP_LEXICON_METHOD, self);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    abstract_lexicon.set_abstract_lexicon_excluded_pos_list(self, excluded_pos_list);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_psp_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym69$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_psp_lexicon_method;
    }

    public static SubLObject psp_lexicon_exclude_pos_method(final SubLObject self, final SubLObject pos) {
        Errors.error($str74$Can_t_exclude__S_from_a_PSP_lexic, pos);
        return self;
    }

    public static SubLObject psp_lexicon_create_lex_entries_method(final SubLObject self, final SubLObject string, final SubLObject nl_trie_entry) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_psp_lexicon_method = NIL;
        final SubLObject v_semtrans_lexicon = get_psp_lexicon_semtrans_lexicon(self);
        try {
            thread.throwStack.push($sym79$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
            try {
                SubLObject lex_entries = term_lexicon.term_lexicon_create_lex_entries_method(self, string, nl_trie_entry);
                if (NIL != list_utilities.empty_list_p(lex_entries)) {
                    final SubLObject v_semtrans_lexicon_$19 = methods.funcall_instance_method_with_0_args(self, GET_SEMTRANS_LEXICON);
                    final SubLObject semtrans_entries = methods.funcall_instance_method_with_2_args(v_semtrans_lexicon_$19, CREATE_LEX_ENTRIES, string, nl_trie_entry);
                    if (NIL == list_utilities.empty_list_p(semtrans_entries)) {
                        lex_entries = psp_lex_entries_from_semtrans_lex_entries(semtrans_entries);
                    }
                }
                sublisp_throw($sym79$OUTER_CATCH_FOR_PSP_LEXICON_METHOD, lex_entries);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_psp_lexicon_semtrans_lexicon(self, v_semtrans_lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_psp_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym79$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_psp_lexicon_method;
    }

    public static SubLObject psp_lex_entries_from_semtrans_lex_entries(final SubLObject semtrans_entries) {
        SubLObject cdolist_list_var = semtrans_entries;
        SubLObject semtrans_entry = NIL;
        semtrans_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            methods.funcall_instance_method_with_2_args(semtrans_entry, SET, $DENOT, $NO_DENOT);
            final SubLObject trie_entry = methods.funcall_instance_method_with_1_args(semtrans_entry, GET, $TRIE_ENTRY);
            final SubLObject wu = (NIL != nl_trie.nl_trie_word_p(trie_entry, UNPROVIDED)) ? nl_trie.nl_trie_word_word_unit(trie_entry, NIL) : NIL;
            methods.funcall_instance_method_with_2_args(semtrans_entry, SET, $WORD_UNIT, wu);
            cdolist_list_var = cdolist_list_var.rest();
            semtrans_entry = cdolist_list_var.first();
        } 
        return semtrans_entries;
    }

    public static SubLObject psp_lexicon_get_semtrans_lexicon_method(final SubLObject self) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_psp_lexicon_method = NIL;
        SubLObject v_semtrans_lexicon = get_psp_lexicon_semtrans_lexicon(self);
        try {
            thread.throwStack.push($sym90$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
            try {
                if (NIL == semtrans_lexicon.semtrans_lexicon_p(v_semtrans_lexicon)) {
                    v_semtrans_lexicon = semtrans_lexicon.semtrans_lexicon_from_term_lexicon(self);
                    abstract_lexicon.set_abstract_lexicon_base_mt(v_semtrans_lexicon, abstract_lexicon.get_abstract_lexicon_base_mt(self));
                    methods.funcall_instance_method_with_1_args(self, NOTE_DEPENDENT_LEXICON, v_semtrans_lexicon);
                }
                sublisp_throw($sym90$OUTER_CATCH_FOR_PSP_LEXICON_METHOD, v_semtrans_lexicon);
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_psp_lexicon_semtrans_lexicon(self, v_semtrans_lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_psp_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym90$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_psp_lexicon_method;
    }

    public static SubLObject psp_lexicon_get_semtrans_entries_method(final SubLObject self, final SubLObject string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject catch_var_for_psp_lexicon_method = NIL;
        final SubLObject v_semtrans_lexicon = get_psp_lexicon_semtrans_lexicon(self);
        try {
            thread.throwStack.push($sym97$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
            try {
                final SubLObject v_semtrans_lexicon_$20 = methods.funcall_instance_method_with_0_args(self, GET_SEMTRANS_LEXICON);
                sublisp_throw($sym97$OUTER_CATCH_FOR_PSP_LEXICON_METHOD, methods.funcall_instance_method_with_1_args(v_semtrans_lexicon_$20, GET, string));
            } finally {
                final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    set_psp_lexicon_semtrans_lexicon(self, v_semtrans_lexicon);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                }
            }
        } catch (final Throwable ccatch_env_var) {
            catch_var_for_psp_lexicon_method = Errors.handleThrowable(ccatch_env_var, $sym97$OUTER_CATCH_FOR_PSP_LEXICON_METHOD);
        } finally {
            thread.throwStack.pop();
        }
        return catch_var_for_psp_lexicon_method;
    }

    public static SubLObject declare_psp_lexicon_file() {
        declareFunction(me, "new_psp_lexicon", "NEW-PSP-LEXICON", 0, 0, false);
        declareFunction(me, "new_psp_lexicon_from_term_lexicon", "NEW-PSP-LEXICON-FROM-TERM-LEXICON", 1, 0, false);
        declareFunction(me, "get_default_psp_lexicon", "GET-DEFAULT-PSP-LEXICON", 0, 3, false);
        declareFunction(me, "clear_get_default_psp_lexicon_explicit", "CLEAR-GET-DEFAULT-PSP-LEXICON-EXPLICIT", 0, 0, false);
        declareFunction(me, "remove_get_default_psp_lexicon_explicit", "REMOVE-GET-DEFAULT-PSP-LEXICON-EXPLICIT", 0, 3, false);
        declareFunction(me, "get_default_psp_lexicon_explicit_internal", "GET-DEFAULT-PSP-LEXICON-EXPLICIT-INTERNAL", 3, 0, false);
        declareFunction(me, "get_default_psp_lexicon_explicit", "GET-DEFAULT-PSP-LEXICON-EXPLICIT", 0, 3, false);
        declareFunction(me, "default_psp_filter_preds", "DEFAULT-PSP-FILTER-PREDS", 0, 0, false);
        declareFunction(me, "make_default_psp_lexicon", "MAKE-DEFAULT-PSP-LEXICON", 0, 0, false);
        declareFunction(me, "get_psp_lexicon_semtrans_lexicon", "GET-PSP-LEXICON-SEMTRANS-LEXICON", 1, 0, false);
        declareFunction(me, "set_psp_lexicon_semtrans_lexicon", "SET-PSP-LEXICON-SEMTRANS-LEXICON", 2, 0, false);
        declareFunction(me, "subloop_reserved_initialize_psp_lexicon_class", "SUBLOOP-RESERVED-INITIALIZE-PSP-LEXICON-CLASS", 1, 0, false);
        declareFunction(me, "subloop_reserved_initialize_psp_lexicon_instance", "SUBLOOP-RESERVED-INITIALIZE-PSP-LEXICON-INSTANCE", 1, 0, false);
        declareFunction(me, "psp_lexicon_p", "PSP-LEXICON-P", 1, 0, false);
        declareFunction(me, "psp_lexicon_initialize_method", "PSP-LEXICON-INITIALIZE-METHOD", 1, 0, false);
        declareFunction(me, "psp_lexicon_exclude_pos_method", "PSP-LEXICON-EXCLUDE-POS-METHOD", 2, 0, false);
        declareFunction(me, "psp_lexicon_create_lex_entries_method", "PSP-LEXICON-CREATE-LEX-ENTRIES-METHOD", 3, 0, false);
        declareFunction(me, "psp_lex_entries_from_semtrans_lex_entries", "PSP-LEX-ENTRIES-FROM-SEMTRANS-LEX-ENTRIES", 1, 0, false);
        declareFunction(me, "psp_lexicon_get_semtrans_lexicon_method", "PSP-LEXICON-GET-SEMTRANS-LEXICON-METHOD", 1, 0, false);
        declareFunction(me, "psp_lexicon_get_semtrans_entries_method", "PSP-LEXICON-GET-SEMTRANS-ENTRIES-METHOD", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_psp_lexicon_file() {
        deflexical("*GET-DEFAULT-PSP-LEXICON-EXPLICIT-CACHING-STATE*", NIL);
        defparameter("*DEFAULT-PSP-LEXICON-SEMANTIC-FILTER-PREDS*", $list9);
        return NIL;
    }

    public static SubLObject setup_psp_lexicon_file() {
        memoization_state.note_globally_cached_function(GET_DEFAULT_PSP_LEXICON_EXPLICIT);
        classes.subloop_new_class(PSP_LEXICON, TERM_LEXICON, NIL, NIL, $list32);
        classes.class_set_implements_slot_listeners(PSP_LEXICON, NIL);
        classes.subloop_note_class_initialization_function(PSP_LEXICON, SUBLOOP_RESERVED_INITIALIZE_PSP_LEXICON_CLASS);
        classes.subloop_note_instance_initialization_function(PSP_LEXICON, SUBLOOP_RESERVED_INITIALIZE_PSP_LEXICON_INSTANCE);
        subloop_reserved_initialize_psp_lexicon_class(PSP_LEXICON);
        methods.methods_incorporate_instance_method(INITIALIZE, PSP_LEXICON, $list67, NIL, $list68);
        methods.subloop_register_instance_method(PSP_LEXICON, INITIALIZE, PSP_LEXICON_INITIALIZE_METHOD);
        methods.methods_incorporate_instance_method(EXCLUDE_POS, PSP_LEXICON, $list67, $list72, $list73);
        methods.subloop_register_instance_method(PSP_LEXICON, EXCLUDE_POS, PSP_LEXICON_EXCLUDE_POS_METHOD);
        methods.methods_incorporate_instance_method(CREATE_LEX_ENTRIES, PSP_LEXICON, $list67, $list77, $list78);
        methods.subloop_register_instance_method(PSP_LEXICON, CREATE_LEX_ENTRIES, PSP_LEXICON_CREATE_LEX_ENTRIES_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMTRANS_LEXICON, PSP_LEXICON, $list88, NIL, $list89);
        methods.subloop_register_instance_method(PSP_LEXICON, GET_SEMTRANS_LEXICON, PSP_LEXICON_GET_SEMTRANS_LEXICON_METHOD);
        methods.methods_incorporate_instance_method(GET_SEMTRANS_ENTRIES, PSP_LEXICON, $list94, $list95, $list96);
        methods.subloop_register_instance_method(PSP_LEXICON, GET_SEMTRANS_ENTRIES, PSP_LEXICON_GET_SEMTRANS_ENTRIES_METHOD);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_psp_lexicon_file();
    }

    @Override
    public void initializeVariables() {
        init_psp_lexicon_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_psp_lexicon_file();
    }

    static {






































































































    }
}

/**
 * Total time: 458 ms
 */
