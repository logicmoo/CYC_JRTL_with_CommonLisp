/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$partial_semanticsP$;
import static com.cyc.cycjava.cycl.set_utilities.construct_set_from_list;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_interface_variable;
import static com.cyc.cycjava.cycl.utilities_macros.register_html_state_variable;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.inference.harness.hl_prototypes;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LEXICON-VARS
 * source file: /cyc/top/cycl/lexicon-vars.lisp
 * created:     2019/07/03 17:37:51
 */
public final class lexicon_vars extends SubLTranslatedFile implements V12 {
    /**
     *
     *
     * @return LISTP; of all pragmatic filters (on or off)
     */
    @LispMethod(comment = "@return LISTP; of all pragmatic filters (on or off)")
    public static final SubLObject pragmatic_filters() {
        return $list_alt3;
    }

    public static final SubLObject pragmatic_filter_activeP(SubLObject filter) {
        return list_utilities.sublisp_boolean(eval(filter));
    }

    /**
     *
     *
     * @return BOOLEAN; Are any pragmatic filters currently active?
     */
    @LispMethod(comment = "@return BOOLEAN; Are any pragmatic filters currently active?")
    public static final SubLObject active_pragmatic_filtersP() {
        return list_utilities.sublisp_boolean(com.cyc.cycjava.cycl.lexicon_vars.active_pragmatic_filters());
    }

    /**
     *
     *
     * @return LISTP; of currently active pragmatic filters
     */
    @LispMethod(comment = "@return LISTP; of currently active pragmatic filters")
    public static final SubLObject active_pragmatic_filters() {
        return list_utilities.remove_if_not($sym4$PRAGMATIC_FILTER_ACTIVE_, com.cyc.cycjava.cycl.lexicon_vars.pragmatic_filters(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final class $pragmatic_filter_activeP$UnaryFunction extends UnaryFunction {
        public $pragmatic_filter_activeP$UnaryFunction() {
            super(extractFunctionNamed("PRAGMATIC-FILTER-ACTIVE?"));
        }

        public SubLObject processItem(SubLObject arg1) {
            return pragmatic_filter_activeP(arg1);
        }
    }

    public static final SubLFile me = new lexicon_vars();



    // defparameter
    @LispMethod(comment = "The list of phrase-structure rules used by the parser. Set in psg-rules.lisp.\ndefparameter")
    public static final SubLSymbol $psg_rules$ = makeSymbol("*PSG-RULES*");

    // defparameter
    @LispMethod(comment = "Print out progress information while building lexical hash tables?\ndefparameter")
    public static final SubLSymbol $print_while_building_hashP$ = makeSymbol("*PRINT-WHILE-BUILDING-HASH?*");

    // defparameter
    // Which mts are accessible for lexical lookup?
    /**
     * Which mts are accessible for lexical lookup?
     */
    @LispMethod(comment = "Which mts are accessible for lexical lookup?\ndefparameter")
    public static final SubLSymbol $nl_understanding_mts$ = makeSymbol("*NL-UNDERSTANDING-MTS*");

    // defparameter
    // Which mts are accessible for NL generation?
    /**
     * Which mts are accessible for NL generation?
     */
    @LispMethod(comment = "Which mts are accessible for NL generation?\ndefparameter")
    public static final SubLSymbol $nl_generation_mts$ = makeSymbol("*NL-GENERATION-MTS*");

    // defparameter
    // The purpose to which RELEVANT-NL-MTS are relevant.
    /**
     * The purpose to which RELEVANT-NL-MTS are relevant.
     */
    @LispMethod(comment = "The purpose to which RELEVANT-NL-MTS are relevant.\ndefparameter")
    public static final SubLSymbol $nl_relevance_purpose$ = makeSymbol("*NL-RELEVANCE-PURPOSE*");

    // defparameter
    // Are common misspellings included in lexical lookup?
    /**
     * Are common misspellings included in lexical lookup?
     */
    @LispMethod(comment = "Are common misspellings included in lexical lookup?\ndefparameter")
    public static final SubLSymbol $misspellingsP$ = makeSymbol("*MISSPELLINGS?*");

    // defparameter
    // Do we incorporate morphological parsing into lexical lookup?
    /**
     * Do we incorporate morphological parsing into lexical lookup?
     */
    @LispMethod(comment = "Do we incorporate morphological parsing into lexical lookup?\ndefparameter")
    public static final SubLSymbol $parse_morphologically$ = makeSymbol("*PARSE-MORPHOLOGICALLY*");

    // deflexical
    /**
     * The options for when to incorporate morphological parsing into lexical
     * lookup. :AS-FALLBACK means 'only if normal lexical lookup yields no results'.
     */
    @LispMethod(comment = "The options for when to incorporate morphological parsing into lexical\r\nlookup. :AS-FALLBACK means \'only if normal lexical lookup yields no results\'.\ndeflexical\nThe options for when to incorporate morphological parsing into lexical\nlookup. :AS-FALLBACK means \'only if normal lexical lookup yields no results\'.")
    private static final SubLSymbol $parse_morphologically_options$ = makeSymbol("*PARSE-MORPHOLOGICALLY-OPTIONS*");

    // defparameter
    // Are vulgar denotations, etc. excluded during lexical lookup?
    /**
     * Are vulgar denotations, etc. excluded during lexical lookup?
     */
    @LispMethod(comment = "Are vulgar denotations, etc. excluded during lexical lookup?\ndefparameter")
    public static final SubLSymbol $exclude_vulgaritiesP$ = makeSymbol("*EXCLUDE-VULGARITIES?*");

    // defparameter
    // Are slang denotations, etc. excluded during lexical lookup?
    /**
     * Are slang denotations, etc. excluded during lexical lookup?
     */
    @LispMethod(comment = "Are slang denotations, etc. excluded during lexical lookup?\ndefparameter")
    public static final SubLSymbol $exclude_slangP$ = makeSymbol("*EXCLUDE-SLANG?*");

    // defparameter
    // Are archaic denotations, etc. excluded during lexical lookup?
    /**
     * Are archaic denotations, etc. excluded during lexical lookup?
     */
    @LispMethod(comment = "Are archaic denotations, etc. excluded during lexical lookup?\ndefparameter")
    public static final SubLSymbol $exclude_archaic_speechP$ = makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $exclude_indirect_relationsP$ = makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*");

    // defparameter
    /**
     * Prefer interpreting a multi-word sequence as a multi-word phrase instead of
     * as individual words?
     */
    @LispMethod(comment = "Prefer interpreting a multi-word sequence as a multi-word phrase instead of\r\nas individual words?\ndefparameter\nPrefer interpreting a multi-word sequence as a multi-word phrase instead of\nas individual words?")
    public static final SubLSymbol $greedy_nlwe_interpretations$ = makeSymbol("*GREEDY-NLWE-INTERPRETATIONS*");

    // defparameter
    // Parts of speech to favor.
    /**
     * Parts of speech to favor.
     */
    @LispMethod(comment = "Parts of speech to favor.\ndefparameter")
    public static final SubLSymbol $favored_pos$ = makeSymbol("*FAVORED-POS*");

    // defparameter
    // Upper limit on the number of words in a multi-word sequence.
    /**
     * Upper limit on the number of words in a multi-word sequence.
     */
    @LispMethod(comment = "Upper limit on the number of words in a multi-word sequence.\ndefparameter")
    public static final SubLSymbol $max_mww_word_length$ = makeSymbol("*MAX-MWW-WORD-LENGTH*");

    // defparameter
    // In building nlwes, use information from #$acronymString?
    /**
     * In building nlwes, use information from #$acronymString?
     */
    @LispMethod(comment = "In building nlwes, use information from #$acronymString?\ndefparameter")
    public static final SubLSymbol $use_acronymsP$ = makeSymbol("*USE-ACRONYMS?*");

    // defparameter
    // In building nlwes, use information from #$abbreviationString-PN?
    /**
     * In building nlwes, use information from #$abbreviationString-PN?
     */
    @LispMethod(comment = "In building nlwes, use information from #$abbreviationString-PN?\ndefparameter")
    public static final SubLSymbol $use_abbreviationsP$ = makeSymbol("*USE-ABBREVIATIONS?*");

    // defparameter
    /**
     * Should we include lexical abbreviations for words when generating strings?
     */
    @LispMethod(comment = "Should we include lexical abbreviations for words when generating strings?\ndefparameter")
    public static final SubLSymbol $use_lexical_abbreviationsP$ = makeSymbol("*USE-LEXICAL-ABBREVIATIONS?*");

    // defparameter
    // If T then NL trie control variables are initialized.
    /**
     * If T then NL trie control variables are initialized.
     */
    @LispMethod(comment = "If T then NL trie control variables are initialized.\ndefparameter")
    public static final SubLSymbol $initialize_nl_trie_control_varsP$ = makeSymbol("*INITIALIZE-NL-TRIE-CONTROL-VARS?*");

    // defparameter
    // Associating WordNet part-of-speech keywords with Cyc constants
    /**
     * Associating WordNet part-of-speech keywords with Cyc constants
     */
    @LispMethod(comment = "Associating WordNet part-of-speech keywords with Cyc constants\ndefparameter")
    public static final SubLSymbol $wn_pos_cyc_pos_map$ = makeSymbol("*WN-POS-CYC-POS-MAP*");

    // deflexical
    // Set to all instances of #$MultiWordForConstantPred.
    /**
     * Set to all instances of #$MultiWordForConstantPred.
     */
    @LispMethod(comment = "Set to all instances of #$MultiWordForConstantPred.\ndeflexical")
    private static final SubLSymbol $multi_word_preds$ = makeSymbol("*MULTI-WORD-PREDS*");

    // defparameter
    /**
     * When performing lexical lookup using functions that don't return the lexical
     * predicates for downstream filtering, skip mappings using these predicates.
     */
    @LispMethod(comment = "When performing lexical lookup using functions that don\'t return the lexical\r\npredicates for downstream filtering, skip mappings using these predicates.\ndefparameter\nWhen performing lexical lookup using functions that don\'t return the lexical\npredicates for downstream filtering, skip mappings using these predicates.")
    public static final SubLSymbol $semantic_predicates_excluded_from_lexical_lookup$ = makeSymbol("*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $head_position_pred_cachedP_caching_state$ = makeSymbol("*HEAD-POSITION-PRED-CACHED?-CACHING-STATE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $noun_predicates$ = makeSymbol("*NOUN-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $pn_predicates$ = makeSymbol("*PN-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $pn_mass_predicates$ = makeSymbol("*PN-MASS-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $pn_count_predicates$ = makeSymbol("*PN-COUNT-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $agentive_preds$ = makeSymbol("*AGENTIVE-PREDS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $mass_predicates$ = makeSymbol("*MASS-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $verb_predicates$ = makeSymbol("*VERB-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $adjective_predicates$ = makeSymbol("*ADJECTIVE-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $adverb_predicates$ = makeSymbol("*ADVERB-PREDICATES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $all_lexicon_string_predicates$ = makeSymbol("*ALL-LEXICON-STRING-PREDICATES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $all_lexicon_predicates$ = makeSymbol("*ALL-LEXICON-PREDICATES*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $top_level_nl_pred$ = makeSymbol("*TOP-LEVEL-NL-PRED*");

    // deflexical
    /**
     * Ordered list of speech part predicates that can serve to define root word
     * forms
     */
    @LispMethod(comment = "Ordered list of speech part predicates that can serve to define root word\r\nforms\ndeflexical\nOrdered list of speech part predicates that can serve to define root word\nforms")
    public static final SubLSymbol $root_form_speech_parts$ = makeSymbol("*ROOT-FORM-SPEECH-PARTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $lexicon_global_noop_done_values$ = makeSymbol("*LEXICON-GLOBAL-NOOP-DONE-VALUES*");

    // defparameter
    // Should results of morphological analysis be put through the Reformulator?
    /**
     * Should results of morphological analysis be put through the Reformulator?
     */
    @LispMethod(comment = "Should results of morphological analysis be put through the Reformulator?\ndefparameter")
    public static final SubLSymbol $mwp_reformulate_resultsP$ = makeSymbol("*MWP-REFORMULATE-RESULTS?*");

    // defparameter
    // Should results of morphological analysis be put in the trie?
    /**
     * Should results of morphological analysis be put in the trie?
     */
    @LispMethod(comment = "Should results of morphological analysis be put in the trie?\ndefparameter")
    public static final SubLSymbol $mwp_triefy_resultsP$ = makeSymbol("*MWP-TRIEFY-RESULTS?*");

    // defparameter
    /**
     * Gating parameter for parsers to control whether or not to use the
     * Morphological Word Parser.
     */
    @LispMethod(comment = "Gating parameter for parsers to control whether or not to use the\r\nMorphological Word Parser.\ndefparameter\nGating parameter for parsers to control whether or not to use the\nMorphological Word Parser.")
    public static final SubLSymbol $use_mwpP$ = makeSymbol("*USE-MWP?*");

    // defparameter
    /**
     * Should we make up base words if we can't find any with the right spelling or
     * semantics?
     */
    @LispMethod(comment = "Should we make up base words if we can\'t find any with the right spelling or\r\nsemantics?\ndefparameter\nShould we make up base words if we can\'t find any with the right spelling or\nsemantics?")
    public static final SubLSymbol $mwp_make_up_basesP$ = makeSymbol("*MWP-MAKE-UP-BASES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $mwp_semantic_check_mt$ = makeSymbol("*MWP-SEMANTIC-CHECK-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $mwp_syntactic_check_mt$ = makeSymbol("*MWP-SYNTACTIC-CHECK-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $mwp_rule_lookup_mt$ = makeSymbol("*MWP-RULE-LOOKUP-MT*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $mwp_wff_filter_level$ = makeSymbol("*MWP-WFF-FILTER-LEVEL*");

    // defparameter
    // Should we refrain from looking for morphologically complex bases?
    /**
     * Should we refrain from looking for morphologically complex bases?
     */
    @LispMethod(comment = "Should we refrain from looking for morphologically complex bases?\ndefparameter")
    public static final SubLSymbol $mwp_suppress_recursive_analysisP$ = makeSymbol("*MWP-SUPPRESS-RECURSIVE-ANALYSIS?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $nl_affix_types$ = makeSymbol("*NL-AFFIX-TYPES*");

    static private final SubLList $list2 = list(makeKeyword("ALWAYS"), $ONLY, makeKeyword("AS-FALLBACK"), makeKeyword("NEVER"));

    static private final SubLList $list3 = list(makeSymbol("*EXCLUDE-VULGARITIES?*"), makeSymbol("*EXCLUDE-SLANG?*"), makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*"), makeSymbol("*EXCLUDE-INDIRECT-RELATIONS?*"));

    private static final SubLSymbol $sym4$LEXICON_FILTER_ACTIVE_ = makeSymbol("LEXICON-FILTER-ACTIVE?");



    public static final SubLSymbol $lexicon_lookup_mt$ = makeSymbol("*LEXICON-LOOKUP-MT*");

    static private final SubLList $list7 = list(cons($NOUN, reader_make_constant_shell("CountNoun")), cons($NOUN, reader_make_constant_shell("AgentiveNoun")), cons($NOUN, reader_make_constant_shell("ProperCountNoun")), cons($NOUN, reader_make_constant_shell("ProperMassNoun")), cons($NOUN, reader_make_constant_shell("MassNoun")), cons($VERB, reader_make_constant_shell("Verb")), cons(makeKeyword("ADJECTIVE"), reader_make_constant_shell("Adjective")), cons(makeKeyword("ADVERB"), reader_make_constant_shell("Adverb")));

    static private final SubLList $list9 = list(reader_make_constant_shell("EnglishMt"), reader_make_constant_shell("BaseKB"));

    private static final SubLSymbol $sym10$_EXIT = makeSymbol("%EXIT");

    /**
     * a set-p containing all instances of #$SemTransPred
     */
    // deflexical
    @LispMethod(comment = "a set-p containing all instances of #$SemTransPred\ndeflexical")
    public static final SubLSymbol $semtrans_preds$ = makeSymbol("*SEMTRANS-PREDS*");







    static private final SubLList $list16 = list(new SubLObject[]{ reader_make_constant_shell("termStrings"), reader_make_constant_shell("termStrings-GuessedFromName"), reader_make_constant_shell("denotationPlaceholder"), reader_make_constant_shell("givenNames"), reader_make_constant_shell("middleName"), reader_make_constant_shell("familyName"), reader_make_constant_shell("firstName"), reader_make_constant_shell("lastName"), reader_make_constant_shell("middleNameInitial"), reader_make_constant_shell("initialsString"), reader_make_constant_shell("denotationRelatedTo"), reader_make_constant_shell("stockTickerSymbol"), reader_make_constant_shell("epistleAddresseeText"), reader_make_constant_shell("gospelName-Short"), reader_make_constant_shell("nicknames"), reader_make_constant_shell("atomicSymbol"), reader_make_constant_shell("titleOfWork"), reader_make_constant_shell("sectionTitle"), reader_make_constant_shell("referenceWorkEntryTitle"), reader_make_constant_shell("executableProgramName"), reader_make_constant_shell("countryCodeDigraph"), reader_make_constant_shell("internetCountryCode"), reader_make_constant_shell("folderTitle"), reader_make_constant_shell("ksTermString"), reader_make_constant_shell("rdfs:label"), reader_make_constant_shell("programStrings") });

    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $abbreviation_predicates$ = makeSymbol("*ABBREVIATION-PREDICATES*");

    static private final SubLList $list18 = list(reader_make_constant_shell("abbreviationString-PN"), reader_make_constant_shell("abbreviationForLexicalWord"), reader_make_constant_shell("abbreviationForMultiWordString"), reader_make_constant_shell("abbreviationForCompoundString"));

    @LispMethod(comment = "defparameter")
    // defparameter
    private static final SubLSymbol $acronym_predicates$ = makeSymbol("*ACRONYM-PREDICATES*");



    @LispMethod(comment = "Set to all spec-preds of #$properNameStrings\ndeflexical")
    private static final SubLSymbol $proper_name_predicates_from_kb$ = makeSymbol("*PROPER-NAME-PREDICATES-FROM-KB*");



    private static final SubLObject $$ProperNamePredicate_General = reader_make_constant_shell("ProperNamePredicate-General");

    @LispMethod(comment = "deflexical")
    // deflexical
    private static final SubLSymbol $term_strings_preds$ = makeSymbol("*TERM-STRINGS-PREDS*");



    private static final SubLObject $const26$HeadMedialMultiWordForConstantPre = reader_make_constant_shell("HeadMedialMultiWordForConstantPred");

    private static final SubLObject $const27$HeadInitialMultiWordForConstantPr = reader_make_constant_shell("HeadInitialMultiWordForConstantPred");



    private static final SubLSymbol $sym29$HEAD_POSITION_PRED_CACHED_ = makeSymbol("HEAD-POSITION-PRED-CACHED?");

    private static final SubLSymbol $sym30$_HEAD_POSITION_PRED_CACHED__CACHING_STATE_ = makeSymbol("*HEAD-POSITION-PRED-CACHED?-CACHING-STATE*");

    private static final SubLSymbol VERB_FRAMES = makeSymbol("VERB-FRAMES");



    private static final SubLSymbol $verb_frames_caching_state$ = makeSymbol("*VERB-FRAMES-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    static private final SubLList $list36 = list(reader_make_constant_shell("singular"), reader_make_constant_shell("plural"));

    static private final SubLList $list37 = list(reader_make_constant_shell("pnSingular"), reader_make_constant_shell("pnPlural"), reader_make_constant_shell("pnMassNumber"));

    static private final SubLList $list38 = list(reader_make_constant_shell("pnMassNumber"));

    static private final SubLList $list39 = list(reader_make_constant_shell("pnSingular"), reader_make_constant_shell("pnPlural"));

    static private final SubLList $list40 = list(reader_make_constant_shell("agentive-Sg"), reader_make_constant_shell("agentive-Pl"));

    static private final SubLList $list41 = list(reader_make_constant_shell("massNumber"), reader_make_constant_shell("agentive-Mass"));

    static private final SubLList $list42 = list(new SubLObject[]{ reader_make_constant_shell("infinitive"), reader_make_constant_shell("pastTense-Universal"), reader_make_constant_shell("presentParticiple"), reader_make_constant_shell("perfect"), reader_make_constant_shell("thirdPersonSg-Past"), reader_make_constant_shell("secondPersonSg-Past"), reader_make_constant_shell("firstPersonSg-Past"), reader_make_constant_shell("pluralVerb-Past"), reader_make_constant_shell("thirdPersonSg-Present"), reader_make_constant_shell("firstPersonSg-Present"), reader_make_constant_shell("secondPersonSg-Present") });

    private static final SubLList $list43 = list(reader_make_constant_shell("regularDegree"), reader_make_constant_shell("comparativeDegree"), reader_make_constant_shell("superlativeDegree"));

    static private final SubLList $list44 = list(reader_make_constant_shell("regularAdverb"), reader_make_constant_shell("comparativeAdverb"), reader_make_constant_shell("superlativeAdverb"));

    private static final SubLSymbol $sym46$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    static private final SubLList $list47 = list(new SubLObject[]{ reader_make_constant_shell("properNameStrings"), reader_make_constant_shell("massNumber"), reader_make_constant_shell("plural"), reader_make_constant_shell("singular"), reader_make_constant_shell("pnMassNumber"), reader_make_constant_shell("pnPlural"), reader_make_constant_shell("pnSingular"), reader_make_constant_shell("gerund"), reader_make_constant_shell("presentParticiple"), reader_make_constant_shell("infinitive"), reader_make_constant_shell("secondPersonSg-Present"), reader_make_constant_shell("firstPersonSg-Present"), reader_make_constant_shell("thirdPersonSg-Present"), reader_make_constant_shell("perfect"), makeSymbol("PASTTENSE-UNIVERSAL"), reader_make_constant_shell("thirdPersonSg-Past"), reader_make_constant_shell("secondPersonSg-Past"), reader_make_constant_shell("firstPersonSg-Past"), reader_make_constant_shell("pluralVerb-Past"), reader_make_constant_shell("agentive-Mass"), reader_make_constant_shell("agentive-Pl"), reader_make_constant_shell("agentive-Sg"), reader_make_constant_shell("regularAdverb"), reader_make_constant_shell("comparativeAdverb"), reader_make_constant_shell("superlativeAdverb"), reader_make_constant_shell("regularDegree"), reader_make_constant_shell("comparativeDegree"), reader_make_constant_shell("superlativeDegree"), reader_make_constant_shell("pnNonPlural-Generic"), reader_make_constant_shell("nonSingular-Generic"), reader_make_constant_shell("nonPlural-Generic"), reader_make_constant_shell("massNumber-Generic"), reader_make_constant_shell("plural-Generic"), reader_make_constant_shell("singular-Generic"), reader_make_constant_shell("singular-Feminine"), reader_make_constant_shell("singular-Masculine"), reader_make_constant_shell("plural-Feminine"), reader_make_constant_shell("plural-Masculine"), reader_make_constant_shell("singular-Neuter"), reader_make_constant_shell("plural-Neuter"), reader_make_constant_shell("nonThirdSg-Present"), reader_make_constant_shell("perfective-Generic"), reader_make_constant_shell("wordStrings") });

    private static final SubLList $list48 = list(reader_make_constant_shell("partOfSpeech"), reader_make_constant_shell("subcatFrame"));



    private static final SubLList $list50 = list(new SubLObject[]{ reader_make_constant_shell("infinitive"), reader_make_constant_shell("singular"), reader_make_constant_shell("massNumber"), reader_make_constant_shell("regularDegree"), reader_make_constant_shell("nonGradableAdjectiveForm"), reader_make_constant_shell("regularAdverb"), reader_make_constant_shell("pnMassNumber"), reader_make_constant_shell("pnSingular"), reader_make_constant_shell("agentive-Sg"), reader_make_constant_shell("agentive-Mass"), reader_make_constant_shell("gerund") });

    public static final SubLSymbol $lexicon_cache_code_revision$ = makeSymbol("*LEXICON-CACHE-CODE-REVISION*");

    public static final SubLSymbol $morphology_code_revision$ = makeSymbol("*MORPHOLOGY-CODE-REVISION*");

    public static final SubLSymbol $nl_trie_code_revision$ = makeSymbol("*NL-TRIE-CODE-REVISION*");

    private static final SubLSymbol $noop_updates_for_lexicon_globals$ = makeSymbol("*NOOP-UPDATES-FOR-LEXICON-GLOBALS*");

    private static final SubLString $str55$Lexicon_global_noop_updates_must_ = makeString("Lexicon global noop-updates must be lists of two strings, which ~S isn't.");

    static private final SubLList $list56 = list(makeSymbol("EARLIER"), makeSymbol("LATER"));

    private static final SubLSymbol $sym57$SUPERSTRING_ = makeSymbol("SUPERSTRING?");



    private static final SubLList $list59 = list(makeKeyword("DERIV"), $INFL);

    private static final SubLString $$$GeneralEnglishMt = makeString("GeneralEnglishMt");

    public static final SubLSymbol $default_lexification_mt$ = makeSymbol("*DEFAULT-LEXIFICATION-MT*");

    public static final SubLSymbol $default_syntactic_mt$ = makeSymbol("*DEFAULT-SYNTACTIC-MT*");

    private static final SubLString $$$EnglishParaphraseMt = makeString("EnglishParaphraseMt");

    public static final SubLSymbol $default_relational_lexification_mt$ = makeSymbol("*DEFAULT-RELATIONAL-LEXIFICATION-MT*");

    private static final SubLString $$$EnglishTemplateMt = makeString("EnglishTemplateMt");

    public static final SubLSymbol $default_lexification_template_mt$ = makeSymbol("*DEFAULT-LEXIFICATION-TEMPLATE-MT*");

    private static final SubLString $$$RelationParaphraseMt = makeString("RelationParaphraseMt");

    public static final SubLSymbol $default_predicate_lexification_mt$ = makeSymbol("*DEFAULT-PREDICATE-LEXIFICATION-MT*");

    public static final SubLSymbol $use_sme_lexwiz$ = makeSymbol("*USE-SME-LEXWIZ*");

    public static final SubLObject parse_morphologically_option_p_alt(SubLObject v_object) {
        return member(v_object, $parse_morphologically_options$.getGlobalValue(), symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject parse_morphologically_option_p(final SubLObject v_object) {
        return member(v_object, $parse_morphologically_options$.getGlobalValue(), symbol_function(EQL), UNPROVIDED);
    }

    public static SubLObject active_lexicon_filtersP() {
        return list_utilities.sublisp_boolean(active_lexicon_filters());
    }

    public static SubLObject lexicon_filters() {
        return $list3;
    }

    public static SubLObject active_lexicon_filters() {
        return list_utilities.remove_if_not($sym4$LEXICON_FILTER_ACTIVE_, lexicon_filters(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject lexicon_filter_activeP(final SubLObject filter) {
        return list_utilities.sublisp_boolean(eval(filter));
    }

    public static final SubLObject lexicon_lookup_mt_info_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return mt_relevance_macros.mt_to_mt_info($lexicon_lookup_mt$.getDynamicValue(thread));
        }
    }

    public static SubLObject lexicon_lookup_mt_info() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return mt_relevance_macros.mt_to_mt_info($lexicon_lookup_mt$.getDynamicValue(thread));
    }

    /**
     * Set parameters based on which application is currently running.
     */
    @LispMethod(comment = "Set parameters based on which application is currently running.")
    public static final SubLObject set_app_alt(SubLObject app) {
        if (app == $IMAGE_DEMO) {
            $greedy_nlwe_interpretations$.setDynamicValue(T);
            $use_acronymsP$.setDynamicValue(NIL);
            $use_abbreviationsP$.setDynamicValue(NIL);
            $partial_semanticsP$.setDynamicValue(T);
            $nl_understanding_mts$.setDynamicValue($list_alt9);
        }
        return NIL;
    }

    /**
     * Set parameters based on which application is currently running.
     */
    @LispMethod(comment = "Set parameters based on which application is currently running.")
    public static SubLObject set_app(final SubLObject app) {
        if (app == $IMAGE_DEMO) {
            $greedy_nlwe_interpretations$.setDynamicValue(T);
            $use_acronymsP$.setDynamicValue(NIL);
            $use_abbreviationsP$.setDynamicValue(NIL);
            $partial_semanticsP$.setDynamicValue(T);
            $nl_understanding_mts$.setDynamicValue($list9);
        }
        return NIL;
    }

    public static final SubLObject clear_cached_lexical_vars_alt() {
        $multi_word_preds$.setGlobalValue(NIL);
        $proper_name_predicates_from_kb$.setGlobalValue(NIL);
        $term_strings_preds$.setGlobalValue(NIL);
        $all_lexicon_string_predicates$.setGlobalValue($UNINITIALIZED);
        $all_lexicon_predicates$.setGlobalValue(NIL);
        $semtrans_preds$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject clear_cached_lexical_vars() {
        final SubLObject mw_pred_globalValue = $multi_word_preds$.getGlobalValue();
        clear_lex_pred_set(mw_pred_globalValue);
        final SubLObject globalValue = $proper_name_predicates_from_kb$.getGlobalValue();
        clear_lex_pred_set(globalValue);
        clear_lex_pred_set($term_strings_preds$.getGlobalValue());
        $all_lexicon_string_predicates$.setGlobalValue(misc_utilities.uninitialized());
        $all_lexicon_predicates$.setGlobalValue(NIL);
        clear_lex_pred_set($semtrans_preds$.getGlobalValue());
        return NIL;
    }

    public static SubLObject lex_pred_set_p(final SubLObject v_object) {
        return locking_map.locking_map_p(v_object);
    }

    public static SubLObject lex_pred_set_uninitializedP(final SubLObject v_set) {
        final SubLObject rw_lock_var = locking_map.locking_map_lock(v_set);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_read_lock(rw_lock_var);
            return makeBoolean(map_utilities.map_size(v_set).eql(ONE_INTEGER) && (NIL != map_utilities.map_has_keyP(v_set, misc_utilities.uninitialized())));
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_read_lock(rw_lock_var);
            }
        }
    }

    public static SubLObject clear_lex_pred_set(final SubLObject v_set) {
        final SubLObject rw_lock_var = locking_map.locking_map_lock(v_set);
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            map_utilities.map_remove_all(v_set);
            map_utilities.map_put(v_set, misc_utilities.uninitialized(), T);
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return v_set;
    }

    public static SubLObject new_lex_pred_set() {
        return locking_map.create_locking_map(set_utilities.new_singleton_set(misc_utilities.uninitialized(), symbol_function(EQL)));
    }

    public static SubLObject lex_pred_set_memberP(final SubLObject pred, final SubLObject v_set) {
        return map_utilities.map_has_keyP(v_set, pred);
    }

    public static SubLObject lex_pred_set_element_list(final SubLObject v_set) {
        return map_utilities.map_keys(v_set);
    }

    public static final SubLObject initialize_semtrans_preds_alt() {
        $semtrans_preds$.setGlobalValue(set.new_set(UNPROVIDED, UNPROVIDED));
        {
            SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts($$SemTransPred);
            SubLObject pred = NIL;
            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                set.set_add(pred, $semtrans_preds$.getGlobalValue());
            }
        }
        return $semtrans_preds$.getGlobalValue();
    }

    public static SubLObject initialize_semtrans_preds() {
        final SubLObject rw_lock_var = locking_map.locking_map_lock($semtrans_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            map_utilities.map_remove_all($semtrans_preds$.getGlobalValue());
            SubLObject cdolist_list_var = isa.all_fort_instances_in_all_mts($$SemTransPred);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                map_utilities.map_put($semtrans_preds$.getGlobalValue(), pred, T);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return $semtrans_preds$.getGlobalValue();
    }

    public static final SubLObject semtrans_predP_alt(SubLObject v_term) {
        if (NIL == set.set_p($semtrans_preds$.getGlobalValue())) {
            com.cyc.cycjava.cycl.lexicon_vars.initialize_semtrans_preds();
        }
        return set.set_memberP(v_term, $semtrans_preds$.getGlobalValue());
    }

    public static SubLObject semtrans_predP(final SubLObject v_term) {
        final SubLObject rw_lock_var = locking_map.locking_map_lock($semtrans_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (NIL != lex_pred_set_uninitializedP($semtrans_preds$.getGlobalValue())) {
                initialize_semtrans_preds();
            }
            return lex_pred_set_memberP(v_term, $semtrans_preds$.getGlobalValue());
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }

    public static final SubLObject multi_word_preds_alt() {
        if (NIL == $multi_word_preds$.getGlobalValue()) {
            com.cyc.cycjava.cycl.lexicon_vars.initialize_multi_word_preds();
        }
        return $multi_word_preds$.getGlobalValue();
    }

    public static SubLObject multi_word_preds() {
        final SubLObject rw_lock_var = locking_map.locking_map_lock($multi_word_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (NIL != lex_pred_set_uninitializedP($multi_word_preds$.getGlobalValue())) {
                initialize_multi_word_preds();
            }
            return lex_pred_set_element_list($multi_word_preds$.getGlobalValue());
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }

    /**
     * return in reverse order, where oldest preds come first, and are therefore checked first
     */
    @LispMethod(comment = "return in reverse order, where oldest preds come first, and are therefore checked first")
    public static final SubLObject initialize_multi_word_preds_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.lexicon_vars.clear_head_position_pred_cachedP();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != valid_constantP($$MultiWordForConstantPred, UNPROVIDED)) {
                        $multi_word_preds$.setGlobalValue(remove_if($sym15$HL_PROTOTYPICAL_INSTANCE_, nreverse(isa.all_fort_instances($$MultiWordForConstantPred, UNPROVIDED, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return $multi_word_preds$.getGlobalValue();
        }
    }

    /**
     * return in reverse order, where oldest preds come first, and are therefore checked first
     */
    @LispMethod(comment = "return in reverse order, where oldest preds come first, and are therefore checked first")
    public static SubLObject initialize_multi_word_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rw_lock_var = locking_map.locking_map_lock($multi_word_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            clear_head_position_pred_cachedP();
            map_utilities.map_remove_all($multi_word_preds$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (NIL != valid_constantP($$MultiWordForConstantPred, UNPROVIDED)) {
                    SubLObject cdolist_list_var = isa.all_fort_instances($$MultiWordForConstantPred, UNPROVIDED, UNPROVIDED);
                    SubLObject pred = NIL;
                    pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL == hl_prototypes.hl_prototypical_instanceP(pred)) {
                            map_utilities.map_put($multi_word_preds$.getGlobalValue(), pred, T);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return $multi_word_preds$.getGlobalValue();
    }

    public static final SubLObject abbreviation_predicates_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($abbreviation_predicates$.getDynamicValue(thread) == $UNSET) {
                $abbreviation_predicates$.setDynamicValue(NIL, thread);
                {
                    SubLObject cdolist_list_var = $list_alt18;
                    SubLObject abbrev_pred = NIL;
                    for (abbrev_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , abbrev_pred = cdolist_list_var.first()) {
                        $abbreviation_predicates$.setDynamicValue(nconc($abbreviation_predicates$.getDynamicValue(thread), genl_predicates.all_spec_preds(abbrev_pred, UNPROVIDED, UNPROVIDED)), thread);
                    }
                }
            }
            return $abbreviation_predicates$.getDynamicValue(thread);
        }
    }

    public static SubLObject abbreviation_predicates() {
        final SubLObject rw_lock_var = locking_map.locking_map_lock($abbreviation_predicates$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (NIL != lex_pred_set_uninitializedP($abbreviation_predicates$.getGlobalValue())) {
                map_utilities.map_remove_all($abbreviation_predicates$.getGlobalValue());
                SubLObject cdolist_list_var = $list18;
                SubLObject abbrev_pred = NIL;
                abbrev_pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    SubLObject cdolist_list_var_$1 = genl_predicates.all_spec_preds(abbrev_pred, UNPROVIDED, UNPROVIDED);
                    SubLObject pred = NIL;
                    pred = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        map_utilities.map_put($abbreviation_predicates$.getGlobalValue(), pred, T);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        pred = cdolist_list_var_$1.first();
                    } 
                    cdolist_list_var = cdolist_list_var.rest();
                    abbrev_pred = cdolist_list_var.first();
                } 
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return lex_pred_set_element_list($abbreviation_predicates$.getGlobalValue());
    }

    public static final SubLObject acronym_predicates_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ($acronym_predicates$.getDynamicValue(thread) == $UNSET) {
                $acronym_predicates$.setDynamicValue(genl_predicates.all_spec_preds($$acronymString, UNPROVIDED, UNPROVIDED), thread);
            }
            return $acronym_predicates$.getDynamicValue(thread);
        }
    }

    public static SubLObject acronym_predicates() {
        final SubLObject rw_lock_var = locking_map.locking_map_lock($acronym_predicates$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (NIL != lex_pred_set_uninitializedP($acronym_predicates$.getGlobalValue())) {
                SubLObject cdolist_list_var = genl_predicates.all_spec_preds($$acronymString, UNPROVIDED, UNPROVIDED);
                SubLObject pred = NIL;
                pred = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    map_utilities.map_put($acronym_predicates$.getGlobalValue(), pred, T);
                    cdolist_list_var = cdolist_list_var.rest();
                    pred = cdolist_list_var.first();
                } 
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return lex_pred_set_element_list($acronym_predicates$.getGlobalValue());
    }

    /**
     *
     *
     * @return LISTP; of name-string predicates
     */
    @LispMethod(comment = "@return LISTP; of name-string predicates")
    public static final SubLObject name_string_preds_alt(SubLObject force_reinitializationP) {
        if (force_reinitializationP == UNPROVIDED) {
            force_reinitializationP = NIL;
        }
        return set.set_element_list(com.cyc.cycjava.cycl.lexicon_vars.name_string_preds_set(force_reinitializationP));
    }

    /**
     *
     *
     * @return LISTP; of name-string predicates
     */
    @LispMethod(comment = "@return LISTP; of name-string predicates")
    public static SubLObject name_string_preds(SubLObject force_reinitializationP) {
        if (force_reinitializationP == UNPROVIDED) {
            force_reinitializationP = NIL;
        }
        return lex_pred_set_element_list(name_string_preds_set(force_reinitializationP));
    }

    /**
     *
     *
     * @return SET-P; of name-string predicates
     */
    @LispMethod(comment = "@return SET-P; of name-string predicates")
    public static final SubLObject name_string_preds_set_alt(SubLObject force_reinitializationP) {
        if (force_reinitializationP == UNPROVIDED) {
            force_reinitializationP = NIL;
        }
        if ((NIL == set.set_p($proper_name_predicates_from_kb$.getGlobalValue())) || (NIL != force_reinitializationP)) {
            com.cyc.cycjava.cycl.lexicon_vars.initialize_proper_name_preds();
        }
        return $proper_name_predicates_from_kb$.getGlobalValue();
    }

    /**
     *
     *
     * @return SET-P; of name-string predicates
     */
    @LispMethod(comment = "@return SET-P; of name-string predicates")
    public static SubLObject name_string_preds_set(SubLObject force_reinitializationP) {
        if (force_reinitializationP == UNPROVIDED) {
            force_reinitializationP = NIL;
        }
        final SubLObject rw_lock_var = locking_map.locking_map_lock($proper_name_predicates_from_kb$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if ((NIL != lex_pred_set_uninitializedP($proper_name_predicates_from_kb$.getGlobalValue())) || (NIL != force_reinitializationP)) {
                initialize_proper_name_preds();
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return $proper_name_predicates_from_kb$.getGlobalValue();
    }

    public static final SubLObject initialize_proper_name_preds_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $proper_name_predicates_from_kb$.setGlobalValue(set.new_set(EQ, UNPROVIDED));
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != valid_constantP($$properNameStrings, UNPROVIDED)) {
                        {
                            SubLObject cdolist_list_var = genl_predicates.all_spec_predicates($$properNameStrings, UNPROVIDED, UNPROVIDED);
                            SubLObject spec_pred = NIL;
                            for (spec_pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , spec_pred = cdolist_list_var.first()) {
                                set.set_add(spec_pred, $proper_name_predicates_from_kb$.getGlobalValue());
                            }
                        }
                    }
                    if (NIL != valid_constantP($$ProperNamePredicate_General, UNPROVIDED)) {
                        {
                            SubLObject cdolist_list_var = isa.all_fort_instances($$ProperNamePredicate_General, UNPROVIDED, UNPROVIDED);
                            SubLObject pred = NIL;
                            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                set.set_add(pred, $proper_name_predicates_from_kb$.getGlobalValue());
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return $proper_name_predicates_from_kb$.getGlobalValue();
        }
    }

    public static SubLObject initialize_proper_name_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rw_lock_var = locking_map.locking_map_lock($proper_name_predicates_from_kb$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            map_utilities.map_remove_all($proper_name_predicates_from_kb$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (NIL != valid_constantP($$properNameStrings, UNPROVIDED)) {
                    SubLObject cdolist_list_var = genl_predicates.all_spec_predicates($$properNameStrings, UNPROVIDED, UNPROVIDED);
                    SubLObject spec_pred = NIL;
                    spec_pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        map_utilities.map_put($proper_name_predicates_from_kb$.getGlobalValue(), spec_pred, T);
                        cdolist_list_var = cdolist_list_var.rest();
                        spec_pred = cdolist_list_var.first();
                    } 
                }
                if (NIL != valid_constantP($$ProperNamePredicate_General, UNPROVIDED)) {
                    SubLObject cdolist_list_var = isa.all_fort_instances($$ProperNamePredicate_General, UNPROVIDED, UNPROVIDED);
                    SubLObject pred = NIL;
                    pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        map_utilities.map_put($proper_name_predicates_from_kb$.getGlobalValue(), pred, T);
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return $proper_name_predicates_from_kb$.getGlobalValue();
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a namestring predicate?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a namestring predicate?")
    public static final SubLObject name_string_predP_alt(SubLObject obj) {
        if (NIL == set.set_p($proper_name_predicates_from_kb$.getGlobalValue())) {
            com.cyc.cycjava.cycl.lexicon_vars.initialize_proper_name_preds();
        }
        return set.set_memberP(obj, $proper_name_predicates_from_kb$.getGlobalValue());
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a namestring predicate?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a namestring predicate?")
    public static SubLObject name_string_predP(final SubLObject obj) {
        final SubLObject rw_lock_var = locking_map.locking_map_lock($proper_name_predicates_from_kb$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (NIL != lex_pred_set_uninitializedP($proper_name_predicates_from_kb$.getGlobalValue())) {
                initialize_proper_name_preds();
            }
            return lex_pred_set_memberP(obj, $proper_name_predicates_from_kb$.getGlobalValue());
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }

    /**
     *
     *
     * @return LISTP; of term-strings predicates
     */
    @LispMethod(comment = "@return LISTP; of term-strings predicates")
    public static final SubLObject term_strings_preds_alt(SubLObject force_reinitializationP) {
        if (force_reinitializationP == UNPROVIDED) {
            force_reinitializationP = NIL;
        }
        return set.set_element_list(com.cyc.cycjava.cycl.lexicon_vars.term_strings_preds_set(force_reinitializationP));
    }

    /**
     *
     *
     * @return LISTP; of term-strings predicates
     */
    @LispMethod(comment = "@return LISTP; of term-strings predicates")
    public static SubLObject term_strings_preds(SubLObject force_reinitializationP) {
        if (force_reinitializationP == UNPROVIDED) {
            force_reinitializationP = NIL;
        }
        return lex_pred_set_element_list(term_strings_preds_set(force_reinitializationP));
    }

    /**
     *
     *
     * @return SET-P; of term-strings predicates
     */
    @LispMethod(comment = "@return SET-P; of term-strings predicates")
    public static final SubLObject term_strings_preds_set_alt(SubLObject force_reinitializationP) {
        if (force_reinitializationP == UNPROVIDED) {
            force_reinitializationP = NIL;
        }
        if ((NIL == set.set_p($term_strings_preds$.getGlobalValue())) || (NIL != force_reinitializationP)) {
            com.cyc.cycjava.cycl.lexicon_vars.initialize_term_strings_preds();
        }
        return $term_strings_preds$.getGlobalValue();
    }

    /**
     *
     *
     * @return SET-P; of term-strings predicates
     */
    @LispMethod(comment = "@return SET-P; of term-strings predicates")
    public static SubLObject term_strings_preds_set(SubLObject force_reinitializationP) {
        if (force_reinitializationP == UNPROVIDED) {
            force_reinitializationP = NIL;
        }
        final SubLObject rw_lock_var = locking_map.locking_map_lock($term_strings_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if ((NIL != lex_pred_set_uninitializedP($term_strings_preds$.getGlobalValue())) || (NIL != force_reinitializationP)) {
                initialize_term_strings_preds();
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return $term_strings_preds$.getGlobalValue();
    }

    public static final SubLObject initialize_term_strings_preds_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            com.cyc.cycjava.cycl.lexicon_vars.initialize_proper_name_preds();
            $term_strings_preds$.setGlobalValue(set.new_set(EQ, UNPROVIDED));
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    if (NIL != valid_constantP($$termStrings, UNPROVIDED)) {
                        {
                            SubLObject cdolist_list_var = genl_predicates.all_spec_preds($$termStrings, UNPROVIDED, UNPROVIDED);
                            SubLObject pred = NIL;
                            for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                                if (NIL == com.cyc.cycjava.cycl.lexicon_vars.name_string_predP(pred)) {
                                    set.set_add(pred, $term_strings_preds$.getGlobalValue());
                                }
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return $term_strings_preds$.getGlobalValue();
        }
    }

    public static SubLObject initialize_term_strings_preds() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        initialize_proper_name_preds();
        final SubLObject rw_lock_var = locking_map.locking_map_lock($term_strings_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            map_utilities.map_remove_all($term_strings_preds$.getGlobalValue());
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                if (NIL != valid_constantP($$termStrings, UNPROVIDED)) {
                    SubLObject cdolist_list_var = genl_predicates.all_spec_preds($$termStrings, UNPROVIDED, UNPROVIDED);
                    SubLObject pred = NIL;
                    pred = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL == name_string_predP(pred)) {
                            map_utilities.map_put($term_strings_preds$.getGlobalValue(), pred, T);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        pred = cdolist_list_var.first();
                    } 
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
        return $term_strings_preds$.getGlobalValue();
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a #$termStrings-style predicate?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a #$termStrings-style predicate?")
    public static final SubLObject term_strings_predP_alt(SubLObject obj) {
        if (NIL == set.set_p($term_strings_preds$.getGlobalValue())) {
            com.cyc.cycjava.cycl.lexicon_vars.initialize_term_strings_preds();
        }
        return set.set_memberP(obj, $term_strings_preds$.getGlobalValue());
    }

    /**
     *
     *
     * @return BOOLEAN; Is OBJ a #$termStrings-style predicate?
     */
    @LispMethod(comment = "@return BOOLEAN; Is OBJ a #$termStrings-style predicate?")
    public static SubLObject term_strings_predP(final SubLObject obj) {
        final SubLObject rw_lock_var = locking_map.locking_map_lock($term_strings_preds$.getGlobalValue());
        SubLObject needs_to_releaseP = NIL;
        try {
            needs_to_releaseP = ReadWriteLocks.rw_lock_seize_write_lock(rw_lock_var);
            if (NIL != lex_pred_set_uninitializedP($term_strings_preds$.getGlobalValue())) {
                initialize_term_strings_preds();
            }
            return lex_pred_set_memberP(obj, $term_strings_preds$.getGlobalValue());
        } finally {
            if (NIL != needs_to_releaseP) {
                ReadWriteLocks.rw_lock_release_write_lock(rw_lock_var);
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; returns T iff OBJ is a namestring or a
    #$termStrings-style predicate
     */
    @LispMethod(comment = "@return BOOLEAN; returns T iff OBJ is a namestring or a\r\n#$termStrings-style predicate")
    public static final SubLObject name_or_term_strings_predP_alt(SubLObject obj) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.lexicon_vars.name_string_predP(obj)) || (NIL != com.cyc.cycjava.cycl.lexicon_vars.term_strings_predP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; returns T iff OBJ is a namestring or a
    #$termStrings-style predicate
     */
    @LispMethod(comment = "@return BOOLEAN; returns T iff OBJ is a namestring or a\r\n#$termStrings-style predicate")
    public static SubLObject name_or_term_strings_predP(final SubLObject obj) {
        return makeBoolean((NIL != name_string_predP(obj)) || (NIL != term_strings_predP(obj)));
    }

    /**
     *
     *
     * @return BOOLEAN; returns T iff OBJ is a namestring, termstring or speech-part predicate
     */
    @LispMethod(comment = "@return BOOLEAN; returns T iff OBJ is a namestring, termstring or speech-part predicate")
    public static final SubLObject nl_agr_predP_alt(SubLObject obj) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.lexicon_vars.name_or_term_strings_predP(obj)) || (NIL != lexicon_accessors.speech_part_predP(obj, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEAN; returns T iff OBJ is a namestring, termstring or speech-part predicate
     */
    @LispMethod(comment = "@return BOOLEAN; returns T iff OBJ is a namestring, termstring or speech-part predicate")
    public static SubLObject nl_agr_predP(final SubLObject obj) {
        return makeBoolean((NIL != name_or_term_strings_predP(obj)) || (NIL != lexicon_accessors.speech_part_predP(obj, UNPROVIDED)));
    }

    /**
     *
     *
     * @param PRED:
     * 		a cyc predicate
     * @return BOOLEAN: is the predicate a #$HeadMedialMultiWordForConstantPred?
     */
    @LispMethod(comment = "@param PRED:\r\n\t\ta cyc predicate\r\n@return BOOLEAN: is the predicate a #$HeadMedialMultiWordForConstantPred?")
    public static final SubLObject head_medial_predP_alt(SubLObject pred) {
        return com.cyc.cycjava.cycl.lexicon_vars.head_position_pred_cachedP(pred, $const23$HeadMedialMultiWordForConstantPre);
    }

    /**
     *
     *
     * @param PRED:
     * 		a cyc predicate
     * @return BOOLEAN: is the predicate a #$HeadMedialMultiWordForConstantPred?
     */
    @LispMethod(comment = "@param PRED:\r\n\t\ta cyc predicate\r\n@return BOOLEAN: is the predicate a #$HeadMedialMultiWordForConstantPred?")
    public static SubLObject head_medial_predP(final SubLObject pred) {
        return head_position_pred_cachedP(pred, $const26$HeadMedialMultiWordForConstantPre);
    }

    /**
     *
     *
     * @param PRED:
     * 		a cyc predicate
     * @return BOOLEAN: is the predicate a #$HeadInitialMultiWordForConstantPred?
     */
    @LispMethod(comment = "@param PRED:\r\n\t\ta cyc predicate\r\n@return BOOLEAN: is the predicate a #$HeadInitialMultiWordForConstantPred?")
    public static final SubLObject head_initial_predP_alt(SubLObject pred) {
        return com.cyc.cycjava.cycl.lexicon_vars.head_position_pred_cachedP(pred, $const24$HeadInitialMultiWordForConstantPr);
    }

    /**
     *
     *
     * @param PRED:
     * 		a cyc predicate
     * @return BOOLEAN: is the predicate a #$HeadInitialMultiWordForConstantPred?
     */
    @LispMethod(comment = "@param PRED:\r\n\t\ta cyc predicate\r\n@return BOOLEAN: is the predicate a #$HeadInitialMultiWordForConstantPred?")
    public static SubLObject head_initial_predP(final SubLObject pred) {
        return head_position_pred_cachedP(pred, $const27$HeadInitialMultiWordForConstantPr);
    }

    /**
     *
     *
     * @param PRED:
     * 		a cyc predicate
     * @return BOOLEAN: is the predicate a #$HeadInitialMultiWordForConstantPred?
     */
    @LispMethod(comment = "@param PRED:\r\n\t\ta cyc predicate\r\n@return BOOLEAN: is the predicate a #$HeadInitialMultiWordForConstantPred?")
    public static final SubLObject head_final_predP_alt(SubLObject pred) {
        return com.cyc.cycjava.cycl.lexicon_vars.head_position_pred_cachedP(pred, $$HeadFinalMultiWordForConstantPred);
    }

    /**
     *
     *
     * @param PRED:
     * 		a cyc predicate
     * @return BOOLEAN: is the predicate a #$HeadInitialMultiWordForConstantPred?
     */
    @LispMethod(comment = "@param PRED:\r\n\t\ta cyc predicate\r\n@return BOOLEAN: is the predicate a #$HeadInitialMultiWordForConstantPred?")
    public static SubLObject head_final_predP(final SubLObject pred) {
        return head_position_pred_cachedP(pred, $$HeadFinalMultiWordForConstantPred);
    }

    public static final SubLObject clear_head_position_pred_cachedP_alt() {
        {
            SubLObject cs = $head_position_pred_cachedP_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_head_position_pred_cachedP() {
        final SubLObject cs = $head_position_pred_cachedP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_head_position_pred_cachedP_alt(SubLObject pred, SubLObject type) {
        return memoization_state.caching_state_remove_function_results_with_args($head_position_pred_cachedP_caching_state$.getGlobalValue(), list(pred, type), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_head_position_pred_cachedP(final SubLObject pred, final SubLObject type) {
        return memoization_state.caching_state_remove_function_results_with_args($head_position_pred_cachedP_caching_state$.getGlobalValue(), list(pred, type), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject head_position_pred_cachedP_internal_alt(SubLObject pred, SubLObject type) {
        return makeBoolean(((NIL != valid_constantP(pred, UNPROVIDED)) && (NIL != valid_constantP(type, UNPROVIDED))) && (NIL != isa.isa_in_any_mtP(pred, type)));
    }

    public static SubLObject head_position_pred_cachedP_internal(final SubLObject pred, final SubLObject type) {
        return makeBoolean(((NIL != valid_constantP(pred, UNPROVIDED)) && (NIL != valid_constantP(type, UNPROVIDED))) && (NIL != isa.isa_in_any_mtP(pred, type)));
    }

    public static final SubLObject head_position_pred_cachedP_alt(SubLObject pred, SubLObject type) {
        {
            SubLObject caching_state = $head_position_pred_cachedP_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name($sym26$HEAD_POSITION_PRED_CACHED_, $sym27$_HEAD_POSITION_PRED_CACHED__CACHING_STATE_, NIL, EQL, TWO_INTEGER, $int$256);
            }
            {
                SubLObject sxhash = memoization_state.sxhash_calc_2(pred, type);
                SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
                if (collisions != $kw29$_MEMOIZED_ITEM_NOT_FOUND_) {
                    {
                        SubLObject cdolist_list_var = collisions;
                        SubLObject collision = NIL;
                        for (collision = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , collision = cdolist_list_var.first()) {
                            {
                                SubLObject cached_args = collision.first();
                                SubLObject results2 = second(collision);
                                if (pred.eql(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && type.eql(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                {
                    SubLObject results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.lexicon_vars.head_position_pred_cachedP_internal(pred, type)));
                    memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results, list(pred, type));
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject head_position_pred_cachedP(final SubLObject pred, final SubLObject type) {
        SubLObject caching_state = $head_position_pred_cachedP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym29$HEAD_POSITION_PRED_CACHED_, $sym30$_HEAD_POSITION_PRED_CACHED__CACHING_STATE_, NIL, EQL, TWO_INTEGER, $int$256);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, type);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && type.eql(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(head_position_pred_cachedP_internal(pred, type)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, type));
        return memoization_state.caching_results(results3);
    }

    public static final SubLObject clear_verb_frames_alt() {
        {
            SubLObject cs = $verb_frames_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_verb_frames() {
        final SubLObject cs = $verb_frames_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_verb_frames_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($verb_frames_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_verb_frames(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $lexicon_lookup_mt$.getDynamicValue();
        }
        return memoization_state.caching_state_remove_function_results_with_args($verb_frames_caching_state$.getGlobalValue(), list(mt), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return LISTP; of subcategorization frames used for verbs.
     */
    @LispMethod(comment = "@return LISTP; of subcategorization frames used for verbs.")
    public static final SubLObject verb_frames_internal_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        ans = kb_mapping_utilities.pred_refs($$verbSemTrans, THREE_INTEGER, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return LISTP; of subcategorization frames used for verbs.
     */
    @LispMethod(comment = "@return LISTP; of subcategorization frames used for verbs.")
    public static SubLObject verb_frames_internal(final SubLObject mt) {
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
            ans = kb_mapping_utilities.pred_refs($$verbSemTrans, THREE_INTEGER, UNPROVIDED);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject verb_frames_alt(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $lexicon_lookup_mt$.getDynamicValue();
        }
        {
            SubLObject caching_state = $verb_frames_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(VERB_FRAMES, $verb_frames_caching_state$, $int$128, EQUAL, ONE_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, $kw29$_MEMOIZED_ITEM_NOT_FOUND_);
                if (results == $kw29$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.lexicon_vars.verb_frames_internal(mt)));
                    memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject verb_frames(SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $lexicon_lookup_mt$.getDynamicValue();
        }
        SubLObject caching_state = $verb_frames_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(VERB_FRAMES, $verb_frames_caching_state$, $int$128, EQUAL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(verb_frames_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject all_lexicon_string_predicates_alt() {
        if ($UNINITIALIZED == $all_lexicon_string_predicates$.getGlobalValue()) {
            com.cyc.cycjava.cycl.lexicon_vars.initialize_all_lexicon_string_predicates();
        }
        return $all_lexicon_string_predicates$.getGlobalValue();
    }

    public static SubLObject all_lexicon_string_predicates() {
        if ($UNINITIALIZED == $all_lexicon_string_predicates$.getGlobalValue()) {
            initialize_all_lexicon_string_predicates();
        }
        return $all_lexicon_string_predicates$.getGlobalValue();
    }

    public static final SubLObject initialize_all_lexicon_string_predicates_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    $all_lexicon_string_predicates$.setGlobalValue(list_utilities.remove_if_not($sym43$VALID_CONSTANT_, $list_alt44, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    $all_lexicon_string_predicates$.setGlobalValue(append($all_lexicon_string_predicates$.getGlobalValue(), set_difference(lexicon_accessors.all_speech_part_preds(UNPROVIDED), $all_lexicon_string_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return com.cyc.cycjava.cycl.lexicon_vars.all_lexicon_string_predicates();
        }
    }

    public static SubLObject initialize_all_lexicon_string_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            $all_lexicon_string_predicates$.setGlobalValue(list_utilities.remove_if_not($sym46$VALID_CONSTANT_, $list47, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            $all_lexicon_string_predicates$.setGlobalValue(append($all_lexicon_string_predicates$.getGlobalValue(), set_difference(lexicon_accessors.all_speech_part_preds(UNPROVIDED), $all_lexicon_string_predicates$.getGlobalValue(), UNPROVIDED, UNPROVIDED)));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return all_lexicon_string_predicates();
    }

    public static final SubLObject all_lexicon_predicates_alt() {
        if (NIL == $all_lexicon_predicates$.getGlobalValue()) {
            com.cyc.cycjava.cycl.lexicon_vars.initialize_all_lexicon_predicates();
        }
        return $all_lexicon_predicates$.getGlobalValue();
    }

    public static SubLObject all_lexicon_predicates() {
        if (NIL == $all_lexicon_predicates$.getGlobalValue()) {
            initialize_all_lexicon_predicates();
        }
        return $all_lexicon_predicates$.getGlobalValue();
    }

    public static final SubLObject initialize_all_lexicon_predicates_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    $all_lexicon_predicates$.setGlobalValue(append(list_utilities.remove_if_not($sym43$VALID_CONSTANT_, $list_alt45, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), com.cyc.cycjava.cycl.lexicon_vars.all_lexicon_string_predicates()));
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return $all_lexicon_predicates$.getGlobalValue();
        }
    }

    public static SubLObject initialize_all_lexicon_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            $all_lexicon_predicates$.setGlobalValue(append(list_utilities.remove_if_not($sym46$VALID_CONSTANT_, $list48, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), all_lexicon_string_predicates()));
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return $all_lexicon_predicates$.getGlobalValue();
    }

    /**
     *
     *
     * @unknown baxter
    Note: The order of the items on this list does matter,
    so don't just replace this with (all-fort-instances #$SpeechPartPredicate).
     */
    @LispMethod(comment = "@unknown baxter\r\nNote: The order of the items on this list does matter,\r\nso don\'t just replace this with (all-fort-instances #$SpeechPartPredicate).")
    public static final SubLObject initialize_all_speech_part_preds_alt() {
        com.cyc.cycjava.cycl.lexicon_vars.initialize_all_lexicon_string_predicates();
        com.cyc.cycjava.cycl.lexicon_vars.initialize_all_lexicon_predicates();
        return $all_lexicon_string_predicates$.getGlobalValue();
    }

    /**
     *
     *
     * @unknown baxter
    Note: The order of the items on this list does matter,
    so don't just replace this with (all-fort-instances #$SpeechPartPredicate).
     */
    @LispMethod(comment = "@unknown baxter\r\nNote: The order of the items on this list does matter,\r\nso don\'t just replace this with (all-fort-instances #$SpeechPartPredicate).")
    public static SubLObject initialize_all_speech_part_preds() {
        initialize_all_lexicon_string_predicates();
        initialize_all_lexicon_predicates();
        return $all_lexicon_string_predicates$.getGlobalValue();
    }

    /**
     *
     *
     * @param GLOBAL
     * 		symbolp; a lexicon global defined above.
     * @param NOOP-UPDATES
     * 		listp; of (<early-revision-substring> <later-revision-substring>)
     * 		such that updating of GLOBAL from a string containing EARLY-REVISION-SUBSTRING to
     * 		one containing LATER-REVISION-SUBSTRING should not be considered a substantive change
     * 		to the associated code.
     */
    @LispMethod(comment = "@param GLOBAL\r\n\t\tsymbolp; a lexicon global defined above.\r\n@param NOOP-UPDATES\r\n\t\tlistp; of (<early-revision-substring> <later-revision-substring>)\r\n\t\tsuch that updating of GLOBAL from a string containing EARLY-REVISION-SUBSTRING to\r\n\t\tone containing LATER-REVISION-SUBSTRING should not be considered a substantive change\r\n\t\tto the associated code.")
    public static final SubLObject declare_noop_updates_for_lexicon_global_alt(SubLObject global, SubLObject noop_updates) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject cdolist_list_var = noop_updates;
                SubLObject pair = NIL;
                for (pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pair = cdolist_list_var.first()) {
                    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                        if (!((NIL != list_utilities.doubletonP(pair)) && (NIL != string_utilities.list_of_string_p(pair)))) {
                            Errors.error($str_alt52$Lexicon_global_noop_updates_must_, pair);
                        }
                    }
                    {
                        SubLObject datum = pair;
                        SubLObject current = datum;
                        SubLObject earlier = NIL;
                        SubLObject later = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt53);
                        earlier = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt53);
                        later = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            {
                                SubLObject global_alist = list_utilities.alist_lookup($noop_updates_for_lexicon_globals$.getGlobalValue(), global, UNPROVIDED, UNPROVIDED);
                                global_alist = list_utilities.alist_push(global_alist, earlier, later, symbol_function(EQUAL));
                                $noop_updates_for_lexicon_globals$.setGlobalValue(list_utilities.alist_enter($noop_updates_for_lexicon_globals$.getGlobalValue(), global, global_alist, UNPROVIDED));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt53);
                        }
                    }
                }
            }
            return $noop_updates_for_lexicon_globals$.getGlobalValue();
        }
    }

    /**
     *
     *
     * @param GLOBAL
     * 		symbolp; a lexicon global defined above.
     * @param NOOP-UPDATES
     * 		listp; of (<early-revision-substring> <later-revision-substring>)
     * 		such that updating of GLOBAL from a string containing EARLY-REVISION-SUBSTRING to
     * 		one containing LATER-REVISION-SUBSTRING should not be considered a substantive change
     * 		to the associated code.
     */
    @LispMethod(comment = "@param GLOBAL\r\n\t\tsymbolp; a lexicon global defined above.\r\n@param NOOP-UPDATES\r\n\t\tlistp; of (<early-revision-substring> <later-revision-substring>)\r\n\t\tsuch that updating of GLOBAL from a string containing EARLY-REVISION-SUBSTRING to\r\n\t\tone containing LATER-REVISION-SUBSTRING should not be considered a substantive change\r\n\t\tto the associated code.")
    public static SubLObject declare_noop_updates_for_lexicon_global(final SubLObject global, final SubLObject noop_updates) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = noop_updates;
        SubLObject pair = NIL;
        pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((NIL == list_utilities.doubletonP(pair)) || (NIL == string_utilities.list_of_string_p(pair)))) {
                Errors.error($str55$Lexicon_global_noop_updates_must_, pair);
            }
            SubLObject current;
            final SubLObject datum = current = pair;
            SubLObject earlier = NIL;
            SubLObject later = NIL;
            destructuring_bind_must_consp(current, datum, $list56);
            earlier = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list56);
            later = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject global_alist = list_utilities.alist_lookup($noop_updates_for_lexicon_globals$.getGlobalValue(), global, UNPROVIDED, UNPROVIDED);
                global_alist = list_utilities.alist_push(global_alist, earlier, later, symbol_function(EQUAL));
                $noop_updates_for_lexicon_globals$.setGlobalValue(list_utilities.alist_enter($noop_updates_for_lexicon_globals$.getGlobalValue(), global, global_alist, UNPROVIDED));
            } else {
                cdestructuring_bind_error(datum, $list56);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pair = cdolist_list_var.first();
        } 
        return $noop_updates_for_lexicon_globals$.getGlobalValue();
    }

    static private final SubLList $list_alt2 = list(makeKeyword("ALWAYS"), $ONLY, makeKeyword("AS-FALLBACK"), makeKeyword("NEVER"));

    static private final SubLList $list_alt3 = list(makeSymbol("*EXCLUDE-VULGARITIES?*"), makeSymbol("*EXCLUDE-SLANG?*"), makeSymbol("*EXCLUDE-ARCHAIC-SPEECH?*"));

    static private final SubLSymbol $sym4$PRAGMATIC_FILTER_ACTIVE_ = makeSymbol("PRAGMATIC-FILTER-ACTIVE?");

    static private final SubLList $list_alt7 = list(cons($NOUN, reader_make_constant_shell("CountNoun")), cons($NOUN, reader_make_constant_shell("AgentiveNoun")), cons($NOUN, reader_make_constant_shell("ProperCountNoun")), cons($NOUN, reader_make_constant_shell("ProperMassNoun")), cons($NOUN, reader_make_constant_shell("MassNoun")), cons($VERB, reader_make_constant_shell("Verb")), cons(makeKeyword("ADJECTIVE"), reader_make_constant_shell("Adjective")), cons(makeKeyword("ADVERB"), reader_make_constant_shell("Adverb")));

    static private final SubLList $list_alt9 = list(reader_make_constant_shell("EnglishMt"), reader_make_constant_shell("BaseKB"));

    /**
     *
     *
     * @return BOOLEAN; Should a revision change for GLOBAL from RECORDED-VALUE to CURRENT-VALUE
    be considered a noop?
     */
    @LispMethod(comment = "@return BOOLEAN; Should a revision change for GLOBAL from RECORDED-VALUE to CURRENT-VALUE\r\nbe considered a noop?")
    public static final SubLObject lexicon_global_revision_noop_p_alt(SubLObject global, SubLObject recorded_value, SubLObject current_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = $lexicon_global_noop_done_values$.currentBinding(thread);
                    try {
                        $lexicon_global_noop_done_values$.bind(NIL, thread);
                        ans = com.cyc.cycjava.cycl.lexicon_vars.lexicon_global_revision_noop_p_int(global, recorded_value, current_value);
                    } finally {
                        $lexicon_global_noop_done_values$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    /**
     *
     *
     * @return BOOLEAN; Should a revision change for GLOBAL from RECORDED-VALUE to CURRENT-VALUE
    be considered a noop?
     */
    @LispMethod(comment = "@return BOOLEAN; Should a revision change for GLOBAL from RECORDED-VALUE to CURRENT-VALUE\r\nbe considered a noop?")
    public static SubLObject lexicon_global_revision_noop_p(final SubLObject global, final SubLObject recorded_value, final SubLObject current_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $lexicon_global_noop_done_values$.currentBinding(thread);
        try {
            $lexicon_global_noop_done_values$.bind(NIL, thread);
            ans = lexicon_global_revision_noop_p_int(global, recorded_value, current_value);
        } finally {
            $lexicon_global_noop_done_values$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    static private final SubLSymbol $sym15$HL_PROTOTYPICAL_INSTANCE_ = makeSymbol("HL-PROTOTYPICAL-INSTANCE?");

    static private final SubLList $list_alt16 = list(new SubLObject[]{ reader_make_constant_shell("termStrings"), reader_make_constant_shell("termStrings-GuessedFromName"), reader_make_constant_shell("denotationPlaceholder"), reader_make_constant_shell("givenNames"), reader_make_constant_shell("middleName"), reader_make_constant_shell("familyName"), reader_make_constant_shell("firstName"), reader_make_constant_shell("lastName"), reader_make_constant_shell("middleNameInitial"), reader_make_constant_shell("initialsString"), reader_make_constant_shell("denotationRelatedTo"), reader_make_constant_shell("stockTickerSymbol"), reader_make_constant_shell("epistleAddresseeText"), reader_make_constant_shell("gospelName-Short"), reader_make_constant_shell("nicknames"), reader_make_constant_shell("atomicSymbol"), reader_make_constant_shell("titleOfWork"), reader_make_constant_shell("sectionTitle"), reader_make_constant_shell("referenceWorkEntryTitle"), reader_make_constant_shell("executableProgramName"), reader_make_constant_shell("countryCodeDigraph"), reader_make_constant_shell("internetCountryCode"), reader_make_constant_shell("folderTitle"), reader_make_constant_shell("ksTermString"), reader_make_constant_shell("rdfs:label") });

    public static final SubLObject lexicon_global_revision_noop_p_int_alt(SubLObject global, SubLObject recorded_value, SubLObject current_value) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != string_utilities.substringP(recorded_value, current_value, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            } else {
                if (NIL != subl_promotions.memberP(recorded_value, $lexicon_global_noop_done_values$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    return NIL;
                } else {
                    $lexicon_global_noop_done_values$.setDynamicValue(cons(recorded_value, $lexicon_global_noop_done_values$.getDynamicValue(thread)), thread);
                    {
                        SubLObject other_ok_values = com.cyc.cycjava.cycl.lexicon_vars.noop_updates_for_lexicon_global(global, recorded_value);
                        SubLObject noopP = NIL;
                        if (NIL == noopP) {
                            {
                                SubLObject csome_list_var = other_ok_values;
                                SubLObject value = NIL;
                                for (value = csome_list_var.first(); !((NIL != noopP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , value = csome_list_var.first()) {
                                    noopP = com.cyc.cycjava.cycl.lexicon_vars.lexicon_global_revision_noop_p_int(global, value, current_value);
                                }
                            }
                        }
                        return noopP;
                    }
                }
            }
        }
    }

    public static SubLObject lexicon_global_revision_noop_p_int(final SubLObject global, final SubLObject recorded_value, final SubLObject current_value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != string_utilities.substringP(recorded_value, current_value, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        if (NIL != subl_promotions.memberP(recorded_value, $lexicon_global_noop_done_values$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        $lexicon_global_noop_done_values$.setDynamicValue(cons(recorded_value, $lexicon_global_noop_done_values$.getDynamicValue(thread)), thread);
        final SubLObject other_ok_values = noop_updates_for_lexicon_global(global, recorded_value);
        SubLObject noopP = NIL;
        if (NIL == noopP) {
            SubLObject csome_list_var;
            SubLObject value;
            for (csome_list_var = other_ok_values, value = NIL, value = csome_list_var.first(); (NIL == noopP) && (NIL != csome_list_var); noopP = lexicon_global_revision_noop_p_int(global, value, current_value) , csome_list_var = csome_list_var.rest() , value = csome_list_var.first()) {
            }
        }
        return noopP;
    }

    public static final SubLObject noop_updates_for_lexicon_global_alt(SubLObject global, SubLObject recorded_value) {
        {
            SubLObject global_alist = list_utilities.alist_lookup($noop_updates_for_lexicon_globals$.getGlobalValue(), global, UNPROVIDED, UNPROVIDED);
            return list_utilities.alist_lookup(global_alist, recorded_value, symbol_function($sym54$SUPERSTRING_), UNPROVIDED);
        }
    }

    public static SubLObject noop_updates_for_lexicon_global(final SubLObject global, final SubLObject recorded_value) {
        final SubLObject global_alist = list_utilities.alist_lookup($noop_updates_for_lexicon_globals$.getGlobalValue(), global, UNPROVIDED, UNPROVIDED);
        return list_utilities.alist_lookup(global_alist, recorded_value, symbol_function($sym57$SUPERSTRING_), UNPROVIDED);
    }

    static private final SubLList $list_alt18 = list(reader_make_constant_shell("abbreviationString-PN"), reader_make_constant_shell("abbreviationForLexicalWord"), reader_make_constant_shell("abbreviationForMultiWordString"), reader_make_constant_shell("abbreviationForCompoundString"));

    public static final SubLObject nl_affix_type_p_alt(SubLObject obj) {
        return subl_promotions.memberP(obj, $nl_affix_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject nl_affix_type_p(final SubLObject obj) {
        return subl_promotions.memberP(obj, $nl_affix_types$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject declare_lexicon_vars_file_alt() {
        declareFunction("parse_morphologically_option_p", "PARSE-MORPHOLOGICALLY-OPTION-P", 1, 0, false);
        declareFunction("active_pragmatic_filtersP", "ACTIVE-PRAGMATIC-FILTERS?", 0, 0, false);
        declareFunction("pragmatic_filters", "PRAGMATIC-FILTERS", 0, 0, false);
        declareFunction("active_pragmatic_filters", "ACTIVE-PRAGMATIC-FILTERS", 0, 0, false);
        declareFunction("pragmatic_filter_activeP", "PRAGMATIC-FILTER-ACTIVE?", 1, 0, false);
        new com.cyc.cycjava.cycl.lexicon_vars.$pragmatic_filter_activeP$UnaryFunction();
        declareFunction("lexicon_lookup_mt_info", "LEXICON-LOOKUP-MT-INFO", 0, 0, false);
        declareFunction("set_app", "SET-APP", 1, 0, false);
        declareFunction("clear_cached_lexical_vars", "CLEAR-CACHED-LEXICAL-VARS", 0, 0, false);
        declareFunction("initialize_semtrans_preds", "INITIALIZE-SEMTRANS-PREDS", 0, 0, false);
        declareFunction("semtrans_predP", "SEMTRANS-PRED?", 1, 0, false);
        declareFunction("multi_word_preds", "MULTI-WORD-PREDS", 0, 0, false);
        declareFunction("initialize_multi_word_preds", "INITIALIZE-MULTI-WORD-PREDS", 0, 0, false);
        declareFunction("name_string_preds", "NAME-STRING-PREDS", 0, 1, false);
        declareFunction("name_string_preds_set", "NAME-STRING-PREDS-SET", 0, 1, false);
        declareFunction("abbreviation_predicates", "ABBREVIATION-PREDICATES", 0, 0, false);
        declareFunction("acronym_predicates", "ACRONYM-PREDICATES", 0, 0, false);
        declareFunction("initialize_proper_name_preds", "INITIALIZE-PROPER-NAME-PREDS", 0, 0, false);
        declareFunction("name_string_predP", "NAME-STRING-PRED?", 1, 0, false);
        declareFunction("term_strings_preds", "TERM-STRINGS-PREDS", 0, 1, false);
        declareFunction("term_strings_preds_set", "TERM-STRINGS-PREDS-SET", 0, 1, false);
        declareFunction("initialize_term_strings_preds", "INITIALIZE-TERM-STRINGS-PREDS", 0, 0, false);
        declareFunction("term_strings_predP", "TERM-STRINGS-PRED?", 1, 0, false);
        declareFunction("name_or_term_strings_predP", "NAME-OR-TERM-STRINGS-PRED?", 1, 0, false);
        declareFunction("nl_agr_predP", "NL-AGR-PRED?", 1, 0, false);
        declareFunction("head_medial_predP", "HEAD-MEDIAL-PRED?", 1, 0, false);
        declareFunction("head_initial_predP", "HEAD-INITIAL-PRED?", 1, 0, false);
        declareFunction("head_final_predP", "HEAD-FINAL-PRED?", 1, 0, false);
        declareFunction("clear_head_position_pred_cachedP", "CLEAR-HEAD-POSITION-PRED-CACHED?", 0, 0, false);
        declareFunction("remove_head_position_pred_cachedP", "REMOVE-HEAD-POSITION-PRED-CACHED?", 2, 0, false);
        declareFunction("head_position_pred_cachedP_internal", "HEAD-POSITION-PRED-CACHED?-INTERNAL", 2, 0, false);
        declareFunction("head_position_pred_cachedP", "HEAD-POSITION-PRED-CACHED?", 2, 0, false);
        declareFunction("clear_verb_frames", "CLEAR-VERB-FRAMES", 0, 0, false);
        declareFunction("remove_verb_frames", "REMOVE-VERB-FRAMES", 0, 1, false);
        declareFunction("verb_frames_internal", "VERB-FRAMES-INTERNAL", 1, 0, false);
        declareFunction("verb_frames", "VERB-FRAMES", 0, 1, false);
        declareFunction("all_lexicon_string_predicates", "ALL-LEXICON-STRING-PREDICATES", 0, 0, false);
        declareFunction("initialize_all_lexicon_string_predicates", "INITIALIZE-ALL-LEXICON-STRING-PREDICATES", 0, 0, false);
        declareFunction("all_lexicon_predicates", "ALL-LEXICON-PREDICATES", 0, 0, false);
        declareFunction("initialize_all_lexicon_predicates", "INITIALIZE-ALL-LEXICON-PREDICATES", 0, 0, false);
        declareFunction("initialize_all_speech_part_preds", "INITIALIZE-ALL-SPEECH-PART-PREDS", 0, 0, false);
        declareFunction("declare_noop_updates_for_lexicon_global", "DECLARE-NOOP-UPDATES-FOR-LEXICON-GLOBAL", 2, 0, false);
        declareFunction("lexicon_global_revision_noop_p", "LEXICON-GLOBAL-REVISION-NOOP-P", 3, 0, false);
        declareFunction("lexicon_global_revision_noop_p_int", "LEXICON-GLOBAL-REVISION-NOOP-P-INT", 3, 0, false);
        declareFunction("noop_updates_for_lexicon_global", "NOOP-UPDATES-FOR-LEXICON-GLOBAL", 2, 0, false);
        declareFunction("nl_affix_type_p", "NL-AFFIX-TYPE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_lexicon_vars_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("parse_morphologically_option_p", "PARSE-MORPHOLOGICALLY-OPTION-P", 1, 0, false);
            declareFunction("active_lexicon_filtersP", "ACTIVE-LEXICON-FILTERS?", 0, 0, false);
            declareFunction("lexicon_filters", "LEXICON-FILTERS", 0, 0, false);
            declareFunction("active_lexicon_filters", "ACTIVE-LEXICON-FILTERS", 0, 0, false);
            declareFunction("lexicon_filter_activeP", "LEXICON-FILTER-ACTIVE?", 1, 0, false);
            declareFunction("lexicon_lookup_mt_info", "LEXICON-LOOKUP-MT-INFO", 0, 0, false);
            declareFunction("set_app", "SET-APP", 1, 0, false);
            declareFunction("clear_cached_lexical_vars", "CLEAR-CACHED-LEXICAL-VARS", 0, 0, false);
            declareFunction("lex_pred_set_p", "LEX-PRED-SET-P", 1, 0, false);
            declareFunction("lex_pred_set_uninitializedP", "LEX-PRED-SET-UNINITIALIZED?", 1, 0, false);
            declareFunction("clear_lex_pred_set", "CLEAR-LEX-PRED-SET", 1, 0, false);
            declareFunction("new_lex_pred_set", "NEW-LEX-PRED-SET", 0, 0, false);
            declareFunction("lex_pred_set_memberP", "LEX-PRED-SET-MEMBER?", 2, 0, false);
            declareFunction("lex_pred_set_element_list", "LEX-PRED-SET-ELEMENT-LIST", 1, 0, false);
            declareFunction("initialize_semtrans_preds", "INITIALIZE-SEMTRANS-PREDS", 0, 0, false);
            declareFunction("semtrans_predP", "SEMTRANS-PRED?", 1, 0, false);
            declareFunction("multi_word_preds", "MULTI-WORD-PREDS", 0, 0, false);
            declareFunction("initialize_multi_word_preds", "INITIALIZE-MULTI-WORD-PREDS", 0, 0, false);
            declareFunction("abbreviation_predicates", "ABBREVIATION-PREDICATES", 0, 0, false);
            declareFunction("acronym_predicates", "ACRONYM-PREDICATES", 0, 0, false);
            declareFunction("name_string_preds", "NAME-STRING-PREDS", 0, 1, false);
            declareFunction("name_string_preds_set", "NAME-STRING-PREDS-SET", 0, 1, false);
            declareFunction("initialize_proper_name_preds", "INITIALIZE-PROPER-NAME-PREDS", 0, 0, false);
            declareFunction("name_string_predP", "NAME-STRING-PRED?", 1, 0, false);
            declareFunction("term_strings_preds", "TERM-STRINGS-PREDS", 0, 1, false);
            declareFunction("term_strings_preds_set", "TERM-STRINGS-PREDS-SET", 0, 1, false);
            declareFunction("initialize_term_strings_preds", "INITIALIZE-TERM-STRINGS-PREDS", 0, 0, false);
            declareFunction("term_strings_predP", "TERM-STRINGS-PRED?", 1, 0, false);
            declareFunction("name_or_term_strings_predP", "NAME-OR-TERM-STRINGS-PRED?", 1, 0, false);
            declareFunction("nl_agr_predP", "NL-AGR-PRED?", 1, 0, false);
            declareFunction("head_medial_predP", "HEAD-MEDIAL-PRED?", 1, 0, false);
            declareFunction("head_initial_predP", "HEAD-INITIAL-PRED?", 1, 0, false);
            declareFunction("head_final_predP", "HEAD-FINAL-PRED?", 1, 0, false);
            declareFunction("clear_head_position_pred_cachedP", "CLEAR-HEAD-POSITION-PRED-CACHED?", 0, 0, false);
            declareFunction("remove_head_position_pred_cachedP", "REMOVE-HEAD-POSITION-PRED-CACHED?", 2, 0, false);
            declareFunction("head_position_pred_cachedP_internal", "HEAD-POSITION-PRED-CACHED?-INTERNAL", 2, 0, false);
            declareFunction("head_position_pred_cachedP", "HEAD-POSITION-PRED-CACHED?", 2, 0, false);
            declareFunction("clear_verb_frames", "CLEAR-VERB-FRAMES", 0, 0, false);
            declareFunction("remove_verb_frames", "REMOVE-VERB-FRAMES", 0, 1, false);
            declareFunction("verb_frames_internal", "VERB-FRAMES-INTERNAL", 1, 0, false);
            declareFunction("verb_frames", "VERB-FRAMES", 0, 1, false);
            declareFunction("all_lexicon_string_predicates", "ALL-LEXICON-STRING-PREDICATES", 0, 0, false);
            declareFunction("initialize_all_lexicon_string_predicates", "INITIALIZE-ALL-LEXICON-STRING-PREDICATES", 0, 0, false);
            declareFunction("all_lexicon_predicates", "ALL-LEXICON-PREDICATES", 0, 0, false);
            declareFunction("initialize_all_lexicon_predicates", "INITIALIZE-ALL-LEXICON-PREDICATES", 0, 0, false);
            declareFunction("initialize_all_speech_part_preds", "INITIALIZE-ALL-SPEECH-PART-PREDS", 0, 0, false);
            declareFunction("declare_noop_updates_for_lexicon_global", "DECLARE-NOOP-UPDATES-FOR-LEXICON-GLOBAL", 2, 0, false);
            declareFunction("lexicon_global_revision_noop_p", "LEXICON-GLOBAL-REVISION-NOOP-P", 3, 0, false);
            declareFunction("lexicon_global_revision_noop_p_int", "LEXICON-GLOBAL-REVISION-NOOP-P-INT", 3, 0, false);
            declareFunction("noop_updates_for_lexicon_global", "NOOP-UPDATES-FOR-LEXICON-GLOBAL", 2, 0, false);
            declareFunction("nl_affix_type_p", "NL-AFFIX-TYPE-P", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("active_pragmatic_filtersP", "ACTIVE-PRAGMATIC-FILTERS?", 0, 0, false);
            declareFunction("pragmatic_filters", "PRAGMATIC-FILTERS", 0, 0, false);
            declareFunction("active_pragmatic_filters", "ACTIVE-PRAGMATIC-FILTERS", 0, 0, false);
            declareFunction("pragmatic_filter_activeP", "PRAGMATIC-FILTER-ACTIVE?", 1, 0, false);
            new com.cyc.cycjava.cycl.lexicon_vars.$pragmatic_filter_activeP$UnaryFunction();
        }
        return NIL;
    }

    public static SubLObject declare_lexicon_vars_file_Previous() {
        declareFunction("parse_morphologically_option_p", "PARSE-MORPHOLOGICALLY-OPTION-P", 1, 0, false);
        declareFunction("active_lexicon_filtersP", "ACTIVE-LEXICON-FILTERS?", 0, 0, false);
        declareFunction("lexicon_filters", "LEXICON-FILTERS", 0, 0, false);
        declareFunction("active_lexicon_filters", "ACTIVE-LEXICON-FILTERS", 0, 0, false);
        declareFunction("lexicon_filter_activeP", "LEXICON-FILTER-ACTIVE?", 1, 0, false);
        declareFunction("lexicon_lookup_mt_info", "LEXICON-LOOKUP-MT-INFO", 0, 0, false);
        declareFunction("set_app", "SET-APP", 1, 0, false);
        declareFunction("clear_cached_lexical_vars", "CLEAR-CACHED-LEXICAL-VARS", 0, 0, false);
        declareFunction("lex_pred_set_p", "LEX-PRED-SET-P", 1, 0, false);
        declareFunction("lex_pred_set_uninitializedP", "LEX-PRED-SET-UNINITIALIZED?", 1, 0, false);
        declareFunction("clear_lex_pred_set", "CLEAR-LEX-PRED-SET", 1, 0, false);
        declareFunction("new_lex_pred_set", "NEW-LEX-PRED-SET", 0, 0, false);
        declareFunction("lex_pred_set_memberP", "LEX-PRED-SET-MEMBER?", 2, 0, false);
        declareFunction("lex_pred_set_element_list", "LEX-PRED-SET-ELEMENT-LIST", 1, 0, false);
        declareFunction("initialize_semtrans_preds", "INITIALIZE-SEMTRANS-PREDS", 0, 0, false);
        declareFunction("semtrans_predP", "SEMTRANS-PRED?", 1, 0, false);
        declareFunction("multi_word_preds", "MULTI-WORD-PREDS", 0, 0, false);
        declareFunction("initialize_multi_word_preds", "INITIALIZE-MULTI-WORD-PREDS", 0, 0, false);
        declareFunction("abbreviation_predicates", "ABBREVIATION-PREDICATES", 0, 0, false);
        declareFunction("acronym_predicates", "ACRONYM-PREDICATES", 0, 0, false);
        declareFunction("name_string_preds", "NAME-STRING-PREDS", 0, 1, false);
        declareFunction("name_string_preds_set", "NAME-STRING-PREDS-SET", 0, 1, false);
        declareFunction("initialize_proper_name_preds", "INITIALIZE-PROPER-NAME-PREDS", 0, 0, false);
        declareFunction("name_string_predP", "NAME-STRING-PRED?", 1, 0, false);
        declareFunction("term_strings_preds", "TERM-STRINGS-PREDS", 0, 1, false);
        declareFunction("term_strings_preds_set", "TERM-STRINGS-PREDS-SET", 0, 1, false);
        declareFunction("initialize_term_strings_preds", "INITIALIZE-TERM-STRINGS-PREDS", 0, 0, false);
        declareFunction("term_strings_predP", "TERM-STRINGS-PRED?", 1, 0, false);
        declareFunction("name_or_term_strings_predP", "NAME-OR-TERM-STRINGS-PRED?", 1, 0, false);
        declareFunction("nl_agr_predP", "NL-AGR-PRED?", 1, 0, false);
        declareFunction("head_medial_predP", "HEAD-MEDIAL-PRED?", 1, 0, false);
        declareFunction("head_initial_predP", "HEAD-INITIAL-PRED?", 1, 0, false);
        declareFunction("head_final_predP", "HEAD-FINAL-PRED?", 1, 0, false);
        declareFunction("clear_head_position_pred_cachedP", "CLEAR-HEAD-POSITION-PRED-CACHED?", 0, 0, false);
        declareFunction("remove_head_position_pred_cachedP", "REMOVE-HEAD-POSITION-PRED-CACHED?", 2, 0, false);
        declareFunction("head_position_pred_cachedP_internal", "HEAD-POSITION-PRED-CACHED?-INTERNAL", 2, 0, false);
        declareFunction("head_position_pred_cachedP", "HEAD-POSITION-PRED-CACHED?", 2, 0, false);
        declareFunction("clear_verb_frames", "CLEAR-VERB-FRAMES", 0, 0, false);
        declareFunction("remove_verb_frames", "REMOVE-VERB-FRAMES", 0, 1, false);
        declareFunction("verb_frames_internal", "VERB-FRAMES-INTERNAL", 1, 0, false);
        declareFunction("verb_frames", "VERB-FRAMES", 0, 1, false);
        declareFunction("all_lexicon_string_predicates", "ALL-LEXICON-STRING-PREDICATES", 0, 0, false);
        declareFunction("initialize_all_lexicon_string_predicates", "INITIALIZE-ALL-LEXICON-STRING-PREDICATES", 0, 0, false);
        declareFunction("all_lexicon_predicates", "ALL-LEXICON-PREDICATES", 0, 0, false);
        declareFunction("initialize_all_lexicon_predicates", "INITIALIZE-ALL-LEXICON-PREDICATES", 0, 0, false);
        declareFunction("initialize_all_speech_part_preds", "INITIALIZE-ALL-SPEECH-PART-PREDS", 0, 0, false);
        declareFunction("declare_noop_updates_for_lexicon_global", "DECLARE-NOOP-UPDATES-FOR-LEXICON-GLOBAL", 2, 0, false);
        declareFunction("lexicon_global_revision_noop_p", "LEXICON-GLOBAL-REVISION-NOOP-P", 3, 0, false);
        declareFunction("lexicon_global_revision_noop_p_int", "LEXICON-GLOBAL-REVISION-NOOP-P-INT", 3, 0, false);
        declareFunction("noop_updates_for_lexicon_global", "NOOP-UPDATES-FOR-LEXICON-GLOBAL", 2, 0, false);
        declareFunction("nl_affix_type_p", "NL-AFFIX-TYPE-P", 1, 0, false);
        return NIL;
    }

    public static final SubLObject $const23$HeadMedialMultiWordForConstantPre = reader_make_constant_shell("HeadMedialMultiWordForConstantPred");

    public static final SubLObject $const24$HeadInitialMultiWordForConstantPr = reader_make_constant_shell("HeadInitialMultiWordForConstantPred");

    static private final SubLSymbol $sym26$HEAD_POSITION_PRED_CACHED_ = makeSymbol("HEAD-POSITION-PRED-CACHED?");

    static private final SubLSymbol $sym27$_HEAD_POSITION_PRED_CACHED__CACHING_STATE_ = makeSymbol("*HEAD-POSITION-PRED-CACHED?-CACHING-STATE*");

    public static final SubLSymbol $kw29$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt34 = list(reader_make_constant_shell("singular"), reader_make_constant_shell("plural"));

    static private final SubLList $list_alt35 = list(reader_make_constant_shell("pnSingular"), reader_make_constant_shell("pnPlural"), reader_make_constant_shell("pnMassNumber"));

    static private final SubLList $list_alt36 = list(reader_make_constant_shell("pnMassNumber"));

    static private final SubLList $list_alt37 = list(reader_make_constant_shell("pnSingular"), reader_make_constant_shell("pnPlural"));

    static private final SubLList $list_alt38 = list(reader_make_constant_shell("agentive-Sg"), reader_make_constant_shell("agentive-Pl"));

    static private final SubLList $list_alt39 = list(reader_make_constant_shell("massNumber"), reader_make_constant_shell("agentive-Mass"));

    static private final SubLList $list_alt40 = list(new SubLObject[]{ reader_make_constant_shell("infinitive"), reader_make_constant_shell("pastTense-Universal"), reader_make_constant_shell("presentParticiple"), reader_make_constant_shell("perfect"), reader_make_constant_shell("thirdPersonSg-Past"), reader_make_constant_shell("secondPersonSg-Past"), reader_make_constant_shell("firstPersonSg-Past"), reader_make_constant_shell("pluralVerb-Past"), reader_make_constant_shell("thirdPersonSg-Present"), reader_make_constant_shell("firstPersonSg-Present"), reader_make_constant_shell("secondPersonSg-Present") });

    static private final SubLList $list_alt41 = list(reader_make_constant_shell("regularDegree"), reader_make_constant_shell("comparativeDegree"), reader_make_constant_shell("superlativeDegree"));

    static private final SubLList $list_alt42 = list(reader_make_constant_shell("regularAdverb"), reader_make_constant_shell("comparativeAdverb"), reader_make_constant_shell("superlativeAdverb"));

    static private final SubLSymbol $sym43$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    static private final SubLList $list_alt44 = list(new SubLObject[]{ reader_make_constant_shell("properNameStrings"), reader_make_constant_shell("massNumber"), reader_make_constant_shell("plural"), reader_make_constant_shell("singular"), reader_make_constant_shell("pnMassNumber"), reader_make_constant_shell("pnPlural"), reader_make_constant_shell("pnSingular"), reader_make_constant_shell("gerund"), reader_make_constant_shell("presentParticiple"), reader_make_constant_shell("infinitive"), reader_make_constant_shell("secondPersonSg-Present"), reader_make_constant_shell("firstPersonSg-Present"), reader_make_constant_shell("thirdPersonSg-Present"), reader_make_constant_shell("perfect"), makeSymbol("PASTTENSE-UNIVERSAL"), reader_make_constant_shell("thirdPersonSg-Past"), reader_make_constant_shell("secondPersonSg-Past"), reader_make_constant_shell("firstPersonSg-Past"), reader_make_constant_shell("pluralVerb-Past"), reader_make_constant_shell("agentive-Mass"), reader_make_constant_shell("agentive-Pl"), reader_make_constant_shell("agentive-Sg"), reader_make_constant_shell("regularAdverb"), reader_make_constant_shell("comparativeAdverb"), reader_make_constant_shell("superlativeAdverb"), reader_make_constant_shell("regularDegree"), reader_make_constant_shell("comparativeDegree"), reader_make_constant_shell("superlativeDegree"), reader_make_constant_shell("pnNonPlural-Generic"), reader_make_constant_shell("nonSingular-Generic"), reader_make_constant_shell("nonPlural-Generic"), reader_make_constant_shell("massNumber-Generic"), reader_make_constant_shell("plural-Generic"), reader_make_constant_shell("singular-Generic"), reader_make_constant_shell("singular-Feminine"), reader_make_constant_shell("singular-Masculine"), reader_make_constant_shell("plural-Feminine"), reader_make_constant_shell("plural-Masculine"), reader_make_constant_shell("singular-Neuter"), reader_make_constant_shell("plural-Neuter"), reader_make_constant_shell("nonThirdSg-Present"), reader_make_constant_shell("perfective-Generic"), reader_make_constant_shell("wordStrings") });

    public static final SubLObject init_lexicon_vars_file_alt() {
        defparameter("*PSG-RULES*", NIL);
        defparameter("*PRINT-WHILE-BUILDING-HASH?*", NIL);
        defparameter("*NL-UNDERSTANDING-MTS*", NIL);
        defparameter("*NL-GENERATION-MTS*", NIL);
        defparameter("*NL-RELEVANCE-PURPOSE*", $GENERATION);
        defparameter("*MISSPELLINGS?*", NIL);
        defparameter("*PARSE-MORPHOLOGICALLY*", $AS_FALLBACK);
        deflexical("*PARSE-MORPHOLOGICALLY-OPTIONS*", $list_alt2);
        defparameter("*EXCLUDE-VULGARITIES?*", NIL);
        defparameter("*EXCLUDE-SLANG?*", NIL);
        defparameter("*EXCLUDE-ARCHAIC-SPEECH?*", NIL);
        defvar("*LEXICON-LOOKUP-MT*", $$BaseKB);
        defparameter("*GREEDY-NLWE-INTERPRETATIONS*", T);
        defparameter("*FAVORED-POS*", NIL);
        defparameter("*MAX-MWW-WORD-LENGTH*", TEN_INTEGER);
        defparameter("*USE-ACRONYMS?*", NIL);
        defparameter("*USE-ABBREVIATIONS?*", NIL);
        defparameter("*USE-LEXICAL-ABBREVIATIONS?*", T);
        defparameter("*INITIALIZE-NL-TRIE-CONTROL-VARS?*", T);
        defparameter("*WN-POS-CYC-POS-MAP*", $list_alt7);
        deflexical("*SEMTRANS-PREDS*", NIL);
        deflexical("*MULTI-WORD-PREDS*", NIL);
        deflexical("*PROPER-NAME-PREDICATES-FROM-KB*", NIL);
        defparameter("*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*", construct_set_from_list($list_alt16, UNPROVIDED, UNPROVIDED));
        defparameter("*ABBREVIATION-PREDICATES*", $UNSET);
        defparameter("*ACRONYM-PREDICATES*", $UNSET);
        deflexical("*TERM-STRINGS-PREDS*", NIL);
        deflexical("*HEAD-POSITION-PRED-CACHED?-CACHING-STATE*", NIL);
        deflexical("*VERB-FRAMES-CACHING-STATE*", NIL);
        defparameter("*NOUN-PREDICATES*", $list_alt34);
        defparameter("*PN-PREDICATES*", $list_alt35);
        defparameter("*PN-MASS-PREDICATES*", $list_alt36);
        defparameter("*PN-COUNT-PREDICATES*", $list_alt37);
        defparameter("*AGENTIVE-PREDS*", $list_alt38);
        defparameter("*MASS-PREDICATES*", $list_alt39);
        defparameter("*VERB-PREDICATES*", $list_alt40);
        defparameter("*ADJECTIVE-PREDICATES*", $list_alt41);
        defparameter("*ADVERB-PREDICATES*", $list_alt42);
        deflexical("*ALL-LEXICON-STRING-PREDICATES*", $UNINITIALIZED);
        deflexical("*ALL-LEXICON-PREDICATES*", NIL);
        defconstant("*TOP-LEVEL-NL-PRED*", $$wordStrings);
        deflexical("*ROOT-FORM-SPEECH-PARTS*", $list_alt47);
        deflexical("*LEXICON-CACHE-CODE-REVISION*", NIL != boundp($lexicon_cache_code_revision$) ? ((SubLObject) ($lexicon_cache_code_revision$.getGlobalValue())) : NIL);
        deflexical("*MORPHOLOGY-CODE-REVISION*", NIL != boundp($morphology_code_revision$) ? ((SubLObject) ($morphology_code_revision$.getGlobalValue())) : NIL);
        deflexical("*NL-TRIE-CODE-REVISION*", NIL != boundp($nl_trie_code_revision$) ? ((SubLObject) ($nl_trie_code_revision$.getGlobalValue())) : NIL);
        deflexical("*NOOP-UPDATES-FOR-LEXICON-GLOBALS*", NIL != boundp($noop_updates_for_lexicon_globals$) ? ((SubLObject) ($noop_updates_for_lexicon_globals$.getGlobalValue())) : NIL);
        defparameter("*LEXICON-GLOBAL-NOOP-DONE-VALUES*", NIL);
        defparameter("*MWP-REFORMULATE-RESULTS?*", NIL);
        defparameter("*MWP-TRIEFY-RESULTS?*", NIL);
        defparameter("*USE-MWP?*", NIL);
        defparameter("*MWP-MAKE-UP-BASES?*", NIL);
        defparameter("*MWP-SEMANTIC-CHECK-MT*", $$EnglishMt);
        defparameter("*MWP-SYNTACTIC-CHECK-MT*", $$EnglishMt);
        defparameter("*MWP-RULE-LOOKUP-MT*", $$EnglishMt);
        defparameter("*MWP-WFF-FILTER-LEVEL*", ONE_INTEGER);
        defparameter("*MWP-SUPPRESS-RECURSIVE-ANALYSIS?*", NIL);
        defconstant("*NL-AFFIX-TYPES*", $list_alt56);
        defvar("*DEFAULT-LEXIFICATION-MT*", $$$GeneralEnglishMt);
        defvar("*DEFAULT-SYNTACTIC-MT*", $$$GeneralEnglishMt);
        defvar("*DEFAULT-RELATIONAL-LEXIFICATION-MT*", $$$EnglishParaphraseMt);
        defvar("*DEFAULT-LEXIFICATION-TEMPLATE-MT*", $$$EnglishTemplateMt);
        defvar("*DEFAULT-PREDICATE-LEXIFICATION-MT*", $$$RelationParaphraseMt);
        return NIL;
    }

    public static SubLObject init_lexicon_vars_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*PSG-RULES*", NIL);
            defparameter("*PRINT-WHILE-BUILDING-HASH?*", NIL);
            defparameter("*NL-UNDERSTANDING-MTS*", NIL);
            defparameter("*NL-GENERATION-MTS*", NIL);
            defparameter("*NL-RELEVANCE-PURPOSE*", $GENERATION);
            defparameter("*MISSPELLINGS?*", NIL);
            defparameter("*PARSE-MORPHOLOGICALLY*", $AS_FALLBACK);
            deflexical("*PARSE-MORPHOLOGICALLY-OPTIONS*", $list2);
            defparameter("*EXCLUDE-VULGARITIES?*", NIL);
            defparameter("*EXCLUDE-SLANG?*", NIL);
            defparameter("*EXCLUDE-ARCHAIC-SPEECH?*", NIL);
            defparameter("*EXCLUDE-INDIRECT-RELATIONS?*", NIL);
            defvar("*LEXICON-LOOKUP-MT*", $$BaseKB);
            defparameter("*GREEDY-NLWE-INTERPRETATIONS*", T);
            defparameter("*FAVORED-POS*", NIL);
            defparameter("*MAX-MWW-WORD-LENGTH*", TEN_INTEGER);
            defparameter("*USE-ACRONYMS?*", NIL);
            defparameter("*USE-ABBREVIATIONS?*", NIL);
            defparameter("*USE-LEXICAL-ABBREVIATIONS?*", T);
            defparameter("*INITIALIZE-NL-TRIE-CONTROL-VARS?*", T);
            defparameter("*WN-POS-CYC-POS-MAP*", $list7);
            deflexical("*SEMTRANS-PREDS*", SubLTrampolineFile.maybeDefault($semtrans_preds$, $semtrans_preds$, () -> new_lex_pred_set()));
            deflexical("*MULTI-WORD-PREDS*", new_lex_pred_set());
            defparameter("*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*", set_utilities.construct_set_from_list($list16, UNPROVIDED, UNPROVIDED));
            deflexical("*ABBREVIATION-PREDICATES*", SubLTrampolineFile.maybeDefault($abbreviation_predicates$, $abbreviation_predicates$, () -> new_lex_pred_set()));
            deflexical("*ACRONYM-PREDICATES*", SubLTrampolineFile.maybeDefault($acronym_predicates$, $acronym_predicates$, () -> new_lex_pred_set()));
            deflexical("*PROPER-NAME-PREDICATES-FROM-KB*", SubLTrampolineFile.maybeDefault($proper_name_predicates_from_kb$, $proper_name_predicates_from_kb$, () -> new_lex_pred_set()));
            deflexical("*TERM-STRINGS-PREDS*", SubLTrampolineFile.maybeDefault($term_strings_preds$, $term_strings_preds$, () -> new_lex_pred_set()));
            deflexical("*HEAD-POSITION-PRED-CACHED?-CACHING-STATE*", NIL);
            deflexical("*VERB-FRAMES-CACHING-STATE*", NIL);
            defparameter("*NOUN-PREDICATES*", $list36);
            defparameter("*PN-PREDICATES*", $list37);
            defparameter("*PN-MASS-PREDICATES*", $list38);
            defparameter("*PN-COUNT-PREDICATES*", $list39);
            defparameter("*AGENTIVE-PREDS*", $list40);
            defparameter("*MASS-PREDICATES*", $list41);
            defparameter("*VERB-PREDICATES*", $list42);
            defparameter("*ADJECTIVE-PREDICATES*", $list43);
            defparameter("*ADVERB-PREDICATES*", $list44);
            deflexical("*ALL-LEXICON-STRING-PREDICATES*", $UNINITIALIZED);
            deflexical("*ALL-LEXICON-PREDICATES*", NIL);
            defconstant("*TOP-LEVEL-NL-PRED*", $$wordStrings);
            deflexical("*ROOT-FORM-SPEECH-PARTS*", $list50);
            deflexical("*LEXICON-CACHE-CODE-REVISION*", SubLTrampolineFile.maybeDefault($lexicon_cache_code_revision$, $lexicon_cache_code_revision$, NIL));
            deflexical("*MORPHOLOGY-CODE-REVISION*", SubLTrampolineFile.maybeDefault($morphology_code_revision$, $morphology_code_revision$, NIL));
            deflexical("*NL-TRIE-CODE-REVISION*", SubLTrampolineFile.maybeDefault($nl_trie_code_revision$, $nl_trie_code_revision$, NIL));
            deflexical("*NOOP-UPDATES-FOR-LEXICON-GLOBALS*", SubLTrampolineFile.maybeDefault($noop_updates_for_lexicon_globals$, $noop_updates_for_lexicon_globals$, NIL));
            defparameter("*LEXICON-GLOBAL-NOOP-DONE-VALUES*", NIL);
            defparameter("*MWP-REFORMULATE-RESULTS?*", NIL);
            defparameter("*MWP-TRIEFY-RESULTS?*", NIL);
            defparameter("*USE-MWP?*", NIL);
            defparameter("*MWP-MAKE-UP-BASES?*", NIL);
            defparameter("*MWP-SEMANTIC-CHECK-MT*", $$EnglishMt);
            defparameter("*MWP-SYNTACTIC-CHECK-MT*", $$EnglishMt);
            defparameter("*MWP-RULE-LOOKUP-MT*", $$EnglishMt);
            defparameter("*MWP-WFF-FILTER-LEVEL*", ONE_INTEGER);
            defparameter("*MWP-SUPPRESS-RECURSIVE-ANALYSIS?*", NIL);
            defconstant("*NL-AFFIX-TYPES*", $list59);
            defvar("*DEFAULT-LEXIFICATION-MT*", $$$GeneralEnglishMt);
            defvar("*DEFAULT-SYNTACTIC-MT*", $$$GeneralEnglishMt);
            defvar("*DEFAULT-RELATIONAL-LEXIFICATION-MT*", $$$EnglishParaphraseMt);
            defvar("*DEFAULT-LEXIFICATION-TEMPLATE-MT*", $$$EnglishTemplateMt);
            defvar("*DEFAULT-PREDICATE-LEXIFICATION-MT*", $$$RelationParaphraseMt);
            defvar("*USE-SME-LEXWIZ*", T);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*SEMTRANS-PREDS*", NIL);
            deflexical("*MULTI-WORD-PREDS*", NIL);
            deflexical("*PROPER-NAME-PREDICATES-FROM-KB*", NIL);
            defparameter("*ABBREVIATION-PREDICATES*", $UNSET);
            defparameter("*ACRONYM-PREDICATES*", $UNSET);
            deflexical("*TERM-STRINGS-PREDS*", NIL);
            defparameter("*NOUN-PREDICATES*", $list_alt34);
            defparameter("*PN-PREDICATES*", $list_alt35);
            defparameter("*PN-MASS-PREDICATES*", $list_alt36);
            defparameter("*PN-COUNT-PREDICATES*", $list_alt37);
            defparameter("*AGENTIVE-PREDS*", $list_alt38);
            defparameter("*MASS-PREDICATES*", $list_alt39);
            defparameter("*VERB-PREDICATES*", $list_alt40);
            defparameter("*ADJECTIVE-PREDICATES*", $list_alt41);
            defparameter("*ADVERB-PREDICATES*", $list_alt42);
            deflexical("*ROOT-FORM-SPEECH-PARTS*", $list_alt47);
            deflexical("*LEXICON-CACHE-CODE-REVISION*", NIL != boundp($lexicon_cache_code_revision$) ? ((SubLObject) ($lexicon_cache_code_revision$.getGlobalValue())) : NIL);
            deflexical("*MORPHOLOGY-CODE-REVISION*", NIL != boundp($morphology_code_revision$) ? ((SubLObject) ($morphology_code_revision$.getGlobalValue())) : NIL);
            deflexical("*NL-TRIE-CODE-REVISION*", NIL != boundp($nl_trie_code_revision$) ? ((SubLObject) ($nl_trie_code_revision$.getGlobalValue())) : NIL);
            deflexical("*NOOP-UPDATES-FOR-LEXICON-GLOBALS*", NIL != boundp($noop_updates_for_lexicon_globals$) ? ((SubLObject) ($noop_updates_for_lexicon_globals$.getGlobalValue())) : NIL);
            defconstant("*NL-AFFIX-TYPES*", $list_alt56);
        }
        return NIL;
    }

    public static SubLObject init_lexicon_vars_file_Previous() {
        defparameter("*PSG-RULES*", NIL);
        defparameter("*PRINT-WHILE-BUILDING-HASH?*", NIL);
        defparameter("*NL-UNDERSTANDING-MTS*", NIL);
        defparameter("*NL-GENERATION-MTS*", NIL);
        defparameter("*NL-RELEVANCE-PURPOSE*", $GENERATION);
        defparameter("*MISSPELLINGS?*", NIL);
        defparameter("*PARSE-MORPHOLOGICALLY*", $AS_FALLBACK);
        deflexical("*PARSE-MORPHOLOGICALLY-OPTIONS*", $list2);
        defparameter("*EXCLUDE-VULGARITIES?*", NIL);
        defparameter("*EXCLUDE-SLANG?*", NIL);
        defparameter("*EXCLUDE-ARCHAIC-SPEECH?*", NIL);
        defparameter("*EXCLUDE-INDIRECT-RELATIONS?*", NIL);
        defvar("*LEXICON-LOOKUP-MT*", $$BaseKB);
        defparameter("*GREEDY-NLWE-INTERPRETATIONS*", T);
        defparameter("*FAVORED-POS*", NIL);
        defparameter("*MAX-MWW-WORD-LENGTH*", TEN_INTEGER);
        defparameter("*USE-ACRONYMS?*", NIL);
        defparameter("*USE-ABBREVIATIONS?*", NIL);
        defparameter("*USE-LEXICAL-ABBREVIATIONS?*", T);
        defparameter("*INITIALIZE-NL-TRIE-CONTROL-VARS?*", T);
        defparameter("*WN-POS-CYC-POS-MAP*", $list7);
        deflexical("*SEMTRANS-PREDS*", SubLTrampolineFile.maybeDefault($semtrans_preds$, $semtrans_preds$, () -> new_lex_pred_set()));
        deflexical("*MULTI-WORD-PREDS*", new_lex_pred_set());
        defparameter("*SEMANTIC-PREDICATES-EXCLUDED-FROM-LEXICAL-LOOKUP*", set_utilities.construct_set_from_list($list16, UNPROVIDED, UNPROVIDED));
        deflexical("*ABBREVIATION-PREDICATES*", SubLTrampolineFile.maybeDefault($abbreviation_predicates$, $abbreviation_predicates$, () -> new_lex_pred_set()));
        deflexical("*ACRONYM-PREDICATES*", SubLTrampolineFile.maybeDefault($acronym_predicates$, $acronym_predicates$, () -> new_lex_pred_set()));
        deflexical("*PROPER-NAME-PREDICATES-FROM-KB*", SubLTrampolineFile.maybeDefault($proper_name_predicates_from_kb$, $proper_name_predicates_from_kb$, () -> new_lex_pred_set()));
        deflexical("*TERM-STRINGS-PREDS*", SubLTrampolineFile.maybeDefault($term_strings_preds$, $term_strings_preds$, () -> new_lex_pred_set()));
        deflexical("*HEAD-POSITION-PRED-CACHED?-CACHING-STATE*", NIL);
        deflexical("*VERB-FRAMES-CACHING-STATE*", NIL);
        defparameter("*NOUN-PREDICATES*", $list36);
        defparameter("*PN-PREDICATES*", $list37);
        defparameter("*PN-MASS-PREDICATES*", $list38);
        defparameter("*PN-COUNT-PREDICATES*", $list39);
        defparameter("*AGENTIVE-PREDS*", $list40);
        defparameter("*MASS-PREDICATES*", $list41);
        defparameter("*VERB-PREDICATES*", $list42);
        defparameter("*ADJECTIVE-PREDICATES*", $list43);
        defparameter("*ADVERB-PREDICATES*", $list44);
        deflexical("*ALL-LEXICON-STRING-PREDICATES*", $UNINITIALIZED);
        deflexical("*ALL-LEXICON-PREDICATES*", NIL);
        defconstant("*TOP-LEVEL-NL-PRED*", $$wordStrings);
        deflexical("*ROOT-FORM-SPEECH-PARTS*", $list50);
        deflexical("*LEXICON-CACHE-CODE-REVISION*", SubLTrampolineFile.maybeDefault($lexicon_cache_code_revision$, $lexicon_cache_code_revision$, NIL));
        deflexical("*MORPHOLOGY-CODE-REVISION*", SubLTrampolineFile.maybeDefault($morphology_code_revision$, $morphology_code_revision$, NIL));
        deflexical("*NL-TRIE-CODE-REVISION*", SubLTrampolineFile.maybeDefault($nl_trie_code_revision$, $nl_trie_code_revision$, NIL));
        deflexical("*NOOP-UPDATES-FOR-LEXICON-GLOBALS*", SubLTrampolineFile.maybeDefault($noop_updates_for_lexicon_globals$, $noop_updates_for_lexicon_globals$, NIL));
        defparameter("*LEXICON-GLOBAL-NOOP-DONE-VALUES*", NIL);
        defparameter("*MWP-REFORMULATE-RESULTS?*", NIL);
        defparameter("*MWP-TRIEFY-RESULTS?*", NIL);
        defparameter("*USE-MWP?*", NIL);
        defparameter("*MWP-MAKE-UP-BASES?*", NIL);
        defparameter("*MWP-SEMANTIC-CHECK-MT*", $$EnglishMt);
        defparameter("*MWP-SYNTACTIC-CHECK-MT*", $$EnglishMt);
        defparameter("*MWP-RULE-LOOKUP-MT*", $$EnglishMt);
        defparameter("*MWP-WFF-FILTER-LEVEL*", ONE_INTEGER);
        defparameter("*MWP-SUPPRESS-RECURSIVE-ANALYSIS?*", NIL);
        defconstant("*NL-AFFIX-TYPES*", $list59);
        defvar("*DEFAULT-LEXIFICATION-MT*", $$$GeneralEnglishMt);
        defvar("*DEFAULT-SYNTACTIC-MT*", $$$GeneralEnglishMt);
        defvar("*DEFAULT-RELATIONAL-LEXIFICATION-MT*", $$$EnglishParaphraseMt);
        defvar("*DEFAULT-LEXIFICATION-TEMPLATE-MT*", $$$EnglishTemplateMt);
        defvar("*DEFAULT-PREDICATE-LEXIFICATION-MT*", $$$RelationParaphraseMt);
        defvar("*USE-SME-LEXWIZ*", T);
        return NIL;
    }

    static private final SubLList $list_alt45 = list(reader_make_constant_shell("partOfSpeech"), reader_make_constant_shell("subcatFrame"));

    static private final SubLList $list_alt47 = list(new SubLObject[]{ reader_make_constant_shell("infinitive"), reader_make_constant_shell("singular"), reader_make_constant_shell("massNumber"), reader_make_constant_shell("regularDegree"), reader_make_constant_shell("nonGradableAdjectiveForm"), reader_make_constant_shell("regularAdverb"), reader_make_constant_shell("pnMassNumber"), reader_make_constant_shell("pnSingular"), reader_make_constant_shell("agentive-Sg"), reader_make_constant_shell("agentive-Mass"), reader_make_constant_shell("gerund") });

    static private final SubLString $str_alt52$Lexicon_global_noop_updates_must_ = makeString("Lexicon global noop-updates must be lists of two strings, which ~S isn't.");

    static private final SubLList $list_alt53 = list(makeSymbol("EARLIER"), makeSymbol("LATER"));

    static private final SubLSymbol $sym54$SUPERSTRING_ = makeSymbol("SUPERSTRING?");

    static private final SubLList $list_alt56 = list(makeKeyword("DERIV"), $INFL);

    public static final SubLObject setup_lexicon_vars_file_alt() {
        mt_vars.note_mt_var($lexicon_lookup_mt$, UNPROVIDED);
        memoization_state.note_globally_cached_function($sym26$HEAD_POSITION_PRED_CACHED_);
        memoization_state.note_globally_cached_function(VERB_FRAMES);
        declare_defglobal($lexicon_cache_code_revision$);
        declare_defglobal($morphology_code_revision$);
        declare_defglobal($nl_trie_code_revision$);
        declare_defglobal($noop_updates_for_lexicon_globals$);
        register_html_state_variable($default_lexification_mt$);
        register_html_interface_variable($default_lexification_mt$);
        register_html_state_variable($default_syntactic_mt$);
        register_html_interface_variable($default_syntactic_mt$);
        register_html_state_variable($default_relational_lexification_mt$);
        register_html_interface_variable($default_relational_lexification_mt$);
        register_html_state_variable($default_lexification_template_mt$);
        register_html_interface_variable($default_lexification_template_mt$);
        register_html_state_variable($default_predicate_lexification_mt$);
        register_html_interface_variable($default_predicate_lexification_mt$);
        return NIL;
    }

    public static SubLObject setup_lexicon_vars_file() {
        if (SubLFiles.USE_V1) {
            mt_vars.note_mt_var($lexicon_lookup_mt$, UNPROVIDED);
            declare_defglobal($semtrans_preds$);
            declare_defglobal($abbreviation_predicates$);
            declare_defglobal($acronym_predicates$);
            declare_defglobal($proper_name_predicates_from_kb$);
            declare_defglobal($term_strings_preds$);
            memoization_state.note_globally_cached_function($sym29$HEAD_POSITION_PRED_CACHED_);
            memoization_state.note_globally_cached_function(VERB_FRAMES);
            declare_defglobal($lexicon_cache_code_revision$);
            declare_defglobal($morphology_code_revision$);
            declare_defglobal($nl_trie_code_revision$);
            declare_defglobal($noop_updates_for_lexicon_globals$);
            register_html_state_variable($default_lexification_mt$);
            register_html_interface_variable($default_lexification_mt$);
            register_html_state_variable($default_syntactic_mt$);
            register_html_interface_variable($default_syntactic_mt$);
            register_html_state_variable($default_relational_lexification_mt$);
            register_html_interface_variable($default_relational_lexification_mt$);
            register_html_state_variable($default_lexification_template_mt$);
            register_html_interface_variable($default_lexification_template_mt$);
            register_html_state_variable($default_predicate_lexification_mt$);
            register_html_interface_variable($default_predicate_lexification_mt$);
            register_html_state_variable($use_sme_lexwiz$);
            register_html_interface_variable($use_sme_lexwiz$);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_globally_cached_function($sym26$HEAD_POSITION_PRED_CACHED_);
        }
        return NIL;
    }

    public static SubLObject setup_lexicon_vars_file_Previous() {
        mt_vars.note_mt_var($lexicon_lookup_mt$, UNPROVIDED);
        declare_defglobal($semtrans_preds$);
        declare_defglobal($abbreviation_predicates$);
        declare_defglobal($acronym_predicates$);
        declare_defglobal($proper_name_predicates_from_kb$);
        declare_defglobal($term_strings_preds$);
        memoization_state.note_globally_cached_function($sym29$HEAD_POSITION_PRED_CACHED_);
        memoization_state.note_globally_cached_function(VERB_FRAMES);
        declare_defglobal($lexicon_cache_code_revision$);
        declare_defglobal($morphology_code_revision$);
        declare_defglobal($nl_trie_code_revision$);
        declare_defglobal($noop_updates_for_lexicon_globals$);
        register_html_state_variable($default_lexification_mt$);
        register_html_interface_variable($default_lexification_mt$);
        register_html_state_variable($default_syntactic_mt$);
        register_html_interface_variable($default_syntactic_mt$);
        register_html_state_variable($default_relational_lexification_mt$);
        register_html_interface_variable($default_relational_lexification_mt$);
        register_html_state_variable($default_lexification_template_mt$);
        register_html_interface_variable($default_lexification_template_mt$);
        register_html_state_variable($default_predicate_lexification_mt$);
        register_html_interface_variable($default_predicate_lexification_mt$);
        register_html_state_variable($use_sme_lexwiz$);
        register_html_interface_variable($use_sme_lexwiz$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lexicon_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_lexicon_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexicon_vars_file();
    }

    static {
    }
}

/**
 * Total time: 259 ms
 */
