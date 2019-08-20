/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.fboundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
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


public final class parsing_vars extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new parsing_vars();



    // deflexical
    // Definitions
    @LispMethod(comment = "A representative sample of the KB constants that natural language processing depends on.\ndeflexical")
    private static final SubLSymbol $nl_core_constants$ = makeSymbol("*NL-CORE-CONSTANTS*");

    // defparameter
    // during template parsing, should we use the NP-parser?
    /**
     * during template parsing, should we use the NP-parser?
     */
    @LispMethod(comment = "during template parsing, should we use the NP-parser?\ndefparameter")
    public static final SubLSymbol $perform_np_parser_expansion$ = makeSymbol("*PERFORM-NP-PARSER-EXPANSION*");

    // defparameter
    // should we try to use the VP-parser?
    /**
     * should we try to use the VP-parser?
     */
    @LispMethod(comment = "should we try to use the VP-parser?\ndefparameter")
    public static final SubLSymbol $perform_vp_parser_expansion$ = makeSymbol("*PERFORM-VP-PARSER-EXPANSION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $rkf_template_wff_filter_level$ = makeSymbol("*RKF-TEMPLATE-WFF-FILTER-LEVEL*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $np_wff_filter_level$ = makeSymbol("*NP-WFF-FILTER-LEVEL*");

    // defparameter
    /**
     * A list of what MTs are relevant for NP wff checking. Paradoxically, NIL means
     * all mts are relevant. Wff checking should be faster if this value is non-nil.
     */
    @LispMethod(comment = "A list of what MTs are relevant for NP wff checking. Paradoxically, NIL means\r\nall mts are relevant. Wff checking should be faster if this value is non-nil.\ndefparameter\nA list of what MTs are relevant for NP wff checking. Paradoxically, NIL means\nall mts are relevant. Wff checking should be faster if this value is non-nil.")
    public static final SubLSymbol $np_wff_filter_mts$ = makeSymbol("*NP-WFF-FILTER-MTS*");

    // defparameter
    /**
     * Should we try to supply semantics for words we don't recognize during
     * parsing?
     */
    @LispMethod(comment = "Should we try to supply semantics for words we don\'t recognize during\r\nparsing?\ndefparameter\nShould we try to supply semantics for words we don\'t recognize during\nparsing?")
    public static final SubLSymbol $guess_semantics_for_unknown_wordsP$ = makeSymbol("*GUESS-SEMANTICS-FOR-UNKNOWN-WORDS?*");

    // defparameter
    /**
     * If NIL, you can clear out the PSP caches as needed with (CLEAR-PSP-CACHES).
     */
    @LispMethod(comment = "If NIL, you can clear out the PSP caches as needed with (CLEAR-PSP-CACHES).\ndefparameter")
    public static final SubLSymbol $psp_clear_caches_each_parseP$ = makeSymbol("*PSP-CLEAR-CACHES-EACH-PARSE?*");

    // defparameter
    /**
     * BOOLEANP; Should we skip PSP caches, not clearing them but bypassing them?
     */
    @LispMethod(comment = "BOOLEANP; Should we skip PSP caches, not clearing them but bypassing them?\ndefparameter")
    public static final SubLSymbol $bypass_psp_cachesP$ = makeSymbol("*BYPASS-PSP-CACHES?*");

    // defparameter
    /**
     * BOOLEANP; if NIL, the PSP will not add the raw string as one possible meaning
     * for each word in its chart.
     */
    @LispMethod(comment = "BOOLEANP; if NIL, the PSP will not add the raw string as one possible meaning\r\nfor each word in its chart.\ndefparameter\nBOOLEANP; if NIL, the PSP will not add the raw string as one possible meaning\nfor each word in its chart.")
    public static final SubLSymbol $npp_use_strings_for_semanticsP$ = makeSymbol("*NPP-USE-STRINGS-FOR-SEMANTICS?*");

    // defparameter
    /**
     * POSITIVE-POTENTIALLY-INFINITE-INTEGER-P; Maximum number of rules to use in
     * parsing a single noun compound.
     */
    @LispMethod(comment = "POSITIVE-POTENTIALLY-INFINITE-INTEGER-P; Maximum number of rules to use in\r\nparsing a single noun compound.\ndefparameter\nPOSITIVE-POTENTIALLY-INFINITE-INTEGER-P; Maximum number of rules to use in\nparsing a single noun compound.")
    public static final SubLSymbol $npp_max_rules_per_compound$ = makeSymbol("*NPP-MAX-RULES-PER-COMPOUND*");

    // defparameter
    // BOOLEANP; Should we include word units in RBP parsing?
    /**
     * BOOLEANP; Should we include word units in RBP parsing?
     */
    @LispMethod(comment = "BOOLEANP; Should we include word units in RBP parsing?\ndefparameter")
    public static final SubLSymbol $rbp_include_word_unitsP$ = makeSymbol("*RBP-INCLUDE-WORD-UNITS?*");

    // defparameter
    /**
     * BOOLEANP; Should we skip the filters that put deverbal parses into 'good' and
     * 'bad' piles?
     */
    @LispMethod(comment = "BOOLEANP; Should we skip the filters that put deverbal parses into \'good\' and\r\n\'bad\' piles?\ndefparameter\nBOOLEANP; Should we skip the filters that put deverbal parses into \'good\' and\n\'bad\' piles?")
    public static final SubLSymbol $rbp_bypass_deverbal_filtersP$ = makeSymbol("*RBP-BYPASS-DEVERBAL-FILTERS?*");

    // defparameter
    /**
     * BOOLEANP; Intended for development purposes only. If T, force (almost)
     * everything to be run through every filter
     */
    @LispMethod(comment = "BOOLEANP; Intended for development purposes only. If T, force (almost)\r\neverything to be run through every filter\ndefparameter\nBOOLEANP; Intended for development purposes only. If T, force (almost)\neverything to be run through every filter")
    public static final SubLSymbol $rbp_apply_all_filters_regardlessP$ = makeSymbol("*RBP-APPLY-ALL-FILTERS-REGARDLESS?*");

    // defparameter
    /**
     * POSITIVE-INTEGER-P; How many violations are we willing to allow before we
     * stop looking for more? defaults to 2
     *
     * @unknown At this point, I become strongly inclined to agree that we should have
    a parsing-parameters defstruct
     */
    @LispMethod(comment = "POSITIVE-INTEGER-P; How many violations are we willing to allow before we\r\nstop looking for more? defaults to 2\r\n\r\n@unknown At this point, I become strongly inclined to agree that we should have\r\na parsing-parameters defstruct\ndefparameter\nPOSITIVE-INTEGER-P; How many violations are we willing to allow before we\nstop looking for more? defaults to 2")
    public static final SubLSymbol $rbp_filter_violations_limit$ = makeSymbol("*RBP-FILTER-VIOLATIONS-LIMIT*");

    // defparameter
    // BOOLEANP; Should we skip @see rbp-unify-related-blocks?
    /**
     * BOOLEANP; Should we skip @see rbp-unify-related-blocks?
     */
    @LispMethod(comment = "BOOLEANP; Should we skip @see rbp-unify-related-blocks?\ndefparameter")
    public static final SubLSymbol $rbp_bypass_block_unificationP$ = makeSymbol("*RBP-BYPASS-BLOCK-UNIFICATION?*");

    // defparameter
    /**
     * Determines whether the output of noun-compound parser goes through the Cyc
     * Reformulator for possible simplification.
     */
    @LispMethod(comment = "Determines whether the output of noun-compound parser goes through the Cyc\r\nReformulator for possible simplification.\ndefparameter\nDetermines whether the output of noun-compound parser goes through the Cyc\nReformulator for possible simplification.")
    public static final SubLSymbol $rbp_reformulate_resultsP$ = makeSymbol("*RBP-REFORMULATE-RESULTS?*");

    // defparameter
    /**
     * BOOLEANP; Should we try to evaluate evaluatable expressions inside the NL
     * reformulator?
     */
    @LispMethod(comment = "BOOLEANP; Should we try to evaluate evaluatable expressions inside the NL\r\nreformulator?\ndefparameter\nBOOLEANP; Should we try to evaluate evaluatable expressions inside the NL\nreformulator?")
    public static final SubLSymbol $evaluate_nl_reformulator_resultsP$ = makeSymbol("*EVALUATE-NL-REFORMULATOR-RESULTS?*");

    // defparameter
    // Should we add things like #$NLTagFn to parses?
    /**
     * Should we add things like #$NLTagFn to parses?
     */
    @LispMethod(comment = "Should we add things like #$NLTagFn to parses?\ndefparameter")
    public static final SubLSymbol $npp_use_nl_tagsP$ = makeSymbol("*NPP-USE-NL-TAGS?*");

    // defparameter
    // Should we use the NL tags for NPs that include start-index information?
    /**
     * Should we use the NL tags for NPs that include start-index information?
     */
    @LispMethod(comment = "Should we use the NL tags for NPs that include start-index information?\ndefparameter")
    public static final SubLSymbol $use_ternary_np_tagsP$ = makeSymbol("*USE-TERNARY-NP-TAGS?*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $nl_tag_cycl_placeholder$ = makeSymbol("*NL-TAG-CYCL-PLACEHOLDER*");

    // defparameter
    /**
     * Bound to the lexicon to be used by the Phrase-Structure Parser. May be bound
     * from the outside. If not, it will be bound by the PSP to a default lexicon.
     */
    @LispMethod(comment = "Bound to the lexicon to be used by the Phrase-Structure Parser. May be bound\r\nfrom the outside. If not, it will be bound by the PSP to a default lexicon.\ndefparameter\nBound to the lexicon to be used by the Phrase-Structure Parser. May be bound\nfrom the outside. If not, it will be bound by the PSP to a default lexicon.")
    public static final SubLSymbol $psp_lexicon$ = makeSymbol("*PSP-LEXICON*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $psp_reformulateP$ = makeSymbol("*PSP-REFORMULATE?*");

    // defparameter
    // BOOLEAN; Should we be extra gung-ho about excluding dubious lexical info?
    /**
     * BOOLEAN; Should we be extra gung-ho about excluding dubious lexical info?
     */
    @LispMethod(comment = "BOOLEAN; Should we be extra gung-ho about excluding dubious lexical info?\ndefparameter")
    public static final SubLSymbol $psp_pos_pred_filterP$ = makeSymbol("*PSP-POS-PRED-FILTER?*");

    // defparameter
    // LISTP of predicates to exclude when *PSP-POS-PRED-FILTER?* is non-NIL.
    /**
     * LISTP of predicates to exclude when *PSP-POS-PRED-FILTER?* is non-NIL.
     */
    @LispMethod(comment = "LISTP of predicates to exclude when *PSP-POS-PRED-FILTER?* is non-NIL.\ndefparameter")
    public static final SubLSymbol $psp_pos_pred_filter_preds$ = makeSymbol("*PSP-POS-PRED-FILTER-PREDS*");

    // defvar
    // CycL terms we don't want showing up in parser output
    /**
     * CycL terms we don't want showing up in parser output
     */
    @LispMethod(comment = "CycL terms we don\'t want showing up in parser output\ndefvar")
    public static final SubLSymbol $parser_cycl_blacklist$ = makeSymbol("*PARSER-CYCL-BLACKLIST*");

    // defparameter
    /**
     * An association list of <string => term> mappings For any string in this map,
     * the corresponding term is a possible NP parse for it.
     */
    @LispMethod(comment = "An association list of <string => term> mappings For any string in this map,\r\nthe corresponding term is a possible NP parse for it.\ndefparameter\nAn association list of <string => term> mappings For any string in this map,\nthe corresponding term is a possible NP parse for it.")
    public static final SubLSymbol $psp_indexical_map$ = makeSymbol("*PSP-INDEXICAL-MAP*");

    // defparameter
    /**
     * :EVERYTHING: All possible parses in one list. :BEST-ONLY: One list of parses
     * judged qualitatively better than unreturned parses. :BEST-AND-REST: Two lists
     * (i.e. two return values) - best parses and the rest.
     */
    @LispMethod(comment = ":EVERYTHING: All possible parses in one list. :BEST-ONLY: One list of parses\r\njudged qualitatively better than unreturned parses. :BEST-AND-REST: Two lists\r\n(i.e. two return values) - best parses and the rest.\ndefparameter\n:EVERYTHING: All possible parses in one list. :BEST-ONLY: One list of parses\njudged qualitatively better than unreturned parses. :BEST-AND-REST: Two lists\n(i.e. two return values) - best parses and the rest.")
    public static final SubLSymbol $psp_return_mode$ = makeSymbol("*PSP-RETURN-MODE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $psp_verboseP$ = makeSymbol("*PSP-VERBOSE?*");

    // defparameter
    // Place to store current chart. Bound only during parsing.
    /**
     * Place to store current chart. Bound only during parsing.
     */
    @LispMethod(comment = "Place to store current chart. Bound only during parsing.\ndefparameter")
    public static final SubLSymbol $psp_chart$ = makeSymbol("*PSP-CHART*");

    // defparameter
    /**
     * Gating parameter to determine whether it's safe and effective to combine
     * edges that differ only in the identity of their daughters.
     */
    @LispMethod(comment = "Gating parameter to determine whether it\'s safe and effective to combine\r\nedges that differ only in the identity of their daughters.\ndefparameter\nGating parameter to determine whether it\'s safe and effective to combine\nedges that differ only in the identity of their daughters.")
    public static final SubLSymbol $psp_chart_consolidate_edgesP$ = makeSymbol("*PSP-CHART-CONSOLIDATE-EDGES?*");

    // defparameter
    /**
     * Gating parameter to determine whether it's safe and effective to avoid adding
     * edges that could not be completed.
     */
    @LispMethod(comment = "Gating parameter to determine whether it\'s safe and effective to avoid adding\r\nedges that could not be completed.\ndefparameter\nGating parameter to determine whether it\'s safe and effective to avoid adding\nedges that could not be completed.")
    public static final SubLSymbol $psp_use_lookahead_for_bad_edgesP$ = makeSymbol("*PSP-USE-LOOKAHEAD-FOR-BAD-EDGES?*");

    // defparameter
    // At what index for the chart does the current parse start?
    /**
     * At what index for the chart does the current parse start?
     */
    @LispMethod(comment = "At what index for the chart does the current parse start?\ndefparameter")
    public static final SubLSymbol $psp_chart_start_index$ = makeSymbol("*PSP-CHART-START-INDEX*");

    // defparameter
    /**
     * At what index for the chart does the current parse end? NIL means it ends at
     * the right edge of the chart.
     */
    @LispMethod(comment = "At what index for the chart does the current parse end? NIL means it ends at\r\nthe right edge of the chart.\ndefparameter\nAt what index for the chart does the current parse end? NIL means it ends at\nthe right edge of the chart.")
    public static final SubLSymbol $psp_chart_end_index$ = makeSymbol("*PSP-CHART-END-INDEX*");

    // defparameter
    /**
     * an of extra charts that might be consulted when trying to maximize
     * chart-reuse.
     */
    @LispMethod(comment = "an of extra charts that might be consulted when trying to maximize\r\nchart-reuse.\ndefparameter\nan of extra charts that might be consulted when trying to maximize\nchart-reuse.")
    public static final SubLSymbol $psp_extra_charts$ = makeSymbol("*PSP-EXTRA-CHARTS*");

    // defparameter
    /**
     * should WITH-PSP-CHART-FOR-STRING destroy charts that it creates?
     */
    @LispMethod(comment = "should WITH-PSP-CHART-FOR-STRING destroy charts that it creates?\ndefparameter")
    public static final SubLSymbol $psp_dont_destroy_chartP$ = makeSymbol("*PSP-DONT-DESTROY-CHART?*");

    // deflexical
    // Where do we look up phrase-structure rules from?
    /**
     * Where do we look up phrase-structure rules from?
     */
    @LispMethod(comment = "Where do we look up phrase-structure rules from?\ndeflexical")
    public static final SubLSymbol $psp_rule_lookup_mt$ = makeSymbol("*PSP-RULE-LOOKUP-MT*");

    // defparameter
    /**
     * The instances of #$ConceptFilterSpecification that any lexical entry being
     * used by the PSP must not fail?
     */
    @LispMethod(comment = "The instances of #$ConceptFilterSpecification that any lexical entry being\r\nused by the PSP must not fail?\ndefparameter\nThe instances of #$ConceptFilterSpecification that any lexical entry being\nused by the PSP must not fail?")
    public static final SubLSymbol $psp_concept_filters$ = makeSymbol("*PSP-CONCEPT-FILTERS*");

    // defparameter
    // What mt should we use for semantic checking during parsing?
    /**
     * What mt should we use for semantic checking during parsing?
     */
    @LispMethod(comment = "What mt should we use for semantic checking during parsing?\ndefparameter")
    public static final SubLSymbol $parsing_domain_mt$ = makeSymbol("*PARSING-DOMAIN-MT*");

    // deflexical
    // Where do we look for rules to slurp?
    /**
     * Where do we look for rules to slurp?
     */
    @LispMethod(comment = "Where do we look for rules to slurp?\ndeflexical")
    public static final SubLSymbol $rbp_rule_lookup_mt$ = makeSymbol("*RBP-RULE-LOOKUP-MT*");

    // defparameter
    /**
     * What type of gap, if any, do we allow for the current phrase? :NONE :NP (:PP
     * . <prep-string>)
     */
    @LispMethod(comment = "What type of gap, if any, do we allow for the current phrase? :NONE :NP (:PP\r\n. <prep-string>)\ndefparameter\nWhat type of gap, if any, do we allow for the current phrase? :NONE :NP (:PP\n. <prep-string>)")
    public static final SubLSymbol $psp_gap_type_allowed$ = makeSymbol("*PSP-GAP-TYPE-ALLOWED*");

    // defparameter
    /**
     * Should the Phrase Structure Parser prefer more general semantics, more
     * specific, or neither? possible values: :GENERAL, :SPECIFIC, :NONE
     */
    @LispMethod(comment = "Should the Phrase Structure Parser prefer more general semantics, more\r\nspecific, or neither? possible values: :GENERAL, :SPECIFIC, :NONE\ndefparameter\nShould the Phrase Structure Parser prefer more general semantics, more\nspecific, or neither? possible values: :GENERAL, :SPECIFIC, :NONE")
    public static final SubLSymbol $psp_generality_preference$ = makeSymbol("*PSP-GENERALITY-PREFERENCE*");

    // defparameter
    // CycL term, the output we're looking for.
    /**
     * CycL term, the output we're looking for.
     */
    @LispMethod(comment = "CycL term, the output we\'re looking for.\ndefparameter")
    public static final SubLSymbol $psp_parse_to_match$ = makeSymbol("*PSP-PARSE-TO-MATCH*");

    // defconstant
    /**
     * The minimum weight for a PSP edge.
     *
     * @unknown type should be INTEGERP or FLOATP, depending on value of @xref
    PSP-WEIGHT-TYPE*.
     */
    @LispMethod(comment = "The minimum weight for a PSP edge.\r\n\r\n@unknown type should be INTEGERP or FLOATP, depending on value of @xref\r\nPSP-WEIGHT-TYPE*.\ndefconstant")
    public static final SubLSymbol $psp_min_weight$ = makeSymbol("*PSP-MIN-WEIGHT*");

    // defconstant
    /**
     * Maximum weight for a PSP edge.
     *
     * @unknown type should be INTEGERP or FLOATP, depending on value of @xref
    PSP-WEIGHT-TYPE*.
     */
    @LispMethod(comment = "Maximum weight for a PSP edge.\r\n\r\n@unknown type should be INTEGERP or FLOATP, depending on value of @xref\r\nPSP-WEIGHT-TYPE*.\ndefconstant")
    public static final SubLSymbol $psp_max_weight$ = makeSymbol("*PSP-MAX-WEIGHT*");

    // defconstant
    /**
     * :INTEGER or :FLOAT; Should the Phrase-Structure Parser internally use integer
     * weights or floats?
     */
    @LispMethod(comment = ":INTEGER or :FLOAT; Should the Phrase-Structure Parser internally use integer\r\nweights or floats?\ndefconstant\n:INTEGER or :FLOAT; Should the Phrase-Structure Parser internally use integer\nweights or floats?")
    public static final SubLSymbol $psp_weight_type$ = makeSymbol("*PSP-WEIGHT-TYPE*");

    // deflexical
    // LISTP of globals that affect PSP behavior.
    /**
     * LISTP of globals that affect PSP behavior.
     */
    @LispMethod(comment = "LISTP of globals that affect PSP behavior.\ndeflexical")
    private static final SubLSymbol $psp_environmental_globals_new$ = makeSymbol("*PSP-ENVIRONMENTAL-GLOBALS-NEW*");

    // defparameter
    // INTEGERP or NIL; What's the max number of edges we'll allow per span?
    /**
     * INTEGERP or NIL; What's the max number of edges we'll allow per span?
     */
    @LispMethod(comment = "INTEGERP or NIL; What\'s the max number of edges we\'ll allow per span?\ndefparameter")
    public static final SubLSymbol $psp_max_edges_per_span$ = makeSymbol("*PSP-MAX-EDGES-PER-SPAN*");

    // defparameter
    // INTEGERP or NIL; What's the max number of edges we'll allow per chart?
    /**
     * INTEGERP or NIL; What's the max number of edges we'll allow per chart?
     */
    @LispMethod(comment = "INTEGERP or NIL; What\'s the max number of edges we\'ll allow per chart?\ndefparameter")
    public static final SubLSymbol $psp_max_edges_per_chart$ = makeSymbol("*PSP-MAX-EDGES-PER-CHART*");

    // defparameter
    /**
     * For any given string (key), stores the number should be used as a suffix to
     * get the next unique variable with that name.
     */
    @LispMethod(comment = "For any given string (key), stores the number should be used as a suffix to\r\nget the next unique variable with that name.\ndefparameter\nFor any given string (key), stores the number should be used as a suffix to\nget the next unique variable with that name.")
    public static final SubLSymbol $variable_uniquification_store$ = makeSymbol("*VARIABLE-UNIQUIFICATION-STORE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $linkage_creation_rules$ = makeSymbol("*LINKAGE-CREATION-RULES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $use_strict_syntactic_node_checkingP$ = makeSymbol("*USE-STRICT-SYNTACTIC-NODE-CHECKING?*");

    // defparameter
    // Place to store root node for current parse
    /**
     * Place to store root node for current parse
     */
    @LispMethod(comment = "Place to store root node for current parse\ndefparameter")
    public static final SubLSymbol $parse_root_node$ = makeSymbol("*PARSE-ROOT-NODE*");

    // defparameter
    // Should parsers reify syntactic nodes for their results?
    /**
     * Should parsers reify syntactic nodes for their results?
     */
    @LispMethod(comment = "Should parsers reify syntactic nodes for their results?\ndefparameter")
    public static final SubLSymbol $reify_parse_nodesP$ = makeSymbol("*REIFY-PARSE-NODES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $storing_cyclifier_wff_results$ = makeSymbol("*STORING-CYCLIFIER-WFF-RESULTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $cyclifier_wff_checking_results$ = makeSymbol("*CYCLIFIER-WFF-CHECKING-RESULTS*");

    // defparameter
    // Should the numeral parser require strings to be lowercase?
    /**
     * Should the numeral parser require strings to be lowercase?
     */
    @LispMethod(comment = "Should the numeral parser require strings to be lowercase?\ndefparameter")
    public static final SubLSymbol $numeral_parser_case_sensitiveP$ = makeSymbol("*NUMERAL-PARSER-CASE-SENSITIVE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $fscp_verboseP$ = makeSymbol("*FSCP-VERBOSE?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $speaker_referent$ = makeSymbol("*SPEAKER-REFERENT*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[]{ reader_make_constant_shell("DataForNLMt"), reader_make_constant_shell("NLUtteranceAttribute"), reader_make_constant_shell("NLTagFn"), reader_make_constant_shell("NLNumberFn"), reader_make_constant_shell("NLDefinitenessFn"), reader_make_constant_shell("NLQuantFn"), reader_make_constant_shell("NLDefinitenessFn-3"), reader_make_constant_shell("NLQuantFn-3"), reader_make_constant_shell("nounStrings"), reader_make_constant_shell("singular-Generic"), reader_make_constant_shell("plural-Generic"), reader_make_constant_shell("partOfSpeech") });

    static private final SubLSymbol $sym1$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");

    private static final SubLSymbol $NL_TAG_CYCL_PLACEHOLDER = makeKeyword("NL-TAG-CYCL-PLACEHOLDER");

    static private final SubLList $list3 = list(reader_make_constant_shell("stockTickerSymbol"), reader_make_constant_shell("countryCodeDigraph"), reader_make_constant_shell("executableProgramName"), reader_make_constant_shell("internetCountryCode"));



    private static final SubLObject $const6$CurrentWorldDataCollectorMt_NonHo = reader_make_constant_shell("CurrentWorldDataCollectorMt-NonHomocentric");

    static private final SubLList $list11 = list(new SubLObject[]{ makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), makeSymbol("*GUESS-SEMANTICS-FOR-UNKNOWN-WORDS?*"), makeSymbol("*PARSING-TIMEOUT-TIME*"), makeSymbol("*NPP-USE-NL-TAGS?*"), makeSymbol("*PSP-USE-TERM-LEXICON?*"), makeSymbol("*NP-WFF-FILTER-LEVEL*"), makeSymbol("*PSP-GAP-TYPE-ALLOWED*"), makeSymbol("*PSP-INDEXICAL-MAP*"), makeSymbol("*PSP-MAX-EDGES-PER-SPAN*"), makeSymbol("*PSP-MAX-EDGES-PER-CHART*"), makeSymbol("*USE-TERNARY-NP-TAGS?*"), makeSymbol("*PSP-REFORMULATE?*"), makeSymbol("*PSP-POS-PRED-FILTER?*"), makeSymbol("*PSP-POS-PRED-FILTER-PREDS*"), makeSymbol("*PARSER-CYCL-BLACKLIST*"), makeSymbol("*LEXICON-LOOKUP-MT*"), makeSymbol("*PARSING-DOMAIN-MT*"), makeSymbol("*PSP-RETURN-MODE*"), makeSymbol("*PSP-PARSE-TO-MATCH*"), makeSymbol("*PSP-GENERALITY-PREFERENCE*"), makeSymbol("*PSP-CONCEPT-FILTERS*") });

    private static final SubLSymbol PSP_ENVIRONMENTAL_GLOBAL_PAIR = makeSymbol("PSP-ENVIRONMENTAL-GLOBAL-PAIR");

    private static final SubLInteger $int$2120 = makeInteger(2120);

    private static final SubLInteger $int$100000 = makeInteger(100000);

    public static final SubLSymbol $psp_cached_interface_helper_clearing_functions$ = makeSymbol("*PSP-CACHED-INTERFACE-HELPER-CLEARING-FUNCTIONS*");

    static private final SubLList $list19 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $parse_tree_mt$ = makeSymbol("*PARSE-TREE-MT*");

    static private final SubLString $$$NL = makeString("NL");

    static private final SubLList $list23 = list(makeSymbol("PREFIX"), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLSymbol $parse_tree_prefix$ = makeSymbol("*PARSE-TREE-PREFIX*");

    static private final SubLList $list25 = list(list(makeSymbol("TOKENIZATION"), makeSymbol("&KEY"), list(makeSymbol("OFFSET"), ZERO_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list26 = list(makeKeyword("OFFSET"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    public static final SubLSymbol $parse_tokenization$ = makeSymbol("*PARSE-TOKENIZATION*");

    public static final SubLSymbol $parse_tokenization_offset$ = makeSymbol("*PARSE-TOKENIZATION-OFFSET*");

    private static final SubLString $str31$data_nl_wff_results_cyclifier_wff = makeString("data/nl/wff-results/cyclifier-wff-results.txt");

    /**
     * Determines whether the portion of the KB necessary for natural language processing is loaded.
     * This is the KB analogue of the #+Cyc-NL feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for natural language processing is loaded.\r\nThis is the KB analogue of the #+Cyc-NL feature.\nDetermines whether the portion of the KB necessary for natural language processing is loaded.\nThis is the KB analogue of the #+Cyc-NL feature.")
    public static final SubLObject initialize_nl_kb_feature_alt() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $nl_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_nl_kb_loaded();
        } else {
            kb_control_vars.unset_nl_kb_loaded();
        }
        return kb_control_vars.nl_kb_loaded_p();
    }

    /**
     * Determines whether the portion of the KB necessary for natural language processing is loaded.
     * This is the KB analogue of the #+Cyc-NL feature.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for natural language processing is loaded.\r\nThis is the KB analogue of the #+Cyc-NL feature.\nDetermines whether the portion of the KB necessary for natural language processing is loaded.\nThis is the KB analogue of the #+Cyc-NL feature.")
    public static SubLObject initialize_nl_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym1$VALID_CONSTANT_, $nl_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_nl_kb_loaded();
        } else {
            kb_control_vars.unset_nl_kb_loaded();
        }
        return kb_control_vars.nl_kb_loaded_p();
    }

    public static final SubLObject nl_tag_cycl_placeholder_alt() {
        return $nl_tag_cycl_placeholder$.getGlobalValue();
    }

    public static SubLObject nl_tag_cycl_placeholder() {
        return $nl_tag_cycl_placeholder$.getGlobalValue();
    }

    /**
     * A snapshot of the current state of globals that affect PSP behavior,
     * used for caching consistency, debugging, etc.
     */
    @LispMethod(comment = "A snapshot of the current state of globals that affect PSP behavior,\r\nused for caching consistency, debugging, etc.\nA snapshot of the current state of globals that affect PSP behavior,\nused for caching consistency, debugging, etc.")
    public static final SubLObject psp_environmental_state_alt() {
        return Mapping.mapcar(PSP_ENVIRONMENTAL_GLOBAL_PAIR, list_utilities.remove_if_not(symbol_function(BOUNDP), $psp_environmental_globals_new$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     * A snapshot of the current state of globals that affect PSP behavior,
     * used for caching consistency, debugging, etc.
     */
    @LispMethod(comment = "A snapshot of the current state of globals that affect PSP behavior,\r\nused for caching consistency, debugging, etc.\nA snapshot of the current state of globals that affect PSP behavior,\nused for caching consistency, debugging, etc.")
    public static SubLObject psp_environmental_state() {
        return Mapping.mapcar(PSP_ENVIRONMENTAL_GLOBAL_PAIR, list_utilities.remove_if_not(symbol_function(BOUNDP), $psp_environmental_globals_new$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @return LISTP; (<GLOBAL> <GLOBAL's current-value>).
     */
    @LispMethod(comment = "@return LISTP; (<GLOBAL> <GLOBAL\'s current-value>).")
    public static final SubLObject psp_environmental_global_pair_alt(SubLObject global) {
        return list(global, symbol_value(global));
    }

    /**
     *
     *
     * @return LISTP; (<GLOBAL> <GLOBAL's current-value>).
     */
    @LispMethod(comment = "@return LISTP; (<GLOBAL> <GLOBAL\'s current-value>).")
    public static SubLObject psp_environmental_global_pair(final SubLObject global) {
        return list(global, symbol_value(global));
    }

    public static final SubLObject psp_clear_interface_helper_caches_alt() {
        {
            SubLObject cdolist_list_var = $psp_cached_interface_helper_clearing_functions$.getGlobalValue();
            SubLObject clearer = NIL;
            for (clearer = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , clearer = cdolist_list_var.first()) {
                if (NIL != fboundp(clearer)) {
                    funcall(clearer);
                }
            }
        }
        return $CLEARED;
    }

    public static SubLObject psp_clear_interface_helper_caches() {
        SubLObject cdolist_list_var = $psp_cached_interface_helper_clearing_functions$.getGlobalValue();
        SubLObject clearer = NIL;
        clearer = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != fboundp(clearer)) {
                funcall(clearer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            clearer = cdolist_list_var.first();
        } 
        return $CLEARED;
    }

    public static final SubLObject use_default_linkage_creation_rulesP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return eq($DEFAULT, $linkage_creation_rules$.getDynamicValue(thread));
        }
    }

    public static SubLObject use_default_linkage_creation_rulesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eq($DEFAULT, $linkage_creation_rules$.getDynamicValue(thread));
    }

    public static final SubLObject linkage_creation_rules_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return $linkage_creation_rules$.getDynamicValue(thread);
        }
    }

    public static SubLObject linkage_creation_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $linkage_creation_rules$.getDynamicValue(thread);
    }

    public static final SubLObject with_parse_tree_mt_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject mt = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt19);
            mt = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($parse_tree_mt$, mt)), append(body, NIL));
            }
        }
    }

    public static SubLObject with_parse_tree_mt(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject mt = NIL;
        destructuring_bind_must_consp(current, datum, $list19);
        mt = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($parse_tree_mt$, mt)), append(body, NIL));
    }

    public static final SubLObject with_parse_tree_prefix_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject prefix = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt23);
            prefix = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return listS(CLET, list(list($parse_tree_prefix$, prefix)), append(body, NIL));
            }
        }
    }

    public static SubLObject with_parse_tree_prefix(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject prefix = NIL;
        destructuring_bind_must_consp(current, datum, $list23);
        prefix = current.first();
        final SubLObject body;
        current = body = current.rest();
        return listS(CLET, list(list($parse_tree_prefix$, prefix)), append(body, NIL));
    }

    public static final SubLObject with_parse_tokenization_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt25);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject tokenization = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt25);
                    tokenization = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt25);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt25);
                            if (NIL == member(current_1, $list_alt26, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt25);
                        }
                        {
                            SubLObject offset_tail = property_list_member($OFFSET, current);
                            SubLObject offset = (NIL != offset_tail) ? ((SubLObject) (cadr(offset_tail))) : ZERO_INTEGER;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(CLET, list(list($parse_tokenization$, tokenization), list($parse_tokenization_offset$, offset)), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject with_parse_tokenization(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list25);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject tokenization = NIL;
        destructuring_bind_must_consp(current, datum, $list25);
        tokenization = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list25);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list25);
            if (NIL == member(current_$1, $list26, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list25);
        }
        final SubLObject offset_tail = property_list_member($OFFSET, current);
        final SubLObject offset = (NIL != offset_tail) ? cadr(offset_tail) : ZERO_INTEGER;
        final SubLObject body;
        current = body = temp;
        return listS(CLET, list(list($parse_tokenization$, tokenization), list($parse_tokenization_offset$, offset)), append(body, NIL));
    }

    public static SubLObject declare_parsing_vars_file() {
        declareFunction("initialize_nl_kb_feature", "INITIALIZE-NL-KB-FEATURE", 0, 0, false);
        declareFunction("nl_tag_cycl_placeholder", "NL-TAG-CYCL-PLACEHOLDER", 0, 0, false);
        declareFunction("psp_environmental_state", "PSP-ENVIRONMENTAL-STATE", 0, 0, false);
        declareFunction("psp_environmental_global_pair", "PSP-ENVIRONMENTAL-GLOBAL-PAIR", 1, 0, false);
        declareFunction("psp_clear_interface_helper_caches", "PSP-CLEAR-INTERFACE-HELPER-CACHES", 0, 0, false);
        declareFunction("use_default_linkage_creation_rulesP", "USE-DEFAULT-LINKAGE-CREATION-RULES?", 0, 0, false);
        declareFunction("linkage_creation_rules", "LINKAGE-CREATION-RULES", 0, 0, false);
        declareMacro("with_parse_tree_mt", "WITH-PARSE-TREE-MT");
        declareMacro("with_parse_tree_prefix", "WITH-PARSE-TREE-PREFIX");
        declareMacro("with_parse_tokenization", "WITH-PARSE-TOKENIZATION");
        return NIL;
    }

    public static final SubLObject init_parsing_vars_file_alt() {
        deflexical("*NL-CORE-CONSTANTS*", $list_alt0);
        defparameter("*PERFORM-NP-PARSER-EXPANSION*", T);
        defparameter("*PERFORM-VP-PARSER-EXPANSION*", NIL);
        defparameter("*RKF-TEMPLATE-WFF-FILTER-LEVEL*", TWO_INTEGER);
        defparameter("*NP-WFF-FILTER-LEVEL*", TWO_INTEGER);
        defparameter("*NP-WFF-FILTER-MTS*", NIL);
        defparameter("*GUESS-SEMANTICS-FOR-UNKNOWN-WORDS?*", NIL);
        defparameter("*PSP-CLEAR-CACHES-EACH-PARSE?*", NIL);
        defparameter("*BYPASS-PSP-CACHES?*", NIL);
        defparameter("*NPP-USE-STRINGS-FOR-SEMANTICS?*", T);
        defparameter("*NPP-MAX-RULES-PER-COMPOUND*", THREE_INTEGER);
        defparameter("*RBP-INCLUDE-WORD-UNITS?*", T);
        defparameter("*RBP-BYPASS-DEVERBAL-FILTERS?*", NIL);
        defparameter("*RBP-APPLY-ALL-FILTERS-REGARDLESS?*", NIL);
        defparameter("*RBP-FILTER-VIOLATIONS-LIMIT*", TWO_INTEGER);
        defparameter("*RBP-BYPASS-BLOCK-UNIFICATION?*", NIL);
        defparameter("*RBP-REFORMULATE-RESULTS?*", T);
        defparameter("*EVALUATE-NL-REFORMULATOR-RESULTS?*", T);
        defparameter("*NPP-USE-NL-TAGS?*", T);
        defparameter("*USE-TERNARY-NP-TAGS?*", T);
        deflexical("*NL-TAG-CYCL-PLACEHOLDER*", $NL_TAG_CYCL_PLACEHOLDER);
        defparameter("*PSP-LEXICON*", misc_utilities.uninitialized());
        defparameter("*PSP-REFORMULATE?*", T);
        defparameter("*PSP-POS-PRED-FILTER?*", NIL);
        defparameter("*PSP-POS-PRED-FILTER-PREDS*", $list_alt3);
        defvar("*PARSER-CYCL-BLACKLIST*", NIL);
        defparameter("*PSP-INDEXICAL-MAP*", NIL);
        defparameter("*PSP-RETURN-MODE*", $EVERYTHING);
        defparameter("*PSP-VERBOSE?*", NIL);
        defparameter("*PSP-CHART*", NIL);
        defparameter("*PSP-CHART-CONSOLIDATE-EDGES?*", NIL);
        defparameter("*PSP-USE-LOOKAHEAD-FOR-BAD-EDGES?*", NIL);
        defparameter("*PSP-CHART-START-INDEX*", ZERO_INTEGER);
        defparameter("*PSP-CHART-END-INDEX*", NIL);
        defparameter("*PSP-EXTRA-CHARTS*", NIL);
        defparameter("*PSP-DONT-DESTROY-CHART?*", NIL);
        deflexical("*PSP-RULE-LOOKUP-MT*", $$EnglishMt);
        defparameter("*PSP-CONCEPT-FILTERS*", NIL);
        defparameter("*PARSING-DOMAIN-MT*", $const6$CurrentWorldDataCollectorMt_NonHo);
        deflexical("*RBP-RULE-LOOKUP-MT*", $$EnglishMt);
        defparameter("*PSP-GAP-TYPE-ALLOWED*", $NONE);
        defparameter("*PSP-GENERALITY-PREFERENCE*", $GENERAL);
        defparameter("*PSP-PARSE-TO-MATCH*", misc_utilities.uninitialized());
        defconstant("*PSP-MIN-WEIGHT*", ZERO_INTEGER);
        defconstant("*PSP-MAX-WEIGHT*", $int$255);
        defconstant("*PSP-WEIGHT-TYPE*", $INTEGER);
        deflexical("*PSP-ENVIRONMENTAL-GLOBALS-NEW*", append($list_alt11, lexicon_vars.pragmatic_filters()));
        defparameter("*PSP-MAX-EDGES-PER-SPAN*", $int$2120);
        defparameter("*PSP-MAX-EDGES-PER-CHART*", $int$100000);
        deflexical("*PSP-CACHED-INTERFACE-HELPER-CLEARING-FUNCTIONS*", NIL != boundp($psp_cached_interface_helper_clearing_functions$) ? ((SubLObject) ($psp_cached_interface_helper_clearing_functions$.getGlobalValue())) : NIL);
        defparameter("*VARIABLE-UNIQUIFICATION-STORE*", dictionary.new_dictionary(EQUALP, UNPROVIDED));
        defparameter("*LINKAGE-CREATION-RULES*", $DEFAULT);
        defparameter("*PARSE-TREE-MT*", NIL);
        defparameter("*PARSE-TREE-PREFIX*", $$$NL);
        defparameter("*USE-STRICT-SYNTACTIC-NODE-CHECKING?*", NIL);
        defparameter("*PARSE-ROOT-NODE*", NIL);
        defparameter("*PARSE-TOKENIZATION*", NIL);
        defparameter("*PARSE-TOKENIZATION-OFFSET*", ZERO_INTEGER);
        defparameter("*REIFY-PARSE-NODES?*", NIL);
        defparameter("*STORING-CYCLIFIER-WFF-RESULTS*", $UNKNOWN);
        defparameter("*CYCLIFIER-WFF-CHECKING-RESULTS*", $str_alt32$data_nl_wff_results_cyclifier_wff);
        defparameter("*NUMERAL-PARSER-CASE-SENSITIVE?*", NIL);
        defparameter("*FSCP-VERBOSE?*", NIL);
        defparameter("*SPEAKER-REFERENT*", NIL);
        return NIL;
    }

    public static SubLObject init_parsing_vars_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*NL-CORE-CONSTANTS*", $list0);
            defparameter("*PERFORM-NP-PARSER-EXPANSION*", T);
            defparameter("*PERFORM-VP-PARSER-EXPANSION*", NIL);
            defparameter("*RKF-TEMPLATE-WFF-FILTER-LEVEL*", TWO_INTEGER);
            defparameter("*NP-WFF-FILTER-LEVEL*", TWO_INTEGER);
            defparameter("*NP-WFF-FILTER-MTS*", NIL);
            defparameter("*GUESS-SEMANTICS-FOR-UNKNOWN-WORDS?*", NIL);
            defparameter("*PSP-CLEAR-CACHES-EACH-PARSE?*", NIL);
            defparameter("*BYPASS-PSP-CACHES?*", NIL);
            defparameter("*NPP-USE-STRINGS-FOR-SEMANTICS?*", T);
            defparameter("*NPP-MAX-RULES-PER-COMPOUND*", THREE_INTEGER);
            defparameter("*RBP-INCLUDE-WORD-UNITS?*", T);
            defparameter("*RBP-BYPASS-DEVERBAL-FILTERS?*", NIL);
            defparameter("*RBP-APPLY-ALL-FILTERS-REGARDLESS?*", NIL);
            defparameter("*RBP-FILTER-VIOLATIONS-LIMIT*", TWO_INTEGER);
            defparameter("*RBP-BYPASS-BLOCK-UNIFICATION?*", NIL);
            defparameter("*RBP-REFORMULATE-RESULTS?*", T);
            defparameter("*EVALUATE-NL-REFORMULATOR-RESULTS?*", T);
            defparameter("*NPP-USE-NL-TAGS?*", T);
            defparameter("*USE-TERNARY-NP-TAGS?*", T);
            deflexical("*NL-TAG-CYCL-PLACEHOLDER*", $NL_TAG_CYCL_PLACEHOLDER);
            defparameter("*PSP-LEXICON*", misc_utilities.uninitialized());
            defparameter("*PSP-REFORMULATE?*", T);
            defparameter("*PSP-POS-PRED-FILTER?*", NIL);
            defparameter("*PSP-POS-PRED-FILTER-PREDS*", $list3);
            defvar("*PARSER-CYCL-BLACKLIST*", NIL);
            defparameter("*PSP-INDEXICAL-MAP*", NIL);
            defparameter("*PSP-RETURN-MODE*", $EVERYTHING);
            defparameter("*PSP-VERBOSE?*", NIL);
            defparameter("*PSP-CHART*", NIL);
            defparameter("*PSP-CHART-CONSOLIDATE-EDGES?*", NIL);
            defparameter("*PSP-USE-LOOKAHEAD-FOR-BAD-EDGES?*", NIL);
            defparameter("*PSP-CHART-START-INDEX*", ZERO_INTEGER);
            defparameter("*PSP-CHART-END-INDEX*", NIL);
            defparameter("*PSP-EXTRA-CHARTS*", NIL);
            defparameter("*PSP-DONT-DESTROY-CHART?*", NIL);
            deflexical("*PSP-RULE-LOOKUP-MT*", $$EnglishMt);
            defparameter("*PSP-CONCEPT-FILTERS*", NIL);
            defparameter("*PARSING-DOMAIN-MT*", $const6$CurrentWorldDataCollectorMt_NonHo);
            deflexical("*RBP-RULE-LOOKUP-MT*", $$EnglishMt);
            defparameter("*PSP-GAP-TYPE-ALLOWED*", $NONE);
            defparameter("*PSP-GENERALITY-PREFERENCE*", $GENERAL);
            defparameter("*PSP-PARSE-TO-MATCH*", misc_utilities.uninitialized());
            defconstant("*PSP-MIN-WEIGHT*", ZERO_INTEGER);
            defconstant("*PSP-MAX-WEIGHT*", $int$255);
            defconstant("*PSP-WEIGHT-TYPE*", $INTEGER);
            deflexical("*PSP-ENVIRONMENTAL-GLOBALS-NEW*", append($list11, lexicon_vars.lexicon_filters()));
            defparameter("*PSP-MAX-EDGES-PER-SPAN*", $int$2120);
            defparameter("*PSP-MAX-EDGES-PER-CHART*", $int$100000);
            deflexical("*PSP-CACHED-INTERFACE-HELPER-CLEARING-FUNCTIONS*", SubLTrampolineFile.maybeDefault($psp_cached_interface_helper_clearing_functions$, $psp_cached_interface_helper_clearing_functions$, NIL));
            defparameter("*VARIABLE-UNIQUIFICATION-STORE*", dictionary.new_dictionary(EQUALP, UNPROVIDED));
            defparameter("*LINKAGE-CREATION-RULES*", $DEFAULT);
            defparameter("*PARSE-TREE-MT*", NIL);
            defparameter("*PARSE-TREE-PREFIX*", $$$NL);
            defparameter("*USE-STRICT-SYNTACTIC-NODE-CHECKING?*", NIL);
            defparameter("*PARSE-ROOT-NODE*", NIL);
            defparameter("*PARSE-TOKENIZATION*", NIL);
            defparameter("*PARSE-TOKENIZATION-OFFSET*", ZERO_INTEGER);
            defparameter("*REIFY-PARSE-NODES?*", NIL);
            defparameter("*STORING-CYCLIFIER-WFF-RESULTS*", NIL);
            defparameter("*CYCLIFIER-WFF-CHECKING-RESULTS*", $str31$data_nl_wff_results_cyclifier_wff);
            defparameter("*NUMERAL-PARSER-CASE-SENSITIVE?*", NIL);
            defparameter("*FSCP-VERBOSE?*", NIL);
            defparameter("*SPEAKER-REFERENT*", NIL);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*PSP-ENVIRONMENTAL-GLOBALS-NEW*", append($list_alt11, lexicon_vars.pragmatic_filters()));
            deflexical("*PSP-CACHED-INTERFACE-HELPER-CLEARING-FUNCTIONS*", NIL != boundp($psp_cached_interface_helper_clearing_functions$) ? ((SubLObject) ($psp_cached_interface_helper_clearing_functions$.getGlobalValue())) : NIL);
            defparameter("*STORING-CYCLIFIER-WFF-RESULTS*", $UNKNOWN);
            defparameter("*CYCLIFIER-WFF-CHECKING-RESULTS*", $str_alt32$data_nl_wff_results_cyclifier_wff);
        }
        return NIL;
    }

    public static SubLObject init_parsing_vars_file_Previous() {
        deflexical("*NL-CORE-CONSTANTS*", $list0);
        defparameter("*PERFORM-NP-PARSER-EXPANSION*", T);
        defparameter("*PERFORM-VP-PARSER-EXPANSION*", NIL);
        defparameter("*RKF-TEMPLATE-WFF-FILTER-LEVEL*", TWO_INTEGER);
        defparameter("*NP-WFF-FILTER-LEVEL*", TWO_INTEGER);
        defparameter("*NP-WFF-FILTER-MTS*", NIL);
        defparameter("*GUESS-SEMANTICS-FOR-UNKNOWN-WORDS?*", NIL);
        defparameter("*PSP-CLEAR-CACHES-EACH-PARSE?*", NIL);
        defparameter("*BYPASS-PSP-CACHES?*", NIL);
        defparameter("*NPP-USE-STRINGS-FOR-SEMANTICS?*", T);
        defparameter("*NPP-MAX-RULES-PER-COMPOUND*", THREE_INTEGER);
        defparameter("*RBP-INCLUDE-WORD-UNITS?*", T);
        defparameter("*RBP-BYPASS-DEVERBAL-FILTERS?*", NIL);
        defparameter("*RBP-APPLY-ALL-FILTERS-REGARDLESS?*", NIL);
        defparameter("*RBP-FILTER-VIOLATIONS-LIMIT*", TWO_INTEGER);
        defparameter("*RBP-BYPASS-BLOCK-UNIFICATION?*", NIL);
        defparameter("*RBP-REFORMULATE-RESULTS?*", T);
        defparameter("*EVALUATE-NL-REFORMULATOR-RESULTS?*", T);
        defparameter("*NPP-USE-NL-TAGS?*", T);
        defparameter("*USE-TERNARY-NP-TAGS?*", T);
        deflexical("*NL-TAG-CYCL-PLACEHOLDER*", $NL_TAG_CYCL_PLACEHOLDER);
        defparameter("*PSP-LEXICON*", misc_utilities.uninitialized());
        defparameter("*PSP-REFORMULATE?*", T);
        defparameter("*PSP-POS-PRED-FILTER?*", NIL);
        defparameter("*PSP-POS-PRED-FILTER-PREDS*", $list3);
        defvar("*PARSER-CYCL-BLACKLIST*", NIL);
        defparameter("*PSP-INDEXICAL-MAP*", NIL);
        defparameter("*PSP-RETURN-MODE*", $EVERYTHING);
        defparameter("*PSP-VERBOSE?*", NIL);
        defparameter("*PSP-CHART*", NIL);
        defparameter("*PSP-CHART-CONSOLIDATE-EDGES?*", NIL);
        defparameter("*PSP-USE-LOOKAHEAD-FOR-BAD-EDGES?*", NIL);
        defparameter("*PSP-CHART-START-INDEX*", ZERO_INTEGER);
        defparameter("*PSP-CHART-END-INDEX*", NIL);
        defparameter("*PSP-EXTRA-CHARTS*", NIL);
        defparameter("*PSP-DONT-DESTROY-CHART?*", NIL);
        deflexical("*PSP-RULE-LOOKUP-MT*", $$EnglishMt);
        defparameter("*PSP-CONCEPT-FILTERS*", NIL);
        defparameter("*PARSING-DOMAIN-MT*", $const6$CurrentWorldDataCollectorMt_NonHo);
        deflexical("*RBP-RULE-LOOKUP-MT*", $$EnglishMt);
        defparameter("*PSP-GAP-TYPE-ALLOWED*", $NONE);
        defparameter("*PSP-GENERALITY-PREFERENCE*", $GENERAL);
        defparameter("*PSP-PARSE-TO-MATCH*", misc_utilities.uninitialized());
        defconstant("*PSP-MIN-WEIGHT*", ZERO_INTEGER);
        defconstant("*PSP-MAX-WEIGHT*", $int$255);
        defconstant("*PSP-WEIGHT-TYPE*", $INTEGER);
        deflexical("*PSP-ENVIRONMENTAL-GLOBALS-NEW*", append($list11, lexicon_vars.lexicon_filters()));
        defparameter("*PSP-MAX-EDGES-PER-SPAN*", $int$2120);
        defparameter("*PSP-MAX-EDGES-PER-CHART*", $int$100000);
        deflexical("*PSP-CACHED-INTERFACE-HELPER-CLEARING-FUNCTIONS*", SubLTrampolineFile.maybeDefault($psp_cached_interface_helper_clearing_functions$, $psp_cached_interface_helper_clearing_functions$, NIL));
        defparameter("*VARIABLE-UNIQUIFICATION-STORE*", dictionary.new_dictionary(EQUALP, UNPROVIDED));
        defparameter("*LINKAGE-CREATION-RULES*", $DEFAULT);
        defparameter("*PARSE-TREE-MT*", NIL);
        defparameter("*PARSE-TREE-PREFIX*", $$$NL);
        defparameter("*USE-STRICT-SYNTACTIC-NODE-CHECKING?*", NIL);
        defparameter("*PARSE-ROOT-NODE*", NIL);
        defparameter("*PARSE-TOKENIZATION*", NIL);
        defparameter("*PARSE-TOKENIZATION-OFFSET*", ZERO_INTEGER);
        defparameter("*REIFY-PARSE-NODES?*", NIL);
        defparameter("*STORING-CYCLIFIER-WFF-RESULTS*", NIL);
        defparameter("*CYCLIFIER-WFF-CHECKING-RESULTS*", $str31$data_nl_wff_results_cyclifier_wff);
        defparameter("*NUMERAL-PARSER-CASE-SENSITIVE?*", NIL);
        defparameter("*FSCP-VERBOSE?*", NIL);
        defparameter("*SPEAKER-REFERENT*", NIL);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[]{ reader_make_constant_shell("DataForNLMt"), reader_make_constant_shell("NLUtteranceAttribute"), reader_make_constant_shell("NLTagFn"), reader_make_constant_shell("NLNumberFn"), reader_make_constant_shell("NLDefinitenessFn"), reader_make_constant_shell("NLQuantFn"), reader_make_constant_shell("NLDefinitenessFn-3"), reader_make_constant_shell("NLQuantFn-3"), reader_make_constant_shell("nounStrings"), reader_make_constant_shell("singular-Generic"), reader_make_constant_shell("plural-Generic"), reader_make_constant_shell("partOfSpeech") });

    static private final SubLList $list_alt3 = list(reader_make_constant_shell("stockTickerSymbol"), reader_make_constant_shell("countryCodeDigraph"), reader_make_constant_shell("executableProgramName"), reader_make_constant_shell("internetCountryCode"));

    public static SubLObject setup_parsing_vars_file() {
        declare_defglobal($psp_cached_interface_helper_clearing_functions$);
        return NIL;
    }

    static private final SubLList $list_alt11 = list(new SubLObject[]{ makeSymbol("*NL-TRIE-ACCESSOR-DEFAULT-CASE-SENSITIVITY*"), makeSymbol("*GUESS-SEMANTICS-FOR-UNKNOWN-WORDS?*"), makeSymbol("*PARSING-TIMEOUT-TIME*"), makeSymbol("*NPP-USE-NL-TAGS?*"), makeSymbol("*PSP-USE-TERM-LEXICON?*"), makeSymbol("*NP-WFF-FILTER-LEVEL*"), makeSymbol("*PSP-GAP-TYPE-ALLOWED*"), makeSymbol("*PSP-INDEXICAL-MAP*"), makeSymbol("*PSP-MAX-EDGES-PER-SPAN*"), makeSymbol("*PSP-MAX-EDGES-PER-CHART*"), makeSymbol("*USE-TERNARY-NP-TAGS?*"), makeSymbol("*PSP-REFORMULATE?*"), makeSymbol("*PSP-POS-PRED-FILTER?*"), makeSymbol("*PSP-POS-PRED-FILTER-PREDS*"), makeSymbol("*PARSER-CYCL-BLACKLIST*"), makeSymbol("*LEXICON-LOOKUP-MT*"), makeSymbol("*PARSING-DOMAIN-MT*"), makeSymbol("*PSP-RETURN-MODE*"), makeSymbol("*PSP-PARSE-TO-MATCH*"), makeSymbol("*PSP-GENERALITY-PREFERENCE*"), makeSymbol("*PSP-CONCEPT-FILTERS*") });

    @Override
    public void declareFunctions() {
        declare_parsing_vars_file();
    }

    @Override
    public void initializeVariables() {
        init_parsing_vars_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_parsing_vars_file();
    }

    static {
    }

    static private final SubLList $list_alt19 = list(makeSymbol("MT"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt23 = list(makeSymbol("PREFIX"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt25 = list(list(makeSymbol("TOKENIZATION"), makeSymbol("&KEY"), list(makeSymbol("OFFSET"), ZERO_INTEGER)), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt26 = list(makeKeyword("OFFSET"));

    static private final SubLString $str_alt32$data_nl_wff_results_cyclifier_wff = makeString("data/nl/wff-results/cyclifier-wff-results.txt");
}

/**
 * Total time: 111 ms
 */
